package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/a.class */
public class C0000a {
    static /* synthetic */ WorldPoint J;
    private static /* synthetic */ String[] llIlIllII;
    public static final /* synthetic */ WorldArea D;
    private static /* synthetic */ int[] llIlIllIl;
    public static final /* synthetic */ WorldArea B;
    public static /* synthetic */ WorldPoint I;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea G;
    public static final /* synthetic */ WorldArea F;
    public static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea y;
    public static final /* synthetic */ WorldPoint z;
    public static final /* synthetic */ WorldArea E;
    public static final /* synthetic */ WorldArea A;

    public static void a(int[] iArr, int i) {
        int i2 = llIlIllIl[2];
        while (lIllIlIllllI(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIllIl[1]);
            "".length();
            i2++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    private static boolean lIllIlIllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIllIIl(int i) {
        return i != 0;
    }

    private static boolean lIllIlIlllIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIllIlIlIlIl(String lIIIllIllIIlll, String lIIIllIllIIllI) {
        String lIIIllIllIIlll2 = new String(Base64.getDecoder().decode(lIIIllIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIllIllIIlIl = new StringBuilder();
        char[] charArray = lIIIllIllIIllI.toCharArray();
        int lIIIllIllIIIll = llIlIllIl[2];
        char[] charArray2 = lIIIllIllIIlll2.toCharArray();
        int length = charArray2.length;
        int i = llIlIllIl[2];
        while (lIllIlIllllI(i, length)) {
            lIIIllIllIIlIl.append((char) (charArray2[i] ^ charArray[lIIIllIllIIIll % charArray.length]));
            "".length();
            lIIIllIllIIIll++;
            i++;
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lIIIllIllIIlIl);
    }

    public static void a(int i, int i2) {
        int[] iArr = new int[llIlIllIl[1]];
        iArr[llIlIllIl[2]] = i;
        if (lIllIlIllIlI(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + i + " item id");
        }
        int[] iArr2 = new int[llIlIllIl[1]];
        iArr2[llIlIllIl[2]] = i;
        if (lIllIlIllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            Bank.withdraw(i, i2, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIllIl[1]);
            "".length();
        }
    }

    public static void a() {
        if (lIllIlIlllIl(Players.getLocal().getWorldLocation().distanceTo(J), llIlIllIl[28])) {
            String[] strArr = new String[llIlIllIl[1]];
            strArr[llIlIllIl[2]] = llIlIllII[llIlIllIl[27]];
            NPCs.getNearest(strArr).interact(llIlIllII[llIlIllIl[29]]);
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, llIlIllIl[30]);
            "".length();
        }
        if (!lIllIlIllIlI(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIllIlIllIIl(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks(llIlIllIl[15]);
            "".length();
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, llIlIllIl[30]);
            "".length();
            "".length();
            if (((((135 + 55) - 95) + 83) ^ (((48 + 54) - (-80)) + 0)) <= "  ".length()) {
            }
        } else if (lIllIlIllIlI(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIllIlI(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIllIlI(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIllIlI(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIllIlI(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIllIlIlllIl(Players.getLocal().getWorldLocation().distanceTo(I), llIlIllIl[11])) {
            if (lIllIlIllIlI(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(J), llIlIllIl[28])) {
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                String[] strArr2 = new String[llIlIllIl[1]];
                strArr2[llIlIllIl[2]] = llIlIllII[llIlIllIl[34]];
                TileObject nearest = TileObjects.getNearest(worldLocation, strArr2);
                if (lIllIlIlllII(nearest)) {
                    nearest.interact(llIlIllII[llIlIllIl[35]]);
                    Time.sleepTicks(llIlIllIl[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIllIl[30]);
                    "".length();
                }
            }
        } else {
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            String[] strArr3 = new String[llIlIllIl[1]];
            strArr3[llIlIllIl[2]] = llIlIllII[llIlIllIl[31]];
            TileObject nearest2 = TileObjects.getNearest(worldLocation2, strArr3);
            if (lIllIlIlllII(nearest2)) {
                String[] strArr4 = new String[llIlIllIl[1]];
                strArr4[llIlIllIl[2]] = llIlIllII[llIlIllIl[23]];
                if (lIllIlIllIIl(nearest2.hasAction(strArr4) ? 1 : 0)) {
                    nearest2.interact(llIlIllII[llIlIllIl[22]]);
                    Time.sleepTicks(llIlIllIl[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIllIl[30]);
                    "".length();
                }
                String[] strArr5 = new String[llIlIllIl[1]];
                strArr5[llIlIllIl[2]] = llIlIllII[llIlIllIl[32]];
                if (lIllIlIllIIl(nearest2.hasAction(strArr5) ? 1 : 0)) {
                    nearest2.interact(llIlIllII[llIlIllIl[33]]);
                    Time.sleepTicks(llIlIllIl[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIllIl[30]);
                    "".length();
                }
            }
            "".length();
            if (0 != 0) {
            }
        }
    }

    private static boolean lIllIlIllIII(int i, int i2) {
        return i == i2;
    }

    private static void lIllIlIlIllI() {
        llIlIllII = new String[llIlIllIl[11]];
        llIlIllII[llIlIllIl[2]] = lIllIlIlIIll("V3pF9LD+peM=", "evjtE");
        llIlIllII[llIlIllIl[1]] = lIllIlIlIlII("RDygZfLBzVI=", "FIVsL");
        llIlIllII[llIlIllIl[14]] = lIllIlIlIlII("vpK0VRhUr7c=", "mQJdg");
        llIlIllII[llIlIllIl[15]] = lIllIlIlIlIl("IyELGg==", "tDjho");
        llIlIllII[llIlIllIl[24]] = lIllIlIlIlII("uwVe5qo7cSw=", "YLlUd");
        llIlIllII[llIlIllIl[19]] = lIllIlIlIlII("MlWWvQlFec8=", "cmCYt");
        llIlIllII[llIlIllIl[13]] = lIllIlIlIlIl("PhYjAQ==", "ncOmZ");
        llIlIllII[llIlIllIl[27]] = lIllIlIlIlII("mTHDp43x7NzqDvPTN7ODwEbNIa7T451m", "DmrjK");
        llIlIllII[llIlIllIl[29]] = lIllIlIlIIll("KA1Bl1qolAc=", "BWpQN");
        llIlIllII[llIlIllIl[31]] = lIllIlIlIlII("QLF09R0rwr2z6Ec2M9H80g==", "JLAsJ");
        llIlIllII[llIlIllIl[23]] = lIllIlIlIlII("COFI5DhmV3U=", "LrSdp");
        llIlIllII[llIlIllIl[22]] = lIllIlIlIlII("wiJshWzBBKE=", "QooFG");
        llIlIllII[llIlIllIl[32]] = lIllIlIlIlIl("BSgtBg==", "GICmL");
        llIlIllII[llIlIllIl[33]] = lIllIlIlIIll("B5gmhRY5C+8=", "aLxfz");
        llIlIllII[llIlIllIl[34]] = lIllIlIlIIll("9zhafk/MBCdjmdG43P8slg==", "fftFc");
        llIlIllII[llIlIllIl[35]] = lIllIlIlIIll("oKRN63saWdY=", "JiMBS");
        llIlIllII[llIlIllIl[36]] = lIllIlIlIIll("jJS3WkqIHQeOilOP4GFKbQ==", "LzPjg");
        llIlIllII[llIlIllIl[37]] = lIllIlIlIlII("IGHSc8Tb64Ho9AxvZzyNNA==", "kIuje");
        llIlIllII[llIlIllIl[38]] = lIllIlIlIlIl("GgMWDCoBFA4=", "nfziZ");
        llIlIllII[llIlIllIl[39]] = lIllIlIlIIll("mJDjbcI7Eu3supH7VOS3yg==", "eJdDA");
    }

    private static boolean lIllIlIllIll(int i, int i2) {
        return i > i2;
    }

    public static void b(int[] iArr, int i) {
        int i2 = llIlIllIl[2];
        while (lIllIlIllllI(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIllIl[1]);
            "".length();
            int[] iArr2 = new int[llIlIllIl[1]];
            iArr2[llIlIllIl[2]] = iArr[i2];
            if (lIllIlIllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                return;
            }
            i2++;
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
    }

    private static boolean lIllIlIlllII(Object obj) {
        return obj != null;
    }

    public static void a(int[] iArr) {
        int i = llIlIllIl[2];
        while (lIllIlIllllI(i, iArr.length)) {
            Bank.withdraw(iArr[i], llIlIllIl[1], Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(llIlIllIl[1]);
            "".length();
            i++;
            "".length();
            if (((11 ^ 84) & ((122 ^ 37) ^ (-1))) > 0) {
                return;
            }
        }
    }

    public static void a(BankLocation bankLocation) {
        if (lIllIlIllIII(Vars.getBit(llIlIllIl[0]), llIlIllIl[1]) && lIllIlIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[llIlIllIl[1]];
            strArr[llIlIllIl[2]] = llIlIllII[llIlIllIl[2]];
            C0006g.a(strArr);
        }
        WorldPoint worldPoint = new WorldPoint(llIlIllIl[3], llIlIllIl[4], llIlIllIl[2]);
        WorldPoint worldPoint2 = new WorldPoint(llIlIllIl[5], llIlIllIl[6], llIlIllIl[2]);
        WorldArea worldArea = new WorldArea(llIlIllIl[7], llIlIllIl[8], llIlIllIl[9], llIlIllIl[10], llIlIllIl[2]);
        if ((!lIllIlIllIlI(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIlIllIl[11]) || lIllIlIllIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIllIlIllIIl(Inventory.contains(item -> {
            return item.getName().contains(llIlIllII[llIlIllIl[39]]);
        }) ? 1 : 0) && lIllIlIllIII(Players.getLocal().getAnimation(), llIlIllIl[12])) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(llIlIllII[llIlIllIl[38]]);
            }).interact(llIlIllII[llIlIllIl[1]]);
            Time.sleepTicks(llIlIllIl[13]);
            "".length();
        }
        if (lIllIlIllIIl(Inventory.contains(C0005f.bm) ? 1 : 0) && lIllIlIllIlI(Equipment.contains(C0005f.bm) ? 1 : 0)) {
            Inventory.getFirst(C0005f.bm).interact(llIlIllII[llIlIllIl[14]]);
            Time.sleepTicks(llIlIllIl[14]);
            "".length();
        }
        if (lIllIlIllIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lIllIlIllIlI(Equipment.contains(C0005f.aV) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aV).interact(llIlIllII[llIlIllIl[15]]);
            Time.sleepTicks(llIlIllIl[14]);
            "".length();
        }
        if (!lIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(z), llIlIllIl[11]) || lIllIlIllIIl(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks(llIlIllIl[14]);
            "".length();
            "".length();
            if ((-(11 ^ 15)) >= 0) {
            }
        } else if (!lIllIlIllIll(Players.getLocal().getWorldLocation().distanceTo(H), llIlIllIl[16]) || !lIllIlIllIlI(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIllIlIllIIl(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks(llIlIllIl[14]);
            "".length();
            "".length();
            if (" ".length() == (-" ".length())) {
            }
        } else if (lIllIlIllIIl(G.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks(llIlIllIl[14]);
            "".length();
            "".length();
            if ((-" ".length()) >= "   ".length()) {
            }
        } else if (lIllIlIllIIl(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(C0001b.K);
            "".length();
            Time.sleepTicks(llIlIllIl[14]);
            "".length();
            "".length();
            if ((true ^ true) ^ (true ^ true)) {
            }
        } else {
            WorldArea worldArea2 = new WorldArea(llIlIllIl[17], llIlIllIl[18], llIlIllIl[13], llIlIllIl[19], llIlIllIl[2]);
            WorldArea worldArea3 = new WorldArea(llIlIllIl[20], llIlIllIl[21], llIlIllIl[22], llIlIllIl[23], llIlIllIl[2]);
            if ((!lIllIlIllIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIllIlIllIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIllIlIllIIl(Inventory.contains(item3 -> {
                return item3.getName().contains(llIlIllII[llIlIllIl[37]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().contains(llIlIllII[llIlIllIl[36]]);
                }).interact(llIlIllII[llIlIllIl[24]]);
                Time.sleepTicks(llIlIllIl[24]);
                "".length();
            }
            if (lIllIlIllIIl(new WorldArea(llIlIllIl[25], llIlIllIl[26], llIlIllIl[27], llIlIllIl[13], llIlIllIl[2]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[llIlIllIl[1]];
                strArr2[llIlIllIl[2]] = llIlIllII[llIlIllIl[19]];
                TileObject nearest = TileObjects.getNearest(strArr2);
                if (lIllIlIlllII(nearest)) {
                    nearest.interact(llIlIllII[llIlIllIl[13]]);
                    Time.sleepTicks(llIlIllIl[24]);
                    "".length();
                }
            }
            Movement.walkTo(bankLocation);
            "".length();
            Time.sleepTicks(llIlIllIl[14]);
            "".length();
        }
    }

    private static boolean lIllIlIllIlI(int i) {
        return i == 0;
    }

    private static String lIllIlIlIIll(String lIIIlllIIIIlII, String lIIIlllIIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlllIIIIIll.getBytes(StandardCharsets.UTF_8)), llIlIllIl[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIllIl[14], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlllIIIIlIl) {
            lIIIlllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIlII(String lIIIllIlllIlll, String lIIIllIlllIllI) {
        try {
            SecretKeySpec lIIIllIllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIllIllllIIl = Cipher.getInstance("Blowfish");
            lIIIllIllllIIl.init(llIlIllIl[14], lIIIllIllllIlI);
            return new String(lIIIllIllllIIl.doFinal(Base64.getDecoder().decode(lIIIllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllIllllIII) {
            lIIIllIllllIII.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlIlll() {
        llIlIllIl = new int[74];
        llIlIllIl[0] = (-30051) & 32226;
        llIlIllIl[1] = " ".length();
        llIlIllIl[2] = ((((96 + 11) - (-47)) + 97) ^ (((61 + 108) - (-20)) + 2)) & (((((50 + 56) - (-13)) + 109) ^ (((13 + 19) - (-91)) + 37)) ^ (-" ".length()));
        llIlIllIl[3] = (-((-11525) & 32111)) & (-514) & 23551;
        llIlIllIl[4] = (-((-33) & 11943)) & (-16385) & 32767;
        llIlIllIl[5] = (-24577) & 27528;
        llIlIllIl[6] = (-8547) & 14319;
        llIlIllIl[7] = (-17411) & 20350;
        llIlIllIl[8] = (-10251) & 16010;
        llIlIllIl[9] = 124 ^ 103;
        llIlIllIl[10] = 138 ^ 150;
        llIlIllIl[11] = 157 ^ 137;
        llIlIllIl[12] = -" ".length();
        llIlIllIl[13] = (100 ^ 107) ^ (15 ^ 6);
        llIlIllIl[14] = "  ".length();
        llIlIllIl[15] = "   ".length();
        llIlIllIl[16] = 165 ^ 141;
        llIlIllIl[17] = (-((-3107) & 32235)) & (-1) & 31736;
        llIlIllIl[18] = (-21032) & 24423;
        llIlIllIl[19] = (144 ^ 184) ^ (18 ^ 63);
        llIlIllIl[20] = (-20652) & 23215;
        llIlIllIl[21] = (-20484) & 23343;
        llIlIllIl[22] = 0 ^ 11;
        llIlIllIl[23] = (((146 + 23) - 123) + 104) ^ (((55 + 56) - (-39)) + 6);
        llIlIllIl[24] = 98 ^ 102;
        llIlIllIl[25] = (-28801) & 31951;
        llIlIllIl[26] = (-20493) & 24413;
        llIlIllIl[27] = (26 ^ 6) ^ (1 ^ 26);
        llIlIllIl[28] = (102 ^ 83) ^ (45 ^ 6);
        llIlIllIl[29] = (79 ^ 52) ^ (92 ^ 47);
        llIlIllIl[30] = (-((-9225) & 29727)) & (-8265) & 32766;
        llIlIllIl[31] = (120 ^ 105) ^ (77 ^ 85);
        llIlIllIl[32] = (11 ^ 44) ^ (12 ^ 39);
        llIlIllIl[33] = 105 ^ 100;
        llIlIllIl[34] = 39 ^ 41;
        llIlIllIl[35] = 70 ^ 73;
        llIlIllIl[36] = (91 ^ 15) ^ (52 ^ 112);
        llIlIllIl[37] = 174 ^ 191;
        llIlIllIl[38] = (135 ^ 183) ^ (90 ^ 120);
        llIlIllIl[39] = 169 ^ 186;
        llIlIllIl[40] = (-4521) & 7663;
        llIlIllIl[41] = (-4129) & 7601;
        llIlIllIl[42] = (56 ^ 66) ^ (52 ^ 103);
        llIlIllIl[43] = (233 ^ 153) ^ (11 ^ 92);
        llIlIllIl[44] = (-((-646) & 17399)) & (-521) & 20477;
        llIlIllIl[45] = (-((-129) & 20675)) & (-8705) & 32615;
        llIlIllIl[46] = (-((-12883) & 30455)) & (-12289) & 32767;
        llIlIllIl[47] = (-((-24731) & 29663)) & (-16433) & 24574;
        llIlIllIl[48] = 240 ^ 153;
        llIlIllIl[49] = (-((-24162) & 32613)) & (-4737) & 16383;
        llIlIllIl[50] = (-4617) & 7982;
        llIlIllIl[51] = 17 ^ 50;
        llIlIllIl[52] = (253 ^ 188) ^ (229 ^ 158);
        llIlIllIl[53] = (-16961) & 20085;
        llIlIllIl[54] = (-81) & 3699;
        llIlIllIl[55] = (-226) & 3839;
        llIlIllIl[56] = (-20513) & 23930;
        llIlIllIl[57] = 45 ^ 113;
        llIlIllIl[58] = (((51 + 29) - 30) + 124) ^ (((35 + 93) - 126) + 137);
        llIlIllIl[59] = (-9093) & 12222;
        llIlIllIl[60] = (-((-28449) & 32551)) & (-25097) & 32639;
        llIlIllIl[61] = (((107 + 16) - 77) + 92) ^ (((77 + 102) - 173) + 181);
        llIlIllIl[62] = (31 ^ 25) ^ (195 ^ 129);
        llIlIllIl[63] = (-26882) & 28511;
        llIlIllIl[64] = (-28681) & 32616;
        llIlIllIl[65] = (-8977) & 12285;
        llIlIllIl[66] = 142 ^ 163;
        llIlIllIl[67] = 57 ^ 29;
        llIlIllIl[68] = (-((-1045) & 25685)) & (-4129) & 31743;
        llIlIllIl[69] = (-((-1177) & 30170)) & (-513) & 32747;
        llIlIllIl[70] = (-14658) & 16379;
        llIlIllIl[71] = (-((-10953) & 31455)) & (-8737) & 32703;
        llIlIllIl[72] = (-((-2956) & 24479)) & (-1) & 24567;
        llIlIllIl[73] = (-((-17107) & 28371)) & (-3) & 16239;
    }

    static {
        lIllIlIlIlll();
        lIllIlIlIllI();
        y = new WorldArea(llIlIllIl[40], llIlIllIl[41], llIlIllIl[42], llIlIllIl[43], llIlIllIl[2]);
        z = new WorldPoint(llIlIllIl[44], llIlIllIl[45], llIlIllIl[2]);
        A = new WorldArea(llIlIllIl[46], llIlIllIl[47], llIlIllIl[48], llIlIllIl[48], llIlIllIl[2]);
        B = new WorldArea(llIlIllIl[49], llIlIllIl[50], llIlIllIl[51], llIlIllIl[52], llIlIllIl[2]);
        C = new WorldArea(llIlIllIl[53], llIlIllIl[54], llIlIllIl[38], llIlIllIl[11], llIlIllIl[2]);
        D = new WorldArea(llIlIllIl[55], llIlIllIl[56], llIlIllIl[57], llIlIllIl[58], llIlIllIl[2]);
        E = new WorldArea(llIlIllIl[59], llIlIllIl[60], llIlIllIl[61], llIlIllIl[62], llIlIllIl[2]);
        F = new WorldArea(llIlIllIl[63], llIlIllIl[64], llIlIllIl[35], llIlIllIl[36], llIlIllIl[2]);
        G = new WorldArea(llIlIllIl[7], llIlIllIl[65], llIlIllIl[66], llIlIllIl[67], llIlIllIl[2]);
        H = new WorldPoint(llIlIllIl[68], llIlIllIl[69], llIlIllIl[2]);
        I = new WorldPoint(llIlIllIl[70], llIlIllIl[71], llIlIllIl[2]);
        J = new WorldPoint(llIlIllIl[72], llIlIllIl[73], llIlIllIl[1]);
    }

    public static void b(int i, int i2) {
        Bank.withdraw(i, i2, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(llIlIllIl[1]);
        "".length();
    }
}
