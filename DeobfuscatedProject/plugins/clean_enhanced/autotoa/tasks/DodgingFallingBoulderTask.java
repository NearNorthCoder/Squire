/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging falling boulder", priority=5)
public class DodgingFallingBoulderTask
extends AutotoaManager {

    @Inject
    protected DodgingFallingBoulderTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        aN.var2();
    }

    @Override
    public boolean bC() {
        aN var3;
        NPC nPC = this.bB();
        if (!aN.var4(nPC) || aN.var5(nPC.getWorldArea().contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return var1[0];
        }
        int var6 = var1[0];
        Iterator var7 = var3.cu.getGraphicsObjects().iterator();
        while (aN.var5(var7.hasNext() ? 1 : 0)) {
            GraphicsObject var8 = (GraphicsObject)var7.next();
            WorldPoint var9 = WorldPoint.fromLocal((Client)var3.cu, (LocalPoint)var8.getLocation());
            if (aN.var10(var8.getId(), var1[1])) {
                0;
                if (3 > 2) continue;
                return ((0xD0 ^ 0x9D) & ~(0x37 ^ 0x7A)) != 0;
            }
            if (aN.var11(var8.getFrame(), var1[2])) {
                0;
                if (((0x7E ^ 0x30) & ~(0x39 ^ 0x77)) <= ((0x5B ^ 0x5F) & ~(0xA6 ^ 0xA2))) continue;
                return ((0xED ^ 0xA7) & ~(0x1D ^ 0x57)) != 0;
            }
            if (aN.var5(var9.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var6 = var1[3];
                0;
                if ((87 + 32 - 96 + 158 ^ 20 + 14 - -24 + 119) >= 0) break;
                return (1 & (1 ^ -1)) != 0;
            }
            0;
            if (-(0x54 ^ 0x50) <= 0) continue;
            return ((0xF1 ^ 0xAE) & ~(0x25 ^ 0x7A)) != 0;
        }
        if (aN.var5(var6)) {
            var7 = Players.getLocal().getWorldLocation().dx(var1[4]);
            Movement.setDestination((WorldPoint)var7);
            return var1[3];
        }
        return var1[0];
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var10(int n2, int n3) {
        return n2 != n3;
    }

    private static void var2() {
        var1 = new int[5];
        aN.var1[0] = (0xC7 ^ 0x85) & ~(0x3F ^ 0x7D);
        aN.var1[1] = -(0xFFFFCBB7 & 0x7779) & (0xFFFFCBFF & 0x7FFB);
        aN.var1[2] = 0x8E ^ 0xA3;
        aN.var1[3] = 1;
        aN.var1[4] = -1;
    }

    private static boolean var4(Object object) {
        return object != null;
    }
}

