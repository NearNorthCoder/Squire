/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Restoring prayer", priority=30000)
public class RestoringPrayerTask
extends Task {
    
     int cD;
    private final  int cS = 5417;
    
    private final  SquireChambersPlugin cR;
     boolean cE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ak var9;
        if ((this.cR.E( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Prayers.getPoints() > 2)) {
            return 0;
        }
        if ((var9.cR.L( != 0).a((Locatable)Players.getLocal()) ? 1 : 0) && (Static.getClient( > 0).getVarbitValue(1)) && ((Object)var9.cR.L().aM() == (Object)var9.cR.L().aM()2)N.VESPULA)) {
            return 0;
        }
        Item var10 = Inventory.getFirst(item -> {
            int n2;
            if (!(item.getName( == 0).startsWith(var2[4]) ? 1 : 0) || !(item.getName( == 0).startsWith(var2[5]) ? 1 : 0) || (item.getName( != 0).startsWith(var2[3]) ? 1 : 0)) {
                n2 = 4;
                0;
                if (1 <= 0) {
                    return ((0x3E ^ 0x68 ^ (1 ^ 0x7A)) & (0x64 ^ 0x43 ^ (0x62 ^ 0x68) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var10 == null {
            return 0;
        }
        var1_1.interact(var2[0]);
        this.sleep(3);
        return 4;
    }

    @Inject
    public RestoringPrayerTask(SquireChambersPlugin squireChambersPlugin) {
        this.cD = 0;
        this.cE = 0;
        this.cS = 1;
        this.cR = squireChambersPlugin;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = 0;
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = 0;
        while (var25 < var24) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            
            return null;
        }
        return String.valueOf(var20);
    }
}

