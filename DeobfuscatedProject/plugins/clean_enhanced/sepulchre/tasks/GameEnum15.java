/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum15
extends Enum<s> {
    
    private static final  s[] $VALUES;
    
    public static final  /* enum */ s INTERACT;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        s.var9();
        s.var10();
        INTERACT = new GameEnum15();
        s[] sArray = new s[var1[1]];
        sArray[s.var1[0]] = INTERACT;
        $VALUES = sArray;
    }

    public static s valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }

    private static void var9() {
        var1 = new int[4];
        s.var1[0] = (106 + 123 - 121 + 66 ^ 27 + 89 - -30 + 0) & (51 + 112 - 151 + 128 ^ 107 + 143 - 175 + 101 ^ -1);
        s.var1[1] = 1;
        s.var1[2] = 0xF6 ^ 0x85 ^ (0x7B ^ 0);
        s.var1[3] = 2;
    }

    private static void var10() {
        var2 = new String[var1[1]];
        s.var2[s.var1[0]] = "INTERACT";
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }
}

