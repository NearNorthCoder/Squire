/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Depositing runes", priority=2, blocking=true, register=true)
public class DepositingRunesTask
extends RunecraftingTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public DepositingRunesTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.COUNTDOWN;
        cArray[2] = c.ACTIVATING;
        cArray[3] = c.ACTIVE;
        cArray[4] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    @Override
    protected boolean aj() {
        return 2;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean ak() {
        t var15;
        if ((this.aW.depositRunes( == 0) ? 1 : 0)) {
            return 1;
        }
        if ((Inventory.contains(item -> {
            int n2;
            if ((item.isStackable( != 0 == 0) ? 1 : 0) && (item.getName( != 0).contains(var1[2]) ? 1 : 0)) {
                n2 = 2;
                0;
                if (((0x4C ^ 2) & ~(0x23 ^ 0x6D)) < 0) {
                    return ((0xBE ^ 0x8E) & ~(6 ^ 0x36)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return 1;
        }
        if ((SquireGOTRPlugin.g.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            return 1;
        }
        int[] nArray = new int[2];
        nArray[1] = 5;
        TileObject var16 = TileObjects.getNearest((int[])nArray);
        if (!var16 != null || (var16.distanceTo((Locatable)Players.getLocal()) > 6)) {
            return 1;
        }
        if ((var15.b((GameObject == 0)var16) ? 1 : 0)) {
            var16.interact(var1[1]);
        }
        return 2;
    }

}

