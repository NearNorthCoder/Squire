/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum5;

@TaskDesc(name="Depositing seeds", priority=100, blocking=true)
public class DepositingSeedsTask
extends Task {
    private static final  int ah;
    private final  Client ak;
    
    private final  SquireThievingConfig ai;
    private final  SquireThieving aj;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    private static void var6() {
        var1 = new String[var2[2]];
        x.var1[x.var2[0]] = "Open";
    }

    private static void var7() {
        var2 = new int[6];
        x.var2[0] = (0x4E ^ 0x7C ^ (0x16 ^ 0x72)) & (150 + 192 - 154 + 29 ^ 75 + 64 - 76 + 80 ^ -1);
        x.var2[1] = -(0xFFFF97AF & 0x7B77) & (0xFFFFDF7F & 0x27733BF);
        x.var2[2] = 1;
        x.var2[3] = -(0xFFFF9FA2 & 0x787F) & (0xFFFFFF7F & 0x7EFF);
        x.var2[4] = 0x94 ^ 0xA7 ^ (9 ^ 0x3E);
        x.var2[5] = 2;
    }

    static {
        x.var7();
        x.var6();
        ah = var2[1];
    }

    private static boolean var8(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        x var10;
        if (!x.var5((Object)this.ai.method(), (Object)b.PICKPOCKETING) || x.var8((Object)this.ai.pickpocketTarget(), (Object)f.MASTER_FARMER)) {
            return var2[0];
        }
        if (x.var3(var10.ai.depositSeedVault() ? 1 : 0)) {
            return var2[0];
        }
        if (x.var3(Inventory.isFull() ? 1 : 0)) {
            return var2[0];
        }
        Widget var11 = var10.ak.getWidget(var2[1]);
        if (!x.var12(var11) || x.var4(var11.isHidden() ? 1 : 0)) {
            int[] nArray = new int[var2[2]];
            nArray[x.var2[0]] = var2[3];
            TileObject var13 = TileObjects.getNearest((int[])nArray);
            if (x.var14(var13)) {
                return var2[0];
            }
            var13.interact(var1[var2[0]]);
            var10.sleep(var2[4]);
            return var2[2];
        }
        var1_1.interact(var2[0]);
        this.sleep(var2[5]);
        return var2[2];
    }

    private static boolean var14(Object object) {
        return object == null;
    }

    @Inject
    public DepositingSeedsTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving, Client client) {
        this.ai = squireThievingConfig;
        this.aj = squireThieving;
        this.ak = client;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var2[0];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var2[0];
        while (x.var9(var23, var22)) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean var12(Object object) {
        return object != null;
    }
}

