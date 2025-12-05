/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.Skill
 *  net.runelite.api.events.StatChanged
 */
package net.runelite.client.game;

import java.util.EnumMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.XpDropEvent;

@Singleton
public class XpDropManager {
    private final Map<Skill, Integer> previousSkillExpTable = new EnumMap<Skill, Integer>(Skill.class);
    private final Client client;
    private final EventBus eventBus;

    @Inject
    private XpDropManager(Client client, EventBus eventBus) {
        this.client = client;
        this.eventBus = eventBus;
    }

    @Subscribe
    private void onStatChanged(StatChanged event) {
        int xp;
        Skill skill = event.getSkill();
        Integer previous = this.previousSkillExpTable.put(skill, xp = this.client.getSkillExperience(skill));
        if (previous != null) {
            int previousExpGained = xp - previous;
            XpDropEvent xpDropEvent = new XpDropEvent(skill, previousExpGained);
            this.eventBus.post(xpDropEvent);
        }
    }
}

