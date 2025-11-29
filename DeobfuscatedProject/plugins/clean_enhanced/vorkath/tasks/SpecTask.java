/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Spec", priority=11)
public class SpecTask
extends VorkathManager {

    @Inject
    protected SpecTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean Q() {
        B var9;
        if ((this.cg.c0 == null)) {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 2;
        if ((Projectiles.getNearest((int[] != nunArray))) {
            return 1;
        }
        if ((var9.cg.y( != 0) ? 1 : 0)) {
            return 1;
        }
        if (!(Combat.isSpecEnabled( == 0) ? 1 : 0) || (Combat.getSpecEnergy() < 3)) {
            return 1;
        }
        if ((var9.cg.x() < 4)) {
            return 1;
        }
        int[] nArray2 = new int[5];
        nArray2[1] = 6;
        nArray2[0] = 7;
        Item var10 = Inventory.getFirst((int[])nArray2);
        if var10 != null {
            if ((Inventory.isFull( != 0) ? 1 : 0)) {
                var9.ch.K();
                return 0;
            }
            var10.interact(var1[1]);
        }
        Combat.toggleSpec();
        return 0;
    }

}

