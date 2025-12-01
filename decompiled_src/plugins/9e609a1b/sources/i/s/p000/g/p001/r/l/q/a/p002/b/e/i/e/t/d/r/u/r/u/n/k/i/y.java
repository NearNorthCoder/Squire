package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.y  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/y.class */
public class y implements M {
    public static /* synthetic */ List<C0003d> bA;
    static /* synthetic */ boolean cp;
    static /* synthetic */ int co;
    private static final /* synthetic */ String[] fZ;
    public static /* synthetic */ WorldPoint ga;
    private static /* synthetic */ int[] lIIIllllllllI;
    static /* synthetic */ int bY;
    public static /* synthetic */ boolean by;
    private static /* synthetic */ String[] lIIIlllllllIl;

    private static String lIlIIllIlIllIlI(String llllllllllllllIlllllllllllIIllII, String llllllllllllllIlllllllllllIIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllllllllllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllllllIIlIll.getBytes(StandardCharsets.UTF_8)), lIIIllllllllI[16]), "DES");
            Cipher llllllllllllllIlllllllllllIIlllI = Cipher.getInstance("DES");
            llllllllllllllIlllllllllllIIlllI.init(lIIIllllllllI[3], llllllllllllllIlllllllllllIIllll);
            return new String(llllllllllllllIlllllllllllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllllllIIllIl) {
            llllllllllllllIlllllllllllIIllIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    private static void bm() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIllIllIIIII(nearest) && lIlIIllIlIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[46]];
            C0000a.a(nearest);
        }
        if (lIlIIllIllIIIII(nearest) && lIlIIllIlIlllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIIllIlIlllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[47]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIllllllllI[7]);
                "".length();
            }
            if (lIlIIllIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[48]];
                if (lIlIIllIllIIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIllllllllI[6]);
                    "".length();
                }
                if (lIlIIllIllIIIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIIllllllllI[3]);
                    "".length();
                }
                int[] iArr = new int[lIIIllllllllI[1]];
                iArr[lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (lIlIIllIlIlllIl(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIllllllllI[1]];
                    iArr2[lIIIllllllllI[0]] = lIIIllllllllI[9];
                    if (lIlIIllIlIllllI(Bank.getFirst(iArr2).getQuantity(), lIIIllllllllI[5])) {
                        W();
                        System.out.println(lIIIlllllllIl[lIIIllllllllI[49]]);
                        by = lIIIllllllllI[1];
                        return;
                    }
                }
                int[] iArr3 = new int[lIIIllllllllI[8]];
                iArr3[lIIIllllllllI[0]] = lIIIllllllllI[11];
                iArr3[lIIIllllllllI[1]] = lIIIllllllllI[12];
                iArr3[lIIIllllllllI[3]] = lIIIllllllllI[9];
                iArr3[lIIIllllllllI[5]] = lIIIllllllllI[13];
                iArr3[lIIIllllllllI[6]] = lIIIllllllllI[14];
                if (lIlIIllIlIlllll(C0004e.b(iArr3) ? 1 : 0)) {
                    W();
                    System.out.println(lIIIlllllllIl[lIIIllllllllI[50]]);
                    by = lIIIllllllllI[1];
                    return;
                }
            }
            int[] iArr4 = new int[lIIIllllllllI[8]];
            iArr4[lIIIllllllllI[0]] = lIIIllllllllI[11];
            iArr4[lIIIllllllllI[1]] = lIIIllllllllI[12];
            iArr4[lIIIllllllllI[3]] = lIIIllllllllI[9];
            iArr4[lIIIllllllllI[5]] = lIIIllllllllI[13];
            iArr4[lIIIllllllllI[6]] = lIIIllllllllI[14];
            if (lIlIIllIlIlllIl(C0004e.b(iArr4) ? 1 : 0)) {
                Bank.withdraw(lIIIllllllllI[11], lIIIllllllllI[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIIIllllllllI[1]);
                "".length();
                Bank.withdraw(lIIIllllllllI[12], lIIIllllllllI[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIIIllllllllI[1]);
                "".length();
                Bank.withdraw(lIIIllllllllI[9], lIIIllllllllI[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIIIllllllllI[1]);
                "".length();
                Bank.withdraw(lIIIllllllllI[13], lIIIllllllllI[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIIIllllllllI[1]);
                "".length();
                Bank.withdraw(lIIIllllllllI[14], lIIIllllllllI[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIIIllllllllI[1]);
                "".length();
                C0000a.b(C0005f.bk, lIIIllllllllI[1]);
                Time.sleepTicks(lIIIllllllllI[5]);
                "".length();
                Bank.close();
                bB();
            }
        }
    }

    private static boolean lIlIIllIlIlllIl(int i2) {
        return i2 != 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllllllIl[lIIIllllllllI[62]];
    }

    private static boolean lIlIIllIllIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIllIllIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIllllllllI[1]];
        iArr[lIIIllllllllI[0]] = lIIIllllllllI[11];
        if (lIlIIllIlIlllIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIllllllllI[1]];
            iArr2[lIIIllllllllI[0]] = lIIIllllllllI[12];
            if (lIlIIllIlIlllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIllllllllI[1]];
                iArr3[lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (lIlIIllIlIlllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIIIllllllllI[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIIllllllllI[0];
    }

    private static boolean lIlIIllIlIllllI(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlIIllIlIllIII(String llllllllllllllIllllllllllllIlllI, String llllllllllllllIllllllllllllIllIl) {
        String llllllllllllllIllllllllllllIlllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllllllllllllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllllllllllIllII = new StringBuilder();
        char[] charArray = llllllllllllllIllllllllllllIllIl.toCharArray();
        int llllllllllllllIllllllllllllIlIlI = lIIIllllllllI[0];
        char[] charArray2 = llllllllllllllIllllllllllllIlllI2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIllllllllI[0];
        while (lIlIIllIlIllllI(i2, length)) {
            llllllllllllllIllllllllllllIllII.append((char) (charArray2[i2] ^ charArray[llllllllllllllIllllllllllllIlIlI % charArray.length]));
            "".length();
            llllllllllllllIllllllllllllIlIlI++;
            i2++;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllllllllllIllII);
    }

    private static void bB() {
        String[] strArr = new String[lIIIllllllllI[1]];
        strArr[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[51]];
        if (lIlIIllIlIlllll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIIIllllllllI[1]];
            strArr2[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[52]];
            if (!lIlIIllIlIlllIl(Inventory.contains(strArr2) ? 1 : 0)) {
                return;
            }
        }
        int[] iArr = new int[lIIIllllllllI[1]];
        iArr[lIIIllllllllI[0]] = lIIIllllllllI[9];
        if (lIlIIllIlIlllIl(Inventory.contains(iArr) ? 1 : 0)) {
            if (lIlIIllIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                Time.sleepTicks(C0004e.c(lIIIllllllllI[3], lIIIllllllllI[5]));
                "".length();
            }
            AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[53]];
            String[] strArr3 = new String[lIIIllllllllI[1]];
            strArr3[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[54]];
            Item first = Inventory.getFirst(strArr3);
            String[] strArr4 = new String[lIIIllllllllI[1]];
            strArr4[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[55]];
            Item first2 = Inventory.getFirst(strArr4);
            int[] iArr2 = new int[lIIIllllllllI[1]];
            iArr2[lIIIllllllllI[0]] = lIIIllllllllI[9];
            Item first3 = Inventory.getFirst(iArr2);
            if (lIlIIllIllIIIII(first) && lIlIIllIllIIIII(first3)) {
                first.useOn(first3);
                Time.sleepTicks(lIIIllllllllI[1]);
                "".length();
            }
            int[] iArr3 = new int[lIIIllllllllI[1]];
            iArr3[lIIIllllllllI[0]] = lIIIllllllllI[9];
            Item first4 = Inventory.getFirst(iArr3);
            if (lIlIIllIllIIIII(first2) && lIlIIllIllIIIII(first4)) {
                first2.useOn(first4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if ((!lIlIIllIllIIllI(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[10]) || lIlIIllIllIIllI(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[18])) && !lIlIIllIllIIlll(Quests.getState(Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            return lIIIllllllllI[0];
        }
        ?? r0 = lIIIllllllllI[1];
        "".length();
        return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIllllllllI[0];
    }

    private static void lIlIIllIlIlllII() {
        lIIIllllllllI = new int[74];
        lIIIllllllllI[0] = (20 ^ 61) & ((31 ^ 54) ^ (-1));
        lIIIllllllllI[1] = " ".length();
        lIIIllllllllI[2] = 47 ^ 100;
        lIIIllllllllI[3] = "  ".length();
        lIIIllllllllI[4] = 129 ^ 191;
        lIIIllllllllI[5] = "   ".length();
        lIIIllllllllI[6] = (93 ^ 76) ^ (27 ^ 14);
        lIIIllllllllI[7] = (-17510) & 22509;
        lIIIllllllllI[8] = (107 ^ 27) ^ (216 ^ 173);
        lIIIllllllllI[9] = (-((-25377) & 30711)) & (-18434) & 24055;
        lIIIllllllllI[10] = 184 ^ 190;
        lIIIllllllllI[11] = (-((-5511) & 32151)) & (-4097) & 32503;
        lIIIllllllllI[12] = (-12289) & 14057;
        lIIIllllllllI[13] = (-((-12401) & 16121)) & (-7) & 16351;
        lIIIllllllllI[14] = (-51) & 8059;
        lIIIllllllllI[15] = (((61 + 127) - 173) + 138) ^ (((88 + 6) - 84) + 148);
        lIIIllllllllI[16] = 51 ^ 59;
        lIIIllllllllI[17] = (((164 + 164) - 223) + 74) ^ (((93 + 110) - 58) + 41);
        lIIIllllllllI[18] = (231 ^ 177) ^ (104 ^ 52);
        lIIIllllllllI[19] = (100 ^ 35) ^ (219 ^ 151);
        lIIIllllllllI[20] = (((22 + 121) - 100) + 106) ^ (((65 + 112) - 162) + 138);
        lIIIllllllllI[21] = 8 ^ 5;
        lIIIllllllllI[22] = (-10574) & 11245;
        lIIIllllllllI[23] = (-3103) & 3775;
        lIIIllllllllI[24] = (-22785) & 23455;
        lIIIllllllllI[25] = 74 ^ 68;
        lIIIllllllllI[26] = 73 ^ 70;
        lIIIllllllllI[27] = (((8 + 37) - 17) + 153) ^ (((63 + 49) - 62) + 115);
        lIIIllllllllI[28] = 215 ^ 198;
        lIIIllllllllI[29] = (((87 + 165) - 158) + 73) ^ (((33 + 107) - 89) + 130);
        lIIIllllllllI[30] = 126 ^ 109;
        lIIIllllllllI[31] = (((114 + 108) - 179) + 95) ^ (((90 + 1) - 75) + 142);
        lIIIllllllllI[32] = 130 ^ 151;
        lIIIllllllllI[33] = (242 ^ 155) ^ (((95 + 123) - 201) + 110);
        lIIIllllllllI[34] = (21 ^ 124) ^ (37 ^ 91);
        lIIIllllllllI[35] = (-((-24654) & 26863)) & (-28931) & 31655;
        lIIIllllllllI[36] = (((23 + 77) - (-26)) + 42) ^ (((120 + 37) - 94) + 113);
        lIIIllllllllI[37] = (((78 + 175) - 188) + 114) ^ (((24 + 86) - (-37)) + 23);
        lIIIllllllllI[38] = 85 ^ 79;
        lIIIllllllllI[39] = 45 ^ 54;
        lIIIllllllllI[40] = (4 ^ 58) ^ (134 ^ 164);
        lIIIllllllllI[41] = (-24643) & 25671;
        lIIIllllllllI[42] = 69 ^ 88;
        lIIIllllllllI[43] = (82 ^ 12) ^ (200 ^ 136);
        lIIIllllllllI[44] = 136 ^ 151;
        lIIIllllllllI[45] = (-((-257) & 32649)) & (-97) & 32765;
        lIIIllllllllI[46] = 46 ^ 14;
        lIIIllllllllI[47] = (((41 + 29) - (-16)) + 73) ^ (((41 + 125) - 150) + 174);
        lIIIllllllllI[48] = (((84 + 130) - 212) + 152) ^ (((67 + 81) - 39) + 75);
        lIIIllllllllI[49] = 44 ^ 15;
        lIIIllllllllI[50] = (18 ^ 49) ^ (63 ^ 56);
        lIIIllllllllI[51] = 112 ^ 85;
        lIIIllllllllI[52] = 108 ^ 74;
        lIIIllllllllI[53] = 135 ^ 160;
        lIIIllllllllI[54] = (36 ^ 62) ^ (5 ^ 55);
        lIIIllllllllI[55] = (171 ^ 180) ^ (110 ^ 88);
        lIIIllllllllI[56] = (-22598) & 31597;
        lIIIllllllllI[57] = (-273) & 12252;
        lIIIllllllllI[58] = (-6212) & 31211;
        lIIIllllllllI[59] = (-((-15959) & 32351)) & (-8241) & 32639;
        lIIIllllllllI[60] = (-30865) & 32764;
        lIIIllllllllI[61] = 46 ^ 74;
        lIIIllllllllI[62] = 52 ^ 30;
        lIIIllllllllI[63] = 176 ^ 155;
        lIIIllllllllI[64] = 77 ^ 97;
        lIIIllllllllI[65] = (0 ^ 46) ^ "   ".length();
        lIIIllllllllI[66] = (213 ^ 178) ^ (220 ^ 149);
        lIIIllllllllI[67] = 1 ^ 46;
        lIIIllllllllI[68] = 175 ^ 159;
        lIIIllllllllI[69] = 169 ^ 152;
        lIIIllllllllI[70] = (149 ^ 189) ^ (180 ^ 174);
        lIIIllllllllI[71] = (-((-11969) & 16115)) & (-24641) & 31743;
        lIIIllllllllI[72] = (-((-19484) & 31839)) & (-16389) & 32255;
        lIIIllllllllI[73] = 80 ^ 99;
    }

    private static String lIlIIllIlIllIIl(String llllllllllllllIlllllllllllIllIIl, String llllllllllllllIlllllllllllIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllllllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllllllllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllllllllIllIll.init(lIIIllllllllI[3], secretKeySpec);
            return new String(llllllllllllllIlllllllllllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllllllIllIlI) {
            llllllllllllllIlllllllllllIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIllIIllI(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIllIllIIIll(int i2, int i3) {
        return i2 <= i3;
    }

    static {
        lIlIIllIlIlllII();
        lIlIIllIlIllIll();
        String[] strArr = new String[lIIIllllllllI[15]];
        strArr[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[64]];
        strArr[lIIIllllllllI[1]] = lIIIlllllllIl[lIIIllllllllI[65]];
        strArr[lIIIllllllllI[3]] = lIIIlllllllIl[lIIIllllllllI[66]];
        strArr[lIIIllllllllI[5]] = lIIIlllllllIl[lIIIllllllllI[67]];
        strArr[lIIIllllllllI[6]] = lIIIlllllllIl[lIIIllllllllI[68]];
        strArr[lIIIllllllllI[8]] = lIIIlllllllIl[lIIIllllllllI[69]];
        strArr[lIIIllllllllI[10]] = lIIIlllllllIl[lIIIllllllllI[70]];
        fZ = strArr;
        bA = new ArrayList();
        ga = new WorldPoint(lIIIllllllllI[71], lIIIllllllllI[72], lIIIllllllllI[0]);
        bY = lIIIllllllllI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
        if (lIlIIllIlIllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.y.lIIIllllllllI[5]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIIIllllllllI[1]];
        iArr4[lIIIllllllllI[0]] = lIIIllllllllI[11];
        if (lIlIIllIlIlllll(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllllllI[11], lIIIllllllllI[1], lIIIllllllllI[56]));
            "".length();
        }
        int[] iArr5 = new int[lIIIllllllllI[1]];
        iArr5[lIIIllllllllI[0]] = lIIIllllllllI[12];
        if (lIlIIllIlIlllll(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllllllI[12], lIIIllllllllI[1], lIIIllllllllI[56]));
            "".length();
        }
        int[] iArr6 = new int[lIIIllllllllI[1]];
        iArr6[lIIIllllllllI[0]] = lIIIllllllllI[9];
        if (lIlIIllIlIlllIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIIllllllllI[1]];
            iArr7[lIIIllllllllI[0]] = lIIIllllllllI[9];
            if (lIlIIllIlIlllIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIllllllllI[1]];
                iArr8[lIIIllllllllI[0]] = lIIIllllllllI[9];
            }
            iArr = new int[lIIIllllllllI[1]];
            iArr[lIIIllllllllI[0]] = lIIIllllllllI[14];
            if (lIlIIllIlIlllll(Bank.contains(iArr) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllllllI[14], lIIIllllllllI[8], lIIIllllllllI[56]));
                "".length();
            }
            if (lIlIIllIlIlllll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIlllllllIl[lIIIllllllllI[63]]);
            }) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllllllI[57], lIIIllllllllI[8], lIIIllllllllI[58]));
                "".length();
            }
            iArr2 = new int[lIIIllllllllI[1]];
            iArr2[lIIIllllllllI[0]] = lIIIllllllllI[59];
            if (lIlIIllIlIlllll(Bank.contains(iArr2) ? 1 : 0)) {
                bA.add(new C0003d(lIIIllllllllI[59], lIIIllllllllI[54], lIIIllllllllI[60]));
                "".length();
            }
            iArr3 = new int[lIIIllllllllI[1]];
            iArr3[lIIIllllllllI[0]] = lIIIllllllllI[13];
            if (lIlIIllIlIlllll(Bank.contains(iArr3) ? 1 : 0)) {
                return;
            }
            bA.add(new C0003d(lIIIllllllllI[13], lIIIllllllllI[8], C0007h.bv));
            "".length();
            return;
        }
        bA.add(new C0003d(lIIIllllllllI[9], lIIIllllllllI[5], lIIIllllllllI[56]));
        "".length();
        iArr = new int[lIIIllllllllI[1]];
        iArr[lIIIllllllllI[0]] = lIIIllllllllI[14];
        if (lIlIIllIlIlllll(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIlIIllIlIlllll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIlllllllIl[lIIIllllllllI[63]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIllllllllI[1]];
        iArr2[lIIIllllllllI[0]] = lIIIllllllllI[59];
        if (lIlIIllIlIlllll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIllllllllI[1]];
        iArr3[lIIIllllllllI[0]] = lIIIllllllllI[13];
        if (lIlIIllIlIlllll(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean lIlIIllIllIIlII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIllIlIlllll(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIllIllIIlIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIllIllIIIlI(int i2, int i3) {
        return i2 > i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            bA();
            "".length();
            if (0 != 0) {
                return (56 ^ 27) & ((127 ^ 92) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIllllllllI[61];
    }

    private static boolean lIlIIllIllIIIIl(int i2) {
        return i2 > 0;
    }

    private static void lIlIIllIlIllIll() {
        lIIIlllllllIl = new String[lIIIllllllllI[73]];
        lIIIlllllllIl[lIIIllllllllI[0]] = lIlIIllIlIllIII("KjA2ABkPZSYdEgU2", "hEOiw");
        lIIIlllllllIl[lIIIllllllllI[1]] = lIlIIllIlIllIIl("UF+yL7PpGG7NluQqDLn5dzkX1HyU1rniQRdFsk5aNzV6i51LfqVTpyfhokajIvpV", "itibl");
        lIIIlllllllIl[lIIIllllllllI[3]] = lIlIIllIlIllIII("MhkKBSY=", "vkckM");
        lIIIlllllllIl[lIIIllllllllI[5]] = lIlIIllIlIllIlI("QdexLgRJ8prSPu3EqXo8w6xGb0qVRcV2", "RJvfF");
        lIIIlllllllIl[lIIIllllllllI[6]] = lIlIIllIlIllIIl("kdLR1puZU4v0xT59vwDB+w==", "KGzpA");
        lIIIlllllllIl[lIIIllllllllI[8]] = lIlIIllIlIllIlI("31uweZF2VOyYNyuaC30hOTlIwGyKQ8m7", "jRcNb");
        lIIIlllllllIl[lIIIllllllllI[10]] = lIlIIllIlIllIII("BhR5Njc0UTQ+NiIYNzBlIAQ8JDFxAiwnNT0YPCRpcQIuPjEyGTA5InEFNncHBCgQGQI=", "QqYWE");
        lIIIlllllllIl[lIIIllllllllI[15]] = lIlIIllIlIllIlI("4puDHTfvbsd80TBx2ljDv8LvYSrF9J32LKtgfEQphoSb3gEIvUoRFtEhvS7oj0g5g9xgGK1+s2g=", "SKaVy");
        lIIIlllllllIl[lIIIllllllllI[16]] = lIlIIllIlIllIIl("J+MXYTnKofJO1AocFMwcJw==", "zvYxH");
        lIIIlllllllIl[lIIIllllllllI[17]] = lIlIIllIlIllIII("GTUnFj4jLyFEOz8kNRA=", "JAFdJ");
        lIIIlllllllIl[lIIIllllllllI[18]] = lIlIIllIlIllIIl("QF+K1avv/G8Jrxcw5vJFMg==", "vydNI");
        lIIIlllllllIl[lIIIllllllllI[19]] = lIlIIllIlIllIII("LCYxGg==", "cVTtt");
        lIIIlllllllIl[lIIIllllllllI[20]] = lIlIIllIlIllIII("ACMdNg==", "OSxXy");
        lIIIlllllllIl[lIIIllllllllI[21]] = lIlIIllIlIllIII("MhYGHAMUH0g7FBsHBhYLEA==", "ushyq");
        lIIIlllllllIl[lIIIllllllllI[25]] = lIlIIllIlIllIIl("3xxLumGOQrXPJ82UpVRdTg==", "bgvfH");
        lIIIlllllllIl[lIIIllllllllI[26]] = lIlIIllIlIllIII("CB85Px0iTTwoHw==", "GmXQz");
        lIIIlllllllIl[lIIIllllllllI[27]] = lIlIIllIlIllIlI("pPF8V9Gx5eRlCXN1xKzNlw==", "UnOtI");
        lIIIlllllllIl[lIIIllllllllI[28]] = lIlIIllIlIllIIl("KXEStB+Kj7iSbmk4BsLDhQ==", "ucGEw");
        lIIIlllllllIl[lIIIllllllllI[29]] = lIlIIllIlIllIlI("3Be4Zk19TSv/G7j8ltGP9g==", "JwEUf");
        lIIIlllllllIl[lIIIllllllllI[30]] = lIlIIllIlIllIlI("ifoCoP99bcTlNhWAURcIpmVEC+nvg+7w", "ZBLcc");
        lIIIlllllllIl[lIIIllllllllI[31]] = lIlIIllIlIllIIl("GmRs5mjii4+YmbW4HV1ujzz6YK5mnXhZ", "BdbtV");
        lIIIlllllllIl[lIIIllllllllI[32]] = lIlIIllIlIllIlI("XoSFEOcyp91u4gdeGjCdyw==", "uNQMx");
        lIIIlllllllIl[lIIIllllllllI[33]] = lIlIIllIlIllIII("FyMrFj8tMXkROGM5Kxk4JDM=", "CVYxV");
        lIIIlllllllIl[lIIIllllllllI[34]] = lIlIIllIlIllIlI("LZoQR4S3Y3Mjvhd2X8WBhQ3pDsMbUS56", "VQVtB");
        lIIIlllllllIl[lIIIllllllllI[36]] = lIlIIllIlIllIIl("GPjWHczef7ru/3hUeTQg2bn57go/e3WY", "fyhGL");
        lIIIlllllllIl[lIIIllllllllI[37]] = lIlIIllIlIllIII("ECcaImM1JA0rKjxrAiYqPg==", "RKoGC");
        lIIIlllllllIl[lIIIllllllllI[38]] = lIlIIllIlIllIlI("4vbKOdVi58nIPyCfw7OrSg==", "KvXVx");
        lIIIlllllllIl[lIIIllllllllI[39]] = lIlIIllIlIllIlI("BA5jqg8vQZU5V/l5O6tNcQ==", "PyrVn");
        lIIIlllllllIl[lIIIllllllllI[40]] = lIlIIllIlIllIIl("odYZzI8ND6rSLuA91NGFrC5UnUnC24k5", "GNzac");
        lIIIlllllllIl[lIIIllllllllI[42]] = lIlIIllIlIllIII("HBIoBwImAHoABWgFKAYcJg==", "HgZik");
        lIIIlllllllIl[lIIIllllllllI[43]] = lIlIIllIlIllIII("PhQwVDgfVTUALQIB", "puFtL");
        lIIIlllllllIl[lIIIllllllllI[44]] = lIlIIllIlIllIlI("zqAzohu5G3P3g9droTWW6DsGtt1CdRIu", "ldHve");
        lIIIlllllllIl[lIIIllllllllI[46]] = lIlIIllIlIllIII("Gg8EIiA1GhslIHQaHWslNQAZ", "TnrKG");
        lIIIlllllllIl[lIIIllllllllI[47]] = lIlIIllIlIllIlI("vn1J8WH8c7v+UoIXvc6UjQ==", "PYetP");
        lIIIlllllllIl[lIIIllllllllI[48]] = lIlIIllIlIllIII("OC40CgAZIT1ODhEhMQcCFw==", "pOZnl");
        lIIIlllllllIl[lIIIllllllllI[49]] = lIlIIllIlIllIII("EBxjBwgiWS4PCTQQLQFaNgwmFQ5nCjYWCisQJhVWZwo0Dw4kESoIHWcNLEY4EiAKKD0=", "GyCfz");
        lIIIlllllllIl[lIIIllllllllI[50]] = lIlIIllIlIllIIl("l0LzD92NTqQWt60NoRaUXV6xADmrht159+Qqsnm0ljwEhX2xCvJDeo0Ra6xdM/ZTifXAINxrnXo=", "TBjHK");
        lIIIlllllllIl[lIIIllllllllI[51]] = lIlIIllIlIllIII("DS0XH20rOAc=", "OAbzM");
        lIIIlllllllIl[lIIIllllllllI[52]] = lIlIIllIlIllIlI("AqCBQtOzbG3k70lPCmU8KQ==", "zNaPN");
        lIIIlllllllIl[lIIIllllllllI[53]] = lIlIIllIlIllIlI("nQ9qZKm70sTUfN8+Gl1Mbg==", "Npabh");
        lIIIlllllllIl[lIIIllllllllI[54]] = lIlIIllIlIllIII("BzYWJjYtZBMxNA==", "HDwHQ");
        lIIIlllllllIl[lIIIllllllllI[55]] = lIlIIllIlIllIIl("Zq3pCHPCiGcE4EYZDbX5yw==", "nlUoW");
        lIIIlllllllIl[lIIIllllllllI[62]] = lIlIIllIlIllIII("NBwpPysdUw86Mh8cJjIhCg==", "ssKSB");
        lIIIlllllllIl[lIIIllllllllI[63]] = lIlIIllIlIllIII("ADAaPmUdP1QuIBM1ADFlWg==", "rYtYE");
        lIIIlllllllIl[lIIIllllllllI[64]] = lIlIIllIlIllIII("MTA4eg==", "hUKTv");
        lIIIlllllllIl[lIIIllllllllI[65]] = lIlIIllIlIllIlI("wa4ny8+vqE8xgThAiBj9ZQK5E4DeTv59tcnur1av2Dp326Mi13EaZLP8PKB3zdyw08tmMDghTgE=", "glMVG");
        lIIIlllllllIl[lIIIllllllllI[66]] = lIlIIllIlIllIlI("j+XxNtQBAZstxZCVlaDmcy4ctny0AkEmifc8fbuu4kc=", "XDGSX");
        lIIIlllllllIl[lIIIllllllllI[67]] = lIlIIllIlIllIIl("b0o5lQ8cwsmUIbvlsA882LMqJO2WEf7NPDskdM3UOp8=", "KPCum");
        lIIIlllllllIl[lIIIllllllllI[68]] = lIlIIllIlIllIIl("uJgXTs/qCXy1c2BY/j7rAyCgQjX+KwlcEkRdtkKnd0Q=", "uOjnA");
        lIIIlllllllIl[lIIIllllllllI[69]] = lIlIIllIlIllIIl("I3OUMzqghUnlhhHqWKPZpZ/LCh2WYOVhnlqwsRs3X5Q=", "ysfBW");
        lIIIlllllllIl[lIIIllllllllI[70]] = lIlIIllIlIllIlI("d0rbz9Bp19gqm7WtA4Eo7Bh+gfE1H6io", "jvGgH");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x04c4, code lost:
        if (lIlIIllIllIIlII(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0521, code lost:
        if (lIlIIllIlIlllIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v321, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v330, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v365, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bA() {
        if (lIlIIllIlIlllIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[0]];
            C0001b.a(bA);
            if (lIlIIllIlIllllI(bA.size(), lIIIllllllllI[1])) {
                System.out.println(lIIIlllllllIl[lIIIllllllllI[1]]);
                by = lIIIllllllllI[0];
            }
        }
        if (lIlIIllIlIlllll(by ? 1 : 0)) {
            if (lIlIIllIlIlllIl(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIllIlIllllI(Movement.getRunEnergy(), lIIIllllllllI[2]) && lIlIIllIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0005f.ba).interact(lIIIlllllllIl[lIIIllllllllI[3]]);
                Time.sleepTicks(lIIIllllllllI[1]);
                "".length();
            }
            if (lIlIIllIlIlllll(S() ? 1 : 0) && lIlIIllIlIllllI(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIllIllIIIII(nearest) && lIlIIllIlIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[5]];
                    C0000a.a(nearest);
                }
                if (lIlIIllIllIIIII(nearest) && lIlIIllIlIlllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIllIlIlllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[6]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIllllllllI[7]);
                        "".length();
                    }
                    if (lIlIIllIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[8]];
                        if (lIlIIllIllIIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIllllllllI[6]);
                            "".length();
                        }
                        if (lIlIIllIllIIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIllllllllI[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIllllllllI[1]];
                        iArr[lIIIllllllllI[0]] = lIIIllllllllI[9];
                        if (lIlIIllIlIlllIl(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIllllllllI[1]];
                            iArr2[lIIIllllllllI[0]] = lIIIllllllllI[9];
                            if (lIlIIllIlIllllI(Bank.getFirst(iArr2).getQuantity(), lIIIllllllllI[5])) {
                                W();
                                System.out.println(lIIIlllllllIl[lIIIllllllllI[10]]);
                                by = lIIIllllllllI[1];
                                return;
                            }
                        }
                        int[] iArr3 = new int[lIIIllllllllI[8]];
                        iArr3[lIIIllllllllI[0]] = lIIIllllllllI[11];
                        iArr3[lIIIllllllllI[1]] = lIIIllllllllI[12];
                        iArr3[lIIIllllllllI[3]] = lIIIllllllllI[9];
                        iArr3[lIIIllllllllI[5]] = lIIIllllllllI[13];
                        iArr3[lIIIllllllllI[6]] = lIIIllllllllI[14];
                        if (lIlIIllIlIlllll(C0004e.b(iArr3) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllllllIl[lIIIllllllllI[15]]);
                            by = lIIIllllllllI[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[lIIIllllllllI[8]];
                    iArr4[lIIIllllllllI[0]] = lIIIllllllllI[11];
                    iArr4[lIIIllllllllI[1]] = lIIIllllllllI[12];
                    iArr4[lIIIllllllllI[3]] = lIIIllllllllI[9];
                    iArr4[lIIIllllllllI[5]] = lIIIllllllllI[13];
                    iArr4[lIIIllllllllI[6]] = lIIIllllllllI[14];
                    if (lIlIIllIlIlllIl(C0004e.b(iArr4) ? 1 : 0)) {
                        Bank.withdraw(lIIIllllllllI[11], lIIIllllllllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllllllI[1]);
                        "".length();
                        Bank.withdraw(lIIIllllllllI[12], lIIIllllllllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllllllI[1]);
                        "".length();
                        Bank.withdraw(lIIIllllllllI[9], lIIIllllllllI[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllllllI[1]);
                        "".length();
                        Bank.withdraw(lIIIllllllllI[13], lIIIllllllllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllllllI[1]);
                        "".length();
                        Bank.withdraw(lIIIllllllllI[14], lIIIllllllllI[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllllllI[1]);
                        "".length();
                        C0000a.b(C0005f.bk, lIIIllllllllI[1]);
                        Time.sleepTicks(lIIIllllllllI[5]);
                        "".length();
                    }
                }
            }
            if (lIlIIllIlIlllIl(S() ? 1 : 0) && lIlIIllIlIllllI(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[1])) {
                if (lIlIIllIlIllllI(bY, lIIIllllllllI[1])) {
                    C0004e.w();
                    bY += lIIIllllllllI[1];
                }
                if (lIlIIllIllIIIIl(bY)) {
                    if (lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[16]];
                        Movement.walkTo(ga);
                        "".length();
                        Time.sleepTicks(lIIIllllllllI[1]);
                        "".length();
                    }
                    if (lIlIIllIllIIIll(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[17]];
                        String[] strArr = new String[lIIIllllllllI[1]];
                        strArr[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[18]];
                        TileObject nearest2 = TileObjects.getNearest(strArr);
                        if (lIlIIllIllIIIII(nearest2)) {
                            String[] strArr2 = new String[lIIIllllllllI[1]];
                            strArr2[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[19]];
                            if (lIlIIllIlIlllIl(nearest2.hasAction(strArr2) ? 1 : 0)) {
                                nearest2.interact(lIIIlllllllIl[lIIIllllllllI[20]]);
                                Time.sleepTicks(lIIIllllllllI[5]);
                                "".length();
                            }
                        }
                        C0006g.a(lIIIlllllllIl[lIIIllllllllI[21]], fZ);
                    }
                }
            }
            int[] iArr5 = new int[lIIIllllllllI[1]];
            iArr5[lIIIllllllllI[0]] = lIIIllllllllI[22];
            if (lIlIIllIllIIIII(NPCs.getNearest(iArr5))) {
                int[] iArr6 = new int[lIIIllllllllI[1]];
                iArr6[lIIIllllllllI[0]] = lIIIllllllllI[23];
                if (lIlIIllIllIIIII(NPCs.getNearest(iArr6))) {
                    int[] iArr7 = new int[lIIIllllllllI[1]];
                    iArr7[lIIIllllllllI[0]] = lIIIllllllllI[24];
                }
            }
            C0006g.a(fZ);
            if (lIlIIllIllIIlIl(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[5])) {
                String[] strArr3 = new String[lIIIllllllllI[1]];
                strArr3[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[25]];
                if (lIlIIllIlIlllll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIllllllllI[1]];
                    strArr4[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[26]];
                }
                int[] iArr8 = new int[lIIIllllllllI[1]];
                iArr8[lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (lIlIIllIlIlllIl(Inventory.contains(iArr8) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[27]];
                    String[] strArr5 = new String[lIIIllllllllI[1]];
                    strArr5[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[28]];
                    Item first = Inventory.getFirst(strArr5);
                    String[] strArr6 = new String[lIIIllllllllI[1]];
                    strArr6[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[29]];
                    Item first2 = Inventory.getFirst(strArr6);
                    int[] iArr9 = new int[lIIIllllllllI[1]];
                    iArr9[lIIIllllllllI[0]] = lIIIllllllllI[9];
                    Item first3 = Inventory.getFirst(iArr9);
                    if (lIlIIllIllIIIII(first) && lIlIIllIllIIIII(first3)) {
                        first.useOn(first3);
                        Time.sleepTicks(lIIIllllllllI[1]);
                        "".length();
                    }
                    int[] iArr10 = new int[lIIIllllllllI[1]];
                    iArr10[lIIIllllllllI[0]] = lIIIllllllllI[9];
                    Item first4 = Inventory.getFirst(iArr10);
                    if (lIlIIllIllIIIII(first2) && lIlIIllIllIIIII(first4)) {
                        first2.useOn(first4);
                    }
                }
            }
            if (lIlIIllIllIIlIl(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[5])) {
                int[] iArr11 = new int[lIIIllllllllI[1]];
                iArr11[lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (lIlIIllIlIlllll(Inventory.contains(iArr11) ? 1 : 0)) {
                    String[] strArr7 = new String[lIIIllllllllI[1]];
                    strArr7[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[30]];
                    if (lIlIIllIlIlllll(Inventory.contains(strArr7) ? 1 : 0)) {
                        bm();
                    }
                }
            }
            if (lIlIIllIllIIlIl(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[5])) {
                int[] iArr12 = new int[lIIIllllllllI[1]];
                iArr12[lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (lIlIIllIlIlllIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    String[] strArr8 = new String[lIIIllllllllI[1]];
                    strArr8[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[31]];
                    if (lIlIIllIlIlllIl(Inventory.contains(strArr8) ? 1 : 0)) {
                        co = lIIIllllllllI[0];
                        if (lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                            AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[32]];
                            Movement.walkTo(ga);
                            "".length();
                            Time.sleepTicks(lIIIllllllllI[1]);
                            "".length();
                        }
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[33]];
                        C0006g.a(lIIIlllllllIl[lIIIllllllllI[34]], fZ, lIIIllllllllI[1]);
                    }
                }
            }
            if (lIlIIllIllIIlIl(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[35])) {
                String[] strArr9 = new String[lIIIllllllllI[1]];
                strArr9[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[36]];
                if (lIlIIllIlIlllll(Inventory.contains(strArr9) ? 1 : 0)) {
                    bm();
                }
            }
            if (lIlIIllIllIIlIl(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[35])) {
                String[] strArr10 = new String[lIIIllllllllI[1]];
                strArr10[lIIIllllllllI[0]] = lIIIlllllllIl[lIIIllllllllI[37]];
                if (lIlIIllIlIlllIl(Inventory.contains(strArr10) ? 1 : 0)) {
                    if (lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[38]];
                        Movement.walkTo(ga);
                        "".length();
                        Time.sleepTicks(lIIIllllllllI[1]);
                        "".length();
                    }
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[39]];
                    C0006g.a(lIIIlllllllIl[lIIIllllllllI[40]], fZ, lIIIllllllllI[1]);
                }
            }
            if (lIlIIllIllIIlIl(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[41])) {
                int[] iArr13 = new int[lIIIllllllllI[1]];
                iArr13[lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (lIlIIllIlIlllll(Inventory.contains(iArr13) ? 1 : 0)) {
                    bm();
                }
            }
            if (lIlIIllIllIIlIl(C0004e.j(lIIIllllllllI[4]), lIIIllllllllI[41])) {
                int[] iArr14 = new int[lIIIllllllllI[1]];
                iArr14[lIIIllllllllI[0]] = lIIIllllllllI[9];
                if (lIlIIllIlIlllIl(Inventory.contains(iArr14) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[42]];
                    if (lIlIIllIlIllllI(co, lIIIllllllllI[1])) {
                        P.lx += lIIIllllllllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIllllllllI[1];
                        P.lx = lIIIllllllllI[0];
                        cp = lIIIllllllllI[0];
                    }
                    if (lIlIIllIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(ga), lIIIllllllllI[8])) {
                        AccBuilderRat.c = lIIIlllllllIl[lIIIllllllllI[43]];
                        Movement.walkTo(ga);
                        "".length();
                        Time.sleepTicks(lIIIllllllllI[1]);
                        "".length();
                    }
                    C0006g.a(lIIIlllllllIl[lIIIllllllllI[44]], fZ, lIIIllllllllI[1]);
                }
            }
            Widget widget = Widgets.get(lIIIllllllllI[45], lIIIllllllllI[26]);
            if (lIlIIllIllIIIII(widget)) {
                widget.interact(lIIIllllllllI[0]);
            }
            C0006g.a(new String[lIIIllllllllI[0]]);
        }
    }
}
