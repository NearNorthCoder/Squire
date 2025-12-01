package gg.squire.basics.crafting;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.X;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.Y;
import net.runelite.client.plugins.PluginDescriptor;
@SquireUtil
@PluginDescriptor(name = "Squire Glass Maker", enabledByDefault = false, hidden = true)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/crafting/GlassMaker.class */
public class GlassMaker extends SquirePlugin {
    private static /* synthetic */ int[] lIIIllIl;

    static {
        lIIIIllIll();
    }

    protected void onStart() {
    }

    private static void lIIIIllIll() {
        lIIIllIl = new int[3];
        lIIIllIl[0] = "  ".length();
        lIIIllIl[1] = (40 ^ 29) & ((122 ^ 79) ^ (-1));
        lIIIllIl[2] = " ".length();
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIIllIl[0]];
        clsArr[lIIIllIl[1]] = X.class;
        clsArr[lIIIllIl[2]] = Y.class;
        return clsArr;
    }
}
