/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.widgets.Dialog
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.H;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.I;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.J;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.K;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.y;
import gg.squire.account.AccBuilderBarrows;
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
import net.unethicalite.api.widgets.Dialog;

public class o
implements F {
    public static /* synthetic */ String h;
    public static /* synthetic */ List<F> cc;
    private static /* synthetic */ int[] lllIlllI;
    private static /* synthetic */ String[] lllIllII;
    static /* synthetic */ boolean cd;
    static /* synthetic */ int bZ;

    public static void az() {
        if (o.llIIIlIlIII(cc.isEmpty() ? 1 : 0) && o.llIIIlIlIIl(bZ, lllIlllI[0])) {
            F[] fArray = new F[lllIlllI[1]];
            fArray[o.lllIlllI[2]] = new y();
            fArray[o.lllIlllI[0]] = new K();
            List<F> list = Arrays.asList(fArray);
            F[] fArray2 = new F[lllIlllI[3]];
            fArray2[o.lllIlllI[2]] = new H();
            fArray2[o.lllIlllI[0]] = new q();
            fArray2[o.lllIlllI[1]] = new I();
            List<F> list2 = Arrays.asList(fArray2);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            cc.addAll(list);
            "".length();
            cc.addAll(list2);
            "".length();
            cc.add(new J());
            "".length();
            bZ += lllIlllI[0];
            if (o.llIIIlIlIlI(cc.isEmpty() ? 1 : 0)) {
                if (o.llIIIlIlIII(cd ? 1 : 0)) {
                    Collections.shuffle(cc);
                }
                System.out.println("Switching to : " + cc.get(lllIlllI[2]).V());
                h = cc.get(lllIlllI[2]).V();
            }
        }
        while (o.llIIIlIlIlI(cc.isEmpty() ? 1 : 0) && o.llIIIlIlIlI(AccBuilderBarrows.d ? 1 : 0)) {
            if (!o.llIIIlIlIll(Game.getState(), GameState.LOGGED_IN)) continue;
            if (o.llIIIlIlIII(cc.get(lllIlllI[2]).W() ? 1 : 0)) {
                AccBuilderBarrows.f += lllIlllI[0];
                System.out.println("Achieved " + cc.get(lllIlllI[2]).V() + " goal");
                cc.remove(lllIlllI[2]);
                "".length();
                if (o.llIIIlIlIlI(cc.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + cc.get(lllIlllI[2]).V());
                    h = cc.get(lllIlllI[2]).V();
                }
                if (o.llIIIlIlIII(cc.isEmpty() ? 1 : 0)) {
                    h = lllIllII[lllIlllI[2]];
                }
                Time.sleepTicks((int)lllIlllI[4]);
                "".length();
            }
            if (o.llIIIlIlIll(Game.getState(), GameState.LOGGED_IN)) {
                while (o.llIIIlIlIII(e.y() ? 1 : 0) && o.llIIIlIlIlI(AccBuilderBarrows.d ? 1 : 0) && o.llIIIlIllII(e.j(lllIlllI[5]), lllIlllI[6]) && o.llIIIlIlIlI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIllII[lllIlllI[0]];
                    e.z();
                    Time.sleepTicks((int)lllIlllI[0]);
                    "".length();
                    "".length();
                    if ((0x11 ^ 0x61 ^ (0x24 ^ 0x51)) != 0) continue;
                    return;
                }
                AccBuilderBarrows.l = cc.get(lllIlllI[2]).V();
                int lIIllllIIllIIIl = cc.get(lllIlllI[2]).U();
                Time.sleep((long)lIIllllIIllIIIl);
                "".length();
                Time.sleep((long)e.c(lllIlllI[7], lllIlllI[8]));
                "".length();
            }
            e.F();
            "".length();
            if (" ".length() >= 0) continue;
            return;
        }
    }

    private static boolean llIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIlIll(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public int U() {
        try {
            o.az();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (" ".length() != " ".length()) {
            return (0x20 ^ 0) & ~(0x97 ^ 0xB7);
        }
        return lllIlllI[9];
    }

    private static void llIIIlIIlll() {
        lllIlllI = new int[11];
        o.lllIlllI[0] = " ".length();
        o.lllIlllI[1] = "  ".length();
        o.lllIlllI[2] = (0xFD ^ 0xB8 ^ (0x49 ^ 0x25)) & (0x48 ^ 0 ^ (0xDA ^ 0xBB) ^ -" ".length());
        o.lllIlllI[3] = "   ".length();
        o.lllIlllI[4] = 0x5A ^ 0x5E;
        o.lllIlllI[5] = -(0xFFFFBEC3 & 0x4FFF) & (0xFFFFDFDB & 0x2FFF);
        o.lllIlllI[6] = -(0xFFFFFCBE & 0x4B43) & (0xFFFFFFF9 & 0x4BEF);
        o.lllIlllI[7] = 0xA1 ^ 0x93;
        o.lllIlllI[8] = 81 + 219 - 155 + 79 ^ 8 + 21 - -83 + 64;
        o.lllIlllI[9] = 0xE4 ^ 0x80;
        o.lllIlllI[10] = 34 + 91 - 66 + 98 ^ 104 + 13 - -13 + 19;
    }

    private static String llIIIIlllII(String lIIllllIIlIIIll, String lIIllllIIlIIIlI) {
        lIIllllIIlIIIll = new String(Base64.getDecoder().decode(lIIllllIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllllIIlIIIIl = new StringBuilder();
        char[] lIIllllIIlIIIII = lIIllllIIlIIIlI.toCharArray();
        int lIIllllIIIlllll = lllIlllI[2];
        char[] lIIllllIIIllIIl = lIIllllIIlIIIll.toCharArray();
        int lIIllllIIIllIII = lIIllllIIIllIIl.length;
        int lIIllllIIIlIlll = lllIlllI[2];
        while (o.llIIIlIlIIl(lIIllllIIIlIlll, lIIllllIIIllIII)) {
            char lIIllllIIlIIlII = lIIllllIIIllIIl[lIIllllIIIlIlll];
            lIIllllIIlIIIIl.append((char)(lIIllllIIlIIlII ^ lIIllllIIlIIIII[lIIllllIIIlllll % lIIllllIIlIIIII.length]));
            "".length();
            ++lIIllllIIIlllll;
            ++lIIllllIIIlIlll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIIllllIIlIIIIl);
    }

    static {
        o.llIIIlIIlll();
        o.llIIIIllllI();
        cc = new ArrayList<F>();
        h = lllIllII[lllIlllI[1]];
        cd = lllIlllI[2];
    }

    private static boolean llIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static String llIIIIlllIl(String lIIlllIllllllll, String lIIlllIlllllllI) {
        try {
            SecretKeySpec lIIllllIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlllIlllllllI.getBytes(StandardCharsets.UTF_8)), lllIlllI[10]), "DES");
            Cipher lIIllllIIIIIIll = Cipher.getInstance("DES");
            lIIllllIIIIIIll.init(lllIlllI[1], lIIllllIIIIIlII);
            return new String(lIIllllIIIIIIll.doFinal(Base64.getDecoder().decode(lIIlllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllllIIIIIIlI) {
            lIIllllIIIIIIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public String V() {
        return h;
    }

    private static boolean llIIIlIllIl(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean T() {
        return lllIlllI[2];
    }

    @Override
    public boolean W() {
        int n2;
        if (o.llIIIlIlIII(cc.isEmpty() ? 1 : 0) && o.llIIIlIllIl(bZ)) {
            n2 = lllIlllI[0];
            "".length();
            if ((0x4D ^ 0x49) == 0) {
                return ((4 ^ 0x28) & ~(0x93 ^ 0xBF)) != 0;
            }
        } else {
            n2 = lllIlllI[2];
        }
        return n2 != 0;
    }

    private static boolean llIIIlIllII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIIIllllI() {
        lllIllII = new String[lllIlllI[3]];
        o.lllIllII[o.lllIlllI[2]] = o.llIIIIllIll("eQjfTA3fUQA=", "wKPTU");
        o.lllIllII[o.lllIlllI[0]] = o.llIIIIlllII("CCg4NDQgKCUydgsEayI3Pi8iOzE=", "LAKUV");
        o.lllIllII[o.lllIlllI[1]] = o.llIIIIlllIl("iGrAcWMDdfk=", "okQwP");
    }

    private static String llIIIIllIll(String lIIllllIIIIllII, String lIIllllIIIIllIl) {
        try {
            SecretKeySpec lIIllllIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllllIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllllIIIlIIII = Cipher.getInstance("Blowfish");
            lIIllllIIIlIIII.init(lllIlllI[1], lIIllllIIIlIIIl);
            return new String(lIIllllIIIlIIII.doFinal(Base64.getDecoder().decode(lIIllllIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllllIIIIllll) {
            lIIllllIIIIllll.printStackTrace();
            return null;
        }
    }
}

