/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.QHelper;

public final class GameEnum4
extends Enum<P> {
    private static final  P[] $VALUES;
    private final  String name;
    public static final  /* enum */ P EMPTY;
    
    public static final  /* enum */ P PUZZLE;
    private final  char code;
    public static final  /* enum */ P START;
    public static final  /* enum */ P FARMING;
    public static final  /* enum */ P COMBAT;
    
    public static final  /* enum */ P END;
    public static final  /* enum */ P SCAVENGERS;

    static {
        P.var3();
        P.var4();
        START = new GameEnum4(var1[1], 2);
        END = new GameEnum4(var1[4], 5);
        SCAVENGERS = new GameEnum4(var1[7], 8);
        FARMING = new GameEnum4(var1[var2[10]], var2[11]);
        EMPTY = new GameEnum4(var1[var2[13]], var2[14]);
        COMBAT = new GameEnum4(var1[var2[16]], var2[17]);
        PUZZLE = new GameEnum4(var1[var2[19]], var2[20]);
        P[] pArray = new P[var2[10]];
        pArray[0] = START;
        pArray[1] = END;
        pArray[3] = SCAVENGERS;
        pArray[4] = FARMING;
        pArray[6] = EMPTY;
        pArray[7] = COMBAT;
        pArray[9] = PUZZLE;
        $VALUES = pArray;
    }

    public N ce() {
        switch (Q.cm[this.ordinal()]) {
            case 1: {
                return N.START;
            }
            case 2: {
                return N.END;
            }
            case 3: {
                return N.SCAVENGERS;
            }
            case 4: {
                return N.FARMING;
            }
            case 5: {
                return N.UNKNOWN_COMBAT;
            }
            case 6: {
                return N.UNKNOWN_PUZZLE;
            }
        }
        return N.EMPTY;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

    /*
     * WARNING - void declaration
     */
    public static P c(char c2) {
        void var21;
        P[] pArray = P.values();
        int n2 = pArray.length;
        int var22 = 0;
        while ((var22 < (int)var21)) {
            char var23;
            void var24;
            void var25 = var24[var22];
            if ((var25.cf() == var23)) {
                return var25;
            }
            ++var22;
            0;
            if (((0x1A ^ 0x46 ^ (0xDC ^ 0x92)) & (0xF8 ^ 0xC4 ^ (0xAE ^ 0x80) ^ -1)) == (1 & (1 ^ -1))) continue;
            return null;
        }
        return EMPTY;
    }

    public static P valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public char cf() {
        return this.code;
    }

    public String bX() {
        return this.name;
    }

    private GameEnum4(String string2, char c2) {
        this.name = string2;
        this.code = c2;
    }

    public static P[] values() {
        return (P[])$VALUES.clone();
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

