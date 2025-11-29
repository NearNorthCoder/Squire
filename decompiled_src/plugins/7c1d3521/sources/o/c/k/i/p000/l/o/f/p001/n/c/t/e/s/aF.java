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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aF  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aF.class */
public class aF implements InterfaceC0003ac {
    public static final /* synthetic */ WorldArea pz;
    public static final /* synthetic */ int pv;
    public static final /* synthetic */ WorldArea pA;
    public static final /* synthetic */ int pu;
    public static /* synthetic */ int[] ox;
    public static final /* synthetic */ int py;
    public static /* synthetic */ int[] oy;
    private static /* synthetic */ int[] lllIIlllll;
    public static final /* synthetic */ int px;
    public static /* synthetic */ List<C0017d> bv;
    public static /* synthetic */ int[] ow;
    private static /* synthetic */ String[] lllIIllllI;
    public static final /* synthetic */ WorldPoint pB;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int pw;

    public static void Q() {
        int[] iArr = new int[lllIIlllll[1]];
        iArr[lllIIlllll[0]] = lllIIlllll[7];
        if (llIIIIlllIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllll[7], lllIIlllll[1], lllIIlllll[5]));
            "".length();
        }
        int[] iArr2 = new int[lllIIlllll[1]];
        iArr2[lllIIlllll[0]] = lllIIlllll[8];
        if (llIIIIlllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllll[8], lllIIlllll[1], lllIIlllll[5]));
            "".length();
        }
        int[] iArr3 = new int[lllIIlllll[1]];
        iArr3[lllIIlllll[0]] = lllIIlllll[9];
        if (llIIIIlllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllll[9], lllIIlllll[1], lllIIlllll[26]));
            "".length();
        }
        int[] iArr4 = new int[lllIIlllll[1]];
        iArr4[lllIIlllll[0]] = lllIIlllll[10];
        if (llIIIIlllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllll[10], lllIIlllll[1], lllIIlllll[27]));
            "".length();
        }
        int[] iArr5 = new int[lllIIlllll[1]];
        iArr5[lllIIlllll[0]] = lllIIlllll[11];
        if (llIIIIlllIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllll[11], lllIIlllll[1], lllIIlllll[28]));
            "".length();
        }
        if (llIIIIlllIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIllllI[lllIIlllll[36]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllll[29], lllIIlllll[12], lllIIlllll[28]));
            "".length();
        }
        int[] iArr6 = new int[lllIIlllll[1]];
        iArr6[lllIIlllll[0]] = lllIIlllll[30];
        if (llIIIIlllIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(lllIIlllll[30], lllIIlllll[31], lllIIlllll[32]));
            "".length();
        }
    }

    private static boolean llIIIIlllIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIIlllIlII(Object obj) {
        return obj != null;
    }

    private static void llIIIIllIllll() {
        lllIIlllll = new int[53];
        lllIIlllll[0] = ((((86 + 53) - (-102)) + 6) ^ (((102 + 106) - 186) + 126)) & (((106 ^ 103) ^ (65 ^ 47)) ^ (-" ".length()));
        lllIIlllll[1] = " ".length();
        lllIIlllll[2] = (-((-12549) & 15645)) & (-16389) & 20479;
        lllIIlllll[3] = "  ".length();
        lllIIlllll[4] = "   ".length();
        lllIIlllll[5] = (-((-20140) & 28399)) & (-19477) & 32735;
        lllIIlllll[6] = 149 ^ 145;
        lllIIlllll[7] = (-10801) & 12151;
        lllIIlllll[8] = (-23059) & 24411;
        lllIIlllll[9] = (-661) & 2015;
        lllIIlllll[10] = (-((-29993) & 30505)) & (-26801) & 28669;
        lllIIlllll[11] = (-((-9515) & 28475)) & (-8193) & 28511;
        lllIIlllll[12] = (230 ^ 163) ^ (76 ^ 12);
        lllIIlllll[13] = 73 ^ 79;
        lllIIlllll[14] = 139 ^ 140;
        lllIIlllll[15] = 21 ^ 26;
        lllIIlllll[16] = (8 ^ 85) ^ (103 ^ 50);
        lllIIlllll[17] = (103 ^ 76) ^ (177 ^ 147);
        lllIIlllll[18] = (103 ^ 40) ^ (39 ^ 98);
        lllIIlllll[19] = (78 ^ 31) ^ (203 ^ 145);
        lllIIlllll[20] = (74 ^ 78) ^ (76 ^ 68);
        lllIIlllll[21] = (243 ^ 163) ^ (114 ^ 47);
        lllIIlllll[22] = (60 ^ 23) ^ (75 ^ 110);
        lllIIlllll[23] = 63 ^ 22;
        lllIIlllll[24] = 111 ^ 112;
        lllIIlllll[25] = 71 ^ 82;
        lllIIlllll[26] = (-((-8706) & 14997)) & (-16385) & 31675;
        lllIIlllll[27] = (-281) & 12280;
        lllIIlllll[28] = (-5713) & 30712;
        lllIIlllll[29] = (-4354) & 16333;
        lllIIlllll[30] = (-((-17223) & 25543)) & (-16425) & 32751;
        lllIIlllll[31] = (((144 + 54) - 92) + 60) ^ (((108 + 94) - 92) + 32);
        lllIIlllll[32] = (-15425) & 16324;
        lllIIlllll[33] = 76 ^ 40;
        lllIIlllll[34] = 63 ^ 47;
        lllIIlllll[35] = (((155 + 85) - 235) + 195) ^ (((115 + 88) - 202) + 170);
        lllIIlllll[36] = (((82 + 77) - 112) + 109) ^ (((37 + 77) - 29) + 56);
        lllIIlllll[37] = (-((-4161) & 21321)) & (-12291) & 32607;
        lllIIlllll[38] = (-20561) & 23934;
        lllIIlllll[39] = (252 ^ 176) ^ (64 ^ 33);
        lllIIlllll[40] = (-25218) & 28415;
        lllIIlllll[41] = (-((-11297) & 15595)) & (-529) & 8187;
        lllIIlllll[42] = (-25460) & 28663;
        lllIIlllll[43] = (-651) & 4015;
        lllIIlllll[44] = (-6913) & 8188;
        lllIIlllll[45] = (-((-14062) & 30703)) & (-6145) & 24063;
        lllIIlllll[46] = (-((-20879) & 23535)) & (-24705) & 28642;
        lllIIlllll[47] = (-6178) & 7463;
        lllIIlllll[48] = (-4147) & 14966;
        lllIIlllll[49] = (-((-1219) & 1755)) & (-4097) & 6143;
        lllIIlllll[50] = (-((-16885) & 27135)) & (-513) & 12283;
        lllIIlllll[51] = (-((-1065) & 25657)) & (-4609) & 30719;
        lllIIlllll[52] = (102 ^ 65) ^ (76 ^ 121);
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIIllllI[lllIIlllll[34]];
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
        if (llIIIIlllIlIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[23])) {
            int[] iArr = new int[lllIIlllll[1]];
            iArr[lllIIlllll[0]] = lllIIlllll[11];
            if (llIIIIlllIIll(Inventory.getCount(iArr))) {
                ?? r0 = lllIIlllll[1];
                "".length();
                return "   ".length() < 0 ? ((57 ^ 60) ^ (4 ^ 30)) & (((217 ^ 185) ^ (((36 + 55) - 67) + 103)) ^ (-" ".length())) : r0;
            }
            return lllIIlllll[0];
        } else if (llIIIIlllIlIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[24]) && llIIIIlllIIIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[23])) {
            int[] iArr2 = new int[lllIIlllll[1]];
            iArr2[lllIIlllll[0]] = lllIIlllll[11];
            if (llIIIIlllIIll(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lllIIlllll[1]];
                iArr3[lllIIlllll[0]] = lllIIlllll[10];
                if (llIIIIlllIIll(Inventory.getCount(iArr3))) {
                    ?? r02 = lllIIlllll[1];
                    "".length();
                    return "   ".length() >= ((9 ^ 51) ^ (94 ^ 96)) ? ((((235 + 40) - 110) + 90) ^ (((83 + 32) - 113) + 197)) & (((((106 + 56) - 35) + 24) ^ (((10 + 85) - 82) + 162)) ^ (-" ".length())) : r02;
                }
            }
            return lllIIlllll[0];
        } else if (llIIIIlllIlIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[25]) && llIIIIlllIIIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[24])) {
            int[] iArr4 = new int[lllIIlllll[1]];
            iArr4[lllIIlllll[0]] = lllIIlllll[11];
            if (llIIIIlllIIll(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[lllIIlllll[1]];
                iArr5[lllIIlllll[0]] = lllIIlllll[10];
                if (llIIIIlllIIll(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[lllIIlllll[1]];
                    iArr6[lllIIlllll[0]] = lllIIlllll[9];
                    if (llIIIIlllIIll(Inventory.getCount(iArr6))) {
                        ?? r03 = lllIIlllll[1];
                        "".length();
                        return (((((29 + 1) - (-138)) + 82) ^ (((119 + 24) - 53) + 86)) & (((17 ^ 9) ^ (238 ^ 188)) ^ (-" ".length()))) > 0 ? ((58 ^ 111) ^ (89 ^ 2)) & (((((95 + 175) - 100) + 14) ^ (((88 + 24) - (-68)) + 2)) ^ (-" ".length())) : r03;
                    }
                }
            }
            return lllIIlllll[0];
        } else if (llIIIIlllIlIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[13]) && llIIIIlllIIIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[25])) {
            int[] iArr7 = new int[lllIIlllll[1]];
            iArr7[lllIIlllll[0]] = lllIIlllll[11];
            if (llIIIIlllIIll(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[lllIIlllll[1]];
                iArr8[lllIIlllll[0]] = lllIIlllll[10];
                if (llIIIIlllIIll(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[lllIIlllll[1]];
                    iArr9[lllIIlllll[0]] = lllIIlllll[9];
                    if (llIIIIlllIIll(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[lllIIlllll[1]];
                        iArr10[lllIIlllll[0]] = lllIIlllll[8];
                        if (llIIIIlllIIll(Inventory.getCount(iArr10))) {
                            ?? r04 = lllIIlllll[1];
                            "".length();
                            return ((181 ^ 188) ^ (90 ^ 87)) <= 0 ? ((((177 + 108) - 227) + 125) ^ (((120 + 49) - 70) + 48)) & (((29 ^ 71) ^ (50 ^ 76)) ^ (-" ".length())) : r04;
                        }
                    }
                }
            }
            return lllIIlllll[0];
        } else {
            int[] iArr11 = new int[lllIIlllll[1]];
            iArr11[lllIIlllll[0]] = lllIIlllll[11];
            if (llIIIIlllIIll(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[lllIIlllll[1]];
                iArr12[lllIIlllll[0]] = lllIIlllll[10];
                if (llIIIIlllIIll(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[lllIIlllll[1]];
                    iArr13[lllIIlllll[0]] = lllIIlllll[9];
                    if (llIIIIlllIIll(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[lllIIlllll[1]];
                        iArr14[lllIIlllll[0]] = lllIIlllll[8];
                        if (llIIIIlllIIll(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[lllIIlllll[1]];
                            iArr15[lllIIlllll[0]] = lllIIlllll[7];
                            if (llIIIIlllIIll(Inventory.getCount(iArr15))) {
                                ?? r05 = lllIIlllll[1];
                                "".length();
                                return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? ((187 ^ 170) ^ (25 ^ 17)) & (((((65 + 61) - 28) + 47) ^ (((113 + 94) - 111) + 40)) ^ (-" ".length())) : r05;
                            }
                        }
                    }
                }
            }
            return lllIIlllll[0];
        }
    }

    static {
        llIIIIllIllll();
        llIIIIllIlllI();
        py = lllIIlllll[11];
        pw = lllIIlllll[9];
        pv = lllIIlllll[8];
        px = lllIIlllll[10];
        pu = lllIIlllll[7];
        pz = new WorldArea(lllIIlllll[37], lllIIlllll[38], lllIIlllll[34], lllIIlllll[39], lllIIlllll[0]);
        pA = new WorldArea(lllIIlllll[40], lllIIlllll[41], lllIIlllll[22], lllIIlllll[34], lllIIlllll[0]);
        pB = new WorldPoint(lllIIlllll[42], lllIIlllll[43], lllIIlllll[0]);
        int[] iArr = new int[lllIIlllll[6]];
        iArr[lllIIlllll[0]] = lllIIlllll[44];
        iArr[lllIIlllll[1]] = lllIIlllll[45];
        iArr[lllIIlllll[3]] = lllIIlllll[46];
        iArr[lllIIlllll[4]] = lllIIlllll[47];
        ow = iArr;
        int[] iArr2 = new int[lllIIlllll[1]];
        iArr2[lllIIlllll[0]] = lllIIlllll[48];
        ox = iArr2;
        int[] iArr3 = new int[lllIIlllll[4]];
        iArr3[lllIIlllll[0]] = lllIIlllll[49];
        iArr3[lllIIlllll[1]] = lllIIlllll[50];
        iArr3[lllIIlllll[3]] = lllIIlllll[51];
        oy = iArr3;
        bv = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIlllll[0];
    }

    private static void llIIIIllIlllI() {
        lllIIllllI = new String[lllIIlllll[52]];
        lllIIllllI[lllIIlllll[0]] = llIIIIllIlIll("uOTmFcKCLOSOvv5YHRg7cw==", "GwsaT");
        lllIIllllI[lllIIlllll[1]] = llIIIIllIllII("Z2imLIENr0lJ5vbiSgfrh5BWRB9MO+tmEczMumNZwJJoy0GGCjPC/H9GlFc0RUdpFSOedzY2lm8=", "TRlcU");
        lllIIllllI[lllIIlllll[3]] = llIIIIllIllII("k3SemoywbYuha10/fo/t5AJ+IhwRtlej", "fJfId");
        lllIIllllI[lllIIlllll[4]] = llIIIIllIllII("HcHURZ/0n91H8BB4nfZYtg==", "mhqNc");
        lllIIllllI[lllIIlllll[6]] = llIIIIllIllIl("KS8CBw0IIAtDAwAgBwoPBg==", "aNlca");
        lllIIllllI[lllIIlllll[12]] = llIIIIllIllIl("NTBHOAEHdQowABE8CT5TEjwEMhIaMBR1UxEiDi0QCjwJPlMWOkcbJjscKR4=", "bUgYs");
        lllIIllllI[lllIIlllll[13]] = llIIIIllIllII("jhwRXuQieAAKj5BzOoP+6g==", "zfrbc");
        lllIIllllI[lllIIlllll[14]] = llIIIIllIllII("M8mflICotHf3cm7JtjS+DA==", "HYpRc");
        lllIIllllI[lllIIlllll[16]] = llIIIIllIllII("T9tD+oK1/MjZkYLuFGGqgg3K18ezkrci", "ykbmZ");
        lllIIllllI[lllIIlllll[17]] = llIIIIllIllII("D9kTkXt3kE/sPbvJkIp7mw==", "gRuGi");
        lllIIllllI[lllIIlllll[18]] = llIIIIllIlIll("LeSfsc/Dmw3MHU1EKwO5xQ==", "nqytH");
        lllIIllllI[lllIIlllll[19]] = llIIIIllIllIl("JQEBP0gCBhkh", "finOh");
        lllIIllllI[lllIIlllll[20]] = llIIIIllIllIl("Ogo2OCIDDHonJE0EOzhrGRk/Njg=", "mkZSK");
        lllIIllllI[lllIIlllll[21]] = llIIIIllIlIll("jbVJurfkcGTbqlzq856Lpg==", "ysfUo");
        lllIIllllI[lllIIlllll[22]] = llIIIIllIllIl("Ihs1IigIHT1yNwAYej43BgA=", "asZRX");
        lllIIllllI[lllIIlllll[15]] = llIIIIllIllII("MmH+l5LBUGFRcjoIQZnUzA==", "rIqet");
        lllIIllllI[lllIIlllll[34]] = llIIIIllIllII("044HI1bX+JOdFscDLBxReQ==", "xwqNM");
        lllIIllllI[lllIIlllll[36]] = llIIIIllIllIl("GgstAG4HBGMQKwkONw9uQA==", "hbCgN");
    }

    private static boolean llIIIIlllIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (llIIIIlllIlIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[35])) {
            ?? r0 = lllIIlllll[1];
            "".length();
            return 0 != 0 ? ((93 ^ 103) ^ (88 ^ 40)) & (((((182 + 81) - 241) + 203) ^ (((148 + 147) - 180) + 56)) ^ (-" ".length())) : r0;
        }
        return lllIIlllll[0];
    }

    private static String llIIIIllIlIll(String lllllllllllllllllIlllIIIlIlIIlll, String lllllllllllllllllIlllIIIlIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), lllIIlllll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIIIlIlIlIII) {
            lllllllllllllllllIlllIIIlIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIIIIllIllIl(String lllllllllllllllllIlllIIIlIllllII, String lllllllllllllllllIlllIIIlIlllIll) {
        String lllllllllllllllllIlllIIIlIllllII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIIIlIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllIIIlIlllIlI = new StringBuilder();
        char[] charArray = lllllllllllllllllIlllIIIlIlllIll.toCharArray();
        int lllllllllllllllllIlllIIIlIllIIll = lllIIlllll[0];
        char[] charArray2 = lllllllllllllllllIlllIIIlIllllII2.toCharArray();
        int length = charArray2.length;
        int i = lllIIlllll[0];
        while (llIIIIlllIIIl(i, length)) {
            lllllllllllllllllIlllIIIlIlllIlI.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIlllIIIlIllIIll % charArray.length]));
            "".length();
            lllllllllllllllllIlllIIIlIllIIll++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlllIIIlIlllIlI);
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        gs();
        return lllIIlllll[33];
    }

    private static String llIIIIllIllII(String lllllllllllllllllIlllIIIllIIllII, String lllllllllllllllllIlllIIIllIIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIlllIIIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIlllll[3], lllllllllllllllllIlllIIIllIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIIIllIIllIl) {
            lllllllllllllllllIlllIIIllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlllIIll(int i) {
        return i > 0;
    }

    private static boolean llIIIIlllIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (llIIIIlllIIll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
        if (llIIIIlllIlIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aF.lllIIlllll[1]) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ba, code lost:
        if (llIIIIlllIlIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aF.lllIIlllll[1]) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f9, code lost:
        if (llIIIIlllIlIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aF.lllIIlllll[1]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
        if (llIIIIlllIlIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aF.lllIIlllll[1]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0277, code lost:
        if (llIIIIlllIIIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aF.lllIIlllll[1]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027a, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aF.lllIIllllI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aF.lllIIlllll[12]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aF.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aF.lllIIlllll[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0295, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v251, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gs() {
        if (llIIIIlllIIII(bt ? 1 : 0)) {
            AccBuilderSotf.c = lllIIllllI[lllIIlllll[0]];
            C0015b.a(bv);
            if (llIIIIlllIIIl(bv.size(), lllIIlllll[1])) {
                System.out.println(lllIIllllI[lllIIlllll[1]]);
                bt = lllIIlllll[0];
            }
        }
        if (llIIIIlllIIlI(bt ? 1 : 0)) {
            if (llIIIIlllIIII(an() ? 1 : 0)) {
                int[] iArr = new int[lllIIlllll[1]];
                iArr[lllIIlllll[0]] = lllIIlllll[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (llIIIIlllIlII(nearest) && llIIIIlllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = lllIIllllI[lllIIlllll[3]];
                C0000a.a(nearest);
            }
            if (llIIIIlllIlII(nearest) && llIIIIlllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (llIIIIlllIIlI(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIllllI[lllIIlllll[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lllIIlllll[5]);
                    "".length();
                }
                if (llIIIIlllIIII(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIllllI[lllIIlllll[6]];
                    if (llIIIIlllIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lllIIlllll[6]);
                        "".length();
                    }
                    if (llIIIIlllIIll(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lllIIlllll[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lllIIlllll[1]];
                    iArr2[lllIIlllll[0]] = lllIIlllll[7];
                    if (llIIIIlllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lllIIlllll[1]];
                        iArr3[lllIIlllll[0]] = lllIIlllll[7];
                    }
                    int[] iArr4 = new int[lllIIlllll[1]];
                    iArr4[lllIIlllll[0]] = lllIIlllll[8];
                    if (llIIIIlllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lllIIlllll[1]];
                        iArr5[lllIIlllll[0]] = lllIIlllll[8];
                    }
                    int[] iArr6 = new int[lllIIlllll[1]];
                    iArr6[lllIIlllll[0]] = lllIIlllll[9];
                    if (llIIIIlllIIlI(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllIIlllll[1]];
                        iArr7[lllIIlllll[0]] = lllIIlllll[9];
                    }
                    int[] iArr8 = new int[lllIIlllll[1]];
                    iArr8[lllIIlllll[0]] = lllIIlllll[10];
                    if (llIIIIlllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lllIIlllll[1]];
                        iArr9[lllIIlllll[0]] = lllIIlllll[10];
                    }
                    int[] iArr10 = new int[lllIIlllll[1]];
                    iArr10[lllIIlllll[0]] = lllIIlllll[11];
                    if (llIIIIlllIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIIlllll[1]];
                        iArr11[lllIIlllll[0]] = lllIIlllll[11];
                    }
                    int[] iArr12 = new int[lllIIlllll[1]];
                    iArr12[lllIIlllll[0]] = lllIIlllll[7];
                    if (llIIIIlllIIII(Bank.contains(iArr12) ? 1 : 0)) {
                        Bank.withdraw(lllIIlllll[7], lllIIlllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIlllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr13 = new int[lllIIlllll[1]];
                            iArr13[lllIIlllll[0]] = lllIIlllll[7];
                            if (llIIIIlllIIll(Inventory.getCount(iArr13))) {
                                ?? r0 = lllIIlllll[1];
                                "".length();
                                return "   ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlllll[0];
                        }, lllIIlllll[5]);
                        "".length();
                    }
                    int[] iArr13 = new int[lllIIlllll[1]];
                    iArr13[lllIIlllll[0]] = lllIIlllll[8];
                    if (llIIIIlllIIII(Bank.contains(iArr13) ? 1 : 0)) {
                        Bank.withdraw(lllIIlllll[8], lllIIlllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIlllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lllIIlllll[1]];
                            iArr14[lllIIlllll[0]] = lllIIlllll[8];
                            if (llIIIIlllIIll(Inventory.getCount(iArr14))) {
                                ?? r0 = lllIIlllll[1];
                                "".length();
                                return (-((((161 + 180) - 257) + 114) ^ (((37 + 16) - (-9)) + 132))) >= 0 ? ((91 ^ 122) ^ (48 ^ 67)) & (((234 ^ 175) ^ (161 ^ 182)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlllll[0];
                        }, lllIIlllll[5]);
                        "".length();
                    }
                    int[] iArr14 = new int[lllIIlllll[1]];
                    iArr14[lllIIlllll[0]] = lllIIlllll[9];
                    if (llIIIIlllIIII(Bank.contains(iArr14) ? 1 : 0)) {
                        Bank.withdraw(lllIIlllll[9], lllIIlllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIlllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[lllIIlllll[1]];
                            iArr15[lllIIlllll[0]] = lllIIlllll[9];
                            if (llIIIIlllIIll(Inventory.getCount(iArr15))) {
                                ?? r0 = lllIIlllll[1];
                                "".length();
                                return 0 != 0 ? ((118 ^ 111) ^ (103 ^ 38)) & (((130 ^ 150) ^ (26 ^ 86)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlllll[0];
                        }, lllIIlllll[5]);
                        "".length();
                    }
                    int[] iArr15 = new int[lllIIlllll[1]];
                    iArr15[lllIIlllll[0]] = lllIIlllll[10];
                    if (llIIIIlllIIII(Bank.contains(iArr15) ? 1 : 0)) {
                        Bank.withdraw(lllIIlllll[10], lllIIlllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIlllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lllIIlllll[1]];
                            iArr16[lllIIlllll[0]] = lllIIlllll[10];
                            if (llIIIIlllIIll(Inventory.getCount(iArr16))) {
                                ?? r0 = lllIIlllll[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlllll[0];
                        }, lllIIlllll[5]);
                        "".length();
                    }
                    int[] iArr16 = new int[lllIIlllll[1]];
                    iArr16[lllIIlllll[0]] = lllIIlllll[11];
                    if (llIIIIlllIIII(Bank.contains(iArr16) ? 1 : 0)) {
                        Bank.withdraw(lllIIlllll[11], lllIIlllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIIlllll[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr17 = new int[lllIIlllll[1]];
                            iArr17[lllIIlllll[0]] = lllIIlllll[11];
                            if (llIIIIlllIIll(Inventory.getCount(iArr17))) {
                                ?? r0 = lllIIlllll[1];
                                "".length();
                                return (-" ".length()) == (106 ^ 110) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlllll[0];
                        }, lllIIlllll[5]);
                        "".length();
                    }
                }
            }
            if (llIIIIlllIIII(an() ? 1 : 0)) {
                if (llIIIIlllIIII(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIllllI[lllIIlllll[13]];
                    System.out.println(lllIIllllI[lllIIlllll[14]]);
                    Inventory.getAll(oy).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (llIIIIlllIIlI(Inventory.isFull() ? 1 : 0)) {
                    if (llIIIIlllIIIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[15])) {
                        if (llIIIIlllIIlI(pz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[16]];
                            Movement.walkTo(pz.toWorldPoint());
                            "".length();
                            Time.sleepTicks(lllIIlllll[6]);
                            "".length();
                        }
                        if (llIIIIlllIIII(pz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[17]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), ow);
                            if (llIIIIlllIIlI(Players.getLocal().isAnimating() ? 1 : 0) && llIIIIlllIIlI(Players.getLocal().isMoving() ? 1 : 0) && llIIIIlllIlII(nearest2)) {
                                System.out.println(lllIIllllI[lllIIlllll[18]]);
                                nearest2.interact(lllIIllllI[lllIIlllll[19]]);
                                Time.sleepTicks(lllIIlllll[4]);
                                "".length();
                            }
                        }
                    }
                    if (llIIIIlllIlIl(Skills.getLevel(Skill.WOODCUTTING), lllIIlllll[15])) {
                        if (llIIIIlllIIlI(pA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[20]];
                            Movement.walkTo(pB);
                            "".length();
                            Time.sleepTicks(lllIIlllll[6]);
                            "".length();
                        }
                        if (llIIIIlllIIII(pA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIllllI[lllIIlllll[21]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), ox);
                            if (llIIIIlllIIlI(Players.getLocal().isAnimating() ? 1 : 0) && llIIIIlllIIlI(Players.getLocal().isMoving() ? 1 : 0) && llIIIIlllIlII(nearest3)) {
                                System.out.println(lllIIllllI[lllIIlllll[22]]);
                                nearest3.interact(lllIIllllI[lllIIlllll[15]]);
                                Time.sleepTicks(lllIIlllll[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }
}
