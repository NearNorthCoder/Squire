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
        void llllllllllllllIllIIllllllIlIIlII;
        void llllllllllllllIllIIllllllIlIIIlI2;
        ArrayList arrayList = new ArrayList();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int llllllllllllllIllIIllllllIlIIIIl = lIlIlllIlIlll[0];
        while (b.llIIIIlIIllllII(llllllllllllllIllIIllllllIlIIIIl, (int)llllllllllllllIllIIllllllIlIIIlI2)) {
            b llllllllllllllIllIIllllllIlIIllI;
            void llllllllllllllIllIIllllllIlIIIll;
            void llllllllllllllIllIIllllllIlIIIII = llllllllllllllIllIIllllllIlIIIll[llllllllllllllIllIIllllllIlIIIIl];
            llllllllllllllIllIIllllllIlIIlII.addAll(Inventory.getAll(arg_0 -> llllllllllllllIllIIllllllIlIIllI.a((int)llllllllllllllIllIIllllllIlIIIII, arg_0)));
            0;
            ++llllllllllllllIllIIllllllIlIIIIl;
            0;
            if ((0x12 ^ 0x16) > 0) continue;
            return ((0xE8 ^ 0xBD) & ~(0x78 ^ 0x2D)) != 0;
        }
        if (b.llIIIIlIIllllIl(llllllllllllllIllIIllllllIlIIlII.isEmpty() ? 1 : 0)) {
            return lIlIlllIlIlll[0];
        }
        int llllllllllllllIllIIllllllIlIIIll = lIlIlllIlIlll[0];
        while (b.llIIIIlIIllllII(llllllllllllllIllIIllllllIlIIIll, Math.min(llllllllllllllIllIIllllllIlIIlII.size(), lIlIlllIlIlll[1]))) {
            Item llllllllllllllIllIIllllllIlIIIlI2 = (Item)llllllllllllllIllIIllllllIlIIlII.get(llllllllllllllIllIIllllllIlIIIll);
            llllllllllllllIllIIllllllIlIIIlI2.interact(string -> {
                int n2;
                if (b.llIIIIlIIllllll(string) && (!b.llIIIIlIlIIIIII(string.equals(lIlIlllIlIlII[lIlIlllIlIlll[0]]) ? 1 : 0) || !b.llIIIIlIlIIIIII(string.equals(lIlIlllIlIlII[lIlIlllIlIlll[2]]) ? 1 : 0) || b.llIIIIlIIllllIl(string.equals(lIlIlllIlIlII[lIlIlllIlIlll[3]]) ? 1 : 0))) {
                    n2 = lIlIlllIlIlll[2];
                    0;
                    if (2 == 1) {
                        return ((0x83 ^ 0x9E) & ~(2 ^ 0x1F)) != 0;
                    }
                } else {
                    n2 = lIlIlllIlIlll[0];
                }
                return n2 != 0;
            });
            ++llllllllllllllIllIIllllllIlIIIll;
            0;
            if (((0x9C ^ 0xB3) & ~(0x14 ^ 0x3B)) > -1) continue;
            return ((0x79 ^ 0x6D) & ~(0xA0 ^ 0xB4)) != 0;
        }
        return lIlIlllIlIlll[2];
    }

    private static String llIIIIlIIllIIIl(String llllllllllllllIllIIllllllIIlIIlI, String llllllllllllllIllIIllllllIIIllll) {
        try {
            SecretKeySpec llllllllllllllIllIIllllllIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllllIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllllllIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllllllIIlIlII.init(lIlIlllIlIlll[3], llllllllllllllIllIIllllllIIlIlIl);
            return new String(llllllllllllllIllIIllllllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllllllIIlIIll) {
            llllllllllllllIllIIllllllIIlIIll.printStackTrace();
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

