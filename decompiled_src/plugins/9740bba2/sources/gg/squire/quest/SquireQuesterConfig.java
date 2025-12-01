package gg.squire.quest;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import q.e.u.r.i.u.t.q.p000.e.e.s.r.s.h;
@ConfigGroup("squirequester")
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:gg/squire/quest/SquireQuesterConfig.class */
public interface SquireQuesterConfig extends Config {
    @ConfigSection(keyName = "questConfig", name = "Quest Configuration", description = "Configure what quest you want to do", position = 1, closedByDefault = false)
    public static final /* synthetic */ String questConfig = "questConfig";
    public static final /* synthetic */ String QUEST_CONFIG_GROUP = "squirequester";

    @ConfigItem(position = 10, keyName = "quest", name = "Quest", description = "Quest to do", section = "questConfig")
    default h quest() {
        return h.TUTORIAL_ISLAND;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 12, keyName = "ironman", name = "Stop at magic instructor", hidden = true, unhide = "quest", unhideValue = "TUTORIAL_ISLAND", description = "Stop at magic instructor to manually select ironman mode", section = "questConfig")
    default boolean ironman() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(position = 11, keyName = "Bond", name = "Bond after tutorial island?", hidden = true, unhide = "quest", unhideValue = "TUTORIAL_ISLAND", description = "Accept trade and use bond after tutorial island", section = "questConfig")
    default boolean bond() {
        return " ".length();
    }
}
