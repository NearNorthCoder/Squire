/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.client.Static
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.client.Static;

public final class i
extends Enum<i> {
    private final /* synthetic */ RectangularArea chopArea;
    public static final /* synthetic */ /* enum */ i WEST;
    public static final /* synthetic */ /* enum */ i EAST;
    private /* synthetic */ long chopTimestamp;
    private final /* synthetic */ int treeId;
    private static /* synthetic */ int[] lIllIIIIlIlll;
    public static final /* synthetic */ /* enum */ i MIDDLE;
    private static final /* synthetic */ i[] $VALUES;
    private static /* synthetic */ String[] lIllIIIIlIllI;

    private static String llIIIlIIIllIIll(String llllllllllllllIllIIllIIlIIIIllII, String llllllllllllllIllIIllIIlIIIIlIll) {
        llllllllllllllIllIIllIIlIIIIllII = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIIlIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIIlIIIIllll = new StringBuilder();
        char[] llllllllllllllIllIIllIIlIIIIlllI = llllllllllllllIllIIllIIlIIIIlIll.toCharArray();
        int llllllllllllllIllIIllIIlIIIIllIl = lIllIIIIlIlll[1];
        char[] llllllllllllllIllIIllIIlIIIIIlll = llllllllllllllIllIIllIIlIIIIllII.toCharArray();
        int llllllllllllllIllIIllIIlIIIIIllI = llllllllllllllIllIIllIIlIIIIIlll.length;
        int llllllllllllllIllIIllIIlIIIIIlIl = lIllIIIIlIlll[1];
        while (i.llIIIlIIIllIlll(llllllllllllllIllIIllIIlIIIIIlIl, llllllllllllllIllIIllIIlIIIIIllI)) {
            char llllllllllllllIllIIllIIlIIIlIIlI = llllllllllllllIllIIllIIlIIIIIlll[llllllllllllllIllIIllIIlIIIIIlIl];
            llllllllllllllIllIIllIIlIIIIllll.append((char)(llllllllllllllIllIIllIIlIIIlIIlI ^ llllllllllllllIllIIllIIlIIIIlllI[llllllllllllllIllIIllIIlIIIIllIl % llllllllllllllIllIIllIIlIIIIlllI.length]));
            "".length();
            ++llllllllllllllIllIIllIIlIIIIllIl;
            ++llllllllllllllIllIIllIIlIIIIIlIl;
            "".length();
            if ("  ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllIIlIIIIllll);
    }

    private static void llIIIlIIIllIlIl() {
        lIllIIIIlIlll = new int[16];
        i.lIllIIIIlIlll[0] = " ".length();
        i.lIllIIIIlIlll[1] = (0x22 ^ 0x64 ^ (0xD6 ^ 0xAF)) & (133 + 106 - 177 + 108 ^ 81 + 22 - 100 + 146 ^ -" ".length());
        i.lIllIIIIlIlll[2] = -(102 + 36 - 125 + 125) & (0xFFFFF79B & Short.MAX_VALUE);
        i.lIllIIIIlIlll[3] = 0xFFFFBEDF & 0x4FA1;
        i.lIllIIIIlIlll[4] = 0xFFFFAFFE & 0x5EFB;
        i.lIllIIIIlIlll[5] = 0xFFFFBEFD & 0x4FFE;
        i.lIllIIIIlIlll[6] = 0xFFFFFF14 & 0x77FB;
        i.lIllIIIIlIlll[7] = -(0xFFFFD78F & 0x39F5) & (0xFFFFFFFF & 0x1FFF);
        i.lIllIIIIlIlll[8] = -(0xFFFF93EB & 0x7D15) & (0xFFFFBFFF & 0x5FFB);
        i.lIllIIIIlIlll[9] = 0xFFFFBEFF & 0x4F7D;
        i.lIllIIIIlIlll[10] = "  ".length();
        i.lIllIIIIlIlll[11] = 0xFFFFF771 & 0x7F9F;
        i.lIllIIIIlIlll[12] = 0xFFFFEFFF & 0x1E78;
        i.lIllIIIIlIlll[13] = -(0xFFFFA977 & 0x778A) & (0xFFFFBFFF & 0x6FFF);
        i.lIllIIIIlIlll[14] = "   ".length();
        i.lIllIIIIlIlll[15] = 144 + 56 - 73 + 29 ^ 123 + 137 - 220 + 108;
    }

    private static boolean llIIIlIIIllIllI(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIlIIIllIlll(int n, int n2) {
        return n < n2;
    }

    public RectangularArea w() {
        return this.chopArea;
    }

    private static String llIIIlIIIllIIIl(String llllllllllllllIllIIllIIlIIlIllII, String llllllllllllllIllIIllIIlIIlIllIl) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIlIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIlll[15]), "DES");
            Cipher llllllllllllllIllIIllIIlIIllIIII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIIlIIllIIII.init(lIllIIIIlIlll[10], llllllllllllllIllIIllIIlIIllIIIl);
            return new String(llllllllllllllIllIIllIIlIIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIIlIIlIllll) {
            llllllllllllllIllIIllIIlIIlIllll.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIIIllIlII() {
        lIllIIIIlIllI = new String[lIllIIIIlIlll[14]];
        i.lIllIIIIlIllI[i.lIllIIIIlIlll[1]] = i.llIIIlIIIllIIIl("i84IydNHl18=", "ECAFV");
        i.lIllIIIIlIllI[i.lIllIIIIlIlll[0]] = i.llIIIlIIIllIIlI("PLUgRzF7Ki0=", "TaWlP");
        i.lIllIIIIlIllI[i.lIllIIIIlIlll[10]] = i.llIIIlIIIllIIll("MAYWNQ==", "uGEaZ");
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public static i b(TileObject tileObject) {
        return Arrays.stream(i.values()).filter(i2 -> {
            boolean bl;
            if (i.llIIIlIIIllIllI(i2.v(), tileObject.getId())) {
                bl = lIllIIIIlIlll[0];
                "".length();
                if (null != null) {
                    return ((0x53 ^ 0x78 ^ (0x1F ^ 0x2D)) & (142 + 138 - 118 + 22 ^ 96 + 123 - 196 + 138 ^ -" ".length())) != 0;
                }
            } else {
                bl = lIllIIIIlIlll[1];
            }
            return bl;
        }).findFirst().orElse(null);
    }

    public int v() {
        return this.treeId;
    }

    static {
        i.llIIIlIIIllIlIl();
        i.llIIIlIIIllIlII();
        WEST = new i(lIllIIIIlIlll[2], new RectangularArea(lIllIIIIlIlll[3], lIllIIIIlIlll[4], lIllIIIIlIlll[3], lIllIIIIlIlll[5]));
        MIDDLE = new i(lIllIIIIlIlll[6], new RectangularArea(lIllIIIIlIlll[7], lIllIIIIlIlll[8], lIllIIIIlIlll[9], lIllIIIIlIlll[8]));
        EAST = new i(lIllIIIIlIlll[11], new RectangularArea(lIllIIIIlIlll[12], lIllIIIIlIlll[13], lIllIIIIlIlll[12], lIllIIIIlIlll[5]));
        i[] iArray = new i[lIllIIIIlIlll[14]];
        iArray[i.lIllIIIIlIlll[1]] = WEST;
        iArray[i.lIllIIIIlIlll[0]] = MIDDLE;
        iArray[i.lIllIIIIlIlll[10]] = EAST;
        $VALUES = iArray;
    }

    private i(int n2, RectangularArea rectangularArea) {
        this.treeId = n2;
        this.chopArea = rectangularArea;
    }

    public long u() {
        return this.chopTimestamp + 15L - (long)Static.getClient().getTickCount();
    }

    public void a(long l2) {
        this.chopTimestamp = l2;
    }

    private static String llIIIlIIIllIIlI(String llllllllllllllIllIIllIIlIIIlllll, String llllllllllllllIllIIllIIlIIlIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIlIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIIlIIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIIlIIlIIIll.init(lIllIIIIlIlll[10], llllllllllllllIllIIllIIlIIlIIlII);
            return new String(llllllllllllllIllIIllIIlIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIIlIIlIIIlI) {
            llllllllllllllIllIIllIIlIIlIIIlI.printStackTrace();
            return null;
        }
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

