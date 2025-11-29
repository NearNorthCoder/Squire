/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Vars
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.C;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.D;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.F;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.H;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.I;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.K;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.N;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.O;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.Q;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.S;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.T;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.U;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.X;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.Z;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.af;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.p;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.u;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.v;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.x;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.y;
import net.runelite.api.GameState;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;

public class q
implements W {
    public static /* synthetic */ int cf;
    public static /* synthetic */ int ce;
    public static /* synthetic */ int bV;
    public static /* synthetic */ int bT;
    public static /* synthetic */ List<W> cd;
    private static /* synthetic */ int[] lIlIIIlII;
    public static /* synthetic */ int bZ;
    public static /* synthetic */ String h;
    static /* synthetic */ boolean ch;
    private static /* synthetic */ String[] lIlIIIIll;
    public static /* synthetic */ int cg;

    private static void lIIIIlllllll() {
        lIlIIIlII = new int[18];
        q.lIlIIIlII[0] = " ".length();
        q.lIlIIIlII[1] = 0x27 ^ 0x21 ^ (0x6C ^ 0x32) & ~(0x27 ^ 0x79);
        q.lIlIIIlII[2] = (0x4C ^ 0x16 ^ (0xC5 ^ 0xAC)) & (90 + 117 - 177 + 122 ^ 23 + 34 - -76 + 38 ^ -" ".length());
        q.lIlIIIlII[3] = "  ".length();
        q.lIlIIIlII[4] = "   ".length();
        q.lIlIIIlII[5] = " ".length() ^ (0xC3 ^ 0xC6);
        q.lIlIIIlII[6] = 0x96 ^ 0x93;
        q.lIlIIIlII[7] = 0x7C ^ 0x12 ^ (5 ^ 0x6C);
        q.lIlIIIlII[8] = 0x24 ^ 0x47 ^ (0x4F ^ 0x1E);
        q.lIlIIIlII[9] = 0x20 ^ 0x70;
        q.lIlIIIlII[10] = 0xFFFFBDF7 & 0x6AE9;
        q.lIlIIIlII[11] = 0xFFFF8DFC & 0x77DF;
        q.lIlIIIlII[12] = 0xCA ^ 0x97 ^ (0xFF ^ 0xC6);
        q.lIlIIIlII[13] = 0xFFFFBBE5 & 0xDFFBA;
        q.lIlIIIlII[14] = -(60 + 87 - 144 + 131) & (0xFFFFFBFD & 0x16E7E7);
        q.lIlIIIlII[15] = 0x34 ^ 0xE ^ (0x6C ^ 0x1D);
        q.lIlIIIlII[16] = 60 + 125 - 84 + 49;
        q.lIlIIIlII[17] = 0x14 ^ 0x1C;
    }

    private static boolean lIIIlIIIIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIIIIIII(int n2) {
        return n2 != 0;
    }

    static {
        q.lIIIIlllllll();
        q.lIIIIllllllI();
        cd = new ArrayList<W>();
        h = lIlIIIIll[lIlIIIlII[5]];
        bV = e.c(lIlIIIlII[0], lIlIIIlII[3]);
        cf = e.c(lIlIIIlII[13], lIlIIIlII[14]);
        cg = e.c(lIlIIIlII[15], lIlIIIlII[16]);
        ch = lIlIIIlII[2];
    }

    private static boolean lIIIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIIIlllllII(String llllIlllllIIIl, String llllIllllIlllI) {
        try {
            SecretKeySpec llllIlllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllllIlllI.getBytes(StandardCharsets.UTF_8)), lIlIIIlII[17]), "DES");
            Cipher llllIlllllIIll = Cipher.getInstance("DES");
            llllIlllllIIll.init(lIlIIIlII[3], llllIlllllIlII);
            return new String(llllIlllllIIll.doFinal(Base64.getDecoder().decode(llllIlllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlllllIIlI) {
            llllIlllllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIlIl(Object object) {
        return object != null;
    }

    @Override
    public boolean V() {
        int n2;
        if (q.lIIIlIIIIIII(cd.isEmpty() ? 1 : 0) && q.lIIIlIIIIllI(bT)) {
            n2 = lIlIIIlII[0];
            "".length();
            if (((0xB ^ 0x1C) & ~(0x1C ^ 0xB)) == -" ".length()) {
                return ((0xB3 ^ 0x9D) & ~(0x7D ^ 0x53)) != 0;
            }
        } else {
            n2 = lIlIIIlII[2];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean S() {
        return lIlIIIlII[2];
    }

    @Override
    public String U() {
        return h;
    }

    private static String lIIIIlllllIl(String llllIlllIlllII, String llllIllllIIIII) {
        llllIlllIlllII = new String(Base64.getDecoder().decode(llllIlllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlllIlllll = new StringBuilder();
        char[] llllIlllIllllI = llllIllllIIIII.toCharArray();
        int llllIlllIlllIl = lIlIIIlII[2];
        char[] llllIlllIlIlll = llllIlllIlllII.toCharArray();
        int llllIlllIlIllI = llllIlllIlIlll.length;
        int llllIlllIlIlIl = lIlIIIlII[2];
        while (q.lIIIlIIIIIIl(llllIlllIlIlIl, llllIlllIlIllI)) {
            char llllIllllIIIlI = llllIlllIlIlll[llllIlllIlIlIl];
            llllIlllIlllll.append((char)(llllIllllIIIlI ^ llllIlllIllllI[llllIlllIlllIl % llllIlllIllllI.length]));
            "".length();
            ++llllIlllIlllIl;
            ++llllIlllIlIlIl;
            "".length();
            if (((41 + 67 - 10 + 137 ^ 131 + 55 - 133 + 110) & (35 + 119 - -86 + 14 ^ 25 + 145 - 111 + 123 ^ -" ".length())) < "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllIlllIlllll);
    }

    @Override
    public int T() {
        try {
            q.aF();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("  ".length() <= " ".length()) {
            return (29 + 0 - 18 + 122 ^ 70 + 129 - 38 + 34) & (0xA4 ^ 0xAF ^ (0xD9 ^ 0x94) ^ -" ".length());
        }
        return lIlIIIlII[12];
    }

    private static String lIIIIllllIll(String llllIlllllllII, String llllIllllllIll) {
        try {
            SecretKeySpec lllllIIIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIIIIIIIII = Cipher.getInstance("Blowfish");
            lllllIIIIIIIII.init(lIlIIIlII[3], lllllIIIIIIIIl);
            return new String(lllllIIIIIIIII.doFinal(Base64.getDecoder().decode(llllIlllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlllllllll) {
            llllIlllllllll.printStackTrace();
            return null;
        }
    }

    public static void aF() {
        if (q.lIIIlIIIIIII(cd.isEmpty() ? 1 : 0) && q.lIIIlIIIIIIl(bT, lIlIIIlII[0])) {
            W[] wArray = new W[lIlIIIlII[1]];
            wArray[q.lIlIIIlII[2]] = new af();
            wArray[q.lIlIIIlII[0]] = new S();
            wArray[q.lIlIIIlII[3]] = new N();
            wArray[q.lIlIIIlII[4]] = new O();
            wArray[q.lIlIIIlII[5]] = new F();
            wArray[q.lIlIIIlII[6]] = new D();
            List<W> list = Arrays.asList(wArray);
            W[] wArray2 = new W[lIlIIIlII[7]];
            wArray2[q.lIlIIIlII[2]] = new Z();
            wArray2[q.lIlIIIlII[0]] = new K();
            wArray2[q.lIlIIIlII[3]] = new U();
            wArray2[q.lIlIIIlII[4]] = new H();
            wArray2[q.lIlIIIlII[5]] = new y();
            wArray2[q.lIlIIIlII[6]] = new T();
            wArray2[q.lIlIIIlII[1]] = new x();
            List<W> list2 = Arrays.asList(wArray2);
            W[] wArray3 = new W[lIlIIIlII[1]];
            wArray3[q.lIlIIIlII[2]] = new p();
            wArray3[q.lIlIIIlII[0]] = new v();
            wArray3[q.lIlIIIlII[3]] = new X();
            wArray3[q.lIlIIIlII[4]] = new u();
            wArray3[q.lIlIIIlII[5]] = new Q();
            wArray3[q.lIlIIIlII[6]] = new I();
            List<W> list3 = Arrays.asList(wArray3);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            Collections.shuffle(list3);
            cd.addAll(list);
            "".length();
            cd.addAll(list2);
            "".length();
            cd.addAll(list3);
            "".length();
            cd.add(new C());
            "".length();
            bT += lIlIIIlII[0];
            if (q.lIIIlIIIIIlI(cd.isEmpty() ? 1 : 0)) {
                if (q.lIIIlIIIIIII(ch ? 1 : 0)) {
                    Collections.shuffle(cd);
                }
                System.out.println("Switching to : " + cd.get(lIlIIIlII[2]).U());
                h = cd.get(lIlIIIlII[2]).U();
            }
        }
        while (q.lIIIlIIIIIlI(cd.isEmpty() ? 1 : 0) && q.lIIIlIIIIIlI(AccBuilderEasyClues.d ? 1 : 0)) {
            if (!q.lIIIlIIIIIll(Game.getState(), GameState.LOGGED_IN)) continue;
            if (q.lIIIlIIIIIII(cd.get(lIlIIIlII[2]).V() ? 1 : 0)) {
                if (q.lIIIlIIIIIII(cd.get(lIlIIIlII[2]).U().contains(lIlIIIIll[lIlIIIlII[2]]) ? 1 : 0)) {
                    AccBuilderEasyClues.f += lIlIIIlII[0];
                }
                System.out.println("Achieved " + cd.get(lIlIIIlII[2]).U() + " goal");
                cd.remove(lIlIIIlII[2]);
                "".length();
                if (q.lIIIlIIIIIlI(cd.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + cd.get(lIlIIIlII[2]).U());
                    h = cd.get(lIlIIIlII[2]).U();
                }
                if (q.lIIIlIIIIIII(cd.isEmpty() ? 1 : 0)) {
                    h = lIlIIIIll[lIlIIIlII[0]];
                    "".length();
                    if (((0xA ^ 0x55) & ~(0x4C ^ 0x13)) < "  ".length()) break;
                    return;
                }
                Time.sleepTicks((int)lIlIIIlII[5]);
                "".length();
            }
            if (q.lIIIlIIIIIll(Game.getState(), GameState.LOGGED_IN)) {
                while (q.lIIIlIIIIIII(e.x() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIIIIll[lIlIIIlII[3]];
                    e.y();
                    Time.sleepTicks((int)lIlIIIlII[0]);
                    "".length();
                    "".length();
                    if (" ".length() <= (6 ^ 0x48 ^ (0x42 ^ 8))) continue;
                    return;
                }
                AccBuilderEasyClues.l = cd.get(lIlIIIlII[2]).U();
                int lllllIIIIIlIlI = cd.get(lIlIIIlII[2]).T();
                Time.sleep((long)lllllIIIIIlIlI);
                "".length();
                Time.sleep((long)e.c(lIlIIIlII[8], lIlIIIlII[9]));
                "".length();
            }
            if (!q.lIIIlIIIIlII(Vars.getBit((int)lIlIIIlII[10]), lIlIIIlII[11])) continue;
            String[] stringArray = new String[lIlIIIlII[0]];
            stringArray[q.lIlIIIlII[2]] = lIlIIIIll[lIlIIIlII[4]];
            if (!q.lIIIlIIIIlIl(TileObjects.getNearest((String[])stringArray))) continue;
            e.E();
            "".length();
            if (-" ".length() < " ".length()) continue;
            return;
        }
        if (!q.lIIIlIIIIIII(cd.isEmpty() ? 1 : 0) || q.lIIIlIIIIllI(bT)) {
            // empty if block
        }
    }

    private static boolean lIIIlIIIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIIIllllllI() {
        lIlIIIIll = new String[lIlIIIlII[6]];
        q.lIlIIIIll[q.lIlIIIlII[2]] = q.lIIIIllllIll("RpjZWONA0us=", "KYADF");
        q.lIlIIIIll[q.lIlIIIlII[0]] = q.lIIIIlllllII("SH8AKbOj+ZU=", "wdXAM");
        q.lIlIIIIll[q.lIlIIIlII[3]] = q.lIIIIlllllIl("Dzs9MzUnOyA1dwwXbiU2OTwnPDA=", "KRNRW");
        q.lIlIIIIll[q.lIlIIIlII[4]] = q.lIIIIlllllII("XMPg+g+AJuSFV0gZTxQHGQ==", "FwtSX");
        q.lIlIIIIll[q.lIlIIIlII[5]] = q.lIIIIlllllII("+xEXWO7QmA0=", "pFpHB");
    }
}

