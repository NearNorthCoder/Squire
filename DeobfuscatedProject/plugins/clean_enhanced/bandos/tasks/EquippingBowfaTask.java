/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.bandos.tasks.BandosManager;

@TaskDesc(name="Equipping Bowfa")
public class EquippingBowfaTask
extends Task {
    
    private final  SquireBandosConfig ay;
    
    private final  e az;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void var17() {
        var2 = new String[var1[3]];
        y.var2[y.var1[0]] = "Wield";
        y.var2[y.var1[1]] = "faerdhinen";
        y.var2[y.var1[2]] = "Crystal bow";
    }

    @Inject
    public EquippingBowfaTask(SquireBandosConfig squireBandosConfig, e e2) {
        this.ay = squireBandosConfig;
        this.az = e2;
    }

    static {
        y.var18();
        y.var17();
    }

    private static void var18() {
        var1 = new int[5];
        y.var1[0] = (0xF4 ^ 0xC1 ^ (0xAF ^ 0xA6)) & (17 + 145 - 42 + 62 ^ 115 + 84 - 193 + 132 ^ -1);
        y.var1[1] = 1;
        y.var1[2] = 2;
        y.var1[3] = 3;
        y.var1[4] = 0x62 ^ 0x6A;
    }

    public boolean run() {
        y var19;
        if (y.var10(this.ay.useBlowpipe() ? 1 : 0)) {
            return var1[0];
        }
        if (y.var3(var19.az.v() ? 1 : 0) && y.var10(var19.az.s() ? 1 : 0)) {
            return var1[0];
        }
        Item var20 = Inventory.getFirst(item -> {
            boolean bl;
            if (!y.var10(item.getName().contains(var2[var1[1]]) ? 1 : 0) || y.var3(item.getName().contains(var2[var1[2]]) ? 1 : 0)) {
                bl = var1[1];
                0;
                if (((0x56 ^ 0x75) & ~(0x74 ^ 0x57)) != ((0xB9 ^ 0xA6) & ~(0x6C ^ 0x73))) {
                    return ((0xFE ^ 0xBD) & ~(0x1A ^ 0x59)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
        if (y.var21(var20)) {
            var20.interact(var2[var1[0]]);
            return var1[1];
        }
        return var1[0];
    }

    private static boolean var21(Object object) {
        return object != null;
    }
}

