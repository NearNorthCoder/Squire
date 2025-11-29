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
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/o.class */
public class C0014o implements K {
    public static /* synthetic */ String[] cy;
    public static /* synthetic */ int cA;
    public static /* synthetic */ WorldPoint ct;
    public static /* synthetic */ long cx;
    public static /* synthetic */ WorldPoint ch;
    public static /* synthetic */ WorldPoint cl;
    private static /* synthetic */ int[] lIllIlllIl;
    public static /* synthetic */ WorldPoint cs;
    public static /* synthetic */ WorldPoint cv;
    public static /* synthetic */ WorldPoint cj;
    public static /* synthetic */ int cB;
    public static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ WorldPoint cq;
    public static /* synthetic */ WorldArea cz;
    public static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ WorldPoint cw;
    public static /* synthetic */ WorldPoint cg;
    public static /* synthetic */ WorldPoint cn;
    public static /* synthetic */ WorldPoint cp;
    static /* synthetic */ int cC;
    private static /* synthetic */ String[] lIllIlllII;
    public static /* synthetic */ WorldPoint cu;
    public static /* synthetic */ WorldPoint co;
    public static /* synthetic */ WorldPoint cr;
    public static /* synthetic */ WorldPoint ci;

    static {
        lIIllIlIlIIIl();
        lIIllIlIlIIII();
        cg = new WorldPoint(lIllIlllIl[37], lIllIlllIl[38], lIllIlllIl[1]);
        ch = new WorldPoint(lIllIlllIl[39], lIllIlllIl[40], lIllIlllIl[1]);
        ci = new WorldPoint(lIllIlllIl[41], lIllIlllIl[42], lIllIlllIl[1]);
        cj = new WorldPoint(lIllIlllIl[43], lIllIlllIl[44], lIllIlllIl[1]);
        ck = new WorldPoint(lIllIlllIl[45], lIllIlllIl[38], lIllIlllIl[1]);
        cl = new WorldPoint(lIllIlllIl[46], lIllIlllIl[47], lIllIlllIl[1]);
        cm = new WorldPoint(lIllIlllIl[39], lIllIlllIl[40], lIllIlllIl[1]);
        cn = new WorldPoint(lIllIlllIl[48], lIllIlllIl[38], lIllIlllIl[1]);
        co = new WorldPoint(lIllIlllIl[49], lIllIlllIl[50], lIllIlllIl[1]);
        cp = new WorldPoint(lIllIlllIl[51], lIllIlllIl[42], lIllIlllIl[1]);
        cq = new WorldPoint(lIllIlllIl[49], lIllIlllIl[50], lIllIlllIl[1]);
        cr = new WorldPoint(lIllIlllIl[52], lIllIlllIl[53], lIllIlllIl[1]);
        cs = new WorldPoint(lIllIlllIl[54], lIllIlllIl[55], lIllIlllIl[1]);
        ct = new WorldPoint(lIllIlllIl[56], lIllIlllIl[57], lIllIlllIl[1]);
        cu = new WorldPoint(lIllIlllIl[39], lIllIlllIl[40], lIllIlllIl[1]);
        cv = new WorldPoint(lIllIlllIl[58], lIllIlllIl[59], lIllIlllIl[1]);
        cw = new WorldPoint(lIllIlllIl[37], lIllIlllIl[38], lIllIlllIl[1]);
        cx = System.currentTimeMillis();
        String[] strArr = new String[lIllIlllIl[10]];
        strArr[lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[60]];
        strArr[lIllIlllIl[0]] = lIllIlllII[lIllIlllIl[61]];
        strArr[lIllIlllIl[3]] = lIllIlllII[lIllIlllIl[62]];
        cy = strArr;
        cz = new WorldArea(lIllIlllIl[63], lIllIlllIl[64], lIllIlllIl[65], lIllIlllIl[66], lIllIlllIl[1]);
        cA = lIllIlllIl[1];
        cC = C0004e.c(lIllIlllIl[31], lIllIlllIl[32]);
    }

    private static boolean lIIllIlIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIlIlIlIl(int i) {
        return i != 0;
    }

