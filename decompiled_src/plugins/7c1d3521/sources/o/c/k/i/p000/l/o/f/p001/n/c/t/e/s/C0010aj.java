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
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aj  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aj.class */
public class C0010aj implements InterfaceC0003ac {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lllIIlIlII;
    private static /* synthetic */ String[] lllIIlIIll;
    public static /* synthetic */ List<C0017d> bv;

    private static boolean llIIIIIlIIIll(int i, int i2) {
        return i != i2;
    }

    private static int fM() {
        return llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8]) ? ((lllIIlIlII[26] - Skills.getExperience(Skill.HERBLORE)) / lllIIlIlII[28]) + lllIIlIlII[16] : (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8]) && llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[12])) ? ((lllIIlIlII[27] - Skills.getExperience(Skill.HERBLORE)) / lllIIlIlII[29]) + lllIIlIlII[30] : lllIIlIlII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    private static boolean fN() {
        if (llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8])) {
            int[] iArr = new int[lllIIlIlII[1]];
            iArr[lllIIlIlII[0]] = lllIIlIlII[9];
            if (llIIIIIIlllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIlIlII[1]];
                iArr2[lllIIlIlII[0]] = lllIIlIlII[11];
                if (llIIIIIIlllII(Bank.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = lllIIlIlII[1];
                    "".length();
                    return (-((0 ^ 9) ^ (120 ^ 117))) >= 0 ? ("   ".length() ^ (118 ^ 89)) & (((((26 + 149) - 71) + 129) ^ (((115 + 163) - 274) + 193)) ^ (-" ".length())) : r0;
                }
            }
            return lllIIlIlII[0];
        } else if (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8]) && llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[12])) {
            int[] iArr3 = new int[lllIIlIlII[1]];
            iArr3[lllIIlIlII[0]] = lllIIlIlII[13];
            if (llIIIIIIlllII(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIIlIlII[1]];
                iArr4[lllIIlIlII[0]] = lllIIlIlII[14];
                if (llIIIIIIlllII(Bank.contains(iArr4) ? 1 : 0)) {
                    ?? r02 = lllIIlIlII[1];
                    "".length();
                    return " ".length() <= 0 ? ((115 ^ 54) ^ (109 ^ 8)) & (((((172 + 190) - 230) + 59) ^ (((36 + 13) - (-51)) + 59)) ^ (-" ".length())) : r02;
                }
            }
            return lllIIlIlII[0];
        } else if (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[12])) {
            int[] iArr5 = new int[lllIIlIlII[1]];
            iArr5[lllIIlIlII[0]] = lllIIlIlII[9];
            if (llIIIIIIlllII(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIIlIlII[1]];
                iArr6[lllIIlIlII[0]] = lllIIlIlII[15];
                if (llIIIIIIlllII(Bank.contains(iArr6) ? 1 : 0)) {
                    ?? r03 = lllIIlIlII[1];
                    "".length();
                    return "   ".length() < 0 ? "   ".length() & ("   ".length() ^ (-1)) : r03;
                }
            }
            return lllIIlIlII[0];
        } else {
            return lllIIlIlII[0];
        }
    }

    static {
        llIIIIIIllIll();
        llIIIIIIllIlI();
        bv = new ArrayList();
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        fL();
        return lllIIlIlII[23];
    }

    private static void llIIIIIIllIll() {
        lllIIlIlII = new int[36];
        lllIIlIlII[0] = (28 ^ 17) & ((65 ^ 76) ^ (-1));
        lllIIlIlII[1] = " ".length();
        lllIIlIlII[2] = 177 ^ 153;
        lllIIlIlII[3] = (158 ^ 132) ^ (75 ^ 1);
        lllIIlIlII[4] = (101 ^ 34) ^ (93 ^ 30);
        lllIIlIlII[5] = "  ".length();
        lllIIlIlII[6] = "   ".length();
        lllIIlIlII[7] = (-((-8970) & 28495)) & (-49) & 24573;
        lllIIlIlII[8] = (((71 + 108) - 73) + 82) ^ (((90 + 84) - 143) + 135);
        lllIIlIlII[9] = ((27 + 104) - 38) + 128;
        lllIIlIlII[10] = (236 ^ 160) ^ (219 ^ 153);
        lllIIlIlII[11] = (30 ^ 12) ^ (50 ^ 123);
        lllIIlIlII[12] = 81 ^ 124;
        lllIIlIlII[13] = (-8201) & 10175;
        lllIIlIlII[14] = 78 ^ 47;
        lllIIlIlII[15] = 34 ^ 71;
        lllIIlIlII[16] = (((112 + 98) - 186) + 135) ^ (((8 + 47) - 54) + 153);
        lllIIlIlII[17] = (-13954) & 14223;
        lllIIlIlII[18] = 190 ^ 179;
        lllIIlIlII[19] = (-5636) & 30635;
        lllIIlIlII[20] = (-((-577) & 30275)) & (-6) & 30703;
        lllIIlIlII[21] = 51 ^ 39;
        lllIIlIlII[22] = (-16912) & 17311;
        lllIIlIlII[23] = " ".length() ^ (27 ^ 126);
        lllIIlIlII[24] = (-((-20643) & 22699)) & (-13442) & 16347;
        lllIIlIlII[25] = (-((-16905) & 31418)) & (-65) & 16377;
        lllIIlIlII[26] = (-21641) & 30380;
        lllIIlIlII[27] = (-2824) & 64335;
        lllIIlIlII[28] = 1 ^ 24;
        lllIIlIlII[29] = 227 ^ 160;
        lllIIlIlII[30] = (238 ^ 174) ^ (138 ^ 197);
        lllIIlIlII[31] = (4 ^ 21) ^ (149 ^ 130);
        lllIIlIlII[32] = (((141 + 1) - 99) + 118) ^ (((82 + 31) - 63) + 116);
        lllIIlIlII[33] = (226 ^ 191) ^ (236 ^ 185);
        lllIIlIlII[34] = 162 ^ 171;
        lllIIlIlII[35] = (242 ^ 149) ^ (207 ^ 162);
    }

    private static String llIIIIIIllIII(String lllllllllllllllllIlllIlIlllllIIl, String lllllllllllllllllIlllIlIlllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIlIlII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIlIlllllIlI) {
            lllllllllllllllllIlllIlIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIIIIlllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIlIlII[0];
    }

    private static String llIIIIIIlIlll(String lllllllllllllllllIlllIllIIIIlllI, String lllllllllllllllllIlllIllIIIIllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIllIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlllIllIIIIllIl.toCharArray();
        int lllllllllllllllllIlllIllIIIIlIlI = lllIIlIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIIlIlII[0];
        while (llIIIIIIlllIl(i, length)) {
            char lllllllllllllllllIlllIllIIIIllll = charArray2[i];
            sb.append((char) (lllllllllllllllllIlllIllIIIIllll ^ charArray[lllllllllllllllllIlllIllIIIIlIlI % charArray.length]));
            "".length();
            lllllllllllllllllIlllIllIIIIlIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    private static boolean an() {
        if (llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8])) {
            int[] iArr = new int[lllIIlIlII[1]];
            iArr[lllIIlIlII[0]] = lllIIlIlII[9];
            if (llIIIIIIlllII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIlIlII[1]];
                iArr2[lllIIlIlII[0]] = lllIIlIlII[11];
                if (llIIIIIIlllII(Inventory.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = lllIIlIlII[1];
                    "".length();
                    return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lllIIlIlII[0];
        } else if (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8]) && llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[12])) {
            int[] iArr3 = new int[lllIIlIlII[1]];
            iArr3[lllIIlIlII[0]] = lllIIlIlII[13];
            if (llIIIIIIlllII(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIIlIlII[1]];
                iArr4[lllIIlIlII[0]] = lllIIlIlII[14];
                if (llIIIIIIlllII(Inventory.contains(iArr4) ? 1 : 0)) {
                    ?? r02 = lllIIlIlII[1];
                    "".length();
                    return ((((93 + 36) - 77) + 103) ^ (((4 + 14) - (-49)) + 92)) < (-" ".length()) ? ((170 ^ 188) ^ (241 ^ 170)) & (((((114 + 12) - (-49)) + 80) ^ (((29 + 93) - 71) + 127)) ^ (-" ".length())) : r02;
                }
            }
            return lllIIlIlII[0];
        } else if (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[12])) {
            int[] iArr5 = new int[lllIIlIlII[1]];
            iArr5[lllIIlIlII[0]] = lllIIlIlII[9];
            if (llIIIIIIlllII(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIIlIlII[1]];
                iArr6[lllIIlIlII[0]] = lllIIlIlII[15];
                if (llIIIIIIlllII(Inventory.contains(iArr6) ? 1 : 0)) {
                    ?? r03 = lllIIlIlII[1];
                    "".length();
                    return ("  ".length() & ("  ".length() ^ (-" ".length()))) < 0 ? ((168 ^ 167) ^ (68 ^ 3)) & (((67 ^ 117) ^ (79 ^ 49)) ^ (-" ".length())) : r03;
                }
            }
            return lllIIlIlII[0];
        } else {
            return lllIIlIlII[0];
        }
    }

    private static boolean llIIIIIIllllI(int i) {
        return i == 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIIlIIll[lllIIlIlII[31]];
    }

    private static boolean llIIIIIlIIIIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[2])) {
            ?? r0 = lllIIlIlII[1];
            "".length();
            return "  ".length() <= " ".length() ? ((((85 + 73) - (-11)) + 15) ^ (((63 + 128) - 182) + 131)) & (((((18 + 138) - 71) + 92) ^ (((58 + 72) - 32) + 35)) ^ (-" ".length())) : r0;
        }
        return lllIIlIlII[0];
    }

    public static void Q() {
        if (llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8])) {
            int[] iArr = new int[lllIIlIlII[1]];
            iArr[lllIIlIlII[0]] = lllIIlIlII[9];
            if (llIIIIIIllllI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIlII[9], lllIIlIlII[20], lllIIlIlII[21]));
                "".length();
            }
            int[] iArr2 = new int[lllIIlIlII[1]];
            iArr2[lllIIlIlII[0]] = lllIIlIlII[11];
            if (llIIIIIIllllI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIlII[11], fM(), lllIIlIlII[22]));
                "".length();
            }
        }
        if (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8]) && llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[12])) {
            int[] iArr3 = new int[lllIIlIlII[1]];
            iArr3[lllIIlIlII[0]] = lllIIlIlII[13];
            if (llIIIIIIllllI(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIlII[13], fM(), lllIIlIlII[23]));
                "".length();
            }
            int[] iArr4 = new int[lllIIlIlII[1]];
            iArr4[lllIIlIlII[0]] = lllIIlIlII[14];
            if (llIIIIIIllllI(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIlII[14], fM(), lllIIlIlII[24]));
                "".length();
            }
        }
        if (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[12])) {
            int[] iArr5 = new int[lllIIlIlII[1]];
            iArr5[lllIIlIlII[0]] = lllIIlIlII[9];
            if (llIIIIIIllllI(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIlII[9], lllIIlIlII[20], lllIIlIlII[21]));
                "".length();
            }
            int[] iArr6 = new int[lllIIlIlII[1]];
            iArr6[lllIIlIlII[0]] = lllIIlIlII[15];
            if (llIIIIIIllllI(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIlII[15], lllIIlIlII[20], lllIIlIlII[25]));
                "".length();
            }
        }
    }

    private static boolean llIIIIIIlllIl(int i, int i2) {
        return i < i2;
    }

    private static void llIIIIIIllIlI() {
        lllIIlIIll = new String[lllIIlIlII[35]];
        lllIIlIIll[lllIIlIlII[0]] = llIIIIIIlIlll("IxM0DCEGRiQRKgwV", "afMeO");
        lllIIlIIll[lllIIlIlII[1]] = llIIIIIIlIlll("Hi46Gx4wIjBSDy0+PRwKeC4gFwAra3QBGjEzNxoENiB0EAw7LHQGAngvMQAPNCgmFw==", "XGTrm");
        lllIIlIIll[lllIIlIlII[5]] = llIIIIIIllIII("CuMwg/RrMcWdEmHyjfrBHPFYH/F6+fHa", "LJSvE");
        lllIIlIIll[lllIIlIlII[6]] = llIIIIIIllIII("dtQRWIAgxMTpTM65ZJoMNy94U4PT+69u", "TaABx");
        lllIIlIIll[lllIIlIlII[4]] = llIIIIIIllIIl("eohisk/f7z0K7kiRyu2b5BX7eb+hWwPDWqPZ62/7DGQN8/i8u2kge+zU/9yurU71", "TTOIU");
        lllIIlIIll[lllIIlIlII[16]] = llIIIIIIllIII("hJkP+CxA4x1ANXV4AK7Tyg==", "UxHHw");
        lllIIlIIll[lllIIlIlII[31]] = llIIIIIIllIIl("y2q3JlSM2YlSkPKSV7jFbg==", "CogyR");
        lllIIlIIll[lllIIlIlII[32]] = llIIIIIIllIIl("GeVp3LPU9L0=", "wOKhT");
        lllIIlIIll[lllIIlIlII[33]] = llIIIIIIllIIl("JQ+2mZcF5Ck=", "BIfcL");
        lllIIlIIll[lllIIlIlII[34]] = llIIIIIIllIIl("DEEwxMDJXYs=", "KmWyu");
    }

    private static boolean llIIIIIIlllll(int i, int i2) {
        return i == i2;
    }

    private static String llIIIIIIllIIl(String lllllllllllllllllIlllIllIIIllllI, String lllllllllllllllllIlllIllIIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllllIlllIllIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIllIIIlllIl.getBytes(StandardCharsets.UTF_8)), lllIIlIlII[33]), "DES");
            Cipher lllllllllllllllllIlllIllIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllllIlllIllIIlIIIII.init(lllIIlIlII[5], lllllllllllllllllIlllIllIIlIIIIl);
            return new String(lllllllllllllllllIlllIllIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIllIIIlllll) {
            lllllllllllllllllIlllIllIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIIIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0452, code lost:
        if (llIIIIIIlllll(net.unethicalite.api.items.Inventory.getAll(r0).size(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0010aj.lllIIlIlII[1]) != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v170, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v191, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fL() {
        if (llIIIIIIlllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIIll[lllIIlIlII[0]];
            C0015b.a(bv);
            if (llIIIIIIlllIl(bv.size(), lllIIlIlII[1])) {
                System.out.println(lllIIlIIll[lllIIlIlII[1]]);
                bt = lllIIlIlII[0];
            }
        }
        if (llIIIIIIllllI(bt ? 1 : 0) && llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[2])) {
            if (llIIIIIIlllIl(C0018e.j(lllIIlIlII[3]), lllIIlIlII[4])) {
                C0039z.bt();
            }
            if (llIIIIIIllllI(an() ? 1 : 0) && llIIIIIIlllll(C0018e.j(lllIIlIlII[3]), lllIIlIlII[4])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIIlIIIII(nearest) && llIIIIIIllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIll[lllIIlIlII[5]];
                    C0000a.a(nearest);
                }
                if (llIIIIIlIIIII(nearest) && llIIIIIIlllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIIll[lllIIlIlII[6]];
                    if (llIIIIIIllllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIlIlII[7]);
                        "".length();
                    }
                    if (llIIIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                        if (llIIIIIlIIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIlIlII[6]);
                            "".length();
                        }
                        if (llIIIIIIllllI(fN() ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIlIIll[lllIIlIlII[4]]);
                            bt = lllIIlIlII[1];
                            return;
                        }
                        if (llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8])) {
                            C0000a.a(lllIIlIlII[9], lllIIlIlII[10]);
                            C0000a.a(lllIIlIlII[11], lllIIlIlII[10]);
                        }
                        if (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[8]) && llIIIIIIlllIl(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[12])) {
                            C0000a.a(lllIIlIlII[13], lllIIlIlII[10]);
                            C0000a.a(lllIIlIlII[14], lllIIlIlII[10]);
                        }
                        if (llIIIIIlIIIlI(Skills.getLevel(Skill.HERBLORE), lllIIlIlII[12])) {
                            C0000a.a(lllIIlIlII[9], lllIIlIlII[10]);
                            C0000a.a(lllIIlIlII[15], lllIIlIlII[10]);
                        }
                    }
                }
            }
            if (llIIIIIIlllII(an() ? 1 : 0)) {
                if (llIIIIIIlllII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (llIIIIIIlllII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                AccBuilderSotf.c = lllIIlIIll[lllIIlIlII[16]];
                int[] iArr = new int[lllIIlIlII[1]];
                iArr[lllIIlIlII[0]] = lllIIlIlII[9];
                if (llIIIIIIlllII(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIIlIlII[1]];
                    iArr2[lllIIlIlII[0]] = lllIIlIlII[11];
                    if (llIIIIIIlllII(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lllIIlIlII[1]];
                        iArr3[lllIIlIlII[0]] = lllIIlIlII[9];
                        Item first = Inventory.getFirst(iArr3);
                        int[] iArr4 = new int[lllIIlIlII[1]];
                        iArr4[lllIIlIlII[0]] = lllIIlIlII[11];
                        first.useOn(Inventory.getFirst(iArr4));
                        Time.sleepTicks(lllIIlIlII[1]);
                        "".length();
                    }
                }
                int[] iArr5 = new int[lllIIlIlII[1]];
                iArr5[lllIIlIlII[0]] = lllIIlIlII[13];
                if (llIIIIIIlllII(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllIIlIlII[1]];
                    iArr6[lllIIlIlII[0]] = lllIIlIlII[14];
                    if (llIIIIIIlllII(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllIIlIlII[1]];
                        iArr7[lllIIlIlII[0]] = lllIIlIlII[13];
                        Item first2 = Inventory.getFirst(iArr7);
                        int[] iArr8 = new int[lllIIlIlII[1]];
                        iArr8[lllIIlIlII[0]] = lllIIlIlII[14];
                        first2.useOn(Inventory.getFirst(iArr8));
                        Time.sleepTicks(lllIIlIlII[1]);
                        "".length();
                    }
                }
                int[] iArr9 = new int[lllIIlIlII[1]];
                iArr9[lllIIlIlII[0]] = lllIIlIlII[9];
                if (llIIIIIIlllII(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIIlIlII[1]];
                    iArr10[lllIIlIlII[0]] = lllIIlIlII[15];
                    if (llIIIIIIlllII(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIIlIlII[1]];
                        iArr11[lllIIlIlII[0]] = lllIIlIlII[9];
                        Item first3 = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[lllIIlIlII[1]];
                        iArr12[lllIIlIlII[0]] = lllIIlIlII[15];
                        first3.useOn(Inventory.getFirst(iArr12));
                        Time.sleepTicks(lllIIlIlII[1]);
                        "".length();
                    }
                }
                int[] iArr13 = new int[lllIIlIlII[1]];
                iArr13[lllIIlIlII[0]] = lllIIlIlII[9];
                if (llIIIIIlIIIll(Inventory.getAll(iArr13).size(), lllIIlIlII[1])) {
                    int[] iArr14 = new int[lllIIlIlII[1]];
                    iArr14[lllIIlIlII[0]] = lllIIlIlII[15];
                    if (llIIIIIlIIIll(Inventory.getAll(iArr14).size(), lllIIlIlII[1])) {
                        int[] iArr15 = new int[lllIIlIlII[1]];
                        iArr15[lllIIlIlII[0]] = lllIIlIlII[14];
                        if (llIIIIIlIIIll(Inventory.getAll(iArr15).size(), lllIIlIlII[1])) {
                            int[] iArr16 = new int[lllIIlIlII[1]];
                            iArr16[lllIIlIlII[0]] = lllIIlIlII[11];
                            if (llIIIIIlIIIll(Inventory.getAll(iArr16).size(), lllIIlIlII[1])) {
                                int[] iArr17 = new int[lllIIlIlII[1]];
                                iArr17[lllIIlIlII[0]] = lllIIlIlII[13];
                            }
                        }
                    }
                }
                Time.sleepTicks(lllIIlIlII[16]);
                "".length();
                if (llIIIIIIlllII(Inventory.contains(item -> {
                    return item.getName().contains(lllIIlIIll[lllIIlIlII[34]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item2 -> {
                        return item2.getName().contains(lllIIlIIll[lllIIlIlII[33]]);
                    }).useOn(Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lllIIlIIll[lllIIlIlII[32]]);
                    }));
                }
                if (llIIIIIlIIIII(Widgets.get(lllIIlIlII[17], lllIIlIlII[18]))) {
                    Dialog.continueSpace();
                    Time.sleepTicks(lllIIlIlII[5]);
                    "".length();
                    Time.sleepUntil(() -> {
                        int[] iArr18 = new int[lllIIlIlII[1]];
                        iArr18[lllIIlIlII[0]] = lllIIlIlII[9];
                        if (llIIIIIIllllI(Inventory.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[lllIIlIlII[1]];
                            iArr19[lllIIlIlII[0]] = lllIIlIlII[13];
                        }
                        if (!llIIIIIIlllII(Dialog.canLevelUpContinue() ? 1 : 0)) {
                            return lllIIlIlII[0];
                        }
                        ?? r0 = lllIIlIlII[1];
                        "".length();
                        return "   ".length() <= " ".length() ? ((((141 + 91) - 161) + 75) ^ (((110 + 110) - 128) + 74)) & (((200 ^ 166) ^ (123 ^ 33)) ^ (-" ".length())) : r0;
                    }, lllIIlIlII[19]);
                    "".length();
                }
            }
        }
    }
}
