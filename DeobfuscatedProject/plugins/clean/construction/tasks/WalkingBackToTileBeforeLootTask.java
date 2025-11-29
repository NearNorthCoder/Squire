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
    
    private final  SquireLooter eK;
    private final  LooterConfig eL;

    private static boolean lIlIllIlIII(int n2) {
        return n2 != 0;
    }

    static {
        aQ.lIlIllIIllI();
    }

    private static boolean lIlIllIIlll(int n2) {
        return n2 == 0;
    }

    @Inject
    public WalkingBackToTileBeforeLootTask(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eK = squireLooter;
        this.eL = looterConfig;
    }

    public boolean run() {
        aQ lIllIllIIllIlII;
        if (aQ.lIlIllIIlll(this.eL.safespot() ? 1 : 0)) {
            return llIIIlllI[0];
        }
        Player lIllIllIIllIIll = Players.getLocal();
        if (aQ.lIlIllIlIII(lIllIllIIllIIll.isMoving() ? 1 : 0)) {
            return llIIIlllI[0];
        }
        if (aQ.lIlIllIlIII(lIllIllIIllIIll.getWorldLocation().equals((Object)lIllIllIIllIlII.eK.cf()) ? 1 : 0)) {
            return llIIIlllI[0];
        }
        if (!aQ.lIlIllIlIIl(lIllIllIIllIlII.eK.cf()) || aQ.lIlIllIIlll(lIllIllIIllIlII.eK.cf().isInScene(Static.getClient()) ? 1 : 0)) {
            return llIIIlllI[0];
        }
        Movement.walkTo((WorldPoint)this.eK.cf());

        this.sleep(llIIIlllI[1]);
        return llIIIlllI[2];
    }

    private static boolean lIlIllIlIIl(Object object) {
        return object != null;
    }

}

