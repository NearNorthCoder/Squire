/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Dodging Tentacles", priority=10, blocking=true, register=true)
@Singleton
public class DodgingTentaclesTask
extends WhispererTaskBase {
    
    private  boolean X;

    private Stream<WorldPoint> b(WorldPoint worldPoint) {
        WorldPoint[] worldPointArray = new WorldPoint[2];
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.0] = worldPoint.dx(1).dy(3);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.1] = worldPoint.dx(1).dy(4);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.3] = worldPoint.dx(5).dy(3);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.6] = worldPoint.dx(5).dy(4);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.7] = worldPoint.dx(3).dy(1);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.8] = worldPoint.dx(3).dy(5);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.9] = worldPoint.dx(4).dy(1);
        worldPointArray[r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p.var1[10]] = worldPoint.dx(4).dy(5);
        return Stream.of(worldPointArray);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        String string = npcSpawned.getNpc().getName();
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.string != null && r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(string.contains(var2[0] != 0) ? 1 : 0)) {
            this.X = 1;
        }
    }

    public boolean r() {
        return this.X;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean DodgingTentaclesTask() {
        void var3_3;
        p var9;
        List<NPC> list = this.W.l();
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(list.isEmpty( != 0) ? 1 : 0)) {
            this.X = 0;
            return 0;
        }
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(var9.X == 0)) {
            return 0;
        }
        WorldPoint var10 = Players.getLocal().getWorldLocation();
        WorldPoint var11 = var9.b(var10).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl;
            if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.(worldPoint.distanceTo2D(this.W.j().getWorldLocation()) <= var1[11])) {
                bl = 1;
                0;
                if (-2 > 0) {
                    return ((0x30 ^ 0x7E) & ~(0x3F ^ 0x71)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        }).max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo2D(this.W.j().getWorldLocation()))).orElse(null);
        if (r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.var11 == null) {
            return 0;
        }
        Movement.setDestination((WorldPoint)var3_3);
        this.X = 0;
        return 1;
    }

}

