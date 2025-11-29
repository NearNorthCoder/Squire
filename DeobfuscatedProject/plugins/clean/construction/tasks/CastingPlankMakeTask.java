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

    private static boolean lIIlIIlllIlIIlI(int n) {
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
        f var1;
        if (f.lIIlIIlllIlIIlI(this.p.spell() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        int[] nArray = new int[lllllIllIlll[1]];
        nArray[f.lllllIllIlll[0]] = var1.p.plank().d();
        Item var2 = Inventory.getFirst((int[])nArray);
        if (f.lIIlIIlllIlIIll(var2)) {
            return lllllIllIlll[0];
        }
        SpellBook.Lunar var3 = SpellBook.Lunar.PLANK_MAKE;
        if (f.lIIlIIlllIlIIlI(var3.canCast() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        Magic.cast((Spell)var2_2, (Item)var1_1);
        this.sleep(lllllIllIlll[2]);
        return lllllIllIlll[1];
    }

    private static boolean lIIlIIlllIlIIll(Object object) {
        return object == null;
    }

    static {
        f.lIIlIIlllIlIIIl();
    }
}

