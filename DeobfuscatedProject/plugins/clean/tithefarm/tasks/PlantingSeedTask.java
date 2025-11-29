/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
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
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.tithefarm.tasks.GameEnum17;
import gg.squire.tithefarm.tasks.IHelper;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Planting Seed", priority=10, blocking=true)
public class PlantingSeedTask
extends TithefarmTaskBase {
    
    private final  SquireTitheConfig aa;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        s var1;
        void var2;
        Item item2 = Inventory.getFirst(item -> item.getName().endsWith(lIIlllllIIlIl[lIIlllllIIllI[4]]));
        if (s.lIllIlIllIlIlll(item2)) {
            return lIIlllllIIllI[0];
        }
        if (s.lIllIlIllIllIII(var2.getQuantity(), var1.Z.u())) {
            return lIIlllllIIllI[0];
        }
        if (s.lIllIlIllIllIII(var1.Z.v(), lIIlllllIIllI[1] * var1.Z.u())) {
            return lIIlllllIIllI[0];
        }
        if (s.lIllIlIllIllIIl(var1.Z.q()) && s.lIllIlIllIllIlI(Movement.getRunEnergy(), lIIlllllIIllI[2]) && s.lIllIlIllIllIll(var1.aa.waitForEnergy() ? 1 : 0)) {
            return lIIlllllIIllI[0];
        }
        List var3 = Inventory.getAll(item -> item.getName().contains(lIIlllllIIlIl[lIIlllllIIllI[3]]));
        if (s.lIllIlIllIlllII(var3.size())) {
            Iterator var4 = var3.iterator();
            while (s.lIllIlIllIllIll(var4.hasNext() ? 1 : 0)) {
                Item var5 = (Item)var4.next();
                var5.interact(lIIlllllIIlIl[lIIlllllIIllI[0]]);

                if (3 == 3) continue;
                return false;
            }
            return lIIlllllIIllI[3];
        }
        TileObject var4 = var1.Z.a(tileObject -> {
            boolean bl;
            if (s.lIllIlIllIlllIl((Object)f.d(tileObject.getId()), (Object)f.EMPTY)) {
                bl = lIIlllllIIllI[3];

                if (-1 == 2) {
                    return ((0x6A ^ 0x51 ^ (0xC2 ^ 0xA7)) & (0x2D ^ 0x1B ^ (0x15 ^ 0x7D) ^ -1)) != 0;
                }
            } else {
                bl = lIIlllllIIllI[0];
            }
            return bl;
        });
        if (s.lIllIlIllIlIlll(var4)) {
            return lIIlllllIIllI[0];
        }
        item2.useOn((TileObject)var3_4);
        return lIIlllllIIllI[3];
    }

    private static boolean lIllIlIllIlIlll(Object object) {
        return object == null;
    }

    @Inject
    protected PlantingSeedTask(i i2, SquireTitheConfig squireTitheConfig) {
        super(i2);
        this.aa = squireTitheConfig;
    }

    private static boolean lIllIlIllIlllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIlIllIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIlIllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIllIllIIl(int n2) {
        return n2 <= 0;
    }

    private static boolean lIllIlIllIlllII(int n2) {
        return n2 > 0;
    }

    private static void lIllIlIllIlIlIl() {
        lIIlllllIIlIl = new String[lIIlllllIIllI[5]];
        s.lIIlllllIIlIl[s.lIIlllllIIllI[0]] = "Wear";
        s.lIIlllllIIlIl[s.lIIlllllIIllI[3]] = "Graceful";
        s.lIIlllllIIlIl[s.lIIlllllIIllI[4]] = "seed";
    }

        return String.valueOf(var6);
    }

    static {
        s.lIllIlIllIlIllI();
        s.lIllIlIllIlIlIl();
    }

    private static boolean lIllIlIllIllIll(int n2) {
        return n2 != 0;
    }
}

