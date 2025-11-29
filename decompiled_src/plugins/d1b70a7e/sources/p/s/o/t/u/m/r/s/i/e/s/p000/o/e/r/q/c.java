package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/c.class */
public class c {
    private final /* synthetic */ WorldPoint P;
    private final /* synthetic */ WorldPoint S;
    private final /* synthetic */ WorldPoint Y;
    private final /* synthetic */ WorldPoint X;
    private final /* synthetic */ WorldPoint Q;
    private final /* synthetic */ WorldPoint R;
    private final /* synthetic */ boolean aa;
    private static /* synthetic */ String[] lIIlllIIIlIlI;
    private final /* synthetic */ WorldPoint Z;
    private final /* synthetic */ WorldPoint T;
    private final /* synthetic */ WorldPoint U;
    private static /* synthetic */ int[] lIIlllIIIllII;
    private final /* synthetic */ WorldPoint O;
    private final /* synthetic */ WorldPoint V;
    private final /* synthetic */ WorldPoint W;

    public TileObject U() {
        return TileObjects.getFirstAt(this.X, tileObject -> {
            String[] strArr = new String[lIIlllIIIllII[12]];
            strArr[lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[0]];
            strArr[lIIlllIIIllII[0]] = lIIlllIIIlIlI[lIIlllIIIllII[12]];
            return tileObject.hasAction(strArr);
        });
    }

    public WorldPoint ae() {
        return this.V;
    }

    public TileObject Q() {
        return TileObjects.getFirstAt(this.T, tileObject -> {
            String[] strArr = new String[lIIlllIIIllII[0]];
            strArr[lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[15]];
            return tileObject.hasAction(strArr);
        });
    }

    public WorldPoint ad() {
        return this.U;
    }

    private static boolean lIllIIlIIllllII(Object obj) {
        return obj != null;
    }

    private static void lIllIIlIIlllIlI() {
        lIIlllIIIllII = new int[23];
        lIIlllIIIllII[0] = " ".length();
        lIIlllIIIllII[1] = -"   ".length();
        lIIlllIIIllII[2] = -" ".length();
        lIIlllIIIllII[3] = -"  ".length();
        lIIlllIIIllII[4] = -((254 ^ 160) ^ (81 ^ 10));
        lIIlllIIIllII[5] = -((((150 + 128) - 203) + 77) ^ (((73 + 69) - 54) + 70));
        lIIlllIIIllII[6] = -(79 ^ 72);
        lIIlllIIIllII[7] = ((89 ^ 31) ^ (104 ^ 15)) & (((218 ^ 131) ^ (93 ^ 37)) ^ (-" ".length()));
        lIIlllIIIllII[8] = 92 ^ 84;
        lIIlllIIIllII[9] = 149 ^ 154;
        lIIlllIIIllII[10] = "   ".length();
        lIIlllIIIllII[11] = 118 ^ 99;
        lIIlllIIIllII[12] = "  ".length();
        lIIlllIIIllII[13] = 170 ^ 175;
        lIIlllIIIllII[14] = (((45 + 4) - (-70)) + 11) ^ (((102 + 114) - 214) + 130);
        lIIlllIIIllII[15] = 95 ^ 88;
        lIIlllIIIllII[16] = -((((94 + 190) - 278) + 195) ^ (((111 + 49) - 141) + 179));
        lIIlllIIIllII[17] = -((152 ^ 148) ^ " ".length());
        lIIlllIIIllII[18] = -(208 ^ 199);
        lIIlllIIIllII[19] = -((249 ^ 133) ^ (39 ^ 72));
        lIIlllIIIllII[20] = 197 ^ 193;
        lIIlllIIIllII[21] = 203 ^ 194;
        lIIlllIIIllII[22] = (36 ^ 126) ^ (20 ^ 68);
    }

    public WorldPoint Z() {
        return this.Q;
    }

