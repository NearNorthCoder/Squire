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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public final class HEnum
extends Enum<h> {
    private final /* synthetic */ WorldPoint location;
    private static final /* synthetic */ h[] $VALUES;
    private final /* synthetic */ String name;
    private final /* synthetic */ WorldArea area;
    public static final /* synthetic */ /* enum */ h CAKE_ARDOUGNE;
    public static final /* synthetic */ /* enum */ h FRUIT_HOSIDIUS;
    private final /* synthetic */ boolean ensureStanding;
    private static /* synthetic */ String[] lIIllIllllIlI;
    private static /* synthetic */ int[] lIIllIllllIll;

    public boolean A() {
        return this.ensureStanding;
    }

    public WorldArea p() {
        return this.area;
    }

    private static void lIllIIlIIIIIIII() {
        lIIllIllllIlI = new String[lIIllIllllIll[15]];
        h.lIIllIllllIlI[h.lIIllIllllIll[0]] = h."CAKE_ARDOUGNE";
        h.lIIllIllllIlI[h.lIIllIllllIll[1]] = h."Baker's stall";
        h.lIIllIllllIlI[h.lIIllIllllIll[7]] = h."FRUIT_HOSIDIUS";
        h.lIIllIllllIlI[h.lIIllIllllIll[8]] = h."Fruit Stall";
    }

    static {
        h.lIllIIlIIIIIIIl();
        h.lIllIIlIIIIIIII();
        CAKE_ARDOUGNE = new h(lIIllIllllIlI[lIIllIllllIll[1]], new WorldPoint(lIIllIllllIll[2], lIIllIllllIll[3], lIIllIllllIll[0]), new WorldArea(lIIllIllllIll[4], lIIllIllllIll[5], lIIllIllllIll[6], lIIllIllllIll[6], lIIllIllllIll[0]), lIIllIllllIll[1]);
        FRUIT_HOSIDIUS = new h(lIIllIllllIlI[lIIllIllllIll[8]], new WorldPoint(lIIllIllllIll[9], lIIllIllllIll[10], lIIllIllllIll[0]), new WorldArea(lIIllIllllIll[11], lIIllIllllIll[12], lIIllIllllIll[13], lIIllIllllIll[14], lIIllIllllIll[0]), lIIllIllllIll[0]);
        h[] hArray = new h[lIIllIllllIll[7]];
        hArray[h.lIIllIllllIll[0]] = CAKE_ARDOUGNE;
        hArray[h.lIIllIllllIll[1]] = FRUIT_HOSIDIUS;
        $VALUES = hArray;
    }

    private static String lIllIIIllllllll(String var10, String var7) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIIllIllllIll[7], var2);
            return new String(var11.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIIIIIIl() {
        lIIllIllllIll = new int[16];
        h.lIIllIllllIll[0] = (0xA6 ^ 0x80) & ~(0x16 ^ 0x30);
        h.lIIllIllllIll[1] = 1;
        h.lIIllIllllIll[2] = -(0xFFFFFF91 & 0x317F) & (0xFFFFFBFF & 0x3F7D);
        h.lIIllIllllIll[3] = -(0xFFFFFAFE & 0x713) & (0xFFFFDFFF & 0x2EFF);
        h.lIIllIllllIll[4] = 0xFFFFBE6F & 0x4BF9;
        h.lIIllIllllIll[5] = 0xFFFFCCFF & 0x3FEA;
        h.lIIllIllllIll[6] = 0x47 ^ 0x40;
        h.lIIllIllllIll[7] = 2;
        h.lIIllIllllIll[8] = 3;
        h.lIIllIllllIll[9] = -(0xFFFFBE7F & 0x79B6) & (0xFFFFFF3D & 0x3FFF);
        h.lIIllIllllIll[10] = 0xFFFF9FFF & 0x6E17;
        h.lIIllIllllIll[11] = -(0xFFFFFFDA & 0x58F7) & (0xFFFFFFF7 & 0x5FDB);
        h.lIIllIllllIll[12] = -(0xFFFFBDEB & 0x63FE) & (0xFFFFBFFF & 0x6FFF);
        h.lIIllIllllIll[13] = 5 ^ 0xC;
        h.lIIllIllllIll[14] = 0xB6 ^ 0xB0;
        h.lIIllIllllIll[15] = 0xC3 ^ 0xC7;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIllIIlIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public String v() {
        return this.name;
    }

    private static String lIllIIIlllllllI(String var14, String var13) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var13.toCharArray();
        int var6 = lIIllIllllIll[0];
        char[] var8 = var14.toCharArray();
        int var1 = var8.length;
        int var3 = lIIllIllllIll[0];
        while (h.lIllIIlIIIIIIlI(var3, var1)) {
            char var12 = var8[var3];
            var4.append((char)(var12 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var3;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    public WorldPoint z() {
        return this.location;
    }

    private h(String string2, WorldPoint worldPoint, WorldArea worldArea, boolean bl) {
        this.name = string2;
        this.location = worldPoint;
        this.area = worldArea;
        this.ensureStanding = bl;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }
}

