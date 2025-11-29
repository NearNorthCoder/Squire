/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class LEnum
extends Enum<l> {
    public static final /* synthetic */ /* enum */ l APMEKEN;
    private static final /* synthetic */ l[] $VALUES;
    private final /* synthetic */ int doorId;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ l HET;
    private static /* synthetic */ String[] llIllIIIIII;
    public static final /* synthetic */ /* enum */ l CRONDIS;
    public static final /* synthetic */ /* enum */ l SCABARAS;
    private static /* synthetic */ int[] llIllIIIIIl;

    private static void lIlIlIIIlIIlIl() {
        llIllIIIIIl = new int[13];
        l.llIllIIIIIl[0] = (0x86 ^ 0xA4) & ~(0x78 ^ 0x5A);
        l.llIllIIIIIl[1] = 1;
        l.llIllIIIIIl[2] = -(0xFFFFBB3D & 0x46EB) & (0xFFFFBE7F & 0xF7F9);
        l.llIllIIIIIl[3] = 2;
        l.llIllIIIIIl[4] = 3;
        l.llIllIIIIIl[5] = -(0x47 ^ 0x66) & (0xFFFFFFEF & 0xB47B);
        l.llIllIIIIIl[6] = 0x79 ^ 0x38 ^ (0x50 ^ 0x15);
        l.llIllIIIIIl[7] = 0 ^ 5;
        l.llIllIIIIIl[8] = -(0xFFFFFFBF & 0x49E3) & (0xFFFFFDFE & 0xFFF7);
        l.llIllIIIIIl[9] = 0 ^ 6;
        l.llIllIIIIIl[10] = 0x97 ^ 0x90;
        l.llIllIIIIIl[11] = 0xFFFFBF5E & 0xF4EF;
        l.llIllIIIIIl[12] = 0x4C ^ 0x44;
    }

    public String l() {
        return this.name;
    }

    public int F() {
        return this.doorId;
    }

    static {
        l.lIlIlIIIlIIlIl();
        l.lIlIlIIIlIIlII();
        CRONDIS = new l(llIllIIIIII[llIllIIIIIl[1]], llIllIIIIIl[2]);
        SCABARAS = new l(llIllIIIIII[llIllIIIIIl[4]], llIllIIIIIl[5]);
        HET = new l(llIllIIIIII[llIllIIIIIl[7]], llIllIIIIIl[8]);
        APMEKEN = new l(llIllIIIIII[llIllIIIIIl[10]], llIllIIIIIl[11]);
        l[] lArray = new l[llIllIIIIIl[6]];
        lArray[l.llIllIIIIIl[0]] = CRONDIS;
        lArray[l.llIllIIIIIl[1]] = SCABARAS;
        lArray[l.llIllIIIIIl[3]] = HET;
        lArray[l.llIllIIIIIl[4]] = APMEKEN;
        $VALUES = lArray;
    }

    private static String lIlIlIIIlIIIlI(String var15, String var10) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llIllIIIIIl[3], var2);
            return new String(var13.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private static String lIlIlIIIlIIIll(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var11 = var8.toCharArray();
        int var5 = llIllIIIIIl[0];
        char[] var3 = var7.toCharArray();
        int var12 = var3.length;
        int var4 = llIllIIIIIl[0];
        while (l.lIlIlIIIlIIllI(var4, var12)) {
            char var17 = var3[var4];
            var16.append((char)(var17 ^ var11[var5 % var11.length]));
            0;
            ++var5;
            ++var4;
            0;
            if (-1 < ((0x4F ^ 0x21 ^ (5 ^ 0x53)) & (3 ^ (0x6D ^ 0x56) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean lIlIlIIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlIIIlIIlII() {
        llIllIIIIII = new String[llIllIIIIIl[12]];
        l.llIllIIIIII[l.llIllIIIIIl[0]] = l."CRONDIS";
        l.llIllIIIIII[l.llIllIIIIIl[1]] = l."Path of Crondis";
        l.llIllIIIIII[l.llIllIIIIIl[3]] = l."SCABARAS";
        l.llIllIIIIII[l.llIllIIIIIl[4]] = l."Path of Scabaras";
        l.llIllIIIIII[l.llIllIIIIIl[6]] = l."HET";
        l.llIllIIIIII[l.llIllIIIIIl[7]] = l."Path of Het";
        l.llIllIIIIII[l.llIllIIIIIl[9]] = l."APMEKEN";
        l.llIllIIIIII[l.llIllIIIIIl[10]] = l."Path of Apmeken";
    }

    private l(String string2, int n3) {
        this.name = string2;
        this.doorId = n3;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String lIlIlIIIlIIIIl(String var18, String var19) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llIllIIIIIl[12]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(llIllIIIIIl[3], var6);
            return new String(var9.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }
}

