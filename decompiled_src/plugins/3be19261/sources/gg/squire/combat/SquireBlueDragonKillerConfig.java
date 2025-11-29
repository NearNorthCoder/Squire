package gg.squire.combat;

import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.b;
import k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.c;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@ConfigGroup("squirebdk")
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:gg/squire/combat/SquireBlueDragonKillerConfig.class */
public interface SquireBlueDragonKillerConfig extends Config {
    @ConfigSection(name = "Combat Settings", description = "Settings related to combat", position = 10)
    public static final /* synthetic */ String combatSettings = "Combat Settings";
    @ConfigSection(name = "Loot Settings", description = "Settings related to looting", position = 30)
    public static final /* synthetic */ String lootSettings = "Loot Settings";
    public static final /* synthetic */ String GROUP = "squirebdk";
    @ConfigSection(name = "Bank Location", description = "Settings related to banking", position = 20)
    public static final /* synthetic */ String bankLocation = "Bank Location";
    @ConfigSection(name = "Gear Loadout", description = "Settings related to banking", position = 25)
    public static final /* synthetic */ String bankLoadout = "Gear Loadout";

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 33, keyName = "lootScales", name = "Loot Dragon Scales", description = "Do you want to loot scales", section = "Loot Settings")
    default boolean lootScales() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 32, keyName = "lootHides", name = "Loot Dragon Hides", description = "Do you want to loot hides", section = "Loot Settings")
    default boolean lootHides() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 31, keyName = "flickPrayer", name = "Flick Prayers?", description = "Do you want to flick combat prayers?", section = "Combat Settings")
    default boolean flickPrayer() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 31, keyName = "lootBones", name = "Loot Dragon Bones", description = "Do you want to loot bones?", section = "Loot Settings")
    default boolean lootBones() {
        return " ".length();
    }

    @ConfigItem(position = 10, keyName = "eatAt", name = "Eat At %", description = "What health percentage do you want to eat at?", section = "Combat Settings")
    default int eatAt() {
        return 1 ^ 51;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 34, keyName = "lootEnsouled", name = "Loot Ensouled Heads", description = "Do you want to loot ensouled heads", section = "Loot Settings")
    default boolean lootEnsouled() {
        return " ".length();
    }

    @ConfigItem(keyName = "loadout", name = " ", description = "What bank loadout to use for banking", section = "Gear Loadout", position = 22)
    default ConfigStorageBox<BankLoadout> loadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(position = 15, keyName = "dragonLocation", name = "Location", description = "Where do you want to kill dragons?", section = "Combat Settings")
    default b dragonLocation() {
        return b.HEROS;
    }

    @ConfigItem(position = 21, keyName = "bankLocation", name = " ", description = "Where do you want to bank?", section = "Bank Location")
    default BankLocation bankLocation() {
        return BankLocation.FALADOR_WEST_BANK;
    }

    @ConfigItem(position = 5, keyName = "attackStyle", name = "Attack Style", description = "Which type of style would you like to use", section = "Combat Settings")
    default c attackStyle() {
        return c.MELEE;
    }
}
