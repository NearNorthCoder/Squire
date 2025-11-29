/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping Items", priority=1)
public class DroppingItemsTask
extends HunterTaskBase {

    static {
        C.var3();
        C.var4();
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[1];
        while (C.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    @Override
    protected boolean x() {
        int[] nArray = new int[var2[0]];
        nArray[C.var2[1]] = var2[2];
        if (C.var16(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[var2[0]];
            nArray2[C.var2[1]] = var2[2];
            Inventory.getFirst((int[])nArray2).interact(var1[var2[1]]);
            return var2[0];
        }
        int[] nArray3 = new int[var2[0]];
        nArray3[C.var2[1]] = var2[3];
        if (C.var16(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            C var17;
            if (C.var16(var17.z().buryBones() ? 1 : 0)) {
                int[] nArray4 = new int[var2[0]];
                nArray4[C.var2[1]] = var2[3];
                Inventory.getFirst((int[])nArray4).interact(var1[var2[0]]);
                0;
                if (1 <= -1) {
                    return ((1 + 43 - -44 + 39 ^ (0x39 ^ 0x64)) & (159 + 8 - 46 + 49 ^ 59 + 120 - 74 + 31 ^ -1)) != 0;
                }
            } else {
                int[] nArray5 = new int[var2[0]];
                nArray5[C.var2[1]] = var2[3];
                Inventory.getFirst((int[])nArray5).interact(var1[var2[4]]);
            }
            return var2[0];
        }
        return var2[1];
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    @Inject
    public DroppingItemsTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static void var3() {
        var2 = new int[7];
        C.var2[0] = 1;
        C.var2[1] = (0x25 ^ 0x73 ^ (0x11 ^ 0x78)) & (4 ^ 0x58 ^ (0x48 ^ 0x2B) ^ -1);
        C.var2[2] = -(0xFFFFD5AF & 0x7B56) & (0xFFFFFFFF & 0x77FF);
        C.var2[3] = -(0xFFFFF67B & 0x7DB6) & (0xFFFFFF3F & 0x76FF);
        C.var2[4] = 2;
        C.var2[5] = 3;
        C.var2[6] = 130 + 170 - 298 + 203 ^ 55 + 184 - 111 + 69;
    }

    private static void var4() {
        var1 = new String[var2[5]];
        C.var1[C.var2[1]] = "Drop";
        C.var1[C.var2[0]] = "Bury";
        C.var1[C.var2[4]] = "Drop";
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }
}

