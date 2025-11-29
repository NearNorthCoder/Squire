/*
 * Decompiled with CFR 0.152.
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.F_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.G;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.H;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.I;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.J;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.K;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.L_Unknown;

public class E_Unknown {
    private /* synthetic */ List<F> bl;
    private /* synthetic */ boolean bk;
    private static /* synthetic */ String[] llIlIlIllII;
    private /* synthetic */ String bi;
    private static /* synthetic */ int[] llIlIlIllIl;
    private /* synthetic */ String bj;
    private /* synthetic */ String bh;

    private static boolean lIlIIlllIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public void d(boolean bl2) {
        this.bk = bl2;
    }

    /*
     * WARNING - void declaration
     */
    public L aw() {
        void var1_1;
        E var34;
        if (E.lIlIIlllIIlllI(this.bh) && E.lIlIIlllIIllll(this.bl.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(llIlIlIllII[llIlIlIllIl[0]]);
        }
        L var21 = new L();
        var21.a(llIlIlIllII[llIlIlIllIl[1]], var34.bh);
        var21.a(llIlIlIllII[llIlIlIllIl[2]], var34.bi);
        var21.a(llIlIlIllII[llIlIlIllIl[3]], var34.bj);
        var21.a(llIlIlIllII[llIlIlIllIl[4]], var34.bk);
        if (E.lIlIIlllIlIIII(var34.bl.isEmpty() ? 1 : 0)) {
            ArrayList<L> var23 = new ArrayList<L>();
            Iterator<F> var33 = var34.bl.iterator();
            while (E.lIlIIlllIIllll(var33.hasNext() ? 1 : 0)) {
                Object var6;
                Object var1;
                F var16 = var33.next();
                L var22 = new L();
                var22.a(llIlIlIllII[llIlIlIllIl[5]], var16.ax());
                var22.a(llIlIlIllII[llIlIlIllIl[6]], var16.ay());
                var22.a(llIlIlIllII[llIlIlIllIl[7]], var16.az());
                if (E.lIlIIlllIlIIIl(var16.aA())) {
                    var1 = var16.aA();
                    int var3 = ((Color)var1).getRed();
                    var3 = (var3 << llIlIlIllIl[8]) + ((Color)var1).getGreen();
                    var3 = (var3 << llIlIlIllIl[8]) + ((Color)var1).getBlue();
                    var22.a(llIlIlIllII[llIlIlIllIl[8]], var3);
                }
                var1 = var16.aB();
                J var3 = var16.aD();
                K var24 = var16.aC();
                G var2 = var16.aE();
                List<H> var17 = var16.aF();
                if (E.lIlIIlllIlIIIl(var1)) {
                    var6 = new L();
                    ((L)var6).a(llIlIlIllII[llIlIlIllIl[9]], ((I)var1).aJ());
                    ((L)var6).a(llIlIlIllII[llIlIlIllIl[10]], ((I)var1).aG());
                    var22.a(llIlIlIllII[llIlIlIllIl[11]], var6);
                }
                if (E.lIlIIlllIlIIIl(var3)) {
                    var6 = new L();
                    ((L)var6).a(llIlIlIllII[llIlIlIllIl[12]], var3.az());
                    var22.a(llIlIlIllII[llIlIlIllIl[13]], var6);
                }
                if (E.lIlIIlllIlIIIl(var24)) {
                    var6 = new L();
                    ((L)var6).a(llIlIlIllII[llIlIlIllIl[14]], var24.az());
                    var22.a(llIlIlIllII[llIlIlIllIl[15]], var6);
                }
                if (E.lIlIIlllIlIIIl(var2)) {
                    var6 = new L();
                    ((L)var6).a(llIlIlIllII[llIlIlIllIl[16]], var2.l());
                    ((L)var6).a(llIlIlIllII[llIlIlIllIl[17]], var2.az());
                    ((L)var6).a(llIlIlIllII[llIlIlIllIl[18]], var2.aG());
                    var22.a(llIlIlIllII[llIlIlIllIl[19]], var6);
                }
                var6 = new ArrayList();
                Iterator<H> var12 = var17.iterator();
                while (E.lIlIIlllIIllll(var12.hasNext() ? 1 : 0)) {
                    H var27 = var12.next();
                    L var25 = new L();
                    var25.a(llIlIlIllII[llIlIlIllIl[20]], var27.l());
                    var25.a(llIlIlIllII[llIlIlIllIl[21]], var27.aH());
                    var25.a(llIlIlIllII[llIlIlIllIl[22]], var27.aI());
                    var6.add(var25);
                    0;
                    0;
                    if (3 != 2) continue;
                    return null;
                }
                var22.a(llIlIlIllII[llIlIlIllIl[23]], var6.toArray());
                var23.add(var22);
                0;
                0;
                if (((233 + 166 - 374 + 212 ^ 104 + 119 - 222 + 184) & (0x23 ^ 0x14 ^ (0x51 ^ 0x32) ^ -1)) == ((0x4C ^ 0x15 ^ (0x64 ^ 0x18)) & (11 + 42 - -39 + 50 ^ 66 + 118 - 135 + 122 ^ -1))) continue;
                return null;
            }
            var21.a(llIlIlIllII[llIlIlIllIl[24]], var23.toArray());
        }
        return var1_1;
    }

    private static String lIlIIlllIIlIIl(String var13, String var32) {
        try {
            SecretKeySpec var30 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var32.getBytes(StandardCharsets.UTF_8)), llIlIlIllIl[8]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(llIlIlIllIl[2], var30);
            return new String(var9.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    public void a(F f2) {
        this.bl.add(f2);
        0;
    }

    public void c(String string) {
        this.bj = string;
    }

    static {
        E.lIlIIlllIIllIl();
        E.lIlIIlllIIllII();
    }

    private static void lIlIIlllIIllII() {
        llIlIlIllII = new String[llIlIlIllIl[25]];
        E.llIlIlIllII[E.llIlIlIllIl[0]] = E."Set content or add at least one EmbedObject";
        E.llIlIlIllII[E.llIlIlIllIl[1]] = E."content";
        E.llIlIlIllII[E.llIlIlIllIl[2]] = E."username";
        E.llIlIlIllII[E.llIlIlIllIl[3]] = E."avatar_url";
        E.llIlIlIllII[E.llIlIlIllIl[4]] = E."tts";
        E.llIlIlIllII[E.llIlIlIllIl[5]] = E."title";
        E.llIlIlIllII[E.llIlIlIllIl[6]] = E."description";
        E.llIlIlIllII[E.llIlIlIllIl[7]] = E."url";
        E.llIlIlIllII[E.llIlIlIllIl[8]] = E."color";
        E.llIlIlIllII[E.llIlIlIllIl[9]] = E."text";
        E.llIlIlIllII[E.llIlIlIllIl[10]] = E."icon_url";
        E.llIlIlIllII[E.llIlIlIllIl[11]] = E."footer";
        E.llIlIlIllII[E.llIlIlIllIl[12]] = E."url";
        E.llIlIlIllII[E.llIlIlIllIl[13]] = E."image";
        E.llIlIlIllII[E.llIlIlIllIl[14]] = E."url";
        E.llIlIlIllII[E.llIlIlIllIl[15]] = E."thumbnail";
        E.llIlIlIllII[E.llIlIlIllIl[16]] = E."name";
        E.llIlIlIllII[E.llIlIlIllIl[17]] = E."url";
        E.llIlIlIllII[E.llIlIlIllIl[18]] = E."icon_url";
        E.llIlIlIllII[E.llIlIlIllIl[19]] = E."author";
        E.llIlIlIllII[E.llIlIlIllIl[20]] = E."name";
        E.llIlIlIllII[E.llIlIlIllIl[21]] = E."value";
        E.llIlIlIllII[E.llIlIlIllIl[22]] = E."inline";
        E.llIlIlIllII[E.llIlIlIllIl[23]] = E."fields";
        E.llIlIlIllII[E.llIlIlIllIl[24]] = E."embeds";
    }

    private static void lIlIIlllIIllIl() {
        llIlIlIllIl = new int[26];
        E.llIlIlIllIl[0] = (0xCA ^ 0x9A) & ~(0x48 ^ 0x18);
        E.llIlIlIllIl[1] = 1;
        E.llIlIlIllIl[2] = 2;
        E.llIlIlIllIl[3] = 3;
        E.llIlIlIllIl[4] = 84 + 133 - 161 + 87 ^ 78 + 129 - 200 + 132;
        E.llIlIlIllIl[5] = 0x60 ^ 0x65;
        E.llIlIlIllIl[6] = 162 + 130 - 264 + 145 ^ 142 + 61 - 168 + 136;
        E.llIlIlIllIl[7] = 0x64 ^ 0x30 ^ (0x70 ^ 0x23);
        E.llIlIlIllIl[8] = 116 + 143 - 214 + 109 ^ 124 + 104 - 204 + 122;
        E.llIlIlIllIl[9] = 0x53 ^ 0x61 ^ (0xA7 ^ 0x9C);
        E.llIlIlIllIl[10] = 0x62 ^ 1 ^ (0x51 ^ 0x38);
        E.llIlIlIllIl[11] = 0xB5 ^ 0xBE;
        E.llIlIlIllIl[12] = 0xB7 ^ 0xC2 ^ (0xBC ^ 0xC5);
        E.llIlIlIllIl[13] = 0x58 ^ 0x56 ^ 3;
        E.llIlIlIllIl[14] = 0x20 ^ 0x2E;
        E.llIlIlIllIl[15] = 0xB5 ^ 0xBA;
        E.llIlIlIllIl[16] = 115 + 81 - 192 + 146 ^ 120 + 31 - 80 + 63;
        E.llIlIlIllIl[17] = 0x81 ^ 0x90;
        E.llIlIlIllIl[18] = 0xD6 ^ 0xC4;
        E.llIlIlIllIl[19] = 0x57 ^ 0x44;
        E.llIlIlIllIl[20] = 0x6C ^ 0x61 ^ (0x26 ^ 0x3F);
        E.llIlIlIllIl[21] = 0x6E ^ 0x7B;
        E.llIlIlIllIl[22] = 0x2D ^ 0x3B;
        E.llIlIlIllIl[23] = 0xE3 ^ 0x9F ^ (0x32 ^ 0x59);
        E.llIlIlIllIl[24] = 0x5E ^ 0x46;
        E.llIlIlIllIl[25] = 0x40 ^ 0x51 ^ (0x25 ^ 0x2D);
    }

    private static boolean lIlIIlllIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlllIlIIII(int n2) {
        return n2 == 0;
    }

    public E() {
        this.bl = new ArrayList<F>();
    }

    private static boolean lIlIIlllIlIIIl(Object object) {
        return object != null;
    }

    public void b(String string) {
        this.bi = string;
    }

    private static boolean lIlIIlllIIlllI(Object object) {
        return object == null;
    }

    private static String lIlIIlllIIlIlI(String var5, String var11) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var26 = var11.toCharArray();
        int var7 = llIlIlIllIl[0];
        char[] var19 = var5.toCharArray();
        int var20 = var19.length;
        int var14 = llIlIlIllIl[0];
        while (E.lIlIIlllIlIIlI(var14, var20)) {
            char var8 = var19[var14];
            var31.append((char)(var8 ^ var26[var7 % var26.length]));
            0;
            ++var7;
            ++var14;
            0;
            if (((0x15 ^ 0 ^ (0xE6 ^ 0xA5)) & (77 + 76 - 32 + 23 ^ 113 + 109 - 109 + 85 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var31);
    }

    public void a(String string) {
        this.bh = string;
    }

    private static String lIlIIlllIIlIll(String var10, String var4) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var28 = Cipher.getInstance("Blowfish");
            var28.init(llIlIlIllIl[2], var18);
            return new String(var28.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }
}

