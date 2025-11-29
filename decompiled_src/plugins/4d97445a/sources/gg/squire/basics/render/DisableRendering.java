package gg.squire.basics.render;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0052by;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.client.plugins.PluginDescriptor;
@SquireUtil
@PluginDescriptor(name = "Squire Rendering Disabler", description = "Helps with running your client", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/render/DisableRendering.class */
public class DisableRendering extends SquirePlugin {
    private static /* synthetic */ int[] lIllIllII;
    @Inject
    private /* synthetic */ Client v;

    protected void onStop() {
        this.v.setDrawCallbacks((DrawCallbacks) null);
    }

    protected void onStart() {
        if (lIIllllIlll(this.v)) {
            this.v.setDrawCallbacks(new C0052by());
        }
    }

    private static boolean lIIllllIlll(Object obj) {
        return obj != null;
    }

    private static void lIIllllIllI() {
        lIllIllII = new int[1];
        lIllIllII[0] = (0 ^ 71) & ((218 ^ 157) ^ (-1));
    }

    protected Class<?>[] tasks() {
        return new Class[lIllIllII[0]];
    }

    static {
        lIIllllIllI();
    }
}
