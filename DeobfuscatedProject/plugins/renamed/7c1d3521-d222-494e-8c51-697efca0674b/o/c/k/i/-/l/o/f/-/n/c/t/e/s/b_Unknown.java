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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.c_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;

public class b_Unknown {
    public static /* synthetic */ List<Integer> L;
    public static /* synthetic */ List<Integer> K;
    public static final /* synthetic */ WorldPoint I;
    private static /* synthetic */ String[] llIIIlIlII;
    public static /* synthetic */ List<Integer> J;
    private static /* synthetic */ int[] llIIIlIlIl;

    private static String lIlIIlIllIlII(String var38, String var1) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), llIIIlIlIl[28]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(llIIIlIlIl[8], var10);
            return new String(var22.doFinal(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlllIll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        b.lIlIIlIllIllI();
        b.lIlIIlIllIlIl();
        I = new WorldPoint(llIIIlIlIl[30], llIIIlIlIl[31], llIIIlIlIl[0]);
        J = new ArrayList<Integer>();
        K = new ArrayList<Integer>();
        L = new ArrayList<Integer>();
    }

    private static boolean lIlIIlIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIllIIIIII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string) {
        List list = Inventory.getAll();
        if (b.lIlIIlIllIlll(list.isEmpty() ? 1 : 0)) {
            void var7;
            String var24;
            Object var2_2 = null;
            if (b.lIlIIlIlllIII(string.contains(llIIIlIlII[llIIIlIlIl[25]]) ? 1 : 0)) {
                var24 = string.replace(llIIIlIlII[llIIIlIlIl[26]], llIIIlIlII[llIIIlIlIl[13]]).trim();
            }
            int var18 = llIIIlIlIl[0];
            while (b.lIlIIlIlllIIl(var18, var7.size())) {
                String var21 = ((Item)var7.get(var18)).getName();
                if (b.lIlIIllIIIIII(var21)) {
                    String var29;
                    if (b.lIlIIlIlllIII(var21.contains(var29) ? 1 : 0)) {
                        return llIIIlIlIl[1];
                    }
                    if (b.lIlIIllIIIIII(var24) && b.lIlIIlIlllIII(var21.contains(var24) ? 1 : 0)) {
                        return llIIIlIlIl[1];
                    }
                }
                ++var18;
                0;
                if (1 >= ((0x61 ^ 0x57) & ~(4 ^ 0x32))) continue;
                return false;
            }
        }
        return llIIIlIlIl[0];
    }

    private static boolean lIlIIlIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void g() {
        Widget widget = Widgets.get((int)llIIIlIlIl[10], (int)llIIIlIlIl[8], (int)llIIIlIlIl[27]);
        if (b.lIlIIllIIIIII(widget)) {
            widget.interact(llIIIlIlII[llIIIlIlIl[28]]);
            Time.sleepTicks((int)llIIIlIlIl[8]);
            0;
        }
    }

    public static void a(List<d> list) {
        block65: {
            List<d> var15;
            int llllllllllllllllllIlIllllIIIllIl2;
            if (b.lIlIIlIllIlll(list.isEmpty() ? 1 : 0) && b.lIlIIlIlllIII(J.isEmpty() ? 1 : 0)) {
                llllllllllllllllllIlIllllIIIllIl2 = llIIIlIlIl[0];
                while (b.lIlIIlIlllIIl(llllllllllllllllllIlIllllIIIllIl2, var15.size())) {
                    J.add(var15.get(llllllllllllllllllIlIllllIIIllIl2).p());
                    0;
                    K.add(var15.get(llllllllllllllllllIlIllllIIIllIl2).q());
                    0;
                    L.add(var15.get(llllllllllllllllllIlIllllIIIllIl2).r());
                    0;
                    ++llllllllllllllllllIlIllllIIIllIl2;
                    0;
                    if ((0x1B ^ 0x1F) >= 0) continue;
                    return;
                }
            }
            int[] nArray = new int[llIIIlIlIl[1]];
            nArray[b.llIIIlIlIl[0]] = llIIIlIlIl[2];
            if (!b.lIlIIlIlllIlI(Inventory.getCount((int[])nArray), llIIIlIlIl[1]) || b.lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                if (b.lIlIIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llIIIlIlIl[4]);
                    0;
                    Predicate<Item> llllllllllllllllllIlIllllIIIllIl2 = item -> item.getName().toLowerCase().contains(llIIIlIlII[llIIIlIlIl[27]]);
                    if (b.lIlIIlIlllIII(Bank.contains(llllllllllllllllllIlIllllIIIllIl2) ? 1 : 0) && b.lIlIIlIllIlll(Inventory.contains(item -> item.getName().contains(llIIIlIlII[llIIIlIlIl[3]])) ? 1 : 0) && b.lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                        Bank.withdraw(llllllllllllllllllIlIllllIIIllIl2, (int)llIIIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llIIIlIlIl[4]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIlllllI(Inventory.getCount((Predicate)llllllllllllllllllIlIllllIIIllIl2))) {
                                bl = llIIIlIlIl[1];
                                0;
                                if (((0x8B ^ 0xC5) & ~(0x34 ^ 0x7A)) != 0) {
                                    return false;
                                }
                            } else {
                                bl = llIIIlIlIl[0];
                            }
                            return bl;
                        }, (int)llIIIlIlIl[5]);
                        0;
                    }
                    if (b.lIlIIlIllIlll(Bank.contains((int[])f.bk) ? 1 : 0) && b.lIlIIlIllIlll(Inventory.contains(item -> item.getName().contains(llIIIlIlII[llIIIlIlIl[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[llIIIlIlIl[1]];
                        nArray2[b.llIIIlIlIl[0]] = llIIIlIlIl[6];
                        if (b.lIlIIlIlllIII(Bank.contains((int[])nArray2) ? 1 : 0) && b.lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                            Bank.withdraw((int)llIIIlIlIl[6], (int)llIIIlIlIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIIIlIlIl[4]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llIIIlIlIl[1]];
                                nArray[b.llIIIlIlIl[0]] = llIIIlIlIl[6];
                                if (b.lIlIIlIlllllI(Inventory.getCount((int[])nArray))) {
                                    bl = llIIIlIlIl[1];
                                    0;
                                    if ((59 + 110 - 119 + 101 ^ 68 + 65 - 52 + 66) == 3) {
                                        return ((0xF0 ^ 0xB9 ^ (0xEC ^ 0x80)) & (0xC4 ^ 0x9F ^ (0x2F ^ 0x51) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llIIIlIlIl[0];
                                }
                                return bl;
                            }, (int)llIIIlIlIl[5]);
                            0;
                        }
                    }
                    if (b.lIlIIlIllllII(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                        int[] nArray3 = new int[llIIIlIlIl[1]];
                        nArray3[b.llIIIlIlIl[0]] = llIIIlIlIl[2];
                        if (b.lIlIIlIlllIIl(Inventory.getCount((int[])nArray3), llIIIlIlIl[1])) {
                            Bank.withdrawAll((int)llIIIlIlIl[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llIIIlIlIl[4]);
                            0;
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[llIIIlIlIl[1]];
                                nArray[b.llIIIlIlIl[0]] = llIIIlIlIl[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)llIIIlIlIl[5]);
                            0;
                        }
                    }
                }
                if (b.lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                    if (b.lIlIIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)llIIIlIlIl[7]);
                        0;
                    }
                    if (b.lIlIIlIllIlll(Bank.isOpen() ? 1 : 0)) {
                        if (b.lIlIIlIlllIII(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bk).interact(llIIIlIlII[llIIIlIlIl[0]]);
                            Time.sleepTicks((int)llIIIlIlIl[8]);
                            0;
                        }
                        if (b.lIlIIlIlllIII(Equipment.contains((int[])f.bk) ? 1 : 0) && b.lIlIIlIllllIl(Players.getLocal().getAnimation(), llIIIlIlIl[9])) {
                            Equipment.getFirst((int[])f.bk).interact(llIIIlIlII[llIIIlIlIl[1]]);
                            Time.sleepTicks((int)llIIIlIlIl[4]);
                            0;
                        }
                        Movement.walkTo((WorldPoint)I);
                        0;
                    }
                }
            }
            if (b.lIlIIlIllIlll(Bank.isOpen() ? 1 : 0) && b.lIlIIlIllllII(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                int[] nArray4 = new int[llIIIlIlIl[1]];
                nArray4[b.llIIIlIlIl[0]] = llIIIlIlIl[2];
                if (b.lIlIIlIlllIIl(Inventory.getCount((int[])nArray4), llIIIlIlIl[1])) {
                    a.a();
                }
            }
            if (b.lIlIIlIllIlll(GrandExchange.isOpen() ? 1 : 0)) {
                int[] nArray5 = new int[llIIIlIlIl[1]];
                nArray5[b.llIIIlIlIl[0]] = llIIIlIlIl[2];
                if (b.lIlIIlIlllllI(Inventory.getCount((int[])nArray5)) && b.lIlIIlIllllII(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[3])) {
                    GrandExchange.open();
                    Time.sleepUntil(() -> GrandExchange.isOpen(), (int)llIIIlIlIl[5]);
                    0;
                }
            }
            if (!b.lIlIIlIlllIII(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[llIIIlIlIl[1]];
            nArray6[b.llIIIlIlIl[0]] = llIIIlIlIl[2];
            if (!b.lIlIIlIlllllI(Inventory.getCount((int[])nArray6))) break block65;
            llllllllllllllllllIlIllllIIIllIl2 = llIIIlIlIl[0];
            while (b.lIlIIlIlllIIl(llllllllllllllllllIlIllllIIIllIl2, J.size())) {
                String var9 = c.c(J.get(llllllllllllllllllIlIllllIIIllIl2));
                System.out.println("Buying " + var9 + " and itemID is: " + String.valueOf(J.get(llllllllllllllllllIlIllllIIIllIl2)));
                while (b.lIlIIlIllIlll(b.a(var9) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.lIlIIlIllIlll(GrandExchange.canCollect() ? 1 : 0)) {
                                            int var36;
                                            int n2;
                                            int var19 = llllllllllllllllllIlIllllIIIllIl2;
                                            if (b.lIlIIlIlllllI(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIlIIlIllllll(grandExchangeOffer.getItemId(), J.get(var19))) {
                                                    bl = llIIIlIlIl[1];
                                                    0;
                                                    if (3 == -1) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = llIIIlIlIl[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = llIIIlIlIl[1];
                                                0;
                                                if (1 == ((0xF ^ 0x40 ^ (0xB ^ 0x6A)) & (2 ^ (0x40 ^ 0x6C) ^ -1))) {
                                                    return;
                                                }
                                            } else {
                                                n2 = llIIIlIlIl[0];
                                            }
                                            if (b.lIlIIlIlllIII(var36 = n2) && b.lIlIIlIlllIll(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIlIIlIllllll(grandExchangeOffer.getItemId(), J.get(var19))) {
                                                    bl = llIIIlIlIl[1];
                                                    0;
                                                    if (-2 > 0) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = llIIIlIlIl[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), llIIIlIlIl[1])) {
                                                GrandExchange.abortOffer((int)J.get(llllllllllllllllllIlIllllIIIllIl2));
                                            }
                                            if (b.lIlIIlIllIlll(var36)) {
                                                if (!b.lIlIIlIlllIII(GrandExchange.isBuying() ? 1 : 0) || b.lIlIIlIllllIl(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2))) {
                                                    b.a(J.get(llllllllllllllllllIlIllllIIIllIl2));
                                                }
                                                if (b.lIlIIlIllllll(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2)) && b.lIlIIlIllllIl(GrandExchange.getQuantity(), K.get(llllllllllllllllllIlIllllIIIllIl2))) {
                                                    GrandExchange.setQuantity((int)K.get(llllllllllllllllllIlIllllIIIllIl2));
                                                }
                                                int var16 = L.get(llllllllllllllllllIlIllllIIIllIl2);
                                                int var11 = llIIIlIlIl[0];
                                                Widget var5 = Widgets.get((int)llIIIlIlIl[10], (int)llIIIlIlIl[11]);
                                                if (b.lIlIIlIlllIII(GrandExchange.isOpen() ? 1 : 0) && b.lIlIIlIlllIII(GrandExchange.isBuying() ? 1 : 0) && b.lIlIIllIIIIII(var5) && b.lIlIIlIllIlll(var5.getText().isEmpty() ? 1 : 0)) {
                                                    int var27;
                                                    var11 = var27 = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + var27 + "|Given price: " + String.valueOf(L.get(llllllllllllllllllIlIllllIIIllIl2)));
                                                }
                                                if (b.lIlIIlIlllIlI(var11, var16)) {
                                                    double var27;
                                                    if (b.lIlIIlIlllIll(var11, llIIIlIlIl[12])) {
                                                        var27 = 0.1;
                                                        0;
                                                        if (3 > 3) {
                                                            return;
                                                        }
                                                    } else {
                                                        var27 = 0.3;
                                                    }
                                                    int var31 = (int)((double)var11 + (double)var11 * var27);
                                                    System.out.println("Increased price: " + var31);
                                                    if (b.lIlIIlIllllll(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2)) && b.lIlIIlIllllIl(GrandExchange.getPrice(), var31)) {
                                                        GrandExchange.setPrice((int)var31);
                                                    }
                                                    if (b.lIlIIlIllllll(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2)) && b.lIlIIlIllllll(GrandExchange.getPrice(), var31)) {
                                                        GrandExchange.confirm();
                                                    }
                                                    0;
                                                    if (((0x5D ^ 0x52) & ~(0x3F ^ 0x30)) < 0) {
                                                        return;
                                                    }
                                                } else {
                                                    if (b.lIlIIlIllllll(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2)) && b.lIlIIlIllllIl(GrandExchange.getPrice(), L.get(llllllllllllllllllIlIllllIIIllIl2))) {
                                                        GrandExchange.setPrice((int)L.get(llllllllllllllllllIlIllllIIIllIl2));
                                                    }
                                                    if (b.lIlIIlIllllll(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2)) && b.lIlIIlIllllll(GrandExchange.getPrice(), L.get(llllllllllllllllllIlIllllIIIllIl2))) {
                                                        GrandExchange.confirm();
                                                    }
                                                }
                                            }
                                        }
                                        if (b.lIlIIlIlllIll(Players.getLocal().getWorldLocation().distanceTo(I), llIIIlIlIl[13])) {
                                            Movement.walkTo((WorldPoint)I);
                                            0;
                                            Time.sleepTicks((int)llIIIlIlIl[1]);
                                            0;
                                        }
                                        if (b.lIlIIlIllIlll(Worlds.inMembersWorld() ? 1 : 0)) {
                                            System.out.println(llIIIlIlII[llIIIlIlIl[8]]);
                                            AccBuilderSotf.d = llIIIlIlIl[1];
                                            return;
                                        }
                                        if (b.lIlIIlIllIlll(GrandExchange.isOpen() ? 1 : 0)) {
                                            GrandExchange.open();
                                        }
                                        if (b.lIlIIlIlllIII(GrandExchange.canCollect() ? 1 : 0)) {
                                            GrandExchange.collect();
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (b.lIlIIlIllIlll(GrandExchange.canCollect() ? 1 : 0)) {
                                                    bl = llIIIlIlIl[1];
                                                    0;
                                                    if (((0x56 ^ 0x7E ^ (0x9D ^ 0xA8)) & (0x61 ^ 0x36 ^ (0x3C ^ 0x76) ^ -1)) != 0) {
                                                        return ((40 + 43 - 1 + 46 ^ 79 + 2 - -63 + 48) & (0x4C ^ 0x22 ^ (0x18 ^ 0x36) ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = llIIIlIlIl[0];
                                                }
                                                return bl;
                                            }, (int)llIIIlIlIl[5]);
                                            0;
                                        }
                                        if (!b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[14])) break block66;
                                        int[] nArray7 = new int[llIIIlIlIl[1]];
                                        nArray7[b.llIIIlIlIl[0]] = llIIIlIlIl[14];
                                        if (!b.lIlIIlIllIlll(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[15])) break block68;
                                }
                                J.remove(llIIIlIlIl[0]);
                                0;
                                K.remove(llIIIlIlIl[0]);
                                0;
                                L.remove(llIIIlIlIl[0]);
                                0;
                                var15.remove(llIIIlIlIl[0]);
                                0;
                                Time.sleepTicks((int)llIIIlIlIl[8]);
                                0;
                                0;
                                if (1 >= ((0xEB ^ 0xB3) & ~(0x5A ^ 2))) continue;
                                return;
                            }
                            if (b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[16])) {
                                int[] nArray8 = new int[llIIIlIlIl[1]];
                                nArray8[b.llIIIlIlIl[0]] = llIIIlIlIl[16];
                                if (b.lIlIIlIlllIII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    0;
                                    K.remove(llIIIlIlIl[0]);
                                    0;
                                    L.remove(llIIIlIlIl[0]);
                                    0;
                                    var15.remove(llIIIlIlIl[0]);
                                    0;
                                    Time.sleepTicks((int)llIIIlIlIl[8]);
                                    0;
                                    0;
                                    if (2 > ((0x6F ^ 0x7B ^ (4 ^ 0x58)) & (0x76 ^ 0x3E ^ (0x18 ^ 0x78) & ~(0xCD ^ 0xAD) ^ -1))) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[17])) {
                                int[] nArray9 = new int[llIIIlIlIl[1]];
                                nArray9[b.llIIIlIlIl[0]] = llIIIlIlIl[18];
                                if (b.lIlIIlIlllIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    0;
                                    K.remove(llIIIlIlIl[0]);
                                    0;
                                    L.remove(llIIIlIlIl[0]);
                                    0;
                                    var15.remove(llIIIlIlIl[0]);
                                    0;
                                    Time.sleepTicks((int)llIIIlIlIl[8]);
                                    0;
                                    0;
                                    
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[19])) {
                                int[] nArray10 = new int[llIIIlIlIl[1]];
                                nArray10[b.llIIIlIlIl[0]] = llIIIlIlIl[19];
                                if (b.lIlIIlIlllIII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    0;
                                    K.remove(llIIIlIlIl[0]);
                                    0;
                                    L.remove(llIIIlIlIl[0]);
                                    0;
                                    var15.remove(llIIIlIlIl[0]);
                                    0;
                                    Time.sleepTicks((int)llIIIlIlIl[8]);
                                    0;
                                    0;
                                    if (-1 == -1) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[20])) {
                                int[] nArray11 = new int[llIIIlIlIl[1]];
                                nArray11[b.llIIIlIlIl[0]] = llIIIlIlIl[20];
                                if (b.lIlIIlIlllIII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    0;
                                    K.remove(llIIIlIlIl[0]);
                                    0;
                                    L.remove(llIIIlIlIl[0]);
                                    0;
                                    var15.remove(llIIIlIlIl[0]);
                                    0;
                                    Time.sleepTicks((int)llIIIlIlIl[8]);
                                    0;
                                    0;
                                    if ((0x17 ^ 0x12) > 0) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[21])) {
                                int[] nArray12 = new int[llIIIlIlIl[1]];
                                nArray12[b.llIIIlIlIl[0]] = llIIIlIlIl[21];
                                if (b.lIlIIlIlllIII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    J.remove(llIIIlIlIl[0]);
                                    0;
                                    K.remove(llIIIlIlIl[0]);
                                    0;
                                    L.remove(llIIIlIlIl[0]);
                                    0;
                                    var15.remove(llIIIlIlIl[0]);
                                    0;
                                    Time.sleepTicks((int)llIIIlIlIl[8]);
                                    0;
                                    0;
                                    if ((129 + 18 - 61 + 57 ^ 67 + 33 - 21 + 60) >= 2) continue;
                                    return;
                                }
                            }
                            if (!b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[22])) break block69;
                            String[] stringArray = new String[llIIIlIlIl[1]];
                            stringArray[b.llIIIlIlIl[0]] = llIIIlIlII[llIIIlIlIl[4]];
                            if (!b.lIlIIlIllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block70;
                            String[] stringArray2 = new String[llIIIlIlIl[1]];
                            stringArray2[b.llIIIlIlIl[0]] = llIIIlIlII[llIIIlIlIl[7]];
                            if (!b.lIlIIlIlllIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block69;
                        }
                        J.remove(llIIIlIlIl[0]);
                        0;
                        K.remove(llIIIlIlIl[0]);
                        0;
                        L.remove(llIIIlIlIl[0]);
                        0;
                        var15.remove(llIIIlIlIl[0]);
                        0;
                        Time.sleepTicks((int)llIIIlIlIl[8]);
                        0;
                        0;
                        if (((0xC9 ^ 0x9F ^ (0x9A ^ 0x90)) & (0xFF ^ 0x8D ^ (0x2F ^ 1) ^ -1)) == 0) continue;
                        return;
                    }
                    if (!b.lIlIIlIllIlll(b.a(var9) ? 1 : 0)) break;
                    if (b.lIlIIlIlllIII(AccBuilderSotf.d ? 1 : 0)) {
                        0;
                        if (1 > -1) break;
                        return;
                    }
                    Time.sleepTicks((int)llIIIlIlIl[4]);
                    0;
                    0;
                    if (2 != 1) continue;
                    return;
                }
                if (b.lIlIIlIlllIII(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.lIlIIlIllIlll(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = llIIIlIlIl[1];
                            0;
                            if ((64 + 49 - 85 + 108 ^ 96 + 84 - 142 + 102) == 0) {
                                return ((0x9E ^ 0x80 ^ (0x9A ^ 0xC5)) & (0x1D ^ 0xB ^ (0x1A ^ 0x4D) ^ -1)) != 0;
                            }
                        } else {
                            bl = llIIIlIlIl[0];
                        }
                        return bl;
                    }, (int)llIIIlIlIl[5]);
                    0;
                }
                System.out.println(var15.get(llllllllllllllllllIlIllllIIIllIl2).p());
                if (b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[15])) {
                    J.remove(llIIIlIlIl[0]);
                    0;
                    K.remove(llIIIlIlIl[0]);
                    0;
                    L.remove(llIIIlIlIl[0]);
                    0;
                    var15.remove(llIIIlIlIl[0]);
                    0;
                }
                if (b.lIlIIlIlllIII(b.a(var9) ? 1 : 0)) {
                    J.remove(llIIIlIlIl[0]);
                    0;
                    K.remove(llIIIlIlIl[0]);
                    0;
                    L.remove(llIIIlIlIl[0]);
                    0;
                    var15.remove(llIIIlIlIl[0]);
                    0;
                }
                Time.sleepTicks((int)llIIIlIlIl[8]);
                0;
                ++llllllllllllllllllIlIllllIIIllIl2;
                0;
                if (3 > 0) continue;
                return;
            }
        }
    }

    public static void a(int n2) {
        int var14;
        int n3;
        int var25;
        if (b.lIlIIlIllIlll(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.lIlIIlIlllIII(Static.getClient().isItemDefinitionCached(var25) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(var25).getLinkedNoteId();
            0;
            if ((0x64 ^ 2 ^ (0xF8 ^ 0x9B)) == 0) {
                return;
            }
        } else {
            n3 = var14 = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(var25).getLinkedNoteId())).intValue();
        }
        if (!b.lIlIIlIllllIl(GrandExchange.getItemId(), llIIIlIlIl[24]) || b.lIlIIlIllllIl(GrandExchange.getItemId(), var25) && b.lIlIIlIllllIl(GrandExchange.getItemId(), var14)) {
            if (b.lIlIIlIllIlll(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)var25);
        }
    }

    private static boolean lIlIIlIllllII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void b(List<Integer> list) {
        if (b.lIlIIlIllIlll(GrandExchange.isOpen() ? 1 : 0)) {
            if (b.lIlIIlIlllIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (b.lIlIIlIllIlll(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (b.lIlIIlIlllIII(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> var28;
            Time.sleepTicks((int)llIIIlIlIl[8]);
            0;
            int var30 = llIIIlIlIl[0];
            while (b.lIlIIlIlllIIl(var30, var28.size())) {
                int[] nArray = new int[llIIIlIlIl[1]];
                nArray[b.llIIIlIlIl[0]] = var28.get(var30);
                if (b.lIlIIlIlllllI(Inventory.getCount((int[])nArray))) {
                    int var32;
                    if (b.lIlIIlIllIlll(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[llIIIlIlIl[1]];
                        nArray2[b.llIIIlIlIl[0]] = var28.get(var30);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)llIIIlIlIl[8]);
                        0;
                        var32 = var30;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIllllll(GrandExchange.getItemId(), (Integer)var28.get(var32))) {
                                bl = llIIIlIlIl[1];
                                0;
                                if (3 < 2) {
                                    return false;
                                }
                            } else {
                                bl = llIIIlIlIl[0];
                            }
                            return bl;
                        }, (int)llIIIlIlIl[23]);
                        0;
                    }
                    if (b.lIlIIlIlllIII(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.lIlIIlIllllIl(GrandExchange.getPrice(), llIIIlIlIl[24])) {
                            GrandExchange.setPrice((int)llIIIlIlIl[1]);
                            Time.sleepTicks((int)llIIIlIlIl[8]);
                            0;
                            var32 = var30;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.lIlIIlIllllll(GrandExchange.getPrice(), llIIIlIlIl[1])) {
                                    bl = llIIIlIlIl[1];
                                    0;
                                    if (2 < -1) {
                                        return false;
                                    }
                                } else {
                                    bl = llIIIlIlIl[0];
                                }
                                return bl;
                            }, (int)llIIIlIlIl[23]);
                            0;
                        }
                        if (b.lIlIIlIllllll(GrandExchange.getPrice(), llIIIlIlIl[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)llIIIlIlIl[23]);
                            0;
                        }
                    }
                    if (b.lIlIIlIlllIII(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIllIlll(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = llIIIlIlIl[1];
                                0;
                                if (1 == 0) {
                                    return ((0x4E ^ 9 ^ (0x60 ^ 0x31)) & (3 ^ (0x37 ^ 0x22) ^ -1)) != 0;
                                }
                            } else {
                                bl = llIIIlIlIl[0];
                            }
                            return bl;
                        }, (int)llIIIlIlIl[5]);
                        0;
                    }
                }
                ++var30;
                0;
                if (-(0x1C ^ 0x36 ^ (0xB0 ^ 0x9E)) < 0) continue;
                return;
            }
        }
    }

    private static boolean lIlIIlIlllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIlllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlIllllIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlIIlIllIllI() {
        llIIIlIlIl = new int[33];
        b.llIIIlIlIl[0] = (0xC7 ^ 0xBE ^ (0xB9 ^ 0x85)) & (0x3F ^ 8 ^ (0x1A ^ 0x68) ^ -1);
        b.llIIIlIlIl[1] = 1;
        b.llIIIlIlIl[2] = 0xFFFF83E7 & 0x7FFB;
        b.llIIIlIlIl[3] = 0x46 ^ 0x4C;
        b.llIIIlIlIl[4] = 3;
        b.llIIIlIlIl[5] = 0xFFFFD7BC & 0x3BCB;
        b.llIIIlIlIl[6] = -(0xFFFFF629 & 0x69DF) & (0xFFFFFF5F & 0x7FEF);
        b.llIIIlIlIl[7] = 0xC7 ^ 0xC3;
        b.llIIIlIlIl[8] = 2;
        b.llIIIlIlIl[9] = 0xFFFFE6CA & 0x1BFF;
        b.llIIIlIlIl[10] = 0xFFFFF5F5 & 0xBDB;
        b.llIIIlIlIl[11] = 0x96 ^ 0xC1 ^ (0x51 ^ 0x1D);
        b.llIIIlIlIl[12] = 0xFFFFC679 & 0xF7BC6;
        b.llIIIlIlIl[13] = 0x67 ^ 0x60;
        b.llIIIlIlIl[14] = -(0xFFFFF63E & 0x3BD3) & (0xFFFFB7BB & 0x7BFF);
        b.llIIIlIlIl[15] = 0xFFFFABFF & 0x5FCB;
        b.llIIIlIlIl[16] = 0xFFFFDF3E & 0x27FF;
        b.llIIIlIlIl[17] = 0xFFFFA77F & 0x5FFD;
        b.llIIIlIlIl[18] = 0xFFFFD77F & 0x2FFE;
        b.llIIIlIlIl[19] = 0xFFFFA3AC & 0x5DFF;
        b.llIIIlIlIl[20] = 0xFFFFDFFF & 0x3F4D;
        b.llIIIlIlIl[21] = -(0xFFFFE7DF & 0x5A2F) & (0xFFFFD33F & 0x6FDF);
        b.llIIIlIlIl[22] = 0xFFFFBF77 & 0x71D9;
        b.llIIIlIlIl[23] = -(0xFFFFEDDB & 0x32A7) & (0xFFFFF5FE & 0x3FFF);
        b.llIIIlIlIl[24] = -1;
        b.llIIIlIlIl[25] = 0x28 ^ 0x1B ^ (0x12 ^ 0x24);
        b.llIIIlIlIl[26] = 0x9F ^ 0x99;
        b.llIIIlIlIl[27] = 0x46 ^ 0x4D;
        b.llIIIlIlIl[28] = 0xEB ^ 0x87 ^ (0x43 ^ 0x27);
        b.llIIIlIlIl[29] = 0x1F ^ 0x21 ^ (0x29 ^ 0x1E);
        b.llIIIlIlIl[30] = 0xFFFFAFFF & 0x5C5D;
        b.llIIIlIlIl[31] = 0xFFFFDFBE & 0x2DDF;
        b.llIIIlIlIl[32] = 98 + 89 - 119 + 82 ^ 46 + 26 - 67 + 149;
    }

    private static void lIlIIlIllIlIl() {
        llIIIlIlII = new String[llIIIlIlIl[32]];
        b.llIIIlIlII[b.llIIIlIlIl[0]] = b."Wear";
        b.llIIIlIlII[b.llIIIlIlIl[1]] = b."Grand Exchange";
        b.llIIIlIlII[b.llIIIlIlIl[8]] = b."In F2P, need to switch to a P2P world, ending script";
        b.llIIIlIlII[b.llIIIlIlIl[4]] = b."Stamina potion(4)";
        b.llIIIlIlII[b.llIIIlIlIl[7]] = b."Stamina potion (4)";
        b.llIIIlIlII[b.llIIIlIlIl[25]] = b."tablet";
        b.llIIIlIlII[b.llIIIlIlIl[26]] = b."(tablet)";
        b.llIIIlIlII[b.llIIIlIlIl[13]] = b."";
        b.llIIIlIlII[b.llIIIlIlIl[28]] = b."Close";
        b.llIIIlIlII[b.llIIIlIlIl[29]] = b."wealth";
        b.llIIIlIlII[b.llIIIlIlIl[3]] = b."wealth";
        b.llIIIlIlII[b.llIIIlIlIl[27]] = b."ring of wealth (";
    }

    private static boolean lIlIIlIlllIII(int n2) {
        return n2 != 0;
    }

    private static String lIlIIlIllIIll(String var26, String var12) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var37 = new StringBuilder();
        char[] var17 = var12.toCharArray();
        int var4 = llIIIlIlIl[0];
        char[] var34 = var26.toCharArray();
        int var2 = var34.length;
        int var6 = llIIIlIlIl[0];
        while (b.lIlIIlIlllIIl(var6, var2)) {
            char var8 = var34[var6];
            var37.append((char)(var8 ^ var17[var4 % var17.length]));
            0;
            ++var4;
            ++var6;
            0;
            if (-1 <= -1) continue;
            return null;
        }
        return String.valueOf(var37);
    }

    private static String lIlIIlIllIIlI(String var35, String var3) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var33 = Cipher.getInstance("Blowfish");
            var33.init(llIIIlIlIl[8], var23);
            return new String(var33.doFinal(Base64.getDecoder().decode(var35.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllllll(int n2, int n3) {
        return n2 == n3;
    }
}

