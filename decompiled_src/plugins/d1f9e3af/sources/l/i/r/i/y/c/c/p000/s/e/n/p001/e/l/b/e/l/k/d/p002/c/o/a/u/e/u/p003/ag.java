package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.ag  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/ag.class */
public class ag implements W {
    private static /* synthetic */ int[] lIlllIIlI;
    private static /* synthetic */ String[] lIlllIIIl;
    public static /* synthetic */ List<C0003d> bv;
    public static final /* synthetic */ int lL;
    public static final /* synthetic */ WorldPoint lN;
    public static final /* synthetic */ WorldPoint lO;
    public static final /* synthetic */ int lK;
    public static final /* synthetic */ int lM;
    public static /* synthetic */ boolean bt;

    private static boolean lIIllIlIllll(int i) {
        return i > 0;
    }

    private static boolean lIIllIllIIII(int i, int i2) {
        return i >= i2;
    }

    private static String lIIllIlIIllI(String llIIlIlIIlIIII, String llIIlIlIIIllll) {
        String llIIlIlIIlIIII2 = new String(Base64.getDecoder().decode(llIIlIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIlIIlIIll = new StringBuilder();
        char[] charArray = llIIlIlIIIllll.toCharArray();
        int llIIlIlIIlIIIl = lIlllIIlI[0];
        char[] charArray2 = llIIlIlIIlIIII2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIIlI[0];
        while (lIIllIlIllII(i, length)) {
            llIIlIlIIlIIll.append((char) (charArray2[i] ^ charArray[llIIlIlIIlIIIl % charArray.length]));
            "".length();
            llIIlIlIIlIIIl++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(llIIlIlIIlIIll);
    }

    private static void lIIllIlIlIlI() {
        lIlllIIlI = new int[42];
        lIlllIIlI[0] = (135 ^ 136) & ((96 ^ 111) ^ (-1));
        lIlllIIlI[1] = " ".length();
        lIlllIIlI[2] = "  ".length();
        lIlllIIlI[3] = "   ".length();
        lIlllIIlI[4] = (-2072) & 7071;
        lIlllIIlI[5] = (33 ^ 52) ^ (113 ^ 107);
        lIlllIIlI[6] = (-26753) & 27069;
        lIlllIIlI[7] = 31 ^ 27;
        lIlllIIlI[8] = 162 ^ 188;
        lIlllIIlI[9] = (-16433) & 16767;
        lIlllIIlI[10] = (8 ^ 29) ^ (58 ^ 42);
        lIlllIIlI[11] = (-25729) & 26087;
        lIlllIIlI[12] = (((102 + 108) - 91) + 12) ^ (((61 + 95) - 95) + 72);
        lIlllIIlI[13] = (-((-3129) & 32315)) & (-1026) & 32763;
        lIlllIIlI[14] = (114 ^ 50) ^ (98 ^ 59);
        lIlllIIlI[15] = (49 ^ 39) ^ (12 ^ 29);
        lIlllIIlI[16] = (((95 + 54) - 9) + 29) ^ (((26 + 118) - 135) + 152);
        lIlllIIlI[17] = 172 ^ 165;
        lIlllIIlI[18] = 48 ^ 58;
        lIlllIIlI[19] = (95 ^ 91) ^ (61 ^ 50);
        lIlllIIlI[20] = (90 ^ 4) ^ (33 ^ 115);
        lIlllIIlI[21] = (-((-23650) & 24181)) & (-1) & 65531;
        lIlllIIlI[22] = ((8 + 24) - (-45)) + 173;
        lIlllIIlI[23] = (-((-5729) & 24177)) & (-129) & 18876;
        lIlllIIlI[24] = (-9225) & 9724;
        lIlllIIlI[25] = (((34 ^ 22) + (((117 + 123) - 103) + 40)) - (((48 + 69) - 41) + 131)) + ((36 + 101) - 67) + 108;
        lIlllIIlI[26] = 125 ^ 105;
        lIlllIIlI[27] = (-18477) & 20476;
        lIlllIIlI[28] = (-16385) & 28364;
        lIlllIIlI[29] = (-23) & 25022;
        lIlllIIlI[30] = (-137) & 8143;
        lIlllIIlI[31] = ((77 ^ 27) & ((61 ^ 107) ^ (-1))) ^ (126 ^ 86);
        lIlllIIlI[32] = (-((-4486) & 32255)) & (-1) & 28669;
        lIlllIIlI[33] = 254 ^ 154;
        lIlllIIlI[34] = (247 ^ 185) ^ (91 ^ 24);
        lIlllIIlI[35] = (((109 + 131) - 191) + 176) ^ (((92 + 34) - 4) + 8);
        lIlllIIlI[36] = (((15 + 85) - 31) + 67) ^ (((117 + 73) - 169) + 113);
        lIlllIIlI[37] = (-((-1527) & 22015)) & (-561) & 24317;
        lIlllIIlI[38] = (-((-2113) & 18642)) & (-515) & 20211;
        lIlllIIlI[39] = (-((-385) & 21397)) & (-292) & 24575;
        lIlllIIlI[40] = (-((-557) & 12991)) & (-16641) & 32254;
        lIlllIIlI[41] = 86 ^ 70;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private static boolean ab() {
        if (lIIllIllIIII(Skills.getLevel(Skill.COOKING), lIlllIIlI[8])) {
            int[] iArr = new int[lIlllIIlI[1]];
            iArr[lIlllIIlI[0]] = lIlllIIlI[11];
            if (lIIllIlIllll(Inventory.getCount(iArr))) {
                ?? r0 = lIlllIIlI[1];
                "".length();
                return (-(108 ^ 104)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlllIIlI[0];
        } else if (lIIllIllIIII(Skills.getLevel(Skill.COOKING), lIlllIIlI[5]) && lIIllIlIllII(Skills.getLevel(Skill.COOKING), lIlllIIlI[8])) {
            int[] iArr2 = new int[lIlllIIlI[1]];
            iArr2[lIlllIIlI[0]] = lIlllIIlI[9];
            if (lIIllIlIllll(Inventory.getCount(iArr2))) {
                ?? r02 = lIlllIIlI[1];
                "".length();
                return 0 != 0 ? ((174 ^ 158) ^ (178 ^ 153)) & (((67 ^ 105) ^ (25 ^ 40)) ^ (-" ".length())) : r02;
            }
            return lIlllIIlI[0];
        } else {
            int[] iArr3 = new int[lIlllIIlI[1]];
            iArr3[lIlllIIlI[0]] = lIlllIIlI[6];
            if (lIIllIlIllll(Inventory.getCount(iArr3))) {
                ?? r03 = lIlllIIlI[1];
                "".length();
                return "   ".length() <= "  ".length() ? ((114 ^ 75) ^ (25 ^ 18)) & (((((67 + 30) - 75) + 134) ^ (((112 + 131) - 185) + 116)) ^ (-" ".length())) : r03;
            }
            return lIlllIIlI[0];
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlllIIIl[lIlllIIlI[34]];
    }

    private static boolean lIIllIlIlllI(Object obj) {
        return obj != null;
    }

    private static String lIIllIlIIlll(String llIIlIIlllIIll, String llIIlIIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIIlllIlII) {
            llIIlIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIllIlIlIIl() {
        lIlllIIIl = new String[lIlllIIlI[41]];
        lIlllIIIl[lIlllIIlI[0]] = lIIllIlIIllI("Ew0rPRQ2WDsgHzwL", "QxRTz");
        lIlllIIIl[lIlllIIlI[1]] = lIIllIlIIlll("mYkPtHsIKae6OFI+M1O8KSny3Roaur17U0A36hIyy3Kxy917QQVggco5xbJ+UpHeaUtFDHU4oWA=", "acmwt");
        lIlllIIIl[lIlllIIlI[2]] = lIIllIlIlIII("q2YERfCvqIm6rY3BYelNSlV99qTsdzjK", "GjdWj");
        lIlllIIIl[lIlllIIlI[3]] = lIIllIlIIllI("MiYWIh8TKR9mERspEy8dHQ==", "zGxFs");
        lIlllIIIl[lIlllIIlI[7]] = lIIllIlIIllI("ADZyCRQycz8BFSQ6PA9GJCYiGAo+NiFERiQkOxwFPzo8D0YjPHIqMw4aHC8=", "WSRhf");
        lIlllIIIl[lIlllIIlI[10]] = lIIllIlIIlll("Axa7Ala4RqskKFFJ0JzIuVRbCvwRNBMt/4a7HXfYeSRewWwu8l4AYIt/VH0+CzJn", "LkQGm");
        lIlllIIIl[lIlllIIlI[12]] = lIIllIlIlIII("LEp4H3LhKlhg4ehKxyg7+z4BXheFh1Z/jjiMYxZWlnXCOJkkWhTcBCmLnPS7cLFK", "Znhcg");
        lIlllIIIl[lIlllIIlI[15]] = lIIllIlIlIII("9Yb9RnE0v/McFVgm8IwAww==", "deblG");
        lIlllIIIl[lIlllIIlI[16]] = lIIllIlIIllI("NBwCPQ==", "cycOx");
        lIlllIIIl[lIlllIIlI[17]] = lIIllIlIIlll("+AInVdcUpXB0fpuoyRUPxSZ/pcg/3RUu", "ZAbVh");
        lIlllIIIl[lIlllIIlI[18]] = lIIllIlIlIII("AVan4kHWpO4=", "GeiRd");
        lIlllIIIl[lIlllIIlI[19]] = lIIllIlIlIII("c0uLJCJW92A=", "PNQIh");
        lIlllIIIl[lIlllIIlI[20]] = lIIllIlIlIII("bX2BMJ3BfN8=", "BfVDf");
        lIlllIIIl[lIlllIIlI[34]] = lIIllIlIIllI("MCUKHhodLQ==", "sJeus");
        lIlllIIIl[lIlllIIlI[36]] = lIIllIlIIlll("bJmApkCMdj0sNsltYyNrO4SXIKQTWrKJ", "tdpeo");
        lIlllIIIl[lIlllIIlI[5]] = lIIllIlIlIII("9uuJ8xSQ5DWT3C/kVjtvuYl+ZftJRxbw", "yPtvs");
    }

    private static boolean lIIllIllIIIl(int i, int i2) {
        return i > i2;
    }

    private static void af() {
        if (lIIllIlIllII(Skills.getLevel(Skill.COOKING), lIlllIIlI[5])) {
            bv.add(new C0003d(lIlllIIlI[6], lIlllIIlI[22], lIlllIIlI[23]));
            "".length();
        }
        if (lIIllIllIIII(Skills.getLevel(Skill.COOKING), lIlllIIlI[5]) && lIIllIlIllII(Skills.getLevel(Skill.COOKING), lIlllIIlI[8])) {
            bv.add(new C0003d(lIlllIIlI[9], lIlllIIlI[24], lIlllIIlI[25]));
            "".length();
        }
        if (lIIllIllIIII(Skills.getLevel(Skill.COOKING), lIlllIIlI[8])) {
            bv.add(new C0003d(lIlllIIlI[11], lIlllIIlI[24], lIlllIIlI[25]));
            "".length();
        }
        if (lIIllIlIllIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllIIIl[lIlllIIlI[5]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIIlI[13], lIlllIIlI[26], lIlllIIlI[27]));
            "".length();
        }
        if (lIIllIlIllIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIlllIIIl[lIlllIIlI[36]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIIlI[28], lIlllIIlI[10], lIlllIIlI[29]));
            "".length();
        }
        int[] iArr = new int[lIlllIIlI[1]];
        iArr[lIlllIIlI[0]] = lIlllIIlI[30];
        if (lIIllIlIllIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIIlI[30], lIlllIIlI[31], lIlllIIlI[32]));
            "".length();
        }
    }

    private static String lIIllIlIlIII(String llIIlIlIIIIIII, String llIIlIIlllllll) {
        try {
            SecretKeySpec llIIlIlIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIlllllll.getBytes(StandardCharsets.UTF_8)), lIlllIIlI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIIlI[2], llIIlIlIIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIlIIIIIIl) {
            llIIlIlIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIIlI(int i, int i2) {
        return i <= i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        dG();
        return lIlllIIlI[33];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlllIIlI[0];
    }

    static {
        lIIllIlIlIlI();
        lIIllIlIlIIl();
        lK = lIlllIIlI[6];
        lM = lIlllIIlI[11];
        lL = lIlllIIlI[9];
        lN = new WorldPoint(lIlllIIlI[37], lIlllIIlI[38], lIlllIIlI[0]);
        lO = new WorldPoint(lIlllIIlI[39], lIlllIIlI[40], lIlllIIlI[0]);
        bv = new ArrayList();
    }

    private static boolean lIIllIlIlIll(int i) {
        return i != 0;
    }

    private static boolean lIIllIlIllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    public static void dG() {
        if (lIIllIlIlIll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[0]];
            C0001b.a(bv);
            if (lIIllIlIllII(bv.size(), lIlllIIlI[1])) {
                System.out.println(lIlllIIIl[lIlllIIlI[1]]);
                bt = lIlllIIlI[0];
            }
        }
        if (lIIllIlIllIl(bt ? 1 : 0)) {
            if (lIIllIlIllIl(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIllIlIlllI(nearest) && lIIllIlIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[2]];
                    C0000a.a(nearest);
                }
                if (lIIllIlIlllI(nearest) && lIIllIlIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[3]];
                    if (lIIllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIIlI[4]);
                        "".length();
                    }
                    if (lIIllIlIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIIllIlIllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllIIlI[1]);
                            "".length();
                        }
                        if (lIIllIlIllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllIIlI[2]);
                            "".length();
                        }
                    }
                    if (lIIllIlIllII(Skills.getLevel(Skill.COOKING), lIlllIIlI[5])) {
                        int[] iArr = new int[lIlllIIlI[1]];
                        iArr[lIlllIIlI[0]] = lIlllIIlI[6];
                        if (lIIllIlIllIl(Bank.contains(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIlllIIIl[lIlllIIlI[7]]);
                            bt = lIlllIIlI[1];
                            return;
                        }
                    }
                    if (lIIllIllIIII(Skills.getLevel(Skill.COOKING), lIlllIIlI[5]) && lIIllIlIllII(Skills.getLevel(Skill.COOKING), lIlllIIlI[8])) {
                        int[] iArr2 = new int[lIlllIIlI[1]];
                        iArr2[lIlllIIlI[0]] = lIlllIIlI[9];
                        if (lIIllIlIllIl(Bank.contains(iArr2) ? 1 : 0)) {
                            af();
                            System.out.println(lIlllIIIl[lIlllIIlI[10]]);
                            bt = lIlllIIlI[1];
                            return;
                        }
                    }
                    if (lIIllIllIIII(Skills.getLevel(Skill.COOKING), lIlllIIlI[8])) {
                        int[] iArr3 = new int[lIlllIIlI[1]];
                        iArr3[lIlllIIlI[0]] = lIlllIIlI[11];
                        if (lIIllIlIllIl(Bank.contains(iArr3) ? 1 : 0)) {
                            af();
                            System.out.println(lIlllIIIl[lIlllIIlI[12]]);
                            bt = lIlllIIlI[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[lIlllIIlI[1]];
                    iArr4[lIlllIIlI[0]] = lIlllIIlI[13];
                    if (lIIllIlIllIl(Equipment.contains(iArr4) ? 1 : 0) && lIIllIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lO), lIlllIIlI[14])) {
                        C0000a.b(C0005f.aN, lIlllIIlI[1]);
                        Time.sleepTicks(lIlllIIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIlllIIlI[1]];
                            iArr5[lIlllIIlI[0]] = lIlllIIlI[13];
                            if (lIIllIlIllll(Inventory.getCount(iArr5))) {
                                ?? r0 = lIlllIIlI[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIlI[0];
                        }, lIlllIIlI[4]);
                        "".length();
                    }
                    if (lIIllIlIllII(Skills.getLevel(Skill.COOKING), lIlllIIlI[5])) {
                        Bank.withdrawAll(lIlllIIlI[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIlllIIlI[1]];
                            iArr5[lIlllIIlI[0]] = lIlllIIlI[6];
                            if (lIIllIlIllll(Inventory.getCount(iArr5))) {
                                ?? r0 = lIlllIIlI[1];
                                "".length();
                                return (-((125 ^ 0) ^ (110 ^ 22))) >= 0 ? ((105 ^ 17) ^ (250 ^ 176)) & (((71 ^ 1) ^ (4 ^ 112)) ^ (-" ".length())) : r0;
                            }
                            return lIlllIIlI[0];
                        }, lIlllIIlI[4]);
                        "".length();
                    }
                    if (lIIllIllIIII(Skills.getLevel(Skill.COOKING), lIlllIIlI[5]) && lIIllIlIllII(Skills.getLevel(Skill.COOKING), lIlllIIlI[8])) {
                        Bank.withdrawAll(lIlllIIlI[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIlllIIlI[1]];
                            iArr5[lIlllIIlI[0]] = lIlllIIlI[9];
                            if (lIIllIlIllll(Inventory.getCount(iArr5))) {
                                ?? r0 = lIlllIIlI[1];
                                "".length();
                                return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIlI[0];
                        }, lIlllIIlI[4]);
                        "".length();
                    }
                    if (lIIllIllIIII(Skills.getLevel(Skill.COOKING), lIlllIIlI[8])) {
                        Bank.withdrawAll(lIlllIIlI[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlllIIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIlllIIlI[1]];
                            iArr5[lIlllIIlI[0]] = lIlllIIlI[11];
                            if (lIIllIlIllll(Inventory.getCount(iArr5))) {
                                ?? r0 = lIlllIIlI[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIlllIIlI[0];
                        }, lIlllIIlI[4]);
                        "".length();
                    }
                }
            }
            if (lIIllIlIlIll(ab() ? 1 : 0)) {
                int[] iArr5 = new int[lIlllIIlI[1]];
                iArr5[lIlllIIlI[0]] = lIlllIIlI[13];
                if (lIIllIlIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIlllIIlI[1]];
                    iArr6[lIlllIIlI[0]] = lIlllIIlI[13];
                    if (lIIllIlIllIl(Equipment.contains(iArr6) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[15]];
                        int[] iArr7 = new int[lIlllIIlI[1]];
                        iArr7[lIlllIIlI[0]] = lIlllIIlI[13];
                        Item first = Inventory.getFirst(iArr7);
                        if (lIIllIlIlllI(first)) {
                            first.interact(lIlllIIIl[lIlllIIlI[16]]);
                            Time.sleepTicks(lIlllIIlI[3]);
                            "".length();
                        }
                    }
                }
                if (lIIllIllIIIl(Players.getLocal().getWorldLocation().distanceTo(lO), lIlllIIlI[10])) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[17]];
                    Movement.walkTo(lO);
                    "".length();
                    Time.sleepTicks(lIlllIIlI[7]);
                    "".length();
                }
                if (lIIllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(lO), lIlllIIlI[10])) {
                    AccBuilderEasyClues.c = lIlllIIIl[lIlllIIlI[18]];
                    WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                    String[] strArr = new String[lIlllIIlI[1]];
                    strArr[lIlllIIlI[0]] = lIlllIIIl[lIlllIIlI[19]];
                    TileObject nearest2 = TileObjects.getNearest(worldLocation, strArr);
                    if (lIIllIlIlllI(nearest2)) {
                        if (lIIllIlIllIl(Production.isOpen() ? 1 : 0)) {
                            nearest2.interact(lIlllIIIl[lIlllIIlI[20]]);
                            Time.sleepTicks(lIlllIIlI[2]);
                            "".length();
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIlllIIlI[4]);
                            "".length();
                        }
                        if (lIIllIlIlIll(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption(lIlllIIlI[1]);
                            Time.sleepTicks(lIlllIIlI[7]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (!lIIllIlIlIll(ab() ? 1 : 0) || lIIllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIlllIIlI[1];
                                    "".length();
                                    return ((1 ^ 48) ^ (82 ^ 103)) < "  ".length() ? ((148 ^ 157) ^ (142 ^ 144)) & (((255 ^ 181) ^ (35 ^ 126)) ^ (-" ".length())) : r0;
                                }
                                return lIlllIIlI[0];
                            }, lIlllIIlI[21]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllIlIllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIllIllIIII(Skills.getLevel(Skill.COOKING), lIlllIIlI[35])) {
            ?? r0 = lIlllIIlI[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIIlI[0];
    }
}
