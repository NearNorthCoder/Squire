/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Performing dig task")
public class PerformingDigTask
extends Task {
    @Inject
    private  SquireQuestHelper fG;
    private static  int[] lIllllI;
    private static  String[] lIlllIl;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        bl var1;
        String string = this.fG.cz();
        if (bl.lIllllIIl(string.equals(lIlllIl[lIllllI[0]]) ? 1 : 0)) {
            return lIllllI[0];
        }
        WorldPoint var2 = var1.fG.cA();
        if (bl.lIllllIlI(var2)) {
            return lIllllI[0];
        }
        if (bl.lIllllIIl(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var2);
            0;
            return lIllllI[1];
        }
        int[] nArray = new int[lIllllI[1]];
        nArray[bl.lIllllI[0]] = lIllllI[2];
        Item var3 = Inventory.getFirst((int[])nArray);
        if (bl.lIllllIlI(var3)) {
            return lIllllI[0];
        }
        var3_3.interact(lIlllIl[lIllllI[1]]);
        return lIllllI[1];
    }

    private static void lIllllIII() {
        lIllllI = new int[5];
        bl.lIllllI[0] = (0x77 ^ 0x2D) & ~(0x7C ^ 0x26);
        bl.lIllllI[1] = 1;
        bl.lIllllI[2] = 0xFFFFC3B8 & 0x3FFF;
        bl.lIllllI[3] = 2;
        bl.lIllllI[4] = 0x4A ^ 0x42;
    }

    private static boolean lIllllIIl(int n2) {
        return n2 == 0;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlI(Object object) {
        return object == null;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIlllIlll() {
        lIlllIl = new String[lIllllI[3]];
        bl.lIlllIl[bl.lIllllI[0]] = "DigStep";
        bl.lIlllIl[bl.lIllllI[1]] = "Dig";
    }
}

