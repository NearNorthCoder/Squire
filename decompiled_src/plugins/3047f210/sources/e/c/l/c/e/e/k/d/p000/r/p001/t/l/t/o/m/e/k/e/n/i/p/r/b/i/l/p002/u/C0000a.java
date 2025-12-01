package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/a.class */
public class C0000a {
    private static /* synthetic */ String[] llllIlIIIl;
    public static final /* synthetic */ WorldArea A;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea E;
    static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea y;
    public static final /* synthetic */ WorldArea D;
    private static /* synthetic */ int[] llllIlIIlI;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea w;
    public static /* synthetic */ WorldPoint F;
    public static final /* synthetic */ WorldPoint x;
    public static final /* synthetic */ WorldArea B;

    private static boolean llIIlllIllllI(int i, int i2) {
        return i == i2;
    }

    public static void a(int[] iArr) {
        int i = llllIlIIlI[2];
        while (llIIllllIIlII(i, iArr.length)) {
            Bank.withdraw(iArr[i], llllIlIIlI[1], Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llllIlIIlI[1]);
            "".length();
            i++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    public static void b(int[] iArr, int i) {
        int i2 = llllIlIIlI[2];
        while (llIIllllIIlII(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llllIlIIlI[1]);
            "".length();
            int[] iArr2 = new int[llllIlIIlI[1]];
            iArr2[llllIlIIlI[2]] = iArr[i2];
            if (llIIlllIlllll(Inventory.contains(iArr2) ? 1 : 0)) {
                "".length();
                if ((101 ^ 96) <= 0) {
                    return;
                }
                return;
            }
            i2++;
            "".length();
            if (((53 ^ 18) & ((48 ^ 23) ^ (-1))) >= " ".length()) {
                return;
            }
        }
    }

    private static boolean llIIllllIIIII(int i) {
        return i == 0;
    }

    public static void a(int[] iArr, int i) {
        int i2 = llllIlIIlI[2];
        while (llIIllllIIlII(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llllIlIIlI[1]);
            "".length();
            i2++;
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return;
            }
        }
    }

    static {
        llIIlllIlllIl();
        llIIlllIlllII();
        w = new WorldArea(llllIlIIlI[40], llllIlIIlI[41], llllIlIIlI[42], llllIlIIlI[43], llllIlIIlI[2]);
        x = new WorldPoint(llllIlIIlI[44], llllIlIIlI[45], llllIlIIlI[2]);
        y = new WorldArea(llllIlIIlI[46], llllIlIIlI[47], llllIlIIlI[48], llllIlIIlI[48], llllIlIIlI[2]);
        z = new WorldArea(llllIlIIlI[49], llllIlIIlI[50], llllIlIIlI[51], llllIlIIlI[52], llllIlIIlI[2]);
        A = new WorldArea(llllIlIIlI[53], llllIlIIlI[54], llllIlIIlI[38], llllIlIIlI[11], llllIlIIlI[2]);
        B = new WorldArea(llllIlIIlI[55], llllIlIIlI[56], llllIlIIlI[57], llllIlIIlI[58], llllIlIIlI[2]);
        C = new WorldArea(llllIlIIlI[59], llllIlIIlI[60], llllIlIIlI[61], llllIlIIlI[62], llllIlIIlI[2]);
        D = new WorldArea(llllIlIIlI[63], llllIlIIlI[64], llllIlIIlI[35], llllIlIIlI[36], llllIlIIlI[2]);
        E = new WorldArea(llllIlIIlI[7], llllIlIIlI[65], llllIlIIlI[66], llllIlIIlI[67], llllIlIIlI[2]);
        F = new WorldPoint(llllIlIIlI[68], llllIlIIlI[69], llllIlIIlI[2]);
        G = new WorldPoint(llllIlIIlI[70], llllIlIIlI[71], llllIlIIlI[2]);
        H = new WorldPoint(llllIlIIlI[72], llllIlIIlI[73], llllIlIIlI[1]);
    }

    private static void llIIlllIlllII() {
        llllIlIIIl = new String[llllIlIIlI[11]];
        llllIlIIIl[llllIlIIlI[2]] = llIIlllIllIIl("BLkY6mBaSOg=", "qiPqh");
        llllIlIIIl[llllIlIIlI[1]] = llIIlllIllIlI("DwU2MxI=", "MwSRy");
        llllIlIIIl[llllIlIIlI[14]] = llIIlllIllIIl("7NXknGle+kg=", "zfBCX");
        llllIlIIIl[llllIlIIlI[15]] = llIIlllIllIIl("PXR1VXIEFwo=", "akAxB");
        llllIlIIIl[llllIlIIlI[24]] = llIIlllIllIlI("JBUmFjE=", "fgCwZ");
        llllIlIIIl[llllIlIIlI[19]] = llIIlllIllIll("2GYqKzht2kQ=", "Fzztz");
        llllIlIIIl[llllIlIIlI[13]] = llIIlllIllIIl("ykhmADsyrNk=", "agduH");
        llllIlIIIl[llllIlIIlI[27]] = llIIlllIllIIl("v9i/fxUQAN/6r8grXFT3GOdSWhgJ2kHU", "PkIGi");
        llllIlIIIl[llllIlIIlI[29]] = llIIlllIllIlI("BhYePw==", "DwpTt");
        llllIlIIIl[llllIlIIlI[31]] = llIIlllIllIlI("DDkmPkotMC0mHg==", "NXHUj");
        llllIlIIIl[llllIlIIlI[23]] = llIIlllIllIll("zF8qH7I7syk=", "PJVse");
        llllIlIIIl[llllIlIIlI[22]] = llIIlllIllIIl("qKjEGlkJQFg=", "uPsng");
        llllIlIIIl[llllIlIIlI[32]] = llIIlllIllIll("t06pa5L/azI=", "JbQRC");
        llllIlIIIl[llllIlIIlI[33]] = llIIlllIllIll("ntcR00PpUl8=", "drzxg");
        llllIlIIIl[llllIlIIlI[34]] = llIIlllIllIll("6H6BfaR/PqTJs34M/TrOew==", "laLpo");
        llllIlIIIl[llllIlIIlI[35]] = llIIlllIllIll("udlRJzpD3yw=", "fcdjB");
        llllIlIIIl[llllIlIIlI[36]] = llIIlllIllIlI("PRQnED8mAz8=", "IqKuO");
        llllIlIIIl[llllIlIIlI[37]] = llIIlllIllIlI("HhcZEAcFAAE=", "jruuw");
        llllIlIIIl[llllIlIIlI[38]] = llIIlllIllIll("4UubtbFARNIHd4X6+FBWeg==", "grJgV");
        llllIlIIIl[llllIlIIlI[39]] = llIIlllIllIIl("iZ3IH6ABqhAopIWDxmg/Fw==", "dtROS");
    }

    private static String llIIlllIllIlI(String lllllllllllllllllIlIlIllllIIllIl, String lllllllllllllllllIlIlIllllIIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIllllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIlIllllIIlIll = new StringBuilder();
        char[] lllllllllllllllllIlIlIllllIIlIlI = lllllllllllllllllIlIlIllllIIllII.toCharArray();
        int lllllllllllllllllIlIlIllllIIlIIl = llllIlIIlI[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIlIIlI[2];
        while (llIIllllIIlII(i, length)) {
            char lllllllllllllllllIlIlIllllIIlllI = charArray[i];
            lllllllllllllllllIlIlIllllIIlIll.append((char) (lllllllllllllllllIlIlIllllIIlllI ^ lllllllllllllllllIlIlIllllIIlIlI[lllllllllllllllllIlIlIllllIIlIIl % lllllllllllllllllIlIlIllllIIlIlI.length]));
            "".length();
            lllllllllllllllllIlIlIllllIIlIIl++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIlIllllIIlIll);
    }

    private static boolean llIIlllIlllll(int i) {
        return i != 0;
    }

    private static boolean llIIllllIIIll(Object obj) {
        return obj != null;
    }

    private static void llIIlllIlllIl() {
        llllIlIIlI = new int[74];
        llllIlIIlI[0] = (-((-203) & 26591)) & (-4137) & 32700;
        llllIlIIlI[1] = " ".length();
        llllIlIIlI[2] = " ".length() & (" ".length() ^ (-" ".length()));
        llllIlIIlI[3] = (-((-18437) & 27727)) & (-16385) & 28126;
        llllIlIIlI[4] = (-28161) & 32633;
        llllIlIIlI[5] = (-((-19610) & 31997)) & (-16405) & 31743;
        llllIlIIlI[6] = (-99) & 5871;
        llllIlIIlI[7] = (-((-18473) & 23723)) & (-8193) & 16382;
        llllIlIIlI[8] = (-((-5130) & 29755)) & (-67) & 30451;
        llllIlIIlI[9] = 217 ^ 194;
        llllIlIIlI[10] = 130 ^ 158;
        llllIlIIlI[11] = 157 ^ 137;
        llllIlIIlI[12] = -" ".length();
        llllIlIIlI[13] = 157 ^ 155;
        llllIlIIlI[14] = "  ".length();
        llllIlIIlI[15] = "   ".length();
        llllIlIIlI[16] = 163 ^ 139;
        llllIlIIlI[17] = (-16707) & 19314;
        llllIlIIlI[18] = (-12347) & 15738;
        llllIlIIlI[19] = 125 ^ 120;
        llllIlIIlI[20] = (-((-10503) & 15679)) & (-8450) & 16189;
        llllIlIIlI[21] = (-((-3883) & 16302)) & (-17489) & 32767;
        llllIlIIlI[22] = (161 ^ 183) ^ (75 ^ 86);
        llllIlIIlI[23] = 202 ^ 192;
        llllIlIIlI[24] = (112 ^ 55) ^ (205 ^ 142);
        llllIlIIlI[25] = (-((-14591) & 15359)) & (-16401) & 20319;
        llllIlIIlI[26] = (-20485) & 24405;
        llllIlIIlI[27] = (29 ^ 66) ^ (23 ^ 79);
        llllIlIIlI[28] = (((149 + 10) - 113) + 123) ^ (((67 + 177) - 220) + 159);
        llllIlIIlI[29] = 53 ^ 61;
        llllIlIIlI[30] = (-8271) & 12270;
        llllIlIIlI[31] = (173 ^ 161) ^ (155 ^ 158);
        llllIlIIlI[32] = (93 ^ 41) ^ (197 ^ 189);
        llllIlIIlI[33] = 121 ^ 116;
        llllIlIIlI[34] = (210 ^ 154) ^ (50 ^ 116);
        llllIlIIlI[35] = 53 ^ 58;
        llllIlIIlI[36] = 212 ^ 196;
        llllIlIIlI[37] = (((101 + 34) - 25) + 27) ^ (((100 + 5) - 101) + 148);
        llllIlIIlI[38] = 11 ^ 25;
        llllIlIIlI[39] = (((15 + 131) - 93) + 161) ^ (((117 + 61) - 159) + 178);
        llllIlIIlI[40] = (-((-897) & 5025)) & (-17289) & 24559;
        llllIlIIlI[41] = (-(182 ^ 159)) & (-4679) & 8191;
        llllIlIIlI[42] = "  ".length() ^ (39 ^ 12);
        llllIlIIlI[43] = (36 ^ 11) ^ (77 ^ 69);
        llllIlIIlI[44] = (-25419) & 28622;
        llllIlIIlI[45] = (-((-5249) & 30361)) & (-4289) & 32765;
        llllIlIIlI[46] = (-((-353) & 5477)) & (-1) & 8031;
        llllIlIIlI[47] = (-24613) & 27822;
        llllIlIIlI[48] = (((74 + 141) - 47) + 27) ^ (((27 + 59) - (-43)) + 41);
        llllIlIIlI[49] = (-((-18556) & 23551)) & (-8193) & 16383;
        llllIlIIlI[50] = (-24713) & 28078;
        llllIlIIlI[51] = (((187 + 224) - 189) + 8) ^ (((55 + 71) - 95) + 166);
        llllIlIIlI[52] = 180 ^ 142;
        llllIlIIlI[53] = (-17355) & 20479;
        llllIlIIlI[54] = (-((-27777) & 31961)) & (-24961) & 32763;
        llllIlIIlI[55] = (-20897) & 24510;
        llllIlIIlI[56] = (-8705) & 12122;
        llllIlIIlI[57] = 35 ^ 127;
        llllIlIIlI[58] = (104 ^ 121) ^ (32 ^ 20);
        llllIlIIlI[59] = (-((-3603) & 28439)) & (-4609) & 32574;
        llllIlIIlI[60] = (-((-19937) & 24043)) & (-24577) & 32123;
        llllIlIIlI[61] = 148 ^ 165;
        llllIlIIlI[62] = 202 ^ 142;
        llllIlIIlI[63] = (-12673) & 14302;
        llllIlIIlI[64] = (-28816) & 32751;
        llllIlIIlI[65] = (-((-4193) & 21361)) & (-1) & 20477;
        llllIlIIlI[66] = 147 ^ 190;
        llllIlIIlI[67] = 44 ^ 8;
        llllIlIIlI[68] = (-25601) & 28575;
        llllIlIIlI[69] = (-8774) & 12015;
        llllIlIIlI[70] = (-28993) & 30714;
        llllIlIIlI[71] = (-((-17587) & 22263)) & (-24611) & 32751;
        llllIlIIlI[72] = (-((-897) & 5011)) & (-8201) & 15358;
        llllIlIIlI[73] = (-1155) & 6127;
    }

    public static void a(BankLocation bankLocation) {
        if (llIIlllIllllI(Vars.getBit(llllIlIIlI[0]), llllIlIIlI[1]) && llIIlllIlllll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[llllIlIIlI[1]];
            strArr[llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[2]];
            C0006g.a(strArr);
        }
        WorldPoint worldPoint = new WorldPoint(llllIlIIlI[3], llllIlIIlI[4], llllIlIIlI[2]);
        WorldPoint worldPoint2 = new WorldPoint(llllIlIIlI[5], llllIlIIlI[6], llllIlIIlI[2]);
        WorldArea worldArea = new WorldArea(llllIlIIlI[7], llllIlIIlI[8], llllIlIIlI[9], llllIlIIlI[10], llllIlIIlI[2]);
        if ((!llIIllllIIIII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !llIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llllIlIIlI[11]) || llIIlllIlllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llIIlllIlllll(Inventory.contains(item -> {
            return item.getName().contains(llllIlIIIl[llllIlIIlI[39]]);
        }) ? 1 : 0) && llIIlllIllllI(Players.getLocal().getAnimation(), llllIlIIlI[12])) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(llllIlIIIl[llllIlIIlI[38]]);
            }).interact(llllIlIIIl[llllIlIIlI[1]]);
            Time.sleepTicks(llllIlIIlI[13]);
            "".length();
        }
        if (llIIlllIlllll(Inventory.contains(C0005f.be) ? 1 : 0) && llIIllllIIIII(Equipment.contains(C0005f.be) ? 1 : 0)) {
            Inventory.getFirst(C0005f.be).interact(llllIlIIIl[llllIlIIlI[14]]);
            Time.sleepTicks(llllIlIIlI[14]);
            "".length();
        }
        if (llIIlllIlllll(Inventory.contains(C0005f.aN) ? 1 : 0) && llIIllllIIIII(Equipment.contains(C0005f.aN) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aN).interact(llllIlIIIl[llllIlIIlI[15]]);
            Time.sleepTicks(llllIlIIlI[14]);
            "".length();
        }
        if (!llIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(x), llllIlIIlI[11]) || llIIlllIlllll(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks(llllIlIIlI[14]);
            "".length();
            "".length();
            if ((30 ^ 26) < 0) {
            }
        } else if (!llIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(F), llllIlIIlI[16]) || !llIIllllIIIII(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !llIIllllIIIII(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIIllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(Q.iH), llllIlIIlI[16])) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks(llllIlIIlI[14]);
            "".length();
            "".length();
            if ("  ".length() > "  ".length()) {
            }
        } else if (llIIlllIlllll(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks(llllIlIIlI[14]);
            "".length();
            "".length();
            if (0 != 0) {
            }
        } else if (llIIlllIlllll(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(C0001b.I);
            "".length();
            Time.sleepTicks(llllIlIIlI[14]);
            "".length();
            "".length();
            if ("  ".length() > "  ".length()) {
            }
        } else {
            WorldArea worldArea2 = new WorldArea(llllIlIIlI[17], llllIlIIlI[18], llllIlIIlI[13], llllIlIIlI[19], llllIlIIlI[2]);
            WorldArea worldArea3 = new WorldArea(llllIlIIlI[20], llllIlIIlI[21], llllIlIIlI[22], llllIlIIlI[23], llllIlIIlI[2]);
            if ((!llIIllllIIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIIlllIlllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llIIlllIlllll(Inventory.contains(item3 -> {
                return item3.getName().contains(llllIlIIIl[llllIlIIlI[37]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().contains(llllIlIIIl[llllIlIIlI[36]]);
                }).interact(llllIlIIIl[llllIlIIlI[24]]);
                Time.sleepTicks(llllIlIIlI[24]);
                "".length();
            }
            if (llIIlllIlllll(new WorldArea(llllIlIIlI[25], llllIlIIlI[26], llllIlIIlI[27], llllIlIIlI[13], llllIlIIlI[2]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[llllIlIIlI[1]];
                strArr2[llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[19]];
                TileObject nearest = TileObjects.getNearest(strArr2);
                if (llIIllllIIIll(nearest)) {
                    nearest.interact(llllIlIIIl[llllIlIIlI[13]]);
                    Time.sleepTicks(llllIlIIlI[24]);
                    "".length();
                }
            }
            Movement.walkTo(bankLocation);
            "".length();
            Time.sleepTicks(llllIlIIlI[14]);
            "".length();
        }
    }

    public static void a() {
        if (llIIllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(H), llllIlIIlI[28])) {
            String[] strArr = new String[llllIlIIlI[1]];
            strArr[llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[27]];
            NPCs.getNearest(strArr).interact(llllIlIIIl[llllIlIIlI[29]]);
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, llllIlIIlI[30]);
            "".length();
        }
        if (!llIIllllIIIII(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIIlllIlllll(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks(llllIlIIlI[15]);
            "".length();
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, llllIlIIlI[30]);
            "".length();
            "".length();
            if ((((27 ^ 122) ^ ((199 ^ 137) & ((85 ^ 27) ^ (-1)))) & (((((184 + 62) - 233) + 207) ^ (((15 + 184) - 56) + 46)) ^ (-" ".length()))) > " ".length()) {
            }
        } else if (llIIllllIIIII(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIIIII(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIIIII(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIIIII(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIIIII(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIIllllIIIlI(Players.getLocal().getWorldLocation().distanceTo(G), llllIlIIlI[11])) {
            if (llIIllllIIIII(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllllIIIIl(Players.getLocal().getWorldLocation().distanceTo(H), llllIlIIlI[28])) {
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                String[] strArr2 = new String[llllIlIIlI[1]];
                strArr2[llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[34]];
                TileObject nearest = TileObjects.getNearest(worldLocation, strArr2);
                if (llIIllllIIIll(nearest)) {
                    nearest.interact(llllIlIIIl[llllIlIIlI[35]]);
                    Time.sleepTicks(llllIlIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llllIlIIlI[30]);
                    "".length();
                }
            }
        } else {
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            String[] strArr3 = new String[llllIlIIlI[1]];
            strArr3[llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[31]];
            TileObject nearest2 = TileObjects.getNearest(worldLocation2, strArr3);
            if (llIIllllIIIll(nearest2)) {
                String[] strArr4 = new String[llllIlIIlI[1]];
                strArr4[llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[23]];
                if (llIIlllIlllll(nearest2.hasAction(strArr4) ? 1 : 0)) {
                    nearest2.interact(llllIlIIIl[llllIlIIlI[22]]);
                    Time.sleepTicks(llllIlIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llllIlIIlI[30]);
                    "".length();
                }
                String[] strArr5 = new String[llllIlIIlI[1]];
                strArr5[llllIlIIlI[2]] = llllIlIIIl[llllIlIIlI[32]];
                if (llIIlllIlllll(nearest2.hasAction(strArr5) ? 1 : 0)) {
                    nearest2.interact(llllIlIIIl[llllIlIIlI[33]]);
                    Time.sleepTicks(llllIlIIlI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llllIlIIlI[30]);
                    "".length();
                }
            }
            "".length();
            if ((-" ".length()) != (-" ".length())) {
            }
        }
    }

    private static boolean llIIllllIIlII(int i, int i2) {
        return i < i2;
    }

    private static String llIIlllIllIIl(String lllllllllllllllllIlIlIllllIlllIl, String lllllllllllllllllIlIlIllllIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIllllIlllII.getBytes(StandardCharsets.UTF_8)), llllIlIIlI[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIIlI[14], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIllllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIllllIllllI) {
            lllllllllllllllllIlIlIllllIllllI.printStackTrace();
            return null;
        }
    }

    private static String llIIlllIllIll(String lllllllllllllllllIlIlIlllIlllIII, String lllllllllllllllllIlIlIlllIllIlll) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIlllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIlllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIIlI[14], lllllllllllllllllIlIlIlllIlllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIlllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIlllIlllIIl) {
            lllllllllllllllllIlIlIlllIlllIIl.printStackTrace();
            return null;
        }
    }

    public static void b(int i, int i2) {
        Bank.withdraw(i, i2, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(llllIlIIlI[1]);
        "".length();
    }

    public static void a(int i, int i2) {
        int[] iArr = new int[llllIlIIlI[1]];
        iArr[llllIlIIlI[2]] = i;
        if (llIIllllIIIII(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + i + " item id");
        }
        int[] iArr2 = new int[llllIlIIlI[1]];
        iArr2[llllIlIIlI[2]] = i;
        if (llIIlllIlllll(Bank.contains(iArr2) ? 1 : 0)) {
            Bank.withdraw(i, i2, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llllIlIIlI[1]);
            "".length();
        }
    }

    private static boolean llIIllllIIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIllllIIIlI(int i, int i2) {
        return i <= i2;
    }
}
