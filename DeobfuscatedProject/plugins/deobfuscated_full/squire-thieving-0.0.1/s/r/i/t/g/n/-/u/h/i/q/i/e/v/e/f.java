/*
 * Decompiled with CFR 0.152.
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class f
extends Enum<f> {
    public static final /* synthetic */ /* enum */ f VYRE;
    public static final /* synthetic */ /* enum */ f ELF;
    public static final /* synthetic */ /* enum */ f MAN;
    private static final /* synthetic */ f[] $VALUES;
    private static /* synthetic */ int[] lIIlllIIlIllI;
    private static /* synthetic */ String[] lIIlllIIlIlIl;
    public static final /* synthetic */ /* enum */ f ARDY_KNIGHT;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ f MASTER_FARMER;
    public static final /* synthetic */ /* enum */ f TZHAAR;

    static {
        f.lIllIIllIIIlIlI();
        f.lIllIIllIIIlIIl();
        ARDY_KNIGHT = new f(lIIlllIIlIlIl[lIIlllIIlIllI[1]]);
        MASTER_FARMER = new f(lIIlllIIlIlIl[lIIlllIIlIllI[3]]);
        MAN = new f(lIIlllIIlIlIl[lIIlllIIlIllI[5]]);
        VYRE = new f(lIIlllIIlIlIl[lIIlllIIlIllI[7]]);
        ELF = new f(lIIlllIIlIlIl[lIIlllIIlIllI[9]]);
        TZHAAR = new f(lIIlllIIlIlIl[lIIlllIIlIllI[11]]);
        f[] fArray = new f[lIIlllIIlIllI[6]];
        fArray[f.lIIlllIIlIllI[0]] = ARDY_KNIGHT;
        fArray[f.lIIlllIIlIllI[1]] = MASTER_FARMER;
        fArray[f.lIIlllIIlIllI[2]] = MAN;
        fArray[f.lIIlllIIlIllI[3]] = VYRE;
        fArray[f.lIIlllIIlIllI[4]] = ELF;
        fArray[f.lIIlllIIlIllI[5]] = TZHAAR;
        $VALUES = fArray;
    }

    private static void lIllIIllIIIlIlI() {
        lIIlllIIlIllI = new int[13];
        f.lIIlllIIlIllI[0] = (0xC4 ^ 0x99) & ~(0xC5 ^ 0x98);
        f.lIIlllIIlIllI[1] = 1;
        f.lIIlllIIlIllI[2] = 2;
        f.lIIlllIIlIllI[3] = 3;
        f.lIIlllIIlIllI[4] = 0xA ^ 0xE;
        f.lIIlllIIlIllI[5] = 0x47 ^ 0x42;
        f.lIIlllIIlIllI[6] = 0xA7 ^ 0xA1;
        f.lIIlllIIlIllI[7] = 91 + 90 - 91 + 41 ^ 22 + 65 - 42 + 87;
        f.lIIlllIIlIllI[8] = 0x8B ^ 0x83;
        f.lIIlllIIlIllI[9] = 0xCA ^ 0xC3;
        f.lIIlllIIlIllI[10] = 0x9D ^ 0x97;
        f.lIIlllIIlIllI[11] = 28 + 86 - 54 + 115 ^ 93 + 0 - 37 + 108;
        f.lIIlllIIlIllI[12] = 0x3B ^ 0x7E ^ (0x12 ^ 0x5B);
    }

    private f(String string2) {
        this.name = string2;
    }

    private static String lIllIIllIIIlIII(String var1, String var14) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIlllIIlIllI[2], var12);
            return new String(var7.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public String v() {
        return this.name;
    }

    private static void lIllIIllIIIlIIl() {
        lIIlllIIlIlIl = new String[lIIlllIIlIllI[12]];
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[0]] = f."ARDY_KNIGHT";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[1]] = f."Knight of Ardougne";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[2]] = f."MASTER_FARMER";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[3]] = f."Master Farmer";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[4]] = f."MAN";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[5]] = f."Man";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[6]] = f."VYRE";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[7]] = f."Vyre";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[8]] = f."ELF";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[9]] = f."Elf";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[10]] = f."TZHAAR";
        f.lIIlllIIlIlIl[f.lIIlllIIlIllI[11]] = f."TzHaar-Hur";
    }

    private static boolean lIllIIllIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static String lIllIIllIIIIlll(String var2, String var10) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var3 = var10.toCharArray();
        int var8 = lIIlllIIlIllI[0];
        char[] var13 = var2.toCharArray();
        int var11 = var13.length;
        int var5 = lIIlllIIlIllI[0];
        while (f.lIllIIllIIIlIll(var5, var11)) {
            char var6 = var13[var5];
            var9.append((char)(var6 ^ var3[var8 % var3.length]));
            0;
            ++var8;
            ++var5;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }
}

