/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.wintertodt;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b_Unknown;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.EnteringWintertodtAreaTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.ChoppingBrumaTreeTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.BurningAtBrazierTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.CreatingRejuvenationPotionsTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.DodgingBrazierTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.DodgingSnowfallDamageTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.DroppingEmptyJugTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.EatingTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.FixingBrazierTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.FletchingLogsTask;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.LightingBrazierTask;
import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.wintertodt.SquireWintertodtConfig;
import gg.squire.wintertodt.overlay.WintertodtInfoBox;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire Wintertodt")
@Singleton
public class SquireWintertodt
extends SquirePlugin {
    @Inject
    private /* synthetic */ WintertodtInfoBox c;
    @Inject
    private /* synthetic */ OverlayManager d;
    @Inject
    private /* synthetic */ b b;
    private static /* synthetic */ int[] lIlIllllllllI;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ int f;
    @Inject
    private /* synthetic */ EventBus e;

    protected void onStop() {
        this.e.unregister((Object)this.b);
        this.d.remove((Overlay)this.c);
        0;
    }

    @Provides
    SquireWintertodtConfig a(ConfigManager configManager) {
        return (SquireWintertodtConfig)configManager.getConfig(SquireWintertodtConfig.class);
    }

    private static void llIIIIlllIIlIll() {
        lIlIllllllllI = new int[12];
        SquireWintertodt.lIlIllllllllI[0] = 0x43 ^ 0x48;
        SquireWintertodt.lIlIllllllllI[1] = (0x11 ^ 0x37) & ~(0x6A ^ 0x4C);
        SquireWintertodt.lIlIllllllllI[2] = 1;
        SquireWintertodt.lIlIllllllllI[3] = 2;
        SquireWintertodt.lIlIllllllllI[4] = 3;
        SquireWintertodt.lIlIllllllllI[5] = 0x95 ^ 0x82 ^ (0x6F ^ 0x7C);
        SquireWintertodt.lIlIllllllllI[6] = 5 + 67 - -37 + 54 ^ 71 + 14 - 82 + 163;
        SquireWintertodt.lIlIllllllllI[7] = 18 + 91 - -12 + 6 ^ (0x64 ^ 0x1D);
        SquireWintertodt.lIlIllllllllI[8] = 0xBA ^ 0xBD;
        SquireWintertodt.lIlIllllllllI[9] = 0x5F ^ 0x57;
        SquireWintertodt.lIlIllllllllI[10] = 0x11 ^ 3 ^ (0x10 ^ 0xB);
        SquireWintertodt.lIlIllllllllI[11] = 0x70 ^ 0x7A;
    }

    public int a() {
        return this.f;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIllllllllI[0]];
        classArray[SquireWintertodt.lIlIllllllllI[1]] = h.class;
        classArray[SquireWintertodt.lIlIllllllllI[2]] = f.class;
        classArray[SquireWintertodt.lIlIllllllllI[3]] = g.class;
        classArray[SquireWintertodt.lIlIllllllllI[4]] = l.class;
        classArray[SquireWintertodt.lIlIllllllllI[5]] = o.class;
        classArray[SquireWintertodt.lIlIllllllllI[6]] = n.class;
        classArray[SquireWintertodt.lIlIllllllllI[7]] = m.class;
        classArray[SquireWintertodt.lIlIllllllllI[8]] = j.class;
        classArray[SquireWintertodt.lIlIllllllllI[9]] = k.class;
        classArray[SquireWintertodt.lIlIllllllllI[10]] = e.class;
        classArray[SquireWintertodt.lIlIllllllllI[11]] = i.class;
        return classArray;
    }

    protected void onStart() {
        this.e.register((Object)this.b);
        this.d.add((Overlay)this.c);
        0;
    }

    static {
        SquireWintertodt.llIIIIlllIIlIll();
        a = LoggerFactory.getLogger(SquireWintertodt.class);
    }
}

