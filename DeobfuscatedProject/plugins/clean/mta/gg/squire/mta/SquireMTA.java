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
import m.u.a.-.e.s.q.t.i.r.a;
import gg.squire.mta.MtaTaskBase;
import gg.squire.mta.GameEnum8;
import gg.squire.mta.EHelper;
import gg.squire.mta.JHelper;
import gg.squire.mta.LHelper;
import gg.squire.mta.MtaManager;
import m.u.a.-.e.s.q.t.i.r.p;
import m.u.a.-.e.s.q.t.i.r.q;
import gg.squire.mta.EnchantmentRoomTask;
import gg.squire.mta.CheckingPointsTask;
import gg.squire.mta.EnablingRunTask;
import gg.squire.mta.EnchantmentRoomTask;
import gg.squire.mta.GraveyardRoomTask;
import gg.squire.mta.TelekineticRoomTask;
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
    private  EventBus d;
    @Inject
    private  InfoBox e;
    @Inject
    private  q k;
    @Inject
    private  l g;
    private  b[] m;
    @Inject
    private  OverlayManager c;
    private final  Map<c, Boolean> b;
    @Inject
    private  MagicArenaConfig j;
    @Inject
    private  e f;
    
    @Inject
    private  n h;
    @Inject
    private  p l;
    @Inject
    private  j i;
    private final  Map<c, Integer> a;

    public SquireMTA() {
        this.a = new EnumMap<c, Integer>(GameEnum8.class);
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
        void var1;
        this.c.remove((Overlay)this.k);

        this.c.remove((Overlay)this.l);

        this.c.remove((Overlay)this.e);

        b[] bArray = this.m;
        int n2 = bArray.length;
        int var2 = lllIllIIlIll[1];
        while (SquireMTA.lIIIllIIllllIlI(var2, (int)var1)) {
            SquireMTA var3;
            void var4;
            void var5 = var4[var2];
            var3.d.unregister((Object)var5);
            ++var2;

            if (3 > 0) continue;
            return;
        }
        this.h.F();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIllIIlIll[0]];
        classArray[SquireMTA.lllIllIIlIll[1]] = EnchantmentRoomTask.class;
        classArray[SquireMTA.lllIllIIlIll[2]] = TelekineticRoomTask.class;
        classArray[SquireMTA.lllIllIIlIll[3]] = EnchantmentRoomTask.class;
        classArray[SquireMTA.lllIllIIlIll[4]] = GraveyardRoomTask.class;
        classArray[SquireMTA.lllIllIIlIll[5]] = EnablingRunTask.class;
        classArray[SquireMTA.lllIllIIlIll[6]] = CheckingPointsTask.class;
        return classArray;
    }

    static {
        SquireMTA.lIIIllIIllllIIl();
    }

    public void a(c c2, int n2) {
        System.out.println("Setting points for " + c2 + " to " + n2);
        this.a.put(c2, n2);

    }

    @Provides
    public MagicArenaConfig a(ConfigManager configManager) {
        return (MagicArenaConfig)configManager.getConfig(MagicArenaConfig.class);
    }

    public int d(c c2) {
        switch (m.u.a.-.e.s.q.t.i.r.a.n[c2.ordinal()]) {
            case 1: {
                SquireMTA var6;
                return var6.j.alchemyPoints();
            }
            case 2: {
                SquireMTA var6;
                return var6.j.graveyardPoints();
            }
            case 3: {
                SquireMTA var6;
                return var6.j.telekineticPoints();
            }
            case 4: {
                SquireMTA var6;
                return var6.j.enchantmentPoints();
            }
        }
        return lllIllIIlIll[7];
    }

    public b[] b() {
        return this.m;
    }

    public void a(c c2) {
        this.b.put(c2, lllIllIIlIll[2]);

    }

    /*
     * WARNING - void declaration
     */
    protected void onStart() {
        void var7;
        this.c.add((Overlay)this.k);

        this.c.add((Overlay)this.l);

        this.c.add((Overlay)this.e);

        b[] bArray = new b[lllIllIIlIll[5]];
        bArray[SquireMTA.lllIllIIlIll[1]] = this.f;
        bArray[SquireMTA.lllIllIIlIll[2]] = this.g;
        bArray[SquireMTA.lllIllIIlIll[3]] = this.h;
        bArray[SquireMTA.lllIllIIlIll[4]] = this.i;
        b[] bArray2 = this.m = bArray;
        int n2 = bArray2.length;
        int var8 = lllIllIIlIll[1];
        while (SquireMTA.lIIIllIIllllIlI(var8, (int)var7)) {
            SquireMTA var9;
            void var10;
            void var11 = var10[var8];
            var9.d.register((Object)var11);
            ++var8;

            return;
        }
    }

    public boolean b(c c2) {
        return this.b.getOrDefault((Object)c2, lllIllIIlIll[1]);
    }
}

