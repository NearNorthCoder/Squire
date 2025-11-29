/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.NPC
 *  net.runelite.api.events.SoundEffectPlayed
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.toa;

import gg.squire.toa.PreventingLogoutTask;
import gg.squire.toa.GearSwappingForAkkhaTask;
import gg.squire.toa.HandlingAkkhaPrayersTask;
import gg.squire.toa.SwappingForObeliskTask;
import gg.squire.toa.HandlingObeliskPrayersTask;
import gg.squire.toa.HandlingWardenPrayersTask;
import gg.squire.toa.WardenGearSwappingTask;
import gg.squire.toa.HandlingElidinisP3PrayersTask;
import gg.squire.toa.HandlingTumekenP3PrayersTask;
import gg.squire.toa.GearSwappingBabaTask;
import gg.squire.toa.HandlingBabaPrayersTask;
import gg.squire.toa.SwappingGearForBabboonsTask;
import gg.squire.toa.HandlingBabboonPrayersTask;
import gg.squire.toa.KephriGearSwappingTask;
import gg.squire.toa.HandlingKephriPrayersTask;
import gg.squire.toa.GearSwappingZebakTask;
import gg.squire.toa.HandlingZebakPrayersTask;
import gg.squire.toa.ToaManager;
import gg.squire.toa.ToaManager;
import gg.squire.toa.ToaManager;
import gg.squire.toa.ToaManager;
import gg.squire.toa.QHelper;
import gg.squire.toa.RHelper;
import gg.squire.toa.ToaManager;
import gg.squire.toa.THelper;
import gg.squire.toa.UHelper;
import gg.squire.toa.VHelper;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.toa.TOAConfig;
import gg.squire.toa.overlay.debug.DebugOverlay;
import java.util.Set;
import java.util.function.Predicate;
import net.runelite.api.NPC;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.managers.interaction.InteractionManager;

