/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Walking back to tile before loot", priority=-100)
public class WalkingBackToTileBeforeLootTask
extends Task {
    private static  int[] llIIIlllI;
    private final  SquireLooter eK;
    private final  LooterConfig eL;

    private static boolean var1(int n2) {
        return n2 != 0;
    }

    static {
        aQ.var2();
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    @Inject
    public WalkingBackToTileBeforeLootTask(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eK = squireLooter;
        this.eL = looterConfig;
    }

    public boolean run() {
        aQ var4;
        if (aQ.var3(this.eL.safespot() ? 1 : 0)) {
            return llIIIlllI[0];
        }
        Player var5 = Players.getLocal();
        if (aQ.var1(var5.isMoving() ? 1 : 0)) {
            return llIIIlllI[0];
        }
        if (aQ.var1(var5.getWorldLocation().equals((Object)var4.eK.cf()) ? 1 : 0)) {
            return llIIIlllI[0];
        }
        if (!aQ.var6(var4.eK.cf()) || aQ.var3(var4.eK.cf().isInScene(Static.getClient()) ? 1 : 0)) {
            return llIIIlllI[0];
        }
        Movement.walkTo((WorldPoint)this.eK.cf());
        0;
        this.sleep(llIIIlllI[1]);
        return llIIIlllI[2];
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    private static void var2() {
        llIIIlllI = new int[3];
        aQ.llIIIlllI[0] = (138 + 34 - -3 + 11 ^ 104 + 119 - 189 + 115) & (151 + 163 - 278 + 137 ^ 77 + 26 - -22 + 5 ^ -1);
        aQ.llIIIlllI[1] = 0xE7 ^ 0xB0 ^ (0xDF ^ 0x8C);
        aQ.llIIIlllI[2] = 1;
    }
}

