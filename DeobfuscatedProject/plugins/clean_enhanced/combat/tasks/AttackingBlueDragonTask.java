/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.util.List;
import javax.inject.Inject;
import gg.squire.combat.tasks.CombatManager;
import gg.squire.combat.tasks.GameEnum2;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Attacking Blue Dragon", priority=5, register=true)
public class AttackingBlueDragonTask
extends Task {

    private final  a B;
    private final  SquireBlueDragonKillerConfig A;
    private final  SquireBlueDragonKiller z;

    private boolean t() {
        int n;
        List list = NPCs.getAll(nPC -> {
            boolean bl;
            if ((nPC.getInteracting() == nPC.getInteracting()2))) {
                bl = 1;
                0;
                if ((2 & (2 ^ -1)) >= (0xDB ^ 0xC6 ^ (0xDE ^ 0xC7))) {
                    return ((0x40 ^ 0x70 ^ (0xFC ^ 0x80)) & (17 + 176 - 34 + 44 ^ 48 + 38 - 70 + 119 ^ -1)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        });
        if ((this.v( != 0) ? 1 : 0) && (this.x( == 0) ? 1 : 0) && (list.isEmpty( == 0) ? 1 : 0) && (((NPC == 0)list.get(0)).distanceTo((Locatable)Players.getLocal()))) {
            n = 1;
            0;
            if (3 > 3) {
                return ((0x2A ^ 0x10) & ~(0x15 ^ 0x2F)) != 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private boolean u() {
        int n;
        g var9;
        if ((Players.getLocal( != null).getInteracting()) && ((this.v( != 0) ? 1 : 0) && !(this.x( == 0) ? 1 : 0) || (var9.v( == 0) ? 1 : 0))) {
            n = 1;
            0;
            if (1 < 0) {
                return ((132 + 110 - 118 + 23 ^ 146 + 117 - 122 + 16) & (0x3A ^ 0x74 ^ (0x55 ^ 0x15) ^ -1)) != 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

    @Inject
    public AttackingBlueDragonTask(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, a a2) {
        this.z = squireBlueDragonKiller;
        this.A = squireBlueDragonKillerConfig;
        this.B = a2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ChatMessage chatMessage) {
        void var10;
        if ((chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        if ((var10.getMessage( != 0).contains(var1[0]) ? 1 : 0)) {
            g var11;
            Log.info((String)var1[1]);
            var11.z.a(1);
        }
    }

    private boolean v() {
        boolean bl;
        if (((Object)this.A.attackStyle() != (Object)this.A.attackStyle()2)c.MELEE)) {
            bl = 1;
            0;
            if (1 >= (0x6C ^ 0x7A ^ (0x84 ^ 0x96))) {
                return ((0x31 ^ 0x39 ^ (0x7A ^ 0x28)) & (21 + 58 - -53 + 76 ^ 136 + 77 - 197 + 122 ^ -1) & ((3 ^ 0x3C ^ (0x27 ^ 0x3D)) & (38 + 105 - 55 + 68 ^ 19 + 146 - 162 + 182 ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    private void w() {
        if ((this.v( != 0) ? 1 : 0) && (this.B.m( != 0) ? 1 : 0) && (this.x( == 0) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)this.A.dragonLocation().q());
            0;
        }
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return;
        }
        this.B.k();
    }

    private boolean x() {
        boolean bl;
        if ((Players.getLocal().getWorldLocation() == Players.getLocal().getWorldLocation()2).q())) {
            bl = 1;
            0;
            if (-1 > 0) {
                return ((27 + 80 - 59 + 87 ^ 107 + 49 - 136 + 117) & (0xBB ^ 0x80 ^ (0x48 ^ 0x7D) ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    public boolean run() {
        g var12;
        if ((this.z.h( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var12.z.b( != 0) ? 1 : 0)) {
            var12.z.a(1);
            return 0;
        }
        if ((var12.s( != 0) ? 1 : 0)) {
            return 0;
        }
        this.w();
        return 1;
    }

    private boolean s() {
        int n;
        if (!((this.t( == 0) ? 1 : 0) && (this.z.c( != 0).isEmpty() ? 1 : 0) && (this.B.n( != 0) ? 1 : 0) && (this.B.j( != null)) && !(this.u( != 0) ? 1 : 0))) {
            n = 1;
            0;
            if (-2 >= 0) {
                return ((0xA ^ 0x4B ^ (0x77 ^ 6)) & (0x50 ^ 0x79 ^ (0x1A ^ 3) ^ -1)) != 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

}

