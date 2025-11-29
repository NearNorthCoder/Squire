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
package gg.squire.bandos.tasks;

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
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.bandos.tasks.DHelper;
import gg.squire.bandos.tasks.EHelper;
import gg.squire.bandos.tasks.FHelper;
import gg.squire.bandos.tasks.MovingToNextTileTask;

@TaskDesc(name="Eating food", priority=8)
public class EatingFoodTask
extends Task {
    private final  f U;
    private final  d T;
    
    private final  e S;
    private final  r V;

    static {
        o.lIlIllIIIIIllI();
        o.lIlIllIIIIIlIl();
    }

    @Inject
    public EatingFoodTask(e e2, d d2, f f2, r r2) {
        this.S = e2;
        this.T = d2;
        this.U = f2;
        this.V = r2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        o var1;
        if (!o.lIlIllIIIIIlll(this.S.t() ? 1 : 0) || o.lIlIllIIIIlIII(this.S.y() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        if (o.lIlIllIIIIIlll(var1.S.s() ? 1 : 0) && o.lIlIllIIIIlIIl(var1.T.m())) {
            return llIllllIlII[0];
        }
        if (!o.lIlIllIIIIlIlI(Combat.getCurrentHealth(), llIllllIlII[1]) || o.lIlIllIIIIlIII(var1.U.D() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        if (o.lIlIllIIIIIlll(var1.V.O() ? 1 : 0) && o.lIlIllIIIIIlll(var1.S.s() ? 1 : 0)) {
            return llIllllIlII[0];
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (o.lIlIllIIIIlIII(item.getName().equals(llIllllIIll[llIllllIlII[3]]) ? 1 : 0) && o.lIlIllIIIIIlll(item.hasAction(llIllllIIll[llIllllIlII[4]]::equals) ? 1 : 0)) {
                n2 = llIllllIlII[2];

                if ((89 + 46 - 50 + 89 ^ 166 + 6 - 111 + 109) <= -1) {
                    return ((101 + 218 - 248 + 159 ^ 6 + 24 - -62 + 81) & (0x43 ^ 0 ^ (0xBB ^ 0xB3) ^ -1)) != 0;
                }
            } else {
                n2 = llIllllIlII[0];
            }
            return n2 != 0;
        });
        if (o.lIlIllIIIIlIll(var2)) {
            String[] stringArray = new String[llIllllIlII[2]];
            stringArray[o.llIllllIlII[0]] = llIllllIIll[llIllllIlII[0]];
            var2 = Inventory.getFirst((String[])stringArray);
        }
        if (o.lIlIllIIIIlIll(var2)) {
            return var1.M();
        }
        var1_1.interact(llIllllIIll[llIllllIlII[2]]);
        this.U.C();
        return llIllllIlII[2];
    }

    private static boolean lIlIllIIIIlIII(int n2) {
        return n2 == 0;
    }

    private boolean M() {
        return llIllllIlII[0];
    }

    private static boolean lIlIllIIIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIllIIIIlIIl(Object object) {
        return object != null;
    }

    private static void lIlIllIIIIIlIl() {
        llIllllIIll = new String[llIllllIlII[5]];
        o.llIllllIIll[o.llIllllIlII[0]] = "Peach";
        o.llIllllIIll[o.llIllllIlII[2]] = "Eat";
        o.llIllllIIll[o.llIllllIlII[3]] = "Peach";
        o.llIllllIIll[o.llIllllIlII[4]] = "Eat";
    }

    private static boolean lIlIllIIIIlIll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIIIIlll(int n2) {
        return n2 != 0;
    }

}

