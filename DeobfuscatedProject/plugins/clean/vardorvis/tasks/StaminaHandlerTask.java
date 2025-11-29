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
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler", priority=2137483647)
public class StaminaHandlerTask
extends Task {
    private final  SquireVardorvisConfig ag;
    private final  SquireVardorvis af;

    @Inject
    StaminaHandlerTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.af = squireVardorvis;
        this.ag = squireVardorvisConfig;
    }

    private static boolean lIllllIIllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIIllllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllllIIllllIII(Object object) {
        return object == null;
    }

    private static boolean lIllllIIllllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllllIIlllIllI() {
        lIlIlIIIIIIll = new String[lIlIlIIIIIlII[5]];
        o.lIlIlIIIIIIll[o.lIlIlIIIIIlII[0]] = "Drink";
        o.lIlIlIIIIIIll[o.lIlIlIIIIIlII[3]] = "Drink";
        o.lIlIlIIIIIIll[o.lIlIlIIIIIlII[4]] = "Stamina";
    }

    static {
        o.lIllllIIlllIlll();
        o.lIllllIIlllIllI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIlIlIIIIIIll[lIlIlIIIIIlII[4]]));
        if (o.lIllllIIllllIII(item2)) {
            return lIlIlIIIIIlII[0];
        }
        if (o.lIllllIIllllIIl(Movement.getRunEnergy(), lIlIlIIIIIlII[1])) {
            return lIlIlIIIIIlII[0];
        }
        if (o.lIllllIIllllIlI(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (o.lIllllIIllllIll(Movement.getRunEnergy(), lIlIlIIIIIlII[2])) {
                void var1;
                var1.interact(lIlIlIIIIIIll[lIlIlIIIIIlII[0]]);
                return lIlIlIIIIIlII[3];
            }
            return lIlIlIIIIIlII[0];
        }
        item2.interact(lIlIlIIIIIIll[lIlIlIIIIIlII[3]]);
        return lIlIlIIIIIlII[3];
    }

}

