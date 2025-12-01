package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.k  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/k.class */
public class C0010k {
    private static /* synthetic */ int[] lIIllIlIII;
    private static /* synthetic */ String[] lIIllIIlll;

    private static String lIIIIIIlllIlI(String lllllllllllllllllllllIlllIllllII, String lllllllllllllllllllllIlllIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIlllIlllIll.getBytes(StandardCharsets.UTF_8)), lIIllIlIII[24]), "DES");
            Cipher lllllllllllllllllllllIlllIlllllI = Cipher.getInstance("DES");
            lllllllllllllllllllllIlllIlllllI.init(lIIllIlIII[17], secretKeySpec);
            return new String(lllllllllllllllllllllIlllIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIlllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIlllIlllIII) {
            lllllllllllllllllllllIlllIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlIIIlIl(Object obj) {
        return obj != null;
    }

    private static String lIIIIIIlllIII(String lllllllllllllllllllllIllllIlIIIl, String lllllllllllllllllllllIllllIlIIII) {
        String lllllllllllllllllllllIllllIlIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllllllllIllllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllIllllIIllll = new StringBuilder();
        char[] charArray = lllllllllllllllllllllIllllIlIIII.toCharArray();
        int lllllllllllllllllllllIllllIIllIl = lIIllIlIII[4];
        char[] charArray2 = lllllllllllllllllllllIllllIlIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIlIII[4];
        while (lIIIIIlIIIIll(i, length)) {
            lllllllllllllllllllllIllllIIllll.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllllIllllIIllIl % charArray.length]));
            "".length();
            lllllllllllllllllllllIllllIIllIl++;
            i++;
            "".length();
            if ("   ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllllIllllIIllll);
    }

    private static boolean lIIIIIlIIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIIlIIIllI(int i, int i2) {
        return i == i2;
    }

    public static void X() {
        WorldArea worldArea = new WorldArea(lIIllIlIII[0], lIIllIlIII[1], lIIllIlIII[2], lIIllIlIII[3], lIIllIlIII[4]);
        WorldPoint worldPoint = new WorldPoint(lIIllIlIII[5], lIIllIlIII[6], lIIllIlIII[4]);
        WorldPoint worldPoint2 = new WorldPoint(lIIllIlIII[7], lIIllIlIII[8], lIIllIlIII[4]);
        C0004e.D();
        if (lIIIIIIlllllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lIIllIlIII[9], lIIllIlIII[10], lIIllIlIII[4]);
            WorldPoint worldPoint4 = new WorldPoint(lIIllIlIII[9], lIIllIlIII[11], lIIllIlIII[4]);
            if (!lIIIIIIlllllI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || lIIIIIIllllll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lIIllIlIII[12], lIIllIlIII[13], lIIllIlIII[4]);
                C0004e.c(worldPoint5);
                Time.sleepUntil(() -> {
                    return Players.getLocal().getWorldLocation().equals(worldPoint5);
                }, lIIllIlIII[14]);
                "".length();
            }
            AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[4]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIllIlIII[15]);
            "".length();
        }
        List all = Players.getAll(player -> {
            return worldArea.contains(player);
        });
        if (lIIIIIIllllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlIIIIII(all.size(), lIIllIlIII[16])) {
            if (lIIIIIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIllIlIII[17])) {
                AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[15]];
                Movement.walkTo(worldPoint2);
                "".length();
                Time.sleepTicks(lIIllIlIII[15]);
                "".length();
            }
            if (lIIIIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIllIlIII[17])) {
                AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[17]];
                C0004e.B();
            }
        }
        if (lIIIIIIllllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlIIIIll(all.size(), lIIllIlIII[16])) {
            if (lIIIIIlIIIlII(lIIIIIIllllIl(C0004e.u(), 55.0d))) {
                int[] iArr = new int[lIIllIlIII[15]];
                iArr[lIIllIlIII[4]] = lIIllIlIII[18];
                if (lIIIIIIllllll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIllIlIII[15]];
                    iArr2[lIIllIlIII[4]] = lIIllIlIII[18];
                    Inventory.getFirst(iArr2).interact(lIIllIIlll[lIIllIlIII[19]]);
                    Time.sleepTicks(lIIllIlIII[15]);
                    "".length();
                }
            }
            if (lIIIIIlIIIlIl(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[20]];
            }
            if (lIIIIIlIIIlIl(Players.getLocal().getInteracting()) && lIIIIIlIIIllI(Players.getLocal().getHealthRatio(), lIIllIlIII[21])) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIIIIIIllllll(npc.getName().contains(lIIllIIlll[lIIllIlIII[29]]) ? 1 : 0) && lIIIIIlIIlIII(npc.getInteracting(), Players.getLocal()) && lIIIIIIlllllI(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIIllIlIII[15];
                        "".length();
                        return (((((54 + 38) - (-35)) + 59) ^ (((121 + 40) - 129) + 123)) & (((126 ^ 2) ^ (204 ^ 145)) ^ (-" ".length()))) >= "   ".length() ? ((((123 + 213) - 200) + 113) ^ (((2 + 41) - (-8)) + 122)) & (((91 ^ 117) ^ (197 ^ 191)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIlIII[4];
                });
                if (lIIIIIlIIIlIl(nearest)) {
                    nearest.interact(lIIllIIlll[lIIllIlIII[22]]);
                    Time.sleepTicks(lIIllIlIII[17]);
                    "".length();
                    return;
                }
                NPC nearest2 = NPCs.getNearest(npc2 -> {
                    if (lIIIIIIllllll(npc2.getName().contains(lIIllIIlll[lIIllIlIII[28]]) ? 1 : 0) && lIIIIIlIIIlll(npc2.getInteracting()) && lIIIIIIlllllI(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = lIIllIlIII[15];
                        "".length();
                        return 0 != 0 ? ((95 ^ 78) ^ (153 ^ 131)) & (((146 ^ 137) ^ (105 ^ 121)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIlIII[4];
                });
                if (lIIIIIlIIIlIl(nearest2) && lIIIIIlIIIlll(nearest)) {
                    AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[16]];
                    nearest2.interact(lIIllIIlll[lIIllIlIII[23]]);
                    Time.sleepTicks(lIIllIlIII[17]);
                    "".length();
                    return;
                }
            }
            if (lIIIIIlIIIlll(Players.getLocal().getInteracting())) {
                NPC nearest3 = NPCs.getNearest(npc3 -> {
                    if (lIIIIIIllllll(npc3.getName().contains(lIIllIIlll[lIIllIlIII[27]]) ? 1 : 0) && lIIIIIlIIIlll(npc3.getInteracting()) && lIIIIIIlllllI(npc3.isDead() ? 1 : 0)) {
                        ?? r0 = lIIllIlIII[15];
                        "".length();
                        return "   ".length() == (((31 ^ 120) ^ (73 ^ 11)) & (((73 ^ 121) ^ (77 ^ 88)) ^ (-" ".length()))) ? ((89 ^ 40) ^ (80 ^ 114)) & (((135 ^ 191) ^ (171 ^ 192)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIlIII[4];
                });
                NPC nearest4 = NPCs.getNearest(npc4 -> {
                    if (lIIIIIIllllll(npc4.getName().contains(lIIllIIlll[lIIllIlIII[26]]) ? 1 : 0) && lIIIIIlIIlIII(npc4.getInteracting(), Players.getLocal()) && lIIIIIIlllllI(npc4.isDead() ? 1 : 0)) {
                        ?? r0 = lIIllIlIII[15];
                        "".length();
                        return " ".length() < " ".length() ? ((104 ^ 80) ^ (8 ^ 98)) & (((69 ^ 106) ^ (120 ^ 5)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIlIII[4];
                });
                if (lIIIIIlIIIlIl(nearest3) && lIIIIIlIIIlll(nearest4)) {
                    AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[24]];
                    nearest3.interact(lIIllIIlll[lIIllIlIII[25]]);
                    Time.sleepTicks(lIIllIlIII[17]);
                    "".length();
                }
            }
        }
    }

    private static void lIIIIIIlllIll() {
        lIIllIIlll = new String[lIIllIlIII[30]];
        lIIllIIlll[lIIllIlIII[4]] = lIIIIIIlllIII("Kgw9VBsLTSMdAwhNLB0OChk4", "dmKto");
        lIIllIIlll[lIIllIlIII[15]] = lIIIIIIlllIIl("TRZNojLcsNN7ezDRuJrWcg==", "mXPjR");
        lIIllIIlll[lIIllIlIII[17]] = lIIIIIIlllIII("NAI6KAZDBSc0EgoDLw==", "cmHDb");
        lIIllIIlll[lIIllIlIII[19]] = lIIIIIIlllIlI("wyWRjcmTaOs=", "erUlJ");
        lIIllIIlll[lIIllIlIII[20]] = lIIIIIIlllIII("KC93GSUMIzYO", "aAWzJ");
        lIIllIIlll[lIIllIlIII[22]] = lIIIIIIlllIIl("KF9hxaS8t9c=", "BwZHg");
        lIIllIIlll[lIIllIlIII[16]] = lIIIIIIlllIII("KgUuLDYAGDQqdQMYNiF1DBg7IyE=", "kqZMU");
        lIIllIIlll[lIIllIlIII[23]] = lIIIIIIlllIIl("wPC/W5P1fwE=", "gYUPp");
        lIIllIIlll[lIIllIlIII[24]] = lIIIIIIlllIII("CAUBMBUiGBs2ViEYGT1WLhgUPwI=", "IquQv");
        lIIllIIlll[lIIllIlIII[25]] = lIIIIIIlllIlI("IokLDOpWBrQ=", "ZdUMd");
        lIIllIIlll[lIIllIlIII[26]] = lIIIIIIlllIlI("8CCFem9iZsA=", "WvLIG");
        lIIllIIlll[lIIllIlIII[27]] = lIIIIIIlllIlI("4UzNooo5vq0=", "TTBGQ");
        lIIllIIlll[lIIllIlIII[28]] = lIIIIIIlllIII("GzwLAg==", "SUgnk");
        lIIllIIlll[lIIllIlIII[29]] = lIIIIIIlllIIl("R3SzkB5BbcQ=", "oYZOJ");
    }

    private static boolean lIIIIIlIIIlll(Object obj) {
        return obj == null;
    }

    private static int lIIIIIIllllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIIIIIIllllII() {
        lIIllIlIII = new int[31];
        lIIllIlIII[0] = (-((-17683) & 21907)) & (-517) & 8095;
        lIIllIlIII[1] = (-12481) & 15611;
        lIIllIlIII[2] = (((128 + 16) - 141) + 151) ^ (((109 + 70) - 177) + 186);
        lIIllIlIII[3] = (6 ^ 67) ^ (209 ^ 179);
        lIIllIlIII[4] = (64 ^ 5) & ((251 ^ 190) ^ (-1));
        lIIllIlIII[5] = (-((-225) & 12515)) & (-16585) & 32251;
        lIIllIlIII[6] = (-(38 ^ 23)) & (-20738) & 23935;
        lIIllIlIII[7] = (-4821) & 8190;
        lIIllIlIII[8] = (-13057) & 16222;
        lIIllIlIII[9] = (-((-17629) & 30463)) & (-16649) & 32750;
        lIIllIlIII[10] = (-17186) & 20413;
        lIIllIlIII[11] = (-12901) & 16127;
        lIIllIlIII[12] = (-((-1189) & 22454)) & (-8225) & 32767;
        lIIllIlIII[13] = (-((-9441) & 30694)) & (-65) & 24543;
        lIIllIlIII[14] = (-((-4317) & 30462)) & (-2059) & 32703;
        lIIllIlIII[15] = " ".length();
        lIIllIlIII[16] = 40 ^ 46;
        lIIllIlIII[17] = "  ".length();
        lIIllIlIII[18] = (-4609) & 4987;
        lIIllIlIII[19] = "   ".length();
        lIIllIlIII[20] = (((11 + 33) - (-64)) + 23) ^ (((100 + 54) - 43) + 24);
        lIIllIlIII[21] = -" ".length();
        lIIllIlIII[22] = 57 ^ 60;
        lIIllIlIII[23] = (((0 + 95) - (-26)) + 56) ^ (((177 + 22) - 190) + 173);
        lIIllIlIII[24] = (180 ^ 153) ^ (230 ^ 195);
        lIIllIlIII[25] = 73 ^ 64;
        lIIllIlIII[26] = (((90 + 14) - (-67)) + 5) ^ (((115 + 36) - 86) + 121);
        lIIllIlIII[27] = (166 ^ 161) ^ (190 ^ 178);
        lIIllIlIII[28] = 156 ^ 144;
        lIIllIlIII[29] = 132 ^ 137;
        lIIllIlIII[30] = 127 ^ 113;
    }

    private static boolean lIIIIIlIIIIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIIlIIIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIIIIllllll(int i) {
        return i != 0;
    }

    private static boolean lIIIIIlIIIlII(int i) {
        return i < 0;
    }

    private static boolean lIIIIIIlllllI(int i) {
        return i == 0;
    }

    private static String lIIIIIIlllIIl(String lllllllllllllllllllllIlllllIIIIl, String lllllllllllllllllllllIlllllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIlllllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIlIII[17], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIlllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIllllIlllIl) {
            lllllllllllllllllllllIllllIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlIIIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIIlIIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIIIIIIllllII();
        lIIIIIIlllIll();
    }
}
