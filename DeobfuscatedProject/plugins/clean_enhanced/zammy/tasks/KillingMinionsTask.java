/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import gg.squire.zammy.tasks.GameEnum3;
import gg.squire.zammy.tasks.ZammyManager;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Killing minions", priority=2, blocking=true)
public class KillingMinionsTask
extends Task {

    private final  SquireZammyConfig ay;
    private final  l ax;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public KillingMinionsTask(l l2, SquireZammyConfig squireZammyConfig) {
        this.ax = l2;
        this.ay = squireZammyConfig;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (3 > ((204 + 216 - 281 + 101 ^ 64 + 143 - 171 + 111) & (0xB8 ^ 0xA2 ^ (0x35 ^ 0x4C) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        A var19;
        if (!(this.ax.B( != 0) ? 1 : 0) || (this.ax.KillingMinionsTask( != 0) ? 1 : 0)) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = e.BALFRUG_KREEYATH.n();
        NPC var20 = NPCs.getNearest((int[])nArray);
        if (!var20 != null || (var20.isDead( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var19.ay.useBlowpipe( != 0) ? 1 : 0) && (Combat.getSpecEnergy() >= 2) && (Combat.getMissingHealth() > 3)) {
            String[] stringArray = new String[1];
            stringArray[0] = var1[0];
            Item var21 = Inventory.getFirst((String[])stringArray);
            if var21 != null {
                var21.interact(var1[1]);
            }
            if ((Combat.isSpecEnabled( == 0) ? 1 : 0)) {
                Combat.toggleSpec();
            }
        }
        if ((Players.getLocal( != null).getInteracting())) {
            return 0;
        }
        var1_1.interact(var1[4]);
        this.sleep(4);
        return 1;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

}

