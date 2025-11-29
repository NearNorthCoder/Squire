package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.plugins.logout.Clues;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.f  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/f.class */
public class f {
    private static /* synthetic */ String[] lIIl;
    private static /* synthetic */ int[] lIll;
    public static /* synthetic */ WorldArea I;
    static /* synthetic */ WorldPoint J;

    private static boolean lllIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean s() {
        int[] iArr = new int[lIll[0]];
        iArr[lIll[1]] = Clues.k;
        if (llIllI(Inventory.contains(iArr) ? 1 : 0) && llIllI(e.A() ? 1 : 0) && llIlIl(Inventory.contains(item -> {
            return item.getName().contains(lIIl[lIll[61]]);
        }) ? 1 : 0) && llIlIl(Clues.g ? 1 : 0)) {
            ?? r0 = lIll[0];
            "".length();
            return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIll[1];
    }

    private static void llIIll() {
        lIll = new int[72];
        lIll[0] = " ".length();
        lIll[1] = ((17 ^ 78) ^ (106 ^ 126)) & (((((35 + 134) - 52) + 19) ^ (((3 + 116) - 0) + 76)) ^ (-" ".length()));
        lIll[2] = "  ".length();
        lIll[3] = (-((-4363) & 13083)) & (-4353) & 16255;
        lIll[4] = (-17017) & 26621;
        lIll[5] = (((78 + 39) - 27) + 103) ^ (((131 + 21) - 112) + 158);
        lIll[6] = (((164 + 128) - 261) + 170) ^ (((132 + 175) - 215) + 102);
        lIll[7] = (-21265) & 24400;
        lIll[8] = 110 ^ 44;
        lIll[9] = (176 ^ 183) ^ (25 ^ 41);
        lIll[10] = (-24866) & 28031;
        lIll[11] = (-16645) & 19895;
        lIll[12] = (53 ^ 80) ^ (166 ^ 199);
        lIll[13] = "   ".length();
        lIll[14] = (-((-2825) & 23471)) & (-18) & 24063;
        lIll[15] = (-9619) & 13818;
        lIll[16] = 71 ^ 66;
        lIll[17] = 80 ^ 86;
        lIll[18] = (-((-2597) & 6710)) & (-769) & 8181;
        lIll[19] = (-((-12289) & 28867)) & (-3078) & 24055;
        lIll[20] = 46 ^ 38;
        lIll[21] = 183 ^ 190;
        lIll[22] = (((249 ^ 173) + (170 ^ 143)) - (145 ^ 188)) + ((90 + 24) - 73) + 128;
        lIll[23] = 82 ^ 88;
        lIll[24] = 92 ^ 80;
        lIll[25] = (((112 + 68) - 59) + 9) ^ (((90 + 126) - 131) + 67);
        lIll[26] = (12 ^ 112) ^ (42 ^ 91);
        lIll[27] = 151 ^ 181;
        lIll[28] = 160 ^ 174;
        lIll[29] = 84 ^ 91;
        lIll[30] = 49 ^ 33;
        lIll[31] = (((74 + 188) - 87) + 39) ^ (((185 + 181) - 204) + 37);
        lIll[32] = 139 ^ 153;
        lIll[33] = (196 ^ 191) ^ (208 ^ 184);
        lIll[34] = 84 ^ 64;
        lIll[35] = (((116 + 51) - 158) + 159) ^ (((67 + 176) - 223) + 169);
        lIll[36] = 160 ^ 182;
        lIll[37] = 67 ^ 84;
        lIll[38] = (((23 + 4) - (-101)) + 90) ^ (((36 + 7) - (-17)) + 134);
        lIll[39] = (((44 + 50) - 39) + 105) ^ (((78 + 74) - 148) + 181);
        lIll[40] = 0 ^ 27;
        lIll[41] = (125 ^ 57) ^ (65 ^ 25);
        lIll[42] = (((204 + 170) - 175) + 22) ^ (((81 + 42) - 82) + 151);
        lIll[43] = (171 ^ 137) ^ (91 ^ 103);
        lIll[44] = 105 ^ 118;
        lIll[45] = 150 ^ 182;
        lIll[46] = (104 ^ 111) ^ (139 ^ 173);
        lIll[47] = (144 ^ 183) ^ (155 ^ 159);
        lIll[48] = 129 ^ 165;
        lIll[49] = 82 ^ 119;
        lIll[50] = 161 ^ 135;
        lIll[51] = 10 ^ 45;
        lIll[52] = 125 ^ 85;
        lIll[53] = 69 ^ 108;
        lIll[54] = 173 ^ 135;
        lIll[55] = (((91 + 54) - 102) + 85) ^ (((56 + 111) - 153) + 157);
        lIll[56] = (37 ^ 17) ^ (131 ^ 155);
        lIll[57] = (127 ^ 29) ^ (52 ^ 123);
        lIll[58] = (((43 + 89) - 111) + 125) ^ (((38 + 24) - (-63)) + 63);
        lIll[59] = (((167 + 112) - 98) + 0) ^ (((125 + 68) - 111) + 72);
        lIll[60] = 110 ^ 94;
        lIll[61] = (109 ^ 29) ^ (11 ^ 74);
        lIll[62] = 134 ^ 180;
        lIll[63] = (182 ^ 147) ^ (89 ^ 79);
        lIll[64] = (156 ^ 148) ^ (71 ^ 123);
        lIll[65] = (114 ^ 28) ^ (155 ^ 192);
        lIll[66] = (19 ^ 32) ^ (107 ^ 110);
        lIll[67] = (-16390) & 19543;
        lIll[68] = (-19041) & 28662;
        lIll[69] = (-17292) & 20459;
        lIll[70] = (-((-4257) & 6903)) & (-20481) & 32759;
        lIll[71] = 62 ^ 6;
    }

    private static int llIlII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        llIIll();
        llIIlI();
        I = new WorldArea(lIll[67], lIll[68], lIll[38], lIll[33], lIll[1]);
        J = new WorldPoint(lIll[69], lIll[70], lIll[1]);
    }

