package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/a.class */
public class C0000a {
    public static final /* synthetic */ WorldArea D;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldArea E;
    public static final /* synthetic */ WorldArea A;
    static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea z;
    public static final /* synthetic */ WorldArea w;
    public static final /* synthetic */ WorldPoint x;
    private static /* synthetic */ String[] lIIIlllllllll;
    public static /* synthetic */ WorldPoint F;
    private static /* synthetic */ int[] lIIlIIIIIIIII;
    public static /* synthetic */ WorldPoint G;
    public static final /* synthetic */ WorldArea B;
    public static final /* synthetic */ WorldArea y;

    private static void lIlIIllIllIlIll() {
        lIIIlllllllll = new String[lIIlIIIIIIIII[11]];
        lIIIlllllllll[lIIlIIIIIIIII[2]] = lIlIIllIllIlIII("HCA9", "EENwP");
        lIIIlllllllll[lIIlIIIIIIIII[1]] = lIlIIllIllIlIIl("AGGkCABzfqo=", "zLclA");
        lIIIlllllllll[lIIlIIIIIIIII[14]] = lIlIIllIllIlIII("LTIkMw==", "zWEAC");
        lIIIlllllllll[lIIlIIIIIIIII[15]] = lIlIIllIllIlIIl("AhybV75qz/8=", "gatPD");
        lIIIlllllllll[lIIlIIIIIIIII[24]] = lIlIIllIllIlIlI("EE7Q+BAYq3M=", "bScOU");
        lIIIlllllllll[lIIlIIIIIIIII[19]] = lIlIIllIllIlIlI("NzBBx+FQlYc=", "xdtGG");
        lIIIlllllllll[lIIlIIIIIIIII[13]] = lIlIIllIllIlIIl("iu0q/9Y8ZyY=", "cGWpM");
        lIIIlllllllll[lIIlIIIIIIIII[27]] = lIlIIllIllIlIII("BhcUBQ4vHlE1Ci0fFR4MNw==", "Czqwo");
        lIIIlllllllll[lIIlIIIIIIIII[29]] = lIlIIllIllIlIIl("NyROq7PwQN4=", "qHdfe");
        lIIIlllllllll[lIIlIIIIIIIII[31]] = lIlIIllIllIlIIl("y+s9RHL3+OB5ojMmeoQEKQ==", "PsJtt");
        lIIIlllllllll[lIIlIIIIIIIII[23]] = lIlIIllIllIlIII("FjQq", "CGOlI");
        lIIIlllllllll[lIIlIIIIIIIII[22]] = lIlIIllIllIlIIl("90oyoC9zdz8=", "Xhapf");
        lIIIlllllllll[lIIlIIIIIIIII[32]] = lIlIIllIllIlIlI("UVsMyeuYCHk=", "siGpr");
        lIIIlllllllll[lIIlIIIIIIIII[33]] = lIlIIllIllIlIII("Bi0LAw==", "DLehf");
        lIIIlllllllll[lIIlIIIIIIIII[34]] = lIlIIllIllIlIII("DBMlD2csHSQQLw==", "NrKdG");
        lIIIlllllllll[lIIlIIIIIIIII[35]] = lIlIIllIllIlIII("DRIWHw==", "OsxtJ");
        lIIIlllllllll[lIIlIIIIIIIII[36]] = lIlIIllIllIlIII("DQkONBMWHhY=", "ylbQc");
        lIIIlllllllll[lIIlIIIIIIIII[37]] = lIlIIllIllIlIIl("A6gWeXEbsTRHR/+JqqeFyA==", "kXjww");
        lIIIlllllllll[lIIlIIIIIIIII[38]] = lIlIIllIllIlIII("MRUFATgqAh0=", "EpidH");
        lIIIlllllllll[lIIlIIIIIIIII[39]] = lIlIIllIllIlIlI("SZr61qGCf2e8GImo4MMuVQ==", "jwkII");
    }

