package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/l.class */
public class C0011l {
    private static /* synthetic */ int[] lllllIIll;
    private static /* synthetic */ String[] lllllIIlI;

    private static void llIlIIlllIII() {
        lllllIIll = new int[31];
        lllllIIll[0] = (-545) & 3899;
        lllllIIll[1] = (-12613) & 15743;
        lllllIIll[2] = (((33 + 22) - 40) + 133) ^ (((60 + 87) - (-11)) + 20);
        lllllIIll[3] = (46 ^ 70) ^ (8 ^ 71);
        lllllIIll[4] = ((((22 + 19) - 34) + 169) ^ (((88 + 70) - 144) + 128)) & (((29 ^ 56) ^ (78 ^ 85)) ^ (-" ".length()));
        lllllIIll[5] = (-((-2347) & 19247)) & (-4099) & 24375;
        lllllIIll[6] = (-((-10562) & 31091)) & (-8705) & 32383;
        lllllIIll[7] = (-8898) & 12267;
        lllllIIll[8] = (-34) & 3199;
        lllllIIll[9] = (-((-21637) & 30111)) & (-33) & 11774;
        lllllIIll[10] = (-((-3092) & 24343)) & (-33) & 24511;
        lllllIIll[11] = (-((-13345) & 13861)) & (-8481) & 12223;
        lllllIIll[12] = (-12834) & 16111;
        lllllIIll[13] = (-((-1247) & 14079)) & (-5) & 16062;
        lllllIIll[14] = (-((-6534) & 32687)) & (-67) & 30719;
        lllllIIll[15] = " ".length();
        lllllIIll[16] = (44 ^ 2) ^ (179 ^ 155);
        lllllIIll[17] = "  ".length();
        lllllIIll[18] = (-((-21727) & 32479)) & (-20481) & 31611;
        lllllIIll[19] = "   ".length();
        lllllIIll[20] = (153 ^ 161) ^ (23 ^ 43);
        lllllIIll[21] = -" ".length();
        lllllIIll[22] = (((119 + 82) - 197) + 148) ^ (((144 + 32) - 148) + 129);
        lllllIIll[23] = (113 ^ 38) ^ (10 ^ 90);
        lllllIIll[24] = (179 ^ 180) ^ (154 ^ 149);
        lllllIIll[25] = 147 ^ 154;
        lllllIIll[26] = 28 ^ 22;
        lllllIIll[27] = 87 ^ 92;
        lllllIIll[28] = 41 ^ 37;
        lllllIIll[29] = 134 ^ 139;
        lllllIIll[30] = (((55 + 44) - 67) + 139) ^ (((11 + 120) - 92) + 126);
    }

