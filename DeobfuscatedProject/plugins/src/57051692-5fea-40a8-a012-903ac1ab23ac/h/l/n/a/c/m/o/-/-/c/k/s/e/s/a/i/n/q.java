/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
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

public class q
implements K {
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
    public static /* synthetic */ List<d> bp;
    static /* synthetic */ WorldPoint cT;
    public static /* synthetic */ boolean cM;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        block6: {
            block5: {
                int[] nArray = new int[lIlIllIIll[0]];
                nArray[q.lIlIllIIll[1]] = lIlIllIIll[12];
                if (!q.lIIlIIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block5;
                int[] nArray2 = new int[lIlIllIIll[0]];
                nArray2[q.lIlIllIIll[1]] = lIlIllIIll[12];
                if (!q.lIIlIIllIIIII(Equipment.contains((int[])nArray2) ? 1 : 0)) break block6;
            }
            if (q.lIIlIIllIIIII(Inventory.contains(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[108]])) ? 1 : 0) && (!q.lIIlIIllIIIlI(Inventory.contains(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[107]])) ? 1 : 0) || q.lIIlIIllIIIII(Equipment.contains(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[106]])) ? 1 : 0))) {
                int[] nArray = new int[lIlIllIIll[0]];
                nArray[q.lIlIllIIll[1]] = lIlIllIIll[10];
                if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = lIlIllIIll[0];
                    "".length();
                    if (" ".length() >= 0) return n2 != 0;
                    return ((0xE6 ^ 0xA8) & ~(0xFD ^ 0xB3)) != 0;
                }
            }
        }
        n2 = lIlIllIIll[1];
        return n2 != 0;
    }

    public static void aQ() {
        block7: {
            do {
                int[] nArray = new int[lIlIllIIll[0]];
                nArray[q.lIlIllIIll[1]] = lIlIllIIll[60];
                if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIlIllIIll[0]];
                    nArray2[q.lIlIllIIll[1]] = lIlIllIIll[59];
                    if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIlIllIIll[0]];
                        nArray3[q.lIlIllIIll[1]] = lIlIllIIll[58];
                        if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIlIllIIll[0]];
                            nArray4[q.lIlIllIIll[1]] = lIlIllIIll[56];
                            if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIlIllIIll[0]];
                                nArray5[q.lIlIllIIll[1]] = lIlIllIIll[57];
                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block7;
                            }
                        }
                    }
                }
                Inventory.getFirst(item -> {
                    int n2;
                    if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[112]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[113]]) ? 1 : 0)) {
                        n2 = lIlIllIIll[0];
                        "".length();
                        if ("   ".length() <= "  ".length()) {
                            return ((127 + 52 - 66 + 77 ^ 59 + 23 - -76 + 25) & (0x75 ^ 0x7C ^ (0xDF ^ 0x98) & ~(0x57 ^ 0x10) ^ -" ".length())) != 0;
                        }
                    } else {
                        n2 = lIlIllIIll[1];
                    }
                    return n2 != 0;
                }).interact(lIlIllIIIl[lIlIllIIll[92]]);
                Time.sleepTicks((int)lIlIllIIll[3]);
                "".length();
                if (q.lIIlIIllIIIII(AccBuilderShamans.d ? 1 : 0)) {
                    "".length();
                    if ((16 + 104 - 44 + 68 ^ 136 + 63 - 70 + 19) < -" ".length()) {
                        return;
                    }
                    break block7;
                }
                g.a(cy);
                "".length();
            } while (-" ".length() == -" ".length());
            return;
        }
    }

    public static void aO() {
        block96: {
            block97: {
                block98: {
                    NPC lllllllllllllllllllIlIIlIIIIlIll;
                    block107: {
                        block106: {
                            block105: {
                                block104: {
                                    block103: {
                                        block102: {
                                            block101: {
                                                block100: {
                                                    block99: {
                                                        TileItem lllllllllllllllllllIlIIlIIIIllII;
                                                        BankLocation lllllllllllllllllllIlIIlIIIIllIl;
                                                        if (q.lIIlIIllIIIII(bn ? 1 : 0)) {
                                                            b.a(bp);
                                                            if (q.lIIlIIllIIIIl(bp.size(), lIlIllIIll[0])) {
                                                                System.out.println(lIlIllIIIl[lIlIllIIll[1]]);
                                                                bn = lIlIllIIll[1];
                                                            }
                                                        }
                                                        if (!q.lIIlIIllIIIlI(bn ? 1 : 0)) break block96;
                                                        if (q.lIIlIIllIIIlI(q.al() ? 1 : 0)) {
                                                            lllllllllllllllllllIlIIlIIIIllIl = BankLocation.getNearest();
                                                            if (q.lIIlIIllIIIll(lllllllllllllllllllIlIIlIIIIllIl) && q.lIIlIIllIIIlI(lllllllllllllllllllIlIIlIIIIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[0]];
                                                                a.a(lllllllllllllllllllIlIIlIIIIllIl);
                                                            }
                                                            if (q.lIIlIIllIIIll(lllllllllllllllllllIlIIlIIIIllIl) && q.lIIlIIllIIIII(lllllllllllllllllllIlIIlIIIIllIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                if (q.lIIlIIllIIIlI(Bank.isOpen() ? 1 : 0)) {
                                                                    a.a();
                                                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIllIIll[2]);
                                                                    "".length();
                                                                }
                                                                if (q.lIIlIIllIIIII(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[3]];
                                                                    if (q.lIIlIIllIIlII(Inventory.getAll().size())) {
                                                                        Bank.depositInventory();
                                                                        Time.sleepTicks((int)lIlIllIIll[4]);
                                                                        "".length();
                                                                    }
                                                                    if (q.lIIlIIllIIlII(Equipment.getAll().size())) {
                                                                        Bank.depositEquipment();
                                                                        Time.sleepTicks((int)lIlIllIIll[3]);
                                                                        "".length();
                                                                    }
                                                                    Time.sleepTicks((int)lIlIllIIll[5]);
                                                                    "".length();
                                                                    int[] nArray = new int[lIlIllIIll[0]];
                                                                    nArray[q.lIlIllIIll[1]] = lIlIllIIll[6];
                                                                    if (q.lIIlIIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                                        q.O();
                                                                        System.out.println(lIlIllIIIl[lIlIllIIll[5]]);
                                                                        bn = lIlIllIIll[0];
                                                                        return;
                                                                    }
                                                                    int[] nArray2 = new int[lIlIllIIll[0]];
                                                                    nArray2[q.lIlIllIIll[1]] = lIlIllIIll[7];
                                                                    if (q.lIIlIIllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                                                        int[] nArray3 = new int[lIlIllIIll[0]];
                                                                        nArray3[q.lIlIllIIll[1]] = lIlIllIIll[7];
                                                                        if (q.lIIlIIllIIIIl(Bank.getFirst((int[])nArray3).getQuantity(), lIlIllIIll[8])) {
                                                                            q.O();
                                                                            System.out.println(lIlIllIIIl[lIlIllIIll[4]]);
                                                                            bn = lIlIllIIll[0];
                                                                            return;
                                                                        }
                                                                    }
                                                                    int[] nArray4 = new int[lIlIllIIll[9]];
                                                                    nArray4[q.lIlIllIIll[1]] = lIlIllIIll[10];
                                                                    nArray4[q.lIlIllIIll[0]] = lIlIllIIll[11];
                                                                    nArray4[q.lIlIllIIll[3]] = lIlIllIIll[6];
                                                                    nArray4[q.lIlIllIIll[5]] = lIlIllIIll[12];
                                                                    nArray4[q.lIlIllIIll[4]] = lIlIllIIll[7];
                                                                    if (q.lIIlIIllIIIlI(e.b(nArray4) ? 1 : 0)) {
                                                                        q.O();
                                                                        System.out.println(lIlIllIIIl[lIlIllIIll[9]]);
                                                                        bn = lIlIllIIll[0];
                                                                        return;
                                                                    }
                                                                    int[] nArray5 = new int[lIlIllIIll[9]];
                                                                    nArray5[q.lIlIllIIll[1]] = lIlIllIIll[10];
                                                                    nArray5[q.lIlIllIIll[0]] = lIlIllIIll[11];
                                                                    nArray5[q.lIlIllIIll[3]] = lIlIllIIll[6];
                                                                    nArray5[q.lIlIllIIll[5]] = lIlIllIIll[12];
                                                                    nArray5[q.lIlIllIIll[4]] = lIlIllIIll[7];
                                                                    if (q.lIIlIIllIIIII(e.b(nArray5) ? 1 : 0)) {
                                                                        a.a(lIlIllIIll[11], lIlIllIIll[0]);
                                                                        a.a(lIlIllIIll[6], lIlIllIIll[3]);
                                                                        a.a(lIlIllIIll[7], lIlIllIIll[13]);
                                                                        a.b(f.be, lIlIllIIll[0]);
                                                                        a.a(lIlIllIIll[12], lIlIllIIll[0]);
                                                                        a.a(lIlIllIIll[10], lIlIllIIll[13]);
                                                                        Bank.withdrawAll(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[165]]), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!q.lIIlIIllIIIII(q.al() ? 1 : 0)) break block97;
                                                        e.l(lIlIllIIll[12]);
                                                        if (q.lIIlIIllIIIII(Inventory.contains(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[164]])) ? 1 : 0)) {
                                                            Inventory.getFirst(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[163]])).interact(lIlIllIIIl[lIlIllIIll[14]]);
                                                        }
                                                        if (q.lIIlIIllIIIII(Inventory.contains(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[162]])) ? 1 : 0)) {
                                                            Inventory.getFirst(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[161]])).interact(lIlIllIIIl[lIlIllIIll[15]]);
                                                        }
                                                        if (q.lIIlIIllIIIII(Inventory.contains((int[])f.aU) ? 1 : 0) && q.lIIlIIllIIIIl(Movement.getRunEnergy(), lIlIllIIll[16])) {
                                                            Inventory.getFirst((int[])f.aU).interact(lIlIllIIIl[lIlIllIIll[8]]);
                                                            Time.sleepTicks((int)lIlIllIIll[0]);
                                                            "".length();
                                                        }
                                                        if (q.lIIlIIllIIIIl(Prayers.getPoints(), lIlIllIIll[14]) && q.lIIlIIllIIIII(Inventory.contains(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[160]])) ? 1 : 0)) {
                                                            Inventory.getFirst(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[159]])).interact(lIlIllIIIl[lIlIllIIll[17]]);
                                                        }
                                                        String[] stringArray = new String[lIlIllIIll[0]];
                                                        stringArray[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[13]];
                                                        if (q.lIIlIIllIIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                            String[] stringArray2 = new String[lIlIllIIll[0]];
                                                            stringArray2[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[18]];
                                                            Inventory.getFirst((String[])stringArray2).interact(lIlIllIIIl[lIlIllIIll[19]]);
                                                        }
                                                        String[] stringArray3 = new String[lIlIllIIll[0]];
                                                        stringArray3[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[20]];
                                                        if (q.lIIlIIllIIIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                            String[] stringArray4 = new String[lIlIllIIll[0]];
                                                            stringArray4[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[21]];
                                                            Inventory.getFirst((String[])stringArray4).interact(lIlIllIIIl[lIlIllIIll[22]]);
                                                        }
                                                        if (q.lIIlIIllIIIlI((lllllllllllllllllllIlIIlIIIIllIl = new WorldArea(lIlIllIIll[23], lIlIllIIll[24], lIlIllIIll[20], lIlIllIIll[19], lIlIllIIll[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                            AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[25]];
                                                            lllllllllllllllllllIlIIlIIIIllII = new WorldPoint(lIlIllIIll[26], lIlIllIIll[27], lIlIllIIll[1]);
                                                            Movement.walkTo((WorldPoint)lllllllllllllllllllIlIIlIIIIllII);
                                                            "".length();
                                                            Time.sleepTicks((int)lIlIllIIll[0]);
                                                            "".length();
                                                        }
                                                        if (!q.lIIlIIllIIIII(lllllllllllllllllllIlIIlIIIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block98;
                                                        g.a(cy);
                                                        lllllllllllllllllllIlIIlIIIIllII = TileItems.getNearest(tileItem -> {
                                                            int n2;
                                                            if (q.lIIlIIllIIIII(tileItem.getName().contains(lIlIllIIIl[lIlIllIIll[157]]) ? 1 : 0) && q.lIIlIIllIIIlI(tileItem.getName().contains(lIlIllIIIl[lIlIllIIll[158]]) ? 1 : 0)) {
                                                                n2 = lIlIllIIll[0];
                                                                "".length();
                                                                if (" ".length() <= 0) {
                                                                    return ((0x2F ^ 3 ^ (0x30 ^ 0x1B)) & (0x77 ^ 0x1E ^ (0x61 ^ 0xF) ^ -" ".length())) != 0;
                                                                }
                                                            } else {
                                                                n2 = lIlIllIIll[1];
                                                            }
                                                            return n2 != 0;
                                                        });
                                                        if (q.lIIlIIllIIIll(lllllllllllllllllllIlIIlIIIIllII)) {
                                                            if (q.lIIlIIllIIIlI(cM ? 1 : 0) && q.lIIlIIllIIIII(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[28]]) ? 1 : 0) && q.lIIlIIllIIIlI(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[29]]) ? 1 : 0)) {
                                                                AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[30]];
                                                                lllllllllllllllllllIlIIlIIIIllII.interact(lIlIllIIIl[lIlIllIIll[31]]);
                                                                Time.sleepTicks((int)lIlIllIIll[4]);
                                                                "".length();
                                                            }
                                                            if (q.lIIlIIllIIIlI(cN ? 1 : 0) && q.lIIlIIllIIIII(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[32]]) ? 1 : 0) && q.lIIlIIllIIIlI(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[33]]) ? 1 : 0)) {
                                                                AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[34]];
                                                                lllllllllllllllllllIlIIlIIIIllII.interact(lIlIllIIIl[lIlIllIIll[35]]);
                                                                Time.sleepTicks((int)lIlIllIIll[4]);
                                                                "".length();
                                                            }
                                                            if (q.lIIlIIllIIIII(cM ? 1 : 0) && q.lIIlIIllIIIlI(cN ? 1 : 0) && q.lIIlIIllIIIII(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[36]]) ? 1 : 0) && q.lIIlIIllIIIlI(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[37]]) ? 1 : 0)) {
                                                                AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[38]];
                                                                lllllllllllllllllllIlIIlIIIIllII.interact(lIlIllIIIl[lIlIllIIll[39]]);
                                                                Time.sleepTicks((int)lIlIllIIll[4]);
                                                                "".length();
                                                            }
                                                            if (q.lIIlIIllIIIII(cN ? 1 : 0) && q.lIIlIIllIIIlI(cO ? 1 : 0) && q.lIIlIIllIIIII(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[40]]) ? 1 : 0) && q.lIIlIIllIIIlI(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[41]]) ? 1 : 0)) {
                                                                AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[42]];
                                                                lllllllllllllllllllIlIIlIIIIllII.interact(lIlIllIIIl[lIlIllIIll[43]]);
                                                                Time.sleepTicks((int)lIlIllIIll[4]);
                                                                "".length();
                                                            }
                                                            if (q.lIIlIIllIIIII(cO ? 1 : 0) && q.lIIlIIllIIIlI(cP ? 1 : 0) && q.lIIlIIllIIIII(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[44]]) ? 1 : 0) && q.lIIlIIllIIIlI(lllllllllllllllllllIlIIlIIIIllII.getName().contains(lIlIllIIIl[lIlIllIIll[45]]) ? 1 : 0)) {
                                                                AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[46]];
                                                                lllllllllllllllllllIlIIlIIIIllII.interact(lIlIllIIIl[lIlIllIIll[47]]);
                                                                Time.sleepTicks((int)lIlIllIIll[4]);
                                                                "".length();
                                                            }
                                                        }
                                                        int[] nArray = new int[lIlIllIIll[0]];
                                                        nArray[q.lIlIllIIll[1]] = lIlIllIIll[48];
                                                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block99;
                                                        int[] nArray6 = new int[lIlIllIIll[0]];
                                                        nArray6[q.lIlIllIIll[1]] = lIlIllIIll[49];
                                                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block99;
                                                        int[] nArray7 = new int[lIlIllIIll[0]];
                                                        nArray7[q.lIlIllIIll[1]] = lIlIllIIll[50];
                                                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray7) ? 1 : 0)) break block99;
                                                        int[] nArray8 = new int[lIlIllIIll[0]];
                                                        nArray8[q.lIlIllIIll[1]] = lIlIllIIll[51];
                                                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block99;
                                                        int[] nArray9 = new int[lIlIllIIll[0]];
                                                        nArray9[q.lIlIllIIll[1]] = lIlIllIIll[52];
                                                        if (!q.lIIlIIllIIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block100;
                                                    }
                                                    if (q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                        int n2;
                                                        if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[155]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[156]]) ? 1 : 0)) {
                                                            n2 = lIlIllIIll[0];
                                                            "".length();
                                                            if (((0x90 ^ 0xC0) & ~(0x6D ^ 0x3D)) != 0) {
                                                                return ((0xC ^ 0x5E) & ~(0x22 ^ 0x70)) != 0;
                                                            }
                                                        } else {
                                                            n2 = lIlIllIIll[1];
                                                        }
                                                        return n2 != 0;
                                                    }) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                        int n2;
                                                        if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[153]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[154]]) ? 1 : 0)) {
                                                            n2 = lIlIllIIll[0];
                                                            "".length();
                                                            if ("  ".length() > "  ".length()) {
                                                                return ((0x4E ^ 0x72) & ~(0xAC ^ 0x90)) != 0;
                                                            }
                                                        } else {
                                                            n2 = lIlIllIIll[1];
                                                        }
                                                        return n2 != 0;
                                                    }) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                        int n2;
                                                        if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[151]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[152]]) ? 1 : 0)) {
                                                            n2 = lIlIllIIll[0];
                                                            "".length();
                                                            if ((128 + 19 - 128 + 110 ^ 8 + 86 - 9 + 48) < 0) {
                                                                return ((0xA ^ 0x71 ^ (0xF8 ^ 0xB3)) & (46 + 91 - 42 + 80 ^ 21 + 16 - 27 + 149 ^ -" ".length())) != 0;
                                                            }
                                                        } else {
                                                            n2 = lIlIllIIll[1];
                                                        }
                                                        return n2 != 0;
                                                    }) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                        int n2;
                                                        if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[149]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[150]]) ? 1 : 0)) {
                                                            n2 = lIlIllIIll[0];
                                                            "".length();
                                                            if ((0x60 ^ 0x66 ^ "  ".length()) < "   ".length()) {
                                                                return ((131 + 141 - 260 + 205 ^ 108 + 50 - 113 + 85) & (140 + 17 - 58 + 131 ^ 44 + 124 - -3 + 18 ^ -" ".length())) != 0;
                                                            }
                                                        } else {
                                                            n2 = lIlIllIIll[1];
                                                        }
                                                        return n2 != 0;
                                                    }) ? 1 : 0)) {
                                                        AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[53]];
                                                        lllllllllllllllllllIlIIlIIIIlIll = NPCs.getNearest(nPC -> {
                                                            int n2;
                                                            if (q.lIIlIIllIIIII(nPC.getName().contains(lIlIllIIIl[lIlIllIIll[147]]) ? 1 : 0)) {
                                                                String[] stringArray = new String[lIlIllIIll[0]];
                                                                stringArray[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[148]];
                                                                if (q.lIIlIIllIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                                                                    n2 = lIlIllIIll[0];
                                                                    "".length();
                                                                    if (-" ".length() == -" ".length()) return n2 != 0;
                                                                    return ((0x55 ^ 0x4A) & ~(0x2B ^ 0x34)) != 0;
                                                                }
                                                            }
                                                            n2 = lIlIllIIll[1];
                                                            return n2 != 0;
                                                        });
                                                        if (q.lIIlIIllIIlIl(lllllllllllllllllllIlIIlIIIIlIll)) {
                                                            g.a(lIlIllIIIl[lIlIllIIll[54]], cy);
                                                        }
                                                        if (q.lIIlIIllIIIll(lllllllllllllllllllIlIIlIIIIlIll)) {
                                                            if (q.lIIlIIllIIIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                                            }
                                                            if (q.lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                                                lllllllllllllllllllIlIIlIIIIlIll.interact(lIlIllIIIl[lIlIllIIll[55]]);
                                                                Time.sleepTicks((int)lIlIllIIll[3]);
                                                                "".length();
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray = new int[lIlIllIIll[0]];
                                                nArray[q.lIlIllIIll[1]] = lIlIllIIll[56];
                                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block101;
                                                int[] nArray10 = new int[lIlIllIIll[0]];
                                                nArray10[q.lIlIllIIll[1]] = lIlIllIIll[57];
                                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block101;
                                                int[] nArray11 = new int[lIlIllIIll[0]];
                                                nArray11[q.lIlIllIIll[1]] = lIlIllIIll[58];
                                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray11) ? 1 : 0)) break block101;
                                                int[] nArray12 = new int[lIlIllIIll[0]];
                                                nArray12[q.lIlIllIIll[1]] = lIlIllIIll[59];
                                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray12) ? 1 : 0)) break block101;
                                                int[] nArray13 = new int[lIlIllIIll[0]];
                                                nArray13[q.lIlIllIIll[1]] = lIlIllIIll[60];
                                                if (!q.lIIlIIllIIIlI(Inventory.contains((int[])nArray13) ? 1 : 0)) break block102;
                                            }
                                            int[] nArray = new int[lIlIllIIll[0]];
                                            nArray[q.lIlIllIIll[1]] = lIlIllIIll[48];
                                            if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                int[] nArray14 = new int[lIlIllIIll[0]];
                                                nArray14[q.lIlIllIIll[1]] = lIlIllIIll[49];
                                                if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                                    int[] nArray15 = new int[lIlIllIIll[0]];
                                                    nArray15[q.lIlIllIIll[1]] = lIlIllIIll[50];
                                                    if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                                                        int[] nArray16 = new int[lIlIllIIll[0]];
                                                        nArray16[q.lIlIllIIll[1]] = lIlIllIIll[51];
                                                        if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                                                            int[] nArray17 = new int[lIlIllIIll[0]];
                                                            nArray17[q.lIlIllIIll[1]] = lIlIllIIll[52];
                                                            if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray17) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                                int n2;
                                                                if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[145]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[146]]) ? 1 : 0)) {
                                                                    n2 = lIlIllIIll[0];
                                                                    "".length();
                                                                    if (null != null) {
                                                                        return ((0xF4 ^ 0xA5 ^ (0x71 ^ 0x75)) & (225 + 126 - 140 + 36 ^ 70 + 93 - 144 + 143 ^ -" ".length())) != 0;
                                                                    }
                                                                } else {
                                                                    n2 = lIlIllIIll[1];
                                                                }
                                                                return n2 != 0;
                                                            }) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                                int n2;
                                                                if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[143]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[144]]) ? 1 : 0)) {
                                                                    n2 = lIlIllIIll[0];
                                                                    "".length();
                                                                    if (-(0x82 ^ 0x86) > 0) {
                                                                        return ((0x39 ^ 0xF) & ~(0x2C ^ 0x1A)) != 0;
                                                                    }
                                                                } else {
                                                                    n2 = lIlIllIIll[1];
                                                                }
                                                                return n2 != 0;
                                                            }) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                                int n2;
                                                                if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[142]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[102]]) ? 1 : 0)) {
                                                                    n2 = lIlIllIIll[0];
                                                                    "".length();
                                                                    if ((0x7C ^ 0x29 ^ (0xFA ^ 0xAB)) == 0) {
                                                                        return ((0x23 ^ 0x31 ^ (0x3F ^ 0x75)) & (111 + 155 - 121 + 64 ^ 37 + 62 - -31 + 7 ^ -" ".length())) != 0;
                                                                    }
                                                                } else {
                                                                    n2 = lIlIllIIll[1];
                                                                }
                                                                return n2 != 0;
                                                            }) ? 1 : 0)) {
                                                                AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[61]];
                                                                lllllllllllllllllllIlIIlIIIIlIll = NPCs.getNearest(nPC -> {
                                                                    int n2;
                                                                    if (q.lIIlIIllIIIII(nPC.getName().contains(lIlIllIIIl[lIlIllIIll[140]]) ? 1 : 0)) {
                                                                        String[] stringArray = new String[lIlIllIIll[0]];
                                                                        stringArray[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[141]];
                                                                        if (q.lIIlIIllIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                                                                            n2 = lIlIllIIll[0];
                                                                            "".length();
                                                                            if ("  ".length() >= 0) return n2 != 0;
                                                                            return ((0x30 ^ 0x74) & ~(0xE2 ^ 0xA6)) != 0;
                                                                        }
                                                                    }
                                                                    n2 = lIlIllIIll[1];
                                                                    return n2 != 0;
                                                                });
                                                                if (q.lIIlIIllIIlIl(lllllllllllllllllllIlIIlIIIIlIll)) {
                                                                    if (q.lIIlIIllIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                                                    }
                                                                    g.a(lIlIllIIIl[lIlIllIIll[62]], cy);
                                                                }
                                                                if (q.lIIlIIllIIIll(lllllllllllllllllllIlIIlIIIIlIll)) {
                                                                    if (q.lIIlIIllIIIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                                                    }
                                                                    if (q.lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                                                        lllllllllllllllllllIlIIlIIIIlIll.interact(lIlIllIIIl[lIlIllIIll[63]]);
                                                                        Time.sleepTicks((int)lIlIllIIll[3]);
                                                                        "".length();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        int[] nArray = new int[lIlIllIIll[0]];
                                        nArray[q.lIlIllIIll[1]] = lIlIllIIll[64];
                                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block103;
                                        int[] nArray18 = new int[lIlIllIIll[0]];
                                        nArray18[q.lIlIllIIll[1]] = lIlIllIIll[65];
                                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray18) ? 1 : 0)) break block103;
                                        int[] nArray19 = new int[lIlIllIIll[0]];
                                        nArray19[q.lIlIllIIll[1]] = lIlIllIIll[66];
                                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray19) ? 1 : 0)) break block103;
                                        int[] nArray20 = new int[lIlIllIIll[0]];
                                        nArray20[q.lIlIllIIll[1]] = lIlIllIIll[67];
                                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray20) ? 1 : 0)) break block103;
                                        int[] nArray21 = new int[lIlIllIIll[0]];
                                        nArray21[q.lIlIllIIll[1]] = lIlIllIIll[68];
                                        if (!q.lIIlIIllIIIlI(Inventory.contains((int[])nArray21) ? 1 : 0)) break block104;
                                    }
                                    int[] nArray = new int[lIlIllIIll[0]];
                                    nArray[q.lIlIllIIll[1]] = lIlIllIIll[56];
                                    if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                        int[] nArray22 = new int[lIlIllIIll[0]];
                                        nArray22[q.lIlIllIIll[1]] = lIlIllIIll[57];
                                        if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                                            int[] nArray23 = new int[lIlIllIIll[0]];
                                            nArray23[q.lIlIllIIll[1]] = lIlIllIIll[58];
                                            if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray23) ? 1 : 0)) {
                                                int[] nArray24 = new int[lIlIllIIll[0]];
                                                nArray24[q.lIlIllIIll[1]] = lIlIllIIll[59];
                                                if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                                                    int[] nArray25 = new int[lIlIllIIll[0]];
                                                    nArray25[q.lIlIllIIll[1]] = lIlIllIIll[60];
                                                    if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray25) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                        int n2;
                                                        if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[138]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[139]]) ? 1 : 0)) {
                                                            n2 = lIlIllIIll[0];
                                                            "".length();
                                                            if (null != null) {
                                                                return ((0xD5 ^ 0x93) & ~(0x55 ^ 0x13)) != 0;
                                                            }
                                                        } else {
                                                            n2 = lIlIllIIll[1];
                                                        }
                                                        return n2 != 0;
                                                    }) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                        int n2;
                                                        if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[136]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[137]]) ? 1 : 0)) {
                                                            n2 = lIlIllIIll[0];
                                                            "".length();
                                                            if (null != null) {
                                                                return ((0x10 ^ 0x73) & ~(0xFC ^ 0x9F)) != 0;
                                                            }
                                                        } else {
                                                            n2 = lIlIllIIll[1];
                                                        }
                                                        return n2 != 0;
                                                    }) ? 1 : 0)) {
                                                        cM = lIlIllIIll[0];
                                                        AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[69]];
                                                        lllllllllllllllllllIlIIlIIIIlIll = NPCs.getNearest(nPC -> {
                                                            int n2;
                                                            if (q.lIIlIIllIIIII(nPC.getName().contains(lIlIllIIIl[lIlIllIIll[134]]) ? 1 : 0)) {
                                                                String[] stringArray = new String[lIlIllIIll[0]];
                                                                stringArray[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[135]];
                                                                if (q.lIIlIIllIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                                                                    n2 = lIlIllIIll[0];
                                                                    "".length();
                                                                    if (" ".length() != -" ".length()) return n2 != 0;
                                                                    return ((238 + 211 - 236 + 39 ^ 23 + 131 - 27 + 66) & (0xFE ^ 0xA7 ^ (0x7C ^ 0x18) ^ -" ".length())) != 0;
                                                                }
                                                            }
                                                            n2 = lIlIllIIll[1];
                                                            return n2 != 0;
                                                        });
                                                        if (q.lIIlIIllIIlIl(lllllllllllllllllllIlIIlIIIIlIll) && q.lIIlIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                                            if (q.lIIlIIllIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                                            }
                                                            q.aP();
                                                            if (q.lIIlIIllIIIII(Inventory.contains(item -> {
                                                                int n2;
                                                                if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[132]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[133]]) ? 1 : 0)) {
                                                                    n2 = lIlIllIIll[0];
                                                                    "".length();
                                                                    if ((85 + 55 - 109 + 125 ^ 118 + 42 - 111 + 103) != (76 + 7 - 19 + 118 ^ 92 + 83 - 4 + 7)) {
                                                                        return ((0x29 ^ 6 ^ (0x4D ^ 0x44)) & (4 ^ 0x24 ^ (0xC1 ^ 0xC7) ^ -" ".length())) != 0;
                                                                    }
                                                                } else {
                                                                    n2 = lIlIllIIll[1];
                                                                }
                                                                return n2 != 0;
                                                            }) ? 1 : 0)) {
                                                                Inventory.getFirst(item -> {
                                                                    int n2;
                                                                    if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[130]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[131]]) ? 1 : 0)) {
                                                                        n2 = lIlIllIIll[0];
                                                                        "".length();
                                                                        if ("  ".length() < -" ".length()) {
                                                                            return ((0x82 ^ 0xB6) & ~(0x23 ^ 0x17)) != 0;
                                                                        }
                                                                    } else {
                                                                        n2 = lIlIllIIll[1];
                                                                    }
                                                                    return n2 != 0;
                                                                }).interact(lIlIllIIIl[lIlIllIIll[70]]);
                                                            }
                                                            g.a(lIlIllIIIl[lIlIllIIll[71]], cy);
                                                        }
                                                        if (q.lIIlIIllIIIll(lllllllllllllllllllIlIIlIIIIlIll)) {
                                                            if (q.lIIlIIllIIIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                                            }
                                                            if (q.lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                                                lllllllllllllllllllIlIIlIIIIlIll.interact(lIlIllIIIl[lIlIllIIll[72]]);
                                                                Time.sleepTicks((int)lIlIllIIll[3]);
                                                                "".length();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int[] nArray = new int[lIlIllIIll[0]];
                                nArray[q.lIlIllIIll[1]] = lIlIllIIll[73];
                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block105;
                                int[] nArray26 = new int[lIlIllIIll[0]];
                                nArray26[q.lIlIllIIll[1]] = lIlIllIIll[74];
                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray26) ? 1 : 0)) break block105;
                                int[] nArray27 = new int[lIlIllIIll[0]];
                                nArray27[q.lIlIllIIll[1]] = lIlIllIIll[75];
                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray27) ? 1 : 0)) break block105;
                                int[] nArray28 = new int[lIlIllIIll[0]];
                                nArray28[q.lIlIllIIll[1]] = lIlIllIIll[76];
                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray28) ? 1 : 0)) break block105;
                                int[] nArray29 = new int[lIlIllIIll[0]];
                                nArray29[q.lIlIllIIll[1]] = lIlIllIIll[77];
                                if (!q.lIIlIIllIIIlI(Inventory.contains((int[])nArray29) ? 1 : 0)) break block106;
                            }
                            int[] nArray = new int[lIlIllIIll[0]];
                            nArray[q.lIlIllIIll[1]] = lIlIllIIll[64];
                            if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray30 = new int[lIlIllIIll[0]];
                                nArray30[q.lIlIllIIll[1]] = lIlIllIIll[65];
                                if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                                    int[] nArray31 = new int[lIlIllIIll[0]];
                                    nArray31[q.lIlIllIIll[1]] = lIlIllIIll[66];
                                    if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                                        int[] nArray32 = new int[lIlIllIIll[0]];
                                        nArray32[q.lIlIllIIll[1]] = lIlIllIIll[67];
                                        if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray32) ? 1 : 0)) {
                                            int[] nArray33 = new int[lIlIllIIll[0]];
                                            nArray33[q.lIlIllIIll[1]] = lIlIllIIll[68];
                                            if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray33) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> {
                                                int n2;
                                                if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[128]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[129]]) ? 1 : 0)) {
                                                    n2 = lIlIllIIll[0];
                                                    "".length();
                                                    if (null != null) {
                                                        return ((0x14 ^ 0x39 ^ (0x75 ^ 0x6A)) & (0x39 ^ 0x47 ^ (0x50 ^ 0x1C) ^ -" ".length())) != 0;
                                                    }
                                                } else {
                                                    n2 = lIlIllIIll[1];
                                                }
                                                return n2 != 0;
                                            }) ? 1 : 0)) {
                                                cN = lIlIllIIll[0];
                                                AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[78]];
                                                lllllllllllllllllllIlIIlIIIIlIll = NPCs.getNearest(nPC -> {
                                                    int n2;
                                                    if (q.lIIlIIllIIIII(nPC.getName().contains(lIlIllIIIl[lIlIllIIll[126]]) ? 1 : 0)) {
                                                        String[] stringArray = new String[lIlIllIIll[0]];
                                                        stringArray[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[127]];
                                                        if (q.lIIlIIllIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                                                            n2 = lIlIllIIll[0];
                                                            "".length();
                                                            if (null == null) return n2 != 0;
                                                            return ((0x5F ^ 0x6A ^ (3 ^ 0x62)) & (0x5F ^ 0x67 ^ (0x2C ^ 0x40) ^ -" ".length())) != 0;
                                                        }
                                                    }
                                                    n2 = lIlIllIIll[1];
                                                    return n2 != 0;
                                                });
                                                if (q.lIIlIIllIIlIl(lllllllllllllllllllIlIIlIIIIlIll) && q.lIIlIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                                    if (q.lIIlIIllIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                                    }
                                                    q.aP();
                                                    q.aQ();
                                                    if (q.lIIlIIllIIIII(Inventory.contains(item -> {
                                                        int n2;
                                                        if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[124]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[125]]) ? 1 : 0)) {
                                                            n2 = lIlIllIIll[0];
                                                            "".length();
                                                            if (-" ".length() < -" ".length()) {
                                                                return ((0xD4 ^ 0x81 ^ (0x81 ^ 0x8E)) & (35 + 112 - 139 + 147 ^ 66 + 52 - -4 + 71 ^ -" ".length())) != 0;
                                                            }
                                                        } else {
                                                            n2 = lIlIllIIll[1];
                                                        }
                                                        return n2 != 0;
                                                    }) ? 1 : 0)) {
                                                        Inventory.getFirst(item -> {
                                                            int n2;
                                                            if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[122]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[123]]) ? 1 : 0)) {
                                                                n2 = lIlIllIIll[0];
                                                                "".length();
                                                                if ((49 + 130 - 70 + 30 ^ 48 + 140 - 118 + 73) < "   ".length()) {
                                                                    return ((0xFF ^ 0x8C ^ (0x8D ^ 0xB8)) & (0x8D ^ 0xA6 ^ (0x1B ^ 0x76) ^ -" ".length())) != 0;
                                                                }
                                                            } else {
                                                                n2 = lIlIllIIll[1];
                                                            }
                                                            return n2 != 0;
                                                        }).interact(lIlIllIIIl[lIlIllIIll[79]]);
                                                    }
                                                    g.a(lIlIllIIIl[lIlIllIIll[80]], cy);
                                                }
                                                if (q.lIIlIIllIIIll(lllllllllllllllllllIlIIlIIIIlIll)) {
                                                    if (q.lIIlIIllIIIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                                    }
                                                    if (q.lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                                        lllllllllllllllllllIlIIlIIIIlIll.interact(lIlIllIIIl[lIlIllIIll[81]]);
                                                        Time.sleepTicks((int)lIlIllIIll[3]);
                                                        "".length();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray = new int[lIlIllIIll[0]];
                        nArray[q.lIlIllIIll[1]] = lIlIllIIll[82];
                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block107;
                        int[] nArray34 = new int[lIlIllIIll[0]];
                        nArray34[q.lIlIllIIll[1]] = lIlIllIIll[83];
                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray34) ? 1 : 0)) break block107;
                        int[] nArray35 = new int[lIlIllIIll[0]];
                        nArray35[q.lIlIllIIll[1]] = lIlIllIIll[84];
                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray35) ? 1 : 0)) break block107;
                        int[] nArray36 = new int[lIlIllIIll[0]];
                        nArray36[q.lIlIllIIll[1]] = lIlIllIIll[85];
                        if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray36) ? 1 : 0)) break block107;
                        int[] nArray37 = new int[lIlIllIIll[0]];
                        nArray37[q.lIlIllIIll[1]] = lIlIllIIll[86];
                        if (!q.lIIlIIllIIIlI(Inventory.contains((int[])nArray37) ? 1 : 0)) break block98;
                    }
                    int[] nArray = new int[lIlIllIIll[0]];
                    nArray[q.lIlIllIIll[1]] = lIlIllIIll[73];
                    if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray38 = new int[lIlIllIIll[0]];
                        nArray38[q.lIlIllIIll[1]] = lIlIllIIll[74];
                        if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray38) ? 1 : 0)) {
                            int[] nArray39 = new int[lIlIllIIll[0]];
                            nArray39[q.lIlIllIIll[1]] = lIlIllIIll[75];
                            if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                                int[] nArray40 = new int[lIlIllIIll[0]];
                                nArray40[q.lIlIllIIll[1]] = lIlIllIIll[76];
                                if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray40) ? 1 : 0)) {
                                    int[] nArray41 = new int[lIlIllIIll[0]];
                                    nArray41[q.lIlIllIIll[1]] = lIlIllIIll[77];
                                    if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray41) ? 1 : 0)) {
                                        cO = lIlIllIIll[0];
                                        AccBuilderShamans.c = lIlIllIIIl[lIlIllIIll[87]];
                                        lllllllllllllllllllIlIIlIIIIlIll = NPCs.getNearest(nPC -> {
                                            int n2;
                                            if (q.lIIlIIllIIIII(nPC.getName().contains(lIlIllIIIl[lIlIllIIll[120]]) ? 1 : 0)) {
                                                String[] stringArray = new String[lIlIllIIll[0]];
                                                stringArray[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[121]];
                                                if (q.lIIlIIllIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                                                    n2 = lIlIllIIll[0];
                                                    "".length();
                                                    if (-" ".length() <= " ".length()) return n2 != 0;
                                                    return ((0x95 ^ 0x9C) & ~(0xAA ^ 0xA3)) != 0;
                                                }
                                            }
                                            n2 = lIlIllIIll[1];
                                            return n2 != 0;
                                        });
                                        if (q.lIIlIIllIIlIl(lllllllllllllllllllIlIIlIIIIlIll) && q.lIIlIIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                            if (q.lIIlIIllIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                            }
                                            q.aP();
                                            q.aQ();
                                            q.aR();
                                            if (q.lIIlIIllIIIII(Inventory.contains(item -> {
                                                int n2;
                                                if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[118]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[119]]) ? 1 : 0)) {
                                                    n2 = lIlIllIIll[0];
                                                    "".length();
                                                    if (-" ".length() >= 0) {
                                                        return ((0x3A ^ 0x6D ^ (0xE6 ^ 0x86)) & (57 + 69 - 57 + 68 ^ 40 + 44 - 20 + 126 ^ -" ".length())) != 0;
                                                    }
                                                } else {
                                                    n2 = lIlIllIIll[1];
                                                }
                                                return n2 != 0;
                                            }) ? 1 : 0)) {
                                                Inventory.getFirst(item -> {
                                                    int n2;
                                                    if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[116]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[117]]) ? 1 : 0)) {
                                                        n2 = lIlIllIIll[0];
                                                        "".length();
                                                        if (((0xC5 ^ 0x80 ^ (0x20 ^ 0x50)) & (0xDD ^ 0xA1 ^ (4 ^ 0x4D) ^ -" ".length())) != 0) {
                                                            return ((0x74 ^ 0x41 ^ (0x74 ^ 0x48)) & (0x40 ^ 6 ^ (0x5D ^ 0x12) ^ -" ".length())) != 0;
                                                        }
                                                    } else {
                                                        n2 = lIlIllIIll[1];
                                                    }
                                                    return n2 != 0;
                                                }).interact(lIlIllIIIl[lIlIllIIll[88]]);
                                            }
                                            g.a(lIlIllIIIl[lIlIllIIll[89]], cy);
                                        }
                                        if (q.lIIlIIllIIIll(lllllllllllllllllllIlIIlIIIIlIll)) {
                                            if (q.lIIlIIllIIIlI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                            }
                                            if (q.lIIlIIllIIlIl(Players.getLocal().getInteracting())) {
                                                lllllllllllllllllllIlIIlIIIIlIll.interact(lIlIllIIIl[lIlIllIIll[90]]);
                                                Time.sleepTicks((int)lIlIllIIll[3]);
                                                "".length();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[lIlIllIIll[0]];
                nArray[q.lIlIllIIll[1]] = lIlIllIIll[82];
                if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray42 = new int[lIlIllIIll[0]];
                    nArray42[q.lIlIllIIll[1]] = lIlIllIIll[83];
                    if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray42) ? 1 : 0)) {
                        int[] nArray43 = new int[lIlIllIIll[0]];
                        nArray43[q.lIlIllIIll[1]] = lIlIllIIll[84];
                        if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray43) ? 1 : 0)) {
                            int[] nArray44 = new int[lIlIllIIll[0]];
                            nArray44[q.lIlIllIIll[1]] = lIlIllIIll[85];
                            if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                                int[] nArray45 = new int[lIlIllIIll[0]];
                                nArray45[q.lIlIllIIll[1]] = lIlIllIIll[86];
                                if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray45) ? 1 : 0)) {
                                    cP = lIlIllIIll[0];
                                    if (q.lIIlIIllIIIII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                                    }
                                    q.aS();
                                }
                            }
                        }
                    }
                }
            }
            g.a(cy);
        }
    }

    private static String lIIlIIlIIllll(String lllllllllllllllllllIlIIIlIlIIlII, String lllllllllllllllllllIlIIIlIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIIlIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIlIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIlIIIlIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIlIIIlIlIIllI.init(lIlIllIIll[3], lllllllllllllllllllIlIIIlIlIIlll);
            return new String(lllllllllllllllllllIlIIIlIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIlIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIlIIIlIlIIlIl) {
            lllllllllllllllllllIlIIIlIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllIIIII(int n2) {
        return n2 != 0;
    }

    private static void lIIlIIlIllllI() {
        lIlIllIIIl = new String[lIlIllIIll[183]];
        q.lIlIllIIIl[q.lIlIllIIll[1]] = q.lIIlIIlIIlllI("wWHFxKVU2KhncBVnl5bf6O3hQFO+QRs8i/rBA1hqIhT75gzKmgFxirLpL/LwCQDV", "wPvyP");
        q.lIlIllIIIl[q.lIlIllIIll[0]] = q.lIIlIIlIIllll("rEygpQSzCFuk7xYfpGrwjw==", "leiQF");
        q.lIlIllIIIl[q.lIlIllIIll[3]] = q.lIIlIIlIIllll("klUDntcK2IHW/7m7y+06jv9BlF8YhqIl", "ClkZH");
        q.lIlIllIIIl[q.lIlIllIIll[5]] = q.lIIlIIlIIlllI("8OyjF8FNY9y5O99Ggomqs7i8ga3MzOQvN0ZrF2xMZeCDWK1sMFM4mFkxqKGBcjs7CWPiuistpM4=", "xdtjb");
        q.lIlIllIIIl[q.lIlIllIIll[4]] = q.lIIlIIlIIlllI("oVK9Hs81l1Q1Wx8auyAyc8yIsrj17nrzD59Eg/n9975O7Fj9KVwaTIpwbi++aYb8yt8DG+AOij4=", "foujx");
        q.lIlIllIIIl[q.lIlIllIIll[9]] = q.lIIlIIlIIlllI("zBy6chBeH6CVsGfTKpnEe5mAJ4ccGfay9TjkoVkEbVrpUT+JqR7ywBNOagncGf/mxYHYBQxXZRk=", "CIvEX");
        q.lIlIllIIIl[q.lIlIllIIll[14]] = q.lIIlIIlIIlllI("r9+6kftvCQ8=", "pPdve");
        q.lIlIllIIIl[q.lIlIllIIll[15]] = q.lIIlIIlIlIIII("EhIOOA==", "EwoJg");
        q.lIlIllIIIl[q.lIlIllIIll[8]] = q.lIIlIIlIlIIII("ND0rCxw=", "pOBew");
        q.lIlIllIIIl[q.lIlIllIIll[17]] = q.lIIlIIlIIllll("qdYm/APjr0E=", "xswmq");
        q.lIlIllIIIl[q.lIlIllIIll[13]] = q.lIIlIIlIlIIII("Pi4uKC0EIyFxOggiPzA0Bg==", "mFOQW");
        q.lIlIllIIIl[q.lIlIllIIll[18]] = q.lIIlIIlIIlllI("G17gd519aboYPNbSZQ1MhOo+H/5C+Juj", "QGdpv");
        q.lIlIllIIIl[q.lIlIllIIll[19]] = q.lIIlIIlIIlllI("RvsE9046VU4=", "mOjMz");
        q.lIlIllIIIl[q.lIlIllIIll[20]] = q.lIIlIIlIlIIII("DxwoJg==", "YuIJS");
        q.lIlIllIIIl[q.lIlIllIIll[21]] = q.lIIlIIlIIllll("noW5Z8p+Rcs=", "jFocY");
        q.lIlIllIIIl[q.lIlIllIIll[22]] = q.lIIlIIlIlIIII("EBoHIQ==", "ThhQf");
        q.lIlIllIIIl[q.lIlIllIIll[25]] = q.lIIlIIlIIllll("mwF5EwKnd4+d5k4eAFO1Kg81l8NrHSOG", "WVdPE");
        q.lIlIllIIIl[q.lIlIllIIll[28]] = q.lIIlIIlIlIIII("TGl5", "dXPPV");
        q.lIlIllIIIl[q.lIlIllIIll[29]] = q.lIIlIIlIlIIII("ICIbLx0+", "PMoFr");
        q.lIlIllIIIl[q.lIlIllIIll[30]] = q.lIIlIIlIIlllI("3UaBjIt3zXZbvo7CSDML73U2HJ+34o+u", "sWvZx");
        q.lIlIllIIIl[q.lIlIllIIll[31]] = q.lIIlIIlIIlllI("8ZXGyHAhS14=", "wcjPw");
        q.lIlIllIIIl[q.lIlIllIIll[32]] = q.lIIlIIlIIlllI("Vn+GCf3+fSw=", "mmRxa");
        q.lIlIllIIIl[q.lIlIllIIll[33]] = q.lIIlIIlIIllll("4scIbOqUeTE=", "sEssc");
        q.lIlIllIIIl[q.lIlIllIIll[34]] = q.lIIlIIlIlIIII("Nz8LKgoJMUg0E0clACAaHT8JLw==", "gVhAc");
        q.lIlIllIIIl[q.lIlIllIIll[35]] = q.lIIlIIlIIlllI("lsoc26OPZyI=", "MhJBq");
        q.lIlIllIIIl[q.lIlIllIIll[36]] = q.lIIlIIlIIllll("eE2TCH8XjQE=", "JkHxf");
        q.lIlIllIIIl[q.lIlIllIIll[37]] = q.lIIlIIlIIlllI("ds99DshX5mI=", "OgVWW");
        q.lIlIllIIIl[q.lIlIllIIll[38]] = q.lIIlIIlIIllll("rHpf4gyK48rPBwobvkDYtBplIvJ5gGzA", "RvJmW");
        q.lIlIllIIIl[q.lIlIllIIll[39]] = q.lIIlIIlIIlllI("slsBFC7uVO4=", "wcbCx");
        q.lIlIllIIIl[q.lIlIllIIll[40]] = q.lIIlIIlIIllll("4WjkF+BsHCs=", "ejBlq");
        q.lIlIllIIIl[q.lIlIllIIll[41]] = q.lIIlIIlIIllll("TK3Ljvo6nbY=", "CDBpd");
        q.lIlIllIIIl[q.lIlIllIIll[42]] = q.lIIlIIlIIlllI("mrCvNM+R4kH28LQzwNpZ+TiSL3cOXu/O", "fxNSc");
        q.lIlIllIIIl[q.lIlIllIIll[43]] = q.lIIlIIlIlIIII("JCg+Ew==", "pIUvK");
        q.lIlIllIIIl[q.lIlIllIIll[44]] = q.lIIlIIlIlIIII("UmxI", "zYaXm");
        q.lIlIllIIIl[q.lIlIllIIll[45]] = q.lIIlIIlIlIIII("FR8TCDgL", "epgaW");
        q.lIlIllIIIl[q.lIlIllIIll[46]] = q.lIIlIIlIlIIII("NxERPAEJH1IiGEcLGjYRHRETOQ==", "gxrWh");
        q.lIlIllIIIl[q.lIlIllIIll[47]] = q.lIIlIIlIlIIII("BjQcFg==", "RUwsh");
        q.lIlIllIIIl[q.lIlIllIIll[53]] = q.lIIlIIlIIlllI("2RqVv+PPPAtuUNrzAeDZ1g==", "delkX");
        q.lIlIllIIIl[q.lIlIllIIll[54]] = q.lIIlIIlIIlllI("sWCE/iPMesZCsSaoCHeviUXZo6rCJqW0", "CVSKh");
        q.lIlIllIIIl[q.lIlIllIIll[55]] = q.lIIlIIlIlIIII("CwA1NAUh", "JtAUf");
        q.lIlIllIIIl[q.lIlIllIIll[61]] = q.lIIlIIlIIllll("0idtEpPG3TbF5UzYvkj2Pg==", "sSBnn");
        q.lIlIllIIIl[q.lIlIllIIll[62]] = q.lIIlIIlIIlllI("o09dIXyk4yhQeA2hz0MHKvP1Pl6N/Wfh", "BcEsf");
        q.lIlIllIIIl[q.lIlIllIIll[63]] = q.lIIlIIlIIlllI("CQGxWGC6S/o=", "FdgtL");
        q.lIlIllIIIl[q.lIlIllIIll[69]] = q.lIIlIIlIIllll("1DCKWeSUJC/mGvKAKOV50w==", "HtlgP");
        q.lIlIllIIIl[q.lIlIllIIll[70]] = q.lIIlIIlIlIIII("ERU7Gw==", "UgTkc");
        q.lIlIllIIIl[q.lIlIllIIll[71]] = q.lIIlIIlIIllll("PVJveT5AstCJpyeY+QEfrLagUKTZ2DM6", "BQfRp");
        q.lIlIllIIIl[q.lIlIllIIll[72]] = q.lIIlIIlIIllll("rnbLgjOPJps=", "ClowX");
        q.lIlIllIIIl[q.lIlIllIIll[78]] = q.lIIlIIlIIlllI("W42zBRosT2H+/ZHPQf0eBA==", "fMVmU");
        q.lIlIllIIIl[q.lIlIllIIll[79]] = q.lIIlIIlIIlllI("X10KeKV+9xk=", "uXxvO");
        q.lIlIllIIIl[q.lIlIllIIll[80]] = q.lIIlIIlIIlllI("J/QWbeWNnJYKvkznhG36Dmcg/R3JzUfU", "juwld");
        q.lIlIllIIIl[q.lIlIllIIll[81]] = q.lIIlIIlIlIIII("DSckEyQn", "LSPrG");
        q.lIlIllIIIl[q.lIlIllIIll[87]] = q.lIIlIIlIIllll("kZaZZUzSjWugw/1ghAw6Lg==", "CyasP");
        q.lIlIllIIIl[q.lIlIllIIll[88]] = q.lIIlIIlIIlllI("crZGw3ITlwE=", "mFHqF");
        q.lIlIllIIIl[q.lIlIllIIll[89]] = q.lIIlIIlIlIIII("JTovDj8TJ2NCIh8wMUpjXw==", "vUCjV");
        q.lIlIllIIIl[q.lIlIllIIll[90]] = q.lIIlIIlIIlllI("sXjQgcwIJe4=", "fVOxg");
        q.lIlIllIIIl[q.lIlIllIIll[91]] = q.lIIlIIlIIllll("tjA96uVzuUI=", "SDeCC");
        q.lIlIllIIIl[q.lIlIllIIll[92]] = q.lIIlIIlIlIIII("BjwKNg==", "BNeFn");
        q.lIlIllIIIl[q.lIlIllIIll[93]] = q.lIIlIIlIIllll("eyCsE9CDfuw=", "mbUyo");
        q.lIlIllIIIl[q.lIlIllIIll[94]] = q.lIIlIIlIlIIII("LgYbJg==", "jttVD");
        q.lIlIllIIIl[q.lIlIllIIll[103]] = q.lIIlIIlIlIIII("Gz0REgwhNB5LECkjHx4E", "HUpkv");
        q.lIlIllIIIl[q.lIlIllIIll[104]] = q.lIIlIIlIlIIII("GBwoJ1BY", "luMUp");
        q.lIlIllIIIl[q.lIlIllIIll[105]] = q.lIIlIIlIlIIII("GD02LmwFMng+KQs4LCFsQg==", "jTXIL");
        q.lIlIllIIIl[q.lIlIllIIll[106]] = q.lIIlIIlIIllll("F98Zak6i3OQ=", "qfcSz");
        q.lIlIllIIIl[q.lIlIllIIll[107]] = q.lIIlIIlIlIIII("CSY6Nhsp", "ZMSZw");
        q.lIlIllIIIl[q.lIlIllIIll[108]] = q.lIIlIIlIIllll("s83XEay3TgM=", "uuwAB");
        q.lIlIllIIIl[q.lIlIllIIll[16]] = q.lIIlIIlIIllll("g0jpE9LywZc=", "oJAZC");
        q.lIlIllIIIl[q.lIlIllIIll[109]] = q.lIIlIIlIIlllI("IAMov2bGh+0=", "OaFkk");
        q.lIlIllIIIl[q.lIlIllIIll[110]] = q.lIIlIIlIIllll("o7eXf/Rz430=", "jDUOV");
        q.lIlIllIIIl[q.lIlIllIIll[111]] = q.lIIlIIlIIlllI("6G6D8ol7N5A=", "Qavlz");
        q.lIlIllIIIl[q.lIlIllIIll[112]] = q.lIIlIIlIIlllI("To7+Pbjk/cY=", "PNVgK");
        q.lIlIllIIIl[q.lIlIllIIll[113]] = q.lIIlIIlIlIIII("OgUSDD8k", "JjfeP");
        q.lIlIllIIIl[q.lIlIllIIll[114]] = q.lIIlIIlIlIIII("eXp8", "QKUZB");
        q.lIlIllIIIl[q.lIlIllIIll[115]] = q.lIIlIIlIIllll("8PoMScafTro=", "IYgwL");
        q.lIlIllIIIl[q.lIlIllIIll[116]] = q.lIIlIIlIIlllI("NKqg0GrLVR4=", "qEvkk");
        q.lIlIllIIIl[q.lIlIllIIll[117]] = q.lIIlIIlIIllll("yUCIVkxye4A=", "yJgrw");
        q.lIlIllIIIl[q.lIlIllIIll[118]] = q.lIIlIIlIIlllI("NJ31WOq8sz0=", "VfMIm");
        q.lIlIllIIIl[q.lIlIllIIll[119]] = q.lIIlIIlIIllll("1LepiHiAJ5M=", "JgOtA");
        q.lIlIllIIIl[q.lIlIllIIll[120]] = q.lIIlIIlIlIIII("UjkuJzpaeG4=", "zMGBH");
        q.lIlIllIIIl[q.lIlIllIIll[121]] = q.lIIlIIlIIlllI("D3cThDHQiEQ=", "ZaERt");
        q.lIlIllIIIl[q.lIlIllIIll[122]] = q.lIIlIIlIIllll("Ox+bG7qe5Ho=", "oXRzc");
        q.lIlIllIIIl[q.lIlIllIIll[123]] = q.lIIlIIlIIlllI("DpTTtNEJvzA=", "YHVZW");
        q.lIlIllIIIl[q.lIlIllIIll[124]] = q.lIIlIIlIIllll("JNROh3qvtS8=", "lSgFx");
        q.lIlIllIIIl[q.lIlIllIIll[125]] = q.lIIlIIlIlIIII("Ew4dPzkN", "caiVV");
        q.lIlIllIIIl[q.lIlIllIIll[126]] = q.lIIlIIlIIlllI("wGjkOElkejDOhcXj84upFw==", "CjOLx");
        q.lIlIllIIIl[q.lIlIllIIll[127]] = q.lIIlIIlIIllll("5nbugq+Mzjo=", "plCqG");
        q.lIlIllIIIl[q.lIlIllIIll[128]] = q.lIIlIIlIIlllI("bYjQjt14Q7g=", "UjFIL");
        q.lIlIllIIIl[q.lIlIllIIll[129]] = q.lIIlIIlIIllll("dAUuY8y0XJ4=", "WYEoB");
        q.lIlIllIIIl[q.lIlIllIIll[130]] = q.lIIlIIlIlIIII("XnRl", "vELMe");
        q.lIlIllIIIl[q.lIlIllIIll[131]] = q.lIIlIIlIIlllI("ou46ALn99Hw=", "GNjsW");
        q.lIlIllIIIl[q.lIlIllIIll[132]] = q.lIIlIIlIIlllI("GsTUVsaQEbo=", "wZJbd");
        q.lIlIllIIIl[q.lIlIllIIll[133]] = q.lIIlIIlIIlllI("HomaTbLGbgM=", "mPLuY");
        q.lIlIllIIIl[q.lIlIllIIll[134]] = q.lIIlIIlIIllll("lgwkyObYMauSB0d1PdxU0A==", "JqMXz");
        q.lIlIllIIIl[q.lIlIllIIll[135]] = q.lIIlIIlIIlllI("RD8ON0IOMxM=", "qmQLm");
        q.lIlIllIIIl[q.lIlIllIIll[136]] = q.lIIlIIlIlIIII("WHxq", "pICwn");
        q.lIlIllIIIl[q.lIlIllIIll[137]] = q.lIIlIIlIlIIII("BBwQHz0a", "tsdvR");
        q.lIlIllIIIl[q.lIlIllIIll[138]] = q.lIIlIIlIIlllI("VAgT1JpHHSs=", "KxSiY");
        q.lIlIllIIIl[q.lIlIllIIll[139]] = q.lIIlIIlIlIIII("Mgw8EAos", "BcHye");
        q.lIlIllIIIl[q.lIlIllIIll[140]] = q.lIIlIIlIIlllI("Ideb6awcd9bWkTnXVhQOgA==", "SLNLp");
        q.lIlIllIIIl[q.lIlIllIIll[141]] = q.lIIlIIlIIlllI("Nb6sZLqHyw0=", "RrThj");
        q.lIlIllIIIl[q.lIlIllIIll[142]] = q.lIIlIIlIlIIII("W2pt", "sYDLg");
        q.lIlIllIIIl[q.lIlIllIIll[102]] = q.lIIlIIlIIllll("bC1iQvEH18o=", "kQjqy");
        q.lIlIllIIIl[q.lIlIllIIll[143]] = q.lIIlIIlIlIIII("UWxs", "yYEVP");
        q.lIlIllIIIl[q.lIlIllIIll[144]] = q.lIIlIIlIIllll("70bUqQPowNU=", "LUSCh");
        q.lIlIllIIIl[q.lIlIllIIll[145]] = q.lIIlIIlIlIIII("TnxM", "fHeKN");
        q.lIlIllIIIl[q.lIlIllIIll[146]] = q.lIIlIIlIIllll("qfBGw8dn/t0=", "ptdMu");
        q.lIlIllIIIl[q.lIlIllIIll[147]] = q.lIIlIIlIIlllI("4rxU+AQUH/NN0DxK2CX2hA==", "orYAK");
        q.lIlIllIIIl[q.lIlIllIIll[148]] = q.lIIlIIlIIlllI("3g01NLXbzV8=", "pMzAf");
        q.lIlIllIIIl[q.lIlIllIIll[149]] = q.lIIlIIlIIllll("asuObA59INA=", "OCVHJ");
        q.lIlIllIIIl[q.lIlIllIIll[150]] = q.lIIlIIlIlIIII("Nx4HJB4p", "GqsMq");
        q.lIlIllIIIl[q.lIlIllIIll[151]] = q.lIIlIIlIIlllI("0m5yqfXya1A=", "DZEae");
        q.lIlIllIIIl[q.lIlIllIIll[152]] = q.lIIlIIlIlIIII("CCgwECoW", "xGDyE");
        q.lIlIllIIIl[q.lIlIllIIll[153]] = q.lIIlIIlIIllll("2XbyEt9DkBQ=", "zpVkx");
        q.lIlIllIIIl[q.lIlIllIIll[154]] = q.lIIlIIlIIlllI("GA0MNwKFjvk=", "pibGX");
        q.lIlIllIIIl[q.lIlIllIIll[155]] = q.lIIlIIlIlIIII("WF1E", "pimsV");
        q.lIlIllIIIl[q.lIlIllIIll[156]] = q.lIIlIIlIlIIII("GgIeJxkE", "jmjNv");
        q.lIlIllIIIl[q.lIlIllIIll[157]] = q.lIIlIIlIIllll("7NKhYcHAoQrfRYS+Z+sDAg==", "URoSt");
        q.lIlIllIIIl[q.lIlIllIIll[158]] = q.lIIlIIlIlIIII("BwgcGBgJBg==", "jmxhy");
        q.lIlIllIIIl[q.lIlIllIIll[159]] = q.lIIlIIlIIlllI("WwDYK6oIcz8=", "HGbXy");
        q.lIlIllIIIl[q.lIlIllIIll[160]] = q.lIIlIIlIlIIII("PjsKPBUc", "nIkEp");
        q.lIlIllIIIl[q.lIlIllIIll[161]] = q.lIIlIIlIlIIII("BgY7Fh8m", "UmRzs");
        q.lIlIllIIIl[q.lIlIllIIll[162]] = q.lIIlIIlIlIIII("IAAsFQkA", "skEye");
        q.lIlIllIIIl[q.lIlIllIIll[163]] = q.lIIlIIlIIlllI("la2vHnLF90s=", "WiEMI");
        q.lIlIllIIIl[q.lIlIllIIll[164]] = q.lIIlIIlIIlllI("CEFcG7b5K4o=", "BbCeY");
        q.lIlIllIIIl[q.lIlIllIIll[165]] = q.lIIlIIlIIlllI("V0meYts6lWM4e1ZoHyZb3w==", "gBITc");
        q.lIlIllIIIl[q.lIlIllIIll[174]] = q.lIIlIIlIlIIII("PwIaSw==", "fgieY");
        q.lIlIllIIIl[q.lIlIllIIll[175]] = q.lIIlIIlIIlllI("Q/BQufDKx8FDf/46Q4bi9THjp5J24a9JsxDjh1+uL+g=", "bWjSy");
        q.lIlIllIIIl[q.lIlIllIIll[176]] = q.lIIlIIlIIllll("afewS9bUW/lLulevA1ANL7mXsZib3Uvk", "KuSJS");
        q.lIlIllIIIl[q.lIlIllIIll[177]] = q.lIIlIIlIIllll("pU8mF7TLxEuYNEct30SP/eUpyHK+b7vtKrTgt07dJEw=", "epGvD");
        q.lIlIllIIIl[q.lIlIllIIll[178]] = q.lIIlIIlIIlllI("Ke805+7dlbLyv9VHEdYsbX1lvrFEstrwJo8ovhjJEwQ=", "LPaRH");
        q.lIlIllIIIl[q.lIlIllIIll[179]] = q.lIIlIIlIlIIII("CRgnNEFmOmY/CCUYKSNND1MlLANmBycmCGYKKThD", "FsFMm");
        q.lIlIllIIIl[q.lIlIllIIll[180]] = q.lIIlIIlIIlllI("+zUAh0V2eJ68nzjSV2NiU89y9Qt+SpunziH+jHWy2yI=", "CEyrL");
        q.lIlIllIIIl[q.lIlIllIIll[181]] = q.lIIlIIlIIlllI("Zw/FVDw6/RwiFVKCRTdQBlxbp6NF6bUy", "JOHTJ");
        q.lIlIllIIIl[q.lIlIllIIll[182]] = q.lIIlIIlIIllll("K0/hlqsVoELwdPbfhNFh4XGVtJymq88D9Yt81psPiEfBeMSRNwEf+QxRtlIXZJ2k", "dobiE");
    }

    private static void lIIlIIlIlllll() {
        lIlIllIIll = new int[184];
        q.lIlIllIIll[0] = " ".length();
        q.lIlIllIIll[1] = (0x4A ^ 0) & ~(0x1E ^ 0x54);
        q.lIlIllIIll[2] = -(0xFFFFE32D & 0x3CF6) & (0xFFFFB7EF & 0x7BBB);
        q.lIlIllIIll[3] = "  ".length();
        q.lIlIllIIll[4] = 0x3A ^ 0x3E;
        q.lIlIllIIll[5] = "   ".length();
        q.lIlIllIIll[6] = 0xFFFFB7F9 & 0x7957;
        q.lIlIllIIll[7] = 0xFFFFCF86 & 0x39FB;
        q.lIlIllIIll[8] = 92 + 130 - 170 + 79 ^ 15 + 98 - -26 + 0;
        q.lIlIllIIll[9] = 0x75 ^ 0x70;
        q.lIlIllIIll[10] = 0xFFFFFFF7 & 0x1F4F;
        q.lIlIllIIll[11] = -(0xFFFFE75D & 0x59BF) & (0xFFFFEFDE & 0x7FFD);
        q.lIlIllIIll[12] = -(0xFFFFEFDF & 0x7AED) & (0xFFFFFFFF & 0x6FFF);
        q.lIlIllIIll[13] = 0xDD ^ 0xB6 ^ (0x20 ^ 0x41);
        q.lIlIllIIll[14] = 130 + 124 - 144 + 80 ^ 75 + 14 - -68 + 27;
        q.lIlIllIIll[15] = 151 + 158 - 296 + 150 ^ 44 + 82 - 22 + 60;
        q.lIlIllIIll[16] = 0x79 ^ 0x30 ^ (0xAD ^ 0xA5);
        q.lIlIllIIll[17] = 0x55 ^ 0x5C;
        q.lIlIllIIll[18] = 0x1B ^ 0x10;
        q.lIlIllIIll[19] = 0x52 ^ 0x2B ^ (0x33 ^ 0x46);
        q.lIlIllIIll[20] = 0x20 ^ 0x2D;
        q.lIlIllIIll[21] = 0x10 ^ 0x1E;
        q.lIlIllIIll[22] = 0x91 ^ 0x9E;
        q.lIlIllIIll[23] = -(0xFFFFFBEF & 0x6CFB) & (0xFFFFFEEF & 0x6FFB);
        q.lIlIllIIll[24] = 0xFFFFAEAB & 0x5F75;
        q.lIlIllIIll[25] = 0x17 ^ 0x38 ^ (0x55 ^ 0x6A);
        q.lIlIllIIll[26] = -(0xFFFFFDFF & 0x6241) & (0xFFFFE7EF & 0x7E57);
        q.lIlIllIIll[27] = -(0xFFFFF55B & 0x3BBD) & (0xFFFFBFBF & 0x7F7F);
        q.lIlIllIIll[28] = 0xBE ^ 0xAF;
        q.lIlIllIIll[29] = 0x84 ^ 0x96;
        q.lIlIllIIll[30] = 0x23 ^ 0x30;
        q.lIlIllIIll[31] = 0x49 ^ 0x5D;
        q.lIlIllIIll[32] = 0xFE ^ 0xC4 ^ (0x36 ^ 0x19);
        q.lIlIllIIll[33] = 0x5A ^ 0x4C;
        q.lIlIllIIll[34] = 22 + 19 - -24 + 85 ^ 97 + 128 - 115 + 19;
        q.lIlIllIIll[35] = 0x9C ^ 0xBC ^ (0x29 ^ 0x11);
        q.lIlIllIIll[36] = 5 + 135 - 125 + 166 ^ 78 + 160 - 150 + 84;
        q.lIlIllIIll[37] = 0x52 ^ 0x61 ^ (0x42 ^ 0x6B);
        q.lIlIllIIll[38] = 0xFF ^ 0xBB ^ (0xDC ^ 0x83);
        q.lIlIllIIll[39] = 0x5D ^ 0x26 ^ (0x59 ^ 0x3E);
        q.lIlIllIIll[40] = 0x49 ^ 0x54;
        q.lIlIllIIll[41] = 0xDC ^ 0xC2;
        q.lIlIllIIll[42] = 24 + 93 - -32 + 9 ^ 107 + 89 - 80 + 13;
        q.lIlIllIIll[43] = 0x56 ^ 0x76;
        q.lIlIllIIll[44] = 0xAE ^ 0xC5 ^ (0x36 ^ 0x7C);
        q.lIlIllIIll[45] = 0x40 ^ 0x62;
        q.lIlIllIIll[46] = 0x2D ^ 0xE;
        q.lIlIllIIll[47] = 0xC2 ^ 0x9F ^ (0x7B ^ 2);
        q.lIlIllIIll[48] = 0xFFFFF7BF & 0x3C6E;
        q.lIlIllIIll[49] = 0xFFFFBCFF & 0x772D;
        q.lIlIllIIll[50] = -(0xFFFFBB0F & 0x4DF5) & (0xFFFFFDB6 & 0x3F7D);
        q.lIlIllIIll[51] = 0xFFFFB5AF & 0x7E7F;
        q.lIlIllIIll[52] = -(0xFFFFCECB & 0x7B7F) & (0xFFFFFE7F & 0x7FFB);
        q.lIlIllIIll[53] = 0xA7 ^ 0x82;
        q.lIlIllIIll[54] = 0x55 ^ 0x73;
        q.lIlIllIIll[55] = 0x2E ^ 9;
        q.lIlIllIIll[56] = 0xFFFFB6FF & 0x7D33;
        q.lIlIllIIll[57] = -(0xFFFFEBCE & 0x5FB3) & (0xFFFFFFB7 & 0x7FFB);
        q.lIlIllIIll[58] = 0xFFFFBE7D & 0x75B7;
        q.lIlIllIIll[59] = -(0xFFFFDBCF & 0x6FBB) & (0xFFFFFFBE & Short.MAX_VALUE);
        q.lIlIllIIll[60] = -(0xFFFFCF8B & 0x327D) & (0xFFFFFFBE & 0x367F);
        q.lIlIllIIll[61] = 0x2E ^ 0x74 ^ (6 ^ 0x74);
        q.lIlIllIIll[62] = 0x24 ^ 0xD;
        q.lIlIllIIll[63] = 151 + 79 - 151 + 106 ^ 53 + 101 - 125 + 118;
        q.lIlIllIIll[64] = 0xFFFFB77D & 0x7CBA;
        q.lIlIllIIll[65] = -(0xFFFFEFDF & 0x5269) & (0xFFFFF6FF & 0x7F7F);
        q.lIlIllIIll[66] = -(0xFFFFF08A & 0x4FF7) & (0xFFFFFDFF & 0x76BB);
        q.lIlIllIIll[67] = -(0xFFFFFFE7 & 0x4399) & (0xFFFFFFF9 & 0x77BF);
        q.lIlIllIIll[68] = 0xFFFFF67B & 0x3DBF;
        q.lIlIllIIll[69] = 0x31 ^ 0x22 ^ (0x9A ^ 0xA2);
        q.lIlIllIIll[70] = 0xC9 ^ 0x94 ^ (0x7F ^ 0xE);
        q.lIlIllIIll[71] = 2 ^ 0x2F;
        q.lIlIllIIll[72] = 0x87 ^ 0xA9;
        q.lIlIllIIll[73] = 0xFFFFB77F & 0x7CBD;
        q.lIlIllIIll[74] = -(0xFFFFCFAF & 0x78D1) & (0xFFFFFFFC & 0x7CBF);
        q.lIlIllIIll[75] = -(0xFFFFD341 & 0x6CFF) & (0xFFFFF77F & 0x7CFF);
        q.lIlIllIIll[76] = -(0xFFFF9D3F & 0x63C2) & (0xFFFFB7FF & 0x7D3F);
        q.lIlIllIIll[77] = -(0xFFFFFFBE & 0x41CD) & (0xFFFFFFFF & 0x75CB);
        q.lIlIllIIll[78] = 0x2D ^ 2;
        q.lIlIllIIll[79] = 0x85 ^ 0x92 ^ (0x87 ^ 0xA0);
        q.lIlIllIIll[80] = 0x23 ^ 0x15 ^ (0xA2 ^ 0xA5);
        q.lIlIllIIll[81] = 0x20 ^ 0x12;
        q.lIlIllIIll[82] = 0xFFFFFC62 & 0x37DF;
        q.lIlIllIIll[83] = 0xFFFFFF65 & 0x34DB;
        q.lIlIllIIll[84] = 0xFFFFF664 & 0x3DDF;
        q.lIlIllIIll[85] = 0xFFFFF5DF & 0x3E63;
        q.lIlIllIIll[86] = 0xFFFFF5C7 & 0x3E7D;
        q.lIlIllIIll[87] = 0xAA ^ 0xB5 ^ (0xB2 ^ 0x9E);
        q.lIlIllIIll[88] = 0x73 ^ 0x1F ^ (0x17 ^ 0x4F);
        q.lIlIllIIll[89] = 0xBF ^ 0x8A;
        q.lIlIllIIll[90] = 0x33 ^ 5;
        q.lIlIllIIll[91] = 0x87 ^ 0xBD ^ (0x63 ^ 0x6E);
        q.lIlIllIIll[92] = 0xEF ^ 0x9D ^ (0x62 ^ 0x28);
        q.lIlIllIIll[93] = 0 ^ 0x39;
        q.lIlIllIIll[94] = 92 + 115 - 187 + 166 ^ 103 + 100 - 192 + 117;
        q.lIlIllIIll[95] = 0xFFFFE3DF & 0x7FBC;
        q.lIlIllIIll[96] = -(0xFFFF9F3B & 0x75C5) & (0xFFFFD5EA & 0xBFFD);
        q.lIlIllIIll[97] = -(0xFFFFBC93 & 0x63EE) & (0xFFFFF6FD & 0xBFE7);
        q.lIlIllIIll[98] = 0xFFFFFFDD & 0x2EEE;
        q.lIlIllIIll[99] = 0xFFFFFFBC & 0x61EB;
        q.lIlIllIIll[100] = -(0xFFFF8DDB & 0x7377) & (0xFFFFBFDF & 0x7DFE);
        q.lIlIllIIll[101] = -(0xFFFFF6F3 & 0x2D7E) & (0xFFFFB7FF & 0x6FF5);
        q.lIlIllIIll[102] = 8 ^ 0x63 ^ (0x67 ^ 0x68);
        q.lIlIllIIll[103] = 0x2B ^ 0x10;
        q.lIlIllIIll[104] = 31 + 5 - -14 + 92 ^ 27 + 118 - 80 + 113;
        q.lIlIllIIll[105] = 0x4F ^ 0x3D ^ (0x76 ^ 0x39);
        q.lIlIllIIll[106] = 0x3D ^ 0xF ^ (0xA ^ 6);
        q.lIlIllIIll[107] = 0x11 ^ 0x2E;
        q.lIlIllIIll[108] = 205 + 192 - 227 + 74 ^ 135 + 170 - 176 + 51;
        q.lIlIllIIll[109] = 0x52 ^ 0x10;
        q.lIlIllIIll[110] = 0x7E ^ 0x3D;
        q.lIlIllIIll[111] = 0x19 ^ 0xB ^ (0x52 ^ 4);
        q.lIlIllIIll[112] = 0x39 ^ 0x7C;
        q.lIlIllIIll[113] = 0xEE ^ 0xA8;
        q.lIlIllIIll[114] = 0xFB ^ 0xBC;
        q.lIlIllIIll[115] = 47 + 9 - 6 + 151 ^ 11 + 49 - 2 + 71;
        q.lIlIllIIll[116] = 0x6F ^ 0x65 ^ (0x36 ^ 0x75);
        q.lIlIllIIll[117] = 0x3C ^ 0x6A ^ (0xBD ^ 0xA1);
        q.lIlIllIIll[118] = 1 ^ 0x11 ^ (0xEA ^ 0xB1);
        q.lIlIllIIll[119] = 0x51 ^ 0x1D;
        q.lIlIllIIll[120] = 0x4C ^ 1;
        q.lIlIllIIll[121] = 0x44 ^ 0xA;
        q.lIlIllIIll[122] = 0xFD ^ 0xB2;
        q.lIlIllIIll[123] = 0xD5 ^ 0x85;
        q.lIlIllIIll[124] = 0x3B ^ 0x6A;
        q.lIlIllIIll[125] = 0x96 ^ 0xC4;
        q.lIlIllIIll[126] = 0xE3 ^ 0xB0;
        q.lIlIllIIll[127] = 110 + 164 - 240 + 169 ^ 20 + 20 - -47 + 72;
        q.lIlIllIIll[128] = 103 + 89 - 49 + 74 ^ 110 + 25 - 33 + 38;
        q.lIlIllIIll[129] = 0x4A ^ 5 ^ (0x3F ^ 0x26);
        q.lIlIllIIll[130] = 87 + 13 - 60 + 87 ^ (0xBE ^ 0x96);
        q.lIlIllIIll[131] = 0xBD ^ 0x9A ^ 109 + 89 - 164 + 93;
        q.lIlIllIIll[132] = 0x63 ^ 0x3A;
        q.lIlIllIIll[133] = 0x18 ^ 0x35 ^ (0x6A ^ 0x1D);
        q.lIlIllIIll[134] = 0xEC ^ 0xB7;
        q.lIlIllIIll[135] = 0x9D ^ 0xC1;
        q.lIlIllIIll[136] = 0x2D ^ 0x70;
        q.lIlIllIIll[137] = 0x27 ^ 0x79;
        q.lIlIllIIll[138] = 0xF6 ^ 0xA9;
        q.lIlIllIIll[139] = 0xA0 ^ 0xC0;
        q.lIlIllIIll[140] = 0xD0 ^ 0xB1;
        q.lIlIllIIll[141] = 0x71 ^ 0x13;
        q.lIlIllIIll[142] = 0x60 ^ 3;
        q.lIlIllIIll[143] = 0xD0 ^ 0xB8 ^ (0xB ^ 6);
        q.lIlIllIIll[144] = 1 ^ 0x79 ^ (0x92 ^ 0x8C);
        q.lIlIllIIll[145] = 45 + 131 - 34 + 96 ^ 99 + 54 - 51 + 35;
        q.lIlIllIIll[146] = 0x43 ^ 0x5C ^ (0xB ^ 0x7C);
        q.lIlIllIIll[147] = 1 ^ 0x52 ^ (0x5B ^ 0x61);
        q.lIlIllIIll[148] = 0xDE ^ 0xB4;
        q.lIlIllIIll[149] = 0x5C ^ 0x69 ^ (0x53 ^ 0xD);
        q.lIlIllIIll[150] = 0x27 ^ 0x45 ^ (0xB9 ^ 0xB7);
        q.lIlIllIIll[151] = 0xF5 ^ 0x8D ^ (8 ^ 0x1D);
        q.lIlIllIIll[152] = 7 ^ 0x69;
        q.lIlIllIIll[153] = 2 ^ 0x75 ^ (0x6E ^ 0x76);
        q.lIlIllIIll[154] = 0x2C ^ 0x1B ^ (0x65 ^ 0x22);
        q.lIlIllIIll[155] = 0x63 ^ 0x12;
        q.lIlIllIIll[156] = 0x18 ^ 0x6A;
        q.lIlIllIIll[157] = 0x60 ^ 0x13;
        q.lIlIllIIll[158] = 0xB3 ^ 0xC7;
        q.lIlIllIIll[159] = 0x45 ^ 2 ^ (0xA3 ^ 0x91);
        q.lIlIllIIll[160] = 0xF2 ^ 0x84;
        q.lIlIllIIll[161] = 47 + 60 - 54 + 124 ^ 140 + 82 - 87 + 63;
        q.lIlIllIIll[162] = 0x34 ^ 0x32 ^ (0x34 ^ 0x4A);
        q.lIlIllIIll[163] = 0x39 ^ 0x40;
        q.lIlIllIIll[164] = 0x41 ^ 0x3B;
        q.lIlIllIIll[165] = 0x38 ^ 0x43;
        q.lIlIllIIll[166] = 0xFFFFAFCF & 0x5CB7;
        q.lIlIllIIll[167] = 0xFFFFCDD7 & 0x3EBE;
        q.lIlIllIIll[168] = 0xFFFFDBAF & 0x2FDD;
        q.lIlIllIIll[169] = 0xFFFFCF6E & 0x3DBD;
        q.lIlIllIIll[170] = 0xFFFFBBFF & 0x4F31;
        q.lIlIllIIll[171] = 0xFFFFF7BD & 0x2ED7;
        q.lIlIllIIll[172] = -(0xFFFFA4F7 & 0x7B3D) & (0xFFFFBFFF & 0x6BF5);
        q.lIlIllIIll[173] = 0xFFFFDDBD & 0x2FD3;
        q.lIlIllIIll[174] = 0x58 ^ 0x7B ^ (0x6D ^ 0x32);
        q.lIlIllIIll[175] = 47 + 10 - 14 + 156 ^ 157 + 49 - 90 + 70;
        q.lIlIllIIll[176] = 82 + 12 - 73 + 220 ^ 7 + 119 - 84 + 101;
        q.lIlIllIIll[177] = (0xA4 ^ 0x8A) + (0xF1 ^ 0x80) - (125 + 22 - 27 + 20) + (0x5E ^ 0x32);
        q.lIlIllIIll[178] = 111 + 23 - 12 + 6;
        q.lIlIllIIll[179] = 34 + 105 - 17 + 7;
        q.lIlIllIIll[180] = 97 + 89 - 82 + 26;
        q.lIlIllIIll[181] = (0x28 ^ 0x24) + (0x57 ^ 0x7D) - (0x82 ^ 0x84) + (0x33 ^ 0x60);
        q.lIlIllIIll[182] = (0xF8 ^ 0xBD) + (2 ^ 0x26) - (1 ^ 0x45) + (0xEA ^ 0xB5);
        q.lIlIllIIll[183] = 70 + 64 - 41 + 40;
    }

    public static void aR() {
        block7: {
            do {
                int[] nArray = new int[lIlIllIIll[0]];
                nArray[q.lIlIllIIll[1]] = lIlIllIIll[68];
                if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIlIllIIll[0]];
                    nArray2[q.lIlIllIIll[1]] = lIlIllIIll[67];
                    if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIlIllIIll[0]];
                        nArray3[q.lIlIllIIll[1]] = lIlIllIIll[66];
                        if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIlIllIIll[0]];
                            nArray4[q.lIlIllIIll[1]] = lIlIllIIll[64];
                            if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIlIllIIll[0]];
                                nArray5[q.lIlIllIIll[1]] = lIlIllIIll[65];
                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block7;
                            }
                        }
                    }
                }
                Inventory.getFirst(item -> {
                    int n2;
                    if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[110]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[111]]) ? 1 : 0)) {
                        n2 = lIlIllIIll[0];
                        "".length();
                        if (((0x5C ^ 0x7A) & ~(0x91 ^ 0xB7)) != 0) {
                            return ((0xA2 ^ 0xA6) & ~(0xB5 ^ 0xB1)) != 0;
                        }
                    } else {
                        n2 = lIlIllIIll[1];
                    }
                    return n2 != 0;
                }).interact(lIlIllIIIl[lIlIllIIll[93]]);
                Time.sleepTicks((int)lIlIllIIll[3]);
                "".length();
                if (q.lIIlIIllIIIII(AccBuilderShamans.d ? 1 : 0)) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break block7;
                }
                g.a(cy);
                "".length();
            } while (-(0x4C ^ 0x48) <= 0);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean af() {
        int n2;
        int[] nArray = new int[lIlIllIIll[0]];
        nArray[q.lIlIllIIll[1]] = lIlIllIIll[82];
        if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIllIIll[0]];
            nArray2[q.lIlIllIIll[1]] = lIlIllIIll[83];
            if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIlIllIIll[0]];
                nArray3[q.lIlIllIIll[1]] = lIlIllIIll[84];
                if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIllIIll[0]];
                    nArray4[q.lIlIllIIll[1]] = lIlIllIIll[85];
                    if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIlIllIIll[0]];
                        nArray5[q.lIlIllIIll[1]] = lIlIllIIll[86];
                        if (q.lIIlIIllIIIII(Inventory.contains((int[])nArray5) ? 1 : 0) && q.lIIlIIllIIIlI(Inventory.contains(item -> item.getName().contains(lIlIllIIIl[lIlIllIIll[104]])) ? 1 : 0)) {
                            n2 = lIlIllIIll[0];
                            "".length();
                            if ("   ".length() != 0) return n2 != 0;
                            return ((0xA9 ^ 0x8A) & ~(0x8F ^ 0xAC)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIlIllIIll[1];
        return n2 != 0;
    }

    private static boolean lIIlIIllIIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIllIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIlIIlllI(String lllllllllllllllllllIlIIIlIlIllll, String lllllllllllllllllllIlIIIlIllIIII) {
        try {
            SecretKeySpec lllllllllllllllllllIlIIIlIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIlIIIlIllIIII.getBytes(StandardCharsets.UTF_8)), lIlIllIIll[8]), "DES");
            Cipher lllllllllllllllllllIlIIIlIllIIll = Cipher.getInstance("DES");
            lllllllllllllllllllIlIIIlIllIIll.init(lIlIllIIll[3], lllllllllllllllllllIlIIIlIllIlII);
            return new String(lllllllllllllllllllIlIIIlIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIlIIIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIlIIIlIllIIlI) {
            lllllllllllllllllllIlIIIlIllIIlI.printStackTrace();
            return null;
        }
    }

    public static void aS() {
        block7: {
            do {
                int[] nArray = new int[lIlIllIIll[0]];
                nArray[q.lIlIllIIll[1]] = lIlIllIIll[77];
                if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIlIllIIll[0]];
                    nArray2[q.lIlIllIIll[1]] = lIlIllIIll[76];
                    if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIlIllIIll[0]];
                        nArray3[q.lIlIllIIll[1]] = lIlIllIIll[75];
                        if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIlIllIIll[0]];
                            nArray4[q.lIlIllIIll[1]] = lIlIllIIll[73];
                            if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIlIllIIll[0]];
                                nArray5[q.lIlIllIIll[1]] = lIlIllIIll[74];
                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block7;
                            }
                        }
                    }
                }
                Inventory.getFirst(item -> {
                    int n2;
                    if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[16]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[109]]) ? 1 : 0)) {
                        n2 = lIlIllIIll[0];
                        "".length();
                        if ((0xB ^ 0x50 ^ (0x74 ^ 0x2B)) != (0x6D ^ 4 ^ (0xCC ^ 0xA1))) {
                            return ((173 + 246 - 202 + 37 ^ 175 + 79 - 61 + 1) & (0x12 ^ 0x3E ^ (0x74 ^ 0x64) ^ -" ".length())) != 0;
                        }
                    } else {
                        n2 = lIlIllIIll[1];
                    }
                    return n2 != 0;
                }).interact(lIlIllIIIl[lIlIllIIll[94]]);
                Time.sleepTicks((int)lIlIllIIll[3]);
                "".length();
                if (q.lIIlIIllIIIII(AccBuilderShamans.d ? 1 : 0)) {
                    "".length();
                    if (((0x2D ^ 0x3B ^ (0x37 ^ 0x69)) & (0x22 ^ 0x1D ^ (0x6D ^ 0x1A) ^ -" ".length())) < 0) {
                        return;
                    }
                    break block7;
                }
                g.a(cy);
                "".length();
            } while (-"  ".length() < 0);
            return;
        }
    }

    private static void O() {
        block17: {
            d lllllllllllllllllllIlIIlIIIIIlll;
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                Object lllllllllllllllllllIlIIlIIIIlIII;
                                int[] nArray = new int[lIlIllIIll[0]];
                                nArray[q.lIlIllIIll[1]] = lIlIllIIll[11];
                                if (q.lIIlIIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(lIlIllIIll[11], lIlIllIIll[0], lIlIllIIll[95]);
                                    bp.add(d2);
                                    "".length();
                                }
                                int[] nArray2 = new int[lIlIllIIll[0]];
                                nArray2[q.lIlIllIIll[1]] = lIlIllIIll[12];
                                if (q.lIIlIIllIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    lllllllllllllllllllIlIIlIIIIlIII = new d(lIlIllIIll[12], lIlIllIIll[0], e.c(lIlIllIIll[96], lIlIllIIll[97]));
                                    bp.add((d)lllllllllllllllllllIlIIlIIIIlIII);
                                    "".length();
                                }
                                if (q.lIIlIIllIIIlI(Bank.contains(lllllllllllllllllllIlIIlIIIIlIII = item -> item.getName().toLowerCase().contains(lIlIllIIIl[lIlIllIIll[105]])) ? 1 : 0)) {
                                    lllllllllllllllllllIlIIlIIIIIlll = new d(lIlIllIIll[98], lIlIllIIll[9], lIlIllIIll[99]);
                                    bp.add(lllllllllllllllllllIlIIlIIIIIlll);
                                    "".length();
                                }
                                int[] nArray3 = new int[lIlIllIIll[0]];
                                nArray3[q.lIlIllIIll[1]] = lIlIllIIll[6];
                                if (!q.lIIlIIllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) break block12;
                                int[] nArray4 = new int[lIlIllIIll[0]];
                                nArray4[q.lIlIllIIll[1]] = lIlIllIIll[6];
                                if (!q.lIIlIIllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block13;
                                int[] nArray5 = new int[lIlIllIIll[0]];
                                nArray5[q.lIlIllIIll[1]] = lIlIllIIll[6];
                                if (!q.lIIlIIllIIIIl(Bank.getFirst((int[])nArray5).getQuantity(), lIlIllIIll[9])) break block13;
                            }
                            lllllllllllllllllllIlIIlIIIIIlll = new d(lIlIllIIll[6], lIlIllIIll[9], j.bZ);
                            bp.add(lllllllllllllllllllIlIIlIIIIIlll);
                            "".length();
                        }
                        int[] nArray = new int[lIlIllIIll[0]];
                        nArray[q.lIlIllIIll[1]] = lIlIllIIll[7];
                        if (!q.lIIlIIllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray6 = new int[lIlIllIIll[0]];
                        nArray6[q.lIlIllIIll[1]] = lIlIllIIll[7];
                        if (!q.lIIlIIllIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block15;
                        int[] nArray7 = new int[lIlIllIIll[0]];
                        nArray7[q.lIlIllIIll[1]] = lIlIllIIll[7];
                        if (!q.lIIlIIllIIIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIlIllIIll[13])) break block15;
                    }
                    lllllllllllllllllllIlIIlIIIIIlll = new d(lIlIllIIll[7], lIlIllIIll[13], lIlIllIIll[100]);
                    bp.add(lllllllllllllllllllIlIIlIIIIIlll);
                    "".length();
                }
                int[] nArray = new int[lIlIllIIll[0]];
                nArray[q.lIlIllIIll[1]] = lIlIllIIll[10];
                if (!q.lIIlIIllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray8 = new int[lIlIllIIll[0]];
                nArray8[q.lIlIllIIll[1]] = lIlIllIIll[10];
                if (!q.lIIlIIllIIIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block17;
                int[] nArray9 = new int[lIlIllIIll[0]];
                nArray9[q.lIlIllIIll[1]] = lIlIllIIll[10];
                if (!q.lIIlIIllIIIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIlIllIIll[22])) break block17;
            }
            lllllllllllllllllllIlIIlIIIIIlll = new d(lIlIllIIll[10], lIlIllIIll[61], lIlIllIIll[101]);
            bp.add(lllllllllllllllllllIlIIlIIIIIlll);
            "".length();
        }
    }

    private static boolean lIIlIIllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ae() {
        return lIlIllIIIl[lIlIllIIll[103]];
    }

    private static String lIIlIIlIlIIII(String lllllllllllllllllllIlIIIllIIIIIl, String lllllllllllllllllllIlIIIllIIIlIl) {
        lllllllllllllllllllIlIIIllIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllllllIlIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIlIIIllIIIlII = new StringBuilder();
        char[] lllllllllllllllllllIlIIIllIIIIll = lllllllllllllllllllIlIIIllIIIlIl.toCharArray();
        int lllllllllllllllllllIlIIIllIIIIlI = lIlIllIIll[1];
        char[] lllllllllllllllllllIlIIIlIllllII = lllllllllllllllllllIlIIIllIIIIIl.toCharArray();
        int lllllllllllllllllllIlIIIlIlllIll = lllllllllllllllllllIlIIIlIllllII.length;
        int lllllllllllllllllllIlIIIlIlllIlI = lIlIllIIll[1];
        while (q.lIIlIIllIIIIl(lllllllllllllllllllIlIIIlIlllIlI, lllllllllllllllllllIlIIIlIlllIll)) {
            char lllllllllllllllllllIlIIIllIIIlll = lllllllllllllllllllIlIIIlIllllII[lllllllllllllllllllIlIIIlIlllIlI];
            lllllllllllllllllllIlIIIllIIIlII.append((char)(lllllllllllllllllllIlIIIllIIIlll ^ lllllllllllllllllllIlIIIllIIIIll[lllllllllllllllllllIlIIIllIIIIlI % lllllllllllllllllllIlIIIllIIIIll.length]));
            "".length();
            ++lllllllllllllllllllIlIIIllIIIIlI;
            ++lllllllllllllllllllIlIIIlIlllIlI;
            "".length();
            if ((0x2E ^ 0x1A ^ (0x68 ^ 0x58)) <= (1 + 90 - -78 + 24 ^ 174 + 63 - 125 + 85)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIlIIIllIIIlII);
    }

    private static boolean lIIlIIllIIlIl(Object object) {
        return object == null;
    }

    @Override
    public int ad() {
        try {
            q.aO();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0xD ^ 1) & ~(0x6B ^ 0x67)) < 0) {
            return (0x9F ^ 0xA5) & ~(0x61 ^ 0x5B);
        }
        return lIlIllIIll[102];
    }

    public static void aP() {
        block7: {
            do {
                int[] nArray = new int[lIlIllIIll[0]];
                nArray[q.lIlIllIIll[1]] = lIlIllIIll[52];
                if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIlIllIIll[0]];
                    nArray2[q.lIlIllIIll[1]] = lIlIllIIll[51];
                    if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        int[] nArray3 = new int[lIlIllIIll[0]];
                        nArray3[q.lIlIllIIll[1]] = lIlIllIIll[50];
                        if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[lIlIllIIll[0]];
                            nArray4[q.lIlIllIIll[1]] = lIlIllIIll[48];
                            if (q.lIIlIIllIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[lIlIllIIll[0]];
                                nArray5[q.lIlIllIIll[1]] = lIlIllIIll[49];
                                if (!q.lIIlIIllIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block7;
                            }
                        }
                    }
                }
                Inventory.getFirst(item -> {
                    int n2;
                    if (q.lIIlIIllIIIII(item.getName().contains(lIlIllIIIl[lIlIllIIll[114]]) ? 1 : 0) && q.lIIlIIllIIIlI(item.getName().contains(lIlIllIIIl[lIlIllIIll[115]]) ? 1 : 0)) {
                        n2 = lIlIllIIll[0];
                        "".length();
                        if ((4 ^ 0x61 ^ (0x4B ^ 0x2A)) == 0) {
                            return (" ".length() & (" ".length() ^ -" ".length())) != 0;
                        }
                    } else {
                        n2 = lIlIllIIll[1];
                    }
                    return n2 != 0;
                }).interact(lIlIllIIIl[lIlIllIIll[91]]);
                Time.sleepTicks((int)lIlIllIIll[3]);
                "".length();
                if (q.lIIlIIllIIIII(AccBuilderShamans.d ? 1 : 0)) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break block7;
                }
                g.a(cy);
                "".length();
            } while ("   ".length() != 0);
            return;
        }
    }

    private static boolean lIIlIIllIIIll(Object object) {
        return object != null;
    }

    @Override
    public boolean ac() {
        return lIlIllIIll[1];
    }

    static {
        q.lIIlIIlIlllll();
        q.lIIlIIlIllllI();
        bp = new ArrayList<d>();
        cR = new WorldPoint(lIlIllIIll[166], lIlIllIIll[167], lIlIllIIll[1]);
        cS = new WorldPoint(lIlIllIIll[168], lIlIllIIll[169], lIlIllIIll[1]);
        cT = new WorldPoint(lIlIllIIll[170], lIlIllIIll[171], lIlIllIIll[1]);
        cU = new WorldPoint(lIlIllIIll[172], lIlIllIIll[173], lIlIllIIll[1]);
        String[] stringArray = new String[lIlIllIIll[17]];
        stringArray[q.lIlIllIIll[1]] = lIlIllIIIl[lIlIllIIll[174]];
        stringArray[q.lIlIllIIll[0]] = lIlIllIIIl[lIlIllIIll[175]];
        stringArray[q.lIlIllIIll[3]] = lIlIllIIIl[lIlIllIIll[176]];
        stringArray[q.lIlIllIIll[5]] = lIlIllIIIl[lIlIllIIll[177]];
        stringArray[q.lIlIllIIll[4]] = lIlIllIIIl[lIlIllIIll[178]];
        stringArray[q.lIlIllIIll[9]] = lIlIllIIIl[lIlIllIIll[179]];
        stringArray[q.lIlIllIIll[14]] = lIlIllIIIl[lIlIllIIll[180]];
        stringArray[q.lIlIllIIll[15]] = lIlIllIIIl[lIlIllIIll[181]];
        stringArray[q.lIlIllIIll[8]] = lIlIllIIIl[lIlIllIIll[182]];
        cy = stringArray;
    }
}

