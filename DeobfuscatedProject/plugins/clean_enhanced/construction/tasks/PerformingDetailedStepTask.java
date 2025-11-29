/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Performing detailed step")
public class PerformingDetailedStepTask
extends Task {
    private static  String[] llIIlIll;
    private static  int[] llIIllII;
    private final  SquireQuestHelper fN;

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    private static void var2() {
        llIIlIll = new String[llIIllII[7]];
        bk.llIIlIll[bk.llIIllII[0]] = "DetailedQuestStep";
        bk.llIIlIll[bk.llIIllII[2]] = "Interacting with item";
        bk.llIIlIll[bk.llIIllII[3]] = "Rub";
        bk.llIIlIll[bk.llIIllII[4]] = "Read";
        bk.llIIlIll[bk.llIIllII[5]] = "Rub";
        bk.llIIlIll[bk.llIIllII[6]] = "Read";
    }

    static {
        bk.var3();
        bk.var2();
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = llIIllII[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = llIIllII[0];
        while (bk.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var22(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        bk var23;
        String string = this.fN.cz();
        if (bk.var1(string.equals(llIIlIll[llIIllII[0]]) ? 1 : 0)) {
            return llIIllII[0];
        }
        int var24 = var23.fN.cJ();
        if (bk.var25(var24, llIIllII[1])) {
            int[] nArray = new int[llIIllII[2]];
            nArray[bk.llIIllII[0]] = var24;
            Item var26 = Inventory.getFirst((int[])nArray);
            if (bk.var4(var26)) {
                Log.info((String)llIIlIll[llIIllII[2]]);
                String[] stringArray = new String[llIIllII[3]];
                stringArray[bk.llIIllII[0]] = llIIlIll[llIIllII[3]];
                stringArray[bk.llIIllII[2]] = llIIlIll[llIIllII[4]];
                if (bk.var22(var26.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llIIllII[3]];
                    stringArray2[bk.llIIllII[0]] = llIIlIll[llIIllII[5]];
                    stringArray2[bk.llIIllII[2]] = llIIlIll[llIIllII[6]];
                    var26.interact(stringArray2);
                    0;
                    if (-3 > 0) {
                        return ((0x70 ^ 0x4D ^ (0x6B ^ 5)) & (46 + 31 - 28 + 78 ^ (0x4E ^ 0x62) ^ -1)) != 0;
                    }
                } else {
                    var26.interact(llIIllII[0]);
                }
                var23.sleep(llIIllII[5]);
                return llIIllII[2];
            }
        }
        return llIIllII[0];
    }

    private static void var3() {
        llIIllII = new int[9];
        bk.llIIllII[0] = (0x71 ^ 0x26 ^ (0xC5 ^ 0x9F)) & (0xAC ^ 0xC7 ^ (0x4C ^ 0x2A) ^ -1);
        bk.llIIllII[1] = -1;
        bk.llIIllII[2] = 1;
        bk.llIIllII[3] = 2;
        bk.llIIllII[4] = 3;
        bk.llIIllII[5] = 0x48 ^ 0x4C;
        bk.llIIllII[6] = 0xB3 ^ 0xB6;
        bk.llIIllII[7] = 0x8F ^ 0x89;
        bk.llIIllII[8] = 0xC ^ 0x6A ^ (0x3F ^ 0x51);
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var25(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public PerformingDetailedStepTask(SquireQuestHelper squireQuestHelper) {
        this.fN = squireQuestHelper;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }
}

