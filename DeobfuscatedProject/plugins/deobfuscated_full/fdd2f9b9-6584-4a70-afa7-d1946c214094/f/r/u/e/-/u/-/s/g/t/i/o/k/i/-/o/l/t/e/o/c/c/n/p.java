/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.H;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.J;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.O;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.o;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.u;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.z;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;

public class p
implements G {
    public static /* synthetic */ List<G> ce;
    static /* synthetic */ int bT;
    public static /* synthetic */ String h;
    private static /* synthetic */ int[] lIIIllIllI;
    private static /* synthetic */ String[] lIIIllIlIl;
    static /* synthetic */ boolean cf;

    private static boolean lllIlllllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lllIllllllIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        p.lllIlllllIIl();
        p.lllIlllllIII();
        ce = new ArrayList<G>();
        h = lIIIllIlIl[lIIIllIllI[1]];
        cf = lIIIllIllI[2];
    }

    private static boolean lllIllllllII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean V() {
        int n2;
        if (p.lllIlllllIlI(ce.isEmpty() ? 1 : 0) && p.lllIlllllllI(bT)) {
            n2 = lIIIllIllI[0];
            0;
            if (3 <= 0) {
                return false;
            }
        } else {
            n2 = lIIIllIllI[2];
        }
        return n2 != 0;
    }

    private static boolean lllIlllllIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean S() {
        return lIIIllIllI[2];
    }

    private static void lllIlllllIIl() {
        lIIIllIllI = new int[8];
        p.lIIIllIllI[0] = 1;
        p.lIIIllIllI[1] = 2;
        p.lIIIllIllI[2] = (10 + 86 - 87 + 132 ^ 90 + 78 - 48 + 38) & (0x47 ^ 0xF ^ (0xD ^ 0x56) ^ -1);
        p.lIIIllIllI[3] = 3;
        p.lIIIllIllI[4] = 0x4E ^ 0x23 ^ (0x6D ^ 4);
        p.lIIIllIllI[5] = 0x70 ^ 0x42;
        p.lIIIllIllI[6] = 72 + 102 - -22 + 28 ^ 35 + 54 - -73 + 14;
        p.lIIIllIllI[7] = 150 + 6 - 150 + 233 ^ 46 + 17 - -42 + 34;
    }

    private static boolean lllIlllllIlI(int n2) {
        return n2 != 0;
    }

    public static void aB() {
        if (p.lllIlllllIlI(ce.isEmpty() ? 1 : 0) && p.lllIlllllIll(bT, lIIIllIllI[0])) {
            G[] gArray = new G[lIIIllIllI[1]];
            gArray[p.lIIIllIllI[2]] = new z();
            gArray[p.lIIIllIllI[0]] = new H();
            List<G> list = Arrays.asList(gArray);
            G[] gArray2 = new G[lIIIllIllI[3]];
            gArray2[p.lIIIllIllI[2]] = new u();
            gArray2[p.lIIIllIllI[0]] = new J();
            gArray2[p.lIIIllIllI[1]] = new O();
            List<G> list2 = Arrays.asList(gArray2);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            ce.addAll(list);
            0;
            ce.addAll(list2);
            0;
            ce.add(new o());
            0;
            bT += lIIIllIllI[0];
            if (p.lllIllllllII(ce.isEmpty() ? 1 : 0)) {
                if (p.lllIlllllIlI(cf ? 1 : 0)) {
                    Collections.shuffle(ce);
                }
                System.out.println("Switching to : " + ce.get(lIIIllIllI[2]).U());
                h = ce.get(lIIIllIllI[2]).U();
            }
        }
        while (p.lllIllllllII(ce.isEmpty() ? 1 : 0) && p.lllIllllllII(AccBuilderRogues.d ? 1 : 0)) {
            if (!p.lllIllllllIl(Game.getState(), GameState.LOGGED_IN)) continue;
            if (p.lllIlllllIlI(ce.get(lIIIllIllI[2]).V() ? 1 : 0)) {
                AccBuilderRogues.f += lIIIllIllI[0];
                System.out.println("Achieved " + ce.get(lIIIllIllI[2]).U() + " goal");
                ce.remove(lIIIllIllI[2]);
                0;
                if (p.lllIllllllII(ce.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + ce.get(lIIIllIllI[2]).U());
                    h = ce.get(lIIIllIllI[2]).U();
                }
                if (p.lllIlllllIlI(ce.isEmpty() ? 1 : 0)) {
                    h = lIIIllIlIl[lIIIllIllI[2]];
                }
                Time.sleepTicks((int)lIIIllIllI[4]);
                0;
            }
            if (p.lllIllllllIl(Game.getState(), GameState.LOGGED_IN)) {
                while (p.lllIlllllIlI(e.x() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllIlIl[lIIIllIllI[0]];
                    e.y();
                    Time.sleepTicks((int)lIIIllIllI[0]);
                    0;
                    0;
                    if ((1 & (1 ^ -1)) >= 0) continue;
                    return;
                }
                AccBuilderRogues.l = ce.get(lIIIllIllI[2]).U();
                int lllIllllIIl = ce.get(lIIIllIllI[2]).T();
                Time.sleep((long)lllIllllIIl);
                0;
                Time.sleep((long)e.c(lIIIllIllI[5], lIIIllIllI[6]));
                0;
            }
            e.E();
            0;
            if (-1 <= 0) continue;
            return;
        }
    }

    @Override
    public String U() {
        return h;
    }

    private static String lllIllllIlll(String lllIllIllII, String lllIllIlIll) {
        try {
            SecretKeySpec lllIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlllIIII = Cipher.getInstance("Blowfish");
            lllIlllIIII.init(lIIIllIllI[1], lllIlllIIIl);
            return new String(lllIlllIIII.doFinal(Base64.getDecoder().decode(lllIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIllll) {
            lllIllIllll.printStackTrace();
            return null;
        }
    }

    private static void lllIlllllIII() {
        lIIIllIlIl = new String[lIIIllIllI[3]];
        p.lIIIllIlIl[p.lIIIllIllI[2]] = p."none";
        p.lIIIllIlIl[p.lIIIllIllI[0]] = p."Disabling GE warning";
        p.lIIIllIlIl[p.lIIIllIllI[1]] = p."";
    }

    @Override
    public int T() {
        try {
            p.aB();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == 3) {
            return (92 + 149 - 225 + 147 ^ 142 + 23 - 159 + 167) & (0x52 ^ 0x29 ^ (0xEF ^ 0x9A) ^ -1);
        }
        return lIIIllIllI[7];
    }
}

