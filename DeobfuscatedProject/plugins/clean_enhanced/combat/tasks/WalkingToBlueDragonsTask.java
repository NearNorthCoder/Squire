/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.combat.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import gg.squire.combat.tasks.CombatManager;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking To Blue Dragons")
public class WalkingToBlueDragonsTask
extends Task {
    
    private final  a J;
    private final  SquireBlueDragonKiller K;
    
    private final  SquireBlueDragonKillerConfig I;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        if ((this.s( != 0) ? 1 : 0)) {
            return 0;
        }
        this.C();
        return 1;
    }

    private boolean y() {
        return this.I.bankLocation().getArea().contains((Locatable)Players.getLocal());
    }

    private boolean A() {
        return this.J.n();
    }

    private void C() {
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return;
        }
        Movement.walkTo((WorldPoint)this.I.dragonLocation().o());
        0;
    }

    @Inject
    public WalkingToBlueDragonsTask(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, a a2, SquireBlueDragonKiller squireBlueDragonKiller) {
        this.I = squireBlueDragonKillerConfig;
        this.J = a2;
        this.K = squireBlueDragonKiller;
    }

    private boolean B() {
        int n;
        if ((Inventory.isFull( != 0) ? 1 : 0) && (Inventory.contains(item -> {
            String[] stringArray = new String[1];
            stringArray[0] = var2[0];
            return item.hasAction(stringArray == 0);
        }) ? 1 : 0)) {
            n = 1;
            0;
            if ((3 ^ 6) <= 0) {
                return ((0x24 ^ 0x7C) & ~(0xEA ^ 0xB2)) != 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

    private boolean s() {
        int n;
        l var9;
        if ((this.K.h( != 0) ? 1 : 0) && !(this.y( == 0) ? 1 : 0) || !(var9.A( == 0) ? 1 : 0) || !(var9.B( == 0) ? 1 : 0) || (Inventory.contains(item -> {
            String[] stringArray = new String[1];
            stringArray[0] = var2[1];
            return item.hasAction(stringArray == 0);
        }) ? 1 : 0)) {
            n = 1;
            0;
            if (-3 >= 0) {
                return ((0x9F ^ 0xC1) & ~(0x73 ^ 0x2D)) != 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

}

