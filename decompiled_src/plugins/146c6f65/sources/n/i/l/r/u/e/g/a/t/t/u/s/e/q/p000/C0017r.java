package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.gauntlet.GauntletConfig;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.api.HeadIcon;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(priority = 20, name = "Updating stage")
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/r.class */
public class C0017r extends Task {
    private final /* synthetic */ C0002c bx;
    private static /* synthetic */ int[] llIIlllIllIl;
    private final /* synthetic */ M by;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean bm() {
        List<EnumC0005f> I = this.bx.I();
        if (lllllllllllIII(Inventory.getFirst(item -> {
            return EnumC0005f.VIAL.ac().contains(Integer.valueOf(item.getId()));
        })) && llllllllllIlll(I.isEmpty() ? 1 : 0)) {
            ?? r0 = llIIlllIllIl[1];
            "".length();
            return (-" ".length()) > 0 ? ((20 ^ 77) ^ (191 ^ 195)) & (((70 ^ 127) ^ (145 ^ 141)) ^ (-" ".length())) : r0;
        }
        return llIIlllIllIl[4];
    }

    private boolean bo() {
        return this.bx.V().ar().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean bi() {
        Player local = Players.getLocal();
        return lllllllllllIII(local) ? llIIlllIllIl[4] : this.bx.V().av().e(local.getWorldLocation());
    }

    private void bp() {
        if (llllllllllIlll(Static.getClient().isTesting() ? 1 : 0)) {
            Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                System.exit(llIIlllIllIl[4]);
            }, Rand.nextInt(llIIlllIllIl[7], llIIlllIllIl[8]), TimeUnit.MINUTES);
            "".length();
        }
    }

    private static boolean llllllllllIlIl(Object obj) {
        return obj != null;
    }

    private static boolean llllllllllIlll(int i) {
        return i != 0;
    }

    private static boolean lllllllllllIlI(int i) {
        return i > 0;
    }

    private static boolean lllllllllllIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean bh() {
        if (llllllllllIlII(Inventory.contains(EnumC0008i.FISH.aB()) ? 1 : 0) && llllllllllIlII(this.bx.V().av().bb())) {
            ?? r0 = llIIlllIllIl[1];
            "".length();
            return (-((223 ^ 143) ^ (125 ^ 40))) >= 0 ? ((((1 + 115) - 10) + 47) ^ (((120 + 99) - 123) + 89)) & (((216 ^ 185) ^ (36 ^ 101)) ^ (-" ".length())) : r0;
        }
        return llIIlllIllIl[4];
    }

    private static boolean llllllllllllII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean bn() {
        if (lllllllllllIII(Inventory.getFirst(item -> {
            return EnumC0005f.VIAL.ac().contains(Integer.valueOf(item.getId()));
        }))) {
            ?? r0 = llIIlllIllIl[1];
            "".length();
            return (-((1 ^ 4) ^ ((18 ^ 51) & ((130 ^ 163) ^ (-1))))) >= 0 ? ((191 ^ 130) ^ (121 ^ 111)) & (((((52 + 108) - 86) + 87) ^ (((26 + 54) - 48) + 106)) ^ (-" ".length())) : r0;
        }
        return llIIlllIllIl[4];
    }

    private static boolean lllllllllllIIl(int i, int i2) {
        return i > i2;
    }

    private static void llllllllllIIII() {
        llIIlllIllIl = new int[9];
        llIIlllIllIl[0] = (-3075) & 12251;
        llIIlllIllIl[1] = " ".length();
        llIIlllIllIl[2] = (-5154) & 14331;
        llIIlllIllIl[3] = (59 ^ 62) ^ (166 ^ 183);
        llIIlllIllIl[4] = (118 ^ 33) & ((239 ^ 184) ^ (-1));
        llIIlllIllIl[5] = 136 ^ 140;
        llIIlllIllIl[6] = 173 ^ 133;
        llIIlllIllIl[7] = (108 ^ 98) ^ (190 ^ 181);
        llIIlllIllIl[8] = 136 ^ 171;
    }

    private static boolean llllllllllIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    public C0017r(C0002c c0002c, M m) {
        this.bx = c0002c;
        this.by = m;
    }

    private static boolean llllllllllIIll(int i, int i2) {
        return i != i2;
    }

    private static boolean llllllllllllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllllllIlII(int i) {
        return i == 0;
    }

    private static boolean llllllllllIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        llllllllllIIII();
    }

    private static boolean lllllllllllIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean N() {
        for (Map.Entry<EnumC0008i, Integer> entry : this.bx.E().entrySet()) {
            EnumC0008i key = entry.getKey();
            if (llllllllllllIl(Inventory.getCount((boolean) llIIlllIllIl[1], key.aB()), entry.getValue().intValue())) {
                return llIIlllIllIl[4];
            }
            "".length();
            if (0 != 0) {
                return "  ".length() & ("  ".length() ^ (-" ".length()));
            }
        }
        return llIIlllIllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean bk() {
        if (llllllllllIlll(bo() ? 1 : 0) && llllllllllIlll(bl() ? 1 : 0) && llllllllllIlll(this.by.bD().isEmpty() ? 1 : 0) && lllllllllllIII(this.bx.U())) {
            ?? r0 = llIIlllIllIl[1];
            "".length();
            return "   ".length() <= 0 ? ((88 ^ 66) ^ (240 ^ 195)) & (((5 ^ 8) ^ (80 ^ 116)) ^ (-" ".length())) : r0;
        }
        return llIIlllIllIl[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean bj() {
        if (llllllllllIlII(this.bx.B() ? 1 : 0) && lllllllllllIIl(EnumC0008i.CRYSTAL_SHARD.aC(), llIIlllIllIl[6])) {
            ?? r0 = llIIlllIllIl[1];
            "".length();
            return 0 != 0 ? ((4 ^ 112) ^ (54 ^ 98)) & (((((45 + 27) - 51) + 136) ^ (((39 + 163) - 78) + 65)) ^ (-" ".length())) : r0;
        }
        return llIIlllIllIl[4];
    }

    private static boolean llllllllllIIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean bl() {
        if (!lllllllllllIII(Players.getLocal()) && lllllllllllIII(NPCs.getNearest(npc -> {
            if (llllllllllIlll(C0004e.at.or(C0004e.au).test(npc) ? 1 : 0) && llllllllllIlII(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIlllIllIl[1];
                "".length();
                return "   ".length() <= (((195 ^ 148) ^ (85 ^ 11)) & (((((172 + 66) - 80) + 18) ^ (((85 + 89) - 170) + 181)) ^ (-" ".length()))) ? ((((28 + 85) - (-35)) + 15) ^ (((5 + 106) - (-28)) + 8)) & (((62 ^ 101) ^ (193 ^ 170)) ^ (-" ".length())) : r0;
            }
            return llIIlllIllIl[4];
        }))) {
            ?? r0 = llIIlllIllIl[1];
            "".length();
            return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
        }
        return llIIlllIllIl[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v186, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v210, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v264, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v272, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    public boolean run() {
        int i;
        EnumC0003d W = this.bx.W();
        if (llllllllllIIIl(W, EnumC0003d.BOSS_FIGHT) && llllllllllIIlI(Vars.getBit(llIIlllIllIl[0]), llIIlllIllIl[1])) {
            this.bx.a(EnumC0003d.BOSS_FIGHT);
            return llIIlllIllIl[1];
        }
        if (llllllllllIIlI(Vars.getBit(llIIlllIllIl[2]), llIIlllIllIl[1]) && llllllllllIIll(Vars.getBit(llIIlllIllIl[0]), llIIlllIllIl[1])) {
            C0009j X = this.bx.X();
            if (llllllllllIlII(this.bx.h().makeT3Offhand() ? 1 : 0) && llllllllllIlIl(X) && llllllllllIllI(this.bx.X().aD(), HeadIcon.MAGIC)) {
                this.bx.a(EnumC0003d.GIVE_UP);
                return llIIlllIllIl[1];
            }
        }
        GauntletConfig h = this.bx.h();
        int fishGoal = h.fishGoal() - h.fishGoalDeviation();
        switch (C0018s.bz[W.ordinal()]) {
            case 1:
                if (!llllllllllIlII(N() ? 1 : 0) || !llllllllllIlII(bk() ? 1 : 0) || llllllllllIlll(bj() ? 1 : 0)) {
                    if (!llllllllllIlll(bl() ? 1 : 0) || !llllllllllIlll(this.bx.B() ? 1 : 0) || !lllllllllllIII(Players.getLocal().getInteracting())) {
                        if (llllllllllIlII(this.bx.B() ? 1 : 0) && llllllllllIlll(bo() ? 1 : 0) && lllllllllllIIl(EnumC0008i.CRYSTAL_SHARD.aC(), llIIlllIllIl[3])) {
                            this.bx.a(EnumC0003d.FIRST_ROTATION_CREATE);
                            bp();
                            return llIIlllIllIl[1];
                        }
                        return llIIlllIllIl[4];
                    }
                    this.bx.a(EnumC0003d.GIVE_UP);
                    "".length();
                    if ((-"   ".length()) >= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    "".length();
                    if ((-(112 ^ 116)) > 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
                break;
            case 2:
                if (llllllllllIlll(bm() ? 1 : 0) && llllllllllIlll(bn() ? 1 : 0)) {
                    this.bx.a(EnumC0003d.DEMI_BOSS_EXPLORE);
                    return llIIlllIllIl[1];
                }
                break;
            case 3:
                if (llllllllllIlll(bi() ? 1 : 0)) {
                    if (llllllllllIlll(N() ? 1 : 0)) {
                        this.bx.a(EnumC0003d.PREPARE_BOSS_FIGHT);
                        return llIIlllIllIl[1];
                    } else if (llllllllllIlll(h.goHomeT3() ? 1 : 0) && llllllllllIlll(h.makeT3Offhand() ? 1 : 0) && llllllllllIlll(this.bx.a(EnumC0005f.TIER_3_STAFF) ? 1 : 0)) {
                        this.bx.a(EnumC0003d.CREATING_T3_STAFF);
                        "".length();
                        if ((-((124 ^ 107) ^ (129 ^ 147))) >= 0) {
                            return ((190 ^ 174) ^ (103 ^ 63)) & (((35 ^ 121) ^ (20 ^ 6)) ^ (-" ".length()));
                        }
                    }
                }
                break;
            case 4:
                if (llllllllllIlII(this.bx.a(EnumC0005f.TIER_3_STAFF) ? 1 : 0)) {
                    this.bx.a(EnumC0003d.DEMI_BOSS_EXPLORE);
                    return llIIlllIllIl[1];
                }
                break;
            case 5:
                if (llllllllllIlll(bi() ? 1 : 0) && llllllllllIlll(bm() ? 1 : 0) && !llllllllllIlII(bh() ? 1 : 0)) {
                    if (!llllllllllIlII(this.bx.a(EnumC0005f.TIER_3_STAFF.ad()) ? 1 : 0) || llllllllllIlll(this.bx.a(EnumC0005f.TIER_3_BOW.ad()) ? 1 : 0)) {
                        this.bx.a(EnumC0003d.DEMI_BOSS_EXPLORE);
                        return llIIlllIllIl[1];
                    } else if (lllllllllllIIl(this.bx.M(), llIIlllIllIl[3]) && lllllllllllIlI(this.bx.E().getOrDefault(EnumC0008i.CRYSTAL_SHARD, Integer.valueOf(llIIlllIllIl[4])).intValue())) {
                        this.bx.a(EnumC0003d.EXTRA_FOOD_EXPLORE);
                        return llIIlllIllIl[1];
                    } else {
                        if (lllllllllllIIl(fishGoal, this.bx.F())) {
                            i = llIIlllIllIl[1];
                            "".length();
                            if (" ".length() < 0) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            i = llIIlllIllIl[4];
                        }
                        int i2 = i;
                        if (llllllllllIlII(Inventory.getFreeSlots()) && llllllllllIlll(this.bx.a(enumC0008i -> {
                            if (llllllllllIllI(enumC0008i, EnumC0008i.FISH)) {
                                ?? r0 = llIIlllIllIl[1];
                                "".length();
                                return "   ".length() <= 0 ? ((10 ^ 54) ^ (80 ^ 106)) & (((((60 + 65) - 81) + 88) ^ (((44 + 92) - 64) + 58)) ^ (-" ".length())) : r0;
                            }
                            return llIIlllIllIl[4];
                        }) ? 1 : 0)) {
                            this.bx.a(EnumC0003d.AFK);
                            return llIIlllIllIl[1];
                        } else if (llllllllllIlII(Inventory.getFreeSlots())) {
                            return llIIlllIllIl[4];
                        } else {
                            if (llllllllllIlll(i2) && lllllllllllIIl(this.bx.M(), llIIlllIllIl[3])) {
                                C0007h V = this.bx.V();
                                if (!llllllllllIlII(V.b(c0011l -> {
                                    if (llllllllllIlII(c0011l.aY() ? 1 : 0)) {
                                        ?? r0 = llIIlllIllIl[1];
                                        "".length();
                                        return ((225 ^ 188) & ((34 ^ 127) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIIlllIllIl[4];
                                }).stream().filter(c0011l2 -> {
                                    return V.c(c0011l2).stream().anyMatch(c0011l2 -> {
                                        if (llllllllllIlII(c0011l2.aV() ? 1 : 0)) {
                                            ?? r0 = llIIlllIllIl[1];
                                            "".length();
                                            return !(true ^ false) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIIlllIllIl[4];
                                    });
                                }).min(Comparator.comparing((v0) -> {
                                    return v0.aT();
                                })).isPresent() ? 1 : 0) || llllllllllIlIl(this.bx.U())) {
                                    this.bx.a(EnumC0003d.EXTRA_FOOD_EXPLORE);
                                    return llIIlllIllIl[1];
                                }
                            }
                            this.bx.a(EnumC0003d.AFK);
                            return llIIlllIllIl[1];
                        }
                    }
                }
                return llIIlllIllIl[4];
            case 6:
                if (lllllllllllIll(this.bx.M(), llIIlllIllIl[3]) && (!llllllllllIlll(bm() ? 1 : 0) || llllllllllllII(EnumC0008i.FISH.aC(), llIIlllIllIl[5]))) {
                    this.bx.a(EnumC0003d.PREPARE_BOSS_FIGHT);
                    return llIIlllIllIl[1];
                } else if (!llllllllllIlll(bi() ? 1 : 0) || llllllllllIlII(N() ? 1 : 0)) {
                    return llIIlllIllIl[4];
                } else {
                    if (!llllllllllIlll(Inventory.getFreeSlots()) || lllllllllllIll(fishGoal, this.bx.F())) {
                        this.bx.a(EnumC0003d.PREPARE_BOSS_FIGHT);
                        return llIIlllIllIl[1];
                    }
                }
                break;
        }
        return llIIlllIllIl[4];
    }
}
