/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class a
extends Enum<a> {
    private final /* synthetic */ Prayer[] prayers;
    public static final /* synthetic */ /* enum */ a MYSTIC_MIGHT;
    public static final /* synthetic */ /* enum */ a AUGURY;
    private static final /* synthetic */ a[] $VALUES;
    private static /* synthetic */ int[] lIllIIlIllllI;
    private static /* synthetic */ String[] lIllIIlIlllIl;

    private static String llIIIllIIlIllIl(String var12, String var14) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var13 = var14.toCharArray();
        int var2 = lIllIIlIllllI[0];
        char[] var4 = var12.toCharArray();
        int var11 = var4.length;
        int var10 = lIllIIlIllllI[0];
        while (a.llIIIllIIllIIIl(var10, var11)) {
            char var5 = var4[var10];
            var1.append((char)(var5 ^ var13[var2 % var13.length]));
            0;
            ++var2;
            ++var10;
            0;
            if (-1 <= ((0x63 ^ 0x59) & ~(0x78 ^ 0x42))) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static void llIIIllIIlIllll() {
        lIllIIlIlllIl = new String[lIllIIlIllllI[1]];
        a.lIllIIlIlllIl[a.lIllIIlIllllI[0]] = a."MYSTIC_MIGHT";
        a.lIllIIlIlllIl[a.lIllIIlIllllI[2]] = a."AUGURY";
    }

    private static String llIIIllIIlIlllI(String var6, String var3) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIllIIlIllllI[3]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIllIIlIllllI[1], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public Prayer[] a() {
        return this.prayers;
    }

    static {
        a.llIIIllIIllIIII();
        a.llIIIllIIlIllll();
        Prayer[] prayerArray = new Prayer[lIllIIlIllllI[1]];
        prayerArray[a.lIllIIlIllllI[0]] = Prayer.MYSTIC_MIGHT;
        prayerArray[a.lIllIIlIllllI[2]] = Prayer.STEEL_SKIN;
        MYSTIC_MIGHT = new a(prayerArray);
        Prayer[] prayerArray2 = new Prayer[lIllIIlIllllI[2]];
        prayerArray2[a.lIllIIlIllllI[0]] = Prayer.AUGURY;
        AUGURY = new a(prayerArray2);
        a[] aArray = new a[lIllIIlIllllI[1]];
        aArray[a.lIllIIlIllllI[0]] = MYSTIC_MIGHT;
        aArray[a.lIllIIlIllllI[2]] = AUGURY;
        $VALUES = aArray;
    }

    private static boolean llIIIllIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private a(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }

    private static void llIIIllIIllIIII() {
        lIllIIlIllllI = new int[4];
        a.lIllIIlIllllI[0] = (0xA8 ^ 0x97 ^ (0x3E ^ 4)) & (0x3A ^ 0x3D ^ 2 ^ -1);
        a.lIllIIlIllllI[1] = 2;
        a.lIllIIlIllllI[2] = 1;
        a.lIllIIlIllllI[3] = 22 + 72 - -21 + 28 ^ 111 + 102 - 197 + 119;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }
}

