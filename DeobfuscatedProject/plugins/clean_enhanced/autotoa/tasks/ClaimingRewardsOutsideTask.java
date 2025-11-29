/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Claiming Rewards (Outside)", priority=0x7FFFFFFF, blocking=true)
public class ClaimingRewardsOutsideTask
extends ck {
    
    private static final  int hO;
    private static final  int hP;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        cg.var10();
        cg.var11();
        hO = var1[2];
        hP = var1[3];
    }

    @Override
    public boolean bl() {
        TileObject tileObject;
        block5: {
            block4: {
                String[] stringArray = new String[var1[0]];
                stringArray[cg.var1[1]] = var2[var1[1]];
                tileObject = TileObjects.getNearest((String[])stringArray);
                if (!cg.var12(tileObject)) break block4;
                String[] stringArray2 = new String[var1[0]];
                stringArray2[cg.var1[1]] = var2[var1[0]];
                if (!cg.var13(tileObject.hasAction(stringArray2) ? 1 : 0)) break block5;
            }
            return var1[1];
        }
        Widget var14 = Widgets.get((int)var1[2], (int)var1[3]);
        if (cg.var3(Widgets.isVisible((Widget)var14) ? 1 : 0)) {
            Log.info((String)var2[var1[4]]);
            var14.interact(var2[var1[5]]);
            return var1[0];
        }
        Log.info((String)var2[var1[3]]);
        tileObject.interact(var2[var1[6]]);
        return var1[0];
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var1[1];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var1[1];
        while (cg.var15(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    private static void var11() {
        var2 = new String[var1[7]];
        cg.var2[cg.var1[1]] = "Rewards Niche";
        cg.var2[cg.var1[0]] = "Claim";
        cg.var2[cg.var1[4]] = "[ClaimRewardsItems] Banking reward items...";
        cg.var2[cg.var1[5]] = "Bank-all";
        cg.var2[cg.var1[3]] = "[ClaimRewardsItems] Claiming reward items...";
        cg.var2[cg.var1[6]] = "Claim";
    }

    @Inject
    protected ClaimingRewardsOutsideTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void var10() {
        var1 = new int[9];
        cg.var1[0] = 1;
        cg.var1[1] = (0x2B ^ 7) & ~(0x13 ^ 0x3F);
        cg.var1[2] = -(0xFFFFF5EF & 0x3EB5) & (0xFFFFFFB7 & 0x37EF);
        cg.var1[3] = 0x5D ^ 0x59;
        cg.var1[4] = 2;
        cg.var1[5] = 3;
        cg.var1[6] = 0xC2 ^ 0xC7;
        cg.var1[7] = 0x3B ^ 0x21 ^ (0x3A ^ 0x26);
        cg.var1[8] = 0x47 ^ 0x72 ^ (0x54 ^ 0x69);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static boolean var12(Object object) {
        return object != null;
    }
}

