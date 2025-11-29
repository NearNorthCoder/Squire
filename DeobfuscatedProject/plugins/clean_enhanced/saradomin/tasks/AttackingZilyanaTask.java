/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.LHelper;

@TaskDesc(name="Attacking Zilyana", priority=10)
public class AttackingZilyanaTask
extends Task {

    private final  l ag;
    private final  g af;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static void var4() {
        var2 = new String[var1[2]];
        t.var2[t.var1[0]] = "Attack";
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static void var6() {
        var1 = new int[5];
        t.var1[0] = (0x25 ^ 0x3F) & ~(0xB2 ^ 0xA8);
        t.var1[1] = 3;
        t.var1[2] = 1;
        t.var1[3] = 8 ^ 0x7E ^ (0x7B ^ 5);
        t.var1[4] = 2;
    }

    public boolean run() {
        t var7;
        if (t.var8(this.af.m() ? 1 : 0)) {
            return var1[0];
        }
        if (!t.var5(var7.af.l() ? 1 : 0) || t.var8(var7.ag.P() ? 1 : 0)) {
            return var1[0];
        }
        if (t.var8(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (t.var3(Players.getLocal().getInteracting())) {
            return var1[0];
        }
        NPC nPC = this.af.AttackingZilyanaTask().C();
        nPC.interact(var2[var1[0]]);
        this.sleep(var1[1]);
        return var1[2];
    }

    static {
        t.var6();
        t.var4();
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    @Inject
    public AttackingZilyanaTask(g g2, l l2) {
        this.af = g2;
        this.ag = l2;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

