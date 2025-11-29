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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.c;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import gg.squire.account.AccBuilderRogues;
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
    public static final /* synthetic */ WorldPoint J;
    public static /* synthetic */ List<Integer> M;
    private static /* synthetic */ String[] lIIlIIIllI;
    public static /* synthetic */ List<Integer> K;
    private static /* synthetic */ int[] lIIlIIIlll;
    public static /* synthetic */ List<Integer> L;

    private static boolean llllIllllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIllllllI(Object object) {
        return object != null;
    }

    private static boolean llllIllllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String llllIlllIIlI(String llIllIIIl, String llIllIIII) {
        llIllIIIl = new String(Base64.getDecoder().decode(llIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIlII = new StringBuilder();
        char[] llIllIIll = llIllIIII.toCharArray();
        int llIllIIlI = lIIlIIIlll[0];
        char[] llIlIllII = llIllIIIl.toCharArray();
        int llIlIlIll = llIlIllII.length;
        int llIlIlIlI = lIIlIIIlll[0];
        while (b.llllIlllIlll(llIlIlIlI, llIlIlIll)) {
            char llIllIlll = llIlIllII[llIlIlIlI];
            llIllIlII.append((char)(llIllIlll ^ llIllIIll[llIllIIlI % llIllIIll.length]));
            0;
            ++llIllIIlI;
            ++llIlIlIlI;
            0;
            if (1 < (0x9F ^ 0x9B)) continue;
            return null;
        }
        return String.valueOf(llIllIlII);
    }

    public static void g() {
        Widget widget = Widgets.get((int)lIIlIIIlll[10], (int)lIIlIIIlll[8], (int)lIIlIIIlll[27]);
        if (b.llllIllllllI(widget)) {
            widget.interact(lIIlIIIllI[lIIlIIIlll[28]]);
            Time.sleepTicks((int)lIIlIIIlll[8]);
            0;
        }
    }

    private static boolean llllIlllIllI(int n2) {
        return n2 != 0;
    }

    private static String llllIlllIIII(String llIIlIlII, String llIIlIIll) {
        try {
            SecretKeySpec llIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIlIIIlll[28]), "DES");
            Cipher llIIlIllI = Cipher.getInstance("DES");
            llIIlIllI.init(lIIlIIIlll[8], llIIlIlll);
            return new String(llIIlIllI.doFinal(Base64.getDecoder().decode(llIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlIlIl) {
            llIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlllIIll() {
        lIIlIIIllI = new String[lIIlIIIlll[32]];
        b.lIIlIIIllI[b.lIIlIIIlll[0]] = b."Wear";
        b.lIIlIIIllI[b.lIIlIIIlll[1]] = b."Grand Exchange";
        b.lIIlIIIllI[b.lIIlIIIlll[8]] = b."In F2P, need to switch to a P2P world, ending script";
        b.lIIlIIIllI[b.lIIlIIIlll[4]] = b."Stamina potion(4)";
        b.lIIlIIIllI[b.lIIlIIIlll[7]] = b."Stamina potion (4)";
        b.lIIlIIIllI[b.lIIlIIIlll[25]] = b."tablet";
        b.lIIlIIIllI[b.lIIlIIIlll[26]] = b."(tablet)";
        b.lIIlIIIllI[b.lIIlIIIlll[13]] = b."";
        b.lIIlIIIllI[b.lIIlIIIlll[28]] = b."Close";
        b.lIIlIIIllI[b.lIIlIIIlll[29]] = b."wealth";
        b.lIIlIIIllI[b.lIIlIIIlll[3]] = b."wealth";
        b.lIIlIIIllI[b.lIIlIIIlll[27]] = b."ring of wealth (";
    }

    private static boolean llllIllllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllIllllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllIlllIlII() {
        lIIlIIIlll = new int[33];
        b.lIIlIIIlll[0] = (19 + 80 - 23 + 52 ^ 171 + 37 - 182 + 153) & (70 + 100 - 63 + 31 ^ 16 + 78 - 21 + 112 ^ -1);
        b.lIIlIIIlll[1] = 1;
        b.lIIlIIIlll[2] = 0xFFFFD7EF & 0x2BF3;
        b.lIIlIIIlll[3] = 16 + 124 - 18 + 49 ^ 126 + 88 - 116 + 63;
        b.lIIlIIIlll[4] = 3;
        b.lIIlIIIlll[5] = -(0xFFFFCCFB & 0x3777) & (0xFFFFBFFE & 0x57FB);
        b.lIIlIIIlll[6] = -(0xFFFFD39B & 0x6CFD) & (0xFFFFFFDF & 0x5FFF);
        b.lIIlIIIlll[7] = 0x93 ^ 0x98 ^ (0x63 ^ 0x6C);
        b.lIIlIIIlll[8] = 2;
        b.lIIlIIIlll[9] = -(0xFFFFBDE6 & 0x773F) & (0xFFFFBFFF & 0x77EF);
        b.lIIlIIIlll[10] = 0xFFFFD7FD & 0x29D3;
        b.lIIlIIIlll[11] = 0x78 ^ 0x63;
        b.lIIlIIIlll[12] = -(0xFFFFB7F9 & 0x6CA7) & (0xFFFFE7E5 & 0xF7EFA);
        b.lIIlIIIlll[13] = 0x33 ^ 0x34;
        b.lIIlIIIlll[14] = 0xFFFFC1AE & 0x3FFB;
        b.lIIlIIIlll[15] = -(0xFFFFFDE3 & 0x423D) & (0xFFFFFBFF & 0x4FEB);
        b.lIIlIIIlll[16] = 0xFFFFEF7F & 0x17BE;
        b.lIIlIIIlll[17] = -(0xFFFFF00F & 0x7FF3) & (0xFFFFFFFF & 0x777F);
        b.lIIlIIIlll[18] = -(0xFFFF996B & 0x7E95) & (0xFFFFDFFF & 0x3F7E);
        b.lIIlIIIlll[19] = 0xFFFFF5FE & 0xBAD;
        b.lIIlIIIlll[20] = -(0xFFFFEE99 & 0x7177) & (0xFFFFFFFD & 0x7F5F);
        b.lIIlIIIlll[21] = 0xFFFFC99B & 0x3775;
        b.lIIlIIIlll[22] = 0xFFFFFDD3 & 0x337D;
        b.lIIlIIIlll[23] = 0xFFFF957E & 0x7FFD;
        b.lIIlIIIlll[24] = -1;
        b.lIIlIIIlll[25] = 103 + 43 - 61 + 53 ^ 1 + 98 - 2 + 46;
        b.lIIlIIIlll[26] = 0x6F ^ 0x13 ^ (0xC2 ^ 0xB8);
        b.lIIlIIIlll[27] = 0x98 ^ 0x93;
        b.lIIlIIIlll[28] = 0xBE ^ 0xB6;
        b.lIIlIIIlll[29] = 0x82 ^ 0x8B;
        b.lIIlIIIlll[30] = 0xFFFFCCDD & 0x3F7F;
        b.lIIlIIIlll[31] = -(0xFFFFF832 & 0x77EF) & (0xFFFFFFBF & 0x7DFF);
        b.lIIlIIIlll[32] = 0x8C ^ 0x80;
    }

    public static void a(int n2) {
        int lllIIllll;
        int n3;
        int lllIlIIII;
        if (b.llllIlllIlIl(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.llllIlllIllI(Static.getClient().isItemDefinitionCached(lllIlIIII) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(lllIlIIII).getLinkedNoteId();
            0;
            if (((0xF6 ^ 0xB8) & ~(0xC ^ 0x42)) != ((0x8C ^ 0xA6) & ~(0x6B ^ 0x41))) {
                return;
            }
        } else {
            n3 = lllIIllll = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(lllIlIIII).getLinkedNoteId())).intValue();
        }
        if (!b.llllIllllIll(GrandExchange.getItemId(), lIIlIIIlll[24]) || b.llllIllllIll(GrandExchange.getItemId(), lllIlIIII) && b.llllIllllIll(GrandExchange.getItemId(), lllIIllll)) {
            if (b.llllIlllIlIl(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)lllIlIIII);
        }
    }

    public static void b(List<Integer> list) {
        if (b.llllIlllIlIl(GrandExchange.isOpen() ? 1 : 0)) {
            if (b.llllIlllIllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (b.llllIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (b.llllIlllIllI(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> llllIIIIl;
            Time.sleepTicks((int)lIIlIIIlll[8]);
            0;
            int llllIIIII = lIIlIIIlll[0];
            while (b.llllIlllIlll(llllIIIII, llllIIIIl.size())) {
                int[] nArray = new int[lIIlIIIlll[1]];
                nArray[b.lIIlIIIlll[0]] = llllIIIIl.get(llllIIIII);
                if (b.llllIlllllII(Inventory.getCount((int[])nArray))) {
                    int lllIlllll;
                    if (b.llllIlllIlIl(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlIIIlll[1]];
                        nArray2[b.lIIlIIIlll[0]] = llllIIIIl.get(llllIIIII);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lIIlIIIlll[8]);
                        0;
                        lllIlllll = llllIIIII;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llllIlllllIl(GrandExchange.getItemId(), (Integer)llllIIIIl.get(lllIlllll))) {
                                bl = lIIlIIIlll[1];
                                0;
                                if (3 <= -1) {
                                    return ((0x68 ^ 0x1A ^ (0x33 ^ 0x50)) & (80 + 26 - 98 + 162 ^ 2 + 57 - 7 + 135 ^ -1)) != 0;
                                }
                            } else {
                                bl = lIIlIIIlll[0];
                            }
                            return bl;
                        }, (int)lIIlIIIlll[23]);
                        0;
                    }
                    if (b.llllIlllIllI(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.llllIllllIll(GrandExchange.getPrice(), lIIlIIIlll[24])) {
                            GrandExchange.setPrice((int)lIIlIIIlll[1]);
                            Time.sleepTicks((int)lIIlIIIlll[8]);
                            0;
                            lllIlllll = llllIIIII;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.llllIlllllIl(GrandExchange.getPrice(), lIIlIIIlll[1])) {
                                    bl = lIIlIIIlll[1];
                                    0;
                                    if (-1 > 2) {
                                        return ((62 + 196 - 257 + 225 ^ 34 + 166 - 150 + 129) & (0x4B ^ 0x1F ^ (0x60 ^ 0x65) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIlIIIlll[0];
                                }
                                return bl;
                            }, (int)lIIlIIIlll[23]);
                            0;
                        }
                        if (b.llllIlllllIl(GrandExchange.getPrice(), lIIlIIIlll[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIIlIIIlll[23]);
                            0;
                        }
                    }
                    if (b.llllIlllIllI(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llllIlllIlIl(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lIIlIIIlll[1];
                                0;
                                if (3 <= -1) {
                                    return false;
                                }
                            } else {
                                bl = lIIlIIIlll[0];
                            }
                            return bl;
                        }, (int)lIIlIIIlll[5]);
                        0;
                    }
                }
                ++llllIIIII;
                0;
                
                return;
            }
        }
    }

    private static String llllIlllIIIl(String llIlIIIIl, String llIIllllI) {
        try {
            SecretKeySpec llIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIIIll = Cipher.getInstance("Blowfish");
            llIlIIIll.init(lIIlIIIlll[8], llIlIIlII);
            return new String(llIlIIIll.doFinal(Base64.getDecoder().decode(llIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIIIlI) {
            llIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIlllllII(int n2) {
        return n2 > 0;
    }

    private static boolean llllIlllIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        b.llllIlllIlII();
        b.llllIlllIIll();
        J = new WorldPoint(lIIlIIIlll[30], lIIlIIIlll[31], lIIlIIIlll[0]);
        K = new ArrayList<Integer>();
        L = new ArrayList<Integer>();
        M = new ArrayList<Integer>();
    }

    private static boolean llllIlllIlIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string) {
        List list = Inventory.getAll();
        if (b.llllIlllIlIl(list.isEmpty() ? 1 : 0)) {
            void lllIllIII;
            String lllIlIlll;
            Object var2_2 = null;
            if (b.llllIlllIllI(string.contains(lIIlIIIllI[lIIlIIIlll[25]]) ? 1 : 0)) {
                lllIlIlll = string.replace(lIIlIIIllI[lIIlIIIlll[26]], lIIlIIIllI[lIIlIIIlll[13]]).trim();
            }
            int lllIlIllI = lIIlIIIlll[0];
            while (b.llllIlllIlll(lllIlIllI, lllIllIII.size())) {
                String lllIlIlIl = ((Item)lllIllIII.get(lllIlIllI)).getName();
                if (b.llllIllllllI(lllIlIlIl)) {
                    String lllIllIIl;
                    if (b.llllIlllIllI(lllIlIlIl.contains(lllIllIIl) ? 1 : 0)) {
                        return lIIlIIIlll[1];
                    }
                    if (b.llllIllllllI(lllIlIlll) && b.llllIlllIllI(lllIlIlIl.contains(lllIlIlll) ? 1 : 0)) {
                        return lIIlIIIlll[1];
                    }
                }
                ++lllIlIllI;
                0;
                if (3 > 0) continue;
                return ((59 + 109 - 68 + 80 ^ 122 + 115 - 213 + 113) & (0xB9 ^ 0xC0 ^ (0x39 ^ 0x7D) ^ -1)) != 0;
            }
        }
        return lIIlIIIlll[0];
    }

    public static void a(List<d> list) {
        block65: {
            List<d> llllIlllI;
            int llllIllIl2;
            if (b.llllIlllIlIl(list.isEmpty() ? 1 : 0) && b.llllIlllIllI(K.isEmpty() ? 1 : 0)) {
                llllIllIl2 = lIIlIIIlll[0];
                while (b.llllIlllIlll(llllIllIl2, llllIlllI.size())) {
                    K.add(llllIlllI.get(llllIllIl2).p());
                    0;
                    L.add(llllIlllI.get(llllIllIl2).q());
                    0;
                    M.add(llllIlllI.get(llllIllIl2).r());
                    0;
                    ++llllIllIl2;
                    0;
                    if (2 >= 0) continue;
                    return;
                }
            }
            int[] nArray = new int[lIIlIIIlll[1]];
            nArray[b.lIIlIIIlll[0]] = lIIlIIIlll[2];
            if (!b.llllIllllIII(Inventory.getCount((int[])nArray), lIIlIIIlll[1]) || b.llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                if (b.llllIlllIllI(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lIIlIIIlll[4]);
                    0;
                    Predicate<Item> llllIllIl2 = item -> item.getName().toLowerCase().contains(lIIlIIIllI[lIIlIIIlll[27]]);
                    if (b.llllIlllIllI(Bank.contains(llllIllIl2) ? 1 : 0) && b.llllIlllIlIl(Inventory.contains(item -> item.getName().contains(lIIlIIIllI[lIIlIIIlll[3]])) ? 1 : 0) && b.llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                        Bank.withdraw(llllIllIl2, (int)lIIlIIIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIlIIIlll[4]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.llllIlllllII(Inventory.getCount((Predicate)llllIllIl2))) {
                                bl = lIIlIIIlll[1];
                                0;
                                if (-3 >= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIlIIIlll[0];
                            }
                            return bl;
                        }, (int)lIIlIIIlll[5]);
                        0;
                    }
                    if (b.llllIlllIlIl(Bank.contains((int[])f.bf) ? 1 : 0) && b.llllIlllIlIl(Inventory.contains(item -> item.getName().contains(lIIlIIIllI[lIIlIIIlll[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIlIIIlll[1]];
                        nArray2[b.lIIlIIIlll[0]] = lIIlIIIlll[6];
                        if (b.llllIlllIllI(Bank.contains((int[])nArray2) ? 1 : 0) && b.llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                            Bank.withdraw((int)lIIlIIIlll[6], (int)lIIlIIIlll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIlIIIlll[4]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIlIIIlll[1]];
                                nArray[b.lIIlIIIlll[0]] = lIIlIIIlll[6];
                                if (b.llllIlllllII(Inventory.getCount((int[])nArray))) {
                                    bl = lIIlIIIlll[1];
                                    0;
                                    if (3 < -1) {
                                        return false;
                                    }
                                } else {
                                    bl = lIIlIIIlll[0];
                                }
                                return bl;
                            }, (int)lIIlIIIlll[5]);
                            0;
                        }
                    }
                    if (b.llllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                        int[] nArray3 = new int[lIIlIIIlll[1]];
                        nArray3[b.lIIlIIIlll[0]] = lIIlIIIlll[2];
                        if (b.llllIlllIlll(Inventory.getCount((int[])nArray3), lIIlIIIlll[1])) {
                            Bank.withdrawAll((int)lIIlIIIlll[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIlIIIlll[4]);
                            0;
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lIIlIIIlll[1]];
                                nArray[b.lIIlIIIlll[0]] = lIIlIIIlll[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lIIlIIIlll[5]);
                            0;
                        }
                    }
                }
                if (b.llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                    if (b.llllIlllIllI(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIIlIIIlll[7]);
                        0;
                    }
                    if (b.llllIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (b.llllIlllIllI(Inventory.contains((int[])f.bf) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bf).interact(lIIlIIIllI[lIIlIIIlll[0]]);
                            Time.sleepTicks((int)lIIlIIIlll[8]);
                            0;
                        }
                        if (b.llllIlllIllI(Equipment.contains((int[])f.bf) ? 1 : 0) && b.llllIllllIll(Players.getLocal().getAnimation(), lIIlIIIlll[9])) {
                            Equipment.getFirst((int[])f.bf).interact(lIIlIIIllI[lIIlIIIlll[1]]);
                            Time.sleepTicks((int)lIIlIIIlll[4]);
                            0;
                        }
                        Movement.walkTo((WorldPoint)J);
                        0;
                    }
                }
            }
            if (b.llllIlllIlIl(Bank.isOpen() ? 1 : 0) && b.llllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                int[] nArray4 = new int[lIIlIIIlll[1]];
                nArray4[b.lIIlIIIlll[0]] = lIIlIIIlll[2];
                if (b.llllIlllIlll(Inventory.getCount((int[])nArray4), lIIlIIIlll[1])) {
                    a.a();
                }
            }
            if (b.llllIlllIlIl(GrandExchange.isOpen() ? 1 : 0)) {
                int[] nArray5 = new int[lIIlIIIlll[1]];
                nArray5[b.lIIlIIIlll[0]] = lIIlIIIlll[2];
                if (b.llllIlllllII(Inventory.getCount((int[])nArray5)) && b.llllIllllIlI(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[3])) {
                    GrandExchange.open();
                    Time.sleepUntil(() -> GrandExchange.isOpen(), (int)lIIlIIIlll[5]);
                    0;
                }
            }
            if (!b.llllIlllIllI(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[lIIlIIIlll[1]];
            nArray6[b.lIIlIIIlll[0]] = lIIlIIIlll[2];
            if (!b.llllIlllllII(Inventory.getCount((int[])nArray6))) break block65;
            llllIllIl2 = lIIlIIIlll[0];
            while (b.llllIlllIlll(llllIllIl2, K.size())) {
                String llllIllII = c.c(K.get(llllIllIl2));
                System.out.println("Buying " + llllIllII + " and itemID is: " + String.valueOf(K.get(llllIllIl2)));
                while (b.llllIlllIlIl(b.a(llllIllII) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.llllIlllIlIl(GrandExchange.canCollect() ? 1 : 0)) {
                                            int llllIlIlI;
                                            int n2;
                                            int llllIlIll = llllIllIl2;
                                            if (b.llllIlllllII(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.llllIlllllIl(grandExchangeOffer.getItemId(), K.get(llllIlIll))) {
                                                    bl = lIIlIIIlll[1];
                                                    0;
                                                    if (3 < -1) {
                                                        return ((5 + 170 - 36 + 88 ^ 54 + 2 - 54 + 160) & (0x72 ^ 0xB ^ (0xB3 ^ 0x8B) ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIlIIIlll[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lIIlIIIlll[1];
                                                0;
                                                if (2 != 2) {
                                                    return;
                                                }
                                            } else {
                                                n2 = lIIlIIIlll[0];
                                            }
                                            if (b.llllIlllIllI(llllIlIlI = n2) && b.llllIllllIIl(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.llllIlllllIl(grandExchangeOffer.getItemId(), K.get(llllIlIll))) {
                                                    bl = lIIlIIIlll[1];
                                                    0;
                                                    if (-1 > 0) {
                                                        return ((0x2C ^ 0x51 ^ (0x24 ^ 0x6C)) & (0xF5 ^ 0xBB ^ (0xCE ^ 0xB5) ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIlIIIlll[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), lIIlIIIlll[1])) {
                                                GrandExchange.abortOffer((int)K.get(llllIllIl2));
                                            }
                                            if (b.llllIlllIlIl(llllIlIlI)) {
                                                if (!b.llllIlllIllI(GrandExchange.isBuying() ? 1 : 0) || b.llllIllllIll(GrandExchange.getItemId(), K.get(llllIllIl2))) {
                                                    b.a(K.get(llllIllIl2));
                                                }
                                                if (b.llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2)) && b.llllIllllIll(GrandExchange.getQuantity(), L.get(llllIllIl2))) {
                                                    GrandExchange.setQuantity((int)L.get(llllIllIl2));
                                                }
                                                int llllIlIIl = M.get(llllIllIl2);
                                                int llllIlIII = lIIlIIIlll[0];
                                                Widget llllIIlll = Widgets.get((int)lIIlIIIlll[10], (int)lIIlIIIlll[11]);
                                                if (b.llllIlllIllI(GrandExchange.isOpen() ? 1 : 0) && b.llllIlllIllI(GrandExchange.isBuying() ? 1 : 0) && b.llllIllllllI(llllIIlll) && b.llllIlllIlIl(llllIIlll.getText().isEmpty() ? 1 : 0)) {
                                                    int llllIIllI;
                                                    llllIlIII = llllIIllI = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + llllIIllI + "|Given price: " + String.valueOf(M.get(llllIllIl2)));
                                                }
                                                if (b.llllIllllIII(llllIlIII, llllIlIIl)) {
                                                    double llllIIllI;
                                                    if (b.llllIllllIIl(llllIlIII, lIIlIIIlll[12])) {
                                                        llllIIllI = 0.1;
                                                        0;
                                                        if (((0x11 ^ 0x1F) & ~(0x64 ^ 0x6A)) != 0) {
                                                            return;
                                                        }
                                                    } else {
                                                        llllIIllI = 0.3;
                                                    }
                                                    int llllIIlIl = (int)((double)llllIlIII + (double)llllIlIII * llllIIllI);
                                                    System.out.println("Increased price: " + llllIIlIl);
                                                    if (b.llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2)) && b.llllIllllIll(GrandExchange.getPrice(), llllIIlIl)) {
                                                        GrandExchange.setPrice((int)llllIIlIl);
                                                    }
                                                    if (b.llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2)) && b.llllIlllllIl(GrandExchange.getPrice(), llllIIlIl)) {
                                                        GrandExchange.confirm();
                                                    }
                                                    0;
                                                    if (1 < -1) {
                                                        return;
                                                    }
                                                } else {
                                                    if (b.llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2)) && b.llllIllllIll(GrandExchange.getPrice(), M.get(llllIllIl2))) {
                                                        GrandExchange.setPrice((int)M.get(llllIllIl2));
                                                    }
                                                    if (b.llllIlllllIl(GrandExchange.getItemId(), K.get(llllIllIl2)) && b.llllIlllllIl(GrandExchange.getPrice(), M.get(llllIllIl2))) {
                                                        GrandExchange.confirm();
                                                    }
                                                }
                                            }
                                        }
                                        if (b.llllIlllIlIl(Worlds.inMembersWorld() ? 1 : 0)) {
                                            System.out.println(lIIlIIIllI[lIIlIIIlll[8]]);
                                            AccBuilderRogues.d = lIIlIIIlll[1];
                                            return;
                                        }
                                        if (b.llllIlllIlIl(GrandExchange.isOpen() ? 1 : 0)) {
                                            GrandExchange.open();
                                        }
                                        if (b.llllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIlIIIlll[13])) {
                                            Movement.walkTo((WorldPoint)J);
                                            0;
                                            Time.sleepTicks((int)lIIlIIIlll[1]);
                                            0;
                                        }
                                        if (b.llllIlllIllI(GrandExchange.canCollect() ? 1 : 0)) {
                                            GrandExchange.collect();
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (b.llllIlllIlIl(GrandExchange.canCollect() ? 1 : 0)) {
                                                    bl = lIIlIIIlll[1];
                                                    0;
                                                    if ((24 + 109 - 55 + 72 ^ 87 + 11 - -16 + 32) <= 0) {
                                                        return ((0x5B ^ 0x43 ^ (0x11 ^ 7)) & (18 + 157 - 116 + 102 ^ 128 + 143 - 270 + 174 ^ -1)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIlIIIlll[0];
                                                }
                                                return bl;
                                            }, (int)lIIlIIIlll[5]);
                                            0;
                                        }
                                        if (!b.llllIlllllIl(K.get(llllIllIl2), lIIlIIIlll[14])) break block66;
                                        int[] nArray7 = new int[lIIlIIIlll[1]];
                                        nArray7[b.lIIlIIIlll[0]] = lIIlIIIlll[14];
                                        if (!b.llllIlllIlIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.llllIlllllIl(K.get(llllIllIl2), lIIlIIIlll[15])) break block68;
                                }
                                K.remove(lIIlIIIlll[0]);
                                0;
                                L.remove(lIIlIIIlll[0]);
                                0;
                                M.remove(lIIlIIIlll[0]);
                                0;
                                llllIlllI.remove(lIIlIIIlll[0]);
                                0;
                                Time.sleepTicks((int)lIIlIIIlll[8]);
                                0;
                                0;
                                if (-3 <= 0) continue;
                                return;
                            }
                            if (b.llllIlllllIl(K.get(llllIllIl2), lIIlIIIlll[16])) {
                                int[] nArray8 = new int[lIIlIIIlll[1]];
                                nArray8[b.lIIlIIIlll[0]] = lIIlIIIlll[16];
                                if (b.llllIlllIllI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    0;
                                    L.remove(lIIlIIIlll[0]);
                                    0;
                                    M.remove(lIIlIIIlll[0]);
                                    0;
                                    llllIlllI.remove(lIIlIIIlll[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIlll[8]);
                                    0;
                                    0;
                                    if (((0xEB ^ 0xBF ^ (0x2B ^ 0x38)) & (0x28 ^ 0x7B ^ (0xB3 ^ 0xA7) ^ -1)) == 0) continue;
                                    return;
                                }
                            }
                            if (b.llllIlllllIl(K.get(llllIllIl2), lIIlIIIlll[17])) {
                                int[] nArray9 = new int[lIIlIIIlll[1]];
                                nArray9[b.lIIlIIIlll[0]] = lIIlIIIlll[18];
                                if (b.llllIlllIllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    0;
                                    L.remove(lIIlIIIlll[0]);
                                    0;
                                    M.remove(lIIlIIIlll[0]);
                                    0;
                                    llllIlllI.remove(lIIlIIIlll[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIlll[8]);
                                    0;
                                    0;
                                    if (((0x95 ^ 0xA1) & ~(0x97 ^ 0xA3)) < 3) continue;
                                    return;
                                }
                            }
                            if (b.llllIlllllIl(K.get(llllIllIl2), lIIlIIIlll[19])) {
                                int[] nArray10 = new int[lIIlIIIlll[1]];
                                nArray10[b.lIIlIIIlll[0]] = lIIlIIIlll[19];
                                if (b.llllIlllIllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    0;
                                    L.remove(lIIlIIIlll[0]);
                                    0;
                                    M.remove(lIIlIIIlll[0]);
                                    0;
                                    llllIlllI.remove(lIIlIIIlll[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIlll[8]);
                                    0;
                                    0;
                                    if (-3 < 0) continue;
                                    return;
                                }
                            }
                            if (b.llllIlllllIl(K.get(llllIllIl2), lIIlIIIlll[20])) {
                                int[] nArray11 = new int[lIIlIIIlll[1]];
                                nArray11[b.lIIlIIIlll[0]] = lIIlIIIlll[20];
                                if (b.llllIlllIllI(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    0;
                                    L.remove(lIIlIIIlll[0]);
                                    0;
                                    M.remove(lIIlIIIlll[0]);
                                    0;
                                    llllIlllI.remove(lIIlIIIlll[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIlll[8]);
                                    0;
                                    0;
                                    if (-1 == -1) continue;
                                    return;
                                }
                            }
                            if (b.llllIlllllIl(K.get(llllIllIl2), lIIlIIIlll[21])) {
                                int[] nArray12 = new int[lIIlIIIlll[1]];
                                nArray12[b.lIIlIIIlll[0]] = lIIlIIIlll[21];
                                if (b.llllIlllIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    K.remove(lIIlIIIlll[0]);
                                    0;
                                    L.remove(lIIlIIIlll[0]);
                                    0;
                                    M.remove(lIIlIIIlll[0]);
                                    0;
                                    llllIlllI.remove(lIIlIIIlll[0]);
                                    0;
                                    Time.sleepTicks((int)lIIlIIIlll[8]);
                                    0;
                                    0;
                                    if (-2 <= 0) continue;
                                    return;
                                }
                            }
                            if (!b.llllIlllllIl(K.get(llllIllIl2), lIIlIIIlll[22])) break block69;
                            String[] stringArray = new String[lIIlIIIlll[1]];
                            stringArray[b.lIIlIIIlll[0]] = lIIlIIIllI[lIIlIIIlll[4]];
                            if (!b.llllIlllIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) break block70;
                            String[] stringArray2 = new String[lIIlIIIlll[1]];
                            stringArray2[b.lIIlIIIlll[0]] = lIIlIIIllI[lIIlIIIlll[7]];
                            if (!b.llllIlllIllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block69;
                        }
                        K.remove(lIIlIIIlll[0]);
                        0;
                        L.remove(lIIlIIIlll[0]);
                        0;
                        M.remove(lIIlIIIlll[0]);
                        0;
                        llllIlllI.remove(lIIlIIIlll[0]);
                        0;
                        Time.sleepTicks((int)lIIlIIIlll[8]);
                        0;
                        0;
                        if (3 > ((58 + 64 - -19 + 67 ^ 124 + 21 - 36 + 35) & (0x67 ^ 0x28 ^ (0x37 ^ 0x38) ^ -1))) continue;
                        return;
                    }
                    if (!b.llllIlllIlIl(b.a(llllIllII) ? 1 : 0)) break;
                    if (b.llllIlllIllI(AccBuilderRogues.d ? 1 : 0)) {
                        0;
                        if (3 == 3) break;
                        return;
                    }
                    Time.sleepTicks((int)lIIlIIIlll[4]);
                    0;
                    0;
                    if (2 >= 0) continue;
                    return;
                }
                if (b.llllIlllIllI(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.llllIlllIlIl(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lIIlIIIlll[1];
                            0;
                            if (2 <= -1) {
                                return false;
                            }
                        } else {
                            bl = lIIlIIIlll[0];
                        }
                        return bl;
                    }, (int)lIIlIIIlll[5]);
                    0;
                }
                System.out.println(llllIlllI.get(llllIllIl2).p());
                if (b.llllIlllllIl(K.get(llllIllIl2), lIIlIIIlll[15])) {
                    K.remove(lIIlIIIlll[0]);
                    0;
                    L.remove(lIIlIIIlll[0]);
                    0;
                    M.remove(lIIlIIIlll[0]);
                    0;
                    llllIlllI.remove(lIIlIIIlll[0]);
                    0;
                }
                if (b.llllIlllIllI(b.a(llllIllII) ? 1 : 0)) {
                    K.remove(lIIlIIIlll[0]);
                    0;
                    L.remove(lIIlIIIlll[0]);
                    0;
                    M.remove(lIIlIIIlll[0]);
                    0;
                    llllIlllI.remove(lIIlIIIlll[0]);
                    0;
                }
                Time.sleepTicks((int)lIIlIIIlll[8]);
                0;
                ++llllIllIl2;
                0;
                
                return;
            }
        }
    }
}

