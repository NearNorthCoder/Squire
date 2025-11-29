/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Drink Overload", priority=20, blocking=true)
public class DrinkOverloadTask
extends Task {

    private final  Client N;
    private final  SquireNightmareZone L;
    private final  SquireNightmareZoneConfig M;

    private static void var3() {
        var1 = new String[var2[5]];
        f.var1[f.var2[0]] = "Under 51 hp, not overloading";
        f.var1[f.var2[3]] = "Drink";
        f.var1[f.var2[4]] = "Overload (";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        f var4;
        if (f.var5(this.M.overload())) {
            return var2[0];
        }
        if (f.var5(var4.N.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        int var6 = Static.getClient().getVarbitValue(var2[1]);
        if (f.var7(var6)) {
            return var2[0];
        }
        if (f.var8(Skills.getBoostedLevel((SkiSkill.HITPOINTS), var2[2])) {
            Log.error((String)var1[var2[0]]);
            return var2[0];
        }
        Item var9 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[4]]));
        if (f.var10(var9)) {
            return var2[0];
        }
        var2_2.interact(var1[var2[3]]);
        return var2[3];
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    private static void var11() {
        var2 = new int[7];
        f.var2[0] = (0xD6 ^ 0x9B) & ~(0x7C ^ 0x31);
        f.var2[1] = 0xFFFFDF7B & 0x2FF7;
        f.var2[2] = 0x9A ^ 0x96 ^ (0xA3 ^ 0x9C);
        f.var2[3] = 1;
        f.var2[4] = 2;
        f.var2[5] = 3;
        f.var2[6] = 0x65 ^ 0x3C ^ (0x3C ^ 0x6D);
    }

    private static boolean var7(int n2) {
        return n2 > 0;
    }

    @Inject
    public DrinkOverloadTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.L = squireNightmareZone;
        this.M = squireNightmareZoneConfig;
        this.N = client;
    }

    static {
        f.var11();
        f.var3();
    }

    private static boolean var10(Object object) {
        return object == null;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }
}

