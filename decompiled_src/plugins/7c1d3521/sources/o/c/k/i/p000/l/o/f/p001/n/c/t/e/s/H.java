package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.H  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/H.class */
public class H implements InterfaceC0003ac {
    static /* synthetic */ ArrayList<Integer> gb;
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ WorldPoint fW;
    public static final /* synthetic */ WorldPoint fT;
    public static final /* synthetic */ WorldPoint fY;
    static /* synthetic */ String[] cE;
    public static final /* synthetic */ WorldPoint fV;
    public static final /* synthetic */ WorldPoint fS;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint fU;
    public static final /* synthetic */ WorldPoint fX;
    private static /* synthetic */ String[] llIllllIll;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int fJ;
    public static final /* synthetic */ WorldPoint fZ;
    public static /* synthetic */ int fK;
    private static /* synthetic */ int[] llIlllllII;
    public static /* synthetic */ boolean ga;
    static /* synthetic */ boolean dj;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlllIllllIll(C0018e.j(fJ), llIlllllII[72]) && lIlllIllllIll(C0018e.j(fK), llIlllllII[3])) {
            ?? r0 = llIlllllII[0];
            "".length();
            return (" ".length() & (" ".length() ^ (-" ".length()))) >= "  ".length() ? ((((76 + 164) - 84) + 11) ^ (((125 + 87) - 122) + 72)) & (((129 ^ 197) ^ (47 ^ 110)) ^ (-" ".length())) : r0;
        }
        return llIlllllII[1];
    }

    private static void bN() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlllIlllIlIl(nearest) && lIlllIlllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIll[llIlllllII[138]];
            C0000a.a(nearest);
        }
        if (lIlllIlllIlIl(nearest) && lIlllIlllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlllIlllIIll(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIlllllII[4]);
                "".length();
            }
            if (lIlllIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIll[llIlllllII[139]];
                if (lIlllIlllIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIlllllII[6]);
                    "".length();
                }
                C0000a.a(llIlllllII[7], llIlllllII[13]);
                C0000a.a(llIlllllII[8], llIlllllII[0]);
                C0000a.a(llIlllllII[11], llIlllllII[0]);
                C0000a.a(llIlllllII[12], llIlllllII[3]);
                C0000a.a(llIlllllII[9], llIlllllII[41]);
            }
        }
    }

    private static String lIlllIllIllII(String lllllllllllllllllIlllllllIllIIll, String lllllllllllllllllIlllllllIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllllllIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllllII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllllllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllllllIllIlII) {
            lllllllllllllllllIlllllllIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllllIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlllllII[1];
    }

    private static int lIlllIlllIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void bM() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlllIlllIlIl(nearest) && lIlllIlllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIll[llIlllllII[136]];
            C0000a.a(nearest);
        }
        if (lIlllIlllIlIl(nearest) && lIlllIlllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlllIlllIIll(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIlllllII[4]);
                "".length();
            }
            if (lIlllIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIll[llIlllllII[137]];
                if (lIlllIlllIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIlllllII[6]);
                    "".length();
                }
                C0000a.a(llIlllllII[7], llIlllllII[13]);
                C0000a.a(llIlllllII[11], llIlllllII[0]);
                C0000a.a(llIlllllII[9], llIlllllII[41]);
            }
        }
    }

    private static boolean lIlllIlllIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0172, code lost:
        if (lIlllIlllIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.H.llIlllllII[15]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2 = new int[llIlllllII[0]];
        iArr2[llIlllllII[1]] = llIlllllII[14];
        if (lIlllIlllIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllII[14], llIlllllII[0], llIlllllII[142]));
            "".length();
        }
        int[] iArr3 = new int[llIlllllII[0]];
        iArr3[llIlllllII[1]] = llIlllllII[8];
        if (lIlllIlllIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllII[8], llIlllllII[0], llIlllllII[142]));
            "".length();
        }
        int[] iArr4 = new int[llIlllllII[0]];
        iArr4[llIlllllII[1]] = llIlllllII[11];
        if (lIlllIlllIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllII[11], llIlllllII[3], C0023j.cf));
            "".length();
        }
        int[] iArr5 = new int[llIlllllII[0]];
        iArr5[llIlllllII[1]] = llIlllllII[12];
        if (lIlllIlllIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlllllII[12], llIlllllII[41], llIlllllII[143]));
            "".length();
        }
        int[] iArr6 = new int[llIlllllII[0]];
        iArr6[llIlllllII[1]] = llIlllllII[9];
        if (lIlllIlllIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[llIlllllII[0]];
            iArr7[llIlllllII[1]] = llIlllllII[9];
            if (lIlllIlllIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIlllllII[0]];
                iArr8[llIlllllII[1]] = llIlllllII[9];
            }
            if (lIlllIlllIIll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIllllIll[llIlllllII[148]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(llIlllllII[144], llIlllllII[3], llIlllllII[145]));
                "".length();
            }
            iArr = new int[llIlllllII[0]];
            iArr[llIlllllII[1]] = llIlllllII[7];
            if (lIlllIlllIIll(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bv.add(new C0017d(llIlllllII[7], llIlllllII[51], llIlllllII[146]));
            "".length();
            return;
        }
        bv.add(new C0017d(llIlllllII[9], llIlllllII[15], llIlllllII[107]));
        "".length();
        if (lIlllIlllIIll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIllllIll[llIlllllII[148]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[llIlllllII[0]];
        iArr[llIlllllII[1]] = llIlllllII[7];
        if (lIlllIlllIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static boolean lIlllIllllIII(int i, int i2) {
        return i > i2;
    }

    static {
        lIlllIllIllll();
        lIlllIllIlllI();
        fS = new WorldPoint(llIlllllII[149], llIlllllII[150], llIlllllII[1]);
        fT = new WorldPoint(llIlllllII[151], llIlllllII[152], llIlllllII[1]);
        fU = new WorldPoint(llIlllllII[25], llIlllllII[153], llIlllllII[1]);
        fV = new WorldPoint(llIlllllII[154], llIlllllII[155], llIlllllII[1]);
        fW = new WorldPoint(llIlllllII[156], llIlllllII[152], llIlllllII[5]);
        fX = new WorldPoint(llIlllllII[157], llIlllllII[158], llIlllllII[1]);
        fY = new WorldPoint(llIlllllII[159], llIlllllII[160], llIlllllII[1]);
        fZ = new WorldPoint(llIlllllII[161], llIlllllII[162], llIlllllII[1]);
        bv = new ArrayList();
        fJ = llIlllllII[163];
        fK = llIlllllII[164];
        String[] strArr = new String[llIlllllII[31]];
        strArr[llIlllllII[1]] = llIllllIll[llIlllllII[165]];
        strArr[llIlllllII[0]] = llIllllIll[llIlllllII[166]];
        strArr[llIlllllII[5]] = llIllllIll[llIlllllII[167]];
        strArr[llIlllllII[10]] = llIllllIll[llIlllllII[168]];
        strArr[llIlllllII[6]] = llIllllIll[llIlllllII[169]];
        strArr[llIlllllII[3]] = llIllllIll[llIlllllII[170]];
        strArr[llIlllllII[16]] = llIllllIll[llIlllllII[171]];
        strArr[llIlllllII[17]] = llIllllIll[llIlllllII[172]];
        strArr[llIlllllII[18]] = llIllllIll[llIlllllII[173]];
        strArr[llIlllllII[19]] = llIllllIll[llIlllllII[174]];
        strArr[llIlllllII[13]] = llIllllIll[llIlllllII[175]];
        strArr[llIlllllII[20]] = llIllllIll[llIlllllII[176]];
        strArr[llIlllllII[21]] = llIllllIll[llIlllllII[177]];
        strArr[llIlllllII[22]] = llIllllIll[llIlllllII[178]];
        strArr[llIlllllII[23]] = llIllllIll[llIlllllII[179]];
        strArr[llIlllllII[24]] = llIllllIll[llIlllllII[180]];
        strArr[llIlllllII[27]] = llIllllIll[llIlllllII[181]];
        strArr[llIlllllII[28]] = llIllllIll[llIlllllII[182]];
        strArr[llIlllllII[29]] = llIllllIll[llIlllllII[183]];
        strArr[llIlllllII[30]] = llIllllIll[llIlllllII[184]];
        cE = strArr;
        gb = new ArrayList<>();
    }

    private static boolean lIlllIlllIIll(int i) {
        return i == 0;
    }

    private static boolean lIlllIlllIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllIllllIIl(int i, int i2) {
        return i <= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            cf();
            "".length();
            if ("   ".length() < 0) {
                return ((((198 + 195) - 231) + 51) ^ (((127 + 100) - 181) + 92)) & (((223 ^ 131) ^ "   ".length()) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlllllII[117];
    }

    private static String lIlllIllIllIl(String lllllllllllllllllIlllllllIIIlllI, String lllllllllllllllllIlllllllIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllllllIIIllIl.getBytes(StandardCharsets.UTF_8)), llIlllllII[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlllllII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllllllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllllllIIIlIlI) {
            lllllllllllllllllIlllllllIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static void ch() {
        if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
            AccBuilderSotf.c = llIllllIll[llIlllllII[131]];
            WorldArea worldArea = new WorldArea(llIlllllII[93], llIlllllII[94], llIlllllII[60], llIlllllII[43], llIlllllII[1]);
            if (lIlllIlllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(llIlllllII[95], llIlllllII[96], llIlllllII[48], llIlllllII[63], llIlllllII[1]);
                if (lIlllIlllIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                    "".length();
                    Time.sleepTicks(llIlllllII[0]);
                    "".length();
                }
                if (lIlllIlllIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                        Movement.walkTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                        "".length();
                        Time.sleepTicks(llIlllllII[0]);
                        "".length();
                    }
                    if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                        String[] strArr = new String[llIlllllII[0]];
                        strArr[llIlllllII[1]] = llIllllIll[llIlllllII[2]];
                        TileObject nearest = TileObjects.getNearest(strArr);
                        if (lIlllIlllIlIl(nearest)) {
                            String[] strArr2 = new String[llIlllllII[0]];
                            strArr2[llIlllllII[1]] = llIllllIll[llIlllllII[132]];
                            if (lIlllIlllIIIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(llIllllIll[llIlllllII[133]]);
                                Time.sleepTicks(llIlllllII[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[llIlllllII[0]];
                            strArr3[llIlllllII[1]] = llIllllIll[llIlllllII[134]];
                            if (lIlllIlllIIIl(nearest.hasAction(strArr3) ? 1 : 0)) {
                                nearest.interact(llIllllIll[llIlllllII[135]]);
                                Time.sleepTicks(llIlllllII[10]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIlllIlllIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(fZ);
                "".length();
                Time.sleepTicks(llIlllllII[0]);
                "".length();
            }
        }
    }

    private static boolean lIlllIllllIlI(Object obj) {
        return obj == null;
    }

    private static String lIlllIllIlIll(String lllllllllllllllllIlllllllIlIIIll, String lllllllllllllllllIlllllllIlIIIlI) {
        String lllllllllllllllllIlllllllIlIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlllllllIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlllllllIlIIIlI.toCharArray();
        int lllllllllllllllllIlllllllIIlllll = llIlllllII[1];
        char[] charArray2 = lllllllllllllllllIlllllllIlIIIll2.toCharArray();
        int length = charArray2.length;
        int i = llIlllllII[1];
        while (lIlllIlllIIlI(i, length)) {
            char lllllllllllllllllIlllllllIlIIlII = charArray2[i];
            sb.append((char) (lllllllllllllllllIlllllllIlIIlII ^ charArray[lllllllllllllllllIlllllllIIlllll % charArray.length]));
            "".length();
            lllllllllllllllllIlllllllIIlllll++;
            i++;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llIlllllII[0]];
        strArr[llIlllllII[1]] = llIllllIll[llIlllllII[141]];
        if (lIlllIlllIllI(Inventory.getCount(strArr))) {
            int[] iArr = new int[llIlllllII[0]];
            iArr[llIlllllII[1]] = llIlllllII[12];
            if (lIlllIlllIllI(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[llIlllllII[0]];
                iArr2[llIlllllII[1]] = llIlllllII[7];
                if (lIlllIlllIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIlllllII[0]];
                    iArr3[llIlllllII[1]] = llIlllllII[9];
                    if (lIlllIlllIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = llIlllllII[0];
                        "".length();
                        return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return llIlllllII[1];
    }

    private static boolean lIlllIlllIlII(int i, int i2) {
        return i == i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIllllIll[llIlllllII[147]];
    }

    private static boolean lIlllIlllIIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v563, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v797, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v819, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void cf() {
        if (lIlllIlllIIIl(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIlllIlllIIlI(bv.size(), llIlllllII[0])) {
                System.out.println(llIllllIll[llIlllllII[1]]);
                bt = llIlllllII[1];
            }
        }
        if (lIlllIlllIIll(bt ? 1 : 0)) {
            if (lIlllIlllIIlI(C0018e.j(llIlllllII[2]), llIlllllII[3])) {
                Y.eq();
            }
            if (lIlllIlllIIll(ci() ? 1 : 0) && lIlllIlllIIlI(C0018e.j(fJ), llIlllllII[0]) && lIlllIlllIlII(C0018e.j(llIlllllII[2]), llIlllllII[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlllIlllIlIl(nearest) && lIlllIlllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[0]];
                    C0000a.a(nearest);
                }
                if (lIlllIlllIlIl(nearest) && lIlllIlllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlllIlllIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlllllII[4]);
                        "".length();
                    }
                    if (lIlllIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[5]];
                        if (lIlllIlllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlllllII[6]);
                            "".length();
                        }
                        if (lIlllIlllIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlllllII[5]);
                            "".length();
                        }
                        int[] iArr = new int[llIlllllII[3]];
                        iArr[llIlllllII[1]] = llIlllllII[7];
                        iArr[llIlllllII[0]] = llIlllllII[8];
                        iArr[llIlllllII[5]] = llIlllllII[9];
                        iArr[llIlllllII[10]] = llIlllllII[11];
                        iArr[llIlllllII[6]] = llIlllllII[12];
                        if (lIlllIlllIIll(C0018e.c(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llIllllIll[llIlllllII[10]]);
                            bt = llIlllllII[0];
                            return;
                        }
                        int[] iArr2 = new int[llIlllllII[3]];
                        iArr2[llIlllllII[1]] = llIlllllII[7];
                        iArr2[llIlllllII[0]] = llIlllllII[8];
                        iArr2[llIlllllII[5]] = llIlllllII[9];
                        iArr2[llIlllllII[10]] = llIlllllII[11];
                        iArr2[llIlllllII[6]] = llIlllllII[12];
                        if (lIlllIlllIIIl(C0018e.c(iArr2) ? 1 : 0)) {
                            C0000a.a(llIlllllII[7], llIlllllII[13]);
                            C0000a.a(llIlllllII[14], llIlllllII[0]);
                            C0000a.a(llIlllllII[8], llIlllllII[0]);
                            C0000a.a(llIlllllII[11], llIlllllII[6]);
                            C0000a.a(llIlllllII[12], llIlllllII[13]);
                        }
                    }
                }
            }
            if (lIlllIlllIIIl(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlllIlllIIlI(Movement.getRunEnergy(), llIlllllII[15])) {
                Inventory.getFirst(C0019f.ba).interact(llIllllIll[llIlllllII[6]]);
                Time.sleepTicks(llIlllllII[0]);
                "".length();
            }
            int[] iArr3 = new int[llIlllllII[0]];
            iArr3[llIlllllII[1]] = llIlllllII[12];
            if (lIlllIlllIIIl(Inventory.contains(iArr3) ? 1 : 0) && lIlllIlllIlll(lIlllIlllIIII(C0018e.w(), 60.0d))) {
                int[] iArr4 = new int[llIlllllII[0]];
                iArr4[llIlllllII[1]] = llIlllllII[12];
                Inventory.getFirst(iArr4).interact(llIllllIll[llIlllllII[3]]);
                Time.sleepTicks(llIlllllII[0]);
                "".length();
            }
            if (lIlllIlllIIlI(C0018e.j(fJ), llIlllllII[0]) && lIlllIlllIIIl(ci() ? 1 : 0)) {
                if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllllII[10])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[16]];
                    if (lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(fS);
                    "".length();
                    Time.sleepTicks(llIlllllII[0]);
                    "".length();
                }
                if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllllII[10])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[17]];
                    C0020g.a(llIllllIll[llIlllllII[18]], cE);
                }
            }
            if (lIlllIlllIlII(C0018e.j(fJ), llIlllllII[0])) {
                if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllllII[5])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[19]];
                    Movement.walkTo(fT);
                    "".length();
                    Time.sleepTicks(llIlllllII[0]);
                    "".length();
                }
                if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllllII[5])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[13]];
                    if (lIlllIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[llIlllllII[0]];
                        strArr[llIlllllII[1]] = llIllllIll[llIlllllII[20]];
                        TileObjects.getNearest(strArr).interact(llIllllIll[llIlllllII[21]]);
                    }
                    C0020g.a(cE);
                }
            }
            if (lIlllIlllIlII(C0018e.j(fJ), llIlllllII[5])) {
                String[] strArr2 = new String[llIlllllII[0]];
                strArr2[llIlllllII[1]] = llIllllIll[llIlllllII[22]];
                if (lIlllIllllIlI(NPCs.getNearest(strArr2))) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[23]];
                    String[] strArr3 = new String[llIlllllII[0]];
                    strArr3[llIlllllII[1]] = llIllllIll[llIlllllII[24]];
                    TileObject nearest2 = TileObjects.getNearest(strArr3);
                    if (lIlllIlllIlIl(nearest2) && lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(nearest2), llIlllllII[6]) && lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0)) {
                        C0020g.a(cE);
                    }
                    if (!lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0) || lIlllIllllIII(Players.getLocal().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[26], llIlllllII[1])), llIlllllII[3])) {
                        Movement.walkTo(new WorldPoint(llIlllllII[25], llIlllllII[26], llIlllllII[1]));
                        "".length();
                        Time.sleepTicks(llIlllllII[10]);
                        "".length();
                    }
                }
                if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[26], llIlllllII[1])), llIlllllII[3])) {
                    String[] strArr4 = new String[llIlllllII[0]];
                    strArr4[llIlllllII[1]] = llIllllIll[llIlllllII[27]];
                    if (lIlllIllllIlI(NPCs.getNearest(strArr4))) {
                        String[] strArr5 = new String[llIlllllII[0]];
                        strArr5[llIlllllII[1]] = llIllllIll[llIlllllII[28]];
                        TileObject nearest3 = TileObjects.getNearest(strArr5);
                        if (lIlllIlllIlIl(nearest3) && lIlllIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[llIlllllII[0]];
                            strArr6[llIlllllII[1]] = llIllllIll[llIlllllII[29]];
                            if (lIlllIlllIIIl(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                nearest3.interact(llIllllIll[llIlllllII[30]]);
                                Time.sleepTicks(llIlllllII[5]);
                                "".length();
                            }
                            String[] strArr7 = new String[llIlllllII[0]];
                            strArr7[llIlllllII[1]] = llIllllIll[llIlllllII[31]];
                            if (lIlllIlllIIIl(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                nearest3.interact(llIllllIll[llIlllllII[32]]);
                                Time.sleepTicks(llIlllllII[5]);
                                "".length();
                            }
                        }
                        C0020g.a(cE);
                    }
                }
                String[] strArr8 = new String[llIlllllII[0]];
                strArr8[llIlllllII[1]] = llIllllIll[llIlllllII[33]];
                if (lIlllIlllIlIl(NPCs.getNearest(strArr8))) {
                    int[] iArr5 = new int[llIlllllII[0]];
                    iArr5[llIlllllII[1]] = llIlllllII[14];
                    if (lIlllIlllIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llIlllllII[0]];
                        iArr6[llIlllllII[1]] = llIlllllII[14];
                        if (lIlllIlllIIll(Equipment.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[llIlllllII[0]];
                            iArr7[llIlllllII[1]] = llIlllllII[14];
                            Inventory.getFirst(iArr7).interact(llIllllIll[llIlllllII[34]]);
                        }
                    }
                    if (lIlllIllllIlI(Players.getLocal().getInteracting())) {
                        String[] strArr9 = new String[llIlllllII[0]];
                        strArr9[llIlllllII[1]] = llIllllIll[llIlllllII[35]];
                        NPCs.getNearest(strArr9).interact(llIllllIll[llIlllllII[36]]);
                        Time.sleepTicks(llIlllllII[5]);
                        "".length();
                    }
                }
            }
            if (lIlllIlllIlII(C0018e.j(fJ), llIlllllII[10])) {
                if (lIlllIlllIIll(ga ? 1 : 0)) {
                    if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllllII[5])) {
                        String[] strArr10 = new String[llIlllllII[0]];
                        strArr10[llIlllllII[1]] = llIllllIll[llIlllllII[37]];
                        if (lIlllIlllIlIl(TileObjects.getNearest(strArr10))) {
                            int[] iArr8 = new int[llIlllllII[0]];
                            iArr8[llIlllllII[1]] = llIlllllII[7];
                            if (lIlllIlllIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[llIlllllII[0]];
                                iArr9[llIlllllII[1]] = llIlllllII[7];
                                Inventory.getFirst(iArr9).interact(llIllllIll[llIlllllII[38]]);
                                Time.sleepTicks(llIlllllII[3]);
                                "".length();
                            }
                        }
                        AccBuilderSotf.c = llIllllIll[llIlllllII[39]];
                        Movement.walkTo(fT);
                        "".length();
                        Time.sleepTicks(llIlllllII[0]);
                        "".length();
                    }
                    if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllllII[5])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[40]];
                        if (lIlllIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr11 = new String[llIlllllII[0]];
                            strArr11[llIlllllII[1]] = llIllllIll[llIlllllII[41]];
                            TileObjects.getNearest(strArr11).interact(llIllllIll[llIlllllII[42]]);
                        }
                        C0020g.a(cE);
                        if (lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0) && lIlllIlllIIIl(Dialog.getText().contains(llIllllIll[llIlllllII[43]]) ? 1 : 0)) {
                            ga = llIlllllII[0];
                        }
                    }
                }
                if (lIlllIlllIIIl(ga ? 1 : 0)) {
                    if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllllII[10])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[44]];
                        Movement.walkTo(fS);
                        "".length();
                        Time.sleepTicks(llIlllllII[0]);
                        "".length();
                    }
                    if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllllII[10])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[45]];
                        C0020g.a(llIllllIll[llIlllllII[46]], cE);
                    }
                }
            }
            if (lIlllIlllIlII(C0018e.j(fJ), llIlllllII[6])) {
                di = llIlllllII[1];
                if (lIlllIlllIIll(an() ? 1 : 0)) {
                    bN();
                }
                if (lIlllIlllIIIl(an() ? 1 : 0)) {
                    if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllllII[10])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[47]];
                        if (lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(fW);
                        "".length();
                        Time.sleepTicks(llIlllllII[0]);
                        "".length();
                    }
                    if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllllII[10])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[48]];
                        if (lIlllIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr12 = new String[llIlllllII[0]];
                            strArr12[llIlllllII[1]] = llIllllIll[llIlllllII[49]];
                            TileObjects.getNearest(strArr12).interact(llIllllIll[llIlllllII[50]]);
                        }
                        C0020g.a(cE);
                    }
                }
            }
            if (lIlllIlllIlII(C0018e.j(fJ), llIlllllII[3])) {
                String[] strArr13 = new String[llIlllllII[0]];
                strArr13[llIlllllII[1]] = llIllllIll[llIlllllII[51]];
                if (lIlllIlllIIll(Inventory.contains(strArr13) ? 1 : 0)) {
                    String[] strArr14 = new String[llIlllllII[0]];
                    strArr14[llIlllllII[1]] = llIllllIll[llIlllllII[52]];
                    if (lIlllIlllIIll(Inventory.contains(strArr14) ? 1 : 0)) {
                        if (!lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fX), llIlllllII[17]) || lIlllIlllIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[53]];
                            Movement.walkTo(fX);
                            "".length();
                            Time.sleepTicks(llIlllllII[0]);
                            "".length();
                        }
                        if (!lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fX), llIlllllII[17]) || lIlllIlllIIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (lIlllIllllIlI(Players.getLocal().getInteracting())) {
                                int[] iArr10 = new int[llIlllllII[0]];
                                iArr10[llIlllllII[1]] = llIlllllII[54];
                                NPCs.getNearest(iArr10).interact(llIllllIll[llIlllllII[55]]);
                                Time.sleepTicks(llIlllllII[5]);
                                "".length();
                            }
                            String[] strArr15 = new String[llIlllllII[0]];
                            strArr15[llIlllllII[1]] = llIllllIll[llIlllllII[56]];
                            TileItem nearest4 = TileItems.getNearest(strArr15);
                            if (lIlllIlllIIIl(Inventory.isFull() ? 1 : 0)) {
                                int[] iArr11 = new int[llIlllllII[0]];
                                iArr11[llIlllllII[1]] = llIlllllII[12];
                                Inventory.getFirst(iArr11).interact(llIllllIll[llIlllllII[57]]);
                                Time.sleepTicks(llIlllllII[0]);
                                "".length();
                            }
                            if (lIlllIlllIlIl(nearest4)) {
                                nearest4.interact(llIllllIll[llIlllllII[58]]);
                                Time.sleepTicks(llIlllllII[5]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr16 = new String[llIlllllII[0]];
                strArr16[llIlllllII[1]] = llIllllIll[llIlllllII[59]];
                if (lIlllIlllIIIl(Inventory.contains(strArr16) ? 1 : 0)) {
                    if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fY), llIlllllII[13])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[60]];
                        Movement.walkTo(fY);
                        "".length();
                        Time.sleepTicks(llIlllllII[0]);
                        "".length();
                    }
                    if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fY), llIlllllII[13])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[61]];
                        cg();
                    }
                }
                String[] strArr17 = new String[llIlllllII[0]];
                strArr17[llIlllllII[1]] = llIllllIll[llIlllllII[15]];
                if (lIlllIlllIIIl(Inventory.contains(strArr17) ? 1 : 0)) {
                    String[] strArr18 = new String[llIlllllII[0]];
                    strArr18[llIlllllII[1]] = llIllllIll[llIlllllII[62]];
                    if (lIlllIlllIIll(Inventory.contains(strArr18) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[63]];
                        String[] strArr19 = new String[llIlllllII[0]];
                        strArr19[llIlllllII[1]] = llIllllIll[llIlllllII[64]];
                        Item first = Inventory.getFirst(strArr19);
                        int[] iArr12 = new int[llIlllllII[0]];
                        iArr12[llIlllllII[1]] = llIlllllII[65];
                        first.useOn(TileObjects.getNearest(iArr12));
                        Time.sleepTicks(llIlllllII[6]);
                        "".length();
                    }
                }
                String[] strArr20 = new String[llIlllllII[0]];
                strArr20[llIlllllII[1]] = llIllllIll[llIlllllII[66]];
                if (lIlllIlllIIIl(Inventory.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[llIlllllII[0]];
                    strArr21[llIlllllII[1]] = llIllllIll[llIlllllII[67]];
                    if (lIlllIlllIIIl(Inventory.contains(strArr21) ? 1 : 0)) {
                        if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllllII[10])) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[68]];
                            if (lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(fW);
                            "".length();
                            Time.sleepTicks(llIlllllII[0]);
                            "".length();
                        }
                        if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllllII[10])) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[69]];
                            String[] strArr22 = new String[llIlllllII[0]];
                            strArr22[llIlllllII[1]] = llIllllIll[llIlllllII[70]];
                            Item first2 = Inventory.getFirst(strArr22);
                            String[] strArr23 = new String[llIlllllII[0]];
                            strArr23[llIlllllII[1]] = llIllllIll[llIlllllII[71]];
                            first2.useOn(TileObjects.getNearest(strArr23));
                            Time.sleepTicks(llIlllllII[10]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlllIlllIlII(C0018e.j(fJ), llIlllllII[16])) {
                String[] strArr24 = new String[llIlllllII[0]];
                strArr24[llIlllllII[1]] = llIllllIll[llIlllllII[72]];
                NPC nearest5 = NPCs.getNearest(strArr24);
                String[] strArr25 = new String[llIlllllII[0]];
                strArr25[llIlllllII[1]] = llIllllIll[llIlllllII[73]];
                if (lIlllIlllIIll(Inventory.contains(strArr25) ? 1 : 0) && lIlllIlllIlIl(nearest5)) {
                    if (lIlllIlllIIIl(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[74]];
                        C0020g.a(llIllllIll[llIlllllII[75]], cE);
                    }
                    if (lIlllIlllIIll(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[76]];
                        String[] strArr26 = new String[llIlllllII[0]];
                        strArr26[llIlllllII[1]] = llIllllIll[llIlllllII[77]];
                        TileObjects.getNearest(strArr26).interact(llIllllIll[llIlllllII[78]]);
                        Time.sleepTicks(llIlllllII[5]);
                        "".length();
                    }
                }
                String[] strArr27 = new String[llIlllllII[0]];
                strArr27[llIlllllII[1]] = llIllllIll[llIlllllII[79]];
                if (lIlllIlllIIIl(Inventory.contains(strArr27) ? 1 : 0)) {
                    String[] strArr28 = new String[llIlllllII[0]];
                    strArr28[llIlllllII[1]] = llIllllIll[llIlllllII[80]];
                    TileObject nearest6 = TileObjects.getNearest(strArr28);
                    if (lIlllIlllIlIl(nearest6)) {
                        if (lIlllIlllIIIl(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[81]];
                            String[] strArr29 = new String[llIlllllII[0]];
                            strArr29[llIlllllII[1]] = llIllllIll[llIlllllII[82]];
                            Inventory.getFirst(strArr29).useOn(nearest6);
                            Time.sleepTicks(llIlllllII[5]);
                            "".length();
                        }
                        if (lIlllIlllIIll(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[83]];
                            String[] strArr30 = new String[llIlllllII[0]];
                            strArr30[llIlllllII[1]] = llIllllIll[llIlllllII[84]];
                            TileObjects.getNearest(strArr30).interact(llIllllIll[llIlllllII[85]]);
                            Time.sleepTicks(llIlllllII[5]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlllIlllIlII(C0018e.j(fJ), llIlllllII[17])) {
                String[] strArr31 = new String[llIlllllII[0]];
                strArr31[llIlllllII[1]] = llIllllIll[llIlllllII[86]];
                NPC nearest7 = NPCs.getNearest(strArr31);
                if (lIlllIlllIlIl(nearest7)) {
                    if (lIlllIlllIIIl(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[87]];
                        C0020g.a(llIllllIll[llIlllllII[88]], cE);
                    }
                    if (lIlllIlllIIll(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[89]];
                        String[] strArr32 = new String[llIlllllII[0]];
                        strArr32[llIlllllII[1]] = llIllllIll[llIlllllII[90]];
                        TileObjects.getNearest(strArr32).interact(llIllllIll[llIlllllII[91]]);
                        Time.sleepTicks(llIlllllII[5]);
                        "".length();
                    }
                }
            }
            if (lIlllIlllIlII(C0018e.j(fJ), llIlllllII[18])) {
                if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[92]];
                    WorldArea worldArea = new WorldArea(llIlllllII[93], llIlllllII[94], llIlllllII[60], llIlllllII[43], llIlllllII[1]);
                    if (lIlllIlllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(llIlllllII[95], llIlllllII[96], llIlllllII[48], llIlllllII[63], llIlllllII[1]);
                        if (lIlllIlllIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                            "".length();
                            Time.sleepTicks(llIlllllII[0]);
                            "".length();
                        }
                        if (lIlllIlllIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                                Movement.walkTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                                "".length();
                                Time.sleepTicks(llIlllllII[0]);
                                "".length();
                            }
                            if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                                String[] strArr33 = new String[llIlllllII[0]];
                                strArr33[llIlllllII[1]] = llIllllIll[llIlllllII[98]];
                                TileObject nearest8 = TileObjects.getNearest(strArr33);
                                if (lIlllIlllIlIl(nearest8)) {
                                    String[] strArr34 = new String[llIlllllII[0]];
                                    strArr34[llIlllllII[1]] = llIllllIll[llIlllllII[99]];
                                    if (lIlllIlllIIIl(nearest8.hasAction(strArr34) ? 1 : 0)) {
                                        nearest8.interact(llIllllIll[llIlllllII[100]]);
                                        Time.sleepTicks(llIlllllII[10]);
                                        "".length();
                                    }
                                    String[] strArr35 = new String[llIlllllII[0]];
                                    strArr35[llIlllllII[1]] = llIllllIll[llIlllllII[101]];
                                    if (lIlllIlllIIIl(nearest8.hasAction(strArr35) ? 1 : 0)) {
                                        nearest8.interact(llIllllIll[llIlllllII[102]]);
                                        Time.sleepTicks(llIlllllII[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIlllIlllIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(fZ);
                        "".length();
                        Time.sleepTicks(llIlllllII[0]);
                        "".length();
                    }
                }
                if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[103]];
                    C0020g.a(llIllllIll[llIlllllII[104]], cE);
                }
            }
            if (lIlllIllllIll(C0018e.j(fJ), llIlllllII[13]) && lIlllIlllIIlI(C0018e.j(fJ), llIlllllII[72])) {
                if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    String[] strArr36 = new String[llIlllllII[0]];
                    strArr36[llIlllllII[1]] = llIllllIll[llIlllllII[105]];
                    if (lIlllIlllIIIl(Inventory.contains(strArr36) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[106]];
                        if (lIlllIlllIIlI(di, llIlllllII[0])) {
                            aN.qG += llIlllllII[0];
                            aN.u(AccBuilderSotf.m);
                            di += llIlllllII[0];
                            aN.qG = llIlllllII[1];
                            dj = llIlllllII[1];
                        }
                        C0020g.a(llIllllIll[llIlllllII[107]], cE);
                    }
                }
                String[] strArr37 = new String[llIlllllII[0]];
                strArr37[llIlllllII[1]] = llIllllIll[llIlllllII[108]];
                if (lIlllIlllIIll(Inventory.contains(strArr37) ? 1 : 0) && lIlllIlllIIlI(C0018e.j(fJ), llIlllllII[72])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[109]];
                    bM();
                }
                String[] strArr38 = new String[llIlllllII[0]];
                strArr38[llIlllllII[1]] = llIllllIll[llIlllllII[110]];
                if (lIlllIlllIIIl(Inventory.contains(strArr38) ? 1 : 0) && lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3]) && lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[111]];
                    WorldArea worldArea3 = new WorldArea(llIlllllII[93], llIlllllII[94], llIlllllII[60], llIlllllII[43], llIlllllII[1]);
                    if (lIlllIlllIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea4 = new WorldArea(llIlllllII[95], llIlllllII[96], llIlllllII[48], llIlllllII[63], llIlllllII[1]);
                        if (lIlllIlllIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                            "".length();
                            Time.sleepTicks(llIlllllII[0]);
                            "".length();
                        }
                        if (lIlllIlllIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                                Movement.walkTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                                "".length();
                                Time.sleepTicks(llIlllllII[0]);
                                "".length();
                            }
                            if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                                String[] strArr39 = new String[llIlllllII[0]];
                                strArr39[llIlllllII[1]] = llIllllIll[llIlllllII[112]];
                                TileObject nearest9 = TileObjects.getNearest(strArr39);
                                if (lIlllIlllIlIl(nearest9)) {
                                    String[] strArr40 = new String[llIlllllII[0]];
                                    strArr40[llIlllllII[1]] = llIllllIll[llIlllllII[113]];
                                    if (lIlllIlllIIIl(nearest9.hasAction(strArr40) ? 1 : 0)) {
                                        nearest9.interact(llIllllIll[llIlllllII[114]]);
                                        Time.sleepTicks(llIlllllII[10]);
                                        "".length();
                                    }
                                    String[] strArr41 = new String[llIlllllII[0]];
                                    strArr41[llIlllllII[1]] = llIllllIll[llIlllllII[115]];
                                    if (lIlllIlllIIIl(nearest9.hasAction(strArr41) ? 1 : 0)) {
                                        nearest9.interact(llIllllIll[llIlllllII[116]]);
                                        Time.sleepTicks(llIlllllII[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (lIlllIlllIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(fZ);
                        "".length();
                        Time.sleepTicks(llIlllllII[0]);
                        "".length();
                    }
                }
            }
            if (lIlllIllllIll(C0018e.j(fJ), llIlllllII[72]) && lIlllIlllIIlI(C0018e.j(fK), llIlllllII[3])) {
                AccBuilderSotf.c = llIllllIll[llIlllllII[117]];
                if (lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    ch();
                }
                if (lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    if (lIlllIlllIlIl(Widgets.get(llIlllllII[118], llIlllllII[27]))) {
                        Mouse.click(Widgets.get(llIlllllII[118], llIlllllII[27]).getClickPoint().getX(), Widgets.get(llIlllllII[118], llIlllllII[27]).getClickPoint().getY(), (boolean) llIlllllII[0]);
                        Time.sleepTicks(llIlllllII[10]);
                        "".length();
                    }
                    C0020g.a(llIllllIll[llIlllllII[119]], cE);
                    C0020g.a(cE);
                }
            }
            C0020g.a(cE);
        }
    }

    private static void cg() {
        gb.add(Integer.valueOf(llIlllllII[120]));
        "".length();
        gb.add(Integer.valueOf(llIlllllII[121]));
        "".length();
        gb.add(Integer.valueOf(llIlllllII[122]));
        "".length();
        gb.add(Integer.valueOf(llIlllllII[123]));
        "".length();
        gb.add(Integer.valueOf(llIlllllII[124]));
        "".length();
        gb.add(Integer.valueOf(llIlllllII[125]));
        "".length();
        gb.add(Integer.valueOf(llIlllllII[126]));
        "".length();
        while (lIlllIlllIIll(gb.isEmpty() ? 1 : 0) && lIlllIlllIIll(gb.isEmpty() ? 1 : 0)) {
            String[] strArr = new String[llIlllllII[0]];
            strArr[llIlllllII[1]] = llIllllIll[llIlllllII[127]];
            if (lIlllIlllIIIl(Inventory.contains(strArr) ? 1 : 0)) {
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
                return;
            }
            int[] iArr = new int[llIlllllII[0]];
            iArr[llIlllllII[1]] = gb.get(llIlllllII[1]).intValue();
            TileObject nearest = TileObjects.getNearest(iArr);
            if (lIlllIlllIlIl(nearest)) {
                String[] strArr2 = new String[llIlllllII[0]];
                strArr2[llIlllllII[1]] = llIllllIll[llIlllllII[128]];
                if (lIlllIlllIIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[llIlllllII[0]];
                    strArr3[llIlllllII[1]] = llIllllIll[llIlllllII[129]];
                    Inventory.getFirst(strArr3).useOn(nearest);
                    Time.sleepTicks(llIlllllII[3]);
                    "".length();
                }
            }
            String[] strArr4 = new String[llIlllllII[0]];
            strArr4[llIlllllII[1]] = llIllllIll[llIlllllII[130]];
            if (lIlllIlllIIll(Inventory.contains(strArr4) ? 1 : 0)) {
                gb.remove(llIlllllII[1]);
                "".length();
                Time.sleepTicks(llIlllllII[5]);
                "".length();
            }
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean ci() {
        String[] strArr = new String[llIlllllII[0]];
        strArr[llIlllllII[1]] = llIllllIll[llIlllllII[140]];
        if (lIlllIlllIllI(Inventory.getCount(strArr))) {
            int[] iArr = new int[llIlllllII[0]];
            iArr[llIlllllII[1]] = llIlllllII[12];
            if (lIlllIlllIllI(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[llIlllllII[0]];
                iArr2[llIlllllII[1]] = llIlllllII[11];
                if (lIlllIlllIllI(Inventory.getCount(iArr2))) {
                    int[] iArr3 = new int[llIlllllII[0]];
                    iArr3[llIlllllII[1]] = llIlllllII[7];
                    if (lIlllIlllIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = llIlllllII[0];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
        }
        return llIlllllII[1];
    }

    private static boolean lIlllIlllIlll(int i) {
        return i < 0;
    }

    private static void lIlllIllIlllI() {
        llIllllIll = new String[llIlllllII[185]];
        llIllllIll[llIlllllII[1]] = lIlllIllIlIll("PCIEAQQSLg5IFQ8yAwYQWiIeDRoJZ0obABM/CQAeFCxKChYZIEocGFo6Hw0EDg==", "zKjhw");
        llIllllIll[llIlllllII[0]] = lIlllIllIllII("XFaBm0I3mVGHWaEgEBS/JA==", "yTElB");
        llIllllIll[llIlllllII[5]] = lIlllIllIllII("Cgng3RQ/AnU3+hLMiJOoCkUrpR/qJ32R", "PiLLo");
        llIllllIll[llIlllllII[10]] = lIlllIllIllIl("sV983Gt2Q5flvEQ62FHL+LxmnoruiJjO4IqSV9ikJTSsU2iNaepw9keVi141NACx0LRbaCnRL10=", "MHdBA");
        llIllllIll[llIlllllII[6]] = lIlllIllIlIll("Fz0gJg8=", "SOIHd");
        llIllllIll[llIlllllII[3]] = lIlllIllIlIll("IyI5", "fCMEz");
        llIllllIll[llIlllllII[16]] = lIlllIllIlIll("IgImUzgDQyMHLR4X", "lcPsL");
        llIllllIll[llIlllllII[17]] = lIlllIllIllII("TPTWZ5YLT3v8KsWb+qho+Q==", "JYdbB");
        llIllllIll[llIlllllII[18]] = lIlllIllIllIl("93kxvG5mwb7XEaM03jz0nA==", "UtYrK");
        llIllllIll[llIlllllII[19]] = lIlllIllIlIll("FCoYTCM1axoJOionC0wzNSQc", "ZKnlW");
        llIllllIll[llIlllllII[13]] = lIlllIllIllIl("bGmvOUM/LT5HRYpUo/Zop9RuSh/fB58h", "tzrGA");
        llIllllIll[llIlllllII[20]] = lIlllIllIllIl("D0dlmxgQ3wlgMD0GopIFrA==", "irtbb");
        llIllllIll[llIlllllII[21]] = lIlllIllIlIll("BQIAGQ==", "Jrewx");
        llIllllIll[llIlllllII[22]] = lIlllIllIllIl("LLYvMLMDVZv22PMdrL0UaQ==", "Rbkom");
        llIllllIll[llIlllllII[23]] = lIlllIllIllIl("kuQWF3FgoRCdUREg3wAqtA==", "QgjlX");
        llIllllIll[llIlllllII[24]] = lIlllIllIllII("zJDiy6y9uFXr1e4wJOB4hg==", "hGrVR");
        llIllllIll[llIlllllII[27]] = lIlllIllIllII("+lhI8tg2Wj8MwjPXZhz3iw==", "fIveR");
        llIllllIll[llIlllllII[28]] = lIlllIllIlIll("IwQbFjQYGQg=", "wvzfP");
        llIllllIll[llIlllllII[29]] = lIlllIllIlIll("KTomLw==", "fJCAx");
        llIllllIll[llIlllllII[30]] = lIlllIllIllII("bUH1EaO7i/Q=", "qPicT");
        llIllllIll[llIlllllII[31]] = lIlllIllIllIl("6BmOxoePFiR3ZZ8yVX3wsQ==", "zAOet");
        llIllllIll[llIlllllII[32]] = lIlllIllIllII("bmVEIRI0mZ683XopBj2RWg==", "fPmTb");
        llIllllIll[llIlllllII[33]] = lIlllIllIllIl("Rz5r7vydK78zkg3yI/JkIg==", "NHJav");
        llIllllIll[llIlllllII[34]] = lIlllIllIllII("l6XTdU/YMAk=", "betYz");
        llIllllIll[llIlllllII[35]] = lIlllIllIlIll("MCMjIQ0BZgkkABYiJzAP", "dFNQa");
        llIllllIll[llIlllllII[36]] = lIlllIllIllII("lVRv9C8Y/no=", "XgqDt");
        llIllllIll[llIlllllII[37]] = lIlllIllIlIll("CjsDMTwiOhk=", "GTmDQ");
        llIllllIll[llIlllllII[38]] = lIlllIllIllIl("3ZfZl/SJpk4=", "xESiY");
        llIllllIll[llIlllllII[39]] = lIlllIllIllII("74ohh4OPiQTp+iWDVV8YrY0tqyvZAw8A", "CgnjQ");
        llIllllIll[llIlllllII[40]] = lIlllIllIllII("i2lW53QwQK4XmyVoUUdtlUEkaxuSQvM1", "qFbsI");
        llIllllIll[llIlllllII[41]] = lIlllIllIlIll("DS05Hw9hKCQXGA==", "ALKxj");
        llIllllIll[llIlllllII[42]] = lIlllIllIlIll("KTMfCg==", "fCzdj");
        llIllllIll[llIlllllII[43]] = lIlllIllIllIl("vKEUFNP1L13he6QqZfu6QQ==", "umajz");
        llIllllIll[llIlllllII[44]] = lIlllIllIllIl("DvdJAo9JxA7ZIgn8xa5vWw==", "CbtPc");
        llIllllIll[llIlllllII[45]] = lIlllIllIlIll("ByM6EnYYKzge", "sBVyV");
        llIllllIll[llIlllllII[46]] = lIlllIllIllIl("Sg5Hj6iZxQgxlm1HC+1TSA==", "JUysZ");
        llIllllIll[llIlllllII[47]] = lIlllIllIllIl("mljQaL8wesVrSq75Wd4JhA==", "hMHph");
        llIllllIll[llIlllllII[48]] = lIlllIllIllIl("UdJXeG/fhkREPG+bHqez0hwG/OD/Wwrx", "opuIH");
        llIllllIll[llIlllllII[49]] = lIlllIllIllII("YujcZ8Fcnr35jbdfj2YBdg==", "GbNHQ");
        llIllllIll[llIlllllII[50]] = lIlllIllIllIl("YATktpm/rag=", "sSdmC");
        llIllllIll[llIlllllII[51]] = lIlllIllIllIl("2c95r5RZbPaNmQ3JUpFN1Q==", "KAQfe");
        llIllllIll[llIlllllII[52]] = lIlllIllIllII("UD0XuqdfiA5Sg/iN/lUFaQ==", "wplag");
        llIllllIll[llIlllllII[53]] = lIlllIllIllIl("B6GqxHAPcVdQStVGCyw+/9UY1tOsbStk", "OWLfD");
        llIllllIll[llIlllllII[55]] = lIlllIllIllII("8qIvuP5XA+k=", "auVwM");
        llIllllIll[llIlllllII[56]] = lIlllIllIlIll("LikdDy0HZhoOMQ==", "iFqkH");
        llIllllIll[llIlllllII[57]] = lIlllIllIllIl("8BQVKc7+DTE=", "HomTk");
        llIllllIll[llIlllllII[58]] = lIlllIllIlIll("EjgSCw==", "FYynj");
        llIllllIll[llIlllllII[59]] = lIlllIllIllIl("clhMTRYvuoa/txgbOefKAA==", "SXXGf");
        llIllllIll[llIlllllII[60]] = lIlllIllIlIll("HCkjdiU9aCYiMCY9MCU=", "RHUVQ");
        llIllllIll[llIlllllII[61]] = lIlllIllIlIll("ICcfMwoIKVE8Bh8=", "fNqWc");
        llIllllIll[llIlllllII[15]] = lIlllIllIlIll("KjAoBEgIJz4=", "cBGjh");
        llIllllIll[llIlllllII[62]] = lIlllIllIlIll("KiA1PShHIiYiNBU=", "gUGVQ");
        llIllllIll[llIlllllII[63]] = lIlllIllIllIl("Uw6/CRqo0hgkNZC8uIYO5w==", "BvYXS");
        llIllllIll[llIlllllII[64]] = lIlllIllIllII("8ocXMe5fdzU=", "fRvyU");
        llIllllIll[llIlllllII[66]] = lIlllIllIlIll("EwACHVQxFxQ=", "Zrmst");
        llIllllIll[llIlllllII[67]] = lIlllIllIllII("yU0xMh4psH1YkvJTxOdSCA==", "XlZqh");
        llIllllIll[llIlllllII[68]] = lIlllIllIlIll("HxEObDM+UBItLj0=", "QpxLG");
        llIllllIll[llIlllllII[69]] = lIlllIllIllII("sOaqrwKUL6/pgwtg1twZYSUaZ3FANEFT", "nbRxV");
        llIllllIll[llIlllllII[70]] = lIlllIllIllIl("99u4D6ouLHeIuUvtEDdxOg==", "YKWNL");
        llIllllIll[llIlllllII[71]] = lIlllIllIlIll("Ci00NnItJzco", "IHXZR");
        llIllllIll[llIlllllII[72]] = lIlllIllIllII("mrgtyyIaobs=", "QEsBo");
        llIllllIll[llIlllllII[73]] = lIlllIllIllII("Efkmkyfbgpnzmt2AuhRRsg==", "ufTSY");
        llIllllIll[llIlllllII[74]] = lIlllIllIllIl("ku1X7CY+iG0Z6XQ85vkTKg==", "lbgxG");
        llIllllIll[llIlllllII[75]] = lIlllIllIllII("d1A2Dq+3hVU=", "bjFpV");
        llIllllIll[llIlllllII[76]] = lIlllIllIllII("MNlgYMHx1k08wu+YEF6QcA==", "xjgOg");
        llIllllIll[llIlllllII[77]] = lIlllIllIlIll("FxA2OXAwGjUn", "TuZUP");
        llIllllIll[llIlllllII[78]] = lIlllIllIllII("2tD5XzCMOcA=", "UZZyg");
        llIllllIll[llIlllllII[79]] = lIlllIllIllII("ZEWIeDp7IDSYSnLjskwsgg==", "GrtPW");
        llIllllIll[llIlllllII[80]] = lIlllIllIlIll("DzgXEiUi", "LWqtL");
        llIllllIll[llIlllllII[81]] = lIlllIllIllII("JCh0nWY1zdp+JcNa7gmTKWljIwM3MzTC", "jUDtX");
        llIllllIll[llIlllllII[82]] = lIlllIllIlIll("NhkkKgIREWEuEAAQMw==", "tuAYq");
        llIllllIll[llIlllllII[83]] = lIlllIllIllIl("fT2hsifUX2IejyuswSXMHQ==", "xNdSj");
        llIllllIll[llIlllllII[84]] = lIlllIllIllII("wINboGDYklBneKZ7Zyewxg==", "uMePl");
        llIllllIll[llIlllllII[85]] = lIlllIllIlIll("Nz8sNw==", "xOIYF");
        llIllllIll[llIlllllII[86]] = lIlllIllIllII("5F8K//puYvM=", "gEwtN");
        llIllllIll[llIlllllII[87]] = lIlllIllIllIl("tHqp3EmOx4rI1gYYQOHFSw==", "Fkbuz");
        llIllllIll[llIlllllII[88]] = lIlllIllIlIll("FTYBFAs9", "QDdnn");
        llIllllIll[llIlllllII[89]] = lIlllIllIlIll("HD0/AyIwPSxGMzw/Jw==", "YSKfP");
        llIllllIll[llIlllllII[90]] = lIlllIllIlIll("FSkfKmMyIxw0", "VLsFC");
        llIllllIll[llIlllllII[91]] = lIlllIllIllII("m/Wv3zR/7Fk=", "mwEdE");
        llIllllIll[llIlllllII[92]] = lIlllIllIllIl("gnPCLfju+khdTaTrPK739WIVvjnQI1Zu", "OTEcF");
        llIllllIll[llIlllllII[98]] = lIlllIllIllIl("kH9NzuSyJfMVZidXB18U0Q==", "eewAm");
        llIllllIll[llIlllllII[99]] = lIlllIllIllIl("+xgz+KXEJ24=", "lqkic");
        llIllllIll[llIlllllII[100]] = lIlllIllIllIl("16Zi+DYMSyw=", "ouUUy");
        llIllllIll[llIlllllII[101]] = lIlllIllIllIl("2DDeogHNHmgOLThCe0bCAg==", "votDu");
        llIllllIll[llIlllllII[102]] = lIlllIllIlIll("CDoYHCNmMh4GLw==", "KVqqA");
        llIllllIll[llIlllllII[103]] = lIlllIllIllII("dRNdARBlar7ewjdiSNQl0w==", "Vqxtg");
        llIllllIll[llIlllllII[104]] = lIlllIllIllII("wBGMz+UpLvE=", "aBhVj");
        llIllllIll[llIlllllII[105]] = lIlllIllIllII("mKwYfgdnFk0uyyLLcAFPCg==", "KGpFN");
        llIllllIll[llIlllllII[106]] = lIlllIllIllIl("vmSiaN/EwWNgNmhlp6dsGQ==", "QuEoX");
        llIllllIll[llIlllllII[107]] = lIlllIllIllII("XXuI4/Cq6x4=", "zIVBV");
        llIllllIll[llIlllllII[108]] = lIlllIllIllII("vkHSBVuwan5xaHVtkfhNFg==", "QZvXg");
        llIllllIll[llIlllllII[109]] = lIlllIllIllII("FpS6/0D2POTyIzMXngLHRsnb7Yl8mdiE", "bIiua");
        llIllllIll[llIlllllII[110]] = lIlllIllIllII("B70lxdPLZImJGJjmSjNEWw==", "KOuIS");
        llIllllIll[llIlllllII[111]] = lIlllIllIlIll("JxATeiEGUQMzOwgdRS48BRQ=", "iqeZU");
        llIllllIll[llIlllllII[112]] = lIlllIllIllIl("WUhirnsC77tIjZPrMeSRHA==", "NQPLJ");
        llIllllIll[llIlllllII[113]] = lIlllIllIllIl("jnnhKxaO2nE=", "xIvhx");
        llIllllIll[llIlllllII[114]] = lIlllIllIlIll("IgoiIw==", "mzGMO");
        llIllllIll[llIlllllII[115]] = lIlllIllIllII("bOvKa7EfwX3QoKBF0xCtyg==", "PGkor");
        llIllllIll[llIlllllII[116]] = lIlllIllIllII("Rxp9I/Rj6tRZPbTNh9Uzlg==", "OFKcO");
        llIllllIll[llIlllllII[117]] = lIlllIllIllIl("y16ErhVMwWO33pnRoQ+Bu4IKabMcCoWXLGTbBpvxgibhmV2CTTVQBg==", "JYJDL");
        llIllllIll[llIlllllII[119]] = lIlllIllIllIl("3WXkY9oXEdI=", "ROQdF");
        llIllllIll[llIlllllII[127]] = lIlllIllIlIll("JRMfJWIHBAk=", "lapKB");
        llIllllIll[llIlllllII[128]] = lIlllIllIllIl("ZKB6F9lNzE/KE2m3JzhjgA==", "jYiUa");
        llIllllIll[llIlllllII[129]] = lIlllIllIlIll("Mh8rEQMbUCwQHw==", "upGuf");
        llIllllIll[llIlllllII[130]] = lIlllIllIlIll("Ix01OmYBCiM=", "joZTF");
        llIllllIll[llIlllllII[131]] = lIlllIllIllIl("IFuJFNSdrLPwCAJagvOpP+XQDEyJ3Dhh", "DfSTR");
        llIllllIll[llIlllllII[2]] = lIlllIllIllII("zu4+TcsmBwwPvWrKtKK+fA==", "UbfHG");
        llIllllIll[llIlllllII[132]] = lIlllIllIllIl("1MPpyHFrTyM=", "KiOUp");
        llIllllIll[llIlllllII[133]] = lIlllIllIlIll("KRo/Nw==", "fjZYK");
        llIllllIll[llIlllllII[134]] = lIlllIllIllIl("F5NITY+E8D32FP7uREIXOQ==", "lRGKx");
        llIllllIll[llIlllllII[135]] = lIlllIllIllIl("n8LR1fWm8bgpWpNMFrAhYA==", "bIESr");
        llIllllIll[llIlllllII[136]] = lIlllIllIllII("NBEoheLfmrHkKI/L20hV5g==", "sQNna");
        llIllllIll[llIlllllII[137]] = lIlllIllIlIll("DxUsKCouGiVsJCYaKSUoIA==", "GtBLF");
        llIllllIll[llIlllllII[138]] = lIlllIllIllIl("3/tKW3OWq35nd2gSOWvzHA==", "iYXzG");
        llIllllIll[llIlllllII[139]] = lIlllIllIllII("ut0sgZQCIc1BXgRZCILfEXhWAO9CT04g", "MfaRf");
        llIllllIll[llIlllllII[140]] = lIlllIllIllII("ABFciZkKNWo=", "lbXPP");
        llIllllIll[llIlllllII[141]] = lIlllIllIllIl("Hj4OTgtyqK4=", "yuiGu");
        llIllllIll[llIlllllII[147]] = lIlllIllIllII("i/j1lSIsTklW+89N6rD2jw==", "CFTjc");
        llIllllIll[llIlllllII[148]] = lIlllIllIllII("H7641MEO1FPnqCrgE+3qfhd2z1PtGsjs", "VByyM");
        llIllllIll[llIlllllII[165]] = lIlllIllIllII("AwVpaNbbflKvGztfLu2sdotzJ59h9TJIw/BPj9/ki8s=", "KcFAF");
        llIllllIll[llIlllllII[166]] = lIlllIllIlIll("DQgSew==", "TmaUL");
        llIllllIll[llIlllllII[167]] = lIlllIllIllIl("T3L5JePwFV3wVQ3YwhHTm+6maRDEAweg", "jOXNN");
        llIllllIll[llIlllllII[168]] = lIlllIllIlIll("EQ0BQnImBwZOJi0EHU4/LUgGBjM8SAUGN2gYAwEwJA0cTjs7Rg==", "HhqnR");
        llIllllIll[llIlllllII[169]] = lIlllIllIllIl("uwDcz3QBY7A=", "ziOXk");
        llIllllIll[llIlllllII[170]] = lIlllIllIllIl("0j3RhpoRCXsjHRYEMyxMMpo4sKZ/h1IQ", "mRJft");
        llIllllIll[llIlllllII[171]] = lIlllIllIlIll("LQpmGxkBCyNPEAoAMgcYCh5mCh0XHGYGHxAcNAoCEBAoCFEQFmYLHkQYNAAECh1mBxQWHHk=", "dyFoq");
        llIllllIll[llIlllllII[172]] = lIlllIllIllII("yseSGL8b6XdLNMTJ/g22cWEqJLf2q31pyngAb/IOuRkOHyABNU2sYTuuqW7I64TI", "QKLYR");
        llIllllIll[llIlllllII[173]] = lIlllIllIlIll("CS8iQ3cZbT0DdzclcQ45NGo9ADg7ajcAJXAiOAJ5", "PJQoW");
        llIllllIll[llIlllllII[174]] = lIlllIllIllII("24TNZCqXY4sZIqIzlyWHeg==", "qHJtw");
        llIllllIll[llIlllllII[175]] = lIlllIllIllIl("t9CGTObIn141Q+Y/dkH1ZQ==", "RaOPE");
        llIllllIll[llIlllllII[176]] = lIlllIllIlIll("NwxITxoQBgoEHVY=", "xgdon");
        llIllllIll[llIlllllII[177]] = lIlllIllIlIll("CEUeAQcvDkogSTcAShoBLRMPDU41DQ9JHjQfEAULYA==", "Aejin");
        llIllllIll[llIlllllII[178]] = lIlllIllIlIll("KRoBcCQAG1YZZwkQGiB4", "auvPG");
        llIllllIll[llIlllllII[179]] = lIlllIllIllII("CURJSyfMMb6V7gXRVcKjFopoQPc2yCJvrIdDxwaZMCv75ag0diD2Rw==", "bmGaV");
        llIllllIll[llIlllllII[180]] = lIlllIllIllII("pidN7jBVKpXZVs5+QAfToQ0Fh7xaJiRwhGcW4qVUB2CJsJVHRu0cwg==", "fmMSb");
        llIllllIll[llIlllllII[181]] = lIlllIllIllIl("J22Bo1B0JUu2+dMj6C16FmacyTaDiGmQ", "rtAYH");
        llIllllIll[llIlllllII[182]] = lIlllIllIlIll("IRICWnUXEVEVOg0FAhN7", "xwqvU");
        llIllllIll[llIlllllII[183]] = lIlllIllIllIl("VCrKmsAekB01lgMRJCy/PSR802wohzuSjO3YNtag8YQ5WmKkMXT2LR1yT36ELiIm", "dTAyo");
        llIllllIll[llIlllllII[184]] = lIlllIllIllII("JBu+oDmO7Yx1R5ijjqLg3CFFCjxCd6wfpxFHW+b0ewF9EBTRHRSzGdEtLq1Ax6Tc", "CpMVJ");
    }

    private static void lIlllIllIllll() {
        llIlllllII = new int[186];
        llIlllllII[0] = " ".length();
        llIlllllII[1] = (214 ^ 152) & ((136 ^ 198) ^ (-1));
        llIlllllII[2] = (121 ^ 13) ^ (31 ^ 0);
        llIlllllII[3] = (((6 + 23) - (-101)) + 19) ^ (((42 + 130) - 75) + 47);
        llIlllllII[4] = (-18453) & 23452;
        llIlllllII[5] = "  ".length();
        llIlllllII[6] = 45 ^ 41;
        llIlllllII[7] = (-41) & 8047;
        llIlllllII[8] = (-30721) & 32645;
        llIlllllII[9] = (-16498) & 24433;
        llIlllllII[10] = "   ".length();
        llIlllllII[11] = (-((-4113) & 21655)) & (-545) & 30711;
        llIlllllII[12] = (-((-25937) & 30037)) & (-19073) & 23551;
        llIlllllII[13] = 63 ^ 53;
        llIlllllII[14] = (-(((186 + 172) - 209) + 52)) & (-2565) & 4095;
        llIlllllII[15] = (106 ^ 39) ^ (((115 + 37) - 86) + 61);
        llIlllllII[16] = 114 ^ 116;
        llIlllllII[17] = (((0 + 29) - (-54)) + 50) ^ (((73 + 34) - 84) + 107);
        llIlllllII[18] = 103 ^ 111;
        llIlllllII[19] = 149 ^ 156;
        llIlllllII[20] = 7 ^ 12;
        llIlllllII[21] = 36 ^ 40;
        llIlllllII[22] = (((4 + 137) - (-13)) + 6) ^ (((108 + 62) - 134) + 137);
        llIlllllII[23] = (212 ^ 165) ^ (((56 + 92) - 67) + 46);
        llIlllllII[24] = (((65 + 126) - 166) + 142) ^ (((48 + 43) - 9) + 86);
        llIlllllII[25] = (-((-5505) & 21937)) & (-643) & 20479;
        llIlllllII[26] = (-16385) & 19890;
        llIlllllII[27] = (54 ^ 13) ^ (190 ^ 149);
        llIlllllII[28] = (((171 + 177) - 278) + 111) ^ (((146 + 157) - 302) + 163);
        llIlllllII[29] = (218 ^ 135) ^ (250 ^ 181);
        llIlllllII[30] = (207 ^ 168) ^ (123 ^ 15);
        llIlllllII[31] = (105 ^ 108) ^ (185 ^ 168);
        llIlllllII[32] = (199 ^ 138) ^ (119 ^ 47);
        llIlllllII[33] = (58 ^ 92) ^ (195 ^ 179);
        llIlllllII[34] = 66 ^ 85;
        llIlllllII[35] = 63 ^ 39;
        llIlllllII[36] = 124 ^ 101;
        llIlllllII[37] = 43 ^ 49;
        llIlllllII[38] = (250 ^ 183) ^ (223 ^ 137);
        llIlllllII[39] = (197 ^ 187) ^ (165 ^ 199);
        llIlllllII[40] = 185 ^ 164;
        llIlllllII[41] = (82 ^ 49) ^ (32 ^ 93);
        llIlllllII[42] = 124 ^ 99;
        llIlllllII[43] = 119 ^ 87;
        llIlllllII[44] = (174 ^ 189) ^ (105 ^ 91);
        llIlllllII[45] = (((142 + 53) - 182) + 149) ^ (((60 + 61) - 17) + 24);
        llIlllllII[46] = (3 ^ 32) ^ ((102 ^ 51) & ((236 ^ 185) ^ (-1)));
        llIlllllII[47] = (53 ^ 76) ^ (197 ^ 152);
        llIlllllII[48] = (((43 + 54) - 11) + 74) ^ (((74 + 69) - 43) + 33);
        llIlllllII[49] = (((32 + 92) - 45) + 90) ^ (((11 + 79) - (-12)) + 41);
        llIlllllII[50] = (((145 + 107) - 207) + 107) ^ (((165 + 106) - 133) + 53);
        llIlllllII[51] = (((37 + 88) - 6) + 24) ^ (((15 + 57) - (-65)) + 30);
        llIlllllII[52] = (((94 + 119) - 201) + 140) ^ (((27 + 140) - 132) + 142);
        llIlllllII[53] = (((157 + 160) - 107) + 28) ^ (((157 + 128) - 189) + 100);
        llIlllllII[54] = (-16417) & 19902;
        llIlllllII[55] = 239 ^ 196;
        llIlllllII[56] = 124 ^ 80;
        llIlllllII[57] = (((146 + 104) - 233) + 161) ^ (((50 + 87) - 7) + 29);
        llIlllllII[58] = (245 ^ 165) ^ (88 ^ 38);
        llIlllllII[59] = (((119 + 152) - 219) + 112) ^ (((103 + 1) - 51) + 86);
        llIlllllII[60] = (84 ^ 15) ^ (39 ^ 76);
        llIlllllII[61] = (83 ^ 102) ^ (197 ^ 193);
        llIlllllII[62] = (((57 + 108) - 34) + 60) ^ (((15 + 109) - 8) + 24);
        llIlllllII[63] = (107 ^ 119) ^ (52 ^ 28);
        llIlllllII[64] = (((152 + 56) - 91) + 49) ^ (((121 + 139) - 245) + 132);
        llIlllllII[65] = (-12353) & 15837;
        llIlllllII[66] = 128 ^ 182;
        llIlllllII[67] = (132 ^ 148) ^ (66 ^ 101);
        llIlllllII[68] = 140 ^ 180;
        llIlllllII[69] = (120 ^ 107) ^ (158 ^ 180);
        llIlllllII[70] = (85 ^ 26) ^ (112 ^ 5);
        llIlllllII[71] = (((69 + 145) - 146) + 116) ^ (((30 + 111) - 123) + 113);
        llIlllllII[72] = 51 ^ 15;
        llIlllllII[73] = 64 ^ 125;
        llIlllllII[74] = 159 ^ 161;
        llIlllllII[75] = (64 ^ 46) ^ (75 ^ 26);
        llIlllllII[76] = (((47 + 25) - 5) + 156) ^ (((125 + 151) - 182) + 65);
        llIlllllII[77] = (105 ^ 2) ^ (115 ^ 89);
        llIlllllII[78] = 78 ^ 12;
        llIlllllII[79] = (8 ^ 117) ^ (111 ^ 81);
        llIlllllII[80] = (249 ^ 180) ^ (71 ^ 78);
        llIlllllII[81] = 73 ^ 12;
        llIlllllII[82] = (33 ^ 116) ^ (95 ^ 76);
        llIlllllII[83] = 64 ^ 7;
        llIlllllII[84] = 123 ^ 51;
        llIlllllII[85] = 233 ^ 160;
        llIlllllII[86] = 109 ^ 39;
        llIlllllII[87] = (41 ^ 72) ^ (102 ^ 76);
        llIlllllII[88] = (((28 + 68) - (-6)) + 127) ^ (((6 + 104) - 106) + 165);
        llIlllllII[89] = (((53 + 2) - (-79)) + 96) ^ (((59 + 135) - 63) + 40);
        llIlllllII[90] = 50 ^ 124;
        llIlllllII[91] = (117 ^ 90) ^ (13 ^ 109);
        llIlllllII[92] = 214 ^ 134;
        llIlllllII[93] = (-((-65) & 8433)) & (-4105) & 15871;
        llIlllllII[94] = (-2089) & 11967;
        llIlllllII[95] = (-((-9275) & 14075)) & (-8195) & 16382;
        llIlllllII[96] = (-(7 ^ 93)) & (-8193) & 11743;
        llIlllllII[97] = (-8266) & 11769;
        llIlllllII[98] = (119 ^ 45) ^ (62 ^ 53);
        llIlllllII[99] = (166 ^ 192) ^ (141 ^ 185);
        llIlllllII[100] = 254 ^ 173;
        llIlllllII[101] = 68 ^ 16;
        llIlllllII[102] = 194 ^ 151;
        llIlllllII[103] = (118 ^ 69) ^ (36 ^ 65);
        llIlllllII[104] = (10 ^ 69) ^ (36 ^ 60);
        llIlllllII[105] = (((63 + 33) - (-37)) + 113) ^ (((56 + 126) - 58) + 50);
        llIlllllII[106] = (((7 + 84) - (-22)) + 85) ^ (((14 + 53) - 40) + 132);
        llIlllllII[107] = (((191 + 184) - 302) + 119) ^ (((67 + 95) - 32) + 24);
        llIlllllII[108] = (209 ^ 175) ^ (103 ^ 66);
        llIlllllII[109] = 92 ^ 0;
        llIlllllII[110] = (((96 + 133) - 182) + 174) ^ (((49 + 103) - 142) + 118);
        llIlllllII[111] = 51 ^ 109;
        llIlllllII[112] = (21 ^ 55) ^ (82 ^ 47);
        llIlllllII[113] = (229 ^ 194) ^ (130 ^ 197);
        llIlllllII[114] = (211 ^ 181) ^ (60 ^ 59);
        llIlllllII[115] = (187 ^ 159) ^ (243 ^ 181);
        llIlllllII[116] = 32 ^ 67;
        llIlllllII[117] = 88 ^ 60;
        llIlllllII[118] = (((19 ^ 45) + (((58 + 121) - 149) + 121)) - (((42 + 123) - 28) + 64)) + ((134 + 34) - 47) + 20;
        llIlllllII[119] = (106 ^ 37) ^ (232 ^ 194);
        llIlllllII[120] = (-((-3073) & 24151)) & (-2) & 24575;
        llIlllllII[121] = (-12886) & 16383;
        llIlllllII[122] = (-16473) & 19967;
        llIlllllII[123] = (-28743) & 32239;
        llIlllllII[124] = (-((-22921) & 31705)) & (-16385) & 28662;
        llIlllllII[125] = (-12865) & 16363;
        llIlllllII[126] = (-8779) & 12271;
        llIlllllII[127] = 253 ^ 155;
        llIlllllII[128] = (22 ^ 66) ^ (242 ^ 193);
        llIlllllII[129] = 8 ^ 96;
        llIlllllII[130] = 194 ^ 171;
        llIlllllII[131] = 225 ^ 139;
        llIlllllII[132] = (74 ^ 102) ^ (121 ^ 57);
        llIlllllII[133] = 41 ^ 68;
        llIlllllII[134] = (0 ^ 25) ^ (97 ^ 22);
        llIlllllII[135] = (((33 + 16) - (-46)) + 77) ^ (((63 + 100) - (-20)) + 12);
        llIlllllII[136] = 201 ^ 185;
        llIlllllII[137] = 250 ^ 139;
        llIlllllII[138] = (132 ^ 184) ^ (81 ^ 31);
        llIlllllII[139] = 199 ^ 180;
        llIlllllII[140] = 70 ^ 50;
        llIlllllII[141] = 26 ^ 111;
        llIlllllII[142] = (-((-17705) & 19839)) & (-20610) & 31743;
        llIlllllII[143] = (-((-26885) & 32086)) & (-8833) & 14333;
        llIlllllII[144] = (-((-3662) & 8063)) & (-16387) & 32767;
        llIlllllII[145] = (-6) & 25005;
        llIlllllII[146] = (-((-2338) & 32061)) & (-33) & 30655;
        llIlllllII[147] = 38 ^ 80;
        llIlllllII[148] = (34 ^ 67) ^ (8 ^ 30);
        llIlllllII[149] = (-4169) & 7390;
        llIlllllII[150] = (-29185) & 32657;
        llIlllllII[151] = (-21121) & 24527;
        llIlllllII[152] = (-((-161) & 29375)) & (-1) & 32703;
        llIlllllII[153] = (-2369) & 12270;
        llIlllllII[154] = (-147) & 8159;
        llIlllllII[155] = (-8770) & 15191;
        llIlllllII[156] = (-((-3665) & 32505)) & (-513) & 32767;
        llIlllllII[157] = (-((-11116) & 27503)) & (-12417) & 32215;
        llIlllllII[158] = (-((-7429) & 15647)) & (-21061) & 32766;
        llIlllllII[159] = (-((-19719) & 28039)) & (-1) & 11742;
        llIlllllII[160] = (-(32 ^ 65)) & (-18433) & 28415;
        llIlllllII[161] = (-4751) & 8190;
        llIlllllII[162] = (-18449) & 28343;
        llIlllllII[163] = (-((-2110) & 24319)) & (-10257) & 32767;
        llIlllllII[164] = (-31749) & 32055;
        llIlllllII[165] = (26 ^ 30) ^ (100 ^ 24);
        llIlllllII[166] = 221 ^ 164;
        llIlllllII[167] = (((82 + 189) - 215) + 167) ^ (((159 + 47) - 85) + 44);
        llIlllllII[168] = 202 ^ 177;
        llIlllllII[169] = (48 ^ 18) ^ (63 ^ 97);
        llIlllllII[170] = 78 ^ 51;
        llIlllllII[171] = 117 ^ 11;
        llIlllllII[172] = (((2 ^ 98) + (88 ^ 106)) - (191 ^ 168)) + (92 ^ 88);
        llIlllllII[173] = ((98 + 98) - 97) + 29;
        llIlllllII[174] = ((100 + 18) - 73) + 84;
        llIlllllII[175] = ((88 + 36) - 105) + 111;
        llIlllllII[176] = (((187 ^ 159) + (196 ^ 142)) - (102 ^ 112)) + (106 ^ 65);
        llIlllllII[177] = ((63 + 21) - 50) + 98;
        llIlllllII[178] = ((92 + 123) - 208) + 126;
        llIlllllII[179] = (((111 ^ 69) + (74 ^ 60)) - (211 ^ 142)) + (25 ^ 90);
        llIlllllII[180] = (((((0 + 49) - (-10)) + 69) + (125 ^ 116)) - (2 ^ 86)) + (6 ^ 84);
        llIlllllII[181] = (((134 ^ 141) + (10 ^ 68)) - (-(49 ^ 53))) + (79 ^ 100);
        llIlllllII[182] = (((255 ^ 159) + "   ".length()) - (107 ^ 53)) + ((65 + 56) - 72) + 83;
        llIlllllII[183] = (((121 ^ 115) + (104 ^ 28)) - (57 ^ 127)) + (92 ^ 14);
        llIlllllII[184] = (((((106 + 74) - 63) + 15) + (97 ^ 40)) - (134 ^ 196)) + ((171 ^ 185) & ((76 ^ 94) ^ (-1)));
        llIlllllII[185] = ((88 + 103) - 83) + 32;
    }

    private static boolean lIlllIlllIllI(int i) {
        return i > 0;
    }
}
