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
package gg.squire.bandos.tasks;

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
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.EHelper;

@Singleton
@TaskDesc(name="Placing cannon base", priority=20, blocking=true)
public class PlacingCannonBaseTask
extends Task {
    private static final  int ar;
    
    private  int aw;
    private final  d av;
    private static final  int as;
    private static final  int at;
    
    private final  e au;

    private static void lIlIlIllllIlIl() {
        llIllllIIII = new String[llIllllIIlI[10]];
        w.llIllllIIII[w.llIllllIIlI[0]] = "Eat";
        w.llIllllIIII[w.llIllllIIlI[3]] = "Pick-up";
        w.llIllllIIII[w.llIllllIIlI[9]] = "Set-up";
        w.llIllllIIII[w.llIllllIIlI[7]] = "Eat";
    }

    @Inject
    public PlacingCannonBaseTask(e e2, d d2) {
        this.aw = llIllllIIlI[0];
        this.au = e2;
        this.av = d2;
    }

    private static boolean lIlIllIIIIIIII(int n2) {
        return n2 != 0;
    }

    private boolean M() {
        return llIllllIIlI[0];
    }

    public int Q() {
        return this.aw;
    }

    static {
        w.lIlIlIllllllII();
        w.lIlIlIllllIlIl();
        ar = llIllllIIlI[6];
        as = llIllllIIlI[1];
        at = llIllllIIlI[2];
    }

    public boolean run() {
        w var1;
        if (w.lIlIlIllllllIl(this.au.t() ? 1 : 0)) {
            return llIllllIIlI[0];
        }
        int var2 = Static.getClient().getTickCount();
        if (w.lIlIlIllllllIl(var1.au.s() ? 1 : 0) && w.lIlIlIllllllIl(var1.au.v() ? 1 : 0) && w.lIlIlIlllllllI(var2, var1.aw) && (!w.lIlIlIllllllll(var1.au.r(), llIllllIIlI[1]) || w.lIlIlIlllllllI(var2 - var1.aw, llIllllIIlI[2])) && w.lIlIllIIIIIIII(var1.au.y() ? 1 : 0)) {
            Item var3;
            if (w.lIlIllIIIIIIII(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[llIllllIIlI[3]];
                nArray[w.llIllllIIlI[0]] = llIllllIIlI[4];
                var3 = Inventory.getFirst((int[])nArray);
                if (w.lIlIllIIIIIIIl(var3)) {
                    var3 = Inventory.getFirst(item -> item.hasAction(llIllllIIII[llIllllIIlI[7]]::equals));
                }
                if (w.lIlIllIIIIIIIl(var3)) {
                    return llIllllIIlI[0];
                }
                var3.interact(llIllllIIII[llIllllIIlI[0]]);
            }
            int[] nArray = new int[llIllllIIlI[3]];
            nArray[w.llIllllIIlI[0]] = llIllllIIlI[5];
            var3 = TileObjects.getNearest((int[])nArray);
            var3.interact(llIllllIIII[llIllllIIlI[3]]);
            return llIllllIIlI[3];
        }
        if (w.lIlIllIIIIIIlI(var2 + llIllllIIlI[6] - llIllllIIlI[7], var1.aw)) {
            Movement.walkTo((WorldPoint)var1.av.p());

        }
        if (w.lIlIllIIIIIIII(var1.au.y() ? 1 : 0)) {
            return llIllllIIlI[0];
        }
        int[] nArray = new int[llIllllIIlI[3]];
        nArray[w.llIllllIIlI[0]] = llIllllIIlI[8];
        if (w.lIlIlIllllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1.M();
        }
        Player var3 = Players.getLocal();
        WorldPoint var4 = var1.av.o();
        if (w.lIlIllIIIIIIII(var3.getWorldLocation().equals((Object)var4) ? 1 : 0)) {
            int[] nArray2 = new int[llIllllIIlI[3]];
            nArray2[w.llIllllIIlI[0]] = llIllllIIlI[8];
            Item var5 = Inventory.getFirst((int[])nArray2);
            var5.interact(llIllllIIII[llIllllIIlI[9]]);
            var1.aw = var2 + llIllllIIlI[6];
            return llIllllIIlI[3];
        }
        if (w.lIlIlIllllllIl(var3.isMoving() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var4);

        }
        return llIllllIIlI[3];
    }

    private static boolean lIlIllIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var6);
    }

    private static boolean lIlIlIlllllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIllllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIllllllIl(int n2) {
        return n2 == 0;
    }

}