    private static int lIIllIlIlIlll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static void lIIllIlIlIIIl() {
        lIllIlllIl = new int[68];
        lIllIlllIl[0] = " ".length();
        lIllIlllIl[1] = (81 ^ 121) & ((62 ^ 22) ^ (-1));
        lIllIlllIl[2] = (-((-18795) & 24047)) & (-8193) & 13823;
        lIllIlllIl[3] = "  ".length();
        lIllIlllIl[4] = (-(244 ^ 133)) & (-19459) & 24570;
        lIllIlllIl[5] = (213 ^ 171) ^ (11 ^ 109);
        lIllIlllIl[6] = (-((-12513) & 31983)) & (-513) & 32607;
        lIllIlllIl[7] = (-24577) & 32585;
        lIllIlllIl[8] = 163 ^ 169;
        lIllIlllIl[9] = (-((-915) & 7103)) & (-16404) & 622591;
        lIllIlllIl[10] = "   ".length();
        lIllIlllIl[11] = (101 ^ 85) ^ (124 ^ 10);
        lIllIlllIl[12] = 189 ^ 185;
        lIllIlllIl[13] = 182 ^ 179;
        lIllIlllIl[14] = (242 ^ 137) ^ (228 ^ 153);
        lIllIlllIl[15] = 65 ^ 70;
        lIllIlllIl[16] = 116 ^ 124;
        lIllIlllIl[17] = 189 ^ 180;
        lIllIlllIl[18] = (((79 + 130) - 75) + 5) ^ (((76 + 116) - 188) + 124);
        lIllIlllIl[19] = 31 ^ 19;
        lIllIlllIl[20] = (((44 + 104) - 133) + 153) ^ (((83 + 29) - 56) + 109);
        lIllIlllIl[21] = 165 ^ 171;
        lIllIlllIl[22] = 171 ^ 164;
        lIllIlllIl[23] = (141 ^ 168) ^ (162 ^ 151);
        lIllIlllIl[24] = (-((-22933) & 32214)) & (-4097) & 16381;
        lIllIlllIl[25] = (-17180) & 20411;
        lIllIlllIl[26] = ((145 ^ 171) & ((116 ^ 78) ^ (-1))) ^ (95 ^ 30);
        lIllIlllIl[27] = 104 ^ 79;
        lIllIlllIl[28] = (-9219) & 12271;
        lIllIlllIl[29] = (-((-8651) & 12763)) & (-24577) & 31935;
        lIllIlllIl[30] = (((136 + 9) - 91) + 124) ^ (((115 + 22) - 132) + 158);
        lIllIlllIl[31] = (-((-5017) & 22527)) & (-257) & 32766;
        lIllIlllIl[32] = (-((-18723) & 19438)) & (-2053) & 32767;
        lIllIlllIl[33] = (((187 + 106) - 81) + 33) ^ (((65 + 68) - 102) + 114);
        lIllIlllIl[34] = 176 ^ 162;
        lIllIlllIl[35] = (210 ^ 165) ^ (126 ^ 106);
        lIllIlllIl[36] = (107 ^ 122) ^ "  ".length();
        lIllIlllIl[37] = (-16393) & 18168;
        lIllIlllIl[38] = (-4114) & 7581;
        lIllIlllIl[39] = (-((-849) & 29659)) & (-85) & 30686;
        lIllIlllIl[40] = (-((-4131) & 29227)) & (-67) & 28670;
        lIllIlllIl[41] = (-8229) & 9965;
        lIllIlllIl[42] = (-((-19265) & 27507)) & (-4673) & 16383;
        lIllIlllIl[43] = (-20780) & 22511;
        lIllIlllIl[44] = (-16396) & 19899;
        lIllIlllIl[45] = (-((-16581) & 26822)) & (-20481) & 32511;
        lIllIlllIl[46] = (-258) & 2043;
        lIllIlllIl[47] = (-((-2103) & 14455)) & (-513) & 16367;
        lIllIlllIl[48] = (-30995) & 32759;
        lIllIlllIl[49] = (-((-1973) & 32702)) & (-257) & 32751;
        lIllIlllIl[50] = (-8725) & 12247;
        lIllIlllIl[51] = (-((-5753) & 32635)) & (-41) & 28671;
        lIllIlllIl[52] = (-20853) & 22527;
        lIllIlllIl[53] = (-29289) & 32766;
        lIllIlllIl[54] = (-((-13517) & 32207)) & (-1) & 20407;
        lIllIlllIl[55] = (-12385) & 15851;
        lIllIlllIl[56] = (-12563) & 14335;
        lIllIlllIl[57] = (-((-3365) & 16255)) & (-33) & 16383;
        lIllIlllIl[58] = (-((-1601) & 26193)) & (-5121) & 32766;
        lIllIlllIl[59] = (-((-19482) & 27995)) & (-529) & 12287;
        lIllIlllIl[60] = 185 ^ 173;
        lIllIlllIl[61] = 166 ^ 179;
        lIllIlllIl[62] = (218 ^ 130) ^ (126 ^ 48);
        lIllIlllIl[63] = (-((-19490) & 31795)) & (-2337) & 15807;
        lIllIlllIl[64] = (-((-19809) & 32613)) & (-16451) & 32638;
        lIllIlllIl[65] = (-3117) & 3903;
        lIllIlllIl[66] = (-((-9121) & 32745)) & (-257) & 24575;
        lIllIlllIl[67] = 47 ^ 56;
    }

