/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Preferences
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Preferences;
import net.runelite.mapping.Import;

public interface RSClientPreferences
extends Preferences {
    @Import(value="rememberedUsername")
    public String getRememberedUsername();

    @Import(value="rememberedUsername")
    public void setRememberedUsername(String var1);

    @Import(value="soundEffectsVolume")
    public int getSoundEffectVolume();

    @Import(value="soundEffectsVolume")
    public void setSoundEffectVolume(int var1);

    @Import(value="areaSoundEffectsVolume")
    public int getAreaSoundEffectVolume();

    @Import(value="areaSoundEffectsVolume")
    public void setAreaSoundEffectVolume(int var1);

    @Import(value="musicVolume")
    public int getMusicVolume();

    @Import(value="musicVolume")
    public void setMusicVolume(int var1);

    @Import(value="hideUsername")
    public boolean getHideUsername();

    @Import(value="roofsHidden")
    public void setHidingRoofs(boolean var1);

    @Import(value="roofsHidden")
    public boolean isHidingRoofs();

    @Import(value="windowMode")
    public void setWindowMode(int var1);

    @Import(value="windowMode")
    public int getWindowMode();

    @Import(value="titleMusicDisabled")
    public boolean isTitleMusicDisabled();

    @Import(value="titleMusicDisabled")
    public void setTitleMusicDisabled(boolean var1);
}

