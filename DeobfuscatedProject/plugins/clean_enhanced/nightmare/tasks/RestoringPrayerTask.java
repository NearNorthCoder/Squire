/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Restoring Prayer", priority=2)
public class RestoringPrayerTask
extends Task {
    private static final  Logger en;
    
    private final  SquireNightmareConfig eo;
    private final  SquireNightmarePlugin ep;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ar var3;
        if (ar.var4(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (ar.var5(var3.ep.aq() ? 1 : 0)) {
            return var2[0];
        }
        Item var6 = Inventory.getFirst(item -> {
            int n2;
            String string = item.getName().toLowerCase();
            if (!ar.var4(string.contains(var1[var2[2]]) ? 1 : 0) || !ar.var4(string.contains(var1[var2[3]]) ? 1 : 0) || ar.var5(string.contains(var1[var2[1]]) ? 1 : 0)) {
                n2 = var2[2];
                0;
                
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (ar.var7(Prayers.getPoints(), var3.eo.restorePrayerAt())) {
            return var2[0];
        }
        if (ar.var8(var6)) {
            return var2[0];
        }
        var1_1.interact(var1[var2[0]]);
        this.sleep(var2[1]);
        return var2[2];
    }

    static {
        ar.var9();
        ar.var10();
        en = LoggerFactory.getLogger(RestoringPrayerTask.class);
    }

    private static void var10() {
        var1 = new String[var2[4]];
        ar.var1[ar.var2[0]] = "Drink";
        ar.var1[ar.var2[2]] = "prayer";
        ar.var1[ar.var2[3]] = "restore";
        ar.var1[ar.var2[1]] = "sanfew";
    }

    @Inject
    protected RestoringPrayerTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.eo = squireNightmareConfig;
        this.ep = squireNightmarePlugin;
    }

    private static boolean var7(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var2 = new int[6];
        ar.var2[0] = (0x6A ^ 0x4A ^ (0xD2 ^ 0xBA)) & (63 + 32 - -39 + 68 ^ 23 + 94 - 56 + 69 ^ -1);
        ar.var2[1] = 3;
        ar.var2[2] = 1;
        ar.var2[3] = 2;
        ar.var2[4] = 0x70 ^ 0x43 ^ (0x7C ^ 0x4B);
        ar.var2[5] = 0xD3 ^ 0xC6 ^ (0x75 ^ 0x68);
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var8(Object object) {
        return object == null;
    }
}

