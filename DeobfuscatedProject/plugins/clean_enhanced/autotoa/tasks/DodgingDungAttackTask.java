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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging dung attack", priority=8, blocking=true)
public class DodgingDungAttackTask
extends AutotoaManager {
    private static final  int eG;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new int[3];
        be.var1[0] = (32 + 89 - -25 + 51 ^ 34 + 19 - -31 + 46) & (0x95 ^ 0xA8 ^ (0x21 ^ 0x5B) ^ -1);
        be.var1[1] = 1;
        be.var1[2] = 0xFFFFB7F7 & 0xF9C8;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var1_1;
        be var6;
        if (be.var2(this.bR() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var7 = var6.bT();
        if (be.var3(var7)) {
            return var1[0];
        }
        be.f(var1[1]);
        Movement.setDestination((WorldPoint)var1_1);
        return var1[1];
    }

    /*
     * WARNING - void declaration
     */
    private int u(WorldPoint worldPoint) {
        double d2 = 0.0;
        Iterator<TileObject> var8 = this.bM().iterator();
        while (be.var5(var8.hasNext() ? 1 : 0)) {
            void var9;
            TileObject var10 = var8.next();
            WorldPoint var11 = var10.getWorldLocation();
            var12 += (double)var11.distanceToHypotenuse((WorldPoint)var9);
            0;
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
        be.var4();
        eG = var1[2];
    }
}

