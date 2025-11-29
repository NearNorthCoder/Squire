/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.unethicalite.api.input.Keyboard
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import com.google.inject.Inject;
import gg.squire.quest.SquireTutorialIsland;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.input.Keyboard;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M_Unknown;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class G_Unknown
implements o {
    private static /* synthetic */ int aC;
    private static /* synthetic */ String[] lIlIIIllIIllI;
    private final /* synthetic */ SquireTutorialIsland aD;
    private static /* synthetic */ int[] lIlIIIllIIlll;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean D() {
        String string = this.aD.c();
        String string2 = M.b(lIlIIIllIIlll[0], lIlIIIllIIlll[1]).replace(lIlIIIllIIllI[lIlIIIllIIlll[2]], lIlIIIllIIllI[lIlIIIllIIlll[3]]);
        String string3 = M.b(lIlIIIllIIlll[0], lIlIIIllIIlll[4]);
        if (G.lIlllIIIIlIIIll(string2.length(), string.length())) {
            char c2 = string.charAt(aC);
            Keyboard.type((String)String.valueOf(c2));
            aC += lIlIIIllIIlll[3];
            0;
            if (2 == 3) {
                return false;
            }
        } else {
            void var21;
            void var22;
            aC = lIlIIIllIIlll[2];
            if (G.lIlllIIIIlIIlII(var22.equals(var21) ? 1 : 0)) {
                void var12;
                if (G.lIlllIIIIlIIlII(var12.equals(lIlIIIllIIllI[lIlIIIllIIlll[5]]) ? 1 : 0)) {
                    M.a(lIlIIIllIIlll[0], lIlIIIllIIlll[6], lIlIIIllIIllI[lIlIIIllIIlll[7]]);
                    0;
                    return lIlIIIllIIlll[3];
                }
                if (G.lIlllIIIIlIIlII(var12.contains(lIlIIIllIIllI[lIlIIIllIIlll[8]]) ? 1 : 0)) {
                    M.a(lIlIIIllIIlll[0], lIlIIIllIIlll[9], lIlIIIllIIllI[lIlIIIllIIlll[10]]);
                    0;
                    return lIlIIIllIIlll[3];
                }
            }
        }
        return lIlIIIllIIlll[3];
    }

    @Inject
    public G(SquireTutorialIsland squireTutorialIsland) {
        this.aD = squireTutorialIsland;
    }

    private static boolean lIlllIIIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static String lIlllIIIIIlllll(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var7 = var15.toCharArray();
        int var5 = lIlIIIllIIlll[2];
        char[] var17 = var14.toCharArray();
        int var19 = var17.length;
        int var6 = lIlIIIllIIlll[2];
        while (G.lIlllIIIIlIIIll(var6, var19)) {
            char var16 = var17[var6];
            var3.append((char)(var16 ^ var7[var5 % var7.length]));
            0;
            ++var5;
            ++var6;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static String lIlllIIIIIllllI(String var8, String var18) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIlIIIllIIlll[12]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIlIIIllIIlll[5], var11);
            return new String(var4.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllIIIIlIIIIl() {
        lIlIIIllIIllI = new String[lIlIIIllIIlll[11]];
        G.lIlIIIllIIllI[G.lIlIIIllIIlll[2]] = G."*";
        G.lIlIIIllIIllI[G.lIlIIIllIIlll[3]] = G."";
        G.lIlIIIllIIllI[G.lIlIIIllIIlll[5]] = G."Please look up a name to see whether it is available.";
        G.lIlIIIllIIllI[G.lIlIIIllIIlll[7]] = G."Look up name";
        G.lIlIIIllIIllI[G.lIlIIIllIIlll[8]] = G."Great!";
        G.lIlIIIllIIllI[G.lIlIIIllIIlll[10]] = G."Set name";
    }

    static {
        G.lIlllIIIIlIIIlI();
        G.lIlllIIIIlIIIIl();
        aC = lIlIIIllIIlll[2];
    }

    private static void lIlllIIIIlIIIlI() {
        lIlIIIllIIlll = new int[13];
        G.lIlIIIllIIlll[0] = 0xFFFFEBBF & 0x166E;
        G.lIlIIIllIIlll[1] = 0x25 ^ 0x29;
        G.lIlIIIllIIlll[2] = (0xFB ^ 0xA4 ^ (0x53 ^ 0x3C)) & (0x5E ^ 5 ^ (0xDD ^ 0xB6) ^ -1);
        G.lIlIIIllIIlll[3] = 1;
        G.lIlIIIllIIlll[4] = 0x3E ^ 0x33;
        G.lIlIIIllIIlll[5] = 2;
        G.lIlIIIllIIlll[6] = 0x46 ^ 0x54;
        G.lIlIIIllIIlll[7] = 3;
        G.lIlIIIllIIlll[8] = 142 + 69 - 164 + 152 ^ 157 + 119 - 266 + 185;
        G.lIlIIIllIIlll[9] = 0x99 ^ 0x8A;
        G.lIlIIIllIIlll[10] = 0x50 ^ 0x55;
        G.lIlIIIllIIlll[11] = 6 + 141 - -15 + 6 ^ 150 + 161 - 177 + 40;
        G.lIlIIIllIIlll[12] = 72 + 21 - -52 + 6 ^ 18 + 120 - -6 + 15;
    }

    private static String lIlllIIIIlIIIII(String var10, String var2) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIlIIIllIIlll[5], var20);
            return new String(var13.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }
}

