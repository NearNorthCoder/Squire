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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.u  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/u.class */
public class C0020u implements W {
    private static /* synthetic */ String[] lIlIllIIl;
    public static final /* synthetic */ WorldPoint cJ;
    public static final /* synthetic */ WorldPoint cK;
    static /* synthetic */ int bT;
    public static final /* synthetic */ WorldPoint cI;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ int cl;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIlIllIlI;
    static /* synthetic */ boolean cm;

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            aO();
            "".length();
            if (((202 ^ 157) & ((127 ^ 40) ^ (-1))) > "  ".length()) {
                return (153 ^ 132) & ((49 ^ 44) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIllIlI[51];
    }

    private static boolean lIIlIIlIIIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[lIlIllIlI[1]];
        strArr[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[40]];
        if (lIIlIIlIIlll(Inventory.getCount(strArr))) {
            String[] strArr2 = new String[lIlIllIlI[1]];
            strArr2[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[41]];
            if (lIIlIIlIIlll(Inventory.getCount(strArr2))) {
                String[] strArr3 = new String[lIlIllIlI[1]];
                strArr3[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[42]];
                if (lIIlIIlIIlll(Inventory.getCount(strArr3))) {
                    String[] strArr4 = new String[lIlIllIlI[1]];
                    strArr4[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[43]];
                    if (lIIlIIlIIlll(Inventory.getCount(strArr4))) {
                        ?? r0 = lIlIllIlI[1];
                        "".length();
                        return "   ".length() >= (27 ^ 31) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                    }
                }
            }
        }
        return lIlIllIlI[0];
    }

