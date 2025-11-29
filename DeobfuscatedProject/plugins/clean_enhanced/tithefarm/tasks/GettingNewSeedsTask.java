/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.tithefarm.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.tithefarm.tasks.TithefarmManager;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Getting new seeds", priority=500, blocking=true)
public class GettingNewSeedsTask
extends TithefarmTaskBase {
    private final  Client V;

    private static final  int S;
    private final  SquireTitheConfig U;
    private static final  int T;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var5() {
        var1 = new int[11];
        o.var1[0] = (0xCB ^ 0x80) & ~(0xF ^ 0x44);
        o.var1[1] = -(0xFFFFFEE3 & 0xDDF) & (0xFFFFDFFF & 0x3FDF);
        o.var1[2] = -(0xFFFFDC3B & 0x7FDF) & (0xFFFFDFBF & 0x7FDE);
        o.var1[3] = 1;
        o.var1[4] = 0xFFFFFF76 & 0x2799;
        o.var1[5] = 2;
        o.var1[6] = 3;
        o.var1[7] = 0xDD ^ 0x9C ^ (0x2A ^ 0x6F);
        o.var1[8] = 118 + 73 - 92 + 57 ^ 118 + 26 - 46 + 55;
        o.var1[9] = 0x60 ^ 0x66;
        o.var1[10] = 85 + 179 - 226 + 163 ^ 157 + 48 - 89 + 77;
    }

    private static boolean var6(int n2, int n3) {
        return n2 > n3;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (o.var16(var15, var14)) {
            char var17 = var13[var15];
            var10.append((char)(var17 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (((106 + 40 - 28 + 104 ^ 121 + 114 - 155 + 68) & (0x35 ^ 0x50 ^ (0x8C ^ 0xA3) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    static {
        o.var5();
        o.var18();
        S = var1[4];
        T = var1[2];
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var25(Object object) {
        return object != null;
    }

    private static boolean var26(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static boolean var33(int n2, int n3) {
        return n2 != n3;
    }

    public boolean run() {
        o var34;
        if (o.var33(this.Z.u(), this.Z.t()) && o.var4(this.V.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (o.var6(Vars.getBit((int)var1[1]), var1[2])) {
            return var1[0];
        }
        Item var35 = Inventory.getFirst(item -> item.getName().endsWith(var2[var1[8]]));
        if (o.var25(var35) && o.var26(var35.getQuantity(), var34.Z.u()) && o.var4(var34.V.isInInstancedRegion() ? 1 : 0)) {
            if (o.var3(var34.U.fruit().a(var35) ? 1 : 0)) {
                return var1[0];
            }
            if (o.var4(Inventory.contains(item -> item.getName().endsWith(var2[var1[7]])) ? 1 : 0)) {
                return var1[0];
            }
        }
        if (!o.var3(var34.V.isInInstancedRegion() ? 1 : 0) || o.var25(var35)) {
            String[] stringArray = new String[var1[3]];
            stringArray[o.var1[0]] = var2[var1[0]];
            TileObject var36 = TileObjects.getNearest((String[])stringArray);
            if (o.var37(var36)) {
                return var1[0];
            }
            var36.interact(var2[var1[3]]);
            return var1[3];
        }
        if (o.var4(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)var1[4]);
            return var1[3];
        }
        String[] stringArray = new String[var1[3]];
        stringArray[o.var1[0]] = var2[var1[5]];
        TileObject var36 = TileObjects.getNearest((String[])stringArray);
        if (o.var4(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)var34.U.fruit().i().ordinal());
            0;
            0;
            if ((0xE6 ^ 0x83 ^ (0x2F ^ 0x4F)) <= 0) {
                return ((0x32 ^ 0xB ^ (0x3B ^ 0x3E)) & (2 ^ (0x8A ^ 0xB4) ^ -1)) != 0;
            }
        } else {
            var36.interact(var2[var1[6]]);
        }
        return var1[3];
    }

    private static boolean var37(Object object) {
        return object == null;
    }

    @Inject
    protected GettingNewSeedsTask(i i2, SquireTitheConfig squireTitheConfig, Client client) {
        super(i2);
        this.U = squireTitheConfig;
        this.V = client;
    }

    private static void var18() {
        var2 = new String[var1[9]];
        o.var2[o.var1[0]] = "Farm door";
        o.var2[o.var1[3]] = "Open";
        o.var2[o.var1[5]] = "Seed table";
        o.var2[o.var1[6]] = "Search";
        o.var2[o.var1[7]] = "fruit";
        o.var2[o.var1[8]] = "seed";
    }
}

