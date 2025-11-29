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

@TaskDesc(name="Consuming peaches", priority=5, blocking=true)
public class ConsumingPeachesTask
extends Task {
    private final  g aA;
    
    private final  a aB;

    private static boolean lIlIlIlIlIlllll(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIlIlIlIllI() {
        lIIlIIlllIlll = new String[lIIlIIllllIlI[3]];
        B.lIIlIIlllIlll[B.lIIlIIllllIlI[0]] = "Eat";
        B.lIIlIIlllIlll[B.lIIlIIllllIlI[2]] = "peach";
    }

    static {
        B.lIlIlIlIlIlllII();
        B.lIlIlIlIlIlIllI();
    }

    private static boolean lIlIlIlIllIIIII(Object object) {
        return object == null;
    }

    @Inject
    public ConsumingPeachesTask(g g2, a a2) {
        this.aA = g2;
        this.aB = a2;
    }

    private static boolean lIlIlIlIlIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        B var1;
        if (!B.lIlIlIlIlIlllIl(this.aA.m() ? 1 : 0) || B.lIlIlIlIlIlllIl(this.aA.l() ? 1 : 0)) {
            return lIIlIIllllIlI[0];
        }
        if (!B.lIlIlIlIlIllllI(Combat.getMissingHealth(), lIIlIIllllIlI[1]) || B.lIlIlIlIlIlllll(var1.aB.d() ? 1 : 0)) {
            return lIIlIIllllIlI[0];
        }
        if (B.lIlIlIlIlIlllIl(var1.aA.o() ? 1 : 0)) {
            return lIIlIIllllIlI[0];
        }
        Item var2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIIlIIlllIlll[lIIlIIllllIlI[2]]));
        if (B.lIlIlIlIllIIIII(var2)) {
            return lIIlIIllllIlI[0];
        }
        var1_1.interact(lIIlIIlllIlll[lIIlIIllllIlI[0]]);
        this.aB.c();
        return lIIlIIllllIlI[2];
    }

    private static boolean lIlIlIlIlIlllIl(int n2) {
        return n2 != 0;
    }

}

