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
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.a_Unknown;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c_Unknown;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.f;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.g;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.TurningOnRunTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.WalkingToCavernTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.BankingTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.RestoringStatsTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.WalkingToGateTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.AttackingGorillaTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DetectingMeleeTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DodgingBouldersTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.HandlingGearTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.HandlingPrayerTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.HoppingTooBusyTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.AlchingItemTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DrinkingPotionTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.EatingFoodTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.LootingGorillaTask;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.TeleportingOutTask;

@PluginDescriptor(name="Squire Demonic Gorillas", enabledByDefault=false)
@SquireUtil
public class SquireGorillaPlugin
extends SquirePlugin {
    private /* synthetic */ List<g> h;
    @Inject
    private /* synthetic */ Client b;
    private /* synthetic */ List<WorldPoint> g;
    private /* synthetic */ Map<NPC, c> d;
    private static /* synthetic */ int[] llIIllIIllII;
    @Inject
    private /* synthetic */ GorillaInfoBox e;
    @Inject
    private /* synthetic */ OverlayManager f;
    private /* synthetic */ Map<Player, f> i;
    private /* synthetic */ int j;
    private static final /* synthetic */ Set<Integer> a;
    @Inject
    private /* synthetic */ ClientThread c;

    public Map<NPC, c> h() {
        return this.d;
    }

    private void c() {
        this.d.clear();
        Iterator var20 = this.b.getNpcs().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(var20.hasNext() ? 1 : 0)) {
            NPC var1 = (NPC)var20.next();
            if (SquireGorillaPlugin.llllllIIIlIllI(SquireGorillaPlugin.a(var1.getId()) ? 1 : 0)) {
                SquireGorillaPlugin var7;
                var7.d.put(var1, new c(var1));
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
        if (SquireGorillaPlugin.llllllIIIllIIl(c2)) {
            SquireGorillaPlugin var51;
            if (SquireGorillaPlugin.llllllIIIllIlI(c2.u(), Players.getLocal())) {
                this.j += llIIllIIllII[6];
            }
            if (SquireGorillaPlugin.llllllIIIlIllI(var51.d.isEmpty() ? 1 : 0)) {
                var51.a();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f() {
        void var53;
        Iterator<g> iterator = this.h.iterator();
        int var36 = this.b.getTickCount();
        while (SquireGorillaPlugin.llllllIIIlIllI(var53.hasNext() ? 1 : 0)) {
            g var19 = (g)var53.next();
            if (SquireGorillaPlugin.llllllIIIlllIl(var36, var19.I())) {
                SquireGorillaPlugin var2;
                int var41 = llIIllIIllII[7];
                c var16 = var19.F();
                f var38 = var2.i.get(var19.H());
                if (SquireGorillaPlugin.llllllIIIllIII(var38)) {
                    var41 = llIIllIIllII[6];
                    0;
                    if (-1 > 0) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIllI(var38.E().isEmpty() ? 1 : 0)) {
                    var41 = llIIllIIllII[6];
                    0;
                    
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIllI(var38.E().stream().anyMatch(hitsplat -> {
                    boolean bl;
                    if (SquireGorillaPlugin.llllllIIIlIlIl(hitsplat.getHitsplatType(), llIIllIIllII[19])) {
                        bl = llIIllIIllII[6];
                        0;
                        if (-3 >= 0) {
                            return ((0x6B ^ 0x74 ^ (0x11 ^ 0x3D)) & (0x1F ^ 0x13 ^ (0x6A ^ 0x55) ^ -1)) != 0;
                        }
                    } else {
                        bl = llIIllIIllII[7];
                    }
                    return bl;
                }) ? 1 : 0)) {
                    var41 = llIIllIIllII[6];
                }
                if (SquireGorillaPlugin.llllllIIIlIllI(var41)) {
                    var16.b(var16.o() - llIIllIIllII[6]);
                    var2.a(var16, new d[llIIllIIllII[7]]);
                }
                var53.remove();
            }
            0;
            if (3 != -1) continue;
            return;
        }
    }

    static {
        SquireGorillaPlugin.llllllIIIlIIll();
        a = ImmutableSet.of((Object)llIIllIIllII[28], (Object)llIIllIIllII[27], (Object)llIIllIIllII[30]);
    }

    private static /* synthetic */ boolean b(d d2, d d3) {
        boolean bl;
        if (SquireGorillaPlugin.llllllIIIllIlI((Object)d3, (Object)d2)) {
            bl = llIIllIIllII[6];
            0;
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
        void var44;
        int var31;
        int n2;
        void var49;
        void var29;
        d var10;
        c2.a(llIIllIIllII[6]);
        Player player = (Player)c2.m().getInteracting();
        Object var4_4 = null;
        if (SquireGorillaPlugin.llllllIIIllIIl(player)) {
            var10 = this.a(player);
        }
        if (!SquireGorillaPlugin.llllllIIIllIIl(var29) || SquireGorillaPlugin.llllllIIIllIIl(var49) && SquireGorillaPlugin.llllllIIIlIllI(var49.equals((Object)var10) ? 1 : 0)) {
            n2 = llIIllIIllII[6];
            0;
            if (3 == (7 + 100 - 95 + 116 ^ 65 + 69 - 130 + 128)) {
                return;
            }
        } else {
            n2 = var31 = llIIllIIllII[7];
        }
        if (SquireGorillaPlugin.llllllIIIllIlI(var49, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.BOULDER)) {
            var44.a(var44.n().stream().filter(d2 -> {
                boolean bl;
                if (SquireGorillaPlugin.llllllIIIlllll(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE)) {
                    bl = llIIllIIllII[6];
                    0;
                    if (-(0x2E ^ 0x2A) > 0) {
                        return false;
                    }
                } else {
                    bl = llIIllIIllII[7];
                }
                return bl;
            }).collect(Collectors.toList()));
            0;
            if (2 == 3) {
                return;
            }
        } else {
            if (SquireGorillaPlugin.llllllIIIlIllI(var31)) {
                var44.b(var44.o() - llIIllIIllII[6]);
                0;
                if (3 <= 0) {
                    return;
                }
            } else {
                f lllllllllllllllIlIIlllIIIIIIlIlI2;
                WorldArea lllllllllllllllIlIIlllIIIIIIlIIl2;
                SquireGorillaPlugin var39;
                int var21 = var39.b.getTickCount();
                if (SquireGorillaPlugin.llllllIIIllIlI(var49, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MAGIC)) {
                    f lllllllllllllllIlIIlllIIIIIIlIlI2 = var39.i.get(var29);
                    WorldArea lllllllllllllllIlIIlllIIIIIIlIIl2 = lllllllllllllllIlIIlllIIIIIIlIlI2.r();
                    if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIlllIIIIIIlIIl2)) {
                        int var52 = var44.m().getWorldArea().distanceTo(lllllllllllllllIlIIlllIIIIIIlIIl2);
                        var21 += (var52 + llIIllIIllII[19]) / llIIllIIllII[15];
                    }
                    0;
                    if (3 <= 0) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIllIlI(var49, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.RANGED) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIlllIIIIIIlIIl2 = (lllllllllllllllIlIIlllIIIIIIlIlI2 = var39.i.get(var29)).r())) {
                    int var52 = var44.m().getWorldArea().distanceTo(lllllllllllllllIlIIlllIIIIIIlIIl2);
                    var21 += (var52 + llIIllIIllII[16]) / llIIllIIllII[13];
                }
                var39.h.add(new g((c)var44, (d)var49, (Player)var29, var21));
                0;
            }
            var44.a(var44.n().stream().filter(arg_0 -> SquireGorillaPlugin.b((d)var49, arg_0)).collect(Collectors.toList()));
            if (SquireGorillaPlugin.llllllIIIlIllI(var44.n().isEmpty() ? 1 : 0)) {
                int n3;
                var44.a(Arrays.stream(s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c_Unknown.l).filter(arg_0 -> SquireGorillaPlugin.a((d)var49, arg_0)).collect(Collectors.toList()));
                int n4 = llIIllIIllII[10];
                if (SquireGorillaPlugin.llllllIIIlIllI(var31)) {
                    n3 = llIIllIIllII[6];
                    0;
                    if ((0xBB ^ 0xBF) > (0x72 ^ 0x76)) {
                        return;
                    }
                } else {
                    n3 = llIIllIIllII[7];
                }
                var44.b(n4 - n3);
            }
        }
        d[] dArray = new d[llIIllIIllII[6]];
        dArray[SquireGorillaPlugin.llIIllIIllII[7]] = var4_4;
        this.a(c2, dArray);
        int n5 = this.b.getTickCount();
        c2.c(n5 + llIIllIIllII[12]);
    }

    private void g() {
        Iterator<f> var42 = this.i.values().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(var42.hasNext() ? 1 : 0)) {
            f var43 = var42.next();
            var43.a(var43.D().getWorldArea());
            var43.E().clear();
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
        if (SquireGorillaPlugin.llllllIIIlIllI(SquireGorillaPlugin.a(nPC.getId()) ? 1 : 0)) {
            void var24;
            SquireGorillaPlugin var34;
            if (SquireGorillaPlugin.llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
                this.d();
            }
            var34.d.put((NPC)var24, new c((NPC)var24));
            0;
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
        void var35;
        void var17;
        SquireGorillaPlugin var48;
        Projectile projectile = projectileSpawned.getProjectile();
        int n2 = projectile.getId();
        if (SquireGorillaPlugin.llllllIIIllIll(a.contains(n2) ? 1 : 0)) {
            return;
        }
        WorldPoint var5 = WorldPoint.fromLocal((Client)var48.b, (int)var17.getX1(), (int)var17.getY1(), (int)var48.b.getPlane());
        if (SquireGorillaPlugin.llllllIIIlIlIl((int)var35, llIIllIIllII[30])) {
            var48.g.add(var5);
            0;
            0;
            if (((0x45 ^ 0x26) & ~(0xC3 ^ 0xA0)) != 0) {
                return;
            }
        } else {
            Iterator<c> var26 = var48.d.values().iterator();
            while (SquireGorillaPlugin.llllllIIIlIllI(var26.hasNext() ? 1 : 0)) {
                c var32 = var26.next();
                if (SquireGorillaPlugin.llllllIIIllIll(var32.m().getWorldLocation().distanceTo(var5))) {
                    var32.e(var17.getId());
                }
                0;
                
                return;
            }
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIllIIllII[8]];
        classArray[SquireGorillaPlugin.llIIllIIllII[7]] = r.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[6]] = s.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[9]] = q.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[10]] = o.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[11]] = u.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[12]] = p.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[13]] = y.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[14]] = l.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[15]] = n.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[16]] = k.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[17]] = x.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[18]] = z.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[19]] = v.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[20]] = w.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[21]] = i.class;
        classArray[SquireGorillaPlugin.llIIllIIllII[22]] = m.class;
        return classArray;
    }

    private static /* synthetic */ boolean a(d d2, d d3) {
        boolean bl;
        if (SquireGorillaPlugin.llllllIIIllIlI((Object)d3, (Object)d2)) {
            bl = llIIllIIllII[6];
            0;
            if (-1 >= ((0x64 ^ 0x79) & ~(0x98 ^ 0x85))) {
                return false;
            }
        } else {
            bl = llIIllIIllII[7];
        }
        return bl;
    }

    private static /* synthetic */ boolean a(d[] dArray, d d2) {
        return Arrays.stream(dArray).noneMatch(d3 -> {
            boolean bl;
            if (SquireGorillaPlugin.llllllIIIllIlI((Object)d2, d3)) {
                bl = llIIllIIllII[6];
                0;
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
        0;
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
            0;
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
            void var12;
            void var40;
            var40.a(Arrays.stream(s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c_Unknown.l).filter(arg_0 -> SquireGorillaPlugin.a((d[])var12, arg_0)).collect(Collectors.toList()));
            var40.b(llIIllIIllII[10]);
            var40.d(llIIllIIllII[6]);
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
        Iterator<c> var25 = this.d.values().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(var25.hasNext() ? 1 : 0)) {
            WorldArea lllllllllllllllIlIIllIllllllIllI2;
            void var50;
            SquireGorillaPlugin var47;
            c var45 = var25.next();
            Player var3 = (Player)var45.m().getInteracting();
            f var15 = var47.i.get(var3);
            if (SquireGorillaPlugin.llllllIIIllIIl(var45.t()) && SquireGorillaPlugin.llllllIIIllIII(var3)) {
                var45.a(llIIllIIllII[7]);
                0;
                if ((0x44 ^ 0x40) < -1) {
                    return;
                }
            } else if (SquireGorillaPlugin.llllllIIIllIIl(var15) && SquireGorillaPlugin.llllllIIIllIIl(var15.r()) && SquireGorillaPlugin.llllllIIIllIll(var45.s() ? 1 : 0) && SquireGorillaPlugin.llllllIIIlllII((int)var50, var45.p()) && SquireGorillaPlugin.llllllIIIlIllI(var45.m().getWorldArea().isInMeleeDistance(var15.r()) ? 1 : 0)) {
                var45.a(llIIllIIllII[6]);
                var45.c((int)(var50 + llIIllIIllII[6]));
            }
            int var18 = var45.m().getAnimation();
            if (SquireGorillaPlugin.llllllIIIlIllI(var45.v() ? 1 : 0) && SquireGorillaPlugin.llllllIIIlllIl((int)var50, var45.p() + llIIllIIllII[11])) {
                var45.c((int)(var50 + llIIllIIllII[9]));
                var45.a(llIIllIIllII[6]);
                if (SquireGorillaPlugin.llllllIIIllIIl(var15) && SquireGorillaPlugin.llllllIIIllIIl(var15.r()) && SquireGorillaPlugin.llllllIIIllIll(var45.m().getWorldArea().isInMeleeDistance(var15.r()) ? 1 : 0) && SquireGorillaPlugin.llllllIIIllIll(var45.m().getWorldArea().intersectsWith(var15.r()) ? 1 : 0)) {
                    var45.a(var45.n().stream().filter(d2 -> {
                        boolean bl;
                        if (SquireGorillaPlugin.llllllIIIlllll(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE)) {
                            bl = llIIllIIllII[6];
                            0;
                            
                            }
                        } else {
                            bl = llIIllIIllII[7];
                        }
                        return bl;
                    }).collect(Collectors.toList()));
                    if (SquireGorillaPlugin.llllllIIIllIIl(var3)) {
                        d[] dArray = new d[llIIllIIllII[9]];
                        dArray[SquireGorillaPlugin.llIIllIIllII[7]] = s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE;
                        dArray[SquireGorillaPlugin.llIIllIIllII[6]] = var47.a(var3);
                        var47.a(var45, dArray);
                        0;
                        if (2 <= 0) {
                            return;
                        }
                    }
                }
            } else if (SquireGorillaPlugin.llllllIIIlIlII(var18, var45.q())) {
                if (SquireGorillaPlugin.llllllIIIlIlIl(var18, llIIllIIllII[23])) {
                    var47.a(var45, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE);
                    0;
                    if (-1 >= 1) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIlIl(var18, llIIllIIllII[24])) {
                    var47.a(var45, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MAGIC);
                    0;
                    
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIlIl(var18, llIIllIIllII[25])) {
                    var47.a(var45, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.RANGED);
                    0;
                    if (1 < 0) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIlIl(var18, llIIllIIllII[26]) && SquireGorillaPlugin.llllllIIIllIIl(var3)) {
                    if (SquireGorillaPlugin.llllllIIIllIlI(var45.l(), var45.A())) {
                        var47.a(var45, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.BOULDER);
                        0;
                        if (((0x5D ^ 0x17 ^ 104 + 13 - 94 + 104) & (25 + 152 - 37 + 29 ^ 83 + 116 - 43 + 0 ^ -1)) != 0) {
                            return;
                        }
                    } else {
                        if (SquireGorillaPlugin.llllllIIIlllIl((int)var50, var45.p())) {
                            var45.c(llIIllIIllII[6]);
                            int lllllllllllllllIlIIllIllllllIllI2 = var45.w();
                            if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIllI2, llIIllIIllII[27])) {
                                var47.a(var45, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MAGIC);
                                0;
                                if (((0xA3 ^ 0xBE ^ (8 ^ 0x37)) & (0xB2 ^ 0x81 ^ (0x6F ^ 0x7E) ^ -1)) == (0x12 ^ 0x7A ^ (0xD6 ^ 0xBA))) {
                                    return;
                                }
                            } else if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIllI2, llIIllIIllII[28])) {
                                var47.a(var45, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.RANGED);
                                0;
                                
                                }
                            } else if (SquireGorillaPlugin.llllllIIIllIIl(var15)) {
                                WorldArea var9 = var15.r();
                                if (SquireGorillaPlugin.llllllIIIllIIl(var9) && SquireGorillaPlugin.llllllIIIlIllI(var47.g.stream().anyMatch(worldPoint -> {
                                    boolean bl;
                                    if (SquireGorillaPlugin.llllllIIIllIll(worldPoint.distanceTo(var9))) {
                                        bl = llIIllIIllII[6];
                                        0;
                                        if (((0x46 ^ 0x77) & ~(0x2D ^ 0x1C)) == 1) {
                                            return false;
                                        }
                                    } else {
                                        bl = llIIllIIllII[7];
                                    }
                                    return bl;
                                }) ? 1 : 0)) {
                                    var47.a(var45, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.BOULDER);
                                    0;
                                    if (((0x1B ^ 0x24) & ~(0x88 ^ 0xB7)) >= (0x46 ^ 0x42)) {
                                        return;
                                    }
                                } else if (SquireGorillaPlugin.llllllIIIllIll(var15.E().isEmpty() ? 1 : 0)) {
                                    var47.a(var45, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE);
                                }
                            }
                        }
                        var45.c((int)(var50 + llIIllIIllII[12]));
                        var45.c(llIIllIIllII[6]);
                    }
                }
            }
            if (SquireGorillaPlugin.llllllIIIlIlll(var45.B())) {
                var45.f(var45.B() - llIIllIIllII[6]);
                0;
                
                }
            } else if (SquireGorillaPlugin.llllllIIIlIllI(var45.s() ? 1 : 0) && SquireGorillaPlugin.llllllIIIllIIl(var45.m().getInteracting()) && SquireGorillaPlugin.llllllIIIllIll(var45.y() ? 1 : 0) && SquireGorillaPlugin.llllllIIIlllIl(var45.n().size(), llIIllIIllII[9]) && SquireGorillaPlugin.llllllIIIlIllI(var45.n().stream().anyMatch(d2 -> {
                boolean bl;
                if (SquireGorillaPlugin.llllllIIIllIlI(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE)) {
                    bl = llIIllIIllII[6];
                    0;
                    if (2 == 3) {
                        return false;
                    }
                } else {
                    bl = llIIllIIllII[7];
                }
                return bl;
            }) ? 1 : 0) && SquireGorillaPlugin.llllllIIIllIIl(var15) && SquireGorillaPlugin.llllllIIIllIIl(var15.r()) && SquireGorillaPlugin.llllllIIIllIIl(var45.r()) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIllllllIllI2 = var45.r().calculateNextTravellingPoint(var47.b.getTopLevelWorldView(), var15.r(), llIIllIIllII[6], worldPoint -> {
                int n2;
                WorldArea worldArea = new WorldArea(worldPoint, llIIllIIllII[6], llIIllIIllII[6]);
                if (SquireGorillaPlugin.llllllIIIlIllI(this.d.values().stream().noneMatch(c3 -> {
                    int n2;
                    void var11;
                    WorldArea var30;
                    WorldArea worldArea2;
                    c var33;
                    void var4;
                    if (SquireGorillaPlugin.llllllIIIllIlI(c3, var45)) {
                        return llIIllIIllII[7];
                    }
                    if (SquireGorillaPlugin.llllllIIIlllII(var4.m().getIndex(), var33.m().getIndex())) {
                        worldArea2 = var4.m().getWorldArea();
                        0;
                        
                        }
                    } else {
                        worldArea2 = var4.r();
                    }
                    if (SquireGorillaPlugin.llllllIIIllIIl(var30 = worldArea2) && SquireGorillaPlugin.llllllIIIlIllI(var11.intersectsWith(var30) ? 1 : 0)) {
                        n2 = llIIllIIllII[6];
                        0;
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
                        0;
                        if (3 <= 1) {
                            return ((0xF4 ^ 0x8E ^ (0x3F ^ 0x1F)) & (0xE2 ^ 0xBC ^ (0x8D ^ 0x89) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIllIIllII[7];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    n2 = llIIllIIllII[6];
                    0;
                    if (1 <= ((0x32 ^ 7) & ~(0xA1 ^ 0x94))) {
                        return false;
                    }
                } else {
                    n2 = llIIllIIllII[7];
                }
                return n2 != 0;
            }))) {
                int var9 = var45.m().getWorldArea().distanceTo(var15.r());
                WorldPoint var22 = lllllllllllllllIlIIllIllllllIllI2.toWorldPoint();
                if (SquireGorillaPlugin.llllllIIIllllI(var9, llIIllIIllII[17]) && SquireGorillaPlugin.llllllIIIlIllI(var15.r().hasLineOfSightTo(var47.b.getTopLevelWorldView(), var45.r()) ? 1 : 0)) {
                    if (SquireGorillaPlugin.llllllIIIlIllI(var22.distanceTo(var45.r().toWorldPoint()))) {
                        if (SquireGorillaPlugin.llllllIIIllIll(var22.distanceTo(var45.m().getWorldLocation()))) {
                            var45.a(var45.n().stream().filter(d2 -> {
                                boolean bl;
                                if (SquireGorillaPlugin.llllllIIIllIlI(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE)) {
                                    bl = llIIllIIllII[6];
                                    0;
                                    if ((0x5A ^ 0x21 ^ 77 + 78 - 86 + 58) < 0) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIllIIllII[7];
                                }
                                return bl;
                            }).collect(Collectors.toList()));
                            0;
                            if (-2 >= 0) {
                                return;
                            }
                        } else {
                            var45.a(var45.n().stream().filter(d2 -> {
                                boolean bl;
                                if (SquireGorillaPlugin.llllllIIIlllll(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE)) {
                                    bl = llIIllIIllII[6];
                                    0;
                                    if (3 >= (0x6B ^ 0xD ^ (9 ^ 0x6B))) {
                                        return ((0xEE ^ 0xAE ^ (0x53 ^ 0x38)) & (37 + 100 - 57 + 103 ^ 71 + 39 - -45 + 1 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIIllIIllII[7];
                                }
                                return bl;
                            }).collect(Collectors.toList()));
                            0;
                            if (((174 + 13 - 49 + 79 ^ 106 + 32 - 72 + 75) & (118 + 156 - 115 + 36 ^ 79 + 105 - 164 + 131 ^ -1)) != 0) {
                                return;
                            }
                        }
                    } else if (SquireGorillaPlugin.llllllIIIlllIl((int)var50, var45.p()) && SquireGorillaPlugin.llllllIIIlIlIl(var45.w(), llIIllIIllII[29]) && SquireGorillaPlugin.llllllIIIlIllI(var47.g.stream().noneMatch(worldPoint -> {
                        boolean bl;
                        if (SquireGorillaPlugin.llllllIIIllIll(worldPoint.distanceTo(var15.r()))) {
                            bl = llIIllIIllII[6];
                            0;
                            if ((0x8A ^ 0x8E) < 0) {
                                return false;
                            }
                        } else {
                            bl = llIIllIIllII[7];
                        }
                        return bl;
                    }) ? 1 : 0)) {
                        var45.a(var45.n().stream().filter(d2 -> {
                            boolean bl;
                            if (SquireGorillaPlugin.llllllIIIllIlI(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE)) {
                                bl = llIIllIIllII[6];
                                0;
                                if (-2 > 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIllIIllII[7];
                            }
                            return bl;
                        }).collect(Collectors.toList()));
                    }
                }
            }
            if (SquireGorillaPlugin.llllllIIIlIllI(var45.v() ? 1 : 0)) {
                var45.a(llIIllIIllII[6]);
            }
            if (SquireGorillaPlugin.llllllIIIlllll(var45.l(), var45.A())) {
                if (!SquireGorillaPlugin.llllllIIIllIll(var45.z() ? 1 : 0) || SquireGorillaPlugin.llllllIIIlIllI(var45.y() ? 1 : 0)) {
                    var45.f(llIIllIIllII[9]);
                    0;
                    if (-(0xA2 ^ 0xA6) >= 0) {
                        return;
                    }
                } else {
                    var45.f(llIIllIIllII[6]);
                }
            }
            var45.d(var45.m().getAnimation());
            var45.a(var45.m().getWorldArea());
            var45.a(var45.m().getInteracting());
            if (SquireGorillaPlugin.llllllIIIllIIl(var45.t())) {
                var45.b(var45.t());
            }
            var45.b(llIIllIIllII[7]);
            var45.c(llIIllIIllII[7]);
            var45.e(var45.y());
            var45.d(llIIllIIllII[7]);
            var45.a(var45.l());
            var45.e(llIIllIIllII[29]);
            0;
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
        void var14;
        HeadIcon headIcon = player.getOverheadIcon();
        if (SquireGorillaPlugin.llllllIIIllIII(headIcon)) {
            return null;
        }
        switch (s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.a_Unknown.k[var14.ordinal()]) {
            case 1: {
                return s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MELEE;
            }
            case 2: {
                return s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.RANGED;
            }
            case 3: {
                return s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum.MAGIC;
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
        0;
    }

    private static void llllllIIIlIIll() {
        llIIllIIllII = new int[31];
        SquireGorillaPlugin.llIIllIIllII[0] = -(0xFFFFD159 & 0x6EB7) & (0xFFFFFBFE & 0x5FF9);
        SquireGorillaPlugin.llIIllIIllII[1] = 0xFFFFBFED & 0x5BFB;
        SquireGorillaPlugin.llIIllIIllII[2] = 0xFFFFFBEB & 0x1FFE;
        SquireGorillaPlugin.llIIllIIllII[3] = -(0xFFFFD537 & 0x6EDD) & (0xFFFFFFFF & 0x5FFF);
        SquireGorillaPlugin.llIIllIIllII[4] = -(0xFFFFEA19 & 0x55E7) & (0xFFFFFBEE & 0x5FFD);
        SquireGorillaPlugin.llIIllIIllII[5] = 0xFFFFBFEF & 0x5BFD;
        SquireGorillaPlugin.llIIllIIllII[6] = 1;
        SquireGorillaPlugin.llIIllIIllII[7] = (162 + 6 - 15 + 40 ^ 30 + 67 - 16 + 49) & (113 + 134 - 109 + 61 ^ 78 + 25 - 16 + 45 ^ -1);
        SquireGorillaPlugin.llIIllIIllII[8] = 4 ^ 0x14;
        SquireGorillaPlugin.llIIllIIllII[9] = 2;
        SquireGorillaPlugin.llIIllIIllII[10] = 3;
        SquireGorillaPlugin.llIIllIIllII[11] = 42 + 26 - -31 + 98 ^ 138 + 33 - 150 + 172;
        SquireGorillaPlugin.llIIllIIllII[12] = 0x76 ^ 0x31 ^ (0x34 ^ 0x76);
        SquireGorillaPlugin.llIIllIIllII[13] = 61 + 125 - 109 + 71 ^ 131 + 87 - 148 + 76;
        SquireGorillaPlugin.llIIllIIllII[14] = 0x45 ^ 0x42;
        SquireGorillaPlugin.llIIllIIllII[15] = 0x43 ^ 0x4B;
        SquireGorillaPlugin.llIIllIIllII[16] = 0x50 ^ 0x59;
        SquireGorillaPlugin.llIIllIIllII[17] = 88 + 10 - -46 + 17 ^ 25 + 6 - -101 + 39;
        SquireGorillaPlugin.llIIllIIllII[18] = 0xB9 ^ 0xB2;
        SquireGorillaPlugin.llIIllIIllII[19] = 51 + 115 - 68 + 93 ^ 101 + 7 - 106 + 177;
        SquireGorillaPlugin.llIIllIIllII[20] = 0x31 ^ 0x6B ^ (0xD9 ^ 0x8E);
        SquireGorillaPlugin.llIIllIIllII[21] = 0xA ^ 0x53 ^ (0x39 ^ 0x6E);
        SquireGorillaPlugin.llIIllIIllII[22] = 0x85 ^ 0xB6 ^ (0x13 ^ 0x2F);
        SquireGorillaPlugin.llIIllIIllII[23] = -(0xFFFFFAC7 & 0x6779) & (0xFFFFFEFB & 0x7F7E);
        SquireGorillaPlugin.llIIllIIllII[24] = -(0xFFFFA4E7 & 0x7BDD) & (0xFFFFBEFF & 0x7DFD);
        SquireGorillaPlugin.llIIllIIllII[25] = 0xFFFFFDFF & 0x1E3B;
        SquireGorillaPlugin.llIIllIIllII[26] = 0xFFFFFDFD & 0x1E3E;
        SquireGorillaPlugin.llIIllIIllII[27] = 0xFFFFD5FA & 0x2F1D;
        SquireGorillaPlugin.llIIllIIllII[28] = 0xFFFF9FF7 & 0x651E;
        SquireGorillaPlugin.llIIllIIllII[29] = -1;
        SquireGorillaPlugin.llIIllIIllII[30] = -(0xFFFFBF89 & 0x6C77) & (0xFFFFEF59 & 0x3FFE);
    }

    @Subscribe
    private void a(GameStateChanged gameStateChanged) {
        GameState gameState = gameStateChanged.getGameState();
        if (!SquireGorillaPlugin.llllllIIIlllll(gameState, GameState.LOGGING_IN) || !SquireGorillaPlugin.llllllIIIlllll(gameState, GameState.CONNECTION_LOST) || SquireGorillaPlugin.llllllIIIllIlI(gameState, GameState.HOPPING)) {
            SquireGorillaPlugin var8;
            var8.b();
        }
    }

    private void d() {
        this.i.clear();
        Iterator var46 = this.b.getPlayers().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(var46.hasNext() ? 1 : 0)) {
            SquireGorillaPlugin var13;
            Player var23 = (Player)var46.next();
            var13.i.put(var23, new f(var23));
            0;
            0;
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
        SquireGorillaPlugin var27;
        void var28;
        if (SquireGorillaPlugin.llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
            return;
        }
        if (SquireGorillaPlugin.llllllIIIlIllI(var28.getActor() instanceof Player)) {
            Player var37 = (Player)var28.getActor();
            f var6 = var27.i.get(var37);
            if (SquireGorillaPlugin.llllllIIIllIIl(var6)) {
                var6.E().add(var28.getHitsplat());
                0;
            }
            0;
            if ((0x60 ^ 0x65) == 0) {
                return;
            }
        } else if (SquireGorillaPlugin.llllllIIIlIllI(var28.getActor() instanceof NPC)) {
            c var37 = var27.d.get(var28.getActor());
            int var6 = var28.getHitsplat().getHitsplatType();
            if (SquireGorillaPlugin.llllllIIIllIIl(var37) && (!SquireGorillaPlugin.llllllIIIlIlII(var6, llIIllIIllII[19]) || SquireGorillaPlugin.llllllIIIlIlIl(var6, llIIllIIllII[8]))) {
                var37.b(llIIllIIllII[6]);
            }
        }
    }

    private static boolean llllllIIIlllll(Object object, Object object2) {
        return object != object2;
    }
}

