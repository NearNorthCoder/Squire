/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.cox.tasks;

import net.runelite.api.NPC;

/**
 * TrackedNpc - Tracks an NPC with an associated counter.
 *
 * This class pairs an NPC with a counter value, typically used for
 * tracking timers, attack counts, or other temporal aspects of NPC behavior
 * during raid encounters.
 */
public class TrackedNpc {
    private NPC npc;
    private int counter;

    /**
     * Creates a new tracked NPC.
     *
     * @param npc the NPC to track
     * @param counter the initial counter value
     */
    public TrackedNpc(NPC npc, int counter) {
        this.npc = npc;
        this.counter = counter;
    }

    /**
     * Sets the counter value.
     *
     * @param counter the new counter value
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     * Gets the tracked NPC.
     *
     * @return the NPC being tracked
     */
    public NPC getNpc() {
        return this.npc;
    }

    /**
     * Gets the current counter value.
     *
     * @return the counter value
     */
    public int getCounter() {
        return this.counter;
    }

    /**
     * Sets the NPC being tracked.
     *
     * @param npc the new NPC to track
     */
    public void setNpc(NPC npc) {
        this.npc = npc;
    }
}
