package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/l.class */
public class C0011l {
    private static /* synthetic */ String[] lIllIllllI;
    private static /* synthetic */ int[] lIllIlllll;

    private static void lIIllIllIIlII() {
        lIllIlllll = new int[31];
        lIllIlllll[0] = (-((-2057) & 6189)) & (-8769) & 16255;
        lIllIlllll[1] = (-12421) & 15551;
        lIllIlllll[2] = 138 ^ 172;
        lIllIlllll[3] = 102 ^ 65;
        lIllIlllll[4] = (34 ^ 100) & ((33 ^ 103) ^ (-1));
        lIllIlllll[5] = (-((-257) & 16837)) & (-4619) & 24575;
        lIllIlllll[6] = (-((-8213) & 25398)) & (-129) & 20463;
        lIllIlllll[7] = (-12945) & 16314;
        lIllIlllll[8] = (-29218) & 32383;
        lIllIlllll[9] = (-((-24631) & 24887)) & (-12290) & 15813;
        lIllIlllll[10] = (-((-147) & 13302)) & (-16385) & 32767;
        lIllIlllll[11] = (-((-5145) & 30585)) & (-1) & 28667;
        lIllIlllll[12] = (-21250) & 24527;
        lIllIlllll[13] = (-8485) & 11710;
        lIllIlllll[14] = (-18979) & 23478;
        lIllIlllll[15] = " ".length();
        lIllIlllll[16] = (((99 + 66) - 31) + 28) ^ (((10 + 128) - 29) + 55);
        lIllIlllll[17] = "  ".length();
        lIllIlllll[18] = (-30209) & 30587;
        lIllIlllll[19] = "   ".length();
        lIllIlllll[20] = (126 ^ 76) ^ (55 ^ 1);
        lIllIlllll[21] = -" ".length();
        lIllIlllll[22] = 195 ^ 198;
        lIllIlllll[23] = 128 ^ 135;
        lIllIlllll[24] = (247 ^ 129) ^ (48 ^ 78);
        lIllIlllll[25] = 112 ^ 121;
        lIllIlllll[26] = 156 ^ 150;
        lIllIlllll[27] = 102 ^ 109;
        lIllIlllll[28] = (244 ^ 140) ^ (73 ^ 61);
        lIllIlllll[29] = (64 ^ 79) ^ "  ".length();
        lIllIlllll[30] = 107 ^ 101;
    }

    private static boolean lIIllIllIlIII(int i, int i2) {
        return i >= i2;
    }

    static {
        lIIllIllIIlII();
        lIIllIllIIIll();
    }

    private static boolean lIIllIllIlIIl(int i, int i2) {
        return i > i2;
    }

