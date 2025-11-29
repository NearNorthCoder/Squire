/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

public class VHelper
extends MinigamesTaskBase {
    private final  int[] av;

    private static boolean llIIllIllIlIIl(Object object) {
        return object == null;
    }

    private static void llIIllIllIIllI() {
        lIIlIllllIIl = new String[lIIlIllllIlI[10]];
        v.lIIlIllllIIl[v.lIIlIllllIlI[0]] = " ";
        v.lIIlIllllIIl[v.lIIlIllllIlI[2]] = "Equip";
        v.lIIlIllllIIl[v.lIIlIllllIlI[3]] = "Refill";
        v.lIIlIllllIIl[v.lIIlIllllIlI[4]] = "Fill";
        v.lIIlIllllIIl[v.lIIlIllllIlI[5]] = "Empty";
        v.lIIlIllllIIl[v.lIIlIllllIlI[6]] = "Wear";
        v.lIIlIllllIIl[v.lIIlIllllIlI[7]] = "Equip";
        v.lIIlIllllIIl[v.lIIlIllllIlI[8]] = "Wield";
        v.lIIlIllllIIl[v.lIIlIllllIlI[9]] = "Fill";
    }

    private static boolean llIIllIllIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean c(o o2) {
        String var1;
        Item var2;
        v var3;
        Item item;
        if (v.llIIllIllIlIII(Bank.isOpen() ? 1 : 0)) {
            item = Bank.Inventory.getFirst((int[])this.av);

            if ((0x15 ^ 0x10) <= 0) {
                return false;
            }
        } else {
            item = Inventory.getFirst((int[])var3.av);
        }
        if (v.llIIllIllIlIIl(var2 = item)) {
            return lIIlIllllIlI[0];
        }
        String var4 = var1 = var3.aw.split(lIIlIllllIIl[lIIlIllllIlI[0]])[lIIlIllllIlI[0]];
        int var5 = lIIlIllllIlI[1];
        switch (var4.hashCode()) {
            case 67205136: {
                if (!v.llIIllIllIlIII(var4.equals(lIIlIllllIIl[lIIlIllllIlI[2]]) ? 1 : 0)) break;
                var5 = lIIlIllllIlI[0];

                if ((0x8E ^ 0x8B) > 0) break;
                return false;
            }
            case -1850958250: {
                if (!v.llIIllIllIlIII(var4.equals(lIIlIllllIIl[lIIlIllllIlI[3]]) ? 1 : 0)) break;
                var5 = lIIlIllllIlI[2];

                if (((0xDB ^ 0x8E ^ (0x8B ^ 0xBC)) & (0xCF ^ 0x95 ^ (0x81 ^ 0xB9) ^ -1)) < 3) break;
                return ((0xE2 ^ 0xC1 ^ (6 ^ 0x15)) & (0x7E ^ 0x56 ^ (0x4E ^ 0x56) ^ -1)) != 0;
            }
            case 2189731: {
                if (!v.llIIllIllIlIII(var4.equals(lIIlIllllIIl[lIIlIllllIlI[4]]) ? 1 : 0)) break;
                var5 = lIIlIllllIlI[3];

                if (3 != 0) break;
                return false;
            }
            case 67081517: {
                if (!v.llIIllIllIlIII(var4.equals(lIIlIllllIIl[lIIlIllllIlI[5]]) ? 1 : 0)) break;
                var5 = lIIlIllllIlI[4];
            }
        }
        switch (var5) {
            case 0: {
                String[] stringArray = new String[lIIlIllllIlI[4]];
                stringArray[v.lIIlIllllIlI[0]] = lIIlIllllIIl[lIIlIllllIlI[6]];
                stringArray[v.lIIlIllllIlI[2]] = lIIlIllllIIl[lIIlIllllIlI[7]];
                stringArray[v.lIIlIllllIlI[3]] = lIIlIllllIIl[lIIlIllllIlI[8]];
                var2.interact(stringArray);

                if (-1 == -1) break;
                return false;
            }
            case 1: 
            case 2: {
                void var6;
                var2.interact(lIIlIllllIIl[lIIlIllllIlI[9]]);
                var6.k().u();

                if (3 == 3) break;
                return ((187 + 151 - 255 + 150 ^ 11 + 74 - 73 + 151) & (0x3A ^ 0x7E ^ (0x54 ^ 0x5A) ^ -1)) != 0;
            }
            case 3: {
                void var6;
                var2.interact(var1);
                var6.k().t();

                if ((189 + 36 - 44 + 14 ^ 187 + 139 - 197 + 70) != -1) break;
                return ((1 ^ (0x38 ^ 0x3E)) & (106 + 160 - 192 + 125 ^ 55 + 83 - 128 + 182 ^ -1)) != 0;
            }
            default: {
                var2.interact(var1);
            }
        }
        return lIIlIllllIlI[2];
    }

    static {
        v.llIIllIllIIlll();
        v.llIIllIllIIllI();
    }

    public VHelper(String string, int ... nArray) {
        super(string);
        this.av = nArray;
    }

    public int[] I() {
        return this.av;
    }

        return String.valueOf(var7);
    }

    private static boolean llIIllIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }
}

