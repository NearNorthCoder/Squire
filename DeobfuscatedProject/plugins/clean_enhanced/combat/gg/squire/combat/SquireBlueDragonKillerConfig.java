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
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.combat;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@ConfigGroup(value="squirebdk")
public interface SquireBlueDragonKillerConfig
extends Config {
    @ConfigSection(name="Bank Location", description="Settings related to banking", position=20)
    public static final  String bankLocation;
    @ConfigSection(name="Combat Settings", description="Settings related to combat", position=10)
    public static final  String combatSettings;
    @ConfigSection(name="Loot Settings", description="Settings related to looting", position=30)
    public static final  String lootSettings;
    @ConfigSection(name="Gear Loadout", description="Settings related to banking", position=25)
    public static final  String bankLoadout;
    public static final  String GROUP;

    @ConfigItem(position=33, keyName="lootScales", name="Loot Dragon Scales", description="Do you want to loot scales", section="Loot Settings")
    default public boolean lootScales() {
        return 1 != 0;
    }

    @ConfigItem(position=32, keyName="lootHides", name="Loot Dragon Hides", description="Do you want to loot hides", section="Loot Settings")
    default public boolean lootHides() {
        return 1 != 0;
    }

    @ConfigItem(position=31, keyName="flickPrayer", name="Flick Prayers?", description="Do you want to flick combat prayers?", section="Combat Settings")
    default public boolean flickPrayer() {
        return 1 != 0;
    }

    @ConfigItem(position=31, keyName="lootBones", name="Loot Dragon Bones", description="Do you want to loot bones?", section="Loot Settings")
    default public boolean lootBones() {
        return 1 != 0;
    }

    @ConfigItem(position=10, keyName="eatAt", name="Eat At %", description="What health percentage do you want to eat at?", section="Combat Settings")
    default public int eatAt() {
        return 1 ^ 0x33;
    }

    @ConfigItem(position=34, keyName="lootEnsouled", name="Loot Ensouled Heads", description="Do you want to loot ensouled heads", section="Loot Settings")
    default public boolean lootEnsouled() {
        return 1 != 0;
    }

    @ConfigItem(keyName="loadout", name=" ", description="What bank loadout to use for banking", section="Gear Loadout", position=22)
    default public ConfigStorageBox<BankLoadout> loadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(position=15, keyName="dragonLocation", name="Location", description="Where do you want to kill dragons?", section="Combat Settings")
    default public b dragonLocation() {
        return b.HEROS;
    }

    @ConfigItem(position=21, keyName="bankLocation", name=" ", description="Where do you want to bank?", section="Bank Location")
    default public BankLocation bankLocation() {
        return BankLocation.FALADOR_WEST_BANK;
    }

    @ConfigItem(position=5, keyName="attackStyle", name="Attack Style", description="Which type of style would you like to use", section="Combat Settings")
    default public c attackStyle() {
        return c.MELEE;
    }

    static {
        combatSettings = "Combat Settings";
        lootSettings = "Loot Settings";
        GROUP = "squirebdk";
        bankLocation = "Bank Location";
        bankLoadout = "Gear Loadout";
    }
}

