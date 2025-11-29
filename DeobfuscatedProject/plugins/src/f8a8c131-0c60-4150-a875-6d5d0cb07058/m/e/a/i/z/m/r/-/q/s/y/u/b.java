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
        b.lIllIIlIIlIll[1] = " ".length();
        b.lIllIIlIIlIll[2] = "  ".length();
        b.lIllIIlIIlIll[3] = 0xB ^ 3;
    }

    private static void llIIIlIllllIlIl() {
        lIllIIlIIlIlI = new String[lIllIIlIIlIll[2]];
        b.lIllIIlIIlIlI[b.lIllIIlIIlIll[0]] = b.llIIIlIllllIIll("C/KgXSASY7k=", "prMhW");
        b.lIllIIlIIlIlI[b.lIllIIlIIlIll[1]] = b.llIIIlIllllIlII("C6ukG6p8cmo5xFXfFVMfaQ==", "CuiIv");
    }

    private static String llIIIlIllllIlII(String llllllllllllllIllIIlIlIIIllIIlll, String llllllllllllllIllIIlIlIIIllIlIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIIIllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIIllIlIII.getBytes(StandardCharsets.UTF_8)), lIllIIlIIlIll[3]), "DES");
            Cipher llllllllllllllIllIIlIlIIIllIlIll = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIIIllIlIll.init(lIllIIlIIlIll[2], llllllllllllllIllIIlIlIIIllIllII);
            return new String(llllllllllllllIllIIlIlIIIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIIIllIlIlI) {
            llllllllllllllIllIIlIlIIIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIllllIIll(String llllllllllllllIllIIlIlIIIlllIlII, String llllllllllllllIllIIlIlIIIlllIIll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIIIllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIlIIIllllIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIlIIIllllIII.init(lIllIIlIIlIll[2], llllllllllllllIllIIlIlIIIllllIIl);
            return new String(llllllllllllllIllIIlIlIIIllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIlIIIlllIlll) {
            llllllllllllllIllIIlIlIIIlllIlll.printStackTrace();
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

