/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.aerialfisher.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Getting bird", priority=6, blocking=true)
public class GettingBirdTask
extends Task {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var2[1];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var2[1];
        while (d.var18(var17, var16)) {
            char var19 = var15[var17];
            var12.append((char)(var19 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (((0xD2 ^ 0x86) & ~(0xEB ^ 0xBF)) == 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static void var20() {
        var2 = new int[4];
        d.var2[0] = 1;
        d.var2[1] = (0x95 ^ 0x9A ^ (0xF9 ^ 0xA4)) & (73 + 23 - -126 + 2 ^ 172 + 99 - 144 + 51 ^ -1);
        d.var2[2] = 0xFFFFF35B & 0x2DED;
        d.var2[3] = 2;
    }

    private static boolean var18(int n, int n2) {
        return n < n2;
    }

    private static boolean var21(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        String[] stringArray = new String[var2[0]];
        stringArray[d.var2[1]] = var1[var2[1]];
        if (d.var21(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            return var2[1];
        }
        if (d.var21(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return var2[0];
        }
        int[] nArray = new int[var2[0]];
        nArray[d.var2[1]] = var2[2];
        NPC var22 = NPCs.getNearest((int[])nArray);
        if (d.var23(var22)) {
            return var2[1];
        }
        var1_1.interact(var1[var2[0]]);
        return var2[0];
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    static {
        d.var20();
        d.var24();
    }

    private static void var24() {
        var1 = new String[var2[3]];
        d.var1[d.var2[1]] = "Cormorant's glove";
        d.var1[d.var2[0]] = "Get bird";
    }
}

