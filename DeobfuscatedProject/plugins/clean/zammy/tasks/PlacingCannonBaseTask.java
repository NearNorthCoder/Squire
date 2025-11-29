/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Placing cannon base", priority=20, blocking=true)
@Singleton
public class PlacingCannonBaseTask
extends Task {
    private static final  int az;
    private final  c aD;
    private static final  int aA;
    private  int aE;
    private static final  int aB;

    private final  l aC;

    public int Q() {
        return this.aE;
    }

    private static boolean llIIIllIIIlIlII(int n2) {
        return n2 != 0;
    }

    private boolean N() {
        return lIllIIlIlIlIl[0];
    }

    private static boolean llIIIllIIIlIlIl(Object object) {
        return object == null;
    }

    @Inject
    public PlacingCannonBaseTask(l l2, c c2) {
        this.aE = lIllIIlIlIlIl[0];
        this.aC = l2;
        this.aD = c2;
    }

    public boolean run() {
        B var1;
        if (B.llIIIllIIIlIIIl(this.aC.PlacingCannonBaseTask() ? 1 : 0)) {
            return lIllIIlIlIlIl[0];
        }
        int var2 = Static.getClient().getTickCount();
        if (B.llIIIllIIIlIIIl(var1.aC.A() ? 1 : 0) && B.llIIIllIIIlIIIl(var1.aC.D() ? 1 : 0) && B.llIIIllIIIlIIlI(var2, var1.aE) && (!B.llIIIllIIIlIIll(var1.aC.z(), lIllIIlIlIlIl[1]) || B.llIIIllIIIlIIlI(var2 - var1.aE, lIllIIlIlIlIl[2])) && B.llIIIllIIIlIlII(var1.aC.G() ? 1 : 0)) {
            Item var3;
            if (B.llIIIllIIIlIlII(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[lIllIIlIlIlIl[3]];
                nArray[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[4];
                var3 = Inventory.getFirst((int[])nArray);
                if (B.llIIIllIIIlIlIl(var3)) {
                    var3 = Inventory.getFirst(item -> item.hasAction(lIllIIlIlIIll[lIllIIlIlIlIl[7]]::equals));
                }
                if (B.llIIIllIIIlIlIl(var3)) {
                    return lIllIIlIlIlIl[0];
                }
                var3.interact(lIllIIlIlIIll[lIllIIlIlIlIl[0]]);
            }
            int[] nArray = new int[lIllIIlIlIlIl[3]];
            nArray[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[5];
            var3 = TileObjects.getNearest((int[])nArray);
            var3.interact(lIllIIlIlIIll[lIllIIlIlIlIl[3]]);
            return lIllIIlIlIlIl[3];
        }
        if (B.llIIIllIIIlIllI(var2 + lIllIIlIlIlIl[6] - lIllIIlIlIlIl[7], var1.aE)) {
            Movement.walkTo((WorldPoint)var1.aD.i());

        }
        if (B.llIIIllIIIlIlII(var1.aC.G() ? 1 : 0)) {
            return lIllIIlIlIlIl[0];
        }
        int[] nArray = new int[lIllIIlIlIlIl[3]];
        nArray[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[8];
        if (B.llIIIllIIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1.N();
        }
        Player var3 = Players.getLocal();
        WorldPoint var4 = var1.aD.h();
        if (B.llIIIllIIIlIlII(var3.getWorldLocation().equals((Object)var4) ? 1 : 0)) {
            int[] nArray2 = new int[lIllIIlIlIlIl[3]];
            nArray2[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[8];
            Item var5 = Inventory.getFirst((int[])nArray2);
            var5.interact(lIllIIlIlIIll[lIllIIlIlIlIl[9]]);
            var1.aE = var2 + lIllIIlIlIlIl[6];
            return lIllIIlIlIlIl[3];
        }
        if (B.llIIIllIIIlIIIl(var3.isMoving() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var4);

        }
        return lIllIIlIlIlIl[3];
    }

    private static boolean llIIIllIIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var6);
    }

    static {
        B.llIIIllIIIlIIII();
        B.llIIIllIIIIllII();
        aB = lIllIIlIlIlIl[2];
        az = lIllIIlIlIlIl[6];
        aA = lIllIIlIlIlIl[1];
    }

    private static boolean llIIIllIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIllIIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIllIIIIllII() {
        lIllIIlIlIIll = new String[lIllIIlIlIlIl[10]];
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[0]] = "Eat";
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[3]] = "Pick-up";
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[9]] = "Set-up";
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[7]] = "Eat";
    }
}

