/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

public final class GameEnum4
extends Enum<ao> {
    private static  String[] lIlIIIII;
    public static final  /* enum */ ao DRAGON_BONES;
    public final  int groundItemId;
    public final  int itemId;
    private static  int[] lIlIIIIl;
    private static final  ao[] $VALUES;

    private static void var1() {
        lIlIIIII = new String[lIlIIIIl[3]];
        ao.lIlIIIII[ao.lIlIIIIl[0]] = "DRAGON_BONES";
    }

    public static ao[] values() {
        return (ao[])$VALUES.clone();
    }

    private static void var2() {
        lIlIIIIl = new int[6];
        ao.lIlIIIIl[0] = (0x2F ^ 0xF) & ~(0x2D ^ 0xD);
        ao.lIlIIIIl[1] = -(0xFFFFB8E5 & 0x5F7F) & (0xFFFFBEFF & 0x5B7C);
        ao.lIlIIIIl[2] = 0xFFFFB1E5 & 0x5EBF;
        ao.lIlIIIIl[3] = 1;
        ao.lIlIIIIl[4] = 27 + 108 - -2 + 14 ^ 83 + 57 - 27 + 46;
        ao.lIlIIIIl[5] = 2;
    }

    public static ao valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    private GameEnum4(int n3, int n4) {
        this.itemId = n3;
        this.groundItemId = n4;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }
}

