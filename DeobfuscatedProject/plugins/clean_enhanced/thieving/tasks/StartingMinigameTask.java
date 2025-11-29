/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Starting Minigame", priority=50)
public class StartingMinigameTask
extends Task {
    
    private final  a I;

    static {
        n.var3();
        n.var4();
    }

    private static void var3() {
        var1 = new int[5];
        n.var1[0] = 1;
        n.var1[1] = (0x1A ^ 0x40) & ~(0x11 ^ 0x4B);
        n.var1[2] = -(0xFFFFDB1D & 0x34E3) & (0xFFFF96FB & 0x7FF7);
        n.var1[3] = 0x84 ^ 0x90;
        n.var1[4] = 2;
    }

    public boolean run() {
        int[] nArray = new int[var1[0]];
        nArray[n.var1[1]] = var1[2];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (n.var5(nPC)) {
            return var1[1];
        }
        if (n.var6(Movement.shouldWalk() ? 1 : 0)) {
            return var1[1];
        }
        if (n.var6(Movement.isRunEnabled() ? 1 : 0) && n.var7(Movement.getRunEnergy(), var1[3])) {
            Movement.toggleRun();
        }
        this.I.a(var1[1]);
        nPC.interact(var2[var1[1]]);
        return var1[0];
    }

    private static void var4() {
        var2 = new String[var1[0]];
        n.var2[n.var1[1]] = "Start-minigame";
    }

    @Inject
    public StartingMinigameTask(a a2) {
        this.I = a2;
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean var5(Object object) {
        return object == null;
    }
}

