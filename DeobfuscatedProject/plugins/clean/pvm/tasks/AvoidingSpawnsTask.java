/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.CHelper;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Avoiding spawns", priority=50, blocking=true)
public class AvoidingSpawnsTask
extends Task {
     g aj;
     SquireShamanConfig c;
     c Q;
    private static final  Logger ai;

    private static boolean lIlIlllIIIlIlll(int n2) {
        return n2 == 0;
    }

    static {
        r.lIlIlllIIIlIllI();
        ai = LoggerFactory.getLogger(AvoidingSpawnsTask.class);
    }

    private static boolean lIlIlllIIIllIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var1;
        r var2;
        WorldPoint worldPoint2 = Players.getLocal().getWorldLocation();
        if (!r.lIlIlllIIIlIlll(Players.getLocal().isMoving() ? 1 : 0) || r.lIlIlllIIIlIlll(this.Q.s() ? 1 : 0)) {
            return lIIlIlllllIlI[0];
        }
        NPC var3 = var2.Q.o();
        if (r.lIlIlllIIIllIII(var3)) {
            return lIIlIlllllIlI[0];
        }
        if (r.lIlIlllIIIlIlll(Movement.isRunEnabled() ? 1 : 0) && r.lIlIlllIIIllIIl(Movement.getRunEnergy(), lIIlIlllllIlI[1])) {
            Movement.toggleRun();
        }
        Stream stream = var2.aj.z().stream();
        c c2 = var2.Q;
        Objects.requireNonNull(c2);

        WorldPoint var4 = stream.filter(c2::a).filter(worldPoint -> {
            boolean bl;
            if (r.lIlIlllIIIllIll(worldPoint.distanceTo(var3.getWorldLocation()), lIIlIlllllIlI[3])) {
                bl = lIIlIlllllIlI[2];

                if (3 <= -1) {
                    return ((0x5E ^ 0x74 ^ 23 + 53 - 21 + 72) & (0x2F ^ 0x5B ^ (0x76 ^ 0x57) ^ -1)) != 0;
                }
            } else {
                bl = lIIlIlllllIlI[0];
            }
            return bl;
        }).max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
        if (r.lIlIlllIIIllIII(var4)) {
            return lIIlIlllllIlI[0];
        }
        if (r.lIlIlllIIIllIlI(var2.Q.a((WorldPoint)var1) ? 1 : 0) && r.lIlIlllIIIllIll(var2.Q.o().getWorldArea().distanceTo((WorldPoint)var1), lIIlIlllllIlI[2])) {
            return lIIlIlllllIlI[0];
        }
        Movement.walk((WorldPoint)var3_3);
        return lIIlIlllllIlI[2];
    }

    @Inject
    public AvoidingSpawnsTask(c c2, SquireShamanConfig squireShamanConfig) {
        this.Q = c2;
        this.c = squireShamanConfig;
        this.aj = squireShamanConfig.room();
    }

    private static boolean lIlIlllIIIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllIIIllIII(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIIIllIIl(int n2, int n3) {
        return n2 >= n3;
    }
}

