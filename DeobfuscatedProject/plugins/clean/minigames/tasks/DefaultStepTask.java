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
import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.VHelper;
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

    private static boolean llIIlllllllIII(Object object) {
        return object != null;
    }

    private static boolean llIIllllllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIllllllIlll(int n2) {
        return n2 == 0;
    }

    @Inject
    public DefaultStepTask(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, MinigamesTaskBase.class);
    }

    private static boolean llIIlllllllIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(w w2, o o2) {
        WorldPoint var1;
        void var2;
        if (R.llIIllllllIllI(this.cd.a(w2) ? 1 : 0)) {
            return lIIllIlllIIl[0];
        }
        Player var3 = Players.getLocal();
        if (R.llIIllllllIllI(var3.isMoving() ? 1 : 0) && R.llIIllllllIlll(var2 instanceof v) && R.llIIlllllllIII(var1 = Movement.getDestination()) && R.llIIlllllllIIl(var1.distanceTo(var3.getWorldLocation()), lIIllIlllIIl[1])) {
            return lIIllIlllIIl[0];
        }
        return w2.c(this.cb.a());
    }

    static {
        R.llIIllllllIlIl();
    }
}

