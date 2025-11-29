package gg.squire.mining;

import m.e.i.q.u.r.p000.n.s.e.r.i.EnumC0000a;
import m.e.i.q.u.r.p000.n.s.e.r.i.EnumC0001b;
import m.e.i.q.u.r.p000.n.s.e.r.i.EnumC0003d;
import m.e.i.q.u.r.p000.n.s.e.r.i.EnumC0004e;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
@ConfigGroup("squiremlm")
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:gg/squire/mining/SquireMinerConfig.class */
public interface SquireMinerConfig extends Config {
    @ConfigSection(name = "Mining Settings", description = "Settings", position = 0)
    public static final /* synthetic */ String MINING_SETTINGS = "Mining Settings";

    @ConfigItem(position = 4, keyName = "sandstoneArea", name = "Quarry Area", description = "Where to mine in the quarry", hidden = true, unhide = "activity", unhideValue = "SANDSTONE")
    default EnumC0004e area() {
        return EnumC0004e.WEST_FOUR;
    }

    @ConfigItem(keyName = "motherlodeDepositUpstairs", name = "Deposit upstairs", description = "Deposit upstairs?", position = 3, section = "Mining Settings", hidden = true, unhide = "motherlodeMineArea", unhideValue = "UPPER_FLOOR")
    default boolean depositUpstairs() {
        return (true ^ true) & (true ^ true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 11, keyName = "humidify", name = "Humidify", description = "Use Humidify to refill waterskins", hidden = true, unhide = "activity", unhideValue = "GRANITE||SANDSTONE")
    default boolean humidify() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 14, keyName = "deposit", name = "Deposit Sandstone", description = "Deposits the sandstone when your inventory is full", hidden = true, unhide = "activity", unhideValue = "SANDSTONE")
    default boolean deposit() {
        return " ".length();
    }

    @ConfigItem(keyName = "activity", name = "Mining Activity", description = "What do you want to mine?", position = 1, section = "Mining Settings")
    default EnumC0000a activity() {
        return EnumC0000a.MOTHERLODE_MINE;
    }

    @ConfigItem(keyName = "bankLoadout", name = "Bank Loadout", description = "What do you want to bank?", position = 4, section = "Mining Settings", hidden = true, unhide = "activity", unhideValue = "SUPERHEAT_MINE")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(position = 13, keyName = "amount of waterskins", name = "Amount Of Waterskins", description = "Amount Of Waterskins", hidden = true, unhide = "activity", unhideValue = "SANDSTONE||GRANITE")
    default int waterskins() {
        return 38 ^ 44;
    }

    @ConfigItem(position = 1, keyName = "chisel", name = "Craft amethyst item", hidden = true, unhide = "activity", unhideValue = "AMETHYST", description = "Do you want to craft them into amethyst items?")
    default EnumC0001b craft() {
        return EnumC0001b.DISABLE;
    }

    @ConfigItem(keyName = "motherlodeMineArea", name = "Area to mine", description = "What area do you want to mine?", position = 2, section = "Mining Settings", hidden = true, unhide = "activity", unhideValue = "MOTHERLODE_MINE")
    default EnumC0003d mlmArea() {
        return EnumC0003d.UPPER_FLOOR;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "motherlodeHop", name = "Hop Worlds", description = "Hop worlds every 250 ore veins mined to prevent reports?", position = 3, section = "Mining Settings", hidden = true, unhide = "activity", unhideValue = "MOTHERLODE_MINE")
    default boolean hop() {
        return " ".length();
    }
}