    private static String llIlIIllIllI(String lIllIlIlIIIlI, String lIllIlIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), lllllIIll[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllIIll[17], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlIlIIIll) {
            lIllIlIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlllIll(int i) {
        return i != 0;
    }

    private static boolean llIlIIllllll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIlIIIIII(int i) {
        return i < 0;
    }

    private static boolean llIlIlIIIIIl(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIllllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIlIlIIIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIlIIIIll(Object obj) {
        return obj == null;
    }

    private static String llIlIIllIlIl(String lIllIIlllllIl, String lIllIIlllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlllllll = Cipher.getInstance("Blowfish");
            lIllIIlllllll.init(lllllIIll[17], secretKeySpec);
            return new String(lIllIIlllllll.doFinal(Base64.getDecoder().decode(lIllIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIIllllllI) {
            lIllIIllllllI.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIlllIII();
        llIlIIllIlll();
    }

    private static boolean llIlIlIIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIlIIllIlII(String lIllIlIIlIIlI, String lIllIlIIlIIIl) {
        String lIllIlIIlIIlI2 = new String(Base64.getDecoder().decode(lIllIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIlIIlIIII = new StringBuilder();
        char[] lIllIlIIIllll = lIllIlIIlIIIl.toCharArray();
        int lIllIlIIIlllI = lllllIIll[4];
        char[] charArray = lIllIlIIlIIlI2.toCharArray();
        int length = charArray.length;
        int i = lllllIIll[4];
        while (llIlIIllllll(i, length)) {
            lIllIlIIlIIII.append((char) (charArray[i] ^ lIllIlIIIllll[lIllIlIIIlllI % lIllIlIIIllll.length]));
            "".length();
            lIllIlIIIlllI++;
            i++;
            "".length();
            if (((56 ^ 102) & ((38 ^ 120) ^ (-1))) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lIllIlIIlIIII);
    }

    private static boolean llIlIIlllIlI(int i) {
        return i == 0;
    }

    public static void aj() {
        WorldArea worldArea = new WorldArea(lllllIIll[0], lllllIIll[1], lllllIIll[2], lllllIIll[3], lllllIIll[4]);
        WorldPoint worldPoint = new WorldPoint(lllllIIll[5], lllllIIll[6], lllllIIll[4]);
        WorldPoint worldPoint2 = new WorldPoint(lllllIIll[7], lllllIIll[8], lllllIIll[4]);
        C0004e.F();
        if (llIlIIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lllllIIll[9], lllllIIll[10], lllllIIll[4]);
            WorldPoint worldPoint4 = new WorldPoint(lllllIIll[9], lllllIIll[11], lllllIIll[4]);
            if (!llIlIIlllIlI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || llIlIIlllIll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lllllIIll[12], lllllIIll[13], lllllIIll[4]);
                C0004e.c(worldPoint5);
                Time.sleepUntil(() -> {
                    return Players.getLocal().getWorldLocation().equals(worldPoint5);
                }, lllllIIll[14]);
                "".length();
            }
            AccBuilderGWD.c = lllllIIlI[lllllIIll[4]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllllIIll[15]);
            "".length();
        }
        List all = Players.getAll(player -> {
            return worldArea.contains(player);
        });
        if (llIlIIlllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIllllII(all.size(), lllllIIll[16])) {
            if (llIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllllIIll[17])) {
                AccBuilderGWD.c = lllllIIlI[lllllIIll[15]];
                Movement.walkTo(worldPoint2);
                "".length();
                Time.sleepTicks(lllllIIll[15]);
                "".length();
            }
            if (llIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllllIIll[17])) {
                AccBuilderGWD.c = lllllIIlI[lllllIIll[17]];
                C0004e.D();
            }
        }
        if (llIlIIlllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIllllll(all.size(), lllllIIll[16])) {
            if (llIlIlIIIIII(llIlIIlllIIl(C0004e.w(), 55.0d))) {
                int[] iArr = new int[lllllIIll[15]];
                iArr[lllllIIll[4]] = lllllIIll[18];
                if (llIlIIlllIll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllllIIll[15]];
                    iArr2[lllllIIll[4]] = lllllIIll[18];
                    Inventory.getFirst(iArr2).interact(lllllIIlI[lllllIIll[19]]);
                    Time.sleepTicks(lllllIIll[15]);
                    "".length();
                }
            }
            if (llIlIlIIIIIl(Players.getLocal().getInteracting())) {
                AccBuilderGWD.c = lllllIIlI[lllllIIll[20]];
            }
            if (llIlIlIIIIIl(Players.getLocal().getInteracting()) && llIlIlIIIIlI(Players.getLocal().getHealthRatio(), lllllIIll[21])) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (llIlIIlllIll(npc.getName().contains(lllllIIlI[lllllIIll[29]]) ? 1 : 0) && llIlIlIIIlII(npc.getInteracting(), Players.getLocal()) && llIlIIlllIlI(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllllIIll[15];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllIIll[4];
                });
                if (llIlIlIIIIIl(nearest)) {
                    nearest.interact(lllllIIlI[lllllIIll[22]]);
                    Time.sleepTicks(lllllIIll[17]);
                    "".length();
                    return;
                }
                NPC nearest2 = NPCs.getNearest(npc2 -> {
                    if (llIlIIlllIll(npc2.getName().contains(lllllIIlI[lllllIIll[28]]) ? 1 : 0) && llIlIlIIIIll(npc2.getInteracting()) && llIlIIlllIlI(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = lllllIIll[15];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllIIll[4];
                });
                if (llIlIlIIIIIl(nearest2) && llIlIlIIIIll(nearest)) {
                    AccBuilderGWD.c = lllllIIlI[lllllIIll[16]];
                    nearest2.interact(lllllIIlI[lllllIIll[23]]);
                    Time.sleepTicks(lllllIIll[17]);
                    "".length();
                    return;
                }
            }
            if (llIlIlIIIIll(Players.getLocal().getInteracting())) {
                NPC nearest3 = NPCs.getNearest(npc3 -> {
                    if (llIlIIlllIll(npc3.getName().contains(lllllIIlI[lllllIIll[27]]) ? 1 : 0) && llIlIlIIIIll(npc3.getInteracting()) && llIlIIlllIlI(npc3.isDead() ? 1 : 0)) {
                        ?? r0 = lllllIIll[15];
                        "".length();
                        return (-" ".length()) > (-" ".length()) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                    }
                    return lllllIIll[4];
                });
                NPC nearest4 = NPCs.getNearest(npc4 -> {
                    if (llIlIIlllIll(npc4.getName().contains(lllllIIlI[lllllIIll[26]]) ? 1 : 0) && llIlIlIIIlII(npc4.getInteracting(), Players.getLocal()) && llIlIIlllIlI(npc4.isDead() ? 1 : 0)) {
                        ?? r0 = lllllIIll[15];
                        "".length();
                        return (50 ^ 54) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllllIIll[4];
                });
                if (llIlIlIIIIIl(nearest3) && llIlIlIIIIll(nearest4)) {
                    AccBuilderGWD.c = lllllIIlI[lllllIIll[24]];
                    nearest3.interact(lllllIIlI[lllllIIll[25]]);
                    Time.sleepTicks(lllllIIll[17]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIlIIllllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIIlllllI(int i, int i2) {
        return i <= i2;
    }

    private static void llIlIIllIlll() {
        lllllIIlI = new String[lllllIIll[30]];
        lllllIIlI[lllllIIll[4]] = llIlIIllIlII("KDEfbhUJcAEnDQpwDicACCQa", "fPiNa");
        lllllIIlI[lllllIIll[15]] = llIlIIllIlIl("6DIRTFOHNi6MDcn3AcYz4A==", "SqdyP");
        lllllIIlI[lllllIIll[17]] = llIlIIllIllI("643+xl7h1ahc6dCHf0c7eg==", "FeNVB");
        lllllIIlI[lllllIIll[19]] = llIlIIllIlIl("dTFmrE9jGWE=", "bdMLe");
        lllllIIlI[lllllIIll[20]] = llIlIIllIllI("JQOsLlqWP/hBapDEZHZBNA==", "smqlQ");
        lllllIIlI[lllllIIll[22]] = llIlIIllIlIl("ym4r3xAWtls=", "ePeTb");
        lllllIIlI[lllllIIll[16]] = llIlIIllIllI("vUhcPyMTaXHhShdG0XKJTHGQqTdHs3sI", "VXXaA");
        lllllIIlI[lllllIIll[23]] = llIlIIllIlII("BhI6CTks", "GfNhZ");
        lllllIIlI[lllllIIll[24]] = llIlIIllIllI("BXj+QHQW7zYn4U+ksJ6BJvGVsJF5Ajrz", "aOsqG");
        lllllIIlI[lllllIIll[25]] = llIlIIllIlIl("NisQjKR8SM8=", "Hazyk");
        lllllIIlI[lllllIIll[26]] = llIlIIllIlII("OjMIAg==", "rZdnj");
        lllllIIlI[lllllIIll[27]] = llIlIIllIlIl("QJQXZ8A3sLA=", "OCYtR");
        lllllIIlI[lllllIIll[28]] = llIlIIllIlIl("FyYc674iBiY=", "nKZOO");
        lllllIIlI[lllllIIll[29]] = llIlIIllIlIl("c+ubzWwEQ3s=", "tvvUy");
    }

    private static int llIlIIlllIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }
}
