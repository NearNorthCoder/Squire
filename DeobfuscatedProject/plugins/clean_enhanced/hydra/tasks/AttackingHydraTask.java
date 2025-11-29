/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Attacking hydra")
public class AttackingHydraTask
extends Task {
    private final  e ay;

    private final  SquireAlchemicalHydraConfig az;
    private final  a ax;

    private static void var3() {
        var2 = new String[var1[1]];
        s.var2[s.var1[0]] = "Attack";
    }

    static {
        s.var4();
        s.var3();
    }

    private static boolean var5(Object object) {
        return object == null;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    @Inject
    public AttackingHydraTask(a a2, e e2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.ax = a2;
        this.ay = e2;
        this.az = squireAlchemicalHydraConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s var13;
        if (s.var14(this.az.attack() ? 1 : 0)) {
            return var1[0];
        }
        h var15 = var13.ax.k();
        if (!s.var12(var15) || s.var14(var13.ax.g() ? 1 : 0)) {
            return var1[0];
        }
        NPC var16 = var15.K();
        if (s.var5(var15.K())) {
            return var1[0];
        }
        if (s.var12(Players.getLocal().getInteracting())) {
            return var1[0];
        }
        if (s.var17(var15.Q() ? 1 : 0) && s.var17(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[0];
        }
        var2_2.interact(var2[var1[0]]);
        this.sleep(Math.min(this.ay.w() - var1[1], var1[2]));
        return var1[1];
    }

    private static void var4() {
        var1 = new int[4];
        s.var1[0] = (108 + 109 - 146 + 184 ^ 28 + 101 - -3 + 30) & (19 + 91 - -50 + 95 ^ 93 + 149 - 140 + 60 ^ -1);
        s.var1[1] = 1;
        s.var1[2] = 85 + 117 - 92 + 35 ^ 16 + 4 - -27 + 102;
        s.var1[3] = 2;
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }
}

