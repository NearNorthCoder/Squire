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
        n.lIlllIllIIIlIlI();
    }

    @Inject
    public TraversingToTuraelTask(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.K = squireSkipperPlugin;
        this.L = squireSkipperConfig;
    }

    private static boolean lIlllIllIIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIllIIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIllIIIllIl(Object object) {
        return object == null;
    }

    public boolean run() {
        n var1;
        if (n.lIlllIllIIIlIll(this.K.h() ? 1 : 0)) {
            return lIlIIlIlIlIII[0];
        }
        if (n.lIlllIllIIIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlIlIlIII[0];
        }
        b var2 = var1.K.b();
        if (n.lIlllIllIIIllIl((Object)var2)) {
            int[] nArray = new int[lIlIIlIlIlIII[1]];
            nArray[n.lIlIIlIlIlIII[0]] = lIlIIlIlIlIII[2];
            NPC var3 = NPCs.getNearest((int[])nArray);
            if (n.lIlllIllIIIllIl(var3)) {
                Movement.walkTo((WorldPoint)new WorldPoint(lIlIIlIlIlIII[3], lIlIIlIlIlIII[4], lIlIIlIlIlIII[0]));

                return lIlIIlIlIlIII[1];
            }
        }
        return lIlIIlIlIlIII[0];
    }
}

