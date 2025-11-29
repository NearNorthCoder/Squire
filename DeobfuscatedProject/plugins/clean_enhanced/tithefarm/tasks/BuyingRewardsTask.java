/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.tithefarm.tasks.GameEnum3;

@TaskDesc(name="Buying Rewards", priority=0x7FFFFFFF, blocking=true)
public class BuyingRewardsTask
extends Task {
    private  boolean M;
    private static final  int F;
    private static final  int G;
    private final  Client L;
    private final  SquireTitheConfig K;
    private static final  int E;
    
    private static final  int H;
    private static final  int J;
    private static final  int I;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (k.var3(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    public boolean run() {
        k var15;
        if (k.var16(this.L.isInInstancedRegion() ? 1 : 0)) {
            this.M = var2[0];
            return var2[0];
        }
        if (k.var16(var15.M)) {
            return var2[0];
        }
        if (k.var17((Object)var15.K.buyItems(), (Object)a.NONE)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[k.var2[0]] = var1[var2[0]];
        stringArray[k.var2[2]] = var1[var2[2]];
        Item var18 = Inventory.getFirst((String[])stringArray);
        if (k.var14(var18)) {
            var18.interact(var1[var2[1]]);
            return var2[2];
        }
        int var19 = Vars.getBit((int)var2[3]);
        if (k.var3(var19, var2[4])) {
            var15.M = var2[2];
            return var2[0];
        }
        Widget var20 = var15.L.getWidget(var2[5]);
        if (k.var21(Widgets.isVisible((Widget)var20) ? 1 : 0)) {
            String[] stringArray2 = new String[var2[2]];
            stringArray2[k.var2[0]] = var1[var2[6]];
            NPC var22 = NPCs.getNearest((String[])stringArray2);
            if (k.var23(var22)) {
                return var2[0];
            }
            var22.interact(var1[var2[7]]);
            return var2[2];
        }
        this.x();
        0;
        return var2[2];
    }

    @Inject
    public BuyingRewardsTask(SquireTitheConfig squireTitheConfig, Client client) {
        this.K = squireTitheConfig;
        this.L = client;
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

    static {
        k.var24();
        k.var25();
        I = var2[10];
        J = var2[11];
        G = var2[8];
        H = var2[9];
        E = var2[5];
        F = var2[4];
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public boolean x() {
        k var32;
        Widget var33;
        int var34;
        int n2;
        if (k.var17((Object)this.K.buyItems(), (Object)a.HERB_BOX)) {
            n2 = var2[8];
            0;
            if ((54 + 20 - 69 + 133 ^ 136 + 82 - 134 + 58) == 0) {
                return ((0x24 ^ 0xE ^ (0x1D ^ 0x22)) & (72 + 81 - 101 + 85 ^ 43 + 18 - -89 + 6 ^ -1)) != 0;
            }
        } else {
            n2 = var34 = var2[9];
        }
        if (k.var23(var33 = var32.L.getWidget(var2[10]))) {
            return var2[0];
        }
        Widget var35 = var33.getDynamicChildren()[var34];
        if (k.var23(var35)) {
            return var2[0];
        }
        Object[] var36 = var35.getOnOpListener();
        var32.L.runScript(var36);
        Widget var37 = var32.L.getWidget(var2[11]);
        if (k.var14(var37)) {
            var37.interact(var1[var2[12]]);
            return var2[2];
        }
        return var2[0];
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    private static void var24() {
        var2 = new int[15];
        k.var2[0] = (15 + 59 - 45 + 149 ^ 51 + 145 - 144 + 111) & (0x3D ^ 0x29 ^ (0x10 ^ 0x15) ^ -1);
        k.var2[1] = 2;
        k.var2[2] = 1;
        k.var2[3] = -(0xFFFFA4ED & 0x7FD3) & (0xFFFFFFFD & 0x37DF);
        k.var2[4] = 0x15 ^ 0xB;
        k.var2[5] = -(0xFFFFEFB9 & 0x5DFF) & (0xFFFFFFFF & 0xEC4DBF);
        k.var2[6] = 3;
        k.var2[7] = 0x98 ^ 0x92 ^ (0x5A ^ 0x54);
        k.var2[8] = 0xE1 ^ 0x99 ^ (0x57 ^ 0x4F);
        k.var2[9] = 0x73 ^ 0x1F;
        k.var2[10] = 0xFFFFE269 & 0x3331DB7;
        k.var2[11] = -(0xFFFFEF6F & 0x3FD2) & (0xFFFFFF5D & 0x3332FFF);
        k.var2[12] = 0x27 ^ 0x22;
        k.var2[13] = 0x7A ^ 0x7C;
        k.var2[14] = 0xD0 ^ 0xA0 ^ (0x7B ^ 3);
    }

    private static boolean var17(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var43) {
            var43.printStackTrace();
            return null;
        }
    }

    private static void var25() {
        var1 = new String[var2[13]];
        k.var1[k.var2[0]] = "Herb box";
        k.var1[k.var2[2]] = "Seed pack";
        k.var1[k.var2[1]] = "Bank-all";
        k.var1[k.var2[6]] = "Farmer Gricoller";
        k.var1[k.var2[7]] = "Rewards";
        k.var1[k.var2[12]] = "Buy-50";
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }
}

