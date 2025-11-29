/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c FELDIP_HILLS_SOUTH;
    private static /* synthetic */ String[] lllIllIllIII;
    private static /* synthetic */ int[] lllIllIllIIl;
    public static final /* synthetic */ /* enum */ c FELDIP_HILLS_NORTHWEST;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ /* enum */ c ISLE_OF_SOULS;
    private final /* synthetic */ WorldPoint center;

    private static String lIIIllIlIlllIIl(String lllllllllllllllIIlIlllIllIllIIll, String lllllllllllllllIIlIlllIllIllIIlI) {
        lllllllllllllllIIlIlllIllIllIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIllIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIllIllIllI = new StringBuilder();
        char[] lllllllllllllllIIlIlllIllIllIlIl = lllllllllllllllIIlIlllIllIllIIlI.toCharArray();
        int lllllllllllllllIIlIlllIllIllIlII = lllIllIllIIl[0];
        char[] lllllllllllllllIIlIlllIllIlIlllI = lllllllllllllllIIlIlllIllIllIIll.toCharArray();
        int lllllllllllllllIIlIlllIllIlIllIl = lllllllllllllllIIlIlllIllIlIlllI.length;
        int lllllllllllllllIIlIlllIllIlIllII = lllIllIllIIl[0];
        while (c.lIIIllIlIllllII(lllllllllllllllIIlIlllIllIlIllII, lllllllllllllllIIlIlllIllIlIllIl)) {
            char lllllllllllllllIIlIlllIllIlllIIl = lllllllllllllllIIlIlllIllIlIlllI[lllllllllllllllIIlIlllIllIlIllII];
            lllllllllllllllIIlIlllIllIllIllI.append((char)(lllllllllllllllIIlIlllIllIlllIIl ^ lllllllllllllllIIlIlllIllIllIlIl[lllllllllllllllIIlIlllIllIllIlII % lllllllllllllllIIlIlllIllIllIlIl.length]));
            "".length();
            ++lllllllllllllllIIlIlllIllIllIlII;
            ++lllllllllllllllIIlIlllIllIlIllII;
            "".length();
            if ((0 ^ 0x40 ^ (0x4C ^ 8)) >= "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlllIllIllIllI);
    }

    static {
        c.lIIIllIlIlllIll();
        c.lIIIllIlIlllIlI();
        FELDIP_HILLS_SOUTH = new c(new WorldPoint(lllIllIllIIl[3], lllIllIllIIl[4], lllIllIllIIl[0]));
        ISLE_OF_SOULS = new c(new WorldPoint(lllIllIllIIl[5], lllIllIllIIl[6], lllIllIllIIl[0]));
        FELDIP_HILLS_NORTHWEST = new c(new WorldPoint(lllIllIllIIl[8], lllIllIllIIl[9], lllIllIllIIl[0]));
        c[] cArray = new c[lllIllIllIIl[10]];
        cArray[c.lllIllIllIIl[0]] = FELDIP_HILLS_SOUTH;
        cArray[c.lllIllIllIIl[1]] = ISLE_OF_SOULS;
        cArray[c.lllIllIllIIl[7]] = FELDIP_HILLS_NORTHWEST;
        $VALUES = cArray;
    }

    public WorldPoint l() {
        return this.center;
    }

    private static void lIIIllIlIlllIlI() {
        lllIllIllIII = new String[lllIllIllIIl[10]];
        c.lllIllIllIII[c.lllIllIllIIl[0]] = c.lIIIllIlIlllIII("rGztRdoEd+iz46hN7cUv7JY+wE7EW18R", "eZjdW");
        c.lllIllIllIII[c.lllIllIllIIl[1]] = c.lIIIllIlIlllIIl("GjwgHA8cKTMKHwYjPw==", "SolYP");
        c.lllIllIllIII[c.lllIllIllIIl[7]] = c.lIIIllIlIlllIII("5ci42GZvdgYYx0dVMfBypPAVx/CQqItH", "MbGKL");
    }

    private static boolean lIIIllIlIllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllIlIlllIll() {
        lllIllIllIIl = new int[11];
        c.lllIllIllIIl[0] = (0xF7 ^ 0xAD) & ~(0xED ^ 0xB7);
        c.lllIllIllIIl[1] = " ".length();
        c.lllIllIllIIl[2] = -" ".length();
        c.lllIllIllIIl[3] = -(0xFFFFD2FD & 0x7D53) & (0xFFFFDBFF & 0x7E7F);
        c.lllIllIllIIl[4] = 0xFFFFCBFB & 0x3F74;
        c.lllIllIllIIl[5] = -(0xFFFFF3CB & 0x6D35) & (0xFFFFFDBF & 0x6BDD);
        c.lllIllIllIIl[6] = -(0xFFFFF17F & 0x1ECD) & (0xFFFF9BDF & 0x7FFE);
        c.lllIllIllIIl[7] = "  ".length();
        c.lllIllIllIIl[8] = 0xFFFFCBFF & 0x3DDF;
        c.lllIllIllIIl[9] = 0xFFFFABF7 & 0x5F7F;
        c.lllIllIllIIl[10] = "   ".length();
    }

    private static String lIIIllIlIlllIII(String lllllllllllllllIIlIlllIlllIIIllI, String lllllllllllllllIIlIlllIlllIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIlllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIlllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlllIlllIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlllIlllIIlIlI.init(lllIllIllIIl[7], lllllllllllllllIIlIlllIlllIIlIll);
            return new String(lllllllllllllllIIlIlllIlllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIlllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlllIlllIIlIIl) {
            lllllllllllllllIIlIlllIlllIIlIIl.printStackTrace();
            return null;
        }
    }

    private c(WorldPoint worldPoint) {
        this.center = worldPoint;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public List<WorldPoint> a(int n2) {
        WorldPoint worldPoint = this.center.dx(lllIllIllIIl[0]).dy(lllIllIllIIl[1]);
        WorldPoint worldPoint2 = this.center.dx(lllIllIllIIl[0]).dy(lllIllIllIIl[2]);
        WorldPoint worldPoint3 = this.center.dx(lllIllIllIIl[1]).dy(lllIllIllIIl[0]);
        WorldPoint worldPoint4 = this.center.dx(lllIllIllIIl[2]).dy(lllIllIllIIl[0]);
        WorldPoint worldPoint5 = this.center.dx(lllIllIllIIl[1]).dy(lllIllIllIIl[1]);
        WorldPoint worldPoint6 = this.center.dx(lllIllIllIIl[2]).dy(lllIllIllIIl[2]);
        return List.of(worldPoint, worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6).subList(lllIllIllIIl[0], n2);
    }
}