    private static String lIllIIlIIllIlII(String llllllllllllllIlllIllIIIlIIIllIl, String llllllllllllllIlllIllIIIlIIIllII) {
        String llllllllllllllIlllIllIIIlIIIllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllIIIlIIIlIlI = llllllllllllllIlllIllIIIlIIIllII.toCharArray();
        int llllllllllllllIlllIllIIIlIIIlIIl = lIIlllIIIllII[7];
        char[] charArray = llllllllllllllIlllIllIIIlIIIllIl2.toCharArray();
        int length = charArray.length;
        int i = lIIlllIIIllII[7];
        while (lIllIIlIIllllIl(i, length)) {
            char llllllllllllllIlllIllIIIlIIIlllI = charArray[i];
            sb.append((char) (llllllllllllllIlllIllIIIlIIIlllI ^ llllllllllllllIlllIllIIIlIIIlIlI[llllllllllllllIlllIllIIIlIIIlIIl % llllllllllllllIlllIllIIIlIIIlIlI.length]));
            "".length();
            llllllllllllllIlllIllIIIlIIIlIIl++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public TileObject W() {
        TileObject T = T();
        TileObject U = U();
        return (lIllIIlIIllllII(T) && lIllIIlIIllllII(U)) ? lIllIIlIIllllIl(T.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), U.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation())) ? T : U : lIllIIlIIllllII(T) ? T : U;
    }

    public TileObject S() {
        return TileObjects.getFirstAt(this.V, tileObject -> {
            String[] strArr = new String[lIIlllIIIllII[0]];
            strArr[lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[13]];
            return tileObject.hasAction(strArr);
        });
    }

    public WorldPoint ag() {
        return this.X;
    }

    public WorldPoint ac() {
        return this.T;
    }

    public WorldPoint af() {
        return this.W;
    }

    private static String lIllIIlIIllIIll(String llllllllllllllIlllIllIIIlIlIlIlI, String llllllllllllllIlllIllIIIlIlIlIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIlIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIIlIlIllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIIlIlIllII.init(lIIlllIIIllII[12], llllllllllllllIlllIllIIIlIlIllIl);
            return new String(llllllllllllllIlllIllIIIlIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIlIlIlIll) {
            llllllllllllllIlllIllIIIlIlIlIll.printStackTrace();
            return null;
        }
    }

    public WorldPoint Y() {
        return this.P;
    }

    public TileObject O() {
        return TileObjects.getFirstAt(this.R, tileObject -> {
            String[] strArr = new String[lIIlllIIIllII[0]];
            strArr[lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[21]];
            return tileObject.hasAction(strArr);
        });
    }

    public WorldPoint ab() {
        return this.S;
    }

