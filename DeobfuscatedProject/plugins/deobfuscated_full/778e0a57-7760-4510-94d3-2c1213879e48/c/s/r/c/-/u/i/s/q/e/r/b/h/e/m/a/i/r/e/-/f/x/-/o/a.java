/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Tile
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.K;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.M;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.O;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.b;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

public class a {
    private static final /* synthetic */ String[] a;
    private final /* synthetic */ N[] b;
    private /* synthetic */ K d;
    private /* synthetic */ WorldPoint e;
    private static /* synthetic */ String[] lIlIllIIllIl;
    private final /* synthetic */ WorldPoint[] c;
    private static /* synthetic */ int[] lIlIllIIlllI;
    private /* synthetic */ int f;
    private /* synthetic */ String g;

    private static boolean llIllllllllllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public List<N> e() {
        ArrayList<N> arrayList = new ArrayList<N>();
        Iterator<O> var54 = this.j().bP().iterator();
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllII(var54.hasNext() ? 1 : 0)) {
            void var35;
            a var11;
            O var31 = var54.next();
            int var56 = var31.bZ();
            N var63 = var11.b(var56);
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIlI((Object)var63)) {
                0;
                
                return null;
            }
            var35.add(var63);
            0;
            0;
            if (((0x5C ^ 0x7E ^ (0x66 ^ 0x55)) & (0x8C ^ 0xBA ^ (0x7F ^ 0x58) ^ -1)) == 0) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean llIllllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    public N b(int n2) {
        return this.b[n2];
    }

