/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.quest.tasks;

import java.util.List;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.quest.tasks.QuestManager;

public class YHelper
implements o {
    
    private final  String aq;
    private final  WorldPoint ap;
    private static  int ah;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var3(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 != n3;
    }

    static {
        y.var5();
    }

    public YHelper(WorldPoint worldPoint, String string) {
        this.ap = worldPoint;
        this.aq = string;
    }

    private static void var5() {
        var1 = new int[4];
        y.var1[0] = (0x31 ^ 0x25) & ~(0xBC ^ 0xA8);
        y.var1[1] = 1;
        y.var1[2] = -1;
        y.var1[3] = 0x51 ^ 0x6B ^ (0x8E ^ 0xB0);
    }

    @Override
    public boolean D() {
        if (y.var2(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        if (y.var3(ah, var1[1])) {
            ah -= var1[1];
            return var1[0];
        }
        if (y.var4(Players.getLocal().getAnimation(), var1[2])) {
            return var1[0];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[y.var1[0]] = this.aq;
        List list = TileObjects.getAt((WorldPoint)this.ap, (String[])stringArray);
        ((TileObject)list.get(var1[0])).interact(var1[0]);
        ah = M.a(var1[1], var1[3]);
        return var1[1];
    }
}

