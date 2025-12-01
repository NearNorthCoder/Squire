package gg.squire.quest;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.EnumC0007h;
@ConfigGroup("squirequester")
/* loaded from: squire-tutorial-island-0.1.0.jar:gg/squire/quest/SquireQuesterConfig.class */
public interface SquireQuesterConfig extends Config {
    public static final /* synthetic */ String QUEST_CONFIG_GROUP = "squirequester";
    @ConfigSection(keyName = "questConfig", name = "Quest Configuration", description = "Configure what quest you want to do", position = 1, closedByDefault = false)
    public static final /* synthetic */ String questConfig = "questConfig";

    @ConfigItem(position = 10, keyName = "quest", name = "Quest", description = "Quest to do", section = "questConfig")
    default EnumC0007h quest() {
        return EnumC0007h.TUTORIAL_ISLAND;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 11, keyName = "Bond", name = "Bond after tutorial island?", hidden = true, unhide = "quest", unhideValue = "TUTORIAL_ISLAND", description = "Accept trade and use bond after tutorial island", section = "questConfig")
    default boolean bond() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 12, keyName = "ironman", name = "Stop at magic instructor", hidden = true, unhide = "quest", unhideValue = "TUTORIAL_ISLAND", description = "Stop at magic instructor to manually select ironman mode", section = "questConfig")
    default boolean ironman() {
        return " ".length();
    }
}
