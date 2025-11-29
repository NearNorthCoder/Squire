/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.events.ClientTick
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.skilling.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.skilling.tasks.GameEnum4;
import net.runelite.api.events.ClientTick;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Enchanting Bolts", register=true)
public class EnchantingBoltsTask
extends Task {
    private final  BankStanderConfig y;
    private  double z;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    @Inject
    public EnchantingBoltsTask(BankStanderConfig bankStanderConfig) {
        this.y = bankStanderConfig;
    }

    static {
        L.var3();
    }

    private boolean T() {
        int[] nArray = new int[var1[0]];
        nArray[L.var1[1]] = var1[6];
        return Inventory.contains((int[])nArray);
    }

    private static int var4(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static boolean var6(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ClientTick clientTick) {
        void var2_2;
        L var7;
        if (L.var6((Object)this.y.activity(), (Object)b.ENCHANT_BOLTS)) {
            return;
        }
        Keyboard.type((char)var1[2]);
        if (L.var8(L.var4(var7.z, 1.0))) {
            var7.z -= 0.05;
            return;
        }
        if (L.var2(var7.T() ? 1 : 0)) {
            return;
        }
        Widget var9 = Static.getClient().getWidget(var1[3]);
        if (L.var5(var9)) {
            return;
        }
        var2_2.interact(var1[0], var1[4], var1[5], var1[3]);
        this.z = 2.4;
    }

    private static boolean var8(int n2) {
        return n2 >= 0;
    }

    private static void var3() {
        var1 = new int[7];
        L.var1[0] = 1;
        L.var1[1] = (0xE4 ^ 0xBD) & ~(0xED ^ 0xB4);
        L.var1[2] = 0xE7 ^ 0xC7;
        L.var1[3] = 0xFFFFD02E & 0xDA2FDB;
        L.var1[4] = 0x6E ^ 0x57;
        L.var1[5] = -1;
        L.var1[6] = -(0xFFFF89DC & 0x7FAF) & (0xFFFFBBFF & 0x4FBF);
    }

    public boolean run() {
        boolean bl;
        if (L.var10((Object)this.y.activity(), (Object)b.ENCHANT_BOLTS)) {
            bl = var1[0];
            0;
            if (3 < 0) {
                return ((193 + 172 - 211 + 79 ^ 49 + 74 - -36 + 31) & (105 + 121 - 58 + 84 ^ 91 + 26 - -28 + 26 ^ -1)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    private static boolean var10(Object object, Object object2) {
        return object == object2;
    }
}

