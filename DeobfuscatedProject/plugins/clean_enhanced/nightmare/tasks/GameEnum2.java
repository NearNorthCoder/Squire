/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

public final class GameEnum2
extends Enum<t> {
    public static final  /* enum */ t NONE;
    private static final  t[] $VALUES;

    public static final  /* enum */ t GOBLIN_PAINT_CANNON;
    public static final  /* enum */ t HAM_JOINT;
    private final  int itemID;

    public int bH() {
        return this.itemID;
    }

    public static t valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    private static void var3() {
        var1 = new int[8];
        t.var1[0] = 1 & ~1;
        t.var1[1] = -(0xFFFFCC87 & 0x7F79) & (0xFFFFFDB7 & Short.MAX_VALUE);
        t.var1[2] = 1;
        t.var1[3] = 0xFFFFDB76 & 0x7FC9;
        t.var1[4] = 2;
        t.var1[5] = -1;
        t.var1[6] = 3;
        t.var1[7] = 3 ^ (0x2C ^ 0x27);
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private GameEnum2(int n3) {
        this.itemID = n3;
    }

    private static void var16() {
        var2 = new String[var1[6]];
        t.var2[t.var1[0]] = "GOBLIN_PAINT_CANNON";
        t.var2[t.var1[2]] = "HAM_JOINT";
        t.var2[t.var1[4]] = "NONE";
    }

    static {
        t.var3();
        t.var16();
        GOBLIN_PAINT_CANNON = new GameEnum2(var1[1]);
        HAM_JOINT = new GameEnum2(var1[3]);
        NONE = new GameEnum2(var1[5]);
        t[] tArray = new t[var1[6]];
        tArray[t.var1[0]] = GOBLIN_PAINT_CANNON;
        tArray[t.var1[2]] = HAM_JOINT;
        tArray[t.var1[4]] = NONE;
        $VALUES = tArray;
    }
}

