/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Drink Absorption", priority=19, blocking=true)
public class DrinkAbsorptionTask
extends Task {
    
    private  int J;
    private final  SquireNightmareZoneConfig G;
    
    private  int I;
    private  boolean K;
    private final  SquireNightmareZone F;
    private final  Client H;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    static {
        e.var4();
        e.var5();
    }

    private static void var4() {
        var2 = new int[9];
        e.var2[0] = 0xFFFFA5FE & 0x5BF5;
        e.var2[1] = 0x76 ^ 0x33 ^ (0x28 ^ 9);
        e.var2[2] = (0xB8 ^ 0x85 ^ (0x4D ^ 0x3E)) & (70 + 53 - 74 + 164 ^ 62 + 73 - 82 + 102 ^ -1);
        e.var2[3] = 0xFFFFCFFF & 0x3F73;
        e.var2[4] = -(0xFFFFF0AF & 0x3FD9) & (0xFFFFBFFD & 0x7FFE);
        e.var2[5] = 1;
        e.var2[6] = 2;
        e.var2[7] = 3;
        e.var2[8] = 0x84 ^ 0x8C;
    }

    @Inject
    public DrinkAbsorptionTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.I = var2[0];
        this.J = var2[1];
        this.K = var2[2];
        this.F = squireNightmareZone;
        this.G = squireNightmareZoneConfig;
        this.H = client;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[2];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[2];
        while (e.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static void var5() {
        var1 = new String[var2[7]];
        e.var1[e.var2[2]] = "Absorption potion is null D:";
        e.var1[e.var2[5]] = "Drink";
        e.var1[e.var2[6]] = "Absorption (";
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        e var18;
        if (e.var17(this.G.absorption())) {
            return var2[2];
        }
        if (e.var17(var18.H.isInInstancedRegion() ? 1 : 0)) {
            return var2[2];
        }
        int var19 = Static.getClient().getVarbitValue(var2[3]);
        if (e.var3(var18.G.overload()) && e.var17(var19)) {
            return var2[2];
        }
        int var20 = Static.getClient().getVarbitValue(var2[4]);
        if (e.var21(var18.J, var20)) {
            var18.K = var2[5];
        }
        if (e.var15(var18.I, var20)) {
            var18.K = var2[2];
        }
        if (e.var17(var18.K)) {
            return var2[2];
        }
        Item var22 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[6]]));
        if (e.var23(var22)) {
            System.out.println(var1[var2[2]]);
            return var2[2];
        }
        var3_3.interact(var1[var2[5]]);
        return var2[5];
    }

    private static boolean var21(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

        catch (Exception var35) {
            var35.printStackTrace();
            return null;
        }
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var23(Object object) {
        return object == null;
    }
}

