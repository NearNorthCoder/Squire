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
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import gg.squire.tithefarm.tasks.IHelper;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Depositing fruit", priority=1000, blocking=true)
public class DepositingFruitTask
extends TithefarmTaskBase {
    private final  SquireTitheConfig N;
    
    private  boolean P;
    private final  Client O;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_5;
        Object var1;
        m var2;
        void var3;
        String string = this.N.fruit().i().j() + " fruit";
        String[] stringArray = new String[lIlIIIIIlIIII[0]];
        stringArray[m.lIlIIIIIlIIII[1]] = string;
        int n2 = Inventory.getCount((boolean)lIlIIIIIlIIII[0], (String[])stringArray);
        if (m.lIllIllIllIIIIl(n2, this.N.depositFruitAt())) {
            this.P = lIlIIIIIlIIII[0];

            }
        } else if (m.lIllIllIllIIIlI((int)var3, lIlIIIIIlIIII[2])) {
            var2.P = lIlIIIIIlIIII[1];
        }
        if (m.lIllIllIllIIIll(var2.P ? 1 : 0) && (!m.lIllIllIllIIlII(var1 = Inventory.getFirst(item -> item.getName().endsWith(lIlIIIIIIlllI[lIlIIIIIlIIII[5]]))) || !m.lIllIllIllIIlIl(var2.N.fruit().a((Item)var1) ? 1 : 0) || m.lIllIllIllIIIll((int)var3))) {
            return lIlIIIIIlIIII[1];
        }
        if (m.lIllIllIllIIllI(var2.Z.u(), var2.Z.t()) && m.lIllIllIllIIlIl(var2.O.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlIIII[1];
        }
        var1 = Inventory.getAll(item -> item.getName().contains(lIlIIIIIIlllI[lIlIIIIIlIIII[4]]));
        if (m.lIllIllIllIIlll(var1.size())) {
            Iterator var4 = var1.iterator();
            while (m.lIllIllIllIIlIl(var4.hasNext() ? 1 : 0)) {
                Item var5 = (Item)var4.next();
                var5.interact(lIlIIIIIIlllI[lIlIIIIIlIIII[1]]);

                if (-1 < 0) continue;
                return false;
            }
            return lIlIIIIIlIIII[0];
        }
        String[] stringArray2 = new String[lIlIIIIIlIIII[0]];
        stringArray2[m.lIlIIIIIlIIII[1]] = lIlIIIIIIlllI[lIlIIIIIlIIII[0]];
        TileObject var4 = TileObjects.getNearest((String[])stringArray2);
        if (m.lIllIllIllIlIII(var4)) {
            return lIlIIIIIlIIII[1];
        }
        var4_5.interact(lIlIIIIIIlllI[lIlIIIIIlIIII[3]]);
        return lIlIIIIIlIIII[0];
    }

    private static boolean lIllIllIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIllIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIllIllIIlll(int n2) {
        return n2 > 0;
    }

    @Inject
    protected DepositingFruitTask(i i2, SquireTitheConfig squireTitheConfig, Client client) {
        super(i2);
        this.N = squireTitheConfig;
        this.O = client;
    }

    private static boolean lIllIllIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        m.lIllIllIllIIIII();
        m.lIllIllIlIllllI();
    }

    private static boolean lIllIllIllIIIll(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var6);
    }

    private static boolean lIllIllIllIIlII(Object object) {
        return object != null;
    }

    private static void lIllIllIlIllllI() {
        lIlIIIIIIlllI = new String[lIlIIIIIlIIII[6]];
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[1]] = "Wear";
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[0]] = "Sack";
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[3]] = "Deposit";
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[4]] = "Farmer's";
        m.lIlIIIIIIlllI[m.lIlIIIIIlIIII[5]] = "seed";
    }

    private static boolean lIllIllIllIlIII(Object object) {
        return object == null;
    }
}

