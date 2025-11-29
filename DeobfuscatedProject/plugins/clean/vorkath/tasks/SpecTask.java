/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Spec", priority=11)
public class SpecTask
extends VorkathTaskBase {

    @Inject
    protected SpecTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean llIIIIIIlIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIIlIIlIIl(Object object) {
        return object != null;
    }

    private static void llIIIIIIlIIIllI() {
        lIlIllIIlIlII = new String[lIlIllIIlIlIl[0]];
        B.lIlIllIIlIlII[B.lIlIllIIlIlIl[1]] = "Wield";
    }

    static {
        B.llIIIIIIlIIIlll();
        B.llIIIIIIlIIIllI();
    }

    private static boolean llIIIIIIlIIlIII(Object object) {
        return object == null;
    }

    private static boolean llIIIIIIlIIlIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean Q() {
        B var1;
        if (B.llIIIIIIlIIlIII(this.cg.c(lIlIllIIlIlIl[0]))) {
            return lIlIllIIlIlIl[1];
        }
        int[] nArray = new int[lIlIllIIlIlIl[0]];
        nArray[B.lIlIllIIlIlIl[1]] = lIlIllIIlIlIl[2];
        if (B.llIIIIIIlIIlIIl(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIlIlIl[1];
        }
        if (B.llIIIIIIlIIlIlI(var1.cg.y() ? 1 : 0)) {
            return lIlIllIIlIlIl[1];
        }
        if (!B.llIIIIIIlIIlIll(Combat.isSpecEnabled() ? 1 : 0) || B.llIIIIIIlIIllII(Combat.getSpecEnergy(), lIlIllIIlIlIl[3])) {
            return lIlIllIIlIlIl[1];
        }
        if (B.llIIIIIIlIIllII(var1.cg.x(), lIlIllIIlIlIl[4])) {
            return lIlIllIIlIlIl[1];
        }
        int[] nArray2 = new int[lIlIllIIlIlIl[5]];
        nArray2[B.lIlIllIIlIlIl[1]] = lIlIllIIlIlIl[6];
        nArray2[B.lIlIllIIlIlIl[0]] = lIlIllIIlIlIl[7];
        Item var2 = Inventory.getFirst((int[])nArray2);
        if (B.llIIIIIIlIIlIIl(var2)) {
            if (B.llIIIIIIlIIlIlI(Inventory.isFull() ? 1 : 0)) {
                var1.ch.K();
                return lIlIllIIlIlIl[0];
            }
            var2.interact(lIlIllIIlIlII[lIlIllIIlIlIl[1]]);
        }
        Combat.toggleSpec();
        return lIlIllIIlIlIl[0];
    }

    private static boolean llIIIIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }
}

