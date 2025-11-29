/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining bone shards", priority=5)
public class MiningBoneShardsTask
extends Task {
    @Inject
    private  SquireMinerConfig f;

    private static boolean lIIlIlIIlllllIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIlIIllllIll() {
        lllllllIIIII = new String[lllllllIIIIl[4]];
        l.lllllllIIIII[l.lllllllIIIIl[0]] = "Calcified deposit";
        l.lllllllIIIII[l.lllllllIIIIl[2]] = "Mine";
        l.lllllllIIIII[l.lllllllIIIIl[3]] = "Calcified rocks";
        l.lllllllIIIII[l.lllllllIIIIl[1]] = "Mine";
    }

    static {
        l.lIIlIlIIlllllII();
        l.lIIlIlIIllllIll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (l.lIIlIlIIlllllIl((Object)this.f.activity(), (Object)a.BONE_SHARDS)) {
            return lllllllIIIIl[0];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (l.lIIlIlIIlllllll(lllllllIIIII[lllllllIIIIl[3]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lllllllIIIIl[2]];
                stringArray[l.lllllllIIIIl[0]] = lllllllIIIII[lllllllIIIIl[1]];
                if (l.lIIlIlIIlllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllllllIIIIl[2];

                    if ((0x59 ^ 0x33 ^ (0x65 ^ 0xB)) >= 0) return n2 != 0;
                    return ((0x91 ^ 0xC2 ^ (0x60 ^ 0x26)) & (18 + 125 - 31 + 51 ^ 158 + 116 - 221 + 129 ^ -1)) != 0;
                }
            }
            n2 = lllllllIIIIl[0];
            return n2 != 0;
        });
        if (l.lIIlIlIIllllllI(var1)) {
            return lllllllIIIIl[0];
        }
        if (l.lIIlIlIIlllllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            l var2;
            var2.sleep(lllllllIIIIl[1]);
            return lllllllIIIIl[2];
        }
        if (l.lIIlIlIIlllllll(Inventory.isFull() ? 1 : 0)) {
            String[] stringArray = new String[lllllllIIIIl[2]];
            stringArray[l.lllllllIIIIl[0]] = lllllllIIIII[lllllllIIIIl[0]];
            Inventory.dropAll((String[])stringArray);

            return lllllllIIIIl[2];
        }
        var1_1.interact(lllllllIIIII[lllllllIIIIl[2]]);
        return lllllllIIIIl[2];
    }

    private static boolean lIIlIlIIllllllI(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIlllllll(int n2) {
        return n2 != 0;
    }
}

