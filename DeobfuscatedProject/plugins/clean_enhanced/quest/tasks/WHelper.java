/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 */
package gg.squire.quest.tasks;

import java.util.Random;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import gg.squire.quest.tasks.QuestManager;

public class WHelper
implements l {
    private final  String an;
    private final  String ao;
    private static  int ah;

    private static boolean var2(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String z() {
        return this.ao;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    public WHelper(String string, String string2) {
        this.an = string;
        this.ao = string2;
    }

    static {
        w.var4();
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var6(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public void a(NPC nPC) {
        void var5_5;
        void var4_4;
        void var2_2;
        void var7;
        if (w.var3(nPC)) {
            return;
        }
        WorldPoint var8 = var7.getWorldLocation();
        Random var9 = new Random();
        int var10 = var9.nextInt(var1[5]) - var1[3];
        int var11 = var9.nextInt(var1[5]) - var1[3];
        if (w.var5(var10) && w.var5(var11)) {
            var10 = var1[0];
        }
        WorldPoint worldPoint = new WorldPoint(var2_2.getX() + var4_4, var2_2.getY() + var5_5, var2_2.getPlane());
        Walker.walkTo((WorldPoint)worldPoint);
        0;
        ah = M.a(var1[0], var1[4]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean D() {
        w var12;
        void var13;
        String[] stringArray = new String[var1[0]];
        stringArray[w.var1[1]] = this.an;
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (w.var3(nPC)) {
            return var1[1];
        }
        if (w.var6(ah, var1[0])) {
            ah -= var1[0];
            return var1[1];
        }
        if (w.var2(Players.getLocal().getAnimation(), var1[2])) {
            return var1[1];
        }
        if (w.var5(Movement.shouldWalk() ? 1 : 0)) {
            return var1[1];
        }
        if (w.var5(Reachable.isInteractable((Locatable)var13) ? 1 : 0)) {
            var12.a((NPC)var13);
            return var1[0];
        }
        if (w.var6(var13.getWorldLocation().distanceTo((Locatable)Players.getLocal()), var1[3])) {
            var12.a((NPC)var13);
            return var1[0];
        }
        nPC.interact(this.ao);
        ah = M.a(var1[0], var1[4]);
        return var1[0];
    }

    @Override
    public String y() {
        return this.an;
    }

    private static void var4() {
        var1 = new int[6];
        w.var1[0] = 1;
        w.var1[1] = (0x54 ^ 0x71) & ~(0x6E ^ 0x4B);
        w.var1[2] = -1;
        w.var1[3] = 3;
        w.var1[4] = 0x7F ^ 0x7B;
        w.var1[5] = 0x73 ^ 0x2B ^ (0x2D ^ 0x72);
    }
}

