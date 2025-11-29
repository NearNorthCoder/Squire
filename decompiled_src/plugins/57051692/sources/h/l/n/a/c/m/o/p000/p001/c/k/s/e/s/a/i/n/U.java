package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.U  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/U.class */
public class U implements K {
    private static /* synthetic */ int[] lIllIllIll;
    public static final /* synthetic */ int kA;
    public static final /* synthetic */ int kB;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ WorldPoint kD;
    public static /* synthetic */ List<C0003d> bp;
    public static final /* synthetic */ WorldPoint kE;
    public static final /* synthetic */ int kC;
    private static /* synthetic */ String[] lIllIlIlIl;

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        dj();
        return lIllIllIll[33];
    }

    private static void lIIllIlIIIIll() {
        lIllIlIlIl = new String[lIllIllIll[41]];
        lIllIlIlIl[lIllIllIll[0]] = lIIllIIlIlllI("DJ089WnbLiPCD7qZ+JfGmg==", "UjKvd");
        lIllIlIlIl[lIllIllIll[1]] = lIIllIIlIlllI("ek/RTKk0HkJ5s299wHaO8GuHrQ3ZfUVV85aQaDcVowCZL+7fDFweXtRGJFS0atLUZa6hOYWTT90=", "bVDJl");
        lIllIlIlIl[lIllIllIll[2]] = lIIllIIlIllll("AioMOAMtPxM/A2w/FXEGLSUR", "LKzQd");
        lIllIlIlIl[lIllIllIll[3]] = lIIllIIlIllll("HSYIKBg8KQFsFjQpDSUaMg==", "UGfLt");
        lIllIlIlIl[lIllIllIll[7]] = lIIllIIlIlllI("PC9af6Xk6YnBizw0V6FJ54aZseHDhu2NOPuU2FxbHJ2Zb8cty40LUnJpSjOjToeo", "BbfgJ");
        lIllIlIlIl[lIllIllIll[10]] = lIIllIIlIllll("Jwp0DDMVTzkEMgMGOgphAxokHS0ZCidBYQMYPRkiGAY6CmEEAHQvFCkmGio=", "poTmA");
        lIllIlIlIl[lIllIllIll[12]] = lIIllIIlIlllI("SGlZ3Xwjr5ZwO2em2C1HzbW4Mxlv0Uw6rXSER1tteiZLnSeZPwNaAXA1/lyLZWyJ", "GKeib");
        lIllIlIlIl[lIllIllIll[15]] = lIIllIIlIllll("NhQdKxwaCw9iCAYABA==", "sehBl");
        lIllIlIlIl[lIllIllIll[16]] = lIIllIIlIllll("BwAuFw==", "PeOeR");
        lIllIlIlIl[lIllIllIll[17]] = lIIllIIlIllll("GRUFOBY2ABZxBThUATAfMBE=", "WtsQq");
        lIllIlIlIl[lIllIllIll[18]] = lIIllIIllIIII("FUOu3TQXqe4=", "TQMhK");
        lIllIlIlIl[lIllIllIll[19]] = lIIllIIlIlllI("xGteQFqjoo0=", "fHcvG");
        lIllIlIlIl[lIllIllIll[20]] = lIIllIIllIIII("2PVkoK5/quM=", "LlydC");
        lIllIlIlIl[lIllIllIll[34]] = lIIllIIlIlllI("Ju36F9N7AHc=", "hLWsR");
        lIllIlIlIl[lIllIllIll[36]] = lIIllIIlIlllI("8cyW4DmkxeszHc2hJYFcMl106sfs9/gt", "MlPsx");
        lIllIlIlIl[lIllIllIll[5]] = lIIllIIlIllll("IBgoLkI9F2YtFzcdLycFeg==", "RqFIb");
    }

    private static boolean lIIllIlIIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIIllIlIIlIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIllIlIIllII(int i, int i2) {
        return i <= i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIllIlIlIl[lIllIllIll[34]];
    }

    private static void lIIllIlIIIlII() {
        lIllIllIll = new int[42];
        lIllIllIll[0] = ((110 ^ 74) ^ (101 ^ 111)) & (((7 ^ 25) ^ (160 ^ 144)) ^ (-" ".length()));
        lIllIllIll[1] = " ".length();
        lIllIllIll[2] = "  ".length();
        lIllIllIll[3] = "   ".length();
        lIllIllIll[4] = (-8231) & 13230;
        lIllIllIll[5] = (((36 + 126) - 120) + 109) ^ (((86 + 144) - 218) + 140);
        lIllIllIll[6] = (-((-309) & 27511)) & (-1025) & 28543;
        lIllIllIll[7] = 139 ^ 143;
        lIllIllIll[8] = 12 ^ 18;
        lIllIllIll[9] = (-((-2499) & 20467)) & (-129) & 18431;
        lIllIllIll[10] = (34 ^ 43) ^ (128 ^ 140);
        lIllIllIll[11] = (-((-8197) & 14853)) & (-17545) & 24559;
        lIllIllIll[12] = (8 ^ 112) ^ (33 ^ 95);
        lIllIllIll[13] = (-9221) & 11772;
        lIllIllIll[14] = 189 ^ 164;
        lIllIllIll[15] = 86 ^ 81;
        lIllIllIll[16] = 36 ^ 44;
        lIllIllIll[17] = (((81 + 86) - 79) + 44) ^ (((131 + 41) - 45) + 14);
        lIllIllIll[18] = 47 ^ 37;
        lIllIllIll[19] = (((105 + 41) - 93) + 86) ^ (((27 + 56) - 62) + 107);
        lIllIllIll[20] = (70 ^ 113) ^ (7 ^ 60);
        lIllIllIll[21] = (-(47 ^ 43)) & (-513) & 65515;
        lIllIllIll[22] = ((176 + 124) - 150) + 100;
        lIllIllIll[23] = (-((-5409) & 24369)) & (-8385) & 27644;
        lIllIllIll[24] = (-14347) & 14846;
        lIllIllIll[25] = ((96 + 43) - 66) + 127;
        lIllIllIll[26] = 49 ^ 37;
        lIllIllIll[27] = (-8225) & 10224;
        lIllIllIll[28] = (-20753) & 32732;
        lIllIllIll[29] = (-6167) & 31166;
        lIllIllIll[30] = (-((-5131) & 21691)) & (-1) & 24567;
        lIllIllIll[31] = (35 ^ 81) ^ (30 ^ 68);
        lIllIllIll[32] = (-((-13190) & 30607)) & (-12353) & 30669;
        lIllIllIll[33] = 39 ^ 67;
        lIllIllIll[34] = 117 ^ 120;
        lIllIllIll[35] = (4 ^ 119) ^ (155 ^ 139);
        lIllIllIll[36] = (164 ^ 163) ^ (176 ^ 185);
        lIllIllIll[37] = (-((-39) & 24879)) & (-51) & 28159;
        lIllIllIll[38] = (-((-97) & 29682)) & (-11) & 32763;
        lIllIllIll[39] = (-((-78) & 17279)) & (-8193) & 28665;
        lIllIllIll[40] = (-((-5197) & 29789)) & (-260) & 28031;
        lIllIllIll[41] = 125 ^ 109;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIllIlIIlIlI(Skills.getLevel(Skill.COOKING), lIllIllIll[35])) {
            ?? r0 = lIllIllIll[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIllIll[0];
    }

    static {
        lIIllIlIIIlII();
        lIIllIlIIIIll();
        kA = lIllIllIll[6];
        kC = lIllIllIll[11];
        kB = lIllIllIll[9];
        kD = new WorldPoint(lIllIllIll[37], lIllIllIll[38], lIllIllIll[0]);
        kE = new WorldPoint(lIllIllIll[39], lIllIllIll[40], lIllIllIll[0]);
        bp = new ArrayList();
    }

    private static boolean lIIllIlIIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static String lIIllIIlIlllI(String lllllllllllllllllllIIIIlIlllllll, String lllllllllllllllllllIIIIlIllllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIlIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIIllIIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIIllIIIIIIl.init(lIllIllIll[2], secretKeySpec);
            return new String(lllllllllllllllllllIIIIllIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIllIIIIIII) {
            lllllllllllllllllllIIIIllIIIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIllIll[0];
    }

    private static String lIIllIIlIllll(String lllllllllllllllllllIIIIllIIlIlII, String lllllllllllllllllllIIIIllIIlIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIIllIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllllIIIIllIIlIIIl = lllllllllllllllllllIIIIllIIlIIll.toCharArray();
        int lllllllllllllllllllIIIIllIIlIIII = lIllIllIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIllIll[0];
        while (lIIllIlIIIllI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllllllIIIIllIIlIIIl[lllllllllllllllllllIIIIllIIlIIII % lllllllllllllllllllIIIIllIIlIIIl.length]));
            "".length();
            lllllllllllllllllllIIIIllIIlIIII++;
            i++;
            "".length();
            if (((212 ^ 134) ^ (40 ^ 126)) == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIllIlIIlIIl(int i) {
        return i > 0;
    }

    private static boolean lIIllIlIIlIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIlIIIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    public static void dj() {
        if (lIIllIlIIIlIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[0]];
            C0001b.a(bp);
            if (lIIllIlIIIllI(bp.size(), lIllIllIll[1])) {
                System.out.println(lIllIlIlIl[lIllIllIll[1]]);
                bn = lIllIllIll[0];
            }
        }
        if (lIIllIlIIIlll(bn ? 1 : 0)) {
            if (lIIllIlIIIlll(al() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIllIlIIlIII(nearest) && lIIllIlIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[2]];
                    C0000a.a(nearest);
                }
                if (lIIllIlIIlIII(nearest) && lIIllIlIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[3]];
                    if (lIIllIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIllIllIll[4]);
                        "".length();
                    }
                    if (lIIllIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllIlIIlIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIllIllIll[1]);
                            "".length();
                        }
                        if (lIIllIlIIlIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIllIllIll[2]);
                            "".length();
                        }
                    }
                    if (lIIllIlIIIllI(Skills.getLevel(Skill.COOKING), lIllIllIll[5])) {
                        int[] iArr = new int[lIllIllIll[1]];
                        iArr[lIllIllIll[0]] = lIllIllIll[6];
                        if (lIIllIlIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                            O();
                            System.out.println(lIllIlIlIl[lIllIllIll[7]]);
                            bn = lIllIllIll[1];
                            return;
                        }
                    }
                    if (lIIllIlIIlIlI(Skills.getLevel(Skill.COOKING), lIllIllIll[5]) && lIIllIlIIIllI(Skills.getLevel(Skill.COOKING), lIllIllIll[8])) {
                        int[] iArr2 = new int[lIllIllIll[1]];
                        iArr2[lIllIllIll[0]] = lIllIllIll[9];
                        if (lIIllIlIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                            O();
                            System.out.println(lIllIlIlIl[lIllIllIll[10]]);
                            bn = lIllIllIll[1];
                            return;
                        }
                    }
                    if (lIIllIlIIlIlI(Skills.getLevel(Skill.COOKING), lIllIllIll[8])) {
                        int[] iArr3 = new int[lIllIllIll[1]];
                        iArr3[lIllIllIll[0]] = lIllIllIll[11];
                        if (lIIllIlIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                            O();
                            System.out.println(lIllIlIlIl[lIllIllIll[12]]);
                            bn = lIllIllIll[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[lIllIllIll[1]];
                    iArr4[lIllIllIll[0]] = lIllIllIll[13];
                    if (lIIllIlIIIlll(Equipment.contains(iArr4) ? 1 : 0) && lIIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(kE), lIllIllIll[14])) {
                        C0000a.b(C0005f.aM, lIllIllIll[1]);
                        Time.sleepTicks(lIllIllIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIllIllIll[1]];
                            iArr5[lIllIllIll[0]] = lIllIllIll[13];
                            if (lIIllIlIIlIIl(Inventory.getCount(iArr5))) {
                                ?? r0 = lIllIllIll[1];
                                "".length();
                                return (-(154 ^ 159)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllIllIll[0];
                        }, lIllIllIll[4]);
                        "".length();
                    }
                    if (lIIllIlIIIllI(Skills.getLevel(Skill.COOKING), lIllIllIll[5])) {
                        Bank.withdrawAll(lIllIllIll[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIllIllIll[1]];
                            iArr5[lIllIllIll[0]] = lIllIllIll[6];
                            if (lIIllIlIIlIIl(Inventory.getCount(iArr5))) {
                                ?? r0 = lIllIllIll[1];
                                "".length();
                                return "   ".length() < "   ".length() ? ((15 ^ 85) ^ (216 ^ 159)) & (((234 ^ 131) ^ (49 ^ 69)) ^ (-" ".length())) : r0;
                            }
                            return lIllIllIll[0];
                        }, lIllIllIll[4]);
                        "".length();
                    }
                    if (lIIllIlIIlIlI(Skills.getLevel(Skill.COOKING), lIllIllIll[5]) && lIIllIlIIIllI(Skills.getLevel(Skill.COOKING), lIllIllIll[8])) {
                        Bank.withdrawAll(lIllIllIll[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIllIllIll[1]];
                            iArr5[lIllIllIll[0]] = lIllIllIll[9];
                            if (lIIllIlIIlIIl(Inventory.getCount(iArr5))) {
                                ?? r0 = lIllIllIll[1];
                                "".length();
                                return ((((92 + 154) - 130) + 41) ^ (((45 + 63) - (-8)) + 37)) != ((((150 + 0) - 7) + 33) ^ (((62 + 136) - 189) + 171)) ? ((((133 + 135) - 249) + 132) ^ (((126 + 49) - 115) + 92)) & (((227 ^ 171) ^ (102 ^ 33)) ^ (-" ".length())) : r0;
                            }
                            return lIllIllIll[0];
                        }, lIllIllIll[4]);
                        "".length();
                    }
                    if (lIIllIlIIlIlI(Skills.getLevel(Skill.COOKING), lIllIllIll[8])) {
                        Bank.withdrawAll(lIllIllIll[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIllIllIll[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIllIllIll[1]];
                            iArr5[lIllIllIll[0]] = lIllIllIll[11];
                            if (lIIllIlIIlIIl(Inventory.getCount(iArr5))) {
                                ?? r0 = lIllIllIll[1];
                                "".length();
                                return "   ".length() < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIllIllIll[0];
                        }, lIllIllIll[4]);
                        "".length();
                    }
                }
            }
            if (lIIllIlIIIlIl(al() ? 1 : 0)) {
                int[] iArr5 = new int[lIllIllIll[1]];
                iArr5[lIllIllIll[0]] = lIllIllIll[13];
                if (lIIllIlIIIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIllIllIll[1]];
                    iArr6[lIllIllIll[0]] = lIllIllIll[13];
                    if (lIIllIlIIIlll(Equipment.contains(iArr6) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[15]];
                        int[] iArr7 = new int[lIllIllIll[1]];
                        iArr7[lIllIllIll[0]] = lIllIllIll[13];
                        Item first = Inventory.getFirst(iArr7);
                        if (lIIllIlIIlIII(first)) {
                            first.interact(lIllIlIlIl[lIllIllIll[16]]);
                            Time.sleepTicks(lIllIllIll[3]);
                            "".length();
                        }
                    }
                }
                if (lIIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(kE), lIllIllIll[10])) {
                    AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[17]];
                    Movement.walkTo(kE);
                    "".length();
                    Time.sleepTicks(lIllIllIll[7]);
                    "".length();
                }
                if (lIIllIlIIllII(Players.getLocal().getWorldLocation().distanceTo(kE), lIllIllIll[10])) {
                    AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[18]];
                    WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                    String[] strArr = new String[lIllIllIll[1]];
                    strArr[lIllIllIll[0]] = lIllIlIlIl[lIllIllIll[19]];
                    TileObject nearest2 = TileObjects.getNearest(worldLocation, strArr);
                    if (lIIllIlIIlIII(nearest2)) {
                        if (lIIllIlIIIlll(Production.isOpen() ? 1 : 0)) {
                            nearest2.interact(lIllIlIlIl[lIllIllIll[20]]);
                            Time.sleepTicks(lIllIllIll[2]);
                            "".length();
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIllIllIll[4]);
                            "".length();
                        }
                        if (lIIllIlIIIlIl(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption(lIllIllIll[1]);
                            Time.sleepTicks(lIllIllIll[7]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (!lIIllIlIIIlIl(al() ? 1 : 0) || lIIllIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIllIllIll[1];
                                    "".length();
                                    return ((((138 + 102) - 71) + 2) ^ (((130 + 165) - 212) + 92)) < (-" ".length()) ? ((((84 + 12) - (-23)) + 85) ^ (((5 + 195) - 193) + 192)) & (((110 ^ 69) ^ (166 ^ 134)) ^ (-" ".length())) : r0;
                                }
                                return lIllIllIll[0];
                            }, lIllIllIll[21]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllIlIIIllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private static boolean al() {
        if (lIIllIlIIlIlI(Skills.getLevel(Skill.COOKING), lIllIllIll[8])) {
            int[] iArr = new int[lIllIllIll[1]];
            iArr[lIllIllIll[0]] = lIllIllIll[11];
            if (lIIllIlIIlIIl(Inventory.getCount(iArr))) {
                ?? r0 = lIllIllIll[1];
                "".length();
                return (70 ^ 66) < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIllIll[0];
        } else if (lIIllIlIIlIlI(Skills.getLevel(Skill.COOKING), lIllIllIll[5]) && lIIllIlIIIllI(Skills.getLevel(Skill.COOKING), lIllIllIll[8])) {
            int[] iArr2 = new int[lIllIllIll[1]];
            iArr2[lIllIllIll[0]] = lIllIllIll[9];
            if (lIIllIlIIlIIl(Inventory.getCount(iArr2))) {
                ?? r02 = lIllIllIll[1];
                "".length();
                return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
            }
            return lIllIllIll[0];
        } else {
            int[] iArr3 = new int[lIllIllIll[1]];
            iArr3[lIllIllIll[0]] = lIllIllIll[6];
            if (lIIllIlIIlIIl(Inventory.getCount(iArr3))) {
                ?? r03 = lIllIllIll[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((false ^ true) ^ true) : r03;
            }
            return lIllIllIll[0];
        }
    }

    private static void O() {
        if (lIIllIlIIIllI(Skills.getLevel(Skill.COOKING), lIllIllIll[5])) {
            bp.add(new C0003d(lIllIllIll[6], lIllIllIll[22], lIllIllIll[23]));
            "".length();
        }
        if (lIIllIlIIlIlI(Skills.getLevel(Skill.COOKING), lIllIllIll[5]) && lIIllIlIIIllI(Skills.getLevel(Skill.COOKING), lIllIllIll[8])) {
            bp.add(new C0003d(lIllIllIll[9], lIllIllIll[24], lIllIllIll[25]));
            "".length();
        }
        if (lIIllIlIIlIlI(Skills.getLevel(Skill.COOKING), lIllIllIll[8])) {
            bp.add(new C0003d(lIllIllIll[11], lIllIllIll[24], lIllIllIll[25]));
            "".length();
        }
        if (lIIllIlIIIlll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIllIlIlIl[lIllIllIll[5]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIll[13], lIllIllIll[26], lIllIllIll[27]));
            "".length();
        }
        if (lIIllIlIIIlll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllIlIlIl[lIllIllIll[36]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIll[28], lIllIllIll[10], lIllIllIll[29]));
            "".length();
        }
        int[] iArr = new int[lIllIllIll[1]];
        iArr[lIllIllIll[0]] = lIllIllIll[30];
        if (lIIllIlIIIlll(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIllIllIll[30], lIllIllIll[31], lIllIllIll[32]));
            "".length();
        }
    }

    private static String lIIllIIllIIII(String lllllllllllllllllllIIIIlIlllIIlI, String lllllllllllllllllllIIIIlIlllIIIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIlIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIlIlllIIIl.getBytes(StandardCharsets.UTF_8)), lIllIllIll[16]), "DES");
            Cipher lllllllllllllllllllIIIIlIlllIlII = Cipher.getInstance("DES");
            lllllllllllllllllllIIIIlIlllIlII.init(lIllIllIll[2], lllllllllllllllllllIIIIlIlllIlIl);
            return new String(lllllllllllllllllllIIIIlIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIlIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIIIlIlllIIll) {
            lllllllllllllllllllIIIIlIlllIIll.printStackTrace();
            return null;
        }
    }
}
