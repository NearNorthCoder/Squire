/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.GameEnum4;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Crafting a guardian", priority=10, blocking=true)
public class CraftingAGuardianTask
extends RunecraftingTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var3_3;
        GameObject var9;
        GameObject gameObject;
        m var10;
        block15: {
            block14: {
                if (!(this.aV.g( != 0) ? 1 : 0) || !(this.aW.craftGuardian( != 0) ? 1 : 0)) break block14;
                int[] nArray = new int[2];
                nArray[1] = 3;
                if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0) && !(SquireGOTRPlugin.g.contains(LocatablePlayers.getLocal()) ? 1 : 0)) break block15;
            }
            return 1;
        }
        if ((SquireGOTRPlugin.g.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            return 1;
        }
        Item var11 = var10.aV.e();
        if var11 == null {
            return 1;
        }
        if ((var11.getId() != 4)) {
            return 1;
        }
        if ((var10.aV.O( == 0) ? 1 : 0)) {
            return 1;
        }
        d var12 = var10.aV.h();
        if ((Object == nulllllllllllllllllIlIIlIlllIlIIlllI)) {
            return 1;
        }
        if ((var12.Z( != 0) ? 1 : 0)) {
            gameObject = var10.aV.A();
            0;
            if (1 >= 3) {
                return ((0x79 ^ 0x57) & ~(0x51 ^ 0x7F)) != 0;
            }
        } else {
            gameObject = var10.aV.B();
        }
        if (var9 = gameObject == null) {
            return 1;
        }
        if ((var9.distanceTo((Locatable)Players.getLocal()) <= 5) && (Players.getLocal( != 0).isAnimating() ? 1 : 0)) {
            return 2;
        }
        var3_3.interact(var1[1]);
        return 2;
    }

    @Inject
    public CraftingAGuardianTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        cArray[2] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

}