    static NPC aD() {
        WorldPoint worldPoint = cw;
        WorldPoint worldPoint2 = new WorldPoint(cw.getX() - lIllIlllIl[0], cw.getWorldY() + lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(cw.getX(), cw.getWorldY() + lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(cw.getX() + lIllIlllIl[0], cw.getWorldY() + lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(cw.getX() + lIllIlllIl[0], cw.getWorldY(), lIllIlllIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(cw.getX() + lIllIlllIl[0], cw.getWorldY() - lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(cw.getX(), cw.getWorldY() - lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(cw.getX() - lIllIlllIl[0], cw.getWorldY() - lIllIlllIl[0], lIllIlllIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(cw.getX() - lIllIlllIl[0], cw.getWorldY(), lIllIlllIl[1]);
        List all = NPCs.getAll(npc -> {
            return npc.getName().equalsIgnoreCase(lIllIlllII[lIllIlllIl[36]]);
        });
        if (lIIllIlIlIlII(all)) {
            List of = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int i = lIllIlllIl[1];
            while (lIIllIlIlIIlI(i, all.size())) {
                if (lIIllIlIlIlIl(of.contains(((NPC) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC) all.get(i);
                }
                i++;
                "".length();
                if ("  ".length() <= ((38 ^ 19) & ((67 ^ 118) ^ (-1)))) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIlllIl[1];
    }

    private static String lIIllIlIIllll(String lllllllllllllllllllIIIIlIIIIlIII, String lllllllllllllllllllIIIIlIIIIIlll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllllIIIIlIIIIIlIl = lllllllllllllllllllIIIIlIIIIIlll.toCharArray();
        int lllllllllllllllllllIIIIlIIIIIlII = lIllIlllIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIlllIl[1];
        while (lIIllIlIlIIlI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllllllIIIIlIIIIIlIl[lllllllllllllllllllIIIIlIIIIIlII % lllllllllllllllllllIIIIlIIIIIlIl.length]));
            "".length();
            lllllllllllllllllllIIIIlIIIIIlII++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static void aC() {
        if (lIIllIlIllIIl(lIIllIlIlIlll(C0004e.a(cx), lIllIlllIl[9] + cC))) {
            if (lIIllIlIlIIll(Players.getLocal().getWorldLocation().equals(cw) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIlllII[lIllIlllIl[10]];
                if (lIIllIlIlIIlI(Movement.getRunEnergy(), lIllIlllIl[11]) && lIIllIlIlIlIl(Inventory.contains(C0005f.aU) ? 1 : 0)) {
                    Inventory.getFirst(C0005f.aU).interact(lIllIlllII[lIllIlllIl[12]]);
                    Time.sleepTicks(lIllIlllIl[0]);
                    "".length();
                }
                if (lIIllIlIlIIll(cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIllIlIllIlI(Players.getLocal().getWorldLocation().distanceTo(cv), lIllIlllIl[10])) {
                        AccBuilderShamans.c = lIllIlllII[lIllIlllIl[13]];
                        Movement.walkTo(cv);
                        "".length();
                        Time.sleepTicks(lIllIlllIl[0]);
                        "".length();
                    }
                    if (lIIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(cv), lIllIlllIl[10])) {
                        AccBuilderShamans.c = lIllIlllII[lIllIlllIl[14]];
                        if (lIIllIlIlIIlI(cA, lIllIlllIl[0])) {
                            C0004e.v();
                            cA += lIllIlllIl[0];
                        }
                        String[] strArr = new String[lIllIlllIl[0]];
                        strArr[lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[15]];
                        NPC nearest = NPCs.getNearest(strArr);
                        if (lIIllIlIlIlII(nearest)) {
                            String[] strArr2 = new String[lIllIlllIl[0]];
                            strArr2[lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[16]];
                            if (lIIllIlIlIlIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIllIlllII[lIllIlllIl[17]]);
                                Time.sleepTicks(lIllIlllIl[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lIllIlllIl[0]];
                            strArr3[lIllIlllIl[1]] = lIllIlllII[lIllIlllIl[8]];
                            if (lIIllIlIlIIll(nearest.hasAction(strArr3) ? 1 : 0)) {
                                C0006g.b(lIllIlllII[lIllIlllIl[18]], cy);
                                Time.sleepTicks(lIllIlllIl[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIIllIlIlIlIl(cz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(cw);
                    "".length();
                    Time.sleepTicks(lIllIlllIl[0]);
                    "".length();
                }
            }
            if (lIIllIlIlIlIl(Players.getLocal().getWorldLocation().equals(cw) ? 1 : 0)) {
                if (lIIllIlIllIIl(lIIllIlIllIII(C0004e.u(), 45.0d))) {
                    int[] iArr = new int[lIllIlllIl[0]];
                    iArr[lIllIlllIl[1]] = lIllIlllIl[2];
                    if (lIIllIlIlIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIllIlllIl[0]];
                        iArr2[lIllIlllIl[1]] = lIllIlllIl[2];
                        Inventory.getFirst(iArr2).interact(lIllIlllII[lIllIlllIl[19]]);
                        Time.sleepTicks(lIllIlllIl[0]);
                        "".length();
                    }
                }
                if (lIIllIlIlIIll(aE() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIlllII[lIllIlllIl[20]];
                    Time.sleepTicks(lIllIlllIl[15]);
                    "".length();
                }
                if (lIIllIlIlIlIl(aE() ? 1 : 0)) {
                    new WorldArea(cw, lIllIlllIl[3], lIllIlllIl[3]);
                    NPC aD = aD();
                    AccBuilderShamans.c = lIllIlllII[lIllIlllIl[21]];
                    if (lIIllIlIlllII(Players.getLocal().getInteracting()) && lIIllIlIlIlII(aD) && lIIllIlIlIIll(aD.isDead() ? 1 : 0)) {
                        System.out.println(lIllIlllII[lIllIlllIl[22]]);
                        aD.interact(lIllIlllII[lIllIlllIl[23]]);
                        Time.sleepTicks(lIllIlllIl[3]);
                        "".length();
                    }
                    Time.sleepTicks(lIllIlllIl[12]);
                    "".length();
                }
            }
        }
        if (lIIllIlIlllIl(lIIllIlIlIlll(C0004e.a(cx), lIllIlllIl[9] + cC))) {
            WorldArea worldArea = new WorldArea(lIllIlllIl[24], lIllIlllIl[25], lIllIlllIl[26], lIllIlllIl[27], lIllIlllIl[1]);
            WorldPoint worldPoint = new WorldPoint(lIllIlllIl[28], lIllIlllIl[29], lIllIlllIl[1]);
            if (lIIllIlIlIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIllIlIllIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIllIlllIl[13])) {
                Movement.walkTo(worldPoint);
                "".length();
            }
            AccBuilderShamans.c = lIllIlllII[lIllIlllIl[30]];
            Movement.walkTo(cm);
            "".length();
            Time.sleepTicks(lIllIlllIl[0]);
            "".length();
            if (lIIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(cm), lIllIlllIl[3])) {
                cx = System.currentTimeMillis();
                cC = C0004e.c(lIllIlllIl[31], lIllIlllIl[32]);
            }
        }
    }

    private static String lIIllIlIIllIl(String lllllllllllllllllllIIIIlIIIllIII, String lllllllllllllllllllIIIIlIIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIlIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIIlIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIIlIIIllIlI.init(lIllIlllIl[3], lllllllllllllllllllIIIIlIIIllIll);
            return new String(lllllllllllllllllllIIIIlIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIlIIIllIIl) {
            lllllllllllllllllllIIIIlIIIllIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aE() {
        WorldArea worldArea = new WorldArea(cw, lIllIlllIl[10], lIllIlllIl[10]);
        List all = Players.getAll();
        if (lIIllIlIlIIll(all.isEmpty() ? 1 : 0) && lIIllIlIllIlI(all.size(), lIllIlllIl[0])) {
            int i = lIllIlllIl[1];
            while (lIIllIlIlIIlI(i, all.size())) {
                if (lIIllIlIlIlIl(((Player) all.get(i)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if (((((23 + 98) - 109) + 137) ^ (((51 + 76) - 67) + 84)) == 0) {
                        return ((250 ^ 182) ^ (163 ^ 197)) & (((((26 + 62) - (-14)) + 69) ^ (((119 + 88) - 98) + 20)) ^ (-" ".length()));
                    }
                } else if (lIIllIlIlIlIl(worldArea.contains(((Player) all.get(i)).getWorldLocation()) ? 1 : 0)) {
                    return lIllIlllIl[0];
                }
                i++;
                "".length();
                if ("   ".length() < (((((164 + 194) - 294) + 161) ^ (((134 + 155) - 154) + 32)) & (((((212 + 217) - 297) + 97) ^ (((72 + 107) - 76) + 60)) ^ (-" ".length())))) {
                    return ((((11 + 56) - (-15)) + 76) ^ (((96 + 138) - 83) + 10)) & (((7 ^ 9) ^ (120 ^ 73)) ^ (-" ".length()));
                }
            }
        }
        return lIllIlllIl[1];
    }

    private static boolean lIIllIlIlllII(Object obj) {
        return obj == null;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            aB();
            "".length();
            if ("  ".length() <= 0) {
                return (85 ^ 80) & ((190 ^ 187) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllIlllIl[33];
    }

    private static boolean lIIllIlIllIlI(int i, int i2) {
        return i > i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIllIlllII[lIllIlllIl[34]];
    }

    private static void aB() {
        if (lIIllIlIlIIlI(cB, lIllIlllIl[0])) {
            cx = System.currentTimeMillis();
            System.out.println(lIllIlllII[lIllIlllIl[1]]);
            cB += lIllIlllIl[0];
        }
        int[] iArr = new int[lIllIlllIl[0]];
        iArr[lIllIlllIl[1]] = lIllIlllIl[2];
        if (lIIllIlIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIIllIlIlIlII(nearest) && lIIllIlIlIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIlllII[lIllIlllIl[0]];
                C0000a.a(nearest);
            }
            if (lIIllIlIlIlII(nearest) && lIIllIlIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIlllII[lIllIlllIl[3]];
                if (lIIllIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIllIlllIl[4]);
                    "".length();
                }
                if (lIIllIlIlIlIl(Bank.isOpen() ? 1 : 0)) {
                    if (lIIllIlIlIllI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIllIlllIl[0]);
                        "".length();
                    }
                    C0000a.a(lIllIlllIl[2], lIllIlllIl[5]);
                    C0000a.a(lIllIlllIl[6], lIllIlllIl[0]);
                    C0000a.a(lIllIlllIl[7], lIllIlllIl[8]);
                }
            }
        }
        int[] iArr2 = new int[lIllIlllIl[0]];
        iArr2[lIllIlllIl[1]] = lIllIlllIl[2];
        if (lIIllIlIlIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
            aC();
        }
    }

    private static boolean lIIllIlIlIIll(int i) {
        return i == 0;
    }

    private static boolean lIIllIlIllIIl(int i) {
        return i < 0;
    }

    private static boolean lIIllIlIlllll(int i, int i2) {
        return i >= i2;
    }

    private static String lIIllIlIIlllI(String lllllllllllllllllllIIIIlIIlIIlIl, String lllllllllllllllllllIIIIlIIlIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIllIlllIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIlIIlIIllI) {
            lllllllllllllllllllIIIIlIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIllIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIllIlIlllll(Skills.getLevel(Skill.RANGED), lIllIlllIl[35]) && lIIllIlIlllll(Skills.getLevel(Skill.DEFENCE), lIllIlllIl[35])) {
            ?? r0 = lIllIlllIl[0];
            "".length();
            return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIlllIl[1];
    }

    private static int lIIllIlIllIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIllIlIlllIl(int i) {
        return i >= 0;
    }

    private static void lIIllIlIlIIII() {
        lIllIlllII = new String[lIllIlllIl[67]];
        lIllIlllII[lIllIlllIl[1]] = lIIllIlIIllIl("aumsglPoHaCyGRGe7FqoHSi2Xgrh1mD1", "DkFqx");
        lIllIlllII[lIllIlllIl[0]] = lIIllIlIIllIl("OHbPRJtV6nSfsEij34HBdzCWY+faRKdj", "nNqWn");
        lIllIlllII[lIllIlllIl[3]] = lIIllIlIIlllI("KRDmzTGD+Ap1LP/fl4eNbU6O3PPT1I13", "TPMhL");
        lIllIlllII[lIllIlllIl[10]] = lIIllIlIIllll("Gi8faA47bhopFDBuCjobNj0=", "TNiHz");
        lIllIlllII[lIllIlllIl[12]] = lIIllIlIIllIl("y3D3iAFd0b8=", "bGpqd");
        lIllIlllII[lIllIlllIl[13]] = lIIllIlIIlllI("A7SszBdVUl4ySDLiXTO5hQ==", "WUipz");
        lIllIlllII[lIllIlllIl[14]] = lIIllIlIIllll("BAYXBjopRw8HOT9HGgo3OA==", "LgybV");
        lIllIlllII[lIllIlllIl[15]] = lIIllIlIIlllI("2u+yyS7tUAg=", "CBbLM");
        lIllIlllII[lIllIlllIl[16]] = lIIllIlIIllIl("8q9RAwfaB2VbH1r8gMXgOWLwSp9gXEG8", "bSdpF");
        lIllIlllII[lIllIlllIl[17]] = lIIllIlIIllll("KS47GEwpKDoPDQsoJQUZCg==", "yAIll");
        lIllIlllII[lIllIlllIl[8]] = lIIllIlIIllIl("gKG1wlugdWBwaSLXaJohbNjeJRq3B2Y1", "tLnDp");
        lIllIlllII[lIllIlllIl[18]] = lIIllIlIIllIl("cZmU35OAMmg=", "XITla");
        lIllIlllII[lIllIlllIl[19]] = lIIllIlIIllIl("FTTulN5sLKs=", "HYCOM");
        lIllIlllII[lIllIlllIl[20]] = lIIllIlIIllIl("RIpdwiJyYO278zSIrvLPxg==", "zqXZK");
        lIllIlllII[lIllIlllIl[21]] = lIIllIlIIllll("ID8vAD1COTQPKQo/Ig==", "bZFnZ");
        lIllIlllII[lIllIlllIl[22]] = lIIllIlIIllll("Ihs4KgsIBiIsSAAdLTgABgs=", "coLKh");
        lIllIlllII[lIllIlllIl[23]] = lIIllIlIIlllI("Nw10xsDh1VY=", "PCmul");
        lIllIlllII[lIllIlllIl[30]] = lIIllIlIIllIl("vj7ACOE9a4gPEANQLy5Q8g==", "xmxCs");
        lIllIlllII[lIllIlllIl[34]] = lIIllIlIIllIl("VIhHx6pbDvKB602OPe+4mw==", "JtMuu");
        lIllIlllII[lIllIlllIl[36]] = lIIllIlIIllll("ASIbAG4RMRQG", "rCudN");
        lIllIlllII[lIllIlllIl[60]] = lIIllIlIIllll("LRsVAGsKUxMGKRgHWFQvGB1UDSMMUwAVJxxTGRFsDRsRBilZAxgRLQoWSw==", "ysttL");
        lIllIlllII[lIllIlllIl[61]] = lIIllIlIIllll("GQcGSA81E0gcFzEDSAUTehIHSDEoAwkcVhEJHRoTNAJX", "Zfhhv");
        lIllIlllII[lIllIlllIl[62]] = lIIllIlIIllIl("EwWoyqEqPT5WZxYU2onfLA==", "AuaFa");
    }

    private static boolean lIIllIlIllllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllIlIlIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIlIlIllI(int i) {
        return i > 0;
    }

    public static void aF() {
        int c = C0004e.c(lIllIlllIl[0], lIllIlllIl[13]);
        if (lIIllIlIllllI(c, lIllIlllIl[0])) {
            cw = cg;
            cm = ch;
        }
        if (lIIllIlIllllI(c, lIllIlllIl[3])) {
            cw = cn;
            cm = co;
        }
        if (lIIllIlIllllI(c, lIllIlllIl[10])) {
            cw = cp;
            cm = cq;
        }
        if (lIIllIlIllllI(c, lIllIlllIl[12])) {
            cw = cr;
            cm = cs;
        }
        if (lIIllIlIllllI(c, lIllIlllIl[13])) {
            cw = ct;
            cm = cu;
        }
    }
}
