/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Applying Silk", priority=100)
public class ApplyingSilkTask
extends AutotoaTaskBase {
    private  int cA;
    private final  C cy;
    
    private final  SquireAutoTOA cz;

    public boolean run() {
        ab var1;
        if (ab.lIIlllIllIIIll(this.cz.e() ? 1 : 0)) {
            return llIIIIllIlI[0];
        }
        if (ab.lIIlllIllIIlII(var1.aq() ? 1 : 0)) {
            return llIIIIllIlI[0];
        }
        if (!ab.lIIlllIllIIlIl(Combat.getMissingHealth(), llIIIIllIlI[1]) || ab.lIIlllIllIIlII(var1.cy.al() ? 1 : 0)) {
            return llIIIIllIlI[0];
        }
        if (ab.lIIlllIllIIllI(var1.cu.getTickCount() - var1.cA, llIIIIllIlI[2])) {
            return llIIIIllIlI[0];
        }
        Item var2 = Inventory.getFirst(item -> item.getName().startsWith(llIIIIllIIl[llIIIIllIlI[3]]));
        if (ab.lIIlllIllIIlll(var2)) {
            var2.interact(llIIIIllIIl[llIIIIllIlI[0]]);
            var1.cA = var1.cu.getTickCount();
            var1.cy.an();
            return llIIIIllIlI[3];
        }
        return llIIIIllIlI[0];
    }

    private static boolean lIIlllIllIIlll(Object object) {
        return object != null;
    }

    private static boolean lIIlllIllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllIllIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected ApplyingSilkTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cy = c2;
        this.cz = squireAutoTOA;
    }

    static {
        ab.lIIlllIllIIIlI();
        ab.lIIlllIllIIIIl();
    }

    private static boolean lIIlllIllIIIll(int n2) {
        return n2 != 0;
    }

    private static void lIIlllIllIIIIl() {
        llIIIIllIIl = new String[llIIIIllIlI[4]];
        ab.llIIIIllIIl[ab.llIIIIllIlI[0]] = "Apply";
        ab.llIIIIllIIl[ab.llIIIIllIlI[3]] = "Silk dressing";
    }
}

