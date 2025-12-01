package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/a.class */
public class C0000a {
    public static /* synthetic */ WorldPoint H;
    public static final /* synthetic */ WorldArea D;
    public static /* synthetic */ WorldPoint G;
    private static /* synthetic */ int[] lIIIlIIllI;
    public static final /* synthetic */ WorldArea E;
    private static /* synthetic */ String[] lIIIlIIlIl;
    public static final /* synthetic */ WorldArea C;
    public static final /* synthetic */ WorldPoint y;
    public static final /* synthetic */ WorldArea B;
    public static final /* synthetic */ WorldArea z;
    static /* synthetic */ WorldPoint I;
    public static final /* synthetic */ WorldArea x;
    public static final /* synthetic */ WorldArea A;
    public static final /* synthetic */ WorldArea F;

    private static boolean lllIlIIllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lllIlIIlIlll(int i) {
        return i != 0;
    }

    public static void a(BankLocation bankLocation) {
        if (lllIlIIlIllI(Vars.getBit(lIIIlIIllI[0]), lIIIlIIllI[1]) && lllIlIIlIlll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[lIIIlIIllI[1]];
            strArr[lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[2]];
            C0006g.a(strArr);
        }
        WorldPoint worldPoint = new WorldPoint(lIIIlIIllI[3], lIIIlIIllI[4], lIIIlIIllI[2]);
        WorldPoint worldPoint2 = new WorldPoint(lIIIlIIllI[5], lIIIlIIllI[6], lIIIlIIllI[2]);
        WorldArea worldArea = new WorldArea(lIIIlIIllI[7], lIIIlIIllI[8], lIIIlIIllI[9], lIIIlIIllI[10], lIIIlIIllI[2]);
        if ((!lllIlIIllIII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIIlIIllI[11]) || lllIlIIlIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lllIlIIlIlll(Inventory.contains(item -> {
            return item.getName().contains(lIIIlIIlIl[lIIIlIIllI[39]]);
        }) ? 1 : 0) && lllIlIIlIllI(Players.getLocal().getAnimation(), lIIIlIIllI[12])) {
            Inventory.getFirst(item2 -> {
                return item2.getName().contains(lIIIlIIlIl[lIIIlIIllI[38]]);
            }).interact(lIIIlIIlIl[lIIIlIIllI[1]]);
            Time.sleepTicks(lIIIlIIllI[13]);
            "".length();
        }
        if (lllIlIIlIlll(Inventory.contains(C0005f.bf) ? 1 : 0) && lllIlIIllIII(Equipment.contains(C0005f.bf) ? 1 : 0)) {
            Inventory.getFirst(C0005f.bf).interact(lIIIlIIlIl[lIIIlIIllI[14]]);
            Time.sleepTicks(lIIIlIIllI[14]);
            "".length();
        }
        if (lllIlIIlIlll(Inventory.contains(C0005f.aO) ? 1 : 0) && lllIlIIllIII(Equipment.contains(C0005f.aO) ? 1 : 0)) {
            Inventory.getFirst(C0005f.aO).interact(lIIIlIIlIl[lIIIlIIllI[15]]);
            Time.sleepTicks(lIIIlIIllI[14]);
            "".length();
        }
        if (!lllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(y), lIIIlIIllI[11]) || lllIlIIlIlll(A.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            "".length();
            Time.sleepTicks(lIIIlIIllI[14]);
            "".length();
            "".length();
            if ("  ".length() < (((((66 + 63) - 91) + 112) ^ (((103 + 102) - 113) + 106)) & (((((82 + 87) - 60) + 88) ^ (((41 + 38) - (-70)) + 0)) ^ (-" ".length())))) {
            }
        } else if (!lllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(G), lIIIlIIllI[16]) || !lllIlIIllIII(z.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIlIIlIlll(C.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            "".length();
            Time.sleepTicks(lIIIlIIllI[14]);
            "".length();
            "".length();
            if (((8 ^ 7) & ((96 ^ 111) ^ (-1))) >= " ".length()) {
            }
        } else if (lllIlIIlIlll(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            "".length();
            Time.sleepTicks(lIIIlIIllI[14]);
            "".length();
            "".length();
            if (((((163 + 3) - 22) + 44) ^ (((171 + 142) - 285) + 156)) < " ".length()) {
            }
        } else if (lllIlIIlIlll(D.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(C0001b.J);
            "".length();
            Time.sleepTicks(lIIIlIIllI[14]);
            "".length();
            "".length();
            if (0 != 0) {
            }
        } else {
            WorldArea worldArea2 = new WorldArea(lIIIlIIllI[17], lIIIlIIllI[18], lIIIlIIllI[13], lIIIlIIllI[19], lIIIlIIllI[2]);
            WorldArea worldArea3 = new WorldArea(lIIIlIIllI[20], lIIIlIIllI[21], lIIIlIIllI[22], lIIIlIIllI[23], lIIIlIIllI[2]);
            if ((!lllIlIIllIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIlIIlIlll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lllIlIIlIlll(Inventory.contains(item3 -> {
                return item3.getName().contains(lIIIlIIlIl[lIIIlIIllI[37]]);
            }) ? 1 : 0)) {
                Inventory.getFirst(item4 -> {
                    return item4.getName().contains(lIIIlIIlIl[lIIIlIIllI[36]]);
                }).interact(lIIIlIIlIl[lIIIlIIllI[24]]);
                Time.sleepTicks(lIIIlIIllI[24]);
                "".length();
            }
            if (lllIlIIlIlll(new WorldArea(lIIIlIIllI[25], lIIIlIIllI[26], lIIIlIIllI[27], lIIIlIIllI[13], lIIIlIIllI[2]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr2 = new String[lIIIlIIllI[1]];
                strArr2[lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[19]];
                TileObject nearest = TileObjects.getNearest(strArr2);
                if (lllIlIIllIlI(nearest)) {
                    nearest.interact(lIIIlIIlIl[lIIIlIIllI[13]]);
                    Time.sleepTicks(lIIIlIIllI[24]);
                    "".length();
                }
            }
            Movement.walkTo(bankLocation);
            "".length();
            Time.sleepTicks(lIIIlIIllI[14]);
            "".length();
        }
    }

    public static void a(int[] iArr, int i) {
        int i2 = lIIIlIIllI[2];
        while (lllIlIIlllII(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIIlIIllI[1]);
            "".length();
            i2++;
            "".length();
            if ((-((53 ^ 77) ^ (15 ^ 114))) >= 0) {
                return;
            }
        }
    }

    private static String lllIlIIlIIll(String lIlIlllIIlII, String lIlIlllIIIll) {
        try {
            SecretKeySpec lIlIlllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIIllI[29]), "DES");
            Cipher lIlIlllIIllI = Cipher.getInstance("DES");
            lIlIlllIIllI.init(lIIIlIIllI[14], lIlIlllIIlll);
            return new String(lIlIlllIIllI.doFinal(Base64.getDecoder().decode(lIlIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllIIlIl) {
            lIlIlllIIlIl.printStackTrace();
            return null;
        }
    }

    public static void a(int[] iArr) {
        int i = lIIIlIIllI[2];
        while (lllIlIIlllII(i, iArr.length)) {
            Bank.withdraw(iArr[i], lIIIlIIllI[1], Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIIlIIllI[1]);
            "".length();
            i++;
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(int[] iArr, int i) {
        int i2 = lIIIlIIllI[2];
        while (lllIlIIlllII(i2, iArr.length)) {
            Bank.withdraw(iArr[i2], i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIIlIIllI[1]);
            "".length();
            int[] iArr2 = new int[lIIIlIIllI[1]];
            iArr2[lIIIlIIllI[2]] = iArr[i2];
            if (lllIlIIlIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                "".length();
                if ((77 ^ 73) <= ((207 ^ 155) & ((194 ^ 150) ^ (-1)))) {
                    return;
                }
                return;
            }
            i2++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    private static void lllIlIIlIlII() {
        lIIIlIIlIl = new String[lIIIlIIllI[11]];
        lIIIlIIlIl[lIIIlIIllI[2]] = lllIlIIlIIII("bgNeaE+7vXU=", "MxVbo");
        lIIIlIIlIl[lIIIlIIllI[1]] = lllIlIIlIIlI("IzcRIgI=", "aEtCi");
        lIIIlIIlIl[lIIIlIIllI[14]] = lllIlIIlIIII("ZHjEV0ybPdI=", "loXUG");
        lIIIlIIlIl[lIIIlIIllI[15]] = lllIlIIlIIlI("HjUJKA==", "IPhZw");
        lIIIlIIlIl[lIIIlIIllI[24]] = lllIlIIlIIlI("DCsAOT4=", "NYeXU");
        lIIIlIIlIl[lIIIlIIllI[19]] = lllIlIIlIIll("3mD7UbZe0V0=", "EKwVk");
        lIIIlIIlIl[lIIIlIIllI[13]] = lllIlIIlIIll("i2spbhkLrL0=", "HVVcN");
        lIIIlIIlIl[lIIIlIIllI[27]] = lllIlIIlIIlI("DgsmNwAnAmMHBCUDJywCPw==", "KfCEa");
        lIIIlIIlIl[lIIIlIIllI[29]] = lllIlIIlIIlI("Ly4mOA==", "mOHSG");
        lIIIlIIlIl[lIIIlIIllI[31]] = lllIlIIlIIlI("BjUvDnQnPCQWIA==", "DTAeT");
        lIIIlIIlIl[lIIIlIIllI[23]] = lllIlIIlIIll("idV9ocrGF6s=", "CNXds");
        lIIIlIIlIl[lIIIlIIllI[22]] = lllIlIIlIIII("kWRp9ysmlro=", "PneAb");
        lIIIlIIlIl[lIIIlIIllI[32]] = lllIlIIlIIlI("AyUfIA==", "ADqKp");
        lIIIlIIlIl[lIIIlIIllI[33]] = lllIlIIlIIII("JjW2CM3vdLw=", "eFZUv");
        lIIIlIIlIl[lIIIlIIllI[34]] = lllIlIIlIIll("a3d8/FS5kW89PsuyxUNJNw==", "HrGTo");
        lIIIlIIlIl[lIIIlIIllI[35]] = lllIlIIlIIII("Wq2jE+w2KVs=", "yyDss");
        lIIIlIIlIl[lIIIlIIllI[36]] = lllIlIIlIIlI("FRQmAzMOAz4=", "aqJfC");
        lIIIlIIlIl[lIIIlIIllI[37]] = lllIlIIlIIlI("OAYrNTIjETM=", "LcGPB");
        lIIIlIIlIl[lIIIlIIllI[38]] = lllIlIIlIIII("ARFr5c9LdEH9Wyy3e05KFA==", "jkGyC");
        lIIIlIIlIl[lIIIlIIllI[39]] = lllIlIIlIIll("b5gu9QRGvrS28VFVW8krjQ==", "XfJam");
    }

    private static boolean lllIlIIllIll(int i, int i2) {
        return i <= i2;
    }

    public static void a(int lIlIlllIllIl, int i) {
        int[] iArr = new int[lIIIlIIllI[1]];
        iArr[lIIIlIIllI[2]] = lIlIlllIllIl;
        if (lllIlIIllIII(Bank.contains(iArr) ? 1 : 0)) {
            System.out.println("[Plugin] Missing " + lIlIlllIllIl + " item id");
        }
        int[] iArr2 = new int[lIIIlIIllI[1]];
        iArr2[lIIIlIIllI[2]] = lIlIlllIllIl;
        if (lllIlIIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
            Bank.withdraw(lIlIlllIllIl, i, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(lIIIlIIllI[1]);
            "".length();
        }
    }

    public static void a() {
        if (lllIlIIllIll(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIllI[28])) {
            String[] strArr = new String[lIIIlIIllI[1]];
            strArr[lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[27]];
            NPCs.getNearest(strArr).interact(lIIIlIIlIl[lIIIlIIllI[29]]);
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIIIlIIllI[30]);
            "".length();
        }
        if (!lllIlIIllIII(BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIlIIlIlll(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            GrandExchange.openBank();
            Time.sleepTicks(lIIIlIIllI[15]);
            "".length();
            Time.sleepUntil(() -> {
                return Bank.isOpen();
            }, lIIIlIIllI[30]);
            "".length();
            "".length();
            if (" ".length() > " ".length()) {
            }
        } else if (lllIlIIllIII(BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIllIII(BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIllIII(BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIllIII(B.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIllIII(E.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lllIlIIllIll(Players.getLocal().getWorldLocation().distanceTo(H), lIIIlIIllI[11])) {
            if (lllIlIIllIII(x.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIlIIllIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIllI[28])) {
                WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                String[] strArr2 = new String[lIIIlIIllI[1]];
                strArr2[lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[34]];
                TileObject nearest = TileObjects.getNearest(worldLocation, strArr2);
                if (lllIlIIllIlI(nearest)) {
                    nearest.interact(lIIIlIIlIl[lIIIlIIllI[35]]);
                    Time.sleepTicks(lIIIlIIllI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIlIIllI[30]);
                    "".length();
                }
            }
        } else {
            WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
            String[] strArr3 = new String[lIIIlIIllI[1]];
            strArr3[lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[31]];
            TileObject nearest2 = TileObjects.getNearest(worldLocation2, strArr3);
            if (lllIlIIllIlI(nearest2)) {
                String[] strArr4 = new String[lIIIlIIllI[1]];
                strArr4[lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[23]];
                if (lllIlIIlIlll(nearest2.hasAction(strArr4) ? 1 : 0)) {
                    nearest2.interact(lIIIlIIlIl[lIIIlIIllI[22]]);
                    Time.sleepTicks(lIIIlIIllI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIlIIllI[30]);
                    "".length();
                }
                String[] strArr5 = new String[lIIIlIIllI[1]];
                strArr5[lIIIlIIllI[2]] = lIIIlIIlIl[lIIIlIIllI[32]];
                if (lllIlIIlIlll(nearest2.hasAction(strArr5) ? 1 : 0)) {
                    nearest2.interact(lIIIlIIlIl[lIIIlIIllI[33]]);
                    Time.sleepTicks(lIIIlIIllI[15]);
                    "".length();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIlIIllI[30]);
                    "".length();
                }
            }
            "".length();
            if (" ".length() < " ".length()) {
            }
        }
    }

    private static boolean lllIlIIllIIl(int i, int i2) {
        return i > i2;
    }

    private static String lllIlIIlIIII(String lIlIllIlIlll, String lIlIllIlIllI) {
        try {
            SecretKeySpec lIlIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIllI[14], lIlIllIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIllIII) {
            lIlIllIllIII.printStackTrace();
            return null;
        }
    }

    static {
        lllIlIIlIlIl();
        lllIlIIlIlII();
        x = new WorldArea(lIIIlIIllI[40], lIIIlIIllI[41], lIIIlIIllI[42], lIIIlIIllI[43], lIIIlIIllI[2]);
        y = new WorldPoint(lIIIlIIllI[44], lIIIlIIllI[45], lIIIlIIllI[2]);
        z = new WorldArea(lIIIlIIllI[46], lIIIlIIllI[47], lIIIlIIllI[48], lIIIlIIllI[48], lIIIlIIllI[2]);
        A = new WorldArea(lIIIlIIllI[49], lIIIlIIllI[50], lIIIlIIllI[51], lIIIlIIllI[52], lIIIlIIllI[2]);
        B = new WorldArea(lIIIlIIllI[53], lIIIlIIllI[54], lIIIlIIllI[38], lIIIlIIllI[11], lIIIlIIllI[2]);
        C = new WorldArea(lIIIlIIllI[55], lIIIlIIllI[56], lIIIlIIllI[57], lIIIlIIllI[58], lIIIlIIllI[2]);
        D = new WorldArea(lIIIlIIllI[59], lIIIlIIllI[60], lIIIlIIllI[61], lIIIlIIllI[62], lIIIlIIllI[2]);
        E = new WorldArea(lIIIlIIllI[63], lIIIlIIllI[64], lIIIlIIllI[35], lIIIlIIllI[36], lIIIlIIllI[2]);
        F = new WorldArea(lIIIlIIllI[7], lIIIlIIllI[65], lIIIlIIllI[66], lIIIlIIllI[67], lIIIlIIllI[2]);
        G = new WorldPoint(lIIIlIIllI[68], lIIIlIIllI[69], lIIIlIIllI[2]);
        H = new WorldPoint(lIIIlIIllI[70], lIIIlIIllI[71], lIIIlIIllI[2]);
        I = new WorldPoint(lIIIlIIllI[72], lIIIlIIllI[73], lIIIlIIllI[1]);
    }

    private static boolean lllIlIIlIllI(int i, int i2) {
        return i == i2;
    }

    public static void b(int i, int i2) {
        Bank.withdraw(i, i2, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(lIIIlIIllI[1]);
        "".length();
    }

    private static boolean lllIlIIllIII(int i) {
        return i == 0;
    }

    private static boolean lllIlIIlllII(int i, int i2) {
        return i < i2;
    }

    private static String lllIlIIlIIlI(String lIlIllIIIlll, String lIlIllIIIllI) {
        String lIlIllIIIlll2 = new String(Base64.getDecoder().decode(lIlIllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIIIlIl = new StringBuilder();
        char[] lIlIllIIIlII = lIlIllIIIllI.toCharArray();
        int lIlIllIIIIll = lIIIlIIllI[2];
        char[] charArray = lIlIllIIIlll2.toCharArray();
        int length = charArray.length;
        int i = lIIIlIIllI[2];
        while (lllIlIIlllII(i, length)) {
            char lIlIllIIlIII = charArray[i];
            lIlIllIIIlIl.append((char) (lIlIllIIlIII ^ lIlIllIIIlII[lIlIllIIIIll % lIlIllIIIlII.length]));
            "".length();
            lIlIllIIIIll++;
            i++;
            "".length();
            if ("  ".length() <= (((((51 + 6) - (-42)) + 50) ^ (((103 + 112) - 51) + 7)) & (((114 ^ 1) ^ (88 ^ 21)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lIlIllIIIlIl);
    }

    private static void lllIlIIlIlIl() {
        lIIIlIIllI = new int[74];
        lIIIlIIllI[0] = (-((-193) & 29951)) & (-257) & 32190;
        lIIIlIIllI[1] = " ".length();
        lIIIlIIllI[2] = (77 ^ 111) & ((29 ^ 63) ^ (-1));
        lIIIlIIllI[3] = (-1058) & 3509;
        lIIIlIIllI[4] = (-26247) & 30719;
        lIIIlIIllI[5] = (-((-661) & 22236)) & (-33) & 24559;
        lIIIlIIllI[6] = (-((-1) & 18513)) & (-8195) & 32479;
        lIIIlIIllI[7] = (-((-2667) & 7915)) & (-24577) & 32764;
        lIIIlIIllI[8] = (-((-3090) & 27735)) & (-2339) & 32743;
        lIIIlIIllI[9] = 78 ^ 85;
        lIIIlIIllI[10] = 107 ^ 119;
        lIIIlIIllI[11] = 118 ^ 98;
        lIIIlIIllI[12] = -" ".length();
        lIIIlIIllI[13] = 28 ^ 26;
        lIIIlIIllI[14] = "  ".length();
        lIIIlIIllI[15] = "   ".length();
        lIIIlIIllI[16] = (44 ^ 2) ^ (124 ^ 122);
        lIIIlIIllI[17] = (-29966) & 32573;
        lIIIlIIllI[18] = (-16397) & 19788;
        lIIIlIIllI[19] = 59 ^ 62;
        lIIIlIIllI[20] = (-((-22534) & 32191)) & (-20545) & 32765;
        lIIIlIIllI[21] = (-((-15829) & 32214)) & (-4289) & 23533;
        lIIIlIIllI[22] = (((135 + 102) - 226) + 150) ^ (((133 + 53) - 124) + 108);
        lIIIlIIllI[23] = 133 ^ 143;
        lIIIlIIllI[24] = (((108 + 130) - 178) + 88) ^ (((79 + 72) - 126) + 119);
        lIIIlIIllI[25] = (-((-10245) & 27573)) & (-1) & 20479;
        lIIIlIIllI[26] = (-((-1289) & 21771)) & (-8361) & 32763;
        lIIIlIIllI[27] = (((133 + 63) - 84) + 47) ^ (((125 + 78) - 91) + 40);
        lIIIlIIllI[28] = 1 ^ 31;
        lIIIlIIllI[29] = (((17 + 8) - (-113)) + 69) ^ (((3 + 22) - (-104)) + 70);
        lIIIlIIllI[30] = (-(113 ^ 102)) & (-12353) & 16374;
        lIIIlIIllI[31] = (168 ^ 182) ^ (155 ^ 140);
        lIIIlIIllI[32] = (61 ^ 32) ^ (211 ^ 194);
        lIIIlIIllI[33] = (((113 + 118) - 95) + 18) ^ (((105 + 49) - 42) + 39);
        lIIIlIIllI[34] = 93 ^ 83;
        lIIIlIIllI[35] = (241 ^ 171) ^ (127 ^ 42);
        lIIIlIIllI[36] = 48 ^ 32;
        lIIIlIIllI[37] = 52 ^ 37;
        lIIIlIIllI[38] = (169 ^ 199) ^ (244 ^ 136);
        lIIIlIIllI[39] = (((114 + 58) - 154) + 129) ^ (((52 + 28) - 37) + 85);
        lIIIlIIllI[40] = (-(((69 + 77) - 81) + 72)) & (-12305) & 15583;
        lIIIlIIllI[41] = (-20559) & 24031;
        lIIIlIIllI[42] = (((43 + 92) - 25) + 51) ^ (((82 + 130) - 188) + 112);
        lIIIlIIllI[43] = 36 ^ 3;
        lIIIlIIllI[44] = (-((-19133) & 31679)) & (-74) & 15823;
        lIIIlIIllI[45] = (-21209) & 24573;
        lIIIlIIllI[46] = (-((-3917) & 16205)) & (-17569) & 32763;
        lIIIlIIllI[47] = (-12897) & 16106;
        lIIIlIIllI[48] = (70 ^ 106) ^ (46 ^ 107);
        lIIIlIIllI[49] = (-((-1049) & 29977)) & (-130) & 32253;
        lIIIlIIllI[50] = (-25) & 3390;
        lIIIlIIllI[51] = 62 ^ 29;
        lIIIlIIllI[52] = (117 ^ 45) ^ (167 ^ 197);
        lIIIlIIllI[53] = (-21387) & 24511;
        lIIIlIIllI[54] = (-(152 ^ 157)) & (-24833) & 28455;
        lIIIlIIllI[55] = (-20514) & 24127;
        lIIIlIIllI[56] = (-12417) & 15834;
        lIIIlIIllI[57] = (((195 + 32) - 83) + 109) ^ (((126 + 158) - 185) + 62);
        lIIIlIIllI[58] = 99 ^ 70;
        lIIIlIIllI[59] = (-((-28186) & 32415)) & (-16897) & 24255;
        lIIIlIIllI[60] = (-25095) & 28535;
        lIIIlIIllI[61] = (55 ^ 120) ^ (192 ^ 190);
        lIIIlIIllI[62] = (((105 + 44) - 111) + 159) ^ (((46 + 43) - 66) + 106);
        lIIIlIIllI[63] = (-4353) & 5982;
        lIIIlIIllI[64] = (-((-28626) & 32723)) & (-143) & 8175;
        lIIIlIIllI[65] = (-((-3527) & 16343)) & (-16387) & 32511;
        lIIIlIIllI[66] = (((1 + 32) - (-13)) + 102) ^ (((182 + 145) - 163) + 21);
        lIIIlIIllI[67] = (32 ^ 100) ^ (79 ^ 47);
        lIIIlIIllI[68] = (-((-27401) & 31593)) & (-1025) & 8191;
        lIIIlIIllI[69] = (-((-22561) & 31542)) & (-16385) & 28607;
        lIIIlIIllI[70] = (-((-28682) & 31055)) & (-28673) & 32767;
        lIIIlIIllI[71] = (-((-10113) & 30693)) & (-17) & 24061;
        lIIIlIIllI[72] = (-5129) & 8172;
        lIIIlIIllI[73] = (-((-4897) & 24497)) & (-1) & 24573;
    }
}
