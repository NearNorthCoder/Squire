/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum4;
import gg.squire.zulrah.tasks.GameEnum2;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Teleporting out", priority=1)
public class TeleportingOutTask
extends ag {

    @Inject
    protected TeleportingOutTask(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    @Override
    public boolean ac() {
        int var3;
        int n2;
        ai var4;
        if ((this.E.e( == 0) ? 1 : 0)) {
            return 0;
        }
        int var5 = Inventory.getCount(item -> {
            String[] stringArray = new String[1];
            stringArray[0] = var2[0];
            return item.hasAction(stringArray);
        });
        if (!(Inventory.contains(item -> item.getName( == 0).startsWith(this.aC.cure().k())) ? 1 : 0) || ((Object)var4.aC.cure() == (Object)var4.aC.cure()2)o.IGNORE)) {
            n2 = 1;
            0;
            if (-(0x52 ^ 0x57) >= 0) {
                return ((0xB0 ^ 0x94) & ~(0x95 ^ 0xB1)) != 0;
            }
        } else {
            n2 = var3 = 0;
        }
        if ((var5 >= var4.aC.multiple()) && (var4.aC.multiple( != 0)) && var3) {
            return 0;
        }
        var4.E.a(1);
        b var6 = var4.aC.bankTeleportItem();
        Item var7 = Inventory.getFirst(item -> item.getName().startsWith(var6.k()));
        if var7 != null {
            var6.l().accept(var7);
            return 1;
        }
        return this.aC.bankLocation().f().getAsBoolean();
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }
}

