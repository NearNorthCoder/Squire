/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.scurrius.tasks.ScurriusManager;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Eating food", priority=10000)
public class EatingFoodTask
extends ScurriusManager {

    private static boolean var3(Object object) {
        return object == null;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    protected EatingFoodTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }

    private static void var10() {
        var1 = new int[4];
        q.var1[0] = (0xD0 ^ 0x84) & ~(0xF7 ^ 0xA3);
        q.var1[1] = 1;
        q.var1[2] = 3;
        q.var1[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a() {
        void var1_1;
        if (q.var11(Combat.getCurrentHealth(), this.b.eatAt())) {
            return var1[0];
        }
        Item var12 = Inventory.getFirst(item -> {
            String[] stringArray = new String[var1[1]];
            stringArray[q.var1[0]] = var2[var1[3]];
            return item.hasAction(stringArray);
        });
        if (q.var3(var12)) {
            q var13;
            Log.error((String)var2[var1[0]]);
            var13.a.e(var1[1]);
            return var1[0];
        }
        var1_1.interact(var2[var1[1]]);
        this.sleep(var1[2]);
        return var1[1];
    }

    private static void var14() {
        var2 = new String[var1[2]];
        q.var2[q.var1[0]] = "No food";
        q.var2[q.var1[1]] = "Eat";
        q.var2[q.var1[3]] = "Eat";
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[0];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[0];
        while (q.var24(var23, var22)) {
            char var25 = var21[var23];
            var18.append((char)(var25 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (((164 + 160 - 286 + 155 ^ 70 + 98 - 98 + 86) & (149 + 117 - 82 + 20 ^ 106 + 20 - 34 + 53 ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }

    static {
        q.var10();
        q.var14();
    }
}

