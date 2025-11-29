/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.rangingguild.SquireRangingGuild;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Shooting Target")
public class ShootingTargetTask
extends Task {

    private final  SquireRangingGuild ga;

    private static void lIIIIIIllI() {
        lIIIIllI = new String[lIIIIlll[4]];
        bx.lIIIIllI[bx.lIIIIlll[0]] = "Wield";
        bx.lIIIIllI[bx.lIIIIlll[1]] = "Fire-at";
    }

    static {
        bx.lIIIIIIlll();
        bx.lIIIIIIllI();
    }

    private static boolean lIIIIIlIII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(lllIIlIIIIIlIII);
    }

    private static boolean lIIIIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        if (bx.lIIIIIlIII(this.ga.cq() ? 1 : 0)) {
            return lIIIIlll[0];
        }
        int[] nArray = new int[lIIIIlll[1]];
        nArray[bx.lIIIIlll[0]] = lIIIIlll[2];
        if (bx.lIIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIIlll[1]];
            nArray2[bx.lIIIIlll[0]] = lIIIIlll[2];
            if (bx.lIIIIIlIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIIlll[1]];
                nArray3[bx.lIIIIlll[0]] = lIIIIlll[2];
                Inventory.getFirst((int[])nArray3).interact(lIIIIllI[lIIIIlll[0]]);
            }
        }
        int[] nArray4 = new int[lIIIIlll[1]];
        nArray4[bx.lIIIIlll[0]] = lIIIIlll[3];
        TileObject lllIIlIIIIlIlIl = TileObjects.getNearest((int[])nArray4);
        if (bx.lIIIIIlIlI(lllIIlIIIIlIlIl)) {
            lllIIlIIIIlIlIl.interact(lIIIIllI[lIIIIlll[1]]);
        }
        return lIIIIlll[1];
    }

    @Inject
    public ShootingTargetTask(SquireRangingGuild squireRangingGuild) {
        this.ga = squireRangingGuild;
    }

    private static boolean lIIIIIlIlI(Object object) {
        return object != null;
    }
}

