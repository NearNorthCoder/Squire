/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.HeadIcon
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.HeadIcon;

public final class j
extends Enum<j> {
    private static final /* synthetic */ j[] $VALUES;
    public static final /* synthetic */ /* enum */ j RANGED;
    public static final /* synthetic */ /* enum */ j MAGIC;
    private static /* synthetic */ String[] lIlIlIIIIlIII;
    private final /* synthetic */ HeadIcon protection;
    public static final /* synthetic */ /* enum */ j STAB;
    private static /* synthetic */ int[] lIlIlIIIIlIIl;
    public static final /* synthetic */ /* enum */ j CRUSH;
    private final /* synthetic */ int styleSpriteId;
    public static final /* synthetic */ /* enum */ j SLASH;
    static /* synthetic */ j[] MELEE_STYLES;

    public int L() {
        return this.styleSpriteId;
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static boolean lIllllIlIIIllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.lIllllIlIIIlIll();
        j.lIllllIlIIIlIlI();
        STAB = new j(HeadIcon.MELEE, lIlIlIIIIlIIl[1]);
        SLASH = new j(HeadIcon.MELEE, lIlIlIIIIlIIl[3]);
        CRUSH = new j(HeadIcon.MELEE, lIlIlIIIIlIIl[5]);
        RANGED = new j(HeadIcon.RANGED, lIlIlIIIIlIIl[7]);
        MAGIC = new j(HeadIcon.MAGIC, lIlIlIIIIlIIl[9]);
        j[] jArray = new j[lIlIlIIIIlIIl[10]];
        jArray[j.lIlIlIIIIlIIl[0]] = STAB;
        jArray[j.lIlIlIIIIlIIl[2]] = SLASH;
        jArray[j.lIlIlIIIIlIIl[4]] = CRUSH;
        jArray[j.lIlIlIIIIlIIl[6]] = RANGED;
        jArray[j.lIlIlIIIIlIIl[8]] = MAGIC;
        $VALUES = jArray;
        j[] jArray2 = new j[lIlIlIIIIlIIl[6]];
        jArray2[j.lIlIlIIIIlIIl[0]] = STAB;
        jArray2[j.lIlIlIIIIlIIl[2]] = SLASH;
        jArray2[j.lIlIlIIIIlIIl[4]] = CRUSH;
        MELEE_STYLES = jArray2;
    }

    private static void lIllllIlIIIlIlI() {
        lIlIlIIIIlIII = new String[lIlIlIIIIlIIl[10]];
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[0]] = j.lIllllIlIIIlIII("ODAgJw==", "kdaek");
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[2]] = j.lIllllIlIIIlIII("BzswPgI=", "TwqmJ");
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[4]] = j.lIllllIlIIIlIIl("QKzqAI3B37A=", "nGEHz");
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[6]] = j.lIllllIlIIIlIIl("pNgYYhFeU54=", "MnEJj");
        j.lIlIlIIIIlIII[j.lIlIlIIIIlIIl[8]] = j.lIllllIlIIIlIII("JCANJwc=", "iaJnD");
    }

    public HeadIcon K() {
        return this.protection;
    }

    private j(HeadIcon headIcon, int n3) {
        this.protection = headIcon;
        this.styleSpriteId = n3;
    }

    private static void lIllllIlIIIlIll() {
        lIlIlIIIIlIIl = new int[12];
        j.lIlIlIIIIlIIl[0] = (0x32 ^ 0x2C ^ (0x3A ^ 0x3C)) & (103 + 204 - 168 + 80 ^ 164 + 131 - 169 + 69 ^ -" ".length());
        j.lIlIlIIIIlIIl[1] = 102 + 228 - 304 + 214;
        j.lIlIlIIIIlIIl[2] = " ".length();
        j.lIlIlIIIIlIIl[3] = (0x53 ^ 0x5E) + (4 + 161 - 27 + 31) - -(0x23 ^ 0x2E) + (0x15 ^ 0x3E);
        j.lIlIlIIIIlIIl[4] = "  ".length();
        j.lIlIlIIIIlIIl[5] = 17 + 135 - 17 + 33 + (0x3B ^ 0x32) - -(0xE1 ^ 0xAB) + (0x49 ^ 0x4D);
        j.lIlIlIIIIlIIl[6] = "   ".length();
        j.lIlIlIIIIlIIl[7] = (0xC ^ 0x27) + (109 + 99 - 198 + 175) - (35 + 141 - 110 + 87) + (0xD0 ^ 0xAD);
        j.lIlIlIIIIlIIl[8] = 0x7A ^ 0x7E;
        j.lIlIlIIIIlIIl[9] = 50 + 90 - 24 + 86;
        j.lIlIlIIIIlIIl[10] = 124 + 3 - 46 + 83 ^ 155 + 157 - 284 + 133;
        j.lIlIlIIIIlIIl[11] = 0x19 ^ 0x33 ^ (0x2D ^ 0xF);
    }

    private static String lIllllIlIIIlIII(String llllllllllllllIllIllIIlIIIlllIIl, String llllllllllllllIllIllIIlIIIllIIll) {
        llllllllllllllIllIllIIlIIIlllIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIllIIlIIIllIlll = new StringBuilder();
        char[] llllllllllllllIllIllIIlIIIllIllI = llllllllllllllIllIllIIlIIIllIIll.toCharArray();
        int llllllllllllllIllIllIIlIIIllIlIl = lIlIlIIIIlIIl[0];
        char[] llllllllllllllIllIllIIlIIIlIllll = llllllllllllllIllIllIIlIIIlllIIl.toCharArray();
        int llllllllllllllIllIllIIlIIIlIlllI = llllllllllllllIllIllIIlIIIlIllll.length;
        int llllllllllllllIllIllIIlIIIlIllIl = lIlIlIIIIlIIl[0];
        while (j.lIllllIlIIIllII(llllllllllllllIllIllIIlIIIlIllIl, llllllllllllllIllIllIIlIIIlIlllI)) {
            char llllllllllllllIllIllIIlIIIlllIlI = llllllllllllllIllIllIIlIIIlIllll[llllllllllllllIllIllIIlIIIlIllIl];
            llllllllllllllIllIllIIlIIIllIlll.append((char)(llllllllllllllIllIllIIlIIIlllIlI ^ llllllllllllllIllIllIIlIIIllIllI[llllllllllllllIllIllIIlIIIllIlIl % llllllllllllllIllIllIIlIIIllIllI.length]));
            "".length();
            ++llllllllllllllIllIllIIlIIIllIlIl;
            ++llllllllllllllIllIllIIlIIIlIllIl;
            "".length();
            if ("  ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIllIIlIIIllIlll);
    }

    private static String lIllllIlIIIlIIl(String llllllllllllllIllIllIIlIIIlIIIlI, String llllllllllllllIllIllIIlIIIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIllIIlIIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIIIlIIl[11]), "DES");
            Cipher llllllllllllllIllIllIIlIIIlIIllI = Cipher.getInstance("DES");
            llllllllllllllIllIllIIlIIIlIIllI.init(lIlIlIIIIlIIl[4], llllllllllllllIllIllIIlIIIlIIlll);
            return new String(llllllllllllllIllIllIIlIIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIlIIIlIIlIl) {
            llllllllllllllIllIllIIlIIIlIIlIl.printStackTrace();
            return null;
        }
    }

    public boolean J() {
        return List.of(MELEE_STYLES).contains((Object)this);
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }
}