    public static void ah() {
        WorldArea worldArea = new WorldArea(lIllIlllll[0], lIllIlllll[1], lIllIlllll[2], lIllIlllll[3], lIllIlllll[4]);
        WorldPoint worldPoint = new WorldPoint(lIllIlllll[5], lIllIlllll[6], lIllIlllll[4]);
        WorldPoint worldPoint2 = new WorldPoint(lIllIlllll[7], lIllIlllll[8], lIllIlllll[4]);
        C0004e.D();
        if (lIIllIllIIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lIllIlllll[9], lIllIlllll[10], lIllIlllll[4]);
            WorldPoint worldPoint4 = new WorldPoint(lIllIlllll[9], lIllIlllll[11], lIllIlllll[4]);
            if (!lIIllIllIIllI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || lIIllIllIIlll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lIllIlllll[12], lIllIlllll[13], lIllIlllll[4]);
                C0004e.c(worldPoint5);
                Time.sleepUntil(() -> {
                    return Players.getLocal().getWorldLocation().equals(worldPoint5);
                }, lIllIlllll[14]);
                "".length();
            }
            AccBuilderShamans.c = lIllIllllI[lIllIlllll[4]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIllIlllll[15]);
            "".length();
        }
        List all = Players.getAll(player -> {
            return worldArea.contains(player);
        });
        if (lIIllIllIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIllIlIII(all.size(), lIllIlllll[16])) {
            if (lIIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIlllll[17])) {
                AccBuilderShamans.c = lIllIllllI[lIllIlllll[15]];
                Movement.walkTo(worldPoint2);
                "".length();
                Time.sleepTicks(lIllIlllll[15]);
                "".length();
            }
            if (lIIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIlllll[17])) {
                AccBuilderShamans.c = lIllIllllI[lIllIlllll[17]];
                C0004e.B();
            }
        }
        if (lIIllIllIIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIllIlIll(all.size(), lIllIlllll[16])) {
            if (lIIllIllIllII(lIIllIllIIlIl(C0004e.u(), 55.0d))) {
                int[] iArr = new int[lIllIlllll[15]];
                iArr[lIllIlllll[4]] = lIllIlllll[18];
                if (lIIllIllIIlll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIllIlllll[15]];
                    iArr2[lIllIlllll[4]] = lIllIlllll[18];
                    Inventory.getFirst(iArr2).interact(lIllIllllI[lIllIlllll[19]]);
                    Time.sleepTicks(lIllIlllll[15]);
                    "".length();
                }
            }
            if (lIIllIllIllIl(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIllIllllI[lIllIlllll[20]];
            }
            if (lIIllIllIllIl(Players.getLocal().getInteracting()) && lIIllIllIlllI(Players.getLocal().getHealthRatio(), lIllIlllll[21])) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIIllIllIIlll(npc.getName().contains(lIllIllllI[lIllIlllll[29]]) ? 1 : 0) && lIIllIlllIIII(npc.getInteracting(), Players.getLocal()) && lIIllIllIIllI(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIllIlllll[15];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIlllll[4];
                });
                if (lIIllIllIllIl(nearest)) {
                    nearest.interact(lIllIllllI[lIllIlllll[22]]);
                    Time.sleepTicks(lIllIlllll[17]);
                    "".length();
                    return;
                }
                NPC nearest2 = NPCs.getNearest(npc2 -> {
                    if (lIIllIllIIlll(npc2.getName().contains(lIllIllllI[lIllIlllll[28]]) ? 1 : 0) && lIIllIllIllll(npc2.getInteracting()) && lIIllIllIIllI(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = lIllIlllll[15];
                        "".length();
                        return (-" ".length()) >= "   ".length() ? ((239 ^ 178) ^ (53 ^ 77)) & (((((139 + 5) - (-12)) + 14) ^ (((110 + 136) - 238) + 135)) ^ (-" ".length())) : r0;
                    }
                    return lIllIlllll[4];
                });
                if (lIIllIllIllIl(nearest2) && lIIllIllIllll(nearest)) {
                    AccBuilderShamans.c = lIllIllllI[lIllIlllll[16]];
                    nearest2.interact(lIllIllllI[lIllIlllll[23]]);
                    Time.sleepTicks(lIllIlllll[17]);
                    "".length();
                    return;
                }
            }
            if (lIIllIllIllll(Players.getLocal().getInteracting())) {
                NPC nearest3 = NPCs.getNearest(npc3 -> {
                    if (lIIllIllIIlll(npc3.getName().contains(lIllIllllI[lIllIlllll[27]]) ? 1 : 0) && lIIllIllIllll(npc3.getInteracting()) && lIIllIllIIllI(npc3.isDead() ? 1 : 0)) {
                        ?? r0 = lIllIlllll[15];
                        "".length();
                        return (("  ".length() ^ (141 ^ 169)) & (((((11 + 153) - 149) + 155) ^ (((32 + 67) - 52) + 93)) ^ (-" ".length()))) >= "   ".length() ? ((55 ^ 58) ^ (112 ^ 95)) & (((149 ^ 193) ^ (179 ^ 197)) ^ (-" ".length())) : r0;
                    }
                    return lIllIlllll[4];
                });
                NPC nearest4 = NPCs.getNearest(npc4 -> {
                    if (lIIllIllIIlll(npc4.getName().contains(lIllIllllI[lIllIlllll[26]]) ? 1 : 0) && lIIllIlllIIII(npc4.getInteracting(), Players.getLocal()) && lIIllIllIIllI(npc4.isDead() ? 1 : 0)) {
                        ?? r0 = lIllIlllll[15];
                        "".length();
                        return 0 != 0 ? ((4 ^ 102) ^ (14 ^ 121)) & (((215 ^ 155) ^ (228 ^ 189)) ^ (-" ".length())) : r0;
                    }
                    return lIllIlllll[4];
                });
                if (lIIllIllIllIl(nearest3) && lIIllIllIllll(nearest4)) {
                    AccBuilderShamans.c = lIllIllllI[lIllIlllll[24]];
                    nearest3.interact(lIllIllllI[lIllIlllll[25]]);
                    Time.sleepTicks(lIllIlllll[17]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIllIllIIlll(int i) {
        return i != 0;
    }

    private static boolean lIIllIllIIllI(int i) {
        return i == 0;
    }

    private static boolean lIIllIllIlllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllIllIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIllIllIlIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIllIllII(int i) {
        return i < 0;
    }

    private static boolean lIIllIllIllIl(Object obj) {
        return obj != null;
    }

    private static void lIIllIllIIIll() {
        lIllIllllI = new String[lIllIlllll[30]];
        lIllIllllI[lIllIlllll[4]] = lIIllIllIIIII("CgUZah8rRAcjByhECCMKKhAc", "DdoJk");
        lIllIllllI[lIllIlllll[15]] = lIIllIllIIIIl("2ZdcVtHHIxLdYfgqegJuNA==", "CUGos");
        lIllIllllI[lIllIlllll[17]] = lIIllIllIIIlI("q05iI4WUfwkGTlBuPvqqhA==", "eitDW");
        lIllIllllI[lIllIlllll[19]] = lIIllIllIIIlI("aWBWjOVeAxQ=", "ALjUs");
        lIllIllllI[lIllIlllll[20]] = lIIllIllIIIIl("FSxS7fXYIP/cyitUu8JqgQ==", "srrPr");
        lIllIllllI[lIllIlllll[22]] = lIIllIllIIIII("LAcXGw0G", "msczn");
        lIllIllllI[lIllIlllll[16]] = lIIllIllIIIII("MAECNTcaHBgzdBkcGjh0FhwXOiA=", "quvTT");
        lIllIllllI[lIllIlllll[23]] = lIIllIllIIIIl("MmuakNs703A=", "JgBfn");
        lIllIllllI[lIllIlllll[24]] = lIIllIllIIIIl("gYEsGdkE692GkUeNnl756R/qS9r5azCT", "fkPDt");
        lIllIllllI[lIllIlllll[25]] = lIIllIllIIIlI("usCdyZKuiLc=", "NuohQ");
        lIllIllllI[lIllIlllll[26]] = lIIllIllIIIIl("mempZqgRcg8=", "HUWPj");
        lIllIllllI[lIllIlllll[27]] = lIIllIllIIIII("Bj02PA==", "NTZPi");
        lIllIllllI[lIllIlllll[28]] = lIIllIllIIIlI("ZrQdrP9y6Ss=", "PqKIl");
        lIllIllllI[lIllIlllll[29]] = lIIllIllIIIlI("iw4niPfB7bY=", "ArLdH");
    }

    private static int lIIllIllIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIllIllIlIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllIlllIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIIllIllIIIIl(String lllllllllllllllllllIIIIIlIllIIIl, String lllllllllllllllllllIIIIIlIllIIII) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIIlIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIIIlIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIIIlIllIIll.init(lIllIlllll[17], lllllllllllllllllllIIIIIlIllIlII);
            return new String(lllllllllllllllllllIIIIIlIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIIlIllIIlI) {
            lllllllllllllllllllIIIIIlIllIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIllIllIIIlI(String lllllllllllllllllllIIIIIllIlIllI, String lllllllllllllllllllIIIIIllIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), lIllIlllll[24]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlllll[17], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIIllIlIIlI) {
            lllllllllllllllllllIIIIIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIllIllIIIII(String lllllllllllllllllllIIIIIllIIIllI, String lllllllllllllllllllIIIIIllIIIlIl) {
        String lllllllllllllllllllIIIIIllIIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIIIllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIIIIllIIIlII = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIIIIllIIIlIl.toCharArray();
        int lllllllllllllllllllIIIIIllIIIIlI = lIllIlllll[4];
        char[] charArray2 = lllllllllllllllllllIIIIIllIIIllI2.toCharArray();
        int lllllllllllllllllllIIIIIlIlllIll = charArray2.length;
        int i = lIllIlllll[4];
        while (lIIllIllIlIll(i, lllllllllllllllllllIIIIIlIlllIll)) {
            lllllllllllllllllllIIIIIllIIIlII.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllIIIIIllIIIIlI % charArray.length]));
            "".length();
            lllllllllllllllllllIIIIIllIIIIlI++;
            i++;
            "".length();
            if (((235 ^ 157) ^ (53 ^ 71)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIIIIIllIIIlII);
    }
}
