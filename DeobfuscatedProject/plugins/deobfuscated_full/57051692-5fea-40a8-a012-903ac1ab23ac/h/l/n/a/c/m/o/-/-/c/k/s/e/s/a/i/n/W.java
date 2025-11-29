/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class W
implements K {
    private static /* synthetic */ WorldPoint kJ;
    private static /* synthetic */ int[] lIlIllIIlI;
    public static /* synthetic */ boolean bn;
    public static /* synthetic */ List<d> bp;
    public static /* synthetic */ WorldArea kH;
    private static /* synthetic */ WorldPoint kI;
    private static /* synthetic */ String[] lIlIllIIII;
    private static /* synthetic */ int[] kK;

    public static void dG() {
        block26: {
            BankLocation var20;
            block27: {
                block30: {
                    block29: {
                        block28: {
                            if (W.lIIlIIlIlIlIl(bn ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[42]];
                                b.a(bp);
                                if (W.lIIlIIlIlIllI(bp.size(), lIlIllIIlI[1])) {
                                    System.out.println(lIlIllIIII[lIlIllIIlI[43]]);
                                    bn = lIlIllIIlI[0];
                                }
                            }
                            if (!W.lIIlIIlIlIlll(bn ? 1 : 0)) break block26;
                            if (!W.lIIlIIlIlIlll(W.dH() ? 1 : 0)) break block27;
                            var20 = BankLocation.getNearest();
                            if (W.lIIlIIlIllIII(var20) && W.lIIlIIlIlIlll(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[44]];
                                a.a(var20);
                            }
                            if (!W.lIIlIIlIllIII(var20) || !W.lIIlIIlIlIlIl(var20.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                            if (W.lIIlIIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[45]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIllIIlI[4]);
                                0;
                            }
                            if (!W.lIIlIIlIlIlIl(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[46]];
                            if (W.lIIlIIlIllIIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIllIIlI[5]);
                                0;
                            }
                            int[] nArray = new int[lIlIllIIlI[1]];
                            nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[6];
                            if (!W.lIIlIIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                            String[] stringArray = new String[lIlIllIIlI[1]];
                            stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[47]];
                            if (!W.lIIlIIlIllIlI(Inventory.getCount((String[])stringArray), lIlIllIIlI[1])) break block29;
                        }
                        if (!W.lIIlIIlIlIlll(Bank.contains((int[])f.aN) ? 1 : 0) || !W.lIIlIIlIlIlll(Inventory.contains((int[])f.aN) ? 1 : 0) || !W.lIIlIIlIlIlll(Equipment.contains((int[])f.aN) ? 1 : 0)) break block30;
                    }
                    W.O();
                    System.out.println(lIlIllIIII[lIlIllIIlI[48]]);
                    bn = lIlIllIIlI[1];
                    return;
                }
                int[] nArray = new int[lIlIllIIlI[1]];
                nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[6];
                if (W.lIIlIIlIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)lIlIllIIII[lIlIllIIlI[49]], (int)lIlIllIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIllIIlI[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIlIllIIlI[1]];
                        stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[76]];
                        if (W.lIIlIIlIllIIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIlIllIIlI[1];
                            0;
                            
                            }
                        } else {
                            bl = lIlIllIIlI[0];
                        }
                        return bl;
                    }, (int)lIlIllIIlI[4]);
                    0;
                }
                if (W.lIIlIIlIlIlIl(Bank.contains((int[])f.aN) ? 1 : 0)) {
                    a.b(f.aN, lIlIllIIlI[1]);
                }
            }
            if (W.lIIlIIlIlIlIl(W.dH() ? 1 : 0)) {
                if (W.lIIlIIlIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (W.lIIlIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[lIlIllIIlI[1]];
                    nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[50];
                    if (W.lIIlIIlIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        var20 = new WorldPoint(lIlIllIIlI[51], lIlIllIIlI[52], lIlIllIIlI[0]);
                        if (W.lIIlIIlIllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var20), lIlIllIIlI[9])) {
                            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[53]];
                            Movement.walkTo((WorldPoint)var20);
                            0;
                            Time.sleepTicks((int)lIlIllIIlI[1]);
                            0;
                        }
                        if (W.lIIlIIlIlllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var20), lIlIllIIlI[13])) {
                            if (W.lIIlIIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (W.lIIlIIlIlIlIl(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)lIlIllIIlI[2]);
                                0;
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlIllIIlI[2]);
                                0;
                                a.a(lIlIllIIlI[6], lIlIllIIlI[1]);
                            }
                        }
                    }
                }
                if (W.lIIlIIlIlIlll(Inventory.isFull() ? 1 : 0)) {
                    if (W.lIIlIIlIlIlll(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.lIIlIIlIllIll(Players.getLocal().getWorldLocation().distanceTo(kI), lIlIllIIlI[7])) {
                        AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[54]];
                        if (W.lIIlIIlIlIlIl(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aN).interact(lIlIllIIII[lIlIllIIlI[55]]);
                        }
                        Movement.walkTo((WorldPoint)kI);
                        0;
                        Time.sleepTicks((int)lIlIllIIlI[1]);
                        0;
                    }
                    if (W.lIIlIIlIlIlIl(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[56]];
                        if (W.lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30])) {
                            int[] nArray = new int[lIlIllIIlI[1]];
                            nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[31];
                            if (W.lIIlIIlIllIII(NPCs.getNearest((int[])nArray))) {
                                int[] nArray2 = new int[lIlIllIIlI[1]];
                                nArray2[W.lIlIllIIlI[0]] = lIlIllIIlI[31];
                                NPCs.getNearest((int[])nArray2).interact(lIlIllIIlI[0]);
                                Time.sleepTicks((int)lIlIllIIlI[7]);
                                0;
                            }
                        }
                    }
                }
                if (W.lIIlIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[lIlIllIIlI[1]];
                    nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[50];
                    if (W.lIIlIIlIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIlIllIIlI[1]];
                        nArray3[W.lIlIllIIlI[0]] = lIlIllIIlI[50];
                        Inventory.getAll((int[])nArray3).stream().forEach(Item::drop);
                    }
                }
            }
        }
    }

    private static boolean lIIlIIlIlllII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int ad() {
        W.dE();
        return lIlIllIIlI[72];
    }

    public static void O() {
        d var9;
        Object var1;
        int[] nArray = new int[lIlIllIIlI[1]];
        nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[6];
        if (W.lIIlIIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIlIllIIlI[6], lIlIllIIlI[1], lIlIllIIlI[4]);
            bp.add(d2);
            0;
        }
        int[] nArray2 = new int[lIlIllIIlI[1]];
        nArray2[W.lIlIllIIlI[0]] = lIlIllIIlI[8];
        if (W.lIIlIIlIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var1 = new d(lIlIllIIlI[8], lIlIllIIlI[1], lIlIllIIlI[4]);
            bp.add((d)var1);
            0;
        }
        int[] nArray3 = new int[lIlIllIIlI[1]];
        nArray3[W.lIlIllIIlI[0]] = lIlIllIIlI[10];
        if (W.lIIlIIlIlIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var1 = new d(lIlIllIIlI[10], lIlIllIIlI[1], lIlIllIIlI[63]);
            bp.add((d)var1);
            0;
        }
        int[] nArray4 = new int[lIlIllIIlI[1]];
        nArray4[W.lIlIllIIlI[0]] = lIlIllIIlI[14];
        if (W.lIIlIIlIlIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new d(lIlIllIIlI[14], lIlIllIIlI[64], lIlIllIIlI[65]);
            bp.add((d)var1);
            0;
        }
        int[] nArray5 = new int[lIlIllIIlI[1]];
        nArray5[W.lIlIllIIlI[0]] = lIlIllIIlI[12];
        if (W.lIIlIIlIlIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var1 = new d(lIlIllIIlI[12], lIlIllIIlI[66], lIlIllIIlI[7]);
            bp.add((d)var1);
            0;
        }
        int[] nArray6 = new int[lIlIllIIlI[1]];
        nArray6[W.lIlIllIIlI[0]] = lIlIllIIlI[67];
        if (W.lIIlIIlIlIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var1 = new d(lIlIllIIlI[67], lIlIllIIlI[1], lIlIllIIlI[4]);
            bp.add((d)var1);
            0;
        }
        int[] nArray7 = new int[lIlIllIIlI[1]];
        nArray7[W.lIlIllIIlI[0]] = lIlIllIIlI[24];
        if (W.lIIlIIlIlIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var1 = new d(lIlIllIIlI[24], lIlIllIIlI[16], lIlIllIIlI[4]);
            bp.add((d)var1);
            0;
        }
        if (W.lIIlIIlIlIlll(Bank.contains((Predicate)(var1 = item -> item.getName().toLowerCase().contains(lIlIllIIII[lIlIllIIlI[75]]))) ? 1 : 0)) {
            var9 = new d(lIlIllIIlI[68], lIlIllIIlI[7], lIlIllIIlI[69]);
            bp.add(var9);
            0;
        }
        int[] nArray8 = new int[lIlIllIIlI[1]];
        nArray8[W.lIlIllIIlI[0]] = lIlIllIIlI[70];
        if (W.lIIlIIlIlIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var9 = new d(lIlIllIIlI[70], lIlIllIIlI[54], lIlIllIIlI[71]);
            bp.add(var9);
            0;
        }
    }

    private static void lIIlIIlIlIlII() {
        lIlIllIIlI = new int[101];
        W.lIlIllIIlI[0] = 1 & (1 ^ -1);
        W.lIlIllIIlI[1] = 1;
        W.lIlIllIIlI[2] = 2;
        W.lIlIllIIlI[3] = 3;
        W.lIlIllIIlI[4] = -(0xFFFFDC97 & 0x2F79) & (0xFFFFDFFD & 0x3F9A);
        W.lIlIllIIlI[5] = 0x63 ^ 0x67;
        W.lIlIllIIlI[6] = 0xFFFFD9EF & 0x273F;
        W.lIlIllIIlI[7] = 0xBF ^ 0xBA;
        W.lIlIllIIlI[8] = 0xFFFFC5FB & 0x3B37;
        W.lIlIllIIlI[9] = 0xBC ^ 0xBA;
        W.lIlIllIIlI[10] = 0xFFFF9B7D & 0x65B7;
        W.lIlIllIIlI[11] = 0x56 ^ 0x5E ^ (0xA5 ^ 0xAA);
        W.lIlIllIIlI[12] = -(130 + 86 - 134 + 116) & (0xFFFFD5FF & 0x2BFF);
        W.lIlIllIIlI[13] = 0x66 ^ 0x6E;
        W.lIlIllIIlI[14] = -(0xFFFFB5C7 & 0x6AF9) & (0xFFFFB1FB & 0x6FFD);
        W.lIlIllIIlI[15] = 0xCF ^ 0xC6;
        W.lIlIllIIlI[16] = 91 + 40 - 94 + 105 ^ 41 + 15 - -48 + 28;
        W.lIlIllIIlI[17] = 0xAD ^ 0xA6;
        W.lIlIllIIlI[18] = 0x6A ^ 0x66;
        W.lIlIllIIlI[19] = 0x54 ^ 0xB ^ (0x94 ^ 0xC6);
        W.lIlIllIIlI[20] = 0x7C ^ 0x72;
        W.lIlIllIIlI[21] = 0xFFFFF7FA & 0x18EA5;
        W.lIlIllIIlI[22] = 0x35 ^ 0x3A;
        W.lIlIllIIlI[23] = -(0xFFFFF80B & 0xFF7) & (0xFFFF8BFB & 0x7FEE);
        W.lIlIllIIlI[24] = -(47 + 75 - 63 + 70) & (0xFFFF9FFC & 0x7FCB);
        W.lIlIllIIlI[25] = 0x76 ^ 0x66;
        W.lIlIllIIlI[26] = 0x53 ^ 0xD ^ (0x27 ^ 0x68);
        W.lIlIllIIlI[27] = 0x8B ^ 0x87 ^ (0x11 ^ 9);
        W.lIlIllIIlI[28] = 0xF ^ 0x1D;
        W.lIlIllIIlI[29] = 0x66 ^ 0x75;
        W.lIlIllIIlI[30] = -1;
        W.lIlIllIIlI[31] = 0xFFFF9F3D & 0x66CA;
        W.lIlIllIIlI[32] = 0x49 ^ 0x5C;
        W.lIlIllIIlI[33] = 0x5F ^ 0x55 ^ (8 ^ 0x14);
        W.lIlIllIIlI[34] = 0x11 ^ 6;
        W.lIlIllIIlI[35] = 0xC ^ 0x14;
        W.lIlIllIIlI[36] = 0x8B ^ 0x92;
        W.lIlIllIIlI[37] = 157 + 37 - 58 + 34 ^ 103 + 74 - 75 + 74;
        W.lIlIllIIlI[38] = 0x91 ^ 0xAF ^ (0x9A ^ 0xBF);
        W.lIlIllIIlI[39] = 0x7C ^ 0x64 ^ (0x62 ^ 0x66);
        W.lIlIllIIlI[40] = 0x9A ^ 0x87;
        W.lIlIllIIlI[41] = 0x6E ^ 0x70;
        W.lIlIllIIlI[42] = 106 + 93 - 150 + 116 ^ 137 + 32 - 4 + 21;
        W.lIlIllIIlI[43] = 3 ^ 0x23;
        W.lIlIllIIlI[44] = 0xD0 ^ 0xA5 ^ (0xE6 ^ 0xB2);
        W.lIlIllIIlI[45] = 74 + 23 - 0 + 58 ^ 178 + 78 - 87 + 16;
        W.lIlIllIIlI[46] = 0xC2 ^ 0xAB ^ (0x8D ^ 0xC7);
        W.lIlIllIIlI[47] = 0x1B ^ 0x3F;
        W.lIlIllIIlI[48] = 0x4C ^ 0x69;
        W.lIlIllIIlI[49] = 0x1E ^ 0x38;
        W.lIlIllIIlI[50] = -(0xFFFFEF6B & 0x7A9F) & (0xFFFFEF6F & 0x7BDB);
        W.lIlIllIIlI[51] = 0xFFFFA9EF & 0x5FF7;
        W.lIlIllIIlI[52] = 0xFFFF9DF7 & 0x6FFD;
        W.lIlIllIIlI[53] = 1 ^ 0x26;
        W.lIlIllIIlI[54] = 0x99 ^ 0xB1;
        W.lIlIllIIlI[55] = 85 + 97 - 57 + 53 ^ 33 + 148 - 58 + 32;
        W.lIlIllIIlI[56] = 0x35 ^ 0x1F;
        W.lIlIllIIlI[57] = 0x7D ^ 0x56;
        W.lIlIllIIlI[58] = 0xE6 ^ 0xBD ^ (0x11 ^ 0x66);
        W.lIlIllIIlI[59] = 0x28 ^ 5;
        W.lIlIllIIlI[60] = 90 + 103 - 146 + 91 ^ 154 + 79 - 155 + 86;
        W.lIlIllIIlI[61] = 0x36 ^ 0x19;
        W.lIlIllIIlI[62] = 0x99 ^ 0xA9;
        W.lIlIllIIlI[63] = -(0xFFFFDDFB & 0x7E57) & (0xFFFFFF7E & 0x7FFB);
        W.lIlIllIIlI[64] = -(0xFFFFF6E7 & 0x5F9C) & (0xFFFFD7EF & 0x7FBF);
        W.lIlIllIIlI[65] = 0xFFFFB7F4 & 0x49FF;
        W.lIlIllIIlI[66] = 0xFFFFBEFD & 0x73CA;
        W.lIlIllIIlI[67] = -(0xFFFFFAD3 & 0x657D) & (0xFFFFEFDD & 0x7F7F);
        W.lIlIllIIlI[68] = -(0xFFFFCD9C & 0x7377) & (0xFFFFEFFF & 0x7FDF);
        W.lIlIllIIlI[69] = 0xFFFFE3FD & 0x7DAA;
        W.lIlIllIIlI[70] = 0xFFFFDFDF & 0x3F67;
        W.lIlIllIIlI[71] = 0xFFFFEBF4 & 0x178F;
        W.lIlIllIIlI[72] = 178 + 78 - 224 + 188 ^ 176 + 44 - 190 + 154;
        W.lIlIllIIlI[73] = 0x81 ^ 0xB0;
        W.lIlIllIIlI[74] = 0xF2 ^ 0xB4 ^ (0x77 ^ 0x52);
        W.lIlIllIIlI[75] = 0xBF ^ 0xA8 ^ (3 ^ 0x26);
        W.lIlIllIIlI[76] = 0x3E ^ 0xD;
        W.lIlIllIIlI[77] = 0xFFFFBFF7 & 0x45EC;
        W.lIlIllIIlI[78] = 0xB4 ^ 0x80;
        W.lIlIllIIlI[79] = 0xC ^ 0x67 ^ (0x4A ^ 0x14);
        W.lIlIllIIlI[80] = 194 + 176 - 160 + 37 ^ 161 + 45 - 88 + 75;
        W.lIlIllIIlI[81] = 0xBF ^ 0x88;
        W.lIlIllIIlI[82] = 0x35 ^ 0xD;
        W.lIlIllIIlI[83] = -(0xFFFFDF76 & 0x34AF) & (0xFFFFFFFF & 0x1DEF);
        W.lIlIllIIlI[84] = -(0xFFFFD2DF & 0x6F3A) & (0xFFFFCFFD & Short.MAX_VALUE);
        W.lIlIllIIlI[85] = -(0xFFFFD6F5 & 0x3D2B) & (0xFFFFBDFF & 0x5FF5);
        W.lIlIllIIlI[86] = 0xFFFFCFFC & 0x3DF7;
        W.lIlIllIIlI[87] = 0xFFFF89F5 & 0x7FEE;
        W.lIlIllIIlI[88] = -(21 + 81 - 89 + 118) & (0xFFFFEFFE & 0x1DD7);
        W.lIlIllIIlI[89] = -(0xFFFFDE9F & 0x6B79) & (0xFFFFCFFF & Short.MAX_VALUE);
        W.lIlIllIIlI[90] = -(0xFFFFFA4F & 0x3FBD) & (0xFFFFBFFD & Short.MAX_VALUE);
        W.lIlIllIIlI[91] = 0xFFFF8DFF & 0x77EF;
        W.lIlIllIIlI[92] = 0xFFFFF9BF & 0x77D;
        W.lIlIllIIlI[93] = 0xFFFFB3D7 & 0x4D6F;
        W.lIlIllIIlI[94] = -(0xFFFFAB27 & 0x7EFD) & (0xFFFFAB6F & Short.MAX_VALUE);
        W.lIlIllIIlI[95] = 0xFFFFA179 & 0x5FDF;
        W.lIlIllIIlI[96] = -(0xFFFFF7FD & 0x7A33) & (0xFFFFFBFF & 0x777F);
        W.lIlIllIIlI[97] = -(0xFFFFF139 & 0x4ECF) & (0xFFFFEFEF & 0x7C5A);
        W.lIlIllIIlI[98] = -(0xFFFFF69B & 0x4BFE) & (0xFFFFFFDD & 0x6EFF);
        W.lIlIllIIlI[99] = -(0xFFFFD7FB & 0x6BA5) & (0xFFFFEFE6 & 0x7FF9);
        W.lIlIllIIlI[100] = 0xB9 ^ 0x80;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (W.lIIlIIlIllIlI(Skills.getLevel((Skill)Skill.FISHING), lIlIllIIlI[74])) {
            bl = lIlIllIIlI[1];
            0;
            if (-1 >= 0) {
                return false;
            }
        } else {
            bl = lIlIllIIlI[0];
        }
        return bl;
    }

    private static String lIIlIIlIlIIIl(String var6, String var19) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var13 = var19.toCharArray();
        int var11 = lIlIllIIlI[0];
        char[] var21 = var6.toCharArray();
        int var14 = var21.length;
        int var10 = lIlIllIIlI[0];
        while (W.lIIlIIlIlIllI(var10, var14)) {
            char var12 = var21[var10];
            var8.append((char)(var12 ^ var13[var11 % var13.length]));
            0;
            ++var11;
            ++var10;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean lIIlIIlIllIII(Object object) {
        return object != null;
    }

    private static boolean lIIlIIlIlIlIl(int n2) {
        return n2 != 0;
    }

    public static void dF() {
        if (W.lIIlIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[38]];
            System.out.println(lIlIllIIII[lIlIllIIlI[39]]);
            Inventory.getAll((int[])kK).stream().forEach(Item::drop);
        }
        if (W.lIIlIIlIlIlll(Inventory.isFull() ? 1 : 0) && W.lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30])) {
            String[] stringArray = new String[lIlIllIIlI[1]];
            stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[40]];
            NPCs.getNearest((String[])stringArray).interact(lIlIllIIII[lIlIllIIlI[41]]);
            Time.sleepTicks((int)lIlIllIIlI[2]);
            0;
        }
    }

    private static void lIIlIIlIlIIll() {
        lIlIllIIII = new String[lIlIllIIlI[100]];
        W.lIlIllIIII[W.lIlIllIIlI[0]] = W."Buying items";
        W.lIlIllIIII[W.lIlIllIIlI[1]] = W."Finished buying items, switching back to fishing";
        W.lIlIllIIII[W.lIlIllIIlI[2]] = W."Navigating to bank";
        W.lIlIllIIII[W.lIlIllIIlI[3]] = W."Opening bank";
        W.lIlIllIIII[W.lIlIllIIlI[5]] = W."Handling banking";
        W.lIlIllIIII[W.lIlIllIIlI[7]] = W."Small fishing net";
        W.lIlIllIIII[W.lIlIllIIlI[9]] = W."Fishing rod";
        W.lIlIllIIII[W.lIlIllIIlI[11]] = W."Fly fishing rod rod";
        W.lIlIllIIII[W.lIlIllIIlI[13]] = W."Feather";
        W.lIlIllIIII[W.lIlIllIIlI[15]] = W."Fishing bait";
        W.lIlIllIIII[W.lIlIllIIlI[16]] = W."We are missing supplies, switching to BUYING";
        W.lIlIllIIII[W.lIlIllIIlI[17]] = W."Small fishing net";
        W.lIlIllIIII[W.lIlIllIIlI[18]] = W."Fishing rod";
        W.lIlIllIIII[W.lIlIllIIlI[19]] = W."Fly fishing rod";
        W.lIlIllIIII[W.lIlIllIIlI[20]] = W."Feather";
        W.lIlIllIIII[W.lIlIllIIlI[22]] = W."Fishing bait";
        W.lIlIllIIII[W.lIlIllIIlI[25]] = W."Dropping logs";
        W.lIlIllIIII[W.lIlIllIIlI[26]] = W."Dropping logs";
        W.lIlIllIIII[W.lIlIllIIlI[28]] = W."Nav to small fish spot";
        W.lIlIllIIII[W.lIlIllIIlI[29]] = W."Wear";
        W.lIlIllIIII[W.lIlIllIIlI[27]] = W."Fishing";
        W.lIlIllIIII[W.lIlIllIIlI[32]] = W."Nav to small fish spot";
        W.lIlIllIIII[W.lIlIllIIlI[33]] = W."Fishing";
        W.lIlIllIIII[W.lIlIllIIlI[34]] = W."Bait";
        W.lIlIllIIII[W.lIlIllIIlI[35]] = W."Nav to fly fish spot";
        W.lIlIllIIII[W.lIlIllIIlI[36]] = W."Fishing";
        W.lIlIllIIII[W.lIlIllIIlI[37]] = W."Lure";
        W.lIlIllIIII[W.lIlIllIIlI[38]] = W."Dropping logs";
        W.lIlIllIIII[W.lIlIllIIlI[39]] = W."Dropping logs";
        W.lIlIllIIII[W.lIlIllIIlI[40]] = W."Fishing spot";
        W.lIlIllIIII[W.lIlIllIIlI[41]] = W."Use-rod";
        W.lIlIllIIII[W.lIlIllIIlI[42]] = W."Buying items";
        W.lIlIllIIII[W.lIlIllIIlI[43]] = W."Finished buying items, switching back to fishing";
        W.lIlIllIIII[W.lIlIllIIlI[44]] = W."Navigating to bank";
        W.lIlIllIIII[W.lIlIllIIlI[45]] = W."Opening bank";
        W.lIlIllIIII[W.lIlIllIIlI[46]] = W."Handling banking";
        W.lIlIllIIII[W.lIlIllIIlI[47]] = W."Small fishing net";
        W.lIlIllIIII[W.lIlIllIIlI[48]] = W."We are missing supplies, switching to BUYING";
        W.lIlIllIIII[W.lIlIllIIlI[49]] = W."Small fishing net";
        W.lIlIllIIII[W.lIlIllIIlI[53]] = W."Nav to bank";
        W.lIlIllIIII[W.lIlIllIIlI[54]] = W."Nav to small fish spot";
        W.lIlIllIIII[W.lIlIllIIlI[55]] = W."Wear";
        W.lIlIllIIII[W.lIlIllIIlI[56]] = W."Fishing";
        W.lIlIllIIII[W.lIlIllIIlI[57]] = W."Small fishing net";
        W.lIlIllIIII[W.lIlIllIIlI[58]] = W."Small fishing net";
        W.lIlIllIIII[W.lIlIllIIlI[59]] = W."Fishing rod";
        W.lIlIllIIII[W.lIlIllIIlI[60]] = W."Fly fishing rod";
        W.lIlIllIIII[W.lIlIllIIlI[61]] = W."Feather";
        W.lIlIllIIII[W.lIlIllIIlI[62]] = W."Fishing bait";
        W.lIlIllIIII[W.lIlIllIIlI[73]] = W."Fishing";
        W.lIlIllIIII[W.lIlIllIIlI[75]] = W."ring of wealth (";
        W.lIlIllIIII[W.lIlIllIIlI[76]] = W."Small fishing net";
        W.lIlIllIIII[W.lIlIllIIlI[78]] = W."Fishing bait";
        W.lIlIllIIII[W.lIlIllIIlI[79]] = W."Feather";
        W.lIlIllIIII[W.lIlIllIIlI[80]] = W."Fly fishing rod";
        W.lIlIllIIII[W.lIlIllIIlI[81]] = W."Fishing rod";
        W.lIlIllIIII[W.lIlIllIIlI[82]] = W."Small fishing net";
    }

    public static void dE() {
        block36: {
            BankLocation var22;
            block37: {
                block44: {
                    block39: {
                        block43: {
                            block42: {
                                block41: {
                                    block40: {
                                        block38: {
                                            if (W.lIIlIIlIlIlIl(bn ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[0]];
                                                b.a(bp);
                                                if (W.lIIlIIlIlIllI(bp.size(), lIlIllIIlI[1])) {
                                                    System.out.println(lIlIllIIII[lIlIllIIlI[1]]);
                                                    bn = lIlIllIIlI[0];
                                                }
                                            }
                                            if (!W.lIIlIIlIlIlll(bn ? 1 : 0)) break block36;
                                            if (!W.lIIlIIlIlIlll(W.al() ? 1 : 0)) break block37;
                                            var22 = BankLocation.getNearest();
                                            if (W.lIIlIIlIllIII(var22) && W.lIIlIIlIlIlll(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[2]];
                                                a.a(var22);
                                            }
                                            if (!W.lIIlIIlIllIII(var22) || !W.lIIlIIlIlIlIl(var22.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block37;
                                            if (W.lIIlIIlIlIlll(Bank.isOpen() ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[3]];
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIllIIlI[4]);
                                                0;
                                            }
                                            if (!W.lIIlIIlIlIlIl(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[5]];
                                            if (W.lIIlIIlIllIIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIlIllIIlI[5]);
                                                0;
                                            }
                                            if (W.lIIlIIlIllIIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIlIllIIlI[2]);
                                                0;
                                            }
                                            int[] nArray = new int[lIlIllIIlI[1]];
                                            nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[6];
                                            if (!W.lIIlIIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                            String[] stringArray = new String[lIlIllIIlI[1]];
                                            stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[7]];
                                            if (!W.lIIlIIlIllIlI(Inventory.getCount((String[])stringArray), lIlIllIIlI[1])) break block39;
                                        }
                                        int[] nArray = new int[lIlIllIIlI[1]];
                                        nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[8];
                                        if (!W.lIIlIIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                        String[] stringArray = new String[lIlIllIIlI[1]];
                                        stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[9]];
                                        if (!W.lIIlIIlIllIlI(Inventory.getCount((String[])stringArray), lIlIllIIlI[1])) break block39;
                                    }
                                    int[] nArray = new int[lIlIllIIlI[1]];
                                    nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[10];
                                    if (!W.lIIlIIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                    String[] stringArray = new String[lIlIllIIlI[1]];
                                    stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[11]];
                                    if (!W.lIIlIIlIllIlI(Inventory.getCount((String[])stringArray), lIlIllIIlI[1])) break block39;
                                }
                                int[] nArray = new int[lIlIllIIlI[1]];
                                nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[12];
                                if (!W.lIIlIIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                String[] stringArray = new String[lIlIllIIlI[1]];
                                stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[13]];
                                if (!W.lIIlIIlIllIlI(Inventory.getCount((String[])stringArray), lIlIllIIlI[1])) break block39;
                            }
                            int[] nArray = new int[lIlIllIIlI[1]];
                            nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[14];
                            if (!W.lIIlIIlIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                            String[] stringArray = new String[lIlIllIIlI[1]];
                            stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[15]];
                            if (!W.lIIlIIlIllIlI(Inventory.getCount((String[])stringArray), lIlIllIIlI[1])) break block39;
                        }
                        if ((!W.lIIlIIlIlIlll(Bank.contains((int[])f.aN) ? 1 : 0) || W.lIIlIIlIllIlI(Inventory.getCount((int[])f.aN), lIlIllIIlI[1])) && !W.lIIlIIlIlIlIl(Equipment.contains((int[])f.aN) ? 1 : 0)) break block44;
                    }
                    W.O();
                    System.out.println(lIlIllIIII[lIlIllIIlI[16]]);
                    bn = lIlIllIIlI[1];
                    return;
                }
                int[] nArray = new int[lIlIllIIlI[1]];
                nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[6];
                if (W.lIIlIIlIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)lIlIllIIII[lIlIllIIlI[17]], (int)lIlIllIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIllIIlI[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIlIllIIlI[1]];
                        stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[82]];
                        if (W.lIIlIIlIllIIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIlIllIIlI[1];
                            0;
                            if (2 <= 1) {
                                return false;
                            }
                        } else {
                            bl = lIlIllIIlI[0];
                        }
                        return bl;
                    }, (int)lIlIllIIlI[4]);
                    0;
                }
                int[] nArray2 = new int[lIlIllIIlI[1]];
                nArray2[W.lIlIllIIlI[0]] = lIlIllIIlI[8];
                if (W.lIIlIIlIlIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)lIlIllIIII[lIlIllIIlI[18]], (int)lIlIllIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIllIIlI[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIlIllIIlI[1]];
                        stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[81]];
                        if (W.lIIlIIlIllIIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIlIllIIlI[1];
                            0;
                            if (-1 >= 0) {
                                return false;
                            }
                        } else {
                            bl = lIlIllIIlI[0];
                        }
                        return bl;
                    }, (int)lIlIllIIlI[4]);
                    0;
                }
                int[] nArray3 = new int[lIlIllIIlI[1]];
                nArray3[W.lIlIllIIlI[0]] = lIlIllIIlI[10];
                if (W.lIIlIIlIlIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)lIlIllIIII[lIlIllIIlI[19]], (int)lIlIllIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIllIIlI[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIlIllIIlI[1]];
                        stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[80]];
                        if (W.lIIlIIlIllIIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIlIllIIlI[1];
                            0;
                            if (-1 == 2) {
                                return false;
                            }
                        } else {
                            bl = lIlIllIIlI[0];
                        }
                        return bl;
                    }, (int)lIlIllIIlI[4]);
                    0;
                }
                int[] nArray4 = new int[lIlIllIIlI[1]];
                nArray4[W.lIlIllIIlI[0]] = lIlIllIIlI[12];
                if (W.lIIlIIlIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)lIlIllIIII[lIlIllIIlI[20]], (int)lIlIllIIlI[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIllIIlI[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIlIllIIlI[1]];
                        stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[79]];
                        if (W.lIIlIIlIllIIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIlIllIIlI[1];
                            0;
                            if (-1 != -1) {
                                return false;
                            }
                        } else {
                            bl = lIlIllIIlI[0];
                        }
                        return bl;
                    }, (int)lIlIllIIlI[4]);
                    0;
                }
                int[] nArray5 = new int[lIlIllIIlI[1]];
                nArray5[W.lIlIllIIlI[0]] = lIlIllIIlI[14];
                if (W.lIIlIIlIlIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)lIlIllIIII[lIlIllIIlI[22]], (int)lIlIllIIlI[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIlIllIIlI[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIlIllIIlI[1]];
                        stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[78]];
                        if (W.lIIlIIlIllIIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIlIllIIlI[1];
                            0;
                            if ((0x7B ^ 0x7F) == 1) {
                                return false;
                            }
                        } else {
                            bl = lIlIllIIlI[0];
                        }
                        return bl;
                    }, (int)lIlIllIIlI[4]);
                    0;
                }
                if (W.lIIlIIlIlIlIl(Bank.contains((int[])f.aN) ? 1 : 0)) {
                    a.b(f.aN, lIlIllIIlI[1]);
                }
                int[] nArray6 = new int[lIlIllIIlI[1]];
                nArray6[W.lIlIllIIlI[0]] = lIlIllIIlI[24];
                if (W.lIIlIIlIlIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    a.a(lIlIllIIlI[24], lIlIllIIlI[1]);
                }
            }
            if (W.lIIlIIlIlIlIl(W.al() ? 1 : 0)) {
                if (W.lIIlIIlIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (W.lIIlIIlIlIlIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[25]];
                    System.out.println(lIlIllIIII[lIlIllIIlI[26]]);
                    Inventory.getAll((int[])kK).stream().forEach(Item::drop);
                }
                if (W.lIIlIIlIlIlll(Inventory.isFull() ? 1 : 0)) {
                    if (W.lIIlIIlIlIllI(Skills.getLevel((Skill)Skill.FISHING), lIlIllIIlI[27])) {
                        if (W.lIIlIIlIlIllI(Skills.getLevel((Skill)Skill.FISHING), lIlIllIIlI[7])) {
                            if (W.lIIlIIlIlIlll(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.lIIlIIlIllIll(Players.getLocal().getWorldLocation().distanceTo(kI), lIlIllIIlI[7])) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[28]];
                                if (W.lIIlIIlIlIlIl(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                                    Inventory.getFirst((int[])f.aN).interact(lIlIllIIII[lIlIllIIlI[29]]);
                                }
                                Movement.walkTo((WorldPoint)kI);
                                0;
                                Time.sleepTicks((int)lIlIllIIlI[1]);
                                0;
                            }
                            if (W.lIIlIIlIlIlIl(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[27]];
                                if (W.lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30])) {
                                    int[] nArray = new int[lIlIllIIlI[1]];
                                    nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[31];
                                    var22 = NPCs.getNearest((int[])nArray);
                                    if (W.lIIlIIlIllIII(var22) && W.lIIlIIlIlIlIl(kH.contains((Locatable)var22) ? 1 : 0)) {
                                        int[] nArray7 = new int[lIlIllIIlI[1]];
                                        nArray7[W.lIlIllIIlI[0]] = lIlIllIIlI[31];
                                        NPCs.getNearest((int[])nArray7).interact(lIlIllIIlI[0]);
                                        Time.sleepTicks((int)lIlIllIIlI[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        if (W.lIIlIIlIllIlI(Skills.getLevel((Skill)Skill.FISHING), lIlIllIIlI[7]) && W.lIIlIIlIlIllI(Skills.getLevel((Skill)Skill.FISHING), lIlIllIIlI[27])) {
                            if (W.lIIlIIlIlIlll(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[32]];
                                Movement.walkTo((WorldPoint)kI);
                                0;
                                Time.sleepTicks((int)lIlIllIIlI[1]);
                                0;
                            }
                            if (W.lIIlIIlIlIlIl(kH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[33]];
                                if (W.lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30])) {
                                    int[] nArray = new int[lIlIllIIlI[1]];
                                    nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[31];
                                    var22 = NPCs.getNearest((int[])nArray);
                                    if (W.lIIlIIlIllIII(var22) && W.lIIlIIlIlIlIl(kH.contains((Locatable)var22) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIlIllIIlI[1]];
                                        nArray8[W.lIlIllIIlI[0]] = lIlIllIIlI[31];
                                        NPCs.getNearest((int[])nArray8).interact(lIlIllIIII[lIlIllIIlI[34]]);
                                        Time.sleepTicks((int)lIlIllIIlI[2]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (W.lIIlIIlIllIlI(Skills.getLevel((Skill)Skill.FISHING), lIlIllIIlI[27])) {
                        if (W.lIIlIIlIllIll(Players.getLocal().getWorldLocation().distanceTo(kJ), lIlIllIIlI[22])) {
                            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[35]];
                            Movement.walkTo((WorldPoint)kJ);
                            0;
                            Time.sleepTicks((int)lIlIllIIlI[1]);
                            0;
                        }
                        if (W.lIIlIIlIlllIl(Players.getLocal().getWorldLocation().distanceTo(kJ), lIlIllIIlI[22])) {
                            AccBuilderShamans.c = lIlIllIIII[lIlIllIIlI[36]];
                            if (W.lIIlIIlIlllII(Players.getLocal().getAnimation(), lIlIllIIlI[30]) && W.lIIlIIlIllIII(NPCs.getNearest(nPC -> {
                                int n2;
                                if (W.lIIlIIlIlllII(nPC.getId(), lIlIllIIlI[77]) && W.lIIlIIlIlllIl(nPC.getWorldLocation().distanceTo(kJ), lIlIllIIlI[22])) {
                                    n2 = lIlIllIIlI[1];
                                    0;
                                    if ((0xF7 ^ 0x97 ^ (0x60 ^ 4)) <= 0) {
                                        return ((0xB2 ^ 0x8F ^ (0x37 ^ 0x15)) & (0x3D ^ 0x63 ^ (0x77 ^ 0x36) ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lIlIllIIlI[0];
                                }
                                return n2 != 0;
                            }))) {
                                NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (W.lIIlIIlIlllII(nPC.getId(), lIlIllIIlI[77]) && W.lIIlIIlIlllIl(nPC.getWorldLocation().distanceTo(kJ), lIlIllIIlI[22])) {
                                        n2 = lIlIllIIlI[1];
                                        0;
                                        if (-3 > 0) {
                                            return false;
                                        }
                                    } else {
                                        n2 = lIlIllIIlI[0];
                                    }
                                    return n2 != 0;
                                }).interact(lIlIllIIII[lIlIllIIlI[37]]);
                                Time.sleepTicks((int)lIlIllIIlI[2]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIlIIlIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    public static boolean dH() {
        int n2;
        String[] stringArray = new String[lIlIllIIlI[1]];
        stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[57]];
        if (W.lIIlIIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0) && (!W.lIIlIIlIlIlll(Inventory.contains((int[])f.aN) ? 1 : 0) || W.lIIlIIlIlIlIl(Equipment.contains((int[])f.aN) ? 1 : 0))) {
            n2 = lIlIllIIlI[1];
            0;
            if (((0x4C ^ 0x2D ^ (0xD8 ^ 0x9F)) & (135 + 18 - 42 + 28 ^ 35 + 25 - -34 + 79 ^ -1)) >= 3) {
                return ((175 + 187 - 317 + 203 ^ 162 + 69 - 127 + 88) & (0x3F ^ 0x71 ^ (0x42 ^ 0x34) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIllIIlI[0];
        }
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean al() {
        int n2;
        String[] stringArray = new String[lIlIllIIlI[1]];
        stringArray[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[58]];
        if (W.lIIlIIlIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIllIIlI[1]];
            stringArray2[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[59]];
            if (W.lIIlIIlIlIlIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIlIllIIlI[1]];
                stringArray3[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[60]];
                if (W.lIIlIIlIlIlIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIlIllIIlI[1]];
                    stringArray4[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[61]];
                    if (W.lIIlIIlIlIlIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIlIllIIlI[1]];
                        stringArray5[W.lIlIllIIlI[0]] = lIlIllIIII[lIlIllIIlI[62]];
                        if (W.lIIlIIlIlIlIl(Inventory.contains((String[])stringArray5) ? 1 : 0) && (!W.lIIlIIlIlIlll(Inventory.contains((int[])f.aN) ? 1 : 0) || W.lIIlIIlIlIlIl(Equipment.contains((int[])f.aN) ? 1 : 0))) {
                            n2 = lIlIllIIlI[1];
                            0;
                            if ((0xC8 ^ 0x82 ^ (0x69 ^ 0x27)) >= 0) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lIlIllIIlI[0];
        return n2 != 0;
    }

    private static boolean lIIlIIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        W.lIIlIIlIlIlII();
        W.lIIlIIlIlIIll();
        kH = new WorldArea(lIlIllIIlI[83], lIlIllIIlI[84], lIlIllIIlI[29], lIlIllIIlI[39], lIlIllIIlI[0]);
        bp = new ArrayList<d>();
        kI = new WorldPoint(lIlIllIIlI[85], lIlIllIIlI[86], lIlIllIIlI[0]);
        kJ = new WorldPoint(lIlIllIIlI[87], lIlIllIIlI[88], lIlIllIIlI[0]);
        int[] nArray = new int[lIlIllIIlI[17]];
        nArray[W.lIlIllIIlI[0]] = lIlIllIIlI[89];
        nArray[W.lIlIllIIlI[1]] = lIlIllIIlI[90];
        nArray[W.lIlIllIIlI[2]] = lIlIllIIlI[91];
        nArray[W.lIlIllIIlI[3]] = lIlIllIIlI[92];
        nArray[W.lIlIllIIlI[5]] = lIlIllIIlI[93];
        nArray[W.lIlIllIIlI[7]] = lIlIllIIlI[94];
        nArray[W.lIlIllIIlI[9]] = lIlIllIIlI[95];
        nArray[W.lIlIllIIlI[11]] = lIlIllIIlI[96];
        nArray[W.lIlIllIIlI[13]] = lIlIllIIlI[97];
        nArray[W.lIlIllIIlI[15]] = lIlIllIIlI[98];
        nArray[W.lIlIllIIlI[16]] = lIlIllIIlI[99];
        kK = nArray;
    }

    private static String lIIlIIlIlIIlI(String var23, String var15) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIlIllIIlI[2], var16);
            return new String(var17.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ac() {
        return lIlIllIIlI[0];
    }

    private static boolean lIIlIIlIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIIlIlIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public String ae() {
        return lIlIllIIII[lIlIllIIlI[73]];
    }

    private static boolean lIIlIIlIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIlIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlIIlIIllIl(String var2, String var4) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIlIllIIlI[13]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlIllIIlI[2], var18);
            return new String(var7.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }
}

