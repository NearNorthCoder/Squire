/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Get Absorption", priority=6, blocking=true)
public class GetAbsorptionTask
extends Task {
    
    private final  SquireNightmareZone ax;
    private final  Client az;
    
    private final  SquireNightmareZoneConfig ay;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static void var6() {
        var1 = new int[4];
        r.var1[0] = (0xAE ^ 0xC7 ^ (0x52 ^ 8)) & (142 + 96 - 88 + 20 ^ 24 + 6 - -73 + 50 ^ -1);
        r.var1[1] = 1;
        r.var1[2] = 2;
        r.var1[3] = 3;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        r var13;
        if (r.var14(this.az.isInInstancedRegion() ? 1 : 0)) {
            return var1[0];
        }
        int var15 = var13.ax.a();
        if (r.var4(var15, var13.ay.overload())) {
            return var1[0];
        }
        if (r.var14(Dialog.isEnterInputOpen() ? 1 : 0) && r.var14(Dialog.getText().contains(var2[var1[0]]) ? 1 : 0)) {
            Dialog.enterAmount((int)(var13.ay.overload() - var15));
            return var1[1];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[r.var1[0]] = var2[var1[1]];
        TileObject var16 = TileObjects.getNearest((String[])stringArray);
        if (r.var5(var16)) {
            return var1[0];
        }
        var2_2.interact(var2[var1[2]]);
        return var1[1];
    }

    private static void var17() {
        var2 = new String[var1[3]];
        r.var2[r.var1[0]] = "many doses of overload";
        r.var2[r.var1[1]] = "Overload potion";
        r.var2[r.var1[2]] = "Take";
    }

    @Inject
    public GetAbsorptionTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ax = squireNightmareZone;
        this.ay = squireNightmareZoneConfig;
        this.az = client;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (r.var3(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    static {
        r.var6();
        r.var17();
    }
}

