/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class j
extends Enum<j> {
    public static final /* synthetic */ /* enum */ j EAGLE_EYE;
    public static final /* synthetic */ /* enum */ j RIGOUR;
    private static /* synthetic */ int[] lIllIlIllIIII;
    private final /* synthetic */ Prayer prayer;
    private static final /* synthetic */ j[] $VALUES;
    private static /* synthetic */ String[] lIllIlIlIlllI;

    private static String llIIlIIIIIlIllI(String llllllllllllllIllIIIllIlIllIIlll, String llllllllllllllIllIIIllIlIllIIllI) {
        llllllllllllllIllIIIllIlIllIIlll = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIlIllIlIlI = new StringBuilder();
        char[] llllllllllllllIllIIIllIlIllIlIIl = llllllllllllllIllIIIllIlIllIIllI.toCharArray();
        int llllllllllllllIllIIIllIlIllIlIII = lIllIlIllIIII[0];
        char[] llllllllllllllIllIIIllIlIllIIIlI = llllllllllllllIllIIIllIlIllIIlll.toCharArray();
        int llllllllllllllIllIIIllIlIllIIIIl = llllllllllllllIllIIIllIlIllIIIlI.length;
        int llllllllllllllIllIIIllIlIllIIIII = lIllIlIllIIII[0];
        while (j.llIIlIIIIIllIll(llllllllllllllIllIIIllIlIllIIIII, llllllllllllllIllIIIllIlIllIIIIl)) {
            char llllllllllllllIllIIIllIlIllIllIl = llllllllllllllIllIIIllIlIllIIIlI[llllllllllllllIllIIIllIlIllIIIII];
            llllllllllllllIllIIIllIlIllIlIlI.append((char)(llllllllllllllIllIIIllIlIllIllIl ^ llllllllllllllIllIIIllIlIllIlIIl[llllllllllllllIllIIIllIlIllIlIII % llllllllllllllIllIIIllIlIllIlIIl.length]));
            0;
            ++llllllllllllllIllIIIllIlIllIlIII;
            ++llllllllllllllIllIIIllIlIllIIIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIllIlIllIlIlI);
    }

    private static boolean llIIlIIIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIIIlIlll() {
        lIllIlIlIlllI = new String[lIllIlIllIIII[2]];
        j.lIllIlIlIlllI[j.lIllIlIllIIII[0]] = j."EAGLE_EYE";
        j.lIllIlIlIlllI[j.lIllIlIllIIII[1]] = j."RIGOUR";
    }

    private j(Prayer prayer) {
        this.prayer = prayer;
    }

    static {
        j.llIIlIIIIIllIlI();
        j.llIIlIIIIIlIlll();
        EAGLE_EYE = new j(Prayer.EAGLE_EYE);
        RIGOUR = new j(Prayer.RIGOUR);
        j[] jArray = new j[lIllIlIllIIII[2]];
        jArray[j.lIllIlIllIIII[0]] = EAGLE_EYE;
        jArray[j.lIllIlIllIIII[1]] = RIGOUR;
        $VALUES = jArray;
    }

    private static void llIIlIIIIIllIlI() {
        lIllIlIllIIII = new int[3];
        j.lIllIlIllIIII[0] = (0xC5 ^ 0x90) & ~(0x33 ^ 0x66);
        j.lIllIlIllIIII[1] = 1;
        j.lIllIlIllIIII[2] = 2;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static String llIIlIIIIIlIlIl(String llllllllllllllIllIIIllIlIllllIlI, String llllllllllllllIllIIIllIlIllllIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIlIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIllIlIllllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIllIlIllllllI.init(lIllIlIllIIII[2], llllllllllllllIllIIIllIlIlllllll);
            return new String(llllllllllllllIllIIIllIlIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllIlIlllllIl) {
            llllllllllllllIllIIIllIlIlllllIl.printStackTrace();
            return null;
        }
    }

    public Prayer r() {
        return this.prayer;
    }
}

