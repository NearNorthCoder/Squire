/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating", priority=50)
public class EatingTask
extends ad {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
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
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var19;
        W var20;
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if ((item.hasAction(var1[7]::equals != 0) ? 1 : 0) && (item.getId() != 4)) {
                n2 = 3;
                0;
                if (-(0xF ^ 0x25 ^ (0x36 ^ 0x19)) >= 0) {
                    return ((0xD0 ^ 0xB2 ^ (0x43 ^ 0xE)) & (33 + 1 - 12 + 108 ^ 66 + 119 - 131 + 119 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if (item2 == null && (item2 = Inventory.getFirst(item -> item.hasAction(var1[6]::equals == null)))) {
            return 0;
        }
        if ((var20.az.EatingTask().getAnimation() == 1)) {
            int var21 = Combat.getMissingHealth();
            if (var21 > 2) {
                var19.interact(var1[0]);
                return 3;
            }
            return 0;
        }
        if ((Combat.getCurrentHealth() <= var20.aA.eatAtHP())) {
            var19.interact(var1[3]);
            int[] nArray = new int[3];
            nArray[0] = 4;
            Item var21 = Inventory.getFirst((int[])nArray);
            if (var21 != null && (var19.getId() != 4)) {
                var21.interact(var1[5]);
            }
            return 3;
        }
        return 0;
    }

    @Inject
    protected EatingTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

}

