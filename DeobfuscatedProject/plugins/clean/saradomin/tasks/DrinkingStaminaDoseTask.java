/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

@TaskDesc(name="Drinking stamina dose", priority=8)
public class DrinkingStaminaDoseTask
extends Task {

    private final  a aa;
    private final  l Z;
    private final  g Y;

    private static boolean lIlIlIlllIllIlI(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var2;
        if (r.lIlIlIlllIllIII(this.Y.m() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        if (!r.lIlIlIlllIllIIl(var2.Y.l() ? 1 : 0) || r.lIlIlIlllIllIlI(var2.Z.M())) {
            return lIIlIlIIlllIl[0];
        }
        if (!r.lIlIlIlllIllIll(Movement.getRunEnergy(), lIIlIlIIlllIl[1]) || r.lIlIlIlllIllIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        Item var3 = Inventory.getFirst(item -> item.getName().startsWith(lIIlIlIIlllII[lIIlIlIIlllIl[3]]));
        if (!r.lIlIlIlllIllIlI(var3) || r.lIlIlIlllIllIII(var2.aa.e() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        var1_1.interact(lIIlIlIIlllII[lIIlIlIIlllIl[0]]);
        this.aa.b();
        this.sleep(lIIlIlIIlllIl[2]);
        return lIIlIlIIlllIl[3];
    }

    private static boolean lIlIlIlllIllIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public DrinkingStaminaDoseTask(g g2, l l2, a a2) {
        this.Y = g2;
        this.Z = l2;
        this.aa = a2;
    }

    static {
        r.lIlIlIlllIlIlll();
        r.lIlIlIlllIlIllI();
    }

    private static boolean lIlIlIlllIllIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIlllIlIllI() {
        lIIlIlIIlllII = new String[lIIlIlIIlllIl[4]];
        r.lIIlIlIIlllII[r.lIIlIlIIlllIl[0]] = "Drink";
        r.lIIlIlIIlllII[r.lIIlIlIIlllIl[3]] = "Stamina";
    }
}

