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
package gg.squire.hunter.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.hunter.tasks.GameEnum9;
import squire.gg.hunter.SquireHerbiboarConfig;

@TaskDesc(name="Drinking stamina potion", priority=1)
public class DrinkingStaminaPotionTask
extends Task {
    @Inject
    private  SquireHerbiboarConfig p;

    public boolean run() {
        m var1;
        if (m.lIIIlIlIllIIIll((Object)this.p.useEnergyRestoration(), (Object)e.NONE)) {
            return lllIIllIllIl[0];
        }
        Item var2 = Inventory.getFirst((int[])var1.p.useEnergyRestoration().j());
        if (m.lIIIlIlIllIIlII(var2)) {
            return lllIIllIllIl[0];
        }
        if (m.lIIIlIlIllIIlIl(Movement.isWalking() ? 1 : 0)) {
            return lllIIllIllIl[0];
        }
        if (m.lIIIlIlIllIIllI(Movement.getRunEnergy(), lllIIllIllIl[1]) && m.lIIIlIlIllIIlIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            var2.interact(lllIIllIllII[lllIIllIllIl[0]]);
            var1.sleep(lllIIllIllIl[2]);
            return lllIIllIllIl[3];
        }
        return lllIIllIllIl[0];
    }

    private static boolean lIIIlIlIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlIllIIlII(Object object) {
        return object == null;
    }

    private static boolean lIIIlIlIllIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIlIllIIlIl(int n2) {
        return n2 == 0;
    }

    static {
        m.lIIIlIlIllIIIlI();
        m.lIIIlIlIllIIIIl();
    }

    private static void lIIIlIlIllIIIIl() {
        lllIIllIllII = new String[lllIIllIllIl[3]];
        m.lllIIllIllII[m.lllIIllIllIl[0]] = "Drink";
    }
}

