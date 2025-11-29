/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.woodcutting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.woodcutting.tasks.GameEnum;
import gg.squire.woodcutting.tasks.TrackingTheTreeTask;

@TaskDesc(name="Moving to next tree", priority=100)
public class MovingToNextTreeTask
extends Task {
    
    private final  SquireWoodcutterConfig J;
    
    private final  SquireWoodcutterPlugin I;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public MovingToNextTreeTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.I = squireWoodcutterPlugin;
        this.J = squireWoodcutterConfig;
    }

    public boolean run() {
        j var9;
        if ((this.J.fastTickChop( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var9.I.p( != 0) ? 1 : 0)) {
            return 0;
        }
        Player var10 = Players.getLocal();
        if var10 == null {
            return 0;
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Movement.getRunEnergy() >= Movement.getRunEnergy()2) && (Movement.isRunEnabled( == 0) ? 1 : 0)) {
            Movement.toggleRun();
            return 2;
        }
        if ((var9.I.MovingToNextTreeTask( == 0).contains((Locatable)var10) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var9.I.MovingToNextTreeTask().getCenter(), (boolean)0);
            0;
            return 2;
        }
        TileObject var11 = TileObjects.getNearest(tileObject -> {
            int n;
            if ((tileObject.getName( != 0).equals(this.J.tree().r() + " tree") ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var1[2];
                if ((tileObject.hasActionstringArray)) {
                    n = 2;
                    0;
                    if (-2 < 0) return n != 0;
                    return ((0xDC ^ 0x8B ^ (0x18 ^ 0x6C)) & (2 ^ (0x39 ^ 0x18) ^ -1)) != 0;
                }
            }
            n = 0;
            return n != 0;
        });
        if var11 == null {
            i var12 = l.x();
            if ((Object != nullllllllllllllllIllIIllIIllllIllII)) {
                Movement.setDestination((WorldPoint)var12.w().getNearest());
                return 2;
            }
            return 0;
        }
        if ((var9.J.bank( == 0) ? 1 : 0)) {
            int[] nArray = new int[2];
            nArray[0] = 3;
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                int[] nArray2 = new int[2];
                nArray2[0] = 3;
                Inventory.dropAll((int[])nArray2);
                0;
            }
        }
        if ((var11.distanceTo((Locatable)var10) >= var11.distanceTo((Locatable)var10)2))) {
            var11.interact(var1[0]);
            return 2;
        }
        return 0;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

}

