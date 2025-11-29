/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.GHelper;
import gg.squire.zammy.tasks.IHelper;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class LootingItemsTask
extends Task {
    
    private final  i ao;
    private final  g ap;
    private final  SquireZammyConfig aq;
    private final  l an;

    private static boolean llIIIlIlIIIIIII(Object object) {
        return object == null;
    }

    private static boolean llIIIlIIllllIll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        int var1;
        int n2;
        v var2;
        if (!v.llIIIlIIllllIll(this.an.B() ? 1 : 0) || v.llIIIlIIllllIll(this.an.A() ? 1 : 0)) {
            return lIllIIIlIlIll[0];
        }
        TileItem var3 = var2.P();
        if (v.llIIIlIIlllllII(var3) && v.llIIIlIIlllllIl(var2.ao.a(var3), lIllIIIlIlIll[1])) {
            n2 = lIllIIIlIlIll[2];

            if ((0x5C ^ 0x58) == 2) {
                return false;
            }
        } else {
            n2 = var1 = lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIllllIll(var2.an.D() ? 1 : 0) && v.llIIIlIIllllllI(var1)) {
            return lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIlllllll(var2.an.z(), lIllIIIlIlIll[3]) && v.llIIIlIIllllllI(var1)) {
            return lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIllllIll(Movement.isRunEnabled() ? 1 : 0) && v.llIIIlIIllllIll(var2.aq.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (v.llIIIlIlIIIIIII(var3)) {
            return lIllIIIlIlIll[0];
        }
        if (v.llIIIlIIllllIll(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIllIIIlIlIll[2]];
            nArray[v.lIllIIIlIlIll[0]] = var3.getId();
            if (!v.llIIIlIIllllIll(Inventory.contains((int[])nArray) ? 1 : 0) || v.llIIIlIIllllllI(var3.isStackable() ? 1 : 0)) {
                Item var4 = var2.ap.w();
                if (v.llIIIlIIlllllII(var4)) {
                    var4.interact(lIllIIIlIlIlI[lIllIIIlIlIll[0]]);
                    return lIllIIIlIlIll[2];
                }
                Item var5 = var2.ao.y().orElse(null);
                if (v.llIIIlIlIIIIIII(var5)) {
                    return lIllIIIlIlIll[0];
                }
                if (v.llIIIlIIllllllI(var2.ao.a(var5, var3) ? 1 : 0)) {
                    return lIllIIIlIlIll[0];
                }
                var5.interact(lIllIIIlIlIlI[lIllIIIlIlIll[2]]);
            }
        }
        if (v.llIIIlIIllllIll(Movement.shouldWalk() ? 1 : 0)) {
            var3.interact(lIllIIIlIlIlI[lIllIIIlIlIll[4]]);
            var2.sleep(lIllIIIlIlIll[2]);
        }
        return lIllIIIlIlIll[2];
    }

    private static void llIIIlIIllllIIl() {
        lIllIIIlIlIlI = new String[lIllIIIlIlIll[5]];
        v.lIllIIIlIlIlI[v.lIllIIIlIlIll[0]] = "Eat";
        v.lIllIIIlIlIlI[v.lIllIIIlIlIll[2]] = "Drop";
        v.lIllIIIlIlIlI[v.lIllIIIlIlIll[4]] = "Take";
    }

    private static boolean llIIIlIIlllllII(Object object) {
        return object != null;
    }

    private static boolean llIIIlIIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIlIIlllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private TileItem P() {
        return this.ao.x().orElse(null);
    }

    static {
        v.llIIIlIIllllIlI();
        v.llIIIlIIllllIIl();
    }

        return String.valueOf(var6);
    }

    @Inject
    public LootingItemsTask(l l2, i i2, g g2, SquireZammyConfig squireZammyConfig) {
        this.an = l2;
        this.ao = i2;
        this.ap = g2;
        this.aq = squireZammyConfig;
    }

    private static boolean llIIIlIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIIllllllI(int n2) {
        return n2 == 0;
    }
}

