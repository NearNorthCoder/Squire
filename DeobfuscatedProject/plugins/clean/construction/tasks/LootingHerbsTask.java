/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting Herbs")
public class LootingHerbsTask
extends Task {
    private final  SquireLooter eF;
    private final  LooterConfig eE;

    private static void lllIllIII() {
        llllIlI = new String[llllIll[3]];
        aN.llllIlI[aN.llllIll[0]] = "Take";
        aN.llllIlI[aN.llllIll[1]] = "Take";
    }

    @Inject
    public LootingHerbsTask(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eE = looterConfig;
        this.eF = squireLooter;
    }

    private static boolean lllIlllIl(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        aN lllIIlllIIlIIlI;
        if (aN.lllIllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llllIll[0];
        }
        Iterator<aH> lllIIlllIIlIIIl = lllIIlllIIlIIlI.eF.cg().iterator();
        while (aN.lllIllIlI(lllIIlllIIlIIIl.hasNext() ? 1 : 0)) {
            aH lllIIlllIIlIIII = lllIIlllIIlIIIl.next();
            int[] nArray = new int[llllIll[1]];
            nArray[aN.llllIll[0]] = lllIIlllIIlIIII.P();
            TileItem lllIIlllIIIllll = TileItems.getFirstAt((WorldPoint)lllIIlllIIlIIII.cd(), (int[])nArray);
            if (aN.lllIllIll(lllIIlllIIIllll)) {
                if (aN.lllIlllII(lllIIlllIIIllll.distanceTo(Players.getLocal().getWorldLocation()), lllIIlllIIlIIlI.eE.lootRange())) {

                    if ((0x9B ^ 0x9F) != 0) continue;
                    return false;
                }
                if (aN.lllIlllIl(Inventory.isFull() ? 1 : 0)) {
                    lllIIlllIIIllll.interact(llllIlI[llllIll[0]]);
                }
                if (aN.lllIllIlI(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray2 = new int[llllIll[1]];
                    nArray2[aN.llllIll[0]] = llllIll[2];
                    if (aN.lllIllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                        lllIIlllIIIllll.interact(llllIlI[llllIll[1]]);
                    }
                    return llllIll[1];
                }
            }

            if (2 != (0xE4 ^ 0xB5 ^ (0x22 ^ 0x77))) continue;
            return ((0x51 ^ 0x71 ^ (0x3D ^ 0x7D)) & (16 + 66 - -93 + 42 ^ 15 + 16 - -90 + 64 ^ -1)) != 0;
        }
        return llllIll[1];
    }

    private static boolean lllIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIllIll(Object object) {
        return object != null;
    }

    private static boolean lllIllllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lllIIlllIIIIIlI);
    }

    static {
        aN.lllIllIIl();
        aN.lllIllIII();
    }
}

