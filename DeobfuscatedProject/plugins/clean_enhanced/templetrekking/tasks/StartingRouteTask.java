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
        q var2;
        Widget widget;
        if (q.var3(this.R.d() ? 1 : 0) && q.var4(widget = this.S.getWidget(var1[2]))) {
            widget.interact(var1[3], var1[4], var1[5], widget.getId());
            return var1[3];
        }
        Player var5 = Players.getLocal();
        if (q.var6(var5)) {
            return var1[6];
        }
        if (!q.var7(var2.R.f().contains((Locatable)var5) ? 1 : 0) || q.var3(var2.R.g().contains((Locatable)var5) ? 1 : 0)) {
            return var1[6];
        }
        if (!q.var7(var5.isMoving() ? 1 : 0) || q.var3(var5.isAnimating() ? 1 : 0)) {
            if (q.var7(Movement.isRunEnabled() ? 1 : 0) && q.var8(Movement.getRunEnergy(), var2.U)) {
                Movement.toggleRun();
                var2.U = var2.T.nextInt(var1[0]) + var1[1];
                return var1[3];
            }
            return var1[6];
        }
        return var1[6];
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static boolean var8(int n2, int n3) {
        return n2 > n3;
    }

    private static void var9() {
        var1 = new int[7];
        q.var1[0] = 0x6F ^ 0x65;
        q.var1[1] = 0xB8 ^ 0xAC;
        q.var1[2] = -(0xFFFFE7A9 & 0x5EF7) & (0xFFFFCFF7 & 0x14976BD);
        q.var1[3] = 1;
        q.var1[4] = 0x1D ^ 0x24;
        q.var1[5] = -1;
        q.var1[6] = (0x3A ^ 0x7A) & ~(0x17 ^ 0x57);
    }

    @Inject
    public StartingRouteTask(TempleTrekkingPlugin templeTrekkingPlugin, Client client) {
        this.T = new Random();
        this.U = this.T.nextInt(var1[0]) + var1[1];
        this.R = templeTrekkingPlugin;
        this.S = client;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    static {
        q.var9();
        Q = var1[2];
    }

    private static boolean var4(Object object) {
        return object != null;
    }
}

