/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GHelper;
import gg.squire.cox.tasks.IHelper;
import gg.squire.cox.tasks.GameEnum2;
import gg.squire.cox.tasks.NHelper;
import net.runelite.api.coords.WorldPoint;

public final class GameEnum6
extends Enum<H> {
     G west;
    public static final  /* enum */ H CRABS_SINGLE;
    public static final  /* enum */ H CRABS_DOUBLE_1;
    
    public static final  /* enum */ H CRABS_MOVABLE_3;
    
    public static final  /* enum */ H TEKTON_START;
     G east;
    public static final  /* enum */ H CRABS_MOVABLE_4;
    public static final  /* enum */ H CRABS_MOVABLE_1;
     G north;
    public static final  /* enum */ H MYSTICS_SAFESPOT;
    public static final  /* enum */ H CRABS_BASE_1;
    public static final  /* enum */ H CRABS_DOUBLE_2;
    public static final  /* enum */ H CRABS_BASE_2;
    public static final  /* enum */ H VESPULA_ATTACK_POINT;
    private static final  H[] $VALUES;
    public static final  /* enum */ H CRABS_MOVABLE_2;

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    public G d(n n2) {
        S s2 = n2.bx;
        switch (I.cc[s2.ordinal()]) {
            case 1: {
                H var3;
                return var3.east;
            }
            case 2: {
                H var3;
                return var3.north;
            }
            case 3: {
                H var3;
                return var3.west;
            }
        }
        return this.east;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        H.var10();
        H.var11();
        TEKTON_START = new GameEnum6(new GHelper(1, 2), new GHelper(3, 1), new GHelper(1, 2));
        CRABS_BASE_1 = new GameEnum6(new GHelper(5, 6), new GHelper(7, 7), new GHelper(8, 9));
        CRABS_BASE_2 = new GameEnum6(new GHelper(var1[11], 8), new GHelper(7, 7), new GHelper(var1[12], var1[13]));
        CRABS_MOVABLE_1 = new GameEnum6(new GHelper(var1[15], var1[12]), new GHelper(7, 7), new GHelper(2, 1));
        CRABS_MOVABLE_2 = new GameEnum6(new GHelper(var1[17], var1[12]), new GHelper(7, 7), new GHelper(9, 1));
        CRABS_MOVABLE_3 = new GameEnum6(new GHelper(var1[19], var1[12]), new GHelper(7, 7), new GHelper(7, 7));
        CRABS_MOVABLE_4 = new GameEnum6(new GHelper(9, var1[12]), new GHelper(7, 7), new GHelper(7, 7));
        CRABS_SINGLE = new GameEnum6(new GHelper(7, 7), new GHelper(7, 7), new GHelper(var1[21], 9));
        CRABS_DOUBLE_1 = new GameEnum6(new GHelper(7, 7), new GHelper(7, 7), new GHelper(2, 9));
        CRABS_DOUBLE_2 = new GameEnum6(new GHelper(7, 7), new GHelper(7, 7), new GHelper(var1[21], var1[11]));
        MYSTICS_SAFESPOT = new GameEnum6(new GHelper(6, 6), new GHelper(var1[15], var1[15]), new GHelper(var1[15], 6));
        VESPULA_ATTACK_POINT = new GameEnum6(new GHelper(var1[22], var1[23]), new GHelper(1, var1[12]), new GHelper(var1[19], var1[23]));
        H[] hArray = new H[var1[23]];
        hArray[0] = TEKTON_START;
        hArray[4] = CRABS_BASE_1;
        hArray[H.var1[10]] = CRABS_BASE_2;
        hArray[H.var1[14]] = CRABS_MOVABLE_1;
        hArray[H.var1[16]] = CRABS_MOVABLE_2;
        hArray[H.var1[18]] = CRABS_MOVABLE_3;
        hArray[H.var1[20]] = CRABS_MOVABLE_4;
        hArray[8] = CRABS_SINGLE;
        hArray[H.var1[12]] = CRABS_DOUBLE_1;
        hArray[6] = CRABS_DOUBLE_2;
        hArray[2] = MYSTICS_SAFESPOT;
        hArray[H.var1[21]] = VESPULA_ATTACK_POINT;
        $VALUES = hArray;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = 0;
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = 0;
        while (var26 < var25) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private GameEnum6(G g2, G g3, G g4) {
        this.west = g2;
        this.north = g3;
        this.east = g4;
    }

    public WorldPoint c(n n2) {
        char c2 = n2.bu;
        WorldPoint worldPoint = n2.bq;
        S s2 = n2.bx;
        return this.d(n2).c(c2, worldPoint);
    }

    public static H valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }
}

