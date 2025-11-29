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
import java.util.Arrays;
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
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.a;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c;
import gg.squire.gorillas.GameEnum20;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.f;
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
        Iterator var1 = this.b.getNpcs().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(var1.hasNext() ? 1 : 0)) {
            NPC var2 = (NPC)var1.next();
            if (SquireGorillaPlugin.llllllIIIlIllI(SquireGorillaPlugin.a(var2.getId()) ? 1 : 0)) {
                SquireGorillaPlugin var3;
                var3.d.put(var2, new c(var2));

            }

            if (2 > 0) continue;
            return;
        }
    }

    @Subscribe
    private void a(NpcDespawned npcDespawned) {
        c c2 = this.d.remove(npcDespawned.getNpc());
        if (SquireGorillaPlugin.llllllIIIllIIl(c2)) {
            SquireGorillaPlugin var4;
            if (SquireGorillaPlugin.llllllIIIllIlI(c2.u(), Players.getLocal())) {
                this.j += llIIllIIllII[6];
            }
            if (SquireGorillaPlugin.llllllIIIlIllI(var4.d.isEmpty() ? 1 : 0)) {
                var4.a();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f() {
        void var5;
        Iterator<g> iterator = this.h.iterator();
        int var6 = this.b.getTickCount();
        while (SquireGorillaPlugin.llllllIIIlIllI(var5.hasNext() ? 1 : 0)) {
            g var7 = (GHelper) ar5.next();
            if (SquireGorillaPlugin.llllllIIIlllIl(var6, var7.I())) {
                SquireGorillaPlugin var8;
                int var9 = llIIllIIllII[7];
                c var10 = var7.F();
                f var11 = var8.i.get(var7.H());
                if (SquireGorillaPlugin.llllllIIIllIII(var11)) {
                    var9 = llIIllIIllII[6];

                } else if (SquireGorillaPlugin.llllllIIIlIllI(var11.E().isEmpty() ? 1 : 0)) {
                    var9 = llIIllIIllII[6];

                    }
                } else if (SquireGorillaPlugin.llllllIIIlIllI(var11.E().stream().anyMatch(hitsplat -> {
                    boolean bl;
                    if (SquireGorillaPlugin.llllllIIIlIlIl(hitsplat.getHitsplatType(), llIIllIIllII[19])) {
                        bl = llIIllIIllII[6];

                    } else {
                        bl = llIIllIIllII[7];
                    }
                    return bl;
                }) ? 1 : 0)) {
                    var9 = llIIllIIllII[6];
                }
                if (SquireGorillaPlugin.llllllIIIlIllI(var9)) {
                    var10.b(var10.o() - llIIllIIllII[6]);
                    var8.a(var10, new d[llIIllIIllII[7]]);
                }
                var5.remove();
            }

            if (3 != -1) continue;
            return;
        }
    }

    static {
        SquireGorillaPlugin.llllllIIIlIIll();
        a = ImmutableSet.of((Object)llIIllIIllII[28], (Object)llIIllIIllII[27], (Object)llIIllIIllII[30]);
    }

    private static  boolean b(d d2, d d3) {
        boolean bl;
        if (SquireGorillaPlugin.llllllIIIllIlI((Object)d3, (Object)d2)) {
            bl = llIIllIIllII[6];

            if (2 == ((0x7C ^ 0x21 ^ (0xFD ^ 0x87)) & (0x30 ^ 0x17 ^ (0xB ^ 0x37) & ~(0x65 ^ 0x59) ^ -1))) {
                return ((0xAA ^ 0xB6 ^ (0x57 ^ 0x12)) & (0x13 ^ 0x3A ^ (0x4E ^ 0x3E) ^ -1)) != 0;
            }
        } else {
            bl = llIIllIIllII[7];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private void a(c c2, d d3) {
        void var12;
        int var13;
        int n2;
        void var14;
        void var15;
        d var16;
        c2.a(llIIllIIllII[6]);
        Player player = (Player)c2.m().getInteracting();
        Object var4_4 = null;
        if (SquireGorillaPlugin.llllllIIIllIIl(player)) {
            var16 = this.a(player);
        }
        if (!SquireGorillaPlugin.llllllIIIllIIl(var15) || SquireGorillaPlugin.llllllIIIllIIl(var14) && SquireGorillaPlugin.llllllIIIlIllI(var14.equals((Object)var16) ? 1 : 0)) {
            n2 = llIIllIIllII[6];

            if (3 == (7 + 100 - 95 + 116 ^ 65 + 69 - 130 + 128)) {
                return;
            }
        } else {
            n2 = var13 = llIIllIIllII[7];
        }
        if (SquireGorillaPlugin.llllllIIIllIlI(var14, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.BOULDER)) {
            var12.a(var12.n().stream().filter(d2 -> {
                boolean bl;
                if (SquireGorillaPlugin.llllllIIIlllll(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                    bl = llIIllIIllII[6];

                    if (-(0x2E ^ 0x2A) > 0) {
                        return false;
                    }
                } else {
                    bl = llIIllIIllII[7];
                }
                return bl;
            }).collect(Collectors.toList()));

            if (2 == 3) {
                return;
            }
        } else {
            if (SquireGorillaPlugin.llllllIIIlIllI(var13)) {
                var12.b(var12.o() - llIIllIIllII[6]);

                if (3 <= 0) {
                    return;
                }
            } else {
                f lllllllllllllllIlIIlllIIIIIIlIlI2;
                WorldArea lllllllllllllllIlIIlllIIIIIIlIIl2;
                SquireGorillaPlugin var17;
                int var18 = var17.b.getTickCount();
                if (SquireGorillaPlugin.llllllIIIllIlI(var14, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC)) {
                    f lllllllllllllllIlIIlllIIIIIIlIlI2 = var17.i.get(var15);
                    WorldArea lllllllllllllllIlIIlllIIIIIIlIIl2 = lllllllllllllllIlIIlllIIIIIIlIlI2.r();
                    if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIlllIIIIIIlIIl2)) {
                        int var19 = var12.m().getWorldArea().distanceTo(lllllllllllllllIlIIlllIIIIIIlIIl2);
                        var18 += (var19 + llIIllIIllII[19]) / llIIllIIllII[15];
                    }

                    if (3 <= 0) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIllIlI(var14, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIlllIIIIIIlIIl2 = (lllllllllllllllIlIIlllIIIIIIlIlI2 = var17.i.get(var15)).r())) {
                    int var19 = var12.m().getWorldArea().distanceTo(lllllllllllllllIlIIlllIIIIIIlIIl2);
                    var18 += (var19 + llIIllIIllII[16]) / llIIllIIllII[13];
                }
                var17.h.add(new GHelper((c)var12, (GameEnum20) ar14, (Player)var15, var18));

            }
            var12.a(var12.n().stream().filter(arg_0 -> SquireGorillaPlugin.b((GameEnum20) ar14, arg_0)).collect(Collectors.toList()));
            if (SquireGorillaPlugin.llllllIIIlIllI(var12.n().isEmpty() ? 1 : 0)) {
                int n3;
                var12.a(Arrays.stream(s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c.l).filter(arg_0 -> SquireGorillaPlugin.a((GameEnum20) ar14, arg_0)).collect(Collectors.toList()));
                int n4 = llIIllIIllII[10];
                if (SquireGorillaPlugin.llllllIIIlIllI(var13)) {
                    n3 = llIIllIIllII[6];

                    if ((0xBB ^ 0xBF) > (0x72 ^ 0x76)) {
                        return;
                    }
                } else {
                    n3 = llIIllIIllII[7];
                }
                var12.b(n4 - n3);
            }
        }
        d[] dArray = new d[llIIllIIllII[6]];
        dArray[SquireGorillaPlugin.llIIllIIllII[7]] = var4_4;
        this.a(c2, dArray);
        int n5 = this.b.getTickCount();
        c2.c(n5 + llIIllIIllII[12]);
    }

    private void g() {
        Iterator<f> var20 = this.i.values().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(var20.hasNext() ? 1 : 0)) {
            f var21 = var20.next();
            var21.a(var21.D().getWorldArea());
            var21.E().clear();

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
        if (SquireGorillaPlugin.llllllIIIlIllI(SquireGorillaPlugin.a(nPC.getId()) ? 1 : 0)) {
            void var22;
            SquireGorillaPlugin var23;
            if (SquireGorillaPlugin.llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
                this.d();
            }
            var23.d.put((NPC)var22, new c((NPC)var22));

        }
    }

    private static boolean llllllIIIlIlIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ProjectileSpawned projectileSpawned) {
        void var24;
        void var25;
        SquireGorillaPlugin var26;
        Projectile projectile = projectileSpawned.getProjectile();
        int n2 = projectile.getId();
        if (SquireGorillaPlugin.llllllIIIllIll(a.contains(n2) ? 1 : 0)) {
            return;
        }
        WorldPoint var27 = WorldPoint.fromLocal((Client)var26.b, (int)var25.getX1(), (int)var25.getY1(), (int)var26.b.getPlane());
        if (SquireGorillaPlugin.llllllIIIlIlIl((int)var24, llIIllIIllII[30])) {
            var26.g.add(var27);

            if (((0x45 ^ 0x26) & ~(0xC3 ^ 0xA0)) != 0) {
                return;
            }
        } else {
            Iterator<c> var28 = var26.d.values().iterator();
            while (SquireGorillaPlugin.llllllIIIlIllI(var28.hasNext() ? 1 : 0)) {
                c var29 = var28.next();
                if (SquireGorillaPlugin.llllllIIIllIll(var29.m().getWorldLocation().distanceTo(var27))) {
                    var29.e(var25.getId());
                }

                return;
            }
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIllIIllII[8]];
        classArray[SquireGorillaPlugin.llIIllIIllII[7]] = HandlingGearTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[6]] = HandlingPrayerTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[9]] = DodgingBouldersTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[10]] = AttackingGorillaTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[11]] = HoppingTooBusyTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[12]] = DetectingMeleeTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[13]] = LootingGorillaTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[14]] = BankingTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[15]] = WalkingToGateTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[16]] = WalkingToCavernTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[17]] = EatingFoodTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[18]] = TeleportingOutTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[19]] = AlchingItemTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[20]] = DrinkingPotionTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[21]] = TurningOnRunTask.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[22]] = RestoringStatsTask.class;
        return classArray;
    }

    private static  boolean a(d d2, d d3) {
        boolean bl;
        if (SquireGorillaPlugin.llllllIIIllIlI((Object)d3, (Object)d2)) {
            bl = llIIllIIllII[6];

            if (-1 >= ((0x64 ^ 0x79) & ~(0x98 ^ 0x85))) {
                return false;
            }
        } else {
            bl = llIIllIIllII[7];
        }
        return bl;
    }

    private static  boolean a(d[] dArray, d d2) {
        return Arrays.stream(dArray).noneMatch(d3 -> {
            boolean bl;
            if (SquireGorillaPlugin.llllllIIIllIlI((Object)d2, d3)) {
                bl = llIIllIIllII[6];

                if (((113 + 83 - 51 + 97 ^ 65 + 138 - 65 + 36) & ((0x16 ^ 0x4F) & ~(0xD6 ^ 0x8F) ^ (0x36 ^ 0x6A) ^ -1)) > (150 + 31 - 152 + 147 ^ 139 + 123 - 104 + 22)) {
                    return ((0x6A ^ 0x11 ^ (0x61 ^ 0x4B)) & (102 + 63 - 101 + 135 ^ 140 + 103 - 174 + 81 ^ -1)) != 0;
                }
            } else {
                bl = llIIllIIllII[7];
            }
            return bl;
        });
    }

    protected void onStart() {
        this.d = new HashMap<NPC, c>();
        this.j = llIIllIIllII[7];
        this.g = new ArrayList<WorldPoint>();
        this.h = new ArrayList<g>();
        this.i = new HashMap<Player, f>();
        this.c.invoke(this::b);
        this.f.add((Overlay)this.e);

    }

    private static boolean llllllIIIlIlll(int n2) {
        return n2 > 0;
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

    private static boolean llllllIIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public static boolean a(int n2) {
        int n3;
        if (!(SquireGorillaPlugin.llllllIIIlIlII(n2, llIIllIIllII[0]) && SquireGorillaPlugin.llllllIIIlIlII(n2, llIIllIIllII[1]) && SquireGorillaPlugin.llllllIIIlIlII(n2, llIIllIIllII[2]) && SquireGorillaPlugin.llllllIIIlIlII(n2, llIIllIIllII[3]) && SquireGorillaPlugin.llllllIIIlIlII(n2, llIIllIIllII[4]) && !SquireGorillaPlugin.llllllIIIlIlIl(n2, llIIllIIllII[5]))) {
            n3 = llIIllIIllII[6];

            if ((0x8A ^ 0xA6 ^ (0x39 ^ 0x11)) != (0x90 ^ 0xBA ^ (0x60 ^ 0x4E))) {
                return ((18 + 110 - 98 + 98 ^ 83 + 70 - 101 + 91) & (0x7D ^ 0x64 ^ (0xC ^ 0x1A) ^ -1)) != 0;
            }
        } else {
            n3 = llIIllIIllII[7];
        }
        return n3 != 0;
    }

    @Provides
    SquireGorillaConfig a(ConfigManager configManager) {
        return (SquireGorillaConfig)configManager.getConfig(SquireGorillaConfig.class);
    }

    private static boolean llllllIIIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(c c2, d ... dArray) {
        if (!SquireGorillaPlugin.llllllIIIlIlll(c2.o()) || SquireGorillaPlugin.llllllIIIlIllI(c2.n().isEmpty() ? 1 : 0)) {
            void var30;
            void var31;
            var31.a(Arrays.stream(s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c.l).filter(arg_0 -> SquireGorillaPlugin.a((d[])var30, arg_0)).collect(Collectors.toList()));
            var31.b(llIIllIIllII[10]);
            var31.d(llIIllIIllII[6]);
        }
    }

    public int i() {
        return this.j;
    }

    private static boolean llllllIIIllIII(Object object) {
        return object == null;
    }

    private static boolean llllllIIIllIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private void e() {
        int n2 = this.b.getTickCount();
        Iterator<c> var32 = this.d.values().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(var32.hasNext() ? 1 : 0)) {
            WorldArea lllllllllllllllIlIIllIllllllIllI2;
            void var33;
            SquireGorillaPlugin var34;
            c var35 = var32.next();
            Player var36 = (Player)var35.m().getInteracting();
            f var37 = var34.i.get(var36);
            if (SquireGorillaPlugin.llllllIIIllIIl(var35.t()) && SquireGorillaPlugin.llllllIIIllIII(var36)) {
                var35.a(llIIllIIllII[7]);

                if ((0x44 ^ 0x40) < -1) {
                    return;
                }
            } else if (SquireGorillaPlugin.llllllIIIllIIl(var37) && SquireGorillaPlugin.llllllIIIllIIl(var37.r()) && SquireGorillaPlugin.llllllIIIllIll(var35.s() ? 1 : 0) && SquireGorillaPlugin.llllllIIIlllII((int)var33, var35.p()) && SquireGorillaPlugin.llllllIIIlIllI(var35.m().getWorldArea().isInMeleeDistance(var37.r()) ? 1 : 0)) {
                var35.a(llIIllIIllII[6]);
                var35.c((int)(var33 + llIIllIIllII[6]));
            }
            int var38 = var35.m().getAnimation();
            if (SquireGorillaPlugin.llllllIIIlIllI(var35.v() ? 1 : 0) && SquireGorillaPlugin.llllllIIIlllIl((int)var33, var35.p() + llIIllIIllII[11])) {
                var35.c((int)(var33 + llIIllIIllII[9]));
                var35.a(llIIllIIllII[6]);
                if (SquireGorillaPlugin.llllllIIIllIIl(var37) && SquireGorillaPlugin.llllllIIIllIIl(var37.r()) && SquireGorillaPlugin.llllllIIIllIll(var35.m().getWorldArea().isInMeleeDistance(var37.r()) ? 1 : 0) && SquireGorillaPlugin.llllllIIIllIll(var35.m().getWorldArea().intersectsWith(var37.r()) ? 1 : 0)) {
                    var35.a(var35.n().stream().filter(d2 -> {
                        boolean bl;
                        if (SquireGorillaPlugin.llllllIIIlllll(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                            bl = llIIllIIllII[6];

                            }
                        } else {
                            bl = llIIllIIllII[7];
                        }
                        return bl;
                    }).collect(Collectors.toList()));
                    if (SquireGorillaPlugin.llllllIIIllIIl(var36)) {
                        d[] dArray = new d[llIIllIIllII[9]];
                        dArray[SquireGorillaPlugin.llIIllIIllII[7]] = s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE;
                        dArray[SquireGorillaPlugin.llIIllIIllII[6]] = var34.a(var36);
                        var34.a(var35, dArray);

                        if (2 <= 0) {
                            return;
                        }
                    }
                }
            } else if (SquireGorillaPlugin.llllllIIIlIlII(var38, var35.q())) {
                if (SquireGorillaPlugin.llllllIIIlIlIl(var38, llIIllIIllII[23])) {
                    var34.a(var35, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE);

                    if (-1 >= 1) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIlIl(var38, llIIllIIllII[24])) {
                    var34.a(var35, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC);

                    }
                } else if (SquireGorillaPlugin.llllllIIIlIlIl(var38, llIIllIIllII[25])) {
                    var34.a(var35, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED);

                    if (1 < 0) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIlIl(var38, llIIllIIllII[26]) && SquireGorillaPlugin.llllllIIIllIIl(var36)) {
                    if (SquireGorillaPlugin.llllllIIIllIlI(var35.l(), var35.A())) {
                        var34.a(var35, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.BOULDER);

                        if (((0x5D ^ 0x17 ^ 104 + 13 - 94 + 104) & (25 + 152 - 37 + 29 ^ 83 + 116 - 43 + 0 ^ -1)) != 0) {
                            return;
                        }
                    } else {
                        if (SquireGorillaPlugin.llllllIIIlllIl((int)var33, var35.p())) {
                            var35.c(llIIllIIllII[6]);
                            int lllllllllllllllIlIIllIllllllIllI2 = var35.w();
                            if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIllI2, llIIllIIllII[27])) {
                                var34.a(var35, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC);

                                if (((0xA3 ^ 0xBE ^ (8 ^ 0x37)) & (0xB2 ^ 0x81 ^ (0x6F ^ 0x7E) ^ -1)) == (0x12 ^ 0x7A ^ (0xD6 ^ 0xBA))) {
                                    return;
                                }
                            } else if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIllI2, llIIllIIllII[28])) {
                                var34.a(var35, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED);

                                }
                            } else if (SquireGorillaPlugin.llllllIIIllIIl(var37)) {
                                WorldArea var39 = var37.r();
                                if (SquireGorillaPlugin.llllllIIIllIIl(var39) && SquireGorillaPlugin.llllllIIIlIllI(var34.g.stream().anyMatch(worldPoint -> {
                                    boolean bl;
                                    if (SquireGorillaPlugin.llllllIIIllIll(worldPoint.distanceTo(var39))) {
                                        bl = llIIllIIllII[6];

                                        if (((0x46 ^ 0x77) & ~(0x2D ^ 0x1C)) == 1) {
                                            return false;
                                        }
                                    } else {
                                        bl = llIIllIIllII[7];
                                    }
                                    return bl;
                                }) ? 1 : 0)) {
                                    var34.a(var35, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.BOULDER);

                                    if (((0x1B ^ 0x24) & ~(0x88 ^ 0xB7)) >= (0x46 ^ 0x42)) {
                                        return;
                                    }
                                } else if (SquireGorillaPlugin.llllllIIIllIll(var37.E().isEmpty() ? 1 : 0)) {
                                    var34.a(var35, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE);
                                }
                            }
                        }
                        var35.c((int)(var33 + llIIllIIllII[12]));
                        var35.c(llIIllIIllII[6]);
                    }
                }
            }
            if (SquireGorillaPlugin.llllllIIIlIlll(var35.B())) {
                var35.f(var35.B() - llIIllIIllII[6]);

                }
            } else if (SquireGorillaPlugin.llllllIIIlIllI(var35.s() ? 1 : 0) && SquireGorillaPlugin.llllllIIIllIIl(var35.m().getInteracting()) && SquireGorillaPlugin.llllllIIIllIll(var35.y() ? 1 : 0) && SquireGorillaPlugin.llllllIIIlllIl(var35.n().size(), llIIllIIllII[9]) && SquireGorillaPlugin.llllllIIIlIllI(var35.n().stream().anyMatch(d2 -> {
                boolean bl;
                if (SquireGorillaPlugin.llllllIIIllIlI(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                    bl = llIIllIIllII[6];

                    if (2 == 3) {
                        return false;
                    }
                } else {
                    bl = llIIllIIllII[7];
                }
                return bl;
            }) ? 1 : 0) && SquireGorillaPlugin.llllllIIIllIIl(var37) && SquireGorillaPlugin.llllllIIIllIIl(var37.r()) && SquireGorillaPlugin.llllllIIIllIIl(var35.r()) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIllllllIllI2 = var35.r().calculateNextTravellingPoint(var34.b.getTopLevelWorldView(), var37.r(), llIIllIIllII[6], worldPoint -> {
                int n2;
                WorldArea worldArea = new WorldArea(worldPoint, llIIllIIllII[6], llIIllIIllII[6]);
                if (SquireGorillaPlugin.llllllIIIlIllI(this.d.values().stream().noneMatch(c3 -> {
                    int n2;
                    void var40;
                    WorldArea var41;
                    WorldArea worldArea2;
                    c var42;
                    void var43;
                    if (SquireGorillaPlugin.llllllIIIllIlI(c3, var35)) {
                        return llIIllIIllII[7];
                    }
                    if (SquireGorillaPlugin.llllllIIIlllII(var43.m().getIndex(), var42.m().getIndex())) {
                        worldArea2 = var43.m().getWorldArea();

                        }
                    } else {
                        worldArea2 = var43.r();
                    }
                    if (SquireGorillaPlugin.llllllIIIllIIl(var41 = worldArea2) && SquireGorillaPlugin.llllllIIIlIllI(var40.intersectsWith(var41) ? 1 : 0)) {
                        n2 = llIIllIIllII[6];

                        if ((0x73 ^ 0x47 ^ (0x1E ^ 0x2F)) <= 0) {
                            return ((0xBC ^ 0x87 ^ (0xE1 ^ 0xC4)) & (146 + 46 - 191 + 170 ^ 134 + 63 - 40 + 24 ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIllIIllII[7];
                    }
                    return n2 != 0;
                }) ? 1 : 0) && SquireGorillaPlugin.llllllIIIlIllI(this.i.values().stream().noneMatch(f2 -> {
                    int n2;
                    WorldArea worldArea2 = f2.r();
                    if (SquireGorillaPlugin.llllllIIIllIIl(worldArea2) && SquireGorillaPlugin.llllllIIIlIllI(worldArea.intersectsWith(worldArea2) ? 1 : 0)) {
                        n2 = llIIllIIllII[6];

                        if (3 <= 1) {
                            return ((0xF4 ^ 0x8E ^ (0x3F ^ 0x1F)) & (0xE2 ^ 0xBC ^ (0x8D ^ 0x89) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIllIIllII[7];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    n2 = llIIllIIllII[6];

                    if (1 <= ((0x32 ^ 7) & ~(0xA1 ^ 0x94))) {
                        return false;
                    }
                } else {
                    n2 = llIIllIIllII[7];
                }
                return n2 != 0;
            }))) {
                int var39 = var35.m().getWorldArea().distanceTo(var37.r());
                WorldPoint var44 = lllllllllllllllIlIIllIllllllIllI2.toWorldPoint();
                if (SquireGorillaPlugin.llllllIIIllllI(var39, llIIllIIllII[17]) && SquireGorillaPlugin.llllllIIIlIllI(var37.r().hasLineOfSightTo(var34.b.getTopLevelWorldView(), var35.r()) ? 1 : 0)) {
                    if (SquireGorillaPlugin.llllllIIIlIllI(var44.distanceTo(var35.r().toWorldPoint()))) {
                        if (SquireGorillaPlugin.llllllIIIllIll(var44.distanceTo(var35.m().getWorldLocation()))) {
                            var35.a(var35.n().stream().filter(d2 -> {
                                boolean bl;
                                if (SquireGorillaPlugin.llllllIIIllIlI(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                                    bl = llIIllIIllII[6];

                                    if ((0x5A ^ 0x21 ^ 77 + 78 - 86 + 58) < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIllIIllII[7];
                                }
                                return bl;
                            }).collect(Collectors.toList()));

                        } else {
                            var35.a(var35.n().stream().filter(d2 -> {
                                boolean bl;
                                if (SquireGorillaPlugin.llllllIIIlllll(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                                    bl = llIIllIIllII[6];

                                    if (3 >= (0x6B ^ 0xD ^ (9 ^ 0x6B))) {
                                        return ((0xEE ^ 0xAE ^ (0x53 ^ 0x38)) & (37 + 100 - 57 + 103 ^ 71 + 39 - -45 + 1 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIIllIIllII[7];
                                }
                                return bl;
                            }).collect(Collectors.toList()));

                            if (((174 + 13 - 49 + 79 ^ 106 + 32 - 72 + 75) & (118 + 156 - 115 + 36 ^ 79 + 105 - 164 + 131 ^ -1)) != 0) {
                                return;
                            }
                        }
                    } else if (SquireGorillaPlugin.llllllIIIlllIl((int)var33, var35.p()) && SquireGorillaPlugin.llllllIIIlIlIl(var35.w(), llIIllIIllII[29]) && SquireGorillaPlugin.llllllIIIlIllI(var34.g.stream().noneMatch(worldPoint -> {
                        boolean bl;
                        if (SquireGorillaPlugin.llllllIIIllIll(worldPoint.distanceTo(var37.r()))) {
                            bl = llIIllIIllII[6];

                            if ((0x8A ^ 0x8E) < 0) {
                                return false;
                            }
                        } else {
                            bl = llIIllIIllII[7];
                        }
                        return bl;
                    }) ? 1 : 0)) {
                        var35.a(var35.n().stream().filter(d2 -> {
                            boolean bl;
                            if (SquireGorillaPlugin.llllllIIIllIlI(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                                bl = llIIllIIllII[6];

                            } else {
                                bl = llIIllIIllII[7];
                            }
                            return bl;
                        }).collect(Collectors.toList()));
                    }
                }
            }
            if (SquireGorillaPlugin.llllllIIIlIllI(var35.v() ? 1 : 0)) {
                var35.a(llIIllIIllII[6]);
            }
            if (SquireGorillaPlugin.llllllIIIlllll(var35.l(), var35.A())) {
                if (!SquireGorillaPlugin.llllllIIIllIll(var35.z() ? 1 : 0) || SquireGorillaPlugin.llllllIIIlIllI(var35.y() ? 1 : 0)) {
                    var35.f(llIIllIIllII[9]);

                    if (-(0xA2 ^ 0xA6) >= 0) {
                        return;
                    }
                } else {
                    var35.f(llIIllIIllII[6]);
                }
            }
            var35.d(var35.m().getAnimation());
            var35.a(var35.m().getWorldArea());
            var35.a(var35.m().getInteracting());
            if (SquireGorillaPlugin.llllllIIIllIIl(var35.t())) {
                var35.b(var35.t());
            }
            var35.b(llIIllIIllII[7]);
            var35.c(llIIllIIllII[7]);
            var35.e(var35.y());
            var35.d(llIIllIIllII[7]);
            var35.a(var35.l());
            var35.e(llIIllIIllII[29]);

            if (((0xB6 ^ 0x8B ^ (0x38 ^ 0x1E)) & (0x7B ^ 0x38 ^ (0xD3 ^ 0x8B) ^ -1)) == 0) continue;
            return;
        }
    }

    @Subscribe
    private void a(PlayerSpawned playerSpawned) {
        if (SquireGorillaPlugin.llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
            return;
        }
        Player player = playerSpawned.getPlayer();
        this.i.put(player, new f(player));

    }

    protected void onStop() {
        this.d = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f.remove((Overlay)this.e);

    }

    private static boolean llllllIIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllllIIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private d a(Player player) {
        void var45;
        HeadIcon headIcon = player.getOverheadIcon();
        if (SquireGorillaPlugin.llllllIIIllIII(headIcon)) {
            return null;
        }
        switch (s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.a.k[var45.ordinal()]) {
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
        if (SquireGorillaPlugin.llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
            return;
        }
        this.i.remove(playerDespawned.getPlayer());

    }

    @Subscribe
    private void a(GameStateChanged gameStateChanged) {
        GameState gameState = gameStateChanged.getGameState();
        if (!SquireGorillaPlugin.llllllIIIlllll(gameState, GameState.LOGGING_IN) || !SquireGorillaPlugin.llllllIIIlllll(gameState, GameState.CONNECTION_LOST) || SquireGorillaPlugin.llllllIIIllIlI(gameState, GameState.HOPPING)) {
            SquireGorillaPlugin var46;
            var46.b();
        }
    }

    private void d() {
        this.i.clear();
        Iterator var47 = this.b.getPlayers().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(var47.hasNext() ? 1 : 0)) {
            SquireGorillaPlugin var48;
            Player var49 = (Player)var47.next();
            var48.i.put(var49, new f(var49));

            if (((0x7D ^ 0x5F) & ~(0xB3 ^ 0x91)) >= ((0xB0 ^ 0xA7) & ~(0x13 ^ 4))) continue;
            return;
        }
    }

    private static boolean llllllIIIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    public c a(NPC nPC) {
        return this.d.getOrDefault(nPC, null);
    }

    private static boolean llllllIIIllIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(HitsplatApplied hitsplatApplied) {
        SquireGorillaPlugin var50;
        void var51;
        if (SquireGorillaPlugin.llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
            return;
        }
        if (SquireGorillaPlugin.llllllIIIlIllI(var51.getActor() instanceof Player)) {
            Player var52 = (Player)var51.getActor();
            f var53 = var50.i.get(var52);
            if (SquireGorillaPlugin.llllllIIIllIIl(var53)) {
                var53.E().add(var51.getHitsplat());

            }

            if ((0x60 ^ 0x65) == 0) {
                return;
            }
        } else if (SquireGorillaPlugin.llllllIIIlIllI(var51.getActor() instanceof NPC)) {
            c var52 = var50.d.get(var51.getActor());
            int var53 = var51.getHitsplat().getHitsplatType();
            if (SquireGorillaPlugin.llllllIIIllIIl(var52) && (!SquireGorillaPlugin.llllllIIIlIlII(var53, llIIllIIllII[19]) || SquireGorillaPlugin.llllllIIIlIlIl(var53, llIIllIIllII[8]))) {
                var52.b(llIIllIIllII[6]);
            }
        }
    }

    private static boolean llllllIIIlllll(Object object, Object object2) {
        return object != object2;
    }
}

