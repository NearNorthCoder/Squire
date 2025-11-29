/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GiantsfoundryManager;
import gg.squire.giantsfoundry.tasks.GiantsfoundryTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Getting commission", priority=2147483597, blocking=true)
public class GettingCommissionTask
extends GiantsfoundryTaskBase {

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var1_1;
        t var4;
        if (t.var3(this.T.h() ? 1 : 0)) {
            return var1[0];
        }
        if (t.var3(Dialog.hasOption((String)var2[var1[0]]) ? 1 : 0)) {
            String[] stringArray = new String[var1[1]];
            stringArray[t.var1[0]] = var2[var1[1]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return var1[1];
        }
        NPC var5 = var4.T.p();
        if (t.var6(var5)) {
            return var1[0];
        }
        var1_1.interact(var2[var1[2]]);
        return var1[1];
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    static {
        t.var8();
        t.var9();
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (t.var7(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (-1 <= 3) continue;
            return null;
        }
        return String.valueOf(var13);
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var2 = new String[var1[3]];
        t.var2[t.var1[0]] = "Yes";
        t.var2[t.var1[1]] = "Yes";
        t.var2[t.var1[2]] = "Commission";
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    @Inject
    public GettingCommissionTask(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static void var8() {
        var1 = new int[5];
        t.var1[0] = (1 ^ 0x44) & ~(0x83 ^ 0xC6);
        t.var1[1] = 1;
        t.var1[2] = 2;
        t.var1[3] = 3;
        t.var1[4] = 0x4A ^ 0x40 ^ 2;
    }
}

