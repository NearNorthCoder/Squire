/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Hiding behind pillar", priority=50, blocking=true, register=true)
public class HidingBehindPillarTask
extends WhispererTaskBase {
    
    private  int ak;
    private static final  int aj;

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if ((graphicsObjectCreated.getGraphicsObject().getId() == 3)) {
            this.ak = this.j.getTickCount();
        }
    }

    private List<NPC> x() {
        int[] nArray = new int[2];
        nArray[0] = 4;
        return NPCs.getAll((int[])nArray);
    }

    static {
        E.var2();
        aj = 4;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var5_5;
        E var3;
        void var4;
        List<NPC> list = this.x();
        if ((list.isEmpty( != 0) ? 1 : 0)) {
            return 0;
        }
        NPC var5 = var4.stream().filter(nPC -> {
            boolean bl;
            if ((nPC.isDead( == 0) ? 1 : 0)) {
                bl = 2;
                0;
                if (((0xDF ^ 0x98) & ~(0x10 ^ 0x57)) != 0) {
                    return ((0x47 ^ 0x5A) & ~(0x54 ^ 0x49)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        }).max(Comparator.comparingInt(Actor::getHealthRatio)).orElse(null);
        if var5 == null {
            return 0;
        }
        NPC var6 = var4.stream().filter(nPC -> {
            boolean bl;
            if ((nPC.isDead( == 0) ? 1 : 0)) {
                bl = 2;
                0;
                if (-1 >= 3) {
                    return ((0x5C ^ 0x40) & ~(0x16 ^ 0xA)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        }).min(Comparator.comparingInt(Actor::getHealthRatio).thenComparingInt(actor -> actor.distanceTo((Locatable)var5))).orElse(null);
        if var6 == null {
            return 0;
        }
        NPC var7 = var6;
        if ((var3.j.getTickCount() - var3.ak < 1)) {
            var7 = (NPC)var4.stream().filter(nPC -> {
                boolean bl;
                if ((nPC.isDead( == 0) ? 1 : 0)) {
                    bl = 2;
                    0;
                    if (((0x13 ^ 0x5E) & ~(0xD6 ^ 0x9B)) == (0x35 ^ 0x31)) {
                        return ((0x7D ^ 0x70) & ~(4 ^ 9)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            }).filter(nPC2 -> {
                boolean bl;
                if ((nPC2.getHealthRatio() > var6.getHealthRatio())) {
                    bl = 2;
                    0;
                    if (-2 >= 0) {
                        return ((0xB ^ 0x55 ^ (0xE4 ^ 0xBD)) & (46 + 170 - 59 + 34 ^ 34 + 23 - 42 + 169 ^ -1)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            }).min(Comparator.comparingInt(Actor::getHealthRatio).thenComparingInt(actor -> actor.distanceTo((Locatable)var5))).orElse((Actor)var6);
        }
        WorldPoint var8 = var7.getWorldLocation().dy(1);
        if ((Players.getLocal( != 0).getWorldLocation().equals((Object)var8) ? 1 : 0)) {
            return 2;
        }
        Movement.setDestination((WorldPoint)var5_5);
        return 2;
    }
}

