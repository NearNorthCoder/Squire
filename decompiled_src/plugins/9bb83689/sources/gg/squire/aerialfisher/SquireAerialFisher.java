package gg.squire.aerialfisher;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.aerialfisher.overlay.AerialFisherInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a.a;
import i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a.b;
import i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a.c;
import i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a.d;
import i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a.e;
import i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a.f;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
@PluginDescriptor(name = "Squire Aerial Fisher", enabledByDefault = false)
/* loaded from: 9bb83689-ff7d-471d-9a08-411d7484ad87.jar:gg/squire/aerialfisher/SquireAerialFisher.class */
public class SquireAerialFisher extends SquirePlugin {
    private static /* synthetic */ int[] lIlIllIllII;
    @Inject
    private /* synthetic */ EventBus c;
    @Inject
    private /* synthetic */ AerialFisherInfoBox d;
    @Inject
    private /* synthetic */ OverlayManager b;
    @Inject
    private /* synthetic */ a a;

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIllIllII[0]];
        clsArr[lIlIllIllII[1]] = e.class;
        clsArr[lIlIllIllII[2]] = c.class;
        clsArr[lIlIllIllII[3]] = d.class;
        clsArr[lIlIllIllII[4]] = f.class;
        clsArr[lIlIllIllII[5]] = b.class;
        return clsArr;
    }

    @Provides
    SquireAerialFisherConfig a(ConfigManager configManager) {
        return (SquireAerialFisherConfig) configManager.getConfig(SquireAerialFisherConfig.class);
    }

    static {
        lIIlIIlllIlIIl();
    }

    protected void onStop() {
        this.c.unregister(this.a);
        this.b.remove(this.d);
        "".length();
    }

    private static void lIIlIIlllIlIIl() {
        lIlIllIllII = new int[6];
        lIlIllIllII[0] = 134 ^ 131;
        lIlIllIllII[1] = ((((57 + 42) - (-11)) + 35) ^ (((158 + 13) - 22) + 46)) & (((85 ^ 13) ^ (90 ^ 80)) ^ (-" ".length()));
        lIlIllIllII[2] = " ".length();
        lIlIllIllII[3] = "  ".length();
        lIlIllIllII[4] = "   ".length();
        lIlIllIllII[5] = (((125 + 81) - 97) + 54) ^ (((62 + 73) - 128) + 160);
    }

    protected void onStart() {
        this.a.a();
        this.c.register(this.a);
        this.b.add(this.d);
        "".length();
    }
}
