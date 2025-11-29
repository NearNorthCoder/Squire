/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.MiningTaskBase;
import gg.squire.mining.tasks.MiningManager;
import gg.squire.mining.tasks.GameEnum40;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Walking to veins", priority=10, blocking=true)
public class WalkingToVeinsTask
extends MiningTaskBase {

    private static final  RectangularArea ac;

    @Inject
    public WalkingToVeinsTask(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
    }

    static {
        F.lIIlIlIIIIlIIIl();
        F.lIIlIlIIIIlIIII();
        ac = new RectangularArea(llllllIIIIIl[8], llllllIIIIIl[9], llllllIIIIIl[10], llllllIIIIIl[11]);
    }

    private static boolean lIIlIlIIIIlIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIIIIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIIIlIIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1;
        F var2;
        Player player = Players.getLocal();
        if (!F.lIIlIlIIIIlIIlI(player) || !F.lIIlIlIIIIlIIll(player.isAnimating() ? 1 : 0) || F.lIIlIlIIIIlIlII(this.Z.I() ? 1 : 0)) {
            return llllllIIIIIl[0];
        }
        if (!F.lIIlIlIIIIlIIll(var2.Z.G() ? 1 : 0) || F.lIIlIlIIIIlIlII(var2.Z.WalkingToVeinsTask() ? 1 : 0)) {
            return llllllIIIIIl[0];
        }
        TileObject var3 = var2.u();
        if (F.lIIlIlIIIIlIIlI(var3) && F.lIIlIlIIIIlIlIl(var3.getWorldLocation().distanceTo((Locatable)var1), llllllIIIIIl[1]) && F.lIIlIlIIIIlIlII(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            return llllllIIIIIl[0];
        }
        if (F.lIIlIlIIIIlIIll(Movement.shouldWalk() ? 1 : 0)) {
            return llllllIIIIIl[0];
        }
        if (F.lIIlIlIIIIlIIll(Movement.isRunEnabled() ? 1 : 0) && F.lIIlIlIIIIlIllI(Movement.getRunEnergy(), llllllIIIIIl[2])) {
            Movement.toggleRun();
        }
        if (F.lIIlIlIIIIlIlll((Object)var2.X.mlmArea(), (Object)d.UPPER_FLOOR) && (!F.lIIlIlIIIIlIIll(ac.contains((Locatable)var1) ? 1 : 0) || F.lIIlIlIIIIlIIll(Vars.getBit((int)llllllIIIIIl[3])))) {
            int[] nArray = new int[llllllIIIIIl[4]];
            nArray[F.llllllIIIIIl[0]] = llllllIIIIIl[5];
            TileObject var4 = TileObjects.getNearest((int[])nArray);
            var4.interact(llllllIIIIII[llllllIIIIIl[0]]);
            var2.sleep(llllllIIIIIl[6]);
            return llllllIIIIIl[4];
        }
        Movement.walkTo((WorldPoint)this.X.mlmArea().g()[llllllIIIIIl[0]]);

        this.sleep(llllllIIIIIl[7]);
        return llllllIIIIIl[4];
    }

    private static boolean lIIlIlIIIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIlIIIIlIIlI(Object object) {
        return object != null;
    }

    private static void lIIlIlIIIIlIIII() {
        llllllIIIIII = new String[llllllIIIIIl[4]];
        F.llllllIIIIII[F.llllllIIIIIl[0]] = "Climb";
    }
}

