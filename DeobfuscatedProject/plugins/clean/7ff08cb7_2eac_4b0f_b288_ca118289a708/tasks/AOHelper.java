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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.AHelper;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.BHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.DHelper;
import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.FHelper;
import gg.squire.account.AccBuilderGWD;
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

public class AOHelper
implements ab {
    public static  boolean bv;
    
    public static  WorldArea mv;
    private static  WorldPoint mw;
    private static  WorldPoint mx;

    public static  List<d> bx;

    public static void eA() {
        block26: {
            BankLocation llllIIlIlllII;
            block27: {
                block30: {
                    block29: {
                        block28: {
                            if (ao.llIIIIIlllll(bv ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[42]];
                                b.a(bx);
                                if (ao.llIIIIlIIIII(bx.size(), lllIIlIIl[1])) {
                                    System.out.println(lllIIIlll[lllIIlIIl[43]]);
                                    bv = lllIIlIIl[0];
                                }
                            }
                            if (!ao.llIIIIlIIIIl(bv ? 1 : 0)) break block26;
                            if (!ao.llIIIIlIIIIl(ao.eB() ? 1 : 0)) break block27;
                            llllIIlIlllII = BankLocation.getNearest();
                            if (ao.llIIIIlIIIlI(llllIIlIlllII) && ao.llIIIIlIIIIl(llllIIlIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[44]];
                                a.a(llllIIlIlllII);
                            }
                            if (!ao.llIIIIlIIIlI(llllIIlIlllII) || !ao.llIIIIIlllll(llllIIlIlllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                            if (ao.llIIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[45]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlIIl[4]);

                            }
                            if (!ao.llIIIIIlllll(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[46]];
                            if (ao.llIIIIlIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIlIIl[5]);

                            }
                            int[] nArray = new int[lllIIlIIl[1]];
                            nArray[ao.lllIIlIIl[0]] = lllIIlIIl[6];
                            if (!ao.llIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                            String[] stringArray = new String[lllIIlIIl[1]];
                            stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[47]];
                            if (!ao.llIIIIlIIlII(Inventory.getCount((String[])stringArray), lllIIlIIl[1])) break block29;
                        }
                        if (!ao.llIIIIlIIIIl(Bank.contains((int[])f.aV) ? 1 : 0) || !ao.llIIIIlIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) || !ao.llIIIIlIIIIl(Equipment.contains((int[])f.aV) ? 1 : 0)) break block30;
                    }
                    ao.Q();
                    System.out.println(lllIIIlll[lllIIlIIl[48]]);
                    bv = lllIIlIIl[1];
                    return;
                }
                int[] nArray = new int[lllIIlIIl[1]];
                nArray[ao.lllIIlIIl[0]] = lllIIlIIl[6];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[49]], (int)lllIIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[76]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];

                            if (3 <= ((0xC ^ 0x3D ^ (0x54 ^ 0x40) & ~(0xBD ^ 0xA9)) & (12 + 20 - 18 + 150 ^ 121 + 14 - 23 + 37 ^ -1))) {
                                return ((0x63 ^ 0x59 ^ (0x36 ^ 0x58)) & (0xFF ^ 0xB3 ^ (0xD ^ 0x15) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);

                }
                if (ao.llIIIIIlllll(Bank.contains((int[])f.aV) ? 1 : 0)) {
                    a.b(f.aV, lllIIlIIl[1]);
                }
            }
            if (ao.llIIIIIlllll(ao.eB() ? 1 : 0)) {
                if (ao.llIIIIIlllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ao.llIIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[lllIIlIIl[1]];
                    nArray[ao.lllIIlIIl[0]] = lllIIlIIl[50];
                    if (ao.llIIIIlIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        llllIIlIlllII = new WorldPoint(lllIIlIIl[51], lllIIlIIl[52], lllIIlIIl[0]);
                        if (ao.llIIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIIlIlllII), lllIIlIIl[9])) {
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[53]];
                            Movement.walkTo((WorldPoint)llllIIlIlllII);

                            Time.sleepTicks((int)lllIIlIIl[1]);

                        }
                        if (ao.llIIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIIlIlllII), lllIIlIIl[13])) {
                            if (ao.llIIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (ao.llIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)lllIIlIIl[2]);

                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIlIIl[2]);

                                a.a(lllIIlIIl[6], lllIIlIIl[1]);
                            }
                        }
                    }
                }
                if (ao.llIIIIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                    if (ao.llIIIIlIIIIl(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ao.llIIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(mw), lllIIlIIl[7])) {
                        AccBuilderGWD.c = lllIIIlll[lllIIlIIl[54]];
                        if (ao.llIIIIIlllll(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aV).interact(lllIIIlll[lllIIlIIl[55]]);
                        }
                        Movement.walkTo((WorldPoint)mw);

                        Time.sleepTicks((int)lllIIlIIl[1]);

                    }
                    if (ao.llIIIIIlllll(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllIIIlll[lllIIlIIl[56]];
                        if (ao.llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30])) {
                            int[] nArray = new int[lllIIlIIl[1]];
                            nArray[ao.lllIIlIIl[0]] = lllIIlIIl[31];
                            if (ao.llIIIIlIIIlI(NPCs.getNearest((int[])nArray))) {
                                int[] nArray2 = new int[lllIIlIIl[1]];
                                nArray2[ao.lllIIlIIl[0]] = lllIIlIIl[31];
                                NPCs.getNearest((int[])nArray2).interact(lllIIlIIl[0]);
                                Time.sleepTicks((int)lllIIlIIl[7]);

                            }
                        }
                    }
                }
                if (ao.llIIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[lllIIlIIl[1]];
                    nArray[ao.lllIIlIIl[0]] = lllIIlIIl[50];
                    if (ao.llIIIIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lllIIlIIl[1]];
                        nArray3[ao.lllIIlIIl[0]] = lllIIlIIl[50];
                        Inventory.getAll((int[])nArray3).stream().forEach(Item::drop);
                    }
                }
            }
        }
    }

    private static boolean llIIIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ao.llIIIIIllllI();
        ao.llIIIIIlllIl();
        mv = new WorldArea(lllIIlIIl[83], lllIIlIIl[84], lllIIlIIl[29], lllIIlIIl[39], lllIIlIIl[0]);
        bx = new ArrayList<d>();
        mw = new WorldPoint(lllIIlIIl[85], lllIIlIIl[86], lllIIlIIl[0]);
        mx = new WorldPoint(lllIIlIIl[87], lllIIlIIl[88], lllIIlIIl[0]);
        int[] nArray = new int[lllIIlIIl[17]];
        nArray[ao.lllIIlIIl[0]] = lllIIlIIl[89];
        nArray[ao.lllIIlIIl[1]] = lllIIlIIl[90];
        nArray[ao.lllIIlIIl[2]] = lllIIlIIl[91];
        nArray[ao.lllIIlIIl[3]] = lllIIlIIl[92];
        nArray[ao.lllIIlIIl[5]] = lllIIlIIl[93];
        nArray[ao.lllIIlIIl[7]] = lllIIlIIl[94];
        nArray[ao.lllIIlIIl[9]] = lllIIlIIl[95];
        nArray[ao.lllIIlIIl[11]] = lllIIlIIl[96];
        nArray[ao.lllIIlIIl[13]] = lllIIlIIl[97];
        nArray[ao.lllIIlIIl[15]] = lllIIlIIl[98];
        nArray[ao.lllIIlIIl[16]] = lllIIlIIl[99];
        my = nArray;
    }

        return String.valueOf(llllIIlIIIlll);
    }

    private static boolean llIIIIlIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int af() {
        ao.ey();
        return lllIIlIIl[72];
    }

    public static boolean eB() {
        int n2;
        String[] stringArray = new String[lllIIlIIl[1]];
        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[57]];
        if (ao.llIIIIIlllll(Inventory.contains((String[])stringArray) ? 1 : 0) && (!ao.llIIIIlIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) || ao.llIIIIIlllll(Equipment.contains((int[])f.aV) ? 1 : 0))) {
            n2 = lllIIlIIl[1];

            if (-1 != -1) {
                return (1 & ~1) != 0;
            }
        } else {
            n2 = lllIIlIIl[0];
        }
        return n2 != 0;
    }

    @Override
    public String ag() {
        return lllIIIlll[lllIIlIIl[73]];
    }

    public static void ez() {
        if (ao.llIIIIIlllll(Inventory.isFull() ? 1 : 0)) {
            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[38]];
            System.out.println(lllIIIlll[lllIIlIIl[39]]);
            Inventory.getAll((int[])my).stream().forEach(Item::drop);
        }
        if (ao.llIIIIlIIIIl(Inventory.isFull() ? 1 : 0) && ao.llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30])) {
            String[] stringArray = new String[lllIIlIIl[1]];
            stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[40]];
            NPCs.getNearest((String[])stringArray).interact(lllIIIlll[lllIIlIIl[41]]);
            Time.sleepTicks((int)lllIIlIIl[2]);

        }
    }

    private static boolean llIIIIlIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIIIlllIl() {
        lllIIIlll = new String[lllIIlIIl[100]];
        ao.lllIIIlll[ao.lllIIlIIl[0]] = "Buying items";
        ao.lllIIIlll[ao.lllIIlIIl[1]] = "Finished buying items, switching back to fishing";
        ao.lllIIIlll[ao.lllIIlIIl[2]] = "Navigating to bank";
        ao.lllIIIlll[ao.lllIIlIIl[3]] = "Opening bank";
        ao.lllIIIlll[ao.lllIIlIIl[5]] = "Handling banking";
        ao.lllIIIlll[ao.lllIIlIIl[7]] = "Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[9]] = "Fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[11]] = "Fly fishing rod rod";
        ao.lllIIIlll[ao.lllIIlIIl[13]] = "Feather";
        ao.lllIIIlll[ao.lllIIlIIl[15]] = "Fishing bait";
        ao.lllIIIlll[ao.lllIIlIIl[16]] = "We are missing supplies, switching to BUYING";
        ao.lllIIIlll[ao.lllIIlIIl[17]] = "Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[18]] = "Fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[19]] = "Fly fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[20]] = "Feather";
        ao.lllIIIlll[ao.lllIIlIIl[22]] = "Fishing bait";
        ao.lllIIIlll[ao.lllIIlIIl[25]] = "Dropping logs";
        ao.lllIIIlll[ao.lllIIlIIl[26]] = "Dropping logs";
        ao.lllIIIlll[ao.lllIIlIIl[28]] = "Nav to small fish spot";
        ao.lllIIIlll[ao.lllIIlIIl[29]] = "Wear";
        ao.lllIIIlll[ao.lllIIlIIl[27]] = "Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[32]] = "Nav to small fish spot";
        ao.lllIIIlll[ao.lllIIlIIl[33]] = "Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[34]] = "Bait";
        ao.lllIIIlll[ao.lllIIlIIl[35]] = "Nav to fly fish spot";
        ao.lllIIIlll[ao.lllIIlIIl[36]] = "Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[37]] = "Lure";
        ao.lllIIIlll[ao.lllIIlIIl[38]] = "Dropping logs";
        ao.lllIIIlll[ao.lllIIlIIl[39]] = "Dropping logs";
        ao.lllIIIlll[ao.lllIIlIIl[40]] = "Fishing spot";
        ao.lllIIIlll[ao.lllIIlIIl[41]] = "Use-rod";
        ao.lllIIIlll[ao.lllIIlIIl[42]] = "Buying items";
        ao.lllIIIlll[ao.lllIIlIIl[43]] = "Finished buying items, switching back to fishing";
        ao.lllIIIlll[ao.lllIIlIIl[44]] = "Navigating to bank";
        ao.lllIIIlll[ao.lllIIlIIl[45]] = "Opening bank";
        ao.lllIIIlll[ao.lllIIlIIl[46]] = "Handling banking";
        ao.lllIIIlll[ao.lllIIlIIl[47]] = "Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[48]] = "We are missing supplies, switching to BUYING";
        ao.lllIIIlll[ao.lllIIlIIl[49]] = "Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[53]] = "Nav to bank";
        ao.lllIIIlll[ao.lllIIlIIl[54]] = "Nav to small fish spot";
        ao.lllIIIlll[ao.lllIIlIIl[55]] = "Wear";
        ao.lllIIIlll[ao.lllIIlIIl[56]] = "Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[57]] = "Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[58]] = "Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[59]] = "Fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[60]] = "Fly fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[61]] = "Feather";
        ao.lllIIIlll[ao.lllIIlIIl[62]] = "Fishing bait";
        ao.lllIIIlll[ao.lllIIlIIl[73]] = "Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[75]] = "ring of wealth (";
        ao.lllIIIlll[ao.lllIIlIIl[76]] = "Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[78]] = "Fishing bait";
        ao.lllIIIlll[ao.lllIIlIIl[79]] = "Feather";
        ao.lllIIIlll[ao.lllIIlIIl[80]] = "Fly fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[81]] = "Fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[82]] = "Small fishing net";
    }

    private static boolean llIIIIIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlIIllI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ao.llIIIIlIIlII(Skills.getLevel((Skill)Skill.FISHING), lllIIlIIl[74])) {
            bl = lllIIlIIl[1];

            if (((83 + 198 - 272 + 243 ^ 73 + 33 - 95 + 177) & (37 + 26 - -41 + 105 ^ 87 + 102 - 124 + 80 ^ -1)) != ((0x90 ^ 0x81 ^ (0x17 ^ 0x58)) & (115 + 45 - 115 + 110 ^ 117 + 22 - 138 + 196 ^ -1))) {
                return ((0x4E ^ 0x5E ^ (0xC ^ 0x31)) & (0x22 ^ 0x4C ^ (0xED ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            bl = lllIIlIIl[0];
        }
        return bl;
    }

    private static boolean llIIIIlIIIIl(int n2) {
        return n2 == 0;
    }

    public static void ey() {
        block36: {
            BankLocation llllIIlIllllI;
            block37: {
                block44: {
                    block39: {
                        block43: {
                            block42: {
                                block41: {
                                    block40: {
                                        block38: {
                                            if (ao.llIIIIIlllll(bv ? 1 : 0)) {
                                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[0]];
                                                b.a(bx);
                                                if (ao.llIIIIlIIIII(bx.size(), lllIIlIIl[1])) {
                                                    System.out.println(lllIIIlll[lllIIlIIl[1]]);
                                                    bv = lllIIlIIl[0];
                                                }
                                            }
                                            if (!ao.llIIIIlIIIIl(bv ? 1 : 0)) break block36;
                                            if (!ao.llIIIIlIIIIl(ao.an() ? 1 : 0)) break block37;
                                            llllIIlIllllI = BankLocation.getNearest();
                                            if (ao.llIIIIlIIIlI(llllIIlIllllI) && ao.llIIIIlIIIIl(llllIIlIllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[2]];
                                                a.a(llllIIlIllllI);
                                            }
                                            if (!ao.llIIIIlIIIlI(llllIIlIllllI) || !ao.llIIIIIlllll(llllIIlIllllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block37;
                                            if (ao.llIIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[3]];
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIlIIl[4]);

                                            }
                                            if (!ao.llIIIIIlllll(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[5]];
                                            if (ao.llIIIIlIIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lllIIlIIl[5]);

                                            }
                                            if (ao.llIIIIlIIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lllIIlIIl[2]);

                                            }
                                            int[] nArray = new int[lllIIlIIl[1]];
                                            nArray[ao.lllIIlIIl[0]] = lllIIlIIl[6];
                                            if (!ao.llIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                            String[] stringArray = new String[lllIIlIIl[1]];
                                            stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[7]];
                                            if (!ao.llIIIIlIIlII(Inventory.getCount((String[])stringArray), lllIIlIIl[1])) break block39;
                                        }
                                        int[] nArray = new int[lllIIlIIl[1]];
                                        nArray[ao.lllIIlIIl[0]] = lllIIlIIl[8];
                                        if (!ao.llIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                        String[] stringArray = new String[lllIIlIIl[1]];
                                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[9]];
                                        if (!ao.llIIIIlIIlII(Inventory.getCount((String[])stringArray), lllIIlIIl[1])) break block39;
                                    }
                                    int[] nArray = new int[lllIIlIIl[1]];
                                    nArray[ao.lllIIlIIl[0]] = lllIIlIIl[10];
                                    if (!ao.llIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                    String[] stringArray = new String[lllIIlIIl[1]];
                                    stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[11]];
                                    if (!ao.llIIIIlIIlII(Inventory.getCount((String[])stringArray), lllIIlIIl[1])) break block39;
                                }
                                int[] nArray = new int[lllIIlIIl[1]];
                                nArray[ao.lllIIlIIl[0]] = lllIIlIIl[12];
                                if (!ao.llIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                String[] stringArray = new String[lllIIlIIl[1]];
                                stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[13]];
                                if (!ao.llIIIIlIIlII(Inventory.getCount((String[])stringArray), lllIIlIIl[1])) break block39;
                            }
                            int[] nArray = new int[lllIIlIIl[1]];
                            nArray[ao.lllIIlIIl[0]] = lllIIlIIl[14];
                            if (!ao.llIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                            String[] stringArray = new String[lllIIlIIl[1]];
                            stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[15]];
                            if (!ao.llIIIIlIIlII(Inventory.getCount((String[])stringArray), lllIIlIIl[1])) break block39;
                        }
                        if ((!ao.llIIIIlIIIIl(Bank.contains((int[])f.aV) ? 1 : 0) || ao.llIIIIlIIlII(Inventory.getCount((int[])f.aV), lllIIlIIl[1])) && !ao.llIIIIIlllll(Equipment.contains((int[])f.aV) ? 1 : 0)) break block44;
                    }
                    ao.Q();
                    System.out.println(lllIIIlll[lllIIlIIl[16]]);
                    bv = lllIIlIIl[1];
                    return;
                }
                int[] nArray = new int[lllIIlIIl[1]];
                nArray[ao.lllIIlIIl[0]] = lllIIlIIl[6];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[17]], (int)lllIIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[82]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];

                            if ((0xAD ^ 0xA9) > (0xAB ^ 0xAF)) {
                                return false;
                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);

                }
                int[] nArray2 = new int[lllIIlIIl[1]];
                nArray2[ao.lllIIlIIl[0]] = lllIIlIIl[8];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[18]], (int)lllIIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[81]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];

                            if (((0x1A ^ 0x28) & ~(0x47 ^ 0x75)) != 0) {
                                return ((0x8F ^ 0xAD) & ~(0x68 ^ 0x4A) & ~((0xDA ^ 0x91) & ~(0xF0 ^ 0xBB))) != 0;
                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);

                }
                int[] nArray3 = new int[lllIIlIIl[1]];
                nArray3[ao.lllIIlIIl[0]] = lllIIlIIl[10];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[19]], (int)lllIIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[80]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];

                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);

                }
                int[] nArray4 = new int[lllIIlIIl[1]];
                nArray4[ao.lllIIlIIl[0]] = lllIIlIIl[12];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[20]], (int)lllIIlIIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[79]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];

                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);

                }
                int[] nArray5 = new int[lllIIlIIl[1]];
                nArray5[ao.lllIIlIIl[0]] = lllIIlIIl[14];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[22]], (int)lllIIlIIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);

                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[78]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];

                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);

                }
                if (ao.llIIIIIlllll(Bank.contains((int[])f.aV) ? 1 : 0)) {
                    a.b(f.aV, lllIIlIIl[1]);
                }
                int[] nArray6 = new int[lllIIlIIl[1]];
                nArray6[ao.lllIIlIIl[0]] = lllIIlIIl[24];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    a.a(lllIIlIIl[24], lllIIlIIl[1]);
                }
            }
            if (ao.llIIIIIlllll(ao.an() ? 1 : 0)) {
                if (ao.llIIIIIlllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ao.llIIIIIlllll(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIIlll[lllIIlIIl[25]];
                    System.out.println(lllIIIlll[lllIIlIIl[26]]);
                    Inventory.getAll((int[])my).stream().forEach(Item::drop);
                }
                if (ao.llIIIIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                    if (ao.llIIIIlIIIII(Skills.getLevel((Skill)Skill.FISHING), lllIIlIIl[27])) {
                        if (ao.llIIIIlIIIII(Skills.getLevel((Skill)Skill.FISHING), lllIIlIIl[7])) {
                            if (ao.llIIIIlIIIIl(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && ao.llIIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(mw), lllIIlIIl[7])) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[28]];
                                if (ao.llIIIIIlllll(Inventory.contains((int[])f.aV) ? 1 : 0)) {
                                    Inventory.getFirst((int[])f.aV).interact(lllIIIlll[lllIIlIIl[29]]);
                                }
                                Movement.walkTo((WorldPoint)mw);

                                Time.sleepTicks((int)lllIIlIIl[1]);

                            }
                            if (ao.llIIIIIlllll(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[27]];
                                if (ao.llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30])) {
                                    int[] nArray = new int[lllIIlIIl[1]];
                                    nArray[ao.lllIIlIIl[0]] = lllIIlIIl[31];
                                    llllIIlIllllI = NPCs.getNearest((int[])nArray);
                                    if (ao.llIIIIlIIIlI(llllIIlIllllI) && ao.llIIIIIlllll(mv.contains((Locatable)llllIIlIllllI) ? 1 : 0)) {
                                        int[] nArray7 = new int[lllIIlIIl[1]];
                                        nArray7[ao.lllIIlIIl[0]] = lllIIlIIl[31];
                                        NPCs.getNearest((int[])nArray7).interact(lllIIlIIl[0]);
                                        Time.sleepTicks((int)lllIIlIIl[2]);

                                    }
                                }
                            }
                        }
                        if (ao.llIIIIlIIlII(Skills.getLevel((Skill)Skill.FISHING), lllIIlIIl[7]) && ao.llIIIIlIIIII(Skills.getLevel((Skill)Skill.FISHING), lllIIlIIl[27])) {
                            if (ao.llIIIIlIIIIl(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[32]];
                                Movement.walkTo((WorldPoint)mw);

                                Time.sleepTicks((int)lllIIlIIl[1]);

                            }
                            if (ao.llIIIIIlllll(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[33]];
                                if (ao.llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30])) {
                                    int[] nArray = new int[lllIIlIIl[1]];
                                    nArray[ao.lllIIlIIl[0]] = lllIIlIIl[31];
                                    llllIIlIllllI = NPCs.getNearest((int[])nArray);
                                    if (ao.llIIIIlIIIlI(llllIIlIllllI) && ao.llIIIIIlllll(mv.contains((Locatable)llllIIlIllllI) ? 1 : 0)) {
                                        int[] nArray8 = new int[lllIIlIIl[1]];
                                        nArray8[ao.lllIIlIIl[0]] = lllIIlIIl[31];
                                        NPCs.getNearest((int[])nArray8).interact(lllIIIlll[lllIIlIIl[34]]);
                                        Time.sleepTicks((int)lllIIlIIl[2]);

                                    }
                                }
                            }
                        }
                    }
                    if (ao.llIIIIlIIlII(Skills.getLevel((Skill)Skill.FISHING), lllIIlIIl[27])) {
                        if (ao.llIIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[35]];
                            Movement.walkTo((WorldPoint)mx);

                            Time.sleepTicks((int)lllIIlIIl[1]);

                        }
                        if (ao.llIIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[36]];
                            if (ao.llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30]) && ao.llIIIIlIIIlI(NPCs.getNearest(nPC -> {
                                int n2;
                                if (ao.llIIIIlIIllI(nPC.getId(), lllIIlIIl[77]) && ao.llIIIIlIIlll(nPC.getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                                    n2 = lllIIlIIl[1];

                                } else {
                                    n2 = lllIIlIIl[0];
                                }
                                return n2 != 0;
                            }))) {
                                NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (ao.llIIIIlIIllI(nPC.getId(), lllIIlIIl[77]) && ao.llIIIIlIIlll(nPC.getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                                        n2 = lllIIlIIl[1];

                                        if (-1 >= 1) {
                                            return false;
                                        }
                                    } else {
                                        n2 = lllIIlIIl[0];
                                    }
                                    return n2 != 0;
                                }).interact(lllIIIlll[lllIIlIIl[37]]);
                                Time.sleepTicks((int)lllIIlIIl[2]);

                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean ae() {
        return lllIIlIIl[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean an() {
        int n2;
        String[] stringArray = new String[lllIIlIIl[1]];
        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[58]];
        if (ao.llIIIIIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lllIIlIIl[1]];
            stringArray2[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[59]];
            if (ao.llIIIIIlllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lllIIlIIl[1]];
                stringArray3[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[60]];
                if (ao.llIIIIIlllll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lllIIlIIl[1]];
                    stringArray4[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[61]];
                    if (ao.llIIIIIlllll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        String[] stringArray5 = new String[lllIIlIIl[1]];
                        stringArray5[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[62]];
                        if (ao.llIIIIIlllll(Inventory.contains((String[])stringArray5) ? 1 : 0) && (!ao.llIIIIlIIIIl(Inventory.contains((int[])f.aV) ? 1 : 0) || ao.llIIIIIlllll(Equipment.contains((int[])f.aV) ? 1 : 0))) {
                            n2 = lllIIlIIl[1];

                            if (3 != 0) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lllIIlIIl[0];
        return n2 != 0;
    }

    public static void Q() {
        d llllIIlIllIII;
        Object llllIIlIllIIl;
        int[] nArray = new int[lllIIlIIl[1]];
        nArray[ao.lllIIlIIl[0]] = lllIIlIIl[6];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lllIIlIIl[6], lllIIlIIl[1], lllIIlIIl[4]);
            bx.add(d2);

        }
        int[] nArray2 = new int[lllIIlIIl[1]];
        nArray2[ao.lllIIlIIl[0]] = lllIIlIIl[8];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllIIlIllIIl = new DHelper(lllIIlIIl[8], lllIIlIIl[1], lllIIlIIl[4]);
            bx.add((DHelper) lllIIlIllIIl);

        }
        int[] nArray3 = new int[lllIIlIIl[1]];
        nArray3[ao.lllIIlIIl[0]] = lllIIlIIl[10];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllIIlIllIIl = new DHelper(lllIIlIIl[10], lllIIlIIl[1], lllIIlIIl[63]);
            bx.add((DHelper) lllIIlIllIIl);

        }
        int[] nArray4 = new int[lllIIlIIl[1]];
        nArray4[ao.lllIIlIIl[0]] = lllIIlIIl[14];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllIIlIllIIl = new DHelper(lllIIlIIl[14], lllIIlIIl[64], lllIIlIIl[65]);
            bx.add((DHelper) lllIIlIllIIl);

        }
        int[] nArray5 = new int[lllIIlIIl[1]];
        nArray5[ao.lllIIlIIl[0]] = lllIIlIIl[12];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllIIlIllIIl = new DHelper(lllIIlIIl[12], lllIIlIIl[66], lllIIlIIl[7]);
            bx.add((DHelper) lllIIlIllIIl);

        }
        int[] nArray6 = new int[lllIIlIIl[1]];
        nArray6[ao.lllIIlIIl[0]] = lllIIlIIl[67];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllIIlIllIIl = new DHelper(lllIIlIIl[67], lllIIlIIl[1], lllIIlIIl[4]);
            bx.add((DHelper) lllIIlIllIIl);

        }
        int[] nArray7 = new int[lllIIlIIl[1]];
        nArray7[ao.lllIIlIIl[0]] = lllIIlIIl[24];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llllIIlIllIIl = new DHelper(lllIIlIIl[24], lllIIlIIl[16], lllIIlIIl[4]);
            bx.add((DHelper) lllIIlIllIIl);

        }
        if (ao.llIIIIlIIIIl(Bank.contains((Predicate)(llllIIlIllIIl = item -> item.getName().toLowerCase().contains(lllIIIlll[lllIIlIIl[75]]))) ? 1 : 0)) {
            llllIIlIllIII = new DHelper(lllIIlIIl[68], lllIIlIIl[7], lllIIlIIl[69]);
            bx.add(llllIIlIllIII);

        }
        int[] nArray8 = new int[lllIIlIIl[1]];
        nArray8[ao.lllIIlIIl[0]] = lllIIlIIl[70];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            llllIIlIllIII = new DHelper(lllIIlIIl[70], lllIIlIIl[54], lllIIlIIl[71]);
            bx.add(llllIIlIllIII);

        }
    }

    private static boolean llIIIIlIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIlIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIIIIlIIIlI(Object object) {
        return object != null;
    }
}

