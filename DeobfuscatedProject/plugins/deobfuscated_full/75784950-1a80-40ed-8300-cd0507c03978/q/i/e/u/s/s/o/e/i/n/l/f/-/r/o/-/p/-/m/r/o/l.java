/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;

public class l {
    public static final /* synthetic */ ThreadLocalRandom av;
    private static /* synthetic */ int[] lIIIIIIlIlIlI;

    /*
     * WARNING - void declaration
     */
    public static boolean l() {
        int var3;
        void var6;
        int n = Skills.getLevel((Skill)Skill.HERBLORE);
        int n2 = Skills.getLevel((Skill)Skill.ATTACK);
        int n3 = lIIIIIIlIlIlI[1];
        if (l.lIIlIllllIlIlIl(n, lIIIIIIlIlIlI[2])) {
            n3 = (int)((double)n2 * 0.1) + lIIIIIIlIlIlI[3];
            0;
            if (-(0xD8 ^ 0xB2 ^ (0xC7 ^ 0xA8)) >= 0) {
                return ((0x25 ^ 0x69 ^ (0xCC ^ 0xB0)) & (0xF0 ^ 0x95 ^ (0x33 ^ 0x66) ^ -1)) != 0;
            }
        } else if (l.lIIlIllllIlIllI((int)var6, lIIIIIIlIlIlI[2]) && l.lIIlIllllIlIlIl((int)var6, lIIIIIIlIlIlI[4])) {
            void var4;
            var3 = (int)((double)var4 * 0.15) + lIIIIIIlIlIlI[5];
        }
        if (l.lIIlIllllIlIllI((int)var6, lIIIIIIlIlIlI[4]) && l.lIIlIllllIlIlll(Vars.getBit((int)lIIIIIIlIlIlI[6]), lIIIIIIlIlIlI[5])) {
            return lIIIIIIlIlIlI[0];
        }
        if (l.lIIlIllllIlIlll(Skills.getBoostedLevel((Skill)Skill.ATTACK), Skills.getLevel((Skill)Skill.ATTACK) + var3 - lIIIIIIlIlIlI[7])) {
            return lIIIIIIlIlIlI[0];
        }
        return lIIIIIIlIlIlI[1];
    }

    private static boolean lIIlIllllIlIIIl(int n) {
        return n == 0;
    }

    public static double k() {
        double d2 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        double d3 = Skills.getLevel((Skill)Skill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    private static boolean lIIlIllllIlIllI(int n, int n2) {
        return n >= n2;
    }

    static {
        l.lIIlIllllIlIIII();
        av = ThreadLocalRandom.current();
    }

    private static boolean lIIlIllllIlIlIl(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public static int a(int n, int n2) {
        void var2;
        int var5;
        int var1;
        int n3 = n2 - n;
        if (l.lIIlIllllIlIIIl(n3)) {
            return var1;
        }
        if (l.lIIlIllllIlIIlI(Math.abs(var5), lIIIIIIlIlIlI[0])) {
            int n4;
            if (l.lIIlIllllIlIIll(av.nextBoolean() ? 1 : 0)) {
                n4 = var1;
                0;
                if (-(0x30 ^ 0x35) >= 0) {
                    return (0x51 ^ 0x60) & ~(0x83 ^ 0xB2);
                }
            } else {
                n4 = var2;
            }
            return n4;
        }
        if (l.lIIlIllllIlIlII(var5)) {
            var5 = var1;
            var1 = var2;
            n2 = var5;
        }
        return n + av.nextInt(n2 - n + lIIIIIIlIlIlI[0]);
    }

    private static boolean lIIlIllllIlIIlI(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIllllIlIlII(int n) {
        return n < 0;
    }

    private static boolean lIIlIllllIlIlll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIllllIlIIll(int n) {
        return n != 0;
    }

    private static void lIIlIllllIlIIII() {
        lIIIIIIlIlIlI = new int[8];
        l.lIIIIIIlIlIlI[0] = 1;
        l.lIIIIIIlIlIlI[1] = (3 ^ (0x4E ^ 0x6E)) & (0x2A ^ 0x35 ^ (0x76 ^ 0x4A) ^ -1);
        l.lIIIIIIlIlIlI[2] = 9 ^ 0x24;
        l.lIIIIIIlIlIlI[3] = 3;
        l.lIIIIIIlIlIlI[4] = 2 ^ 0x5E ^ (0x36 ^ 0x2C);
        l.lIIIIIIlIlIlI[5] = 0xAF ^ 0xAA;
        l.lIIIIIIlIlIlI[6] = 0xFFFFEEFF & 0x31EF;
        l.lIIIIIIlIlIlI[7] = 44 + 193 - 107 + 66 ^ 5 + 132 - 58 + 113;
    }
}

