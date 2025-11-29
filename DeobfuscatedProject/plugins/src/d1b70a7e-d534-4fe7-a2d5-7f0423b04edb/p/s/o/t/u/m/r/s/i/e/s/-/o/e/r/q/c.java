/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

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
        return TileObjects.getFirstAt((WorldPoint)this.X, tileObject -> {
            String[] stringArray = new String[lIIlllIIIllII[12]];
            stringArray[c.lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[0]];
            stringArray[c.lIIlllIIIllII[0]] = lIIlllIIIlIlI[lIIlllIIIllII[12]];
            return tileObject.hasAction(stringArray);
        });
    }

    public WorldPoint ae() {
        return this.V;
    }

    public TileObject Q() {
        return TileObjects.getFirstAt((WorldPoint)this.T, tileObject -> {
            String[] stringArray = new String[lIIlllIIIllII[0]];
            stringArray[c.lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[15]];
            return tileObject.hasAction(stringArray);
        });
    }

    public WorldPoint ad() {
        return this.U;
    }

    private static boolean lIllIIlIIllllII(Object object) {
        return object != null;
    }

    private static void lIllIIlIIlllIlI() {
        lIIlllIIIllII = new int[23];
        c.lIIlllIIIllII[0] = " ".length();
        c.lIIlllIIIllII[1] = -"   ".length();
        c.lIIlllIIIllII[2] = -" ".length();
        c.lIIlllIIIllII[3] = -"  ".length();
        c.lIIlllIIIllII[4] = -(0xFE ^ 0xA0 ^ (0x51 ^ 0xA));
        c.lIIlllIIIllII[5] = -(150 + 128 - 203 + 77 ^ 73 + 69 - 54 + 70);
        c.lIIlllIIIllII[6] = -(0x4F ^ 0x48);
        c.lIIlllIIIllII[7] = (0x59 ^ 0x1F ^ (0x68 ^ 0xF)) & (0xDA ^ 0x83 ^ (0x5D ^ 0x25) ^ -" ".length());
        c.lIIlllIIIllII[8] = 0x5C ^ 0x54;
        c.lIIlllIIIllII[9] = 0x95 ^ 0x9A;
        c.lIIlllIIIllII[10] = "   ".length();
        c.lIIlllIIIllII[11] = 0x76 ^ 0x63;
        c.lIIlllIIIllII[12] = "  ".length();
        c.lIIlllIIIllII[13] = 0xAA ^ 0xAF;
        c.lIIlllIIIllII[14] = 45 + 4 - -70 + 11 ^ 102 + 114 - 214 + 130;
        c.lIIlllIIIllII[15] = 0x5F ^ 0x58;
        c.lIIlllIIIllII[16] = -(94 + 190 - 278 + 195 ^ 111 + 49 - 141 + 179);
        c.lIIlllIIIllII[17] = -(0x98 ^ 0x94 ^ " ".length());
        c.lIIlllIIIllII[18] = -(0xD0 ^ 0xC7);
        c.lIIlllIIIllII[19] = -(0xF9 ^ 0x85 ^ (0x27 ^ 0x48));
        c.lIIlllIIIllII[20] = 0xC5 ^ 0xC1;
        c.lIIlllIIIllII[21] = 0xCB ^ 0xC2;
        c.lIIlllIIIllII[22] = 0x24 ^ 0x7E ^ (0x14 ^ 0x44);
    }

    public WorldPoint Z() {
        return this.Q;
    }

    private static String lIllIIlIIllIlII(String llllllllllllllIlllIllIIIlIIIlIII, String llllllllllllllIlllIllIIIlIIIllII) {
        llllllllllllllIlllIllIIIlIIIlIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIIlIIIlIll = new StringBuilder();
        char[] llllllllllllllIlllIllIIIlIIIlIlI = llllllllllllllIlllIllIIIlIIIllII.toCharArray();
        int llllllllllllllIlllIllIIIlIIIlIIl = lIIlllIIIllII[7];
        char[] llllllllllllllIlllIllIIIlIIIIIll = llllllllllllllIlllIllIIIlIIIlIII.toCharArray();
        int llllllllllllllIlllIllIIIlIIIIIlI = llllllllllllllIlllIllIIIlIIIIIll.length;
        int llllllllllllllIlllIllIIIlIIIIIIl = lIIlllIIIllII[7];
        while (c.lIllIIlIIllllIl(llllllllllllllIlllIllIIIlIIIIIIl, llllllllllllllIlllIllIIIlIIIIIlI)) {
            char llllllllllllllIlllIllIIIlIIIlllI = llllllllllllllIlllIllIIIlIIIIIll[llllllllllllllIlllIllIIIlIIIIIIl];
            llllllllllllllIlllIllIIIlIIIlIll.append((char)(llllllllllllllIlllIllIIIlIIIlllI ^ llllllllllllllIlllIllIIIlIIIlIlI[llllllllllllllIlllIllIIIlIIIlIIl % llllllllllllllIlllIllIIIlIIIlIlI.length]));
            "".length();
            ++llllllllllllllIlllIllIIIlIIIlIIl;
            ++llllllllllllllIlllIllIIIlIIIIIIl;
            "".length();
            if (-" ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIIlIIIlIll);
    }

    /*
     * WARNING - void declaration
     */
    public TileObject W() {
        void llllllllllllllIlllIllIIIlIllIlIl;
        TileObject tileObject = this.T();
        TileObject tileObject2 = this.U();
        if (c.lIllIIlIIllllII(tileObject) && c.lIllIIlIIllllII(tileObject2)) {
            void llllllllllllllIlllIllIIIlIllIlII;
            int n2;
            int n3 = tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation());
            if (c.lIllIIlIIllllIl(n3, n2 = tileObject2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()))) {
                return llllllllllllllIlllIllIIIlIllIlIl;
            }
            return llllllllllllllIlllIllIIIlIllIlII;
        }
        if (c.lIllIIlIIllllII(llllllllllllllIlllIllIIIlIllIlIl)) {
            return llllllllllllllIlllIllIIIlIllIlIl;
        }
        return tileObject2;
    }

    public TileObject S() {
        return TileObjects.getFirstAt((WorldPoint)this.V, tileObject -> {
            String[] stringArray = new String[lIIlllIIIllII[0]];
            stringArray[c.lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[13]];
            return tileObject.hasAction(stringArray);
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
        }
        catch (Exception llllllllllllllIlllIllIIIlIlIlIll) {
            llllllllllllllIlllIllIIIlIlIlIll.printStackTrace();
            return null;
        }
    }

    public WorldPoint Y() {
        return this.P;
    }

    public TileObject O() {
        return TileObjects.getFirstAt((WorldPoint)this.R, tileObject -> {
            String[] stringArray = new String[lIIlllIIIllII[0]];
            stringArray[c.lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[21]];
            return tileObject.hasAction(stringArray);
        });
    }

    public WorldPoint ab() {
        return this.S;
    }

    private static String lIllIIlIIllIlIl(String llllllllllllllIlllIllIIIlIIllIll, String llllllllllllllIlllIllIIIlIIlllII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIlIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIlIIlllII.getBytes(StandardCharsets.UTF_8)), lIIlllIIIllII[8]), "DES");
            Cipher llllllllllllllIlllIllIIIlIIlllll = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIIlIIlllll.init(lIIlllIIIllII[12], llllllllllllllIlllIllIIIlIlIIIII);
            return new String(llllllllllllllIlllIllIIIlIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIIlIIllllI) {
            llllllllllllllIlllIllIIIlIIllllI.printStackTrace();
            return null;
        }
    }

    public TileObject R() {
        return TileObjects.getFirstAt((WorldPoint)this.U, tileObject -> {
            String[] stringArray = new String[lIIlllIIIllII[0]];
            stringArray[c.lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[14]];
            return tileObject.hasAction(stringArray);
        });
    }

    public WorldPoint X() {
        return this.O;
    }

    public TileObject P() {
        return TileObjects.getFirstAt((WorldPoint)this.S, tileObject -> {
            String[] stringArray = new String[lIIlllIIIllII[0]];
            stringArray[c.lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[8]];
            return tileObject.hasAction(stringArray);
        });
    }

    public boolean aj() {
        return this.aa;
    }

    /*
     * WARNING - void declaration
     */
    public c(WorldPoint worldPoint, WorldPoint worldPoint2, boolean bl) {
        this.O = worldPoint;
        this.Q = worldPoint.dx(lIIlllIIIllII[0]).dy(lIIlllIIIllII[0]);
        this.P = worldPoint2.getWorldLocation();
        this.aa = bl;
        if (c.lIllIIlIIlllIll(bl ? 1 : 0)) {
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
            if ("  ".length() <= -" ".length()) {
                throw null;
            }
        } else {
            c llllllllllllllIlllIllIIIlIllllll;
            void llllllllllllllIlllIllIIIlIlllllI;
            llllllllllllllIlllIllIIIlIllllll.R = llllllllllllllIlllIllIIIlIlllllI.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[0]);
            llllllllllllllIlllIllIIIlIllllll.S = llllllllllllllIlllIllIIIlIlllllI.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[12]);
            llllllllllllllIlllIllIIIlIllllll.T = llllllllllllllIlllIllIIIlIlllllI.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[13]);
            llllllllllllllIlllIllIIIlIllllll.U = llllllllllllllIlllIllIIIlIlllllI.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[14]);
            llllllllllllllIlllIllIIIlIllllll.V = llllllllllllllIlllIllIIIlIlllllI.dx(lIIlllIIIllII[12]).dy(lIIlllIIIllII[15]);
            llllllllllllllIlllIllIIIlIllllll.W = llllllllllllllIlllIllIIIlIlllllI.dx(lIIlllIIIllII[7]).dy(lIIlllIIIllII[10]);
            llllllllllllllIlllIllIIIlIllllll.X = llllllllllllllIlllIllIIIlIlllllI.dx(lIIlllIIIllII[16]).dy(lIIlllIIIllII[17]);
            llllllllllllllIlllIllIIIlIllllll.Y = llllllllllllllIlllIllIIIlIlllllI.dx(lIIlllIIIllII[18]).dy(lIIlllIIIllII[19]);
            llllllllllllllIlllIllIIIlIllllll.Z = llllllllllllllIlllIllIIIlIllllll.W.dx(lIIlllIIIllII[3]);
        }
    }

    private static void lIllIIlIIllIllI() {
        lIIlllIIIlIlI = new String[lIIlllIIIllII[22]];
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[7]] = c.lIllIIlIIllIIll("o43qOZOso+I=", "NdsSf");
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[0]] = c.lIllIIlIIllIlII("JwAADgoB", "setfo");
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[12]] = c.lIllIIlIIllIlIl("waQVGfIrHzohGRkeUPbiag==", "bTwUg");
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[10]] = c.lIllIIlIIllIlIl("s/uRdplH/mQ=", "wBQSY");
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[20]] = c.lIllIIlIIllIlIl("RycVwMvaLgmYL6LKxvwB+Q==", "PJjaj");
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[13]] = c.lIllIIlIIllIlII("Pw45Bw==", "koRbj");
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[14]] = c.lIllIIlIIllIlIl("f+7pDg5IguQ=", "qQYRE");
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[15]] = c.lIllIIlIIllIlII("IyI5Lw==", "wCRJZ");
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[8]] = c.lIllIIlIIllIIll("GFAqj200HI0=", "fDpCL");
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[21]] = c.lIllIIlIIllIlIl("BrW4GERxstc=", "retIH");
    }

    public TileObject T() {
        return TileObjects.getFirstAt((WorldPoint)this.W, tileObject -> {
            String[] stringArray = new String[lIIlllIIIllII[12]];
            stringArray[c.lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[10]];
            stringArray[c.lIIlllIIIllII[0]] = lIIlllIIIlIlI[lIIlllIIIllII[20]];
            return tileObject.hasAction(stringArray);
        });
    }

    static {
        c.lIllIIlIIlllIlI();
        c.lIllIIlIIllIllI();
    }

    public WorldPoint ai() {
        return this.Z;
    }

    public TileObject V() {
        return TileObjects.getFirstAt((WorldPoint)this.Y, tileObject -> {
            String[] stringArray = new String[lIIlllIIIllII[0]];
            stringArray[c.lIIlllIIIllII[7]] = lIIlllIIIlIlI[lIIlllIIIllII[7]];
            return tileObject.hasAction(stringArray);
        });
    }

    private static boolean lIllIIlIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIIlllIll(int n2) {
        return n2 != 0;
    }

    public WorldPoint ah() {
        return this.Y;
    }

    public WorldPoint aa() {
        return this.R;
    }
}

