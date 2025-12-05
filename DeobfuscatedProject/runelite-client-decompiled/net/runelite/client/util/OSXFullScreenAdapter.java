/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.apple.eawt.FullScreenAdapter
 *  com.apple.eawt.FullScreenListener
 *  com.apple.eawt.FullScreenUtilities
 *  com.apple.eawt.event.FullScreenEvent
 */
package net.runelite.client.util;

import com.apple.eawt.FullScreenAdapter;
import com.apple.eawt.FullScreenListener;
import com.apple.eawt.FullScreenUtilities;
import com.apple.eawt.event.FullScreenEvent;
import java.awt.Frame;
import java.awt.Window;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class OSXFullScreenAdapter
extends FullScreenAdapter {
    private static final Logger log = LoggerFactory.getLogger(OSXFullScreenAdapter.class);
    private final Frame frame;

    public void windowEnteredFullScreen(FullScreenEvent e) {
        log.debug("Window entered fullscreen mode--setting extended state to {}", (Object)6);
        this.frame.setExtendedState(6);
    }

    public void windowExitedFullScreen(FullScreenEvent e) {
        log.debug("Window exited fullscreen mode--setting extended state to {}", (Object)0);
        this.frame.setExtendedState(0);
    }

    public static void install(Frame frame) {
        FullScreenUtilities.addFullScreenListenerTo((Window)frame, (FullScreenListener)new OSXFullScreenAdapter(frame));
    }

    public OSXFullScreenAdapter(Frame frame) {
        this.frame = frame;
    }
}

