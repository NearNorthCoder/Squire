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
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@ConfigGroup(value="squirequester")
public interface SquireQuesterConfig
extends Config {
    public static final /* synthetic */ String QUEST_CONFIG_GROUP;
    @ConfigSection(keyName="questConfig", name="Quest Configuration", description="Configure what quest you want to do", position=1, closedByDefault=false)
    public static final /* synthetic */ String questConfig;

    @ConfigItem(position=10, keyName="quest", name="Quest", description="Quest to do", section="questConfig")
    default public h quest() {
        return h.TUTORIAL_ISLAND;
    }

    static {
        questConfig = "questConfig";
        QUEST_CONFIG_GROUP = "squirequester";
    }

    @ConfigItem(position=12, keyName="ironman", name="Stop at magic instructor", hidden=true, unhide="quest", unhideValue="TUTORIAL_ISLAND", description="Stop at magic instructor to manually select ironman mode", section="questConfig")
    default public boolean ironman() {
        return 1 != 0;
    }

    @ConfigItem(position=11, keyName="Bond", name="Bond after tutorial island?", hidden=true, unhide="quest", unhideValue="TUTORIAL_ISLAND", description="Accept trade and use bond after tutorial island", section="questConfig")
    default public boolean bond() {
        return 1 != 0;
    }
}

