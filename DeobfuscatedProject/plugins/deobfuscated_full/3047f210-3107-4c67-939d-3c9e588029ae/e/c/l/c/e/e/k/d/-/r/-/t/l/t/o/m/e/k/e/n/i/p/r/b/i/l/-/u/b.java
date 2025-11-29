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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.c;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
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

public class b {
    private static /* synthetic */ int[] lllIlllIll;
    public static /* synthetic */ List<Integer> L;
    public static /* synthetic */ List<Integer> J;
    private static /* synthetic */ String[] lllIlllIlI;
    public static /* synthetic */ List<Integer> K;
    public static final /* synthetic */ WorldPoint I;

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
            0;
        }
    }

    private static boolean llIIlIlIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIlIIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIIlIIlIllIl(String var3, String var1) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var37 = Cipher.getInstance("Blowfish");
            var37.init(lllIlllIll[8], var20);
            return new String(var37.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static void llIIlIIlllIll() {
        lllIlllIlI = new String[lllIlllIll[32]];
        b.lllIlllIlI[b.lllIlllIll[0]] = b."Wear";
        b.lllIlllIlI[b.lllIlllIll[1]] = b."Grand Exchange";
        b.lllIlllIlI[b.lllIlllIll[8]] = b."In F2P, need to switch to a P2P world, ending script";
        b.lllIlllIlI[b.lllIlllIll[4]] = b."Stamina potion(4)";
        b.lllIlllIlI[b.lllIlllIll[7]] = b."Stamina potion (4)";
        b.lllIlllIlI[b.lllIlllIll[25]] = b."tablet";
        b.lllIlllIlI[b.lllIlllIll[26]] = b."(tablet)";
        b.lllIlllIlI[b.lllIlllIll[13]] = b."";
        b.lllIlllIlI[b.lllIlllIll[28]] = b."Close";
        b.lllIlllIlI[b.lllIlllIll[29]] = b."wealth";
        b.lllIlllIlI[b.lllIlllIll[3]] = b."wealth";
        b.lllIlllIlI[b.lllIlllIll[27]] = b."ring of wealth (";
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string) {
        List list = Inventory.getAll();
        if (b.llIIlIIllllIl(list.isEmpty() ? 1 : 0)) {
            void var26;
            String var27;
            Object var2_2 = null;
            if (b.llIIlIIlllllI(string.contains(lllIlllIlI[lllIlllIll[25]]) ? 1 : 0)) {
                var27 = string.replace(lllIlllIlI[lllIlllIll[26]], lllIlllIlI[lllIlllIll[13]]).trim();
            }
            int var2 = lllIlllIll[0];
            while (b.llIIlIIllllll(var2, var26.size())) {
                String var12 = ((Item)var26.get(var2)).getName();
                if (b.llIIlIlIIIllI(var12)) {
                    String var4;
                    if (b.llIIlIIlllllI(var12.contains(var4) ? 1 : 0)) {
                        return lllIlllIll[1];
                    }
                    if (b.llIIlIlIIIllI(var27) && b.llIIlIIlllllI(var12.contains(var27) ? 1 : 0)) {
                        return lllIlllIll[1];
                    }
                }
                ++var2;
                0;
                if (2 < (0xE9 ^ 0x8B ^ (0xB ^ 0x6D))) continue;
                return (1 & (1 ^ -1)) != 0;
            }
        }
        return lllIlllIll[0];
    }

    public static void b(List<Integer> list) {
        if (b.llIIlIIllllIl(GrandExchange.isOpen() ? 1 : 0)) {
            if (b.llIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (b.llIIlIIllllIl(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (b.llIIlIIlllllI(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> var19;
            Time.sleepTicks((int)lllIlllIll[8]);
            0;
            int var21 = lllIlllIll[0];
            while (b.llIIlIIllllll(var21, var19.size())) {
                int[] nArray = new int[lllIlllIll[1]];
                nArray[b.lllIlllIll[0]] = var19.get(var21);
                if (b.llIIlIlIIIlII(Inventory.getCount((int[])nArray))) {
                    int var22;
                    if (b.llIIlIIllllIl(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lllIlllIll[1]];
                        nArray2[b.lllIlllIll[0]] = var19.get(var21);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lllIlllIll[8]);
                        0;
                        var22 = var21;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), (Integer)var19.get(var22))) {
                                bl = lllIlllIll[1];
                                0;
                                if (3 < 1) {
                                    return false;
                                }
                            } else {
                                bl = lllIlllIll[0];
                            }
                            return bl;
                        }, (int)lllIlllIll[23]);
                        0;
                    }
                    if (b.llIIlIIlllllI(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.llIIlIlIIIIll(GrandExchange.getPrice(), lllIlllIll[24])) {
                            GrandExchange.setPrice((int)lllIlllIll[1]);
                            Time.sleepTicks((int)lllIlllIll[8]);
                            0;
                            var22 = var21;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.llIIlIlIIIlIl(GrandExchange.getPrice(), lllIlllIll[1])) {
                                    bl = lllIlllIll[1];
                                    0;
                                    if (((0x59 ^ 0xC) & ~(0x65 ^ 0x30)) != 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lllIlllIll[0];
                                }
                                return bl;
                            }, (int)lllIlllIll[23]);
                            0;
                        }
                        if (b.llIIlIlIIIlIl(GrandExchange.getPrice(), lllIlllIll[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lllIlllIll[23]);
                            0;
                        }
                    }
                    if (b.llIIlIIlllllI(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lllIlllIll[1];
                                0;
                                if ((109 + 176 - 166 + 70 ^ 175 + 173 - 246 + 83) < 0) {
                                    return ((5 ^ 0x35 ^ (0x4C ^ 0x5E)) & (0 ^ 0x5B ^ (0xD8 ^ 0xA1) ^ -1)) != 0;
                                }
                            } else {
                                bl = lllIlllIll[0];
                            }
                            return bl;
                        }, (int)lllIlllIll[5]);
                        0;
                    }
                }
                ++var21;
                0;
                
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

    private static String llIIlIIlllIlI(String var16, String var14) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var6 = var14.toCharArray();
        int var13 = lllIlllIll[0];
        char[] var29 = var16.toCharArray();
        int var8 = var29.length;
        int var24 = lllIlllIll[0];
        while (b.llIIlIIllllll(var24, var8)) {
            char var36 = var29[var24];
            var28.append((char)(var36 ^ var6[var13 % var6.length]));
            0;
            ++var13;
            ++var24;
            0;
            if (-(0x90 ^ 0x95) < 0) continue;
            return null;
        }
        return String.valueOf(var28);
    }

    private static boolean llIIlIIllllIl(int n2) {
        return n2 == 0;
    }

    public static void a(int n2) {
        int var33;
        int n3;
        int var9;
        if (b.llIIlIIllllIl(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.llIIlIIlllllI(Static.getClient().isItemDefinitionCached(var9) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(var9).getLinkedNoteId();
            0;
            if (3 < ((0x77 ^ 0x45 ^ 1) & (30 + 14 - -65 + 35 ^ 36 + 113 - 120 + 134 ^ -1))) {
                return;
            }
        } else {
            n3 = var33 = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(var9).getLinkedNoteId())).intValue();
        }
        if (!b.llIIlIlIIIIll(GrandExchange.getItemId(), lllIlllIll[24]) || b.llIIlIlIIIIll(GrandExchange.getItemId(), var9) && b.llIIlIlIIIIll(GrandExchange.getItemId(), var33)) {
            if (b.llIIlIIllllIl(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)var9);
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
            List<d> var23;
            int lllllllllllllllllIllIIllIIlllIII2;
            if (b.llIIlIIllllIl(list.isEmpty() ? 1 : 0) && b.llIIlIIlllllI(J.isEmpty() ? 1 : 0)) {
                lllllllllllllllllIllIIllIIlllIII2 = lllIlllIll[0];
                while (b.llIIlIIllllll(lllllllllllllllllIllIIllIIlllIII2, var23.size())) {
                    J.add(var23.get(lllllllllllllllllIllIIllIIlllIII2).p());
                    0;
                    K.add(var23.get(lllllllllllllllllIllIIllIIlllIII2).q());
                    0;
                    L.add(var23.get(lllllllllllllllllIllIIllIIlllIII2).r());
                    0;
                    ++lllllllllllllllllIllIIllIIlllIII2;
                    0;
                    if (2 == 2) continue;
                    return;
                }
            }
            int[] nArray = new int[lllIlllIll[1]];
            nArray[b.lllIlllIll[0]] = lllIlllIll[2];
            if (!b.llIIlIlIIIIII(Inventory.getCount((int[])nArray), lllIlllIll[1]) || b.llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                if (b.llIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lllIlllIll[4]);
                    0;
                    Predicate<Item> lllllllllllllllllIllIIllIIlllIII2 = item -> item.getName().toLowerCase().contains(lllIlllIlI[lllIlllIll[27]]);
                    if (b.llIIlIIlllllI(Bank.contains(lllllllllllllllllIllIIllIIlllIII2) ? 1 : 0) && b.llIIlIIllllIl(Inventory.contains(item -> item.getName().contains(lllIlllIlI[lllIlllIll[3]])) ? 1 : 0) && b.llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                        Bank.withdraw(lllllllllllllllllIllIIllIIlllIII2, (int)lllIlllIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlllIll[4]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llIIlIlIIIlII(Inventory.getCount((Predicate)lllllllllllllllllIllIIllIIlllIII2))) {
                                bl = lllIlllIll[1];
                                0;
                                if (-3 > 0) {
                                    return false;
                                }
                            } else {
                                bl = lllIlllIll[0];
                            }
                            return bl;
                        }, (int)lllIlllIll[5]);
                        0;
                    }
                    if (b.llIIlIIllllIl(Bank.contains((int[])f.be) ? 1 : 0) && b.llIIlIIllllIl(Inventory.contains(item -> item.getName().contains(lllIlllIlI[lllIlllIll[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lllIlllIll[1]];
                        nArray2[b.lllIlllIll[0]] = lllIlllIll[6];
                        if (b.llIIlIIlllllI(Bank.contains((int[])nArray2) ? 1 : 0) && b.llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                            Bank.withdraw((int)lllIlllIll[6], (int)lllIlllIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lllIlllIll[4]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lllIlllIll[1]];
                                nArray[b.lllIlllIll[0]] = lllIlllIll[6];
                                if (b.llIIlIlIIIlII(Inventory.getCount((int[])nArray))) {
                                    bl = lllIlllIll[1];
                                    0;
                                    if (((65 + 217 - 175 + 120 ^ 56 + 167 - 54 + 19) & (0xAC ^ 0xC1 ^ (0x53 ^ 0x61) ^ -1)) > 0) {
                                        return ((0xA ^ 0x29 ^ (0x26 ^ 0x3E)) & (0xD5 ^ 0xA9 ^ (0x69 ^ 0x2E) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lllIlllIll[0];
                                }
                                return bl;
                            }, (int)lllIlllIll[5]);
                            0;
                        }
                    }
                    if (b.llIIlIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                        int[] nArray3 = new int[lllIlllIll[1]];
                        nArray3[b.lllIlllIll[0]] = lllIlllIll[2];
                        if (b.llIIlIIllllll(Inventory.getCount((int[])nArray3), lllIlllIll[1])) {
                            Bank.withdrawAll((int)lllIlllIll[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lllIlllIll[4]);
                            0;
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lllIlllIll[1]];
                                nArray[b.lllIlllIll[0]] = lllIlllIll[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lllIlllIll[5]);
                            0;
                        }
                    }
                }
                if (b.llIIlIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lllIlllIll[3])) {
                    if (b.llIIlIIlllllI(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lllIlllIll[7]);
                        0;
                    }
                    if (b.llIIlIIllllIl(Bank.isOpen() ? 1 : 0)) {
                        if (b.llIIlIIlllllI(Inventory.contains((int[])f.be) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.be).interact(lllIlllIlI[lllIlllIll[0]]);
                            Time.sleepTicks((int)lllIlllIll[8]);
                            0;
                        }
                        if (b.llIIlIIlllllI(Equipment.contains((int[])f.be) ? 1 : 0) && b.llIIlIlIIIIll(Players.getLocal().getAnimation(), lllIlllIll[9])) {
                            Equipment.getFirst((int[])f.be).interact(lllIlllIlI[lllIlllIll[1]]);
                            Time.sleepTicks((int)lllIlllIll[4]);
                            0;
                        }
                        Movement.walkTo((WorldPoint)I);
                        0;
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
                    0;
                }
            }
            if (!b.llIIlIIlllllI(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[lllIlllIll[1]];
            nArray6[b.lllIlllIll[0]] = lllIlllIll[2];
            if (!b.llIIlIlIIIlII(Inventory.getCount((int[])nArray6))) break block65;
            lllllllllllllllllIllIIllIIlllIII2 = lllIlllIll[0];
            while (b.llIIlIIllllll(lllllllllllllllllIllIIllIIlllIII2, J.size())) {
                String var35 = c.c(J.get(lllllllllllllllllIllIIllIIlllIII2));
                System.out.println("Buying " + var35 + " and itemID is: " + String.valueOf(J.get(lllllllllllllllllIllIIllIIlllIII2)));
                while (b.llIIlIIllllIl(b.a(var35) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                            int var25;
                                            int n2;
                                            int var32 = lllllllllllllllllIllIIllIIlllIII2;
                                            if (b.llIIlIlIIIlII(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.llIIlIlIIIlIl(grandExchangeOffer.getItemId(), J.get(var32))) {
                                                    bl = lllIlllIll[1];
                                                    0;
                                                    if (1 < ((0xD0 ^ 0x98 ^ (0xF6 ^ 0xB2)) & (0xBA ^ 0x91 ^ (4 ^ 0x23) ^ -1))) {
                                                        return ((18 + 37 - -24 + 79 ^ 73 + 31 - 27 + 60) & (0x39 ^ 0x4E ^ (0x1E ^ 0x7E) ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = lllIlllIll[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lllIlllIll[1];
                                                0;
                                                if (2 == 0) {
                                                    return;
                                                }
                                            } else {
                                                n2 = lllIlllIll[0];
                                            }
                                            if (b.llIIlIIlllllI(var25 = n2) && b.llIIlIlIIIIIl(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.llIIlIlIIIlIl(grandExchangeOffer.getItemId(), J.get(var32))) {
                                                    bl = lllIlllIll[1];
                                                    0;
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
                                            if (b.llIIlIIllllIl(var25)) {
                                                if (!b.llIIlIIlllllI(GrandExchange.isBuying() ? 1 : 0) || b.llIIlIlIIIIll(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2))) {
                                                    b.a(J.get(lllllllllllllllllIllIIllIIlllIII2));
                                                }
                                                if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2)) && b.llIIlIlIIIIll(GrandExchange.getQuantity(), K.get(lllllllllllllllllIllIIllIIlllIII2))) {
                                                    GrandExchange.setQuantity((int)K.get(lllllllllllllllllIllIIllIIlllIII2));
                                                }
                                                int var17 = L.get(lllllllllllllllllIllIIllIIlllIII2);
                                                int var38 = lllIlllIll[0];
                                                Widget var10 = Widgets.get((int)lllIlllIll[10], (int)lllIlllIll[11]);
                                                if (b.llIIlIIlllllI(GrandExchange.isOpen() ? 1 : 0) && b.llIIlIIlllllI(GrandExchange.isBuying() ? 1 : 0) && b.llIIlIlIIIllI(var10) && b.llIIlIIllllIl(var10.getText().isEmpty() ? 1 : 0)) {
                                                    int var5;
                                                    var38 = var5 = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + var5 + "|Given price: " + String.valueOf(L.get(lllllllllllllllllIllIIllIIlllIII2)));
                                                }
                                                if (b.llIIlIlIIIIII(var38, var17)) {
                                                    double var5;
                                                    if (b.llIIlIlIIIIIl(var38, lllIlllIll[12])) {
                                                        var5 = 0.1;
                                                        0;
                                                        if (((0xC ^ 0x3B ^ (0xCE ^ 0xB0)) & (128 + 64 - 97 + 45 ^ 64 + 50 - 74 + 157 ^ -1)) > (150 + 55 - 97 + 54 ^ 16 + 105 - 25 + 70)) {
                                                            return;
                                                        }
                                                    } else {
                                                        var5 = 0.3;
                                                    }
                                                    int var18 = (int)((double)var38 + (double)var38 * var5);
                                                    System.out.println("Increased price: " + var18);
                                                    if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2)) && b.llIIlIlIIIIll(GrandExchange.getPrice(), var18)) {
                                                        GrandExchange.setPrice((int)var18);
                                                    }
                                                    if (b.llIIlIlIIIlIl(GrandExchange.getItemId(), J.get(lllllllllllllllllIllIIllIIlllIII2)) && b.llIIlIlIIIlIl(GrandExchange.getPrice(), var18)) {
                                                        GrandExchange.confirm();
                                                    }
                                                    0;
                                                    
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
                                            0;
                                            Time.sleepTicks((int)lllIlllIll[1]);
                                            0;
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
                                                    0;
                                                    if ((0x81 ^ 0x84) == 0) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = lllIlllIll[0];
                                                }
                                                return bl;
                                            }, (int)lllIlllIll[5]);
                                            0;
                                        }
                                        if (!b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[14])) break block66;
                                        int[] nArray7 = new int[lllIlllIll[1]];
                                        nArray7[b.lllIlllIll[0]] = lllIlllIll[14];
                                        if (!b.llIIlIIllllIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[15])) break block68;
                                }
                                J.remove(lllIlllIll[0]);
                                0;
                                K.remove(lllIlllIll[0]);
                                0;
                                L.remove(lllIlllIll[0]);
                                0;
                                var23.remove(lllIlllIll[0]);
                                0;
                                Time.sleepTicks((int)lllIlllIll[8]);
                                0;
                                0;
                                
                                return;
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[16])) {
                                int[] nArray8 = new int[lllIlllIll[1]];
                                nArray8[b.lllIlllIll[0]] = lllIlllIll[16];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    0;
                                    K.remove(lllIlllIll[0]);
                                    0;
                                    L.remove(lllIlllIll[0]);
                                    0;
                                    var23.remove(lllIlllIll[0]);
                                    0;
                                    Time.sleepTicks((int)lllIlllIll[8]);
                                    0;
                                    0;
                                    if (-2 < 0) continue;
                                    return;
                                }
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[17])) {
                                int[] nArray9 = new int[lllIlllIll[1]];
                                nArray9[b.lllIlllIll[0]] = lllIlllIll[18];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    0;
                                    K.remove(lllIlllIll[0]);
                                    0;
                                    L.remove(lllIlllIll[0]);
                                    0;
                                    var23.remove(lllIlllIll[0]);
                                    0;
                                    Time.sleepTicks((int)lllIlllIll[8]);
                                    0;
                                    0;
                                    if ((0x5E ^ 0x5B) != 0) continue;
                                    return;
                                }
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[19])) {
                                int[] nArray10 = new int[lllIlllIll[1]];
                                nArray10[b.lllIlllIll[0]] = lllIlllIll[19];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    0;
                                    K.remove(lllIlllIll[0]);
                                    0;
                                    L.remove(lllIlllIll[0]);
                                    0;
                                    var23.remove(lllIlllIll[0]);
                                    0;
                                    Time.sleepTicks((int)lllIlllIll[8]);
                                    0;
                                    0;
                                    if (2 != 0) continue;
                                    return;
                                }
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[20])) {
                                int[] nArray11 = new int[lllIlllIll[1]];
                                nArray11[b.lllIlllIll[0]] = lllIlllIll[20];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    0;
                                    K.remove(lllIlllIll[0]);
                                    0;
                                    L.remove(lllIlllIll[0]);
                                    0;
                                    var23.remove(lllIlllIll[0]);
                                    0;
                                    Time.sleepTicks((int)lllIlllIll[8]);
                                    0;
                                    0;
                                    if (1 <= (0x4B ^ 0x4F)) continue;
                                    return;
                                }
                            }
                            if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[21])) {
                                int[] nArray12 = new int[lllIlllIll[1]];
                                nArray12[b.lllIlllIll[0]] = lllIlllIll[21];
                                if (b.llIIlIIlllllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    J.remove(lllIlllIll[0]);
                                    0;
                                    K.remove(lllIlllIll[0]);
                                    0;
                                    L.remove(lllIlllIll[0]);
                                    0;
                                    var23.remove(lllIlllIll[0]);
                                    0;
                                    Time.sleepTicks((int)lllIlllIll[8]);
                                    0;
                                    0;
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
                        0;
                        K.remove(lllIlllIll[0]);
                        0;
                        L.remove(lllIlllIll[0]);
                        0;
                        var23.remove(lllIlllIll[0]);
                        0;
                        Time.sleepTicks((int)lllIlllIll[8]);
                        0;
                        0;
                        if (-1 == -1) continue;
                        return;
                    }
                    if (!b.llIIlIIllllIl(b.a(var35) ? 1 : 0)) break;
                    if (b.llIIlIIlllllI(AccBuilderTempleTrek.d ? 1 : 0)) {
                        0;
                        if (-1 == -1) break;
                        return;
                    }
                    Time.sleepTicks((int)lllIlllIll[4]);
                    0;
                    0;
                    if ((0x64 ^ 0x3C ^ (0 ^ 0x5C)) >= 2) continue;
                    return;
                }
                if (b.llIIlIIlllllI(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.llIIlIIllllIl(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lllIlllIll[1];
                            0;
                            
                            }
                        } else {
                            bl = lllIlllIll[0];
                        }
                        return bl;
                    }, (int)lllIlllIll[5]);
                    0;
                }
                System.out.println(var23.get(lllllllllllllllllIllIIllIIlllIII2).p());
                if (b.llIIlIlIIIlIl(J.get(lllllllllllllllllIllIIllIIlllIII2), lllIlllIll[15])) {
                    J.remove(lllIlllIll[0]);
                    0;
                    K.remove(lllIlllIll[0]);
                    0;
                    L.remove(lllIlllIll[0]);
                    0;
                    var23.remove(lllIlllIll[0]);
                    0;
                }
                if (b.llIIlIIlllllI(b.a(var35) ? 1 : 0)) {
                    J.remove(lllIlllIll[0]);
                    0;
                    K.remove(lllIlllIll[0]);
                    0;
                    L.remove(lllIlllIll[0]);
                    0;
                    var23.remove(lllIlllIll[0]);
                    0;
                }
                Time.sleepTicks((int)lllIlllIll[8]);
                0;
                ++lllllllllllllllllIllIIllIIlllIII2;
                0;
                if (-2 < 0) continue;
                return;
            }
        }
    }

    private static void llIIlIIllllII() {
        lllIlllIll = new int[33];
        b.lllIlllIll[0] = (0x62 ^ 0x5A ^ (0x2D ^ 0x1E)) & (0xB2 ^ 0xAF ^ (0xB7 ^ 0xA1) ^ -1);
        b.lllIlllIll[1] = 1;
        b.lllIlllIll[2] = 0xFFFFFBEB & 0x7F7;
        b.lllIlllIll[3] = 0x4E ^ 0x44;
        b.lllIlllIll[4] = 3;
        b.lllIlllIll[5] = -(0xFFFFE53F & 0x5EF7) & (0xFFFFFFBE & 0x57FF);
        b.lllIlllIll[6] = -(0xAB ^ 0x9A) & (0xFFFF9F77 & Short.MAX_VALUE);
        b.lllIlllIll[7] = 0x29 ^ 0x2D;
        b.lllIlllIll[8] = 2;
        b.lllIlllIll[9] = -(0xFFFFD52B & 0x7EF5) & (0xFFFFD7EF & 0x7EFA);
        b.lllIlllIll[10] = 0xFFFF97D5 & 0x69FB;
        b.lllIlllIll[11] = 0x9B ^ 0x94 ^ (0x7F ^ 0x6B);
        b.lllIlllIll[12] = -(0xFFFFEDF9 & 0x3B96) & (0xFFFFEBEF & 0xF7FDF);
        b.lllIlllIll[13] = 0xD7 ^ 0xC2 ^ (0x5C ^ 0x4E);
        b.lllIlllIll[14] = 0xFFFFFBBB & 0x5EE;
        b.lllIlllIll[15] = -(0xFFFFFFD3 & 0x342D) & (0xFFFFBFDB & 0x7FEF);
        b.lllIlllIll[16] = 0xFFFFFFFF & 0x73E;
        b.lllIlllIll[17] = -(0xFFFFB4ED & 0x7B93) & (0xFFFFFFFF & 0x37FD);
        b.lllIlllIll[18] = -(0xFFFFFF87 & 0x78FA) & (0xFFFFFFFF & Short.MAX_VALUE);
        b.lllIlllIll[19] = -(0xFFFFD47B & 0x3BD6) & (0xFFFFB1FF & 0x5FFD);
        b.lllIlllIll[20] = -(0xFFFFE5BF & 0x7A51) & (0xFFFFFFFD & 0x7F5F);
        b.lllIlllIll[21] = -(0xFFFFEEDB & 0x1FE5) & (0xFFFFAFFD & 0x5FD3);
        b.lllIlllIll[22] = -(0xFFFFFEFB & 0x4BA7) & (0xFFFFFFFB & 0x7BF7);
        b.lllIlllIll[23] = -(0xFFFF8B9F & 0x7CE2) & (0xFFFFBDFF & 0x5FFD);
        b.lllIlllIll[24] = -1;
        b.lllIlllIll[25] = 0x54 ^ 0x51;
        b.lllIlllIll[26] = 0x57 ^ 8 ^ (0x51 ^ 8);
        b.lllIlllIll[27] = 77 + 57 - -5 + 39 ^ 114 + 88 - 87 + 70;
        b.lllIlllIll[28] = 28 + 29 - -13 + 61 ^ 91 + 99 - 85 + 34;
        b.lllIlllIll[29] = 0x7D ^ 0x74;
        b.lllIlllIll[30] = -(0xFFFFF767 & 0x6B9B) & (0xFFFFFF7F & 0x6FDF);
        b.lllIlllIll[31] = -(0xFFFFB39E & 0x7C63) & (0xFFFFBF9F & 0x7DFF);
        b.lllIlllIll[32] = 0xBE ^ 0xAC ^ (0x62 ^ 0x7C);
    }

    private static String llIIlIIlIllII(String var31, String var7) {
        try {
            SecretKeySpec var30 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lllIlllIll[28]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lllIlllIll[8], var30);
            return new String(var15.doFinal(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlIIIIII(int n2, int n3) {
        return n2 >= n3;
    }
}

