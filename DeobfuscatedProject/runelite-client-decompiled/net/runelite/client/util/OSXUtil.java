/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.apple.eawt.Application
 *  com.apple.eawt.FullScreenUtilities
 */
package net.runelite.client.util;

import com.apple.eawt.Application;
import com.apple.eawt.FullScreenUtilities;
import java.awt.Window;
import javax.swing.JFrame;
import net.runelite.client.util.OSType;
import net.runelite.client.util.OSXFullScreenAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OSXUtil {
    private static final Logger log = LoggerFactory.getLogger(OSXUtil.class);

    public static void tryEnableFullscreen(JFrame gui) {
        if (OSType.getOSType() == OSType.MacOS) {
            OSXFullScreenAdapter.install(gui);
            FullScreenUtilities.setWindowCanFullScreen((Window)gui, (boolean)true);
            log.debug("Enabled fullscreen on macOS");
        }
    }

    public static void requestUserAttention() {
        Application app = Application.getApplication();
        app.requestUserAttention(true);
        log.debug("Requested user attention on macOS");
    }

    public static void requestForeground() {
        Application app = Application.getApplication();
        app.requestForeground(true);
        log.debug("Forced focus on macOS");
    }
}

