/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging dung attack", priority=8, blocking=true)
public class DodgingDungAttackTask
extends AutotoaTaskBase {
    private static final  int eG;

    private static boolean lIIllIIlIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIIlIIIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIllIIlIIIIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var1_1;
        be var1;
        if (be.lIIllIIlIIIIIl(this.bR() ? 1 : 0)) {
            return lIlllIIllIl[0];
        }
        WorldPoint var2 = var1.bT();
        if (be.lIIllIIlIIIIlI(var2)) {
            return lIlllIIllIl[0];
        }
        be.f(lIlllIIllIl[1]);
        Movement.setDestination((WorldPoint)var1_1);
        return lIlllIIllIl[1];
    }

    /*
     * WARNING - void declaration
     */
    private int u(WorldPoint worldPoint) {
        double d2 = 0.0;
        Iterator<TileObject> var3 = this.bM().iterator();
        while (be.lIIllIIlIIIIll(var3.hasNext() ? 1 : 0)) {
            void var4;
            TileObject var5 = var3.next();
            WorldPoint var6 = var5.getWorldLocation();
            var7 += (double)var6.distanceToHypotenuse((WorldPoint)var4);

            if (1 > -1) continue;
            return (0xF2 ^ 0xAD) & ~(0x9A ^ 0xC5);
        }
        return (int)d2;
    }

    @Inject
    protected DodgingDungAttackTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        be.lIIllIIlIIIIII();
        eG = lIlllIIllIl[2];
    }
}

