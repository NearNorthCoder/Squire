/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package gg.squire.driftnet;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiredriftnet")
public interface SquireDriftNetConfig
extends Config {
    @ConfigItem(keyName="stamina", name="Stamina", description="(0 to disable - REQUIRES: Relog Hopper) Withdraw this many staminas when banking", position=15)
    @Range(max=20)
    default public int stamina() {
        return 0xBD ^ 0x8A ^ (0x53 ^ 0x6B);
    }

    @ConfigItem(keyName="depositFish", name="Deposit Fish", description="Can disable this feature to increase XP per hour at the cost of caught fish", position=10)
    default public boolean depositFish() {
        return 1 != 0;
    }
}

