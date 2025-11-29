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
import gg.squire.mining.tasks.GameEnum5;
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
        this.J = var1[0];
        this.I = squireMinerConfig;
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    static {
        w.var3();
    }

    private static boolean var4(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        w var5;
        if (w.var6((Object)this.I.activity(), (Object)a.AMETHYST)) {
            return var1[0];
        }
        if (w.var4((Object)var5.I.craft(), (Object)b.DISABLE)) {
            return var1[0];
        }
        if (w.var2(Inventory.isFull() ? 1 : 0)) {
            var5.J = var1[1];
            0;
            if (3 <= 1) {
                return ((0x68 ^ 6 ^ (0xC6 ^ 0xBD)) & (59 + 110 - 50 + 90 ^ 150 + 172 - 301 + 175 ^ -1)) != 0;
            }
        } else {
            int[] nArray = new int[var1[1]];
            nArray[w.var1[0]] = var1[2];
            if (w.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
                var5.J = var1[0];
            }
        }
        if (w.var7(var5.J)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[w.var1[0]] = var1[3];
        Item var8 = Inventory.getFirst((int[])nArray);
        if (w.var9(var8)) {
            return var1[0];
        }
        if (w.var2(Players.getLocal().isAnimating() ? 1 : 0)) {
            var5.sleep(Rand.nextInt((int)var1[4], (int)var1[5]));
            return var1[1];
        }
        if (w.var2(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)(var5.I.craft().ordinal() + var1[1]));
            var5.sleep(var1[6]);
            return var1[1];
        }
        int[] nArray2 = new int[var1[1]];
        nArray2[w.var1[0]] = var1[2];
        Item item = Inventory.getFirst((int[])nArray2);
        var1_1.useOn(item);
        return var1[1];
    }

    private static void var3() {
        var1 = new int[7];
        w.var1[0] = (0x34 ^ 0x2D) & ~(0x33 ^ 0x2A);
        w.var1[1] = 1;
        w.var1[2] = 0xFFFFF7FF & 0x5B63;
        w.var1[3] = 0xFFFFEFDB & 0x16FF;
        w.var1[4] = 135 + 40 - 65 + 34 ^ 50 + 27 - 50 + 122;
        w.var1[5] = 0xDB ^ 0x99 ^ (0xF8 ^ 0xB2);
        w.var1[6] = 2;
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static boolean var6(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var9(Object object) {
        return object == null;
    }
}

