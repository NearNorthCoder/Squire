package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/q.class */
public class C0016q implements K {
    private static /* synthetic */ int[] lIlIllIIll;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ WorldPoint cR;
    public static /* synthetic */ boolean cQ;
    public static /* synthetic */ boolean cN;
    public static /* synthetic */ boolean cL;
    private static /* synthetic */ String[] lIlIllIIIl;
    public static /* synthetic */ boolean cP;
    public static /* synthetic */ boolean cO;
    static /* synthetic */ WorldPoint cS;
    static /* synthetic */ WorldPoint cU;
    private static /* synthetic */ String[] cy;
    public static /* synthetic */ List<C0003d> bp;
    static /* synthetic */ WorldPoint cT;
    public static /* synthetic */ boolean cM;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (lIIlIIllIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean al() {
        int[] iArr = new int[lIlIllIIll[0]];
        iArr[lIlIllIIll[1]] = lIlIllIIll[12];
        if (lIIlIIllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIllIIll[0]];
            iArr2[lIlIllIIll[1]] = lIlIllIIll[12];
        }
        if (lIIlIIllIIIII(Inventory.contains(item -> {
            return item.getName().contains(lIlIllIIIl[lIlIllIIll[108]]);
        }) ? 1 : 0) && (!lIIlIIllIIIlI(Inventory.contains(item2 -> {
            return item2.getName().contains(lIlIllIIIl[lIlIllIIll[107]]);
        }) ? 1 : 0) || lIIlIIllIIIII(Equipment.contains(item3 -> {
            return item3.getName().contains(lIlIllIIIl[lIlIllIIll[106]]);
        }) ? 1 : 0))) {
            int[] iArr3 = new int[lIlIllIIll[0]];
            iArr3[lIlIllIIll[1]] = lIlIllIIll[10];
            if (lIIlIIllIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                ?? r0 = lIlIllIIll[0];
                "".length();
                return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlIllIIll[1];
    }

    public static void aQ() {
        do {
            int[] iArr = new int[lIlIllIIll[0]];
            iArr[lIlIllIIll[1]] = lIlIllIIll[60];
            if (lIIlIIllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIllIIll[0]];
                iArr2[lIlIllIIll[1]] = lIlIllIIll[59];
                if (lIIlIIllIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIllIIll[0]];
                    iArr3[lIlIllIIll[1]] = lIlIllIIll[58];
                    if (lIIlIIllIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIllIIll[0]];
                        iArr4[lIlIllIIll[1]] = lIlIllIIll[56];
                        if (lIIlIIllIIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIllIIll[0]];
                            iArr5[lIlIllIIll[1]] = lIlIllIIll[57];
                            if (!lIIlIIllIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                                return;
                            }
                        }
                    }
                }
            }
            Inventory.getFirst(item -> {
                if (lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[112]]) ? 1 : 0) && lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[113]]) ? 1 : 0)) {
                    ?? r0 = lIlIllIIll[0];
                    "".length();
                    return "   ".length() <= "  ".length() ? ((((127 + 52) - 66) + 77) ^ (((59 + 23) - (-76)) + 25)) & (((117 ^ 124) ^ ((223 ^ 152) & ((87 ^ 16) ^ (-1)))) ^ (-" ".length())) : r0;
                }
                return lIlIllIIll[1];
            }).interact(lIlIllIIIl[lIlIllIIll[92]]);
            Time.sleepTicks(lIlIllIIll[3]);
            "".length();
            if (lIIlIIllIIIII(AccBuilderShamans.d ? 1 : 0)) {
                "".length();
                if (((((16 + 104) - 44) + 68) ^ (((136 + 63) - 70) + 19)) < (-" ".length())) {
                    return;
                }
                return;
            }
            C0006g.a(cy);
            "".length();
        } while ((-" ".length()) == (-" ".length()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x076b, code lost:
        if (lIIlIIllIIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x08a6, code lost:
        if (lIIlIIllIIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0a76, code lost:
        if (lIIlIIllIIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0c6f, code lost:
        if (lIIlIIllIIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0e5d, code lost:
        if (lIIlIIllIIIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v281, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v345, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v654, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v663, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v666, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v688, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aO() {
        if (lIIlIIllIIIII(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIlIIllIIIIl(bp.size(), lIlIllIIll[0])) {
                System.out.println(lIlIllIIIl[lIlIllIIll[1]]);
                bn = lIlIllIIll[1];
            }
        }
        if (lIIlIIllIIIlI(bn ? 1 : 0)) {
            if (lIIlIIllIIIlI(al() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIllIIIll(nearest) && lIIlIIllIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[0]];
                    C0000a.a(nearest);
                }
                if (lIIlIIllIIIll(nearest) && lIIlIIllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIllIIll[2]);
                        "".length();
                    }
                    if (lIIlIIllIIIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[3]];
                        if (lIIlIIllIIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIllIIll[4]);
                            "".length();
                        }
                        if (lIIlIIllIIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIllIIll[3]);
                            "".length();
                        }
                        Time.sleepTicks(lIlIllIIll[5]);
                        "".length();
                        int[] iArr = new int[lIlIllIIll[0]];
                        iArr[lIlIllIIll[1]] = lIlIllIIll[6];
                        if (lIIlIIllIIIlI(Bank.contains(iArr) ? 1 : 0)) {
                            O();
                            System.out.println(lIlIllIIIl[lIlIllIIll[5]]);
                            bn = lIlIllIIll[0];
                            return;
                        }
                        int[] iArr2 = new int[lIlIllIIll[0]];
                        iArr2[lIlIllIIll[1]] = lIlIllIIll[7];
                        if (lIIlIIllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[lIlIllIIll[0]];
                            iArr3[lIlIllIIll[1]] = lIlIllIIll[7];
                            if (lIIlIIllIIIIl(Bank.getFirst(iArr3).getQuantity(), lIlIllIIll[8])) {
                                O();
                                System.out.println(lIlIllIIIl[lIlIllIIll[4]]);
                                bn = lIlIllIIll[0];
                                return;
                            }
                        }
                        int[] iArr4 = new int[lIlIllIIll[9]];
                        iArr4[lIlIllIIll[1]] = lIlIllIIll[10];
                        iArr4[lIlIllIIll[0]] = lIlIllIIll[11];
                        iArr4[lIlIllIIll[3]] = lIlIllIIll[6];
                        iArr4[lIlIllIIll[5]] = lIlIllIIll[12];
                        iArr4[lIlIllIIll[4]] = lIlIllIIll[7];
                        if (lIIlIIllIIIlI(C0004e.b(iArr4) ? 1 : 0)) {
                            O();
                            System.out.println(lIlIllIIIl[lIlIllIIll[9]]);
                            bn = lIlIllIIll[0];
                            return;
                        }
                        int[] iArr5 = new int[lIlIllIIll[9]];
                        iArr5[lIlIllIIll[1]] = lIlIllIIll[10];
                        iArr5[lIlIllIIll[0]] = lIlIllIIll[11];
                        iArr5[lIlIllIIll[3]] = lIlIllIIll[6];
                        iArr5[lIlIllIIll[5]] = lIlIllIIll[12];
                        iArr5[lIlIllIIll[4]] = lIlIllIIll[7];
                        if (lIIlIIllIIIII(C0004e.b(iArr5) ? 1 : 0)) {
                            C0000a.a(lIlIllIIll[11], lIlIllIIll[0]);
                            C0000a.a(lIlIllIIll[6], lIlIllIIll[3]);
                            C0000a.a(lIlIllIIll[7], lIlIllIIll[13]);
                            C0000a.b(C0005f.be, lIlIllIIll[0]);
                            C0000a.a(lIlIllIIll[12], lIlIllIIll[0]);
                            C0000a.a(lIlIllIIll[10], lIlIllIIll[13]);
                            Bank.withdrawAll(item -> {
                                return item.getName().contains(lIlIllIIIl[lIlIllIIll[165]]);
                            }, Bank.WithdrawMode.ITEM);
                        }
                    }
                }
            }
            if (lIIlIIllIIIII(al() ? 1 : 0)) {
                C0004e.l(lIlIllIIll[12]);
                if (lIIlIIllIIIII(Inventory.contains(item2 -> {
                    return item2.getName().contains(lIlIllIIIl[lIlIllIIll[164]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lIlIllIIIl[lIlIllIIll[163]]);
                    }).interact(lIlIllIIIl[lIlIllIIll[14]]);
                }
                if (lIIlIIllIIIII(Inventory.contains(item4 -> {
                    return item4.getName().contains(lIlIllIIIl[lIlIllIIll[162]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item5 -> {
                        return item5.getName().contains(lIlIllIIIl[lIlIllIIll[161]]);
                    }).interact(lIlIllIIIl[lIlIllIIll[15]]);
                }
                if (lIIlIIllIIIII(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlIIllIIIIl(Movement.getRunEnergy(), lIlIllIIll[16])) {
                    Inventory.getFirst(C0005f.aU).interact(lIlIllIIIl[lIlIllIIll[8]]);
                    Time.sleepTicks(lIlIllIIll[0]);
                    "".length();
                }
                if (lIIlIIllIIIIl(Prayers.getPoints(), lIlIllIIll[14]) && lIIlIIllIIIII(Inventory.contains(item6 -> {
                    return item6.getName().contains(lIlIllIIIl[lIlIllIIll[160]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item7 -> {
                        return item7.getName().contains(lIlIllIIIl[lIlIllIIll[159]]);
                    }).interact(lIlIllIIIl[lIlIllIIll[17]]);
                }
                String[] strArr = new String[lIlIllIIll[0]];
                strArr[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[13]];
                if (lIIlIIllIIIII(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIllIIll[0]];
                    strArr2[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[18]];
                    Inventory.getFirst(strArr2).interact(lIlIllIIIl[lIlIllIIll[19]]);
                }
                String[] strArr3 = new String[lIlIllIIll[0]];
                strArr3[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[20]];
                if (lIIlIIllIIIII(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIllIIll[0]];
                    strArr4[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[21]];
                    Inventory.getFirst(strArr4).interact(lIlIllIIIl[lIlIllIIll[22]]);
                }
                WorldArea worldArea = new WorldArea(lIlIllIIll[23], lIlIllIIll[24], lIlIllIIll[20], lIlIllIIll[19], lIlIllIIll[1]);
                if (lIIlIIllIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[25]];
                    Movement.walkTo(new WorldPoint(lIlIllIIll[26], lIlIllIIll[27], lIlIllIIll[1]));
                    "".length();
                    Time.sleepTicks(lIlIllIIll[0]);
                    "".length();
                }
                if (lIIlIIllIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(cy);
                    TileItem nearest2 = TileItems.getNearest(tileItem -> {
                        if (lIIlIIllIIIII(tileItem.getName().contains(lIlIllIIIl[lIlIllIIll[157]]) ? 1 : 0) && lIIlIIllIIIlI(tileItem.getName().contains(lIlIllIIIl[lIlIllIIll[158]]) ? 1 : 0)) {
                            ?? r0 = lIlIllIIll[0];
                            "".length();
                            return " ".length() <= 0 ? ((47 ^ 3) ^ (48 ^ 27)) & (((119 ^ 30) ^ (97 ^ 15)) ^ (-" ".length())) : r0;
                        }
                        return lIlIllIIll[1];
                    });
                    if (lIIlIIllIIIll(nearest2)) {
                        if (lIIlIIllIIIlI(cM ? 1 : 0) && lIIlIIllIIIII(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[28]]) ? 1 : 0) && lIIlIIllIIIlI(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[29]]) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[30]];
                            nearest2.interact(lIlIllIIIl[lIlIllIIll[31]]);
                            Time.sleepTicks(lIlIllIIll[4]);
                            "".length();
                        }
                        if (lIIlIIllIIIlI(cN ? 1 : 0) && lIIlIIllIIIII(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[32]]) ? 1 : 0) && lIIlIIllIIIlI(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[33]]) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[34]];
                            nearest2.interact(lIlIllIIIl[lIlIllIIll[35]]);
                            Time.sleepTicks(lIlIllIIll[4]);
                            "".length();
                        }
                        if (lIIlIIllIIIII(cM ? 1 : 0) && lIIlIIllIIIlI(cN ? 1 : 0) && lIIlIIllIIIII(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[36]]) ? 1 : 0) && lIIlIIllIIIlI(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[37]]) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[38]];
                            nearest2.interact(lIlIllIIIl[lIlIllIIll[39]]);
                            Time.sleepTicks(lIlIllIIll[4]);
                            "".length();
                        }
                        if (lIIlIIllIIIII(cN ? 1 : 0) && lIIlIIllIIIlI(cO ? 1 : 0) && lIIlIIllIIIII(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[40]]) ? 1 : 0) && lIIlIIllIIIlI(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[41]]) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[42]];
                            nearest2.interact(lIlIllIIIl[lIlIllIIll[43]]);
                            Time.sleepTicks(lIlIllIIll[4]);
                            "".length();
                        }
                        if (lIIlIIllIIIII(cO ? 1 : 0) && lIIlIIllIIIlI(cP ? 1 : 0) && lIIlIIllIIIII(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[44]]) ? 1 : 0) && lIIlIIllIIIlI(nearest2.getName().contains(lIlIllIIIl[lIlIllIIll[45]]) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[46]];
                            nearest2.interact(lIlIllIIIl[lIlIllIIll[47]]);
                            Time.sleepTicks(lIlIllIIll[4]);
                            "".length();
                        }
                    }
                    int[] iArr6 = new int[lIlIllIIll[0]];
                    iArr6[lIlIllIIll[1]] = lIlIllIIll[48];
                    if (lIIlIIllIIIII(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlIllIIll[0]];
                        iArr7[lIlIllIIll[1]] = lIlIllIIll[49];
                        if (lIIlIIllIIIII(Inventory.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIlIllIIll[0]];
                            iArr8[lIlIllIIll[1]] = lIlIllIIll[50];
                            if (lIIlIIllIIIII(Inventory.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[lIlIllIIll[0]];
                                iArr9[lIlIllIIll[1]] = lIlIllIIll[51];
                                if (lIIlIIllIIIII(Inventory.contains(iArr9) ? 1 : 0)) {
                                    int[] iArr10 = new int[lIlIllIIll[0]];
                                    iArr10[lIlIllIIll[1]] = lIlIllIIll[52];
                                }
                            }
                        }
                    }
                    if (lIIlIIllIIIlI(Inventory.contains(item8 -> {
                        if (lIIlIIllIIIII(item8.getName().contains(lIlIllIIIl[lIlIllIIll[155]]) ? 1 : 0) && lIIlIIllIIIlI(item8.getName().contains(lIlIllIIIl[lIlIllIIll[156]]) ? 1 : 0)) {
                            ?? r0 = lIlIllIIll[0];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIllIIll[1];
                    }) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item9 -> {
                        if (lIIlIIllIIIII(item9.getName().contains(lIlIllIIIl[lIlIllIIll[153]]) ? 1 : 0) && lIIlIIllIIIlI(item9.getName().contains(lIlIllIIIl[lIlIllIIll[154]]) ? 1 : 0)) {
                            ?? r0 = lIlIllIIll[0];
                            "".length();
                            return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlIllIIll[1];
                    }) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item10 -> {
                        if (lIIlIIllIIIII(item10.getName().contains(lIlIllIIIl[lIlIllIIll[151]]) ? 1 : 0) && lIIlIIllIIIlI(item10.getName().contains(lIlIllIIIl[lIlIllIIll[152]]) ? 1 : 0)) {
                            ?? r0 = lIlIllIIll[0];
                            "".length();
                            return ((((128 + 19) - 128) + 110) ^ (((8 + 86) - 9) + 48)) < 0 ? ((10 ^ 113) ^ (248 ^ 179)) & (((((46 + 91) - 42) + 80) ^ (((21 + 16) - 27) + 149)) ^ (-" ".length())) : r0;
                        }
                        return lIlIllIIll[1];
                    }) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item11 -> {
                        if (lIIlIIllIIIII(item11.getName().contains(lIlIllIIIl[lIlIllIIll[149]]) ? 1 : 0) && lIIlIIllIIIlI(item11.getName().contains(lIlIllIIIl[lIlIllIIll[150]]) ? 1 : 0)) {
                            ?? r0 = lIlIllIIll[0];
                            "".length();
                            return ((96 ^ 102) ^ "  ".length()) < "   ".length() ? ((((131 + 141) - 260) + 205) ^ (((108 + 50) - 113) + 85)) & (((((140 + 17) - 58) + 131) ^ (((44 + 124) - (-3)) + 18)) ^ (-" ".length())) : r0;
                        }
                        return lIlIllIIll[1];
                    }) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[53]];
                        NPC nearest3 = NPCs.getNearest(npc -> {
                            if (lIIlIIllIIIII(npc.getName().contains(lIlIllIIIl[lIlIllIIll[147]]) ? 1 : 0)) {
                                String[] strArr5 = new String[lIlIllIIll[0]];
                                strArr5[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[148]];
                                if (lIIlIIllIIIII(npc.hasAction(strArr5) ? 1 : 0)) {
                                    ?? r0 = lIlIllIIll[0];
                                    "".length();
                                    return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                            return lIlIllIIll[1];
                        });
                        if (lIIlIIllIIlIl(nearest3)) {
                            C0006g.a(lIlIllIIIl[lIlIllIIll[54]], cy);
                        }
                        if (lIIlIIllIIIll(nearest3)) {
                            if (lIIlIIllIIIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                            }
                            if (lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                nearest3.interact(lIlIllIIIl[lIlIllIIll[55]]);
                                Time.sleepTicks(lIlIllIIll[3]);
                                "".length();
                            }
                        }
                    }
                    int[] iArr11 = new int[lIlIllIIll[0]];
                    iArr11[lIlIllIIll[1]] = lIlIllIIll[56];
                    if (lIIlIIllIIIII(Inventory.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lIlIllIIll[0]];
                        iArr12[lIlIllIIll[1]] = lIlIllIIll[57];
                        if (lIIlIIllIIIII(Inventory.contains(iArr12) ? 1 : 0)) {
                            int[] iArr13 = new int[lIlIllIIll[0]];
                            iArr13[lIlIllIIll[1]] = lIlIllIIll[58];
                            if (lIIlIIllIIIII(Inventory.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIlIllIIll[0]];
                                iArr14[lIlIllIIll[1]] = lIlIllIIll[59];
                                if (lIIlIIllIIIII(Inventory.contains(iArr14) ? 1 : 0)) {
                                    int[] iArr15 = new int[lIlIllIIll[0]];
                                    iArr15[lIlIllIIll[1]] = lIlIllIIll[60];
                                }
                            }
                        }
                    }
                    int[] iArr16 = new int[lIlIllIIll[0]];
                    iArr16[lIlIllIIll[1]] = lIlIllIIll[48];
                    if (lIIlIIllIIIII(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIlIllIIll[0]];
                        iArr17[lIlIllIIll[1]] = lIlIllIIll[49];
                        if (lIIlIIllIIIII(Inventory.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIlIllIIll[0]];
                            iArr18[lIlIllIIll[1]] = lIlIllIIll[50];
                            if (lIIlIIllIIIII(Inventory.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lIlIllIIll[0]];
                                iArr19[lIlIllIIll[1]] = lIlIllIIll[51];
                                if (lIIlIIllIIIII(Inventory.contains(iArr19) ? 1 : 0)) {
                                    int[] iArr20 = new int[lIlIllIIll[0]];
                                    iArr20[lIlIllIIll[1]] = lIlIllIIll[52];
                                    if (lIIlIIllIIIII(Inventory.contains(iArr20) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item12 -> {
                                        if (lIIlIIllIIIII(item12.getName().contains(lIlIllIIIl[lIlIllIIll[145]]) ? 1 : 0) && lIIlIIllIIIlI(item12.getName().contains(lIlIllIIIl[lIlIllIIll[146]]) ? 1 : 0)) {
                                            ?? r0 = lIlIllIIll[0];
                                            "".length();
                                            return 0 != 0 ? ((244 ^ 165) ^ (113 ^ 117)) & (((((225 + 126) - 140) + 36) ^ (((70 + 93) - 144) + 143)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIllIIll[1];
                                    }) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item13 -> {
                                        if (lIIlIIllIIIII(item13.getName().contains(lIlIllIIIl[lIlIllIIll[143]]) ? 1 : 0) && lIIlIIllIIIlI(item13.getName().contains(lIlIllIIIl[lIlIllIIll[144]]) ? 1 : 0)) {
                                            ?? r0 = lIlIllIIll[0];
                                            "".length();
                                            return (-(130 ^ 134)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIllIIll[1];
                                    }) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item14 -> {
                                        if (lIIlIIllIIIII(item14.getName().contains(lIlIllIIIl[lIlIllIIll[142]]) ? 1 : 0) && lIIlIIllIIIlI(item14.getName().contains(lIlIllIIIl[lIlIllIIll[102]]) ? 1 : 0)) {
                                            ?? r0 = lIlIllIIll[0];
                                            "".length();
                                            return !((true ^ true) ^ (true ^ true)) ? ((35 ^ 49) ^ (63 ^ 117)) & (((((111 + 155) - 121) + 64) ^ (((37 + 62) - (-31)) + 7)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIllIIll[1];
                                    }) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[61]];
                                        NPC nearest4 = NPCs.getNearest(npc2 -> {
                                            if (lIIlIIllIIIII(npc2.getName().contains(lIlIllIIIl[lIlIllIIll[140]]) ? 1 : 0)) {
                                                String[] strArr5 = new String[lIlIllIIll[0]];
                                                strArr5[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[141]];
                                                if (lIIlIIllIIIII(npc2.hasAction(strArr5) ? 1 : 0)) {
                                                    ?? r0 = lIlIllIIll[0];
                                                    "".length();
                                                    return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                }
                                            }
                                            return lIlIllIIll[1];
                                        });
                                        if (lIIlIIllIIlIl(nearest4)) {
                                            if (lIIlIIllIIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                            }
                                            C0006g.a(lIlIllIIIl[lIlIllIIll[62]], cy);
                                        }
                                        if (lIIlIIllIIIll(nearest4)) {
                                            if (lIIlIIllIIIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                            }
                                            if (lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                                nearest4.interact(lIlIllIIIl[lIlIllIIll[63]]);
                                                Time.sleepTicks(lIlIllIIll[3]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int[] iArr21 = new int[lIlIllIIll[0]];
                    iArr21[lIlIllIIll[1]] = lIlIllIIll[64];
                    if (lIIlIIllIIIII(Inventory.contains(iArr21) ? 1 : 0)) {
                        int[] iArr22 = new int[lIlIllIIll[0]];
                        iArr22[lIlIllIIll[1]] = lIlIllIIll[65];
                        if (lIIlIIllIIIII(Inventory.contains(iArr22) ? 1 : 0)) {
                            int[] iArr23 = new int[lIlIllIIll[0]];
                            iArr23[lIlIllIIll[1]] = lIlIllIIll[66];
                            if (lIIlIIllIIIII(Inventory.contains(iArr23) ? 1 : 0)) {
                                int[] iArr24 = new int[lIlIllIIll[0]];
                                iArr24[lIlIllIIll[1]] = lIlIllIIll[67];
                                if (lIIlIIllIIIII(Inventory.contains(iArr24) ? 1 : 0)) {
                                    int[] iArr25 = new int[lIlIllIIll[0]];
                                    iArr25[lIlIllIIll[1]] = lIlIllIIll[68];
                                }
                            }
                        }
                    }
                    int[] iArr26 = new int[lIlIllIIll[0]];
                    iArr26[lIlIllIIll[1]] = lIlIllIIll[56];
                    if (lIIlIIllIIIII(Inventory.contains(iArr26) ? 1 : 0)) {
                        int[] iArr27 = new int[lIlIllIIll[0]];
                        iArr27[lIlIllIIll[1]] = lIlIllIIll[57];
                        if (lIIlIIllIIIII(Inventory.contains(iArr27) ? 1 : 0)) {
                            int[] iArr28 = new int[lIlIllIIll[0]];
                            iArr28[lIlIllIIll[1]] = lIlIllIIll[58];
                            if (lIIlIIllIIIII(Inventory.contains(iArr28) ? 1 : 0)) {
                                int[] iArr29 = new int[lIlIllIIll[0]];
                                iArr29[lIlIllIIll[1]] = lIlIllIIll[59];
                                if (lIIlIIllIIIII(Inventory.contains(iArr29) ? 1 : 0)) {
                                    int[] iArr30 = new int[lIlIllIIll[0]];
                                    iArr30[lIlIllIIll[1]] = lIlIllIIll[60];
                                    if (lIIlIIllIIIII(Inventory.contains(iArr30) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item15 -> {
                                        if (lIIlIIllIIIII(item15.getName().contains(lIlIllIIIl[lIlIllIIll[138]]) ? 1 : 0) && lIIlIIllIIIlI(item15.getName().contains(lIlIllIIIl[lIlIllIIll[139]]) ? 1 : 0)) {
                                            ?? r0 = lIlIllIIll[0];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIllIIll[1];
                                    }) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item16 -> {
                                        if (lIIlIIllIIIII(item16.getName().contains(lIlIllIIIl[lIlIllIIll[136]]) ? 1 : 0) && lIIlIIllIIIlI(item16.getName().contains(lIlIllIIIl[lIlIllIIll[137]]) ? 1 : 0)) {
                                            ?? r0 = lIlIllIIll[0];
                                            "".length();
                                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIlIllIIll[1];
                                    }) ? 1 : 0)) {
                                        cM = lIlIllIIll[0];
                                        AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[69]];
                                        NPC nearest5 = NPCs.getNearest(npc3 -> {
                                            if (lIIlIIllIIIII(npc3.getName().contains(lIlIllIIIl[lIlIllIIll[134]]) ? 1 : 0)) {
                                                String[] strArr5 = new String[lIlIllIIll[0]];
                                                strArr5[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[135]];
                                                if (lIIlIIllIIIII(npc3.hasAction(strArr5) ? 1 : 0)) {
                                                    ?? r0 = lIlIllIIll[0];
                                                    "".length();
                                                    return " ".length() == (-" ".length()) ? ((((238 + 211) - 236) + 39) ^ (((23 + 131) - 27) + 66)) & (((254 ^ 167) ^ (124 ^ 24)) ^ (-" ".length())) : r0;
                                                }
                                            }
                                            return lIlIllIIll[1];
                                        });
                                        if (lIIlIIllIIlIl(nearest5) && lIIlIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                            if (lIIlIIllIIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                            }
                                            aP();
                                            if (lIIlIIllIIIII(Inventory.contains(item17 -> {
                                                if (lIIlIIllIIIII(item17.getName().contains(lIlIllIIIl[lIlIllIIll[132]]) ? 1 : 0) && lIIlIIllIIIlI(item17.getName().contains(lIlIllIIIl[lIlIllIIll[133]]) ? 1 : 0)) {
                                                    ?? r0 = lIlIllIIll[0];
                                                    "".length();
                                                    return ((((85 + 55) - 109) + 125) ^ (((118 + 42) - 111) + 103)) != ((((76 + 7) - 19) + 118) ^ (((92 + 83) - 4) + 7)) ? ((41 ^ 6) ^ (77 ^ 68)) & (((4 ^ 36) ^ (193 ^ 199)) ^ (-" ".length())) : r0;
                                                }
                                                return lIlIllIIll[1];
                                            }) ? 1 : 0)) {
                                                Inventory.getFirst(item18 -> {
                                                    if (lIIlIIllIIIII(item18.getName().contains(lIlIllIIIl[lIlIllIIll[130]]) ? 1 : 0) && lIIlIIllIIIlI(item18.getName().contains(lIlIllIIIl[lIlIllIIll[131]]) ? 1 : 0)) {
                                                        ?? r0 = lIlIllIIll[0];
                                                        "".length();
                                                        return "  ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                    }
                                                    return lIlIllIIll[1];
                                                }).interact(lIlIllIIIl[lIlIllIIll[70]]);
                                            }
                                            C0006g.a(lIlIllIIIl[lIlIllIIll[71]], cy);
                                        }
                                        if (lIIlIIllIIIll(nearest5)) {
                                            if (lIIlIIllIIIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                            }
                                            if (lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                                nearest5.interact(lIlIllIIIl[lIlIllIIll[72]]);
                                                Time.sleepTicks(lIlIllIIll[3]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int[] iArr31 = new int[lIlIllIIll[0]];
                    iArr31[lIlIllIIll[1]] = lIlIllIIll[73];
                    if (lIIlIIllIIIII(Inventory.contains(iArr31) ? 1 : 0)) {
                        int[] iArr32 = new int[lIlIllIIll[0]];
                        iArr32[lIlIllIIll[1]] = lIlIllIIll[74];
                        if (lIIlIIllIIIII(Inventory.contains(iArr32) ? 1 : 0)) {
                            int[] iArr33 = new int[lIlIllIIll[0]];
                            iArr33[lIlIllIIll[1]] = lIlIllIIll[75];
                            if (lIIlIIllIIIII(Inventory.contains(iArr33) ? 1 : 0)) {
                                int[] iArr34 = new int[lIlIllIIll[0]];
                                iArr34[lIlIllIIll[1]] = lIlIllIIll[76];
                                if (lIIlIIllIIIII(Inventory.contains(iArr34) ? 1 : 0)) {
                                    int[] iArr35 = new int[lIlIllIIll[0]];
                                    iArr35[lIlIllIIll[1]] = lIlIllIIll[77];
                                }
                            }
                        }
                    }
                    int[] iArr36 = new int[lIlIllIIll[0]];
                    iArr36[lIlIllIIll[1]] = lIlIllIIll[64];
                    if (lIIlIIllIIIII(Inventory.contains(iArr36) ? 1 : 0)) {
                        int[] iArr37 = new int[lIlIllIIll[0]];
                        iArr37[lIlIllIIll[1]] = lIlIllIIll[65];
                        if (lIIlIIllIIIII(Inventory.contains(iArr37) ? 1 : 0)) {
                            int[] iArr38 = new int[lIlIllIIll[0]];
                            iArr38[lIlIllIIll[1]] = lIlIllIIll[66];
                            if (lIIlIIllIIIII(Inventory.contains(iArr38) ? 1 : 0)) {
                                int[] iArr39 = new int[lIlIllIIll[0]];
                                iArr39[lIlIllIIll[1]] = lIlIllIIll[67];
                                if (lIIlIIllIIIII(Inventory.contains(iArr39) ? 1 : 0)) {
                                    int[] iArr40 = new int[lIlIllIIll[0]];
                                    iArr40[lIlIllIIll[1]] = lIlIllIIll[68];
                                    if (lIIlIIllIIIII(Inventory.contains(iArr40) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item19 -> {
                                        if (lIIlIIllIIIII(item19.getName().contains(lIlIllIIIl[lIlIllIIll[128]]) ? 1 : 0) && lIIlIIllIIIlI(item19.getName().contains(lIlIllIIIl[lIlIllIIll[129]]) ? 1 : 0)) {
                                            ?? r0 = lIlIllIIll[0];
                                            "".length();
                                            return 0 != 0 ? ((20 ^ 57) ^ (117 ^ 106)) & (((57 ^ 71) ^ (80 ^ 28)) ^ (-" ".length())) : r0;
                                        }
                                        return lIlIllIIll[1];
                                    }) ? 1 : 0)) {
                                        cN = lIlIllIIll[0];
                                        AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[78]];
                                        NPC nearest6 = NPCs.getNearest(npc4 -> {
                                            if (lIIlIIllIIIII(npc4.getName().contains(lIlIllIIIl[lIlIllIIll[126]]) ? 1 : 0)) {
                                                String[] strArr5 = new String[lIlIllIIll[0]];
                                                strArr5[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[127]];
                                                if (lIIlIIllIIIII(npc4.hasAction(strArr5) ? 1 : 0)) {
                                                    ?? r0 = lIlIllIIll[0];
                                                    "".length();
                                                    return 0 != 0 ? ((95 ^ 106) ^ (3 ^ 98)) & (((95 ^ 103) ^ (44 ^ 64)) ^ (-" ".length())) : r0;
                                                }
                                            }
                                            return lIlIllIIll[1];
                                        });
                                        if (lIIlIIllIIlIl(nearest6) && lIIlIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                            if (lIIlIIllIIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                            }
                                            aP();
                                            aQ();
                                            if (lIIlIIllIIIII(Inventory.contains(item20 -> {
                                                if (lIIlIIllIIIII(item20.getName().contains(lIlIllIIIl[lIlIllIIll[124]]) ? 1 : 0) && lIIlIIllIIIlI(item20.getName().contains(lIlIllIIIl[lIlIllIIll[125]]) ? 1 : 0)) {
                                                    ?? r0 = lIlIllIIll[0];
                                                    "".length();
                                                    return (-" ".length()) < (-" ".length()) ? ((212 ^ 129) ^ (129 ^ 142)) & (((((35 + 112) - 139) + 147) ^ (((66 + 52) - (-4)) + 71)) ^ (-" ".length())) : r0;
                                                }
                                                return lIlIllIIll[1];
                                            }) ? 1 : 0)) {
                                                Inventory.getFirst(item21 -> {
                                                    if (lIIlIIllIIIII(item21.getName().contains(lIlIllIIIl[lIlIllIIll[122]]) ? 1 : 0) && lIIlIIllIIIlI(item21.getName().contains(lIlIllIIIl[lIlIllIIll[123]]) ? 1 : 0)) {
                                                        ?? r0 = lIlIllIIll[0];
                                                        "".length();
                                                        return ((((49 + 130) - 70) + 30) ^ (((48 + 140) - 118) + 73)) < "   ".length() ? ((255 ^ 140) ^ (141 ^ 184)) & (((141 ^ 166) ^ (27 ^ 118)) ^ (-" ".length())) : r0;
                                                    }
                                                    return lIlIllIIll[1];
                                                }).interact(lIlIllIIIl[lIlIllIIll[79]]);
                                            }
                                            C0006g.a(lIlIllIIIl[lIlIllIIll[80]], cy);
                                        }
                                        if (lIIlIIllIIIll(nearest6)) {
                                            if (lIIlIIllIIIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                            }
                                            if (lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                                nearest6.interact(lIlIllIIIl[lIlIllIIll[81]]);
                                                Time.sleepTicks(lIlIllIIll[3]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int[] iArr41 = new int[lIlIllIIll[0]];
                    iArr41[lIlIllIIll[1]] = lIlIllIIll[82];
                    if (lIIlIIllIIIII(Inventory.contains(iArr41) ? 1 : 0)) {
                        int[] iArr42 = new int[lIlIllIIll[0]];
                        iArr42[lIlIllIIll[1]] = lIlIllIIll[83];
                        if (lIIlIIllIIIII(Inventory.contains(iArr42) ? 1 : 0)) {
                            int[] iArr43 = new int[lIlIllIIll[0]];
                            iArr43[lIlIllIIll[1]] = lIlIllIIll[84];
                            if (lIIlIIllIIIII(Inventory.contains(iArr43) ? 1 : 0)) {
                                int[] iArr44 = new int[lIlIllIIll[0]];
                                iArr44[lIlIllIIll[1]] = lIlIllIIll[85];
                                if (lIIlIIllIIIII(Inventory.contains(iArr44) ? 1 : 0)) {
                                    int[] iArr45 = new int[lIlIllIIll[0]];
                                    iArr45[lIlIllIIll[1]] = lIlIllIIll[86];
                                }
                            }
                        }
                    }
                    int[] iArr46 = new int[lIlIllIIll[0]];
                    iArr46[lIlIllIIll[1]] = lIlIllIIll[73];
                    if (lIIlIIllIIIII(Inventory.contains(iArr46) ? 1 : 0)) {
                        int[] iArr47 = new int[lIlIllIIll[0]];
                        iArr47[lIlIllIIll[1]] = lIlIllIIll[74];
                        if (lIIlIIllIIIII(Inventory.contains(iArr47) ? 1 : 0)) {
                            int[] iArr48 = new int[lIlIllIIll[0]];
                            iArr48[lIlIllIIll[1]] = lIlIllIIll[75];
                            if (lIIlIIllIIIII(Inventory.contains(iArr48) ? 1 : 0)) {
                                int[] iArr49 = new int[lIlIllIIll[0]];
                                iArr49[lIlIllIIll[1]] = lIlIllIIll[76];
                                if (lIIlIIllIIIII(Inventory.contains(iArr49) ? 1 : 0)) {
                                    int[] iArr50 = new int[lIlIllIIll[0]];
                                    iArr50[lIlIllIIll[1]] = lIlIllIIll[77];
                                    if (lIIlIIllIIIII(Inventory.contains(iArr50) ? 1 : 0)) {
                                        cO = lIlIllIIll[0];
                                        AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[87]];
                                        NPC nearest7 = NPCs.getNearest(npc5 -> {
                                            if (lIIlIIllIIIII(npc5.getName().contains(lIlIllIIIl[lIlIllIIll[120]]) ? 1 : 0)) {
                                                String[] strArr5 = new String[lIlIllIIll[0]];
                                                strArr5[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[121]];
                                                if (lIIlIIllIIIII(npc5.hasAction(strArr5) ? 1 : 0)) {
                                                    ?? r0 = lIlIllIIll[0];
                                                    "".length();
                                                    return (-" ".length()) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                }
                                            }
                                            return lIlIllIIll[1];
                                        });
                                        if (lIIlIIllIIlIl(nearest7) && lIIlIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                            if (lIIlIIllIIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                            }
                                            aP();
                                            aQ();
                                            aR();
                                            if (lIIlIIllIIIII(Inventory.contains(item22 -> {
                                                if (lIIlIIllIIIII(item22.getName().contains(lIlIllIIIl[lIlIllIIll[118]]) ? 1 : 0) && lIIlIIllIIIlI(item22.getName().contains(lIlIllIIIl[lIlIllIIll[119]]) ? 1 : 0)) {
                                                    ?? r0 = lIlIllIIll[0];
                                                    "".length();
                                                    return (-" ".length()) >= 0 ? ((58 ^ 109) ^ (230 ^ 134)) & (((((57 + 69) - 57) + 68) ^ (((40 + 44) - 20) + 126)) ^ (-" ".length())) : r0;
                                                }
                                                return lIlIllIIll[1];
                                            }) ? 1 : 0)) {
                                                Inventory.getFirst(item23 -> {
                                                    if (lIIlIIllIIIII(item23.getName().contains(lIlIllIIIl[lIlIllIIll[116]]) ? 1 : 0) && lIIlIIllIIIlI(item23.getName().contains(lIlIllIIIl[lIlIllIIll[117]]) ? 1 : 0)) {
                                                        ?? r0 = lIlIllIIll[0];
                                                        "".length();
                                                        return (((197 ^ 128) ^ (32 ^ 80)) & (((221 ^ 161) ^ (4 ^ 77)) ^ (-" ".length()))) != 0 ? ((116 ^ 65) ^ (116 ^ 72)) & (((64 ^ 6) ^ (93 ^ 18)) ^ (-" ".length())) : r0;
                                                    }
                                                    return lIlIllIIll[1];
                                                }).interact(lIlIllIIIl[lIlIllIIll[88]]);
                                            }
                                            C0006g.a(lIlIllIIIl[lIlIllIIll[89]], cy);
                                        }
                                        if (lIIlIIllIIIll(nearest7)) {
                                            if (lIIlIIllIIIlI(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                            }
                                            if (lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                                nearest7.interact(lIlIllIIIl[lIlIllIIll[90]]);
                                                Time.sleepTicks(lIlIllIIll[3]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr51 = new int[lIlIllIIll[0]];
                iArr51[lIlIllIIll[1]] = lIlIllIIll[82];
                if (lIIlIIllIIIII(Inventory.contains(iArr51) ? 1 : 0)) {
                    int[] iArr52 = new int[lIlIllIIll[0]];
                    iArr52[lIlIllIIll[1]] = lIlIllIIll[83];
                    if (lIIlIIllIIIII(Inventory.contains(iArr52) ? 1 : 0)) {
                        int[] iArr53 = new int[lIlIllIIll[0]];
                        iArr53[lIlIllIIll[1]] = lIlIllIIll[84];
                        if (lIIlIIllIIIII(Inventory.contains(iArr53) ? 1 : 0)) {
                            int[] iArr54 = new int[lIlIllIIll[0]];
                            iArr54[lIlIllIIll[1]] = lIlIllIIll[85];
                            if (lIIlIIllIIIII(Inventory.contains(iArr54) ? 1 : 0)) {
                                int[] iArr55 = new int[lIlIllIIll[0]];
                                iArr55[lIlIllIIll[1]] = lIlIllIIll[86];
                                if (lIIlIIllIIIII(Inventory.contains(iArr55) ? 1 : 0)) {
                                    cP = lIlIllIIll[0];
                                    if (lIIlIIllIIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                                    }
                                    aS();
                                }
                            }
                        }
                    }
                }
            }
            C0006g.a(cy);
        }
    }

    private static String lIIlIIlIIllll(String lllllllllllllllllllIlIIIlIlIIlII, String lllllllllllllllllllIlIIIlIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIIlIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIlIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIlIIIlIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIlIIIlIlIIllI.init(lIlIllIIll[3], lllllllllllllllllllIlIIIlIlIIlll);
            return new String(lllllllllllllllllllIlIIIlIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIlIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIIlIlIIlIl) {
            lllllllllllllllllllIlIIIlIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllIIIII(int i) {
        return i != 0;
    }

    private static void lIIlIIlIllllI() {
        lIlIllIIIl = new String[lIlIllIIll[183]];
        lIlIllIIIl[lIlIllIIll[1]] = lIIlIIlIIlllI("wWHFxKVU2KhncBVnl5bf6O3hQFO+QRs8i/rBA1hqIhT75gzKmgFxirLpL/LwCQDV", "wPvyP");
        lIlIllIIIl[lIlIllIIll[0]] = lIIlIIlIIllll("rEygpQSzCFuk7xYfpGrwjw==", "leiQF");
        lIlIllIIIl[lIlIllIIll[3]] = lIIlIIlIIllll("klUDntcK2IHW/7m7y+06jv9BlF8YhqIl", "ClkZH");
        lIlIllIIIl[lIlIllIIll[5]] = lIIlIIlIIlllI("8OyjF8FNY9y5O99Ggomqs7i8ga3MzOQvN0ZrF2xMZeCDWK1sMFM4mFkxqKGBcjs7CWPiuistpM4=", "xdtjb");
        lIlIllIIIl[lIlIllIIll[4]] = lIIlIIlIIlllI("oVK9Hs81l1Q1Wx8auyAyc8yIsrj17nrzD59Eg/n9975O7Fj9KVwaTIpwbi++aYb8yt8DG+AOij4=", "foujx");
        lIlIllIIIl[lIlIllIIll[9]] = lIIlIIlIIlllI("zBy6chBeH6CVsGfTKpnEe5mAJ4ccGfay9TjkoVkEbVrpUT+JqR7ywBNOagncGf/mxYHYBQxXZRk=", "CIvEX");
        lIlIllIIIl[lIlIllIIll[14]] = lIIlIIlIIlllI("r9+6kftvCQ8=", "pPdve");
        lIlIllIIIl[lIlIllIIll[15]] = lIIlIIlIlIIII("EhIOOA==", "EwoJg");
        lIlIllIIIl[lIlIllIIll[8]] = lIIlIIlIlIIII("ND0rCxw=", "pOBew");
        lIlIllIIIl[lIlIllIIll[17]] = lIIlIIlIIllll("qdYm/APjr0E=", "xswmq");
        lIlIllIIIl[lIlIllIIll[13]] = lIIlIIlIlIIII("Pi4uKC0EIyFxOggiPzA0Bg==", "mFOQW");
        lIlIllIIIl[lIlIllIIll[18]] = lIIlIIlIIlllI("G17gd519aboYPNbSZQ1MhOo+H/5C+Juj", "QGdpv");
        lIlIllIIIl[lIlIllIIll[19]] = lIIlIIlIIlllI("RvsE9046VU4=", "mOjMz");
        lIlIllIIIl[lIlIllIIll[20]] = lIIlIIlIlIIII("DxwoJg==", "YuIJS");
        lIlIllIIIl[lIlIllIIll[21]] = lIIlIIlIIllll("noW5Z8p+Rcs=", "jFocY");
        lIlIllIIIl[lIlIllIIll[22]] = lIIlIIlIlIIII("EBoHIQ==", "ThhQf");
        lIlIllIIIl[lIlIllIIll[25]] = lIIlIIlIIllll("mwF5EwKnd4+d5k4eAFO1Kg81l8NrHSOG", "WVdPE");
        lIlIllIIIl[lIlIllIIll[28]] = lIIlIIlIlIIII("TGl5", "dXPPV");
        lIlIllIIIl[lIlIllIIll[29]] = lIIlIIlIlIIII("ICIbLx0+", "PMoFr");
        lIlIllIIIl[lIlIllIIll[30]] = lIIlIIlIIlllI("3UaBjIt3zXZbvo7CSDML73U2HJ+34o+u", "sWvZx");
        lIlIllIIIl[lIlIllIIll[31]] = lIIlIIlIIlllI("8ZXGyHAhS14=", "wcjPw");
        lIlIllIIIl[lIlIllIIll[32]] = lIIlIIlIIlllI("Vn+GCf3+fSw=", "mmRxa");
        lIlIllIIIl[lIlIllIIll[33]] = lIIlIIlIIllll("4scIbOqUeTE=", "sEssc");
        lIlIllIIIl[lIlIllIIll[34]] = lIIlIIlIlIIII("Nz8LKgoJMUg0E0clACAaHT8JLw==", "gVhAc");
        lIlIllIIIl[lIlIllIIll[35]] = lIIlIIlIIlllI("lsoc26OPZyI=", "MhJBq");
        lIlIllIIIl[lIlIllIIll[36]] = lIIlIIlIIllll("eE2TCH8XjQE=", "JkHxf");
        lIlIllIIIl[lIlIllIIll[37]] = lIIlIIlIIlllI("ds99DshX5mI=", "OgVWW");
        lIlIllIIIl[lIlIllIIll[38]] = lIIlIIlIIllll("rHpf4gyK48rPBwobvkDYtBplIvJ5gGzA", "RvJmW");
        lIlIllIIIl[lIlIllIIll[39]] = lIIlIIlIIlllI("slsBFC7uVO4=", "wcbCx");
        lIlIllIIIl[lIlIllIIll[40]] = lIIlIIlIIllll("4WjkF+BsHCs=", "ejBlq");
        lIlIllIIIl[lIlIllIIll[41]] = lIIlIIlIIllll("TK3Ljvo6nbY=", "CDBpd");
        lIlIllIIIl[lIlIllIIll[42]] = lIIlIIlIIlllI("mrCvNM+R4kH28LQzwNpZ+TiSL3cOXu/O", "fxNSc");
        lIlIllIIIl[lIlIllIIll[43]] = lIIlIIlIlIIII("JCg+Ew==", "pIUvK");
        lIlIllIIIl[lIlIllIIll[44]] = lIIlIIlIlIIII("UmxI", "zYaXm");
        lIlIllIIIl[lIlIllIIll[45]] = lIIlIIlIlIIII("FR8TCDgL", "epgaW");
        lIlIllIIIl[lIlIllIIll[46]] = lIIlIIlIlIIII("NxERPAEJH1IiGEcLGjYRHRETOQ==", "gxrWh");
        lIlIllIIIl[lIlIllIIll[47]] = lIIlIIlIlIIII("BjQcFg==", "RUwsh");
        lIlIllIIIl[lIlIllIIll[53]] = lIIlIIlIIlllI("2RqVv+PPPAtuUNrzAeDZ1g==", "delkX");
        lIlIllIIIl[lIlIllIIll[54]] = lIIlIIlIIlllI("sWCE/iPMesZCsSaoCHeviUXZo6rCJqW0", "CVSKh");
        lIlIllIIIl[lIlIllIIll[55]] = lIIlIIlIlIIII("CwA1NAUh", "JtAUf");
        lIlIllIIIl[lIlIllIIll[61]] = lIIlIIlIIllll("0idtEpPG3TbF5UzYvkj2Pg==", "sSBnn");
        lIlIllIIIl[lIlIllIIll[62]] = lIIlIIlIIlllI("o09dIXyk4yhQeA2hz0MHKvP1Pl6N/Wfh", "BcEsf");
        lIlIllIIIl[lIlIllIIll[63]] = lIIlIIlIIlllI("CQGxWGC6S/o=", "FdgtL");
        lIlIllIIIl[lIlIllIIll[69]] = lIIlIIlIIllll("1DCKWeSUJC/mGvKAKOV50w==", "HtlgP");
        lIlIllIIIl[lIlIllIIll[70]] = lIIlIIlIlIIII("ERU7Gw==", "UgTkc");
        lIlIllIIIl[lIlIllIIll[71]] = lIIlIIlIIllll("PVJveT5AstCJpyeY+QEfrLagUKTZ2DM6", "BQfRp");
        lIlIllIIIl[lIlIllIIll[72]] = lIIlIIlIIllll("rnbLgjOPJps=", "ClowX");
        lIlIllIIIl[lIlIllIIll[78]] = lIIlIIlIIlllI("W42zBRosT2H+/ZHPQf0eBA==", "fMVmU");
        lIlIllIIIl[lIlIllIIll[79]] = lIIlIIlIIlllI("X10KeKV+9xk=", "uXxvO");
        lIlIllIIIl[lIlIllIIll[80]] = lIIlIIlIIlllI("J/QWbeWNnJYKvkznhG36Dmcg/R3JzUfU", "juwld");
        lIlIllIIIl[lIlIllIIll[81]] = lIIlIIlIlIIII("DSckEyQn", "LSPrG");
        lIlIllIIIl[lIlIllIIll[87]] = lIIlIIlIIllll("kZaZZUzSjWugw/1ghAw6Lg==", "CyasP");
        lIlIllIIIl[lIlIllIIll[88]] = lIIlIIlIIlllI("crZGw3ITlwE=", "mFHqF");
        lIlIllIIIl[lIlIllIIll[89]] = lIIlIIlIlIIII("JTovDj8TJ2NCIh8wMUpjXw==", "vUCjV");
        lIlIllIIIl[lIlIllIIll[90]] = lIIlIIlIIlllI("sXjQgcwIJe4=", "fVOxg");
        lIlIllIIIl[lIlIllIIll[91]] = lIIlIIlIIllll("tjA96uVzuUI=", "SDeCC");
        lIlIllIIIl[lIlIllIIll[92]] = lIIlIIlIlIIII("BjwKNg==", "BNeFn");
        lIlIllIIIl[lIlIllIIll[93]] = lIIlIIlIIllll("eyCsE9CDfuw=", "mbUyo");
        lIlIllIIIl[lIlIllIIll[94]] = lIIlIIlIlIIII("LgYbJg==", "jttVD");
        lIlIllIIIl[lIlIllIIll[103]] = lIIlIIlIlIIII("Gz0REgwhNB5LECkjHx4E", "HUpkv");
        lIlIllIIIl[lIlIllIIll[104]] = lIIlIIlIlIIII("GBwoJ1BY", "luMUp");
        lIlIllIIIl[lIlIllIIll[105]] = lIIlIIlIlIIII("GD02LmwFMng+KQs4LCFsQg==", "jTXIL");
        lIlIllIIIl[lIlIllIIll[106]] = lIIlIIlIIllll("F98Zak6i3OQ=", "qfcSz");
        lIlIllIIIl[lIlIllIIll[107]] = lIIlIIlIlIIII("CSY6Nhsp", "ZMSZw");
        lIlIllIIIl[lIlIllIIll[108]] = lIIlIIlIIllll("s83XEay3TgM=", "uuwAB");
        lIlIllIIIl[lIlIllIIll[16]] = lIIlIIlIIllll("g0jpE9LywZc=", "oJAZC");
        lIlIllIIIl[lIlIllIIll[109]] = lIIlIIlIIlllI("IAMov2bGh+0=", "OaFkk");
        lIlIllIIIl[lIlIllIIll[110]] = lIIlIIlIIllll("o7eXf/Rz430=", "jDUOV");
        lIlIllIIIl[lIlIllIIll[111]] = lIIlIIlIIlllI("6G6D8ol7N5A=", "Qavlz");
        lIlIllIIIl[lIlIllIIll[112]] = lIIlIIlIIlllI("To7+Pbjk/cY=", "PNVgK");
        lIlIllIIIl[lIlIllIIll[113]] = lIIlIIlIlIIII("OgUSDD8k", "JjfeP");
        lIlIllIIIl[lIlIllIIll[114]] = lIIlIIlIlIIII("eXp8", "QKUZB");
        lIlIllIIIl[lIlIllIIll[115]] = lIIlIIlIIllll("8PoMScafTro=", "IYgwL");
        lIlIllIIIl[lIlIllIIll[116]] = lIIlIIlIIlllI("NKqg0GrLVR4=", "qEvkk");
        lIlIllIIIl[lIlIllIIll[117]] = lIIlIIlIIllll("yUCIVkxye4A=", "yJgrw");
        lIlIllIIIl[lIlIllIIll[118]] = lIIlIIlIIlllI("NJ31WOq8sz0=", "VfMIm");
        lIlIllIIIl[lIlIllIIll[119]] = lIIlIIlIIllll("1LepiHiAJ5M=", "JgOtA");
        lIlIllIIIl[lIlIllIIll[120]] = lIIlIIlIlIIII("UjkuJzpaeG4=", "zMGBH");
        lIlIllIIIl[lIlIllIIll[121]] = lIIlIIlIIlllI("D3cThDHQiEQ=", "ZaERt");
        lIlIllIIIl[lIlIllIIll[122]] = lIIlIIlIIllll("Ox+bG7qe5Ho=", "oXRzc");
        lIlIllIIIl[lIlIllIIll[123]] = lIIlIIlIIlllI("DpTTtNEJvzA=", "YHVZW");
        lIlIllIIIl[lIlIllIIll[124]] = lIIlIIlIIllll("JNROh3qvtS8=", "lSgFx");
        lIlIllIIIl[lIlIllIIll[125]] = lIIlIIlIlIIII("Ew4dPzkN", "caiVV");
        lIlIllIIIl[lIlIllIIll[126]] = lIIlIIlIIlllI("wGjkOElkejDOhcXj84upFw==", "CjOLx");
        lIlIllIIIl[lIlIllIIll[127]] = lIIlIIlIIllll("5nbugq+Mzjo=", "plCqG");
        lIlIllIIIl[lIlIllIIll[128]] = lIIlIIlIIlllI("bYjQjt14Q7g=", "UjFIL");
        lIlIllIIIl[lIlIllIIll[129]] = lIIlIIlIIllll("dAUuY8y0XJ4=", "WYEoB");
        lIlIllIIIl[lIlIllIIll[130]] = lIIlIIlIlIIII("XnRl", "vELMe");
        lIlIllIIIl[lIlIllIIll[131]] = lIIlIIlIIlllI("ou46ALn99Hw=", "GNjsW");
        lIlIllIIIl[lIlIllIIll[132]] = lIIlIIlIIlllI("GsTUVsaQEbo=", "wZJbd");
        lIlIllIIIl[lIlIllIIll[133]] = lIIlIIlIIlllI("HomaTbLGbgM=", "mPLuY");
        lIlIllIIIl[lIlIllIIll[134]] = lIIlIIlIIllll("lgwkyObYMauSB0d1PdxU0A==", "JqMXz");
        lIlIllIIIl[lIlIllIIll[135]] = lIIlIIlIIlllI("RD8ON0IOMxM=", "qmQLm");
        lIlIllIIIl[lIlIllIIll[136]] = lIIlIIlIlIIII("WHxq", "pICwn");
        lIlIllIIIl[lIlIllIIll[137]] = lIIlIIlIlIIII("BBwQHz0a", "tsdvR");
        lIlIllIIIl[lIlIllIIll[138]] = lIIlIIlIIlllI("VAgT1JpHHSs=", "KxSiY");
        lIlIllIIIl[lIlIllIIll[139]] = lIIlIIlIlIIII("Mgw8EAos", "BcHye");
        lIlIllIIIl[lIlIllIIll[140]] = lIIlIIlIIlllI("Ideb6awcd9bWkTnXVhQOgA==", "SLNLp");
        lIlIllIIIl[lIlIllIIll[141]] = lIIlIIlIIlllI("Nb6sZLqHyw0=", "RrThj");
        lIlIllIIIl[lIlIllIIll[142]] = lIIlIIlIlIIII("W2pt", "sYDLg");
        lIlIllIIIl[lIlIllIIll[102]] = lIIlIIlIIllll("bC1iQvEH18o=", "kQjqy");
        lIlIllIIIl[lIlIllIIll[143]] = lIIlIIlIlIIII("UWxs", "yYEVP");
        lIlIllIIIl[lIlIllIIll[144]] = lIIlIIlIIllll("70bUqQPowNU=", "LUSCh");
        lIlIllIIIl[lIlIllIIll[145]] = lIIlIIlIlIIII("TnxM", "fHeKN");
        lIlIllIIIl[lIlIllIIll[146]] = lIIlIIlIIllll("qfBGw8dn/t0=", "ptdMu");
        lIlIllIIIl[lIlIllIIll[147]] = lIIlIIlIIlllI("4rxU+AQUH/NN0DxK2CX2hA==", "orYAK");
        lIlIllIIIl[lIlIllIIll[148]] = lIIlIIlIIlllI("3g01NLXbzV8=", "pMzAf");
        lIlIllIIIl[lIlIllIIll[149]] = lIIlIIlIIllll("asuObA59INA=", "OCVHJ");
        lIlIllIIIl[lIlIllIIll[150]] = lIIlIIlIlIIII("Nx4HJB4p", "GqsMq");
        lIlIllIIIl[lIlIllIIll[151]] = lIIlIIlIIlllI("0m5yqfXya1A=", "DZEae");
        lIlIllIIIl[lIlIllIIll[152]] = lIIlIIlIlIIII("CCgwECoW", "xGDyE");
        lIlIllIIIl[lIlIllIIll[153]] = lIIlIIlIIllll("2XbyEt9DkBQ=", "zpVkx");
        lIlIllIIIl[lIlIllIIll[154]] = lIIlIIlIIlllI("GA0MNwKFjvk=", "pibGX");
        lIlIllIIIl[lIlIllIIll[155]] = lIIlIIlIlIIII("WF1E", "pimsV");
        lIlIllIIIl[lIlIllIIll[156]] = lIIlIIlIlIIII("GgIeJxkE", "jmjNv");
        lIlIllIIIl[lIlIllIIll[157]] = lIIlIIlIIllll("7NKhYcHAoQrfRYS+Z+sDAg==", "URoSt");
        lIlIllIIIl[lIlIllIIll[158]] = lIIlIIlIlIIII("BwgcGBgJBg==", "jmxhy");
        lIlIllIIIl[lIlIllIIll[159]] = lIIlIIlIIlllI("WwDYK6oIcz8=", "HGbXy");
        lIlIllIIIl[lIlIllIIll[160]] = lIIlIIlIlIIII("PjsKPBUc", "nIkEp");
        lIlIllIIIl[lIlIllIIll[161]] = lIIlIIlIlIIII("BgY7Fh8m", "UmRzs");
        lIlIllIIIl[lIlIllIIll[162]] = lIIlIIlIlIIII("IAAsFQkA", "skEye");
        lIlIllIIIl[lIlIllIIll[163]] = lIIlIIlIIlllI("la2vHnLF90s=", "WiEMI");
        lIlIllIIIl[lIlIllIIll[164]] = lIIlIIlIIlllI("CEFcG7b5K4o=", "BbCeY");
        lIlIllIIIl[lIlIllIIll[165]] = lIIlIIlIIlllI("V0meYts6lWM4e1ZoHyZb3w==", "gBITc");
        lIlIllIIIl[lIlIllIIll[174]] = lIIlIIlIlIIII("PwIaSw==", "fgieY");
        lIlIllIIIl[lIlIllIIll[175]] = lIIlIIlIIlllI("Q/BQufDKx8FDf/46Q4bi9THjp5J24a9JsxDjh1+uL+g=", "bWjSy");
        lIlIllIIIl[lIlIllIIll[176]] = lIIlIIlIIllll("afewS9bUW/lLulevA1ANL7mXsZib3Uvk", "KuSJS");
        lIlIllIIIl[lIlIllIIll[177]] = lIIlIIlIIllll("pU8mF7TLxEuYNEct30SP/eUpyHK+b7vtKrTgt07dJEw=", "epGvD");
        lIlIllIIIl[lIlIllIIll[178]] = lIIlIIlIIlllI("Ke805+7dlbLyv9VHEdYsbX1lvrFEstrwJo8ovhjJEwQ=", "LPaRH");
        lIlIllIIIl[lIlIllIIll[179]] = lIIlIIlIlIIII("CRgnNEFmOmY/CCUYKSNND1MlLANmBycmCGYKKThD", "FsFMm");
        lIlIllIIIl[lIlIllIIll[180]] = lIIlIIlIIlllI("+zUAh0V2eJ68nzjSV2NiU89y9Qt+SpunziH+jHWy2yI=", "CEyrL");
        lIlIllIIIl[lIlIllIIll[181]] = lIIlIIlIIlllI("Zw/FVDw6/RwiFVKCRTdQBlxbp6NF6bUy", "JOHTJ");
        lIlIllIIIl[lIlIllIIll[182]] = lIIlIIlIIllll("K0/hlqsVoELwdPbfhNFh4XGVtJymq88D9Yt81psPiEfBeMSRNwEf+QxRtlIXZJ2k", "dobiE");
    }

    private static void lIIlIIlIlllll() {
        lIlIllIIll = new int[184];
        lIlIllIIll[0] = " ".length();
        lIlIllIIll[1] = (74 ^ 0) & ((30 ^ 84) ^ (-1));
        lIlIllIIll[2] = (-((-7379) & 15606)) & (-18449) & 31675;
        lIlIllIIll[3] = "  ".length();
        lIlIllIIll[4] = 58 ^ 62;
        lIlIllIIll[5] = "   ".length();
        lIlIllIIll[6] = (-18439) & 31063;
        lIlIllIIll[7] = (-12410) & 14843;
        lIlIllIIll[8] = (((92 + 130) - 170) + 79) ^ (((15 + 98) - (-26)) + 0);
        lIlIllIIll[9] = 117 ^ 112;
        lIlIllIIll[10] = (-9) & 8015;
        lIlIllIIll[11] = (-((-6307) & 22975)) & (-4130) & 32765;
        lIlIllIIll[12] = (-((-4129) & 31469)) & (-1) & 28671;
        lIlIllIIll[13] = (221 ^ 182) ^ (32 ^ 65);
        lIlIllIIll[14] = (((130 + 124) - 144) + 80) ^ (((75 + 14) - (-68)) + 27);
        lIlIllIIll[15] = (((151 + 158) - 296) + 150) ^ (((44 + 82) - 22) + 60);
        lIlIllIIll[16] = (121 ^ 48) ^ (173 ^ 165);
        lIlIllIIll[17] = 85 ^ 92;
        lIlIllIIll[18] = 27 ^ 16;
        lIlIllIIll[19] = (82 ^ 43) ^ (51 ^ 70);
        lIlIllIIll[20] = 32 ^ 45;
        lIlIllIIll[21] = 16 ^ 30;
        lIlIllIIll[22] = 145 ^ 158;
        lIlIllIIll[23] = (-((-1041) & 27899)) & (-273) & 28667;
        lIlIllIIll[24] = (-20821) & 24437;
        lIlIllIIll[25] = (23 ^ 56) ^ (85 ^ 106);
        lIlIllIIll[26] = (-((-513) & 25153)) & (-6161) & 32343;
        lIlIllIIll[27] = (-((-2725) & 15293)) & (-16449) & 32639;
        lIlIllIIll[28] = 190 ^ 175;
        lIlIllIIll[29] = 132 ^ 150;
        lIlIllIIll[30] = 35 ^ 48;
        lIlIllIIll[31] = 73 ^ 93;
        lIlIllIIll[32] = (254 ^ 196) ^ (54 ^ 25);
        lIlIllIIll[33] = 90 ^ 76;
        lIlIllIIll[34] = (((22 + 19) - (-24)) + 85) ^ (((97 + 128) - 115) + 19);
        lIlIllIIll[35] = (156 ^ 188) ^ (41 ^ 17);
        lIlIllIIll[36] = (((5 + 135) - 125) + 166) ^ (((78 + 160) - 150) + 84);
        lIlIllIIll[37] = (82 ^ 97) ^ (66 ^ 107);
        lIlIllIIll[38] = (255 ^ 187) ^ (220 ^ 131);
        lIlIllIIll[39] = (93 ^ 38) ^ (89 ^ 62);
        lIlIllIIll[40] = 73 ^ 84;
        lIlIllIIll[41] = 220 ^ 194;
        lIlIllIIll[42] = (((24 + 93) - (-32)) + 9) ^ (((107 + 89) - 80) + 13);
        lIlIllIIll[43] = 86 ^ 118;
        lIlIllIIll[44] = (174 ^ 197) ^ (54 ^ 124);
        lIlIllIIll[45] = 64 ^ 98;
        lIlIllIIll[46] = 45 ^ 14;
        lIlIllIIll[47] = (194 ^ 159) ^ (123 ^ 2);
        lIlIllIIll[48] = (-2113) & 15470;
        lIlIllIIll[49] = (-17153) & 30509;
        lIlIllIIll[50] = (-((-17649) & 19957)) & (-586) & 16253;
        lIlIllIIll[51] = (-19025) & 32383;
        lIlIllIIll[52] = (-((-12597) & 31615)) & (-385) & 32763;
        lIlIllIIll[53] = 167 ^ 130;
        lIlIllIIll[54] = 85 ^ 115;
        lIlIllIIll[55] = 46 ^ 9;
        lIlIllIIll[56] = (-18689) & 32051;
        lIlIllIIll[57] = (-((-5170) & 24499)) & (-73) & 32763;
        lIlIllIIll[58] = (-16771) & 30135;
        lIlIllIIll[59] = (-((-9265) & 28603)) & (-66) & 32767;
        lIlIllIIll[60] = (-((-12405) & 12925)) & (-66) & 13951;
        lIlIllIIll[61] = (46 ^ 116) ^ (6 ^ 116);
        lIlIllIIll[62] = 36 ^ 13;
        lIlIllIIll[63] = (((151 + 79) - 151) + 106) ^ (((53 + 101) - 125) + 118);
        lIlIllIIll[64] = (-18563) & 31930;
        lIlIllIIll[65] = (-((-4129) & 21097)) & (-2305) & 32639;
        lIlIllIIll[66] = (-((-3958) & 20471)) & (-513) & 30395;
        lIlIllIIll[67] = (-((-25) & 17305)) & (-7) & 30655;
        lIlIllIIll[68] = (-2437) & 15807;
        lIlIllIIll[69] = (49 ^ 34) ^ (154 ^ 162);
        lIlIllIIll[70] = (201 ^ 148) ^ (127 ^ 14);
        lIlIllIIll[71] = 2 ^ 47;
        lIlIllIIll[72] = 135 ^ 169;
        lIlIllIIll[73] = (-18561) & 31933;
        lIlIllIIll[74] = (-((-12369) & 30929)) & (-4) & 31935;
        lIlIllIIll[75] = (-((-11455) & 27903)) & (-2177) & 31999;
        lIlIllIIll[76] = (-((-25281) & 25538)) & (-18433) & 32063;
        lIlIllIIll[77] = (-((-66) & 16845)) & (-1) & 30155;
        lIlIllIIll[78] = 45 ^ 2;
        lIlIllIIll[79] = (133 ^ 146) ^ (135 ^ 160);
        lIlIllIIll[80] = (35 ^ 21) ^ (162 ^ 165);
        lIlIllIIll[81] = 32 ^ 18;
        lIlIllIIll[82] = (-926) & 14303;
        lIlIllIIll[83] = (-155) & 13531;
        lIlIllIIll[84] = (-2460) & 15839;
        lIlIllIIll[85] = (-2593) & 15971;
        lIlIllIIll[86] = (-2617) & 15997;
        lIlIllIIll[87] = (170 ^ 181) ^ (178 ^ 158);
        lIlIllIIll[88] = (115 ^ 31) ^ (23 ^ 79);
        lIlIllIIll[89] = 191 ^ 138;
        lIlIllIIll[90] = 51 ^ 5;
        lIlIllIIll[91] = (135 ^ 189) ^ (99 ^ 110);
        lIlIllIIll[92] = (239 ^ 157) ^ (98 ^ 40);
        lIlIllIIll[93] = 0 ^ 57;
        lIlIllIIll[94] = (((92 + 115) - 187) + 166) ^ (((103 + 100) - 192) + 117);
        lIlIllIIll[95] = (-7201) & 32700;
        lIlIllIIll[96] = (-((-24773) & 30149)) & (-10774) & 49149;
        lIlIllIIll[97] = (-((-17261) & 25582)) & (-2307) & 49127;
        lIlIllIIll[98] = (-35) & 12014;
        lIlIllIIll[99] = (-68) & 25067;
        lIlIllIIll[100] = (-((-29221) & 29559)) & (-16417) & 32254;
        lIlIllIIll[101] = (-((-2317) & 11646)) & (-18433) & 28661;
        lIlIllIIll[102] = (8 ^ 99) ^ (103 ^ 104);
        lIlIllIIll[103] = 43 ^ 16;
        lIlIllIIll[104] = (((31 + 5) - (-14)) + 92) ^ (((27 + 118) - 80) + 113);
        lIlIllIIll[105] = (79 ^ 61) ^ (118 ^ 57);
        lIlIllIIll[106] = (61 ^ 15) ^ (10 ^ 6);
        lIlIllIIll[107] = 17 ^ 46;
        lIlIllIIll[108] = (((205 + 192) - 227) + 74) ^ (((135 + 170) - 176) + 51);
        lIlIllIIll[109] = 82 ^ 16;
        lIlIllIIll[110] = 126 ^ 61;
        lIlIllIIll[111] = (25 ^ 11) ^ (82 ^ 4);
        lIlIllIIll[112] = 57 ^ 124;
        lIlIllIIll[113] = 238 ^ 168;
        lIlIllIIll[114] = 251 ^ 188;
        lIlIllIIll[115] = (((47 + 9) - 6) + 151) ^ (((11 + 49) - 2) + 71);
        lIlIllIIll[116] = (111 ^ 101) ^ (54 ^ 117);
        lIlIllIIll[117] = (60 ^ 106) ^ (189 ^ 161);
        lIlIllIIll[118] = (1 ^ 17) ^ (234 ^ 177);
        lIlIllIIll[119] = 81 ^ 29;
        lIlIllIIll[120] = 76 ^ 1;
        lIlIllIIll[121] = 68 ^ 10;
        lIlIllIIll[122] = 253 ^ 178;
        lIlIllIIll[123] = 213 ^ 133;
        lIlIllIIll[124] = 59 ^ 106;
        lIlIllIIll[125] = 150 ^ 196;
        lIlIllIIll[126] = 227 ^ 176;
        lIlIllIIll[127] = (((110 + 164) - 240) + 169) ^ (((20 + 20) - (-47)) + 72);
        lIlIllIIll[128] = (((103 + 89) - 49) + 74) ^ (((110 + 25) - 33) + 38);
        lIlIllIIll[129] = (74 ^ 5) ^ (63 ^ 38);
        lIlIllIIll[130] = (((87 + 13) - 60) + 87) ^ (190 ^ 150);
        lIlIllIIll[131] = (189 ^ 154) ^ (((109 + 89) - 164) + 93);
        lIlIllIIll[132] = 99 ^ 58;
        lIlIllIIll[133] = (24 ^ 53) ^ (106 ^ 29);
        lIlIllIIll[134] = 236 ^ 183;
        lIlIllIIll[135] = 157 ^ 193;
        lIlIllIIll[136] = 45 ^ 112;
        lIlIllIIll[137] = 39 ^ 121;
        lIlIllIIll[138] = 246 ^ 169;
        lIlIllIIll[139] = 160 ^ 192;
        lIlIllIIll[140] = 208 ^ 177;
        lIlIllIIll[141] = 113 ^ 19;
        lIlIllIIll[142] = 96 ^ 3;
        lIlIllIIll[143] = (208 ^ 184) ^ (11 ^ 6);
        lIlIllIIll[144] = (1 ^ 121) ^ (146 ^ 140);
        lIlIllIIll[145] = (((45 + 131) - 34) + 96) ^ (((99 + 54) - 51) + 35);
        lIlIllIIll[146] = (67 ^ 92) ^ (11 ^ 124);
        lIlIllIIll[147] = (1 ^ 82) ^ (91 ^ 97);
        lIlIllIIll[148] = 222 ^ 180;
        lIlIllIIll[149] = (92 ^ 105) ^ (83 ^ 13);
        lIlIllIIll[150] = (39 ^ 69) ^ (185 ^ 183);
        lIlIllIIll[151] = (245 ^ 141) ^ (8 ^ 29);
        lIlIllIIll[152] = 7 ^ 105;
        lIlIllIIll[153] = (2 ^ 117) ^ (110 ^ 118);
        lIlIllIIll[154] = (44 ^ 27) ^ (101 ^ 34);
        lIlIllIIll[155] = 99 ^ 18;
        lIlIllIIll[156] = 24 ^ 106;
        lIlIllIIll[157] = 96 ^ 19;
        lIlIllIIll[158] = 179 ^ 199;
        lIlIllIIll[159] = (69 ^ 2) ^ (163 ^ 145);
        lIlIllIIll[160] = 242 ^ 132;
        lIlIllIIll[161] = (((47 + 60) - 54) + 124) ^ (((140 + 82) - 87) + 63);
        lIlIllIIll[162] = (52 ^ 50) ^ (52 ^ 74);
        lIlIllIIll[163] = 57 ^ 64;
        lIlIllIIll[164] = 65 ^ 59;
        lIlIllIIll[165] = 56 ^ 67;
        lIlIllIIll[166] = (-20529) & 23735;
        lIlIllIIll[167] = (-12841) & 16062;
        lIlIllIIll[168] = (-9297) & 12253;
        lIlIllIIll[169] = (-12434) & 15805;
        lIlIllIIll[170] = (-17409) & 20273;
        lIlIllIIll[171] = (-2115) & 11991;
        lIlIllIIll[172] = (-((-23305) & 31549)) & (-16385) & 27637;
        lIlIllIIll[173] = (-8771) & 12243;
        lIlIllIIll[174] = (88 ^ 123) ^ (109 ^ 50);
        lIlIllIIll[175] = (((47 + 10) - 14) + 156) ^ (((157 + 49) - 90) + 70);
        lIlIllIIll[176] = (((82 + 12) - 73) + 220) ^ (((7 + 119) - 84) + 101);
        lIlIllIIll[177] = (((164 ^ 138) + (241 ^ 128)) - (((125 + 22) - 27) + 20)) + (94 ^ 50);
        lIlIllIIll[178] = ((111 + 23) - 12) + 6;
        lIlIllIIll[179] = ((34 + 105) - 17) + 7;
        lIlIllIIll[180] = ((97 + 89) - 82) + 26;
        lIlIllIIll[181] = (((40 ^ 36) + (87 ^ 125)) - (130 ^ 132)) + (51 ^ 96);
        lIlIllIIll[182] = (((248 ^ 189) + (2 ^ 38)) - (1 ^ 69)) + (234 ^ 181);
        lIlIllIIll[183] = ((70 + 64) - 41) + 40;
    }

    public static void aR() {
        do {
            int[] iArr = new int[lIlIllIIll[0]];
            iArr[lIlIllIIll[1]] = lIlIllIIll[68];
            if (lIIlIIllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIllIIll[0]];
                iArr2[lIlIllIIll[1]] = lIlIllIIll[67];
                if (lIIlIIllIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIllIIll[0]];
                    iArr3[lIlIllIIll[1]] = lIlIllIIll[66];
                    if (lIIlIIllIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIllIIll[0]];
                        iArr4[lIlIllIIll[1]] = lIlIllIIll[64];
                        if (lIIlIIllIIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIllIIll[0]];
                            iArr5[lIlIllIIll[1]] = lIlIllIIll[65];
                            if (!lIIlIIllIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                                return;
                            }
                        }
                    }
                }
            }
            Inventory.getFirst(item -> {
                if (lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[110]]) ? 1 : 0) && lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[111]]) ? 1 : 0)) {
                    ?? r0 = lIlIllIIll[0];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIllIIll[1];
            }).interact(lIlIllIIIl[lIlIllIIll[93]]);
            Time.sleepTicks(lIlIllIIll[3]);
            "".length();
            if (lIIlIIllIIIII(AccBuilderShamans.d ? 1 : 0)) {
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            }
            C0006g.a(cy);
            "".length();
        } while ((-(76 ^ 72)) <= 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        int[] iArr = new int[lIlIllIIll[0]];
        iArr[lIlIllIIll[1]] = lIlIllIIll[82];
        if (lIIlIIllIIIII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIllIIll[0]];
            iArr2[lIlIllIIll[1]] = lIlIllIIll[83];
            if (lIIlIIllIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlIllIIll[0]];
                iArr3[lIlIllIIll[1]] = lIlIllIIll[84];
                if (lIIlIIllIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIlIllIIll[0]];
                    iArr4[lIlIllIIll[1]] = lIlIllIIll[85];
                    if (lIIlIIllIIIII(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIllIIll[0]];
                        iArr5[lIlIllIIll[1]] = lIlIllIIll[86];
                        if (lIIlIIllIIIII(Inventory.contains(iArr5) ? 1 : 0) && lIIlIIllIIIlI(Inventory.contains(item -> {
                            return item.getName().contains(lIlIllIIIl[lIlIllIIll[104]]);
                        }) ? 1 : 0)) {
                            ?? r0 = lIlIllIIll[0];
                            "".length();
                            return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                }
            }
        }
        return lIlIllIIll[1];
    }

    private static boolean lIIlIIllIIlII(int i) {
        return i > 0;
    }

    private static boolean lIIlIIllIIIlI(int i) {
        return i == 0;
    }

    private static String lIIlIIlIIlllI(String lllllllllllllllllllIlIIIlIllIIIl, String lllllllllllllllllllIlIIIlIllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIlIllIIII.getBytes(StandardCharsets.UTF_8)), lIlIllIIll[8]), "DES");
            Cipher lllllllllllllllllllIlIIIlIllIIll = Cipher.getInstance("DES");
            lllllllllllllllllllIlIIIlIllIIll.init(lIlIllIIll[3], secretKeySpec);
            return new String(lllllllllllllllllllIlIIIlIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIlIIIlIllIIlI) {
            lllllllllllllllllllIlIIIlIllIIlI.printStackTrace();
            return null;
        }
    }

    public static void aS() {
        do {
            int[] iArr = new int[lIlIllIIll[0]];
            iArr[lIlIllIIll[1]] = lIlIllIIll[77];
            if (lIIlIIllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIllIIll[0]];
                iArr2[lIlIllIIll[1]] = lIlIllIIll[76];
                if (lIIlIIllIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIllIIll[0]];
                    iArr3[lIlIllIIll[1]] = lIlIllIIll[75];
                    if (lIIlIIllIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIllIIll[0]];
                        iArr4[lIlIllIIll[1]] = lIlIllIIll[73];
                        if (lIIlIIllIIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIllIIll[0]];
                            iArr5[lIlIllIIll[1]] = lIlIllIIll[74];
                            if (!lIIlIIllIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                                return;
                            }
                        }
                    }
                }
            }
            Inventory.getFirst(item -> {
                if (lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[16]]) ? 1 : 0) && lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[109]]) ? 1 : 0)) {
                    ?? r0 = lIlIllIIll[0];
                    "".length();
                    return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? ((((173 + 246) - 202) + 37) ^ (((175 + 79) - 61) + 1)) & (((18 ^ 62) ^ (116 ^ 100)) ^ (-" ".length())) : r0;
                }
                return lIlIllIIll[1];
            }).interact(lIlIllIIIl[lIlIllIIll[94]]);
            Time.sleepTicks(lIlIllIIll[3]);
            "".length();
            if (lIIlIIllIIIII(AccBuilderShamans.d ? 1 : 0)) {
                "".length();
                if ((((45 ^ 59) ^ (55 ^ 105)) & (((34 ^ 29) ^ (109 ^ 26)) ^ (-" ".length()))) < 0) {
                    return;
                }
                return;
            }
            C0006g.a(cy);
            "".length();
        } while ((-"  ".length()) < 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0129, code lost:
        if (lIIlIIllIIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0016q.lIlIllIIll[9]) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01af, code lost:
        if (lIIlIIllIIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0016q.lIlIllIIll[13]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[lIlIllIIll[0]];
        iArr3[lIlIllIIll[1]] = lIlIllIIll[11];
        if (lIIlIIllIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIll[11], lIlIllIIll[0], lIlIllIIll[95]));
            "".length();
        }
        int[] iArr4 = new int[lIlIllIIll[0]];
        iArr4[lIlIllIIll[1]] = lIlIllIIll[12];
        if (lIIlIIllIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIll[12], lIlIllIIll[0], C0004e.c(lIlIllIIll[96], lIlIllIIll[97])));
            "".length();
        }
        if (lIIlIIllIIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIllIIIl[lIlIllIIll[105]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIllIIll[98], lIlIllIIll[9], lIlIllIIll[99]));
            "".length();
        }
        int[] iArr5 = new int[lIlIllIIll[0]];
        iArr5[lIlIllIIll[1]] = lIlIllIIll[6];
        if (lIIlIIllIIIII(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIlIllIIll[0]];
            iArr6[lIlIllIIll[1]] = lIlIllIIll[6];
            if (lIIlIIllIIIII(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lIlIllIIll[0]];
                iArr7[lIlIllIIll[1]] = lIlIllIIll[6];
            }
            iArr = new int[lIlIllIIll[0]];
            iArr[lIlIllIIll[1]] = lIlIllIIll[7];
            if (lIIlIIllIIIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIllIIll[0]];
                iArr8[lIlIllIIll[1]] = lIlIllIIll[7];
                if (lIIlIIllIIIII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIlIllIIll[0]];
                    iArr9[lIlIllIIll[1]] = lIlIllIIll[7];
                }
                iArr2 = new int[lIlIllIIll[0]];
                iArr2[lIlIllIIll[1]] = lIlIllIIll[10];
                if (lIIlIIllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIllIIll[0]];
                    iArr10[lIlIllIIll[1]] = lIlIllIIll[10];
                    if (!lIIlIIllIIIII(Bank.contains(iArr10) ? 1 : 0)) {
                        return;
                    }
                    int[] iArr11 = new int[lIlIllIIll[0]];
                    iArr11[lIlIllIIll[1]] = lIlIllIIll[10];
                    if (!lIIlIIllIIIIl(Bank.getFirst(iArr11).getQuantity(), lIlIllIIll[22])) {
                        return;
                    }
                }
                bp.add(new C0003d(lIlIllIIll[10], lIlIllIIll[61], lIlIllIIll[101]));
                "".length();
            }
            bp.add(new C0003d(lIlIllIIll[7], lIlIllIIll[13], lIlIllIIll[100]));
            "".length();
            iArr2 = new int[lIlIllIIll[0]];
            iArr2[lIlIllIIll[1]] = lIlIllIIll[10];
            if (lIIlIIllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bp.add(new C0003d(lIlIllIIll[10], lIlIllIIll[61], lIlIllIIll[101]));
            "".length();
        }
        bp.add(new C0003d(lIlIllIIll[6], lIlIllIIll[9], C0009j.bZ));
        "".length();
        iArr = new int[lIlIllIIll[0]];
        iArr[lIlIllIIll[1]] = lIlIllIIll[7];
        if (lIIlIIllIIIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIllIIll[7], lIlIllIIll[13], lIlIllIIll[100]));
        "".length();
        iArr2 = new int[lIlIllIIll[0]];
        iArr2[lIlIllIIll[1]] = lIlIllIIll[10];
        if (lIIlIIllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIllIIll[10], lIlIllIIll[61], lIlIllIIll[101]));
        "".length();
    }

    private static boolean lIIlIIllIIIIl(int i, int i2) {
        return i < i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIllIIIl[lIlIllIIll[103]];
    }

    private static String lIIlIIlIlIIII(String lllllllllllllllllllIlIIIllIIIllI, String lllllllllllllllllllIlIIIllIIIlIl) {
        String lllllllllllllllllllIlIIIllIIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIlIIIllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllllIlIIIllIIIIll = lllllllllllllllllllIlIIIllIIIlIl.toCharArray();
        int lllllllllllllllllllIlIIIlIllllIl = lIlIllIIll[1];
        char[] charArray = lllllllllllllllllllIlIIIllIIIllI2.toCharArray();
        int length = charArray.length;
        int i = lIlIllIIll[1];
        while (lIIlIIllIIIIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllllllIlIIIllIIIIll[lllllllllllllllllllIlIIIlIllllIl % lllllllllllllllllllIlIIIllIIIIll.length]));
            "".length();
            lllllllllllllllllllIlIIIlIllllIl++;
            i++;
            "".length();
            if (((46 ^ 26) ^ (104 ^ 88)) > ((((1 + 90) - (-78)) + 24) ^ (((174 + 63) - 125) + 85))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIIllIIlIl(Object obj) {
        return obj == null;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            aO();
            "".length();
            if (((13 ^ 1) & ((107 ^ 103) ^ (-1))) < 0) {
                return (159 ^ 165) & ((97 ^ 91) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIllIIll[102];
    }

    public static void aP() {
        do {
            int[] iArr = new int[lIlIllIIll[0]];
            iArr[lIlIllIIll[1]] = lIlIllIIll[52];
            if (lIIlIIllIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIllIIll[0]];
                iArr2[lIlIllIIll[1]] = lIlIllIIll[51];
                if (lIIlIIllIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlIllIIll[0]];
                    iArr3[lIlIllIIll[1]] = lIlIllIIll[50];
                    if (lIIlIIllIIIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlIllIIll[0]];
                        iArr4[lIlIllIIll[1]] = lIlIllIIll[48];
                        if (lIIlIIllIIIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlIllIIll[0]];
                            iArr5[lIlIllIIll[1]] = lIlIllIIll[49];
                            if (!lIIlIIllIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                                return;
                            }
                        }
                    }
                }
            }
            Inventory.getFirst(item -> {
                if (lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[114]]) ? 1 : 0) && lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[115]]) ? 1 : 0)) {
                    ?? r0 = lIlIllIIll[0];
                    "".length();
                    return !((true ^ true) ^ (true ^ true)) ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                }
                return lIlIllIIll[1];
            }).interact(lIlIllIIIl[lIlIllIIll[91]]);
            Time.sleepTicks(lIlIllIIll[3]);
            "".length();
            if (lIIlIIllIIIII(AccBuilderShamans.d ? 1 : 0)) {
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            }
            C0006g.a(cy);
            "".length();
        } while ("   ".length() != 0);
    }

    private static boolean lIIlIIllIIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIllIIll[1];
    }

    static {
        lIIlIIlIlllll();
        lIIlIIlIllllI();
        bp = new ArrayList();
        cR = new WorldPoint(lIlIllIIll[166], lIlIllIIll[167], lIlIllIIll[1]);
        cS = new WorldPoint(lIlIllIIll[168], lIlIllIIll[169], lIlIllIIll[1]);
        cT = new WorldPoint(lIlIllIIll[170], lIlIllIIll[171], lIlIllIIll[1]);
        cU = new WorldPoint(lIlIllIIll[172], lIlIllIIll[173], lIlIllIIll[1]);
        String[] strArr = new String[lIlIllIIll[17]];
        strArr[lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[174]];
        strArr[lIlIllIIll[0]] = lIlIllIIIl[lIlIllIIll[175]];
        strArr[lIlIllIIll[3]] = lIlIllIIIl[lIlIllIIll[176]];
        strArr[lIlIllIIll[5]] = lIlIllIIIl[lIlIllIIll[177]];
        strArr[lIlIllIIll[4]] = lIlIllIIIl[lIlIllIIll[178]];
        strArr[lIlIllIIll[9]] = lIlIllIIIl[lIlIllIIll[179]];
        strArr[lIlIllIIll[14]] = lIlIllIIIl[lIlIllIIll[180]];
        strArr[lIlIllIIll[15]] = lIlIllIIIl[lIlIllIIll[181]];
        strArr[lIlIllIIll[8]] = lIlIllIIIl[lIlIllIIll[182]];
        cy = strArr;
    }
}
