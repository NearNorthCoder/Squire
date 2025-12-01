package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ai  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/ai.class */
public class ai implements W {
    private static final /* synthetic */ WorldPoint lZ;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIIlIllII;
    public static /* synthetic */ List<C0003d> bv;
    private static final /* synthetic */ WorldPoint lW;
    private static final /* synthetic */ int lS;
    public static /* synthetic */ boolean bW;
    private static final /* synthetic */ WorldPoint lX;
    private static /* synthetic */ String[] lIIlIlIlI;
    private static final /* synthetic */ List<WorldPoint> mb;
    private static final /* synthetic */ int lT;
    private static final /* synthetic */ int lR;
    private static final /* synthetic */ int lU;
    private static final /* synthetic */ WorldArea ma;
    private static final /* synthetic */ int lV;
    private static final /* synthetic */ WorldPoint lY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v157, types: [boolean] */
    public static void eb() {
        if (lllllIIIlll(mb.isEmpty() ? 1 : 0)) {
            mb.add(lW);
            "".length();
            mb.add(lX);
            "".length();
            mb.add(lY);
            "".length();
            mb.add(lZ);
            "".length();
        }
        if (lllllIIIlll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[0]];
            C0001b.a(bv);
            if (lllllIIlIII(bv.size(), lIIlIllII[1])) {
                System.out.println(lIIlIlIlI[lIIlIllII[1]]);
                bt = lIIlIllII[0];
            }
        }
        if (lllllIIlIIl(bt ? 1 : 0)) {
            if (lllllIIlIIl(ab() ? 1 : 0) && lllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllllIIlIlI(nearest) && lllllIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[2]];
                    C0000a.a(nearest);
                }
                if (lllllIIlIlI(nearest) && lllllIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[3]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIllII[4]);
                        "".length();
                    }
                    if (lllllIIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[5]];
                        if (lllllIIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIllII[1]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIllII[1]];
                        iArr[lIIlIllII[0]] = ec();
                        if (lllllIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIlIlI[lIIlIllII[6]]);
                            bt = lIIlIllII[1];
                            return;
                        }
                        int[] iArr2 = new int[lIIlIllII[1]];
                        iArr2[lIIlIllII[0]] = lIIlIllII[7];
                        if (lllllIIlIII(Inventory.getCount(iArr2), lIIlIllII[1])) {
                            Bank.withdraw(lIIlIllII[7], lIIlIllII[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIIlIllII[1]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIIlIllII[1]];
                        iArr3[lIIlIllII[0]] = lIIlIllII[7];
                        if (lllllIIlIll(Inventory.getCount(iArr3))) {
                            int[] iArr4 = new int[lIIlIllII[1]];
                            iArr4[lIIlIllII[0]] = ec();
                            if (lllllIIlIII(Inventory.getCount(iArr4), lIIlIllII[1])) {
                                Bank.withdrawAll(ec(), Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(lIIlIllII[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr5 = new int[lIIlIllII[1]];
                                    iArr5[lIIlIllII[0]] = ec();
                                    if (lllllIIlIll(Inventory.getCount(iArr5))) {
                                        ?? r0 = lIIlIllII[1];
                                        "".length();
                                        return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return lIIlIllII[0];
                                }, lIIlIllII[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lllllIIIlll(ab() ? 1 : 0)) {
                if (lllllIIlIIl(ma.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[8]];
                    Movement.walkTo(lW);
                    "".length();
                    Time.sleepTicks(lIIlIllII[2]);
                    "".length();
                }
                if (lllllIIIlll(ma.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                    String[] strArr = new String[lIIlIllII[2]];
                    strArr[lIIlIllII[0]] = lIIlIlIlI[lIIlIllII[9]];
                    strArr[lIIlIllII[1]] = lIIlIlIlI[lIIlIllII[10]];
                    List list = (List) TileObjects.getAt(worldLocation, strArr).stream().filter(tileObject -> {
                        if (lllllIIlIlI(tileObject)) {
                            ?? r0 = lIIlIllII[1];
                            "".length();
                            return (-(4 ^ 1)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIllII[0];
                    }).collect(Collectors.toList());
                    if (lllllIIlIIl(list.isEmpty() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[11]];
                        Movement.walkTo(mb.get(C0004e.c(lIIlIllII[0], lIIlIllII[3])));
                        "".length();
                        Time.sleepTicks(lIIlIllII[1]);
                        "".length();
                    }
                    if (lllllIIIlll(list.isEmpty() ? 1 : 0) && lllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0) && lllllIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[12]];
                        int[] iArr5 = new int[lIIlIllII[1]];
                        iArr5[lIIlIllII[0]] = ec();
                        int count = Inventory.getCount(iArr5);
                        int[] iArr6 = new int[lIIlIllII[1]];
                        iArr6[lIIlIllII[0]] = lIIlIllII[7];
                        Item first = Inventory.getFirst(iArr6);
                        int[] iArr7 = new int[lIIlIllII[1]];
                        iArr7[lIIlIllII[0]] = ec();
                        Item first2 = Inventory.getFirst(iArr7);
                        if (lllllIIlIlI(first) && lllllIIlIlI(first2)) {
                            first.useOn(first2);
                            Time.sleepTicks(lIIlIllII[3]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr8 = new int[lIIlIllII[1]];
                                iArr8[lIIlIllII[0]] = ec();
                                if (lllllIIllII(Inventory.getCount(iArr8), count) && lllllIIIlll(Players.getLocal().isAnimating() ? 1 : 0) && !lllllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                                    return lIIlIllII[0];
                                }
                                ?? r0 = lIIlIllII[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                            }, lIIlIllII[13]);
                            "".length();
                            Time.sleepTicks(lIIlIllII[2]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[36])) {
            ?? r0 = lIIlIllII[1];
            "".length();
            return (((((212 + 143) - 122) + 13) ^ (((25 + 12) - (-118)) + 6)) & (((((48 + 76) - (-2)) + 1) ^ (39 ^ 15)) ^ (-" ".length()))) >= " ".length() ? ((193 ^ 191) ^ (87 ^ 52)) & (((250 ^ 154) ^ (76 ^ 49)) ^ (-" ".length())) : r0;
        }
        return lIIlIllII[0];
    }

    private static void lllllIIIllI() {
        lIIlIllII = new int[46];
        lIIlIllII[0] = ((8 ^ 42) ^ (22 ^ 108)) & (((57 ^ 65) ^ (172 ^ 140)) ^ (-" ".length()));
        lIIlIllII[1] = " ".length();
        lIIlIllII[2] = "  ".length();
        lIIlIllII[3] = "   ".length();
        lIIlIllII[4] = (-((-12556) & 13615)) & (-8261) & 14319;
        lIIlIllII[5] = 185 ^ 189;
        lIIlIllII[6] = (241 ^ 153) ^ (99 ^ 14);
        lIIlIllII[7] = (-((-5727) & 7903)) & (-28961) & 31726;
        lIIlIllII[8] = 111 ^ 105;
        lIIlIllII[9] = (((14 + 163) - 50) + 41) ^ (((83 + 157) - 195) + 130);
        lIIlIllII[10] = 186 ^ 178;
        lIIlIllII[11] = 157 ^ 148;
        lIIlIllII[12] = (207 ^ 149) ^ (249 ^ 169);
        lIIlIllII[13] = (-((-6191) & 15599)) & (-4100) & 32507;
        lIIlIllII[14] = (20 ^ 111) ^ (221 ^ 169);
        lIIlIllII[15] = 59 ^ 37;
        lIIlIllII[16] = (-23045) & 24565;
        lIIlIllII[17] = 35 ^ 14;
        lIIlIllII[18] = (-((-495) & 10751)) & (-16385) & 28159;
        lIIlIllII[19] = (-((-18793) & 27513)) & (-2049) & 12285;
        lIIlIllII[20] = (-((-20149) & 28349)) & (-17) & 9727;
        lIIlIllII[21] = (-((-4487) & 31215)) & (-3) & 27130;
        lIIlIllII[22] = ((143 + 4) - 53) + 71;
        lIIlIllII[23] = (((((128 + 98) - 152) + 69) + (97 ^ 13)) - (((139 + 50) - 112) + 119)) + (189 ^ 197);
        lIIlIllII[24] = (-((-1215) & 31935)) & (-67) & 31486;
        lIIlIllII[25] = (103 ^ 80) ^ (236 ^ 129);
        lIIlIllII[26] = (-((-53) & 16445)) & (-8196) & 26587;
        lIIlIllII[27] = (249 ^ 190) ^ (102 ^ 96);
        lIIlIllII[28] = (-((-2206) & 31903)) & (-523) & 32719;
        lIIlIllII[29] = (-20481) & 32460;
        lIIlIllII[30] = (-3076) & 28075;
        lIIlIllII[31] = (-177) & 8183;
        lIIlIllII[32] = 233 ^ 193;
        lIIlIllII[33] = (-((-1441) & 21940)) & (-9313) & 30711;
        lIIlIllII[34] = (((229 + 196) - 233) + 41) ^ (((3 + 8) - (-50)) + 80);
        lIIlIllII[35] = (224 ^ 184) ^ (201 ^ 154);
        lIIlIllII[36] = (30 ^ 88) ^ (18 ^ 55);
        lIIlIllII[37] = 130 ^ 142;
        lIIlIllII[38] = (-((-18877) & 31677)) & (-16641) & 32639;
        lIIlIllII[39] = (-4617) & 8047;
        lIIlIllII[40] = (-522) & 3951;
        lIIlIllII[41] = (-25) & 3453;
        lIIlIllII[42] = (-((-8337) & 24731)) & (-17) & 19838;
        lIIlIllII[43] = (-17046) & 20223;
        lIIlIllII[44] = "   ".length() ^ (149 ^ 129);
        lIIlIllII[45] = (158 ^ 170) ^ (177 ^ 136);
    }

    static {
        lllllIIIllI();
        lllllIIIlII();
        lR = lIIlIllII[20];
        lS = lIIlIllII[16];
        lT = lIIlIllII[18];
        lV = lIIlIllII[7];
        lU = lIIlIllII[19];
        lW = new WorldPoint(lIIlIllII[38], lIIlIllII[39], lIIlIllII[0]);
        lX = new WorldPoint(lIIlIllII[38], lIIlIllII[40], lIIlIllII[0]);
        lY = new WorldPoint(lIIlIllII[38], lIIlIllII[41], lIIlIllII[0]);
        lZ = new WorldPoint(lIIlIllII[38], lIIlIllII[42], lIIlIllII[0]);
        ma = new WorldArea(lIIlIllII[43], lIIlIllII[42], lIIlIllII[44], lIIlIllII[6], lIIlIllII[0]);
        mb = new ArrayList();
        bv = new ArrayList();
    }

    private static void lllllIIIlII() {
        lIIlIlIlI = new String[lIIlIllII[45]];
        lIIlIlIlI[lIIlIllII[0]] = lllllIIIIIl("Sn87OtWqrJn0rEFqRV/NJg==", "cnZDJ");
        lIIlIlIlI[lIIlIllII[1]] = lllllIIIIlI("MfmWTQMsxoGyf+DsUazYmrPFhdNhUJ7I6mhPLVmy/1nTch2KiTjscJW9OIVCzFQCPael0WxGtcc=", "WHsRO");
        lIIlIlIlI[lIIlIllII[2]] = lllllIIIIlI("iIoFGPcqUVhcA0er99sLpLQsWuq+/Ndt", "xmZRq");
        lIIlIlIlI[lIIlIllII[3]] = lllllIIIIll("Gj8fACs7KFoMIzsk", "UOznB");
        lIIlIlIlI[lIIlIllII[5]] = lllllIIIIll("HAYnMT89CS51MTUJIjw9Mw==", "TgIUS");
        lIIlIlIlI[lIIlIllII[6]] = lllllIIIIIl("oRuqte+7759j26HmoHdVKBfwoL94gNsRVB+EyIpl7rJpJVaDuma0uYJ7nZypyhnT", "vgVLz");
        lIIlIlIlI[lIIlIllII[8]] = lllllIIIIIl("64gYa++oFA2wbULS1KyZcYuIhFdouI9/", "BUkIF");
        lIIlIlIlI[lIIlIllII[9]] = lllllIIIIIl("uvq6GhupwAs=", "VCtzs");
        lIIlIlIlI[lIIlIllII[10]] = lllllIIIIlI("QnHls5Ki/fybL49My/Oftw==", "RaZXX");
        lIIlIlIlI[lIIlIllII[11]] = lllllIIIIlI("Lqv9HrKIQfvw6012OlQ5M6DdwQujS6wr", "atHPm");
        lIIlIlIlI[lIIlIllII[12]] = lllllIIIIlI("Hh6G5Cxs4rCCQ+Qi8F6SlQ==", "AwKQv");
        lIIlIlIlI[lIIlIllII[35]] = lllllIIIIIl("ISxsCwQrsEidvb/S416EWw==", "iQbKx");
        lIIlIlIlI[lIIlIllII[37]] = lllllIIIIIl("ontpCRFc52dzVDCJocr2rxtaqXqT4K6U", "Hzcvc");
    }

    private static boolean lllllIIllII(int i, int i2) {
        return i >= i2;
    }

    private static String lllllIIIIIl(String lIIIIlIlIlIIIIl, String lIIIIlIlIlIIIII) {
        try {
            SecretKeySpec lIIIIlIlIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIlIlIIIII.getBytes(StandardCharsets.UTF_8)), lIIlIllII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIllII[2], lIIIIlIlIlIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIlIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlIlIlIIIlI) {
            lIIIIlIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lllllIIIIlI(String lIIIIlIlIlIlllI, String lIIIIlIlIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIlIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIIlIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIIlIlIlIllll) {
            lIIIIlIlIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIlIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    private static boolean ab() {
        if (lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[14]) && lllllIIlIII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[15])) {
            int[] iArr = new int[lIIlIllII[1]];
            iArr[lIIlIllII[0]] = lIIlIllII[7];
            if (lllllIIlIll(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[lIIlIllII[1]];
                iArr2[lIIlIllII[0]] = lIIlIllII[16];
                if (lllllIIlIll(Inventory.getCount(iArr2))) {
                    ?? r0 = lIIlIllII[1];
                    "".length();
                    return (-((41 ^ 39) ^ (3 ^ 9))) > 0 ? ((39 ^ 125) ^ (47 ^ 42)) & (((((230 + 69) - 267) + 207) ^ (((98 + 112) - 164) + 130)) ^ (-" ".length())) : r0;
                }
            }
            return lIIlIllII[0];
        } else if (lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[15]) && lllllIIlIII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[17])) {
            int[] iArr3 = new int[lIIlIllII[1]];
            iArr3[lIIlIllII[0]] = lIIlIllII[7];
            if (lllllIIlIll(Inventory.getCount(iArr3))) {
                int[] iArr4 = new int[lIIlIllII[1]];
                iArr4[lIIlIllII[0]] = lIIlIllII[18];
                if (lllllIIlIll(Inventory.getCount(iArr4))) {
                    ?? r02 = lIIlIllII[1];
                    "".length();
                    return (" ".length() ^ (93 ^ 88)) < "  ".length() ? ((((68 + 68) - 80) + 93) ^ (((33 + 102) - 10) + 20)) & (((((58 + 46) - 9) + 89) ^ (((6 + 13) - (-104)) + 65)) ^ (-" ".length())) : r02;
                }
            }
            return lIIlIllII[0];
        } else if (lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[17])) {
            int[] iArr5 = new int[lIIlIllII[1]];
            iArr5[lIIlIllII[0]] = lIIlIllII[7];
            if (lllllIIlIll(Inventory.getCount(iArr5))) {
                int[] iArr6 = new int[lIIlIllII[1]];
                iArr6[lIIlIllII[0]] = lIIlIllII[19];
                if (lllllIIlIll(Inventory.getCount(iArr6))) {
                    ?? r03 = lIIlIllII[1];
                    "".length();
                    return "  ".length() > ((((142 + 99) - 90) + 10) ^ (((38 + 128) - 16) + 15)) ? ((48 ^ 22) ^ (81 ^ 51)) & (((((94 + 127) - 184) + 94) ^ (((188 + 98) - 123) + 36)) ^ (-" ".length())) : r03;
                }
            }
            return lIIlIllII[0];
        } else {
            int[] iArr7 = new int[lIIlIllII[1]];
            iArr7[lIIlIllII[0]] = lIIlIllII[7];
            if (lllllIIlIll(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[lIIlIllII[1]];
                iArr8[lIIlIllII[0]] = lIIlIllII[20];
                if (lllllIIlIll(Inventory.getCount(iArr8))) {
                    ?? r04 = lIIlIllII[1];
                    "".length();
                    return ((38 ^ 3) & ((93 ^ 120) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
                }
            }
            return lIIlIllII[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlIllII[0];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        eb();
        return lIIlIllII[34];
    }

    private static String lllllIIIIll(String lIIIIlIllIIIIll, String lIIIIlIllIIIIlI) {
        String lIIIIlIllIIIIll2 = new String(Base64.getDecoder().decode(lIIIIlIllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIlIllIIIIIl = new StringBuilder();
        char[] charArray = lIIIIlIllIIIIlI.toCharArray();
        int lIIIIlIlIllllll = lIIlIllII[0];
        char[] charArray2 = lIIIIlIllIIIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIllII[0];
        while (lllllIIlIII(i, length)) {
            char lIIIIlIllIIIlII = charArray2[i];
            lIIIIlIllIIIIIl.append((char) (lIIIIlIllIIIlII ^ charArray[lIIIIlIlIllllll % charArray.length]));
            "".length();
            lIIIIlIlIllllll++;
            i++;
            "".length();
            if ("  ".length() > (130 ^ 134)) {
                return null;
            }
        }
        return String.valueOf(lIIIIlIllIIIIIl);
    }

    private static boolean lllllIIlIIl(int i) {
        return i == 0;
    }

    private static boolean lllllIIIlll(int i) {
        return i != 0;
    }

    private static boolean lllllIIlIII(int i, int i2) {
        return i < i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIlIlIlI[lIIlIllII[35]];
    }

    private static int ec() {
        return (lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[14]) && lllllIIlIII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[15])) ? lIIlIllII[16] : (lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[15]) && lllllIIlIII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[17])) ? lIIlIllII[18] : lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[17]) ? lIIlIllII[19] : lIIlIllII[20];
    }

    private static boolean lllllIIlIll(int i) {
        return i > 0;
    }

    private static void af() {
        if (lllllIIlIII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[14])) {
            bv.add(new C0003d(lIIlIllII[20], lIIlIllII[21], C0004e.c(lIIlIllII[22], lIIlIllII[23])));
            "".length();
        }
        if (lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[14]) && lllllIIlIII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[15])) {
            bv.add(new C0003d(lIIlIllII[16], lIIlIllII[24], lIIlIllII[25]));
            "".length();
        }
        if (lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[15]) && lllllIIlIII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[17])) {
            bv.add(new C0003d(lIIlIllII[18], lIIlIllII[26], lIIlIllII[27]));
            "".length();
        }
        if (lllllIIllII(Skills.getLevel(Skill.FIREMAKING), lIIlIllII[17])) {
            bv.add(new C0003d(lIIlIllII[19], lIIlIllII[28], lIIlIllII[15]));
            "".length();
        }
        if (lllllIIlIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIlIlI[lIIlIllII[37]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllII[29], lIIlIllII[6], lIIlIllII[30]));
            "".length();
        }
        int[] iArr = new int[lIIlIllII[1]];
        iArr[lIIlIllII[0]] = lIIlIllII[31];
        if (lllllIIlIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllII[31], lIIlIllII[32], lIIlIllII[33]));
            "".length();
        }
    }
}
