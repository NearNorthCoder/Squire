package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.client.Static;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.i  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/i.class */
public final class i {
    private final /* synthetic */ RectangularArea chopArea;
    public static final /* synthetic */ i WEST;
    public static final /* synthetic */ i EAST;
    private /* synthetic */ long chopTimestamp;
    private final /* synthetic */ int treeId;
    private static /* synthetic */ int[] lIllIIIIlIlll;
    public static final /* synthetic */ i MIDDLE;
    private static final /* synthetic */ i[] $VALUES;
    private static /* synthetic */ String[] lIllIIIIlIllI;

    private static String llIIIlIIIllIIll(String llllllllllllllIllIIllIIlIIIlIIIl, String llllllllllllllIllIIllIIlIIIlIIII) {
        String llllllllllllllIllIIllIIlIIIlIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIIlIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIIlIIIIllll = new StringBuilder();
        char[] charArray = llllllllllllllIllIIllIIlIIIlIIII.toCharArray();
        int llllllllllllllIllIIllIIlIIIIlIII = lIllIIIIlIlll[1];
        char[] charArray2 = llllllllllllllIllIIllIIlIIIlIIIl2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIllIIllIIlIIIIIlIl = lIllIIIIlIlll[1];
        while (llIIIlIIIllIlll(llllllllllllllIllIIllIIlIIIIIlIl, length)) {
            llllllllllllllIllIIllIIlIIIIllll.append((char) (charArray2[llllllllllllllIllIIllIIlIIIIIlIl] ^ charArray[llllllllllllllIllIIllIIlIIIIlIII % charArray.length]));
            "".length();
            llllllllllllllIllIIllIIlIIIIlIII++;
            llllllllllllllIllIIllIIlIIIIIlIl++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIllIIlIIIIllll);
    }

    private static void llIIIlIIIllIlIl() {
        lIllIIIIlIlll = new int[16];
        lIllIIIIlIlll[0] = " ".length();
        lIllIIIIlIlll[1] = ((34 ^ 100) ^ (214 ^ 175)) & (((((133 + 106) - 177) + 108) ^ (((81 + 22) - 100) + 146)) ^ (-" ".length()));
        lIllIIIIlIlll[2] = (-(((102 + 36) - 125) + 125)) & (-2149) & 32767;
        lIllIIIIlIlll[3] = (-16673) & 20385;
        lIllIIIIlIlll[4] = (-20482) & 24315;
        lIllIIIIlIlll[5] = (-16643) & 20478;
        lIllIIIIlIlll[6] = (-236) & 30715;
        lIllIIIIlIlll[7] = (-((-10353) & 14837)) & (-1) & 8191;
        lIllIIIIlIlll[8] = (-((-27669) & 32021)) & (-16385) & 24571;
        lIllIIIIlIlll[9] = (-16641) & 20349;
        lIllIIIIlIlll[10] = "  ".length();
        lIllIIIIlIlll[11] = (-2191) & 32671;
        lIllIIIIlIlll[12] = (-4097) & 7800;
        lIllIIIIlIlll[13] = (-((-22153) & 30602)) & (-16385) & 28671;
        lIllIIIIlIlll[14] = "   ".length();
        lIllIIIIlIlll[15] = (((144 + 56) - 73) + 29) ^ (((123 + 137) - 220) + 108);
    }

    private static boolean llIIIlIIIllIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIlIIIllIlll(int i, int i2) {
        return i < i2;
    }

    public RectangularArea w() {
        return this.chopArea;
    }

    private static String llIIIlIIIllIIIl(String llllllllllllllIllIIllIIlIIlIlllI, String llllllllllllllIllIIllIIlIIlIllIl) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIlIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIlll[15]), "DES");
            Cipher llllllllllllllIllIIllIIlIIllIIII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIIlIIllIIII.init(lIllIIIIlIlll[10], llllllllllllllIllIIllIIlIIllIIIl);
            return new String(llllllllllllllIllIIllIIlIIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIlIIlIllll) {
            llllllllllllllIllIIllIIlIIlIllll.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIIIllIlII() {
        lIllIIIIlIllI = new String[lIllIIIIlIlll[14]];
        lIllIIIIlIllI[lIllIIIIlIlll[1]] = llIIIlIIIllIIIl("i84IydNHl18=", "ECAFV");
        lIllIIIIlIllI[lIllIIIIlIlll[0]] = llIIIlIIIllIIlI("PLUgRzF7Ki0=", "TaWlP");
        lIllIIIIlIllI[lIllIIIIlIlll[10]] = llIIIlIIIllIIll("MAYWNQ==", "uGEaZ");
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i b(TileObject tileObject) {
        return (i) Arrays.stream(values()).filter(iVar -> {
            if (llIIIlIIIllIllI(iVar.v(), tileObject.getId())) {
                ?? r0 = lIllIIIIlIlll[0];
                "".length();
                return 0 != 0 ? ((83 ^ 120) ^ (31 ^ 45)) & (((((142 + 138) - 118) + 22) ^ (((96 + 123) - 196) + 138)) ^ (-" ".length())) : r0;
            }
            return lIllIIIIlIlll[1];
        }).findFirst().orElse(null);
    }

    public int v() {
        return this.treeId;
    }

    static {
        llIIIlIIIllIlIl();
        llIIIlIIIllIlII();
        WEST = new i(lIllIIIIlIllI[lIllIIIIlIlll[1]], lIllIIIIlIlll[1], lIllIIIIlIlll[2], new RectangularArea(lIllIIIIlIlll[3], lIllIIIIlIlll[4], lIllIIIIlIlll[3], lIllIIIIlIlll[5]));
        MIDDLE = new i(lIllIIIIlIllI[lIllIIIIlIlll[0]], lIllIIIIlIlll[0], lIllIIIIlIlll[6], new RectangularArea(lIllIIIIlIlll[7], lIllIIIIlIlll[8], lIllIIIIlIlll[9], lIllIIIIlIlll[8]));
        EAST = new i(lIllIIIIlIllI[lIllIIIIlIlll[10]], lIllIIIIlIlll[10], lIllIIIIlIlll[11], new RectangularArea(lIllIIIIlIlll[12], lIllIIIIlIlll[13], lIllIIIIlIlll[12], lIllIIIIlIlll[5]));
        i[] iVarArr = new i[lIllIIIIlIlll[14]];
        iVarArr[lIllIIIIlIlll[1]] = WEST;
        iVarArr[lIllIIIIlIlll[0]] = MIDDLE;
        iVarArr[lIllIIIIlIlll[10]] = EAST;
        $VALUES = iVarArr;
    }

    private i(String str, int i, int i2, RectangularArea rectangularArea) {
        this.treeId = i2;
        this.chopArea = rectangularArea;
    }

    public long u() {
        return (this.chopTimestamp + 15) - Static.getClient().getTickCount();
    }

    public void a(long j) {
        this.chopTimestamp = j;
    }

    private static String llIIIlIIIllIIlI(String llllllllllllllIllIIllIIlIIlIIIIl, String llllllllllllllIllIIllIIlIIlIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIlIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIIlIIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIIlIIlIIIll.init(lIllIIIIlIlll[10], llllllllllllllIllIIllIIlIIlIIlII);
            return new String(llllllllllllllIllIIllIIlIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIlIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIlIIlIIIlI) {
            llllllllllllllIllIIllIIlIIlIIIlI.printStackTrace();
            return null;
        }
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
