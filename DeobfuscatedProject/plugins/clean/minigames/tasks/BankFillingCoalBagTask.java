/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank$Inventory
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.VHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;

@TaskDesc(name="Bank filling coal bag")
public class BankFillingCoalBagTask
extends MinigamesTaskBase<v> {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(v v2, o o2) {
        void var1;
        Item item = Bank.Inventory.getFirst((int[])v2.I());
        if (Q.llIIllllIllIIl(item)) {
            return lIIllIlIIllI[0];
        }
        String[] stringArray = new String[lIIllIlIIllI[1]];
        stringArray[Q.lIIllIlIIllI[0]] = lIIllIlIIlIl[lIIllIlIIllI[0]];
        if (Q.llIIllllIllIlI(var1.hasAction(stringArray) ? 1 : 0)) {
            var1.interact(lIIllIlIIlIl[lIIllIlIIllI[1]]);
            return lIIllIlIIllI[0];
        }
        item.interact(lIIllIlIIlIl[lIIllIlIIllI[2]]);
        o2.k().u();
        return lIIllIlIIllI[1];
    }

    static {
        Q.llIIllllIllIII();
        Q.llIIllllIlIlll();
    }

    private static void llIIllllIlIlll() {
        lIIllIlIIlIl = new String[lIIllIlIIllI[4]];
        Q.lIIllIlIIlIl[Q.lIIllIlIIllI[0]] = "Empty";
        Q.lIIllIlIIlIl[Q.lIIllIlIIllI[1]] = "Empty";
        Q.lIIllIlIIlIl[Q.lIIllIlIIllI[2]] = "Fill";
        Q.lIIllIlIIlIl[Q.lIIllIlIIllI[3]] = "fill";
    }

    @Inject
    public BankFillingCoalBagTask(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, VHelper.class, string -> string.toLowerCase().contains(lIIllIlIIlIl[lIIllIlIIllI[3]]));
    }

    private static boolean llIIllllIllIIl(Object object) {
        return object == null;
    }

    private static boolean llIIllllIllIlI(int n2) {
        return n2 != 0;
    }
}

