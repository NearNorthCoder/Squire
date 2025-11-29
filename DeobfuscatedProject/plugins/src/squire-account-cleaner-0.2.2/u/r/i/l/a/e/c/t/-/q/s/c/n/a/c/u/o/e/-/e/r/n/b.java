/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package u.r.i.l.a.e.c.t.-.q.s.c.n.a.c.u.o.e.-.e.r.n;

import com.google.inject.Inject;
import gg.squire.cleaner.SquireAccountCleanerConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Selling")
public class b
extends Task {
    private static /* synthetic */ int[] lIlIlIIIlIl;
    private final /* synthetic */ SquireAccountCleanerConfig e;

    public boolean run() {
        if (b.lIIlIIIlIIIIlI(Bank.isOpen() ? 1 : 0) && b.lIIlIIIlIIIIll(Inventory.isFull() ? 1 : 0)) {
            return lIlIlIIIlIl[0];
        }
        if (b.lIIlIIIlIIIIll(Inventory.contains(item -> {
            boolean bl;
            if (b.lIIlIIIlIIIlIl(item.getId(), lIlIlIIIlIl[3])) {
                bl = lIlIlIIIlIl[1];
                "".length();
                if (null != null) {
                    return ((24 + 68 - 48 + 117 ^ 152 + 176 - 207 + 71) & (0xC6 ^ 0xA8 ^ (0xC9 ^ 0xC6) ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIlIIIlIl[0];
            }
            return bl;
        }) ? 1 : 0)) {
            return lIlIlIIIlIl[0];
        }
        if (b.lIIlIIIlIIIIlI(Inventory.isFull() ? 1 : 0) && b.lIIlIIIlIIIIlI(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
        }
        if (b.lIIlIIIlIIIIll(GrandExchange.isOpen() ? 1 : 0)) {
            GrandExchange.open();
        }
        if (b.lIIlIIIlIIIIlI(GrandExchange.canCollect() ? 1 : 0) && b.lIIlIIIlIIIIll(GrandExchange.getEmptySlots())) {
            GrandExchange.collect((boolean)lIlIlIIIlIl[1]);
            return lIlIlIIIlIl[0];
        }
        List llllllllllllllllIlIlllIlIlIlllII = Inventory.getAll(item -> {
            boolean bl;
            if (b.lIIlIIIlIIIlIl(item.getId(), lIlIlIIIlIl[3])) {
                bl = lIlIlIIIlIl[1];
                "".length();
                if ("   ".length() == 0) {
                    return ((77 + 55 - 68 + 84 ^ 164 + 61 - 85 + 29) & (138 + 79 - 204 + 162 ^ 118 + 128 - 182 + 82 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIlIlIIIlIl[0];
            }
            return bl;
        });
        int llllllllllllllllIlIlllIlIlIllIll = lIlIlIIIlIl[0];
        Iterator llllllllllllllllIlIlllIlIlIllIlI = llllllllllllllllIlIlllIlIlIlllII.iterator();
        while (b.lIIlIIIlIIIIlI(llllllllllllllllIlIlllIlIlIllIlI.hasNext() ? 1 : 0)) {
            Item llllllllllllllllIlIlllIlIlIllIIl = (Item)llllllllllllllllIlIlllIlIlIllIlI.next();
            if (b.lIIlIIIlIIIlII(llllllllllllllllIlIlllIlIlIllIll, lIlIlIIIlIl[2])) {
                "".length();
                if (" ".length() >= 0) break;
                return ((0xD6 ^ 0x91 ^ (0xDB ^ 0x84)) & (67 + 116 - 108 + 77 ^ 19 + 70 - 85 + 124 ^ -" ".length())) != 0;
            }
            ++llllllllllllllllIlIlllIlIlIllIll;
            if (b.lIIlIIIlIIIIll(GrandExchange.isSelling() ? 1 : 0)) {
                int[] nArray = new int[lIlIlIIIlIl[1]];
                nArray[b.lIlIlIIIlIl[0]] = llllllllllllllllIlIlllIlIlIllIIl.getId();
                GrandExchange.sell((int[])nArray);
                "".length();
                if (((0x84 ^ 0xAF ^ (0x85 ^ 0x9A)) & (0x64 ^ 0x1C ^ (0xCA ^ 0x86) ^ -" ".length())) == 0) break;
                return ((58 + 58 - 87 + 140 ^ 145 + 39 - 134 + 99) & (0 + 38 - -93 + 49 ^ 98 + 123 - 134 + 49 ^ -" ".length())) != 0;
            }
            if (b.lIIlIIIlIIIIlI(GrandExchange.isSelling() ? 1 : 0)) {
                b llllllllllllllllIlIlllIlIlIlllIl;
                int llllllllllllllllIlIlllIlIlIllIII = (int)((double)Prices.getItemPrice((int)llllllllllllllllIlIlllIlIlIllIIl.getId()) * 0.01 * (double)llllllllllllllllIlIlllIlIlIlllIl.e.sellPercent());
                int llllllllllllllllIlIlllIlIlIlIlll = Prices.getItemPrice((int)llllllllllllllllIlIlllIlIlIllIIl.getId()) - llllllllllllllllIlIlllIlIlIllIII;
                GrandExchange.setPrice((int)llllllllllllllllIlIlllIlIlIlIlll);
                GrandExchange.confirm();
                "".length();
                if (((73 + 59 - 80 + 115 ^ 149 + 49 - 154 + 129) & (142 + 45 - 136 + 131 ^ 171 + 36 - 106 + 87 ^ -" ".length())) == 0) break;
                return ((0x90 ^ 0x9F ^ (0x88 ^ 0xC5)) & (0xB8 ^ 0xB7 ^ (0x39 ^ 0x74) ^ -" ".length())) != 0;
            }
            "".length();
            if (-" ".length() >= -" ".length()) continue;
            return ((9 ^ 0x4C) & ~(0x5F ^ 0x1A)) != 0;
        }
        return lIlIlIIIlIl[1];
    }

    private static boolean lIIlIIIlIIIIll(int n) {
        return n == 0;
    }

    @Inject
    public b(SquireAccountCleanerConfig squireAccountCleanerConfig) {
        this.e = squireAccountCleanerConfig;
    }

    private int b(Item item) {
        String string = Static.getClient().getItemDefinition(item.getId()).getName().toLowerCase();
        int n = Prices.getItemPrice((int)item.getId()) * item.getQuantity();
        return n;
    }

    private static boolean lIIlIIIlIIIlII(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlIIIlIIIlIl(int n, int n2) {
        return n != n2;
    }

    static {
        b.lIIlIIIlIIIIIl();
    }

    private static boolean lIIlIIIlIIIIlI(int n) {
        return n != 0;
    }

    private static void lIIlIIIlIIIIIl() {
        lIlIlIIIlIl = new int[4];
        b.lIlIlIIIlIl[0] = (0x81 ^ 0xAF ^ "   ".length()) & (56 + 188 - 239 + 227 ^ 48 + 37 - 56 + 168 ^ -" ".length());
        b.lIlIlIIIlIl[1] = " ".length();
        b.lIlIlIIIlIl[2] = 0x4D ^ 0x35 ^ (0xB1 ^ 0xC1);
        b.lIlIlIIIlIl[3] = 0xFFFFBBF7 & 0x47EB;
    }
}

