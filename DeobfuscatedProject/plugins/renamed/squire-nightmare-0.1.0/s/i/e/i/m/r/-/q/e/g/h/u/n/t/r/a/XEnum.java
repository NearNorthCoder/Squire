/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class XEnum
extends Enum<x> {
    public static final /* synthetic */ /* enum */ x NONE;
    public static final /* synthetic */ /* enum */ x BLOWPIPE;
    public static final /* synthetic */ /* enum */ x WEBWEAVER_BOW;
    private static /* synthetic */ int[] llllIlIllIlI;
    private static final /* synthetic */ x[] $VALUES;
    public static final /* synthetic */ /* enum */ x CHINCHOMPA;
    public static final /* synthetic */ /* enum */ x HUNTER_CROSSBOW;
    private static /* synthetic */ String[] llllIlIlIlIl;
    private final /* synthetic */ String itemName;
    public static final /* synthetic */ /* enum */ x CRAWS_BOW;

    public String bP() {
        return this.itemName;
    }

    static {
        x.lIIlIIIlIIIlIIl();
        x.lIIlIIIlIIIIlll();
        HUNTER_CROSSBOW = new x(llllIlIlIlIl[llllIlIllIlI[1]]);
        BLOWPIPE = new x(llllIlIlIlIl[llllIlIllIlI[3]]);
        CHINCHOMPA = new x(llllIlIlIlIl[llllIlIllIlI[5]]);
        CRAWS_BOW = new x(llllIlIlIlIl[llllIlIllIlI[7]]);
        WEBWEAVER_BOW = new x(llllIlIlIlIl[llllIlIllIlI[9]]);
        NONE = new x(llllIlIlIlIl[llllIlIllIlI[11]]);
        x[] xArray = new x[llllIlIllIlI[6]];
        xArray[x.llllIlIllIlI[0]] = HUNTER_CROSSBOW;
        xArray[x.llllIlIllIlI[1]] = BLOWPIPE;
        xArray[x.llllIlIllIlI[2]] = CHINCHOMPA;
        xArray[x.llllIlIllIlI[3]] = CRAWS_BOW;
        xArray[x.llllIlIllIlI[4]] = WEBWEAVER_BOW;
        xArray[x.llllIlIllIlI[5]] = NONE;
        $VALUES = xArray;
    }

    private static void lIIlIIIlIIIlIIl() {
        llllIlIllIlI = new int[13];
        x.llllIlIllIlI[0] = (187 + 78 - 155 + 99 ^ 24 + 153 - 134 + 116) & (0x7B ^ 0x6D ^ (0xF0 ^ 0xA8) ^ -1);
        x.llllIlIllIlI[1] = 1;
        x.llllIlIllIlI[2] = 2;
        x.llllIlIllIlI[3] = 3;
        x.llllIlIllIlI[4] = 135 + 136 - 96 + 22 ^ 175 + 68 - 175 + 125;
        x.llllIlIllIlI[5] = 56 + 108 - 160 + 149 ^ 68 + 12 - -36 + 40;
        x.llllIlIllIlI[6] = 181 + 119 - 233 + 126 ^ 117 + 34 - 13 + 61;
        x.llllIlIllIlI[7] = 0x69 ^ 0x6E;
        x.llllIlIllIlI[8] = 0xCF ^ 0xC7;
        x.llllIlIllIlI[9] = 0x9F ^ 0x96;
        x.llllIlIllIlI[10] = 0x89 ^ 0x83;
        x.llllIlIllIlI[11] = 0x88 ^ 0x83;
        x.llllIlIllIlI[12] = 0xCA ^ 0xAD ^ (0xFF ^ 0x94);
    }

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

    private static void lIIlIIIlIIIIlll() {
        llllIlIlIlIl = new String[llllIlIllIlI[12]];
        x.llllIlIlIlIl[x.llllIlIllIlI[0]] = x."HUNTER_CROSSBOW";
        x.llllIlIlIlIl[x.llllIlIllIlI[1]] = x."Hunters' crossbow";
        x.llllIlIlIlIl[x.llllIlIllIlI[2]] = x."BLOWPIPE";
        x.llllIlIlIlIl[x.llllIlIllIlI[3]] = x."blowpipe";
        x.llllIlIlIlIl[x.llllIlIllIlI[4]] = x."CHINCHOMPA";
        x.llllIlIlIlIl[x.llllIlIllIlI[5]] = x."Chinchompa";
        x.llllIlIlIlIl[x.llllIlIllIlI[6]] = x."CRAWS_BOW";
        x.llllIlIlIlIl[x.llllIlIllIlI[7]] = x."Craw's bow";
        x.llllIlIlIlIl[x.llllIlIllIlI[8]] = x."WEBWEAVER_BOW";
        x.llllIlIlIlIl[x.llllIlIllIlI[9]] = x."Webweaver bow";
        x.llllIlIlIlIl[x.llllIlIllIlI[10]] = x."NONE";
        x.llllIlIlIlIl[x.llllIlIllIlI[11]] = x."none";
    }

    private x(String string2) {
        this.itemName = string2;
    }

    private static String lIIlIIIlIIIIIIl(String var9, String var12) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var2 = var12.toCharArray();
        int var5 = llllIlIllIlI[0];
        char[] var11 = var9.toCharArray();
        int var8 = var11.length;
        int var6 = llllIlIllIlI[0];
        while (x.lIIlIIIlIIIlIlI(var6, var8)) {
            char var7 = var11[var6];
            var17.append((char)(var7 ^ var2[var5 % var2.length]));
            0;
            ++var5;
            ++var6;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static String lIIlIIIIlllllll(String var10, String var18) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(llllIlIllIlI[2], var14);
            return new String(var15.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIlIIIIIlI(String var13, String var1) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), llllIlIllIlI[8]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(llllIlIllIlI[2], var4);
            return new String(var3.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIlIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static x valueOf(String string) {
        return Enum.valueOf(x.class, string);
    }
}

