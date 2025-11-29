/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.slayer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking Stamina")
public class DrinkingStaminaTask
extends Task {

    private final  SquireSkipperConfig B;

    private static boolean lIlllIlIIllIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlllIlIIllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlIIllIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlllIlIIlIllll() {
        lIlIIlIIlIIlI = new String[lIlIIlIIlIIll[3]];
        g.lIlIIlIIlIIlI[g.lIlIIlIIlIIll[0]] = "Drink";
        g.lIlIIlIIlIIlI[g.lIlIIlIIlIIll[2]] = "Stamina";
    }

    private static boolean lIlllIlIIllIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (g.lIlllIlIIllIIIl(this.B.sipStam() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        if (g.lIlllIlIIllIIll(Movement.getRunEnergy(), lIlIIlIIlIIll[1]) && g.lIlllIlIIllIlII(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        Item var1 = Inventory.getFirst(item -> item.getName().contains(lIlIIlIIlIIlI[lIlIIlIIlIIll[2]]));
        if (g.lIlllIlIIllIlIl(var1)) {
            return lIlIIlIIlIIll[0];
        }
        var1_1.interact(lIlIIlIIlIIlI[lIlIIlIIlIIll[0]]);
        return lIlIIlIIlIIll[2];
    }

    @Inject
    public DrinkingStaminaTask(SquireSkipperConfig squireSkipperConfig) {
        this.B = squireSkipperConfig;
    }

        return String.valueOf(var2);
    }

    static {
        g.lIlllIlIIllIIII();
        g.lIlllIlIIlIllll();
    }

    private static boolean lIlllIlIIlllIII(int n2, int n3) {
        return n2 < n3;
    }
}

