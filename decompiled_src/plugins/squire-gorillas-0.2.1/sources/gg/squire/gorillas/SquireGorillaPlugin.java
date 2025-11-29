package gg.squire.gorillas;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
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
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.a;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.c;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.d;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.f;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.g;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.i;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.k;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.l;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.m;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.n;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.o;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.p;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.q;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.r;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.s;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.u;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.v;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.w;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.x;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.y;
import s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s.z;
@PluginDescriptor(name = "Squire Demonic Gorillas", enabledByDefault = false)
@SquireUtil
/* loaded from: squire-gorillas-0.2.1.jar:gg/squire/gorillas/SquireGorillaPlugin.class */
public class SquireGorillaPlugin extends SquirePlugin {
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
        for (NPC npc : this.b.getNpcs()) {
            if (llllllIIIlIllI(a(npc.getId()) ? 1 : 0)) {
                this.d.put(npc, new c(npc));
                "".length();
            }
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
    }

    @Subscribe
    private void a(NpcDespawned npcDespawned) {
        c remove = this.d.remove(npcDespawned.getNpc());
        if (llllllIIIllIIl(remove)) {
            if (llllllIIIllIlI(remove.u(), Players.getLocal())) {
                this.j += llIIllIIllII[6];
            }
            if (llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
                a();
            }
        }
    }

