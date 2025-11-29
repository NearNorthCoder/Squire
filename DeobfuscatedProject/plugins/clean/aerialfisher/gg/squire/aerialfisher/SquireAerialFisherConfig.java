/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.aerialfisher;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squireaerialfisher")
public interface SquireAerialFisherConfig
extends Config {
    @ConfigItem(keyName="aerialfisher.hop", name="Hop worlds", description="Hop worlds when other players are near", position=10)
    default public boolean hopWorlds() {
        return ((0x68 ^ 0x71 ^ (0x2E ^ 0x28)) & (0x8B ^ 0x81 ^ (0x11 ^ 4) ^ -" ".length())) != 0;
    }
}

