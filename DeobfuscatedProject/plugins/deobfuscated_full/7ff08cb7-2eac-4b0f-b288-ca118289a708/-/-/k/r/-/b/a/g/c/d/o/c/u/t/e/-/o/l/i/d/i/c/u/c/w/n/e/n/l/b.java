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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.c;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import gg.squire.account.AccBuilderGWD;
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
    private static /* synthetic */ int[] llllIIIll;
    private static /* synthetic */ String[] llllIIIII;
    public static /* synthetic */ List<Integer> L;
    public static final /* synthetic */ WorldPoint K;
    public static /* synthetic */ List<Integer> M;
    public static /* synthetic */ List<Integer> N;

    public static void g() {
        Widget widget = Widgets.get((int)llllIIIll[10], (int)llllIIIll[8], (int)llllIIIll[27]);
        if (b.llIIlllIlIll(widget)) {
            widget.interact(llllIIIII[llllIIIll[28]]);
            Time.sleepTicks((int)llllIIIll[8]);
            0;
        }
    }

    private static String llIIllIlIIIl(String llIIIllIIIIll, String llIIIlIllllIl) {
        llIIIllIIIIll = new String(Base64.getDecoder().decode(llIIIllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIllIIIIIl = new StringBuilder();
        char[] llIIIllIIIIII = llIIIlIllllIl.toCharArray();
        int llIIIlIllllll = llllIIIll[0];
        char[] llIIIlIlllIIl = llIIIllIIIIll.toCharArray();
        int llIIIlIlllIII = llIIIlIlllIIl.length;
        int llIIIlIllIlll = llllIIIll[0];
        while (b.llIIlllIIlII(llIIIlIllIlll, llIIIlIlllIII)) {
            char llIIIllIIIlII = llIIIlIlllIIl[llIIIlIllIlll];
            llIIIllIIIIIl.append((char)(llIIIllIIIlII ^ llIIIllIIIIII[llIIIlIllllll % llIIIllIIIIII.length]));
            0;
            ++llIIIlIllllll;
            ++llIIIlIllIlll;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(llIIIllIIIIIl);
    }

    public static void b(List<Integer> list) {
        if (b.llIIlllIIIlI(GrandExchange.isOpen() ? 1 : 0)) {
            if (b.llIIlllIIIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (b.llIIlllIIIlI(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (b.llIIlllIIIll(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> llIIIlllIlllI;
            Time.sleepTicks((int)llllIIIll[8]);
            0;
            int llIIIlllIllIl = llllIIIll[0];
            while (b.llIIlllIIlII(llIIIlllIllIl, llIIIlllIlllI.size())) {
                int[] nArray = new int[llllIIIll[1]];
                nArray[b.llllIIIll[0]] = llIIIlllIlllI.get(llIIIlllIllIl);
                if (b.llIIlllIlIIl(Inventory.getCount((int[])nArray))) {
                    int llIIIlllIllII;
                    if (b.llIIlllIIIlI(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[llllIIIll[1]];
                        nArray2[b.llllIIIll[0]] = llIIIlllIlllI.get(llIIIlllIllIl);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)llllIIIll[8]);
                        0;
                        llIIIlllIllII = llIIIlllIllIl;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llIIlllIlIlI(GrandExchange.getItemId(), (Integer)llIIIlllIlllI.get(llIIIlllIllII))) {
                                bl = llllIIIll[1];
                                0;
                                if (-(0x27 ^ 0x23) > 0) {
                                    return false;
                                }
                            } else {
                                bl = llllIIIll[0];
                            }
                            return bl;
                        }, (int)llllIIIll[23]);
                        0;
                    }
                    if (b.llIIlllIIIll(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.llIIlllIlIII(GrandExchange.getPrice(), llllIIIll[24])) {
                            GrandExchange.setPrice((int)llllIIIll[1]);
                            Time.sleepTicks((int)llllIIIll[8]);
                            0;
                            llIIIlllIllII = llIIIlllIllIl;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.llIIlllIlIlI(GrandExchange.getPrice(), llllIIIll[1])) {
                                    bl = llllIIIll[1];
                                    0;
                                    if (((0xF3 ^ 0x8E ^ (0x92 ^ 0xAD)) & (43 + 47 - 29 + 184 ^ 17 + 150 - 142 + 158 ^ -1)) != 0) {
                                        return ((0x6F ^ 0x6A ^ (0x37 ^ 0x72)) & (142 + 50 - 128 + 134 ^ 72 + 18 - 76 + 120 ^ -1)) != 0;
                                    }
                                } else {
                                    bl = llllIIIll[0];
                                }
                                return bl;
                            }, (int)llllIIIll[23]);
                            0;
                        }
                        if (b.llIIlllIlIlI(GrandExchange.getPrice(), llllIIIll[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)llllIIIll[23]);
                            0;
                        }
                    }
                    if (b.llIIlllIIIll(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llIIlllIIIlI(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = llllIIIll[1];
                                0;
                                if (1 != 1) {
                                    return false;
                                }
                            } else {
                                bl = llllIIIll[0];
                            }
                            return bl;
                        }, (int)llllIIIll[5]);
                        0;
                    }
                }
                ++llIIIlllIllIl;
                0;
                if (1 != 3) continue;
                return;
            }
        }
    }

    private static void llIIllIlIlII() {
        llllIIIII = new String[llllIIIll[32]];
        b.llllIIIII[b.llllIIIll[0]] = b."Wear";
        b.llllIIIII[b.llllIIIll[1]] = b."Grand Exchange";
        b.llllIIIII[b.llllIIIll[8]] = b."In F2P, need to switch to a P2P world, ending script";
        b.llllIIIII[b.llllIIIll[4]] = b."Stamina potion(4)";
        b.llllIIIII[b.llllIIIll[7]] = b."Stamina potion (4)";
        b.llllIIIII[b.llllIIIll[25]] = b."tablet";
        b.llllIIIII[b.llllIIIll[26]] = b."(tablet)";
        b.llllIIIII[b.llllIIIll[13]] = b."";
        b.llllIIIII[b.llllIIIll[28]] = b."Close";
        b.llllIIIII[b.llllIIIll[29]] = b."wealth";
        b.llllIIIII[b.llllIIIll[3]] = b."wealth";
        b.llllIIIII[b.llllIIIll[27]] = b."ring of wealth (";
    }

    private static boolean llIIlllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string) {
        List list = Inventory.getAll();
        if (b.llIIlllIIIlI(list.isEmpty() ? 1 : 0)) {
            void llIIIlllIIlIl;
            String llIIIlllIIlII;
            Object var2_2 = null;
            if (b.llIIlllIIIll(string.contains(llllIIIII[llllIIIll[25]]) ? 1 : 0)) {
                llIIIlllIIlII = string.replace(llllIIIII[llllIIIll[26]], llllIIIII[llllIIIll[13]]).trim();
            }
            int llIIIlllIIIll = llllIIIll[0];
            while (b.llIIlllIIlII(llIIIlllIIIll, llIIIlllIIlIl.size())) {
                String llIIIlllIIIlI = ((Item)llIIIlllIIlIl.get(llIIIlllIIIll)).getName();
                if (b.llIIlllIlIll(llIIIlllIIIlI)) {
                    String llIIIlllIIllI;
                    if (b.llIIlllIIIll(llIIIlllIIIlI.contains(llIIIlllIIllI) ? 1 : 0)) {
                        return llllIIIll[1];
                    }
                    if (b.llIIlllIlIll(llIIIlllIIlII) && b.llIIlllIIIll(llIIIlllIIIlI.contains(llIIIlllIIlII) ? 1 : 0)) {
                        return llllIIIll[1];
                    }
                }
                ++llIIIlllIIIll;
                0;
                if (1 > 0) continue;
                return ((0x70 ^ 0x15 ^ (0x28 ^ 0x55)) & (38 + 76 - 6 + 54 ^ 162 + 150 - 218 + 92 ^ -1)) != 0;
            }
        }
        return llllIIIll[0];
    }

    private static boolean llIIlllIlIll(Object object) {
        return object != null;
    }

    private static void llIIlllIIIIl() {
        llllIIIll = new int[33];
        b.llllIIIll[0] = (0x48 ^ 0x10) & ~(0xDF ^ 0x87);
        b.llllIIIll[1] = 1;
        b.llllIIIll[2] = -(0xFFFFFFDD & 0x282F) & (0xFFFFFFFF & 0x2BEF);
        b.llllIIIll[3] = 0xAA ^ 0xA0;
        b.llllIIIll[4] = 3;
        b.llllIIIll[5] = 0xFFFF9788 & 0x7BFF;
        b.llllIIIll[6] = 0xFFFFDF47 & 0x3FFF;
        b.llllIIIll[7] = 0x67 ^ 0x63;
        b.llllIIIll[8] = 2;
        b.llllIIIll[9] = 0xFFFF92FE & 0x6FCB;
        b.llllIIIll[10] = -(0xFFFFBE37 & 0x67CB) & (0xFFFFBFFB & 0x67D7);
        b.llllIIIll[11] = 19 + 88 - 76 + 102 ^ 70 + 87 - 56 + 57;
        b.llllIIIll[12] = -(0xFFFFA4FB & 0x7BB6) & (0xFFFFFAFB & 0xF67F5);
        b.llllIIIll[13] = 0x34 ^ 0x33;
        b.llllIIIll[14] = 0xFFFFA3AA & 0x5DFF;
        b.llllIIIll[15] = -(0xFFFFF697 & 0x696D) & (0xFFFFFBEF & 0x6FDF);
        b.llllIIIll[16] = -(0xFFFFFB7E & 0xCC3) & (0xFFFFBFFF & 0x4F7F);
        b.llllIIIll[17] = -(0xFFFFF395 & 0x5CEB) & (0xFFFFD7FF & 0x7FFD);
        b.llllIIIll[18] = -(0xFFFFF18B & 0x5EF6) & (0xFFFFF7FF & 0x5FFF);
        b.llllIIIll[19] = 0xFFFF91BF & 0x6FEC;
        b.llllIIIll[20] = 0xFFFFBF6F & 0x5FDD;
        b.llllIIIll[21] = 0xFFFFFDB7 & 0x359;
        b.llllIIIll[22] = -(0xFFFFCFFB & 0x7CA7) & (0xFFFFFFFB & 0x7DF7);
        b.llllIIIll[23] = 0xFFFF9F7E & 0x75FD;
        b.llllIIIll[24] = -1;
        b.llllIIIll[25] = 0x89 ^ 0x8C;
        b.llllIIIll[26] = 104 + 28 - 78 + 75 ^ 108 + 14 - 55 + 68;
        b.llllIIIll[27] = 0x29 ^ 0x63 ^ (0xB ^ 0x4A);
        b.llllIIIll[28] = 0xA8 ^ 0xA0;
        b.llllIIIll[29] = 0 ^ 9;
        b.llllIIIll[30] = 0xFFFF9C7D & 0x6FDF;
        b.llllIIIll[31] = -(0xFFFFE76F & 0x7AB1) & (0xFFFFFFBE & 0x6FFF);
        b.llllIIIll[32] = 34 + 52 - 60 + 127 ^ 44 + 133 - 167 + 139;
    }

    private static boolean llIIlllIlIIl(int n2) {
        return n2 > 0;
    }

    private static String llIIllIlIIlI(String llIIIlIlIllII, String llIIIlIlIllIl) {
        try {
            SecretKeySpec llIIIlIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIlIllIIII = Cipher.getInstance("Blowfish");
            llIIIlIllIIII.init(llllIIIll[8], llIIIlIllIIIl);
            return new String(llIIIlIllIIII.doFinal(Base64.getDecoder().decode(llIIIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIlIllll) {
            llIIIlIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlllIIIlI(int n2) {
        return n2 == 0;
    }

    public static void a(int n2) {
        int llIIIllIlllII;
        int n3;
        int llIIIllIlllIl;
        if (b.llIIlllIIIlI(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.llIIlllIIIll(Static.getClient().isItemDefinitionCached(llIIIllIlllIl) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(llIIIllIlllIl).getLinkedNoteId();
            0;
            
            }
        } else {
            n3 = llIIIllIlllII = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(llIIIllIlllIl).getLinkedNoteId())).intValue();
        }
        if (!b.llIIlllIlIII(GrandExchange.getItemId(), llllIIIll[24]) || b.llIIlllIlIII(GrandExchange.getItemId(), llIIIllIlllIl) && b.llIIlllIlIII(GrandExchange.getItemId(), llIIIllIlllII)) {
            if (b.llIIlllIIIlI(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)llIIIllIlllIl);
        }
    }

    private static String llIIllIlIIll(String llIIIlIIlllll, String llIIIlIIllllI) {
        try {
            SecretKeySpec llIIIlIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIIllllI.getBytes(StandardCharsets.UTF_8)), llllIIIll[28]), "DES");
            Cipher llIIIlIlIIIll = Cipher.getInstance("DES");
            llIIIlIlIIIll.init(llllIIIll[8], llIIIlIlIIlII);
            return new String(llIIIlIlIIIll.doFinal(Base64.getDecoder().decode(llIIIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlIlIIIlI) {
            llIIIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlllIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIlllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIlllIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlllIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        b.llIIlllIIIIl();
        b.llIIllIlIlII();
        K = new WorldPoint(llllIIIll[30], llllIIIll[31], llllIIIll[0]);
        L = new ArrayList<Integer>();
        M = new ArrayList<Integer>();
        N = new ArrayList<Integer>();
    }

    private static boolean llIIlllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlllIlIII(int n2, int n3) {
        return n2 != n3;
    }

    public static void a(List<d> list) {
        block65: {
            List<d> llIIIlllllIll;
            int llIIIlllllIlI2;
            if (b.llIIlllIIIlI(list.isEmpty() ? 1 : 0) && b.llIIlllIIIll(L.isEmpty() ? 1 : 0)) {
                llIIIlllllIlI2 = llllIIIll[0];
                while (b.llIIlllIIlII(llIIIlllllIlI2, llIIIlllllIll.size())) {
                    L.add(llIIIlllllIll.get(llIIIlllllIlI2).p());
                    0;
                    M.add(llIIIlllllIll.get(llIIIlllllIlI2).q());
                    0;
                    N.add(llIIIlllllIll.get(llIIIlllllIlI2).r());
                    0;
                    ++llIIIlllllIlI2;
                    0;
                    if (((0x7D ^ 0x31 ^ (0xC5 ^ 0xA9)) & (0x52 ^ 0x71 ^ 3 ^ -1)) < 1) continue;
                    return;
                }
            }
            int[] nArray = new int[llllIIIll[1]];
            nArray[b.llllIIIll[0]] = llllIIIll[2];
            if (!b.llIIlllIIlIl(Inventory.getCount((int[])nArray), llllIIIll[1]) || b.llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                if (b.llIIlllIIIll(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)llllIIIll[4]);
                    0;
                    Predicate<Item> llIIIlllllIlI2 = item -> item.getName().toLowerCase().contains(llllIIIII[llllIIIll[27]]);
                    if (b.llIIlllIIIll(Bank.contains(llIIIlllllIlI2) ? 1 : 0) && b.llIIlllIIIlI(Inventory.contains(item -> item.getName().contains(llllIIIII[llllIIIll[3]])) ? 1 : 0) && b.llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                        Bank.withdraw(llIIIlllllIlI2, (int)llllIIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)llllIIIll[4]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llIIlllIlIIl(Inventory.getCount((Predicate)llIIIlllllIlI2))) {
                                bl = llllIIIll[1];
                                0;
                                if (1 <= -1) {
                                    return false;
                                }
                            } else {
                                bl = llllIIIll[0];
                            }
                            return bl;
                        }, (int)llllIIIll[5]);
                        0;
                    }
                    if (b.llIIlllIIIlI(Bank.contains((int[])f.bm) ? 1 : 0) && b.llIIlllIIIlI(Inventory.contains(item -> item.getName().contains(llllIIIII[llllIIIll[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[llllIIIll[1]];
                        nArray2[b.llllIIIll[0]] = llllIIIll[6];
                        if (b.llIIlllIIIll(Bank.contains((int[])nArray2) ? 1 : 0) && b.llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                            Bank.withdraw((int)llllIIIll[6], (int)llllIIIll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llllIIIll[4]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[llllIIIll[1]];
                                nArray[b.llllIIIll[0]] = llllIIIll[6];
                                if (b.llIIlllIlIIl(Inventory.getCount((int[])nArray))) {
                                    bl = llllIIIll[1];
                                    0;
                                    if (((0x93 ^ 0x94) & ~(0x9D ^ 0x9A)) >= 2) {
                                        return false;
                                    }
                                } else {
                                    bl = llllIIIll[0];
                                }
                                return bl;
                            }, (int)llllIIIll[5]);
                            0;
                        }
                    }
                    if (b.llIIlllIIlll(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                        int[] nArray3 = new int[llllIIIll[1]];
                        nArray3[b.llllIIIll[0]] = llllIIIll[2];
                        if (b.llIIlllIIlII(Inventory.getCount((int[])nArray3), llllIIIll[1])) {
                            Bank.withdrawAll((int)llllIIIll[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)llllIIIll[4]);
                            0;
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[llllIIIll[1]];
                                nArray[b.llllIIIll[0]] = llllIIIll[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)llllIIIll[5]);
                            0;
                        }
                    }
                }
                if (b.llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                    if (b.llIIlllIIIll(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)llllIIIll[7]);
                        0;
                    }
                    if (b.llIIlllIIIlI(Bank.isOpen() ? 1 : 0)) {
                        if (b.llIIlllIIIll(Inventory.contains((int[])f.bm) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bm).interact(llllIIIII[llllIIIll[0]]);
                            Time.sleepTicks((int)llllIIIll[8]);
                            0;
                        }
                        if (b.llIIlllIIIll(Equipment.contains((int[])f.bm) ? 1 : 0) && b.llIIlllIlIII(Players.getLocal().getAnimation(), llllIIIll[9])) {
                            Equipment.getFirst((int[])f.bm).interact(llllIIIII[llllIIIll[1]]);
                            Time.sleepTicks((int)llllIIIll[4]);
                            0;
                        }
                        Movement.walkTo((WorldPoint)K);
                        0;
                    }
                }
            }
            if (b.llIIlllIIIlI(Bank.isOpen() ? 1 : 0) && b.llIIlllIIlll(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                int[] nArray4 = new int[llllIIIll[1]];
                nArray4[b.llllIIIll[0]] = llllIIIll[2];
                if (b.llIIlllIIlII(Inventory.getCount((int[])nArray4), llllIIIll[1])) {
                    a.a();
                }
            }
            if (b.llIIlllIIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                int[] nArray5 = new int[llllIIIll[1]];
                nArray5[b.llllIIIll[0]] = llllIIIll[2];
                if (b.llIIlllIlIIl(Inventory.getCount((int[])nArray5)) && b.llIIlllIIlll(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[3])) {
                    GrandExchange.open();
                    Time.sleepUntil(() -> GrandExchange.isOpen(), (int)llllIIIll[5]);
                    0;
                }
            }
            if (!b.llIIlllIIIll(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[llllIIIll[1]];
            nArray6[b.llllIIIll[0]] = llllIIIll[2];
            if (!b.llIIlllIlIIl(Inventory.getCount((int[])nArray6))) break block65;
            llIIIlllllIlI2 = llllIIIll[0];
            while (b.llIIlllIIlII(llIIIlllllIlI2, L.size())) {
                String llIIIlllllIIl = c.c(L.get(llIIIlllllIlI2));
                System.out.println("Buying " + llIIIlllllIIl + " and itemID is: " + String.valueOf(L.get(llIIIlllllIlI2)));
                while (b.llIIlllIIIlI(b.a(llIIIlllllIIl) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.llIIlllIIIlI(GrandExchange.canCollect() ? 1 : 0)) {
                                            int llIIIllllIlll;
                                            int n2;
                                            int llIIIlllllIII = llIIIlllllIlI2;
                                            if (b.llIIlllIlIIl(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.llIIlllIlIlI(grandExchangeOffer.getItemId(), L.get(llIIIlllllIII))) {
                                                    bl = llllIIIll[1];
                                                    0;
                                                    if (1 >= 2) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = llllIIIll[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = llllIIIll[1];
                                                0;
                                                if ((0x21 ^ 0x25) <= -1) {
                                                    return;
                                                }
                                            } else {
                                                n2 = llllIIIll[0];
                                            }
                                            if (b.llIIlllIIIll(llIIIllllIlll = n2) && b.llIIlllIIllI(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.llIIlllIlIlI(grandExchangeOffer.getItemId(), L.get(llIIIlllllIII))) {
                                                    bl = llllIIIll[1];
                                                    0;
                                                    if (-2 >= 0) {
                                                        return false;
                                                    }
                                                } else {
                                                    bl = llllIIIll[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), llllIIIll[1])) {
                                                GrandExchange.abortOffer((int)L.get(llIIIlllllIlI2));
                                            }
                                            if (b.llIIlllIIIlI(llIIIllllIlll)) {
                                                if (!b.llIIlllIIIll(GrandExchange.isBuying() ? 1 : 0) || b.llIIlllIlIII(GrandExchange.getItemId(), L.get(llIIIlllllIlI2))) {
                                                    b.a(L.get(llIIIlllllIlI2));
                                                }
                                                if (b.llIIlllIlIlI(GrandExchange.getItemId(), L.get(llIIIlllllIlI2)) && b.llIIlllIlIII(GrandExchange.getQuantity(), M.get(llIIIlllllIlI2))) {
                                                    GrandExchange.setQuantity((int)M.get(llIIIlllllIlI2));
                                                }
                                                int llIIIllllIllI = N.get(llIIIlllllIlI2);
                                                int llIIIllllIlIl = llllIIIll[0];
                                                Widget llIIIllllIlII = Widgets.get((int)llllIIIll[10], (int)llllIIIll[11]);
                                                if (b.llIIlllIIIll(GrandExchange.isOpen() ? 1 : 0) && b.llIIlllIIIll(GrandExchange.isBuying() ? 1 : 0) && b.llIIlllIlIll(llIIIllllIlII) && b.llIIlllIIIlI(llIIIllllIlII.getText().isEmpty() ? 1 : 0)) {
                                                    int llIIIllllIIll;
                                                    llIIIllllIlIl = llIIIllllIIll = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + llIIIllllIIll + "|Given price: " + String.valueOf(N.get(llIIIlllllIlI2)));
                                                }
                                                if (b.llIIlllIIlIl(llIIIllllIlIl, llIIIllllIllI)) {
                                                    double llIIIllllIIll;
                                                    if (b.llIIlllIIllI(llIIIllllIlIl, llllIIIll[12])) {
                                                        llIIIllllIIll = 0.1;
                                                        0;
                                                        if ((1 & ~1) != 0) {
                                                            return;
                                                        }
                                                    } else {
                                                        llIIIllllIIll = 0.3;
                                                    }
                                                    int llIIIllllIIlI = (int)((double)llIIIllllIlIl + (double)llIIIllllIlIl * llIIIllllIIll);
                                                    System.out.println("Increased price: " + llIIIllllIIlI);
                                                    if (b.llIIlllIlIlI(GrandExchange.getItemId(), L.get(llIIIlllllIlI2)) && b.llIIlllIlIII(GrandExchange.getPrice(), llIIIllllIIlI)) {
                                                        GrandExchange.setPrice((int)llIIIllllIIlI);
                                                    }
                                                    if (b.llIIlllIlIlI(GrandExchange.getItemId(), L.get(llIIIlllllIlI2)) && b.llIIlllIlIlI(GrandExchange.getPrice(), llIIIllllIIlI)) {
                                                        GrandExchange.confirm();
                                                    }
                                                    0;
                                                    if (-1 > 0) {
                                                        return;
                                                    }
                                                } else {
                                                    if (b.llIIlllIlIlI(GrandExchange.getItemId(), L.get(llIIIlllllIlI2)) && b.llIIlllIlIII(GrandExchange.getPrice(), N.get(llIIIlllllIlI2))) {
                                                        GrandExchange.setPrice((int)N.get(llIIIlllllIlI2));
                                                    }
                                                    if (b.llIIlllIlIlI(GrandExchange.getItemId(), L.get(llIIIlllllIlI2)) && b.llIIlllIlIlI(GrandExchange.getPrice(), N.get(llIIIlllllIlI2))) {
                                                        GrandExchange.confirm();
                                                    }
                                                }
                                            }
                                        }
                                        if (b.llIIlllIIIlI(Worlds.inMembersWorld() ? 1 : 0)) {
                                            System.out.println(llllIIIII[llllIIIll[8]]);
                                            AccBuilderGWD.d = llllIIIll[1];
                                            return;
                                        }
                                        if (b.llIIlllIIIlI(GrandExchange.isOpen() ? 1 : 0)) {
                                            GrandExchange.open();
                                        }
                                        if (b.llIIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(K), llllIIIll[13])) {
                                            Movement.walkTo((WorldPoint)K);
                                            0;
                                            Time.sleepTicks((int)llllIIIll[1]);
                                            0;
                                        }
                                        if (b.llIIlllIIIll(GrandExchange.canCollect() ? 1 : 0)) {
                                            GrandExchange.collect();
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (b.llIIlllIIIlI(GrandExchange.canCollect() ? 1 : 0)) {
                                                    bl = llllIIIll[1];
                                                    0;
                                                    if (2 <= 0) {
                                                        return ((0x12 ^ 0x72 ^ (0x3D ^ 0x70)) & (0x81 ^ 0xAE ^ 2 ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = llllIIIll[0];
                                                }
                                                return bl;
                                            }, (int)llllIIIll[5]);
                                            0;
                                        }
                                        if (!b.llIIlllIlIlI(L.get(llIIIlllllIlI2), llllIIIll[14])) break block66;
                                        int[] nArray7 = new int[llllIIIll[1]];
                                        nArray7[b.llllIIIll[0]] = llllIIIll[14];
                                        if (!b.llIIlllIIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.llIIlllIlIlI(L.get(llIIIlllllIlI2), llllIIIll[15])) break block68;
                                }
                                L.remove(llllIIIll[0]);
                                0;
                                M.remove(llllIIIll[0]);
                                0;
                                N.remove(llllIIIll[0]);
                                0;
                                llIIIlllllIll.remove(llllIIIll[0]);
                                0;
                                Time.sleepTicks((int)llllIIIll[8]);
                                0;
                                0;
                                if (-2 <= 0) continue;
                                return;
                            }
                            if (b.llIIlllIlIlI(L.get(llIIIlllllIlI2), llllIIIll[16])) {
                                int[] nArray8 = new int[llllIIIll[1]];
                                nArray8[b.llllIIIll[0]] = llllIIIll[16];
                                if (b.llIIlllIIIll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    0;
                                    M.remove(llllIIIll[0]);
                                    0;
                                    N.remove(llllIIIll[0]);
                                    0;
                                    llIIIlllllIll.remove(llllIIIll[0]);
                                    0;
                                    Time.sleepTicks((int)llllIIIll[8]);
                                    0;
                                    0;
                                    if (1 <= 3) continue;
                                    return;
                                }
                            }
                            if (b.llIIlllIlIlI(L.get(llIIIlllllIlI2), llllIIIll[17])) {
                                int[] nArray9 = new int[llllIIIll[1]];
                                nArray9[b.llllIIIll[0]] = llllIIIll[18];
                                if (b.llIIlllIIIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    0;
                                    M.remove(llllIIIll[0]);
                                    0;
                                    N.remove(llllIIIll[0]);
                                    0;
                                    llIIIlllllIll.remove(llllIIIll[0]);
                                    0;
                                    Time.sleepTicks((int)llllIIIll[8]);
                                    0;
                                    0;
                                    if (2 >= 0) continue;
                                    return;
                                }
                            }
                            if (b.llIIlllIlIlI(L.get(llIIIlllllIlI2), llllIIIll[19])) {
                                int[] nArray10 = new int[llllIIIll[1]];
                                nArray10[b.llllIIIll[0]] = llllIIIll[19];
                                if (b.llIIlllIIIll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    0;
                                    M.remove(llllIIIll[0]);
                                    0;
                                    N.remove(llllIIIll[0]);
                                    0;
                                    llIIIlllllIll.remove(llllIIIll[0]);
                                    0;
                                    Time.sleepTicks((int)llllIIIll[8]);
                                    0;
                                    0;
                                    
                                    return;
                                }
                            }
                            if (b.llIIlllIlIlI(L.get(llIIIlllllIlI2), llllIIIll[20])) {
                                int[] nArray11 = new int[llllIIIll[1]];
                                nArray11[b.llllIIIll[0]] = llllIIIll[20];
                                if (b.llIIlllIIIll(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    0;
                                    M.remove(llllIIIll[0]);
                                    0;
                                    N.remove(llllIIIll[0]);
                                    0;
                                    llIIIlllllIll.remove(llllIIIll[0]);
                                    0;
                                    Time.sleepTicks((int)llllIIIll[8]);
                                    0;
                                    0;
                                    if (1 > ((0x85 ^ 0xA8 ^ (0x32 ^ 0x2B)) & (23 + 34 - 17 + 113 ^ 125 + 117 - 95 + 26 ^ -1))) continue;
                                    return;
                                }
                            }
                            if (b.llIIlllIlIlI(L.get(llIIIlllllIlI2), llllIIIll[21])) {
                                int[] nArray12 = new int[llllIIIll[1]];
                                nArray12[b.llllIIIll[0]] = llllIIIll[21];
                                if (b.llIIlllIIIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    L.remove(llllIIIll[0]);
                                    0;
                                    M.remove(llllIIIll[0]);
                                    0;
                                    N.remove(llllIIIll[0]);
                                    0;
                                    llIIIlllllIll.remove(llllIIIll[0]);
                                    0;
                                    Time.sleepTicks((int)llllIIIll[8]);
                                    0;
                                    0;
                                    if (3 >= 0) continue;
                                    return;
                                }
                            }
                            if (!b.llIIlllIlIlI(L.get(llIIIlllllIlI2), llllIIIll[22])) break block69;
                            String[] stringArray = new String[llllIIIll[1]];
                            stringArray[b.llllIIIll[0]] = llllIIIII[llllIIIll[4]];
                            if (!b.llIIlllIIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block70;
                            String[] stringArray2 = new String[llllIIIll[1]];
                            stringArray2[b.llllIIIll[0]] = llllIIIII[llllIIIll[7]];
                            if (!b.llIIlllIIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block69;
                        }
                        L.remove(llllIIIll[0]);
                        0;
                        M.remove(llllIIIll[0]);
                        0;
                        N.remove(llllIIIll[0]);
                        0;
                        llIIIlllllIll.remove(llllIIIll[0]);
                        0;
                        Time.sleepTicks((int)llllIIIll[8]);
                        0;
                        0;
                        if (((187 + 162 - 285 + 132 ^ 140 + 16 - 136 + 124) & (0x2B ^ 0x51 ^ (0x5C ^ 0x72) ^ -1)) <= 0) continue;
                        return;
                    }
                    if (!b.llIIlllIIIlI(b.a(llIIIlllllIIl) ? 1 : 0)) break;
                    if (b.llIIlllIIIll(AccBuilderGWD.d ? 1 : 0)) {
                        0;
                        if (-1 != (0x2E ^ 0x46 ^ (0x26 ^ 0x4A))) break;
                        return;
                    }
                    Time.sleepTicks((int)llllIIIll[4]);
                    0;
                    0;
                    if (1 > 0) continue;
                    return;
                }
                if (b.llIIlllIIIll(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.llIIlllIIIlI(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = llllIIIll[1];
                            0;
                            if (-(0xBB ^ 0xBE) >= 0) {
                                return false;
                            }
                        } else {
                            bl = llllIIIll[0];
                        }
                        return bl;
                    }, (int)llllIIIll[5]);
                    0;
                }
                System.out.println(llIIIlllllIll.get(llIIIlllllIlI2).p());
                if (b.llIIlllIlIlI(L.get(llIIIlllllIlI2), llllIIIll[15])) {
                    L.remove(llllIIIll[0]);
                    0;
                    M.remove(llllIIIll[0]);
                    0;
                    N.remove(llllIIIll[0]);
                    0;
                    llIIIlllllIll.remove(llllIIIll[0]);
                    0;
                }
                if (b.llIIlllIIIll(b.a(llIIIlllllIIl) ? 1 : 0)) {
                    L.remove(llllIIIll[0]);
                    0;
                    M.remove(llllIIIll[0]);
                    0;
                    N.remove(llllIIIll[0]);
                    0;
                    llIIIlllllIll.remove(llllIIIll[0]);
                    0;
                }
                Time.sleepTicks((int)llllIIIll[8]);
                0;
                ++llIIIlllllIlI2;
                0;
                if ((116 + 16 - 126 + 126 ^ 59 + 72 - 47 + 44) >= ((0xA ^ 0x2A ^ (0x22 ^ 0x3F)) & (0x20 ^ 0x24 ^ (0x69 ^ 0x50) ^ -1))) continue;
                return;
            }
        }
    }
}

