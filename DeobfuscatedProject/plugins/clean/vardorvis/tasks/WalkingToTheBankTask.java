/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Walking to the bank", priority=2147483597, blocking=true)
public class WalkingToTheBankTask
extends VardorvisTaskBase {

    private static boolean lIllllIlllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllllIlllIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIllllIlllIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllllIlllIIlII() {
        lIlIlIIlIIIll = new String[lIlIlIIlIIlII[5]];
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[0]] = "Quick-escape";
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[1]] = "Eat";
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[2]] = "Eat";
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[3]] = "Tendril";
        r.lIlIlIIlIIIll[r.lIlIlIIlIIlII[4]] = "Quick-escape";
    }

    @Override
    protected boolean l() {
        r var2;
        TileObject tileObject2;
        if (r.lIllllIlllIIllI(this.w.isInInstancedRegion() ? 1 : 0) && r.lIllllIlllIIlll(tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIllllIlllIIllI(tileObject.getName().equals(lIlIlIIlIIIll[lIlIlIIlIIlII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIIlII[1]];
                stringArray[r.lIlIlIIlIIlII[0]] = lIlIlIIlIIIll[lIlIlIIlIIlII[4]];
                if (r.lIllllIlllIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlIIlII[1];

                    if (((6 + 31 - -19 + 75 ^ 131 + 15 - -13 + 1) & (9 + 182 - 137 + 137 ^ 109 + 50 - 70 + 67 ^ -1)) <= 3) return n2 != 0;
                    return ((0x7C ^ 0x26 ^ (0x60 ^ 0)) & (0x58 ^ 0x15 ^ (0x72 ^ 5) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIIlIIlII[0];
            return n2 != 0;
        }))) {
            tileObject2.interact(lIlIlIIlIIIll[lIlIlIIlIIlII[0]]);
            return lIlIlIIlIIlII[1];
        }
        if (r.lIllllIlllIIllI(var2.t.earlyBank() ? 1 : 0) && r.lIllllIlllIIllI(var2.R() ? 1 : 0)) {
            return lIlIlIIlIIlII[1];
        }
        if (r.lIllllIlllIIllI(var2.P() ? 1 : 0)) {
            return lIlIlIIlIIlII[0];
        }
        Movement.walkTo((WorldPoint)this.t.bank().F());

        return lIlIlIIlIIlII[1];
    }

    private static boolean lIllllIlllIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean R() {
        void var1_1;
        if (r.lIllllIlllIlIII(Combat.getCurrentHealth(), this.t.eatAt())) {
            return lIlIlIIlIIlII[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlIIlIIlII[1]];
            stringArray[r.lIlIlIIlIIlII[0]] = lIlIlIIlIIIll[lIlIlIIlIIlII[2]];
            return item.hasAction(stringArray);
        });
        if (r.lIllllIlllIlIIl(var3)) {
            return lIlIlIIlIIlII[0];
        }
        var1_1.interact(lIlIlIIlIIIll[lIlIlIIlIIlII[1]]);
        return lIlIlIIlIIlII[1];
    }

    private static boolean lIllllIlllIIlll(Object object) {
        return object != null;
    }

    static {
        r.lIllllIlllIIlIl();
        r.lIllllIlllIIlII();
    }
}

