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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.G  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/G.class */
public class G implements ab {
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ WorldPoint fw;
    private static /* synthetic */ int[] llllIlIIl;
    public static final /* synthetic */ WorldPoint ft;
    static /* synthetic */ String[] cG;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint fu;
    static /* synthetic */ ArrayList<Integer> fC;
    static /* synthetic */ int dk;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ String[] llllIIlll;
    public static final /* synthetic */ WorldPoint fz;
    public static /* synthetic */ boolean fB;
    public static /* synthetic */ int fb;
    public static final /* synthetic */ WorldPoint fv;
    public static final /* synthetic */ WorldPoint fA;
    public static /* synthetic */ int fc;
    public static final /* synthetic */ WorldPoint fx;
    public static final /* synthetic */ WorldPoint fy;

    private static boolean llIlIIIIllIl(int i) {
        return i != 0;
    }

    private static void bL() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIlIIIlIIIl(nearest) && llIlIIIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIIlll[llllIlIIl[136]];
            C0000a.a(nearest);
        }
        if (llIlIIIlIIIl(nearest) && llIlIIIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIlIIIIllll(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llllIlIIl[4]);
                "".length();
            }
            if (llIlIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llllIIlll[llllIlIIl[137]];
                if (llIlIIIlIIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llllIlIIl[6]);
                    "".length();
                }
                C0000a.a(llllIlIIl[7], llllIlIIl[13]);
                C0000a.a(llllIlIIl[11], llllIlIIl[0]);
                C0000a.a(llllIlIIl[9], llllIlIIl[41]);
            }
        }
    }

    private static boolean llIlIIIlIIlI(int i) {
        return i > 0;
    }

    private static boolean llIlIIIIllll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIlIIIlIlll(C0004e.j(fb), llllIlIIl[72]) && llIlIIIlIlll(C0004e.j(fc), llllIlIIl[3])) {
            ?? r0 = llllIlIIl[0];
            "".length();
            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIlIIl[1];
    }

    private static int llIlIIIIllII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIlIIIlIlIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v563, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v797, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v819, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void bI() {
        if (llIlIIIIllIl(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (llIlIIIIlllI(bx.size(), llllIlIIl[0])) {
                System.out.println(llllIIlll[llllIlIIl[1]]);
                bv = llllIlIIl[1];
            }
        }
        if (llIlIIIIllll(bv ? 1 : 0)) {
            if (llIlIIIIlllI(C0004e.j(llllIlIIl[2]), llllIlIIl[3])) {
                X.dJ();
            }
            if (llIlIIIIllll(bN() ? 1 : 0) && llIlIIIIlllI(C0004e.j(fb), llllIlIIl[0]) && llIlIIIlIIII(C0004e.j(llllIlIIl[2]), llllIlIIl[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIIIlIIIl(nearest) && llIlIIIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[0]];
                    C0000a.a(nearest);
                }
                if (llIlIIIlIIIl(nearest) && llIlIIIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlIIIIllll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIlIIl[4]);
                        "".length();
                    }
                    if (llIlIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[5]];
                        if (llIlIIIlIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIlIIl[6]);
                            "".length();
                        }
                        if (llIlIIIlIIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIlIIl[5]);
                            "".length();
                        }
                        int[] iArr = new int[llllIlIIl[3]];
                        iArr[llllIlIIl[1]] = llllIlIIl[7];
                        iArr[llllIlIIl[0]] = llllIlIIl[8];
                        iArr[llllIlIIl[5]] = llllIlIIl[9];
                        iArr[llllIlIIl[10]] = llllIlIIl[11];
                        iArr[llllIlIIl[6]] = llllIlIIl[12];
                        if (llIlIIIIllll(C0004e.d(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(llllIIlll[llllIlIIl[10]]);
                            bv = llllIlIIl[0];
                            return;
                        }
                        int[] iArr2 = new int[llllIlIIl[3]];
                        iArr2[llllIlIIl[1]] = llllIlIIl[7];
                        iArr2[llllIlIIl[0]] = llllIlIIl[8];
                        iArr2[llllIlIIl[5]] = llllIlIIl[9];
                        iArr2[llllIlIIl[10]] = llllIlIIl[11];
                        iArr2[llllIlIIl[6]] = llllIlIIl[12];
                        if (llIlIIIIllIl(C0004e.d(iArr2) ? 1 : 0)) {
                            C0000a.a(llllIlIIl[7], llllIlIIl[13]);
                            C0000a.a(llllIlIIl[14], llllIlIIl[0]);
                            C0000a.a(llllIlIIl[8], llllIlIIl[0]);
                            C0000a.a(llllIlIIl[11], llllIlIIl[6]);
                            C0000a.a(llllIlIIl[12], llllIlIIl[13]);
                        }
                    }
                }
            }
            if (llIlIIIIllIl(Inventory.contains(C0005f.bc) ? 1 : 0) && llIlIIIIlllI(Movement.getRunEnergy(), llllIlIIl[15])) {
                Inventory.getFirst(C0005f.bc).interact(llllIIlll[llllIlIIl[6]]);
                Time.sleepTicks(llllIlIIl[0]);
                "".length();
            }
            int[] iArr3 = new int[llllIlIIl[0]];
            iArr3[llllIlIIl[1]] = llllIlIIl[12];
            if (llIlIIIIllIl(Inventory.contains(iArr3) ? 1 : 0) && llIlIIIlIIll(llIlIIIIllII(C0004e.w(), 60.0d))) {
                int[] iArr4 = new int[llllIlIIl[0]];
                iArr4[llllIlIIl[1]] = llllIlIIl[12];
                Inventory.getFirst(iArr4).interact(llllIIlll[llllIlIIl[3]]);
                Time.sleepTicks(llllIlIIl[0]);
                "".length();
            }
            if (llIlIIIIlllI(C0004e.j(fb), llllIlIIl[0]) && llIlIIIIllIl(bN() ? 1 : 0)) {
                if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(ft), llllIlIIl[10])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[16]];
                    if (llIlIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(ft);
                    "".length();
                    Time.sleepTicks(llllIlIIl[0]);
                    "".length();
                }
                if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(ft), llllIlIIl[10])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[17]];
                    C0006g.a(llllIIlll[llllIlIIl[18]], cG);
                }
            }
            if (llIlIIIlIIII(C0004e.j(fb), llllIlIIl[0])) {
                if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fu), llllIlIIl[5])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[19]];
                    Movement.walkTo(fu);
                    "".length();
                    Time.sleepTicks(llllIlIIl[0]);
                    "".length();
                }
                if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fu), llllIlIIl[5])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[13]];
                    if (llIlIIIIllll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr = new String[llllIlIIl[0]];
                        strArr[llllIlIIl[1]] = llllIIlll[llllIlIIl[20]];
                        TileObjects.getNearest(strArr).interact(llllIIlll[llllIlIIl[21]]);
                    }
                    C0006g.a(cG);
                }
            }
            if (llIlIIIlIIII(C0004e.j(fb), llllIlIIl[5])) {
                String[] strArr2 = new String[llllIlIIl[0]];
                strArr2[llllIlIIl[1]] = llllIIlll[llllIlIIl[22]];
                if (llIlIIIlIllI(NPCs.getNearest(strArr2))) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[23]];
                    String[] strArr3 = new String[llllIlIIl[0]];
                    strArr3[llllIlIIl[1]] = llllIIlll[llllIlIIl[24]];
                    TileObject nearest2 = TileObjects.getNearest(strArr3);
                    if (llIlIIIlIIIl(nearest2) && llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(nearest2), llllIlIIl[6]) && llIlIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                        C0006g.a(cG);
                    }
                    if (!llIlIIIIllIl(Dialog.isOpen() ? 1 : 0) || llIlIIIlIlII(Players.getLocal().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[26], llllIlIIl[1])), llllIlIIl[3])) {
                        Movement.walkTo(new WorldPoint(llllIlIIl[25], llllIlIIl[26], llllIlIIl[1]));
                        "".length();
                        Time.sleepTicks(llllIlIIl[10]);
                        "".length();
                    }
                }
                if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[26], llllIlIIl[1])), llllIlIIl[3])) {
                    String[] strArr4 = new String[llllIlIIl[0]];
                    strArr4[llllIlIIl[1]] = llllIIlll[llllIlIIl[27]];
                    if (llIlIIIlIllI(NPCs.getNearest(strArr4))) {
                        String[] strArr5 = new String[llllIlIIl[0]];
                        strArr5[llllIlIIl[1]] = llllIIlll[llllIlIIl[28]];
                        TileObject nearest3 = TileObjects.getNearest(strArr5);
                        if (llIlIIIlIIIl(nearest3) && llIlIIIIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr6 = new String[llllIlIIl[0]];
                            strArr6[llllIlIIl[1]] = llllIIlll[llllIlIIl[29]];
                            if (llIlIIIIllIl(nearest3.hasAction(strArr6) ? 1 : 0)) {
                                nearest3.interact(llllIIlll[llllIlIIl[30]]);
                                Time.sleepTicks(llllIlIIl[5]);
                                "".length();
                            }
                            String[] strArr7 = new String[llllIlIIl[0]];
                            strArr7[llllIlIIl[1]] = llllIIlll[llllIlIIl[31]];
                            if (llIlIIIIllIl(nearest3.hasAction(strArr7) ? 1 : 0)) {
                                nearest3.interact(llllIIlll[llllIlIIl[32]]);
                                Time.sleepTicks(llllIlIIl[5]);
                                "".length();
                            }
                        }
                        C0006g.a(cG);
                    }
                }
                String[] strArr8 = new String[llllIlIIl[0]];
                strArr8[llllIlIIl[1]] = llllIIlll[llllIlIIl[33]];
                if (llIlIIIlIIIl(NPCs.getNearest(strArr8))) {
                    int[] iArr5 = new int[llllIlIIl[0]];
                    iArr5[llllIlIIl[1]] = llllIlIIl[14];
                    if (llIlIIIIllIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[llllIlIIl[0]];
                        iArr6[llllIlIIl[1]] = llllIlIIl[14];
                        if (llIlIIIIllll(Equipment.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[llllIlIIl[0]];
                            iArr7[llllIlIIl[1]] = llllIlIIl[14];
                            Inventory.getFirst(iArr7).interact(llllIIlll[llllIlIIl[34]]);
                        }
                    }
                    if (llIlIIIlIllI(Players.getLocal().getInteracting())) {
                        String[] strArr9 = new String[llllIlIIl[0]];
                        strArr9[llllIlIIl[1]] = llllIIlll[llllIlIIl[35]];
                        NPCs.getNearest(strArr9).interact(llllIIlll[llllIlIIl[36]]);
                        Time.sleepTicks(llllIlIIl[5]);
                        "".length();
                    }
                }
            }
            if (llIlIIIlIIII(C0004e.j(fb), llllIlIIl[10])) {
                if (llIlIIIIllll(fB ? 1 : 0)) {
                    if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fu), llllIlIIl[5])) {
                        String[] strArr10 = new String[llllIlIIl[0]];
                        strArr10[llllIlIIl[1]] = llllIIlll[llllIlIIl[37]];
                        if (llIlIIIlIIIl(TileObjects.getNearest(strArr10))) {
                            int[] iArr8 = new int[llllIlIIl[0]];
                            iArr8[llllIlIIl[1]] = llllIlIIl[7];
                            if (llIlIIIIllIl(Inventory.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[llllIlIIl[0]];
                                iArr9[llllIlIIl[1]] = llllIlIIl[7];
                                Inventory.getFirst(iArr9).interact(llllIIlll[llllIlIIl[38]]);
                                Time.sleepTicks(llllIlIIl[3]);
                                "".length();
                            }
                        }
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[39]];
                        Movement.walkTo(fu);
                        "".length();
                        Time.sleepTicks(llllIlIIl[0]);
                        "".length();
                    }
                    if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fu), llllIlIIl[5])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[40]];
                        if (llIlIIIIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr11 = new String[llllIlIIl[0]];
                            strArr11[llllIlIIl[1]] = llllIIlll[llllIlIIl[41]];
                            TileObjects.getNearest(strArr11).interact(llllIIlll[llllIlIIl[42]]);
                        }
                        C0006g.a(cG);
                        if (llIlIIIIllIl(Dialog.isOpen() ? 1 : 0) && llIlIIIIllIl(Dialog.getText().contains(llllIIlll[llllIlIIl[43]]) ? 1 : 0)) {
                            fB = llllIlIIl[0];
                        }
                    }
                }
                if (llIlIIIIllIl(fB ? 1 : 0)) {
                    if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(ft), llllIlIIl[10])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[44]];
                        Movement.walkTo(ft);
                        "".length();
                        Time.sleepTicks(llllIlIIl[0]);
                        "".length();
                    }
                    if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(ft), llllIlIIl[10])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[45]];
                        C0006g.a(llllIIlll[llllIlIIl[46]], cG);
                    }
                }
            }
            if (llIlIIIlIIII(C0004e.j(fb), llllIlIIl[6])) {
                dk = llllIlIIl[1];
                if (llIlIIIIllll(an() ? 1 : 0)) {
                    bM();
                }
                if (llIlIIIIllIl(an() ? 1 : 0)) {
                    if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fx), llllIlIIl[10])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[47]];
                        if (llIlIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(fx);
                        "".length();
                        Time.sleepTicks(llllIlIIl[0]);
                        "".length();
                    }
                    if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fx), llllIlIIl[10])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[48]];
                        if (llIlIIIIllll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr12 = new String[llllIlIIl[0]];
                            strArr12[llllIlIIl[1]] = llllIIlll[llllIlIIl[49]];
                            TileObjects.getNearest(strArr12).interact(llllIIlll[llllIlIIl[50]]);
                        }
                        C0006g.a(cG);
                    }
                }
            }
            if (llIlIIIlIIII(C0004e.j(fb), llllIlIIl[3])) {
                String[] strArr13 = new String[llllIlIIl[0]];
                strArr13[llllIlIIl[1]] = llllIIlll[llllIlIIl[51]];
                if (llIlIIIIllll(Inventory.contains(strArr13) ? 1 : 0)) {
                    String[] strArr14 = new String[llllIlIIl[0]];
                    strArr14[llllIlIIl[1]] = llllIIlll[llllIlIIl[52]];
                    if (llIlIIIIllll(Inventory.contains(strArr14) ? 1 : 0)) {
                        if (!llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fy), llllIlIIl[17]) || llIlIIIIllIl(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[53]];
                            Movement.walkTo(fy);
                            "".length();
                            Time.sleepTicks(llllIlIIl[0]);
                            "".length();
                        }
                        if (!llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fy), llllIlIIl[17]) || llIlIIIIllll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (llIlIIIlIllI(Players.getLocal().getInteracting())) {
                                int[] iArr10 = new int[llllIlIIl[0]];
                                iArr10[llllIlIIl[1]] = llllIlIIl[54];
                                NPCs.getNearest(iArr10).interact(llllIIlll[llllIlIIl[55]]);
                                Time.sleepTicks(llllIlIIl[5]);
                                "".length();
                            }
                            String[] strArr15 = new String[llllIlIIl[0]];
                            strArr15[llllIlIIl[1]] = llllIIlll[llllIlIIl[56]];
                            TileItem nearest4 = TileItems.getNearest(strArr15);
                            if (llIlIIIIllIl(Inventory.isFull() ? 1 : 0)) {
                                int[] iArr11 = new int[llllIlIIl[0]];
                                iArr11[llllIlIIl[1]] = llllIlIIl[12];
                                Inventory.getFirst(iArr11).interact(llllIIlll[llllIlIIl[57]]);
                                Time.sleepTicks(llllIlIIl[0]);
                                "".length();
                            }
                            if (llIlIIIlIIIl(nearest4)) {
                                nearest4.interact(llllIIlll[llllIlIIl[58]]);
                                Time.sleepTicks(llllIlIIl[5]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr16 = new String[llllIlIIl[0]];
                strArr16[llllIlIIl[1]] = llllIIlll[llllIlIIl[59]];
                if (llIlIIIIllIl(Inventory.contains(strArr16) ? 1 : 0)) {
                    if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fz), llllIlIIl[13])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[60]];
                        Movement.walkTo(fz);
                        "".length();
                        Time.sleepTicks(llllIlIIl[0]);
                        "".length();
                    }
                    if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fz), llllIlIIl[13])) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[61]];
                        bJ();
                    }
                }
                String[] strArr17 = new String[llllIlIIl[0]];
                strArr17[llllIlIIl[1]] = llllIIlll[llllIlIIl[15]];
                if (llIlIIIIllIl(Inventory.contains(strArr17) ? 1 : 0)) {
                    String[] strArr18 = new String[llllIlIIl[0]];
                    strArr18[llllIlIIl[1]] = llllIIlll[llllIlIIl[62]];
                    if (llIlIIIIllll(Inventory.contains(strArr18) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[63]];
                        String[] strArr19 = new String[llllIlIIl[0]];
                        strArr19[llllIlIIl[1]] = llllIIlll[llllIlIIl[64]];
                        Item first = Inventory.getFirst(strArr19);
                        int[] iArr12 = new int[llllIlIIl[0]];
                        iArr12[llllIlIIl[1]] = llllIlIIl[65];
                        first.useOn(TileObjects.getNearest(iArr12));
                        Time.sleepTicks(llllIlIIl[6]);
                        "".length();
                    }
                }
                String[] strArr20 = new String[llllIlIIl[0]];
                strArr20[llllIlIIl[1]] = llllIIlll[llllIlIIl[66]];
                if (llIlIIIIllIl(Inventory.contains(strArr20) ? 1 : 0)) {
                    String[] strArr21 = new String[llllIlIIl[0]];
                    strArr21[llllIlIIl[1]] = llllIIlll[llllIlIIl[67]];
                    if (llIlIIIIllIl(Inventory.contains(strArr21) ? 1 : 0)) {
                        if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fx), llllIlIIl[10])) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[68]];
                            if (llIlIIIIllIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(fx);
                            "".length();
                            Time.sleepTicks(llllIlIIl[0]);
                            "".length();
                        }
                        if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fx), llllIlIIl[10])) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[69]];
                            String[] strArr22 = new String[llllIlIIl[0]];
                            strArr22[llllIlIIl[1]] = llllIIlll[llllIlIIl[70]];
                            Item first2 = Inventory.getFirst(strArr22);
                            String[] strArr23 = new String[llllIlIIl[0]];
                            strArr23[llllIlIIl[1]] = llllIIlll[llllIlIIl[71]];
                            first2.useOn(TileObjects.getNearest(strArr23));
                            Time.sleepTicks(llllIlIIl[10]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlIIIlIIII(C0004e.j(fb), llllIlIIl[16])) {
                String[] strArr24 = new String[llllIlIIl[0]];
                strArr24[llllIlIIl[1]] = llllIIlll[llllIlIIl[72]];
                NPC nearest5 = NPCs.getNearest(strArr24);
                String[] strArr25 = new String[llllIlIIl[0]];
                strArr25[llllIlIIl[1]] = llllIIlll[llllIlIIl[73]];
                if (llIlIIIIllll(Inventory.contains(strArr25) ? 1 : 0) && llIlIIIlIIIl(nearest5)) {
                    if (llIlIIIIllIl(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[74]];
                        C0006g.a(llllIIlll[llllIlIIl[75]], cG);
                    }
                    if (llIlIIIIllll(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[76]];
                        String[] strArr26 = new String[llllIlIIl[0]];
                        strArr26[llllIlIIl[1]] = llllIIlll[llllIlIIl[77]];
                        TileObjects.getNearest(strArr26).interact(llllIIlll[llllIlIIl[78]]);
                        Time.sleepTicks(llllIlIIl[5]);
                        "".length();
                    }
                }
                String[] strArr27 = new String[llllIlIIl[0]];
                strArr27[llllIlIIl[1]] = llllIIlll[llllIlIIl[79]];
                if (llIlIIIIllIl(Inventory.contains(strArr27) ? 1 : 0)) {
                    String[] strArr28 = new String[llllIlIIl[0]];
                    strArr28[llllIlIIl[1]] = llllIIlll[llllIlIIl[80]];
                    TileObject nearest6 = TileObjects.getNearest(strArr28);
                    if (llIlIIIlIIIl(nearest6)) {
                        if (llIlIIIIllIl(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[81]];
                            String[] strArr29 = new String[llllIlIIl[0]];
                            strArr29[llllIlIIl[1]] = llllIIlll[llllIlIIl[82]];
                            Inventory.getFirst(strArr29).useOn(nearest6);
                            Time.sleepTicks(llllIlIIl[5]);
                            "".length();
                        }
                        if (llIlIIIIllll(Reachable.isInteractable(nearest6) ? 1 : 0)) {
                            AccBuilderGWD.c = llllIIlll[llllIlIIl[83]];
                            String[] strArr30 = new String[llllIlIIl[0]];
                            strArr30[llllIlIIl[1]] = llllIIlll[llllIlIIl[84]];
                            TileObjects.getNearest(strArr30).interact(llllIIlll[llllIlIIl[85]]);
                            Time.sleepTicks(llllIlIIl[5]);
                            "".length();
                        }
                    }
                }
            }
            if (llIlIIIlIIII(C0004e.j(fb), llllIlIIl[17])) {
                String[] strArr31 = new String[llllIlIIl[0]];
                strArr31[llllIlIIl[1]] = llllIIlll[llllIlIIl[86]];
                NPC nearest7 = NPCs.getNearest(strArr31);
                if (llIlIIIlIIIl(nearest7)) {
                    if (llIlIIIIllIl(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[87]];
                        C0006g.a(llllIIlll[llllIlIIl[88]], cG);
                    }
                    if (llIlIIIIllll(Reachable.isInteractable(nearest7) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[89]];
                        String[] strArr32 = new String[llllIlIIl[0]];
                        strArr32[llllIlIIl[1]] = llllIIlll[llllIlIIl[90]];
                        TileObjects.getNearest(strArr32).interact(llllIIlll[llllIlIIl[91]]);
                        Time.sleepTicks(llllIlIIl[5]);
                        "".length();
                    }
                }
            }
            if (llIlIIIlIIII(C0004e.j(fb), llllIlIIl[18])) {
                if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[92]];
                    WorldArea worldArea = new WorldArea(llllIlIIl[93], llllIlIIl[94], llllIlIIl[60], llllIlIIl[43], llllIlIIl[1]);
                    if (llIlIIIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(llllIlIIl[95], llllIlIIl[96], llllIlIIl[48], llllIlIIl[63], llllIlIIl[1]);
                        if (llIlIIIIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                            "".length();
                            Time.sleepTicks(llllIlIIl[0]);
                            "".length();
                        }
                        if (llIlIIIIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                                Movement.walkTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                                "".length();
                                Time.sleepTicks(llllIlIIl[0]);
                                "".length();
                            }
                            if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                                String[] strArr33 = new String[llllIlIIl[0]];
                                strArr33[llllIlIIl[1]] = llllIIlll[llllIlIIl[98]];
                                TileObject nearest8 = TileObjects.getNearest(strArr33);
                                if (llIlIIIlIIIl(nearest8)) {
                                    String[] strArr34 = new String[llllIlIIl[0]];
                                    strArr34[llllIlIIl[1]] = llllIIlll[llllIlIIl[99]];
                                    if (llIlIIIIllIl(nearest8.hasAction(strArr34) ? 1 : 0)) {
                                        nearest8.interact(llllIIlll[llllIlIIl[100]]);
                                        Time.sleepTicks(llllIlIIl[10]);
                                        "".length();
                                    }
                                    String[] strArr35 = new String[llllIlIIl[0]];
                                    strArr35[llllIlIIl[1]] = llllIIlll[llllIlIIl[101]];
                                    if (llIlIIIIllIl(nearest8.hasAction(strArr35) ? 1 : 0)) {
                                        nearest8.interact(llllIIlll[llllIlIIl[102]]);
                                        Time.sleepTicks(llllIlIIl[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (llIlIIIIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(fA);
                        "".length();
                        Time.sleepTicks(llllIlIIl[0]);
                        "".length();
                    }
                }
                if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[103]];
                    C0006g.a(llllIIlll[llllIlIIl[104]], cG);
                }
            }
            if (llIlIIIlIlll(C0004e.j(fb), llllIlIIl[13]) && llIlIIIIlllI(C0004e.j(fb), llllIlIIl[72])) {
                if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    String[] strArr36 = new String[llllIlIIl[0]];
                    strArr36[llllIlIIl[1]] = llllIIlll[llllIlIIl[105]];
                    if (llIlIIIIllIl(Inventory.contains(strArr36) ? 1 : 0)) {
                        AccBuilderGWD.c = llllIIlll[llllIlIIl[106]];
                        if (llIlIIIIlllI(dk, llllIlIIl[0])) {
                            as.nB += llllIlIIl[0];
                            as.u(AccBuilderGWD.m);
                            dk += llllIlIIl[0];
                            as.nB = llllIlIIl[1];
                            dl = llllIlIIl[1];
                        }
                        C0006g.a(llllIIlll[llllIlIIl[107]], cG);
                    }
                }
                String[] strArr37 = new String[llllIlIIl[0]];
                strArr37[llllIlIIl[1]] = llllIIlll[llllIlIIl[108]];
                if (llIlIIIIllll(Inventory.contains(strArr37) ? 1 : 0) && llIlIIIIlllI(C0004e.j(fb), llllIlIIl[72])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[109]];
                    bL();
                }
                String[] strArr38 = new String[llllIlIIl[0]];
                strArr38[llllIlIIl[1]] = llllIIlll[llllIlIIl[110]];
                if (llIlIIIIllIl(Inventory.contains(strArr38) ? 1 : 0) && llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3]) && llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    AccBuilderGWD.c = llllIIlll[llllIlIIl[111]];
                    WorldArea worldArea3 = new WorldArea(llllIlIIl[93], llllIlIIl[94], llllIlIIl[60], llllIlIIl[43], llllIlIIl[1]);
                    if (llIlIIIIllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldArea worldArea4 = new WorldArea(llllIlIIl[95], llllIlIIl[96], llllIlIIl[48], llllIlIIl[63], llllIlIIl[1]);
                        if (llIlIIIIllll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                            "".length();
                            Time.sleepTicks(llllIlIIl[0]);
                            "".length();
                        }
                        if (llIlIIIIllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                                Movement.walkTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                                "".length();
                                Time.sleepTicks(llllIlIIl[0]);
                                "".length();
                            }
                            if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                                String[] strArr39 = new String[llllIlIIl[0]];
                                strArr39[llllIlIIl[1]] = llllIIlll[llllIlIIl[112]];
                                TileObject nearest9 = TileObjects.getNearest(strArr39);
                                if (llIlIIIlIIIl(nearest9)) {
                                    String[] strArr40 = new String[llllIlIIl[0]];
                                    strArr40[llllIlIIl[1]] = llllIIlll[llllIlIIl[113]];
                                    if (llIlIIIIllIl(nearest9.hasAction(strArr40) ? 1 : 0)) {
                                        nearest9.interact(llllIIlll[llllIlIIl[114]]);
                                        Time.sleepTicks(llllIlIIl[10]);
                                        "".length();
                                    }
                                    String[] strArr41 = new String[llllIlIIl[0]];
                                    strArr41[llllIlIIl[1]] = llllIIlll[llllIlIIl[115]];
                                    if (llIlIIIIllIl(nearest9.hasAction(strArr41) ? 1 : 0)) {
                                        nearest9.interact(llllIIlll[llllIlIIl[116]]);
                                        Time.sleepTicks(llllIlIIl[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (llIlIIIIllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(fA);
                        "".length();
                        Time.sleepTicks(llllIlIIl[0]);
                        "".length();
                    }
                }
            }
            if (llIlIIIlIlll(C0004e.j(fb), llllIlIIl[72]) && llIlIIIIlllI(C0004e.j(fc), llllIlIIl[3])) {
                AccBuilderGWD.c = llllIIlll[llllIlIIl[117]];
                if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    bK();
                }
                if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
                    if (llIlIIIlIIIl(Widgets.get(llllIlIIl[118], llllIlIIl[27]))) {
                        Mouse.click(Widgets.get(llllIlIIl[118], llllIlIIl[27]).getClickPoint().getX(), Widgets.get(llllIlIIl[118], llllIlIIl[27]).getClickPoint().getY(), (boolean) llllIlIIl[0]);
                        Time.sleepTicks(llllIlIIl[10]);
                        "".length();
                    }
                    C0006g.a(llllIIlll[llllIlIIl[119]], cG);
                    C0006g.a(cG);
                }
            }
            C0006g.a(cG);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llllIlIIl[0]];
        strArr[llllIlIIl[1]] = llllIIlll[llllIlIIl[141]];
        if (llIlIIIlIIlI(Inventory.getCount(strArr))) {
            int[] iArr = new int[llllIlIIl[0]];
            iArr[llllIlIIl[1]] = llllIlIIl[12];
            if (llIlIIIlIIlI(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[llllIlIIl[0]];
                iArr2[llllIlIIl[1]] = llllIlIIl[7];
                if (llIlIIIIllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llllIlIIl[0]];
                    iArr3[llllIlIIl[1]] = llllIlIIl[9];
                    if (llIlIIIIllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = llllIlIIl[0];
                        "".length();
                        return "   ".length() <= " ".length() ? ((((28 + 143) - 105) + 104) ^ (((127 + 119) - 90) + 22)) & (((((69 + 96) - 57) + 83) ^ (((54 + 1) - (-62)) + 50)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return llllIlIIl[1];
    }

    private static void bJ() {
        fC.add(Integer.valueOf(llllIlIIl[120]));
        "".length();
        fC.add(Integer.valueOf(llllIlIIl[121]));
        "".length();
        fC.add(Integer.valueOf(llllIlIIl[122]));
        "".length();
        fC.add(Integer.valueOf(llllIlIIl[123]));
        "".length();
        fC.add(Integer.valueOf(llllIlIIl[124]));
        "".length();
        fC.add(Integer.valueOf(llllIlIIl[125]));
        "".length();
        fC.add(Integer.valueOf(llllIlIIl[126]));
        "".length();
        while (llIlIIIIllll(fC.isEmpty() ? 1 : 0) && llIlIIIIllll(fC.isEmpty() ? 1 : 0)) {
            String[] strArr = new String[llllIlIIl[0]];
            strArr[llllIlIIl[1]] = llllIIlll[llllIlIIl[127]];
            if (llIlIIIIllIl(Inventory.contains(strArr) ? 1 : 0)) {
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                return;
            }
            int[] iArr = new int[llllIlIIl[0]];
            iArr[llllIlIIl[1]] = fC.get(llllIlIIl[1]).intValue();
            TileObject nearest = TileObjects.getNearest(iArr);
            if (llIlIIIlIIIl(nearest)) {
                String[] strArr2 = new String[llllIlIIl[0]];
                strArr2[llllIlIIl[1]] = llllIIlll[llllIlIIl[128]];
                if (llIlIIIIllIl(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[llllIlIIl[0]];
                    strArr3[llllIlIIl[1]] = llllIIlll[llllIlIIl[129]];
                    Inventory.getFirst(strArr3).useOn(nearest);
                    Time.sleepTicks(llllIlIIl[3]);
                    "".length();
                }
            }
            String[] strArr4 = new String[llllIlIIl[0]];
            strArr4[llllIlIIl[1]] = llllIIlll[llllIlIIl[130]];
            if (llIlIIIIllll(Inventory.contains(strArr4) ? 1 : 0)) {
                fC.remove(llllIlIIl[1]);
                "".length();
                Time.sleepTicks(llllIlIIl[5]);
                "".length();
            }
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    private static boolean llIlIIIlIllI(Object obj) {
        return obj == null;
    }

    private static void llIlIIIIlIll() {
        llllIlIIl = new int[186];
        llllIlIIl[0] = " ".length();
        llllIlIIl[1] = (70 ^ 81) & ((51 ^ 36) ^ (-1));
        llllIlIIl[2] = 251 ^ 144;
        llllIlIIl[3] = 94 ^ 91;
        llllIlIIl[4] = (-10292) & 15291;
        llllIlIIl[5] = "  ".length();
        llllIlIIl[6] = (((68 + 120) - 130) + 141) ^ (((84 + 182) - 138) + 67);
        llllIlIIl[7] = (-8329) & 16335;
        llllIlIIl[8] = (-2089) & 4013;
        llllIlIIl[9] = (-((-2658) & 27375)) & (-19) & 32671;
        llllIlIIl[10] = "   ".length();
        llllIlIIl[11] = (-((-6035) & 22463)) & (-513) & 29565;
        llllIlIIl[12] = (-9729) & 10107;
        llllIlIIl[13] = 122 ^ 112;
        llllIlIIl[14] = (-4293) & 5623;
        llllIlIIl[15] = 108 ^ 94;
        llllIlIIl[16] = (((126 + 24) - 111) + 100) ^ (((57 + 30) - 58) + 112);
        llllIlIIl[17] = (((62 + 127) - 53) + 9) ^ (((121 + 10) - 121) + 140);
        llllIlIIl[18] = (144 ^ 196) ^ (3 ^ 95);
        llllIlIIl[19] = (193 ^ 189) ^ (214 ^ 163);
        llllIlIIl[20] = 49 ^ 58;
        llllIlIIl[21] = (148 ^ 198) ^ (66 ^ 28);
        llllIlIIl[22] = (((74 + 18) - 1) + 42) ^ (((67 + 36) - 63) + 96);
        llllIlIIl[23] = (88 ^ 120) ^ (178 ^ 156);
        llllIlIIl[24] = 166 ^ 169;
        llllIlIIl[25] = (-((-7337) & 32443)) & (-33) & 28543;
        llllIlIIl[26] = (-4170) & 7675;
        llllIlIIl[27] = (56 ^ 98) ^ (54 ^ 124);
        llllIlIIl[28] = 185 ^ 168;
        llllIlIIl[29] = 171 ^ 185;
        llllIlIIl[30] = (((76 + 65) - 133) + 161) ^ (((80 + 141) - 165) + 130);
        llllIlIIl[31] = (72 ^ 6) ^ (86 ^ 12);
        llllIlIIl[32] = (102 ^ 42) ^ (92 ^ 5);
        llllIlIIl[33] = (103 ^ 58) ^ (126 ^ 53);
        llllIlIIl[34] = (244 ^ 159) ^ (226 ^ 158);
        llllIlIIl[35] = (((108 + 68) - 172) + 218) ^ (((40 + 67) - 88) + 179);
        llllIlIIl[36] = 59 ^ 34;
        llllIlIIl[37] = (242 ^ 185) ^ (11 ^ 90);
        llllIlIIl[38] = (((20 + 37) - (-53)) + 18) ^ (((85 + 73) - 19) + 16);
        llllIlIIl[39] = (80 ^ 102) ^ (155 ^ 177);
        llllIlIIl[40] = 116 ^ 105;
        llllIlIIl[41] = (221 ^ 137) ^ (216 ^ 146);
        llllIlIIl[42] = (234 ^ 164) ^ (62 ^ 111);
        llllIlIIl[43] = (((53 + 56) - 68) + 110) ^ (((157 + 22) - 122) + 126);
        llllIlIIl[44] = 91 ^ 122;
        llllIlIIl[45] = (104 ^ 34) ^ (248 ^ 144);
        llllIlIIl[46] = (239 ^ 164) ^ (212 ^ 188);
        llllIlIIl[47] = 22 ^ 50;
        llllIlIIl[48] = 93 ^ 120;
        llllIlIIl[49] = 17 ^ 55;
        llllIlIIl[50] = (217 ^ 179) ^ (31 ^ 82);
        llllIlIIl[51] = (((22 + 24) - 18) + 121) ^ (((180 + 31) - 84) + 62);
        llllIlIIl[52] = (4 ^ 63) ^ (77 ^ 95);
        llllIlIIl[53] = (122 ^ 82) ^ "  ".length();
        llllIlIIl[54] = (-((-10445) & 15053)) & (-2) & 8095;
        llllIlIIl[55] = (((175 + 27) - 200) + 233) ^ (((178 + 141) - 220) + 93);
        llllIlIIl[56] = (5 ^ 81) ^ (0 ^ 120);
        llllIlIIl[57] = (76 ^ 23) ^ (209 ^ 167);
        llllIlIIl[58] = (49 ^ 80) ^ (142 ^ 193);
        llllIlIIl[59] = (77 ^ 34) ^ (22 ^ 86);
        llllIlIIl[60] = 25 ^ 41;
        llllIlIIl[61] = (97 ^ 53) ^ (196 ^ 161);
        llllIlIIl[62] = 25 ^ 42;
        llllIlIIl[63] = (((155 + 87) - 99) + 26) ^ (((80 + 128) - 77) + 26);
        llllIlIIl[64] = 7 ^ 50;
        llllIlIIl[65] = (-8801) & 12285;
        llllIlIIl[66] = 177 ^ 135;
        llllIlIIl[67] = (((62 + 29) - 86) + 132) ^ (((54 + 169) - 50) + 17);
        llllIlIIl[68] = 155 ^ 163;
        llllIlIIl[69] = (((102 + 153) - 151) + 52) ^ (((98 + 113) - 107) + 61);
        llllIlIIl[70] = 68 ^ 126;
        llllIlIIl[71] = (((138 + 5) - 133) + 139) ^ (((93 + 114) - 67) + 34);
        llllIlIIl[72] = (69 ^ 7) ^ (46 ^ 80);
        llllIlIIl[73] = (100 ^ 10) ^ (5 ^ 86);
        llllIlIIl[74] = (11 ^ 81) ^ (115 ^ 23);
        llllIlIIl[75] = 115 ^ 76;
        llllIlIIl[76] = (78 ^ 43) ^ (86 ^ 115);
        llllIlIIl[77] = (104 ^ 121) ^ (105 ^ 57);
        llllIlIIl[78] = 18 ^ 80;
        llllIlIIl[79] = (1 ^ 14) ^ (49 ^ 125);
        llllIlIIl[80] = (((136 + 26) - (-11)) + 53) ^ (((103 + 74) - 88) + 77);
        llllIlIIl[81] = (((200 + 166) - 265) + 106) ^ (((54 + 41) - 21) + 64);
        llllIlIIl[82] = (124 ^ 105) ^ (15 ^ 92);
        llllIlIIl[83] = (192 ^ 136) ^ (53 ^ 58);
        llllIlIIl[84] = (((93 + 188) - 134) + 90) ^ (((96 + 4) - (-24)) + 41);
        llllIlIIl[85] = (144 ^ 160) ^ (16 ^ 105);
        llllIlIIl[86] = " ".length() ^ (75 ^ 0);
        llllIlIIl[87] = 219 ^ 144;
        llllIlIIl[88] = (9 ^ 39) ^ (70 ^ 36);
        llllIlIIl[89] = 29 ^ 80;
        llllIlIIl[90] = (245 ^ 182) ^ (43 ^ 38);
        llllIlIIl[91] = 55 ^ 120;
        llllIlIIl[92] = 229 ^ 181;
        llllIlIIl[93] = (-((-10439) & 31479)) & (-8201) & 32639;
        llllIlIIl[94] = (-((-1579) & 20331)) & (-4129) & 32759;
        llllIlIIl[95] = (-"   ".length()) & (-12290) & 15679;
        llllIlIIl[96] = (-4178) & 7639;
        llllIlIIl[97] = (-((-7313) & 31897)) & (-4678) & 32765;
        llllIlIIl[98] = (((110 + 47) - 92) + 85) ^ (((197 + 112) - 146) + 36);
        llllIlIIl[99] = (237 ^ 183) ^ (136 ^ 128);
        llllIlIIl[100] = 55 ^ 100;
        llllIlIIl[101] = (8 ^ 77) ^ (57 ^ 40);
        llllIlIIl[102] = 122 ^ 47;
        llllIlIIl[103] = 83 ^ 5;
        llllIlIIl[104] = 92 ^ 11;
        llllIlIIl[105] = (193 ^ 139) ^ (11 ^ 25);
        llllIlIIl[106] = 111 ^ 54;
        llllIlIIl[107] = (90 ^ 19) ^ (79 ^ 92);
        llllIlIIl[108] = 57 ^ 98;
        llllIlIIl[109] = (123 ^ 93) ^ (83 ^ 41);
        llllIlIIl[110] = (((135 + 113) - 112) + 91) ^ (((184 + 124) - 225) + 107);
        llllIlIIl[111] = (((99 + 160) - 190) + 162) ^ (((57 + 22) - 16) + 122);
        llllIlIIl[112] = 62 ^ 97;
        llllIlIIl[113] = 96 ^ 0;
        llllIlIIl[114] = (((124 + 120) - 202) + 154) ^ (((46 + 63) - 59) + 115);
        llllIlIIl[115] = 45 ^ 79;
        llllIlIIl[116] = 16 ^ 115;
        llllIlIIl[117] = 46 ^ 74;
        llllIlIIl[118] = (((((79 + 81) - 142) + 125) + (48 ^ 109)) - (((51 + 129) - 80) + 30)) + (75 ^ 100);
        llllIlIIl[119] = 208 ^ 181;
        llllIlIIl[120] = (-((-6691) & 23095)) & (-4612) & 24511;
        llllIlIIl[121] = (-12802) & 16299;
        llllIlIIl[122] = (-(7 ^ 30)) & (-28737) & 32255;
        llllIlIIl[123] = (-((-3547) & 32731)) & (-5) & 32685;
        llllIlIIl[124] = (-((-16545) & 25321)) & (-1) & 12270;
        llllIlIIl[125] = (-((-18817) & 31697)) & (-16385) & 32763;
        llllIlIIl[126] = (-29211) & 32703;
        llllIlIIl[127] = 31 ^ 121;
        llllIlIIl[128] = 78 ^ 41;
        llllIlIIl[129] = (9 ^ 7) ^ (16 ^ 118);
        llllIlIIl[130] = 244 ^ 157;
        llllIlIIl[131] = 55 ^ 93;
        llllIlIIl[132] = 126 ^ 18;
        llllIlIIl[133] = 81 ^ 60;
        llllIlIIl[134] = 228 ^ 138;
        llllIlIIl[135] = 97 ^ 14;
        llllIlIIl[136] = 207 ^ 191;
        llllIlIIl[137] = 66 ^ 51;
        llllIlIIl[138] = (((130 + 57) - 183) + 230) ^ (((81 + 65) - 30) + 36);
        llllIlIIl[139] = (154 ^ 187) ^ (244 ^ 166);
        llllIlIIl[140] = 66 ^ 54;
        llllIlIIl[141] = (58 ^ 100) ^ (137 ^ 162);
        llllIlIIl[142] = (-(19 ^ 5)) & (-5313) & 14333;
        llllIlIIl[143] = (-29906) & 30205;
        llllIlIIl[144] = (-16436) & 28415;
        llllIlIIl[145] = (-((-19722) & 24331)) & (-3137) & 32745;
        llllIlIIl[146] = (-23620) & 24519;
        llllIlIIl[147] = (((107 + 216) - 150) + 47) ^ (((58 + 5) - 31) + 138);
        llllIlIIl[148] = (230 ^ 178) ^ (32 ^ 3);
        llllIlIIl[149] = (-((-27689) & 32618)) & (-8193) & 16343;
        llllIlIIl[150] = (-4619) & 8091;
        llllIlIIl[151] = (-((-5121) & 30385)) & (-1) & 28671;
        llllIlIIl[152] = (-((-8013) & 24413)) & (-12877) & 32765;
        llllIlIIl[153] = (-16641) & 26542;
        llllIlIIl[154] = (-49) & 8061;
        llllIlIIl[155] = (-16586) & 23007;
        llllIlIIl[156] = (-((-25943) & 30711)) & (-16393) & 24575;
        llllIlIIl[157] = (-((-3445) & 12151)) & (-16418) & 28535;
        llllIlIIl[158] = (-74) & 3561;
        llllIlIIl[159] = (-((-3289) & 32505)) & (-129) & 32766;
        llllIlIIl[160] = (-((-15575) & 31991)) & (-2369) & 28671;
        llllIlIIl[161] = (-21123) & 24562;
        llllIlIIl[162] = (-18513) & 28407;
        llllIlIIl[163] = (-((-38) & 32423)) & (-81) & 32767;
        llllIlIIl[164] = (-7685) & 7991;
        llllIlIIl[165] = 50 ^ 74;
        llllIlIIl[166] = 3 ^ 122;
        llllIlIIl[167] = 5 ^ 127;
        llllIlIIl[168] = (155 ^ 180) ^ (4 ^ 80);
        llllIlIIl[169] = (78 ^ 47) ^ (8 ^ 21);
        llllIlIIl[170] = 88 ^ 37;
        llllIlIIl[171] = 249 ^ 135;
        llllIlIIl[172] = ((114 + 37) - 142) + 118;
        llllIlIIl[173] = (((152 ^ 186) + (230 ^ 132)) - (180 ^ 162)) + (117 ^ 103);
        llllIlIIl[174] = (((116 ^ 92) + (212 ^ 190)) - (32 ^ 31)) + (44 ^ 2);
        llllIlIIl[175] = (((187 ^ 156) + (71 ^ 46)) - (59 ^ 31)) + (24 ^ 14);
        llllIlIIl[176] = (((108 ^ 95) + (47 ^ 49)) - (140 ^ 172)) + (151 ^ 197);
        llllIlIIl[177] = ((12 + 7) - (-88)) + 25;
        llllIlIIl[178] = (((20 ^ 46) + (12 ^ 108)) - (129 ^ 155)) + (48 ^ 53);
        llllIlIIl[179] = (((90 ^ 87) + (183 ^ 186)) - (-(122 ^ 89))) + (103 ^ 46);
        llllIlIIl[180] = ((43 + 14) - (-73)) + 5;
        llllIlIIl[181] = (((((51 + 12) - 3) + 70) + (23 ^ 85)) - (((164 + 9) - 107) + 113)) + (237 ^ 154);
        llllIlIIl[182] = (((174 ^ 194) + (203 ^ 158)) - (((109 + 92) - 136) + 126)) + ((78 + 102) - 78) + 33;
        llllIlIIl[183] = (((235 ^ 180) + (26 ^ 123)) - (((25 + 29) - (-20)) + 62)) + (55 ^ 101);
        llllIlIIl[184] = (((((92 + 62) - 49) + 28) + (153 ^ 160)) - (242 ^ 199)) + "  ".length();
        llllIlIIl[185] = ((86 + 52) - 61) + 63;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bI();
            "".length();
            if ((-"  ".length()) > 0) {
                return (35 ^ 48) & ((139 ^ 152) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llllIlIIl[117];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llllIlIIl[1];
    }

    private static String llIlIIIIIlIl(String lIllllIlIIllI, String lIllllIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), llllIlIIl[18]), "DES");
            Cipher lIllllIlIlIII = Cipher.getInstance("DES");
            lIllllIlIlIII.init(llllIlIIl[5], secretKeySpec);
            return new String(lIllllIlIlIII.doFinal(Base64.getDecoder().decode(lIllllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIlIIlll) {
            lIllllIlIIlll.printStackTrace();
            return null;
        }
    }

    private static String llIlIIIIIlII(String lIllllIIllIIl, String lIllllIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllIIllIlI) {
            lIllllIIllIlI.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIIIlIll();
        llIlIIIIlIlI();
        ft = new WorldPoint(llllIlIIl[149], llllIlIIl[150], llllIlIIl[1]);
        fu = new WorldPoint(llllIlIIl[151], llllIlIIl[152], llllIlIIl[1]);
        fv = new WorldPoint(llllIlIIl[25], llllIlIIl[153], llllIlIIl[1]);
        fw = new WorldPoint(llllIlIIl[154], llllIlIIl[155], llllIlIIl[1]);
        fx = new WorldPoint(llllIlIIl[156], llllIlIIl[152], llllIlIIl[5]);
        fy = new WorldPoint(llllIlIIl[157], llllIlIIl[158], llllIlIIl[1]);
        fz = new WorldPoint(llllIlIIl[159], llllIlIIl[160], llllIlIIl[1]);
        fA = new WorldPoint(llllIlIIl[161], llllIlIIl[162], llllIlIIl[1]);
        bx = new ArrayList();
        fb = llllIlIIl[163];
        fc = llllIlIIl[164];
        String[] strArr = new String[llllIlIIl[31]];
        strArr[llllIlIIl[1]] = llllIIlll[llllIlIIl[165]];
        strArr[llllIlIIl[0]] = llllIIlll[llllIlIIl[166]];
        strArr[llllIlIIl[5]] = llllIIlll[llllIlIIl[167]];
        strArr[llllIlIIl[10]] = llllIIlll[llllIlIIl[168]];
        strArr[llllIlIIl[6]] = llllIIlll[llllIlIIl[169]];
        strArr[llllIlIIl[3]] = llllIIlll[llllIlIIl[170]];
        strArr[llllIlIIl[16]] = llllIIlll[llllIlIIl[171]];
        strArr[llllIlIIl[17]] = llllIIlll[llllIlIIl[172]];
        strArr[llllIlIIl[18]] = llllIIlll[llllIlIIl[173]];
        strArr[llllIlIIl[19]] = llllIIlll[llllIlIIl[174]];
        strArr[llllIlIIl[13]] = llllIIlll[llllIlIIl[175]];
        strArr[llllIlIIl[20]] = llllIIlll[llllIlIIl[176]];
        strArr[llllIlIIl[21]] = llllIIlll[llllIlIIl[177]];
        strArr[llllIlIIl[22]] = llllIIlll[llllIlIIl[178]];
        strArr[llllIlIIl[23]] = llllIIlll[llllIlIIl[179]];
        strArr[llllIlIIl[24]] = llllIIlll[llllIlIIl[180]];
        strArr[llllIlIIl[27]] = llllIIlll[llllIlIIl[181]];
        strArr[llllIlIIl[28]] = llllIIlll[llllIlIIl[182]];
        strArr[llllIlIIl[29]] = llllIIlll[llllIlIIl[183]];
        strArr[llllIlIIl[30]] = llllIIlll[llllIlIIl[184]];
        cG = strArr;
        fC = new ArrayList<>();
    }

    private static void bK() {
        if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(fA), llllIlIIl[3])) {
            AccBuilderGWD.c = llllIIlll[llllIlIIl[131]];
            WorldArea worldArea = new WorldArea(llllIlIIl[93], llllIlIIl[94], llllIlIIl[60], llllIlIIl[43], llllIlIIl[1]);
            if (llIlIIIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(llllIlIIl[95], llllIlIIl[96], llllIlIIl[48], llllIlIIl[63], llllIlIIl[1]);
                if (llIlIIIIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                    "".length();
                    Time.sleepTicks(llllIlIIl[0]);
                    "".length();
                }
                if (llIlIIIIllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                        Movement.walkTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1]));
                        "".length();
                        Time.sleepTicks(llllIlIIl[0]);
                        "".length();
                    }
                    if (llIlIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlIIl[25], llllIlIIl[97], llllIlIIl[1])), llllIlIIl[3])) {
                        String[] strArr = new String[llllIlIIl[0]];
                        strArr[llllIlIIl[1]] = llllIIlll[llllIlIIl[2]];
                        TileObject nearest = TileObjects.getNearest(strArr);
                        if (llIlIIIlIIIl(nearest)) {
                            String[] strArr2 = new String[llllIlIIl[0]];
                            strArr2[llllIlIIl[1]] = llllIIlll[llllIlIIl[132]];
                            if (llIlIIIIllIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(llllIIlll[llllIlIIl[133]]);
                                Time.sleepTicks(llllIlIIl[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[llllIlIIl[0]];
                            strArr3[llllIlIIl[1]] = llllIIlll[llllIlIIl[134]];
                            if (llIlIIIIllIl(nearest.hasAction(strArr3) ? 1 : 0)) {
                                nearest.interact(llllIIlll[llllIlIIl[135]]);
                                Time.sleepTicks(llllIlIIl[10]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (llIlIIIIllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(fA);
                "".length();
                Time.sleepTicks(llllIlIIl[0]);
                "".length();
            }
        }
    }

    private static boolean llIlIIIlIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIIIlIlll(int i, int i2) {
        return i >= i2;
    }

    private static void bM() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIlIIIlIIIl(nearest) && llIlIIIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llllIIlll[llllIlIIl[138]];
            C0000a.a(nearest);
        }
        if (llIlIIIlIIIl(nearest) && llIlIIIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIlIIIIllll(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llllIlIIl[4]);
                "".length();
            }
            if (llIlIIIIllIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderGWD.c = llllIIlll[llllIlIIl[139]];
                if (llIlIIIlIIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llllIlIIl[6]);
                    "".length();
                }
                C0000a.a(llllIlIIl[7], llllIlIIl[13]);
                C0000a.a(llllIlIIl[8], llllIlIIl[0]);
                C0000a.a(llllIlIIl[11], llllIlIIl[0]);
                C0000a.a(llllIlIIl[12], llllIlIIl[3]);
                C0000a.a(llllIlIIl[9], llllIlIIl[41]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0172, code lost:
        if (llIlIIIIlllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.G.llllIlIIl[15]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2 = new int[llllIlIIl[0]];
        iArr2[llllIlIIl[1]] = llllIlIIl[14];
        if (llIlIIIIllll(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(llllIlIIl[14], llllIlIIl[0], llllIlIIl[142]));
            "".length();
        }
        int[] iArr3 = new int[llllIlIIl[0]];
        iArr3[llllIlIIl[1]] = llllIlIIl[8];
        if (llIlIIIIllll(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(llllIlIIl[8], llllIlIIl[0], llllIlIIl[142]));
            "".length();
        }
        int[] iArr4 = new int[llllIlIIl[0]];
        iArr4[llllIlIIl[1]] = llllIlIIl[11];
        if (llIlIIIIllll(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llllIlIIl[11], llllIlIIl[3], C0009j.ch));
            "".length();
        }
        int[] iArr5 = new int[llllIlIIl[0]];
        iArr5[llllIlIIl[1]] = llllIlIIl[12];
        if (llIlIIIIllll(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llllIlIIl[12], llllIlIIl[41], llllIlIIl[143]));
            "".length();
        }
        int[] iArr6 = new int[llllIlIIl[0]];
        iArr6[llllIlIIl[1]] = llllIlIIl[9];
        if (llIlIIIIllIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[llllIlIIl[0]];
            iArr7[llllIlIIl[1]] = llllIlIIl[9];
            if (llIlIIIIllIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llllIlIIl[0]];
                iArr8[llllIlIIl[1]] = llllIlIIl[9];
            }
            if (llIlIIIIllll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llllIIlll[llllIlIIl[148]]);
            }) ? 1 : 0)) {
                bx.add(new C0003d(llllIlIIl[144], llllIlIIl[3], llllIlIIl[145]));
                "".length();
            }
            iArr = new int[llllIlIIl[0]];
            iArr[llllIlIIl[1]] = llllIlIIl[7];
            if (llIlIIIIllll(Bank.contains(iArr) ? 1 : 0)) {
                return;
            }
            bx.add(new C0003d(llllIlIIl[7], llllIlIIl[51], llllIlIIl[146]));
            "".length();
            return;
        }
        bx.add(new C0003d(llllIlIIl[9], llllIlIIl[15], llllIlIIl[107]));
        "".length();
        if (llIlIIIIllll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llllIIlll[llllIlIIl[148]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[llllIlIIl[0]];
        iArr[llllIlIIl[1]] = llllIlIIl[7];
        if (llIlIIIIllll(Bank.contains(iArr) ? 1 : 0)) {
        }
    }

    private static void llIlIIIIlIlI() {
        llllIIlll = new String[llllIlIIl[185]];
        llllIIlll[llllIlIIl[1]] = llIlIIIIIlII("Btw1QS0nDG4MGN+kL7PpOnlErjxg1PmYe3tG/RCFOC56mJ1zaVsALMvBLJ2fb4rG", "czxqs");
        llllIIlll[llllIlIIl[0]] = llIlIIIIIlII("wQ1SNoNoI3MMTg6CaRzv9g==", "kPKDX");
        llllIIlll[llllIlIIl[5]] = llIlIIIIIlIl("478JHZHh8oconqY8tJQZrPMIwM2yzYrs", "Wtrqa");
        llllIIlll[llllIlIIl[10]] = llIlIIIIIlIl("1h17LamfYq3hGzdS/uA8d9nr4VdHUVns5CPnqhKmvvzpvW8oyRQ8bOzvl3RrSnEPFTYPVtlCArc=", "sHaoA");
        llllIIlll[llllIlIIl[6]] = llIlIIIIIlIl("3xCllR+Pdh0=", "gjDns");
        llllIIlll[llllIlIIl[3]] = llIlIIIIIllI("EQQD", "TewVy");
        llllIIlll[llllIlIIl[16]] = llIlIIIIIlIl("C5hE9TzDmrN5vMDVMXzxqg==", "Kvnpo");
        llllIIlll[llllIlIIl[17]] = llIlIIIIIllI("ChkuHy4wAyhNKywIPBk=", "YmOmZ");
        llllIIlll[llllIlIIl[18]] = llIlIIIIIlII("LCZ46/5SxAILbfvzFQHP+Q==", "zAMLw");
        llllIIlll[llllIlIIl[19]] = llIlIIIIIllI("Cyw1QiQqbTcHPTUhJkI0KiIx", "EMCbP");
        llllIIlll[llllIlIIl[13]] = llIlIIIIIllI("AwE9IBUvHD0sCS1PLSoIOA==", "JoIEg");
        llllIIlll[llllIlIIl[20]] = llIlIIIIIllI("NhIlISxaFzgpOw==", "zsWFI");
        llllIIlll[llllIlIIl[21]] = llIlIIIIIlIl("XZDUSKjLYQg=", "TnQJZ");
        llllIIlll[llllIlIIl[22]] = llIlIIIIIllI("PyI8Jj8OZxYjMhkjODc9", "kGQVS");
        llllIIlll[llllIlIIl[23]] = llIlIIIIIllI("JxQlVScGVTcaNA4a", "iuSuS");
        llllIIlll[llllIlIIl[24]] = llIlIIIIIllI("AzMJCiI4Lho=", "WAhzF");
        llllIIlll[llllIlIIl[27]] = llIlIIIIIlIl("1p/8120pQ6/4nwY+nykdKQ==", "zCoIb");
        llllIIlll[llllIlIIl[28]] = llIlIIIIIlIl("2qwgIS7WEbTYUq/guRTclA==", "AcClh");
        llllIIlll[llllIlIIl[29]] = llIlIIIIIlII("rKjKxbcSjGs=", "WUxNb");
        llllIIlll[llllIlIIl[30]] = llIlIIIIIlII("tnLGDNxQSIk=", "TdSLk");
        llllIIlll[llllIlIIl[31]] = llIlIIIIIlIl("wqR/HtrToP201xrPG6q11Q==", "SnEsx");
        llllIIlll[llllIlIIl[32]] = llIlIIIIIlIl("V5hmRRuZTuaIHvZlaEax+Q==", "YUDuB");
        llllIIlll[llllIlIIl[33]] = llIlIIIIIlII("UO5JGMQOOnAYBqcfL2H5KQ==", "tHVqM");
        llllIIlll[llllIlIIl[34]] = llIlIIIIIllI("ED4wGxM=", "GWUww");
        llllIIlll[llllIlIIl[35]] = llIlIIIIIllI("OjcJBjkLciMDNBw2DRc7", "nRdvU");
        llllIIlll[llllIlIIl[36]] = llIlIIIIIlIl("9CZHfY9E1ps=", "EdWIQ");
        llllIIlll[llllIlIIl[37]] = llIlIIIIIlIl("hNKIYtJyPJfrRhSzecKoBw==", "CZjvm");
        llllIIlll[llllIlIIl[38]] = llIlIIIIIlII("u1ZduFr0epA=", "rgzlO");
        llllIIlll[llllIlIIl[39]] = llIlIIIIIlIl("HI3ZwbNaL/lKVOPPmMN/LaevY8nSKH5k", "WgqAa");
        llllIIlll[llllIlIIl[40]] = llIlIIIIIlIl("RZ6WlL7BX+2utZ7KkrrvfI4xeSm6KelJ", "VBSYR");
        llllIIlll[llllIlIIl[41]] = llIlIIIIIlII("mqtgDs9jXrW38Yb1WWQvGw==", "zOPSO");
        llllIIlll[llllIlIIl[42]] = llIlIIIIIlII("xJeFXcTV56U=", "ySEUx");
        llllIIlll[llllIlIIl[43]] = llIlIIIIIlII("O254berYFwuM/vEThcmT8w==", "ReBJm");
        llllIIlll[llllIlIIl[44]] = llIlIIIIIlII("f2RYVdanUesQI98DaItgEQ==", "teEBI");
        llllIIlll[llllIlIIl[45]] = llIlIIIIIlII("NSrNogW78p335X3i8Mm9QQ==", "rmrQe");
        llllIIlll[llllIlIIl[46]] = llIlIIIIIllI("CTwJHnQQOgYVMA==", "BUgyT");
        llllIIlll[llllIlIIl[47]] = llIlIIIIIllI("OyMjSQcaYj8IGhk=", "uBUis");
        llllIIlll[llllIlIIl[48]] = llIlIIIIIllI("DCsTLBogNhMgBiJlAyYHNw==", "EEgIh");
        llllIIlll[llllIlIIl[49]] = llIlIIIIIllI("Mhc9KE4VHT42", "qrQDn");
        llllIIlll[llllIlIIl[50]] = llIlIIIIIllI("BjItIQ==", "IBHOh");
        llllIIlll[llllIlIIl[51]] = llIlIIIIIlIl("XeIf4FYmsD6Fwlt0L85GJg==", "lvvpu");
        llllIIlll[llllIlIIl[52]] = llIlIIIIIlIl("P2ePSXGCKymq9vJJ/qam/Q==", "EHcGf");
        llllIIlll[llllIlIIl[53]] = llIlIIIIIlIl("bOVoFLQDufed8CSkCdYW7HyanhGJs/L7", "nZWiz");
        llllIIlll[llllIlIIl[55]] = llIlIIIIIllI("AB4aDzoq", "AjnnY");
        llllIIlll[llllIlIIl[56]] = llIlIIIIIlIl("XOzReriAdON3fQ/LPVErBQ==", "jrTOV");
        llllIIlll[llllIlIIl[57]] = llIlIIIIIlII("2Z/zPr75fkU=", "xIYJs");
        llllIIlll[llllIlIIl[58]] = llIlIIIIIlII("Q+fC+q/SE5E=", "MafjC");
        llllIIlll[llllIlIIl[59]] = llIlIIIIIlII("sRH57whTvgzVWxTdCwQOtw==", "XgFIA");
        llllIIlll[llllIlIIl[60]] = llIlIIIIIlII("m8Ik/EtET/CQ356ql9LE9w==", "quTFI");
        llllIIlll[llllIlIIl[61]] = llIlIIIIIllI("PgEsAC4WD2IPIgE=", "xhBdG");
        llllIIlll[llllIlIIl[15]] = llIlIIIIIlII("jWE5dCzqkm+kVCMfoUK9tg==", "DBYzJ");
        llllIIlll[llllIlIIl[62]] = llIlIIIIIlIl("aF6fh/qxeINF7n5+lnW9ww==", "MVAqq");
        llllIIlll[llllIlIIl[63]] = llIlIIIIIlII("7rF3FOQNEawZs9FdmIPI0w==", "LFgfG");
        llllIIlll[llllIlIIl[64]] = llIlIIIIIlIl("4XEVSz1R8zM=", "CxEXG");
        llllIIlll[llllIlIIl[66]] = llIlIIIIIllI("LTQ2BE8PIyA=", "dFYjo");
        llllIIlll[llllIlIIl[67]] = llIlIIIIIlIl("WoCPB76HwbhPKuIzHcXX2Q==", "tWlMT");
        llllIIlll[llllIlIIl[68]] = llIlIIIIIllI("HgkVZy0/SAkmMDw=", "PhcGY");
        llllIIlll[llllIlIIl[69]] = llIlIIIIIllI("HjQuCzQyKS4HKDB6PgEpJQ==", "WZZnF");
        llllIIlll[llllIlIIl[70]] = llIlIIIIIlII("6tqMz0catAtJLxfuEdhDSA==", "uqySj");
        llllIIlll[llllIlIIl[71]] = llIlIIIIIlIl("9zwEsbb6KKWpU/cVDWKy+Q==", "cAHqe");
        llllIIlll[llllIlIIl[72]] = llIlIIIIIllI("ID8dPhwI", "dMxDy");
        llllIIlll[llllIlIIl[73]] = llIlIIIIIllI("LSkzBQkKIXYBGxsgJA==", "oEVvz");
        llllIIlll[llllIlIIl[74]] = llIlIIIIIlII("MZFtAeErG7ChcekAPX89hg==", "Ygtxn");
        llllIIlll[llllIlIIl[75]] = llIlIIIIIllI("FTsGNSM9", "QIcOF");
        llllIIlll[llllIlIIl[76]] = llIlIIIIIllI("MD0HEBwcPRRVDRA/Hw==", "uSsun");
        llllIIlll[llllIlIIl[77]] = llIlIIIIIlII("xZgchT1NBzK+Rn86JvhYeA==", "vMNLC");
        llllIIlll[llllIlIIl[78]] = llIlIIIIIlII("Vs/ZUklTtxg=", "mwaqR");
        llllIIlll[llllIlIIl[79]] = llIlIIIIIlIl("Zpvoddw0qU3X9yKDycwf+g==", "KWrhQ");
        llllIIlll[llllIlIIl[80]] = llIlIIIIIllI("EjcvAws/", "QXIeb");
        llllIIlll[llllIlIIl[81]] = llIlIIIIIlIl("hcnchOYZqbG8l246ls9aBjOzHZvsC8Ym", "dWGlM");
        llllIIlll[llllIlIIl[82]] = llIlIIIIIlII("01frDRcc0Mfz1gAP7CWIcA==", "ZIRtI");
        llllIIlll[llllIlIIl[83]] = llIlIIIIIllI("KRsfPRgCBFYqFAAP", "lcvIq");
        llllIIlll[llllIlIIl[84]] = llIlIIIIIlII("tDr/LvGpl2T0PXREKGq7yA==", "sLKrI");
        llllIIlll[llllIlIIl[85]] = llIlIIIIIlII("/M5lxzULRW0=", "NEipa");
        llllIIlll[llllIlIIl[86]] = llIlIIIIIlIl("pL4bk3Wz4lY=", "qOQJt");
        llllIIlll[llllIlIIl[87]] = llIlIIIIIlII("3wzARfAkPDlJXRSKSavkRQ==", "iwsaM");
        llllIIlll[llllIlIIl[88]] = llIlIIIIIlII("b/ZFLdQM7S4=", "rPiqZ");
        llllIIlll[llllIlIIl[89]] = llIlIIIIIllI("IRs9AwQNGy5GFQEZJQ==", "duIfv");
        llllIIlll[llllIlIIl[90]] = llIlIIIIIllI("Cyo4JHksIDs6", "HOTHY");
        llllIIlll[llllIlIIl[91]] = llIlIIIIIlIl("DNz4KmQgX3o=", "JdxrT");
        llllIIlll[llllIlIIl[92]] = llIlIIIIIllI("ODQ+bQIZdS4kGBc5aDkfGjA=", "vUHMv");
        llllIIlll[llllIlIIl[98]] = llIlIIIIIllI("Px8RKhcEAgI=", "kmpZs");
        llllIIlll[llllIlIIl[99]] = llIlIIIIIlIl("3o4hkqDHxxM=", "EHIJk");
        llllIIlll[llllIlIIl[100]] = llIlIIIIIlIl("DupJOMA4K8M=", "fyGvZ");
        llllIIlll[llllIlIIl[101]] = llIlIIIIIllI("DwUGKRhhDQAzFA==", "LioDz");
        llllIIlll[llllIlIIl[102]] = llIlIIIIIllI("Ehg6Dht8EDwUFw==", "QtScy");
        llllIIlll[llllIlIIl[103]] = llIlIIIIIlII("xXaWEMwwEfJAfrRLJR8Ccw==", "htEmX");
        llllIIlll[llllIlIIl[104]] = llIlIIIIIlIl("9vYG8ABRd70=", "NVYIB");
        llllIIlll[llllIlIIl[105]] = llIlIIIIIllI("NRELIncAFwoiOQYB", "edyGW");
        llllIIlll[llllIlIIl[106]] = llIlIIIIIlII("brp4ge0FebjFL8mrfBj4lA==", "drubV");
        llllIIlll[llllIlIIl[107]] = llIlIIIIIlIl("7MlI6DDNkw8=", "NUxdA");
        llllIIlll[llllIlIIl[108]] = llIlIIIIIlII("JwC+BQ0hLL6bha1F3KLBOg==", "kWAah");
        llllIIlll[llllIlIIl[109]] = llIlIIIIIlII("KFgopLpexW8D5/e4AZKqyQWo1Sv/k3NP", "VvXPX");
        llllIIlll[llllIlIIl[110]] = llIlIIIIIlII("1YbvWRLLLBYu3GZAKDyOrw==", "OwyPj");
        llllIIlll[llllIlIIl[111]] = llIlIIIIIllI("GgMMWDo7QhwRIDUOWgwnOAc=", "TbzxN");
        llllIIlll[llllIlIIl[112]] = llIlIIIIIlII("PZhQDhpA1yLxDQSTpZ9udw==", "lMwlp");
        llllIIlll[llllIlIIl[113]] = llIlIIIIIlIl("JWZa1JslDE0=", "tExPX");
        llllIIlll[llllIlIIl[114]] = llIlIIIIIllI("Fhk0IQ==", "YiQOa");
        llllIIlll[llllIlIIl[115]] = llIlIIIIIlIl("N/4FY0IwFaUxd7/PWQKX7w==", "VONBE");
        llllIIlll[llllIlIIl[116]] = llIlIIIIIlIl("04kp4qv8oR+Ku+4bSuiGNA==", "juKZi");
        llllIIlll[llllIlIIl[117]] = llIlIIIIIlII("K79y6U6qUgfjwrrP9NBbZPF27aGG+8BPOVn3/NaVDF9BssmAiinvow==", "HHRmT");
        llllIIlll[llllIlIIl[119]] = llIlIIIIIlII("1LbXgCd1rgo=", "xatSa");
        llllIIlll[llllIlIIl[127]] = llIlIIIIIlII("bb8h1b+koaGKcz2NC0ZntA==", "zORVE");
        llllIIlll[llllIlIIl[128]] = llIlIIIIIlII("o0HK8vn1defX1Xt7PMqQLw==", "tPWqE");
        llllIIlll[llllIlIIl[129]] = llIlIIIIIlIl("47Fi0+lGeP2ortIJJsHfkA==", "IycWb");
        llllIIlll[llllIlIIl[130]] = llIlIIIIIlII("LKDiLfsyfHBk02z4mcYPiw==", "rRrzM");
        llllIIlll[llllIlIIl[131]] = llIlIIIIIllI("LxkjehwOWDMzBgAUdS4BDR0=", "axUZh");
        llllIIlll[llllIlIIl[2]] = llIlIIIIIlII("9ulOcXFm/vj6s1fNzsXInQ==", "sYmTe");
        llllIIlll[llllIlIIl[132]] = llIlIIIIIllI("GTMHIg==", "VCbLk");
        llllIIlll[llllIlIIl[133]] = llIlIIIIIllI("HDEDLA==", "SAfBA");
        llllIIlll[llllIlIIl[134]] = llIlIIIIIlIl("07RI5OhphUJSYdiaMGcaoA==", "dsQcx");
        llllIIlll[llllIlIIl[135]] = llIlIIIIIlII("3tR4ygGDPa6jrhKWwi1OWA==", "YHOyE");
        llllIIlll[llllIlIIl[136]] = llIlIIIIIllI("PxQmaSweVTIoNho=", "quPIX");
        llllIIlll[llllIlIIl[137]] = llIlIIIIIllI("DQ0BFzgsAghTNiQCBBo6Ig==", "ElosT");
        llllIIlll[llllIlIIl[138]] = llIlIIIIIlIl("n+9AchuvLR7PBUAn6ENq7w==", "yLYdJ");
        llllIIlll[llllIlIIl[139]] = llIlIIIIIlIl("XYZPwmv5bK3Z5WKgUWLMH4OakC/x4oXf", "WJdvP");
        llllIIlll[llllIlIIl[140]] = llIlIIIIIllI("EgAzOR0k", "PuPRx");
        llllIIlll[llllIlIIl[141]] = llIlIIIIIllI("FzIUPBwh", "UGwWy");
        llllIIlll[llllIlIIl[147]] = llIlIIIIIlII("71SpVHjBA+ebDZgbwM5Osg==", "yPlTY");
        llllIIlll[llllIlIIl[148]] = llIlIIIIIllI("OS40H0wkIXoPCSorLhBMYw==", "KGZxl");
        llllIIlll[llllIlIIl[165]] = llIlIIIIIlII("kpwf7D8+TKaOp1n7XyjWlBzez0bZEzF4AqhXGsTRWPk=", "gsWYb");
        llllIIlll[llllIlIIl[166]] = llIlIIIIIllI("GyEiSQ==", "BDQgy");
        llllIIlll[llllIlIIl[167]] = llIlIIIIIllI("GCx4aCQyM3QlLXcvMSQ4dzM8LSZ5", "WGTHH");
        llllIIlll[llllIlIIl[168]] = llIlIIIIIllI("HS4Aa0wqJAdnGCEnHGcBIWsHLw0wawQvCWQ7AigOKC4dZwU3ZQ==", "DKpGl");
        llllIIlll[llllIlIIl[169]] = llIlIIIIIllI("IhA9An8=", "qeOgQ");
        llllIIlll[llllIlIIl[170]] = llIlIIIIIllI("KQsTaSAVRBQnNRgQSm4lFUQCITxXEEg=", "pdfNR");
        llllIIlll[llllIlIIl[171]] = llIlIIIIIlIl("F0YBzmZanO0qQDmf21cCLmKsIJ9PgZOzPMtGmLBc8T7ZgrqFP8Ao2vlzjksi0k9X6CG+5zBP9+M=", "REimb");
        llllIIlll[llllIlIIl[172]] = llIlIIIIIlII("dqj+r4gE7arXHFKtq0c6QHbT9B/z02IMEqcBW4D6+tlJKfEFnfAr0+Y5T0Fo95a1", "UFLgt");
        llllIIlll[llllIlIIl[173]] = llIlIIIIIlIl("Ta/zePJSNPazevwdloQfcL1FMcM2+lycVMO2XGrIaPc=", "XTiuy");
        llllIIlll[llllIlIIl[174]] = llIlIIIIIlIl("ycDNLfaMMEb+EuVed53VFA==", "flBnZ");
        llllIIlll[llllIlIIl[175]] = llIlIIIIIlII("oFj9YNh7iH3s1VeVMAZ3bg==", "XTooL");
        llllIIlll[llllIlIIl[176]] = llIlIIIIIlII("bNRh85e4fmmae1APT1tlWA==", "cUvRN");
        llllIIlll[llllIlIIl[177]] = llIlIIIIIllI("M0YsGy8UDXg6YQwDeAApFhA9F2YODj1TNg8cIh8jWw==", "zfXsF");
        llllIIlll[llllIlIIl[178]] = llIlIIIIIlIl("ODvt7v95249p8dzztMDnJQ==", "JEjkh");
        llllIIlll[llllIlIIl[179]] = llIlIIIIIlII("Z9lZMwWysx/lBNJ6MULXeac5eEG8r7nbubXrXADlsddjXBJRoLTyww==", "COhqD");
        llllIIlll[llllIlIIl[180]] = llIlIIIIIlII("StOvxcxBtkNSY2bzvGhR+7Ci3dT/zuHzqqwgYxfbHFHoEvvQxCDXXw==", "vRjgA");
        llllIIlll[llllIlIIl[181]] = llIlIIIIIlII("pjI8zwtHWsBMIUwzY9Cu+ODZWGXUvfLV", "xkRcQ");
        llllIIlll[llllIlIIl[182]] = llIlIIIIIllI("DjYCdks4NVE5BCIhAj9F", "WSqZk");
        llllIIlll[llllIlIIl[183]] = llIlIIIIIllI("BQV1NRc0Sj4iFzZKOipYIAQsOBAoBDJsMWEJNCJYJQV1JRZhJzo+ATULOyUZfg==", "AjULx");
        llllIIlll[llllIlIIl[184]] = llIlIIIIIlIl("2epp9/g3Rzgd80wnf1pxJqlkf92wGWvlC/HoMb1voA5x1WammMj7yno5WEzDYx/D", "KqhsP");
    }

    private static boolean llIlIIIlIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIIIlIIll(int i) {
        return i < 0;
    }

    private static boolean llIlIIIlIIIl(Object obj) {
        return obj != null;
    }

    private static String llIlIIIIIllI(String lIllllIlllIll, String lIllllIlllIlI) {
        String lIllllIlllIll2 = new String(Base64.getDecoder().decode(lIllllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIllllIlllIlI.toCharArray();
        int lIllllIllIlll = llllIlIIl[1];
        char[] charArray2 = lIllllIlllIll2.toCharArray();
        int length = charArray2.length;
        int i = llllIlIIl[1];
        while (llIlIIIIlllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIllllIllIlll % charArray.length]));
            "".length();
            lIllllIllIlll++;
            i++;
            "".length();
            if ((-((226 ^ 156) ^ (5 ^ 127))) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean bN() {
        String[] strArr = new String[llllIlIIl[0]];
        strArr[llllIlIIl[1]] = llllIIlll[llllIlIIl[140]];
        if (llIlIIIlIIlI(Inventory.getCount(strArr))) {
            int[] iArr = new int[llllIlIIl[0]];
            iArr[llllIlIIl[1]] = llllIlIIl[12];
            if (llIlIIIlIIlI(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[llllIlIIl[0]];
                iArr2[llllIlIIl[1]] = llllIlIIl[11];
                if (llIlIIIlIIlI(Inventory.getCount(iArr2))) {
                    int[] iArr3 = new int[llllIlIIl[0]];
                    iArr3[llllIlIIl[1]] = llllIlIIl[7];
                    if (llIlIIIIllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        ?? r0 = llllIlIIl[0];
                        "".length();
                        return 0 != 0 ? ((((133 + 90) - 2) + 27) ^ (((149 + 54) - 14) + 9)) & (((((125 + 47) - 81) + 78) ^ (((140 + 103) - 169) + 77)) ^ (-" ".length())) : r0;
                    }
                }
            }
        }
        return llllIlIIl[1];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llllIIlll[llllIlIIl[147]];
    }

    private static boolean llIlIIIIlllI(int i, int i2) {
        return i < i2;
    }
}
