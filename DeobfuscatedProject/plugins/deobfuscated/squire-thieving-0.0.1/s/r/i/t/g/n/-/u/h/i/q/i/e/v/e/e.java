/*
 * Decompiled with CFR 0.152.
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    private final /* synthetic */ int foodId;
    private static /* synthetic */ String[] lIIllIllIIIlI;
    public static final /* synthetic */ /* enum */ e DARK_CRAB;
    private static /* synthetic */ int[] lIIllIlllIIII;
    public static final /* synthetic */ /* enum */ e SWORDFISH;
    public static final /* synthetic */ /* enum */ e CHOCOLATE_CAKE;
    public static final /* synthetic */ /* enum */ e TUNA;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e SHRIMP;
    public static final /* synthetic */ /* enum */ e SARA_BREW;
    public static final /* synthetic */ /* enum */ e SUPER_RESTORE;
    public static final /* synthetic */ /* enum */ e CAKE;
    public static final /* synthetic */ /* enum */ e SEA_TURTLE;
    public static final /* synthetic */ /* enum */ e NONE;
    public static final /* synthetic */ /* enum */ e JANGERBERRIES;
    public static final /* synthetic */ /* enum */ e WINE;
    public static final /* synthetic */ /* enum */ e ANCIENT_BREW;
    public static final /* synthetic */ /* enum */ e SHARK;
    public static final /* synthetic */ /* enum */ e PLAIN_PIZZA;
    public static final /* synthetic */ /* enum */ e PRAYER_POTION;
    public static final /* synthetic */ /* enum */ e BASS;
    public static final /* synthetic */ /* enum */ e MONKFISH;
    public static final /* synthetic */ /* enum */ e ANGLERFISH;
    public static final /* synthetic */ /* enum */ e KARAMBWAN;
    public static final /* synthetic */ /* enum */ e MANTA_RAY;
    public static final /* synthetic */ /* enum */ e PINEAPPLE_PIZZA;
    public static final /* synthetic */ /* enum */ e LOBSTER;

    private static String lIllIIIllIIlIll(String llllllllllllllIlllIlllIlIIIIIlIl, String llllllllllllllIlllIlllIlIIIIlIIl) {
        llllllllllllllIlllIlllIlIIIIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIlIIIIlIII = new StringBuilder();
        char[] llllllllllllllIlllIlllIlIIIIIlll = llllllllllllllIlllIlllIlIIIIlIIl.toCharArray();
        int llllllllllllllIlllIlllIlIIIIIllI = lIIllIlllIIII[0];
        char[] llllllllllllllIlllIlllIlIIIIIIII = llllllllllllllIlllIlllIlIIIIIlIl.toCharArray();
        int llllllllllllllIlllIlllIIllllllll = llllllllllllllIlllIlllIlIIIIIIII.length;
        int llllllllllllllIlllIlllIIlllllllI = lIIllIlllIIII[0];
        while (e.lIllIIIllIIlllI(llllllllllllllIlllIlllIIlllllllI, llllllllllllllIlllIlllIIllllllll)) {
            char llllllllllllllIlllIlllIlIIIIlIll = llllllllllllllIlllIlllIlIIIIIIII[llllllllllllllIlllIlllIIlllllllI];
            llllllllllllllIlllIlllIlIIIIlIII.append((char)(llllllllllllllIlllIlllIlIIIIlIll ^ llllllllllllllIlllIlllIlIIIIIlll[llllllllllllllIlllIlllIlIIIIIllI % llllllllllllllIlllIlllIlIIIIIlll.length]));
            0;
            ++llllllllllllllIlllIlllIlIIIIIllI;
            ++llllllllllllllIlllIlllIIlllllllI;
            0;
            if ((0x99 ^ 0x9D) > ((0xB0 ^ 0xBA) & ~(0x5A ^ 0x50))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIlIIIIlIII);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void lIllIIIllIIllIl() {
        lIIllIlllIIII = new int[46];
        e.lIIllIlllIIII[0] = (159 + 162 - 295 + 142 ^ 85 + 120 - 97 + 43) & (2 ^ (0x7C ^ 0x41) ^ -1);
        e.lIIllIlllIIII[1] = 1;
        e.lIIllIlllIIII[2] = 0xFFFFC13B & 0x3FFF;
        e.lIIllIlllIIII[3] = 2;
        e.lIIllIlllIIII[4] = 0xFFFFAF73 & 0x57EF;
        e.lIIllIlllIIII[5] = 3;
        e.lIIllIlllIIII[6] = 0xFFFFD77D & 0x2FEB;
        e.lIIllIlllIIII[7] = 6 ^ 2;
        e.lIIllIlllIIII[8] = 0xFFFF98F3 & 0x6FFD;
        e.lIIllIlllIIII[9] = 0x32 ^ 0x64 ^ (0x3C ^ 0x6F);
        e.lIIllIlllIIII[10] = 0xFFFFE8FD & 0x1FFF;
        e.lIIllIlllIIII[11] = 43 + 80 - 37 + 45 ^ 40 + 112 - 134 + 115;
        e.lIIllIlllIIII[12] = -(0xFFFFFCF3 & 0x4B2F) & (0xFFFFDFFB & 0x6FEF);
        e.lIIllIlllIIII[13] = 2 ^ 5;
        e.lIIllIlllIIII[14] = -(0xFFFFBF9F & 0x5CE1) & (0xFFFFFDFF & 0x1FED);
        e.lIIllIlllIIII[15] = 72 + 170 - 94 + 42 ^ 164 + 15 - 147 + 150;
        e.lIIllIlllIIII[16] = -(0xFFFFAFFB & 0x5E97) & (0xFFFF9FFB & 0x6FFF);
        e.lIIllIlllIIII[17] = 0x2B ^ 0xA ^ (0x8B ^ 0xA3);
        e.lIIllIlllIIII[18] = -(0xFFFFAFF6 & 0x51BB) & (0xFFFFFFFF & 0xDF9);
        e.lIIllIlllIIII[19] = 0x7B ^ 0x21 ^ (0x78 ^ 0x28);
        e.lIIllIlllIIII[20] = -(0xFFFFAC6B & 0x7B95) & (0xFFFFAFFF & 0x797B);
        e.lIIllIlllIIII[21] = 0x8B ^ 0x80;
        e.lIIllIlllIIII[22] = -(0xFFFFFBE9 & 0x469F) & (0xFFFFC3FD & Short.MAX_VALUE);
        e.lIIllIlllIIII[23] = 84 + 201 - 165 + 84 ^ 130 + 113 - 166 + 115;
        e.lIIllIlllIIII[24] = -(0xFFFFEE35 & 0x51EF) & (0xFFFFDF2E & Short.MAX_VALUE);
        e.lIIllIlllIIII[25] = 0x2F ^ 0x33 ^ (0x43 ^ 0x52);
        e.lIIllIlllIIII[26] = -(0xFFFFFEFD & 0x311B) & (0xFFFFF59B & 0x3BFD);
        e.lIIllIlllIIII[27] = 0x1B ^ 0x15;
        e.lIIllIlllIIII[28] = 0xFFFFDFAF & 0x21DD;
        e.lIIllIlllIIII[29] = 71 + 115 - 68 + 9 ^ (0xE5 ^ 0x95);
        e.lIIllIlllIIII[30] = -(0xFFFFA559 & 0x5EFF) & (0xFFFFCDDF & 0x37FF);
        e.lIIllIlllIIII[31] = 0xF9 ^ 0xC3 ^ (0x6A ^ 0x40);
        e.lIIllIlllIIII[32] = -(0xFFFF83AF & 0x7D79) & (0xFFFFB7B9 & 0x7DEF);
        e.lIIllIlllIIII[33] = 0x91 ^ 0x87 ^ (0xC ^ 0xB);
        e.lIIllIlllIIII[34] = 0xFFFFFFEB & 0x2EB4;
        e.lIIllIlllIIII[35] = 0xB4 ^ 0xA6;
        e.lIIllIlllIIII[36] = -(0xFFFFD1EF & 0x6E11) & (0xFFFFDB7F & 0x7E9D);
        e.lIIllIlllIIII[37] = 0x8D ^ 0x9E;
        e.lIIllIlllIIII[38] = 0xFFFFFFFE & 0x66E5;
        e.lIIllIlllIIII[39] = 0x8D ^ 0x99;
        e.lIIllIlllIIII[40] = 53 + 0 - -194 + 0;
        e.lIIllIlllIIII[41] = 0x60 ^ 0x4C ^ (0x74 ^ 0x4D);
        e.lIIllIlllIIII[42] = -(0xFFFFFF0D & 0x44FF) & (0xFFFFDFDE & 0x6FFD);
        e.lIIllIlllIIII[43] = 0x8E ^ 0x98;
        e.lIIllIlllIIII[44] = 0xFFFFAFC2 & 0x59BF;
        e.lIIllIlllIIII[45] = 0x70 ^ 0x4C ^ (0xAB ^ 0x80);
    }

    private static String lIllIIIlIIIlIII(String llllllllllllllIlllIlllIIllllIIll, String llllllllllllllIlllIlllIIllllIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIlllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIllllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIllllIlll.init(lIIllIlllIIII[3], llllllllllllllIlllIlllIIlllllIII);
            return new String(llllllllllllllIlllIlllIIllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIIllllIllI) {
            llllllllllllllIlllIlllIIllllIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIIIIlll(String llllllllllllllIlllIlllIlIIIllIlI, String llllllllllllllIlllIlllIlIIIlIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIlIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIII[15]), "DES");
            Cipher llllllllllllllIlllIlllIlIIIlllII = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIlIIIlllII.init(lIIllIlllIIII[3], llllllllllllllIlllIlllIlIIIlllIl);
            return new String(llllllllllllllIlllIlllIlIIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIlIIIllIll) {
            llllllllllllllIlllIlllIlIIIllIll.printStackTrace();
            return null;
        }
    }

    static {
        e.lIllIIIllIIllIl();
        e.lIllIIIllIIllII();
        NONE = new e(lIIllIlllIIII[0]);
        SHRIMP = new e(lIIllIlllIIII[2]);
        CAKE = new e(lIIllIlllIIII[4]);
        CHOCOLATE_CAKE = new e(lIIllIlllIIII[6]);
        PLAIN_PIZZA = new e(lIIllIlllIIII[8]);
        PINEAPPLE_PIZZA = new e(lIIllIlllIIII[10]);
        WINE = new e(lIIllIlllIIII[12]);
        BASS = new e(lIIllIlllIIII[14]);
        TUNA = new e(lIIllIlllIIII[16]);
        KARAMBWAN = new e(lIIllIlllIIII[18]);
        LOBSTER = new e(lIIllIlllIIII[20]);
        SWORDFISH = new e(lIIllIlllIIII[22]);
        MONKFISH = new e(lIIllIlllIIII[24]);
        SHARK = new e(lIIllIlllIIII[26]);
        SEA_TURTLE = new e(lIIllIlllIIII[28]);
        MANTA_RAY = new e(lIIllIlllIIII[30]);
        ANGLERFISH = new e(lIIllIlllIIII[32]);
        DARK_CRAB = new e(lIIllIlllIIII[34]);
        SARA_BREW = new e(lIIllIlllIIII[36]);
        ANCIENT_BREW = new e(lIIllIlllIIII[38]);
        JANGERBERRIES = new e(lIIllIlllIIII[40]);
        SUPER_RESTORE = new e(lIIllIlllIIII[42]);
        PRAYER_POTION = new e(lIIllIlllIIII[44]);
        e[] eArray = new e[lIIllIlllIIII[45]];
        eArray[e.lIIllIlllIIII[0]] = NONE;
        eArray[e.lIIllIlllIIII[1]] = SHRIMP;
        eArray[e.lIIllIlllIIII[3]] = CAKE;
        eArray[e.lIIllIlllIIII[5]] = CHOCOLATE_CAKE;
        eArray[e.lIIllIlllIIII[7]] = PLAIN_PIZZA;
        eArray[e.lIIllIlllIIII[9]] = PINEAPPLE_PIZZA;
        eArray[e.lIIllIlllIIII[11]] = WINE;
        eArray[e.lIIllIlllIIII[13]] = BASS;
        eArray[e.lIIllIlllIIII[15]] = TUNA;
        eArray[e.lIIllIlllIIII[17]] = KARAMBWAN;
        eArray[e.lIIllIlllIIII[19]] = LOBSTER;
        eArray[e.lIIllIlllIIII[21]] = SWORDFISH;
        eArray[e.lIIllIlllIIII[23]] = MONKFISH;
        eArray[e.lIIllIlllIIII[25]] = SHARK;
        eArray[e.lIIllIlllIIII[27]] = SEA_TURTLE;
        eArray[e.lIIllIlllIIII[29]] = MANTA_RAY;
        eArray[e.lIIllIlllIIII[31]] = ANGLERFISH;
        eArray[e.lIIllIlllIIII[33]] = DARK_CRAB;
        eArray[e.lIIllIlllIIII[35]] = SARA_BREW;
        eArray[e.lIIllIlllIIII[37]] = ANCIENT_BREW;
        eArray[e.lIIllIlllIIII[39]] = JANGERBERRIES;
        eArray[e.lIIllIlllIIII[41]] = SUPER_RESTORE;
        eArray[e.lIIllIlllIIII[43]] = PRAYER_POTION;
        $VALUES = eArray;
    }

    private static void lIllIIIllIIllII() {
        lIIllIllIIIlI = new String[lIIllIlllIIII[45]];
        e.lIIllIllIIIlI[e.lIIllIlllIIII[0]] = e."NONE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[1]] = e."SHRIMP";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[3]] = e."CAKE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[5]] = e."CHOCOLATE_CAKE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[7]] = e."PLAIN_PIZZA";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[9]] = e."PINEAPPLE_PIZZA";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[11]] = e."WINE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[13]] = e."BASS";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[15]] = e."TUNA";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[17]] = e."KARAMBWAN";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[19]] = e."LOBSTER";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[21]] = e."SWORDFISH";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[23]] = e."MONKFISH";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[25]] = e."SHARK";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[27]] = e."SEA_TURTLE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[29]] = e."MANTA_RAY";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[31]] = e."ANGLERFISH";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[33]] = e."DARK_CRAB";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[35]] = e."SARA_BREW";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[37]] = e."ANCIENT_BREW";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[39]] = e."JANGERBERRIES";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[41]] = e."SUPER_RESTORE";
        e.lIIllIllIIIlI[e.lIIllIlllIIII[43]] = e."PRAYER_POTION";
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static boolean lIllIIIllIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private e(int n3) {
        this.foodId = n3;
    }

    public int x() {
        return this.foodId;
    }
}

