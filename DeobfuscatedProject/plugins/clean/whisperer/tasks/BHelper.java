/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.client.game.ItemVariationMapping
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.whisperer.config.SquireWhispererConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@Singleton
public class BHelper {

    private final  SquireWhispererConfig i;

    private static boolean llIIIIlIlIIIIII(int n2) {
        return n2 == 0;
    }

    private  boolean a(int n2, Item item) {
        return this.a(n2).contains(item.getId());
    }

    public List<Integer> a(int n2) {
        return new ArrayList<Integer>(ItemVariationMapping.getVariations((int)n2));
    }

    static {
        b.llIIIIlIIlllIll();
        b.llIIIIlIIlllIlI();
    }

    @Inject
    public BHelper(SquireWhispererConfig squireWhispererConfig) {
        this.i = squireWhispererConfig;
    }

    public boolean a(int[] nArray) {
        return Equipment.containsAllOf((int[])nArray);
    }

    private static boolean llIIIIlIIlllllI(Object object) {
        return object == null;
    }

    private static boolean llIIIIlIIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlIIllllII(int n2, int n3) {
        return n2 < n3;
    }

    public int[] c() {
        BankLoadout bankLoadout = (BankLoadout)this.i.bankLoadout().selected(BankLoadout.class);
        if (b.llIIIIlIIlllllI(bankLoadout)) {
            return new int[lIlIlllIlIlll[0]];
        }
        return bankLoadout.getEquipmentSetup().getIds();
    }

    private static boolean llIIIIlIIllllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean BHelper(int[] nArray) {
        void var1;
        void llllllllllllllIllIIllllllIlIIIlI2;
        ArrayList arrayList = new ArrayList();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var2 = lIlIlllIlIlll[0];
        while (b.llIIIIlIIllllII(var2, (int)llllllllllllllIllIIllllllIlIIIlI2)) {
            b var3;
            void var4;
            void var5 = var4[var2];
            var1.addAll(Inventory.getAll(arg_0 -> var3.a((int)var5, arg_0)));

            ++var2;

            if ((0x12 ^ 0x16) > 0) continue;
            return false;
        }
        if (b.llIIIIlIIllllIl(var1.isEmpty() ? 1 : 0)) {
            return lIlIlllIlIlll[0];
        }
        int var4 = lIlIlllIlIlll[0];
        while (b.llIIIIlIIllllII(var4, Math.min(var1.size(), lIlIlllIlIlll[1]))) {
            Item llllllllllllllIllIIllllllIlIIIlI2 = (Item)var1.get(var4);
            llllllllllllllIllIIllllllIlIIIlI2.interact(string -> {
                int n2;
                if (b.llIIIIlIIllllll(string) && (!b.llIIIIlIlIIIIII(string.equals(lIlIlllIlIlII[lIlIlllIlIlll[0]]) ? 1 : 0) || !b.llIIIIlIlIIIIII(string.equals(lIlIlllIlIlII[lIlIlllIlIlll[2]]) ? 1 : 0) || b.llIIIIlIIllllIl(string.equals(lIlIlllIlIlII[lIlIlllIlIlll[3]]) ? 1 : 0))) {
                    n2 = lIlIlllIlIlll[2];

                    if (2 == 1) {
                        return false;
                    }
                } else {
                    n2 = lIlIlllIlIlll[0];
                }
                return n2 != 0;
            });
            ++var4;

            if (((0x9C ^ 0xB3) & ~(0x14 ^ 0x3B)) > -1) continue;
            return false;
        }
        return lIlIlllIlIlll[2];
    }

    private static void llIIIIlIIlllIlI() {
        lIlIlllIlIlII = new String[lIlIlllIlIlll[4]];
        b.lIlIlllIlIlII[b.lIlIlllIlIlll[0]] = "Wield";
        b.lIlIlllIlIlII[b.lIlIlllIlIlll[2]] = "Wear";
        b.lIlIlllIlIlII[b.lIlIlllIlIlll[3]] = "Equip";
    }

}

