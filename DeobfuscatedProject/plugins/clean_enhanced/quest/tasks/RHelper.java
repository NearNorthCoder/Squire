/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.quest.tasks;

import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.quest.tasks.QuestManager;

public class RHelper
implements o {
    private static  int ah;

    private static void var2() {
        var1 = new int[6];
        r.var1[0] = 1;
        r.var1[1] = (0x49 ^ 0x56) & ~(0x72 ^ 0x6D);
        r.var1[2] = 0xFFFFF9FF & 0xFCF;
        r.var1[3] = 0xFFFFC6CF & 0x3B7E;
        r.var1[4] = -1;
        r.var1[5] = 0x67 ^ 0x63;
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    @Override
    public boolean D() {
        block7: {
            block6: {
                int[] nArray = new int[var1[0]];
                nArray[r.var1[1]] = var1[2];
                if (!r.var4(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[var1[0]];
                nArray2[r.var1[1]] = var1[3];
                if (!r.var5(Inventory.contains((int[])nArray2) ? 1 : 0)) break block7;
            }
            return var1[1];
        }
        if (r.var3(TileObjects.getNearest(tileObject -> tileObject.getWorldLocation().equals((Object)Players.getLocal())))) {
            Movement.walkTo((int)(Players.getLocal().getWorldLocation().getX() + var1[0]), (int)Players.getLocal().getWorldLocation().getY());
            0;
            return var1[0];
        }
        if (r.var6(Players.getLocal().getAnimation(), var1[4])) {
            return var1[1];
        }
        if (r.var7(ah, var1[0])) {
            ah -= var1[0];
            return var1[1];
        }
        int[] nArray = new int[var1[0]];
        nArray[r.var1[1]] = var1[2];
        int[] nArray3 = new int[var1[0]];
        nArray3[r.var1[1]] = var1[3];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray3));
        ah = M.a(var1[0], var1[5]);
        return var1[0];
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    static {
        r.var2();
    }

    private static boolean var7(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var6(int n2, int n3) {
        return n2 != n3;
    }
}

