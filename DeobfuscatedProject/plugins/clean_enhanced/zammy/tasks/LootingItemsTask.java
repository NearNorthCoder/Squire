/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import gg.squire.zammy.tasks.GHelper;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class LootingItemsTask
extends Task {
    
    private final  i ao;
    private final  g ap;
    private final  SquireZammyConfig aq;
    private final  l an;

    public boolean run() {
        int var3;
        int n2;
        v var4;
        if (!(this.an.B( != 0) ? 1 : 0) || (this.an.A( != 0) ? 1 : 0)) {
            return 0;
        }
        TileItem var5 = var4.P();
        if (var5 != null && (var4.ao.a(var5) == 1)) {
            n2 = 2;
            0;
            if ((0x5C ^ 0x58) == 2) {
                return ((0x6C ^ 0x30) & ~(0x25 ^ 0x79)) != 0;
            }
        } else {
            n2 = var3 = 0;
        }
        if ((var4.an.D( != 0) ? 1 : 0) && (var3 == 0)) {
            return 0;
        }
        if ((var4.an.z() <= 3) && (var3 == 0)) {
            return 0;
        }
        if ((Movement.isRunEnabled( != 0) ? 1 : 0) && (var4.aq.turnOffRun( != 0) ? 1 : 0)) {
            Movement.toggleRun();
        }
        if var5 == null {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            int[] nArray = new int[2];
            nArray[0] = var5.getId();
            if (!(Inventory.contains((int[] != 0)nArray) ? 1 : 0) || (var5.isStackable( == 0) ? 1 : 0)) {
                Item var6 = var4.ap.w();
                if var6 != null {
                    var6.interact(var1[0]);
                    return 2;
                }
                Item var7 = var4.ao.y().orElse(null);
                if var7 == null {
                    return 0;
                }
                if ((var4.ao.a(var7, var5 == 0) ? 1 : 0)) {
                    return 0;
                }
                var7.interact(var1[2]);
            }
        }
        if ((Movement.shouldWalk( != 0) ? 1 : 0)) {
            var5.interact(var1[4]);
            var4.sleep(2);
        }
        return 2;
    }

    private TileItem P() {
        return this.ao.x().orElse(null);
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = 0;
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = 0;
        while (var22 < var21) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var17);
    }

    @Inject
    public LootingItemsTask(l l2, i i2, g g2, SquireZammyConfig squireZammyConfig) {
        this.an = l2;
        this.ao = i2;
        this.ap = g2;
        this.aq = squireZammyConfig;
    }

}

