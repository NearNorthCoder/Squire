/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.g;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Making bolts")
public class G
extends a {
    private static /* synthetic */ int[] lllIIlIlIll;
    private final /* synthetic */ int[] v;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        G llllllllllllllllIIlIlIIIIIlllIll;
        g g2 = this.j.bolt();
        int[] nArray = new int[lllIIlIlIll[3]];
        nArray[G.lllIIlIlIll[1]] = g2.y();
        Item item = Inventory.getFirst((int[])nArray);
        if (G.lIlIlllIIIIIII(item)) {
            return lllIIlIlIll[1];
        }
        Item llllllllllllllllIIlIlIIIIIlllIII = Inventory.getFirst((int[])llllllllllllllllIIlIlIIIIIlllIll.v);
        if (G.lIlIlllIIIIIII(llllllllllllllllIIlIlIIIIIlllIII)) {
            return lllIIlIlIll[1];
        }
        int llllllllllllllllIIlIlIIIIIllIlll = lllIIlIlIll[1];
        while (G.lIlIlllIIIIIIl(llllllllllllllllIIlIlIIIIIllIlll, lllIIlIlIll[6])) {
            void llllllllllllllllIIlIlIIIIIlllIIl;
            llllllllllllllllIIlIlIIIIIlllIII.useOn((Item)llllllllllllllllIIlIlIIIIIlllIIl);
            ++llllllllllllllllIIlIlIIIIIllIlll;
            "".length();
            if ((0x2A ^ 0x2E) >= 0) continue;
            return ((0x28 ^ 0x4A) & ~(0x39 ^ 0x5B)) != 0;
        }
        return lllIIlIlIll[3];
    }

    private static boolean lIlIlllIIIIIII(Object object) {
        return object == null;
    }

    @Inject
    public G(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.BOLTS);
        int[] nArray = new int[lllIIlIlIll[0]];
        nArray[G.lllIIlIlIll[1]] = lllIIlIlIll[2];
        nArray[G.lllIIlIlIll[3]] = lllIIlIlIll[4];
        this.v = nArray;
    }

    static {
        G.lIlIllIlllllll();
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlIlIll[2], lllIIlIlIll[5], this.j.bolt().y(), lllIIlIlIll[5]);
    }

    private static boolean lIlIlllIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIlllllll() {
        lllIIlIlIll = new int[7];
        G.lllIIlIlIll[0] = "  ".length();
        G.lllIIlIlIll[1] = (0xE0 ^ 0xB1) & ~(0xFA ^ 0xAB);
        G.lllIIlIlIll[2] = -(0xFFFFF4A7 & 0x6FDA) & (0xFFFFFDBB & 0x67FF);
        G.lllIIlIlIll[3] = " ".length();
        G.lllIIlIlIll[4] = -(0xFFFFEB95 & 0x546B) & (0xFFFFF76A & 0x6FFD);
        G.lllIIlIlIll[5] = 0xF5 ^ 0x80 ^ 3 + 33 - -64 + 27;
        G.lllIIlIlIll[6] = 0x84 ^ 0x8C;
    }

    @Override
    public int i() {
        return lllIIlIlIll[1];
    }
}

