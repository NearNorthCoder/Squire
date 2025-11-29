/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.membership.SquireMembershipBuyer;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Redeeming Bond")
public class RedeemingBondTask
extends Task {
    private static  String[] llllIlll;
    private final  SquireMembershipBuyer fi;
    private static  int[] lllllIII;

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = 1;
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = 1;
        while (var9 < var8) {
            char var10 = var7[var9];
            var4.append((char)(var10 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if ((0xB0 ^ 0xC0 ^ (0xF2 ^ 0x87)) != 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    public boolean run() {
        int[] nArray = new int[0];
        nArray[1] = 2;
        if ((Inventory.contains((int[] == 0)nArray) ? 1 : 0)) {
            return 1;
        }
        if ((GrandExchange.isOpen( != 0) ? 1 : 0)) {
            Widgets.get((int)3, (int)4).getChild(5).interact(llllIlll[1]);
        }
        if ((Widgets.get(int != null6, (int)0)) && (Widgets.get(int6, (int)7).isVisible() ? 1 : 0)) {
            if ((Widgets.get(int != null6, (int)8)) && (Widgets.get(int6, (int)8).isVisible() ? 1 : 0)) {
                Widgets.get((int)6, (int)8).interact(1);
                Widgets.get((int)9, (int)lllllIII[10]).interact(1);
                return 0;
            }
        } else {
            int[] nArray2 = new int[0];
            nArray2[1] = 2;
            Inventory.getFirst((int[])nArray2).interact(llllIlll[0]);
        }
        return 0;
    }

    @Inject
    public RedeemingBondTask(SquireMembershipBuyer squireMembershipBuyer) {
        this.fi = squireMembershipBuyer;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

}

