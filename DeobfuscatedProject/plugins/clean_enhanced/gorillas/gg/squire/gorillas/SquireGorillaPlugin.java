/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.PlayerDespawned
 *  net.runelite.api.events.PlayerSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.callback.ClientThread
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.gorillas;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.overlay.GorillaInfoBox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import gg.squire.gorillas.AHelper;
import gg.squire.gorillas.CHelper;
import gg.squire.gorillas.GameEnum3;
import gg.squire.gorillas.FHelper;
import gg.squire.gorillas.GHelper;
import gg.squire.gorillas.TurningOnRunTask;
import gg.squire.gorillas.WalkingToCavernTask;
import gg.squire.gorillas.BankingTask;
import gg.squire.gorillas.RestoringStatsTask;
import gg.squire.gorillas.WalkingToGateTask;
import gg.squire.gorillas.AttackingGorillaTask;
import gg.squire.gorillas.DetectingMeleeTask;
import gg.squire.gorillas.DodgingBouldersTask;
import gg.squire.gorillas.HandlingGearTask;
import gg.squire.gorillas.HandlingPrayerTask;
import gg.squire.gorillas.HoppingTooBusyTask;
import gg.squire.gorillas.AlchingItemTask;
import gg.squire.gorillas.DrinkingPotionTask;
import gg.squire.gorillas.EatingFoodTask;
import gg.squire.gorillas.LootingGorillaTask;
import gg.squire.gorillas.TeleportingOutTask;

