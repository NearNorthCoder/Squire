/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using Soul Bearer")
public class UsingSoulBearerTask
extends Task {
    private final  LooterConfig eI;
    private static  int[] lIIlllIll;
    private final  SquireLooter eJ;
    private static  String[] lIIlllIlI;

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = lIIlllIll[0];
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = lIIlllIll[0];
        while (aP.var10(var9, var8)) {
            char var11 = var7[var9];
            var4.append((char)(var11 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private static void var13() {
        lIIlllIll = new int[5];
        aP.lIIlllIll[0] = (0xAD ^ 0x98) & ~(0x4A ^ 0x7F);
        aP.lIIlllIll[1] = 1;
        aP.lIIlllIll[2] = 0xFFFFECFF & 0x5FB2;
        aP.lIIlllIll[3] = 2;
        aP.lIIlllIll[4] = 0x62 ^ 0x6A;
    }

    static {
        aP.var13();
        aP.var14();
    }

    private static void var14() {
        lIIlllIlI = new String[lIIlllIll[3]];
        aP.lIIlllIlI[aP.lIIlllIll[0]] = "Fill";
        aP.lIIlllIlI[aP.lIIlllIll[1]] = "Ensouled";
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        if (aP.var15(this.eI.useSoulBearer() ? 1 : 0)) {
            return lIIlllIll[0];
        }
        if (aP.var12(Inventory.contains(item -> item.getName().contains(lIIlllIlI[lIIlllIll[1]])) ? 1 : 0)) {
            int[] nArray = new int[lIIlllIll[1]];
            nArray[aP.lIIlllIll[0]] = lIIlllIll[2];
            if (aP.var12(Inventory.contains((int[])nArray) ? 1 : 0)) {
                aP var22;
                int[] nArray2 = new int[lIIlllIll[1]];
                nArray2[aP.lIIlllIll[0]] = lIIlllIll[2];
                Inventory.getFirst((int[])nArray2).interact(lIIlllIlI[lIIlllIll[0]]);
                var22.sleep(lIIlllIll[1]);
            }
        }
        return lIIlllIll[1];
    }

    @Inject
    public UsingSoulBearerTask(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eI = looterConfig;
        this.eJ = squireLooter;
    }
}

