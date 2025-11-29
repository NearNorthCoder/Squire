/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Looting Sceptre", priority=650, register=true, blocking=true)
public class LootingSceptreTask
extends Task {
    private final  a y;
    
    private final  Client z;

    private static void lIIlIlIIlIlIIII() {
        llllllIlllII = new String[llllllIlllIl[10]];
        f.llllllIlllII[f.llllllIlllIl[0]] = "Drop";
        f.llllllIlllII[f.llllllIlllIl[1]] = "Drop";
        f.llllllIlllII[f.llllllIlllIl[2]] = "Eat";
        f.llllllIlllII[f.llllllIlllIl[3]] = "Take";
        f.llllllIlllII[f.llllllIlllIl[4]] = "Pharaoh's sceptre";
        f.llllllIlllII[f.llllllIlllIl[5]] = "Pharaoh's sceptre";
        f.llllllIlllII[f.llllllIlllIl[6]] = "Eat";
        f.llllllIlllII[f.llllllIlllIl[7]] = "Golden";
        f.llllllIlllII[f.llllllIlllIl[8]] = "Stone";
        f.llllllIlllII[f.llllllIlllIl[9]] = "Pharaoh's sceptre";
    }

    private static boolean lIIlIlIIlIlIlII(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    public boolean run() {
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().contains(llllllIlllII[llllllIlllIl[9]]));
        if (f.lIIlIlIIlIlIIlI(tileItem2)) {
            return llllllIlllIl[0];
        }
        if (f.lIIlIlIIlIlIIll(Inventory.isFull() ? 1 : 0)) {
            Item var2 = Inventory.getFirst(item -> item.getName().contains(llllllIlllII[llllllIlllIl[8]]));
            if (f.lIIlIlIIlIlIlII(var2)) {
                var2.interact(llllllIlllII[llllllIlllIl[0]]);
                return llllllIlllIl[1];
            }
            Item var3 = Inventory.getFirst(item -> item.getName().contains(llllllIlllII[llllllIlllIl[7]]));
            if (f.lIIlIlIIlIlIlII(var3)) {
                var3.interact(llllllIlllII[llllllIlllIl[1]]);
                return llllllIlllIl[1];
            }
            Item var4 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llllllIlllIl[1]];
                stringArray[f.llllllIlllIl[0]] = llllllIlllII[llllllIlllIl[6]];
                return item.hasAction(stringArray);
            });
            if (f.lIIlIlIIlIlIlII(var4)) {
                var4.interact(llllllIlllII[llllllIlllIl[2]]);
                return llllllIlllIl[1];
            }
            return llllllIlllIl[0];
        }
        TileItems.getNearest(tileItem -> tileItem.getName().contains(llllllIlllII[llllllIlllIl[5]])).interact(llllllIlllII[llllllIlllIl[3]]);
        return llllllIlllIl[1];
    }

    private static boolean lIIlIlIIlIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        if (f.lIIlIlIIlIlIIll(itemSpawned.getItem().getName().contains(llllllIlllII[llllllIlllIl[4]]) ? 1 : 0)) {
            this.y.b(this.y.e() + llllllIlllIl[1]);
        }
    }

    static {
        f.lIIlIlIIlIlIIIl();
        f.lIIlIlIIlIlIIII();
    }

    @Inject
    public LootingSceptreTask(a a2, Client client) {
        this.y = a2;
        this.z = client;
    }
}

