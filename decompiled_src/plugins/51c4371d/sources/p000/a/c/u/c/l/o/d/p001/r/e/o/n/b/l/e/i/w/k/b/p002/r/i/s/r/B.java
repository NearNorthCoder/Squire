package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.B  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/B.class */
public class B implements F {
    static /* synthetic */ int ci;
    public static /* synthetic */ WorldPoint hS;
    private static /* synthetic */ String[] llIlIIll;
    public static /* synthetic */ WorldPoint hQ;
    public static /* synthetic */ WorldPoint hR;
    public static /* synthetic */ WorldPoint hT;
    public static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ boolean bz;
    static /* synthetic */ WorldArea hV;
    static /* synthetic */ int hU;
    public static /* synthetic */ List<C0003d> bB;
    private static /* synthetic */ int[] llIlIlll;
    static /* synthetic */ String[] bX;
    static /* synthetic */ boolean cj;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ac() {
        int[] iArr = new int[llIlIlll[4]];
        iArr[llIlIlll[1]] = llIlIlll[5];
        iArr[llIlIlll[0]] = llIlIlll[6];
        iArr[llIlIlll[3]] = llIlIlll[7];
        iArr[llIlIlll[8]] = llIlIlll[9];
        int i = llIlIlll[1];
        while (lIllIlIIIlI(i, iArr.length)) {
            int[] iArr2 = new int[llIlIlll[0]];
            iArr2[llIlIlll[1]] = iArr[i];
            if (lIllIlIIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIlIlll[1];
            }
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return ((((115 + 65) - 136) + 88) ^ (((41 + 143) - 94) + 89)) & (((((99 + 87) - 182) + 139) ^ (((162 + 103) - 86) + 5)) ^ (-" ".length()));
            }
        }
        return llIlIlll[0];
    }

    private static boolean lIllIlIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIllIlIIIll(int i) {
        return i == 0;
    }

    static {
        lIllIIlllII();
        lIllIIllIll();
        bB = new ArrayList();
        ce = new WorldPoint(llIlIlll[64], llIlIlll[187], llIlIlll[1]);
        hQ = new WorldPoint(llIlIlll[188], llIlIlll[189], llIlIlll[1]);
        hR = new WorldPoint(llIlIlll[161], llIlIlll[190], llIlIlll[1]);
        hS = new WorldPoint(llIlIlll[191], llIlIlll[192], llIlIlll[1]);
        hT = new WorldPoint(llIlIlll[64], llIlIlll[45], llIlIlll[3]);
        hU = llIlIlll[47];
        String[] strArr = new String[llIlIlll[8]];
        strArr[llIlIlll[1]] = llIlIIll[llIlIlll[193]];
        strArr[llIlIlll[0]] = llIlIIll[llIlIlll[194]];
        strArr[llIlIlll[3]] = llIlIIll[llIlIlll[195]];
        bX = strArr;
        hV = new WorldArea(llIlIlll[188], llIlIlll[196], llIlIlll[50], llIlIlll[40], llIlIlll[1]);
    }

    private static boolean lIllIlIlIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0514, code lost:
        if (lIllIlIIIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L399;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1210, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1232, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bF() {
        if (lIllIlIIIIl(bz ? 1 : 0)) {
            C0001b.a(bB);
            if (lIllIlIIIlI(bB.size(), llIlIlll[0])) {
                System.out.println(llIlIIll[llIlIlll[1]]);
                bz = llIlIlll[1];
            }
        }
        if (lIllIlIIIll(bz ? 1 : 0)) {
            if (lIllIlIIIll(ac() ? 1 : 0) && lIllIlIIIlI(C0004e.j(hU), llIlIlll[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIlIIlII(nearest) && lIllIlIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIlIIll[llIlIlll[0]];
                    C0000a.a(nearest);
                }
                if (lIllIlIIlII(nearest) && lIllIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIlll[2]);
                        "".length();
                    }
                    if (lIllIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = llIlIIll[llIlIlll[3]];
                        if (lIllIlIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIlll[4]);
                            "".length();
                        }
                        if (lIllIlIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIlll[3]);
                            "".length();
                        }
                        int[] iArr = new int[llIlIlll[4]];
                        iArr[llIlIlll[1]] = llIlIlll[5];
                        iArr[llIlIlll[0]] = llIlIlll[6];
                        iArr[llIlIlll[3]] = llIlIlll[7];
                        iArr[llIlIlll[8]] = llIlIlll[9];
                        if (lIllIlIIIll(C0004e.b(iArr) ? 1 : 0)) {
                            ag();
                            System.out.println(llIlIIll[llIlIlll[8]]);
                            bz = llIlIlll[0];
                            return;
                        }
                        int[] iArr2 = new int[llIlIlll[4]];
                        iArr2[llIlIlll[1]] = llIlIlll[5];
                        iArr2[llIlIlll[0]] = llIlIlll[6];
                        iArr2[llIlIlll[3]] = llIlIlll[7];
                        iArr2[llIlIlll[8]] = llIlIlll[9];
                        if (lIllIlIIIIl(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(llIlIlll[5], llIlIlll[10]);
                            C0000a.a(llIlIlll[6], llIlIlll[10]);
                            C0000a.a(llIlIlll[7], llIlIlll[0]);
                            C0000a.a(llIlIlll[11], llIlIlll[0]);
                            C0000a.a(llIlIlll[9], llIlIlll[0]);
                            C0000a.a(llIlIlll[12], llIlIlll[0]);
                            C0000a.a(llIlIlll[13], llIlIlll[14]);
                        }
                    }
                }
            }
            if (lIllIlIIIIl(Inventory.contains(C0005f.bb) ? 1 : 0) && lIllIlIIIlI(Movement.getRunEnergy(), llIlIlll[15])) {
                Inventory.getFirst(C0005f.bb).interact(llIlIIll[llIlIlll[4]]);
                Time.sleepTicks(llIlIlll[0]);
                "".length();
            }
            int[] iArr3 = new int[llIlIlll[0]];
            iArr3[llIlIlll[1]] = llIlIlll[13];
            if (lIllIlIIIIl(Inventory.contains(iArr3) ? 1 : 0) && lIllIlIIllI(lIllIIlllIl(C0004e.v(), 50.0d))) {
                int[] iArr4 = new int[llIlIlll[0]];
                iArr4[llIlIlll[1]] = llIlIlll[13];
                Inventory.getFirst(iArr4).interact(llIlIIll[llIlIlll[14]]);
                Time.sleepTicks(llIlIlll[3]);
                "".length();
            }
            if (lIllIlIIIIl(ac() ? 1 : 0) && lIllIlIIIll(C0004e.j(hU))) {
                if (lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(ce), llIlIlll[16])) {
                    AccBuilderBarrows.c = llIlIIll[llIlIlll[17]];
                    Movement.walkTo(ce);
                    "".length();
                    Time.sleepTicks(llIlIlll[0]);
                    "".length();
                }
                if (lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(ce), llIlIlll[16])) {
                    AccBuilderBarrows.c = llIlIIll[llIlIlll[18]];
                    if (lIllIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0006g.a(llIlIIll[llIlIlll[16]], bX);
                }
            }
            if (lIllIlIlIIl(C0004e.j(hU), llIlIlll[0])) {
                ci = llIlIlll[1];
                int[] iArr5 = new int[llIlIlll[0]];
                iArr5[llIlIlll[1]] = llIlIlll[11];
                if (lIllIlIIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIlIlll[0]];
                    iArr6[llIlIlll[1]] = llIlIlll[19];
                    if (lIllIlIIIll(Inventory.contains(iArr6) ? 1 : 0)) {
                        String[] strArr = new String[llIlIlll[0]];
                        strArr[llIlIlll[1]] = llIlIIll[llIlIlll[20]];
                        if (lIllIlIIIll(Inventory.contains(strArr) ? 1 : 0)) {
                            WorldPoint worldPoint = new WorldPoint(llIlIlll[21], llIlIlll[22], llIlIlll[0]);
                            int[] iArr7 = new int[llIlIlll[0]];
                            iArr7[llIlIlll[1]] = llIlIlll[11];
                            if (lIllIlIIIll(Inventory.contains(iArr7) ? 1 : 0)) {
                                if (lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIlll[14])) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[10]];
                                    Movement.walkTo(worldPoint);
                                    "".length();
                                    Time.sleepTicks(llIlIlll[0]);
                                    "".length();
                                }
                                if (lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIlIlll[14])) {
                                    int[] iArr8 = new int[llIlIlll[0]];
                                    iArr8[llIlIlll[1]] = llIlIlll[11];
                                    TileItem nearest2 = TileItems.getNearest(iArr8);
                                    if (lIllIlIIlII(nearest2)) {
                                        if (lIllIlIIIll(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[23]];
                                            Movement.walkTo(nearest2.getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(llIlIlll[0]);
                                            "".length();
                                        }
                                        if (lIllIlIIIIl(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[24]];
                                            nearest2.interact(llIlIIll[llIlIlll[25]]);
                                            Time.sleepTicks(llIlIlll[8]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr9 = new int[llIlIlll[0]];
                iArr9[llIlIlll[1]] = llIlIlll[11];
                if (lIllIlIIIll(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIlIlll[0]];
                    iArr10[llIlIlll[1]] = llIlIlll[19];
                }
                int[] iArr11 = new int[llIlIlll[0]];
                iArr11[llIlIlll[1]] = llIlIlll[19];
                if (lIllIlIIIll(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIlIlll[0]];
                    iArr12[llIlIlll[1]] = llIlIlll[11];
                    if (lIllIlIIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIlIIll[llIlIlll[26]];
                        int[] iArr13 = new int[llIlIlll[0]];
                        iArr13[llIlIlll[1]] = llIlIlll[11];
                        Item first = Inventory.getFirst(iArr13);
                        int[] iArr14 = new int[llIlIlll[0]];
                        iArr14[llIlIlll[1]] = llIlIlll[9];
                        first.useOn(Inventory.getFirst(iArr14));
                        Time.sleepTicks(llIlIlll[0]);
                        "".length();
                    }
                }
                int[] iArr15 = new int[llIlIlll[0]];
                iArr15[llIlIlll[1]] = llIlIlll[19];
                if (lIllIlIIIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                    String[] strArr2 = new String[llIlIlll[0]];
                    strArr2[llIlIlll[1]] = llIlIIll[llIlIlll[27]];
                    if (lIllIlIIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hQ), llIlIlll[4])) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[28]];
                            Movement.walkTo(hQ);
                            "".length();
                            Time.sleepTicks(llIlIlll[0]);
                            "".length();
                        }
                        if (lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hQ), llIlIlll[4])) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[29]];
                            String[] strArr3 = new String[llIlIlll[0]];
                            strArr3[llIlIlll[1]] = llIlIIll[llIlIlll[30]];
                            TileObjects.getNearest(strArr3).interact(llIlIIll[llIlIlll[31]]);
                            Time.sleepTicks(llIlIlll[20]);
                            "".length();
                        }
                    }
                    String[] strArr4 = new String[llIlIlll[0]];
                    strArr4[llIlIlll[1]] = llIlIIll[llIlIlll[32]];
                    if (lIllIlIIIIl(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hR), llIlIlll[8])) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[33]];
                            Movement.walkTo(hR);
                            "".length();
                            Time.sleepTicks(llIlIlll[0]);
                            "".length();
                        }
                        if (lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hR), llIlIlll[8])) {
                            int[] iArr16 = new int[llIlIlll[0]];
                            iArr16[llIlIlll[1]] = llIlIlll[19];
                            Item first2 = Inventory.getFirst(iArr16);
                            String[] strArr5 = new String[llIlIlll[0]];
                            strArr5[llIlIlll[1]] = llIlIIll[llIlIlll[34]];
                            first2.useOn(TileObjects.getNearest(strArr5));
                            Time.sleepTicks(llIlIlll[0]);
                            "".length();
                        }
                    }
                }
                String[] strArr6 = new String[llIlIlll[0]];
                strArr6[llIlIlll[1]] = llIlIIll[llIlIlll[35]];
                if (lIllIlIIIIl(Inventory.contains(strArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[llIlIlll[0]];
                    iArr17[llIlIlll[1]] = llIlIlll[19];
                    if (lIllIlIIIll(Inventory.contains(iArr17) ? 1 : 0)) {
                        String[] strArr7 = new String[llIlIlll[0]];
                        strArr7[llIlIlll[1]] = llIlIIll[llIlIlll[36]];
                        if (lIllIlIIIll(Inventory.contains(strArr7) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[37]];
                            if (lIllIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr8 = new String[llIlIlll[0]];
                                strArr8[llIlIlll[1]] = llIlIIll[llIlIlll[38]];
                                TileObjects.getNearest(strArr8).interact(llIlIIll[llIlIlll[39]]);
                                Time.sleepTicks(llIlIlll[4]);
                                "".length();
                            }
                            C0006g.a(bX);
                        }
                    }
                }
                String[] strArr9 = new String[llIlIlll[0]];
                strArr9[llIlIlll[1]] = llIlIIll[llIlIlll[40]];
                if (lIllIlIIIIl(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[llIlIlll[0]];
                    strArr10[llIlIlll[1]] = llIlIIll[llIlIlll[41]];
                    if (lIllIlIIIIl(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[llIlIlll[0]];
                        strArr11[llIlIlll[1]] = llIlIIll[llIlIlll[42]];
                        if (lIllIlIIIll(Inventory.contains(strArr11) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(llIlIlll[43], llIlIlll[44], llIlIlll[1]);
                            WorldPoint worldPoint3 = new WorldPoint(llIlIlll[21], llIlIlll[44], llIlIlll[1]);
                            WorldArea worldArea = new WorldArea(llIlIlll[21], llIlIlll[45], llIlIlll[14], llIlIlll[8], llIlIlll[1]);
                            if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) && lIllIlIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[46]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(llIlIlll[0]);
                                "".length();
                            }
                            if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                String[] strArr12 = new String[llIlIlll[0]];
                                strArr12[llIlIlll[1]] = llIlIIll[llIlIlll[47]];
                                TileObjects.getNearest(strArr12).interact(llIlIIll[llIlIlll[48]]);
                                Time.sleepTicks(llIlIlll[3]);
                                "".length();
                            }
                            if (lIllIlIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderBarrows.c = llIlIIll[llIlIlll[49]];
                                String[] strArr13 = new String[llIlIlll[0]];
                                strArr13[llIlIlll[1]] = llIlIIll[llIlIlll[50]];
                                TileItems.getNearest(strArr13).interact(llIlIIll[llIlIlll[51]]);
                                Time.sleepTicks(llIlIlll[8]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr14 = new String[llIlIlll[0]];
                strArr14[llIlIlll[1]] = llIlIIll[llIlIlll[52]];
                if (lIllIlIIIIl(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[llIlIlll[0]];
                    strArr15[llIlIlll[1]] = llIlIIll[llIlIlll[53]];
                    if (lIllIlIIIll(Inventory.contains(strArr15) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(llIlIlll[21], llIlIlll[45], llIlIlll[14], llIlIlll[8], llIlIlll[1]);
                        WorldArea worldArea3 = new WorldArea(llIlIlll[54], llIlIlll[55], llIlIlll[18], llIlIlll[23], llIlIlll[1]);
                        if (lIllIlIIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr16 = new String[llIlIlll[0]];
                            strArr16[llIlIlll[1]] = llIlIIll[llIlIlll[56]];
                            TileObjects.getNearest(strArr16).interact(llIlIIll[llIlIlll[57]]);
                            Time.sleepTicks(llIlIlll[3]);
                            "".length();
                        }
                        if (lIllIlIIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIIll(hV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[58]];
                            Movement.walkTo(hS);
                            "".length();
                            Time.sleepTicks(llIlIlll[0]);
                            "".length();
                        }
                        if (lIllIlIIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr17 = new String[llIlIlll[0]];
                            strArr17[llIlIlll[1]] = llIlIIll[llIlIlll[59]];
                            TileObjects.getNearest(strArr17).interact(llIlIIll[llIlIlll[60]]);
                            Time.sleepTicks(llIlIlll[4]);
                            "".length();
                        }
                        if (lIllIlIIIIl(hV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint4 = new WorldPoint(llIlIlll[21], llIlIlll[61], llIlIlll[1]);
                            WorldPoint worldPoint5 = new WorldPoint(llIlIlll[62], llIlIlll[63], llIlIlll[1]);
                            new WorldPoint(llIlIlll[64], llIlIlll[65], llIlIlll[1]);
                            new WorldPoint(llIlIlll[43], llIlIlll[66], llIlIlll[1]);
                            WorldPoint worldPoint6 = new WorldPoint(llIlIlll[67], llIlIlll[66], llIlIlll[1]);
                            WorldPoint worldPoint7 = new WorldPoint(llIlIlll[67], llIlIlll[66], llIlIlll[1]);
                            WorldArea worldArea4 = new WorldArea(llIlIlll[68], llIlIlll[69], llIlIlll[20], llIlIlll[23], llIlIlll[1]);
                            WorldArea worldArea5 = new WorldArea(llIlIlll[70], llIlIlll[71], llIlIlll[14], llIlIlll[17], llIlIlll[1]);
                            WorldArea worldArea6 = new WorldArea(llIlIlll[72], llIlIlll[73], llIlIlll[32], llIlIlll[25], llIlIlll[1]);
                            if (lIllIlIlIlI(Vars.getBit(llIlIlll[74]), llIlIlll[0]) && lIllIlIIIll(Vars.getBit(llIlIlll[75]))) {
                                if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[76]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(llIlIlll[0]);
                                    "".length();
                                }
                                if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[77]];
                                    String[] strArr18 = new String[llIlIlll[0]];
                                    strArr18[llIlIlll[1]] = llIlIIll[llIlIlll[78]];
                                    TileObjects.getNearest(strArr18).interact(llIlIIll[llIlIlll[79]]);
                                    Time.sleepTicks(llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (lIllIlIlIIl(Vars.getBit(llIlIlll[74]), llIlIlll[0]) && lIllIlIIIll(Vars.getBit(llIlIlll[80])) && lIllIlIIIll(Vars.getBit(llIlIlll[75]))) {
                                if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[81]];
                                    Movement.walkTo(worldPoint5);
                                    "".length();
                                    Time.sleepTicks(llIlIlll[0]);
                                    "".length();
                                }
                                if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[82]];
                                    String[] strArr19 = new String[llIlIlll[0]];
                                    strArr19[llIlIlll[1]] = llIlIIll[llIlIlll[15]];
                                    TileObjects.getNearest(strArr19).interact(llIlIIll[llIlIlll[83]]);
                                    Time.sleepTicks(llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (lIllIlIlIIl(Vars.getBit(llIlIlll[74]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[80]), llIlIlll[0]) && lIllIlIIIll(Vars.getBit(llIlIlll[75]))) {
                                if (lIllIlIIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint8 = new WorldPoint(llIlIlll[21], llIlIlll[84], llIlIlll[1]);
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[85]];
                                        Movement.walkTo(worldPoint8);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        String[] strArr20 = new String[llIlIlll[0]];
                                        strArr20[llIlIlll[1]] = llIlIIll[llIlIlll[86]];
                                        TileObjects.getNearest(strArr20).interact(llIlIIll[llIlIlll[87]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (lIllIlIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[88]];
                                    String[] strArr21 = new String[llIlIlll[0]];
                                    strArr21[llIlIlll[1]] = llIlIIll[llIlIlll[89]];
                                    TileObjects.getNearest(strArr21).interact(llIlIIll[llIlIlll[90]]);
                                    Time.sleepTicks(llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (lIllIlIlIIl(Vars.getBit(llIlIlll[74]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[80]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[75]), llIlIlll[0])) {
                                if (lIllIlIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint9 = new WorldPoint(llIlIlll[21], llIlIlll[91], llIlIlll[1]);
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[92]];
                                        Movement.walkTo(worldPoint9);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        String[] strArr22 = new String[llIlIlll[0]];
                                        strArr22[llIlIlll[1]] = llIlIIll[llIlIlll[93]];
                                        TileObjects.getNearest(strArr22).interact(llIlIIll[llIlIlll[94]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (lIllIlIIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[95]];
                                        Movement.walkTo(worldPoint5);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[96]];
                                        String[] strArr23 = new String[llIlIlll[0]];
                                        strArr23[llIlIlll[1]] = llIlIIll[llIlIlll[97]];
                                        TileObjects.getNearest(strArr23).interact(llIlIIll[llIlIlll[98]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIllIlIlIIl(Vars.getBit(llIlIlll[74]), llIlIlll[0]) && lIllIlIIIll(Vars.getBit(llIlIlll[80])) && lIllIlIlIIl(Vars.getBit(llIlIlll[75]), llIlIlll[0])) {
                                if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[99]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(llIlIlll[0]);
                                    "".length();
                                }
                                if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[100]];
                                    String[] strArr24 = new String[llIlIlll[0]];
                                    strArr24[llIlIlll[1]] = llIlIIll[llIlIlll[101]];
                                    TileObjects.getNearest(strArr24).interact(llIlIIll[llIlIlll[102]]);
                                    Time.sleepTicks(llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (lIllIlIIIll(Vars.getBit(llIlIlll[74])) && lIllIlIIIll(Vars.getBit(llIlIlll[80])) && lIllIlIlIIl(Vars.getBit(llIlIlll[75]), llIlIlll[0]) && lIllIlIIIll(Vars.getBit(llIlIlll[103])) && lIllIlIIIll(bG() ? 1 : 0)) {
                                if (lIllIlIIIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIllIlIIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint10 = new WorldPoint(llIlIlll[104], llIlIlll[84], llIlIlll[1]);
                                        if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[105]];
                                            Movement.walkTo(worldPoint10);
                                            "".length();
                                            Time.sleepTicks(llIlIlll[0]);
                                            "".length();
                                        }
                                        if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            String[] strArr25 = new String[llIlIlll[0]];
                                            strArr25[llIlIlll[1]] = llIlIIll[llIlIlll[106]];
                                            TileObjects.getNearest(strArr25).interact(llIlIIll[llIlIlll[107]]);
                                            Time.sleepTicks(llIlIlll[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIllIlIIIIl(new WorldArea(llIlIlll[72], llIlIlll[69], llIlIlll[14], llIlIlll[14], llIlIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIIll(bG() ? 1 : 0)) {
                                        WorldPoint worldPoint11 = new WorldPoint(llIlIlll[108], llIlIlll[109], llIlIlll[1]);
                                        if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[110]];
                                            Movement.walkTo(worldPoint11);
                                            "".length();
                                            Time.sleepTicks(llIlIlll[0]);
                                            "".length();
                                        }
                                        if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            String[] strArr26 = new String[llIlIlll[0]];
                                            strArr26[llIlIlll[1]] = llIlIIll[llIlIlll[111]];
                                            TileObjects.getNearest(strArr26).interact(llIlIIll[llIlIlll[112]]);
                                            Time.sleepTicks(llIlIlll[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIllIlIIIIl(new WorldArea(llIlIlll[70], llIlIlll[69], llIlIlll[14], llIlIlll[14], llIlIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint12 = new WorldPoint(llIlIlll[67], llIlIlll[113], llIlIlll[1]);
                                        if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            AccBuilderBarrows.c = llIlIIll[llIlIlll[114]];
                                            Movement.walkTo(worldPoint12);
                                            "".length();
                                            Time.sleepTicks(llIlIlll[0]);
                                            "".length();
                                        }
                                        if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            String[] strArr27 = new String[llIlIlll[0]];
                                            strArr27[llIlIlll[1]] = llIlIIll[llIlIlll[115]];
                                            TileObjects.getNearest(strArr27).interact(llIlIIll[llIlIlll[116]]);
                                            Time.sleepTicks(llIlIlll[8]);
                                            "".length();
                                        }
                                    }
                                }
                                if (lIllIlIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIIll(bG() ? 1 : 0)) {
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[117]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[118]];
                                        String[] strArr28 = new String[llIlIlll[0]];
                                        strArr28[llIlIlll[1]] = llIlIIll[llIlIlll[119]];
                                        TileObjects.getNearest(strArr28).interact(llIlIIll[llIlIlll[120]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIllIlIIIll(Vars.getBit(llIlIlll[74])) && lIllIlIIIll(Vars.getBit(llIlIlll[80])) && lIllIlIlIIl(Vars.getBit(llIlIlll[75]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[103]), llIlIlll[0]) && lIllIlIIIll(Vars.getBit(llIlIlll[121]))) {
                                if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[122]];
                                    Movement.walkTo(worldPoint7);
                                    "".length();
                                    Time.sleepTicks(llIlIlll[0]);
                                    "".length();
                                }
                                if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[123]];
                                    String[] strArr29 = new String[llIlIlll[0]];
                                    strArr29[llIlIlll[1]] = llIlIIll[llIlIlll[124]];
                                    TileObjects.getNearest(strArr29).interact(llIlIIll[llIlIlll[125]]);
                                    Time.sleepTicks(llIlIlll[8]);
                                    "".length();
                                }
                            }
                            if (lIllIlIIIll(Vars.getBit(llIlIlll[74])) && lIllIlIIIll(Vars.getBit(llIlIlll[80])) && lIllIlIlIIl(Vars.getBit(llIlIlll[75]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[103]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[121]), llIlIlll[0]) && lIllIlIIIll(Vars.getBit(llIlIlll[126]))) {
                                WorldArea worldArea7 = new WorldArea(llIlIlll[72], llIlIlll[71], llIlIlll[14], llIlIlll[14], llIlIlll[1]);
                                if (lIllIlIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint13 = new WorldPoint(llIlIlll[127], llIlIlll[66], llIlIlll[1]);
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[128]];
                                        Movement.walkTo(worldPoint13);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        String[] strArr30 = new String[llIlIlll[0]];
                                        strArr30[llIlIlll[1]] = llIlIIll[llIlIlll[129]];
                                        TileObjects.getNearest(strArr30).interact(llIlIIll[llIlIlll[130]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (lIllIlIIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint14 = new WorldPoint(llIlIlll[131], llIlIlll[66], llIlIlll[1]);
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[132]];
                                        Movement.walkTo(worldPoint14);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        String[] strArr31 = new String[llIlIlll[0]];
                                        strArr31[llIlIlll[1]] = llIlIIll[llIlIlll[133]];
                                        TileObjects.getNearest(strArr31).interact(llIlIIll[llIlIlll[134]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (lIllIlIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[135]];
                                    String[] strArr32 = new String[llIlIlll[0]];
                                    strArr32[llIlIlll[1]] = llIlIIll[llIlIlll[136]];
                                    TileObjects.getNearest(strArr32).interact(llIlIIll[llIlIlll[137]]);
                                    Time.sleepTicks(llIlIlll[16]);
                                    "".length();
                                }
                            }
                            if (lIllIlIIIll(Vars.getBit(llIlIlll[74])) && lIllIlIIIll(Vars.getBit(llIlIlll[80])) && lIllIlIlIIl(Vars.getBit(llIlIlll[75]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[103]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[121]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[126]), llIlIlll[0])) {
                                WorldArea worldArea8 = new WorldArea(llIlIlll[72], llIlIlll[71], llIlIlll[14], llIlIlll[14], llIlIlll[1]);
                                if (lIllIlIIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint15 = new WorldPoint(llIlIlll[138], llIlIlll[66], llIlIlll[1]);
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[139]];
                                        Movement.walkTo(worldPoint15);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        String[] strArr33 = new String[llIlIlll[0]];
                                        strArr33[llIlIlll[1]] = llIlIIll[llIlIlll[140]];
                                        TileObjects.getNearest(strArr33).interact(llIlIIll[llIlIlll[141]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (lIllIlIIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint16 = new WorldPoint(llIlIlll[108], llIlIlll[66], llIlIlll[1]);
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[142]];
                                        Movement.walkTo(worldPoint16);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        String[] strArr34 = new String[llIlIlll[0]];
                                        strArr34[llIlIlll[1]] = llIlIIll[llIlIlll[143]];
                                        TileObjects.getNearest(strArr34).interact(llIlIIll[llIlIlll[144]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (lIllIlIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[145]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[146]];
                                        String[] strArr35 = new String[llIlIlll[0]];
                                        strArr35[llIlIlll[1]] = llIlIIll[llIlIlll[147]];
                                        TileObjects.getNearest(strArr35).interact(llIlIIll[llIlIlll[148]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIllIlIIIll(Vars.getBit(llIlIlll[74])) && lIllIlIIIll(Vars.getBit(llIlIlll[80])) && lIllIlIlIIl(Vars.getBit(llIlIlll[75]), llIlIlll[0]) && lIllIlIIIll(Vars.getBit(llIlIlll[103])) && lIllIlIlIIl(Vars.getBit(llIlIlll[121]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[126]), llIlIlll[0])) {
                                WorldArea worldArea9 = new WorldArea(llIlIlll[72], llIlIlll[71], llIlIlll[14], llIlIlll[14], llIlIlll[1]);
                                if (lIllIlIIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint17 = new WorldPoint(llIlIlll[127], llIlIlll[66], llIlIlll[1]);
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[149]];
                                        Movement.walkTo(worldPoint17);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        String[] strArr36 = new String[llIlIlll[0]];
                                        strArr36[llIlIlll[1]] = llIlIIll[llIlIlll[150]];
                                        TileObjects.getNearest(strArr36).interact(llIlIIll[llIlIlll[151]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (lIllIlIIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint18 = new WorldPoint(llIlIlll[104], llIlIlll[152], llIlIlll[1]);
                                    if (lIllIlIIIll(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        AccBuilderBarrows.c = llIlIIll[llIlIlll[153]];
                                        Movement.walkTo(worldPoint18);
                                        "".length();
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                    }
                                    if (lIllIlIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        Time.sleepTicks(llIlIlll[0]);
                                        "".length();
                                        String[] strArr37 = new String[llIlIlll[0]];
                                        strArr37[llIlIlll[1]] = llIlIIll[llIlIlll[154]];
                                        TileObjects.getNearest(strArr37).interact(llIlIIll[llIlIlll[155]]);
                                        Time.sleepTicks(llIlIlll[8]);
                                        "".length();
                                    }
                                }
                                if (lIllIlIIIIl(new WorldArea(llIlIlll[72], llIlIlll[69], llIlIlll[14], llIlIlll[14], llIlIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIlIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderBarrows.c = llIlIIll[llIlIlll[156]];
                                    Time.sleepTicks(llIlIlll[0]);
                                    "".length();
                                    int[] iArr18 = new int[llIlIlll[0]];
                                    iArr18[llIlIlll[1]] = llIlIlll[157];
                                    TileObjects.getNearest(iArr18).interact(llIlIIll[llIlIlll[158]]);
                                    Time.sleepTicks(llIlIlll[8]);
                                    "".length();
                                }
                                if (lIllIlIIIIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] iArr19 = new int[llIlIlll[0]];
                                    iArr19[llIlIlll[1]] = llIlIlll[159];
                                    TileObjects.getNearest(iArr19).interact(llIlIIll[llIlIlll[160]]);
                                    Time.sleepTicks(llIlIlll[8]);
                                    "".length();
                                }
                                if (lIllIlIIIIl(new WorldArea(llIlIlll[161], llIlIlll[162], llIlIlll[23], llIlIlll[14], llIlIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr38 = new String[llIlIlll[0]];
                                    strArr38[llIlIlll[1]] = llIlIIll[llIlIlll[163]];
                                    if (lIllIlIIIll(Inventory.contains(strArr38) ? 1 : 0)) {
                                        String[] strArr39 = new String[llIlIlll[0]];
                                        strArr39[llIlIlll[1]] = llIlIIll[llIlIlll[164]];
                                        TileItems.getNearest(strArr39).interact(llIlIIll[llIlIlll[165]]);
                                        Time.sleepTicks(llIlIlll[14]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr40 = new String[llIlIlll[0]];
                strArr40[llIlIlll[1]] = llIlIIll[llIlIlll[166]];
                if (lIllIlIIIIl(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[llIlIlll[0]];
                    strArr41[llIlIlll[1]] = llIlIIll[llIlIlll[167]];
                    if (lIllIlIIIIl(Inventory.contains(strArr41) ? 1 : 0)) {
                        if (lIllIlIIIIl(new WorldArea(llIlIlll[161], llIlIlll[162], llIlIlll[23], llIlIlll[14], llIlIlll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[llIlIlll[0]];
                            iArr20[llIlIlll[1]] = llIlIlll[159];
                            TileObjects.getNearest(iArr20).interact(llIlIIll[llIlIlll[168]]);
                            Time.sleepTicks(llIlIlll[14]);
                            "".length();
                        }
                        if (lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                            AccBuilderBarrows.c = llIlIIll[llIlIlll[169]];
                            Movement.walkTo(hT);
                            "".length();
                            Time.sleepTicks(llIlIlll[0]);
                            "".length();
                        }
                        if (lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject -> {
                                if (lIllIlIIIIl(tileObject.getName().contains(llIlIIll[llIlIlll[185]]) ? 1 : 0)) {
                                    String[] strArr42 = new String[llIlIlll[0]];
                                    strArr42[llIlIlll[1]] = llIlIIll[llIlIlll[186]];
                                    if (lIllIlIIIIl(tileObject.hasAction(strArr42) ? 1 : 0) && lIllIlIlIII(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlll[21], llIlIlll[184], llIlIlll[3])), llIlIlll[3])) {
                                        ?? r0 = llIlIlll[0];
                                        "".length();
                                        return (-(186 ^ 190)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                                return llIlIlll[1];
                            });
                            if (lIllIlIIlII(nearest3)) {
                                nearest3.interact(llIlIIll[llIlIlll[170]]);
                                Time.sleepTicks(llIlIlll[8]);
                                "".length();
                            }
                            if (lIllIlIlIll(nearest3)) {
                                C0006g.a(llIlIIll[llIlIlll[171]], bX, llIlIlll[0]);
                            }
                        }
                    }
                }
            }
            if (lIllIlIlIIl(C0004e.j(hU), llIlIlll[3])) {
                if (lIllIlIIlll(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                    AccBuilderBarrows.c = llIlIIll[llIlIlll[172]];
                    Movement.walkTo(hT);
                    "".length();
                    Time.sleepTicks(llIlIlll[0]);
                    "".length();
                }
                if (lIllIlIlIII(Players.getLocal().getWorldLocation().distanceTo(hT), llIlIlll[10])) {
                    TileObject nearest4 = TileObjects.getNearest(tileObject2 -> {
                        if (lIllIlIIIIl(tileObject2.getName().contains(llIlIIll[llIlIlll[182]]) ? 1 : 0)) {
                            String[] strArr42 = new String[llIlIlll[0]];
                            strArr42[llIlIlll[1]] = llIlIIll[llIlIlll[183]];
                            if (lIllIlIIIIl(tileObject2.hasAction(strArr42) ? 1 : 0) && lIllIlIlIII(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llIlIlll[21], llIlIlll[184], llIlIlll[3])), llIlIlll[3])) {
                                ?? r0 = llIlIlll[0];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return llIlIlll[1];
                    });
                    if (lIllIlIIlII(nearest4)) {
                        nearest4.interact(llIlIIll[llIlIlll[173]]);
                        Time.sleepTicks(llIlIlll[8]);
                        "".length();
                    }
                    if (lIllIlIlIll(nearest4)) {
                        if (lIllIlIIIlI(ci, llIlIlll[0])) {
                            Q.mx += llIlIlll[0];
                            Q.o(AccBuilderBarrows.m);
                            ci += llIlIlll[0];
                            Q.mx = llIlIlll[1];
                            cj = llIlIlll[1];
                        }
                        C0006g.a(llIlIIll[llIlIlll[174]], bX, llIlIlll[0]);
                    }
                }
            }
            C0006g.a(bX);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llIlIlll[1];
    }

    private static boolean lIllIlIlIll(Object obj) {
        return obj == null;
    }

    private static void lIllIIllIll() {
        llIlIIll = new String[llIlIlll[197]];
        llIlIIll[llIlIlll[1]] = lIlIllllIII("CColLRsmJi9kCjs6IioPbio/IQU9b2s3Hyc3KCwBICRrJgktKGswB24yPiEbOg==", "NCKDh");
        llIlIIll[llIlIlll[0]] = lIlIllllIIl("jQt0D+Hb58gVXMrJcYyPfg==", "IvYvz");
        llIlIIll[llIlIlll[3]] = lIlIllllIII("MioMKBYTJQVsGBslCSUUHQ==", "zKbLz");
        llIlIIll[llIlIlll[8]] = lIlIllllIlI("gDxcF+dNtM15b4n0NLBU0rKfVSm48IpKZOLrneQCxvJb6J16e2V+2w24MmANbAN8mhtCpM+3zcA=", "YBUjS");
        llIlIIll[llIlIlll[4]] = lIlIllllIIl("7G1S6/gnShI=", "IQQos");
        llIlIIll[llIlIlll[14]] = lIlIllllIlI("Vuw1mc0WgrI=", "kVTup");
        llIlIIll[llIlIlll[17]] = lIlIllllIlI("4ufZbDkAY4CSxPZEsv5VVQ==", "NWaLp");
        llIlIIll[llIlIlll[18]] = lIlIllllIlI("e59qE6sORtfEDMismdEy/g==", "yrqRv");
        llIlIIll[llIlIlll[16]] = lIlIllllIlI("sZ126CZE42Prp+d6UZujGA==", "jVmjB");
        llIlIIll[llIlIlll[20]] = lIlIllllIII("HgA4", "UeAMB");
        llIlIIll[llIlIlll[10]] = lIlIllllIIl("C+N34LjtIrn2VF4fjBRdamfdwm9jRYN2", "cXqvX");
        llIlIIll[llIlIlll[23]] = lIlIllllIIl("LZVy/AHt6EKjlgzLOe+z72zcJZnFbqMC", "zvYqd");
        llIlIIll[llIlIlll[24]] = lIlIllllIIl("Frwc17uljZfGGV3ZhBdujw==", "ZKbaA");
        llIlIIll[llIlIlll[25]] = lIlIllllIII("HiQ8NQ==", "JEWPr");
        llIlIIll[llIlIlll[26]] = lIlIllllIII("PywlIxcVbT4lEAEiIGofGz4mah8dIio=", "rMNJy");
        llIlIIll[llIlIlll[27]] = lIlIllllIIl("F/PuQIT4Z9E=", "WLlTx");
        llIlIIll[llIlIlll[28]] = lIlIllllIlI("PrVR2K5t4Go/wcKPqBI6hg==", "bxeCK");
        llIlIIll[llIlIlll[29]] = lIlIllllIlI("5tIZhSQpM5A=", "UZQuU");
        llIlIIll[llIlIlll[30]] = lIlIllllIlI("pW5OHwLPxBAy9PQi71yt+A==", "lGCNn");
        llIlIIll[llIlIlll[31]] = lIlIllllIIl("fTgeUE29Hro=", "QVoaa");
        llIlIIll[llIlIlll[32]] = lIlIllllIIl("xMxMh1ZDMI0=", "GYtVL");
        llIlIIll[llIlIlll[33]] = lIlIllllIIl("v+r26S5LyuOFRC/NBvilLQ==", "CVfIb");
        llIlIIll[llIlIlll[34]] = lIlIllllIlI("yHPFBxfR0lFCu7wnLAs3ZA==", "QGWIh");
        llIlIIll[llIlIlll[35]] = lIlIllllIIl("7OVyuYLWhto=", "FiVgS");
        llIlIIll[llIlIlll[36]] = lIlIllllIII("IxEfBAcGER9XExIWHRI=", "sczwt");
        llIlIIll[llIlIlll[37]] = lIlIllllIlI("fTaWHrv6XKz8qdnoLU3FAA==", "KKtMr");
        llIlIIll[llIlIlll[38]] = lIlIllllIII("IQAGCBoGBh0=", "gosfn");
        llIlIIll[llIlIlll[39]] = lIlIllllIlI("uoEE/6fgGpg=", "mYAaq");
        llIlIIll[llIlIlll[40]] = lIlIllllIlI("PpfSvfj33L4=", "OYHDW");
        llIlIIll[llIlIlll[41]] = lIlIllllIlI("XV3hoi+XMF7kGiTuJXbT6w==", "tHOvM");
        llIlIIll[llIlIlll[42]] = lIlIllllIIl("fctHWTgDDn1KJxJ2KgX4gA==", "xSCrr");
        llIlIIll[llIlIlll[46]] = lIlIllllIIl("OoXjWah0pOpIQ8IisxPukg==", "JqtJs");
        llIlIIll[llIlIlll[47]] = lIlIllllIIl("+Vg23QA1CgI=", "BImat");
        llIlIIll[llIlIlll[48]] = lIlIllllIII("DAgrAg==", "CxNlh");
        llIlIIll[llIlIlll[49]] = lIlIllllIIl("g5GJAPmlyGvB3/qVZzuyLA==", "PTjqS");
        llIlIIll[llIlIlll[50]] = lIlIllllIlI("+LULHUlXhmn2ZrHdvQ2Jww==", "hNdlq");
        llIlIIll[llIlIlll[51]] = lIlIllllIII("GSg5Fw==", "MIRrV");
        llIlIIll[llIlIlll[52]] = lIlIllllIIl("pciKp3NwRrJtqP2c6oJxCA==", "lWCgq");
        llIlIIll[llIlIlll[53]] = lIlIllllIII("HwEPTwkxBg==", "Phcoj");
        llIlIIll[llIlIlll[56]] = lIlIllllIII("KDkIKg==", "lVgXB");
        llIlIIll[llIlIlll[57]] = lIlIllllIlI("/RCXj+oFC7s=", "Mfslo");
        llIlIIll[llIlIlll[58]] = lIlIllllIlI("Y8E4hMhKt/VY6OduI+IvJJJJVrD8Y2SY", "UXLyU");
        llIlIIll[llIlIlll[59]] = lIlIllllIlI("raGDm9FKIf8=", "qxPde");
        llIlIIll[llIlIlll[60]] = lIlIllllIIl("XErEygWjk3LZs9Z1koBSXA==", "haYfj");
        llIlIIll[llIlIlll[76]] = lIlIllllIIl("+sBgie0Cs3T/NBhjvngaRQ==", "ZODZq");
        llIlIIll[llIlIlll[77]] = lIlIllllIIl("UOkNTIJ7USFsQ1oyumGOug==", "SvpbN");
        llIlIIll[llIlIlll[78]] = lIlIllllIII("ND0YLSFYGQ==", "xXnHS");
        llIlIIll[llIlIlll[79]] = lIlIllllIII("AzQjCw==", "SAOgW");
        llIlIIll[llIlIlll[81]] = lIlIllllIII("BTsycDskeiY=", "KZDPO");
        llIlIIll[llIlIlll[82]] = lIlIllllIlI("VIiXRU/3K7PjqfQOjcEoDQ==", "LKhoG");
        llIlIIll[llIlIlll[15]] = lIlIllllIIl("ZWbrf35kA2A=", "LEvnH");
        llIlIIll[llIlIlll[83]] = lIlIllllIlI("SeehXlS+gNw=", "YSoXa");
        llIlIIll[llIlIlll[85]] = lIlIllllIlI("VUunmXCsXRTNYZ/dq9cvGA==", "UOTlG");
        llIlIIll[llIlIlll[86]] = lIlIllllIIl("O2ZZaNPXLbM=", "EBoFw");
        llIlIIll[llIlIlll[87]] = lIlIllllIlI("vJQBuPKbWhk=", "jVnhT");
        llIlIIll[llIlIlll[88]] = lIlIllllIII("MyYoDlUPNjIHBw==", "cSDbu");
        llIlIIll[llIlIlll[89]] = lIlIllllIII("Jz0GHRxLHA==", "kXpxn");
        llIlIIll[llIlIlll[90]] = lIlIllllIlI("Dr1UBGQ+PSs=", "DloQn");
        llIlIIll[llIlIlll[92]] = lIlIllllIII("LzoVFXYWOkMUOQ0n", "bUcpV");
        llIlIIll[llIlIlll[93]] = lIlIllllIlI("d2wJMVBzn4k=", "rrHYM");
        llIlIIll[llIlIlll[94]] = lIlIllllIlI("36wHih/hEkI=", "VvnQg");
        llIlIIll[llIlIlll[95]] = lIlIllllIlI("8CaIuuY2mOF90PDVhPjZdg==", "vfQXX");
        llIlIIll[llIlIlll[96]] = lIlIllllIII("KjchAFEWJzsJAw==", "zBMlq");
        llIlIIll[llIlIlll[97]] = lIlIllllIlI("HsnCmVEzU40=", "lgNXf");
        llIlIIll[llIlIlll[98]] = lIlIllllIlI("U+8D17Mya6w=", "tqObP");
        llIlIIll[llIlIlll[99]] = lIlIllllIII("JTkFcRMEeBI=", "kXsQg");
        llIlIIll[llIlIlll[100]] = lIlIllllIII("NgQiPmgKFDg3Og==", "fqNRH");
        llIlIIll[llIlIlll[101]] = lIlIllllIIl("pb9vUxxJtT8=", "IpJOD");
        llIlIIll[llIlIlll[102]] = lIlIllllIIl("VkIUTg/QqVA=", "QlNla");
        llIlIIll[llIlIlll[105]] = lIlIllllIIl("6LaC1PDsryCeE1M6p859og==", "qFCQN");
        llIlIIll[llIlIlll[106]] = lIlIllllIlI("2OzULFaXWQQ=", "wlMOg");
        llIlIIll[llIlIlll[107]] = lIlIllllIlI("jZhOuG+gsFQ=", "bwaVs");
        llIlIIll[llIlIlll[110]] = lIlIllllIIl("XUFHkaIUgS59REzvuVLSjg==", "EeojF");
        llIlIIll[llIlIlll[111]] = lIlIllllIII("BSkMHA==", "AFcnQ");
        llIlIIll[llIlIlll[112]] = lIlIllllIIl("yBBpuT2K008=", "udDso");
        llIlIIll[llIlIlll[114]] = lIlIllllIII("Kw0gA0kSDXYCBgkQ", "fbVfi");
        llIlIIll[llIlIlll[115]] = lIlIllllIlI("6Nh3gYnYjIg=", "sZQsO");
        llIlIIll[llIlIlll[116]] = lIlIllllIII("BQEdLA==", "JqxBq");
        llIlIIll[llIlIlll[117]] = lIlIllllIII("ITkERgAAeBc=", "oXrft");
        llIlIIll[llIlIlll[118]] = lIlIllllIlI("zGGJlXETK3A4ZfbJNcHAEg==", "Kscum");
        llIlIIll[llIlIlll[119]] = lIlIllllIII("JBMwMjZIMw==", "hvFWD");
        llIlIIll[llIlIlll[120]] = lIlIllllIIl("jqMND+gQMYM=", "BAzTi");
        llIlIIll[llIlIlll[122]] = lIlIllllIII("JTE+WBYEcC4=", "kPHxb");
        llIlIIll[llIlIlll[123]] = lIlIllllIlI("urQkDOpS0Y2s1SzK322RXA==", "LdKbq");
        llIlIIll[llIlIlll[124]] = lIlIllllIlI("RbMEo1hyZ6o=", "cmDNM");
        llIlIIll[llIlIlll[125]] = lIlIllllIII("IAwFCw==", "pyigy");
        llIlIIll[llIlIlll[128]] = lIlIllllIlI("T7dyh5ZVI8s4CmlUs65atg==", "dMuBZ");
        llIlIIll[llIlIlll[129]] = lIlIllllIlI("AeQ1QFyocBc=", "kXzGn");
        llIlIIll[llIlIlll[130]] = lIlIllllIIl("4qdqIc4KwkI=", "mAITm");
        llIlIIll[llIlIlll[132]] = lIlIllllIlI("RB5LIqxvNfG8qyVBvGAj4w==", "zJyYw");
        llIlIIll[llIlIlll[133]] = lIlIllllIlI("gNE3EVKWkhY=", "eaggl");
        llIlIIll[llIlIlll[134]] = lIlIllllIlI("22imJoT250w=", "YhYHA");
        llIlIIll[llIlIlll[135]] = lIlIllllIIl("/ApCOOVS6Ceo/3evcdVARA==", "vppXw");
        llIlIIll[llIlIlll[136]] = lIlIllllIII("HDMzAgNwFQ==", "PVEgq");
        llIlIIll[llIlIlll[137]] = lIlIllllIlI("x93nQC18zZU=", "mLUjx");
        llIlIIll[llIlIlll[139]] = lIlIllllIII("AgUsLGo7BXotJSAY", "OjZIJ");
        llIlIIll[llIlIlll[140]] = lIlIllllIlI("H3spY2xtl5A=", "tkZEH");
        llIlIIll[llIlIlll[141]] = lIlIllllIlI("g+udZyFdTvU=", "wMdma");
        llIlIIll[llIlIlll[142]] = lIlIllllIII("BQgOLms8CFgvJCcV", "HgxKK");
        llIlIIll[llIlIlll[143]] = lIlIllllIII("HQY2JA==", "YiYVN");
        llIlIIll[llIlIlll[144]] = lIlIllllIlI("3F5+LB5Zlh8=", "pTBhf");
        llIlIIll[llIlIlll[145]] = lIlIllllIII("GREgVRs4UDM=", "WpVuo");
        llIlIIll[llIlIlll[146]] = lIlIllllIIl("IZKkzIKZWOCNsyx629kXjw==", "KVMOE");
        llIlIIll[llIlIlll[147]] = lIlIllllIIl("FcrqIOdkqxA=", "TkXSA");
        llIlIIll[llIlIlll[148]] = lIlIllllIIl("fWbmqR5tsE0=", "kPnvH");
        llIlIIll[llIlIlll[149]] = lIlIllllIlI("rKp8LaraWd2Ap6Eor7t4Jg==", "JQnpH");
        llIlIIll[llIlIlll[150]] = lIlIllllIlI("OZVxBbCySGw=", "PpoFZ");
        llIlIIll[llIlIlll[151]] = lIlIllllIIl("jlPv7NctA94=", "ZZpTD");
        llIlIIll[llIlIlll[153]] = lIlIllllIlI("B+wvz10ZfYm/MY59VTLpJQ==", "NVfKP");
        llIlIIll[llIlIlll[154]] = lIlIllllIIl("2z5K1hfijzo=", "jaIvN");
        llIlIIll[llIlIlll[155]] = lIlIllllIlI("etBwcNl2QEE=", "pGvwh");
        llIlIIll[llIlIlll[156]] = lIlIllllIIl("Zv5lLE7rJwgsi+2BZLKi9Q==", "uRbSF");
        llIlIIll[llIlIlll[158]] = lIlIllllIII("KikBAQ==", "eYdoq");
        llIlIIll[llIlIlll[160]] = lIlIllllIII("CCEuLw==", "GQKAP");
        llIlIIll[llIlIlll[163]] = lIlIllllIlI("NADmhdt6B8Q=", "nvNGB");
        llIlIIll[llIlIlll[164]] = lIlIllllIII("DS8ubQwjKA==", "BFBMo");
        llIlIIll[llIlIlll[165]] = lIlIllllIlI("3mg7VfXtwTY=", "fZeRb");
        llIlIIll[llIlIlll[166]] = lIlIllllIII("IBkJOAsATB8vDBc=", "rlkZn");
        llIlIIll[llIlIlll[167]] = lIlIllllIlI("LILYQo1nu1k=", "GiUIV");
        llIlIIll[llIlIlll[168]] = lIlIllllIII("KiUyGg==", "eUWtY");
        llIlIIll[llIlIlll[169]] = lIlIllllIIl("fGdjecGF19Z/TtoXDnro8Dr7Bd5Tzmot", "BMMsi");
        llIlIIll[llIlIlll[170]] = lIlIllllIIl("/0AO566pooE=", "eqqLQ");
        llIlIIll[llIlIlll[171]] = lIlIllllIII("OzUNAxcYNA0XUiQjBgAcGDMHDBw=", "kGber");
        llIlIIll[llIlIlll[172]] = lIlIllllIIl("kb4NM5yI3mmrtlyHYygDofJbNyb41/h7", "TaEXp");
        llIlIIll[llIlIlll[173]] = lIlIllllIlI("Y/1cHNwWUC4=", "nZubu");
        llIlIIll[llIlIlll[174]] = lIlIllllIIl("VMCupC6ZNEpchzY0nKDBIhjMjKpOJ+7q", "LJgdZ");
        llIlIIll[llIlIlll[180]] = lIlIllllIlI("E0kZaT6brMsXXB+nLb3wUAXR8ZyjcXVY", "vDwNY");
        llIlIIll[llIlIlll[181]] = lIlIllllIlI("TMfU7B5YPxWR8BI10tiIRDaOVVmG/GO/", "WHXWo");
        llIlIIll[llIlIlll[182]] = lIlIllllIIl("qJtEeCmzt6A=", "ckoma");
        llIlIIll[llIlIlll[183]] = lIlIllllIlI("5lyg7jgZZJs=", "dzvam");
        llIlIIll[llIlIlll[185]] = lIlIllllIlI("WUvWXgsRUH8=", "DJIei");
        llIlIIll[llIlIlll[186]] = lIlIllllIII("GjMBBQ==", "UCdkf");
        llIlIIll[llIlIlll[193]] = lIlIllllIlI("qJDHruvHmxY=", "tsnup");
        llIlIIll[llIlIlll[194]] = lIlIllllIII("MHUVSz0WPRMCPx5yHgQjWTNYDCQAchsKPRU3HEsUCzwdGCVX", "yRxkQ");
        llIlIIll[llIlIlll[195]] = lIlIllllIlI("ko21TuB97D3dh1Pb2gl2Xc/WN7y+aCSXHSuCNxx9Q+/niz3URlQf2MX6+9dGM0HYfgjpgCQfb3y/69y5655QIg==", "EoTZe");
    }

    private static boolean lIllIlIlIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIllIlIllII(C0004e.j(llIlIlll[47]), llIlIlll[8])) {
            ?? r0 = llIlIlll[0];
            "".length();
            return "  ".length() >= "   ".length() ? ((61 ^ 44) ^ (81 ^ 90)) & (((64 ^ 57) ^ (224 ^ 131)) ^ (-" ".length())) : r0;
        }
        return llIlIlll[1];
    }

    private static boolean lIllIlIIlll(int i, int i2) {
        return i > i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            bF();
            "".length();
            if ("   ".length() == 0) {
                return ((77 ^ 75) ^ (195 ^ 148)) & (((129 ^ 134) ^ (73 ^ 31)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlIlll[144];
    }

    private static String lIlIllllIlI(String lIlIIlIIlllIIII, String lIlIIlIIllIllll) {
        try {
            SecretKeySpec lIlIIlIIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIlIIllIllll.getBytes(StandardCharsets.UTF_8)), llIlIlll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlll[3], lIlIIlIIlllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIlIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlIIlllIIIl) {
            lIlIIlIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static int lIllIIlllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIllIIlllII() {
        llIlIlll = new int[198];
        llIlIlll[0] = " ".length();
        llIlIlll[1] = (169 ^ 158) & ((59 ^ 12) ^ (-1));
        llIlIlll[2] = (-2135) & 7134;
        llIlIlll[3] = "  ".length();
        llIlIlll[4] = (211 ^ 199) ^ (8 ^ 24);
        llIlIlll[5] = (-16425) & 24431;
        llIlIlll[6] = (-((-3157) & 12149)) & (-1) & 28607;
        llIlIlll[7] = (-24641) & 25592;
        llIlIlll[8] = "   ".length();
        llIlIlll[9] = (-((-273) & 24413)) & (-8195) & 32607;
        llIlIlll[10] = 152 ^ 146;
        llIlIlll[11] = (-((-2330) & 32767)) & (-11) & 30719;
        llIlIlll[12] = (-16933) & 29557;
        llIlIlll[13] = (-((-877) & 29677)) & (-2565) & 31743;
        llIlIlll[14] = (((111 + 49) - 45) + 58) ^ (((152 + 2) - 62) + 76);
        llIlIlll[15] = 70 ^ 116;
        llIlIlll[16] = 155 ^ 147;
        llIlIlll[17] = (252 ^ 176) ^ (242 ^ 184);
        llIlIlll[18] = (51 ^ 93) ^ (197 ^ 172);
        llIlIlll[19] = (-673) & 946;
        llIlIlll[20] = 30 ^ 23;
        llIlIlll[21] = (-24769) & 27876;
        llIlIlll[22] = (-((-1109) & 25815)) & (-577) & 28639;
        llIlIlll[23] = 156 ^ 151;
        llIlIlll[24] = (((27 + 82) - 31) + 108) ^ (((19 + 49) - (-25)) + 89);
        llIlIlll[25] = 103 ^ 106;
        llIlIlll[26] = ((151 ^ 174) & ((170 ^ 147) ^ (-1))) ^ (32 ^ 46);
        llIlIlll[27] = (((166 + 138) - 258) + 157) ^ (((74 + 165) - 174) + 131);
        llIlIlll[28] = 32 ^ 48;
        llIlIlll[29] = 107 ^ 122;
        llIlIlll[30] = 7 ^ 21;
        llIlIlll[31] = (((147 + 28) - 81) + 72) ^ (((117 + 34) - 73) + 103);
        llIlIlll[32] = 178 ^ 166;
        llIlIlll[33] = 16 ^ 5;
        llIlIlll[34] = 136 ^ 158;
        llIlIlll[35] = 80 ^ 71;
        llIlIlll[36] = 174 ^ 182;
        llIlIlll[37] = 182 ^ 175;
        llIlIlll[38] = 116 ^ 110;
        llIlIlll[39] = 110 ^ 117;
        llIlIlll[40] = (((85 + 50) - 90) + 136) ^ (((149 + 90) - 168) + 98);
        llIlIlll[41] = (84 ^ 70) ^ (156 ^ 147);
        llIlIlll[42] = (13 ^ 41) ^ (10 ^ 48);
        llIlIlll[43] = (-((-1285) & 30173)) & (-257) & 32251;
        llIlIlll[44] = (-21201) & 24567;
        llIlIlll[45] = (-12378) & 15743;
        llIlIlll[46] = (((124 + 115) - 200) + 102) ^ (((58 + 122) - 116) + 82);
        llIlIlll[47] = (140 ^ 162) ^ (140 ^ 130);
        llIlIlll[48] = (171 ^ 183) ^ (32 ^ 29);
        llIlIlll[49] = 138 ^ 168;
        llIlIlll[50] = 96 ^ 67;
        llIlIlll[51] = (150 ^ 184) ^ (94 ^ 84);
        llIlIlll[52] = 101 ^ 64;
        llIlIlll[53] = 114 ^ 84;
        llIlIlll[54] = (-29061) & 32150;
        llIlIlll[55] = (-29377) & 32729;
        llIlIlll[56] = (((24 + 190) - 77) + 54) ^ (((103 + 6) - 68) + 111);
        llIlIlll[57] = 85 ^ 125;
        llIlIlll[58] = (111 ^ 43) ^ (170 ^ 199);
        llIlIlll[59] = (((116 + 158) - 181) + 144) ^ (((104 + 180) - 217) + 132);
        llIlIlll[60] = 33 ^ 10;
        llIlIlll[61] = (-2318) & 12063;
        llIlIlll[62] = (-((-1578) & 9787)) & (-4675) & 15999;
        llIlIlll[63] = (-6209) & 15960;
        llIlIlll[64] = (-24978) & 28087;
        llIlIlll[65] = (-((-945) & 17399)) & (-6297) & 32511;
        llIlIlll[66] = (-(((20 + 134) - 9) + 2)) & (-18689) & 28599;
        llIlIlll[67] = (-((-109) & 29165)) & (-37) & 32189;
        llIlIlll[68] = (-963) & 4067;
        llIlIlll[69] = (-16865) & 26622;
        llIlIlll[70] = (-((-2049) & 23137)) & (-129) & 24311;
        llIlIlll[71] = (-6537) & 16299;
        llIlIlll[72] = (-8354) & 11453;
        llIlIlll[73] = (-20943) & 30687;
        llIlIlll[74] = (-((-9370) & 13723)) & (-24577) & 30717;
        llIlIlll[75] = (-257) & 2047;
        llIlIlll[76] = (75 ^ 48) ^ (82 ^ 5);
        llIlIlll[77] = (71 ^ 72) ^ (91 ^ 121);
        llIlIlll[78] = 88 ^ 118;
        llIlIlll[79] = (((171 + 18) - 115) + 162) ^ (((79 + 106) - 33) + 43);
        llIlIlll[80] = (-((-4303) & 22991)) & (-4099) & 24575;
        llIlIlll[81] = (((68 + 96) - 155) + 140) ^ (((35 + 101) - 7) + 36);
        llIlIlll[82] = 145 ^ 160;
        llIlIlll[83] = (((15 + 32) - 17) + 113) ^ (((3 + 122) - (-29)) + 34);
        llIlIlll[84] = (-((-8195) & 14787)) & (-35) & 16383;
        llIlIlll[85] = (((130 + 143) - 251) + 138) ^ (((48 + 35) - 61) + 126);
        llIlIlll[86] = 133 ^ 176;
        llIlIlll[87] = (117 ^ 110) ^ (150 ^ 187);
        llIlIlll[88] = (((86 + 29) - (-6)) + 39) ^ (((29 + 114) - 55) + 63);
        llIlIlll[89] = 32 ^ 24;
        llIlIlll[90] = 254 ^ 199;
        llIlIlll[91] = (-((-27689) & 32105)) & (-16385) & 30559;
        llIlIlll[92] = 98 ^ 88;
        llIlIlll[93] = 38 ^ 29;
        llIlIlll[94] = (19 ^ 54) ^ (38 ^ 63);
        llIlIlll[95] = (55 ^ 17) ^ (61 ^ 38);
        llIlIlll[96] = (((77 + 24) - (-3)) + 73) ^ (((135 + 2) - 91) + 97);
        llIlIlll[97] = 57 ^ 6;
        llIlIlll[98] = 43 ^ 107;
        llIlIlll[99] = " ".length() ^ (38 ^ 102);
        llIlIlll[100] = 50 ^ 112;
        llIlIlll[101] = (((113 + 208) - 273) + 187) ^ (((161 + 94) - 156) + 69);
        llIlIlll[102] = 83 ^ 23;
        llIlIlll[103] = (-((-16519) & 28815)) & (-18438) & 32525;
        llIlIlll[104] = (-258) & 3359;
        llIlIlll[105] = 230 ^ 163;
        llIlIlll[106] = (142 ^ 133) ^ (8 ^ 69);
        llIlIlll[107] = (17 ^ 20) ^ (248 ^ 186);
        llIlIlll[108] = (-29155) & 32255;
        llIlIlll[109] = (-((-20) & 23007)) & (-21) & 32767;
        llIlIlll[110] = 121 ^ 49;
        llIlIlll[111] = (((75 + 3) - 39) + 104) ^ (((68 + 173) - 136) + 93);
        llIlIlll[112] = 72 ^ 2;
        llIlIlll[113] = (-6422) & 16183;
        llIlIlll[114] = (((202 + 23) - 33) + 34) ^ (((98 + 79) - 137) + 129);
        llIlIlll[115] = 0 ^ 76;
        llIlIlll[116] = 243 ^ 190;
        llIlIlll[117] = (164 ^ 153) ^ (235 ^ 152);
        llIlIlll[118] = 26 ^ 85;
        llIlIlll[119] = (164 ^ 159) ^ (253 ^ 150);
        llIlIlll[120] = (((157 + 168) - 168) + 59) ^ (((37 + 9) - 31) + 122);
        llIlIlll[121] = (-((-9505) & 32171)) & (-8277) & 32735;
        llIlIlll[122] = 215 ^ 133;
        llIlIlll[123] = 17 ^ 66;
        llIlIlll[124] = 222 ^ 138;
        llIlIlll[125] = 87 ^ 2;
        llIlIlll[126] = (-6146) & 7935;
        llIlIlll[127] = (-((-1033) & 21965)) & (-33) & 24063;
        llIlIlll[128] = 208 ^ 134;
        llIlIlll[129] = 205 ^ 154;
        llIlIlll[130] = 225 ^ 185;
        llIlIlll[131] = (-208) & 3311;
        llIlIlll[132] = (((73 + 112) - 18) + 35) ^ (((64 + 54) - 73) + 102);
        llIlIlll[133] = 235 ^ 177;
        llIlIlll[134] = 21 ^ 78;
        llIlIlll[135] = 14 ^ 82;
        llIlIlll[136] = "  ".length() ^ (3 ^ 92);
        llIlIlll[137] = 233 ^ 183;
        llIlIlll[138] = (-12869) & 15974;
        llIlIlll[139] = (((20 + 132) - (-1)) + 72) ^ (((183 + 176) - 288) + 119);
        llIlIlll[140] = (((204 + 230) - 189) + 10) ^ (((17 + 63) - 69) + 148);
        llIlIlll[141] = (((185 + 158) - 279) + 145) ^ (((148 + 49) - 65) + 44);
        llIlIlll[142] = 202 ^ 168;
        llIlIlll[143] = (11 ^ 122) ^ (154 ^ 136);
        llIlIlll[144] = (130 ^ 145) ^ (246 ^ 129);
        llIlIlll[145] = 106 ^ 15;
        llIlIlll[146] = 195 ^ 165;
        llIlIlll[147] = 37 ^ 66;
        llIlIlll[148] = 118 ^ 30;
        llIlIlll[149] = 115 ^ 26;
        llIlIlll[150] = 200 ^ 162;
        llIlIlll[151] = 111 ^ 4;
        llIlIlll[152] = (-((-8257) & 30939)) & (-322) & 32767;
        llIlIlll[153] = (115 ^ 92) ^ (61 ^ 126);
        llIlIlll[154] = 33 ^ 76;
        llIlIlll[155] = (67 ^ 75) ^ (69 ^ 35);
        llIlIlll[156] = 77 ^ 34;
        llIlIlll[157] = ((57 + 51) - 100) + 137;
        llIlIlll[158] = (239 ^ 156) ^ "   ".length();
        llIlIlll[159] = ((3 + 78) - (-7)) + 53;
        llIlIlll[160] = " ".length() ^ (72 ^ 56);
        llIlIlll[161] = (-((-9369) & 30207)) & (-8705) & 32631;
        llIlIlll[162] = (-20805) & 30557;
        llIlIlll[163] = (224 ^ 178) ^ (165 ^ 133);
        llIlIlll[164] = 101 ^ 22;
        llIlIlll[165] = (((8 + 53) - (-107)) + 24) ^ (((151 + 59) - 134) + 104);
        llIlIlll[166] = 119 ^ 2;
        llIlIlll[167] = (129 ^ 175) ^ (33 ^ 121);
        llIlIlll[168] = 28 ^ 107;
        llIlIlll[169] = (111 ^ 98) ^ (219 ^ 174);
        llIlIlll[170] = (237 ^ 179) ^ (176 ^ 151);
        llIlIlll[171] = 228 ^ 158;
        llIlIlll[172] = (((95 + 153) - 116) + 81) ^ (((44 + 66) - (-18)) + 46);
        llIlIlll[173] = 85 ^ 41;
        llIlIlll[174] = 96 ^ 29;
        llIlIlll[175] = (-22620) & 31839;
        llIlIlll[176] = (-((-7770) & 24445)) & (-17) & 28671;
        llIlIlll[177] = (-69) & 25068;
        llIlIlll[178] = (-18513) & 18812;
        llIlIlll[179] = (-((-8212) & 31479)) & (-8193) & 32759;
        llIlIlll[180] = (17 ^ 103) ^ (143 ^ 135);
        llIlIlll[181] = ((30 + 94) - 63) + 66;
        llIlIlll[182] = ((59 + 112) - 105) + 62;
        llIlIlll[183] = (((11 ^ 47) + (47 ^ 54)) - (-(190 ^ 174))) + (183 ^ 131);
        llIlIlll[184] = (-4289) & 7653;
        llIlIlll[185] = (((35 ^ 5) + (103 ^ 112)) - (-(197 ^ 133))) + (99 ^ 102);
        llIlIlll[186] = ((29 + 123) - 41) + 20;
        llIlIlll[187] = (-((-6165) & 15103)) & (-1) & 12267;
        llIlIlll[188] = (-17089) & 20175;
        llIlIlll[189] = (-((-258) & 29583)) & (-3) & 32687;
        llIlIlll[190] = (-4168) & 7503;
        llIlIlll[191] = (-29250) & 32343;
        llIlIlll[192] = (-(((13 + 141) - 123) + 130)) & (-12865) & 16383;
        llIlIlll[193] = ((("  ".length() & ("  ".length() ^ (-1))) + (6 ^ 18)) - (-(91 ^ 101))) + (177 ^ 131);
        llIlIlll[194] = (((231 ^ 189) + (108 ^ 28)) - (((42 + 120) - 50) + 85)) + ((53 + 91) - 104) + 88;
        llIlIlll[195] = ((102 + 117) - 109) + 24;
        llIlIlll[196] = (-22721) & 32463;
        llIlIlll[197] = ((87 + 88) - 115) + 75;
    }

    private static String lIlIllllIIl(String lIlIIlIIllIIIll, String lIlIIlIIllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIlIIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIlIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIlIIllIIlII) {
            lIlIIlIIllIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    static boolean bG() {
        if (lIllIlIIIll(Vars.getBit(llIlIlll[74])) && lIllIlIIIll(Vars.getBit(llIlIlll[80])) && lIllIlIlIIl(Vars.getBit(llIlIlll[75]), llIlIlll[0]) && lIllIlIIIll(Vars.getBit(llIlIlll[103])) && lIllIlIlIIl(Vars.getBit(llIlIlll[121]), llIlIlll[0]) && lIllIlIlIIl(Vars.getBit(llIlIlll[126]), llIlIlll[0])) {
            ?? r0 = llIlIlll[0];
            "".length();
            return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlll[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ad, code lost:
        if (lIllIlIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.B.llIlIlll[14]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ag() {
        int[] iArr;
        int[] iArr2 = new int[llIlIlll[0]];
        iArr2[llIlIlll[1]] = llIlIlll[6];
        if (lIllIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(llIlIlll[6], llIlIlll[10], llIlIlll[175]));
            "".length();
        }
        int[] iArr3 = new int[llIlIlll[0]];
        iArr3[llIlIlll[1]] = llIlIlll[7];
        if (lIllIlIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(llIlIlll[7], llIlIlll[0], llIlIlll[175]));
            "".length();
        }
        int[] iArr4 = new int[llIlIlll[0]];
        iArr4[llIlIlll[1]] = llIlIlll[9];
        if (lIllIlIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(llIlIlll[9], llIlIlll[0], llIlIlll[175]));
            "".length();
        }
        if (lIllIlIIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIIll[llIlIlll[181]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(llIlIlll[176], llIlIlll[14], llIlIlll[177]));
            "".length();
        }
        int[] iArr5 = new int[llIlIlll[0]];
        iArr5[llIlIlll[1]] = llIlIlll[12];
        if (lIllIlIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(llIlIlll[12], llIlIlll[4], C0008i.bw));
            "".length();
        }
        int[] iArr6 = new int[llIlIlll[0]];
        iArr6[llIlIlll[1]] = llIlIlll[13];
        if (lIllIlIIIIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[llIlIlll[0]];
            iArr7[llIlIlll[1]] = llIlIlll[13];
            if (lIllIlIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIlIlll[0]];
                iArr8[llIlIlll[1]] = llIlIlll[13];
            }
            iArr = new int[llIlIlll[0]];
            iArr[llIlIlll[1]] = llIlIlll[5];
            if (lIllIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr9 = new int[llIlIlll[0]];
                iArr9[llIlIlll[1]] = llIlIlll[5];
                if (!lIllIlIIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    return;
                }
                int[] iArr10 = new int[llIlIlll[0]];
                iArr10[llIlIlll[1]] = llIlIlll[5];
                if (!lIllIlIIIlI(Bank.getFirst(iArr10).getQuantity(), llIlIlll[27])) {
                    return;
                }
            }
            bB.add(new C0003d(llIlIlll[5], llIlIlll[57], llIlIlll[179]));
            "".length();
        }
        bB.add(new C0003d(llIlIlll[13], llIlIlll[10], llIlIlll[178]));
        "".length();
        iArr = new int[llIlIlll[0]];
        iArr[llIlIlll[1]] = llIlIlll[5];
        if (lIllIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bB.add(new C0003d(llIlIlll[5], llIlIlll[57], llIlIlll[179]));
        "".length();
    }

    private static String lIlIllllIII(String lIlIIlIlIIIIlIl, String lIlIIlIlIIIIlII) {
        String str = new String(Base64.getDecoder().decode(lIlIIlIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIlIlIIIIIll = new StringBuilder();
        char[] charArray = lIlIIlIlIIIIlII.toCharArray();
        int lIlIIlIlIIIIIIl = llIlIlll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIlll[1];
        while (lIllIlIIIlI(i, length)) {
            char lIlIIlIlIIIIllI = charArray2[i];
            lIlIIlIlIIIIIll.append((char) (lIlIIlIlIIIIllI ^ charArray[lIlIIlIlIIIIIIl % charArray.length]));
            "".length();
            lIlIIlIlIIIIIIl++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lIlIIlIlIIIIIll);
    }

    private static boolean lIllIlIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlIIlIl(int i) {
        return i > 0;
    }

    private static boolean lIllIlIIllI(int i) {
        return i < 0;
    }

    private static boolean lIllIlIIIlI(int i, int i2) {
        return i < i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llIlIIll[llIlIlll[180]];
    }

    private static boolean lIllIlIlIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIlIllII(int i, int i2) {
        return i >= i2;
    }
}
