/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.util.Random;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Starting route")
public class StartingRouteTask
extends Task {
    private final  TempleTrekkingPlugin R;
    private final  Random T;
    
    private static final  int Q;
    private  int U;
    private final  Client S;

    public boolean run() {
        q var1;
        Widget widget;
        if (q.lIllIIIIIllllII(this.R.d() ? 1 : 0) && q.lIllIIIIIllllIl(widget = this.S.getWidget(lIIllIlIIlIlI[2]))) {
            widget.interact(lIIllIlIIlIlI[3], lIIllIlIIlIlI[4], lIIllIlIIlIlI[5], widget.getId());
            return lIIllIlIIlIlI[3];
        }
        Player var2 = Players.getLocal();
        if (q.lIllIIIIIlllllI(var2)) {
            return lIIllIlIIlIlI[6];
        }
        if (!q.lIllIIIIIllllll(var1.R.f().contains((Locatable)var2) ? 1 : 0) || q.lIllIIIIIllllII(var1.R.g().contains((Locatable)var2) ? 1 : 0)) {
            return lIIllIlIIlIlI[6];
        }
        if (!q.lIllIIIIIllllll(var2.isMoving() ? 1 : 0) || q.lIllIIIIIllllII(var2.isAnimating() ? 1 : 0)) {
            if (q.lIllIIIIIllllll(Movement.isRunEnabled() ? 1 : 0) && q.lIllIIIIlIIIIII(Movement.getRunEnergy(), var1.U)) {
                Movement.toggleRun();
                var1.U = var1.T.nextInt(lIIllIlIIlIlI[0]) + lIIllIlIIlIlI[1];
                return lIIllIlIIlIlI[3];
            }
            return lIIllIlIIlIlI[6];
        }
        return lIIllIlIIlIlI[6];
    }

    private static boolean lIllIIIIIlllllI(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIllllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIlIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public StartingRouteTask(TempleTrekkingPlugin templeTrekkingPlugin, Client client) {
        this.T = new Random();
        this.U = this.T.nextInt(lIIllIlIIlIlI[0]) + lIIllIlIIlIlI[1];
        this.R = templeTrekkingPlugin;
        this.S = client;
    }

    private static boolean lIllIIIIIllllII(int n2) {
        return n2 != 0;
    }

    static {
        q.lIllIIIIIlllIll();
        Q = lIIllIlIIlIlI[2];
    }

    private static boolean lIllIIIIIllllIl(Object object) {
        return object != null;
    }
}

