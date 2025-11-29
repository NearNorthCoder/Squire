/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

@TaskDesc(name="Taking loot", priority=10, blocking=true)
public class s
extends u {
    private static /* synthetic */ String[] lIlIllIllIIIl;
    private static final /* synthetic */ int aa;
    private static /* synthetic */ int[] lIlIllIllIlIl;

    private static String llIIIIIlIllllIl(String llllllllllllllIllIlIIIlIIlIlIIlI, String llllllllllllllIllIlIIIlIIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIlIIlIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIlIIlIlIlII.init(lIlIllIllIlIl[2], llllllllllllllIllIlIIIlIIlIlIlIl);
            return new String(llllllllllllllIllIlIIIlIIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIlIIlIlIIll) {
            llllllllllllllIllIlIIIlIIlIlIIll.printStackTrace();
            return null;
        }
    }

    private boolean e(int n2) {
        boolean bl;
        if (s.llIIIIIllIIllIl(Inventory.getFreeSlots(), n2)) {
            bl = lIlIllIllIlIl[1];
            0;
            if (-1 >= (0x8D ^ 0x89)) {
                return ((0x7C ^ 0x48) & ~(0x78 ^ 0x4C)) != 0;
            }
        } else {
            bl = lIlIllIllIlIl[0];
        }
        return bl;
    }

    @Override
    public boolean p() {
        return lIlIllIllIlIl[0];
    }

    private static boolean llIIIIIllIIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIIllIIllII(Object object) {
        return object != null;
    }

    private static String llIIIIIllIIIlII(String llllllllllllllIllIlIIIlIIlIIIlIl, String llllllllllllllIllIlIIIlIIlIIIlII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIIlIIIlII.getBytes(StandardCharsets.UTF_8)), lIlIllIllIlIl[10]), "DES");
            Cipher llllllllllllllIllIlIIIlIIlIIIlll = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIlIIlIIIlll.init(lIlIllIllIlIl[2], llllllllllllllIllIlIIIlIIlIIlIII);
            return new String(llllllllllllllIllIlIIIlIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIlIIlIIIllI) {
            llllllllllllllIllIlIIIlIIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIllIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIllIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIIIllIIIlll() {
        lIlIllIllIlIl = new int[12];
        s.lIlIllIllIlIl[0] = (46 + 18 - 26 + 134 ^ 160 + 14 - 76 + 63) & (0xF ^ 0x20 ^ (0x53 ^ 0x71) ^ -1);
        s.lIlIllIllIlIl[1] = 1;
        s.lIlIllIllIlIl[2] = 2;
        s.lIlIllIllIlIl[3] = 3;
        s.lIlIllIllIlIl[4] = 0x17 ^ 0x13;
        s.lIlIllIllIlIl[5] = 0x72 ^ 0x77;
        s.lIlIllIllIlIl[6] = 0x72 ^ 0x74 ^ (0x1C ^ 0x3C) & ~(0xD ^ 0x2D);
        s.lIlIllIllIlIl[7] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        s.lIlIllIllIlIl[8] = -(0xFFFFE4EE & 0x1F77) & (0xFFFFFFED & 0x17FF);
        s.lIlIllIllIlIl[9] = 0x81 ^ 0x86;
        s.lIlIllIllIlIl[10] = 0x8E ^ 0x86;
        s.lIlIllIllIlIl[11] = 0x70 ^ 2 ^ (0xC ^ 0x77);
    }

    private static String llIIIIIlIllllII(String llllllllllllllIllIlIIIlIIIllIIII, String llllllllllllllIllIlIIIlIIIllIlII) {
        llllllllllllllIllIlIIIlIIIllIIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIlIIIllIIll = new StringBuilder();
        char[] llllllllllllllIllIlIIIlIIIllIIlI = llllllllllllllIllIlIIIlIIIllIlII.toCharArray();
        int llllllllllllllIllIlIIIlIIIllIIIl = lIlIllIllIlIl[0];
        char[] llllllllllllllIllIlIIIlIIIlIlIll = llllllllllllllIllIlIIIlIIIllIIII.toCharArray();
        int llllllllllllllIllIlIIIlIIIlIlIlI = llllllllllllllIllIlIIIlIIIlIlIll.length;
        int llllllllllllllIllIlIIIlIIIlIlIIl = lIlIllIllIlIl[0];
        while (s.llIIIIIllIIllll(llllllllllllllIllIlIIIlIIIlIlIIl, llllllllllllllIllIlIIIlIIIlIlIlI)) {
            char llllllllllllllIllIlIIIlIIIllIllI = llllllllllllllIllIlIIIlIIIlIlIll[llllllllllllllIllIlIIIlIIIlIlIIl];
            llllllllllllllIllIlIIIlIIIllIIll.append((char)(llllllllllllllIllIlIIIlIIIllIllI ^ llllllllllllllIllIlIIIlIIIllIIlI[llllllllllllllIllIlIIIlIIIllIIIl % llllllllllllllIllIlIIIlIIIllIIlI.length]));
            0;
            ++llllllllllllllIllIlIIIlIIIllIIIl;
            ++llllllllllllllIllIlIIIlIIIlIlIIl;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIIlIIIllIIll);
    }

    static {
        s.llIIIIIllIIIlll();
        s.llIIIIIllIIIlIl();
        aa = lIlIllIllIlIl[8];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        void var2_2;
        Item llllllllllllllIllIlIIIlIIllIIIlI;
        s llllllllllllllIllIlIIIlIIllIIlIl;
        if (s.llIIIIIllIIlIII(this.W.g() ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        List llllllllllllllIllIlIIIlIIllIIlII = TileItems.getAll(tileItem -> {
            boolean bl;
            TileItem llllllllllllllIllIlIIIlIIlIllIlI;
            if (!(s.llIIIIIllIIlIlI(tileItem.isTradable() ? 1 : 0) && s.llIIIIIllIIllIl(Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity(), lIlIllIllIlIl[8]) && s.llIIIIIllIIlIII(tileItem.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[9]]) ? 1 : 0) && !s.llIIIIIllIIlIlI(tileItem.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[10]]) ? 1 : 0) || !s.llIIIIIllIIlIlI(Reachable.isInteractable((Locatable)llllllllllllllIllIlIIIlIIlIllIlI) ? 1 : 0))) {
                bl = lIlIllIllIlIl[1];
                0;
                if ((0x9E ^ 0x9A) > (0xC6 ^ 0xC2)) {
                    return ((0x93 ^ 0xBE) & ~(0x9D ^ 0xB0)) != 0;
                }
            } else {
                bl = lIlIllIllIlIl[0];
            }
            return bl;
        });
        if (s.llIIIIIllIIlIlI(llllllllllllllIllIlIIIlIIllIIlII.isEmpty() ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        TileItem llllllllllllllIllIlIIIlIIllIIIll = llllllllllllllIllIlIIIlIIllIIlII.stream().max(Comparator.comparingInt(tileItem -> {
            int n2;
            if (s.llIIIIIllIIlIII(tileItem.isTradable() ? 1 : 0)) {
                n2 = lIlIllIllIlIl[7];
                0;
                if (1 > 2) {
                    return (0x9C ^ 0x94) & ~(0x7F ^ 0x77);
                }
            } else {
                TileItem llllllllllllllIllIlIIIlIIlIlllII;
                n2 = Prices.getItemPrice((int)llllllllllllllIllIlIIIlIIlIlllII.getId()) * llllllllllllllIllIlIIIlIIlIlllII.getQuantity();
            }
            return n2;
        })).orElse(null);
        if ((!s.llIIIIIllIIlIII(llllllllllllllIllIlIIIlIIllIIIll.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[0]]) ? 1 : 0) || s.llIIIIIllIIlIlI(llllllllllllllIllIlIIIlIIllIIIll.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[1]]) ? 1 : 0)) && s.llIIIIIllIIlIlI(llllllllllllllIllIlIIIlIIllIIlIl.e(lIlIllIllIlIl[2]) ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        if (s.llIIIIIllIIlIlI(llllllllllllllIllIlIIIlIIllIIlIl.e(lIlIllIllIlIl[1]) ? 1 : 0) && s.llIIIIIllIIllII(llllllllllllllIllIlIIIlIIllIIIlI = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[lIlIllIllIlIl[1]];
            stringArray[s.lIlIllIllIlIl[0]] = lIlIllIllIIIl[lIlIllIllIlIl[4]];
            if (s.llIIIIIllIIlIlI(item.hasAction(stringArray) ? 1 : 0) && (!s.llIIIIIllIIlIII(item.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[5]]) ? 1 : 0) || s.llIIIIIllIIlIlI(item.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[6]]) ? 1 : 0))) {
                n2 = lIlIllIllIlIl[1];
                0;
                if (-(0x42 ^ 0x46) > 0) {
                    return ((0x14 ^ 0x2C) & ~(0x8F ^ 0xB7)) != 0;
                }
            } else {
                n2 = lIlIllIllIlIl[0];
            }
            return n2 != 0;
        }))) {
            llllllllllllllIllIlIIIlIIllIIIlI.interact(lIlIllIllIIIl[lIlIllIllIlIl[2]]);
        }
        var2_2.interact(lIlIllIllIIIl[lIlIllIllIlIl[3]]);
        return lIlIllIllIlIl[1];
    }

    private static void llIIIIIllIIIlIl() {
        lIlIllIllIIIl = new String[lIlIllIllIlIl[11]];
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[0]] = s."prayer";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[1]] = s."restore";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[2]] = s."Drop";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[3]] = s."Take";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[4]] = s."Drink";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[5]] = s."prayer";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[6]] = s."restore";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[9]] = s."prayer";
        s.lIlIllIllIIIl[s.lIlIllIllIlIl[10]] = s."restore";
    }

    private static boolean llIIIIIllIIlIII(int n2) {
        return n2 == 0;
    }
}

