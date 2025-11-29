/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.duke.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.tasks.DukeTaskBase;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking to the bank", priority=0x7FFFFFFF, blocking=true)
public class WalkingToTheBankTask
extends DukeTaskBase {

    static {
        o.var2();
    }

    @Override
    protected boolean R() {
        o var3;
        if ((this.w.n( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var3.P( != 0) ? 1 : 0)) {
            return 0;
        }
        Movement.walkTo((WorldPoint)this.ae.bank().H());
        0;
        return 1;
    }
}

