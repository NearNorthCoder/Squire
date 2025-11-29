/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class q
implements o {
    private static /* synthetic */ String[] lIlIIIlllIlll;
    private static /* synthetic */ int[] lIlIIIllllIII;

    private static boolean lIlllIIIlIlIIII(int n2) {
        return n2 != 0;
    }

    private static String lIlllIIIlIIllII(String llllllllllllllIlllIIIIlllIllIllI, String llllllllllllllIlllIIIIlllIllIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlllIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlllIllIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIIllllIII[6]), "DES");
            Cipher llllllllllllllIlllIIIIlllIlllIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIIIIlllIlllIlI.init(lIlIIIllllIII[4], llllllllllllllIlllIIIIlllIlllIll);
            return new String(llllllllllllllIlllIIIIlllIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIlllIlllIIl) {
            llllllllllllllIlllIIIIlllIlllIIl.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIlIIllIl(String llllllllllllllIlllIIIIlllIlIlIIl, String llllllllllllllIlllIIIIlllIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIIIlllIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIIlllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIIlllIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIIlllIlIllIl.init(lIlIIIllllIII[4], llllllllllllllIlllIIIIlllIlIlllI);
            return new String(llllllllllllllIlllIIIIlllIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIIlllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIIlllIlIllII) {
            llllllllllllllIlllIIIIlllIlIllII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean D() {
        block5: {
            block4: {
                int[] nArray = new int[lIlIIIllllIII[0]];
                nArray[q.lIlIIIllllIII[1]] = lIlIIIllllIII[2];
                if (!q.lIlllIIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                String[] stringArray = new String[lIlIIIllllIII[0]];
                stringArray[q.lIlIIIllllIII[1]] = lIlIIIlllIlll[lIlIIIllllIII[1]];
                if (!q.lIlllIIIlIlIIIl(TileObjects.getNearest((String[])stringArray))) break block5;
            }
            return lIlIIIllllIII[1];
        }
        if (q.lIlllIIIlIlIIlI(Players.getLocal().getAnimation(), lIlIIIllllIII[3])) {
            return lIlIIIllllIII[1];
        }
        String[] stringArray = new String[lIlIIIllllIII[0]];
        stringArray[q.lIlIIIllllIII[1]] = lIlIIIlllIlll[lIlIIIllllIII[0]];
        String[] stringArray2 = new String[lIlIIIllllIII[0]];
        stringArray2[q.lIlIIIllllIII[1]] = lIlIIIlllIlll[lIlIIIllllIII[4]];
        Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray2));
        return lIlIIIllllIII[0];
    }

    private static void lIlllIIIlIIllll() {
        lIlIIIllllIII = new int[7];
        q.lIlIIIllllIII[0] = 1;
        q.lIlIIIllllIII[1] = (0x75 ^ 0x43 ^ (0xBC ^ 0xA8)) & (0xA3 ^ 0x9B ^ (0xAE ^ 0xB4) ^ -1);
        q.lIlIIIllllIII[2] = 0xFFFFBDD3 & 0x4BFE;
        q.lIlIIIllllIII[3] = -1;
        q.lIlIIIllllIII[4] = 2;
        q.lIlIIIllllIII[5] = 3;
        q.lIlIIIllllIII[6] = 0x60 ^ 0x68;
    }

    private static boolean lIlllIIIlIlIIIl(Object object) {
        return object == null;
    }

    static {
        q.lIlllIIIlIIllll();
        q.lIlllIIIlIIlllI();
    }

    private static boolean lIlllIIIlIlIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlllIIIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllIIIlIIlIll(String llllllllllllllIlllIIIIlllIIllIll, String llllllllllllllIlllIIIIlllIIllIlI) {
        llllllllllllllIlllIIIIlllIIllIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIIlllIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIIlllIIllIIl = new StringBuilder();
        char[] llllllllllllllIlllIIIIlllIIllIII = llllllllllllllIlllIIIIlllIIllIlI.toCharArray();
        int llllllllllllllIlllIIIIlllIIlIlll = lIlIIIllllIII[1];
        char[] llllllllllllllIlllIIIIlllIIlIIIl = llllllllllllllIlllIIIIlllIIllIll.toCharArray();
        int llllllllllllllIlllIIIIlllIIlIIII = llllllllllllllIlllIIIIlllIIlIIIl.length;
        int llllllllllllllIlllIIIIlllIIIllll = lIlIIIllllIII[1];
        while (q.lIlllIIIlIlIIll(llllllllllllllIlllIIIIlllIIIllll, llllllllllllllIlllIIIIlllIIlIIII)) {
            char llllllllllllllIlllIIIIlllIIlllII = llllllllllllllIlllIIIIlllIIlIIIl[llllllllllllllIlllIIIIlllIIIllll];
            llllllllllllllIlllIIIIlllIIllIIl.append((char)(llllllllllllllIlllIIIIlllIIlllII ^ llllllllllllllIlllIIIIlllIIllIII[llllllllllllllIlllIIIIlllIIlIlll % llllllllllllllIlllIIIIlllIIllIII.length]));
            0;
            ++llllllllllllllIlllIIIIlllIIlIlll;
            ++llllllllllllllIlllIIIIlllIIIllll;
            0;
            if (-(9 + 57 - 51 + 114 ^ 1 + 56 - -34 + 42) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIIIlllIIllIIl);
    }

    private static void lIlllIIIlIIlllI() {
        lIlIIIlllIlll = new String[lIlIIIllllIII[5]];
        q.lIlIIIlllIlll[q.lIlIIIllllIII[1]] = q."Fire";
        q.lIlIIIlllIlll[q.lIlIIIllllIII[0]] = q."Raw shrimps";
        q.lIlIIIlllIlll[q.lIlIIIllllIII[4]] = q."Fire";
    }
}

