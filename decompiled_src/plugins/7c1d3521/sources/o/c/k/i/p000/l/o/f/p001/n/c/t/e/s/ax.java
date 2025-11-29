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
import net.runelite.api.TileObject;
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
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.ax  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/ax.class */
public class ax implements InterfaceC0003ac {
    private static /* synthetic */ int[] llIllllIII;
    public static final /* synthetic */ int oC;
    public static final /* synthetic */ int oB;
    public static final /* synthetic */ WorldPoint oF;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] llIlllIlll;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int oD;
    public static final /* synthetic */ WorldPoint oE;

    private static void lIlllIlIIlllI() {
        llIllllIII = new int[42];
        llIllllIII[0] = (191 ^ 134) & ((170 ^ 147) ^ (-1));
        llIllllIII[1] = " ".length();
        llIllllIII[2] = "  ".length();
        llIllllIII[3] = "   ".length();
        llIllllIII[4] = (-((-4883) & 15222)) & (-16405) & 31743;
        llIllllIII[5] = 153 ^ 150;
        llIllllIII[6] = (-14531) & 14847;
        llIllllIII[7] = 23 ^ 19;
        llIllllIII[8] = 30 ^ 0;
        llIllllIII[9] = (-10769) & 11103;
        llIllllIII[10] = (83 ^ 71) ^ (169 ^ 184);
        llIllllIII[11] = (-22041) & 22399;
        llIllllIII[12] = (1 ^ 99) ^ (53 ^ 81);
        llIllllIII[13] = (-((-10828) & 31311)) & (-9217) & 32251;
        llIllllIII[14] = (((54 + 89) - 107) + 99) ^ (((84 + 59) - (-15)) + 0);
        llIllllIII[15] = (87 ^ 44) ^ (56 ^ 68);
        llIllllIII[16] = (170 ^ 132) ^ (174 ^ 136);
        llIllllIII[17] = 67 ^ 74;
        llIllllIII[18] = (66 ^ 104) ^ (189 ^ 157);
        llIllllIII[19] = (180 ^ 193) ^ (102 ^ 24);
        llIllllIII[20] = (249 ^ 163) ^ (217 ^ 143);
        llIllllIII[21] = (-519) & 65518;
        llIllllIII[22] = (((((128 + 138) - 129) + 51) + (101 ^ 65)) - (106 ^ 116)) + (177 ^ 137);
        llIllllIII[23] = (-3140) & 3439;
        llIllllIII[24] = (-5121) & 5620;
        llIllllIII[25] = (((((116 + 4) - (-14)) + 4) + (((14 + 46) - (-57)) + 24)) - (217 ^ 178)) + (127 ^ 99);
        llIllllIII[26] = 177 ^ 165;
        llIllllIII[27] = (-16428) & 18427;
        llIllllIII[28] = (-((-28329) & 28601)) & (-20482) & 32733;
        llIllllIII[29] = (-3074) & 28073;
        llIllllIII[30] = (-((-17409) & 25785)) & (-1) & 16383;
        llIllllIII[31] = 0 ^ 40;
        llIllllIII[32] = (-26698) & 27597;
        llIllllIII[33] = (29 ^ 38) ^ (235 ^ 180);
        llIllllIII[34] = 120 ^ 117;
        llIllllIII[35] = (25 ^ 16) ^ (197 ^ 175);
        llIllllIII[36] = (((39 + 51) - (-15)) + 55) ^ (((34 + 42) - (-46)) + 52);
        llIllllIII[37] = (-12857) & 16125;
        llIllllIII[38] = (-414) & 3581;
        llIllllIII[39] = (-((-16845) & 29693)) & (-16644) & 32763;
        llIllllIII[40] = (-((-16681) & 25403)) & (-386) & 12287;
        llIllllIII[41] = (((67 + 37) - (-4)) + 49) ^ (((54 + 3) - 26) + 110);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private static boolean an() {
        if (lIlllIlIlIlII(Skills.getLevel(Skill.COOKING), llIllllIII[8])) {
            int[] iArr = new int[llIllllIII[1]];
            iArr[llIllllIII[0]] = llIllllIII[11];
            if (lIlllIlIlIIll(Inventory.getCount(iArr))) {
                ?? r0 = llIllllIII[1];
                "".length();
                return "   ".length() <= 0 ? ((((136 + 14) - 47) + 150) ^ (((70 + 17) - (-80)) + 22)) & (((90 ^ 29) ^ (161 ^ 166)) ^ (-" ".length())) : r0;
            }
            return llIllllIII[0];
        } else if (lIlllIlIlIlII(Skills.getLevel(Skill.COOKING), llIllllIII[5]) && lIlllIlIlIIII(Skills.getLevel(Skill.COOKING), llIllllIII[8])) {
            int[] iArr2 = new int[llIllllIII[1]];
            iArr2[llIllllIII[0]] = llIllllIII[9];
            if (lIlllIlIlIIll(Inventory.getCount(iArr2))) {
                ?? r02 = llIllllIII[1];
                "".length();
                return (-"  ".length()) > 0 ? ((((121 + 81) - 86) + 117) ^ (((100 + 72) - 20) + 31)) & (((((110 + 171) - 196) + 142) ^ (((98 + 166) - 125) + 50)) ^ (-" ".length())) : r02;
            }
            return llIllllIII[0];
        } else {
            int[] iArr3 = new int[llIllllIII[1]];
            iArr3[llIllllIII[0]] = llIllllIII[6];
            if (lIlllIlIlIIll(Inventory.getCount(iArr3))) {
                ?? r03 = llIllllIII[1];
                "".length();
                return (((63 ^ 35) & ((89 ^ 69) ^ (-1))) & (((108 ^ 45) & ((192 ^ 129) ^ (-1))) ^ (-1))) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r03;
            }
            return llIllllIII[0];
        }
    }

    private static boolean lIlllIlIlIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIllllIII[0];
    }

    private static void lIlllIlIIllIl() {
        llIlllIlll = new String[llIllllIII[41]];
        llIlllIlll[llIllllIII[0]] = lIlllIlIIlIlI("i73G4hLDXo8LiWJqItHhBA==", "WlYIV");
        llIlllIlll[llIllllIII[1]] = lIlllIlIIlIll("FScXISI7Kx1oMyY3ECY2cycNLTwgYlk7Jjo6GiA4PSlZKjAwJVk8PnMtFic6OiAe", "SNyHQ");
        llIlllIlll[llIllllIII[2]] = lIlllIlIIllII("BnA1Aq4gte2P3W6DH61Y1vcsYDdoyU5A", "dWirW");
        llIlllIlll[llIllllIII[3]] = lIlllIlIIllII("aIL6mIlN7mFlqxIcQpqJGDJJ3Yu5yMIh", "pUQfo");
        llIlllIlll[llIllllIII[7]] = lIlllIlIIllII("1jNkD428wVgHlCUZi1C1iTcS5HbA71m5cD9OPc3PGBnA3FOh1ebRqd7/E8L0Ebpy", "azUPj");
        llIlllIlll[llIllllIII[10]] = lIlllIlIIllII("OXfJ70QmPVgVge/yBcTa8+UPP0J3uJkzVUlmGc8OPS+yL3hK9VNzZADNX95xrJ8E", "FXJvR");
        llIlllIlll[llIllllIII[12]] = lIlllIlIIlIll("Dy1wNQo9aD09CyshPjNYKz0gJBQxLSN4WCs/OSAbMCE+M1gsJ3AWLQEBHhM=", "XHPTx");
        llIlllIlll[llIllllIII[15]] = lIlllIlIIllII("NKoUAWhi9ljHQO5GwU6c8Q==", "lFrCn");
        llIlllIlll[llIllllIII[16]] = lIlllIlIIlIlI("EfiS8cHZBsI=", "ckHRd");
        llIlllIlll[llIllllIII[17]] = lIlllIlIIlIlI("1iN7FAZisXlU2AdGA4+ov6zl9WM5l5cg", "wCBYA");
        llIlllIlll[llIllllIII[18]] = lIlllIlIIlIll("ND4jMisZNg==", "wQLYB");
        llIlllIlll[llIllllIII[19]] = lIlllIlIIlIll("MAIFPQg=", "bckZm");
        llIlllIlll[llIllllIII[20]] = lIlllIlIIlIlI("MWoYjmVmMsE=", "kGmvZ");
        llIlllIlll[llIllllIII[34]] = lIlllIlIIlIll("CgcCPwcnDw==", "IhmTn");
        llIlllIlll[llIllllIII[36]] = lIlllIlIIllII("byXpnk3Usssgap5dmMmfUZf5hHgm0O8E", "sDIFt");
        llIlllIlll[llIllllIII[5]] = lIlllIlIIlIlI("bV4BnM4gUSO3+QaLDVCb/ZKEMOcfUsnj", "WyXLr");
    }

    private static void Q() {
        if (lIlllIlIlIIII(Skills.getLevel(Skill.COOKING), llIllllIII[5])) {
            bv.add(new C0017d(llIllllIII[6], llIllllIII[22], llIllllIII[23]));
            "".length();
        }
        if (lIlllIlIlIlII(Skills.getLevel(Skill.COOKING), llIllllIII[5]) && lIlllIlIlIIII(Skills.getLevel(Skill.COOKING), llIllllIII[8])) {
            bv.add(new C0017d(llIllllIII[9], llIllllIII[24], llIllllIII[25]));
            "".length();
        }
        if (lIlllIlIlIlII(Skills.getLevel(Skill.COOKING), llIllllIII[8])) {
            bv.add(new C0017d(llIllllIII[11], llIllllIII[24], llIllllIII[25]));
            "".length();
        }
        if (lIlllIlIlIIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlllIlll[llIllllIII[5]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIllllIII[13], llIllllIII[26], llIllllIII[27]));
            "".length();
        }
        if (lIlllIlIlIIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIlllIlll[llIllllIII[36]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIllllIII[28], llIllllIII[10], llIllllIII[29]));
            "".length();
        }
        int[] iArr = new int[llIllllIII[1]];
        iArr[llIllllIII[0]] = llIllllIII[30];
        if (lIlllIlIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIllllIII[30], llIllllIII[31], llIllllIII[32]));
            "".length();
        }
    }

    private static boolean lIlllIlIlIIIl(int i) {
        return i == 0;
    }

    private static String lIlllIlIIlIll(String llllllllllllllllllIIIIIIllIIIlIl, String llllllllllllllllllIIIIIIllIIIlII) {
        String llllllllllllllllllIIIIIIllIIIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIIIIllIIIlII.toCharArray();
        int llllllllllllllllllIIIIIIllIIIIIl = llIllllIII[0];
        char[] charArray2 = llllllllllllllllllIIIIIIllIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = llIllllIII[0];
        while (lIlllIlIlIIII(i, length)) {
            char llllllllllllllllllIIIIIIllIIIllI = charArray2[i];
            sb.append((char) (llllllllllllllllllIIIIIIllIIIllI ^ charArray[llllllllllllllllllIIIIIIllIIIIIl % charArray.length]));
            "".length();
            llllllllllllllllllIIIIIIllIIIIIl++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlllIlIIlllI();
        lIlllIlIIllIl();
        oD = llIllllIII[11];
        oC = llIllllIII[9];
        oB = llIllllIII[6];
        oE = new WorldPoint(llIllllIII[37], llIllllIII[38], llIllllIII[0]);
        oF = new WorldPoint(llIllllIII[39], llIllllIII[40], llIllllIII[0]);
        bv = new ArrayList();
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        gz();
        return llIllllIII[33];
    }

    private static boolean lIlllIlIIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlllIlIlIlII(Skills.getLevel(Skill.COOKING), llIllllIII[35])) {
            ?? r0 = llIllllIII[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIllllIII[0];
    }

    private static boolean lIlllIlIlIIlI(Object obj) {
        return obj != null;
    }

    private static String lIlllIlIIllII(String llllllllllllllllllIIIIIIllIlIlIl, String llllllllllllllllllIIIIIIllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIIllIlIlII.getBytes(StandardCharsets.UTF_8)), llIllllIII[16]), "DES");
            Cipher llllllllllllllllllIIIIIIllIlIlll = Cipher.getInstance("DES");
            llllllllllllllllllIIIIIIllIlIlll.init(llIllllIII[2], secretKeySpec);
            return new String(llllllllllllllllllIIIIIIllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIIllIlIllI) {
            llllllllllllllllllIIIIIIllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIIll(int i) {
        return i > 0;
    }

    private static boolean lIlllIlIlIlIl(int i, int i2) {
        return i > i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlllIlll[llIllllIII[34]];
    }

    private static boolean lIlllIlIlIllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlllIlIlIlII(int i, int i2) {
        return i >= i2;
    }

    private static String lIlllIlIIlIlI(String llllllllllllllllllIIIIIIlIllIIII, String llllllllllllllllllIIIIIIlIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIIlIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIIIIlIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIIIIlIllIIlI.init(llIllllIII[2], secretKeySpec);
            return new String(llllllllllllllllllIIIIIIlIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIIlIllIIIl) {
            llllllllllllllllllIIIIIIlIllIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    public static void gz() {
        if (lIlllIlIIllll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlll[llIllllIII[0]];
            C0015b.a(bv);
            if (lIlllIlIlIIII(bv.size(), llIllllIII[1])) {
                System.out.println(llIlllIlll[llIllllIII[1]]);
                bt = llIllllIII[0];
            }
        }
        if (lIlllIlIlIIIl(bt ? 1 : 0)) {
            if (lIlllIlIlIIIl(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlllIlIlIIlI(nearest) && lIlllIlIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[2]];
                    C0000a.a(nearest);
                }
                if (lIlllIlIlIIlI(nearest) && lIlllIlIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[3]];
                    if (lIlllIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIllllIII[4]);
                        "".length();
                    }
                    if (lIlllIlIIllll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlllIlIlIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIllllIII[1]);
                            "".length();
                        }
                        if (lIlllIlIlIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIllllIII[2]);
                            "".length();
                        }
                    }
                    if (lIlllIlIlIIII(Skills.getLevel(Skill.COOKING), llIllllIII[5])) {
                        int[] iArr = new int[llIllllIII[1]];
                        iArr[llIllllIII[0]] = llIllllIII[6];
                        if (lIlllIlIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlllIlll[llIllllIII[7]]);
                            bt = llIllllIII[1];
                            return;
                        }
                    }
                    if (lIlllIlIlIlII(Skills.getLevel(Skill.COOKING), llIllllIII[5]) && lIlllIlIlIIII(Skills.getLevel(Skill.COOKING), llIllllIII[8])) {
                        int[] iArr2 = new int[llIllllIII[1]];
                        iArr2[llIllllIII[0]] = llIllllIII[9];
                        if (lIlllIlIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlllIlll[llIllllIII[10]]);
                            bt = llIllllIII[1];
                            return;
                        }
                    }
                    if (lIlllIlIlIlII(Skills.getLevel(Skill.COOKING), llIllllIII[8])) {
                        int[] iArr3 = new int[llIllllIII[1]];
                        iArr3[llIllllIII[0]] = llIllllIII[11];
                        if (lIlllIlIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlllIlll[llIllllIII[12]]);
                            bt = llIllllIII[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[llIllllIII[1]];
                    iArr4[llIllllIII[0]] = llIllllIII[13];
                    if (lIlllIlIlIIIl(Equipment.contains(iArr4) ? 1 : 0) && lIlllIlIlIlIl(Players.getLocal().getWorldLocation().distanceTo(oF), llIllllIII[14])) {
                        C0000a.b(C0019f.aS, llIllllIII[1]);
                        Time.sleepTicks(llIllllIII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[llIllllIII[1]];
                            iArr5[llIllllIII[0]] = llIllllIII[13];
                            if (lIlllIlIlIIll(Inventory.getCount(iArr5))) {
                                ?? r0 = llIllllIII[1];
                                "".length();
                                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIllllIII[0];
                        }, llIllllIII[4]);
                        "".length();
                    }
                    if (lIlllIlIlIIII(Skills.getLevel(Skill.COOKING), llIllllIII[5])) {
                        Bank.withdrawAll(llIllllIII[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllllIII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[llIllllIII[1]];
                            iArr5[llIllllIII[0]] = llIllllIII[6];
                            if (lIlllIlIlIIll(Inventory.getCount(iArr5))) {
                                ?? r0 = llIllllIII[1];
                                "".length();
                                return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIllllIII[0];
                        }, llIllllIII[4]);
                        "".length();
                    }
                    if (lIlllIlIlIlII(Skills.getLevel(Skill.COOKING), llIllllIII[5]) && lIlllIlIlIIII(Skills.getLevel(Skill.COOKING), llIllllIII[8])) {
                        Bank.withdrawAll(llIllllIII[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllllIII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[llIllllIII[1]];
                            iArr5[llIllllIII[0]] = llIllllIII[9];
                            if (lIlllIlIlIIll(Inventory.getCount(iArr5))) {
                                ?? r0 = llIllllIII[1];
                                "".length();
                                return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIllllIII[0];
                        }, llIllllIII[4]);
                        "".length();
                    }
                    if (lIlllIlIlIlII(Skills.getLevel(Skill.COOKING), llIllllIII[8])) {
                        Bank.withdrawAll(llIllllIII[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIllllIII[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[llIllllIII[1]];
                            iArr5[llIllllIII[0]] = llIllllIII[11];
                            if (lIlllIlIlIIll(Inventory.getCount(iArr5))) {
                                ?? r0 = llIllllIII[1];
                                "".length();
                                return "  ".length() <= 0 ? ((172 ^ 138) ^ (34 ^ 26)) & (((183 ^ 133) ^ (155 ^ 183)) ^ (-" ".length())) : r0;
                            }
                            return llIllllIII[0];
                        }, llIllllIII[4]);
                        "".length();
                    }
                }
            }
            if (lIlllIlIIllll(an() ? 1 : 0)) {
                int[] iArr5 = new int[llIllllIII[1]];
                iArr5[llIllllIII[0]] = llIllllIII[13];
                if (lIlllIlIIllll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIllllIII[1]];
                    iArr6[llIllllIII[0]] = llIllllIII[13];
                    if (lIlllIlIlIIIl(Equipment.contains(iArr6) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlllIlll[llIllllIII[15]];
                        int[] iArr7 = new int[llIllllIII[1]];
                        iArr7[llIllllIII[0]] = llIllllIII[13];
                        Item first = Inventory.getFirst(iArr7);
                        if (lIlllIlIlIIlI(first)) {
                            first.interact(llIlllIlll[llIllllIII[16]]);
                            Time.sleepTicks(llIllllIII[3]);
                            "".length();
                        }
                    }
                }
                if (lIlllIlIlIlIl(Players.getLocal().getWorldLocation().distanceTo(oF), llIllllIII[10])) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[17]];
                    Movement.walkTo(oF);
                    "".length();
                    Time.sleepTicks(llIllllIII[7]);
                    "".length();
                }
                if (lIlllIlIlIllI(Players.getLocal().getWorldLocation().distanceTo(oF), llIllllIII[10])) {
                    AccBuilderSotf.c = llIlllIlll[llIllllIII[18]];
                    WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                    String[] strArr = new String[llIllllIII[1]];
                    strArr[llIllllIII[0]] = llIlllIlll[llIllllIII[19]];
                    TileObject nearest2 = TileObjects.getNearest(worldLocation, strArr);
                    if (lIlllIlIlIIlI(nearest2)) {
                        if (lIlllIlIlIIIl(Production.isOpen() ? 1 : 0)) {
                            nearest2.interact(llIlllIlll[llIllllIII[20]]);
                            Time.sleepTicks(llIllllIII[2]);
                            "".length();
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, llIllllIII[4]);
                            "".length();
                        }
                        if (lIlllIlIIllll(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption(llIllllIII[1]);
                            Time.sleepTicks(llIllllIII[7]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (!lIlllIlIIllll(an() ? 1 : 0) || lIlllIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = llIllllIII[1];
                                    "".length();
                                    return ((45 ^ 89) ^ (14 ^ 126)) <= 0 ? ((13 ^ 80) ^ (58 ^ 94)) & (((((128 + 85) - 204) + 162) ^ (((45 + 97) - 2) + 6)) ^ (-" ".length())) : r0;
                                }
                                return llIllllIII[0];
                            }, llIllllIII[21]);
                            "".length();
                        }
                    }
                }
            }
        }
    }
}
