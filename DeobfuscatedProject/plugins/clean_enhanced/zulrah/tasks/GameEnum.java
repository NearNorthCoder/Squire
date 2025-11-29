/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

public final class GameEnum
extends Enum<n> {
    
    public static final  /* enum */ n EAST;
    public static final  /* enum */ n NORTH_WEST;
    private final  int x;
    public static final  /* enum */ n WEST;
    public static final  /* enum */ n CENTER_WEST;
    private final  int y;
    public static final  /* enum */ n NORTH_EAST;
    public static final  /* enum */ n CENTER;
    
    private static final  n[] $VALUES;
    public static final  /* enum */ n CENTER_EAST;

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        n.var9();
        n.var10();
        NORTH_EAST = new GameEnum(1, 2);
        NORTH_WEST = new GameEnum(4, 5);
        WEST = new GameEnum(4, 7);
        EAST = new GameEnum(7, 7);
        CENTER_WEST = new GameEnum(4, 3);
        CENTER_EAST = new GameEnum(7, 3);
        CENTER = new GameEnum(0, 0);
        n[] nArray = new n[var1[10]];
        nArray[0] = NORTH_EAST;
        nArray[3] = NORTH_WEST;
        nArray[6] = WEST;
        nArray[8] = EAST;
        nArray[7] = CENTER_WEST;
        nArray[9] = CENTER_EAST;
        nArray[1] = CENTER;
        $VALUES = nArray;
    }

    public int H() {
        return this.y;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = 0;
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = 0;
        while (var25 < var24) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private GameEnum(int n3, int n4) {
        this.x = n3;
        this.y = n4;
    }

    public int G() {
        return this.x;
    }

}

