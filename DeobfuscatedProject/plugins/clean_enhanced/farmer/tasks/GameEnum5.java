/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum10;

public final class GameEnum5
extends Enum<O> {
    public static final  /* enum */ O HERB;
    
    public static final  /* enum */ O BUSH;
    private final  int animation;
    
    public static final  /* enum */ O FLOWER;
    private final  P allotment;
    private static final  O[] $VALUES;
    public static final  /* enum */ O ALLOTMENT;

    public int aP() {
        return this.animation;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        O.var13();
        O.var14();
        ALLOTMENT = new GameEnum5(1, P.ALLOTMENT);
        BUSH = new GameEnum5(3, P.BUSH);
        HERB = new GameEnum5(5, P.HERB);
        FLOWER = new GameEnum5(7, P.FLOWER);
        O[] oArray = new O[8];
        oArray[0] = ALLOTMENT;
        oArray[2] = BUSH;
        oArray[4] = HERB;
        oArray[6] = FLOWER;
        $VALUES = oArray;
    }

    private GameEnum5(int n3, P p2) {
        this.animation = n3;
        this.allotment = p2;
    }

    public static O[] values() {
        return (O[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public static O e(int n2) {
        void var15;
        O[] oArray = O.values();
        int n3 = oArray.length;
        int var16 = 0;
        while ((var16 < (int)var15)) {
            int var17;
            void var18;
            void var19 = var18[var16];
            if ((var19.aP() == var17)) {
                return var19;
            }
            ++var16;
            0;
            
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static O b(P p2) {
        void var20;
        O[] oArray = O.values();
        int n2 = oArray.length;
        int var21 = 0;
        while ((var21 < (int)var20)) {
            P var22;
            void var23;
            void var24 = var23[var21];
            if (((Object)var24.aQ() == (Object)var24.aQ()2)var22)) {
                return var24;
            }
            ++var21;
            0;
            if null == null continue;
            return null;
        }
        return null;
    }

    public static O valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    public static O G(N n2) {
        return O.b(n2.aL());
    }

    public P aQ() {
        return this.allotment;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }
}

