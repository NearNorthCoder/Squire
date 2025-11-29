/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.construction.tasks;

import com.google.common.primitives.Ints;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum70
extends Enum<N> {
    public static final  /* enum */ N NECHRYAEL;
    private final  WorldPoint sw;
    private final  List<Integer> dropTable;
    
    private final  WorldPoint second;
    private static final  N[] $VALUES;
    private final  int id;
    private final  WorldPoint ne;
    public static final  /* enum */ N SMOKE_DEVIL;
    private final  WorldPoint first;
    
    public static final  /* enum */ N DUST_DEVIL;

    public WorldPoint aJ() {
        return this.first;
    }

    public List<Integer> aL() {
        return this.dropTable;
    }

    private static void llIIIIIllI() {
        llIlIlll = new String[llIllIII[25]];
        N.llIlIlll[N.llIllIII[0]] = "DUST_DEVIL";
        N.llIlIlll[N.llIllIII[10]] = "NECHRYAEL";
        N.llIlIlll[N.llIllIII[23]] = "SMOKE_DEVIL";
    }

    private GameEnum70(int n3, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, WorldPoint worldPoint4, int ... nArray) {
        this.id = n3;
        this.first = worldPoint;
        this.second = worldPoint2;
        this.sw = worldPoint3;
        this.ne = worldPoint4;
        this.dropTable = Ints.asList((int[])nArray);
    }

    public boolean g(WorldPoint worldPoint) {
        return WorldPoint.isInZone((WorldPoint)this.sw, (WorldPoint)this.ne, (WorldPoint)worldPoint);
    }

    public static N valueOf(String string) {
        return Enum.valueOf(GameEnum70.class, string);
    }

    public static N[] values() {
        return (N[])$VALUES.clone();
    }

        return String.valueOf(llIlIlIlIIlIllI);
    }

    public int h(WorldPoint worldPoint) {
        return Math.min(worldPoint.distanceTo(this.first), worldPoint.distanceTo(this.second));
    }

    static {
        N.llIIIIIlll();
        N.llIIIIIllI();
        DUST_DEVIL = new GameEnum70(llIllIII[1], new WorldPoint(llIllIII[2], llIllIII[3], llIllIII[0]), new WorldPoint(llIllIII[4], llIllIII[5], llIllIII[0]), new WorldPoint(llIllIII[6], llIllIII[7], llIllIII[0]), new WorldPoint(llIllIII[8], llIllIII[9], llIllIII[0]), new int[llIllIII[0]]);
        int[] nArray = new int[llIllIII[20]];
        nArray[N.llIllIII[0]] = llIllIII[21];
        nArray[N.llIllIII[10]] = llIllIII[22];
        nArray[N.llIllIII[23]] = llIllIII[24];
        nArray[N.llIllIII[25]] = llIllIII[26];
        nArray[N.llIllIII[27]] = llIllIII[28];
        nArray[N.llIllIII[29]] = llIllIII[30];
        nArray[N.llIllIII[31]] = llIllIII[32];
        nArray[N.llIllIII[33]] = llIllIII[34];
        nArray[N.llIllIII[35]] = llIllIII[36];
        nArray[N.llIllIII[37]] = llIllIII[38];
        nArray[N.llIllIII[39]] = llIllIII[40];
        nArray[N.llIllIII[41]] = llIllIII[42];
        nArray[N.llIllIII[43]] = llIllIII[44];
        nArray[N.llIllIII[45]] = llIllIII[46];
        nArray[N.llIllIII[47]] = llIllIII[48];
        nArray[N.llIllIII[49]] = llIllIII[50];
        nArray[N.llIllIII[51]] = llIllIII[52];
        NECHRYAEL = new GameEnum70(llIllIII[11], new WorldPoint(llIllIII[12], llIllIII[13], llIllIII[0]), new WorldPoint(llIllIII[14], llIllIII[15], llIllIII[0]), new WorldPoint(llIllIII[16], llIllIII[17], llIllIII[0]), new WorldPoint(llIllIII[18], llIllIII[19], llIllIII[0]), nArray);
        SMOKE_DEVIL = new GameEnum70(llIllIII[53], new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[54]), new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[54]), new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[10]), new WorldPoint(llIllIII[54], llIllIII[54], llIllIII[54]), new int[llIllIII[0]]);
        N[] nArray2 = new N[llIllIII[25]];
        nArray2[N.llIllIII[0]] = DUST_DEVIL;
        nArray2[N.llIllIII[10]] = NECHRYAEL;
        nArray2[N.llIllIII[23]] = SMOKE_DEVIL;
        $VALUES = nArray2;
    }

    public int P() {
        return this.id;
    }

    public WorldPoint aK() {
        return this.second;
    }

    private static boolean llIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

}

