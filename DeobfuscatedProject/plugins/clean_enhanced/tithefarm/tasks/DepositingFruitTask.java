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
import java.util.Iterator;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import gg.squire.tithefarm.tasks.TithefarmManager;
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
        Object var3;
        m var4;
        void var5;
        String string = this.N.fruit().i().j() + " fruit";
        String[] stringArray = new String[var1[0]];
        stringArray[m.var1[1]] = string;
        int n2 = Inventory.getCount((boolean)var1[0], (String[])stringArray);
        if (m.var6(n2, this.N.depositFruitAt())) {
            this.P = var1[0];
            0;
            if null != null {
                return ((0x5E ^ 0x62) & ~(0xB2 ^ 0x8E)) != 0;
            }
        } else if (m.var7((int)var5, var1[2])) {
            var4.P = var1[1];
        }
        if (m.var8(var4.P) && (!m.var9(var3 = Inventory.getFirst(item -> item.getName().endsWith(var2[var1[5]]))) || !m.var10(var4.N.fruit().a((Item)var3) ? 1 : 0) || m.var8((int)var5))) {
            return var1[1];
        }
        if (m.var11(var4.Z.u(), var4.Z.t()) && m.var10(var4.O.isInInstancedRegion() ? 1 : 0)) {
            return var1[1];
        }
        var3 = Inventory.getAll(item -> item.getName().contains(var2[var1[4]]));
        if (m.var12(var3.size())) {
            Iterator var13 = var3.iterator();
            while (m.var10(var13.hasNext() ? 1 : 0)) {
                Item var14 = (Item)var13.next();
                var14.interact(var2[var1[1]]);
                0;
                if (-1 < 0) continue;
                return ((0x5E ^ 0x73) & ~(0xB9 ^ 0x94)) != 0;
            }
            return var1[0];
        }
        String[] stringArray2 = new String[var1[0]];
        stringArray2[m.var1[1]] = var2[var1[0]];
        TileObject var13 = TileObjects.getNearest((String[])stringArray2);
        if (m.var15(var13)) {
            return var1[1];
        }
        var4_5.interact(var2[var1[3]]);
        return var1[0];
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var12(int n2) {
        return n2 > 0;
    }

    @Inject
    protected DepositingFruitTask(i i2, SquireTitheConfig squireTitheConfig, Client client) {
        super(i2);
        this.N = squireTitheConfig;
        this.O = client;
    }

    private static void var22() {
        var1 = new int[8];
        m.var1[0] = 1;
        m.var1[1] = (0x15 ^ 0x12) & ~(0x32 ^ 0x35);
        m.var1[2] = 0xB ^ 0x6F;
        m.var1[3] = 2;
        m.var1[4] = 3;
        m.var1[5] = 7 ^ 3;
        m.var1[6] = 0x7F ^ 0x7A;
        m.var1[7] = 0x3C ^ 0x34;
    }

    private static boolean var6(int n2, int n3) {
        return n2 > n3;
    }

    static {
        m.var22();
        m.var23();
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var1[1];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var1[1];
        while (m.var7(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(var27);
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static void var23() {
        var2 = new String[var1[6]];
        m.var2[m.var1[1]] = "Wear";
        m.var2[m.var1[0]] = "Sack";
        m.var2[m.var1[3]] = "Deposit";
        m.var2[m.var1[4]] = "Farmer's";
        m.var2[m.var1[5]] = "seed";
    }

    private static boolean var15(Object object) {
        return object == null;
    }
}

