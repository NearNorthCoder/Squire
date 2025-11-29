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

    private static String lIlIlIlIIlIIlIl(String llllllllllllllIlllllIIllllIlllll, String llllllllllllllIlllllIIllllIlllIl) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlllllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIlllllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIlllllIIIIl.init(lIIlIIllIlIll[2], llllllllllllllIlllllIIlllllIIIll);
            return new String(llllllllllllllIlllllIIlllllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIlllllIIIII) {
            llllllllllllllIlllllIIlllllIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIIlIIlII(String llllllllllllllIlllllIIllllllIIlI, String llllllllllllllIlllllIIllllllIIll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlllllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllllllIIll.getBytes(StandardCharsets.UTF_8)), lIIlIIllIlIll[3]), "DES");
            Cipher llllllllllllllIlllllIIllllllIlll = Cipher.getInstance("DES");
            llllllllllllllIlllllIIllllllIlll.init(lIIlIIllIlIll[2], llllllllllllllIlllllIIlllllllIIl);
            return new String(llllllllllllllIlllllIIllllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIllllllIllI) {
            llllllllllllllIlllllIIllllllIllI.printStackTrace();
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
        i.lIIlIIllIlIIl[i.lIIlIIllIlIll[0]] = i.lIlIlIlIIlIIlII("3Svf7W1Fnp0=", "pcfnA");
        i.lIIlIIllIlIIl[i.lIIlIIllIlIll[1]] = i.lIlIlIlIIlIIlIl("xWKiqzDkasmZ2ODbUMRJGw==", "WweJg");
    }

    private static void lIlIlIlIIllIIIl() {
        lIIlIIllIlIll = new int[4];
        i.lIIlIIllIlIll[0] = (44 + 138 - 169 + 155 ^ 110 + 27 - 130 + 144) & (6 ^ 0x12 ^ (0x4F ^ 0x64) ^ -" ".length());
        i.lIIlIIllIlIll[1] = " ".length();
        i.lIIlIIllIlIll[2] = "  ".length();
        i.lIIlIIllIlIll[3] = 0x2A ^ 0x22;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private i(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }
}

