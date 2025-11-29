/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating", priority=130)
public class EatingTask
extends Task {

    private final  SquireBlueDragonKillerConfig C;

    static {
        h.llIlIIlIIIlIIl();
        h.llIlIIlIIIlIII();
    }

    private static boolean llIlIIlIIIllII(Object object) {
        return object == null;
    }

    private static boolean llIlIIlIIIlIll(int n) {
        return n > 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (h.llIlIIlIIIlIll(h.llIlIIlIIIlIlI(Combat.getHealthPercent(), this.C.eatAt()))) {
            return lIIllllIlllI[0];
        }
        Item var1 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIIllllIlllI[2]];
            stringArray[h.lIIllllIlllI[0]] = lIIllllIllIl[lIIllllIlllI[2]];
            return item.hasAction(stringArray);
        });
        if (h.llIlIIlIIIllII(var1)) {
            return lIIllllIlllI[0];
        }
        var1_1.interact(lIIllllIllIl[lIIllllIlllI[0]]);
        this.sleep(lIIllllIlllI[1]);
        return lIIllllIlllI[2];
    }

    @Inject
    public EatingTask(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.C = squireBlueDragonKillerConfig;
    }

    private static void llIlIIlIIIlIII() {
        lIIllllIllIl = new String[lIIllllIlllI[1]];
        h.lIIllllIllIl[h.lIIllllIlllI[0]] = "Eat";
        h.lIIllllIllIl[h.lIIllllIlllI[2]] = "Eat";
    }

    private static int llIlIIlIIIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }
}

