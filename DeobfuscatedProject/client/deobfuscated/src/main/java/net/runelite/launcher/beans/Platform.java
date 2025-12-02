/*
 * Platform metadata stub
 */
package net.runelite.launcher.beans;

/**
 * Represents a platform for artifact filtering.
 */
public class Platform {

    private String name;
    private String arch;

    public Platform() {
    }

    public Platform(String name, String arch) {
        this.name = name;
        this.arch = arch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }
}
