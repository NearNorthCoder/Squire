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
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Attacking bandos", priority=10)
public class AttackingBandosTask
extends Task {
    private final  e M;
    private final  d N;

    @Inject
    public AttackingBandosTask(e e2, d d2) {
        this.M = e2;
        this.N = d2;
    }

    public boolean run() {
        m var3;
        if (!m.var4(this.M.t() ? 1 : 0) || m.var5(this.M.y() ? 1 : 0)) {
            return var1[0];
        }
        if (m.var5(var3.M.s() ? 1 : 0)) {
            return var1[0];
        }
        if (m.var5(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (m.var6(var3.N.AttackingBandosTask())) {
            return var1[0];
        }
        if (m.var7(Players.getLocal().getInteracting())) {
            return var1[0];
        }
        NPC nPC = this.M.z().c();
        nPC.interact(var2[var1[0]]);
        this.sleep(var1[1]);
        return var1[2];
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    static {
        m.var14();
        m.var15();
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static void var14() {
        var1 = new int[4];
        m.var1[0] = 3 & (3 ^ -1);
        m.var1[1] = 3;
        m.var1[2] = 1;
        m.var1[3] = 2;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static void var15() {
        var2 = new String[var1[2]];
        m.var2[m.var1[0]] = "Attack";
    }
}

