/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;

public final class K
extends Enum<K> {
    private static /* synthetic */ int[] llIIIllIIIIl;
    public static final /* synthetic */ /* enum */ K EMPTY_BUCKET;
    public static final /* synthetic */ /* enum */ K SUPER_COMPOST;
    private final /* synthetic */ int child;
    public static final /* synthetic */ /* enum */ K SEED_DIBBER;
    private static final /* synthetic */ K[] $VALUES;
    public static final /* synthetic */ /* enum */ K COMPOST;
    private static /* synthetic */ String[] llIIIllIIIII;
    public static final /* synthetic */ /* enum */ K PLANT_CURE;
    public static final /* synthetic */ /* enum */ K ULTRA_COMPOST;
    public static final /* synthetic */ /* enum */ K RAKE;
    public static final /* synthetic */ /* enum */ K SPADE;
    private final /* synthetic */ int inventoryChild;
    public static final /* synthetic */ /* enum */ K SECATEURS;
    private final /* synthetic */ int[] itemIds;
    public static final /* synthetic */ /* enum */ K BOTTOMLESS_BUCKET;

    private K(int n3, int n4, int ... nArray) {
        this.inventoryChild = n4;
        this.child = n3;
        this.itemIds = nArray;
    }

    public int aF() {
        return this.child;
    }

    private static boolean llllIlIllIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llllIlIllIlIIl() {
        llIIIllIIIII = new String[llIIIllIIIIl[11]];
        K.llIIIllIIIII[K.llIIIllIIIIl[0]] = K.llllIlIllIIllI("SSKnyW5885rzfvCSekG8YQ==", "kCVWh");
        K.llIIIllIIIII[K.llIIIllIIIIl[1]] = K.llllIlIllIIllI("/Ft9vOS5Uls=", "dOFlZ");
        K.llIIIllIIIII[K.llIIIllIIIIl[4]] = K.llllIlIllIIllI("NpJhNZBh1AzngOvmUY9QuQ==", "eABBd");
        K.llIIIllIIIII[K.llIIIllIIIIl[7]] = K.llllIlIllIIlll("FyQtIAg=", "DtldM");
        K.llIIIllIIIII[K.llIIIllIIIIl[10]] = K.llllIlIllIIlll("FhUbMwIABQoh", "EPXrV");
        K.llIIIllIIIII[K.llIIIllIIIIl[14]] = K.llllIlIllIIlll("NR4HHQA6ERMBEQ==", "eRFST");
        K.llIIIllIIIII[K.llIIIllIIIIl[18]] = K.llllIlIllIIlll("NDwbIy07PwokMSkxGjQpMyc=", "vsOwb");
        K.llIIIllIIIII[K.llIIIllIIIIl[16]] = K.llllIlIllIIllI("b87KRlH0y3TYKVxPTsnggQ==", "EdHNC");
        K.llIIIllIIIII[K.llIIIllIIIIl[2]] = K.llllIlIllIlIII("vTJhgFN2Emo=", "wckeK");
        K.llIIIllIIIII[K.llIIIllIIIIl[5]] = K.llllIlIllIIlll("KTEVHQMlJwoVATU3EQ==", "zdEXQ");
        K.llIIIllIIIII[K.llIIIllIIIIl[8]] = K.llllIlIllIIllI("lD/le2o30YeVljBLFGV4Vg==", "pTyNy");
    }

    public static K[] values() {
        return (K[])$VALUES.clone();
    }

    private static String llllIlIllIlIII(String lllllllllllllllIlIlIIlIIlIlllIIl, String lllllllllllllllIlIlIIlIIlIlllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIIlIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIlIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIIlIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIIlIlllIll.init(llIIIllIIIIl[4], lllllllllllllllIlIlIIlIIlIllllII);
            return new String(lllllllllllllllIlIlIIlIIlIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIIlIlllIlI) {
            lllllllllllllllIlIlIIlIIlIlllIlI.printStackTrace();
            return null;
        }
    }

    public int[] aH() {
        return this.itemIds;
    }

    public int aG() {
        return this.inventoryChild;
    }

    private static String llllIlIllIIlll(String lllllllllllllllIlIlIIlIIllIIlllI, String lllllllllllllllIlIlIIlIIllIIllIl) {
        lllllllllllllllIlIlIIlIIllIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIlIIllIIllII = new StringBuilder();
        char[] lllllllllllllllIlIlIIlIIllIIlIll = lllllllllllllllIlIlIIlIIllIIllIl.toCharArray();
        int lllllllllllllllIlIlIIlIIllIIlIlI = llIIIllIIIIl[0];
        char[] lllllllllllllllIlIlIIlIIllIIIlII = lllllllllllllllIlIlIIlIIllIIlllI.toCharArray();
        int lllllllllllllllIlIlIIlIIllIIIIll = lllllllllllllllIlIlIIlIIllIIIlII.length;
        int lllllllllllllllIlIlIIlIIllIIIIlI = llIIIllIIIIl[0];
        while (K.llllIlIllIlIll(lllllllllllllllIlIlIIlIIllIIIIlI, lllllllllllllllIlIlIIlIIllIIIIll)) {
            char lllllllllllllllIlIlIIlIIllIIllll = lllllllllllllllIlIlIIlIIllIIIlII[lllllllllllllllIlIlIIlIIllIIIIlI];
            lllllllllllllllIlIlIIlIIllIIllII.append((char)(lllllllllllllllIlIlIIlIIllIIllll ^ lllllllllllllllIlIlIIlIIllIIlIll[lllllllllllllllIlIlIIlIIllIIlIlI % lllllllllllllllIlIlIIlIIllIIlIll.length]));
            "".length();
            ++lllllllllllllllIlIlIIlIIllIIlIlI;
            ++lllllllllllllllIlIlIIlIIllIIIIlI;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIlIIllIIllII);
    }

    private static String llllIlIllIIllI(String lllllllllllllllIlIlIIlIIlIlIlIlI, String lllllllllllllllIlIlIIlIIlIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIIlIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), llIIIllIIIIl[2]), "DES");
            Cipher lllllllllllllllIlIlIIlIIlIlIlllI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlIIlIlIlllI.init(llIIIllIIIIl[4], lllllllllllllllIlIlIIlIIlIlIllll);
            return new String(lllllllllllllllIlIlIIlIIlIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIIlIlIllIl) {
            lllllllllllllllIlIlIIlIIlIlIllIl.printStackTrace();
            return null;
        }
    }

    static {
        K.llllIlIllIlIlI();
        K.llllIlIllIlIIl();
        int[] nArray = new int[llIIIllIIIIl[1]];
        nArray[K.llIIIllIIIIl[0]] = llIIIllIIIIl[3];
        RAKE = new K(llIIIllIIIIl[2], llIIIllIIIIl[1], nArray);
        int[] nArray2 = new int[llIIIllIIIIl[1]];
        nArray2[K.llIIIllIIIIl[0]] = llIIIllIIIIl[6];
        SEED_DIBBER = new K(llIIIllIIIIl[5], llIIIllIIIIl[4], nArray2);
        int[] nArray3 = new int[llIIIllIIIIl[1]];
        nArray3[K.llIIIllIIIIl[0]] = llIIIllIIIIl[9];
        SPADE = new K(llIIIllIIIIl[8], llIIIllIIIIl[7], nArray3);
        int[] nArray4 = new int[llIIIllIIIIl[4]];
        nArray4[K.llIIIllIIIIl[0]] = llIIIllIIIIl[12];
        nArray4[K.llIIIllIIIIl[1]] = llIIIllIIIIl[13];
        SECATEURS = new K(llIIIllIIIIl[11], llIIIllIIIIl[10], nArray4);
        int[] nArray5 = new int[llIIIllIIIIl[1]];
        nArray5[K.llIIIllIIIIl[0]] = llIIIllIIIIl[17];
        PLANT_CURE = new K(llIIIllIIIIl[15], llIIIllIIIIl[16], nArray5);
        int[] nArray6 = new int[llIIIllIIIIl[1]];
        nArray6[K.llIIIllIIIIl[0]] = llIIIllIIIIl[20];
        BOTTOMLESS_BUCKET = new K(llIIIllIIIIl[19], llIIIllIIIIl[2], nArray6);
        int[] nArray7 = new int[llIIIllIIIIl[1]];
        nArray7[K.llIIIllIIIIl[0]] = llIIIllIIIIl[22];
        EMPTY_BUCKET = new K(llIIIllIIIIl[21], llIIIllIIIIl[5], nArray7);
        int[] nArray8 = new int[llIIIllIIIIl[1]];
        nArray8[K.llIIIllIIIIl[0]] = llIIIllIIIIl[24];
        COMPOST = new K(llIIIllIIIIl[23], llIIIllIIIIl[8], nArray8);
        int[] nArray9 = new int[llIIIllIIIIl[1]];
        nArray9[K.llIIIllIIIIl[0]] = llIIIllIIIIl[26];
        SUPER_COMPOST = new K(llIIIllIIIIl[25], llIIIllIIIIl[11], nArray9);
        int[] nArray10 = new int[llIIIllIIIIl[1]];
        nArray10[K.llIIIllIIIIl[0]] = llIIIllIIIIl[29];
        ULTRA_COMPOST = new K(llIIIllIIIIl[27], llIIIllIIIIl[28], nArray10);
        K[] kArray = new K[llIIIllIIIIl[8]];
        kArray[K.llIIIllIIIIl[0]] = RAKE;
        kArray[K.llIIIllIIIIl[1]] = SEED_DIBBER;
        kArray[K.llIIIllIIIIl[4]] = SPADE;
        kArray[K.llIIIllIIIIl[7]] = SECATEURS;
        kArray[K.llIIIllIIIIl[10]] = PLANT_CURE;
        kArray[K.llIIIllIIIIl[14]] = BOTTOMLESS_BUCKET;
        kArray[K.llIIIllIIIIl[18]] = EMPTY_BUCKET;
        kArray[K.llIIIllIIIIl[16]] = COMPOST;
        kArray[K.llIIIllIIIIl[2]] = SUPER_COMPOST;
        kArray[K.llIIIllIIIIl[5]] = ULTRA_COMPOST;
        $VALUES = kArray;
    }

    public static K valueOf(String string) {
        return Enum.valueOf(K.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public static K d(Item item) {
        Item lllllllllllllllIlIlIIlIIlllIIIIl;
        void lllllllllllllllIlIlIIlIIllIlllll;
        K[] kArray = K.values();
        int n2 = kArray.length;
        int lllllllllllllllIlIlIIlIIllIllllI = llIIIllIIIIl[0];
        while (K.llllIlIllIlIll(lllllllllllllllIlIlIIlIIllIllllI, (int)lllllllllllllllIlIlIIlIIllIlllll)) {
            void lllllllllllllllIlIlIIlIIlllIIIII;
            void lllllllllllllllIlIlIIlIIllIlllIl = lllllllllllllllIlIlIIlIIlllIIIII[lllllllllllllllIlIlIIlIIllIllllI];
            int[] lllllllllllllllIlIlIIlIIllIlllII = lllllllllllllllIlIlIIlIIllIlllIl.itemIds;
            int lllllllllllllllIlIlIIlIIllIllIll = lllllllllllllllIlIlIIlIIllIlllII.length;
            int lllllllllllllllIlIlIIlIIllIllIlI = llIIIllIIIIl[0];
            while (K.llllIlIllIlIll(lllllllllllllllIlIlIIlIIllIllIlI, lllllllllllllllIlIlIIlIIllIllIll)) {
                int lllllllllllllllIlIlIIlIIllIllIIl = lllllllllllllllIlIlIIlIIllIlllII[lllllllllllllllIlIlIIlIIllIllIlI];
                if (K.llllIlIllIllII(lllllllllllllllIlIlIIlIIlllIIIIl.getId(), lllllllllllllllIlIlIIlIIllIllIIl)) {
                    return lllllllllllllllIlIlIIlIIllIlllIl;
                }
                ++lllllllllllllllIlIlIIlIIllIllIlI;
                "".length();
                if (null == null) continue;
                return null;
            }
            ++lllllllllllllllIlIlIIlIIllIllllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        if (K.llllIlIllIllIl(lllllllllllllllIlIlIIlIIlllIIIIl.getName().contains(llIIIllIIIII[llIIIllIIIIl[0]]) ? 1 : 0)) {
            return BOTTOMLESS_BUCKET;
        }
        return null;
    }

    private static boolean llllIlIllIllIl(int n2) {
        return n2 != 0;
    }

    private static void llllIlIllIlIlI() {
        llIIIllIIIIl = new int[30];
        K.llIIIllIIIIl[0] = (0xA6 ^ 0xC1 ^ (0x72 ^ 0x58)) & (0x4A ^ 0x4C ^ (0x2A ^ 0x61) ^ -" ".length());
        K.llIIIllIIIIl[1] = " ".length();
        K.llIIIllIIIIl[2] = 8 ^ 0;
        K.llIIIllIIIIl[3] = -(0xFFFFEF63 & 0x5BBF) & (0xFFFFDFFF & Short.MAX_VALUE);
        K.llIIIllIIIIl[4] = "  ".length();
        K.llIIIllIIIIl[5] = 0x82 ^ 0x8B;
        K.llIIIllIIIIl[6] = 0xFFFFFFFF & 0x14DF;
        K.llIIIllIIIIl[7] = "   ".length();
        K.llIIIllIIIIl[8] = 32 + 54 - -3 + 42 ^ 23 + 69 - 6 + 51;
        K.llIIIllIIIIl[9] = 0xFFFF93B8 & 0x6FFF;
        K.llIIIllIIIIl[10] = 0x8D ^ 0xC4 ^ (0xE2 ^ 0xAF);
        K.llIIIllIIIIl[11] = 0x1C ^ 0x17 ^ (0x7C ^ 0x1E) & ~(3 ^ 0x61);
        K.llIIIllIIIIl[12] = 0xFFFFFDF3 & 0x1EFD;
        K.llIIIllIIIIl[13] = -(0xFFFFDFED & 0x6A37) & (0xFFFFFFFD & 0x5EF7);
        K.llIIIllIIIIl[14] = 0x5D ^ 0x33 ^ (8 ^ 0x63);
        K.llIIIllIIIIl[15] = 0x16 ^ 0x60 ^ (0xFF ^ 0x87);
        K.llIIIllIIIIl[16] = 167 + 164 - 165 + 20 ^ 123 + 110 - 123 + 79;
        K.llIIIllIIIIl[17] = -(0xFFFFE3AE & 0x7C5D) & (0xFFFFF79F & Short.MAX_VALUE);
        K.llIIIllIIIIl[18] = 136 + 181 - 170 + 37 ^ 175 + 184 - 300 + 131;
        K.llIIIllIIIIl[19] = 0xB ^ 0x6C ^ (0xC8 ^ 0xA0);
        K.llIIIllIIIIl[20] = -(0xFFFFEE3B & 0x35ED) & (0xFFFFFFFF & 0x7DFD);
        K.llIIIllIIIIl[21] = 0x89 ^ 0x99;
        K.llIIIllIIIIl[22] = 0xFFFFC7DF & 0x3FA5;
        K.llIIIllIIIIl[23] = 0x60 ^ 0x7E ^ (0x65 ^ 0x6A);
        K.llIIIllIIIIl[24] = 0xFFFFF7B5 & 0x1FDA;
        K.llIIIllIIIIl[25] = 0xCA ^ 0x97 ^ (0x62 ^ 0x2D);
        K.llIIIllIIIIl[26] = 0xFFFFBF9E & 0x57F3;
        K.llIIIllIIIIl[27] = 0xEB ^ 0x9F ^ (4 ^ 0x63);
        K.llIIIllIIIIl[28] = 0x5C ^ 0x50;
        K.llIIIllIIIIl[29] = 0xFFFFFBFF & 0x57EB;
    }

    private static boolean llllIlIllIlIll(int n2, int n3) {
        return n2 < n3;
    }
}

