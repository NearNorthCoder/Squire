/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Default step", priority=-1)
public class DefaultStepTask
extends MinigamesTaskBase<w> {

    @Inject
    public DefaultStepTask(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, MinigamesTaskBase.class);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(w w2, o o2) {
        WorldPoint var2;
        void var3;
        if ((this.cd.aw2)) {
            return 0;
        }
        Player var4 = Players.getLocal();
        if ((var4.isMoving( != 0) ? 1 : 0) && (var3 instanceof v == 0) && (var2 = Movement.getDestination( != null)) && (var2.distanceTo(var4.getWorldLocation()) > 1)) {
            return 0;
        }
        return w2.c(this.cb.a());
    }

    static {
        R.var5();
    }
}

