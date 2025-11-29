/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.b;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walk To Arder Mushroom", priority=89, blocking=true)
public class WalkToArderMushroomTask
extends Task {

    final  a bw;
    final  SquireDukeSucellus bv;

    private static boolean lllIIllIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        L.lllIIllIIllllI();
        L.lllIIllIIlllIl();
    }

    private static boolean lllIIllIlIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIllIlIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public WalkToArderMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.bv = squireDukeSucellus;
        this.bw = squireDukeSucellus.s();
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (L.lllIIllIIlllll(this.bw.v())) {
            return lIllIlIIIIII[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (L.lllIIllIIlllll(tileObject.getName().equals(lIllIIllllll[lIllIlIIIIII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIIIII[1]];
                stringArray[L.lIllIlIIIIII[0]] = lIllIIllllll[lIllIlIIIIII[3]];
                if (L.lllIIllIIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIIIII[1];

                    if (3 >= 3) return n2 != 0;
                    return ((162 + 107 - 121 + 54 ^ 30 + 19 - -75 + 29) & (0x59 ^ 0x4B ^ (0x11 ^ 0x50) ^ -1)) != 0;
                }
            }
            n2 = lIllIlIIIIII[0];
            return n2 != 0;
        });
        if (L.lllIIllIlIIIII(var2)) {
            return lIllIlIIIIII[0];
        }
        Player var3 = Players.getLocal();
        if (L.lllIIllIlIIIII(var3)) {
            return lIllIlIIIIII[0];
        }
        if (L.lllIIllIIlllll(b.b(var2).contains((Locatable)var3) ? 1 : 0)) {
            return lIllIlIIIIII[0];
        }
        String[] stringArray = new String[lIllIlIIIIII[1]];
        stringArray[L.lIllIlIIIIII[0]] = lIllIIllllll[lIllIlIIIIII[0]];
        Item var4 = Inventory.getFirst((String[])stringArray);
        if (L.lllIIllIlIIIIl(var4) && L.lllIIllIlIIIlI(var4.getQuantity(), lIllIlIIIIII[2])) {
            return lIllIlIIIIII[0];
        }
        if (!L.lllIIllIlIIIll(b.d(var2).contains((Locatable)var3) ? 1 : 0) || L.lllIIllIIlllll(b.g(var2).equals((Object)var3.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)b.e(var2));
            return lIllIlIIIIII[1];
        }
        Movement.setDestination((WorldPoint)b.g((TileObject)var1_1));
        return lIllIlIIIIII[1];
    }

    private static boolean lllIIllIlIIIII(Object object) {
        return object == null;
    }

    private static void lllIIllIIlllIl() {
        lIllIIllllll = new String[lIllIlIIIIII[4]];
        L.lIllIIllllll[L.lIllIlIIIIII[0]] = "Arder powder";
        L.lIllIIllllll[L.lIllIlIIIIII[1]] = "Gate";
        L.lIllIIllllll[L.lIllIlIIIIII[3]] = "Quick-escape";
    }

    private static boolean lllIIllIlIIIIl(Object object) {
        return object != null;
    }

    private static boolean lllIIllIIlllll(int n2) {
        return n2 != 0;
    }

}

