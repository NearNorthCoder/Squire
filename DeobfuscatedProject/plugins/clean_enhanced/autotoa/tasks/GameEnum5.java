/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 */
package gg.squire.autotoa.tasks;

import java.util.List;
import net.runelite.api.Point;

public final class GameEnum5
extends Enum<q> {

    private final  List<Point> boulders;
    private final  Point stand;
    private static final  q[] $VALUES;
    public static final  /* enum */ q FIRST;
    public static final  /* enum */ q THIRD;
    public static final  /* enum */ q FOURTH;
    private final  Point jug;
    public static final  /* enum */ q SECOND;
    public static final  /* enum */ q FIFTH;

    public static q valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new int[18];
        q.var1[0] = (0xED ^ 0x8B ^ (0x5B ^ 0x25)) & (0x78 ^ 0x55 ^ (0x6E ^ 0x5B) ^ -1);
        q.var1[1] = 93 + 93 - 184 + 161 ^ 178 + 20 - 55 + 43;
        q.var1[2] = 88 + 79 - 59 + 34 ^ 137 + 48 - 91 + 50;
        q.var1[3] = 0xAF ^ 0xA9 ^ (0xD9 ^ 0xC0);
        q.var1[4] = 30 + 46 - -67 + 37 ^ 13 + 47 - -64 + 48;
        q.var1[5] = 0xB7 ^ 0x97;
        q.var1[6] = 1;
        q.var1[7] = 0xDF ^ 0xBC ^ (0x1C ^ 0x5E);
        q.var1[8] = 2;
        q.var1[9] = 0x62 ^ 0x59 ^ (0x39 ^ 0x15);
        q.var1[10] = 0x31 ^ 0x2A;
        q.var1[11] = 0xEA ^ 0x86 ^ (0xF0 ^ 0x86);
        q.var1[12] = 3;
        q.var1[13] = 0xA8 ^ 0xC3 ^ (0xD4 ^ 0xBA);
        q.var1[14] = 0xB1 ^ 0xB5;
        q.var1[15] = 0x21 ^ 3;
        q.var1[16] = 0xA0 ^ 0x83;
        q.var1[17] = 0x27 ^ 0x48 ^ (0x3F ^ 0x58);
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum5(List<Point> list, Point point, Point point2) {
        this.boulders = list;
        this.jug = point;
        this.stand = point2;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (q.var10(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void var21() {
        var2 = new String[var1[13]];
        q.var2[q.var1[0]] = "FIRST";
        q.var2[q.var1[6]] = "SECOND";
        q.var2[q.var1[8]] = "THIRD";
        q.var2[q.var1[12]] = "FOURTH";
        q.var2[q.var1[14]] = "FIFTH";
    }

    static {
        q.var9();
        q.var21();
        FIRST = new GameEnum5(List.of(new Point(var1[1], var1[2]), new Point(var1[1], var1[3]), new Point(var1[4], var1[5])), new Point(var1[6], var1[6]), new Point(var1[6], var1[6]));
        SECOND = new GameEnum5(List.of(new Point(var1[1], var1[3]), new Point(var1[4], var1[5]), new Point(var1[1], var1[7])), new Point(var1[6], var1[6]), new Point(var1[6], var1[6]));
        THIRD = new GameEnum5(List.of(new Point(var1[4], var1[3]), new Point(var1[1], var1[5]), new Point(var1[9], var1[7])), new Point(var1[1], var1[10]), new Point(var1[1], var1[11]));
        FOURTH = new GameEnum5(List.of(new Point(var1[9], var1[5]), new Point(var1[9], var1[7])), new Point(var1[6], var1[6]), new Point(var1[1], var1[13]));
        FIFTH = new GameEnum5(List.of(new Point(var1[9], var1[7]), new Point(var1[9], var1[15]), new Point(var1[9], var1[16])), new Point(var1[6], var1[6]), new Point(var1[6], var1[6]));
        q[] qArray = new q[var1[13]];
        qArray[q.var1[0]] = FIRST;
        qArray[q.var1[6]] = SECOND;
        qArray[q.var1[8]] = THIRD;
        qArray[q.var1[12]] = FOURTH;
        qArray[q.var1[14]] = FIFTH;
        $VALUES = qArray;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

