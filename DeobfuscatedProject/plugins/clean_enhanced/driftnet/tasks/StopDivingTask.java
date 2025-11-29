/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.driftnet.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;

@TaskDesc(name="Stop Diving", priority=40, blocking=true)
public class StopDivingTask
extends Task {
    private final  SquireDriftNet Q;
    private final  Client R;
    private  Player r;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        j var15;
        if ((this.R.isInInstancedRegion( != 0) ? 1 : 0)) {
            return 0;
        }
        var15.r = Players.getLocal();
        if (!(var15.r != null) || (var15.r.getPlane() != var15.r.getPlane()2)) {
            return 0;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var1[0];
        TileObject var16 = TileObjects.getNearest((String[])stringArray);
        if (var16 != null && (Equipment.fromSlot(EquipmentInventorySlot != nullEquipmentInventorySlot.WEAPON))) {
            var16.interact(var1[1]);
            return 1;
        }
        return 0;
    }

    @Inject
    public StopDivingTask(SquireDriftNet squireDriftNet, Client client) {
        this.Q = squireDriftNet;
        this.R = client;
    }

}

