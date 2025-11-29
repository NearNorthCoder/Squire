/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.templeTrekking;

import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.c;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.d;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiretempletrekking")
public interface TempleTrekkingConfig
extends Config {
    @ConfigSection(name="Tome Reader", description="Settings to configure reedming banked XP tomes", position=20)
    public static final /* synthetic */ String TOME_READER_SETTINGS;
    @ConfigSection(name="Temple Trekking", description="Settings to configure Temple Trekking", position=10)
    public static final /* synthetic */ String TEMPLE_TREKKING_SETTINGS;

    @Range(min=1, max=8)
    @ConfigItem(position=22, keyName="Tomes per Tick", name="Tomes per Tick", description="How many tomes per tick to read", section="Tome Reader Settings")
    default public int perTick() {
        return 53 + 92 - 137 + 119 ^ (0x70 ^ 0xB);
    }

    @Range(min=15, max=99)
    @ConfigItem(position=16, hidden=true, keyName="Health to bank at", name="Health to bank at", description="Health to bank at (hitpoints left)", unhide="Heal in bank", unhideValue="true", section="Temple Trekking Settings")
    default public int hpToBank() {
        return 104 + 87 - 92 + 47 ^ 6 + 143 - -21 + 16;
    }

    @ConfigItem(position=12, hidden=true, keyName="Bank XP Tomes", name="Bank XP Tomes", description="Use this setting if you would like to bank your XP tomes", unhide="Reward", unhideValue="XP_TOME", section="Temple Trekking Settings")
    default public boolean bankXPTomes() {
        return ((0x1B ^ 0x14) & ~(0x7C ^ 0x73)) != 0;
    }

    @ConfigItem(position=21, keyName="Claim banked XP tomes", name="Claim banked XP tomes", description="Claims banked XP tomes for experience!", section="Tome Reader Settings")
    default public boolean claimBankTomes() {
        return ((0x29 ^ 0x3A ^ (0x71 ^ 0x3A)) & (0x6C ^ 0x1D ^ (0x44 ^ 0x6D) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=11, keyName="Reward", name="Reward", description="Select your desired reward", section="Temple Trekking Settings")
    default public d reward() {
        return d.XP_TOME;
    }

    @ConfigItem(position=14, keyName="Heal in bank", name="Heal in bank", description="Only banks in Burgh de rott!", section="Temple Trekking Settings")
    default public boolean healInBank() {
        return ((0xB4 ^ 0xA6) & ~(0xB9 ^ 0xAB)) != 0;
    }

    static {
        TOME_READER_SETTINGS = "Tome Reader Settings";
        TEMPLE_TREKKING_SETTINGS = "Temple Trekking Settings";
    }

    @ConfigItem(position=15, hidden=true, keyName="Select food", name="Select food", description="Please choose which food you want to heal up with", unhide="Heal in bank", unhideValue="true", section="Temple Trekking Settings")
    default public c food() {
        return c.KARAMBWAN;
    }

    @ConfigItem(position=13, keyName="Stamina", name="Stamina", description="How many stamina potion(4) to withdraw", section="Temple Trekking Settings")
    default public int stamina() {
        return "  ".length();
    }
}

