/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.MovingToNextTileTask;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=8)
public class EatingFoodTask
extends Task {
    private final  SquireZammyConfig aa;
    
    private final  u Z;
    private final  c X;
    private final  f Y;
    
    private final  l W;

    @Inject
    public EatingFoodTask(l l2, c c2, f f2, u u2, SquireZammyConfig squireZammyConfig) {
        this.W = l2;
        this.X = c2;
        this.Y = f2;
        this.Z = u2;
        this.aa = squireZammyConfig;
    }

    private boolean N() {
        return 0;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var19;
        if (!(this.W.B( != 0) ? 1 : 0) || (this.W.G( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var19.W.A( != 0) ? 1 : 0) && (var19.X.e( != null))) {
            return 0;
        }
        if (!(Combat.getCurrentHealth() <= var19.aa.eatFoodAt()) || (var19.Y.t( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var19.Z.O( != 0) ? 1 : 0) && (var19.W.A( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var19.W.D( != 0) ? 1 : 0) && (var19.W.A( == 0) ? 1 : 0) && (Combat.getCurrentHealth() > 1)) {
            return 0;
        }
        Item var20 = Inventory.getFirst(item -> {
            int n2;
            if ((item.getName( == 0).equals(var1[3]) ? 1 : 0) && (item.hasAction(var1[4]::equals != 0) ? 1 : 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((2 ^ 0x26 ^ (0xFA ^ 0x97)) & (0x6F ^ 0xC ^ (0xAB ^ 0x81) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var20 == null {
            String[] stringArray = new String[2];
            stringArray[0] = var1[0];
            var20 = Inventory.getFirst((String[])stringArray);
        }
        if var20 == null {
            return var19.N();
        }
        var1_1.interact(var1[2]);
        this.Y.s();
        return 2;
    }
}

