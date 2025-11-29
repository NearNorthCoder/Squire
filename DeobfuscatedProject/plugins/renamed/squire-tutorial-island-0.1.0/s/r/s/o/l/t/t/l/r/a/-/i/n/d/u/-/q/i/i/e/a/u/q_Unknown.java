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

public class q_Unknown
implements o {
    private static /* synthetic */ String[] lIlIIIlllIlll;
    private static /* synthetic */ int[] lIlIIIllllIII;

    private static boolean lIlllIIIlIlIIII(int n2) {
        return n2 != 0;
    }

    private static String lIlllIIIlIIllII(String var12, String var1) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIlIIIllllIII[6]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIlIIIllllIII[4], var4);
            return new String(var9.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static String lIlllIIIlIIllIl(String var14, String var2) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIlIIIllllIII[4], var3);
            return new String(var8.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
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

    private static String lIlllIIIlIIlIll(String var7, String var19) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var6 = var19.toCharArray();
        int var16 = lIlIIIllllIII[1];
        char[] var18 = var7.toCharArray();
        int var15 = var18.length;
        int var17 = lIlIIIllllIII[1];
        while (q.lIlllIIIlIlIIll(var17, var15)) {
            char var5 = var18[var17];
            var10.append((char)(var5 ^ var6[var16 % var6.length]));
            0;
            ++var16;
            ++var17;
            0;
            if (-(9 + 57 - 51 + 114 ^ 1 + 56 - -34 + 42) < 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void lIlllIIIlIIlllI() {
        lIlIIIlllIlll = new String[lIlIIIllllIII[5]];
        q.lIlIIIlllIlll[q.lIlIIIllllIII[1]] = q."Fire";
        q.lIlIIIlllIlll[q.lIlIIIllllIII[0]] = q."Raw shrimps";
        q.lIlIIIlllIlll[q.lIlIIIllllIII[4]] = q."Fire";
    }
}

