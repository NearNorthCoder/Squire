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
import gg.squire.mta.AHelper;
import gg.squire.mta.MtaTaskBase;
import gg.squire.mta.GameEnum2;
import gg.squire.mta.MtaManager;
import gg.squire.mta.MtaEventHandler;
import gg.squire.mta.MtaManager;
import gg.squire.mta.MtaManager;
import gg.squire.mta.PHelper;
import gg.squire.mta.QHelper;
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
        this.a = new EnumMap<c, Integer>(GameEnum2.class);
        this.b = new HashMap<c, Boolean>();
    }

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    public int c(c c2) {
        return this.a.getOrDefault((Object)c2, var1[7]);
    }

    public Map<c, Integer> a() {
        return this.a;
    }

    /*
     * WARNING - void declaration
     */
    protected void onStop() {
        void var3;
        this.c.remove((Overlay)this.k);
        0;
        this.c.remove((Overlay)this.l);
        0;
        this.c.remove((Overlay)this.e);
        0;
        b[] bArray = this.m;
        int n2 = bArray.length;
        int var4 = var1[1];
        while (SquireMTA.var2(var4, (int)var3)) {
            SquireMTA var5;
            void var6;
            void var7 = var6[var4];
            var5.d.unregister((Object)var7);
            ++var4;
            0;
            if (3 > 0) continue;
            return;
        }
        this.h.F();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireMTA.var1[1]] = EnchantmentRoomTask.class;
        classArray[SquireMTA.var1[2]] = TelekineticRoomTask.class;
        classArray[SquireMTA.var1[3]] = EnchantmentRoomTask.class;
        classArray[SquireMTA.var1[4]] = GraveyardRoomTask.class;
        classArray[SquireMTA.var1[5]] = EnablingRunTask.class;
        classArray[SquireMTA.var1[6]] = CheckingPointsTask.class;
        return classArray;
    }

    static {
        SquireMTA.var8();
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
        switch (m.u.a.-.e.s.q.t.i.r.a.n[c2.ordinal()]) {
            case 1: {
                SquireMTA var9;
                return var9.j.alchemyPoints();
            }
            case 2: {
                SquireMTA var9;
                return var9.j.graveyardPoints();
            }
            case 3: {
                SquireMTA var9;
                return var9.j.telekineticPoints();
            }
            case 4: {
                SquireMTA var9;
                return var9.j.enchantmentPoints();
            }
        }
        return var1[7];
    }

    public b[] b() {
        return this.m;
    }

    private static void var8() {
        var1 = new int[8];
        SquireMTA.var1[0] = 0x9F ^ 0x99;
        SquireMTA.var1[1] = (0x13 ^ 0x3F ^ (0xB1 ^ 0x94)) & (0x80 ^ 0xBD ^ (0x80 ^ 0xB4) ^ -1);
        SquireMTA.var1[2] = 1;
        SquireMTA.var1[3] = 2;
        SquireMTA.var1[4] = 3;
        SquireMTA.var1[5] = 0x74 ^ 0x70;
        SquireMTA.var1[6] = 0xFD ^ 0xA0 ^ (0x30 ^ 0x68);
        SquireMTA.var1[7] = -1;
    }

    public void a(c c2) {
        this.b.put(c2, var1[2]);
        0;
    }

    /*
     * WARNING - void declaration
     */
    protected void onStart() {
        void var10;
        this.c.add((Overlay)this.k);
        0;
        this.c.add((Overlay)this.l);
        0;
        this.c.add((Overlay)this.e);
        0;
        b[] bArray = new b[var1[5]];
        bArray[SquireMTA.var1[1]] = this.f;
        bArray[SquireMTA.var1[2]] = this.g;
        bArray[SquireMTA.var1[3]] = this.h;
        bArray[SquireMTA.var1[4]] = this.i;
        b[] bArray2 = this.m = bArray;
        int n2 = bArray2.length;
        int var11 = var1[1];
        while (SquireMTA.var2(var11, (int)var10)) {
            SquireMTA var12;
            void var13;
            void var14 = var13[var11];
            var12.d.register((Object)var14);
            ++var11;
            0;
            if null == null continue;
            return;
        }
    }

    public boolean b(c c2) {
        return this.b.getOrDefault((Object)c2, var1[1]);
    }
}

