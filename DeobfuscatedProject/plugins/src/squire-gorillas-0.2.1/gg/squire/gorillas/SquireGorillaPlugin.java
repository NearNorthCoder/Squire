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
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.f;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.g;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.i;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.k;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.l;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.m;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.n;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.o;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.p;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.q;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.r;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.s;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.u;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.v;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.w;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.x;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.y;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.z;

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
        Iterator lllllllllllllllIlIIlllIIIIlIlIll = this.b.getNpcs().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIlllIIIIlIlIll.hasNext() ? 1 : 0)) {
            NPC lllllllllllllllIlIIlllIIIIlIlIlI = (NPC)lllllllllllllllIlIIlllIIIIlIlIll.next();
            if (SquireGorillaPlugin.llllllIIIlIllI(SquireGorillaPlugin.a(lllllllllllllllIlIIlllIIIIlIlIlI.getId()) ? 1 : 0)) {
                SquireGorillaPlugin lllllllllllllllIlIIlllIIIIlIllII;
                lllllllllllllllIlIIlllIIIIlIllII.d.put(lllllllllllllllIlIIlllIIIIlIlIlI, new c(lllllllllllllllIlIIlllIIIIlIlIlI));
                "".length();
            }
            "".length();
            if ("  ".length() > 0) continue;
            return;
        }
    }

    @Subscribe
    private void a(NpcDespawned npcDespawned) {
        c c2 = this.d.remove(npcDespawned.getNpc());
        if (SquireGorillaPlugin.llllllIIIllIIl(c2)) {
            SquireGorillaPlugin lllllllllllllllIlIIllIlllIllIIII;
            if (SquireGorillaPlugin.llllllIIIllIlI(c2.u(), Players.getLocal())) {
                this.j += llIIllIIllII[6];
            }
            if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllIllIIII.d.isEmpty() ? 1 : 0)) {
                lllllllllllllllIlIIllIlllIllIIII.a();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f() {
        void lllllllllllllllIlIIllIllllIlllIl;
        Iterator<g> iterator = this.h.iterator();
        int lllllllllllllllIlIIllIllllIlllII = this.b.getTickCount();
        while (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllIlllIl.hasNext() ? 1 : 0)) {
            g lllllllllllllllIlIIllIllllIllIll = (g)lllllllllllllllIlIIllIllllIlllIl.next();
            if (SquireGorillaPlugin.llllllIIIlllIl(lllllllllllllllIlIIllIllllIlllII, lllllllllllllllIlIIllIllllIllIll.I())) {
                SquireGorillaPlugin lllllllllllllllIlIIllIllllIllllI;
                int lllllllllllllllIlIIllIllllIllIlI = llIIllIIllII[7];
                c lllllllllllllllIlIIllIllllIllIIl = lllllllllllllllIlIIllIllllIllIll.F();
                f lllllllllllllllIlIIllIllllIllIII = lllllllllllllllIlIIllIllllIllllI.i.get(lllllllllllllllIlIIllIllllIllIll.H());
                if (SquireGorillaPlugin.llllllIIIllIII(lllllllllllllllIlIIllIllllIllIII)) {
                    lllllllllllllllIlIIllIllllIllIlI = llIIllIIllII[6];
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllIllIII.E().isEmpty() ? 1 : 0)) {
                    lllllllllllllllIlIIllIllllIllIlI = llIIllIIllII[6];
                    "".length();
                    if (null != null) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllIllIII.E().stream().anyMatch(hitsplat -> {
                    boolean bl;
                    if (SquireGorillaPlugin.llllllIIIlIlIl(hitsplat.getHitsplatType(), llIIllIIllII[19])) {
                        bl = llIIllIIllII[6];
                        "".length();
                        if (-"   ".length() >= 0) {
                            return ((0x6B ^ 0x74 ^ (0x11 ^ 0x3D)) & (0x1F ^ 0x13 ^ (0x6A ^ 0x55) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llIIllIIllII[7];
                    }
                    return bl;
                }) ? 1 : 0)) {
                    lllllllllllllllIlIIllIllllIllIlI = llIIllIIllII[6];
                }
                if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllIllIlI)) {
                    lllllllllllllllIlIIllIllllIllIIl.b(lllllllllllllllIlIIllIllllIllIIl.o() - llIIllIIllII[6]);
                    lllllllllllllllIlIIllIllllIllllI.a(lllllllllllllllIlIIllIllllIllIIl, new d[llIIllIIllII[7]]);
                }
                lllllllllllllllIlIIllIllllIlllIl.remove();
            }
            "".length();
            if ("   ".length() != -" ".length()) continue;
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
            "".length();
            if ("  ".length() == ((0x7C ^ 0x21 ^ (0xFD ^ 0x87)) & (0x30 ^ 0x17 ^ (0xB ^ 0x37) & ~(0x65 ^ 0x59) ^ -" ".length()))) {
                return ((0xAA ^ 0xB6 ^ (0x57 ^ 0x12)) & (0x13 ^ 0x3A ^ (0x4E ^ 0x3E) ^ -" ".length())) != 0;
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
        void lllllllllllllllIlIIlllIIIIIlIIII;
        int lllllllllllllllIlIIlllIIIIIIllII;
        int n2;
        void lllllllllllllllIlIIlllIIIIIIllll;
        void lllllllllllllllIlIIlllIIIIIIlllI;
        d lllllllllllllllIlIIlllIIIIIIllIl;
        c2.a(llIIllIIllII[6]);
        Player player = (Player)c2.m().getInteracting();
        Object var4_4 = null;
        if (SquireGorillaPlugin.llllllIIIllIIl(player)) {
            lllllllllllllllIlIIlllIIIIIIllIl = this.a(player);
        }
        if (!SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIlllIIIIIIlllI) || SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIlllIIIIIIllll) && SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIlllIIIIIIllll.equals((Object)lllllllllllllllIlIIlllIIIIIIllIl) ? 1 : 0)) {
            n2 = llIIllIIllII[6];
            "".length();
            if ("   ".length() == (7 + 100 - 95 + 116 ^ 65 + 69 - 130 + 128)) {
                return;
            }
        } else {
            n2 = lllllllllllllllIlIIlllIIIIIIllII = llIIllIIllII[7];
        }
        if (SquireGorillaPlugin.llllllIIIllIlI(lllllllllllllllIlIIlllIIIIIIllll, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.BOULDER)) {
            lllllllllllllllIlIIlllIIIIIlIIII.a(lllllllllllllllIlIIlllIIIIIlIIII.n().stream().filter(d2 -> {
                boolean bl;
                if (SquireGorillaPlugin.llllllIIIlllll(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                    bl = llIIllIIllII[6];
                    "".length();
                    if (-(0x2E ^ 0x2A) > 0) {
                        return ((0x80 ^ 0xAC) & ~(0x62 ^ 0x4E)) != 0;
                    }
                } else {
                    bl = llIIllIIllII[7];
                }
                return bl;
            }).collect(Collectors.toList()));
            "".length();
            if ("  ".length() == "   ".length()) {
                return;
            }
        } else {
            if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIlllIIIIIIllII)) {
                lllllllllllllllIlIIlllIIIIIlIIII.b(lllllllllllllllIlIIlllIIIIIlIIII.o() - llIIllIIllII[6]);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            } else {
                f lllllllllllllllIlIIlllIIIIIIlIlI2;
                WorldArea lllllllllllllllIlIIlllIIIIIIlIIl2;
                SquireGorillaPlugin lllllllllllllllIlIIlllIIIIIlIIIl;
                int lllllllllllllllIlIIlllIIIIIIlIll = lllllllllllllllIlIIlllIIIIIlIIIl.b.getTickCount();
                if (SquireGorillaPlugin.llllllIIIllIlI(lllllllllllllllIlIIlllIIIIIIllll, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC)) {
                    f lllllllllllllllIlIIlllIIIIIIlIlI2 = lllllllllllllllIlIIlllIIIIIlIIIl.i.get(lllllllllllllllIlIIlllIIIIIIlllI);
                    WorldArea lllllllllllllllIlIIlllIIIIIIlIIl2 = lllllllllllllllIlIIlllIIIIIIlIlI2.r();
                    if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIlllIIIIIIlIIl2)) {
                        int lllllllllllllllIlIIlllIIIIIIlIII = lllllllllllllllIlIIlllIIIIIlIIII.m().getWorldArea().distanceTo(lllllllllllllllIlIIlllIIIIIIlIIl2);
                        lllllllllllllllIlIIlllIIIIIIlIll += (lllllllllllllllIlIIlllIIIIIIlIII + llIIllIIllII[19]) / llIIllIIllII[15];
                    }
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIllIlI(lllllllllllllllIlIIlllIIIIIIllll, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIlllIIIIIIlIIl2 = (lllllllllllllllIlIIlllIIIIIIlIlI2 = lllllllllllllllIlIIlllIIIIIlIIIl.i.get(lllllllllllllllIlIIlllIIIIIIlllI)).r())) {
                    int lllllllllllllllIlIIlllIIIIIIlIII = lllllllllllllllIlIIlllIIIIIlIIII.m().getWorldArea().distanceTo(lllllllllllllllIlIIlllIIIIIIlIIl2);
                    lllllllllllllllIlIIlllIIIIIIlIll += (lllllllllllllllIlIIlllIIIIIIlIII + llIIllIIllII[16]) / llIIllIIllII[13];
                }
                lllllllllllllllIlIIlllIIIIIlIIIl.h.add(new g((c)lllllllllllllllIlIIlllIIIIIlIIII, (d)lllllllllllllllIlIIlllIIIIIIllll, (Player)lllllllllllllllIlIIlllIIIIIIlllI, lllllllllllllllIlIIlllIIIIIIlIll));
                "".length();
            }
            lllllllllllllllIlIIlllIIIIIlIIII.a(lllllllllllllllIlIIlllIIIIIlIIII.n().stream().filter(arg_0 -> SquireGorillaPlugin.b((d)lllllllllllllllIlIIlllIIIIIIllll, arg_0)).collect(Collectors.toList()));
            if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIlllIIIIIlIIII.n().isEmpty() ? 1 : 0)) {
                int n3;
                lllllllllllllllIlIIlllIIIIIlIIII.a(Arrays.stream(s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c.l).filter(arg_0 -> SquireGorillaPlugin.a((d)lllllllllllllllIlIIlllIIIIIIllll, arg_0)).collect(Collectors.toList()));
                int n4 = llIIllIIllII[10];
                if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIlllIIIIIIllII)) {
                    n3 = llIIllIIllII[6];
                    "".length();
                    if ((0xBB ^ 0xBF) > (0x72 ^ 0x76)) {
                        return;
                    }
                } else {
                    n3 = llIIllIIllII[7];
                }
                lllllllllllllllIlIIlllIIIIIlIIII.b(n4 - n3);
            }
        }
        d[] dArray = new d[llIIllIIllII[6]];
        dArray[SquireGorillaPlugin.llIIllIIllII[7]] = var4_4;
        this.a(c2, dArray);
        int n5 = this.b.getTickCount();
        c2.c(n5 + llIIllIIllII[12]);
    }

    private void g() {
        Iterator<f> lllllllllllllllIlIIllIllllIlIIll = this.i.values().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllIlIIll.hasNext() ? 1 : 0)) {
            f lllllllllllllllIlIIllIllllIlIIlI = lllllllllllllllIlIIllIllllIlIIll.next();
            lllllllllllllllIlIIllIllllIlIIlI.a(lllllllllllllllIlIIllIllllIlIIlI.D().getWorldArea());
            lllllllllllllllIlIIllIllllIlIIlI.E().clear();
            "".length();
            if ("   ".length() == "   ".length()) continue;
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
            void lllllllllllllllIlIIllIlllIllIlII;
            SquireGorillaPlugin lllllllllllllllIlIIllIlllIllIllI;
            if (SquireGorillaPlugin.llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
                this.d();
            }
            lllllllllllllllIlIIllIlllIllIllI.d.put((NPC)lllllllllllllllIlIIllIlllIllIlII, new c((NPC)lllllllllllllllIlIIllIlllIllIlII));
            "".length();
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
        void lllllllllllllllIlIIllIlllllIlIIl;
        void lllllllllllllllIlIIllIlllllIlIlI;
        SquireGorillaPlugin lllllllllllllllIlIIllIlllllIllII;
        Projectile projectile = projectileSpawned.getProjectile();
        int n2 = projectile.getId();
        if (SquireGorillaPlugin.llllllIIIllIll(a.contains(n2) ? 1 : 0)) {
            return;
        }
        WorldPoint lllllllllllllllIlIIllIlllllIlIII = WorldPoint.fromLocal((Client)lllllllllllllllIlIIllIlllllIllII.b, (int)lllllllllllllllIlIIllIlllllIlIlI.getX1(), (int)lllllllllllllllIlIIllIlllllIlIlI.getY1(), (int)lllllllllllllllIlIIllIlllllIllII.b.getPlane());
        if (SquireGorillaPlugin.llllllIIIlIlIl((int)lllllllllllllllIlIIllIlllllIlIIl, llIIllIIllII[30])) {
            lllllllllllllllIlIIllIlllllIllII.g.add(lllllllllllllllIlIIllIlllllIlIII);
            "".length();
            "".length();
            if (((0x45 ^ 0x26) & ~(0xC3 ^ 0xA0)) != 0) {
                return;
            }
        } else {
            Iterator<c> lllllllllllllllIlIIllIlllllIIlll = lllllllllllllllIlIIllIlllllIllII.d.values().iterator();
            while (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllllIIlll.hasNext() ? 1 : 0)) {
                c lllllllllllllllIlIIllIlllllIIllI = lllllllllllllllIlIIllIlllllIIlll.next();
                if (SquireGorillaPlugin.llllllIIIllIll(lllllllllllllllIlIIllIlllllIIllI.m().getWorldLocation().distanceTo(lllllllllllllllIlIIllIlllllIlIII))) {
                    lllllllllllllllIlIIllIlllllIIllI.e(lllllllllllllllIlIIllIlllllIlIlI.getId());
                }
                "".length();
                if (null == null) continue;
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
            "".length();
            if (-" ".length() >= ((0x64 ^ 0x79) & ~(0x98 ^ 0x85))) {
                return ((0xAF ^ 0xBC) & ~(0x57 ^ 0x44)) != 0;
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
                "".length();
                if (((113 + 83 - 51 + 97 ^ 65 + 138 - 65 + 36) & ((0x16 ^ 0x4F) & ~(0xD6 ^ 0x8F) ^ (0x36 ^ 0x6A) ^ -" ".length())) > (150 + 31 - 152 + 147 ^ 139 + 123 - 104 + 22)) {
                    return ((0x6A ^ 0x11 ^ (0x61 ^ 0x4B)) & (102 + 63 - 101 + 135 ^ 140 + 103 - 174 + 81 ^ -" ".length())) != 0;
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
        "".length();
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
            "".length();
            if ((0x8A ^ 0xA6 ^ (0x39 ^ 0x11)) != (0x90 ^ 0xBA ^ (0x60 ^ 0x4E))) {
                return ((18 + 110 - 98 + 98 ^ 83 + 70 - 101 + 91) & (0x7D ^ 0x64 ^ (0xC ^ 0x1A) ^ -" ".length())) != 0;
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
            void lllllllllllllllIlIIlllIIIIlIIIII;
            void lllllllllllllllIlIIlllIIIIlIIIIl;
            lllllllllllllllIlIIlllIIIIlIIIIl.a(Arrays.stream(s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c.l).filter(arg_0 -> SquireGorillaPlugin.a((d[])lllllllllllllllIlIIlllIIIIlIIIII, arg_0)).collect(Collectors.toList()));
            lllllllllllllllIlIIlllIIIIlIIIIl.b(llIIllIIllII[10]);
            lllllllllllllllIlIIlllIIIIlIIIIl.d(llIIllIIllII[6]);
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
        Iterator<c> lllllllllllllllIlIIllIlllllllIll = this.d.values().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllllllIll.hasNext() ? 1 : 0)) {
            WorldArea lllllllllllllllIlIIllIllllllIllI2;
            void lllllllllllllllIlIIllIllllllllII;
            SquireGorillaPlugin lllllllllllllllIlIIllIllllllllIl;
            c lllllllllllllllIlIIllIlllllllIlI = lllllllllllllllIlIIllIlllllllIll.next();
            Player lllllllllllllllIlIIllIlllllllIIl = (Player)lllllllllllllllIlIIllIlllllllIlI.m().getInteracting();
            f lllllllllllllllIlIIllIlllllllIII = lllllllllllllllIlIIllIllllllllIl.i.get(lllllllllllllllIlIIllIlllllllIIl);
            if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIlI.t()) && SquireGorillaPlugin.llllllIIIllIII(lllllllllllllllIlIIllIlllllllIIl)) {
                lllllllllllllllIlIIllIlllllllIlI.a(llIIllIIllII[7]);
                "".length();
                if ((0x44 ^ 0x40) < -" ".length()) {
                    return;
                }
            } else if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIII) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIII.r()) && SquireGorillaPlugin.llllllIIIllIll(lllllllllllllllIlIIllIlllllllIlI.s() ? 1 : 0) && SquireGorillaPlugin.llllllIIIlllII((int)lllllllllllllllIlIIllIllllllllII, lllllllllllllllIlIIllIlllllllIlI.p()) && SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllllllIlI.m().getWorldArea().isInMeleeDistance(lllllllllllllllIlIIllIlllllllIII.r()) ? 1 : 0)) {
                lllllllllllllllIlIIllIlllllllIlI.a(llIIllIIllII[6]);
                lllllllllllllllIlIIllIlllllllIlI.c((int)(lllllllllllllllIlIIllIllllllllII + llIIllIIllII[6]));
            }
            int lllllllllllllllIlIIllIllllllIlll = lllllllllllllllIlIIllIlllllllIlI.m().getAnimation();
            if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllllllIlI.v() ? 1 : 0) && SquireGorillaPlugin.llllllIIIlllIl((int)lllllllllllllllIlIIllIllllllllII, lllllllllllllllIlIIllIlllllllIlI.p() + llIIllIIllII[11])) {
                lllllllllllllllIlIIllIlllllllIlI.c((int)(lllllllllllllllIlIIllIllllllllII + llIIllIIllII[9]));
                lllllllllllllllIlIIllIlllllllIlI.a(llIIllIIllII[6]);
                if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIII) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIII.r()) && SquireGorillaPlugin.llllllIIIllIll(lllllllllllllllIlIIllIlllllllIlI.m().getWorldArea().isInMeleeDistance(lllllllllllllllIlIIllIlllllllIII.r()) ? 1 : 0) && SquireGorillaPlugin.llllllIIIllIll(lllllllllllllllIlIIllIlllllllIlI.m().getWorldArea().intersectsWith(lllllllllllllllIlIIllIlllllllIII.r()) ? 1 : 0)) {
                    lllllllllllllllIlIIllIlllllllIlI.a(lllllllllllllllIlIIllIlllllllIlI.n().stream().filter(d2 -> {
                        boolean bl;
                        if (SquireGorillaPlugin.llllllIIIlllll(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                            bl = llIIllIIllII[6];
                            "".length();
                            if (null != null) {
                                return ((0x94 ^ 0x92) & ~(0x9F ^ 0x99)) != 0;
                            }
                        } else {
                            bl = llIIllIIllII[7];
                        }
                        return bl;
                    }).collect(Collectors.toList()));
                    if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIIl)) {
                        d[] dArray = new d[llIIllIIllII[9]];
                        dArray[SquireGorillaPlugin.llIIllIIllII[7]] = s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE;
                        dArray[SquireGorillaPlugin.llIIllIIllII[6]] = lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIIl);
                        lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIlI, dArray);
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                    }
                }
            } else if (SquireGorillaPlugin.llllllIIIlIlII(lllllllllllllllIlIIllIllllllIlll, lllllllllllllllIlIIllIlllllllIlI.q())) {
                if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIlll, llIIllIIllII[23])) {
                    lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIlI, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE);
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIlll, llIIllIIllII[24])) {
                    lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIlI, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC);
                    "".length();
                    if (null != null) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIlll, llIIllIIllII[25])) {
                    lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIlI, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED);
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                } else if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIlll, llIIllIIllII[26]) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIIl)) {
                    if (SquireGorillaPlugin.llllllIIIllIlI(lllllllllllllllIlIIllIlllllllIlI.l(), lllllllllllllllIlIIllIlllllllIlI.A())) {
                        lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIlI, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.BOULDER);
                        "".length();
                        if (((0x5D ^ 0x17 ^ 104 + 13 - 94 + 104) & (25 + 152 - 37 + 29 ^ 83 + 116 - 43 + 0 ^ -" ".length())) != 0) {
                            return;
                        }
                    } else {
                        if (SquireGorillaPlugin.llllllIIIlllIl((int)lllllllllllllllIlIIllIllllllllII, lllllllllllllllIlIIllIlllllllIlI.p())) {
                            lllllllllllllllIlIIllIlllllllIlI.c(llIIllIIllII[6]);
                            int lllllllllllllllIlIIllIllllllIllI2 = lllllllllllllllIlIIllIlllllllIlI.w();
                            if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIllI2, llIIllIIllII[27])) {
                                lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIlI, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MAGIC);
                                "".length();
                                if (((0xA3 ^ 0xBE ^ (8 ^ 0x37)) & (0xB2 ^ 0x81 ^ (0x6F ^ 0x7E) ^ -" ".length())) == (0x12 ^ 0x7A ^ (0xD6 ^ 0xBA))) {
                                    return;
                                }
                            } else if (SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllllIllI2, llIIllIIllII[28])) {
                                lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIlI, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.RANGED);
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            } else if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIII)) {
                                WorldArea lllllllllllllllIlIIllIllllllIlIl = lllllllllllllllIlIIllIlllllllIII.r();
                                if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIllllllIlIl) && SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllllllIl.g.stream().anyMatch(worldPoint -> {
                                    boolean bl;
                                    if (SquireGorillaPlugin.llllllIIIllIll(worldPoint.distanceTo(lllllllllllllllIlIIllIllllllIlIl))) {
                                        bl = llIIllIIllII[6];
                                        "".length();
                                        if (((0x46 ^ 0x77) & ~(0x2D ^ 0x1C)) == " ".length()) {
                                            return ((0xFA ^ 0xBD) & ~(0x83 ^ 0xC4)) != 0;
                                        }
                                    } else {
                                        bl = llIIllIIllII[7];
                                    }
                                    return bl;
                                }) ? 1 : 0)) {
                                    lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIlI, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.BOULDER);
                                    "".length();
                                    if (((0x1B ^ 0x24) & ~(0x88 ^ 0xB7)) >= (0x46 ^ 0x42)) {
                                        return;
                                    }
                                } else if (SquireGorillaPlugin.llllllIIIllIll(lllllllllllllllIlIIllIlllllllIII.E().isEmpty() ? 1 : 0)) {
                                    lllllllllllllllIlIIllIllllllllIl.a(lllllllllllllllIlIIllIlllllllIlI, s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE);
                                }
                            }
                        }
                        lllllllllllllllIlIIllIlllllllIlI.c((int)(lllllllllllllllIlIIllIllllllllII + llIIllIIllII[12]));
                        lllllllllllllllIlIIllIlllllllIlI.c(llIIllIIllII[6]);
                    }
                }
            }
            if (SquireGorillaPlugin.llllllIIIlIlll(lllllllllllllllIlIIllIlllllllIlI.B())) {
                lllllllllllllllIlIIllIlllllllIlI.f(lllllllllllllllIlIIllIlllllllIlI.B() - llIIllIIllII[6]);
                "".length();
                if (null != null) {
                    return;
                }
            } else if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllllllIlI.s() ? 1 : 0) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIlI.m().getInteracting()) && SquireGorillaPlugin.llllllIIIllIll(lllllllllllllllIlIIllIlllllllIlI.y() ? 1 : 0) && SquireGorillaPlugin.llllllIIIlllIl(lllllllllllllllIlIIllIlllllllIlI.n().size(), llIIllIIllII[9]) && SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllllllIlI.n().stream().anyMatch(d2 -> {
                boolean bl;
                if (SquireGorillaPlugin.llllllIIIllIlI(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                    bl = llIIllIIllII[6];
                    "".length();
                    if ("  ".length() == "   ".length()) {
                        return ((0 ^ 0x34) & ~(0xB0 ^ 0x84)) != 0;
                    }
                } else {
                    bl = llIIllIIllII[7];
                }
                return bl;
            }) ? 1 : 0) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIII) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIII.r()) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIlI.r()) && SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIllllllIllI2 = lllllllllllllllIlIIllIlllllllIlI.r().calculateNextTravellingPoint(lllllllllllllllIlIIllIllllllllIl.b.getTopLevelWorldView(), lllllllllllllllIlIIllIlllllllIII.r(), llIIllIIllII[6], worldPoint -> {
                int n2;
                WorldArea worldArea = new WorldArea(worldPoint, llIIllIIllII[6], llIIllIIllII[6]);
                if (SquireGorillaPlugin.llllllIIIlIllI(this.d.values().stream().noneMatch(c3 -> {
                    int n2;
                    void lllllllllllllllIlIIllIlllIIIlllI;
                    WorldArea lllllllllllllllIlIIllIlllIIIllII;
                    WorldArea worldArea2;
                    c lllllllllllllllIlIIllIlllIIIllll;
                    void lllllllllllllllIlIIllIlllIIIllIl;
                    if (SquireGorillaPlugin.llllllIIIllIlI(c3, lllllllllllllllIlIIllIlllllllIlI)) {
                        return llIIllIIllII[7];
                    }
                    if (SquireGorillaPlugin.llllllIIIlllII(lllllllllllllllIlIIllIlllIIIllIl.m().getIndex(), lllllllllllllllIlIIllIlllIIIllll.m().getIndex())) {
                        worldArea2 = lllllllllllllllIlIIllIlllIIIllIl.m().getWorldArea();
                        "".length();
                        if (null != null) {
                            return ((0x55 ^ 0x42) & ~(0x52 ^ 0x45)) != 0;
                        }
                    } else {
                        worldArea2 = lllllllllllllllIlIIllIlllIIIllIl.r();
                    }
                    if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllIIIllII = worldArea2) && SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllIIIlllI.intersectsWith(lllllllllllllllIlIIllIlllIIIllII) ? 1 : 0)) {
                        n2 = llIIllIIllII[6];
                        "".length();
                        if ((0x73 ^ 0x47 ^ (0x1E ^ 0x2F)) <= 0) {
                            return ((0xBC ^ 0x87 ^ (0xE1 ^ 0xC4)) & (146 + 46 - 191 + 170 ^ 134 + 63 - 40 + 24 ^ -" ".length())) != 0;
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
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return ((0xF4 ^ 0x8E ^ (0x3F ^ 0x1F)) & (0xE2 ^ 0xBC ^ (0x8D ^ 0x89) ^ -" ".length())) != 0;
                        }
                    } else {
                        n2 = llIIllIIllII[7];
                    }
                    return n2 != 0;
                }) ? 1 : 0)) {
                    n2 = llIIllIIllII[6];
                    "".length();
                    if (" ".length() <= ((0x32 ^ 7) & ~(0xA1 ^ 0x94))) {
                        return ((0x4E ^ 0x1B) & ~(0xC2 ^ 0x97)) != 0;
                    }
                } else {
                    n2 = llIIllIIllII[7];
                }
                return n2 != 0;
            }))) {
                int lllllllllllllllIlIIllIllllllIlIl = lllllllllllllllIlIIllIlllllllIlI.m().getWorldArea().distanceTo(lllllllllllllllIlIIllIlllllllIII.r());
                WorldPoint lllllllllllllllIlIIllIllllllIlII = lllllllllllllllIlIIllIllllllIllI2.toWorldPoint();
                if (SquireGorillaPlugin.llllllIIIllllI(lllllllllllllllIlIIllIllllllIlIl, llIIllIIllII[17]) && SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllllllIII.r().hasLineOfSightTo(lllllllllllllllIlIIllIllllllllIl.b.getTopLevelWorldView(), lllllllllllllllIlIIllIlllllllIlI.r()) ? 1 : 0)) {
                    if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllllIlII.distanceTo(lllllllllllllllIlIIllIlllllllIlI.r().toWorldPoint()))) {
                        if (SquireGorillaPlugin.llllllIIIllIll(lllllllllllllllIlIIllIllllllIlII.distanceTo(lllllllllllllllIlIIllIlllllllIlI.m().getWorldLocation()))) {
                            lllllllllllllllIlIIllIlllllllIlI.a(lllllllllllllllIlIIllIlllllllIlI.n().stream().filter(d2 -> {
                                boolean bl;
                                if (SquireGorillaPlugin.llllllIIIllIlI(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                                    bl = llIIllIIllII[6];
                                    "".length();
                                    if ((0x5A ^ 0x21 ^ 77 + 78 - 86 + 58) < 0) {
                                        return ((35 + 99 - 58 + 175 ^ 165 + 34 - 75 + 60) & (161 + 166 - 310 + 179 ^ 79 + 124 - 134 + 66 ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIIllIIllII[7];
                                }
                                return bl;
                            }).collect(Collectors.toList()));
                            "".length();
                            if (-"  ".length() >= 0) {
                                return;
                            }
                        } else {
                            lllllllllllllllIlIIllIlllllllIlI.a(lllllllllllllllIlIIllIlllllllIlI.n().stream().filter(d2 -> {
                                boolean bl;
                                if (SquireGorillaPlugin.llllllIIIlllll(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                                    bl = llIIllIIllII[6];
                                    "".length();
                                    if ("   ".length() >= (0x6B ^ 0xD ^ (9 ^ 0x6B))) {
                                        return ((0xEE ^ 0xAE ^ (0x53 ^ 0x38)) & (37 + 100 - 57 + 103 ^ 71 + 39 - -45 + 1 ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llIIllIIllII[7];
                                }
                                return bl;
                            }).collect(Collectors.toList()));
                            "".length();
                            if (((174 + 13 - 49 + 79 ^ 106 + 32 - 72 + 75) & (118 + 156 - 115 + 36 ^ 79 + 105 - 164 + 131 ^ -" ".length())) != 0) {
                                return;
                            }
                        }
                    } else if (SquireGorillaPlugin.llllllIIIlllIl((int)lllllllllllllllIlIIllIllllllllII, lllllllllllllllIlIIllIlllllllIlI.p()) && SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIlllllllIlI.w(), llIIllIIllII[29]) && SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllllllIl.g.stream().noneMatch(worldPoint -> {
                        boolean bl;
                        if (SquireGorillaPlugin.llllllIIIllIll(worldPoint.distanceTo(lllllllllllllllIlIIllIlllllllIII.r()))) {
                            bl = llIIllIIllII[6];
                            "".length();
                            if ((0x8A ^ 0x8E) < 0) {
                                return ((0x6C ^ 0x74) & ~(0x9F ^ 0x87)) != 0;
                            }
                        } else {
                            bl = llIIllIIllII[7];
                        }
                        return bl;
                    }) ? 1 : 0)) {
                        lllllllllllllllIlIIllIlllllllIlI.a(lllllllllllllllIlIIllIlllllllIlI.n().stream().filter(d2 -> {
                            boolean bl;
                            if (SquireGorillaPlugin.llllllIIIllIlI(d2, (Object)s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d.MELEE)) {
                                bl = llIIllIIllII[6];
                                "".length();
                                if (-"  ".length() > 0) {
                                    return ((0xDA ^ 0x9E) & ~(0xEA ^ 0xAE)) != 0;
                                }
                            } else {
                                bl = llIIllIIllII[7];
                            }
                            return bl;
                        }).collect(Collectors.toList()));
                    }
                }
            }
            if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllllllIlI.v() ? 1 : 0)) {
                lllllllllllllllIlIIllIlllllllIlI.a(llIIllIIllII[6]);
            }
            if (SquireGorillaPlugin.llllllIIIlllll(lllllllllllllllIlIIllIlllllllIlI.l(), lllllllllllllllIlIIllIlllllllIlI.A())) {
                if (!SquireGorillaPlugin.llllllIIIllIll(lllllllllllllllIlIIllIlllllllIlI.z() ? 1 : 0) || SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIlllllllIlI.y() ? 1 : 0)) {
                    lllllllllllllllIlIIllIlllllllIlI.f(llIIllIIllII[9]);
                    "".length();
                    if (-(0xA2 ^ 0xA6) >= 0) {
                        return;
                    }
                } else {
                    lllllllllllllllIlIIllIlllllllIlI.f(llIIllIIllII[6]);
                }
            }
            lllllllllllllllIlIIllIlllllllIlI.d(lllllllllllllllIlIIllIlllllllIlI.m().getAnimation());
            lllllllllllllllIlIIllIlllllllIlI.a(lllllllllllllllIlIIllIlllllllIlI.m().getWorldArea());
            lllllllllllllllIlIIllIlllllllIlI.a(lllllllllllllllIlIIllIlllllllIlI.m().getInteracting());
            if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIlllllllIlI.t())) {
                lllllllllllllllIlIIllIlllllllIlI.b(lllllllllllllllIlIIllIlllllllIlI.t());
            }
            lllllllllllllllIlIIllIlllllllIlI.b(llIIllIIllII[7]);
            lllllllllllllllIlIIllIlllllllIlI.c(llIIllIIllII[7]);
            lllllllllllllllIlIIllIlllllllIlI.e(lllllllllllllllIlIIllIlllllllIlI.y());
            lllllllllllllllIlIIllIlllllllIlI.d(llIIllIIllII[7]);
            lllllllllllllllIlIIllIlllllllIlI.a(lllllllllllllllIlIIllIlllllllIlI.l());
            lllllllllllllllIlIIllIlllllllIlI.e(llIIllIIllII[29]);
            "".length();
            if (((0xB6 ^ 0x8B ^ (0x38 ^ 0x1E)) & (0x7B ^ 0x38 ^ (0xD3 ^ 0x8B) ^ -" ".length())) == 0) continue;
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
        "".length();
    }

    protected void onStop() {
        this.d = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f.remove((Overlay)this.e);
        "".length();
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
        void lllllllllllllllIlIIlllIIIIIlllII;
        HeadIcon headIcon = player.getOverheadIcon();
        if (SquireGorillaPlugin.llllllIIIllIII(headIcon)) {
            return null;
        }
        switch (s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.a.k[lllllllllllllllIlIIlllIIIIIlllII.ordinal()]) {
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
        "".length();
    }

    private static void llllllIIIlIIll() {
        llIIllIIllII = new int[31];
        SquireGorillaPlugin.llIIllIIllII[0] = -(0xFFFFD159 & 0x6EB7) & (0xFFFFFBFE & 0x5FF9);
        SquireGorillaPlugin.llIIllIIllII[1] = 0xFFFFBFED & 0x5BFB;
        SquireGorillaPlugin.llIIllIIllII[2] = 0xFFFFFBEB & 0x1FFE;
        SquireGorillaPlugin.llIIllIIllII[3] = -(0xFFFFD537 & 0x6EDD) & (0xFFFFFFFF & 0x5FFF);
        SquireGorillaPlugin.llIIllIIllII[4] = -(0xFFFFEA19 & 0x55E7) & (0xFFFFFBEE & 0x5FFD);
        SquireGorillaPlugin.llIIllIIllII[5] = 0xFFFFBFEF & 0x5BFD;
        SquireGorillaPlugin.llIIllIIllII[6] = " ".length();
        SquireGorillaPlugin.llIIllIIllII[7] = (162 + 6 - 15 + 40 ^ 30 + 67 - 16 + 49) & (113 + 134 - 109 + 61 ^ 78 + 25 - 16 + 45 ^ -" ".length());
        SquireGorillaPlugin.llIIllIIllII[8] = 4 ^ 0x14;
        SquireGorillaPlugin.llIIllIIllII[9] = "  ".length();
        SquireGorillaPlugin.llIIllIIllII[10] = "   ".length();
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
        SquireGorillaPlugin.llIIllIIllII[29] = -" ".length();
        SquireGorillaPlugin.llIIllIIllII[30] = -(0xFFFFBF89 & 0x6C77) & (0xFFFFEF59 & 0x3FFE);
    }

    @Subscribe
    private void a(GameStateChanged gameStateChanged) {
        GameState gameState = gameStateChanged.getGameState();
        if (!SquireGorillaPlugin.llllllIIIlllll(gameState, GameState.LOGGING_IN) || !SquireGorillaPlugin.llllllIIIlllll(gameState, GameState.CONNECTION_LOST) || SquireGorillaPlugin.llllllIIIllIlI(gameState, GameState.HOPPING)) {
            SquireGorillaPlugin lllllllllllllllIlIIllIllllIIIllI;
            lllllllllllllllIlIIllIllllIIIllI.b();
        }
    }

    private void d() {
        this.i.clear();
        Iterator lllllllllllllllIlIIlllIIIIlIIlIl = this.b.getPlayers().iterator();
        while (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIlllIIIIlIIlIl.hasNext() ? 1 : 0)) {
            SquireGorillaPlugin lllllllllllllllIlIIlllIIIIlIIllI;
            Player lllllllllllllllIlIIlllIIIIlIIlII = (Player)lllllllllllllllIlIIlllIIIIlIIlIl.next();
            lllllllllllllllIlIIlllIIIIlIIllI.i.put(lllllllllllllllIlIIlllIIIIlIIlII, new f(lllllllllllllllIlIIlllIIIIlIIlII));
            "".length();
            "".length();
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
        SquireGorillaPlugin lllllllllllllllIlIIllIllllIIllIl;
        void lllllllllllllllIlIIllIllllIIllII;
        if (SquireGorillaPlugin.llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
            return;
        }
        if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllIIllII.getActor() instanceof Player)) {
            Player lllllllllllllllIlIIllIllllIIlIll = (Player)lllllllllllllllIlIIllIllllIIllII.getActor();
            f lllllllllllllllIlIIllIllllIIlIlI = lllllllllllllllIlIIllIllllIIllIl.i.get(lllllllllllllllIlIIllIllllIIlIll);
            if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIllllIIlIlI)) {
                lllllllllllllllIlIIllIllllIIlIlI.E().add(lllllllllllllllIlIIllIllllIIllII.getHitsplat());
                "".length();
            }
            "".length();
            if ((0x60 ^ 0x65) == 0) {
                return;
            }
        } else if (SquireGorillaPlugin.llllllIIIlIllI(lllllllllllllllIlIIllIllllIIllII.getActor() instanceof NPC)) {
            c lllllllllllllllIlIIllIllllIIlIll = lllllllllllllllIlIIllIllllIIllIl.d.get(lllllllllllllllIlIIllIllllIIllII.getActor());
            int lllllllllllllllIlIIllIllllIIlIlI = lllllllllllllllIlIIllIllllIIllII.getHitsplat().getHitsplatType();
            if (SquireGorillaPlugin.llllllIIIllIIl(lllllllllllllllIlIIllIllllIIlIll) && (!SquireGorillaPlugin.llllllIIIlIlII(lllllllllllllllIlIIllIllllIIlIlI, llIIllIIllII[19]) || SquireGorillaPlugin.llllllIIIlIlIl(lllllllllllllllIlIIllIllllIIlIlI, llIIllIIllII[8]))) {
                lllllllllllllllIlIIllIllllIIlIll.b(llIIllIIllII[6]);
            }
        }
    }

    private static boolean llllllIIIlllll(Object object, Object object2) {
        return object != object2;
    }
}