    private static String lIIlIIIlllIl(String lllIIIlIIllllI, String lllIIIlIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), lIlIllIlI[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIlIIlllll) {
            lllIIIlIIlllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIllllI(String lllIIIlIIlIIIl, String lllIIIlIIlIIII) {
        try {
            SecretKeySpec lllIIIlIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIlI[3], lllIIIlIIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIlIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIlIIlIIlI) {
            lllIIIlIIlIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010d, code lost:
        if (lIIlIIlIIlll(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v308, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aO() {
        if (lIIlIIlIIIll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[0]];
            C0001b.a(bv);
            if (lIIlIIlIIlII(bv.size(), lIlIllIlI[1])) {
                System.out.println(lIlIllIIl[lIlIllIlI[1]]);
                bt = lIlIllIlI[0];
            }
        }
        if (lIIlIIlIIlIl(bt ? 1 : 0)) {
            if (lIIlIIlIIIll(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlIIlIIlII(Movement.getRunEnergy(), lIlIllIlI[2])) {
                Inventory.getFirst(C0005f.aV).interact(lIlIllIIl[lIlIllIlI[3]]);
                Time.sleepTicks(lIlIllIlI[1]);
                "".length();
            }
            if (lIIlIIlIIllI(lIIlIIlIIIlI(C0004e.u(), 70.0d))) {
                int[] iArr = new int[lIlIllIlI[1]];
                iArr[lIlIllIlI[0]] = lIlIllIlI[4];
                if (lIIlIIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIllIlI[1]];
                    iArr2[lIlIllIlI[0]] = lIlIllIlI[4];
                    Inventory.getFirst(iArr2).interact(lIlIllIIl[lIlIllIlI[5]]);
                }
            }
            if (lIIlIIlIIlIl(Movement.isRunEnabled() ? 1 : 0) && lIIlIIlIIlll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIIlIIlIIIll(ab() ? 1 : 0)) {
                int[] iArr3 = new int[lIlIllIlI[1]];
                iArr3[lIlIllIlI[0]] = lIlIllIlI[6];
            }
            if (lIIlIIlIIlII(C0004e.j(lIlIllIlI[7]), lIlIllIlI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIlIlIII(nearest) && lIIlIIlIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[8]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIlIllIlI[3]);
                    "".length();
                }
                if (lIIlIIlIlIII(nearest) && lIIlIIlIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[9]];
                    if (lIIlIIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIllIlI[10]);
                        "".length();
                    }
                    if (lIIlIIlIIIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlIIlIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIllIlI[8]);
                            "".length();
                        }
                        if (lIIlIIlIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIllIlI[3]);
                            "".length();
                        }
                        int[] iArr4 = new int[lIlIllIlI[9]];
                        iArr4[lIlIllIlI[0]] = lIlIllIlI[11];
                        iArr4[lIlIllIlI[1]] = lIlIllIlI[12];
                        iArr4[lIlIllIlI[3]] = lIlIllIlI[13];
                        iArr4[lIlIllIlI[5]] = lIlIllIlI[14];
                        iArr4[lIlIllIlI[8]] = lIlIllIlI[4];
                        if (lIIlIIlIIlIl(C0004e.b(iArr4) ? 1 : 0)) {
                            af();
                            System.out.println(lIlIllIIl[lIlIllIlI[15]]);
                            bt = lIlIllIlI[1];
                            return;
                        }
                        int[] iArr5 = new int[lIlIllIlI[9]];
                        iArr5[lIlIllIlI[0]] = lIlIllIlI[11];
                        iArr5[lIlIllIlI[1]] = lIlIllIlI[12];
                        iArr5[lIlIllIlI[3]] = lIlIllIlI[13];
                        iArr5[lIlIllIlI[5]] = lIlIllIlI[14];
                        iArr5[lIlIllIlI[8]] = lIlIllIlI[4];
                        if (lIIlIIlIIIll(C0004e.b(iArr5) ? 1 : 0)) {
                            Bank.withdraw(lIlIllIlI[11], lIlIllIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIllIlI[1]);
                            "".length();
                            Bank.withdraw(lIlIllIlI[12], lIlIllIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIllIlI[1]);
                            "".length();
                            Bank.withdraw(lIlIllIlI[13], lIlIllIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIllIlI[1]);
                            "".length();
                            Bank.withdraw(lIlIllIlI[14], lIlIllIlI[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIllIlI[1]);
                            "".length();
                            C0000a.a(lIlIllIlI[16], lIlIllIlI[9]);
                            C0000a.b(C0005f.aV, lIlIllIlI[9]);
                            C0000a.a(lIlIllIlI[4], lIlIllIlI[17]);
                            C0000a.b(C0005f.bf, lIlIllIlI[1]);
                        }
                    }
                }
            }
            if (lIIlIIlIIIll(ab() ? 1 : 0) && lIIlIIlIIlII(C0004e.j(lIlIllIlI[7]), lIlIllIlI[1])) {
                if (lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[18]];
                    if (lIIlIIlIIlII(bT, lIlIllIlI[1])) {
                        C0004e.v();
                        bT += lIlIllIlI[1];
                    }
                    Movement.walkTo(cI);
                    "".length();
                    Time.sleepTicks(lIlIllIlI[1]);
                    "".length();
                }
                if (lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[19]];
                    C0006g.a(lIlIllIIl[lIlIllIlI[20]], bR);
                }
            }
            if (lIIlIIlIlIll(C0004e.j(lIlIllIlI[7]), lIlIllIlI[1])) {
                cl = lIlIllIlI[0];
                if (lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[17]];
                    Movement.walkTo(cJ);
                    "".length();
                    Time.sleepTicks(lIlIllIlI[1]);
                    "".length();
                }
                if (lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[21]];
                    C0006g.a(lIlIllIIl[lIlIllIlI[22]], bR);
                }
            }
            if (lIIlIIlIlIll(C0004e.j(lIlIllIlI[7]), lIlIllIlI[3]) && lIIlIIlIIlIl(aP() ? 1 : 0)) {
                if (lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cK), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[23]];
                    Movement.walkTo(cK);
                    "".length();
                    Time.sleepTicks(lIlIllIlI[1]);
                    "".length();
                }
                if (lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cK), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[24]];
                    int[] iArr6 = new int[lIlIllIlI[1]];
                    iArr6[lIlIllIlI[0]] = lIlIllIlI[25];
                    TileObject nearest2 = TileObjects.getNearest(iArr6);
                    if (lIIlIIlIlIII(nearest2)) {
                        String[] strArr = new String[lIlIllIlI[1]];
                        strArr[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[26]];
                        Item first = Inventory.getFirst(strArr);
                        String[] strArr2 = new String[lIlIllIlI[1]];
                        strArr2[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[27]];
                        Item first2 = Inventory.getFirst(strArr2);
                        String[] strArr3 = new String[lIlIllIlI[1]];
                        strArr3[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[28]];
                        Item first3 = Inventory.getFirst(strArr3);
                        String[] strArr4 = new String[lIlIllIlI[1]];
                        strArr4[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[29]];
                        Item first4 = Inventory.getFirst(strArr4);
                        if (lIIlIIlIlIII(first)) {
                            first.useOn(nearest2);
                            Time.sleepTicks(lIlIllIlI[1]);
                            "".length();
                        }
                        if (lIIlIIlIlIII(first2)) {
                            first2.useOn(nearest2);
                            Time.sleepTicks(lIlIllIlI[1]);
                            "".length();
                        }
                        if (lIIlIIlIlIII(first3)) {
                            first3.useOn(nearest2);
                            Time.sleepTicks(lIlIllIlI[1]);
                            "".length();
                        }
                        if (lIIlIIlIlIII(first4)) {
                            first4.useOn(nearest2);
                            Time.sleepTicks(lIlIllIlI[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIIlIIlIlIll(C0004e.j(lIlIllIlI[7]), lIlIllIlI[3]) && lIIlIIlIIIll(aP() ? 1 : 0)) {
                if (lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[30]];
                    Movement.walkTo(cJ);
                    "".length();
                    Time.sleepTicks(lIlIllIlI[1]);
                    "".length();
                }
                if (lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cJ), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[31]];
                    C0006g.a(lIlIllIIl[lIlIllIlI[32]], bR);
                }
            }
            if (lIIlIIlIlIll(C0004e.j(lIlIllIlI[7]), lIlIllIlI[5])) {
                if (lIIlIIlIlIIl(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[33]];
                    Movement.walkTo(cI);
                    "".length();
                    Time.sleepTicks(lIlIllIlI[1]);
                    "".length();
                }
                if (lIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(cI), lIlIllIlI[5])) {
                    AccBuilderEasyClues.c = lIlIllIIl[lIlIllIlI[34]];
                    if (lIIlIIlIIlII(cl, lIlIllIlI[1])) {
                        an.mI += lIlIllIlI[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIllIlI[1];
                        an.mI = lIlIllIlI[0];
                    }
                    C0006g.a(lIlIllIIl[lIlIllIlI[35]], bR);
                }
            }
            C0006g.a(bR);
        }
    }

    private static String lIIlIIIlllll(String lllIIIlIllIIll, String lllIIIlIllIIlI) {
        String str = new String(Base64.getDecoder().decode(lllIIIlIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIlIllIIIl = new StringBuilder();
        char[] lllIIIlIllIIII = lllIIIlIllIIlI.toCharArray();
        int lllIIIlIlIllll = lIlIllIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIllIlI[0];
        while (lIIlIIlIIlII(i, length)) {
            char lllIIIlIllIlII = charArray[i];
            lllIIIlIllIIIl.append((char) (lllIIIlIllIlII ^ lllIIIlIllIIII[lllIIIlIlIllll % lllIIIlIllIIII.length]));
            "".length();
            lllIIIlIlIllll++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllIIIlIllIIIl);
    }

    private static int lIIlIIlIIIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean aP() {
        String[] strArr = new String[lIlIllIlI[1]];
        strArr[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[36]];
        if (lIIlIIlIIlll(Inventory.getCount(strArr))) {
            String[] strArr2 = new String[lIlIllIlI[1]];
            strArr2[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[37]];
            if (lIIlIIlIIlll(Inventory.getCount(strArr2))) {
                String[] strArr3 = new String[lIlIllIlI[1]];
                strArr3[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[38]];
                if (lIIlIIlIIlll(Inventory.getCount(strArr3))) {
                    String[] strArr4 = new String[lIlIllIlI[1]];
                    strArr4[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[39]];
                    if (lIIlIIlIIlll(Inventory.getCount(strArr4))) {
                        ?? r0 = lIlIllIlI[1];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return lIlIllIlI[0];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIllIIl[lIlIllIlI[52]];
    }

    private static boolean lIIlIIlIIlIl(int i) {
        return i == 0;
    }

    private static void lIIlIIlIIIII() {
        lIlIllIIl = new String[lIlIllIlI[49]];
        lIlIllIIl[lIlIllIlI[0]] = lIIlIIIlllIl("o5YBS4eIslJe5FpNaXqTuQ==", "QbxaZ");
        lIlIllIIl[lIlIllIlI[1]] = lIIlIIIllllI("eCdteWCpkV5xPkXF7okjrPLw+xD1vUYQpw74ql0smI8Wmjd6xAA7nCqfzhHq+yhl", "ngUem");
        lIlIllIIl[lIlIllIlI[3]] = lIIlIIIlllll("FSIjFiA=", "QPJxK");
        lIlIllIIl[lIlIllIlI[5]] = lIIlIIIllllI("JseGemstlxg=", "vFcOC");
        lIlIllIIl[lIlIllIlI[8]] = lIIlIIIllllI("oSxGxc71v6vSNhTIhDsr6A==", "Mfmil");
        lIlIllIIl[lIlIllIlI[9]] = lIIlIIIlllll("HBMePSs9HBd5JTUcGzApMw==", "TrpYG");
        lIlIllIIl[lIlIllIlI[15]] = lIIlIIIllllI("9Zr9GdQz+lzTmECesixyKuxebU0pK69e3bBv9Rzq1Nqk8SoZg4ygY0Xi1xZm6/zeTObJPjz3Sv8=", "YAPrh");
        lIlIllIIl[lIlIllIlI[18]] = lIIlIIIlllIl("j7Nt+v4er+CeO4KC5Z+Mhg==", "VXZLY");
        lIlIllIIl[lIlIllIlI[19]] = lIIlIIIllllI("QH6RQMoECLG/6BTgrDLIGg==", "wwxcO");
        lIlIllIIl[lIlIllIlI[20]] = lIIlIIIlllll("ExIgFw49Fik=", "XsQrc");
        lIlIllIIl[lIlIllIlI[17]] = lIIlIIIllllI("d16H6JI8fIyE4leAVL1sog==", "kNeFq");
        lIlIllIIl[lIlIllIlI[21]] = lIIlIIIlllIl("6Ku/z1/D1eYal2BFnkx02A==", "oTviC");
        lIlIllIIl[lIlIllIlI[22]] = lIIlIIIlllll("NRADNSkR", "fqmSL");
        lIlIllIIl[lIlIllIlI[23]] = lIIlIIIlllIl("p8PHFjyaq5ct7Ed+n0qP7g==", "lOmHA");
        lIlIllIIl[lIlIllIlI[24]] = lIIlIIIlllIl("OgAiawwwYTD3fSaGxAgmxw==", "HBAsj");
        lIlIllIIl[lIlIllIlI[26]] = lIIlIIIlllIl("UlklAo2oG1Eb6Ldtx183MQ==", "KreLs");
        lIlIllIIl[lIlIllIlI[27]] = lIIlIIIllllI("Nj5lIXTvqXPcdsWGkD2HBQ==", "GUlyq");
        lIlIllIIl[lIlIllIlI[28]] = lIIlIIIlllIl("Sy75N/IM+aRN3in4MuWOIA==", "phWfY");
        lIlIllIIl[lIlIllIlI[29]] = lIIlIIIlllIl("M+a/GTLKhYppXNmNk+IS4g==", "xljpN");
        lIlIllIIl[lIlIllIlI[30]] = lIIlIIIllllI("WR1Vv2ux/7Us8siaLWMwgg==", "BpowA");
        lIlIllIIl[lIlIllIlI[31]] = lIIlIIIllllI("wIDaNUVo3DxO3wA4EF1aww==", "GLuJT");
        lIlIllIIl[lIlIllIlI[32]] = lIIlIIIlllIl("Kt0ysSLkNxw=", "KwBrG");
        lIlIllIIl[lIlIllIlI[33]] = lIIlIIIllllI("Ffk5aoPLYj4vpy4RmCMjNA==", "CElXB");
        lIlIllIIl[lIlIllIlI[34]] = lIIlIIIlllIl("t4/ApslUPc7F7zVAxuMSOQ==", "JhTMQ");
        lIlIllIIl[lIlIllIlI[35]] = lIIlIIIlllll("BwkjAgopDSo=", "LhRgg");
        lIlIllIIl[lIlIllIlI[36]] = lIIlIIIlllIl("FcohTdU6hE5heVdgBeQ/mA==", "LkOmc");
        lIlIllIIl[lIlIllIlI[37]] = lIIlIIIllllI("qABpts9h2Oc0Ynbfekhqy88ECVp1QfhG", "TdQZS");
        lIlIllIIl[lIlIllIlI[38]] = lIIlIIIlllIl("yC8rfmbxqJBINrMozxfg/g==", "uujMI");
        lIlIllIIl[lIlIllIlI[39]] = lIIlIIIlllIl("pS6hGJdiaw0Qvo3VJVOywQ==", "jCMeg");
        lIlIllIIl[lIlIllIlI[40]] = lIIlIIIllllI("YOwV6YYj23WdJ8anYsFB3A==", "eQSyH");
        lIlIllIIl[lIlIllIlI[41]] = lIIlIIIlllll("BhA6WiwxFCs=", "TqMzN");
        lIlIllIIl[lIlIllIlI[42]] = lIIlIIIlllIl("UraVy5fxbzLGTtb4T5mzaw==", "UzfBr");
        lIlIllIIl[lIlIllIlI[43]] = lIIlIIIlllll("HzYQTR0sI0cACiwj", "MWgmo");
        lIlIllIIl[lIlIllIlI[52]] = lIIlIIIlllll("HDAMEy8xIVkIIiw3GBZrKTccCT8=", "XByzK");
        lIlIllIIl[lIlIllIlI[53]] = lIIlIIIlllIl("M7EdikvzkPohgO7t+m7WhewbJf+Y2Rrk", "SIiwM");
        lIlIllIIl[lIlIllIlI[60]] = lIIlIIIllllI("86iI/cslmc6qcLc2P+9/XfesJXNYk8L72Kn/nNZ25vM=", "THMXc");
        lIlIllIIl[lIlIllIlI[61]] = lIIlIIIlllll("ISkVL3xOC1QhOQIuVCIiF2IVODROKhE6IEA=", "nBtVP");
        lIlIllIIl[lIlIllIlI[62]] = lIIlIIIlllll("Cz8ydw==", "RZAYX");
        lIlIllIIl[lIlIllIlI[63]] = lIIlIIIllllI("UZHCfZkwpMcdJnyAPC09UHLr2HMMDCFC4zDr8MTL1dn3euIGKk6iVkPDezXq2oiJ6SvqSL+XEJw=", "eCshG");
        lIlIllIIl[lIlIllIlI[64]] = lIIlIIIlllll("Kg1negxCCid6IQpGPzIkEUY/MiALSA==", "efKZE");
    }

    private static boolean lIIlIIlIlIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIIlIIlll(int i) {
        return i > 0;
    }

    private static boolean lIIlIIlIIllI(int i) {
        return i < 0;
    }

    private static void af() {
        int[] iArr = new int[lIlIllIlI[1]];
        iArr[lIlIllIlI[0]] = lIlIllIlI[44];
        if (lIIlIIlIIlIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIlI[44], lIlIllIlI[9], C0008i.bq));
            "".length();
        }
        int[] iArr2 = new int[lIlIllIlI[1]];
        iArr2[lIlIllIlI[0]] = lIlIllIlI[11];
        if (lIIlIIlIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIlI[11], lIlIllIlI[1], lIlIllIlI[45]));
            "".length();
        }
        int[] iArr3 = new int[lIlIllIlI[1]];
        iArr3[lIlIllIlI[0]] = lIlIllIlI[12];
        if (lIIlIIlIIlIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIlI[12], lIlIllIlI[1], lIlIllIlI[45]));
            "".length();
        }
        int[] iArr4 = new int[lIlIllIlI[1]];
        iArr4[lIlIllIlI[0]] = lIlIllIlI[14];
        if (lIIlIIlIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIlI[14], lIlIllIlI[1], lIlIllIlI[45]));
            "".length();
        }
        int[] iArr5 = new int[lIlIllIlI[1]];
        iArr5[lIlIllIlI[0]] = lIlIllIlI[13];
        if (lIIlIIlIIlIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIlI[13], lIlIllIlI[1], lIlIllIlI[45]));
            "".length();
        }
        int[] iArr6 = new int[lIlIllIlI[1]];
        iArr6[lIlIllIlI[0]] = lIlIllIlI[4];
        if (lIIlIIlIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIlI[4], lIlIllIlI[17], lIlIllIlI[45]));
            "".length();
        }
        if (lIIlIIlIIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIllIIl[lIlIllIlI[53]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIlI[46], lIlIllIlI[9], lIlIllIlI[47]));
            "".length();
        }
        int[] iArr7 = new int[lIlIllIlI[1]];
        iArr7[lIlIllIlI[0]] = lIlIllIlI[48];
        if (lIIlIIlIIlIl(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIlIllIlI[48], lIlIllIlI[49], lIlIllIlI[50]));
            "".length();
        }
    }

    private static boolean lIIlIIlIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIlIlIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIIlIlIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIlIllll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIllIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIlIIlIllll(C0004e.j(lIlIllIlI[7]), lIlIllIlI[8])) {
            ?? r0 = lIlIllIlI[1];
            "".length();
            return " ".length() >= "   ".length() ? ((63 ^ 72) ^ (78 ^ 115)) & (((96 ^ 75) ^ (87 ^ 54)) ^ (-" ".length())) : r0;
        }
        return lIlIllIlI[0];
    }

    private static boolean lIIlIIlIlIII(Object obj) {
        return obj != null;
    }

    static {
        lIIlIIlIIIIl();
        lIIlIIlIIIII();
        cI = new WorldPoint(lIlIllIlI[54], lIlIllIlI[55], lIlIllIlI[0]);
        cJ = new WorldPoint(lIlIllIlI[56], lIlIllIlI[57], lIlIllIlI[1]);
        cK = new WorldPoint(lIlIllIlI[58], lIlIllIlI[59], lIlIllIlI[0]);
        bv = new ArrayList();
        bT = lIlIllIlI[0];
        String[] strArr = new String[lIlIllIlI[9]];
        strArr[lIlIllIlI[0]] = lIlIllIIl[lIlIllIlI[60]];
        strArr[lIlIllIlI[1]] = lIlIllIIl[lIlIllIlI[61]];
        strArr[lIlIllIlI[3]] = lIlIllIIl[lIlIllIlI[62]];
        strArr[lIlIllIlI[5]] = lIlIllIIl[lIlIllIlI[63]];
        strArr[lIlIllIlI[8]] = lIlIllIIl[lIlIllIlI[64]];
        bR = strArr;
    }

    private static void lIIlIIlIIIIl() {
        lIlIllIlI = new int[65];
        lIlIllIlI[0] = (107 ^ 86) & ((158 ^ 163) ^ (-1));
        lIlIllIlI[1] = " ".length();
        lIlIllIlI[2] = 93 ^ 111;
        lIlIllIlI[3] = "  ".length();
        lIlIllIlI[4] = (-((-12625) & 31189)) & (-5121) & 24063;
        lIlIllIlI[5] = "   ".length();
        lIlIllIlI[6] = (-1041) & 2035;
        lIlIllIlI[7] = (29 ^ 80) ^ (132 ^ 153);
        lIlIllIlI[8] = 8 ^ 12;
        lIlIllIlI[9] = 71 ^ 66;
        lIlIllIlI[10] = (-((-12361) & 31867)) & (-8257) & 32762;
        lIlIllIlI[11] = (-9857) & 11994;
        lIlIllIlI[12] = (-((-1633) & 14315)) & (-16418) & 31231;
        lIlIllIlI[13] = (-((-2386) & 23541)) & (-9217) & 32507;
        lIlIllIlI[14] = (-((-9745) & 30226)) & (-8321) & 30935;
        lIlIllIlI[15] = (((18 + 113) - 120) + 122) ^ (((98 + 16) - 27) + 44);
        lIlIllIlI[16] = (-(176 ^ 149)) & (-24577) & 32621;
        lIlIllIlI[17] = 165 ^ 175;
        lIlIllIlI[18] = 144 ^ 151;
        lIlIllIlI[19] = (((113 + 38) - 130) + 121) ^ (((121 + 14) - 119) + 118);
        lIlIllIlI[20] = 169 ^ 160;
        lIlIllIlI[21] = 133 ^ 142;
        lIlIllIlI[22] = (32 ^ 85) ^ (221 ^ 164);
        lIlIllIlI[23] = (((137 + 61) - 194) + 136) ^ (((17 + 99) - 46) + 59);
        lIlIllIlI[24] = 152 ^ 150;
        lIlIllIlI[25] = (-8865) & 11006;
        lIlIllIlI[26] = 47 ^ 32;
        lIlIllIlI[27] = 70 ^ 86;
        lIlIllIlI[28] = 2 ^ 19;
        lIlIllIlI[29] = 83 ^ 65;
        lIlIllIlI[30] = 83 ^ 64;
        lIlIllIlI[31] = (((139 + 32) - 37) + 40) ^ (((180 + 173) - 316) + 149);
        lIlIllIlI[32] = 214 ^ 195;
        lIlIllIlI[33] = 33 ^ 55;
        lIlIllIlI[34] = (34 ^ 43) ^ (0 ^ 30);
        lIlIllIlI[35] = (((22 + 102) - 53) + 61) ^ (((54 + 73) - 85) + 114);
        lIlIllIlI[36] = (((89 + 74) - 43) + 69) ^ (((112 + 102) - 130) + 80);
        lIlIllIlI[37] = 108 ^ 118;
        lIlIllIlI[38] = (9 ^ 104) ^ (13 ^ 119);
        lIlIllIlI[39] = (((13 + 151) - 132) + 185) ^ (((8 + 140) - 74) + 123);
        lIlIllIlI[40] = 138 ^ 151;
        lIlIllIlI[41] = (78 ^ 57) ^ (82 ^ 59);
        lIlIllIlI[42] = (((51 + 102) - 136) + 112) ^ (((139 + 52) - 41) + 8);
        lIlIllIlI[43] = 144 ^ 176;
        lIlIllIlI[44] = (-((-8451) & 11183)) & (-1027) & 16383;
        lIlIllIlI[45] = (-8387) & 14286;
        lIlIllIlI[46] = (-290) & 12269;
        lIlIllIlI[47] = (-((-1190) & 3773)) & (-4161) & 31743;
        lIlIllIlI[48] = (-16537) & 24543;
        lIlIllIlI[49] = (162 ^ 140) ^ (174 ^ 168);
        lIlIllIlI[50] = (-((-6405) & 14717)) & (-21508) & 30719;
        lIlIllIlI[51] = (229 ^ 181) ^ (242 ^ 198);
        lIlIllIlI[52] = 168 ^ 137;
        lIlIllIlI[53] = 43 ^ 9;
        lIlIllIlI[54] = (-21649) & 24575;
        lIlIllIlI[55] = (-((-1713) & 14067)) & (-16897) & 32734;
        lIlIllIlI[56] = (-((-16766) & 30207)) & (-13) & 16351;
        lIlIllIlI[57] = (-20997) & 24423;
        lIlIllIlI[58] = (-(((95 + 106) - 192) + 121)) & (-17459) & 20479;
        lIlIllIlI[59] = (-((-131) & 18819)) & (-4249) & 32767;
        lIlIllIlI[60] = (((103 + 44) - 53) + 53) ^ (((105 + 64) - 88) + 95);
        lIlIllIlI[61] = 46 ^ 10;
        lIlIllIlI[62] = (((76 + 127) - 154) + 91) ^ (((97 + 157) - 107) + 22);
        lIlIllIlI[63] = (86 ^ 20) ^ (58 ^ 94);
        lIlIllIlI[64] = (((103 + 9) - 19) + 44) ^ (((86 + 67) - 6) + 27);
    }
}
