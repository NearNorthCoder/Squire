/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class RHelper
implements M {
    static  int fn;
    public static  List<d> bA;
    public static  boolean by;
    static  WorldPoint fd;
    static  boolean cp;
    
    static  WorldPoint fo;
    static  int co;
    static  String[] bW;

    private static boolean lIlIIlllIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void W() {
        block19: {
            d var1;
            block18: {
                Object var2;
                block17: {
                    block16: {
                        block15: {
                            block14: {
                                int[] nArray = new int[lIIlIIIIIlIll[0]];
                                nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[11];
                                if (r.lIlIIlllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new DHelper(lIIlIIIIIlIll[11], lIIlIIIIIlIll[0], lIIlIIIIIlIll[134]);
                                    bA.add(d2);

                                }
                                int[] nArray2 = new int[lIIlIIIIIlIll[0]];
                                nArray2[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[10];
                                if (r.lIlIIlllIlIllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    var2 = new DHelper(lIIlIIIIIlIll[10], lIIlIIIIIlIll[0], lIIlIIIIIlIll[134]);
                                    bA.add((DHelper) ar2);

                                }
                                int[] nArray3 = new int[lIIlIIIIIlIll[0]];
                                nArray3[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[12];
                                if (r.lIlIIlllIlIllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    var2 = new DHelper(lIIlIIIIIlIll[12], lIIlIIIIIlIll[0], lIIlIIIIIlIll[134]);
                                    bA.add((DHelper) ar2);

                                }
                                int[] nArray4 = new int[lIIlIIIIIlIll[0]];
                                nArray4[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[9];
                                if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block14;
                                int[] nArray5 = new int[lIIlIIIIIlIll[0]];
                                nArray5[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[9];
                                if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block15;
                                int[] nArray6 = new int[lIIlIIIIIlIll[0]];
                                nArray6[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[9];
                                if (!r.lIlIIlllIlIllII(Bank.getFirst((int[])nArray6).getQuantity(), lIIlIIIIIlIll[7])) break block15;
                            }
                            var2 = new DHelper(lIIlIIIIIlIll[9], lIIlIIIIIlIll[13], lIIlIIIIIlIll[135]);
                            bA.add((DHelper) ar2);

                        }
                        int[] nArray = new int[lIIlIIIIIlIll[0]];
                        nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                        if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block16;
                        int[] nArray7 = new int[lIIlIIIIIlIll[0]];
                        nArray7[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                        if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) break block17;
                        int[] nArray8 = new int[lIIlIIIIIlIll[0]];
                        nArray8[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                        if (!r.lIlIIlllIlIllII(Bank.getFirst((int[])nArray8).getQuantity(), lIIlIIIIIlIll[7])) break block17;
                    }
                    var2 = new DHelper(lIIlIIIIIlIll[15], lIIlIIIIIlIll[13], lIIlIIIIIlIll[136]);
                    bA.add((DHelper) ar2);

                }
                if (r.lIlIIlllIlIllIl(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(lIIlIIIIIlIlI[lIIlIIIIIlIll[142]]))) ? 1 : 0)) {
                    var1 = new DHelper(lIIlIIIIIlIll[137], lIIlIIIIIlIll[7], lIIlIIIIIlIll[138]);
                    bA.add(var1);

                }
                int[] nArray = new int[lIIlIIIIIlIll[0]];
                nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[14];
                if (r.lIlIIlllIlIllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var1 = new DHelper(lIIlIIIIIlIll[14], lIIlIIIIIlIll[6], h.bv);
                    bA.add(var1);

                }
                int[] nArray9 = new int[lIIlIIIIIlIll[0]];
                nArray9[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block18;
                int[] nArray10 = new int[lIIlIIIIIlIll[0]];
                nArray10[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                if (!r.lIlIIlllIlIlIll(Bank.contains((int[])nArray10) ? 1 : 0)) break block19;
                int[] nArray11 = new int[lIIlIIIIIlIll[0]];
                nArray11[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                if (!r.lIlIIlllIlIllII(Bank.getFirst((int[])nArray11).getQuantity(), lIIlIIIIIlIll[16])) break block19;
            }
            var1 = new DHelper(lIIlIIIIIlIll[8], lIIlIIIIIlIll[66], lIIlIIIIIlIll[139]);
            bA.add(var1);

        }
    }

    private static boolean lIlIIlllIllIIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean X() {
        return lIIlIIIIIlIll[1];
    }

    private static boolean lIlIIlllIlIllll(Object object) {
        return object != null;
    }

    static {
        r.lIlIIlllIlIlIIl();
        r.lIlIIlllIlIlIII();
        bA = new ArrayList<d>();
        fn = lIIlIIIIIlIll[154];
        fd = new WorldPoint(lIIlIIIIIlIll[155], lIIlIIIIIlIll[156], lIIlIIIIIlIll[3]);
        fo = new WorldPoint(lIIlIIIIIlIll[108], lIIlIIIIIlIll[157], lIIlIIIIIlIll[1]);
        String[] stringArray = new String[lIIlIIIIIlIll[6]];
        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[158]];
        stringArray[r.lIIlIIIIIlIll[0]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[159]];
        stringArray[r.lIIlIIIIIlIll[3]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[160]];
        stringArray[r.lIIlIIIIIlIll[5]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[161]];
        bW = stringArray;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var3;
        int[] nArray = new int[lIIlIIIIIlIll[7]];
        nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
        nArray[r.lIIlIIIIIlIll[0]] = lIIlIIIIIlIll[9];
        nArray[r.lIIlIIIIIlIll[3]] = lIIlIIIIIlIll[10];
        nArray[r.lIIlIIIIIlIll[5]] = lIIlIIIIIlIll[11];
        nArray[r.lIIlIIIIIlIll[6]] = lIIlIIIIIlIll[12];
        int[] nArray2 = nArray;
        int var4 = lIIlIIIIIlIll[1];
        while (r.lIlIIlllIlIllII(var4, ((void)var3).length)) {
            int[] nArray3 = new int[lIIlIIIIIlIll[0]];
            nArray3[r.lIIlIIIIIlIll[1]] = var3[var4];
            if (r.lIlIIlllIlIllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIIIIlIll[1];
            }
            ++var4;

            if ((0xA9 ^ 0xAD) != 1) continue;
            return false;
        }
        return lIIlIIIIIlIll[0];
    }

    private static boolean lIlIIlllIllIllI(Object object) {
        return object == null;
    }

    @Override
    public String Z() {
        return lIIlIIIIIlIlI[lIIlIIIIIlIll[141]];
    }

    private static boolean lIlIIlllIllIIII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (r.lIlIIlllIlIlllI(e.j(fn), lIIlIIIIIlIll[6])) {
            bl = lIIlIIIIIlIll[0];

            if ((0x53 ^ 0x68 ^ (0x8A ^ 0xB5)) <= -1) {
                return ((0xDB ^ 0x8F ^ (0x60 ^ 0x6B)) & (53 + 125 - 3 + 45 ^ 76 + 80 - 131 + 106 ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIIIIlIll[1];
        }
        return bl;
    }

    private static boolean lIlIIlllIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int Y() {
        try {
            r.bc();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lIIlIIIIIlIll[140];
    }

    public static void bc() {
        block81: {
            WorldPoint var5;
            TileObject var6;
            WorldArea var7;
            WorldArea var8;
            WorldArea var9;
            WorldArea var10;
            WorldArea var11;
            WorldArea var12;
            WorldArea var13;
            BankLocation var14;
            block82: {
                WorldArea var15;
                WorldArea var16;
                block83: {
                    block85: {
                        block84: {
                            if (r.lIlIIlllIlIlIll(by ? 1 : 0)) {
                                b.a(bA);
                                if (r.lIlIIlllIlIllII(bA.size(), lIIlIIIIIlIll[0])) {
                                    System.out.println(lIIlIIIIIlIlI[lIIlIIIIIlIll[1]]);
                                    by = lIIlIIIIIlIll[1];
                                }
                            }
                            if (!r.lIlIIlllIlIllIl(by ? 1 : 0)) break block81;
                            if (r.lIlIIlllIlIllII(e.I(), lIIlIIIIIlIll[2])) {
                                System.out.println(lIIlIIIIIlIlI[lIIlIIIIIlIll[0]]);
                                AccBuilderRat.d = lIIlIIIIIlIll[0];
                                return;
                            }
                            if (r.lIlIIlllIlIllIl(r.S() ? 1 : 0) && r.lIlIIlllIlIllII(e.j(fn), lIIlIIIIIlIll[0]) && r.lIlIIlllIlIlllI(e.I(), lIIlIIIIIlIll[2])) {
                                var14 = BankLocation.getNearest();
                                if (r.lIlIIlllIlIllll(var14) && r.lIlIIlllIlIllIl(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[3]];
                                    a.a(var14);
                                }
                                if (r.lIlIIlllIlIllll(var14) && r.lIlIIlllIlIlIll(var14.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (r.lIlIIlllIlIllIl(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIIlIll[4]);

                                    }
                                    if (r.lIlIIlllIlIlIll(Bank.isOpen() ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[5]];
                                        if (r.lIlIIlllIllIIII(Inventory.getAll().size())) {
                                            Bank.depositInventory();
                                            Time.sleepTicks((int)lIIlIIIIIlIll[6]);

                                        }
                                        if (r.lIlIIlllIllIIII(Equipment.getAll().size())) {
                                            Bank.depositEquipment();
                                            Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                                        }
                                        int[] nArray = new int[lIIlIIIIIlIll[7]];
                                        nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                                        nArray[r.lIIlIIIIIlIll[0]] = lIIlIIIIIlIll[9];
                                        nArray[r.lIIlIIIIIlIll[3]] = lIIlIIIIIlIll[10];
                                        nArray[r.lIIlIIIIIlIll[5]] = lIIlIIIIIlIll[11];
                                        nArray[r.lIIlIIIIIlIll[6]] = lIIlIIIIIlIll[12];
                                        if (r.lIlIIlllIlIllIl(e.b(nArray) ? 1 : 0)) {
                                            r.W();
                                            System.out.println(lIIlIIIIIlIlI[lIIlIIIIIlIll[6]]);
                                            by = lIIlIIIIIlIll[0];
                                            return;
                                        }
                                        int[] nArray2 = new int[lIIlIIIIIlIll[7]];
                                        nArray2[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[8];
                                        nArray2[r.lIIlIIIIIlIll[0]] = lIIlIIIIIlIll[9];
                                        nArray2[r.lIIlIIIIIlIll[3]] = lIIlIIIIIlIll[10];
                                        nArray2[r.lIIlIIIIIlIll[5]] = lIIlIIIIIlIll[11];
                                        nArray2[r.lIIlIIIIIlIll[6]] = lIIlIIIIIlIll[12];
                                        if (r.lIlIIlllIlIlIll(e.b(nArray2) ? 1 : 0)) {
                                            a.a(lIIlIIIIIlIll[8], lIIlIIIIIlIll[13]);
                                            a.a(lIIlIIIIIlIll[9], lIIlIIIIIlIll[13]);
                                            a.a(lIIlIIIIIlIll[10], lIIlIIIIIlIll[0]);
                                            a.a(lIIlIIIIIlIll[11], lIIlIIIIIlIll[0]);
                                            a.a(lIIlIIIIIlIll[12], lIIlIIIIIlIll[0]);
                                            a.a(lIIlIIIIIlIll[14], lIIlIIIIIlIll[0]);
                                            a.a(lIIlIIIIIlIll[15], lIIlIIIIIlIll[16]);
                                        }
                                    }
                                }
                            }
                            if (r.lIlIIlllIlIlIll(Inventory.contains((int[])f.ba) ? 1 : 0) && r.lIlIIlllIlIllII(Movement.getRunEnergy(), lIIlIIIIIlIll[17])) {
                                Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[7]]);
                                Time.sleepTicks((int)lIIlIIIIIlIll[0]);

                            }
                            int[] nArray = new int[lIIlIIIIIlIll[0]];
                            nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                            if (r.lIlIIlllIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0) && r.lIlIIlllIllIIIl(r.lIlIIlllIlIlIlI(e.v(), 50.0))) {
                                int[] nArray3 = new int[lIIlIIIIIlIll[0]];
                                nArray3[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[15];
                                Inventory.getFirst((int[])nArray3).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[18]]);
                                Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                            }
                            if (r.lIlIIlllIlIlIll(r.S() ? 1 : 0) && r.lIlIIlllIlIllIl(e.j(fn))) {
                                if (!r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIIlIll[7]) || r.lIlIIlllIllIIll(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIIlIll[3])) {
                                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[19]];
                                    if (r.lIlIIlllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    Movement.walkTo((WorldPoint)fd);

                                    Time.sleepTicks((int)lIIlIIIIIlIll[0]);

                                }
                                if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIIlIll[7])) {
                                    g.a(lIIlIIIIIlIlI[lIIlIIIIIlIll[20]], bW);
                                }
                            }
                            if (!r.lIlIIlllIllIlII(e.j(fn), lIIlIIIIIlIll[0])) break block82;
                            co = lIIlIIIIIlIll[1];
                            var14 = new WorldArea(lIIlIIIIIlIll[21], lIIlIIIIIlIll[22], lIIlIIIIIlIll[18], lIIlIIIIIlIll[3], lIIlIIIIIlIll[1]);
                            var13 = new WorldArea(lIIlIIIIIlIll[23], lIIlIIIIIlIll[24], lIIlIIIIIlIll[25], lIIlIIIIIlIll[26], lIIlIIIIIlIll[0]);
                            var12 = new WorldArea(lIIlIIIIIlIll[23], lIIlIIIIIlIll[27], lIIlIIIIIlIll[28], lIIlIIIIIlIll[29], lIIlIIIIIlIll[3]);
                            var11 = new WorldArea(lIIlIIIIIlIll[30], lIIlIIIIIlIll[22], lIIlIIIIIlIll[31], lIIlIIIIIlIll[18], lIIlIIIIIlIll[1]);
                            var10 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[33], lIIlIIIIIlIll[34], lIIlIIIIIlIll[35], lIIlIIIIIlIll[1]);
                            var9 = new WorldArea(lIIlIIIIIlIll[36], lIIlIIIIIlIll[37], lIIlIIIIIlIll[38], lIIlIIIIIlIll[34], lIIlIIIIIlIll[1]);
                            if (!r.lIlIIlllIlIllIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !r.lIlIIlllIlIllIl(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block83;
                            if (r.lIlIIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(fo), lIIlIIIIIlIll[3])) {
                                AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[34]];
                                e.D();
                                Movement.walkTo((WorldPoint)fo);

                                Time.sleepTicks((int)lIIlIIIIIlIll[0]);

                            }
                            if (!r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fo), lIIlIIIIIlIll[3])) break block83;
                            String[] stringArray = new String[lIIlIIIIIlIll[0]];
                            stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[13]];
                            if (!r.lIlIIlllIlIlIll(Equipment.contains((String[])stringArray) ? 1 : 0)) break block84;
                            String[] stringArray2 = new String[lIIlIIIIIlIll[0]];
                            stringArray2[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[38]];
                            if (!r.lIlIIlllIlIllIl(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block85;
                        }
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[2]];
                        if (r.lIlIIlllIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray3 = new String[lIIlIIIIIlIll[0]];
                            stringArray3[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[35]];
                            Inventory.getFirst((String[])stringArray3).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[39]]);
                        }
                        String[] stringArray4 = new String[lIIlIIIIIlIll[0]];
                        stringArray4[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[16]];
                        if (r.lIlIIlllIlIlIll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                            String[] stringArray5 = new String[lIIlIIIIIlIll[0]];
                            stringArray5[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[40]];
                            Inventory.getFirst((String[])stringArray5).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[41]]);
                        }
                    }
                    if (r.lIlIIlllIlIlIll(Inventory.contains((int[])f.ba) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[42]]);
                    }
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[29]];
                    if (r.lIlIIlllIlIlIll(Equipment.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray6 = new String[lIIlIIIIIlIll[0]];
                        stringArray6[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[26]];
                        if (r.lIlIIlllIlIlIll(Equipment.contains((String[])stringArray6) ? 1 : 0)) {
                            String[] stringArray7 = new String[lIIlIIIIIlIll[0]];
                            stringArray7[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[43]];
                            TileObjects.getNearest((String[])stringArray7).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[44]]);
                            Time.sleepTicks((int)lIIlIIIIIlIll[6]);

                        }
                    }
                }
                if (r.lIlIIlllIlIlIll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[45]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[31]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[46]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                var8 = new WorldArea(lIIlIIIIIlIll[47], lIIlIIIIIlIll[48], lIIlIIIIIlIll[6], lIIlIIIIIlIll[5], lIIlIIIIIlIll[1]);
                var7 = new WorldArea(lIIlIIIIIlIll[47], lIIlIIIIIlIll[48], lIIlIIIIIlIll[6], lIIlIIIIIlIll[5], lIIlIIIIIlIll[0]);
                if (r.lIlIIlllIlIlIll(var8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[49]];
                    var6 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[152]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIIlIll[0]];
                            stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[153]];
                            if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIIlIll[0];

                                if (-1 < 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIlIIIIIlIll[1];
                        return n2 != 0;
                    });
                    var6.interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[50]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[51]];
                    var6 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[150]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIIlIll[0]];
                            stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[151]];
                            if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIIlIll[0];

                                if (null == null) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lIIlIIIIIlIll[1];
                        return n2 != 0;
                    });
                    var6.interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[28]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                var6 = new WorldArea(lIIlIIIIIlIll[21], lIIlIIIIIlIll[52], lIIlIIIIIlIll[18], lIIlIIIIIlIll[18], lIIlIIIIIlIll[3]);
                var5 = new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[3]);
                if (r.lIlIIlllIlIlIll(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[25]];
                    if (r.lIlIIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(var5), lIIlIIIIIlIll[0])) {
                        Movement.walkTo((WorldPoint)var5);

                        Time.sleepTicks((int)lIIlIIIIIlIll[0]);

                    }
                    if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(var5), lIIlIIIIIlIll[0])) {
                        var16 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[148]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIlIIIIIlIll[0]];
                                stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[149]];
                                if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIlIIIIIlIll[0];

                                    if (null == null) return n2 != 0;
                                    return ((0x46 ^ 0x4F ^ (0x1B ^ 0x33)) & (0xDB ^ 0xA2 ^ (7 ^ 0x5F) ^ -1)) != 0;
                                }
                            }
                            n2 = lIIlIIIIIlIll[1];
                            return n2 != 0;
                        });
                        var16.interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[54]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                    }
                }
                if (r.lIlIIlllIlIlIll((var16 = new WorldArea(lIIlIIIIIlIll[55], lIIlIIIIIlIll[56], lIIlIIIIIlIll[13], lIIlIIIIIlIll[7], lIIlIIIIIlIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[57]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[58]];
                    String[] stringArray8 = new String[lIIlIIIIIlIll[0]];
                    stringArray8[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[59]];
                    if (r.lIlIIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIIlIIIIIlIll[0]];
                        stringArray9[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[60]];
                        TileObjects.getNearest((String[])stringArray9).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[61]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);

                    }
                    String[] stringArray10 = new String[lIIlIIIIIlIll[0]];
                    stringArray10[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[62]];
                    String[] stringArray11 = new String[lIIlIIIIIlIll[0]];
                    stringArray11[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[63]];
                    if (r.lIlIIlllIlIllIl(TileObjects.getNearest((String[])stringArray10).hasAction(stringArray11) ? 1 : 0)) {
                        if (r.lIlIIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[0])), lIIlIIIIIlIll[3])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[0]));

                            Time.sleepTicks((int)lIIlIIIIIlIll[0]);

                        }
                        if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[0])), lIIlIIIIIlIll[3])) {
                            String[] stringArray12 = new String[lIIlIIIIIlIll[0]];
                            stringArray12[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[65]];
                            TileObjects.getNearest((String[])stringArray12).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[66]]);
                            Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                        }
                    }
                }
                if (r.lIlIIlllIlIlIll((var15 = new WorldArea(lIIlIIIIIlIll[36], lIIlIIIIIlIll[67], lIIlIIIIIlIll[19], lIIlIIIIIlIll[18], lIIlIIIIIlIll[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[68]];
                    if (r.lIlIIlllIllIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3])), lIIlIIIIIlIll[0])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3]));

                        Time.sleepTicks((int)lIIlIIIIIlIll[0]);

                    }
                    if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3])), lIIlIIIIIlIll[0])) {
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[69]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[70]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);

                    }
                }
                WorldArea var17 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[37], lIIlIIIIIlIll[7], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0]);
                WorldArea var18 = new WorldArea(lIIlIIIIIlIll[71], lIIlIIIIIlIll[72], lIIlIIIIIlIll[19], lIIlIIIIIlIll[6], lIIlIIIIIlIll[0]);
                WorldArea var19 = new WorldArea(lIIlIIIIIlIll[71], lIIlIIIIIlIll[33], lIIlIIIIIlIll[18], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0]);
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[73]];
                    String[] stringArray13 = new String[lIIlIIIIIlIll[0]];
                    stringArray13[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[74]];
                    if (r.lIlIIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray13) ? 1 : 0)) {
                        String[] stringArray14 = new String[lIIlIIIIIlIll[0]];
                        stringArray14[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[75]];
                        TileObjects.getNearest((String[])stringArray14).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[76]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);

                    }
                }
                if (!r.lIlIIlllIlIllIl(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIlIIlllIlIlIll(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (r.lIlIIlllIlIlIll(var18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[77]];
                        String[] stringArray15 = new String[lIIlIIIIIlIll[0]];
                        stringArray15[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[78]];
                        if (r.lIlIIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray15) ? 1 : 0)) {
                            String[] stringArray16 = new String[lIIlIIIIIlIll[0]];
                            stringArray16[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[17]];
                            TileObjects.getNearest((String[])stringArray16).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[79]]);
                            Time.sleepTicks((int)lIIlIIIIIlIll[5]);

                        }
                    }
                    if (r.lIlIIlllIlIlIll(var19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[146]]) ? 1 : 0)) {
                                String[] stringArray = new String[lIIlIIIIIlIll[0]];
                                stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[147]];
                                if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = lIIlIIIIIlIll[0];

                                    if (1 == 1) return n2 != 0;
                                    return ((0xD5 ^ 0xB4) & ~(0x53 ^ 0x32) & ~((0x93 ^ 0x8B) & ~(0x9A ^ 0x82))) != 0;
                                }
                            }
                            n2 = lIIlIIIIIlIll[1];
                            return n2 != 0;
                        }).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[80]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);

                    }
                }
                WorldArea var20 = new WorldArea(lIIlIIIIIlIll[71], lIIlIIIIIlIll[37], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0], lIIlIIIIIlIll[1]);
                WorldArea var21 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[33], lIIlIIIIIlIll[3], lIIlIIIIIlIll[7], lIIlIIIIIlIll[1]);
                if (!r.lIlIIlllIlIllIl(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIlIIlllIlIlIll(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (r.lIlIIlllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[81]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[82]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[5]);

                    }
                    g.a(bW);
                }
            }
            if (r.lIlIIlllIllIlII(e.j(fn), lIIlIIIIIlIll[3])) {
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[83], lIIlIIIIIlIll[84], lIIlIIIIIlIll[1])) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[85]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[86]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[87]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                var14 = new WorldArea(lIIlIIIIIlIll[88], lIIlIIIIIlIll[72], lIIlIIIIIlIll[18], lIIlIIIIIlIll[6], lIIlIIIIIlIll[0]);
                var13 = new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[67], lIIlIIIIIlIll[0]);
                var12 = new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[37], lIIlIIIIIlIll[0]);
                var11 = new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[56], lIIlIIIIIlIll[0]);
                if (!(r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[89], lIIlIIIIIlIll[37], lIIlIIIIIlIll[0])) ? 1 : 0) && r.lIlIIlllIlIllIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)var13) ? 1 : 0) && r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0) && !r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0))) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[90]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[91]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[92]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[83], lIIlIIIIIlIll[67], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[93]];
                    Time.sleepTicks((int)lIIlIIIIIlIll[5]);

                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[94]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[95]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[32], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3])) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[96]];
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3]));

                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[64], lIIlIIIIIlIll[52], lIIlIIIIIlIll[3])) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[97]];
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[98]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[99]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll((var10 = new WorldArea(lIIlIIIIIlIll[55], lIIlIIIIIlIll[56], lIIlIIIIIlIll[13], lIIlIIIIIlIll[7], lIIlIIIIIlIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[100]];
                    String[] stringArray17 = new String[lIIlIIIIIlIll[0]];
                    stringArray17[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[101]];
                    if (r.lIlIIlllIlIlIll(TileObjects.getNearest((String[])stringArray).hasAction(stringArray17) ? 1 : 0)) {
                        String[] stringArray18 = new String[lIIlIIIIIlIll[0]];
                        stringArray18[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[102]];
                        TileObjects.getNearest((String[])stringArray18).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[103]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                    }
                    String[] stringArray19 = new String[lIIlIIIIIlIll[0]];
                    stringArray19[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[104]];
                    String[] stringArray20 = new String[lIIlIIIIIlIll[0]];
                    stringArray20[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[105]];
                    if (r.lIlIIlllIlIllIl(TileObjects.getNearest((String[])stringArray19).hasAction(stringArray20) ? 1 : 0)) {
                        if (r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[0]));

                            Time.sleepTicks((int)lIIlIIIIIlIll[0]);

                        }
                        if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                            String[] stringArray21 = new String[lIIlIIIIIlIll[0]];
                            stringArray21[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[106]];
                            TileObjects.getNearest((String[])stringArray21).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[107]]);
                            Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                        }
                    }
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[53], lIIlIIIIIlIll[22], lIIlIIIIIlIll[3])) ? 1 : 0)) {
                    Movement.walkTo((int)lIIlIIIIIlIll[108], (int)lIIlIIIIIlIll[109], (int)lIIlIIIIIlIll[3]);

                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[108], lIIlIIIIIlIll[109], lIIlIIIIIlIll[3])) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[110]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[111]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[108], lIIlIIIIIlIll[109], lIIlIIIIIlIll[0])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (r.lIlIIlllIlIlIll(tileObject.getName().equalsIgnoreCase(lIIlIIIIIlIlI[lIIlIIIIIlIll[144]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIIlIll[0]];
                            stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[145]];
                            if (r.lIlIIlllIlIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = lIIlIIIIIlIll[0];

                                if (-(0x3E ^ 0x40 ^ (0x25 ^ 0x5F)) < 0) return n2 != 0;
                                return ((0x1F ^ 0x47 ^ (0x9E ^ 0x98)) & (5 ^ 0x47 ^ (0x79 ^ 0x65) ^ -1)) != 0;
                            }
                        }
                        n2 = lIIlIIIIIlIll[1];
                        return n2 != 0;
                    }).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[112]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[55], lIIlIIIIIlIll[109], lIIlIIIIIlIll[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[113]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[114]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[108], lIIlIIIIIlIll[115], lIIlIIIIIlIll[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[116]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[117]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                var9 = new WorldArea(lIIlIIIIIlIll[30], lIIlIIIIIlIll[22], lIIlIIIIIlIll[35], lIIlIIIIIlIll[3], lIIlIIIIIlIll[1]);
                var8 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (r.lIlIIlllIlIlIll(nPC.getName().contains(lIIlIIIIIlIlI[lIIlIIIIIlIll[140]]) ? 1 : 0) && r.lIlIIlllIllIIlI(nPC.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[88], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1])), lIIlIIIIIlIll[0]) && r.lIlIIlllIllIlll(nPC.getInteracting(), Players.getLocal())) {
                        n2 = lIIlIIIIIlIll[0];

                        if (((84 + 126 - 157 + 115 ^ 128 + 20 - 96 + 89) & (0xBF ^ 0xB4 ^ (0x29 ^ 7) ^ -1)) != ((124 + 196 - 162 + 66 ^ 117 + 103 - 161 + 116) & (79 + 64 - 96 + 162 ^ 98 + 74 - 81 + 67 ^ -1))) {
                            return false;
                        }
                    } else {
                        n2 = lIIlIIIIIlIll[1];
                    }
                    return n2 != 0;
                });
                if (r.lIlIIlllIlIlIll(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIlIIlllIlIllll(var8)) {
                    AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[118]];
                    e.b(new WorldPoint(lIIlIIIIIlIll[119], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1]));
                    Time.sleepTicks((int)lIIlIIIIIlIll[34]);

                }
                if (!r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[88], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1])) ? 1 : 0) || r.lIlIIlllIlIlIll(var9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    var8 = NPCs.getNearest(nPC -> {
                        int n2;
                        if (r.lIlIIlllIlIlIll(nPC.getName().contains(lIIlIIIIIlIlI[lIIlIIIIIlIll[143]]) ? 1 : 0) && r.lIlIIlllIllIIlI(nPC.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIIlIll[88], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1])), lIIlIIIIIlIll[3]) && r.lIlIIlllIllIlll(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIIlIIIIIlIll[0];

                            if (-1 != -1) {
                                return ((16 + 118 - 101 + 120 ^ 65 + 0 - -81 + 2) & (0xAF ^ 0x9B ^ (0x79 ^ 0x40) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lIIlIIIIIlIll[1];
                        }
                        return n2 != 0;
                    });
                    if (r.lIlIIlllIlIllIl(Dialog.isOpen() ? 1 : 0) && r.lIlIIlllIllIllI(var8)) {
                        String[] stringArray = new String[lIIlIIIIIlIll[0]];
                        stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[120]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[121]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[0]);

                    }
                    while (r.lIlIIlllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bW);
                        Time.sleep((long)50L);

                        return;
                    }
                }
                if (r.lIlIIlllIlIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[71], lIIlIIIIIlIll[22], lIIlIIIIIlIll[1])) ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[122]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[123]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                var7 = new WorldArea(lIIlIIIIIlIll[89], lIIlIIIIIlIll[48], lIIlIIIIIlIll[38], lIIlIIIIIlIll[5], lIIlIIIIIlIll[0]);
                var6 = new WorldArea(lIIlIIIIIlIll[124], lIIlIIIIIlIll[67], lIIlIIIIIlIll[6], lIIlIIIIIlIll[34], lIIlIIIIIlIll[0]);
                if (!r.lIlIIlllIlIllIl(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIlIIIIIlIll[89], lIIlIIIIIlIll[48], lIIlIIIIIlIll[0])) ? 1 : 0) || !r.lIlIIlllIlIllIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || r.lIlIIlllIlIlIll(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (r.lIlIIlllIlIlIll(Inventory.contains((int[])f.ba) ? 1 : 0) && r.lIlIIlllIlIllII(Movement.getRunEnergy(), lIIlIIIIIlIll[97])) {
                        Inventory.getFirst((int[])f.ba).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[125]]);
                        Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                    }
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[126]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[127]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                }
                if (r.lIlIIlllIlIlIll((var5 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[27], lIIlIIIIIlIll[34], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && r.lIlIIlllIlIllIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIIIIIlIll[0]];
                    stringArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[128]];
                    if (r.lIlIIlllIlIlIll(Inventory.contains((String[])stringArray) ? 1 : 0) && r.lIlIIlllIlIllIl(Players.getLocal().isMoving() ? 1 : 0)) {
                        String[] stringArray22 = new String[lIIlIIIIIlIll[0]];
                        stringArray22[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[129]];
                        String[] stringArray23 = new String[lIIlIIIIIlIll[0]];
                        stringArray23[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIlI[lIIlIIIIIlIll[130]];
                        Inventory.getFirst((String[])stringArray22).useOn(TileObjects.getNearest((String[])stringArray23));
                        Time.sleepTicks((int)lIIlIIIIIlIll[3]);

                    }
                }
                g.a(bW);
            }
            if (r.lIlIIlllIllIlII(e.j(fn), lIIlIIIIIlIll[5])) {
                var14 = new WorldArea(lIIlIIIIIlIll[32], lIIlIIIIIlIll[27], lIIlIIIIIlIll[34], lIIlIIIIIlIll[19], lIIlIIIIIlIll[0]);
                if (r.lIlIIlllIlIlIll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] nArray = new int[lIIlIIIIIlIll[0]];
                    nArray[r.lIIlIIIIIlIll[1]] = lIIlIIIIIlIll[9];
                    Inventory.getFirst((int[])nArray).interact(lIIlIIIIIlIlI[lIIlIIIIIlIll[131]]);
                    Time.sleepTicks((int)lIIlIIIIIlIll[7]);

                }
                if (r.lIlIIlllIlIllIl(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (!r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIIlIll[7]) || r.lIlIIlllIllIIll(Players.getLocal().getWorldLocation().getPlane(), lIIlIIIIIlIll[3])) {
                        AccBuilderRat.c = lIIlIIIIIlIlI[lIIlIIIIIlIll[132]];
                        if (r.lIlIIlllIlIlIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        e.E();
                        Movement.walkTo((WorldPoint)fd);

                        Time.sleepTicks((int)lIIlIIIIIlIll[0]);

                    }
                    if (r.lIlIIlllIllIIlI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIIlIll[7])) {
                        if (r.lIlIIlllIlIllII(co, lIIlIIIIIlIll[0])) {
                            P.lE += lIIlIIIIIlIll[0];
                            P.d(AccBuilderRat.m);
                            co += lIIlIIIIIlIll[0];
                            P.lE = lIIlIIIIIlIll[1];
                            cp = lIIlIIIIIlIll[1];
                        }
                        g.a(lIIlIIIIIlIlI[lIIlIIIIIlIll[133]], bW);
                    }
                }
            }
            g.a(new String[lIIlIIIIIlIll[1]]);
        }
    }

    private static boolean lIlIIlllIllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIlllIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlllIllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlllIlIlIll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var22);
    }

    private static boolean lIlIIlllIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlllIlIllIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIIlllIlIlIII() {
        lIIlIIIIIlIlI = new String[lIIlIIIIIlIll[162]];
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[1]] = "Finished buying items, switching back to quest";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[0]] = "Need 12 QP";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[3]] = "Nav to bank";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[5]] = "Handling banking";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[6]] = "We are missing quest supplies, switching to BUYING";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[7]] = "Drink";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[18]] = "Eat";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[19]] = "Nav to start";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[20]] = "Sir Amik Varze";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[34]] = "Nav to fortress";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[13]] = "Bronze med helm";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[38]] = "Iron chainbody";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[2]] = "Bronze med helm";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[35]] = "Bronze med helm";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[39]] = "Wear";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[16]] = "Iron chainbody";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[40]] = "Iron chainbody";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[41]] = "Wear";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[42]] = "Drink";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[29]] = "Bronze med helm";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[26]] = "Iron chainbody";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[43]] = "Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[44]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[45]] = "Push wall";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[31]] = "Wall";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[46]] = "Push";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[49]] = "Climb up first ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[50]] = "Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[51]] = "Climb up 2nd ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[28]] = "Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[25]] = "Climb down 1st ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[54]] = "Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[57]] = "Handle door and ladder up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[58]] = "Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[59]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[60]] = "Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[61]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[62]] = "Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[63]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[65]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[66]] = "Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[68]] = "Climb down second ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[69]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[70]] = "Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[73]] = "Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[74]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[75]] = "Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[76]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[77]] = "Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[78]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[17]] = "Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[79]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[80]] = "Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[81]] = "Grill";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[82]] = "Listen-at";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[85]] = "Ladder up 1";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[86]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[87]] = "Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[90]] = "Door 1";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[91]] = "Sturdy door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[92]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[93]] = "ladder up 2";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[94]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[95]] = "Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[96]] = "Walk to ladder down 1 tile";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[97]] = "Climb down 1";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[98]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[99]] = "Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[100]] = "Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[101]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[102]] = "Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[103]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[104]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[105]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[106]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[107]] = "Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[110]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[111]] = "Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[112]] = "Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[113]] = "Wall";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[114]] = "Push";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[116]] = "Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[117]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[118]] = "Luring knight";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[120]] = "Door";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[121]] = "Open";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[122]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[123]] = "Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[125]] = "Drink";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[126]] = "Wall";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[127]] = "Push";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[128]] = "Cabbage";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[129]] = "Cabbage";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[130]] = "Hole";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[131]] = "Break";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[132]] = "Nav to start";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[133]] = "Sir Amik Varze";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[141]] = "Black Knights Fortress";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[142]] = "ring of wealth (";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[143]] = "Knight";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[140]] = "Knight";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[144]] = "ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[145]] = "Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[146]] = "Ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[147]] = "Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[148]] = "ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[149]] = "Climb-down";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[150]] = "ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[151]] = "Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[152]] = "ladder";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[153]] = "Climb-up";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[158]] = "Yes.";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[159]] = "I seek a quest!";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[160]] = "I laugh in the face of danger!";
        r.lIIlIIIIIlIlI[r.lIIlIIIIIlIll[161]] = "I don't care. I'm going in anyway.";
    }

    private static boolean lIlIIlllIllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static int lIlIIlllIlIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

