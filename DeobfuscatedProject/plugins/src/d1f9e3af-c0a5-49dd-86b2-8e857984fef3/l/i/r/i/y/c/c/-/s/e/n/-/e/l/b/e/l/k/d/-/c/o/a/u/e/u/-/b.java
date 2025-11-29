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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.c;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
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
    public static /* synthetic */ List<Integer> K;
    private static /* synthetic */ int[] lIIllIllI;
    public static /* synthetic */ List<Integer> L;
    public static final /* synthetic */ WorldPoint J;
    public static /* synthetic */ List<Integer> M;
    private static /* synthetic */ String[] lIIllIlIl;

    private static void lIIIIIIIllll() {
        lIIllIllI = new int[33];
        b.lIIllIllI[0] = (0x73 ^ 0x66) & ~(0x99 ^ 0x8C);
        b.lIIllIllI[1] = " ".length();
        b.lIIllIllI[2] = -(0xFFFFEC6D & 0x3793) & (0xFFFFAFFB & 0x77E7);
        b.lIIllIllI[3] = 5 ^ 0xF;
        b.lIIllIllI[4] = "   ".length();
        b.lIIllIllI[5] = 0xFFFFDFAD & 0x33DA;
        b.lIIllIllI[6] = 0xFFFFFF6F & 0x1FD7;
        b.lIIllIllI[7] = 0x4C ^ 0x48;
        b.lIIllIllI[8] = "  ".length();
        b.lIIllIllI[9] = -(0xFFFFE2E7 & 0x5D39) & (0xFFFFE6EA & 0x5BFF);
        b.lIIllIllI[10] = 0xFFFFA7D1 & 0x59FF;
        b.lIIllIllI[11] = 32 + 161 - 133 + 122 ^ 113 + 154 - 194 + 100;
        b.lIIllIllI[12] = -(0xFFFFB5EE & 0x7FB3) & (0xFFFFFFF9 & 0xF77E7);
        b.lIIllIllI[13] = 11 + 106 - 114 + 134 ^ 45 + 140 - 76 + 33;
        b.lIIllIllI[14] = 0xFFFFB3EA & 0x4DBF;
        b.lIIllIllI[15] = -(0xFFFFE737 & 0x1CFD) & (0xFFFFFFFF & 0xFFF);
        b.lIIllIllI[16] = 0xFFFFF7BE & 0xF7F;
        b.lIIllIllI[17] = -(0xFFFFE583 & 0x7A7F) & (0xFFFFE7FF & 0x7F7F);
        b.lIIllIllI[18] = 0xFFFFDF7E & 0x27FF;
        b.lIIllIllI[19] = 0xFFFFDBBD & 0x25EE;
        b.lIIllIllI[20] = 0xFFFFDF5F & 0x3FED;
        b.lIIllIllI[21] = -(0xFFFFDFF9 & 0x364F) & (0xFFFFD7DB & 0x3F7D);
        b.lIIllIllI[22] = -(0xFFFFBAA3 & 0x47FF) & (0xFFFFFFFB & 0x33F7);
        b.lIIllIllI[23] = 0xFFFFFDFC & 0x177F;
        b.lIIllIllI[24] = -" ".length();
        b.lIIllIllI[25] = 0x49 ^ 0x4C;
        b.lIIllIllI[26] = 0x98 ^ 0x9E;
        b.lIIllIllI[27] = 0xE3 ^ 0x9B ^ (0x57 ^ 0x24);
        b.lIIllIllI[28] = 0x11 ^ 0x57 ^ (0xD7 ^ 0x99);
        b.lIIllIllI[29] = 0x3D ^ 0x34;
        b.lIIllIllI[30] = 0xFFFFBCDD & 0x4F7F;
        b.lIIllIllI[31] = -(0xFFFFF5AB & 0x5A75) & (0xFFFFFDBE & 0x5FFF);
        b.lIIllIllI[32] = 0xF ^ 0x30 ^ (0xA1 ^ 0x92);
    }

    public static void a(int n2) {
        int lIIIIIIlIIIIIlI;
        int n3;
        int lIIIIIIlIIIIIll;
        if (b.lIIIIIIlIIII(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.lIIIIIIlIIIl(Static.getClient().isItemDefinitionCached(lIIIIIIlIIIIIll) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(lIIIIIIlIIIIIll).getLinkedNoteId();
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
        } else {
            n3 = lIIIIIIlIIIIIlI = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(lIIIIIIlIIIIIll).getLinkedNoteId())).intValue();
        }
        if (!b.lIIIIIIlIllI(GrandExchange.getItemId(), lIIllIllI[24]) || b.lIIIIIIlIllI(GrandExchange.getItemId(), lIIIIIIlIIIIIll) && b.lIIIIIIlIllI(GrandExchange.getItemId(), lIIIIIIlIIIIIlI)) {
            if (b.lIIIIIIlIIII(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)lIIIIIIlIIIIIll);
        }
    }

    static {
        b.lIIIIIIIllll();
        b.lIIIIIIIlllI();
        J = new WorldPoint(lIIllIllI[30], lIIllIllI[31], lIIllIllI[0]);
        K = new ArrayList<Integer>();
        L = new ArrayList<Integer>();
        M = new ArrayList<Integer>();
    }

    private static boolean lIIIIIIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIIIIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static String lIIIIIIIllIl(String lIIIIIIIllIlIIl, String lIIIIIIIllIlIII) {
        lIIIIIIIllIlIIl = new String(Base64.getDecoder().decode(lIIIIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIIIIllIIlll = new StringBuilder();
        char[] lIIIIIIIllIIllI = lIIIIIIIllIlIII.toCharArray();
        int lIIIIIIIllIIlIl = lIIllIllI[0];
        char[] lIIIIIIIlIlllll = lIIIIIIIllIlIIl.toCharArray();
        int lIIIIIIIlIllllI = lIIIIIIIlIlllll.length;
        int lIIIIIIIlIlllIl = lIIllIllI[0];
        while (b.lIIIIIIlIIlI(lIIIIIIIlIlllIl, lIIIIIIIlIllllI)) {
            char lIIIIIIIllIlIlI = lIIIIIIIlIlllll[lIIIIIIIlIlllIl];
            lIIIIIIIllIIlll.append((char)(lIIIIIIIllIlIlI ^ lIIIIIIIllIIllI[lIIIIIIIllIIlIl % lIIIIIIIllIIllI.length]));
            "".length();
            ++lIIIIIIIllIIlIl;
            ++lIIIIIIIlIlllIl;
            "".length();
            if ((0x8E ^ 0x8A) > "  ".length()) continue;
            return null;
        }
        return String.valueOf(lIIIIIIIllIIlll);
    }

    private static String lIIIIIIIlIll(String lIIIIIIIlIIIlIl, String lIIIIIIIlIIIlII) {
        try {
            SecretKeySpec lIIIIIIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIIIIlIIlIIl = Cipher.getInstance("Blowfish");
            lIIIIIIIlIIlIIl.init(lIIllIllI[8], lIIIIIIIlIIlIlI);
            return new String(lIIIIIIIlIIlIIl.doFinal(Base64.getDecoder().decode(lIIIIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIIlIIlIII) {
            lIIIIIIIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIlll(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(String string) {
        List list = Inventory.getAll();
        if (b.lIIIIIIlIIII(list.isEmpty() ? 1 : 0)) {
            void lIIIIIIlIIIlIll;
            String lIIIIIIlIIIlIlI;
            Object var2_2 = null;
            if (b.lIIIIIIlIIIl(string.contains(lIIllIlIl[lIIllIllI[25]]) ? 1 : 0)) {
                lIIIIIIlIIIlIlI = string.replace(lIIllIlIl[lIIllIllI[26]], lIIllIlIl[lIIllIllI[13]]).trim();
            }
            int lIIIIIIlIIIlIIl = lIIllIllI[0];
            while (b.lIIIIIIlIIlI(lIIIIIIlIIIlIIl, lIIIIIIlIIIlIll.size())) {
                String lIIIIIIlIIIlIII = ((Item)lIIIIIIlIIIlIll.get(lIIIIIIlIIIlIIl)).getName();
                if (b.lIIIIIIllIIl(lIIIIIIlIIIlIII)) {
                    String lIIIIIIlIIIllII;
                    if (b.lIIIIIIlIIIl(lIIIIIIlIIIlIII.contains(lIIIIIIlIIIllII) ? 1 : 0)) {
                        return lIIllIllI[1];
                    }
                    if (b.lIIIIIIllIIl(lIIIIIIlIIIlIlI) && b.lIIIIIIlIIIl(lIIIIIIlIIIlIII.contains(lIIIIIIlIIIlIlI) ? 1 : 0)) {
                        return lIIllIllI[1];
                    }
                }
                ++lIIIIIIlIIIlIIl;
                "".length();
                if (((0x7B ^ 0x58) & ~(0x9F ^ 0xBC)) >= ((0x1A ^ 0x44) & ~(0x69 ^ 0x37))) continue;
                return ((0x82 ^ 0xBC) & ~(0x48 ^ 0x76)) != 0;
            }
        }
        return lIIllIllI[0];
    }

    public static void g() {
        Widget widget = Widgets.get((int)lIIllIllI[10], (int)lIIllIllI[8], (int)lIIllIllI[27]);
        if (b.lIIIIIIllIIl(widget)) {
            widget.interact(lIIllIlIl[lIIllIllI[28]]);
            Time.sleepTicks((int)lIIllIllI[8]);
            "".length();
        }
    }

    private static boolean lIIIIIIlIllI(int n2, int n3) {
        return n2 != n3;
    }

    public static void b(List<Integer> list) {
        if (b.lIIIIIIlIIII(GrandExchange.isOpen() ? 1 : 0)) {
            if (b.lIIIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (b.lIIIIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
        }
        if (b.lIIIIIIlIIIl(GrandExchange.isOpen() ? 1 : 0)) {
            List<Integer> lIIIIIIlIIlIlII;
            Time.sleepTicks((int)lIIllIllI[8]);
            "".length();
            int lIIIIIIlIIlIIll = lIIllIllI[0];
            while (b.lIIIIIIlIIlI(lIIIIIIlIIlIIll, lIIIIIIlIIlIlII.size())) {
                int[] nArray = new int[lIIllIllI[1]];
                nArray[b.lIIllIllI[0]] = lIIIIIIlIIlIlII.get(lIIIIIIlIIlIIll);
                if (b.lIIIIIIlIlll(Inventory.getCount((int[])nArray))) {
                    int lIIIIIIlIIlIIlI;
                    if (b.lIIIIIIlIIII(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lIIllIllI[1]];
                        nArray2[b.lIIllIllI[0]] = lIIIIIIlIIlIlII.get(lIIIIIIlIIlIIll);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lIIllIllI[8]);
                        "".length();
                        lIIIIIIlIIlIIlI = lIIIIIIlIIlIIll;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIIIIIIllIII(GrandExchange.getItemId(), (Integer)lIIIIIIlIIlIlII.get(lIIIIIIlIIlIIlI))) {
                                bl = lIIllIllI[1];
                                "".length();
                                if (-" ".length() > "   ".length()) {
                                    return ((128 + 70 - 65 + 21 ^ 131 + 124 - 230 + 124) & (0x48 ^ 0xA ^ (0x4B ^ 6) ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = lIIllIllI[0];
                            }
                            return bl;
                        }, (int)lIIllIllI[23]);
                        "".length();
                    }
                    if (b.lIIIIIIlIIIl(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.lIIIIIIlIllI(GrandExchange.getPrice(), lIIllIllI[24])) {
                            GrandExchange.setPrice((int)lIIllIllI[1]);
                            Time.sleepTicks((int)lIIllIllI[8]);
                            "".length();
                            lIIIIIIlIIlIIlI = lIIIIIIlIIlIIll;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.lIIIIIIllIII(GrandExchange.getPrice(), lIIllIllI[1])) {
                                    bl = lIIllIllI[1];
                                    "".length();
                                    if (((0x28 ^ 0x23) & ~(0x16 ^ 0x1D)) == " ".length()) {
                                        return ((0x9D ^ 0xAB) & ~(0xBE ^ 0x88)) != 0;
                                    }
                                } else {
                                    bl = lIIllIllI[0];
                                }
                                return bl;
                            }, (int)lIIllIllI[23]);
                            "".length();
                        }
                        if (b.lIIIIIIllIII(GrandExchange.getPrice(), lIIllIllI[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIIllIllI[23]);
                            "".length();
                        }
                    }
                    if (b.lIIIIIIlIIIl(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIIIIIIlIIII(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lIIllIllI[1];
                                "".length();
                                if (null != null) {
                                    return ((0x24 ^ 1) & ~(0x55 ^ 0x70) & ~((0x16 ^ 0x27) & ~(0x7F ^ 0x4E))) != 0;
                                }
                            } else {
                                bl = lIIllIllI[0];
                            }
                            return bl;
                        }, (int)lIIllIllI[5]);
                        "".length();
                    }
                }
                ++lIIIIIIlIIlIIll;
                "".length();
                if (null == null) continue;
                return;
            }
        }
    }

    private static boolean lIIIIIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIIIIIIIlllI() {
        lIIllIlIl = new String[lIIllIllI[32]];
        b.lIIllIlIl[b.lIIllIllI[0]] = b.lIIIIIIIlIll("6fc/blYcshQ=", "SIccW");
        b.lIIllIlIl[b.lIIllIllI[1]] = b.lIIIIIIIllII("w2rYN8w+Tdv5sjhWYWYWGQ==", "deGHj");
        b.lIIllIlIl[b.lIIllIllI[8]] = b.lIIIIIIIlIll("CR+1xw3aK2m3zTufW4T51UDf7YQ3YpC4kBq3n6/Jn83s9of39WLskcmssNFoKKpzmEMy30MGgCQ=", "VCEEO");
        b.lIIllIlIl[b.lIIllIllI[4]] = b.lIIIIIIIlIll("oCmD4bQxWqyl+ixafq2IKmmn3V45sqaJ", "CuGAK");
        b.lIIllIlIl[b.lIIllIllI[7]] = b.lIIIIIIIllIl("MCAZCTENNVgUNxc9Fwp4S2BR", "cTxdX");
        b.lIIllIlIl[b.lIIllIllI[25]] = b.lIIIIIIIlIll("NLkF/mYC0+Q=", "SjvNC");
        b.lIIllIlIl[b.lIIllIllI[26]] = b.lIIIIIIIllII("O+bGiRjs/9zO4OpnfjTGHg==", "zPpZe");
        b.lIIllIlIl[b.lIIllIllI[13]] = b.lIIIIIIIllII("shZNs5FMIog=", "sgDqY");
        b.lIIllIlIl[b.lIIllIllI[28]] = b.lIIIIIIIlIll("1RTueTzx/X8=", "EBykh");
        b.lIIllIlIl[b.lIIllIllI[29]] = b.lIIIIIIIlIll("urbUnjSI3QM=", "ByOwU");
        b.lIIllIlIl[b.lIIllIllI[3]] = b.lIIIIIIIlIll("zi2sHVJhZ4k=", "UBULX");
        b.lIIllIlIl[b.lIIllIllI[27]] = b.lIIIIIIIlIll("mMVwutCwNvloCZmaDX6R7DvTIcd+to98", "BYLCv");
    }

    public static void a(List<d> list) {
        block65: {
            List<d> lIIIIIIlIlIIIIl;
            int lIIIIIIlIlIIIII2;
            if (b.lIIIIIIlIIII(list.isEmpty() ? 1 : 0) && b.lIIIIIIlIIIl(K.isEmpty() ? 1 : 0)) {
                lIIIIIIlIlIIIII2 = lIIllIllI[0];
                while (b.lIIIIIIlIIlI(lIIIIIIlIlIIIII2, lIIIIIIlIlIIIIl.size())) {
                    K.add(lIIIIIIlIlIIIIl.get(lIIIIIIlIlIIIII2).p());
                    "".length();
                    L.add(lIIIIIIlIlIIIIl.get(lIIIIIIlIlIIIII2).q());
                    "".length();
                    M.add(lIIIIIIlIlIIIIl.get(lIIIIIIlIlIIIII2).r());
                    "".length();
                    ++lIIIIIIlIlIIIII2;
                    "".length();
                    if (-(54 + 3 - 56 + 142 ^ 25 + 45 - 68 + 137) <= 0) continue;
                    return;
                }
            }
            int[] nArray = new int[lIIllIllI[1]];
            nArray[b.lIIllIllI[0]] = lIIllIllI[2];
            if (!b.lIIIIIIlIIll(Inventory.getCount((int[])nArray), lIIllIllI[1]) || b.lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                if (b.lIIIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lIIllIllI[4]);
                    "".length();
                    Predicate<Item> lIIIIIIlIlIIIII2 = item -> item.getName().toLowerCase().contains(lIIllIlIl[lIIllIllI[27]]);
                    if (b.lIIIIIIlIIIl(Bank.contains(lIIIIIIlIlIIIII2) ? 1 : 0) && b.lIIIIIIlIIII(Inventory.contains(item -> item.getName().contains(lIIllIlIl[lIIllIllI[3]])) ? 1 : 0) && b.lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                        Bank.withdraw(lIIIIIIlIlIIIII2, (int)lIIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllIllI[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIIIIIIlIlll(Inventory.getCount((Predicate)lIIIIIIlIlIIIII2))) {
                                bl = lIIllIllI[1];
                                "".length();
                                if (-" ".length() >= "   ".length()) {
                                    return ((0x79 ^ 0x4F) & ~(0xB6 ^ 0x80)) != 0;
                                }
                            } else {
                                bl = lIIllIllI[0];
                            }
                            return bl;
                        }, (int)lIIllIllI[5]);
                        "".length();
                    }
                    if (b.lIIIIIIlIIII(Bank.contains((int[])f.bf) ? 1 : 0) && b.lIIIIIIlIIII(Inventory.contains(item -> item.getName().contains(lIIllIlIl[lIIllIllI[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIllIllI[1]];
                        nArray2[b.lIIllIllI[0]] = lIIllIllI[6];
                        if (b.lIIIIIIlIIIl(Bank.contains((int[])nArray2) ? 1 : 0) && b.lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                            Bank.withdraw((int)lIIllIllI[6], (int)lIIllIllI[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIllIllI[4]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIllIllI[1]];
                                nArray[b.lIIllIllI[0]] = lIIllIllI[6];
                                if (b.lIIIIIIlIlll(Inventory.getCount((int[])nArray))) {
                                    bl = lIIllIllI[1];
                                    "".length();
                                    if (((73 + 20 - -55 + 28 ^ 140 + 112 - 99 + 9) & (34 + 62 - 51 + 145 ^ 132 + 55 - 37 + 22 ^ -" ".length())) < -" ".length()) {
                                        return ((0x80 ^ 0x84 ^ (0xE5 ^ 0x80)) & (0x54 ^ 0x14 ^ (0x1E ^ 0x3F) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = lIIllIllI[0];
                                }
                                return bl;
                            }, (int)lIIllIllI[5]);
                            "".length();
                        }
                    }
                    if (b.lIIIIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                        int[] nArray3 = new int[lIIllIllI[1]];
                        nArray3[b.lIIllIllI[0]] = lIIllIllI[2];
                        if (b.lIIIIIIlIIlI(Inventory.getCount((int[])nArray3), lIIllIllI[1])) {
                            Bank.withdrawAll((int)lIIllIllI[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIllIllI[4]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lIIllIllI[1]];
                                nArray[b.lIIllIllI[0]] = lIIllIllI[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lIIllIllI[5]);
                            "".length();
                        }
                    }
                }
                if (b.lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                    if (b.lIIIIIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIIllIllI[7]);
                        "".length();
                    }
                    if (b.lIIIIIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        if (b.lIIIIIIlIIIl(Inventory.contains((int[])f.bf) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bf).interact(lIIllIlIl[lIIllIllI[0]]);
                            Time.sleepTicks((int)lIIllIllI[8]);
                            "".length();
                        }
                        if (b.lIIIIIIlIIIl(Equipment.contains((int[])f.bf) ? 1 : 0) && b.lIIIIIIlIllI(Players.getLocal().getAnimation(), lIIllIllI[9])) {
                            Equipment.getFirst((int[])f.bf).interact(lIIllIlIl[lIIllIllI[1]]);
                            Time.sleepTicks((int)lIIllIllI[4]);
                            "".length();
                        }
                        Movement.walkTo((WorldPoint)J);
                        "".length();
                    }
                }
            }
            if (b.lIIIIIIlIIII(Bank.isOpen() ? 1 : 0) && b.lIIIIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                int[] nArray4 = new int[lIIllIllI[1]];
                nArray4[b.lIIllIllI[0]] = lIIllIllI[2];
                if (b.lIIIIIIlIIlI(Inventory.getCount((int[])nArray4), lIIllIllI[1])) {
                    a.a();
                }
            }
            if (b.lIIIIIIlIIII(GrandExchange.isOpen() ? 1 : 0)) {
                int[] nArray5 = new int[lIIllIllI[1]];
                nArray5[b.lIIllIllI[0]] = lIIllIllI[2];
                if (b.lIIIIIIlIlll(Inventory.getCount((int[])nArray5)) && b.lIIIIIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[3])) {
                    GrandExchange.open();
                    Time.sleepUntil(() -> GrandExchange.isOpen(), (int)lIIllIllI[5]);
                    "".length();
                }
            }
            if (!b.lIIIIIIlIIIl(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[lIIllIllI[1]];
            nArray6[b.lIIllIllI[0]] = lIIllIllI[2];
            if (!b.lIIIIIIlIlll(Inventory.getCount((int[])nArray6))) break block65;
            lIIIIIIlIlIIIII2 = lIIllIllI[0];
            while (b.lIIIIIIlIIlI(lIIIIIIlIlIIIII2, K.size())) {
                String lIIIIIIlIIlllll = c.c(K.get(lIIIIIIlIlIIIII2));
                System.out.println("Buying " + lIIIIIIlIIlllll + " and itemID is: " + String.valueOf(K.get(lIIIIIIlIlIIIII2)));
                while (b.lIIIIIIlIIII(b.a(lIIIIIIlIIlllll) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.lIIIIIIlIIII(GrandExchange.canCollect() ? 1 : 0)) {
                                            int lIIIIIIlIIlllIl;
                                            int n2;
                                            int lIIIIIIlIIllllI = lIIIIIIlIlIIIII2;
                                            if (b.lIIIIIIlIlll(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIIIIIIllIII(grandExchangeOffer.getItemId(), K.get(lIIIIIIlIIllllI))) {
                                                    bl = lIIllIllI[1];
                                                    "".length();
                                                    if (-"  ".length() > 0) {
                                                        return ((0x80 ^ 0x8F) & ~(0xBC ^ 0xB3)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIllIllI[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lIIllIllI[1];
                                                "".length();
                                                if (null != null) {
                                                    return;
                                                }
                                            } else {
                                                n2 = lIIllIllI[0];
                                            }
                                            if (b.lIIIIIIlIIIl(lIIIIIIlIIlllIl = n2) && b.lIIIIIIlIlII(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIIIIIIllIII(grandExchangeOffer.getItemId(), K.get(lIIIIIIlIIllllI))) {
                                                    bl = lIIllIllI[1];
                                                    "".length();
                                                    if ("  ".length() <= -" ".length()) {
                                                        return ((0x69 ^ 0x2C) & ~(0x50 ^ 0x15)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIllIllI[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), lIIllIllI[1])) {
                                                GrandExchange.abortOffer((int)K.get(lIIIIIIlIlIIIII2));
                                            }
                                            if (b.lIIIIIIlIIII(lIIIIIIlIIlllIl)) {
                                                if (!b.lIIIIIIlIIIl(GrandExchange.isBuying() ? 1 : 0) || b.lIIIIIIlIllI(GrandExchange.getItemId(), K.get(lIIIIIIlIlIIIII2))) {
                                                    b.a(K.get(lIIIIIIlIlIIIII2));
                                                }
                                                if (b.lIIIIIIllIII(GrandExchange.getItemId(), K.get(lIIIIIIlIlIIIII2)) && b.lIIIIIIlIllI(GrandExchange.getQuantity(), L.get(lIIIIIIlIlIIIII2))) {
                                                    GrandExchange.setQuantity((int)L.get(lIIIIIIlIlIIIII2));
                                                }
                                                int lIIIIIIlIIlllII = M.get(lIIIIIIlIlIIIII2);
                                                int lIIIIIIlIIllIll = lIIllIllI[0];
                                                Widget lIIIIIIlIIllIlI = Widgets.get((int)lIIllIllI[10], (int)lIIllIllI[11]);
                                                if (b.lIIIIIIlIIIl(GrandExchange.isOpen() ? 1 : 0) && b.lIIIIIIlIIIl(GrandExchange.isBuying() ? 1 : 0) && b.lIIIIIIllIIl(lIIIIIIlIIllIlI) && b.lIIIIIIlIIII(lIIIIIIlIIllIlI.getText().isEmpty() ? 1 : 0)) {
                                                    int lIIIIIIlIIllIIl;
                                                    lIIIIIIlIIllIll = lIIIIIIlIIllIIl = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + lIIIIIIlIIllIIl + "|Given price: " + String.valueOf(M.get(lIIIIIIlIlIIIII2)));
                                                }
                                                if (b.lIIIIIIlIIll(lIIIIIIlIIllIll, lIIIIIIlIIlllII)) {
                                                    double lIIIIIIlIIllIIl;
                                                    if (b.lIIIIIIlIlII(lIIIIIIlIIllIll, lIIllIllI[12])) {
                                                        lIIIIIIlIIllIIl = 0.1;
                                                        "".length();
                                                        if ("  ".length() == 0) {
                                                            return;
                                                        }
                                                    } else {
                                                        lIIIIIIlIIllIIl = 0.3;
                                                    }
                                                    int lIIIIIIlIIllIII = (int)((double)lIIIIIIlIIllIll + (double)lIIIIIIlIIllIll * lIIIIIIlIIllIIl);
                                                    System.out.println("Increased price: " + lIIIIIIlIIllIII);
                                                    if (b.lIIIIIIllIII(GrandExchange.getItemId(), K.get(lIIIIIIlIlIIIII2)) && b.lIIIIIIlIllI(GrandExchange.getPrice(), lIIIIIIlIIllIII)) {
                                                        GrandExchange.setPrice((int)lIIIIIIlIIllIII);
                                                    }
                                                    if (b.lIIIIIIllIII(GrandExchange.getItemId(), K.get(lIIIIIIlIlIIIII2)) && b.lIIIIIIllIII(GrandExchange.getPrice(), lIIIIIIlIIllIII)) {
                                                        GrandExchange.confirm();
                                                    }
                                                    "".length();
                                                    if ("   ".length() >= (0x32 ^ 0x36)) {
                                                        return;
                                                    }
                                                } else {
                                                    if (b.lIIIIIIllIII(GrandExchange.getItemId(), K.get(lIIIIIIlIlIIIII2)) && b.lIIIIIIlIllI(GrandExchange.getPrice(), M.get(lIIIIIIlIlIIIII2))) {
                                                        GrandExchange.setPrice((int)M.get(lIIIIIIlIlIIIII2));
                                                    }
                                                    if (b.lIIIIIIllIII(GrandExchange.getItemId(), K.get(lIIIIIIlIlIIIII2)) && b.lIIIIIIllIII(GrandExchange.getPrice(), M.get(lIIIIIIlIlIIIII2))) {
                                                        GrandExchange.confirm();
                                                    }
                                                }
                                            }
                                        }
                                        if (b.lIIIIIIlIIII(Worlds.inMembersWorld() ? 1 : 0)) {
                                            System.out.println(lIIllIlIl[lIIllIllI[8]]);
                                            AccBuilderEasyClues.d = lIIllIllI[1];
                                            return;
                                        }
                                        if (b.lIIIIIIlIlII(Players.getLocal().getWorldLocation().distanceTo(J), lIIllIllI[13])) {
                                            Movement.walkTo((WorldPoint)J);
                                            "".length();
                                            Time.sleepTicks((int)lIIllIllI[1]);
                                            "".length();
                                        }
                                        if (b.lIIIIIIlIIII(GrandExchange.isOpen() ? 1 : 0)) {
                                            GrandExchange.open();
                                        }
                                        if (b.lIIIIIIlIIIl(GrandExchange.canCollect() ? 1 : 0)) {
                                            GrandExchange.collect();
                                            Time.sleepUntil(() -> {
                                                boolean bl;
                                                if (b.lIIIIIIlIIII(GrandExchange.canCollect() ? 1 : 0)) {
                                                    bl = lIIllIllI[1];
                                                    "".length();
                                                    if (((0x98 ^ 0xC6) & ~(0xF5 ^ 0xAB)) != 0) {
                                                        return ((0xB7 ^ 0x88) & ~(0x99 ^ 0xA6)) != 0;
                                                    }
                                                } else {
                                                    bl = lIIllIllI[0];
                                                }
                                                return bl;
                                            }, (int)lIIllIllI[5]);
                                            "".length();
                                        }
                                        if (!b.lIIIIIIllIII(K.get(lIIIIIIlIlIIIII2), lIIllIllI[14])) break block66;
                                        int[] nArray7 = new int[lIIllIllI[1]];
                                        nArray7[b.lIIllIllI[0]] = lIIllIllI[14];
                                        if (!b.lIIIIIIlIIII(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.lIIIIIIllIII(K.get(lIIIIIIlIlIIIII2), lIIllIllI[15])) break block68;
                                }
                                K.remove(lIIllIllI[0]);
                                "".length();
                                L.remove(lIIllIllI[0]);
                                "".length();
                                M.remove(lIIllIllI[0]);
                                "".length();
                                lIIIIIIlIlIIIIl.remove(lIIllIllI[0]);
                                "".length();
                                Time.sleepTicks((int)lIIllIllI[8]);
                                "".length();
                                "".length();
                                if ("  ".length() != 0) continue;
                                return;
                            }
                            if (b.lIIIIIIllIII(K.get(lIIIIIIlIlIIIII2), lIIllIllI[16])) {
                                int[] nArray8 = new int[lIIllIllI[1]];
                                nArray8[b.lIIllIllI[0]] = lIIllIllI[16];
                                if (b.lIIIIIIlIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    lIIIIIIlIlIIIIl.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (null == null) continue;
                                    return;
                                }
                            }
                            if (b.lIIIIIIllIII(K.get(lIIIIIIlIlIIIII2), lIIllIllI[17])) {
                                int[] nArray9 = new int[lIIllIllI[1]];
                                nArray9[b.lIIllIllI[0]] = lIIllIllI[18];
                                if (b.lIIIIIIlIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    lIIIIIIlIlIIIIl.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if ("  ".length() > 0) continue;
                                    return;
                                }
                            }
                            if (b.lIIIIIIllIII(K.get(lIIIIIIlIlIIIII2), lIIllIllI[19])) {
                                int[] nArray10 = new int[lIIllIllI[1]];
                                nArray10[b.lIIllIllI[0]] = lIIllIllI[19];
                                if (b.lIIIIIIlIIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    lIIIIIIlIlIIIIl.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (null == null) continue;
                                    return;
                                }
                            }
                            if (b.lIIIIIIllIII(K.get(lIIIIIIlIlIIIII2), lIIllIllI[20])) {
                                int[] nArray11 = new int[lIIllIllI[1]];
                                nArray11[b.lIIllIllI[0]] = lIIllIllI[20];
                                if (b.lIIIIIIlIIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    lIIIIIIlIlIIIIl.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (" ".length() < "  ".length()) continue;
                                    return;
                                }
                            }
                            if (b.lIIIIIIllIII(K.get(lIIIIIIlIlIIIII2), lIIllIllI[21])) {
                                int[] nArray12 = new int[lIIllIllI[1]];
                                nArray12[b.lIIllIllI[0]] = lIIllIllI[21];
                                if (b.lIIIIIIlIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    K.remove(lIIllIllI[0]);
                                    "".length();
                                    L.remove(lIIllIllI[0]);
                                    "".length();
                                    M.remove(lIIllIllI[0]);
                                    "".length();
                                    lIIIIIIlIlIIIIl.remove(lIIllIllI[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIllIllI[8]);
                                    "".length();
                                    "".length();
                                    if (-"   ".length() < 0) continue;
                                    return;
                                }
                            }
                            if (!b.lIIIIIIllIII(K.get(lIIIIIIlIlIIIII2), lIIllIllI[22])) break block69;
                            String[] stringArray = new String[lIIllIllI[1]];
                            stringArray[b.lIIllIllI[0]] = lIIllIlIl[lIIllIllI[4]];
                            if (!b.lIIIIIIlIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block70;
                            String[] stringArray2 = new String[lIIllIllI[1]];
                            stringArray2[b.lIIllIllI[0]] = lIIllIlIl[lIIllIllI[7]];
                            if (!b.lIIIIIIlIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block69;
                        }
                        K.remove(lIIllIllI[0]);
                        "".length();
                        L.remove(lIIllIllI[0]);
                        "".length();
                        M.remove(lIIllIllI[0]);
                        "".length();
                        lIIIIIIlIlIIIIl.remove(lIIllIllI[0]);
                        "".length();
                        Time.sleepTicks((int)lIIllIllI[8]);
                        "".length();
                        "".length();
                        if (-" ".length() < (0x96 ^ 0x92)) continue;
                        return;
                    }
                    if (!b.lIIIIIIlIIII(b.a(lIIIIIIlIIlllll) ? 1 : 0)) break;
                    if (b.lIIIIIIlIIIl(AccBuilderEasyClues.d ? 1 : 0)) {
                        "".length();
                        if (-(0xF1 ^ 0xC4 ^ (0x31 ^ 0)) <= 0) break;
                        return;
                    }
                    Time.sleepTicks((int)lIIllIllI[4]);
                    "".length();
                    "".length();
                    if ((0x79 ^ 0x39 ^ (0x63 ^ 0x27)) > -" ".length()) continue;
                    return;
                }
                if (b.lIIIIIIlIIIl(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.lIIIIIIlIIII(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lIIllIllI[1];
                            "".length();
                            if (-(0x86 ^ 0xB1 ^ (0x51 ^ 0x63)) >= 0) {
                                return ((31 + 209 - 110 + 93 ^ 25 + 27 - -88 + 57) & (0x58 ^ 0x5D ^ (0x30 ^ 0x2F) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = lIIllIllI[0];
                        }
                        return bl;
                    }, (int)lIIllIllI[5]);
                    "".length();
                }
                System.out.println(lIIIIIIlIlIIIIl.get(lIIIIIIlIlIIIII2).p());
                if (b.lIIIIIIllIII(K.get(lIIIIIIlIlIIIII2), lIIllIllI[15])) {
                    K.remove(lIIllIllI[0]);
                    "".length();
                    L.remove(lIIllIllI[0]);
                    "".length();
                    M.remove(lIIllIllI[0]);
                    "".length();
                    lIIIIIIlIlIIIIl.remove(lIIllIllI[0]);
                    "".length();
                }
                if (b.lIIIIIIlIIIl(b.a(lIIIIIIlIIlllll) ? 1 : 0)) {
                    K.remove(lIIllIllI[0]);
                    "".length();
                    L.remove(lIIllIllI[0]);
                    "".length();
                    M.remove(lIIllIllI[0]);
                    "".length();
                    lIIIIIIlIlIIIIl.remove(lIIllIllI[0]);
                    "".length();
                }
                Time.sleepTicks((int)lIIllIllI[8]);
                "".length();
                ++lIIIIIIlIlIIIII2;
                "".length();
                if (((0x24 ^ 6 ^ (0x5B ^ 0x53)) & (0x6A ^ 0x5C ^ (0x37 ^ 0x2B) ^ -" ".length())) <= 0) continue;
                return;
            }
        }
    }

    private static boolean lIIIIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIIIllII(String lIIIIIIIlIlIIlI, String lIIIIIIIlIlIIll) {
        try {
            SecretKeySpec lIIIIIIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIIllIllI[28]), "DES");
            Cipher lIIIIIIIlIlIllI = Cipher.getInstance("DES");
            lIIIIIIIlIlIllI.init(lIIllIllI[8], lIIIIIIIlIlIlll);
            return new String(lIIIIIIIlIlIllI.doFinal(Base64.getDecoder().decode(lIIIIIIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIIIIlIlIlIl) {
            lIIIIIIIlIlIlIl.printStackTrace();
            return null;
        }
    }
}

