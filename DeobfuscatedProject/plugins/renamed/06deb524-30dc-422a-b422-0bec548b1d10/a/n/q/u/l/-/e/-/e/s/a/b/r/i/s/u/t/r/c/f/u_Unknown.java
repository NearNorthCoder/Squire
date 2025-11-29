/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;

public class u_Unknown
extends w {
    private final /* synthetic */ int[] au;
    private static /* synthetic */ int[] lIIlllIIIllI;

    @Override
    public boolean c(o o2) {
        Item item = Bank.getFirst((int[])this.au);
        if (u.llIlIIIIIIlIll(item)) {
            return lIIlllIIIllI[0];
        }
        Bank.withdrawAll((int)item.getId(), (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
        return lIIlllIIIllI[1];
    }

    public u(String string, int ... nArray) {
        super(string);
        this.au = nArray;
    }

    private static boolean llIlIIIIIIlIll(Object object) {
        return object == null;
    }

    public int[] I() {
        return this.au;
    }

    static {
        u.llIlIIIIIIlIlI();
    }

    private static void llIlIIIIIIlIlI() {
        lIIlllIIIllI = new int[2];
        u.lIIlllIIIllI[0] = (0x71 ^ 0x23) & ~(0x7A ^ 0x28);
        u.lIIlllIIIllI[1] = 1;
    }
}

