/*
 * Deobfuscated from: c/r/m/n.java
 * Original class name: n
 * Purpose: Hardware acceleration mode enumeration with JVM arguments
 */
package squire.launcher.config;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Enumeration of hardware acceleration modes for graphics rendering.
 * Each mode provides platform-specific JVM arguments for optimal rendering.
 */
public enum HardwareAccelerationMode {

    /**
     * Software rendering - no hardware acceleration
     */
    OFF,

    /**
     * DirectDraw acceleration (Windows only)
     */
    DIRECTDRAW,

    /**
     * OpenGL acceleration (cross-platform)
     */
    OPENGL,

    /**
     * Metal acceleration (macOS only)
     */
    METAL;

    private static final Logger log = LoggerFactory.getLogger(HardwareAccelerationMode.class);

    /**
     * Gets the JVM arguments needed for this acceleration mode on the given OS.
     *
     * @param osType The operating system type
     * @return List of JVM arguments for this mode
     * @throws IllegalArgumentException if the mode is not supported on the OS
     */
    public List<String> getJvmArguments(OSType osType) {
        List<String> args = new ArrayList<>();

        switch (this) {
            case DIRECTDRAW:
                if (osType != OSType.Windows) {
                    throw new IllegalArgumentException("DirectDraw is only available on Windows");
                }
                args.add("-Dsun.java2d.noddraw=false");
                args.add("-Dsun.java2d.ddscale=true");
                break;

            case OPENGL:
                if (osType == OSType.Windows) {
                    args.add("-Dsun.java2d.noddraw=true");
                } else if (osType == OSType.MacOS) {
                    args.add("-Dsun.java2d.metal=false");
                }
                args.add("-Dsun.java2d.opengl=true");
                break;

            case METAL:
                if (osType != OSType.MacOS) {
                    throw new IllegalArgumentException("Metal is only available on macOS");
                }
                args.add("-Dsun.java2d.metal=true");
                break;

            case OFF:
            default:
                // No specific arguments for software rendering
                break;
        }

        return args;
    }
}
