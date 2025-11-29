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

    private static boolean llIIIIIllllllII(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (E.llIIIIIllllllll(graphicsObjectCreated.getGraphicsObject().getId(), lIlIlllIIIIll[3])) {
            this.ak = this.j.getTickCount();
        }
    }

    private List<NPC> x() {
        int[] nArray = new int[lIlIlllIIIIll[2]];
        nArray[E.lIlIlllIIIIll[0]] = lIlIlllIIIIll[4];
        return NPCs.getAll((int[])nArray);
    }

    private static boolean llIIIIIlllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIlIIIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIlIIIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        E.llIIIIIlllllIll();
        aj = lIlIlllIIIIll[4];
    }

    private static boolean llIIIIIllllllIl(Object object) {
        return object == null;
    }

    private static boolean llIIIIIllllllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var5_5;
        E var1;
        void var2;
        List<NPC> list = this.x();
        if (E.llIIIIIllllllII(list.isEmpty() ? 1 : 0)) {
            return lIlIlllIIIIll[0];
        }
        NPC var3 = var2.stream().filter(nPC -> {
            boolean bl;
            if (E.llIIIIlIIIIIIIl(nPC.isDead() ? 1 : 0)) {
                bl = lIlIlllIIIIll[2];

                if (((0xDF ^ 0x98) & ~(0x10 ^ 0x57)) != 0) {
                    return false;
                }
            } else {
                bl = lIlIlllIIIIll[0];
            }
            return bl;
        }).max(Comparator.comparingInt(Actor::getHealthRatio)).orElse(null);
        if (E.llIIIIIllllllIl(var3)) {
            return lIlIlllIIIIll[0];
        }
        NPC var4 = var2.stream().filter(nPC -> {
            boolean bl;
            if (E.llIIIIlIIIIIIIl(nPC.isDead() ? 1 : 0)) {
                bl = lIlIlllIIIIll[2];

                if (-1 >= 3) {
                    return false;
                }
            } else {
                bl = lIlIlllIIIIll[0];
            }
            return bl;
        }).min(Comparator.comparingInt(Actor::getHealthRatio).thenComparingInt(actor -> actor.distanceTo((Locatable)var3))).orElse(null);
        if (E.llIIIIIllllllIl(var4)) {
            return lIlIlllIIIIll[0];
        }
        NPC var5 = var4;
        if (E.llIIIIIlllllllI(var1.j.getTickCount() - var1.ak, lIlIlllIIIIll[1])) {
            var5 = (NPC)var2.stream().filter(nPC -> {
                boolean bl;
                if (E.llIIIIlIIIIIIIl(nPC.isDead() ? 1 : 0)) {
                    bl = lIlIlllIIIIll[2];

                    if (((0x13 ^ 0x5E) & ~(0xD6 ^ 0x9B)) == (0x35 ^ 0x31)) {
                        return false;
                    }
                } else {
                    bl = lIlIlllIIIIll[0];
                }
                return bl;
            }).filter(nPC2 -> {
                boolean bl;
                if (E.llIIIIlIIIIIIII(nPC2.getHealthRatio(), var4.getHealthRatio())) {
                    bl = lIlIlllIIIIll[2];

                } else {
                    bl = lIlIlllIIIIll[0];
                }
                return bl;
            }).min(Comparator.comparingInt(Actor::getHealthRatio).thenComparingInt(actor -> actor.distanceTo((Locatable)var3))).orElse((Actor)var4);
        }
        WorldPoint var6 = var5.getWorldLocation().dy(lIlIlllIIIIll[1]);
        if (E.llIIIIIllllllII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
            return lIlIlllIIIIll[2];
        }
        Movement.setDestination((WorldPoint)var5_5);
        return lIlIlllIIIIll[2];
    }

}

