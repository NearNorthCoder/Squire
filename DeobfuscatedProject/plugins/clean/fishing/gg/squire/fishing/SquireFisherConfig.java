/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 */
package gg.squire.fishing;

import i.i.-.h.u.s.e.r.q.r.s.f.e.f;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(value="squirefisher")
public interface SquireFisherConfig
extends Config {
    @ConfigSection(name="Fishing Trawler", description="Settings related to fishing trawler", position=20)
    public static final /* synthetic */ String fishingTrawlerSettings;
    @ConfigSection(name="Fish Settings", description="Settings related to fishing", position=10)
    public static final /* synthetic */ String fishSettings;

    @ConfigItem(position=12, hidden=true, keyName="3tickFishing", name="3 Tick Fishing", description="Enable this if you want to 3 tick fish", section="Fish Settings", unhide="Fish to catch", unhideValue="FLY_FISHING||BARBARIAN_FISHING")
    default public boolean tickFishing() {
        return ((0xD0 ^ 0xB1 ^ (0xE8 ^ 0xAC)) & (0x96 ^ 0xB2 ^ " ".length() ^ -" ".length())) != 0;
    }

    @ConfigItem(position=13, hidden=true, keyName="cutEating", name="Cut eat fish?", description="(BARB FISHING ONLY) Cut eat fish on top of normal tick fishing, requires mid/high cooking level", section="Fish Settings", unhide="Fish to catch", unhideValue="BARBARIAN_FISHING")
    default public boolean cutEat() {
        return ((0xB6 ^ 0xBC) & ~(0xA7 ^ 0xAD)) != 0;
    }

    @ConfigItem(position=15, keyName="butler", name="Use butler", description="Enable this if you want to bank your fish by using poh butler", section="Fish Settings", hidden=true, unhide="Fish to catch", unhideValue="KARAMBWAN")
    default public boolean butlerBanking() {
        return ((0x64 ^ 0x62 ^ (0x63 ^ 0x71)) & (0x28 ^ 0x6C ^ (0x6F ^ 0x3F) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=21, keyName="fishingTrawlerMinigame", name="Fishing Trawler Minigame", description="Fishing Trawler Minigame", section="Fishing Trawler Settings")
    default public boolean fishingTrawler() {
        return ((0x90 ^ 0x8E ^ (0x13 ^ 0x25)) & (" ".length() ^ (0x1B ^ 0x32) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=14, keyName="banking", name="Banking", description="Enable this if you want to bank your fish", section="Fish Settings", hide="fishingTrawlerMinigame")
    default public boolean banking() {
        return ((23 + 3 - 21 + 167 ^ 25 + 55 - -5 + 62) & (15 + 58 - -65 + 15 ^ 18 + 160 - 86 + 74 ^ -" ".length())) != 0;
    }

    @ConfigItem(position=11, keyName="Fish to catch", name="Fish to catch", description="Fish to catch", section="Fish Settings", hide="fishingTrawlerMinigame")
    default public f fish() {
        return f.KARAMBWANJI;
    }

    static {
        fishSettings = "Fish Settings";
        fishingTrawlerSettings = "Fishing Trawler Settings";
    }

    @ConfigItem(position=16, keyName="fishBarrel", name="Fish Barrel", description="Do you want to use the fish barrel", section="Fish Settings", hide="fishingTrawlerMinigame||banking")
    default public boolean fishBarrel() {
        return " ".length() != 0;
    }
}

