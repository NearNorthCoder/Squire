/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  lombok.NonNull
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 */
package net.runelite.client.plugins.xptracker;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import javax.inject.Inject;
import lombok.NonNull;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.client.plugins.xptracker.XpAction;
import net.runelite.client.plugins.xptracker.XpActionType;
import net.runelite.client.plugins.xptracker.XpSnapshotSingle;
import net.runelite.client.plugins.xptracker.XpStateSingle;
import net.runelite.client.plugins.xptracker.XpTrackerConfig;
import net.runelite.client.plugins.xptracker.XpUpdateResult;

class XpState {
    private static final double DEFAULT_XP_MODIFIER = 4.0;
    private static final double SHARED_XP_MODIFIER = 1.3333333333333333;
    private final Map<Skill, XpStateSingle> xpSkills = new EnumMap<Skill, XpStateSingle>(Skill.class);
    private XpStateSingle overall = new XpStateSingle(-1L);
    private NPC interactedNPC;
    @Inject
    private XpTrackerConfig xpTrackerConfig;

    XpState() {
    }

    void reset() {
        this.xpSkills.clear();
        this.overall = new XpStateSingle(-1L);
    }

    void resetSkillPerHour(Skill skill) {
        this.xpSkills.get(skill).resetPerHour();
    }

    void resetOverallPerHour() {
        this.overall.resetPerHour();
    }

    XpUpdateResult updateSkill(Skill skill, long currentXp, int goalStartXp, int goalEndXp) {
        int gainedXp;
        XpStateSingle state = this.xpSkills.get(skill);
        if (state == null || state.getStartXp() == -1L) {
            assert (currentXp >= 0L);
            this.initializeSkill(skill, currentXp);
            return XpUpdateResult.INITIALIZED;
        }
        long startXp = state.getStartXp();
        if (startXp + (long)(gainedXp = state.getTotalXpGained()) > currentXp) {
            this.initializeSkill(skill, currentXp);
            return XpUpdateResult.INITIALIZED;
        }
        if (!state.update(currentXp)) {
            return XpUpdateResult.NO_CHANGE;
        }
        state.updateGoals(currentXp, goalStartXp, goalEndXp);
        return XpUpdateResult.UPDATED;
    }

    void updateOverall(long currentXp) {
        if (this.overall == null || this.overall.getStartXp() + (long)this.overall.getTotalXpGained() > currentXp) {
            this.overall = new XpStateSingle(currentXp);
        } else {
            this.overall.update(currentXp);
        }
    }

    private double getCombatXPModifier(Skill skill) {
        if (skill == Skill.HITPOINTS) {
            return 1.3333333333333333;
        }
        return 4.0;
    }

    void updateNpcExperience(Skill skill, NPC npc, Integer npcHealth, int xpModifier) {
        if (npc == null || npc.getCombatLevel() <= 0 || npcHealth == null) {
            return;
        }
        XpStateSingle state = this.getSkill(skill);
        int actionExp = (int)((double)npcHealth.intValue() * this.getCombatXPModifier(skill) * (double)xpModifier);
        XpAction action = state.getXpAction(XpActionType.ACTOR_HEALTH);
        if (action.isActionsHistoryInitialized()) {
            action.getActionExps()[action.getActionExpIndex()] = actionExp;
            if (this.interactedNPC != npc) {
                action.setActionExpIndex((action.getActionExpIndex() + 1) % action.getActionExps().length);
            }
        } else {
            Arrays.fill(action.getActionExps(), actionExp);
            action.setActionsHistoryInitialized(true);
        }
        this.interactedNPC = npc;
        state.setActionType(XpActionType.ACTOR_HEALTH);
    }

    XpUpdateResult updateNpcKills(Skill skill, NPC npc, Integer npcHealth) {
        XpStateSingle state = this.getSkill(skill);
        if (state.getXpGainedSinceReset() <= 0 || npcHealth == null || npc != this.interactedNPC) {
            return XpUpdateResult.NO_CHANGE;
        }
        XpAction xpAction = state.getXpAction(XpActionType.ACTOR_HEALTH);
        xpAction.setActionsSinceReset(xpAction.getActionsSinceReset() + 1);
        return xpAction.isActionsHistoryInitialized() ? XpUpdateResult.UPDATED : XpUpdateResult.NO_CHANGE;
    }

    void tick(Skill skill, long delta) {
        XpStateSingle state = this.getSkill(skill);
        this.tick(state, delta);
    }

    void tickOverall(long delta) {
        this.tick(this.overall, delta);
    }

    private void tick(XpStateSingle state, long delta) {
        state.tick(delta);
        int resetAfterMinutes = this.xpTrackerConfig.resetSkillRateAfter();
        if (resetAfterMinutes > 0) {
            long now = System.currentTimeMillis();
            int resetAfterMillis = resetAfterMinutes * 60 * 1000;
            long lastChangeMillis = state.getLastChangeMillis();
            if (lastChangeMillis != 0L && now - lastChangeMillis >= (long)resetAfterMillis) {
                state.resetPerHour();
            }
        }
    }

    void initializeSkill(Skill skill, long currentXp) {
        this.xpSkills.put(skill, new XpStateSingle(currentXp));
    }

    void initializeOverall(long currentXp) {
        this.overall = new XpStateSingle(currentXp);
    }

    boolean isInitialized(Skill skill) {
        XpStateSingle xpStateSingle = this.xpSkills.get(skill);
        return xpStateSingle != null && xpStateSingle.getStartXp() != -1L;
    }

    boolean isOverallInitialized() {
        return this.overall.getStartXp() != -1L;
    }

    @NonNull
    XpStateSingle getSkill(Skill skill) {
        return this.xpSkills.computeIfAbsent(skill, s -> new XpStateSingle(-1L));
    }

    @NonNull
    XpSnapshotSingle getSkillSnapshot(Skill skill) {
        return this.getSkill(skill).snapshot();
    }

    @NonNull
    XpSnapshotSingle getTotalSnapshot() {
        return this.overall.snapshot();
    }
}

