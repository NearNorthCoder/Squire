/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import gg.squire.slayer.tasks.GameEnum;

@TaskDesc(name="Traversing to Turael", blocking=true)
public class TraversingToTuraelTask
extends Task {
    private final  SquireSkipperPlugin K;
    
    private final  SquireSkipperConfig L;

    static {
        n.var2();
    }

    @Inject
    public TraversingToTuraelTask(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.K = squireSkipperPlugin;
        this.L = squireSkipperConfig;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static void var2() {
        var1 = new int[5];
        n.var1[0] = (9 ^ 0x39) & ~(0x5B ^ 0x6B);
        n.var1[1] = 1;
        n.var1[2] = -(0xFFFFF3CF & 0x4E37) & (0xFFFFFF7F & 0x76FF);
        n.var1[3] = 0xFFFFDF77 & 0x2BFA;
        n.var1[4] = 0xFFFFFFFE & 0xDD1;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    public boolean run() {
        n var6;
        if (n.var4(this.K.h() ? 1 : 0)) {
            return var1[0];
        }
        if (n.var3(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        b var7 = var6.K.b();
        if (n.var5((Object)var7)) {
            int[] nArray = new int[var1[1]];
            nArray[n.var1[0]] = var1[2];
            NPC var8 = NPCs.getNearest((int[])nArray);
            if (n.var5(var8)) {
                Movement.walkTo((WorldPoint)new WorldPoint(var1[3], var1[4], var1[0]));
                0;
                return var1[1];
            }
        }
        return var1[0];
    }
}

