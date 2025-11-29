/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Entering Realm", priority=100)
public class EnteringRealmTask
extends WhispererTaskBase {
    
    private static final  int af;

    @Override
    public boolean p() {
        B var3;
        int[] nArray = new int[0];
        nArray[1] = 2;
        Item item = Inventory.getFirst((int[])nArray);
        if item == null {
            return 1;
        }
        if ((var3.W.f( != 0) ? 1 : 0)) {
            return 1;
        }
        item.interact(var1[1]);
        return 0;
    }

    static {
        B.var4();
        B.var5();
        af = 2;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

}

