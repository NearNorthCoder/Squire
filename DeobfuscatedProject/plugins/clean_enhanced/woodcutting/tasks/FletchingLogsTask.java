/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package gg.squire.woodcutting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Fletching Logs", priority=10)
public class FletchingLogsTask
extends Task {
    
    private final  SquireWoodcutterConfig B;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var1_1;
        if ((this.B.cutLogs( == 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 0;
        }
        if ((Inventory.isFull( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Players.getLocal( != 0).isAnimating() ? 1 : 0)) {
            return 1;
        }
        if ((Tabs.isOpen((Tab == 0)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
            return 1;
        }
        Item var3 = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(var2[0]));
        if var3 == null {
            return 0;
        }
        int[] nArray2 = new int[1];
        nArray2[0] = 2;
        Item var4 = Inventory.getFirst((int[])nArray2);
        if ((Production.isOpen( != 0) ? 1 : 0)) {
            e var5;
            Production.choosePreviousOption();
            var5.sleep(3);
            return 1;
        }
        var1_1.useOn((Item)var2_2);
        this.sleep(4);
        return 1;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Inject
    public FletchingLogsTask(SquireWoodcutterConfig squireWoodcutterConfig) {
        this.B = squireWoodcutterConfig;
    }
}

