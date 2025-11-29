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
import gg.squire.quest.tasks.MHelper;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class y
implements o {
    
    private final  String aq;
    private final  WorldPoint ap;
    private static  int ah;

    private static boolean lIlllIIIllllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIIllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIIIllllIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        y.lIlllIIIllllIII();
    }

    public y(WorldPoint worldPoint, String string) {
        this.ap = worldPoint;
        this.aq = string;
    }

    @Override
    public boolean D() {
        if (y.lIlllIIIllllIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlIIIlIII[0];
        }
        if (y.lIlllIIIllllIlI(ah, lIlIIlIIIlIII[1])) {
            ah -= lIlIIlIIIlIII[1];
            return lIlIIlIIIlIII[0];
        }
        if (y.lIlllIIIllllIll(Players.getLocal().getAnimation(), lIlIIlIIIlIII[2])) {
            return lIlIIlIIIlIII[0];
        }
        String[] stringArray = new String[lIlIIlIIIlIII[1]];
        stringArray[y.lIlIIlIIIlIII[0]] = this.aq;
        List list = TileObjects.getAt((WorldPoint)this.ap, (String[])stringArray);
        ((TileObject)list.get(lIlIIlIIIlIII[0])).interact(lIlIIlIIIlIII[0]);
        ah = M.a(lIlIIlIIIlIII[1], lIlIIlIIIlIII[3]);
        return lIlIIlIIIlIII[1];
    }
}

