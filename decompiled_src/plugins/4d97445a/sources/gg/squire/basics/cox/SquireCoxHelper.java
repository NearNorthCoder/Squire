package gg.squire.basics.cox;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.client.plugins.PluginDescriptor;
@PluginDescriptor(name = "Squire COX Helper", enabledByDefault = false, hidden = true)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/cox/SquireCoxHelper.class */
public class SquireCoxHelper extends SquirePlugin {
    private static /* synthetic */ int[] lIIlllIIl;

    static {
        lIIIlIIlIII();
    }

    protected void onStop() {
    }

    private static void lIIIlIIlIII() {
        lIIlllIIl = new int[1];
        lIIlllIIl[0] = (59 ^ 1) & ((107 ^ 81) ^ (-1));
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIIlllIIl[0]];
    }
}
