/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
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
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Deposit Salax Salt", priority=79, blocking=true)
public class DepositSalaxSaltTask
extends Task {
    
    final  SquireDukeSucellus bH;
    final  a bI;

    private static boolean lllIlIIIIIIlII(Object object) {
        return object != null;
    }

    @Inject
    public DepositSalaxSaltTask(SquireDukeSucellus squireDukeSucellus) {
        this.bH = squireDukeSucellus;
        this.bI = squireDukeSucellus.s();
    }

    private static boolean lllIlIIIIIIIlI(Object object) {
        return object == null;
    }

    private static boolean lllIlIIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIIIIIIllI(int n2) {
        return n2 != 0;
    }

    static {
        R.lllIlIIIIIIIIl();
        R.lllIlIIIIIIIII();
    }

    private static boolean lllIlIIIIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIIIIIIlll(int n2) {
        return n2 == 0;
    }

    private static void lllIlIIIIIIIII() {
        lIllIlIlIllI = new String[lIllIlIlIlll[3]];
        R.lIllIlIlIllI[R.lIllIlIlIlll[0]] = "Salax salt";
        R.lIllIlIlIllI[R.lIllIlIlIlll[2]] = "Fill";
        R.lIllIlIlIllI[R.lIllIlIlIlll[1]] = "Fill";
        R.lIllIlIlIllI[R.lIllIlIlIlll[4]] = "Fermentation Vat";
        R.lIllIlIlIllI[R.lIllIlIlIlll[5]] = "Gate";
        R.lIllIlIlIllI[R.lIllIlIlIlll[6]] = "Quick-escape";
    }

    private static boolean lllIlIIIIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(int n2, TileObject tileObject, TileObject tileObject2) {
        boolean bl;
        void var2;
        void var3;
        int var4;
        String[] stringArray = new String[lIllIlIlIlll[2]];
        stringArray[R.lIllIlIlIlll[0]] = lIllIlIlIllI[lIllIlIlIlll[1]];
        if (!R.lllIlIIIIIIllI(tileObject2.hasAction(stringArray) ? 1 : 0) || R.lllIlIIIIIIlll(tileObject2.getName().equals(lIllIlIlIllI[lIllIlIlIlll[4]]) ? 1 : 0)) {
            return lIllIlIlIlll[0];
        }
        if (R.lllIlIIIIIlIII(var4, lIllIlIlIlll[2])) {
            boolean bl2;
            if (R.lllIlIIIIIlIIl(var3.getWorldX(), var2.getWorldX())) {
                bl2 = lIllIlIlIlll[2];

                }
            } else {
                bl2 = lIllIlIlIlll[0];
            }
            return bl2;
        }
        if (R.lllIlIIIIIIlIl(var3.getWorldX(), var2.getWorldX())) {
            bl = lIllIlIlIlll[2];

            }
        } else {
            bl = lIllIlIlIlll[0];
        }
        return bl;
    }

    private static boolean lllIlIIIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var5;
        R var6;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (R.lllIlIIIIIIllI(tileObject.getName().equals(lIllIlIlIllI[lIllIlIlIlll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIlIlll[2]];
                stringArray[R.lIllIlIlIlll[0]] = lIllIlIlIllI[lIllIlIlIlll[6]];
                if (R.lllIlIIIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIlIlll[2];

                    if (1 < 2) return n2 != 0;
                    return ((0x75 ^ 0x70 ^ (0xA4 ^ 0x9A)) & (0xCA ^ 0x94 ^ (0xC8 ^ 0xAD) ^ -1)) != 0;
                }
            }
            n2 = lIllIlIlIlll[0];
            return n2 != 0;
        });
        if (R.lllIlIIIIIIIlI(tileObject2)) {
            return lIllIlIlIlll[0];
        }
        Player var7 = Players.getLocal();
        if (R.lllIlIIIIIIIlI(var7)) {
            return lIllIlIlIlll[0];
        }
        int var8 = var6.bI.x();
        if (R.lllIlIIIIIIIll(var8, lIllIlIlIlll[1])) {
            return lIllIlIlIlll[0];
        }
        String[] stringArray = new String[lIllIlIlIlll[2]];
        stringArray[R.lIllIlIlIlll[0]] = lIllIlIlIllI[lIllIlIlIlll[0]];
        Item var9 = Inventory.getFirst((String[])stringArray);
        if (!R.lllIlIIIIIIlII(var9) || R.lllIlIIIIIIlIl(var9.getQuantity(), lIllIlIlIlll[3])) {
            return lIllIlIlIlll[0];
        }
        TileObject var10 = TileObjects.getNearest(arg_0 -> R.a(var8, (TileObject)var5, arg_0));
        if (R.lllIlIIIIIIIlI(var10)) {
            return lIllIlIlIlll[0];
        }
        var5_5.interact(lIllIlIlIllI[lIllIlIlIlll[2]]);
        return lIllIlIlIlll[2];
    }
}

