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

public class c_Unknown {
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
        c.lIIlllIIIllII[0] = 1;
        c.lIIlllIIIllII[1] = -3;
        c.lIIlllIIIllII[2] = -1;
        c.lIIlllIIIllII[3] = -2;
        c.lIIlllIIIllII[4] = -(0xFE ^ 0xA0 ^ (0x51 ^ 0xA));
        c.lIIlllIIIllII[5] = -(150 + 128 - 203 + 77 ^ 73 + 69 - 54 + 70);
        c.lIIlllIIIllII[6] = -(0x4F ^ 0x48);
        c.lIIlllIIIllII[7] = (0x59 ^ 0x1F ^ (0x68 ^ 0xF)) & (0xDA ^ 0x83 ^ (0x5D ^ 0x25) ^ -1);
        c.lIIlllIIIllII[8] = 0x5C ^ 0x54;
        c.lIIlllIIIllII[9] = 0x95 ^ 0x9A;
        c.lIIlllIIIllII[10] = 3;
        c.lIIlllIIIllII[11] = 0x76 ^ 0x63;
        c.lIIlllIIIllII[12] = 2;
        c.lIIlllIIIllII[13] = 0xAA ^ 0xAF;
        c.lIIlllIIIllII[14] = 45 + 4 - -70 + 11 ^ 102 + 114 - 214 + 130;
        c.lIIlllIIIllII[15] = 0x5F ^ 0x58;
        c.lIIlllIIIllII[16] = -(94 + 190 - 278 + 195 ^ 111 + 49 - 141 + 179);
        c.lIIlllIIIllII[17] = -(0x98 ^ 0x94 ^ 1);
        c.lIIlllIIIllII[18] = -(0xD0 ^ 0xC7);
        c.lIIlllIIIllII[19] = -(0xF9 ^ 0x85 ^ (0x27 ^ 0x48));
        c.lIIlllIIIllII[20] = 0xC5 ^ 0xC1;
        c.lIIlllIIIllII[21] = 0xCB ^ 0xC2;
        c.lIIlllIIIllII[22] = 0x24 ^ 0x7E ^ (0x14 ^ 0x44);
    }

    public WorldPoint Z() {
        return this.Q;
    }

    private static String lIllIIlIIllIlII(String var15, String var10) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var22 = var10.toCharArray();
        int var5 = lIIlllIIIllII[7];
        char[] var12 = var15.toCharArray();
        int var6 = var12.length;
        int var9 = lIIlllIIIllII[7];
        while (c.lIllIIlIIllllIl(var9, var6)) {
            char var16 = var12[var9];
            var1.append((char)(var16 ^ var22[var5 % var22.length]));
            0;
            ++var5;
            ++var9;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    public TileObject W() {
        void var4;
        TileObject tileObject = this.T();
        TileObject tileObject2 = this.U();
        if (c.lIllIIlIIllllII(tileObject) && c.lIllIIlIIllllII(tileObject2)) {
            void var11;
            int n2;
            int n3 = tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation());
            if (c.lIllIIlIIllllIl(n3, n2 = tileObject2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()))) {
                return var4;
            }
            return var11;
        }
        if (c.lIllIIlIIllllII(var4)) {
            return var4;
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

    private static String lIllIIlIIllIIll(String var23, String var7) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(lIIlllIIIllII[12], var20);
            return new String(var21.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
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

    private static String lIllIIlIIllIlIl(String var3, String var13) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIIlllIIIllII[8]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIIlllIIIllII[12], var8);
            return new String(var14.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
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
            0;
            if (2 <= -1) {
                throw null;
            }
        } else {
            c var19;
            void var18;
            var19.R = var18.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[0]);
            var19.S = var18.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[12]);
            var19.T = var18.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[13]);
            var19.U = var18.dx(lIIlllIIIllII[10]).dy(lIIlllIIIllII[14]);
            var19.V = var18.dx(lIIlllIIIllII[12]).dy(lIIlllIIIllII[15]);
            var19.W = var18.dx(lIIlllIIIllII[7]).dy(lIIlllIIIllII[10]);
            var19.X = var18.dx(lIIlllIIIllII[16]).dy(lIIlllIIIllII[17]);
            var19.Y = var18.dx(lIIlllIIIllII[18]).dy(lIIlllIIIllII[19]);
            var19.Z = var19.W.dx(lIIlllIIIllII[3]);
        }
    }

    private static void lIllIIlIIllIllI() {
        lIIlllIIIlIlI = new String[lIIlllIIIllII[22]];
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[7]] = c."Cook-at";
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[0]] = c."Tether";
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[12]] = c."Untether";
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[10]] = c."Tether";
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[20]] = c."Untether";
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[13]] = c."Take";
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[14]] = c."Take";
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[15]] = c."Take";
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[8]] = c."Use";
        c.lIIlllIIIlIlI[c.lIIlllIIIllII[21]] = c."Take";
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

