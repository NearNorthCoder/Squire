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
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class G
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
                return ((0x5D ^ 3) & ~(0x2D ^ 0x73)) != 0;
            }
        } else {
            void llllllllllllllIlllIIIlIIlllIIlII;
            void llllllllllllllIlllIIIlIIlllIIIll;
            aC = lIlIIIllIIlll[2];
            if (G.lIlllIIIIlIIlII(llllllllllllllIlllIIIlIIlllIIIll.equals(llllllllllllllIlllIIIlIIlllIIlII) ? 1 : 0)) {
                void llllllllllllllIlllIIIlIIlllIIIlI;
                if (G.lIlllIIIIlIIlII(llllllllllllllIlllIIIlIIlllIIIlI.equals(lIlIIIllIIllI[lIlIIIllIIlll[5]]) ? 1 : 0)) {
                    M.a(lIlIIIllIIlll[0], lIlIIIllIIlll[6], lIlIIIllIIllI[lIlIIIllIIlll[7]]);
                    0;
                    return lIlIIIllIIlll[3];
                }
                if (G.lIlllIIIIlIIlII(llllllllllllllIlllIIIlIIlllIIIlI.contains(lIlIIIllIIllI[lIlIIIllIIlll[8]]) ? 1 : 0)) {
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

    private static String lIlllIIIIIlllll(String llllllllllllllIlllIIIlIIlIllIlll, String llllllllllllllIlllIIIlIIlIllIllI) {
        llllllllllllllIlllIIIlIIlIllIlll = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIlIIlIlllIlI = new StringBuilder();
        char[] llllllllllllllIlllIIIlIIlIlllIIl = llllllllllllllIlllIIIlIIlIllIllI.toCharArray();
        int llllllllllllllIlllIIIlIIlIlllIII = lIlIIIllIIlll[2];
        char[] llllllllllllllIlllIIIlIIlIllIIlI = llllllllllllllIlllIIIlIIlIllIlll.toCharArray();
        int llllllllllllllIlllIIIlIIlIllIIIl = llllllllllllllIlllIIIlIIlIllIIlI.length;
        int llllllllllllllIlllIIIlIIlIllIIII = lIlIIIllIIlll[2];
        while (G.lIlllIIIIlIIIll(llllllllllllllIlllIIIlIIlIllIIII, llllllllllllllIlllIIIlIIlIllIIIl)) {
            char llllllllllllllIlllIIIlIIlIllllIl = llllllllllllllIlllIIIlIIlIllIIlI[llllllllllllllIlllIIIlIIlIllIIII];
            llllllllllllllIlllIIIlIIlIlllIlI.append((char)(llllllllllllllIlllIIIlIIlIllllIl ^ llllllllllllllIlllIIIlIIlIlllIIl[llllllllllllllIlllIIIlIIlIlllIII % llllllllllllllIlllIIIlIIlIlllIIl.length]));
            0;
            ++llllllllllllllIlllIIIlIIlIlllIII;
            ++llllllllllllllIlllIIIlIIlIllIIII;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIIlIIlIlllIlI);
    }

    private static String lIlllIIIIIllllI(String llllllllllllllIlllIIIlIIllIIllII, String llllllllllllllIlllIIIlIIllIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIIllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIllIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIllIIlll[12]), "DES");
            Cipher llllllllllllllIlllIIIlIIllIIlllI = Cipher.getInstance("DES");
            llllllllllllllIlllIIIlIIllIIlllI.init(lIlIIIllIIlll[5], llllllllllllllIlllIIIlIIllIIllll);
            return new String(llllllllllllllIlllIIIlIIllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIIllIIllIl) {
            llllllllllllllIlllIIIlIIllIIllIl.printStackTrace();
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

    private static String lIlllIIIIlIIIII(String llllllllllllllIlllIIIlIIllIllIIl, String llllllllllllllIlllIIIlIIllIllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIIllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIIllIllIll.init(lIlIIIllIIlll[5], llllllllllllllIlllIIIlIIllIlllII);
            return new String(llllllllllllllIlllIIIlIIllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIIllIllIlI) {
            llllllllllllllIlllIIIlIIllIllIlI.printStackTrace();
            return null;
        }
    }
}

