/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.CHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.account.AccBuilderTempleTrek;
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
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class BHelper {
    
    public static  List<Integer> L;
    public static  List<Integer> J;
    
    public static  List<Integer> K;
    public static final  WorldPoint I;

    private static boolean llIIlIlIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlIlIIIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIlIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    public static void g() {
        Widget widget = Widgets.get((int)lllIlllIll[10], (int)lllIlllIll[8], (int)lllIlllIll[27]);
        if (b.llIIlIlIIIllI(widget)) {
            widget.interact(lllIlllIlI[lllIlllIll[28]]);
            Time.sleepTicks((int)lllIlllIll[8]);

        }
    }

    private static boolean llIIlIlIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIlIIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIlIIlllIll() {
        lllIlllIlI = new String[lllIlllIll[32]];
        b.lllIlllIlI[b.lllIlllIll[0]] = "Wear";
        b.lllIlllIlI[b.lllIlllIll[1]] = "Grand Exchange";
        b.lllIlllIlI[b.lllIlllIll[8]] = "In F2P, need to switch to a P2P world, ending script";
        b.lllIlllIlI[b.lllIlllIll[4]] = "Stamina potion(4)";
        b.lllIlllIlI[b.lllIlllIll[7]] = "Stamina potion (4)";
        b.lllIlllIlI[b.lllIlllIll[25]] = "tablet";
        b.lllIlllIlI[b.lllIlllIll[26]] = "(tablet)";
        b.lllIlllIlI[b.lllIlllIll[13]] = b.llIIlIIlllIlI("", "JaieJ");
        b.lllIlllIlI[b.lllIlllIll[28]] = "Close";
        b.lllIlllIlI[b.lllIlllIll[29]] = "wealth";
        b.lllIlllIlI[b.lllIlllIll[3]] = "wealth";
        b.lllIlllIlI[b.lllIlllIll[27]] = "ring of wealth (";
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string) {
        List list = Inventory.getAll();
        if (b.llIIlIIllllIl(list.isEmpty() ? 1 : 0)) {
            void var1;
            String var2;
            Object var2_2 = null;
            if (b.llIIlIIlllllI(string.contains(lllIlllIlI[lllIlllIll[25]]) ? 1 : 0)) {
                var2 = string.replace(lllIlllIlI[lllIlllIll[26]], lllIlllIlI[lllIlllIll[13]]).trim();
            }
            int var3 = lllIlllIll[0];
            while (b.llIIlIIllllll(var3, var1.size())) {
                String var4 = ((Item)var1.get(var3)).getName();
                if (b.llIIlIlIIIllI(var4)) {
                    String var5;
                    if (b.llIIlIIlllllI(var4.contains(var5) ? 1 : 0)) {
                        return lllIlllIll[1];
                    }
                    if (b.llIIlIlIIIllI(var2) && b.llIIlIIlllllI(var4.contains(var2) ? 1 : 0)) {
                        return lllIlllIll[1];
                    }
                }
                ++var3;

                if (2 < (0xE9 ^ 0x8B ^ (0xB ^ 0x6D))) continue;
                return (1 & (1 ^ -1)) != 0;
            }
        }
        return lllIlllIll[0];
    }

    public static void BHelper(List<Integer> list) {
        if (b.llIIlIIllllIl(GrandExchange.isOpen() ? 1 : 0)) {
            if (b.llIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (b.llIIlIIllllIl(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (b.llIIlIIlllllI(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> var6;
            Time.sleepTicks((int)lllIlllIll[8]);

            int var7 = lllIlllIll[0];
            while (b.llIIlIIllllll(var7, var6.size())) {
                int[] nArray = new int[lllIlllIll[1]];
                nArray[b.lllIlllIll[0]] = var6.get(var7);
                if (b.llIIlIlIIIlII(Inventory.getCount((int[])nArray))) {
                    int var8;
                    if (b.llIIlIIllllIl(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lllIlllIll[1]];
                        nArray2[b.lllIlllIll[0]] = var6.get(var7);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lllIlllIll[8]);

                        var8 = var7;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), (Integer)var6.get(var8))) {
                                bl = lllIlllIll[1];

                                if (3 < 1) {
                                    return false;
                                }
                            } else {
                                bl = lllIlllIll[0];
                            }
                            return bl;
                        }, (int)lllIlllIll[23]);

                    }
                    if (b.llIIlIIlllllI(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.llIIlIlIIIIll(GrandExchange.getPrice(), lllIlllIll[24])) {
                            GrandExchange.setPrice((int)lllIlllIll[1]);
                            Time.sleepTicks((int)lllIlllIll[8]);

                            var8 = var7;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.llIIlIlIIIlIl(GrandExchange.getPrice(), lllIlllIll[1])) {
                                    bl = lllIlllIll[1];

                                    if (((0x59 ^ 0xC) & ~(0x65 ^ 0x30)) != 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lllIlllIll[0];
                                }
                                return bl;
                            }, (int)lllIlllIll[23]);

                        }
                        if (b.llIIlIlIIIlIl(GrandExchange.getPrice(), lllIlllIll[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lllIlllIll[23]);

                        }
                    }
                    if (b.llIIlIIlllllI(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lllIlllIll[1];

                                if ((109 + 176 - 166 + 70 ^ 175 + 173 - 246 + 83) < 0) {
                                    return ((5 ^ 0x35 ^ (0x4C ^ 0x5E)) & (0 ^ 0x5B ^ (0xD8 ^ 0xA1) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIlllIll[0];
                            }
                            return bl;
                        }, (int)lllIlllIll[5]);

                    }
                }
                ++var7;

                return;
            }
        }
    }

    static {
        b.llIIlIIllllII();
        b.llIIlIIlllIll();
        I = new WorldPoint(lllIlllIll[30], lllIlllIll[31], lllIlllIll[0]);
        J = new ArrayList<Integer>();
        K = new ArrayList<Integer>();
        L = new ArrayList<Integer>();
    }

        return String.valueOf(var9);
    }

    private static boolean llIIlIIllllIl(int n2) {
        return n2 == 0;
    }

    public static void a(int n2) {
        int var10;
        int n3;
        int var11;
        if (b.llIIlIIllllIl(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.llIIlIIlllllI(Static.getClient().isItemDefinitionCached(var11) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(var11).getLinkedNoteId();

            if (3 < ((0x77 ^ 0x45 ^ 1) & (30 + 14 - -65 + 35 ^ 36 + 113 - 120 + 134 ^ -1))) {
                return;
            }
        } else {
            n3 = var10 = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(var11).getLinkedNoteId())).intValue();
        }
        if (!b.llIIlIlIIIIll(GrandExchange.getItemId(), lllIlllIll[24]) || b.llIIlIlIIIIll(GrandExchange.getItemId(), var11) && b.llIIlIlIIIIll(GrandExchange.getItemId(), var10)) {
            if (b.llIIlIIllllIl(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)var11);
        }
    }

    private static boolean llIIlIIlllllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIlIIIllI(Object object) {
        return object != null;
    }

    private static boolean llIIlIlIIIlII(int n2) {
        return n2 > 0;
    }

    public static void a(List<d> list) {
        block65: {
            List<d> var12;
            int lllllllllllllllllIllIIllIIlllIII2;
            if (b.llIIlIIllllIl(list.isEmpty() ? 1 : 0) && b.llIIlIIlllllI(J.isEmpty() ? 1 : 0)) {
                lllllllllllllllllIllIIllIIlllIII2 = lllIlllIll[0];
                while (b.llIIlIIllllll(lllllllllllllllllIllIIllIIlllIII2, var12.size())) {
                    J.add(var12.get(lllllllllllllllllIllIIllIIlllIII2).p());

                    K.add(var12.get(lllllllllllllllllIllIIllIIlllIII2).q());

                    L.add(var12.get(lllllllllllllllllIllIIllIIlllIII2).r());

                    ++lllllllllllllllllIllIIllIIlllIII2;

                    if (2 == 2) continue;
                    return;
                }
            }
            int[] nArray = new int[lllIlllIll[1]];
            nArray[b.lllIlllIll[0]] = lllIlllIll[2];
            if (!b.llIIlIlIIIIII(Inventory.getCount((int[])nArray), lllIlllIll[1]) || b.llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                if (b.llIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlllIll[4]);

                    Predicate<Item> lllllllllllllllllIllIIllIIlllIII2 = item -> item.getName().toLowerCase().contains(lllIlllIlI[lllIlllIll[27]]);
                    if (b.llIIlIIlllllI(Bank.contains(lllllllllllllllllIllIIllIIlllIII2) ? 1 : 0) && b.llIIlIIllllIl(Inventory.contains(item -> item.getName().contains(lllIlllIlI[lllIlllIll[3]])) ? 1 : 0) && b.llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                        Bank.withdraw(lllllllllllllllllIllIIllIIlllIII2, (int)lllIlllIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlllIll[4]);

                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llIIlIlIIIlII(Inventory.getCount((Predicate)lllllllllllllllllIllIIllIIlllIII2))) {
                                bl = lllIlllIll[1];

                            } else {
                                bl = lllIlllIll[0];
                            }
                            return bl;
                        }, (int)lllIlllIll[5]);

                    }
                    if (b.llIIlIIllllIl(Bank.contains((int[])f.be) ? 1 : 0) && b.llIIlIIllllIl(Inventory.contains(item -> item.getName().contains(lllIlllIlI[lllIlllIll[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIlllIll[1]];
                        nArray2[b.lllIlllIll[0]] = lllIlllIll[6];
                        if (b.llIIlIIlllllI(Bank.contains((int[])nArray2) ? 1 : 0) && b.llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                            Bank.withdraw((int)lllIlllIll[6], (int)lllIlllIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lllIlllIll[4]);

                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lllIlllIll[1]];
                                nArray[b.lllIlllIll[0]] = lllIlllIll[6];
                                if (b.llIIlIlIIIlII(Inventory.getCount((int[])nArray))) {
                                    bl = lllIlllIll[1];

                                    if (((65 + 217 - 175 + 120 ^ 56 + 167 - 54 + 19) & (0xAC ^ 0xC1 ^ (0x53 ^ 0x61) ^ -1)) > 0) {
                                        return ((0xA ^ 0x29 ^ (0x26 ^ 0x3E)) & (0xD5 ^ 0xA9 ^ (0x69 ^ 0x2E) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lllIlllIll[0];
                                }
                                return bl;
                            }, (int)lllIlllIll[5]);

                        }
                    }
                    if (b.llIIlIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                        int[] nArray3 = new int[lllIlllIll[1]];
                        nArray3[b.lllIlllIll[0]] = lllIlllIll[2];
                        if (b.llIIlIIllllll(Inventory.getCount((int[])nArray3), lllIlllIll[1])) {
                            Bank.withdrawAll((int)lllIlllIll[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lllIlllIll[4]);

                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lllIlllIll[1]];
                                nArray[b.lllIlllIll[0]] = lllIlllIll[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lllIlllIll[5]);

                        }
                    }
                }
                if (b.llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                    if (b.llIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lllIlllIll[7]);

                    }
                    if (b.llIIlIIllllIl(Bank.isOpen() ? 1 : 0)) {
                        if (b.llIIlIIlllllI(Inventory.contains((int[])f.be) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.be).interact(lllIlllIlI[lllIlllIll[0]]);
                            Time.sleepTicks((int)lllIlllIll[8]);

                        }
                        if (b.llIIlIIlllllI(Equipment.contains((int[])f.be) ? 1 : 0) && b.llIIlIlIIIIll(Players.getLocal().getAnimation(), lllIlllIll[9])) {
                            Equipment.getFirst((int[])f.be).interact(lllIlllIlI[lllIlllIll[1]]);
                            Time.sleepTicks((int)lllIlllIll[4]);

                        }
                        Movement.walkTo((WorldPoint)I);

                    }
                }
            }
            if (b.llIIlIIllllIl(Bank.isOpen() ? 1 : 0) && b.llIIlIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                int[] nArray4 = new int[lllIlllIll[1]];
                nArray4[b.lllIlllIll[0]] = lllIlllIll[2];
                if (b.llIIlIIllllll(Inventory.getCount((int[])nArray4), lllIlllIll[1])) {
                    a.a();
                }
            }
            if (b.llIIlIIllllIl(GrandExchange.isOpen() ? 1 : 0)) {
                int[] nArray5 = new int[lllIlllIll[1]];
                nArray5[b.lllIlllIll[0]] = lllIlllIll[2];
                if (b.llIIlIlIIIlII(Inventory.getCount((int[])nArray5)) && b.llIIlIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                    GrandExchange.open();
                    Time.sleepUntil(() -> GrandExchange.isOpen(), (int)lllIlllIll[5]);

                }
            }
            if (!b.llIIlIIlllllI(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[lllIlllIll[1]];
            nArray6[b.lllIlllIll[0]] = lllIlllIll[2];
            if (!b.llIIlIlIIIlII(Inventory.getCount((int[])nArray6))) break block65;
            lllllllllllllllllIllIIllIIlllIII2 = lllIlllIll[0];
            while (b.llIIlIIllllll(lllllllllllllllllIllIIllIIlllIII2, J.size())) {
                String var13 = c.c(J.get(lllllllllllllllllIllIIllIIlllIII2));
                System.out.println("Buying " + var13 + " and itemID is: " + String.valueOf(J.get(lllllllllllllllllIllIIllIIlllIII2)));
                while (b.llIIlIIllllIl(b.a(var13) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                            int var14;
                                            int n2;
                                            int var15 = lllllllllllllllllIllIIllIIlllIII2;
                                            if (b.llIIlIlIIIlII(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.llIIlIlIIIlIl(grandExchangeOffer.getItemId(), J.get(var15))) {
                                                    bl = lllIlllIll[1];

                                                    if (1 < ((0xD0 ^ 0x98 ^ (0xF6 ^ 0xB2)) & (0xBA ^ 0x91 ^ (4 ^ 0x23) ^ -1))) {
                                                        return ((18 + 37 - -24 + 79 ^ 73 + 31 - 27 + 60) & (0x39 ^ 0x4E ^ (0x1E ^ 0x7E) ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = lllIlllIll[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lllIlllIll[1];

                                                if (2 == 0) {
                                                    return;
                                                }
                                            } else {
                                                n2 = lllIlllIll[0];
                                            }
                                            if (b.llIIlIIlllllI(var14 = n2) && b.llIIlIlIIIIIl(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.llIIlIlIIIlIl(grandExchangeOffer.getItemId(), J.get(var15))) {
                                                    bl = lllIlllIll[1];

                                                    if (3 < 1) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = lllIlllIll[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), lllIlllIll[1])) {
                                                GrandExchange.abortOffer((int)J.get(lllllllllllllllllIllIIllIIlllIII2));
                                            }
                                            if (b.llIIlIIllllIl(var14)) {
                                                if (!b.llIIlIIlllllI(GrandExchange.isBuying() ? 1 : 0) || b.llIIlIlIIIIll(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2))) {
                                                    b.a(J.get(lllllllllllllllllIllIIllIIlllIII2));
                                                }
                                                if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2)) && b.llIIlIlIIIIll(GrandExchange.getQuantity(), K.get(lllllllllllllllllIllIIllIIlllIII2))) {
                                                    GrandExchange.setQuantity((int)K.get(lllllllllllllllllIllIIllIIlllIII2));
                                                }
                                                int var16 = L.get(lllllllllllllllllIllIIllIIlllIII2);
                                                int var17 = lllIlllIll[0];
                                                Widget var18 = Widgets.get((int)lllIlllIll[10], (int)lllIlllIll[11]);
                                                if (b.llIIlIIlllllI(GrandExchange.isOpen() ? 1 : 0) && b.llIIlIIlllllI(GrandExchange.isBuying() ? 1 : 0) && b.llIIlIlIIIllI(var18) && b.llIIlIIllllIl(var18.getText().isEmpty() ? 1 : 0)) {
                                                    int var19;
                                                    var17 = var19 = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + var19 + "|Given price: " + String.valueOf(L.get(lllllllllllllllllIllIIllIIlllIII2)));
                                                }
                                                if (b.llIIlIlIIIIII(var17, var16)) {
                                                    double var19;
                                                    if (b.llIIlIlIIIIIl(var17, lllIlllIll[12])) {
                                                        var19 = 0.1;

                                                        if (((0xC ^ 0x3B ^ (0xCE ^ 0xB0)) & (128 + 64 - 97 + 45 ^ 64 + 50 - 74 + 157 ^ -1)) > (150 + 55 - 97 + 54 ^ 16 + 105 - 25 + 70)) {
                                                            return;
                                                        }
                                                    } else {
                                                        var19 = 0.3;
                                                    }
                                                    int var20 = (int)((double)var17 + (double)var17 * var19);
                                                    System.out.println("Increased price: " + var20);
                                                    if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2)) && b.llIIlIlIIIIll(GrandExchange.getPrice(), var20)) {
                                                        GrandExchange.setPrice((int)var20);
                                                    }
                                                    if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2)) && b.llIIlIlIIIlIl(GrandExchange.getPrice(), var20)) {
                                                        GrandExchange.confirm();
                                                    }

                                                    }
                                                } else {
                                                    if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2)) && b.llIIlIlIIIIll(GrandExchange.getPrice(), L.get(lllllllllllllllllIllIIllIIlllIII2))) {
                                                        GrandExchange.setPrice((int)L.get(lllllllllllllllllIllIIllIIlllIII2));
                                                    }
                                                    if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2)) && b.llIIlIlIIIlIl(GrandExchange.getPrice(), L.get(lllllllllllllllllIllIIllIIlllIII2))) {
                                                        GrandExchange.confirm();
                                                    }
                                                }
                                            }
                                        }
                                        if (b.llIIlIIllllIl(Worlds.inMembersWorld() ? 1 : 0)) {
                                            System.out.println(lllIlllIlI[lllIlllIll[8]]);
                                            AccBuilderTempleTrek.d = lllIlllIll[1];
                                            return;
                                        }
                                        if (b.llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[13])) {
                                            Movement.walkTo((WorldPoint)I);

                                            Time.sleepTicks((int)lllIlllIll[1]);

                                        }
                                        if (b.llIIlIIllllIl(GrandExchange.isOpen() ? 1 : 0)) {
                                            GrandExchange.open();
                                        }
                                        if (b.llIIlIIlllllI(GrandExchange.canCollect() ? 1 : 0)) {
                                            GrandExchange.collect();
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (b.llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                                    bl = lllIlllIll[1];

                                                    if ((0x81 ^ 0x84) == 0) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = lllIlllIll[0];
                                                }
                                                return bl;
                                            }, (int)lllIlllIll[5]);

                                        }
                                        if (!b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[14])) break block66;
                                        int[] nArray7 = new int[lllIlllIll[1]];
                                        nArray7[b.lllIlllIll[0]] = lllIlllIll[14];
                                        if (!b.llIIlIIllllIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[15])) break block68;
                                }
                                J.remove(lllIlllIll[0]);

                                K.remove(lllIlllIll[0]);

                                L.remove(lllIlllIll[0]);

                                var12.remove(lllIlllIll[0]);

                                Time.sleepTicks((int)lllIlllIll[8]);

                                return;
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[16])) {
                                int[] nArray8 = new int[lllIlllIll[1]];
                                nArray8[b.lllIlllIll[0]] = lllIlllIll[16];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);

                                    K.remove(lllIlllIll[0]);

                                    L.remove(lllIlllIll[0]);

                                    var12.remove(lllIlllIll[0]);

                                    Time.sleepTicks((int)lllIlllIll[8]);

                                    if (-2 < 0) continue;
                                    return;
                                }
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[17])) {
                                int[] nArray9 = new int[lllIlllIll[1]];
                                nArray9[b.lllIlllIll[0]] = lllIlllIll[18];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);

                                    K.remove(lllIlllIll[0]);

                                    L.remove(lllIlllIll[0]);

                                    var12.remove(lllIlllIll[0]);

                                    Time.sleepTicks((int)lllIlllIll[8]);

                                    if ((0x5E ^ 0x5B) != 0) continue;
                                    return;
                                }
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[19])) {
                                int[] nArray10 = new int[lllIlllIll[1]];
                                nArray10[b.lllIlllIll[0]] = lllIlllIll[19];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);

                                    K.remove(lllIlllIll[0]);

                                    L.remove(lllIlllIll[0]);

                                    var12.remove(lllIlllIll[0]);

                                    Time.sleepTicks((int)lllIlllIll[8]);

                                    if (2 != 0) continue;
                                    return;
                                }
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[20])) {
                                int[] nArray11 = new int[lllIlllIll[1]];
                                nArray11[b.lllIlllIll[0]] = lllIlllIll[20];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);

                                    K.remove(lllIlllIll[0]);

                                    L.remove(lllIlllIll[0]);

                                    var12.remove(lllIlllIll[0]);

                                    Time.sleepTicks((int)lllIlllIll[8]);

                                    if (1 <= (0x4B ^ 0x4F)) continue;
                                    return;
                                }
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[21])) {
                                int[] nArray12 = new int[lllIlllIll[1]];
                                nArray12[b.lllIlllIll[0]] = lllIlllIll[21];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);

                                    K.remove(lllIlllIll[0]);

                                    L.remove(lllIlllIll[0]);

                                    var12.remove(lllIlllIll[0]);

                                    Time.sleepTicks((int)lllIlllIll[8]);

                                    if (3 >= 0) continue;
                                    return;
                                }
                            }
                            if (!b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[22])) break block69;
                            String[] stringArray = new String[lllIlllIll[1]];
                            stringArray[b.lllIlllIll[0]] = lllIlllIlI[lllIlllIll[4]];
                            if (!b.llIIlIIllllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block70;
                            String[] stringArray2 = new String[lllIlllIll[1]];
                            stringArray2[b.lllIlllIll[0]] = lllIlllIlI[lllIlllIll[7]];
                            if (!b.llIIlIIlllllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block69;
                        }
                        J.remove(lllIlllIll[0]);

                        K.remove(lllIlllIll[0]);

                        L.remove(lllIlllIll[0]);

                        var12.remove(lllIlllIll[0]);

                        Time.sleepTicks((int)lllIlllIll[8]);

                        if (-1 == -1) continue;
                        return;
                    }
                    if (!b.llIIlIIllllIl(b.a(var13) ? 1 : 0)) break;
                    if (b.llIIlIIlllllI(AccBuilderTempleTrek.d ? 1 : 0)) {

                        if (-1 == -1) break;
                        return;
                    }
                    Time.sleepTicks((int)lllIlllIll[4]);

                    if ((0x64 ^ 0x3C ^ (0 ^ 0x5C)) >= 2) continue;
                    return;
                }
                if (b.llIIlIIlllllI(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lllIlllIll[1];

                            }
                        } else {
                            bl = lllIlllIll[0];
                        }
                        return bl;
                    }, (int)lllIlllIll[5]);

                }
                System.out.println(var12.get(lllllllllllllllllIllIIllIIlllIII2).p());
                if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[15])) {
                    J.remove(lllIlllIll[0]);

                    K.remove(lllIlllIll[0]);

                    L.remove(lllIlllIll[0]);

                    var12.remove(lllIlllIll[0]);

                }
                if (b.llIIlIIlllllI(b.a(var13) ? 1 : 0)) {
                    J.remove(lllIlllIll[0]);

                    K.remove(lllIlllIll[0]);

                    L.remove(lllIlllIll[0]);

                    var12.remove(lllIlllIll[0]);

                }
                Time.sleepTicks((int)lllIlllIll[8]);

                ++lllllllllllllllllIllIIllIIlllIII2;

                if (-2 < 0) continue;
                return;
            }
        }
    }

    private static boolean llIIlIlIIIIII(int n2, int n3) {
        return n2 >= n3;
    }
}

