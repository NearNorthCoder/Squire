package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

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
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/a.class */
public class C0000a {
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea E;
    public static final /* synthetic */ WorldArea C;
    private static /* synthetic */ int[] lIlIlIIIII;
    public static final /* synthetic */ WorldPoint x;
    public static final /* synthetic */ WorldArea B;
    public static final /* synthetic */ WorldArea D;
    public static /* synthetic */ WorldPoint G;
    private static /* synthetic */ String[] lIlIIlllll;
    static /* synthetic */ WorldPoint H;
    public static /* synthetic */ WorldPoint F;
    public static final /* synthetic */ WorldArea A;
    public static final /* synthetic */ WorldArea y;
    public static final /* synthetic */ WorldArea w;

    private static boolean lIIIllllIIIll(int i, int i2) {
        return i <= i2;
    }

    public static void a() {
        if (lIIIllllIIIll(Players.getLocal().getWorldLocation().distanceTo(H), lIlIlIIIII[28])) {
            String[] strArr = new String[lIlIlIIIII[1]];
            strArr[lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[27]];
            NPCs.getNearest(strArr).interact(lIlIIlllll[lIlIlIIIII[29]]);
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIlIlIIIII[30]);
            "".length();
        }
        if (!lIIIllllIIIII(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIIlllIlllll(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks(lIlIlIIIII[15]);
            "".length();
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIlIlIIIII[30]);
            "".length();
            "".length();
            if ((-" ".length()) > "  ".length()) {
            }
        } else if (lIIIllllIIIII(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIIIII(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIIIII(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIIIII(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIIIII(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIIllllIIIll(Players.getLocal().getWorldLocation().distanceTo(G), lIlIlIIIII[11])) {
            if (lIIIllllIIIII(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(H), lIlIlIIIII[28])) {
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                String[] strArr2 = new String[lIlIlIIIII[1]];
                strArr2[lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[34]];
                TileObject nearest = TileObjects.getNearest(worldLocation, strArr2);
                if (lIIIllllIIIlI(nearest)) {
                    nearest.interact(lIlIIlllll[lIlIlIIIII[35]]);
                    Time.sleepTicks(lIlIlIIIII[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlIlIIIII[30]);
                    "".length();
                }
            }
        } else {
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            String[] strArr3 = new String[lIlIlIIIII[1]];
            strArr3[lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[31]];
            TileObject nearest2 = TileObjects.getNearest(worldLocation2, strArr3);
            if (lIIIllllIIIlI(nearest2)) {
                String[] strArr4 = new String[lIlIlIIIII[1]];
                strArr4[lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[23]];
                if (lIIIlllIlllll(nearest2.hasAction(strArr4) ? 1 : 0)) {
                    nearest2.interact(lIlIIlllll[lIlIlIIIII[22]]);
                    Time.sleepTicks(lIlIlIIIII[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlIlIIIII[30]);
                    "".length();
                }
                String[] strArr5 = new String[lIlIlIIIII[1]];
                strArr5[lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[32]];
                if (lIIIlllIlllll(nearest2.hasAction(strArr5) ? 1 : 0)) {
                    nearest2.interact(lIlIIlllll[lIlIlIIIII[33]]);
                    Time.sleepTicks(lIlIlIIIII[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlIlIIIII[30]);
                    "".length();
                }
            }
            "".length();
            if ("   ".length() == " ".length()) {
            }
        }
    }

    private static void lIIIlllIlllII() {
        lIlIIlllll = new String[lIlIlIIIII[11]];
        lIlIIlllll[lIlIlIIIII[2]] = lIIIlllIllIIl("Fw0A", "NhstT");
        lIlIIlllll[lIlIlIIIII[1]] = lIIIlllIllIlI("MKY5yQSRhrQ=", "EWGbq");
        lIlIIlllll[lIlIlIIIII[14]] = lIIIlllIllIll("XvsKPhTlRnc=", "hadiJ");
        lIlIIlllll[lIlIlIIIII[15]] = lIIIlllIllIIl("HC0FEA==", "KHdbS");
        lIlIIlllll[lIlIlIIIII[24]] = lIIIlllIllIlI("cRvIjm3elsw=", "fQFbP");
        lIlIIlllll[lIlIlIIIII[19]] = lIIIlllIllIlI("1yoU7y09Vt0=", "JtebK");
        lIlIIlllll[lIlIlIIIII[13]] = lIIIlllIllIlI("EKq4xyBRcH4=", "OjXIs");
        lIlIIlllll[lIlIlIIIII[27]] = lIIIlllIllIll("xtnOJoRFMHLQ41DyNH9uPc3WwaknsgG0", "GErZP");
        lIlIIlllll[lIlIlIIIII[29]] = lIIIlllIllIll("NeN4yAfSaIs=", "zxokF");
        lIlIIlllll[lIlIlIIIII[31]] = lIIIlllIllIIl("GAQ4PVg5DTMlDA==", "ZeVVx");
        lIlIIlllll[lIlIlIIIII[23]] = lIIIlllIllIIl("GBQn", "MgBhc");
        lIlIIlllll[lIlIlIIIII[22]] = lIIIlllIllIlI("QeOdKBii/pU=", "bQZpT");
        lIlIIlllll[lIlIlIIIII[32]] = lIIIlllIllIll("wXMd86GYgBw=", "VxqXI");
        lIlIIlllll[lIlIlIIIII[33]] = lIIIlllIllIlI("2nOaBThXoMM=", "HQiyR");
        lIlIIlllll[lIlIlIIIII[34]] = lIIIlllIllIll("b0CFEllES1I+F/FiOlF8Rg==", "zqOKa");
        lIlIIlllll[lIlIlIIIII[35]] = lIIIlllIllIll("WiepNvgl4xs=", "mzdPL");
        lIlIIlllll[lIlIlIIIII[36]] = lIIIlllIllIIl("MxE4EyMoBiA=", "GtTvS");
        lIlIIlllll[lIlIlIIIII[37]] = lIIIlllIllIlI("lXqN/9CdW2Zxr1xmU+ZQZA==", "bjKjg");
        lIlIIlllll[lIlIlIIIII[38]] = lIIIlllIllIll("jbqna7ooobQ9W8c4pmo6MQ==", "rOfaI");
        lIlIIlllll[lIlIlIIIII[39]] = lIIIlllIllIll("GNvEknf423HgKjE6Ts6VUw==", "rcIOt");
    }

    public static void b(int i, int i2) {
        Bank.withdraw(i, i2, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(lIlIlIIIII[1]);
        "".length();
    }

    private static boolean lIIIlllIllllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIllllIIlII(int i, int i2) {
        return i < i2;
    }

    public static void b(int[] iArr, int i) {
        int llllllllllllllllllllIIIIIIIIIIIl = lIlIlIIIII[2];
        while (lIIIllllIIlII(llllllllllllllllllllIIIIIIIIIIIl, iArr.length)) {
            Bank.withdraw(iArr[llllllllllllllllllllIIIIIIIIIIIl], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIlIlIIIII[1]);
            "".length();
            int[] iArr2 = new int[lIlIlIIIII[1]];
            iArr2[lIlIlIIIII[2]] = iArr[llllllllllllllllllllIIIIIIIIIIIl];
            if (lIIIlllIlllll(Inventory.contains(iArr2) ? 1 : 0)) {
                "".length();
                if ((-" ".length()) > ((248 ^ 193) & ((29 ^ 36) ^ (-1)))) {
                    return;
                }
                return;
            }
            llllllllllllllllllllIIIIIIIIIIIl++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    private static void lIIIlllIlllIl() {
        lIlIlIIIII = new int[74];
        lIlIlIIIII[0] = (-530) & 2705;
        lIlIlIIIII[1] = " ".length();
        lIlIlIIIII[2] = (" ".length() ^ (177 ^ 174)) & (((243 ^ 160) ^ (209 ^ 156)) ^ (-" ".length()));
        lIlIlIIIII[3] = (-20515) & 22966;
        lIlIlIIIII[4] = (-25219) & 29691;
        lIlIlIIIII[5] = (-((-6665) & 23103)) & (-12290) & 31679;
        lIlIlIIIII[6] = (-35) & 5807;
        lIlIlIIIII[7] = (-((-2141) & 31839)) & (-2) & 32639;
        lIlIlIIIII[8] = (-((-182) & 10743)) & (-47) & 16367;
        lIlIlIIIII[9] = (25 ^ 39) ^ (126 ^ 91);
        lIlIlIIIII[10] = 112 ^ 108;
        lIlIlIIIII[11] = (((113 + 82) - 187) + 121) ^ (((7 + 69) - 23) + 96);
        lIlIlIIIII[12] = -" ".length();
        lIlIlIIIII[13] = (42 ^ 118) ^ (84 ^ 14);
        lIlIlIIIII[14] = "  ".length();
        lIlIlIIIII[15] = "   ".length();
        lIlIlIIIII[16] = 18 ^ 58;
        lIlIlIIIII[17] = (-12485) & 15092;
        lIlIlIIIII[18] = (-((-3333) & 32693)) & (-3) & 32754;
        lIlIlIIIII[19] = 74 ^ 79;
        lIlIlIIIII[20] = (-1321) & 3884;
        lIlIlIIIII[21] = (-((-1541) & 30231)) & (-1089) & 32638;
        lIlIlIIIII[22] = 98 ^ 105;
        lIlIlIIIII[23] = (77 ^ 42) ^ (55 ^ 90);
        lIlIlIIIII[24] = (204 ^ 160) ^ (196 ^ 172);
        lIlIlIIIII[25] = (-((-3355) & 32667)) & (-1) & 32463;
        lIlIlIIIII[26] = (-28673) & 32593;
        lIlIlIIIII[27] = (((68 + 151) - 150) + 89) ^ (((80 + 142) - 77) + 8);
        lIlIlIIIII[28] = 108 ^ 114;
        lIlIlIIIII[29] = 118 ^ 126;
        lIlIlIIIII[30] = (-((-10241) & 30747)) & (-5) & 24510;
        lIlIlIIIII[31] = (((33 + 44) - (-27)) + 50) ^ (((71 + 81) - 97) + 92);
        lIlIlIIIII[32] = 127 ^ 115;
        lIlIlIIIII[33] = (((48 + 42) - (-28)) + 22) ^ (((50 + 60) - 45) + 64);
        lIlIlIIIII[34] = (217 ^ 195) ^ (26 ^ 14);
        lIlIlIIIII[35] = (33 ^ 13) ^ (101 ^ 70);
        lIlIlIIIII[36] = (81 ^ 9) ^ (30 ^ 86);
        lIlIlIIIII[37] = 39 ^ 54;
        lIlIlIIIII[38] = (39 ^ 45) ^ (63 ^ 39);
        lIlIlIIIII[39] = (((11 + 57) - (-53)) + 7) ^ (((120 + 86) - 60) + 1);
        lIlIlIIIII[40] = (-((-8645) & 29677)) & (-385) & 24559;
        lIlIlIIIII[41] = (-((-6289) & 15067)) & (-20513) & 32763;
        lIlIlIIIII[42] = "   ".length() ^ (3 ^ 41);
        lIlIlIIIII[43] = (12 ^ 103) ^ (233 ^ 165);
        lIlIlIIIII[44] = (-((-2087) & 23167)) & (-257) & 24540;
        lIlIlIIIII[45] = (-((-709) & 25287)) & (-137) & 28079;
        lIlIlIIIII[46] = (-((-4891) & 14143)) & (-129) & 12287;
        lIlIlIIIII[47] = (-25398) & 28607;
        lIlIlIIIII[48] = 123 ^ 18;
        lIlIlIIIII[49] = (-387) & 3582;
        lIlIlIIIII[50] = (-8905) & 12270;
        lIlIlIIIII[51] = 25 ^ 58;
        lIlIlIIIII[52] = 31 ^ 37;
        lIlIlIIIII[53] = (-13185) & 16309;
        lIlIlIIIII[54] = (-((-11779) & 32271)) & (-8577) & 32687;
        lIlIlIIIII[55] = (-((-257) & 24993)) & (-4354) & 32703;
        lIlIlIIIII[56] = (-((-15489) & 16001)) & (-16417) & 20346;
        lIlIlIIIII[57] = 31 ^ 67;
        lIlIlIIIII[58] = (249 ^ 198) ^ (97 ^ 123);
        lIlIlIIIII[59] = (-24898) & 28027;
        lIlIlIIIII[60] = (-((-10033) & 30655)) & (-1) & 24063;
        lIlIlIIIII[61] = 184 ^ 137;
        lIlIlIIIII[62] = 21 ^ 81;
        lIlIlIIIII[63] = (-10657) & 12286;
        lIlIlIIIII[64] = (-16532) & 20467;
        lIlIlIIIII[65] = (-((-10265) & 31515)) & (-1) & 24559;
        lIlIlIIIII[66] = (212 ^ 187) ^ (130 ^ 192);
        lIlIlIIIII[67] = 27 ^ 63;
        lIlIlIIIII[68] = (-1025) & 3999;
        lIlIlIIIII[69] = (-((-26922) & 31535)) & (-17) & 7871;
        lIlIlIIIII[70] = (-((-8730) & 13087)) & (-24577) & 30655;
        lIlIlIIIII[71] = (-((-3597) & 28253)) & (-4609) & 32729;
        lIlIlIIIII[72] = (-4124) & 7167;
        lIlIlIIIII[73] = (-((-29515) & 32731)) & (-1) & 8189;
    }

    private static boolean lIIIllllIIIII(int i) {
        return i == 0;
    }

    public static void a(int[] iArr) {
        int i = lIlIlIIIII[2];
        while (lIIIllllIIlII(i, iArr.length)) {
            Bank.withdraw(iArr[i], lIlIlIIIII[1], Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIlIlIIIII[1]);
            "".length();
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
    }

    private static boolean lIIIllllIIIlI(Object obj) {
        return obj != null;
    }

    private static String lIIIlllIllIlI(String lllllllllllllllllllIllllllllIlIl, String lllllllllllllllllllIllllllllIlII) {
        try {
            SecretKeySpec lllllllllllllllllllIlllllllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllllllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIIII[14], lllllllllllllllllllIlllllllllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllllllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIllllllllIllI) {
            lllllllllllllllllllIllllllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllllIIIIl(int i, int i2) {
        return i > i2;
    }

    public static void a(BankLocation bankLocation) {
        if (lIIIlllIllllI(Vars.getBit(lIlIlIIIII[0]), lIlIlIIIII[1]) && lIIIlllIlllll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[lIlIlIIIII[1]];
            strArr[lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[2]];
            C0006g.a(strArr);
        }
        WorldPoint worldPoint = new WorldPoint(lIlIlIIIII[3], lIlIlIIIII[4], lIlIlIIIII[2]);
        WorldPoint worldPoint2 = new WorldPoint(lIlIlIIIII[5], lIlIlIIIII[6], lIlIlIIIII[2]);
        WorldArea worldArea = new WorldArea(lIlIlIIIII[7], lIlIlIIIII[8], lIlIlIIIII[9], lIlIlIIIII[10], lIlIlIIIII[2]);
        if ((!lIIIllllIIIII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lIIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlIlIIIII[11]) || lIIIlllIlllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIIIlllIlllll(Inventory.contains(item -> {
            return item.getName().contains(lIlIIlllll[lIlIlIIIII[39]]);
        }) ? 1 : 0) && lIIIlllIllllI(Players.getLocal().getAnimation(), lIlIlIIIII[12])) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(lIlIIlllll[lIlIlIIIII[38]]);
            }).interact(lIlIIlllll[lIlIlIIIII[1]]);
            Time.sleepTicks(lIlIlIIIII[13]);
            "".length();
        }
        if (lIIIlllIlllll(Inventory.contains(C0005f.be) ? 1 : 0) && lIIIllllIIIII(Equipment.contains(C0005f.be) ? 1 : 0)) {
            Inventory.getFirst(C0005f.be).interact(lIlIIlllll[lIlIlIIIII[14]]);
            Time.sleepTicks(lIlIlIIIII[14]);
            "".length();
        }
        if (lIIIlllIlllll(Inventory.contains(C0005f.aN) ? 1 : 0) && lIIIllllIIIII(Equipment.contains(C0005f.aN) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aN).interact(lIlIIlllll[lIlIlIIIII[15]]);
            Time.sleepTicks(lIlIlIIIII[14]);
            "".length();
        }
        if (!lIIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(x), lIlIlIIIII[11]) || lIIIlllIlllll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks(lIlIlIIIII[14]);
            "".length();
            "".length();
            if (0 != 0) {
            }
        } else if (!lIIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(F), lIlIlIIIII[16]) || !lIIIllllIIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIIlllIlllll(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks(lIlIlIIIII[14]);
            "".length();
            "".length();
            if ((105 ^ 108) <= 0) {
            }
        } else if (lIIIlllIlllll(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks(lIlIlIIIII[14]);
            "".length();
            "".length();
            if ((((((21 + 19) - (-153)) + 59) ^ (((15 + 98) - 24) + 67)) & (((((134 + 102) - 157) + 120) ^ (((11 + 43) - (-45)) + 68)) ^ (-" ".length()))) != 0) {
            }
        } else if (lIIIlllIlllll(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(C0001b.I);
            "".length();
            Time.sleepTicks(lIlIlIIIII[14]);
            "".length();
            "".length();
            if ((-" ".length()) > 0) {
            }
        } else {
            WorldArea worldArea2 = new WorldArea(lIlIlIIIII[17], lIlIlIIIII[18], lIlIlIIIII[13], lIlIlIIIII[19], lIlIlIIIII[2]);
            WorldArea worldArea3 = new WorldArea(lIlIlIIIII[20], lIlIlIIIII[21], lIlIlIIIII[22], lIlIlIIIII[23], lIlIlIIIII[2]);
            if ((!lIIIllllIIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIIlllIlllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIIIlllIlllll(Inventory.contains(item3 -> {
                return item3.getName().contains(lIlIIlllll[lIlIlIIIII[37]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().contains(lIlIIlllll[lIlIlIIIII[36]]);
                }).interact(lIlIIlllll[lIlIlIIIII[24]]);
                Time.sleepTicks(lIlIlIIIII[24]);
                "".length();
            }
            if (lIIIlllIlllll(new WorldArea(lIlIlIIIII[25], lIlIlIIIII[26], lIlIlIIIII[27], lIlIlIIIII[13], lIlIlIIIII[2]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[lIlIlIIIII[1]];
                strArr2[lIlIlIIIII[2]] = lIlIIlllll[lIlIlIIIII[19]];
                TileObject nearest = TileObjects.getNearest(strArr2);
                if (lIIIllllIIIlI(nearest)) {
                    nearest.interact(lIlIIlllll[lIlIlIIIII[13]]);
                    Time.sleepTicks(lIlIlIIIII[24]);
                    "".length();
                }
            }
            Movement.walkTo(bankLocation);
            "".length();
            Time.sleepTicks(lIlIlIIIII[14]);
            "".length();
        }
    }

    static {
        lIIIlllIlllIl();
        lIIIlllIlllII();
        w = new WorldArea(lIlIlIIIII[40], lIlIlIIIII[41], lIlIlIIIII[42], lIlIlIIIII[43], lIlIlIIIII[2]);
        x = new WorldPoint(lIlIlIIIII[44], lIlIlIIIII[45], lIlIlIIIII[2]);
        y = new WorldArea(lIlIlIIIII[46], lIlIlIIIII[47], lIlIlIIIII[48], lIlIlIIIII[48], lIlIlIIIII[2]);
        z = new WorldArea(lIlIlIIIII[49], lIlIlIIIII[50], lIlIlIIIII[51], lIlIlIIIII[52], lIlIlIIIII[2]);
        A = new WorldArea(lIlIlIIIII[53], lIlIlIIIII[54], lIlIlIIIII[38], lIlIlIIIII[11], lIlIlIIIII[2]);
        B = new WorldArea(lIlIlIIIII[55], lIlIlIIIII[56], lIlIlIIIII[57], lIlIlIIIII[58], lIlIlIIIII[2]);
        C = new WorldArea(lIlIlIIIII[59], lIlIlIIIII[60], lIlIlIIIII[61], lIlIlIIIII[62], lIlIlIIIII[2]);
        D = new WorldArea(lIlIlIIIII[63], lIlIlIIIII[64], lIlIlIIIII[35], lIlIlIIIII[36], lIlIlIIIII[2]);
        E = new WorldArea(lIlIlIIIII[7], lIlIlIIIII[65], lIlIlIIIII[66], lIlIlIIIII[67], lIlIlIIIII[2]);
        F = new WorldPoint(lIlIlIIIII[68], lIlIlIIIII[69], lIlIlIIIII[2]);
        G = new WorldPoint(lIlIlIIIII[70], lIlIlIIIII[71], lIlIlIIIII[2]);
        H = new WorldPoint(lIlIlIIIII[72], lIlIlIIIII[73], lIlIlIIIII[1]);
    }

    public static void a(int[] iArr, int i) {
        int i2 = lIlIlIIIII[2];
        while (lIIIllllIIlII(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIlIlIIIII[1]);
            "".length();
            i2++;
            "".length();
            if (((125 ^ 96) & ((41 ^ 52) ^ (-1))) > 0) {
                return;
            }
        }
    }

    private static boolean lIIIlllIlllll(int i) {
        return i != 0;
    }

    private static String lIIIlllIllIIl(String lllllllllllllllllllIlllllllIIlIl, String lllllllllllllllllllIlllllllIIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllIlllllllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlllllllIIIll = new StringBuilder();
        char[] lllllllllllllllllllIlllllllIIIlI = lllllllllllllllllllIlllllllIIlII.toCharArray();
        int lllllllllllllllllllIlllllllIIIIl = lIlIlIIIII[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlIIIII[2];
        while (lIIIllllIIlII(i, length)) {
            char lllllllllllllllllllIlllllllIIllI = charArray[i];
            lllllllllllllllllllIlllllllIIIll.append((char) (lllllllllllllllllllIlllllllIIllI ^ lllllllllllllllllllIlllllllIIIlI[lllllllllllllllllllIlllllllIIIIl % lllllllllllllllllllIlllllllIIIlI.length]));
            "".length();
            lllllllllllllllllllIlllllllIIIIl++;
            i++;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIlllllllIIIll);
    }

    private static String lIIIlllIllIll(String lllllllllllllllllllIllllllIIlllI, String lllllllllllllllllllIllllllIIllll) {
        try {
            SecretKeySpec lllllllllllllllllllIllllllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIllllllIIllll.getBytes(StandardCharsets.UTF_8)), lIlIlIIIII[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIIIII[14], lllllllllllllllllllIllllllIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIllllllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIllllllIlIIIl) {
            lllllllllllllllllllIllllllIlIIIl.printStackTrace();
            return null;
        }
    }

    public static void a(int i, int i2) {
        int[] iArr = new int[lIlIlIIIII[1]];
        iArr[lIlIlIIIII[2]] = i;
        if (lIIIllllIIIII(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + i + " item id");
        }
        int[] iArr2 = new int[lIlIlIIIII[1]];
        iArr2[lIlIlIIIII[2]] = i;
        if (lIIIlllIlllll(Bank.contains(iArr2) ? 1 : 0)) {
            Bank.withdraw(i, i2, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIlIlIIIII[1]);
            "".length();
        }
    }
}
