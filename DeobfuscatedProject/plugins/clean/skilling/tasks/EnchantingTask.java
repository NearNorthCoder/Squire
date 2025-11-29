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
import gg.squire.skilling.tasks.SkillingTaskBase;
import gg.squire.skilling.tasks.GameEnum9;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;

@TaskDesc(name="Enchanting")
public class EnchantingTask
extends SkillingTaskBase {

    @Override
    public int i() {
        return lllIlIIIIIl[0];
    }

    @Inject
    public EnchantingTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.ENCHANTING);
    }

    static {
        M.lIlIlllIlllIII();
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.enchantingProduct().z(), lllIlIIIIIl[0], lllIlIIIIIl[1], lllIlIIIIIl[0]);
    }

    private static boolean lIlIlllIlllIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean h() {
        int[] nArray = new int[lllIlIIIIIl[0]];
        nArray[M.lllIlIIIIIl[2]] = this.j.enchantingProduct().z();
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lllIlIIIIIl[0]];
        nArray2[M.lllIlIIIIIl[2]] = lllIlIIIIIl[1];
        Item item2 = Inventory.getFirst((int[])nArray2);
        if (!M.lIlIlllIlllIIl(item) || M.lIlIlllIlllIlI(item2)) {
            return lllIlIIIIIl[2];
        }
        int[] nArray3 = new int[lllIlIIIIIl[0]];
        nArray3[M.lllIlIIIIIl[2]] = this.j.enchantingProduct().z();
        Magic.cast((Spell)this.j.enchantingProduct().F(), (Item)Inventory.getFirst((int[])nArray3));
        return lllIlIIIIIl[0];
    }

    private static boolean lIlIlllIlllIlI(Object object) {
        return object == null;
    }
}

