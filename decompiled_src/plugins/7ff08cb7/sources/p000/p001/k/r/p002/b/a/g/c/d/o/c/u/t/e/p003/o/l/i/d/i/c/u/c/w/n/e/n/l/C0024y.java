package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.y  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/y.class */
public class C0024y implements ab {
    private static /* synthetic */ String[] llIIllllI;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ int cI;
    private static /* synthetic */ int[] llIIlllll;
    static /* synthetic */ int dk;
    private static /* synthetic */ String[] cG;
    public static final /* synthetic */ WorldPoint dN;
    public static final /* synthetic */ WorldPoint dM;
    static /* synthetic */ boolean dl;
    public static /* synthetic */ List<C0003d> bx;
    public static final /* synthetic */ WorldPoint dO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bi() {
        String[] strArr = new String[llIIlllll[1]];
        strArr[llIIlllll[0]] = llIIllllI[llIIlllll[36]];
        if (lIlIllllIllI(Inventory.getCount(strArr))) {
            String[] strArr2 = new String[llIIlllll[1]];
            strArr2[llIIlllll[0]] = llIIllllI[llIIlllll[37]];
            if (lIlIllllIllI(Inventory.getCount(strArr2))) {
                String[] strArr3 = new String[llIIlllll[1]];
                strArr3[llIIlllll[0]] = llIIllllI[llIIlllll[38]];
                if (lIlIllllIllI(Inventory.getCount(strArr3))) {
                    String[] strArr4 = new String[llIIlllll[1]];
                    strArr4[llIIlllll[0]] = llIIllllI[llIIlllll[39]];
                    if (lIlIllllIllI(Inventory.getCount(strArr4))) {
                        ?? r0 = llIIlllll[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return llIIlllll[0];
    }

    private static boolean lIlIllllIllI(int i) {
        return i > 0;
    }

    private static String lIlIlllIllIl(String lIIllllIIlIlIl, String lIIllllIIlIllI) {
        try {
            SecretKeySpec lIIllllIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllll[3], lIIllllIIllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIllllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllllIIllIII) {
            lIIllllIIllIII.printStackTrace();
            return null;
        }
    }

    private static int lIlIllllIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIlIllllIlIl(int i) {
        return i < 0;
    }

    private static boolean lIlIllllIlll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIIlllll[0];
    }

    private static boolean lIlIllllIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llIIlllll[1]];
        strArr[llIIlllll[0]] = llIIllllI[llIIlllll[40]];
        if (lIlIllllIllI(Inventory.getCount(strArr))) {
            String[] strArr2 = new String[llIIlllll[1]];
            strArr2[llIIlllll[0]] = llIIllllI[llIIlllll[41]];
            if (lIlIllllIllI(Inventory.getCount(strArr2))) {
                String[] strArr3 = new String[llIIlllll[1]];
                strArr3[llIIlllll[0]] = llIIllllI[llIIlllll[42]];
                if (lIlIllllIllI(Inventory.getCount(strArr3))) {
                    String[] strArr4 = new String[llIIlllll[1]];
                    strArr4[llIIlllll[0]] = llIIllllI[llIIlllll[43]];
                    if (lIlIllllIllI(Inventory.getCount(strArr4))) {
                        ?? r0 = llIIlllll[1];
                        "".length();
                        return "  ".length() <= (((1 ^ 110) ^ (97 ^ 81)) & (((198 ^ 165) ^ (23 ^ 43)) ^ (-" ".length()))) ? ((((197 + 107) - 115) + 20) ^ (((83 + 61) - 77) + 82)) & (((86 ^ 125) ^ (252 ^ 147)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return llIIlllll[0];
    }

    private static String lIlIlllIllII(String lIIllllIIIIlll, String lIIllllIIIIIIl) {
        String str = new String(Base64.getDecoder().decode(lIIllllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllllIIIIlIl = new StringBuilder();
        char[] lIIllllIIIIlII = lIIllllIIIIIIl.toCharArray();
        int lIIllllIIIIIll = llIIlllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIlllll[0];
        while (lIlIllllIIll(i, length)) {
            lIIllllIIIIlIl.append((char) (charArray[i] ^ lIIllllIIIIlII[lIIllllIIIIIll % lIIllllIIIIlII.length]));
            "".length();
            lIIllllIIIIIll++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lIIllllIIIIlIl);
    }

    private static boolean lIlIlllllIll(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIlllIlllI(String lIIllllIlIIlII, String lIIllllIlIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllIlIIIll.getBytes(StandardCharsets.UTF_8)), llIIlllll[19]), "DES");
            Cipher lIIllllIlIIllI = Cipher.getInstance("DES");
            lIIllllIlIIllI.init(llIIlllll[3], secretKeySpec);
            return new String(lIIllllIlIIllI.doFinal(Base64.getDecoder().decode(lIIllllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllllIlIIlIl) {
            lIIllllIlIIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010d, code lost:
        if (lIlIllllIllI(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v308, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bh() {
        if (lIlIllllIIlI(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIIllllI[llIIlllll[0]];
            C0001b.a(bx);
            if (lIlIllllIIll(bx.size(), llIIlllll[1])) {
                System.out.println(llIIllllI[llIIlllll[1]]);
                bv = llIIlllll[0];
            }
        }
        if (lIlIllllIlII(bv ? 1 : 0)) {
            if (lIlIllllIIlI(Inventory.contains(C0005f.bc) ? 1 : 0) && lIlIllllIIll(Movement.getRunEnergy(), llIIlllll[2])) {
                Inventory.getFirst(C0005f.bc).interact(llIIllllI[llIIlllll[3]]);
                Time.sleepTicks(llIIlllll[1]);
                "".length();
            }
            if (lIlIllllIlIl(lIlIllllIIIl(C0004e.w(), 70.0d))) {
                int[] iArr = new int[llIIlllll[1]];
                iArr[llIIlllll[0]] = llIIlllll[4];
                if (lIlIllllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIlllll[1]];
                    iArr2[llIIlllll[0]] = llIIlllll[4];
                    Inventory.getFirst(iArr2).interact(llIIllllI[llIIlllll[5]]);
                }
            }
            if (lIlIllllIlII(Movement.isRunEnabled() ? 1 : 0) && lIlIllllIllI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIllllIIlI(an() ? 1 : 0)) {
                int[] iArr3 = new int[llIIlllll[1]];
                iArr3[llIIlllll[0]] = llIIlllll[6];
            }
            if (lIlIllllIIll(C0004e.j(llIIlllll[7]), llIIlllll[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIllllIlll(nearest) && lIlIllllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[8]];
                    C0000a.a(nearest);
                    Time.sleepTicks(llIIlllll[3]);
                    "".length();
                }
                if (lIlIllllIlll(nearest) && lIlIllllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[9]];
                    if (lIlIllllIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlllll[10]);
                        "".length();
                    }
                    if (lIlIllllIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIllllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlllll[8]);
                            "".length();
                        }
                        if (lIlIllllIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIlllll[3]);
                            "".length();
                        }
                        int[] iArr4 = new int[llIIlllll[9]];
                        iArr4[llIIlllll[0]] = llIIlllll[11];
                        iArr4[llIIlllll[1]] = llIIlllll[12];
                        iArr4[llIIlllll[3]] = llIIlllll[13];
                        iArr4[llIIlllll[5]] = llIIlllll[14];
                        iArr4[llIIlllll[8]] = llIIlllll[4];
                        if (lIlIllllIlII(C0004e.d(iArr4) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIllllI[llIIlllll[15]]);
                            bv = llIIlllll[1];
                            return;
                        }
                        int[] iArr5 = new int[llIIlllll[9]];
                        iArr5[llIIlllll[0]] = llIIlllll[11];
                        iArr5[llIIlllll[1]] = llIIlllll[12];
                        iArr5[llIIlllll[3]] = llIIlllll[13];
                        iArr5[llIIlllll[5]] = llIIlllll[14];
                        iArr5[llIIlllll[8]] = llIIlllll[4];
                        if (lIlIllllIIlI(C0004e.d(iArr5) ? 1 : 0)) {
                            Bank.withdraw(llIIlllll[11], llIIlllll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIIlllll[1]);
                            "".length();
                            Bank.withdraw(llIIlllll[12], llIIlllll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIIlllll[1]);
                            "".length();
                            Bank.withdraw(llIIlllll[13], llIIlllll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIIlllll[1]);
                            "".length();
                            Bank.withdraw(llIIlllll[14], llIIlllll[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIIlllll[1]);
                            "".length();
                            C0000a.a(llIIlllll[16], llIIlllll[9]);
                            C0000a.b(C0005f.bc, llIIlllll[9]);
                            C0000a.a(llIIlllll[4], llIIlllll[17]);
                            C0000a.b(C0005f.bm, llIIlllll[1]);
                        }
                    }
                }
            }
            if (lIlIllllIIlI(an() ? 1 : 0) && lIlIllllIIll(C0004e.j(llIIlllll[7]), llIIlllll[1])) {
                if (lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[18]];
                    if (lIlIllllIIll(cI, llIIlllll[1])) {
                        C0004e.x();
                        cI += llIIlllll[1];
                    }
                    Movement.walkTo(dM);
                    "".length();
                    Time.sleepTicks(llIIlllll[1]);
                    "".length();
                }
                if (lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[19]];
                    C0006g.a(llIIllllI[llIIlllll[20]], cG);
                }
            }
            if (lIlIlllllIlI(C0004e.j(llIIlllll[7]), llIIlllll[1])) {
                dk = llIIlllll[0];
                if (lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[17]];
                    Movement.walkTo(dN);
                    "".length();
                    Time.sleepTicks(llIIlllll[1]);
                    "".length();
                }
                if (lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[21]];
                    C0006g.a(llIIllllI[llIIlllll[22]], cG);
                }
            }
            if (lIlIlllllIlI(C0004e.j(llIIlllll[7]), llIIlllll[3]) && lIlIllllIlII(bi() ? 1 : 0)) {
                if (lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dO), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[23]];
                    Movement.walkTo(dO);
                    "".length();
                    Time.sleepTicks(llIIlllll[1]);
                    "".length();
                }
                if (lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dO), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[24]];
                    int[] iArr6 = new int[llIIlllll[1]];
                    iArr6[llIIlllll[0]] = llIIlllll[25];
                    TileObject nearest2 = TileObjects.getNearest(iArr6);
                    if (lIlIllllIlll(nearest2)) {
                        String[] strArr = new String[llIIlllll[1]];
                        strArr[llIIlllll[0]] = llIIllllI[llIIlllll[26]];
                        Item first = Inventory.getFirst(strArr);
                        String[] strArr2 = new String[llIIlllll[1]];
                        strArr2[llIIlllll[0]] = llIIllllI[llIIlllll[27]];
                        Item first2 = Inventory.getFirst(strArr2);
                        String[] strArr3 = new String[llIIlllll[1]];
                        strArr3[llIIlllll[0]] = llIIllllI[llIIlllll[28]];
                        Item first3 = Inventory.getFirst(strArr3);
                        String[] strArr4 = new String[llIIlllll[1]];
                        strArr4[llIIlllll[0]] = llIIllllI[llIIlllll[29]];
                        Item first4 = Inventory.getFirst(strArr4);
                        if (lIlIllllIlll(first)) {
                            first.useOn(nearest2);
                            Time.sleepTicks(llIIlllll[1]);
                            "".length();
                        }
                        if (lIlIllllIlll(first2)) {
                            first2.useOn(nearest2);
                            Time.sleepTicks(llIIlllll[1]);
                            "".length();
                        }
                        if (lIlIllllIlll(first3)) {
                            first3.useOn(nearest2);
                            Time.sleepTicks(llIIlllll[1]);
                            "".length();
                        }
                        if (lIlIllllIlll(first4)) {
                            first4.useOn(nearest2);
                            Time.sleepTicks(llIIlllll[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIlllllIlI(C0004e.j(llIIlllll[7]), llIIlllll[3]) && lIlIllllIIlI(bi() ? 1 : 0)) {
                if (lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[30]];
                    Movement.walkTo(dN);
                    "".length();
                    Time.sleepTicks(llIIlllll[1]);
                    "".length();
                }
                if (lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dN), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[31]];
                    C0006g.a(llIIllllI[llIIlllll[32]], cG);
                }
            }
            if (lIlIlllllIlI(C0004e.j(llIIlllll[7]), llIIlllll[5])) {
                if (lIlIlllllIII(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[33]];
                    Movement.walkTo(dM);
                    "".length();
                    Time.sleepTicks(llIIlllll[1]);
                    "".length();
                }
                if (lIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlllll[5])) {
                    AccBuilderGWD.c = llIIllllI[llIIlllll[34]];
                    if (lIlIllllIIll(dk, llIIlllll[1])) {
                        as.mS += llIIlllll[1];
                        as.u(AccBuilderGWD.m);
                        dk += llIIlllll[1];
                        as.mS = llIIlllll[0];
                    }
                    C0006g.a(llIIllllI[llIIlllll[35]], cG);
                }
            }
            C0006g.a(cG);
        }
    }

    static {
        lIlIllllIIII();
        lIlIlllIllll();
        dM = new WorldPoint(llIIlllll[54], llIIlllll[55], llIIlllll[0]);
        dN = new WorldPoint(llIIlllll[56], llIIlllll[57], llIIlllll[1]);
        dO = new WorldPoint(llIIlllll[58], llIIlllll[59], llIIlllll[0]);
        bx = new ArrayList();
        cI = llIIlllll[0];
        String[] strArr = new String[llIIlllll[9]];
        strArr[llIIlllll[0]] = llIIllllI[llIIlllll[60]];
        strArr[llIIlllll[1]] = llIIllllI[llIIlllll[61]];
        strArr[llIIlllll[3]] = llIIllllI[llIIlllll[62]];
        strArr[llIIlllll[5]] = llIIllllI[llIIlllll[63]];
        strArr[llIIlllll[8]] = llIIllllI[llIIlllll[64]];
        cG = strArr;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIIllllI[llIIlllll[52]];
    }

    private static void lIlIlllIllll() {
        llIIllllI = new String[llIIlllll[49]];
        llIIllllI[llIIlllll[0]] = lIlIlllIllII("FhoVBQkzTwUYAjkc", "Tollg");
        llIIllllI[llIIlllll[1]] = lIlIlllIllIl("o7bjILFUfzJMEn2Cjt2A1iybKSecDQYxcKMgqKRU79TW5DV7/tITughZFVevRNPO", "TJuzB");
        llIIllllI[llIIlllll[3]] = lIlIlllIllIl("460ecxkI31k=", "gEaOK");
        llIIllllI[llIIlllll[5]] = lIlIlllIlllI("D1nW9Pn6kOY=", "fcFcx");
        llIIllllI[llIIlllll[8]] = lIlIlllIlllI("XgdOItJToSrmCxeqiDxkSA==", "QeQoR");
        llIIllllI[llIIlllll[9]] = lIlIlllIllIl("hxkoz0ktqSsVFFi+gXUpFdrEh0egzu1X", "OjMvy");
        llIIllllI[llIIlllll[15]] = lIlIlllIllII("IQFEOxETRAkzEAUNCj1DBxEBKRdWFxEqExoNASlPVhcTMxcVDA00BFYQC3ohIz0tFCQ=", "vddZc");
        llIIllllI[llIIlllll[18]] = lIlIlllIllIl("ZANpeeXxuu46nj94271G2A==", "RIiRe");
        llIIllllI[llIIlllll[19]] = lIlIlllIllIl("22ONn2dIATk3XLi8meY2Dw==", "VGTya");
        llIIllllI[llIIlllll[20]] = lIlIlllIllIl("4n3QQX2s1qcGTCbTu2FgrA==", "ztwZz");
        llIIllllI[llIIlllll[17]] = lIlIlllIlllI("PoDL8Vzyb8uJJJbcB3JI5w==", "WAiNq");
        llIIllllI[llIIlllll[21]] = lIlIlllIllII("IAY5A2cHBjsOIgM=", "tgUhG");
        llIIllllI[llIIlllll[22]] = lIlIlllIlllI("jqF9MEm3YXA=", "Iniuv");
        llIIllllI[llIIlllll[23]] = lIlIlllIlllI("tQ6iHAH7yOZDnatnbeORjw==", "EPclV");
        llIIllllI[llIIlllll[24]] = lIlIlllIllII("NSMSEgYeORgUAA==", "pMqzg");
        llIIllllI[llIIlllll[26]] = lIlIlllIllIl("Naip5Vn1soEsWQm2ZxN48Q==", "RhJto");
        llIIllllI[llIIlllll[27]] = lIlIlllIllII("JQghTCsWHXYBPBYd", "wiVlY");
        llIIllllI[llIIlllll[28]] = lIlIlllIllII("FAkuYxMuATooFSg=", "FhYCp");
        llIIllllI[llIIlllll[29]] = lIlIlllIllIl("jiiAB/qq+5uR3AiX6fkQMw==", "fcmbN");
        llIIllllI[llIIlllll[30]] = lIlIlllIllIl("jWvknBRlUrkfT4MKZezXfw==", "gInxA");
        llIIllllI[llIIlllll[31]] = lIlIlllIllII("EjsEIEw1OwYtCTE=", "FZhKl");
        llIIllllI[llIIlllll[32]] = lIlIlllIllII("Gg4hMgo+", "IoOTo");
        llIIllllI[llIIlllll[33]] = lIlIlllIlllI("eR0Y1pPx8tf7n3wnQt6p+g==", "HhQCe");
        llIIllllI[llIIlllll[34]] = lIlIlllIlllI("LmZPUC8neBBGdQlaowNAbQ==", "FeInO");
        llIIllllI[llIIlllll[35]] = lIlIlllIlllI("gs/FCfgD7DZt+XjezHUMiw==", "aMCtJ");
        llIIllllI[llIIlllll[36]] = lIlIlllIllII("BwswORksETY1WCAAMiM=", "BeSQx");
        llIIllllI[llIIlllll[37]] = lIlIlllIllIl("QN2YrAHM3lzzvibgV0Go3bwrf/pa//lt", "QBCLi");
        llIIllllI[llIIlllll[38]] = lIlIlllIllII("BCotMQwvMCs9TTMlOg==", "ADNYm");
        llIIllllI[llIIlllll[39]] = lIlIlllIllII("IwkuHywIEygTbQQCKBE=", "fgMwM");
        llIIllllI[llIIlllll[40]] = lIlIlllIlllI("uRXrDMqA7JByoeG/oIz5Vg==", "nvohC");
        llIIllllI[llIIlllll[41]] = lIlIlllIllIl("tuZpshfvIb6z9Ve5tKsIkg==", "CFrvH");
        llIIllllI[llIIlllll[42]] = lIlIlllIllII("JggUUSYRCBFRKREIFw==", "ticqD");
        llIIllllI[llIIlllll[43]] = lIlIlllIllII("ECYucwIjM3k+FSMz", "BGYSp");
        llIIllllI[llIIlllll[52]] = lIlIlllIlllI("kMwoaucKEwSVcoqA8yp1iXgmJ2+I+pfo", "CYHua");
        llIIllllI[llIIlllll[53]] = lIlIlllIllII("JjAMP2c7P0IvIjU1FjBnfA==", "TYbXG");
        llIIllllI[llIIlllll[60]] = lIlIlllIllII("HEIuUgM7RTAXCycGK1IFM0UiUhsgADAGRA==", "UeCrj");
        llIIllllI[llIIlllll[61]] = lIlIlllIllII("IB0EKlZPP0UkEwMaRScIFlYEPR5PHgA/CkE=", "oveSz");
        llIIllllI[llIIlllll[62]] = lIlIlllIllIl("P52xmBxIQoM=", "AhdgH");
        llIIllllI[llIIlllll[63]] = lIlIlllIllIl("cn/WvuFBKTifr3n9dyQ4593UMRu3WDO1LXzdqC4WzZFwW+0BQoOWmNi00HEb1iovomK1tHHgcM0=", "cNvLM");
        llIIllllI[llIIlllll[64]] = lIlIlllIllII("LTJFbgtFNQVuJg15HSYjFnkdJicMdw==", "bYiNB");
    }

    private static boolean lIlIlllllIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIlllllIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIlIllllIIII() {
        llIIlllll = new int[65];
        llIIlllll[0] = ((((58 + 115) - 101) + 85) ^ (((4 + 180) - 117) + 115)) & (((((26 + 54) - (-51)) + 21) ^ (((44 + 29) - 8) + 114)) ^ (-" ".length()));
        llIIlllll[1] = " ".length();
        llIIlllll[2] = (164 ^ 195) ^ (72 ^ 29);
        llIIlllll[3] = "  ".length();
        llIIlllll[4] = (-29317) & 29695;
        llIIlllll[5] = "   ".length();
        llIIlllll[6] = (-((-16867) & 21999)) & (-24577) & 30703;
        llIIlllll[7] = (((130 + 192) - 167) + 42) ^ (((101 + 41) - 78) + 85);
        llIIlllll[8] = 116 ^ 112;
        llIIlllll[9] = 90 ^ 95;
        llIIlllll[10] = (-((-7981) & 32574)) & (-3075) & 32667;
        llIIlllll[11] = (-((-7061) & 8118)) & (-4609) & 7803;
        llIIlllll[12] = (-24609) & 26740;
        llIIlllll[13] = (-((-18641) & 32247)) & (-17026) & 32767;
        llIIlllll[14] = (-((-26705) & 32122)) & (-8705) & 16255;
        llIIlllll[15] = (((147 + 139) - 194) + 79) ^ (((170 + 170) - 214) + 47);
        llIIlllll[16] = (-((-7745) & 24279)) & (-8225) & 32767;
        llIIlllll[17] = 40 ^ 34;
        llIIlllll[18] = (((147 + 80) - 215) + 161) ^ (((108 + 128) - 67) + 1);
        llIIlllll[19] = 160 ^ 168;
        llIIlllll[20] = (((91 + 129) - 152) + 86) ^ (((129 + 75) - 89) + 32);
        llIIlllll[21] = (21 ^ 81) ^ (65 ^ 14);
        llIIlllll[22] = 50 ^ 62;
        llIIlllll[23] = (231 ^ 150) ^ (232 ^ 148);
        llIIlllll[24] = (((4 + 21) - 9) + 153) ^ (((106 + 11) - 115) + 165);
        llIIlllll[25] = (-17442) & 19583;
        llIIlllll[26] = (179 ^ 169) ^ (149 ^ 128);
        llIIlllll[27] = (((121 + 121) - 161) + 82) ^ (((157 + 22) - 176) + 176);
        llIIlllll[28] = (((9 + 3) - (-32)) + 139) ^ (((54 + 33) - 31) + 110);
        llIIlllll[29] = (((119 + 116) - 112) + 13) ^ (((67 + 123) - 71) + 35);
        llIIlllll[30] = (((37 + 59) - 94) + 144) ^ (((12 + 113) - 84) + 88);
        llIIlllll[31] = (5 ^ 108) ^ (116 ^ 9);
        llIIlllll[32] = 87 ^ 66;
        llIIlllll[33] = (92 ^ 112) ^ (174 ^ 148);
        llIIlllll[34] = 7 ^ 16;
        llIIlllll[35] = 16 ^ 8;
        llIIlllll[36] = 44 ^ 53;
        llIIlllll[37] = 71 ^ 93;
        llIIlllll[38] = (((52 + 140) - 109) + 68) ^ (((21 + 34) - 37) + 122);
        llIIlllll[39] = (181 ^ 135) ^ (28 ^ 50);
        llIIlllll[40] = 162 ^ 191;
        llIIlllll[41] = 104 ^ 118;
        llIIlllll[42] = (234 ^ 191) ^ (102 ^ 44);
        llIIlllll[43] = 62 ^ 30;
        llIIlllll[44] = (-18061) & 30685;
        llIIlllll[45] = (-((-8489) & 26923)) & (-34) & 24367;
        llIIlllll[46] = (-((-1234) & 17907)) & (-4115) & 32767;
        llIIlllll[47] = (-2568) & 27567;
        llIIlllll[48] = (-8233) & 16239;
        llIIlllll[49] = 84 ^ 124;
        llIIlllll[50] = (-((-837) & 16238)) & (-19) & 16319;
        llIIlllll[51] = 53 ^ 81;
        llIIlllll[52] = 6 ^ 39;
        llIIlllll[53] = (((118 + 140) - 195) + 105) ^ (((79 + 94) - 56) + 21);
        llIIlllll[54] = (-12433) & 15359;
        llIIlllll[55] = (-((-25909) & 30581)) & (-1) & 8156;
        llIIlllll[56] = (-37) & 2934;
        llIIlllll[57] = (-665) & 4091;
        llIIlllll[58] = (-((-13313) & 29859)) & (-12306) & 31743;
        llIIlllll[59] = (-4353) & 14183;
        llIIlllll[60] = 56 ^ 27;
        llIIlllll[61] = 112 ^ 84;
        llIIlllll[62] = (((1 + 29) - (-48)) + 150) ^ (((52 + 94) - 79) + 126);
        llIIlllll[63] = (189 ^ 139) ^ (36 ^ 52);
        llIIlllll[64] = 25 ^ 62;
    }

    private static boolean lIlIllllIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIlIlllllIll(C0004e.j(llIIlllll[7]), llIIlllll[8])) {
            ?? r0 = llIIlllll[1];
            "".length();
            return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlllll[0];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bh();
            "".length();
            if ((-" ".length()) >= (150 ^ 146)) {
                return "  ".length() & ("  ".length() ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIlllll[51];
    }

    private static void Q() {
        int[] iArr = new int[llIIlllll[1]];
        iArr[llIIlllll[0]] = llIIlllll[44];
        if (lIlIllllIlII(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllll[44], llIIlllll[9], C0009j.ch));
            "".length();
        }
        int[] iArr2 = new int[llIIlllll[1]];
        iArr2[llIIlllll[0]] = llIIlllll[11];
        if (lIlIllllIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllll[11], llIIlllll[1], llIIlllll[45]));
            "".length();
        }
        int[] iArr3 = new int[llIIlllll[1]];
        iArr3[llIIlllll[0]] = llIIlllll[12];
        if (lIlIllllIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllll[12], llIIlllll[1], llIIlllll[45]));
            "".length();
        }
        int[] iArr4 = new int[llIIlllll[1]];
        iArr4[llIIlllll[0]] = llIIlllll[14];
        if (lIlIllllIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllll[14], llIIlllll[1], llIIlllll[45]));
            "".length();
        }
        int[] iArr5 = new int[llIIlllll[1]];
        iArr5[llIIlllll[0]] = llIIlllll[13];
        if (lIlIllllIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllll[13], llIIlllll[1], llIIlllll[45]));
            "".length();
        }
        int[] iArr6 = new int[llIIlllll[1]];
        iArr6[llIIlllll[0]] = llIIlllll[4];
        if (lIlIllllIlII(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllll[4], llIIlllll[17], llIIlllll[45]));
            "".length();
        }
        if (lIlIllllIlII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIllllI[llIIlllll[53]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllll[46], llIIlllll[9], llIIlllll[47]));
            "".length();
        }
        int[] iArr7 = new int[llIIlllll[1]];
        iArr7[llIIlllll[0]] = llIIlllll[48];
        if (lIlIllllIlII(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(llIIlllll[48], llIIlllll[49], llIIlllll[50]));
            "".length();
        }
    }

    private static boolean lIlIlllllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllllIIlI(int i) {
        return i != 0;
    }
}
