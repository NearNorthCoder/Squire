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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Deposit Musca Mushroom", priority=101, blocking=true)
public class DepositMuscaMushroomTask
extends Task {

    final  SquireDukeSucellus bz;
    final  a bA;

    private static boolean lllIlIlIllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIlIllIllI(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    private static boolean lllIlIlIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(int n2, TileObject tileObject, TileObject tileObject2) {
        boolean bl;
        void var2;
        void var3;
        int var4;
        String[] stringArray = new String[lIlllIIIIlIl[2]];
        stringArray[N.lIlllIIIIlIl[0]] = lIlllIIIIIll[lIlllIIIIlIl[1]];
        if (!N.lllIlIlIlllIII(tileObject2.hasAction(stringArray) ? 1 : 0) || N.lllIlIlIllIlIl(tileObject2.getName().equals(lIlllIIIIIll[lIlllIIIIlIl[4]]) ? 1 : 0)) {
            return lIlllIIIIlIl[0];
        }
        if (N.lllIlIlIllIlIl(var4)) {
            boolean bl2;
            if (N.lllIlIlIlllIIl(var3.getWorldX(), var2.getWorldX())) {
                bl2 = lIlllIIIIlIl[2];

                }
            } else {
                bl2 = lIlllIIIIlIl[0];
            }
            return bl2;
        }
        if (N.lllIlIlIllIlll(var3.getWorldX(), var2.getWorldX())) {
            bl = lIlllIIIIlIl[2];

            if (-1 >= ((0x8C ^ 0xA9 ^ (0x4E ^ 0x39)) & (91 + 97 - 143 + 186 ^ 70 + 18 - 44 + 137 ^ -1))) {
                return ((118 + 224 - 267 + 152 ^ 41 + 38 - -15 + 37) & (0x5F ^ 0x7F ^ (0x61 ^ 0x21) ^ -1)) != 0;
            }
        } else {
            bl = lIlllIIIIlIl[0];
        }
        return bl;
    }

    private static boolean lllIlIlIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public DepositMuscaMushroomTask(SquireDukeSucellus squireDukeSucellus) {
        this.bz = squireDukeSucellus;
        this.bA = squireDukeSucellus.s();
    }

    static {
        N.lllIlIlIllIIlI();
        N.lllIlIlIlIllIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var5;
        N var6;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (N.lllIlIlIlllIII(tileObject.getName().equals(lIlllIIIIIll[lIlllIIIIlIl[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlllIIIIlIl[2]];
                stringArray[N.lIlllIIIIlIl[0]] = lIlllIIIIIll[lIlllIIIIlIl[6]];
                if (N.lllIlIlIlllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlllIIIIlIl[2];

                    if (-2 < 0) return n2 != 0;
                    return ((122 + 37 - 141 + 123 ^ 86 + 70 - 39 + 39) & (0xA6 ^ 0xC6 ^ (0x4B ^ 0x3A) ^ -1)) != 0;
                }
            }
            n2 = lIlllIIIIlIl[0];
            return n2 != 0;
        });
        if (N.lllIlIlIllIIll(tileObject2)) {
            return lIlllIIIIlIl[0];
        }
        Player var7 = Players.getLocal();
        if (N.lllIlIlIllIIll(var7)) {
            return lIlllIIIIlIl[0];
        }
        int var8 = var6.bA.w();
        if (N.lllIlIlIllIlII(var8, lIlllIIIIlIl[1])) {
            return lIlllIIIIlIl[0];
        }
        if (N.lllIlIlIllIlIl(h.i((TileObject)var5).contains((Locatable)var7) ? 1 : 0)) {
            return lIlllIIIIlIl[0];
        }
        String[] stringArray = new String[lIlllIIIIlIl[2]];
        stringArray[N.lIlllIIIIlIl[0]] = lIlllIIIIIll[lIlllIIIIlIl[0]];
        Item var9 = Inventory.getFirst((String[])stringArray);
        if (!N.lllIlIlIllIllI(var9) || N.lllIlIlIllIlll(var9.getQuantity(), lIlllIIIIlIl[3])) {
            return lIlllIIIIlIl[0];
        }
        TileObject var10 = TileObjects.getNearest(arg_0 -> N.a(var8, (TileObject)var5, arg_0));
        if (N.lllIlIlIllIIll(var10)) {
            return lIlllIIIIlIl[0];
        }
        var5_5.interact(lIlllIIIIIll[lIlllIIIIlIl[2]]);
        return lIlllIIIIlIl[2];
    }

    private static boolean lllIlIlIlllIII(int n2) {
        return n2 != 0;
    }

    private static void lllIlIlIlIllIl() {
        lIlllIIIIIll = new String[lIlllIIIIlIl[3]];
        N.lIlllIIIIIll[N.lIlllIIIIlIl[0]] = "Musca powder";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[2]] = "Fill";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[1]] = "Fill";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[4]] = "Fermentation Vat";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[5]] = "Gate";
        N.lIlllIIIIIll[N.lIlllIIIIlIl[6]] = "Quick-escape";
    }

    private static boolean lllIlIlIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIlIllIIll(Object object) {
        return object == null;
    }
}

