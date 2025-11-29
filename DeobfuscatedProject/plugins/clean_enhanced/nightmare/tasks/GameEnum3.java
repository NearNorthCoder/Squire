/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.util.Objects;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

public final class GameEnum3
extends Enum<n> {
    private static final  n[] $VALUES;
    public static final  /* enum */ n CRUSH;
    public static final  /* enum */ n EMITS_A_JET_OF_FLAME;
    public static final  /* enum */ n SPELLCASTING;
    
    public static final  /* enum */ n STAB;
    public static final  /* enum */ n NONE;
    public static final  /* enum */ n SLASH;
    public static final  /* enum */ n MAGIC;
    
    public static final  /* enum */ n DEFENSIVE_CASTING;
    public static final  /* enum */ n RANGED;
    public static final  /* enum */ n FIRES_AN_EXPLOSIVE_ROUND;

    private static void var3() {
        var1 = new int[11];
        n.var1[0] = (0x9A ^ 0x87) & ~(0xB3 ^ 0xAE);
        n.var1[1] = 1;
        n.var1[2] = 2;
        n.var1[3] = 3;
        n.var1[4] = 0x67 ^ 0x63;
        n.var1[5] = 118 + 30 - 130 + 153 ^ 81 + 90 - 42 + 45;
        n.var1[6] = 0x31 ^ 0x37;
        n.var1[7] = 0x5C ^ 0x48 ^ (0x92 ^ 0x81);
        n.var1[8] = 0 ^ 8;
        n.var1[9] = 0x13 ^ 0x5E ^ (0xCE ^ 0x8A);
        n.var1[10] = 116 + 145 - 127 + 34 ^ 151 + 6 - 153 + 158;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (n.var4(o2)) {
            return var1[0];
        }
        return Objects.equals((Object)o2.bm(), (Object)this);
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    public boolean bk() {
        boolean bl;
        n[] nArray = new n[var1[1]];
        nArray[n.var1[0]] = this;
        if (n.var5(p.a(nArray).isEmpty() ? 1 : 0)) {
            bl = var1[1];
            0;
            if (((0x26 ^ 0x1D) & ~(0x59 ^ 0x62)) == 3) {
                return ((0x39 ^ 0x14) & ~(0xBC ^ 0x91)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static void var6() {
        var2 = new String[var1[10]];
        n.var2[n.var1[0]] = "CRUSH";
        n.var2[n.var1[1]] = "DEFENSIVE_CASTING";
        n.var2[n.var1[2]] = "EMITS_A_JET_OF_FLAME";
        n.var2[n.var1[3]] = "FIRES_AN_EXPLOSIVE_ROUND";
        n.var2[n.var1[4]] = "MAGIC";
        n.var2[n.var1[5]] = "NONE";
        n.var2[n.var1[6]] = "RANGED";
        n.var2[n.var1[7]] = "SLASH";
        n.var2[n.var1[8]] = "SPELLCASTING";
        n.var2[n.var1[9]] = "STAB";
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (n.var16(var15, var14)) {
            char var17 = var13[var15];
            var10.append((char)(var17 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    static {
        n.var3();
        n.var6();
        CRUSH = new GameEnum3();
        DEFENSIVE_CASTING = new GameEnum3();
        EMITS_A_JET_OF_FLAME = new GameEnum3();
        FIRES_AN_EXPLOSIVE_ROUND = new GameEnum3();
        MAGIC = new GameEnum3();
        NONE = new GameEnum3();
        RANGED = new GameEnum3();
        SLASH = new GameEnum3();
        SPELLCASTING = new GameEnum3();
        STAB = new GameEnum3();
        n[] nArray = new n[var1[10]];
        nArray[n.var1[0]] = CRUSH;
        nArray[n.var1[1]] = DEFENSIVE_CASTING;
        nArray[n.var1[2]] = EMITS_A_JET_OF_FLAME;
        nArray[n.var1[3]] = FIRES_AN_EXPLOSIVE_ROUND;
        nArray[n.var1[4]] = MAGIC;
        nArray[n.var1[5]] = NONE;
        nArray[n.var1[6]] = RANGED;
        nArray[n.var1[7]] = SLASH;
        nArray[n.var1[8]] = SPELLCASTING;
        nArray[n.var1[9]] = STAB;
        $VALUES = nArray;
    }
}

