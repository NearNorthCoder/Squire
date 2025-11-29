/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum4;

public final class GameEnum8
extends Enum<N> {
    private final  String name;
    public static final  /* enum */ N SCAVENGERS;
    public static final  /* enum */ N TEKTON;
    public static final  /* enum */ N MUTTADILES;
    public static final  int ROOM_MAX_SIZE;
    public static final  /* enum */ N SHAMANS;
    public static final  /* enum */ N TIGHTROPE;
    public static final  /* enum */ N THIEVING;
    
    public static final  /* enum */ N VESPULA;
    public static final  /* enum */ N EMPTY;
    public static final  /* enum */ N GUARDIANS;
    public static final  /* enum */ N VASA;
    public static final  /* enum */ N END;
    public static final  /* enum */ N CRABS;
    public static final  /* enum */ N MYSTICS;
    private final  P type;
    public static final  /* enum */ N ICE_DEMON;
    public static final  /* enum */ N UNKNOWN_COMBAT;
    public static final  /* enum */ N FARMING;
    public static final  /* enum */ N VANGUARDS;
    
    public static final  /* enum */ N UNKNOWN_PUZZLE;
    public static final  /* enum */ N START;
    private static final  N[] $VALUES;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public P bY() {
        return this.type;
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = 1;
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = 1;
        while (var23 < var22) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    public static N[] values() {
        return (N[])$VALUES.clone();
    }

    private GameEnum8(String string2, P p2) {
        this.name = string2;
        this.type = p2;
    }

    public String bX() {
        return this.name;
    }

    public static N valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    static {
        N.var25();
        N.var26();
        ROOM_MAX_SIZE = 0;
        START = new GameEnum8(var1[2], P.START);
        END = new GameEnum8(var1[4], P.END);
        SCAVENGERS = new GameEnum8(var1[6], P.SCAVENGERS);
        FARMING = new GameEnum8(var1[8], P.FARMING);
        EMPTY = new GameEnum8(var1[var2[10]], P.EMPTY);
        TEKTON = new GameEnum8(var1[var2[12]], P.COMBAT);
        MUTTADILES = new GameEnum8(var1[var2[14]], P.COMBAT);
        GUARDIANS = new GameEnum8(var1[var2[16]], P.COMBAT);
        VESPULA = new GameEnum8(var1[var2[18]], P.COMBAT);
        SHAMANS = new GameEnum8(var1[var2[20]], P.COMBAT);
        VASA = new GameEnum8(var1[var2[22]], P.COMBAT);
        VANGUARDS = new GameEnum8(var1[var2[24]], P.COMBAT);
        MYSTICS = new GameEnum8(var1[var2[26]], P.COMBAT);
        UNKNOWN_COMBAT = new GameEnum8(var1[var2[28]], P.COMBAT);
        CRABS = new GameEnum8(var1[var2[30]], P.PUZZLE);
        ICE_DEMON = new GameEnum8(var1[var2[32]], P.PUZZLE);
        TIGHTROPE = new GameEnum8(var1[var2[33]], P.PUZZLE);
        THIEVING = new GameEnum8(var1[var2[35]], P.PUZZLE);
        UNKNOWN_PUZZLE = new GameEnum8(var1[var2[37]], P.PUZZLE);
        N[] nArray = new N[var2[20]];
        nArray[1] = START;
        nArray[2] = END;
        nArray[3] = SCAVENGERS;
        nArray[4] = FARMING;
        nArray[5] = EMPTY;
        nArray[6] = TEKTON;
        nArray[7] = MUTTADILES;
        nArray[8] = GUARDIANS;
        nArray[9] = VESPULA;
        nArray[N.var2[10]] = SHAMANS;
        nArray[N.var2[11]] = VASA;
        nArray[N.var2[12]] = VANGUARDS;
        nArray[N.var2[13]] = MYSTICS;
        nArray[N.var2[14]] = UNKNOWN_COMBAT;
        nArray[N.var2[15]] = CRABS;
        nArray[N.var2[16]] = ICE_DEMON;
        nArray[N.var2[17]] = TIGHTROPE;
        nArray[N.var2[18]] = THIEVING;
        nArray[N.var2[19]] = UNKNOWN_PUZZLE;
        $VALUES = nArray;
    }
}

