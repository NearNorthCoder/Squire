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

    private static String llIlIIlIlIIIll(String lllllllllllllllIlllIlIIIIllIIIII, String lllllllllllllllIlllIlIIIIlIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIIllIIIlI.init(lIIlllllIlIl[1], lllllllllllllllIlllIlIIIIllIIIll);
            return new String(lllllllllllllllIlllIlIIIIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIIllIIIIl) {
            lllllllllllllllIlllIlIIIIllIIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bh(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static String llIlIIlIlIIIlI(String lllllllllllllllIlllIlIIIIlIIIIll, String lllllllllllllllIlllIlIIIIlIIIIlI) {
        lllllllllllllllIlllIlIIIIlIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIIIlIIIIIl = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIIlIIIIII = lllllllllllllllIlllIlIIIIlIIIIlI.toCharArray();
        int lllllllllllllllIlllIlIIIIIllllll = lIIlllllIlIl[0];
        char[] lllllllllllllllIlllIlIIIIIlllIIl = lllllllllllllllIlllIlIIIIlIIIIll.toCharArray();
        int lllllllllllllllIlllIlIIIIIlllIII = lllllllllllllllIlllIlIIIIIlllIIl.length;
        int lllllllllllllllIlllIlIIIIIllIlll = lIIlllllIlIl[0];
        while (bh.llIlIIlIlIlIII(lllllllllllllllIlllIlIIIIIllIlll, lllllllllllllllIlllIlIIIIIlllIII)) {
            char lllllllllllllllIlllIlIIIIlIIIlII = lllllllllllllllIlllIlIIIIIlllIIl[lllllllllllllllIlllIlIIIIIllIlll];
            lllllllllllllllIlllIlIIIIlIIIIIl.append((char)(lllllllllllllllIlllIlIIIIlIIIlII ^ lllllllllllllllIlllIlIIIIlIIIIII[lllllllllllllllIlllIlIIIIIllllll % lllllllllllllllIlllIlIIIIlIIIIII.length]));
            0;
            ++lllllllllllllllIlllIlIIIIIllllll;
            ++lllllllllllllllIlllIlIIIIIllIlll;
            0;
            if (1 != (67 + 174 - 152 + 87 ^ 35 + 93 - 88 + 140)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIIIIlIIIIIl);
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

    private static String llIlIIlIlIIlII(String lllllllllllllllIlllIlIIIIlIlIIll, String lllllllllllllllIlllIlIIIIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), lIIlllllIlIl[9]), "DES");
            Cipher lllllllllllllllIlllIlIIIIlIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIIIlIlIlIl.init(lIIlllllIlIl[1], lllllllllllllllIlllIlIIIIlIlIllI);
            return new String(lllllllllllllllIlllIlIIIIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIIlIlIlII) {
            lllllllllllllllIlllIlIIIIlIlIlII.printStackTrace();
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
        Item lllllllllllllllIlllIlIIIIllIllIl;
        bh lllllllllllllllIlllIlIIIIlllIllI;
        if (!bh.llIlIIlIlIIlll(this.cp(), this.ee()) || bh.llIlIIlIlIlIII(this.cq(), this.el)) {
            return lIIlllllIlIl[0];
        }
        System.out.println("Inv: " + Bank.Inventory.getAll().size());
        HashSet<Integer> lllllllllllllllIlllIlIIIIlllIlIl = lllllllllllllllIlllIlIIIIlllIllI.el();
        ArrayList<Integer> lllllllllllllllIlllIlIIIIlllIlII = new ArrayList<Integer>();
        lllllllllllllllIlllIlIIIIlllIlII.addAll(lllllllllllllllIlllIlIIIIlllIlIl);
        0;
        int[] lllllllllllllllIlllIlIIIIlllIIll = new int[lllllllllllllllIlllIlIIIIlllIlIl.size()];
        int lllllllllllllllIlllIlIIIIlllIIlI22 = lIIlllllIlIl[0];
        while (bh.llIlIIlIlIlIII(lllllllllllllllIlllIlIIIIlllIIlI22, lllllllllllllllIlllIlIIIIlllIIll.length)) {
            lllllllllllllllIlllIlIIIIlllIIll[lllllllllllllllIlllIlIIIIlllIIlI22] = (Integer)lllllllllllllllIlllIlIIIIlllIlII.get(lllllllllllllllIlllIlIIIIlllIIlI22);
            ++lllllllllllllllIlllIlIIIIlllIIlI22;
            0;
            if (((0x1F ^ 0x21 ^ (0xB0 ^ 0xBB)) & (8 + 2 - -102 + 58 ^ 67 + 10 - -42 + 40 ^ -1)) == 0) continue;
            return ((81 + 43 - 59 + 76 ^ 37 + 134 - 125 + 124) & (0xF ^ 0x19 ^ (0x28 ^ 0x19) ^ -1)) != 0;
        }
        List<Item> lllllllllllllllIlllIlIIIIlllIIlI22 = D.bC().c(lllllllllllllllIlllIlIIIIlllIIll);
        List<Item> lllllllllllllllIlllIlIIIIlllIIIl = D.bC().a(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[11]]));
        List<Item> lllllllllllllllIlllIlIIIIlllIIII = D.bC().a(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[10]]));
        if (bh.llIlIIlIlIlIIl(lllllllllllllllIlllIlIIIIlllIIII.isEmpty() ? 1 : 0) && bh.llIlIIlIlIlIIl(Inventory.contains(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[9]])) ? 1 : 0)) {
            lllllllllllllllIlllIlIIIIlllIIlI22.add(lllllllllllllllIlllIlIIIIlllIIII.get(lIIlllllIlIl[0]));
            0;
        }
        int lllllllllllllllIlllIlIIIIllIllll = lIIlllllIlIl[1] - Inventory.getCount(item -> item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[8]]));
        Object lllllllllllllllIlllIlIIIIllIlllI = lllllllllllllllIlllIlIIIIlllIIIl.iterator();
        while (bh.llIlIIlIlIlIlI(lllllllllllllllIlllIlIIIIllIlllI.hasNext() ? 1 : 0)) {
            lllllllllllllllIlllIlIIIIllIllIl = lllllllllllllllIlllIlIIIIllIlllI.next();
            if (bh.llIlIIlIlIlIll(lllllllllllllllIlllIlIIIIllIllll)) {
                0;
                if (((0x69 ^ 0x3B) & ~(0xCE ^ 0x9C)) <= 0) break;
                return ((0xB0 ^ 0xBF) & ~(0xC ^ 3)) != 0;
            }
            if (bh.llIlIIlIlIllII(lllllllllllllllIlllIlIIIIllIllIl)) {
                0;
                if (3 > ((0x7E ^ 0x20 ^ (0x4F ^ 0x58)) & (67 + 52 - -5 + 15 ^ 44 + 9 - -99 + 42 ^ -1))) continue;
                return ((129 + 223 - 121 + 22 ^ 52 + 13 - -123 + 9) & (0x4B ^ 0x35 ^ (0x58 ^ 0x1E) ^ -1)) != 0;
            }
            lllllllllllllllIlllIlIIIIlllIIlI22.add(lllllllllllllllIlllIlIIIIllIllIl);
            0;
            lllllllllllllllIlllIlIIIIllIllll -= lllllllllllllllIlllIlIIIIllIllIl.getQuantity();
            0;
            if (((0x34 ^ 0x11) & ~(0x1E ^ 0x3B)) < 1) continue;
            return (3 & ~3) != 0;
        }
        if (bh.llIlIIlIlIlIlI(lllllllllllllllIlllIlIIIIlllIIlI22.isEmpty() ? 1 : 0)) {
            if (bh.llIlIIlIlIlIlI(Movement.getDestination().equals((Object)lllllllllllllllIlllIlIIIIlllIllI.al.bs) ? 1 : 0)) {
                return lIIlllllIlIl[0];
            }
            System.out.println(lIIlllllIlII[lIIlllllIlIl[0]]);
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIlIIIIlllIllI.al.bs);
            return lIIlllllIlIl[2];
        }
        if (bh.llIlIIlIlIlIlI(D.bJ() ? 1 : 0)) {
            if (bh.llIlIIlIlIlIlI(Inventory.isFull() ? 1 : 0) && bh.llIlIIlIlIlIlI(D.bC().e(lllllllllllllllIlllIlIIIIlllIIll) ? 1 : 0)) {
                return lIIlllllIlIl[2];
            }
            lllllllllllllllIlllIlIIIIllIlllI = lllllllllllllllIlllIlIIIIlllIIlI22.iterator();
            while (bh.llIlIIlIlIlIlI(lllllllllllllllIlllIlIIIIllIlllI.hasNext() ? 1 : 0)) {
                lllllllllllllllIlllIlIIIIllIllIl = (Item)lllllllllllllllIlllIlIIIIllIlllI.next();
                if (bh.llIlIIlIlIllII(lllllllllllllllIlllIlIIIIllIllIl)) {
                    0;
                    if (1 >= 0) continue;
                    return ((0xD2 ^ 0x81) & ~(0x43 ^ 0x10)) != 0;
                }
                Widget lllllllllllllllIlllIlIIIIllIllII = Widgets.get((int)lIIlllllIlIl[3], (int)lIIlllllIlIl[4], (int)lllllllllllllllIlllIlIIIIllIllIl.getSlot());
                if (bh.llIlIIlIlIllII(lllllllllllllllIlllIlIIIIllIllII)) {
                    System.out.println(lIIlllllIlII[lIIlllllIlIl[2]]);
                }
                lllllllllllllllIlllIlIIIIllIllII.interact(lIIlllllIlII[lIIlllllIlIl[1]]);
                0;
                if ((0xB9 ^ 0xB0 ^ (0x8A ^ 0x87)) > 2) continue;
                return ((0x2C ^ 0x17 ^ (0x79 ^ 0x51)) & (9 ^ 0x25 ^ (6 ^ 0x39) ^ -1)) != 0;
            }
            return lIIlllllIlIl[2];
        }
        lllllllllllllllIlllIlIIIIllIlllI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bh.llIlIIlIlIlIlI(tileObject.getName().toLowerCase().contains(lIIlllllIlII[lIIlllllIlIl[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllllIlIl[2]];
                stringArray[bh.lIIlllllIlIl[0]] = lIIlllllIlII[lIIlllllIlIl[4]];
                if (bh.llIlIIlIlIlIlI(tileObject.hasAction(stringArray) ? 1 : 0) && bh.llIlIIlIlIlIlI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIIlllllIlIl[2];
                    0;
                    if (((0xA1 ^ 0x91) & ~(0x86 ^ 0xB6)) == 0) return n2 != 0;
                    return ((0x3B ^ 0x37) & ~(0x70 ^ 0x7C)) != 0;
                }
            }
            n2 = lIIlllllIlIl[0];
            return n2 != 0;
        });
        if (bh.llIlIIlIlIllII(lllllllllllllllIlllIlIIIIllIlllI)) {
            System.out.println(lIIlllllIlII[lIIlllllIlIl[5]]);
            return lIIlllllIlIl[0];
        }
        var8_9.interact(lIIlllllIlII[lIIlllllIlIl[6]]);
        return lIIlllllIlIl[2];
    }
}

