/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.yeelight.internal.lib.device;

import org.openhab.binding.yeelight.internal.lib.device.connection.WifiConnection;
import org.openhab.binding.yeelight.internal.lib.enums.DeviceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * The {@link MeteoriteDevice} contains methods for handling the meteorite pendant light.
 *
 * @author Lukas Kugler - Adapted availible Implementation to new lights
 */
public class MeteoriteDevice extends DeviceBase {
    private final Logger logger = LoggerFactory.getLogger(MeteoriteDevice.class);

    public MeteoriteDevice(String id) {
        super(id);
        mDeviceType = DeviceType.ceiling10;
        mConnection = new WifiConnection(this);
        mMinCt = 1700;
        mMaxCt = 6500;
    }

    @Override
    public void onNotify(String msg) {
        JsonObject result = new JsonParser().parse(msg).getAsJsonObject();
        try {
            String id = "-1";
            if (result.has("id")) {
                id = result.get("id").getAsString();
                // for cmd transaction.

                if (mQueryList.contains(id)) {
                    mQueryList.remove(id);
                    // DeviceMethod(MethodAction.PROP, new Object[] { "power", "name", "bright", "ct", "bg_power" "bg_bright", "bg_ct", "bg_rgb", "bg_hue", "bg_sat" });
                    JsonArray status = result.get("result").getAsJsonArray();

                    // power:
                    if (status.get(0).toString().equals("\"off\"")) {
                        mDeviceStatus.setPowerOff(true);
                    } else if (status.get(0).toString().equals("\"on\"")) {
                        mDeviceStatus.setPowerOff(false);
                    }

                    if (status.get(4).toString().equals("\"off\"")) {
                        mDeviceStatus.setBg_PowerOff(true);
                    } else if (status.get(4).toString().equals("\"on\"")) {
                        mDeviceStatus.setBg_PowerOff(false);
                    }

                    // name:
                    mDeviceStatus.setName(status.get(1).getAsString());

                    // brightness:
                    mDeviceStatus.setBrightness(status.get(2).getAsInt());
                    mDeviceStatus.setBg_Brightness(status.get(5).getAsInt());

                    // ct:
                    mDeviceStatus.setCt(status.get(3).getAsInt());
                    mDeviceStatus.setBg_Ct(status.get(6).getAsInt());

                    // color:
                    int color = status.get(7).getAsInt();
                    mDeviceStatus.setBg_Color(color);
                    mDeviceStatus.setBg_R((color >> 16) & 0xFF);
                    mDeviceStatus.setBg_G((color >> 8) & 0xFF);
                    mDeviceStatus.setBg_B(color & 0xFF);
                    mDeviceStatus.setBg_Color(color);
                    mDeviceStatus.setBg_Hue(status.get(8).getAsInt());
                    mDeviceStatus.setBgSat(status.get(9).getAsInt());
                }
            }
        } catch (Exception e) {
            logger.debug("Exception: {}", e);
        }

        super.onNotify(msg);
    }
}
