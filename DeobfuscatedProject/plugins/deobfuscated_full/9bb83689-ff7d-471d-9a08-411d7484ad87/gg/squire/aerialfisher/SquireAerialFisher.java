/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.aerialfisher;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.aerialfisher.SquireAerialFisherConfig;
import gg.squire.aerialfisher.overlay.AerialFisherInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.a;
import i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.b;
import i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.c;
import i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.d;
import i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.e;
import i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.f;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(name="Squire Aerial Fisher", enabledByDefault=false)
public class SquireAerialFisher
extends SquirePlugin {
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
        Class[] classArray = new Class[lIlIllIllII[0]];
        classArray[SquireAerialFisher.lIlIllIllII[1]] = e.class;
        classArray[SquireAerialFisher.lIlIllIllII[2]] = c.class;
        classArray[SquireAerialFisher.lIlIllIllII[3]] = d.class;
        classArray[SquireAerialFisher.lIlIllIllII[4]] = f.class;
        classArray[SquireAerialFisher.lIlIllIllII[5]] = b.class;
        return classArray;
    }

    @Provides
    SquireAerialFisherConfig a(ConfigManager configManager) {
        return (SquireAerialFisherConfig)configManager.getConfig(SquireAerialFisherConfig.class);
    }

    static {
        SquireAerialFisher.lIIlIIlllIlIIl();
    }

    protected void onStop() {
        this.c.unregister((Object)this.a);
        this.b.remove((Overlay)this.d);
        0;
    }

    private static void lIIlIIlllIlIIl() {
        lIlIllIllII = new int[6];
        SquireAerialFisher.lIlIllIllII[0] = 0x86 ^ 0x83;
        SquireAerialFisher.lIlIllIllII[1] = (57 + 42 - -11 + 35 ^ 158 + 13 - 22 + 46) & (0x55 ^ 0xD ^ (0x5A ^ 0x50) ^ -1);
        SquireAerialFisher.lIlIllIllII[2] = 1;
        SquireAerialFisher.lIlIllIllII[3] = 2;
        SquireAerialFisher.lIlIllIllII[4] = 3;
        SquireAerialFisher.lIlIllIllII[5] = 125 + 81 - 97 + 54 ^ 62 + 73 - 128 + 160;
    }

    protected void onStart() {
        this.a.a();
        this.c.register((Object)this.a);
        this.b.add((Overlay)this.d);
        0;
    }
}

