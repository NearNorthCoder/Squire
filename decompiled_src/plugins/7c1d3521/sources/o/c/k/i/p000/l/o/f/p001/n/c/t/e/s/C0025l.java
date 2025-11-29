package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/l.class */
public class C0025l {
    private static /* synthetic */ int[] lllIIIlIlI;
    private static /* synthetic */ String[] lllIIIlIIl;

    private static void lIllllllIIlll() {
        lllIIIlIlI = new int[31];
        lllIIIlIlI[0] = (-((-3475) & 16343)) & (-1) & 16223;
        lllIIIlIlI[1] = (-((-21023) & 21279)) & (-24705) & 28091;
        lllIIIlIlI[2] = 114 ^ 84;
        lllIIIlIlI[3] = (136 ^ 163) ^ (156 ^ 144);
        lllIIIlIlI[4] = ((90 ^ 33) ^ (243 ^ 132)) & (((((61 + 100) - 53) + 42) ^ (((15 + 85) - 63) + 117)) ^ (-" ".length()));
        lllIIIlIlI[5] = (-(((45 + 57) - 34) + 61)) & (-75) & 3579;
        lllIIIlIlI[6] = (-4785) & 7934;
        lllIIIlIlI[7] = (-((-25606) & 30359)) & (-5) & 8127;
        lllIIIlIlI[8] = (-((-9741) & 14221)) & (-25121) & 32766;
        lllIIIlIlI[9] = (-4892) & 8159;
        lllIIIlIlI[10] = (-((-10396) & 31199)) & (-8225) & 32255;
        lllIIIlIlI[11] = (-513) & 3739;
        lllIIIlIlI[12] = (-((-2449) & 31665)) & (-273) & 32766;
        lllIIIlIlI[13] = (-((-17803) & 22447)) & (-2) & 7871;
        lllIIIlIlI[14] = (-26689) & 31188;
        lllIIIlIlI[15] = " ".length();
        lllIIIlIlI[16] = 45 ^ 43;
        lllIIIlIlI[17] = "  ".length();
        lllIIIlIlI[18] = (-11781) & 12159;
        lllIIIlIlI[19] = "   ".length();
        lllIIIlIlI[20] = 163 ^ 167;
        lllIIIlIlI[21] = -" ".length();
        lllIIIlIlI[22] = (237 ^ 153) ^ (254 ^ 143);
        lllIIIlIlI[23] = (((117 + 18) - 62) + 61) ^ (((89 + 95) - 159) + 104);
        lllIIIlIlI[24] = (100 ^ 76) ^ (15 ^ 47);
        lllIIIlIlI[25] = 4 ^ 13;
        lllIIIlIlI[26] = 116 ^ 126;
        lllIIIlIlI[27] = 112 ^ 123;
        lllIIIlIlI[28] = 20 ^ 24;
        lllIIIlIlI[29] = 124 ^ 113;
        lllIIIlIlI[30] = 125 ^ 115;
    }

    private static boolean lIllllllIllII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllllllIlIlI(int i) {
        return i != 0;
    }

    static {
        lIllllllIIlll();
        lIllllllIIllI();
    }

    private static void lIllllllIIllI() {
        lllIIIlIIl = new String[lllIIIlIlI[30]];
        lllIIIlIIl[lllIIIlIlI[4]] = lIllllllIIIll("kLALdj94/Mo8fApZCShfyMwgBpTLgW1M", "gjtAJ");
        lllIIIlIIl[lllIIIlIlI[15]] = lIllllllIIIll("ZUK2vLj33SIZlKnVcCzU1Q==", "khcLD");
        lllIIIlIIl[lllIIIlIlI[17]] = lIllllllIIIll("MqxmvC7yuj8Hwuru9BBUpQ==", "zmsqL");
        lllIIIlIIl[lllIIIlIlI[19]] = lIllllllIIIll("w+X2l08Gv8s=", "izdwD");
        lllIIIlIIl[lllIIIlIlI[20]] = lIllllllIIlII("IwhEOxgHBAUs", "jfdXw");
        lllIIIlIIl[lllIIIlIlI[22]] = lIllllllIIlIl("G4KkJyVjBKY=", "XBnmy");
        lllIIIlIIl[lllIIIlIlI[16]] = lIllllllIIlII("JjMdABUMLgcGVg8uBQ1WAC4IDwI=", "gGiav");
        lllIIIlIIl[lllIIIlIlI[23]] = lIllllllIIlIl("rKt0MwldUcs=", "TzqrB");
        lllIIIlIIl[lllIIIlIlI[24]] = lIllllllIIIll("0kc+ikQThP3srQ08qi5+za1xOVkKTcNl", "mddKN");
        lllIIIlIIl[lllIIIlIlI[25]] = lIllllllIIlII("ORw1FhUT", "xhAwv");
        lllIIIlIIl[lllIIIlIlI[26]] = lIllllllIIIll("rfBSH3F5joc=", "FUWds");
        lllIIIlIIl[lllIIIlIlI[27]] = lIllllllIIlIl("MxdYaLptE7Q=", "axVRn");
        lllIIIlIIl[lllIIIlIlI[28]] = lIllllllIIlIl("k+jJwYNz87A=", "HWWeh");
        lllIIIlIIl[lllIIIlIlI[29]] = lIllllllIIIll("6U8OgYFTUNA=", "iLFoB");
    }

