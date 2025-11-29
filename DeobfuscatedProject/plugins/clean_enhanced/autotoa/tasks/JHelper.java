/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.tasks.FHelper;

/**
 * SimpleTaskHolder - Minimal data class holding a single string property.
 *
 * This class stores a single object name or identifier string.
 * Immutable data holder with final fields.
 */
class SimpleTaskHolder {

    /** Reference to parent FHelper manager */
    final FHelper manager;

    /** The object name or identifier */
    private final String objectName;

    /**
     * Creates a new simple task holder.
     *
     * @param manager The parent FHelper manager
     * @param objectName The object name or identifier
     */
    SimpleTaskHolder(FHelper manager, String objectName) {
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
