/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSModelOverrides {
    @Import(value="overrideAmount")
    public byte getOverrideAmount();

    @Import(value="overrideHue")
    public byte getOverrideHue();

    @Import(value="overrideSaturation")
    public byte getOverrideSaturation();

    @Import(value="overrideLuminance")
    public byte getOverrideLuminance();
}

