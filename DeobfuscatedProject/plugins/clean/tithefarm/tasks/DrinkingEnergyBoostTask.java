/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.tithefarm.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Drinking energy boost", priority=20)
public class DrinkingEnergyBoostTask
extends Task {
    private final  SquireTitheConfig R;
    private final  Client Q;

    private static boolean lIllIllIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIllIlIlIIlI() {
        lIlIIIIIIlIlI = new String[lIlIIIIIIlIll[6]];
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[0]] = "Drink";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[1]] = "Drink";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[2]] = "energy";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[3]] = "energy";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[4]] = "Stamina";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[5]] = "Stamina";
    }

    private static boolean lIllIllIlIlIlIl(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIllIlIlIlII(int n2) {
        return n2 == 0;
    }

    static {
        n.lIllIllIlIlIIll();
        n.lIllIllIlIlIIlI();
    }

    @Inject
    public DrinkingEnergyBoostTask(Client client, SquireTitheConfig squireTitheConfig) {
        this.Q = client;
        this.R = squireTitheConfig;
    }

    public boolean run() {
        n var2;
        if (n.lIllIllIlIlIlII(this.Q.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIIlIll[0];
        }
        if (n.lIllIllIlIlIlIl(Inventory.contains(item -> item.getName().startsWith(lIlIIIIIIlIlI[lIlIIIIIIlIll[5]])) ? 1 : 0) && n.lIllIllIlIlIlII(Movement.isStaminaBoosted() ? 1 : 0) && n.lIllIllIlIlIllI(Movement.getRunEnergy(), var2.R.energyBoostAt())) {
            Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIIlIlI[lIlIIIIIIlIll[4]])).interact(lIlIIIIIIlIlI[lIlIIIIIIlIll[0]]);
            return lIlIIIIIIlIll[1];
        }
        if (n.lIllIllIlIlIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lIlIIIIIIlIlI[lIlIIIIIIlIll[3]])) ? 1 : 0) && n.lIllIllIlIlIllI(Movement.getRunEnergy(), var2.R.energyBoostAt())) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIIIIIIlIlI[lIlIIIIIIlIll[2]])).interact(lIlIIIIIIlIlI[lIlIIIIIIlIll[1]]);
            return lIlIIIIIIlIll[1];
        }
        return lIlIIIIIIlIll[0];
    }

}

