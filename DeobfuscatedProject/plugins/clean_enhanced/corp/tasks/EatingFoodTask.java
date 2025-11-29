/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.corp.tasks.CorpManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=100, blocking=true)
public class EatingFoodTask
extends CorpTaskBase {
    
    @Inject
    private  s a;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0xBC ^ 0x89 ^ (0x80 ^ 0x8A)) & (0x88 ^ 0xC4 ^ (0xFB ^ 0x88) ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        g var13;
        if ((this.a.u() != 0)) {
            return 1;
        }
        Item var14 = Inventory.getFirst(item -> {
            String[] stringArray = new String[2];
            stringArray[1] = var2[2];
            return item.hasAction(stringArray);
        });
        if var14 == null {
            return 1;
        }
        if ((Combat.getCurrentHealth() > var13.o.eatAt())) {
            return 1;
        }
        var1_1.interact(var2[1]);
        return 2;
    }

}

