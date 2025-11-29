/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package gg.squire.tithefarm.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class GameEnum
extends Enum<g> {
    public static final  /* enum */ g PATCH_9;
    public static final  /* enum */ g PATCH_13;
    public static final  /* enum */ g PATCH_6_NORTH;
    public static final  /* enum */ g PATCH_10;
    private final  int regionY;
    public static final  /* enum */ g PATCH_15;
    public static final  /* enum */ g PATCH_6;
    public static final  /* enum */ g PATCH_14;
    public static final  /* enum */ g PATCH_2;
    public static final  /* enum */ g PATCH_3;
    public static final  /* enum */ g PATCH_1;
    public static final  /* enum */ g PATCH_1_NORTH;
    public static final  /* enum */ g PATCH_16_NORTH;
    public static final  /* enum */ g PATCH_11_NORTH;
    
    public static final  /* enum */ g PATCH_4_NORTH;
    
    public static final  /* enum */ g PATCH_14_NORTH;
    public static final  /* enum */ g PATCH_13_NORTH;
    public static final  /* enum */ g PATCH_11;
    public static final  /* enum */ g PATCH_12_NORTH;
    public static final  /* enum */ g PATCH_2_NORTH;
    public static final  /* enum */ g PATCH_8;
    public static final  /* enum */ g PATCH_7;
    public static final  /* enum */ g PATCH_7_NORTH;
    public static final  /* enum */ g PATCH_9_NORTH;
    public static final  /* enum */ g PATCH_3_NORTH;
    public static final  /* enum */ g PATCH_13_SOUTH;
    public static final  /* enum */ g PATCH_4;
    public static final  /* enum */ g PATCH_12;
    private final  int regionX;
    public static final  /* enum */ g PATCH_5_NORTH;
    public static final  /* enum */ g PATCH_10_NORTH;
    public static final  /* enum */ g PATCH_16;
    public static final  /* enum */ g PATCH_5;
    private static final  g[] $VALUES;
    public static final  /* enum */ g PATCH_8_NORTH;
    public static final  /* enum */ g PATCH_15_NORTH;

    private static void lIllIllIIllIlIl() {
        lIIlllllllIll = new String[lIIllllllllll[42]];
        g.lIIlllllllIll[g.lIIllllllllll[0]] = "PATCH_1";
        g.lIIlllllllIll[g.lIIllllllllll[2]] = "PATCH_2";
        g.lIIlllllllIll[g.lIIllllllllll[6]] = "PATCH_3";
        g.lIIlllllllIll[g.lIIllllllllll[8]] = "PATCH_4";
        g.lIIlllllllIll[g.lIIllllllllll[10]] = "PATCH_1_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[12]] = "PATCH_2_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[14]] = "PATCH_3_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[16]] = "PATCH_4_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[18]] = "PATCH_5";
        g.lIIlllllllIll[g.lIIllllllllll[20]] = "PATCH_6";
        g.lIIlllllllIll[g.lIIllllllllll[21]] = "PATCH_7";
        g.lIIlllllllIll[g.lIIllllllllll[22]] = "PATCH_8";
        g.lIIlllllllIll[g.lIIllllllllll[23]] = "PATCH_5_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[24]] = "PATCH_6_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[25]] = "PATCH_7_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[26]] = "PATCH_8_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[27]] = "PATCH_9";
        g.lIIlllllllIll[g.lIIllllllllll[29]] = "PATCH_10";
        g.lIIlllllllIll[g.lIIllllllllll[30]] = "PATCH_11";
        g.lIIlllllllIll[g.lIIllllllllll[31]] = "PATCH_12";
        g.lIIlllllllIll[g.lIIllllllllll[32]] = "PATCH_13_SOUTH";
        g.lIIlllllllIll[g.lIIllllllllll[33]] = "PATCH_9_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[34]] = "PATCH_10_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[35]] = "PATCH_11_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[36]] = "PATCH_12_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[4]] = "PATCH_13";
        g.lIIlllllllIll[g.lIIllllllllll[37]] = "PATCH_14";
        g.lIIlllllllIll[g.lIIllllllllll[38]] = "PATCH_15";
        g.lIIlllllllIll[g.lIIllllllllll[5]] = "PATCH_16";
        g.lIIlllllllIll[g.lIIllllllllll[39]] = "PATCH_13_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[40]] = "PATCH_14_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[7]] = "PATCH_15_NORTH";
        g.lIIlllllllIll[g.lIIllllllllll[41]] = "PATCH_16_NORTH";
    }

    private GameEnum(int n3, int n4) {
        this.regionX = n3;
        this.regionY = n4;
    }

    static {
        g.lIllIllIIllIlll();
        g.lIllIllIIllIlIl();
        PATCH_1 = new GameEnum(lIIllllllllll[3], lIIllllllllll[4]);
        PATCH_2 = new GameEnum(lIIllllllllll[3], lIIllllllllll[5]);
        PATCH_3 = new GameEnum(lIIllllllllll[3], lIIllllllllll[7]);
        PATCH_4 = new GameEnum(lIIllllllllll[3], lIIllllllllll[9]);
        PATCH_1_NORTH = new GameEnum(lIIllllllllll[3], lIIllllllllll[11]);
        PATCH_2_NORTH = new GameEnum(lIIllllllllll[3], lIIllllllllll[13]);
        PATCH_3_NORTH = new GameEnum(lIIllllllllll[3], lIIllllllllll[15]);
        PATCH_4_NORTH = new GameEnum(lIIllllllllll[3], lIIllllllllll[17]);
        PATCH_5 = new GameEnum(lIIllllllllll[19], lIIllllllllll[4]);
        PATCH_6 = new GameEnum(lIIllllllllll[19], lIIllllllllll[5]);
        PATCH_7 = new GameEnum(lIIllllllllll[19], lIIllllllllll[7]);
        PATCH_8 = new GameEnum(lIIllllllllll[19], lIIllllllllll[9]);
        PATCH_5_NORTH = new GameEnum(lIIllllllllll[19], lIIllllllllll[11]);
        PATCH_6_NORTH = new GameEnum(lIIllllllllll[19], lIIllllllllll[13]);
        PATCH_7_NORTH = new GameEnum(lIIllllllllll[19], lIIllllllllll[15]);
        PATCH_8_NORTH = new GameEnum(lIIllllllllll[19], lIIllllllllll[17]);
        PATCH_9 = new GameEnum(lIIllllllllll[28], lIIllllllllll[4]);
        PATCH_10 = new GameEnum(lIIllllllllll[28], lIIllllllllll[5]);
        PATCH_11 = new GameEnum(lIIllllllllll[28], lIIllllllllll[7]);
        PATCH_12 = new GameEnum(lIIllllllllll[28], lIIllllllllll[9]);
        PATCH_13_SOUTH = new GameEnum(lIIllllllllll[28], lIIllllllllll[31]);
        PATCH_9_NORTH = new GameEnum(lIIllllllllll[28], lIIllllllllll[11]);
        PATCH_10_NORTH = new GameEnum(lIIllllllllll[28], lIIllllllllll[13]);
        PATCH_11_NORTH = new GameEnum(lIIllllllllll[28], lIIllllllllll[15]);
        PATCH_12_NORTH = new GameEnum(lIIllllllllll[28], lIIllllllllll[17]);
        PATCH_13 = new GameEnum(lIIllllllllll[11], lIIllllllllll[4]);
        PATCH_14 = new GameEnum(lIIllllllllll[11], lIIllllllllll[5]);
        PATCH_15 = new GameEnum(lIIllllllllll[11], lIIllllllllll[7]);
        PATCH_16 = new GameEnum(lIIllllllllll[11], lIIllllllllll[9]);
        PATCH_13_NORTH = new GameEnum(lIIllllllllll[11], lIIllllllllll[11]);
        PATCH_14_NORTH = new GameEnum(lIIllllllllll[11], lIIllllllllll[13]);
        PATCH_15_NORTH = new GameEnum(lIIllllllllll[11], lIIllllllllll[15]);
        PATCH_16_NORTH = new GameEnum(lIIllllllllll[11], lIIllllllllll[17]);
        g[] gArray = new g[lIIllllllllll[42]];
        gArray[g.lIIllllllllll[0]] = PATCH_1;
        gArray[g.lIIllllllllll[2]] = PATCH_2;
        gArray[g.lIIllllllllll[6]] = PATCH_3;
        gArray[g.lIIllllllllll[8]] = PATCH_4;
        gArray[g.lIIllllllllll[10]] = PATCH_1_NORTH;
        gArray[g.lIIllllllllll[12]] = PATCH_2_NORTH;
        gArray[g.lIIllllllllll[14]] = PATCH_3_NORTH;
        gArray[g.lIIllllllllll[16]] = PATCH_4_NORTH;
        gArray[g.lIIllllllllll[18]] = PATCH_5;
        gArray[g.lIIllllllllll[20]] = PATCH_6;
        gArray[g.lIIllllllllll[21]] = PATCH_7;
        gArray[g.lIIllllllllll[22]] = PATCH_8;
        gArray[g.lIIllllllllll[23]] = PATCH_5_NORTH;
        gArray[g.lIIllllllllll[24]] = PATCH_6_NORTH;
        gArray[g.lIIllllllllll[25]] = PATCH_7_NORTH;
        gArray[g.lIIllllllllll[26]] = PATCH_8_NORTH;
        gArray[g.lIIllllllllll[27]] = PATCH_9;
        gArray[g.lIIllllllllll[29]] = PATCH_10;
        gArray[g.lIIllllllllll[30]] = PATCH_11;
        gArray[g.lIIllllllllll[31]] = PATCH_12;
        gArray[g.lIIllllllllll[32]] = PATCH_13_SOUTH;
        gArray[g.lIIllllllllll[33]] = PATCH_9_NORTH;
        gArray[g.lIIllllllllll[34]] = PATCH_10_NORTH;
        gArray[g.lIIllllllllll[35]] = PATCH_11_NORTH;
        gArray[g.lIIllllllllll[36]] = PATCH_12_NORTH;
        gArray[g.lIIllllllllll[4]] = PATCH_13;
        gArray[g.lIIllllllllll[37]] = PATCH_14;
        gArray[g.lIIllllllllll[38]] = PATCH_15;
        gArray[g.lIIllllllllll[5]] = PATCH_16;
        gArray[g.lIIllllllllll[39]] = PATCH_13_NORTH;
        gArray[g.lIIllllllllll[40]] = PATCH_14_NORTH;
        gArray[g.lIIllllllllll[7]] = PATCH_15_NORTH;
        gArray[g.lIIllllllllll[41]] = PATCH_16_NORTH;
        $VALUES = gArray;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static boolean lIllIllIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var1);
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public WorldPoint n() {
        return WorldPoint.fromRegion((int)lIIllllllllll[1], (int)this.regionX, (int)this.regionY, (int)lIIllllllllll[0]);
    }

    private static boolean lIllIllIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(TileObject tileObject) {
        int n2;
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)tileObject.getWorldLocation());
        if (g.lIllIllIIlllIII(regionPoint.getX(), this.regionX) && g.lIllIllIIlllIII(regionPoint.getY(), this.regionY)) {
            n2 = lIIllllllllll[2];

            }
        } else {
            n2 = lIIllllllllll[0];
        }
        return n2 != 0;
    }

    public RegionPoint m() {
        return new RegionPoint(this.regionX, this.regionY, lIIllllllllll[0], lIIllllllllll[1]);
    }
}

