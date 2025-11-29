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
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.MovingToNextTileTask;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking Poison Cure", priority=8)
public class DrinkingPoisonCureTask
extends Task {
    
    private final  c P;
    
    private final  l O;
    private final  u R;
    private final  f Q;

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
            if (((34 + 61 - -33 + 49 ^ 14 + 23 - -50 + 67) & (0xD6 ^ 0xB3 ^ (2 ^ 0x4C) ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var13;
        if (!(this.O.B( != 0) ? 1 : 0) || (this.O.G( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var13.P.e( != null))) {
            return 0;
        }
        if ((var13.R.O( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Combat.isPoisoned( == 0) ? 1 : 0) && (Combat.isVenomed( == 0) ? 1 : 0)) {
            return 0;
        }
        Item var14 = Inventory.getFirst(item -> {
            int n2;
            if (!(item.getName( == 0).toLowerCase().contains(var1[2]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var1[3]) ? 1 : 0)) {
                n2 = 1;
                0;
                if (-1 == 1) {
                    return ((144 + 32 - 154 + 166 ^ 115 + 67 - 37 + 6) & (2 + 54 - 14 + 127 ^ 83 + 77 - 69 + 39 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var14 == null {
            return var13.O.a(var1[0]);
        }
        var1_1.interact(var1[1]);
        this.Q.r();
        return 1;
    }

    @Inject
    public DrinkingPoisonCureTask(l l2, c c2, f f2, u u2) {
        this.O = l2;
        this.P = c2;
        this.Q = f2;
        this.R = u2;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

}

