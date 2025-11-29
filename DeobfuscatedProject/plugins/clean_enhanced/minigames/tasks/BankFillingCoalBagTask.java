/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank$Inventory
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Bank filling coal bag")
public class BankFillingCoalBagTask
extends MinigamesTaskBase<v> {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(v v2, o o2) {
        void var3;
        Item item = Bank.Inventory.getFirst((int[])v2.I());
        if item == null {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        if ((var3.hasActionstringArray)) {
            var3.interact(var2[1]);
            return 0;
        }
        item.interact(var2[2]);
        o2.k().u();
        return 1;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    public BankFillingCoalBagTask(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, MinigamesManager.class, string -> string.toLowerCase().contains(var2[3]));
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

}

