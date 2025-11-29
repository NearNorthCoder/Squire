/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.tasks.FHelper;

/**
 * TaskState - Data class holding task state with a name, description, and boolean flag.
 *
 * This class appears to store state information for tasks, including:
 * - A name identifier
 * - A description or details string
 * - A boolean flag (possibly completion status or active state)
 *
 * Immutable data holder with final fields.
 */
class TaskState {

    /** The description or details */
    private final String description;

    /** Boolean flag (possibly completion or active status) */
    private final boolean flag;

    /** The name/identifier for this state */
    private final String name;

    /** Reference to parent FHelper manager */
    final FHelper manager;

    /**
     * Gets the name/identifier for this state.
     *
     * @return The name
     */
    String getName() {
        return this.name;
    }

    /**
     * Gets the boolean flag value.
     *
     * @return The flag value
     */
    boolean getFlag() {
        return this.flag;
    }

    /**
     * Gets the description or details.
     *
     * @return The description
     */
    String getDescription() {
        return this.description;
    }

    /**
     * Creates a new task state.
     *
     * @param manager The parent FHelper manager
     * @param name The name/identifier
     * @param description The description or details
     * @param flag The boolean flag value
     */
    TaskState(FHelper manager, String name, String description, boolean flag) {
        this.manager = manager;
        this.name = name;
        this.description = description;
        this.flag = flag;
    }
}
