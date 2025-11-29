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

@TaskDesc(name="Deposit Arder Mushroom", priority=91, blocking=true)
public class DepositArderMushroomTask
extends Task {
    final  SquireDukeSucellus br;
    
    final  a bs;

    private static boolean lllIIlllllIlIl(Object object) {
        return object == null;
    }

    private static boolean lllIIllllllIII(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    @Inject
    public DepositArderMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.br = squireDukeSucellus;
        this.bs = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(int n2, TileObject tileObject, TileObject tileObject2) {
        boolean bl;
        void var2;
        void var3;
        int var4;
        String[] stringArray = new String[lIllIlIlIlIl[2]];
        stringArray[J.lIllIlIlIlIl[0]] = lIllIlIlIlII[lIllIlIlIlIl[1]];
        if (!J.lllIIllllllIlI(tileObject2.hasAction(stringArray) ? 1 : 0) || J.lllIIlllllIlll(tileObject2.getName().equals(lIllIlIlIlII[lIllIlIlIlIl[4]]) ? 1 : 0)) {
            return lIllIlIlIlIl[0];
        }
        if (J.lllIIllllllIll(var4, lIllIlIlIlIl[2])) {
            boolean bl2;
            if (J.lllIIlllllllII(var3.getWorldX(), var2.getWorldX())) {
                bl2 = lIllIlIlIlIl[2];

                if (-1 > 1) {
                    return ((0xC6 ^ 0xC0 ^ (0x26 ^ 0x3C)) & (0x7A ^ 0xE ^ (0xF2 ^ 0x9A) ^ -1)) != 0;
                }
            } else {
                bl2 = lIllIlIlIlIl[0];
            }
            return bl2;
        }
        if (J.lllIIllllllIIl(var3.getWorldX(), var2.getWorldX())) {
            bl = lIllIlIlIlIl[2];

            if (3 == 0) {
                return false;
            }
        } else {
            bl = lIllIlIlIlIl[0];
        }
        return bl;
    }

    private static boolean lllIIllllllIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        J.lllIIlllllIlII();
        J.lllIIlllllIIll();
    }

    private static boolean lllIIlllllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIlllllllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIllllllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIllllllIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var5;
        J var6;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (J.lllIIllllllIlI(tileObject.getName().equals(lIllIlIlIlII[lIllIlIlIlIl[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIlIlIl[2]];
                stringArray[J.lIllIlIlIlIl[0]] = lIllIlIlIlII[lIllIlIlIlIl[6]];
                if (J.lllIIllllllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIlIlIl[2];

                    if (1 >= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlIlIlIl[0];
            return n2 != 0;
        });
        if (J.lllIIlllllIlIl(tileObject2)) {
            return lIllIlIlIlIl[0];
        }
        Player var7 = Players.getLocal();
        if (J.lllIIlllllIlIl(var7)) {
            return lIllIlIlIlIl[0];
        }
        int var8 = var6.bs.v();
        if (J.lllIIlllllIllI(var8, lIllIlIlIlIl[1])) {
            return lIllIlIlIlIl[0];
        }
        if (J.lllIIlllllIlll(b.i((TileObject)var5).contains((Locatable)var7) ? 1 : 0)) {
            return lIllIlIlIlIl[0];
        }
        String[] stringArray = new String[lIllIlIlIlIl[2]];
        stringArray[J.lIllIlIlIlIl[0]] = lIllIlIlIlII[lIllIlIlIlIl[0]];
        Item var9 = Inventory.getFirst((String[])stringArray);
        if (!J.lllIIllllllIII(var9) || J.lllIIllllllIIl(var9.getQuantity(), lIllIlIlIlIl[3])) {
            return lIllIlIlIlIl[0];
        }
        TileObject var10 = TileObjects.getNearest(arg_0 -> J.a(var8, (TileObject)var5, arg_0));
        if (J.lllIIlllllIlIl(var10)) {
            return lIllIlIlIlIl[0];
        }
        var5_5.interact(lIllIlIlIlII[lIllIlIlIlIl[2]]);
        return lIllIlIlIlIl[2];
    }

    private static void lllIIlllllIIll() {
        lIllIlIlIlII = new String[lIllIlIlIlIl[3]];
        J.lIllIlIlIlII[J.lIllIlIlIlIl[0]] = "Arder powder";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[2]] = "Fill";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[1]] = "Fill";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[4]] = "Fermentation Vat";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[5]] = "Gate";
        J.lIllIlIlIlII[J.lIllIlIlIlIl[6]] = "Quick-escape";
    }

    private static boolean lllIIlllllIllI(int n2, int n3) {
        return n2 >= n3;
    }
}

