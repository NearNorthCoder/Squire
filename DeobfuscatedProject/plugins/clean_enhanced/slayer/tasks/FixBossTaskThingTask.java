/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Fix Boss Task Thing", priority=10, blocking=true)
public class FixBossTaskThingTask
extends Task {

    static {
        i.var3();
        i.var4();
    }

    private static void var4() {
        var2 = new String[var1[5]];
        i.var2[i.var1[0]] = "I've got a boss assignment";
        i.var2[i.var1[1]] = "Fixing boss task";
        i.var2[i.var1[2]] = "Oh yes,";
        i.var2[i.var1[3]] = "Fixing boss task";
        i.var2[i.var1[4]] = "Fixing boss task";
    }

    private static void var3() {
        var1 = new int[7];
        i.var1[0] = (0x29 ^ 0x69 ^ (0xC7 ^ 0xA2)) & (0x23 ^ 0x6F ^ (0xEE ^ 0x87) ^ -1);
        i.var1[1] = 1;
        i.var1[2] = 2;
        i.var1[3] = 3;
        i.var1[4] = 51 + 99 - 63 + 79 ^ 57 + 1 - 0 + 104;
        i.var1[5] = 0x46 ^ 0x43;
        i.var1[6] = 0xBB ^ 0xB3;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (i.var6(Dialog.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (i.var5(Dialog.getText().contains(var2[var1[0]]) ? 1 : 0)) {
            Log.info((String)var2[var1[1]]);
            Dialog.continueSpace();
            return var1[1];
        }
        if (i.var5(Dialog.getText().contains(var2[var1[2]]) ? 1 : 0)) {
            Log.info((String)var2[var1[3]]);
            Dialog.continueSpace();
            return var1[1];
        }
        if (i.var5(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Log.info((String)var2[var1[4]]);
            Dialog.enterAmount((int)var1[5]);
            return var1[1];
        }
        return var1[0];
    }

    @Inject
    public FixBossTaskThingTask() {
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[0];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[0];
        while (i.var7(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (((18 + 21 - -47 + 163 ^ 88 + 91 - 26 + 16) & (196 + 100 - 242 + 197 ^ 138 + 142 - 161 + 52 ^ -1)) <= (98 + 41 - 48 + 62 ^ 37 + 75 - 87 + 132)) continue;
            return null;
        }
        return String.valueOf(var23);
    }
}

