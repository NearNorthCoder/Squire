package gg.squire.templeTrekking;

import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.c;
import e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u.d;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squiretempletrekking")
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:gg/squire/templeTrekking/TempleTrekkingConfig.class */
public interface TempleTrekkingConfig extends Config {
    @ConfigSection(name = "Tome Reader", description = "Settings to configure reedming banked XP tomes", position = 20)
    public static final /* synthetic */ String TOME_READER_SETTINGS = "Tome Reader Settings";
    @ConfigSection(name = "Temple Trekking", description = "Settings to configure Temple Trekking", position = 10)
    public static final /* synthetic */ String TEMPLE_TREKKING_SETTINGS = "Temple Trekking Settings";

    @ConfigItem(position = 22, keyName = "Tomes per Tick", name = "Tomes per Tick", description = "How many tomes per tick to read", section = "Tome Reader Settings")
    @Range(min = 1, max = 8)
    default int perTick() {
        return (((53 + 92) - 137) + 119) ^ (112 ^ 11);
    }

    @ConfigItem(position = 16, hidden = true, keyName = "Health to bank at", name = "Health to bank at", description = "Health to bank at (hitpoints left)", unhide = "Heal in bank", unhideValue = "true", section = "Temple Trekking Settings")
    @Range(min = 15, max = 99)
    default int hpToBank() {
        return (((104 + 87) - 92) + 47) ^ (((6 + 143) - (-21)) + 16);
    }

    @ConfigItem(position = 12, hidden = true, keyName = "Bank XP Tomes", name = "Bank XP Tomes", description = "Use this setting if you would like to bank your XP tomes", unhide = "Reward", unhideValue = "XP_TOME", section = "Temple Trekking Settings")
    default boolean bankXPTomes() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 21, keyName = "Claim banked XP tomes", name = "Claim banked XP tomes", description = "Claims banked XP tomes for experience!", section = "Tome Reader Settings")
    default boolean claimBankTomes() {
        return ((41 ^ 58) ^ (113 ^ 58)) & (((108 ^ 29) ^ (68 ^ 109)) ^ (-" ".length()));
    }

    @ConfigItem(position = 11, keyName = "Reward", name = "Reward", description = "Select your desired reward", section = "Temple Trekking Settings")
    default d reward() {
        return d.XP_TOME;
    }

    @ConfigItem(position = 14, keyName = "Heal in bank", name = "Heal in bank", description = "Only banks in Burgh de rott!", section = "Temple Trekking Settings")
    default boolean healInBank() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 15, hidden = true, keyName = "Select food", name = "Select food", description = "Please choose which food you want to heal up with", unhide = "Heal in bank", unhideValue = "true", section = "Temple Trekking Settings")
    default c food() {
        return c.KARAMBWAN;
    }

    @ConfigItem(position = 13, keyName = "Stamina", name = "Stamina", description = "How many stamina potion(4) to withdraw", section = "Temple Trekking Settings")
    default int stamina() {
        return "  ".length();
    }
}
