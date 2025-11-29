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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.c;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import gg.squire.account.AccBuilderBarrows;
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
    public static /* synthetic */ List<Integer> K;
    public static /* synthetic */ List<Integer> M;
    private static /* synthetic */ int[] lIllIllI;
    public static /* synthetic */ List<Integer> L;
    private static /* synthetic */ String[] lIllIIll;

    public static void g() {
        Widget widget = Widgets.get((int)lIllIllI[10], (int)lIllIllI[8], (int)lIllIllI[27]);
        if (b.lIIllIIlIII(widget)) {
            widget.interact(lIllIIll[lIllIllI[28]]);
            Time.sleepTicks((int)lIllIllI[8]);
            "".length();
        }
    }

    private static boolean lIIlIllllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIlIlIlIll(String lIllIIlIlIllIll, String lIllIIlIlIllIlI) {
        try {
            SecretKeySpec lIllIIlIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIIlIlIllIlI.getBytes(StandardCharsets.UTF_8)), lIllIllI[28]), "DES");
            Cipher lIllIIlIlIlllll = Cipher.getInstance("DES");
            lIllIIlIlIlllll.init(lIllIllI[8], lIllIIlIllIIIII);
            return new String(lIllIIlIlIlllll.doFinal(Base64.getDecoder().decode(lIllIIlIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIlIlIllllI) {
            lIllIIlIlIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    static {
        b.lIIlIlllllI();
        b.lIIlIlIlllI();
        J = new WorldPoint(lIllIllI[30], lIllIllI[31], lIllIllI[0]);
        K = new ArrayList<Integer>();
        L = new ArrayList<Integer>();
        M = new ArrayList<Integer>();
    }

    private static boolean lIIllIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIlIlllllI() {
        lIllIllI = new int[33];
        b.lIllIllI[0] = (6 ^ 0x6D ^ (0xA8 ^ 0x90)) & (0xAC ^ 0x8E ^ (0xF ^ 0x7E) ^ -" ".length());
        b.lIllIllI[1] = " ".length();
        b.lIllIllI[2] = 0xFFFFF3E3 & 0xFFF;
        b.lIllIllI[3] = "  ".length() ^ (0x23 ^ 0x2B);
        b.lIllIllI[4] = "   ".length();
        b.lIllIllI[5] = -(0xFFFFDDF7 & 0x662B) & (0xFFFFFFAA & 0x57FF);
        b.lIllIllI[6] = 0xFFFFBFC7 & 0x5F7F;
        b.lIllIllI[7] = 56 + 114 - 131 + 103 ^ 46 + 24 - 0 + 68;
        b.lIllIllI[8] = "  ".length();
        b.lIllIllI[9] = 0xFFFFE7FE & 0x1ACB;
        b.lIllIllI[10] = -(0xFFFFE8F7 & 0x7F29) & (0xFFFFFFF3 & 0x69FD);
        b.lIllIllI[11] = 33 + 116 - 132 + 123 ^ 33 + 65 - 88 + 141;
        b.lIllIllI[12] = -(0xFFFFEF34 & 0x3DEF) & (0xFFFFFF7B & 0xF6FE7);
        b.lIllIllI[13] = 1 ^ 0x2D ^ (0x7D ^ 0x56);
        b.lIllIllI[14] = -(0xFFFFDA3E & 0x6FC7) & (0xFFFFEBFF & 0x5FAF);
        b.lIllIllI[15] = 0xFFFF9FDB & 0x6BEF;
        b.lIllIllI[16] = -(0xFFFFD76B & 0x38D5) & (0xFFFFF7FE & 0x1F7F);
        b.lIllIllI[17] = -(0xFFFFE82B & 0x77D7) & (0xFFFFFF7F & 0x67FF);
        b.lIllIllI[18] = 0xFFFFDFFF & 0x277E;
        b.lIllIllI[19] = -(0xFFFFBED7 & 0x737B) & (0xFFFFB7FE & 0x7BFF);
        b.lIllIllI[20] = 0xFFFFBF4D & 0x5FFF;
        b.lIllIllI[21] = -(0xFFFFFEAF & 0x13F5) & (0xFFFFD7B7 & 0x3BFD);
        b.lIllIllI[22] = 0xFFFFB553 & 0x7BFD;
        b.lIllIllI[23] = -(0xFFFFF30A & 0x4EF7) & (0xFFFFF7FF & 0x5F7D);
        b.lIllIllI[24] = -" ".length();
        b.lIllIllI[25] = 0xA0 ^ 0xA5;
        b.lIllIllI[26] = 0x2D ^ 0x2B;
        b.lIllIllI[27] = 0x6A ^ 0x61;
        b.lIllIllI[28] = 0xB5 ^ 0xBD;
        b.lIllIllI[29] = 0x17 ^ 0x1E;
        b.lIllIllI[30] = 0xFFFF9CFF & 0x6F5D;
        b.lIllIllI[31] = -(0xFFFFFFF2 & 0x126F) & (0xFFFFDFFF & 0x3FFF);
        b.lIllIllI[32] = 49 + 89 - 87 + 132 ^ 105 + 56 - -26 + 0;
    }

    private static boolean lIIllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIlIlIlIlI(String lIllIIlIlIlIIII, String lIllIIlIlIIllIl) {
        try {
            SecretKeySpec lIllIIlIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlIlIlIIlI = Cipher.getInstance("Blowfish");
            lIllIIlIlIlIIlI.init(lIllIllI[8], lIllIIlIlIlIIll);
            return new String(lIllIIlIlIlIIlI.doFinal(Base64.getDecoder().decode(lIllIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIlIlIlIIIl) {
            lIllIIlIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIIIII(int n2) {
        return n2 != 0;
    }

    public static void b(List<Integer> list) {
        if (b.lIIlIllllll(GrandExchange.isOpen() ? 1 : 0)) {
            if (b.lIIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (b.lIIlIllllll(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (b.lIIllIIIIII(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> lIllIIllIIIIlIl;
            Time.sleepTicks((int)lIllIllI[8]);
            "".length();
            int lIllIIllIIIIlII = lIllIllI[0];
            while (b.lIIllIIIIIl(lIllIIllIIIIlII, lIllIIllIIIIlIl.size())) {
                int[] nArray = new int[lIllIllI[1]];
                nArray[b.lIllIllI[0]] = lIllIIllIIIIlIl.get(lIllIIllIIIIlII);
                if (b.lIIllIIIllI(Inventory.getCount((int[])nArray))) {
                    int lIllIIllIIIIIll;
                    if (b.lIIlIllllll(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lIllIllI[1]];
                        nArray2[b.lIllIllI[0]] = lIllIIllIIIIlIl.get(lIllIIllIIIIlII);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lIllIllI[8]);
                        "".length();
                        lIllIIllIIIIIll = lIllIIllIIIIlII;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIIllIIIlll(GrandExchange.getItemId(), (Integer)lIllIIllIIIIlIl.get(lIllIIllIIIIIll))) {
                                bl = lIllIllI[1];
                                "".length();
                                if (((0x4D ^ 0x52) & ~(0xAB ^ 0xB4)) != 0) {
                                    return ((0x6B ^ 0x61) & ~(0x42 ^ 0x48)) != 0;
                                }
                            } else {
                                bl = lIllIllI[0];
                            }
                            return bl;
                        }, (int)lIllIllI[23]);
                        "".length();
                    }
                    if (b.lIIllIIIIII(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.lIIllIIIlIl(GrandExchange.getPrice(), lIllIllI[24])) {
                            GrandExchange.setPrice((int)lIllIllI[1]);
                            Time.sleepTicks((int)lIllIllI[8]);
                            "".length();
                            lIllIIllIIIIIll = lIllIIllIIIIlII;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.lIIllIIIlll(GrandExchange.getPrice(), lIllIllI[1])) {
                                    bl = lIllIllI[1];
                                    "".length();
                                    if (((121 + 22 - 90 + 121 ^ 9 + 44 - -87 + 47) & (8 ^ 1 ^ (0x8C ^ 0x90) ^ -" ".length())) < -" ".length()) {
                                        return ((0xD1 ^ 0x87 ^ (0x9E ^ 0x83)) & (69 + 107 - 30 + 56 ^ 120 + 92 - 134 + 51 ^ -" ".length()) & ((184 + 53 - 164 + 163 ^ 3 + 166 - 146 + 150) & (52 + 168 - 88 + 69 ^ 131 + 96 - 201 + 110 ^ -" ".length()) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = lIllIllI[0];
                                }
                                return bl;
                            }, (int)lIllIllI[23]);
                            "".length();
                        }
                        if (b.lIIllIIIlll(GrandExchange.getPrice(), lIllIllI[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIllIllI[23]);
                            "".length();
                        }
                    }
                    if (b.lIIllIIIIII(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIIlIllllll(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lIllIllI[1];
                                "".length();
                                if (("  ".length() & ~"  ".length()) != 0) {
                                    return ((0x1D ^ 0) & ~(0x5B ^ 0x46)) != 0;
                                }
                            } else {
                                bl = lIllIllI[0];
                            }
                            return bl;
                        }, (int)lIllIllI[5]);
                        "".length();
                    }
                }
                ++lIllIIllIIIIlII;
                "".length();
                if (-"  ".length() <= 0) continue;
                return;
            }
        }
    }

    private static boolean lIIllIIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    public static void a(int n2) {
        int lIllIIlIlllIIll;
        int n3;
        int lIllIIlIlllIlII;
        if (b.lIIlIllllll(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.lIIllIIIIII(Static.getClient().isItemDefinitionCached(lIllIIlIlllIlII) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(lIllIIlIlllIlII).getLinkedNoteId();
            "".length();
            if (-" ".length() >= "   ".length()) {
                return;
            }
        } else {
            n3 = lIllIIlIlllIIll = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(lIllIIlIlllIlII).getLinkedNoteId())).intValue();
        }
        if (!b.lIIllIIIlIl(GrandExchange.getItemId(), lIllIllI[24]) || b.lIIllIIIlIl(GrandExchange.getItemId(), lIllIIlIlllIlII) && b.lIIllIIIlIl(GrandExchange.getItemId(), lIllIIlIlllIIll)) {
            if (b.lIIlIllllll(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)lIllIIlIlllIlII);
        }
    }

    private static boolean lIIllIIIllI(int n2) {
        return n2 > 0;
    }

    private static void lIIlIlIlllI() {
        lIllIIll = new String[lIllIllI[32]];
        b.lIllIIll[b.lIllIllI[0]] = b.lIIlIlIlIlI("zZEBFrtbVuQ=", "nxAby");
        b.lIllIIll[b.lIllIllI[1]] = b.lIIlIlIlIll("FHZLC1LERsf0rg5zpgrAmg==", "eFLfj");
        b.lIllIIll[b.lIllIllI[8]] = b.lIIlIlIllII("CwpsE3ESSGw7JicAbCEsYhc7PDchDGwhLGIFbAVxEkQ7OjEuAGB1JiwAJTskYhcvJyoyEA==", "BdLUC");
        b.lIllIIll[b.lIllIllI[4]] = b.lIIlIlIlIlI("eBQO+80zr3LSRWQmGqM3u2jIoql5Mto/", "wjvjE");
        b.lIllIIll[b.lIllIllI[7]] = b.lIIlIlIlIll("u6VRl1hwwOkywaAGifSd7pfkx2hLKNnd", "UIdWp");
        b.lIllIIll[b.lIllIllI[25]] = b.lIIlIlIllII("LgM0ITQu", "ZbVMQ");
        b.lIllIIll[b.lIllIllI[26]] = b.lIIlIlIllII("XCUEMxQRJUw=", "tQeQx");
        b.lIllIIll[b.lIllIllI[13]] = b.lIIlIlIlIll("Nsqnv4bcDA0=", "cwfFp");
        b.lIllIIll[b.lIllIllI[28]] = b.lIIlIlIlIlI("8PiMy/b2PCY=", "PxhKp");
        b.lIllIIll[b.lIllIllI[29]] = b.lIIlIlIlIll("uVTkwyik2PA=", "hAiKY");
        b.lIllIIll[b.lIllIllI[3]] = b.lIIlIlIlIlI("Wrp+nD24HM8=", "iWoGn");
        b.lIllIIll[b.lIllIllI[27]] = b.lIIlIlIlIll("JT3Nk30kqhUL3kvp3WK+cY6H64gxYvS4", "VOgCe");
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string) {
        List list = Inventory.getAll();
        if (b.lIIlIllllll(list.isEmpty() ? 1 : 0)) {
            void lIllIIlIlllllII;
            String lIllIIlIllllIll;
            Object var2_2 = null;
            if (b.lIIllIIIIII(string.contains(lIllIIll[lIllIllI[25]]) ? 1 : 0)) {
                lIllIIlIllllIll = string.replace(lIllIIll[lIllIllI[26]], lIllIIll[lIllIllI[13]]).trim();
            }
            int lIllIIlIllllIlI = lIllIllI[0];
            while (b.lIIllIIIIIl(lIllIIlIllllIlI, lIllIIlIlllllII.size())) {
                String lIllIIlIllllIIl = ((Item)lIllIIlIlllllII.get(lIllIIlIllllIlI)).getName();
                if (b.lIIllIIlIII(lIllIIlIllllIIl)) {
                    String lIllIIlIlllllIl;
                    if (b.lIIllIIIIII(lIllIIlIllllIIl.contains(lIllIIlIlllllIl) ? 1 : 0)) {
                        return lIllIllI[1];
                    }
                    if (b.lIIllIIlIII(lIllIIlIllllIll) && b.lIIllIIIIII(lIllIIlIllllIIl.contains(lIllIIlIllllIll) ? 1 : 0)) {
                        return lIllIllI[1];
                    }
                }
                ++lIllIIlIllllIlI;
                "".length();
                if ("   ".length() != ((0 ^ 0x23) & ~(0x7B ^ 0x58))) continue;
                return ((0xBD ^ 0xA9) & ~(0xB9 ^ 0xAD)) != 0;
            }
        }
        return lIllIllI[0];
    }

    private static boolean lIIllIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void a(List<d> list) {
        block65: {
            List<d> lIllIIllIIlIIlI;
            int lIllIIllIIlIIIl2;
            if (b.lIIlIllllll(list.isEmpty() ? 1 : 0) && b.lIIllIIIIII(K.isEmpty() ? 1 : 0)) {
                lIllIIllIIlIIIl2 = lIllIllI[0];
                while (b.lIIllIIIIIl(lIllIIllIIlIIIl2, lIllIIllIIlIIlI.size())) {
                    K.add(lIllIIllIIlIIlI.get(lIllIIllIIlIIIl2).p());
                    "".length();
                    L.add(lIllIIllIIlIIlI.get(lIllIIllIIlIIIl2).q());
                    "".length();
                    M.add(lIllIIllIIlIIlI.get(lIllIIllIIlIIIl2).r());
                    "".length();
                    ++lIllIIllIIlIIIl2;
                    "".length();
                    if (" ".length() <= " ".length()) continue;
                    return;
                }
            }
            int[] nArray = new int[lIllIllI[1]];
            nArray[b.lIllIllI[0]] = lIllIllI[2];
            if (!b.lIIllIIIIlI(Inventory.getCount((int[])nArray), lIllIllI[1]) || b.lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                if (b.lIIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lIllIllI[4]);
                    "".length();
                    Predicate<Item> lIllIIllIIlIIIl2 = item -> item.getName().toLowerCase().contains(lIllIIll[lIllIllI[27]]);
                    if (b.lIIllIIIIII(Bank.contains(lIllIIllIIlIIIl2) ? 1 : 0) && b.lIIlIllllll(Inventory.contains(item -> item.getName().contains(lIllIIll[lIllIllI[3]])) ? 1 : 0) && b.lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                        Bank.withdraw(lIllIIllIIlIIIl2, (int)lIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIllI[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIIllIIIllI(Inventory.getCount((Predicate)lIllIIllIIlIIIl2))) {
                                bl = lIllIllI[1];
                                "".length();
                                if (null != null) {
                                    return ((0x95 ^ 0xA4) & ~(0x50 ^ 0x61)) != 0;
                                }
                            } else {
                                bl = lIllIllI[0];
                            }
                            return bl;
                        }, (int)lIllIllI[5]);
                        "".length();
                    }
                    if (b.lIIlIllllll(Bank.contains((int[])f.bl) ? 1 : 0) && b.lIIlIllllll(Inventory.contains(item -> item.getName().contains(lIllIIll[lIllIllI[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lIllIllI[1]];
                        nArray2[b.lIllIllI[0]] = lIllIllI[6];
                        if (b.lIIllIIIIII(Bank.contains((int[])nArray2) ? 1 : 0) && b.lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                            Bank.withdraw((int)lIllIllI[6], (int)lIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIllIllI[4]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIllIllI[1]];
                                nArray[b.lIllIllI[0]] = lIllIllI[6];
                                if (b.lIIllIIIllI(Inventory.getCount((int[])nArray))) {
                                    bl = lIllIllI[1];
                                    "".length();
                                    if (" ".length() < -" ".length()) {
                                        return ((0x83 ^ 0x9B) & ~(0x53 ^ 0x4B)) != 0;
                                    }
                                } else {
                                    bl = lIllIllI[0];
                                }
                                return bl;
                            }, (int)lIllIllI[5]);
                            "".length();
                        }
                    }
                    if (b.lIIllIIIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                        int[] nArray3 = new int[lIllIllI[1]];
                        nArray3[b.lIllIllI[0]] = lIllIllI[2];
                        if (b.lIIllIIIIIl(Inventory.getCount((int[])nArray3), lIllIllI[1])) {
                            Bank.withdrawAll((int)lIllIllI[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIllIllI[4]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lIllIllI[1]];
                                nArray[b.lIllIllI[0]] = lIllIllI[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lIllIllI[5]);
                            "".length();
                        }
                    }
                }
                if (b.lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                    if (b.lIIllIIIIII(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIllIllI[7]);
                        "".length();
                    }
                    if (b.lIIlIllllll(Bank.isOpen() ? 1 : 0)) {
                        if (b.lIIllIIIIII(Inventory.contains((int[])f.bl) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bl).interact(lIllIIll[lIllIllI[0]]);
                            Time.sleepTicks((int)lIllIllI[8]);
                            "".length();
                        }
                        if (b.lIIllIIIIII(Equipment.contains((int[])f.bl) ? 1 : 0) && b.lIIllIIIlIl(Players.getLocal().getAnimation(), lIllIllI[9])) {
                            Equipment.getFirst((int[])f.bl).interact(lIllIIll[lIllIllI[1]]);
                            Time.sleepTicks((int)lIllIllI[4]);
                            "".length();
                        }
                        Movement.walkTo((WorldPoint)J);
                        "".length();
                    }
                }
            }
            if (b.lIIlIllllll(Bank.isOpen() ? 1 : 0) && b.lIIllIIIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                int[] nArray4 = new int[lIllIllI[1]];
                nArray4[b.lIllIllI[0]] = lIllIllI[2];
                if (b.lIIllIIIIIl(Inventory.getCount((int[])nArray4), lIllIllI[1])) {
                    a.a();
                }
            }
            if (b.lIIlIllllll(GrandExchange.isOpen() ? 1 : 0)) {
                int[] nArray5 = new int[lIllIllI[1]];
                nArray5[b.lIllIllI[0]] = lIllIllI[2];
                if (b.lIIllIIIllI(Inventory.getCount((int[])nArray5)) && b.lIIllIIIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[3])) {
                    GrandExchange.open();
                    Time.sleepUntil(() -> GrandExchange.isOpen(), (int)lIllIllI[5]);
                    "".length();
                }
            }
            if (!b.lIIllIIIIII(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[lIllIllI[1]];
            nArray6[b.lIllIllI[0]] = lIllIllI[2];
            if (!b.lIIllIIIllI(Inventory.getCount((int[])nArray6))) break block65;
            lIllIIllIIlIIIl2 = lIllIllI[0];
            while (b.lIIllIIIIIl(lIllIIllIIlIIIl2, K.size())) {
                String lIllIIllIIlIIII = c.c(K.get(lIllIIllIIlIIIl2));
                System.out.println("Buying " + lIllIIllIIlIIII + " and itemID is: " + String.valueOf(K.get(lIllIIllIIlIIIl2)));
                while (b.lIIlIllllll(b.a(lIllIIllIIlIIII) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.lIIlIllllll(GrandExchange.canCollect() ? 1 : 0)) {
                                            int lIllIIllIIIlllI;
                                            int n2;
                                            int lIllIIllIIIllll = lIllIIllIIlIIIl2;
                                            if (b.lIIllIIIllI(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIIllIIIlll(grandExchangeOffer.getItemId(), K.get(lIllIIllIIIllll))) {
                                                    bl = lIllIllI[1];
                                                    "".length();
                                                    if (null != null) {
                                                        return ((0x31 ^ 0x53 ^ (0x64 ^ 0x5D)) & ("   ".length() ^ (0x98 ^ 0xC0) ^ -" ".length())) != 0;
                                                    }
                                                } else {
                                                    bl = lIllIllI[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lIllIllI[1];
                                                "".length();
                                                if (" ".length() <= -" ".length()) {
                                                    return;
                                                }
                                            } else {
                                                n2 = lIllIllI[0];
                                            }
                                            if (b.lIIllIIIIII(lIllIIllIIIlllI = n2) && b.lIIllIIIIll(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIIllIIIlll(grandExchangeOffer.getItemId(), K.get(lIllIIllIIIllll))) {
                                                    bl = lIllIllI[1];
                                                    "".length();
                                                    if (-(182 + 156 - 277 + 127 ^ 33 + 181 - 63 + 34) >= 0) {
                                                        return ((0x13 ^ 3 ^ (0x7C ^ 0x31)) & (0x86 ^ 0xB5 ^ (0xAF ^ 0xC1) ^ -" ".length())) != 0;
                                                    }
                                                } else {
                                                    bl = lIllIllI[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), lIllIllI[1])) {
                                                GrandExchange.abortOffer((int)K.get(lIllIIllIIlIIIl2));
                                            }
                                            if (b.lIIlIllllll(lIllIIllIIIlllI)) {
                                                if (!b.lIIllIIIIII(GrandExchange.isBuying() ? 1 : 0) || b.lIIllIIIlIl(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2))) {
                                                    b.a(K.get(lIllIIllIIlIIIl2));
                                                }
                                                if (b.lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2)) && b.lIIllIIIlIl(GrandExchange.getQuantity(), L.get(lIllIIllIIlIIIl2))) {
                                                    GrandExchange.setQuantity((int)L.get(lIllIIllIIlIIIl2));
                                                }
                                                int lIllIIllIIIllIl = M.get(lIllIIllIIlIIIl2);
                                                int lIllIIllIIIllII = lIllIllI[0];
                                                Widget lIllIIllIIIlIll = Widgets.get((int)lIllIllI[10], (int)lIllIllI[11]);
                                                if (b.lIIllIIIIII(GrandExchange.isOpen() ? 1 : 0) && b.lIIllIIIIII(GrandExchange.isBuying() ? 1 : 0) && b.lIIllIIlIII(lIllIIllIIIlIll) && b.lIIlIllllll(lIllIIllIIIlIll.getText().isEmpty() ? 1 : 0)) {
                                                    int lIllIIllIIIlIlI;
                                                    lIllIIllIIIllII = lIllIIllIIIlIlI = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + lIllIIllIIIlIlI + "|Given price: " + String.valueOf(M.get(lIllIIllIIlIIIl2)));
                                                }
                                                if (b.lIIllIIIIlI(lIllIIllIIIllII, lIllIIllIIIllIl)) {
                                                    double lIllIIllIIIlIlI;
                                                    if (b.lIIllIIIIll(lIllIIllIIIllII, lIllIllI[12])) {
                                                        lIllIIllIIIlIlI = 0.1;
                                                        "".length();
                                                        if (((0x5F ^ 0x68 ^ (0x4F ^ 0x45)) & (0x79 ^ 0x3C ^ (0x2E ^ 0x56) ^ -" ".length())) != 0) {
                                                            return;
                                                        }
                                                    } else {
                                                        lIllIIllIIIlIlI = 0.3;
                                                    }
                                                    int lIllIIllIIIlIIl = (int)((double)lIllIIllIIIllII + (double)lIllIIllIIIllII * lIllIIllIIIlIlI);
                                                    System.out.println("Increased price: " + lIllIIllIIIlIIl);
                                                    if (b.lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2)) && b.lIIllIIIlIl(GrandExchange.getPrice(), lIllIIllIIIlIIl)) {
                                                        GrandExchange.setPrice((int)lIllIIllIIIlIIl);
                                                    }
                                                    if (b.lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2)) && b.lIIllIIIlll(GrandExchange.getPrice(), lIllIIllIIIlIIl)) {
                                                        GrandExchange.confirm();
                                                    }
                                                    "".length();
                                                    if (-"   ".length() > 0) {
                                                        return;
                                                    }
                                                } else {
                                                    if (b.lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2)) && b.lIIllIIIlIl(GrandExchange.getPrice(), M.get(lIllIIllIIlIIIl2))) {
                                                        GrandExchange.setPrice((int)M.get(lIllIIllIIlIIIl2));
                                                    }
                                                    if (b.lIIllIIIlll(GrandExchange.getItemId(), K.get(lIllIIllIIlIIIl2)) && b.lIIllIIIlll(GrandExchange.getPrice(), M.get(lIllIIllIIlIIIl2))) {
                                                        GrandExchange.confirm();
                                                    }
                                                }
                                            }
                                        }
                                        if (b.lIIlIllllll(Worlds.inMembersWorld() ? 1 : 0)) {
                                            System.out.println(lIllIIll[lIllIllI[8]]);
                                            AccBuilderBarrows.d = lIllIllI[1];
                                            return;
                                        }
                                        if (b.lIIllIIIIll(Players.getLocal().getWorldLocation().distanceTo(J), lIllIllI[13])) {
                                            Movement.walkTo((WorldPoint)J);
                                            "".length();
                                            Time.sleepTicks((int)lIllIllI[1]);
                                            "".length();
                                        }
                                        if (b.lIIlIllllll(GrandExchange.isOpen() ? 1 : 0)) {
                                            GrandExchange.open();
                                        }
                                        if (b.lIIllIIIIII(GrandExchange.canCollect() ? 1 : 0)) {
                                            GrandExchange.collect();
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (b.lIIlIllllll(GrandExchange.canCollect() ? 1 : 0)) {
                                                    bl = lIllIllI[1];
                                                    "".length();
                                                    if (-"   ".length() > 0) {
                                                        return ((3 + 70 - -11 + 99 ^ 54 + 76 - 114 + 127) & (102 + 80 - 41 + 18 ^ 109 + 89 - 118 + 87 ^ -" ".length())) != 0;
                                                    }
                                                } else {
                                                    bl = lIllIllI[0];
                                                }
                                                return bl;
                                            }, (int)lIllIllI[5]);
                                            "".length();
                                        }
                                        if (!b.lIIllIIIlll(K.get(lIllIIllIIlIIIl2), lIllIllI[14])) break block66;
                                        int[] nArray7 = new int[lIllIllI[1]];
                                        nArray7[b.lIllIllI[0]] = lIllIllI[14];
                                        if (!b.lIIlIllllll(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.lIIllIIIlll(K.get(lIllIIllIIlIIIl2), lIllIllI[15])) break block68;
                                }
                                K.remove(lIllIllI[0]);
                                "".length();
                                L.remove(lIllIllI[0]);
                                "".length();
                                M.remove(lIllIllI[0]);
                                "".length();
                                lIllIIllIIlIIlI.remove(lIllIllI[0]);
                                "".length();
                                Time.sleepTicks((int)lIllIllI[8]);
                                "".length();
                                "".length();
                                if ("  ".length() != 0) continue;
                                return;
                            }
                            if (b.lIIllIIIlll(K.get(lIllIIllIIlIIIl2), lIllIllI[16])) {
                                int[] nArray8 = new int[lIllIllI[1]];
                                nArray8[b.lIllIllI[0]] = lIllIllI[16];
                                if (b.lIIllIIIIII(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    lIllIIllIIlIIlI.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (" ".length() != 0) continue;
                                    return;
                                }
                            }
                            if (b.lIIllIIIlll(K.get(lIllIIllIIlIIIl2), lIllIllI[17])) {
                                int[] nArray9 = new int[lIllIllI[1]];
                                nArray9[b.lIllIllI[0]] = lIllIllI[18];
                                if (b.lIIllIIIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    lIllIIllIIlIIlI.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (-"  ".length() < 0) continue;
                                    return;
                                }
                            }
                            if (b.lIIllIIIlll(K.get(lIllIIllIIlIIIl2), lIllIllI[19])) {
                                int[] nArray10 = new int[lIllIllI[1]];
                                nArray10[b.lIllIllI[0]] = lIllIllI[19];
                                if (b.lIIllIIIIII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    lIllIIllIIlIIlI.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if ((0x6B ^ 0x6F) >= ((0x54 ^ 0x41) & ~(8 ^ 0x1D))) continue;
                                    return;
                                }
                            }
                            if (b.lIIllIIIlll(K.get(lIllIIllIIlIIIl2), lIllIllI[20])) {
                                int[] nArray11 = new int[lIllIllI[1]];
                                nArray11[b.lIllIllI[0]] = lIllIllI[20];
                                if (b.lIIllIIIIII(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    lIllIIllIIlIIlI.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if ("   ".length() > ((90 + 28 - 41 + 77 ^ 108 + 76 - 90 + 92) & (0x40 ^ 0x27 ^ (0xE8 ^ 0xAF) ^ -" ".length()))) continue;
                                    return;
                                }
                            }
                            if (b.lIIllIIIlll(K.get(lIllIIllIIlIIIl2), lIllIllI[21])) {
                                int[] nArray12 = new int[lIllIllI[1]];
                                nArray12[b.lIllIllI[0]] = lIllIllI[21];
                                if (b.lIIllIIIIII(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    K.remove(lIllIllI[0]);
                                    "".length();
                                    L.remove(lIllIllI[0]);
                                    "".length();
                                    M.remove(lIllIllI[0]);
                                    "".length();
                                    lIllIIllIIlIIlI.remove(lIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (null == null) continue;
                                    return;
                                }
                            }
                            if (!b.lIIllIIIlll(K.get(lIllIIllIIlIIIl2), lIllIllI[22])) break block69;
                            String[] stringArray = new String[lIllIllI[1]];
                            stringArray[b.lIllIllI[0]] = lIllIIll[lIllIllI[4]];
                            if (!b.lIIlIllllll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block70;
                            String[] stringArray2 = new String[lIllIllI[1]];
                            stringArray2[b.lIllIllI[0]] = lIllIIll[lIllIllI[7]];
                            if (!b.lIIllIIIIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block69;
                        }
                        K.remove(lIllIllI[0]);
                        "".length();
                        L.remove(lIllIllI[0]);
                        "".length();
                        M.remove(lIllIllI[0]);
                        "".length();
                        lIllIIllIIlIIlI.remove(lIllIllI[0]);
                        "".length();
                        Time.sleepTicks((int)lIllIllI[8]);
                        "".length();
                        "".length();
                        if ("   ".length() >= "  ".length()) continue;
                        return;
                    }
                    if (!b.lIIlIllllll(b.a(lIllIIllIIlIIII) ? 1 : 0)) break;
                    if (b.lIIllIIIIII(AccBuilderBarrows.d ? 1 : 0)) {
                        "".length();
                        if ((0xF4 ^ 0x99 ^ (0xC5 ^ 0xAC)) == (84 + 175 - 138 + 66 ^ 183 + 101 - 247 + 154)) break;
                        return;
                    }
                    Time.sleepTicks((int)lIllIllI[4]);
                    "".length();
                    "".length();
                    if ((84 + 50 - 51 + 63 ^ 127 + 119 - 160 + 65) != 0) continue;
                    return;
                }
                if (b.lIIllIIIIII(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.lIIlIllllll(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lIllIllI[1];
                            "".length();
                            if (" ".length() <= 0) {
                                return ((0x99 ^ 0x85) & ~(0x4C ^ 0x50)) != 0;
                            }
                        } else {
                            bl = lIllIllI[0];
                        }
                        return bl;
                    }, (int)lIllIllI[5]);
                    "".length();
                }
                System.out.println(lIllIIllIIlIIlI.get(lIllIIllIIlIIIl2).p());
                if (b.lIIllIIIlll(K.get(lIllIIllIIlIIIl2), lIllIllI[15])) {
                    K.remove(lIllIllI[0]);
                    "".length();
                    L.remove(lIllIllI[0]);
                    "".length();
                    M.remove(lIllIllI[0]);
                    "".length();
                    lIllIIllIIlIIlI.remove(lIllIllI[0]);
                    "".length();
                }
                if (b.lIIllIIIIII(b.a(lIllIIllIIlIIII) ? 1 : 0)) {
                    K.remove(lIllIllI[0]);
                    "".length();
                    L.remove(lIllIllI[0]);
                    "".length();
                    M.remove(lIllIllI[0]);
                    "".length();
                    lIllIIllIIlIIlI.remove(lIllIllI[0]);
                    "".length();
                }
                Time.sleepTicks((int)lIllIllI[8]);
                "".length();
                ++lIllIIllIIlIIIl2;
                "".length();
                if (-" ".length() != (0xC4 ^ 0xC0)) continue;
                return;
            }
        }
    }

    private static boolean lIIllIIlIII(Object object) {
        return object != null;
    }

    private static String lIIlIlIllII(String lIllIIlIlIIIIII, String lIllIIlIIlllIlI) {
        lIllIIlIlIIIIII = new String(Base64.getDecoder().decode(lIllIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIlIIlllllI = new StringBuilder();
        char[] lIllIIlIIllllIl = lIllIIlIIlllIlI.toCharArray();
        int lIllIIlIIllllII = lIllIllI[0];
        char[] lIllIIlIIllIllI = lIllIIlIlIIIIII.toCharArray();
        int lIllIIlIIllIlIl = lIllIIlIIllIllI.length;
        int lIllIIlIIllIlII = lIllIllI[0];
        while (b.lIIllIIIIIl(lIllIIlIIllIlII, lIllIIlIIllIlIl)) {
            char lIllIIlIlIIIIIl = lIllIIlIIllIllI[lIllIIlIIllIlII];
            lIllIIlIIlllllI.append((char)(lIllIIlIlIIIIIl ^ lIllIIlIIllllIl[lIllIIlIIllllII % lIllIIlIIllllIl.length]));
            "".length();
            ++lIllIIlIIllllII;
            ++lIllIIlIIllIlII;
            "".length();
            if (((0x9A ^ 0x91) & ~(0xA ^ 1)) == 0) continue;
            return null;
        }
        return String.valueOf(lIllIIlIIlllllI);
    }
}

