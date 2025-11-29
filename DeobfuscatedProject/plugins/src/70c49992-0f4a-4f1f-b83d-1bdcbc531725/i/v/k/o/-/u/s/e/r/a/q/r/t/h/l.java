/*
 * Decompiled with CFR 0.152.
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class l
extends Enum<l> {
    public static final /* synthetic */ /* enum */ l ANTI_VENOM;
    private static /* synthetic */ int[] lIlIlIllllIIl;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ l ANTI_VENOM_PLUS;
    private static /* synthetic */ String[] lIlIlIllllIII;
    public static final /* synthetic */ /* enum */ l CURE_SELF;
    private final /* synthetic */ List<Integer> items;
    public static final /* synthetic */ /* enum */ l IGNORE;
    public static final /* synthetic */ /* enum */ l ANTI_DOTE;
    private static final /* synthetic */ l[] $VALUES;
    public static final /* synthetic */ /* enum */ l ANTI_POISON;

    static {
        l.lIlllllllllIlII();
        l.lIlllllllllIIll();
        int[] nArray = new int[lIlIlIllllIIl[3]];
        nArray[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[4];
        nArray[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[5];
        nArray[l.lIlIlIllllIIl[2]] = lIlIlIllllIIl[6];
        nArray[l.lIlIlIllllIIl[7]] = lIlIlIllllIIl[8];
        ANTI_VENOM_PLUS = new l(lIlIlIllllIII[lIlIlIllllIIl[2]], nArray);
        int[] nArray2 = new int[lIlIlIllllIIl[3]];
        nArray2[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[9];
        nArray2[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[10];
        nArray2[l.lIlIlIllllIIl[2]] = lIlIlIllllIIl[11];
        nArray2[l.lIlIlIllllIIl[7]] = lIlIlIllllIIl[12];
        ANTI_VENOM = new l(lIlIlIllllIII[lIlIlIllllIIl[3]], nArray2);
        int[] nArray3 = new int[lIlIlIllllIIl[2]];
        nArray3[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[15];
        nArray3[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[16];
        ANTI_DOTE = new l(lIlIlIllllIII[lIlIlIllllIIl[14]], nArray3);
        int[] nArray4 = new int[lIlIlIllllIIl[2]];
        nArray4[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[19];
        nArray4[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[20];
        ANTI_POISON = new l(lIlIlIllllIII[lIlIlIllllIIl[18]], nArray4);
        int[] nArray5 = new int[lIlIlIllllIIl[2]];
        nArray5[l.lIlIlIllllIIl[0]] = lIlIlIllllIIl[22];
        nArray5[l.lIlIlIllllIIl[1]] = lIlIlIllllIIl[23];
        CURE_SELF = new l(nArray5);
        IGNORE = new l(new int[lIlIlIllllIIl[0]]);
        l[] lArray = new l[lIlIlIllllIIl[14]];
        lArray[l.lIlIlIllllIIl[0]] = ANTI_VENOM_PLUS;
        lArray[l.lIlIlIllllIIl[1]] = ANTI_VENOM;
        lArray[l.lIlIlIllllIIl[2]] = ANTI_DOTE;
        lArray[l.lIlIlIllllIIl[7]] = ANTI_POISON;
        lArray[l.lIlIlIllllIIl[3]] = CURE_SELF;
        lArray[l.lIlIlIllllIIl[13]] = IGNORE;
        $VALUES = lArray;
    }

    public String M() {
        return this.name;
    }

    private static String lIlllllllllIIII(String llllllllllllllIllIlIlIIIIIlllllI, String llllllllllllllIllIlIlIIIIIlllIII) {
        llllllllllllllIllIlIlIIIIIlllllI = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIIIIIllllII = new StringBuilder();
        char[] llllllllllllllIllIlIlIIIIIlllIll = llllllllllllllIllIlIlIIIIIlllIII.toCharArray();
        int llllllllllllllIllIlIlIIIIIlllIlI = lIlIlIllllIIl[0];
        char[] llllllllllllllIllIlIlIIIIIllIlII = llllllllllllllIllIlIlIIIIIlllllI.toCharArray();
        int llllllllllllllIllIlIlIIIIIllIIll = llllllllllllllIllIlIlIIIIIllIlII.length;
        int llllllllllllllIllIlIlIIIIIllIIlI = lIlIlIllllIIl[0];
        while (l.lIlllllllllIlIl(llllllllllllllIllIlIlIIIIIllIIlI, llllllllllllllIllIlIlIIIIIllIIll)) {
            char llllllllllllllIllIlIlIIIIIllllll = llllllllllllllIllIlIlIIIIIllIlII[llllllllllllllIllIlIlIIIIIllIIlI];
            llllllllllllllIllIlIlIIIIIllllII.append((char)(llllllllllllllIllIlIlIIIIIllllll ^ llllllllllllllIllIlIlIIIIIlllIll[llllllllllllllIllIlIlIIIIIlllIlI % llllllllllllllIllIlIlIIIIIlllIll.length]));
            "".length();
            ++llllllllllllllIllIlIlIIIIIlllIlI;
            ++llllllllllllllIllIlIlIIIIIllIIlI;
            "".length();
            if ("   ".length() != " ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIIIIIllllII);
    }

    private static boolean lIlllllllllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllllllllIIll() {
        lIlIlIllllIII = new String[lIlIlIllllIIl[25]];
        l.lIlIlIllllIII[l.lIlIlIllllIIl[0]] = l.lIlllllllllIIII("", "szBRv");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[1]] = l.lIlllllllllIIIl("R9CnVFCmroWykKIb7j/BjQ==", "mUzDN");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[2]] = l.lIlllllllllIIII("EAQmBV8nDzwDHw==", "QjRlr");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[7]] = l.lIlllllllllIIII("JwkQLjEwAgooIw==", "fGDgn");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[3]] = l.lIlllllllllIIlI("tFprbQ59Kc4DqVMWyUfKtA==", "sSsbE");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[13]] = l.lIlllllllllIIII("NwAsETMyASwd", "vNxXl");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[14]] = l.lIlllllllllIIIl("Qu8xIQCkU00f7C7LHkTgug==", "Zdylg");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[17]] = l.lIlllllllllIIlI("4hXOpSmNVr2G2o4hS+DKUw==", "vYfrt");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[18]] = l.lIlllllllllIIlI("IXVthsJnuNt8Ou2cIo/FOw==", "ETZCV");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[21]] = l.lIlllllllllIIII("LiIePSg+MgA+", "mwLxw");
        l.lIlIlIllllIII[l.lIlIlIllllIIl[24]] = l.lIlllllllllIIlI("cJtmiH58B7Q=", "dBFfq");
    }

    public List<Integer> P() {
        return this.items;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String lIlllllllllIIIl(String llllllllllllllIllIlIlIIIIIIlllII, String llllllllllllllIllIlIlIIIIIIllIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIIIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIllllIIl[18]), "DES");
            Cipher llllllllllllllIllIlIlIIIIIIllllI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIIIIIIllllI.init(lIlIlIllllIIl[2], llllllllllllllIllIlIlIIIIIIlllll);
            return new String(llllllllllllllIllIlIlIIIIIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIIIIIIlllIl) {
            llllllllllllllIllIlIlIIIIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllllllllIlII() {
        lIlIlIllllIIl = new int[26];
        l.lIlIlIllllIIl[0] = (14 + 109 - 77 + 96 ^ 24 + 100 - -34 + 41) & (0x2A ^ 0x1F ^ (0x3E ^ 0x42) ^ -" ".length());
        l.lIlIlIllllIIl[1] = " ".length();
        l.lIlIlIllllIIl[2] = "  ".length();
        l.lIlIlIllllIIl[3] = 0x61 ^ 0x32 ^ (0xEF ^ 0xB8);
        l.lIlIlIllllIIl[4] = -(0xFFFFBFEB & 0x451F) & (0xFFFFB77F & 0x7FFB);
        l.lIlIlIllllIIl[5] = 0xFFFFB6FF & 0x7B73;
        l.lIlIlIllllIIl[6] = 0xFFFFB775 & 0x7AFF;
        l.lIlIlIllllIIl[7] = "   ".length();
        l.lIlIlIllllIIl[8] = -(0xFFFFCEAF & 0x7DD9) & (0xFFFFFEFF & Short.MAX_VALUE);
        l.lIlIlIllllIIl[9] = 0xFFFFF7F9 & 0x3A6F;
        l.lIlIlIllllIIl[10] = -(0xFFFFCBCD & 0x3D33) & (0xFFFFBFFF & 0x7B6F);
        l.lIlIlIllllIIl[11] = -(0xFFFFB7CB & 0x4CB5) & (0xFFFFB7ED & 0x7EFF);
        l.lIlIlIllllIIl[12] = -(0xFFFFEAFF & 0x5D95) & (0xFFFFFAFF & Short.MAX_VALUE);
        l.lIlIlIllllIIl[13] = 0x90 ^ 0x95;
        l.lIlIlIllllIIl[14] = 0x2D ^ 0x2B;
        l.lIlIlIllllIIl[15] = 0xFFFFD7B7 & 0x3F7F;
        l.lIlIlIllllIIl[16] = 0xFFFFF7DB & 0x1F64;
        l.lIlIlIllllIIl[17] = 0xAB ^ 0xAC;
        l.lIlIlIllllIIl[18] = 0x70 ^ 0x78;
        l.lIlIlIllllIIl[19] = -(0xFFFFB77F & 0x58EE) & (0xFFFFDDFD & 0x3BFF);
        l.lIlIlIllllIIl[20] = -(0xFFFF9FF6 & 0x626B) & (0xFFFFEFEF & 0x1BFF);
        l.lIlIlIllllIIl[21] = 0x6C ^ 0x71 ^ (0x8E ^ 0x9A);
        l.lIlIlIllllIIl[22] = 0xFFFFF9F7 & 0x37FF;
        l.lIlIlIllllIIl[23] = 0xFFFFEEBF & 0x7BD1;
        l.lIlIlIllllIIl[24] = 121 + 91 - 70 + 64 ^ 151 + 176 - 238 + 107;
        l.lIlIlIllllIIl[25] = 0x56 ^ 0x5D;
    }

    private static String lIlllllllllIIlI(String llllllllllllllIllIlIlIIIIIlIlIIl, String llllllllllllllIllIlIlIIIIIlIIllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIIIIIlIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIIIIIlIlIll.init(lIlIlIllllIIl[2], llllllllllllllIllIlIlIIIIIlIllII);
            return new String(llllllllllllllIllIlIlIIIIIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIIIIIlIlIlI) {
            llllllllllllllIllIlIlIIIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private l(int ... nArray) {
        this(lIlIlIllllIII[lIlIlIllllIIl[0]], nArray);
    }

    /*
     * WARNING - void declaration
     */
    private l(String string2, int ... nArray) {
        void llllllllllllllIllIlIlIIIIlIIlIll;
        this.name = string2;
        this.items = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int llllllllllllllIllIlIlIIIIlIIlIlI = lIlIlIllllIIl[0];
        while (l.lIlllllllllIlIl(llllllllllllllIllIlIlIIIIlIIlIlI, (int)llllllllllllllIllIlIlIIIIlIIlIll)) {
            l llllllllllllllIllIlIlIIIIlIlIIIl;
            void llllllllllllllIllIlIlIIIIlIIllII;
            void llllllllllllllIllIlIlIIIIlIIlIIl = llllllllllllllIllIlIlIIIIlIIllII[llllllllllllllIllIlIlIIIIlIIlIlI];
            llllllllllllllIllIlIlIIIIlIlIIIl.items.add((int)llllllllllllllIllIlIlIIIIlIIlIIl);
            "".length();
            ++llllllllllllllIllIlIlIIIIlIIlIlI;
            "".length();
            if ((0x36 ^ 0x32) > 0) continue;
            throw null;
        }
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }
}

