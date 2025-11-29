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

@TaskDesc(name="Exit Arder Area", priority=87, blocking=true)
public class ExitArderAreaTask
extends Task {
    final  SquireDukeSucellus bt;
    final  a bu;

    private static boolean lllIlIIIIlllIl(Object object) {
        return object == null;
    }

    private static boolean lllIlIIIIllllI(Object object) {
        return object != null;
    }

    static {
        K.lllIlIIIIllIll();
        K.lllIlIIIIllIlI();
    }

    private static void lllIlIIIIllIlI() {
        lIllIlIllIll = new String[lIllIlIlllII[4]];
        K.lIllIlIllIll[K.lIllIlIlllII[0]] = "Arder powder";
        K.lIllIlIllIll[K.lIllIlIlllII[1]] = "Gate";
        K.lIllIlIllIll[K.lIllIlIlllII[3]] = "Quick-escape";
    }

    @Inject
    public ExitArderAreaTask(SquireDukeSucellus squireDukeSucellus) {
        this.bt = squireDukeSucellus;
        this.bu = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (K.lllIlIIIIlllII(this.bu.v())) {
            return lIllIlIlllII[0];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (K.lllIlIIIIlllII(tileObject.getName().equals(lIllIlIllIll[lIllIlIlllII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIlllII[1]];
                stringArray[K.lIllIlIlllII[0]] = lIllIlIllIll[lIllIlIlllII[3]];
                if (K.lllIlIIIIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIlllII[1];

                    if (1 != (0x42 ^ 0x46)) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlIlllII[0];
            return n2 != 0;
        });
        if (K.lllIlIIIIlllIl(var1)) {
            return lIllIlIlllII[0];
        }
        Player var2 = Players.getLocal();
        if (K.lllIlIIIIlllIl(var2)) {
            return lIllIlIlllII[0];
        }
        if (K.lllIlIIIIlllII(b.i(var1).contains((Locatable)var2) ? 1 : 0)) {
            return lIllIlIlllII[0];
        }
        String[] stringArray = new String[lIllIlIlllII[1]];
        stringArray[K.lIllIlIlllII[0]] = lIllIlIllIll[lIllIlIlllII[0]];
        Item var3 = Inventory.getFirst((String[])stringArray);
        if (!K.lllIlIIIIllllI(var3) || K.lllIlIIIIlllll(var3.getQuantity(), lIllIlIlllII[2])) {
            return lIllIlIlllII[0];
        }
        if (K.lllIlIIIIlllII(b.b(var1).contains((Locatable)var2) ? 1 : 0) && K.lllIlIIIlIIIII(b.f(var1).equals((Object)var2.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)b.f(var1));
            return lIllIlIlllII[1];
        }
        Movement.setDestination((WorldPoint)b.j((TileObject)var1_1));
        return lIllIlIlllII[1];
    }

    private static boolean lllIlIIIIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIlIIIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIIlIIIII(int n2) {
        return n2 == 0;
    }

}

