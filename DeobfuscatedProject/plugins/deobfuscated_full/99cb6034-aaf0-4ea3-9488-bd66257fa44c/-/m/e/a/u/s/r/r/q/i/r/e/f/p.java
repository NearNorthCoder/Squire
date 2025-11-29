/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;

public final class p
extends Enum<p> {
    private final /* synthetic */ int radius;
    public static final /* synthetic */ /* enum */ p FALADOR;
    private static final /* synthetic */ p[] $VALUES;
    private static /* synthetic */ int[] lIllllIIlIlI;
    public static final /* synthetic */ /* enum */ p WEISS;
    public static final /* synthetic */ /* enum */ p MONASTERY;
    public static final /* synthetic */ /* enum */ p FARMING_GUILD;
    public static final /* synthetic */ /* enum */ p MORYTANIA;
    public static final /* synthetic */ /* enum */ p GRAPE_VINE_KOUREND;
    public static final /* synthetic */ /* enum */ p CHAMPIONS_GUILD;
    private final /* synthetic */ WorldPoint worldPoint;
    public static final /* synthetic */ /* enum */ p ARDOUGNE;
    public static final /* synthetic */ /* enum */ p TROLLHEIM;
    public static final /* synthetic */ /* enum */ p FOSSIL_ISLAND_UNDERWATER;
    public static final /* synthetic */ /* enum */ p HARMONY;
    private static /* synthetic */ String[] lIllllIIlIIl;
    public static final /* synthetic */ /* enum */ p HOSIDIUS;
    public static final /* synthetic */ /* enum */ p CATHERBY;
    private final /* synthetic */ int regionID;

    private p(int n3, WorldPoint worldPoint) {
        this(n3, worldPoint, lIllllIIlIlI[0]);
    }

    private static String lllIlllIIIIIIl(String var17, String var8) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIllllIIlIlI[22]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIllllIIlIlI[10], var23);
            return new String(var13.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String lllIllIlllllll(String var7, String var21) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var3 = var21.toCharArray();
        int var4 = lIllllIIlIlI[1];
        char[] var11 = var7.toCharArray();
        int var14 = var11.length;
        int var9 = lIllllIIlIlI[1];
        while (p.lllIlllIIIIlII(var9, var14)) {
            char var10 = var11[var9];
            var24.append((char)(var10 ^ var3[var4 % var3.length]));
            0;
            ++var4;
            ++var9;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static void lllIlllIIIIIll() {
        lIllllIIlIlI = new int[55];
        p.lIllllIIlIlI[0] = 0xB ^ 0x1B;
        p.lIllllIIlIlI[1] = (0x91 ^ 0x84) & ~(0x25 ^ 0x30);
        p.lIllllIIlIlI[2] = -(0xFFFFFAC7 & 0x2539) & (0xFFFFB73F & 0x7BFA);
        p.lIllllIIlIlI[3] = 0xFFFFE4ED & 0x1FF2;
        p.lIllllIIlIlI[4] = 0xFFFFCEF3 & 0x3F9F;
        p.lIllllIIlIlI[5] = 0x67 ^ 0x43;
        p.lIllllIIlIlI[6] = 1;
        p.lIllllIIlIlI[7] = 0xFFFFFFBF & 0x1B77;
        p.lIllllIIlIlI[8] = -(0xFFFFFA45 & 0x1DBF) & (0xFFFF9EFD & 0x7FCF);
        p.lIllllIIlIlI[9] = -(0xFFFFB1FB & 0x6E1D) & (0xFFFFFDFF & 0x2FFD);
        p.lIllllIIlIlI[10] = 2;
        p.lIllllIIlIlI[11] = 0xFFFFBFBF & 0x6C79;
        p.lIllllIIlIlI[12] = -(0xFFFFF1D2 & 0x7E6F) & (0xFFFFFF7B & 0x7BCF);
        p.lIllllIIlIlI[13] = 0xFFFF9FFE & 0x6E6D;
        p.lIllllIIlIlI[14] = 3;
        p.lIllllIIlIlI[15] = 0xFFFFAE3D & 0x7DFF;
        p.lIllllIIlIlI[16] = -(0xFFFFE4CE & 0x7F7F) & (0xFFFFEFFD & 0x7F6F);
        p.lIllllIIlIlI[17] = 0xFFFFEFFF & 0x1F5D;
        p.lIllllIIlIlI[18] = 0x92 ^ 0xA6 ^ (0x89 ^ 0xB9);
        p.lIllllIIlIlI[19] = 0xFFFFBB7E & 0x6FB7;
        p.lIllllIIlIlI[20] = -(0xFFFFB565 & 0x6A9F) & (0xFFFFBEFF & 0x6BFF);
        p.lIllllIIlIlI[21] = -(0xFFFFE42B & 0x7BDD) & (0xFFFFEDEF & 0x7F9F);
        p.lIllllIIlIlI[22] = 0xA8 ^ 0xA0;
        p.lIllllIIlIlI[23] = 0x8F ^ 0x8A;
        p.lIllllIIlIlI[24] = -(0xFFFFABCD & 0x5573) & (0xFFFFB9F7 & 0x7F7F);
        p.lIllllIIlIlI[25] = -(0xFFFFD6F9 & 0x3967) & (0xFFFFFF73 & 0x1EFF);
        p.lIllllIIlIlI[26] = 0xFFFFCDCD & 0x3FFA;
        p.lIllllIIlIlI[27] = 1 ^ 0xF ^ (0x4C ^ 0x44);
        p.lIllllIIlIlI[28] = -(145 + 82 - 80 + 46) & (0xFFFFBFF7 & 0x6FFB);
        p.lIllllIIlIlI[29] = -(0xFFFFB693 & 0x6D6F) & (0xFFFFAFFF & 0x7FEF);
        p.lIllllIIlIlI[30] = -(0xFFFFE327 & 0x5FDB) & (0xFFFFFFFE & 0x4FEB);
        p.lIllllIIlIlI[31] = 152 + 86 - 76 + 6 ^ 55 + 149 - 40 + 11;
        p.lIllllIIlIlI[32] = -(0xFFFFBFDD & 0x566E) & (0xFFFFFFFF & 0x3F7F);
        p.lIllllIIlIlI[33] = 0xFFFFEAF5 & 0x1F7B;
        p.lIllllIIlIlI[34] = -(0xFFFFB3F1 & 0x7ECF) & (0xFFFFBFF9 & 0x7FF7);
        p.lIllllIIlIlI[35] = 0xFFFFFF6F & 0x3BBC;
        p.lIllllIIlIlI[36] = 0xFFFFBEFF & 0x4FCC;
        p.lIllllIIlIlI[37] = -(0xFFFFA479 & 0x7BAF) & (0xFFFFEFBF & 0x3B7E);
        p.lIllllIIlIlI[38] = 0xA6 ^ 0xAF;
        p.lIllllIIlIlI[39] = -(0xFFFF8DAF & 0x73D9) & (0xFFFFBDBB & 0x6BFE);
        p.lIllllIIlIlI[40] = -(0xFFFFB565 & 0x5FDB) & (0xFFFFBF77 & 0x5FFF);
        p.lIllllIIlIlI[41] = -(0xFFFFBFAE & 0x5277) & (0xFFFFDEFF & 0x3FBF);
        p.lIllllIIlIlI[42] = 18 + 74 - -56 + 40 ^ 23 + 22 - -118 + 19;
        p.lIllllIIlIlI[43] = -(0xFFFFD6FF & 0x698B) & (0xFFFFF9FF & 0x77BE);
        p.lIllllIIlIlI[44] = 0xFFFFEDEF & 0x1E7F;
        p.lIllllIIlIlI[45] = -(0xFFFFFBAA & 0x3457) & (0xFFFFBFDF & 0x7D3F);
        p.lIllllIIlIlI[46] = 0x3D ^ 0x36;
        p.lIllllIIlIlI[47] = -(0xFFFFFB61 & 0x269F) & (0xFFFFBEB7 & 0x7F7F);
        p.lIllllIIlIlI[48] = 0xFFFFD7F9 & 0x2F16;
        p.lIllllIIlIlI[49] = -(0xFFFFD21D & 0x3FF7) & (0xFFFFDFF7 & 0x3FFF);
        p.lIllllIIlIlI[50] = 0x67 ^ 0x6B;
        p.lIllllIIlIlI[51] = -(0xFFFFEDDB & 0x1665) & (0xFFFFBEE5 & 0x7FFA);
        p.lIllllIIlIlI[52] = -(0xFFFFE0E3 & 0x3F1F) & (0xFFFFEEB7 & 0x3FDF);
        p.lIllllIIlIlI[53] = -(0xFFFF9755 & 0x7EAB) & (0xFFFFFEDE & 0x3F3F);
        p.lIllllIIlIlI[54] = 0x90 ^ 0x9D;
    }

    public int Z() {
        return this.radius;
    }

    private static boolean lllIlllIIIIllI(Object object) {
        return object == null;
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    static {
        p.lllIlllIIIIIll();
        p.lllIlllIIIIIlI();
        FARMING_GUILD = new p(lIllllIIlIlI[2], new WorldPoint(lIllllIIlIlI[3], lIllllIIlIlI[4], lIllllIIlIlI[1]), lIllllIIlIlI[5]);
        HOSIDIUS = new p(lIllllIIlIlI[7], new WorldPoint(lIllllIIlIlI[8], lIllllIIlIlI[9], lIllllIIlIlI[1]));
        TROLLHEIM = new p(lIllllIIlIlI[11], new WorldPoint(lIllllIIlIlI[12], lIllllIIlIlI[13], lIllllIIlIlI[1]));
        WEISS = new p(lIllllIIlIlI[15], new WorldPoint(lIllllIIlIlI[16], lIllllIIlIlI[17], lIllllIIlIlI[1]));
        CATHERBY = new p(lIllllIIlIlI[19], new WorldPoint(lIllllIIlIlI[20], lIllllIIlIlI[21], lIllllIIlIlI[1]), lIllllIIlIlI[22]);
        MORYTANIA = new p(lIllllIIlIlI[24], new WorldPoint(lIllllIIlIlI[25], lIllllIIlIlI[26], lIllllIIlIlI[1]));
        FALADOR = new p(lIllllIIlIlI[28], new WorldPoint(lIllllIIlIlI[29], lIllllIIlIlI[30], lIllllIIlIlI[1]));
        ARDOUGNE = new p(lIllllIIlIlI[32], new WorldPoint(lIllllIIlIlI[33], lIllllIIlIlI[34], lIllllIIlIlI[1]));
        HARMONY = new p(lIllllIIlIlI[35], new WorldPoint(lIllllIIlIlI[36], lIllllIIlIlI[37], lIllllIIlIlI[1]));
        MONASTERY = new p(lIllllIIlIlI[39], new WorldPoint(lIllllIIlIlI[40], lIllllIIlIlI[41], lIllllIIlIlI[1]), lIllllIIlIlI[22]);
        CHAMPIONS_GUILD = new p(lIllllIIlIlI[43], new WorldPoint(lIllllIIlIlI[44], lIllllIIlIlI[45], lIllllIIlIlI[1]), lIllllIIlIlI[22]);
        GRAPE_VINE_KOUREND = new p(lIllllIIlIlI[47], new WorldPoint(lIllllIIlIlI[48], lIllllIIlIlI[49], lIllllIIlIlI[1]), lIllllIIlIlI[0]);
        FOSSIL_ISLAND_UNDERWATER = new p(lIllllIIlIlI[51], new WorldPoint(lIllllIIlIlI[52], lIllllIIlIlI[53], lIllllIIlIlI[6]), lIllllIIlIlI[22]);
        p[] pArray = new p[lIllllIIlIlI[54]];
        pArray[p.lIllllIIlIlI[1]] = FARMING_GUILD;
        pArray[p.lIllllIIlIlI[6]] = HOSIDIUS;
        pArray[p.lIllllIIlIlI[10]] = TROLLHEIM;
        pArray[p.lIllllIIlIlI[14]] = WEISS;
        pArray[p.lIllllIIlIlI[18]] = CATHERBY;
        pArray[p.lIllllIIlIlI[23]] = MORYTANIA;
        pArray[p.lIllllIIlIlI[27]] = FALADOR;
        pArray[p.lIllllIIlIlI[31]] = ARDOUGNE;
        pArray[p.lIllllIIlIlI[22]] = HARMONY;
        pArray[p.lIllllIIlIlI[38]] = MONASTERY;
        pArray[p.lIllllIIlIlI[42]] = CHAMPIONS_GUILD;
        pArray[p.lIllllIIlIlI[46]] = GRAPE_VINE_KOUREND;
        pArray[p.lIllllIIlIlI[50]] = FOSSIL_ISLAND_UNDERWATER;
        $VALUES = pArray;
    }

    public int X() {
        return this.regionID;
    }

    private p(int n3, WorldPoint worldPoint, int n4) {
        this.regionID = n3;
        this.worldPoint = worldPoint;
        this.radius = n4;
    }

    /*
     * WARNING - void declaration
     */
    public static p b(int n2) {
        void var15;
        p[] pArray = p.values();
        int n3 = pArray.length;
        int var5 = lIllllIIlIlI[1];
        while (p.lllIlllIIIIlII(var5, (int)var15)) {
            int var12;
            void var18;
            void var19 = var18[var5];
            if (p.lllIlllIIIIlIl(var19.X(), var12)) {
                return var19;
            }
            ++var5;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return null;
    }

    private static String lllIlllIIIIIII(String var6, String var2) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIllllIIlIlI[10], var20);
            return new String(var1.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public static p[] W() {
        Player player = Players.getLocal();
        if (p.lllIlllIIIIllI(player)) {
            return p.values();
        }
        WorldPoint worldPoint = player.getWorldLocation();
        p[] pArray = p.values();
        Arrays.sort(pArray, Comparator.comparingInt(p2 -> p2.Y().distanceTo(worldPoint)));
        return pArray;
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    private static boolean lllIlllIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIlllIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIlllIIIIIlI() {
        lIllllIIlIIl = new String[lIllllIIlIlI[54]];
        p.lIllllIIlIIl[p.lIllllIIlIlI[1]] = p."FARMING_GUILD";
        p.lIllllIIlIIl[p.lIllllIIlIlI[6]] = p."HOSIDIUS";
        p.lIllllIIlIIl[p.lIllllIIlIlI[10]] = p."TROLLHEIM";
        p.lIllllIIlIIl[p.lIllllIIlIlI[14]] = p."WEISS";
        p.lIllllIIlIIl[p.lIllllIIlIlI[18]] = p."CATHERBY";
        p.lIllllIIlIIl[p.lIllllIIlIlI[23]] = p."MORYTANIA";
        p.lIllllIIlIIl[p.lIllllIIlIlI[27]] = p."FALADOR";
        p.lIllllIIlIIl[p.lIllllIIlIlI[31]] = p."ARDOUGNE";
        p.lIllllIIlIIl[p.lIllllIIlIlI[22]] = p."HARMONY";
        p.lIllllIIlIIl[p.lIllllIIlIlI[38]] = p."MONASTERY";
        p.lIllllIIlIIl[p.lIllllIIlIlI[42]] = p."CHAMPIONS_GUILD";
        p.lIllllIIlIIl[p.lIllllIIlIlI[46]] = p."GRAPE_VINE_KOUREND";
        p.lIllllIIlIIl[p.lIllllIIlIlI[50]] = p."FOSSIL_ISLAND_UNDERWATER";
    }

    public WorldPoint Y() {
        return this.worldPoint;
    }
}

