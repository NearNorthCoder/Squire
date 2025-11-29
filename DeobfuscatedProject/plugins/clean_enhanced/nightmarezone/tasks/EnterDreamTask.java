/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.Squire
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.nightmarezone.tasks.BHelper;

@TaskDesc(name="Enter Dream", priority=1, blocking=true)
public class EnterDreamTask
extends Task {
    private final  SquireNightmareZone ar;
    private final  SquireNightmareZoneConfig as;

    private final  Client at;

    private static void var3() {
        var1 = new String[var2[8]];
        p.var1[p.var2[0]] = "We have less than 26k - stopping";
        p.var1[p.var2[2]] = "Entering dream!";
        p.var1[p.var2[5]] = "Drink";
        p.var1[p.var2[6]] = "Potion";
        p.var1[p.var2[7]] = "Drink";
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Inject
    public EnterDreamTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ar = squireNightmareZone;
        this.as = squireNightmareZoneConfig;
        this.at = client;
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static void var13() {
        var2 = new int[10];
        p.var2[0] = (0x87 ^ 0xA9) & ~(0x9F ^ 0xB1);
        p.var2[1] = 0xB5 ^ 0xAF;
        p.var2[2] = 1;
        p.var2[3] = 0x29 ^ 0x40 ^ (0x79 ^ 0xE);
        p.var2[4] = -1;
        p.var2[5] = 2;
        p.var2[6] = 3;
        p.var2[7] = 131 + 19 - 128 + 114 ^ 39 + 26 - -31 + 44;
        p.var2[8] = 57 + 95 - 100 + 131 ^ 100 + 176 - 176 + 78;
        p.var2[9] = 0x6A ^ 0xA ^ (0xDD ^ 0xB5);
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var2[0];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var2[0];
        while (p.var20(var29, var28)) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if ((0x26 ^ 0x22) >= 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static boolean var31(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        p var32;
        if (p.var5(this.at.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        int var33 = Static.getClient().getVarbitValue(b.u);
        if (p.var4(var33)) {
            return var2[0];
        }
        int var34 = var32.ar.b();
        if (p.var20(var34, var32.as.absorption())) {
            return var2[0];
        }
        int var35 = var32.ar.a();
        if (p.var20(var35, var32.as.overload())) {
            return var2[0];
        }
        int var36 = Static.getClient().getVarbitValue(b.x);
        if (p.var20(var36, var2[1])) {
            Log.error((String)var1[var2[0]]);
            Squire.stop();
            return var2[2];
        }
        if (p.var4(Movement.shouldWalk() ? 1 : 0)) {
            return var2[0];
        }
        Widget var37 = Widgets.get((int)b.v, (int)b.w);
        if (p.var12(var37) && p.var5(var37.isVisible() ? 1 : 0)) {
            var37.interact(var2[0], var2[3], var2[4], var37.getId());
            System.out.println(var1[var2[2]]);
            return var2[2];
        }
        TileObject var38 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (p.var5(tileObject.getName().contains(var1[var2[6]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[2]];
                stringArray[p.var2[0]] = var1[var2[7]];
                if (p.var5(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[2];
                    0;
                    if (1 != 2) return n2 != 0;
                    return ((0x7F ^ 0x65) & ~(0xAB ^ 0xB1)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        });
        if (p.var31(var38)) {
            return var2[0];
        }
        var6_6.interact(var1[var2[5]]);
        return var2[2];
    }

    static {
        p.var13();
        p.var3();
    }
}

