/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Looting", blocking=true, priority=5000)
public class LootingTask
extends Task {
    private final  SquireDukeSucellus aV;
    
    private final  SquireDukeSucellusConfig aW;
    private  a u;

        return String.valueOf(var1);
    }

    private static void lllIIlllIIIlIl() {
        lIllIlIIlIIl = new String[lIllIlIIlIlI[3]];
        y.lIllIlIIlIIl[y.lIllIlIIlIlI[0]] = "Eat";
        y.lIllIlIIlIIl[y.lIllIlIIlIlI[1]] = "Take";
        y.lIllIlIIlIIl[y.lIllIlIIlIlI[2]] = "Eat";
    }

    private static boolean lllIIlllIIlIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public LootingTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aW = squireDukeSucellusConfig;
        this.aV = squireDukeSucellus;
        this.u = squireDukeSucellus.s();
    }

    private static boolean lllIIlllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlllIIIlll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        y var2;
        if (y.lllIIlllIIIlll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIllIlIIlIlI[0];
        }
        TileItem var3 = TileItems.getNearest(tileItem -> e.S.contains(tileItem.getName()));
        if (y.lllIIlllIIlIII(var3)) {
            if (y.lllIIlllIIIlll(LocalPlayer.getAccountType().isIronman() ? 1 : 0) && y.lllIIlllIIIlll(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
                var2.aV.f(lIllIlIIlIlI[0]);
                return lIllIlIIlIlI[0];
            }
            var3 = TileItems.getNearest(tileItem -> e.T.contains(tileItem.getName()));
            if (y.lllIIlllIIlIII(var3)) {
                var2.aV.f(lIllIlIIlIlI[0]);
                return lIllIlIIlIlI[0];
            }
        }
        if (y.lllIIlllIIlIIl(Inventory.isFull() ? 1 : 0)) {
            Item var4 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIllIlIIlIlI[1]];
                stringArray[y.lIllIlIIlIlI[0]] = lIllIlIIlIIl[lIllIlIIlIlI[2]];
                return item.hasAction(stringArray);
            });
            if (y.lllIIlllIIlIII(var4)) {
                var2.aV.f(lIllIlIIlIlI[0]);
                var2.aV.g(lIllIlIIlIlI[1]);
                return lIllIlIIlIlI[0];
            }
            var4.interact(lIllIlIIlIIl[lIllIlIIlIlI[0]]);
            return lIllIlIIlIlI[1];
        }
        var1_1.interact(lIllIlIIlIIl[lIllIlIIlIlI[1]]);
        return lIllIlIIlIlI[1];
    }

    private static boolean lllIIlllIIlIII(Object object) {
        return object == null;
    }

    static {
        y.lllIIlllIIIllI();
        y.lllIIlllIIIlIl();
    }
}

