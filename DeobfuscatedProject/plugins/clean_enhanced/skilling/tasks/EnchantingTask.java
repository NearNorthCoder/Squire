/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 */
package gg.squire.skilling.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;

@TaskDesc(name="Enchanting")
public class EnchantingTask
extends SkillingManager {

    @Override
    public int i() {
        return var1[0];
    }

    @Inject
    public EnchantingTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.ENCHANTING);
    }

    private static void var2() {
        var1 = new int[3];
        M.var1[0] = 1;
        M.var1[1] = -(0xFFFFABE3 & 0x755F) & (0xFFFFEB77 & 0x37FE);
        M.var1[2] = (0xD ^ 0x59) & ~(0x46 ^ 0x12);
    }

    static {
        M.var2();
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.enchantingProduct().z(), var1[0], var1[1], var1[0]);
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    @Override
    public boolean h() {
        int[] nArray = new int[var1[0]];
        nArray[M.var1[2]] = this.j.enchantingProduct().z();
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[var1[0]];
        nArray2[M.var1[2]] = var1[1];
        Item item2 = Inventory.getFirst((int[])nArray2);
        if (!M.var3(item) || M.var4(item2)) {
            return var1[2];
        }
        int[] nArray3 = new int[var1[0]];
        nArray3[M.var1[2]] = this.j.enchantingProduct().z();
        Magic.cast((Spethis.j.enchantingProduct().F(), (Item)Inventory.getFirst((int[])nArray3));
        return var1[0];
    }

    private static boolean var4(Object object) {
        return object == null;
    }
}

