/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class C
extends Enum<C> {
    private final /* synthetic */ String name;
    private static /* synthetic */ int[] lIlllIllllIl;
    public static final /* synthetic */ /* enum */ C MAPLE;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ /* enum */ C WILLOW;
    public static final /* synthetic */ /* enum */ C MAGIC;
    public static final /* synthetic */ /* enum */ C MAHOGANY;
    public static final /* synthetic */ /* enum */ C OAK;
    public static final /* synthetic */ /* enum */ C TEAK;
    private final /* synthetic */ int logID;
    private static final /* synthetic */ C[] $VALUES;
    public static final /* synthetic */ /* enum */ C YEW;
    public static final /* synthetic */ /* enum */ C REDWOOD;
    public static final /* synthetic */ /* enum */ C NORMAL;
    private static /* synthetic */ String[] lIlllIllllII;

    public int au() {
        return this.itemID;
    }

    private static boolean lllIllIlIlIlII(int n2) {
        return n2 > 0;
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    private static boolean lllIllIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    @Nullable
    static C c(int n2) {
        int n3 = (n2 - lIlllIllllIl[0]) / lIlllIllllIl[1];
        if (!C.lllIllIlIlIlII(n2) || C.lllIllIlIlIlIl(n3, C.values().length)) {
            return null;
        }
        return C.values()[n3];
    }

    public int av() {
        return this.logID;
    }

    private static String lllIllIlIlIIII(String lllllllllllllllIlIllIlIIIlIlllll, String lllllllllllllllIlIllIlIIIlIllllI) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIIIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIIIlIllllI.getBytes(StandardCharsets.UTF_8)), lIlllIllllIl[16]), "DES");
            Cipher lllllllllllllllIlIllIlIIIllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIlIIIllIIIll.init(lIlllIllllIl[5], lllllllllllllllIlIllIlIIIllIIlII);
            return new String(lllllllllllllllIlIllIlIIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIlIIIllIIIlI) {
            lllllllllllllllIlIllIlIIIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lllIllIlIlIIIl(String lllllllllllllllIlIllIlIIIllllllI, String lllllllllllllllIlIllIlIIIlllllIl) {
        lllllllllllllllIlIllIlIIIllllllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIlIIlIIIIIIl = new StringBuilder();
        char[] lllllllllllllllIlIllIlIIlIIIIIII = lllllllllllllllIlIllIlIIIlllllIl.toCharArray();
        int lllllllllllllllIlIllIlIIIlllllll = lIlllIllllIl[2];
        char[] lllllllllllllllIlIllIlIIIllllIIl = lllllllllllllllIlIllIlIIIllllllI.toCharArray();
        int lllllllllllllllIlIllIlIIIllllIII = lllllllllllllllIlIllIlIIIllllIIl.length;
        int lllllllllllllllIlIllIlIIIlllIlll = lIlllIllllIl[2];
        while (C.lllIllIlIlIllI(lllllllllllllllIlIllIlIIIlllIlll, lllllllllllllllIlIllIlIIIllllIII)) {
            char lllllllllllllllIlIllIlIIlIIIIlII = lllllllllllllllIlIllIlIIIllllIIl[lllllllllllllllIlIllIlIIIlllIlll];
            lllllllllllllllIlIllIlIIlIIIIIIl.append((char)(lllllllllllllllIlIllIlIIlIIIIlII ^ lllllllllllllllIlIllIlIIlIIIIIII[lllllllllllllllIlIllIlIIIlllllll % lllllllllllllllIlIllIlIIlIIIIIII.length]));
            0;
            ++lllllllllllllllIlIllIlIIIlllllll;
            ++lllllllllllllllIlIllIlIIIlllIlll;
            0;
            if (-1 <= 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIlIIlIIIIIIl);
    }

    private static String lllIllIlIIllll(String lllllllllllllllIlIllIlIIIllIllII, String lllllllllllllllIlIllIlIIIllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIIIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIIIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIlIIIlllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIlIIIlllIIII.init(lIlllIllllIl[5], lllllllllllllllIlIllIlIIIlllIIIl);
            return new String(lllllllllllllllIlIllIlIIIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIlIIIllIllll) {
            lllllllllllllllIlIllIlIIIllIllll.printStackTrace();
            return null;
        }
    }

    public String ac() {
        return this.name;
    }

    private static void lllIllIlIlIIll() {
        lIlllIllllIl = new int[37];
        C.lIlllIllllIl[0] = 1;
        C.lIlllIllllIl[1] = 3;
        C.lIlllIllllIl[2] = (0x20 ^ 0x30 ^ (0x6A ^ 0x73)) & (0x34 ^ 0x6E ^ (0x60 ^ 0x33) ^ -1);
        C.lIlllIllllIl[3] = 0xFFFFD5F9 & 0x7E0E;
        C.lIlllIllllIl[4] = 0xFFFFDFE7 & 0x25FF;
        C.lIlllIllllIl[5] = 2;
        C.lIlllIllllIl[6] = 0xFFFFDC0B & 0x77FF;
        C.lIlllIllllIl[7] = 0xFFFF95F7 & 0x6FF9;
        C.lIlllIllllIl[8] = 0xA0 ^ 0xA4 ^ (0x26 ^ 0x75) & ~(0x2F ^ 0x7C);
        C.lIlllIllllIl[9] = 0x16 ^ 0x13;
        C.lIlllIllllIl[10] = 0xFFFFF6FE & 0x5D0F;
        C.lIlllIllllIl[11] = 0xFFFF9FFF & 0x65EF;
        C.lIlllIllllIl[12] = 75 + 14 - -91 + 2 ^ 52 + 66 - 53 + 111;
        C.lIlllIllllIl[13] = 0x28 ^ 0x5D ^ (0x58 ^ 0x2A);
        C.lIlllIllllIl[14] = 0xFFFFFF91 & 0x547F;
        C.lIlllIllllIl[15] = -(0xFFFFF8A7 & 0x675B) & (0xFFFFF8BF & Short.MAX_VALUE);
        C.lIlllIllllIl[16] = 0x46 ^ 0x4E;
        C.lIlllIllllIl[17] = 0x7E ^ 0x77;
        C.lIlllIllllIl[18] = -(0xFFFFBF7B & 0x68CF) & (0xFFFFFEFF & 0x7FFA);
        C.lIlllIllllIl[19] = 0xFFFFADEF & 0x57FD;
        C.lIlllIllllIl[20] = 77 + 38 - 39 + 95 ^ 23 + 35 - -33 + 70;
        C.lIlllIllllIl[21] = 113 + 103 - 191 + 149 ^ 72 + 28 - 63 + 128;
        C.lIlllIllllIl[22] = 0xFFFFD6B7 & 0x7FFB;
        C.lIlllIllllIl[23] = -2 & (0xFFFFFEFF & 0x19BD);
        C.lIlllIllllIl[24] = 0xCC ^ 0xC0;
        C.lIlllIllllIl[25] = 0x20 ^ 0x2D;
        C.lIlllIllllIl[26] = 0xFFFFD6B6 & Short.MAX_VALUE;
        C.lIlllIllllIl[27] = -(0xFFFFDF33 & 0x32CD) & (0xFFFFFFEB & 0x17FF);
        C.lIlllIllllIl[28] = 0x71 ^ 0x7F;
        C.lIlllIllllIl[29] = 0x90 ^ 0xC6 ^ (0xF6 ^ 0xAF);
        C.lIlllIllllIl[30] = 0xFFFFDFB9 & 0x76FF;
        C.lIlllIllllIl[31] = -(0xFFFFA9DF & 0x5E37) & (0xFFFFEDFF & 0x1FFF);
        C.lIlllIllllIl[32] = 0x9C ^ 0x8C;
        C.lIlllIllllIl[33] = 0x8A ^ 0x9B;
        C.lIlllIllllIl[34] = -(0xFFFFB3F2 & 0x4D4F) & (0xFFFFD7FD & Short.MAX_VALUE);
        C.lIlllIllllIl[35] = -(0xFFFFED5B & 0x33A7) & (0xFFFFFFFF & 0x6DD7);
        C.lIlllIllllIl[36] = 38 + 72 - -60 + 1 ^ 148 + 69 - 140 + 108;
    }

    private C(String string2, int n3, int n4) {
        this.name = string2;
        this.itemID = n3;
        this.logID = n4;
    }

    static {
        C.lllIllIlIlIIll();
        C.lllIllIlIlIIlI();
        NORMAL = new C(lIlllIllllII[lIlllIllllIl[0]], lIlllIllllIl[3], lIlllIllllIl[4]);
        OAK = new C(lIlllIllllII[lIlllIllllIl[1]], lIlllIllllIl[6], lIlllIllllIl[7]);
        WILLOW = new C(lIlllIllllII[lIlllIllllIl[9]], lIlllIllllIl[10], lIlllIllllIl[11]);
        TEAK = new C(lIlllIllllII[lIlllIllllIl[13]], lIlllIllllIl[14], lIlllIllllIl[15]);
        MAPLE = new C(lIlllIllllII[lIlllIllllIl[17]], lIlllIllllIl[18], lIlllIllllIl[19]);
        MAHOGANY = new C(lIlllIllllII[lIlllIllllIl[21]], lIlllIllllIl[22], lIlllIllllIl[23]);
        YEW = new C(lIlllIllllII[lIlllIllllIl[25]], lIlllIllllIl[26], lIlllIllllIl[27]);
        MAGIC = new C(lIlllIllllII[lIlllIllllIl[29]], lIlllIllllIl[30], lIlllIllllIl[31]);
        REDWOOD = new C(lIlllIllllII[lIlllIllllIl[33]], lIlllIllllIl[34], lIlllIllllIl[35]);
        C[] cArray = new C[lIlllIllllIl[17]];
        cArray[C.lIlllIllllIl[2]] = NORMAL;
        cArray[C.lIlllIllllIl[0]] = OAK;
        cArray[C.lIlllIllllIl[5]] = WILLOW;
        cArray[C.lIlllIllllIl[1]] = TEAK;
        cArray[C.lIlllIllllIl[8]] = MAPLE;
        cArray[C.lIlllIllllIl[9]] = MAHOGANY;
        cArray[C.lIlllIllllIl[12]] = YEW;
        cArray[C.lIlllIllllIl[13]] = MAGIC;
        cArray[C.lIlllIllllIl[16]] = REDWOOD;
        $VALUES = cArray;
    }

    private static boolean lllIllIlIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIllIlIlIIlI() {
        lIlllIllllII = new String[lIlllIllllIl[36]];
        C.lIlllIllllII[C.lIlllIllllIl[2]] = C."NORMAL";
        C.lIlllIllllII[C.lIlllIllllIl[0]] = C."Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[5]] = C."OAK";
        C.lIlllIllllII[C.lIlllIllllIl[1]] = C."Oak Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[8]] = C."WILLOW";
        C.lIlllIllllII[C.lIlllIllllIl[9]] = C."Willow Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[12]] = C."TEAK";
        C.lIlllIllllII[C.lIlllIllllIl[13]] = C."Teak Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[16]] = C."MAPLE";
        C.lIlllIllllII[C.lIlllIllllIl[17]] = C."Maple Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[20]] = C."MAHOGANY";
        C.lIlllIllllII[C.lIlllIllllIl[21]] = C."Mahogany Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[24]] = C."YEW";
        C.lIlllIllllII[C.lIlllIllllIl[25]] = C."Yew Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[28]] = C."MAGIC";
        C.lIlllIllllII[C.lIlllIllllIl[29]] = C."Magic Bird House";
        C.lIlllIllllII[C.lIlllIllllIl[32]] = C."REDWOOD";
        C.lIlllIllllII[C.lIlllIllllIl[33]] = C."Redwood Bird House";
    }

    public static C valueOf(String string) {
        return Enum.valueOf(C.class, string);
    }
}

