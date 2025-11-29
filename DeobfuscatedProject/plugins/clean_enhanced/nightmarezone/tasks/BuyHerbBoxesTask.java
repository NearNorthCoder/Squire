/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.nightmarezone.tasks.BHelper;

@TaskDesc(name="Buy Herb Boxes", priority=150, blocking=true)
public class BuyHerbBoxesTask
extends Task {
    private final  Client an;
    
    private final  SquireNightmareZoneConfig am;
    
    private final  SquireNightmareZone al;

    private static void var3() {
        var2 = new int[13];
        n.var2[0] = (0x3C ^ 0x77) & ~(0x34 ^ 0x7F);
        n.var2[1] = 1;
        n.var2[2] = 12 + 107 - 5 + 28 ^ 65 + 67 - 39 + 46;
        n.var2[3] = 0xFFFFAF7B & 0x5FFD;
        n.var2[4] = 0x4F ^ 0x4A ^ (0 ^ 0xA);
        n.var2[5] = 0xFFFFAF3E & 0x75DD;
        n.var2[6] = (0x93 ^ 0x9F) + (107 + 29 - 79 + 70) - (0xDF ^ 0xC5) + (0x21 ^ 0x7C);
        n.var2[7] = 2;
        n.var2[8] = 3;
        n.var2[9] = 0xBE ^ 0xBA;
        n.var2[10] = 0x10 ^ 0x40 ^ (0x4F ^ 0x19);
        n.var2[11] = 0x62 ^ 0x65;
        n.var2[12] = 120 + 97 - 113 + 45 ^ 106 + 63 - 92 + 80;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var7_8;
        n var5;
        if (n.var6(this.am.herbBox() ? 1 : 0)) {
            return var2[0];
        }
        if (n.var7(var5.an.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[n.var2[0]] = var1[var2[0]];
        List var8 = Inventory.getAll((String[])stringArray);
        if (n.var9(Inventory.getFreeSlots(), var2[2]) && n.var6(var8.size())) {
            return var2[0];
        }
        if (n.var10(var8.size())) {
            String[] stringArray2 = new String[var2[1]];
            stringArray2[n.var2[0]] = var1[var2[1]];
            Inventory.doActions(item -> item.getName().startsWith(var1[var2[10]]), (String[])stringArray2);
            return var2[1];
        }
        int var11 = Static.getClient().getVarbitValue(var2[3]);
        if (n.var12(var11, var2[4])) {
            return var2[0];
        }
        int var13 = Vars.getVarp((int)b.y);
        if (n.var9(var13, var2[5] * (var2[4] - var11))) {
            return var2[0];
        }
        int var14 = Static.getClient().getVarbitValue(b.s);
        int var15 = Static.getClient().getVarbitValue(b.t);
        if (!n.var12(var14 + var5.al.a(), var5.am.overload()) || n.var9(var15 + var5.al.b(), var5.am.absorption())) {
            return var2[0];
        }
        Widget var16 = Widgets.get((int)var2[6], (int)var2[1], (int)var2[1]);
        if (!n.var17(var16) || n.var6(var16.isVisible() ? 1 : 0)) {
            System.out.println(var1[var2[7]]);
            String[] stringArray3 = new String[var2[1]];
            stringArray3[n.var2[0]] = var1[var2[8]];
            TileObject var18 = TileObjects.getNearest((String[])stringArray3);
            if (n.var4(var18)) {
                return var2[0];
            }
            var18.interact(var1[var2[9]]);
            return var2[1];
        }
        Widget var18 = Widgets.get((int)var2[6], (int)b.o, (int)b.r);
        if (n.var4(var18)) {
            return var2[0];
        }
        var7_8.interact(var1[var2[2]]);
        return var2[1];
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static boolean var17(Object object) {
        return object != null;
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    static {
        n.var3();
        n.var25();
    }

    private static void var25() {
        var1 = new String[var2[11]];
        n.var1[n.var2[0]] = "Herb box";
        n.var1[n.var2[1]] = "Bank-all";
        n.var1[n.var2[7]] = "Widget is null";
        n.var1[n.var2[8]] = "Rewards chest";
        n.var1[n.var2[9]] = "Search";
        n.var1[n.var2[2]] = "Buy-5";
        n.var1[n.var2[10]] = "Herb box";
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    @Inject
    public BuyHerbBoxesTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.al = squireNightmareZone;
        this.am = squireNightmareZoneConfig;
        this.an = client;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static String var32(String var33, String var34) {
        var33 = new String(Base64.getDecoder().decode(var33.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var35 = new StringBuilder();
        char[] var36 = var34.toCharArray();
        int var37 = var2[0];
        char[] var38 = var33.toCharArray();
        int var39 = var38.length;
        int var40 = var2[0];
        while (n.var9(var40, var39)) {
            char var41 = var38[var40];
            var35.append((char)(var41 ^ var36[var37 % var36.length]));
            0;
            ++var37;
            ++var40;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var35);
    }

    private static boolean var10(int n2) {
        return n2 > 0;
    }
}

