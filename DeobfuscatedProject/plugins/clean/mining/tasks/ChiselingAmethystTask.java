/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.GameEnum29;
import gg.squire.mining.tasks.GameEnum;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Chiseling amethyst", priority=10, blocking=true)
public class ChiselingAmethystTask
extends Task {
    private  boolean J;
    
    private final  SquireMinerConfig I;

    @Inject
    public ChiselingAmethystTask(SquireMinerConfig squireMinerConfig) {
        this.J = lllllIlIIllI[0];
        this.I = squireMinerConfig;
    }

    private static boolean lIIlIIllIlIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        w.lIIlIIllIIllllI();
    }

    private static boolean lIIlIIllIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        w var1;
        if (w.lIIlIIllIIlllll((Object)this.I.activity(), (Object)a.AMETHYST)) {
            return lllllIlIIllI[0];
        }
        if (w.lIIlIIllIlIIIII((Object)var1.I.craft(), (Object)b.DISABLE)) {
            return lllllIlIIllI[0];
        }
        if (w.lIIlIIllIlIIIIl(Inventory.isFull() ? 1 : 0)) {
            var1.J = lllllIlIIllI[1];

            if (3 <= 1) {
                return ((0x68 ^ 6 ^ (0xC6 ^ 0xBD)) & (59 + 110 - 50 + 90 ^ 150 + 172 - 301 + 175 ^ -1)) != 0;
            }
        } else {
            int[] nArray = new int[lllllIlIIllI[1]];
            nArray[w.lllllIlIIllI[0]] = lllllIlIIllI[2];
            if (w.lIIlIIllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                var1.J = lllllIlIIllI[0];
            }
        }
        if (w.lIIlIIllIlIIIlI(var1.J ? 1 : 0)) {
            return lllllIlIIllI[0];
        }
        int[] nArray = new int[lllllIlIIllI[1]];
        nArray[w.lllllIlIIllI[0]] = lllllIlIIllI[3];
        Item var2 = Inventory.getFirst((int[])nArray);
        if (w.lIIlIIllIlIIIll(var2)) {
            return lllllIlIIllI[0];
        }
        if (w.lIIlIIllIlIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            var1.sleep(Rand.nextInt((int)lllllIlIIllI[4], (int)lllllIlIIllI[5]));
            return lllllIlIIllI[1];
        }
        if (w.lIIlIIllIlIIIIl(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)(var1.I.craft().ordinal() + lllllIlIIllI[1]));
            var1.sleep(lllllIlIIllI[6]);
            return lllllIlIIllI[1];
        }
        int[] nArray2 = new int[lllllIlIIllI[1]];
        nArray2[w.lllllIlIIllI[0]] = lllllIlIIllI[2];
        Item item = Inventory.getFirst((int[])nArray2);
        var1_1.useOn(item);
        return lllllIlIIllI[1];
    }

    private static boolean lIIlIIllIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIllIIlllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIllIlIIIll(Object object) {
        return object == null;
    }
}

