/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping Items", priority=20, blocking=true)
public class EquippingItemsTask
extends Task {
    private final  SquireQuestHelper fO;
    private static  int[] llllIIII;
    private static  String[] lllIllll;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 0;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 0;
        while (var15 < var14) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (((0x5A ^ 0x4D) & ~(0x29 ^ 0x3E)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var17;
        List<Integer> list = this.fO.cF();
        if ((list.isEmpty( != 0) ? 1 : 0)) {
            return 0;
        }
        List var18 = Inventory.getAll(arg_0 -> bm.a((List)var17, arg_0));
        if ((var18.isEmpty( != 0) ? 1 : 0)) {
            return 0;
        }
        var2_2.forEach(item -> {
            String[] stringArray = new String[2];
            stringArray[0] = lllIllll[0];
            stringArray[1] = lllIllll[1];
            stringArray[3] = lllIllll[3];
            item.interact(stringArray);
        });
        return 1;
    }

    private static  boolean a(List list, Item item) {
        return list.contains(item.getId());
    }

    @Inject
    public EquippingItemsTask(SquireQuestHelper squireQuestHelper) {
        this.fO = squireQuestHelper;
    }
}

