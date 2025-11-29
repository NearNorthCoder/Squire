/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class v
implements M {
    static /* synthetic */ int bY;
    private static final /* synthetic */ int fI;
    private static final /* synthetic */ WorldPoint fJ;
    static /* synthetic */ int co;
    private static /* synthetic */ int[] lIIIlllIllllI;
    static /* synthetic */ boolean cp;
    private static final /* synthetic */ int fH;
    private static final /* synthetic */ int fG;
    private static final /* synthetic */ String[] fK;
    private static /* synthetic */ String[] lIIIlllIlllIl;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ List<d> bA;

    public static void bl() {
        block22: {
            BankLocation var23;
            block23: {
                block27: {
                    block25: {
                        block26: {
                            block24: {
                                if (v.lIlIIlIlIIIIlll(by ? 1 : 0)) {
                                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[0]];
                                    b.a(bA);
                                    if (v.lIlIIlIlIIIlIII(bA.size(), lIIIlllIllllI[1])) {
                                        System.out.println(lIIIlllIlllIl[lIIIlllIllllI[1]]);
                                        by = lIIIlllIllllI[0];
                                    }
                                }
                                if (!v.lIlIIlIlIIIlIIl(by ? 1 : 0)) break block22;
                                if (v.lIlIIlIlIIIIlll(Inventory.contains((int[])f.ba) ? 1 : 0) && v.lIlIIlIlIIIlIII(Movement.getRunEnergy(), lIIIlllIllllI[2])) {
                                    Inventory.getFirst((int[])f.ba).interact(lIIIlllIlllIl[lIIIlllIllllI[3]]);
                                    Time.sleepTicks((int)lIIIlllIllllI[1]);
                                    0;
                                }
                                if (v.lIlIIlIlIIIlIIl(Movement.isRunEnabled() ? 1 : 0) && v.lIlIIlIlIIIlIlI(Movement.getRunEnergy())) {
                                    Movement.toggleRun();
                                }
                                if (!v.lIlIIlIlIIIlIIl(v.S() ? 1 : 0) || !v.lIlIIlIlIIIlIII(e.j(lIIIlllIllllI[4]), lIIIlllIllllI[1])) break block23;
                                var23 = BankLocation.getNearest();
                                if (v.lIlIIlIlIIIlIll(var23) && v.lIlIIlIlIIIlIIl(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[5]];
                                    a.a(var23);
                                    Time.sleepTicks((int)lIIIlllIllllI[3]);
                                    0;
                                }
                                if (!v.lIlIIlIlIIIlIll(var23) || !v.lIlIIlIlIIIIlll(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block23;
                                AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[6]];
                                if (v.lIlIIlIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIllllI[7]);
                                    0;
                                }
                                if (!v.lIlIIlIlIIIIlll(Bank.isOpen() ? 1 : 0)) break block23;
                                if (v.lIlIIlIlIIIlIlI(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)lIIIlllIllllI[6]);
                                    0;
                                }
                                if (v.lIlIIlIlIIIlIlI(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)lIIIlllIllllI[3]);
                                    0;
                                }
                                int[] nArray = new int[lIIIlllIllllI[1]];
                                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                int[] nArray2 = new int[lIIIlllIllllI[1]];
                                nArray2[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIllII(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIllllI[9])) break block25;
                            }
                            int[] nArray = new int[lIIIlllIllllI[1]];
                            nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                            if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray3 = new int[lIIIlllIllllI[1]];
                            nArray3[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                            if (!v.lIlIIlIlIIIllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIllllI[3])) break block25;
                        }
                        int[] nArray = new int[lIIIlllIllllI[1]];
                        nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                        if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block27;
                        int[] nArray4 = new int[lIIIlllIllllI[1]];
                        nArray4[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                        if (!v.lIlIIlIlIIIlIII(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIllllI[6])) break block27;
                    }
                    v.W();
                    System.out.println(lIIIlllIlllIl[lIIIlllIllllI[12]]);
                    by = lIIIlllIllllI[1];
                    return;
                }
                int[] nArray = new int[lIIIlllIllllI[6]];
                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                nArray[v.lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                nArray[v.lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                nArray[v.lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (v.lIlIIlIlIIIlIIl(e.b(nArray) ? 1 : 0)) {
                    v.W();
                    System.out.println(lIIIlllIlllIl[lIIIlllIllllI[9]]);
                    by = lIIIlllIllllI[1];
                    return;
                }
                int[] nArray5 = new int[lIIIlllIllllI[6]];
                nArray5[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                nArray5[v.lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                nArray5[v.lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                nArray5[v.lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (v.lIlIIlIlIIIIlll(e.b(nArray5) ? 1 : 0)) {
                    a.a(lIIIlllIllllI[11], lIIIlllIllllI[6]);
                    a.a(lIIIlllIllllI[10], lIIIlllIllllI[3]);
                    a.a(lIIIlllIllllI[8], lIIIlllIllllI[9]);
                    a.a(lIIIlllIllllI[13], lIIIlllIllllI[1]);
                }
                if (v.lIlIIlIlIIIIlll(AccBuilderRat.e ? 1 : 0)) {
                    a.b(f.bk, lIIIlllIllllI[1]);
                }
            }
            if (v.lIlIIlIlIIIlIIl(v.S() ? 1 : 0) && v.lIlIIlIlIIIlIlI(e.j(lIIIlllIllllI[4])) && v.lIlIIlIlIIIllIl(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[12])) {
                v.bm();
            }
            if ((!v.lIlIIlIlIIIlIIl(v.S() ? 1 : 0) || v.lIlIIlIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[12])) && v.lIlIIlIlIIIlIII(e.j(lIIIlllIllllI[4]), lIIIlllIllllI[14])) {
                if (v.lIlIIlIlIIIllIl(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[6])) {
                    co = lIIIlllIllllI[0];
                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[15]];
                    if (v.lIlIIlIlIIIlIII(bY, lIIIlllIllllI[1])) {
                        e.w();
                        bY += lIIIlllIllllI[1];
                    }
                    Movement.walkTo((WorldPoint)fJ);
                    0;
                }
                if (v.lIlIIlIlIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fJ), lIIIlllIllllI[9])) {
                    AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[16]];
                    String[] stringArray = new String[lIIIlllIllllI[1]];
                    stringArray[v.lIIIlllIllllI[0]] = lIIIlllIlllIl[lIIIlllIllllI[17]];
                    var23 = TileObjects.getNearest((String[])stringArray);
                    if (v.lIlIIlIlIIIlIll(var23)) {
                        String[] stringArray2 = new String[lIIIlllIllllI[1]];
                        stringArray2[v.lIIIlllIllllI[0]] = lIIIlllIlllIl[lIIIlllIllllI[18]];
                        if (v.lIlIIlIlIIIIlll(var23.hasAction(stringArray2) ? 1 : 0)) {
                            var23.interact(lIIIlllIlllIl[lIIIlllIllllI[19]]);
                            Time.sleepTicks((int)lIIIlllIllllI[5]);
                            0;
                        }
                    }
                    if (v.lIlIIlIlIIIlIII(co, lIIIlllIllllI[1])) {
                        P.lA += lIIIlllIllllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllIllllI[1];
                        P.lA = lIIIlllIllllI[0];
                        cp = lIIIlllIllllI[0];
                    }
                    g.a(lIIIlllIlllIl[lIIIlllIllllI[20]], fK);
                }
            }
            g.a(new String[lIIIlllIllllI[0]]);
        }
        System.out.println("Setting: " + e.j(lIIIlllIllllI[4]));
    }

    private static void lIlIIlIlIIIIllI() {
        lIIIlllIllllI = new int[39];
        v.lIIIlllIllllI[0] = (31 + 19 - -171 + 23 ^ 155 + 76 - 129 + 70) & (0x90 ^ 0x84 ^ (0x27 ^ 0x6B) ^ -1);
        v.lIIIlllIllllI[1] = 1;
        v.lIIIlllIllllI[2] = 0x82 ^ 0xA2 ^ (0xA0 ^ 0xB2);
        v.lIIIlllIllllI[3] = 2;
        v.lIIIlllIllllI[4] = 0x2A ^ 0x35;
        v.lIIIlllIllllI[5] = 3;
        v.lIIIlllIllllI[6] = 0x9A ^ 0x9E;
        v.lIIIlllIllllI[7] = 0xFFFF93D9 & 0x7FAE;
        v.lIIIlllIllllI[8] = -(0xFFFF9C77 & 0x7F8A) & (0xFFFFDDB7 & 0x3FFB);
        v.lIIIlllIllllI[9] = 0x66 ^ 0x60;
        v.lIIIlllIllllI[10] = 0xFFFFCDFC & 0x33BB;
        v.lIIIlllIllllI[11] = -(0xFFFFEDFD & 0x764B) & (0xFFFFE5FF & 0x7FFC);
        v.lIIIlllIllllI[12] = 0xC6 ^ 0xC3;
        v.lIIIlllIllllI[13] = -(0xFFFFD0AD & 0x6F57) & (0xFFFFDF7F & 0x7FCD);
        v.lIIIlllIllllI[14] = 0xF0 ^ 0xB6 ^ (0xAB ^ 0x89);
        v.lIIIlllIllllI[15] = 118 + 34 - 123 + 110 ^ 136 + 19 - 122 + 107;
        v.lIIIlllIllllI[16] = 0x3F ^ 0x67 ^ (0xE5 ^ 0xB5);
        v.lIIIlllIllllI[17] = 0xAC ^ 0xA5;
        v.lIIIlllIllllI[18] = 0xC7 ^ 0x8E ^ (0xC1 ^ 0x82);
        v.lIIIlllIllllI[19] = 0x57 ^ 0x17 ^ (0x78 ^ 0x33);
        v.lIIIlllIllllI[20] = 0x49 ^ 0x5A ^ (0x78 ^ 0x67);
        v.lIIIlllIllllI[21] = 0x21 ^ 0x2C;
        v.lIIIlllIllllI[22] = 0x5F ^ 0x51;
        v.lIIIlllIllllI[23] = 0x23 ^ 0x31 ^ (0xAD ^ 0xB0);
        v.lIIIlllIllllI[24] = 0xFFFFB1F4 & 0x4FFF;
        v.lIIIlllIllllI[25] = 0xFFFFFECF & 0x2FFC;
        v.lIIIlllIllllI[26] = -(0xFFFFF63F & 0xFD3) & (0xFFFFEFFE & 0x77BB);
        v.lIIIlllIllllI[27] = -(0xFFFFF73B & 0x28CD) & (0xFFFFBF7F & 0x7FCF);
        v.lIIIlllIllllI[28] = 0x4D ^ 0x65;
        v.lIIIlllIllllI[29] = -(0xFFFFEB75 & 0x7EAE) & (0xFFFFEFFF & Short.MAX_VALUE);
        v.lIIIlllIllllI[30] = 8 ^ 0x18;
        v.lIIIlllIllllI[31] = 0x27 ^ 0x36;
        v.lIIIlllIllllI[32] = -(0xFFFFC64B & 0x7DFD) & (0xFFFFFFCF & 0x4FFF);
        v.lIIIlllIllllI[33] = -(0xFFFFFADF & 0x37A1) & (0xFFFFFFFF & 0x3FFB);
        v.lIIIlllIllllI[34] = 0x7B ^ 0x69;
        v.lIIIlllIllllI[35] = 0xDA ^ 0x81 ^ (0xCD ^ 0x85);
        v.lIIIlllIllllI[36] = 0xE6 ^ 0xA1 ^ (0x6F ^ 0x3C);
        v.lIIIlllIllllI[37] = 0x4E ^ 0x42 ^ (0x45 ^ 0x5C);
        v.lIIIlllIllllI[38] = 0xAF ^ 0xB9;
    }

    private static void W() {
        d var3;
        Object var10;
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                int[] nArray = new int[lIIIlllIllllI[1]];
                                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block12;
                                int[] nArray2 = new int[lIIIlllIllllI[1]];
                                nArray2[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray2) ? 1 : 0)) break block13;
                                int[] nArray3 = new int[lIIIlllIllllI[1]];
                                nArray3[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
                                if (!v.lIlIIlIlIIIlIII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIllllI[9])) break block13;
                            }
                            var10 = new d(lIIIlllIllllI[8], lIIIlllIllllI[9], lIIIlllIllllI[24]);
                            bA.add((d)var10);
                            0;
                        }
                        int[] nArray = new int[lIIIlllIllllI[1]];
                        nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                        if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block14;
                        int[] nArray4 = new int[lIIIlllIllllI[1]];
                        nArray4[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                        if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray4) ? 1 : 0)) break block15;
                        int[] nArray5 = new int[lIIIlllIllllI[1]];
                        nArray5[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
                        if (!v.lIlIIlIlIIIlIII(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlllIllllI[3])) break block15;
                    }
                    var10 = new d(lIIIlllIllllI[10], lIIIlllIllllI[3], lIIIlllIllllI[24]);
                    bA.add((d)var10);
                    0;
                }
                int[] nArray = new int[lIIIlllIllllI[1]];
                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                int[] nArray6 = new int[lIIIlllIllllI[1]];
                nArray6[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (!v.lIlIIlIlIIIIlll(Bank.contains((int[])nArray6) ? 1 : 0)) break block17;
                int[] nArray7 = new int[lIIIlllIllllI[1]];
                nArray7[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (!v.lIlIIlIlIIIlIII(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlllIllllI[6])) break block17;
            }
            var10 = new d(lIIIlllIllllI[11], lIIIlllIllllI[6], lIIIlllIllllI[24]);
            bA.add((d)var10);
            0;
        }
        int[] nArray = new int[lIIIlllIllllI[1]];
        nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[13];
        if (v.lIlIIlIlIIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var10 = new d(lIIIlllIllllI[13], lIIIlllIllllI[12], lIIIlllIllllI[7]);
            bA.add((d)var10);
            0;
        }
        if (v.lIlIIlIlIIIlIIl(Bank.contains((Predicate)(var10 = item -> item.getName().toLowerCase().contains(lIIIlllIlllIl[lIIIlllIllllI[31]]))) ? 1 : 0)) {
            var3 = new d(lIIIlllIllllI[25], lIIIlllIllllI[12], lIIIlllIllllI[26]);
            bA.add(var3);
            0;
        }
        int[] nArray8 = new int[lIIIlllIllllI[1]];
        nArray8[v.lIIIlllIllllI[0]] = lIIIlllIllllI[27];
        if (v.lIlIIlIlIIIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var3 = new d(lIIIlllIllllI[27], lIIIlllIllllI[28], lIIIlllIllllI[29]);
            bA.add(var3);
            0;
        }
    }

    private static void lIlIIlIlIIIIlIl() {
        lIIIlllIlllIl = new String[lIIIlllIllllI[38]];
        v.lIIIlllIlllIl[v.lIIIlllIllllI[0]] = v."Buying items";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[1]] = v."Finished buying items, switching back to quest";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[3]] = v."Drink";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[5]] = v."Nav to bank";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[6]] = v."Handling banking";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[12]] = v."We are missing quest supplies, switching to BUYING";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[9]] = v."We are missing quest supplies, switching to BUYING";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[15]] = v."Nav to start";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[16]] = v."Handle dialog";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[17]] = v."Door";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[18]] = v."Open";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[19]] = v."Open";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[20]] = v."Doric";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[21]] = v."Nav to bank";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[22]] = v."Handling banking";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[23]] = v."We are missing quest supplies, switching to BUYING";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[30]] = v."Dorics quest";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[31]] = v."ring of wealth (";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[34]] = v."I wanted to use your anvils.";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[35]] = v."Yes, I will get you the materials.";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[36]] = v."Certainly, I'll be right back!";
        v.lIIIlllIlllIl[v.lIIIlllIllllI[37]] = v."Yes.";
    }

    private static String lIlIIlIlIIIIIll(String var4, String var12) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var1 = var12.toCharArray();
        int var8 = lIIIlllIllllI[0];
        char[] var19 = var4.toCharArray();
        int var20 = var19.length;
        int var15 = lIIIlllIllllI[0];
        while (v.lIlIIlIlIIIlIII(var15, var20)) {
            char var9 = var19[var15];
            var22.append((char)(var9 ^ var1[var8 % var1.length]));
            0;
            ++var8;
            ++var15;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (v.lIlIIlIlIIIllII(e.j(lIIIlllIllllI[4]), lIIIlllIllllI[14])) {
            bl = lIIIlllIllllI[1];
            0;
            if (3 > 3) {
                return ((0xCC ^ 0xC4 ^ (0x5C ^ 0x66)) & (133 + 87 - 171 + 142 ^ 111 + 132 - 212 + 110 ^ -1)) != 0;
            }
        } else {
            bl = lIIIlllIllllI[0];
        }
        return bl;
    }

    private static boolean lIlIIlIlIIIlIlI(int n2) {
        return n2 > 0;
    }

    static {
        v.lIlIIlIlIIIIllI();
        v.lIlIIlIlIIIIlIl();
        fG = lIIIlllIllllI[8];
        fH = lIIIlllIllllI[10];
        fI = lIIIlllIllllI[11];
        fJ = new WorldPoint(lIIIlllIllllI[32], lIIIlllIllllI[33], lIIIlllIllllI[0]);
        String[] stringArray = new String[lIIIlllIllllI[6]];
        stringArray[v.lIIIlllIllllI[0]] = lIIIlllIlllIl[lIIIlllIllllI[34]];
        stringArray[v.lIIIlllIllllI[1]] = lIIIlllIlllIl[lIIIlllIllllI[35]];
        stringArray[v.lIIIlllIllllI[3]] = lIIIlllIlllIl[lIIIlllIllllI[36]];
        stringArray[v.lIIIlllIllllI[5]] = lIIIlllIlllIl[lIIIlllIllllI[37]];
        fK = stringArray;
        bA = new ArrayList<d>();
        bY = lIIIlllIllllI[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
        int n2;
        int[] nArray = new int[lIIIlllIllllI[1]];
        nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[8];
        if (v.lIlIIlIlIIIllII(Inventory.getCount((int[])nArray), lIIIlllIllllI[9])) {
            int[] nArray2 = new int[lIIIlllIllllI[1]];
            nArray2[v.lIIIlllIllllI[0]] = lIIIlllIllllI[10];
            if (v.lIlIIlIlIIIllII(Inventory.getCount((int[])nArray2), lIIIlllIllllI[3])) {
                int[] nArray3 = new int[lIIIlllIllllI[1]];
                nArray3[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                if (v.lIlIIlIlIIIllII(Inventory.getCount((int[])nArray3), lIIIlllIllllI[6])) {
                    n2 = lIIIlllIllllI[1];
                    0;
                    if (((0x39 ^ 0x70) & ~(0xD2 ^ 0x9B)) == 0) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = lIIIlllIllllI[0];
        return n2 != 0;
    }

    private static boolean lIlIIlIlIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIlIIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIlIIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean X() {
        return lIIIlllIllllI[0];
    }

    private static boolean lIlIIlIlIIIlIIl(int n2) {
        return n2 == 0;
    }

    private static String lIlIIlIlIIIIIlI(String var6, String var13) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIIIlllIllllI[16]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIIIlllIllllI[3], var18);
            return new String(var14.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIlIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public int Y() {
        try {
            v.bl();
            0;
        }
        catch (Exception var11) {
            var11.printStackTrace();
        }
        if (2 >= 3) {
            return (0x23 ^ 0x75) & ~(0xCA ^ 0x9C);
        }
        return lIIIlllIllllI[18];
    }

    private static String lIlIIlIlIIIIlII(String var17, String var21) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIIIlllIllllI[3], var5);
            return new String(var2.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void var7;
        BankLocation bankLocation = BankLocation.getNearest();
        if (v.lIlIIlIlIIIlIll(bankLocation) && v.lIlIIlIlIIIlIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[21]];
            a.a(bankLocation);
            Time.sleepTicks((int)lIIIlllIllllI[3]);
            0;
        }
        if (v.lIlIIlIlIIIlIll(var7) && v.lIlIIlIlIIIIlll(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlllIl[lIIIlllIllllI[22]];
            if (v.lIlIIlIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIllllI[7]);
                0;
            }
            if (v.lIlIIlIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                if (v.lIlIIlIlIIIlIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIlllIllllI[6]);
                    0;
                }
                if (v.lIlIIlIlIIIlIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIlllIllllI[3]);
                    0;
                }
                int[] nArray = new int[lIIIlllIllllI[6]];
                nArray[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                nArray[v.lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                nArray[v.lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                nArray[v.lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (v.lIlIIlIlIIIlIIl(e.b(nArray) ? 1 : 0)) {
                    v.W();
                    System.out.println(lIIIlllIlllIl[lIIIlllIllllI[23]]);
                    by = lIIIlllIllllI[1];
                    return;
                }
                int[] nArray2 = new int[lIIIlllIllllI[6]];
                nArray2[v.lIIIlllIllllI[0]] = lIIIlllIllllI[11];
                nArray2[v.lIIIlllIllllI[1]] = lIIIlllIllllI[10];
                nArray2[v.lIIIlllIllllI[3]] = lIIIlllIllllI[8];
                nArray2[v.lIIIlllIllllI[5]] = lIIIlllIllllI[13];
                if (v.lIlIIlIlIIIIlll(e.b(nArray2) ? 1 : 0)) {
                    a.a(lIIIlllIllllI[11], lIIIlllIllllI[6]);
                    a.a(lIIIlllIllllI[10], lIIIlllIllllI[3]);
                    a.a(lIIIlllIllllI[8], lIIIlllIllllI[9]);
                    a.a(lIIIlllIllllI[13], lIIIlllIllllI[1]);
                }
                a.b(f.bk, lIIIlllIllllI[1]);
            }
        }
    }

    @Override
    public String Z() {
        return lIIIlllIlllIl[lIIIlllIllllI[30]];
    }
}

