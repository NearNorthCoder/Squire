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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b_Unknown;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f_Unknown;
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

public class ao_Unknown
implements ab {
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lllIIlIIl;
    public static /* synthetic */ WorldArea mv;
    private static /* synthetic */ WorldPoint mw;
    private static /* synthetic */ WorldPoint mx;
    private static /* synthetic */ String[] lllIIIlll;
    private static /* synthetic */ int[] my;
    public static /* synthetic */ List<d> bx;

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
                                0;
                            }
                            if (!ao.llIIIIIlllll(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[46]];
                            if (ao.llIIIIlIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIlIIl[5]);
                                0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[76]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];
                            0;
                            if (3 <= ((0xC ^ 0x3D ^ (0x54 ^ 0x40) & ~(0xBD ^ 0xA9)) & (12 + 20 - 18 + 150 ^ 121 + 14 - 23 + 37 ^ -1))) {
                                return ((0x63 ^ 0x59 ^ (0x36 ^ 0x58)) & (0xFF ^ 0xB3 ^ (0xD ^ 0x15) ^ -1)) != 0;
                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);
                    0;
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
                            0;
                            Time.sleepTicks((int)lllIIlIIl[1]);
                            0;
                        }
                        if (ao.llIIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIIlIlllII), lllIIlIIl[13])) {
                            if (ao.llIIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (ao.llIIIIIlllll(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)lllIIlIIl[2]);
                                0;
                                Bank.depositInventory();
                                Time.sleepTicks((int)lllIIlIIl[2]);
                                0;
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
                        0;
                        Time.sleepTicks((int)lllIIlIIl[1]);
                        0;
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
                                0;
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

    private static String llIIIIIllIII(String llllIIIlIIlIl, String llllIIIlIIllI) {
        try {
            SecretKeySpec llllIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIIlIIllI.getBytes(StandardCharsets.UTF_8)), lllIIlIIl[13]), "DES");
            Cipher llllIIIlIlIIl = Cipher.getInstance("DES");
            llllIIIlIlIIl.init(lllIIlIIl[2], llllIIIlIlIlI);
            return new String(llllIIIlIlIIl.doFinal(Base64.getDecoder().decode(llllIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIlIlIII) {
            llllIIIlIlIII.printStackTrace();
            return null;
        }
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

    private static String llIIIIIlIlll(String llllIIlIIIlII, String llllIIlIIIIll) {
        llllIIlIIIlII = new String(Base64.getDecoder().decode(llllIIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIIlIIIlll = new StringBuilder();
        char[] llllIIlIIIllI = llllIIlIIIIll.toCharArray();
        int llllIIlIIIlIl = lllIIlIIl[0];
        char[] llllIIIllllll = llllIIlIIIlII.toCharArray();
        int llllIIIlllllI = llllIIIllllll.length;
        int llllIIIllllIl = lllIIlIIl[0];
        while (ao.llIIIIlIIIII(llllIIIllllIl, llllIIIlllllI)) {
            char llllIIlIIlIlI = llllIIIllllll[llllIIIllllIl];
            llllIIlIIIlll.append((char)(llllIIlIIlIlI ^ llllIIlIIIllI[llllIIlIIIlIl % llllIIlIIIllI.length]));
            0;
            ++llllIIlIIIlIl;
            ++llllIIIllllIl;
            0;
            if (1 != 0) continue;
            return null;
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
            0;
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
            0;
        }
    }

    private static boolean llIIIIlIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIIIlllIl() {
        lllIIIlll = new String[lllIIlIIl[100]];
        ao.lllIIIlll[ao.lllIIlIIl[0]] = ao."Buying items";
        ao.lllIIIlll[ao.lllIIlIIl[1]] = ao."Finished buying items, switching back to fishing";
        ao.lllIIIlll[ao.lllIIlIIl[2]] = ao."Navigating to bank";
        ao.lllIIIlll[ao.lllIIlIIl[3]] = ao."Opening bank";
        ao.lllIIIlll[ao.lllIIlIIl[5]] = ao."Handling banking";
        ao.lllIIIlll[ao.lllIIlIIl[7]] = ao."Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[9]] = ao."Fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[11]] = ao."Fly fishing rod rod";
        ao.lllIIIlll[ao.lllIIlIIl[13]] = ao."Feather";
        ao.lllIIIlll[ao.lllIIlIIl[15]] = ao."Fishing bait";
        ao.lllIIIlll[ao.lllIIlIIl[16]] = ao."We are missing supplies, switching to BUYING";
        ao.lllIIIlll[ao.lllIIlIIl[17]] = ao."Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[18]] = ao."Fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[19]] = ao."Fly fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[20]] = ao."Feather";
        ao.lllIIIlll[ao.lllIIlIIl[22]] = ao."Fishing bait";
        ao.lllIIIlll[ao.lllIIlIIl[25]] = ao."Dropping logs";
        ao.lllIIIlll[ao.lllIIlIIl[26]] = ao."Dropping logs";
        ao.lllIIIlll[ao.lllIIlIIl[28]] = ao."Nav to small fish spot";
        ao.lllIIIlll[ao.lllIIlIIl[29]] = ao."Wear";
        ao.lllIIIlll[ao.lllIIlIIl[27]] = ao."Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[32]] = ao."Nav to small fish spot";
        ao.lllIIIlll[ao.lllIIlIIl[33]] = ao."Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[34]] = ao."Bait";
        ao.lllIIIlll[ao.lllIIlIIl[35]] = ao."Nav to fly fish spot";
        ao.lllIIIlll[ao.lllIIlIIl[36]] = ao."Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[37]] = ao."Lure";
        ao.lllIIIlll[ao.lllIIlIIl[38]] = ao."Dropping logs";
        ao.lllIIIlll[ao.lllIIlIIl[39]] = ao."Dropping logs";
        ao.lllIIIlll[ao.lllIIlIIl[40]] = ao."Fishing spot";
        ao.lllIIIlll[ao.lllIIlIIl[41]] = ao."Use-rod";
        ao.lllIIIlll[ao.lllIIlIIl[42]] = ao."Buying items";
        ao.lllIIIlll[ao.lllIIlIIl[43]] = ao."Finished buying items, switching back to fishing";
        ao.lllIIIlll[ao.lllIIlIIl[44]] = ao."Navigating to bank";
        ao.lllIIIlll[ao.lllIIlIIl[45]] = ao."Opening bank";
        ao.lllIIIlll[ao.lllIIlIIl[46]] = ao."Handling banking";
        ao.lllIIIlll[ao.lllIIlIIl[47]] = ao."Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[48]] = ao."We are missing supplies, switching to BUYING";
        ao.lllIIIlll[ao.lllIIlIIl[49]] = ao."Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[53]] = ao."Nav to bank";
        ao.lllIIIlll[ao.lllIIlIIl[54]] = ao."Nav to small fish spot";
        ao.lllIIIlll[ao.lllIIlIIl[55]] = ao."Wear";
        ao.lllIIIlll[ao.lllIIlIIl[56]] = ao."Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[57]] = ao."Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[58]] = ao."Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[59]] = ao."Fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[60]] = ao."Fly fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[61]] = ao."Feather";
        ao.lllIIIlll[ao.lllIIlIIl[62]] = ao."Fishing bait";
        ao.lllIIIlll[ao.lllIIlIIl[73]] = ao."Fishing";
        ao.lllIIIlll[ao.lllIIlIIl[75]] = ao."ring of wealth (";
        ao.lllIIIlll[ao.lllIIlIIl[76]] = ao."Small fishing net";
        ao.lllIIIlll[ao.lllIIlIIl[78]] = ao."Fishing bait";
        ao.lllIIIlll[ao.lllIIlIIl[79]] = ao."Feather";
        ao.lllIIIlll[ao.lllIIlIIl[80]] = ao."Fly fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[81]] = ao."Fishing rod";
        ao.lllIIIlll[ao.lllIIlIIl[82]] = ao."Small fishing net";
    }

    private static void llIIIIIllllI() {
        lllIIlIIl = new int[101];
        ao.lllIIlIIl[0] = (0xB4 ^ 0x88) & ~(0x2B ^ 0x17);
        ao.lllIIlIIl[1] = 1;
        ao.lllIIlIIl[2] = 2;
        ao.lllIIlIIl[3] = 3;
        ao.lllIIlIIl[4] = -(0xFFFF86FD & 0x7D56) & (0xFFFFFFDB & 0x17FF);
        ao.lllIIlIIl[5] = 0xBD ^ 0xB9;
        ao.lllIIlIIl[6] = -(0xFFFFE3FF & 0x7E91) & (0xFFFFFBBF & 0x67FF);
        ao.lllIIlIIl[7] = 0x3A ^ 0x3F;
        ao.lllIIlIIl[8] = 0xFFFF8533 & 0x7BFF;
        ao.lllIIlIIl[9] = 48 + 60 - 89 + 171 ^ 86 + 146 - 110 + 62;
        ao.lllIIlIIl[10] = 0xFFFFB13D & 0x4FF7;
        ao.lllIIlIIl[11] = 0xB0 ^ 0xB7;
        ao.lllIIlIIl[12] = 0xFFFFF13B & 0xFFE;
        ao.lllIIlIIl[13] = 0x23 ^ 0x2B;
        ao.lllIIlIIl[14] = -(0xFFFFFFE7 & 0x7C1F) & (0xFFFFFF3F & 0x7DFF);
        ao.lllIIlIIl[15] = 11 + 80 - 4 + 76 ^ 70 + 65 - -27 + 8;
        ao.lllIIlIIl[16] = 103 + 41 - 53 + 98 ^ 156 + 100 - 169 + 96;
        ao.lllIIlIIl[17] = 0x7C ^ 0x77;
        ao.lllIIlIIl[18] = 0x79 ^ 0x3E ^ (0x2B ^ 0x60);
        ao.lllIIlIIl[19] = 0x6E ^ 0xA ^ (0x65 ^ 0xC);
        ao.lllIIlIIl[20] = 0xB4 ^ 0x86 ^ (0x32 ^ 0xE);
        ao.lllIIlIIl[21] = 0xFFFFFEAE & 0x187F1;
        ao.lllIIlIIl[22] = 81 + 66 - 136 + 117 ^ 16 + 78 - 48 + 97;
        ao.lllIIlIIl[23] = 0xFFFF9FFA & 0x63ED;
        ao.lllIIlIIl[24] = 0xFFFFFFDE & 0x1F69;
        ao.lllIIlIIl[25] = 214 + 101 - 284 + 184 ^ 155 + 69 - 119 + 94;
        ao.lllIIlIIl[26] = 0x16 ^ 7;
        ao.lllIIlIIl[27] = 0xA0 ^ 0xB7 ^ 3;
        ao.lllIIlIIl[28] = 0x8E ^ 0xC0 ^ (0x7A ^ 0x26);
        ao.lllIIlIIl[29] = 199 + 102 - 136 + 43 ^ 70 + 69 - 21 + 77;
        ao.lllIIlIIl[30] = -1;
        ao.lllIIlIIl[31] = 0xFFFFFEAE & 0x759;
        ao.lllIIlIIl[32] = 0x6D ^ 0x18 ^ (0x3A ^ 0x5A);
        ao.lllIIlIIl[33] = 6 ^ 0x23 ^ (0x36 ^ 5);
        ao.lllIIlIIl[34] = 0x73 ^ 0x64;
        ao.lllIIlIIl[35] = 0x4A ^ 0x75 ^ (0x9A ^ 0xBD);
        ao.lllIIlIIl[36] = 0x7F ^ 0x55 ^ (0x85 ^ 0xB6);
        ao.lllIIlIIl[37] = 0xAE ^ 0xB4;
        ao.lllIIlIIl[38] = (0xD ^ 7) & ~(0xAA ^ 0xA0) ^ (0x8A ^ 0x91);
        ao.lllIIlIIl[39] = 0x48 ^ 0x54;
        ao.lllIIlIIl[40] = 0x7B ^ 0x66;
        ao.lllIIlIIl[41] = 106 + 108 - 154 + 69 ^ 103 + 25 - 92 + 123;
        ao.lllIIlIIl[42] = 6 ^ 0x2C ^ (0x93 ^ 0xA6);
        ao.lllIIlIIl[43] = 0x94 ^ 0xB4;
        ao.lllIIlIIl[44] = 0xD1 ^ 0x86 ^ (3 ^ 0x75);
        ao.lllIIlIIl[45] = 0x45 ^ 0x67;
        ao.lllIIlIIl[46] = 0 ^ 0x23;
        ao.lllIIlIIl[47] = 0xA8 ^ 0x8C;
        ao.lllIIlIIl[48] = 0xC3 ^ 0xA2 ^ (0xC2 ^ 0x86);
        ao.lllIIlIIl[49] = 0x1B ^ 0x3D;
        ao.lllIIlIIl[50] = -(0xA4 ^ 0x99) & (0xFFFFA77F & 0x59FD);
        ao.lllIIlIIl[51] = -(0xFFFFF799 & 0x7C7F) & (0xFFFFFDFF & Short.MAX_VALUE);
        ao.lllIIlIIl[52] = -(0xFFFFE7C3 & 0x783F) & (0xFFFFFDFF & 0x6FF7);
        ao.lllIIlIIl[53] = 0x6D ^ 0x4A;
        ao.lllIIlIIl[54] = 0xA5 ^ 0x8D;
        ao.lllIIlIIl[55] = 32 + 103 - 78 + 91 ^ 48 + 183 - 42 + 0;
        ao.lllIIlIIl[56] = 0x2A ^ 0;
        ao.lllIIlIIl[57] = 0x99 ^ 0xB6 ^ (0x70 ^ 0x74);
        ao.lllIIlIIl[58] = 0x44 ^ 0x72 ^ (0x48 ^ 0x52);
        ao.lllIIlIIl[59] = 0x22 ^ 0x37 ^ (0x6C ^ 0x54);
        ao.lllIIlIIl[60] = 0x8E ^ 0xA0;
        ao.lllIIlIIl[61] = 0xB4 ^ 0x9B;
        ao.lllIIlIIl[62] = 0x27 ^ 0x66 ^ (0xE8 ^ 0x99);
        ao.lllIIlIIl[63] = 0xFFFFE3B9 & 0x3F6E;
        ao.lllIIlIIl[64] = 0xFFFF997C & 0x67AF;
        ao.lllIIlIIl[65] = 0xFFFF83FE & 0x7DF5;
        ao.lllIIlIIl[66] = -(0xFFFFB7E7 & 0x4C3D) & (0xFFFFB7FE & 0x7EED);
        ao.lllIIlIIl[67] = -(0xFFFFABB7 & 0x7479) & (0xFFFFBF3D & 0x6FFF);
        ao.lllIIlIIl[68] = -(0xFFFF98D9 & 0x7737) & (0xFFFFFFDD & 0x3EFE);
        ao.lllIIlIIl[69] = -(0xFFFFB7DF & 0x5A34) & (0xFFFFFBFF & 0x77BB);
        ao.lllIIlIIl[70] = -(0xFFFFE237 & 0x7DF9) & (0xFFFFFF7F & 0x7FF7);
        ao.lllIIlIIl[71] = -(0xFFFFFF2F & 0x74FA) & (0xFFFFFFAF & 0x77FD);
        ao.lllIIlIIl[72] = 0xFD ^ 0x99;
        ao.lllIIlIIl[73] = 0x83 ^ 0x97 ^ (0x8C ^ 0xA9);
        ao.lllIIlIIl[74] = 0x34 ^ 0x57;
        ao.lllIIlIIl[75] = 0x20 ^ 0x12;
        ao.lllIIlIIl[76] = 8 ^ 0x6C ^ (0xC2 ^ 0x95);
        ao.lllIIlIIl[77] = -(0xFFFFF927 & 0x1EDB) & (0xFFFF9FE6 & 0x7DFF);
        ao.lllIIlIIl[78] = 0x4E ^ 0x7A;
        ao.lllIIlIIl[79] = 35 + 27 - -112 + 9 ^ 71 + 129 - 176 + 106;
        ao.lllIIlIIl[80] = 0x57 ^ 0x61;
        ao.lllIIlIIl[81] = 69 + 15 - -82 + 11 ^ 19 + 69 - -11 + 35;
        ao.lllIIlIIl[82] = 0x9D ^ 0xA5;
        ao.lllIIlIIl[83] = 0xFFFFADEF & 0x5BDA;
        ao.lllIIlIIl[84] = -(0xFFFFC3EB & 0x3E1D) & (0xFFFFBFFE & 0x4FED);
        ao.lllIIlIIl[85] = 0xFFFFBDDF & 0x4BF5;
        ao.lllIIlIIl[86] = -(0xFFFFB341 & 0x7EBF) & (0xFFFFFFFF & 0x3FF4);
        ao.lllIIlIIl[87] = -(0xFFFFAD14 & 0x72FF) & (0xFFFFFBF7 & 0x2DFF);
        ao.lllIIlIIl[88] = -(0xFFFFF6DF & 0x39A4) & (0xFFFFFDDF & 0x3FF7);
        ao.lllIIlIIl[89] = 0xFFFFF7E7 & 0xDFF;
        ao.lllIIlIIl[90] = 0xFFFF8DF5 & 0x77FB;
        ao.lllIIlIIl[91] = 0xFFFF8FEF & 0x75FF;
        ao.lllIIlIIl[92] = -(0xFFFF9EEF & 0x6DD3) & (0xFFFFFDFF & 0xFFF);
        ao.lllIIlIIl[93] = -(0xFFFF96A7 & 0x7FF9) & (0xFFFFB7FF & 0x5FE7);
        ao.lllIIlIIl[94] = 0xFFFFE35B & 0x1DEF;
        ao.lllIIlIIl[95] = -(0xFFFFE7E7 & 0x5C1F) & (0xFFFFC77F & 0x7DDF);
        ao.lllIIlIIl[96] = -(0xFFFFDDFB & 0x76A5) & (0xFFFFF7EF & 0x5DFF);
        ao.lllIIlIIl[97] = -(0xFFFFDFBB & 0x73FE) & (0xFFFFFFFF & 0x7FFB);
        ao.lllIIlIIl[98] = -(0xFFFF9DDB & 0x73BF) & (0xFFFFBFDF & 0x7DFE);
        ao.lllIIlIIl[99] = 0xFFFFECE8 & 0x3F57;
        ao.lllIIlIIl[100] = 0x93 ^ 0x9E ^ (0xAF ^ 0x9B);
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
            0;
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
                                                0;
                                            }
                                            if (!ao.llIIIIIlllll(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[5]];
                                            if (ao.llIIIIlIIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lllIIlIIl[5]);
                                                0;
                                            }
                                            if (ao.llIIIIlIIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lllIIlIIl[2]);
                                                0;
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
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[82]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];
                            0;
                            if ((0xAD ^ 0xA9) > (0xAB ^ 0xAF)) {
                                return false;
                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);
                    0;
                }
                int[] nArray2 = new int[lllIIlIIl[1]];
                nArray2[ao.lllIIlIIl[0]] = lllIIlIIl[8];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[18]], (int)lllIIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[81]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];
                            0;
                            if (((0x1A ^ 0x28) & ~(0x47 ^ 0x75)) != 0) {
                                return ((0x8F ^ 0xAD) & ~(0x68 ^ 0x4A) & ~((0xDA ^ 0x91) & ~(0xF0 ^ 0xBB))) != 0;
                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);
                    0;
                }
                int[] nArray3 = new int[lllIIlIIl[1]];
                nArray3[ao.lllIIlIIl[0]] = lllIIlIIl[10];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[19]], (int)lllIIlIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[80]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];
                            0;
                            
                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);
                    0;
                }
                int[] nArray4 = new int[lllIIlIIl[1]];
                nArray4[ao.lllIIlIIl[0]] = lllIIlIIl[12];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[20]], (int)lllIIlIIl[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[79]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];
                            0;
                            
                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);
                    0;
                }
                int[] nArray5 = new int[lllIIlIIl[1]];
                nArray5[ao.lllIIlIIl[0]] = lllIIlIIl[14];
                if (ao.llIIIIIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)lllIIIlll[lllIIlIIl[22]], (int)lllIIlIIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lllIIlIIl[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lllIIlIIl[1]];
                        stringArray[ao.lllIIlIIl[0]] = lllIIIlll[lllIIlIIl[78]];
                        if (ao.llIIIIlIIIll(Inventory.getCount((String[])stringArray))) {
                            bl = lllIIlIIl[1];
                            0;
                            if (-2 > 0) {
                                return false;
                            }
                        } else {
                            bl = lllIIlIIl[0];
                        }
                        return bl;
                    }, (int)lllIIlIIl[4]);
                    0;
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
                                0;
                                Time.sleepTicks((int)lllIIlIIl[1]);
                                0;
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
                                        0;
                                    }
                                }
                            }
                        }
                        if (ao.llIIIIlIIlII(Skills.getLevel((Skill)Skill.FISHING), lllIIlIIl[7]) && ao.llIIIIlIIIII(Skills.getLevel((Skill)Skill.FISHING), lllIIlIIl[27])) {
                            if (ao.llIIIIlIIIIl(mv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderGWD.c = lllIIIlll[lllIIlIIl[32]];
                                Movement.walkTo((WorldPoint)mw);
                                0;
                                Time.sleepTicks((int)lllIIlIIl[1]);
                                0;
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
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (ao.llIIIIlIIlII(Skills.getLevel((Skill)Skill.FISHING), lllIIlIIl[27])) {
                        if (ao.llIIIIlIIlIl(Players.getLocal().getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[35]];
                            Movement.walkTo((WorldPoint)mx);
                            0;
                            Time.sleepTicks((int)lllIIlIIl[1]);
                            0;
                        }
                        if (ao.llIIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                            AccBuilderGWD.c = lllIIIlll[lllIIlIIl[36]];
                            if (ao.llIIIIlIIllI(Players.getLocal().getAnimation(), lllIIlIIl[30]) && ao.llIIIIlIIIlI(NPCs.getNearest(nPC -> {
                                int n2;
                                if (ao.llIIIIlIIllI(nPC.getId(), lllIIlIIl[77]) && ao.llIIIIlIIlll(nPC.getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                                    n2 = lllIIlIIl[1];
                                    0;
                                    if (-2 >= 0) {
                                        return (2 & (2 ^ -1)) != 0;
                                    }
                                } else {
                                    n2 = lllIIlIIl[0];
                                }
                                return n2 != 0;
                            }))) {
                                NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (ao.llIIIIlIIllI(nPC.getId(), lllIIlIIl[77]) && ao.llIIIIlIIlll(nPC.getWorldLocation().distanceTo(mx), lllIIlIIl[22])) {
                                        n2 = lllIIlIIl[1];
                                        0;
                                        if (-1 >= 1) {
                                            return false;
                                        }
                                    } else {
                                        n2 = lllIIlIIl[0];
                                    }
                                    return n2 != 0;
                                }).interact(lllIIIlll[lllIIlIIl[37]]);
                                Time.sleepTicks((int)lllIIlIIl[2]);
                                0;
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
                            0;
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
            d d2 = new d(lllIIlIIl[6], lllIIlIIl[1], lllIIlIIl[4]);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIIlIIl[1]];
        nArray2[ao.lllIIlIIl[0]] = lllIIlIIl[8];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllIIlIllIIl = new d(lllIIlIIl[8], lllIIlIIl[1], lllIIlIIl[4]);
            bx.add((d)llllIIlIllIIl);
            0;
        }
        int[] nArray3 = new int[lllIIlIIl[1]];
        nArray3[ao.lllIIlIIl[0]] = lllIIlIIl[10];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllIIlIllIIl = new d(lllIIlIIl[10], lllIIlIIl[1], lllIIlIIl[63]);
            bx.add((d)llllIIlIllIIl);
            0;
        }
        int[] nArray4 = new int[lllIIlIIl[1]];
        nArray4[ao.lllIIlIIl[0]] = lllIIlIIl[14];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllIIlIllIIl = new d(lllIIlIIl[14], lllIIlIIl[64], lllIIlIIl[65]);
            bx.add((d)llllIIlIllIIl);
            0;
        }
        int[] nArray5 = new int[lllIIlIIl[1]];
        nArray5[ao.lllIIlIIl[0]] = lllIIlIIl[12];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llllIIlIllIIl = new d(lllIIlIIl[12], lllIIlIIl[66], lllIIlIIl[7]);
            bx.add((d)llllIIlIllIIl);
            0;
        }
        int[] nArray6 = new int[lllIIlIIl[1]];
        nArray6[ao.lllIIlIIl[0]] = lllIIlIIl[67];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            llllIIlIllIIl = new d(lllIIlIIl[67], lllIIlIIl[1], lllIIlIIl[4]);
            bx.add((d)llllIIlIllIIl);
            0;
        }
        int[] nArray7 = new int[lllIIlIIl[1]];
        nArray7[ao.lllIIlIIl[0]] = lllIIlIIl[24];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            llllIIlIllIIl = new d(lllIIlIIl[24], lllIIlIIl[16], lllIIlIIl[4]);
            bx.add((d)llllIIlIllIIl);
            0;
        }
        if (ao.llIIIIlIIIIl(Bank.contains((Predicate)(llllIIlIllIIl = item -> item.getName().toLowerCase().contains(lllIIIlll[lllIIlIIl[75]]))) ? 1 : 0)) {
            llllIIlIllIII = new d(lllIIlIIl[68], lllIIlIIl[7], lllIIlIIl[69]);
            bx.add(llllIIlIllIII);
            0;
        }
        int[] nArray8 = new int[lllIIlIIl[1]];
        nArray8[ao.lllIIlIIl[0]] = lllIIlIIl[70];
        if (ao.llIIIIlIIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            llllIIlIllIII = new d(lllIIlIIl[70], lllIIlIIl[54], lllIIlIIl[71]);
            bx.add(llllIIlIllIII);
            0;
        }
    }

    private static String llIIIIIllIIl(String llllIIIllIIlI, String llllIIIllIIIl) {
        try {
            SecretKeySpec llllIIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIIllIllI = Cipher.getInstance("Blowfish");
            llllIIIllIllI.init(lllIIlIIl[2], llllIIIllIlll);
            return new String(llllIIIllIllI.doFinal(Base64.getDecoder().decode(llllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIIllIlIl) {
            llllIIIllIlIl.printStackTrace();
            return null;
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

