package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Trade;
@TaskDesc(name = "Trading")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.be  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/be.class */
public class C0032be extends Task {
    private static /* synthetic */ int[] lIlllllII;

    static {
        lIlIIlIIIll();
    }

    private static boolean lIlIIlIIlII(int i2) {
        return i2 != 0;
    }

    private static void lIlIIlIIIll() {
        lIlllllII = new int[1];
        lIlllllII[0] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean run() {
        if (lIlIIlIIlII(Trade.isOpen() ? 1 : 0)) {
            if (lIlIIlIIlII(Trade.isSecondScreenOpen() ? 1 : 0)) {
                Trade.acceptSecondScreen();
                return lIlllllII[0];
            }
            List<Item> all = Inventory.getAll((v0) -> {
                return v0.isTradable();
            });
            if (lIlIIlIIlII(all.isEmpty() ? 1 : 0)) {
                Trade.acceptFirstScreen();
                return lIlllllII[0];
            }
            for (Item item : all) {
                Trade.offer(item.getId(), item.getQuantity());
                "".length();
                if ("  ".length() == ((((53 + 0) - (-40)) + 85) ^ (((162 + 44) - 170) + 146))) {
                    return ((((149 + 64) - 80) + 61) ^ (((68 + 23) - 16) + 64)) & (((((73 + 99) - 45) + 109) ^ (((5 + 145) - 33) + 48)) ^ (-" ".length()));
                }
            }
        }
        return lIlllllII[0];
    }
}
