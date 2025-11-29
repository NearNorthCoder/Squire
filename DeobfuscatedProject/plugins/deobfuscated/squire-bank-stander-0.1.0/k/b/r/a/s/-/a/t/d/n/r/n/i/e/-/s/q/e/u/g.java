/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class g
extends Enum<g> {
    public static final /* synthetic */ /* enum */ g ADAMANT;
    private static /* synthetic */ String[] lllIIllIlII;
    public static final /* synthetic */ /* enum */ g BRONZE;
    public static final /* synthetic */ /* enum */ g STEEL;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ /* enum */ g MITHRIL;
    public static final /* synthetic */ /* enum */ g DRAGON;
    private final /* synthetic */ int boltTipId;
    public static final /* synthetic */ /* enum */ g BROAD;
    public static final /* synthetic */ /* enum */ g IRON;
    private static /* synthetic */ int[] lllIIllIlIl;
    public static final /* synthetic */ /* enum */ g RUNE;

    private static boolean lIlIlllIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlllIIllllI(String llllllllllllllllIIlIIlllIlIIlllI, String llllllllllllllllIIlIIlllIlIIllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIlIIllIl.getBytes(StandardCharsets.UTF_8)), lllIIllIlIl[16]), "DES");
            Cipher llllllllllllllllIIlIIlllIlIlIIII = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlllIlIlIIII.init(lllIIllIlIl[4], llllllllllllllllIIlIIlllIlIlIIIl);
            return new String(llllllllllllllllIIlIIlllIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlllIlIIllll) {
            llllllllllllllllIIlIIlllIlIIllll.printStackTrace();
            return null;
        }
    }

    public int y() {
        return this.boltTipId;
    }

    private static void lIlIlllIlIIIII() {
        lllIIllIlII = new String[lllIIllIlIl[16]];
        g.lllIIllIlII[g.lllIIllIlIl[0]] = g."BRONZE";
        g.lllIIllIlII[g.lllIIllIlIl[2]] = g."IRON";
        g.lllIIllIlII[g.lllIIllIlIl[4]] = g."STEEL";
        g.lllIIllIlII[g.lllIIllIlIl[6]] = g."MITHRIL";
        g.lllIIllIlII[g.lllIIllIlIl[8]] = g."ADAMANT";
        g.lllIIllIlII[g.lllIIllIlIl[10]] = g."RUNE";
        g.lllIIllIlII[g.lllIIllIlIl[12]] = g."BROAD";
        g.lllIIllIlII[g.lllIIllIlIl[14]] = g."DRAGON";
    }

    private static void lIlIlllIlIIIIl() {
        lllIIllIlIl = new int[17];
        g.lllIIllIlIl[0] = (0x15 ^ 0x33) & ~(0x8C ^ 0xAA);
        g.lllIIllIlIl[1] = 0xFFFFFDDF & 0x26BF;
        g.lllIIllIlIl[2] = 1;
        g.lllIIllIlIl[3] = 0xFFFFEEB9 & 0x35E7;
        g.lllIIllIlIl[4] = 2;
        g.lllIIllIlIl[5] = 0xFFFFA6F7 & 0x7DAA;
        g.lllIIllIlIl[6] = 3;
        g.lllIIllIlIl[7] = 0xFFFFA6E7 & 0x7DBB;
        g.lllIIllIlIl[8] = 0xFE ^ 0xA2 ^ (0x2A ^ 0x72);
        g.lllIIllIlIl[9] = 0xFFFFA5E5 & 0x7EBE;
        g.lllIIllIlIl[10] = 0x7F ^ 0x7A;
        g.lllIIllIlIl[11] = 0xFFFFB4BF & 0x6FE5;
        g.lllIIllIlIl[12] = 0x8D ^ 0x8B;
        g.lllIIllIlIl[13] = 0xFFFFAE65 & 0x7FFE;
        g.lllIIllIlIl[14] = 0x6C ^ 0x69 ^ 2;
        g.lllIIllIlIl[15] = 0xFFFFF5FF & 0x5FAA;
        g.lllIIllIlIl[16] = 0x55 ^ 0x5D;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    static {
        g.lIlIlllIlIIIIl();
        g.lIlIlllIlIIIII();
        BRONZE = new g(lllIIllIlIl[1]);
        IRON = new g(lllIIllIlIl[3]);
        STEEL = new g(lllIIllIlIl[5]);
        MITHRIL = new g(lllIIllIlIl[7]);
        ADAMANT = new g(lllIIllIlIl[9]);
        RUNE = new g(lllIIllIlIl[11]);
        BROAD = new g(lllIIllIlIl[13]);
        DRAGON = new g(lllIIllIlIl[15]);
        g[] gArray = new g[lllIIllIlIl[16]];
        gArray[g.lllIIllIlIl[0]] = BRONZE;
        gArray[g.lllIIllIlIl[2]] = IRON;
        gArray[g.lllIIllIlIl[4]] = STEEL;
        gArray[g.lllIIllIlIl[6]] = MITHRIL;
        gArray[g.lllIIllIlIl[8]] = ADAMANT;
        gArray[g.lllIIllIlIl[10]] = RUNE;
        gArray[g.lllIIllIlIl[12]] = BROAD;
        gArray[g.lllIIllIlIl[14]] = DRAGON;
        $VALUES = gArray;
    }

    private static String lIlIlllIIlllIl(String llllllllllllllllIIlIIlllIlIllllI, String llllllllllllllllIIlIIlllIllIIIlI) {
        llllllllllllllllIIlIIlllIlIllllI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlllIllIIIIl = new StringBuilder();
        char[] llllllllllllllllIIlIIlllIllIIIII = llllllllllllllllIIlIIlllIllIIIlI.toCharArray();
        int llllllllllllllllIIlIIlllIlIlllll = lllIIllIlIl[0];
        char[] llllllllllllllllIIlIIlllIlIllIIl = llllllllllllllllIIlIIlllIlIllllI.toCharArray();
        int llllllllllllllllIIlIIlllIlIllIII = llllllllllllllllIIlIIlllIlIllIIl.length;
        int llllllllllllllllIIlIIlllIlIlIlll = lllIIllIlIl[0];
        while (g.lIlIlllIlIIIlI(llllllllllllllllIIlIIlllIlIlIlll, llllllllllllllllIIlIIlllIlIllIII)) {
            char llllllllllllllllIIlIIlllIllIIlII = llllllllllllllllIIlIIlllIlIllIIl[llllllllllllllllIIlIIlllIlIlIlll];
            llllllllllllllllIIlIIlllIllIIIIl.append((char)(llllllllllllllllIIlIIlllIllIIlII ^ llllllllllllllllIIlIIlllIllIIIII[llllllllllllllllIIlIIlllIlIlllll % llllllllllllllllIIlIIlllIllIIIII.length]));
            0;
            ++llllllllllllllllIIlIIlllIlIlllll;
            ++llllllllllllllllIIlIIlllIlIlIlll;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlllIllIIIIl);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private g(int n3) {
        this.boltTipId = n3;
    }

    private static String lIlIlllIIlllll(String llllllllllllllllIIlIIlllIlllIIIl, String llllllllllllllllIIlIIlllIlllIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlllIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlllIlllIlIl.init(lllIIllIlIl[4], llllllllllllllllIIlIIlllIlllIllI);
            return new String(llllllllllllllllIIlIIlllIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlllIlllIlII) {
            llllllllllllllllIIlIIlllIlllIlII.printStackTrace();
            return null;
        }
    }
}

