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

public final class d
extends Enum<d> {
    private final /* synthetic */ int arrowTipId;
    public static final /* synthetic */ /* enum */ d IRON;
    public static final /* synthetic */ /* enum */ d DRAGON;
    private static final /* synthetic */ d[] $VALUES;
    private static /* synthetic */ String[] lllIIIllIII;
    private static /* synthetic */ int[] lllIIIllIIl;
    public static final /* synthetic */ /* enum */ d MITHRIL;
    public static final /* synthetic */ /* enum */ d STEEL;
    public static final /* synthetic */ /* enum */ d ADAMANT;
    public static final /* synthetic */ /* enum */ d RUNE;
    public static final /* synthetic */ /* enum */ d BRONZE;
    public static final /* synthetic */ /* enum */ d HEADLESS;
    public static final /* synthetic */ /* enum */ d BROAD;
    public static final /* synthetic */ /* enum */ d AMETHYST;

    private static boolean lIlIllIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIlIIlIll() {
        lllIIIllIII = new String[lllIIIllIIl[20]];
        d.lllIIIllIII[d.lllIIIllIIl[0]] = d."HEADLESS";
        d.lllIIIllIII[d.lllIIIllIIl[2]] = d."BRONZE";
        d.lllIIIllIII[d.lllIIIllIIl[4]] = d."IRON";
        d.lllIIIllIII[d.lllIIIllIIl[6]] = d."STEEL";
        d.lllIIIllIII[d.lllIIIllIIl[8]] = d."MITHRIL";
        d.lllIIIllIII[d.lllIIIllIIl[10]] = d."BROAD";
        d.lllIIIllIII[d.lllIIIllIIl[12]] = d."ADAMANT";
        d.lllIIIllIII[d.lllIIIllIIl[14]] = d."RUNE";
        d.lllIIIllIII[d.lllIIIllIIl[16]] = d."AMETHYST";
        d.lllIIIllIII[d.lllIIIllIIl[18]] = d."DRAGON";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    static {
        d.lIlIllIlIIllII();
        d.lIlIllIlIIlIll();
        HEADLESS = new d(lllIIIllIIl[1]);
        BRONZE = new d(lllIIIllIIl[3]);
        IRON = new d(lllIIIllIIl[5]);
        STEEL = new d(lllIIIllIIl[7]);
        MITHRIL = new d(lllIIIllIIl[9]);
        BROAD = new d(lllIIIllIIl[11]);
        ADAMANT = new d(lllIIIllIIl[13]);
        RUNE = new d(lllIIIllIIl[15]);
        AMETHYST = new d(lllIIIllIIl[17]);
        DRAGON = new d(lllIIIllIIl[19]);
        d[] dArray = new d[lllIIIllIIl[20]];
        dArray[d.lllIIIllIIl[0]] = HEADLESS;
        dArray[d.lllIIIllIIl[2]] = BRONZE;
        dArray[d.lllIIIllIIl[4]] = IRON;
        dArray[d.lllIIIllIIl[6]] = STEEL;
        dArray[d.lllIIIllIIl[8]] = MITHRIL;
        dArray[d.lllIIIllIIl[10]] = BROAD;
        dArray[d.lllIIIllIIl[12]] = ADAMANT;
        dArray[d.lllIIIllIIl[14]] = RUNE;
        dArray[d.lllIIIllIIl[16]] = AMETHYST;
        dArray[d.lllIIIllIIl[18]] = DRAGON;
        $VALUES = dArray;
    }

    private static String lIlIllIlIIlIlI(String llllllllllllllllIIlIlIIllIIIIIII, String llllllllllllllllIIlIlIIlIlllllll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIllIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlIlllllll.getBytes(StandardCharsets.UTF_8)), lllIIIllIIl[16]), "DES");
            Cipher llllllllllllllllIIlIlIIllIIIIIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIllIIIIIlI.init(lllIIIllIIl[4], llllllllllllllllIIlIlIIllIIIIIll);
            return new String(llllllllllllllllIIlIlIIllIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIllIIIIIIl) {
            llllllllllllllllIIlIlIIllIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIlIIlIIl(String llllllllllllllllIIlIlIIllIIIllIl, String llllllllllllllllIIlIlIIllIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIllIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIllIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIllIIIllll.init(lllIIIllIIl[4], llllllllllllllllIIlIlIIllIIlIIII);
            return new String(llllllllllllllllIIlIlIIllIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIllIIIlllI) {
            llllllllllllllllIIlIlIIllIIIlllI.printStackTrace();
            return null;
        }
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static void lIlIllIlIIllII() {
        lllIIIllIIl = new int[21];
        d.lllIIIllIIl[0] = (0x4B ^ 8 ^ (0x75 ^ 0x6C)) & (41 + 189 - 104 + 86 ^ 59 + 69 - 48 + 62 ^ -1);
        d.lllIIIllIIl[1] = 0x88 ^ 0xBC;
        d.lllIIIllIIl[2] = 1;
        d.lllIIIllIIl[3] = 0x4F ^ 0x68;
        d.lllIIIllIIl[4] = 2;
        d.lllIIIllIIl[5] = 139 + 81 - 58 + 6 ^ 125 + 41 - 154 + 116;
        d.lllIIIllIIl[6] = 3;
        d.lllIIIllIIl[7] = 0xEF ^ 0xC6;
        d.lllIIIllIIl[8] = 0xAA ^ 0xAE;
        d.lllIIIllIIl[9] = 0 + 82 - -27 + 46 ^ 133 + 44 - 77 + 77;
        d.lllIIIllIIl[10] = 0x9D ^ 0xAC ^ (0x12 ^ 0x26);
        d.lllIIIllIIl[11] = -(0xFFFFB0FE & 0x5F9F) & (0xFFFFBFFF & 0x7EFF);
        d.lllIIIllIIl[12] = 0x9A ^ 0x9C;
        d.lllIIIllIIl[13] = 0xF9 ^ 0x8F ^ (0xA ^ 0x57);
        d.lllIIIllIIl[14] = 0x42 ^ 0x45;
        d.lllIIIllIIl[15] = 0x2E ^ 2;
        d.lllIIIllIIl[16] = 0x55 ^ 0x25 ^ (0xE3 ^ 0x9B);
        d.lllIIIllIIl[17] = -(114 + 46 - 102 + 96) & (0xFFFFFFFF & 0x53FF);
        d.lllIIIllIIl[18] = 0x30 ^ 0x39;
        d.lllIIIllIIl[19] = -(0xFFFF96AD & 0x6D53) & (0xFFFFFFE7 & 0x2FFD);
        d.lllIIIllIIl[20] = 0x4E ^ 0x6D ^ (0xF ^ 0x26);
    }

    public int o() {
        return this.arrowTipId;
    }

    private d(int n3) {
        this.arrowTipId = n3;
    }

    private static String lIlIllIlIIlIII(String llllllllllllllllIIlIlIIlIlllIIII, String llllllllllllllllIIlIlIIlIllIllll) {
        llllllllllllllllIIlIlIIlIlllIIII = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIlIllIlllI = new StringBuilder();
        char[] llllllllllllllllIIlIlIIlIllIllIl = llllllllllllllllIIlIlIIlIllIllll.toCharArray();
        int llllllllllllllllIIlIlIIlIllIllII = lllIIIllIIl[0];
        char[] llllllllllllllllIIlIlIIlIllIIllI = llllllllllllllllIIlIlIIlIlllIIII.toCharArray();
        int llllllllllllllllIIlIlIIlIllIIlIl = llllllllllllllllIIlIlIIlIllIIllI.length;
        int llllllllllllllllIIlIlIIlIllIIlII = lllIIIllIIl[0];
        while (d.lIlIllIlIIllIl(llllllllllllllllIIlIlIIlIllIIlII, llllllllllllllllIIlIlIIlIllIIlIl)) {
            char llllllllllllllllIIlIlIIlIlllIIIl = llllllllllllllllIIlIlIIlIllIIllI[llllllllllllllllIIlIlIIlIllIIlII];
            llllllllllllllllIIlIlIIlIllIlllI.append((char)(llllllllllllllllIIlIlIIlIlllIIIl ^ llllllllllllllllIIlIlIIlIllIllIl[llllllllllllllllIIlIlIIlIllIllII % llllllllllllllllIIlIlIIlIllIllIl.length]));
            0;
            ++llllllllllllllllIIlIlIIlIllIllII;
            ++llllllllllllllllIIlIlIIlIllIIlII;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIlIllIlllI);
    }
}

