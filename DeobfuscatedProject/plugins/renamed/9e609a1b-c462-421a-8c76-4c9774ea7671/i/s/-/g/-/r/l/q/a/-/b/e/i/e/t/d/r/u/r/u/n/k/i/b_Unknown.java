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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.c_Unknown;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f_Unknown;
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

public class b_Unknown {
    public static final /* synthetic */ WorldPoint I;
    private static /* synthetic */ String[] lIIIllllIlIll;
    public static /* synthetic */ List<Integer> L;
    private static /* synthetic */ int[] lIIIllllIllII;
    public static /* synthetic */ List<Integer> K;
    public static /* synthetic */ List<Integer> J;

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string) {
        List list = Inventory.getAll();
        if (b.lIlIIlIlllIllII(list.isEmpty() ? 1 : 0)) {
            void var31;
            String var36;
            Object var2_2 = null;
            if (b.lIlIIlIlllIllIl(string.contains(lIIIllllIlIll[lIIIllllIllII[25]]) ? 1 : 0)) {
                var36 = string.replace(lIIIllllIlIll[lIIIllllIllII[26]], lIIIllllIlIll[lIIIllllIllII[13]]).trim();
            }
            int var30 = lIIIllllIllII[0];
            while (b.lIlIIlIlllIlllI(var30, var31.size())) {
                String var34 = ((Item)var31.get(var30)).getName();
                if (b.lIlIIlIllllIlIl(var34)) {
                    String var38;
                    if (b.lIlIIlIlllIllIl(var34.contains(var38) ? 1 : 0)) {
                        return lIIIllllIllII[1];
                    }
                    if (b.lIlIIlIllllIlIl(var36) && b.lIlIIlIlllIllIl(var34.contains(var36) ? 1 : 0)) {
                        return lIIIllllIllII[1];
                    }
                }
                ++var30;
                0;
                if (1 != 0) continue;
                return false;
            }
        }
        return lIIIllllIllII[0];
    }

    private static boolean lIlIIlIlllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIlllIlIII(String var37, String var17) {
        var37 = new String(Base64.getDecoder().decode(var37.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var7 = lIIIllllIllII[0];
        char[] var14 = var37.toCharArray();
        int var3 = var14.length;
        int var23 = lIIIllllIllII[0];
        while (b.lIlIIlIlllIlllI(var23, var3)) {
            char var15 = var14[var23];
            var10.append((char)(var15 ^ var19[var7 % var19.length]));
            0;
            ++var7;
            ++var23;
            0;
            if (((0x36 ^ 0x1D) & ~(0x37 ^ 0x1C)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void lIlIIlIlllIlIlI() {
        lIIIllllIllII = new int[33];
        b.lIIIllllIllII[0] = (0xD6 ^ 0x8C) & ~(0xC6 ^ 0x9C);
        b.lIIIllllIllII[1] = 1;
        b.lIIIllllIllII[2] = 0xFFFFC7E7 & 0x3BFB;
        b.lIIIllllIllII[3] = 0x1D ^ 0x17;
        b.lIIIllllIllII[4] = 3;
        b.lIIIllllIllII[5] = 0xFFFFFB9D & 0x17EA;
        b.lIIIllllIllII[6] = 0xFFFF9F47 & Short.MAX_VALUE;
        b.lIIIllllIllII[7] = 0x2E ^ 0x2A;
        b.lIIIllllIllII[8] = 2;
        b.lIIIllllIllII[9] = 0xFFFFF3FF & 0xECA;
        b.lIIIllllIllII[10] = -(0xFFFFED03 & 0x76FF) & (0xFFFFFFD3 & 0x65FF);
        b.lIIIllllIllII[11] = 0x17 ^ 0xC;
        b.lIIIllllIllII[12] = 0xFFFFEEEA & 0xF5355;
        b.lIIIllllIllII[13] = 0xC0 ^ 0xC7;
        b.lIIIllllIllII[14] = -(0xFFFFF952 & 0x2EEF) & (0xFFFFFBFB & 0x2DEF);
        b.lIIIllllIllII[15] = 0xFFFFCBEF & 0x3FDB;
        b.lIIIllllIllII[16] = 0xFFFFB7FE & 0x4F3F;
        b.lIIIllllIllII[17] = -(0xFFFFB2E3 & 0x7D9D) & (0xFFFFFFFF & 0x37FD);
        b.lIIIllllIllII[18] = -(0xFFFF958B & 0x7A75) & (0xFFFFDFFE & 0x377F);
        b.lIIIllllIllII[19] = -(0xFFFFBFCF & 0x6673) & (0xFFFFEFEE & 0x37FF);
        b.lIIIllllIllII[20] = 0xFFFFDFCF & 0x3F7D;
        b.lIIIllllIllII[21] = 0xFFFF9DB7 & 0x6359;
        b.lIIIllllIllII[22] = -(0xFFFFDE97 & 0x25EF) & (0xFFFFBDFF & 0x77D7);
        b.lIIIllllIllII[23] = -(0xFFFFFF2F & 0xAD3) & (0xFFFFBF7E & 0x5FFF);
        b.lIIIllllIllII[24] = -1;
        b.lIIIllllIllII[25] = 0x22 ^ 0x5B ^ (0xD5 ^ 0xA9);
        b.lIIIllllIllII[26] = 0x7C ^ 0x7A;
        b.lIIIllllIllII[27] = 0x64 ^ 0x6F;
        b.lIIIllllIllII[28] = 0x50 ^ 0xB ^ (0x3F ^ 0x6C);
        b.lIIIllllIllII[29] = 0x34 ^ 0x3D;
        b.lIIIllllIllII[30] = -(0xFFFFD7B3 & 0x39EF) & (0xFFFFDDFF & 0x3FFF);
        b.lIIIllllIllII[31] = -(0xFFFFF2C6 & 0x7F3B) & (0xFFFFFFBF & 0x7FDF);
        b.lIIIllllIllII[32] = 0x64 ^ 0x76 ^ (0x59 ^ 0x47);
    }

    public static void a(List<d> list) {
        block65: {
            List<d> var11;
            int lllllllllllllllIIIIIIllIlIIlIlII2;
            if (b.lIlIIlIlllIllII(list.isEmpty() ? 1 : 0) && b.lIlIIlIlllIllIl(J.isEmpty() ? 1 : 0)) {
                lllllllllllllllIIIIIIllIlIIlIlII2 = lIIIllllIllII[0];
                while (b.lIlIIlIlllIlllI(lllllllllllllllIIIIIIllIlIIlIlII2, var11.size())) {
                    J.add(var11.get(lllllllllllllllIIIIIIllIlIIlIlII2).p());
                    0;
                    K.add(var11.get(lllllllllllllllIIIIIIllIlIIlIlII2).q());
                    0;
                    L.add(var11.get(lllllllllllllllIIIIIIllIlIIlIlII2).r());
                    0;
                    ++lllllllllllllllIIIIIIllIlIIlIlII2;
                    0;
                    if (3 != 0) continue;
                    return;
                }
            }
            int[] nArray = new int[lIIIllllIllII[1]];
            nArray[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
            if (!b.lIlIIlIlllIllll(Inventory.getCount((int[])nArray), lIIIllllIllII[1]) || b.lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                if (b.lIlIIlIlllIllIl(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lIIIllllIllII[4]);
                    0;
                    Predicate<Item> lllllllllllllllIIIIIIllIlIIlIlII2 = item -> item.getName().toLowerCase().contains(lIIIllllIlIll[lIIIllllIllII[27]]);
                    if (b.lIlIIlIlllIllIl(Bank.contains(lllllllllllllllIIIIIIllIlIIlIlII2) ? 1 : 0) && b.lIlIIlIlllIllII(Inventory.contains(item -> item.getName().contains(lIIIllllIlIll[lIIIllllIllII[3]])) ? 1 : 0) && b.lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                        Bank.withdraw(lllllllllllllllIIIIIIllIlIIlIlII2, (int)lIIIllllIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllII[4]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIllllIIll(Inventory.getCount((Predicate)lllllllllllllllIIIIIIllIlIIlIlII2))) {
                                bl = lIIIllllIllII[1];
                                0;
                                
                                }
                            } else {
                                bl = lIIIllllIllII[0];
                            }
                            return bl;
                        }, (int)lIIIllllIllII[5]);
                        0;
                    }
                    if (b.lIlIIlIlllIllII(Bank.contains((int[])f.bk) ? 1 : 0) && b.lIlIIlIlllIllII(Inventory.contains(item -> item.getName().contains(lIIIllllIlIll[lIIIllllIllII[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIllllIllII[1]];
                        nArray2[b.lIIIllllIllII[0]] = lIIIllllIllII[6];
                        if (b.lIlIIlIlllIllIl(Bank.contains((int[])nArray2) ? 1 : 0) && b.lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                            Bank.withdraw((int)lIIIllllIllII[6], (int)lIIIllllIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIIllllIllII[4]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllllIllII[1]];
                                nArray[b.lIIIllllIllII[0]] = lIIIllllIllII[6];
                                if (b.lIlIIlIllllIIll(Inventory.getCount((int[])nArray))) {
                                    bl = lIIIllllIllII[1];
                                    0;
                                    if (1 > 1) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIllllIllII[0];
                                }
                                return bl;
                            }, (int)lIIIllllIllII[5]);
                            0;
                        }
                    }
                    if (b.lIlIIlIllllIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                        int[] nArray3 = new int[lIIIllllIllII[1]];
                        nArray3[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
                        if (b.lIlIIlIlllIlllI(Inventory.getCount((int[])nArray3), lIIIllllIllII[1])) {
                            Bank.withdrawAll((int)lIIIllllIllII[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIIllllIllII[4]);
                            0;
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lIIIllllIllII[1]];
                                nArray[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lIIIllllIllII[5]);
                            0;
                        }
                    }
                }
                if (b.lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                    if (b.lIlIIlIlllIllIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIIIllllIllII[7]);
                        0;
                    }
                    if (b.lIlIIlIlllIllII(Bank.isOpen() ? 1 : 0)) {
                        if (b.lIlIIlIlllIllIl(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bk).interact(lIIIllllIlIll[lIIIllllIllII[0]]);
                            Time.sleepTicks((int)lIIIllllIllII[8]);
                            0;
                        }
                        if (b.lIlIIlIlllIllIl(Equipment.contains((int[])f.bk) ? 1 : 0) && b.lIlIIlIllllIIlI(Players.getLocal().getAnimation(), lIIIllllIllII[9])) {
                            Equipment.getFirst((int[])f.bk).interact(lIIIllllIlIll[lIIIllllIllII[1]]);
                            Time.sleepTicks((int)lIIIllllIllII[4]);
                            0;
                        }
                        Movement.walkTo((WorldPoint)I);
                        0;
                    }
                }
            }
            if (b.lIlIIlIlllIllII(Bank.isOpen() ? 1 : 0) && b.lIlIIlIllllIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                int[] nArray4 = new int[lIIIllllIllII[1]];
                nArray4[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
                if (b.lIlIIlIlllIlllI(Inventory.getCount((int[])nArray4), lIIIllllIllII[1])) {
                    a.a();
                }
            }
            if (b.lIlIIlIlllIllII(GrandExchange.isOpen() ? 1 : 0)) {
                int[] nArray5 = new int[lIIIllllIllII[1]];
                nArray5[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
                if (b.lIlIIlIllllIIll(Inventory.getCount((int[])nArray5)) && b.lIlIIlIllllIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                    GrandExchange.open();
                    Time.sleepUntil(() -> GrandExchange.isOpen(), (int)lIIIllllIllII[5]);
                    0;
                }
            }
            if (!b.lIlIIlIlllIllIl(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[lIIIllllIllII[1]];
            nArray6[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
            if (!b.lIlIIlIllllIIll(Inventory.getCount((int[])nArray6))) break block65;
            lllllllllllllllIIIIIIllIlIIlIlII2 = lIIIllllIllII[0];
            while (b.lIlIIlIlllIlllI(lllllllllllllllIIIIIIllIlIIlIlII2, J.size())) {
                String var5 = c.c(J.get(lllllllllllllllIIIIIIllIlIIlIlII2));
                System.out.println("Buying " + var5 + " and itemID is: " + String.valueOf(J.get(lllllllllllllllIIIIIIllIlIIlIlII2)));
                while (b.lIlIIlIlllIllII(b.a(var5) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                                            int var25;
                                            int n2;
                                            int var20 = lllllllllllllllIIIIIIllIlIIlIlII2;
                                            if (b.lIlIIlIllllIIll(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIlIIlIllllIlII(grandExchangeOffer.getItemId(), J.get(var20))) {
                                                    bl = lIIIllllIllII[1];
                                                    0;
                                                    
                                                    }
                                                } else {
                                                    bl = lIIIllllIllII[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lIIIllllIllII[1];
                                                0;
                                                if ((0x52 ^ 0x56) == 2) {
                                                    return;
                                                }
                                            } else {
                                                n2 = lIIIllllIllII[0];
                                            }
                                            if (b.lIlIIlIlllIllIl(var25 = n2) && b.lIlIIlIllllIIII(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIlIIlIllllIlII(grandExchangeOffer.getItemId(), J.get(var20))) {
                                                    bl = lIIIllllIllII[1];
                                                    0;
                                                    if (-(112 + 5 - 26 + 48 ^ 66 + 138 - 190 + 129) > 0) {
                                                        return ((0xC2 ^ 0xBE ^ (0x35 ^ 1)) & (0xE9 ^ 0xAA ^ (0xC9 ^ 0xC2) ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIIllllIllII[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), lIIIllllIllII[1])) {
                                                GrandExchange.abortOffer((int)J.get(lllllllllllllllIIIIIIllIlIIlIlII2));
                                            }
                                            if (b.lIlIIlIlllIllII(var25)) {
                                                if (!b.lIlIIlIlllIllIl(GrandExchange.isBuying() ? 1 : 0) || b.lIlIIlIllllIIlI(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2))) {
                                                    b.a(J.get(lllllllllllllllIIIIIIllIlIIlIlII2));
                                                }
                                                if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2)) && b.lIlIIlIllllIIlI(GrandExchange.getQuantity(), K.get(lllllllllllllllIIIIIIllIlIIlIlII2))) {
                                                    GrandExchange.setQuantity((int)K.get(lllllllllllllllIIIIIIllIlIIlIlII2));
                                                }
                                                int var33 = L.get(lllllllllllllllIIIIIIllIlIIlIlII2);
                                                int var24 = lIIIllllIllII[0];
                                                Widget var2 = Widgets.get((int)lIIIllllIllII[10], (int)lIIIllllIllII[11]);
                                                if (b.lIlIIlIlllIllIl(GrandExchange.isOpen() ? 1 : 0) && b.lIlIIlIlllIllIl(GrandExchange.isBuying() ? 1 : 0) && b.lIlIIlIllllIlIl(var2) && b.lIlIIlIlllIllII(var2.getText().isEmpty() ? 1 : 0)) {
                                                    int var16;
                                                    var24 = var16 = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + var16 + "|Given price: " + String.valueOf(L.get(lllllllllllllllIIIIIIllIlIIlIlII2)));
                                                }
                                                if (b.lIlIIlIlllIllll(var24, var33)) {
                                                    double var16;
                                                    if (b.lIlIIlIllllIIII(var24, lIIIllllIllII[12])) {
                                                        var16 = 0.1;
                                                        0;
                                                        if (((0xFA ^ 0xC2) & ~(0x4D ^ 0x75)) > (2 ^ 6)) {
                                                            return;
                                                        }
                                                    } else {
                                                        var16 = 0.3;
                                                    }
                                                    int var8 = (int)((double)var24 + (double)var24 * var16);
                                                    System.out.println("Increased price: " + var8);
                                                    if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2)) && b.lIlIIlIllllIIlI(GrandExchange.getPrice(), var8)) {
                                                        GrandExchange.setPrice((int)var8);
                                                    }
                                                    if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2)) && b.lIlIIlIllllIlII(GrandExchange.getPrice(), var8)) {
                                                        GrandExchange.confirm();
                                                    }
                                                    0;
                                                    if ((0x8B ^ 0xA8 ^ (0xBF ^ 0x98)) == 0) {
                                                        return;
                                                    }
                                                } else {
                                                    if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2)) && b.lIlIIlIllllIIlI(GrandExchange.getPrice(), L.get(lllllllllllllllIIIIIIllIlIIlIlII2))) {
                                                        GrandExchange.setPrice((int)L.get(lllllllllllllllIIIIIIllIlIIlIlII2));
                                                    }
                                                    if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2)) && b.lIlIIlIllllIlII(GrandExchange.getPrice(), L.get(lllllllllllllllIIIIIIllIlIIlIlII2))) {
                                                        GrandExchange.confirm();
                                                    }
                                                }
                                            }
                                        }
                                        if (b.lIlIIlIlllIllII(Worlds.inMembersWorld() ? 1 : 0)) {
                                            System.out.println(lIIIllllIlIll[lIIIllllIllII[8]]);
                                            AccBuilderRat.d = lIIIllllIllII[1];
                                            return;
                                        }
                                        if (b.lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[13])) {
                                            Movement.walkTo((WorldPoint)I);
                                            0;
                                            Time.sleepTicks((int)lIIIllllIllII[1]);
                                            0;
                                        }
                                        if (b.lIlIIlIlllIllII(GrandExchange.isOpen() ? 1 : 0)) {
                                            GrandExchange.open();
                                        }
                                        if (b.lIlIIlIlllIllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                            GrandExchange.collect();
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (b.lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                                                    bl = lIIIllllIllII[1];
                                                    0;
                                                    if (3 <= 0) {
                                                        return ((0xAD ^ 0xC1 ^ (0x78 ^ 1)) & (114 + 113 - 109 + 40 ^ 74 + 118 - 128 + 75 ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIIllllIllII[0];
                                                }
                                                return bl;
                                            }, (int)lIIIllllIllII[5]);
                                            0;
                                        }
                                        if (!b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[14])) break block66;
                                        int[] nArray7 = new int[lIIIllllIllII[1]];
                                        nArray7[b.lIIIllllIllII[0]] = lIIIllllIllII[14];
                                        if (!b.lIlIIlIlllIllII(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[15])) break block68;
                                }
                                J.remove(lIIIllllIllII[0]);
                                0;
                                K.remove(lIIIllllIllII[0]);
                                0;
                                L.remove(lIIIllllIllII[0]);
                                0;
                                var11.remove(lIIIllllIllII[0]);
                                0;
                                Time.sleepTicks((int)lIIIllllIllII[8]);
                                0;
                                0;
                                if (-3 <= 0) continue;
                                return;
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[16])) {
                                int[] nArray8 = new int[lIIIllllIllII[1]];
                                nArray8[b.lIIIllllIllII[0]] = lIIIllllIllII[16];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    0;
                                    K.remove(lIIIllllIllII[0]);
                                    0;
                                    L.remove(lIIIllllIllII[0]);
                                    0;
                                    var11.remove(lIIIllllIllII[0]);
                                    0;
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    0;
                                    0;
                                    if ((0xF0 ^ 0xA3 ^ (0x18 ^ 0x4E)) > 0) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[17])) {
                                int[] nArray9 = new int[lIIIllllIllII[1]];
                                nArray9[b.lIIIllllIllII[0]] = lIIIllllIllII[18];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    0;
                                    K.remove(lIIIllllIllII[0]);
                                    0;
                                    L.remove(lIIIllllIllII[0]);
                                    0;
                                    var11.remove(lIIIllllIllII[0]);
                                    0;
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    0;
                                    0;
                                    if (1 >= ((7 ^ 0x38 ^ (0x53 ^ 0x7E)) & (55 + 3 - -39 + 36 ^ 123 + 134 - 128 + 22 ^ -1))) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[19])) {
                                int[] nArray10 = new int[lIIIllllIllII[1]];
                                nArray10[b.lIIIllllIllII[0]] = lIIIllllIllII[19];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    0;
                                    K.remove(lIIIllllIllII[0]);
                                    0;
                                    L.remove(lIIIllllIllII[0]);
                                    0;
                                    var11.remove(lIIIllllIllII[0]);
                                    0;
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    0;
                                    0;
                                    if (-1 <= 2) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[20])) {
                                int[] nArray11 = new int[lIIIllllIllII[1]];
                                nArray11[b.lIIIllllIllII[0]] = lIIIllllIllII[20];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    0;
                                    K.remove(lIIIllllIllII[0]);
                                    0;
                                    L.remove(lIIIllllIllII[0]);
                                    0;
                                    var11.remove(lIIIllllIllII[0]);
                                    0;
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    0;
                                    0;
                                    if (-(0x5C ^ 0x59) < 0) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[21])) {
                                int[] nArray12 = new int[lIIIllllIllII[1]];
                                nArray12[b.lIIIllllIllII[0]] = lIIIllllIllII[21];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    0;
                                    K.remove(lIIIllllIllII[0]);
                                    0;
                                    L.remove(lIIIllllIllII[0]);
                                    0;
                                    var11.remove(lIIIllllIllII[0]);
                                    0;
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    0;
                                    0;
                                    if (2 > -1) continue;
                                    return;
                                }
                            }
                            if (!b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[22])) break block69;
                            String[] stringArray = new String[lIIIllllIllII[1]];
                            stringArray[b.lIIIllllIllII[0]] = lIIIllllIlIll[lIIIllllIllII[4]];
                            if (!b.lIlIIlIlllIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block70;
                            String[] stringArray2 = new String[lIIIllllIllII[1]];
                            stringArray2[b.lIIIllllIllII[0]] = lIIIllllIlIll[lIIIllllIllII[7]];
                            if (!b.lIlIIlIlllIllIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block69;
                        }
                        J.remove(lIIIllllIllII[0]);
                        0;
                        K.remove(lIIIllllIllII[0]);
                        0;
                        L.remove(lIIIllllIllII[0]);
                        0;
                        var11.remove(lIIIllllIllII[0]);
                        0;
                        Time.sleepTicks((int)lIIIllllIllII[8]);
                        0;
                        0;
                        if (2 > 0) continue;
                        return;
                    }
                    if (!b.lIlIIlIlllIllII(b.a(var5) ? 1 : 0)) break;
                    if (b.lIlIIlIlllIllIl(AccBuilderRat.d ? 1 : 0)) {
                        0;
                        if (3 > 2) break;
                        return;
                    }
                    Time.sleepTicks((int)lIIIllllIllII[4]);
                    0;
                    0;
                    if (((0x5A ^ 0x34 ^ (0xA5 ^ 0x98)) & (0xF0 ^ 0x8D ^ (0x9F ^ 0xB1) ^ -1)) == 0) continue;
                    return;
                }
                if (b.lIlIIlIlllIllIl(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lIIIllllIllII[1];
                            0;
                            if (-(0x79 ^ 0x7D) >= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIIllllIllII[0];
                        }
                        return bl;
                    }, (int)lIIIllllIllII[5]);
                    0;
                }
                System.out.println(var11.get(lllllllllllllllIIIIIIllIlIIlIlII2).p());
                if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[15])) {
                    J.remove(lIIIllllIllII[0]);
                    0;
                    K.remove(lIIIllllIllII[0]);
                    0;
                    L.remove(lIIIllllIllII[0]);
                    0;
                    var11.remove(lIIIllllIllII[0]);
                    0;
                }
                if (b.lIlIIlIlllIllIl(b.a(var5) ? 1 : 0)) {
                    J.remove(lIIIllllIllII[0]);
                    0;
                    K.remove(lIIIllllIllII[0]);
                    0;
                    L.remove(lIIIllllIllII[0]);
                    0;
                    var11.remove(lIIIllllIllII[0]);
                    0;
                }
                Time.sleepTicks((int)lIIIllllIllII[8]);
                0;
                ++lllllllllllllllIIIIIIllIlIIlIlII2;
                0;
                if ((0x9F ^ 0x9A) > 0) continue;
                return;
            }
        }
    }

    static {
        b.lIlIIlIlllIlIlI();
        b.lIlIIlIlllIlIIl();
        I = new WorldPoint(lIIIllllIllII[30], lIIIllllIllII[31], lIIIllllIllII[0]);
        J = new ArrayList<Integer>();
        K = new ArrayList<Integer>();
        L = new ArrayList<Integer>();
    }

    private static boolean lIlIIlIlllIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIllllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIlIllllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIlIlllIIllI(String var22, String var6) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIIIllllIllII[8], var12);
            return new String(var4.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIlllIlIIl() {
        lIIIllllIlIll = new String[lIIIllllIllII[32]];
        b.lIIIllllIlIll[b.lIIIllllIllII[0]] = b."Wear";
        b.lIIIllllIlIll[b.lIIIllllIllII[1]] = b."Grand Exchange";
        b.lIIIllllIlIll[b.lIIIllllIllII[8]] = b."In F2P, need to switch to a P2P world, ending script";
        b.lIIIllllIlIll[b.lIIIllllIllII[4]] = b."Stamina potion(4)";
        b.lIIIllllIlIll[b.lIIIllllIllII[7]] = b."Stamina potion (4)";
        b.lIIIllllIlIll[b.lIIIllllIllII[25]] = b."tablet";
        b.lIIIllllIlIll[b.lIIIllllIllII[26]] = b."(tablet)";
        b.lIIIllllIlIll[b.lIIIllllIllII[13]] = b."";
        b.lIIIllllIlIll[b.lIIIllllIllII[28]] = b."Close";
        b.lIIIllllIlIll[b.lIIIllllIllII[29]] = b."wealth";
        b.lIIIllllIlIll[b.lIIIllllIllII[3]] = b."wealth";
        b.lIIIllllIlIll[b.lIIIllllIllII[27]] = b."ring of wealth (";
    }

    private static boolean lIlIIlIlllIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIllllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIlIlllIllIl(int n2) {
        return n2 != 0;
    }

    public static void g() {
        Widget widget = Widgets.get((int)lIIIllllIllII[10], (int)lIIIllllIllII[8], (int)lIIIllllIllII[27]);
        if (b.lIlIIlIllllIlIl(widget)) {
            widget.interact(lIIIllllIlIll[lIIIllllIllII[28]]);
            Time.sleepTicks((int)lIIIllllIllII[8]);
            0;
        }
    }

    public static void b(List<Integer> list) {
        if (b.lIlIIlIlllIllII(GrandExchange.isOpen() ? 1 : 0)) {
            if (b.lIlIIlIlllIllIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (b.lIlIIlIlllIllII(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (b.lIlIIlIlllIllIl(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> var9;
            Time.sleepTicks((int)lIIIllllIllII[8]);
            0;
            int var21 = lIIIllllIllII[0];
            while (b.lIlIIlIlllIlllI(var21, var9.size())) {
                int[] nArray = new int[lIIIllllIllII[1]];
                nArray[b.lIIIllllIllII[0]] = var9.get(var21);
                if (b.lIlIIlIllllIIll(Inventory.getCount((int[])nArray))) {
                    int var1;
                    if (b.lIlIIlIlllIllII(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIllllIllII[1]];
                        nArray2[b.lIIIllllIllII[0]] = var9.get(var21);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lIIIllllIllII[8]);
                        0;
                        var1 = var21;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), (Integer)var9.get(var1))) {
                                bl = lIIIllllIllII[1];
                                0;
                                
                                }
                            } else {
                                bl = lIIIllllIllII[0];
                            }
                            return bl;
                        }, (int)lIIIllllIllII[23]);
                        0;
                    }
                    if (b.lIlIIlIlllIllIl(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.lIlIIlIllllIIlI(GrandExchange.getPrice(), lIIIllllIllII[24])) {
                            GrandExchange.setPrice((int)lIIIllllIllII[1]);
                            Time.sleepTicks((int)lIIIllllIllII[8]);
                            0;
                            var1 = var21;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.lIlIIlIllllIlII(GrandExchange.getPrice(), lIIIllllIllII[1])) {
                                    bl = lIIIllllIllII[1];
                                    0;
                                    if ((0xB9 ^ 0xBD) < (0xAE ^ 0xAA)) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIIllllIllII[0];
                                }
                                return bl;
                            }, (int)lIIIllllIllII[23]);
                            0;
                        }
                        if (b.lIlIIlIllllIlII(GrandExchange.getPrice(), lIIIllllIllII[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIIIllllIllII[23]);
                            0;
                        }
                    }
                    if (b.lIlIIlIlllIllIl(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lIIIllllIllII[1];
                                0;
                                if (-3 >= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIIllllIllII[0];
                            }
                            return bl;
                        }, (int)lIIIllllIllII[5]);
                        0;
                    }
                }
                ++var21;
                0;
                if (2 >= 0) continue;
                return;
            }
        }
    }

    public static void a(int n2) {
        int var35;
        int n3;
        int var29;
        if (b.lIlIIlIlllIllII(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.lIlIIlIlllIllIl(Static.getClient().isItemDefinitionCached(var29) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(var29).getLinkedNoteId();
            0;
            if (((0xDA ^ 0x9E ^ (0xB4 ^ 0xB8)) & (0xF1 ^ 0xC3 ^ (0x39 ^ 0x43) ^ -1)) != ((0 + 60 - -91 + 63 ^ 26 + 19 - 43 + 128) & (0x8A ^ 0x9B ^ (9 ^ 0x4C) ^ -1))) {
                return;
            }
        } else {
            n3 = var35 = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(var29).getLinkedNoteId())).intValue();
        }
        if (!b.lIlIIlIllllIIlI(GrandExchange.getItemId(), lIIIllllIllII[24]) || b.lIlIIlIllllIIlI(GrandExchange.getItemId(), var29) && b.lIlIIlIllllIIlI(GrandExchange.getItemId(), var35)) {
            if (b.lIlIIlIlllIllII(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)var29);
        }
    }

    private static String lIlIIlIlllIIlll(String var27, String var26) {
        try {
            SecretKeySpec var32 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), lIIIllllIllII[28]), "DES");
            Cipher var28 = Cipher.getInstance("DES");
            var28.init(lIIIllllIllII[8], var32);
            return new String(var28.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllllIlIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIlIllllIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIllllIIll(int n2) {
        return n2 > 0;
    }
}

