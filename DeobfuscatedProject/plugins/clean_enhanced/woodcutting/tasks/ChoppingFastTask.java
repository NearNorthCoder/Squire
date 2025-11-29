/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.woodcutting.tasks.GameEnum;

@TaskDesc(name="Chopping (fast)", priority=75, register=true)
public class ChoppingFastTask
extends Task {

    private final  SquireWoodcutterConfig K;
    private final  SquireWoodcutterPlugin L;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public ChoppingFastTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.L = squireWoodcutterPlugin;
        this.K = squireWoodcutterConfig;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        TileObject var15;
        k var16;
        if ((this.K.fastTickChop( == 0) ? 1 : 0)) {
            return 0;
        }
        if (!(Bank.isOpen( == 0) ? 1 : 0) || (Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var16.L.p( != 0) ? 1 : 0)) {
            return 0;
        }
        if (!(Movement.getRunEnergy() > Movement.getRunEnergy()2) || (Movement.isRunEnabled( == 0) ? 1 : 0)) {
            return 0;
        }
        Player var17 = Players.getLocal();
        if var17 == null {
            return 0;
        }
        WorldArea[] worldAreaArray = new WorldArea[2];
        worldAreaArray[0] = var16.L.j();
        if ((var17.getWorldLocation( != 0).isInArea(worldAreaArray) ? 1 : 0) && (Movement.isRunEnabled( == 0) ? 1 : 0)) {
            Movement.toggleRun();
        }
        if ((var15 = TileObjects.getNearest(tileObject -> {
            int n;
            if ((tileObject.getName( != 0 == null).equals(this.K.tree().r() + " tree") ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var2[1];
                if ((tileObject.hasActionstringArray)) {
                    n = 2;
                    0;
                    if (-(3 ^ 0x54 ^ (0x3E ^ 0x6D)) < 0) return n != 0;
                    return ((156 + 13 - 92 + 117 ^ 3 + 69 - 24 + 82) & (0x74 ^ 0x1D ^ (0x5C ^ 0x75) ^ -1)) != 0;
                }
            }
            n = 0;
            return n != 0;
        }))) {
            return 0;
        }
        i var18 = i.b(var15);
        if ((Object == nullllllllllllllllIllIIllIlIlIIlIllI)) {
            Log.info((String)var2[0]);
            return 0;
        }
        if ((var16.L.q() >= var16.L.q()2) && (var16.K.bank( == 0) ? 1 : 0) && (var15.distanceTo((Locatable)var17) <= var15.distanceTo((Locatable)var17)2)) && (var17.isMoving( == 0) ? 1 : 0) && (Inventory.contains(item -> item.getName( != 0).contains(this.K.tree().r())) ? 1 : 0)) {
            Log.info((String)var2[2]);
            var15.interact(var2[4]);
            return 2;
        }
        if ((var15.distanceTo((Locatable)var17) >= var15.distanceTo((Locatable)var17)2))) {
            return 0;
        }
        if ((var16.L.b( != 0) ? 1 : 0)) {
            var15.interact(var2[5]);
            var16.sleep(2);
            return 2;
        }
        return 0;
    }
}

