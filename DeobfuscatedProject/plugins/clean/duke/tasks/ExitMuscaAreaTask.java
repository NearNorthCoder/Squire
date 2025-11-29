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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Exit Musca Area", priority=97, blocking=true)
public class ExitMuscaAreaTask
extends Task {
    
    final  a bC;
    final  SquireDukeSucellus bB;

    static {
        O.lllIIlllIIllll();
        O.lllIIlllIIlllI();
    }

    private static boolean lllIIlllIlIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (O.lllIIlllIlIIII(this.bC.w())) {
            return lIllIlIIllII[0];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (O.lllIIlllIlIIII(tileObject.getName().equals(lIllIlIIlIll[lIllIlIIllII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIllII[1]];
                stringArray[O.lIllIlIIllII[0]] = lIllIlIIlIll[lIllIlIIllII[3]];
                if (O.lllIIlllIlIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIllII[1];

                    if (((34 + 145 - 58 + 31 ^ 126 + 90 - 99 + 21) & (0x95 ^ 0xB4 ^ (0x82 ^ 0xB1) ^ -1)) < (0xD0 ^ 0x92 ^ (0x41 ^ 7))) return n2 != 0;
                    return ((0x2E ^ 0x1E ^ (0x52 ^ 0x39)) & (0x2A ^ 0x62 ^ (0x2B ^ 0x38) ^ -1)) != 0;
                }
            }
            n2 = lIllIlIIllII[0];
            return n2 != 0;
        });
        if (O.lllIIlllIlIIIl(var1)) {
            return lIllIlIIllII[0];
        }
        Player var2 = Players.getLocal();
        if (O.lllIIlllIlIIIl(var2)) {
            return lIllIlIIllII[0];
        }
        if (O.lllIIlllIlIIII(h.i(var1).contains((Locatable)var2) ? 1 : 0)) {
            return lIllIlIIllII[0];
        }
        String[] stringArray = new String[lIllIlIIllII[1]];
        stringArray[O.lIllIlIIllII[0]] = lIllIlIIlIll[lIllIlIIllII[0]];
        Item var3 = Inventory.getFirst((String[])stringArray);
        if (!O.lllIIlllIlIIlI(var3) || O.lllIIlllIlIIll(var3.getQuantity(), lIllIlIIllII[2])) {
            return lIllIlIIllII[0];
        }
        if (O.lllIIlllIlIIII(h.t(var1).contains((Locatable)var2) ? 1 : 0) && O.lllIIlllIlIlII(h.f(var1).equals((Object)var2.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)h.f(var1));
            return lIllIlIIllII[1];
        }
        Movement.setDestination((WorldPoint)h.j((TileObject)var1_1));
        return lIllIlIIllII[1];
    }

    private static boolean lllIIlllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlllIlIIlI(Object object) {
        return object != null;
    }

        return String.valueOf(var4);
    }

    private static boolean lllIIlllIlIIIl(Object object) {
        return object == null;
    }

    @Inject
    public ExitMuscaAreaTask(SquireDukeSucellus squireDukeSucellus) {
        this.bB = squireDukeSucellus;
        this.bC = squireDukeSucellus.s();
    }

    private static boolean lllIIlllIlIIII(int n2) {
        return n2 != 0;
    }

    private static void lllIIlllIIlllI() {
        lIllIlIIlIll = new String[lIllIlIIllII[4]];
        O.lIllIlIIlIll[O.lIllIlIIllII[0]] = "Musca powder";
        O.lIllIlIIlIll[O.lIllIlIIllII[1]] = "Gate";
        O.lIllIlIIlIll[O.lIllIlIIllII[3]] = "Quick-escape";
    }
}

