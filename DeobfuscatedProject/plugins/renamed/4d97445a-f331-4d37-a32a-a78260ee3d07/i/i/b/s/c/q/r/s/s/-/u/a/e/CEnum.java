/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.runelite.api.coords.WorldPoint
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class CEnum
extends Enum<c> {
    private final /* synthetic */ int x1;
    private final /* synthetic */ int y2;
    private static /* synthetic */ int[] lIlIIlIll;
    public static final /* synthetic */ /* enum */ c EAST;
    private final /* synthetic */ int x2;
    public static final /* synthetic */ /* enum */ c NORTH;
    private static final /* synthetic */ c[] $VALUES;
    private final /* synthetic */ int y1;
    public static final /* synthetic */ /* enum */ c WEST;
    private static /* synthetic */ String[] lIlIIlIlI;

    private static boolean lIIlIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public int v() {
        return this.y2;
    }

    private static boolean lIIlIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    public int s() {
        return this.x1;
    }

    private static void lIIlIIIllIl() {
        lIlIIlIll = new int[16];
        c.lIlIIlIll[0] = (0x68 ^ 0x37) & ~(0x26 ^ 0x79);
        c.lIlIIlIll[1] = 2;
        c.lIlIIlIll[2] = 0x6C ^ 0x64;
        c.lIlIIlIll[3] = 0x23 ^ 7 ^ (0xA6 ^ 0x8F);
        c.lIlIIlIll[4] = 0xFFFF97CF & 0x6CFF;
        c.lIlIIlIll[5] = -(0xFFFFFBD9 & 0x73F) & (0xFFFF97F9 & 0x6FFF);
        c.lIlIIlIll[6] = -(0xFFFFAFBD & 0x7B63) & (0xFFFFAFFB & Short.MAX_VALUE);
        c.lIlIIlIll[7] = -(0xFFFFF737 & 0x78CD) & (0xFFFFF5ED & 0x7EFF);
        c.lIlIIlIll[8] = 1;
        c.lIlIIlIll[9] = -(0xFFFFF0FD & 0x6FE3) & (0xFFFFFDFF & 0x67EF);
        c.lIlIIlIll[10] = -(0xFFFFCA9F & Short.MAX_VALUE) & (0xFFFFCFBF & Short.MAX_VALUE);
        c.lIlIIlIll[11] = -(0xFFFFFA7F & 0x5FE5) & (0xFFFFDF7F & Short.MAX_VALUE);
        c.lIlIIlIll[12] = -(0xFFFFD105 & 0x6EFF) & (0xFFFFFF7F & 0x45AD);
        c.lIlIIlIll[13] = 0xFFFFCD5F & 0x37EF;
        c.lIlIIlIll[14] = -(0x51 ^ 0x46) & (0xFFFFED7F & 0x17F7);
        c.lIlIIlIll[15] = 3;
    }

    private static String lIIlIIIlIll(String llIIIIIllIIIIII, String llIIIIIllIIIlII) {
        llIIIIIllIIIIII = new String(Base64.getDecoder().decode(llIIIIIllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIIllIIIIll = new StringBuilder();
        char[] llIIIIIllIIIIlI = llIIIIIllIIIlII.toCharArray();
        int llIIIIIllIIIIIl = lIlIIlIll[0];
        char[] llIIIIIlIlllIll = llIIIIIllIIIIII.toCharArray();
        int llIIIIIlIlllIlI = llIIIIIlIlllIll.length;
        int llIIIIIlIlllIIl = lIlIIlIll[0];
        while (c.lIIlIIIlllI(llIIIIIlIlllIIl, llIIIIIlIlllIlI)) {
            char llIIIIIllIIIllI = llIIIIIlIlllIll[llIIIIIlIlllIIl];
            llIIIIIllIIIIll.append((char)(llIIIIIllIIIllI ^ llIIIIIllIIIIlI[llIIIIIllIIIIIl % llIIIIIllIIIIlI.length]));
            0;
            ++llIIIIIllIIIIIl;
            ++llIIIIIlIlllIIl;
            0;
            if ((0x43 ^ 0x47) > ((0xF3 ^ 0xA8) & ~(0xFA ^ 0xA1))) continue;
            return null;
        }
        return String.valueOf(llIIIIIllIIIIll);
    }

    public int t() {
        return this.x2;
    }

    private c(int n3, int n4, int n5, int n6) {
        this.x1 = n3;
        this.x2 = n4;
        this.y1 = n5;
        this.y2 = n6;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    static {
        c.lIIlIIIllIl();
        c.lIIlIIIllII();
        WEST = new c(lIlIIlIll[4], lIlIIlIll[5], lIlIIlIll[6], lIlIIlIll[7]);
        NORTH = new c(lIlIIlIll[9], lIlIIlIll[10], lIlIIlIll[11], lIlIIlIll[12]);
        EAST = new c(lIlIIlIll[13], lIlIIlIll[14], lIlIIlIll[6], lIlIIlIll[7]);
        c[] cArray = new c[lIlIIlIll[15]];
        cArray[c.lIlIIlIll[0]] = WEST;
        cArray[c.lIlIIlIll[8]] = NORTH;
        cArray[c.lIlIIlIll[1]] = EAST;
        $VALUES = cArray;
    }

    public int u() {
        return this.y1;
    }

    private static String lIIlIIIlIlI(String llIIIIIllIlIlIl, String llIIIIIllIlIlII) {
        try {
            SecretKeySpec llIIIIIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIllIlIlll = Cipher.getInstance("Blowfish");
            llIIIIIllIlIlll.init(lIlIIlIll[1], llIIIIIllIllIII);
            return new String(llIIIIIllIlIlll.doFinal(Base64.getDecoder().decode(llIIIIIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIllIlIllI) {
            llIIIIIllIlIllI.printStackTrace();
            return null;
        }
    }

    public WorldPoint c(int n2) {
        if (!c.lIIlIIlIIII(n2, lIlIIlIll[1]) || c.lIIlIIlIIIl(n2)) {
            return null;
        }
        return new WorldPoint(this.x1 + lIlIIlIll[2] + n2, this.y1 + lIlIIlIll[3], lIlIIlIll[0]);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static boolean lIIlIIlIIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static c a(WorldPoint worldPoint) {
        void llIIIIIlllIIIll;
        c[] cArray = c.values();
        int n2 = cArray.length;
        int llIIIIIlllIIIlI = lIlIIlIll[0];
        while (c.lIIlIIIlllI(llIIIIIlllIIIlI, (int)llIIIIIlllIIIll)) {
            WorldPoint llIIIIIlllIIlIl;
            void llIIIIIlllIIlII;
            void llIIIIIlllIIIIl = llIIIIIlllIIlII[llIIIIIlllIIIlI];
            if (c.lIIlIIIllll(llIIIIIlllIIlIl.getX(), llIIIIIlllIIIIl.s()) && c.lIIlIIlIIII(llIIIIIlllIIlIl.getX(), llIIIIIlllIIIIl.t()) && c.lIIlIIIllll(llIIIIIlllIIlIl.getY(), llIIIIIlllIIIIl.u()) && c.lIIlIIlIIII(llIIIIIlllIIlIl.getY(), llIIIIIlllIIIIl.v())) {
                return llIIIIIlllIIIIl;
            }
            ++llIIIIIlllIIIlI;
            0;
            if (3 > 2) continue;
            return null;
        }
        return null;
    }

    private static boolean lIIlIIlIIIl(int n2) {
        return n2 < 0;
    }

    private static void lIIlIIIllII() {
        lIlIIlIlI = new String[lIlIIlIll[15]];
        c.lIlIIlIlI[c.lIlIIlIll[0]] = c."WEST";
        c.lIlIIlIlI[c.lIlIIlIll[8]] = c."NORTH";
        c.lIlIIlIlI[c.lIlIIlIll[1]] = c."EAST";
    }
}