    private static String llIlllllllIllI(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var47 = var16.toCharArray();
        int var29 = lIlIllIIlllI[1];
        char[] var22 = var15.toCharArray();
        int var41 = var22.length;
        int var23 = lIlIllIIlllI[1];
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(var23, var41)) {
            char var10 = var22[var23];
            var3.append((char)(var10 ^ var47[var29 % var47.length]));
            0;
            ++var29;
            ++var23;
            0;
            
            return null;
        }
        return String.valueOf(var3);
    }

    public K j() {
        return this.d;
    }

    /*
     * WARNING - void declaration
     */
    public N[] c() {
        ArrayList arrayList = new ArrayList();
        Iterator<O> var38 = this.d.bP().iterator();
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllII(var38.hasNext() ? 1 : 0)) {
            a var59;
            O var32 = var38.next();
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIlI(var32)) {
                0;
                if (3 >= ((0x2B ^ 0 ^ (0x48 ^ 0x29)) & (0xF5 ^ 0x97 ^ (0x64 ^ 0x4C) ^ -1))) continue;
                return null;
            }
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllllI((Object)var59.b[var32.bZ()].bY(), (Object)P.COMBAT)) {
                void var37;
                var37.add(var59.b[var32.bZ()]);
                0;
            }
            0;
            if (-3 < 0) continue;
            return null;
        }
        return arrayList.toArray(new N[lIlIllIIlllI[1]]);
    }

    public int a() {
        int var5 = lIlIllIIlllI[1];
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(var5, lIlIllIIlllI[0])) {
            a var24;
            WorldPoint var45 = var24.a(var5);
            WorldArea var21 = new WorldArea(var45, lIlIllIIlllI[8], lIlIllIIlllI[8]);
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllII(var21.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
                return var5;
            }
            ++var5;
            0;
            if (2 <= (0xC ^ 0x26 ^ (0xBB ^ 0x95))) continue;
            return (19 + 55 - -54 + 8 ^ 63 + 133 - 108 + 111) & (0x10 ^ 0x27 ^ (0x54 ^ 0x2C) ^ -1);
        }
        return lIlIllIIlllI[9];
    }

    /*
     * WARNING - void declaration
     */
    public void a(K k2) {
        a var49;
        void var53;
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIlI(k2)) {
            return;
        }
        String[] lllllllllllllllIllIIllIIIllIIlIl22 = a;
        int lllllllllllllllIllIIllIIIllIIlII2 = lllllllllllllllIllIIllIIIllIIlIl22.length;
        int lllllllllllllllIllIIllIIIllIIIll2 = lIlIllIIlllI[1];
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(lllllllllllllllIllIIllIIIllIIIll2, lllllllllllllllIllIIllIIIllIIlII2)) {
            String var17 = lllllllllllllllIllIIllIIIllIIlIl22[lllllllllllllllIllIIllIIIllIIIll2];
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllII(var17.startsWith(var53.bO()) ? 1 : 0)) {
                var49.g = var17.split(lIlIllIIllIl[lIlIllIIlllI[1]])[lIlIllIIlllI[2]].trim();
            }
            ++lllllllllllllllIllIIllIIIllIIIll2;
            0;
            if ((0x8C ^ 0xBF ^ (0x47 ^ 0x70)) == (0xFF ^ 0xA4 ^ (0xF6 ^ 0xA9))) continue;
            return;
        }
        var49.d = var53;
        int lllllllllllllllIllIIllIIIllIIlIl22 = lIlIllIIlllI[1];
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(lllllllllllllllIllIIllIIIllIIlIl22, var49.b.length)) {
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIlI(var53.w(lllllllllllllllIllIIllIIIllIIlIl22))) {
                0;
                
                }
            } else {
                N lllllllllllllllIllIIllIIIllIIlII2 = var49.b[lllllllllllllllIllIIllIIIllIIlIl22];
                if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIlI((Object)lllllllllllllllIllIIllIIIllIIlII2)) {
                    P lllllllllllllllIllIIllIIIllIIIll2 = P.c(var53.w(lllllllllllllllIllIIllIIIllIIlIl22).ca());
                    lllllllllllllllIllIIllIIIllIIlII2 = lllllllllllllllIllIIllIIIllIIIll2.ce();
                    var49.a(lllllllllllllllIllIIllIIIllIIlII2, lllllllllllllllIllIIllIIIllIIlIl22);
                }
            }
            ++lllllllllllllllIllIIllIIIllIIlIl22;
            0;
            if (-(29 + 41 - 10 + 130 ^ 172 + 117 - 184 + 81) <= 0) continue;
            return;
        }
    }

    private static boolean llIlllllllllII(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIIIIIIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static String llIlllllllIlll(String var48, String var42) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var42.getBytes(StandardCharsets.UTF_8)), lIlIllIIlllI[4]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIlIllIIlllI[7], var25);
            return new String(var9.doFinal(Base64.getDecoder().decode(var48.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllllllllIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean g() {
        void var65;
        List<N> list = this.e();
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lllIIIIIIIIIII(list.contains((Object)N.VESPULA) ? 1 : 0)) {
            return lIlIllIIlllI[1];
        }
        int var66 = lIlIllIIlllI[1];
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(var66, var65.size())) {
            N var6 = (N)((Object)var65.get(var66));
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lllIIIIIIIIIIl((Object)var6, (Object)N.START) && c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lllIIIIIIIIIIl((Object)var6, (Object)N.SCAVENGERS) && c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lllIIIIIIIIIIl((Object)var6, (Object)N.FARMING)) {
                if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllllI((Object)var6, (Object)N.END)) {
                    0;
                    if (3 < 0) {
                        return ((0x6C ^ 0x3A ^ (0x9D ^ 0x91)) & (0x27 ^ 0x4C ^ (4 ^ 0x35) ^ -1)) != 0;
                    }
                } else {
                    a var69;
                    if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllllI((Object)var6, (Object)N.VESPULA)) {
                        0;
                        if (1 > -1) break;
                        return false;
                    }
                    if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllII(var69.b(var6) ? 1 : 0)) {
                        return lIlIllIIlllI[2];
                    }
                }
            }
            ++var66;
            0;
            if (-1 <= 0) continue;
            return ((0x3E ^ 0x1B ^ (0xB2 ^ 0xC1)) & (83 + 6 - -54 + 2 ^ 160 + 130 - 269 + 178 ^ -1)) != 0;
        }
        return lIlIllIIlllI[1];
    }

    public boolean a(N n2) {
        switch (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.b.i[n2.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return lIlIllIIlllI[2];
            }
        }
        return lIlIllIIlllI[1];
    }

    public boolean b(N n2) {
        switch (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.b.i[n2.ordinal()]) {
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return lIlIllIIlllI[2];
            }
        }
        return lIlIllIIlllI[1];
    }

    public WorldPoint k() {
        return this.e;
    }

    /*
     * WARNING - void declaration
     */
    String f() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<N> var67 = this.e().iterator();
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllII(var67.hasNext() ? 1 : 0)) {
            N var40 = var67.next();
            switch (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.b.h[var40.bY().ordinal()]) {
                case 1: 
                case 2: {
                    void var26;
                    var26.append(var40.bX()).append(lIlIllIIllIl[lIlIllIIlllI[2]]);
                    0;
                }
            }
            0;
            if (2 > 0) continue;
            return null;
        }
        String string = String.valueOf(stringBuilder);
        return string.substring(lIlIllIIlllI[1], string.length() - lIlIllIIlllI[7]);
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint a(int n2) {
        void var6_6;
        void var5_5;
        void var4_4;
        void var8_8;
        void var7_7;
        int n3;
        int n4;
        void var27;
        a var20;
        int n5;
        void var68;
        int n6;
        int n7 = this.l();
        int n8 = n7 % lIlIllIIlllI[3];
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllIl(n7 % lIlIllIIlllI[4], lIlIllIIlllI[5])) {
            n6 = lIlIllIIlllI[2];
            0;
            if ((0xA2 ^ 0xA7) <= 0) {
                return null;
            }
        } else {
            int var60;
            n6 = var60 = lIlIllIIlllI[1];
        }
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllIl((int)var68, lIlIllIIlllI[6])) {
            n5 = lIlIllIIlllI[7];
            0;
            if (-1 > 1) {
                return null;
            }
        } else {
            n5 = lIlIllIIlllI[5];
        }
        int lllllllllllllllIllIIllIIIlIIllII = n5;
        WorldPoint lllllllllllllllIllIIllIIIlIIlIll = var20.k();
        void lllllllllllllllIllIIllIIIlIIlIlI = var27 % lIlIllIIlllI[3];
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllIl((int)(var27 % lIlIllIIlllI[4]), lIlIllIIlllI[5])) {
            n4 = lIlIllIIlllI[2];
            0;
            if (1 != 1) {
                return null;
            }
        } else {
            int var7;
            n4 = var7 = lIlIllIIlllI[1];
        }
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllIl((int)var27, lIlIllIIlllI[6])) {
            n3 = lIlIllIIlllI[7];
            0;
            if ((0x5F ^ 0x41 ^ (0x23 ^ 0x39)) == 3) {
                return null;
            }
        } else {
            n3 = lIlIllIIlllI[5];
        }
        int n9 = n3;
        void var10_10 = var7_7 - n8;
        void var11_11 = var8_8 - var4_4;
        int n10 = n9 - var5_5;
        int n11 = var6_6.getX() + lIlIllIIlllI[8] * var10_10;
        int n12 = var6_6.getY() - lIlIllIIlllI[8] * var11_11;
        int n13 = var6_6.getPlane() + n10;
        return new WorldPoint(n11, n12, n13);
    }

    public int b() {
        a var50;
        int var18 = lIlIllIIlllI[1];
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(var18, var50.c.length)) {
            WorldPoint var36 = var50.c[var18];
            WorldArea var43 = new WorldArea(var36, lIlIllIIlllI[8], lIlIllIIlllI[8]);
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllII(var43.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
                return var18;
            }
            ++var18;
            0;
            if (3 != 0) continue;
            return (0xAA ^ 0x9B) & ~(0x59 ^ 0x68);
        }
        return lIlIllIIlllI[9];
    }

    public N[] h() {
        return this.b;
    }

    public int l() {
        return this.f;
    }

    static {
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIIl();
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIII();
        String[] stringArray = new String[lIlIllIIlllI[10]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[1]] = lIlIllIIllIl[lIlIllIIlllI[7]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[2]] = lIlIllIIllIl[lIlIllIIlllI[5]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[7]] = lIlIllIIllIl[lIlIllIIlllI[3]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[5]] = lIlIllIIllIl[lIlIllIIlllI[11]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[3]] = lIlIllIIllIl[lIlIllIIlllI[12]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[11]] = lIlIllIIllIl[lIlIllIIlllI[6]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[12]] = lIlIllIIllIl[lIlIllIIlllI[4]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[6]] = lIlIllIIllIl[lIlIllIIlllI[13]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[4]] = lIlIllIIllIl[lIlIllIIlllI[14]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[13]] = lIlIllIIllIl[lIlIllIIlllI[15]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[14]] = lIlIllIIllIl[lIlIllIIlllI[16]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[15]] = lIlIllIIllIl[lIlIllIIlllI[17]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[16]] = lIlIllIIllIl[lIlIllIIlllI[18]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[17]] = lIlIllIIllIl[lIlIllIIlllI[19]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[18]] = lIlIllIIllIl[lIlIllIIlllI[0]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[19]] = lIlIllIIllIl[lIlIllIIlllI[20]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[0]] = lIlIllIIllIl[lIlIllIIlllI[21]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[20]] = lIlIllIIllIl[lIlIllIIlllI[22]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[21]] = lIlIllIIllIl[lIlIllIIlllI[23]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[22]] = lIlIllIIllIl[lIlIllIIlllI[24]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[23]] = lIlIllIIllIl[lIlIllIIlllI[25]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[24]] = lIlIllIIllIl[lIlIllIIlllI[26]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[25]] = lIlIllIIllIl[lIlIllIIlllI[27]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[26]] = lIlIllIIllIl[lIlIllIIlllI[28]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[27]] = lIlIllIIllIl[lIlIllIIlllI[10]];
        stringArray[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[28]] = lIlIllIIllIl[lIlIllIIlllI[29]];
        a = stringArray;
    }

    private static void llIllllllllIIl() {
        lIlIllIIlllI = new int[31];
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[0] = 0xCC ^ 0xA5 ^ (0xBB ^ 0xC2);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[1] = (0xAA ^ 0xBB) & ~(0x14 ^ 5);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[2] = 1;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[3] = 0x50 ^ 0x3D ^ (0x36 ^ 0x5F);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[4] = 0x49 ^ 0x41;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[5] = 3;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[6] = 0x1E ^ 0x64 ^ (0x1E ^ 0x63);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[7] = 2;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[8] = 0x16 ^ 0x47 ^ (0xE7 ^ 0x96);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[9] = -1;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[10] = 0x9D ^ 0xA7 ^ (0xE1 ^ 0xC1);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[11] = 0x76 ^ 0x67 ^ (0xBC ^ 0xA8);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[12] = 0x1E ^ 3 ^ (0x80 ^ 0x9B);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[13] = 0x1A ^ 0x13;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[14] = 74 + 104 - 108 + 62 ^ 130 + 87 - 201 + 126;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[15] = 0x2F ^ 0x24;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[16] = 0xB2 ^ 0xBE;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[17] = 68 + 68 - 135 + 155 ^ 2 + 21 - 14 + 136;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[18] = 0x7F ^ 0x71;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[19] = 0x29 ^ 0x26;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[20] = 0x3D ^ 0x1C ^ (0xF1 ^ 0xC1);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[21] = 0xD4 ^ 0xC6;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[22] = 29 + 131 - 104 + 91 ^ 62 + 33 - -24 + 9;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[23] = 0x12 ^ 0x5E ^ (5 ^ 0x5D);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[24] = 0xA4 ^ 0xB1;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[25] = 0x75 ^ 0x63;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[26] = 76 + 129 - 125 + 70 ^ 54 + 72 - 85 + 88;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[27] = 0xB1 ^ 0xA9;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[28] = 0x1D ^ 4;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[29] = 0xB2 ^ 0xA9;
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[30] = 0x1E ^ 2;
    }

    public WorldPoint[] i() {
        return this.c;
    }

    public a(WorldPoint worldPoint, int n2) {
        this.b = new N[lIlIllIIlllI[0]];
        this.c = new WorldPoint[lIlIllIIlllI[0]];
        this.e = worldPoint;
        this.f = n2;
    }

    private static boolean lllIIIIIIIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public void a(N[] nArray) {
        int n2 = lIlIllIIlllI[1];
        Iterator<O> var2 = this.d.bP().iterator();
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllII(var2.hasNext() ? 1 : 0)) {
            a var57;
            O var44 = var2.next();
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIlI(var44)) {
                0;
                if (1 > ((0x7C ^ 0x59) & ~(0x33 ^ 0x16))) continue;
                return;
            }
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllllI((Object)var57.b[var44.bZ()].bY(), (Object)P.COMBAT)) {
                void var33;
                void var34;
                var57.b[var44.bZ()] = var34[var33];
                ++var33;
            }
            0;
            if (-2 < 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public M c(int n2) {
        void var6_6;
        void var5_5;
        void var7_7;
        a var12;
        void var4;
        int n3;
        int var52;
        int n4;
        void var30;
        int n5;
        int n6 = this.l() % lIlIllIIlllI[3];
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllIl(this.l() % lIlIllIIlllI[4], lIlIllIIlllI[5])) {
            n5 = lIlIllIIlllI[2];
            0;
            if ((0xC9 ^ 0xBF ^ (0x31 ^ 0x43)) == -1) {
                return null;
            }
        } else {
            n5 = lIlIllIIlllI[1];
        }
        int var1 = n5;
        void var51 = var30;
        int var13 = var51 % lIlIllIIlllI[3];
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllIl((int)(var51 % lIlIllIIlllI[4]), lIlIllIIlllI[5])) {
            n4 = lIlIllIIlllI[2];
            0;
            if (2 < 0) {
                return null;
            }
        } else {
            n4 = var52 = lIlIllIIlllI[1];
        }
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllIl((int)var51, lIlIllIIlllI[6])) {
            n3 = lIlIllIIlllI[7];
            0;
            if (2 >= (0x6E ^ 0x6A)) {
                return null;
            }
        } else {
            n3 = lIlIllIIlllI[5];
        }
        int lllllllllllllllIllIIllIIIIlIIIll = n3;
        var13 -= var4;
        var52 -= var1;
        var13 = var12.k().getX() + var13 * lIlIllIIlllI[8];
        var52 = var12.k().getY() - var52 * lIlIllIIlllI[8];
        var52 -= Static.getClient().getBaseY();
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(var13 -= Static.getClient().getBaseX(), lIlIllIIlllI[2])) {
            var13 = lIlIllIIlllI[2];
        }
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(var52, lIlIllIIlllI[2])) {
            var52 = lIlIllIIlllI[2];
        }
        Tile tile = Static.getClient().getScene().getTiles()[var7_7][var5_5][var6_6];
        return this.a(tile);
    }

    private static void llIllllllllIII() {
        lIlIllIIllIl = new String[lIlIllIIlllI[30]];
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[1]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."-";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[2]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.", ";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[7]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."FSCCPPCSCF - #WNWSWN#ESEENW";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[5]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."FSCCSPCPSF - #WSEEEN#WSWNWS";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[3]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."FSCPCCSCPF - #WNWWSE#EENWWW";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[11]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCCFCPSCSF - #EEENWW#WSEEEN";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[12]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCCFPCCSPF - #NESEEN#WSWNWS";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[6]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCFCPCCSPF - #ESEENW#ESWWNW";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[4]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCFCPCSCFS - #ENEESW#ENWWSW";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[13]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCFCPCCSPCSF - #ESWWNWS#NESENES";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[14]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCFPCCSPCF - #WSWWNE#WSEENE";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[15]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCFPCPCCSF - #WSEENE#WWWSEE";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[16]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCFPCSCPCF - #NESENE#WSWWNE";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[17]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCPFCCCPSF - #NWWWSE#WNEESE";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[18]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCPFCCSPCF - #NEEESW#WWNEEE";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[19]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCPFCCSPSF - #WWSEEE#NWSWWN";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[0]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCSPFCCSPF - #ESWWNW#ESENES";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[20]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SFCCPCSCPF - #WNEESE#NWSWWN";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[21]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SFCCSPCPSF - #ENWWSW#ENESEN";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[22]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SPCFCCSPCF - #WWNEEE#WSWNWS";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[23]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SPCFCSCCPF - #ESENES#WWWNEE";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[24]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SPSFPCCCSF - #NWSWWN#ESEENW";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[25]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCFCPCSCPF - #ENESEN#WWWSEE";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[26]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCPFCPCSCF - #WNEEES#NWSWNW";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[27]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SFCCPCPCSCPF - #WSEENES#WWWNEEE";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[28]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."FSPCCPSCCF - #WWWSEE#ENWWSW";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[10]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."FSCCPPCSCF - #ENWWWS#NEESEN";
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIllIl[c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.lIlIllIIlllI[29]] = c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a."SCPFCCCSSF - #NEESEN#WSWWNE";
    }

    public String m() {
        return this.g;
    }

    public M a(Tile tile) {
        int n2 = Static.getClient().getInstanceTemplateChunks()[tile.getPlane()][tile.getSceneLocation().getX() / lIlIllIIlllI[4]][tile.getSceneLocation().getY() / lIlIllIIlllI[4]];
        M m2 = M.x(n2);
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIlI((Object)m2)) {
            return M.RAIDS_EMPTY;
        }
        return m2;
    }

    private static boolean llIlllllllllll(Object object) {
        return object != null;
    }

    private static String llIlllllllIlIl(String var61, String var8) {
        try {
            SecretKeySpec var62 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIlIllIIlllI[7], var62);
            return new String(var19.doFinal(Base64.getDecoder().decode(var61.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var55) {
            var55.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllllllIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public String d() {
        void var14;
        StringBuilder stringBuilder = new StringBuilder();
        N[] nArray = this.b;
        int n2 = nArray.length;
        int var58 = lIlIllIIlllI[1];
        while (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(var58, (int)var14)) {
            void var39;
            void var46;
            void var64 = var46[var58];
            if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIlllllllllll(var64)) {
                var39.append(var64.bY().cf());
                0;
                0;
                
                }
            } else {
                var39.append(lIlIllIIlllI[8]);
                0;
            }
            ++var58;
            0;
            
            return null;
        }
        return String.valueOf(stringBuilder);
    }

    public void a(N n2, int n3) {
        if (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a.llIllllllllIll(n3, this.b.length)) {
            this.b[n3] = n2;
            this.c[n3] = this.a(n3);
        }
    }
}

