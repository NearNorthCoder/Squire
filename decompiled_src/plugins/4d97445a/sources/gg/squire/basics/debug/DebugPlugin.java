package gg.squire.basics.debug;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SquireUtil
@PluginDescriptor(name = "Squire Debug", description = "Debugging plugin", tags = {"debug", "squire"}, enabledByDefault = false, hidden = true)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/debug/DebugPlugin.class */
public class DebugPlugin extends SquirePlugin {
    private static /* synthetic */ int[] lIIIIIIII;
    private static final /* synthetic */ Logger cQ;

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIIIIIIII[0]];
    }

    private static void lllIIIIIIl() {
        lIIIIIIII = new int[1];
        lIIIIIIII[0] = (218 ^ 159) & ((253 ^ 184) ^ (-1));
    }

    protected void onStart() {
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }

    static {
        lllIIIIIIl();
        cQ = LoggerFactory.getLogger(DebugPlugin.class);
    }
}
