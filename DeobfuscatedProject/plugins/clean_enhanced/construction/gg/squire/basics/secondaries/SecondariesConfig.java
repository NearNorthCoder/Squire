/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.basics.secondaries;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@ConfigGroup(value="squiresecondaries")
public interface SecondariesConfig
extends Config {
    @ConfigItem(position=10, keyName="bank", name="Bank", description="Where to bank")
    default public BankLocation bank() {
        return BankLocation.TREE_GNOME_STRONGHOLD_BANK;
    }

    @ConfigItem(position=1, keyName="secondary", name="Secondary", description="The secondary to collect")
    default public bO secondary() {
        return bO.SNAPE_GRASS;
    }

    @ConfigItem(position=2, keyName="restoreInPoh", name="Restore in POH", description="Restore stats with POH pool")
    default public boolean restoreInPoh() {
        return 1 != 0;
    }
}

