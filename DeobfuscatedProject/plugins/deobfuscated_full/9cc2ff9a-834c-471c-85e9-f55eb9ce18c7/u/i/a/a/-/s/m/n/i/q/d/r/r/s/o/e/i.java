/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class i
extends Enum<i> {
    private static /* synthetic */ String[] lIIlIIllIlIIl;
    public static final /* synthetic */ /* enum */ i RIGOUR;
    private static /* synthetic */ int[] lIIlIIllIlIll;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ /* enum */ i EAGLE_EYE;
    private final /* synthetic */ Prayer[] prayers;

    private static String lIlIlIlIIlIIlIl(String var3, String var9) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIIlIIllIlIll[2], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIIlIIlII(String var5, String var7) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIlIIllIlIll[3]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIIlIIllIlIll[2], var10);
            return new String(var4.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public Prayer[] z() {
        return this.prayers;
    }

    static {
        i.lIlIlIlIIllIIIl();
        i.lIlIlIlIIlIIlll();
        Prayer[] prayerArray = new Prayer[lIIlIIllIlIll[1]];
        prayerArray[i.lIIlIIllIlIll[0]] = Prayer.RIGOUR;
        RIGOUR = new i(prayerArray);
        Prayer[] prayerArray2 = new Prayer[lIIlIIllIlIll[2]];
        prayerArray2[i.lIIlIIllIlIll[0]] = Prayer.EAGLE_EYE;
        prayerArray2[i.lIIlIIllIlIll[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new i(prayerArray2);
        i[] iArray = new i[lIIlIIllIlIll[2]];
        iArray[i.lIIlIIllIlIll[0]] = RIGOUR;
        iArray[i.lIIlIIllIlIll[1]] = EAGLE_EYE;
        $VALUES = iArray;
    }

    private static void lIlIlIlIIlIIlll() {
        lIIlIIllIlIIl = new String[lIIlIIllIlIll[2]];
        i.lIIlIIllIlIIl[i.lIIlIIllIlIll[0]] = i."RIGOUR";
        i.lIIlIIllIlIIl[i.lIIlIIllIlIll[1]] = i."EAGLE_EYE";
    }

    private static void lIlIlIlIIllIIIl() {
        lIIlIIllIlIll = new int[4];
        i.lIIlIIllIlIll[0] = (44 + 138 - 169 + 155 ^ 110 + 27 - 130 + 144) & (6 ^ 0x12 ^ (0x4F ^ 0x64) ^ -1);
        i.lIIlIIllIlIll[1] = 1;
        i.lIIlIIllIlIll[2] = 2;
        i.lIIlIIllIlIll[3] = 0x2A ^ 0x22;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private i(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }
}

