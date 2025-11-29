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
import gg.squire.quest.tasks.MHelper;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.l;

public class WHelper
implements l {
    private final  String an;
    private final  String ao;
    private static  int ah;

    private static boolean lIlllIIlIIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String z() {
        return this.ao;
    }

    private static boolean lIlllIIlIIlIIII(Object object) {
        return object == null;
    }

    public WHelper(String string, String string2) {
        this.an = string;
        this.ao = string2;
    }

    static {
        w.lIlllIIlIIIllll();
    }

    private static boolean lIlllIIlIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIlIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public void a(NPC nPC) {
        void var5_5;
        void var4_4;
        void var2_2;
        void var1;
        if (w.lIlllIIlIIlIIII(nPC)) {
            return;
        }
        WorldPoint var2 = var1.getWorldLocation();
        Random var3 = new Random();
        int var4 = var3.nextInt(lIlIIlIIlIIII[5]) - lIlIIlIIlIIII[3];
        int var5 = var3.nextInt(lIlIIlIIlIIII[5]) - lIlIIlIIlIIII[3];
        if (w.lIlllIIlIIlIIll(var4) && w.lIlllIIlIIlIIll(var5)) {
            var4 = lIlIIlIIlIIII[0];
        }
        WorldPoint worldPoint = new WorldPoint(var2_2.getX() + var4_4, var2_2.getY() + var5_5, var2_2.getPlane());
        Walker.walkTo((WorldPoint)worldPoint);

        ah = M.a(lIlIIlIIlIIII[0], lIlIIlIIlIIII[4]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean D() {
        w var6;
        void var7;
        String[] stringArray = new String[lIlIIlIIlIIII[0]];
        stringArray[w.lIlIIlIIlIIII[1]] = this.an;
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (w.lIlllIIlIIlIIII(nPC)) {
            return lIlIIlIIlIIII[1];
        }
        if (w.lIlllIIlIIlIIIl(ah, lIlIIlIIlIIII[0])) {
            ah -= lIlIIlIIlIIII[0];
            return lIlIIlIIlIIII[1];
        }
        if (w.lIlllIIlIIlIIlI(Players.getLocal().getAnimation(), lIlIIlIIlIIII[2])) {
            return lIlIIlIIlIIII[1];
        }
        if (w.lIlllIIlIIlIIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlIIlIIII[1];
        }
        if (w.lIlllIIlIIlIIll(Reachable.isInteractable((Locatable)var7) ? 1 : 0)) {
            var6.a((NPC)var7);
            return lIlIIlIIlIIII[0];
        }
        if (w.lIlllIIlIIlIIIl(var7.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIlIIlIIlIIII[3])) {
            var6.a((NPC)var7);
            return lIlIIlIIlIIII[0];
        }
        nPC.interact(this.ao);
        ah = M.a(lIlIIlIIlIIII[0], lIlIIlIIlIIII[4]);
        return lIlIIlIIlIIII[0];
    }

    @Override
    public String y() {
        return this.an;
    }

}

