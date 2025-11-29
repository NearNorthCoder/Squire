/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.coords.RectangularArea
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.coords.RectangularArea;

public final class IEnum
extends Enum<i> {
    private static /* synthetic */ String[] llllIIIIIIII;
    private final /* synthetic */ String name;
    private final /* synthetic */ RectangularArea area;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ /* enum */ i MOONLIGHT_ANTELOPE;
    private static /* synthetic */ int[] llllIIIIIIIl;
    public static final /* synthetic */ /* enum */ i SUNLIGHT_ANTELOPE;

    public RectangularArea w() {
        return this.area;
    }

    private static String lIIIlllIIllIlII(String var5, String var13) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var17 = var13.toCharArray();
        int var6 = llllIIIIIIIl[0];
        char[] var11 = var5.toCharArray();
        int var16 = var11.length;
        int var9 = llllIIIIIIIl[0];
        while (i.lIIIlllIIllIlll(var9, var16)) {
            char var14 = var11[var9];
            var10.append((char)(var14 ^ var17[var6 % var17.length]));
            0;
            ++var6;
            ++var9;
            0;
            
            return null;
        }
        return String.valueOf(var10);
    }

    private static void lIIIlllIIllIlIl() {
        llllIIIIIIII = new String[llllIIIIIIIl[12]];
        i.llllIIIIIIII[i.llllIIIIIIIl[0]] = i."SUNLIGHT_ANTELOPE";
        i.llllIIIIIIII[i.llllIIIIIIIl[1]] = i."Sunlight antelope";
        i.llllIIIIIIII[i.llllIIIIIIIl[6]] = i."MOONLIGHT_ANTELOPE";
        i.llllIIIIIIII[i.llllIIIIIIIl[7]] = i."Moonlight antelope";
    }

    private static String lIIIlllIIllIIll(String var1, String var12) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llllIIIIIIIl[6], var3);
            return new String(var18.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private i(String string2, RectangularArea rectangularArea) {
        this.name = string2;
        this.area = rectangularArea;
    }

    private static void lIIIlllIIllIllI() {
        llllIIIIIIIl = new int[14];
        i.llllIIIIIIIl[0] = (0xBA ^ 0xAB ^ (0xBA ^ 0xA2)) & (64 + 83 - 133 + 118 ^ 23 + 86 - 43 + 75 ^ -1);
        i.llllIIIIIIIl[1] = 1;
        i.llllIIIIIIIl[2] = -(0xFFFF9F41 & 0x70BF) & (0xFFFF96FE & 0x7FCF);
        i.llllIIIIIIIl[3] = -3 & (0xFFFFCFBF & 0x3BFF);
        i.llllIIIIIIIl[4] = 0xFFFF9FDF & 0x66FF;
        i.llllIIIIIIIl[5] = -(0xFFFFD5F6 & 0x6E3F) & (0xFFFFFFFD & 0x4FFF);
        i.llllIIIIIIIl[6] = 2;
        i.llllIIIIIIIl[7] = 3;
        i.llllIIIIIIIl[8] = -(0xFFFFFECA & 0x21BF) & (0xFFFFEF9B & 0x36FF);
        i.llllIIIIIIIl[9] = 0xFFFFFCEF & 0x27D6;
        i.llllIIIIIIIl[10] = -(117 + 35 - 115 + 93) & (0xFFFFBF9F & 0x46FF);
        i.llllIIIIIIIl[11] = -(0xFFFFCBAA & 0x757F) & (0xFFFFFDF9 & 0x67FF);
        i.llllIIIIIIIl[12] = 0xBB ^ 0x93 ^ (0x93 ^ 0xBF);
        i.llllIIIIIIIl[13] = 0x5D ^ 0x55;
    }

    private static String lIIIlllIIllIIlI(String var4, String var2) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), llllIIIIIIIl[13]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llllIIIIIIIl[6], var15);
            return new String(var7.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        i.lIIIlllIIllIllI();
        i.lIIIlllIIllIlIl();
        SUNLIGHT_ANTELOPE = new i(llllIIIIIIII[llllIIIIIIIl[1]], new RectangularArea(llllIIIIIIIl[2], llllIIIIIIIl[3], llllIIIIIIIl[4], llllIIIIIIIl[5]));
        MOONLIGHT_ANTELOPE = new i(llllIIIIIIII[llllIIIIIIIl[7]], new RectangularArea(llllIIIIIIIl[8], llllIIIIIIIl[9], llllIIIIIIIl[10], llllIIIIIIIl[11]));
        i[] iArray = new i[llllIIIIIIIl[6]];
        iArray[i.llllIIIIIIIl[0]] = SUNLIGHT_ANTELOPE;
        iArray[i.llllIIIIIIIl[1]] = MOONLIGHT_ANTELOPE;
        $VALUES = iArray;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public String v() {
        return this.name;
    }

    private static boolean lIIIlllIIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

