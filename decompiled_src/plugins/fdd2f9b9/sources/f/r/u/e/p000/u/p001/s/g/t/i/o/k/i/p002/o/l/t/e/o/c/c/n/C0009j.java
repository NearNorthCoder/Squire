package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.j  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/j.class */
public class C0009j implements G {
    private static /* synthetic */ int[] lIIlIIlllI;
    private static /* synthetic */ String[] lIIlIIllIl;

    private static boolean lllllIlIllll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllllIlIllIl(Skills.getLevel(Skill.RANGED), lIIlIIlllI[39])) {
            ?? r0 = lIIlIIlllI[0];
            "".length();
            return " ".length() <= 0 ? ((166 ^ 185) ^ (221 ^ 148)) & (((251 ^ 182) ^ (60 ^ 39)) ^ (-" ".length())) : r0;
        }
        return lIIlIIlllI[1];
    }

    private static boolean lllllIlIIlll(int i) {
        return i > 0;
    }

    private static boolean lllllIlIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIIllIl[lIIlIIlllI[14]];
    }

    private static String lllllIIlllll(String lllllllllllllllllllllllllIllIIlI, String lllllllllllllllllllllllllIllIIIl) {
        String lllllllllllllllllllllllllIllIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllllllllIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllllllIllIIII = new StringBuilder();
        char[] lllllllllllllllllllllllllIlIllll = lllllllllllllllllllllllllIllIIIl.toCharArray();
        int lllllllllllllllllllllllllIlIlllI = lIIlIIlllI[1];
        char[] charArray = lllllllllllllllllllllllllIllIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIIlIIlllI[1];
        while (lllllIlIllll(i, length)) {
            char lllllllllllllllllllllllllIllIIll = charArray[i];
            lllllllllllllllllllllllllIllIIII.append((char) (lllllllllllllllllllllllllIllIIll ^ lllllllllllllllllllllllllIlIllll[lllllllllllllllllllllllllIlIlllI % lllllllllllllllllllllllllIlIllll.length]));
            "".length();
            lllllllllllllllllllllllllIlIlllI++;
            i++;
            "".length();
            if ((((((82 + 97) - 94) + 50) ^ (((94 + 105) - 93) + 91)) & (((70 ^ 18) ^ (44 ^ 58)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllllllllIllIIII);
    }

    private static void lllllIlIIIlI() {
        lIIlIIllIl = new String[lIIlIIlllI[45]];
        lIIlIIllIl[lIIlIIlllI[1]] = lllllIIlllll("OCYVIi4XMwolLlYzDGsrFykI", "vGcKI");
        lIIlIIllIl[lIIlIIlllI[0]] = lllllIIlllll("OzQLDzYaOwJLOBI7DgI0FA==", "sUekZ");
        lIIlIIllIl[lIIlIIlllI[10]] = lllllIIlllll("ACs2", "EJBYV");
        lIIlIIllIl[lIIlIIlllI[20]] = lllllIlIIIII("Y4GB5XwU2/sMU1i+Q1PS+w==", "LXFLw");
        lIIlIIllIl[lIIlIIlllI[28]] = lllllIlIIIII("3Gvt6OaONf9oGrI55BX0fXPb1ih2VC0q", "pFxJJ");
        lIIlIIllIl[lIIlIIlllI[29]] = lllllIlIIIIl("yHdJ2VH3pAk=", "fuiIC");
        lIIlIIllIl[lIIlIIlllI[27]] = lllllIlIIIIl("6VbKrEg5Dq/h0oIC927O3Q==", "hObTq");
        lIIlIIllIl[lIIlIIlllI[34]] = lllllIlIIIII("xhdQEZ/ayUzHCmrJFwRsag==", "WGmSE");
        lIIlIIllIl[lIIlIIlllI[35]] = lllllIIlllll("NxofGzodBwUdeQUBHhY=", "vnkzY");
        lIIlIIllIl[lIIlIIlllI[36]] = lllllIlIIIIl("IHT7SQFqIX0=", "bxvbK");
        lIIlIIllIl[lIIlIIlllI[7]] = lllllIlIIIIl("KrmLIY7YDeQFqlSrl3W5EQ==", "vHCTE");
        lIIlIIllIl[lIIlIIlllI[13]] = lllllIlIIIII("BWa7vB4zYZI=", "HjoCy");
        lIIlIIllIl[lIIlIIlllI[37]] = lllllIlIIIII("aMb0+ornUJROyoRIV5BwGA==", "umnAj");
        lIIlIIllIl[lIIlIIlllI[14]] = lllllIlIIIIl("VA9nSQcSaIPZKltq5OnHHQ==", "JdOUL");
        lIIlIIllIl[lIIlIIlllI[40]] = lllllIlIIIIl("LlWq/X9VxtU=", "UziPY");
        lIIlIIllIl[lIIlIIlllI[41]] = lllllIlIIIIl("duT0/pwDF70=", "tseqV");
        lIIlIIllIl[lIIlIIlllI[42]] = lllllIlIIIII("ZZsD6P3APVA=", "zlwAG");
        lIIlIIllIl[lIIlIIlllI[43]] = lllllIlIIIII("mhrAYdNXdGk=", "dNkIN");
        lIIlIIllIl[lIIlIIlllI[44]] = lllllIlIIIIl("hcb7rQ72QwdKo1jirkprlQ==", "AgcGI");
    }

    private static boolean lllllIlIlIll(int i, int i2) {
        return i <= i2;
    }

    private static String lllllIlIIIII(String lllllllllllllllllllllllllIIlIIII, String lllllllllllllllllllllllllIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllllIIIllll.getBytes(StandardCharsets.UTF_8)), lIIlIIlllI[35]), "DES");
            Cipher lllllllllllllllllllllllllIIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllllllllllllIIlIIlI.init(lIIlIIlllI[10], secretKeySpec);
            return new String(lllllllllllllllllllllllllIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllllllIIlIIIl) {
            lllllllllllllllllllllllllIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void lllllIlIIIll() {
        lIIlIIlllI = new int[46];
        lIIlIIlllI[0] = " ".length();
        lIIlIIlllI[1] = "   ".length() & ("   ".length() ^ (-" ".length()));
        lIIlIIlllI[2] = (-23045) & 23423;
        lIIlIIlllI[3] = (-((-385) & 26037)) & (-4) & 30655;
        lIIlIIlllI[4] = 157 ^ 133;
        lIIlIIlllI[5] = (-((-8647) & 27591)) & (-1031) & 32599;
        lIIlIIlllI[6] = (-((-24129) & 32371)) & (-16517) & 32767;
        lIIlIIlllI[7] = 128 ^ 138;
        lIIlIIlllI[8] = (-16545) & 18679;
        lIIlIIlllI[9] = (-" ".length()) & (-5131) & 8127;
        lIIlIIlllI[10] = "  ".length();
        lIIlIIlllI[11] = (-((-10945) & 32739)) & (-8333) & 32254;
        lIIlIIlllI[12] = (-((-2537) & 14841)) & (-66) & 15359;
        lIIlIIlllI[13] = 174 ^ 165;
        lIIlIIlllI[14] = (69 ^ 23) ^ (82 ^ 13);
        lIIlIIlllI[15] = (-307) & 2427;
        lIIlIIlllI[16] = (-8229) & 11198;
        lIIlIIlllI[17] = (((83 + 64) - 77) + 98) ^ (((172 + 144) - 152) + 19);
        lIIlIIlllI[18] = 182 ^ 149;
        lIIlIIlllI[19] = (-(20 ^ 119)) & (-4097) & 7167;
        lIIlIIlllI[20] = "   ".length();
        lIIlIIlllI[21] = (-25509) & 27583;
        lIIlIIlllI[22] = (-(24 ^ 57)) & (-8201) & 10990;
        lIIlIIlllI[23] = (-10349) & 10623;
        lIIlIIlllI[24] = ((123 + 251) - 188) + 66;
        lIIlIIlllI[25] = (-929) & 4009;
        lIIlIIlllI[26] = (-((-18583) & 23255)) & (-8225) & 16371;
        lIIlIIlllI[27] = 73 ^ 79;
        lIIlIIlllI[28] = (152 ^ 171) ^ (77 ^ 122);
        lIIlIIlllI[29] = 156 ^ 153;
        lIIlIIlllI[30] = (-((-83) & 30715)) & (-2) & 32767;
        lIIlIIlllI[31] = (-28687) & 31663;
        lIIlIIlllI[32] = (-13393) & 16375;
        lIIlIIlllI[33] = (-((-8601) & 30111)) & (-9) & 24511;
        lIIlIIlllI[34] = 141 ^ 138;
        lIIlIIlllI[35] = 126 ^ 118;
        lIIlIIlllI[36] = (94 ^ 76) ^ (86 ^ 77);
        lIIlIIlllI[37] = (47 ^ 64) ^ (96 ^ 3);
        lIIlIIlllI[38] = (243 ^ 134) ^ (75 ^ 90);
        lIIlIIlllI[39] = (((163 + 186) - 228) + 71) ^ (((129 + 44) - 104) + 94);
        lIIlIIlllI[40] = 8 ^ 6;
        lIIlIIlllI[41] = (224 ^ 191) ^ (66 ^ 18);
        lIIlIIlllI[42] = (((70 + 73) - 67) + 111) ^ (((101 + 103) - 55) + 22);
        lIIlIIlllI[43] = (((122 + 168) - 254) + 138) ^ (((148 + 85) - 199) + 157);
        lIIlIIlllI[44] = 37 ^ 55;
        lIIlIIlllI[45] = 83 ^ 64;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIIlllI[1];
    }

    private static boolean lllllIlIlIIl(int i) {
        return i < 0;
    }

    private static boolean lllllIlIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lllllIlIIlIl(Object obj) {
        return obj != null;
    }

    private static String lllllIlIIIIl(String lllllllllllllllllllllllllIIlllIl, String lllllllllllllllllllllllllIIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIlllI[10], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllllllIIllllI) {
            lllllllllllllllllllllllllIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIlII(int i) {
        return i == 0;
    }

    private static boolean lllllIlIllII(Object obj) {
        return obj == null;
    }

    private static int lllllIlIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lllllIlIllIl(int i, int i2) {
        return i >= i2;
    }

    private static void R() {
        new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[9], lIIlIIlllI[10]);
        new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[9], lIIlIIlllI[0]);
        WorldArea worldArea = new WorldArea(lIIlIIlllI[11], lIIlIIlllI[12], lIIlIIlllI[13], lIIlIIlllI[14], lIIlIIlllI[0]);
        new WorldArea(lIIlIIlllI[11], lIIlIIlllI[12], lIIlIIlllI[13], lIIlIIlllI[14], lIIlIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlllI[15], lIIlIIlllI[16], lIIlIIlllI[17], lIIlIIlllI[18], lIIlIIlllI[1]);
        WorldPoint worldPoint = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[19], lIIlIIlllI[1]);
        if (lllllIlIlIIl(lllllIlIlIII(C0004e.u(), 45.0d))) {
            int[] iArr = new int[lIIlIIlllI[0]];
            iArr[lIIlIIlllI[1]] = lIIlIIlllI[2];
            if (lllllIlIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIIlllI[0]];
                iArr2[lIIlIIlllI[1]] = lIIlIIlllI[2];
                Inventory.getFirst(iArr2).interact(lIIlIIllIl[lIIlIIlllI[10]]);
                Time.sleepTicks(lIIlIIlllI[0]);
                "".length();
            }
        }
        if (lllllIlIIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[20]];
            WorldArea worldArea3 = new WorldArea(lIIlIIlllI[21], lIIlIIlllI[22], lIIlIIlllI[23], lIIlIIlllI[24], lIIlIIlllI[1]);
            if (lllllIlIIlII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(lIIlIIlllI[25], lIIlIIlllI[26], lIIlIIlllI[1]);
                if (lllllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIlIIlllI[27])) {
                    Movement.walkTo(worldPoint2);
                    "".length();
                    Time.sleepTicks(lIIlIIlllI[0]);
                    "".length();
                }
                if (lllllIlIlIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIlIIlllI[27])) {
                    String[] strArr = new String[lIIlIIlllI[0]];
                    strArr[lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[28]];
                    TileObjects.getNearest(strArr).interact(lIIlIIllIl[lIIlIIlllI[29]]);
                    Time.sleepTicks(lIIlIIlllI[20]);
                    "".length();
                }
            }
            if (lllllIlIIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllllIlIIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIlIIlllI[0]);
                "".length();
            }
            if (lllllIlIIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lllllIlIIllI(tileObject.getName().contains(lIIlIIllIl[lIIlIIlllI[44]]) ? 1 : 0) && lllllIlIIllI(worldArea2.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = lIIlIIlllI[0];
                        "".length();
                        return (98 ^ 102) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIIlllI[1];
                });
                if (lllllIlIllII(nearest)) {
                    WorldPoint[] worldPointArr = new WorldPoint[lIIlIIlllI[28]];
                    worldPointArr[lIIlIIlllI[1]] = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[19], lIIlIIlllI[1]);
                    worldPointArr[lIIlIIlllI[0]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[31], lIIlIIlllI[1]);
                    worldPointArr[lIIlIIlllI[10]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[32], lIIlIIlllI[1]);
                    worldPointArr[lIIlIIlllI[20]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[33], lIIlIIlllI[1]);
                    Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                    "".length();
                }
                if (lllllIlIIlIl(nearest)) {
                    nearest.interact(lIIlIIllIl[lIIlIIlllI[27]]);
                    Time.sleepTicks(lIIlIIlllI[20]);
                    "".length();
                }
            }
        }
        if (lllllIlIIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lllllIlIllII(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[34]];
                NPC nearest2 = NPCs.getNearest(npc -> {
                    if (lllllIlIIllI(npc.getName().contains(lIIlIIllIl[lIIlIIlllI[42]]) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIlIIlllI[0]];
                        strArr2[lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[43]];
                        if (lllllIlIIllI(npc.hasAction(strArr2) ? 1 : 0) && lllllIlIIlII(npc.isDead() ? 1 : 0) && lllllIlIllII(npc.getInteracting())) {
                            ?? r0 = lIIlIIlllI[0];
                            "".length();
                            return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIIlIIlllI[1];
                });
                NPC nearest3 = NPCs.getNearest(npc2 -> {
                    if (lllllIlIIllI(npc2.getName().contains(lIIlIIllIl[lIIlIIlllI[40]]) ? 1 : 0) && lllllIlIIlII(npc2.isDead() ? 1 : 0)) {
                        String[] strArr2 = new String[lIIlIIlllI[0]];
                        strArr2[lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[41]];
                        if (lllllIlIIllI(npc2.hasAction(strArr2) ? 1 : 0) && lllllIlIlllI(npc2.getInteracting(), Players.getLocal())) {
                            ?? r0 = lIIlIIlllI[0];
                            "".length();
                            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIIlIIlllI[1];
                });
                if (lllllIlIIlIl(nearest2) && lllllIlIllII(nearest3)) {
                    AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[35]];
                    nearest2.interact(lIIlIIllIl[lIIlIIlllI[36]]);
                    Time.sleepTicks(lIIlIIlllI[10]);
                    "".length();
                }
                if (lllllIlIIlIl(nearest3)) {
                    AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[7]];
                    nearest3.interact(lIIlIIllIl[lIIlIIlllI[13]]);
                    Time.sleepTicks(lIIlIIlllI[20]);
                    "".length();
                }
            }
            if (lllllIlIIlIl(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[37]];
                Time.sleepTicks(lIIlIIlllI[0]);
                "".length();
            }
        }
    }

    static {
        lllllIlIIIll();
        lllllIlIIIlI();
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            Q();
            "".length();
            if ((-" ".length()) >= ((38 ^ 1) & ((190 ^ 153) ^ (-1)))) {
                return (121 ^ 89) & ((2 ^ 34) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIlIIlllI[38];
    }

    private static boolean lllllIlIIllI(int i) {
        return i != 0;
    }

    public static void Q() {
        int[] iArr = new int[lIIlIIlllI[0]];
        iArr[lIIlIIlllI[1]] = lIIlIIlllI[2];
        if (lllllIlIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lllllIlIIlIl(nearest) && lllllIlIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[1]];
                C0000a.a(nearest);
            }
            if (lllllIlIIlIl(nearest) && lllllIlIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[0]];
                if (lllllIlIIlII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIlIIlllI[3]);
                    "".length();
                }
                if (lllllIlIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (lllllIlIIlll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIlIIlllI[0]);
                        "".length();
                    }
                    C0000a.a(lIIlIIlllI[2], lIIlIIlllI[4]);
                    C0000a.a(lIIlIIlllI[5], lIIlIIlllI[0]);
                    C0000a.a(lIIlIIlllI[6], lIIlIIlllI[7]);
                }
            }
        }
        int[] iArr2 = new int[lIIlIIlllI[0]];
        iArr2[lIIlIIlllI[1]] = lIIlIIlllI[2];
        if (lllllIlIIllI(Inventory.contains(iArr2) ? 1 : 0)) {
            R();
        }
    }
}
