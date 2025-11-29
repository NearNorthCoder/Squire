/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.widgets.Dialog
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.A;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.B;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.C;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.D;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.E;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.F;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.G;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.H;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.I;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.J;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.K;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.L;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.N;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.l;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.n;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.o;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.q;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.r;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.s;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.t;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.v;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.w;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.x;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.y;
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

public class k
implements M {
    private static /* synthetic */ String[] lIIlIIIIlIlII;
    static /* synthetic */ int bY;
    private static /* synthetic */ int[] lIIlIIIIlIlIl;
    static /* synthetic */ boolean cc;
    public static /* synthetic */ List<M> cb;
    public static /* synthetic */ String h;

    private static boolean lIlIIlllllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlllllIIlll(String var9, String var4) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIIlIIIIlIlIl[3], var3);
            return new String(var15.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllllIllll(Object object, Object object2) {
        return object == object2;
    }

    public static void aq() {
        if (k.lIlIIlllllIllII(cb.isEmpty() ? 1 : 0) && k.lIlIIlllllIllIl(bY, lIIlIIIIlIlIl[0])) {
            M[] mArray = new M[lIIlIIIIlIlIl[1]];
            mArray[k.lIIlIIIIlIlIl[2]] = new o();
            mArray[k.lIIlIIIIlIlIl[0]] = new s();
            mArray[k.lIIlIIIIlIlIl[3]] = new v();
            mArray[k.lIIlIIIIlIlIl[4]] = new x();
            mArray[k.lIIlIIIIlIlIl[5]] = new y();
            List<M> list = Arrays.asList(mArray);
            M[] mArray2 = new M[lIIlIIIIlIlIl[4]];
            mArray2[k.lIIlIIIIlIlIl[2]] = new n();
            mArray2[k.lIIlIIIIlIlIl[0]] = new l();
            mArray2[k.lIIlIIIIlIlIl[3]] = new F();
            List<M> list2 = Arrays.asList(mArray2);
            M[] mArray3 = new M[lIIlIIIIlIlIl[4]];
            mArray3[k.lIIlIIIIlIlIl[2]] = new N();
            mArray3[k.lIIlIIIIlIlIl[0]] = new t();
            mArray3[k.lIIlIIIIlIlIl[3]] = new C();
            List<M> list3 = Arrays.asList(mArray3);
            M[] mArray4 = new M[lIIlIIIIlIlIl[6]];
            mArray4[k.lIIlIIIIlIlIl[2]] = new A();
            mArray4[k.lIIlIIIIlIlIl[0]] = new B();
            mArray4[k.lIIlIIIIlIlIl[3]] = new D();
            mArray4[k.lIIlIIIIlIlIl[4]] = new E();
            mArray4[k.lIIlIIIIlIlIl[5]] = new G();
            mArray4[k.lIIlIIIIlIlIl[1]] = new H();
            mArray4[k.lIIlIIIIlIlIl[7]] = new I();
            mArray4[k.lIIlIIIIlIlIl[8]] = new J();
            mArray4[k.lIIlIIIIlIlIl[9]] = new K();
            mArray4[k.lIIlIIIIlIlIl[10]] = new r();
            mArray4[k.lIIlIIIIlIlIl[11]] = new q();
            mArray4[k.lIIlIIIIlIlIl[12]] = new L();
            List<M> list4 = Arrays.asList(mArray4);
            Collections.shuffle(list);
            Collections.shuffle(list2);
            Collections.shuffle(list3);
            Collections.shuffle(list4);
            cb.addAll(list);
            0;
            cb.addAll(list2);
            0;
            cb.addAll(list3);
            0;
            cb.addAll(list4);
            0;
            cb.add(new w());
            0;
            bY += lIIlIIIIlIlIl[0];
            if (k.lIlIIlllllIlllI(cb.isEmpty() ? 1 : 0)) {
                if (k.lIlIIlllllIllII(cc ? 1 : 0)) {
                    Collections.shuffle(cb);
                }
                System.out.println("Switching to : " + cb.get(lIIlIIIIlIlIl[2]).Z());
                h = cb.get(lIIlIIIIlIlIl[2]).Z();
            }
        }
        while (k.lIlIIlllllIlllI(cb.isEmpty() ? 1 : 0) && k.lIlIIlllllIlllI(AccBuilderRat.d ? 1 : 0)) {
            if (!k.lIlIIlllllIllll(Game.getState(), GameState.LOGGED_IN)) continue;
            if (k.lIlIIlllllIllII(cb.get(lIIlIIIIlIlIl[2]).aa() ? 1 : 0)) {
                AccBuilderRat.f += lIIlIIIIlIlIl[0];
                System.out.println("Achieved " + cb.get(lIIlIIIIlIlIl[2]).Z() + " goal");
                cb.remove(lIIlIIIIlIlIl[2]);
                0;
                if (k.lIlIIlllllIlllI(cb.isEmpty() ? 1 : 0)) {
                    System.out.println("Switching to : " + cb.get(lIIlIIIIlIlIl[2]).Z());
                    h = cb.get(lIIlIIIIlIlIl[2]).Z();
                }
                if (k.lIlIIlllllIllII(cb.isEmpty() ? 1 : 0)) {
                    h = lIIlIIIIlIlII[lIIlIIIIlIlIl[2]];
                }
                Time.sleepTicks((int)lIIlIIIIlIlIl[5]);
                0;
            }
            if (k.lIlIIlllllIllll(Game.getState(), GameState.LOGGED_IN)) {
                while (k.lIlIIlllllIllII(e.y() ? 1 : 0) && k.lIlIIlllllIlllI(AccBuilderRat.d ? 1 : 0) && k.lIlIIllllllIIII(e.j(lIIlIIIIlIlIl[13]), lIIlIIIIlIlIl[14]) && k.lIlIIlllllIlllI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIlIlII[lIIlIIIIlIlIl[0]];
                    e.z();
                    Time.sleepTicks((int)lIIlIIIIlIlIl[0]);
                    0;
                    0;
                    if (((0x96 ^ 0x8F ^ (0x5B ^ 0x6F)) & (0x5D ^ 0x59 ^ (0xB5 ^ 0x9C) ^ -1)) < 3) continue;
                    return;
                }
                AccBuilderRat.l = cb.get(lIIlIIIIlIlIl[2]).Z();
                int var10 = cb.get(lIIlIIIIlIlIl[2]).Y();
                Time.sleep((long)var10);
                0;
                Time.sleep((long)e.c(lIIlIIIIlIlIl[15], lIIlIIIIlIlIl[16]));
                0;
            }
            e.F();
            0;
            if (2 != 0) continue;
            return;
        }
    }

    private static boolean lIlIIlllllIlllI(int n2) {
        return n2 == 0;
    }

    private static void lIlIIlllllIlIlI() {
        lIIlIIIIlIlII = new String[lIIlIIIIlIlIl[4]];
        k.lIIlIIIIlIlII[k.lIIlIIIIlIlIl[2]] = k."none";
        k.lIIlIIIIlIlII[k.lIIlIIIIlIlIl[0]] = k."Disabling GE warning";
        k.lIIlIIIIlIlII[k.lIIlIIIIlIlIl[3]] = k."";
    }

    private static boolean lIlIIllllllIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIllllllIIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIlllllIllII(int n2) {
        return n2 != 0;
    }

    @Override
    public String Z() {
        return h;
    }

    private static String lIlIIlllllIlIIl(String var6, String var5) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var11 = var5.toCharArray();
        int var17 = lIIlIIIIlIlIl[2];
        char[] var7 = var6.toCharArray();
        int var13 = var7.length;
        int var20 = lIIlIIIIlIlIl[2];
        while (k.lIlIIlllllIllIl(var20, var13)) {
            char var8 = var7[var20];
            var14.append((char)(var8 ^ var11[var17 % var11.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void lIlIIlllllIlIll() {
        lIIlIIIIlIlIl = new int[18];
        k.lIIlIIIIlIlIl[0] = 1;
        k.lIIlIIIIlIlIl[1] = 0xA3 ^ 0xA6;
        k.lIIlIIIIlIlIl[2] = (0x60 ^ 0x29) & ~(0x3C ^ 0x75);
        k.lIIlIIIIlIlIl[3] = 2;
        k.lIIlIIIIlIlIl[4] = 3;
        k.lIIlIIIIlIlIl[5] = 0x9F ^ 0x9B;
        k.lIIlIIIIlIlIl[6] = 141 + 101 - 145 + 86 ^ 104 + 117 - 158 + 124;
        k.lIIlIIIIlIlIl[7] = 0xE ^ 0x6A ^ (0x57 ^ 0x35);
        k.lIIlIIIIlIlIl[8] = 0x98 ^ 0x9F;
        k.lIIlIIIIlIlIl[9] = 0xF5 ^ 0xB4 ^ (0xD3 ^ 0x9A);
        k.lIIlIIIIlIlIl[10] = 6 + 26 - 25 + 157 ^ 155 + 50 - 51 + 19;
        k.lIIlIIIIlIlIl[11] = 0xB9 ^ 0xB3;
        k.lIIlIIIIlIlIl[12] = 55 + 61 - 36 + 85 ^ 153 + 18 - 137 + 140;
        k.lIIlIIIIlIlIl[13] = 0xFFFFA55F & 0x5BB9;
        k.lIIlIIIIlIlIl[14] = 0xFFFFB7FC & 0x4BEB;
        k.lIIlIIIIlIlIl[15] = 108 + 71 - 64 + 36 ^ 99 + 55 - 31 + 42;
        k.lIIlIIIIlIlIl[16] = 0x26 ^ 0x52 ^ (0x66 ^ 0x42);
        k.lIIlIIIIlIlIl[17] = 0x9F ^ 0xA9 ^ (0xEA ^ 0xB8);
    }

    static {
        k.lIlIIlllllIlIll();
        k.lIlIIlllllIlIlI();
        cb = new ArrayList<M>();
        h = lIIlIIIIlIlII[lIIlIIIIlIlIl[3]];
        cc = lIIlIIIIlIlIl[2];
    }

    private static String lIlIIlllllIlIII(String var16, String var19) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIIlIIIIlIlIl[9]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIlIIIIlIlIl[3], var12);
            return new String(var18.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean X() {
        return lIIlIIIIlIlIl[2];
    }

    @Override
    public boolean aa() {
        int n2;
        if (k.lIlIIlllllIllII(cb.isEmpty() ? 1 : 0) && k.lIlIIllllllIIIl(bY)) {
            n2 = lIIlIIIIlIlIl[0];
            0;
            if (2 >= (0xBC ^ 0xB8)) {
                return false;
            }
        } else {
            n2 = lIIlIIIIlIlIl[2];
        }
        return n2 != 0;
    }

    @Override
    public int Y() {
        try {
            k.aq();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x20 ^ 0x1B) & ~(0x13 ^ 0x28)) != 0) {
            return (0xBF ^ 0xA8) & ~(3 ^ 0x14);
        }
        return lIIlIIIIlIlIl[17];
    }
}

