/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Filling the bellows")
public class FillingTheBellowsTask
extends Task {
    private  boolean fo;
    private static  String[] lIllIIIII;
    private static  int[] lIllIIIIl;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void var7() {
        lIllIIIII = new String[lIllIIIIl[1]];
        bd.lIllIIIII[bd.lIllIIIIl[0]] = "Suck";
        bd.lIllIIIII[bd.lIllIIIIl[2]] = "Suck";
    }

    static {
        bd.var8();
        bd.var7();
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        bd var17;
        if (!bd.var9(Players.getLocal().isAnimating() ? 1 : 0) || bd.var18(Players.getLocal().getInteracting())) {
            return lIllIIIIl[0];
        }
        if (bd.var9(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIIIIl[0];
        }
        if (bd.var16(var17.ct() ? 1 : 0)) {
            return lIllIIIIl[0];
        }
        TileObject var19 = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIllIIIIl[2]];
            stringArray[bd.lIllIIIIl[0]] = lIllIIIII[lIllIIIIl[2]];
            return tileObject.hasAction(stringArray);
        });
        if (bd.var20(var19)) {
            return lIllIIIIl[0];
        }
        var1_1.interact(lIllIIIII[lIllIIIIl[0]]);
        this.sleep(lIllIIIIl[1]);
        return lIllIIIIl[2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean ct() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[lIllIIIIl[2]];
                nArray[bd.lIllIIIIl[0]] = lIllIIIIl[3];
                if (!bd.var9(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIllIIIIl[2]];
                nArray2[bd.lIllIIIIl[0]] = lIllIIIIl[4];
                if (!bd.var9(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIllIIIIl[2]];
                nArray3[bd.lIllIIIIl[0]] = lIllIIIIl[5];
                if (!bd.var16(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
            }
            n2 = lIllIIIIl[2];
            0;
            if ((0xCF ^ 0x91 ^ (0x2D ^ 0x77)) >= 0) return n2 != 0;
            return ((0x30 ^ 0x36 ^ (0 ^ 0x19)) & (95 + 77 - 167 + 143 ^ 133 + 26 - 34 + 14 ^ -1)) != 0;
        }
        n2 = lIllIIIIl[0];
        return n2 != 0;
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static void var8() {
        lIllIIIIl = new int[7];
        bd.lIllIIIIl[0] = (0x6F ^ 0x2A) & ~(0xC1 ^ 0x84);
        bd.lIllIIIIl[1] = 2;
        bd.lIllIIIIl[2] = 1;
        bd.lIllIIIIl[3] = 0xFFFFBBBE & 0x4F7B;
        bd.lIllIIIIl[4] = 0xFFFFEFB9 & 0x1B7F;
        bd.lIllIIIIl[5] = -(11 + 95 - -17 + 6) & (0xFFFF9BBA & 0x6FFD);
        bd.lIllIIIIl[6] = 0xCD ^ 0x9F ^ (0x25 ^ 0x7F);
    }

    private static boolean var18(Object object) {
        return object != null;
    }
}

