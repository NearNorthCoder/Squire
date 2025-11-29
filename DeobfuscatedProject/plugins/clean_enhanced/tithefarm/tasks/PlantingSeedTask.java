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
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.tithefarm.tasks.GameEnum5;
import gg.squire.tithefarm.tasks.TithefarmManager;
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
        s var3;
        void var4;
        Item item2 = Inventory.getFirst(item -> item.getName().endsWith(var1[var2[4]]));
        if (s.var5(item2)) {
            return var2[0];
        }
        if (s.var6(var4.getQuantity(), var3.Z.u())) {
            return var2[0];
        }
        if (s.var6(var3.Z.v(), var2[1] * var3.Z.u())) {
            return var2[0];
        }
        if (s.var7(var3.Z.q()) && s.var8(Movement.getRunEnergy(), var2[2]) && s.var9(var3.aa.waitForEnergy() ? 1 : 0)) {
            return var2[0];
        }
        List var10 = Inventory.getAll(item -> item.getName().contains(var1[var2[3]]));
        if (s.var11(var10.size())) {
            Iterator var12 = var10.iterator();
            while (s.var9(var12.hasNext() ? 1 : 0)) {
                Item var13 = (Item)var12.next();
                var13.interact(var1[var2[0]]);
                0;
                if (3 == 3) continue;
                return ((0x1D ^ 0x36) & ~(0xB7 ^ 0x9C)) != 0;
            }
            return var2[3];
        }
        TileObject var12 = var3.Z.a(tileObject -> {
            boolean bl;
            if (s.var14((Object)f.d(tileObject.getId()), (Object)f.EMPTY)) {
                bl = var2[3];
                0;
                if (-1 == 2) {
                    return ((0x6A ^ 0x51 ^ (0xC2 ^ 0xA7)) & (0x2D ^ 0x1B ^ (0x15 ^ 0x7D) ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        });
        if (s.var5(var12)) {
            return var2[0];
        }
        item2.useOn((TileObject)var3_4);
        return var2[3];
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    @Inject
    protected PlantingSeedTask(i i2, SquireTitheConfig squireTitheConfig) {
        super(i2);
        this.aa = squireTitheConfig;
    }

    private static void var21() {
        var2 = new int[7];
        s.var2[0] = 1 & (1 ^ -1);
        s.var2[1] = 0x64 ^ 0xF ^ (0xCC ^ 0xA3);
        s.var2[2] = 39 + 57 - 70 + 187 ^ 100 + 134 - 78 + 21;
        s.var2[3] = 1;
        s.var2[4] = 2;
        s.var2[5] = 3;
        s.var2[6] = 0 ^ 0x11 ^ (0xB5 ^ 0xAC);
    }

    private static boolean var14(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var8(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var7(int n2) {
        return n2 <= 0;
    }

    private static boolean var11(int n2) {
        return n2 > 0;
    }

    private static void var28() {
        var1 = new String[var2[5]];
        s.var1[s.var2[0]] = "Wear";
        s.var1[s.var2[3]] = "Graceful";
        s.var1[s.var2[4]] = "seed";
    }

    private static String var29(String var30, String var31) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var33 = var31.toCharArray();
        int var34 = var2[0];
        char[] var35 = var30.toCharArray();
        int var36 = var35.length;
        int var37 = var2[0];
        while (s.var6(var37, var36)) {
            char var38 = var35[var37];
            var32.append((char)(var38 ^ var33[var34 % var33.length]));
            0;
            ++var34;
            ++var37;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var32);
    }

    static {
        s.var21();
        s.var28();
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }
}

