/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.an;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ao;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ap;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aq;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ar;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.as;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.at;
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

public class am {
    private /* synthetic */ String cU;
    private static /* synthetic */ int[] lIlIlIlIlIll;
    private /* synthetic */ List<an> cY;
    private /* synthetic */ String cW;
    private static /* synthetic */ String[] lIlIlIlIlIlI;
    private /* synthetic */ String cV;
    private /* synthetic */ boolean cX;

    private static void llIllllIIIllIl() {
        lIlIlIlIlIlI = new String[lIlIlIlIlIll[25]];
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[0]] = am."Set content or add at least one EmbedObject";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[1]] = am."content";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[2]] = am."username";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[3]] = am."avatar_url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[4]] = am."tts";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[5]] = am."title";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[6]] = am."description";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[7]] = am."url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[8]] = am."color";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[9]] = am."text";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[10]] = am."icon_url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[11]] = am."footer";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[12]] = am."url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[13]] = am."image";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[14]] = am."url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[15]] = am."thumbnail";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[16]] = am."name";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[17]] = am."url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[18]] = am."icon_url";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[19]] = am."author";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[20]] = am."name";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[21]] = am."value";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[22]] = am."inline";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[23]] = am."fields";
        am.lIlIlIlIlIlI[am.lIlIlIlIlIll[24]] = am."embeds";
    }

    private static boolean llIllllIIlIIIl(int n2) {
        return n2 == 0;
    }

    public void d(String string) {
        this.cV = string;
    }

    private static boolean llIllllIIlIIII(int n2) {
        return n2 != 0;
    }

    private static String llIllllIIIlIll(String var10, String var34) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var34.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIll[8]), "DES");
            Cipher var28 = Cipher.getInstance("DES");
            var28.init(lIlIlIlIlIll[2], var5);
            return new String(var28.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public void i(boolean bl2) {
        this.cX = bl2;
    }

    public am() {
        this.cY = new ArrayList<an>();
    }

    static {
        am.llIllllIIIlllI();
        am.llIllllIIIllIl();
    }

    private static String llIllllIIIllII(String var7, String var19) {
        try {
            SecretKeySpec var27 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var30 = Cipher.getInstance("Blowfish");
            var30.init(lIlIlIlIlIll[2], var27);
            return new String(var30.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllIIlIIlI(Object object) {
        return object != null;
    }

    public void a(an an2) {
        this.cY.add(an2);
        0;
    }

    private static void llIllllIIIlllI() {
        lIlIlIlIlIll = new int[26];
        am.lIlIlIlIlIll[0] = (0x68 ^ 0x2B) & ~(0xEE ^ 0xAD);
        am.lIlIlIlIlIll[1] = 1;
        am.lIlIlIlIlIll[2] = 2;
        am.lIlIlIlIlIll[3] = 3;
        am.lIlIlIlIlIll[4] = 183 + 170 - 223 + 63 ^ 104 + 29 - -32 + 32;
        am.lIlIlIlIlIll[5] = 0xFD ^ 0xC4 ^ (0x2A ^ 0x16);
        am.lIlIlIlIlIll[6] = 0x71 ^ 0x21 ^ (0x10 ^ 0x46);
        am.lIlIlIlIlIll[7] = 0x4A ^ 0x4D;
        am.lIlIlIlIlIll[8] = 0xFE ^ 0x98 ^ (0xEE ^ 0x80);
        am.lIlIlIlIlIll[9] = 0x6E ^ 0x67;
        am.lIlIlIlIlIll[10] = 0xFA ^ 0x8F ^ 53 + 77 - 57 + 54;
        am.lIlIlIlIlIll[11] = 0xBF ^ 0x9D ^ (0x44 ^ 0x6D);
        am.lIlIlIlIlIll[12] = (0xB4 ^ 0xBA) & ~(0x41 ^ 0x4F) ^ (0x83 ^ 0x8F);
        am.lIlIlIlIlIll[13] = 0x69 ^ 0x51 ^ (0x91 ^ 0xA4);
        am.lIlIlIlIlIll[14] = 0xE6 ^ 0xAB ^ (0xCB ^ 0x88);
        am.lIlIlIlIlIll[15] = 0x5A ^ 0x55;
        am.lIlIlIlIlIll[16] = 70 + 46 - 32 + 75 ^ 94 + 130 - 167 + 86;
        am.lIlIlIlIlIll[17] = 0xAD ^ 0xBC;
        am.lIlIlIlIlIll[18] = 0xCC ^ 0xB6 ^ (0x7E ^ 0x16);
        am.lIlIlIlIlIll[19] = 0x9B ^ 0x8B ^ 3;
        am.lIlIlIlIlIll[20] = 0x42 ^ 0x56;
        am.lIlIlIlIlIll[21] = 6 ^ 0x13;
        am.lIlIlIlIlIll[22] = 0x1E ^ 0x40 ^ (0xEB ^ 0xA3);
        am.lIlIlIlIlIll[23] = 0xB1 ^ 0xA6;
        am.lIlIlIlIlIll[24] = 0x57 ^ 0xE ^ (0xF2 ^ 0xB3);
        am.lIlIlIlIlIll[25] = 0x13 ^ 0xA;
    }

    private static boolean llIllllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    public void e(String string) {
        this.cW = string;
    }

    /*
     * WARNING - void declaration
     */
    public at cC() {
        void var1_1;
        am var31;
        if (am.llIllllIIIllll(this.cU) && am.llIllllIIlIIII(this.cY.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(lIlIlIlIlIlI[lIlIlIlIlIll[0]]);
        }
        at var32 = new at();
        var32.a(lIlIlIlIlIlI[lIlIlIlIlIll[1]], var31.cU);
        var32.a(lIlIlIlIlIlI[lIlIlIlIlIll[2]], var31.cV);
        var32.a(lIlIlIlIlIlI[lIlIlIlIlIll[3]], var31.cW);
        var32.a(lIlIlIlIlIlI[lIlIlIlIlIll[4]], var31.cX);
        if (am.llIllllIIlIIIl(var31.cY.isEmpty() ? 1 : 0)) {
            ArrayList<at> var16 = new ArrayList<at>();
            Iterator<an> var26 = var31.cY.iterator();
            while (am.llIllllIIlIIII(var26.hasNext() ? 1 : 0)) {
                Object var20;
                Object var33;
                an var22 = var26.next();
                at var17 = new at();
                var17.a(lIlIlIlIlIlI[lIlIlIlIlIll[5]], var22.cD());
                var17.a(lIlIlIlIlIlI[lIlIlIlIlIll[6]], var22.cE());
                var17.a(lIlIlIlIlIlI[lIlIlIlIlIll[7]], var22.cF());
                if (am.llIllllIIlIIlI(var22.cG())) {
                    var33 = var22.cG();
                    int var1 = ((Color)var33).getRed();
                    var1 = (var1 << lIlIlIlIlIll[8]) + ((Color)var33).getGreen();
                    var1 = (var1 << lIlIlIlIlIll[8]) + ((Color)var33).getBlue();
                    var17.a(lIlIlIlIlIlI[lIlIlIlIlIll[8]], var1);
                }
                var33 = var22.cH();
                ar var1 = var22.cJ();
                as var23 = var22.cI();
                ao var24 = var22.cK();
                List<ap> var2 = var22.cL();
                if (am.llIllllIIlIIlI(var33)) {
                    var20 = new at();
                    ((at)var20).a(lIlIlIlIlIlI[lIlIlIlIlIll[9]], ((aq)var33).getText());
                    ((at)var20).a(lIlIlIlIlIlI[lIlIlIlIlIll[10]], ((aq)var33).cM());
                    var17.a(lIlIlIlIlIlI[lIlIlIlIlIll[11]], var20);
                }
                if (am.llIllllIIlIIlI(var1)) {
                    var20 = new at();
                    ((at)var20).a(lIlIlIlIlIlI[lIlIlIlIlIll[12]], var1.cF());
                    var17.a(lIlIlIlIlIlI[lIlIlIlIlIll[13]], var20);
                }
                if (am.llIllllIIlIIlI(var23)) {
                    var20 = new at();
                    ((at)var20).a(lIlIlIlIlIlI[lIlIlIlIlIll[14]], var23.cF());
                    var17.a(lIlIlIlIlIlI[lIlIlIlIlIll[15]], var20);
                }
                if (am.llIllllIIlIIlI(var24)) {
                    var20 = new at();
                    ((at)var20).a(lIlIlIlIlIlI[lIlIlIlIlIll[16]], var24.bX());
                    ((at)var20).a(lIlIlIlIlIlI[lIlIlIlIlIll[17]], var24.cF());
                    ((at)var20).a(lIlIlIlIlIlI[lIlIlIlIlIll[18]], var24.cM());
                    var17.a(lIlIlIlIlIlI[lIlIlIlIlIll[19]], var20);
                }
                var20 = new ArrayList();
                Iterator<ap> var29 = var2.iterator();
                while (am.llIllllIIlIIII(var29.hasNext() ? 1 : 0)) {
                    ap var6 = var29.next();
                    at var25 = new at();
                    var25.a(lIlIlIlIlIlI[lIlIlIlIlIll[20]], var6.bX());
                    var25.a(lIlIlIlIlIlI[lIlIlIlIlIll[21]], var6.cN());
                    var25.a(lIlIlIlIlIlI[lIlIlIlIlIll[22]], var6.cO());
                    var20.add(var25);
                    0;
                    0;
                    if (3 >= 0) continue;
                    return null;
                }
                var17.a(lIlIlIlIlIlI[lIlIlIlIlIll[23]], var20.toArray());
                var16.add(var17);
                0;
                0;
                if (-2 < 0) continue;
                return null;
            }
            var32.a(lIlIlIlIlIlI[lIlIlIlIlIll[24]], var16.toArray());
        }
        return var1_1;
    }

    private static String llIllllIIIlIlI(String var14, String var9) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var8 = var9.toCharArray();
        int var15 = lIlIlIlIlIll[0];
        char[] var21 = var14.toCharArray();
        int var12 = var21.length;
        int var3 = lIlIlIlIlIll[0];
        while (am.llIllllIIlIIll(var3, var12)) {
            char var13 = var21[var3];
            var4.append((char)(var13 ^ var8[var15 % var8.length]));
            0;
            ++var15;
            ++var3;
            0;
            if (((65 + 6 - 4 + 92 ^ 115 + 31 - 46 + 47) & (0xC9 ^ 0xC2 ^ (0x4E ^ 0x49) ^ -1)) != (0xFD ^ 0xA1 ^ (0x3D ^ 0x65))) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean llIllllIIIllll(Object object) {
        return object == null;
    }

    public void c(String string) {
        this.cU = string;
    }
}

