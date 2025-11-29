/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.hunter.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum8
extends Enum<a> {
    public static final  /* enum */ a TRAIL_31339;
    public static final  /* enum */ a TRAIL_31354;
    public static final  /* enum */ a TRAIL_31342;
    private  int state;
    private final  WorldPoint loc1;
    private final  WorldPoint loc3;
    public static final  /* enum */ a TRAIL_31333;
    public static final  /* enum */ a TRAIL_31372;
    public static final  /* enum */ a TRAIL_31360;
    public static final  /* enum */ a TRAIL_31369;
    public static final  /* enum */ a TRAIL_31351;
    private final  WorldPoint loc4;
    private final  int varp;
    public static final  /* enum */ a TRAIL_31306;
    public static final  /* enum */ a TRAIL_31330;
    public static final  /* enum */ a TRAIL_31366;
    public static final  /* enum */ a TRAIL_31363;
    public static final  /* enum */ a TRAIL_31348;
    private final  int id;
    public static final  /* enum */ a TRAIL_31309;
    
    public static final  /* enum */ a TRAIL_31321;
    public static final  /* enum */ a TRAIL_31303;
    private static final  a[] $VALUES;
    public static final  /* enum */ a TRAIL_31336;
    public static final  /* enum */ a TRAIL_31318;
    public static final  /* enum */ a TRAIL_31312;
    private final  WorldPoint loc2;
    public static final  /* enum */ a TRAIL_31345;
    public static final  /* enum */ a TRAIL_31327;
    
    public static final  /* enum */ a TRAIL_31324;
    public static final  /* enum */ a TRAIL_31357;
    public static final  /* enum */ a TRAIL_31315;

    static {
        a.lIIIlIlIlIlIlIl();
        a.lIIIlIlIlIIllIl();
        TRAIL_31303 = new GameEnum8(lllIIllIlIII[4], lllIIllIlIII[5], null, new WorldPoint(lllIIllIlIII[6], lllIIllIlIII[7], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[8], lllIIllIlIII[7], lllIIllIlIII[3]));
        TRAIL_31306 = new GameEnum8(lllIIllIlIII[9], lllIIllIlIII[10], null, new WorldPoint(lllIIllIlIII[11], lllIIllIlIII[12], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[13], lllIIllIlIII[14], lllIIllIlIII[3]));
        TRAIL_31309 = new GameEnum8(lllIIllIlIII[15], lllIIllIlIII[16], null, new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]));
        TRAIL_31312 = new GameEnum8(lllIIllIlIII[21], lllIIllIlIII[22], new WorldPoint(lllIIllIlIII[8], lllIIllIlIII[7], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[6], lllIIllIlIII[7], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]));
        TRAIL_31315 = new GameEnum8(lllIIllIlIII[28], lllIIllIlIII[29], new WorldPoint(lllIIllIlIII[8], lllIIllIlIII[7], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[6], lllIIllIlIII[7], lllIIllIlIII[3]), null);
        TRAIL_31318 = new GameEnum8(lllIIllIlIII[33], lllIIllIlIII[34], new WorldPoint(lllIIllIlIII[13], lllIIllIlIII[14], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[11], lllIIllIlIII[12], lllIIllIlIII[3]), null);
        TRAIL_31321 = new GameEnum8(lllIIllIlIII[36], lllIIllIlIII[37], new WorldPoint(lllIIllIlIII[13], lllIIllIlIII[14], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[38], lllIIllIlIII[39], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[11], lllIIllIlIII[12], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[40], lllIIllIlIII[41], lllIIllIlIII[3]));
        TRAIL_31324 = new GameEnum8(lllIIllIlIII[43], lllIIllIlIII[44], new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]));
        TRAIL_31327 = new GameEnum8(lllIIllIlIII[49], lllIIllIlIII[50], new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[51], lllIIllIlIII[52], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[53], lllIIllIlIII[52], lllIIllIlIII[3]));
        TRAIL_31330 = new GameEnum8(lllIIllIlIII[55], lllIIllIlIII[56], new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]));
        TRAIL_31333 = new GameEnum8(lllIIllIlIII[62], lllIIllIlIII[63], new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[53], lllIIllIlIII[52], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[51], lllIIllIlIII[52], lllIIllIlIII[3]));
        TRAIL_31336 = new GameEnum8(lllIIllIlIII[65], lllIIllIlIII[66], new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), null, null, null);
        TRAIL_31339 = new GameEnum8(lllIIllIlIII[68], lllIIllIlIII[69], new WorldPoint(lllIIllIlIII[30], lllIIllIlIII[31], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[23], lllIIllIlIII[24], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[25], lllIIllIlIII[26], lllIIllIlIII[3]));
        TRAIL_31342 = new GameEnum8(lllIIllIlIII[71], lllIIllIlIII[72], new WorldPoint(lllIIllIlIII[40], lllIIllIlIII[41], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[19], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[38], lllIIllIlIII[39], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[17], lllIIllIlIII[18], lllIIllIlIII[3]));
        TRAIL_31345 = new GameEnum8(lllIIllIlIII[74], lllIIllIlIII[75], new WorldPoint(lllIIllIlIII[40], lllIIllIlIII[41], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[38], lllIIllIlIII[39], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]));
        TRAIL_31348 = new GameEnum8(lllIIllIlIII[77], lllIIllIlIII[78], new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[79], lllIIllIlIII[80], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), null);
        TRAIL_31351 = new GameEnum8(lllIIllIlIII[82], lllIIllIlIII[83], new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[47], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[45], lllIIllIlIII[46], lllIIllIlIII[3]), null);
        TRAIL_31354 = new GameEnum8(lllIIllIlIII[85], lllIIllIlIII[86], new WorldPoint(lllIIllIlIII[53], lllIIllIlIII[52], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[51], lllIIllIlIII[52], lllIIllIlIII[3]), null);
        TRAIL_31357 = new GameEnum8(lllIIllIlIII[88], lllIIllIlIII[89], new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[90], lllIIllIlIII[3]), new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), null);
        TRAIL_31360 = new GameEnum8(lllIIllIlIII[92], lllIIllIlIII[93], new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), null);
        TRAIL_31363 = new GameEnum8(lllIIllIlIII[95], lllIIllIlIII[96], new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[58], lllIIllIlIII[3]), null, new WorldPoint(lllIIllIlIII[59], lllIIllIlIII[60], lllIIllIlIII[3]), null);
        TRAIL_31366 = new GameEnum8(lllIIllIlIII[98], lllIIllIlIII[99], null, null, null, null);
        TRAIL_31369 = new GameEnum8(lllIIllIlIII[101], lllIIllIlIII[102], new WorldPoint(lllIIllIlIII[79], lllIIllIlIII[80], lllIIllIlIII[3]), null, null, null);
        TRAIL_31372 = new GameEnum8(lllIIllIlIII[104], lllIIllIlIII[105], new WorldPoint(lllIIllIlIII[57], lllIIllIlIII[90], lllIIllIlIII[3]), null, null, null);
        a[] aArray = new a[lllIIllIlIII[106]];
        aArray[a.lllIIllIlIII[3]] = TRAIL_31303;
        aArray[a.lllIIllIlIII[1]] = TRAIL_31306;
        aArray[a.lllIIllIlIII[2]] = TRAIL_31309;
        aArray[a.lllIIllIlIII[20]] = TRAIL_31312;
        aArray[a.lllIIllIlIII[27]] = TRAIL_31315;
        aArray[a.lllIIllIlIII[32]] = TRAIL_31318;
        aArray[a.lllIIllIlIII[35]] = TRAIL_31321;
        aArray[a.lllIIllIlIII[42]] = TRAIL_31324;
        aArray[a.lllIIllIlIII[48]] = TRAIL_31327;
        aArray[a.lllIIllIlIII[54]] = TRAIL_31330;
        aArray[a.lllIIllIlIII[61]] = TRAIL_31333;
        aArray[a.lllIIllIlIII[64]] = TRAIL_31336;
        aArray[a.lllIIllIlIII[67]] = TRAIL_31339;
        aArray[a.lllIIllIlIII[70]] = TRAIL_31342;
        aArray[a.lllIIllIlIII[73]] = TRAIL_31345;
        aArray[a.lllIIllIlIII[76]] = TRAIL_31348;
        aArray[a.lllIIllIlIII[81]] = TRAIL_31351;
        aArray[a.lllIIllIlIII[84]] = TRAIL_31354;
        aArray[a.lllIIllIlIII[87]] = TRAIL_31357;
        aArray[a.lllIIllIlIII[91]] = TRAIL_31360;
        aArray[a.lllIIllIlIII[94]] = TRAIL_31363;
        aArray[a.lllIIllIlIII[97]] = TRAIL_31366;
        aArray[a.lllIIllIlIII[100]] = TRAIL_31369;
        aArray[a.lllIIllIlIII[103]] = TRAIL_31372;
        $VALUES = aArray;
    }

    private static boolean lIIIlIlIlIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlIlIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIlIlIlIIllIl() {
        lllIIllIIlIl = new String[lllIIllIlIII[106]];
        a.lllIIllIIlIl[a.lllIIllIlIII[3]] = "TRAIL_31303";
        a.lllIIllIIlIl[a.lllIIllIlIII[1]] = "TRAIL_31306";
        a.lllIIllIIlIl[a.lllIIllIlIII[2]] = "TRAIL_31309";
        a.lllIIllIIlIl[a.lllIIllIlIII[20]] = "TRAIL_31312";
        a.lllIIllIIlIl[a.lllIIllIlIII[27]] = "TRAIL_31315";
        a.lllIIllIIlIl[a.lllIIllIlIII[32]] = "TRAIL_31318";
        a.lllIIllIIlIl[a.lllIIllIlIII[35]] = "TRAIL_31321";
        a.lllIIllIIlIl[a.lllIIllIlIII[42]] = "TRAIL_31324";
        a.lllIIllIIlIl[a.lllIIllIlIII[48]] = "TRAIL_31327";
        a.lllIIllIIlIl[a.lllIIllIlIII[54]] = "TRAIL_31330";
        a.lllIIllIIlIl[a.lllIIllIlIII[61]] = "TRAIL_31333";
        a.lllIIllIIlIl[a.lllIIllIlIII[64]] = "TRAIL_31336";
        a.lllIIllIIlIl[a.lllIIllIlIII[67]] = "TRAIL_31339";
        a.lllIIllIIlIl[a.lllIIllIlIII[70]] = "TRAIL_31342";
        a.lllIIllIIlIl[a.lllIIllIlIII[73]] = "TRAIL_31345";
        a.lllIIllIIlIl[a.lllIIllIlIII[76]] = "TRAIL_31348";
        a.lllIIllIIlIl[a.lllIIllIlIII[81]] = "TRAIL_31351";
        a.lllIIllIIlIl[a.lllIIllIlIII[84]] = "TRAIL_31354";
        a.lllIIllIIlIl[a.lllIIllIlIII[87]] = "TRAIL_31357";
        a.lllIIllIIlIl[a.lllIIllIlIII[91]] = "TRAIL_31360";
        a.lllIIllIIlIl[a.lllIIllIlIII[94]] = "TRAIL_31363";
        a.lllIIllIIlIl[a.lllIIllIlIII[97]] = "TRAIL_31366";
        a.lllIIllIIlIl[a.lllIIllIlIII[100]] = "TRAIL_31369";
        a.lllIIllIIlIl[a.lllIIllIlIII[103]] = "TRAIL_31372";
    }

    public int b() {
        return this.varp;
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    public int GameEnum8() {
        return this.id;
    }

    public WorldPoint[] d() {
        a var1;
        if (a.lIIIlIlIlIlIllI(this.state, lllIIllIlIII[1])) {
            WorldPoint[] worldPointArray = new WorldPoint[lllIIllIlIII[2]];
            worldPointArray[a.lllIIllIlIII[3]] = this.loc1;
            worldPointArray[a.lllIIllIlIII[1]] = this.loc3;
            return worldPointArray;
        }
        if (a.lIIIlIlIlIlIllI(var1.state, lllIIllIlIII[2])) {
            WorldPoint[] worldPointArray = new WorldPoint[lllIIllIlIII[2]];
            worldPointArray[a.lllIIllIlIII[3]] = var1.loc2;
            worldPointArray[a.lllIIllIlIII[1]] = var1.loc4;
            return worldPointArray;
        }
        return new WorldPoint[lllIIllIlIII[3]];
    }

        return String.valueOf(var2);
    }

    public void GameEnum8(int n2) {
        this.state = n2;
    }

    private GameEnum8(int n3, int n4, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, WorldPoint worldPoint4) {
        this.state = lllIIllIlIII[0];
        this.id = n3;
        this.varp = n4;
        this.loc1 = worldPoint;
        this.loc2 = worldPoint2;
        this.loc3 = worldPoint3;
        this.loc4 = worldPoint4;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public int c() {
        return this.state;
    }
}

