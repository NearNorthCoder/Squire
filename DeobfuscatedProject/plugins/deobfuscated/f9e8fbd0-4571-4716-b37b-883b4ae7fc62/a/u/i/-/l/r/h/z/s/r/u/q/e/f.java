/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class f
extends Enum<f> {
    private final /* synthetic */ int itemID;
    private static /* synthetic */ int[] lIllIlIIIlIll;
    public static final /* synthetic */ /* enum */ f SHARK;
    public static final /* synthetic */ /* enum */ f ANGLER_FISH;
    public static final /* synthetic */ /* enum */ f MANTA_RAY;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ /* enum */ f KARAMBWAN;
    public static final /* synthetic */ /* enum */ f MONKFISH;
    private static /* synthetic */ String[] lIllIlIIIIlll;

    private f(int n3) {
        this.itemID = n3;
    }

    private static boolean llIIIlllIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIlllIllIlll(String llllllllllllllIllIIIlllllIIlIIll, String llllllllllllllIllIIIlllllIIlIIlI) {
        llllllllllllllIllIIIlllllIIlIIll = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlllllIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlllllIIlIIIl = new StringBuilder();
        char[] llllllllllllllIllIIIlllllIIlIIII = llllllllllllllIllIIIlllllIIlIIlI.toCharArray();
        int llllllllllllllIllIIIlllllIIIllll = lIllIlIIIlIll[0];
        char[] llllllllllllllIllIIIlllllIIIlIIl = llllllllllllllIllIIIlllllIIlIIll.toCharArray();
        int llllllllllllllIllIIIlllllIIIlIII = llllllllllllllIllIIIlllllIIIlIIl.length;
        int llllllllllllllIllIIIlllllIIIIlll = lIllIlIIIlIll[0];
        while (f.llIIIlllIllllIl(llllllllllllllIllIIIlllllIIIIlll, llllllllllllllIllIIIlllllIIIlIII)) {
            char llllllllllllllIllIIIlllllIIlIlII = llllllllllllllIllIIIlllllIIIlIIl[llllllllllllllIllIIIlllllIIIIlll];
            llllllllllllllIllIIIlllllIIlIIIl.append((char)(llllllllllllllIllIIIlllllIIlIlII ^ llllllllllllllIllIIIlllllIIlIIII[llllllllllllllIllIIIlllllIIIllll % llllllllllllllIllIIIlllllIIlIIII.length]));
            0;
            ++llllllllllllllIllIIIlllllIIIllll;
            ++llllllllllllllIllIIIlllllIIIIlll;
            0;
            if ((0xBA ^ 0xBE) <= (0x3B ^ 0x3F)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlllllIIlIIIl);
    }

    private static String llIIIlllIllIIIl(String llllllllllllllIllIIIlllllIlIIIIl, String llllllllllllllIllIIIlllllIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIIlllllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIllIlIIIlIll[11]), "DES");
            Cipher llllllllllllllIllIIIlllllIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIlllllIlIIlIl.init(lIllIlIIIlIll[4], llllllllllllllIllIIIlllllIlIIllI);
            return new String(llllllllllllllIllIIIlllllIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlllllIlIIlII) {
            llllllllllllllIllIIIlllllIlIIlII.printStackTrace();
            return null;
        }
    }

    private static String llIIIlllIllIIlI(String llllllllllllllIllIIIlllllIlIlllI, String llllllllllllllIllIIIlllllIlIllIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIlllllIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllllIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlllllIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlllllIllIIlI.init(lIllIlIIIlIll[4], llllllllllllllIllIIIlllllIllIIll);
            return new String(llllllllllllllIllIIIlllllIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlllllIllIIIl) {
            llllllllllllllIllIIIlllllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIlllIlllIII() {
        lIllIlIIIIlll = new String[lIllIlIIIlIll[10]];
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[0]] = f."MANTA_RAY";
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[2]] = f."SHARK";
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[4]] = f."KARAMBWAN";
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[6]] = f."ANGLER_FISH";
        f.lIllIlIIIIlll[f.lIllIlIIIlIll[8]] = f."MONKFISH";
    }

    static {
        f.llIIIlllIllllII();
        f.llIIIlllIlllIII();
        MANTA_RAY = new f(lIllIlIIIlIll[1]);
        SHARK = new f(lIllIlIIIlIll[3]);
        KARAMBWAN = new f(lIllIlIIIlIll[5]);
        ANGLER_FISH = new f(lIllIlIIIlIll[7]);
        MONKFISH = new f(lIllIlIIIlIll[9]);
        f[] fArray = new f[lIllIlIIIlIll[10]];
        fArray[f.lIllIlIIIlIll[0]] = MANTA_RAY;
        fArray[f.lIllIlIIIlIll[2]] = SHARK;
        fArray[f.lIllIlIIIlIll[4]] = KARAMBWAN;
        fArray[f.lIllIlIIIlIll[6]] = ANGLER_FISH;
        fArray[f.lIllIlIIIlIll[8]] = MONKFISH;
        $VALUES = fArray;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private static void llIIIlllIllllII() {
        lIllIlIIIlIll = new int[12];
        f.lIllIlIIIlIll[0] = (0xFB ^ 0xA6 ^ (0x5E ^ 0x56)) & ((0x52 ^ 0x4C) & ~(0xD9 ^ 0xC7) ^ (0xA ^ 0x5F) ^ -1);
        f.lIllIlIIIlIll[1] = -(0xFFFFBF7D & 0x6EEB) & (0xFFFFEFEF & 0x3FFF);
        f.lIllIlIIIlIll[2] = 1;
        f.lIllIlIIIlIll[3] = -(0xFFFFF67F & 0x4FB7) & (0xFFFFD7F7 & 0x6FBF);
        f.lIllIlIIIlIll[4] = 2;
        f.lIllIlIIIlIll[5] = -(0xFFFFFDFD & 0x53B3) & (0xFFFFFDF8 & 0x5FFF);
        f.lIllIlIIIlIll[6] = 3;
        f.lIllIlIIIlIll[7] = 0xFFFFB59F & 0x7EE1;
        f.lIllIlIIIlIll[8] = 0x3B ^ 0x3F;
        f.lIllIlIIIlIll[9] = -(0xFFFFA0FF & 0x7F75) & (0xFFFFFF7F & 0x3FFE);
        f.lIllIlIIIlIll[10] = 109 + 173 - 114 + 20 ^ 107 + 107 - 91 + 62;
        f.lIllIlIIIlIll[11] = 41 + 32 - 11 + 115 ^ 12 + 22 - -119 + 32;
    }

    public int q() {
        return this.itemID;
    }
}

