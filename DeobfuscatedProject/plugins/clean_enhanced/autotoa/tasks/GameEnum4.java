/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 */
package gg.squire.autotoa.tasks;

import java.util.List;
import java.util.Set;
import net.runelite.api.Point;

public final class GameEnum4
extends Enum<o> {
    
    public static final  /* enum */ o DEATH;
    public static final  /* enum */ o LIGHTNING;
    
    public static final  /* enum */ o FIRE;
    private static final  o[] $VALUES;
    private final  Set<Point> attack;
    public static final  /* enum */ o AIR;
    private final  List<Point> clockwise;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    public Set<Point> N() {
        return this.attack;
    }

    private GameEnum4(List<Point> list, Set<Point> set) {
        this.clockwise = list;
        this.attack = set;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (o.var3(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    static {
        o.var14();
        o.var15();
        DEATH = new GameEnum4(List.of(new Point(var2[1], var2[2]), new Point(var2[2], var2[1]), new Point(var2[1], var2[3]), new Point(var2[4], var2[5])), Set.of(new Point(var2[1], var2[3]), new Point(var2[1], var2[2])));
        LIGHTNING = new GameEnum4(List.of(new Point(var2[2], var2[7]), new Point(var2[1], var2[8]), new Point(var2[4], var2[9]), new Point(var2[1], var2[10])), Set.of(new Point(var2[1], var2[8]), new Point(var2[1], var2[10])));
        FIRE = new GameEnum4(List.of(new Point(var2[12], var2[1]), new Point(var2[13], var2[3]), new Point(var2[3], var2[5]), new Point(var2[13], var2[2])), Set.of(new Point(var2[13], var2[3]), new Point(var2[13], var2[2])));
        AIR = new GameEnum4(List.of(new Point(var2[12], var2[7]), new Point(var2[13], var2[8]), new Point(var2[3], var2[9]), new Point(var2[13], var2[10])), Set.of(new Point(var2[13], var2[8]), new Point(var2[13], var2[10])));
        o[] oArray = new o[var2[15]];
        oArray[o.var2[0]] = DEATH;
        oArray[o.var2[6]] = LIGHTNING;
        oArray[o.var2[11]] = FIRE;
        oArray[o.var2[14]] = AIR;
        $VALUES = oArray;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var14() {
        var2 = new int[17];
        o.var2[0] = (0x6E ^ 0x7F ^ (0x5D ^ 0x6A)) & (0x6A ^ 0x4F ^ 3 ^ -1);
        o.var2[1] = 0x60 ^ 0x6D ^ (0x6F ^ 0x46);
        o.var2[2] = 0x38 ^ 0x1F;
        o.var2[3] = 0xE6 ^ 0xA2 ^ (0x45 ^ 0x21);
        o.var2[4] = 0x2B ^ 0xA;
        o.var2[5] = 0x61 ^ 0x42;
        o.var2[6] = 1;
        o.var2[7] = 0x35 ^ 0x2E;
        o.var2[8] = 0x59 ^ 0x64 ^ (0x7F ^ 0x5D);
        o.var2[9] = 0xB9 ^ 0xB7 ^ (0x60 ^ 0x72);
        o.var2[10] = 0xAD ^ 0xB8 ^ (0x81 ^ 0x8C);
        o.var2[11] = 2;
        o.var2[12] = 0x63 ^ 0x79;
        o.var2[13] = 0x89 ^ 0x94;
        o.var2[14] = 3;
        o.var2[15] = 18 + 195 - 69 + 52 ^ 18 + 124 - -36 + 14;
        o.var2[16] = 0xDD ^ 0x87 ^ (0xC0 ^ 0x92);
    }

    private static void var15() {
        var1 = new String[var2[15]];
        o.var1[o.var2[0]] = "DEATH";
        o.var1[o.var2[6]] = "LIGHTNING";
        o.var1[o.var2[11]] = "FIRE";
        o.var1[o.var2[14]] = "AIR";
    }

    public List<Point> M() {
        return this.clockwise;
    }
}

