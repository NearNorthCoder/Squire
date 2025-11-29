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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Dodging ba-ba boulder", priority=101)
public class DodgingBabaBoulderTask
extends AutotoaTaskBase {

    private static boolean lIIlllllIIIlll(Object object) {
        return object == null;
    }

    private static boolean lIIlllllIIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected DodgingBabaBoulderTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        bI.lIIlllllIIIlII();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var3_3;
        bI var1;
        if (bI.lIIlllllIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        if (bI.lIIlllllIIIlIl(var1.be() ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        Set<WorldPoint> var2 = var1.o(llIIIllIlIl[1]);
        if (bI.lIIlllllIIIlIl(var2.isEmpty() ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        WorldPoint var3 = Players.getLocal().getWorldLocation();
        if (bI.lIIlllllIIIllI(var2.contains(var3) ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        if (bI.lIIlllllIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIIIllIlIl[0];
        }
        WorldPoint var4 = Stream.of(var3.dy(llIIIllIlIl[2])).filter(Reachable::isWalkable).findFirst().orElse(null);
        if (bI.lIIlllllIIIlll(var4)) {
            return llIIIllIlIl[0];
        }
        Movement.setDestination((WorldPoint)var3_3);
        return llIIIllIlIl[2];
    }

    private static boolean lIIlllllIIIlIl(int n2) {
        return n2 != 0;
    }
}

