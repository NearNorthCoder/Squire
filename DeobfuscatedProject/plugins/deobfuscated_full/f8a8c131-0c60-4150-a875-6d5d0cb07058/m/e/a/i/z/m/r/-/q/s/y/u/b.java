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

public final class b
extends Enum<b> {
    private static /* synthetic */ String[] lIllIIlIIlIlI;
    private static final /* synthetic */ b[] $VALUES;
    private final /* synthetic */ Prayer[] prayers;
    private static /* synthetic */ int[] lIllIIlIIlIll;
    public static final /* synthetic */ /* enum */ b EAGLE_EYE;
    public static final /* synthetic */ /* enum */ b RIGOUR;

    private static void llIIIlIllllIllI() {
        lIllIIlIIlIll = new int[4];
        b.lIllIIlIIlIll[0] = (0xBC ^ 0x83) & ~(0xA0 ^ 0x9F);
        b.lIllIIlIIlIll[1] = 1;
        b.lIllIIlIIlIll[2] = 2;
        b.lIllIIlIIlIll[3] = 0xB ^ 3;
    }

    private static void llIIIlIllllIlIl() {
        lIllIIlIIlIlI = new String[lIllIIlIIlIll[2]];
        b.lIllIIlIIlIlI[b.lIllIIlIIlIll[0]] = b."RIGOUR";
        b.lIllIIlIIlIlI[b.lIllIIlIIlIll[1]] = b."EAGLE_EYE";
    }

    private static String llIIIlIllllIlII(String var2, String var5) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIllIIlIIlIll[3]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIllIIlIIlIll[2], var10);
            return new String(var4.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIllllIIll(String var8, String var1) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllIIlIIlIll[2], var7);
            return new String(var6.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private b(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }

    public Prayer[] a() {
        return this.prayers;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    static {
        b.llIIIlIllllIllI();
        b.llIIIlIllllIlIl();
        Prayer[] prayerArray = new Prayer[lIllIIlIIlIll[1]];
        prayerArray[b.lIllIIlIIlIll[0]] = Prayer.RIGOUR;
        RIGOUR = new b(prayerArray);
        Prayer[] prayerArray2 = new Prayer[lIllIIlIIlIll[2]];
        prayerArray2[b.lIllIIlIIlIll[0]] = Prayer.EAGLE_EYE;
        prayerArray2[b.lIllIIlIIlIll[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new b(prayerArray2);
        b[] bArray = new b[lIllIIlIIlIll[2]];
        bArray[b.lIllIIlIIlIll[0]] = RIGOUR;
        bArray[b.lIllIIlIIlIll[1]] = EAGLE_EYE;
        $VALUES = bArray;
    }
}

