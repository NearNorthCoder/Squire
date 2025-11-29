package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.k  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/k.class */
public class C0010k {
    private static /* synthetic */ int[] lIllIlIlI;
    private static /* synthetic */ String[] lIllIlIIl;

    private static boolean lIIllIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIllllllI(String llIlIlllIlllll, String llIlIlllIllllI) {
        try {
            SecretKeySpec llIlIllllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlllIllllI.getBytes(StandardCharsets.UTF_8)), lIllIlIlI[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIlI[17], llIlIllllIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIllllIIIII) {
            llIlIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIlll(Object obj) {
        return obj == null;
    }

    static {
        lIIllIIIllII();
        lIIllIIIlIll();
    }

    private static void lIIllIIIlIll() {
        lIllIlIIl = new String[lIllIlIlI[30]];
        lIllIlIIl[lIllIlIlI[4]] = lIIlIllllllI("tf0Ltc7oVj/widTR2JyxMyBnBn0zaGIV", "QWwet");
        lIllIlIIl[lIllIlIlI[15]] = lIIlIllllllI("xvldgoZteHevNfxw0QxSUg==", "QxVue");
        lIllIlIIl[lIllIlIlI[17]] = lIIlIlllllll("bAdjicj2bOSPghNO855+DA==", "nYnXY");
        lIllIlIIl[lIllIlIlI[19]] = lIIlIlllllll("EM+EHQX04FE=", "erPeO");
        lIllIlIIl[lIllIlIlI[20]] = lIIlIllllllI("10sFpGRHPMMzfTIE/50pcA==", "bOFhs");
        lIllIlIIl[lIllIlIlI[22]] = lIIlIlllllll("dpZsS/w/1k0=", "VcmEk");
        lIllIlIIl[lIllIlIlI[16]] = lIIlIllllllI("XFg5dBOb7gvgmYchIxT0dffDqzYwhoWw", "iSKyF");
        lIllIlIIl[lIllIlIlI[23]] = lIIlIlllllll("WPv73ymgmaE=", "TgjJw");
        lIllIlIIl[lIllIlIlI[24]] = lIIlIllllllI("4ElsiW6bqPyZ6s1rDUDYu/QlMEL3JLvg", "dQfSZ");
        lIllIlIIl[lIllIlIlI[25]] = lIIlIllllllI("pJdxT+RNpHQ=", "OaqMl");
        lIllIlIIl[lIllIlIlI[26]] = lIIlIllllllI("ItUZ0ytOxGo=", "UkskX");
        lIllIlIIl[lIllIlIlI[27]] = lIIlIlllllll("wY+upnS+6Ko=", "sODav");
        lIllIlIIl[lIllIlIlI[28]] = lIIllIIIlIlI("ESc/Pg==", "YNSRa");
        lIllIlIIl[lIllIlIlI[29]] = lIIlIllllllI("f39SoWG9f3c=", "IuWLJ");
    }

    private static boolean lIIllIIllIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIIlIlllllll(String llIlIllllIllII, String llIlIllllIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIlI[17], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIllllIllIl) {
            llIlIllllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIlIl(Object obj) {
        return obj != null;
    }

    private static String lIIllIIIlIlI(String llIllIIIIIIIIl, String llIllIIIIIIIII) {
        String str = new String(Base64.getDecoder().decode(llIllIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIlIllllllllI = llIllIIIIIIIII.toCharArray();
        int llIlIlllllllIl = lIllIlIlI[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIlIlI[4];
        while (lIIllIIlIIll(i, length)) {
            char llIllIIIIIIIlI = charArray[i];
            sb.append((char) (llIllIIIIIIIlI ^ llIlIllllllllI[llIlIlllllllIl % llIlIllllllllI.length]));
            "".length();
            llIlIlllllllIl++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIllIIIlllI(int i) {
        return i == 0;
    }

    private static int lIIllIIIllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIllIIlIIII(int i, int i2) {
        return i >= i2;
    }

    public static void X() {
        WorldArea worldArea = new WorldArea(lIllIlIlI[0], lIllIlIlI[1], lIllIlIlI[2], lIllIlIlI[3], lIllIlIlI[4]);
        WorldPoint worldPoint = new WorldPoint(lIllIlIlI[5], lIllIlIlI[6], lIllIlIlI[4]);
        WorldPoint worldPoint2 = new WorldPoint(lIllIlIlI[7], lIllIlIlI[8], lIllIlIlI[4]);
        C0004e.D();
        if (lIIllIIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lIllIlIlI[9], lIllIlIlI[10], lIllIlIlI[4]);
            WorldPoint worldPoint4 = new WorldPoint(lIllIlIlI[9], lIllIlIlI[11], lIllIlIlI[4]);
            if (!lIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || lIIllIIIllll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lIllIlIlI[12], lIllIlIlI[13], lIllIlIlI[4]);
                C0004e.c(worldPoint5);
                Time.sleepUntil(() -> {
                    return Players.getLocal().getWorldLocation().equals(worldPoint5);
                }, lIllIlIlI[14]);
                "".length();
            }
            AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[4]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIllIlIlI[15]);
            "".length();
        }
        List all = Players.getAll(player -> {
            return worldArea.contains(player);
        });
        if (lIIllIIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIIlIIII(all.size(), lIllIlIlI[16])) {
            if (lIIllIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIlIlI[17])) {
                AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[15]];
                Movement.walkTo(worldPoint2);
                "".length();
                Time.sleepTicks(lIllIlIlI[15]);
                "".length();
            }
            if (lIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIlIlI[17])) {
                AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[17]];
                C0004e.B();
            }
        }
        if (lIIllIIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIIlIIll(all.size(), lIllIlIlI[16])) {
            if (lIIllIIlIlII(lIIllIIIllIl(C0004e.u(), 55.0d))) {
                int[] iArr = new int[lIllIlIlI[15]];
                iArr[lIllIlIlI[4]] = lIllIlIlI[18];
                if (lIIllIIIllll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIllIlIlI[15]];
                    iArr2[lIllIlIlI[4]] = lIllIlIlI[18];
                    Inventory.getFirst(iArr2).interact(lIllIlIIl[lIllIlIlI[19]]);
                    Time.sleepTicks(lIllIlIlI[15]);
                    "".length();
                }
            }
            if (lIIllIIlIlIl(Players.getLocal().getInteracting())) {
                AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[20]];
            }
            if (lIIllIIlIlIl(Players.getLocal().getInteracting()) && lIIllIIlIllI(Players.getLocal().getHealthRatio(), lIllIlIlI[21])) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIIllIIIllll(npc.getName().contains(lIllIlIIl[lIllIlIlI[29]]) ? 1 : 0) && lIIllIIllIII(npc.getInteracting(), Players.getLocal()) && lIIllIIIlllI(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIllIlIlI[15];
                        "".length();
                        return (((52 ^ 3) ^ (111 ^ 26)) & (((18 ^ 90) ^ (80 ^ 90)) ^ (-" ".length()))) > ((((58 + 133) - 185) + 186) ^ (((193 + 80) - 126) + 49)) ? ((197 ^ 166) ^ (115 ^ 10)) & (((69 ^ 63) ^ (36 ^ 68)) ^ (-" ".length())) : r0;
                    }
                    return lIllIlIlI[4];
                });
                if (lIIllIIlIlIl(nearest)) {
                    nearest.interact(lIllIlIIl[lIllIlIlI[22]]);
                    Time.sleepTicks(lIllIlIlI[17]);
                    "".length();
                    return;
                }
                NPC nearest2 = NPCs.getNearest(npc2 -> {
                    if (lIIllIIIllll(npc2.getName().contains(lIllIlIIl[lIllIlIlI[28]]) ? 1 : 0) && lIIllIIlIlll(npc2.getInteracting()) && lIIllIIIlllI(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = lIllIlIlI[15];
                        "".length();
                        return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIlIlI[4];
                });
                if (lIIllIIlIlIl(nearest2) && lIIllIIlIlll(nearest)) {
                    AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[16]];
                    nearest2.interact(lIllIlIIl[lIllIlIlI[23]]);
                    Time.sleepTicks(lIllIlIlI[17]);
                    "".length();
                    return;
                }
            }
            if (lIIllIIlIlll(Players.getLocal().getInteracting())) {
                NPC nearest3 = NPCs.getNearest(npc3 -> {
                    if (lIIllIIIllll(npc3.getName().contains(lIllIlIIl[lIllIlIlI[27]]) ? 1 : 0) && lIIllIIlIlll(npc3.getInteracting()) && lIIllIIIlllI(npc3.isDead() ? 1 : 0)) {
                        ?? r0 = lIllIlIlI[15];
                        "".length();
                        return (-"  ".length()) > 0 ? ((7 ^ 71) ^ (89 ^ 55)) & (((167 ^ 153) ^ (22 ^ 6)) ^ (-" ".length())) : r0;
                    }
                    return lIllIlIlI[4];
                });
                NPC nearest4 = NPCs.getNearest(npc4 -> {
                    if (lIIllIIIllll(npc4.getName().contains(lIllIlIIl[lIllIlIlI[26]]) ? 1 : 0) && lIIllIIllIII(npc4.getInteracting(), Players.getLocal()) && lIIllIIIlllI(npc4.isDead() ? 1 : 0)) {
                        ?? r0 = lIllIlIlI[15];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIlIlI[4];
                });
                if (lIIllIIlIlIl(nearest3) && lIIllIIlIlll(nearest4)) {
                    AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[24]];
                    nearest3.interact(lIllIlIIl[lIllIlIlI[25]]);
                    Time.sleepTicks(lIllIlIlI[17]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIllIIlIlII(int i) {
        return i < 0;
    }

    private static boolean lIIllIIlIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllIIlIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIllIIIllll(int i) {
        return i != 0;
    }

    private static void lIIllIIIllII() {
        lIllIlIlI = new int[31];
        lIllIlIlI[0] = (-20485) & 23839;
        lIllIlIlI[1] = (-12481) & 15611;
        lIllIlIlI[2] = 82 ^ 116;
        lIllIlIlI[3] = (((29 + 108) - 34) + 47) ^ (((117 + 16) - 109) + 153);
        lIllIlIlI[4] = ((((131 + 39) - 10) + 33) ^ (((124 + 86) - 137) + 69)) & (((96 ^ 68) ^ (238 ^ 133)) ^ (-" ".length()));
        lIllIlIlI[5] = (-((-5) & 13007)) & (-16385) & 32763;
        lIllIlIlI[6] = (-4529) & 7678;
        lIllIlIlI[7] = (-8193) & 11562;
        lIllIlIlI[8] = (-28834) & 31999;
        lIllIlIlI[9] = (-((-10325) & 14430)) & (-16945) & 24317;
        lIllIlIlI[10] = (-((-5342) & 30463)) & (-259) & 28607;
        lIllIlIlI[11] = (-9057) & 12283;
        lIllIlIlI[12] = (-((-18701) & 27437)) & (-4113) & 16126;
        lIllIlIlI[13] = (-69) & 3294;
        lIllIlIlI[14] = (-19041) & 23540;
        lIllIlIlI[15] = " ".length();
        lIllIlIlI[16] = (((99 + 170) - 219) + 141) ^ (((122 + 107) - 189) + 145);
        lIllIlIlI[17] = "  ".length();
        lIllIlIlI[18] = (-((-4429) & 6989)) & (-1025) & 3963;
        lIllIlIlI[19] = "   ".length();
        lIllIlIlI[20] = (193 ^ 187) ^ (81 ^ 47);
        lIllIlIlI[21] = -" ".length();
        lIllIlIlI[22] = 190 ^ 187;
        lIllIlIlI[23] = (((132 + 6) - 112) + 119) ^ (((29 + 12) - 39) + 148);
        lIllIlIlI[24] = 138 ^ 130;
        lIllIlIlI[25] = (((121 + 178) - 284) + 172) ^ (((84 + 1) - 43) + 136);
        lIllIlIlI[26] = 147 ^ 153;
        lIllIlIlI[27] = 205 ^ 198;
        lIllIlIlI[28] = (((140 + 11) - 33) + 27) ^ (((123 + 48) - 165) + 151);
        lIllIlIlI[29] = 78 ^ 67;
        lIllIlIlI[30] = (115 ^ 35) ^ (111 ^ 49);
    }

    private static boolean lIIllIIlIIlI(int i, int i2) {
        return i <= i2;
    }
}
