/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import gg.squire.thieving.tasks.ThievingManager;

@TaskDesc(name="Looting Sceptre", priority=650, register=true, blocking=true)
public class LootingSceptreTask
extends Task {
    private final  a y;
    
    private final  Client z;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new int[11];
        f.var1[0] = (31 + 115 - -63 + 9 ^ 80 + 55 - 78 + 75) & (104 + 184 - 165 + 82 ^ 103 + 26 - 120 + 138 ^ -1);
        f.var1[1] = 1;
        f.var1[2] = 2;
        f.var1[3] = 3;
        f.var1[4] = 0xC3 ^ 0xA5 ^ (0xCE ^ 0xAC);
        f.var1[5] = 0x7F ^ 0x7A;
        f.var1[6] = 0xA2 ^ 0xA4;
        f.var1[7] = 0x8A ^ 0x8D;
        f.var1[8] = 0x64 ^ 0x6C;
        f.var1[9] = 0xB7 ^ 0xBE;
        f.var1[10] = 0x52 ^ 0x58;
    }

    private static void var10() {
        var2 = new String[var1[10]];
        f.var2[f.var1[0]] = "Drop";
        f.var2[f.var1[1]] = "Drop";
        f.var2[f.var1[2]] = "Eat";
        f.var2[f.var1[3]] = "Take";
        f.var2[f.var1[4]] = "Pharaoh's sceptre";
        f.var2[f.var1[5]] = "Pharaoh's sceptre";
        f.var2[f.var1[6]] = "Eat";
        f.var2[f.var1[7]] = "Golden";
        f.var2[f.var1[8]] = "Stone";
        f.var2[f.var1[9]] = "Pharaoh's sceptre";
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (f.var21(var20, var19)) {
            char var22 = var18[var20];
            var15.append((char)(var22 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public boolean run() {
        TileItem tileItem2 = TileItems.getNearest(tileItem -> tileItem.getName().contains(var2[var1[9]]));
        if (f.var23(tileItem2)) {
            return var1[0];
        }
        if (f.var24(Inventory.isFull() ? 1 : 0)) {
            Item var25 = Inventory.getFirst(item -> item.getName().contains(var2[var1[8]]));
            if (f.var11(var25)) {
                var25.interact(var2[var1[0]]);
                return var1[1];
            }
            Item var26 = Inventory.getFirst(item -> item.getName().contains(var2[var1[7]]));
            if (f.var11(var26)) {
                var26.interact(var2[var1[1]]);
                return var1[1];
            }
            Item var27 = Inventory.getFirst(item -> {
                String[] stringArray = new String[var1[1]];
                stringArray[f.var1[0]] = var2[var1[6]];
                return item.hasAction(stringArray);
            });
            if (f.var11(var27)) {
                var27.interact(var2[var1[2]]);
                return var1[1];
            }
            return var1[0];
        }
        TileItems.getNearest(tileItem -> tileItem.getName().contains(var2[var1[5]])).interact(var2[var1[3]]);
        return var1[1];
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        if (f.var24(itemSpawned.getItem().getName().contains(var2[var1[4]]) ? 1 : 0)) {
            this.y.b(this.y.e() + var1[1]);
        }
    }

    static {
        f.var9();
        f.var10();
    }

    @Inject
    public LootingSceptreTask(a a2, Client client) {
        this.y = a2;
        this.z = client;
    }
}

