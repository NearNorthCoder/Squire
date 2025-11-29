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
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Glass Make")
public class GlassMakeTask
extends SkillingManager {

    @Inject
    public GlassMakeTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.GLASS_MAKE);
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.seaweed().N(), this.j.seaweed().O(), var1[0], this.j.seaweed().P());
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean h() {
        if (B.var3(this.i.d() ? 1 : 0)) {
            return var1[1];
        }
        int[] nArray = new int[var1[2]];
        nArray[B.var1[1]] = var1[3];
        if (B.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
            Bank.open();
            0;
            return var1[2];
        }
        if (B.var3(Magic.canCast((SpeSpellBook.Lunar.SUPERGLASS_MAKE) ? 1 : 0) && B.var2(Bank.isOpen() ? 1 : 0)) {
            B var4;
            Magic.cast((SpeSpellBook.Lunar.SUPERGLASS_MAKE);
            var4.sleep(var4.i());
            return var1[2];
        }
        Bank.open();
        0;
        return var1[2];
    }

    static {
        B.var5();
    }

    @Override
    public int i() {
        return var1[4];
    }

    private static void var5() {
        var1 = new int[5];
        B.var1[0] = 0xFFFF8EFF & 0x77F7;
        B.var1[1] = (0xC7 ^ 0x89) & ~(0xC0 ^ 0x8E);
        B.var1[2] = 1;
        B.var1[3] = -(0xFFFFEF03 & 0x59FD) & (0xFFFFCFFF & 0x7FEF);
        B.var1[4] = 3;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }
}

