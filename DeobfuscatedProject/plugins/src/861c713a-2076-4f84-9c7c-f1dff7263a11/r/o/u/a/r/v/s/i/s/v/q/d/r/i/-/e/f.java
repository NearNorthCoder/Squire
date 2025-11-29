/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class f
extends Enum<f> {
    public static final /* synthetic */ /* enum */ f VARROCK_WEST;
    private static final /* synthetic */ f[] $VALUES;
    private static /* synthetic */ int[] lIlIlIIlIIlll;
    public static final /* synthetic */ /* enum */ f GRAND_EXCHANGE;
    private final /* synthetic */ int regionId;
    public static final /* synthetic */ /* enum */ f CASTLE_WARS;
    private final /* synthetic */ WorldPoint location;
    private static /* synthetic */ String[] lIlIlIIlIIllI;
    public static final /* synthetic */ /* enum */ f FALADOR_WEST;

    private static void lIllllIllllIIIl() {
        lIlIlIIlIIlll = new int[17];
        f.lIlIlIIlIIlll[0] = (0xAC ^ 0x99 ^ (0x67 ^ 0x5A)) & (0x6F ^ 0xC ^ (0x39 ^ 0x52) ^ -" ".length());
        f.lIlIlIIlIIlll[1] = 0xFFFFFB37 & 0x35FE;
        f.lIlIlIIlIIlll[2] = -(0xFFFFE3DB & 0x7EA5) & (0xFFFFFFFD & 0x6EDF);
        f.lIlIlIIlIIlll[3] = 0xFFFF9D9F & 0x6FFF;
        f.lIlIlIIlIIlll[4] = " ".length();
        f.lIlIlIIlIIlll[5] = 0xFFFFB33F & 0x7DF5;
        f.lIlIlIIlIIlll[6] = -(0xFFFFF2F9 & 0x6D0F) & (0xFFFFED7F & 0x7EF9);
        f.lIlIlIIlIIlll[7] = -(0x2F ^ 0x28) & (0xFFFFAD7E & 0x5FF7);
        f.lIlIlIIlIIlll[8] = "  ".length();
        f.lIlIlIIlIIlll[9] = -(0xFFFFCDCF & 0x73FB) & (0xFFFFFFFF & 0x6FFE);
        f.lIlIlIIlIIlll[10] = 0xFFFFEF82 & 0x1BFF;
        f.lIlIlIIlIIlll[11] = 0xFFFFFDA9 & 0xF7E;
        f.lIlIlIIlIIlll[12] = "   ".length();
        f.lIlIlIIlIIlll[13] = 0xFFFFAFB4 & 0x767B;
        f.lIlIlIIlIIlll[14] = 0xFFFFEBDB & 0x1DAF;
        f.lIlIlIIlIIlll[15] = -(0xFFFFF3DD & 0x1EE7) & (0xFFFFFFFF & 0x1ECF);
        f.lIlIlIIlIIlll[16] = 0x1D ^ 3 ^ (0x3C ^ 0x26);
    }

    private static boolean lIllllIllllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllllIllllIIII() {
        lIlIlIIlIIllI = new String[lIlIlIIlIIlll[16]];
        f.lIlIlIIlIIllI[f.lIlIlIIlIIlll[0]] = f.lIllllIlllIlllI("xiJ/AN9RzMv+p8tMGFstcA==", "xVUPz");
        f.lIlIlIIlIIllI[f.lIlIlIIlIIlll[4]] = f.lIllllIlllIllll("FzEZBgICOxQDCBIk", "ApKTM");
        f.lIlIlIIlIIllI[f.lIlIlIIlIIlll[8]] = f.lIllllIlllIllll("DSQnMxIENzQlExgx", "KekrV");
        f.lIlIlIIlIIllI[f.lIlIlIIlIIlll[12]] = f.lIllllIlllIllll("BQcHEBQDGQMFChU=", "FFTDX");
    }

    private static String lIllllIlllIllll(String llllllllllllllIllIlIllllIllIlllI, String llllllllllllllIllIlIllllIllIlIII) {
        llllllllllllllIllIlIllllIllIlllI = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllllIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllllIllIllII = new StringBuilder();
        char[] llllllllllllllIllIlIllllIllIlIll = llllllllllllllIllIlIllllIllIlIII.toCharArray();
        int llllllllllllllIllIlIllllIllIlIlI = lIlIlIIlIIlll[0];
        char[] llllllllllllllIllIlIllllIllIIlII = llllllllllllllIllIlIllllIllIlllI.toCharArray();
        int llllllllllllllIllIlIllllIllIIIll = llllllllllllllIllIlIllllIllIIlII.length;
        int llllllllllllllIllIlIllllIllIIIlI = lIlIlIIlIIlll[0];
        while (f.lIllllIllllIIlI(llllllllllllllIllIlIllllIllIIIlI, llllllllllllllIllIlIllllIllIIIll)) {
            char llllllllllllllIllIlIllllIllIllll = llllllllllllllIllIlIllllIllIIlII[llllllllllllllIllIlIllllIllIIIlI];
            llllllllllllllIllIlIllllIllIllII.append((char)(llllllllllllllIllIlIllllIllIllll ^ llllllllllllllIllIlIllllIllIlIll[llllllllllllllIllIlIllllIllIlIlI % llllllllllllllIllIlIllllIllIlIll.length]));
            "".length();
            ++llllllllllllllIllIlIllllIllIlIlI;
            ++llllllllllllllIllIlIllllIllIIIlI;
            "".length();
            if ("  ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIllllIllIllII);
    }

    static {
        f.lIllllIllllIIIl();
        f.lIllllIllllIIII();
        GRAND_EXCHANGE = new f(lIlIlIIlIIlll[1], new WorldPoint(lIlIlIIlIIlll[2], lIlIlIIlIIlll[3], lIlIlIIlIIlll[0]));
        VARROCK_WEST = new f(lIlIlIIlIIlll[5], new WorldPoint(lIlIlIIlIIlll[6], lIlIlIIlIIlll[7], lIlIlIIlIIlll[0]));
        FALADOR_WEST = new f(lIlIlIIlIIlll[9], new WorldPoint(lIlIlIIlIIlll[10], lIlIlIIlIIlll[11], lIlIlIIlIIlll[0]));
        CASTLE_WARS = new f(lIlIlIIlIIlll[13], new WorldPoint(lIlIlIIlIIlll[14], lIlIlIIlIIlll[15], lIlIlIIlIIlll[0]));
        f[] fArray = new f[lIlIlIIlIIlll[16]];
        fArray[f.lIlIlIIlIIlll[0]] = GRAND_EXCHANGE;
        fArray[f.lIlIlIIlIIlll[4]] = VARROCK_WEST;
        fArray[f.lIlIlIIlIIlll[8]] = FALADOR_WEST;
        fArray[f.lIlIlIIlIIlll[12]] = CASTLE_WARS;
        $VALUES = fArray;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public WorldPoint F() {
        return this.location;
    }

    private f(int n3, WorldPoint worldPoint) {
        this.regionId = n3;
        this.location = worldPoint;
    }

    private static String lIllllIlllIlllI(String llllllllllllllIllIlIllllIllllllI, String llllllllllllllIllIlIllllIllllIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllllIllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlllllIIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlllllIIIIIII.init(lIlIlIIlIIlll[8], llllllllllllllIllIlIlllllIIIIIIl);
            return new String(llllllllllllllIllIlIlllllIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllllIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllllIlllllll) {
            llllllllllllllIllIlIllllIlllllll.printStackTrace();
            return null;
        }
    }

    public int E() {
        return this.regionId;
    }
}

