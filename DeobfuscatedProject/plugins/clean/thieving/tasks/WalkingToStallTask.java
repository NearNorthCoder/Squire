/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.GameEnum;

@TaskDesc(name="Walking to stall")
public class WalkingToStallTask
extends Task {
    
    private final  SquireThievingConfig aM;

        return String.valueOf(var1);
    }

    private static boolean lIllIIIlIllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIlllIIl(int n2) {
        return n2 != 0;
    }

    static {
        K.lIllIIIlIllIlll();
        K.lIllIIIlIllIllI();
    }

    @Inject
    public WalkingToStallTask(SquireThievingConfig squireThievingConfig) {
        this.aM = squireThievingConfig;
    }

    private static void lIllIIIlIllIllI() {
        lIIllIllIlIll = new String[lIIllIllIllII[1]];
        K.lIIllIllIlIll[K.lIIllIllIllII[0]] = "Walking to stall";
    }

    public boolean run() {
        K var2;
        if (K.lIllIIIlIlllIII((Object)this.aM.method(), (Object)b.STALLS)) {
            return lIIllIllIllII[0];
        }
        if (K.lIllIIIlIlllIIl(Bank.isOpen() ? 1 : 0)) {
            return lIIllIllIllII[0];
        }
        Player var3 = Players.getLocal();
        if (K.lIllIIIlIlllIlI(var3)) {
            return lIIllIllIllII[0];
        }
        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIllII[1]];
        worldAreaArray[K.lIIllIllIllII[0]] = var2.aM.stallTarget().p();
        if (K.lIllIIIlIlllIll(var3.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            Log.info((String)lIIllIllIlIll[lIIllIllIllII[0]]);
            Movement.walkTo((WorldPoint)var2.aM.stallTarget().z());

            return lIIllIllIllII[1];
        }
        return lIIllIllIllII[0];
    }

    private static boolean lIllIIIlIlllIlI(Object object) {
        return object == null;
    }

    private static boolean lIllIIIlIlllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIlIlllIII(Object object, Object object2) {
        return object != object2;
    }
}

