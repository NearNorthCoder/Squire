/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public final class CEnum
extends Enum<c> {
    private static /* synthetic */ String[] lIIlllIIIIllI;
    private final /* synthetic */ WorldPoint anchor;
    private final /* synthetic */ WorldPoint curtainLocation;
    private static final /* synthetic */ c[] $VALUES;
    private final /* synthetic */ WorldPoint lureTo;
    private final /* synthetic */ WorldArea area;
    public static final /* synthetic */ /* enum */ c LADDER_HOUSE;
    public static final /* synthetic */ /* enum */ c MENAPHITE_HOUSE;
    private static /* synthetic */ int[] lIIlllIIIIlll;

    private static boolean lIllIIlIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    public WorldPoint s() {
        return this.curtainLocation;
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(WorldArea worldArea, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3) {
        this.area = worldArea;
        this.lureTo = worldPoint;
        this.anchor = worldPoint2;
        this.curtainLocation = worldPoint3;
    }

    private static String lIllIIlIIllIIII(String var5, String var7) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIIlllIIIIlll[18], var8);
            return new String(var14.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIllIIIl() {
        lIIlllIIIIllI = new String[lIIlllIIIIlll[18]];
        c.lIIlllIIIIllI[c.lIIlllIIIIlll[0]] = c."LADDER_HOUSE";
        c.lIIlllIIIIllI[c.lIIlllIIIIlll[8]] = c."MENAPHITE_HOUSE";
    }

    private static String lIllIIlIIlIllll(String var15, String var2) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIlll[19]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIlllIIIIlll[18], var10);
            return new String(var9.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIllIlII(int n2) {
        return n2 != 0;
    }

    public WorldArea p() {
        return this.area;
    }

    /*
     * WARNING - void declaration
     */
    public static c b(WorldPoint worldPoint) {
        void var6;
        c[] cArray = c.values();
        int n2 = cArray.length;
        int var1 = lIIlllIIIIlll[0];
        while (c.lIllIIlIIllIIll(var1, (int)var6)) {
            WorldPoint var13;
            void var3;
            void var12 = var3[var1];
            if (c.lIllIIlIIllIlII(var12.p().contains(var13) ? 1 : 0)) {
                return var12;
            }
            ++var1;
            0;
            
            return null;
        }
        return null;
    }

    public WorldPoint q() {
        return this.lureTo;
    }

    static {
        c.lIllIIlIIllIIlI();
        c.lIllIIlIIllIIIl();
        LADDER_HOUSE = new c(new WorldArea(lIIlllIIIIlll[1], lIIlllIIIIlll[2], lIIlllIIIIlll[3], lIIlllIIIIlll[4], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[5], lIIlllIIIIlll[2], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[1], lIIlllIIIIlll[6], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[5], lIIlllIIIIlll[7], lIIlllIIIIlll[0]));
        MENAPHITE_HOUSE = new c(new WorldArea(lIIlllIIIIlll[9], lIIlllIIIIlll[10], lIIlllIIIIlll[11], lIIlllIIIIlll[4], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[12], lIIlllIIIIlll[13], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[14], lIIlllIIIIlll[15], lIIlllIIIIlll[0]), new WorldPoint(lIIlllIIIIlll[16], lIIlllIIIIlll[17], lIIlllIIIIlll[0]));
        c[] cArray = new c[lIIlllIIIIlll[18]];
        cArray[c.lIIlllIIIIlll[0]] = LADDER_HOUSE;
        cArray[c.lIIlllIIIIlll[8]] = MENAPHITE_HOUSE;
        $VALUES = cArray;
    }

    private static void lIllIIlIIllIIlI() {
        lIIlllIIIIlll = new int[20];
        c.lIIlllIIIIlll[0] = (0x5A ^ 0x39 ^ (8 ^ 0x53)) & (0xA2 ^ 0xC6 ^ (0x3B ^ 0x67) ^ -1);
        c.lIIlllIIIIlll[1] = 0xFFFFCFE7 & 0x3D3B;
        c.lIIlllIIIIlll[2] = 0xFFFFAFFA & 0x5BBD;
        c.lIIlllIIIIlll[3] = 3;
        c.lIIlllIIIIlll[4] = 0xB2 ^ 0xAD ^ (0x28 ^ 0x33);
        c.lIIlllIIIIlll[5] = -(0xFFFFBB13 & 0x54FF) & (0xFFFF9D76 & 0x7FBF);
        c.lIIlllIIIIlll[6] = -(0xFFFFF78B & 0x6C7D) & (0xFFFFEFFF & 0x7FBD);
        c.lIIlllIIIIlll[7] = -(0xFFFFEEFD & 0x354B) & (0xFFFFBFFF & 0x6FFF);
        c.lIIlllIIIIlll[8] = 1;
        c.lIIlllIIIIlll[9] = -(0xFFFFEFDF & 0x70E3) & (0xFFFFEDFE & 0x7FCF);
        c.lIIlllIIIIlll[10] = -(0xFFFFFFEB & 0x5057) & (0xFFFFFFCB & 0x5BFF);
        c.lIIlllIIIIlll[11] = 52 + 134 - 139 + 92 ^ 57 + 127 - 45 + 3;
        c.lIIlllIIIIlll[12] = -(0xFFFFA3F9 & 0x7EB7) & (0xFFFFEFBF & 0x3FFF);
        c.lIIlllIIIIlll[13] = -(0xFFFFECE7 & 0x777D) & (0xFFFFEFEE & Short.MAX_VALUE);
        c.lIIlllIIIIlll[14] = -(0xFFFFBA0E & 0x57F3) & (0xFFFF9FB7 & 0x7F5B);
        c.lIIlllIIIIlll[15] = 0xFFFFEBFF & 0x1F8D;
        c.lIIlllIIIIlll[16] = 0xFFFFEF15 & 0x1DFB;
        c.lIIlllIIIIlll[17] = 0xFFFFFBCF & 0xFBB;
        c.lIIlllIIIIlll[18] = 2;
        c.lIIlllIIIIlll[19] = 121 + 139 - 244 + 189 ^ 151 + 129 - 104 + 21;
    }

    public WorldPoint r() {
        return this.anchor;
    }
}

