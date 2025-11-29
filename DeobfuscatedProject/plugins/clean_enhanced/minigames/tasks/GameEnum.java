/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.GameEnum2;
import gg.squire.minigames.tasks.CHelper;
import gg.squire.minigames.tasks.GameEnum4;

public final class GameEnum
extends Enum<b> {
    private static final  b[] $VALUES;
    private final  d prayerPriority;
    public static final  /* enum */ b RANGER;
    public static final  /* enum */ b JAD;
    public static final  /* enum */ b MELEER;
    private final  int[] npcID;
    private final  int attackSpeedInTicks;
    
    public static final  /* enum */ b BLOB;
    public static final  /* enum */ b HEALER;
    public static final  /* enum */ b BAT;
    private final  a attackStyle;
    
    public static final  /* enum */ b MAGER;
    public static final  /* enum */ b SMALL_BLOB;
    private final  String name;

    public int e() {
        return this.attackSpeedInTicks;
    }

    public a GameEnum() {
        return this.attackStyle;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(int n2) {
        void var3;
        b[] bArray = b.values();
        int n4 = bArray.length;
        int var4 = 0;
        while ((var4 < (int)var3)) {
            int var5;
            void var6;
            void var7 = var6[var4];
            if ((Arrays.stream(var7.c( != 0)).anyMatch(n3 -> {
                boolean bl;
                if (var5 == var5) {
                    bl = 1;
                    0;
                    if (2 != 2) {
                        return ((0xC3 ^ 0xBF ^ (0x1B ^ 0x23)) & (0x8A ^ 0xB9 ^ (0x67 ^ 0x10) ^ -1)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            }) ? 1 : 0)) {
                return var7;
            }
            ++var4;
            0;
            if ((0x63 ^ 0x67) > 0) continue;
            return null;
        }
        return null;
    }

    public String d() {
        return this.name;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = 0;
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = 0;
        while (var22 < var21) {
            char var23 = var20[var22];
            var17.append((char)(var23 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (-(0x1E ^ 0x1A) <= 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    public d f() {
        return this.prayerPriority;
    }

    private GameEnum(int[] nArray, String string2, int n3, d d2, a a2) {
        this.npcID = nArray;
        this.name = string2;
        this.attackSpeedInTicks = n3;
        this.prayerPriority = d2;
        this.attackStyle = a2;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    public int[] c() {
        return this.npcID;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    static {
        b.var30();
        b.var31();
        BAT = new GameEnum(c.p, var1[1], 2, d.VERY_LOW, a.MELEE);
        BLOB = new GameEnum(c.q, var1[4], 2, d.LOW, a.MELEE);
        SMALL_BLOB = new GameEnum(c.r, var1[5], 2, d.VERY_LOW, a.MELEE);
        RANGER = new GameEnum(c.s, var1[7], 2, d.HIGH, a.RANGED);
        MELEER = new GameEnum(c.t, var1[9], 2, d.MEDIUM, a.MELEE);
        MAGER = new GameEnum(c.u, var1[var2[11]], 2, d.VERY_HIGH, a.MAGIC);
        JAD = new GameEnum(c.v, var1[var2[13]], 8, d.VERY_HIGH, a.MIXED);
        HEALER = new GameEnum(c.w, var1[var2[15]], 2, d.VERY_LOW, a.MELEE);
        b[] bArray = new b[8];
        bArray[0] = BAT;
        bArray[1] = BLOB;
        bArray[3] = SMALL_BLOB;
        bArray[4] = RANGER;
        bArray[2] = MELEER;
        bArray[5] = MAGER;
        bArray[6] = JAD;
        bArray[7] = HEALER;
        $VALUES = bArray;
    }
}

