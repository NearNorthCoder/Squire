/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.basics.ectofuntus;

import i.i.b.s.c.q.r.s.s.-.u.a.e.an;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ao;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@ConfigGroup(value="squireecto")
public interface SquireEctoConfig
extends Config {
    @ConfigSection(name="Prayer", description="Settings related to prayer", position=0)
    public static final /* synthetic */ String PRAYER;
    @ConfigSection(name="Loadouts", description="Settings related to loadouts", position=1)
    public static final /* synthetic */ String LOADOUTS;

    static {
        LOADOUTS = "loadouts";
        PRAYER = "prayer";
    }

    @ConfigItem(keyName="bankItem", name="Bank Item", description="What item should we be using to get to the bank?", position=10, section="prayer")
    default public an bankItem() {
        return an.FISHING_CAPE;
    }

    @ConfigItem(keyName="bonesToUse", name="Bones to use", description="What bones are we using?", section="prayer", position=1)
    default public ao bonesToUse() {
        return ao.DRAGON_BONES;
    }

    @ConfigItem(keyName="slimeLoadout", name="Bucket loadout", description="Loadout with buckets", position=2, section="loadouts")
    default public ConfigStorageBox<BankLoadout> slimeLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(keyName="prayLoadout", name="Offering loadout", description="Loadout with ground bones and buckets of slime", position=3, section="loadouts")
    default public ConfigStorageBox<BankLoadout> prayLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(keyName="grindLoadout", name="Grind loadout", description="Loadout with bones and pots", position=1, section="loadouts")
    default public ConfigStorageBox<BankLoadout> grindLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }
}

