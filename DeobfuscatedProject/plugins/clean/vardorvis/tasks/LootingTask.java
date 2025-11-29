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
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Looting", blocking=true, priority=50000)
public class LootingTask
extends Task {
    private final  SquireVardorvis at;
    
    private  e l;
    private final  SquireVardorvisConfig au;

    @Inject
    public LootingTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.au = squireVardorvisConfig;
        this.at = squireVardorvis;
        this.l = squireVardorvis.j();
    }

    private static boolean lIlllllIIIIlIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (B.lIlllllIIIIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIIlIllll[0];
        }
        TileItem var1 = TileItems.getNearest(tileItem -> g.Q.contains(tileItem.getName()));
        if (B.lIlllllIIIIlIlI(var1)) {
            if (B.lIlllllIIIIlIIl(LocalPlayer.getAccountType().isIronman() ? 1 : 0) && B.lIlllllIIIIlIIl(LocalPlayer.getAccountType().isGroupIronman() ? 1 : 0)) {
                return lIlIlIIlIllll[0];
            }
            var1 = TileItems.getNearest(tileItem -> tileItem.getName().startsWith(lIlIlIIlIlllI[lIlIlIIlIllll[3]]));
            if (B.lIlllllIIIIlIlI(var1)) {
                return lIlIlIIlIllll[0];
            }
        }
        if (B.lIlllllIIIIlIll(Inventory.isFull() ? 1 : 0)) {
            Item var2 = Inventory.getFirst(item -> {
                String[] stringArray = new String[lIlIlIIlIllll[1]];
                stringArray[B.lIlIlIIlIllll[0]] = lIlIlIIlIlllI[lIlIlIIlIllll[2]];
                return item.hasAction(stringArray);
            });
            if (B.lIlllllIIIIlIlI(var2)) {
                B var3;
                var3.at.c(lIlIlIIlIllll[1]);
                return lIlIlIIlIllll[0];
            }
            var2.interact(lIlIlIIlIlllI[lIlIlIIlIllll[0]]);
            return lIlIlIIlIllll[1];
        }
        var1_1.interact(lIlIlIIlIlllI[lIlIlIIlIllll[1]]);
        return lIlIlIIlIllll[1];
    }

    private static boolean lIlllllIIIIlIll(int n2) {
        return n2 != 0;
    }

    private static void lIlllllIIIIIlll() {
        lIlIlIIlIlllI = new String[lIlIlIIlIllll[4]];
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[0]] = "Eat";
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[1]] = "Take";
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[2]] = "Eat";
        B.lIlIlIIlIlllI[B.lIlIlIIlIllll[3]] = "Super combat potion";
    }

    private static boolean lIlllllIIIIlIlI(Object object) {
        return object == null;
    }

    static {
        B.lIlllllIIIIlIII();
        B.lIlllllIIIIIlll();
    }

}

