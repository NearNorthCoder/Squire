package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/k.class */
public class C0010k {
    private static /* synthetic */ int[] lIlllIll;
    private static /* synthetic */ String[] lIlllIlI;

    private static String lIIllIllIlI(String lIlIllllIllIIlI, String lIlIllllIllIIIl) {
        try {
            SecretKeySpec lIlIllllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllllIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIll[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIll[17], lIlIllllIllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIllllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllllIllIlII) {
            lIlIllllIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllIlIII(int i) {
        return i == 0;
    }

    private static boolean lIIlllIllII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllllIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIllllIIIl(Object obj) {
        return obj == null;
    }

    private static String lIIllIllIII(String lIlIllllIlIIIII, String lIlIllllIIlllll) {
        String str = new String(Base64.getDecoder().decode(lIlIllllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIllllIIlllll.toCharArray();
        int lIlIllllIIlllII = lIlllIll[4];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlllIll[4];
        while (lIIlllIllIl(i, length)) {
            char lIlIllllIlIIIIl = charArray2[i];
            sb.append((char) (lIlIllllIlIIIIl ^ charArray[lIlIllllIIlllII % charArray.length]));
            "".length();
            lIlIllllIIlllII++;
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlllIlllI(int i) {
        return i < 0;
    }

    private static String lIIllIllIIl(String lIlIlllllIIIIIl, String lIlIlllllIIIIII) {
        try {
            SecretKeySpec lIlIlllllIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllllIIIIll = Cipher.getInstance("Blowfish");
            lIlIlllllIIIIll.init(lIlllIll[17], lIlIlllllIIIlII);
            return new String(lIlIlllllIIIIll.doFinal(Base64.getDecoder().decode(lIlIlllllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllllIIIIlI) {
            lIlIlllllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIllIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIlllIIllI() {
        lIlllIll = new int[31];
        lIlllIll[0] = (-12357) & 15711;
        lIlllIll[1] = (-321) & 3451;
        lIlllIll[2] = (((126 + 110) - 90) + 5) ^ (((6 + 6) - (-61)) + 104);
        lIlllIll[3] = 73 ^ 110;
        lIlllIll[4] = (60 ^ 110) & ((79 ^ 29) ^ (-1));
        lIlllIll[5] = (-((-2819) & 15183)) & (-3) & 15743;
        lIlllIll[6] = (-((-7005) & 31613)) & (-4737) & 32494;
        lIlllIll[7] = (-25157) & 28526;
        lIlllIll[8] = (-((-1107) & 14195)) & (-16513) & 32766;
        lIlllIll[9] = (-((-21578) & 22125)) & (-16649) & 20463;
        lIlllIll[10] = (-4642) & 7869;
        lIlllIll[11] = (-((-14343) & 31239)) & (-12353) & 32475;
        lIlllIll[12] = (-((-13550) & 30463)) & (-257) & 20447;
        lIlllIll[13] = (-(7 ^ 66)) & (-28929) & 32222;
        lIlllIll[14] = (-((-26901) & 27966)) & (-8259) & 13823;
        lIlllIll[15] = " ".length();
        lIlllIll[16] = 166 ^ 160;
        lIlllIll[17] = "  ".length();
        lIlllIll[18] = (-((-8475) & 14239)) & (-1) & 6143;
        lIlllIll[19] = "   ".length();
        lIlllIll[20] = 17 ^ 21;
        lIlllIll[21] = -" ".length();
        lIlllIll[22] = (((46 + 29) - (-53)) + 8) ^ (((62 + 101) - 103) + 81);
        lIlllIll[23] = 183 ^ 176;
        lIlllIll[24] = 66 ^ 74;
        lIlllIll[25] = 171 ^ 162;
        lIlllIll[26] = (134 ^ 166) ^ (171 ^ 129);
        lIlllIll[27] = (((86 + 56) - 57) + 59) ^ (((0 + 147) - 144) + 152);
        lIlllIll[28] = (((12 + 109) - 47) + 53) ^ (230 ^ 149);
        lIlllIll[29] = (8 ^ 84) ^ (60 ^ 109);
        lIlllIll[30] = 170 ^ 164;
    }

    private static boolean lIIlllIllll(Object obj) {
        return obj != null;
    }

    static {
        lIIlllIIllI();
        lIIllIlllII();
    }

    private static boolean lIIlllIlIll(int i, int i2) {
        return i > i2;
    }

    public static void Y() {
        WorldArea worldArea = new WorldArea(lIlllIll[0], lIlllIll[1], lIlllIll[2], lIlllIll[3], lIlllIll[4]);
        WorldPoint worldPoint = new WorldPoint(lIlllIll[5], lIlllIll[6], lIlllIll[4]);
        WorldPoint worldPoint2 = new WorldPoint(lIlllIll[7], lIlllIll[8], lIlllIll[4]);
        C0004e.E();
        if (lIIlllIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lIlllIll[9], lIlllIll[10], lIlllIll[4]);
            WorldPoint worldPoint4 = new WorldPoint(lIlllIll[9], lIlllIll[11], lIlllIll[4]);
            if (!lIIlllIlIII(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || lIIlllIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lIlllIll[12], lIlllIll[13], lIlllIll[4]);
                C0004e.c(worldPoint5);
                Time.sleepUntil(() -> {
                    return Players.getLocal().getWorldLocation().equals(worldPoint5);
                }, lIlllIll[14]);
                "".length();
            }
            AccBuilderBarrows.c = lIlllIlI[lIlllIll[4]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlllIll[15]);
            "".length();
        }
        List all = Players.getAll(player -> {
            return worldArea.contains(player);
        });
        if (lIIlllIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIlIlI(all.size(), lIlllIll[16])) {
            if (lIIlllIlIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlllIll[17])) {
                AccBuilderBarrows.c = lIlllIlI[lIlllIll[15]];
                Movement.walkTo(worldPoint2);
                "".length();
                Time.sleepTicks(lIlllIll[15]);
                "".length();
            }
            if (lIIlllIllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlllIll[17])) {
                AccBuilderBarrows.c = lIlllIlI[lIlllIll[17]];
                C0004e.C();
            }
        }
        if (lIIlllIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIllIl(all.size(), lIlllIll[16])) {
            if (lIIlllIlllI(lIIlllIIlll(C0004e.v(), 55.0d))) {
                int[] iArr = new int[lIlllIll[15]];
                iArr[lIlllIll[4]] = lIlllIll[18];
                if (lIIlllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlllIll[15]];
                    iArr2[lIlllIll[4]] = lIlllIll[18];
                    Inventory.getFirst(iArr2).interact(lIlllIlI[lIlllIll[19]]);
                    Time.sleepTicks(lIlllIll[15]);
                    "".length();
                }
            }
            if (lIIlllIllll(Players.getLocal().getInteracting())) {
                AccBuilderBarrows.c = lIlllIlI[lIlllIll[20]];
            }
            if (lIIlllIllll(Players.getLocal().getInteracting()) && lIIllllIIII(Players.getLocal().getHealthRatio(), lIlllIll[21])) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIIlllIlIIl(npc.getName().contains(lIlllIlI[lIlllIll[29]]) ? 1 : 0) && lIIllllIIlI(npc.getInteracting(), Players.getLocal()) && lIIlllIlIII(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIlllIll[15];
                        "".length();
                        return ((168 ^ 155) & ((3 ^ 48) ^ (-1))) == "   ".length() ? (!true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIll[4];
                });
                if (lIIlllIllll(nearest)) {
                    nearest.interact(lIlllIlI[lIlllIll[22]]);
                    Time.sleepTicks(lIlllIll[17]);
                    "".length();
                    return;
                }
                NPC nearest2 = NPCs.getNearest(npc2 -> {
                    if (lIIlllIlIIl(npc2.getName().contains(lIlllIlI[lIlllIll[28]]) ? 1 : 0) && lIIllllIIIl(npc2.getInteracting()) && lIIlllIlIII(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = lIlllIll[15];
                        "".length();
                        return (-"   ".length()) >= 0 ? ((((164 + 79) - 217) + 152) ^ (((64 + 104) - 145) + 127)) & (((88 ^ 19) ^ (24 ^ 119)) ^ (-" ".length())) : r0;
                    }
                    return lIlllIll[4];
                });
                if (lIIlllIllll(nearest2) && lIIllllIIIl(nearest)) {
                    AccBuilderBarrows.c = lIlllIlI[lIlllIll[16]];
                    nearest2.interact(lIlllIlI[lIlllIll[23]]);
                    Time.sleepTicks(lIlllIll[17]);
                    "".length();
                    return;
                }
            }
            if (lIIllllIIIl(Players.getLocal().getInteracting())) {
                NPC nearest3 = NPCs.getNearest(npc3 -> {
                    if (lIIlllIlIIl(npc3.getName().contains(lIlllIlI[lIlllIll[27]]) ? 1 : 0) && lIIllllIIIl(npc3.getInteracting()) && lIIlllIlIII(npc3.isDead() ? 1 : 0)) {
                        ?? r0 = lIlllIll[15];
                        "".length();
                        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlllIll[4];
                });
                NPC nearest4 = NPCs.getNearest(npc4 -> {
                    if (lIIlllIlIIl(npc4.getName().contains(lIlllIlI[lIlllIll[26]]) ? 1 : 0) && lIIllllIIlI(npc4.getInteracting(), Players.getLocal()) && lIIlllIlIII(npc4.isDead() ? 1 : 0)) {
                        ?? r0 = lIlllIll[15];
                        "".length();
                        return ((((100 + 107) - 95) + 36) ^ (((113 + 112) - 200) + 119)) <= 0 ? ((137 ^ 163) ^ (82 ^ 57)) & (((147 ^ 191) ^ (47 ^ 66)) ^ (-" ".length())) : r0;
                    }
                    return lIlllIll[4];
                });
                if (lIIlllIllll(nearest3) && lIIllllIIIl(nearest4)) {
                    AccBuilderBarrows.c = lIlllIlI[lIlllIll[24]];
                    nearest3.interact(lIlllIlI[lIlllIll[25]]);
                    Time.sleepTicks(lIlllIll[17]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIllllIIII(int i, int i2) {
        return i == i2;
    }

    private static void lIIllIlllII() {
        lIlllIlI = new String[lIlllIll[30]];
        lIlllIlI[lIlllIll[4]] = lIIllIllIII("CTc1bhsodisnAyt2JCcOKSIw", "GVCNo");
        lIlllIlI[lIlllIll[15]] = lIIllIllIII("Bw8meA06WiA3CXUOITQc", "UzHXy");
        lIlllIlI[lIlllIll[17]] = lIIllIllIIl("5gQhrBTU+2fOZpyHqQkOGQ==", "iBAek");
        lIlllIlI[lIlllIll[19]] = lIIllIllIIl("Z5/XLoEfyIY=", "inPfz");
        lIlllIlI[lIlllIll[20]] = lIIllIllIII("MQVHBzwVCQYQ", "xkgdS");
        lIlllIlI[lIlllIll[22]] = lIIllIllIlI("GA10e5n3STg=", "kqEle");
        lIlllIlI[lIlllIll[16]] = lIIllIllIlI("3VDlFYYrpsikcYyzi7SOnWY2A6CLcOUa", "VvFUY");
        lIlllIlI[lIlllIll[23]] = lIIllIllIIl("ER1SKxPafjI=", "NOukw");
        lIlllIlI[lIlllIll[24]] = lIIllIllIlI("macryw6PU18edYNhDymw3RFLMxdMslfY", "ZztrR");
        lIlllIlI[lIlllIll[25]] = lIIllIllIlI("s7awBJ9x1OE=", "nfoWf");
        lIlllIlI[lIlllIll[26]] = lIIllIllIIl("KQlmBykuaAA=", "Lcopi");
        lIlllIlI[lIlllIll[27]] = lIIllIllIII("CicLGg==", "BNgvj");
        lIlllIlI[lIlllIll[28]] = lIIllIllIIl("mBZO/tdiESA=", "sJlSJ");
        lIlllIlI[lIlllIll[29]] = lIIllIllIII("OA8lFg==", "pfIzA");
    }

    private static int lIIlllIIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlllIlIIl(int i) {
        return i != 0;
    }
}
