/*
 * Stub class for RuneLite Bootstrap configuration
 * This provides the minimal interface needed by Squire launcher
 */
package net.runelite.launcher.beans;

import java.util.Map;

/**
 * Bootstrap configuration for the RuneLite launcher.
 * Contains JVM arguments and environment variables for different platforms and Java versions.
 */
public class Bootstrap {

    // ==================== JVM 17 Arguments ====================

    private String[] clientJvm17Arguments;
    private String[] clientJvm17WindowsArguments;
    private String[] clientJvm17MacArguments;

    private String[] launcherJvm17Arguments;
    private String[] launcherJvm17WindowsArguments;
    private String[] launcherJvm17MacArguments;

    // ==================== JVM 11 Arguments ====================

    private String[] launcherJvm11Arguments;
    private String[] launcherJvm11WindowsArguments;
    private String[] launcherJvm11MacArguments;

    // ==================== JVM 9 Arguments (Legacy) ====================

    private String[] clientJvm9Arguments;

    // ==================== Environment Variables ====================

    private Map<String, String> launcherWindowsEnv;
    private Map<String, String> launcherMacEnv;
    private Map<String, String> launcherLinuxEnv;

    // ==================== Getters ====================

    public String[] getClientJvm17Arguments() {
        return clientJvm17Arguments;
    }

    public String[] getClientJvm17WindowsArguments() {
        return clientJvm17WindowsArguments;
    }

    public String[] getClientJvm17MacArguments() {
        return clientJvm17MacArguments;
    }

    public String[] getLauncherJvm17Arguments() {
        return launcherJvm17Arguments;
    }

    public String[] getLauncherJvm17WindowsArguments() {
        return launcherJvm17WindowsArguments;
    }

    public String[] getLauncherJvm17MacArguments() {
        return launcherJvm17MacArguments;
    }

    public String[] getLauncherJvm11Arguments() {
        return launcherJvm11Arguments;
    }

    public String[] getLauncherJvm11WindowsArguments() {
        return launcherJvm11WindowsArguments;
    }

    public String[] getLauncherJvm11MacArguments() {
        return launcherJvm11MacArguments;
    }

    public String[] getClientJvm9Arguments() {
        return clientJvm9Arguments;
    }

    public Map<String, String> getLauncherWindowsEnv() {
        return launcherWindowsEnv;
    }

    public Map<String, String> getLauncherMacEnv() {
        return launcherMacEnv;
    }

    public Map<String, String> getLauncherLinuxEnv() {
        return launcherLinuxEnv;
    }

    // ==================== Setters ====================

    public void setClientJvm17Arguments(String[] args) {
        this.clientJvm17Arguments = args;
    }

    public void setClientJvm17WindowsArguments(String[] args) {
        this.clientJvm17WindowsArguments = args;
    }

    public void setClientJvm17MacArguments(String[] args) {
        this.clientJvm17MacArguments = args;
    }

    public void setLauncherJvm17Arguments(String[] args) {
        this.launcherJvm17Arguments = args;
    }

    public void setLauncherJvm17WindowsArguments(String[] args) {
        this.launcherJvm17WindowsArguments = args;
    }

    public void setLauncherJvm17MacArguments(String[] args) {
        this.launcherJvm17MacArguments = args;
    }

    public void setLauncherJvm11Arguments(String[] args) {
        this.launcherJvm11Arguments = args;
    }

    public void setLauncherJvm11WindowsArguments(String[] args) {
        this.launcherJvm11WindowsArguments = args;
    }

    public void setLauncherJvm11MacArguments(String[] args) {
        this.launcherJvm11MacArguments = args;
    }

    public void setClientJvm9Arguments(String[] args) {
        this.clientJvm9Arguments = args;
    }

    public void setLauncherWindowsEnv(Map<String, String> env) {
        this.launcherWindowsEnv = env;
    }

    public void setLauncherMacEnv(Map<String, String> env) {
        this.launcherMacEnv = env;
    }

    public void setLauncherLinuxEnv(Map<String, String> env) {
        this.launcherLinuxEnv = env;
    }
}
