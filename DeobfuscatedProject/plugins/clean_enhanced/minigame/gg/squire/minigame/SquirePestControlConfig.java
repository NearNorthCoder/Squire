/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 */
package gg.squire.minigame;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;

@ConfigGroup(value="squirepestcontrol")
public interface SquirePestControlConfig
extends Config {
    public static final  String PEST_CONFIG_GROUP;

    static {
        PEST_CONFIG_GROUP = "squirepestcontrol";
    }
}

