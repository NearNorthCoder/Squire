/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class c
extends Enum<c> {
    private final /* synthetic */ int regionId;
    private final /* synthetic */ WorldPoint location;
    private static /* synthetic */ int[] lIIlIllIIIlIl;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] lIIlIllIIIlII;
    public static final /* synthetic */ /* enum */ c VARROCK_EAST;

    private static void lIlIllIIllIIIII() {
        lIIlIllIIIlII = new String[lIIlIllIIIlIl[4]];
        c.lIIlIllIIIlII[c.lIIlIllIIIlIl[0]] = c."VARROCK_EAST";
    }

    private static void lIlIllIIllIIIIl() {
        lIIlIllIIIlIl = new int[6];
        c.lIIlIllIIIlIl[0] = (0xC4 ^ 0x95) & ~(0x3C ^ 0x6D);
        c.lIIlIllIIIlIl[1] = -(0xFFFFBFE9 & 0x44D7) & (0xFFFFBFF5 & 0x76FF);
        c.lIIlIllIIIlIl[2] = -(0xFFFF9017 & 0x7FEB) & (0xFFFF9FBF & 0x7CF7);
        c.lIIlIllIIIlIl[3] = 0xFFFFDF7C & 0x2DDF;
        c.lIIlIllIIIlIl[4] = 1;
        c.lIIlIllIIIlIl[5] = 2;
    }

    private static String lIlIllIIlIlllll(String llllllllllllllIllllIlIlllllIIIlI, String llllllllllllllIllllIlIllllIlllll) {
        try {
            SecretKeySpec llllllllllllllIllllIlIlllllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIlllllIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIlllllIIlII.init(lIIlIllIIIlIl[5], llllllllllllllIllllIlIlllllIIlIl);
            return new String(llllllllllllllIllllIlIlllllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIlllllIIIll) {
            llllllllllllllIllllIlIlllllIIIll.printStackTrace();
            return null;
        }
    }

    public WorldPoint r() {
        return this.location;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    public int q() {
        return this.regionId;
    }

    static {
        c.lIlIllIIllIIIIl();
        c.lIlIllIIllIIIII();
        VARROCK_EAST = new c(lIIlIllIIIlIl[1], new WorldPoint(lIIlIllIIIlIl[2], lIIlIllIIIlIl[3], lIIlIllIIIlIl[0]));
        c[] cArray = new c[lIIlIllIIIlIl[4]];
        cArray[c.lIIlIllIIIlIl[0]] = VARROCK_EAST;
        $VALUES = cArray;
    }
}

