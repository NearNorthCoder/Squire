/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.n;
import a.u.i.-.l.r.h.z.s.r.u.q.e.p;
import a.u.i.-.l.r.h.z.s.r.u.q.e.r;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class k
extends Enum<k> {
    private final /* synthetic */ p zulrahPos;
    public static final /* synthetic */ /* enum */ k GREEN_CENTER_W;
    public static final /* synthetic */ /* enum */ k MAGMA_CENTER_E;
    public static final /* synthetic */ /* enum */ k GREEN_SOUTH_E;
    public static final /* synthetic */ /* enum */ k GREEN_SOUTH_W;
    public static final /* synthetic */ /* enum */ k JAD_PHASE_E;
    public static final /* synthetic */ /* enum */ k MAGMA_CENTER_NW;
    public static final /* synthetic */ /* enum */ k TANZ_EAST_E;
    public static final /* synthetic */ /* enum */ k GREEN_CENTER_E;
    public static final /* synthetic */ /* enum */ k TANZ_WEST_W;
    public static final /* synthetic */ /* enum */ k TANZ_CENTER_NE;
    public static final /* synthetic */ /* enum */ k TANZ_SOUTH_CW;
    public static final /* synthetic */ /* enum */ k GREEN_EAST_CE;
    private final /* synthetic */ n safeSpot;
    public static final /* synthetic */ /* enum */ k MAGMA_CENTER_NE;
    public static final /* synthetic */ /* enum */ k MAGMA_CENTER_W;
    private static final /* synthetic */ k[] $VALUES;
    public static final /* synthetic */ /* enum */ k GREEN_EAST_E;
    public static final /* synthetic */ /* enum */ k GREEN_EAST_NE;
    private final /* synthetic */ r zulrahType;
    private static /* synthetic */ String[] lIllIllIIlIIl;
    private static /* synthetic */ int[] lIllIllIIlIll;
    public static final /* synthetic */ /* enum */ k INITIAL;
    public static final /* synthetic */ /* enum */ k TANZ_SOUTH_C;
    public static final /* synthetic */ /* enum */ k JAD_PHASE_W;
    public static final /* synthetic */ /* enum */ k TANZ_CENTER_E;
    public static final /* synthetic */ /* enum */ k GREEN_WEST_W;
    public static final /* synthetic */ /* enum */ k TANZ_EAST_NE;

    public r w() {
        return this.zulrahType;
    }

    private static void llIIlIIIllIllIl() {
        lIllIllIIlIll = new int[23];
        k.lIllIllIIlIll[0] = 2;
        k.lIllIllIIlIll[1] = 1;
        k.lIllIllIIlIll[2] = (0x17 ^ 0x6A ^ (0x1A ^ 0x52)) & (87 + 119 - 142 + 79 ^ 0 + 144 - -14 + 28 ^ -1);
        k.lIllIllIIlIll[3] = 3;
        k.lIllIllIIlIll[4] = 21 + 48 - -63 + 31 ^ 128 + 150 - 237 + 126;
        k.lIllIllIIlIll[5] = 0x21 ^ 0x24;
        k.lIllIllIIlIll[6] = 0x4B ^ 0x4D;
        k.lIllIllIIlIll[7] = 0xAF ^ 0xA8;
        k.lIllIllIIlIll[8] = 0xAA ^ 0xA2;
        k.lIllIllIIlIll[9] = 0x39 ^ 0x30;
        k.lIllIllIIlIll[10] = 0x6A ^ 0x60;
        k.lIllIllIIlIll[11] = 139 + 90 - 136 + 91 ^ 40 + 123 - 116 + 132;
        k.lIllIllIIlIll[12] = 0x1F ^ 6 ^ (0xA8 ^ 0xBD);
        k.lIllIllIIlIll[13] = 3 ^ 0x4C ^ (0x77 ^ 0x35);
        k.lIllIllIIlIll[14] = 0xE1 ^ 0x8C ^ (0x21 ^ 0x42);
        k.lIllIllIIlIll[15] = 0xF2 ^ 0x81 ^ (0xD7 ^ 0xAB);
        k.lIllIllIIlIll[16] = 0xBB ^ 0xA4 ^ (0x89 ^ 0x86);
        k.lIllIllIIlIll[17] = 0x80 ^ 0x91;
        k.lIllIllIIlIll[18] = 0x15 ^ 7;
        k.lIllIllIIlIll[19] = 0xA9 ^ 0xBA;
        k.lIllIllIIlIll[20] = 9 ^ 0x1D;
        k.lIllIllIIlIll[21] = 0x75 ^ 0x2B ^ (0xEB ^ 0xA0);
        k.lIllIllIIlIll[22] = 81 + 123 - 184 + 112 ^ 133 + 90 - 149 + 72;
    }

    public boolean x() {
        boolean bl;
        if (!k.llIIlIIIllIlllI((Object)this.zulrahType, (Object)r.JAD_RANGE_FIRST) || k.llIIlIIIllIllll((Object)this.zulrahType, (Object)r.JAD_MAGIC_FIRST)) {
            bl = lIllIllIIlIll[1];
            0;
            if (((0x6B ^ 0x3D) & ~(0x7D ^ 0x2B)) > 2) {
                return false;
            }
        } else {
            bl = lIllIllIIlIll[2];
        }
        return bl;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    private static boolean llIIlIIIllIllll(Object object, Object object2) {
        return object == object2;
    }

    public boolean A() {
        boolean bl;
        if (k.llIIlIIIllIllll((Object)this.zulrahType, (Object)r.MELEE)) {
            bl = lIllIllIIlIll[1];
            0;
            if ((0x16 ^ 0x12) <= ((0x51 ^ 5) & ~(7 ^ 0x53))) {
                return false;
            }
        } else {
            bl = lIllIllIIlIll[2];
        }
        return bl;
    }

    private k(r r2, n n3, p p2) {
        this.zulrahType = r2;
        this.safeSpot = n3;
        this.zulrahPos = p2;
    }

    private static String llIIlIIIllIIllI(String var6, String var14) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIllIllIIlIll[8]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIllIllIIlIll[0], var3);
            return new String(var11.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    public WorldPoint a(WorldPoint worldPoint) {
        return worldPoint.dx(this.safeSpot.G()).dy(this.safeSpot.H());
    }

    public boolean y() {
        boolean bl;
        if (k.llIIlIIIllIllll((Object)this.zulrahType, (Object)r.MAGIC)) {
            bl = lIllIllIIlIll[1];
            0;
            if (3 == 2) {
                return false;
            }
        } else {
            bl = lIllIllIIlIll[2];
        }
        return bl;
    }

    private static String llIIlIIIllIIlIl(String var12, String var7) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var8 = var7.toCharArray();
        int var13 = lIllIllIIlIll[2];
        char[] var1 = var12.toCharArray();
        int var9 = var1.length;
        int var17 = lIllIllIIlIll[2];
        while (k.llIIlIIIlllIlII(var17, var9)) {
            char var2 = var1[var17];
            var19.append((char)(var2 ^ var8[var13 % var8.length]));
            0;
            ++var13;
            ++var17;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    public WorldPoint b(WorldPoint worldPoint) {
        return worldPoint.dx(this.zulrahPos.G() - lIllIllIIlIll[0]).dy(this.zulrahPos.H() - lIllIllIIlIll[0]);
    }

    public boolean z() {
        boolean bl;
        if (k.llIIlIIIllIllll((Object)this.zulrahType, (Object)r.RANGE)) {
            bl = lIllIllIIlIll[1];
            0;
            if (((28 + 95 - 90 + 94 ^ (0x91 ^ 0xB6)) & (0 + 82 - -31 + 87 ^ 32 + 111 - 0 + 1 ^ -1)) != ((115 + 70 - 178 + 124 ^ 83 + 127 - 171 + 113) & (0xF6 ^ 0x88 ^ (0x22 ^ 0x47) ^ -1))) {
                return ((0x75 ^ 0x58 ^ (0x90 ^ 0x83)) & (0x3F ^ 0x10 ^ (0xA6 ^ 0xB7) ^ -1)) != 0;
            }
        } else {
            bl = lIllIllIIlIll[2];
        }
        return bl;
    }

    private static boolean llIIlIIIllIlllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIIlIIIlllIlII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean B() {
        boolean bl;
        if (k.llIIlIIIllIllll((Object)this.zulrahPos, (Object)p.CENTER)) {
            bl = lIllIllIIlIll[1];
            0;
            if ((0x1A ^ 0x62 ^ (0xF ^ 0x73)) == 1) {
                return ((0x74 ^ 0x4E ^ (0xBF ^ 0x9A)) & (0x96 ^ 0xA2 ^ (0xA ^ 0x21) ^ -1)) != 0;
            }
        } else {
            bl = lIllIllIIlIll[2];
        }
        return bl;
    }

    private static String llIIlIIIllIIlll(String var18, String var16) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIllIllIIlIll[0], var4);
            return new String(var10.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void llIIlIIIllIlIlI() {
        lIllIllIIlIIl = new String[lIllIllIIlIll[22]];
        k.lIllIllIIlIIl[k.lIllIllIIlIll[2]] = k."INITIAL";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[1]] = k."GREEN_EAST_NE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[0]] = k."GREEN_EAST_CE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[3]] = k."GREEN_EAST_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[4]] = k."GREEN_CENTER_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[5]] = k."GREEN_CENTER_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[6]] = k."GREEN_WEST_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[7]] = k."GREEN_SOUTH_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[8]] = k."GREEN_SOUTH_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[9]] = k."TANZ_EAST_NE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[10]] = k."TANZ_EAST_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[11]] = k."TANZ_WEST_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[12]] = k."TANZ_CENTER_NE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[13]] = k."TANZ_CENTER_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[14]] = k."TANZ_SOUTH_CW";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[15]] = k."TANZ_SOUTH_C";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[16]] = k."MAGMA_CENTER_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[17]] = k."MAGMA_CENTER_NW";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[18]] = k."MAGMA_CENTER_NE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[19]] = k."MAGMA_CENTER_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[20]] = k."JAD_PHASE_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[21]] = k."JAD_PHASE_W";
    }

    static {
        k.llIIlIIIllIllIl();
        k.llIIlIIIllIlIlI();
        INITIAL = new k(r.RANGE, n.NORTH_EAST, p.CENTER);
        GREEN_EAST_NE = new k(r.RANGE, n.NORTH_EAST, p.EAST);
        GREEN_EAST_CE = new k(r.RANGE, n.CENTER_EAST, p.EAST);
        GREEN_EAST_E = new k(r.RANGE, n.EAST, p.EAST);
        GREEN_CENTER_W = new k(r.RANGE, n.WEST, p.CENTER);
        GREEN_CENTER_E = new k(r.RANGE, n.EAST, p.CENTER);
        GREEN_WEST_W = new k(r.RANGE, n.WEST, p.WEST);
        GREEN_SOUTH_W = new k(r.RANGE, n.WEST, p.SOUTH);
        GREEN_SOUTH_E = new k(r.RANGE, n.EAST, p.SOUTH);
        TANZ_EAST_NE = new k(r.MAGIC, n.NORTH_EAST, p.EAST);
        TANZ_EAST_E = new k(r.MAGIC, n.EAST, p.EAST);
        TANZ_WEST_W = new k(r.MAGIC, n.WEST, p.WEST);
        TANZ_CENTER_NE = new k(r.MAGIC, n.NORTH_EAST, p.CENTER);
        TANZ_CENTER_E = new k(r.MAGIC, n.EAST, p.CENTER);
        TANZ_SOUTH_CW = new k(r.MAGIC, n.CENTER_WEST, p.SOUTH);
        TANZ_SOUTH_C = new k(r.MAGIC, n.CENTER, p.SOUTH);
        MAGMA_CENTER_E = new k(r.MELEE, n.EAST, p.CENTER);
        MAGMA_CENTER_NW = new k(r.MELEE, n.NORTH_WEST, p.CENTER);
        MAGMA_CENTER_NE = new k(r.MELEE, n.NORTH_EAST, p.CENTER);
        MAGMA_CENTER_W = new k(r.MELEE, n.WEST, p.CENTER);
        JAD_PHASE_E = new k(r.JAD_MAGIC_FIRST, n.EAST, p.EAST);
        JAD_PHASE_W = new k(r.JAD_RANGE_FIRST, n.WEST, p.WEST);
        k[] kArray = new k[lIllIllIIlIll[22]];
        kArray[k.lIllIllIIlIll[2]] = INITIAL;
        kArray[k.lIllIllIIlIll[1]] = GREEN_EAST_NE;
        kArray[k.lIllIllIIlIll[0]] = GREEN_EAST_CE;
        kArray[k.lIllIllIIlIll[3]] = GREEN_EAST_E;
        kArray[k.lIllIllIIlIll[4]] = GREEN_CENTER_W;
        kArray[k.lIllIllIIlIll[5]] = GREEN_CENTER_E;
        kArray[k.lIllIllIIlIll[6]] = GREEN_WEST_W;
        kArray[k.lIllIllIIlIll[7]] = GREEN_SOUTH_W;
        kArray[k.lIllIllIIlIll[8]] = GREEN_SOUTH_E;
        kArray[k.lIllIllIIlIll[9]] = TANZ_EAST_NE;
        kArray[k.lIllIllIIlIll[10]] = TANZ_EAST_E;
        kArray[k.lIllIllIIlIll[11]] = TANZ_WEST_W;
        kArray[k.lIllIllIIlIll[12]] = TANZ_CENTER_NE;
        kArray[k.lIllIllIIlIll[13]] = TANZ_CENTER_E;
        kArray[k.lIllIllIIlIll[14]] = TANZ_SOUTH_CW;
        kArray[k.lIllIllIIlIll[15]] = TANZ_SOUTH_C;
        kArray[k.lIllIllIIlIll[16]] = MAGMA_CENTER_E;
        kArray[k.lIllIllIIlIll[17]] = MAGMA_CENTER_NW;
        kArray[k.lIllIllIIlIll[18]] = MAGMA_CENTER_NE;
        kArray[k.lIllIllIIlIll[19]] = MAGMA_CENTER_W;
        kArray[k.lIllIllIIlIll[20]] = JAD_PHASE_E;
        kArray[k.lIllIllIIlIll[21]] = JAD_PHASE_W;
        $VALUES = kArray;
    }
}

