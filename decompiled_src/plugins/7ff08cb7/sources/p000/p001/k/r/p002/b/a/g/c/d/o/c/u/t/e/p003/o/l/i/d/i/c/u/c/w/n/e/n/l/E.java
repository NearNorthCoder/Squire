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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.E  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/E.class */
public class E implements ab {
    public static final /* synthetic */ int fb;
    public static final /* synthetic */ WorldPoint fd;
    public static final /* synthetic */ WorldPoint fi;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ int dy;
    static /* synthetic */ WorldArea fj;
    public static final /* synthetic */ WorldPoint fe;
    public static final /* synthetic */ int eZ;
    public static final /* synthetic */ WorldPoint fg;
    public static final /* synthetic */ int fa;
    public static final /* synthetic */ WorldPoint fh;
    public static /* synthetic */ List<C0003d> bx;
    public static final /* synthetic */ int fc;
    public static final /* synthetic */ WorldPoint ff;
    private static /* synthetic */ int[] llIIIllIl;
    static /* synthetic */ boolean dl;
    private static /* synthetic */ String[] llIIIllII;
    static /* synthetic */ int dk;
    static /* synthetic */ String[] cG;

    private static boolean lIlIIllllIlI(int i, int i2) {
        return i > i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIIIllII[llIIIllIl[178]];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008f, code lost:
        if (lIlIIlllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ec, code lost:
        if (lIlIIlllIIlI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean bE() {
        String[] strArr = new String[llIIIllIl[0]];
        strArr[llIIIllIl[1]] = llIIIllII[llIIIllIl[163]];
        if (lIlIIlllIIlI(Inventory.contains(strArr) ? 1 : 0) && lIlIIlllIIlI(Inventory.contains(C0005f.bc) ? 1 : 0)) {
            int[] iArr = new int[llIIIllIl[0]];
            iArr[llIIIllIl[1]] = llIIIllIl[9];
            if (lIlIIlllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                String[] strArr2 = new String[llIIIllIl[0]];
                strArr2[llIIIllIl[1]] = llIIIllII[llIIIllIl[164]];
                if (lIlIIlllIlII(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[llIIIllIl[0]];
                    strArr3[llIIIllIl[1]] = llIIIllII[llIIIllIl[165]];
                }
                String[] strArr4 = new String[llIIIllIl[0]];
                strArr4[llIIIllIl[1]] = llIIIllII[llIIIllIl[166]];
                if (lIlIIlllIIlI(Inventory.contains(strArr4) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIIllIl[0]];
                    iArr2[llIIIllIl[1]] = llIIIllIl[19];
                    if (lIlIIlllIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIIllIl[0]];
                        iArr3[llIIIllIl[1]] = llIIIllIl[19];
                    }
                    ?? r0 = llIIIllIl[0];
                    "".length();
                    return "  ".length() <= (-" ".length()) ? " ".length() & (" ".length() ^ (-1)) : r0;
                }
            }
        }
        return llIIIllIl[1];
    }

    private static String lIlIIllIlllI(String lIllIlIllIIlIl, String lIllIlIllIIlII) {
        String str = new String(Base64.getDecoder().decode(lIllIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIlIllIIIll = new StringBuilder();
        char[] lIllIlIllIIIlI = lIllIlIllIIlII.toCharArray();
        int lIllIlIllIIIIl = llIIIllIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIllIl[1];
        while (lIlIIlllIIll(i, length)) {
            lIllIlIllIIIll.append((char) (charArray[i] ^ lIllIlIllIIIlI[lIllIlIllIIIIl % lIllIlIllIIIlI.length]));
            "".length();
            lIllIlIllIIIIl++;
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lIllIlIllIIIll);
    }

    private static boolean lIlIIllllIIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIlIIlllIlIl(C0004e.j(llIIIllIl[4]), llIIIllIl[145])) {
            ?? r0 = llIIIllIl[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIllIl[1];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bC();
            "".length();
            if ((-" ".length()) >= ((241 ^ 182) & ((58 ^ 125) ^ (-1)))) {
                return (212 ^ 128) & ((96 ^ 52) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIIllIl[135];
    }

    private static boolean lIlIIlllIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIlllIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIlllllII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIllllIll(int i, int i2) {
        return i <= i2;
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
    public static void bC() {
        if (lIlIIlllIIlI(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (lIlIIlllIIll(bx.size(), llIIIllIl[0])) {
                System.out.println(llIIIllII[llIIIllIl[1]]);
                bv = llIIIllIl[1];
            }
        }
        if (lIlIIlllIlII(bv ? 1 : 0)) {
            if (!lIlIIlllIlIl(C0004e.j(llIIIllIl[2]), llIIIllIl[3]) || lIlIIlllIIll(C0004e.j(llIIIllIl[4]), llIIIllIl[5])) {
                G.bI();
            }
            if (lIlIIlllIlII(bE() ? 1 : 0) && lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[5]) && lIlIIlllIlIl(C0004e.j(llIIIllIl[2]), llIIIllIl[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlllIlll(nearest) && lIlIIlllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[0]];
                    C0000a.a(nearest);
                }
                if (lIlIIlllIlll(nearest) && lIlIIlllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIlllIlII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIllIl[6]);
                        "".length();
                    }
                    if (lIlIIlllIIlI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[7]];
                        if (lIlIIllllIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIllIl[8]);
                            "".length();
                        }
                        if (lIlIIllllIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIllIl[7]);
                            "".length();
                        }
                        int[] iArr = new int[llIIIllIl[0]];
                        iArr[llIIIllIl[1]] = llIIIllIl[9];
                        if (lIlIIlllIIlI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIIllIl[0]];
                            iArr2[llIIIllIl[1]] = llIIIllIl[9];
                            if (lIlIIlllIIll(Bank.getFirst(iArr2).getQuantity(), llIIIllIl[10])) {
                                Q();
                                System.out.println(llIIIllII[llIIIllIl[11]]);
                                bv = llIIIllIl[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[llIIIllIl[12]];
                        iArr3[llIIIllIl[1]] = llIIIllIl[13];
                        iArr3[llIIIllIl[0]] = llIIIllIl[14];
                        iArr3[llIIIllIl[7]] = llIIIllIl[15];
                        iArr3[llIIIllIl[11]] = llIIIllIl[16];
                        iArr3[llIIIllIl[8]] = llIIIllIl[9];
                        iArr3[llIIIllIl[5]] = llIIIllIl[17];
                        if (lIlIIlllIlII(C0004e.d(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIIllII[llIIIllIl[8]]);
                            bv = llIIIllIl[0];
                            return;
                        }
                        int[] iArr4 = new int[llIIIllIl[12]];
                        iArr4[llIIIllIl[1]] = llIIIllIl[13];
                        iArr4[llIIIllIl[0]] = llIIIllIl[14];
                        iArr4[llIIIllIl[7]] = llIIIllIl[15];
                        iArr4[llIIIllIl[11]] = llIIIllIl[16];
                        iArr4[llIIIllIl[8]] = llIIIllIl[9];
                        iArr4[llIIIllIl[5]] = llIIIllIl[17];
                        if (lIlIIlllIIlI(C0004e.d(iArr4) ? 1 : 0)) {
                            C0000a.a(llIIIllIl[18], llIIIllIl[7]);
                            C0000a.a(llIIIllIl[19], llIIIllIl[0]);
                            C0000a.a(llIIIllIl[20], llIIIllIl[0]);
                            C0000a.a(llIIIllIl[13], llIIIllIl[10]);
                            C0000a.a(llIIIllIl[14], llIIIllIl[10]);
                            C0000a.a(llIIIllIl[15], llIIIllIl[0]);
                            C0000a.a(llIIIllIl[16], llIIIllIl[11]);
                            C0000a.a(llIIIllIl[17], llIIIllIl[8]);
                            C0000a.a(llIIIllIl[9], llIIIllIl[21]);
                        }
                    }
                }
            }
            if (lIlIIlllIIlI(Inventory.contains(C0005f.bc) ? 1 : 0) && lIlIIlllIIll(Movement.getRunEnergy(), llIIIllIl[22])) {
                Inventory.getFirst(C0005f.bc).interact(llIIIllII[llIIIllIl[5]]);
                Time.sleepTicks(llIIIllIl[0]);
                "".length();
            }
            int[] iArr5 = new int[llIIIllIl[0]];
            iArr5[llIIIllIl[1]] = llIIIllIl[9];
            if (lIlIIlllIIlI(Inventory.contains(iArr5) ? 1 : 0) && lIlIIllllIIl(lIlIIlllIIIl(C0004e.w(), 60.0d))) {
                int[] iArr6 = new int[llIIIllIl[0]];
                iArr6[llIIIllIl[1]] = llIIIllIl[9];
                Inventory.getFirst(iArr6).interact(llIIIllII[llIIIllIl[12]]);
                Time.sleepTicks(llIIIllIl[0]);
                "".length();
            }
            WorldPoint worldPoint = new WorldPoint(llIIIllIl[23], llIIIllIl[24], llIIIllIl[1]);
            WorldPoint worldPoint2 = new WorldPoint(llIIIllIl[25], llIIIllIl[24], llIIIllIl[1]);
            WorldPoint worldPoint3 = new WorldPoint(llIIIllIl[26], llIIIllIl[24], llIIIllIl[1]);
            WorldPoint worldPoint4 = new WorldPoint(llIIIllIl[27], llIIIllIl[24], llIIIllIl[1]);
            if (!lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || !lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) || !lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                String[] strArr = new String[llIIIllIl[0]];
                strArr[llIIIllIl[1]] = llIIIllII[llIIIllIl[21]];
                TileObjects.getNearest(strArr).interact(llIIIllII[llIIIllIl[28]]);
                Time.sleepTicks(llIIIllIl[29]);
                "".length();
            }
            if (lIlIIlllIlIl(C0004e.j(llIIIllIl[4]), llIIIllIl[5]) && lIlIIlllIIll(C0004e.j(llIIIllIl[4]), llIIIllIl[30]) && lIlIIlllIIlI(bE() ? 1 : 0)) {
                if (lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fd), llIIIllIl[31])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[32]];
                    int[] iArr7 = new int[llIIIllIl[0]];
                    iArr7[llIIIllIl[1]] = llIIIllIl[14];
                    if (lIlIIlllIIlI(Inventory.contains(iArr7) ? 1 : 0) && lIlIIlllIllI(Players.getLocal().getAnimation(), llIIIllIl[33])) {
                        int[] iArr8 = new int[llIIIllIl[0]];
                        iArr8[llIIIllIl[1]] = llIIIllIl[14];
                        Inventory.getFirst(iArr8).interact(llIIIllII[llIIIllIl[10]]);
                        Time.sleepTicks(llIIIllIl[7]);
                        "".length();
                    }
                }
                if (lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fd), llIIIllIl[31])) {
                    if (lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[34]];
                        if (lIlIIlllIIlI(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (!lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0) || lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIllIl[37], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                            C0004e.c(new WorldPoint(llIIIllIl[38], llIIIllIl[39], llIIIllIl[1]));
                            Time.sleepTicks(llIIIllIl[8]);
                            "".length();
                        }
                        Widget widget = Widgets.get(llIIIllIl[40], llIIIllIl[30]);
                        if (lIlIIlllIlll(widget)) {
                            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                            Time.sleepTicks(llIIIllIl[11]);
                            "".length();
                        }
                        Widget widget2 = Widgets.get(llIIIllIl[40], llIIIllIl[41]);
                        if (lIlIIlllIlll(widget2)) {
                            Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                            Time.sleepTicks(llIIIllIl[11]);
                            "".length();
                        }
                        if (lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIllIl[42], llIIIllIl[43], llIIIllIl[1])) ? 1 : 0)) {
                            C0004e.c(new WorldPoint(llIIIllIl[44], llIIIllIl[45], llIIIllIl[1]));
                            Time.sleepTicks(C0004e.c(llIIIllIl[5], llIIIllIl[28]));
                            "".length();
                        }
                        if (lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0) && lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIllIl[37], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                            Movement.walkTo(fh);
                            "".length();
                            Time.sleepTicks(llIIIllIl[0]);
                            "".length();
                        }
                    }
                    if (lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                        C0004e.l(llIIIllIl[19]);
                        String[] strArr2 = new String[llIIIllIl[0]];
                        strArr2[llIIIllIl[1]] = llIIIllII[llIIIllIl[46]];
                        if (lIlIIlllIlII(Inventory.contains(strArr2) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIIllII[llIIIllIl[47]];
                            String[] strArr3 = new String[llIIIllIl[0]];
                            strArr3[llIIIllIl[1]] = llIIIllII[llIIIllIl[48]];
                            TileItem nearest2 = TileItems.getNearest(strArr3);
                            if (lIlIIlllIlll(nearest2)) {
                                String[] strArr4 = new String[llIIIllIl[0]];
                                strArr4[llIIIllIl[1]] = llIIIllII[llIIIllIl[29]];
                                if (lIlIIlllllII(TileItems.getNearest(strArr4))) {
                                    nearest2.interact(llIIIllII[llIIIllIl[49]]);
                                    Time.sleepTicks(llIIIllIl[7]);
                                    "".length();
                                }
                            }
                            String[] strArr5 = new String[llIIIllIl[0]];
                            strArr5[llIIIllIl[1]] = llIIIllII[llIIIllIl[41]];
                            TileItem nearest3 = TileItems.getNearest(strArr5);
                            if (lIlIIlllIlll(nearest3)) {
                                nearest3.interact(llIIIllII[llIIIllIl[50]]);
                                Time.sleepTicks(llIIIllIl[0]);
                                "".length();
                            }
                        }
                        String[] strArr6 = new String[llIIIllIl[0]];
                        strArr6[llIIIllIl[1]] = llIIIllII[llIIIllIl[51]];
                        if (lIlIIlllIIlI(Inventory.contains(strArr6) ? 1 : 0)) {
                            String[] strArr7 = new String[llIIIllIl[0]];
                            strArr7[llIIIllIl[1]] = llIIIllII[llIIIllIl[30]];
                            if (lIlIIlllIlII(Inventory.contains(strArr7) ? 1 : 0)) {
                                String[] strArr8 = new String[llIIIllIl[0]];
                                strArr8[llIIIllIl[1]] = llIIIllII[llIIIllIl[52]];
                                TileObjects.getNearest(strArr8).interact(llIIIllII[llIIIllIl[53]]);
                                Time.sleepTicks(llIIIllIl[7]);
                                "".length();
                            }
                        }
                        String[] strArr9 = new String[llIIIllIl[0]];
                        strArr9[llIIIllIl[1]] = llIIIllII[llIIIllIl[54]];
                        if (lIlIIlllllII(NPCs.getNearest(strArr9))) {
                            String[] strArr10 = new String[llIIIllIl[0]];
                            strArr10[llIIIllIl[1]] = llIIIllII[llIIIllIl[55]];
                            TileObjects.getNearest(strArr10).interact(llIIIllII[llIIIllIl[56]]);
                            Time.sleepTicks(llIIIllIl[8]);
                            "".length();
                        }
                        String[] strArr11 = new String[llIIIllIl[0]];
                        strArr11[llIIIllIl[1]] = llIIIllII[llIIIllIl[57]];
                        if (lIlIIlllIlll(NPCs.getNearest(strArr11))) {
                            C0006g.a(llIIIllII[llIIIllIl[58]], cG);
                        }
                    }
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[30])) {
                dk = llIIIllIl[1];
                String[] strArr12 = new String[llIIIllIl[0]];
                strArr12[llIIIllIl[1]] = llIIIllII[llIIIllIl[59]];
                if (lIlIIlllIIlI(Inventory.contains(strArr12) ? 1 : 0)) {
                    String[] strArr13 = new String[llIIIllIl[0]];
                    strArr13[llIIIllIl[1]] = llIIIllII[llIIIllIl[60]];
                    if (lIlIIlllIIlI(Inventory.contains(strArr13) ? 1 : 0)) {
                        int[] iArr9 = new int[llIIIllIl[0]];
                        iArr9[llIIIllIl[1]] = llIIIllIl[19];
                        if (lIlIIlllIIlI(Inventory.contains(iArr9) ? 1 : 0)) {
                            int[] iArr10 = new int[llIIIllIl[0]];
                            iArr10[llIIIllIl[1]] = llIIIllIl[19];
                            if (lIlIIlllIlII(Equipment.contains(iArr10) ? 1 : 0)) {
                                int[] iArr11 = new int[llIIIllIl[0]];
                                iArr11[llIIIllIl[1]] = llIIIllIl[19];
                                Inventory.getFirst(iArr11).interact(llIIIllII[llIIIllIl[61]]);
                            }
                        }
                        String[] strArr14 = new String[llIIIllIl[0]];
                        strArr14[llIIIllIl[1]] = llIIIllII[llIIIllIl[62]];
                        if (lIlIIlllllII(NPCs.getNearest(strArr14))) {
                            String[] strArr15 = new String[llIIIllIl[0]];
                            strArr15[llIIIllIl[1]] = llIIIllII[llIIIllIl[63]];
                            TileObjects.getNearest(strArr15).interact(llIIIllII[llIIIllIl[64]]);
                            Time.sleepTicks(llIIIllIl[8]);
                            "".length();
                        }
                        String[] strArr16 = new String[llIIIllIl[0]];
                        strArr16[llIIIllIl[1]] = llIIIllII[llIIIllIl[65]];
                        if (lIlIIlllIlll(NPCs.getNearest(strArr16))) {
                            if (lIlIIlllIIll(dy, llIIIllIl[0])) {
                                String[] strArr17 = new String[llIIIllIl[0]];
                                strArr17[llIIIllIl[1]] = llIIIllII[llIIIllIl[66]];
                                Item first = Inventory.getFirst(strArr17);
                                String[] strArr18 = new String[llIIIllIl[0]];
                                strArr18[llIIIllIl[1]] = llIIIllII[llIIIllIl[67]];
                                first.useOn(NPCs.getNearest(strArr18));
                                Time.sleepTicks(llIIIllIl[11]);
                                "".length();
                                dy += llIIIllIl[0];
                            }
                            if (lIlIIlllIlII(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr19 = new String[llIIIllIl[0]];
                                strArr19[llIIIllIl[1]] = llIIIllII[llIIIllIl[68]];
                                Item first2 = Inventory.getFirst(strArr19);
                                String[] strArr20 = new String[llIIIllIl[0]];
                                strArr20[llIIIllIl[1]] = llIIIllII[llIIIllIl[69]];
                                first2.useOn(NPCs.getNearest(strArr20));
                                Time.sleepTicks(llIIIllIl[11]);
                                "".length();
                            }
                            C0006g.a(cG);
                        }
                    }
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[56])) {
                String[] strArr21 = new String[llIIIllIl[0]];
                strArr21[llIIIllIl[1]] = llIIIllII[llIIIllIl[70]];
                if (lIlIIlllllII(NPCs.getNearest(strArr21))) {
                    String[] strArr22 = new String[llIIIllIl[0]];
                    strArr22[llIIIllIl[1]] = llIIIllII[llIIIllIl[71]];
                    TileObjects.getNearest(strArr22).interact(llIIIllII[llIIIllIl[72]]);
                    Time.sleepTicks(llIIIllIl[8]);
                    "".length();
                }
                if (lIlIIlllIlII(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr23 = new String[llIIIllIl[0]];
                    strArr23[llIIIllIl[1]] = llIIIllII[llIIIllIl[73]];
                    Item first3 = Inventory.getFirst(strArr23);
                    String[] strArr24 = new String[llIIIllIl[0]];
                    strArr24[llIIIllIl[1]] = llIIIllII[llIIIllIl[74]];
                    first3.useOn(NPCs.getNearest(strArr24));
                }
                C0006g.a(cG);
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[61])) {
                String[] strArr25 = new String[llIIIllIl[0]];
                strArr25[llIIIllIl[1]] = llIIIllII[llIIIllIl[75]];
                if (lIlIIlllllII(NPCs.getNearest(strArr25))) {
                    String[] strArr26 = new String[llIIIllIl[0]];
                    strArr26[llIIIllIl[1]] = llIIIllII[llIIIllIl[76]];
                    TileObjects.getNearest(strArr26).interact(llIIIllII[llIIIllIl[77]]);
                    Time.sleepTicks(llIIIllIl[8]);
                    "".length();
                }
                String[] strArr27 = new String[llIIIllIl[0]];
                strArr27[llIIIllIl[1]] = llIIIllII[llIIIllIl[78]];
                if (lIlIIlllIlll(NPCs.getNearest(strArr27))) {
                    C0006g.a(llIIIllII[llIIIllIl[79]], cG);
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[66])) {
                if (lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[80]];
                    int[] iArr12 = new int[llIIIllIl[0]];
                    iArr12[llIIIllIl[1]] = llIIIllIl[14];
                    if (lIlIIlllIIlI(Inventory.contains(iArr12) ? 1 : 0) && lIlIIlllIllI(Players.getLocal().getAnimation(), llIIIllIl[33])) {
                        int[] iArr13 = new int[llIIIllIl[0]];
                        iArr13[llIIIllIl[1]] = llIIIllIl[14];
                        Inventory.getFirst(iArr13).interact(llIIIllII[llIIIllIl[22]]);
                        Time.sleepTicks(llIIIllIl[7]);
                        "".length();
                    }
                }
                if (lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[12]) && lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[81]];
                    Movement.walkTo(fi);
                    "".length();
                    Time.sleepTicks(llIIIllIl[0]);
                    "".length();
                }
                String[] strArr28 = new String[llIIIllIl[0]];
                strArr28[llIIIllIl[1]] = llIIIllII[llIIIllIl[82]];
                if (lIlIIlllIlll(TileObjects.getNearest(strArr28))) {
                    String[] strArr29 = new String[llIIIllIl[0]];
                    strArr29[llIIIllIl[1]] = llIIIllII[llIIIllIl[83]];
                    TileObjects.getNearest(strArr29).interact(llIIIllII[llIIIllIl[84]]);
                    Time.sleepTicks(llIIIllIl[11]);
                    "".length();
                }
                if (lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[29])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[85]];
                    C0006g.a(llIIIllII[llIIIllIl[86]], cG);
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[71])) {
                if (lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[87]];
                    int[] iArr14 = new int[llIIIllIl[0]];
                    iArr14[llIIIllIl[1]] = llIIIllIl[14];
                    if (lIlIIlllIIlI(Inventory.contains(iArr14) ? 1 : 0) && lIlIIlllIllI(Players.getLocal().getAnimation(), llIIIllIl[33])) {
                        int[] iArr15 = new int[llIIIllIl[0]];
                        iArr15[llIIIllIl[1]] = llIIIllIl[14];
                        Inventory.getFirst(iArr15).interact(llIIIllII[llIIIllIl[88]]);
                        Time.sleepTicks(llIIIllIl[7]);
                        "".length();
                    }
                }
                if (lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(ff) ? 1 : 0) && lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[89]];
                    Movement.walkTo(ff);
                    "".length();
                    Time.sleepTicks(llIIIllIl[0]);
                    "".length();
                    Widget widget3 = Widgets.get(llIIIllIl[40], llIIIllIl[30]);
                    if (lIlIIlllIlll(widget3)) {
                        Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                        Time.sleepTicks(llIIIllIl[11]);
                        "".length();
                    }
                    Widget widget4 = Widgets.get(llIIIllIl[40], llIIIllIl[41]);
                    if (lIlIIlllIlll(widget4)) {
                        Mouse.click(widget4.getClickPoint().getX(), widget4.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                        Time.sleepTicks(llIIIllIl[11]);
                        "".length();
                    }
                }
                if (lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(ff) ? 1 : 0)) {
                    int[] iArr16 = new int[llIIIllIl[0]];
                    iArr16[llIIIllIl[1]] = llIIIllIl[90];
                    if (lIlIIlllIIlI(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llIIIllIl[0]];
                        iArr17[llIIIllIl[1]] = llIIIllIl[90];
                        Inventory.getFirst(iArr17).interact(llIIIllII[llIIIllIl[3]]);
                        Time.sleepTicks(llIIIllIl[7]);
                        "".length();
                    }
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[76])) {
                String[] strArr30 = new String[llIIIllIl[0]];
                strArr30[llIIIllIl[1]] = llIIIllII[llIIIllIl[91]];
                TileObject nearest4 = TileObjects.getNearest(strArr30);
                if (lIlIIlllIlll(nearest4)) {
                    nearest4.interact(llIIIllII[llIIIllIl[92]]);
                    Time.sleepTicks(llIIIllIl[7]);
                    "".length();
                }
                String[] strArr31 = new String[llIIIllIl[0]];
                strArr31[llIIIllIl[1]] = llIIIllII[llIIIllIl[93]];
                TileItem nearest5 = TileItems.getNearest(strArr31);
                if (lIlIIlllIlll(nearest5)) {
                    nearest5.interact(llIIIllII[llIIIllIl[94]]);
                    Time.sleepTicks(llIIIllIl[7]);
                    "".length();
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[22])) {
                if (lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[95]];
                    Movement.walkTo(fh);
                    "".length();
                    Time.sleepTicks(llIIIllIl[0]);
                    "".length();
                    if (lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIllIl[42], llIIIllIl[43], llIIIllIl[1])) ? 1 : 0)) {
                        C0004e.c(new WorldPoint(llIIIllIl[44], llIIIllIl[45], llIIIllIl[1]));
                        Time.sleepTicks(C0004e.c(llIIIllIl[5], llIIIllIl[28]));
                        "".length();
                    }
                    if (lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                        C0004e.c(new WorldPoint(llIIIllIl[38], llIIIllIl[39], llIIIllIl[1]));
                        Time.sleepTicks(llIIIllIl[8]);
                        "".length();
                    }
                    Widget widget5 = Widgets.get(llIIIllIl[40], llIIIllIl[30]);
                    if (lIlIIlllIlll(widget5)) {
                        Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                        Time.sleepTicks(llIIIllIl[11]);
                        "".length();
                    }
                    Widget widget6 = Widgets.get(llIIIllIl[40], llIIIllIl[41]);
                    if (lIlIIlllIlll(widget6)) {
                        Mouse.click(widget6.getClickPoint().getX(), widget6.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                        Time.sleepTicks(llIIIllIl[11]);
                        "".length();
                    }
                }
                if (lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                    String[] strArr32 = new String[llIIIllIl[0]];
                    strArr32[llIIIllIl[1]] = llIIIllII[llIIIllIl[96]];
                    if (lIlIIlllllII(NPCs.getNearest(strArr32))) {
                        String[] strArr33 = new String[llIIIllIl[0]];
                        strArr33[llIIIllIl[1]] = llIIIllII[llIIIllIl[97]];
                        TileObjects.getNearest(strArr33).interact(llIIIllII[llIIIllIl[98]]);
                        Time.sleepTicks(llIIIllIl[8]);
                        "".length();
                    }
                    String[] strArr34 = new String[llIIIllIl[0]];
                    strArr34[llIIIllIl[1]] = llIIIllII[llIIIllIl[99]];
                    if (lIlIIlllIlll(NPCs.getNearest(strArr34))) {
                        C0006g.a(llIIIllII[llIIIllIl[100]], cG);
                    }
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[85])) {
                String[] strArr35 = new String[llIIIllIl[0]];
                strArr35[llIIIllIl[1]] = llIIIllII[llIIIllIl[101]];
                if (lIlIIlllIIlI(Inventory.contains(strArr35) ? 1 : 0)) {
                    String[] strArr36 = new String[llIIIllIl[0]];
                    strArr36[llIIIllIl[1]] = llIIIllII[llIIIllIl[102]];
                    if (lIlIIllllIlI(Inventory.getAll(strArr36).size(), llIIIllIl[11])) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[103]];
                        String[] strArr37 = new String[llIIIllIl[0]];
                        strArr37[llIIIllIl[1]] = llIIIllII[llIIIllIl[104]];
                        Item first4 = Inventory.getFirst(strArr37);
                        int[] iArr18 = new int[llIIIllIl[0]];
                        iArr18[llIIIllIl[1]] = llIIIllIl[105];
                        first4.useOn(TileObjects.getNearest(iArr18));
                        Time.sleepTicks(llIIIllIl[11]);
                        "".length();
                    }
                }
                String[] strArr38 = new String[llIIIllIl[0]];
                strArr38[llIIIllIl[1]] = llIIIllII[llIIIllIl[106]];
                if (lIlIIlllIIlI(Inventory.contains(strArr38) ? 1 : 0)) {
                    String[] strArr39 = new String[llIIIllIl[0]];
                    strArr39[llIIIllIl[1]] = llIIIllII[llIIIllIl[107]];
                    Item first5 = Inventory.getFirst(strArr39);
                    int[] iArr19 = new int[llIIIllIl[0]];
                    iArr19[llIIIllIl[1]] = llIIIllIl[108];
                    first5.useOn(TileObjects.getNearest(iArr19));
                    Time.sleepTicks(llIIIllIl[11]);
                    "".length();
                }
                String[] strArr40 = new String[llIIIllIl[0]];
                strArr40[llIIIllIl[1]] = llIIIllII[llIIIllIl[109]];
                if (lIlIIlllIlII(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[llIIIllIl[0]];
                    strArr41[llIIIllIl[1]] = llIIIllII[llIIIllIl[110]];
                    if (lIlIIllllIll(Inventory.getAll(strArr41).size(), llIIIllIl[11])) {
                        int[] iArr20 = new int[llIIIllIl[0]];
                        iArr20[llIIIllIl[1]] = llIIIllIl[111];
                        WorldPoint worldLocation = TileObjects.getNearest(iArr20).getWorldLocation();
                        if (lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(worldLocation) ? 1 : 0)) {
                            Movement.walkTo(worldLocation);
                            "".length();
                            Time.sleepTicks(llIIIllIl[0]);
                            "".length();
                        }
                        if (lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(worldLocation) ? 1 : 0)) {
                            AccBuilderGWD.c = llIIIllII[llIIIllIl[112]];
                            C0006g.a(llIIIllII[llIIIllIl[113]], cG);
                        }
                    }
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[3]) && lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fg), llIIIllIl[10])) {
                String[] strArr42 = new String[llIIIllIl[0]];
                strArr42[llIIIllIl[1]] = llIIIllII[llIIIllIl[114]];
                TileObjects.getNearest(strArr42).interact(llIIIllII[llIIIllIl[115]]);
                Time.sleepTicks(llIIIllIl[8]);
                "".length();
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[95])) {
                String[] strArr43 = new String[llIIIllIl[0]];
                strArr43[llIIIllIl[1]] = llIIIllII[llIIIllIl[116]];
                if (lIlIIlllllII(NPCs.getNearest(strArr43))) {
                    int[] iArr21 = new int[llIIIllIl[0]];
                    iArr21[llIIIllIl[1]] = llIIIllIl[117];
                    TileObjects.getNearest(iArr21).interact(llIIIllII[llIIIllIl[118]]);
                    Time.sleepTicks(llIIIllIl[8]);
                    "".length();
                }
                String[] strArr44 = new String[llIIIllIl[0]];
                strArr44[llIIIllIl[1]] = llIIIllII[llIIIllIl[119]];
                if (lIlIIlllIlll(NPCs.getNearest(strArr44))) {
                    C0006g.a(llIIIllII[llIIIllIl[120]], cG);
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[100])) {
                String[] strArr45 = new String[llIIIllIl[0]];
                strArr45[llIIIllIl[1]] = llIIIllII[llIIIllIl[121]];
                if (lIlIIlllllII(NPCs.getNearest(strArr45))) {
                    String[] strArr46 = new String[llIIIllIl[0]];
                    strArr46[llIIIllIl[1]] = llIIIllII[llIIIllIl[122]];
                    if (lIlIIlllllII(NPCs.getNearest(strArr46))) {
                        int[] iArr22 = new int[llIIIllIl[0]];
                        iArr22[llIIIllIl[1]] = llIIIllIl[117];
                        TileObjects.getNearest(iArr22).interact(llIIIllII[llIIIllIl[123]]);
                        Time.sleepTicks(llIIIllIl[8]);
                        "".length();
                    }
                }
                String[] strArr47 = new String[llIIIllIl[0]];
                strArr47[llIIIllIl[1]] = llIIIllII[llIIIllIl[124]];
                if (lIlIIlllIlll(NPCs.getNearest(strArr47))) {
                    C0006g.a(llIIIllII[llIIIllIl[125]], cG);
                }
                String[] strArr48 = new String[llIIIllIl[0]];
                strArr48[llIIIllIl[1]] = llIIIllII[llIIIllIl[126]];
                if (lIlIIlllIlll(NPCs.getNearest(strArr48))) {
                    C0006g.a(llIIIllII[llIIIllIl[127]], cG);
                }
            }
            if (lIlIIlllIlIl(C0004e.j(llIIIllIl[4]), llIIIllIl[106]) && lIlIIllllIll(C0004e.j(llIIIllIl[4]), llIIIllIl[119])) {
                if (lIlIIlllIIlI(Dialog.isOpen() ? 1 : 0)) {
                    C0006g.a(cG);
                }
                String[] strArr49 = new String[llIIIllIl[0]];
                strArr49[llIIIllIl[1]] = llIIIllII[llIIIllIl[128]];
                if (lIlIIlllIlll(TileObjects.getNearest(strArr49))) {
                    String[] strArr50 = new String[llIIIllIl[0]];
                    strArr50[llIIIllIl[1]] = llIIIllII[llIIIllIl[129]];
                    if (lIlIIlllIIlI(Inventory.contains(strArr50) ? 1 : 0)) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[130]];
                        int[] iArr23 = new int[llIIIllIl[0]];
                        iArr23[llIIIllIl[1]] = llIIIllIl[14];
                        if (lIlIIlllIIlI(Inventory.contains(iArr23) ? 1 : 0) && lIlIIlllIllI(Players.getLocal().getAnimation(), llIIIllIl[33])) {
                            int[] iArr24 = new int[llIIIllIl[0]];
                            iArr24[llIIIllIl[1]] = llIIIllIl[14];
                            Inventory.getFirst(iArr24).interact(llIIIllII[llIIIllIl[131]]);
                            Time.sleepTicks(llIIIllIl[7]);
                            "".length();
                        }
                    }
                }
                if (lIlIIlllIlII(Players.getLocal().getWorldLocation().equals(ff) ? 1 : 0) && lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fi), llIIIllIl[12])) {
                    String[] strArr51 = new String[llIIIllIl[0]];
                    strArr51[llIIIllIl[1]] = llIIIllII[llIIIllIl[132]];
                    if (lIlIIlllllII(TileObjects.getNearest(strArr51))) {
                        AccBuilderGWD.c = llIIIllII[llIIIllIl[133]];
                        Movement.walkTo(ff);
                        "".length();
                        Time.sleepTicks(llIIIllIl[0]);
                        "".length();
                        Widget widget7 = Widgets.get(llIIIllIl[40], llIIIllIl[30]);
                        if (lIlIIlllIlll(widget7)) {
                            Mouse.click(widget7.getClickPoint().getX(), widget7.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                            Time.sleepTicks(llIIIllIl[11]);
                            "".length();
                        }
                        Widget widget8 = Widgets.get(llIIIllIl[40], llIIIllIl[41]);
                        if (lIlIIlllIlll(widget8)) {
                            Mouse.click(widget8.getClickPoint().getX(), widget8.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                            Time.sleepTicks(llIIIllIl[11]);
                            "".length();
                        }
                    }
                }
                if (lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(ff) ? 1 : 0)) {
                    int[] iArr25 = new int[llIIIllIl[0]];
                    iArr25[llIIIllIl[1]] = llIIIllIl[134];
                    if (lIlIIlllIIlI(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[llIIIllIl[0]];
                        iArr26[llIIIllIl[1]] = llIIIllIl[134];
                        Inventory.getFirst(iArr26).interact(llIIIllII[llIIIllIl[135]]);
                        Time.sleepTicks(llIIIllIl[7]);
                        "".length();
                    }
                }
                String[] strArr52 = new String[llIIIllIl[0]];
                strArr52[llIIIllIl[1]] = llIIIllII[llIIIllIl[136]];
                TileObject nearest6 = TileObjects.getNearest(strArr52);
                if (lIlIIlllIlll(nearest6)) {
                    nearest6.interact(llIIIllII[llIIIllIl[137]]);
                    Time.sleepTicks(llIIIllIl[7]);
                    "".length();
                }
                String[] strArr53 = new String[llIIIllIl[0]];
                strArr53[llIIIllIl[1]] = llIIIllII[llIIIllIl[138]];
                TileItem nearest7 = TileItems.getNearest(strArr53);
                if (lIlIIlllIlll(nearest7)) {
                    nearest7.interact(llIIIllII[llIIIllIl[139]]);
                    Time.sleepTicks(llIIIllIl[7]);
                    "".length();
                }
                String[] strArr54 = new String[llIIIllIl[0]];
                strArr54[llIIIllIl[1]] = llIIIllII[llIIIllIl[140]];
                if (lIlIIlllIIlI(Inventory.contains(strArr54) ? 1 : 0) && lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(ff) ? 1 : 0)) {
                    String[] strArr55 = new String[llIIIllIl[0]];
                    strArr55[llIIIllIl[1]] = llIIIllII[llIIIllIl[141]];
                    if (lIlIIlllIIlI(Inventory.contains(strArr55) ? 1 : 0)) {
                        String[] strArr56 = new String[llIIIllIl[0]];
                        strArr56[llIIIllIl[1]] = llIIIllII[llIIIllIl[142]];
                        Inventory.getFirst(strArr56).interact(llIIIllII[llIIIllIl[143]]);
                        Time.sleepTicks(llIIIllIl[0]);
                        "".length();
                    }
                }
            }
            if (lIlIIlllIlIl(C0004e.j(llIIIllIl[4]), llIIIllIl[124]) && lIlIIlllIIll(C0004e.j(llIIIllIl[4]), llIIIllIl[140])) {
                int[] iArr27 = new int[llIIIllIl[0]];
                iArr27[llIIIllIl[1]] = llIIIllIl[20];
                if (lIlIIlllIlII(Equipment.contains(iArr27) ? 1 : 0)) {
                    int[] iArr28 = new int[llIIIllIl[0]];
                    iArr28[llIIIllIl[1]] = llIIIllIl[20];
                    if (lIlIIlllIIlI(Inventory.contains(iArr28) ? 1 : 0)) {
                        int[] iArr29 = new int[llIIIllIl[0]];
                        iArr29[llIIIllIl[1]] = llIIIllIl[20];
                        Inventory.getFirst(iArr29).interact(llIIIllII[llIIIllIl[144]]);
                    }
                }
                String[] strArr57 = new String[llIIIllIl[0]];
                strArr57[llIIIllIl[1]] = llIIIllII[llIIIllIl[145]];
                NPC npc = (NPC) NPCs.getAll(strArr57).stream().filter(npc2 -> {
                    String[] strArr58 = new String[llIIIllIl[0]];
                    strArr58[llIIIllIl[1]] = llIIIllII[llIIIllIl[181]];
                    return npc2.hasAction(strArr58);
                }).findFirst().orElse(null);
                if (lIlIIlllIIll(Prayers.getPoints(), llIIIllIl[30])) {
                    Inventory.getFirst(item -> {
                        return item.getName().contains(llIIIllII[llIIIllIl[180]]);
                    }).interact(llIIIllII[llIIIllIl[146]]);
                }
                if (lIlIIlllllII(npc)) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[147]];
                    if (lIlIIlllIIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                    String[] strArr58 = new String[llIIIllIl[0]];
                    strArr58[llIIIllIl[1]] = llIIIllII[llIIIllIl[148]];
                    Item first6 = Inventory.getFirst(strArr58);
                    String[] strArr59 = new String[llIIIllIl[0]];
                    strArr59[llIIIllIl[1]] = llIIIllII[llIIIllIl[149]];
                    first6.useOn(NPCs.getNearest(strArr59));
                    Time.sleepTicks(llIIIllIl[32]);
                    "".length();
                }
                if (lIlIIlllIlll(npc)) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[150]];
                    if (lIlIIlllIlII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                    }
                }
                if (lIlIIlllIlll(npc) && lIlIIlllllII(Players.getLocal().getInteracting())) {
                    AccBuilderGWD.c = llIIIllII[llIIIllIl[151]];
                    npc.interact(llIIIllII[llIIIllIl[152]]);
                    Time.sleepTicks(llIIIllIl[7]);
                    "".length();
                }
            }
            if (lIlIIlllIllI(C0004e.j(llIIIllIl[4]), llIIIllIl[140])) {
                if (lIlIIlllIIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8]) && lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fg), llIIIllIl[29])) {
                    bD();
                }
                if (lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
                    String[] strArr60 = new String[llIIIllIl[0]];
                    strArr60[llIIIllIl[1]] = llIIIllII[llIIIllIl[153]];
                    TileObjects.getNearest(strArr60).interact(llIIIllII[llIIIllIl[154]]);
                    Time.sleepTicks(llIIIllIl[8]);
                    "".length();
                }
                if (lIlIIllllIll(Players.getLocal().getWorldLocation().distanceTo(fg), llIIIllIl[29])) {
                    if (lIlIIlllIIll(dk, llIIIllIl[0])) {
                        as.nC += llIIIllIl[0];
                        as.u(AccBuilderGWD.m);
                        dk += llIIIllIl[0];
                        as.nC = llIIIllIl[1];
                        dl = llIIIllIl[1];
                    }
                    String[] strArr61 = new String[llIIIllIl[0]];
                    strArr61[llIIIllIl[1]] = llIIIllII[llIIIllIl[155]];
                    if (lIlIIlllllII(NPCs.getNearest(strArr61))) {
                        String[] strArr62 = new String[llIIIllIl[0]];
                        strArr62[llIIIllIl[1]] = llIIIllII[llIIIllIl[156]];
                        if (lIlIIlllllII(NPCs.getNearest(strArr62))) {
                            int[] iArr30 = new int[llIIIllIl[0]];
                            iArr30[llIIIllIl[1]] = llIIIllIl[117];
                            TileObjects.getNearest(iArr30).interact(llIIIllII[llIIIllIl[157]]);
                            Time.sleepTicks(llIIIllIl[8]);
                            "".length();
                        }
                    }
                    String[] strArr63 = new String[llIIIllIl[0]];
                    strArr63[llIIIllIl[1]] = llIIIllII[llIIIllIl[158]];
                    if (lIlIIlllIlll(NPCs.getNearest(strArr63))) {
                        C0006g.a(llIIIllII[llIIIllIl[159]], cG);
                    }
                    String[] strArr64 = new String[llIIIllIl[0]];
                    strArr64[llIIIllIl[1]] = llIIIllII[llIIIllIl[160]];
                    if (lIlIIlllIlll(NPCs.getNearest(strArr64))) {
                        C0006g.a(llIIIllII[llIIIllIl[161]], cG);
                    }
                }
            }
        }
    }

    private static boolean lIlIIllllIII(int i) {
        return i > 0;
    }

    private static int lIlIIlllIIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c3, code lost:
        if (lIlIIlllIIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.E.llIIIllIl[10]) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[llIIIllIl[0]];
        iArr3[llIIIllIl[1]] = llIIIllIl[20];
        if (lIlIIlllIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(llIIIllIl[20], llIIIllIl[0], llIIIllIl[169]));
            "".length();
        }
        int[] iArr4 = new int[llIIIllIl[0]];
        iArr4[llIIIllIl[1]] = llIIIllIl[18];
        if (lIlIIlllIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llIIIllIl[18], llIIIllIl[0], llIIIllIl[170]));
            "".length();
        }
        int[] iArr5 = new int[llIIIllIl[0]];
        iArr5[llIIIllIl[1]] = llIIIllIl[14];
        if (lIlIIlllIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llIIIllIl[14], llIIIllIl[10], C0004e.c(llIIIllIl[171], llIIIllIl[172])));
            "".length();
        }
        int[] iArr6 = new int[llIIIllIl[0]];
        iArr6[llIIIllIl[1]] = llIIIllIl[16];
        if (lIlIIlllIlII(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(llIIIllIl[16], llIIIllIl[11], llIIIllIl[173]));
            "".length();
        }
        int[] iArr7 = new int[llIIIllIl[0]];
        iArr7[llIIIllIl[1]] = llIIIllIl[17];
        if (lIlIIlllIlII(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(llIIIllIl[17], llIIIllIl[5], C0009j.ch));
            "".length();
        }
        int[] iArr8 = new int[llIIIllIl[0]];
        iArr8[llIIIllIl[1]] = llIIIllIl[9];
        if (lIlIIlllIIlI(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llIIIllIl[0]];
            iArr9[llIIIllIl[1]] = llIIIllIl[9];
            if (lIlIIlllIIlI(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIllIl[0]];
                iArr10[llIIIllIl[1]] = llIIIllIl[9];
            }
            iArr = new int[llIIIllIl[0]];
            iArr[llIIIllIl[1]] = llIIIllIl[15];
            if (lIlIIlllIlII(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(llIIIllIl[15], llIIIllIl[0], llIIIllIl[169]));
                "".length();
            }
            if (lIlIIlllIlII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIIIllII[llIIIllIl[179]]);
            }) ? 1 : 0)) {
                bx.add(new C0003d(llIIIllIl[175], llIIIllIl[5], llIIIllIl[176]));
                "".length();
            }
            iArr2 = new int[llIIIllIl[0]];
            iArr2[llIIIllIl[1]] = llIIIllIl[13];
            if (lIlIIlllIlII(Bank.contains(iArr2) ? 1 : 0)) {
                return;
            }
            bx.add(new C0003d(llIIIllIl[13], llIIIllIl[71], llIIIllIl[177]));
            "".length();
            return;
        }
        bx.add(new C0003d(llIIIllIl[9], llIIIllIl[61], llIIIllIl[174]));
        "".length();
        iArr = new int[llIIIllIl[0]];
        iArr[llIIIllIl[1]] = llIIIllIl[15];
        if (lIlIIlllIlII(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIlIIlllIlII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIIIllII[llIIIllIl[179]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[llIIIllIl[0]];
        iArr2[llIIIllIl[1]] = llIIIllIl[13];
        if (lIlIIlllIlII(Bank.contains(iArr2) ? 1 : 0)) {
        }
    }

    private static String lIlIIllIllII(String lIllIlIlIlIIII, String lIllIlIlIIllIl) {
        try {
            SecretKeySpec lIllIlIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIlIlIlIIlI = Cipher.getInstance("Blowfish");
            lIllIlIlIlIIlI.init(llIIIllIl[7], lIllIlIlIlIIll);
            return new String(lIllIlIlIlIIlI.doFinal(Base64.getDecoder().decode(lIllIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlIlIlIIIl) {
            lIllIlIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIllIllll() {
        llIIIllII = new String[llIIIllIl[211]];
        llIIIllII[llIIIllIl[1]] = lIlIIllIllII("wsq5wlt8u70gO1Qi3SM4kdl4YO7i7mBPr9/9fPUDWLopRiXsN3W1QDZqg273OAGs", "WfZCN");
        llIIIllII[llIIIllIl[0]] = lIlIIllIllII("SfLRHDi1RN3wjaP+J5y5fQ==", "OnLiW");
        llIIIllII[llIIIllIl[7]] = lIlIIllIllII("GlRituUsWM+ZkMzLiykn6qWtDMZIh1jo", "IEpuq");
        llIIIllII[llIIIllIl[11]] = lIlIIllIllII("tLVEzJB7V7d+aZKvFP8idSfh+SVjuoZUCZaMQJGMV9rTrmajOrQ/1ZrUartkKmsk28xqUzJJN2Y=", "tEGsw");
        llIIIllII[llIIIllIl[8]] = lIlIIllIllIl("sJmsJoCZNm+TZMA7vgKvmfvjt0NGX4bQobfJf9AyqtWrU+x2Sfww+1JmW+hdPdDvv+ox9OPp+EE=", "GoZdv");
        llIIIllII[llIIIllIl[5]] = lIlIIllIlllI("LAACIzM=", "hrkMX");
        llIIIllII[llIIIllIl[12]] = lIlIIllIllII("3+2+j2h4mjs=", "jpZYe");
        llIIIllII[llIIIllIl[21]] = lIlIIllIllIl("Yd0wx0cXvXw=", "jQNQF");
        llIIIllII[llIIIllIl[28]] = lIlIIllIllII("OgDakppdkCE=", "VwxJI");
        llIIIllII[llIIIllIl[32]] = lIlIIllIlllI("JiEbAxBTIRMBARZyBggbFg==", "sRrmw");
        llIIIllII[llIIIllIl[10]] = lIlIIllIlllI("CTUfEwM=", "KGzrh");
        llIIIllII[llIIIllIl[34]] = lIlIIllIllII("juDChJOPhTDH9/56V5NRbg==", "mOLWG");
        llIIIllII[llIIIllIl[46]] = lIlIIllIllIl("krzwyJ7yFRg=", "TnEsb");
        llIIIllII[llIIIllIl[47]] = lIlIIllIlllI("Ch0XNw4jH0MuDj8KDDE=", "MxcCg");
        llIIIllII[llIIIllIl[48]] = lIlIIllIllIl("Z4xNLwAXjhwEK7XbEdypOg==", "kqJKe");
        llIIIllII[llIIIllIl[29]] = lIlIIllIllII("vzknp1CuoJQ=", "gLkTw");
        llIIIllII[llIIIllIl[49]] = lIlIIllIllIl("Z31gKFKj5Eg=", "BWwXb");
        llIIIllII[llIIIllIl[41]] = lIlIIllIlllI("DBwENgIz", "AuvDm");
        llIIIllII[llIIIllIl[50]] = lIlIIllIllIl("iwvh+H2AdWs=", "NjYUQ");
        llIIIllII[llIIIllIl[51]] = lIlIIllIlllI("OR4WHyUG", "twdmJ");
        llIIIllII[llIIIllIl[30]] = lIlIIllIllIl("25A5RAwD6mY=", "DhvRA");
        llIIIllII[llIIIllIl[52]] = lIlIIllIlllI("CgIhHiciUDoYNig=", "MpNjS");
        llIIIllII[llIIIllIl[53]] = lIlIIllIllIl("7pjJOmJnrtE=", "lmBkC");
        llIIIllII[llIIIllIl[54]] = lIlIIllIlllI("KzEmDi4AOSRCEwwqJg0kBg==", "mXJbG");
        llIIIllII[llIIIllIl[55]] = lIlIIllIllII("5+CbinlUFJ4=", "WjOYM");
        llIIIllII[llIIIllIl[56]] = lIlIIllIlllI("HB4EAgM=", "Yppgq");
        llIIIllII[llIIIllIl[57]] = lIlIIllIllIl("1Hm8cVyAfEZpDPwVPMkRIUdxF2W6A9V1", "OjYWY");
        llIIIllII[llIIIllIl[58]] = lIlIIllIlllI("HzgAHwY0MAJTOzgjABwMMg==", "YQlso");
        llIIIllII[llIIIllIl[59]] = lIlIIllIllII("yPXHl+PpaRk=", "Utmku");
        llIIIllII[llIIIllIl[60]] = lIlIIllIllIl("SHqwuSSFeqU=", "PEgSU");
        llIIIllII[llIIIllIl[61]] = lIlIIllIllII("uVb1CpsGfkE=", "WunNY");
        llIIIllII[llIIIllIl[62]] = lIlIIllIllII("c/u5vQgoecD4844LwqkHrHHLSp0+9RI4", "FXYAe");
        llIIIllII[llIIIllIl[63]] = lIlIIllIlllI("CzcmBS4j", "LEIqZ");
        llIIIllII[llIIIllIl[64]] = lIlIIllIlllI("NS88PRo=", "pAHXh");
        llIIIllII[llIIIllIl[65]] = lIlIIllIllII("IJ81lhTJRG56LXZrmxfNt3qo+3TtS/+g", "Dgpnk");
        llIIIllII[llIIIllIl[66]] = lIlIIllIllII("VXcLlRnvke8=", "eQHvN");
        llIIIllII[llIIIllIl[67]] = lIlIIllIlllI("DQQmOT4mDCR1AyofJjo0IA==", "KmJUW");
        llIIIllII[llIIIllIl[68]] = lIlIIllIllIl("HUAXdn75ico=", "gEqXE");
        llIIIllII[llIIIllIl[69]] = lIlIIllIlllI("MiIvFC8ZKi1YEhU5LxclHw==", "tKCxF");
        llIIIllII[llIIIllIl[70]] = lIlIIllIllII("+8xFyxqlYLdN3YvHejiNJZIBZvLjkHTt", "ixwPA");
        llIIIllII[llIIIllIl[71]] = lIlIIllIlllI("MSgIFQ4Z", "vZgaz");
        llIIIllII[llIIIllIl[72]] = lIlIIllIlllI("LxobKD0=", "jtoMO");
        llIIIllII[llIIIllIl[73]] = lIlIIllIlllI("Mz4TKx0YPQ==", "yQfYs");
        llIIIllII[llIIIllIl[74]] = lIlIIllIllIl("LaHIkYg60zS6Fax3n644fFF5+WpaoA2v", "Gflxy");
        llIIIllII[llIIIllIl[75]] = lIlIIllIlllI("JCwbJB8PJBloIgM3GycVCQ==", "bEwHv");
        llIIIllII[llIIIllIl[76]] = lIlIIllIlllI("DTc8Ogcl", "JESNs");
        llIIIllII[llIIIllIl[77]] = lIlIIllIllIl("9EKdnZPCfV0=", "twTgV");
        llIIIllII[llIIIllIl[78]] = lIlIIllIllIl("fiHcQIEjCOjuLp19+WrxFN23rlfbzvZ2", "xdkum");
        llIIIllII[llIIIllIl[79]] = lIlIIllIllII("yax9NE+5dTSoL6RX5SUiUL2NgOBM1Waq", "IbCqO");
        llIIIllII[llIIIllIl[80]] = lIlIIllIlllI("EwYzGAQ4GjFZGzAW", "QtVyo");
        llIIIllII[llIIIllIl[22]] = lIlIIllIlllI("Gjk/DgM=", "XKZoh");
        llIIIllII[llIIIllIl[81]] = lIlIIllIlllI("CiklaiAraCM4PSE7Jw==", "DHSJT");
        llIIIllII[llIIIllIl[82]] = lIlIIllIllIl("yz26nV9cC2ek+I4wFP96PA==", "gpaYa");
        llIIIllII[llIIIllIl[83]] = lIlIIllIlllI("IhoYCjEZBws=", "vhyzU");
        llIIIllII[llIIIllIl[84]] = lIlIIllIlllI("FxgVAA==", "Xhpnl");
        llIIIllII[llIIIllIl[85]] = lIlIIllIllII("50JKl6sgkOGqU1vufM+22Q==", "ryfHe");
        llIIIllII[llIIIllIl[86]] = lIlIIllIllII("a4ubGatZdYw=", "DUypF");
        llIIIllII[llIIIllIl[87]] = lIlIIllIllII("+4uH4KyKcoD2EvyoW7BKgQ==", "MfVTL");
        llIIIllII[llIIIllIl[88]] = lIlIIllIllII("mXudZXKYWrg=", "MEWDd");
        llIIIllII[llIIIllIl[89]] = lIlIIllIllIl("p7pdsH7tOLNagAooTp5W0Q==", "LuFdR");
        llIIIllII[llIIIllIl[3]] = lIlIIllIlllI("IScQLA==", "bFcXY");
        llIIIllII[llIIIllIl[91]] = lIlIIllIlllI("HycDMjN5PQN1NjY1", "YRmUZ");
        llIIIllII[llIIIllIl[92]] = lIlIIllIlllI("GgoNGw==", "JcnpL");
        llIIIllII[llIIIllIl[93]] = lIlIIllIllII("uchtKMKsfknfbyCzsbgI/w==", "ogIDK");
        llIIIllII[llIIIllIl[94]] = lIlIIllIlllI("EhE1IA==", "BxVKt");
        llIIIllII[llIIIllIl[95]] = lIlIIllIlllI("BRczbxUkViI9Dj8CKg==", "KvEOa");
        llIIIllII[llIIIllIl[96]] = lIlIIllIllII("ovA8eeYnVkJ5I4gJOSfZNmL51a0N7riC", "QVeIM");
        llIIIllII[llIIIllIl[97]] = lIlIIllIllIl("VC4Shm/uRPY=", "qvFZg");
        llIIIllII[llIIIllIl[98]] = lIlIIllIllIl("eA86ZBt63v0=", "EVwfs");
        llIIIllII[llIIIllIl[99]] = lIlIIllIllII("AELs4Xwb5uvxhoIjb7hE9/j1tMmHm8sh", "bAHmw");
        llIIIllII[llIIIllIl[100]] = lIlIIllIllIl("hSXfbpK60GdA3UowAMCizXGM9twlpPuS", "hsOmR");
        llIIIllII[llIIIllIl[101]] = lIlIIllIlllI("NRo9F3YVDD0Gdh4AIQQjCw==", "xuOcV");
        llIIIllII[llIIIllIl[102]] = lIlIIllIlllI("JBkxF1YEDzEGVg8DLQQDGg==", "ivCcv");
        llIIIllII[llIIIllIl[103]] = lIlIIllIllIl("WOYplgen1kecM6tuzpNSrQ==", "VsFvr");
        llIIIllII[llIIIllIl[104]] = lIlIIllIllIl("4rzY5i+tN1xH2lxNHhl9kPJh/gG+IMwk", "iZlBs");
        llIIIllII[llIIIllIl[106]] = lIlIIllIllII("7g9XwG85/CEqfTBRoU26Vw==", "nrXcq");
        llIIIllII[llIIIllIl[107]] = lIlIIllIlllI("OFYCJT0dVgQmPRUa", "yvwVX");
        llIIIllII[llIIIllIl[109]] = lIlIIllIlllI("FmQnKjIzZCEpMjso", "WDRYW");
        llIIIllII[llIIIllIl[110]] = lIlIIllIlllI("Nw4eLHAXGB49cBwUAj8lCQ==", "zalXP");
        llIIIllII[llIIIllIl[112]] = lIlIIllIllIl("q3A2CfRw/4j0cJ2rY1fNEvW/HCNs/HdP", "XkgME");
        llIIIllII[llIIIllIl[113]] = lIlIIllIllIl("BevQ1iaX3KYK3WSh7pCHIS89EEfqVwuq", "RpaIQ");
        llIIIllII[llIIIllIl[114]] = lIlIIllIllII("cTQqAli0TGo=", "sYkEx");
        llIIIllII[llIIIllIl[115]] = lIlIIllIllIl("JgbQ7asa8sg=", "MwgbK");
        llIIIllII[llIIIllIl[116]] = lIlIIllIllIl("H76jHbrJHZ/hbwcvKjW45sfy1qTsPaqZ", "LqUAZ");
        llIIIllII[llIIIllIl[118]] = lIlIIllIllII("AhVEJiUujfU=", "NYOxF");
        llIIIllII[llIIIllIl[119]] = lIlIIllIllIl("184PSELdS0LZ14H+FsMRk/hqDonkOsxn", "HjBZx");
        llIIIllII[llIIIllIl[120]] = lIlIIllIlllI("MQoCOSUaAgB1GBYRAjovHA==", "wcnUL");
        llIIIllII[llIIIllIl[121]] = lIlIIllIlllI("PywmOj0UJCR2ABg3Jjk3Eg==", "yEJVT");
        llIIIllII[llIIIllIl[122]] = lIlIIllIllIl("4DvjgxGpqbKRom/OhJdc1Q==", "YQSdh");
        llIIIllII[llIIIllIl[123]] = lIlIIllIllII("ajEbcG/uvDs=", "KJsBc");
        llIIIllII[llIIIllIl[124]] = lIlIIllIlllI("Lwg2HQsEADRRNggTNh4BAg==", "iaZqb");
        llIIIllII[llIIIllIl[125]] = lIlIIllIlllI("JREJJDgOGQtoBQIKCScyCA==", "cxeHQ");
        llIIIllII[llIIIllIl[126]] = lIlIIllIllII("PCENTGdK6U2E+RrFFfyu4g==", "PYsfz");
        llIIIllII[llIIIllIl[127]] = lIlIIllIlllI("AjMgPx8pcgc6BD47IA==", "LRTJm");
        llIIIllII[llIIIllIl[128]] = lIlIIllIlllI("FgcDAz4+", "QulwJ");
        llIIIllII[llIIIllIl[129]] = lIlIIllIllIl("xG56dl7yrxTveMMjGdN/eQ==", "fhFSD");
        llIIIllII[llIIIllIl[130]] = lIlIIllIllII("P1+djThPim+jHYesRWI+OQ==", "urTnV");
        llIIIllII[llIIIllIl[131]] = lIlIIllIlllI("NwgNKxw=", "uzhJw");
        llIIIllII[llIIIllIl[132]] = lIlIIllIlllI("DDg1GBIk", "KJZlf");
        llIIIllII[llIIIllIl[133]] = lIlIIllIllII("NXT0moMT/kx75BcAI91IHw==", "rvSKC");
        llIIIllII[llIIIllIl[135]] = lIlIIllIlllI("JAU8EkglCCAJBQ==", "gdOfh");
        llIIIllII[llIIIllIl[136]] = lIlIIllIllII("BtTjjwra6QAZKITRkNFQ2w==", "thInV");
        llIIIllII[llIIIllIl[137]] = lIlIIllIlllI("OwYBIg==", "kobIC");
        llIIIllII[llIIIllIl[138]] = lIlIIllIllII("COihpkFiIaRtxfSYdF1XUA==", "NcuWK");
        llIIIllII[llIIIllIl[139]] = lIlIIllIllIl("x7NmqSQvWTw=", "xytPc");
        llIIIllII[llIIIllIl[140]] = lIlIIllIllIl("WJ1UD0O+gvxc7+zlis2Ux1C2JMu1OWS2", "XaKxK");
        llIIIllII[llIIIllIl[141]] = lIlIIllIllII("rrkaA4rw9qbqQYf3bf7fMQ==", "cIdDu");
        llIIIllII[llIIIllIl[142]] = lIlIIllIllIl("PBJth9sGFXq9jx/OiUoF6g==", "BGYbV");
        llIIIllII[llIIIllIl[143]] = lIlIIllIllII("CFhOVJvS64k=", "Ukhwu");
        llIIIllII[llIIIllIl[144]] = lIlIIllIllIl("5PNDqutuIkM=", "LoAPn");
        llIIIllII[llIIIllIl[145]] = lIlIIllIllIl("m+vjSd5CHOk=", "cKVfj");
        llIIIllII[llIIIllIl[146]] = lIlIIllIllIl("iRkpVmXXiG4=", "vcABe");
        llIIIllII[llIIIllIl[147]] = lIlIIllIllII("rGKhruN8STyYOF2H+W757As4Fbk35caz08x7KOzTSX4=", "TWCIv");
        llIIIllII[llIIIllIl[148]] = lIlIIllIllII("fwd5bWmLKFAqL6qv99vK4A==", "lbYBJ");
        llIIIllII[llIIIllIl[149]] = lIlIIllIllIl("kEvV7kQmGmA=", "Ndnbn");
        llIIIllII[llIIIllIl[150]] = lIlIIllIlllI("CSsIPTEsJUQ2MCMxECI=", "BBdQX");
        llIIIllII[llIIIllIl[151]] = lIlIIllIllIl("uEwHL2oE4pCCInyxqdazrJGBbn5EvBIsO1/c5B/5ojs=", "WCIJN");
        llIIIllII[llIIIllIl[152]] = lIlIIllIllIl("0Ve5Yx0UBu4=", "UItYK");
        llIIIllII[llIIIllIl[153]] = lIlIIllIllII("jIUWepdqpZk=", "MyHXR");
        llIIIllII[llIIIllIl[154]] = lIlIIllIlllI("LgQmAis=", "kjRgY");
        llIIIllII[llIIIllIl[155]] = lIlIIllIlllI("KCUdCA0DLR9EMA8+HQsHBQ==", "nLqdd");
        llIIIllII[llIIIllIl[156]] = lIlIIllIlllI("LxsMAAcEWisFHBMTDA==", "azxuu");
        llIIIllII[llIIIllIl[157]] = lIlIIllIllIl("FyDXlZWvtuw=", "KrUtz");
        llIIIllII[llIIIllIl[158]] = lIlIIllIlllI("MRkPCywaEQ1HERYCDwgmHA==", "wpcgE");
        llIIIllII[llIIIllIl[159]] = lIlIIllIlllI("AyUvGiwoLS1WESQ+LxkmLg==", "ELCvE");
        llIIIllII[llIIIllIl[160]] = lIlIIllIllIl("rwBsxJXHSiy1mBLz8F67qw==", "kfpEw");
        llIIIllII[llIIIllIl[161]] = lIlIIllIlllI("HRQNIiI2VSonOSEcDQ==", "SuyWP");
        llIIIllII[llIIIllIl[162]] = lIlIIllIlllI("OhkRcgIbWAAgGQAMCA==", "txgRv");
        llIIIllII[llIIIllIl[163]] = lIlIIllIlllI("FzAnPytkNjkoOCEoKjsqZCUuJSs0Pjk9", "DQKIN");
        llIIIllII[llIIIllIl[164]] = lIlIIllIllII("PMgWhDM6ERuePiiab0mnug==", "ktdBb");
        llIIIllII[llIIIllIl[165]] = lIlIIllIllIl("5TLqwoQBH2ToS2FblE/D2A==", "npxpY");
        llIIIllII[llIIIllIl[166]] = lIlIIllIlllI("ATkCJ2shLwI2ayojHjQ+Pw==", "LVpSK");
        llIIIllII[llIIIllIl[167]] = lIlIIllIllII("+dqltrcNmXA=", "DeZUY");
        llIIIllII[llIIIllIl[168]] = lIlIIllIllII("5a9T0GlMQ/I=", "rqAUf");
        llIIIllII[llIIIllIl[178]] = lIlIIllIllII("9aLYa9mdBSUE64GEfi4NOA==", "tmHtd");
        llIIIllII[llIIIllIl[179]] = lIlIIllIlllI("Gz04LG8GMnY8Kgg4IiNvQQ==", "iTVKO");
        llIIIllII[llIIIllIl[180]] = lIlIIllIlllI("AjUIMBcg", "RGiIr");
        llIIIllII[llIIIllIl[181]] = lIlIIllIllII("47Dbi8XeBtQ=", "pOLQz");
        llIIIllII[llIIIllIl[192]] = lIlIIllIlllI("Al80TSkkFzIEKyxYPwI3axl5HDAuCy1M", "KxYmE");
        llIIIllII[llIIIllIl[193]] = lIlIIllIllII("2Zi6Amr4BZ8=", "EclSb");
        llIIIllII[llIIIllIl[31]] = lIlIIllIllIl("NC3zKqgSMAUvf5Fio8PYxVw62OyLDxhU", "qSaZN");
        llIIIllII[llIIIllIl[194]] = lIlIIllIlllI("LQQXRlIaDhBKBhENC0ofEUEQAhMAQRMCF1QRFQUQGAQKShsHTw==", "tagjr");
        llIIIllII[llIIIllIl[195]] = lIlIIllIllIl("XLrpAJBfYiM=", "BZNkY");
        llIIIllII[llIIIllIl[196]] = lIlIIllIllIl("qeRIDhXtCX9G7rT+l+ccs1BWhz4uul2V", "clbAk");
        llIIIllII[llIIIllIl[197]] = lIlIIllIllIl("wCVcEHWrZ4ry7CoDUlyIcQ/7IOVqLtgLGApiY8DGFPHc1ywE0hHLjgz0QaCJKEE7YkVKPcJuB9A=", "AZhva");
        llIIIllII[llIIIllIl[198]] = lIlIIllIllIl("kdCF3snMv5Mmkljef2+bC2Kzh/zHtF7SdaFsXXiQKRcKSmG+iy1tXMrIIbEgLL9y", "adxVc");
        llIIIllII[llIIIllIl[199]] = lIlIIllIllIl("UB5YxW+XU1vriMQrwTnxXjtE7WQdTiQTCSKPzgweaPY=", "nKZEt");
        llIIIllII[llIIIllIl[200]] = lIlIIllIllIl("63tSSIGPnsLzOrMaUYTF2A==", "Znvda");
        llIIIllII[llIIIllIl[201]] = lIlIIllIllIl("w62jrlGm80uFw3EdqNy8Mw==", "DqbUt");
        llIIIllII[llIIIllIl[202]] = lIlIIllIllIl("i0OAi+ohjO9C9fY2uRcDySMEoVjVpZL0NatZxofJiWc=", "qOaEj");
        llIIIllII[llIIIllIl[203]] = lIlIIllIlllI("Gx8+cRsyHmkYWDsVJSFH", "SpIQx");
        llIIIllII[llIIIllIl[204]] = lIlIIllIllIl("yqh5C/5SVP86PrjqZibUgfUrUqmadq6RqIekGmNtvolZ/9MviEKh7A==", "gltWz");
        llIIIllII[llIIIllIl[205]] = lIlIIllIllII("XTaS/Cyzq4tPOFFYY4sZsHmUTdq6pVEUMCANrunWtxOgb5N5gorvQQ==", "lxBcs");
        llIIIllII[llIIIllIl[206]] = lIlIIllIllIl("4XkCSngWTUX6CRTHhZJi3HMyXbeMImTL", "jOrkb");
        llIIIllII[llIIIllIl[207]] = lIlIIllIlllI("DgAJZnE4A1opPiIXCS9/", "WezJQ");
        llIIIllII[llIIIllIl[208]] = lIlIIllIlllI("EyVaFCgiahEDKCBqFQtnNiQDGS8+JB1NDncpGwNnMyVaBCl3BxUfPiMrFAQmaA==", "WJzmG");
        llIIIllII[llIIIllIl[209]] = lIlIIllIlllI("ECEVcxk3IAVzHTk4B3MMNztCMRA9IEIyVT8mDSABZw==", "XNbSu");
        llIIIllII[llIIIllIl[210]] = lIlIIllIlllI("HyYHFXQ7bhIJOjtuFg4mKyZGBzw6cQ==", "HNfaS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llIIIllIl[0]];
        strArr[llIIIllIl[1]] = llIIIllII[llIIIllIl[167]];
        if (lIlIIllllIII(Inventory.getCount(strArr))) {
            String[] strArr2 = new String[llIIIllIl[0]];
            strArr2[llIIIllIl[1]] = llIIIllII[llIIIllIl[168]];
            if (lIlIIllllIII(Inventory.getCount(strArr2))) {
                ?? r0 = llIIIllIl[0];
                "".length();
                return (180 ^ 176) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return llIIIllIl[1];
    }

    private static String lIlIIllIllIl(String lIllIlIlIIIIll, String lIllIlIlIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), llIIIllIl[28]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllIl[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlIlIIIlII) {
            lIllIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIIlI(int i) {
        return i != 0;
    }

    static {
        lIlIIlllIIII();
        lIlIIllIllll();
        fa = llIIIllIl[142];
        fb = llIIIllIl[2];
        fc = llIIIllIl[4];
        eZ = llIIIllIl[182];
        fd = new WorldPoint(llIIIllIl[37], llIIIllIl[183], llIIIllIl[1]);
        fe = new WorldPoint(llIIIllIl[184], llIIIllIl[185], llIIIllIl[1]);
        ff = new WorldPoint(llIIIllIl[186], llIIIllIl[187], llIIIllIl[1]);
        fg = new WorldPoint(llIIIllIl[44], llIIIllIl[188], llIIIllIl[1]);
        fh = new WorldPoint(llIIIllIl[184], llIIIllIl[189], llIIIllIl[1]);
        fi = new WorldPoint(llIIIllIl[184], llIIIllIl[190], llIIIllIl[1]);
        bx = new ArrayList();
        dy = llIIIllIl[1];
        fj = new WorldArea(llIIIllIl[191], llIIIllIl[43], llIIIllIl[51], llIIIllIl[47], llIIIllIl[1]);
        String[] strArr = new String[llIIIllIl[30]];
        strArr[llIIIllIl[1]] = llIIIllII[llIIIllIl[192]];
        strArr[llIIIllIl[0]] = llIIIllII[llIIIllIl[193]];
        strArr[llIIIllIl[7]] = llIIIllII[llIIIllIl[31]];
        strArr[llIIIllIl[11]] = llIIIllII[llIIIllIl[194]];
        strArr[llIIIllIl[8]] = llIIIllII[llIIIllIl[195]];
        strArr[llIIIllIl[5]] = llIIIllII[llIIIllIl[196]];
        strArr[llIIIllIl[12]] = llIIIllII[llIIIllIl[197]];
        strArr[llIIIllIl[21]] = llIIIllII[llIIIllIl[198]];
        strArr[llIIIllIl[28]] = llIIIllII[llIIIllIl[199]];
        strArr[llIIIllIl[32]] = llIIIllII[llIIIllIl[200]];
        strArr[llIIIllIl[10]] = llIIIllII[llIIIllIl[201]];
        strArr[llIIIllIl[34]] = llIIIllII[llIIIllIl[202]];
        strArr[llIIIllIl[46]] = llIIIllII[llIIIllIl[203]];
        strArr[llIIIllIl[47]] = llIIIllII[llIIIllIl[204]];
        strArr[llIIIllIl[48]] = llIIIllII[llIIIllIl[205]];
        strArr[llIIIllIl[29]] = llIIIllII[llIIIllIl[206]];
        strArr[llIIIllIl[49]] = llIIIllII[llIIIllIl[207]];
        strArr[llIIIllIl[41]] = llIIIllII[llIIIllIl[208]];
        strArr[llIIIllIl[50]] = llIIIllII[llIIIllIl[209]];
        strArr[llIIIllIl[51]] = llIIIllII[llIIIllIl[210]];
        cG = strArr;
    }

    private static boolean lIlIIlllIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    private static void bD() {
        if (lIlIIllllIlI(Players.getLocal().getWorldLocation().distanceTo(fh), llIIIllIl[8])) {
            AccBuilderGWD.c = llIIIllII[llIIIllIl[162]];
            Movement.walkTo(fh);
            "".length();
            Time.sleepTicks(llIIIllIl[0]);
            "".length();
            if (lIlIIlllIIlI(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIIllIl[35], llIIIllIl[36], llIIIllIl[1])) ? 1 : 0)) {
                C0004e.c(new WorldPoint(llIIIllIl[38], llIIIllIl[39], llIIIllIl[1]));
                Time.sleepTicks(llIIIllIl[8]);
                "".length();
            }
            Widget widget = Widgets.get(llIIIllIl[40], llIIIllIl[30]);
            if (lIlIIlllIlll(widget)) {
                Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                Time.sleepTicks(llIIIllIl[11]);
                "".length();
            }
            Widget widget2 = Widgets.get(llIIIllIl[40], llIIIllIl[41]);
            if (lIlIIlllIlll(widget2)) {
                Mouse.click(widget2.getClickPoint().getX(), widget2.getClickPoint().getY(), (boolean) llIIIllIl[0]);
                Time.sleepTicks(llIIIllIl[11]);
                "".length();
            }
        }
    }

    private static boolean lIlIIlllIlll(Object obj) {
        return obj != null;
    }

    private static void lIlIIlllIIII() {
        llIIIllIl = new int[212];
        llIIIllIl[0] = " ".length();
        llIIIllIl[1] = ((((124 + 58) - 73) + 19) ^ (((163 + 74) - 141) + 80)) & (((((146 + 55) - 195) + 177) ^ (((8 + 114) - 51) + 64)) ^ (-" ".length()));
        llIIIllIl[2] = (-17537) & 17838;
        llIIIllIl[3] = 116 ^ 72;
        llIIIllIl[4] = (-28361) & 28667;
        llIIIllIl[5] = 98 ^ 103;
        llIIIllIl[6] = (-82) & 5081;
        llIIIllIl[7] = "  ".length();
        llIIIllIl[8] = 151 ^ 147;
        llIIIllIl[9] = (-((-17771) & 28655)) & (-16385) & 27647;
        llIIIllIl[10] = 207 ^ 197;
        llIIIllIl[11] = "   ".length();
        llIIIllIl[12] = (((147 + 13) - 36) + 56) ^ (((23 + 83) - 41) + 113);
        llIIIllIl[13] = (-8209) & 16215;
        llIIIllIl[14] = (-((-1217) & 14301)) & (-65) & 32767;
        llIIIllIl[15] = (-((-6945) & 7971)) & (-20581) & 24567;
        llIIIllIl[16] = (-((-9161) & 25549)) & (-4194) & 23551;
        llIIIllIl[17] = (-513) & 13137;
        llIIIllIl[18] = (-9798) & 12231;
        llIIIllIl[19] = (-21827) & 22378;
        llIIIllIl[20] = (-((-1379) & 4071)) & (-28681) & 32703;
        llIIIllIl[21] = (116 ^ 87) ^ (103 ^ 67);
        llIIIllIl[22] = 142 ^ 188;
        llIIIllIl[23] = (-((-17414) & 26263)) & (-16389) & 28669;
        llIIIllIl[24] = (-((-2066) & 19057)) & (-8225) & 28671;
        llIIIllIl[25] = (-25091) & 28523;
        llIIIllIl[26] = (-((-1077) & 30262)) & (-17) & 32635;
        llIIIllIl[27] = (-((-28035) & 32659)) & (-16389) & 24447;
        llIIIllIl[28] = (169 ^ 158) ^ (160 ^ 159);
        llIIIllIl[29] = (20 ^ 75) ^ (251 ^ 171);
        llIIIllIl[30] = 92 ^ 72;
        llIIIllIl[31] = (((10 ^ 87) + (152 ^ 195)) - (219 ^ 149)) + (9 ^ 43);
        llIIIllIl[32] = (((116 + 1) - 104) + 169) ^ (((122 + 34) - 2) + 37);
        llIIIllIl[33] = -" ".length();
        llIIIllIl[34] = (((31 + 35) - 25) + 106) ^ (((112 + 90) - 67) + 17);
        llIIIllIl[35] = (-4609) & 8052;
        llIIIllIl[36] = (-16503) & 19959;
        llIIIllIl[37] = (-((-19567) & 32495)) & (-9) & 16379;
        llIIIllIl[38] = (-16513) & 19949;
        llIIIllIl[39] = (-25091) & 28543;
        llIIIllIl[40] = (-((-25793) & 32243)) & (-25610) & 32639;
        llIIIllIl[41] = 103 ^ 118;
        llIIIllIl[42] = (-12930) & 16357;
        llIIIllIl[43] = (-16905) & 20235;
        llIIIllIl[44] = (-((-2529) & 31207)) & (-521) & 32639;
        llIIIllIl[45] = (-12801) & 16127;
        llIIIllIl[46] = (152 ^ 142) ^ (26 ^ 0);
        llIIIllIl[47] = "   ".length() ^ (155 ^ 149);
        llIIIllIl[48] = 92 ^ 82;
        llIIIllIl[49] = 184 ^ 168;
        llIIIllIl[50] = (87 ^ 46) ^ (113 ^ 26);
        llIIIllIl[51] = 128 ^ 147;
        llIIIllIl[52] = 185 ^ 172;
        llIIIllIl[53] = (((64 + 111) - 131) + 128) ^ (((160 + 93) - 176) + 109);
        llIIIllIl[54] = (((67 + 68) - 4) + 27) ^ (((52 + 61) - (-1)) + 23);
        llIIIllIl[55] = 103 ^ 127;
        llIIIllIl[56] = (112 ^ 49) ^ (108 ^ 52);
        llIIIllIl[57] = (((107 + 107) - 51) + 14) ^ (((55 + 121) - 7) + 2);
        llIIIllIl[58] = 157 ^ 134;
        llIIIllIl[59] = 97 ^ 125;
        llIIIllIl[60] = 216 ^ 197;
        llIIIllIl[61] = 87 ^ 73;
        llIIIllIl[62] = 104 ^ 119;
        llIIIllIl[63] = ((120 ^ 35) & ((50 ^ 105) ^ (-1))) ^ (183 ^ 151);
        llIIIllIl[64] = (121 ^ 1) ^ (8 ^ 81);
        llIIIllIl[65] = 147 ^ 177;
        llIIIllIl[66] = 119 ^ 84;
        llIIIllIl[67] = (41 ^ 77) ^ (66 ^ 2);
        llIIIllIl[68] = (((189 + 36) - 6) + 5) ^ (((105 + 77) - 123) + 138);
        llIIIllIl[69] = 104 ^ 78;
        llIIIllIl[70] = (99 ^ 39) ^ (28 ^ 127);
        llIIIllIl[71] = (124 ^ 5) ^ (228 ^ 181);
        llIIIllIl[72] = 96 ^ 73;
        llIIIllIl[73] = 179 ^ 153;
        llIIIllIl[74] = 133 ^ 174;
        llIIIllIl[75] = 184 ^ 148;
        llIIIllIl[76] = 109 ^ 64;
        llIIIllIl[77] = 82 ^ 124;
        llIIIllIl[78] = 117 ^ 90;
        llIIIllIl[79] = (55 ^ 22) ^ (141 ^ 156);
        llIIIllIl[80] = (((82 + 111) - 176) + 166) ^ (((29 + 41) - (-9)) + 55);
        llIIIllIl[81] = 115 ^ 64;
        llIIIllIl[82] = (((65 + 131) - 124) + 100) ^ (((145 + 137) - 132) + 2);
        llIIIllIl[83] = 159 ^ 170;
        llIIIllIl[84] = (76 ^ 7) ^ (54 ^ 75);
        llIIIllIl[85] = 181 ^ 130;
        llIIIllIl[86] = (((134 + 164) - 212) + 82) ^ (((60 + 57) - (-6)) + 21);
        llIIIllIl[87] = 33 ^ 24;
        llIIIllIl[88] = 10 ^ 48;
        llIIIllIl[89] = (140 ^ 182) ^ " ".length();
        llIIIllIl[90] = (-((-290) & 8547)) & (-16417) & 27641;
        llIIIllIl[91] = 103 ^ 90;
        llIIIllIl[92] = (225 ^ 161) ^ (48 ^ 78);
        llIIIllIl[93] = (((50 + 82) - 9) + 14) ^ (((58 + 12) - 15) + 127);
        llIIIllIl[94] = 248 ^ 184;
        llIIIllIl[95] = 31 ^ 94;
        llIIIllIl[96] = (215 ^ 188) ^ (93 ^ 116);
        llIIIllIl[97] = 192 ^ 131;
        llIIIllIl[98] = (((18 + 136) - 129) + 209) ^ (((5 + 3) - (-1)) + 165);
        llIIIllIl[99] = 8 ^ 77;
        llIIIllIl[100] = (58 ^ 64) ^ (51 ^ 15);
        llIIIllIl[101] = 195 ^ 132;
        llIIIllIl[102] = 231 ^ 175;
        llIIIllIl[103] = 205 ^ 132;
        llIIIllIl[104] = 19 ^ 89;
        llIIIllIl[105] = (-4097) & 7623;
        llIIIllIl[106] = 142 ^ 197;
        llIIIllIl[107] = 231 ^ 171;
        llIIIllIl[108] = (-((-14793) & 31723)) & (-8213) & 28671;
        llIIIllIl[109] = 109 ^ 32;
        llIIIllIl[110] = (27 ^ 106) ^ (178 ^ 141);
        llIIIllIl[111] = (-8213) & 11740;
        llIIIllIl[112] = 123 ^ 52;
        llIIIllIl[113] = 192 ^ 144;
        llIIIllIl[114] = 30 ^ 79;
        llIIIllIl[115] = (197 ^ 177) ^ (46 ^ 8);
        llIIIllIl[116] = 98 ^ 49;
        llIIIllIl[117] = (-575) & 4094;
        llIIIllIl[118] = (183 ^ 140) ^ (53 ^ 90);
        llIIIllIl[119] = 112 ^ 37;
        llIIIllIl[120] = 92 ^ 10;
        llIIIllIl[121] = 115 ^ 36;
        llIIIllIl[122] = 222 ^ 134;
        llIIIllIl[123] = (161 ^ 188) ^ (194 ^ 134);
        llIIIllIl[124] = (((40 + 7) - (-115)) + 88) ^ (((133 + 75) - 132) + 84);
        llIIIllIl[125] = (10 ^ 113) ^ (183 ^ 151);
        llIIIllIl[126] = (81 ^ 33) ^ (3 ^ 47);
        llIIIllIl[127] = (((99 + 73) - 163) + 240) ^ (((75 + 35) - 1) + 55);
        llIIIllIl[128] = 83 ^ 13;
        llIIIllIl[129] = 84 ^ 11;
        llIIIllIl[130] = 50 ^ 82;
        llIIIllIl[131] = 32 ^ 65;
        llIIIllIl[132] = 37 ^ 71;
        llIIIllIl[133] = 8 ^ 107;
        llIIIllIl[134] = (-((-8795) & 13919)) & (-8297) & 16383;
        llIIIllIl[135] = 98 ^ 6;
        llIIIllIl[136] = (235 ^ 183) ^ (40 ^ 17);
        llIIIllIl[137] = 93 ^ 59;
        llIIIllIl[138] = (((89 + 109) - 19) + 42) ^ (((178 + 43) - 54) + 19);
        llIIIllIl[139] = (((57 + 22) - 52) + 210) ^ (((66 + 99) - 69) + 37);
        llIIIllIl[140] = (((184 + 59) - 217) + 190) ^ (((40 + 54) - 63) + 146);
        llIIIllIl[141] = 86 ^ 60;
        llIIIllIl[142] = (123 ^ 64) ^ (252 ^ 172);
        llIIIllIl[143] = 171 ^ 199;
        llIIIllIl[144] = 56 ^ 85;
        llIIIllIl[145] = 25 ^ 119;
        llIIIllIl[146] = 15 ^ 96;
        llIIIllIl[147] = 32 ^ 80;
        llIIIllIl[148] = (((153 + 57) - 68) + 89) ^ (((26 + 26) - (-77)) + 21);
        llIIIllIl[149] = (3 ^ 16) ^ (214 ^ 183);
        llIIIllIl[150] = (((200 + 174) - 330) + 193) ^ (((119 + 54) - 15) + 0);
        llIIIllIl[151] = 78 ^ 58;
        llIIIllIl[152] = 229 ^ 144;
        llIIIllIl[153] = (((120 + 63) - 115) + 59) ^ (49 ^ 56);
        llIIIllIl[154] = (((18 + 194) - 141) + 134) ^ (((154 + 163) - 175) + 44);
        llIIIllIl[155] = (201 ^ 131) ^ (15 ^ 61);
        llIIIllIl[156] = 116 ^ 13;
        llIIIllIl[157] = 11 ^ 113;
        llIIIllIl[158] = (27 ^ 65) ^ (158 ^ 191);
        llIIIllIl[159] = 46 ^ 82;
        llIIIllIl[160] = (((69 + 164) - 113) + 130) ^ (((110 + 79) - 155) + 101);
        llIIIllIl[161] = (112 ^ 13) ^ "   ".length();
        llIIIllIl[162] = (((195 ^ 181) + (46 ^ 93)) - (((64 + 90) - 84) + 79)) + (108 ^ 71);
        llIIIllIl[163] = ((25 + 4) - (-59)) + 40;
        llIIIllIl[164] = (((172 ^ 148) + (67 ^ 26)) - (192 ^ 132)) + (33 ^ 21);
        llIIIllIl[165] = ((37 + 49) - 36) + 80;
        llIIIllIl[166] = (((205 ^ 149) + (172 ^ 158)) - (82 ^ 124)) + (161 ^ 134);
        llIIIllIl[167] = (((60 ^ 55) + (215 ^ 131)) - (-"   ".length())) + (6 ^ 36);
        llIIIllIl[168] = (((((98 + 62) - 66) + 33) + (19 ^ 10)) - (60 ^ 108)) + (135 ^ 186);
        llIIIllIl[169] = (-21701) & 30700;
        llIIIllIl[170] = (-16711) & 31710;
        llIIIllIl[171] = (-1123) & 7422;
        llIIIllIl[172] = (-8196) & 15395;
        llIIIllIl[173] = (-20481) & 21480;
        llIIIllIl[174] = (-((-2305) & 18898)) & (-515) & 17407;
        llIIIllIl[175] = (-((-9875) & 30611)) & (-36) & 32751;
        llIIIllIl[176] = (-((-26041) & 28601)) & (-4100) & 31659;
        llIIIllIl[177] = (-((-4245) & 13559)) & (-6153) & 16366;
        llIIIllIl[178] = ((88 + 119) - 115) + 42;
        llIIIllIl[179] = (((47 ^ 74) + (237 ^ 138)) - (((147 + 44) - 163) + 148)) + (98 ^ 9);
        llIIIllIl[180] = (((245 ^ 182) + (((75 + 120) - 156) + 90)) - (((43 + 82) - 122) + 170)) + (82 ^ 35);
        llIIIllIl[181] = ((12 + 52) - (-68)) + 5;
        llIIIllIl[182] = (-20613) & 21439;
        llIIIllIl[183] = (-25180) & 28639;
        llIIIllIl[184] = (-131) & 3570;
        llIIIllIl[185] = (-16385) & 19710;
        llIIIllIl[186] = (-513) & 3933;
        llIIIllIl[187] = (-((-12161) & 32657)) & (-8193) & 32127;
        llIIIllIl[188] = (-4151) & 13887;
        llIIIllIl[189] = (-((-1546) & 30427)) & (-39) & 32255;
        llIIIllIl[190] = (-6209) & 16103;
        llIIIllIl[191] = (-24593) & 28151;
        llIIIllIl[192] = (((7 ^ 114) + (199 ^ 137)) - (((51 + 79) - 41) + 86)) + (64 ^ 54);
        llIIIllIl[193] = ((92 + 138) - 108) + 17;
        llIIIllIl[194] = (((14 ^ 44) + (30 ^ 9)) - (-(192 ^ 196))) + (10 ^ 90);
        llIIIllIl[195] = (((100 ^ 62) + (49 ^ 122)) - (58 ^ 34)) + " ".length();
        llIIIllIl[196] = ((112 + 17) - 121) + 135;
        llIIIllIl[197] = ((81 + 113) - 141) + 91;
        llIIIllIl[198] = ((24 + 68) - 88) + 141;
        llIIIllIl[199] = (((93 ^ 71) + (41 ^ 97)) - (-(42 ^ 14))) + (31 ^ 19);
        llIIIllIl[200] = (((190 ^ 180) + (54 ^ 86)) - (93 ^ 4)) + ((108 + 27) - 33) + 28;
        llIIIllIl[201] = ((103 + 114) - 149) + 80;
        llIIIllIl[202] = (((82 ^ 71) + (((87 + 26) - (-6)) + 17)) - (((126 + 106) - 116) + 14)) + (26 ^ 96);
        llIIIllIl[203] = (((69 ^ 31) + (6 ^ 90)) - (51 ^ 87)) + (77 ^ 9);
        llIIIllIl[204] = ((91 + 147) - 120) + 33;
        llIIIllIl[205] = ((25 + 135) - 99) + 91;
        llIIIllIl[206] = ((133 + 135) - 200) + 85;
        llIIIllIl[207] = (((((107 + 15) - 110) + 116) + (77 ^ 120)) - (243 ^ 195)) + (148 ^ 129);
        llIIIllIl[208] = ((104 + 99) - 172) + 124;
        llIIIllIl[209] = (((((130 + 121) - 250) + 141) + (9 ^ 65)) - (((89 + 51) - 9) + 38)) + (199 ^ 168);
        llIIIllIl[210] = (((67 ^ 40) + (113 ^ 101)) - (-(91 ^ 66))) + (156 ^ 153);
        llIIIllIl[211] = ((89 + 41) - 67) + 95;
    }

    private static boolean lIlIIlllIllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIIIllIl[1];
    }
}
