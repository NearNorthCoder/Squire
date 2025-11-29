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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.bandos.tasks.EHelper;
import gg.squire.bandos.tasks.FHelper;

@TaskDesc(name="Consuming peaches", priority=5, blocking=true)
public class ConsumingPeachesTask
extends Task {
    
    private final  e aj;
    
    private final  f ak;

    private static void lIlIlIllllIIIl() {
        llIlllIllIl = new String[llIllllIIIl[3]];
        t.llIlllIllIl[t.llIllllIIIl[0]] = "Eat";
        t.llIlllIllIl[t.llIllllIIIl[2]] = "peach";
    }

    private static boolean lIlIlIlllllIll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIlIlllllIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlllllIIl(int n2) {
        return n2 == 0;
    }

    static {
        t.lIlIlIllllIllI();
        t.lIlIlIllllIIIl();
    }

    private static boolean lIlIlIlllllIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        t var2;
        if (!t.lIlIlIllllIlll(this.aj.ConsumingPeachesTask() ? 1 : 0) || t.lIlIlIllllIlll(this.aj.s() ? 1 : 0)) {
            return llIllllIIIl[0];
        }
        if (!t.lIlIlIlllllIII(Combat.getMissingHealth(), llIllllIIIl[1]) || t.lIlIlIlllllIIl(var2.ak.D() ? 1 : 0)) {
            return llIllllIIIl[0];
        }
        Item var3 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlllIllIl[llIllllIIIl[2]]));
        if (t.lIlIlIlllllIlI(var3)) {
            return llIllllIIIl[0];
        }
        var1_1.interact(llIlllIllIl[llIllllIIIl[0]]);
        this.ak.C();
        return llIllllIIIl[2];
    }

    private static boolean lIlIlIllllIlll(int n2) {
        return n2 != 0;
    }

    @Inject
    public ConsumingPeachesTask(e e2, f f2) {
        this.aj = e2;
        this.ak = f2;
    }
}

