/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.e;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Filling rune pouches", priority=20, blocking=true)
public class B
extends h {
    private static /* synthetic */ int[] llIIllllIlll;
    private static /* synthetic */ String[] llIIllllIlIl;

    private static boolean llllllllIllllI(int n2) {
        return n2 <= 0;
    }

    private static String llllllllIIlllI(String lllllllllllllllIlIIlIllIIlIlIIll, String lllllllllllllllIlIIlIllIIlIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIlIlIlII.getBytes(StandardCharsets.UTF_8)), llIIllllIlll[8]), "DES");
            Cipher lllllllllllllllIlIIlIllIIlIlIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIllIIlIlIlll.init(llIIllllIlll[0], lllllllllllllllIlIIlIllIIlIllIII);
            return new String(lllllllllllllllIlIIlIllIIlIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllIIlIlIllI) {
            lllllllllllllllIlIIlIllIIlIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIllIIl(int n2) {
        return n2 != 0;
    }

    private static void llllllllIlIIII() {
        llIIllllIlIl = new String[llIIllllIlll[0]];
        B.llIIllllIlIl[B.llIIllllIlll[1]] = B."Fill";
        B.llIIllllIlIl[B.llIIllllIlll[2]] = B."pouch";
    }

    private static boolean llllllllIllIlI(Object object) {
        return object == null;
    }

    private static boolean llllllllIllIII(int n2) {
        return n2 == 0;
    }

    static {
        B.llllllllIlIlll();
        B.llllllllIlIIII();
    }

    @Inject
    public B(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllllIlll[0]];
        cArray[B.llIIllllIlll[1]] = c.ACTIVE;
        cArray[B.llIIllllIlll[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static String llllllllIIllll(String lllllllllllllllIlIIlIllIIllIIIII, String lllllllllllllllIlIIlIllIIllIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllIIllIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllIIllIIlII.init(llIIllllIlll[0], lllllllllllllllIlIIlIllIIllIIlIl);
            return new String(lllllllllllllllIlIIlIllIIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllIIllIIIll) {
            lllllllllllllllIlIIlIllIIllIIIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        block15: {
            block14: {
                if (B.llllllllIllIII(this.aV.g() ? 1 : 0)) {
                    return llIIllllIlll[1];
                }
                if (!B.llllllllIllIIl(Inventory.isFull() ? 1 : 0)) break block14;
                int[] nArray = new int[llIIllllIlll[2]];
                nArray[B.llIIllllIlll[1]] = llIIllllIlll[3];
                if (!B.llllllllIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block15;
            }
            return llIIllllIlll[1];
        }
        int lllllllllllllllIlIIlIllIIlllIIII = llIIllllIlll[1];
        int[] nArray = new int[llIIllllIlll[2]];
        nArray[B.llIIllllIlll[1]] = llIIllllIlll[3];
        int lllllllllllllllIlIIlIllIIllIllll = Inventory.getCount((int[])nArray);
        int lllllllllllllllIlIIlIllIIllIlllI = llIIllllIlll[0];
        Iterator lllllllllllllllIlIIlIllIIllIllIl = Inventory.getAll(item -> item.getName().endsWith(llIIllllIlIl[llIIllllIlll[2]])).iterator();
        while (B.llllllllIllIIl(lllllllllllllllIlIIlIllIIllIllIl.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIlIIlIllIIllIllII = (Item)lllllllllllllllIlIIlIllIIllIllIl.next();
            if (B.llllllllIllIII(lllllllllllllllIlIIlIllIIllIlllI)) {
                0;
                if ((0x23 ^ 0x27) != 1) break;
                return ((0x3E ^ 0x22) & ~(0x11 ^ 0xD)) != 0;
            }
            e lllllllllllllllIlIIlIllIIllIlIll = e.c(lllllllllllllllIlIIlIllIIllIllII.getId());
            if (B.llllllllIllIlI((Object)lllllllllllllllIlIIlIllIIllIlIll)) {
                0;
                if (((0xA4 ^ 0xC6) & ~(0x7F ^ 0x1D)) == ((0x21 ^ 0x7E) & ~(0xEA ^ 0xB5))) continue;
                return ((0x84 ^ 0xB9) & ~(0x4D ^ 0x70)) != 0;
            }
            if (!B.llllllllIllIll(lllllllllllllllIlIIlIllIIllIllII.getId(), llIIllllIlll[4]) || !B.llllllllIllIll(lllllllllllllllIlIIlIllIIllIllII.getId(), llIIllllIlll[5]) || !B.llllllllIllIll(lllllllllllllllIlIIlIllIIllIllII.getId(), llIIllllIlll[6]) || B.llllllllIlllII(lllllllllllllllIlIIlIllIIllIllII.getId(), llIIllllIlll[7])) {
                lllllllllllllllIlIIlIllIIllIlIll.a(llIIllllIlll[2]);
                0;
                if (-1 >= ((0xF3 ^ 0xB0) & ~(0xF1 ^ 0xB2))) {
                    return ((0x96 ^ 0xAE) & ~(0xA2 ^ 0x9A)) != 0;
                }
            } else {
                lllllllllllllllIlIIlIllIIllIlIll.a(llIIllllIlll[1]);
            }
            if (B.llllllllIlllIl(lllllllllllllllIlIIlIllIIllIlIll.ae(), lllllllllllllllIlIIlIllIIllIlIll.ac())) {
                int lllllllllllllllIlIIlIllIIllIlIlI = Math.min(lllllllllllllllIlIIlIllIIllIllll, lllllllllllllllIlIIlIllIIllIlIll.ac() - lllllllllllllllIlIIlIllIIllIlIll.ae());
                if (B.llllllllIllllI(lllllllllllllllIlIIlIllIIllIlIlI)) {
                    0;
                    if (null == null) break;
                    return ((0xC ^ 4) & ~(0x5D ^ 0x55)) != 0;
                }
                lllllllllllllllIlIIlIllIIllIlIll.d(lllllllllllllllIlIIlIllIIllIlIlI);
                lllllllllllllllIlIIlIllIIllIllII.interact(llIIllllIlIl[llIIllllIlll[1]]);
                lllllllllllllllIlIIlIllIIlllIIII = llIIllllIlll[2];
                --lllllllllllllllIlIIlIllIIllIlllI;
                lllllllllllllllIlIIlIllIIllIllll -= lllllllllllllllIlIIlIllIIllIlIlI;
            }
            0;
            if (null == null) continue;
            return ((0x46 ^ 0x36 ^ (0x52 ^ 0x63)) & (0x2A ^ 0x3F ^ (0x6C ^ 0x38) ^ -1)) != 0;
        }
        if (B.llllllllIllIIl(lllllllllllllllIlIIlIllIIlllIIII)) {
            B lllllllllllllllIlIIlIllIIlllIIIl;
            lllllllllllllllIlIIlIllIIlllIIIl.aV.n();
        }
        return (boolean)var1_1;
    }

    private static void llllllllIlIlll() {
        llIIllllIlll = new int[9];
        B.llIIllllIlll[0] = 2;
        B.llIIllllIlll[1] = (0x41 ^ 0x17) & ~(0xDF ^ 0x89);
        B.llIIllllIlll[2] = 1;
        B.llIIllllIlll[3] = -(0xFFFFCF6F & 0x3691) & (0xFFFFEEFF & Short.MAX_VALUE);
        B.llIIllllIlll[4] = 0xFFFFDD97 & 0x37EF;
        B.llIIllllIlll[5] = 0xFFFFFFAD & 0x15DB;
        B.llIIllllIlll[6] = -(0xFFFFDD55 & 0x6AFB) & (0xFFFFFDDF & 0x5FFB);
        B.llIIllllIlll[7] = 0xFFFFECFF & 0x7BA2;
        B.llIIllllIlll[8] = 0xA7 ^ 0xAF;
    }

    @Override
    protected boolean aj() {
        return llIIllllIlll[2];
    }

    private static boolean llllllllIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllllIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIllIll(int n2, int n3) {
        return n2 != n3;
    }
}

