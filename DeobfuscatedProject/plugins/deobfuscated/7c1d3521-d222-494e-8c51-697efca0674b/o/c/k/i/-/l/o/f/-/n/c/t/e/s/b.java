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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.c;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;

public class b {
    public static /* synthetic */ List<Integer> L;
    public static /* synthetic */ List<Integer> K;
    public static final /* synthetic */ WorldPoint I;
    private static /* synthetic */ String[] llIIIlIlII;
    public static /* synthetic */ List<Integer> J;
    private static /* synthetic */ int[] llIIIlIlIl;

    private static String lIlIIlIllIlII(String llllllllllllllllllIlIlllIIllIlII, String llllllllllllllllllIlIlllIIllIIll) {
        try {
            SecretKeySpec llllllllllllllllllIlIlllIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlllIIllIIll.getBytes(StandardCharsets.UTF_8)), llIIIlIlIl[28]), "DES");
            Cipher llllllllllllllllllIlIlllIIllIllI = Cipher.getInstance("DES");
            llllllllllllllllllIlIlllIIllIllI.init(llIIIlIlIl[8], llllllllllllllllllIlIlllIIllIlll);
            return new String(llllllllllllllllllIlIlllIIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlllIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIlllIIllIlIl) {
            llllllllllllllllllIlIlllIIllIlIl.printStackTrace();
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
            void llllllllllllllllllIlIlllIllllIII;
            String llllllllllllllllllIlIlllIlllIlll;
            Object var2_2 = null;
            if (b.lIlIIlIlllIII(string.contains(llIIIlIlII[llIIIlIlIl[25]]) ? 1 : 0)) {
                llllllllllllllllllIlIlllIlllIlll = string.replace(llIIIlIlII[llIIIlIlIl[26]], llIIIlIlII[llIIIlIlIl[13]]).trim();
            }
            int llllllllllllllllllIlIlllIlllIllI = llIIIlIlIl[0];
            while (b.lIlIIlIlllIIl(llllllllllllllllllIlIlllIlllIllI, llllllllllllllllllIlIlllIllllIII.size())) {
                String llllllllllllllllllIlIlllIlllIlIl = ((Item)llllllllllllllllllIlIlllIllllIII.get(llllllllllllllllllIlIlllIlllIllI)).getName();
                if (b.lIlIIllIIIIII(llllllllllllllllllIlIlllIlllIlIl)) {
                    String llllllllllllllllllIlIlllIllllIIl;
                    if (b.lIlIIlIlllIII(llllllllllllllllllIlIlllIlllIlIl.contains(llllllllllllllllllIlIlllIllllIIl) ? 1 : 0)) {
                        return llIIIlIlIl[1];
                    }
                    if (b.lIlIIllIIIIII(llllllllllllllllllIlIlllIlllIlll) && b.lIlIIlIlllIII(llllllllllllllllllIlIlllIlllIlIl.contains(llllllllllllllllllIlIlllIlllIlll) ? 1 : 0)) {
                        return llIIIlIlIl[1];
                    }
                }
                ++llllllllllllllllllIlIlllIlllIllI;
                0;
                if (1 >= ((0x61 ^ 0x57) & ~(4 ^ 0x32))) continue;
                return ((0xAD ^ 0xB6) & ~(0x51 ^ 0x4A)) != 0;
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
            List<d> llllllllllllllllllIlIllllIIIlllI;
            int llllllllllllllllllIlIllllIIIllIl2;
            if (b.lIlIIlIllIlll(list.isEmpty() ? 1 : 0) && b.lIlIIlIlllIII(J.isEmpty() ? 1 : 0)) {
                llllllllllllllllllIlIllllIIIllIl2 = llIIIlIlIl[0];
                while (b.lIlIIlIlllIIl(llllllllllllllllllIlIllllIIIllIl2, llllllllllllllllllIlIllllIIIlllI.size())) {
                    J.add(llllllllllllllllllIlIllllIIIlllI.get(llllllllllllllllllIlIllllIIIllIl2).p());
                    0;
                    K.add(llllllllllllllllllIlIllllIIIlllI.get(llllllllllllllllllIlIllllIIIllIl2).q());
                    0;
                    L.add(llllllllllllllllllIlIllllIIIlllI.get(llllllllllllllllllIlIllllIIIllIl2).r());
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
                                    return ((0x16 ^ 0x1D) & ~(0x7F ^ 0x74)) != 0;
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
                String llllllllllllllllllIlIllllIIIllII = c.c(J.get(llllllllllllllllllIlIllllIIIllIl2));
                System.out.println("Buying " + llllllllllllllllllIlIllllIIIllII + " and itemID is: " + String.valueOf(J.get(llllllllllllllllllIlIllllIIIllIl2)));
                while (b.lIlIIlIllIlll(b.a(llllllllllllllllllIlIllllIIIllII) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.lIlIIlIllIlll(GrandExchange.canCollect() ? 1 : 0)) {
                                            int llllllllllllllllllIlIllllIIIlIlI;
                                            int n2;
                                            int llllllllllllllllllIlIllllIIIlIll = llllllllllllllllllIlIllllIIIllIl2;
                                            if (b.lIlIIlIlllllI(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIlIIlIllllll(grandExchangeOffer.getItemId(), J.get(llllllllllllllllllIlIllllIIIlIll))) {
                                                    bl = llIIIlIlIl[1];
                                                    0;
                                                    if (3 == -1) {
                                                        return ((0xD9 ^ 0x93) & ~(0xF4 ^ 0xBE)) != 0;
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
                                            if (b.lIlIIlIlllIII(llllllllllllllllllIlIllllIIIlIlI = n2) && b.lIlIIlIlllIll(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIlIIlIllllll(grandExchangeOffer.getItemId(), J.get(llllllllllllllllllIlIllllIIIlIll))) {
                                                    bl = llIIIlIlIl[1];
                                                    0;
                                                    if (-2 > 0) {
                                                        return ((0x3E ^ 0x13) & ~(0x4E ^ 0x63)) != 0;
                                                    }
                                                } else {
                                                    bl = llIIIlIlIl[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), llIIIlIlIl[1])) {
                                                GrandExchange.abortOffer((int)J.get(llllllllllllllllllIlIllllIIIllIl2));
                                            }
                                            if (b.lIlIIlIllIlll(llllllllllllllllllIlIllllIIIlIlI)) {
                                                if (!b.lIlIIlIlllIII(GrandExchange.isBuying() ? 1 : 0) || b.lIlIIlIllllIl(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2))) {
                                                    b.a(J.get(llllllllllllllllllIlIllllIIIllIl2));
                                                }
                                                if (b.lIlIIlIllllll(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2)) && b.lIlIIlIllllIl(GrandExchange.getQuantity(), K.get(llllllllllllllllllIlIllllIIIllIl2))) {
                                                    GrandExchange.setQuantity((int)K.get(llllllllllllllllllIlIllllIIIllIl2));
                                                }
                                                int llllllllllllllllllIlIllllIIIlIIl = L.get(llllllllllllllllllIlIllllIIIllIl2);
                                                int llllllllllllllllllIlIllllIIIlIII = llIIIlIlIl[0];
                                                Widget llllllllllllllllllIlIllllIIIIlll = Widgets.get((int)llIIIlIlIl[10], (int)llIIIlIlIl[11]);
                                                if (b.lIlIIlIlllIII(GrandExchange.isOpen() ? 1 : 0) && b.lIlIIlIlllIII(GrandExchange.isBuying() ? 1 : 0) && b.lIlIIllIIIIII(llllllllllllllllllIlIllllIIIIlll) && b.lIlIIlIllIlll(llllllllllllllllllIlIllllIIIIlll.getText().isEmpty() ? 1 : 0)) {
                                                    int llllllllllllllllllIlIllllIIIIllI;
                                                    llllllllllllllllllIlIllllIIIlIII = llllllllllllllllllIlIllllIIIIllI = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + llllllllllllllllllIlIllllIIIIllI + "|Given price: " + String.valueOf(L.get(llllllllllllllllllIlIllllIIIllIl2)));
                                                }
                                                if (b.lIlIIlIlllIlI(llllllllllllllllllIlIllllIIIlIII, llllllllllllllllllIlIllllIIIlIIl)) {
                                                    double llllllllllllllllllIlIllllIIIIllI;
                                                    if (b.lIlIIlIlllIll(llllllllllllllllllIlIllllIIIlIII, llIIIlIlIl[12])) {
                                                        llllllllllllllllllIlIllllIIIIllI = 0.1;
                                                        0;
                                                        if (3 > 3) {
                                                            return;
                                                        }
                                                    } else {
                                                        llllllllllllllllllIlIllllIIIIllI = 0.3;
                                                    }
                                                    int llllllllllllllllllIlIllllIIIIlIl = (int)((double)llllllllllllllllllIlIllllIIIlIII + (double)llllllllllllllllllIlIllllIIIlIII * llllllllllllllllllIlIllllIIIIllI);
                                                    System.out.println("Increased price: " + llllllllllllllllllIlIllllIIIIlIl);
                                                    if (b.lIlIIlIllllll(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2)) && b.lIlIIlIllllIl(GrandExchange.getPrice(), llllllllllllllllllIlIllllIIIIlIl)) {
                                                        GrandExchange.setPrice((int)llllllllllllllllllIlIllllIIIIlIl);
                                                    }
                                                    if (b.lIlIIlIllllll(GrandExchange.getItemId(), J.get(llllllllllllllllllIlIllllIIIllIl2)) && b.lIlIIlIllllll(GrandExchange.getPrice(), llllllllllllllllllIlIllllIIIIlIl)) {
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
                                llllllllllllllllllIlIllllIIIlllI.remove(llIIIlIlIl[0]);
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
                                    llllllllllllllllllIlIllllIIIlllI.remove(llIIIlIlIl[0]);
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
                                    llllllllllllllllllIlIllllIIIlllI.remove(llIIIlIlIl[0]);
                                    0;
                                    Time.sleepTicks((int)llIIIlIlIl[8]);
                                    0;
                                    0;
                                    if (null == null) continue;
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
                                    llllllllllllllllllIlIllllIIIlllI.remove(llIIIlIlIl[0]);
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
                                    llllllllllllllllllIlIllllIIIlllI.remove(llIIIlIlIl[0]);
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
                                    llllllllllllllllllIlIllllIIIlllI.remove(llIIIlIlIl[0]);
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
                        llllllllllllllllllIlIllllIIIlllI.remove(llIIIlIlIl[0]);
                        0;
                        Time.sleepTicks((int)llIIIlIlIl[8]);
                        0;
                        0;
                        if (((0xC9 ^ 0x9F ^ (0x9A ^ 0x90)) & (0xFF ^ 0x8D ^ (0x2F ^ 1) ^ -1)) == 0) continue;
                        return;
                    }
                    if (!b.lIlIIlIllIlll(b.a(llllllllllllllllllIlIllllIIIllII) ? 1 : 0)) break;
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
                System.out.println(llllllllllllllllllIlIllllIIIlllI.get(llllllllllllllllllIlIllllIIIllIl2).p());
                if (b.lIlIIlIllllll(J.get(llllllllllllllllllIlIllllIIIllIl2), llIIIlIlIl[15])) {
                    J.remove(llIIIlIlIl[0]);
                    0;
                    K.remove(llIIIlIlIl[0]);
                    0;
                    L.remove(llIIIlIlIl[0]);
                    0;
                    llllllllllllllllllIlIllllIIIlllI.remove(llIIIlIlIl[0]);
                    0;
                }
                if (b.lIlIIlIlllIII(b.a(llllllllllllllllllIlIllllIIIllII) ? 1 : 0)) {
                    J.remove(llIIIlIlIl[0]);
                    0;
                    K.remove(llIIIlIlIl[0]);
                    0;
                    L.remove(llIIIlIlIl[0]);
                    0;
                    llllllllllllllllllIlIllllIIIlllI.remove(llIIIlIlIl[0]);
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
        int llllllllllllllllllIlIlllIllIllll;
        int n3;
        int llllllllllllllllllIlIlllIlllIIII;
        if (b.lIlIIlIllIlll(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.lIlIIlIlllIII(Static.getClient().isItemDefinitionCached(llllllllllllllllllIlIlllIlllIIII) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(llllllllllllllllllIlIlllIlllIIII).getLinkedNoteId();
            0;
            if ((0x64 ^ 2 ^ (0xF8 ^ 0x9B)) == 0) {
                return;
            }
        } else {
            n3 = llllllllllllllllllIlIlllIllIllll = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(llllllllllllllllllIlIlllIlllIIII).getLinkedNoteId())).intValue();
        }
        if (!b.lIlIIlIllllIl(GrandExchange.getItemId(), llIIIlIlIl[24]) || b.lIlIIlIllllIl(GrandExchange.getItemId(), llllllllllllllllllIlIlllIlllIIII) && b.lIlIIlIllllIl(GrandExchange.getItemId(), llllllllllllllllllIlIlllIllIllll)) {
            if (b.lIlIIlIllIlll(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)llllllllllllllllllIlIlllIlllIIII);
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
            List<Integer> llllllllllllllllllIlIllllIIIIIIl;
            Time.sleepTicks((int)llIIIlIlIl[8]);
            0;
            int llllllllllllllllllIlIllllIIIIIII = llIIIlIlIl[0];
            while (b.lIlIIlIlllIIl(llllllllllllllllllIlIllllIIIIIII, llllllllllllllllllIlIllllIIIIIIl.size())) {
                int[] nArray = new int[llIIIlIlIl[1]];
                nArray[b.llIIIlIlIl[0]] = llllllllllllllllllIlIllllIIIIIIl.get(llllllllllllllllllIlIllllIIIIIII);
                if (b.lIlIIlIlllllI(Inventory.getCount((int[])nArray))) {
                    int llllllllllllllllllIlIlllIlllllll;
                    if (b.lIlIIlIllIlll(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[llIIIlIlIl[1]];
                        nArray2[b.llIIIlIlIl[0]] = llllllllllllllllllIlIllllIIIIIIl.get(llllllllllllllllllIlIllllIIIIIII);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)llIIIlIlIl[8]);
                        0;
                        llllllllllllllllllIlIlllIlllllll = llllllllllllllllllIlIllllIIIIIII;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIllllll(GrandExchange.getItemId(), (Integer)llllllllllllllllllIlIllllIIIIIIl.get(llllllllllllllllllIlIlllIlllllll))) {
                                bl = llIIIlIlIl[1];
                                0;
                                if (3 < 2) {
                                    return ((0x8D ^ 0x9B) & ~(0x86 ^ 0x90)) != 0;
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
                            llllllllllllllllllIlIlllIlllllll = llllllllllllllllllIlIllllIIIIIII;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.lIlIIlIllllll(GrandExchange.getPrice(), llIIIlIlIl[1])) {
                                    bl = llIIIlIlIl[1];
                                    0;
                                    if (2 < -1) {
                                        return ((0xC2 ^ 0x81) & ~(0xC6 ^ 0x85)) != 0;
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
                ++llllllllllllllllllIlIllllIIIIIII;
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

    private static String lIlIIlIllIIll(String llllllllllllllllllIlIlllIlIIlIIl, String llllllllllllllllllIlIlllIlIIlIII) {
        llllllllllllllllllIlIlllIlIIlIIl = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIlllIlIIIlll = new StringBuilder();
        char[] llllllllllllllllllIlIlllIlIIIllI = llllllllllllllllllIlIlllIlIIlIII.toCharArray();
        int llllllllllllllllllIlIlllIlIIIlIl = llIIIlIlIl[0];
        char[] llllllllllllllllllIlIlllIIllllll = llllllllllllllllllIlIlllIlIIlIIl.toCharArray();
        int llllllllllllllllllIlIlllIIlllllI = llllllllllllllllllIlIlllIIllllll.length;
        int llllllllllllllllllIlIlllIIllllIl = llIIIlIlIl[0];
        while (b.lIlIIlIlllIIl(llllllllllllllllllIlIlllIIllllIl, llllllllllllllllllIlIlllIIlllllI)) {
            char llllllllllllllllllIlIlllIlIIlIlI = llllllllllllllllllIlIlllIIllllll[llllllllllllllllllIlIlllIIllllIl];
            llllllllllllllllllIlIlllIlIIIlll.append((char)(llllllllllllllllllIlIlllIlIIlIlI ^ llllllllllllllllllIlIlllIlIIIllI[llllllllllllllllllIlIlllIlIIIlIl % llllllllllllllllllIlIlllIlIIIllI.length]));
            0;
            ++llllllllllllllllllIlIlllIlIIIlIl;
            ++llllllllllllllllllIlIlllIIllllIl;
            0;
            if (-1 <= -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIlllIlIIIlll);
    }

    private static String lIlIIlIllIIlI(String llllllllllllllllllIlIlllIlIlIlll, String llllllllllllllllllIlIlllIlIllIII) {
        try {
            SecretKeySpec llllllllllllllllllIlIlllIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlllIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIlllIlIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIlllIlIllIll.init(llIIIlIlIl[8], llllllllllllllllllIlIlllIlIlllII);
            return new String(llllllllllllllllllIlIlllIlIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIlllIlIllIlI) {
            llllllllllllllllllIlIlllIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllllll(int n2, int n3) {
        return n2 == n3;
    }
}

