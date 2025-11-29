/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public final class c
extends Enum<c> {
    private static /* synthetic */ String[] lIIlllIIIIllI;
    private final /* synthetic */ WorldPoint anchor;
    private final /* synthetic */ WorldPoint curtainLocation;
    private static final /* synthetic */ c[] $VALUES;
    private final /* synthetic */ WorldPoint lureTo;
    private final /* synthetic */ WorldArea area;
    public static final /* synthetic */ /* enum */ c LADDER_HOUSE;
    public static final /* synthetic */ /* enum */ c MENAPHITE_HOUSE;
    private static /* synthetic */ int[] lIIlllIIIIlll;

    private static boolean lIllIIlIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    public WorldPoint s() {
        return this.curtainLocation;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(WorldArea worldArea, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3) {
        this.area = worldArea;
        this.lureTo = worldPoint;
        this.anchor = worldPoint2;
        this.curtainLocation = worldPoint3;
    }

    private static String lIllIIlIIllIIII(String llllllllllllllIlllIllIlIIIIllllI, String llllllllllllllIlllIllIlIIIIlllll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIlIIIlIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIlIIIlIIIlI.init(lIIlllIIIIlll[18], llllllllllllllIlllIllIlIIIlIIIll);
            return new String(llllllllllllllIlllIllIlIIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlIIIlIIIIl) {
            llllllllllllllIlllIllIlIIIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIllIIIl() {
        lIIlllIIIIllI = new String[lIIlllIIIIlll[18]];
        c.lIIlllIIIIllI[c.lIIlllIIIIlll[0]] = c.lIllIIlIIlIllll("Flk4K7s2ocDw5QuV+c4vHA==", "dLBoi");
        c.lIIlllIIIIllI[c.lIIlllIIIIlll[8]] = c.lIllIIlIIllIIII("HmuVINXNfSeo5zNEU5hWaw==", "vQhwK");
    }

    private static String lIllIIlIIlIllll(String llllllllllllllIlllIllIlIIIIlIIll, String llllllllllllllIlllIllIlIIIIlIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIIIlIIII.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIlll[19]), "DES");
            Cipher llllllllllllllIlllIllIlIIIIlIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlIIIIlIlIl.init(lIIlllIIIIlll[18], llllllllllllllIlllIllIlIIIIlIllI);
            return new String(llllllllllllllIlllIllIlIIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlIIIIlIlII) {
            llllllllllllllIlllIllIlIIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIllIlII(int n2) {
        return n2 != 0;
    }

    public WorldArea p() {
        return this.area;
    }

    /*
     * WARNING - void declaration
     */
    public static c b(WorldPoint worldPoint) {
        void llllllllllllllIlllIllIlIIIlIlIlI;
        c[] cArray = c.values();
        int n2 = cArray.length;
        int llllllllllllllIlllIllIlIIIlIlIIl = lIIlllIIIIlll[0];
        while (c.lIllIIlIIllIIll(llllllllllllllIlllIllIlIIIlIlIIl, (int)llllllllllllllIlllIllIlIIIlIlIlI)) {
            WorldPoint llllllllllllllIlllIllIlIIIlIllII;
            void llllllllllllllIlllIllIlIIIlIlIll;
            void llllllllllllllIlllIllIlIIIlIlIII = llllllllllllllIlllIllIlIIIlIlIll[llllllllllllllIlllIllIlIIIlIlIIl];
            if (c.lIllIIlIIllIlII(llllllllllllllIlllIllIlIIIlIlIII.p().contains(llllllllllllllIlllIllIlIIIlIllII) ? 1 : 0)) {
                return llllllllllllllIlllIllIlIIIlIlIII;
            }
            ++llllllllllllllIlllIllIlIIIlIlIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return null;
    }

    public WorldPoint q() {
        return this.lureTo;
    }

    static {
        c.lIllIIlIIllIIlI();
        c.lIllIIlIIllIIIl();
        LADDER_HOUSE = new c(new WorldArea(lIIlllIIIIlll[1], lIIlllIIIIlll[2], lIIlllIIIIlll[3], lIIlllIIIIlll[4], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[5], lIIlllIIIIlll[2], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[1], lIIlllIIIIlll[6], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[5], lIIlllIIIIlll[7], lIIlllIIIIlll[0]));
        MENAPHITE_HOUSE = new c(new WorldArea(lIIlllIIIIlll[9], lIIlllIIIIlll[10], lIIlllIIIIlll[11], lIIlllIIIIlll[4], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[12], lIIlllIIIIlll[13], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[14], lIIlllIIIIlll[15], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[16], lIIlllIIIIlll[17], lIIlllIIIIlll[0]));
        c[] cArray = new c[lIIlllIIIIlll[18]];
        cArray[c.lIIlllIIIIlll[0]] = LADDER_HOUSE;
        cArray[c.lIIlllIIIIlll[8]] = MENAPHITE_HOUSE;
        $VALUES = cArray;
    }

    private static void lIllIIlIIllIIlI() {
        lIIlllIIIIlll = new int[20];
        c.lIIlllIIIIlll[0] = (0x5A ^ 0x39 ^ (8 ^ 0x53)) & (0xA2 ^ 0xC6 ^ (0x3B ^ 0x67) ^ -" ".length());
        c.lIIlllIIIIlll[1] = 0xFFFFCFE7 & 0x3D3B;
        c.lIIlllIIIIlll[2] = 0xFFFFAFFA & 0x5BBD;
        c.lIIlllIIIIlll[3] = "   ".length();
        c.lIIlllIIIIlll[4] = 0xB2 ^ 0xAD ^ (0x28 ^ 0x33);
        c.lIIlllIIIIlll[5] = -(0xFFFFBB13 & 0x54FF) & (0xFFFF9D76 & 0x7FBF);
        c.lIIlllIIIIlll[6] = -(0xFFFFF78B & 0x6C7D) & (0xFFFFEFFF & 0x7FBD);
        c.lIIlllIIIIlll[7] = -(0xFFFFEEFD & 0x354B) & (0xFFFFBFFF & 0x6FFF);
        c.lIIlllIIIIlll[8] = " ".length();
        c.lIIlllIIIIlll[9] = -(0xFFFFEFDF & 0x70E3) & (0xFFFFEDFE & 0x7FCF);
        c.lIIlllIIIIlll[10] = -(0xFFFFFFEB & 0x5057) & (0xFFFFFFCB & 0x5BFF);
        c.lIIlllIIIIlll[11] = 52 + 134 - 139 + 92 ^ 57 + 127 - 45 + 3;
        c.lIIlllIIIIlll[12] = -(0xFFFFA3F9 & 0x7EB7) & (0xFFFFEFBF & 0x3FFF);
        c.lIIlllIIIIlll[13] = -(0xFFFFECE7 & 0x777D) & (0xFFFFEFEE & Short.MAX_VALUE);
        c.lIIlllIIIIlll[14] = -(0xFFFFBA0E & 0x57F3) & (0xFFFF9FB7 & 0x7F5B);
        c.lIIlllIIIIlll[15] = 0xFFFFEBFF & 0x1F8D;
        c.lIIlllIIIIlll[16] = 0xFFFFEF15 & 0x1DFB;
        c.lIIlllIIIIlll[17] = 0xFFFFFBCF & 0xFBB;
        c.lIIlllIIIIlll[18] = "  ".length();
        c.lIIlllIIIIlll[19] = 121 + 139 - 244 + 189 ^ 151 + 129 - 104 + 21;
    }

    public WorldPoint r() {
        return this.anchor;
    }
}

