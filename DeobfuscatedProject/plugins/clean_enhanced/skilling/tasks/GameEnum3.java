/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum3
extends Enum<q> {
    private final  int weedAmount;
    private static final  q[] $VALUES;
    
    public static final  /* enum */ q SODA_ASH;
    private final  int bucketAmount;
    
    public static final  /* enum */ q NORMAL_SEAWEED;
    private final  int itemId;
    public static final  /* enum */ q GIANT_SEAWEED;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private static void var4() {
        var2 = new int[9];
        q.var2[0] = (0x16 ^ 0x45) & ~(0x11 ^ 0x42);
        q.var2[1] = 0xFFFFF78F & 0x5C70;
        q.var2[2] = 3;
        q.var2[3] = 0x99 ^ 0x8B;
        q.var2[4] = 1;
        q.var2[5] = 0xFFFFDDF3 & 0x239D;
        q.var2[6] = 0xEF ^ 0x8E ^ (0xFA ^ 0x96);
        q.var2[7] = 2;
        q.var2[8] = -(0xFFFFB9C7 & 0x7F39) & (0xFFFFBFFD & 0x7FF7);
    }

    private GameEnum3(int n3, int n4, int n5) {
        this.itemId = n3;
        this.weedAmount = n4;
        this.bucketAmount = n5;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (q.var3(var13, var12)) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public int P() {
        return this.bucketAmount;
    }

    private static void var15() {
        var1 = new String[var2[2]];
        q.var1[q.var2[0]] = "GIANT_SEAWEED";
        q.var1[q.var2[4]] = "NORMAL_SEAWEED";
        q.var1[q.var2[7]] = "SODA_ASH";
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    static {
        q.var4();
        q.var15();
        GIANT_SEAWEED = new GameEnum3(var2[1], var2[2], var2[3]);
        NORMAL_SEAWEED = new GameEnum3(var2[5], var2[6], var2[6]);
        SODA_ASH = new GameEnum3(var2[8], var2[6], var2[6]);
        q[] qArray = new q[var2[2]];
        qArray[q.var2[0]] = GIANT_SEAWEED;
        qArray[q.var2[4]] = NORMAL_SEAWEED;
        qArray[q.var2[7]] = SODA_ASH;
        $VALUES = qArray;
    }

    public int N() {
        return this.itemId;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public int O() {
        return this.weedAmount;
    }
}

