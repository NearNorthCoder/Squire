/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class d
extends Enum<d> {
    public static final /* synthetic */ /* enum */ d FELDIP_HILLS_NORTH;
    public static final /* synthetic */ /* enum */ d WILDERNESS_NORTH;
    private static /* synthetic */ int[] lllIllllIlll;
    public static final /* synthetic */ /* enum */ d PISCATORIS_HUNTER_AREA;
    private static final /* synthetic */ d[] $VALUES;
    private final /* synthetic */ WorldPoint center;
    public static final /* synthetic */ /* enum */ d FELDIP_HILLS_SOUTH;
    public static final /* synthetic */ /* enum */ d RED_CHIN_HUNTING_GROUND;
    public static final /* synthetic */ /* enum */ d GWENITH_HUNTER_AREA;
    public static final /* synthetic */ /* enum */ d WILDERNESS_SOUTH;
    public static final /* synthetic */ /* enum */ d ISLE_OF_SOULS;
    private static /* synthetic */ String[] lllIllllIlIl;

    private static void lIIIlllIIIlIIll() {
        lllIllllIlIl = new String[lllIllllIlll[25]];
        d.lllIllllIlIl[d.lllIllllIlll[0]] = d.lIIIlllIIIIlIIl("Jj4jIS8jOSo2OS45IDc+OQ==", "qwoej");
        d.lllIllllIlIl[d.lllIllllIlll[1]] = d.lIIIlllIIIIlIlI("QvZ2XxxH2jo7mHb/08vMv0oWORonm7za", "Hdosl");
        d.lllIllllIlIl[d.lllIllllIlll[7]] = d.lIIIlllIIIIlIIl("GSE/Bg4dJz4MHBYgOQsbDDozBB0MKQ==", "IhlEO");
        d.lllIllllIlIl[d.lllIllllIlll[10]] = d.lIIIlllIIIIlIll("o5vmmuiGAG8YWHkpsQQ5vw==", "vxtlt");
        d.lllIllllIlIl[d.lllIllllIlll[13]] = d.lIIIlllIIIIlIIl("Cgs2DxgcETICHQAdJQUeHhoy", "LNzKQ");
        d.lllIllllIlIl[d.lllIllllIlll[16]] = d.lIIIlllIIIIlIIl("ET8mIS8HJSIsKhspNTYpAi4i", "Wzjef");
        d.lllIllllIlIl[d.lllIllllIlll[19]] = d.lIIIlllIIIIlIlI("khwPl7OB9WXe5j19DiSH6jNpiC5k73s9", "uouBi");
        d.lllIllllIlIl[d.lllIllllIlll[22]] = d.lIIIlllIIIIlIll("uHO30TGRWBBlVVZmZfcBQ+8mADtw/RTF", "pThuH");
    }

    private static boolean lIIIlllIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    static {
        d.lIIIlllIIIlIlII();
        d.lIIIlllIIIlIIll();
        WILDERNESS_NORTH = new d(new WorldPoint(lllIllllIlll[3], lllIllllIlll[4], lllIllllIlll[0]));
        WILDERNESS_SOUTH = new d(new WorldPoint(lllIllllIlll[5], lllIllllIlll[6], lllIllllIlll[0]));
        PISCATORIS_HUNTER_AREA = new d(new WorldPoint(lllIllllIlll[8], lllIllllIlll[9], lllIllllIlll[0]));
        ISLE_OF_SOULS = new d(new WorldPoint(lllIllllIlll[11], lllIllllIlll[12], lllIllllIlll[0]));
        FELDIP_HILLS_NORTH = new d(new WorldPoint(lllIllllIlll[14], lllIllllIlll[15], lllIllllIlll[0]));
        FELDIP_HILLS_SOUTH = new d(new WorldPoint(lllIllllIlll[17], lllIllllIlll[18], lllIllllIlll[0]));
        GWENITH_HUNTER_AREA = new d(new WorldPoint(lllIllllIlll[20], lllIllllIlll[21], lllIllllIlll[0]));
        RED_CHIN_HUNTING_GROUND = new d(new WorldPoint(lllIllllIlll[23], lllIllllIlll[24], lllIllllIlll[0]));
        d[] dArray = new d[lllIllllIlll[25]];
        dArray[d.lllIllllIlll[0]] = WILDERNESS_NORTH;
        dArray[d.lllIllllIlll[1]] = WILDERNESS_SOUTH;
        dArray[d.lllIllllIlll[7]] = PISCATORIS_HUNTER_AREA;
        dArray[d.lllIllllIlll[10]] = ISLE_OF_SOULS;
        dArray[d.lllIllllIlll[13]] = FELDIP_HILLS_NORTH;
        dArray[d.lllIllllIlll[16]] = FELDIP_HILLS_SOUTH;
        dArray[d.lllIllllIlll[19]] = GWENITH_HUNTER_AREA;
        dArray[d.lllIllllIlll[22]] = RED_CHIN_HUNTING_GROUND;
        $VALUES = dArray;
    }

    private d(WorldPoint worldPoint) {
        this.center = worldPoint;
    }

    private static String lIIIlllIIIIlIlI(String lllllllllllllllIIlIllIlllIIIIIlI, String lllllllllllllllIIlIllIlllIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlllIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlllIIIIllI.init(lllIllllIlll[7], lllllllllllllllIIlIllIlllIIIIlll);
            return new String(lllllllllllllllIIlIllIlllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlllIIIIlIl) {
            lllllllllllllllIIlIllIlllIIIIlIl.printStackTrace();
            return null;
        }
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void lIIIlllIIIlIlII() {
        lllIllllIlll = new int[26];
        d.lllIllllIlll[0] = (0xB7 ^ 0xBB) & ~(0x9B ^ 0x97);
        d.lllIllllIlll[1] = " ".length();
        d.lllIllllIlll[2] = -" ".length();
        d.lllIllllIlll[3] = 0xFFFF8FE6 & 0x7C59;
        d.lllIllllIlll[4] = -(0xFFFFEE9F & 0x7169) & (0xFFFFEEDF & 0x7FEF);
        d.lllIllllIlll[5] = 0xFFFFEC6F & 0x1FDA;
        d.lllIllllIlll[6] = -(0xFFFFC71F & 0x79E1) & (0xFFFFDFFD & 0x6FBF);
        d.lllIllllIlll[7] = "  ".length();
        d.lllIllllIlll[8] = -(0xFFFFFDFF & 0x269D) & (0xFFFFADFC & 0x7FBF);
        d.lllIllllIlll[9] = -(0xFFFFF85B & 0x77BD) & (0xFFFFFFBD & 0x7E7B);
        d.lllIllllIlll[10] = "   ".length();
        d.lllIllllIlll[11] = -(0xFFFFDFB3 & 0x776F) & (0xFFFFFF7F & 0x5FEE);
        d.lllIllllIlll[12] = 0xFFFFDFFD & 0x2B86;
        d.lllIllllIlll[13] = 0x9D ^ 0x99;
        d.lllIllllIlll[14] = 0xFFFFA9FE & 0x5FFD;
        d.lllIllllIlll[15] = -(0xFFFFFF8E & 0x30FB) & (0xFFFFBBFF & Short.MAX_VALUE);
        d.lllIllllIlll[16] = 110 + 94 - 162 + 104 ^ 43 + 18 - -85 + 5;
        d.lllIllllIlll[17] = -(0xFFFFF51D & 0x5EF7) & (0xFFFFFDFD & 0x5FDE);
        d.lllIllllIlll[18] = -(0xFFFFD6F7 & 0x7D39) & (0xFFFFFF73 & 0x5FFF);
        d.lllIllllIlll[19] = 0x4F ^ 0x49;
        d.lllIllllIlll[20] = -(0xFFFFEBAF & 0x575B) & (0xFFFFCFEF & 0x7BFE);
        d.lllIllllIlll[21] = 0xFFFF9D7E & 0x6FCD;
        d.lllIllllIlll[22] = 0x50 ^ 0x57;
        d.lllIllllIlll[23] = 0xFFFFFDDE & 0xBF3;
        d.lllIllllIlll[24] = -(0x72 ^ 0x41) & (0xFFFFBC7F & 0x67FF);
        d.lllIllllIlll[25] = 0x68 ^ 0x60;
    }

    public List<WorldPoint> a(int n2) {
        WorldPoint worldPoint = this.center.dx(lllIllllIlll[0]).dy(lllIllllIlll[1]);
        WorldPoint worldPoint2 = this.center.dx(lllIllllIlll[0]).dy(lllIllllIlll[2]);
        WorldPoint worldPoint3 = this.center.dx(lllIllllIlll[1]).dy(lllIllllIlll[0]);
        WorldPoint worldPoint4 = this.center.dx(lllIllllIlll[2]).dy(lllIllllIlll[0]);
        WorldPoint worldPoint5 = this.center.dx(lllIllllIlll[1]).dy(lllIllllIlll[1]);
        WorldPoint worldPoint6 = this.center.dx(lllIllllIlll[2]).dy(lllIllllIlll[2]);
        return List.of(worldPoint, worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6).subList(lllIllllIlll[0], n2);
    }

    public WorldPoint l() {
        return this.center;
    }

    private static String lIIIlllIIIIlIll(String lllllllllllllllIIlIllIllIlllIlll, String lllllllllllllllIIlIllIllIlllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIlllIlII.getBytes(StandardCharsets.UTF_8)), lllIllllIlll[25]), "DES");
            Cipher lllllllllllllllIIlIllIllIllllIIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIllIllllIIl.init(lllIllllIlll[7], lllllllllllllllIIlIllIllIllllIlI);
            return new String(lllllllllllllllIIlIllIllIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIllIllllIII) {
            lllllllllllllllIIlIllIllIllllIII.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIIIlIIl(String lllllllllllllllIIlIllIllIllIIlll, String lllllllllllllllIIlIllIllIllIIIIl) {
        lllllllllllllllIIlIllIllIllIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIllIllIIlIl = new StringBuilder();
        char[] lllllllllllllllIIlIllIllIllIIlII = lllllllllllllllIIlIllIllIllIIIIl.toCharArray();
        int lllllllllllllllIIlIllIllIllIIIll = lllIllllIlll[0];
        char[] lllllllllllllllIIlIllIllIlIlllIl = lllllllllllllllIIlIllIllIllIIlll.toCharArray();
        int lllllllllllllllIIlIllIllIlIlllII = lllllllllllllllIIlIllIllIlIlllIl.length;
        int lllllllllllllllIIlIllIllIlIllIll = lllIllllIlll[0];
        while (d.lIIIlllIIIlIlIl(lllllllllllllllIIlIllIllIlIllIll, lllllllllllllllIIlIllIllIlIlllII)) {
            char lllllllllllllllIIlIllIllIllIlIII = lllllllllllllllIIlIllIllIlIlllIl[lllllllllllllllIIlIllIllIlIllIll];
            lllllllllllllllIIlIllIllIllIIlIl.append((char)(lllllllllllllllIIlIllIllIllIlIII ^ lllllllllllllllIIlIllIllIllIIlII[lllllllllllllllIIlIllIllIllIIIll % lllllllllllllllIIlIllIllIllIIlII.length]));
            "".length();
            ++lllllllllllllllIIlIllIllIllIIIll;
            ++lllllllllllllllIIlIllIllIlIllIll;
            "".length();
            if ((0x12 ^ 0x16) == (0x12 ^ 0x16)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIllIllIIlIl);
    }
}

