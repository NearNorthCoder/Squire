/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prep Get Vials", priority=21001, blocking=true)
public class PrepGetVialsTask
extends CoxTaskBase {

    private static boolean llIlIlIlIlIlll(int n2) {
        return n2 <= 0;
    }

    private static boolean llIlIlIlIllIIl(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIlIlIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIlIllIlI(Object object) {
        return object == null;
    }

    private static boolean llIlIlIlIllIll(int n2) {
        return n2 == 0;
    }

    static {
        bc.llIlIlIlIlIlII();
        bc.llIlIlIlIlIIll();
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_4;
        bc var2;
        int n2 = this.ef();
        if (bc.llIlIlIlIlIlIl(n2, this.ed())) {
            void var3;
            int n3 = lIlIIIlIIIII[0];
            int[] nArray = new int[lIlIIIlIIIII[1]];
            nArray[bc.lIlIIIlIIIII[2]] = lIlIIIlIIIII[3];
            List list = Inventory.getAll((int[])nArray);
            int var4 = lIlIIIlIIIII[2];
            while (bc.llIlIlIlIlIllI(var4, var3.size())) {
                void var5;
                if (bc.llIlIlIlIlIlll((int)var5)) {

                    if (2 != ((202 + 111 - 135 + 33 ^ 97 + 27 - 65 + 69) & (0x5F ^ 0x12 ^ (0xB9 ^ 0xA7) ^ -1))) break;
                    return ((0x12 ^ 0x64 ^ (0x69 ^ 0x5A)) & (126 + 172 - 240 + 135 ^ 24 + 81 - -18 + 9 ^ -1)) != 0;
                }
                if (bc.llIlIlIlIllIII(var4, var2.ed())) {
                    ((Item)var3.get(var4)).drop();
                    --var5;
                }
                ++var4;

                if (((0xDC ^ 0x93) & ~(0xCF ^ 0x80)) == 0) continue;
                return false;
            }
            return lIlIIIlIIIII[1];
        }
        if (bc.llIlIlIlIllIII(var2.eh(), var2.ed())) {
            return lIlIIIlIIIII[2];
        }
        if (bc.llIlIlIlIllIIl(var2.ef())) {
            TileObject var5 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bc.llIlIlIlIlllII(tileObject.getName().contains(lIlIIIIlllll[lIlIIIlIIIII[8]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIlIIIII[1]];
                    stringArray[bc.lIlIIIlIIIII[2]] = lIlIIIIlllll[lIlIIIlIIIII[9]];
                    if (bc.llIlIlIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIlIIIII[1];

                        if (2 > 1) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIlIIIlIIIII[2];
                return n2 != 0;
            });
            if (bc.llIlIlIlIllIlI(var5)) {
                System.out.println(lIlIIIIlllll[lIlIIIlIIIII[2]]);
                return lIlIIIlIIIII[2];
            }
            if (!bc.llIlIlIlIllIll(var2.bS.isAnimating() ? 1 : 0) || bc.llIlIlIlIlllII(var2.bS.isMoving() ? 1 : 0)) {
                System.out.println(lIlIIIIlllll[lIlIIIlIIIII[1]]);
                return lIlIIIlIIIII[1];
            }
            var5.interact(lIlIIIIlllll[lIlIIIlIIIII[4]]);
            var2.sleep(lIlIIIlIIIII[4]);
            return lIlIIIlIIIII[1];
        }
        TileObject var5 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bc.llIlIlIlIlllII(tileObject.getName().contains(lIlIIIIlllll[lIlIIIlIIIII[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIIII[1]];
                stringArray[bc.lIlIIIlIIIII[2]] = lIlIIIIlllll[lIlIIIlIIIII[7]];
                if (bc.llIlIlIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIlIIIII[1];

                    if (-(0xB2 ^ 0xB6) < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIlIIIII[2];
            return n2 != 0;
        });
        if (bc.llIlIlIlIllIlI(var5)) {
            return lIlIIIlIIIII[2];
        }
        if (!bc.llIlIlIlIllIll(var2.bS.isAnimating() ? 1 : 0) || bc.llIlIlIlIlllII(var2.bS.isMoving() ? 1 : 0)) {
            System.out.println(lIlIIIIlllll[lIlIIIlIIIII[5]]);
            return lIlIIIlIIIII[1];
        }
        var2_4.interact(lIlIIIIlllll[lIlIIIlIIIII[6]]);
        return lIlIIIlIIIII[1];
    }

    private static boolean llIlIlIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIlIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected PrepGetVialsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIlIlIlIlllII(int n2) {
        return n2 != 0;
    }

    private static void llIlIlIlIlIIll() {
        lIlIIIIlllll = new String[lIlIIIlIIIII[10]];
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[2]] = "NO GYSER";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[1]] = "moving to gyser";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[4]] = "Use";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[5]] = "moving to tree";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[6]] = "Pick-lots";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[0]] = "Gourd tree";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[7]] = "Pick-lots";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[8]] = "Geyser";
        bc.lIlIIIIlllll[bc.lIlIIIlIIIII[9]] = "Use";
    }

}

