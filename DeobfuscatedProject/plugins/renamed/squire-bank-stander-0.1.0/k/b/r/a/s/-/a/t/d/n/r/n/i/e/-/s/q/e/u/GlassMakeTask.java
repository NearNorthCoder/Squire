/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a_Unknown;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.BEnum;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Glass Make -> GlassmakeTask */
@TaskDesc(name="Glass Make")
public class GlassMakeTask
extends a_Unknown {
    private static /* synthetic */ int[] lllIIIIIlIl;

    @Inject
    public B(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.GLASS_MAKE);
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.seaweed().N(), this.j.seaweed().O(), lllIIIIIlIl[0], this.j.seaweed().P());
    }

    private static boolean lIlIllIIIlIlIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean h() {
        if (B.lIlIllIIIlIlII(this.i.d() ? 1 : 0)) {
            return lllIIIIIlIl[1];
        }
        int[] nArray = new int[lllIIIIIlIl[2]];
        nArray[B.lllIIIIIlIl[1]] = lllIIIIIlIl[3];
        if (B.lIlIllIIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            Bank.open();
            0;
            return lllIIIIIlIl[2];
        }
        if (B.lIlIllIIIlIlII(Magic.canCast((Spell)SpellBook.Lunar.SUPERGLASS_MAKE) ? 1 : 0) && B.lIlIllIIIlIlIl(Bank.isOpen() ? 1 : 0)) {
            B var1;
            Magic.cast((Spell)SpellBook.Lunar.SUPERGLASS_MAKE);
            var1.sleep(var1.i());
            return lllIIIIIlIl[2];
        }
        Bank.open();
        0;
        return lllIIIIIlIl[2];
    }

    static {
        B.lIlIllIIIlIIll();
    }

    @Override
    public int i() {
        return lllIIIIIlIl[4];
    }

    private static void lIlIllIIIlIIll() {
        lllIIIIIlIl = new int[5];
        B.lllIIIIIlIl[0] = 0xFFFF8EFF & 0x77F7;
        B.lllIIIIIlIl[1] = (0xC7 ^ 0x89) & ~(0xC0 ^ 0x8E);
        B.lllIIIIIlIl[2] = 1;
        B.lllIIIIIlIl[3] = -(0xFFFFEF03 & 0x59FD) & (0xFFFFCFFF & 0x7FEF);
        B.lllIIIIIlIl[4] = 3;
    }

    private static boolean lIlIllIIIlIlII(int n2) {
        return n2 != 0;
    }
}

