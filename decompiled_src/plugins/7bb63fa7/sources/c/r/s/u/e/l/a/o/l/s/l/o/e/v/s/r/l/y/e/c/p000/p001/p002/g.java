package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.g  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/g.class */
public class g {
    public static final /* synthetic */ WorldArea O;
    public static final /* synthetic */ WorldArea K;
    public static /* synthetic */ WorldPoint aa;
    static /* synthetic */ WorldPoint ab;
    private static /* synthetic */ String[] lIllI;
    public static final /* synthetic */ WorldPoint L;
    public static final /* synthetic */ WorldArea T;
    public static final /* synthetic */ WorldArea Q;
    public static final /* synthetic */ WorldArea U;
    public static final /* synthetic */ WorldArea X;
    public static final /* synthetic */ WorldArea R;
    public static /* synthetic */ WorldPoint Z;
    public static final /* synthetic */ WorldArea Y;
    public static final /* synthetic */ WorldArea V;
    public static final /* synthetic */ WorldArea S;
    public static final /* synthetic */ WorldArea P;
    public static final /* synthetic */ WorldArea N;
    public static final /* synthetic */ WorldArea W;
    private static /* synthetic */ int[] lIlll;
    public static final /* synthetic */ WorldArea M;

    public static void b(int i, int i2) {
        Bank.withdraw(i, i2, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(lIlll[1]);
        "".length();
    }

    public static void b(int[] iArr) {
        int i = lIlll[2];
        while (lllIlll(i, iArr.length)) {
            Bank.withdraw(iArr[i], lIlll[1], Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIlll[1]);
            "".length();
            i++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    public static void b(int[] iArr, int lllllIIIIIlIIlI) {
        int i = lIlll[2];
        do {
            if (lllIlll(i, iArr.length)) {
                Bank.withdraw(iArr[i], lllllIIIIIlIIlI, Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIlll[1]);
                "".length();
                int[] iArr2 = new int[lIlll[1]];
                iArr2[lIlll[2]] = iArr[i];
                if (lllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                } else {
                    i++;
                    "".length();
                }
            }
            Time.sleepTicks(lIlll[1]);
            "".length();
            if (lllIIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
                return;
            }
            return;
        } while ((-"   ".length()) <= 0);
    }

    private static boolean lllIlII(int i, int i2) {
        return i > i2;
    }

    public static void a(int[] iArr, int i) {
        int i2 = lIlll[2];
        while (lllIlll(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIlll[1]);
            "".length();
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        }
    }

    private static String llIllII(String llllIllllllIlIl, String llllIllllllIlII) {
        String llllIllllllIlIl2 = new String(Base64.getDecoder().decode(llllIllllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllIllllllIIlI = llllIllllllIlII.toCharArray();
        int llllIllllllIIIl = lIlll[2];
        char[] charArray = llllIllllllIlIl2.toCharArray();
        int length = charArray.length;
        int llllIlllllIlIIl = lIlll[2];
        while (lllIlll(llllIlllllIlIIl, length)) {
            char llllIlllllIlIII = charArray[llllIlllllIlIIl];
            sb.append((char) (llllIlllllIlIII ^ llllIllllllIIlI[llllIllllllIIIl % llllIllllllIIlI.length]));
            "".length();
            llllIllllllIIIl++;
            llllIlllllIlIIl++;
            "".length();
            if ((100 ^ 96) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lllIIII();
        llIllll();
        K = new WorldArea(lIlll[56], lIlll[57], lIlll[58], lIlll[59], lIlll[2]);
        L = new WorldPoint(lIlll[60], lIlll[61], lIlll[2]);
        M = new WorldArea(lIlll[62], lIlll[63], lIlll[64], lIlll[64], lIlll[2]);
        N = new WorldArea(lIlll[65], lIlll[66], lIlll[67], lIlll[68], lIlll[2]);
        O = new WorldArea(lIlll[69], lIlll[70], lIlll[46], lIlll[11], lIlll[2]);
        P = new WorldArea(lIlll[71], lIlll[72], lIlll[73], lIlll[74], lIlll[2]);
        Q = new WorldArea(lIlll[75], lIlll[76], lIlll[77], lIlll[78], lIlll[2]);
        R = new WorldArea(lIlll[79], lIlll[80], lIlll[43], lIlll[44], lIlll[2]);
        S = new WorldArea(lIlll[81], lIlll[82], lIlll[83], lIlll[84], lIlll[2]);
        T = new WorldArea(lIlll[85], lIlll[86], lIlll[87], lIlll[88], lIlll[2]);
        U = new WorldArea(lIlll[89], lIlll[90], lIlll[83], lIlll[77], lIlll[2]);
        V = new WorldArea(lIlll[91], lIlll[92], lIlll[42], lIlll[27], lIlll[2]);
        W = new WorldArea(lIlll[93], lIlll[94], lIlll[95], lIlll[96], lIlll[2]);
        X = new WorldArea(lIlll[97], lIlll[98], lIlll[54], lIlll[87], lIlll[2]);
        Y = new WorldArea(lIlll[99], lIlll[100], lIlll[67], lIlll[48], lIlll[2]);
        Z = new WorldPoint(lIlll[101], lIlll[102], lIlll[2]);
        aa = new WorldPoint(lIlll[103], lIlll[104], lIlll[2]);
        ab = new WorldPoint(lIlll[105], lIlll[106], lIlll[1]);
    }

    private static boolean lllIIlI(int i) {
        return i != 0;
    }

    private static boolean lllIIll(int i) {
        return i == 0;
    }

    private static boolean lllIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(BankLocation bankLocation) {
        if (lllIIIl(Vars.getBit(lIlll[0]), lIlll[1]) && lllIIlI(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[lIlll[1]];
            strArr[lIlll[2]] = lIllI[lIlll[2]];
            n.c(strArr);
        }
        WorldArea worldArea = new WorldArea(lIlll[3], lIlll[4], lIlll[5], lIlll[6], lIlll[2]);
        WorldPoint worldPoint = new WorldPoint(lIlll[7], lIlll[8], lIlll[2]);
        WorldPoint worldPoint2 = new WorldPoint(lIlll[9], lIlll[10], lIlll[2]);
        if ((!lllIIll(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlll[11]) || lllIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lllIIlI(Inventory.contains(item -> {
            return item.getName().contains(lIllI[lIlll[55]]);
        }) ? 1 : 0) && lllIIIl(Players.getLocal().getAnimation(), lIlll[12])) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(lIllI[lIlll[54]]);
            }).interact(lIllI[lIlll[1]]);
            Time.sleepTicks(lIlll[13]);
            "".length();
        }
        if (lllIIlI(Inventory.contains(m.bW) ? 1 : 0) && lllIIll(Equipment.contains(m.bW) ? 1 : 0)) {
            Inventory.getFirst(m.bW).interact(lIllI[lIlll[14]]);
            Time.sleepTicks(lIlll[14]);
            "".length();
        }
        if (lllIIlI(Inventory.contains(m.bF) ? 1 : 0) && lllIIll(Equipment.contains(m.bF) ? 1 : 0)) {
            Inventory.getFirst(m.bF).interact(lIllI[lIlll[15]]);
            Time.sleepTicks(lIlll[14]);
            "".length();
        }
        if (!lllIlII(Players.getLocal().getWorldLocation().distanceTo(L), lIlll[11]) || lllIIlI(N.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks(lIlll[14]);
            "".length();
            "".length();
            if (0 != 0) {
            }
        } else if (!lllIlII(Players.getLocal().getWorldLocation().distanceTo(Z), lIlll[16]) || !lllIIll(M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIIlI(P.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks(lIlll[14]);
            "".length();
            "".length();
            if ("   ".length() < (-" ".length())) {
            }
        } else if (lllIIlI(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks(lIlll[14]);
            "".length();
            "".length();
            if ("   ".length() <= 0) {
            }
        } else if (lllIIlI(Q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(h.ac);
            "".length();
            Time.sleepTicks(lIlll[14]);
            "".length();
            "".length();
            if ((-"   ".length()) >= 0) {
            }
        } else if (lllIIlI(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lIlll[17], lIlll[18], lIlll[2]);
            if (lllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIlll[14])) {
                Movement.walkTo(worldPoint3);
                "".length();
                Time.sleepTicks(lIlll[1]);
                "".length();
            }
            "".length();
            if ((-"   ".length()) >= 0) {
            }
        } else if (lllIIlI(U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint4 = new WorldPoint(lIlll[19], lIlll[20], lIlll[2]);
            if (lllIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lIlll[14])) {
                Movement.walkTo(worldPoint4);
                "".length();
                Time.sleepTicks(lIlll[1]);
                "".length();
            }
            "".length();
            if (((0 ^ 92) & ((50 ^ 110) ^ (-1))) > 0) {
            }
        } else if (lllIIlI(Y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lllIlII(Players.getLocal().getWorldLocation().distanceTo(h.ac), lIlll[21])) {
                Movement.walkTo(h.ac);
                "".length();
                Time.sleepTicks(lIlll[1]);
                "".length();
                "".length();
                if ("   ".length() <= 0) {
                }
            }
        } else {
            WorldArea worldArea2 = new WorldArea(lIlll[22], lIlll[23], lIlll[13], lIlll[21], lIlll[2]);
            WorldArea worldArea3 = new WorldArea(lIlll[24], lIlll[25], lIlll[26], lIlll[27], lIlll[2]);
            WorldArea worldArea4 = new WorldArea(lIlll[28], lIlll[29], lIlll[30], lIlll[31], lIlll[2]);
            if ((!lllIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lllIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lllIIlI(Inventory.contains(item3 -> {
                return item3.getName().contains(lIllI[lIlll[53]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().contains(lIllI[lIlll[52]]);
                }).interact(lIllI[lIlll[32]]);
                Time.sleepTicks(lIlll[32]);
                "".length();
            }
            if (lllIIlI(new WorldArea(lIlll[33], lIlll[34], lIlll[35], lIlll[13], lIlll[2]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[lIlll[1]];
                strArr2[lIlll[2]] = lIllI[lIlll[21]];
                TileObject nearest = TileObjects.getNearest(strArr2);
                if (lllIlIl(nearest)) {
                    nearest.interact(lIllI[lIlll[13]]);
                    Time.sleepTicks(lIlll[32]);
                    "".length();
                }
            }
            Movement.walkTo(bankLocation);
            "".length();
            Time.sleepTicks(lIlll[14]);
            "".length();
        }
    }

    public static void a(int i, int i2) {
        int[] iArr = new int[lIlll[1]];
        iArr[lIlll[2]] = i;
        if (lllIIll(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + i + " item id");
        }
        int[] iArr2 = new int[lIlll[1]];
        iArr2[lIlll[2]] = i;
        if (lllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            Bank.withdraw(i, i2, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIlll[1]);
            "".length();
        }
        if (lllIIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
    }

    private static String llIllIl(String lllllIIIIIIIlIl, String lllllIIIIIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), lIlll[37]), "DES");
            Cipher lllllIIIIIIIlll = Cipher.getInstance("DES");
            lllllIIIIIIIlll.init(lIlll[14], secretKeySpec);
            return new String(lllllIIIIIIIlll.doFinal(Base64.getDecoder().decode(lllllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllIIIIIIIllI) {
            lllllIIIIIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllI(int i, int i2) {
        return i <= i2;
    }

    private static void llIllll() {
        lIllI = new String[lIlll[107]];
        lIllI[lIlll[2]] = llIllII("Dw09", "VhNUf");
        lIllI[lIlll[1]] = llIllIl("nRgl6FWo1O8=", "WkhKy");
        lIllI[lIlll[14]] = llIllII("MBIuGA==", "gwOjB");
        lIllI[lIlll[15]] = llIllIl("q9QlvZ/GbL4=", "JWKXk");
        lIllI[lIlll[32]] = llIlllI("h/EGr0gkJjE=", "rVThq");
        lIllI[lIlll[21]] = llIllII("IAAgBws=", "leVby");
        lIllI[lIlll[13]] = llIllII("JjEBDg==", "vDmbx");
        lIllI[lIlll[35]] = llIllIl("dN+SVEmXm/qFDfgb3/auVjGMHUbpgoVN", "xAQVi");
        lIllI[lIlll[37]] = llIllII("BhAqGw==", "DqDpT");
        lIllI[lIlll[39]] = llIlllI("ms1JjE+MwX7++CC2G9Ey8A==", "aRhBK");
        lIllI[lIlll[27]] = llIlllI("q0c/IzD5owU=", "UROBi");
        lIllI[lIlll[26]] = llIllIl("y1OYGbiza2k=", "vhOJY");
        lIllI[lIlll[40]] = llIllIl("0CTaQLiKiKE=", "vdmiQ");
        lIllI[lIlll[41]] = llIllIl("i6JaGzbJIRQ=", "egTXz");
        lIllI[lIlll[42]] = llIlllI("CJ95drBaEUnrB6XSNSGNFg==", "YKuMg");
        lIllI[lIlll[43]] = llIllIl("IOUTZsZBo+1SHWBW+hfodg==", "AcSkp");
        lIllI[lIlll[44]] = llIllIl("RLBfCXdAibU=", "LZkIW");
        lIllI[lIlll[45]] = llIlllI("XkSqQVA3ImM=", "PFFGP");
        lIllI[lIlll[46]] = llIllIl("FU3FpIXn0VU=", "BbhPK");
        lIllI[lIlll[47]] = llIlllI("bPU7DlU1BIY=", "PgeXQ");
        lIllI[lIlll[11]] = llIllII("JRUjHUMEGzgYFwIG", "gtMvc");
        lIllI[lIlll[48]] = llIlllI("yxtAt4EKkz0=", "JDXHO");
        lIllI[lIlll[49]] = llIllIl("FzKUcxdCybY=", "BbGoU");
        lIllI[lIlll[50]] = llIllIl("lVVNlxmxZv20nagiovy+IQ==", "duDcj");
        lIllI[lIlll[51]] = llIllII("LCsaIg==", "nJtIQ");
        lIllI[lIlll[52]] = llIllII("GhAPMhMBBxc=", "nucWc");
        lIllI[lIlll[53]] = llIllIl("3XwHZuN4P4SgnUOkCl2DLg==", "wRBMy");
        lIllI[lIlll[54]] = llIllII("JAgcHRI/HwQ=", "Pmpxb");
        lIllI[lIlll[55]] = llIllIl("r1Z6zOY4fgm2/rzIqwQAeQ==", "nMpFR");
    }

    private static boolean lllIIIl(int i, int i2) {
        return i == i2;
    }

    private static void lllIIII() {
        lIlll = new int[108];
        lIlll[0] = (-28790) & 30965;
        lIlll[1] = " ".length();
        lIlll[2] = ((176 ^ 174) ^ (46 ^ 98)) & (((25 ^ 112) ^ (38 ^ 29)) ^ (-" ".length()));
        lIlll[3] = (-((-665) & 22425)) & (-3) & 24574;
        lIlll[4] = (-((-6786) & 7167)) & (-22529) & 32767;
        lIlll[5] = 11 ^ 64;
        lIlll[6] = (189 ^ 152) ^ (84 ^ 110);
        lIlll[7] = (-16417) & 18868;
        lIlll[8] = (-27781) & 32253;
        lIlll[9] = (-17411) & 20362;
        lIlll[10] = (-((-7653) & 15863)) & (-257) & 14239;
        lIlll[11] = 24 ^ 12;
        lIlll[12] = -" ".length();
        lIlll[13] = 138 ^ 140;
        lIlll[14] = "  ".length();
        lIlll[15] = "   ".length();
        lIlll[16] = (((129 + 140) - 250) + 142) ^ (((126 + 120) - 161) + 52);
        lIlll[17] = (-16452) & 18803;
        lIlll[18] = (-29061) & 32223;
        lIlll[19] = (-8457) & 11256;
        lIlll[20] = (-((-8677) & 25061)) & (-8197) & 30687;
        lIlll[21] = 125 ^ 120;
        lIlll[22] = (-((-3656) & 24527)) & (-1033) & 24511;
        lIlll[23] = (-4284) & 7675;
        lIlll[24] = (-((-25675) & 30171)) & (-8203) & 15262;
        lIlll[25] = (-1041) & 3900;
        lIlll[26] = 17 ^ 26;
        lIlll[27] = 55 ^ 61;
        lIlll[28] = (-((-8725) & 31575)) & (-8209) & 32735;
        lIlll[29] = (-16466) & 19967;
        lIlll[30] = (181 ^ 172) ^ (178 ^ 128);
        lIlll[31] = (200 ^ 136) ^ (238 ^ 154);
        lIlll[32] = (35 ^ 126) ^ (216 ^ 129);
        lIlll[33] = (-24881) & 28031;
        lIlll[34] = (-((-2069) & 14495)) & (-16389) & 32735;
        lIlll[35] = 193 ^ 198;
        lIlll[36] = 134 ^ 152;
        lIlll[37] = 164 ^ 172;
        lIlll[38] = (-((-5417) & 30075)) & (-13) & 28670;
        lIlll[39] = (96 ^ 92) ^ (0 ^ 53);
        lIlll[40] = 135 ^ 139;
        lIlll[41] = (91 ^ 14) ^ (74 ^ 18);
        lIlll[42] = (118 ^ 22) ^ (224 ^ 142);
        lIlll[43] = (((20 + 107) - 83) + 91) ^ (((124 + 6) - 67) + 73);
        lIlll[44] = 59 ^ 43;
        lIlll[45] = (12 ^ 104) ^ (24 ^ 109);
        lIlll[46] = 95 ^ 77;
        lIlll[47] = 0 ^ 19;
        lIlll[48] = 122 ^ 111;
        lIlll[49] = (220 ^ 179) ^ (79 ^ 54);
        lIlll[50] = 169 ^ 190;
        lIlll[51] = (((154 + 141) - 167) + 58) ^ (((42 + 83) - 27) + 64);
        lIlll[52] = (101 ^ 47) ^ (225 ^ 178);
        lIlll[53] = 95 ^ 69;
        lIlll[54] = 163 ^ 184;
        lIlll[55] = 138 ^ 150;
        lIlll[56] = (-((-273) & 29617)) & (-1) & 32487;
        lIlll[57] = (-28677) & 32149;
        lIlll[58] = (241 ^ 146) ^ (79 ^ 5);
        lIlll[59] = 126 ^ 89;
        lIlll[60] = (-21107) & 24310;
        lIlll[61] = (-((-17411) & 26187)) & (-4243) & 16383;
        lIlll[62] = (-((-71) & 17639)) & (-5) & 20479;
        lIlll[63] = (-24902) & 28111;
        lIlll[64] = 248 ^ 145;
        lIlll[65] = (-(((119 + 17) - 110) + 103)) & (-4865) & 8188;
        lIlll[66] = (-((-1351) & 22479)) & (-66) & 24559;
        lIlll[67] = 170 ^ 137;
        lIlll[68] = (((73 + 132) - 73) + 52) ^ (((116 + 33) - 102) + 83);
        lIlll[69] = (-8833) & 11957;
        lIlll[70] = (-8345) & 11963;
        lIlll[71] = (-28834) & 32447;
        lIlll[72] = (-12450) & 15867;
        lIlll[73] = 236 ^ 176;
        lIlll[74] = 16 ^ 53;
        lIlll[75] = (-((-3343) & 28111)) & (-4866) & 32763;
        lIlll[76] = (-24705) & 28145;
        lIlll[77] = (((96 + 120) - 93) + 9) ^ (((18 + 41) - (-91)) + 31);
        lIlll[78] = (111 ^ 113) ^ (215 ^ 141);
        lIlll[79] = (-16385) & 18014;
        lIlll[80] = (-(((80 + 73) - 150) + 145)) & (-20481) & 24563;
        lIlll[81] = (-((-4001) & 24483)) & (-1) & 23422;
        lIlll[82] = (-257) & 3565;
        lIlll[83] = 105 ^ 68;
        lIlll[84] = (35 ^ 28) ^ (35 ^ 56);
        lIlll[85] = (-((-10253) & 31773)) & (-226) & 24063;
        lIlll[86] = (-((-24670) & 25343)) & (-8193) & 12011;
        lIlll[87] = 233 ^ 195;
        lIlll[88] = 37 ^ 22;
        lIlll[89] = (-((-1221) & 13559)) & (-1025) & 16127;
        lIlll[90] = (-((-905) & 9147)) & (-2050) & 16383;
        lIlll[91] = (-((-17681) & 22491)) & (-24577) & 32763;
        lIlll[92] = (-((-145) & 20625)) & (-49) & 23794;
        lIlll[93] = (-21793) & 24431;
        lIlll[94] = (-((-26689) & 27505)) & (-8193) & 12149;
        lIlll[95] = (191 ^ 186) ^ (112 ^ 67);
        lIlll[96] = (((122 + 138) - 208) + 107) ^ (((20 + 39) - (-3)) + 129);
        lIlll[97] = (-11042) & 12275;
        lIlll[98] = (-((-10441) & 31213)) & (-1) & 24495;
        lIlll[99] = (-((-9985) & 26369)) & (-8705) & 28287;
        lIlll[100] = (-((-11401) & 16105)) & (-2) & 8191;
        lIlll[101] = (-((-2061) & 31789)) & (-65) & 32767;
        lIlll[102] = (-((-1346) & 30547)) & (-5) & 32447;
        lIlll[103] = (-4097) & 5818;
        lIlll[104] = (-((-1601) & 13937)) & (-16899) & 32699;
        lIlll[105] = (-((-3267) & 15555)) & (-17417) & 32748;
        lIlll[106] = (-((-2315) & 28043)) & (-2051) & 32751;
        lIlll[107] = (32 ^ 120) ^ (193 ^ 132);
    }

    public static void G() {
        if (lllIllI(Players.getLocal().getWorldLocation().distanceTo(ab), lIlll[36])) {
            String[] strArr = new String[lIlll[1]];
            strArr[lIlll[2]] = lIllI[lIlll[35]];
            NPCs.getNearest(strArr).interact(lIllI[lIlll[37]]);
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIlll[38]);
            "".length();
        }
        if (!lllIIll(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIIlI(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks(lIlll[15]);
            "".length();
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIlll[38]);
            "".length();
            "".length();
            if ((-" ".length()) >= 0) {
            }
        } else if (!lllIIll(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lllIIll(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lllIIll(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lllIIll(O.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lllIIll(R.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIllI(Players.getLocal().getWorldLocation().distanceTo(aa), lIlll[11])) {
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            String[] strArr2 = new String[lIlll[1]];
            strArr2[lIlll[2]] = lIllI[lIlll[39]];
            TileObject nearest = TileObjects.getNearest(worldLocation, strArr2);
            if (lllIlIl(nearest)) {
                String[] strArr3 = new String[lIlll[1]];
                strArr3[lIlll[2]] = lIllI[lIlll[27]];
                if (lllIIlI(nearest.hasAction(strArr3) ? 1 : 0)) {
                    nearest.interact(lIllI[lIlll[26]]);
                    Time.sleepTicks(lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlll[38]);
                    "".length();
                }
                String[] strArr4 = new String[lIlll[1]];
                strArr4[lIlll[2]] = lIllI[lIlll[40]];
                if (lllIIlI(nearest.hasAction(strArr4) ? 1 : 0)) {
                    nearest.interact(lIllI[lIlll[41]]);
                    Time.sleepTicks(lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlll[38]);
                    "".length();
                }
            }
            "".length();
            if (((((12 + 157) - 164) + 183) ^ (((106 + 13) - 72) + 137)) != ((52 ^ 0) ^ (143 ^ 191))) {
            }
        } else if (!lllIIll(V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lllIIll(X.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIIlI(W.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            String[] strArr5 = new String[lIlll[1]];
            strArr5[lIlll[2]] = lIllI[lIlll[42]];
            TileObject nearest2 = TileObjects.getNearest(worldLocation2, strArr5);
            WorldPoint worldLocation3 = Players.getLocal().getWorldLocation();
            String[] strArr6 = new String[lIlll[1]];
            strArr6[lIlll[2]] = lIllI[lIlll[43]];
            TileObject nearest3 = TileObjects.getNearest(worldLocation3, strArr6);
            if (lllIlIl(nearest2)) {
                String[] strArr7 = new String[lIlll[1]];
                strArr7[lIlll[2]] = lIllI[lIlll[44]];
                if (lllIIlI(nearest2.hasAction(strArr7) ? 1 : 0)) {
                    nearest2.interact(lIllI[lIlll[45]]);
                    Time.sleepTicks(lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlll[38]);
                    "".length();
                }
            }
            if (lllIlIl(nearest3)) {
                String[] strArr8 = new String[lIlll[1]];
                strArr8[lIlll[2]] = lIllI[lIlll[46]];
                if (lllIIlI(nearest3.hasAction(strArr8) ? 1 : 0)) {
                    nearest3.interact(lIllI[lIlll[47]]);
                    Time.sleepTicks(lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlll[38]);
                    "".length();
                }
            }
            "".length();
            if (0 != 0) {
            }
        } else if (!lllIIlI(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lllIIll(K.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlII(Players.getLocal().getWorldLocation().distanceTo(ab), lIlll[36])) {
                WorldPoint worldLocation4 = Players.getLocal().getWorldLocation();
                String[] strArr9 = new String[lIlll[1]];
                strArr9[lIlll[2]] = lIllI[lIlll[50]];
                TileObject nearest4 = TileObjects.getNearest(worldLocation4, strArr9);
                if (lllIlIl(nearest4)) {
                    nearest4.interact(lIllI[lIlll[51]]);
                    Time.sleepTicks(lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlll[38]);
                    "".length();
                }
            }
        } else {
            WorldPoint worldLocation5 = Players.getLocal().getWorldLocation();
            String[] strArr10 = new String[lIlll[1]];
            strArr10[lIlll[2]] = lIllI[lIlll[11]];
            TileObject nearest5 = TileObjects.getNearest(worldLocation5, strArr10);
            if (lllIlIl(nearest5)) {
                String[] strArr11 = new String[lIlll[1]];
                strArr11[lIlll[2]] = lIllI[lIlll[48]];
                if (lllIIlI(nearest5.hasAction(strArr11) ? 1 : 0)) {
                    nearest5.interact(lIllI[lIlll[49]]);
                    Time.sleepTicks(lIlll[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlll[38]);
                    "".length();
                }
            }
            "".length();
            if (0 != 0) {
            }
        }
    }

    private static boolean lllIlll(int i, int i2) {
        return i < i2;
    }

    private static String llIlllI(String llllIlllllIIIII, String llllIllllIlllll) {
        try {
            SecretKeySpec llllIlllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlllllIIIlI = Cipher.getInstance("Blowfish");
            llllIlllllIIIlI.init(lIlll[14], llllIlllllIIIll);
            return new String(llllIlllllIIIlI.doFinal(Base64.getDecoder().decode(llllIlllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlllllIIIIl) {
            llllIlllllIIIIl.printStackTrace();
            return null;
        }
    }
}
