/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;

public final class Z
extends Enum<Z> {
    public static final /* synthetic */ /* enum */ Z WALLASALKI;
    public static final /* synthetic */ /* enum */ Z HELL_HOUND_TESTING;
    public static final /* synthetic */ /* enum */ Z DAGANNOTH_RANGE;
    private static /* synthetic */ int[] lIlllIll;
    private static /* synthetic */ String[] lIlllIIl;
    public static final /* synthetic */ /* enum */ Z PRIME;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ Z GIANT_ROCK_CRAB;
    private final /* synthetic */ int animation;
    public static final /* synthetic */ /* enum */ Z REX;
    private static final /* synthetic */ Z[] $VALUES;
    private final /* synthetic */ Prayer protection;
    public static final /* synthetic */ /* enum */ Z DAGANNOTH_RANGE2;
    public static final /* synthetic */ /* enum */ Z ROCK_LOBSTER;
    public static final /* synthetic */ /* enum */ Z DAGANNOTH;
    public static final /* synthetic */ /* enum */ Z SUPREME;

    private static boolean lIlIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    public static Z valueOf(String string) {
        return Enum.valueOf(Z.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public static Z h(NPC nPC) {
        void llIlllIIlIIlIIl;
        Z[] zArray = Z.values();
        int n2 = zArray.length;
        int llIlllIIlIIlIII = lIlllIll[0];
        while (Z.lIlIIlllll(llIlllIIlIIlIII, (int)llIlllIIlIIlIIl)) {
            NPC llIlllIIlIIlIll;
            void llIlllIIlIIlIlI;
            void llIlllIIlIIIlll = llIlllIIlIIlIlI[llIlllIIlIIlIII];
            if (Z.lIlIlIIIII(llIlllIIlIIIlll.P(), llIlllIIlIIlIll.getId())) {
                return llIlllIIlIIIlll;
            }
            ++llIlllIIlIIlIII;
            0;
            if (3 > 1) continue;
            return null;
        }
        return null;
    }

    public int ba() {
        return this.animation;
    }

    private static String lIlIIlIIII(String llIlllIIIllllIl, String llIlllIIIlllllI) {
        try {
            SecretKeySpec llIlllIIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllIIlIIIIIl = Cipher.getInstance("Blowfish");
            llIlllIIlIIIIIl.init(lIlllIll[6], llIlllIIlIIIIlI);
            return new String(llIlllIIlIIIIIl.doFinal(Base64.getDecoder().decode(llIlllIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIIlIIIIII) {
            llIlllIIlIIIIII.printStackTrace();
            return null;
        }
    }

    public Prayer aZ() {
        return this.protection;
    }

    private static void lIlIIllllI() {
        lIlllIll = new int[30];
        Z.lIlllIll[0] = (66 + 112 - 46 + 16 ^ 133 + 57 - 99 + 99) & (0xD2 ^ 0xB1 ^ (0xC4 ^ 0x8D) ^ -1);
        Z.lIlllIll[1] = -(0xFFFFBF65 & 0x73BB) & (0xFFFFBBFF & 0x7FFB);
        Z.lIlllIll[2] = -(0xFFFFB8E1 & 0x779F) & (0xFFFFBBBD & 0x7FE7);
        Z.lIlllIll[3] = 1;
        Z.lIlllIll[4] = -(0xFFFFEDFB & 0x3726) & (0xFFFFADFB & Short.MAX_VALUE);
        Z.lIlllIll[5] = -(0xFFFFFCFF & 0x4709) & (0xFFFFDF6E & 0x6FBF);
        Z.lIlllIll[6] = 2;
        Z.lIlllIll[7] = 0xFFFFE8F9 & 0x1FDF;
        Z.lIlllIll[8] = -(0xFFFFF49F & 0x6FF9) & (0xFFFFFFBF & 0x6FFF);
        Z.lIlllIll[9] = 3;
        Z.lIlllIll[10] = 0xFFFFADFD & 0x5E73;
        Z.lIlllIll[11] = -(0xFFFFDECD & 0x33B3) & (0xFFFFF7FD & 0x1FBF);
        Z.lIlllIll[12] = 9 ^ 0xD ^ (0x8B ^ 0x9A) & ~(0x4D ^ 0x5C);
        Z.lIlllIll[13] = -(0xFFFFB63F & 0x7BEB) & (0xFFFFBEFF & 0x7BFF);
        Z.lIlllIll[14] = 0xFFFF9FD8 & 0x6967;
        Z.lIlllIll[15] = 0x54 ^ 0x20 ^ (0xEC ^ 0x9D);
        Z.lIlllIll[16] = -(0xFFFFEDF9 & 0x7A4F) & (0xFFFFFF7F & 0x7FFB);
        Z.lIlllIll[17] = -(0xFFFFF6C3 & 0x4B3F) & (0xFFFFCB7F & 0x7FBF);
        Z.lIlllIll[18] = 0xB8 ^ 0xB7 ^ (0 ^ 9);
        Z.lIlllIll[19] = -(0xFFFFFBEE & 0x44DB) & (0xFFFFDFFF & 0x77FF);
        Z.lIlllIll[20] = 0xFFFFEDBF & 0x177F;
        Z.lIlllIll[21] = 0x69 ^ 0x6E;
        Z.lIlllIll[22] = 0xFFFFB73F & 0x5FF7;
        Z.lIlllIll[23] = 0x4F ^ 0x33 ^ (0x67 ^ 0x13);
        Z.lIlllIll[24] = -(0xFFFFEEFD & 0x7103) & (0xFFFFF7FA & 0x7F3D);
        Z.lIlllIll[25] = -(0xFFFFF655 & 0x7DFF) & (0xFFFFFF7F & Short.MAX_VALUE);
        Z.lIlllIll[26] = 0x32 ^ 0x3B;
        Z.lIlllIll[27] = 0x45 ^ 0x2D;
        Z.lIlllIll[28] = -(0xFFFFFD76 & 0x66CF) & (0xFFFFFDEF & 0x7FF7);
        Z.lIlllIll[29] = 0x85 ^ 0x8F;
    }

    private Z(int n3, Prayer prayer, int n4) {
        this.id = n3;
        this.protection = prayer;
        this.animation = n4;
    }

    public static Z[] values() {
        return (Z[])$VALUES.clone();
    }

    private static String lIlIIllIII(String llIlllIIIlIIIlI, String llIlllIIIIlllII) {
        llIlllIIIlIIIlI = new String(Base64.getDecoder().decode(llIlllIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIIIlIIIII = new StringBuilder();
        char[] llIlllIIIIlllll = llIlllIIIIlllII.toCharArray();
        int llIlllIIIIllllI = lIlllIll[0];
        char[] llIlllIIIIllIII = llIlllIIIlIIIlI.toCharArray();
        int llIlllIIIIlIlll = llIlllIIIIllIII.length;
        int llIlllIIIIlIllI = lIlllIll[0];
        while (Z.lIlIIlllll(llIlllIIIIlIllI, llIlllIIIIlIlll)) {
            char llIlllIIIlIIIll = llIlllIIIIllIII[llIlllIIIIlIllI];
            llIlllIIIlIIIII.append((char)(llIlllIIIlIIIll ^ llIlllIIIIlllll[llIlllIIIIllllI % llIlllIIIIlllll.length]));
            0;
            ++llIlllIIIIllllI;
            ++llIlllIIIIlIllI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llIlllIIIlIIIII);
    }

    public int P() {
        return this.id;
    }

    private static void lIlIIllIlI() {
        lIlllIIl = new String[lIlllIll[29]];
        Z.lIlllIIl[Z.lIlllIll[0]] = Z."REX";
        Z.lIlllIIl[Z.lIlllIll[3]] = Z."PRIME";
        Z.lIlllIIl[Z.lIlllIll[6]] = Z."SUPREME";
        Z.lIlllIIl[Z.lIlllIll[9]] = Z."DAGANNOTH";
        Z.lIlllIIl[Z.lIlllIll[12]] = Z."GIANT_ROCK_CRAB";
        Z.lIlllIIl[Z.lIlllIll[15]] = Z."WALLASALKI";
        Z.lIlllIIl[Z.lIlllIll[18]] = Z."DAGANNOTH_RANGE";
        Z.lIlllIIl[Z.lIlllIll[21]] = Z."DAGANNOTH_RANGE2";
        Z.lIlllIIl[Z.lIlllIll[23]] = Z."ROCK_LOBSTER";
        Z.lIlllIIl[Z.lIlllIll[26]] = Z."HELL_HOUND_TESTING";
    }

    static {
        Z.lIlIIllllI();
        Z.lIlIIllIlI();
        REX = new Z(lIlllIll[1], Prayer.PROTECT_FROM_MELEE, lIlllIll[2]);
        PRIME = new Z(lIlllIll[4], Prayer.PROTECT_FROM_MAGIC, lIlllIll[5]);
        SUPREME = new Z(lIlllIll[7], Prayer.PROTECT_FROM_MISSILES, lIlllIll[8]);
        DAGANNOTH = new Z(lIlllIll[10], Prayer.PROTECT_FROM_MELEE, lIlllIll[11]);
        GIANT_ROCK_CRAB = new Z(lIlllIll[13], Prayer.PROTECT_FROM_MELEE, lIlllIll[14]);
        WALLASALKI = new Z(lIlllIll[16], Prayer.PROTECT_FROM_MAGIC, lIlllIll[17]);
        DAGANNOTH_RANGE = new Z(lIlllIll[19], Prayer.PROTECT_FROM_MISSILES, lIlllIll[20]);
        DAGANNOTH_RANGE2 = new Z(lIlllIll[22], Prayer.PROTECT_FROM_MISSILES, lIlllIll[11]);
        ROCK_LOBSTER = new Z(lIlllIll[24], Prayer.PROTECT_FROM_MELEE, lIlllIll[25]);
        HELL_HOUND_TESTING = new Z(lIlllIll[27], Prayer.PROTECT_FROM_MELEE, lIlllIll[28]);
        Z[] zArray = new Z[lIlllIll[29]];
        zArray[Z.lIlllIll[0]] = REX;
        zArray[Z.lIlllIll[3]] = PRIME;
        zArray[Z.lIlllIll[6]] = SUPREME;
        zArray[Z.lIlllIll[9]] = DAGANNOTH;
        zArray[Z.lIlllIll[12]] = GIANT_ROCK_CRAB;
        zArray[Z.lIlllIll[15]] = WALLASALKI;
        zArray[Z.lIlllIll[18]] = DAGANNOTH_RANGE;
        zArray[Z.lIlllIll[21]] = DAGANNOTH_RANGE2;
        zArray[Z.lIlllIll[23]] = ROCK_LOBSTER;
        zArray[Z.lIlllIll[26]] = HELL_HOUND_TESTING;
        $VALUES = zArray;
    }

    private static boolean lIlIlIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIlIIIl(String llIlllIIIllIIII, String llIlllIIIllIIIl) {
        try {
            SecretKeySpec llIlllIIIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIll[23]), "DES");
            Cipher llIlllIIIllIlII = Cipher.getInstance("DES");
            llIlllIIIllIlII.init(lIlllIll[6], llIlllIIIllIlIl);
            return new String(llIlllIIIllIlII.doFinal(Base64.getDecoder().decode(llIlllIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIIIllIIll) {
            llIlllIIIllIIll.printStackTrace();
            return null;
        }
    }
}

