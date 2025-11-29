/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.tasks.FHelper;

/**
 * AlternativeTaskHolder - Minimal data class holding a single string property.
 *
 * This class is structurally identical to SimpleTaskHolder (JHelper),
 * possibly used for a different type of task or context.
 * Immutable data holder with final fields.
 */
class AlternativeTaskHolder {

    /** Reference to parent FHelper manager */
    final FHelper manager;

    /** The object name or identifier */
    private final String objectName;

    /**
     * Creates a new alternative task holder.
     *
     * @param manager The parent FHelper manager
     * @param objectName The object name or identifier
     */
    AlternativeTaskHolder(FHelper manager, String objectName) {
        this.manager = manager;
        this.objectName = objectName;
    }

    /**
     * Gets the object name or identifier.
     *
     * @return The object name
     */
    String getObjectName() {
        return this.objectName;
    }
}
