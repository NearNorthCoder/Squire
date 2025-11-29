/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.basics.debug;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SquireUtil
@PluginDescriptor(name="Squire Debug", description="Debugging plugin", tags={"debug", "squire"}, enabledByDefault=false, hidden=true)
public class DebugPlugin
extends SquirePlugin {
    private static /* synthetic */ int[] lIIIIIIII;
    private static final /* synthetic */ Logger cQ;

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIIIIIIII[0]];
    }

    private static void lllIIIIIIl() {
        lIIIIIIII = new int[1];
        DebugPlugin.lIIIIIIII[0] = (0xDA ^ 0x9F) & ~(0xFD ^ 0xB8);
    }

    protected void onStart() {
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }

    static {
        DebugPlugin.lllIIIIIIl();
        cQ = LoggerFactory.getLogger(DebugPlugin.class);
    }
}

