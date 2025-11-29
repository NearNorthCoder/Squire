/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Widgets
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.D;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Prep Withdraw Olm Gear -> PrepwithdrawolmgearTask */
@TaskDesc(name="Prep Withdraw Olm Gear", priority=20999, blocking=true)
public class bh
extends bg {
    private static /* synthetic */ int[] lIIlllllIlIl;
    private static /* synthetic */ String[] lIIlllllIlII;

    private static boolean llIlIIlIlIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIlIIlIlIIllI() {
        lIIlllllIlIl = new int[13];
        bh.lIIlllllIlIl[0] = (0xF2 ^ 0xAA) & ~(0xDA ^ 0x82);
        bh.lIIlllllIlIl[1] = 2;
        bh.lIIlllllIlIl[2] = 1;
        bh.lIIlllllIlIl[3] = 0xFFFFDB2F & 0x25DF;
        bh.lIIlllllIlIl[4] = 0xE1 ^ 0x89 ^ (8 ^ 0x66);
        bh.lIIlllllIlIl[5] = 3;
        bh.lIIlllllIlIl[6] = 0x5A ^ 0x51 ^ (0x80 ^ 0x8F);
        bh.lIIlllllIlIl[7] = 0xBA ^ 0xBF;
        bh.lIIlllllIlIl[8] = 0xBB ^ 0x92 ^ (0x24 ^ 0xA);
        bh.lIIlllllIlIl[9] = 0xCF ^ 0xC7;
        bh.lIIlllllIlIl[10] = 0x7C ^ 0x75;
        bh.lIIlllllIlIl[11] = 0x4C ^ 0x49 ^ (0x48 ^ 0x47);
        bh.lIIlllllIlIl[12] = 0x98 ^ 0x93;
    }

    private static boolean llIlIIlIlIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIIlIlIIIll(String var11, String var19) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIlllllIlIl[1], var1);
            return new String(var8.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bh(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static String llIlIIlIlIIIlI(String var12, String var7) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var22 = lIIlllllIlIl[0];
        char[] var6 = var12.toCharArray();
        int var29 = var6.length;
        int var16 = lIIlllllIlIl[0];
        while (bh.llIlIIlIlIlIII(var16, var29)) {
            char var5 = var6[var16];
            var18.append((char)(var5 ^ var9[var22 % var9.length]));
            0;
            ++var22;
            ++var16;
            0;
            if (1 != (67 + 174 - 152 + 87 ^ 35 + 93 - 88 + 140)) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean llIlIIlIlIllII(Object object) {
        return object == null;
    }

    private static void llIlIIlIlIIlIl() {
        lIIlllllIlII = new String[lIIlllllIlIl[12]];
        bh.lIIlllllIlII[bh.lIIlllllIlIl[0]] = bh."Finishing prep";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[2]] = bh."CANT FIND SUPPLY WIDGET";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[1]] = bh."Withdraw-All";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[5]] = bh."CANT FIND STORAGE";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[6]] = bh."Private";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[7]] = bh."storage";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[4]] = bh."Private";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[8]] = bh."Stamina";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[9]] = bh."Overload";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[10]] = bh."Overload";
        bh.lIIlllllIlII[bh.lIIlllllIlIl[11]] = bh."Stamina potion";
    }

    private static boolean llIlIIlIlIlIlI(int n2) {
        return n2 != 0;
    }

    private static String llIlIIlIlIIlII(String var20, String var25) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), lIIlllllIlIl[9]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIIlllllIlIl[1], var26);
            return new String(var14.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIlIlIll(int n2) {
        return n2 <= 0;
    }

    static {
        bh.llIlIIlIlIIllI();
        bh.llIlIIlIlIIlIl();
    }

    private static boolean llIlIIlIlIlIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var8_9;
        Item var24;
        bh var2;
        if (!bh.llIlIIlIlIIlll(this.cp(), this.ee()) || bh.llIlIIlIlIlIII(this.cq(), this.el)) {
            return lIIlllllIlIl[0];
        }
        System.out.println("Inv: " + Bank.Inventory.getAll().size());
        HashSet<Integer> var17 = var2.el();
        ArrayList<Integer> var23 = new ArrayList<Integer>();
        var23.addAll(var17);
        0;
        int[] var4 = new int[var17.size()];
        int lllllllllllllllIlllIlIIIIlllIIlI22 = lIIlllllIlIl[0];
        while (bh.llIlIIlIlIlIII(lllllllllllllllIlllIlIIIIlllIIlI22, var4.length)) {
            var4[lllllllllllllllIlllIlIIIIlllIIlI22] = (Integer)var23.get(lllllllllllllllIlllIlIIIIlllIIlI22);
            ++lllllllllllllllIlllIlIIIIlllIIlI22;
            0;
            if (((0x1F ^ 0x21 ^ (0xB0 ^ 0xBB)) & (8 + 2 - -102 + 58 ^ 67 + 10 - -42 + 40 ^ -1)) == 0) continue;
            return ((81 + 43 - 59 + 76 ^ 37 + 134 - 125 + 124) & (0xF ^ 0x19 ^ (0x28 ^ 0x19) ^ -1)) != 0;
        }
        List<Item> lllllllllllllllIlllIlIIIIlllIIlI22 = D.bC().c(var4);
        List<Item> var21 = D.bC().a(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[11]]));
        List<Item> var13 = D.bC().a(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[10]]));
        if (bh.llIlIIlIlIlIIl(var13.isEmpty() ? 1 : 0) && bh.llIlIIlIlIlIIl(Inventory.contains(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[9]])) ? 1 : 0)) {
            lllllllllllllllIlllIlIIIIlllIIlI22.add(var13.get(lIIlllllIlIl[0]));
            0;
        }
        int var3 = lIIlllllIlIl[1] - Inventory.getCount(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[8]]));
        Object var28 = var21.iterator();
        while (bh.llIlIIlIlIlIlI(var28.hasNext() ? 1 : 0)) {
            var24 = var28.next();
            if (bh.llIlIIlIlIlIll(var3)) {
                0;
                if (((0x69 ^ 0x3B) & ~(0xCE ^ 0x9C)) <= 0) break;
                return false;
            }
            if (bh.llIlIIlIlIllII(var24)) {
                0;
                if (3 > ((0x7E ^ 0x20 ^ (0x4F ^ 0x58)) & (67 + 52 - -5 + 15 ^ 44 + 9 - -99 + 42 ^ -1))) continue;
                return ((129 + 223 - 121 + 22 ^ 52 + 13 - -123 + 9) & (0x4B ^ 0x35 ^ (0x58 ^ 0x1E) ^ -1)) != 0;
            }
            lllllllllllllllIlllIlIIIIlllIIlI22.add(var24);
            0;
            var3 -= var24.getQuantity();
            0;
            if (((0x34 ^ 0x11) & ~(0x1E ^ 0x3B)) < 1) continue;
            return (3 & ~3) != 0;
        }
        if (bh.llIlIIlIlIlIlI(lllllllllllllllIlllIlIIIIlllIIlI22.isEmpty() ? 1 : 0)) {
            if (bh.llIlIIlIlIlIlI(Movement.getDestination().equals((Object)var2.al.bs) ? 1 : 0)) {
                return lIIlllllIlIl[0];
            }
            System.out.println(lIIlllllIlII[lIIlllllIlIl[0]]);
            Movement.setDestination((WorldPoint)var2.al.bs);
            return lIIlllllIlIl[2];
        }
        if (bh.llIlIIlIlIlIlI(D.bJ() ? 1 : 0)) {
            if (bh.llIlIIlIlIlIlI(Inventory.isFull() ? 1 : 0) && bh.llIlIIlIlIlIlI(D.bC().e(var4) ? 1 : 0)) {
                return lIIlllllIlIl[2];
            }
            var28 = lllllllllllllllIlllIlIIIIlllIIlI22.iterator();
            while (bh.llIlIIlIlIlIlI(var28.hasNext() ? 1 : 0)) {
                var24 = (Item)var28.next();
                if (bh.llIlIIlIlIllII(var24)) {
                    0;
                    if (1 >= 0) continue;
                    return false;
                }
                Widget var15 = Widgets.get((int)lIIlllllIlIl[3], (int)lIIlllllIlIl[4], (int)var24.getSlot());
                if (bh.llIlIIlIlIllII(var15)) {
                    System.out.println(lIIlllllIlII[lIIlllllIlIl[2]]);
                }
                var15.interact(lIIlllllIlII[lIIlllllIlIl[1]]);
                0;
                if ((0xB9 ^ 0xB0 ^ (0x8A ^ 0x87)) > 2) continue;
                return ((0x2C ^ 0x17 ^ (0x79 ^ 0x51)) & (9 ^ 0x25 ^ (6 ^ 0x39) ^ -1)) != 0;
            }
            return lIIlllllIlIl[2];
        }
        var28 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bh.llIlIIlIlIlIlI(tileObject.getName().toLowerCase().contains(lIIlllllIlII[lIIlllllIlIl[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllllIlIl[2]];
                stringArray[bh.lIIlllllIlIl[0]] = lIIlllllIlII[lIIlllllIlIl[4]];
                if (bh.llIlIIlIlIlIlI(tileObject.hasAction(stringArray) ? 1 : 0) && bh.llIlIIlIlIlIlI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIIlllllIlIl[2];
                    0;
                    if (((0xA1 ^ 0x91) & ~(0x86 ^ 0xB6)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlllllIlIl[0];
            return n2 != 0;
        });
        if (bh.llIlIIlIlIllII(var28)) {
            System.out.println(lIIlllllIlII[lIIlllllIlIl[5]]);
            return lIIlllllIlIl[0];
        }
        var8_9.interact(lIIlllllIlII[lIIlllllIlIl[6]]);
        return lIIlllllIlIl[2];
    }
}