    private static String lIllllllIIIll(String lllllllllllllllllIllllIIIlIIllII, String lllllllllllllllllIllllIIIlIIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIllllIIIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), lllIIIlIlI[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlIlI[17], lllllllllllllllllIllllIIIlIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllIIIlIIllIl) {
            lllllllllllllllllIllllIIIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIIlII(String lllllllllllllllllIllllIIIIlIllll, String lllllllllllllllllIllllIIIIlIlllI) {
        String lllllllllllllllllIllllIIIIlIllll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIllllIIIIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIllllIIIIlIlllI.toCharArray();
        int lllllllllllllllllIllllIIIIlIlIll = lllIIIlIlI[4];
        char[] charArray2 = lllllllllllllllllIllllIIIIlIllll2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIlIlI[4];
        while (lIllllllIlllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIllllIIIIlIlIll % charArray.length]));
            "".length();
            lllllllllllllllllIllllIIIIlIlIll++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllllllIllIl(int i, int i2) {
        return i <= i2;
    }

    public static void aj() {
        WorldArea worldArea = new WorldArea(lllIIIlIlI[0], lllIIIlIlI[1], lllIIIlIlI[2], lllIIIlIlI[3], lllIIIlIlI[4]);
        WorldPoint worldPoint = new WorldPoint(lllIIIlIlI[5], lllIIIlIlI[6], lllIIIlIlI[4]);
        WorldPoint worldPoint2 = new WorldPoint(lllIIIlIlI[7], lllIIIlIlI[8], lllIIIlIlI[4]);
        C0018e.F();
        if (lIllllllIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lllIIIlIlI[9], lllIIIlIlI[10], lllIIIlIlI[4]);
            WorldPoint worldPoint4 = new WorldPoint(lllIIIlIlI[9], lllIIIlIlI[11], lllIIIlIlI[4]);
            if (!lIllllllIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || lIllllllIlIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lllIIIlIlI[12], lllIIIlIlI[13], lllIIIlIlI[4]);
                C0018e.c(worldPoint5);
                Time.sleepUntil(() -> {
                    return Players.getLocal().getWorldLocation().equals(worldPoint5);
                }, lllIIIlIlI[14]);
                "".length();
            }
            AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[4]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lllIIIlIlI[15]);
            "".length();
        }
        List all = Players.getAll(player -> {
            return worldArea.contains(player);
        });
        if (lIllllllIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllllllIlIll(all.size(), lllIIIlIlI[16])) {
            if (lIllllllIllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIIIlIlI[17])) {
                AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[15]];
                Movement.walkTo(worldPoint2);
                "".length();
                Time.sleepTicks(lllIIIlIlI[15]);
                "".length();
            }
            if (lIllllllIllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIIIlIlI[17])) {
                AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[17]];
                C0018e.D();
            }
        }
        if (lIllllllIlIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllllllIlllI(all.size(), lllIIIlIlI[16])) {
            if (lIllllllIllll(lIllllllIlIII(C0018e.w(), 55.0d))) {
                int[] iArr = new int[lllIIIlIlI[15]];
                iArr[lllIIIlIlI[4]] = lllIIIlIlI[18];
                if (lIllllllIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIIIlIlI[15]];
                    iArr2[lllIIIlIlI[4]] = lllIIIlIlI[18];
                    Inventory.getFirst(iArr2).interact(lllIIIlIIl[lllIIIlIlI[19]]);
                    Time.sleepTicks(lllIIIlIlI[15]);
                    "".length();
                }
            }
            if (lIlllllllIIII(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[20]];
            }
            if (lIlllllllIIII(Players.getLocal().getInteracting()) && lIlllllllIIIl(Players.getLocal().getHealthRatio(), lllIIIlIlI[21])) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIllllllIlIlI(npc.getName().contains(lllIIIlIIl[lllIIIlIlI[29]]) ? 1 : 0) && lIlllllllIIll(npc.getInteracting(), Players.getLocal()) && lIllllllIlIIl(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllIIIlIlI[15];
                        "".length();
                        return (((77 ^ 61) ^ (47 ^ 12)) & (((19 ^ 69) ^ (4 ^ 1)) ^ (-" ".length()))) != 0 ? ((240 ^ 150) ^ (94 ^ 2)) & (((240 ^ 198) ^ (99 ^ 111)) ^ (-" ".length())) : r0;
                    }
                    return lllIIIlIlI[4];
                });
                if (lIlllllllIIII(nearest)) {
                    nearest.interact(lllIIIlIIl[lllIIIlIlI[22]]);
                    Time.sleepTicks(lllIIIlIlI[17]);
                    "".length();
                    return;
                }
                NPC nearest2 = NPCs.getNearest(npc2 -> {
                    if (lIllllllIlIlI(npc2.getName().contains(lllIIIlIIl[lllIIIlIlI[28]]) ? 1 : 0) && lIlllllllIIlI(npc2.getInteracting()) && lIllllllIlIIl(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = lllIIIlIlI[15];
                        "".length();
                        return (14 ^ 10) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIIIlIlI[4];
                });
                if (lIlllllllIIII(nearest2) && lIlllllllIIlI(nearest)) {
                    AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[16]];
                    nearest2.interact(lllIIIlIIl[lllIIIlIlI[23]]);
                    Time.sleepTicks(lllIIIlIlI[17]);
                    "".length();
                    return;
                }
            }
            if (lIlllllllIIlI(Players.getLocal().getInteracting())) {
                NPC nearest3 = NPCs.getNearest(npc3 -> {
                    if (lIllllllIlIlI(npc3.getName().contains(lllIIIlIIl[lllIIIlIlI[27]]) ? 1 : 0) && lIlllllllIIlI(npc3.getInteracting()) && lIllllllIlIIl(npc3.isDead() ? 1 : 0)) {
                        ?? r0 = lllIIIlIlI[15];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIIIlIlI[4];
                });
                NPC nearest4 = NPCs.getNearest(npc4 -> {
                    if (lIllllllIlIlI(npc4.getName().contains(lllIIIlIIl[lllIIIlIlI[26]]) ? 1 : 0) && lIlllllllIIll(npc4.getInteracting(), Players.getLocal()) && lIllllllIlIIl(npc4.isDead() ? 1 : 0)) {
                        ?? r0 = lllIIIlIlI[15];
                        "".length();
                        return (((126 ^ 27) ^ (81 ^ 9)) & (((((85 + 118) - 63) + 12) ^ (((75 + 51) - 33) + 72)) ^ (-" ".length()))) == "   ".length() ? ((((42 + 148) - 105) + 82) ^ (((6 + 70) - 66) + 121)) & (((((21 + 160) - 102) + 83) ^ (((23 + 111) - 91) + 91)) ^ (-" ".length())) : r0;
                    }
                    return lllIIIlIlI[4];
                });
                if (lIlllllllIIII(nearest3) && lIlllllllIIlI(nearest4)) {
                    AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[24]];
                    nearest3.interact(lllIIIlIIl[lllIIIlIlI[25]]);
                    Time.sleepTicks(lllIIIlIlI[17]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlllllllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlllllllIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlllllllIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllllllIllll(int i) {
        return i < 0;
    }

    private static String lIllllllIIlIl(String lllllllllllllllllIllllIIIIllllll, String lllllllllllllllllIllllIIIIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllllIIIlIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllllIIIlIIIIIl.init(lllIIIlIlI[17], secretKeySpec);
            return new String(lllllllllllllllllIllllIIIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllllIIIlIIIIII) {
            lllllllllllllllllIllllIIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static int lIllllllIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIllllllIlIIl(int i) {
        return i == 0;
    }

    private static boolean lIlllllllIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIllllllIlIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllllllIlllI(int i, int i2) {
        return i < i2;
    }
}
