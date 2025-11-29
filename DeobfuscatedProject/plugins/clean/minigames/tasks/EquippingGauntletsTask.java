/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.IHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.VHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping Gauntlets")
public class EquippingGauntletsTask
extends MinigamesTaskBase<v> {

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(v v2, o o2) {
        void var3_3;
        Item var1;
        Item item;
        if (S.llIIlllIlllIll(Bank.isOpen() ? 1 : 0)) {
            item = Bank.Inventory.getFirst((int[])v2.I());

        } else {
            void var2;
            item = Inventory.getFirst((int[])var2.I());
        }
        if (S.llIIlllIllllII(var1 = item)) {
            return lIIllIIllllI[0];
        }
        String[] stringArray = new String[lIIllIIllllI[1]];
        stringArray[S.lIIllIIllllI[0]] = lIIllIIlllIl[lIIllIIllllI[0]];
        stringArray[S.lIIllIIllllI[2]] = lIIllIIlllIl[lIIllIIllllI[2]];
        stringArray[S.lIIllIIllllI[3]] = lIIllIIlllIl[lIIllIIllllI[3]];
        var3_3.interact(stringArray);
        return lIIllIIllllI[0];
    }

    static {
        S.llIIlllIlllIlI();
        S.llIIlllIllIlll();
    }

    private static boolean llIIlllIlllIll(int n2) {
        return n2 != 0;
    }

    private static void llIIlllIllIlll() {
        lIIllIIlllIl = new String[lIIllIIllllI[1]];
        S.lIIllIIlllIl[S.lIIllIIllllI[0]] = "Wear";
        S.lIIllIIlllIl[S.lIIllIIllllI[2]] = "Equip";
        S.lIIllIIlllIl[S.lIIllIIllllI[3]] = "Wield";
    }

    @Inject
    public EquippingGauntletsTask(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, VHelper.class, string -> {
            int n2;
            if (!S.llIIlllIllllIl(string.equals(I.bf) ? 1 : 0) || !S.llIIlllIllllIl(string.equals(I.bd) ? 1 : 0) || !S.llIIlllIllllIl(string.equals(I.bi) ? 1 : 0) || S.llIIlllIlllIll(string.equals(I.bj) ? 1 : 0)) {
                n2 = lIIllIIllllI[2];

            } else {
                n2 = lIIllIIllllI[0];
            }
            return n2 != 0;
        });
    }

        return String.valueOf(var3);
    }

    private static boolean llIIlllIllllIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIllllII(Object object) {
        return object == null;
    }

    private static boolean llIIlllIlllllI(int n2, int n3) {
        return n2 < n3;
    }

}

