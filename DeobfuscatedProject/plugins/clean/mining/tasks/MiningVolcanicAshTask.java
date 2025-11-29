/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining volcanic ash", priority=5)
public class MiningVolcanicAshTask
extends Task {
    
    private final  SquireMinerConfig aq;

        return String.valueOf(var1);
    }

    private static boolean lIIlIlIIlIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (N.lIIlIlIIlIIIIII((Object)this.aq.activity(), (Object)a.VOLCANIC_ASH)) {
            return llllllIlIIlI[0];
        }
        Player var2 = Players.getLocal();
        if (!N.lIIlIlIIlIIIIIl(Inventory.isFull() ? 1 : 0) || !N.lIIlIlIIlIIIIlI(var2) || !N.lIIlIlIIlIIIIIl(var2.isAnimating() ? 1 : 0) || N.lIIlIlIIlIIIIll(var2.isMoving() ? 1 : 0)) {
            return llllllIlIIlI[0];
        }
        if (N.lIIlIlIIlIIIIIl(Movement.isRunEnabled() ? 1 : 0) && N.lIIlIlIIlIIIlII(Movement.getRunEnergy(), llllllIlIIlI[1])) {
            Movement.toggleRun();
        }
        int[] nArray = new int[llllllIlIIlI[2]];
        nArray[N.llllllIlIIlI[0]] = llllllIlIIlI[3];
        TileObject var3 = TileObjects.getNearest((int[])nArray);
        if (N.lIIlIlIIlIIIlIl(var3)) {
            System.out.println(llllllIlIIIl[llllllIlIIlI[0]]);
            return llllllIlIIlI[0];
        }
        var2_2.interact(llllllIlIIIl[llllllIlIIlI[2]]);
        return llllllIlIIlI[2];
    }

    @Inject
    public MiningVolcanicAshTask(SquireMinerConfig squireMinerConfig) {
        this.aq = squireMinerConfig;
    }

    private static boolean lIIlIlIIlIIIlIl(Object object) {
        return object == null;
    }

    private static void lIIlIlIIIlllllI() {
        llllllIlIIIl = new String[llllllIlIIlI[4]];
        N.llllllIlIIIl[N.llllllIlIIlI[0]] = "No volcanic ash pile found";
        N.llllllIlIIIl[N.llllllIlIIlI[2]] = "Mine";
    }

    private static boolean lIIlIlIIlIIIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        N.lIIlIlIIIllllll();
        N.lIIlIlIIIlllllI();
    }

    private static boolean lIIlIlIIlIIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIIlIIIIIl(int n2) {
        return n2 == 0;
    }
}

