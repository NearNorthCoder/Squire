/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.woodcutting.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import gg.squire.woodcutting.SquireWoodcutterPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping logs", priority=5, blocking=true)
public class DroppingLogsTask
extends Task {
    private final  SquireWoodcutterPlugin z;
    
    private final  SquireWoodcutterConfig A;

    private static boolean llIIIlIIlIIlIll(Object object) {
        return object == null;
    }

    private static void llIIIlIIlIIIlll() {
        lIllIIIIlllII = new String[lIllIIIIllllI[1]];
        d.lIllIIIIlllII[d.lIllIIIIllllI[0]] = "Logs";
    }

    static {
        d.llIIIlIIlIIlIII();
        d.llIIIlIIlIIIlll();
    }

    private static boolean llIIIlIIlIIlIlI(int n) {
        return n != 0;
    }

    public boolean run() {
        d var1;
        if (!d.llIIIlIIlIIlIIl(this.A.bank() ? 1 : 0) || !d.llIIIlIIlIIlIIl(this.A.fastTickChop() ? 1 : 0) || d.llIIIlIIlIIlIlI(this.A.cutLogs() ? 1 : 0)) {
            return lIllIIIIllllI[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(this.A.tree().r()));
        Predicate<Item> var3 = item -> {
            boolean bl;
            if (!d.llIIIlIIlIIlIIl(item.getName().toLowerCase().contains(this.A.tree().r().toLowerCase()) ? 1 : 0) || d.llIIIlIIlIIlIlI(item.getName().equals(lIllIIIIlllII[lIllIIIIllllI[0]]) ? 1 : 0)) {
                bl = lIllIIIIllllI[1];

                if ((0xA7 ^ 0xA3) > (0xAA ^ 0xAE)) {
                    return false;
                }
            } else {
                bl = lIllIIIIllllI[0];
            }
            return bl;
        };
        if (!d.llIIIlIIlIIlIIl(Inventory.isFull() ? 1 : 0) || d.llIIIlIIlIIlIll(var2)) {
            Item var4 = Inventory.getFirst(var3);
            if (d.llIIIlIIlIIlIll(var4)) {
                return lIllIIIIllllI[0];
            }
            Inventory.dropAll(var3);

            return lIllIIIIllllI[1];
        }
        return lIllIIIIllllI[0];
    }

    private static boolean llIIIlIIlIIlIIl(int n) {
        return n == 0;
    }

    @Inject
    public DroppingLogsTask(SquireWoodcutterPlugin squireWoodcutterPlugin, SquireWoodcutterConfig squireWoodcutterConfig) {
        this.z = squireWoodcutterPlugin;
        this.A = squireWoodcutterConfig;
    }
}

