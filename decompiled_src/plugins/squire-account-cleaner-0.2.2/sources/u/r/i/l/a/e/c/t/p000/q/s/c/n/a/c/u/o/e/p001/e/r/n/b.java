package u.r.i.l.a.e.c.t.p000.q.s.c.n.a.c.u.o.e.p001.e.r.n;

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
@TaskDesc(name = "Selling")
/* renamed from: u.r.i.l.a.e.c.t.-.q.s.c.n.a.c.u.o.e.-.e.r.n.b  reason: invalid package */
/* loaded from: squire-account-cleaner-0.2.2.jar:u/r/i/l/a/e/c/t/-/q/s/c/n/a/c/u/o/e/-/e/r/n/b.class */
public class b extends Task {
    private static /* synthetic */ int[] lIlIlIIIlIl;
    private final /* synthetic */ SquireAccountCleanerConfig e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public boolean run() {
        if ((!lIIlIIIlIIIIlI(Bank.isOpen() ? 1 : 0) || !lIIlIIIlIIIIll(Inventory.isFull() ? 1 : 0)) && !lIIlIIIlIIIIll(Inventory.contains(item -> {
            if (lIIlIIIlIIIlIl(item.getId(), lIlIlIIIlIl[3])) {
                ?? r0 = lIlIlIIIlIl[1];
                "".length();
                return 0 != 0 ? ((((24 + 68) - 48) + 117) ^ (((152 + 176) - 207) + 71)) & (((198 ^ 168) ^ (201 ^ 198)) ^ (-" ".length())) : r0;
            }
            return lIlIlIIIlIl[0];
        }) ? 1 : 0)) {
            if (lIIlIIIlIIIIlI(Inventory.isFull() ? 1 : 0) && lIIlIIIlIIIIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIIlIIIlIIIIll(GrandExchange.isOpen() ? 1 : 0)) {
                GrandExchange.open();
            }
            if (lIIlIIIlIIIIlI(GrandExchange.canCollect() ? 1 : 0) && lIIlIIIlIIIIll(GrandExchange.getEmptySlots())) {
                GrandExchange.collect((boolean) lIlIlIIIlIl[1]);
                return lIlIlIIIlIl[0];
            }
            List all = Inventory.getAll(item2 -> {
                if (lIIlIIIlIIIlIl(item2.getId(), lIlIlIIIlIl[3])) {
                    ?? r0 = lIlIlIIIlIl[1];
                    "".length();
                    return "   ".length() == 0 ? ((((77 + 55) - 68) + 84) ^ (((164 + 61) - 85) + 29)) & (((((138 + 79) - 204) + 162) ^ (((118 + 128) - 182) + 82)) ^ (-" ".length())) : r0;
                }
                return lIlIlIIIlIl[0];
            });
            int i = lIlIlIIIlIl[0];
            Iterator it = all.iterator();
            do {
                if (lIIlIIIlIIIIlI(it.hasNext() ? 1 : 0)) {
                    Item item3 = (Item) it.next();
                    if (lIIlIIIlIIIlII(i, lIlIlIIIlIl[2])) {
                        "".length();
                        if (" ".length() < 0) {
                            return ((214 ^ 145) ^ (219 ^ 132)) & (((((67 + 116) - 108) + 77) ^ (((19 + 70) - 85) + 124)) ^ (-" ".length()));
                        }
                    } else {
                        i++;
                        if (lIIlIIIlIIIIll(GrandExchange.isSelling() ? 1 : 0)) {
                            int[] iArr = new int[lIlIlIIIlIl[1]];
                            iArr[lIlIlIIIlIl[0]] = item3.getId();
                            GrandExchange.sell(iArr);
                            "".length();
                            if ((((132 ^ 175) ^ (133 ^ 154)) & (((100 ^ 28) ^ (202 ^ 134)) ^ (-" ".length()))) != 0) {
                                return ((((58 + 58) - 87) + 140) ^ (((145 + 39) - 134) + 99)) & (((((0 + 38) - (-93)) + 49) ^ (((98 + 123) - 134) + 49)) ^ (-" ".length()));
                            }
                        } else if (lIIlIIIlIIIIlI(GrandExchange.isSelling() ? 1 : 0)) {
                            GrandExchange.setPrice(Prices.getItemPrice(item3.getId()) - ((int) ((Prices.getItemPrice(item3.getId()) * 0.01d) * this.e.sellPercent())));
                            GrandExchange.confirm();
                            "".length();
                            if ((((((73 + 59) - 80) + 115) ^ (((149 + 49) - 154) + 129)) & (((((142 + 45) - 136) + 131) ^ (((171 + 36) - 106) + 87)) ^ (-" ".length()))) != 0) {
                                return ((144 ^ 159) ^ (136 ^ 197)) & (((184 ^ 183) ^ (57 ^ 116)) ^ (-" ".length()));
                            }
                        } else {
                            "".length();
                        }
                    }
                }
                return lIlIlIIIlIl[1];
            } while ((-" ".length()) >= (-" ".length()));
            return (true ^ true) & ((true ^ true) ^ true);
        }
        return lIlIlIIIlIl[0];
    }

    private static boolean lIIlIIIlIIIIll(int i) {
        return i == 0;
    }

    @Inject
    public b(SquireAccountCleanerConfig squireAccountCleanerConfig) {
        this.e = squireAccountCleanerConfig;
    }

    private int b(Item item) {
        Static.getClient().getItemDefinition(item.getId()).getName().toLowerCase();
        return Prices.getItemPrice(item.getId()) * item.getQuantity();
    }

    private static boolean lIIlIIIlIIIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIIlIIIlIl(int i, int i2) {
        return i != i2;
    }

    static {
        lIIlIIIlIIIIIl();
    }

    private static boolean lIIlIIIlIIIIlI(int i) {
        return i != 0;
    }

    private static void lIIlIIIlIIIIIl() {
        lIlIlIIIlIl = new int[4];
        lIlIlIIIlIl[0] = ((129 ^ 175) ^ "   ".length()) & (((((56 + 188) - 239) + 227) ^ (((48 + 37) - 56) + 168)) ^ (-" ".length()));
        lIlIlIIIlIl[1] = " ".length();
        lIlIlIIIlIl[2] = (77 ^ 53) ^ (177 ^ 193);
        lIlIlIIIlIl[3] = (-17417) & 18411;
    }
}
