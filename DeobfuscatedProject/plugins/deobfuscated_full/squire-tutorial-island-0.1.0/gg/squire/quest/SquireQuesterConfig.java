/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 */
package gg.squire.quest;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.h;

@ConfigGroup(value="squirequester")
public interface SquireQuesterConfig
extends Config {
    @ConfigSection(keyName="questConfig", name="Quest Configuration", description="Configure what quest you want to do", position=1, closedByDefault=false)
    public static final /* synthetic */ String questConfig;
    public static final /* synthetic */ String QUEST_CONFIG_GROUP;

    static {
        QUEST_CONFIG_GROUP = "squirequester";
        questConfig = "questConfig";
    }

    @ConfigItem(position=10, keyName="quest", name="Quest", description="Quest to do", section="questConfig")
    default public h quest() {
        return h.TUTORIAL_ISLAND;
    }

    @ConfigItem(position=11, keyName="Bond", name="Bond after tutorial island?", hidden=true, unhide="quest", unhideValue="TUTORIAL_ISLAND", description="Accept trade and use bond after tutorial island", section="questConfig")
    default public boolean bond() {
        return 1 != 0;
    }

    @ConfigItem(position=12, keyName="ironman", name="Stop at magic instructor", hidden=true, unhide="quest", unhideValue="TUTORIAL_ISLAND", description="Stop at magic instructor to manually select ironman mode", section="questConfig")
    default public boolean ironman() {
        return 1 != 0;
    }
}

