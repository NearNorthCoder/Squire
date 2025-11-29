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
 */
package gg.squire.vorkath;

import i.v.k.o.-.u.s.e.r.a.q.r.t.h.CEnum;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@ConfigGroup(value="squirevorkath")
public interface SquireVorkathConfig
extends Config {
    @ConfigSection(name="Fight settings", description="Fight settings", position=0)
    public static final /* synthetic */ String FIGHT_SETTINGS;
    public static final /* synthetic */ String GROUP;
    @ConfigSection(name="Bank settings", description="Bank settings", position=1)
    public static final /* synthetic */ String BANK_SETTINGS;

    @ConfigItem(keyName="eatAt", name="Eat at HP", description="Eat at this HP", position=1, section="fight")
    @Range(min=20, max=80)
    default public int eatAtHP() {
        return 108 + 75 - 154 + 109 ^ 157 + 96 - 179 + 86;
    }

    @ConfigItem(keyName="debug", name="Debug more info", description="Adds debugging info to fight", position=4, section="fight")
    default public boolean debug() {
        return false;
    }

    @Range(max=28)
    @ConfigItem(keyName="minFood", name="Multi-kill food", description="How many food should we have in inventory to start another kill?", position=1, section="fight")
    default public int multiple() {
        return (0x44 ^ 1 ^ (0xBF ^ 0xA1)) & (0x72 ^ 0xA ^ (0x4C ^ 0x6F) ^ -1);
    }

    @ConfigItem(keyName="bankLoadout", name="Bank loadout", description="Select bank loadout", position=1, section="bank")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(keyName="alch", name="Alch items", description="Alchs common highly valuable drops (rune/dragon)", position=3, section="fight")
    default public boolean alch() {
        return false;
    }

    @ConfigItem(keyName="bankLocation", name="Bank location", description="Select bank location", position=2, section="bank")
    default public c bankLocation() {
        return c.FEROX_ENCLAVE;
    }

    static {
        FIGHT_SETTINGS = "fight";
        BANK_SETTINGS = "bank";
        GROUP = "squirevorkath";
    }
}

