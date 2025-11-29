package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.l  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/l.class */
public class l {
    public static final /* synthetic */ ThreadLocalRandom av;
    private static /* synthetic */ int[] lIIIIIIlIlIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public static boolean l() {
        int level = Skills.getLevel(Skill.HERBLORE);
        int level2 = Skills.getLevel(Skill.ATTACK);
        int i = lIIIIIIlIlIlI[1];
        if (lIIlIllllIlIlIl(level, lIIIIIIlIlIlI[2])) {
            i = ((int) (level2 * 0.1d)) + lIIIIIIlIlIlI[3];
            "".length();
            if ((-((216 ^ 178) ^ (199 ^ 168))) >= 0) {
                return ((37 ^ 105) ^ (204 ^ 176)) & (((240 ^ 149) ^ (51 ^ 102)) ^ (-" ".length()));
            }
        } else if (lIIlIllllIlIllI(level, lIIIIIIlIlIlI[2]) && lIIlIllllIlIlIl(level, lIIIIIIlIlIlI[4])) {
            i = ((int) (level2 * 0.15d)) + lIIIIIIlIlIlI[5];
        }
        if ((!lIIlIllllIlIllI(level, lIIIIIIlIlIlI[4]) || !lIIlIllllIlIlll(Vars.getBit(lIIIIIIlIlIlI[6]), lIIIIIIlIlIlI[5])) && !lIIlIllllIlIlll(Skills.getBoostedLevel(Skill.ATTACK), (Skills.getLevel(Skill.ATTACK) + i) - lIIIIIIlIlIlI[7])) {
            return lIIIIIIlIlIlI[1];
        }
        return lIIIIIIlIlIlI[0];
    }

    private static boolean lIIlIllllIlIIIl(int i) {
        return i == 0;
    }

    public static double k() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    private static boolean lIIlIllllIlIllI(int i, int i2) {
        return i >= i2;
    }

    static {
        lIIlIllllIlIIII();
        av = ThreadLocalRandom.current();
    }

    private static boolean lIIlIllllIlIlIl(int i, int i2) {
        return i < i2;
    }

    public static int a(int i, int i2) {
        int i3 = i2 - i;
        if (lIIlIllllIlIIIl(i3)) {
            return i;
        }
        if (lIIlIllllIlIIlI(Math.abs(i3), lIIIIIIlIlIlI[0])) {
            if (lIIlIllllIlIIll(av.nextBoolean() ? 1 : 0)) {
                "".length();
                return (-(48 ^ 53)) >= 0 ? (81 ^ 96) & ((131 ^ 178) ^ (-1)) : i;
            }
            return i2;
        }
        if (lIIlIllllIlIlII(i3)) {
            i = i2;
            i2 = i;
        }
        return i + av.nextInt((i2 - i) + lIIIIIIlIlIlI[0]);
    }

    private static boolean lIIlIllllIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIllllIlIlII(int i) {
        return i < 0;
    }

    private static boolean lIIlIllllIlIlll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIllllIlIIll(int i) {
        return i != 0;
    }

    private static void lIIlIllllIlIIII() {
        lIIIIIIlIlIlI = new int[8];
        lIIIIIIlIlIlI[0] = " ".length();
        lIIIIIIlIlIlI[1] = ("   ".length() ^ (78 ^ 110)) & (((42 ^ 53) ^ (118 ^ 74)) ^ (-" ".length()));
        lIIIIIIlIlIlI[2] = 9 ^ 36;
        lIIIIIIlIlIlI[3] = "   ".length();
        lIIIIIIlIlIlI[4] = (2 ^ 94) ^ (54 ^ 44);
        lIIIIIIlIlIlI[5] = 175 ^ 170;
        lIIIIIIlIlIlI[6] = (-4353) & 12783;
        lIIIIIIlIlIlI[7] = (((44 + 193) - 107) + 66) ^ (((5 + 132) - 58) + 113);
    }
}