    private static String lIllIIlIIllIlIl(String llllllllllllllIlllIllIIIlIIlllIl, String llllllllllllllIlllIllIIIlIIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIlIIllIlI.getBytes(StandardCharsets.UTF_8)), lIIlllIIIllII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIllII[12], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIlIIllllI) {
            llllllllllllllIlllIllIIIlIIllllI.printStackTrace();
            return null;
        }
    }

    public TileObject R() {
        return TileObjects.getFirstAt(this.U, tileObject -> {
            String[] strArr = new String[lIIlllIIIllII[0]];
            strArr[lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[14]];
            return tileObject.hasAction(strArr);
        });
    }

    public WorldPoint X() {
        return this.O;
    }

    public TileObject P() {
        return TileObjects.getFirstAt(this.S, tileObject -> {
            String[] strArr = new String[lIIlllIIIllII[0]];
            strArr[lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[8]];
            return tileObject.hasAction(strArr);
        });
    }

    public boolean aj() {
        return this.aa;
    }

    public c(WorldPoint worldPoint, WorldPoint worldPoint2, boolean z) {
        this.O = worldPoint;
        this.Q = worldPoint.dx(lIIlllIIIllII[0]).dy(lIIlllIIIllII[0]);
        this.P = worldPoint2.getWorldLocation();
        this.aa = z;
        if (!lIllIIlIIlllIll(z ? 1 : 0)) {
            this.R = worldPoint.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[0]);
            this.S = worldPoint.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[12]);
            this.T = worldPoint.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[13]);
            this.U = worldPoint.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[14]);
            this.V = worldPoint.dx(lIIlllIIIllII[12]).dy(lIIlllIIIllII[15]);
            this.W = worldPoint.dx(lIIlllIIIllII[7]).dy(lIIlllIIIllII[10]);
            this.X = worldPoint.dx(lIIlllIIIllII[16]).dy(lIIlllIIIllII[17]);
            this.Y = worldPoint.dx(lIIlllIIIllII[18]).dy(lIIlllIIIllII[19]);
            this.Z = this.W.dx(lIIlllIIIllII[3]);
            return;
        }
        this.R = worldPoint.dx(lIIlllIIIllII[1]).dy(lIIlllIIIllII[2]);
        this.S = worldPoint.dx(lIIlllIIIllII[1]).dy(lIIlllIIIllII[3]);
        this.T = worldPoint.dx(lIIlllIIIllII[1]).dy(lIIlllIIIllII[4]);
        this.U = worldPoint.dx(lIIlllIIIllII[1]).dy(lIIlllIIIllII[5]);
        this.V = worldPoint.dx(lIIlllIIIllII[3]).dy(lIIlllIIIllII[6]);
        this.W = worldPoint.dx(lIIlllIIIllII[7]).dy(lIIlllIIIllII[1]);
        this.X = worldPoint.dx(lIIlllIIIllII[8]).dy(lIIlllIIIllII[9]);
        this.Y = worldPoint.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[11]);
        this.Z = this.W.dx(lIIlllIIIllII[12]);
        "".length();
        if ("  ".length() <= (-" ".length())) {
            throw null;
        }
    }

    private static void lIllIIlIIllIllI() {
        lIIlllIIIlIlI = new String[lIIlllIIIllII[22]];
        lIIlllIIIlIlI[lIIlllIIIllII[7]] = lIllIIlIIllIIll("o43qOZOso+I=", "NdsSf");
        lIIlllIIIlIlI[lIIlllIIIllII[0]] = lIllIIlIIllIlII("JwAADgoB", "setfo");
        lIIlllIIIlIlI[lIIlllIIIllII[12]] = lIllIIlIIllIlIl("waQVGfIrHzohGRkeUPbiag==", "bTwUg");
        lIIlllIIIlIlI[lIIlllIIIllII[10]] = lIllIIlIIllIlIl("s/uRdplH/mQ=", "wBQSY");
        lIIlllIIIlIlI[lIIlllIIIllII[20]] = lIllIIlIIllIlIl("RycVwMvaLgmYL6LKxvwB+Q==", "PJjaj");
        lIIlllIIIlIlI[lIIlllIIIllII[13]] = lIllIIlIIllIlII("Pw45Bw==", "koRbj");
        lIIlllIIIlIlI[lIIlllIIIllII[14]] = lIllIIlIIllIlIl("f+7pDg5IguQ=", "qQYRE");
        lIIlllIIIlIlI[lIIlllIIIllII[15]] = lIllIIlIIllIlII("IyI5Lw==", "wCRJZ");
        lIIlllIIIlIlI[lIIlllIIIllII[8]] = lIllIIlIIllIIll("GFAqj200HI0=", "fDpCL");
        lIIlllIIIlIlI[lIIlllIIIllII[21]] = lIllIIlIIllIlIl("BrW4GERxstc=", "retIH");
    }

    public TileObject T() {
        return TileObjects.getFirstAt(this.W, tileObject -> {
            String[] strArr = new String[lIIlllIIIllII[12]];
            strArr[lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[10]];
            strArr[lIIlllIIIllII[0]] = lIIlllIIIlIlI[lIIlllIIIllII[20]];
            return tileObject.hasAction(strArr);
        });
    }

    static {
        lIllIIlIIlllIlI();
        lIllIIlIIllIllI();
    }

    public WorldPoint ai() {
        return this.Z;
    }

    public TileObject V() {
        return TileObjects.getFirstAt(this.Y, tileObject -> {
            String[] strArr = new String[lIIlllIIIllII[0]];
            strArr[lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[7]];
            return tileObject.hasAction(strArr);
        });
    }

    private static boolean lIllIIlIIllllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIlIIlllIll(int i) {
        return i != 0;
    }

    public WorldPoint ah() {
        return this.Y;
    }

    public WorldPoint aa() {
        return this.R;
    }
}
