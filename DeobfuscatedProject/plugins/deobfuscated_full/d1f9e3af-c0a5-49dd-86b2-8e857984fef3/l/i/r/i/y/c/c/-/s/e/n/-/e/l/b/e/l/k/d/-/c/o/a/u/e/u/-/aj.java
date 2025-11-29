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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
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

public class aj
implements W {
    public static /* synthetic */ WorldArea mc;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ WorldPoint me;
    private static /* synthetic */ WorldPoint md;
    private static /* synthetic */ int[] mf;
    private static /* synthetic */ int[] lIIlIIIII;
    private static /* synthetic */ String[] lIIIlllll;

    private static void lllIlllllll() {
        lIIIlllll = new String[lIIlIIIII[100]];
        aj.lIIIlllll[aj.lIIlIIIII[0]] = aj."Buying items";
        aj.lIIIlllll[aj.lIIlIIIII[1]] = aj."Finished buying items, switching back to fishing";
        aj.lIIIlllll[aj.lIIlIIIII[2]] = aj."Navigating to bank";
        aj.lIIIlllll[aj.lIIlIIIII[3]] = aj."Opening bank";
        aj.lIIIlllll[aj.lIIlIIIII[5]] = aj."Handling banking";
        aj.lIIIlllll[aj.lIIlIIIII[7]] = aj."Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[9]] = aj."Fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[11]] = aj."Fly fishing rod rod";
        aj.lIIIlllll[aj.lIIlIIIII[13]] = aj."Feather";
        aj.lIIIlllll[aj.lIIlIIIII[15]] = aj."Fishing bait";
        aj.lIIIlllll[aj.lIIlIIIII[16]] = aj."We are missing supplies, switching to BUYING";
        aj.lIIIlllll[aj.lIIlIIIII[17]] = aj."Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[18]] = aj."Fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[19]] = aj."Fly fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[20]] = aj."Feather";
        aj.lIIIlllll[aj.lIIlIIIII[22]] = aj."Fishing bait";
        aj.lIIIlllll[aj.lIIlIIIII[25]] = aj."Dropping logs";
        aj.lIIIlllll[aj.lIIlIIIII[26]] = aj."Dropping logs";
        aj.lIIIlllll[aj.lIIlIIIII[28]] = aj."Nav to small fish spot";
        aj.lIIIlllll[aj.lIIlIIIII[29]] = aj."Wear";
        aj.lIIIlllll[aj.lIIlIIIII[27]] = aj."Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[32]] = aj."Nav to small fish spot";
        aj.lIIIlllll[aj.lIIlIIIII[33]] = aj."Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[34]] = aj."Bait";
        aj.lIIIlllll[aj.lIIlIIIII[35]] = aj."Nav to fly fish spot";
        aj.lIIIlllll[aj.lIIlIIIII[36]] = aj."Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[37]] = aj."Lure";
        aj.lIIIlllll[aj.lIIlIIIII[38]] = aj."Dropping logs";
        aj.lIIIlllll[aj.lIIlIIIII[39]] = aj."Dropping logs";
        aj.lIIIlllll[aj.lIIlIIIII[40]] = aj."Fishing spot";
        aj.lIIIlllll[aj.lIIlIIIII[41]] = aj."Use-rod";
        aj.lIIIlllll[aj.lIIlIIIII[42]] = aj."Buying items";
        aj.lIIIlllll[aj.lIIlIIIII[43]] = aj."Finished buying items, switching back to fishing";
        aj.lIIIlllll[aj.lIIlIIIII[44]] = aj."Navigating to bank";
        aj.lIIIlllll[aj.lIIlIIIII[45]] = aj."Opening bank";
        aj.lIIIlllll[aj.lIIlIIIII[46]] = aj."Handling banking";
        aj.lIIIlllll[aj.lIIlIIIII[47]] = aj."Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[48]] = aj."We are missing supplies, switching to BUYING";
        aj.lIIIlllll[aj.lIIlIIIII[49]] = aj."Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[53]] = aj."Nav to bank";
        aj.lIIIlllll[aj.lIIlIIIII[54]] = aj."Nav to small fish spot";
        aj.lIIIlllll[aj.lIIlIIIII[55]] = aj."Wear";
        aj.lIIIlllll[aj.lIIlIIIII[56]] = aj."Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[57]] = aj."Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[58]] = aj."Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[59]] = aj."Fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[60]] = aj."Fly fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[61]] = aj."Feather";
        aj.lIIIlllll[aj.lIIlIIIII[62]] = aj."Fishing bait";
        aj.lIIIlllll[aj.lIIlIIIII[73]] = aj."Fishing";
        aj.lIIIlllll[aj.lIIlIIIII[75]] = aj."ring of wealth (";
        aj.lIIIlllll[aj.lIIlIIIII[76]] = aj."Small fishing net";
        aj.lIIIlllll[aj.lIIlIIIII[78]] = aj."Fishing bait";
        aj.lIIIlllll[aj.lIIlIIIII[79]] = aj."Feather";
        aj.lIIIlllll[aj.lIIlIIIII[80]] = aj."Fly fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[81]] = aj."Fishing rod";
        aj.lIIIlllll[aj.lIIlIIIII[82]] = aj."Small fishing net";
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
            d d2 = new d(lIIlIIIII[6], lIIlIIIII[1], lIIlIIIII[4]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIlIIIII[1]];
        nArray2[aj.lIIlIIIII[0]] = lIIlIIIII[8];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIIlIlIllllIIl = new d(lIIlIIIII[8], lIIlIIIII[1], lIIlIIIII[4]);
            bv.add((d)lIIIlIlIllllIIl);
            0;
        }
        int[] nArray3 = new int[lIIlIIIII[1]];
        nArray3[aj.lIIlIIIII[0]] = lIIlIIIII[10];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIIlIlIllllIIl = new d(lIIlIIIII[10], lIIlIIIII[1], lIIlIIIII[63]);
            bv.add((d)lIIIlIlIllllIIl);
            0;
        }
        int[] nArray4 = new int[lIIlIIIII[1]];
        nArray4[aj.lIIlIIIII[0]] = lIIlIIIII[14];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIIlIlIllllIIl = new d(lIIlIIIII[14], lIIlIIIII[64], lIIlIIIII[65]);
            bv.add((d)lIIIlIlIllllIIl);
            0;
        }
        int[] nArray5 = new int[lIIlIIIII[1]];
        nArray5[aj.lIIlIIIII[0]] = lIIlIIIII[12];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIIIlIlIllllIIl = new d(lIIlIIIII[12], lIIlIIIII[66], lIIlIIIII[7]);
            bv.add((d)lIIIlIlIllllIIl);
            0;
        }
        int[] nArray6 = new int[lIIlIIIII[1]];
        nArray6[aj.lIIlIIIII[0]] = lIIlIIIII[67];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIIIlIlIllllIIl = new d(lIIlIIIII[67], lIIlIIIII[1], lIIlIIIII[4]);
            bv.add((d)lIIIlIlIllllIIl);
            0;
        }
        int[] nArray7 = new int[lIIlIIIII[1]];
        nArray7[aj.lIIlIIIII[0]] = lIIlIIIII[24];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIIIlIlIllllIIl = new d(lIIlIIIII[24], lIIlIIIII[16], lIIlIIIII[4]);
            bv.add((d)lIIIlIlIllllIIl);
            0;
        }
        if (aj.llllIIIIIll(Bank.contains((Predicate)(lIIIlIlIllllIIl = item -> item.getName().toLowerCase().contains(lIIIlllll[lIIlIIIII[75]]))) ? 1 : 0)) {
            lIIIlIlIllllIII = new d(lIIlIIIII[68], lIIlIIIII[7], lIIlIIIII[69]);
            bv.add(lIIIlIlIllllIII);
            0;
        }
        int[] nArray8 = new int[lIIlIIIII[1]];
        nArray8[aj.lIIlIIIII[0]] = lIIlIIIII[70];
        if (aj.llllIIIIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIIIlIlIllllIII = new d(lIIlIIIII[70], lIIlIIIII[54], lIIlIIIII[71]);
            bv.add(lIIIlIlIllllIII);
            0;
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
                                                0;
                                            }
                                            if (!aj.llllIIIIIIl(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[5]];
                                            if (aj.llllIIIIlIl(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIlIIIII[5]);
                                                0;
                                            }
                                            if (aj.llllIIIIlIl(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIlIIIII[2]);
                                                0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[82]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];
                            0;
                            if (2 != 2) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);
                    0;
                }
                int[] nArray2 = new int[lIIlIIIII[1]];
                nArray2[aj.lIIlIIIII[0]] = lIIlIIIII[8];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[18]], (int)lIIlIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[81]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];
                            0;
                            if ((0x84 ^ 0x80) <= -1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);
                    0;
                }
                int[] nArray3 = new int[lIIlIIIII[1]];
                nArray3[aj.lIIlIIIII[0]] = lIIlIIIII[10];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[19]], (int)lIIlIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[80]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];
                            0;
                            if (((0x99 ^ 0xA9) & ~(0x67 ^ 0x57)) > (0x58 ^ 0x5C)) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);
                    0;
                }
                int[] nArray4 = new int[lIIlIIIII[1]];
                nArray4[aj.lIIlIIIII[0]] = lIIlIIIII[12];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[20]], (int)lIIlIIIII[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[79]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];
                            0;
                            if (-3 > 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);
                    0;
                }
                int[] nArray5 = new int[lIIlIIIII[1]];
                nArray5[aj.lIIlIIIII[0]] = lIIlIIIII[14];
                if (aj.llllIIIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)lIIIlllll[lIIlIIIII[22]], (int)lIIlIIIII[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[78]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];
                            0;
                            if (-1 > 1) {
                                return ((0xD5 ^ 0xC4 ^ (0x5C ^ 7)) & (0x4E ^ 0x3A ^ (0xA3 ^ 0x9D) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);
                    0;
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
                                0;
                                Time.sleepTicks((int)lIIlIIIII[1]);
                                0;
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
                                        0;
                                    }
                                }
                            }
                        }
                        if (aj.llllIIIIllI(Skills.getLevel((Skill)Skill.FISHING), lIIlIIIII[7]) && aj.llllIIIIIlI(Skills.getLevel((Skill)Skill.FISHING), lIIlIIIII[27])) {
                            if (aj.llllIIIIIll(mc.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[32]];
                                Movement.walkTo((WorldPoint)md);
                                0;
                                Time.sleepTicks((int)lIIlIIIII[1]);
                                0;
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
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (aj.llllIIIIllI(Skills.getLevel((Skill)Skill.FISHING), lIIlIIIII[27])) {
                        if (aj.llllIIIIlll(Players.getLocal().getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[35]];
                            Movement.walkTo((WorldPoint)me);
                            0;
                            Time.sleepTicks((int)lIIlIIIII[1]);
                            0;
                        }
                        if (aj.llllIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[36]];
                            if (aj.llllIIIlIII(Players.getLocal().getAnimation(), lIIlIIIII[30]) && aj.llllIIIIlII(NPCs.getNearest(nPC -> {
                                int n2;
                                if (aj.llllIIIlIII(nPC.getId(), lIIlIIIII[77]) && aj.llllIIIlIIl(nPC.getWorldLocation().distanceTo(me), lIIlIIIII[22])) {
                                    n2 = lIIlIIIII[1];
                                    0;
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
                                        0;
                                        if (-1 >= 2) {
                                            return false;
                                        }
                                    } else {
                                        n2 = lIIlIIIII[0];
                                    }
                                    return n2 != 0;
                                }).interact(lIIIlllll[lIIlIIIII[37]]);
                                Time.sleepTicks((int)lIIlIIIII[2]);
                                0;
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
            0;
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
                            0;
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

    private static void llllIIIIIII() {
        lIIlIIIII = new int[101];
        aj.lIIlIIIII[0] = (60 + 31 - -30 + 27 ^ 107 + 110 - 80 + 27) & (0x47 ^ 0x13 ^ (0xDC ^ 0xB8) ^ -1);
        aj.lIIlIIIII[1] = 1;
        aj.lIIlIIIII[2] = 2;
        aj.lIIlIIIII[3] = 3;
        aj.lIIlIIIII[4] = -(0xFFFFF9F7 & 0x2E6F) & (0xFFFFFBFF & 0x3FEE);
        aj.lIIlIIIII[5] = 41 + 101 - 111 + 101 ^ 113 + 61 - 137 + 91;
        aj.lIIlIIIII[6] = 0xFFFFF5AF & 0xB7F;
        aj.lIIlIIIII[7] = 0x54 ^ 0x51;
        aj.lIIlIIIII[8] = 0xFFFFE133 & 0x1FFF;
        aj.lIIlIIIII[9] = 0x36 ^ 0x30;
        aj.lIIlIIIII[10] = -(0xFFFFEE0B & 0x35FD) & (0xFFFFA53D & Short.MAX_VALUE);
        aj.lIIlIIIII[11] = 0xAF ^ 0xA8;
        aj.lIIlIIIII[12] = -(0xFFFFFFFF & 0x5CC5) & (0xFFFFFFFE & 0x5DFF);
        aj.lIIlIIIII[13] = 4 + 113 - 88 + 149 ^ 163 + 57 - 87 + 53;
        aj.lIIlIIIII[14] = -(0xFFFFDEFF & 0x27C7) & (0xFFFFC7FF & 0x3FFF);
        aj.lIIlIIIII[15] = 0x34 ^ 0x73 ^ (0x79 ^ 0x37);
        aj.lIIlIIIII[16] = 0x50 ^ 0x5A;
        aj.lIIlIIIII[17] = 0x55 ^ 0x3D ^ (0x5D ^ 0x3E);
        aj.lIIlIIIII[18] = 4 ^ 8;
        aj.lIIlIIIII[19] = 0x94 ^ 0x99;
        aj.lIIlIIIII[20] = 0x9B ^ 0x95;
        aj.lIIlIIIII[21] = -(0xFFFFFB12 & 0x6CEF) & (0xFFFFFEED & 0x1EFB3);
        aj.lIIlIIIII[22] = 50 + 21 - 70 + 129 ^ 132 + 111 - 132 + 30;
        aj.lIIlIIIII[23] = 0xFFFFE7EB & 0x1BFC;
        aj.lIIlIIIII[24] = 0xFFFF9F69 & 0x7FDE;
        aj.lIIlIIIII[25] = 0xB8 ^ 0xA8;
        aj.lIIlIIIII[26] = 0x65 ^ 0x56 ^ (0x62 ^ 0x40);
        aj.lIIlIIIII[27] = 0xE3 ^ 0xC5 ^ (0x78 ^ 0x4A);
        aj.lIIlIIIII[28] = 0x1C ^ 0x5B ^ (0xDB ^ 0x8E);
        aj.lIIlIIIII[29] = 0x2C ^ 0x3F;
        aj.lIIlIIIII[30] = -1;
        aj.lIIlIIIII[31] = 0xFFFFFF18 & 0x6EF;
        aj.lIIlIIIII[32] = 5 ^ 0x10;
        aj.lIIlIIIII[33] = 0x5D ^ 0x2D ^ (0xD5 ^ 0xB3);
        aj.lIIlIIIII[34] = 0xAB ^ 0xBC;
        aj.lIIlIIIII[35] = 0x3B ^ 0x70 ^ (0x5A ^ 9);
        aj.lIIlIIIII[36] = 154 + 58 - 117 + 121 ^ 23 + 151 - 159 + 178;
        aj.lIIlIIIII[37] = 0x40 ^ 0x5A;
        aj.lIIlIIIII[38] = 0x52 ^ 0x21 ^ (0x1D ^ 0x75);
        aj.lIIlIIIII[39] = 5 + 157 - 65 + 64 ^ 99 + 21 - 60 + 129;
        aj.lIIlIIIII[40] = 0x74 ^ 0x69;
        aj.lIIlIIIII[41] = 155 + 21 - 49 + 41 ^ 176 + 68 - 204 + 142;
        aj.lIIlIIIII[42] = 0x9B ^ 0x84;
        aj.lIIlIIIII[43] = 0x6E ^ 0x39 ^ (0xC4 ^ 0xB3);
        aj.lIIlIIIII[44] = 0x64 ^ 0x6D ^ (0x10 ^ 0x38);
        aj.lIIlIIIII[45] = 53 + 6 - 40 + 132 ^ 97 + 154 - 96 + 26;
        aj.lIIlIIIII[46] = 0x39 ^ 0x1A;
        aj.lIIlIIIII[47] = 0x6D ^ 0x49;
        aj.lIIlIIIII[48] = 14 + 40 - -66 + 23 ^ 86 + 128 - 121 + 77;
        aj.lIIlIIIII[49] = 0x7E ^ 0x58;
        aj.lIIlIIIII[50] = 0xFFFFDB65 & 0x25DB;
        aj.lIIlIIIII[51] = 0xFFFFB9FF & 0x4FE7;
        aj.lIIlIIIII[52] = 0xFFFFADF7 & 0x5FFD;
        aj.lIIlIIIII[53] = 0x17 ^ 0x7A ^ (0xF1 ^ 0xBB);
        aj.lIIlIIIII[54] = 0x27 ^ 0xF;
        aj.lIIlIIIII[55] = 0x9E ^ 0xB7;
        aj.lIIlIIIII[56] = 0x18 ^ 9 ^ (0x5C ^ 0x67);
        aj.lIIlIIIII[57] = 127 + 124 - 223 + 105 ^ 171 + 127 - 204 + 80;
        aj.lIIlIIIII[58] = 0x94 ^ 0xA6 ^ (0xB9 ^ 0xA7);
        aj.lIIlIIIII[59] = 0x2E ^ 3;
        aj.lIIlIIIII[60] = 222 + 148 - 244 + 106 ^ 128 + 172 - 129 + 27;
        aj.lIIlIIIII[61] = 0x69 ^ 0x4E ^ (2 ^ 0xA);
        aj.lIIlIIIII[62] = 0x5A ^ 0x22 ^ (0xC4 ^ 0x8C);
        aj.lIIlIIIII[63] = -(0xFFFFCCFF & 0x7F97) & (0xFFFFFFFE & 0x6FBF);
        aj.lIIlIIIII[64] = 0xFFFF913F & 0x6FEC;
        aj.lIIlIIIII[65] = -(0xFFFFCFAB & 0x3C57) & (0xFFFF9FF7 & 0x6DFE);
        aj.lIIlIIIII[66] = -(0xFFFF8E77 & 0x7DBD) & (0xFFFFFEFE & 0x3FFD);
        aj.lIIlIIIII[67] = -(0xFFFFF6FB & 0x4967) & (0xFFFFDFFF & 0x6F6F);
        aj.lIIlIIIII[68] = -(0xFFFFFC81 & 0x537F) & (0xFFFFFEDE & 0x7FED);
        aj.lIIlIIIII[69] = -(0x35 ^ 0x26) & (0xFFFFE5BB & 0x7BFE);
        aj.lIIlIIIII[70] = -(104 + 125 - 217 + 149) & (0xFFFFDFEF & 0x3FF7);
        aj.lIIlIIIII[71] = -(0xFFFFF8D4 & 0x7F7F) & (0xFFFFFFD7 & 0x7BFF);
        aj.lIIlIIIII[72] = 0x72 ^ 0x16;
        aj.lIIlIIIII[73] = 0xB1 ^ 0x80;
        aj.lIIlIIIII[74] = 0x51 ^ 0x32;
        aj.lIIlIIIII[75] = 0xDE ^ 0xC0 ^ (0x31 ^ 0x1D);
        aj.lIIlIIIII[76] = 0x89 ^ 0xBA;
        aj.lIIlIIIII[77] = -(0xFFFFB53F & 0x5AC1) & (0xFFFFF5E7 & 0x1FFC);
        aj.lIIlIIIII[78] = 0xC6 ^ 0xAE ^ (0x2E ^ 0x72);
        aj.lIIlIIIII[79] = 0x69 ^ 0x5C;
        aj.lIIlIIIII[80] = 3 ^ 0x35;
        aj.lIIlIIIII[81] = 0xE ^ 0x74 ^ (0x30 ^ 0x7D);
        aj.lIIlIIIII[82] = 0x40 ^ 0x78;
        aj.lIIlIIIII[83] = 0xFFFFCBFA & 0x3DCF;
        aj.lIIlIIIII[84] = -(0xFFFFEAEB & 0x371F) & (0xFFFFEFEE & 0x3FFF);
        aj.lIIlIIIII[85] = -(0xFFFFD6A3 & 0x2F7F) & (0xFFFFBFF7 & 0x4FFF);
        aj.lIIlIIIII[86] = 0xFFFFAFF5 & 0x5DFE;
        aj.lIIlIIIII[87] = -(0xFFFF99DB & 0x763F) & (0xFFFF9DFE & 0x7BFF);
        aj.lIIlIIIII[88] = 0xFFFFADF4 & 0x5F5F;
        aj.lIIlIIIII[89] = 0xFFFFBFE7 & 0x45FF;
        aj.lIIlIIIII[90] = 0xFFFFBDF5 & 0x47FB;
        aj.lIIlIIIII[91] = 0xFFFFFDFF & 0x7EF;
        aj.lIIlIIIII[92] = -(0xFFFFFE47 & 0x5DF9) & (0xFFFFDFFD & 0x7D7F);
        aj.lIIlIIIII[93] = -(0xFFFFFD79 & 0x697) & (0xFFFFBFF7 & 0x455F);
        aj.lIIlIIIII[94] = -(0xFFFFFAFF & 0x3F95) & (0xFFFFFBDF & 0x3FFF);
        aj.lIIlIIIII[95] = -(0xFFFFFDEF & 0x7EB5) & (0xFFFFFDFD & Short.MAX_VALUE);
        aj.lIIlIIIII[96] = -(0xFFFFDF95 & 0x7E7B) & (0xFFFFDFDF & 0x7F7F);
        aj.lIIlIIIII[97] = -(0xFFFFF7FF & 0x1B1E) & (0xFFFFFFDF & 0x3F7F);
        aj.lIIlIIIII[98] = 0xFFFFBCED & 0x6F56;
        aj.lIIlIIIII[99] = -(0xC0 ^ 0xC5) & (0xFFFFBF64 & 0x6CDF);
        aj.lIIlIIIII[100] = 0xF ^ 0x7B ^ (0x5B ^ 0x16);
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
                                0;
                            }
                            if (!aj.llllIIIIIIl(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderEasyClues.c = lIIIlllll[lIIlIIIII[46]];
                            if (aj.llllIIIIlIl(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIIIII[5]);
                                0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIIIII[1]];
                        stringArray[aj.lIIlIIIII[0]] = lIIIlllll[lIIlIIIII[76]];
                        if (aj.llllIIIIlIl(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIIIII[1];
                            0;
                            if (2 == 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIIIII[4]);
                    0;
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
                            0;
                            Time.sleepTicks((int)lIIlIIIII[1]);
                            0;
                        }
                        if (aj.llllIIIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIIIlIlIlllllII), lIIlIIIII[13])) {
                            if (aj.llllIIIIIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (aj.llllIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)lIIlIIIII[2]);
                                0;
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIIIII[2]);
                                0;
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
                        0;
                        Time.sleepTicks((int)lIIlIIIII[1]);
                        0;
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
                                0;
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

    private static String lllIlllIIII(String lIIIlIlIllIlIlI, String lIIIlIlIllIlIIl) {
        try {
            SecretKeySpec lIIIlIlIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIlIllIlllI = Cipher.getInstance("Blowfish");
            lIIIlIlIllIlllI.init(lIIlIIIII[2], lIIIlIlIllIllll);
            return new String(lIIIlIlIllIlllI.doFinal(Base64.getDecoder().decode(lIIIlIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIlIllIllIl) {
            lIIIlIlIllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIIll(int n2) {
        return n2 == 0;
    }

    private static String lllIllIllll(String lIIIlIlIlIlllIl, String lIIIlIlIlIllllI) {
        try {
            SecretKeySpec lIIIlIlIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIlIlIllllI.getBytes(StandardCharsets.UTF_8)), lIIlIIIII[13]), "DES");
            Cipher lIIIlIlIllIIIIl = Cipher.getInstance("DES");
            lIIIlIlIllIIIIl.init(lIIlIIIII[2], lIIIlIlIllIIIlI);
            return new String(lIIIlIlIllIIIIl.doFinal(Base64.getDecoder().decode(lIIIlIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIlIllIIIII) {
            lIIIlIlIllIIIII.printStackTrace();
            return null;
        }
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
            0;
        }
    }

    private static String lllIlllIIIl(String lIIIlIlIlIIllll, String lIIIlIlIlIIlllI) {
        lIIIlIlIlIIllll = new String(Base64.getDecoder().decode(lIIIlIlIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIlIlIIllIl = new StringBuilder();
        char[] lIIIlIlIlIIllII = lIIIlIlIlIIlllI.toCharArray();
        int lIIIlIlIlIIlIll = lIIlIIIII[0];
        char[] lIIIlIlIlIIIlIl = lIIIlIlIlIIllll.toCharArray();
        int lIIIlIlIlIIIlII = lIIIlIlIlIIIlIl.length;
        int lIIIlIlIlIIIIll = lIIlIIIII[0];
        while (aj.llllIIIIIlI(lIIIlIlIlIIIIll, lIIIlIlIlIIIlII)) {
            char lIIIlIlIlIlIIII = lIIIlIlIlIIIlIl[lIIIlIlIlIIIIll];
            lIIIlIlIlIIllIl.append((char)(lIIIlIlIlIlIIII ^ lIIIlIlIlIIllII[lIIIlIlIlIIlIll % lIIIlIlIlIIllII.length]));
            0;
            ++lIIIlIlIlIIlIll;
            ++lIIIlIlIlIIIIll;
            0;
            if (-1 <= 0) continue;
            return null;
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
            0;
            if (((0x44 ^ 0x18) & ~(0xF3 ^ 0xAF)) != 0) {
                return false;
            }
        } else {
            bl = lIIlIIIII[0];
        }
        return bl;
    }
}

