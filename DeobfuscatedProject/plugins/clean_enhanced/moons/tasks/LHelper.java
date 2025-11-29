/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.moons.tasks;

import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;

public class LHelper {
    public static final  ThreadLocalRandom av;

    /*
     * WARNING - void declaration
     */
    public static boolean LHelper() {
        int var2;
        void var3;
        int n = Skills.getLevel((SkiSkill.HERBLORE);
        int n2 = Skills.getLevel((SkiSkill.ATTACK);
        int n3 = var1[1];
        if (l.var4(n, var1[2])) {
            n3 = (int)((double)n2 * 0.1) + var1[3];
            0;
            if (-(0xD8 ^ 0xB2 ^ (0xC7 ^ 0xA8)) >= 0) {
                return ((0x25 ^ 0x69 ^ (0xCC ^ 0xB0)) & (0xF0 ^ 0x95 ^ (0x33 ^ 0x66) ^ -1)) != 0;
            }
        } else if (l.var5((int)var3, var1[2]) && l.var4((int)var3, var1[4])) {
            void var6;
            var2 = (int)((double)var6 * 0.15) + var1[5];
        }
        if (l.var5((int)var3, var1[4]) && l.var7(Vars.getBit((int)var1[6]), var1[5])) {
            return var1[0];
        }
        if (l.var7(Skills.getBoostedLevel((SkiSkill.ATTACK), Skills.getLevel((SkiSkill.ATTACK) + var2 - var1[7])) {
            return var1[0];
        }
        return var1[1];
    }

    private static boolean var8(int n) {
        return n == 0;
    }

    public static double k() {
        double d2 = Skills.getBoostedLevel((SkiSkill.HITPOINTS);
        double d3 = Skills.getLevel((SkiSkill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    private static boolean var5(int n, int n2) {
        return n >= n2;
    }

    static {
        l.var9();
        av = ThreadLocalRandom.current();
    }

    private static boolean var4(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public static int a(int n, int n2) {
        void var10;
        int var11;
        int var12;
        int n3 = n2 - n;
        if (l.var8(n3)) {
            return var12;
        }
        if (l.var13(Math.abs(var11), var1[0])) {
            int n4;
            if (l.var14(av.nextBoolean() ? 1 : 0)) {
                n4 = var12;
                0;
                if (-(0x30 ^ 0x35) >= 0) {
                    return (0x51 ^ 0x60) & ~(0x83 ^ 0xB2);
                }
            } else {
                n4 = var10;
            }
            return n4;
        }
        if (l.var15(var11)) {
            var11 = var12;
            var12 = var10;
            n2 = var11;
        }
        return n + av.nextInt(n2 - n + var1[0]);
    }

    private static boolean var13(int n, int n2) {
        return n == n2;
    }

    private static boolean var15(int n) {
        return n < 0;
    }

    private static boolean var7(int n, int n2) {
        return n <= n2;
    }

    private static boolean var14(int n) {
        return n != 0;
    }

    private static void var9() {
        var1 = new int[8];
        l.var1[0] = 1;
        l.var1[1] = (3 ^ (0x4E ^ 0x6E)) & (0x2A ^ 0x35 ^ (0x76 ^ 0x4A) ^ -1);
        l.var1[2] = 9 ^ 0x24;
        l.var1[3] = 3;
        l.var1[4] = 2 ^ 0x5E ^ (0x36 ^ 0x2C);
        l.var1[5] = 0xAF ^ 0xAA;
        l.var1[6] = 0xFFFFEEFF & 0x31EF;
        l.var1[7] = 44 + 193 - 107 + 66 ^ 5 + 132 - 58 + 113;
    }
}

