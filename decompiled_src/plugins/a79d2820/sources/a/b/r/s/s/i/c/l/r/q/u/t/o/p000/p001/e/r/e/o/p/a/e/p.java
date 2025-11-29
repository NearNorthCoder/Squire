package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Looting item", priority = 100, blocking = true)
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.p  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/p.class */
public class p extends a {
    private static /* synthetic */ String[] lIllIIIIIIlI;
    private static /* synthetic */ int[] lIllIIIIIIll;

    private static void lllIIIllIllIIl() {
        lIllIIIIIIll = new int[3];
        lIllIIIIIIll[0] = (24 ^ 91) & ((115 ^ 48) ^ (-1));
        lIllIIIIIIll[1] = " ".length();
        lIllIIIIIIll[2] = "  ".length();
    }

    static {
        lllIIIllIllIIl();
        lllIIIllIllIII();
    }

    private static boolean lllIIIllIllIll(Object obj) {
        return obj == null;
    }

    private static void lllIIIllIllIII() {
        lIllIIIIIIlI = new String[lIllIIIIIIll[2]];
        lIllIIIIIIlI[lIllIIIIIIll[0]] = lllIIIllIlIlll("DAIXHA==", "HpxlC");
        lIllIIIIIIlI[lIllIIIIIIll[1]] = lllIIIllIlIlll("JRs8NQ==", "qzWPc");
    }

    private static String lllIIIllIlIlll(String lllllllllllllllIllIIIlIlIllIIIll, String lllllllllllllllIllIIIlIlIllIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlIlIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIlIlIllIIIlI.toCharArray();
        int lllllllllllllllIllIIIlIlIlIlllll = lIllIIIIIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIIIIll[0];
        while (lllIIIllIllllI(i, length)) {
            char lllllllllllllllIllIIIlIlIllIIlII = charArray2[i];
            sb.append((char) (lllllllllllllllIllIIIlIlIllIIlII ^ charArray[lllllllllllllllIllIIIlIlIlIlllll % charArray.length]));
            "".length();
            lllllllllllllllIllIIIlIlIlIlllll++;
            i++;
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean run() {
        if (lllIIIllIllIlI(g() ? 1 : 0)) {
            return lIllIIIIIIll[0];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (lllIIIllIlllIl(tileItem.getQuantity() * Prices.getItemPrice(tileItem.getId()), this.o.lootThreshold()) && lllIIIllIlllII(Reachable.isInteractable(tileItem) ? 1 : 0)) {
                ?? r0 = lIllIIIIIIll[1];
                "".length();
                return (-" ".length()) > "  ".length() ? ((28 ^ 91) ^ (54 ^ 45)) & (((((203 + 180) - 255) + 117) ^ (((33 + 25) - 49) + 160)) ^ (-" ".length())) : r0;
            }
            return lIllIIIIIIll[0];
        });
        if (lllIIIllIllIll(nearest)) {
            return lIllIIIIIIll[0];
        }
        if (lllIIIllIlllII(Inventory.isFull() ? 1 : 0)) {
            Item item = (Item) Inventory.getAll((v0) -> {
                return v0.isTradable();
            }).stream().min(Comparator.comparingInt(item2 -> {
                return item2.getQuantity() * Prices.getItemPrice(item2.getId());
            })).orElse(null);
            if (!lllIIIllIllIll(item) && !lllIIIllIlllIl(Prices.getItemPrice(item.getId()) * item.getQuantity(), Prices.getItemPrice(nearest.getId()) * nearest.getQuantity())) {
                item.interact(lIllIIIIIIlI[lIllIIIIIIll[0]]);
            }
            return lIllIIIIIIll[0];
        }
        nearest.interact(lIllIIIIIIlI[lIllIIIIIIll[1]]);
        return lIllIIIIIIll[1];
    }

    private static boolean lllIIIllIllIlI(int i) {
        return i == 0;
    }

    private static boolean lllIIIllIlllII(int i) {
        return i != 0;
    }

    private static boolean lllIIIllIlllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIIIllIllllI(int i, int i2) {
        return i < i2;
    }
}
