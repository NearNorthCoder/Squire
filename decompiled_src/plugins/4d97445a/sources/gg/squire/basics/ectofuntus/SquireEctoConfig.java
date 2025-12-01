package gg.squire.basics.ectofuntus;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.EnumC0014an;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.EnumC0015ao;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
@ConfigGroup("squireecto")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/ectofuntus/SquireEctoConfig.class */
public interface SquireEctoConfig extends Config {
    @ConfigSection(name = "Loadouts", description = "Settings related to loadouts", position = 1)
    public static final /* synthetic */ String LOADOUTS = "loadouts";
    @ConfigSection(name = "Prayer", description = "Settings related to prayer", position = 0)
    public static final /* synthetic */ String PRAYER = "prayer";

    @ConfigItem(keyName = "bankItem", name = "Bank Item", description = "What item should we be using to get to the bank?", position = 10, section = "prayer")
    default EnumC0014an bankItem() {
        return EnumC0014an.FISHING_CAPE;
    }

    @ConfigItem(keyName = "bonesToUse", name = "Bones to use", description = "What bones are we using?", section = "prayer", position = 1)
    default EnumC0015ao bonesToUse() {
        return EnumC0015ao.DRAGON_BONES;
    }

    @ConfigItem(keyName = "slimeLoadout", name = "Bucket loadout", description = "Loadout with buckets", position = 2, section = "loadouts")
    default ConfigStorageBox<BankLoadout> slimeLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(keyName = "prayLoadout", name = "Offering loadout", description = "Loadout with ground bones and buckets of slime", position = 3, section = "loadouts")
    default ConfigStorageBox<BankLoadout> prayLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(keyName = "grindLoadout", name = "Grind loadout", description = "Loadout with bones and pots", position = 1, section = "loadouts")
    default ConfigStorageBox<BankLoadout> grindLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }
}
