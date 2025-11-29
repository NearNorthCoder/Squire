package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Obstacle Handler", priority = 15, blocking = true, instant = true)
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.S  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/S.class */
public class S extends Task {
    private /* synthetic */ J aq;
    private static /* synthetic */ int[] lllIIlIIIIII;
    private /* synthetic */ Player ai;
    private final /* synthetic */ C0003d az;
    private final /* synthetic */ SquireSepulchreConfig ay;
    private final /* synthetic */ SquireSepulchre ax;

    private static boolean lIIIlIIlllIlIII(int i) {
        return i != 0;
    }

    private static boolean lIIIlIIlllIIlIl(Object obj) {
        return obj == null;
    }

    @Inject
    public S(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig, C0003d c0003d) {
        this.ay = squireSepulchreConfig;
        this.ax = squireSepulchre;
        this.az = c0003d;
    }

    private static boolean lIIIlIIlllIIlll(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIlIIlllIIlII();
    }

    private static void lIIIlIIlllIIlII() {
        lllIIlIIIIII = new int[2];
        lllIIlIIIIII[0] = (163 ^ 128) & ((6 ^ 37) ^ (-1));
        lllIIlIIIIII[1] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v140, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v157, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v173, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v205, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v221, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v237, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v247, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    public boolean run() {
        if (lIIIlIIlllIIlIl(Players.getLocal())) {
            return lllIIlIIIIII[0];
        }
        if (lIIIlIIlllIIllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        EnumC0013n[] values = EnumC0013n.values();
        int length = values.length;
        int i = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i, length)) {
            EnumC0013n enumC0013n = values[i];
            if (lIIIlIIlllIlIII(enumC0013n.a(this.az, this.ax) ? 1 : 0)) {
                System.out.println(enumC0013n.name());
                return lllIIlIIIIII[1];
            }
            i++;
            "".length();
            if ("   ".length() < 0) {
                return ((141 ^ 175) ^ (202 ^ 138)) & (((114 ^ 27) ^ (126 ^ 117)) ^ (-" ".length()));
            }
        }
        EnumC0008i[] values2 = EnumC0008i.values();
        int length2 = values2.length;
        int i2 = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i2, length2)) {
            EnumC0008i enumC0008i = values2[i2];
            if (lIIIlIIlllIlIII(enumC0008i.a(this.az, this.ax) ? 1 : 0)) {
                System.out.println(enumC0008i.name());
                return lllIIlIIIIII[1];
            }
            i2++;
            "".length();
            if ((" ".length() & (" ".length() ^ (-1))) != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        EnumC0019t[] values3 = EnumC0019t.values();
        int length3 = values3.length;
        int i3 = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i3, length3)) {
            EnumC0019t enumC0019t = values3[i3];
            if (lIIIlIIlllIlIII(enumC0019t.a(this.az, this.ax) ? 1 : 0)) {
                System.out.println(enumC0019t.name());
                return lllIIlIIIIII[1];
            }
            i3++;
            "".length();
            if (((123 ^ 107) & ((59 ^ 43) ^ (-1))) > " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        EnumC0011l[] values4 = EnumC0011l.values();
        int length4 = values4.length;
        int i4 = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i4, length4)) {
            EnumC0011l enumC0011l = values4[i4];
            if (lIIIlIIlllIlIII(enumC0011l.a(this.az, this.ax) ? 1 : 0)) {
                System.out.println(enumC0011l.name());
                return lllIIlIIIIII[1];
            }
            i4++;
            "".length();
            if (" ".length() < (-" ".length())) {
                return ((83 ^ 105) ^ (118 ^ 28)) & (((((140 + 136) - 250) + 206) ^ (((55 + 133) - 89) + 85)) ^ (-" ".length()));
            }
        }
        D[] values5 = D.values();
        int length5 = values5.length;
        int i5 = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i5, length5)) {
            D d = values5[i5];
            if (lIIIlIIlllIlIII(d.a(this.az, this.ax) ? 1 : 0)) {
                System.out.println(d.name());
                return lllIIlIIIIII[1];
            }
            i5++;
            "".length();
            if ("   ".length() == (((69 ^ 59) ^ (121 ^ 20)) & (((255 ^ 151) ^ (44 ^ 87)) ^ (-" ".length())))) {
                return ((13 ^ 92) ^ (92 ^ 110)) & (((159 ^ 176) ^ (37 ^ 105)) ^ (-" ".length()));
            }
        }
        A[] values6 = A.values();
        int length6 = values6.length;
        int i6 = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i6, length6)) {
            A a = values6[i6];
            if (lIIIlIIlllIlIII(a.a(this.az, this.ax) ? 1 : 0)) {
                System.out.println(a.name());
                return lllIIlIIIIII[1];
            }
            i6++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((90 ^ 118) ^ (35 ^ 108)) & (((161 ^ 141) ^ (69 ^ 10)) ^ (-" ".length()));
            }
        }
        EnumC0004e[] values7 = EnumC0004e.values();
        int length7 = values7.length;
        int i7 = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i7, length7)) {
            EnumC0004e enumC0004e = values7[i7];
            if (lIIIlIIlllIlIII(enumC0004e.a(this.az, this.ax) ? 1 : 0)) {
                System.out.println(enumC0004e.name());
                return lllIIlIIIIII[1];
            }
            i7++;
            "".length();
            if ((-" ".length()) > 0) {
                return ((52 ^ 5) ^ (244 ^ 166)) & (((119 ^ 68) ^ (239 ^ 191)) ^ (-" ".length()));
            }
        }
        EnumC0017r[] values8 = EnumC0017r.values();
        int length8 = values8.length;
        int i8 = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i8, length8)) {
            EnumC0017r enumC0017r = values8[i8];
            if (lIIIlIIlllIlIII(enumC0017r.a(this.az, this.ax) ? 1 : 0)) {
                System.out.println(enumC0017r.name());
                return lllIIlIIIIII[1];
            }
            i8++;
            "".length();
            if (" ".length() <= 0) {
                return ((((82 + 141) - 74) + 8) ^ (((173 + 172) - 215) + 46)) & (((((39 + 91) - 75) + 73) ^ (((159 + 136) - 181) + 59)) ^ (-" ".length()));
            }
        }
        K[] values9 = K.values();
        int length9 = values9.length;
        int i9 = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i9, length9)) {
            if (lIIIlIIlllIlIII(values9[i9].a(this.az, this.ax) ? 1 : 0)) {
                return lllIIlIIIIII[1];
            }
            i9++;
            "".length();
            if (((((20 + 124) - (-3)) + 2) ^ (((7 + 88) - 45) + 95)) != ((40 ^ 3) ^ (128 ^ 175))) {
                return ((((38 + 14) - (-36)) + 48) ^ (((116 + 85) - 179) + 169)) & (((216 ^ 162) ^ (23 ^ 90)) ^ (-" ".length()));
            }
        }
        G[] values10 = G.values();
        int length10 = values10.length;
        int i10 = lllIIlIIIIII[0];
        while (lIIIlIIlllIIlll(i10, length10)) {
            if (lIIIlIIlllIlIII(values10[i10].a(this.az, this.ax) ? 1 : 0)) {
                return lllIIlIIIIII[1];
            }
            i10++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return ((((174 + 46) - 90) + 69) ^ (((113 + 32) - 63) + 54)) & (((((112 + 76) - 167) + 185) ^ (((110 + 34) - 55) + 40)) ^ (-" ".length()));
            }
        }
        return lllIIlIIIIII[0];
    }

    private static boolean lIIIlIIlllIIllI(int i) {
        return i == 0;
    }
}
