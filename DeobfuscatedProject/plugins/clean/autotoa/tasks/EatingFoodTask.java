/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
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
import net.unethicalite.api.items.Inventory;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Eating Food", priority=250)
public class EatingFoodTask
extends AutotoaTaskBase {
    private final  C cN;
    private final  SquireAutoTOA cO;

    @Inject
    protected EatingFoodTask(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cN = c2;
        this.cO = squireAutoTOA;
    }

    private static boolean lIlIlIIlIlllIl(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        ak var1;
        if (ak.lIlIlIIlIlllIl(this.cO.e() ? 1 : 0)) {
            return llIllIIlllI[0];
        }
        if (ak.lIlIlIIlIllllI(var1.cu.isInInstancedRegion() ? 1 : 0)) {
            return llIllIIlllI[0];
        }
        if (!ak.lIlIlIIlIlllIl(var1.cN.al() ? 1 : 0) || ak.lIlIlIIlIllllI(var1.cN.ar() ? 1 : 0)) {
            return llIllIIlllI[0];
        }
        Item var2 = Inventory.getFirst(item -> item.hasAction(llIllIIllIl[llIllIIlllI[1]]::equals));
        if (ak.lIlIlIIlIlllll(var2)) {
            var1.cN.an();
            var2.interact(llIllIIllIl[llIllIIlllI[0]]);
            return llIllIIlllI[1];
        }
        return llIllIIlllI[0];
    }

    private static boolean lIlIlIIlIlllll(Object object) {
        return object != null;
    }

    static {
        ak.lIlIlIIlIlllII();
        ak.lIlIlIIlIllIll();
    }

    private static boolean lIlIlIIlIllllI(int n2) {
        return n2 == 0;
    }

    private static void lIlIlIIlIllIll() {
        llIllIIllIl = new String[llIllIIlllI[2]];
        ak.llIllIIllIl[ak.llIllIIlllI[0]] = "Eat";
        ak.llIllIIllIl[ak.llIllIIlllI[1]] = "Eat";
    }
}

