/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

/**
 * Represents the four main paths in the Tombs of Amascut raid.
 * Each path has a unique boss and puzzle mechanics.
 */
public enum TOAPath {
    CRONDIS("Path of Crondis", 62585),
    SCABARAS("Path of Scabaras", 46475),
    HET("Path of Het", 62583),
    APMEKEN("Path of Apmeken", 62703);

    private final String pathName;
    private final int doorId;

    TOAPath(String pathName, int doorId) {
        this.pathName = pathName;
        this.doorId = doorId;
    }

    /**
     * Gets the display name of this path.
     * @return the path name
     */
    public String getPathName() {
        return this.pathName;
    }

    /**
     * Gets the door object ID for entering this path.
     * @return the door object ID
     */
    public int getDoorId() {
        return this.doorId;
    }
}
