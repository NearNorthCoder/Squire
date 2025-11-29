/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Set;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging ba-ba boulder", priority=101)
public class DodgingBabaBoulderTask
extends AutotoaManager {

    private static boolean var2(Object object) {
        return object == null;
    }

    private static void var3() {
        var1 = new int[3];
        bI.var1[0] = (0x17 ^ 0x47) & ~(0x71 ^ 0x21);
        bI.var1[1] = 0x6F ^ 0x67;
        bI.var1[2] = 1;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    @Inject
    protected DodgingBabaBoulderTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        bI.var3();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var3_3;
        bI var5;
        if (bI.var6(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[0];
        }
        if (bI.var6(var5.be() ? 1 : 0)) {
            return var1[0];
        }
        Set<WorldPoint> var7 = var5.o(var1[1]);
        if (bI.var6(var7.isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var8 = Players.getLocal().getWorldLocation();
        if (bI.var4(var7.contains(var8) ? 1 : 0)) {
            return var1[0];
        }
        if (bI.var6(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var9 = Stream.of(var8.dy(var1[2])).filter(Reachable::isWalkable).findFirst().orElse(null);
        if (bI.var2(var9)) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var3_3);
        return var1[2];
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }
}

