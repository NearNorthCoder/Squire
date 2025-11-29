/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class i
extends Enum<i> {
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ /* enum */ i LUMBRIDGE;
    private static final /* synthetic */ i[] $VALUES;
    private static /* synthetic */ int[] lllllIllllll;
    private static /* synthetic */ String[] lllllIlllllI;

    private static void lIIlIlIIIIIllIl() {
        lllllIlllllI = new String[lllllIllllll[3]];
        i.lllllIlllllI[i.lllllIllllll[0]] = i."LUMBRIDGE";
    }

    private static void lIIlIlIIIIIlllI() {
        lllllIllllll = new int[5];
        i.lllllIllllll[0] = (93 + 191 - 211 + 180 ^ 16 + 176 - 30 + 15) & (230 + 115 - 246 + 139 ^ 6 + 81 - 62 + 137 ^ -1);
        i.lllllIllllll[1] = 0xFFFFDFBF & 0x2CDD;
        i.lllllIllllll[2] = 0xFFFFAE4F & 0x5DFB;
        i.lllllIllllll[3] = 1;
        i.lllllIllllll[4] = 2;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private i(WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    public WorldPoint i() {
        return this.location;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static String lIIlIlIIIIIllII(String lllllllllllllllIIlIIlIIIIIIIIlII, String lllllllllllllllIIlIIlIIIIIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIIIIIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIIIIIIIlIII.init(lllllIllllll[4], lllllllllllllllIIlIIlIIIIIIIlIIl);
            return new String(lllllllllllllllIIlIIlIIIIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIIIIIIIlll) {
            lllllllllllllllIIlIIlIIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    static {
        i.lIIlIlIIIIIlllI();
        i.lIIlIlIIIIIllIl();
        LUMBRIDGE = new i(new WorldPoint(lllllIllllll[1], lllllIllllll[2], lllllIllllll[0]));
        i[] iArray = new i[lllllIllllll[3]];
        iArray[i.lllllIllllll[0]] = LUMBRIDGE;
        $VALUES = iArray;
    }
}

