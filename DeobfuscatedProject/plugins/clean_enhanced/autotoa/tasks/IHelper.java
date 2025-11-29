/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.tasks.FHelper;

/**
 * TaskDescriptor - Simple data class holding two string properties.
 *
 * This class appears to store descriptor information for tasks with:
 * - A primary identifier/name
 * - A value/description string
 *
 * Immutable data holder with final fields.
 */
class TaskDescriptor {

    /** The primary identifier or name */
    private final String identifier;

    /** Reference to parent FHelper manager */
    final FHelper manager;

    /** The value or description */
    private final String value;

    /**
     * Gets the primary identifier or name.
     *
     * @return The identifier
     */
    String getIdentifier() {
        return this.identifier;
    }

    /**
     * Gets the value or description.
     *
     * @return The value
     */
    String getValue() {
        return this.value;
    }

    /**
     * Creates a new task descriptor.
     *
     * @param manager The parent FHelper manager
     * @param identifier The primary identifier or name
     * @param value The value or description
     */
    TaskDescriptor(FHelper manager, String identifier, String value) {
        this.manager = manager;
        this.identifier = identifier;
        this.value = value;
    }
}
