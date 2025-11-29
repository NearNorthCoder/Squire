/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;

public final class e
extends Enum<e> {
    private final /* synthetic */ WorldPoint[] rocks;
    private final /* synthetic */ Point standing;
    public static final /* synthetic */ /* enum */ e WEST_FOUR;
    private static /* synthetic */ String[] llllllIIIIlI;
    private static /* synthetic */ int[] llllllIIIIll;
    public static final /* synthetic */ /* enum */ e WEST_TWO;
    private static final /* synthetic */ e[] $VALUES;

    private static boolean lIIlIlIIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIIlIlIIIIllIlI();
        e.lIIlIlIIIIllIIl();
        WorldPoint[] worldPointArray = new WorldPoint[llllllIIIIll[4]];
        worldPointArray[e.llllllIIIIll[0]] = new WorldPoint(llllllIIIIll[5], llllllIIIIll[6], llllllIIIIll[0]);
        worldPointArray[e.llllllIIIIll[1]] = new WorldPoint(llllllIIIIll[7], llllllIIIIll[6], llllllIIIIll[0]);
        worldPointArray[e.llllllIIIIll[8]] = new WorldPoint(llllllIIIIll[9], llllllIIIIll[3], llllllIIIIll[0]);
        worldPointArray[e.llllllIIIIll[10]] = new WorldPoint(llllllIIIIll[9], llllllIIIIll[11], llllllIIIIll[0]);
        WEST_FOUR = new e(new Point(llllllIIIIll[2], llllllIIIIll[3]), worldPointArray);
        WorldPoint[] worldPointArray2 = new WorldPoint[llllllIIIIll[8]];
        worldPointArray2[e.llllllIIIIll[0]] = new WorldPoint(llllllIIIIll[9], llllllIIIIll[3], llllllIIIIll[0]);
        worldPointArray2[e.llllllIIIIll[1]] = new WorldPoint(llllllIIIIll[2], llllllIIIIll[11], llllllIIIIll[0]);
        WEST_TWO = new e(new Point(llllllIIIIll[12], llllllIIIIll[3]), worldPointArray2);
        e[] eArray = new e[llllllIIIIll[8]];
        eArray[e.llllllIIIIll[0]] = WEST_FOUR;
        eArray[e.llllllIIIIll[1]] = WEST_TWO;
        $VALUES = eArray;
    }

    private static String lIIlIlIIIIllIII(String lllllllllllllllIIlIIIlllllIIIlII, String lllllllllllllllIIlIIIlllllIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlllllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlllllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlllllIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlllllIIlIII.init(llllllIIIIll[8], lllllllllllllllIIlIIIlllllIIlIIl);
            return new String(lllllllllllllllIIlIIIlllllIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlllllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIlllllIIIlll) {
            lllllllllllllllIIlIIIlllllIIIlll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint) {
        void lllllllllllllllIIlIIIlllllIlIIII;
        WorldPoint[] worldPointArray = this.rocks;
        int n2 = worldPointArray.length;
        int lllllllllllllllIIlIIIlllllIIllll = llllllIIIIll[0];
        while (e.lIIlIlIIIIllIll(lllllllllllllllIIlIIIlllllIIllll, (int)lllllllllllllllIIlIIIlllllIlIIII)) {
            void lllllllllllllllIIlIIIlllllIlIIlI;
            void lllllllllllllllIIlIIIlllllIlIIIl;
            void lllllllllllllllIIlIIIlllllIIlllI = lllllllllllllllIIlIIIlllllIlIIIl[lllllllllllllllIIlIIIlllllIIllll];
            if (e.lIIlIlIIIIlllII(lllllllllllllllIIlIIIlllllIIlllI.equals((Object)lllllllllllllllIIlIIIlllllIlIIlI) ? 1 : 0)) {
                return llllllIIIIll[1];
            }
            ++lllllllllllllllIIlIIIlllllIIllll;
            "".length();
            if (null == null) continue;
            return ((170 + 0 - 38 + 40 ^ 45 + 116 - 139 + 139) & (38 + 176 - 80 + 56 ^ 43 + 110 - 109 + 135 ^ -" ".length())) != 0;
        }
        return llllllIIIIll[0];
    }

    public WorldPoint d() {
        return new WorldPoint(this.standing.getX(), this.standing.getY(), llllllIIIIll[0]);
    }

    private static void lIIlIlIIIIllIIl() {
        llllllIIIIlI = new String[llllllIIIIll[8]];
        e.llllllIIIIlI[e.llllllIIIIll[0]] = e.lIIlIlIIIIllIII("eKzOFm6JQXYkqWYzPeSDhA==", "FKEJQ");
        e.llllllIIIIlI[e.llllllIIIIll[1]] = e.lIIlIlIIIIllIII("5GMomENPMu5564d13Qx4sQ==", "WJPwf");
    }

    private static boolean lIIlIlIIIIlllII(int n2) {
        return n2 != 0;
    }

    public WorldPoint[] e() {
        return this.rocks;
    }

    private e(Point point, WorldPoint ... worldPointArray) {
        this.standing = point;
        this.rocks = worldPointArray;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static void lIIlIlIIIIllIlI() {
        llllllIIIIll = new int[13];
        e.llllllIIIIll[0] = (0x1F ^ 0xA ^ (0x1F ^ 0x36)) & (0x83 ^ 0xC4 ^ (0xD2 ^ 0xA9) ^ -" ".length());
        e.llllllIIIIll[1] = " ".length();
        e.llllllIIIIll[2] = 0xFFFFDC5B & 0x2FFF;
        e.llllllIIIIll[3] = -(0xFFFFF6BF & 0x5DCE) & (0xFFFFFFEF & 0x5FFF);
        e.llllllIIIIll[4] = 0xA9 ^ 0xAD;
        e.llllllIIIIll[5] = 0xFFFFBF7F & 0x4CDF;
        e.llllllIIIIll[6] = 0xFFFFBB77 & 0x4FE9;
        e.llllllIIIIll[7] = -(0xFFFFED27 & 0x72DA) & (0xFFFFFF7F & 0x6CDF);
        e.llllllIIIIll[8] = "  ".length();
        e.llllllIIIIll[9] = 0xFFFF8DFF & 0x7E5C;
        e.llllllIIIIll[10] = "   ".length();
        e.llllllIIIIll[11] = 0xFFFFCB63 & 0x3FFF;
        e.llllllIIIIll[12] = 0xFFFFDFDD & 0x2C7F;
    }
}

