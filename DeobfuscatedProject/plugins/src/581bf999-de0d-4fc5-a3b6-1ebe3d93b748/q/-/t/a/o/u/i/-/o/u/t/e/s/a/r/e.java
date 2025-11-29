/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e NECTAR;
    private static /* synthetic */ String[] llIIllllIll;
    private final /* synthetic */ List<Integer> ids;
    public static final /* synthetic */ /* enum */ e SILK_DRESSING;
    private static /* synthetic */ int[] llIIlllllII;
    public static final /* synthetic */ /* enum */ e BLESSED_CRYSTAL_SCARAB;
    public static final /* synthetic */ /* enum */ e TEARS_OF_ELIDINIS;
    public static final /* synthetic */ /* enum */ e SMELLING_SALTS;
    public static final /* synthetic */ /* enum */ e LIQUID_ADRENALINE;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e AMBROSIA;

    /*
     * WARNING - void declaration
     */
    public static e c(int n2) {
        void llllllllllllllllIIlllIIlIIlIlIIl;
        e[] eArray = e.values();
        int n3 = eArray.length;
        int llllllllllllllllIIlllIIlIIlIlIII = llIIlllllII[0];
        while (e.lIlIIlIIIIllIl(llllllllllllllllIIlllIIlIIlIlIII, (int)llllllllllllllllIIlllIIlIIlIlIIl)) {
            int llllllllllllllllIIlllIIlIIlIlIll;
            void llllllllllllllllIIlllIIlIIlIlIlI;
            void llllllllllllllllIIlllIIlIIlIIlll = llllllllllllllllIIlllIIlIIlIlIlI[llllllllllllllllIIlllIIlIIlIlIII];
            if (e.lIlIIlIIIIlllI(llllllllllllllllIIlllIIlIIlIIlll.p().contains(llllllllllllllllIIlllIIlIIlIlIll) ? 1 : 0)) {
                return llllllllllllllllIIlllIIlIIlIIlll;
            }
            ++llllllllllllllllIIlllIIlIIlIlIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return null;
    }

    private static void lIlIIIllllIlII() {
        llIIlllllII = new int[27];
        e.llIIlllllII[0] = (0x83 ^ 0x8E) & ~(0xCC ^ 0xC1);
        e.llIIlllllII[1] = 0xFFFFEFBF & 0x7AFF;
        e.llIIlllllII[2] = -" ".length() & (0xFFFFEAC3 & 0x7FFD);
        e.llIIlllllII[3] = 0xFFFFEEE7 & 0x7BDB;
        e.llIIlllllII[4] = -(0xFFFFD46F & 0x3F9B) & (0xFFFFFECF & Short.MAX_VALUE);
        e.llIIlllllII[5] = " ".length();
        e.llIIlllllII[6] = 0xFFFFEFFB & 0x7AB7;
        e.llIIlllllII[7] = 0xFFFFEBF5 & 0x7EBF;
        e.llIIlllllII[8] = 0xFFFFFBF7 & 0x6EBF;
        e.llIIlllllII[9] = -(0xFFFFF84F & 0x17F5) & (0xFFFFFBFF & 0x7EFD);
        e.llIIlllllII[10] = "  ".length();
        e.llIIlllllII[11] = -(0xFFFFBDFD & 0x5603) & (0xFFFFFEFF & 0x7FCF);
        e.llIIlllllII[12] = 0xFFFFFAF7 & 0x6FD9;
        e.llIIlllllII[13] = "   ".length();
        e.llIIlllllII[14] = -(0xFFFFD015 & 0x3FFF) & (0xFFFFFBFF & 0x7EDF);
        e.llIIlllllII[15] = 0xFFFFFFFF & 0x6ACD;
        e.llIIlllllII[16] = 90 + 125 - 154 + 133 ^ 107 + 79 - 162 + 174;
        e.llIIlllllII[17] = -(0xFFFFB777 & 0x5CA9) & (0xFFFFFEF3 & Short.MAX_VALUE);
        e.llIIlllllII[18] = -(0xFFFF9C6F & 0x77B9) & (0xFFFFFFFF & 0x7EFD);
        e.llIIlllllII[19] = 0x70 ^ 0x75;
        e.llIIlllllII[20] = 0xFFFFEBCF & 0x7EF7;
        e.llIIlllllII[21] = 0xFFFFEBFF & 0x7EC9;
        e.llIIlllllII[22] = 0x96 ^ 0x90;
        e.llIIlllllII[23] = 0xFFFFFEBB & 0x6BFF;
        e.llIIlllllII[24] = -(0xFFFFC95B & 0x37A7) & (0xFFFFEBBF & Short.MAX_VALUE);
        e.llIIlllllII[25] = 0x94 ^ 0x93;
        e.llIIlllllII[26] = 0x6D ^ 0x65;
    }

    private static boolean lIlIIlIIIIlllI(int n2) {
        return n2 != 0;
    }

    private e(List<Integer> list) {
        this.ids = list;
    }

    public boolean d(int n2) {
        return this.ids.contains(n2);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.lIlIIIllllIlII();
        e.lIlIIIllllIIll();
        TEARS_OF_ELIDINIS = new e(List.of(Integer.valueOf(llIIlllllII[1]), Integer.valueOf(llIIlllllII[2]), Integer.valueOf(llIIlllllII[3]), Integer.valueOf(llIIlllllII[4])));
        NECTAR = new e(List.of(Integer.valueOf(llIIlllllII[6]), Integer.valueOf(llIIlllllII[7]), Integer.valueOf(llIIlllllII[8]), Integer.valueOf(llIIlllllII[9])));
        SMELLING_SALTS = new e(List.of(Integer.valueOf(llIIlllllII[11]), Integer.valueOf(llIIlllllII[12])));
        LIQUID_ADRENALINE = new e(List.of(Integer.valueOf(llIIlllllII[14]), Integer.valueOf(llIIlllllII[15])));
        AMBROSIA = new e(List.of(Integer.valueOf(llIIlllllII[17]), Integer.valueOf(llIIlllllII[18])));
        BLESSED_CRYSTAL_SCARAB = new e(List.of(Integer.valueOf(llIIlllllII[20]), Integer.valueOf(llIIlllllII[21])));
        SILK_DRESSING = new e(List.of(Integer.valueOf(llIIlllllII[23]), Integer.valueOf(llIIlllllII[24])));
        e[] eArray = new e[llIIlllllII[25]];
        eArray[e.llIIlllllII[0]] = TEARS_OF_ELIDINIS;
        eArray[e.llIIlllllII[5]] = NECTAR;
        eArray[e.llIIlllllII[10]] = SMELLING_SALTS;
        eArray[e.llIIlllllII[13]] = LIQUID_ADRENALINE;
        eArray[e.llIIlllllII[16]] = AMBROSIA;
        eArray[e.llIIlllllII[19]] = BLESSED_CRYSTAL_SCARAB;
        eArray[e.llIIlllllII[22]] = SILK_DRESSING;
        $VALUES = eArray;
    }

    private static String lIlIIIllllIIII(String llllllllllllllllIIlllIIIlllllIII, String llllllllllllllllIIlllIIIllllIlll) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIIIllllllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIIIllllllII.init(llIIlllllII[10], llllllllllllllllIIlllIIIllllllIl);
            return new String(llllllllllllllllIIlllIIIllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIIlllllIll) {
            llllllllllllllllIIlllIIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIllllIIIl(String llllllllllllllllIIlllIIlIIIlllII, String llllllllllllllllIIlllIIlIIIlIllI) {
        llllllllllllllllIIlllIIlIIIlllII = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIIlIIIllIlI = new StringBuilder();
        char[] llllllllllllllllIIlllIIlIIIllIIl = llllllllllllllllIIlllIIlIIIlIllI.toCharArray();
        int llllllllllllllllIIlllIIlIIIllIII = llIIlllllII[0];
        char[] llllllllllllllllIIlllIIlIIIlIIlI = llllllllllllllllIIlllIIlIIIlllII.toCharArray();
        int llllllllllllllllIIlllIIlIIIlIIIl = llllllllllllllllIIlllIIlIIIlIIlI.length;
        int llllllllllllllllIIlllIIlIIIlIIII = llIIlllllII[0];
        while (e.lIlIIlIIIIllIl(llllllllllllllllIIlllIIlIIIlIIII, llllllllllllllllIIlllIIlIIIlIIIl)) {
            char llllllllllllllllIIlllIIlIIIlllIl = llllllllllllllllIIlllIIlIIIlIIlI[llllllllllllllllIIlllIIlIIIlIIII];
            llllllllllllllllIIlllIIlIIIllIlI.append((char)(llllllllllllllllIIlllIIlIIIlllIl ^ llllllllllllllllIIlllIIlIIIllIIl[llllllllllllllllIIlllIIlIIIllIII % llllllllllllllllIIlllIIlIIIllIIl.length]));
            "".length();
            ++llllllllllllllllIIlllIIlIIIllIII;
            ++llllllllllllllllIIlllIIlIIIlIIII;
            "".length();
            if ("   ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIIlIIIllIlI);
    }

    private static String lIlIIIllllIIlI(String llllllllllllllllIIlllIIlIIIIIlIl, String llllllllllllllllIIlllIIlIIIIIllI) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIlIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), llIIlllllII[26]), "DES");
            Cipher llllllllllllllllIIlllIIlIIIIlIIl = Cipher.getInstance("DES");
            llllllllllllllllIIlllIIlIIIIlIIl.init(llIIlllllII[10], llllllllllllllllIIlllIIlIIIIlIlI);
            return new String(llllllllllllllllIIlllIIlIIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIlIIIIlIII) {
            llllllllllllllllIIlllIIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllllIIll() {
        llIIllllIll = new String[llIIlllllII[25]];
        e.llIIllllIll[e.llIIlllllII[0]] = e.lIlIIIllllIIII("2EfWL05kWwh+/uztxnIOgwviqPk1dyLU", "Iuiqc");
        e.llIIllllIll[e.llIIlllllII[5]] = e.lIlIIIllllIIIl("KysCHCs3", "enAHj");
        e.llIIllllIll[e.llIIlllllII[10]] = e.lIlIIIllllIIIl("OxwjHRUhHyEOCikdMgI=", "hQfQY");
        e.llIIllllIll[e.llIIlllllII[13]] = e.lIlIIIllllIIII("CwSim2M5/a9p6vtdQZZTsz3tIfAGj4uA", "ClJuz");
        e.llIIllllIll[e.llIIlllllII[16]] = e.lIlIIIllllIIlI("LCYUtRybeo6tv9RVVqkM/Q==", "mNTfU");
        e.llIIllllIll[e.llIIlllllII[19]] = e.lIlIIIllllIIII("LgwssUWhp9tIAhNafnLt+hDXWTHZl3O7", "nkjqD");
        e.llIIllllIll[e.llIIlllllII[22]] = e.lIlIIIllllIIIl("Bwc0LQsQHD01Bx0APw==", "TNxfT");
    }

    public List<Integer> p() {
        return this.ids;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }
}

