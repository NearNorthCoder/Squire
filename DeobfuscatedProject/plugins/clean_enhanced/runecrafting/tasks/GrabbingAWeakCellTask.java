/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Grabbing a weak cell", priority=14, blocking=true)
public class GrabbingAWeakCellTask
extends RunecraftingTaskBase {

    private static boolean var3(Object object) {
        return object == null;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    static {
        k.var11();
        k.var12();
    }

    @Override
    protected boolean ak() {
        k var13;
        if (!k.var3(this.aV.e()) || k.var10(Inventory.isFull() ? 1 : 0)) {
            return var2[1];
        }
        if (k.var10(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return var2[1];
        }
        GameObject var14 = var13.aV.z();
        if (k.var15(var14) && k.var10(Reachable.isInteractable((Locatable)var14) ? 1 : 0)) {
            var14.interact(var1[var2[1]]);
            return var2[0];
        }
        return var2[1];
    }

    private static void var12() {
        var1 = new String[var2[0]];
        k.var1[k.var2[1]] = "Take";
    }

    @Inject
    public GrabbingAWeakCellTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[var2[0]];
        cArray[k.var2[1]] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean var15(Object object) {
        return object != null;
    }

    private static void var11() {
        var2 = new int[3];
        k.var2[0] = 1;
        k.var2[1] = (0x21 ^ 4) & ~(0x8B ^ 0xAE);
        k.var2[2] = 2;
    }
}

