/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.wintertodt.tasks;

public final class GameEnum
extends Enum<c> {
    public static final  /* enum */ c STEEL;

    public static final  /* enum */ c DRAGON;
    public static final  /* enum */ c BLACK;
    public static final  /* enum */ c ADAMANT;
    private final  int ItemID;
    private final  String name;
    public static final  /* enum */ c BRONZE;
    private final  int attackLevelRequired;
    public static final  /* enum */ c RUNE;
    private final  int woodcuttingLevelRequired;
    private static final  c[] $VALUES;
    public static final  /* enum */ c MITHRIL;
    public static final  /* enum */ c IRON;

    private GameEnum(String string2, int n3, int n4, int n5) {
        this.name = string2;
        this.attackLevelRequired = n3;
        this.woodcuttingLevelRequired = n4;
        this.ItemID = n5;
    }

    static {
        c.var3();
        c.var4();
        BRONZE = new GameEnum(var2[1], 1, 1, 2);
        IRON = new GameEnum(var2[4], 1, 3, 5);
        STEEL = new GameEnum(var2[7], 8, 4, 9);
        BLACK = new GameEnum(var2[var1[10]], 8, 6, var1[11]);
        MITHRIL = new GameEnum(var2[var1[13]], var1[14], 7, var1[15]);
        ADAMANT = new GameEnum(var2[var1[17]], var1[18], 8, var1[19]);
        RUNE = new GameEnum(var2[var1[21]], var1[22], var1[10], var1[23]);
        DRAGON = new GameEnum(var2[var1[25]], var1[26], var1[12], var1[27]);
        c[] cArray = new c[var1[12]];
        cArray[0] = BRONZE;
        cArray[1] = IRON;
        cArray[3] = STEEL;
        cArray[4] = BLACK;
        cArray[6] = MITHRIL;
        cArray[7] = ADAMANT;
        cArray[8] = RUNE;
        cArray[c.var1[10]] = DRAGON;
        $VALUES = cArray;
    }

    public String v() {
        return this.name;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-1 >= -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public int y() {
        return this.ItemID;
    }

    public int w() {
        return this.attackLevelRequired;
    }

    public int x() {
        return this.woodcuttingLevelRequired;
    }
}

