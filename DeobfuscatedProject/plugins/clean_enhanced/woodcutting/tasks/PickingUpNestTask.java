/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.woodcutting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Picking up nest", priority=500, blocking=true)
public class PickingUpNestTask
extends Task {

    private final  SquireWoodcutterPlugin C;
    private final  SquireWoodcutterConfig D;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < llllllllllllllIllIIllIlIIlIIlIll2) {
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

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        f var13;
        if ((this.D.pickUpNest( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var13.C.b( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        TileItem var14 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(var2[2]));
        if var14 == null {
            return 0;
        }
        if ((Players.getLocal().distanceTo((Locatable)var14) >= Players.getLocal().distanceTo((Locatable)var14)2)) {
            return 0;
        }
        if ((Players.getLocal( != 0).isMoving() ? 1 : 0)) {
            return 2;
        }
        var1_1.interact(var2[0]);
        return 2;
    }

    @Inject
    public PickingUpNestTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.C = squireWoodcutterPlugin;
        this.D = squireWoodcutterConfig;
    }

}

