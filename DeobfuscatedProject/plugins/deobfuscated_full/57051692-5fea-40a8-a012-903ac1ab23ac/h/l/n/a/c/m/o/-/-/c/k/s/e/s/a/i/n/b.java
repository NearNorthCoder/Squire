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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.c;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
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
    private static /* synthetic */ int[] lIlIIlIIII;
    public static /* synthetic */ List<Integer> L;
    private static /* synthetic */ String[] lIlIIIlllI;
    public static final /* synthetic */ WorldPoint I;
    public static /* synthetic */ List<Integer> J;
    public static /* synthetic */ List<Integer> K;

    private static void lIIIlIlIllIIl() {
        lIlIIIlllI = new String[lIlIIlIIII[32]];
        b.lIlIIIlllI[b.lIlIIlIIII[0]] = b."Wear";
        b.lIlIIIlllI[b.lIlIIlIIII[1]] = b."Grand Exchange";
        b.lIlIIIlllI[b.lIlIIlIIII[8]] = b."In F2P, need to switch to a P2P world, ending script";
        b.lIlIIIlllI[b.lIlIIlIIII[4]] = b."Stamina potion(4)";
        b.lIlIIIlllI[b.lIlIIlIIII[7]] = b."Stamina potion (4)";
        b.lIlIIIlllI[b.lIlIIlIIII[25]] = b."tablet";
        b.lIlIIIlllI[b.lIlIIlIIII[26]] = b."(tablet)";
        b.lIlIIIlllI[b.lIlIIlIIII[13]] = b."";
        b.lIlIIIlllI[b.lIlIIlIIII[28]] = b."Close";
        b.lIlIIIlllI[b.lIlIIlIIII[29]] = b."wealth";
        b.lIlIIIlllI[b.lIlIIlIIII[3]] = b."wealth";
        b.lIlIIIlllI[b.lIlIIlIIII[27]] = b."ring of wealth (";
    }

    private static boolean lIIIlIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        b.lIIIlIlIlllII();
        b.lIIIlIlIllIIl();
        I = new WorldPoint(lIlIIlIIII[30], lIlIIlIIII[31], lIlIIlIIII[0]);
        J = new ArrayList<Integer>();
        K = new ArrayList<Integer>();
        L = new ArrayList<Integer>();
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string) {
        List list = Inventory.getAll();
        if (b.lIIIlIlIlllIl(list.isEmpty() ? 1 : 0)) {
            void var34;
            String var26;
            Object var2_2 = null;
            if (b.lIIIlIlIllllI(string.contains(lIlIIIlllI[lIlIIlIIII[25]]) ? 1 : 0)) {
                var26 = string.replace(lIlIIIlllI[lIlIIlIIII[26]], lIlIIIlllI[lIlIIlIIII[13]]).trim();
            }
            int var30 = lIlIIlIIII[0];
            while (b.lIIIlIlIlllll(var30, var34.size())) {
                String var15 = ((Item)var34.get(var30)).getName();
                if (b.lIIIlIllIIllI(var15)) {
                    String var7;
                    if (b.lIIIlIlIllllI(var15.contains(var7) ? 1 : 0)) {
                        return lIlIIlIIII[1];
                    }
                    if (b.lIIIlIllIIllI(var26) && b.lIIIlIlIllllI(var15.contains(var26) ? 1 : 0)) {
                        return lIlIIlIIII[1];
                    }
                }
                ++var30;
                0;
                if (3 == 3) continue;
                return false;
            }
        }
        return lIlIIlIIII[0];
    }

    private static boolean lIIIlIlIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIllIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    public static void g() {
        Widget widget = Widgets.get((int)lIlIIlIIII[10], (int)lIlIIlIIII[8], (int)lIlIIlIIII[27]);
        if (b.lIIIlIllIIllI(widget)) {
            widget.interact(lIlIIIlllI[lIlIIlIIII[28]]);
            Time.sleepTicks((int)lIlIIlIIII[8]);
            0;
        }
    }

    private static boolean lIIIlIlIlllIl(int n2) {
        return n2 == 0;
    }

    public static void a(int n2) {
        int var1;
        int n3;
        int var32;
        if (b.lIIIlIlIlllIl(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.lIIIlIlIllllI(Static.getClient().isItemDefinitionCached(var32) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(var32).getLinkedNoteId();
            0;
            if (2 != 2) {
                return;
            }
        } else {
            n3 = var1 = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(var32).getLinkedNoteId())).intValue();
        }
        if (!b.lIIIlIllIIIll(GrandExchange.getItemId(), lIlIIlIIII[24]) || b.lIIIlIllIIIll(GrandExchange.getItemId(), var32) && b.lIIIlIllIIIll(GrandExchange.getItemId(), var1)) {
            if (b.lIIIlIlIlllIl(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)var32);
        }
    }

    private static boolean lIIIlIllIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIlIllIIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlIllIIllI(Object object) {
        return object != null;
    }

    private static boolean lIIIlIlIllllI(int n2) {
        return n2 != 0;
    }

    private static String lIIIlIlIlIlll(String var19, String var37) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var22 = var37.toCharArray();
        int var27 = lIlIIlIIII[0];
        char[] var36 = var19.toCharArray();
        int var20 = var36.length;
        int var9 = lIlIIlIIII[0];
        while (b.lIIIlIlIlllll(var9, var20)) {
            char var4 = var36[var9];
            var11.append((char)(var4 ^ var22[var27 % var22.length]));
            0;
            ++var27;
            ++var9;
            0;
            if (3 != ((97 + 48 - 22 + 39 ^ 120 + 122 - 169 + 114) & ((0xB4 ^ 0xBF) & ~(0x7F ^ 0x74) ^ (0xB8 ^ 0xA1) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void lIIIlIlIlllII() {
        lIlIIlIIII = new int[33];
        b.lIlIIlIIII[0] = (0x73 ^ 0x2C) & ~(0x6B ^ 0x34);
        b.lIlIIlIIII[1] = 1;
        b.lIlIIlIIII[2] = 0xFFFFDFEB & 0x23F7;
        b.lIlIIlIIII[3] = 0x1A ^ 0x10;
        b.lIlIIlIIII[4] = 3;
        b.lIlIIlIIII[5] = -(0xFFFFFE3C & 0x4DCB) & (0xFFFFDFBF & 0x7FCF);
        b.lIlIIlIIII[6] = 0xFFFFBF77 & 0x5FCF;
        b.lIlIIlIIII[7] = 0x7B ^ 0x7F;
        b.lIlIIlIIII[8] = 2;
        b.lIlIIlIIII[9] = 0xFFFFEBEE & 0x16DB;
        b.lIlIIlIIII[10] = 0xFFFFC7D5 & 0x39FB;
        b.lIlIIlIIII[11] = 0x31 ^ 0x2A;
        b.lIlIIlIIII[12] = 0xFFFFEF42 & 0xF52FD;
        b.lIlIIlIIII[13] = 0x1A ^ 0x39 ^ (0x52 ^ 0x76);
        b.lIlIIlIIII[14] = 0xFFFFD1FE & 0x2FAB;
        b.lIlIIlIIII[15] = 0xFFFFABEB & 0x5FDF;
        b.lIlIIlIIII[16] = -(0xFFFFE997 & 0x3E6A) & (0xFFFFEFFF & 0x3F3F);
        b.lIlIIlIIII[17] = -(0xFFFFF04B & 0x5FB5) & (0xFFFFFFFD & 0x577F);
        b.lIlIIlIIII[18] = 0xFFFFF7FE & 0xF7F;
        b.lIlIIlIIII[19] = -(0xFFFFFF56 & 0x2EFB) & (0xFFFFFFFD & 0x2FFF);
        b.lIlIIlIIII[20] = -(0x7A ^ 0x69) & (0xFFFFBF7F & 0x5FDF);
        b.lIlIIlIIII[21] = -(0xFFFFFE63 & 0x69DD) & (0xFFFFEFD1 & 0x797F);
        b.lIlIIlIIII[22] = -(0xFFFFDF77 & 0x6CAF) & (0xFFFFFF77 & 0x7DFF);
        b.lIlIIlIIII[23] = -(0xFFFFBBDD & 0x6CA6) & (0xFFFFBDFF & Short.MAX_VALUE);
        b.lIlIIlIIII[24] = -1;
        b.lIlIIlIIII[25] = 0x20 ^ 0x25;
        b.lIlIIlIIII[26] = 0x85 ^ 0xAE ^ (0x90 ^ 0xBD);
        b.lIlIIlIIII[27] = 0x47 ^ 0x4C;
        b.lIlIIlIIII[28] = 0xB4 ^ 0xBC;
        b.lIlIIlIIII[29] = 0xD3 ^ 0xC5 ^ (0x2F ^ 0x30);
        b.lIlIIlIIII[30] = 0xFFFF9C5F & 0x6FFD;
        b.lIlIIlIIII[31] = 0xFFFFDD9F & 0x2FFE;
        b.lIlIIlIIII[32] = 0x6A ^ 0x66;
    }

    private static boolean lIIIlIllIIlII(int n2) {
        return n2 > 0;
    }

    private static String lIIIlIlIlIllI(String var17, String var2) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIIlIIII[28]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIlIIlIIII[8], var8);
            return new String(var5.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIlIlIlIl(String var21, String var12) {
        try {
            SecretKeySpec var31 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(lIlIIlIIII[8], var31);
            return new String(var25.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    public static void b(List<Integer> list) {
        if (b.lIIIlIlIlllIl(GrandExchange.isOpen() ? 1 : 0)) {
            if (b.lIIIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (b.lIIIlIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (b.lIIIlIlIllllI(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> var14;
            Time.sleepTicks((int)lIlIIlIIII[8]);
            0;
            int var38 = lIlIIlIIII[0];
            while (b.lIIIlIlIlllll(var38, var14.size())) {
                int[] nArray = new int[lIlIIlIIII[1]];
                nArray[b.lIlIIlIIII[0]] = var14.get(var38);
                if (b.lIIIlIllIIlII(Inventory.getCount((int[])nArray))) {
                    int var33;
                    if (b.lIIIlIlIlllIl(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIIlIIII[1]];
                        nArray2[b.lIlIIlIIII[0]] = var14.get(var38);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lIlIIlIIII[8]);
                        0;
                        var33 = var38;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIIIlIllIIlIl(GrandExchange.getItemId(), (Integer)var14.get(var33))) {
                                bl = lIlIIlIIII[1];
                                0;
                                if (3 < 3) {
                                    return ((0x69 ^ 0x59 ^ (0x68 ^ 0x6D)) & (0x73 ^ 7 ^ (0x54 ^ 0x15) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIIlIIII[0];
                            }
                            return bl;
                        }, (int)lIlIIlIIII[23]);
                        0;
                    }
                    if (b.lIIIlIlIllllI(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.lIIIlIllIIIll(GrandExchange.getPrice(), lIlIIlIIII[24])) {
                            GrandExchange.setPrice((int)lIlIIlIIII[1]);
                            Time.sleepTicks((int)lIlIIlIIII[8]);
                            0;
                            var33 = var38;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.lIIIlIllIIlIl(GrandExchange.getPrice(), lIlIIlIIII[1])) {
                                    bl = lIlIIlIIII[1];
                                    0;
                                    if (((0x78 ^ 0x4B ^ (0x1A ^ 0x72)) & (0xFA ^ 0x8F ^ (0x22 ^ 0xC) ^ -1)) != ((1 ^ (0xB7 ^ 0x98)) & (71 + 30 - 10 + 50 ^ 68 + 151 - 207 + 151 ^ -1))) {
                                        return ((88 + 122 - 118 + 109 ^ 142 + 151 - 165 + 30) & (0x4A ^ 0x54 ^ (0x4F ^ 6) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIlIIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIIlIIII[23]);
                            0;
                        }
                        if (b.lIIIlIllIIlIl(GrandExchange.getPrice(), lIlIIlIIII[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIlIIlIIII[23]);
                            0;
                        }
                    }
                    if (b.lIIIlIlIllllI(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIIIlIlIlllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lIlIIlIIII[1];
                                0;
                                if (-1 >= 0) {
                                    return ((0xE2 ^ 0x96 ^ (0xC0 ^ 0xA2)) & (0xA7 ^ 0x87 ^ (0xA4 ^ 0x92) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIIlIIII[0];
                            }
                            return bl;
                        }, (int)lIlIIlIIII[5]);
                        0;
                    }
                }
                ++var38;
                0;
                if (-(0x95 ^ 0x9C ^ (0x2A ^ 0x26)) < 0) continue;
                return;
            }
        }
    }

    private static boolean lIIIlIllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void a(List<d> list) {
        block65: {
            List<d> var16;
            int llllllllllllllllllllIIlllIlllIIl2;
            if (b.lIIIlIlIlllIl(list.isEmpty() ? 1 : 0) && b.lIIIlIlIllllI(J.isEmpty() ? 1 : 0)) {
                llllllllllllllllllllIIlllIlllIIl2 = lIlIIlIIII[0];
                while (b.lIIIlIlIlllll(llllllllllllllllllllIIlllIlllIIl2, var16.size())) {
                    J.add(var16.get(llllllllllllllllllllIIlllIlllIIl2).p());
                    0;
                    K.add(var16.get(llllllllllllllllllllIIlllIlllIIl2).q());
                    0;
                    L.add(var16.get(llllllllllllllllllllIIlllIlllIIl2).r());
                    0;
                    ++llllllllllllllllllllIIlllIlllIIl2;
                    0;
                    if ((0x14 ^ 0x10) > 0) continue;
                    return;
                }
            }
            int[] nArray = new int[lIlIIlIIII[1]];
            nArray[b.lIlIIlIIII[0]] = lIlIIlIIII[2];
            if (!b.lIIIlIllIIIII(Inventory.getCount((int[])nArray), lIlIIlIIII[1]) || b.lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                if (b.lIIIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lIlIIlIIII[4]);
                    0;
                    Predicate<Item> llllllllllllllllllllIIlllIlllIIl2 = item -> item.getName().toLowerCase().contains(lIlIIIlllI[lIlIIlIIII[27]]);
                    if (b.lIIIlIlIllllI(Bank.contains(llllllllllllllllllllIIlllIlllIIl2) ? 1 : 0) && b.lIIIlIlIlllIl(Inventory.contains(item -> item.getName().contains(lIlIIIlllI[lIlIIlIIII[3]])) ? 1 : 0) && b.lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                        Bank.withdraw(llllllllllllllllllllIIlllIlllIIl2, (int)lIlIIlIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIlIIlIIII[4]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIIIlIllIIlII(Inventory.getCount((Predicate)llllllllllllllllllllIIlllIlllIIl2))) {
                                bl = lIlIIlIIII[1];
                                0;
                                if ((2 + 82 - 56 + 128 ^ 122 + 13 - -6 + 11) == 3) {
                                    return ((0x3E ^ 0x2F ^ (0xA4 ^ 0xAC)) & (42 + 110 - -11 + 23 ^ 101 + 40 - 97 + 119 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIlIIlIIII[0];
                            }
                            return bl;
                        }, (int)lIlIIlIIII[5]);
                        0;
                    }
                    if (b.lIIIlIlIlllIl(Bank.contains((int[])f.be) ? 1 : 0) && b.lIIIlIlIlllIl(Inventory.contains(item -> item.getName().contains(lIlIIIlllI[lIlIIlIIII[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lIlIIlIIII[1]];
                        nArray2[b.lIlIIlIIII[0]] = lIlIIlIIII[6];
                        if (b.lIIIlIlIllllI(Bank.contains((int[])nArray2) ? 1 : 0) && b.lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                            Bank.withdraw((int)lIlIIlIIII[6], (int)lIlIIlIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIlIIlIIII[4]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIlIIlIIII[1]];
                                nArray[b.lIlIIlIIII[0]] = lIlIIlIIII[6];
                                if (b.lIIIlIllIIlII(Inventory.getCount((int[])nArray))) {
                                    bl = lIlIIlIIII[1];
                                    0;
                                    if ((0x2E ^ 0x2B) <= 0) {
                                        return false;
                                    }
                                } else {
                                    bl = lIlIIlIIII[0];
                                }
                                return bl;
                            }, (int)lIlIIlIIII[5]);
                            0;
                        }
                    }
                    if (b.lIIIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                        int[] nArray3 = new int[lIlIIlIIII[1]];
                        nArray3[b.lIlIIlIIII[0]] = lIlIIlIIII[2];
                        if (b.lIIIlIlIlllll(Inventory.getCount((int[])nArray3), lIlIIlIIII[1])) {
                            Bank.withdrawAll((int)lIlIIlIIII[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIlIIlIIII[4]);
                            0;
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lIlIIlIIII[1]];
                                nArray[b.lIlIIlIIII[0]] = lIlIIlIIII[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lIlIIlIIII[5]);
                            0;
                        }
                    }
                }
                if (b.lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                    if (b.lIIIlIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIlIIlIIII[7]);
                        0;
                    }
                    if (b.lIIIlIlIlllIl(Bank.isOpen() ? 1 : 0)) {
                        if (b.lIIIlIlIllllI(Inventory.contains((int[])f.be) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.be).interact(lIlIIIlllI[lIlIIlIIII[0]]);
                            Time.sleepTicks((int)lIlIIlIIII[8]);
                            0;
                        }
                        if (b.lIIIlIlIllllI(Equipment.contains((int[])f.be) ? 1 : 0) && b.lIIIlIllIIIll(Players.getLocal().getAnimation(), lIlIIlIIII[9])) {
                            Equipment.getFirst((int[])f.be).interact(lIlIIIlllI[lIlIIlIIII[1]]);
                            Time.sleepTicks((int)lIlIIlIIII[4]);
                            0;
                        }
                        Movement.walkTo((WorldPoint)I);
                        0;
                    }
                }
            }
            if (b.lIIIlIlIlllIl(Bank.isOpen() ? 1 : 0) && b.lIIIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                int[] nArray4 = new int[lIlIIlIIII[1]];
                nArray4[b.lIlIIlIIII[0]] = lIlIIlIIII[2];
                if (b.lIIIlIlIlllll(Inventory.getCount((int[])nArray4), lIlIIlIIII[1])) {
                    a.a();
                }
            }
            if (b.lIIIlIlIlllIl(GrandExchange.isOpen() ? 1 : 0)) {
                int[] nArray5 = new int[lIlIIlIIII[1]];
                nArray5[b.lIlIIlIIII[0]] = lIlIIlIIII[2];
                if (b.lIIIlIllIIlII(Inventory.getCount((int[])nArray5)) && b.lIIIlIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[3])) {
                    GrandExchange.open();
                    Time.sleepUntil(() -> GrandExchange.isOpen(), (int)lIlIIlIIII[5]);
                    0;
                }
            }
            if (!b.lIIIlIlIllllI(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[lIlIIlIIII[1]];
            nArray6[b.lIlIIlIIII[0]] = lIlIIlIIII[2];
            if (!b.lIIIlIllIIlII(Inventory.getCount((int[])nArray6))) break block65;
            llllllllllllllllllllIIlllIlllIIl2 = lIlIIlIIII[0];
            while (b.lIIIlIlIlllll(llllllllllllllllllllIIlllIlllIIl2, J.size())) {
                String var23 = c.c(J.get(llllllllllllllllllllIIlllIlllIIl2));
                System.out.println("Buying " + var23 + " and itemID is: " + String.valueOf(J.get(llllllllllllllllllllIIlllIlllIIl2)));
                while (b.lIIIlIlIlllIl(b.a(var23) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.lIIIlIlIlllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                            int var29;
                                            int n2;
                                            int var3 = llllllllllllllllllllIIlllIlllIIl2;
                                            if (b.lIIIlIllIIlII(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIIIlIllIIlIl(grandExchangeOffer.getItemId(), J.get(var3))) {
                                                    bl = lIlIIlIIII[1];
                                                    0;
                                                    if (2 < 0) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = lIlIIlIIII[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lIlIIlIIII[1];
                                                0;
                                                
                                                }
                                            } else {
                                                n2 = lIlIIlIIII[0];
                                            }
                                            if (b.lIIIlIlIllllI(var29 = n2) && b.lIIIlIllIIIIl(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIIIlIllIIlIl(grandExchangeOffer.getItemId(), J.get(var3))) {
                                                    bl = lIlIIlIIII[1];
                                                    0;
                                                    
                                                    }
                                                } else {
                                                    bl = lIlIIlIIII[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), lIlIIlIIII[1])) {
                                                GrandExchange.abortOffer((int)J.get(llllllllllllllllllllIIlllIlllIIl2));
                                            }
                                            if (b.lIIIlIlIlllIl(var29)) {
                                                if (!b.lIIIlIlIllllI(GrandExchange.isBuying() ? 1 : 0) || b.lIIIlIllIIIll(GrandExchange.getItemId(), J.get(llllllllllllllllllllIIlllIlllIIl2))) {
                                                    b.a(J.get(llllllllllllllllllllIIlllIlllIIl2));
                                                }
                                                if (b.lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(llllllllllllllllllllIIlllIlllIIl2)) && b.lIIIlIllIIIll(GrandExchange.getQuantity(), K.get(llllllllllllllllllllIIlllIlllIIl2))) {
                                                    GrandExchange.setQuantity((int)K.get(llllllllllllllllllllIIlllIlllIIl2));
                                                }
                                                int var24 = L.get(llllllllllllllllllllIIlllIlllIIl2);
                                                int var35 = lIlIIlIIII[0];
                                                Widget var18 = Widgets.get((int)lIlIIlIIII[10], (int)lIlIIlIIII[11]);
                                                if (b.lIIIlIlIllllI(GrandExchange.isOpen() ? 1 : 0) && b.lIIIlIlIllllI(GrandExchange.isBuying() ? 1 : 0) && b.lIIIlIllIIllI(var18) && b.lIIIlIlIlllIl(var18.getText().isEmpty() ? 1 : 0)) {
                                                    int var13;
                                                    var35 = var13 = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + var13 + "|Given price: " + String.valueOf(L.get(llllllllllllllllllllIIlllIlllIIl2)));
                                                }
                                                if (b.lIIIlIllIIIII(var35, var24)) {
                                                    double var13;
                                                    if (b.lIIIlIllIIIIl(var35, lIlIIlIIII[12])) {
                                                        var13 = 0.1;
                                                        0;
                                                        if ((0x85 ^ 0x80) <= 0) {
                                                            return;
                                                        }
                                                    } else {
                                                        var13 = 0.3;
                                                    }
                                                    int var10 = (int)((double)var35 + (double)var35 * var13);
                                                    System.out.println("Increased price: " + var10);
                                                    if (b.lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(llllllllllllllllllllIIlllIlllIIl2)) && b.lIIIlIllIIIll(GrandExchange.getPrice(), var10)) {
                                                        GrandExchange.setPrice((int)var10);
                                                    }
                                                    if (b.lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(llllllllllllllllllllIIlllIlllIIl2)) && b.lIIIlIllIIlIl(GrandExchange.getPrice(), var10)) {
                                                        GrandExchange.confirm();
                                                    }
                                                    0;
                                                    if (((0x1F ^ 0x36 ^ (0xC5 ^ 0xAB)) & (74 + 196 - 259 + 193 ^ 128 + 48 - 121 + 84 ^ -1)) != 0) {
                                                        return;
                                                    }
                                                } else {
                                                    if (b.lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(llllllllllllllllllllIIlllIlllIIl2)) && b.lIIIlIllIIIll(GrandExchange.getPrice(), L.get(llllllllllllllllllllIIlllIlllIIl2))) {
                                                        GrandExchange.setPrice((int)L.get(llllllllllllllllllllIIlllIlllIIl2));
                                                    }
                                                    if (b.lIIIlIllIIlIl(GrandExchange.getItemId(), J.get(llllllllllllllllllllIIlllIlllIIl2)) && b.lIIIlIllIIlIl(GrandExchange.getPrice(), L.get(llllllllllllllllllllIIlllIlllIIl2))) {
                                                        GrandExchange.confirm();
                                                    }
                                                }
                                            }
                                        }
                                        if (b.lIIIlIlIlllIl(Worlds.inMembersWorld() ? 1 : 0)) {
                                            System.out.println(lIlIIIlllI[lIlIIlIIII[8]]);
                                            AccBuilderShamans.d = lIlIIlIIII[1];
                                            return;
                                        }
                                        if (b.lIIIlIllIIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIlIIlIIII[13])) {
                                            Movement.walkTo((WorldPoint)I);
                                            0;
                                            Time.sleepTicks((int)lIlIIlIIII[1]);
                                            0;
                                        }
                                        if (b.lIIIlIlIlllIl(GrandExchange.isOpen() ? 1 : 0)) {
                                            GrandExchange.open();
                                        }
                                        if (b.lIIIlIlIllllI(GrandExchange.canCollect() ? 1 : 0)) {
                                            GrandExchange.collect();
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (b.lIIIlIlIlllIl(GrandExchange.canCollect() ? 1 : 0)) {
                                                    bl = lIlIIlIIII[1];
                                                    0;
                                                    if ((3 & (3 ^ -1)) != 0) {
                                                        return ((10 + 61 - -129 + 54 ^ 109 + 43 - 70 + 76) & (0x4C ^ 0x5E ^ (0x41 ^ 0x33) ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = lIlIIlIIII[0];
                                                }
                                                return bl;
                                            }, (int)lIlIIlIIII[5]);
                                            0;
                                        }
                                        if (!b.lIIIlIllIIlIl(J.get(llllllllllllllllllllIIlllIlllIIl2), lIlIIlIIII[14])) break block66;
                                        int[] nArray7 = new int[lIlIIlIIII[1]];
                                        nArray7[b.lIlIIlIIII[0]] = lIlIIlIIII[14];
                                        if (!b.lIIIlIlIlllIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.lIIIlIllIIlIl(J.get(llllllllllllllllllllIIlllIlllIIl2), lIlIIlIIII[15])) break block68;
                                }
                                J.remove(lIlIIlIIII[0]);
                                0;
                                K.remove(lIlIIlIIII[0]);
                                0;
                                L.remove(lIlIIlIIII[0]);
                                0;
                                var16.remove(lIlIIlIIII[0]);
                                0;
                                Time.sleepTicks((int)lIlIIlIIII[8]);
                                0;
                                0;
                                if (-3 < 0) continue;
                                return;
                            }
                            if (b.lIIIlIllIIlIl(J.get(llllllllllllllllllllIIlllIlllIIl2), lIlIIlIIII[16])) {
                                int[] nArray8 = new int[lIlIIlIIII[1]];
                                nArray8[b.lIlIIlIIII[0]] = lIlIIlIIII[16];
                                if (b.lIIIlIlIllllI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    0;
                                    K.remove(lIlIIlIIII[0]);
                                    0;
                                    L.remove(lIlIIlIIII[0]);
                                    0;
                                    var16.remove(lIlIIlIIII[0]);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIIII[8]);
                                    0;
                                    0;
                                    if (3 >= ((0x6A ^ 0x2C) & ~(0x30 ^ 0x76))) continue;
                                    return;
                                }
                            }
                            if (b.lIIIlIllIIlIl(J.get(llllllllllllllllllllIIlllIlllIIl2), lIlIIlIIII[17])) {
                                int[] nArray9 = new int[lIlIIlIIII[1]];
                                nArray9[b.lIlIIlIIII[0]] = lIlIIlIIII[18];
                                if (b.lIIIlIlIllllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    0;
                                    K.remove(lIlIIlIIII[0]);
                                    0;
                                    L.remove(lIlIIlIIII[0]);
                                    0;
                                    var16.remove(lIlIIlIIII[0]);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIIII[8]);
                                    0;
                                    0;
                                    if (((139 + 214 - 202 + 87 ^ 12 + 43 - 24 + 132) & (0xED ^ 0x88 ^ (0x8F ^ 0xA7) ^ -1)) <= 0) continue;
                                    return;
                                }
                            }
                            if (b.lIIIlIllIIlIl(J.get(llllllllllllllllllllIIlllIlllIIl2), lIlIIlIIII[19])) {
                                int[] nArray10 = new int[lIlIIlIIII[1]];
                                nArray10[b.lIlIIlIIII[0]] = lIlIIlIIII[19];
                                if (b.lIIIlIlIllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    0;
                                    K.remove(lIlIIlIIII[0]);
                                    0;
                                    L.remove(lIlIIlIIII[0]);
                                    0;
                                    var16.remove(lIlIIlIIII[0]);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIIII[8]);
                                    0;
                                    0;
                                    if (3 == 3) continue;
                                    return;
                                }
                            }
                            if (b.lIIIlIllIIlIl(J.get(llllllllllllllllllllIIlllIlllIIl2), lIlIIlIIII[20])) {
                                int[] nArray11 = new int[lIlIIlIIII[1]];
                                nArray11[b.lIlIIlIIII[0]] = lIlIIlIIII[20];
                                if (b.lIIIlIlIllllI(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    0;
                                    K.remove(lIlIIlIIII[0]);
                                    0;
                                    L.remove(lIlIIlIIII[0]);
                                    0;
                                    var16.remove(lIlIIlIIII[0]);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIIII[8]);
                                    0;
                                    0;
                                    if (-2 < 0) continue;
                                    return;
                                }
                            }
                            if (b.lIIIlIllIIlIl(J.get(llllllllllllllllllllIIlllIlllIIl2), lIlIIlIIII[21])) {
                                int[] nArray12 = new int[lIlIIlIIII[1]];
                                nArray12[b.lIlIIlIIII[0]] = lIlIIlIIII[21];
                                if (b.lIIIlIlIllllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    J.remove(lIlIIlIIII[0]);
                                    0;
                                    K.remove(lIlIIlIIII[0]);
                                    0;
                                    L.remove(lIlIIlIIII[0]);
                                    0;
                                    var16.remove(lIlIIlIIII[0]);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIIII[8]);
                                    0;
                                    0;
                                    if (-1 == -1) continue;
                                    return;
                                }
                            }
                            if (!b.lIIIlIllIIlIl(J.get(llllllllllllllllllllIIlllIlllIIl2), lIlIIlIIII[22])) break block69;
                            String[] stringArray = new String[lIlIIlIIII[1]];
                            stringArray[b.lIlIIlIIII[0]] = lIlIIIlllI[lIlIIlIIII[4]];
                            if (!b.lIIIlIlIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block70;
                            String[] stringArray2 = new String[lIlIIlIIII[1]];
                            stringArray2[b.lIlIIlIIII[0]] = lIlIIIlllI[lIlIIlIIII[7]];
                            if (!b.lIIIlIlIllllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block69;
                        }
                        J.remove(lIlIIlIIII[0]);
                        0;
                        K.remove(lIlIIlIIII[0]);
                        0;
                        L.remove(lIlIIlIIII[0]);
                        0;
                        var16.remove(lIlIIlIIII[0]);
                        0;
                        Time.sleepTicks((int)lIlIIlIIII[8]);
                        0;
                        0;
                        if (1 < 3) continue;
                        return;
                    }
                    if (!b.lIIIlIlIlllIl(b.a(var23) ? 1 : 0)) break;
                    if (b.lIIIlIlIllllI(AccBuilderShamans.d ? 1 : 0)) {
                        0;
                        if (1 <= 1) break;
                        return;
                    }
                    Time.sleepTicks((int)lIlIIlIIII[4]);
                    0;
                    0;
                    
                    return;
                }
                if (b.lIIIlIlIllllI(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.lIIIlIlIlllIl(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lIlIIlIIII[1];
                            0;
                            if ((3 ^ 7) == 0) {
                                return false;
                            }
                        } else {
                            bl = lIlIIlIIII[0];
                        }
                        return bl;
                    }, (int)lIlIIlIIII[5]);
                    0;
                }
                System.out.println(var16.get(llllllllllllllllllllIIlllIlllIIl2).p());
                if (b.lIIIlIllIIlIl(J.get(llllllllllllllllllllIIlllIlllIIl2), lIlIIlIIII[15])) {
                    J.remove(lIlIIlIIII[0]);
                    0;
                    K.remove(lIlIIlIIII[0]);
                    0;
                    L.remove(lIlIIlIIII[0]);
                    0;
                    var16.remove(lIlIIlIIII[0]);
                    0;
                }
                if (b.lIIIlIlIllllI(b.a(var23) ? 1 : 0)) {
                    J.remove(lIlIIlIIII[0]);
                    0;
                    K.remove(lIlIIlIIII[0]);
                    0;
                    L.remove(lIlIIlIIII[0]);
                    0;
                    var16.remove(lIlIIlIIII[0]);
                    0;
                }
                Time.sleepTicks((int)lIlIIlIIII[8]);
                0;
                ++llllllllllllllllllllIIlllIlllIIl2;
                0;
                if ((0x49 ^ 0xF ^ (0x6B ^ 0x29)) > 3) continue;
                return;
            }
        }
    }
}