@SquireUtil
@PluginDescriptor(name="Squire TOA", description="Different helpers/automation for TOA", enabledByDefault=false)
public class SquireTOA
extends SquirePlugin {
    @Inject
    private  EventBus h;
    @Inject
    private  u j;
    @Inject
    private  f f;
    
    @Inject
    private  OverlayManager i;
    @Inject
    private  ConfigManager b;
    @Inject
    private  q k;
    @Inject
    private  r n;
    @Inject
    private  h d;
    @Inject
    private  e g;
    @Inject
    private  s o;
    @Inject
    private  t m;
    @Inject
    private  j e;
    @Inject
    private  TOAConfig c;
    @Inject
    private  DebugOverlay p;
    private static final  Set<Integer> a;
    @Inject
    private  v l;

    @Provides
    TOAConfig a(ConfigManager configManager) {
        return (TOAConfig)configManager.getConfig(TOAConfig.class);
    }

    public boolean a(Predicate<NPC> predicate) {
        int n2;
        NPC nPC2 = this.b();
        if (SquireTOA.var2(nPC2) && SquireTOA.var3(predicate.and(nPC -> {
            boolean bl;
            if (SquireTOA.var4(nPC.isDead() ? 1 : 0)) {
                bl = var1[2];
                0;
                if ((0x65 ^ 0x61) <= 2) {
                    return ((0x58 ^ 0x6E) & ~(0x33 ^ 5)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }).test(nPC2) ? 1 : 0)) {
            n2 = var1[2];
            0;
            if (((0xB ^ 0x2A) & ~(0x8D ^ 0xAC)) != 0) {
                return ((0xE4 ^ 0xB0) & ~(0x61 ^ 0x35)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        return n2 != 0;
    }

    protected void onStart() {
        try {
            SquireTOA var5;
            var5.d.c();
            var5.g.c();
            var5.e.c();
            var5.h.register((Object)var5.d);
            var5.h.register((Object)var5.e);
            var5.h.register((Object)var5.f);
            var5.h.register((Object)var5.g);
            var5.i.add((Overlay)var5.j);
            0;
            var5.i.add((Overlay)var5.k);
            0;
            var5.i.add((Overlay)var5.l);
            0;
            var5.i.add((Overlay)var5.m);
            0;
            var5.i.add((Overlay)var5.n);
            0;
            var5.i.add((Overlay)var5.o);
            0;
            var5.i.add((Overlay)var5.p);
            0;
            InteractionManager.setHelper((boolean)var1[2]);
            0;
        }
        catch (Exception var6) {
            var6.printStackTrace();
        }
        if (-2 >= 0) {
            return;
        }
    }

    static {
        SquireTOA.var7();
        Object[] objectArray = new Integer[var1[25]];
        objectArray[SquireTOA.var1[1]] = var1[26];
        objectArray[SquireTOA.var1[2]] = var1[27];
        objectArray[SquireTOA.var1[3]] = var1[28];
        objectArray[SquireTOA.var1[4]] = var1[29];
        objectArray[SquireTOA.var1[5]] = var1[30];
        objectArray[SquireTOA.var1[6]] = var1[31];
        objectArray[SquireTOA.var1[7]] = var1[32];
        objectArray[SquireTOA.var1[8]] = var1[33];
        objectArray[SquireTOA.var1[9]] = var1[34];
        objectArray[SquireTOA.var1[10]] = var1[35];
        objectArray[SquireTOA.var1[11]] = var1[36];
        objectArray[SquireTOA.var1[12]] = var1[37];
        objectArray[SquireTOA.var1[13]] = var1[38];
        objectArray[SquireTOA.var1[14]] = var1[39];
        objectArray[SquireTOA.var1[15]] = var1[40];
        objectArray[SquireTOA.var1[16]] = var1[41];
        objectArray[SquireTOA.var1[17]] = var1[42];
        objectArray[SquireTOA.var1[0]] = var1[43];
        objectArray[SquireTOA.var1[44]] = var1[45];
        objectArray[SquireTOA.var1[46]] = var1[47];
        objectArray[SquireTOA.var1[48]] = var1[49];
        a = ImmutableSet.of((Object)var1[19], (Object)var1[20], (Object)var1[21], (Object)var1[22], (Object)var1[23], (Object)var1[24], (Object[])objectArray);
    }

    public boolean a(int ... nArray) {
        return this.a((NPC nPC) -> {
            void var8;
            int[] nArray2 = nArray;
            int n2 = nArray2.length;
            int var9 = var1[1];
            while (SquireTOA.var10(var9, (int)var8)) {
                void var11;
                void var12;
                void var13 = var12[var9];
                if (SquireTOA.var14((int)var13, var11.getId())) {
                    return var1[2];
                }
                ++var9;
                0;
                if (2 == 2) continue;
                return ((0x2F ^ 0x7E) & ~(0x76 ^ 0x27)) != 0;
            }
            return var1[1];
        });
    }

    public int a() {
        return Vars.getVarp((int)var1[18]);
    }

    @Subscribe
    public void a(SoundEffectPlayed soundEffectPlayed) {
        if (SquireTOA.var3(a.contains(soundEffectPlayed.getSoundId()) ? 1 : 0)) {
            soundEffectPlayed.consume();
        }
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

    protected void onStop() {
        this.h.unregister((Object)this.d);
        this.h.unregister((Object)this.e);
        this.h.unregister((Object)this.f);
        this.h.unregister((Object)this.g);
        this.i.remove((Overlay)this.j);
        0;
        this.i.remove((Overlay)this.k);
        0;
        this.i.remove((Overlay)this.l);
        0;
        this.i.remove((Overlay)this.m);
        0;
        this.i.remove((Overlay)this.n);
        0;
        this.i.remove((Overlay)this.o);
        0;
        this.i.remove((Overlay)this.p);
        0;
        InteractionManager.setHelper((boolean)var1[1]);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public NPC b() {
        int[] nArray = new int[var1[2]];
        nArray[SquireTOA.var1[1]] = this.a();
        return NPCs.getNearest((int[])nArray);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireTOA.var1[1]] = HandlingZebakPrayersTask.class;
        classArray[SquireTOA.var1[2]] = GearSwappingZebakTask.class;
        classArray[SquireTOA.var1[3]] = SwappingGearForBabboonsTask.class;
        classArray[SquireTOA.var1[4]] = HandlingBabboonPrayersTask.class;
        classArray[SquireTOA.var1[5]] = GearSwappingForAkkhaTask.class;
        classArray[SquireTOA.var1[6]] = HandlingAkkhaPrayersTask.class;
        classArray[SquireTOA.var1[7]] = HandlingKephriPrayersTask.class;
        classArray[SquireTOA.var1[8]] = KephriGearSwappingTask.class;
        classArray[SquireTOA.var1[9]] = HandlingBabaPrayersTask.class;
        classArray[SquireTOA.var1[10]] = GearSwappingBabaTask.class;
        classArray[SquireTOA.var1[11]] = HandlingObeliskPrayersTask.class;
        classArray[SquireTOA.var1[12]] = SwappingForObeliskTask.class;
        classArray[SquireTOA.var1[13]] = HandlingWardenPrayersTask.class;
        classArray[SquireTOA.var1[14]] = WardenGearSwappingTask.class;
        classArray[SquireTOA.var1[15]] = HandlingElidinisP3PrayersTask.class;
        classArray[SquireTOA.var1[16]] = HandlingTumekenP3PrayersTask.class;
        classArray[SquireTOA.var1[17]] = PreventingLogoutTask.class;
        return classArray;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    private static void var7() {
        var1 = new int[50];
        SquireTOA.var1[0] = 0x1A ^ 0xB;
        SquireTOA.var1[1] = (0x48 ^ 0x1C) & ~(7 ^ 0x53);
        SquireTOA.var1[2] = 1;
        SquireTOA.var1[3] = 2;
        SquireTOA.var1[4] = 3;
        SquireTOA.var1[5] = 8 ^ 0xC;
        SquireTOA.var1[6] = 17 + 74 - 84 + 144 ^ 116 + 96 - 109 + 43;
        SquireTOA.var1[7] = 0x48 ^ 0x4E;
        SquireTOA.var1[8] = 0xEE ^ 0x9E ^ (0x63 ^ 0x14);
        SquireTOA.var1[9] = 0xD3 ^ 0x98 ^ (0xC8 ^ 0x8B);
        SquireTOA.var1[10] = 0xD ^ 0x2F ^ (0x97 ^ 0xBC);
        SquireTOA.var1[11] = 45 + 55 - 10 + 65 ^ 130 + 90 - 137 + 62;
        SquireTOA.var1[12] = 72 + 86 - 72 + 47 ^ 136 + 78 - 139 + 67;
        SquireTOA.var1[13] = 0x97 ^ 0x9D ^ (0x43 ^ 0x45);
        SquireTOA.var1[14] = 0x6A ^ 0x67;
        SquireTOA.var1[15] = 0x41 ^ 0x4F;
        SquireTOA.var1[16] = 0x29 ^ 0x26;
        SquireTOA.var1[17] = 0x7A ^ 0xB ^ (0xE0 ^ 0x81);
        SquireTOA.var1[18] = -(0xFFFFEB65 & 0x5CBB) & (0xFFFFEFFF & 0x5EB3);
        SquireTOA.var1[19] = 0xFFFFFAB6 & 0xFCB;
        SquireTOA.var1[20] = 0xFFFFCB81 & 0x3EFE;
        SquireTOA.var1[21] = 0xFFFFDFFE & 0x2A69;
        SquireTOA.var1[22] = 0xFFFFFF7D & 0xAFF;
        SquireTOA.var1[23] = -(0xFFFFF5F7 & 0x5F99) & (0xFFFFDFFF & 0x7FFE);
        SquireTOA.var1[24] = 0xFFFFFEFE & 0xB7D;
        SquireTOA.var1[25] = 0x4C ^ 5 ^ (0x48 ^ 0x14);
        SquireTOA.var1[26] = -(0xFFFFD235 & 0x3DFB) & (0xFFFF9AB5 & 0x7FFB);
        SquireTOA.var1[27] = 0xFFFFBE66 & 0x4BFF;
        SquireTOA.var1[28] = 0xFFFFBFF7 & 0x4A7F;
        SquireTOA.var1[29] = -(0xFFFFF9AE & 0x67DB) & (0xFFFFFBFF & 0x6FFF);
        SquireTOA.var1[30] = -1 & (0xFFFFAFFE & 0x57BF);
        SquireTOA.var1[31] = -(0xFFFFC5D3 & 0x7F2D) & (0xFFFFCFFF & 0x7F6A);
        SquireTOA.var1[32] = 0xFFFFCBFE & 0x3E6D;
        SquireTOA.var1[33] = 0xFFFFBFFF & 0x4A7F;
        SquireTOA.var1[34] = -(0xFFFFFD7D & 0x77FB) & (0xFFFFFFFB & Short.MAX_VALUE);
        SquireTOA.var1[35] = -(0xFFFFE7BD & 0x7DD3) & (0xFFFFFFFB & 0x6FFF);
        SquireTOA.var1[36] = -(0xFFFFFFDF & 0x75AD) & (0xFFFFFFFF & Short.MAX_VALUE);
        SquireTOA.var1[37] = 0xFFFFCBFD & 0x3E77;
        SquireTOA.var1[38] = -(0xFFFFCFCB & 0x75B6) & (0xFFFFCFFF & 0x7FF5);
        SquireTOA.var1[39] = -(0xFFFFF1BF & 0x5EC7) & (0xFFFFDBFF & 0x7EEF);
        SquireTOA.var1[40] = -(0xFFFFD79F & 0x68F3) & (0xFFFFEFFF & 0x5AFF);
        SquireTOA.var1[41] = 0xFFFFAE7A & 0x5BFF;
        SquireTOA.var1[42] = -(0xFFFFD5FF & 0x7E07) & (0xFFFFDFFF & 0x7E7E);
        SquireTOA.var1[43] = 0xFFFFABFF & 0x5E7E;
        SquireTOA.var1[44] = 150 + 149 - 256 + 135 ^ 142 + 72 - 180 + 126;
        SquireTOA.var1[45] = -(0xFFFFBBA5 & 0x745F) & (0xFFFFFEF7 & 0x3FFE);
        SquireTOA.var1[46] = 0x38 ^ 0x2B;
        SquireTOA.var1[47] = 0xFFFF8FF3 & 0x7EFD;
        SquireTOA.var1[48] = 0x41 ^ 0x55;
        SquireTOA.var1[49] = -(0xFFFFF7BD & 0x7DC3) & (0xFFFFFFF7 & 0x7FEF);
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }
}

