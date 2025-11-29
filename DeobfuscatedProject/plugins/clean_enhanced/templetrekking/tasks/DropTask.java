/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drop task")
public class DropTask
extends Task {
    
    private final  TempleTrekkingPlugin H;

    private static void var3() {
        var1 = new String[var2[1]];
        m.var1[m.var2[0]] = "Logs";
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    static {
        m.var5();
        m.var3();
    }

    @Inject
    public DropTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        this.H = templeTrekkingPlugin;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var2 = new int[4];
        m.var2[0] = (0x2C ^ 0x12 ^ 74 + 121 - 83 + 15) & (0x2C ^ 8 ^ (0x1D ^ 0x78) ^ -1);
        m.var2[1] = 1;
        m.var2[2] = 0xB3 ^ 0xB4 ^ (0x36 ^ 0x39);
        m.var2[3] = 2;
    }

    public boolean run() {
        if (m.var4(Inventory.isFull() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[m.var2[0]] = var1[var2[0]];
        return Inventory.dropAll((String[])stringArray);
    }
}

