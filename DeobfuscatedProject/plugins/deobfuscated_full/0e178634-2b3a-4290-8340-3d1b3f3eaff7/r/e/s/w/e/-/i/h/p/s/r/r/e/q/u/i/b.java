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
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

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
public class b {
    private static /* synthetic */ int[] lIlIlllIlIlll;
    private static /* synthetic */ String[] lIlIlllIlIlII;
    private final /* synthetic */ SquireWhispererConfig i;

    private static boolean llIIIIlIlIIIIII(int n2) {
        return n2 == 0;
    }

    private /* synthetic */ boolean a(int n2, Item item) {
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
    public b(SquireWhispererConfig squireWhispererConfig) {
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
    public boolean b(int[] nArray) {
        void var1;
        void llllllllllllllIllIIllllllIlIIIlI2;
        ArrayList arrayList = new ArrayList();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var8 = lIlIlllIlIlll[0];
        while (b.llIIIIlIIllllII(var8, (int)llllllllllllllIllIIllllllIlIIIlI2)) {
            b var10;
            void var4;
            void var3 = var4[var8];
            var1.addAll(Inventory.getAll(arg_0 -> var10.a((int)var3, arg_0)));
            0;
            ++var8;
            0;
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
                    0;
                    if (2 == 1) {
                        return false;
                    }
                } else {
                    n2 = lIlIlllIlIlll[0];
                }
                return n2 != 0;
            });
            ++var4;
            0;
            if (((0x9C ^ 0xB3) & ~(0x14 ^ 0x3B)) > -1) continue;
            return false;
        }
        return lIlIlllIlIlll[2];
    }

    private static String llIIIIlIIllIIIl(String var5, String var7) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIlIlllIlIlll[3], var9);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIIlllIlI() {
        lIlIlllIlIlII = new String[lIlIlllIlIlll[4]];
        b.lIlIlllIlIlII[b.lIlIlllIlIlll[0]] = b."Wield";
        b.lIlIlllIlIlII[b.lIlIlllIlIlll[2]] = b."Wear";
        b.lIlIlllIlIlII[b.lIlIlllIlIlll[3]] = b."Equip";
    }

    private static void llIIIIlIIlllIll() {
        lIlIlllIlIlll = new int[5];
        b.lIlIlllIlIlll[0] = (0xCF ^ 0xA3 ^ (0x6E ^ 0x4F)) & (0xFD ^ 0xA6 ^ (0x11 ^ 7) ^ -1);
        b.lIlIlllIlIlll[1] = 0x3D ^ 0x40 ^ (0x21 ^ 0x5B);
        b.lIlIlllIlIlll[2] = 1;
        b.lIlIlllIlIlll[3] = 2;
        b.lIlIlllIlIlll[4] = 3;
    }
}

