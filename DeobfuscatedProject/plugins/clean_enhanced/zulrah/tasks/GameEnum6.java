/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum;
import gg.squire.zulrah.tasks.GameEnum15;
import gg.squire.zulrah.tasks.GameEnum12;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum6
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
        if (!((Object)this.zulrahType != (Object)this.zulrahType2)r.JAD_RANGE_FIRST) || ((Object)this.zulrahType == (Object)this.zulrahType2)r.JAD_MAGIC_FIRST)) {
            bl = 1;
            0;
            if (((0x6B ^ 0x3D) & ~(0x7D ^ 0x2B)) > 2) {
                return ((0x9B ^ 0xBB) & ~(0xBA ^ 0x9A)) != 0;
            }
        } else {
            bl = 2;
        }
        return bl;
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }

    public boolean A() {
        boolean bl;
        if (((Object)this.zulrahType == (Object)this.zulrahType2)r.MELEE)) {
            bl = 1;
            0;
            if ((0x16 ^ 0x12) <= ((0x51 ^ 5) & ~(7 ^ 0x53))) {
                return ((0x95 ^ 0x83) & ~(0x16 ^ 0)) != 0;
            }
        } else {
            bl = 2;
        }
        return bl;
    }

    private GameEnum6(r r2, n n3, p p2) {
        this.zulrahType = r2;
        this.safeSpot = n3;
        this.zulrahPos = p2;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public WorldPoint a(WorldPoint worldPoint) {
        return worldPoint.dx(this.safeSpot.G()).dy(this.safeSpot.H());
    }

    public boolean y() {
        boolean bl;
        if (((Object)this.zulrahType == (Object)this.zulrahType2)r.MAGIC)) {
            bl = 1;
            0;
            if (3 == 2) {
                return ((0x30 ^ 0x6A) & ~(0x20 ^ 0x7A)) != 0;
            }
        } else {
            bl = 2;
        }
        return bl;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 2;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 2;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    public WorldPoint b(WorldPoint worldPoint) {
        return worldPoint.dx(this.zulrahPos.G() - 0).dy(this.zulrahPos.H() - 0);
    }

    public boolean z() {
        boolean bl;
        if (((Object)this.zulrahType == (Object)this.zulrahType2)r.RANGE)) {
            bl = 1;
            0;
            if (((28 + 95 - 90 + 94 ^ (0x91 ^ 0xB6)) & (0 + 82 - -31 + 87 ^ 32 + 111 - 0 + 1 ^ -1)) != ((115 + 70 - 178 + 124 ^ 83 + 127 - 171 + 113) & (0xF6 ^ 0x88 ^ (0x22 ^ 0x47) ^ -1))) {
                return ((0x75 ^ 0x58 ^ (0x90 ^ 0x83)) & (0x3F ^ 0x10 ^ (0xA6 ^ 0xB7) ^ -1)) != 0;
            }
        } else {
            bl = 2;
        }
        return bl;
    }

    public boolean B() {
        boolean bl;
        if (((Object)this.zulrahPos == (Object)this.zulrahPos2)p.CENTER)) {
            bl = 1;
            0;
            if ((0x1A ^ 0x62 ^ (0xF ^ 0x73)) == 1) {
                return ((0x74 ^ 0x4E ^ (0xBF ^ 0x9A)) & (0x96 ^ 0xA2 ^ (0xA ^ 0x21) ^ -1)) != 0;
            }
        } else {
            bl = 2;
        }
        return bl;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    static {
        k.var25();
        k.var26();
        INITIAL = new GameEnum6(r.RANGE, n.NORTH_EAST, p.CENTER);
        GREEN_EAST_NE = new GameEnum6(r.RANGE, n.NORTH_EAST, p.EAST);
        GREEN_EAST_CE = new GameEnum6(r.RANGE, n.CENTER_EAST, p.EAST);
        GREEN_EAST_E = new GameEnum6(r.RANGE, n.EAST, p.EAST);
        GREEN_CENTER_W = new GameEnum6(r.RANGE, n.WEST, p.CENTER);
        GREEN_CENTER_E = new GameEnum6(r.RANGE, n.EAST, p.CENTER);
        GREEN_WEST_W = new GameEnum6(r.RANGE, n.WEST, p.WEST);
        GREEN_SOUTH_W = new GameEnum6(r.RANGE, n.WEST, p.SOUTH);
        GREEN_SOUTH_E = new GameEnum6(r.RANGE, n.EAST, p.SOUTH);
        TANZ_EAST_NE = new GameEnum6(r.MAGIC, n.NORTH_EAST, p.EAST);
        TANZ_EAST_E = new GameEnum6(r.MAGIC, n.EAST, p.EAST);
        TANZ_WEST_W = new GameEnum6(r.MAGIC, n.WEST, p.WEST);
        TANZ_CENTER_NE = new GameEnum6(r.MAGIC, n.NORTH_EAST, p.CENTER);
        TANZ_CENTER_E = new GameEnum6(r.MAGIC, n.EAST, p.CENTER);
        TANZ_SOUTH_CW = new GameEnum6(r.MAGIC, n.CENTER_WEST, p.SOUTH);
        TANZ_SOUTH_C = new GameEnum6(r.MAGIC, n.CENTER, p.SOUTH);
        MAGMA_CENTER_E = new GameEnum6(r.MELEE, n.EAST, p.CENTER);
        MAGMA_CENTER_NW = new GameEnum6(r.MELEE, n.NORTH_WEST, p.CENTER);
        MAGMA_CENTER_NE = new GameEnum6(r.MELEE, n.NORTH_EAST, p.CENTER);
        MAGMA_CENTER_W = new GameEnum6(r.MELEE, n.WEST, p.CENTER);
        JAD_PHASE_E = new GameEnum6(r.JAD_MAGIC_FIRST, n.EAST, p.EAST);
        JAD_PHASE_W = new GameEnum6(r.JAD_RANGE_FIRST, n.WEST, p.WEST);
        k[] kArray = new k[var2[22]];
        kArray[2] = INITIAL;
        kArray[1] = GREEN_EAST_NE;
        kArray[0] = GREEN_EAST_CE;
        kArray[3] = GREEN_EAST_E;
        kArray[4] = GREEN_CENTER_W;
        kArray[5] = GREEN_CENTER_E;
        kArray[6] = GREEN_WEST_W;
        kArray[7] = GREEN_SOUTH_W;
        kArray[8] = GREEN_SOUTH_E;
        kArray[9] = TANZ_EAST_NE;
        kArray[k.var2[10]] = TANZ_EAST_E;
        kArray[k.var2[11]] = TANZ_WEST_W;
        kArray[k.var2[12]] = TANZ_CENTER_NE;
        kArray[k.var2[13]] = TANZ_CENTER_E;
        kArray[k.var2[14]] = TANZ_SOUTH_CW;
        kArray[k.var2[15]] = TANZ_SOUTH_C;
        kArray[k.var2[16]] = MAGMA_CENTER_E;
        kArray[k.var2[17]] = MAGMA_CENTER_NW;
        kArray[k.var2[18]] = MAGMA_CENTER_NE;
        kArray[k.var2[19]] = MAGMA_CENTER_W;
        kArray[k.var2[20]] = JAD_PHASE_E;
        kArray[k.var2[21]] = JAD_PHASE_W;
        $VALUES = kArray;
    }
}

