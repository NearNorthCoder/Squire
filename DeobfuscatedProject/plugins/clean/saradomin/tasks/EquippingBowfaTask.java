/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Equipping Bowfa")
public class EquippingBowfaTask
extends Task {
    
    private final  g aR;
    private final  SquireSaraConfig aQ;

    private static void lIlIlIlIlllllIl() {
        lIIlIlIIIIIll = new String[lIIlIlIIIIlII[3]];
        I.lIIlIlIIIIIll[I.lIIlIlIIIIlII[0]] = "Wield";
        I.lIIlIlIIIIIll[I.lIIlIlIIIIlII[2]] = "faerdhinen";
    }

    private static boolean lIlIlIllIIIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIlIlllllll(int n2) {
        return n2 == 0;
    }

    static {
        I.lIlIlIlIllllllI();
        I.lIlIlIlIlllllIl();
    }

    private static boolean lIlIlIllIIIIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public EquippingBowfaTask(SquireSaraConfig squireSaraConfig, g g2) {
        this.aQ = squireSaraConfig;
        this.aR = g2;
    }

    public boolean run() {
        I var1;
        if (I.lIlIlIlIlllllll(this.aQ.useBlowpipe() ? 1 : 0)) {
            return lIIlIlIIIIlII[0];
        }
        if (I.lIlIlIllIIIIIII(var1.aR.o() ? 1 : 0) && I.lIlIlIlIlllllll(var1.aR.l() ? 1 : 0) && I.lIlIlIllIIIIIIl(var1.aR.k(), lIIlIlIIIIlII[1])) {
            return lIIlIlIIIIlII[0];
        }
        if (I.lIlIlIllIIIIIlI(var1.aR.t()) && I.lIlIlIllIIIIIII(var1.aR.t().B() ? 1 : 0)) {
            return lIIlIlIIIIlII[0];
        }
        Item var2 = Inventory.getFirst(item -> item.getName().contains(lIIlIlIIIIIll[lIIlIlIIIIlII[2]]));
        if (I.lIlIlIllIIIIIlI(var2)) {
            var2.interact(lIIlIlIIIIIll[lIIlIlIIIIlII[0]]);
            return lIIlIlIIIIlII[2];
        }
        return lIIlIlIIIIlII[0];
    }

    private static boolean lIlIlIllIIIIIlI(Object object) {
        return object != null;
    }
}

