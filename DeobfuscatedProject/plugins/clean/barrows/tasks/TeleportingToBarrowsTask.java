/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Teleporting to barrows", priority=100)
public class TeleportingToBarrowsTask
extends Task {

    private final  SquireBarrows ag;

    static {
        u.lIllIlIIllIlIl();
        u.lIllIlIIllIlII();
    }

    private static boolean lIllIlIIllIllI(Object object, Object object2) {
        return object != object2;
    }

    private static void lIllIlIIllIlII() {
        llllIIllllI = new String[llllIIlllll[6]];
        u.llllIIllllI[u.llllIIlllll[0]] = "Portal Nexus";
        u.llllIIllllI[u.llllIIlllll[2]] = "Barrows";
        u.llllIIllllI[u.llllIIlllll[3]] = "Barrows";
    }

    private static boolean lIllIlIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private boolean J() {
        WorldPoint worldPoint = new WorldPoint(llllIIlllll[4], llllIIlllll[5], llllIIlllll[0]);
        if (u.lIllIlIIlllIII(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIlllll[2];
        }
        Movement.walkTo((WorldPoint)worldPoint);

        return llllIIlllll[2];
    }

    private static boolean lIllIlIIlllIII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIlIIlllIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIlIIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public TeleportingToBarrowsTask(SquireBarrows squireBarrows) {
        this.ag = squireBarrows;
    }

    private static boolean lIllIlIIllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        block9: {
            u var2;
            block8: {
                if (u.lIllIlIIllIllI(Game.getState(), GameState.LOGGED_IN)) {
                    return llllIIlllll[0];
                }
                if (u.lIllIlIIllIlll(var2.ag.TeleportingToBarrowsTask() ? 1 : 0)) {
                    return llllIIlllll[0];
                }
                if (u.lIllIlIIlllIII(Movement.isRunEnabled() ? 1 : 0) && u.lIllIlIIlllIIl(Movement.getRunEnergy(), llllIIlllll[1])) {
                    Movement.toggleRun();
                }
                if (!u.lIllIlIIlllIII(var2.ag.h() ? 1 : 0) || u.lIllIlIIllIlll(var2.ag.m() ? 1 : 0)) {
                    return llllIIlllll[0];
                }
                String[] stringArray = new String[llllIIlllll[2]];
                stringArray[u.llllIIlllll[0]] = llllIIllllI[llllIIlllll[0]];
                TileObject var3 = TileObjects.getNearest((String[])stringArray);
                if (!u.lIllIlIIlllIlI(var3)) break block8;
                String[] stringArray2 = new String[llllIIlllll[2]];
                stringArray2[u.llllIIlllll[0]] = llllIIllllI[llllIIlllll[2]];
                if (!u.lIllIlIIlllIII(var3.hasAction(stringArray2) ? 1 : 0)) break block9;
            }
            return var2.J();
        }
        if (u.lIllIlIIllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
            return llllIIlllll[0];
        }
        var1_1.interact(llllIIllllI[llllIIlllll[3]]);
        return llllIIlllll[2];
    }
}

