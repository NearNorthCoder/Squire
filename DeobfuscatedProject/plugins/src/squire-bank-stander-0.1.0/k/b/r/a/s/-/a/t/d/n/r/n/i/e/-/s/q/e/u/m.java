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

public final class m
extends Enum<m> {
    private static final /* synthetic */ m[] $VALUES;
    public static final /* synthetic */ /* enum */ m JADE;
    public static final /* synthetic */ /* enum */ m SAPPHIRE;
    public static final /* synthetic */ /* enum */ m AMETHYST;
    private final /* synthetic */ int craftingOption;
    private static /* synthetic */ int[] lllIIIIIIll;
    public static final /* synthetic */ /* enum */ m RED_TOPAZ;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ /* enum */ m DRAGONSTONE;
    public static final /* synthetic */ /* enum */ m DIAMOND;
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ /* enum */ m ZENYTE;
    public static final /* synthetic */ /* enum */ m EMERALD;
    public static final /* synthetic */ /* enum */ m ONYX;
    private static /* synthetic */ String[] lllIIIIIIlI;
    public static final /* synthetic */ /* enum */ m RUBY;
    public static final /* synthetic */ /* enum */ m OPAL;

    private static void lIlIllIIIlIIIl() {
        lllIIIIIIll = new int[34];
        m.lllIIIIIIll[0] = (0x66 ^ 0x2D) & ~(0x7E ^ 0x35);
        m.lllIIIIIIll[1] = -(0xFFFFEB3F & 0x7DE7) & (0xFFFFEFFF & 0x7F7F);
        m.lllIIIIIIll[2] = 0xFFFFB75D & 0x4EEB;
        m.lllIIIIIIll[3] = " ".length();
        m.lllIIIIIIll[4] = 0xFFFFD7DB & 0x2E7F;
        m.lllIIIIIIll[5] = 0xFFFFD6EB & 0x2F5F;
        m.lllIIIIIIll[6] = "  ".length();
        m.lllIIIIIIll[7] = 0xFFFFEF5F & 0x16FD;
        m.lllIIIIIIll[8] = 0xFFFFAF7F & 0x56CD;
        m.lllIIIIIIll[9] = "   ".length();
        m.lllIIIIIIll[10] = 0xFFFFD7F7 & 0x2E5F;
        m.lllIIIIIIll[11] = -(0xFFFFFA6F & 0x5D99) & (0xFFFFFF5F & 0x5EEF);
        m.lllIIIIIIll[12] = 71 + 88 - 46 + 22 ^ 63 + 56 - 4 + 16;
        m.lllIIIIIIll[13] = -(0xFFFFBBB9 & 0x7D6F) & (0xFFFFFFFF & 0x3F7D);
        m.lllIIIIIIll[14] = -(0xFFFFFC7F & 0x63BB) & (0xFFFFE77F & 0x7EFF);
        m.lllIIIIIIll[15] = 0x7F ^ 0x7A;
        m.lllIIIIIIll[16] = 0xFFFFA6D3 & 0x5F7F;
        m.lllIIIIIIll[17] = 0xFFFFDEC7 & 0x277B;
        m.lllIIIIIIll[18] = 0x78 ^ 0xE ^ (0xC2 ^ 0xB2);
        m.lllIIIIIIll[19] = -(0x74 ^ 0x53) & (0xFFFFDE77 & 0x27FF);
        m.lllIIIIIIll[20] = 0xFFFFEE59 & 0x17E7;
        m.lllIIIIIIll[21] = 0x99 ^ 0xA4 ^ (0x2D ^ 0x17);
        m.lllIIIIIIll[22] = 0xFFFFA7DF & 0x5E7F;
        m.lllIIIIIIll[23] = -(0xFFFFBDB1 & 0x7B7F) & (0xFFFFFF7F & 0x3FFF);
        m.lllIIIIIIll[24] = 0x80 ^ 0x88;
        m.lllIIIIIIll[25] = 0xFFFFFBEB & 0x1DBF;
        m.lllIIIIIIll[26] = 0xFFFFFFED & 0x19BF;
        m.lllIIIIIIll[27] = 0x6E ^ 0x62 ^ (0x5D ^ 0x58);
        m.lllIIIIIIll[28] = -(0xFFFFFC8F & 0x27FD) & (0xFFFFF7EF & Short.MAX_VALUE);
        m.lllIIIIIIll[29] = -(0xFFFFDF25 & 0x22DB) & (0xFFFFFEFD & 0x67FF);
        m.lllIIIIIIll[30] = 0x2D ^ 0x27;
        m.lllIIIIIIll[31] = 0xFFFFDC3F & 0x6FE8;
        m.lllIIIIIIll[32] = -(0xFFFFF7C3 & 0x28FD) & (0xFFFFFCFD & 0x6FE7);
        m.lllIIIIIIll[33] = 0x25 ^ 0x2E;
    }

    private m(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    private static boolean lIlIllIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        m.lIlIllIIIlIIIl();
        m.lIlIllIIIlIIII();
        OPAL = new m(lllIIIIIIll[1], lllIIIIIIll[2], lllIIIIIIll[3]);
        JADE = new m(lllIIIIIIll[4], lllIIIIIIll[5], lllIIIIIIll[3]);
        RED_TOPAZ = new m(lllIIIIIIll[7], lllIIIIIIll[8], lllIIIIIIll[3]);
        SAPPHIRE = new m(lllIIIIIIll[10], lllIIIIIIll[11], lllIIIIIIll[3]);
        EMERALD = new m(lllIIIIIIll[13], lllIIIIIIll[14], lllIIIIIIll[3]);
        RUBY = new m(lllIIIIIIll[16], lllIIIIIIll[17], lllIIIIIIll[3]);
        DIAMOND = new m(lllIIIIIIll[19], lllIIIIIIll[20], lllIIIIIIll[3]);
        DRAGONSTONE = new m(lllIIIIIIll[22], lllIIIIIIll[23], lllIIIIIIll[3]);
        ONYX = new m(lllIIIIIIll[25], lllIIIIIIll[26], lllIIIIIIll[3]);
        AMETHYST = new m(lllIIIIIIll[28], lllIIIIIIll[29], lllIIIIIIll[12]);
        ZENYTE = new m(lllIIIIIIll[31], lllIIIIIIll[32], lllIIIIIIll[3]);
        m[] mArray = new m[lllIIIIIIll[33]];
        mArray[m.lllIIIIIIll[0]] = OPAL;
        mArray[m.lllIIIIIIll[3]] = JADE;
        mArray[m.lllIIIIIIll[6]] = RED_TOPAZ;
        mArray[m.lllIIIIIIll[9]] = SAPPHIRE;
        mArray[m.lllIIIIIIll[12]] = EMERALD;
        mArray[m.lllIIIIIIll[15]] = RUBY;
        mArray[m.lllIIIIIIll[18]] = DIAMOND;
        mArray[m.lllIIIIIIll[21]] = DRAGONSTONE;
        mArray[m.lllIIIIIIll[24]] = ONYX;
        mArray[m.lllIIIIIIll[27]] = AMETHYST;
        mArray[m.lllIIIIIIll[30]] = ZENYTE;
        $VALUES = mArray;
    }

    private static void lIlIllIIIlIIII() {
        lllIIIIIIlI = new String[lllIIIIIIll[33]];
        m.lllIIIIIIlI[m.lllIIIIIIll[0]] = m.lIlIllIIIIllIl("Lxzm1k1hBzw=", "mdhzx");
        m.lllIIIIIIlI[m.lllIIIIIIll[3]] = m.lIlIllIIIIlllI("IgYoMg==", "hGlwF");
        m.lllIIIIIIlI[m.lllIIIIIIll[6]] = m.lIlIllIIIIlllI("NzYPHDgqIwoZ", "esKCl");
        m.lllIIIIIIlI[m.lllIIIIIIll[9]] = m.lIlIllIIIIllll("aavw9rcMQIbeeHcYmYozMw==", "nHsLy");
        m.lllIIIIIIlI[m.lllIIIIIIll[12]] = m.lIlIllIIIIllll("yKgLTeHUmek=", "NJdUr");
        m.lllIIIIIIlI[m.lllIIIIIIll[15]] = m.lIlIllIIIIlllI("ATkSHw==", "SlPFp");
        m.lllIIIIIIlI[m.lllIIIIIIll[18]] = m.lIlIllIIIIllll("pwnehHxRbO8=", "HiZiw");
        m.lllIIIIIIlI[m.lllIIIIIIll[21]] = m.lIlIllIIIIllIl("OfbQ0RUT2wGsytEnuhBjnA==", "mkmgM");
        m.lllIIIIIIlI[m.lllIIIIIIll[24]] = m.lIlIllIIIIlllI("LCYMOg==", "chUbe");
        m.lllIIIIIIlI[m.lllIIIIIIll[27]] = m.lIlIllIIIIlllI("CRU3OAERCyY=", "HXrlI");
        m.lllIIIIIIlI[m.lllIIIIIIll[30]] = m.lIlIllIIIIllIl("EOuH4NkZNRA=", "yxNSA");
    }

    private static String lIlIllIIIIllll(String llllllllllllllllIIlIlIlIllllIIll, String llllllllllllllllIIlIlIlIllllIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIllllIIlI.getBytes(StandardCharsets.UTF_8)), lllIIIIIIll[24]), "DES");
            Cipher llllllllllllllllIIlIlIlIllllIlIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIlIllllIlIl.init(lllIIIIIIll[6], llllllllllllllllIIlIlIlIllllIllI);
            return new String(llllllllllllllllIIlIlIlIllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIllllIlII) {
            llllllllllllllllIIlIlIlIllllIlII.printStackTrace();
            return null;
        }
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    public int C() {
        return this.craftingOption;
    }

    public int z() {
        return this.materialID;
    }

    private static String lIlIllIIIIlllI(String llllllllllllllllIIlIlIllIIIIIIll, String llllllllllllllllIIlIlIllIIIIIlll) {
        llllllllllllllllIIlIlIllIIIIIIll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIllIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIllIIIIIllI = new StringBuilder();
        char[] llllllllllllllllIIlIlIllIIIIIlIl = llllllllllllllllIIlIlIllIIIIIlll.toCharArray();
        int llllllllllllllllIIlIlIllIIIIIlII = lllIIIIIIll[0];
        char[] llllllllllllllllIIlIlIlIlllllllI = llllllllllllllllIIlIlIllIIIIIIll.toCharArray();
        int llllllllllllllllIIlIlIlIllllllIl = llllllllllllllllIIlIlIlIlllllllI.length;
        int llllllllllllllllIIlIlIlIllllllII = lllIIIIIIll[0];
        while (m.lIlIllIIIlIIlI(llllllllllllllllIIlIlIlIllllllII, llllllllllllllllIIlIlIlIllllllIl)) {
            char llllllllllllllllIIlIlIllIIIIlIIl = llllllllllllllllIIlIlIlIlllllllI[llllllllllllllllIIlIlIlIllllllII];
            llllllllllllllllIIlIlIllIIIIIllI.append((char)(llllllllllllllllIIlIlIllIIIIlIIl ^ llllllllllllllllIIlIlIllIIIIIlIl[llllllllllllllllIIlIlIllIIIIIlII % llllllllllllllllIIlIlIllIIIIIlIl.length]));
            "".length();
            ++llllllllllllllllIIlIlIllIIIIIlII;
            ++llllllllllllllllIIlIlIlIllllllII;
            "".length();
            if (" ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIllIIIIIllI);
    }

    private static String lIlIllIIIIllIl(String llllllllllllllllIIlIlIlIlllIIllI, String llllllllllllllllIIlIlIlIlllIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIlIlllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIlIlllIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIlIlllIlIII.init(lllIIIIIIll[6], llllllllllllllllIIlIlIlIlllIlIIl);
            return new String(llllllllllllllllIIlIlIlIlllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIlIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIlIlllIIlll) {
            llllllllllllllllIIlIlIlIlllIIlll.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.finishedID;
    }
}

