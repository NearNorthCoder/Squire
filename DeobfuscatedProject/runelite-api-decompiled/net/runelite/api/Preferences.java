/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

public interface Preferences {
    public String getRememberedUsername();

    public void setRememberedUsername(String var1);

    public int getSoundEffectVolume();

    public void setSoundEffectVolume(int var1);

    public int getAreaSoundEffectVolume();

    public void setAreaSoundEffectVolume(int var1);

    public boolean getHideUsername();

    public void setMusicVolume(int var1);

    public int getMusicVolume();

    public void setWindowMode(int var1);

    public int getWindowMode();

    public boolean isTitleMusicDisabled();

    public void setTitleMusicDisabled(boolean var1);

    public void setHidingRoofs(boolean var1);

    public boolean isHidingRoofs();
}

