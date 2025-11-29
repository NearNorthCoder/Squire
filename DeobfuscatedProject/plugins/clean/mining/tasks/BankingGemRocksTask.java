/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.DepositBox
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.mining.tasks;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Banking gem rocks", priority=100, blocking=true)
public class BankingGemRocksTask
extends Task {
    
    @Inject
    private  SquireMinerConfig f;
    private static final  Set<Integer> v;

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_2;
        if (q.lIIlIIllIlllIlI((Object)this.f.activity(), (Object)a.GEM_ROCKS)) {
            return lllllIlIlllI[0];
        }
        if (q.lIIlIIllIlllIll(Inventory.isFull() ? 1 : 0)) {
            return lllllIlIlllI[0];
        }
        if (q.lIIlIIllIllllII(DepositBox.isOpen() ? 1 : 0)) {
            Widget var2 = Widgets.get((WidgetInfo)WidgetInfo.DEPOSIT_BOX_INVENTORY_ITEMS_CONTAINER);
            if (q.lIIlIIllIlllIll(Widgets.isVisible((Widget)var2) ? 1 : 0)) {
                return lllllIlIlllI[0];
            }
            DepositBox.selectQuantityAll();
            Widget[] var3 = var2.getChildren();
            if (q.lIIlIIllIllllIl(var3)) {
                return lllllIlIlllI[0];
            }
            HashSet<Integer> var4 = new HashSet<Integer>();
            Widget[] var5 = var3;
            int var6 = var5.length;
            int var7 = lllllIlIlllI[0];
            while (q.lIIlIIllIlllllI(var7, var6)) {
                Widget var8 = var5[var7];
                int var9 = var8.getItemId();
                if (q.lIIlIIllIllllII(v.contains(var9) ? 1 : 0)) {
                    if (q.lIIlIIllIllllII(var4.contains(var9) ? 1 : 0)) {

                        }
                    } else {
                        var8.interact(lllllIlIllIl[lllllIlIlllI[0]]);
                        var4.add(var9);

                    }
                }
                ++var7;

                if (-1 < 3) continue;
                return ((0x3F ^ 0x5A ^ (0x13 ^ 0x60)) & (0x9A ^ 0x94 ^ (0x82 ^ 0x9A) ^ -1)) != 0;
            }
            return lllllIlIlllI[1];
        }
        String[] stringArray = new String[lllllIlIlllI[1]];
        stringArray[q.lllllIlIlllI[0]] = lllllIlIllIl[lllllIlIlllI[1]];
        TileObject var2 = TileObjects.getNearest((String[])stringArray);
        if (q.lIIlIIllIllllIl(var2)) {
            return lllllIlIlllI[0];
        }
        var1_2.interact(lllllIlIllIl[lllllIlIlllI[2]]);
        return lllllIlIlllI[1];
    }

    private static boolean lIIlIIllIllllIl(Object object) {
        return object == null;
    }

    private static void lIIlIIllIlllIII() {
        lllllIlIllIl = new String[lllllIlIlllI[11]];
        q.lllllIlIllIl[q.lllllIlIlllI[0]] = "Deposit-All";
        q.lllllIlIllIl[q.lllllIlIlllI[1]] = "Bank Deposit Chest";
        q.lllllIlIllIl[q.lllllIlIlllI[2]] = "Deposit";
    }

    static {
        q.lIIlIIllIlllIIl();
        q.lIIlIIllIlllIII();
        Object[] objectArray = new Integer[lllllIlIlllI[2]];
        objectArray[q.lllllIlIlllI[0]] = lllllIlIlllI[9];
        objectArray[q.lllllIlIlllI[1]] = lllllIlIlllI[10];
        v = ImmutableSet.of((Object)lllllIlIlllI[3], (Object)lllllIlIlllI[4], (Object)lllllIlIlllI[5], (Object)lllllIlIlllI[6], (Object)lllllIlIlllI[7], (Object)lllllIlIlllI[8], (Object[])objectArray);
    }

    private static boolean lIIlIIllIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIllIlllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIllIlllIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIllIllllII(int n2) {
        return n2 != 0;
    }
}

