/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class j
extends Enum<j> {
    private final /* synthetic */ int projectileID;
    public static final /* synthetic */ /* enum */ j RANGED;
    private final /* synthetic */ Prayer prayer;
    private final /* synthetic */ int spriteID;
    private static /* synthetic */ String[] llllIIIlIllI;
    public static final /* synthetic */ /* enum */ j MAGIC;
    private static final /* synthetic */ j[] $VALUES;
    private static /* synthetic */ int[] llllIIIllIIl;

    private static void lIIIllllIIlIlII() {
        llllIIIllIIl = new int[10];
        j.llllIIIllIIl[0] = (116 + 238 - 297 + 185 ^ 134 + 74 - 145 + 107) & (179 + 194 - 161 + 6 ^ 44 + 41 - 62 + 107 ^ -1);
        j.llllIIIllIIl[1] = 1;
        j.llllIIIllIIl[2] = 2;
        j.llllIIIllIIl[3] = -(0xFFFFDDC7 & 0x7BBA) & (0xFFFFDFFF & Short.MAX_VALUE);
        j.llllIIIllIIl[4] = (0x6A ^ 1) + (0xCC ^ 0xC3) - (0x2D ^ 0x5F) + (7 ^ 0x70);
        j.llllIIIllIIl[5] = 3;
        j.llllIIIllIIl[6] = -(0xFFFFDF95 & 0x616B) & (0xFFFFEFFF & 0x577F);
        j.llllIIIllIIl[7] = 69 + 66 - 64 + 57;
        j.llllIIIllIIl[8] = 0x7D ^ 0x79;
        j.llllIIIllIIl[9] = 0x15 ^ 0x1D;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public int W() {
        return this.projectileID;
    }

    private static String lIIIllllIIIlIlI(String var1, String var19) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llllIIIllIIl[2], var3);
            return new String(var2.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    static {
        j.lIIIllllIIlIlII();
        j.lIIIllllIIIlllI();
        MAGIC = new j(llllIIIllIIl[3], Prayer.PROTECT_FROM_MAGIC, llllIIIllIIl[4]);
        RANGED = new j(llllIIIllIIl[6], Prayer.PROTECT_FROM_MISSILES, llllIIIllIIl[7]);
        j[] jArray = new j[llllIIIllIIl[2]];
        jArray[j.llllIIIllIIl[0]] = MAGIC;
        jArray[j.llllIIIllIIl[1]] = RANGED;
        $VALUES = jArray;
    }

    private j(int n3, Prayer prayer, int n4) {
        this.projectileID = n3;
        this.prayer = prayer;
        this.spriteID = n4;
    }

    private static void lIIIllllIIIlllI() {
        llllIIIlIllI = new String[llllIIIllIIl[8]];
        j.llllIIIlIllI[j.llllIIIllIIl[0]] = j."_";
        j.llllIIIlIllI[j.llllIIIllIIl[1]] = j."";
        j.llllIIIlIllI[j.llllIIIllIIl[2]] = j."MAGIC";
        j.llllIIIlIllI[j.llllIIIllIIl[5]] = j."RANGED";
    }

    private static String lIIIllllIIIllIl(String var13, String var7) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var5 = var7.toCharArray();
        int var12 = llllIIIllIIl[0];
        char[] var15 = var13.toCharArray();
        int var17 = var15.length;
        int var11 = llllIIIllIIl[0];
        while (j.lIIIllllIIlIlIl(var11, var17)) {
            char var18 = var15[var11];
            var9.append((char)(var18 ^ var5[var12 % var5.length]));
            0;
            ++var12;
            ++var11;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lIIIllllIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllllIIIlIll(String var6, String var10) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llllIIIllIIl[9]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llllIIIllIIl[2], var8);
            return new String(var14.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    public int Y() {
        return this.spriteID;
    }

    public Prayer X() {
        return this.prayer;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llllIIIllIIl[0]) + string.substring(llllIIIllIIl[1]).replaceAll(llllIIIlIllI[llllIIIllIIl[0]], llllIIIlIllI[llllIIIllIIl[1]]).toLowerCase();
    }
}

