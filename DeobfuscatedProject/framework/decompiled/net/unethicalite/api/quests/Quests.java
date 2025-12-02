/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.unethicalite.client.managers.QuestManager
 */
package net.unethicalite.api.quests;

import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.unethicalite.client.managers.QuestManager;

public class Quests {
    public static QuestState getState(Quest quest) {
        return (QuestState)QuestManager.getQuestStates().get(quest);
    }

    public static boolean isFinished(Quest quest) {
        return QuestManager.getQuestStates().get(quest) == QuestState.FINISHED;
    }
}
