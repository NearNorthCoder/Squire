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
package k.p.n.s.r.a.-.q.e.l.r.e.i.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Casting plank make -> CastingplankmakeTask */
@TaskDesc(name="Casting plank make")
public class f
extends Task {
    private static /* synthetic */ int[] lllllIllIlll;
    private final /* synthetic */ SquirePlankerConfig p;

    private static boolean lIIlIIlllIlIIlI(int n) {
        return n == 0;
    }

    @Inject
    public f(SquirePlankerConfig squirePlankerConfig) {
        this.p = squirePlankerConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        f var2;
        if (f.lIIlIIlllIlIIlI(this.p.spell() ? 1 : 0)) {
            return lllllIllIlll[0];
        }
        int[] nArray = new int[lllllIllIlll[1]];
        nArray[f.lllllIllIlll[0]] = var2.p.plank().d();
        Item var1 = Inventory.getFirst((int[])nArray);
        if (f.lIIlIIlllIlIIll(var1)) {
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

    private static void lIIlIIlllIlIIIl() {
        lllllIllIlll = new int[3];
        f.lllllIllIlll[0] = (0x68 ^ 0xB) & ~(0xC4 ^ 0xA7);
        f.lllllIllIlll[1] = 1;
        f.lllllIllIlll[2] = 2;
    }

    private static boolean lIIlIIlllIlIIll(Object object) {
        return object == null;
    }

    static {
        f.lIIlIIlllIlIIIl();
    }
}

