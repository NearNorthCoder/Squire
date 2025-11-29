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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.AHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.BHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.DHelper;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.FHelper;
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

public class AJHelper
implements W {
    public static  WorldArea mc;
    public static  List<d> bv;
    public static  boolean bt;
    private static  WorldPoint me;
    private static  WorldPoint md;

    private static void lllIlllllll() {
        lIIIlllll = new String[lIIlIIIII[100]];
        aj.lIIIlllll[aj.lIIlIIIII[0]] = "Buying items";
        aj.lIIIlllll[aj.lIIlIIIII[1]] = "Finished buying items, switching back to fishing";
        aj.lIIIlllll[aj.lIIlIIIII[2]] = "Navigating to bank";
        aj.lIIIlllll[aj.lIIlIIIII[3]] = "Opening bank";
        aj.lIIIlllll[aj.lIIlIIIII[5]] = "Handling banking";
        aj.lIIIlllll[aj.lIIlIIIII[7]] = "Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[9]] = "Fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[11]] = "Fly fishing rod rod";
        aj.lIIIlllll[aj.lIIlIIIII[13]] = "Feather";
        aj.lIIIlllll[aj.lIIlIIIII[15]] = "Fishing bait";
        aj.lIIIlllll[aj.lIIlIIIII[16]] = "We are missing supplies, switching to BUYING";
        aj.lIIIlllll[aj.lIIlIIIII[17]] = "Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[18]] = "Fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[19]] = "Fly fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[20]] = "Feather";
        aj.lIIIlllll[aj.lIIlIIIII[22]] = "Fishing bait";
        aj.lIIIlllll[aj.lIIlIIIII[25]] = "Dropping logs";
        aj.lIIIlllll[aj.lIIlIIIII[26]] = "Dropping logs";
        aj.lIIIlllll[aj.lIIlIIIII[28]] = "Nav to small fish spot";
        aj.lIIIlllll[aj.lIIlIIIII[29]] = "Wear";
        aj.lIIIlllll[aj.lIIlIIIII[27]] = "Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[32]] = "Nav to small fish spot";
        aj.lIIIlllll[aj.lIIlIIIII[33]] = "Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[34]] = "Bait";
        aj.lIIIlllll[aj.lIIlIIIII[35]] = "Nav to fly fish spot";
        aj.lIIIlllll[aj.lIIlIIIII[36]] = "Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[37]] = "Lure";
        aj.lIIIlllll[aj.lIIlIIIII[38]] = "Dropping logs";
        aj.lIIIlllll[aj.lIIlIIIII[39]] = "Dropping logs";
        aj.lIIIlllll[aj.lIIlIIIII[40]] = "Fishing spot";
        aj.lIIIlllll[aj.lIIlIIIII[41]] = "Use-rod";
        aj.lIIIlllll[aj.lIIlIIIII[42]] = "Buying items";
        aj.lIIIlllll[aj.lIIlIIIII[43]] = "Finished buying items, switching back to fishing";
        aj.lIIIlllll[aj.lIIlIIIII[44]] = "Navigating to bank";
        aj.lIIIlllll[aj.lIIlIIIII[45]] = "Opening bank";
        aj.lIIIlllll[aj.lIIlIIIII[46]] = "Handling banking";
        aj.lIIIlllll[aj.lIIlIIIII[47]] = "Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[48]] = "We are missing supplies, switching to BUYING";
        aj.lIIIlllll[aj.lIIlIIIII[49]] = "Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[53]] = "Nav to bank";
        aj.lIIIlllll[aj.lIIlIIIII[54]] = "Nav to small fish spot";
        aj.lIIIlllll[aj.lIIlIIIII[55]] = "Wear";
        aj.lIIIlllll[aj.lIIlIIIII[56]] = "Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[57]] = "Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[58]] = "Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[59]] = "Fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[60]] = "Fly fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[61]] = "Feather";
        aj.lIIIlllll[aj.lIIlIIIII[62]] = "Fishing bait";
        aj.lIIIlllll[aj.lIIlIIIII[73]] = "Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[75]] = "ring of wealth (";
        aj.lIIIlllll[aj.lIIlIIIII[76]] = "Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[78]] = "Fishing bait";
        aj.lIIIlllll[aj.lIIlIIIII[79]] = "Feather";
        aj.lIIIlllll[aj.lIIlIIIII[80]] = "Fly fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[81]] = "Fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[82]] = "Small fishing net";
    }

    private static boolean llllIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static void af() {
        d lIIIlIlIllllIII;
        Object lIIIlIlIllllIIl;
        int[] nArray = new int[lIIlIIIII[1]];
        nArray[aj.lIIlIIIII[0]] = lIIlIIIII[6];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIIlIIIII[6], lIIlIIIII[1], lIIlIIIII[4]);
            bv.add(d2);

        }
        int[] nArray2 = new int[lIIlIIIII[1]];
        nArray2[aj.lIIlIIIII[0]] = lIIlIIIII[8];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIIlIlIllllIIl = new DHelper(lIIlIIIII[8], lIIlIIIII[1], lIIlIIIII[4]);
            bv.add((DHelper) IIIlIlIllllIIl);

        }
        int[] nArray3 = new int[lIIlIIIII[1]];
        nArray3[aj.lIIlIIIII[0]] = lIIlIIIII[10];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIIlIlIllllIIl = new DHelper(lIIlIIIII[10], lIIlIIIII[1], lIIlIIIII[63]);
            bv.add((DHelper) IIIlIlIllllIIl);

        }
        int[] nArray4 = new int[lIIlIIIII[1]];
        nArray4[aj.lIIlIIIII[0]] = lIIlIIIII[14];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIIlIlIllllIIl = new DHelper(lIIlIIIII[14], lIIlIIIII[64], lIIlIIIII[65]);
            bv.add((DHelper) IIIlIlIllllIIl);

        }
        int[] nArray5 = new int[lIIlIIIII[1]];
        nArray5[aj.lIIlIIIII[0]] = lIIlIIIII[12];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIIlIlIllllIIl = new DHelper(lIIlIIIII[12], lIIlIIIII[66], lIIlIIIII[7]);
            bv.add((DHelper) IIIlIlIllllIIl);

        }
        int[] nArray6 = new int[lIIlIIIII[1]];
        nArray6[aj.lIIlIIIII[0]] = lIIlIIIII[67];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIIlIlIllllIIl = new DHelper(lIIlIIIII[67], lIIlIIIII[1], lIIlIIIII[4]);
            bv.add((DHelper) IIIlIlIllllIIl);

        }
        int[] nArray7 = new int[lIIlIIIII[1]];
        nArray7[aj.lIIlIIIII[0]] = lIIlIIIII[24];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIIlIlIllllIIl = new DHelper(lIIlIIIII[24], lIIlIIIII[16], lIIlIIIII[4]);
            bv.add((DHelper) IIIlIlIllllIIl);

        }
        if (aj.llllIIIIIll(Bank.contains((Predicate)(lIIIlIlIllllIIl = item -> item.getName().toLowerCase().contains(lIIIlllll[lIIlIIIII[75]]))) ? 1 : 0)) {
            lIIIlIlIllllIII = new DHelper(lIIlIIIII[68], lIIlIIIII[7], lIIlIIIII[69]);
            bv.add(lIIIlIlIllllIII);

        }
        int[] nArray8 = new int[lIIlIIIII[1]];
        nArray8[aj.lIIlIIIII[0]] = lIIlIIIII[70];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIIIlIlIllllIII = new DHelper(lIIlIIIII[70], lIIlIIIII[54], lIIlIIIII[71]);
            bv.add(lIIIlIlIllllIII);

        }
    }

    public static void ef() {
        block36: {
            BankLocation lIIIlIlIllllllI;
            block37: {
                block44: {
                    block39: {
                        block43: {
                            block42: {
                                block41: {
                                    block40: {
                                        block38: {
                                            if (aj.llllIIIIIIl(bt ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[0]];
                                                b.a(bv);
                                                if (aj.llllIIIIIlI(bv.size(), lIIlIIIII[1])) {
                                                    System.out.println(lIIIlllll[lIIlIIIII[1]]);
                                                    bt = lIIlIIIII[0];
                                                }
                                            }
                                            if (!aj.llllIIIIIll(bt ? 1 : 0)) break block36;
                                            if (!aj.llllIIIIIll(aj.ab() ? 1 : 0)) break block37;
                                            lIIIlIlIllllllI = BankLocation.getNearest();
                                            if (aj.llllIIIIlII(lIIIlIlIllllllI) && aj.llllIIIIIll(lIIIlIlIllllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[2]];
                                                a.a(lIIIlIlIllllllI);
                                            }
                                            if (!aj.llllIIIIlII(lIIIlIlIllllllI) || !aj.llllIIIIIIl(lIIIlIlIllllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block37;
                                            if (aj.llllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[3]];
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIII[4]);

                                            }
                                            if (!aj.llllIIIIIIl(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[5]];
                                            if (aj.llllIIIIlIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIlIIIII[5]);

                                            }
                                            if (aj.llllIIIIlIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIlIIIII[2]);

                                            }
                                            int[] nArray = new int[lIIlIIIII[1]];
                                            nArray[aj.lIIlIIIII[0]] = lIIlIIIII[6];
                                            if (!aj.llllIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                            String[] stringArray = new String[lIIlIIIII[1]];
                                            stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[7]];
                                            if (!aj.llllIIIIllI(Inventory.getCount((String[])stringArray), lIIlIIIII[1])) break block39;
                                        }
                                        int[] nArray = new int[lIIlIIIII[1]];
                                        nArray[aj.lIIlIIIII[0]] = lIIlIIIII[8];
                                        if (!aj.llllIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                        String[] stringArray = new String[lIIlIIIII[1]];
                                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[9]];
                                        if (!aj.llllIIIIllI(Inventory.getCount((String[])stringArray), lIIlIIIII[1])) break block39;
                                    }
                                    int[] nArray = new int[lIIlIIIII[1]];
                                    nArray[aj.lIIlIIIII[0]] = lIIlIIIII[10];
                                    if (!aj.llllIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                    String[] stringArray = new String[lIIlIIIII[1]];
                                    stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[11]];
                                    if (!aj.llllIIIIllI(Inventory.getCount((String[])stringArray), lIIlIIIII[1])) break block39;
                                }
                                int[] nArray = new int[lIIlIIIII[1]];
                                nArray[aj.lIIlIIIII[0]] = lIIlIIIII[12];
                                if (!aj.llllIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                String[] stringArray = new String[lIIlIIIII[1]];
                                stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[13]];
                                if (!aj.llllIIIIllI(Inventory.getCount((String[])stringArray), lIIlIIIII[1])) break block39;
                            }
                            int[] nArray = new int[lIIlIIIII[1]];
                            nArray[aj.lIIlIIIII[0]] = lIIlIIIII[14];
                            if (!aj.llllIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                            String[] stringArray = new String[lIIlIIIII[1]];
                            stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[15]];
                            if (!aj.llllIIIIllI(Inventory.getCount((String[])stringArray), lIIlIIIII[1])) break block39;
                        }
                        if ((!aj.llllIIIIIll(Bank.contains((int[])f.aO) ? 1 : 0) || aj.llllIIIIllI(Inventory.getCount((int[])f.aO), lIIlIIIII[1])) && !aj.llllIIIIIIl(Equipment.contains((int[])f.aO) ? 1 : 0)) break block44;
                    }
                    aj.af();
                    System.out.println(lIIIlllll[lIIlIIIII[16]]);
                    bt = lIIlIIIII[1];
                    return;
                }
                int[] nArray = new int[lIIlIIIII[1]];
                nArray[aj.lIIlIIIII[0]] = lIIlIIIII[6];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[17]], (int)lIIlIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[82]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];

                            if (2 != 2) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);

                }
                int[] nArray2 = new int[lIIlIIIII[1]];
                nArray2[aj.lIIlIIIII[0]] = lIIlIIIII[8];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[18]], (int)lIIlIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[81]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];

                            if ((0x84 ^ 0x80) <= -1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);

                }
                int[] nArray3 = new int[lIIlIIIII[1]];
                nArray3[aj.lIIlIIIII[0]] = lIIlIIIII[10];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[19]], (int)lIIlIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[80]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];

                            if (((0x99 ^ 0xA9) & ~(0x67 ^ 0x57)) > (0x58 ^ 0x5C)) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);

                }
                int[] nArray4 = new int[lIIlIIIII[1]];
                nArray4[aj.lIIlIIIII[0]] = lIIlIIIII[12];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[20]], (int)lIIlIIIII[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[79]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];

                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);

                }
                int[] nArray5 = new int[lIIlIIIII[1]];
                nArray5[aj.lIIlIIIII[0]] = lIIlIIIII[14];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[22]], (int)lIIlIIIII[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[78]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];

                            if (-1 > 1) {
                                return ((0xD5 ^ 0xC4 ^ (0x5C ^ 7)) & (0x4E ^ 0x3A ^ (0xA3 ^ 0x9D) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);

                }
                if (aj.llllIIIIIIl(Bank.contains((int[])f.aO) ? 1 : 0)) {
                    a.b(f.aO, lIIlIIIII[1]);
                }
                int[] nArray6 = new int[lIIlIIIII[1]];
                nArray6[aj.lIIlIIIII[0]] = lIIlIIIII[24];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    a.a(lIIlIIIII[24], lIIlIIIII[1]);
                }
            }
            if (aj.llllIIIIIIl(aj.ab() ? 1 : 0)) {
                if (aj.llllIIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (aj.llllIIIIIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[25]];
                    System.out.println(lIIIlllll[lIIlIIIII[26]]);
                    Inventory.getAll((int[])mf).stream().forEach(Item::drop);
                }
                if (aj.llllIIIIIll(Inventory.isFull() ? 1 : 0)) {
                    if (aj.llllIIIIIlI(Skills.getLevel((Skill)Skill.FISHING), lIIlIIIII[27])) {
                        if (aj.llllIIIIIlI(Skills.getLevel((Skill)Skill.FISHING), lIIlIIIII[7])) {
                            if (aj.llllIIIIIll(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aj.llllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(md), lIIlIIIII[7])) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[28]];
                                if (aj.llllIIIIIIl(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                                    Inventory.getFirst((int[])f.aO).interact(lIIIlllll[lIIlIIIII[29]]);
                                }
                                Movement.walkTo((WorldPoint)md);

                                Time.sleepTicks((int)lIIlIIIII[1]);

                            }
                            if (aj.llllIIIIIIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[27]];
                                if (aj.llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30])) {
                                    int[] nArray = new int[lIIlIIIII[1]];
                                    nArray[aj.lIIlIIIII[0]] = lIIlIIIII[31];
                                    lIIIlIlIllllllI = NPCs.getNearest((int[])nArray);
                                    if (aj.llllIIIIlII(lIIIlIlIllllllI) && aj.llllIIIIIIl(mc.contains((Locatable)lIIIlIlIllllllI) ? 1 : 0)) {
                                        int[] nArray7 = new int[lIIlIIIII[1]];
                                        nArray7[aj.lIIlIIIII[0]] = lIIlIIIII[31];
                                        NPCs.getNearest((int[])nArray7).interact(lIIlIIIII[0]);
                                        Time.sleepTicks((int)lIIlIIIII[2]);

                                    }
                                }
                            }
                        }
                        if (aj.llllIIIIllI(Skills.getLevel((Skill)Skill.FISHING), lIIlIIIII[7]) && aj.llllIIIIIlI(Skills.getLevel((Skill)Skill.FISHING), lIIlIIIII[27])) {
                            if (aj.llllIIIIIll(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[32]];
                                Movement.walkTo((WorldPoint)md);

                                Time.sleepTicks((int)lIIlIIIII[1]);

                            }
                            if (aj.llllIIIIIIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[33]];
                                if (aj.llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30])) {
                                    int[] nArray = new int[lIIlIIIII[1]];
                                    nArray[aj.lIIlIIIII[0]] = lIIlIIIII[31];
                                    lIIIlIlIllllllI = NPCs.getNearest((int[])nArray);
                                    if (aj.llllIIIIlII(lIIIlIlIllllllI) && aj.llllIIIIIIl(mc.contains((Locatable)lIIIlIlIllllllI) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIIlIIIII[1]];
                                        nArray8[aj.lIIlIIIII[0]] = lIIlIIIII[31];
                                        NPCs.getNearest((int[])nArray8).interact(lIIIlllll[lIIlIIIII[34]]);
                                        Time.sleepTicks((int)lIIlIIIII[2]);

                                    }
                                }
                            }
                        }
                    }
                    if (aj.llllIIIIllI(Skills.getLevel((Skill)Skill.FISHING), lIIlIIIII[27])) {
                        if (aj.llllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[35]];
                            Movement.walkTo((WorldPoint)me);

                            Time.sleepTicks((int)lIIlIIIII[1]);

                        }
                        if (aj.llllIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[36]];
                            if (aj.llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30]) && aj.llllIIIIlII(NPCs.getNearest(nPC -> {
                                int n2;
                                if (aj.llllIIIlIII(nPC.getId(), lIIlIIIII[77]) && aj.llllIIIlIIl(nPC.getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                                    n2 = lIIlIIIII[1];

                                    if ((0x72 ^ 0xE ^ (0x76 ^ 0xE)) <= 0) {
                                        return ((0xEA ^ 0xAE ^ (8 ^ 0x4A)) & (46 + 161 - 81 + 37 ^ 70 + 88 - 8 + 15 ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lIIlIIIII[0];
                                }
                                return n2 != 0;
                            }))) {
                                NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (aj.llllIIIlIII(nPC.getId(), lIIlIIIII[77]) && aj.llllIIIlIIl(nPC.getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                                        n2 = lIIlIIIII[1];

                                        if (-1 >= 2) {
                                            return false;
                                        }
                                    } else {
                                        n2 = lIIlIIIII[0];
                                    }
                                    return n2 != 0;
                                }).interact(lIIIlllll[lIIlIIIII[37]]);
                                Time.sleepTicks((int)lIIlIIIII[2]);

                            }
                        }
                    }
                }
            }
        }
    }

    static {
        aj.llllIIIIIII();
        aj.lllIlllllll();
        mc = new WorldArea(lIIlIIIII[83], lIIlIIIII[84], lIIlIIIII[29], lIIlIIIII[39], lIIlIIIII[0]);
        bv = new ArrayList<d>();
        md = new WorldPoint(lIIlIIIII[85], lIIlIIIII[86], lIIlIIIII[0]);
        me = new WorldPoint(lIIlIIIII[87], lIIlIIIII[88], lIIlIIIII[0]);
        int[] nArray = new int[lIIlIIIII[17]];
        nArray[aj.lIIlIIIII[0]] = lIIlIIIII[89];
        nArray[aj.lIIlIIIII[1]] = lIIlIIIII[90];
        nArray[aj.lIIlIIIII[2]] = lIIlIIIII[91];
        nArray[aj.lIIlIIIII[3]] = lIIlIIIII[92];
        nArray[aj.lIIlIIIII[5]] = lIIlIIIII[93];
        nArray[aj.lIIlIIIII[7]] = lIIlIIIII[94];
        nArray[aj.lIIlIIIII[9]] = lIIlIIIII[95];
        nArray[aj.lIIlIIIII[11]] = lIIlIIIII[96];
        nArray[aj.lIIlIIIII[13]] = lIIlIIIII[97];
        nArray[aj.lIIlIIIII[15]] = lIIlIIIII[98];
        nArray[aj.lIIlIIIII[16]] = lIIlIIIII[99];
        mf = nArray;
    }

    public static boolean ei() {
        int n2;
        String[] stringArray = new String[lIIlIIIII[1]];
        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[57]];
        if (aj.llllIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && (!aj.llllIIIIIll(Inventory.contains((int[])f.aO) ? 1 : 0) || aj.llllIIIIIIl(Equipment.contains((int[])f.aO) ? 1 : 0))) {
            n2 = lIIlIIIII[1];

            if (3 == 0) {
                return false;
            }
        } else {
            n2 = lIIlIIIII[0];
        }
        return n2 != 0;
    }

    private static boolean llllIIIIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIlIIIII[1]];
        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[58]];
        if (aj.llllIIIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlIIIII[1]];
            stringArray2[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[59]];
            if (aj.llllIIIIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIlIIIII[1]];
                stringArray3[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[60]];
                if (aj.llllIIIIIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIlIIIII[1]];
                    stringArray4[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[61]];
                    if (aj.llllIIIIIIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIIlIIIII[1]];
                        stringArray5[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[62]];
                        if (aj.llllIIIIIIl(Inventory.contains((String[])stringArray5) ? 1 : 0) && (!aj.llllIIIIIll(Inventory.contains((int[])f.aO) ? 1 : 0) || aj.llllIIIIIIl(Equipment.contains((int[])f.aO) ? 1 : 0))) {
                            n2 = lIIlIIIII[1];

                            if (2 > -1) return n2 != 0;
                            return ((0x28 ^ 7 ^ (0x4D ^ 0x74)) & (0xC5 ^ 0xB9 ^ (0xCF ^ 0xA5) ^ -1)) != 0;
                        }
                    }
                }
            }
        }
        n2 = lIIlIIIII[0];
        return n2 != 0;
    }

    private static boolean llllIIIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String U() {
        return lIIIlllll[lIIlIIIII[73]];
    }

    private static boolean llllIIIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIIIIlIl(int n2) {
        return n2 > 0;
    }

    private static boolean llllIIIIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int T() {
        aj.ef();
        return lIIlIIIII[72];
    }

    public static void eh() {
        block26: {
            BankLocation lIIIlIlIlllllII;
            block27: {
                block30: {
                    block29: {
                        block28: {
                            if (aj.llllIIIIIIl(bt ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[42]];
                                b.a(bv);
                                if (aj.llllIIIIIlI(bv.size(), lIIlIIIII[1])) {
                                    System.out.println(lIIIlllll[lIIlIIIII[43]]);
                                    bt = lIIlIIIII[0];
                                }
                            }
                            if (!aj.llllIIIIIll(bt ? 1 : 0)) break block26;
                            if (!aj.llllIIIIIll(aj.ei() ? 1 : 0)) break block27;
                            lIIIlIlIlllllII = BankLocation.getNearest();
                            if (aj.llllIIIIlII(lIIIlIlIlllllII) && aj.llllIIIIIll(lIIIlIlIlllllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[44]];
                                a.a(lIIIlIlIlllllII);
                            }
                            if (!aj.llllIIIIlII(lIIIlIlIlllllII) || !aj.llllIIIIIIl(lIIIlIlIlllllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                            if (aj.llllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[45]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIII[4]);

                            }
                            if (!aj.llllIIIIIIl(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[46]];
                            if (aj.llllIIIIlIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIIIII[5]);

                            }
                            int[] nArray = new int[lIIlIIIII[1]];
                            nArray[aj.lIIlIIIII[0]] = lIIlIIIII[6];
                            if (!aj.llllIIIIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                            String[] stringArray = new String[lIIlIIIII[1]];
                            stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[47]];
                            if (!aj.llllIIIIllI(Inventory.getCount((String[])stringArray), lIIlIIIII[1])) break block29;
                        }
                        if (!aj.llllIIIIIll(Bank.contains((int[])f.aO) ? 1 : 0) || !aj.llllIIIIIll(Inventory.contains((int[])f.aO) ? 1 : 0) || !aj.llllIIIIIll(Equipment.contains((int[])f.aO) ? 1 : 0)) break block30;
                    }
                    aj.af();
                    System.out.println(lIIIlllll[lIIlIIIII[48]]);
                    bt = lIIlIIIII[1];
                    return;
                }
                int[] nArray = new int[lIIlIIIII[1]];
                nArray[aj.lIIlIIIII[0]] = lIIlIIIII[6];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[49]], (int)lIIlIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[76]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];

                            if (2 == 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);

                }
                if (aj.llllIIIIIIl(Bank.contains((int[])f.aO) ? 1 : 0)) {
                    a.b(f.aO, lIIlIIIII[1]);
                }
            }
            if (aj.llllIIIIIIl(aj.ei() ? 1 : 0)) {
                if (aj.llllIIIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (aj.llllIIIIIIl(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[lIIlIIIII[1]];
                    nArray[aj.lIIlIIIII[0]] = lIIlIIIII[50];
                    if (aj.llllIIIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        lIIIlIlIlllllII = new WorldPoint(lIIlIIIII[51], lIIlIIIII[52], lIIlIIIII[0]);
                        if (aj.llllIIIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlIlIlllllII), lIIlIIIII[9])) {
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[53]];
                            Movement.walkTo((WorldPoint)lIIIlIlIlllllII);

                            Time.sleepTicks((int)lIIlIIIII[1]);

                        }
                        if (aj.llllIIIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlIlIlllllII), lIIlIIIII[13])) {
                            if (aj.llllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (aj.llllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)lIIlIIIII[2]);

                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIIIII[2]);

                                a.a(lIIlIIIII[6], lIIlIIIII[1]);
                            }
                        }
                    }
                }
                if (aj.llllIIIIIll(Inventory.isFull() ? 1 : 0)) {
                    if (aj.llllIIIIIll(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aj.llllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(md), lIIlIIIII[7])) {
                        AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[54]];
                        if (aj.llllIIIIIIl(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aO).interact(lIIIlllll[lIIlIIIII[55]]);
                        }
                        Movement.walkTo((WorldPoint)md);

                        Time.sleepTicks((int)lIIlIIIII[1]);

                    }
                    if (aj.llllIIIIIIl(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[56]];
                        if (aj.llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30])) {
                            int[] nArray = new int[lIIlIIIII[1]];
                            nArray[aj.lIIlIIIII[0]] = lIIlIIIII[31];
                            if (aj.llllIIIIlII(NPCs.getNearest((int[])nArray))) {
                                int[] nArray2 = new int[lIIlIIIII[1]];
                                nArray2[aj.lIIlIIIII[0]] = lIIlIIIII[31];
                                NPCs.getNearest((int[])nArray2).interact(lIIlIIIII[0]);
                                Time.sleepTicks((int)lIIlIIIII[7]);

                            }
                        }
                    }
                }
                if (aj.llllIIIIIIl(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[lIIlIIIII[1]];
                    nArray[aj.lIIlIIIII[0]] = lIIlIIIII[50];
                    if (aj.llllIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIlIIIII[1]];
                        nArray3[aj.lIIlIIIII[0]] = lIIlIIIII[50];
                        Inventory.getAll((int[])nArray3).stream().forEach(Item::drop);
                    }
                }
            }
        }
    }

    private static boolean llllIIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    public static void eg() {
        if (aj.llllIIIIIIl(Inventory.isFull() ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[38]];
            System.out.println(lIIIlllll[lIIlIIIII[39]]);
            Inventory.getAll((int[])mf).stream().forEach(Item::drop);
        }
        if (aj.llllIIIIIll(Inventory.isFull() ? 1 : 0) && aj.llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30])) {
            String[] stringArray = new String[lIIlIIIII[1]];
            stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[40]];
            NPCs.getNearest((String[])stringArray).interact(lIIIlllll[lIIlIIIII[41]]);
            Time.sleepTicks((int)lIIlIIIII[2]);

        }
    }

        return String.valueOf(lIIIlIlIlIIllIl);
    }

    private static boolean llllIIIIlII(Object object) {
        return object != null;
    }

    @Override
    public boolean S() {
        return lIIlIIIII[0];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (aj.llllIIIIllI(Skills.getLevel((Skill)Skill.FISHING), lIIlIIIII[74])) {
            bl = lIIlIIIII[1];

            if (((0x44 ^ 0x18) & ~(0xF3 ^ 0xAF)) != 0) {
                return false;
            }
        } else {
            bl = lIIlIIIII[0];
        }
        return bl;
    }
}

