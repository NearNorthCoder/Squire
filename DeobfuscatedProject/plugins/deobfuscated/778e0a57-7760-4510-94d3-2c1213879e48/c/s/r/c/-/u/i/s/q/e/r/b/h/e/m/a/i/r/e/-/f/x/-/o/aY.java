/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
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
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Prep Deposit inventory", priority=21004, blocking=true)
public class aY
extends bg {
    private static /* synthetic */ String[] lIlIllIlIlII;
    private static /* synthetic */ int[] lIlIllIlIlIl;

    private static boolean lllIIIIIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIIIIIlIIIlI(String lllllllllllllllIllIIlIlIIIllllIl, String lllllllllllllllIllIIlIlIIIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIlIIlIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIlIIIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIlIIIllllll.init(lIlIllIlIlIl[5], lllllllllllllllIllIIlIlIIlIIIIII);
            return new String(lllllllllllllllIllIIlIlIIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIlIIIlllllI) {
            lllllllllllllllIllIIlIlIIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIlIlIIl(Object object) {
        return object == null;
    }

    private static boolean lllIIIIIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        aY.lllIIIIIlIIlIl();
        aY.lllIIIIIlIIlII();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_3;
        void lllllllllllllllIllIIlIlIIlIllllI;
        aY lllllllllllllllIllIIlIlIIlIlllll;
        block10: {
            block9: {
                List<Item> list = D.bC().a(item -> {
                    int n2;
                    if (!aY.lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[7]) || !aY.lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[8]) || aY.lllIIIIIlIllII(item.getId(), lIlIllIlIlIl[9])) {
                        n2 = lIlIllIlIlIl[1];
                        0;
                        if ((0x9A ^ 0x9E) <= 2) {
                            return ((0x30 ^ 0x28) & ~(0x89 ^ 0x91)) != 0;
                        }
                    } else {
                        n2 = lIlIllIlIlIl[0];
                    }
                    return n2 != 0;
                });
                if (aY.lllIIIIIlIIllI(this.cq(), this.el)) {
                    return lIlIllIlIlIl[0];
                }
                if (!aY.lllIIIIIlIIlll(D.bC().bH() ? 1 : 0)) break block9;
                int[] nArray = new int[lIlIllIlIlIl[1]];
                nArray[aY.lIlIllIlIlIl[0]] = lllllllllllllllIllIIlIlIIlIlllll.el().size();
                if (!aY.lllIIIIIlIlIII(Inventory.getCount((int[])nArray), lIlIllIlIlIl[2])) break block10;
            }
            if (aY.lllIIIIIlIIlll(lllllllllllllllIllIIlIlIIlIllllI.isEmpty() ? 1 : 0)) {
                return lIlIllIlIlIl[0];
            }
        }
        if (aY.lllIIIIIlIIlll(D.bJ() ? 1 : 0)) {
            if (aY.lllIIIIIlIIlll(lllllllllllllllIllIIlIlIIlIlllll.dZ() ? 1 : 0)) {
                D.bK();
                0;
                return lIlIllIlIlIl[1];
            }
            Item lllllllllllllllIllIIlIlIIlIlllIl = (Item)lllllllllllllllIllIIlIlIIlIllllI.get(lIlIllIlIlIl[0]);
            Widget lllllllllllllllIllIIlIlIIlIlllII = Widgets.get((int)lIlIllIlIlIl[3], (int)lIlIllIlIlIl[4], (int)lllllllllllllllIllIIlIlIIlIlllIl.getSlot());
            if (aY.lllIIIIIlIlIIl(lllllllllllllllIllIIlIlIIlIlllII)) {
                System.out.println(lIlIllIlIlII[lIlIllIlIlIl[0]]);
            }
            lllllllllllllllIllIIlIlIIlIlllII.interact(lIlIllIlIlII[lIlIllIlIlIl[1]]);
            return lIlIllIlIlIl[1];
        }
        TileObject lllllllllllllllIllIIlIlIIlIlllIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aY.lllIIIIIlIIlll(tileObject.getName().toLowerCase().contains(lIlIllIlIlII[lIlIllIlIlIl[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIlIlIl[1]];
                stringArray[aY.lIlIllIlIlIl[0]] = lIlIllIlIlII[lIlIllIlIlIl[2]];
                if (aY.lllIIIIIlIIlll(tileObject.hasAction(stringArray) ? 1 : 0) && aY.lllIIIIIlIIlll(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIllIlIlIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x66 ^ 6 ^ (0x86 ^ 0xB9)) & (23 + 140 - 0 + 88 ^ 154 + 56 - 91 + 45 ^ -1)) != 0;
                }
            }
            n2 = lIlIllIlIlIl[0];
            return n2 != 0;
        });
        if (aY.lllIIIIIlIlIIl(lllllllllllllllIllIIlIlIIlIlllIl)) {
            System.out.println(lIlIllIlIlII[lIlIllIlIlIl[5]]);
            return lIlIllIlIlIl[0];
        }
        var2_3.interact(lIlIllIlIlII[lIlIllIlIlIl[6]]);
        return lIlIllIlIlIl[1];
    }

    private static boolean lllIIIIIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIIIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static void lllIIIIIlIIlIl() {
        lIlIllIlIlIl = new int[12];
        aY.lIlIllIlIlIl[0] = (0x5A ^ 0x71 ^ (0x4A ^ 0x5C)) & (0x50 ^ 0xF ^ (0x3C ^ 0x5E) ^ -1);
        aY.lIlIllIlIlIl[1] = 1;
        aY.lIlIllIlIlIl[2] = 0x1B ^ 0xD ^ (0x1E ^ 0xD);
        aY.lIlIllIlIlIl[3] = -(0xFFFFBED5 & 0x7B2B) & (0xFFFFFF1F & 0x3BEF);
        aY.lIlIllIlIlIl[4] = 0x3E ^ 0x38;
        aY.lIlIllIlIlIl[5] = 2;
        aY.lIlIllIlIlIl[6] = 3;
        aY.lIlIllIlIlIl[7] = -(0xFFFFBF93 & 0x6E7F) & (0xFFFFFFBF & Short.MAX_VALUE);
        aY.lIlIllIlIlIl[8] = 0xFFFFFBBF & 0x55EF;
        aY.lIlIllIlIlIl[9] = 0xFFFFDBAF & 0x75FE;
        aY.lIlIllIlIlIl[10] = 0x86 ^ 0x82;
        aY.lIlIllIlIlIl[11] = 0x5F ^ 0x79 ^ (0x6D ^ 0x43);
    }

    private List<Item> ea() {
        return D.bC().a(item -> {
            int n2;
            if (!aY.lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[7]) || !aY.lllIIIIIlIlIll(item.getId(), lIlIllIlIlIl[8]) || aY.lllIIIIIlIllII(item.getId(), lIlIllIlIlIl[9])) {
                n2 = lIlIllIlIlIl[1];
                0;
                if (3 <= -1) {
                    return ((0xD ^ 0x2C) & ~(0x80 ^ 0xA1)) != 0;
                }
            } else {
                n2 = lIlIllIlIlIl[0];
            }
            return n2 != 0;
        });
    }

    @Inject
    protected aY(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static void lllIIIIIlIIlII() {
        lIlIllIlIlII = new String[lIlIllIlIlIl[4]];
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[0]] = aY."CANT FIND SUPPLY WIDGET";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[1]] = aY."Withdraw-All";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[5]] = aY."CANT FIND STORAGE";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[6]] = aY."Private";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[10]] = aY."storage";
        aY.lIlIllIlIlII[aY.lIlIllIlIlIl[2]] = aY."Private";
    }

    private static String lllIIIIIlIIIll(String lllllllllllllllIllIIlIlIIlIIlIII, String lllllllllllllllIllIIlIlIIlIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIlIIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIIlIIIlll.getBytes(StandardCharsets.UTF_8)), lIlIllIlIlIl[11]), "DES");
            Cipher lllllllllllllllIllIIlIlIIlIIllII = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIlIIlIIllII.init(lIlIllIlIlIl[5], lllllllllllllllIllIIlIlIIlIIllIl);
            return new String(lllllllllllllllIllIIlIlIIlIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIlIIlIIlIll) {
            lllllllllllllllIllIIlIlIIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIlIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean dZ() {
        int n2;
        block3: {
            block2: {
                if (!aY.lllIIIIIlIlIlI(this.ea().isEmpty() ? 1 : 0)) break block2;
                int[] nArray = new int[lIlIllIlIlIl[1]];
                nArray[aY.lIlIllIlIlIl[0]] = this.el().size();
                if (!aY.lllIIIIIlIlIII(Inventory.getCount((int[])nArray), lIlIllIlIlIl[2])) break block3;
            }
            n2 = lIlIllIlIlIl[1];
            0;
            if (1 >= -1) return n2 != 0;
            return ((0x44 ^ 0x54) & ~(0x7C ^ 0x6C)) != 0;
        }
        n2 = lIlIllIlIlIl[0];
        return n2 != 0;
    }

    private static boolean lllIIIIIlIllII(int n2, int n3) {
        return n2 == n3;
    }
}

