/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum;
import gg.squire.zulrah.tasks.GameEnum57;
import gg.squire.zulrah.tasks.GameEnum49;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum24
extends Enum<k> {
    private final  p zulrahPos;
    public static final  /* enum */ k GREEN_CENTER_W;
    public static final  /* enum */ k MAGMA_CENTER_E;
    public static final  /* enum */ k GREEN_SOUTH_E;
    public static final  /* enum */ k GREEN_SOUTH_W;
    public static final  /* enum */ k JAD_PHASE_E;
    public static final  /* enum */ k MAGMA_CENTER_NW;
    public static final  /* enum */ k TANZ_EAST_E;
    public static final  /* enum */ k GREEN_CENTER_E;
    public static final  /* enum */ k TANZ_WEST_W;
    public static final  /* enum */ k TANZ_CENTER_NE;
    public static final  /* enum */ k TANZ_SOUTH_CW;
    public static final  /* enum */ k GREEN_EAST_CE;
    private final  n safeSpot;
    public static final  /* enum */ k MAGMA_CENTER_NE;
    public static final  /* enum */ k MAGMA_CENTER_W;
    private static final  k[] $VALUES;
    public static final  /* enum */ k GREEN_EAST_E;
    public static final  /* enum */ k GREEN_EAST_NE;
    private final  r zulrahType;

    public static final  /* enum */ k INITIAL;
    public static final  /* enum */ k TANZ_SOUTH_C;
    public static final  /* enum */ k JAD_PHASE_W;
    public static final  /* enum */ k TANZ_CENTER_E;
    public static final  /* enum */ k GREEN_WEST_W;
    public static final  /* enum */ k TANZ_EAST_NE;

    public r w() {
        return this.zulrahType;
    }

    public boolean x() {
        boolean bl;
        if (!k.llIIlIIIllIlllI((Object)this.zulrahType, (Object)r.JAD_RANGE_FIRST) || k.llIIlIIIllIllll((Object)this.zulrahType, (Object)r.JAD_MAGIC_FIRST)) {
            bl = lIllIllIIlIll[1];

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

            if ((0x16 ^ 0x12) <= ((0x51 ^ 5) & ~(7 ^ 0x53))) {
                return false;
            }
        } else {
            bl = lIllIllIIlIll[2];
        }
        return bl;
    }

    private GameEnum24(r r2, n n3, p p2) {
        this.zulrahType = r2;
        this.safeSpot = n3;
        this.zulrahPos = p2;
    }

    public WorldPoint a(WorldPoint worldPoint) {
        return worldPoint.dx(this.safeSpot.G()).dy(this.safeSpot.H());
    }

    public boolean y() {
        boolean bl;
        if (k.llIIlIIIllIllll((Object)this.zulrahType, (Object)r.MAGIC)) {
            bl = lIllIllIIlIll[1];

            if (3 == 2) {
                return false;
            }
        } else {
            bl = lIllIllIIlIll[2];
        }
        return bl;
    }

        return String.valueOf(var1);
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum24.class, string);
    }

    public WorldPoint b(WorldPoint worldPoint) {
        return worldPoint.dx(this.zulrahPos.G() - lIllIllIIlIll[0]).dy(this.zulrahPos.H() - lIllIllIIlIll[0]);
    }

    public boolean z() {
        boolean bl;
        if (k.llIIlIIIllIllll((Object)this.zulrahType, (Object)r.RANGE)) {
            bl = lIllIllIIlIll[1];

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

            if ((0x1A ^ 0x62 ^ (0xF ^ 0x73)) == 1) {
                return ((0x74 ^ 0x4E ^ (0xBF ^ 0x9A)) & (0x96 ^ 0xA2 ^ (0xA ^ 0x21) ^ -1)) != 0;
            }
        } else {
            bl = lIllIllIIlIll[2];
        }
        return bl;
    }

    private static void llIIlIIIllIlIlI() {
        lIllIllIIlIIl = new String[lIllIllIIlIll[22]];
        k.lIllIllIIlIIl[k.lIllIllIIlIll[2]] = "INITIAL";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[1]] = "GREEN_EAST_NE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[0]] = "GREEN_EAST_CE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[3]] = "GREEN_EAST_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[4]] = "GREEN_CENTER_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[5]] = "GREEN_CENTER_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[6]] = "GREEN_WEST_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[7]] = "GREEN_SOUTH_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[8]] = "GREEN_SOUTH_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[9]] = "TANZ_EAST_NE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[10]] = "TANZ_EAST_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[11]] = "TANZ_WEST_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[12]] = "TANZ_CENTER_NE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[13]] = "TANZ_CENTER_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[14]] = "TANZ_SOUTH_CW";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[15]] = "TANZ_SOUTH_C";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[16]] = "MAGMA_CENTER_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[17]] = "MAGMA_CENTER_NW";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[18]] = "MAGMA_CENTER_NE";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[19]] = "MAGMA_CENTER_W";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[20]] = "JAD_PHASE_E";
        k.lIllIllIIlIIl[k.lIllIllIIlIll[21]] = "JAD_PHASE_W";
    }

    static {
        k.llIIlIIIllIllIl();
        k.llIIlIIIllIlIlI();
        INITIAL = new GameEnum24(r.RANGE, n.NORTH_EAST, p.CENTER);
        GREEN_EAST_NE = new GameEnum24(r.RANGE, n.NORTH_EAST, p.EAST);
        GREEN_EAST_CE = new GameEnum24(r.RANGE, n.CENTER_EAST, p.EAST);
        GREEN_EAST_E = new GameEnum24(r.RANGE, n.EAST, p.EAST);
        GREEN_CENTER_W = new GameEnum24(r.RANGE, n.WEST, p.CENTER);
        GREEN_CENTER_E = new GameEnum24(r.RANGE, n.EAST, p.CENTER);
        GREEN_WEST_W = new GameEnum24(r.RANGE, n.WEST, p.WEST);
        GREEN_SOUTH_W = new GameEnum24(r.RANGE, n.WEST, p.SOUTH);
        GREEN_SOUTH_E = new GameEnum24(r.RANGE, n.EAST, p.SOUTH);
        TANZ_EAST_NE = new GameEnum24(r.MAGIC, n.NORTH_EAST, p.EAST);
        TANZ_EAST_E = new GameEnum24(r.MAGIC, n.EAST, p.EAST);
        TANZ_WEST_W = new GameEnum24(r.MAGIC, n.WEST, p.WEST);
        TANZ_CENTER_NE = new GameEnum24(r.MAGIC, n.NORTH_EAST, p.CENTER);
        TANZ_CENTER_E = new GameEnum24(r.MAGIC, n.EAST, p.CENTER);
        TANZ_SOUTH_CW = new GameEnum24(r.MAGIC, n.CENTER_WEST, p.SOUTH);
        TANZ_SOUTH_C = new GameEnum24(r.MAGIC, n.CENTER, p.SOUTH);
        MAGMA_CENTER_E = new GameEnum24(r.MELEE, n.EAST, p.CENTER);
        MAGMA_CENTER_NW = new GameEnum24(r.MELEE, n.NORTH_WEST, p.CENTER);
        MAGMA_CENTER_NE = new GameEnum24(r.MELEE, n.NORTH_EAST, p.CENTER);
        MAGMA_CENTER_W = new GameEnum24(r.MELEE, n.WEST, p.CENTER);
        JAD_PHASE_E = new GameEnum24(r.JAD_MAGIC_FIRST, n.EAST, p.EAST);
        JAD_PHASE_W = new GameEnum24(r.JAD_RANGE_FIRST, n.WEST, p.WEST);
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

