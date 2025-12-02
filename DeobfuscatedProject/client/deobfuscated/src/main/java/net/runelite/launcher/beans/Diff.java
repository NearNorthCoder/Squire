/*
 * Diff metadata stub
 */
package net.runelite.launcher.beans;

/**
 * Represents a diff/patch for incremental updates.
 */
public class Diff {

    private String from;
    private String fromHash;
    private String hash;
    private String path;
    private int size;

    public Diff() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFromHash() {
        return fromHash;
    }

    public void setFromHash(String fromHash) {
        this.fromHash = fromHash;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
