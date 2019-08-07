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

import java.util.List;

import org.openhab.binding.yeelight.internal.lib.enums.DeviceMode;

/**
 * @author Coaster Li - Initial contribution
 */
public class DeviceStatus {

    public static final int MODE_COLOR = 1;
    public static final int MODE_COLORTEMPERATURE = 2;
    public static final int MODE_HSV = 3;

    public static final int DEFAULT_NO_DELAY = -1;

    private boolean isPowerOff;
    private boolean bg_isPowerOff;
    private int r;
    private int g;
    private int b;
    private int color;
    private int brightness;
    private int ct;
    private int hue;
    private int sat;
    private int bg_hue;
    private int bg_sat;
    private int bg_ct;
    private int bg_color;
    private int bg_brightness;
    private int bg_r;
    private int bg_g;
    private int bg_b;
    private boolean isFlowing;
    private boolean bg_isFlowing;
    private int delayOff = DEFAULT_NO_DELAY;
    private int bg_delayOff = DEFAULT_NO_DELAY;
    private List<ColorFlowItem> mFlowItems;
    private List<ColorFlowItem> bg_mFlowItems;
    private DeviceMode mode;
    private DeviceMode bg_mode;
    private boolean isMusicOn;
    private String name;
    private int flowEndAction;
    private int bg_flowEndAction;
    private int flowCount;
    private int bg_flowCount;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getCt() {
        return ct;
    }

    public void setCt(int ct) {
        this.ct = ct;
    }

    public int getBg_Ct() {
        return bg_ct;
    }

    public void setBg_Ct(int bg_ct) {
        this.bg_ct = bg_ct;
    }

    public int getHue() {
        return hue;
    }

    public void setHue(int hue) {
        this.hue = hue;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getBg_Hue() {
        return bg_hue;
    }

    public void setBg_Hue(int bg_hue) {
        this.bg_hue = bg_hue;
    }

    public int getBgSat() {
        return sat;
    }

    public void setBgSat(int sat) {
        this.sat = sat;
    }

    public int getBg_Color() {
        return bg_color;
    }

    public void setBg_Color(int bg_color) {
        this.bg_color = bg_color;
    }

    public int getBg_Brightness() {
        return bg_brightness;
    }

    public void setBg_Brightness(int bg_brightness) {
        this.bg_brightness = bg_brightness;
    }

    public int getBg_R() {
        return bg_r;
    }

    public void setBg_R(int bg_r) {
        this.bg_r = bg_r;
    }

    public int getBg_G() {
        return bg_g;
    }

    public void setBg_G(int bg_g) {
        this.bg_g = bg_g;
    }

    public int getBg_B() {
        return bg_b;
    }

    public void setBg_B(int bg_b) {
        this.bg_b = bg_b;
    }

    public DeviceMode getMode() {
        return mode;
    }

    public void setMode(DeviceMode mode) {
        this.mode = mode;
    }

    public DeviceMode getBg_Mode() {
        return bg_mode;
    }

    public void setBg_Mode(DeviceMode bg_mode) {
        this.bg_mode = bg_mode;
    }

    public boolean isPowerOff() {
        return isPowerOff;
    }

    public void setPowerOff(boolean isPowerOff) {
        this.isPowerOff = isPowerOff;
    }

    public boolean bg_isPowerOff() {
        return bg_isPowerOff;
    }

    public void setBg_PowerOff(boolean bg_isPowerOff) {
        this.bg_isPowerOff = bg_isPowerOff;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean getIsFlowing() {
        return isFlowing;
    }

    public void setIsFlowing(boolean isFlowing) {
        this.isFlowing = isFlowing;
    }

    public boolean getBg_IsFlowing() {
        return bg_isFlowing;
    }

    public void setBg_IsFlowing(boolean bg_isFlowing) {
        this.bg_isFlowing = bg_isFlowing;
    }

    public List<ColorFlowItem> getFlowItems() {
        return mFlowItems;
    }

    public void setFlowItems(List<ColorFlowItem> mFlowItems) {
        this.mFlowItems = mFlowItems;
    }

    public List<ColorFlowItem> getBg_FlowItems() {
        return bg_mFlowItems;
    }

    public void setBg_FlowItems(List<ColorFlowItem> bg_mFlowItems) {
        this.bg_mFlowItems = bg_mFlowItems;
    }

    public boolean isMusicOn() {
        return isMusicOn;
    }

    public void setMusicOn(boolean isMusicOn) {
        this.isMusicOn = isMusicOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDelayOff() {
        return delayOff;
    }

    public void setDelayOff(int delayOff) {
        this.delayOff = delayOff;
    }

    public int getBg_DelayOff() {
        return bg_delayOff;
    }

    public void setBg_DelayOff(int bg_delayOff) {
        this.bg_delayOff = bg_delayOff;
    }

    @Override
    public String toString() {
        return "DeviceStatus [isPowerOff=" + isPowerOff + ", r=" + r + ", g=" + g + ", b=" + b + ", color=" + color
                + ", brightness=" + brightness + ", ct=" + ct + ", hue=" + hue + ", sat=" + sat + ", isFlowing="
                + isFlowing + ", delayOff=" + delayOff + ", mFlowItems=" + mFlowItems + ", mode=" + mode
                + ", isMusicOn=" + isMusicOn + ", name=" + name + ", bg_isPowerOff=" + bg_isPowerOff + ", bg_r=" + bg_r
                + ", bg_g=" + bg_g + ", bg_b=" + bg_b + ", bg_color=" + bg_color + ", bg_brightness=" + bg_brightness
                + ", bg_hue=" + bg_hue + ", bg_sat" + bg_sat + ", bg_mode" + bg_mode + "]";
    }

    public int getFlowCount() {
        return flowCount;
    }

    public void setFlowCount(int flowCount) {
        this.flowCount = flowCount;
    }

    public int getBg_FlowCount() {
        return bg_flowCount;
    }

    public void setBg_FlowCount(int bg_flowCount) {
        this.bg_flowCount = bg_flowCount;
    }

    public int getFlowEndAction() {
        return flowEndAction;
    }

    public void setFlowEndAction(int flowEndAction) {
        this.flowEndAction = flowEndAction;
    }
    
    public int getBg_FlowEndAction() {
        return bg_flowEndAction;
    }

    public void setBg_FlowEndAction(int bg_flowEndAction) {
        this.bg_flowEndAction = bg_flowEndAction;
    }

}