    private void f() {
        Iterator<g> it = this.h.iterator();
        int tickCount = this.b.getTickCount();
        while (llllllIIIlIllI(it.hasNext() ? 1 : 0)) {
            g next = it.next();
            if (llllllIIIlllIl(tickCount, next.I())) {
                int i = llIIllIIllII[7];
                c F = next.F();
                f fVar = this.i.get(next.H());
                if (llllllIIIllIII(fVar)) {
                    i = llIIllIIllII[6];
                    "".length();
                    if ((-" ".length()) > 0) {
                        return;
                    }
                } else if (llllllIIIlIllI(fVar.E().isEmpty() ? 1 : 0)) {
                    i = llIIllIIllII[6];
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else if (llllllIIIlIllI(fVar.E().stream().anyMatch(hitsplat -> {
                    if (llllllIIIlIlIl(hitsplat.getHitsplatType(), llIIllIIllII[19])) {
                        ?? r0 = llIIllIIllII[6];
                        "".length();
                        return (-"   ".length()) >= 0 ? ((107 ^ 116) ^ (17 ^ 61)) & (((31 ^ 19) ^ (106 ^ 85)) ^ (-" ".length())) : r0;
                    }
                    return llIIllIIllII[7];
                }) ? 1 : 0)) {
                    i = llIIllIIllII[6];
                }
                if (llllllIIIlIllI(i)) {
                    F.b(F.o() - llIIllIIllII[6]);
                    a(F, new d[llIIllIIllII[7]]);
                }
                it.remove();
            }
            "".length();
            if ("   ".length() == (-" ".length())) {
                return;
            }
        }
    }

    static {
        llllllIIIlIIll();
        a = ImmutableSet.of(Integer.valueOf(llIIllIIllII[28]), Integer.valueOf(llIIllIIllII[27]), Integer.valueOf(llIIllIIllII[30]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    private void a(c cVar, d dVar) {
        int i;
        int i2;
        cVar.a((boolean) llIIllIIllII[6]);
        Player player = (Player) cVar.m().getInteracting();
        d dVar2 = null;
        if (llllllIIIllIIl(player)) {
            dVar2 = a(player);
        }
        if (!llllllIIIllIIl(player) || (llllllIIIllIIl(dVar) && llllllIIIlIllI(dVar.equals(dVar2) ? 1 : 0))) {
            i = llIIllIIllII[6];
            "".length();
            if ("   ".length() == ((((7 + 100) - 95) + 116) ^ (((65 + 69) - 130) + 128))) {
                return;
            }
        } else {
            i = llIIllIIllII[7];
        }
        int i3 = i;
        if (llllllIIIllIlI(dVar, d.BOULDER)) {
            cVar.a((List) cVar.n().stream().filter(dVar3 -> {
                if (llllllIIIlllll(dVar3, d.MELEE)) {
                    ?? r0 = llIIllIIllII[6];
                    "".length();
                    return (-(46 ^ 42)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIllIIllII[7];
            }).collect(Collectors.toList()));
            "".length();
            if ("  ".length() == "   ".length()) {
                return;
            }
        } else {
            if (llllllIIIlIllI(i3)) {
                cVar.b(cVar.o() - llIIllIIllII[6]);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            } else {
                int tickCount = this.b.getTickCount();
                if (llllllIIIllIlI(dVar, d.MAGIC)) {
                    WorldArea r = this.i.get(player).r();
                    if (llllllIIIllIIl(r)) {
                        tickCount += (cVar.m().getWorldArea().distanceTo(r) + llIIllIIllII[19]) / llIIllIIllII[15];
                    }
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                } else if (llllllIIIllIlI(dVar, d.RANGED)) {
                    WorldArea r2 = this.i.get(player).r();
                    if (llllllIIIllIIl(r2)) {
                        tickCount += (cVar.m().getWorldArea().distanceTo(r2) + llIIllIIllII[16]) / llIIllIIllII[13];
                    }
                }
                this.h.add(new g(cVar, dVar, player, tickCount));
                "".length();
            }
            cVar.a((List) cVar.n().stream().filter(dVar4 -> {
                if (llllllIIIllIlI(dVar4, dVar)) {
                    ?? r0 = llIIllIIllII[6];
                    "".length();
                    return "  ".length() == (((124 ^ 33) ^ (253 ^ 135)) & (((48 ^ 23) ^ ((11 ^ 55) & ((101 ^ 89) ^ (-1)))) ^ (-" ".length()))) ? ((170 ^ 182) ^ (87 ^ 18)) & (((19 ^ 58) ^ (78 ^ 62)) ^ (-" ".length())) : r0;
                }
                return llIIllIIllII[7];
            }).collect(Collectors.toList()));
            if (llllllIIIlIllI(cVar.n().isEmpty() ? 1 : 0)) {
                cVar.a((List) Arrays.stream(c.l).filter(dVar5 -> {
                    if (llllllIIIllIlI(dVar5, dVar)) {
                        ?? r0 = llIIllIIllII[6];
                        "".length();
                        return (-" ".length()) >= ((100 ^ 121) & ((152 ^ 133) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIllIIllII[7];
                }).collect(Collectors.toList()));
                int i4 = llIIllIIllII[10];
                if (llllllIIIlIllI(i3)) {
                    i2 = llIIllIIllII[6];
                    "".length();
                    if ((187 ^ 191) > (114 ^ 118)) {
                        return;
                    }
                } else {
                    i2 = llIIllIIllII[7];
                }
                cVar.b(i4 - i2);
            }
        }
        d[] dVarArr = new d[llIIllIIllII[6]];
        dVarArr[llIIllIIllII[7]] = dVar2;
        a(cVar, dVarArr);
        cVar.c(this.b.getTickCount() + llIIllIIllII[12]);
    }

    private void g() {
        for (f fVar : this.i.values()) {
            fVar.a(fVar.D().getWorldArea());
            fVar.E().clear();
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
    }

    @Subscribe
    private void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (llllllIIIlIllI(a(npc.getId()) ? 1 : 0)) {
            if (llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
                d();
            }
            this.d.put(npc, new c(npc));
            "".length();
        }
    }

    private static boolean llllllIIIlIlIl(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    private void a(ProjectileSpawned projectileSpawned) {
        Projectile projectile = projectileSpawned.getProjectile();
        int id = projectile.getId();
        if (llllllIIIllIll(a.contains(Integer.valueOf(id)) ? 1 : 0)) {
            return;
        }
        WorldPoint fromLocal = WorldPoint.fromLocal(this.b, projectile.getX1(), projectile.getY1(), this.b.getPlane());
        if (llllllIIIlIlIl(id, llIIllIIllII[30])) {
            this.g.add(fromLocal);
            "".length();
            "".length();
            if ((true ^ true) && ((true ^ true) ^ true)) {
                return;
            }
            return;
        }
        for (c cVar : this.d.values()) {
            if (llllllIIIllIll(cVar.m().getWorldLocation().distanceTo(fromLocal))) {
                cVar.e(projectile.getId());
            }
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIIllIIllII[8]];
        clsArr[llIIllIIllII[7]] = r.class;
        clsArr[llIIllIIllII[6]] = s.class;
        clsArr[llIIllIIllII[9]] = q.class;
        clsArr[llIIllIIllII[10]] = o.class;
        clsArr[llIIllIIllII[11]] = u.class;
        clsArr[llIIllIIllII[12]] = p.class;
        clsArr[llIIllIIllII[13]] = y.class;
        clsArr[llIIllIIllII[14]] = l.class;
        clsArr[llIIllIIllII[15]] = n.class;
        clsArr[llIIllIIllII[16]] = k.class;
        clsArr[llIIllIIllII[17]] = x.class;
        clsArr[llIIllIIllII[18]] = z.class;
        clsArr[llIIllIIllII[19]] = v.class;
        clsArr[llIIllIIllII[20]] = w.class;
        clsArr[llIIllIIllII[21]] = i.class;
        clsArr[llIIllIIllII[22]] = m.class;
        return clsArr;
    }

    protected void onStart() {
        this.d = new HashMap();
        this.j = llIIllIIllII[7];
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new HashMap();
        this.c.invoke(this::b);
        this.f.add(this.e);
        "".length();
    }

    private static boolean llllllIIIlIlll(int i) {
        return i > 0;
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
        c();
        d();
    }

    @Subscribe
    private void a(GameTick gameTick) {
        e();
        f();
        g();
        this.g.clear();
    }

    private static boolean llllllIIIllllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public static boolean a(int i) {
        if (llllllIIIlIlII(i, llIIllIIllII[0]) && llllllIIIlIlII(i, llIIllIIllII[1]) && llllllIIIlIlII(i, llIIllIIllII[2]) && llllllIIIlIlII(i, llIIllIIllII[3]) && llllllIIIlIlII(i, llIIllIIllII[4]) && !llllllIIIlIlIl(i, llIIllIIllII[5])) {
            return llIIllIIllII[7];
        }
        ?? r0 = llIIllIIllII[6];
        "".length();
        return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? ((((18 + 110) - 98) + 98) ^ (((83 + 70) - 101) + 91)) & (((125 ^ 100) ^ (12 ^ 26)) ^ (-" ".length())) : r0;
    }

    @Provides
    SquireGorillaConfig a(ConfigManager configManager) {
        return (SquireGorillaConfig) configManager.getConfig(SquireGorillaConfig.class);
    }

    private static boolean llllllIIIlIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    private void a(c cVar, d... dVarArr) {
        if (!llllllIIIlIlll(cVar.o()) || llllllIIIlIllI(cVar.n().isEmpty() ? 1 : 0)) {
            cVar.a((List) Arrays.stream(c.l).filter(dVar -> {
                return Arrays.stream(dVarArr).noneMatch(dVar -> {
                    if (llllllIIIllIlI(dVar, dVar)) {
                        ?? r0 = llIIllIIllII[6];
                        "".length();
                        return (((((113 + 83) - 51) + 97) ^ (((65 + 138) - 65) + 36)) & ((((22 ^ 79) & ((214 ^ 143) ^ (-1))) ^ (54 ^ 106)) ^ (-" ".length()))) > ((((150 + 31) - 152) + 147) ^ (((139 + 123) - 104) + 22)) ? ((106 ^ 17) ^ (97 ^ 75)) & (((((102 + 63) - 101) + 135) ^ (((140 + 103) - 174) + 81)) ^ (-" ".length())) : r0;
                    }
                    return llIIllIIllII[7];
                });
            }).collect(Collectors.toList()));
            cVar.b(llIIllIIllII[10]);
            cVar.d((boolean) llIIllIIllII[6]);
        }
    }

    public int i() {
        return this.j;
    }

    private static boolean llllllIIIllIII(Object obj) {
        return obj == null;
    }

    private static boolean llllllIIIllIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v140, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v146, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v166, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v176, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    private void e() {
        int tickCount = this.b.getTickCount();
        for (c cVar : this.d.values()) {
            Player interacting = cVar.m().getInteracting();
            f fVar = this.i.get(interacting);
            if (llllllIIIllIIl(cVar.t()) && llllllIIIllIII(interacting)) {
                cVar.a((boolean) llIIllIIllII[7]);
                "".length();
                if ((68 ^ 64) < (-" ".length())) {
                    return;
                }
            } else if (llllllIIIllIIl(fVar) && llllllIIIllIIl(fVar.r()) && llllllIIIllIll(cVar.s() ? 1 : 0) && llllllIIIlllII(tickCount, cVar.p()) && llllllIIIlIllI(cVar.m().getWorldArea().isInMeleeDistance(fVar.r()) ? 1 : 0)) {
                cVar.a((boolean) llIIllIIllII[6]);
                cVar.c(tickCount + llIIllIIllII[6]);
            }
            int animation = cVar.m().getAnimation();
            if (llllllIIIlIllI(cVar.v() ? 1 : 0) && llllllIIIlllIl(tickCount, cVar.p() + llIIllIIllII[11])) {
                cVar.c(tickCount + llIIllIIllII[9]);
                cVar.a((boolean) llIIllIIllII[6]);
                if (llllllIIIllIIl(fVar) && llllllIIIllIIl(fVar.r()) && llllllIIIllIll(cVar.m().getWorldArea().isInMeleeDistance(fVar.r()) ? 1 : 0) && llllllIIIllIll(cVar.m().getWorldArea().intersectsWith(fVar.r()) ? 1 : 0)) {
                    cVar.a((List) cVar.n().stream().filter(dVar -> {
                        if (llllllIIIlllll(dVar, d.MELEE)) {
                            ?? r0 = llIIllIIllII[6];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIllIIllII[7];
                    }).collect(Collectors.toList()));
                    if (llllllIIIllIIl(interacting)) {
                        d[] dVarArr = new d[llIIllIIllII[9]];
                        dVarArr[llIIllIIllII[7]] = d.MELEE;
                        dVarArr[llIIllIIllII[6]] = a(interacting);
                        a(cVar, dVarArr);
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                    }
                }
            } else if (llllllIIIlIlII(animation, cVar.q())) {
                if (llllllIIIlIlIl(animation, llIIllIIllII[23])) {
                    a(cVar, d.MELEE);
                    "".length();
                    if ((-" ".length()) >= " ".length()) {
                        return;
                    }
                } else if (llllllIIIlIlIl(animation, llIIllIIllII[24])) {
                    a(cVar, d.MAGIC);
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else if (llllllIIIlIlIl(animation, llIIllIIllII[25])) {
                    a(cVar, d.RANGED);
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                } else if (llllllIIIlIlIl(animation, llIIllIIllII[26]) && llllllIIIllIIl(interacting)) {
                    if (llllllIIIllIlI(cVar.l(), cVar.A())) {
                        a(cVar, d.BOULDER);
                        "".length();
                        if ((((93 ^ 23) ^ (((104 + 13) - 94) + 104)) & (((((25 + 152) - 37) + 29) ^ (((83 + 116) - 43) + 0)) ^ (-" ".length()))) != 0) {
                            return;
                        }
                    } else {
                        if (llllllIIIlllIl(tickCount, cVar.p())) {
                            cVar.c((boolean) llIIllIIllII[6]);
                            int w = cVar.w();
                            if (llllllIIIlIlIl(w, llIIllIIllII[27])) {
                                a(cVar, d.MAGIC);
                                "".length();
                                if ((((163 ^ 190) ^ (8 ^ 55)) & (((178 ^ 129) ^ (111 ^ 126)) ^ (-" ".length()))) == ((18 ^ 122) ^ (214 ^ 186))) {
                                    return;
                                }
                            } else if (llllllIIIlIlIl(w, llIIllIIllII[28])) {
                                a(cVar, d.RANGED);
                                "".length();
                                if (0 != 0) {
                                    return;
                                }
                            } else if (llllllIIIllIIl(fVar)) {
                                WorldArea r = fVar.r();
                                if (llllllIIIllIIl(r) && llllllIIIlIllI(this.g.stream().anyMatch(worldPoint -> {
                                    if (llllllIIIllIll(worldPoint.distanceTo(r))) {
                                        ?? r0 = llIIllIIllII[6];
                                        "".length();
                                        return ((70 ^ 119) & ((45 ^ 28) ^ (-1))) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIllIIllII[7];
                                }) ? 1 : 0)) {
                                    a(cVar, d.BOULDER);
                                    "".length();
                                    if (((27 ^ 36) & ((136 ^ 183) ^ (-1))) >= (70 ^ 66)) {
                                        return;
                                    }
                                } else if (llllllIIIllIll(fVar.E().isEmpty() ? 1 : 0)) {
                                    a(cVar, d.MELEE);
                                }
                            }
                        }
                        cVar.c(tickCount + llIIllIIllII[12]);
                        cVar.c((boolean) llIIllIIllII[6]);
                    }
                }
            }
            if (llllllIIIlIlll(cVar.B())) {
                cVar.f(cVar.B() - llIIllIIllII[6]);
                "".length();
                if (0 != 0) {
                    return;
                }
            } else if (llllllIIIlIllI(cVar.s() ? 1 : 0) && llllllIIIllIIl(cVar.m().getInteracting()) && llllllIIIllIll(cVar.y() ? 1 : 0) && llllllIIIlllIl(cVar.n().size(), llIIllIIllII[9]) && llllllIIIlIllI(cVar.n().stream().anyMatch(dVar2 -> {
                if (llllllIIIllIlI(dVar2, d.MELEE)) {
                    ?? r0 = llIIllIIllII[6];
                    "".length();
                    return "  ".length() == "   ".length() ? (false ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIllIIllII[7];
            }) ? 1 : 0) && llllllIIIllIIl(fVar) && llllllIIIllIIl(fVar.r()) && llllllIIIllIIl(cVar.r())) {
                WorldArea calculateNextTravellingPoint = cVar.r().calculateNextTravellingPoint(this.b.getTopLevelWorldView(), fVar.r(), (boolean) llIIllIIllII[6], worldPoint2 -> {
                    WorldArea worldArea = new WorldArea(worldPoint2, llIIllIIllII[6], llIIllIIllII[6]);
                    if (llllllIIIlIllI(this.d.values().stream().noneMatch(cVar2 -> {
                        WorldArea r2;
                        if (llllllIIIllIlI(cVar2, cVar)) {
                            return llIIllIIllII[7];
                        }
                        if (llllllIIIlllII(cVar2.m().getIndex(), cVar.m().getIndex())) {
                            r2 = cVar2.m().getWorldArea();
                            "".length();
                            if (0 != 0) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            r2 = cVar2.r();
                        }
                        WorldArea worldArea2 = r2;
                        if (llllllIIIllIIl(worldArea2) && llllllIIIlIllI(worldArea.intersectsWith(worldArea2) ? 1 : 0)) {
                            ?? r0 = llIIllIIllII[6];
                            "".length();
                            return ((115 ^ 71) ^ (30 ^ 47)) <= 0 ? ((188 ^ 135) ^ (225 ^ 196)) & (((((146 + 46) - 191) + 170) ^ (((134 + 63) - 40) + 24)) ^ (-" ".length())) : r0;
                        }
                        return llIIllIIllII[7];
                    }) ? 1 : 0) && llllllIIIlIllI(this.i.values().stream().noneMatch(fVar2 -> {
                        WorldArea r2 = fVar2.r();
                        if (llllllIIIllIIl(r2) && llllllIIIlIllI(worldArea.intersectsWith(r2) ? 1 : 0)) {
                            ?? r0 = llIIllIIllII[6];
                            "".length();
                            return "   ".length() <= " ".length() ? ((244 ^ 142) ^ (63 ^ 31)) & (((226 ^ 188) ^ (141 ^ 137)) ^ (-" ".length())) : r0;
                        }
                        return llIIllIIllII[7];
                    }) ? 1 : 0)) {
                        ?? r0 = llIIllIIllII[6];
                        "".length();
                        return " ".length() <= ((50 ^ 7) & ((161 ^ 148) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIllIIllII[7];
                });
                if (llllllIIIllIIl(calculateNextTravellingPoint)) {
                    int distanceTo = cVar.m().getWorldArea().distanceTo(fVar.r());
                    WorldPoint worldPoint3 = calculateNextTravellingPoint.toWorldPoint();
                    if (llllllIIIllllI(distanceTo, llIIllIIllII[17]) && llllllIIIlIllI(fVar.r().hasLineOfSightTo(this.b.getTopLevelWorldView(), cVar.r()) ? 1 : 0)) {
                        if (llllllIIIlIllI(worldPoint3.distanceTo(cVar.r().toWorldPoint()))) {
                            if (llllllIIIllIll(worldPoint3.distanceTo(cVar.m().getWorldLocation()))) {
                                cVar.a((List) cVar.n().stream().filter(dVar3 -> {
                                    if (llllllIIIllIlI(dVar3, d.MELEE)) {
                                        ?? r0 = llIIllIIllII[6];
                                        "".length();
                                        return ((90 ^ 33) ^ (((77 + 78) - 86) + 58)) < 0 ? ((((35 + 99) - 58) + 175) ^ (((165 + 34) - 75) + 60)) & (((((161 + 166) - 310) + 179) ^ (((79 + 124) - 134) + 66)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIllIIllII[7];
                                }).collect(Collectors.toList()));
                                "".length();
                                if ((-"  ".length()) >= 0) {
                                    return;
                                }
                            } else {
                                cVar.a((List) cVar.n().stream().filter(dVar4 -> {
                                    if (llllllIIIlllll(dVar4, d.MELEE)) {
                                        ?? r0 = llIIllIIllII[6];
                                        "".length();
                                        return "   ".length() >= ((107 ^ 13) ^ (9 ^ 107)) ? ((238 ^ 174) ^ (83 ^ 56)) & (((((37 + 100) - 57) + 103) ^ (((71 + 39) - (-45)) + 1)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIllIIllII[7];
                                }).collect(Collectors.toList()));
                                "".length();
                                if ((((((174 + 13) - 49) + 79) ^ (((106 + 32) - 72) + 75)) & (((((118 + 156) - 115) + 36) ^ (((79 + 105) - 164) + 131)) ^ (-" ".length()))) != 0) {
                                    return;
                                }
                            }
                        } else if (llllllIIIlllIl(tickCount, cVar.p()) && llllllIIIlIlIl(cVar.w(), llIIllIIllII[29]) && llllllIIIlIllI(this.g.stream().noneMatch(worldPoint4 -> {
                            if (llllllIIIllIll(worldPoint4.distanceTo(fVar.r()))) {
                                ?? r0 = llIIllIIllII[6];
                                "".length();
                                return (138 ^ 142) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIIllIIllII[7];
                        }) ? 1 : 0)) {
                            cVar.a((List) cVar.n().stream().filter(dVar5 -> {
                                if (llllllIIIllIlI(dVar5, d.MELEE)) {
                                    ?? r0 = llIIllIIllII[6];
                                    "".length();
                                    return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIllIIllII[7];
                            }).collect(Collectors.toList()));
                        }
                    }
                }
            }
            if (llllllIIIlIllI(cVar.v() ? 1 : 0)) {
                cVar.a((boolean) llIIllIIllII[6]);
            }
            if (llllllIIIlllll(cVar.l(), cVar.A())) {
                if (!llllllIIIllIll(cVar.z() ? 1 : 0) || llllllIIIlIllI(cVar.y() ? 1 : 0)) {
                    cVar.f(llIIllIIllII[9]);
                    "".length();
                    if ((-(162 ^ 166)) >= 0) {
                        return;
                    }
                } else {
                    cVar.f(llIIllIIllII[6]);
                }
            }
            cVar.d(cVar.m().getAnimation());
            cVar.a(cVar.m().getWorldArea());
            cVar.a(cVar.m().getInteracting());
            if (llllllIIIllIIl(cVar.t())) {
                cVar.b(cVar.t());
            }
            cVar.b((boolean) llIIllIIllII[7]);
            cVar.c((boolean) llIIllIIllII[7]);
            cVar.e(cVar.y());
            cVar.d((boolean) llIIllIIllII[7]);
            cVar.a(cVar.l());
            cVar.e(llIIllIIllII[29]);
            "".length();
            if ((((182 ^ 139) ^ (56 ^ 30)) & (((123 ^ 56) ^ (211 ^ 139)) ^ (-" ".length()))) != 0) {
                return;
            }
        }
    }

    @Subscribe
    private void a(PlayerSpawned playerSpawned) {
        if (llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
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
        this.f.remove(this.e);
        "".length();
    }

    private static boolean llllllIIIlllII(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllIIIlllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llllllIIIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private d a(Player player) {
        HeadIcon overheadIcon = player.getOverheadIcon();
        if (llllllIIIllIII(overheadIcon)) {
            return null;
        }
        switch (a.k[overheadIcon.ordinal()]) {
            case 1:
                return d.MELEE;
            case 2:
                return d.RANGED;
            case 3:
                return d.MAGIC;
            default:
                return null;
        }
    }

    @Subscribe
    private void a(PlayerDespawned playerDespawned) {
        if (llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
            return;
        }
        this.i.remove(playerDespawned.getPlayer());
        "".length();
    }

    private static void llllllIIIlIIll() {
        llIIllIIllII = new int[31];
        llIIllIIllII[0] = (-((-11943) & 28343)) & (-1026) & 24569;
        llIIllIIllII[1] = (-16403) & 23547;
        llIIllIIllII[2] = (-1045) & 8190;
        llIIllIIllII[3] = (-((-10953) & 28381)) & (-1) & 24575;
        llIIllIIllII[4] = (-((-5607) & 21991)) & (-1042) & 24573;
        llIIllIIllII[5] = (-16401) & 23549;
        llIIllIIllII[6] = " ".length();
        llIIllIIllII[7] = ((((162 + 6) - 15) + 40) ^ (((30 + 67) - 16) + 49)) & (((((113 + 134) - 109) + 61) ^ (((78 + 25) - 16) + 45)) ^ (-" ".length()));
        llIIllIIllII[8] = 4 ^ 20;
        llIIllIIllII[9] = "  ".length();
        llIIllIIllII[10] = "   ".length();
        llIIllIIllII[11] = (((42 + 26) - (-31)) + 98) ^ (((138 + 33) - 150) + 172);
        llIIllIIllII[12] = (118 ^ 49) ^ (52 ^ 118);
        llIIllIIllII[13] = (((61 + 125) - 109) + 71) ^ (((131 + 87) - 148) + 76);
        llIIllIIllII[14] = 69 ^ 66;
        llIIllIIllII[15] = 67 ^ 75;
        llIIllIIllII[16] = 80 ^ 89;
        llIIllIIllII[17] = (((88 + 10) - (-46)) + 17) ^ (((25 + 6) - (-101)) + 39);
        llIIllIIllII[18] = 185 ^ 178;
        llIIllIIllII[19] = (((51 + 115) - 68) + 93) ^ (((101 + 7) - 106) + 177);
        llIIllIIllII[20] = (49 ^ 107) ^ (217 ^ 142);
        llIIllIIllII[21] = (10 ^ 83) ^ (57 ^ 110);
        llIIllIIllII[22] = (133 ^ 182) ^ (19 ^ 47);
        llIIllIIllII[23] = (-((-1337) & 26489)) & (-261) & 32638;
        llIIllIIllII[24] = (-((-23321) & 31709)) & (-16641) & 32253;
        llIIllIIllII[25] = (-513) & 7739;
        llIIllIIllII[26] = (-515) & 7742;
        llIIllIIllII[27] = (-10758) & 12061;
        llIIllIIllII[28] = (-24585) & 25886;
        llIIllIIllII[29] = -" ".length();
        llIIllIIllII[30] = (-((-16503) & 27767)) & (-4263) & 16382;
    }

    @Subscribe
    private void a(GameStateChanged gameStateChanged) {
        GameState gameState = gameStateChanged.getGameState();
        if (llllllIIIlllll(gameState, GameState.LOGGING_IN) && llllllIIIlllll(gameState, GameState.CONNECTION_LOST) && !llllllIIIllIlI(gameState, GameState.HOPPING)) {
            return;
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        this.i.clear();
        for (Player player : this.b.getPlayers()) {
            this.i.put(player, new f(player));
            "".length();
            "".length();
            if (((125 ^ 95) & ((179 ^ 145) ^ (-1))) < ((176 ^ 167) & ((19 ^ 4) ^ (-1)))) {
                return;
            }
        }
    }

    private static boolean llllllIIIlIlII(int i, int i2) {
        return i != i2;
    }

    public c a(NPC npc) {
        return this.d.getOrDefault(npc, null);
    }

    private static boolean llllllIIIllIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    private void a(HitsplatApplied hitsplatApplied) {
        if (llllllIIIlIllI(this.d.isEmpty() ? 1 : 0)) {
            return;
        }
        if (llllllIIIlIllI(hitsplatApplied.getActor() instanceof Player ? 1 : 0)) {
            f fVar = this.i.get(hitsplatApplied.getActor());
            if (llllllIIIllIIl(fVar)) {
                fVar.E().add(hitsplatApplied.getHitsplat());
                "".length();
            }
            "".length();
            if (true ^ true) {
            }
        } else if (llllllIIIlIllI(hitsplatApplied.getActor() instanceof NPC ? 1 : 0)) {
            c cVar = this.d.get(hitsplatApplied.getActor());
            int hitsplatType = hitsplatApplied.getHitsplat().getHitsplatType();
            if (llllllIIIllIIl(cVar)) {
                if (!llllllIIIlIlII(hitsplatType, llIIllIIllII[19]) || llllllIIIlIlIl(hitsplatType, llIIllIIllII[8])) {
                    cVar.b((boolean) llIIllIIllII[6]);
                }
            }
        }
    }

    private static boolean llllllIIIlllll(Object obj, Object obj2) {
        return obj != obj2;
    }
}
