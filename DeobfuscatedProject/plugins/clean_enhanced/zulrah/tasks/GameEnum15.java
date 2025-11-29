/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

public final class GameEnum15
extends Enum<p> {
    public static final  /* enum */ p WEST;
    
    public static final  /* enum */ p EAST;
    public static final  /* enum */ p SOUTH;
    private final  int y;
    
    private final  int x;
    public static final  /* enum */ p CENTER;
    private static final  p[] $VALUES;

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private GameEnum15(int n3, int n4) {
        this.x = n3;
        this.y = n4;
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
        p.var13();
        p.var14();
        EAST = new GameEnum15(1, 2);
        WEST = new GameEnum15(4, 2);
        CENTER = new GameEnum15(0, 6);
        SOUTH = new GameEnum15(0, 8);
        p[] pArray = new p[9];
        pArray[0] = EAST;
        pArray[3] = WEST;
        pArray[5] = CENTER;
        pArray[7] = SOUTH;
        $VALUES = pArray;
    }

    public int H() {
        return this.y;
    }

    public int G() {
        return this.x;
    }

    public static p valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }
}

