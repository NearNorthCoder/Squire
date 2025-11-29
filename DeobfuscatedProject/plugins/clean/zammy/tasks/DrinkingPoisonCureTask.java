/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.CHelper;
import gg.squire.zammy.tasks.ZammyManager;
import gg.squire.zammy.tasks.LHelper;
import gg.squire.zammy.tasks.MovingToNextTileTask;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking Poison Cure", priority=8)
public class DrinkingPoisonCureTask
extends Task {
    
    private final  c P;
    
    private final  l O;
    private final  u R;
    private final  f Q;

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var2;
        if (!p.llIIIlIllIllIII(this.O.B() ? 1 : 0) || p.llIIIlIllIllIIl(this.O.G() ? 1 : 0)) {
            return lIllIIlIIIIll[0];
        }
        if (p.llIIIlIllIllIlI(var2.P.e())) {
            return lIllIIlIIIIll[0];
        }
        if (p.llIIIlIllIllIII(var2.R.O() ? 1 : 0)) {
            return lIllIIlIIIIll[0];
        }
        if (p.llIIIlIllIllIIl(Combat.isPoisoned() ? 1 : 0) && p.llIIIlIllIllIIl(Combat.isVenomed() ? 1 : 0)) {
            return lIllIIlIIIIll[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            if (!p.llIIIlIllIllIIl(item.getName().toLowerCase().contains(lIllIIlIIIIlI[lIllIIlIIIIll[2]]) ? 1 : 0) || p.llIIIlIllIllIII(item.getName().toLowerCase().contains(lIllIIlIIIIlI[lIllIIlIIIIll[3]]) ? 1 : 0)) {
                n2 = lIllIIlIIIIll[1];

                if (-1 == 1) {
                    return false;
                }
            } else {
                n2 = lIllIIlIIIIll[0];
            }
            return n2 != 0;
        });
        if (p.llIIIlIllIllIll(var3)) {
            return var2.O.a(lIllIIlIIIIlI[lIllIIlIIIIll[0]]);
        }
        var1_1.interact(lIllIIlIIIIlI[lIllIIlIIIIll[1]]);
        this.Q.r();
        return lIllIIlIIIIll[1];
    }

    private static boolean llIIIlIllIllIll(Object object) {
        return object == null;
    }

    @Inject
    public DrinkingPoisonCureTask(l l2, c c2, f f2, u u2) {
        this.O = l2;
        this.P = c2;
        this.Q = f2;
        this.R = u2;
    }

    private static boolean llIIIlIllIllIlI(Object object) {
        return object != null;
    }

    private static void llIIIlIllIlIllI() {
        lIllIIlIIIIlI = new String[lIllIIlIIIIll[4]];
        p.lIllIIlIIIIlI[p.lIllIIlIIIIll[0]] = "Out of poison cures";
        p.lIllIIlIIIIlI[p.lIllIIlIIIIll[1]] = "Drink";
        p.lIllIIlIIIIlI[p.lIllIIlIIIIll[2]] = "anti";
        p.lIllIIlIIIIlI[p.lIllIIlIIIIll[3]] = "sanfew";
    }

    private static boolean llIIIlIllIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIllIllIIl(int n2) {
        return n2 == 0;
    }

    static {
        p.llIIIlIllIlIlll();
        p.llIIIlIllIlIllI();
    }

    private static boolean llIIIlIllIlllII(int n2, int n3) {
        return n2 < n3;
    }
}

