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
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.c;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
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
            void lllllllllllllllIIIIIIllIIlllllll;
            String lllllllllllllllIIIIIIllIIllllllI;
            Object var2_2 = null;
            if (b.lIlIIlIlllIllIl(string.contains(lIIIllllIlIll[lIIIllllIllII[25]]) ? 1 : 0)) {
                lllllllllllllllIIIIIIllIIllllllI = string.replace(lIIIllllIlIll[lIIIllllIllII[26]], lIIIllllIlIll[lIIIllllIllII[13]]).trim();
            }
            int lllllllllllllllIIIIIIllIIlllllIl = lIIIllllIllII[0];
            while (b.lIlIIlIlllIlllI(lllllllllllllllIIIIIIllIIlllllIl, lllllllllllllllIIIIIIllIIlllllll.size())) {
                String lllllllllllllllIIIIIIllIIlllllII = ((Item)lllllllllllllllIIIIIIllIIlllllll.get(lllllllllllllllIIIIIIllIIlllllIl)).getName();
                if (b.lIlIIlIllllIlIl(lllllllllllllllIIIIIIllIIlllllII)) {
                    String lllllllllllllllIIIIIIllIlIIIIIII;
                    if (b.lIlIIlIlllIllIl(lllllllllllllllIIIIIIllIIlllllII.contains(lllllllllllllllIIIIIIllIlIIIIIII) ? 1 : 0)) {
                        return lIIIllllIllII[1];
                    }
                    if (b.lIlIIlIllllIlIl(lllllllllllllllIIIIIIllIIllllllI) && b.lIlIIlIlllIllIl(lllllllllllllllIIIIIIllIIlllllII.contains(lllllllllllllllIIIIIIllIIllllllI) ? 1 : 0)) {
                        return lIIIllllIllII[1];
                    }
                }
                ++lllllllllllllllIIIIIIllIIlllllIl;
                "".length();
                if (" ".length() != 0) continue;
                return ((0x30 ^ 0x26) & ~(0x8E ^ 0x98)) != 0;
            }
        }
        return lIIIllllIllII[0];
    }

    private static boolean lIlIIlIlllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIlllIlIII(String lllllllllllllllIIIIIIllIIlIIIIll, String lllllllllllllllIIIIIIllIIlIIIIlI) {
        lllllllllllllllIIIIIIllIIlIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIllIIlIIIIIl = new StringBuilder();
        char[] lllllllllllllllIIIIIIllIIlIIIIII = lllllllllllllllIIIIIIllIIlIIIIlI.toCharArray();
        int lllllllllllllllIIIIIIllIIIllllll = lIIIllllIllII[0];
        char[] lllllllllllllllIIIIIIllIIIlllIIl = lllllllllllllllIIIIIIllIIlIIIIll.toCharArray();
        int lllllllllllllllIIIIIIllIIIlllIII = lllllllllllllllIIIIIIllIIIlllIIl.length;
        int lllllllllllllllIIIIIIllIIIllIlll = lIIIllllIllII[0];
        while (b.lIlIIlIlllIlllI(lllllllllllllllIIIIIIllIIIllIlll, lllllllllllllllIIIIIIllIIIlllIII)) {
            char lllllllllllllllIIIIIIllIIlIIIlII = lllllllllllllllIIIIIIllIIIlllIIl[lllllllllllllllIIIIIIllIIIllIlll];
            lllllllllllllllIIIIIIllIIlIIIIIl.append((char)(lllllllllllllllIIIIIIllIIlIIIlII ^ lllllllllllllllIIIIIIllIIlIIIIII[lllllllllllllllIIIIIIllIIIllllll % lllllllllllllllIIIIIIllIIlIIIIII.length]));
            "".length();
            ++lllllllllllllllIIIIIIllIIIllllll;
            ++lllllllllllllllIIIIIIllIIIllIlll;
            "".length();
            if (((0x36 ^ 0x1D) & ~(0x37 ^ 0x1C)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIIllIIlIIIIIl);
    }

    private static void lIlIIlIlllIlIlI() {
        lIIIllllIllII = new int[33];
        b.lIIIllllIllII[0] = (0xD6 ^ 0x8C) & ~(0xC6 ^ 0x9C);
        b.lIIIllllIllII[1] = " ".length();
        b.lIIIllllIllII[2] = 0xFFFFC7E7 & 0x3BFB;
        b.lIIIllllIllII[3] = 0x1D ^ 0x17;
        b.lIIIllllIllII[4] = "   ".length();
        b.lIIIllllIllII[5] = 0xFFFFFB9D & 0x17EA;
        b.lIIIllllIllII[6] = 0xFFFF9F47 & Short.MAX_VALUE;
        b.lIIIllllIllII[7] = 0x2E ^ 0x2A;
        b.lIIIllllIllII[8] = "  ".length();
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
        b.lIIIllllIllII[24] = -" ".length();
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
            List<d> lllllllllllllllIIIIIIllIlIIlIlIl;
            int lllllllllllllllIIIIIIllIlIIlIlII2;
            if (b.lIlIIlIlllIllII(list.isEmpty() ? 1 : 0) && b.lIlIIlIlllIllIl(J.isEmpty() ? 1 : 0)) {
                lllllllllllllllIIIIIIllIlIIlIlII2 = lIIIllllIllII[0];
                while (b.lIlIIlIlllIlllI(lllllllllllllllIIIIIIllIlIIlIlII2, lllllllllllllllIIIIIIllIlIIlIlIl.size())) {
                    J.add(lllllllllllllllIIIIIIllIlIIlIlIl.get(lllllllllllllllIIIIIIllIlIIlIlII2).p());
                    "".length();
                    K.add(lllllllllllllllIIIIIIllIlIIlIlIl.get(lllllllllllllllIIIIIIllIlIIlIlII2).q());
                    "".length();
                    L.add(lllllllllllllllIIIIIIllIlIIlIlIl.get(lllllllllllllllIIIIIIllIlIIlIlII2).r());
                    "".length();
                    ++lllllllllllllllIIIIIIllIlIIlIlII2;
                    "".length();
                    if ("   ".length() != 0) continue;
                    return;
                }
            }
            int[] nArray = new int[lIIIllllIllII[1]];
            nArray[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
            if (!b.lIlIIlIlllIllll(Inventory.getCount((int[])nArray), lIIIllllIllII[1]) || b.lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                if (b.lIlIIlIlllIllIl(Bank.isOpen() ? 1 : 0)) {
                    Time.sleepTicks((int)lIIIllllIllII[4]);
                    "".length();
                    Predicate<Item> lllllllllllllllIIIIIIllIlIIlIlII2 = item -> item.getName().toLowerCase().contains(lIIIllllIlIll[lIIIllllIllII[27]]);
                    if (b.lIlIIlIlllIllIl(Bank.contains(lllllllllllllllIIIIIIllIlIIlIlII2) ? 1 : 0) && b.lIlIIlIlllIllII(Inventory.contains(item -> item.getName().contains(lIIIllllIlIll[lIIIllllIllII[3]])) ? 1 : 0) && b.lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                        Bank.withdraw(lllllllllllllllIIIIIIllIlIIlIlII2, (int)lIIIllllIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIIllllIllII[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIllllIIll(Inventory.getCount((Predicate)lllllllllllllllIIIIIIllIlIIlIlII2))) {
                                bl = lIIIllllIllII[1];
                                "".length();
                                if (null != null) {
                                    return ((0x47 ^ 0x64) & ~(0x95 ^ 0xB6)) != 0;
                                }
                            } else {
                                bl = lIIIllllIllII[0];
                            }
                            return bl;
                        }, (int)lIIIllllIllII[5]);
                        "".length();
                    }
                    if (b.lIlIIlIlllIllII(Bank.contains((int[])f.bk) ? 1 : 0) && b.lIlIIlIlllIllII(Inventory.contains(item -> item.getName().contains(lIIIllllIlIll[lIIIllllIllII[29]])) ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIllllIllII[1]];
                        nArray2[b.lIIIllllIllII[0]] = lIIIllllIllII[6];
                        if (b.lIlIIlIlllIllIl(Bank.contains((int[])nArray2) ? 1 : 0) && b.lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                            Bank.withdraw((int)lIIIllllIllII[6], (int)lIIIllllIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIIllllIllII[4]);
                            "".length();
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIIllllIllII[1]];
                                nArray[b.lIIIllllIllII[0]] = lIIIllllIllII[6];
                                if (b.lIlIIlIllllIIll(Inventory.getCount((int[])nArray))) {
                                    bl = lIIIllllIllII[1];
                                    "".length();
                                    if (" ".length() > " ".length()) {
                                        return ((0x6B ^ 0x3D) & ~(0xD6 ^ 0x80)) != 0;
                                    }
                                } else {
                                    bl = lIIIllllIllII[0];
                                }
                                return bl;
                            }, (int)lIIIllllIllII[5]);
                            "".length();
                        }
                    }
                    if (b.lIlIIlIllllIIIl(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                        int[] nArray3 = new int[lIIIllllIllII[1]];
                        nArray3[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
                        if (b.lIlIIlIlllIlllI(Inventory.getCount((int[])nArray3), lIIIllllIllII[1])) {
                            Bank.withdrawAll((int)lIIIllllIllII[2], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIIllllIllII[4]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] nArray = new int[lIIIllllIllII[1]];
                                nArray[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
                                return Inventory.contains((int[])nArray);
                            }, (int)lIIIllllIllII[5]);
                            "".length();
                        }
                    }
                }
                if (b.lIlIIlIllllIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIllllIllII[3])) {
                    if (b.lIlIIlIlllIllIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks((int)lIIIllllIllII[7]);
                        "".length();
                    }
                    if (b.lIlIIlIlllIllII(Bank.isOpen() ? 1 : 0)) {
                        if (b.lIlIIlIlllIllIl(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bk).interact(lIIIllllIlIll[lIIIllllIllII[0]]);
                            Time.sleepTicks((int)lIIIllllIllII[8]);
                            "".length();
                        }
                        if (b.lIlIIlIlllIllIl(Equipment.contains((int[])f.bk) ? 1 : 0) && b.lIlIIlIllllIIlI(Players.getLocal().getAnimation(), lIIIllllIllII[9])) {
                            Equipment.getFirst((int[])f.bk).interact(lIIIllllIlIll[lIIIllllIllII[1]]);
                            Time.sleepTicks((int)lIIIllllIllII[4]);
                            "".length();
                        }
                        Movement.walkTo((WorldPoint)I);
                        "".length();
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
                    "".length();
                }
            }
            if (!b.lIlIIlIlllIllIl(GrandExchange.isOpen() ? 1 : 0)) break block65;
            int[] nArray6 = new int[lIIIllllIllII[1]];
            nArray6[b.lIIIllllIllII[0]] = lIIIllllIllII[2];
            if (!b.lIlIIlIllllIIll(Inventory.getCount((int[])nArray6))) break block65;
            lllllllllllllllIIIIIIllIlIIlIlII2 = lIIIllllIllII[0];
            while (b.lIlIIlIlllIlllI(lllllllllllllllIIIIIIllIlIIlIlII2, J.size())) {
                String lllllllllllllllIIIIIIllIlIIlIIll = c.c(J.get(lllllllllllllllIIIIIIllIlIIlIlII2));
                System.out.println("Buying " + lllllllllllllllIIIIIIllIlIIlIIll + " and itemID is: " + String.valueOf(J.get(lllllllllllllllIIIIIIllIlIIlIlII2)));
                while (b.lIlIIlIlllIllII(b.a(lllllllllllllllIIIIIIllIlIIlIIll) ? 1 : 0)) {
                    block69: {
                        block70: {
                            block68: {
                                block67: {
                                    block66: {
                                        if (b.lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                                            int lllllllllllllllIIIIIIllIlIIlIIIl;
                                            int n2;
                                            int lllllllllllllllIIIIIIllIlIIlIIlI = lllllllllllllllIIIIIIllIlIIlIlII2;
                                            if (b.lIlIIlIllllIIll(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIlIIlIllllIlII(grandExchangeOffer.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIIlI))) {
                                                    bl = lIIIllllIllII[1];
                                                    "".length();
                                                    if (null != null) {
                                                        return ((22 + 128 - 57 + 36 ^ 130 + 4 - 46 + 70) & (47 + 99 - 88 + 71 ^ 53 + 73 - -21 + 11 ^ -" ".length())) != 0;
                                                    }
                                                } else {
                                                    bl = lIIIllllIllII[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size())) {
                                                n2 = lIIIllllIllII[1];
                                                "".length();
                                                if ((0x52 ^ 0x56) == "  ".length()) {
                                                    return;
                                                }
                                            } else {
                                                n2 = lIIIllllIllII[0];
                                            }
                                            if (b.lIlIIlIlllIllIl(lllllllllllllllIIIIIIllIlIIlIIIl = n2) && b.lIlIIlIllllIIII(GrandExchange.getOffers().stream().filter(grandExchangeOffer -> {
                                                boolean bl;
                                                if (b.lIlIIlIllllIlII(grandExchangeOffer.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIIlI))) {
                                                    bl = lIIIllllIllII[1];
                                                    "".length();
                                                    if (-(112 + 5 - 26 + 48 ^ 66 + 138 - 190 + 129) > 0) {
                                                        return ((0xC2 ^ 0xBE ^ (0x35 ^ 1)) & (0xE9 ^ 0xAA ^ (0xC9 ^ 0xC2) ^ -" ".length())) != 0;
                                                    }
                                                } else {
                                                    bl = lIIIllllIllII[0];
                                                }
                                                return bl;
                                            }).collect(Collectors.toList()).size(), lIIIllllIllII[1])) {
                                                GrandExchange.abortOffer((int)J.get(lllllllllllllllIIIIIIllIlIIlIlII2));
                                            }
                                            if (b.lIlIIlIlllIllII(lllllllllllllllIIIIIIllIlIIlIIIl)) {
                                                if (!b.lIlIIlIlllIllIl(GrandExchange.isBuying() ? 1 : 0) || b.lIlIIlIllllIIlI(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2))) {
                                                    b.a(J.get(lllllllllllllllIIIIIIllIlIIlIlII2));
                                                }
                                                if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2)) && b.lIlIIlIllllIIlI(GrandExchange.getQuantity(), K.get(lllllllllllllllIIIIIIllIlIIlIlII2))) {
                                                    GrandExchange.setQuantity((int)K.get(lllllllllllllllIIIIIIllIlIIlIlII2));
                                                }
                                                int lllllllllllllllIIIIIIllIlIIlIIII = L.get(lllllllllllllllIIIIIIllIlIIlIlII2);
                                                int lllllllllllllllIIIIIIllIlIIIllll = lIIIllllIllII[0];
                                                Widget lllllllllllllllIIIIIIllIlIIIlllI = Widgets.get((int)lIIIllllIllII[10], (int)lIIIllllIllII[11]);
                                                if (b.lIlIIlIlllIllIl(GrandExchange.isOpen() ? 1 : 0) && b.lIlIIlIlllIllIl(GrandExchange.isBuying() ? 1 : 0) && b.lIlIIlIllllIlIl(lllllllllllllllIIIIIIllIlIIIlllI) && b.lIlIIlIlllIllII(lllllllllllllllIIIIIIllIlIIIlllI.getText().isEmpty() ? 1 : 0)) {
                                                    int lllllllllllllllIIIIIIllIlIIIllIl;
                                                    lllllllllllllllIIIIIIllIlIIIllll = lllllllllllllllIIIIIIllIlIIIllIl = GrandExchange.getGuidePrice();
                                                    System.out.println("Guide price: " + lllllllllllllllIIIIIIllIlIIIllIl + "|Given price: " + String.valueOf(L.get(lllllllllllllllIIIIIIllIlIIlIlII2)));
                                                }
                                                if (b.lIlIIlIlllIllll(lllllllllllllllIIIIIIllIlIIIllll, lllllllllllllllIIIIIIllIlIIlIIII)) {
                                                    double lllllllllllllllIIIIIIllIlIIIllIl;
                                                    if (b.lIlIIlIllllIIII(lllllllllllllllIIIIIIllIlIIIllll, lIIIllllIllII[12])) {
                                                        lllllllllllllllIIIIIIllIlIIIllIl = 0.1;
                                                        "".length();
                                                        if (((0xFA ^ 0xC2) & ~(0x4D ^ 0x75)) > (2 ^ 6)) {
                                                            return;
                                                        }
                                                    } else {
                                                        lllllllllllllllIIIIIIllIlIIIllIl = 0.3;
                                                    }
                                                    int lllllllllllllllIIIIIIllIlIIIllII = (int)((double)lllllllllllllllIIIIIIllIlIIIllll + (double)lllllllllllllllIIIIIIllIlIIIllll * lllllllllllllllIIIIIIllIlIIIllIl);
                                                    System.out.println("Increased price: " + lllllllllllllllIIIIIIllIlIIIllII);
                                                    if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2)) && b.lIlIIlIllllIIlI(GrandExchange.getPrice(), lllllllllllllllIIIIIIllIlIIIllII)) {
                                                        GrandExchange.setPrice((int)lllllllllllllllIIIIIIllIlIIIllII);
                                                    }
                                                    if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), J.get(lllllllllllllllIIIIIIllIlIIlIlII2)) && b.lIlIIlIllllIlII(GrandExchange.getPrice(), lllllllllllllllIIIIIIllIlIIIllII)) {
                                                        GrandExchange.confirm();
                                                    }
                                                    "".length();
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
                                            "".length();
                                            Time.sleepTicks((int)lIIIllllIllII[1]);
                                            "".length();
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
                                                    "".length();
                                                    if ("   ".length() <= 0) {
                                                        return ((0xAD ^ 0xC1 ^ (0x78 ^ 1)) & (114 + 113 - 109 + 40 ^ 74 + 118 - 128 + 75 ^ -" ".length())) != 0;
                                                    }
                                                } else {
                                                    bl = lIIIllllIllII[0];
                                                }
                                                return bl;
                                            }, (int)lIIIllllIllII[5]);
                                            "".length();
                                        }
                                        if (!b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[14])) break block66;
                                        int[] nArray7 = new int[lIIIllllIllII[1]];
                                        nArray7[b.lIIIllllIllII[0]] = lIIIllllIllII[14];
                                        if (!b.lIlIIlIlllIllII(Inventory.contains((int[])nArray7) ? 1 : 0)) break block67;
                                    }
                                    if (!b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[15])) break block68;
                                }
                                J.remove(lIIIllllIllII[0]);
                                "".length();
                                K.remove(lIIIllllIllII[0]);
                                "".length();
                                L.remove(lIIIllllIllII[0]);
                                "".length();
                                lllllllllllllllIIIIIIllIlIIlIlIl.remove(lIIIllllIllII[0]);
                                "".length();
                                Time.sleepTicks((int)lIIIllllIllII[8]);
                                "".length();
                                "".length();
                                if (-"   ".length() <= 0) continue;
                                return;
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[16])) {
                                int[] nArray8 = new int[lIIIllllIllII[1]];
                                nArray8[b.lIIIllllIllII[0]] = lIIIllllIllII[16];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    lllllllllllllllIIIIIIllIlIIlIlIl.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if ((0xF0 ^ 0xA3 ^ (0x18 ^ 0x4E)) > 0) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[17])) {
                                int[] nArray9 = new int[lIIIllllIllII[1]];
                                nArray9[b.lIIIllllIllII[0]] = lIIIllllIllII[18];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    lllllllllllllllIIIIIIllIlIIlIlIl.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if (" ".length() >= ((7 ^ 0x38 ^ (0x53 ^ 0x7E)) & (55 + 3 - -39 + 36 ^ 123 + 134 - 128 + 22 ^ -" ".length()))) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[19])) {
                                int[] nArray10 = new int[lIIIllllIllII[1]];
                                nArray10[b.lIIIllllIllII[0]] = lIIIllllIllII[19];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    lllllllllllllllIIIIIIllIlIIlIlIl.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if (-" ".length() <= "  ".length()) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[20])) {
                                int[] nArray11 = new int[lIIIllllIllII[1]];
                                nArray11[b.lIIIllllIllII[0]] = lIIIllllIllII[20];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    lllllllllllllllIIIIIIllIlIIlIlIl.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if (-(0x5C ^ 0x59) < 0) continue;
                                    return;
                                }
                            }
                            if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[21])) {
                                int[] nArray12 = new int[lIIIllllIllII[1]];
                                nArray12[b.lIIIllllIllII[0]] = lIIIllllIllII[21];
                                if (b.lIlIIlIlllIllIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    J.remove(lIIIllllIllII[0]);
                                    "".length();
                                    K.remove(lIIIllllIllII[0]);
                                    "".length();
                                    L.remove(lIIIllllIllII[0]);
                                    "".length();
                                    lllllllllllllllIIIIIIllIlIIlIlIl.remove(lIIIllllIllII[0]);
                                    "".length();
                                    Time.sleepTicks((int)lIIIllllIllII[8]);
                                    "".length();
                                    "".length();
                                    if ("  ".length() > -" ".length()) continue;
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
                        "".length();
                        K.remove(lIIIllllIllII[0]);
                        "".length();
                        L.remove(lIIIllllIllII[0]);
                        "".length();
                        lllllllllllllllIIIIIIllIlIIlIlIl.remove(lIIIllllIllII[0]);
                        "".length();
                        Time.sleepTicks((int)lIIIllllIllII[8]);
                        "".length();
                        "".length();
                        if ("  ".length() > 0) continue;
                        return;
                    }
                    if (!b.lIlIIlIlllIllII(b.a(lllllllllllllllIIIIIIllIlIIlIIll) ? 1 : 0)) break;
                    if (b.lIlIIlIlllIllIl(AccBuilderRat.d ? 1 : 0)) {
                        "".length();
                        if ("   ".length() > "  ".length()) break;
                        return;
                    }
                    Time.sleepTicks((int)lIIIllllIllII[4]);
                    "".length();
                    "".length();
                    if (((0x5A ^ 0x34 ^ (0xA5 ^ 0x98)) & (0xF0 ^ 0x8D ^ (0x9F ^ 0xB1) ^ -" ".length())) == 0) continue;
                    return;
                }
                if (b.lIlIIlIlllIllIl(GrandExchange.canCollect() ? 1 : 0)) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (b.lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                            bl = lIIIllllIllII[1];
                            "".length();
                            if (-(0x79 ^ 0x7D) >= 0) {
                                return ((5 ^ 0x38) & ~(0x18 ^ 0x25)) != 0;
                            }
                        } else {
                            bl = lIIIllllIllII[0];
                        }
                        return bl;
                    }, (int)lIIIllllIllII[5]);
                    "".length();
                }
                System.out.println(lllllllllllllllIIIIIIllIlIIlIlIl.get(lllllllllllllllIIIIIIllIlIIlIlII2).p());
                if (b.lIlIIlIllllIlII(J.get(lllllllllllllllIIIIIIllIlIIlIlII2), lIIIllllIllII[15])) {
                    J.remove(lIIIllllIllII[0]);
                    "".length();
                    K.remove(lIIIllllIllII[0]);
                    "".length();
                    L.remove(lIIIllllIllII[0]);
                    "".length();
                    lllllllllllllllIIIIIIllIlIIlIlIl.remove(lIIIllllIllII[0]);
                    "".length();
                }
                if (b.lIlIIlIlllIllIl(b.a(lllllllllllllllIIIIIIllIlIIlIIll) ? 1 : 0)) {
                    J.remove(lIIIllllIllII[0]);
                    "".length();
                    K.remove(lIIIllllIllII[0]);
                    "".length();
                    L.remove(lIIIllllIllII[0]);
                    "".length();
                    lllllllllllllllIIIIIIllIlIIlIlIl.remove(lIIIllllIllII[0]);
                    "".length();
                }
                Time.sleepTicks((int)lIIIllllIllII[8]);
                "".length();
                ++lllllllllllllllIIIIIIllIlIIlIlII2;
                "".length();
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

    private static String lIlIIlIlllIIllI(String lllllllllllllllIIIIIIllIIllIIIII, String lllllllllllllllIIIIIIllIIlIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIllIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIllIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIllIIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIllIIllIIIlI.init(lIIIllllIllII[8], lllllllllllllllIIIIIIllIIllIIIll);
            return new String(lllllllllllllllIIIIIIllIIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIllIIllIIIIl) {
            lllllllllllllllIIIIIIllIIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIlllIlIIl() {
        lIIIllllIlIll = new String[lIIIllllIllII[32]];
        b.lIIIllllIlIll[b.lIIIllllIllII[0]] = b.lIlIIlIlllIIllI("YVI4l4WsSm4=", "KayOX");
        b.lIIIllllIlIll[b.lIIIllllIllII[1]] = b.lIlIIlIlllIIllI("F6o23p1f+jXJ2JJ6am0wJw==", "fFezx");
        b.lIIIllllIlIll[b.lIIIllllIllII[8]] = b.lIlIIlIlllIIlll("X+UwIUI6TRxKh9WTEsdDQDT2nolViSNnDZQfexU79Sjpw1R6PBifMoJGBfiYI4G7LJzPz5mmEsY=", "tsdiy");
        b.lIIIllllIlIll[b.lIIIllllIllII[4]] = b.lIlIIlIlllIlIII("ITMtByccJmwaIQYuIwRmRm4=", "rGLjN");
        b.lIIIllllIlIll[b.lIIIllllIllII[7]] = b.lIlIIlIlllIIlll("1GXM1netUyfKPw3lLu/NCxBwNmSdqkpY", "aiudo");
        b.lIIIllllIlIll[b.lIIIllllIllII[25]] = b.lIlIIlIlllIIllI("l81qja676m0=", "gCnVy");
        b.lIIIllllIlIll[b.lIIIllllIllII[26]] = b.lIlIIlIlllIIllI("ksCk4QHQkGII5+Nr2xTWYA==", "RufaY");
        b.lIIIllllIlIll[b.lIIIllllIllII[13]] = b.lIlIIlIlllIIlll("2BB/EUqV67M=", "lSeGK");
        b.lIIIllllIlIll[b.lIIIllllIllII[28]] = b.lIlIIlIlllIlIII("KxQlFSw=", "hxJfI");
        b.lIIIllllIlIll[b.lIIIllllIllII[29]] = b.lIlIIlIlllIIlll("J+rors4TRYk=", "RQZPO");
        b.lIIIllllIlIll[b.lIIIllllIllII[3]] = b.lIlIIlIlllIlIII("BisjGhkZ", "qNBvm");
        b.lIIIllllIlIll[b.lIIIllllIllII[27]] = b.lIlIIlIlllIlIII("ByYINUEaKUYlBBQjEjpBXQ==", "uOfRa");
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
            "".length();
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
            List<Integer> lllllllllllllllIIIIIIllIlIIIlIII;
            Time.sleepTicks((int)lIIIllllIllII[8]);
            "".length();
            int lllllllllllllllIIIIIIllIlIIIIlll = lIIIllllIllII[0];
            while (b.lIlIIlIlllIlllI(lllllllllllllllIIIIIIllIlIIIIlll, lllllllllllllllIIIIIIllIlIIIlIII.size())) {
                int[] nArray = new int[lIIIllllIllII[1]];
                nArray[b.lIIIllllIllII[0]] = lllllllllllllllIIIIIIllIlIIIlIII.get(lllllllllllllllIIIIIIllIlIIIIlll);
                if (b.lIlIIlIllllIIll(Inventory.getCount((int[])nArray))) {
                    int lllllllllllllllIIIIIIllIlIIIIllI;
                    if (b.lIlIIlIlllIllII(GrandExchange.isSelling() ? 1 : 0)) {
                        int[] nArray2 = new int[lIIIllllIllII[1]];
                        nArray2[b.lIIIllllIllII[0]] = lllllllllllllllIIIIIIllIlIIIlIII.get(lllllllllllllllIIIIIIllIlIIIIlll);
                        GrandExchange.sell((int[])nArray2);
                        Time.sleepTicks((int)lIIIllllIllII[8]);
                        "".length();
                        lllllllllllllllIIIIIIllIlIIIIllI = lllllllllllllllIIIIIIllIlIIIIlll;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIllllIlII(GrandExchange.getItemId(), (Integer)lllllllllllllllIIIIIIllIlIIIlIII.get(lllllllllllllllIIIIIIllIlIIIIllI))) {
                                bl = lIIIllllIllII[1];
                                "".length();
                                if (null != null) {
                                    return ((0 + 73 - -140 + 3 ^ 54 + 83 - 117 + 114) & (0x52 ^ 0xC ^ (0x42 ^ 0xD) & ~(0x4B ^ 4) ^ -" ".length())) != 0;
                                }
                            } else {
                                bl = lIIIllllIllII[0];
                            }
                            return bl;
                        }, (int)lIIIllllIllII[23]);
                        "".length();
                    }
                    if (b.lIlIIlIlllIllIl(GrandExchange.isSelling() ? 1 : 0)) {
                        if (b.lIlIIlIllllIIlI(GrandExchange.getPrice(), lIIIllllIllII[24])) {
                            GrandExchange.setPrice((int)lIIIllllIllII[1]);
                            Time.sleepTicks((int)lIIIllllIllII[8]);
                            "".length();
                            lllllllllllllllIIIIIIllIlIIIIllI = lllllllllllllllIIIIIIllIlIIIIlll;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (b.lIlIIlIllllIlII(GrandExchange.getPrice(), lIIIllllIllII[1])) {
                                    bl = lIIIllllIllII[1];
                                    "".length();
                                    if ((0xB9 ^ 0xBD) < (0xAE ^ 0xAA)) {
                                        return ((0xC ^ 0x12) & ~(0xA9 ^ 0xB7)) != 0;
                                    }
                                } else {
                                    bl = lIIIllllIllII[0];
                                }
                                return bl;
                            }, (int)lIIIllllIllII[23]);
                            "".length();
                        }
                        if (b.lIlIIlIllllIlII(GrandExchange.getPrice(), lIIIllllIllII[1])) {
                            GrandExchange.confirm();
                            Time.sleepUntil(() -> GrandExchange.canCollect(), (int)lIIIllllIllII[23]);
                            "".length();
                        }
                    }
                    if (b.lIlIIlIlllIllIl(GrandExchange.canCollect() ? 1 : 0)) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (b.lIlIIlIlllIllII(GrandExchange.canCollect() ? 1 : 0)) {
                                bl = lIIIllllIllII[1];
                                "".length();
                                if (-"   ".length() >= 0) {
                                    return ((0x3F ^ 0x70) & ~(0x7F ^ 0x30)) != 0;
                                }
                            } else {
                                bl = lIIIllllIllII[0];
                            }
                            return bl;
                        }, (int)lIIIllllIllII[5]);
                        "".length();
                    }
                }
                ++lllllllllllllllIIIIIIllIlIIIIlll;
                "".length();
                if ("  ".length() >= 0) continue;
                return;
            }
        }
    }

    public static void a(int n2) {
        int lllllllllllllllIIIIIIllIIlllIllI;
        int n3;
        int lllllllllllllllIIIIIIllIIlllIlll;
        if (b.lIlIIlIlllIllII(GrandExchange.isBuying() ? 1 : 0)) {
            GrandExchange.createBuyOffer();
        }
        if (b.lIlIIlIlllIllIl(Static.getClient().isItemDefinitionCached(lllllllllllllllIIIIIIllIIlllIlll) ? 1 : 0)) {
            n3 = Static.getClient().getItemComposition(lllllllllllllllIIIIIIllIIlllIlll).getLinkedNoteId();
            "".length();
            if (((0xDA ^ 0x9E ^ (0xB4 ^ 0xB8)) & (0xF1 ^ 0xC3 ^ (0x39 ^ 0x43) ^ -" ".length())) != ((0 + 60 - -91 + 63 ^ 26 + 19 - 43 + 128) & (0x8A ^ 0x9B ^ (9 ^ 0x4C) ^ -" ".length()))) {
                return;
            }
        } else {
            n3 = lllllllllllllllIIIIIIllIIlllIllI = ((Integer)GameThread.invokeLater(() -> Static.getClient().getItemComposition(lllllllllllllllIIIIIIllIIlllIlll).getLinkedNoteId())).intValue();
        }
        if (!b.lIlIIlIllllIIlI(GrandExchange.getItemId(), lIIIllllIllII[24]) || b.lIlIIlIllllIIlI(GrandExchange.getItemId(), lllllllllllllllIIIIIIllIIlllIlll) && b.lIlIIlIllllIIlI(GrandExchange.getItemId(), lllllllllllllllIIIIIIllIIlllIllI)) {
            if (b.lIlIIlIlllIllII(GrandExchange.isSearchingItem() ? 1 : 0)) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem((int)lllllllllllllllIIIIIIllIIlllIlll);
        }
    }

    private static String lIlIIlIlllIIlll(String lllllllllllllllIIIIIIllIIlIlIIIl, String lllllllllllllllIIIIIIllIIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIllIIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), lIIIllllIllII[28]), "DES");
            Cipher lllllllllllllllIIIIIIllIIlIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIllIIlIlIlIl.init(lIIIllllIllII[8], lllllllllllllllIIIIIIllIIlIlIllI);
            return new String(lllllllllllllllIIIIIIllIIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIllIIlIlIlII) {
            lllllllllllllllIIIIIIllIIlIlIlII.printStackTrace();
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

