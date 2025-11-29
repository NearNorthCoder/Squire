/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public class r {
    private static /* synthetic */ int[] lIlIIIIlIlII;

    private static boolean llIlIlIIlllIll(int n2) {
        return n2 > 0;
    }

    static {
        r.llIlIlIIlllIIl();
    }

    public static int a(int n2, int n3) {
        return (n2 + lIlIIIIlIlII[5]) * (n3 + lIlIIIIlIlII[2]);
    }

    public static double a(int n2, int n3, double d2, double d3, int n4, int n5) {
        double d4;
        double d5 = r.b(n2, n3, d2, d3);
        if (r.llIlIlIIlllIll(r.llIlIlIIlllIlI(d5, d4 = (double)r.a(n4, n5)))) {
            return 1.0 - (d4 + 2.0) / (2.0 * (d5 + 1.0));
        }
        return d5 / (2.0 * (d4 + 1.0));
    }

    private static int llIlIlIIlllIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    public static int b(int n2, int n3, double d2, double d3) {
        return (int)((double)(r.b(n2, d3) * (n3 + lIlIIIIlIlII[2])) * d2);
    }

    public static int b(int n2, double d2) {
        return (int)((double)n2 * d2) + lIlIIIIlIlII[0] + lIlIIIIlIlII[1];
    }

    public static int a(int n2, int n3, double d2, double d3) {
        return (r.a(n3, d3) * (n2 + lIlIIIIlIlII[2]) + lIlIIIIlIlII[3]) / lIlIIIIlIlII[4];
    }

    public static double a(int n2, double d2, int n3, double d3, int n4, int n5, int n6) {
        int n7 = Skills.getLevel((Skill)Skill.STRENGTH);
        int n8 = Skills.getLevel((Skill)Skill.ATTACK);
        return r.a(n8, n3, 1.0, d3, n4, n5) * (double)r.a(n2, n7, 1.0, d2) / 2.0 / ((double)n6 * 0.6);
    }

    private static void llIlIlIIlllIIl() {
        lIlIIIIlIlII = new int[6];
        r.lIlIIIIlIlII[0] = 1;
        r.lIlIIIIlIlII[1] = 0x4C ^ 0x37 ^ (0x78 ^ 0xB);
        r.lIlIIIIlIlII[2] = 0x27 ^ 0x67;
        r.lIlIIIIlIlII[3] = -(0xFFFF8E7F & 0x7F95) & (0xFFFF8FD4 & 0x7F7F);
        r.lIlIIIIlIlII[4] = -(0xFFFF93FF & 0x7D37) & (0xFFFFDFB7 & 0x33FE);
        r.lIlIIIIlIlII[5] = 0x85 ^ 0xB4 ^ (0x67 ^ 0x5F);
    }

    public static int a(int n2, double d2) {
        return (int)((double)n2 * d2) + lIlIIIIlIlII[0] + lIlIIIIlIlII[1];
    }
}

