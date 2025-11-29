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
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominManager;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

@TaskDesc(name="Eating food", priority=8)
public class EatingFoodTask
extends Task {

    private final  a ad;
    private final  SquireSaraConfig ae;
    private final  l ac;
    private final  g ab;

    private static boolean lIlIlIlIllIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIllIIlll(int n2) {
        return n2 != 0;
    }

    @Inject
    public EatingFoodTask(g g2, l l2, a a2, SquireSaraConfig squireSaraConfig) {
        this.ab = g2;
        this.ac = l2;
        this.ad = a2;
        this.ae = squireSaraConfig;
    }

        return String.valueOf(var1);
    }

    private static void lIlIlIlIllIIlII() {
        lIIlIIllllIll = new String[lIIlIIlllllII[4]];
        s.lIIlIIllllIll[s.lIIlIIlllllII[0]] = "Peach";
        s.lIIlIIllllIll[s.lIIlIIlllllII[1]] = "Eat";
        s.lIIlIIllllIll[s.lIIlIIlllllII[2]] = "Peach";
        s.lIIlIIllllIll[s.lIIlIIlllllII[3]] = "Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s var2;
        if (s.lIlIlIlIllIIllI(this.ab.m() ? 1 : 0)) {
            return lIIlIIlllllII[0];
        }
        if (s.lIlIlIlIllIIlll(var2.ab.l() ? 1 : 0) && s.lIlIlIlIllIlIII(var2.ac.M())) {
            return lIIlIIlllllII[0];
        }
        int var3 = var2.ae.eatFoodAt();
        if (!s.lIlIlIlIllIlIIl(Combat.getCurrentHealth(), var3) || s.lIlIlIlIllIIllI(var2.ad.d() ? 1 : 0)) {
            return lIIlIIlllllII[0];
        }
        Item var4 = Inventory.getFirst(item -> {
            int n2;
            if (s.lIlIlIlIllIIllI(item.getName().equals(lIIlIIllllIll[lIIlIIlllllII[2]]) ? 1 : 0) && s.lIlIlIlIllIIlll(item.hasAction(lIIlIIllllIll[lIIlIIlllllII[3]]::equals) ? 1 : 0)) {
                n2 = lIIlIIlllllII[1];

                if (3 < 0) {
                    return ((9 + 128 - 8 + 2 ^ 90 + 32 - 9 + 75) & (0x6B ^ 0x4E ^ (0x7F ^ 0x65) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlIIlllllII[0];
            }
            return n2 != 0;
        });
        if (s.lIlIlIlIllIlIlI(var4)) {
            String[] stringArray = new String[lIIlIIlllllII[1]];
            stringArray[s.lIIlIIlllllII[0]] = lIIlIIllllIll[lIIlIIlllllII[0]];
            var4 = Inventory.getFirst((String[])stringArray);
        }
        if (s.lIlIlIlIllIlIlI(var4)) {
            return var2.U();
        }
        var2_2.interact(lIIlIIllllIll[lIIlIIlllllII[1]]);
        this.ad.c();
        return lIIlIIlllllII[1];
    }

    private boolean U() {
        return lIIlIIlllllII[0];
    }

    private static boolean lIlIlIlIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        s.lIlIlIlIllIIlIl();
        s.lIlIlIlIllIIlII();
    }

    private static boolean lIlIlIlIllIlIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIllIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIlIllIlIII(Object object) {
        return object != null;
    }
}

