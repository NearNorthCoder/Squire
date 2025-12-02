/*
 * Bootstrap configuration stub
 * Original class handles JVM arguments from the Squire API
 * This stub provides defaults for local launching
 */
package net.runelite.launcher.beans;

/**
 * Bootstrap configuration containing JVM arguments and artifact information.
 * This is a simplified version for local launching.
 */
public class Bootstrap {

    private String[] clientJvmArguments;
    private String[] clientJvm9Arguments;
    private String[] clientJvm11Arguments;
    private String[] clientJvm17Arguments;
    private String[] clientJvm17WindowsArguments;
    private String[] clientJvm17MacArguments;
    private Artifact[] artifacts;
    private String minimumLauncherVersion;

    /**
     * Default JVM arguments for running the client
     */
    private static final String[] DEFAULT_JVM_ARGS = {
        "-Xmx512m",
        "-Xms256m",
        "-XX:+UseG1GC",
        "-XX:+UseStringDeduplication"
    };

    /**
     * JVM 17+ module arguments to allow reflective access
     */
    private static final String[] DEFAULT_JVM17_ARGS = {
        "--add-opens=java.base/java.lang=ALL-UNNAMED",
        "--add-opens=java.base/java.lang.reflect=ALL-UNNAMED",
        "--add-opens=java.base/java.util=ALL-UNNAMED",
        "--add-opens=java.base/java.net=ALL-UNNAMED",
        "--add-opens=java.base/java.io=ALL-UNNAMED",
        "--add-opens=java.desktop/java.awt=ALL-UNNAMED",
        "--add-opens=java.desktop/sun.awt=ALL-UNNAMED",
        "-Xmx512m",
        "-Xms256m",
        "-XX:+UseG1GC"
    };

    public Bootstrap() {
        this.clientJvmArguments = DEFAULT_JVM_ARGS;
        this.clientJvm9Arguments = DEFAULT_JVM_ARGS;
        this.clientJvm11Arguments = DEFAULT_JVM_ARGS;
        this.clientJvm17Arguments = DEFAULT_JVM17_ARGS;
        this.clientJvm17WindowsArguments = DEFAULT_JVM17_ARGS;
        this.clientJvm17MacArguments = DEFAULT_JVM17_ARGS;
        this.artifacts = new Artifact[0];
        this.minimumLauncherVersion = "1.0.0";
    }

    public String[] getClientJvmArguments() {
        return clientJvmArguments;
    }

    public void setClientJvmArguments(String[] clientJvmArguments) {
        this.clientJvmArguments = clientJvmArguments;
    }

    public String[] getClientJvm9Arguments() {
        return clientJvm9Arguments;
    }

    public void setClientJvm9Arguments(String[] clientJvm9Arguments) {
        this.clientJvm9Arguments = clientJvm9Arguments;
    }

    public String[] getClientJvm11Arguments() {
        return clientJvm11Arguments;
    }

    public void setClientJvm11Arguments(String[] clientJvm11Arguments) {
        this.clientJvm11Arguments = clientJvm11Arguments;
    }

    public String[] getClientJvm17Arguments() {
        return clientJvm17Arguments;
    }

    public void setClientJvm17Arguments(String[] clientJvm17Arguments) {
        this.clientJvm17Arguments = clientJvm17Arguments;
    }

    public String[] getClientJvm17WindowsArguments() {
        return clientJvm17WindowsArguments;
    }

    public void setClientJvm17WindowsArguments(String[] clientJvm17WindowsArguments) {
        this.clientJvm17WindowsArguments = clientJvm17WindowsArguments;
    }

    public String[] getClientJvm17MacArguments() {
        return clientJvm17MacArguments;
    }

    public void setClientJvm17MacArguments(String[] clientJvm17MacArguments) {
        this.clientJvm17MacArguments = clientJvm17MacArguments;
    }

    public Artifact[] getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(Artifact[] artifacts) {
        this.artifacts = artifacts;
    }

    public String getMinimumLauncherVersion() {
        return minimumLauncherVersion;
    }

    public void setMinimumLauncherVersion(String minimumLauncherVersion) {
        this.minimumLauncherVersion = minimumLauncherVersion;
    }

    // Launcher JVM arguments (separate from client JVM args)
    public String[] getLauncherJvm17Arguments() {
        return clientJvm17Arguments;
    }

    public String[] getLauncherJvm17WindowsArguments() {
        return clientJvm17WindowsArguments;
    }

    public String[] getLauncherJvm17MacArguments() {
        return clientJvm17MacArguments;
    }

    public String[] getLauncherJvm11Arguments() {
        return clientJvm11Arguments;
    }

    public String[] getLauncherJvm11WindowsArguments() {
        return clientJvm11Arguments;
    }

    public String[] getLauncherJvm11MacArguments() {
        return clientJvm11Arguments;
    }

    // Environment variable maps (return null for defaults)
    public java.util.Map<String, String> getLauncherWindowsEnv() {
        return null;
    }

    public java.util.Map<String, String> getLauncherMacEnv() {
        return null;
    }

    public java.util.Map<String, String> getLauncherLinuxEnv() {
        return null;
    }

    /**
     * Creates a default Bootstrap for local launching
     */
    public static Bootstrap createDefault() {
        return new Bootstrap();
    }
}
