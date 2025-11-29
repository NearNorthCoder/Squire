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
import gg.squire.skilling.tasks.GameEnum9;
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

    private static boolean lIlIllIlIlllII(int n2) {
        return n2 == 0;
    }

    @Inject
    public EnchantingBoltsTask(BankStanderConfig bankStanderConfig) {
        this.y = bankStanderConfig;
    }

    static {
        L.lIlIllIlIlIlll();
    }

    private boolean T() {
        int[] nArray = new int[lllIIIlllIl[0]];
        nArray[L.lllIIIlllIl[1]] = lllIIIlllIl[6];
        return Inventory.contains((int[])nArray);
    }

    private static int lIlIllIlIllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIlIllIlIlllIl(Object object) {
        return object == null;
    }

    private static boolean lIlIllIlIllIlI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ClientTick clientTick) {
        void var2_2;
        L var1;
        if (L.lIlIllIlIllIlI((Object)this.y.activity(), (Object)b.ENCHANT_BOLTS)) {
            return;
        }
        Keyboard.type((char)lllIIIlllIl[2]);
        if (L.lIlIllIlIllIll(L.lIlIllIlIllIIl(var1.z, 1.0))) {
            var1.z -= 0.05;
            return;
        }
        if (L.lIlIllIlIlllII(var1.T() ? 1 : 0)) {
            return;
        }
        Widget var2 = Static.getClient().getWidget(lllIIIlllIl[3]);
        if (L.lIlIllIlIlllIl(var2)) {
            return;
        }
        var2_2.interact(lllIIIlllIl[0], lllIIIlllIl[4], lllIIIlllIl[5], lllIIIlllIl[3]);
        this.z = 2.4;
    }

    private static boolean lIlIllIlIllIll(int n2) {
        return n2 >= 0;
    }

    public boolean run() {
        boolean bl;
        if (L.lIlIllIlIllIII((Object)this.y.activity(), (Object)b.ENCHANT_BOLTS)) {
            bl = lllIIIlllIl[0];

            if (3 < 0) {
                return false;
            }
        } else {
            bl = lllIIIlllIl[1];
        }
        return bl;
    }

    private static boolean lIlIllIlIllIII(Object object, Object object2) {
        return object == object2;
    }
}

