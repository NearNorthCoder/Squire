/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Leaving Tithe Instance", priority=0x7FFFFFFF, blocking=true)
public class LeavingTitheInstanceTask
extends Task {
    private static final  int W;
    private final  SquireTitheConfig X;
    private final  Client Y;

    static {
        q.lIllIlIlllllIll();
        q.lIllIlIlllllIlI();
        W = lIIlllllIlllI[2];
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIlIlllllllI(int n2) {
        return n2 != 0;
    }

    private boolean y() {
        String[] stringArray = new String[lIIlllllIlllI[3]];
        stringArray[q.lIIlllllIlllI[0]] = lIIlllllIllII[lIIlllllIlllI[5]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (q.lIllIllIIIIIIII(tileObject)) {
            return lIIlllllIlllI[0];
        }
        tileObject.interact(lIIlllllIllII[lIIlllllIlllI[6]]);
        return lIIlllllIlllI[3];
    }

    private static boolean lIllIlIllllllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIlIllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIlllllIlI() {
        lIIlllllIllII = new String[lIIlllllIlllI[10]];
        q.lIIlllllIllII[q.lIIlllllIlllI[0]] = "Wear";
        q.lIIlllllIllII[q.lIIlllllIlllI[3]] = "Sack";
        q.lIIlllllIllII[q.lIIlllllIlllI[4]] = "Deposit";
        q.lIIlllllIllII[q.lIIlllllIlllI[5]] = "Farm door";
        q.lIIlllllIllII[q.lIIlllllIlllI[6]] = "Open";
        q.lIIlllllIllII[q.lIIlllllIlllI[7]] = "Farmer's";
        q.lIIlllllIllII[q.lIIlllllIlllI[8]] = "fruit";
        q.lIIlllllIllII[q.lIIlllllIlllI[9]] = "seed";
    }

    private static boolean lIllIlIllllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIIIIIII(Object object) {
        return object == null;
    }

    @Inject
    public LeavingTitheInstanceTask(SquireTitheConfig squireTitheConfig, Client client) {
        this.X = squireTitheConfig;
        this.Y = client;
    }

    public boolean run() {
        q var2;
        if (q.lIllIlIllllllII(this.Y.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllllIlllI[0];
        }
        Item var3 = Inventory.getFirst(item -> item.getName().endsWith(lIIlllllIllII[lIIlllllIlllI[9]]));
        if (q.lIllIlIllllllIl(Vars.getBit((int)lIIlllllIlllI[1]), lIIlllllIlllI[2]) && q.lIllIlIllllllII(var2.X.fruit().a(var3) ? 1 : 0)) {
            return lIIlllllIlllI[0];
        }
        if (q.lIllIlIlllllllI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIlllllIllII[lIIlllllIlllI[8]])) ? 1 : 0)) {
            List var4 = Inventory.getAll(item -> item.getName().contains(lIIlllllIllII[lIIlllllIlllI[7]]));
            if (q.lIllIlIllllllll(var4.size())) {
                Iterator var5 = var4.iterator();
                while (q.lIllIlIlllllllI(var5.hasNext() ? 1 : 0)) {
                    Item var6 = (Item)var5.next();
                    var6.interact(lIIlllllIllII[lIIlllllIlllI[0]]);

                    if (((0x37 ^ 0xF ^ (0x5D ^ 0x6A)) & (0x30 ^ 0x43 ^ (0x26 ^ 0x5A) ^ -1)) == 0) continue;
                    return ((0x6B ^ 0x18 ^ (0xC0 ^ 0x98)) & (157 + 90 - 213 + 125 ^ 104 + 5 - -24 + 47 ^ -1)) != 0;
                }
                return lIIlllllIlllI[3];
            }
            String[] stringArray = new String[lIIlllllIlllI[3]];
            stringArray[q.lIIlllllIlllI[0]] = lIIlllllIllII[lIIlllllIlllI[3]];
            TileObject var5 = TileObjects.getNearest((String[])stringArray);
            if (q.lIllIllIIIIIIII(var5)) {
                return lIIlllllIlllI[0];
            }
            var5.interact(lIIlllllIllII[lIIlllllIlllI[4]]);
            return lIIlllllIlllI[3];
        }
        return this.y();
    }

}

