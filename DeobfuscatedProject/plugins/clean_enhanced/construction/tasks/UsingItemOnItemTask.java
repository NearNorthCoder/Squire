/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using item on item", priority=10, blocking=true)
public class UsingItemOnItemTask
extends Task {
    private static  String[] lIIlIllIl;
    private static  int[] lIIlIlllI;
    private final  SquireQuestHelper fX;

    private static void var1() {
        lIIlIllIl = new String[lIIlIlllI[1]];
        bu.lIIlIllIl[bu.lIIlIlllI[0]] = "DetailedQuestStep";
        bu.lIIlIllIl[bu.lIIlIlllI[2]] = "ItemRequirement";
    }

    private static void var2() {
        lIIlIlllI = new int[4];
        bu.lIIlIlllI[0] = (0x23 ^ 0x7B ^ (0x47 ^ 0x25)) & (0x3E ^ 0x6E ^ (0x1F ^ 0x75) ^ -1);
        bu.lIIlIlllI[1] = 2;
        bu.lIIlIlllI[2] = 1;
        bu.lIIlIlllI[3] = 0xA9 ^ 0xA1;
    }

    static {
        bu.var2();
        bu.var1();
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static boolean var13(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public UsingItemOnItemTask(SquireQuestHelper squireQuestHelper) {
        this.fX = squireQuestHelper;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        void var5_5;
        bu var14;
        String string = this.fX.cz();
        if (bu.var3(string.equals(lIIlIllIl[lIIlIlllI[0]]) ? 1 : 0)) {
            return lIIlIlllI[0];
        }
        List<Object> var15 = var14.fX.cE();
        if (bu.var13(var15.size(), lIIlIlllI[1])) {
            return lIIlIlllI[0];
        }
        if (bu.var4(var15.stream().anyMatch(object -> {
            boolean bl2;
            if (bu.var3(object.getClass().getSimpleName().equals(lIIlIllIl[lIIlIlllI[2]]) ? 1 : 0)) {
                bl2 = lIIlIlllI[2];
                0;
                if null != null {
                    return ((6 ^ 0x35) & ~(0x40 ^ 0x73)) != 0;
                }
            } else {
                bl2 = lIIlIlllI[0];
            }
            return bl2;
        }) ? 1 : 0)) {
            return lIIlIlllI[0];
        }
        int var16 = var14.fX.A(lIIlIlllI[0]);
        int var17 = var14.fX.A(lIIlIlllI[2]);
        int[] nArray = new int[lIIlIlllI[2]];
        nArray[bu.lIIlIlllI[0]] = var16;
        Item var18 = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lIIlIlllI[2]];
        nArray2[bu.lIIlIlllI[0]] = var17;
        Item var19 = Inventory.getFirst((int[])nArray2);
        if (!bu.var12(var18) || bu.var11(var19)) {
            return lIIlIlllI[0];
        }
        var5_5.useOn((Item)var6_6);
        return lIIlIlllI[2];
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }
}

