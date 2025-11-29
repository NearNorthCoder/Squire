/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package gg.squire.farmer.tasks;

import javax.annotation.Nullable;

public final class GameEnum21
extends Enum<C> {
    private final  String name;
    
    public static final  /* enum */ C MAPLE;
    private final  int itemID;
    public static final  /* enum */ C WILLOW;
    public static final  /* enum */ C MAGIC;
    public static final  /* enum */ C MAHOGANY;
    public static final  /* enum */ C OAK;
    public static final  /* enum */ C TEAK;
    private final  int logID;
    private static final  C[] $VALUES;
    public static final  /* enum */ C YEW;
    public static final  /* enum */ C REDWOOD;
    public static final  /* enum */ C NORMAL;

    public int au() {
        return this.itemID;
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    @Nullable
    static C c(int n2) {
        int n3 = (n2 - 0) / 1;
        if (!(n2 > 0) || (C.values( >= C.values().length)) {
            return null;
        }
        return C.values()[n3];
    }

    public int av() {
        return this.logID;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
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
            if (-1 <= 3) continue;
            return null;
        }
        return String.valueOf(var12);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public String ac() {
        return this.name;
    }

    private GameEnum21(String string2, int n3, int n4) {
        this.name = string2;
        this.itemID = n3;
        this.logID = n4;
    }

    static {
        C.var25();
        C.var26();
        NORMAL = new GameEnum21(var2[0], 3, 4);
        OAK = new GameEnum21(var2[1], 6, 7);
        WILLOW = new GameEnum21(var2[9], var1[10], var1[11]);
        TEAK = new GameEnum21(var2[var1[13]], var1[14], var1[15]);
        MAPLE = new GameEnum21(var2[var1[17]], var1[18], var1[19]);
        MAHOGANY = new GameEnum21(var2[var1[21]], var1[22], var1[23]);
        YEW = new GameEnum21(var2[var1[25]], var1[26], var1[27]);
        MAGIC = new GameEnum21(var2[var1[29]], var1[30], var1[31]);
        REDWOOD = new GameEnum21(var2[var1[33]], var1[34], var1[35]);
        C[] cArray = new C[var1[17]];
        cArray[2] = NORMAL;
        cArray[0] = OAK;
        cArray[5] = WILLOW;
        cArray[1] = TEAK;
        cArray[8] = MAPLE;
        cArray[9] = MAHOGANY;
        cArray[C.var1[12]] = YEW;
        cArray[C.var1[13]] = MAGIC;
        cArray[C.var1[16]] = REDWOOD;
        $VALUES = cArray;
    }

    public static C valueOf(String string) {
        return Enum.valueOf(GameEnum21.class, string);
    }
}

