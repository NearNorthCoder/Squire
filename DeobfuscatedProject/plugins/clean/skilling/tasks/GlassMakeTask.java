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
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingTaskBase;
import gg.squire.skilling.tasks.GameEnum9;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Glass Make")
public class GlassMakeTask
extends SkillingTaskBase {

    @Inject
    public GlassMakeTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
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

            return lllIIIIIlIl[2];
        }
        if (B.lIlIllIIIlIlII(Magic.canCast((Spell)SpellBook.Lunar.SUPERGLASS_MAKE) ? 1 : 0) && B.lIlIllIIIlIlIl(Bank.isOpen() ? 1 : 0)) {
            B var1;
            Magic.cast((Spell)SpellBook.Lunar.SUPERGLASS_MAKE);
            var1.sleep(var1.i());
            return lllIIIIIlIl[2];
        }
        Bank.open();

        return lllIIIIIlIl[2];
    }

    static {
        B.lIlIllIIIlIIll();
    }

    @Override
    public int i() {
        return lllIIIIIlIl[4];
    }

    private static boolean lIlIllIIIlIlII(int n2) {
        return n2 != 0;
    }
}

