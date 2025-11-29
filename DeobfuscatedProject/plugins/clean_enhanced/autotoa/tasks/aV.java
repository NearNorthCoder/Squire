/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

/**
 * Switch mapper for DoingTask enum values.
 * Maps the Task enum ordinals to switch case values for the DoingTask handler.
 */
class DoingTaskSwitchMapper {
    static final int[] taskOrdinalMapping;

    static {
        initializeOrdinalMapping();
        taskOrdinalMapping = new int[Task.values().length];

        try {
            // PILLARS task maps to case 1
            taskOrdinalMapping[Task.PILLARS.ordinal()] = 1;
        } catch (NoSuchFieldError error) {
            // Enum value doesn't exist, skip
        }

        try {
            // VENTS task maps to case 2
            taskOrdinalMapping[Task.VENTS.ordinal()] = 2;
        } catch (NoSuchFieldError error) {
            // Enum value doesn't exist, skip
        }
    }

    private static void initializeOrdinalMapping() {
        // Not used in this simple mapper
    }
}
