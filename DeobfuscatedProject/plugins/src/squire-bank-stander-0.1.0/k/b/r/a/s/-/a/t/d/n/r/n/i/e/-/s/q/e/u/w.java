/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Making wines")
public class w
extends a {
    private static /* synthetic */ int[] lllIlIIllII;

    private static boolean lIlIllllIllIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        w.lIlIllllIllIlI();
    }

    private static boolean lIlIllllIlllII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean h() {
        if (w.lIlIllllIllIll(Players.getLocal().getAnimation(), lllIlIIllII[3])) {
            return lllIlIIllII[4];
        }
        if (w.lIlIllllIlllII(Production.isOpen() ? 1 : 0)) {
            w llllllllllllllllIIlIIlIlllIIllII;
            Production.choosePreviousOption();
            llllllllllllllllIIlIIlIlllIIllII.sleep(llllllllllllllllIIlIIlIlllIIllII.i());
            return lllIlIIllII[1];
        }
        int[] nArray = new int[lllIlIIllII[1]];
        nArray[w.lllIlIIllII[4]] = lllIlIIllII[0];
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lllIlIIllII[1]];
        nArray2[w.lllIlIIllII[4]] = lllIlIIllII[2];
        Item item2 = Inventory.getFirst((int[])nArray2);
        item.useOn(item2);
        return lllIlIIllII[1];
    }

    @Override
    public int i() {
        return lllIlIIllII[5];
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIlIIllII[0], lllIlIIllII[1], lllIlIIllII[2], lllIlIIllII[1]);
    }

    @Inject
    public w(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.WINES);
    }

    private static void lIlIllllIllIlI() {
        lllIlIIllII = new int[6];
        w.lllIlIIllII[0] = -(0xFFFFE7BF & 0x784D) & (0xFFFFF7EF & 0x6FDF);
        w.lllIlIIllII[1] = " ".length();
        w.lllIlIIllII[2] = -(0xFFFFF59B & 0x5A6D) & (0xFFFFDFBD & 0x77DB);
        w.lllIlIIllII[3] = -(0xFFFFCA77 & 0x379F) & (0xFFFFFF7F & 0x1FFF);
        w.lllIlIIllII[4] = (234 + 133 - 352 + 230 ^ 98 + 67 - 109 + 122) & (0x36 ^ 0x64 ^ (0x89 ^ 0x9C) ^ -" ".length());
        w.lllIlIIllII[5] = "   ".length();
    }
}

