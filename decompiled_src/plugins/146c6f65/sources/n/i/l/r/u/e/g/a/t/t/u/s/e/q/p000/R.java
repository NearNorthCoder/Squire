package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Attacking for Crystals", priority = 2, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.R  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/R.class */
public class R extends AbstractC0013n {
    private static /* synthetic */ int[] llIIllIIlIll;
    private /* synthetic */ int cc;
    private final /* synthetic */ C0001b cb;
    private static /* synthetic */ String[] llIIllIIlIlI;

    private static void llllllIlIlIIIl() {
        llIIllIIlIlI = new String[llIIllIIlIll[3]];
        llIIllIIlIlI[llIIllIIlIll[1]] = llllllIlIIllll("40s8qW8xs/z7idUAxMvrrw==", "RmrHE");
        llIIllIIlIlI[llIIllIIlIll[2]] = llllllIlIlIIII("9h8rADAHvj8=", "osGMc");
    }

    private static boolean llllllIlIllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R(C0002c c0002c, C0001b c0001b) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllIIlIll[0]];
        enumC0003dArr[llIIllIIlIll[1]] = EnumC0003d.FIRST_ROTATION_EXPLORE;
        enumC0003dArr[llIIllIIlIll[2]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        enumC0003dArr[llIIllIIlIll[3]] = EnumC0003d.EXTRA_FOOD_EXPLORE;
        this.cc = llIIllIIlIll[1];
        this.cb = c0001b;
    }

    private static boolean llllllIlIlIlIl(int i) {
        return i == 0;
    }

    private static boolean llllllIlIllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllIlIlIIll(Object obj) {
        return obj == null;
    }

    static {
        llllllIlIlIIlI();
        llllllIlIlIIIl();
    }

    private static String llllllIlIIllll(String lllllllllllllllIlIIlIllIIIllllll, String lllllllllllllllIlIIlIllIIIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIIlllllI.getBytes(StandardCharsets.UTF_8)), llIIllIIlIll[9]), "DES");
            Cipher lllllllllllllllIlIIlIllIIlIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIllIIlIIIIIl.init(llIIllIIlIll[3], secretKeySpec);
            return new String(lllllllllllllllIlIIlIllIIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIIlIIIIII) {
            lllllllllllllllIlIIlIllIIlIIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v158, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v177, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v187, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v196, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v206, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v208, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        int i;
        int i2;
        Player local = Players.getLocal();
        if (llllllIlIlIIll(local)) {
            return llIIllIIlIll[1];
        }
        int tickCount = Static.getClient().getTickCount();
        if (!llllllIlIlIlII(this.ba.A() ? 1 : 0) || llllllIlIlIlIl(this.ba.S() ? 1 : 0)) {
            return llIIllIIlIll[1];
        }
        if (llllllIlIlIllI(this.ba.J()) && llllllIlIlIllI(local.getInteracting())) {
            return llIIllIIlIll[1];
        }
        if (llllllIlIlIlll(this.cc) && llllllIlIllIII(tickCount - this.cc, llIIllIIlIll[4])) {
            return llIIllIIlIll[1];
        }
        if (llllllIlIlIllI(local.getInteracting()) && llllllIlIllIIl(this.ba.W(), EnumC0003d.FIRST_ROTATION_EXPLORE)) {
            this.cc = tickCount;
            return llIIllIIlIll[2];
        }
        Map<EnumC0008i, Integer> E = this.ba.E();
        if (llllllIlIlIlIl(E.containsKey(EnumC0008i.CRYSTAL_SHARD) ? 1 : 0)) {
            return llIIllIIlIll[1];
        }
        int intValue = E.get(EnumC0008i.CRYSTAL_SHARD).intValue();
        if (llllllIlIllIlI(intValue)) {
            return llIIllIIlIll[1];
        }
        int aC = EnumC0008i.CRYSTAL_SHARD.aC();
        C0011l T = this.ba.T();
        if (llllllIlIllIll(this.ba.W(), EnumC0003d.DEMI_BOSS_EXPLORE)) {
            i = llIIllIIlIll[2];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIIllIIlIll[1];
        }
        int i3 = i;
        if (!llllllIlIlIlIl(i3) || llllllIlIllIll(this.ba.W(), EnumC0003d.EXTRA_FOOD_EXPLORE)) {
            i2 = llIIllIIlIll[2];
            "".length();
            if ((-" ".length()) > (14 ^ 10)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = llIIllIIlIll[1];
        }
        int i4 = i2;
        NPC npc = null;
        if (llllllIlIlIlII(i3)) {
            if (llllllIlIlIlII(this.ba.E().entrySet().stream().anyMatch(entry -> {
                if (llllllIlIlIlll(((Integer) entry.getValue()).intValue()) && llllllIlIllIIl(entry.getKey(), EnumC0008i.CRYSTAL_SHARD)) {
                    ?? r0 = llIIllIIlIll[2];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIllIIlIll[1];
            }) ? 1 : 0)) {
                if (!llllllIlIlllII(intValue, llIIllIIlIll[5])) {
                    return llIIllIIlIll[1];
                }
                NPC nearest = NPCs.getNearest(Predicates.ids(C0004e.as[llIIllIIlIll[2]]));
                if (!llllllIlIlIllI(nearest) || llllllIlIlllIl(nearest.distanceTo(local), llIIllIIlIll[6])) {
                    return llIIllIIlIll[1];
                }
                if (llllllIlIlIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                    return llIIllIIlIll[1];
                }
                npc = nearest;
                "".length();
                if (" ".length() != " ".length()) {
                    return ((((86 + 64) - (-9)) + 78) ^ (((71 + 136) - 68) + 3)) & (((((28 + 150) - 134) + 119) ^ (((124 + 171) - 174) + 71)) ^ (-" ".length()));
                }
            }
        } else if (llllllIlIlIlIl(this.ba.B() ? 1 : 0) && llllllIlIlllIl(aC, llIIllIIlIll[7])) {
            return llIIllIIlIll[1];
        }
        if (llllllIlIlIIll(npc) && llllllIlIllIll(this.ba.W(), EnumC0003d.FIRST_ROTATION_EXPLORE)) {
            npc = NPCs.getNearest(npc2 -> {
                if (llllllIlIlIlIl(npc2.isDead() ? 1 : 0) && llllllIlIlIlII(Predicates.ids(C0004e.as[llIIllIIlIll[1]]).test(npc2) ? 1 : 0) && (!llllllIlIlIllI(T) || llllllIlIlIlII(T.e(npc2.getWorldLocation()) ? 1 : 0))) {
                    ?? r0 = llIIllIIlIll[2];
                    "".length();
                    return !((true ^ true) ^ (true ^ true)) ? ((((192 + 46) - 152) + 152) ^ (((34 + 169) - 91) + 78)) & (((212 ^ 188) ^ (172 ^ 148)) ^ (-" ".length())) : r0;
                }
                return llIIllIIlIll[1];
            });
        }
        if (llllllIlIlIIll(npc) && llllllIlIlIlII(i4)) {
            npc = NPCs.getNearest(npc3 -> {
                if (!llllllIlIlIlIl(npc3.isDead() ? 1 : 0) || (llllllIlIlIlIl(Predicates.ids(C0004e.as[llIIllIIlIll[2]]).test(npc3) ? 1 : 0) && !llllllIlIlIlII(Predicates.ids(C0004e.as[llIIllIIlIll[1]]).test(npc3) ? 1 : 0))) {
                    return llIIllIIlIll[1];
                }
                ?? r0 = llIIllIIlIll[2];
                "".length();
                return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            });
            if (llllllIlIlIIll(npc) && llllllIlIlIlII(Equipment.contains(EnumC0005f.TIER_3_STAFF.ad()) ? 1 : 0)) {
                npc = NPCs.getNearest(npc4 -> {
                    if (llllllIlIlIlIl(npc4.isDead() ? 1 : 0) && llllllIlIlIlII(Arrays.stream(EnumC0006g.values()).anyMatch(enumC0006g -> {
                        return enumC0006g.f(npc4);
                    }) ? 1 : 0)) {
                        ?? r0 = llIIllIIlIll[2];
                        "".length();
                        return ((89 ^ 119) ^ (43 ^ 1)) < "  ".length() ? ((52 ^ 68) ^ (92 ^ 49)) & (((40 ^ 79) ^ (243 ^ 137)) ^ (-" ".length())) : r0;
                    }
                    return llIIllIIlIll[1];
                });
            }
        }
        if (llllllIlIlIIll(npc)) {
            return llIIllIIlIll[1];
        }
        WorldPoint worldLocation = local.getWorldLocation();
        int distanceTo = npc.distanceTo(worldLocation);
        if (!llllllIlIlllIl(distanceTo, llIIllIIlIll[8])) {
            if (llllllIlIlIlIl(this.cb.p() ? 1 : 0)) {
                npc.interact(llIIllIIlIlI[llIIllIIlIll[2]]);
            }
            return llIIllIIlIll[2];
        }
        C0007h V = this.ba.V();
        C0011l orElse = V.b(c0011l -> {
            if (llllllIlIlIlIl(c0011l.aY() ? 1 : 0) && llllllIlIlIlII(c0011l.e(V.d(worldLocation)) ? 1 : 0)) {
                ?? r0 = llIIllIIlIll[2];
                "".length();
                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIllIIlIll[1];
        }).stream().min(Comparator.comparingInt(c0011l2 -> {
            return (int) c0011l2.aQ().distanceToHypotenuse(worldLocation);
        })).orElse(null);
        if (llllllIlIlIllI(orElse) && llllllIlIllIII(orElse.aQ().distanceTo(worldLocation), distanceTo)) {
            return this.ba.a(orElse, worldLocation);
        }
        if (llllllIlIlllIl(distanceTo - npc.distanceTo(V.av().aQ()), llIIllIIlIll[6])) {
            Item first = Inventory.getFirst(item -> {
                return C0004e.ab.contains(Integer.valueOf(item.getId()));
            });
            if (llllllIlIlIllI(first)) {
                first.interact(llIIllIIlIlI[llIIllIIlIll[1]]);
                return llIIllIIlIll[2];
            }
        }
        WorldPoint worldLocation2 = npc.getWorldLocation();
        return this.ba.a(V.c(V.d(worldLocation)).stream().min(Comparator.comparingInt(c0011l3 -> {
            return (int) c0011l3.aQ().distanceToHypotenuse(worldLocation2);
        })).orElse(V.av()), worldLocation);
    }

    private static boolean llllllIlIlllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llllllIlIllIlI(int i) {
        return i < 0;
    }

    private static boolean llllllIlIlIlII(int i) {
        return i != 0;
    }

    private static boolean llllllIlIlllII(int i, int i2) {
        return i >= i2;
    }

    private static String llllllIlIlIIII(String lllllllllllllllIlIIlIllIIIllIIlI, String lllllllllllllllIlIIlIllIIIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllIIIllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllIIIllIlII.init(llIIllIIlIll[3], secretKeySpec);
            return new String(lllllllllllllllIlIIlIllIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIIIlIlllI) {
            lllllllllllllllIlIIlIllIIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlIlIlll(int i) {
        return i > 0;
    }

    private static void llllllIlIlIIlI() {
        llIIllIIlIll = new int[10];
        llIIllIIlIll[0] = "   ".length();
        llIIllIIlIll[1] = (106 ^ 81) & ((25 ^ 34) ^ (-1));
        llIIllIIlIll[2] = " ".length();
        llIIllIIlIll[3] = "  ".length();
        llIIllIIlIll[4] = 38 ^ 35;
        llIIllIIlIll[5] = (39 ^ 76) ^ (74 ^ 113);
        llIIllIIlIll[6] = (((142 + 9) - 9) + 72) ^ (((29 + 11) - 11) + 167);
        llIIllIIlIll[7] = 57 ^ 17;
        llIIllIIlIll[8] = (60 ^ 111) ^ (241 ^ 168);
        llIIllIIlIll[9] = (((35 + 82) - 0) + 10) ^ (254 ^ 137);
    }

    private static boolean llllllIlIlIllI(Object obj) {
        return obj != null;
    }

    private static boolean llllllIlIllIll(Object obj, Object obj2) {
        return obj == obj2;
    }
}
