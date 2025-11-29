/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.config.Range
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.zulrah;

import a.u.i.-.l.r.h.z.s.r.u.q.e.a;
import a.u.i.-.l.r.h.z.s.r.u.q.e.b;
import a.u.i.-.l.r.h.z.s.r.u.q.e.g;
import a.u.i.-.l.r.h.z.s.r.u.q.e.j;
import a.u.i.-.l.r.h.z.s.r.u.q.e.o;
import a.u.i.-.l.r.h.z.s.r.u.q.e.q;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squirezulrah")
public interface SquireZulrahConfig
extends Config {
    public static final /* synthetic */ String GROUP;
    @ConfigSection(name="Fight settings", description="Fight settings", position=0)
    public static final /* synthetic */ String FIGHT_SETTINGS;
    @ConfigSection(name="Other settings", description="Settings for other things", position=2)
    public static final /* synthetic */ String OTHER_SETTINGS;
    @ConfigSection(name="Bank settings", description="Bank settings", position=1)
    public static final /* synthetic */ String BANK_SETTINGS;

    @ConfigItem(keyName="cure", name="Venom cure", description="How to cure venom? Brings rune pouch for cure-me.", position=7, section="fight")
    default public o cure() {
        return o.ANTI_VENOM;
    }

    @Range(max=20)
    @ConfigItem(keyName="multiple", name="Multi-kill food", description="How many food should we have in inventory to start another kill? (0 = disabled)", position=0, section="fight")
    default public int multiple() {
        return (0x43 ^ 0x7D) & ~(0x62 ^ 0x5C);
    }

    @ConfigItem(name="Bank location", description="Where to bank?", keyName="bankLocation", position=1, section="bank")
    default public a bankLocation() {
        return a.FEROX_ENCLAVE;
    }

    @ConfigItem(name="Bank Loadout", description="Bank loadout to use", keyName="bankLoadout", position=2, section="bank")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(keyName="rangeGear", name="Ranged Gear", description="Select ranged gear loadout", position=5, section="fight")
    default public ConfigStorageBox<EquipmentSetup> rangedGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    static {
        BANK_SETTINGS = "bank";
        FIGHT_SETTINGS = "fight";
        GROUP = "squirezulrah";
        OTHER_SETTINGS = "other";
    }

    @ConfigItem(name="Bank teleport", description="What bank teleport item to use?", keyName="bankTele", position=25, section="bank")
    default public b bankTeleportItem() {
        return b.RING_OF_DUELING;
    }

    @ConfigItem(keyName="rangePrayer", name="Range prayer", description="What offensive range prayer to use?", position=3, section="fight")
    default public j rangePrayer() {
        return j.EAGLE_EYE;
    }

    @ConfigItem(name="World hop every hour", description="Hop worlds every hour?", keyName="worldHop", position=3, section="other")
    default public boolean hop() {
        return 1 != 0;
    }

    @Range(min=20, max=80)
    @ConfigItem(keyName="eatAt", name="Eat at HP", description="Eat at this HP", position=0, section="fight")
    default public int eatAtHP() {
        return 206 + 188 - 225 + 70 ^ 79 + 2 - -89 + 27;
    }

    @ConfigItem(keyName="magePrayer", name="Magic prayer", description="What offensive magic prayer to use?", position=4, section="fight")
    default public g magePrayer() {
        return g.AUGURY;
    }

    @ConfigItem(name="Enable banking", description="Enable banking?", keyName="enableBanking", position=0, section="bank")
    default public boolean bank() {
        return (3 & (3 ^ -1)) != 0;
    }

    @ConfigItem(name="Zulrah transport", description="What method to use to get to zulrah?", keyName="zulrahTransport", position=1, section="other")
    default public q transport() {
        return q.ZUL_ANDRA_TELEPORT;
    }

    @ConfigItem(keyName="mageGear", name="Magic Gear", description="Select magic gear loadout", position=6, section="fight")
    default public ConfigStorageBox<EquipmentSetup> mageGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }
}

