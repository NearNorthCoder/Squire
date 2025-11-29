/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.tasks.FHelper;

/**
 * TaskConfiguration - Data class holding task configuration with three string properties.
 *
 * This class appears to store configuration data for tasks, including:
 * - A name identifier
 * - An object/target name
 * - A value/description string
 *
 * Immutable data holder with final fields.
 */
class TaskConfiguration {

    /** Reference to parent FHelper manager */
    final FHelper manager;

    /** The name/identifier for this configuration */
    private final String name;

    /** The object or target name */
    private final String objectName;

    /** The value or description */
    private final String value;

    /**
     * Creates a new task configuration.
     *
     * @param manager The parent FHelper manager
     * @param name The name/identifier
     * @param objectName The object or target name
     * @param value The value or description
     */
    TaskConfiguration(FHelper manager, String name, String objectName, String value) {
        this.manager = manager;
        this.name = name;
        this.objectName = objectName;
        this.value = value;
    }

    /**
     * Gets the name/identifier for this configuration.
     *
     * @return The name
     */
    String getName() {
        return this.name;
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
     * Gets the object or target name.
     *
     * @return The object name
     */
    String getObjectName() {
        return this.objectName;
    }
}
