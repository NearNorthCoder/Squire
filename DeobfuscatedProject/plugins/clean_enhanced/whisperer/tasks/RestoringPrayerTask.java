/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Restoring prayer", priority=50)
public class RestoringPrayerTask
extends WhispererTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean p() {
        void var1_1;
        if ((Prayers.getPoints() > this.i.drinkPrayerAt())) {
            return 0;
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[2];
            stringArray[0] = var1[2];
            if ((item.hasActionstringArray) && (!(item.getName( == 0).toLowerCase().contains(var1[3]) ? 1 : 0) || (item.getName( != 0).toLowerCase().contains(var1[4]) ? 1 : 0))) {
                n2 = 2;
                0;
                if (3 != 3) {
                    return ((0x76 ^ 0x43 ^ (0x32 ^ 0x11)) & (0xB7 ^ 0x8C ^ (0xB6 ^ 0x9B) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var3 == null {
            return 0;
        }
        var1_1.interact(var1[0]);
        this.sleep(1);
        return 2;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = 0;
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = 0;
        while (var12 < var11) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (((3 ^ 0x1F) & ~(0x3D ^ 0x21)) == 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }
}

