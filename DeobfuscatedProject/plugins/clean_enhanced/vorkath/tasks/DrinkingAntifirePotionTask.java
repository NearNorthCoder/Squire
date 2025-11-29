/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking Antifire Potion", priority=110)
public class DrinkingAntifirePotionTask
extends VorkathManager {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var2_2;
        E var9;
        if (!(Combat.isSuperAntifired( == 0) ? 1 : 0) || (Combat.isAntifired( != 0) ? 1 : 0)) {
            return 0;
        }
        NPC var10 = var9.cg.A();
        if var10 != null {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 2;
        if ((Projectiles.getNearest((int[] != nunArray))) {
            return 0;
        }
        Item var11 = Inventory.getFirst(item -> {
            int n2;
            if ((item.getName( != 0).toLowerCase().contains(var1[1]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[3];
                if ((item.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (((139 + 148 - 172 + 35 ^ 39 + 140 - 148 + 112) & (0x38 ^ 0x45 ^ (0xD ^ 0x69) ^ -1)) == 0) return n2 != 0;
                    return ((62 + 14 - -11 + 57 ^ 109 + 140 - 64 + 8) & (0xEA ^ 0x83 ^ (0x8A ^ 0xB2) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var11 == null {
            return 0;
        }
        var2_2.interact(var1[0]);
        this.cg.a(this.cf.getTickCount());
        return 1;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = 0;
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = 0;
        while (var20 < var19) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((58 + 136 - 53 + 10 ^ 33 + 122 - 119 + 111) > 1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    @Inject
    protected DrinkingAntifirePotionTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

}

