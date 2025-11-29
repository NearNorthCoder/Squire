/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

public final class GameEnum16
extends Enum<m> {
    public static final  /* enum */ m UNOWNED;
    public static final  /* enum */ m OFF;
    private static final  m[] $VALUES;
    
    public static final  /* enum */ m ON;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    static {
        m.var15();
        m.var16();
        UNOWNED = new GameEnum16();
        OFF = new GameEnum16();
        ON = new GameEnum16();
        m[] mArray = new m[3];
        mArray[0] = UNOWNED;
        mArray[1] = OFF;
        mArray[2] = ON;
        $VALUES = mArray;
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
            if null == null continue;
            return null;
        }
        return String.valueOf(var20);
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum16.class, string);
    }
}

