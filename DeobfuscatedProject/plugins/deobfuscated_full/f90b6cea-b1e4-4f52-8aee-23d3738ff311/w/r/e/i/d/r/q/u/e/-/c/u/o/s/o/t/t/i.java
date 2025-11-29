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

    private static String llIIIlIIIllIIll(String var3, String var12) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var11 = var12.toCharArray();
        int var19 = lIllIIIIlIlll[1];
        char[] var4 = var3.toCharArray();
        int var1 = var4.length;
        int var8 = lIllIIIIlIlll[1];
        while (i.llIIIlIIIllIlll(var8, var1)) {
            char var16 = var4[var8];
            var13.append((char)(var16 ^ var11[var19 % var11.length]));
            0;
            ++var19;
            ++var8;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static void llIIIlIIIllIlIl() {
        lIllIIIIlIlll = new int[16];
        i.lIllIIIIlIlll[0] = 1;
        i.lIllIIIIlIlll[1] = (0x22 ^ 0x64 ^ (0xD6 ^ 0xAF)) & (133 + 106 - 177 + 108 ^ 81 + 22 - 100 + 146 ^ -1);
        i.lIllIIIIlIlll[2] = -(102 + 36 - 125 + 125) & (0xFFFFF79B & Short.MAX_VALUE);
        i.lIllIIIIlIlll[3] = 0xFFFFBEDF & 0x4FA1;
        i.lIllIIIIlIlll[4] = 0xFFFFAFFE & 0x5EFB;
        i.lIllIIIIlIlll[5] = 0xFFFFBEFD & 0x4FFE;
        i.lIllIIIIlIlll[6] = 0xFFFFFF14 & 0x77FB;
        i.lIllIIIIlIlll[7] = -(0xFFFFD78F & 0x39F5) & (0xFFFFFFFF & 0x1FFF);
        i.lIllIIIIlIlll[8] = -(0xFFFF93EB & 0x7D15) & (0xFFFFBFFF & 0x5FFB);
        i.lIllIIIIlIlll[9] = 0xFFFFBEFF & 0x4F7D;
        i.lIllIIIIlIlll[10] = 2;
        i.lIllIIIIlIlll[11] = 0xFFFFF771 & 0x7F9F;
        i.lIllIIIIlIlll[12] = 0xFFFFEFFF & 0x1E78;
        i.lIllIIIIlIlll[13] = -(0xFFFFA977 & 0x778A) & (0xFFFFBFFF & 0x6FFF);
        i.lIllIIIIlIlll[14] = 3;
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

    private static String llIIIlIIIllIIIl(String var9, String var6) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIlll[15]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIllIIIIlIlll[10], var7);
            return new String(var18.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIIIllIlII() {
        lIllIIIIlIllI = new String[lIllIIIIlIlll[14]];
        i.lIllIIIIlIllI[i.lIllIIIIlIlll[1]] = i."WEST";
        i.lIllIIIIlIllI[i.lIllIIIIlIlll[0]] = i."MIDDLE";
        i.lIllIIIIlIllI[i.lIllIIIIlIlll[10]] = i."EAST";
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public static i b(TileObject tileObject) {
        return Arrays.stream(i.values()).filter(i2 -> {
            boolean bl;
            if (i.llIIIlIIIllIllI(i2.v(), tileObject.getId())) {
                bl = lIllIIIIlIlll[0];
                0;
                
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

    private static String llIIIlIIIllIIlI(String var10, String var17) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIllIIIIlIlll[10], var15);
            return new String(var14.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }
}

