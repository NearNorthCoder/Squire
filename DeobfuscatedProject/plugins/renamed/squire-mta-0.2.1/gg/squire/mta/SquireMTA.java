/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.mta;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.mta.MagicArenaConfig;
import gg.squire.mta.overlay.InfoBox;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import m.u.a.-.e.s.q.t.i.r.a_Unknown;
import m.u.a.-.e.s.q.t.i.r.b;
import m.u.a.-.e.s.q.t.i.r.CEnum;
import m.u.a.-.e.s.q.t.i.r.e_Unknown;
import m.u.a.-.e.s.q.t.i.r.j_Unknown;
import m.u.a.-.e.s.q.t.i.r.l_Unknown;
import m.u.a.-.e.s.q.t.i.r.n_Unknown;
import m.u.a.-.e.s.q.t.i.r.p_Unknown;
import m.u.a.-.e.s.q.t.i.r.q_Unknown;
import m.u.a.-.e.s.q.t.i.r.EnchantmentRoomTask;
import m.u.a.-.e.s.q.t.i.r.CheckingPointsTask;
import m.u.a.-.e.s.q.t.i.r.EnablingRunTask;
import m.u.a.-.e.s.q.t.i.r.EnchantmentRoomTask;
import m.u.a.-.e.s.q.t.i.r.GraveyardRoomTask;
import m.u.a.-.e.s.q.t.i.r.TelekineticRoomTask;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;

@Singleton
@PluginDescriptor(name="Squire Mage Training Arena", description="Automatically completes MTA for nice rewards!", tags={"mta", "magic", "minigame", "overlay"}, enabledByDefault=false)
public class SquireMTA
extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus d;
    @Inject
    private /* synthetic */ InfoBox e;
    @Inject
    private /* synthetic */ q k;
    @Inject
    private /* synthetic */ l g;
    private /* synthetic */ b[] m;
    @Inject
    private /* synthetic */ OverlayManager c;
    private final /* synthetic */ Map<c, Boolean> b;
    @Inject
    private /* synthetic */ MagicArenaConfig j;
    @Inject
    private /* synthetic */ e f;
    private static /* synthetic */ int[] lllIllIIlIll;
    @Inject
    private /* synthetic */ n h;
    @Inject
    private /* synthetic */ p l;
    @Inject
    private /* synthetic */ j i;
    private final /* synthetic */ Map<c, Integer> a;

    public SquireMTA() {
        this.a = new EnumMap<c, Integer>(c.class);
        this.b = new HashMap<c, Boolean>();
    }

    private static boolean lIIIllIIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int c(c c2) {
        return this.a.getOrDefault((Object)c2, lllIllIIlIll[7]);
    }

    public Map<c, Integer> a() {
        return this.a;
    }

    /*
     * WARNING - void declaration
     */
    protected void onStop() {
        void var6;
        this.c.remove((Overlay)this.k);
        0;
        this.c.remove((Overlay)this.l);
        0;
        this.c.remove((Overlay)this.e);
        0;
        b[] bArray = this.m;
        int n2 = bArray.length;
        int var1 = lllIllIIlIll[1];
        while (SquireMTA.lIIIllIIllllIlI(var1, (int)var6)) {
            SquireMTA var10;
            void var8;
            void var5 = var8[var1];
            var10.d.unregister((Object)var5);
            ++var1;
            0;
            if (3 > 0) continue;
            return;
        }
        this.h.F();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIllIIlIll[0]];
        classArray[SquireMTA.lllIllIIlIll[1]] = u.class;
        classArray[SquireMTA.lllIllIIlIll[2]] = x.class;
        classArray[SquireMTA.lllIllIIlIll[3]] = r.class;
        classArray[SquireMTA.lllIllIIlIll[4]] = v.class;
        classArray[SquireMTA.lllIllIIlIll[5]] = t.class;
        classArray[SquireMTA.lllIllIIlIll[6]] = s.class;
        return classArray;
    }

    static {
        SquireMTA.lIIIllIIllllIIl();
    }

    public void a(c c2, int n2) {
        System.out.println("Setting points for " + c2 + " to " + n2);
        this.a.put(c2, n2);
        0;
    }

    @Provides
    public MagicArenaConfig a(ConfigManager configManager) {
        return (MagicArenaConfig)configManager.getConfig(MagicArenaConfig.class);
    }

    public int d(c c2) {
        switch (m.u.a.-.e.s.q.t.i.r.a_Unknown.n[c2.ordinal()]) {
            case 1: {
                SquireMTA var3;
                return var3.j.alchemyPoints();
            }
            case 2: {
                SquireMTA var3;
                return var3.j.graveyardPoints();
            }
            case 3: {
                SquireMTA var3;
                return var3.j.telekineticPoints();
            }
            case 4: {
                SquireMTA var3;
                return var3.j.enchantmentPoints();
            }
        }
        return lllIllIIlIll[7];
    }

    public b[] b() {
        return this.m;
    }

    private static void lIIIllIIllllIIl() {
        lllIllIIlIll = new int[8];
        SquireMTA.lllIllIIlIll[0] = 0x9F ^ 0x99;
        SquireMTA.lllIllIIlIll[1] = (0x13 ^ 0x3F ^ (0xB1 ^ 0x94)) & (0x80 ^ 0xBD ^ (0x80 ^ 0xB4) ^ -1);
        SquireMTA.lllIllIIlIll[2] = 1;
        SquireMTA.lllIllIIlIll[3] = 2;
        SquireMTA.lllIllIIlIll[4] = 3;
        SquireMTA.lllIllIIlIll[5] = 0x74 ^ 0x70;
        SquireMTA.lllIllIIlIll[6] = 0xFD ^ 0xA0 ^ (0x30 ^ 0x68);
        SquireMTA.lllIllIIlIll[7] = -1;
    }

    public void a(c c2) {
        this.b.put(c2, lllIllIIlIll[2]);
        0;
    }

    /*
     * WARNING - void declaration
     */
    protected void onStart() {
        void var2;
        this.c.add((Overlay)this.k);
        0;
        this.c.add((Overlay)this.l);
        0;
        this.c.add((Overlay)this.e);
        0;
        b[] bArray = new b[lllIllIIlIll[5]];
        bArray[SquireMTA.lllIllIIlIll[1]] = this.f;
        bArray[SquireMTA.lllIllIIlIll[2]] = this.g;
        bArray[SquireMTA.lllIllIIlIll[3]] = this.h;
        bArray[SquireMTA.lllIllIIlIll[4]] = this.i;
        b[] bArray2 = this.m = bArray;
        int n2 = bArray2.length;
        int var4 = lllIllIIlIll[1];
        while (SquireMTA.lIIIllIIllllIlI(var4, (int)var2)) {
            SquireMTA var7;
            void var11;
            void var9 = var11[var4];
            var7.d.register((Object)var9);
            ++var4;
            0;
            
            return;
        }
    }

    public boolean b(c c2) {
        return this.b.getOrDefault((Object)c2, lllIllIIlIll[1]);
    }
}