@PluginDescriptor(name="Squire Demonic Gorillas", enabledByDefault=false)
@SquireUtil
public class SquireGorillaPlugin
extends SquirePlugin {
    private  List<g> h;
    @Inject
    private  Client b;
    private  List<WorldPoint> g;
    private  Map<NPC, c> d;
    
    @Inject
    private  GorillaInfoBox e;
    @Inject
    private  OverlayManager f;
    private  Map<Player, f> i;
    private  int j;
    private static final  Set<Integer> a;
    @Inject
    private  ClientThread c;

    public Map<NPC, c> h() {
        return this.d;
    }

    private void c() {
        this.d.clear();
        Iterator var2 = this.b.getNpcs().iterator();
        while ((var2.hasNext( != 0) ? 1 : 0)) {
            NPC var3 = (NPC)var2.next();
            if ((SquireGorillaPlugin.a(var3.getId( != 0)) ? 1 : 0)) {
                SquireGorillaPlugin var4;
                var4.d.put(var3, new CHelper(var3));
                0;
            }
            0;
            if (2 > 0) continue;
            return;
        }
    }

    @Subscribe
    private void a(NpcDespawned npcDespawned) {
        c c2 = this.d.remove(npcDespawned.getNpc());
        if c2 != null {
            SquireGorillaPlugin var5;
            if ((c2.u() == c2.u()2))) {
                this.j += 6;
            }
            if ((var5.d.isEmpty( != 0) ? 1 : 0)) {
                var5.a();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f() {
        void var6;
        Iterator<g> iterator = this.h.iterator();
        int var7 = this.b.getTickCount();
        while ((var6.hasNext( != 0) ? 1 : 0)) {
            g var8 = (g)var6.next();
            if ((var7 >= var8.I())) {
                SquireGorillaPlugin var9;
                int var10 = 7;
                c var11 = var8.F();
                f var12 = var9.i.get(var8.H());
                if var12 == null {
                    var10 = 6;
                    0;
                    if (-1 > 0) {
                        return;
                    }
                } else if ((var12.E( != 0).isEmpty() ? 1 : 0)) {
                    var10 = 6;
                    0;
                    if null != null {
                        return;
                    }
                } else if ((var12.E( != 0).stream().anyMatch(hitsplat -> {
                    boolean bl;
                    if ((hitsplat.getHitsplatType() == var1[19])) {
                        bl = 6;
                        0;
                        if (-3 >= 0) {
                            return ((0x6B ^ 0x74 ^ (0x11 ^ 0x3D)) & (0x1F ^ 0x13 ^ (0x6A ^ 0x55) ^ -1)) != 0;
                        }
                    } else {
                        bl = 7;
                    }
                    return bl;
                }) ? 1 : 0)) {
                    var10 = 6;
                }
                if var10 {
                    var11.b(var11.o() - 6);
                    var9.a(var11, new d[7]);
                }
                var6.remove();
            }
            0;
            if (3 != -1) continue;
            return;
        }
    }

    static {
        SquireGorillaPlugin.var13();
        a = ImmutableSet.of((Object)var1[28], (Object)var1[27], (Object)var1[30]);
    }

    private static  boolean b(d d2, d d3) {
        boolean bl;
        if (((Object)d3 == (Object)d32)d2)) {
            bl = 6;
            0;
            if (2 == ((0x7C ^ 0x21 ^ (0xFD ^ 0x87)) & (0x30 ^ 0x17 ^ (0xB ^ 0x37) & ~(0x65 ^ 0x59) ^ -1))) {
                return ((0xAA ^ 0xB6 ^ (0x57 ^ 0x12)) & (0x13 ^ 0x3A ^ (0x4E ^ 0x3E) ^ -1)) != 0;
            }
        } else {
            bl = 7;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private void a(c c2, d d3) {
        void var14;
        int var15;
        int n2;
        void var16;
        void var17;
        d var18;
        c2.a(6);
        Player player = (Player)c2.m().getInteracting();
        Object var4_4 = null;
        if player != null {
            var18 = this.a(player);
        }
        if (!var17 != null || var16 != null && (var16.equals(ObjectlllllllllllllllIlIIlllIIIIIIllIl) ? 1 : 0)) {
            n2 = 6;
            0;
            if (3 == (7 + 100 - 95 + 116 ^ 65 + 69 - 130 + 128)) {
                return;
            }
        } else {
            n2 = var15 = 7;
        }
        if ((var16 == s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.BOULDER)) {
            var14.a(var14.n().stream().filter(d2 -> {
                boolean bl;
                if ((d2 != d22)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                    bl = 6;
                    0;
                    if (-(0x2E ^ 0x2A) > 0) {
                        return ((0x80 ^ 0xAC) & ~(0x62 ^ 0x4E)) != 0;
                    }
                } else {
                    bl = 7;
                }
                return bl;
            }).collect(Collectors.toList()));
            0;
            if (2 == 3) {
                return;
            }
        } else {
            if var15 {
                var14.b(var14.o() - 6);
                0;
                if (3 <= 0) {
                    return;
                }
            } else {
                f lllllllllllllllIlIIlllIIIIIIlIlI2;
                WorldArea lllllllllllllllIlIIlllIIIIIIlIIl2;
                SquireGorillaPlugin var19;
                int var20 = var19.b.getTickCount();
                if ((var16 == s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC)) {
                    f lllllllllllllllIlIIlllIIIIIIlIlI2 = var19.i.get(var17);
                    WorldArea lllllllllllllllIlIIlllIIIIIIlIIl2 = lllllllllllllllIlIIlllIIIIIIlIlI2.r();
                    if lllllllllllllllIlIIlllIIIIIIlIIl2 != null {
                        int var21 = var14.m().getWorldArea().distanceTo(lllllllllllllllIlIIlllIIIIIIlIIl2);
                        var20 += (var21 + var1[19]) / var1[15];
                    }
                    0;
                    if (3 <= 0) {
                        return;
                    }
                } else if ((var16 == s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED) && (lllllllllllllllIlIIlllIIIIIIlIIl2 = (lllllllllllllllIlIIlllIIIIIIlIlI2 = var19.i.getlllllllllllllllIlIIlllIIIIIIlllI != null).r())) {
                    int var21 = var14.m().getWorldArea().distanceTo(lllllllllllllllIlIIlllIIIIIIlIIl2);
                    var20 += (var21 + var1[16]) / var1[13];
                }
                var19.h.add(new GHelper((c)var14, (d)var16, (Player)var17, var20));
                0;
            }
            var14.a(var14.n().stream().filter(arg_0 -> SquireGorillaPlugin.b((d)var16, arg_0)).collect(Collectors.toList()));
            if ((var14.n( != 0).isEmpty() ? 1 : 0)) {
                int n3;
                var14.a(Arrays.stream(s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c.l).filter(arg_0 -> SquireGorillaPlugin.a((d)var16, arg_0)).collect(Collectors.toList()));
                int n4 = var1[10];
                if var15 {
                    n3 = 6;
                    0;
                    if ((0xBB ^ 0xBF) > (0x72 ^ 0x76)) {
                        return;
                    }
                } else {
                    n3 = 7;
                }
                var14.b(n4 - n3);
            }
        }
        d[] dArray = new d[6];
        dArray[7] = var4_4;
        this.a(c2, dArray);
        int n5 = this.b.getTickCount();
        c2.c(n5 + var1[12]);
    }

    private void g() {
        Iterator<f> var22 = this.i.values().iterator();
        while ((var22.hasNext( != 0) ? 1 : 0)) {
            f var23 = var22.next();
            var23.a(var23.D().getWorldArea());
            var23.E().clear();
            0;
            if (3 == 3) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if ((SquireGorillaPlugin.a(nPC.getId( != 0)) ? 1 : 0)) {
            void var24;
            SquireGorillaPlugin var25;
            if ((this.d.isEmpty( != 0) ? 1 : 0)) {
                this.d();
            }
            var25.d.put((NPC)var24, new CHelper((NPC)var24));
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ProjectileSpawned projectileSpawned) {
        void var26;
        void var27;
        SquireGorillaPlugin var28;
        Projectile projectile = projectileSpawned.getProjectile();
        int n2 = projectile.getId();
        if ((a.contains(n2 == 0) ? 1 : 0)) {
            return;
        }
        WorldPoint var29 = WorldPoint.fromLocal((Client)var28.b, (int)var27.getX1(), (int)var27.getY1(), (int)var28.b.getPlane());
        if (((int)var26 == var1[30])) {
            var28.g.add(var29);
            0;
            0;
            if (((0x45 ^ 0x26) & ~(0xC3 ^ 0xA0)) != 0) {
                return;
            }
        } else {
            Iterator<c> var30 = var28.d.values().iterator();
            while ((var30.hasNext( != 0) ? 1 : 0)) {
                c var31 = var30.next();
                if ((var31.m( == 0).getWorldLocation().distanceTo(var29))) {
                    var31.e(var27.getId());
                }
                0;
                if null == null continue;
                return;
            }
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[8];
        classArray[7] = HandlingGearTask.class;
        classArray[6] = HandlingPrayerTask.class;
        classArray[9] = DodgingBouldersTask.class;
        classArray[SquireGorillaPlugin.var1[10]] = AttackingGorillaTask.class;
        classArray[SquireGorillaPlugin.var1[11]] = HoppingTooBusyTask.class;
        classArray[SquireGorillaPlugin.var1[12]] = DetectingMeleeTask.class;
        classArray[SquireGorillaPlugin.var1[13]] = LootingGorillaTask.class;
        classArray[SquireGorillaPlugin.var1[14]] = BankingTask.class;
        classArray[SquireGorillaPlugin.var1[15]] = WalkingToGateTask.class;
        classArray[SquireGorillaPlugin.var1[16]] = WalkingToCavernTask.class;
        classArray[SquireGorillaPlugin.var1[17]] = EatingFoodTask.class;
        classArray[SquireGorillaPlugin.var1[18]] = TeleportingOutTask.class;
        classArray[SquireGorillaPlugin.var1[19]] = AlchingItemTask.class;
        classArray[SquireGorillaPlugin.var1[20]] = DrinkingPotionTask.class;
        classArray[SquireGorillaPlugin.var1[21]] = TurningOnRunTask.class;
        classArray[SquireGorillaPlugin.var1[22]] = RestoringStatsTask.class;
        return classArray;
    }

    private static  boolean a(d d2, d d3) {
        boolean bl;
        if (((Object)d3 == (Object)d32)d2)) {
            bl = 6;
            0;
            if (-1 >= ((0x64 ^ 0x79) & ~(0x98 ^ 0x85))) {
                return ((0xAF ^ 0xBC) & ~(0x57 ^ 0x44)) != 0;
            }
        } else {
            bl = 7;
        }
        return bl;
    }

    private static  boolean a(d[] dArray, d d2) {
        return Arrays.stream(dArray).noneMatch(d3 -> {
            boolean bl;
            if (((Object)d2 == (Object)d22)) {
                bl = 6;
                0;
                if (((113 + 83 - 51 + 97 ^ 65 + 138 - 65 + 36) & ((0x16 ^ 0x4F) & ~(0xD6 ^ 0x8F) ^ (0x36 ^ 0x6A) ^ -1)) > (150 + 31 - 152 + 147 ^ 139 + 123 - 104 + 22)) {
                    return ((0x6A ^ 0x11 ^ (0x61 ^ 0x4B)) & (102 + 63 - 101 + 135 ^ 140 + 103 - 174 + 81 ^ -1)) != 0;
                }
            } else {
                bl = 7;
            }
            return bl;
        });
    }

    protected void onStart() {
        this.d = new HashMap<NPC, c>();
        this.j = 7;
        this.g = new ArrayList<WorldPoint>();
        this.h = new ArrayList<g>();
        this.i = new HashMap<Player, f>();
        this.c.invoke(this::b);
        this.f.add((Overlay)this.e);
        0;
    }

    private void a() {
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.d.clear();
    }

    private void b() {
        this.g.clear();
        this.h.clear();
        this.c();
        this.d();
    }

    @Subscribe
    private void a(GameTick gameTick) {
        this.e();
        this.f();
        this.g();
        this.g.clear();
    }

    public static boolean a(int n2) {
        int n3;
        if (!(n2 && (n2 != 1) && (n2 != 2) && (n2 != 3) && (n2 != 4) && !(n2 == 5))) {
            n3 = 6;
            0;
            if ((0x8A ^ 0xA6 ^ (0x39 ^ 0x11)) != (0x90 ^ 0xBA ^ (0x60 ^ 0x4E))) {
                return ((18 + 110 - 98 + 98 ^ 83 + 70 - 101 + 91) & (0x7D ^ 0x64 ^ (0xC ^ 0x1A) ^ -1)) != 0;
            }
        } else {
            n3 = 7;
        }
        return n3 != 0;
    }

    @Provides
    SquireGorillaConfig a(ConfigManager configManager) {
        return (SquireGorillaConfig)configManager.getConfig(SquireGorillaConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    private void a(c c2, d ... dArray) {
        if (!(c2.o( > 0)) || (c2.n( != 0).isEmpty() ? 1 : 0)) {
            void var32;
            void var33;
            var33.a(Arrays.stream(s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c.l).filter(arg_0 -> SquireGorillaPlugin.a((d[])var32, arg_0)).collect(Collectors.toList()));
            var33.b(var1[10]);
            var33.d(6);
        }
    }

    public int i() {
        return this.j;
    }

    /*
     * WARNING - void declaration
     */
    private void e() {
        int n2 = this.b.getTickCount();
        Iterator<c> var34 = this.d.values().iterator();
        while ((var34.hasNext( != 0) ? 1 : 0)) {
            WorldArea lllllllllllllllIlIIllIllllllIllI2;
            void var35;
            SquireGorillaPlugin var36;
            c var37 = var34.next();
            Player var38 = (Player)var37.m().getInteracting();
            f var39 = var36.i.get(var38);
            if ((var37.t( != null)) && var38 == null) {
                var37.a(7);
                0;
                if ((0x44 ^ 0x40) < -1) {
                    return;
                }
            } else if (var39 != null && (var39.r( != null)) && (var37.s( == 0) ? 1 : 0) && ((int)var35 < var37.p()) && (var37.m( != 0).getWorldArea().isInMeleeDistance(var39.r()) ? 1 : 0)) {
                var37.a(6);
                var37.c((int)(var35 + 6));
            }
            int var40 = var37.m().getAnimation();
            if ((var37.v( != 0) ? 1 : 0) && ((int)var35 >= var37.p() + var1[11])) {
                var37.c((int)(var35 + 9));
                var37.a(6);
                if (var39 != null && (var39.r( != null)) && (var37.m( == 0).getWorldArea().isInMeleeDistance(var39.r()) ? 1 : 0) && (var37.m( == 0).getWorldArea().intersectsWith(var39.r()) ? 1 : 0)) {
                    var37.a(var37.n().stream().filter(d2 -> {
                        boolean bl;
                        if ((d2 != d22)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                            bl = 6;
                            0;
                            if null != null {
                                return ((0x94 ^ 0x92) & ~(0x9F ^ 0x99)) != 0;
                            }
                        } else {
                            bl = 7;
                        }
                        return bl;
                    }).collect(Collectors.toList()));
                    if var38 != null {
                        d[] dArray = new d[9];
                        dArray[7] = s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE;
                        dArray[6] = var36.a(var38);
                        var36.a(var37, dArray);
                        0;
                        if (2 <= 0) {
                            return;
                        }
                    }
                }
            } else if ((var40 != var37.q())) {
                if (var40 == var1[23]) {
                    var36.a(var37, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE);
                    0;
                    if (-1 >= 1) {
                        return;
                    }
                } else if (var40 == var1[24]) {
                    var36.a(var37, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC);
                    0;
                    if null != null {
                        return;
                    }
                } else if (var40 == var1[25]) {
                    var36.a(var37, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED);
                    0;
                    if (1 < 0) {
                        return;
                    }
                } else if ((var40 == var1[26]) && var38 != null) {
                    if ((var37.l() == var37.l()2))) {
                        var36.a(var37, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.BOULDER);
                        0;
                        if (((0x5D ^ 0x17 ^ 104 + 13 - 94 + 104) & (25 + 152 - 37 + 29 ^ 83 + 116 - 43 + 0 ^ -1)) != 0) {
                            return;
                        }
                    } else {
                        if (((int)var35 >= var37.p())) {
                            var37.c(6);
                            int lllllllllllllllIlIIllIllllllIllI2 = var37.w();
                            if (lllllllllllllllIlIIllIllllllIllI2 == var1[27]) {
                                var36.a(var37, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC);
                                0;
                                if (((0xA3 ^ 0xBE ^ (8 ^ 0x37)) & (0xB2 ^ 0x81 ^ (0x6F ^ 0x7E) ^ -1)) == (0x12 ^ 0x7A ^ (0xD6 ^ 0xBA))) {
                                    return;
                                }
                            } else if (lllllllllllllllIlIIllIllllllIllI2 == var1[28]) {
                                var36.a(var37, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED);
                                0;
                                if null != null {
                                    return;
                                }
                            } else if var39 != null {
                                WorldArea var41 = var39.r();
                                if (var41 != null && (var36.g.stream( != 0).anyMatch(worldPoint -> {
                                    boolean bl;
                                    if ((worldPoint.distanceTo(var41 == 0))) {
                                        bl = 6;
                                        0;
                                        if (((0x46 ^ 0x77) & ~(0x2D ^ 0x1C)) == 1) {
                                            return ((0xFA ^ 0xBD) & ~(0x83 ^ 0xC4)) != 0;
                                        }
                                    } else {
                                        bl = 7;
                                    }
                                    return bl;
                                }) ? 1 : 0)) {
                                    var36.a(var37, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.BOULDER);
                                    0;
                                    if (((0x1B ^ 0x24) & ~(0x88 ^ 0xB7)) >= (0x46 ^ 0x42)) {
                                        return;
                                    }
                                } else if ((var39.E( == 0).isEmpty() ? 1 : 0)) {
                                    var36.a(var37, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE);
                                }
                            }
                        }
                        var37.c((int)(var35 + var1[12]));
                        var37.c(6);
                    }
                }
            }
            if ((var37.B( > 0))) {
                var37.f(var37.B() - 6);
                0;
                if null != null {
                    return;
                }
            } else if ((var37.s( != 0) ? 1 : 0) && (var37.m( != null).getInteracting()) && (var37.y( == 0) ? 1 : 0) && (var37.n().size() >= 9) && (var37.n( != 0).stream().anyMatch(d2 -> {
                boolean bl;
                if ((d2 == d22)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                    bl = 6;
                    0;
                    if (2 == 3) {
                        return ((0 ^ 0x34) & ~(0xB0 ^ 0x84)) != 0;
                    }
                } else {
                    bl = 7;
                }
                return bl;
            }) ? 1 : 0) && var39 != null && (var39.r( != null)) && (var37.r( != null)) && (lllllllllllllllIlIIllIllllllIllI2 = var37.r( != null).calculateNextTravellingPoint(var36.b.getTopLevelWorldView(), var39.r(), 6, worldPoint -> {
                int n2;
                WorldArea worldArea = new WorldArea(worldPoint, 6, 6);
                if ((this.d.values( != 0).stream().noneMatch(c3 -> {
                    int n2;
                    void var42;
                    WorldArea var43;
                    WorldArea worldArea2;
                    c var44;
                    void var45;
                    if (c3 == c32) {
                        return 7;
                    }
                    if ((var45.m().getIndex() < var44.m().getIndex())) {
                        worldArea2 = var45.m().getWorldArea();
                        0;
                        if null != null {
                            return ((0x55 ^ 0x42) & ~(0x52 ^ 0x45)) != 0;
                        }
                    } else {
                        worldArea2 = var45.r();
                    }
                    if ((var43 = worldArea2 != null) && (var42.intersectsWithlllllllllllllllIlIIllIlllIIIllII)) {
                        n2 = 6;
                        0;
                        if ((0x73 ^ 0x47 ^ (0x1E ^ 0x2F)) <= 0) {
                            return ((0xBC ^ 0x87 ^ (0xE1 ^ 0xC4)) & (146 + 46 - 191 + 170 ^ 134 + 63 - 40 + 24 ^ -1)) != 0;
                        }
                    } else {
                        n2 = 7;
                    }
                    return n2 != 0;
                }) ? 1 : 0) && (this.i.values( != 0).stream().noneMatch(f2 -> {
                    int n2;
                    WorldArea worldArea2 = f2.r();
                    if (worldArea2 != null && (worldArea.intersectsWithworldArea2)) {
                        n2 = 6;
                        0;
                        if (3 <= 1) {
                            return ((0xF4 ^ 0x8E ^ (0x3F ^ 0x1F)) & (0xE2 ^ 0xBC ^ (0x8D ^ 0x89) ^ -1)) != 0;
                        }
                    } else {
                        n2 = 7;
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    n2 = 6;
                    0;
                    if (1 <= ((0x32 ^ 7) & ~(0xA1 ^ 0x94))) {
                        return ((0x4E ^ 0x1B) & ~(0xC2 ^ 0x97)) != 0;
                    }
                } else {
                    n2 = 7;
                }
                return n2 != 0;
            }))) {
                int var41 = var37.m().getWorldArea().distanceTo(var39.r());
                WorldPoint var46 = lllllllllllllllIlIIllIllllllIllI2.toWorldPoint();
                if ((var41 <= var1[17]) && (var39.r( != 0).hasLineOfSightTo(var36.b.getTopLevelWorldView(), var37.r()) ? 1 : 0)) {
                    if ((var46.distanceTo(var37.r( != 0).toWorldPoint()))) {
                        if ((var46.distanceTo(var37.m( == 0).getWorldLocation()))) {
                            var37.a(var37.n().stream().filter(d2 -> {
                                boolean bl;
                                if ((d2 == d22)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                                    bl = 6;
                                    0;
                                    if ((0x5A ^ 0x21 ^ 77 + 78 - 86 + 58) < 0) {
                                        return ((35 + 99 - 58 + 175 ^ 165 + 34 - 75 + 60) & (161 + 166 - 310 + 179 ^ 79 + 124 - 134 + 66 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = 7;
                                }
                                return bl;
                            }).collect(Collectors.toList()));
                            0;
                            if (-2 >= 0) {
                                return;
                            }
                        } else {
                            var37.a(var37.n().stream().filter(d2 -> {
                                boolean bl;
                                if ((d2 != d22)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                                    bl = 6;
                                    0;
                                    if (3 >= (0x6B ^ 0xD ^ (9 ^ 0x6B))) {
                                        return ((0xEE ^ 0xAE ^ (0x53 ^ 0x38)) & (37 + 100 - 57 + 103 ^ 71 + 39 - -45 + 1 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = 7;
                                }
                                return bl;
                            }).collect(Collectors.toList()));
                            0;
                            if (((174 + 13 - 49 + 79 ^ 106 + 32 - 72 + 75) & (118 + 156 - 115 + 36 ^ 79 + 105 - 164 + 131 ^ -1)) != 0) {
                                return;
                            }
                        }
                    } else if (((int)var35 >= var37.p()) && (var37.w() == var1[29]) && (var36.g.stream( != 0).noneMatch(worldPoint -> {
                        boolean bl;
                        if ((worldPoint.distanceTo(var39.r( == 0)))) {
                            bl = 6;
                            0;
                            if ((0x8A ^ 0x8E) < 0) {
                                return ((0x6C ^ 0x74) & ~(0x9F ^ 0x87)) != 0;
                            }
                        } else {
                            bl = 7;
                        }
                        return bl;
                    }) ? 1 : 0)) {
                        var37.a(var37.n().stream().filter(d2 -> {
                            boolean bl;
                            if ((d2 == d22)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                                bl = 6;
                                0;
                                if (-2 > 0) {
                                    return ((0xDA ^ 0x9E) & ~(0xEA ^ 0xAE)) != 0;
                                }
                            } else {
                                bl = 7;
                            }
                            return bl;
                        }).collect(Collectors.toList()));
                    }
                }
            }
            if ((var37.v( != 0) ? 1 : 0)) {
                var37.a(6);
            }
            if ((var37.l() != var37.l()2))) {
                if (!(var37.z( == 0) ? 1 : 0) || (var37.y( != 0) ? 1 : 0)) {
                    var37.f(9);
                    0;
                    if (-(0xA2 ^ 0xA6) >= 0) {
                        return;
                    }
                } else {
                    var37.f(6);
                }
            }
            var37.d(var37.m().getAnimation());
            var37.a(var37.m().getWorldArea());
            var37.a(var37.m().getInteracting());
            if ((var37.t( != null))) {
                var37.b(var37.t());
            }
            var37.b(7);
            var37.c(7);
            var37.e(var37.y());
            var37.d(7);
            var37.a(var37.l());
            var37.e(var1[29]);
            0;
            if (((0xB6 ^ 0x8B ^ (0x38 ^ 0x1E)) & (0x7B ^ 0x38 ^ (0xD3 ^ 0x8B) ^ -1)) == 0) continue;
            return;
        }
    }

    @Subscribe
    private void a(PlayerSpawned playerSpawned) {
        if ((this.d.isEmpty( != 0) ? 1 : 0)) {
            return;
        }
        Player player = playerSpawned.getPlayer();
        this.i.put(player, new FHelper(player));
        0;
    }

    protected void onStop() {
        this.d = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f.remove((Overlay)this.e);
        0;
    }

    /*
     * WARNING - void declaration
     */
    private d a(Player player) {
        void var47;
        HeadIcon headIcon = player.getOverheadIcon();
        if headIcon == null {
            return null;
        }
        switch (s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.a.k[var47.ordinal()]) {
            case 1: {
                return s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE;
            }
            case 2: {
                return s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED;
            }
            case 3: {
                return s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC;
            }
        }
        return null;
    }

    @Subscribe
    private void a(PlayerDespawned playerDespawned) {
        if ((this.d.isEmpty( != 0) ? 1 : 0)) {
            return;
        }
        this.i.remove(playerDespawned.getPlayer());
        0;
    }

    @Subscribe
    private void a(GameStateChanged gameStateChanged) {
        GameState gameState = gameStateChanged.getGameState();
        if (!(gameState != gameState2) || !(gameState != gameState2) || (gameState == gameState2)) {
            SquireGorillaPlugin var48;
            var48.b();
        }
    }

    private void d() {
        this.i.clear();
        Iterator var49 = this.b.getPlayers().iterator();
        while ((var49.hasNext( != 0) ? 1 : 0)) {
            SquireGorillaPlugin var50;
            Player var51 = (Player)var49.next();
            var50.i.put(var51, new FHelper(var51));
            0;
            0;
            if (((0x7D ^ 0x5F) & ~(0xB3 ^ 0x91)) >= ((0xB0 ^ 0xA7) & ~(0x13 ^ 4))) continue;
            return;
        }
    }

    public c a(NPC nPC) {
        return this.d.getOrDefault(nPC, null);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(HitsplatApplied hitsplatApplied) {
        SquireGorillaPlugin var52;
        void var53;
        if ((this.d.isEmpty( != 0) ? 1 : 0)) {
            return;
        }
        if ((var53.getActor( != 0) instanceof Player)) {
            Player var54 = (Player)var53.getActor();
            f var55 = var52.i.get(var54);
            if var55 != null {
                var55.E().add(var53.getHitsplat());
                0;
            }
            0;
            if ((0x60 ^ 0x65) == 0) {
                return;
            }
        } else if ((var53.getActor( != 0) instanceof NPC)) {
            c var54 = var52.d.get(var53.getActor());
            int var55 = var53.getHitsplat().getHitsplatType();
            if (var54 != null && (!(var55 != var1[19]) || (var55 == 8))) {
                var54.b(6);
            }
        }
    }

}

