/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;

public final class i
extends Enum<i> {
    public static final /* synthetic */ /* enum */ i BARK;
    public static final /* synthetic */ /* enum */ i HERB;
    private static /* synthetic */ int[] llIIllIIIIll;
    public static final /* synthetic */ /* enum */ i ORE;
    public static final /* synthetic */ /* enum */ i FISH;
    private final /* synthetic */ int normalToolId;
    private final /* synthetic */ int corruptedToolId;
    public static final /* synthetic */ /* enum */ i WOOL;
    private final /* synthetic */ int normalObjectId;
    private static /* synthetic */ String[] llIIllIIIIlI;
    public static final /* synthetic */ /* enum */ i CRYSTAL_ORB;
    public static final /* synthetic */ /* enum */ i CRYSTALLINE_BOWSTRING;
    private final /* synthetic */ int corruptedObjectId;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ /* enum */ i CRYSTAL_SHARD;
    private final /* synthetic */ int normalItemId;
    private final /* synthetic */ int corruptedItemId;
    public static final /* synthetic */ /* enum */ i CRYSTAL_DUST;
    public static final /* synthetic */ /* enum */ i WEAPON_FRAME;

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    public List<Integer> aA() {
        return List.of(Integer.valueOf(this.normalItemId), Integer.valueOf(this.corruptedItemId));
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private i(int n3, int n4, int n5, int n6, int n7, int n8) {
        this.normalToolId = n3;
        this.normalItemId = n4;
        this.normalObjectId = n5;
        this.corruptedToolId = n6;
        this.corruptedItemId = n7;
        this.corruptedObjectId = n8;
    }

    private static String llllllIIlIllIl(String lllllllllllllllIlIIlIlllIlIIIlIl, String lllllllllllllllIlIIlIlllIlIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllIlIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllIlIIIlll.init(llIIllIIIIll[3], lllllllllllllllIlIIlIlllIlIIlIII);
            return new String(lllllllllllllllIlIIlIlllIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlllIlIIIllI) {
            lllllllllllllllIlIIlIlllIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static String llllllIIlIllII(String lllllllllllllllIlIIlIlllIlIllIlI, String lllllllllllllllIlIIlIlllIlIlIlII) {
        lllllllllllllllIlIIlIlllIlIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIlIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlllIlIllIII = new StringBuilder();
        char[] lllllllllllllllIlIIlIlllIlIlIlll = lllllllllllllllIlIIlIlllIlIlIlII.toCharArray();
        int lllllllllllllllIlIIlIlllIlIlIllI = llIIllIIIIll[2];
        char[] lllllllllllllllIlIIlIlllIlIlIIII = lllllllllllllllIlIIlIlllIlIllIlI.toCharArray();
        int lllllllllllllllIlIIlIlllIlIIllll = lllllllllllllllIlIIlIlllIlIlIIII.length;
        int lllllllllllllllIlIIlIlllIlIIlllI = llIIllIIIIll[2];
        while (i.llllllIIllIIlI(lllllllllllllllIlIIlIlllIlIIlllI, lllllllllllllllIlIIlIlllIlIIllll)) {
            char lllllllllllllllIlIIlIlllIlIllIll = lllllllllllllllIlIIlIlllIlIlIIII[lllllllllllllllIlIIlIlllIlIIlllI];
            lllllllllllllllIlIIlIlllIlIllIII.append((char)(lllllllllllllllIlIIlIlllIlIllIll ^ lllllllllllllllIlIIlIlllIlIlIlll[lllllllllllllllIlIIlIlllIlIlIllI % lllllllllllllllIlIIlIlllIlIlIlll.length]));
            "".length();
            ++lllllllllllllllIlIIlIlllIlIlIllI;
            ++lllllllllllllllIlIIlIlllIlIIlllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIlllIlIllIII);
    }

    private static void llllllIIlIllll() {
        llIIllIIIIlI = new String[llIIllIIIIll[46]];
        i.llIIllIIIIlI[i.llIIllIIIIll[2]] = i.llllllIIlIllII("KSA/", "frzpG");
        i.llIIllIIIIlI[i.llIIllIIIIll[1]] = i.llllllIIlIllII("BAAbKQ==", "LEIks");
        i.llIIllIIIIlI[i.llIIllIIIIll[3]] = i.llllllIIlIllII("NAc7FQ==", "cHtYr");
        i.llIIllIIIIlI[i.llIIllIIIIll[18]] = i.llllllIIlIllII("FCgoKQ==", "Vizbl");
        i.llIIllIIIIlI[i.llIIllIIIIll[25]] = i.llllllIIlIllII("CT4AMg==", "OwSzv");
        i.llIIllIIIIlI[i.llIIllIIIIll[31]] = i.llllllIIlIllIl("iLbDSPPxFtP8hTMMgxw64Q==", "tQLJv");
        i.llIIllIIIIlI[i.llIIllIIIIll[34]] = i.llllllIIlIllIl("duZxP5OKPiuz0b7HX/R39g==", "DBFjg");
        i.llIIllIIIIlI[i.llIIllIIIIll[37]] = i.llllllIIlIllIl("JHZqfkm8842TNEA4cAP6EQ==", "jsLrI");
        i.llIIllIIIIlI[i.llIIllIIIIll[40]] = i.llllllIIlIlllI("ii3m4agwCwFUWerrPmNCBA==", "bGXCX");
        i.llIIllIIIIlI[i.llIIllIIIIll[43]] = i.llllllIIlIllIl("hkBRz7TY3Oy4OoLboYJDMzbUX0WwITc3", "nowqN");
    }

    private static void llllllIIllIIII() {
        llIIllIIIIll = new int[47];
        i.llIIllIIIIll[0] = -" ".length();
        i.llIIllIIIIll[1] = " ".length();
        i.llIIllIIIIll[2] = (0x1A ^ 0x49) & ~(0xE4 ^ 0xB7);
        i.llIIllIIIIll[3] = "  ".length();
        i.llIIllIIIIll[4] = 0xFFFFDDBF & 0x7F77;
        i.llIIllIIIIll[5] = -(0xFFFF9F77 & 0x62A9) & (0xFFFFFF7D & 0x5FE7);
        i.llIIllIIIIll[6] = -(0xFFFFB75F & 0x5AB7) & (0xFFFF9EF6 & 0xFFFF);
        i.llIIllIIIIll[7] = -(0xFFFFECF3 & 0x33FD) & (0xFFFFFFFF & 0x7DFE);
        i.llIIllIIIIll[8] = -(0xFFFFAEB7 & 0x73EB) & (0xFFFFFFBF & Short.MAX_VALUE);
        i.llIIllIIIIll[9] = 0xFFFF8EFF & 0xFD7F;
        i.llIIllIIIIll[10] = -(0xFFFFE6EF & 0x399D) & (0xFFFFFDCF & Short.MAX_VALUE);
        i.llIIllIIIIll[11] = -(0xFFFFE7BA & 0x5847) & (0xFFFFCDFF & 0xFEE7);
        i.llIIllIIIIll[12] = -(0xFFFFEE3D & 0x13E3) & (0xFFFFFFFF & 0x5F3B);
        i.llIIllIIIIll[13] = -(0xFFFFF3F3 & 0x1F5D) & (0xFFFFBFD5 & 0xDFFF);
        i.llIIllIIIIll[14] = -(0xFFFFE9EB & 0x361F) & (0xFFFFFFCF & 0x7D7E);
        i.llIIllIIIIll[15] = 0xFFFFDEEC & 0xADFB;
        i.llIIllIIIIll[16] = -(0xFFFFB9BB & 0x6666) & (0xFFFFFF7F & 0x7DBD);
        i.llIIllIIIIll[17] = -(0xFFFFE67B & 0x7B8D) & (0xFFFFEEFF & 0xFF8F);
        i.llIIllIIIIll[18] = "   ".length();
        i.llIIllIIIIll[19] = 0xFFFFFF77 & 0x5DBE;
        i.llIIllIIIIll[20] = -(0xFFFFBE9E & 0x61FB) & (0xFFFFFDFF & 0x7FDF);
        i.llIIllIIIIll[21] = 0xFFFFBDFE & 0xCEE3;
        i.llIIllIIIIll[22] = 0xFFFFFD0F & 0x5FFD;
        i.llIIllIIIIll[23] = -(0xFFFFFAFF & 0x781) & (0xFFFFFFDF & 0x5FBE);
        i.llIIllIIIIll[24] = -(0xFFFFF3FD & 0x7D27) & (0xFFFFFFB7 & 0xFDED);
        i.llIIllIIIIll[25] = 0x5B ^ 0x57 ^ (0xCF ^ 0xC7);
        i.llIIllIIIIll[26] = 0xFFFFDFBF & 0x7D78;
        i.llIIllIIIIll[27] = 0xFFFFFDE9 & 0x5F56;
        i.llIIllIIIIll[28] = -(0xFFFFF377 & 0x7F8C) & (0xFFFFFFF7 & 0xFFEF);
        i.llIIllIIIIll[29] = -(0xFFFFA4D9 & 0x7B67) & (0xFFFFFD7F & 0x7FCF);
        i.llIIllIIIIll[30] = -(0xFFFFDD7D & 0x73EF) & (0xFFFFDFEF & 0xFDFF);
        i.llIIllIIIIll[31] = (0xF4 ^ 0xA5) & ~(0x93 ^ 0xC2) ^ (0x8F ^ 0x8A);
        i.llIIllIIIIll[32] = -(0xFFFF9A77 & 0x67CD) & (0xFFFFFF7F & 0x5FFE);
        i.llIIllIIIIll[33] = 0xFFFFFDB7 & 0x5F58;
        i.llIIllIIIIll[34] = 1 ^ 7;
        i.llIIllIIIIll[35] = -(0xFFFF8E75 & 0x738F) & (0xFFFFDF3F & Short.MAX_VALUE);
        i.llIIllIIIIll[36] = -(0xA5 ^ 0xAC) & (0xFFFFDFBE & 0x7D5F);
        i.llIIllIIIIll[37] = 0x2C ^ 0x2B;
        i.llIIllIIIIll[38] = 0xFFFFFFFF & 0x5D3F;
        i.llIIllIIIIll[39] = 0xFFFFFD3F & 0x5FDA;
        i.llIIllIIIIll[40] = 0x7B ^ 0x73;
        i.llIIllIIIIll[41] = 0xFFFFDFBF & 0x7D7E;
        i.llIIllIIIIll[42] = -(0xFFFFE7A7 & 0x1AFF) & (0xFFFFFFFF & 0x5FBF);
        i.llIIllIIIIll[43] = 7 ^ 0xE;
        i.llIIllIIIIll[44] = 0xFFFFDD3F & 0x7FFD;
        i.llIIllIIIIll[45] = -(0x28 ^ 0x40) & (0xFFFFFD7F & 0x5FFF);
        i.llIIllIIIIll[46] = 0xA8 ^ 0xC6 ^ (0x6C ^ 8);
    }

    private static boolean llllllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int aC() {
        return Inventory.getCount((boolean)llIIllIIIIll[1], (int[])this.aB());
    }

    public List<Integer> ay() {
        return List.of(Integer.valueOf(this.normalToolId), Integer.valueOf(this.corruptedToolId));
    }

    static {
        i.llllllIIllIIII();
        i.llllllIIlIllll();
        ORE = new i(llIIllIIIIll[4], llIIllIIIIll[5], llIIllIIIIll[6], llIIllIIIIll[7], llIIllIIIIll[8], llIIllIIIIll[9]);
        HERB = new i(llIIllIIIIll[0], llIIllIIIIll[10], llIIllIIIIll[11], llIIllIIIIll[0], llIIllIIIIll[12], llIIllIIIIll[13]);
        WOOL = new i(llIIllIIIIll[0], llIIllIIIIll[14], llIIllIIIIll[15], llIIllIIIIll[0], llIIllIIIIll[16], llIIllIIIIll[17]);
        BARK = new i(llIIllIIIIll[19], llIIllIIIIll[20], llIIllIIIIll[21], llIIllIIIIll[22], llIIllIIIIll[23], llIIllIIIIll[24]);
        FISH = new i(llIIllIIIIll[26], llIIllIIIIll[27], llIIllIIIIll[28], llIIllIIIIll[29], llIIllIIIIll[27], llIIllIIIIll[30]);
        CRYSTAL_SHARD = new i(llIIllIIIIll[0], llIIllIIIIll[32], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[33], llIIllIIIIll[0]);
        CRYSTAL_DUST = new i(llIIllIIIIll[0], llIIllIIIIll[35], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[36], llIIllIIIIll[0]);
        WEAPON_FRAME = new i(llIIllIIIIll[0], llIIllIIIIll[38], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[39], llIIllIIIIll[0]);
        CRYSTAL_ORB = new i(llIIllIIIIll[0], llIIllIIIIll[41], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[42], llIIllIIIIll[0]);
        CRYSTALLINE_BOWSTRING = new i(llIIllIIIIll[0], llIIllIIIIll[44], llIIllIIIIll[0], llIIllIIIIll[0], llIIllIIIIll[45], llIIllIIIIll[0]);
        i[] iArray = new i[llIIllIIIIll[46]];
        iArray[i.llIIllIIIIll[2]] = ORE;
        iArray[i.llIIllIIIIll[1]] = HERB;
        iArray[i.llIIllIIIIll[3]] = WOOL;
        iArray[i.llIIllIIIIll[18]] = BARK;
        iArray[i.llIIllIIIIll[25]] = FISH;
        iArray[i.llIIllIIIIll[31]] = CRYSTAL_SHARD;
        iArray[i.llIIllIIIIll[34]] = CRYSTAL_DUST;
        iArray[i.llIIllIIIIll[37]] = WEAPON_FRAME;
        iArray[i.llIIllIIIIll[40]] = CRYSTAL_ORB;
        iArray[i.llIIllIIIIll[43]] = CRYSTALLINE_BOWSTRING;
        $VALUES = iArray;
    }

    public boolean ax() {
        boolean bl;
        if (i.llllllIIllIIIl(this.normalToolId, llIIllIIIIll[0])) {
            bl = llIIllIIIIll[1];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x83 ^ 0xB9) & ~(0x62 ^ 0x58)) != 0;
            }
        } else {
            bl = llIIllIIIIll[2];
        }
        return bl;
    }

    public int[] aB() {
        int[] nArray = new int[llIIllIIIIll[3]];
        nArray[i.llIIllIIIIll[2]] = this.normalItemId;
        nArray[i.llIIllIIIIll[1]] = this.corruptedItemId;
        return nArray;
    }

    private static boolean llllllIIllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String llllllIIlIlllI(String lllllllllllllllIlIIlIlllIllIlIII, String lllllllllllllllIlIIlIlllIllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIllIIlll.getBytes(StandardCharsets.UTF_8)), llIIllIIIIll[40]), "DES");
            Cipher lllllllllllllllIlIIlIlllIllIllII = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlllIllIllII.init(llIIllIIIIll[3], lllllllllllllllIlIIlIlllIllIllIl);
            return new String(lllllllllllllllIlIIlIlllIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlllIllIlIll) {
            lllllllllllllllIlIIlIlllIllIlIll.printStackTrace();
            return null;
        }
    }

    public List<Integer> az() {
        return List.of(Integer.valueOf(this.normalObjectId), Integer.valueOf(this.corruptedObjectId));
    }
}

