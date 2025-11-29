/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.slayer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperPlugin;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.slayer.tasks.GameEnum;

@TaskDesc(name="Checking for Task", priority=0x7FFFFFFF, blocking=true)
public class CheckingForTask
extends Task {

    private static final  Logger z;
    private final  SquireSkipperPlugin A;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.var10();
        e.var11();
        z = LoggerFactory.getLogger(CheckingForTask.class);
    }

    @Inject
    public CheckingForTask(SquireSkipperPlugin squireSkipperPlugin) {
        this.A = squireSkipperPlugin;
    }

    private static void var11() {
        var1 = new String[var2[5]];
        e.var1[e.var2[1]] = "Check";
        e.var1[e.var2[2]] = "Check";
        e.var1[e.var2[4]] = "slayer helm";
    }

    private static void var10() {
        var2 = new int[7];
        e.var2[0] = 0xFFFF9FF7 & 0x6FED;
        e.var2[1] = (0xD6 ^ 0x98 ^ (0xBA ^ 0xA0)) & (0xDF ^ 0xA3 ^ (0x57 ^ 0x7F) ^ -1);
        e.var2[2] = 1;
        e.var2[3] = -(0xFFFFFB5B & 0x6CE5) & (0xFFFFFBFF & 0x7C7B);
        e.var2[4] = 2;
        e.var2[5] = 3;
        e.var2[6] = 177 + 96 - 270 + 188 ^ 13 + 122 - 26 + 74;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[1];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[1];
        while (e.var9(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var28(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        b b2 = this.A.b();
        this.A.d(Static.getClient().getVarbitValue(var2[0]));
        if (!e.var29((Object)b2) || e.var28(this.A.c() ? 1 : 0)) {
            return var2[1];
        }
        Item var30 = Equipment.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[4]]));
        if (e.var31(var30)) {
            var30.interact(var1[var2[1]]);
            return var2[2];
        }
        int[] nArray = new int[var2[2]];
        nArray[e.var2[1]] = var2[3];
        Item var32 = Inventory.getFirst((int[])nArray);
        if (e.var31(var32)) {
            var32.interact(var1[var2[2]]);
            return var2[2];
        }
        return var2[1];
    }

    private static boolean var29(Object object) {
        return object == null;
    }

    private static boolean var31(Object object) {
        return object != null;
    }
}

