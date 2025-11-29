package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ao  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ao.class */
public class ao implements InterfaceC0003ac {
    public static final /* synthetic */ int nv;
    public static final /* synthetic */ int nq;
    public static final /* synthetic */ int[] nw;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldArea y;
    public static final /* synthetic */ int nt;
    public static /* synthetic */ int[] ny;
    public static /* synthetic */ WorldPoint F;
    private static /* synthetic */ String[] llIlIIIlII;
    public static final /* synthetic */ int ns;
    public static final /* synthetic */ int nu;
    private static /* synthetic */ int[] llIlIIIlIl;
    public static /* synthetic */ int[] nx;
    public static final /* synthetic */ int nr;
    public static /* synthetic */ List<C0017d> bv;

    private static boolean lIllIIIIlllll(Object obj) {
        return obj != null;
    }

    private static String lIllIIIIllIIl(String llllllllllllllllllIIlIIlIllIIIll, String llllllllllllllllllIIlIIlIllIIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIlIIlIllIIIlI.toCharArray();
        int llllllllllllllllllIIlIIlIlIlllll = llIlIIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIlIl[0];
        while (lIllIIIIlllIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIIlIIlIlIlllll % charArray.length]));
            "".length();
            llllllllllllllllllIIlIIlIlIlllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        fQ();
        return llIlIIIlIl[41];
    }

    private static void lIllIIIIllIlI() {
        llIlIIIlII = new String[llIlIIIlIl[63]];
        llIlIIIlII[llIlIIIlIl[0]] = lIllIIIIlIlll("5Xe8MRjyDkVyzOmX0KcgxA==", "JVHfg");
        llIlIIIlII[llIlIIIlIl[1]] = lIllIIIIllIII("9QyUU1WqOaLw4EVrbe2fgwoYxpx+qau7swljpMgYYdv5Velwqouq4gvhZ27td4TC", "LhbeE");
        llIlIIIlII[llIlIIIlIl[3]] = lIllIIIIllIIl("Kg0QIDEFGA8nMUQYCWk0BQIN", "dlfIV");
        llIlIIIlII[llIlIIIlIl[4]] = lIllIIIIllIII("VY74/9Ce+0LwCgYhavC6l3OWvB8601pJ", "cNtNI");
        llIlIIIlII[llIlIIIlIl[6]] = lIllIIIIllIII("d7Lza81GlxF7l1Z0Sffu8Lj5h/3PGupzpkjWwEpGCBBv6W49NeSutCC7J8Ey1Bn3", "DBojD");
        llIlIIIlII[llIlIIIlIl[24]] = lIllIIIIllIIl("DQUOJzMgGQY=", "IwaWC");
        llIlIIIlII[llIlIIIlIl[22]] = lIllIIIIllIII("xZNEQlRP3Kn0sghbo+Iz1w==", "iZYBT");
        llIlIIIlII[llIlIIIlIl[26]] = lIllIIIIllIIl("OAUvACkSTCIGNwUJMw==", "ulAiG");
        llIlIIIlII[llIlIIIlIl[27]] = lIllIIIIlIlll("3pQRlnUYpy8=", "ErHBD");
        llIlIIIlII[llIlIIIlIl[28]] = lIllIIIIlIlll("IB7vAWKpnlsukwbVTBVCXDP7t0O6nYSx", "zTtxf");
        llIlIIIlII[llIlIIIlIl[29]] = lIllIIIIlIlll("pBa9ycRucktPaun9NxdsGw==", "EPiOV");
        llIlIIIlII[llIlIIIlIl[30]] = lIllIIIIlIlll("ZDLSM0Enqxk=", "SyURk");
        llIlIIIlII[llIlIIIlIl[42]] = lIllIIIIllIII("Jf/iYnjjJes=", "dvEDa");
        llIlIIIlII[llIlIIIlIl[43]] = lIllIIIIllIII("i5hiV0d0dK1zLZeKoXPuWyS81YuOvD/e", "ZuBsx");
    }

    private static String lIllIIIIllIII(String llllllllllllllllllIIlIIlIlIIlllI, String llllllllllllllllllIIlIIlIlIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), llIlIIIlIl[27]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIIlIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIlIlIIllll) {
            llllllllllllllllllIIlIIlIlIIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static boolean an() {
        if (lIllIIIlIIIIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[31])) {
            int[] iArr = new int[llIlIIIlIl[1]];
            iArr[llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (lIllIIIlIIIII(Inventory.getCount(iArr))) {
                ?? r0 = llIlIIIlIl[1];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIIIlIl[0];
        } else if (lIllIIIlIIIIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[32]) && lIllIIIIlllIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[31])) {
            int[] iArr2 = new int[llIlIIIlIl[1]];
            iArr2[llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (lIllIIIlIIIII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[llIlIIIlIl[1]];
                iArr3[llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (lIllIIIlIIIII(Inventory.getCount(iArr3))) {
                    ?? r02 = llIlIIIlIl[1];
                    "".length();
                    return ((42 ^ 17) & ((62 ^ 5) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return llIlIIIlIl[0];
        } else if (lIllIIIlIIIIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[33]) && lIllIIIIlllIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[32])) {
            int[] iArr4 = new int[llIlIIIlIl[1]];
            iArr4[llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (lIllIIIlIIIII(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[llIlIIIlIl[1]];
                iArr5[llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (lIllIIIlIIIII(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[llIlIIIlIl[1]];
                    iArr6[llIlIIIlIl[0]] = llIlIIIlIl[9];
                    if (lIllIIIlIIIII(Inventory.getCount(iArr6))) {
                        ?? r03 = llIlIIIlIl[1];
                        "".length();
                        return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                    }
                }
            }
            return llIlIIIlIl[0];
        } else if (lIllIIIlIIIIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[22]) && lIllIIIIlllIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[33])) {
            int[] iArr7 = new int[llIlIIIlIl[1]];
            iArr7[llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (lIllIIIlIIIII(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[llIlIIIlIl[1]];
                iArr8[llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (lIllIIIlIIIII(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[llIlIIIlIl[1]];
                    iArr9[llIlIIIlIl[0]] = llIlIIIlIl[9];
                    if (lIllIIIlIIIII(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[llIlIIIlIl[1]];
                        iArr10[llIlIIIlIl[0]] = llIlIIIlIl[8];
                        if (lIllIIIlIIIII(Inventory.getCount(iArr10))) {
                            ?? r04 = llIlIIIlIl[1];
                            "".length();
                            return !((true ^ true) ^ (true ^ true)) ? ((59 ^ 92) ^ (204 ^ 190)) & (((((77 + 133) - 185) + 131) ^ (((29 + 77) - 36) + 67)) ^ (-" ".length())) : r04;
                        }
                    }
                }
            }
            return llIlIIIlIl[0];
        } else {
            int[] iArr11 = new int[llIlIIIlIl[1]];
            iArr11[llIlIIIlIl[0]] = llIlIIIlIl[11];
            if (lIllIIIlIIIII(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[llIlIIIlIl[1]];
                iArr12[llIlIIIlIl[0]] = llIlIIIlIl[10];
                if (lIllIIIlIIIII(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[llIlIIIlIl[1]];
                    iArr13[llIlIIIlIl[0]] = llIlIIIlIl[9];
                    if (lIllIIIlIIIII(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[llIlIIIlIl[1]];
                        iArr14[llIlIIIlIl[0]] = llIlIIIlIl[8];
                        if (lIllIIIlIIIII(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[llIlIIIlIl[1]];
                            iArr15[llIlIIIlIl[0]] = llIlIIIlIl[7];
                            if (lIllIIIlIIIII(Inventory.getCount(iArr15))) {
                                ?? r05 = llIlIIIlIl[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r05;
                            }
                        }
                    }
                }
            }
            return llIlIIIlIl[0];
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIIIlII[llIlIIIlIl[42]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIIIlIIIIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[2])) {
            ?? r0 = llIlIIIlIl[1];
            "".length();
            return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIIIlIl[0];
    }

    private static boolean lIllIIIlIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIllIIIIllIll() {
        llIlIIIlIl = new int[64];
        llIlIIIlIl[0] = ((((57 + 211) - 100) + 59) ^ (((30 + 60) - 83) + 153)) & (((233 ^ 199) ^ (113 ^ 28)) ^ (-" ".length()));
        llIlIIIlIl[1] = " ".length();
        llIlIIIlIl[2] = 164 ^ 178;
        llIlIIIlIl[3] = "  ".length();
        llIlIIIlIl[4] = "   ".length();
        llIlIIIlIl[5] = (-((-4353) & 12563)) & (-16453) & 29662;
        llIlIIIlIl[6] = (((56 + 11) - (-13)) + 67) ^ (((120 + 43) - 37) + 25);
        llIlIIIlIl[7] = (-16649) & 17913;
        llIlIIIlIl[8] = (-8203) & 9471;
        llIlIIIlIl[9] = (-28679) & 29951;
        llIlIIIlIl[10] = (-30729) & 31999;
        llIlIIIlIl[11] = (-31237) & 32511;
        llIlIIIlIl[12] = (-20747) & 32606;
        llIlIIIlIl[13] = (-265) & 12120;
        llIlIIIlIl[14] = (-((-591) & 17023)) & (-4354) & 32639;
        llIlIIIlIl[15] = (-((-2373) & 23031)) & (-2) & 32511;
        llIlIIIlIl[16] = (-4521) & 16378;
        llIlIIIlIl[17] = (-16694) & 28543;
        llIlIIIlIl[18] = (-((-4200) & 4471)) & (-20529) & 32767;
        llIlIIIlIl[19] = (55 ^ 91) ^ (158 ^ 170);
        llIlIIIlIl[20] = (-306) & 12285;
        llIlIIIlIl[21] = (-((-3147) & 7295)) & (-129) & 24511;
        llIlIIIlIl[22] = 137 ^ 143;
        llIlIIIlIl[23] = 106 ^ 126;
        llIlIIIlIl[24] = 67 ^ 70;
        llIlIIIlIl[25] = 68 ^ 75;
        llIlIIIlIl[26] = (((98 + 93) - 139) + 91) ^ (((121 + 9) - 99) + 105);
        llIlIIIlIl[27] = 105 ^ 97;
        llIlIIIlIl[28] = (115 ^ 79) ^ (74 ^ 127);
        llIlIIIlIl[29] = 112 ^ 122;
        llIlIIIlIl[30] = 130 ^ 137;
        llIlIIIlIl[31] = 41 ^ 0;
        llIlIIIlIl[32] = (90 ^ 62) ^ (46 ^ 85);
        llIlIIIlIl[33] = (28 ^ 43) ^ (184 ^ 154);
        llIlIIIlIl[34] = (-((-8994) & 26467)) & (-8453) & 60925;
        llIlIIIlIl[35] = (-22658) & 31657;
        llIlIIIlIl[36] = (-17732) & 32731;
        llIlIIIlIl[37] = (-(175 ^ 184)) & (-2113) & 27134;
        llIlIIIlIl[38] = (-((-12675) & 29099)) & (-8337) & 32767;
        llIlIIIlIl[39] = 120 ^ 80;
        llIlIIIlIl[40] = (-((-578) & 15997)) & (-16385) & 32703;
        llIlIIIlIl[41] = (241 ^ 138) ^ (220 ^ 195);
        llIlIIIlIl[42] = 54 ^ 58;
        llIlIIIlIl[43] = (40 ^ 18) ^ (168 ^ 159);
        llIlIIIlIl[44] = (-6219) & 6654;
        llIlIIIlIl[45] = (-27650) & 28089;
        llIlIIIlIl[46] = (-22957) & 24573;
        llIlIIIlIl[47] = (-((-25289) & 31721)) & (-24713) & 32765;
        llIlIIIlIl[48] = (-((-16945) & 19385)) & (-5) & 4063;
        llIlIIIlIl[49] = (-((-18353) & 24505)) & (-385) & 8159;
        llIlIIIlIl[50] = (-((-22786) & 31023)) & (-65) & 31743;
        llIlIIIlIl[51] = (-((-3585) & 15991)) & (-2) & 32767;
        llIlIIIlIl[52] = (-((-2765) & 15101)) & (-9) & 32702;
        llIlIIIlIl[53] = (-4121) & 15485;
        llIlIIIlIl[54] = (-((-9285) & 26455)) & (-4105) & 32638;
        llIlIIIlIl[55] = (-((-3201) & 19655)) & (-1025) & 28639;
        llIlIIIlIl[56] = (-((-5821) & 22525)) & (-5121) & 32767;
        llIlIIIlIl[57] = (-24581) & 27541;
        llIlIIIlIl[58] = (-((-6481) & 31604)) & (-257) & 28607;
        llIlIIIlIl[59] = 160 ^ 188;
        llIlIIIlIl[60] = (((59 + 18) - (-16)) + 54) ^ (((56 + 5) - 0) + 75);
        llIlIIIlIl[61] = (-((-18061) & 22253)) & (-1025) & 8191;
        llIlIIIlIl[62] = (-29254) & 32495;
        llIlIIIlIl[63] = 67 ^ 77;
    }

    public static void Q() {
        bv.add(new C0017d(llIlIIIlIl[18], llIlIIIlIl[1], llIlIIIlIl[34]));
        "".length();
        int[] iArr = new int[llIlIIIlIl[1]];
        iArr[llIlIIIlIl[0]] = llIlIIIlIl[7];
        if (lIllIIIIllllI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIlIl[7], llIlIIIlIl[1], llIlIIIlIl[5]));
            "".length();
        }
        int[] iArr2 = new int[llIlIIIlIl[1]];
        iArr2[llIlIIIlIl[0]] = llIlIIIlIl[8];
        if (lIllIIIIllllI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIlIl[8], llIlIIIlIl[1], llIlIIIlIl[5]));
            "".length();
        }
        int[] iArr3 = new int[llIlIIIlIl[1]];
        iArr3[llIlIIIlIl[0]] = llIlIIIlIl[9];
        if (lIllIIIIllllI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIlIl[9], llIlIIIlIl[1], llIlIIIlIl[35]));
            "".length();
        }
        int[] iArr4 = new int[llIlIIIlIl[1]];
        iArr4[llIlIIIlIl[0]] = llIlIIIlIl[10];
        if (lIllIIIIllllI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIlIl[10], llIlIIIlIl[1], llIlIIIlIl[36]));
            "".length();
        }
        int[] iArr5 = new int[llIlIIIlIl[1]];
        iArr5[llIlIIIlIl[0]] = llIlIIIlIl[11];
        if (lIllIIIIllllI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIlIl[11], llIlIIIlIl[1], llIlIIIlIl[37]));
            "".length();
        }
        if (lIllIIIIllllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIIIlII[llIlIIIlIl[43]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIlIl[20], llIlIIIlIl[24], llIlIIIlIl[37]));
            "".length();
        }
        int[] iArr6 = new int[llIlIIIlIl[1]];
        iArr6[llIlIIIlIl[0]] = llIlIIIlIl[38];
        if (lIllIIIIllllI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIlIIIlIl[38], llIlIIIlIl[39], llIlIIIlIl[40]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIIIlIl[0];
    }

    private static boolean lIllIIIIlllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIIllllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0163, code lost:
        if (lIllIIIlIIIIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ao.llIlIIIlIl[1]) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a2, code lost:
        if (lIllIIIlIIIIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ao.llIlIIIlIl[1]) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e1, code lost:
        if (lIllIIIlIIIIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ao.llIlIIIlIl[1]) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0220, code lost:
        if (lIllIIIlIIIIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ao.llIlIIIlIl[1]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x025f, code lost:
        if (lIllIIIIlllIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ao.llIlIIIlIl[1]) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0262, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ao.llIlIIIlII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ao.llIlIIIlIl[6]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ao.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.ao.llIlIIIlIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x027d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v299, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v328, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fQ() {
        if (lIllIIIIlllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[0]];
            C0015b.a(bv);
            if (lIllIIIIlllIl(bv.size(), llIlIIIlIl[1])) {
                System.out.println(llIlIIIlII[llIlIIIlIl[1]]);
                bt = llIlIIIlIl[0];
            }
        }
        if (lIllIIIIllllI(bt ? 1 : 0) && lIllIIIIlllIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[2])) {
            if (lIllIIIIllllI(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIIIIlllll(nearest) && lIllIIIIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[3]];
                    C0000a.a(nearest);
                }
                if (lIllIIIIlllll(nearest) && lIllIIIIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[4]];
                    if (lIllIIIIllllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIIIlIl[5]);
                        "".length();
                    }
                    if (lIllIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIIIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIIIlIl[6]);
                            "".length();
                        }
                        if (lIllIIIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIIIlIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[llIlIIIlIl[1]];
                        iArr[llIlIIIlIl[0]] = llIlIIIlIl[7];
                        if (lIllIIIIllllI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIlIIIlIl[1]];
                            iArr2[llIlIIIlIl[0]] = llIlIIIlIl[7];
                        }
                        int[] iArr3 = new int[llIlIIIlIl[1]];
                        iArr3[llIlIIIlIl[0]] = llIlIIIlIl[8];
                        if (lIllIIIIllllI(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIlIIIlIl[1]];
                            iArr4[llIlIIIlIl[0]] = llIlIIIlIl[8];
                        }
                        int[] iArr5 = new int[llIlIIIlIl[1]];
                        iArr5[llIlIIIlIl[0]] = llIlIIIlIl[9];
                        if (lIllIIIIllllI(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIlIIIlIl[1]];
                            iArr6[llIlIIIlIl[0]] = llIlIIIlIl[9];
                        }
                        int[] iArr7 = new int[llIlIIIlIl[1]];
                        iArr7[llIlIIIlIl[0]] = llIlIIIlIl[10];
                        if (lIllIIIIllllI(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[llIlIIIlIl[1]];
                            iArr8[llIlIIIlIl[0]] = llIlIIIlIl[10];
                        }
                        int[] iArr9 = new int[llIlIIIlIl[1]];
                        iArr9[llIlIIIlIl[0]] = llIlIIIlIl[11];
                        if (lIllIIIIllllI(Bank.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[llIlIIIlIl[1]];
                            iArr10[llIlIIIlIl[0]] = llIlIIIlIl[11];
                        }
                        C0000a.a(llIlIIIlIl[12], llIlIIIlIl[1]);
                        C0000a.a(llIlIIIlIl[13], llIlIIIlIl[1]);
                        C0000a.a(llIlIIIlIl[14], llIlIIIlIl[1]);
                        C0000a.a(llIlIIIlIl[15], llIlIIIlIl[1]);
                        C0000a.a(llIlIIIlIl[16], llIlIIIlIl[1]);
                        C0000a.a(llIlIIIlIl[17], llIlIIIlIl[1]);
                        C0000a.a(llIlIIIlIl[18], llIlIIIlIl[1]);
                        int[] iArr11 = new int[llIlIIIlIl[1]];
                        iArr11[llIlIIIlIl[0]] = llIlIIIlIl[12];
                        if (lIllIIIIllllI(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIlIIIlIl[1]];
                            iArr12[llIlIIIlIl[0]] = llIlIIIlIl[12];
                            if (lIllIIIIllllI(Equipment.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIlIIIlIl[1]];
                                iArr13[llIlIIIlIl[0]] = llIlIIIlIl[12];
                                if (lIllIIIIllllI(Bank.contains(iArr13) ? 1 : 0)) {
                                    C0000a.a(llIlIIIlIl[19], llIlIIIlIl[1]);
                                }
                            }
                        }
                        C0000a.a(llIlIIIlIl[20], llIlIIIlIl[1]);
                        C0018e.l(llIlIIIlIl[12]);
                        C0018e.l(llIlIIIlIl[13]);
                        C0018e.l(llIlIIIlIl[14]);
                        C0018e.l(llIlIIIlIl[15]);
                        C0018e.l(llIlIIIlIl[16]);
                        Time.sleepTicks(llIlIIIlIl[1]);
                        "".length();
                        C0018e.l(llIlIIIlIl[18]);
                        C0018e.l(llIlIIIlIl[21]);
                        C0018e.l(llIlIIIlIl[17]);
                        C0018e.l(llIlIIIlIl[19]);
                        C0018e.l(llIlIIIlIl[20]);
                        Time.sleepTicks(llIlIIIlIl[4]);
                        "".length();
                        if (lIllIIIIllllI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llIlIIIlIl[22]);
                            "".length();
                        }
                        if (lIllIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                            int[] iArr14 = new int[llIlIIIlIl[1]];
                            iArr14[llIlIIIlIl[0]] = llIlIIIlIl[7];
                            if (lIllIIIIlllII(Bank.contains(iArr14) ? 1 : 0)) {
                                Bank.withdraw(llIlIIIlIl[7], llIlIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIlIIIlIl[3]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[llIlIIIlIl[1]];
                                    iArr15[llIlIIIlIl[0]] = llIlIIIlIl[7];
                                    if (lIllIIIlIIIII(Inventory.getCount(iArr15))) {
                                        ?? r0 = llIlIIIlIl[1];
                                        "".length();
                                        return (-"   ".length()) >= 0 ? ((84 ^ 63) ^ (72 ^ 109)) & (((77 ^ 30) ^ (223 ^ 194)) ^ (-" ".length())) : r0;
                                    }
                                    return llIlIIIlIl[0];
                                }, llIlIIIlIl[5]);
                                "".length();
                            }
                            int[] iArr15 = new int[llIlIIIlIl[1]];
                            iArr15[llIlIIIlIl[0]] = llIlIIIlIl[8];
                            if (lIllIIIIlllII(Bank.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(llIlIIIlIl[8], llIlIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIlIIIlIl[3]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr16 = new int[llIlIIIlIl[1]];
                                    iArr16[llIlIIIlIl[0]] = llIlIIIlIl[8];
                                    if (lIllIIIlIIIII(Inventory.getCount(iArr16))) {
                                        ?? r0 = llIlIIIlIl[1];
                                        "".length();
                                        return "  ".length() < " ".length() ? ((((54 + 171) - 79) + 28) ^ (((6 + 138) - 94) + 100)) & (((187 ^ 164) ^ (173 ^ 138)) ^ (-" ".length())) : r0;
                                    }
                                    return llIlIIIlIl[0];
                                }, llIlIIIlIl[5]);
                                "".length();
                            }
                            int[] iArr16 = new int[llIlIIIlIl[1]];
                            iArr16[llIlIIIlIl[0]] = llIlIIIlIl[9];
                            if (lIllIIIIlllII(Bank.contains(iArr16) ? 1 : 0)) {
                                Bank.withdraw(llIlIIIlIl[9], llIlIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIlIIIlIl[3]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr17 = new int[llIlIIIlIl[1]];
                                    iArr17[llIlIIIlIl[0]] = llIlIIIlIl[9];
                                    if (lIllIIIlIIIII(Inventory.getCount(iArr17))) {
                                        ?? r0 = llIlIIIlIl[1];
                                        "".length();
                                        return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIlIIIlIl[0];
                                }, llIlIIIlIl[5]);
                                "".length();
                            }
                            int[] iArr17 = new int[llIlIIIlIl[1]];
                            iArr17[llIlIIIlIl[0]] = llIlIIIlIl[10];
                            if (lIllIIIIlllII(Bank.contains(iArr17) ? 1 : 0)) {
                                Bank.withdraw(llIlIIIlIl[10], llIlIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIlIIIlIl[3]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr18 = new int[llIlIIIlIl[1]];
                                    iArr18[llIlIIIlIl[0]] = llIlIIIlIl[10];
                                    if (lIllIIIlIIIII(Inventory.getCount(iArr18))) {
                                        ?? r0 = llIlIIIlIl[1];
                                        "".length();
                                        return (-" ".length()) >= 0 ? ((215 ^ 169) ^ (233 ^ 177)) & (((205 ^ 157) ^ (214 ^ 160)) ^ (-" ".length())) : r0;
                                    }
                                    return llIlIIIlIl[0];
                                }, llIlIIIlIl[5]);
                                "".length();
                            }
                            int[] iArr18 = new int[llIlIIIlIl[1]];
                            iArr18[llIlIIIlIl[0]] = llIlIIIlIl[11];
                            if (lIllIIIIlllII(Bank.contains(iArr18) ? 1 : 0)) {
                                Bank.withdraw(llIlIIIlIl[11], llIlIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIlIIIlIl[3]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr19 = new int[llIlIIIlIl[1]];
                                    iArr19[llIlIIIlIl[0]] = llIlIIIlIl[11];
                                    if (lIllIIIlIIIII(Inventory.getCount(iArr19))) {
                                        ?? r0 = llIlIIIlIl[1];
                                        "".length();
                                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIlIIIlIl[0];
                                }, llIlIIIlIl[5]);
                                "".length();
                            }
                            int[] iArr19 = new int[llIlIIIlIl[1]];
                            iArr19[llIlIIIlIl[0]] = llIlIIIlIl[18];
                            if (lIllIIIIlllII(Bank.contains(iArr19) ? 1 : 0)) {
                                Bank.withdraw(llIlIIIlIl[18], llIlIIIlIl[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIlIIIlIl[3]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr20 = new int[llIlIIIlIl[1]];
                                    iArr20[llIlIIIlIl[0]] = llIlIIIlIl[18];
                                    if (lIllIIIlIIIII(Inventory.getCount(iArr20))) {
                                        ?? r0 = llIlIIIlIl[1];
                                        "".length();
                                        return "  ".length() <= " ".length() ? ((((158 + 171) - 188) + 40) ^ (((135 + 3) - 106) + 129)) & (((177 ^ 137) ^ (84 ^ 120)) ^ (-" ".length())) : r0;
                                    }
                                    return llIlIIIlIl[0];
                                }, llIlIIIlIl[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIllIIIIlllII(an() ? 1 : 0)) {
                if (lIllIIIIllllI(Movement.isRunEnabled() ? 1 : 0) && lIllIIIlIIIlI(Movement.getRunEnergy(), llIlIIIlIl[23])) {
                    Movement.toggleRun();
                    Time.sleepTicks(llIlIIIlIl[24]);
                    "".length();
                }
                if (lIllIIIIlllII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[24]];
                    Inventory.getAll(nw).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lIllIIIIllllI(Inventory.isFull() ? 1 : 0)) {
                    if (lIllIIIIlllIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[25])) {
                        if (lIllIIIIllllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[22]];
                            Movement.walkTo(F);
                            "".length();
                            Time.sleepTicks(llIlIIIlIl[6]);
                            "".length();
                        }
                        if (lIllIIIIlllII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[26]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), ny);
                            if (lIllIIIIllllI(Players.getLocal().isAnimating() ? 1 : 0) && lIllIIIIllllI(Players.getLocal().isMoving() ? 1 : 0) && lIllIIIIlllll(nearest2)) {
                                nearest2.interact(llIlIIIlII[llIlIIIlIl[27]]);
                                Time.sleepTicks(llIlIIIlIl[3]);
                                "".length();
                            }
                        }
                    }
                    if (lIllIIIlIIIIl(Skills.getLevel(Skill.MINING), llIlIIIlIl[25])) {
                        if (lIllIIIIllllI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[28]];
                            Movement.walkTo(F);
                            "".length();
                            Time.sleepTicks(llIlIIIlIl[6]);
                            "".length();
                        }
                        if (lIllIIIIlllII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIIIlII[llIlIIIlIl[29]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), nx);
                            if (lIllIIIIllllI(Players.getLocal().isAnimating() ? 1 : 0) && lIllIIIIllllI(Players.getLocal().isMoving() ? 1 : 0) && lIllIIIIlllll(nearest3)) {
                                nearest3.interact(llIlIIIlII[llIlIIIlIl[30]]);
                                Time.sleepTicks(llIlIIIlIl[3]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static String lIllIIIIlIlll(String llllllllllllllllllIIlIIlIlllIIll, String llllllllllllllllllIIlIIlIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIlIIlIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIlIIlIlllIlIl.init(llIlIIIlIl[3], secretKeySpec);
            return new String(llllllllllllllllllIIlIIlIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIlIlllIlII) {
            llllllllllllllllllIIlIIlIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIIII(int i) {
        return i > 0;
    }

    private static boolean lIllIIIlIIIlI(int i, int i2) {
        return i > i2;
    }

    static {
        lIllIIIIllIll();
        lIllIIIIllIlI();
        nr = llIlIIIlIl[8];
        nt = llIlIIIlIl[10];
        nq = llIlIIIlIl[7];
        nv = llIlIIIlIl[18];
        nu = llIlIIIlIl[11];
        ns = llIlIIIlIl[9];
        int[] iArr = new int[llIlIIIlIl[28]];
        iArr[llIlIIIlIl[0]] = llIlIIIlIl[44];
        iArr[llIlIIIlIl[1]] = llIlIIIlIl[45];
        iArr[llIlIIIlIl[3]] = llIlIIIlIl[46];
        iArr[llIlIIIlIl[4]] = llIlIIIlIl[47];
        iArr[llIlIIIlIl[6]] = llIlIIIlIl[48];
        iArr[llIlIIIlIl[24]] = llIlIIIlIl[49];
        iArr[llIlIIIlIl[22]] = llIlIIIlIl[50];
        iArr[llIlIIIlIl[26]] = llIlIIIlIl[51];
        iArr[llIlIIIlIl[27]] = llIlIIIlIl[52];
        nw = iArr;
        bv = new ArrayList();
        int[] iArr2 = new int[llIlIIIlIl[3]];
        iArr2[llIlIIIlIl[0]] = llIlIIIlIl[53];
        iArr2[llIlIIIlIl[1]] = llIlIIIlIl[54];
        nx = iArr2;
        int[] iArr3 = new int[llIlIIIlIl[3]];
        iArr3[llIlIIIlIl[0]] = llIlIIIlIl[55];
        iArr3[llIlIIIlIl[1]] = llIlIIIlIl[56];
        ny = iArr3;
        y = new WorldArea(llIlIIIlIl[57], llIlIIIlIl[58], llIlIIIlIl[59], llIlIIIlIl[60], llIlIIIlIl[0]);
        F = new WorldPoint(llIlIIIlIl[61], llIlIIIlIl[62], llIlIIIlIl[0]);
    }

    private static boolean lIllIIIIlllII(int i) {
        return i != 0;
    }
}
