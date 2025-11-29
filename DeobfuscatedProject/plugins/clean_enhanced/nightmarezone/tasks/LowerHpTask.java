/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
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
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Lower HP", priority=15, blocking=true)
public class LowerHpTask
extends Task {
    
    private final  SquireNightmareZoneConfig T;
    private final  SquireNightmareZone S;
    private final  Client U;

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static void var5() {
        var1 = new String[var2[6]];
        h.var1[h.var2[0]] = "Locator orb";
        h.var1[h.var2[1]] = "Feel";
        h.var1[h.var2[3]] = "Dwarven rock cake";
        h.var1[h.var2[5]] = "Guzzle";
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var13(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var15(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        h var17;
        if (h.var16(this.U.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (h.var13(Skills.getBoostedLevel((SkiSkill.HITPOINTS), var2[1])) {
            return var2[0];
        }
        int var18 = Static.getClient().getVarbitValue(var2[2]);
        if (h.var4(var17.T.overload()) && !h.var12(var18, var2[3]) || h.var15(var18, var2[4])) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[h.var2[0]] = var1[var2[0]];
        Item var19 = Inventory.getFirst((String[])stringArray);
        if (h.var3(var19)) {
            var19.interact(var1[var2[1]]);
            return var2[1];
        }
        String[] stringArray2 = new String[var2[1]];
        stringArray2[h.var2[0]] = var1[var2[3]];
        Item var20 = Inventory.getFirst((String[])stringArray2);
        if (h.var3(var20)) {
            var20.interact(var1[var2[5]]);
            return var2[1];
        }
        return var2[0];
    }

    @Inject
    public LowerHpTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.S = squireNightmareZone;
        this.T = squireNightmareZoneConfig;
        this.U = client;
    }

    static {
        h.var21();
        h.var5();
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[0];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[0];
        while (h.var14(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if ((147 + 164 - 269 + 148 ^ 109 + 58 - 126 + 145) >= (0x4D ^ 0x4B ^ 2)) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private static void var21() {
        var2 = new int[7];
        h.var2[0] = 2 & ~2;
        h.var2[1] = 1;
        h.var2[2] = -(0xFFFFF85F & 0x67A1) & (0xFFFFEF7B & 0x7FF7);
        h.var2[3] = 2;
        h.var2[4] = 91 + 36 - 109 + 135 ^ 41 + 135 - 156 + 118;
        h.var2[5] = 3;
        h.var2[6] = 0x7B ^ 0x7F;
    }
}

