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
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.GameEnum;

@TaskDesc(name="Avoiding spawns", priority=50, blocking=true)
public class AvoidingSpawnsTask
extends Task {
     g aj;
     SquireShamanConfig c;
     c Q;
    private static final  Logger ai;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    static {
        r.var3();
        ai = LoggerFactory.getLogger(AvoidingSpawnsTask.class);
    }

    private static void var3() {
        var1 = new int[4];
        r.var1[0] = (0x4D ^ 0x61) & ~(0x4E ^ 0x62);
        r.var1[1] = 3;
        r.var1[2] = 1;
        r.var1[3] = 2;
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        void var5;
        r var6;
        WorldPoint worldPoint2 = Players.getLocal().getWorldLocation();
        if (!r.var2(Players.getLocal().isMoving() ? 1 : 0) || r.var2(this.Q.s() ? 1 : 0)) {
            return var1[0];
        }
        NPC var7 = var6.Q.o();
        if (r.var8(var7)) {
            return var1[0];
        }
        if (r.var2(Movement.isRunEnabled() ? 1 : 0) && r.var9(Movement.getRunEnergy(), var1[1])) {
            Movement.toggleRun();
        }
        Stream stream = var6.aj.z().stream();
        c c2 = var6.Q;
        Objects.requireNonNull(c2);
        0;
        WorldPoint var10 = stream.filter(c2::a).filter(worldPoint -> {
            boolean bl;
            if (r.var4(worldPoint.distanceTo(var7.getWorldLocation()), var1[3])) {
                bl = var1[2];
                0;
                if (3 <= -1) {
                    return ((0x5E ^ 0x74 ^ 23 + 53 - 21 + 72) & (0x2F ^ 0x5B ^ (0x76 ^ 0x57) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }).max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
        if (r.var8(var10)) {
            return var1[0];
        }
        if (r.var11(var6.Q.a((WorldPoint)var5) ? 1 : 0) && r.var4(var6.Q.o().getWorldArea().distanceTo((WorldPoint)var5), var1[2])) {
            return var1[0];
        }
        Movement.walk((WorldPoint)var3_3);
        return var1[2];
    }

    @Inject
    public AvoidingSpawnsTask(c c2, SquireShamanConfig squireShamanConfig) {
        this.Q = c2;
        this.c = squireShamanConfig;
        this.aj = squireShamanConfig.room();
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var9(int n2, int n3) {
        return n2 >= n3;
    }
}

