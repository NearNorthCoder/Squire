package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
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
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/r.class */
public class C0017r implements S {
    static /* synthetic */ int ck;
    static /* synthetic */ WorldArea dh;
    public static final /* synthetic */ WorldPoint dd;
    public static final /* synthetic */ int cZ;
    public static /* synthetic */ List<C0003d> bu;
    private static /* synthetic */ String[] llllllIlIl;
    public static final /* synthetic */ WorldPoint de;
    public static final /* synthetic */ int cX;
    public static final /* synthetic */ WorldPoint db;
    public static final /* synthetic */ WorldPoint da;
    public static /* synthetic */ boolean bs;
    public static final /* synthetic */ int cW;
    static /* synthetic */ String[] bQ;
    private static /* synthetic */ int[] llllllIlll;
    public static final /* synthetic */ int cY;
    public static final /* synthetic */ WorldPoint dc;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint df;
    static /* synthetic */ int dg;

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllllIlIl[llllllIlll[178]];
    }

    private static boolean llIlIlllllIII(int i) {
        return i < 0;
    }

    private static String llIlIlllIlIII(String lllllllllllllllllIlIIIlIIlIIlllI, String lllllllllllllllllIlIIIlIIlIIllIl) {
        String lllllllllllllllllIlIIIlIIlIIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIlIIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIlIIIlIIlIIlIll = lllllllllllllllllIlIIIlIIlIIllIl.toCharArray();
        int lllllllllllllllllIlIIIlIIlIIlIlI = llllllIlll[1];
        char[] charArray = lllllllllllllllllIlIIIlIIlIIlllI2.toCharArray();
        int lllllllllllllllllIlIIIlIIlIIIIll = charArray.length;
        int i = llllllIlll[1];
        while (llIlIllllIIlI(i, lllllllllllllllllIlIIIlIIlIIIIll)) {
            char lllllllllllllllllIlIIIlIIlIIllll = charArray[i];
            sb.append((char) (lllllllllllllllllIlIIIlIIlIIllll ^ lllllllllllllllllIlIIIlIIlIIlIll[lllllllllllllllllIlIIIlIIlIIlIlI % lllllllllllllllllIlIIIlIIlIIlIll.length]));
            "".length();
            lllllllllllllllllIlIIIlIIlIIlIlI++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIllllIlII(C0004e.j(llllllIlll[4]), llllllIlll[145])) {
            ?? r0 = llllllIlll[0];
            "".length();
            return 0 != 0 ? ((((117 + 240) - 211) + 97) ^ (((40 + 16) - (-38)) + 76)) & (((((148 + 0) - 9) + 103) ^ (((61 + 101) - 148) + 157)) ^ (-" ".length())) : r0;
        }
        return llllllIlll[1];
    }

    private static boolean llIlIllllIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIllllIllI(Object obj) {
        return obj != null;
    }

    private static boolean llIlIlllllIIl(int i, int i2) {
        return i > i2;
    }

    private static String llIlIlllIIlll(String lllllllllllllllllIlIIIlIIlIllllI, String lllllllllllllllllIlIIIlIIlIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIlIIlIlllIl.getBytes(StandardCharsets.UTF_8)), llllllIlll[28]), "DES");
            Cipher lllllllllllllllllIlIIIlIIllIIIII = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIlIIllIIIII.init(llllllIlll[7], secretKeySpec);
            return new String(lllllllllllllllllIlIIIlIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIlIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIlIIlIlllll) {
            lllllllllllllllllIlIIIlIIlIlllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c3, code lost:
        if (llIlIllllIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C0017r.llllllIlll[10]) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[llllllIlll[0]];
        iArr3[llllllIlll[1]] = llllllIlll[20];
        if (llIlIllllIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlll[20], llllllIlll[0], llllllIlll[169]));
            "".length();
        }
        int[] iArr4 = new int[llllllIlll[0]];
        iArr4[llllllIlll[1]] = llllllIlll[18];
        if (llIlIllllIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlll[18], llllllIlll[0], llllllIlll[170]));
            "".length();
        }
        int[] iArr5 = new int[llllllIlll[0]];
        iArr5[llllllIlll[1]] = llllllIlll[14];
        if (llIlIllllIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlll[14], llllllIlll[10], C0004e.c(llllllIlll[171], llllllIlll[172])));
            "".length();
        }
        int[] iArr6 = new int[llllllIlll[0]];
        iArr6[llllllIlll[1]] = llllllIlll[16];
        if (llIlIllllIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlll[16], llllllIlll[11], llllllIlll[173]));
            "".length();
        }
        int[] iArr7 = new int[llllllIlll[0]];
        iArr7[llllllIlll[1]] = llllllIlll[17];
        if (llIlIllllIIll(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(llllllIlll[17], llllllIlll[5], C0008i.bp));
            "".length();
        }
        int[] iArr8 = new int[llllllIlll[0]];
        iArr8[llllllIlll[1]] = llllllIlll[9];
        if (llIlIllllIIIl(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llllllIlll[0]];
            iArr9[llllllIlll[1]] = llllllIlll[9];
            if (llIlIllllIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llllllIlll[0]];
                iArr10[llllllIlll[1]] = llllllIlll[9];
            }
            iArr = new int[llllllIlll[0]];
            iArr[llllllIlll[1]] = llllllIlll[15];
            if (llIlIllllIIll(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(llllllIlll[15], llllllIlll[0], llllllIlll[169]));
                "".length();
            }
            if (llIlIllllIIll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llllllIlIl[llllllIlll[179]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(llllllIlll[175], llllllIlll[5], llllllIlll[176]));
                "".length();
            }
            iArr2 = new int[llllllIlll[0]];
            iArr2[llllllIlll[1]] = llllllIlll[13];
            if (llIlIllllIIll(Bank.contains(iArr2) ? 1 : 0)) {
                return;
            }
            bu.add(new C0003d(llllllIlll[13], llllllIlll[71], llllllIlll[177]));
            "".length();
            return;
        }
        bu.add(new C0003d(llllllIlll[9], llllllIlll[61], llllllIlll[174]));
        "".length();
        iArr = new int[llllllIlll[0]];
        iArr[llllllIlll[1]] = llllllIlll[15];
        if (llIlIllllIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (llIlIllllIIll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llllllIlIl[llllllIlll[179]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[llllllIlll[0]];
        iArr2[llllllIlll[1]] = llllllIlll[13];
        if (llIlIllllIIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1076, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1085, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v149, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v194, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v196, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v222, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v224, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v352, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v354, types: [boolean] */
    public static void aY() {
        if (llIlIllllIIIl(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIlIllllIIlI(bu.size(), llllllIlll[0])) {
                System.out.println(llllllIlIl[llllllIlll[1]]);
                bs = llllllIlll[1];
            }
        }
        if (llIlIllllIIll(bs ? 1 : 0)) {
            if (!llIlIllllIlII(C0004e.j(llllllIlll[2]), llllllIlll[3]) || llIlIllllIIlI(C0004e.j(llllllIlll[4]), llllllIlll[5])) {
                C0018s.bc();
            }
            if (llIlIllllIIll(ba() ? 1 : 0) && llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[5]) && llIlIllllIlII(C0004e.j(llllllIlll[2]), llllllIlll[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIllllIllI(nearest) && llIlIllllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[0]];
                    C0000a.a(nearest);
                }
                if (llIlIllllIllI(nearest) && llIlIllllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlIllllIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllllIlll[6]);
                        "".length();
                    }
                    if (llIlIllllIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[7]];
                        if (llIlIllllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllllIlll[8]);
                            "".length();
                        }
                        if (llIlIllllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllllIlll[7]);
                            "".length();
                        }
                        int[] iArr = new int[llllllIlll[0]];
                        iArr[llllllIlll[1]] = llllllIlll[9];
                        if (llIlIllllIIIl(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llllllIlll[0]];
                            iArr2[llllllIlll[1]] = llllllIlll[9];
                            if (llIlIllllIIlI(Bank.getFirst(iArr2).getQuantity(), llllllIlll[10])) {
                                ae();
                                System.out.println(llllllIlIl[llllllIlll[11]]);
                                bs = llllllIlll[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[llllllIlll[12]];
                        iArr3[llllllIlll[1]] = llllllIlll[13];
                        iArr3[llllllIlll[0]] = llllllIlll[14];
                        iArr3[llllllIlll[7]] = llllllIlll[15];
                        iArr3[llllllIlll[11]] = llllllIlll[16];
                        iArr3[llllllIlll[8]] = llllllIlll[9];
                        iArr3[llllllIlll[5]] = llllllIlll[17];
                        if (llIlIllllIIll(C0004e.b(iArr3) ? 1 : 0)) {
                            ae();
                            System.out.println(llllllIlIl[llllllIlll[8]]);
                            bs = llllllIlll[0];
                            return;
                        }
                        int[] iArr4 = new int[llllllIlll[12]];
                        iArr4[llllllIlll[1]] = llllllIlll[13];
                        iArr4[llllllIlll[0]] = llllllIlll[14];
                        iArr4[llllllIlll[7]] = llllllIlll[15];
                        iArr4[llllllIlll[11]] = llllllIlll[16];
                        iArr4[llllllIlll[8]] = llllllIlll[9];
                        iArr4[llllllIlll[5]] = llllllIlll[17];
                        if (llIlIllllIIIl(C0004e.b(iArr4) ? 1 : 0)) {
                            C0000a.a(llllllIlll[18], llllllIlll[7]);
                            C0000a.a(llllllIlll[19], llllllIlll[0]);
                            C0000a.a(llllllIlll[20], llllllIlll[0]);
                            C0000a.a(llllllIlll[13], llllllIlll[10]);
                            C0000a.a(llllllIlll[14], llllllIlll[10]);
                            C0000a.a(llllllIlll[15], llllllIlll[0]);
                            C0000a.a(llllllIlll[16], llllllIlll[11]);
                            C0000a.a(llllllIlll[17], llllllIlll[8]);
                            C0000a.a(llllllIlll[9], llllllIlll[21]);
                        }
                    }
                }
            }
            if (llIlIllllIIIl(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlIllllIIlI(Movement.getRunEnergy(), llllllIlll[22])) {
                Inventory.getFirst(C0005f.aU).interact(llllllIlIl[llllllIlll[5]]);
                Time.sleepTicks(llllllIlll[0]);
                "".length();
            }
            int[] iArr5 = new int[llllllIlll[0]];
            iArr5[llllllIlll[1]] = llllllIlll[9];
            if (llIlIllllIIIl(Inventory.contains(iArr5) ? 1 : 0) && llIlIlllllIII(llIlIllllIIII(C0004e.u(), 60.0d))) {
                int[] iArr6 = new int[llllllIlll[0]];
                iArr6[llllllIlll[1]] = llllllIlll[9];
                Inventory.getFirst(iArr6).interact(llllllIlIl[llllllIlll[12]]);
                Time.sleepTicks(llllllIlll[0]);
                "".length();
            }
            WorldPoint worldPoint = new WorldPoint(llllllIlll[23], llllllIlll[24], llllllIlll[1]);
            WorldPoint worldPoint2 = new WorldPoint(llllllIlll[25], llllllIlll[24], llllllIlll[1]);
            WorldPoint worldPoint3 = new WorldPoint(llllllIlll[26], llllllIlll[24], llllllIlll[1]);
            WorldPoint worldPoint4 = new WorldPoint(llllllIlll[27], llllllIlll[24], llllllIlll[1]);
            if (!llIlIllllIIll(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !llIlIllllIIll(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) || !llIlIllllIIll(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                String[] strArr = new String[llllllIlll[0]];
                strArr[llllllIlll[1]] = llllllIlIl[llllllIlll[21]];
                TileObjects.getNearest(strArr).interact(llllllIlIl[llllllIlll[28]]);
                Time.sleepTicks(llllllIlll[29]);
                "".length();
            }
            if (llIlIllllIlII(C0004e.j(llllllIlll[4]), llllllIlll[5]) && llIlIllllIIlI(C0004e.j(llllllIlll[4]), llllllIlll[30]) && llIlIllllIIIl(ba() ? 1 : 0)) {
                if (llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(da), llllllIlll[31])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[32]];
                    int[] iArr7 = new int[llllllIlll[0]];
                    iArr7[llllllIlll[1]] = llllllIlll[14];
                    if (llIlIllllIIIl(Inventory.contains(iArr7) ? 1 : 0) && llIlIllllIlIl(Players.getLocal().getAnimation(), llllllIlll[33])) {
                        int[] iArr8 = new int[llllllIlll[0]];
                        iArr8[llllllIlll[1]] = llllllIlll[14];
                        Inventory.getFirst(iArr8).interact(llllllIlIl[llllllIlll[10]]);
                        Time.sleepTicks(llllllIlll[7]);
                        "".length();
                    }
                }
                if (llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(da), llllllIlll[31])) {
                    if (llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[34]];
                        if (llIlIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (!llIlIllllIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0) || llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllllIlll[37], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                            C0004e.b(new WorldPoint(llllllIlll[38], llllllIlll[39], llllllIlll[1]));
                            Time.sleepTicks(llllllIlll[8]);
                            "".length();
                        }
                        Widget widget = Widgets.get(llllllIlll[40], llllllIlll[30]);
                        if (llIlIllllIllI(widget)) {
                            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llllllIlll[0]);
                            Time.sleepTicks(llllllIlll[11]);
                            "".length();
                        }
                        Widget widget2 = Widgets.get(llllllIlll[40], llllllIlll[41]);
                        if (llIlIllllIllI(widget2)) {
                            Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) llllllIlll[0]);
                            Time.sleepTicks(llllllIlll[11]);
                            "".length();
                        }
                        if (llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllllIlll[42], llllllIlll[43], llllllIlll[1])) ? 1 : 0)) {
                            C0004e.b(new WorldPoint(llllllIlll[44], llllllIlll[45], llllllIlll[1]));
                            Time.sleepTicks(C0004e.c(llllllIlll[5], llllllIlll[28]));
                            "".length();
                        }
                        if (llIlIllllIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0) && llIlIllllIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllllIlll[37], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                            Movement.walkTo(de);
                            "".length();
                            Time.sleepTicks(llllllIlll[0]);
                            "".length();
                        }
                    }
                    if (llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                        C0004e.l(llllllIlll[19]);
                        String[] strArr2 = new String[llllllIlll[0]];
                        strArr2[llllllIlll[1]] = llllllIlIl[llllllIlll[46]];
                        if (llIlIllllIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[47]];
                            String[] strArr3 = new String[llllllIlll[0]];
                            strArr3[llllllIlll[1]] = llllllIlIl[llllllIlll[48]];
                            TileItem nearest2 = TileItems.getNearest(strArr3);
                            if (llIlIllllIllI(nearest2)) {
                                String[] strArr4 = new String[llllllIlll[0]];
                                strArr4[llllllIlll[1]] = llllllIlIl[llllllIlll[29]];
                                if (llIlIlllllIll(TileItems.getNearest(strArr4))) {
                                    nearest2.interact(llllllIlIl[llllllIlll[49]]);
                                    Time.sleepTicks(llllllIlll[7]);
                                    "".length();
                                }
                            }
                            String[] strArr5 = new String[llllllIlll[0]];
                            strArr5[llllllIlll[1]] = llllllIlIl[llllllIlll[41]];
                            TileItem nearest3 = TileItems.getNearest(strArr5);
                            if (llIlIllllIllI(nearest3)) {
                                nearest3.interact(llllllIlIl[llllllIlll[50]]);
                                Time.sleepTicks(llllllIlll[0]);
                                "".length();
                            }
                        }
                        String[] strArr6 = new String[llllllIlll[0]];
                        strArr6[llllllIlll[1]] = llllllIlIl[llllllIlll[51]];
                        if (llIlIllllIIIl(Inventory.contains(strArr6) ? 1 : 0)) {
                            String[] strArr7 = new String[llllllIlll[0]];
                            strArr7[llllllIlll[1]] = llllllIlIl[llllllIlll[30]];
                            if (llIlIllllIIll(Inventory.contains(strArr7) ? 1 : 0)) {
                                String[] strArr8 = new String[llllllIlll[0]];
                                strArr8[llllllIlll[1]] = llllllIlIl[llllllIlll[52]];
                                TileObjects.getNearest(strArr8).interact(llllllIlIl[llllllIlll[53]]);
                                Time.sleepTicks(llllllIlll[7]);
                                "".length();
                            }
                        }
                        String[] strArr9 = new String[llllllIlll[0]];
                        strArr9[llllllIlll[1]] = llllllIlIl[llllllIlll[54]];
                        if (llIlIlllllIll(NPCs.getNearest(strArr9))) {
                            String[] strArr10 = new String[llllllIlll[0]];
                            strArr10[llllllIlll[1]] = llllllIlIl[llllllIlll[55]];
                            TileObjects.getNearest(strArr10).interact(llllllIlIl[llllllIlll[56]]);
                            Time.sleepTicks(llllllIlll[8]);
                            "".length();
                        }
                        String[] strArr11 = new String[llllllIlll[0]];
                        strArr11[llllllIlll[1]] = llllllIlIl[llllllIlll[57]];
                        if (llIlIllllIllI(NPCs.getNearest(strArr11))) {
                            C0006g.a(llllllIlIl[llllllIlll[58]], bQ);
                        }
                    }
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[30])) {
                ck = llllllIlll[1];
                String[] strArr12 = new String[llllllIlll[0]];
                strArr12[llllllIlll[1]] = llllllIlIl[llllllIlll[59]];
                if (llIlIllllIIIl(Inventory.contains(strArr12) ? 1 : 0)) {
                    String[] strArr13 = new String[llllllIlll[0]];
                    strArr13[llllllIlll[1]] = llllllIlIl[llllllIlll[60]];
                    if (llIlIllllIIIl(Inventory.contains(strArr13) ? 1 : 0)) {
                        int[] iArr9 = new int[llllllIlll[0]];
                        iArr9[llllllIlll[1]] = llllllIlll[19];
                        if (llIlIllllIIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[llllllIlll[0]];
                            iArr10[llllllIlll[1]] = llllllIlll[19];
                            if (llIlIllllIIll(Equipment.contains(iArr10) ? 1 : 0)) {
                                int[] iArr11 = new int[llllllIlll[0]];
                                iArr11[llllllIlll[1]] = llllllIlll[19];
                                Inventory.getFirst(iArr11).interact(llllllIlIl[llllllIlll[61]]);
                            }
                        }
                        String[] strArr14 = new String[llllllIlll[0]];
                        strArr14[llllllIlll[1]] = llllllIlIl[llllllIlll[62]];
                        if (llIlIlllllIll(NPCs.getNearest(strArr14))) {
                            String[] strArr15 = new String[llllllIlll[0]];
                            strArr15[llllllIlll[1]] = llllllIlIl[llllllIlll[63]];
                            TileObjects.getNearest(strArr15).interact(llllllIlIl[llllllIlll[64]]);
                            Time.sleepTicks(llllllIlll[8]);
                            "".length();
                        }
                        String[] strArr16 = new String[llllllIlll[0]];
                        strArr16[llllllIlll[1]] = llllllIlIl[llllllIlll[65]];
                        if (llIlIllllIllI(NPCs.getNearest(strArr16))) {
                            if (llIlIllllIIlI(dg, llllllIlll[0])) {
                                String[] strArr17 = new String[llllllIlll[0]];
                                strArr17[llllllIlll[1]] = llllllIlIl[llllllIlll[66]];
                                Item first = Inventory.getFirst(strArr17);
                                String[] strArr18 = new String[llllllIlll[0]];
                                strArr18[llllllIlll[1]] = llllllIlIl[llllllIlll[67]];
                                first.useOn(NPCs.getNearest(strArr18));
                                Time.sleepTicks(llllllIlll[11]);
                                "".length();
                                dg += llllllIlll[0];
                            }
                            if (llIlIllllIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr19 = new String[llllllIlll[0]];
                                strArr19[llllllIlll[1]] = llllllIlIl[llllllIlll[68]];
                                Item first2 = Inventory.getFirst(strArr19);
                                String[] strArr20 = new String[llllllIlll[0]];
                                strArr20[llllllIlll[1]] = llllllIlIl[llllllIlll[69]];
                                first2.useOn(NPCs.getNearest(strArr20));
                                Time.sleepTicks(llllllIlll[11]);
                                "".length();
                            }
                            C0006g.a(bQ);
                        }
                    }
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[56])) {
                String[] strArr21 = new String[llllllIlll[0]];
                strArr21[llllllIlll[1]] = llllllIlIl[llllllIlll[70]];
                if (llIlIlllllIll(NPCs.getNearest(strArr21))) {
                    String[] strArr22 = new String[llllllIlll[0]];
                    strArr22[llllllIlll[1]] = llllllIlIl[llllllIlll[71]];
                    TileObjects.getNearest(strArr22).interact(llllllIlIl[llllllIlll[72]]);
                    Time.sleepTicks(llllllIlll[8]);
                    "".length();
                }
                if (llIlIllllIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr23 = new String[llllllIlll[0]];
                    strArr23[llllllIlll[1]] = llllllIlIl[llllllIlll[73]];
                    Item first3 = Inventory.getFirst(strArr23);
                    String[] strArr24 = new String[llllllIlll[0]];
                    strArr24[llllllIlll[1]] = llllllIlIl[llllllIlll[74]];
                    first3.useOn(NPCs.getNearest(strArr24));
                }
                C0006g.a(bQ);
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[61])) {
                String[] strArr25 = new String[llllllIlll[0]];
                strArr25[llllllIlll[1]] = llllllIlIl[llllllIlll[75]];
                if (llIlIlllllIll(NPCs.getNearest(strArr25))) {
                    String[] strArr26 = new String[llllllIlll[0]];
                    strArr26[llllllIlll[1]] = llllllIlIl[llllllIlll[76]];
                    TileObjects.getNearest(strArr26).interact(llllllIlIl[llllllIlll[77]]);
                    Time.sleepTicks(llllllIlll[8]);
                    "".length();
                }
                String[] strArr27 = new String[llllllIlll[0]];
                strArr27[llllllIlll[1]] = llllllIlIl[llllllIlll[78]];
                if (llIlIllllIllI(NPCs.getNearest(strArr27))) {
                    C0006g.a(llllllIlIl[llllllIlll[79]], bQ);
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[66])) {
                if (llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[80]];
                    int[] iArr12 = new int[llllllIlll[0]];
                    iArr12[llllllIlll[1]] = llllllIlll[14];
                    if (llIlIllllIIIl(Inventory.contains(iArr12) ? 1 : 0) && llIlIllllIlIl(Players.getLocal().getAnimation(), llllllIlll[33])) {
                        int[] iArr13 = new int[llllllIlll[0]];
                        iArr13[llllllIlll[1]] = llllllIlll[14];
                        Inventory.getFirst(iArr13).interact(llllllIlIl[llllllIlll[22]]);
                        Time.sleepTicks(llllllIlll[7]);
                        "".length();
                    }
                }
                if (llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[12]) && llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[81]];
                    Movement.walkTo(df);
                    "".length();
                    Time.sleepTicks(llllllIlll[0]);
                    "".length();
                }
                String[] strArr28 = new String[llllllIlll[0]];
                strArr28[llllllIlll[1]] = llllllIlIl[llllllIlll[82]];
                if (llIlIllllIllI(TileObjects.getNearest(strArr28))) {
                    String[] strArr29 = new String[llllllIlll[0]];
                    strArr29[llllllIlll[1]] = llllllIlIl[llllllIlll[83]];
                    TileObjects.getNearest(strArr29).interact(llllllIlIl[llllllIlll[84]]);
                    Time.sleepTicks(llllllIlll[11]);
                    "".length();
                }
                if (llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[29])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[85]];
                    C0006g.a(llllllIlIl[llllllIlll[86]], bQ);
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[71])) {
                if (llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[87]];
                    int[] iArr14 = new int[llllllIlll[0]];
                    iArr14[llllllIlll[1]] = llllllIlll[14];
                    if (llIlIllllIIIl(Inventory.contains(iArr14) ? 1 : 0) && llIlIllllIlIl(Players.getLocal().getAnimation(), llllllIlll[33])) {
                        int[] iArr15 = new int[llllllIlll[0]];
                        iArr15[llllllIlll[1]] = llllllIlll[14];
                        Inventory.getFirst(iArr15).interact(llllllIlIl[llllllIlll[88]]);
                        Time.sleepTicks(llllllIlll[7]);
                        "".length();
                    }
                }
                if (llIlIllllIIll(Players.getLocal().getWorldLocation().equals(dc) ? 1 : 0) && llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[89]];
                    Movement.walkTo(dc);
                    "".length();
                    Time.sleepTicks(llllllIlll[0]);
                    "".length();
                    Widget widget3 = Widgets.get(llllllIlll[40], llllllIlll[30]);
                    if (llIlIllllIllI(widget3)) {
                        Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) llllllIlll[0]);
                        Time.sleepTicks(llllllIlll[11]);
                        "".length();
                    }
                    Widget widget4 = Widgets.get(llllllIlll[40], llllllIlll[41]);
                    if (llIlIllllIllI(widget4)) {
                        Mouse.click(widget4.getClickPoint().getX(), widget4.getClickPoint().getY(), (boolean) llllllIlll[0]);
                        Time.sleepTicks(llllllIlll[11]);
                        "".length();
                    }
                }
                if (llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(dc) ? 1 : 0)) {
                    int[] iArr16 = new int[llllllIlll[0]];
                    iArr16[llllllIlll[1]] = llllllIlll[90];
                    if (llIlIllllIIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llllllIlll[0]];
                        iArr17[llllllIlll[1]] = llllllIlll[90];
                        Inventory.getFirst(iArr17).interact(llllllIlIl[llllllIlll[3]]);
                        Time.sleepTicks(llllllIlll[7]);
                        "".length();
                    }
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[76])) {
                String[] strArr30 = new String[llllllIlll[0]];
                strArr30[llllllIlll[1]] = llllllIlIl[llllllIlll[91]];
                TileObject nearest4 = TileObjects.getNearest(strArr30);
                if (llIlIllllIllI(nearest4)) {
                    nearest4.interact(llllllIlIl[llllllIlll[92]]);
                    Time.sleepTicks(llllllIlll[7]);
                    "".length();
                }
                String[] strArr31 = new String[llllllIlll[0]];
                strArr31[llllllIlll[1]] = llllllIlIl[llllllIlll[93]];
                TileItem nearest5 = TileItems.getNearest(strArr31);
                if (llIlIllllIllI(nearest5)) {
                    nearest5.interact(llllllIlIl[llllllIlll[94]]);
                    Time.sleepTicks(llllllIlll[7]);
                    "".length();
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[22])) {
                if (llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[95]];
                    Movement.walkTo(de);
                    "".length();
                    Time.sleepTicks(llllllIlll[0]);
                    "".length();
                    if (llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllllIlll[42], llllllIlll[43], llllllIlll[1])) ? 1 : 0)) {
                        C0004e.b(new WorldPoint(llllllIlll[44], llllllIlll[45], llllllIlll[1]));
                        Time.sleepTicks(C0004e.c(llllllIlll[5], llllllIlll[28]));
                        "".length();
                    }
                    if (llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                        C0004e.b(new WorldPoint(llllllIlll[38], llllllIlll[39], llllllIlll[1]));
                        Time.sleepTicks(llllllIlll[8]);
                        "".length();
                    }
                    Widget widget5 = Widgets.get(llllllIlll[40], llllllIlll[30]);
                    if (llIlIllllIllI(widget5)) {
                        Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) llllllIlll[0]);
                        Time.sleepTicks(llllllIlll[11]);
                        "".length();
                    }
                    Widget widget6 = Widgets.get(llllllIlll[40], llllllIlll[41]);
                    if (llIlIllllIllI(widget6)) {
                        Mouse.click(widget6.getClickPoint().getX(), widget6.getClickPoint().getY(), (boolean) llllllIlll[0]);
                        Time.sleepTicks(llllllIlll[11]);
                        "".length();
                    }
                }
                if (llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                    String[] strArr32 = new String[llllllIlll[0]];
                    strArr32[llllllIlll[1]] = llllllIlIl[llllllIlll[96]];
                    if (llIlIlllllIll(NPCs.getNearest(strArr32))) {
                        String[] strArr33 = new String[llllllIlll[0]];
                        strArr33[llllllIlll[1]] = llllllIlIl[llllllIlll[97]];
                        TileObjects.getNearest(strArr33).interact(llllllIlIl[llllllIlll[98]]);
                        Time.sleepTicks(llllllIlll[8]);
                        "".length();
                    }
                    String[] strArr34 = new String[llllllIlll[0]];
                    strArr34[llllllIlll[1]] = llllllIlIl[llllllIlll[99]];
                    if (llIlIllllIllI(NPCs.getNearest(strArr34))) {
                        C0006g.a(llllllIlIl[llllllIlll[100]], bQ);
                    }
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[85])) {
                String[] strArr35 = new String[llllllIlll[0]];
                strArr35[llllllIlll[1]] = llllllIlIl[llllllIlll[101]];
                if (llIlIllllIIIl(Inventory.contains(strArr35) ? 1 : 0)) {
                    String[] strArr36 = new String[llllllIlll[0]];
                    strArr36[llllllIlll[1]] = llllllIlIl[llllllIlll[102]];
                    if (llIlIlllllIIl(Inventory.getAll(strArr36).size(), llllllIlll[11])) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[103]];
                        String[] strArr37 = new String[llllllIlll[0]];
                        strArr37[llllllIlll[1]] = llllllIlIl[llllllIlll[104]];
                        Item first4 = Inventory.getFirst(strArr37);
                        int[] iArr18 = new int[llllllIlll[0]];
                        iArr18[llllllIlll[1]] = llllllIlll[105];
                        first4.useOn(TileObjects.getNearest(iArr18));
                        Time.sleepTicks(llllllIlll[11]);
                        "".length();
                    }
                }
                String[] strArr38 = new String[llllllIlll[0]];
                strArr38[llllllIlll[1]] = llllllIlIl[llllllIlll[106]];
                if (llIlIllllIIIl(Inventory.contains(strArr38) ? 1 : 0)) {
                    String[] strArr39 = new String[llllllIlll[0]];
                    strArr39[llllllIlll[1]] = llllllIlIl[llllllIlll[107]];
                    Item first5 = Inventory.getFirst(strArr39);
                    int[] iArr19 = new int[llllllIlll[0]];
                    iArr19[llllllIlll[1]] = llllllIlll[108];
                    first5.useOn(TileObjects.getNearest(iArr19));
                    Time.sleepTicks(llllllIlll[11]);
                    "".length();
                }
                String[] strArr40 = new String[llllllIlll[0]];
                strArr40[llllllIlll[1]] = llllllIlIl[llllllIlll[109]];
                if (llIlIllllIIll(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[llllllIlll[0]];
                    strArr41[llllllIlll[1]] = llllllIlIl[llllllIlll[110]];
                    if (llIlIlllllIlI(Inventory.getAll(strArr41).size(), llllllIlll[11])) {
                        int[] iArr20 = new int[llllllIlll[0]];
                        iArr20[llllllIlll[1]] = llllllIlll[111];
                        WorldPoint worldLocation = TileObjects.getNearest(iArr20).getWorldLocation();
                        if (llIlIllllIIll(Players.getLocal().getWorldLocation().equals(worldLocation) ? 1 : 0)) {
                            Movement.walkTo(worldLocation);
                            "".length();
                            Time.sleepTicks(llllllIlll[0]);
                            "".length();
                        }
                        if (llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(worldLocation) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[112]];
                            C0006g.a(llllllIlIl[llllllIlll[113]], bQ);
                        }
                    }
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[3]) && llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dd), llllllIlll[10])) {
                String[] strArr42 = new String[llllllIlll[0]];
                strArr42[llllllIlll[1]] = llllllIlIl[llllllIlll[114]];
                TileObjects.getNearest(strArr42).interact(llllllIlIl[llllllIlll[115]]);
                Time.sleepTicks(llllllIlll[8]);
                "".length();
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[95])) {
                String[] strArr43 = new String[llllllIlll[0]];
                strArr43[llllllIlll[1]] = llllllIlIl[llllllIlll[116]];
                if (llIlIlllllIll(NPCs.getNearest(strArr43))) {
                    int[] iArr21 = new int[llllllIlll[0]];
                    iArr21[llllllIlll[1]] = llllllIlll[117];
                    TileObjects.getNearest(iArr21).interact(llllllIlIl[llllllIlll[118]]);
                    Time.sleepTicks(llllllIlll[8]);
                    "".length();
                }
                String[] strArr44 = new String[llllllIlll[0]];
                strArr44[llllllIlll[1]] = llllllIlIl[llllllIlll[119]];
                if (llIlIllllIllI(NPCs.getNearest(strArr44))) {
                    C0006g.a(llllllIlIl[llllllIlll[120]], bQ);
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[100])) {
                String[] strArr45 = new String[llllllIlll[0]];
                strArr45[llllllIlll[1]] = llllllIlIl[llllllIlll[121]];
                if (llIlIlllllIll(NPCs.getNearest(strArr45))) {
                    String[] strArr46 = new String[llllllIlll[0]];
                    strArr46[llllllIlll[1]] = llllllIlIl[llllllIlll[122]];
                    if (llIlIlllllIll(NPCs.getNearest(strArr46))) {
                        int[] iArr22 = new int[llllllIlll[0]];
                        iArr22[llllllIlll[1]] = llllllIlll[117];
                        TileObjects.getNearest(iArr22).interact(llllllIlIl[llllllIlll[123]]);
                        Time.sleepTicks(llllllIlll[8]);
                        "".length();
                    }
                }
                String[] strArr47 = new String[llllllIlll[0]];
                strArr47[llllllIlll[1]] = llllllIlIl[llllllIlll[124]];
                if (llIlIllllIllI(NPCs.getNearest(strArr47))) {
                    C0006g.a(llllllIlIl[llllllIlll[125]], bQ);
                }
                String[] strArr48 = new String[llllllIlll[0]];
                strArr48[llllllIlll[1]] = llllllIlIl[llllllIlll[126]];
                if (llIlIllllIllI(NPCs.getNearest(strArr48))) {
                    C0006g.a(llllllIlIl[llllllIlll[127]], bQ);
                }
            }
            if (llIlIllllIlII(C0004e.j(llllllIlll[4]), llllllIlll[106]) && llIlIlllllIlI(C0004e.j(llllllIlll[4]), llllllIlll[119])) {
                if (llIlIllllIIIl(Dialog.isOpen() ? 1 : 0)) {
                    C0006g.a(bQ);
                }
                String[] strArr49 = new String[llllllIlll[0]];
                strArr49[llllllIlll[1]] = llllllIlIl[llllllIlll[128]];
                if (llIlIllllIllI(TileObjects.getNearest(strArr49))) {
                    String[] strArr50 = new String[llllllIlll[0]];
                    strArr50[llllllIlll[1]] = llllllIlIl[llllllIlll[129]];
                    if (llIlIllllIIIl(Inventory.contains(strArr50) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[130]];
                        int[] iArr23 = new int[llllllIlll[0]];
                        iArr23[llllllIlll[1]] = llllllIlll[14];
                        if (llIlIllllIIIl(Inventory.contains(iArr23) ? 1 : 0) && llIlIllllIlIl(Players.getLocal().getAnimation(), llllllIlll[33])) {
                            int[] iArr24 = new int[llllllIlll[0]];
                            iArr24[llllllIlll[1]] = llllllIlll[14];
                            Inventory.getFirst(iArr24).interact(llllllIlIl[llllllIlll[131]]);
                            Time.sleepTicks(llllllIlll[7]);
                            "".length();
                        }
                    }
                }
                if (llIlIllllIIll(Players.getLocal().getWorldLocation().equals(dc) ? 1 : 0) && llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(df), llllllIlll[12])) {
                    String[] strArr51 = new String[llllllIlll[0]];
                    strArr51[llllllIlll[1]] = llllllIlIl[llllllIlll[132]];
                    if (llIlIlllllIll(TileObjects.getNearest(strArr51))) {
                        AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[133]];
                        Movement.walkTo(dc);
                        "".length();
                        Time.sleepTicks(llllllIlll[0]);
                        "".length();
                        Widget widget7 = Widgets.get(llllllIlll[40], llllllIlll[30]);
                        if (llIlIllllIllI(widget7)) {
                            Mouse.click(widget7.getClickPoint().getX(), widget7.getClickPoint().getY(), (boolean) llllllIlll[0]);
                            Time.sleepTicks(llllllIlll[11]);
                            "".length();
                        }
                        Widget widget8 = Widgets.get(llllllIlll[40], llllllIlll[41]);
                        if (llIlIllllIllI(widget8)) {
                            Mouse.click(widget8.getClickPoint().getX(), widget8.getClickPoint().getY(), (boolean) llllllIlll[0]);
                            Time.sleepTicks(llllllIlll[11]);
                            "".length();
                        }
                    }
                }
                if (llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(dc) ? 1 : 0)) {
                    int[] iArr25 = new int[llllllIlll[0]];
                    iArr25[llllllIlll[1]] = llllllIlll[134];
                    if (llIlIllllIIIl(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[llllllIlll[0]];
                        iArr26[llllllIlll[1]] = llllllIlll[134];
                        Inventory.getFirst(iArr26).interact(llllllIlIl[llllllIlll[135]]);
                        Time.sleepTicks(llllllIlll[7]);
                        "".length();
                    }
                }
                String[] strArr52 = new String[llllllIlll[0]];
                strArr52[llllllIlll[1]] = llllllIlIl[llllllIlll[136]];
                TileObject nearest6 = TileObjects.getNearest(strArr52);
                if (llIlIllllIllI(nearest6)) {
                    nearest6.interact(llllllIlIl[llllllIlll[137]]);
                    Time.sleepTicks(llllllIlll[7]);
                    "".length();
                }
                String[] strArr53 = new String[llllllIlll[0]];
                strArr53[llllllIlll[1]] = llllllIlIl[llllllIlll[138]];
                TileItem nearest7 = TileItems.getNearest(strArr53);
                if (llIlIllllIllI(nearest7)) {
                    nearest7.interact(llllllIlIl[llllllIlll[139]]);
                    Time.sleepTicks(llllllIlll[7]);
                    "".length();
                }
                String[] strArr54 = new String[llllllIlll[0]];
                strArr54[llllllIlll[1]] = llllllIlIl[llllllIlll[140]];
                if (llIlIllllIIIl(Inventory.contains(strArr54) ? 1 : 0) && llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(dc) ? 1 : 0)) {
                    String[] strArr55 = new String[llllllIlll[0]];
                    strArr55[llllllIlll[1]] = llllllIlIl[llllllIlll[141]];
                    if (llIlIllllIIIl(Inventory.contains(strArr55) ? 1 : 0)) {
                        String[] strArr56 = new String[llllllIlll[0]];
                        strArr56[llllllIlll[1]] = llllllIlIl[llllllIlll[142]];
                        Inventory.getFirst(strArr56).interact(llllllIlIl[llllllIlll[143]]);
                        Time.sleepTicks(llllllIlll[0]);
                        "".length();
                    }
                }
            }
            if (llIlIllllIlII(C0004e.j(llllllIlll[4]), llllllIlll[124]) && llIlIllllIIlI(C0004e.j(llllllIlll[4]), llllllIlll[140])) {
                int[] iArr27 = new int[llllllIlll[0]];
                iArr27[llllllIlll[1]] = llllllIlll[20];
                if (llIlIllllIIll(Equipment.contains(iArr27) ? 1 : 0)) {
                    int[] iArr28 = new int[llllllIlll[0]];
                    iArr28[llllllIlll[1]] = llllllIlll[20];
                    if (llIlIllllIIIl(Inventory.contains(iArr28) ? 1 : 0)) {
                        int[] iArr29 = new int[llllllIlll[0]];
                        iArr29[llllllIlll[1]] = llllllIlll[20];
                        Inventory.getFirst(iArr29).interact(llllllIlIl[llllllIlll[144]]);
                    }
                }
                String[] strArr57 = new String[llllllIlll[0]];
                strArr57[llllllIlll[1]] = llllllIlIl[llllllIlll[145]];
                NPC npc = (NPC) NPCs.getAll(strArr57).stream().filter(npc2 -> {
                    String[] strArr58 = new String[llllllIlll[0]];
                    strArr58[llllllIlll[1]] = llllllIlIl[llllllIlll[181]];
                    return npc2.hasAction(strArr58);
                }).findFirst().orElse(null);
                if (llIlIllllIIlI(Prayers.getPoints(), llllllIlll[30])) {
                    Inventory.getFirst(item -> {
                        return item.getName().contains(llllllIlIl[llllllIlll[180]]);
                    }).interact(llllllIlIl[llllllIlll[146]]);
                }
                if (llIlIlllllIll(npc)) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[147]];
                    if (llIlIllllIIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    String[] strArr58 = new String[llllllIlll[0]];
                    strArr58[llllllIlll[1]] = llllllIlIl[llllllIlll[148]];
                    Item first6 = Inventory.getFirst(strArr58);
                    String[] strArr59 = new String[llllllIlll[0]];
                    strArr59[llllllIlll[1]] = llllllIlIl[llllllIlll[149]];
                    first6.useOn(NPCs.getNearest(strArr59));
                    Time.sleepTicks(llllllIlll[32]);
                    "".length();
                }
                if (llIlIllllIllI(npc)) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[150]];
                    if (llIlIllllIIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (llIlIllllIllI(npc) && llIlIlllllIll(Players.getLocal().getInteracting())) {
                    AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[151]];
                    npc.interact(llllllIlIl[llllllIlll[152]]);
                    Time.sleepTicks(llllllIlll[7]);
                    "".length();
                }
            }
            if (llIlIllllIlIl(C0004e.j(llllllIlll[4]), llllllIlll[140])) {
                if (llIlIllllIIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8]) && llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(dd), llllllIlll[29])) {
                    aZ();
                }
                if (llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
                    String[] strArr60 = new String[llllllIlll[0]];
                    strArr60[llllllIlll[1]] = llllllIlIl[llllllIlll[153]];
                    TileObjects.getNearest(strArr60).interact(llllllIlIl[llllllIlll[154]]);
                    Time.sleepTicks(llllllIlll[8]);
                    "".length();
                }
                if (llIlIlllllIlI(Players.getLocal().getWorldLocation().distanceTo(dd), llllllIlll[29])) {
                    if (llIlIllllIIlI(ck, llllllIlll[0])) {
                        ac.kC += llllllIlll[0];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllllIlll[0];
                        ac.kC = llllllIlll[1];
                        cl = llllllIlll[1];
                    }
                    String[] strArr61 = new String[llllllIlll[0]];
                    strArr61[llllllIlll[1]] = llllllIlIl[llllllIlll[155]];
                    if (llIlIlllllIll(NPCs.getNearest(strArr61))) {
                        String[] strArr62 = new String[llllllIlll[0]];
                        strArr62[llllllIlll[1]] = llllllIlIl[llllllIlll[156]];
                        if (llIlIlllllIll(NPCs.getNearest(strArr62))) {
                            int[] iArr30 = new int[llllllIlll[0]];
                            iArr30[llllllIlll[1]] = llllllIlll[117];
                            TileObjects.getNearest(iArr30).interact(llllllIlIl[llllllIlll[157]]);
                            Time.sleepTicks(llllllIlll[8]);
                            "".length();
                        }
                    }
                    String[] strArr63 = new String[llllllIlll[0]];
                    strArr63[llllllIlll[1]] = llllllIlIl[llllllIlll[158]];
                    if (llIlIllllIllI(NPCs.getNearest(strArr63))) {
                        C0006g.a(llllllIlIl[llllllIlll[159]], bQ);
                    }
                    String[] strArr64 = new String[llllllIlll[0]];
                    strArr64[llllllIlll[1]] = llllllIlIl[llllllIlll[160]];
                    if (llIlIllllIllI(NPCs.getNearest(strArr64))) {
                        C0006g.a(llllllIlIl[llllllIlll[161]], bQ);
                    }
                }
            }
        }
    }

    private static String llIlIlllIIllI(String lllllllllllllllllIlIIIlIIllIlIll, String lllllllllllllllllIlIIIlIIllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIlIIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIlIIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIlll[7], lllllllllllllllllIlIIIlIIllIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIlIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIlIIllIllII) {
            lllllllllllllllllIlIIIlIIllIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        String[] strArr = new String[llllllIlll[0]];
        strArr[llllllIlll[1]] = llllllIlIl[llllllIlll[167]];
        if (llIlIllllIlll(Inventory.getCount(strArr))) {
            String[] strArr2 = new String[llllllIlll[0]];
            strArr2[llllllIlll[1]] = llllllIlIl[llllllIlll[168]];
            if (llIlIllllIlll(Inventory.getCount(strArr2))) {
                ?? r0 = llllllIlll[0];
                "".length();
                return "   ".length() <= 0 ? ((((217 + 183) - 162) + 12) ^ (((135 + 58) - 106) + 99)) & (((46 ^ 96) ^ (51 ^ 61)) ^ (-" ".length())) : r0;
            }
        }
        return llllllIlll[1];
    }

    private static boolean llIlIllllIlll(int i) {
        return i > 0;
    }

    private static boolean llIlIlllllIll(Object obj) {
        return obj == null;
    }

    private static void llIlIlllIllll() {
        llllllIlll = new int[212];
        llllllIlll[0] = " ".length();
        llllllIlll[1] = (81 ^ 67) & ((3 ^ 17) ^ (-1));
        llllllIlll[2] = (-((-391) & 3031)) & (-13442) & 16383;
        llllllIlll[3] = (((64 + 130) - 32) + 29) ^ (((76 + 94) - 137) + 98);
        llllllIlll[4] = (-1161) & 1467;
        llllllIlll[5] = 42 ^ 47;
        llllllIlll[6] = (-(205 ^ 190)) & (-27653) & 32766;
        llllllIlll[7] = "  ".length();
        llllllIlll[8] = 198 ^ 194;
        llllllIlll[9] = (-((-15529) & 32425)) & (-3205) & 20479;
        llllllIlll[10] = 41 ^ 35;
        llllllIlll[11] = "   ".length();
        llllllIlll[12] = (60 ^ 102) ^ (32 ^ 124);
        llllllIlll[13] = (-24585) & 32591;
        llllllIlll[14] = (-(85 ^ 80)) & (-593) & 20215;
        llllllIlll[15] = (-((-417) & 5603)) & (-33) & 8179;
        llllllIlll[16] = (-((-7061) & 24566)) & (-12293) & 32767;
        llllllIlll[17] = (-((-2881) & 3949)) & (-19075) & 32767;
        llllllIlll[18] = (-((-18589) & 19134)) & (-16405) & 19383;
        llllllIlll[19] = (-((-4648) & 7167)) & (-28673) & 31743;
        llllllIlll[20] = (-((-10033) & 30577)) & (-133) & 22007;
        llllllIlll[21] = (172 ^ 157) ^ (177 ^ 135);
        llllllIlll[22] = 23 ^ 37;
        llllllIlll[23] = (-12951) & 16382;
        llllllIlll[24] = (-((-8594) & 12795)) & (-16387) & 24043;
        llllllIlll[25] = (-((-3197) & 16127)) & (-17) & 16379;
        llllllIlll[26] = (-((-18753) & 27601)) & (-20482) & 32763;
        llllllIlll[27] = (-20625) & 24059;
        llllllIlll[28] = 156 ^ 148;
        llllllIlll[29] = 169 ^ 166;
        llllllIlll[30] = (133 ^ 170) ^ (128 ^ 187);
        llllllIlll[31] = (((114 ^ 125) + (((1 + 39) - (-42)) + 49)) - (46 ^ 82)) + (107 ^ 29);
        llllllIlll[32] = (((143 + 137) - 276) + 154) ^ (((112 + 100) - 81) + 20);
        llllllIlll[33] = -" ".length();
        llllllIlll[34] = (((132 + 75) - 203) + 166) ^ (((126 + 21) - 115) + 129);
        llllllIlll[35] = (-24716) & 28159;
        llllllIlll[36] = (-17007) & 20463;
        llllllIlll[37] = (-4225) & 7667;
        llllllIlll[38] = (-((-45) & 4143)) & (-16385) & 23919;
        llllllIlll[39] = (-((-1061) & 30245)) & (-129) & 32765;
        llllllIlll[40] = (-((-21767) & 23959)) & (-24835) & 27606;
        llllllIlll[41] = 190 ^ 175;
        llllllIlll[42] = (-12947) & 16374;
        llllllIlll[43] = (-((-2057) & 23225)) & (-8197) & 32695;
        llllllIlll[44] = (-16903) & 20343;
        llllllIlll[45] = (-12801) & 16127;
        llllllIlll[46] = (61 ^ 33) ^ (122 ^ 106);
        llllllIlll[47] = 156 ^ 145;
        llllllIlll[48] = 30 ^ 16;
        llllllIlll[49] = (((60 + 6) - 12) + 77) ^ (((38 + 36) - (-17)) + 56);
        llllllIlll[50] = (((0 + 111) - 2) + 61) ^ (((108 + 69) - 62) + 69);
        llllllIlll[51] = 109 ^ 126;
        llllllIlll[52] = (21 ^ 120) ^ (44 ^ 84);
        llllllIlll[53] = 144 ^ 134;
        llllllIlll[54] = (((10 + 167) - 9) + 46) ^ (((66 + 77) - 72) + 122);
        llllllIlll[55] = (((64 + 78) - 102) + 124) ^ (((129 + 9) - 84) + 134);
        llllllIlll[56] = (254 ^ 169) ^ (143 ^ 193);
        llllllIlll[57] = (((113 + 22) - 40) + 50) ^ (((51 + 63) - 16) + 41);
        llllllIlll[58] = 149 ^ 142;
        llllllIlll[59] = 223 ^ 195;
        llllllIlll[60] = (72 ^ 0) ^ (231 ^ 178);
        llllllIlll[61] = (((171 + 188) - 311) + 143) ^ (((27 + 100) - 11) + 45);
        llllllIlll[62] = (165 ^ 176) ^ (202 ^ 192);
        llllllIlll[63] = (((97 + 53) - 43) + 79) ^ (((106 + 48) - 71) + 71);
        llllllIlll[64] = 67 ^ 98;
        llllllIlll[65] = (27 ^ 94) ^ (1 ^ 102);
        llllllIlll[66] = (102 ^ 126) ^ (65 ^ 122);
        llllllIlll[67] = 130 ^ 166;
        llllllIlll[68] = (92 ^ 14) ^ (218 ^ 173);
        llllllIlll[69] = (248 ^ 129) ^ (96 ^ 63);
        llllllIlll[70] = (((99 + 142) - 127) + 62) ^ (((116 + 57) - 128) + 106);
        llllllIlll[71] = 96 ^ 72;
        llllllIlll[72] = 65 ^ 104;
        llllllIlll[73] = (100 ^ 115) ^ (191 ^ 130);
        llllllIlll[74] = 34 ^ 9;
        llllllIlll[75] = 29 ^ 49;
        llllllIlll[76] = 28 ^ 49;
        llllllIlll[77] = 163 ^ 141;
        llllllIlll[78] = 151 ^ 184;
        llllllIlll[79] = 45 ^ 29;
        llllllIlll[80] = (((109 + 77) - 70) + 12) ^ (((98 + 154) - 179) + 104);
        llllllIlll[81] = 168 ^ 155;
        llllllIlll[82] = (226 ^ 174) ^ (253 ^ 133);
        llllllIlll[83] = (((23 + 162) - 80) + 78) ^ (((50 + 47) - 27) + 60);
        llllllIlll[84] = 47 ^ 25;
        llllllIlll[85] = 150 ^ 161;
        llllllIlll[86] = (87 ^ 52) ^ (41 ^ 114);
        llllllIlll[87] = 129 ^ 184;
        llllllIlll[88] = 134 ^ 188;
        llllllIlll[89] = (((116 + 141) - 156) + 51) ^ (((48 + 111) - 6) + 10);
        llllllIlll[90] = (-((-7073) & 31718)) & (-3) & 27615;
        llllllIlll[91] = (13 ^ 32) ^ (172 ^ 188);
        llllllIlll[92] = (((36 + 128) - 36) + 17) ^ (((117 + 46) - 14) + 26);
        llllllIlll[93] = 76 ^ 115;
        llllllIlll[94] = (81 ^ 9) ^ (107 ^ 115);
        llllllIlll[95] = (((62 + 87) - (-4)) + 89) ^ (((115 + 156) - 176) + 84);
        llllllIlll[96] = (234 ^ 178) ^ (64 ^ 90);
        llllllIlll[97] = (164 ^ 197) ^ (10 ^ 40);
        llllllIlll[98] = (111 ^ 44) ^ (110 ^ 105);
        llllllIlll[99] = 107 ^ 46;
        llllllIlll[100] = (75 ^ 29) ^ (126 ^ 110);
        llllllIlll[101] = (((218 + 198) - 194) + 14) ^ (((22 + 59) - (-74)) + 16);
        llllllIlll[102] = (((78 + 60) - 127) + 116) ^ (62 ^ 9);
        llllllIlll[103] = 212 ^ 157;
        llllllIlll[104] = 28 ^ 86;
        llllllIlll[105] = (-25) & 3551;
        llllllIlll[106] = 94 ^ 21;
        llllllIlll[107] = 249 ^ 181;
        llllllIlll[108] = (-29203) & 32731;
        llllllIlll[109] = 88 ^ 21;
        llllllIlll[110] = (52 ^ 5) ^ (((28 + 31) - (-32)) + 36);
        llllllIlll[111] = (-((-8517) & 28999)) & (-8230) & 32239;
        llllllIlll[112] = (((184 + 5) - (-31)) + 19) ^ (((109 + 78) - 76) + 49);
        llllllIlll[113] = (((139 + 139) - 166) + 38) ^ (((156 + 8) - (-1)) + 33);
        llllllIlll[114] = (110 ^ 30) ^ (53 ^ 20);
        llllllIlll[115] = 70 ^ 20;
        llllllIlll[116] = 243 ^ 160;
        llllllIlll[117] = (-(154 ^ 181)) & (-28690) & 32255;
        llllllIlll[118] = (((44 + 16) - (-110)) + 76) ^ (((101 + 146) - 226) + 141);
        llllllIlll[119] = (232 ^ 144) ^ (8 ^ 37);
        llllllIlll[120] = (53 ^ 18) ^ (64 ^ 49);
        llllllIlll[121] = 145 ^ 198;
        llllllIlll[122] = (115 ^ 92) ^ (95 ^ 40);
        llllllIlll[123] = (20 ^ 50) ^ (((56 + 118) - 113) + 66);
        llllllIlll[124] = 80 ^ 10;
        llllllIlll[125] = (((166 + 193) - 342) + 209) ^ (((86 + 79) - 0) + 20);
        llllllIlll[126] = (14 ^ 36) ^ (116 ^ 2);
        llllllIlll[127] = (25 ^ 101) ^ (56 ^ 25);
        llllllIlll[128] = (122 ^ 75) ^ (20 ^ 123);
        llllllIlll[129] = (104 ^ 123) ^ (105 ^ 37);
        llllllIlll[130] = 111 ^ 15;
        llllllIlll[131] = (((20 + 183) - 187) + 183) ^ (((117 + 53) - 47) + 43);
        llllllIlll[132] = 79 ^ 45;
        llllllIlll[133] = (4 ^ 54) ^ (201 ^ 152);
        llllllIlll[134] = (-((-681) & 22189)) & (-65) & 24535;
        llllllIlll[135] = (131 ^ 150) ^ (82 ^ 35);
        llllllIlll[136] = (58 ^ 25) ^ (237 ^ 171);
        llllllIlll[137] = 232 ^ 142;
        llllllIlll[138] = (111 ^ 85) ^ (84 ^ 9);
        llllllIlll[139] = 122 ^ 18;
        llllllIlll[140] = 112 ^ 25;
        llllllIlll[141] = (((13 + 66) - (-16)) + 102) ^ (((164 + 162) - 236) + 85);
        llllllIlll[142] = (122 ^ 22) ^ (28 ^ 27);
        llllllIlll[143] = 198 ^ 170;
        llllllIlll[144] = (145 ^ 142) ^ (48 ^ 66);
        llllllIlll[145] = (((101 + 188) - 80) + 11) ^ (((61 + 29) - 39) + 127);
        llllllIlll[146] = 6 ^ 105;
        llllllIlll[147] = 108 ^ 28;
        llllllIlll[148] = (217 ^ 172) ^ (54 ^ 50);
        llllllIlll[149] = 78 ^ 60;
        llllllIlll[150] = 194 ^ 177;
        llllllIlll[151] = 12 ^ 120;
        llllllIlll[152] = (45 ^ 126) ^ (61 ^ 27);
        llllllIlll[153] = 115 ^ 5;
        llllllIlll[154] = 208 ^ 167;
        llllllIlll[155] = (((65 + 35) - 62) + 197) ^ (((0 + 22) - (-71)) + 54);
        llllllIlll[156] = (((94 + 28) - 111) + 226) ^ (((18 + 66) - (-52)) + 12);
        llllllIlll[157] = (((103 + 195) - 180) + 106) ^ (((8 + 4) - (-65)) + 77);
        llllllIlll[158] = (86 ^ 44) ^ " ".length();
        llllllIlll[159] = 25 ^ 101;
        llllllIlll[160] = (186 ^ 156) ^ (1 ^ 90);
        llllllIlll[161] = 57 ^ 71;
        llllllIlll[162] = (((152 ^ 132) + (133 ^ 137)) - (-(36 ^ 19))) + (44 ^ 12);
        llllllIlll[163] = ((3 + 27) - (-28)) + 70;
        llllllIlll[164] = ((92 + 45) - 73) + 65;
        llllllIlll[165] = (((107 ^ 61) + (193 ^ 157)) - (117 ^ 21)) + (172 ^ 156);
        llllllIlll[166] = (((225 ^ 198) + ((148 ^ 178) & ((226 ^ 196) ^ (-1)))) - (-(198 ^ 131))) + (177 ^ 166);
        llllllIlll[167] = (((2 ^ 69) + (215 ^ 192)) - (187 ^ 163)) + (30 ^ 32);
        llllllIlll[168] = ((20 + 32) - (-42)) + 39;
        llllllIlll[169] = (-23697) & 32696;
        llllllIlll[170] = (-16680) & 31679;
        llllllIlll[171] = (-((-1045) & 9847)) & (-1026) & 16127;
        llllllIlll[172] = (-8898) & 16097;
        llllllIlll[173] = (-((-9099) & 30622)) & (-5) & 22527;
        llllllIlll[174] = (-28675) & 28974;
        llllllIlll[175] = (-((-9877) & 30647)) & (-1) & 32750;
        llllllIlll[176] = (-5637) & 30636;
        llllllIlll[177] = (-((-17029) & 27389)) & (-16388) & 27647;
        llllllIlll[178] = ((104 + 65) - 55) + 20;
        llllllIlll[179] = ((13 + 119) - 70) + 73;
        llllllIlll[180] = (((114 ^ 127) + (153 ^ 163)) - (77 ^ 119)) + (9 ^ 114);
        llllllIlll[181] = (((158 ^ 190) + (5 ^ 117)) - (33 ^ 118)) + (44 ^ 124);
        llllllIlll[182] = (-2245) & 3071;
        llllllIlll[183] = (-((-3458) & 15821)) & (-545) & 16367;
        llllllIlll[184] = (-(((21 + 113) - 119) + 127)) & (-28675) & 32255;
        llllllIlll[185] = (-4609) & 7934;
        llllllIlll[186] = (-641) & 4061;
        llllllIlll[187] = (-12433) & 15871;
        llllllIlll[188] = (-((-12037) & 32615)) & (-2321) & 32635;
        llllllIlll[189] = (-((-4115) & 29431)) & (-17) & 28668;
        llllllIlll[190] = (-4369) & 14263;
        llllllIlll[191] = (-((-321) & 25433)) & (-1) & 28671;
        llllllIlll[192] = ((93 + 86) - 133) + 92;
        llllllIlll[193] = ((108 + 106) - 110) + 35;
        llllllIlll[194] = (((((10 + 134) - 134) + 130) + (118 ^ 26)) - (((196 + 174) - 302) + 138)) + (63 ^ 92);
        llllllIlll[195] = ((21 + 7) - (-62)) + 52;
        llllllIlll[196] = ((129 + 133) - 213) + 94;
        llllllIlll[197] = ((40 + 40) - (-40)) + 24;
        llllllIlll[198] = ((107 + 39) - 8) + 7;
        llllllIlll[199] = ((9 + 52) - (-76)) + 9;
        llllllIlll[200] = (((133 ^ 164) + (87 ^ 121)) - (-(94 ^ 78))) + (79 ^ 123);
        llllllIlll[201] = (((107 ^ 51) + (44 ^ 81)) - (0 ^ 86)) + (80 ^ 69);
        llllllIlll[202] = (((240 ^ 186) + (142 ^ 157)) - (29 ^ 12)) + (117 ^ 60);
        llllllIlll[203] = ((37 + 72) - (-19)) + 22;
        llllllIlll[204] = ((69 + 131) - 85) + 36;
        llllllIlll[205] = (((((98 + 69) - 119) + 83) + (159 ^ 128)) - (53 ^ 8)) + (247 ^ 196);
        llllllIlll[206] = (((((51 + 2) - 26) + 118) + (87 ^ 75)) - (109 ^ 56)) + (244 ^ 181);
        llllllIlll[207] = ((52 + 145) - 98) + 55;
        llllllIlll[208] = (((99 ^ 29) + (68 ^ 122)) - (((0 + 34) - (-1)) + 93)) + (45 ^ 114);
        llllllIlll[209] = ((2 + 20) - (-72)) + 62;
        llllllIlll[210] = (((((57 + 124) - 147) + 120) + (((68 + 31) - (-5)) + 34)) - (((182 + 165) - 269) + 133)) + (100 ^ 40);
        llllllIlll[211] = (((183 ^ 138) + (((144 + 109) - 212) + 113)) - (43 ^ 114)) + (188 ^ 156);
    }

    private static boolean llIlIllllIlIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008f, code lost:
        if (llIlIllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ec, code lost:
        if (llIlIllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean ba() {
        String[] strArr = new String[llllllIlll[0]];
        strArr[llllllIlll[1]] = llllllIlIl[llllllIlll[163]];
        if (llIlIllllIIIl(Inventory.contains(strArr) ? 1 : 0) && llIlIllllIIIl(Inventory.contains(C0005f.aU) ? 1 : 0)) {
            int[] iArr = new int[llllllIlll[0]];
            iArr[llllllIlll[1]] = llllllIlll[9];
            if (llIlIllllIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[llllllIlll[0]];
                strArr2[llllllIlll[1]] = llllllIlIl[llllllIlll[164]];
                if (llIlIllllIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[llllllIlll[0]];
                    strArr3[llllllIlll[1]] = llllllIlIl[llllllIlll[165]];
                }
                String[] strArr4 = new String[llllllIlll[0]];
                strArr4[llllllIlll[1]] = llllllIlIl[llllllIlll[166]];
                if (llIlIllllIIIl(Inventory.contains(strArr4) ? 1 : 0)) {
                    int[] iArr2 = new int[llllllIlll[0]];
                    iArr2[llllllIlll[1]] = llllllIlll[19];
                    if (llIlIllllIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llllllIlll[0]];
                        iArr3[llllllIlll[1]] = llllllIlll[19];
                    }
                    ?? r0 = llllllIlll[0];
                    "".length();
                    return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return llllllIlll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllllIlll[1];
    }

    private static boolean llIlIllllIlII(int i, int i2) {
        return i >= i2;
    }

    private static void llIlIlllIlIIl() {
        llllllIlIl = new String[llllllIlll[211]];
        llllllIlIl[llllllIlll[1]] = llIlIlllIIllI("NFQMPs6lq+UEDyM0GewxNav3NmGLm4gMZrPHty/TNNxmULLh0gLHlePUIMCOeaVX", "KcxuH");
        llllllIlIl[llllllIlll[0]] = llIlIlllIIllI("m8Q6nOc8wGde8cVfFn5F/Q==", "YNWDh");
        llllllIlIl[llllllIlll[7]] = llIlIlllIIllI("juYC5pz4N2RSyQQIJI73o+D97pMPip94", "BiZId");
        llllllIlIl[llllllIlll[11]] = llIlIlllIIlll("whS74gp/eIylS+j3DZJGg/3OfFvlB5rS8jQK3mPBy/4G0qXoq9PbQ4oH52q7kLL3bfis45eAsig=", "Gxghz");
        llllllIlIl[llllllIlll[8]] = llIlIlllIIlll("BA0J6FNghrz9oX3InLRLWyw+2F8mSw7BNbKvAcgFa7uXTKzgvZ7GRk/gd1TwTR0U1AXR+LujOGs=", "CMSSD");
        llllllIlIl[llllllIlll[5]] = llIlIlllIIllI("C8qqUm8wfIM=", "jtafG");
        llllllIlIl[llllllIlll[12]] = llIlIlllIIlll("HZREMgqwN3U=", "PVNuf");
        llllllIlIl[llllllIlll[21]] = llIlIlllIlIII("LgQQJg==", "iedCd");
        llllllIlIl[llllllIlll[28]] = llIlIlllIlIII("Ph4QIw==", "qnuMC");
        llllllIlIl[llllllIlll[32]] = llIlIlllIlIII("NDsBGwlBOwkZGARoHBACBA==", "aHhun");
        llllllIlIl[llllllIlll[10]] = llIlIlllIIlll("ZF7hyjdVGtw=", "qBagc");
        llllllIlIl[llllllIlll[34]] = llIlIlllIIllI("0xl4fbULD1uIh2ZEefBEhA==", "vnCHj");
        llllllIlIl[llllllIlll[46]] = llIlIlllIIlll("XO9vEUAA9Nk=", "zQwfZ");
        llllllIlIl[llllllIlll[47]] = llIlIlllIlIII("KjMxNRoDMWUsGh8kKjM=", "mVEAs");
        llllllIlIl[llllllIlll[48]] = llIlIlllIIlll("7sa8Fb1LuwRV0nxVTIBXEw==", "VecDT");
        llllllIlIl[llllllIlll[29]] = llIlIlllIIllI("SQydGf7DYbc=", "RQnss");
        llllllIlIl[llllllIlll[49]] = llIlIlllIIllI("oxk/QE2VL/U=", "KUSMA");
        llllllIlIl[llllllIlll[41]] = llIlIlllIlIII("PycHJikA", "rNuTF");
        llllllIlIl[llllllIlll[50]] = llIlIlllIIlll("Q8SSqKqs32c=", "gGHuO");
        llllllIlIl[llllllIlll[51]] = llIlIlllIlIII("HR8YPhwi", "PvjLs");
        llllllIlIl[llllllIlll[30]] = llIlIlllIIlll("iEzVfYdE5ws=", "rpvqg");
        llllllIlIl[llllllIlll[52]] = llIlIlllIlIII("IjQaDiwKZgEIPQA=", "eFuzX");
        llllllIlIl[llllllIlll[53]] = llIlIlllIIlll("Uz1a53xG+Wc=", "wmSBb");
        llllllIlIl[llllllIlll[54]] = llIlIlllIIlll("pDzotfEo4hA7HyRf1pGu0jynl1phf7r5", "LEjnF");
        llllllIlIl[llllllIlll[55]] = llIlIlllIIllI("565ykoBqMQY=", "soMOi");
        llllllIlIl[llllllIlll[56]] = llIlIlllIIllI("Q/361JLGSRw=", "oVOid");
        llllllIlIl[llllllIlll[57]] = llIlIlllIIllI("2UQUvxMoCXWyJdZ6FlG9rRi4BPCxGC0u", "EneEW");
        llllllIlIl[llllllIlll[58]] = llIlIlllIIllI("s5U57RIPzhMVmOMO5xhfGeWLlTRkUyzx", "uOvbu");
        llllllIlIl[llllllIlll[59]] = llIlIlllIIlll("TELBMoS0DdY=", "bSLdh");
        llllllIlIl[llllllIlll[60]] = llIlIlllIlIII("BRofFxcuGQ==", "Oujey");
        llllllIlIl[llllllIlll[61]] = llIlIlllIIlll("LUuNVpbGkVQ=", "WFVcG");
        llllllIlIl[llllllIlll[62]] = llIlIlllIlIII("FgYbFBA9DhlYLTEdGxcaOw==", "Powxy");
        llllllIlIl[llllllIlll[63]] = llIlIlllIIllI("3xliOSyhEpQ=", "moNZw");
        llllllIlIl[llllllIlll[64]] = llIlIlllIIlll("GV7GiaH8ibc=", "EMUjH");
        llllllIlIl[llllllIlll[65]] = llIlIlllIIlll("7cxBGpVVmEw3ecWMyBBPrV16k6jz6GbN", "qirXu");
        llllllIlIl[llllllIlll[66]] = llIlIlllIlIII("DDwCPTsz", "AUpOT");
        llllllIlIl[llllllIlll[67]] = llIlIlllIlIII("FTAlCjE+OCdGDDIrJQk7OA==", "SYIfX");
        llllllIlIl[llllllIlll[68]] = llIlIlllIlIII("DB8mBToz", "AvTwU");
        llllllIlIl[llllllIlll[69]] = llIlIlllIIllI("zOaB/F2cy2WGLfuRTxtG0ZzxYA8L/W9F", "vgEVO");
        llllllIlIl[llllllIlll[70]] = llIlIlllIlIII("FD0/BwA/NT1LPTMmPwQKOQ==", "RTSki");
        llllllIlIl[llllllIlll[71]] = llIlIlllIIllI("F3zKu+gJYUo=", "eQiNh");
        llllllIlIl[llllllIlll[72]] = llIlIlllIIlll("nCENWR51XXk=", "AHPyE");
        llllllIlIl[llllllIlll[73]] = llIlIlllIIllI("Njo+NWTSs4I=", "QUEfW");
        llllllIlIl[llllllIlll[74]] = llIlIlllIlIII("ABkHBjkrEQVKBCcCBwUzLQ==", "FpkjP");
        llllllIlIl[llllllIlll[75]] = llIlIlllIIllI("hi7V4FLLIbC1A6SFvq3gpIyn5kSaSHBj", "EVxVP");
        llllllIlIl[llllllIlll[76]] = llIlIlllIlIII("CxQADAEj", "Lfoxu");
        llllllIlIl[llllllIlll[77]] = llIlIlllIIlll("GGtzwEiP7w4=", "SSAMT");
        llllllIlIl[llllllIlll[78]] = llIlIlllIlIII("MQsaKRgaAxhlJRYQGioSHA==", "wbvEq");
        llllllIlIl[llllllIlll[79]] = llIlIlllIlIII("CiYHIh4hLgVuIy09ByEUJw==", "LOkNw");
        llllllIlIl[llllllIlll[80]] = llIlIlllIIllI("Wn+4ROclV5yDCQdLWMC/Dw==", "FJBbB");
        llllllIlIl[llllllIlll[22]] = llIlIlllIIlll("GbQUdnAkgAM=", "ZBWLB");
        llllllIlIl[llllllIlll[81]] = llIlIlllIlIII("PDQHTiYddQEcOxcmBQ==", "rUqnR");
        llllllIlIl[llllllIlll[82]] = llIlIlllIlIII("JiMMERMdPh8=", "rQmaw");
        llllllIlIl[llllllIlll[83]] = llIlIlllIlIII("Bx0DPy08ABA=", "SobOI");
        llllllIlIl[llllllIlll[84]] = llIlIlllIIlll("jSu/XR2iPYw=", "MZwot");
        llllllIlIl[llllllIlll[85]] = llIlIlllIIllI("7MmWWYy36jRrtBh2m2OPCQ==", "XtjwZ");
        llllllIlIl[llllllIlll[86]] = llIlIlllIIllI("/NII7PAwdrQ=", "iWGNr");
        llllllIlIl[llllllIlll[87]] = llIlIlllIIllI("I2YSjr/prUOa7co5Mf+U0A==", "CSTOn");
        llllllIlIl[llllllIlll[88]] = llIlIlllIIllI("o5qF6wZZI4M=", "aBZUk");
        llllllIlIl[llllllIlll[89]] = llIlIlllIIlll("H+P39ZE0aHISr3wBtqHzHA==", "AjPih");
        llllllIlIl[llllllIlll[3]] = llIlIlllIIllI("490qO89NtZw=", "DdLAw");
        llllllIlIl[llllllIlll[91]] = llIlIlllIIllI("QNqoL+w54o6ihspZxhARWg==", "QwqtF");
        llllllIlIl[llllllIlll[92]] = llIlIlllIlIII("IRMLMw==", "qzhXR");
        llllllIlIl[llllllIlll[93]] = llIlIlllIlIII("Px8DJgRZBQNhARYN", "yjmAm");
        llllllIlIl[llllllIlll[94]] = llIlIlllIlIII("ODsKLw==", "hRiDn");
        llllllIlIl[llllllIlll[95]] = llIlIlllIIlll("Z6ftHXqJPOzj+BaZCeIqSw==", "xtWQG");
        llllllIlIl[llllllIlll[96]] = llIlIlllIIllI("7KBURuC5JqCL2c69GR/zV8+eCSM489KU", "oyIcB");
        llllllIlIl[llllllIlll[97]] = llIlIlllIlIII("Ex02AC47", "ToYtZ");
        llllllIlIl[llllllIlll[98]] = llIlIlllIIlll("yqRIPOXj2Yg=", "ermmh");
        llllllIlIl[llllllIlll[99]] = llIlIlllIlIII("CwoiIwQgAiBvOSwRIiAOJg==", "McNOm");
        llllllIlIl[llllllIlll[100]] = llIlIlllIlIII("HgQrBwU1DClLODkfKwQPMw==", "XmGkl");
        llllllIlIl[llllllIlll[101]] = llIlIlllIIllI("N2OI4dbjelab8DpjWeATmpwJBHLVCU7u", "slMvy");
        llllllIlIl[llllllIlll[102]] = llIlIlllIIlll("OHKPU0rgPo9PxIB/szYhNMMVd7BRpw8x", "zHbnO");
        llllllIlIl[llllllIlll[103]] = llIlIlllIIlll("IMFDu+jCds/snPe/vaNCzw==", "KWSHM");
        llllllIlIl[llllllIlll[104]] = llIlIlllIIlll("t0r5jik3FiQB9JfeJxpZ2vAc8AvWlR7V", "nAGcx");
        llllllIlIl[llllllIlll[106]] = llIlIlllIIlll("u+LqZTaNj42Ud6SqYxOdPg==", "xRCpV");
        llllllIlIl[llllllIlll[107]] = llIlIlllIlIII("GFISHxE9UhQcETUe", "Yrglt");
        llllllIlIl[llllllIlll[109]] = llIlIlllIIllI("QUsi8x7RCLhREJfb4SFLug==", "onvLx");
        llllllIlIl[llllllIlll[110]] = llIlIlllIlIII("FCgwM0o0PjAiSj8yLCAfKg==", "YGBGj");
        llllllIlIl[llllllIlll[112]] = llIlIlllIIllI("KS/SM8eVW9IqzeCUmhQvLrhKsIaAZKBQ", "sNXeV");
        llllllIlIl[llllllIlll[113]] = llIlIlllIIllI("kHmutD7HVavOinX5yTndJEeJQx5gXFUV", "zHtQv");
        llllllIlIl[llllllIlll[114]] = llIlIlllIIlll("+k07ckmuvhk=", "sHGYs");
        llllllIlIl[llllllIlll[115]] = llIlIlllIlIII("PTgmKwI=", "xVRNp");
        llllllIlIl[llllllIlll[116]] = llIlIlllIlIII("CQ0pJAgiBStoNS4WKScCJA==", "OdEHa");
        llllllIlIl[llllllIlll[118]] = llIlIlllIlIII("Kh8DATER", "yzbsR");
        llllllIlIl[llllllIlll[119]] = llIlIlllIlIII("JSACIw4OKABvMwI7AiAECA==", "cInOg");
        llllllIlIl[llllllIlll[120]] = llIlIlllIIllI("TtlFhA+LBAsjhaDj4bvvdW8kBU2M1hE0", "HTHAT");
        llllllIlIl[llllllIlll[121]] = llIlIlllIIlll("C4M7KxgDOIOqjzAJHNqB87ZWMX1NtIpD", "XtidI");
        llllllIlIl[llllllIlll[122]] = llIlIlllIlIII("DwY/NwYkRxgyHTMOPw==", "AgKBt");
        llllllIlIl[llllllIlll[123]] = llIlIlllIlIII("JxYPITUc", "tsnSV");
        llllllIlIl[llllllIlll[124]] = llIlIlllIlIII("BSIiAwcuKiBPOiI5IgANKA==", "CKNon");
        llllllIlIl[llllllIlll[125]] = llIlIlllIIllI("b/tFp3laUsnuznLRTzNpwF1EXybe0RCZ", "SuOug");
        llllllIlIl[llllllIlll[126]] = llIlIlllIIllI("b+sK/KsIg8m2kjQbBi9r5w==", "XClun");
        llllllIlIl[llllllIlll[127]] = llIlIlllIIlll("BlE0PT4rPr0fKXB5x3rEkQ==", "hsTaS");
        llllllIlIl[llllllIlll[128]] = llIlIlllIlIII("LhQBOgwG", "ifnNx");
        llllllIlIl[llllllIlll[129]] = llIlIlllIlIII("JxUnPQxDFz0hCws=", "cgRTh");
        llllllIlIl[llllllIlll[130]] = llIlIlllIIlll("gnbXmAYjFQmsktQsUZTyYg==", "MjRUl");
        llllllIlIl[llllllIlll[131]] = llIlIlllIIllI("XMTg7FmvKJk=", "VcmEH");
        llllllIlIl[llllllIlll[132]] = llIlIlllIlIII("AgMgJhgq", "EqORl");
        llllllIlIl[llllllIlll[133]] = llIlIlllIlIII("IhITYzsDUwksKA==", "lseCO");
        llllllIlIl[llllllIlll[135]] = llIlIlllIIlll("G1tXqhtxdfkFoGcGPsjB0Q==", "WpYDC");
        llllllIlIl[llllllIlll[136]] = llIlIlllIlIII("Fi09KxpwNz1sHz8/", "PXSLs");
        llllllIlIl[llllllIlll[137]] = llIlIlllIlIII("IB0zGQ==", "ptPrP");
        llllllIlIl[llllllIlll[138]] = llIlIlllIlIII("BAQbEghiHhtVDS0W", "Bquua");
        llllllIlIl[llllllIlll[139]] = llIlIlllIIlll("3lFfNDzSOwI=", "ZbzCG");
        llllllIlIl[llllllIlll[140]] = llIlIlllIIlll("AnVpSrf1DWbjvKHZzt0nhx4wNNZE5C47", "qaLQy");
        llllllIlIl[llllllIlll[141]] = llIlIlllIlIII("KT4zAC5NPCkcKQU=", "mLFiJ");
        llllllIlIl[llllllIlll[142]] = llIlIlllIIllI("vUdjMsw62qMcAx2G4Yyypg==", "zlFoQ");
        llllllIlIl[llllllIlll[143]] = llIlIlllIlIII("NAsFCQ==", "rbieO");
        llllllIlIl[llllllIlll[144]] = llIlIlllIIllI("mbAoXBEMqvM=", "RCqAc");
        llllllIlIl[llllllIlll[145]] = llIlIlllIIlll("w5LoXvfOta8=", "bIuhD");
        llllllIlIl[llllllIlll[146]] = llIlIlllIlIII("EygkHTE=", "WZMsZ");
        llllllIlIl[llllllIlll[147]] = llIlIlllIIlll("TmTSCJUL1bmFZG7NuhZbZwwxlxy4pG6C7bttLlZAdG0=", "Hbwik");
        llllllIlIl[llllllIlll[148]] = llIlIlllIlIII("BgoWIRBiCAw9Fyo=", "BxcHt");
        llllllIlIl[llllllIlll[149]] = llIlIlllIIlll("bRcWgbSG5E0=", "MwWtO");
        llllllIlIl[llllllIlll[150]] = llIlIlllIIllI("TmCiSIemsRVEkNQB29xOeA==", "hVpAw");
        llllllIlIl[llllllIlll[151]] = llIlIlllIIllI("NIhMWxF8hUSUGRmt/BSpLXU38FzObPyPCctBzHs6nJw=", "bGVJO");
        llllllIlIl[llllllIlll[152]] = llIlIlllIIllI("BjpuK7fB1XM=", "vUoCD");
        llllllIlIl[llllllIlll[153]] = llIlIlllIIlll("Iq9uxtJ+V08=", "EuEzj");
        llllllIlIl[llllllIlll[154]] = llIlIlllIIlll("8ZyZe8S9WfA=", "DRHix");
        llllllIlIl[llllllIlll[155]] = llIlIlllIlIII("BzMCGyYsOwBXGyAoAhgsKg==", "AZnwO");
        llllllIlIl[llllllIlll[156]] = llIlIlllIIlll("W8maiiUJwyHTzDA0SEBs2w==", "PCOpr");
        llllllIlIl[llllllIlll[157]] = llIlIlllIlIII("ECIKEQAr", "CGkcc");
        llllllIlIl[llllllIlll[158]] = llIlIlllIIlll("6jqzMDRagFn9ZMMY4B11g+ZVttuh6E1E", "oWfpf");
        llllllIlIl[llllllIlll[159]] = llIlIlllIlIII("CA46BxojBjhLJy8VOgQQJQ==", "NgVks");
        llllllIlIl[llllllIlll[160]] = llIlIlllIIllI("D858NzlXHE7xBxfI9ikFdQ==", "PBeBP");
        llllllIlIl[llllllIlll[161]] = llIlIlllIIllI("hMOZKt/1zbzbKTMKqaG3lQ==", "CARrc");
        llllllIlIl[llllllIlll[162]] = llIlIlllIlIII("OA0vSDYZTD4aLQIYNg==", "vlYhB");
        llllllIlIl[llllllIlll[163]] = llIlIlllIlIII("GBMbIhFrFQU1Ai4LFiYQawYSOBE7HQUg", "KrwTt");
        llllllIlIl[llllllIlll[164]] = llIlIlllIIllI("zsipEk20AS9Zm3GZp2MfUw==", "DGalT");
        llllllIlIl[llllllIlll[165]] = llIlIlllIIlll("g5RY8JpK+03dc/2CpXMgvg==", "wTWOP");
        llllllIlIl[llllllIlll[166]] = llIlIlllIIlll("di3FEIeOJglU19KyNXHeM1YdIFlj0138", "cbsUg");
        llllllIlIl[llllllIlll[167]] = llIlIlllIlIII("", "gWcOi");
        llllllIlIl[llllllIlll[168]] = llIlIlllIIlll("jFH11Sc+T6A=", "lQpdk");
        llllllIlIl[llllllIlll[178]] = llIlIlllIIlll("MJnvFQD3D1GIWZ6YnUGmzw==", "fVLcN");
        llllllIlIl[llllllIlll[179]] = llIlIlllIIllI("4Tl4ZKyD1pMPGXnXVsQgpgWbDZCEsIx0", "BPXhz");
        llllllIlIl[llllllIlll[180]] = llIlIlllIlIII("PCAlNCYe", "lRDMC");
        llllllIlIl[llllllIlll[181]] = llIlIlllIlIII("MTgiJTYb", "pLVDU");
        llllllIlIl[llllllIlll[192]] = llIlIlllIlIII("E3cuUiY1PygbJD1wJR04ejFjAz8/IzdT", "ZPCrJ");
        llllllIlIl[llllllIlll[193]] = llIlIlllIIlll("5pNtnpni6Zc=", "ueUvS");
        llllllIlIl[llllllIlll[31]] = llIlIlllIIlll("5ILeJy2eYlzRvzZ8J6+ZbMsZZqalkmV/", "NUlrl");
        llllllIlIl[llllllIlll[194]] = llIlIlllIlIII("Og8HY00NBQBvGQYGG28ABkoAJwwXSgMnCEMaBSAPDw8abwQQRA==", "cjwOm");
        llllllIlIl[llllllIlll[195]] = llIlIlllIIllI("ZEYKA8FBDsY=", "cqmWH");
        llllllIlIl[llllllIlll[196]] = llIlIlllIlIII("EQ0iVQYtQiUbEyAWe1IDLUIzHRpvFnk=", "HbWrt");
        llllllIlIl[llllllIlll[197]] = llIlIlllIIlll("MSobsroI5YWr7N9PH06kqEiPhBpZmDmQndx/gu6SOObM1dUZchT+4nyjLgAkAa1TbX++DqYpq6M=", "rYXxj");
        llllllIlIl[llllllIlll[198]] = llIlIlllIIlll("ue51Ggw0XOYR+soSuk+P6KLgYxtabFyFB4jGgU+J/eWQ7Xt2u5BXBK+mRMAcW0Mn", "zLyaw");
        llllllIlIl[llllllIlll[199]] = llIlIlllIIllI("uVnM+LWtih48zsDlGHvouhBeAv7UcopEopYOxUKpc0E=", "NLwLm");
        llllllIlIl[llllllIlll[200]] = llIlIlllIIllI("UlCbgxHZouMhNaZ8pfFEYQ==", "OzaIa");
        llllllIlIl[llllllIlll[201]] = llIlIlllIlIII("LF4WOUgCHA51DwoQFDJG", "eyzUh");
        llllllIlIl[llllllIlll[202]] = llIlIlllIIllI("mSTHvCcN8znojeWwfjmQR+29ZnarsrxvyEDm9xAwZbI=", "ijyal");
        llllllIlIl[llllllIlll[203]] = llIlIlllIIllI("jLPqCUZ9WwqYdpVLkXohPQ==", "hRtck");
        llllllIlIl[llllllIlll[204]] = llIlIlllIIlll("NYKZOMAUpoArSD+puBGcVNYKjM5ykvuVDklFey6q910pGGPzx3ih1Q==", "ZAcEj");
        llllllIlIl[llllllIlll[205]] = llIlIlllIlIII("GQk6VTA9QTcdPG4TKgM8PEEwADomQSJVPiEOJ1U9KwcmGzorXg==", "NaCuY");
        llllllIlIl[llllllIlll[206]] = llIlIlllIIlll("vFqijC4MdogQeJS9QhEWAIrh6rOG/JLg", "SardV");
        llllllIlIl[llllllIlll[207]] = llIlIlllIIlll("pvhiTlSMZnYm1P4dKWLCfw==", "gkgfj");
        llllllIlIl[llllllIlll[208]] = llIlIlllIIlll("jlrzeZwTZ5V0zMV9sWLHYN7zO4SIdpvk3uztw0Ukn6JHaIiIsrqgM+6sk0s6aFAm", "JZhFv");
        llllllIlIl[llllllIlll[209]] = llIlIlllIIllI("sdyZ/I9qm8CR8KWhX7E4aUvY2D+p21Uvo/4L7BFbEBw=", "jJlwd");
        llllllIlIl[llllllIlll[210]] = llIlIlllIlIII("JC8tPG0AZzggIwBnPCc/EC9sLiUBeA==", "sGLHJ");
    }

    static {
        llIlIlllIllll();
        llIlIlllIlIIl();
        cZ = llllllIlll[4];
        cW = llllllIlll[182];
        cX = llllllIlll[142];
        cY = llllllIlll[2];
        da = new WorldPoint(llllllIlll[37], llllllIlll[183], llllllIlll[1]);
        db = new WorldPoint(llllllIlll[184], llllllIlll[185], llllllIlll[1]);
        dc = new WorldPoint(llllllIlll[186], llllllIlll[187], llllllIlll[1]);
        dd = new WorldPoint(llllllIlll[44], llllllIlll[188], llllllIlll[1]);
        de = new WorldPoint(llllllIlll[184], llllllIlll[189], llllllIlll[1]);
        df = new WorldPoint(llllllIlll[184], llllllIlll[190], llllllIlll[1]);
        bu = new ArrayList();
        dg = llllllIlll[1];
        dh = new WorldArea(llllllIlll[191], llllllIlll[43], llllllIlll[51], llllllIlll[47], llllllIlll[1]);
        String[] strArr = new String[llllllIlll[30]];
        strArr[llllllIlll[1]] = llllllIlIl[llllllIlll[192]];
        strArr[llllllIlll[0]] = llllllIlIl[llllllIlll[193]];
        strArr[llllllIlll[7]] = llllllIlIl[llllllIlll[31]];
        strArr[llllllIlll[11]] = llllllIlIl[llllllIlll[194]];
        strArr[llllllIlll[8]] = llllllIlIl[llllllIlll[195]];
        strArr[llllllIlll[5]] = llllllIlIl[llllllIlll[196]];
        strArr[llllllIlll[12]] = llllllIlIl[llllllIlll[197]];
        strArr[llllllIlll[21]] = llllllIlIl[llllllIlll[198]];
        strArr[llllllIlll[28]] = llllllIlIl[llllllIlll[199]];
        strArr[llllllIlll[32]] = llllllIlIl[llllllIlll[200]];
        strArr[llllllIlll[10]] = llllllIlIl[llllllIlll[201]];
        strArr[llllllIlll[34]] = llllllIlIl[llllllIlll[202]];
        strArr[llllllIlll[46]] = llllllIlIl[llllllIlll[203]];
        strArr[llllllIlll[47]] = llllllIlIl[llllllIlll[204]];
        strArr[llllllIlll[48]] = llllllIlIl[llllllIlll[205]];
        strArr[llllllIlll[29]] = llllllIlIl[llllllIlll[206]];
        strArr[llllllIlll[49]] = llllllIlIl[llllllIlll[207]];
        strArr[llllllIlll[41]] = llllllIlIl[llllllIlll[208]];
        strArr[llllllIlll[50]] = llllllIlIl[llllllIlll[209]];
        strArr[llllllIlll[51]] = llllllIlIl[llllllIlll[210]];
        bQ = strArr;
    }

    private static boolean llIlIllllIIIl(int i) {
        return i != 0;
    }

    private static boolean llIlIlllllIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIlIllllIIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    private static void aZ() {
        if (llIlIlllllIIl(Players.getLocal().getWorldLocation().distanceTo(de), llllllIlll[8])) {
            AccBuilderTempleTrek.c = llllllIlIl[llllllIlll[162]];
            Movement.walkTo(de);
            "".length();
            Time.sleepTicks(llllllIlll[0]);
            "".length();
            if (llIlIllllIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(llllllIlll[35], llllllIlll[36], llllllIlll[1])) ? 1 : 0)) {
                C0004e.b(new WorldPoint(llllllIlll[38], llllllIlll[39], llllllIlll[1]));
                Time.sleepTicks(llllllIlll[8]);
                "".length();
            }
            Widget widget = Widgets.get(llllllIlll[40], llllllIlll[30]);
            if (llIlIllllIllI(widget)) {
                Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llllllIlll[0]);
                Time.sleepTicks(llllllIlll[11]);
                "".length();
            }
            Widget widget2 = Widgets.get(llllllIlll[40], llllllIlll[41]);
            if (llIlIllllIllI(widget2)) {
                Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) llllllIlll[0]);
                Time.sleepTicks(llllllIlll[11]);
                "".length();
            }
        }
    }

    private static int llIlIllllIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            aY();
            "".length();
            if ("   ".length() <= " ".length()) {
                return (143 ^ 179) & ((78 ^ 114) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return llllllIlll[135];
    }
}
