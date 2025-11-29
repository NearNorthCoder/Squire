/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.A;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.C;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.D;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.E;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.F;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.L;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.P;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.U;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.n;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.o;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.p;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.q;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.r;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.s;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.u;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.v;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.w;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import net.runelite.api.GameState;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;

public class m
implements S {
    private static /* synthetic */ String[] lllIllIIll;
    private static /* synthetic */ int[] lllIllIlII;
    public static /* synthetic */ String h;
    static /* synthetic */ boolean bW;
    public static /* synthetic */ List<S> bV;
    static /* synthetic */ int bS;

    @Override
    public boolean S() {
        return lllIllIlII[2];
    }

    @Override
    public boolean V() {
        int n2;
        if (m.llIIlIIIIlllI(bV.isEmpty() ? 1 : 0) && m.llIIlIIIlIIlI(bS)) {
            n2 = lllIllIlII[0];
            "".length();
            if (" ".length() <= ((0xB0 ^ 0x81) & ~(0x9E ^ 0xAF))) {
                return ((0x79 ^ 0x40) & ~(0x14 ^ 0x2D)) != 0;
            }
        } else {
            n2 = lllIllIlII[2];
        }
        return n2 != 0;
    }

    private static boolean llIIlIIIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        return h;
    }

    private static boolean llIIlIIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlIIIIlIll(String lllllllllllllllllIllIlIIIllIIlll, String lllllllllllllllllIllIlIIIllIIIIl) {
        lllllllllllllllllIllIlIIIllIIlll = new String(Base64.getDecoder().decode(lllllllllllllllllIllIlIIIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllIlIIIllIIlIl = new StringBuilder();
        char[] lllllllllllllllllIllIlIIIllIIlII = lllllllllllllllllIllIlIIIllIIIIl.toCharArray();
        int lllllllllllllllllIllIlIIIllIIIll = lllIllIlII[2];
        char[] lllllllllllllllllIllIlIIIlIlllIl = lllllllllllllllllIllIlIIIllIIlll.toCharArray();
        int lllllllllllllllllIllIlIIIlIlllII = lllllllllllllllllIllIlIIIlIlllIl.length;
        int lllllllllllllllllIllIlIIIlIllIll = lllIllIlII[2];
        while (m.llIIlIIIIllll(lllllllllllllllllIllIlIIIlIllIll, lllllllllllllllllIllIlIIIlIlllII)) {
            char lllllllllllllllllIllIlIIIllIlIII = lllllllllllllllllIllIlIIIlIlllIl[lllllllllllllllllIllIlIIIlIllIll];
            lllllllllllllllllIllIlIIIllIIlIl.append((char)(lllllllllllllllllIllIlIIIllIlIII ^ lllllllllllllllllIllIlIIIllIIlII[lllllllllllllllllIllIlIIIllIIIll % lllllllllllllllllIllIlIIIllIIlII.length]));
            "".length();
            ++lllllllllllllllllIllIlIIIllIIIll;
            ++lllllllllllllllllIllIlIIIlIllIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIllIlIIIllIIlIl);
    }

    @Override
    public int T() {
        try {
            m.au();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() <= 0) {
            return (0x41 ^ 0x1A) & ~(0x34 ^ 0x6F);
        }
        return lllIllIlII[8];
    }

    private static void llIIlIIIIllII() {
        lllIllIIll = new String[lllIllIlII[4]];
        m.lllIllIIll[m.lllIllIlII[2]] = m.llIIlIIIIlIll("DSACBg==", "cOlcD");
        m.lllIllIIll[m.lllIllIlII[0]] = m.llIIlIIIIlIll("Kx89Bg8DHyAATSgzbhAMHRgnCQo=", "ovNgm");
        m.lllIllIIll[m.lllIllIlII[3]] = m.llIIlIIIIlIll("", "auxnt");
    }

    public static void au() {
        if (m.llIIlIIIIlllI(bV.isEmpty() ? 1 : 0) && m.llIIlIIIIllll(bS, lllIllIlII[0])) {
            S[] sArray = new S[lllIllIlII[1]];
            sArray[m.lllIllIlII[2]] = new w();
            sArray[m.lllIllIlII[0]] = new L();
            sArray[m.lllIllIlII[3]] = new F();
            sArray[m.lllIllIlII[4]] = new E();
            sArray[m.lllIllIlII[5]] = new C();
            List<S> list = Arrays.asList(sArray);
            S[] sArray2 = new S[lllIllIlII[1]];
            sArray2[m.lllIllIlII[2]] = new u();
            sArray2[m.lllIllIlII[0]] = new o();
            sArray2[m.lllIllIlII[3]] = new A();
            sArray2[m.lllIllIlII[4]] = new P();
            sArray2[m.lllIllIlII[5]] = new s();
            List<S> list2 = Arrays.asList(sArray2);
            S[] sArray3 = new S[lllIllIlII[5]];
            sArray3[m.lllIllIlII[2]] = new r();
            sArray3[m.lllIllIlII[0]] = new q();
            sArray3[m.lllIllIlII[3]] = new p();
            sArray3[m.lllIllIlII[4]] = new n();
            List<S> list3 = Arrays.asList(sArray3);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            bV.addAll(list);
            "".length();
            bV.add(new v());
            "".length();
            bV.addAll(list2);
            "".length();
            bV.add(new D());
            "".length();
            bV.add(new U());
            "".length();
            bV.addAll(list3);
            "".length();
            bS += lllIllIlII[0];
            if (m.llIIlIIIlIIII(bV.isEmpty() ? 1 : 0)) {
                if (m.llIIlIIIIlllI(bW ? 1 : 0)) {
                    Collections.shuffle(bV);
                }
                System.out.println("Switching to : " + bV.get(lllIllIlII[2]).U());
                h = bV.get(lllIllIlII[2]).U();
            }
        }
        while (m.llIIlIIIlIIII(bV.isEmpty() ? 1 : 0) && m.llIIlIIIlIIII(AccBuilderTempleTrek.d ? 1 : 0)) {
            if (!m.llIIlIIIlIIIl(Game.getState(), GameState.LOGGED_IN)) continue;
            if (m.llIIlIIIIlllI(bV.get(lllIllIlII[2]).V() ? 1 : 0)) {
                AccBuilderTempleTrek.f += lllIllIlII[0];
                System.out.println("Achieved " + bV.get(lllIllIlII[2]).U() + " goal");
                bV.remove(lllIllIlII[2]);
                "".length();
                if (m.llIIlIIIlIIII(bV.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + bV.get(lllIllIlII[2]).U());
                    h = bV.get(lllIllIlII[2]).U();
                }
                if (m.llIIlIIIIlllI(bV.isEmpty() ? 1 : 0)) {
                    h = lllIllIIll[lllIllIlII[2]];
                }
                Time.sleepTicks((int)lllIllIlII[5]);
                "".length();
            }
            if (m.llIIlIIIlIIIl(Game.getState(), GameState.LOGGED_IN)) {
                while (m.llIIlIIIIlllI(e.x() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIllIIll[lllIllIlII[0]];
                    e.y();
                    Time.sleepTicks((int)lllIllIlII[0]);
                    "".length();
                    "".length();
                    if (-"  ".length() < 0) continue;
                    return;
                }
                AccBuilderTempleTrek.l = bV.get(lllIllIlII[2]).U();
                int lllllllllllllllllIllIlIIIlllIllI = bV.get(lllIllIlII[2]).T();
                Time.sleep((long)lllllllllllllllllIllIlIIIlllIllI);
                "".length();
                Time.sleep((long)e.c(lllIllIlII[6], lllIllIlII[7]));
                "".length();
            }
            e.E();
            "".length();
            if (-" ".length() < "  ".length()) continue;
            return;
        }
    }

    private static boolean llIIlIIIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIlIIlI(int n2) {
        return n2 > 0;
    }

    private static void llIIlIIIIllIl() {
        lllIllIlII = new int[9];
        m.lllIllIlII[0] = " ".length();
        m.lllIllIlII[1] = 0x9C ^ 0x99;
        m.lllIllIlII[2] = (67 + 10 - 38 + 161 ^ 52 + 126 - 124 + 85) & (0x12 ^ 0x41 ^ (0x12 ^ 2) ^ -" ".length());
        m.lllIllIlII[3] = "  ".length();
        m.lllIllIlII[4] = "   ".length();
        m.lllIllIlII[5] = 0x48 ^ 0x32 ^ (0x3C ^ 0x42);
        m.lllIllIlII[6] = 20 + 133 - 49 + 59 ^ 99 + 124 - 151 + 73;
        m.lllIllIlII[7] = 0x43 ^ 0x13;
        m.lllIllIlII[8] = 0x8F ^ 0xB6 ^ (0x39 ^ 0x64);
    }

    private static boolean llIIlIIIlIIII(int n2) {
        return n2 == 0;
    }

    static {
        m.llIIlIIIIllIl();
        m.llIIlIIIIllII();
        bV = new ArrayList<S>();
        h = lllIllIIll[lllIllIlII[3]];
        bW = lllIllIlII[2];
    }
}

