/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Leaving Tithe Instance", priority=0x7FFFFFFF, blocking=true)
public class LeavingTitheInstanceTask
extends Task {
    private static final  int W;
    private final  SquireTitheConfig X;
    private final  Client Y;

    static {
        q.var3();
        q.var4();
        W = var2[2];
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (q.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private boolean y() {
        String[] stringArray = new String[var2[3]];
        stringArray[q.var2[0]] = var1[var2[5]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (q.var29(tileObject)) {
            return var2[0];
        }
        tileObject.interact(var1[var2[6]]);
        return var2[3];
    }

    private static boolean var30(int n2) {
        return n2 > 0;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static void var4() {
        var1 = new String[var2[10]];
        q.var1[q.var2[0]] = "Wear";
        q.var1[q.var2[3]] = "Sack";
        q.var1[q.var2[4]] = "Deposit";
        q.var1[q.var2[5]] = "Farm door";
        q.var1[q.var2[6]] = "Open";
        q.var1[q.var2[7]] = "Farmer's";
        q.var1[q.var2[8]] = "fruit";
        q.var1[q.var2[9]] = "seed";
    }

    private static boolean var31(int n2) {
        return n2 == 0;
    }

    private static boolean var29(Object object) {
        return object == null;
    }

    @Inject
    public LeavingTitheInstanceTask(SquireTitheConfig squireTitheConfig, Client client) {
        this.X = squireTitheConfig;
        this.Y = client;
    }

    public boolean run() {
        q var32;
        if (q.var31(this.Y.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        Item var33 = Inventory.getFirst(item -> item.getName().endsWith(var1[var2[9]]));
        if (q.var14(Vars.getBit((int)var2[1]), var2[2]) && q.var31(var32.X.fruit().a(var33) ? 1 : 0)) {
            return var2[0];
        }
        if (q.var16(Inventory.contains(item -> item.getName().toLowerCase().contains(var1[var2[8]])) ? 1 : 0)) {
            List var34 = Inventory.getAll(item -> item.getName().contains(var1[var2[7]]));
            if (q.var30(var34.size())) {
                Iterator var35 = var34.iterator();
                while (q.var16(var35.hasNext() ? 1 : 0)) {
                    Item var36 = (Item)var35.next();
                    var36.interact(var1[var2[0]]);
                    0;
                    if (((0x37 ^ 0xF ^ (0x5D ^ 0x6A)) & (0x30 ^ 0x43 ^ (0x26 ^ 0x5A) ^ -1)) == 0) continue;
                    return ((0x6B ^ 0x18 ^ (0xC0 ^ 0x98)) & (157 + 90 - 213 + 125 ^ 104 + 5 - -24 + 47 ^ -1)) != 0;
                }
                return var2[3];
            }
            String[] stringArray = new String[var2[3]];
            stringArray[q.var2[0]] = var1[var2[3]];
            TileObject var35 = TileObjects.getNearest((String[])stringArray);
            if (q.var29(var35)) {
                return var2[0];
            }
            var35.interact(var1[var2[4]]);
            return var2[3];
        }
        return this.y();
    }

    private static void var3() {
        var2 = new int[11];
        q.var2[0] = (0x6D ^ 0x36 ^ (0x16 ^ 0x7D)) & (13 + 26 - -68 + 65 ^ 142 + 6 - 61 + 69 ^ -1);
        q.var2[1] = 0xFFFFD3FD & 0x3F1F;
        q.var2[2] = 0xFFFFF4DF & 0x3F39;
        q.var2[3] = 1;
        q.var2[4] = 2;
        q.var2[5] = 3;
        q.var2[6] = 0x63 ^ 0x67;
        q.var2[7] = 0x5E ^ 0x5B;
        q.var2[8] = 153 + 0 - 28 + 72 ^ 46 + 82 - 102 + 169;
        q.var2[9] = 150 + 86 - 111 + 54 ^ 151 + 42 - 110 + 97;
        q.var2[10] = 115 + 75 - 2 + 13 ^ 98 + 144 - 125 + 76;
    }
}

