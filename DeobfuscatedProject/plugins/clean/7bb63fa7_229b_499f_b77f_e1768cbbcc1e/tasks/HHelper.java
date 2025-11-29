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

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.GHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.IHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.JHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.MHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

public class HHelper {
    public static  List<Integer> af;
    public static  List<Integer> ae;
    public static final  WorldPoint ac;
    public static  List<Integer> ad;

    private static boolean lIlIIll(int n2) {
        return n2 == 0;
    }

    static {
        h.lIlIIlI();
        h.lIlIIIl();
        ac = new WorldPoint(lIIlI[36], lIIlI[37], lIIlI[0]);
        ad = new ArrayList<Integer>();
        ae = new ArrayList<Integer>();
        af = new ArrayList<Integer>();
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

    /*
     * WARNING - void declaration
     */
    public static boolean b(String string) {
        List list = Inventory.getAll();
        if (h.lIlIIll(list.isEmpty() ? 1 : 0)) {
            void lllllIlIIllllII;
            String lllllIlIIlllIll;
            Object var2_2 = null;
            if (h.lIlIlII(string.contains(lIIIl[lIIlI[28]]) ? 1 : 0)) {
                lllllIlIIlllIll = string.replace(lIIIl[lIIlI[29]], lIIIl[lIIlI[30]]).trim();
            }
            int lllllIlIIlllIlI = lIIlI[0];
            while (h.lIlIlIl(lllllIlIIlllIlI, lllllIlIIllllII.size())) {
                String lllllIlIIlllIIl = ((Item)lllllIlIIllllII.get(lllllIlIIlllIlI)).getName();
                if (h.lIlllII(lllllIlIIlllIIl)) {
                    String lllllIlIIllllIl;
                    if (h.lIlIlII(lllllIlIIlllIIl.contains(lllllIlIIllllIl) ? 1 : 0)) {
                        return lIIlI[1];
                    }
                    if (h.lIlllII(lllllIlIIlllIll) && h.lIlIlII(lllllIlIIlllIIl.contains(lllllIlIIlllIll) ? 1 : 0)) {
                        return lIIlI[1];
                    }
                }
                ++lllllIlIIlllIlI;

                if (((0x7F ^ 0x50) & ~(0x8A ^ 0xA5)) == 0) continue;
                return false;
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

        }
    }

    private static boolean lIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void a(List<j> list) {
        block52: {
            List<j> lllllIlIlIIllIl;
            int lllllIlIlIIllII2;
            if (h.lIlIIll(list.isEmpty() ? 1 : 0) && h.lIlIlII(ad.isEmpty() ? 1 : 0)) {
                lllllIlIlIIllII2 = lIIlI[0];
                while (h.lIlIlIl(lllllIlIlIIllII2, lllllIlIlIIllIl.size())) {
                    ad.add(lllllIlIlIIllIl.get(lllllIlIlIIllII2).Z());

                    ae.add(lllllIlIlIIllIl.get(lllllIlIlIIllII2).aa());

                    af.add(lllllIlIlIIllIl.get(lllllIlIlIIllII2).ab());

                    ++lllllIlIlIIllII2;

                    return;
                }
            }
            int[] nArray = new int[lIIlI[1]];
            nArray[h.lIIlI[0]] = lIIlI[2];
            if (!h.lIlIllI(Inventory.getCount((int[])nArray), lIIlI[1]) || h.lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                if (h.lIlIlII(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlI[4]);

                    Predicate<Item> lllllIlIlIIllII2 = item -> item.getName().toLowerCase().contains(lIIIl[lIIlI[35]]);
                    if (h.lIlIlII(Bank.contains(lllllIlIlIIllII2) ? 1 : 0) && h.lIlIIll(Inventory.contains(item -> item.getName().contains(lIIIl[lIIlI[34]])) ? 1 : 0) && h.lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                        Bank.withdraw(lllllIlIlIIllII2, (int)lIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIlI[4]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (h.lIllIlI(Inventory.getCount((Predicate)lllllIlIlIIllII2))) {
                                bl = lIIlI[1];

                                if (1 > 1) {
                                    return (3 & ~3) != 0;
                                }
                            } else {
                                bl = lIIlI[0];
                            }
                            return bl;
                        }, (int)lIIlI[5]);

                    }
                    if (h.lIlIIll(Bank.contains((int[])m.bW) ? 1 : 0) && h.lIlIIll(Inventory.contains(item -> item.getName().contains(lIIIl[lIIlI[33]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlI[1]];
                        nArray2[h.lIIlI[0]] = lIIlI[6];
                        if (h.lIlIlII(Bank.contains((int[])nArray2) ? 1 : 0) && h.lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                            Bank.withdraw((int)lIIlI[6], (int)lIIlI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIlI[4]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIlI[1]];
                                nArray[h.lIIlI[0]] = lIIlI[6];
                                if (h.lIllIlI(Inventory.getCount((int[])nArray))) {
                                    bl = lIIlI[1];

                                    if (1 < -1) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIlI[0];
                                }
                                return bl;
                            }, (int)lIIlI[5]);

                        }
                    }
                    if (h.lIllIII(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                        int[] nArray3 = new int[lIIlI[1]];
                        nArray3[h.lIIlI[0]] = lIIlI[2];
                        if (h.lIlIlIl(Inventory.getCount((int[])nArray3), lIIlI[1])) {
                            Bank.withdrawAll((int)lIIlI[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIlI[4]);

                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lIIlI[1]];
                                nArray[h.lIIlI[0]] = lIIlI[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lIIlI[5]);

                        }
                    }
                }
                if (h.lIlIlll(Players.getLocal().getWorldLocation().distanceTo(ac), lIIlI[3])) {
                    if (h.lIlIlII(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIIlI[7]);

                    }
                    if (h.lIlIIll(Bank.isOpen() ? 1 : 0)) {
                        if (h.lIlIlII(Inventory.contains((int[])m.bW) ? 1 : 0)) {
                            Inventory.getFirst((int[])m.bW).interact(lIIIl[lIIlI[0]]);
                            Time.sleepTicks((int)lIIlI[8]);

                        }
                        if (h.lIlIlII(Equipment.contains((int[])m.bW) ? 1 : 0) && h.lIllIIl(Players.getLocal().getAnimation(), lIIlI[9])) {
                            Equipment.getFirst((int[])m.bW).interact(lIIIl[lIIlI[1]]);
                            Time.sleepTicks((int)lIIlI[4]);

                        }
                        Movement.walkTo((WorldPoint)ac);

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

                }
            }
            if (!h.lIlIlII(GrandExchange.isOpen() ? 1 : 0)) break block52;
            int[] nArray6 = new int[lIIlI[1]];
            nArray6[h.lIIlI[0]] = lIIlI[2];
            if (!h.lIllIlI(Inventory.getCount((int[])nArray6))) break block52;
            lllllIlIlIIllII2 = lIIlI[0];
            while (h.lIlIlIl(lllllIlIlIIllII2, ad.size())) {
                String lllllIlIlIIlIll = i.a(ad.get(lllllIlIlIIllII2));
                System.out.println("Buying " + lllllIlIlIIlIll + " and itemID is: " + String.valueOf(ad.get(lllllIlIlIIllII2)));
                while (h.lIlIIll(h.b(lllllIlIlIIlIll) ? 1 : 0)) {
                    block56: {
                        block57: {
                            block55: {
                                block54: {
                                    block53: {
                                        if (h.lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                                            int lllllIlIlIIlIIl;
                                            int n2;
                                            int lllllIlIlIIlIlI = lllllIlIlIIllII2;
                                            if (h.lIllIlI(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (h.lIllIll(grandExchangeOffer.getItemId(), ad.get(lllllIlIlIIlIlI))) {
                                                    bl = lIIlI[1];

                                                    if (-(0x43 ^ 0x47) > 0) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = lIIlI[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lIIlI[1];

                                                }
                                            } else {
                                                n2 = lIIlI[0];
                                            }
                                            if (h.lIlIlII(lllllIlIlIIlIIl = n2) && h.lIlIlll(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (h.lIllIll(grandExchangeOffer.getItemId(), ad.get(lllllIlIlIIlIlI))) {
                                                    bl = lIIlI[1];

                                                    }
                                                } else {
                                                    bl = lIIlI[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), lIIlI[1])) {
                                                GrandExchange.abortOffer((int)ad.get(lllllIlIlIIllII2));
                                            }
                                            if (h.lIlIIll(lllllIlIlIIlIIl)) {
                                                if (h.lIlIlII(GrandExchange.buy((int)ad.get(lllllIlIlIIllII2), (int)ae.get(lllllIlIlIIllII2), (int)af.get(lllllIlIlIIllII2)) ? 1 : 0)) {
                                                    Time.sleepTicks((int)lIIlI[7]);

                                                    Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIIlI[10]);

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

                                                    if (-1 == (0xB8 ^ 0xBC)) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = lIIlI[0];
                                                }
                                                return bl;
                                            }, (int)lIIlI[5]);

                                        }
                                        if (!h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[11])) break block53;
                                        int[] nArray7 = new int[lIIlI[1]];
                                        nArray7[h.lIIlI[0]] = lIIlI[11];
                                        if (!h.lIlIIll(Inventory.contains((int[])nArray7) ? 1 : 0)) break block54;
                                    }
                                    if (!h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[12])) break block55;
                                }
                                ad.remove(lIIlI[0]);

                                ae.remove(lIIlI[0]);

                                af.remove(lIIlI[0]);

                                lllllIlIlIIllIl.remove(lIIlI[0]);

                                Time.sleepTicks((int)lIIlI[8]);

                                System.out.println(lIIIl[lIIlI[8]]);

                                if (2 > 1) continue;
                                return;
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[13])) {
                                int[] nArray8 = new int[lIIlI[1]];
                                nArray8[h.lIIlI[0]] = lIIlI[13];
                                if (h.lIlIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);

                                    ae.remove(lIIlI[0]);

                                    af.remove(lIIlI[0]);

                                    lllllIlIlIIllIl.remove(lIIlI[0]);

                                    Time.sleepTicks((int)lIIlI[8]);

                                    System.out.println(lIIIl[lIIlI[4]]);

                                    if (3 > -1) continue;
                                    return;
                                }
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[14])) {
                                int[] nArray9 = new int[lIIlI[1]];
                                nArray9[h.lIIlI[0]] = lIIlI[15];
                                if (h.lIlIlII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);

                                    ae.remove(lIIlI[0]);

                                    af.remove(lIIlI[0]);

                                    lllllIlIlIIllIl.remove(lIIlI[0]);

                                    Time.sleepTicks((int)lIIlI[8]);

                                    System.out.println(lIIIl[lIIlI[7]]);

                                    if (1 != 0) continue;
                                    return;
                                }
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[16])) {
                                int[] nArray10 = new int[lIIlI[1]];
                                nArray10[h.lIIlI[0]] = lIIlI[16];
                                if (h.lIlIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);

                                    ae.remove(lIIlI[0]);

                                    af.remove(lIIlI[0]);

                                    lllllIlIlIIllIl.remove(lIIlI[0]);

                                    Time.sleepTicks((int)lIIlI[8]);

                                    System.out.println(lIIIl[lIIlI[17]]);

                                    if (1 == 1) continue;
                                    return;
                                }
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[18])) {
                                int[] nArray11 = new int[lIIlI[1]];
                                nArray11[h.lIIlI[0]] = lIIlI[18];
                                if (h.lIlIlII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);

                                    ae.remove(lIIlI[0]);

                                    af.remove(lIIlI[0]);

                                    lllllIlIlIIllIl.remove(lIIlI[0]);

                                    Time.sleepTicks((int)lIIlI[8]);

                                    System.out.println(lIIIl[lIIlI[19]]);

                                    if (2 < (0x85 ^ 0x81)) continue;
                                    return;
                                }
                            }
                            if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[20])) {
                                int[] nArray12 = new int[lIIlI[1]];
                                nArray12[h.lIIlI[0]] = lIIlI[20];
                                if (h.lIlIlII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    ad.remove(lIIlI[0]);

                                    ae.remove(lIIlI[0]);

                                    af.remove(lIIlI[0]);

                                    lllllIlIlIIllIl.remove(lIIlI[0]);

                                    Time.sleepTicks((int)lIIlI[8]);

                                    System.out.println(lIIIl[lIIlI[21]]);

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

                        ae.remove(lIIlI[0]);

                        af.remove(lIIlI[0]);

                        lllllIlIlIIllIl.remove(lIIlI[0]);

                        Time.sleepTicks((int)lIIlI[8]);

                        System.out.println(lIIIl[lIIlI[3]]);

                        return;
                    }
                    if (!h.lIlIIll(h.b(lllllIlIlIIlIll) ? 1 : 0)) break;
                    if (h.lIlIlII(Clues.d ? 1 : 0)) {

                        if (1 == 1) break;
                        return;
                    }
                    Time.sleepTicks((int)lIIlI[4]);

                    if (((0x40 ^ 0x65) & ~(0x65 ^ 0x40)) >= 0) continue;
                    return;
                }
                if (h.lIlIlII(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (h.lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lIIlI[1];

                            if ((0x18 ^ 0x3E ^ (0x46 ^ 0x64)) < ((0x1D ^ 0x20 ^ (0x5C ^ 0x53)) & (70 + 79 - 116 + 144 ^ 54 + 82 - 10 + 5 ^ -1))) {
                                return ((0x4F ^ 0x2D ^ (0x45 ^ 0x78)) & (94 + 98 - 183 + 184 ^ 104 + 107 - 147 + 94 ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlI[0];
                        }
                        return bl;
                    }, (int)lIIlI[5]);

                }
                System.out.println(lllllIlIlIIllIl.get(lllllIlIlIIllII2).Z());
                if (h.lIllIll(ad.get(lllllIlIlIIllII2), lIIlI[12])) {
                    System.out.println(lIIIl[lIIlI[25]]);
                    ad.remove(lIIlI[0]);

                    ae.remove(lIIlI[0]);

                    af.remove(lIIlI[0]);

                    lllllIlIlIIllIl.remove(lIIlI[0]);

                }
                if (h.lIlIlII(h.b(lllllIlIlIIlIll) ? 1 : 0)) {
                    System.out.println("Removed item " + lllllIlIlIIlIll + " from list");
                    ad.remove(lIIlI[0]);

                    ae.remove(lIIlI[0]);

                    af.remove(lIIlI[0]);

                    lllllIlIlIIllIl.remove(lIIlI[0]);

                }
                Time.sleepTicks((int)lIIlI[8]);

                ++lllllIlIlIIllII2;

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
            List<Integer> lllllIlIlIIIlIl;
            Time.sleepTicks((int)lIIlI[8]);

            int lllllIlIlIIIlII = lIIlI[0];
            while (h.lIlIlIl(lllllIlIlIIIlII, lllllIlIlIIIlIl.size())) {
                int[] nArray = new int[lIIlI[1]];
                nArray[h.lIIlI[0]] = lllllIlIlIIIlIl.get(lllllIlIlIIIlII);
                if (h.lIllIlI(Inventory.getCount((int[])nArray))) {
                    int lllllIlIlIIIIll;
                    if (h.lIlIIll(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlI[1]];
                        nArray2[h.lIIlI[0]] = lllllIlIlIIIlIl.get(lllllIlIlIIIlII);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lIIlI[8]);

                        lllllIlIlIIIIll = lllllIlIlIIIlII;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (h.lIllIll(GrandExchange.getItemId(), (Integer)lllllIlIlIIIlIl.get(lllllIlIlIIIIll))) {
                                bl = lIIlI[1];

                                if (1 <= ((0xAD ^ 0x98) & ~(0x46 ^ 0x73))) {
                                    return false;
                                }
                            } else {
                                bl = lIIlI[0];
                            }
                            return bl;
                        }, (int)lIIlI[26]);

                    }
                    if (h.lIlIlII(GrandExchange.isSelling() ? 1 : 0)) {
                        if (h.lIllIIl(GrandExchange.getPrice(), lIIlI[27])) {
                            GrandExchange.setPrice((int)lIIlI[1]);
                            Time.sleepTicks((int)lIIlI[8]);

                            lllllIlIlIIIIll = lllllIlIlIIIlII;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (h.lIllIll(GrandExchange.getPrice(), lIIlI[1])) {
                                    bl = lIIlI[1];

                                    if (3 >= (0x7B ^ 0x4D ^ (0x8D ^ 0xBF))) {
                                        return (3 & (3 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIlI[0];
                                }
                                return bl;
                            }, (int)lIIlI[26]);

                        }
                        if (h.lIllIll(GrandExchange.getPrice(), lIIlI[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIIlI[26]);

                        }
                    }
                    if (h.lIlIlII(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (h.lIlIIll(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lIIlI[1];

                                if (2 > 2) {
                                    return false;
                                }
                            } else {
                                bl = lIIlI[0];
                            }
                            return bl;
                        }, (int)lIIlI[5]);

                    }
                }
                ++lllllIlIlIIIlII;

                if (-(0xD3 ^ 0xA0 ^ (0x67 ^ 0x10)) <= 0) continue;
                return;
            }
        }
    }

    private static boolean lIllIlI(int n2) {
        return n2 > 0;
    }

        return String.valueOf(lllllIlIIIIIIlI);
    }
}

