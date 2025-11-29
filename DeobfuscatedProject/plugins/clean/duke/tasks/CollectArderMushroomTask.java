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
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Collect Arder Mushroom", priority=88, blocking=true)
public class CollectArderMushroomTask
extends Task {
    private final  a bq;
    private final  SquireDukeSucellus bp;

    private static boolean lllIlIlIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    @Inject
    public CollectArderMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.bp = squireDukeSucellus;
        this.bq = squireDukeSucellus.s();
    }

    private static boolean lllIlIlIIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        I.lllIlIlIIIlIlI();
        I.lllIlIlIIIlIIl();
    }

    private static boolean lllIlIlIIIllll(Object object) {
        return object != null;
    }

    private static void lllIlIlIIIlIIl() {
        lIllIlllllII = new String[lIllIlllllIl[6]];
        I.lIllIlllllII[I.lIllIlllllIl[0]] = "Arder powder";
        I.lIllIlllllII[I.lIllIlllllIl[1]] = "Arder mushrooms";
        I.lIllIlllllII[I.lIllIlllllIl[3]] = "Pick";
        I.lIllIlllllII[I.lIllIlllllIl[4]] = "Gate";
        I.lIllIlllllII[I.lIllIlllllIl[5]] = "Quick-escape";
    }

    private static boolean lllIlIlIIIlIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        if (I.lllIlIlIIIlIll(this.bq.v())) {
            return lIllIlllllIl[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (I.lllIlIlIIIlIll(tileObject.getName().equals(lIllIlllllII[lIllIlllllIl[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllllIl[1]];
                stringArray[I.lIllIlllllIl[0]] = lIllIlllllII[lIllIlllllIl[5]];
                if (I.lllIlIlIIIlIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllllIl[1];

                    if (-(132 + 71 - 26 + 22 ^ 127 + 103 - 121 + 86) <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlllllIl[0];
            return n2 != 0;
        });
        if (I.lllIlIlIIIllII(var2)) {
            return lIllIlllllIl[0];
        }
        Player var3 = Players.getLocal();
        if (I.lllIlIlIIIllII(var3)) {
            return lIllIlllllIl[0];
        }
        if (I.lllIlIlIIIlllI(b.b(var2).contains((Locatable)var3) ? 1 : 0)) {
            return lIllIlllllIl[0];
        }
        String[] stringArray = new String[lIllIlllllIl[1]];
        stringArray[I.lIllIlllllIl[0]] = lIllIlllllII[lIllIlllllIl[0]];
        Item var4 = Inventory.getFirst((String[])stringArray);
        if (I.lllIlIlIIIllll(var4) && I.lllIlIlIIlIIII(var4.getQuantity(), lIllIlllllIl[2])) {
            return lIllIlllllIl[0];
        }
        String[] stringArray2 = new String[lIllIlllllIl[1]];
        stringArray2[I.lIllIlllllIl[0]] = lIllIlllllII[lIllIlllllIl[1]];
        TileObject var5 = TileObjects.getNearest((String[])stringArray2);
        if (I.lllIlIlIIIllII(var5)) {
            return lIllIlllllIl[0];
        }
        var4_4.interact(lIllIlllllII[lIllIlllllIl[3]]);
        return lIllIlllllIl[1];
    }

    private static boolean lllIlIlIIIllII(Object object) {
        return object == null;
    }

    private static boolean lllIlIlIIIlllI(int n2) {
        return n2 == 0;
    }

}

