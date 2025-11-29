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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u_Unknown;

/* TASK: Taking loot -> TakinglootTask */
@TaskDesc(name="Taking loot", priority=10, blocking=true)
public class TakingLootTask
extends u_Unknown {
    private static /* synthetic */ String[] lIlIllIllIIIl;
    private static final /* synthetic */ int aa;
    private static /* synthetic */ int[] lIlIllIllIlIl;

    private static String llIIIIIlIllllIl(String var15, String var16) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIlIllIllIlIl[2], var22);
            return new String(var4.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private boolean e(int n2) {
        boolean bl;
        if (s.llIIIIIllIIllIl(Inventory.getFreeSlots(), n2)) {
            bl = lIlIllIllIlIl[1];
            0;
            if (-1 >= (0x8D ^ 0x89)) {
                return false;
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

    private static String llIIIIIllIIIlII(String var7, String var24) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lIlIllIllIlIl[10]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(lIlIllIllIlIl[2], var8);
            return new String(var23.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
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

    private static String llIIIIIlIllllII(String var6, String var18) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var21 = var18.toCharArray();
        int var25 = lIlIllIllIlIl[0];
        char[] var9 = var6.toCharArray();
        int var17 = var9.length;
        int var12 = lIlIllIllIlIl[0];
        while (s.llIIIIIllIIllll(var12, var17)) {
            char var19 = var9[var12];
            var3.append((char)(var19 ^ var21[var25 % var21.length]));
            0;
            ++var25;
            ++var12;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var3);
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
        Item var2;
        s var1;
        if (s.llIIIIIllIIlIII(this.W.g() ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        List var5 = TileItems.getAll(tileItem -> {
            boolean bl;
            TileItem var13;
            if (!(s.llIIIIIllIIlIlI(tileItem.isTradable() ? 1 : 0) && s.llIIIIIllIIllIl(Prices.getItemPrice((int)tileItem.getId()) * tileItem.getQuantity(), lIlIllIllIlIl[8]) && s.llIIIIIllIIlIII(tileItem.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[9]]) ? 1 : 0) && !s.llIIIIIllIIlIlI(tileItem.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[10]]) ? 1 : 0) || !s.llIIIIIllIIlIlI(Reachable.isInteractable((Locatable)var13) ? 1 : 0))) {
                bl = lIlIllIllIlIl[1];
                0;
                if ((0x9E ^ 0x9A) > (0xC6 ^ 0xC2)) {
                    return false;
                }
            } else {
                bl = lIlIllIllIlIl[0];
            }
            return bl;
        });
        if (s.llIIIIIllIIlIlI(var5.isEmpty() ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        TileItem var14 = var5.stream().max(Comparator.comparingInt(tileItem -> {
            int n2;
            if (s.llIIIIIllIIlIII(tileItem.isTradable() ? 1 : 0)) {
                n2 = lIlIllIllIlIl[7];
                0;
                if (1 > 2) {
                    return (0x9C ^ 0x94) & ~(0x7F ^ 0x77);
                }
            } else {
                TileItem var11;
                n2 = Prices.getItemPrice((int)var11.getId()) * var11.getQuantity();
            }
            return n2;
        })).orElse(null);
        if ((!s.llIIIIIllIIlIII(var14.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[0]]) ? 1 : 0) || s.llIIIIIllIIlIlI(var14.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[1]]) ? 1 : 0)) && s.llIIIIIllIIlIlI(var1.e(lIlIllIllIlIl[2]) ? 1 : 0)) {
            return lIlIllIllIlIl[0];
        }
        if (s.llIIIIIllIIlIlI(var1.e(lIlIllIllIlIl[1]) ? 1 : 0) && s.llIIIIIllIIllII(var2 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[lIlIllIllIlIl[1]];
            stringArray[s.lIlIllIllIlIl[0]] = lIlIllIllIIIl[lIlIllIllIlIl[4]];
            if (s.llIIIIIllIIlIlI(item.hasAction(stringArray) ? 1 : 0) && (!s.llIIIIIllIIlIII(item.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[5]]) ? 1 : 0) || s.llIIIIIllIIlIlI(item.getName().toLowerCase().contains(lIlIllIllIIIl[lIlIllIllIlIl[6]]) ? 1 : 0))) {
                n2 = lIlIllIllIlIl[1];
                0;
                if (-(0x42 ^ 0x46) > 0) {
                    return false;
                }
            } else {
                n2 = lIlIllIllIlIl[0];
            }
            return n2 != 0;
        }))) {
            var2.interact(lIlIllIllIIIl[lIlIllIllIlIl[2]]);
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

