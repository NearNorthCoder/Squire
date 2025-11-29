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

public class t
implements o {
    private static /* synthetic */ String[] lIlIIlIIIllIl;
    private static /* synthetic */ int ah;
    private static /* synthetic */ int[] lIlIIlIIIlllI;

    private static void lIlllIIlIIIlIIl() {
        lIlIIlIIIllIl = new String[lIlIIlIIIlllI[0]];
        t.lIlIIlIIIllIl[t.lIlIIlIIIlllI[1]] = t.lIlllIIlIIIlIII("EJTHcpmdL+8=", "GTWVF");
    }

    private static String lIlllIIlIIIlIII(String llllllllllllllIlllIIIIlIIIIlIllI, String llllllllllllllIlllIIIIlIIIIlIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlIIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIIlIIIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIIlIIIIllIlI.init(lIlIIlIIIlllI[6], llllllllllllllIlllIIIIlIIIIllIll);
            return new String(llllllllllllllIlllIIIIlIIIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIlIIIIllIIl) {
            llllllllllllllIlllIIIIlIIIIllIIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean D() {
        block7: {
            block6: {
                int[] nArray = new int[lIlIIlIIIlllI[0]];
                nArray[t.lIlIIlIIIlllI[1]] = lIlIIlIIIlllI[2];
                if (!t.lIlllIIlIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[lIlIIlIIIlllI[0]];
                nArray2[t.lIlIIlIIIlllI[1]] = lIlIIlIIIlllI[3];
                if (!t.lIlllIIlIIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block7;
            }
            return lIlIIlIIIlllI[1];
        }
        if (t.lIlllIIlIIIllIl(Players.getLocal().getAnimation(), lIlIIlIIIlllI[4])) {
            return lIlIIlIIIlllI[1];
        }
        if (t.lIlllIIlIIIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlIIIlllI[1];
        }
        if (t.lIlllIIlIIIlllI(ah, lIlIIlIIIlllI[0])) {
            ah -= lIlIIlIIIlllI[0];
            return lIlIIlIIIlllI[1];
        }
        int[] nArray = new int[lIlIIlIIIlllI[0]];
        nArray[t.lIlIIlIIIlllI[1]] = lIlIIlIIIlllI[2];
        String[] stringArray = new String[lIlIIlIIIlllI[0]];
        stringArray[t.lIlIIlIIIlllI[1]] = lIlIIlIIIllIl[lIlIIlIIIlllI[1]];
        Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray));
        ah = M.a(lIlIIlIIIlllI[0], lIlIIlIIIlllI[5]);
        return lIlIIlIIIlllI[0];
    }

    private static boolean lIlllIIlIIIllIl(int n2, int n3) {
        return n2 != n3;
    }

    static {
        t.lIlllIIlIIIlIlI();
        t.lIlllIIlIIIlIIl();
    }

    private static void lIlllIIlIIIlIlI() {
        lIlIIlIIIlllI = new int[7];
        t.lIlIIlIIIlllI[0] = " ".length();
        t.lIlIIlIIIlllI[1] = (3 ^ 0xA) & ~(0x2E ^ 0x27);
        t.lIlIIlIIIlllI[2] = 0xFFFFC7F4 & 0x39BF;
        t.lIlIIlIIIlllI[3] = -(0xFFFFFF32 & 0x76CF) & (0xFFFFF7FF & 0x7FB7);
        t.lIlIIlIIIlllI[4] = -" ".length();
        t.lIlIIlIIIlllI[5] = 0x57 ^ 0x53;
        t.lIlIIlIIIlllI[6] = "  ".length();
    }

    private static boolean lIlllIIlIIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIlIIIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIlIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }
}