    public static void a(BankLocation bankLocation) {
        if (lIlIIllIllIllIl(Vars.getBit(lIIlIIIIIIIII[0]), lIIlIIIIIIIII[1]) && lIlIIllIllIlllI(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[lIIlIIIIIIIII[1]];
            strArr[lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[2]];
            C0006g.a(strArr);
        }
        WorldPoint worldPoint = new WorldPoint(lIIlIIIIIIIII[3], lIIlIIIIIIIII[4], lIIlIIIIIIIII[2]);
        WorldPoint worldPoint2 = new WorldPoint(lIIlIIIIIIIII[5], lIIlIIIIIIIII[6], lIIlIIIIIIIII[2]);
        WorldArea worldArea = new WorldArea(lIIlIIIIIIIII[7], lIIlIIIIIIIII[8], lIIlIIIIIIIII[9], lIIlIIIIIIIII[10], lIIlIIIIIIIII[2]);
        if ((!lIlIIllIllIllll(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lIlIIllIlllIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIlIIIIIIIII[11]) || lIlIIllIllIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlIIllIllIlllI(Inventory.contains(item -> {
            return item.getName().contains(lIIIlllllllll[lIIlIIIIIIIII[39]]);
        }) ? 1 : 0) && lIlIIllIllIllIl(Players.getLocal().getAnimation(), lIIlIIIIIIIII[12])) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(lIIIlllllllll[lIIlIIIIIIIII[38]]);
            }).interact(lIIIlllllllll[lIIlIIIIIIIII[1]]);
            Time.sleepTicks(lIIlIIIIIIIII[13]);
            "".length();
        }
        if (lIlIIllIllIlllI(Inventory.contains(C0005f.bk) ? 1 : 0) && lIlIIllIllIllll(Equipment.contains(C0005f.bk) ? 1 : 0)) {
            Inventory.getFirst(C0005f.bk).interact(lIIIlllllllll[lIIlIIIIIIIII[14]]);
            Time.sleepTicks(lIIlIIIIIIIII[14]);
            "".length();
        }
        if (lIlIIllIllIlllI(Inventory.contains(C0005f.aT) ? 1 : 0) && lIlIIllIllIllll(Equipment.contains(C0005f.aT) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aT).interact(lIIIlllllllll[lIIlIIIIIIIII[15]]);
            Time.sleepTicks(lIIlIIIIIIIII[14]);
            "".length();
        }
        if (!lIlIIllIlllIIII(Players.getLocal().getWorldLocation().distanceTo(x), lIIlIIIIIIIII[11]) || lIlIIllIllIlllI(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks(lIIlIIIIIIIII[14]);
            "".length();
            "".length();
            if (0 != 0) {
            }
        } else if (!lIlIIllIlllIIII(Players.getLocal().getWorldLocation().distanceTo(F), lIIlIIIIIIIII[16]) || !lIlIIllIllIllll(y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lIlIIllIllIllll(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllIlllIIIl(Players.getLocal().getWorldLocation().distanceTo(K.hT), lIIlIIIIIIIII[16])) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks(lIIlIIIIIIIII[14]);
            "".length();
            "".length();
            if ((70 ^ 67) <= 0) {
            }
        } else if (lIlIIllIllIlllI(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks(lIIlIIIIIIIII[14]);
            "".length();
            "".length();
            if (((((44 + 26) - (-107)) + 5) ^ (((41 + 29) - (-31)) + 77)) < ((((116 + 141) - 139) + 26) ^ (((111 + 125) - 94) + 6))) {
            }
        } else if (lIlIIllIllIlllI(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(C0001b.I);
            "".length();
            Time.sleepTicks(lIIlIIIIIIIII[14]);
            "".length();
            "".length();
            if (true ^ true) {
            }
        } else {
            WorldArea worldArea2 = new WorldArea(lIIlIIIIIIIII[17], lIIlIIIIIIIII[18], lIIlIIIIIIIII[13], lIIlIIIIIIIII[19], lIIlIIIIIIIII[2]);
            WorldArea worldArea3 = new WorldArea(lIIlIIIIIIIII[20], lIIlIIIIIIIII[21], lIIlIIIIIIIII[22], lIIlIIIIIIIII[23], lIIlIIIIIIIII[2]);
            if ((!lIlIIllIllIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllIllIlllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIlIIllIllIlllI(Inventory.contains(item3 -> {
                return item3.getName().contains(lIIIlllllllll[lIIlIIIIIIIII[37]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().contains(lIIIlllllllll[lIIlIIIIIIIII[36]]);
                }).interact(lIIIlllllllll[lIIlIIIIIIIII[24]]);
                Time.sleepTicks(lIIlIIIIIIIII[24]);
                "".length();
            }
            if (lIlIIllIllIlllI(new WorldArea(lIIlIIIIIIIII[25], lIIlIIIIIIIII[26], lIIlIIIIIIIII[27], lIIlIIIIIIIII[13], lIIlIIIIIIIII[2]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[lIIlIIIIIIIII[1]];
                strArr2[lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[19]];
                TileObject nearest = TileObjects.getNearest(strArr2);
                if (lIlIIllIlllIIlI(nearest)) {
                    nearest.interact(lIIIlllllllll[lIIlIIIIIIIII[13]]);
                    Time.sleepTicks(lIIlIIIIIIIII[24]);
                    "".length();
                }
            }
            Movement.walkTo(bankLocation);
            "".length();
            Time.sleepTicks(lIIlIIIIIIIII[14]);
            "".length();
        }
    }

    private static boolean lIlIIllIlllIIII(int i2, int i3) {
        return i2 > i3;
    }

    public static void a() {
        if (lIlIIllIlllIIIl(Players.getLocal().getWorldLocation().distanceTo(H), lIIlIIIIIIIII[28])) {
            String[] strArr = new String[lIIlIIIIIIIII[1]];
            strArr[lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[27]];
            NPCs.getNearest(strArr).interact(lIIIlllllllll[lIIlIIIIIIIII[29]]);
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIIlIIIIIIIII[30]);
            "".length();
        }
        if (!lIlIIllIllIllll(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlIIllIllIlllI(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks(lIIlIIIIIIIII[15]);
            "".length();
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIIlIIIIIIIII[30]);
            "".length();
            "".length();
            if ((54 ^ 50) == (-" ".length())) {
            }
        } else if (lIlIIllIllIllll(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIllIllll(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIllIllll(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIllIllll(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIllIllll(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlIIllIlllIIIl(Players.getLocal().getWorldLocation().distanceTo(G), lIIlIIIIIIIII[11])) {
            if (lIlIIllIllIllll(w.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIllIlllIIII(Players.getLocal().getWorldLocation().distanceTo(H), lIIlIIIIIIIII[28])) {
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                String[] strArr2 = new String[lIIlIIIIIIIII[1]];
                strArr2[lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[34]];
                TileObject nearest = TileObjects.getNearest(worldLocation, strArr2);
                if (lIlIIllIlllIIlI(nearest)) {
                    nearest.interact(lIIIlllllllll[lIIlIIIIIIIII[35]]);
                    Time.sleepTicks(lIIlIIIIIIIII[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIlIIIIIIIII[30]);
                    "".length();
                }
            }
        } else {
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            String[] strArr3 = new String[lIIlIIIIIIIII[1]];
            strArr3[lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[31]];
            TileObject nearest2 = TileObjects.getNearest(worldLocation2, strArr3);
            if (lIlIIllIlllIIlI(nearest2)) {
                String[] strArr4 = new String[lIIlIIIIIIIII[1]];
                strArr4[lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[23]];
                if (lIlIIllIllIlllI(nearest2.hasAction(strArr4) ? 1 : 0)) {
                    nearest2.interact(lIIIlllllllll[lIIlIIIIIIIII[22]]);
                    Time.sleepTicks(lIIlIIIIIIIII[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIlIIIIIIIII[30]);
                    "".length();
                }
                String[] strArr5 = new String[lIIlIIIIIIIII[1]];
                strArr5[lIIlIIIIIIIII[2]] = lIIIlllllllll[lIIlIIIIIIIII[32]];
                if (lIlIIllIllIlllI(nearest2.hasAction(strArr5) ? 1 : 0)) {
                    nearest2.interact(lIIIlllllllll[lIIlIIIIIIIII[33]]);
                    Time.sleepTicks(lIIlIIIIIIIII[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIlIIIIIIIII[30]);
                    "".length();
                }
            }
            "".length();
            if ((-"  ".length()) >= 0) {
            }
        }
    }

    public static void a(int[] iArr) {
        int i2 = lIIlIIIIIIIII[2];
        while (lIlIIllIlllIIll(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], lIIlIIIIIIIII[1], Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIlIIIIIIIII[1]);
            "".length();
            i2++;
            "".length();
            if ("  ".length() < " ".length()) {
                return;
            }
        }
    }

    private static boolean lIlIIllIllIllll(int i2) {
        return i2 == 0;
    }

    static {
        lIlIIllIllIllII();
        lIlIIllIllIlIll();
        w = new WorldArea(lIIlIIIIIIIII[40], lIIlIIIIIIIII[41], lIIlIIIIIIIII[42], lIIlIIIIIIIII[43], lIIlIIIIIIIII[2]);
        x = new WorldPoint(lIIlIIIIIIIII[44], lIIlIIIIIIIII[45], lIIlIIIIIIIII[2]);
        y = new WorldArea(lIIlIIIIIIIII[46], lIIlIIIIIIIII[47], lIIlIIIIIIIII[48], lIIlIIIIIIIII[48], lIIlIIIIIIIII[2]);
        z = new WorldArea(lIIlIIIIIIIII[49], lIIlIIIIIIIII[50], lIIlIIIIIIIII[51], lIIlIIIIIIIII[52], lIIlIIIIIIIII[2]);
        A = new WorldArea(lIIlIIIIIIIII[53], lIIlIIIIIIIII[54], lIIlIIIIIIIII[38], lIIlIIIIIIIII[11], lIIlIIIIIIIII[2]);
        B = new WorldArea(lIIlIIIIIIIII[55], lIIlIIIIIIIII[56], lIIlIIIIIIIII[57], lIIlIIIIIIIII[58], lIIlIIIIIIIII[2]);
        C = new WorldArea(lIIlIIIIIIIII[59], lIIlIIIIIIIII[60], lIIlIIIIIIIII[61], lIIlIIIIIIIII[62], lIIlIIIIIIIII[2]);
        D = new WorldArea(lIIlIIIIIIIII[63], lIIlIIIIIIIII[64], lIIlIIIIIIIII[35], lIIlIIIIIIIII[36], lIIlIIIIIIIII[2]);
        E = new WorldArea(lIIlIIIIIIIII[7], lIIlIIIIIIIII[65], lIIlIIIIIIIII[66], lIIlIIIIIIIII[67], lIIlIIIIIIIII[2]);
        F = new WorldPoint(lIIlIIIIIIIII[68], lIIlIIIIIIIII[69], lIIlIIIIIIIII[2]);
        G = new WorldPoint(lIIlIIIIIIIII[70], lIIlIIIIIIIII[71], lIIlIIIIIIIII[2]);
        H = new WorldPoint(lIIlIIIIIIIII[72], lIIlIIIIIIIII[73], lIIlIIIIIIIII[1]);
    }

    private static boolean lIlIIllIllIlllI(int i2) {
        return i2 != 0;
    }

    public static void a(int i2, int i3) {
        int[] iArr = new int[lIIlIIIIIIIII[1]];
        iArr[lIIlIIIIIIIII[2]] = i2;
        if (lIlIIllIllIllll(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + i2 + " item id");
        }
        int[] iArr2 = new int[lIIlIIIIIIIII[1]];
        iArr2[lIIlIIIIIIIII[2]] = i2;
        if (lIlIIllIllIlllI(Bank.contains(iArr2) ? 1 : 0)) {
            Bank.withdraw(i2, i3, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIlIIIIIIIII[1]);
            "".length();
        }
    }

    public static void b(int[] iArr, int i2) {
        int i3 = lIIlIIIIIIIII[2];
        while (lIlIIllIlllIIll(i3, iArr.length)) {
            Bank.withdraw(iArr[i3], i2, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIlIIIIIIIII[1]);
            "".length();
            int[] iArr2 = new int[lIIlIIIIIIIII[1]];
            iArr2[lIIlIIIIIIIII[2]] = iArr[i3];
            if (lIlIIllIllIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
                return;
            }
            i3++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return;
            }
        }
    }

    private static String lIlIIllIllIlIIl(String llllllllllllllIlllllllllIlIlIIlI, String llllllllllllllIlllllllllIlIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIIIII[29]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIIIIIIIII[14], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllllIlIlIIll) {
            llllllllllllllIlllllllllIlIlIIll.printStackTrace();
            return null;
        }
    }

    private static String lIlIIllIllIlIII(String llllllllllllllIlllllllllIlllIlII, String llllllllllllllIlllllllllIlllIIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllllllllIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllllllllIlllIIll.toCharArray();
        int llllllllllllllIlllllllllIlllIIII = lIIlIIIIIIIII[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllllllllIllIlIII = lIIlIIIIIIIII[2];
        while (lIlIIllIlllIIll(llllllllllllllIlllllllllIllIlIII, length)) {
            char llllllllllllllIlllllllllIlllIlIl = charArray2[llllllllllllllIlllllllllIllIlIII];
            sb.append((char) (llllllllllllllIlllllllllIlllIlIl ^ charArray[llllllllllllllIlllllllllIlllIIII % charArray.length]));
            "".length();
            llllllllllllllIlllllllllIlllIIII++;
            llllllllllllllIlllllllllIllIlIII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIIllIllIlIlI(String llllllllllllllIlllllllllIlIlllll, String llllllllllllllIlllllllllIlIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllllIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllllllIllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllllllIllIIIIl.init(lIIlIIIIIIIII[14], secretKeySpec);
            return new String(llllllllllllllIlllllllllIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllllIllIIIII) {
            llllllllllllllIlllllllllIllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlllIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIllIllIllIl(int i2, int i3) {
        return i2 == i3;
    }

    public static void a(int[] iArr, int i2) {
        int i3 = lIIlIIIIIIIII[2];
        while (lIlIIllIlllIIll(i3, iArr.length)) {
            Bank.withdraw(iArr[i3], i2, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIlIIIIIIIII[1]);
            "".length();
            i3++;
            "".length();
            if (((((12 + 30) - (-64)) + 73) ^ (((135 + 171) - 199) + 76)) < 0) {
                return;
            }
        }
    }

    private static boolean lIlIIllIlllIIll(int i2, int i3) {
        return i2 < i3;
    }

    public static void b(int i2, int i3) {
        Bank.withdraw(i2, i3, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(lIIlIIIIIIIII[1]);
        "".length();
    }

    private static void lIlIIllIllIllII() {
        lIIlIIIIIIIII = new int[74];
        lIIlIIIIIIIII[0] = (-((-3220) & 32755)) & (-1) & 31711;
        lIIlIIIIIIIII[1] = " ".length();
        lIIlIIIIIIIII[2] = ((132 ^ 130) ^ (159 ^ 198)) & (((55 ^ 33) ^ (97 ^ 40)) ^ (-" ".length()));
        lIIlIIIIIIIII[3] = (-((-11649) & 28585)) & (-9282) & 28669;
        lIIlIIIIIIIII[4] = (-3589) & 8061;
        lIIlIIIIIIIII[5] = (-((-6789) & 16038)) & (-19) & 12219;
        lIIlIIIIIIIII[6] = (-((-4257) & 31219)) & (-33) & 32767;
        lIIlIIIIIIIII[7] = (-((-16902) & 26247)) & (-16387) & 28671;
        lIIlIIIIIIIII[8] = (-8302) & 14061;
        lIIlIIIIIIIII[9] = (((81 + 170) - 235) + 175) ^ (((89 + 63) - 121) + 133);
        lIIlIIIIIIIII[10] = (253 ^ 155) ^ (107 ^ 17);
        lIIlIIIIIIIII[11] = (((6 + 11) - (-167)) + 5) ^ (((112 + 20) - (-26)) + 11);
        lIIlIIIIIIIII[12] = -" ".length();
        lIIlIIIIIIIII[13] = (69 ^ 116) ^ (27 ^ 44);
        lIIlIIIIIIIII[14] = "  ".length();
        lIIlIIIIIIIII[15] = "   ".length();
        lIIlIIIIIIIII[16] = (((45 + 166) - 207) + 183) ^ (((117 + 65) - 127) + 92);
        lIIlIIIIIIIII[17] = (-((-18513) & 32095)) & (-16385) & 32574;
        lIIlIIIIIIIII[18] = (-24741) & 28132;
        lIIlIIIIIIIII[19] = (42 ^ 65) ^ (6 ^ 104);
        lIIlIIIIIIIII[20] = (-((-20997) & 22031)) & (-28754) & 32351;
        lIIlIIIIIIIII[21] = (-29891) & 32750;
        lIIlIIIIIIIII[22] = (((156 + 18) - 84) + 90) ^ (((70 + 42) - 79) + 158);
        lIIlIIIIIIIII[23] = (223 ^ 178) ^ (253 ^ 154);
        lIIlIIIIIIIII[24] = 89 ^ 93;
        lIIlIIIIIIIII[25] = (-12593) & 15743;
        lIIlIIIIIIIII[26] = (-12453) & 16373;
        lIIlIIIIIIIII[27] = 144 ^ 151;
        lIIlIIIIIIIII[28] = (((135 + 103) - 126) + 75) ^ (((85 + 5) - (-30)) + 45);
        lIIlIIIIIIIII[29] = 108 ^ 100;
        lIIlIIIIIIIII[30] = (-((-805) & 4918)) & (-8271) & 16383;
        lIIlIIIIIIIII[31] = (((27 + 45) - 45) + 136) ^ (((47 + 90) - 24) + 57);
        lIIlIIIIIIIII[32] = (((69 + 19) - (-70)) + 23) ^ (((112 + 117) - 122) + 78);
        lIIlIIIIIIIII[33] = (((57 + 131) - 111) + 112) ^ (((160 + 106) - 239) + 149);
        lIIlIIIIIIIII[34] = 84 ^ 90;
        lIIlIIIIIIIII[35] = 108 ^ 99;
        lIIlIIIIIIIII[36] = (42 ^ 72) ^ (220 ^ 174);
        lIIlIIIIIIIII[37] = 134 ^ 151;
        lIIlIIIIIIIII[38] = (130 ^ 153) ^ (134 ^ 143);
        lIIlIIIIIIIII[39] = 144 ^ 131;
        lIIlIIIIIIIII[40] = (-((-9217) & 9913)) & (-4353) & 8191;
        lIIlIIIIIIIII[41] = (-8803) & 12275;
        lIIlIIIIIIIII[42] = (((31 + 85) - 93) + 163) ^ (((84 + 33) - 74) + 104);
        lIIlIIIIIIIII[43] = 169 ^ 142;
        lIIlIIIIIIIII[44] = (-25180) & 28383;
        lIIlIIIIIIIII[45] = (-12297) & 15661;
        lIIlIIIIIIIII[46] = (-9253) & 12159;
        lIIlIIIIIIIII[47] = (-8257) & 11466;
        lIIlIIIIIIIII[48] = (194 ^ 147) ^ (98 ^ 90);
        lIIlIIIIIIIII[49] = (-((-2073) & 23195)) & (-2) & 24319;
        lIIlIIIIIIIII[50] = (-((-883) & 29555)) & (-714) & 32751;
        lIIlIIIIIIIII[51] = 48 ^ 19;
        lIIlIIIIIIIII[52] = (((37 + 9) - 35) + 124) ^ (((105 + 139) - 119) + 64);
        lIIlIIIIIIIII[53] = (-((-6573) & 31725)) & (-137) & 28413;
        lIIlIIIIIIIII[54] = (-((-2053) & 23005)) & (-1) & 24571;
        lIIlIIIIIIIII[55] = (-4513) & 8126;
        lIIlIIIIIIIII[56] = (-((-16457) & 29421)) & (-16386) & 32767;
        lIIlIIIIIIIII[57] = 47 ^ 115;
        lIIlIIIIIIIII[58] = (((142 + 4) - 50) + 81) ^ (((86 + 22) - 16) + 56);
        lIIlIIIIIIIII[59] = (-25090) & 28219;
        lIIlIIIIIIIII[60] = (-((-22323) & 30647)) & (-16385) & 28149;
        lIIlIIIIIIIII[61] = (46 ^ 36) ^ (139 ^ 176);
        lIIlIIIIIIIII[62] = 103 ^ 35;
        lIIlIIIIIIIII[63] = (-4386) & 6015;
        lIIlIIIIIIIII[64] = (-((-3425) & 32236)) & (-5) & 32751;
        lIIlIIIIIIIII[65] = (-((-7343) & 24511)) & (-12289) & 32765;
        lIIlIIIIIIIII[66] = (123 ^ 124) ^ (4 ^ 46);
        lIIlIIIIIIIII[67] = (((13 + 12) - (-100)) + 54) ^ (((52 + 111) - 88) + 76);
        lIIlIIIIIIIII[68] = (-16417) & 19391;
        lIIlIIIIIIIII[69] = (-12293) & 15534;
        lIIlIIIIIIIII[70] = (-((-6275) & 30919)) & (-4354) & 30719;
        lIIlIIIIIIIII[71] = (-((-7577) & 32765)) & (-4099) & 32751;
        lIIlIIIIIIIII[72] = (-((-19095) & 28319)) & (-19) & 12286;
        lIIlIIIIIIIII[73] = (-25601) & 30573;
    }

    private static boolean lIlIIllIlllIIIl(int i2, int i3) {
        return i2 <= i3;
    }
}
