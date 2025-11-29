/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
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
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Collect Poison", priority=200, blocking=true)
public class CollectPoisonTask
extends Task {
    final  a bg;
    final  SquireDukeSucellus bf;

    private static void lllIlIIIlllIlI() {
        lIllIllIIIIl = new String[lIllIllIIIlI[5]];
        D.lIllIllIIIIl[D.lIllIllIIIlI[1]] = "Collect-from";
        D.lIllIllIIIIl[D.lIllIllIIIlI[2]] = "Collect-from";
        D.lIllIllIIIIl[D.lIllIllIIIlI[0]] = "Fermentation Vat";
        D.lIllIllIIIIl[D.lIllIllIIIlI[3]] = "Gate";
        D.lIllIllIIIIl[D.lIllIllIIIlI[4]] = "Quick-escape";
    }

    private static boolean lllIlIIIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlIIlIIIIII(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlIIIIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        D var1;
        if (!D.lllIlIIIlllllI(this.bg.y(), lIllIllIIIlI[0]) || !D.lllIlIIIllllll(this.bg.x(), lIllIllIIIlI[0]) || !D.lllIlIIIllllll(this.bg.w(), lIllIllIIIlI[0]) || D.lllIlIIIlllllI(this.bg.v(), lIllIllIIIlI[0])) {
            return lIllIllIIIlI[1];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (D.lllIlIIlIIIIIl(tileObject.getName().equals(lIllIllIIIIl[lIllIllIIIlI[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIIIlI[2]];
                stringArray[D.lIllIllIIIlI[1]] = lIllIllIIIIl[lIllIllIIIlI[4]];
                if (D.lllIlIIlIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIIIlI[2];

                    if ((0x6F ^ 0x3C ^ (0xF0 ^ 0xA7)) >= 0) return n2 != 0;
                    return (2 & (2 ^ -1)) != 0;
                }
            }
            n2 = lIllIllIIIlI[1];
            return n2 != 0;
        });
        if (D.lllIlIIlIIIIII(var2)) {
            return lIllIllIIIlI[1];
        }
        int var3 = var1.bg.y();
        TileObject var4 = TileObjects.getNearest(tileObject2 -> {
            boolean bl;
            void var5;
            void var6;
            int var7;
            String[] stringArray = new String[lIllIllIIIlI[2]];
            stringArray[D.lIllIllIIIlI[1]] = lIllIllIIIIl[lIllIllIIIlI[2]];
            if (!D.lllIlIIlIIIIIl(tileObject2.hasAction(stringArray) ? 1 : 0) || D.lllIlIIlIIIIlI(tileObject2.getName().equals(lIllIllIIIIl[lIllIllIIIlI[0]]) ? 1 : 0)) {
                return lIllIllIIIlI[1];
            }
            if (D.lllIlIIlIIIIlI(var7)) {
                boolean bl2;
                if (D.lllIlIIlIIIIll(var6.getWorldX(), var5.getWorldX())) {
                    bl2 = lIllIllIIIlI[2];

                    if (((0xD5 ^ 0xB5) & ~(0xDB ^ 0xBB)) < 0) {
                        return (1 & ~1) != 0;
                    }
                } else {
                    bl2 = lIllIllIIIlI[1];
                }
                return bl2;
            }
            if (D.lllIlIIIlllllI(var6.getWorldX(), var5.getWorldX())) {
                bl = lIllIllIIIlI[2];

                if (2 <= 0) {
                    return false;
                }
            } else {
                bl = lIllIllIIIlI[1];
            }
            return bl;
        });
        if (D.lllIlIIlIIIIII(var4)) {
            return lIllIllIIIlI[1];
        }
        var3_3.interact(lIllIllIIIIl[lIllIllIIIlI[1]]);
        return lIllIllIIIlI[2];
    }

    private static boolean lllIlIIIllllll(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(var8);
    }

    static {
        D.lllIlIIIllllII();
        D.lllIlIIIlllIlI();
    }

    @Inject
    public CollectPoisonTask(SquireDukeSucellus squireDukeSucellus) {
        this.bf = squireDukeSucellus;
        this.bg = squireDukeSucellus.s();
    }

    private static boolean lllIlIIlIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIIlIIIIlI(int n2) {
        return n2 == 0;
    }
}

