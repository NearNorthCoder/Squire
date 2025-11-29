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
package gg.squire.duke.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler", priority=2137483647)
public class StaminaHandlerTask
extends Task {
    private final  SquireDukeSucellusConfig am;
    private final  SquireDukeSucellus al;

    private static boolean lllIlIIlIIlIll(int n2) {
        return n2 != 0;
    }

    static {
        l.lllIlIIlIIlIII();
        l.lllIlIIlIIIlIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIllIllIIlIl[lIllIllIIlll[4]]));
        if (l.lllIlIIlIIlIIl(item2)) {
            return lIllIllIIlll[0];
        }
        if (l.lllIlIIlIIlIlI(Movement.getRunEnergy(), lIllIllIIlll[1])) {
            return lIllIllIIlll[0];
        }
        if (l.lllIlIIlIIlIll(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (l.lllIlIIlIIllII(Movement.getRunEnergy(), lIllIllIIlll[2])) {
                void var1;
                var1.interact(lIllIllIIlIl[lIllIllIIlll[0]]);
                return lIllIllIIlll[3];
            }
            return lIllIllIIlll[0];
        }
        item2.interact(lIllIllIIlIl[lIllIllIIlll[3]]);
        return lIllIllIIlll[3];
    }

        return String.valueOf(var2);
    }

    private static boolean lllIlIIlIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    StaminaHandlerTask(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.al = squireDukeSucellus;
        this.am = squireDukeSucellusConfig;
    }

    private static boolean lllIlIIlIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIlIIlIIIlIl() {
        lIllIllIIlIl = new String[lIllIllIIlll[5]];
        l.lIllIllIIlIl[l.lIllIllIIlll[0]] = "Drink";
        l.lIllIllIIlIl[l.lIllIllIIlll[3]] = "Drink";
        l.lIllIllIIlIl[l.lIllIllIIlll[4]] = "Stamina";
    }
}

