/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.util.Objects;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

public final class GameEnum10
extends Enum<m> {
    
    public static final  /* enum */ m DEFENSIVE;
    public static final  /* enum */ m NONE;
    private static final  m[] $VALUES;
    public static final  /* enum */ m MAGIC;
    
    public static final  /* enum */ m CONTROLLED;
    public static final  /* enum */ m ACCURATE;
    public static final  /* enum */ m AGGRESSIVE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    private static void var9() {
        var2 = new int[7];
        m.var2[0] = (120 + 119 - 130 + 47 ^ 80 + 73 - 58 + 48) & (0x4C ^ 0x29 ^ (0x6D ^ 0x1B) ^ -1);
        m.var2[1] = 1;
        m.var2[2] = 2;
        m.var2[3] = 3;
        m.var2[4] = 55 + 7 - 61 + 137 ^ 82 + 89 - 127 + 98;
        m.var2[5] = 0x80 ^ 0x85;
        m.var2[6] = 0xAE ^ 0xA8;
    }

    public boolean bk() {
        boolean bl;
        m[] mArray = new m[var2[1]];
        mArray[m.var2[0]] = this;
        if (m.var10(p.a(mArray).isEmpty() ? 1 : 0)) {
            bl = var2[1];
            0;
            if (3 <= 0) {
                return ((0xC ^ 0x4C ^ (0x17 ^ 0x11)) & (0xE0 ^ 0xA9 ^ (0x6D ^ 0x62) ^ -1)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static void var12() {
        var1 = new String[var2[6]];
        m.var1[m.var2[0]] = "ACCURATE";
        m.var1[m.var2[1]] = "AGGRESSIVE";
        m.var1[m.var2[2]] = "CONTROLLED";
        m.var1[m.var2[3]] = "DEFENSIVE";
        m.var1[m.var2[4]] = "MAGIC";
        m.var1[m.var2[5]] = "NONE";
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var2[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var2[0];
        while (m.var11(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (3 > 2) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (m.var23(o2)) {
            return var2[0];
        }
        return Objects.equals((Object)o2.bn(), (Object)this);
    }

    private static boolean var23(Object object) {
        return object == null;
    }

    static {
        m.var9();
        m.var12();
        ACCURATE = new GameEnum10();
        AGGRESSIVE = new GameEnum10();
        CONTROLLED = new GameEnum10();
        DEFENSIVE = new GameEnum10();
        MAGIC = new GameEnum10();
        NONE = new GameEnum10();
        m[] mArray = new m[var2[6]];
        mArray[m.var2[0]] = ACCURATE;
        mArray[m.var2[1]] = AGGRESSIVE;
        mArray[m.var2[2]] = CONTROLLED;
        mArray[m.var2[3]] = DEFENSIVE;
        mArray[m.var2[4]] = MAGIC;
        mArray[m.var2[5]] = NONE;
        $VALUES = mArray;
    }
}

