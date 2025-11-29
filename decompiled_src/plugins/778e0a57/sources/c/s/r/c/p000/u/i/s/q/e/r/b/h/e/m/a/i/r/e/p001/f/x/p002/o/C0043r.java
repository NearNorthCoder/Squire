package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/r.class */
public class C0043r {
    private static /* synthetic */ int[] lIlIIIIlIlII;

    private static boolean llIlIlIIlllIll(int i) {
        return i > 0;
    }

    static {
        llIlIlIIlllIIl();
    }

    public static int a(int i, int i2) {
        return (i + lIlIIIIlIlII[5]) * (i2 + lIlIIIIlIlII[2]);
    }

    public static double a(int i, int i2, double d, double d2, int i3, int i4) {
        double b = b(i, i2, d, d2);
        double a = a(i3, i4);
        return llIlIlIIlllIll(llIlIlIIlllIlI(b, a)) ? 1.0d - ((a + 2.0d) / (2.0d * (b + 1.0d))) : b / (2.0d * (a + 1.0d));
    }

    private static int llIlIlIIlllIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static int b(int i, int i2, double d, double d2) {
        return (int) (b(i, d2) * (i2 + lIlIIIIlIlII[2]) * d);
    }

    public static int b(int i, double d) {
        return ((int) (i * d)) + lIlIIIIlIlII[0] + lIlIIIIlIlII[1];
    }

    public static int a(int i, int i2, double d, double d2) {
        return ((a(i2, d2) * (i + lIlIIIIlIlII[2])) + lIlIIIIlIlII[3]) / lIlIIIIlIlII[4];
    }

    public static double a(int i, double d, int i2, double d2, int i3, int i4, int i5) {
        return ((a(Skills.getLevel(Skill.ATTACK), i2, 1.0d, d2, i3, i4) * a(i, Skills.getLevel(Skill.STRENGTH), 1.0d, d)) / 2.0d) / (i5 * 0.6d);
    }

    private static void llIlIlIIlllIIl() {
        lIlIIIIlIlII = new int[6];
        lIlIIIIlIlII[0] = " ".length();
        lIlIIIIlIlII[1] = (76 ^ 55) ^ (120 ^ 11);
        lIlIIIIlIlII[2] = 39 ^ 103;
        lIlIIIIlIlII[3] = (-((-29057) & 32661)) & (-28716) & 32639;
        lIlIIIIlIlII[4] = (-((-27649) & 32055)) & (-8265) & 13310;
        lIlIIIIlIlII[5] = (133 ^ 180) ^ (103 ^ 95);
    }

    public static int a(int i, double d) {
        return ((int) (i * d)) + lIlIIIIlIlII[0] + lIlIIIIlIlII[1];
    }
}
