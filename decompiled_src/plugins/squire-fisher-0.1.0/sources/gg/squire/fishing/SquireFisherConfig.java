package gg.squire.fishing;

import i.i.p000.h.u.s.e.r.q.r.s.f.e.f;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("squirefisher")
/* loaded from: squire-fisher-0.1.0.jar:gg/squire/fishing/SquireFisherConfig.class */
public interface SquireFisherConfig extends Config {
    @ConfigSection(name = "Fish Settings", description = "Settings related to fishing", position = 10)
    public static final /* synthetic */ String fishSettings = "Fish Settings";
    @ConfigSection(name = "Fishing Trawler", description = "Settings related to fishing trawler", position = 20)
    public static final /* synthetic */ String fishingTrawlerSettings = "Fishing Trawler Settings";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 12, hidden = true, keyName = "3tickFishing", name = "3 Tick Fishing", description = "Enable this if you want to 3 tick fish", section = "Fish Settings", unhide = "Fish to catch", unhideValue = "FLY_FISHING||BARBARIAN_FISHING")
    default boolean tickFishing() {
        return ((208 ^ 177) ^ (232 ^ 172)) & (((150 ^ 178) ^ " ".length()) ^ (-" ".length()));
    }

    @ConfigItem(position = 13, hidden = true, keyName = "cutEating", name = "Cut eat fish?", description = "(BARB FISHING ONLY) Cut eat fish on top of normal tick fishing, requires mid/high cooking level", section = "Fish Settings", unhide = "Fish to catch", unhideValue = "BARBARIAN_FISHING")
    default boolean cutEat() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 15, keyName = "butler", name = "Use butler", description = "Enable this if you want to bank your fish by using poh butler", section = "Fish Settings", hidden = true, unhide = "Fish to catch", unhideValue = "KARAMBWAN")
    default boolean butlerBanking() {
        return ((100 ^ 98) ^ (99 ^ 113)) & (((40 ^ 108) ^ (111 ^ 63)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 21, keyName = "fishingTrawlerMinigame", name = "Fishing Trawler Minigame", description = "Fishing Trawler Minigame", section = "Fishing Trawler Settings")
    default boolean fishingTrawler() {
        return ((144 ^ 142) ^ (19 ^ 37)) & ((" ".length() ^ (27 ^ 50)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 14, keyName = "banking", name = "Banking", description = "Enable this if you want to bank your fish", section = "Fish Settings", hide = "fishingTrawlerMinigame")
    default boolean banking() {
        return ((((23 + 3) - 21) + 167) ^ (((25 + 55) - (-5)) + 62)) & (((((15 + 58) - (-65)) + 15) ^ (((18 + 160) - 86) + 74)) ^ (-" ".length()));
    }

    @ConfigItem(position = 11, keyName = "Fish to catch", name = "Fish to catch", description = "Fish to catch", section = "Fish Settings", hide = "fishingTrawlerMinigame")
    default f fish() {
        return f.KARAMBWANJI;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 16, keyName = "fishBarrel", name = "Fish Barrel", description = "Do you want to use the fish barrel", section = "Fish Settings", hide = "fishingTrawlerMinigame||banking")
    default boolean fishBarrel() {
        return " ".length();
    }
}
