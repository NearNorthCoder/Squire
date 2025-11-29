/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.7bb63fa7-229b-499f-b77f-e1768cbbcc1eManager;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.7bb63fa7-229b-499f-b77f-e1768cbbcc1eManager;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.JHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.MHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.plugins.logout.Clues;

public class 7bb63fa7-229b-499f-b77f-e1768cbbcc1eManager {
    public static  List<Integer> af;
    public static  List<Integer> ae;
    public static final  WorldPoint ac;
    public static  List<Integer> ad;
    private static  String[] lIIIl;
    private static  int[] lIIlI;

    private static boolean lIlIIll(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIl() {
        lIIIl = new String[lIIlI[38]];
        h.lIIIl[h.lIIlI[0]] = "Wear";
        h.lIIIl[h.lIIlI[1]] = "Grand Exchange";
        h.lIIIl[h.lIIlI[8]] = "Removed item priest gown from list";
        h.lIIIl[h.lIIlI[4]] = "Removed item shanty pass from list";
        h.lIIIl[h.lIIlI[7]] = "Removed item beer from list";
        h.lIIIl[h.lIIlI[17]] = "Removed item priest gown 328 from list";
        h.lIIIl[h.lIIlI[19]] = "Removed item priest gown from list";
        h.lIIIl[h.lIIlI[21]] = "Removed item poison from list";
        h.lIIIl[h.lIIlI[23]] = "Stamina potion(4)";
        h.lIIIl[h.lIIlI[24]] = "Stamina potion (4)";
        h.lIIIl[h.lIIlI[3]] = "Removed item stamina from list";
        h.lIIIl[h.lIIlI[25]] = "Removed item 3019 from list";
        h.lIIIl[h.lIIlI[28]] = "tablet";
        h.lIIIl[h.lIIlI[29]] = "(tablet)";
        h.lIIIl[h.lIIlI[30]] = h.lIlIIII("kEAW1+Lr3Jw=", "akkqR");
        h.lIIIl[h.lIIlI[32]] = "Close";
        h.lIIIl[h.lIIlI[33]] = "wealth";
        h.lIIIl[h.lIIlI[34]] = "wealth";
        h.lIIIl[h.lIIlI[35]] = "ring of wealth (";
    }

    private static boolean lIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlll(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlI() {
        lIIlI = new int[39];
        h.lIIlI[0] = (0x74 ^ 0x58) & ~(0x1A ^ 0x36);
        h.lIIlI[1] = 1;
        h.lIIlI[2] = 0xFFFFF7EB & 0xBF7;
        h.lIIlI[3] = 0x24 ^ 0x17 ^ (0x12 ^ 0x2B);
        h.lIIlI[4] = 3;
        h.lIIlI[5] = -(0xFFFFBF67 & 0x44FE) & (0xFFFFFFEF & 0x17FD);
        h.lIIlI[6] = 0xFFFF9F67 & 0x7FDF;
        h.lIIlI[7] = 0xED ^ 0xC1 ^ (0x4B ^ 0x63);
        h.lIIlI[8] = 2;
        h.lIIlI[9] = -(0xFFFFDFE7 & 0x753A) & (0xFFFFDFEF & 0x77FB);
        h.lIIlI[10] = -(0xFFFFBBFD & 0x4D3F) & (0xFFFFDFFF & 0x1FDFC);
        h.lIIlI[11] = 0xFFFF85AB & 0x7BFE;
        h.lIIlI[12] = -(0xFFFFE43F & 0x5BE1) & (0xFFFFDFFB & 0x6BEF);
        h.lIIlI[13] = -(0xFFFFDED3 & 0x79ED) & (0xFFFFFFFE & 0x5FFF);
        h.lIIlI[14] = -(0xFFFFF4DB & 0x7BA7) & (0xFFFFFFFF & 0x77FF);
        h.lIIlI[15] = 0xFFFFD77F & 0x2FFE;
        h.lIIlI[16] = -(0xFFFFFFCB & 0x7877) & (0xFFFFFBEF & 0x7DFE);
        h.lIIlI[17] = 0 ^ 0x15 ^ (0x1B ^ 0xB);
        h.lIIlI[18] = -(0xFFFFF3BB & 0x6C65) & (0xFFFFFFFD & 0x7F6F);
        h.lIIlI[19] = 0x3B ^ 0x3D;
        h.lIIlI[20] = -(0xFFFFECDF & 0x73E1) & (0xFFFFE1FD & 0x7FD3);
        h.lIIlI[21] = 0xC2 ^ 0xC5;
        h.lIIlI[22] = 0xFFFFF173 & 0x3FDD;
        h.lIIlI[23] = 0x98 ^ 0x90;
        h.lIIlI[24] = 84 + 94 - 60 + 44 ^ 7 + 99 - 46 + 111;
        h.lIIlI[25] = 0x8D ^ 0x86;
        h.lIIlI[26] = -(0xFFFF9F8D & 0x6A76) & (0xFFFFDF7F & 0x3FFF);
        h.lIIlI[27] = -1;
        h.lIIlI[28] = 0x56 ^ 0x5A;
        h.lIIlI[29] = 0x92 ^ 0x9F;
        h.lIIlI[30] = 0x95 ^ 0xC4 ^ (0xEF ^ 0xB0);
        h.lIIlI[31] = -(0xFFFFFE0F & Short.MAX_VALUE) & (0xFFFFFFDF & Short.MAX_VALUE);
        h.lIIlI[32] = 0xAF ^ 0x9D ^ (0x29 ^ 0x14);
        h.lIIlI[33] = 0x56 ^ 0x46;
        h.lIIlI[34] = 0x2F ^ 0x29 ^ (0xD0 ^ 0xC7);
        h.lIIlI[35] = 0x84 ^ 0x96;
        h.lIIlI[36] = -(0xFFFFB7A7 & 0x4B5B) & (0xFFFFEFFF & 0x1F5F);
        h.lIIlI[37] = 0xFFFFEF9E & 0x1DFF;
        h.lIIlI[38] = 0xAF ^ 0xB9 ^ (0xA8 ^ 0xAD);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean b(String string) {
        List list = Inventory.getAll();
        if (h.lIlIIll(list.isEmpty() ? 1 : 0)) {
            void var11;
            String var12;
            Object var2_2 = null;
            if (h.lIlIlII(string.contains(lIIIl[lIIlI[28]]) ? 1 : 0)) {
                var12 = string.replace(lIIIl[lIIlI[29]], lIIIl[lIIlI[30]]).trim();
            }
            int var13 = lIIlI[0];
            while (h.lIlIlIl(var13, var11.size())) {
                String var14 = ((Item)var11.get(var13)).getName();
                if (h.lIlllII(var14)) {
                    String var15;
                    if (h.lIlIlII(var14.contains(var15) ? 1 : 0)) {
                        return lIIlI[1];
                    }
                    if (h.lIlllII(var12) && h.lIlIlII(var14.contains(var12) ? 1 : 0)) {
                        return lIIlI[1];
                    }
                }
                ++var13;
                0;
                if (((0x7F ^ 0x50) & ~(0x8A ^ 0xA5)) == 0) continue;
                return ((3 ^ 0x5A) & ~(0x77 ^ 0x2E)) != 0;
            }
        }
        return lIIlI[0];
    }

    private static boolean lIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllII(Object object) {
        return object != null;
    }

    public static void P() {
        Widget widget = Widgets.get((int)lIIlI[31], (int)lIIlI[8], (int)lIIlI[25]);
        if (h.lIlllII(widget)) {
            widget.interact(lIIIl[lIIlI[32]]);
            Time.sleepTicks((int)lIIlI[8]);
            0;
        }
    }

    private static boolean lIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void a(List<j> list) {
        block52: {
            List<j> var16;
            int lllllIlIlIIllII2;
            if (h.lIlIIll(list.isEmpty() ? 1 : 0) && h.lIlIlII(ad.isEmpty() ? 1 : 0)) {
                lllllIlIlIIllII2 = lIIlI[0];
                while (h.lIlIlIl(lllllIlIlIIllII2, var16.size())) {
                    ad.add(var16.get(lllllIlIlIIllII2).Z());
                    0;
                    ae.add(var16.get(lllllIlIlIIllII2).aa());
                    0;
                    af.add(var16.get(lllllIlIlIIllII2).ab());
                    0;
                    ++lllllIlIlIIllII2;
                    0;
                    if null == null continue;
                    return;
                }
            }
            int[] nArray = new int[lIIlI[1]];
            nArray[h.lIIlI[0]] = lIIlI[2];
            if (!h.lIlIllI(Inventory.getCount((int[])nArray), lIIlI[1]) || h.lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                if (h.lIlIlII(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlI[4]);
                    0;
                    Predicate<Item> lllllIlIlIIllII2 = item -> item.getName().toLowerCase().contains(lIIIl[lIIlI[35]]);
                    if (h.lIlIlII(Bank.contains(lllllIlIlIIllII2) ? 1 : 0) && h.lIlIIll(Inventory.contains(item -> item.getName().contains(lIIIl[lIIlI[34]])) ? 1 : 0) && h.lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                        Bank.withdraw(lllllIlIlIIllII2, (int)lIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIlI[4]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (h.lIllIlI(Inventory.getCount((Predicate)lllllIlIlIIllII2))) {
                                bl = lIIlI[1];
                                0;
                                if (1 > 1) {
                                    return (3 & ~3) != 0;
                                }
                            } else {
                                bl = lIIlI[0];
                            }
                            return bl;
                        }, (int)lIIlI[5]);
                        0;
                    }
                    if (h.lIlIIll(Bank.contains((int[])m.bW) ? 1 : 0) && h.lIlIIll(Inventory.contains(item -> item.getName().contains(lIIIl[lIIlI[33]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlI[1]];
                        nArray2[h.lIIlI[0]] = lIIlI[6];
                        if (h.lIlIlII(Bank.contains((int[])nArray2) ? 1 : 0) && h.lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                            Bank.withdraw((int)lIIlI[6], (int)lIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIlI[4]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIlI[1]];
                                nArray[h.lIIlI[0]] = lIIlI[6];
                                if (h.lIllIlI(Inventory.getCount((int[])nArray))) {
                                    bl = lIIlI[1];
                                    0;
                                    if (1 < -1) {
                                        return ((0x8B ^ 0x93) & ~(0xC ^ 0x14)) != 0;
                                    }
                                } else {
                                    bl = lIIlI[0];
                                }
                                return bl;
                            }, (int)lIIlI[5]);
                            0;
                        }
                    }
                    if (h.lIllIII(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                        int[] nArray3 = new int[lIIlI[1]];
                        nArray3[h.lIIlI[0]] = lIIlI[2];
                        if (h.lIlIlIl(Inventory.getCount((int[])nArray3), lIIlI[1])) {
                            Bank.withdrawAll((int)lIIlI[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIlI[4]);
                            0;
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lIIlI[1]];
                                nArray[h.lIIlI[0]] = lIIlI[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lIIlI[5]);
                            0;
                        }
                    }
                }
                if (h.lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                    if (h.lIlIlII(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIIlI[7]);
                        0;
                    }
                    if (h.lIlIIll(Bank.isOpen() ? 1 : 0)) {
                        if (h.lIlIlII(Inventory.contains((int[])m.bW) ? 1 : 0)) {
                            Inventory.getFirst((int[])m.bW).interact(lIIIl[lIIlI[0]]);
                            Time.sleepTicks((int)lIIlI[8]);
                            0;
                        }
                        if (h.lIlIlII(Equipment.contains((int[])m.bW) ? 1 : 0) && h.lIllIIl(Players.getLocal().getAnimation(), lIIlI[9])) {
                            Equipment.getFirst((int[])m.bW).interact(lIIIl[lIIlI[1]]);
                            Time.sleepTicks((int)lIIlI[4]);
                            0;
                        }
                        Movement.walkTo((WorldPoint)ac);
                        0;
                    }
                }
            }
            if (h.lIlIIll(Bank.isOpen() ? 1 : 0) && h.lIllIII(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                int[] nArray4 = new int[lIIlI[1]];
                nArray4[h.lIIlI[0]] = lIIlI[2];
                if (h.lIlIlIl(Inventory.getCount((int[])nArray4), lIIlI[1])) {
                    g.G();
                }
            }
            if (h.lIlIIll(GrandExchange.isOpen() ? 1 : 0)) {
                int[] nArray5 = new int[lIIlI[1]];
                nArray5[h.lIIlI[0]] = lIIlI[2];
                if (h.lIllIlI(Inventory.getCount((int[])nArray5)) && h.lIllIII(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                    GrandExchange.open();
                    Time.sleepUntil(() -> GrandExchange.isOpen(), (int)lIIlI[5]);
                    0;
                }
            }
            if (!h.lIlIlII(GrandExchange.isOpen() ? 1 : 0)) break block52;
            int[] nArray6 = new int[lIIlI[1]];
            nArray6[h.lIIlI[0]] = lIIlI[2];
            if (!h.lIllIlI(Inventory.getCount((int[])nArray6))) break block52;
            lllllIlIlIIllII2 = lIIlI[0];
            while (h.lIlIlIl(lllllIlIlIIllII2, ad.size())) {
                String var17 = i.a(ad.get(lllllIlIlIIllII2));
                System.out.println("Buying " + var17 + " and itemID is: " + String.valueOf(ad.get(lllllIlIlIIllII2)));
                while (h.lIlIIll(h.b(var17) ? 1 : 0)) {
                    block56: {
                        block57: {
                            block55: {
                                block54: {
                                    block53: {
                                        if (h.lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                                            int var18;
                                            int n2;
                                            int var19 = lllllIlIlIIllII2;
                                            if (h.lIllIlI(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (h.lIllIll(grandExchangeOffer.getItemId(), ad.get(var19))) {
                                                    bl = lIIlI[1];
                                                    0;
                                                    if (-(0x43 ^ 0x47) > 0) {
                                                        return ((0x3A ^ 0x58) & ~(0x40 ^ 0x22)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIlI[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lIIlI[1];
                                                0;
                                                if null != null {
                                                    return;
                                                }
                                            } else {
                                                n2 = lIIlI[0];
                                            }
                                            if (h.lIlIlII(var18 = n2) && h.lIlIlll(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (h.lIllIll(grandExchangeOffer.getItemId(), ad.get(var19))) {
                                                    bl = lIIlI[1];
                                                    0;
                                                    if null != null {
                                                        return ((0x74 ^ 0x4D) & ~(0xA9 ^ 0x90)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIlI[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), lIIlI[1])) {
                                                GrandExchange.abortOffer((int)ad.get(lllllIlIlIIllII2));
                                            }
                                            if (h.lIlIIll(var18)) {
                                                if (h.lIlIlII(GrandExchange.buy((int)ad.get(lllllIlIlIIllII2), (int)ae.get(lllllIlIlIIllII2), (int)af.get(lllllIlIlIIllII2)) ? 1 : 0)) {
                                                    Time.sleepTicks((int)lIIlI[7]);
                                                    0;
                                                    Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIIlI[10]);
                                                    0;
                                                }
                                                if (h.lIllIll(GrandExchange.getItemId(), ad.get(lllllIlIlIIllII2)) && h.lIllIIl(GrandExchange.getQuantity(), ae.get(lllllIlIlIIllII2))) {
                                                    GrandExchange.setQuantity((int)ae.get(lllllIlIlIIllII2));
                                                }
                                                if (h.lIllIll(GrandExchange.getItemId(), ad.get(lllllIlIlIIllII2)) && h.lIllIIl(GrandExchange.getPrice(), af.get(lllllIlIlIIllII2))) {
                                                    GrandExchange.setPrice((int)af.get(lllllIlIlIIllII2));
                                                }
                                            }
                                        }
                                        if (h.lIlIlII(GrandExchange.canCollect() ? 1 : 0)) {
                                            GrandExchange.collect();
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (h.lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                                                    bl = lIIlI[1];
                                                    0;
                                                    if (-1 == (0xB8 ^ 0xBC)) {
                                                        return ((0x47 ^ 0x63) & ~(0x60 ^ 0x44)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIlI[0];
                                                }
                                                return bl;
                                            }, (int)lIIlI[5]);
                                            0;
                                        }
                                        if (!h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[11])) break block53;
                                        int[] nArray7 = new int[lIIlI[1]];
                                        nArray7[h.lIIlI[0]] = lIIlI[11];
                                        if (!h.lIlIIll(Inventory.contains((int[])nArray7) ? 1 : 0)) break block54;
                                    }
                                    if (!h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[12])) break block55;
                                }
                                ad.remove(lIIlI[0]);
                                0;
                                ae.remove(lIIlI[0]);
                                0;
                                af.remove(lIIlI[0]);
                                0;
                                var16.remove(lIIlI[0]);
                                0;
                                Time.sleepTicks((int)lIIlI[8]);
                                0;
                                System.out.println(lIIIl[lIIlI[8]]);
                                0;
                                if (2 > 1) continue;
                                return;
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[13])) {
                                int[] nArray8 = new int[lIIlI[1]];
                                nArray8[h.lIIlI[0]] = lIIlI[13];
                                if (h.lIlIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    0;
                                    ae.remove(lIIlI[0]);
                                    0;
                                    af.remove(lIIlI[0]);
                                    0;
                                    var16.remove(lIIlI[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlI[8]);
                                    0;
                                    System.out.println(lIIIl[lIIlI[4]]);
                                    0;
                                    if (3 > -1) continue;
                                    return;
                                }
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[14])) {
                                int[] nArray9 = new int[lIIlI[1]];
                                nArray9[h.lIIlI[0]] = lIIlI[15];
                                if (h.lIlIlII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    0;
                                    ae.remove(lIIlI[0]);
                                    0;
                                    af.remove(lIIlI[0]);
                                    0;
                                    var16.remove(lIIlI[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlI[8]);
                                    0;
                                    System.out.println(lIIIl[lIIlI[7]]);
                                    0;
                                    if (1 != 0) continue;
                                    return;
                                }
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[16])) {
                                int[] nArray10 = new int[lIIlI[1]];
                                nArray10[h.lIIlI[0]] = lIIlI[16];
                                if (h.lIlIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    0;
                                    ae.remove(lIIlI[0]);
                                    0;
                                    af.remove(lIIlI[0]);
                                    0;
                                    var16.remove(lIIlI[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlI[8]);
                                    0;
                                    System.out.println(lIIIl[lIIlI[17]]);
                                    0;
                                    if (1 == 1) continue;
                                    return;
                                }
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[18])) {
                                int[] nArray11 = new int[lIIlI[1]];
                                nArray11[h.lIIlI[0]] = lIIlI[18];
                                if (h.lIlIlII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    0;
                                    ae.remove(lIIlI[0]);
                                    0;
                                    af.remove(lIIlI[0]);
                                    0;
                                    var16.remove(lIIlI[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlI[8]);
                                    0;
                                    System.out.println(lIIIl[lIIlI[19]]);
                                    0;
                                    if (2 < (0x85 ^ 0x81)) continue;
                                    return;
                                }
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[20])) {
                                int[] nArray12 = new int[lIIlI[1]];
                                nArray12[h.lIIlI[0]] = lIIlI[20];
                                if (h.lIlIlII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);
                                    0;
                                    ae.remove(lIIlI[0]);
                                    0;
                                    af.remove(lIIlI[0]);
                                    0;
                                    var16.remove(lIIlI[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlI[8]);
                                    0;
                                    System.out.println(lIIIl[lIIlI[21]]);
                                    0;
                                    if (1 == 1) continue;
                                    return;
                                }
                            }
                            if (!h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[22])) break block56;
                            String[] stringArray = new String[lIIlI[1]];
                            stringArray[h.lIIlI[0]] = lIIIl[lIIlI[23]];
                            if (!h.lIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block57;
                            String[] stringArray2 = new String[lIIlI[1]];
                            stringArray2[h.lIIlI[0]] = lIIIl[lIIlI[24]];
                            if (!h.lIlIlII(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block56;
                        }
                        ad.remove(lIIlI[0]);
                        0;
                        ae.remove(lIIlI[0]);
                        0;
                        af.remove(lIIlI[0]);
                        0;
                        var16.remove(lIIlI[0]);
                        0;
                        Time.sleepTicks((int)lIIlI[8]);
                        0;
                        System.out.println(lIIIl[lIIlI[3]]);
                        0;
                        if null == null continue;
                        return;
                    }
                    if (!h.lIlIIll(h.b(var17) ? 1 : 0)) break;
                    if (h.lIlIlII(Clues.d)) {
                        0;
                        if (1 == 1) break;
                        return;
                    }
                    Time.sleepTicks((int)lIIlI[4]);
                    0;
                    0;
                    
                    return;
                }
                if (h.lIlIlII(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (h.lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lIIlI[1];
                            0;
                            if ((0x18 ^ 0x3E ^ (0x46 ^ 0x64)) < ((0x1D ^ 0x20 ^ (0x5C ^ 0x53)) & (70 + 79 - 116 + 144 ^ 54 + 82 - 10 + 5 ^ -1))) {
                                return ((0x4F ^ 0x2D ^ (0x45 ^ 0x78)) & (94 + 98 - 183 + 184 ^ 104 + 107 - 147 + 94 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlI[0];
                        }
                        return bl;
                    }, (int)lIIlI[5]);
                    0;
                }
                System.out.println(var16.get(lllllIlIlIIllII2).Z());
                if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[12])) {
                    System.out.println(lIIIl[lIIlI[25]]);
                    ad.remove(lIIlI[0]);
                    0;
                    ae.remove(lIIlI[0]);
                    0;
                    af.remove(lIIlI[0]);
                    0;
                    var16.remove(lIIlI[0]);
                    0;
                }
                if (h.lIlIlII(h.b(var17) ? 1 : 0)) {
                    System.out.println("Removed item " + var17 + " from list");
                    ad.remove(lIIlI[0]);
                    0;
                    ae.remove(lIIlI[0]);
                    0;
                    af.remove(lIIlI[0]);
                    0;
                    var16.remove(lIIlI[0]);
                    0;
                }
                Time.sleepTicks((int)lIIlI[8]);
                0;
                ++lllllIlIlIIllII2;
                0;
                if ((0x41 ^ 0x3B ^ (0xEE ^ 0x90)) == (0x61 ^ 0x15 ^ (0xB0 ^ 0xC0))) continue;
                return;
            }
        }
    }

    private static boolean lIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    public static void b(List<Integer> list) {
        if (h.lIlIIll(GrandExchange.isOpen() ? 1 : 0)) {
            if (h.lIlIlII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (h.lIlIIll(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (h.lIlIlII(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> var20;
            Time.sleepTicks((int)lIIlI[8]);
            0;
            int var21 = lIIlI[0];
            while (h.lIlIlIl(var21, var20.size())) {
                int[] nArray = new int[lIIlI[1]];
                nArray[h.lIIlI[0]] = var20.get(var21);
                if (h.lIllIlI(Inventory.getCount((int[])nArray))) {
                    int var22;
                    if (h.lIlIIll(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlI[1]];
                        nArray2[h.lIIlI[0]] = var20.get(var21);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lIIlI[8]);
                        0;
                        var22 = var21;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (h.lIllIll(GrandExchange.getItemId(), (Integer)var20.get(var22))) {
                                bl = lIIlI[1];
                                0;
                                if (1 <= ((0xAD ^ 0x98) & ~(0x46 ^ 0x73))) {
                                    return ((0x35 ^ 0x22) & ~(0x12 ^ 5)) != 0;
                                }
                            } else {
                                bl = lIIlI[0];
                            }
                            return bl;
                        }, (int)lIIlI[26]);
                        0;
                    }
                    if (h.lIlIlII(GrandExchange.isSelling() ? 1 : 0)) {
                        if (h.lIllIIl(GrandExchange.getPrice(), lIIlI[27])) {
                            GrandExchange.setPrice((int)lIIlI[1]);
                            Time.sleepTicks((int)lIIlI[8]);
                            0;
                            var22 = var21;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (h.lIllIll(GrandExchange.getPrice(), lIIlI[1])) {
                                    bl = lIIlI[1];
                                    0;
                                    if (3 >= (0x7B ^ 0x4D ^ (0x8D ^ 0xBF))) {
                                        return (3 & (3 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIlI[0];
                                }
                                return bl;
                            }, (int)lIIlI[26]);
                            0;
                        }
                        if (h.lIllIll(GrandExchange.getPrice(), lIIlI[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIIlI[26]);
                            0;
                        }
                    }
                    if (h.lIlIlII(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (h.lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lIIlI[1];
                                0;
                                if (2 > 2) {
                                    return ((0x13 ^ 0x39) & ~(0x9C ^ 0xB6)) != 0;
                                }
                            } else {
                                bl = lIIlI[0];
                            }
                            return bl;
                        }, (int)lIIlI[5]);
                        0;
                    }
                }
                ++var21;
                0;
                if (-(0xD3 ^ 0xA0 ^ (0x67 ^ 0x10)) <= 0) continue;
                return;
            }
        }
    }

    private static boolean lIllIlI(int n2) {
        return n2 > 0;
    }

    private static String lIIllll(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = lIIlI[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = lIIlI[0];
        while (h.lIlIlIl(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if ((0x63 ^ 0x67) > 3) continue;
            return null;
        }
        return String.valueOf(var25);
    }
}

