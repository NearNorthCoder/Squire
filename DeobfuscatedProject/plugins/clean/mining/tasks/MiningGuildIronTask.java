/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Mining guild iron")
public class MiningGuildIronTask
extends Task {
    
    private static final  int[] G;
    private final  SquireMinerConfig H;
    
    private static final  WorldPoint F;

    private static boolean lIIlIlIIlIlIlll(int n2) {
        return n2 == 0;
    }

    @Inject
    public MiningGuildIronTask(SquireMinerConfig squireMinerConfig) {
        this.H = squireMinerConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (v.lIIlIlIIlIlIlIl((Object)this.H.activity(), (Object)a.GUILD_IRON)) {
            return llllllIlIllI[0];
        }
        if (v.lIIlIlIIlIlIllI(Inventory.isFull() ? 1 : 0)) {
            return llllllIlIllI[0];
        }
        if (v.lIIlIlIIlIlIlll(F.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (v.lIIlIlIIlIlIllI(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)F);

            }
            return llllllIlIllI[1];
        }
        if (v.lIIlIlIIlIlIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllIlIllI[0];
        }
        TileObject var1 = TileObjects.getFirstSurrounding((WorldPoint)F, (int)llllllIlIllI[2], (int[])G);
        if (v.lIIlIlIIlIllIII(var1)) {
            return llllllIlIllI[0];
        }
        var1_1.interact(llllllIlIlIl[llllllIlIllI[0]]);
        this.sleep(llllllIlIllI[2]);
        return llllllIlIllI[1];
    }

    private static boolean lIIlIlIIlIlIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIlIIlIlIIll() {
        llllllIlIlIl = new String[llllllIlIllI[1]];
        v.llllllIlIlIl[v.llllllIlIllI[0]] = "Mine";
    }

    static {
        v.lIIlIlIIlIlIlII();
        v.lIIlIlIIlIlIIll();
        F = new WorldPoint(llllllIlIllI[3], llllllIlIllI[4], llllllIlIllI[0]);
        int[] nArray = new int[llllllIlIllI[2]];
        nArray[v.llllllIlIllI[0]] = llllllIlIllI[5];
        nArray[v.llllllIlIllI[1]] = llllllIlIllI[6];
        G = nArray;
    }

    private static boolean lIIlIlIIlIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIllIII(Object object) {
        return object == null;
    }
}

