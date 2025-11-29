/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.cox.tasks;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public class RHelper {

    static {
        r.var2();
    }

    public static int a(int n2, int n3) {
        return (n2 + 5) * (n3 + 2);
    }

    public static double a(int n2, int n3, double d2, double d3, int n4, int n5) {
        double d4;
        double d5 = r.b(n2, n3, d2, d3);
        if ((r.var3(d5, d4 = (double > 0)r.a(n4, n5)))) {
            return 1.0 - (d4 + 2.0) / (2.0 * (d5 + 1.0));
        }
        return d5 / (2.0 * (d4 + 1.0));
    }

    private static int var3(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    public static int b(int n2, int n3, double d2, double d3) {
        return (int)((double)(r.b(n2, d3) * (n3 + 2)) * d2);
    }

    public static int b(int n2, double d2) {
        return (int)((double)n2 * d2) + 0 + 1;
    }

    public static int a(int n2, int n3, double d2, double d3) {
        return (r.a(n3, d3) * (n2 + 2) + 3) / 4;
    }

    public static double a(int n2, double d2, int n3, double d3, int n4, int n5, int n6) {
        int n7 = Skills.getLevel((SkiSkill.STRENGTH);
        int n8 = Skills.getLevel((SkiSkill.ATTACK);
        return r.a(n8, n3, 1.0, d3, n4, n5) * (double)r.a(n2, n7, 1.0, d2) / 2.0 / ((double)n6 * 0.6);
    }

    public static int a(int n2, double d2) {
        return (int)((double)n2 * d2) + 0 + 1;
    }
}

