/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.GameEnum20;

@TaskDesc(name="Digging next brother", priority=100, blocking=true)
public class DiggingNextBrotherTask
extends Task {
    private final  SquireBarrows X;
    
    private final  a Y;
    
    private final  Client Z;

    private static boolean lIllIlIlIlllIl(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    public boolean run() {
        q var2;
        if (q.lIllIlIlIllIIl(this.X.u() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllIIl(var2.X.h() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllIIl(var2.Z.isInInstancedRegion() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllIlI(var2.X.m() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        d var3 = var2.X.n();
        if (q.lIllIlIlIllIlI(Movement.isRunEnabled() ? 1 : 0) && q.lIllIlIlIllIll(Movement.getRunEnergy(), llllIlIIllI[1])) {
            Movement.toggleRun();
        }
        WorldPoint var4 = var3.D();
        WorldPoint var5 = Players.getLocal().getWorldLocation();
        if (q.lIllIlIlIllIlI(Gear.isEquipped((int[])var2.Y.c(var3)) ? 1 : 0)) {
            Gear.swapTo((int[])var2.Y.c(var3));

        }
        int[] nArray = new int[llllIlIIllI[2]];
        nArray[q.llllIlIIllI[0]] = llllIlIIllI[3];
        Item var6 = Inventory.getFirst((int[])nArray);
        if (q.lIllIlIlIlllII(var6)) {
            int[] nArray2 = new int[llllIlIIllI[2]];
            nArray2[q.llllIlIIllI[0]] = llllIlIIllI[3];
            TileItem var7 = TileItems.getNearest((int[])nArray2);
            if (q.lIllIlIlIlllIl(var7)) {
                var7.interact(llllIlIIlIl[llllIlIIllI[0]]);
                var2.sleep(llllIlIIllI[4]);
                return llllIlIIllI[2];
            }
            Log.info((String)llllIlIIlIl[llllIlIIllI[2]]);
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllllI(var4.distanceTo2D(var5), llllIlIIllI[4])) {
            int[] nArray3 = new int[llllIlIIllI[2]];
            nArray3[q.llllIlIIllI[0]] = llllIlIIllI[3];
            Inventory.interact((String)llllIlIIlIl[llllIlIIllI[4]], (int[])nArray3);

            var2.sleep(llllIlIIllI[5]);
            var2.X.j();
            var2.X.b(var3);

            if (2 < 1) {
                return ((201 + 109 - 134 + 62 ^ 10 + 155 - -18 + 8) & (0x72 ^ 6 ^ (0x23 ^ 6) ^ -1)) != 0;
            }
        } else if (q.lIllIlIlIlllll(var5.getRegionID(), var4.getRegionID())) {
            Movement.setDestination((WorldPoint)var4);
        }
        return llllIlIIllI[2];
    }

    static {
        q.lIllIlIlIllIII();
        q.lIllIlIlIlIlll();
    }

    private static boolean lIllIlIlIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIlIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllIlIlIlIlll() {
        llllIlIIlIl = new String[llllIlIIllI[6]];
        q.llllIlIIlIl[q.llllIlIIllI[0]] = "Take";
        q.llllIlIIlIl[q.llllIlIIllI[2]] = "Player does not have a spade to dig with LOL";
        q.llllIlIIlIl[q.llllIlIIllI[4]] = "Dig";
    }

    private static boolean lIllIlIlIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIlllII(Object object) {
        return object == null;
    }

    @Inject
    public DiggingNextBrotherTask(SquireBarrows squireBarrows, a a2, Client client) {
        this.X = squireBarrows;
        this.Y = a2;
        this.Z = client;
    }

    private static boolean lIllIlIlIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

