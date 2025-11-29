/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class o
extends Enum<o> {
    private static final /* synthetic */ o[] $VALUES;
    public static final /* synthetic */ /* enum */ o IGNORE;
    public static final /* synthetic */ /* enum */ o ANTI_POISON;
    private final /* synthetic */ List<Integer> items;
    public static final /* synthetic */ /* enum */ o CURE_SELF;
    public static final /* synthetic */ /* enum */ o ANTI_VENOM;
    private static /* synthetic */ String[] lIllIllIIlllI;
    private static /* synthetic */ int[] lIllIllIlIIII;
    public static final /* synthetic */ /* enum */ o ANTI_DOTE;
    private final /* synthetic */ String name;

    public String k() {
        return this.name;
    }

    static {
        o.llIIlIIlIIIIIll();
        o.llIIlIIIlllllIl();
        int[] nArray = new int[lIllIllIlIIII[3]];
        nArray[o.lIllIllIlIIII[0]] = lIllIllIlIIII[4];
        nArray[o.lIllIllIlIIII[1]] = lIllIllIlIIII[5];
        nArray[o.lIllIllIlIIII[2]] = lIllIllIlIIII[6];
        nArray[o.lIllIllIlIIII[7]] = lIllIllIlIIII[8];
        nArray[o.lIllIllIlIIII[9]] = lIllIllIlIIII[10];
        nArray[o.lIllIllIlIIII[11]] = lIllIllIlIIII[12];
        ANTI_VENOM = new o(lIllIllIIlllI[lIllIllIlIIII[2]], nArray);
        int[] nArray2 = new int[lIllIllIlIIII[2]];
        nArray2[o.lIllIllIlIIII[0]] = lIllIllIlIIII[13];
        nArray2[o.lIllIllIlIIII[1]] = lIllIllIlIIII[14];
        ANTI_DOTE = new o(lIllIllIIlllI[lIllIllIlIIII[9]], nArray2);
        int[] nArray3 = new int[lIllIllIlIIII[3]];
        nArray3[o.lIllIllIlIIII[0]] = lIllIllIlIIII[15];
        nArray3[o.lIllIllIlIIII[1]] = lIllIllIlIIII[16];
        nArray3[o.lIllIllIlIIII[2]] = lIllIllIlIIII[17];
        nArray3[o.lIllIllIlIIII[7]] = lIllIllIlIIII[18];
        nArray3[o.lIllIllIlIIII[9]] = lIllIllIlIIII[19];
        nArray3[o.lIllIllIlIIII[11]] = lIllIllIlIIII[20];
        ANTI_POISON = new o(lIllIllIIlllI[lIllIllIlIIII[3]], nArray3);
        int[] nArray4 = new int[lIllIllIlIIII[2]];
        nArray4[o.lIllIllIlIIII[0]] = lIllIllIlIIII[22];
        nArray4[o.lIllIllIlIIII[1]] = lIllIllIlIIII[23];
        CURE_SELF = new o(nArray4);
        IGNORE = new o(new int[lIllIllIlIIII[0]]);
        o[] oArray = new o[lIllIllIlIIII[11]];
        oArray[o.lIllIllIlIIII[0]] = ANTI_VENOM;
        oArray[o.lIllIllIlIIII[1]] = ANTI_DOTE;
        oArray[o.lIllIllIlIIII[2]] = ANTI_POISON;
        oArray[o.lIllIllIlIIII[7]] = CURE_SELF;
        oArray[o.lIllIllIlIIII[9]] = IGNORE;
        $VALUES = oArray;
    }

    private static void llIIlIIlIIIIIll() {
        lIllIllIlIIII = new int[26];
        o.lIllIllIlIIII[0] = (0x9F ^ 0xC1) & ~(0x28 ^ 0x76);
        o.lIllIllIlIIII[1] = 1;
        o.lIllIllIlIIII[2] = 2;
        o.lIllIllIlIIII[3] = 0x99 ^ 0x9F;
        o.lIllIllIlIIII[4] = 0xFFFFFAFF & 0x3769;
        o.lIllIllIlIIII[5] = 0xFFFFB77D & 0x7AF3;
        o.lIllIllIlIIII[6] = 0xFFFFB677 & 0x7BFB;
        o.lIllIllIlIIII[7] = 3;
        o.lIllIllIlIIII[8] = -(0xFFFFFC15 & 0x47EB) & (0xFFFFFEFF & 0x776B);
        o.lIllIllIlIIII[9] = 0x6B ^ 0x6F;
        o.lIllIllIlIIII[10] = 0xFFFFF76F & 0x3AFD;
        o.lIllIllIlIIII[11] = 0x44 ^ 0x41;
        o.lIllIllIlIIII[12] = -(0xFFFFEFB1 & 0x51CF) & (0xFFFFFBF7 & 0x77FD);
        o.lIllIllIlIIII[13] = 0xFFFFDFF7 & 0x373F;
        o.lIllIllIlIIII[14] = -(0xFFFFEC7E & 0x539F) & (0xFFFFD7DF & 0x7F7D);
        o.lIllIllIlIIII[15] = 0xFFFFFB9A & 0xDF5;
        o.lIllIllIlIIII[16] = 0xFFFFAFCF & 0x59BE;
        o.lIllIllIlIIII[17] = 45 + 10 - -106 + 20;
        o.lIllIllIlIIII[18] = 35 + 86 - -7 + 47;
        o.lIllIllIlIIII[19] = (0xAF ^ 0xC3) + (0x40 ^ 0x57) - (0x48 ^ 0x7E) + (0x16 ^ 0x7C);
        o.lIllIllIlIIII[20] = 101 + 120 - 89 + 45;
        o.lIllIllIlIIII[21] = 12 + 9 - 7 + 133 ^ 129 + 8 - 84 + 95;
        o.lIllIllIlIIII[22] = 0xFFFFFDFF & 0x33F7;
        o.lIllIllIlIIII[23] = 0xFFFFEBF3 & 0x7E9D;
        o.lIllIllIlIIII[24] = 69 + 151 - 146 + 86 ^ 135 + 49 - 73 + 57;
        o.lIllIllIlIIII[25] = 0xAA ^ 0xA3;
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    private o(int ... nArray) {
        this(lIllIllIIlllI[lIllIllIlIIII[0]], nArray);
    }

    /*
     * WARNING - void declaration
     */
    private o(String string2, int ... nArray) {
        void var1;
        this.name = string2;
        this.items = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n3 = nArray2.length;
        int var3 = lIllIllIlIIII[0];
        while (o.llIIlIIlIIIIlII(var3, (int)var1)) {
            o var16;
            void var21;
            void var14 = var21[var3];
            var16.items.add((int)var14);
            0;
            ++var3;
            0;
            
            throw null;
        }
    }

    private static boolean llIIlIIlIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIlllllIl() {
        lIllIllIIlllI = new String[lIllIllIlIIII[25]];
        o.lIllIllIIlllI[o.lIllIllIlIIII[0]] = o."";
        o.lIllIllIIlllI[o.lIllIllIlIIII[1]] = o."ANTI_VENOM";
        o.lIllIllIIlllI[o.lIllIllIlIIII[2]] = o."Anti-venom";
        o.lIllIllIIlllI[o.lIllIllIlIIII[7]] = o."ANTI_DOTE";
        o.lIllIllIIlllI[o.lIllIllIlIIII[9]] = o."Antidote";
        o.lIllIllIIlllI[o.lIllIllIlIIII[11]] = o."ANTI_POISON";
        o.lIllIllIIlllI[o.lIllIllIlIIII[3]] = o."Antipoison";
        o.lIllIllIIlllI[o.lIllIllIlIIII[21]] = o."CURE_SELF";
        o.lIllIllIIlllI[o.lIllIllIlIIII[24]] = o."IGNORE";
    }

    public List<Integer> I() {
        return this.items;
    }

    private static String llIIlIIIllllIll(String var12, String var5) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIllIllIlIIII[2], var18);
            return new String(var8.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String llIIlIIIlllllII(String var24, String var4) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var19 = var4.toCharArray();
        int var6 = lIllIllIlIIII[0];
        char[] var13 = var24.toCharArray();
        int var22 = var13.length;
        int var17 = lIllIllIlIIII[0];
        while (o.llIIlIIlIIIIlII(var17, var22)) {
            char var20 = var13[var17];
            var7.append((char)(var20 ^ var19[var6 % var19.length]));
            0;
            ++var6;
            ++var17;
            0;
            if (((0x8B ^ 0xBF ^ (0x62 ^ 0x58)) & (0xBD ^ 0xAF ^ (0x16 ^ 0xA) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static String llIIlIIIllllIII(String var2, String var10) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIllIllIlIIII[24]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(lIllIllIlIIII[2], var15);
            return new String(var23.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }
}

