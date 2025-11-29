/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
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
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Leaving remains portal", priority=5, blocking=true)
public class LeavingRemainsPortalTask
extends RunecraftingTaskBase {

    @Inject
    public LeavingRemainsPortalTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        cArray[2] = c.FINISHING;
        cArray[3] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }

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

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        x var15;
        if (!(this.aV.g( != 0) ? 1 : 0) || (SquireGOTRPlugin.g.contains((Locatable == 0)Players.getLocal()) ? 1 : 0)) {
            return 1;
        }
        if ((Inventory.isFull( == 0) ? 1 : 0) && ((Object)var15.aV.m() != (Object)var15.aV.m()2)c.ACTIVATING)) {
            return 1;
        }
        TileObject var16 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[2]) ? 1 : 0) && (tileObject.hasAction(var1[3]::equals != 0) ? 1 : 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((138 + 178 - 130 + 8 ^ 45 + 124 - 109 + 81) & (128 + 223 - 345 + 228 ^ 51 + 66 - -44 + 4 ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var16 == null {
            return 1;
        }
        var1_1.interact(var1[1]);
        return 2;
    }

}

