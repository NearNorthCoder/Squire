/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Grabbing Pickaxe", priority=100, blocking=true)
public class GrabbingPickaxeTask
extends AutotoaTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        int n2 = Vars.getBit((int)llIIIlllIIl[0]);
        if (aA.lIIlllllIlIIIl(n2)) {
            return llIIIlllIIl[1];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aA.lIIlllllIlIlIl(tileObject.getId(), llIIIlllIIl[9]) && aA.lIIlllllIlIIll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llIIIlllIIl[3];

                if (2 <= 0) {
                    return ((215 + 12 - 73 + 76 ^ 152 + 90 - 105 + 43) & (0xC9 ^ 0xA6 ^ (0xFF ^ 0xC2) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIlllIIl[1];
            }
            return n2 != 0;
        });
        if (aA.lIIlllllIlIIlI(var1)) {
            return llIIIlllIIl[1];
        }
        if (aA.lIIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
            int var2 = llIIIlllIIl[1];
            List var3 = Inventory.getAll(item -> {
                int n2;
                if (aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[7]]::equals) ? 1 : 0) && aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[8]]::equals) ? 1 : 0)) {
                    n2 = llIIIlllIIl[3];

                    if (-(0x13 ^ 0x17) >= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIlllIIl[1];
                }
                return n2 != 0;
            });
            if (aA.lIIlllllIlIIIl(var3.isEmpty() ? 1 : 0)) {
                int var4 = llIIIlllIIl[1];
                while (aA.lIIlllllIlIlII(var4, Math.min(llIIIlllIIl[2], var3.size() - llIIIlllIIl[3]))) {
                    ((Item)var3.get(var4)).interact(llIIIlllIII[llIIIlllIIl[1]]);
                    var2 = llIIIlllIIl[3];
                    Object[] objectArray = new Object[llIIIlllIIl[3]];
                    objectArray[aA.llIIIlllIIl[1]] = ((Item)var3.get(var4)).getName();
                    Log.info((String)llIIIlllIII[llIIIlllIIl[3]], (Object[])objectArray);
                    ++var4;

                    return (1 & (1 ^ -1)) != 0;
                }
            }
            if (aA.lIIlllllIlIIll(var2)) {
                return llIIIlllIIl[3];
            }
            List var4 = Inventory.getAll(item -> {
                int n2;
                if (aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[5]]::equals) ? 1 : 0) && aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[6]]::equals) ? 1 : 0)) {
                    n2 = llIIIlllIIl[3];

                    if (2 < 0) {
                        return ((51 + 18 - -45 + 13 ^ (0xA7 ^ 0xC1)) & (0x43 ^ 0x54 ^ (0x3A ^ 0x34) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIlllIIl[1];
                }
                return n2 != 0;
            });
            if (aA.lIIlllllIlIIIl(var4.isEmpty() ? 1 : 0)) {
                int var5 = llIIIlllIIl[1];
                while (aA.lIIlllllIlIlII(var5, Math.min(llIIIlllIIl[2], var4.size() - llIIIlllIIl[3]))) {
                    ((Item)var4.get(var5)).interact(llIIIlllIII[llIIIlllIIl[4]]);
                    ++var5;

                    if (2 != 1) continue;
                    return false;
                }
                return llIIIlllIIl[3];
            }
        }
        var2_2.interact(llIIIlllIII[llIIIlllIIl[2]]);
        return llIIIlllIIl[3];
    }

    private static boolean lIIlllllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var6);
    }

    private static boolean lIIlllllIlIIlI(Object object) {
        return object == null;
    }

    private static void lIIlllllIIllll() {
        llIIIlllIII = new String[llIIIlllIIl[10]];
        aA.llIIIlllIII[aA.llIIIlllIIl[1]] = "Drop";
        aA.llIIIlllIII[aA.llIIIlllIIl[3]] = "Dropped food {}";
        aA.llIIIlllIII[aA.llIIIlllIIl[4]] = "Drop";
        aA.llIIIlllIII[aA.llIIIlllIIl[2]] = "Take-pickaxe";
        aA.llIIIlllIII[aA.llIIIlllIIl[5]] = "Empty";
        aA.llIIIlllIII[aA.llIIIlllIIl[6]] = "Drop";
        aA.llIIIlllIII[aA.llIIIlllIIl[7]] = "Eat";
        aA.llIIIlllIII[aA.llIIIlllIIl[8]] = "Drop";
    }

    private static boolean lIIlllllIlIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected GrabbingPickaxeTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        aA.lIIlllllIlIIII();
        aA.lIIlllllIIllll();
    }

    private static boolean lIIlllllIlIlIl(int n2, int n3) {
        return n2 == n3;
    }
}

