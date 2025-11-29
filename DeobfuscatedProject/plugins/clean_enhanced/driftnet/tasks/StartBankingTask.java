/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import gg.squire.driftnet.SquireDriftNetConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Start Banking", priority=0x7FFFFFFE, blocking=true)
public class StartBankingTask
extends Task {
    private final  SquireDriftNetConfig A;
    private final  SquireDriftNet y;
    
    private final  Client z;

    public boolean run() {
        f var3;
        if ((this.z.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.A.stamina( == 0))) {
            return 0;
        }
        Item var4 = Inventory.getFirst(item -> item.getName().contains(var1[1]));
        if var4 != null {
            return 0;
        }
        Game.logout();
        System.out.println(var1[0]);
        return 1;
    }

    @Inject
    public StartBankingTask(SquireDriftNet squireDriftNet, Client client, SquireDriftNetConfig squireDriftNetConfig) {
        this.y = squireDriftNet;
        this.z = client;
        this.A = squireDriftNetConfig;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }
}

