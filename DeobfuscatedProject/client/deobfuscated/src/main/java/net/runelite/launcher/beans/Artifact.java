/*
 * Artifact metadata stub
 * Original class represents a downloadable JAR from S3
 * This stub provides minimal functionality for local launching
 */
package net.runelite.launcher.beans;

/**
 * Represents an artifact (JAR file) in the client distribution.
 */
public class Artifact {

    private String name;
    private String path;
    private String hash;
    private int size;
    private Platform[] platform;
    private Diff[] diffs;

    public Artifact() {
    }

    public Artifact(String name, String path, String hash, int size) {
        this.name = name;
        this.path = path;
        this.hash = hash;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Platform[] getPlatform() {
        return platform;
    }

    public void setPlatform(Platform[] platform) {
        this.platform = platform;
    }

    public Diff[] getDiffs() {
        return diffs;
    }

    public void setDiffs(Diff[] diffs) {
        this.diffs = diffs;
    }

    @Override
    public String toString() {
        return "Artifact{name='" + name + "', size=" + size + "}";
    }
}
