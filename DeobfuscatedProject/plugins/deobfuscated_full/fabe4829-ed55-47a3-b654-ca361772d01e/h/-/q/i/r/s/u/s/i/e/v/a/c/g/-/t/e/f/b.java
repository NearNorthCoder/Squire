/*
 * Decompiled with CFR 0.152.
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.a;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.c;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.d;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b
extends Enum<b> {
    private static final /* synthetic */ b[] $VALUES;
    private final /* synthetic */ d prayerPriority;
    public static final /* synthetic */ /* enum */ b RANGER;
    public static final /* synthetic */ /* enum */ b JAD;
    public static final /* synthetic */ /* enum */ b MELEER;
    private final /* synthetic */ int[] npcID;
    private final /* synthetic */ int attackSpeedInTicks;
    private static /* synthetic */ String[] llIIIllIllIl;
    public static final /* synthetic */ /* enum */ b BLOB;
    public static final /* synthetic */ /* enum */ b HEALER;
    public static final /* synthetic */ /* enum */ b BAT;
    private final /* synthetic */ a attackStyle;
    private static /* synthetic */ int[] llIIIllIlllI;
    public static final /* synthetic */ /* enum */ b MAGER;
    public static final /* synthetic */ /* enum */ b SMALL_BLOB;
    private final /* synthetic */ String name;

    public int e() {
        return this.attackSpeedInTicks;
    }

    public a b() {
        return this.attackStyle;
    }

    private static boolean llllIllIlIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIllIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(int n2) {
        void var4;
        b[] bArray = b.values();
        int n4 = bArray.length;
        int var5 = llIIIllIlllI[0];
        while (b.llllIllIlIIllI(var5, (int)var4)) {
            int var6;
            void var12;
            void var7 = var12[var5];
            if (b.llllIllIlIIlll(Arrays.stream(var7.c()).anyMatch(n3 -> {
                boolean bl;
                if (b.llllIllIlIlIII(n3, var6)) {
                    bl = llIIIllIlllI[1];
                    0;
                    if (2 != 2) {
                        return ((0xC3 ^ 0xBF ^ (0x1B ^ 0x23)) & (0x8A ^ 0xB9 ^ (0x67 ^ 0x10) ^ -1)) != 0;
                    }
                } else {
                    bl = llIIIllIlllI[0];
                }
                return bl;
            }) ? 1 : 0)) {
                return var7;
            }
            ++var5;
            0;
            if ((0x63 ^ 0x67) > 0) continue;
            return null;
        }
        return null;
    }

    public String d() {
        return this.name;
    }

    private static void llllIllIlIIlIl() {
        llIIIllIlllI = new int[17];
        b.llIIIllIlllI[0] = (0x94 ^ 0x81 ^ (0x53 ^ 0xA)) & (0x12 ^ 0x67 ^ (0x1B ^ 0x22) ^ -1);
        b.llIIIllIlllI[1] = 1;
        b.llIIIllIlllI[2] = 0x74 ^ 0x70;
        b.llIIIllIlllI[3] = 2;
        b.llIIIllIlllI[4] = 3;
        b.llIIIllIlllI[5] = 0x52 ^ 0x46 ^ (0x2B ^ 0x3A);
        b.llIIIllIlllI[6] = 0xD8 ^ 0x93 ^ (0xC ^ 0x41);
        b.llIIIllIlllI[7] = 0x7A ^ 0x7D;
        b.llIIIllIlllI[8] = 49 + 174 - 165 + 125 ^ 158 + 100 - 205 + 138;
        b.llIIIllIlllI[9] = 1 ^ 8;
        b.llIIIllIlllI[10] = 0 ^ 0x54 ^ (0x2C ^ 0x72);
        b.llIIIllIlllI[11] = 0x97 ^ 0x9C;
        b.llIIIllIlllI[12] = 0xB0 ^ 0xBC;
        b.llIIIllIlllI[13] = 0xCF ^ 0xC2;
        b.llIIIllIlllI[14] = 82 + 22 - 30 + 59 ^ 79 + 52 - 68 + 76;
        b.llIIIllIlllI[15] = 0x32 ^ 0x3D;
        b.llIIIllIlllI[16] = 0x69 ^ 0x79;
    }

    private static String llllIllIlIIIIl(String var18, String var21) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(llIIIllIlllI[3], var1);
            return new String(var23.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static String llllIllIlIIIlI(String var17, String var10) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var10.toCharArray();
        int var13 = llIIIllIlllI[0];
        char[] var3 = var17.toCharArray();
        int var15 = var3.length;
        int var16 = llIIIllIlllI[0];
        while (b.llllIllIlIIllI(var16, var15)) {
            char var2 = var3[var16];
            var8.append((char)(var2 ^ var9[var13 % var9.length]));
            0;
            ++var13;
            ++var16;
            0;
            if (-(0x1E ^ 0x1A) <= 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public d f() {
        return this.prayerPriority;
    }

    private static boolean llllIllIlIIlll(int n2) {
        return n2 != 0;
    }

    private b(int[] nArray, String string2, int n3, d d2, a a2) {
        this.npcID = nArray;
        this.name = string2;
        this.attackSpeedInTicks = n3;
        this.prayerPriority = d2;
        this.attackStyle = a2;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static String llllIllIlIIIll(String var20, String var19) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), llIIIllIlllI[8]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIIIllIlllI[3], var22);
            return new String(var11.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static void llllIllIlIIlII() {
        llIIIllIllIl = new String[llIIIllIlllI[16]];
        b.llIIIllIllIl[b.llIIIllIlllI[0]] = b."BAT";
        b.llIIIllIllIl[b.llIIIllIlllI[1]] = b."Tz-Kih";
        b.llIIIllIllIl[b.llIIIllIlllI[3]] = b."BLOB";
        b.llIIIllIllIl[b.llIIIllIlllI[4]] = b."Tz-Kek";
        b.llIIIllIllIl[b.llIIIllIlllI[2]] = b."SMALL_BLOB";
        b.llIIIllIllIl[b.llIIIllIlllI[5]] = b."Tz-Kek";
        b.llIIIllIllIl[b.llIIIllIlllI[6]] = b."RANGER";
        b.llIIIllIllIl[b.llIIIllIlllI[7]] = b."Tok-Xil";
        b.llIIIllIllIl[b.llIIIllIlllI[8]] = b."MELEER";
        b.llIIIllIllIl[b.llIIIllIlllI[9]] = b."Yt-MejKot";
        b.llIIIllIllIl[b.llIIIllIlllI[10]] = b."MAGER";
        b.llIIIllIllIl[b.llIIIllIlllI[11]] = b."Ket-Zek";
        b.llIIIllIllIl[b.llIIIllIlllI[12]] = b."JAD";
        b.llIIIllIllIl[b.llIIIllIlllI[13]] = b."TzTok-Jad";
        b.llIIIllIllIl[b.llIIIllIlllI[14]] = b."HEALER";
        b.llIIIllIllIl[b.llIIIllIlllI[15]] = b."Yt-HurKot";
    }

    public int[] c() {
        return this.npcID;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    static {
        b.llllIllIlIIlIl();
        b.llllIllIlIIlII();
        BAT = new b(c.p, llIIIllIllIl[llIIIllIlllI[1]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        BLOB = new b(c.q, llIIIllIllIl[llIIIllIlllI[4]], llIIIllIlllI[2], d.LOW, a.MELEE);
        SMALL_BLOB = new b(c.r, llIIIllIllIl[llIIIllIlllI[5]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        RANGER = new b(c.s, llIIIllIllIl[llIIIllIlllI[7]], llIIIllIlllI[2], d.HIGH, a.RANGED);
        MELEER = new b(c.t, llIIIllIllIl[llIIIllIlllI[9]], llIIIllIlllI[2], d.MEDIUM, a.MELEE);
        MAGER = new b(c.u, llIIIllIllIl[llIIIllIlllI[11]], llIIIllIlllI[2], d.VERY_HIGH, a.MAGIC);
        JAD = new b(c.v, llIIIllIllIl[llIIIllIlllI[13]], llIIIllIlllI[8], d.VERY_HIGH, a.MIXED);
        HEALER = new b(c.w, llIIIllIllIl[llIIIllIlllI[15]], llIIIllIlllI[2], d.VERY_LOW, a.MELEE);
        b[] bArray = new b[llIIIllIlllI[8]];
        bArray[b.llIIIllIlllI[0]] = BAT;
        bArray[b.llIIIllIlllI[1]] = BLOB;
        bArray[b.llIIIllIlllI[3]] = SMALL_BLOB;
        bArray[b.llIIIllIlllI[4]] = RANGER;
        bArray[b.llIIIllIlllI[2]] = MELEER;
        bArray[b.llIIIllIlllI[5]] = MAGER;
        bArray[b.llIIIllIlllI[6]] = JAD;
        bArray[b.llIIIllIlllI[7]] = HEALER;
        $VALUES = bArray;
    }
}

