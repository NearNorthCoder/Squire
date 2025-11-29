/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.SquireBankStander;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Inactivity Tracker", priority=0x7FFFFFFF, register=true)
public class InactivityTrackerTask
extends Task {
    private final  SquireBankStander r;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var2;
        if (u.var3(animationChanged.getActor(), Players.getLocal())) {
            return;
        }
        if (u.var4(var2.getActor().getAnimation(), var1[0])) {
            return;
        }
        this.r.c(var1[1]);
    }

    private static void var5() {
        var1 = new int[3];
        u.var1[0] = -1;
        u.var1[1] = (0x89 ^ 0xB8) & ~(0x77 ^ 0x46);
        u.var1[2] = 1;
    }

    private static boolean var6(int n2, int n3) {
        return n2 != n3;
    }

    @Subscribe
    public void a(StatChanged statChanged) {
        this.r.c(var1[1]);
    }

    static {
        u.var5();
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7;
        Player player = Players.getLocal();
        if (u.var8(player)) {
            return var1[1];
        }
        if (u.var6(var7.getAnimation(), var1[0])) {
            u var9;
            var9.r.c(var1[1]);
        }
        return var1[1];
    }

    @Inject
    public InactivityTrackerTask(SquireBankStander squireBankStander) {
        this.r = squireBankStander;
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.r.c(this.r.e() + var1[2]);
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }
}

