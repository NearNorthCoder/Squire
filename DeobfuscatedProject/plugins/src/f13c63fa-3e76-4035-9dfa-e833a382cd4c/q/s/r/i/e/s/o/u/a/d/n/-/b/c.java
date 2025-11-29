/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class c
extends Enum<c> {
    private static /* synthetic */ int[] llIlllllllI;
    private static /* synthetic */ String[] llIlllllIll;
    public static final /* synthetic */ /* enum */ c RIGOUR;
    private static final /* synthetic */ c[] $VALUES;
    private final /* synthetic */ Prayer[] prayers;
    public static final /* synthetic */ /* enum */ c EAGLE_EYE;

    static {
        c.lIlIllIIlIIIIl();
        c.lIlIllIIIlIlll();
        Prayer[] prayerArray = new Prayer[llIlllllllI[1]];
        prayerArray[c.llIlllllllI[0]] = Prayer.RIGOUR;
        RIGOUR = new c(prayerArray);
        Prayer[] prayerArray2 = new Prayer[llIlllllllI[2]];
        prayerArray2[c.llIlllllllI[0]] = Prayer.EAGLE_EYE;
        prayerArray2[c.llIlllllllI[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new c(prayerArray2);
        c[] cArray = new c[llIlllllllI[2]];
        cArray[c.llIlllllllI[0]] = RIGOUR;
        cArray[c.llIlllllllI[1]] = EAGLE_EYE;
        $VALUES = cArray;
    }

    private static String lIlIllIIIlIllI(String llllllllllllllllIIlIlIIlIIlIlIll, String llllllllllllllllIIlIlIIlIIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIlIIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIlIIlIllIl.init(llIlllllllI[2], llllllllllllllllIIlIlIIlIIlIlllI);
            return new String(llllllllllllllllIIlIlIIlIIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIlIIlIllII) {
            llllllllllllllllIIlIlIIlIIlIllII.printStackTrace();
            return null;
        }
    }

    private c(Prayer ... prayerArray) {
        this.prayers = prayerArray;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIlIllIIIlIlll() {
        llIlllllIll = new String[llIlllllllI[2]];
        c.llIlllllIll[c.llIlllllllI[0]] = c.lIlIllIIIlIlIl("Musw/lisPB8=", "oYQEH");
        c.llIlllllIll[c.llIlllllllI[1]] = c.lIlIllIIIlIllI("W9oB2nt4nRd3kCu/0/i4dw==", "qZqZf");
    }

    private static String lIlIllIIIlIlIl(String llllllllllllllllIIlIlIIlIIIlllII, String llllllllllllllllIIlIlIIlIIIlllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIlIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), llIlllllllI[3]), "DES");
            Cipher llllllllllllllllIIlIlIIlIIlIIIII = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIlIIlIIIII.init(llIlllllllI[2], llllllllllllllllIIlIlIIlIIlIIIIl);
            return new String(llllllllllllllllIIlIlIIlIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIlIIIlllll) {
            llllllllllllllllIIlIlIIlIIIlllll.printStackTrace();
            return null;
        }
    }

    public Prayer[] h() {
        return this.prayers;
    }

    private static void lIlIllIIlIIIIl() {
        llIlllllllI = new int[4];
        c.llIlllllllI[0] = (0x3F ^ 0x13 ^ (0xA6 ^ 0xC7)) & (134 + 3 - -91 + 18 ^ 104 + 139 - 220 + 164 ^ -" ".length());
        c.llIlllllllI[1] = " ".length();
        c.llIlllllllI[2] = "  ".length();
        c.llIlllllllI[3] = 0x5F ^ 0x57;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }
}

