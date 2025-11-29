/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Casting plank make")
public class CastingPlankMakeTask
extends Task {
    
    private final  SquirePlankerConfig p;

    private static boolean var2(int n) {
        return n == 0;
    }

    @Inject
    public CastingPlankMakeTask(SquirePlankerConfig squirePlankerConfig) {
        this.p = squirePlankerConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        f var3;
        if (f.var2(this.p.spell() ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[f.var1[0]] = var3.p.plank().d();
        Item var4 = Inventory.getFirst((int[])nArray);
        if (f.var5(var4)) {
            return var1[0];
        }
        SpellBook.Lunar var6 = SpellBook.Lunar.PLANK_MAKE;
        if (f.var2(var6.canCast() ? 1 : 0)) {
            return var1[0];
        }
        Magic.cast((Spevar2_2, (Item)var1_1);
        this.sleep(var1[2]);
        return var1[1];
    }

    private static void var7() {
        var1 = new int[3];
        f.var1[0] = (0x68 ^ 0xB) & ~(0xC4 ^ 0xA7);
        f.var1[1] = 1;
        f.var1[2] = 2;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    static {
        f.var7();
    }
}

