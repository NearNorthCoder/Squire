/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Filling the bellows")
public class FillingTheBellowsTask
extends Task {
    private  boolean fo;

    private static void lIIllIllIII() {
        lIllIIIII = new String[lIllIIIIl[1]];
        bd.lIllIIIII[bd.lIllIIIIl[0]] = "Suck";
        bd.lIllIIIII[bd.lIllIIIIl[2]] = "Suck";
    }

    static {
        bd.lIIllIllIIl();
        bd.lIIllIllIII();
    }

    private static boolean lIIllIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlllII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        bd lIllllIlllllIll;
        if (!bd.lIIllIllIlI(Players.getLocal().isAnimating() ? 1 : 0) || bd.lIIllIllIll(Players.getLocal().getInteracting())) {
            return lIllIIIIl[0];
        }
        if (bd.lIIllIllIlI(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIIIIl[0];
        }
        if (bd.lIIllIlllII(lIllllIlllllIll.ct() ? 1 : 0)) {
            return lIllIIIIl[0];
        }
        TileObject lIllllIlllllIlI = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIllIIIIl[2]];
            stringArray[bd.lIllIIIIl[0]] = lIllIIIII[lIllIIIIl[2]];
            return tileObject.hasAction(stringArray);
        });
        if (bd.lIIllIlllIl(lIllllIlllllIlI)) {
            return lIllIIIIl[0];
        }
        var1_1.interact(lIllIIIII[lIllIIIIl[0]]);
        this.sleep(lIllIIIIl[1]);
        return lIllIIIIl[2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean ct() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[lIllIIIIl[2]];
                nArray[bd.lIllIIIIl[0]] = lIllIIIIl[3];
                if (!bd.lIIllIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIllIIIIl[2]];
                nArray2[bd.lIllIIIIl[0]] = lIllIIIIl[4];
                if (!bd.lIIllIllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIllIIIIl[2]];
                nArray3[bd.lIllIIIIl[0]] = lIllIIIIl[5];
                if (!bd.lIIllIlllII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
            }
            n2 = lIllIIIIl[2];

            if ((0xCF ^ 0x91 ^ (0x2D ^ 0x77)) >= 0) return n2 != 0;
            return ((0x30 ^ 0x36 ^ (0 ^ 0x19)) & (95 + 77 - 167 + 143 ^ 133 + 26 - 34 + 14 ^ -1)) != 0;
        }
        n2 = lIllIIIIl[0];
        return n2 != 0;
    }

    private static boolean lIIllIlllIl(Object object) {
        return object == null;
    }

    private static boolean lIIllIllIll(Object object) {
        return object != null;
    }
}

