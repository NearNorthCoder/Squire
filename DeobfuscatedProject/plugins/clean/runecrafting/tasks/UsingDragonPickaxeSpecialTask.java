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

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;

@TaskDesc(name="Using dragon pickaxe special", priority=13, blocking=true)
public class UsingDragonPickaxeSpecialTask
extends RunecraftingTaskBase {

    private static boolean llllllIlllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llllllIllIllll(int n2) {
        return n2 == 0;
    }

    @Override
    protected boolean aj() {
        return llIIllIlllII[0];
    }

    @Inject
    public UsingDragonPickaxeSpecialTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllIlllII[0]];
        cArray[i.llIIllIlllII[1]] = c.COUNTDOWN;
        super(squireGOTRPlugin, cArray);
    }

    @Override
    protected boolean ak() {
        if (!i.llllllIllIllll(Combat.isSpecEnabled() ? 1 : 0) || i.llllllIlllIIII(Combat.getSpecEnergy(), llIIllIlllII[2])) {
            return llIIllIlllII[1];
        }
        int[] nArray = new int[llIIllIlllII[3]];
        nArray[i.llIIllIlllII[1]] = llIIllIlllII[4];
        nArray[i.llIIllIlllII[0]] = llIIllIlllII[5];
        nArray[i.llIIllIlllII[6]] = llIIllIlllII[7];
        nArray[i.llIIllIlllII[8]] = llIIllIlllII[9];
        if (i.llllllIllIllll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return llIIllIlllII[1];
        }
        Combat.toggleSpec();
        return llIIllIlllII[0];
    }

    static {
        i.llllllIllIlllI();
    }
}

