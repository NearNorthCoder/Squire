/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a_Unknown;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.BEnum;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.LEnum;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

/* TASK: Cutting stuff -> CuttingstuffTask */
@TaskDesc(name="Cutting stuff")
public class CuttingStuffTask
extends a_Unknown {
    private static /* synthetic */ int[] lllIIllIIIl;

    @Override
    public Map<Integer, Integer> g() {
        if (H.lIlIlllIIlIlIl((Object)this.j.fletchingProduct(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.LEnum.ARROW_SHAFT)) {
            return Map.of(lllIIllIIIl[0], lllIIllIIIl[1], this.j.arrowShaftLogs().M(), lllIIllIIIl[1]);
        }
        return Map.of(lllIIllIIIl[0], lllIIllIIIl[1], this.j.fletchingProduct().z(), lllIIllIIIl[1]);
    }

    @Inject
    public H(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.FLETCH_CUTTING);
    }

    @Override
    public int i() {
        return lllIIllIIIl[3];
    }

    private static void lIlIlllIIlIlII() {
        lllIIllIIIl = new int[4];
        H.lllIIllIIIl[0] = 0xFFFFFBB3 & 0x7FE;
        H.lllIIllIIIl[1] = 1;
        H.lllIIllIIIl[2] = (0x6C ^ 0x49) & ~(0x81 ^ 0xA4);
        H.lllIIllIIIl[3] = 21 + 33 - 22 + 98 ^ 24 + 79 - 13 + 44;
    }

    @Override
    public boolean h() {
        int n2;
        H var1;
        if (H.lIlIlllIIlIllI(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)this.j.fletchingProduct().C());
            this.sleep(this.i());
            return lllIIllIIIl[1];
        }
        int[] nArray = new int[lllIIllIIIl[1]];
        int n3 = lllIIllIIIl[2];
        if (H.lIlIlllIIlIlIl((Object)var1.j.fletchingProduct(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.LEnum.ARROW_SHAFT)) {
            n2 = var1.j.arrowShaftLogs().M();
            0;
            if (((0x36 ^ 0x2A) & ~(0x8D ^ 0x91)) < 0) {
                return false;
            }
        } else {
            n2 = var1.j.fletchingProduct().z();
        }
        nArray[n3] = n2;
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lllIIllIIIl[1]];
        nArray2[H.lllIIllIIIl[2]] = lllIIllIIIl[0];
        item.useOn(Inventory.getFirst((int[])nArray2));
        return lllIIllIIIl[1];
    }

    private static boolean lIlIlllIIlIllI(int n2) {
        return n2 != 0;
    }

    static {
        H.lIlIlllIIlIlII();
    }

    private static boolean lIlIlllIIlIlIl(Object object, Object object2) {
        return object == object2;
    }
}