    private static boolean llllIl(int i, int i2) {
        return i >= i2;
    }

    private static String lIllII(String llllllIIIlIIlIl, String llllllIIIlIIlII) {
        String str = new String(Base64.getDecoder().decode(llllllIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllIIIlIIlII.toCharArray();
        int llllllIIIlIIIIl = lIll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIll[1];
        while (lllllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllIIIlIIIIl % charArray.length]));
            "".length();
            llllllIIIlIIIIl++;
            i++;
            "".length();
            if ((((((161 + 160) - 279) + 198) ^ (((64 + 23) - 37) + 125)) & (((69 ^ 2) ^ (168 ^ 176)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIIlI() {
        lIIl = new String[lIll[71]];
        lIIl[lIll[1]] = lIllII("IwQR", "feeZT");
        lIIl[lIll[0]] = lIllIl("FE609gDRpl83X+YDeRwJxcE7ow1Yt/Wj", "IOwci");
        lIIl[lIll[2]] = lIllIl("iycPQRRrVydtrvuD2IAOSA==", "hGLzE");
        lIIl[lIll[13]] = lIllIl("22hFeGdAX4E=", "VLNGD");
        lIIl[lIll[12]] = lIllII("JyEoEl07JygS", "wHKyp");
        lIIl[lIll[16]] = lIllII("KBouPhVGEigkGQ==", "kvGSw");
        lIIl[lIll[17]] = lIllII("BCsaCTJqIxwTPg==", "GGsdP");
        lIIl[lIll[5]] = lIllIl("9cmCii8RYPCrFeKhUjmwsA==", "MdsFa");
        lIIl[lIll[20]] = lIlllI("LH3gp4g2Huo=", "NuKWw");
        lIIl[lIll[21]] = lIlllI("QANewJLCsDWCzAcXE2zW4w==", "ceVfD");
        lIIl[lIll[23]] = lIlllI("82SwH66wQR8GQgMWh7PbZw==", "VUIpp");
        lIIl[lIll[6]] = lIlllI("AcBOkNhR3kwKWOVkaUVNKw==", "DFlPn");
        lIIl[lIll[24]] = lIlllI("FtwFZZhddgg=", "BxRws");
        lIIl[lIll[26]] = lIllIl("tBY5lz9LuRcy+ex2XnyJqA==", "fdEWh");
        lIIl[lIll[28]] = lIlllI("Obte8TeBL8GVcdOCIjG+0A==", "AseOJ");
        lIIl[lIll[29]] = lIllII("GxgjOhY8Sig1Cz4PPg==", "YjLTl");
        lIIl[lIll[30]] = lIllII("CR8CLwouTR0oEyAMFSQ=", "KmmAp");
        lIIl[lIll[31]] = lIllIl("USNECJt45Rf4bEnth6wj2w==", "CvSGJ");
        lIIl[lIll[32]] = lIllIl("C0P+2BoZIFIWCRcr6CZitQ==", "aoqLN");
        lIIl[lIll[33]] = lIllII("EBkYPnYpAhQ7NyEO", "YkwPV");
        lIIl[lIll[34]] = lIllIl("3/p9B9fc3DLWqzsm6jyQ9A==", "sgiRs");
        lIIl[lIll[35]] = lIllII("BBknADV3DDoA", "WmBeY");
        lIIl[lIll[36]] = lIllII("FAE2FxVnETIVHiIH", "GuSry");
        lIIl[lIll[37]] = lIlllI("giFaq6Qba0BtqBNKC6tycw==", "jeHoS");
        lIIl[lIll[38]] = lIllIl("RmjGPXfXfabnWipuDQsdeg==", "sGKVk");
        lIIl[lIll[39]] = lIlllI("xxL7dRRAXznYK3z6Rjn41w==", "dAznA");
        lIIl[lIll[25]] = lIllII("Bw4/Qy4jACQGOg==", "OoRcI");
        lIIl[lIll[40]] = lIllIl("VZ423QpgFnwSgNu0idnZ8g==", "VGCFY");
        lIIl[lIll[41]] = lIllIl("43jrXY69wffNOgyyOI5JYQ==", "gsQEc");
        lIIl[lIll[42]] = lIllII("GjczAxg2MQ==", "XBGww");
        lIIl[lIll[43]] = lIllII("IA4UIyEBC1kjNAkADDA=", "doyBF");
        lIIl[lIll[44]] = lIlllI("bkWHufmMUNRZEWI6zSGIDg==", "fmPMg");
        lIIl[lIll[45]] = lIlllI("IhmwNbzgDRY=", "aHKjn");
        lIIl[lIll[46]] = lIllIl("5X4WDwZmjqY=", "OoqaW");
        lIIl[lIll[27]] = lIllIl("/twSXWLdnQ8=", "OFsKz");
        lIIl[lIll[47]] = lIllII("FB4DLA8zFA==", "WqtDf");
        lIIl[lIll[48]] = lIlllI("geKv5r76/Bk=", "hwhEp");
        lIIl[lIll[49]] = lIllIl("/Jhb0E0wLYI=", "OYAaO");
        lIIl[lIll[50]] = lIllII("FBEUaggoEwslHy8VEA==", "FpcJi");
        lIIl[lIll[51]] = lIlllI("ftS8y6EmYf0yhlmpHEjniA==", "MwRRS");
        lIIl[lIll[52]] = lIllIl("lL5d6zNX444C186KbqjizQ==", "QqUsc");
        lIIl[lIll[53]] = lIllII("FjQWAjFjNQUWKQ==", "CZuwE");
        lIIl[lIll[54]] = lIllII("CjYICg==", "IYifg");
        lIIl[lIll[55]] = lIlllI("W0+0WFgllnkrTO9dZQAeAA==", "ZIGju");
        lIIl[lIll[56]] = lIllII("LwYXOA5aAhUpHw==", "zhtMz");
        lIIl[lIll[57]] = lIllII("IzsqLh1ELjYiCUQlJiIC", "dICCd");
        lIIl[lIll[58]] = lIllIl("yb8URb7xJllkKOBtAq1NJigB2L+dJgxF", "HZJZp");
        lIIl[lIll[59]] = lIllII("FRwFCQlyGg0WAj0DBQo=", "Rnldp");
        lIIl[lIll[60]] = lIllIl("HatiSr8GLVlc1J/JAgYkgg==", "VYboj");
        lIIl[lIll[61]] = lIlllI("iDIdiRWezNuvz3c5+IQ4rQ==", "uCwcn");
        lIIl[lIll[62]] = lIllII("FAsgAQ==", "WgUde");
        lIIl[lIll[63]] = lIllIl("L28oLt9KlQc=", "tvRWZ");
        lIIl[lIll[64]] = lIllIl("T9g/g187cCM=", "jnuBI");
        lIIl[lIll[65]] = lIlllI("xSYOfog0VPeS78O9EcCIjQ==", "dbFQz");
        lIIl[lIll[66]] = lIllIl("EF2oZaMU8fOuiTf6dcLmVw==", "MaSMZ");
        lIIl[lIll[9]] = lIllIl("gTMyB0ZMeOrJZwgw2vgphA==", "rocUV");
    }

    private static boolean llIlIl(int i) {
        return i == 0;
    }

    private static boolean llIllI(int i) {
        return i != 0;
    }

    private static String lIlllI(String llllllIIIIIIIll, String llllllIIIIIIIlI) {
        try {
            SecretKeySpec llllllIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIll[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIll[2], llllllIIIIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIIIIIIlII) {
            llllllIIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIll(int i, int i2) {
        return i != i2;
    }

    private static boolean lllIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    public static void E() {
        if (llIlIl(s() ? 1 : 0)) {
            e.w();
        }
        if (llIllI(s() ? 1 : 0)) {
            if (llIlll(llIlII(k.ae(), 70.0d))) {
                int[] iArr = new int[lIll[0]];
                iArr[lIll[1]] = Clues.k;
                if (llIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIll[0]];
                    iArr2[lIll[1]] = Clues.k;
                    Inventory.getFirst(iArr2).interact(lIIl[lIll[1]]);
                    Time.sleepTicks(lIll[2]);
                    "".length();
                }
            }
            WorldArea worldArea = new WorldArea(lIll[3], lIll[4], lIll[5], lIll[6], lIll[1]);
            if (llIlIl(I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Clues.f0c = lIIl[lIll[0]];
                WorldArea worldArea2 = new WorldArea(lIll[7], lIll[4], lIll[8], lIll[9], lIll[1]);
                if (llIlIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIll[10], lIll[11], lIll[1]);
                    if (lllIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIll[12])) {
                        Movement.walkTo(worldPoint);
                        "".length();
                        Time.sleepTicks(lIll[0]);
                        "".length();
                    }
                    if (lllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIll[12])) {
                        String[] strArr = new String[lIll[0]];
                        strArr[lIll[1]] = lIIl[lIll[2]];
                        TileObject nearest = TileObjects.getNearest(strArr);
                        if (lllIlI(nearest)) {
                            String[] strArr2 = new String[lIll[0]];
                            strArr2[lIll[1]] = lIIl[lIll[13]];
                            if (llIllI(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIIl[lIll[12]]);
                                Time.sleepUntil(() -> {
                                    String[] strArr3 = new String[lIll[0]];
                                    strArr3[lIll[1]] = lIIl[lIll[66]];
                                    TileObject nearest2 = TileObjects.getNearest(strArr3);
                                    String[] strArr4 = new String[lIll[0]];
                                    strArr4[lIll[1]] = lIIl[lIll[9]];
                                    return nearest2.hasAction(strArr4);
                                }, k.c(lIll[14], lIll[15]));
                                "".length();
                            }
                            String[] strArr3 = new String[lIll[0]];
                            strArr3[lIll[1]] = lIIl[lIll[16]];
                            if (llIllI(nearest.hasAction(strArr3) ? 1 : 0)) {
                                nearest.interact(lIIl[lIll[17]]);
                                Time.sleepUntil(() -> {
                                    return worldArea2.contains(Players.getLocal().getWorldLocation());
                                }, k.c(lIll[18], lIll[19]));
                                "".length();
                            }
                        }
                    }
                }
                if (llIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Clues.f0c = lIIl[lIll[5]];
                        String[] strArr4 = new String[lIll[0]];
                        strArr4[lIll[1]] = lIIl[lIll[20]];
                        TileObjects.getNearest(strArr4).interact(lIIl[lIll[21]]);
                        Time.sleepTicks(lIll[12]);
                        "".length();
                    }
                    if (llIlIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(J);
                        "".length();
                        Time.sleepTicks(lIll[0]);
                        "".length();
                    }
                }
            }
            if (llIllI(I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                NPC nearest2 = NPCs.getNearest(npc -> {
                    if (llIllI(npc.getName().contains(lIIl[lIll[64]]) ? 1 : 0) && llIllI(I.contains(npc) ? 1 : 0)) {
                        String[] strArr5 = new String[lIll[0]];
                        strArr5[lIll[1]] = lIIl[lIll[65]];
                        if (llIllI(npc.hasAction(strArr5) ? 1 : 0)) {
                            ?? r0 = lIll[0];
                            "".length();
                            return "  ".length() == 0 ? ((41 ^ 17) ^ (55 ^ 18)) & (((197 ^ 168) ^ (238 ^ 158)) ^ (-" ".length())) : r0;
                        }
                    }
                    return lIll[1];
                });
                if (lllIlI(nearest2)) {
                    if (llIlIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        Movement.walkTo(nearest2.getWorldLocation());
                        "".length();
                        Time.sleepTicks(lIll[0]);
                        "".length();
                    }
                    if (llIllI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                        if (lllIll(Players.getLocal().getGraphic(), lIll[22])) {
                            Clues.f0c = lIIl[lIll[23]];
                            nearest2.interact(lIIl[lIll[6]]);
                            Time.sleepTicks(k.c(lIll[0], lIll[2]));
                            "".length();
                        }
                        if (llllII(Players.getLocal().getGraphic(), lIll[22])) {
                            Clues.f0c = lIIl[lIll[24]];
                        }
                    }
                }
            }
            if (llllIl(Inventory.getAll().size(), lIll[25])) {
                Clues.f0c = lIIl[lIll[26]];
                String[] strArr5 = new String[lIll[27]];
                strArr5[lIll[1]] = lIIl[lIll[28]];
                strArr5[lIll[0]] = lIIl[lIll[29]];
                strArr5[lIll[2]] = lIIl[lIll[30]];
                strArr5[lIll[13]] = lIIl[lIll[31]];
                strArr5[lIll[12]] = lIIl[lIll[32]];
                strArr5[lIll[16]] = lIIl[lIll[33]];
                strArr5[lIll[17]] = lIIl[lIll[34]];
                strArr5[lIll[5]] = lIIl[lIll[35]];
                strArr5[lIll[20]] = lIIl[lIll[36]];
                strArr5[lIll[21]] = lIIl[lIll[37]];
                strArr5[lIll[23]] = lIIl[lIll[38]];
                strArr5[lIll[6]] = lIIl[lIll[39]];
                strArr5[lIll[24]] = lIIl[lIll[25]];
                strArr5[lIll[26]] = lIIl[lIll[40]];
                strArr5[lIll[28]] = lIIl[lIll[41]];
                strArr5[lIll[29]] = lIIl[lIll[42]];
                strArr5[lIll[30]] = lIIl[lIll[43]];
                strArr5[lIll[31]] = lIIl[lIll[44]];
                strArr5[lIll[32]] = lIIl[lIll[45]];
                strArr5[lIll[33]] = lIIl[lIll[46]];
                strArr5[lIll[34]] = lIIl[lIll[27]];
                strArr5[lIll[35]] = lIIl[lIll[47]];
                strArr5[lIll[36]] = lIIl[lIll[48]];
                strArr5[lIll[37]] = lIIl[lIll[49]];
                strArr5[lIll[38]] = lIIl[lIll[50]];
                strArr5[lIll[39]] = lIIl[lIll[51]];
                strArr5[lIll[25]] = lIIl[lIll[52]];
                strArr5[lIll[40]] = lIIl[lIll[53]];
                strArr5[lIll[41]] = lIIl[lIll[54]];
                strArr5[lIll[42]] = lIIl[lIll[55]];
                strArr5[lIll[43]] = lIIl[lIll[56]];
                strArr5[lIll[44]] = lIIl[lIll[57]];
                strArr5[lIll[45]] = lIIl[lIll[58]];
                strArr5[lIll[46]] = lIIl[lIll[59]];
                Inventory.getAll(strArr5).stream().forEach((v0) -> {
                    v0.drop();
                });
            }
            if (llIllI(Inventory.contains(item -> {
                if (llIllI(item.getName().contains(lIIl[lIll[62]]) ? 1 : 0) && llIlIl(item.getName().contains(lIIl[lIll[63]]) ? 1 : 0)) {
                    ?? r0 = lIll[0];
                    "".length();
                    return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIll[1];
            }) ? 1 : 0)) {
                System.out.println(lIIl[lIll[60]]);
                c.E = lIll[0];
                Time.sleepTicks(k.c(lIll[2], lIll[13]));
                "".length();
            }
        }
    }

    private static boolean llllII(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIlll(int i) {
        return i < 0;
    }

    private static boolean lllllI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIl(String llllllIIIIlIIII, String llllllIIIIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIIIIlIIlI = Cipher.getInstance("Blowfish");
            llllllIIIIlIIlI.init(lIll[2], secretKeySpec);
            return new String(llllllIIIIlIIlI.doFinal(Base64.getDecoder().decode(llllllIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIIIIlIIIl) {
            llllllIIIIlIIIl.printStackTrace();
            return null;
        }
    }
}
