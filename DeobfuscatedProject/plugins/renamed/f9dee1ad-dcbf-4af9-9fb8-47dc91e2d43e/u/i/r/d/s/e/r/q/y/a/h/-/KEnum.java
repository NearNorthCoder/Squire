/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;

public final class KEnum
extends Enum<k> {
    private final /* synthetic */ int spriteId;
    private final /* synthetic */ int specialProjectileId;
    private final /* synthetic */ int hpThreshold;
    private final /* synthetic */ WorldPoint fountainWorldPoint;
    public static final /* synthetic */ /* enum */ k ENRAGED;
    public static final /* synthetic */ /* enum */ k LIGHTNING;
    private final /* synthetic */ Point fountainPlayerPoint;
    private final /* synthetic */ int specialAnimationId;
    private final /* synthetic */ int deathAnimation1;
    private final /* synthetic */ int deathAnimation2;
    public static final /* synthetic */ /* enum */ k FLAME;
    private final /* synthetic */ Color phaseColor;
    private final /* synthetic */ Color fountainColor;
    public static final /* synthetic */ /* enum */ k POISON;
    private static final /* synthetic */ k[] $VALUES;
    private final /* synthetic */ int attacksPerSwitch;
    private static /* synthetic */ String[] llllIIllIIII;
    private static /* synthetic */ int[] llllIIllIIIl;

    public int ab() {
        return this.deathAnimation1;
    }

    private static void lIIlIIIIIIIIllI() {
        llllIIllIIIl = new int[35];
        k.llllIIllIIIl[0] = (36 + 214 - 86 + 56 ^ 88 + 82 - 121 + 102) & (0x44 ^ 0x6C ^ (0xF2 ^ 0x91) ^ -1);
        k.llllIIllIIIl[1] = 1;
        k.llllIIllIIIl[2] = 2;
        k.llllIIllIIIl[3] = 3;
        k.llllIIllIIIl[4] = -(0xFFFFBFF3 & 0x51DF) & (0xFFFFB5FF & 0x7BFF);
        k.llllIIllIIIl[5] = 0xFFFFE1EE & 0x3E3F;
        k.llllIIllIIIl[6] = 0xFFFFDEFE & 0x276D;
        k.llllIIllIIIl[7] = -(0xFFFFFE77 & 0x98B) & (0xFFFFFF3F & 0xBFB);
        k.llllIIllIIIl[8] = 0xFFFFBEFE & 0x47EF;
        k.llllIIllIIIl[9] = 0xFFFFDD7B & 0x27DF;
        k.llllIIllIIIl[10] = 0xFFFFBC17 & 0x6BFF;
        k.llllIIllIIIl[11] = 0x2C ^ 0x58 ^ (0x7D ^ 0x30);
        k.llllIIllIIIl[12] = 0x58 ^ 0x7F;
        k.llllIIllIIIl[13] = 0xFFFFBF34 & 0x60FF;
        k.llllIIllIIIl[14] = -(0xFFFFA3DF & 0x5D2B) & (0xFFFFBFFF & 0x613F);
        k.llllIIllIIIl[15] = -(0xFFFFDF9F & 0x75E9) & (0xFFFFF7BB & 0x7DFD);
        k.llllIIllIIIl[16] = -(0xFFFFFF7D & 0x2493) & (0xFFFFB6F6 & 0x6F3F);
        k.llllIIllIIIl[17] = -(0xFFFFABDF & 0x7C79) & (0xFFFFBFFF & 0x6FFF);
        k.llllIIllIIIl[18] = 0xFFFFFD28 & 0x2AF7;
        k.llllIIllIIIl[19] = 0x52 ^ 0x61;
        k.llllIIllIIIl[20] = 0xA9 ^ 0x9E ^ 1;
        k.llllIIllIIIl[21] = 0x9F ^ 0x9B;
        k.llllIIllIIIl[22] = 0xFFFFA5BB & 0x7A7F;
        k.llllIIllIIIl[23] = -(0xFFFF95D3 & 0x7F6E) & (0xFFFFBF7F & 0x75FD);
        k.llllIIllIIIl[24] = 0xFFFFFA7B & 0x25BC;
        k.llllIIllIIIl[25] = 0xFFFFBB33 & 0x45DF;
        k.llllIIllIIIl[26] = 0xFFFFF7DA & 0xF2D;
        k.llllIIllIIIl[27] = -(0xFFFF82DD & 0x7F2F) & (0xFFFFE77E & 0x1FDF);
        k.llllIIllIIIl[28] = 0x9E ^ 0xBA;
        k.llllIIllIIIl[29] = 0x81 ^ 0xAF;
        k.llllIIllIIIl[30] = 0xB ^ 0xE;
        k.llllIIllIIIl[31] = -(0xFFFFDB9F & 0x3FFB) & (0xFFFFBBFF & 0x7FDB);
        k.llllIIllIIIl[32] = -(0xFFFFEDBF & 0x1FE6) & (0xFFFFADE7 & Short.MAX_VALUE);
        k.llllIIllIIIl[33] = 0x62 ^ 0x64;
        k.llllIIllIIIl[34] = 0x8E ^ 0x86;
    }

    public int ae() {
        return this.specialAnimationId;
    }

    private k(int n3, int n4, int n5, int n6, int n7, int n8, int n9, WorldPoint worldPoint, Point point, Color color, Color color2) {
        this.attacksPerSwitch = n3;
        this.deathAnimation1 = n4;
        this.deathAnimation2 = n5;
        this.specialProjectileId = n6;
        this.specialAnimationId = n7;
        this.hpThreshold = n8;
        this.spriteId = n9;
        this.fountainWorldPoint = worldPoint;
        this.fountainPlayerPoint = point;
        this.phaseColor = color;
        this.fountainColor = color2;
    }

    static {
        k.lIIlIIIIIIIIllI();
        k.lIIlIIIIIIIIlIl();
        POISON = new k(llllIIllIIIl[3], llllIIllIIIl[4], llllIIllIIIl[5], llllIIllIIIl[6], llllIIllIIIl[0], llllIIllIIIl[7], llllIIllIIIl[8], new WorldPoint(llllIIllIIIl[9], llllIIllIIIl[10], llllIIllIIIl[0]), new Point(llllIIllIIIl[11], llllIIllIIIl[12]), Color.GREEN, Color.RED);
        LIGHTNING = new k(llllIIllIIIl[3], llllIIllIIIl[13], llllIIllIIIl[14], llllIIllIIIl[0], llllIIllIIIl[15], llllIIllIIIl[16], llllIIllIIIl[17], new WorldPoint(llllIIllIIIl[9], llllIIllIIIl[18], llllIIllIIIl[0]), new Point(llllIIllIIIl[19], llllIIllIIIl[20]), Color.CYAN, Color.GREEN);
        FLAME = new k(llllIIllIIIl[3], llllIIllIIIl[22], llllIIllIIIl[23], llllIIllIIIl[0], llllIIllIIIl[24], llllIIllIIIl[25], llllIIllIIIl[26], new WorldPoint(llllIIllIIIl[27], llllIIllIIIl[18], llllIIllIIIl[0]), new Point(llllIIllIIIl[28], llllIIllIIIl[29]), Color.RED, Color.CYAN);
        ENRAGED = new k(llllIIllIIIl[1], llllIIllIIIl[31], llllIIllIIIl[32], llllIIllIIIl[6], llllIIllIIIl[0], llllIIllIIIl[0], llllIIllIIIl[8], null, null, null, null);
        k[] kArray = new k[llllIIllIIIl[21]];
        kArray[k.llllIIllIIIl[0]] = POISON;
        kArray[k.llllIIllIIIl[1]] = LIGHTNING;
        kArray[k.llllIIllIIIl[2]] = FLAME;
        kArray[k.llllIIllIIIl[3]] = ENRAGED;
        $VALUES = kArray;
    }

    private static String lIIlIIIIIIIIIlI(String var6, String var1) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var13 = var1.toCharArray();
        int var11 = llllIIllIIIl[0];
        char[] var7 = var6.toCharArray();
        int var16 = var7.length;
        int var4 = llllIIllIIIl[0];
        while (k.lIIlIIIIIIIlIII(var4, var16)) {
            char var12 = var7[var4];
            var19.append((char)(var12 ^ var13[var11 % var13.length]));
            0;
            ++var11;
            ++var4;
            0;
            if (2 != (0x24 ^ 3 ^ (0x2F ^ 0xC))) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public Color ah() {
        return this.phaseColor;
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    private static void lIIlIIIIIIIIlIl() {
        llllIIllIIII = new String[llllIIllIIIl[33]];
        k.llllIIllIIII[k.llllIIllIIIl[0]] = k."_";
        k.llllIIllIIII[k.llllIIllIIIl[1]] = k."";
        k.llllIIllIIII[k.llllIIllIIIl[2]] = k."POISON";
        k.llllIIllIIII[k.llllIIllIIIl[3]] = k."LIGHTNING";
        k.llllIIllIIII[k.llllIIllIIIl[21]] = k."FLAME";
        k.llllIIllIIII[k.llllIIllIIIl[30]] = k."ENRAGED";
    }

    public RegionPoint Z() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        if (k.lIIlIIIIIIIIlll((Object)this, (Object)ENRAGED)) {
            return new RegionPoint(this.fountainPlayerPoint.getX(), this.fountainPlayerPoint.getY(), worldPoint.getPlane(), worldPoint.getRegionID());
        }
        return null;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    private static String lIIlIIIIIIIIlII(String var3, String var14) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llllIIllIIIl[34]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(llllIIllIIIl[2], var8);
            return new String(var15.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public Color ai() {
        return this.fountainColor;
    }

    private static boolean lIIlIIIIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIIIIIIIll(String var5, String var9) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llllIIllIIIl[2], var18);
            return new String(var2.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIIIIlll(Object object, Object object2) {
        return object != object2;
    }

    public int aa() {
        return this.attacksPerSwitch;
    }

    public int ad() {
        return this.specialProjectileId;
    }

    public int af() {
        return this.hpThreshold;
    }

    public int ac() {
        return this.deathAnimation2;
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(llllIIllIIIl[0]) + string.substring(llllIIllIIIl[1]).replaceAll(llllIIllIIII[llllIIllIIIl[0]], llllIIllIIII[llllIIllIIIl[1]]).toLowerCase();
    }

    public WorldPoint ag() {
        return this.fountainWorldPoint;
    }
}

