/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;

public final class OEnum
extends Enum<o> {
    private static /* synthetic */ String[] llIIIIIllII;
    public static final /* synthetic */ /* enum */ o DEATH;
    public static final /* synthetic */ /* enum */ o LIGHTNING;
    private static /* synthetic */ int[] llIIIIIlllI;
    public static final /* synthetic */ /* enum */ o FIRE;
    private static final /* synthetic */ o[] $VALUES;
    private final /* synthetic */ Set<Point> attack;
    public static final /* synthetic */ /* enum */ o AIR;
    private final /* synthetic */ List<Point> clockwise;

    private static boolean lIIlllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    public Set<Point> N() {
        return this.attack;
    }

    private o(List<Point> list, Set<Point> set) {
        this.clockwise = list;
        this.attack = set;
    }

    private static String lIIlllIIllIlII(String var3, String var9) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var2 = var9.toCharArray();
        int var11 = llIIIIIlllI[0];
        char[] var5 = var3.toCharArray();
        int var14 = var5.length;
        int var6 = llIIIIIlllI[0];
        while (o.lIIlllIIllllll(var6, var14)) {
            char var10 = var5[var6];
            var12.append((char)(var10 ^ var2[var11 % var2.length]));
            0;
            ++var11;
            ++var6;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    static {
        o.lIIlllIIlllllI();
        o.lIIlllIIllIllI();
        DEATH = new o(List.of(new Point(llIIIIIlllI[1], llIIIIIlllI[2]), new Point(llIIIIIlllI[2], llIIIIIlllI[1]), new Point(llIIIIIlllI[1], llIIIIIlllI[3]), new Point(llIIIIIlllI[4], llIIIIIlllI[5])), Set.of(new Point(llIIIIIlllI[1], llIIIIIlllI[3]), new Point(llIIIIIlllI[1], llIIIIIlllI[2])));
        LIGHTNING = new o(List.of(new Point(llIIIIIlllI[2], llIIIIIlllI[7]), new Point(llIIIIIlllI[1], llIIIIIlllI[8]), new Point(llIIIIIlllI[4], llIIIIIlllI[9]), new Point(llIIIIIlllI[1], llIIIIIlllI[10])), Set.of(new Point(llIIIIIlllI[1], llIIIIIlllI[8]), new Point(llIIIIIlllI[1], llIIIIIlllI[10])));
        FIRE = new o(List.of(new Point(llIIIIIlllI[12], llIIIIIlllI[1]), new Point(llIIIIIlllI[13], llIIIIIlllI[3]), new Point(llIIIIIlllI[3], llIIIIIlllI[5]), new Point(llIIIIIlllI[13], llIIIIIlllI[2])), Set.of(new Point(llIIIIIlllI[13], llIIIIIlllI[3]), new Point(llIIIIIlllI[13], llIIIIIlllI[2])));
        AIR = new o(List.of(new Point(llIIIIIlllI[12], llIIIIIlllI[7]), new Point(llIIIIIlllI[13], llIIIIIlllI[8]), new Point(llIIIIIlllI[3], llIIIIIlllI[9]), new Point(llIIIIIlllI[13], llIIIIIlllI[10])), Set.of(new Point(llIIIIIlllI[13], llIIIIIlllI[8]), new Point(llIIIIIlllI[13], llIIIIIlllI[10])));
        o[] oArray = new o[llIIIIIlllI[15]];
        oArray[o.llIIIIIlllI[0]] = DEATH;
        oArray[o.llIIIIIlllI[6]] = LIGHTNING;
        oArray[o.llIIIIIlllI[11]] = FIRE;
        oArray[o.llIIIIIlllI[14]] = AIR;
        $VALUES = oArray;
    }

    private static String lIIlllIIllIlIl(String var7, String var4) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llIIIIIlllI[16]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llIIIIIlllI[11], var13);
            return new String(var1.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIlllllI() {
        llIIIIIlllI = new int[17];
        o.llIIIIIlllI[0] = (0x6E ^ 0x7F ^ (0x5D ^ 0x6A)) & (0x6A ^ 0x4F ^ 3 ^ -1);
        o.llIIIIIlllI[1] = 0x60 ^ 0x6D ^ (0x6F ^ 0x46);
        o.llIIIIIlllI[2] = 0x38 ^ 0x1F;
        o.llIIIIIlllI[3] = 0xE6 ^ 0xA2 ^ (0x45 ^ 0x21);
        o.llIIIIIlllI[4] = 0x2B ^ 0xA;
        o.llIIIIIlllI[5] = 0x61 ^ 0x42;
        o.llIIIIIlllI[6] = 1;
        o.llIIIIIlllI[7] = 0x35 ^ 0x2E;
        o.llIIIIIlllI[8] = 0x59 ^ 0x64 ^ (0x7F ^ 0x5D);
        o.llIIIIIlllI[9] = 0xB9 ^ 0xB7 ^ (0x60 ^ 0x72);
        o.llIIIIIlllI[10] = 0xAD ^ 0xB8 ^ (0x81 ^ 0x8C);
        o.llIIIIIlllI[11] = 2;
        o.llIIIIIlllI[12] = 0x63 ^ 0x79;
        o.llIIIIIlllI[13] = 0x89 ^ 0x94;
        o.llIIIIIlllI[14] = 3;
        o.llIIIIIlllI[15] = 18 + 195 - 69 + 52 ^ 18 + 124 - -36 + 14;
        o.llIIIIIlllI[16] = 0xDD ^ 0x87 ^ (0xC0 ^ 0x92);
    }

    private static void lIIlllIIllIllI() {
        llIIIIIllII = new String[llIIIIIlllI[15]];
        o.llIIIIIllII[o.llIIIIIlllI[0]] = o."DEATH";
        o.llIIIIIllII[o.llIIIIIlllI[6]] = o."LIGHTNING";
        o.llIIIIIllII[o.llIIIIIlllI[11]] = o."FIRE";
        o.llIIIIIllII[o.llIIIIIlllI[14]] = o."AIR";
    }

    public List<Point> M() {
        return this.clockwise;
    }
}

