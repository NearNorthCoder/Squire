/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
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
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Swapping bolts", priority=50)
public class SwappingBoltsTask
extends VorkathManager {
    
    private static final  int cl;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0xE0 ^ 0xB3 ^ (0x90 ^ 0x94)) & (0xDE ^ 0xC7 ^ (0x4A ^ 4) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    static {
        C.var19();
        C.var20();
        cl = 6;
    }

    private static int var21(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var7_6;
        int n2;
        void var22;
        NPC nPC = this.cg.c(0);
        if nPC == null {
            return 1;
        }
        int var23 = var22.getHealthScale();
        int var24 = var22.getHealthRatio();
        double var25 = (double)var24 / (double)var23 * 100.0;
        if ((C.var21(var25, 35.0 > 0))) {
            n2 = 0;
            0;
            if (2 <= 0) {
                return ((0xCB ^ 0x95) & ~(0xC2 ^ 0x9C)) != 0;
            }
        } else {
            n2 = 1;
        }
        int var26 = n2;
        Item var27 = null;
        if var26 {
            var27 = Inventory.getFirst(item -> {
                int n2;
                if ((item.getName( != 0).contains(var1[4]) ? 1 : 0) && (item.getName( != 0).toLowerCase().contains(var1[5]) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if (1 < 0) {
                        return ((34 + 39 - 44 + 157 ^ 89 + 167 - 236 + 149) & (0x77 ^ 0x59 ^ (0x71 ^ 0x4C) ^ -1)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
            0;
            if (2 >= (33 + 140 - 166 + 140 ^ 145 + 4 - 16 + 18)) {
                return ((124 + 175 - 108 + 57 ^ 84 + 56 - 66 + 101) & (129 + 30 - -2 + 51 ^ 93 + 11 - 92 + 119 ^ -1)) != 0;
            }
        } else {
            var27 = Inventory.getFirst(item -> {
                int n2;
                if ((item.getName( != 0).contains(var1[2]) ? 1 : 0) && (item.getName( != 0).toLowerCase().contains(var1[3]) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if (-1 > 0) {
                        return ((0xC7 ^ 0x99) & ~(0xD9 ^ 0x87)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
        }
        if var27 == null {
            return 1;
        }
        String[] stringArray = new String[0];
        stringArray[1] = var1[1];
        if ((var27.hasAction(stringArray == 0) ? 1 : 0)) {
            return 1;
        }
        var7_6.interact(var1[0]);
        return 0;
    }

    @Inject
    protected SwappingBoltsTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

}

