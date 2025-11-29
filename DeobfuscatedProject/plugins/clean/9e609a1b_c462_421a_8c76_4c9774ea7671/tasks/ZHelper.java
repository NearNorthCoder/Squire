/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
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
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.MHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class ZHelper
implements M {
    private static final  int gh;
    static  String[] dP;
    private static final  int gm;
    private static final  int gk;
    private static final  int gl;
    private static final  int gf;
    public static  boolean by;
    static  String fa;
    private static final  int gd;
    private static final  int gi;
    private static final  int ge;
    static  boolean cp;
    
    private static final  int gc;
    private static final  WorldPoint gb;
    public static  List<d> bA;
    private static final  int gg;
    private static final  int gj;
    static  int co;
    static  int bY;

        return String.valueOf(var1);
    }

    private static boolean lIlIIlIIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIIIllllII(Object object) {
        return object != null;
    }

    private static void lIlIIlIIIllIlll() {
        lIIIlllIlIIIl = new String[lIIIlllIlIIll[96]];
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[0]] = "Buying items";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[1]] = "Finished buying items, switching back to questing";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[3]] = "Navigating to bank";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[4]] = "Opening bank";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[6]] = "Handling banking";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[9]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[12]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[14]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[16]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[18]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[8]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[19]] = "Walking to imp start";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[32]] = "Magic Portal";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[33]] = "Enter";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[34]] = "Handling quest";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[31]] = "Nav to start";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[35]] = "Finishing quest";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[36]] = "Adding red bead to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[38]] = "Adding yellow bead to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[40]] = "Adding black bead to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[30]] = "Adding white bead to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[41]] = "Adding lobster to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[44]] = "Adding lobster to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[46]] = "Adding cheese to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[48]] = "Adding cheese to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[49]] = "Adding wealth to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[52]] = "Adding varrock tabs to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[54]] = "Adding fally tabs to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[55]] = "Adding fally tabs to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[56]] = "Adding staminas to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[57]] = "Adding mind runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[60]] = "Adding air runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[61]] = "Adding water runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[62]] = "Adding earth runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[63]] = "Adding air runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[64]] = "Adding water runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[65]] = "Adding earth runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[66]] = "Adding mind runes to buy list";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[67]] = "Red bead";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[68]] = "Yellow bead";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[45]] = "Black bead";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[69]] = "White bead";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[70]] = "Cheese";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[71]] = "Navigating to bank";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[72]] = "Opening bank";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[73]] = "Handling banking";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[74]] = "Mind rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[75]] = "Mind rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[76]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[77]] = "Earth rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[78]] = "Earth rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[79]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[80]] = "Water rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[81]] = "Water rune";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[82]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[83]] = "We are missing supplies, switching to BUYING";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[84]] = "Imp Catcher quest";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[85]] = "ring of wealth (";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[89]] = "Wizard Mizgog";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[90]] = "Give me a quest please.";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[91]] = "I'll try.";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[92]] = "Actually, I know where to find this stuff.";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[93]] = "Yes.";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[94]] = "What's the matter?";
        z.lIIIlllIlIIIl[z.lIIIlllIlIIll[95]] = "Ok, I'll see what I can do.";
    }

    private static boolean lIlIIlIIIlllIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (z.lIlIIlIIlIIIIIl(e.j(lIIIlllIlIIll[2]), lIIIlllIlIIll[3])) {
            bl = lIIIlllIlIIll[1];

        } else {
            bl = lIIIlllIlIIll[0];
        }
        return bl;
    }

    private static boolean lIlIIlIIIllllll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public int Y() {
        try {
            z.bD();

        }
        catch (Exception var2) {
            var2.printStackTrace();
        }
        if (((0x52 ^ 0x5F) & ~(0x53 ^ 0x5E)) != ((0x26 ^ 0x29) & ~(0x35 ^ 0x3A))) {
            return (0xDE ^ 0xC0) & ~(0x23 ^ 0x3D);
        }
        return lIIIlllIlIIll[42];
    }

    private static boolean lIlIIlIIIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIIlllIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean X() {
        return lIIIlllIlIIll[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aJ() {
        int n2;
        String[] stringArray = new String[lIIIlllIlIIll[1]];
        stringArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[67]];
        if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIlllIlIIll[1]];
            stringArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[68]];
            if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIIlllIlIIll[1]];
                stringArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[45]];
                if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIIlllIlIIll[1]];
                    stringArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[69]];
                    if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        int[] nArray = new int[lIIIlllIlIIll[1]];
                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                        if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray2 = new int[lIIIlllIlIIll[1]];
                            nArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                                int[] nArray3 = new int[lIIIlllIlIIll[1]];
                                nArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    int[] nArray4 = new int[lIIIlllIlIIll[1]];
                                    nArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                    if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                                        int[] nArray5 = new int[lIIIlllIlIIll[1]];
                                        nArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                        if (z.lIlIIlIIIlllIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                            String[] stringArray5 = new String[lIIIlllIlIIll[1]];
                                            stringArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[70]];
                                            if (z.lIlIIlIIIlllIIl(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                                                n2 = lIIIlllIlIIll[1];

                                                if ((0x65 ^ 0x60) > 0) return n2 != 0;
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIlllIlIIll[0];
        return n2 != 0;
    }

    private static boolean lIlIIlIIIllllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIIlIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIIlIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void W() {
        d var3;
        block37: {
            block36: {
                block35: {
                    block34: {
                        Object var4;
                        block33: {
                            block32: {
                                int[] nArray = new int[lIIIlllIlIIll[1]];
                                nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[36]]);
                                    d d2 = new DHelper(lIIIlllIlIIll[21], lIIIlllIlIIll[1], lIIIlllIlIIll[37]);
                                    bA.add(d2);

                                }
                                int[] nArray2 = new int[lIIIlllIlIIll[1]];
                                nArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[38]]);
                                    var4 = new DHelper(lIIIlllIlIIll[22], lIIIlllIlIIll[1], lIIIlllIlIIll[39]);
                                    bA.add((DHelper) ar4);

                                }
                                int[] nArray3 = new int[lIIIlllIlIIll[1]];
                                nArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[40]]);
                                    var4 = new DHelper(lIIIlllIlIIll[23], lIIIlllIlIIll[1], lIIIlllIlIIll[39]);
                                    bA.add((DHelper) ar4);

                                }
                                int[] nArray4 = new int[lIIIlllIlIIll[1]];
                                nArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[30]]);
                                    var4 = new DHelper(lIIIlllIlIIll[24], lIIIlllIlIIll[1], lIIIlllIlIIll[39]);
                                    bA.add((DHelper) ar4);

                                }
                                int[] nArray5 = new int[lIIIlllIlIIll[1]];
                                nArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[41]]);
                                    var4 = new DHelper(lIIIlllIlIIll[25], lIIIlllIlIIll[42], lIIIlllIlIIll[43]);
                                    bA.add((DHelper) ar4);

                                }
                                int[] nArray6 = new int[lIIIlllIlIIll[1]];
                                nArray6[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                    int[] nArray7 = new int[lIIIlllIlIIll[1]];
                                    nArray7[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                    if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlllIlIIll[30])) {
                                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[44]]);
                                        var4 = new DHelper(lIIIlllIlIIll[25], lIIIlllIlIIll[45], lIIIlllIlIIll[43]);
                                        bA.add((DHelper) ar4);

                                    }
                                }
                                int[] nArray8 = new int[lIIIlllIlIIll[1]];
                                nArray8[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[46]]);
                                    var4 = new DHelper(lIIIlllIlIIll[17], lIIIlllIlIIll[9], lIIIlllIlIIll[47]);
                                    bA.add((DHelper) ar4);

                                }
                                int[] nArray9 = new int[lIIIlllIlIIll[1]];
                                nArray9[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block32;
                                int[] nArray10 = new int[lIIIlllIlIIll[1]];
                                nArray10[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block33;
                                int[] nArray11 = new int[lIIIlllIlIIll[1]];
                                nArray11[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (!z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlllIlIIll[9])) break block33;
                            }
                            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[48]]);
                            var4 = new DHelper(lIIIlllIlIIll[17], lIIIlllIlIIll[9], lIIIlllIlIIll[47]);
                            bA.add((DHelper) ar4);

                        }
                        if (z.lIlIIlIIIlllIll(Bank.contains((Predicate)(var4 = item -> item.getName().toLowerCase().contains(lIIIlllIlIIIl[lIIIlllIlIIll[85]]))) ? 1 : 0)) {
                            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[49]]);
                            var3 = new DHelper(lIIIlllIlIIll[50], lIIIlllIlIIll[38], lIIIlllIlIIll[51]);
                            bA.add(var3);

                        }
                        int[] nArray = new int[lIIIlllIlIIll[1]];
                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                        if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                        int[] nArray12 = new int[lIIIlllIlIIll[1]];
                        nArray12[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                        if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block35;
                        int[] nArray13 = new int[lIIIlllIlIIll[1]];
                        nArray13[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                        if (!z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray13).getQuantity(), lIIIlllIlIIll[30])) break block35;
                    }
                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[52]]);
                    var3 = new DHelper(lIIIlllIlIIll[20], lIIIlllIlIIll[45], lIIIlllIlIIll[53]);
                    bA.add(var3);

                }
                int[] nArray = new int[lIIIlllIlIIll[1]];
                nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[54]]);
                    var3 = new DHelper(lIIIlllIlIIll[7], lIIIlllIlIIll[30], lIIIlllIlIIll[53]);
                    bA.add(var3);

                }
                int[] nArray14 = new int[lIIIlllIlIIll[1]];
                nArray14[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block36;
                int[] nArray15 = new int[lIIIlllIlIIll[1]];
                nArray15[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (!z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block37;
                int[] nArray16 = new int[lIIIlllIlIIll[1]];
                nArray16[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (!z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray16).getQuantity(), lIIIlllIlIIll[30])) break block37;
            }
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[55]]);
            var3 = new DHelper(lIIIlllIlIIll[7], lIIIlllIlIIll[30], lIIIlllIlIIll[53]);
            bA.add(var3);

        }
        int[] nArray = new int[lIIIlllIlIIll[1]];
        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[56]]);
            var3 = new DHelper(lIIIlllIlIIll[27], lIIIlllIlIIll[9], h.bv);
            bA.add(var3);

        }
        int[] nArray17 = new int[lIIIlllIlIIll[1]];
        nArray17[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
        if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
            int[] nArray18 = new int[lIIIlllIlIIll[1]];
            nArray18[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
            if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray18).getQuantity(), lIIIlllIlIIll[11])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[57]]);
                var3 = new DHelper(lIIIlllIlIIll[10], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
                bA.add(var3);

            }
        }
        int[] nArray19 = new int[lIIIlllIlIIll[1]];
        nArray19[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
        if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[lIIIlllIlIIll[1]];
            nArray20[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
            if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray20).getQuantity(), lIIIlllIlIIll[11])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[60]]);
                var3 = new DHelper(lIIIlllIlIIll[59], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
                bA.add(var3);

            }
        }
        int[] nArray21 = new int[lIIIlllIlIIll[1]];
        nArray21[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
        if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray21) ? 1 : 0)) {
            int[] nArray22 = new int[lIIIlllIlIIll[1]];
            nArray22[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
            if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray22).getQuantity(), lIIIlllIlIIll[11])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[61]]);
                var3 = new DHelper(lIIIlllIlIIll[15], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
                bA.add(var3);

            }
        }
        int[] nArray23 = new int[lIIIlllIlIIll[1]];
        nArray23[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
        if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
            int[] nArray24 = new int[lIIIlllIlIIll[1]];
            nArray24[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
            if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray24).getQuantity(), lIIIlllIlIIll[11])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[62]]);
                var3 = new DHelper(lIIIlllIlIIll[13], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
                bA.add(var3);

            }
        }
        int[] nArray25 = new int[lIIIlllIlIIll[1]];
        nArray25[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[59];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[63]]);
            var3 = new DHelper(lIIIlllIlIIll[59], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
            bA.add(var3);

        }
        int[] nArray26 = new int[lIIIlllIlIIll[1]];
        nArray26[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray26) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[64]]);
            var3 = new DHelper(lIIIlllIlIIll[15], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
            bA.add(var3);

        }
        int[] nArray27 = new int[lIIIlllIlIIll[1]];
        nArray27[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray27) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[65]]);
            var3 = new DHelper(lIIIlllIlIIll[13], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
            bA.add(var3);

        }
        int[] nArray28 = new int[lIIIlllIlIIll[1]];
        nArray28[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
        if (z.lIlIIlIIIlllIll(Bank.contains((int[])nArray28) ? 1 : 0)) {
            System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[66]]);
            var3 = new DHelper(lIIIlllIlIIll[10], lIIIlllIlIIll[58], lIIIlllIlIIll[14]);
            bA.add(var3);

        }
    }

    public static void bD() {
        if (z.lIlIIlIIIlllIIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[0]];
            b.a(bA);
            if (z.lIlIIlIIIlllIlI(bA.size(), lIIIlllIlIIll[1])) {
                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[1]]);
                by = lIIIlllIlIIll[0];
            }
        }
        if (z.lIlIIlIIIlllIll(by ? 1 : 0)) {
            if (z.lIlIIlIIIlllIll(e.j(lIIIlllIlIIll[2]))) {
                BankLocation var5;
                if (z.lIlIIlIIIlllIll(z.aJ() ? 1 : 0)) {
                    var5 = BankLocation.getNearest();
                    if (z.lIlIIlIIIllllII(var5) && z.lIlIIlIIIlllIll(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[3]];
                        a.a(var5);
                    }
                    if (z.lIlIIlIIIllllII(var5) && z.lIlIIlIIIlllIIl(var5.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[4]];
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlIIll[5]);

                        }
                        if (z.lIlIIlIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[6]];
                            if (z.lIlIIlIIIllllIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlllIlIIll[4]);

                            }
                            if (z.lIlIIlIIIllllIl(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlllIlIIll[3]);

                            }
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIlllIlIIll[1]];
                                nArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIlIIll[8])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[9]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray3 = new int[lIIIlllIlIIll[1]];
                            nArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIlllIlIIll[1]];
                                nArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIlIIll[11])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[12]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray5 = new int[lIIIlllIlIIll[1]];
                            nArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIlllIlIIll[1]];
                                nArray6[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray6).getQuantity(), lIIIlllIlIIll[11])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[14]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray7 = new int[lIIIlllIlIIll[1]];
                            nArray7[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIlllIlIIll[1]];
                                nArray8[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray8).getQuantity(), lIIIlllIlIIll[11])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[16]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray9 = new int[lIIIlllIlIIll[1]];
                            nArray9[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIlllIlIIll[1]];
                                nArray10[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (z.lIlIIlIIIlllIlI(Bank.getFirst((int[])nArray10).getQuantity(), lIIIlllIlIIll[9])) {
                                    z.W();
                                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[18]]);
                                    by = lIIIlllIlIIll[1];
                                    return;
                                }
                            }
                            int[] nArray11 = new int[lIIIlllIlIIll[19]];
                            nArray11[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                            nArray11[z.lIIIlllIlIIll[1]] = lIIIlllIlIIll[21];
                            nArray11[z.lIIIlllIlIIll[3]] = lIIIlllIlIIll[22];
                            nArray11[z.lIIIlllIlIIll[4]] = lIIIlllIlIIll[23];
                            nArray11[z.lIIIlllIlIIll[6]] = lIIIlllIlIIll[24];
                            nArray11[z.lIIIlllIlIIll[9]] = lIIIlllIlIIll[7];
                            nArray11[z.lIIIlllIlIIll[12]] = lIIIlllIlIIll[17];
                            nArray11[z.lIIIlllIlIIll[14]] = lIIIlllIlIIll[25];
                            nArray11[z.lIIIlllIlIIll[16]] = lIIIlllIlIIll[10];
                            nArray11[z.lIIIlllIlIIll[18]] = lIIIlllIlIIll[15];
                            nArray11[z.lIIIlllIlIIll[8]] = lIIIlllIlIIll[13];
                            if (z.lIlIIlIIIlllIll(e.b(nArray11) ? 1 : 0)) {
                                z.W();
                                System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[8]]);
                                by = lIIIlllIlIIll[1];
                                return;
                            }
                            while (z.lIlIIlIIIlllIll(m.av() ? 1 : 0)) {
                                m.at();
                                Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                if (1 < (0xC2 ^ 0x99 ^ (0xF7 ^ 0xA8))) continue;
                                return;
                            }
                            if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepTicks((int)lIIIlllIlIIll[6]);

                            }
                            int[] nArray12 = new int[lIIIlllIlIIll[1]];
                            nArray12[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                int[] nArray13 = new int[lIIIlllIlIIll[1]];
                                nArray13[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray13), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[22], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray14 = new int[lIIIlllIlIIll[1]];
                            nArray14[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                int[] nArray15 = new int[lIIIlllIlIIll[1]];
                                nArray15[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray15), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[23], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                            if (3 <= ((0xF3 ^ 0xAD) & ~(0x46 ^ 0x18))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray16 = new int[lIIIlllIlIIll[1]];
                            nArray16[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                                int[] nArray17 = new int[lIIIlllIlIIll[1]];
                                nArray17[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray17), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[21], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                            if (((0x8F ^ 0xAB ^ (0x1F ^ 8)) & (131 + 27 - 73 + 66 ^ 64 + 76 - 30 + 54 ^ -1)) != 0) {
                                                return ((1 ^ 0x55 ^ (0x38 ^ 0x71)) & (0x52 ^ 0x3D ^ (0x3B ^ 0x49) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray18 = new int[lIIIlllIlIIll[1]];
                            nArray18[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                                int[] nArray19 = new int[lIIIlllIlIIll[1]];
                                nArray19[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray19), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[24], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray20 = new int[lIIIlllIlIIll[1]];
                            nArray20[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                                int[] nArray21 = new int[lIIIlllIlIIll[1]];
                                nArray21[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray21), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[7], (int)lIIIlllIlIIll[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray22 = new int[lIIIlllIlIIll[1]];
                            nArray22[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                                int[] nArray23 = new int[lIIIlllIlIIll[1]];
                                nArray23[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray23), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[17], (int)lIIIlllIlIIll[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                            if (1 < ((0xA0 ^ 0xC6 ^ (0x91 ^ 0xBF)) & (0x9E ^ 0x81 ^ (5 ^ 0x52) ^ -1))) {
                                                return ((0xF0 ^ 0x81 ^ (8 ^ 0x61)) & (0x7F ^ 0x53 ^ (0x7B ^ 0x4F) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray24 = new int[lIIIlllIlIIll[1]];
                            nArray24[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
                                int[] nArray25 = new int[lIIIlllIlIIll[1]];
                                nArray25[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray25), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[10], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                            if (((0x13 ^ 0x7F ^ (0xB6 ^ 0x98)) & (210 + 111 - 131 + 53 ^ 156 + 91 - 245 + 175 ^ -1)) != ((0xBD ^ 0x8E ^ (0xF9 ^ 0x84)) & (0x20 ^ 0x62 ^ (0xA6 ^ 0xAA) ^ -1))) {
                                                return ((0xBC ^ 0xC1 ^ (9 ^ 0x6E)) & (46 + 3 - 46 + 139 ^ 90 + 125 - 104 + 37 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray26 = new int[lIIIlllIlIIll[1]];
                            nArray26[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray26) ? 1 : 0)) {
                                int[] nArray27 = new int[lIIIlllIlIIll[1]];
                                nArray27[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray27), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[15], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                            if (2 == 3) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray28 = new int[lIIIlllIlIIll[1]];
                            nArray28[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray28) ? 1 : 0)) {
                                int[] nArray29 = new int[lIIIlllIlIIll[1]];
                                nArray29[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray29), lIIIlllIlIIll[1])) {
                                    Bank.withdraw((int)lIIIlllIlIIll[13], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                            if (3 == ((0x2B ^ 0x35) & ~(0 ^ 0x1E))) {
                                                return false;
                                            }
                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray30 = new int[lIIIlllIlIIll[1]];
                            nArray30[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray30) ? 1 : 0)) {
                                int[] nArray31 = new int[lIIIlllIlIIll[1]];
                                nArray31[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                                if (z.lIlIIlIIIlllIll(Inventory.contains((int[])nArray31) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIIlllIlIIll[27], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                            int[] nArray32 = new int[lIIIlllIlIIll[1]];
                            nArray32[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                            if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray32) ? 1 : 0)) {
                                int[] nArray33 = new int[lIIIlllIlIIll[1]];
                                nArray33[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray33), lIIIlllIlIIll[1])) {
                                    Bank.withdrawAll((int)lIIIlllIlIIll[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIlllIlIIll[1]];
                                        nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                                        if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIlllIlIIll[1];

                                        } else {
                                            bl = lIIIlllIlIIll[0];
                                        }
                                        return bl;
                                    }, (int)lIIIlllIlIIll[5]);

                                }
                            }
                        }
                    }
                }
                if (z.lIlIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[6]) && z.lIlIIlIIIllllll(Players.getLocal().getWorldLocation().getPlane(), lIIIlllIlIIll[3]) && z.lIlIIlIIIlllIIl(z.aJ() ? 1 : 0)) {
                    if (z.lIlIIlIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIIIlllIlIIll[6]);

                    }
                    AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[19]];
                    if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                        if (z.lIlIIlIIIlllIlI(bY, lIIIlllIlIIll[1])) {
                            e.w();
                            bY += lIIIlllIlIIll[1];
                        }
                        if (z.lIlIIlIIIlllIIl((var5 = new WorldArea(lIIIlllIlIIll[28], lIIIlllIlIIll[29], lIIIlllIlIIll[30], lIIIlllIlIIll[31], lIIIlllIlIIll[3])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lIIIlllIlIIll[1]];
                            stringArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[32]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIIlllIlIIIl[lIIIlllIlIIll[33]]);
                            Time.sleepTicks((int)e.c(lIIIlllIlIIll[12], lIIIlllIlIIll[16]));

                        }
                        Movement.walkTo((WorldPoint)gb);

                        Time.sleepTicks((int)lIIIlllIlIIll[3]);

                    }
                }
                if (z.lIlIIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[12])) {
                    AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[34]];
                    co = lIIIlllIlIIll[0];
                    g.a(fa, dP);
                    if (z.lIlIIlIIIlllIIl(g.L() ? 1 : 0)) {
                        g.a(dP);
                    }
                }
            }
            if (z.lIlIIlIIIllllIl(e.j(lIIIlllIlIIll[2])) && z.lIlIIlIIIlllIlI(e.j(lIIIlllIlIIll[2]), lIIIlllIlIIll[3])) {
                if (z.lIlIIlIIIlllIll(z.aJ() ? 1 : 0)) {
                    z.bm();
                }
                if (z.lIlIIlIIIlllIIl(z.aJ() ? 1 : 0)) {
                    if (z.lIlIIlIIIlllllI(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[12])) {
                        AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[31]];
                        if (z.lIlIIlIIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)gb);

                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                    }
                    if (z.lIlIIlIIlIIIIII(Players.getLocal().getWorldLocation().distanceTo(gb), lIIIlllIlIIll[12])) {
                        AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[35]];
                        if (z.lIlIIlIIIlllIlI(co, lIIIlllIlIIll[1])) {
                            P.lw += lIIIlllIlIIll[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIlllIlIIll[1];
                            P.lw = lIIIlllIlIIll[0];
                            cp = lIIIlllIlIIll[0];
                        }
                        g.a(fa, dP);
                        if (z.lIlIIlIIIlllIIl(g.L() ? 1 : 0)) {
                            g.a(dP);
                        }
                    }
                }
            }
            System.out.println("Setting: " + e.j(lIIIlllIlIIll[2]));
            g.a(new String[lIIIlllIlIIll[0]]);
        }
    }

    static {
        z.lIlIIlIIIlllIII();
        z.lIlIIlIIIllIlll();
        gf = lIIIlllIlIIll[23];
        gj = lIIIlllIlIIll[13];
        gi = lIIIlllIlIIll[15];
        gg = lIIIlllIlIIll[24];
        ge = lIIIlllIlIIll[22];
        gk = lIIIlllIlIIll[86];
        gh = lIIIlllIlIIll[10];
        gc = lIIIlllIlIIll[2];
        gd = lIIIlllIlIIll[21];
        gm = lIIIlllIlIIll[17];
        gl = lIIIlllIlIIll[25];
        gb = new WorldPoint(lIIIlllIlIIll[87], lIIIlllIlIIll[88], lIIIlllIlIIll[3]);
        bA = new ArrayList<d>();
        fa = lIIIlllIlIIIl[lIIIlllIlIIll[89]];
        String[] stringArray = new String[lIIIlllIlIIll[12]];
        stringArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[90]];
        stringArray[z.lIIIlllIlIIll[1]] = lIIIlllIlIIIl[lIIIlllIlIIll[91]];
        stringArray[z.lIIIlllIlIIll[3]] = lIIIlllIlIIIl[lIIIlllIlIIll[92]];
        stringArray[z.lIIIlllIlIIll[4]] = lIIIlllIlIIIl[lIIIlllIlIIll[93]];
        stringArray[z.lIIIlllIlIIll[6]] = lIIIlllIlIIIl[lIIIlllIlIIll[94]];
        stringArray[z.lIIIlllIlIIll[9]] = lIIIlllIlIIIl[lIIIlllIlIIll[95]];
        dP = stringArray;
        bY = lIIIlllIlIIll[0];
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        void var6;
        BankLocation bankLocation = BankLocation.getNearest();
        if (z.lIlIIlIIIllllII(bankLocation) && z.lIlIIlIIIlllIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[71]];
            a.a(bankLocation);
        }
        if (z.lIlIIlIIIllllII(var6) && z.lIlIIlIIIlllIIl(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[72]];
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIlIIll[5]);

            }
            if (z.lIlIIlIIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIlIIIl[lIIIlllIlIIll[73]];
                if (z.lIlIIlIIIllllIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIIlllIlIIll[4]);

                }
                if (z.lIlIIlIIIllllIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)lIIIlllIlIIll[3]);

                }
                String[] stringArray = new String[lIIIlllIlIIll[1]];
                stringArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[74]];
                if (z.lIlIIlIIIlllIIl(Bank.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIlllIlIIll[1]];
                    stringArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[75]];
                    if (z.lIlIIlIIIlllIlI(Bank.getFirst((String[])stringArray2).getQuantity(), lIIIlllIlIIll[11])) {
                        z.W();
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[76]]);
                        by = lIIIlllIlIIll[1];
                        return;
                    }
                }
                String[] stringArray3 = new String[lIIIlllIlIIll[1]];
                stringArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[77]];
                if (z.lIlIIlIIIlllIIl(Bank.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIIlllIlIIll[1]];
                    stringArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[78]];
                    if (z.lIlIIlIIIlllIlI(Bank.getFirst((String[])stringArray4).getQuantity(), lIIIlllIlIIll[11])) {
                        z.W();
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[79]]);
                        by = lIIIlllIlIIll[1];
                        return;
                    }
                }
                String[] stringArray5 = new String[lIIIlllIlIIll[1]];
                stringArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[80]];
                if (z.lIlIIlIIIlllIIl(Bank.contains((String[])stringArray5) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIIIlllIlIIll[1]];
                    stringArray6[z.lIIIlllIlIIll[0]] = lIIIlllIlIIIl[lIIIlllIlIIll[81]];
                    if (z.lIlIIlIIIlllIlI(Bank.getFirst((String[])stringArray6).getQuantity(), lIIIlllIlIIll[11])) {
                        z.W();
                        System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[82]]);
                        by = lIIIlllIlIIll[1];
                        return;
                    }
                }
                int[] nArray = new int[lIIIlllIlIIll[19]];
                nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[20];
                nArray[z.lIIIlllIlIIll[1]] = lIIIlllIlIIll[21];
                nArray[z.lIIIlllIlIIll[3]] = lIIIlllIlIIll[22];
                nArray[z.lIIIlllIlIIll[4]] = lIIIlllIlIIll[23];
                nArray[z.lIIIlllIlIIll[6]] = lIIIlllIlIIll[24];
                nArray[z.lIIIlllIlIIll[9]] = lIIIlllIlIIll[7];
                nArray[z.lIIIlllIlIIll[12]] = lIIIlllIlIIll[17];
                nArray[z.lIIIlllIlIIll[14]] = lIIIlllIlIIll[25];
                nArray[z.lIIIlllIlIIll[16]] = lIIIlllIlIIll[10];
                nArray[z.lIIIlllIlIIll[18]] = lIIIlllIlIIll[15];
                nArray[z.lIIIlllIlIIll[8]] = lIIIlllIlIIll[13];
                if (z.lIlIIlIIIlllIll(e.b(nArray) ? 1 : 0)) {
                    z.W();
                    System.out.println(lIIIlllIlIIIl[lIIIlllIlIIll[83]]);
                    by = lIIIlllIlIIll[1];
                    return;
                }
                while (z.lIlIIlIIIlllIll(m.av() ? 1 : 0)) {
                    m.at();
                    Time.sleepTicks((int)lIIIlllIlIIll[1]);

                    if (1 >= 0) continue;
                    return;
                }
                if (z.lIlIIlIIIlllIll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lIIIlllIlIIll[6]);

                }
                int[] nArray2 = new int[lIIIlllIlIIll[1]];
                nArray2[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIlllIlIIll[1]];
                    nArray3[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray3), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[22], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[22];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                                if ((127 + 162 - 125 + 7 ^ 157 + 155 - 291 + 154) <= ((0x43 ^ 0x24 ^ (0xE2 ^ 0x83)) & (0x55 ^ 0x58 ^ (0x71 ^ 0x7A) ^ -1))) {
                                    return ((0x1F ^ 5 ^ (0x64 ^ 0x6D)) & (63 + 67 - 80 + 114 ^ 43 + 106 - 1 + 35 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray4 = new int[lIIIlllIlIIll[1]];
                nArray4[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[lIIIlllIlIIll[1]];
                    nArray5[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray5), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[23], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[23];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                                if (2 > 2) {
                                    return ((24 + 44 - 60 + 138 ^ 129 + 9 - 133 + 166) & (0x14 ^ 0x38 ^ (0x41 ^ 0x54) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray6 = new int[lIIIlllIlIIll[1]];
                nArray6[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    int[] nArray7 = new int[lIIIlllIlIIll[1]];
                    nArray7[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray7), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[21], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[21];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                                if (-(3 ^ (0x5F ^ 0x58)) > 0) {
                                    return ((146 + 207 - 221 + 117 ^ 160 + 31 - 118 + 113) & (0x39 ^ 0x7C ^ (0x27 ^ 0x21) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray8 = new int[lIIIlllIlIIll[1]];
                nArray8[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                    int[] nArray9 = new int[lIIIlllIlIIll[1]];
                    nArray9[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray9), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[24], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[24];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                                if ((0xA5 ^ 0xA1) != (0xBF ^ 0xBB)) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray10 = new int[lIIIlllIlIIll[1]];
                nArray10[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    int[] nArray11 = new int[lIIIlllIlIIll[1]];
                    nArray11[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray11), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[7], (int)lIIIlllIlIIll[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[7];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                                if (2 < 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray12 = new int[lIIIlllIlIIll[1]];
                nArray12[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    int[] nArray13 = new int[lIIIlllIlIIll[1]];
                    nArray13[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray13), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[17], (int)lIIIlllIlIIll[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[17];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray14 = new int[lIIIlllIlIIll[1]];
                nArray14[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                    int[] nArray15 = new int[lIIIlllIlIIll[1]];
                    nArray15[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray15), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[10], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[10];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                                if (((0x44 ^ 0x7B) & ~(0x7A ^ 0x45)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray16 = new int[lIIIlllIlIIll[1]];
                nArray16[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIlllIlIIll[1]];
                    nArray17[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray17), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[15], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[15];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray18 = new int[lIIIlllIlIIll[1]];
                nArray18[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                    int[] nArray19 = new int[lIIIlllIlIIll[1]];
                    nArray19[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray19), lIIIlllIlIIll[1])) {
                        Bank.withdraw((int)lIIIlllIlIIll[13], (int)lIIIlllIlIIll[26], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[13];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray20 = new int[lIIIlllIlIIll[1]];
                nArray20[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIIlllIlIIll[1]];
                    nArray21[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                    if (z.lIlIIlIIIlllIll(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                        Bank.withdraw((int)lIIIlllIlIIll[27], (int)lIIIlllIlIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[27];
                            return Inventory.contains((int[])nArray);
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
                int[] nArray22 = new int[lIIIlllIlIIll[1]];
                nArray22[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                if (z.lIlIIlIIIlllIIl(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[lIIIlllIlIIll[1]];
                    nArray23[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                    if (z.lIlIIlIIIlllIlI(Inventory.getCount((int[])nArray23), lIIIlllIlIIll[1])) {
                        Bank.withdrawAll((int)lIIIlllIlIIll[25], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIlllIlIIll[1]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIIlllIlIIll[1]];
                            nArray[z.lIIIlllIlIIll[0]] = lIIIlllIlIIll[25];
                            if (z.lIlIIlIIIllllIl(Inventory.getCount((int[])nArray))) {
                                bl = lIIIlllIlIIll[1];

                                if (3 <= 0) {
                                    return ((124 + 80 - 142 + 95 ^ 131 + 170 - 281 + 160) & (0x10 ^ 0x61 ^ (0xC ^ 0x54) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIIlllIlIIll[0];
                            }
                            return bl;
                        }, (int)lIIIlllIlIIll[5]);

                    }
                }
            }
        }
    }

    @Override
    public String Z() {
        return lIIIlllIlIIIl[lIIIlllIlIIll[84]];
    }
}

