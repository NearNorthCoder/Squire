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

public final class BEnum
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b PICKPOCKETING;
    public static final /* synthetic */ /* enum */ b CHESTS;
    public static final /* synthetic */ /* enum */ b BLACK_JACK;
    private static /* synthetic */ int[] lIIllIlllIlII;
    private static /* synthetic */ String[] lIIllIlllIIll;
    public static final /* synthetic */ /* enum */ b STALLS;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b ROGUES_DEN;

    private static boolean lIllIIIlllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIIllIlllll(String var15, String var5) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIIllIlllIlII[2], var6);
            return new String(var18.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public String toString() {
        String string = super.toString();
        char c2 = string.charAt(lIIllIlllIlII[0]);
        return c2 + string.replaceAll(lIIllIlllIIll[lIIllIlllIlII[0]], lIIllIlllIIll[lIIllIlllIlII[1]]).substring(lIIllIlllIlII[1]).toLowerCase();
    }

    private static String lIllIIIllIlllIl(String var19, String var11) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIIllIlllIlII[8]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIllIlllIlII[2], var12);
            return new String(var16.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIlllIIIIl() {
        lIIllIlllIlII = new int[9];
        b.lIIllIlllIlII[0] = (0x2A ^ 0x1B) & ~(0x80 ^ 0xB1);
        b.lIIllIlllIlII[1] = 1;
        b.lIIllIlllIlII[2] = 2;
        b.lIIllIlllIlII[3] = 3;
        b.lIIllIlllIlII[4] = 0x82 ^ 0x86;
        b.lIIllIlllIlII[5] = 134 + 141 - 187 + 87 ^ 134 + 31 - 154 + 159;
        b.lIIllIlllIlII[6] = 0x98 ^ 0x9E;
        b.lIIllIlllIlII[7] = 9 ^ 0xE;
        b.lIIllIlllIlII[8] = 0x62 ^ 0x4A ^ (0xA1 ^ 0x81);
    }

    private static String lIllIIIllIllllI(String var14, String var7) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var17 = var7.toCharArray();
        int var4 = lIIllIlllIlII[0];
        char[] var9 = var14.toCharArray();
        int var10 = var9.length;
        int var3 = lIIllIlllIlII[0];
        while (b.lIllIIIlllIIIlI(var3, var10)) {
            char var2 = var9[var3];
            var13.append((char)(var2 ^ var17[var4 % var17.length]));
            0;
            ++var4;
            ++var3;
            0;
            if ((0xE ^ 0xA) != 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static void lIllIIIlllIIIII() {
        lIIllIlllIIll = new String[lIIllIlllIlII[7]];
        b.lIIllIlllIIll[b.lIIllIlllIlII[0]] = b."_";
        b.lIIllIlllIIll[b.lIIllIlllIlII[1]] = b." ";
        b.lIIllIlllIIll[b.lIIllIlllIlII[2]] = b."BLACK_JACK";
        b.lIIllIlllIIll[b.lIIllIlllIlII[3]] = b."PICKPOCKETING";
        b.lIIllIlllIIll[b.lIIllIlllIlII[4]] = b."STALLS";
        b.lIIllIlllIIll[b.lIIllIlllIlII[5]] = b."CHESTS";
        b.lIIllIlllIIll[b.lIIllIlllIlII[6]] = b."ROGUES_DEN";
    }

    static {
        b.lIllIIIlllIIIIl();
        b.lIllIIIlllIIIII();
        BLACK_JACK = new b();
        PICKPOCKETING = new b();
        STALLS = new b();
        CHESTS = new b();
        ROGUES_DEN = new b();
        b[] bArray = new b[lIIllIlllIlII[5]];
        bArray[b.lIIllIlllIlII[0]] = BLACK_JACK;
        bArray[b.lIIllIlllIlII[1]] = PICKPOCKETING;
        bArray[b.lIIllIlllIlII[2]] = STALLS;
        bArray[b.lIIllIlllIlII[3]] = CHESTS;
        bArray[b.lIIllIlllIlII[4]] = ROGUES_DEN;
        $VALUES = bArray;
    }
}

