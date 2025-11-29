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
package m.e.i.q.u.r.-.n.s.e.r.i;

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
import m.e.i.q.u.r.-.n.s.e.r.i.AEnum;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Banking gem rocks -> BankinggemrocksTask */
@TaskDesc(name="Banking gem rocks", priority=100, blocking=true)
public class BankingGemRocksTask
extends Task {
    private static /* synthetic */ int[] lllllIlIlllI;
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static final /* synthetic */ Set<Integer> v;
    private static /* synthetic */ String[] lllllIlIllIl;

    private static String lIIlIIllIllIllI(String var17, String var7) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var1 = var7.toCharArray();
        int var10 = lllllIlIlllI[0];
        char[] var12 = var17.toCharArray();
        int var6 = var12.length;
        int var8 = lllllIlIlllI[0];
        while (q.lIIlIIllIlllllI(var8, var6)) {
            char var18 = var12[var8];
            var15.append((char)(var18 ^ var1[var10 % var1.length]));
            0;
            ++var10;
            ++var8;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        return String.valueOf(var15);
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
            Widget var9 = Widgets.get((WidgetInfo)WidgetInfo.DEPOSIT_BOX_INVENTORY_ITEMS_CONTAINER);
            if (q.lIIlIIllIlllIll(Widgets.isVisible((Widget)var9) ? 1 : 0)) {
                return lllllIlIlllI[0];
            }
            DepositBox.selectQuantityAll();
            Widget[] var2 = var9.getChildren();
            if (q.lIIlIIllIllllIl(var2)) {
                return lllllIlIlllI[0];
            }
            HashSet<Integer> var13 = new HashSet<Integer>();
            Widget[] var11 = var2;
            int var20 = var11.length;
            int var14 = lllllIlIlllI[0];
            while (q.lIIlIIllIlllllI(var14, var20)) {
                Widget var22 = var11[var14];
                int var4 = var22.getItemId();
                if (q.lIIlIIllIllllII(v.contains(var4) ? 1 : 0)) {
                    if (q.lIIlIIllIllllII(var13.contains(var4) ? 1 : 0)) {
                        0;
                        
                        }
                    } else {
                        var22.interact(lllllIlIllIl[lllllIlIlllI[0]]);
                        var13.add(var4);
                        0;
                    }
                }
                ++var14;
                0;
                if (-1 < 3) continue;
                return ((0x3F ^ 0x5A ^ (0x13 ^ 0x60)) & (0x9A ^ 0x94 ^ (0x82 ^ 0x9A) ^ -1)) != 0;
            }
            return lllllIlIlllI[1];
        }
        String[] stringArray = new String[lllllIlIlllI[1]];
        stringArray[q.lllllIlIlllI[0]] = lllllIlIllIl[lllllIlIlllI[1]];
        TileObject var9 = TileObjects.getNearest((String[])stringArray);
        if (q.lIIlIIllIllllIl(var9)) {
            return lllllIlIlllI[0];
        }
        var1_2.interact(lllllIlIllIl[lllllIlIlllI[2]]);
        return lllllIlIlllI[1];
    }

    private static void lIIlIIllIlllIIl() {
        lllllIlIlllI = new int[13];
        q.lllllIlIlllI[0] = 3 & (3 ^ -1);
        q.lllllIlIlllI[1] = 1;
        q.lllllIlIlllI[2] = 2;
        q.lllllIlIlllI[3] = -(0xFFFFF73F & 0x49EB) & (0xFFFFE77B & 0x5FFF);
        q.lllllIlIlllI[4] = -(0xFFFFF1DD & 0x3FA7) & (0xFFFFB7D7 & Short.MAX_VALUE);
        q.lllllIlIlllI[5] = 0xFFFFC6FF & 0x3F55;
        q.lllllIlIlllI[6] = 0xFFFFE77F & 0x1ED7;
        q.lllllIlIlllI[7] = -(0xFFFFECBF & 0x3B41) & (0xFFFFEF7B & 0x3EDD);
        q.lllllIlIlllI[8] = 0xFFFFDE7B & 0x27DF;
        q.lllllIlIlllI[9] = 0xFFFFD75F & 0x2EFD;
        q.lllllIlIlllI[10] = 0xFFFFAEDF & 0x577F;
        q.lllllIlIlllI[11] = 3;
        q.lllllIlIlllI[12] = 0x16 ^ 0x10 ^ (0xA7 ^ 0xA9);
    }

    private static boolean lIIlIIllIllllIl(Object object) {
        return object == null;
    }

    private static void lIIlIIllIlllIII() {
        lllllIlIllIl = new String[lllllIlIlllI[11]];
        q.lllllIlIllIl[q.lllllIlIlllI[0]] = q."Deposit-All";
        q.lllllIlIllIl[q.lllllIlIlllI[1]] = q."Bank Deposit Chest";
        q.lllllIlIllIl[q.lllllIlIlllI[2]] = q."Deposit";
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

    private static String lIIlIIllIllIlll(String var16, String var19) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lllllIlIlllI[12]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lllllIlIlllI[2], var5);
            return new String(var21.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllIlllIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIllIllllII(int n2) {
        return n2 != 0;
    }
}

