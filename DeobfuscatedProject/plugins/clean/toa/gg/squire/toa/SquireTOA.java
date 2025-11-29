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
import -.r.u.q.e.s.o.t.a.i.q;
import gg.squire.toa.RHelper;
import gg.squire.toa.SHelper;
import -.r.u.q.e.s.o.t.a.i.t;
import -.r.u.q.e.s.o.t.a.i.u;
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
        if (SquireTOA.lIllIlIllIIIllI(nPC2) && SquireTOA.lIllIlIllIIIlIl(predicate.and(nPC -> {
            boolean bl;
            if (SquireTOA.lIllIlIllIIlIIl(nPC.isDead() ? 1 : 0)) {
                bl = lIIllllllllII[2];

                if ((0x65 ^ 0x61) <= 2) {
                    return false;
                }
            } else {
                bl = lIIllllllllII[1];
            }
            return bl;
        }).test(nPC2) ? 1 : 0)) {
            n2 = lIIllllllllII[2];

            if (((0xB ^ 0x2A) & ~(0x8D ^ 0xAC)) != 0) {
                return false;
            }
        } else {
            n2 = lIIllllllllII[1];
        }
        return n2 != 0;
    }

    protected void onStart() {
        try {
            SquireTOA var1;
            var1.d.c();
            var1.g.c();
            var1.e.c();
            var1.h.register((Object)var1.d);
            var1.h.register((Object)var1.e);
            var1.h.register((Object)var1.f);
            var1.h.register((Object)var1.g);
            var1.i.add((Overlay)var1.j);

            var1.i.add((Overlay)var1.k);

            var1.i.add((Overlay)var1.l);

            var1.i.add((Overlay)var1.m);

            var1.i.add((Overlay)var1.n);

            var1.i.add((Overlay)var1.o);

            var1.i.add((Overlay)var1.p);

            InteractionManager.setHelper((boolean)lIIllllllllII[2]);

        }
        catch (Exception var2) {
            var2.printStackTrace();
        }
        
    }

    static {
        SquireTOA.lIllIlIllIIIlII();
        Object[] objectArray = new Integer[lIIllllllllII[25]];
        objectArray[SquireTOA.lIIllllllllII[1]] = lIIllllllllII[26];
        objectArray[SquireTOA.lIIllllllllII[2]] = lIIllllllllII[27];
        objectArray[SquireTOA.lIIllllllllII[3]] = lIIllllllllII[28];
        objectArray[SquireTOA.lIIllllllllII[4]] = lIIllllllllII[29];
        objectArray[SquireTOA.lIIllllllllII[5]] = lIIllllllllII[30];
        objectArray[SquireTOA.lIIllllllllII[6]] = lIIllllllllII[31];
        objectArray[SquireTOA.lIIllllllllII[7]] = lIIllllllllII[32];
        objectArray[SquireTOA.lIIllllllllII[8]] = lIIllllllllII[33];
        objectArray[SquireTOA.lIIllllllllII[9]] = lIIllllllllII[34];
        objectArray[SquireTOA.lIIllllllllII[10]] = lIIllllllllII[35];
        objectArray[SquireTOA.lIIllllllllII[11]] = lIIllllllllII[36];
        objectArray[SquireTOA.lIIllllllllII[12]] = lIIllllllllII[37];
        objectArray[SquireTOA.lIIllllllllII[13]] = lIIllllllllII[38];
        objectArray[SquireTOA.lIIllllllllII[14]] = lIIllllllllII[39];
        objectArray[SquireTOA.lIIllllllllII[15]] = lIIllllllllII[40];
        objectArray[SquireTOA.lIIllllllllII[16]] = lIIllllllllII[41];
        objectArray[SquireTOA.lIIllllllllII[17]] = lIIllllllllII[42];
        objectArray[SquireTOA.lIIllllllllII[0]] = lIIllllllllII[43];
        objectArray[SquireTOA.lIIllllllllII[44]] = lIIllllllllII[45];
        objectArray[SquireTOA.lIIllllllllII[46]] = lIIllllllllII[47];
        objectArray[SquireTOA.lIIllllllllII[48]] = lIIllllllllII[49];
        a = ImmutableSet.of((Object)lIIllllllllII[19], (Object)lIIllllllllII[20], (Object)lIIllllllllII[21], (Object)lIIllllllllII[22], (Object)lIIllllllllII[23], (Object)lIIllllllllII[24], (Object[])objectArray);
    }

    public boolean a(int ... nArray) {
        return this.a((NPC nPC) -> {
            void var3;
            int[] nArray2 = nArray;
            int n2 = nArray2.length;
            int var4 = lIIllllllllII[1];
            while (SquireTOA.lIllIlIllIIIlll(var4, (int)var3)) {
                void var5;
                void var6;
                void var7 = var6[var4];
                if (SquireTOA.lIllIlIllIIlIII((int)var7, var5.getId())) {
                    return lIIllllllllII[2];
                }
                ++var4;

                if (2 == 2) continue;
                return false;
            }
            return lIIllllllllII[1];
        });
    }

    public int a() {
        return Vars.getVarp((int)lIIllllllllII[18]);
    }

    @Subscribe
    public void a(SoundEffectPlayed soundEffectPlayed) {
        if (SquireTOA.lIllIlIllIIIlIl(a.contains(soundEffectPlayed.getSoundId()) ? 1 : 0)) {
            soundEffectPlayed.consume();
        }
    }

    private static boolean lIllIlIllIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    protected void onStop() {
        this.h.unregister((Object)this.d);
        this.h.unregister((Object)this.e);
        this.h.unregister((Object)this.f);
        this.h.unregister((Object)this.g);
        this.i.remove((Overlay)this.j);

        this.i.remove((Overlay)this.k);

        this.i.remove((Overlay)this.l);

        this.i.remove((Overlay)this.m);

        this.i.remove((Overlay)this.n);

        this.i.remove((Overlay)this.o);

        this.i.remove((Overlay)this.p);

        InteractionManager.setHelper((boolean)lIIllllllllII[1]);
    }

    private static boolean lIllIlIllIIIlIl(int n2) {
        return n2 != 0;
    }

    public NPC b() {
        int[] nArray = new int[lIIllllllllII[2]];
        nArray[SquireTOA.lIIllllllllII[1]] = this.a();
        return NPCs.getNearest((int[])nArray);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllllllllII[0]];
        classArray[SquireTOA.lIIllllllllII[1]] = HandlingZebakPrayersTask.class;
        classArray[SquireTOA.lIIllllllllII[2]] = GearSwappingZebakTask.class;
        classArray[SquireTOA.lIIllllllllII[3]] = SwappingGearForBabboonsTask.class;
        classArray[SquireTOA.lIIllllllllII[4]] = HandlingBabboonPrayersTask.class;
        classArray[SquireTOA.lIIllllllllII[5]] = GearSwappingForAkkhaTask.class;
        classArray[SquireTOA.lIIllllllllII[6]] = HandlingAkkhaPrayersTask.class;
        classArray[SquireTOA.lIIllllllllII[7]] = HandlingKephriPrayersTask.class;
        classArray[SquireTOA.lIIllllllllII[8]] = KephriGearSwappingTask.class;
        classArray[SquireTOA.lIIllllllllII[9]] = HandlingBabaPrayersTask.class;
        classArray[SquireTOA.lIIllllllllII[10]] = GearSwappingBabaTask.class;
        classArray[SquireTOA.lIIllllllllII[11]] = HandlingObeliskPrayersTask.class;
        classArray[SquireTOA.lIIllllllllII[12]] = SwappingForObeliskTask.class;
        classArray[SquireTOA.lIIllllllllII[13]] = HandlingWardenPrayersTask.class;
        classArray[SquireTOA.lIIllllllllII[14]] = WardenGearSwappingTask.class;
        classArray[SquireTOA.lIIllllllllII[15]] = HandlingElidinisP3PrayersTask.class;
        classArray[SquireTOA.lIIllllllllII[16]] = HandlingTumekenP3PrayersTask.class;
        classArray[SquireTOA.lIIllllllllII[17]] = PreventingLogoutTask.class;
        return classArray;
    }

    private static boolean lIllIlIllIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIllIIIllI(Object object) {
        return object != null;
    }

    private static boolean lIllIlIllIIlIIl(int n2) {
        return n2 == 0;
    }
}

