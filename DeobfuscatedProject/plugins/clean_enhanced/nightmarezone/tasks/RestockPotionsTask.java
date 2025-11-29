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
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.nightmarezone.tasks.BHelper;

@TaskDesc(name="Restock Potions", priority=200, blocking=true)
public class RestockPotionsTask
extends Task {
    private final  SquireNightmareZone aA;
    private final  Client aC;
    
    private final  SquireNightmareZoneConfig aB;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        s.var4();
        s.var5();
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    public boolean run() {
        s var8;
        if (s.var6(this.aC.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        if (s.var6(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return var1[1];
        }
        int var9 = Static.getClient().getVarbitValue(b.s);
        int var10 = Static.getClient().getVarbitValue(b.t);
        if (s.var11(var9 + var8.aA.a(), var8.aB.overload()) && s.var11(var10 + var8.aA.b(), var8.aB.absorption())) {
            return var1[0];
        }
        Widget var12 = Widgets.get((int)var1[2], (int)var1[1], (int)var1[1]);
        if (!s.var13(var12) || s.var3(var12.isVisible() ? 1 : 0)) {
            String[] stringArray = new String[var1[1]];
            stringArray[s.var1[0]] = var2[var1[0]];
            TileObject var14 = TileObjects.getNearest((String[])stringArray);
            if (s.var7(var14)) {
                return var1[0];
            }
            var14.interact(var2[var1[1]]);
            return var1[1];
        }
        Widget var14 = Widgets.get((int)var1[2], (int)b.n, (int)b.p);
        if (s.var15(var9, var8.aB.overload()) && s.var13(var14)) {
            var14.interact(var2[var1[3]]);
            return var1[1];
        }
        Widget var16 = Widgets.get((int)var1[2], (int)b.n, (int)b.q);
        if (s.var15(var10, var8.aB.absorption()) && s.var13(var16)) {
            var16.interact(var2[var1[4]]);
            return var1[1];
        }
        return var1[0];
    }

    private static boolean var11(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    @Inject
    public RestockPotionsTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.aA = squireNightmareZone;
        this.aB = squireNightmareZoneConfig;
        this.aC = client;
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var2 = new String[var1[5]];
        s.var2[s.var1[0]] = "Rewards chest";
        s.var2[s.var1[1]] = "Search";
        s.var2[s.var1[3]] = "Buy-10";
        s.var2[s.var1[4]] = "Buy-10";
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var1[0];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var1[0];
        while (s.var15(var31, var30)) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if ((0x3E ^ 0x7A ^ (0xCA ^ 0x8B)) > 0) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    private static void var4() {
        var1 = new int[6];
        s.var1[0] = (0x4F ^ 0x45) & ~(0xC9 ^ 0xC3);
        s.var1[1] = 1;
        s.var1[2] = (0x6B ^ 0x6F) + (7 ^ 0x75) - (0x62 ^ 0x55) + (7 + 137 - 119 + 118);
        s.var1[3] = 2;
        s.var1[4] = 3;
        s.var1[5] = 0x1B ^ 0x60 ^ 82 + 21 - 92 + 116;
    }
}

