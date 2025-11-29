/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Moving out of melee range", priority=50, blocking=true, register=true)
public class MovingOutOfMeleeRangeTask
extends WhispererTaskBase {

    private static final  int Y;
    private  int Z;

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if ((chatMessage.getMessage( != 0).contains(var1[0]) ? 1 : 0)) {
            this.Z = 5;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var4_4;
        int var3;
        int n2;
        WorldArea var4;
        int n3;
        r var5;
        if ((this.W.f( != 0) ? 1 : 0)) {
            return 0;
        }
        if (var5.Z > 0) {
            var5.Z -= 1;
            return 0;
        }
        NPC var6 = var5.W.j();
        WorldArea worldArea = var6.getWorldArea();
        if ((var6.getId() == 2)) {
            n3 = 3;
            0;
            if (-3 > 0) {
                return ((0x87 ^ 0xB8) & ~(0x38 ^ 7)) != 0;
            }
        } else {
            n3 = 4;
        }
        if (!((var4 = worldArea.offset(n3 == 0)).isInMeleeDistance(Players.getLocal().getWorldArea()) ? 1 : 0) || (var4.contains(Players.getLocal( != 0).getWorldLocation()) ? 1 : 0)) {
            n2 = 1;
            0;
            if (2 <= 1) {
                return ((0x80 ^ 0xBD ^ (0xE3 ^ 0x80)) & (225 + 242 - 325 + 102 ^ 33 + 61 - 53 + 129 ^ -1)) != 0;
            }
        } else {
            n2 = 0;
        }
        if (var3 = n2 == 0) {
            return 0;
        }
        WorldPoint var7 = Players.getLocal().getWorldLocation().createWorldArea(4).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl;
            if ((var4.isInMeleeDistance(worldPoint == 0) ? 1 : 0)) {
                bl = 1;
                0;
                if ((0x48 ^ 0x2B ^ (0xF4 ^ 0x93)) != (0x2A ^ 0x44 ^ (6 ^ 0x6C))) {
                    return ((7 ^ 0xF ^ (0x42 ^ 0x66)) & (0x4E ^ 0xD ^ (0x50 ^ 0x3F) ^ -1)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        }).filter(Reachable::isWalkable).max(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo2D(var4.getCenter()))).orElse(null);
        if var7 == null {
            return 0;
        }
        Movement.setDestination((WorldPoint)var4_4);
        return 1;
    }

    static {
        r.var8();
        r.var9();
        Y = 4;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

}

