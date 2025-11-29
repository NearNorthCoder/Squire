/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.zulrah.tasks;

public final class GameEnum3
extends Enum<q> {
    
    private static final  q[] $VALUES;
    private final  int quantity;
    public static final  /* enum */ q CHARTER_SHIP;
    public static final  /* enum */ q ZUL_ANDRA_TELEPORT;
    
    private final  int[] items;
    public static final  /* enum */ q FAIRY_RING;

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    public int[] K() {
        return this.items;
    }

    static {
        q.var3();
        q.var4();
        int[] nArray = new int[1];
        nArray[0] = 2;
        ZUL_ANDRA_TELEPORT = new GameEnum3(1, nArray);
        int[] nArray2 = new int[3];
        nArray2[0] = 4;
        nArray2[1] = 5;
        FAIRY_RING = new GameEnum3(1, nArray2);
        int[] nArray3 = new int[1];
        nArray3[0] = 7;
        CHARTER_SHIP = new GameEnum3(6, nArray3);
        q[] qArray = new q[8];
        qArray[0] = ZUL_ANDRA_TELEPORT;
        qArray[1] = FAIRY_RING;
        qArray[3] = CHARTER_SHIP;
        $VALUES = qArray;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private GameEnum3(int n3, int ... nArray) {
        this.quantity = n3;
        this.items = nArray;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public int J() {
        return this.quantity;
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
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }
}

