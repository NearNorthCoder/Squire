package gg.squire.zulrah;

import a.u.i.p000.l.r.h.z.s.r.u.q.e.EnumC0000a;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.EnumC0001b;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.EnumC0006g;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.EnumC0009j;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.EnumC0014o;
import a.u.i.p000.l.r.h.z.s.r.u.q.e.EnumC0016q;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@ConfigGroup("squirezulrah")
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:gg/squire/zulrah/SquireZulrahConfig.class */
public interface SquireZulrahConfig extends Config {
    @ConfigSection(name = "Bank settings", description = "Bank settings", position = 1)
    public static final /* synthetic */ String BANK_SETTINGS = "bank";
    @ConfigSection(name = "Fight settings", description = "Fight settings", position = 0)
    public static final /* synthetic */ String FIGHT_SETTINGS = "fight";
    public static final /* synthetic */ String GROUP = "squirezulrah";
    @ConfigSection(name = "Other settings", description = "Settings for other things", position = 2)
    public static final /* synthetic */ String OTHER_SETTINGS = "other";

    @ConfigItem(keyName = "cure", name = "Venom cure", description = "How to cure venom? Brings rune pouch for cure-me.", position = 7, section = "fight")
    default EnumC0014o cure() {
        return EnumC0014o.ANTI_VENOM;
    }

    @ConfigItem(keyName = "multiple", name = "Multi-kill food", description = "How many food should we have in inventory to start another kill? (0 = disabled)", position = 0, section = "fight")
    @Range(max = 20)
    default int multiple() {
        return (67 ^ 125) & ((98 ^ 92) ^ (-1));
    }

    @ConfigItem(name = "Bank location", description = "Where to bank?", keyName = "bankLocation", position = 1, section = "bank")
    default EnumC0000a bankLocation() {
        return EnumC0000a.FEROX_ENCLAVE;
    }

    @ConfigItem(name = "Bank Loadout", description = "Bank loadout to use", keyName = "bankLoadout", position = 2, section = "bank")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(keyName = "rangeGear", name = "Ranged Gear", description = "Select ranged gear loadout", position = 5, section = "fight")
    default ConfigStorageBox<EquipmentSetup> rangedGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(name = "Bank teleport", description = "What bank teleport item to use?", keyName = "bankTele", position = 25, section = "bank")
    default EnumC0001b bankTeleportItem() {
        return EnumC0001b.RING_OF_DUELING;
    }

    @ConfigItem(keyName = "rangePrayer", name = "Range prayer", description = "What offensive range prayer to use?", position = 3, section = "fight")
    default EnumC0009j rangePrayer() {
        return EnumC0009j.EAGLE_EYE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(name = "World hop every hour", description = "Hop worlds every hour?", keyName = "worldHop", position = 3, section = "other")
    default boolean hop() {
        return " ".length();
    }

    @ConfigItem(keyName = "eatAt", name = "Eat at HP", description = "Eat at this HP", position = 0, section = "fight")
    @Range(min = 20, max = 80)
    default int eatAtHP() {
        return (((206 + 188) - 225) + 70) ^ (((79 + 2) - (-89)) + 27);
    }

    @ConfigItem(keyName = "magePrayer", name = "Magic prayer", description = "What offensive magic prayer to use?", position = 4, section = "fight")
    default EnumC0006g magePrayer() {
        return EnumC0006g.AUGURY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(name = "Enable banking", description = "Enable banking?", keyName = "enableBanking", position = 0, section = "bank")
    default boolean bank() {
        return "   ".length() & ("   ".length() ^ (-" ".length()));
    }

    @ConfigItem(name = "Zulrah transport", description = "What method to use to get to zulrah?", keyName = "zulrahTransport", position = 1, section = "other")
    default EnumC0016q transport() {
        return EnumC0016q.ZUL_ANDRA_TELEPORT;
    }

    @ConfigItem(keyName = "mageGear", name = "Magic Gear", description = "Select magic gear loadout", position = 6, section = "fight")
    default ConfigStorageBox<EquipmentSetup> mageGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }
}
