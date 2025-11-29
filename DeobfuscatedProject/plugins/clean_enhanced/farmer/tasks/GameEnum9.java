/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

public final class GameEnum9
extends Enum<B> {
    private static final  B[] $VALUES;
    public static final  /* enum */ B EMPTY;
    public static final  /* enum */ B COMPLETED;
    
    public static final  /* enum */ B IN_PROGRESS;
    public static final  /* enum */ B OCCUPIED;
    public static final  /* enum */ B UNKNOWN;

    public static B[] values() {
        return (B[])$VALUES.clone();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    static {
        B.var15();
        B.var16();
        COMPLETED = new GameEnum9();
        IN_PROGRESS = new GameEnum9();
        OCCUPIED = new GameEnum9();
        EMPTY = new GameEnum9();
        UNKNOWN = new GameEnum9();
        B[] bArray = new B[5];
        bArray[0] = COMPLETED;
        bArray[1] = IN_PROGRESS;
        bArray[2] = OCCUPIED;
        bArray[3] = EMPTY;
        bArray[4] = UNKNOWN;
        $VALUES = bArray;
    }

    public static B valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
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
            if (((0x28 ^ 0x65 ^ 1) & (0xFC ^ 0x9C ^ (0x76 ^ 0x5A) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

}

