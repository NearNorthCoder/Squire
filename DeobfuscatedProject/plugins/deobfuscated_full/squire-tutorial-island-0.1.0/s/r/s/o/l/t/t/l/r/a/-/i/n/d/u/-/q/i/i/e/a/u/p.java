/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class p
implements o {
    private static /* synthetic */ int[] lIlIIIlIlIIll;
    private static /* synthetic */ String[] lIlIIIlIlIIlI;
    private static /* synthetic */ int ah;

    private static boolean lIlllIIIIIIIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIIIIIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        p.lIllIllllllllIl();
        p.lIllIllllllllII();
    }

    private static String lIllIlllllllIlI(String var1, String var4) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIIIlIlIIll[5], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean D() {
        block7: {
            block6: {
                int[] nArray = new int[lIlIIIlIlIIll[0]];
                nArray[p.lIlIIIlIlIIll[1]] = lIlIIIlIlIIll[2];
                if (!p.lIllIlllllllllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                String[] stringArray = new String[lIlIIIlIlIIll[0]];
                stringArray[p.lIlIIIlIlIIll[1]] = lIlIIIlIlIIlI[lIlIIIlIlIIll[1]];
                if (!p.lIllIllllllllll(TileObjects.getNearest((String[])stringArray))) break block7;
            }
            return lIlIIIlIlIIll[1];
        }
        if (p.lIlllIIIIIIIIII(Players.getLocal().getAnimation(), lIlIIIlIlIIll[3])) {
            return lIlIIIlIlIIll[1];
        }
        if (p.lIlllIIIIIIIIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIIlIlIIll[1];
        }
        if (p.lIlllIIIIIIIIlI(ah, lIlIIIlIlIIll[0])) {
            ah -= lIlIIIlIlIIll[0];
            return lIlIIIlIlIIll[1];
        }
        int[] nArray = new int[lIlIIIlIlIIll[0]];
        nArray[p.lIlIIIlIlIIll[1]] = lIlIIIlIlIIll[2];
        String[] stringArray = new String[lIlIIIlIlIIll[0]];
        stringArray[p.lIlIIIlIlIIll[1]] = lIlIIIlIlIIlI[lIlIIIlIlIIll[0]];
        Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray));
        ah = M.a(lIlIIIlIlIIll[0], lIlIIIlIlIIll[4]);
        return lIlIIIlIlIIll[0];
    }

    private static void lIllIllllllllII() {
        lIlIIIlIlIIlI = new String[lIlIIIlIlIIll[5]];
        p.lIlIIIlIlIIlI[p.lIlIIIlIlIIll[1]] = p."Range";
        p.lIlIIIlIlIIlI[p.lIlIIIlIlIIll[0]] = p."Range";
    }

    private static boolean lIllIlllllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllllllllll(Object object) {
        return object == null;
    }

    private static void lIllIllllllllIl() {
        lIlIIIlIlIIll = new int[6];
        p.lIlIIIlIlIIll[0] = 1;
        p.lIlIIIlIlIIll[1] = (0xF1 ^ 0x9F ^ (0xE3 ^ 0xB8)) & (0x6D ^ 0x47 ^ (0x8D ^ 0x92) ^ -1);
        p.lIlIIIlIlIIll[2] = 0xFFFFEB13 & 0x1DEF;
        p.lIlIIIlIlIIll[3] = -1;
        p.lIlIIIlIlIIll[4] = 0x9A ^ 0x9E;
        p.lIlIIIlIlIIll[5] = 2;
    }

    private static boolean lIlllIIIIIIIIII(int n2, int n3) {
        return n2 != n3;
    }
}

