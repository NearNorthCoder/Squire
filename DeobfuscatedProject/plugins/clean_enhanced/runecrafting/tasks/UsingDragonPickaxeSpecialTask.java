/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;

@TaskDesc(name="Using dragon pickaxe special", priority=13, blocking=true)
public class UsingDragonPickaxeSpecialTask
extends RunecraftingTaskBase {

    @Override
    protected boolean aj() {
        return 0;
    }

    @Inject
    public UsingDragonPickaxeSpecialTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.COUNTDOWN;
        super(squireGOTRPlugin, cArray);
    }

    @Override
    protected boolean ak() {
        if (!(Combat.isSpecEnabled( == 0) ? 1 : 0) || (Combat.getSpecEnergy() != 2)) {
            return 1;
        }
        int[] nArray = new int[3];
        nArray[1] = 4;
        nArray[0] = 5;
        nArray[6] = 7;
        nArray[8] = 9;
        if ((Equipment.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 1;
        }
        Combat.toggleSpec();
        return 0;
    }

    static {
        i.var2();
    }
}

