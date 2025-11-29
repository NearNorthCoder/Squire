/*
 * Decompiled with CFR 0.152.
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.e;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.f;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.g;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.h;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.i;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.j;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.k;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class d
extends Enum<d> {
    private static final /* synthetic */ d[] $VALUES;
    public static final /* synthetic */ /* enum */ d LOBSTER;
    public static final /* synthetic */ /* enum */ d XP_TOME;
    private static /* synthetic */ int[] lIIllIIllIIIl;
    private final /* synthetic */ List<Integer> rewardIds;
    public static final /* synthetic */ /* enum */ d WATERMELON_SEED;
    public static final /* synthetic */ /* enum */ d PURE_ESSENCE;
    private static /* synthetic */ String[] lIIllIIlIllll;
    public static final /* synthetic */ /* enum */ d SILVER_BAR;
    public static final /* synthetic */ /* enum */ d BOW_STRING;
    public static final /* synthetic */ /* enum */ d COAL_AND_IRON;
    private final /* synthetic */ int interfaceId;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ d HERB;

    private static String lIlIllllllIlllI(String var1, String var3) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIllIIllIIIl[11]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIIllIIllIIIl[2], var4);
            return new String(var14.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllllllIIll() {
        lIIllIIllIIIl = new int[20];
        d.lIIllIIllIIIl[0] = (0x7C ^ 0xB ^ (0x84 ^ 0xBE)) & (0x49 ^ 0x38 ^ (0x64 ^ 0x58) ^ -1);
        d.lIIllIIllIIIl[1] = 1;
        d.lIIllIIllIIIl[2] = 2;
        d.lIIllIIllIIIl[3] = 3;
        d.lIIllIIllIIIl[4] = 0x51 ^ 0x13 ^ (0x80 ^ 0xC6);
        d.lIIllIIllIIIl[5] = 0xBF ^ 0xBA;
        d.lIIllIIllIIIl[6] = 128 + 40 - 120 + 143 ^ 138 + 133 - 129 + 43;
        d.lIIllIIllIIIl[7] = 0xFFFFDFFF & 0x2BEA;
        d.lIIllIIllIIIl[8] = (0xC7 ^ 0xA7) + (6 ^ 0x35) - (0x72 ^ 0xF) + (158 + 160 - 138 + 4);
        d.lIIllIIllIIIl[9] = 178 + 122 - 197 + 101;
        d.lIIllIIllIIIl[10] = 0x15 ^ 0x12;
        d.lIIllIIllIIIl[11] = 0x78 ^ 0x70;
        d.lIIllIIllIIIl[12] = 0x77 ^ 0x72 ^ (0xBC ^ 0xB0);
        d.lIIllIIllIIIl[13] = 0x92 ^ 0x98;
        d.lIIllIIllIIIl[14] = 0x55 ^ 0x5E;
        d.lIIllIIllIIIl[15] = 0xB5 ^ 0xB9;
        d.lIIllIIllIIIl[16] = 0x77 ^ 0x7A;
        d.lIIllIIllIIIl[17] = 8 ^ 0x50 ^ (0x37 ^ 0x61);
        d.lIIllIIllIIIl[18] = 10 + 70 - -4 + 90 ^ 62 + 122 - 137 + 114;
        d.lIIllIIllIIIl[19] = 0x57 ^ 0x21 ^ (0x31 ^ 0x57);
    }

    private static String lIlIllllllIllll(String var10, String var11) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIllIIllIIIl[2], var15);
            return new String(var17.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String lIlIllllllIllIl(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var2 = var19.toCharArray();
        int var6 = lIIllIIllIIIl[0];
        char[] var13 = var18.toCharArray();
        int var7 = var13.length;
        int var16 = lIIllIIllIIIl[0];
        while (d.lIlIlllllllIlII(var16, var7)) {
            char var9 = var13[var16];
            var12.append((char)(var9 ^ var2[var6 % var2.length]));
            0;
            ++var6;
            ++var16;
            0;
            if (2 > 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public String y() {
        return this.name;
    }

    private d(int n3, List<Integer> list, String string2) {
        this.interfaceId = n3;
        this.rewardIds = list;
        this.name = string2;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public List<Integer> w() {
        return this.rewardIds;
    }

    private static void lIlIlllllllIIlI() {
        lIIllIIlIllll = new String[lIIllIIllIIIl[19]];
        d.lIIllIIlIllll[d.lIIllIIllIIIl[0]] = d."PURE_ESSENCE";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[1]] = d."Pure essence";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[2]] = d."BOW_STRING";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[3]] = d."Bow string";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[4]] = d."SILVER_BAR";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[5]] = d."Silver bar";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[6]] = d."HERB";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[10]] = d."Herbs";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[11]] = d."COAL_AND_IRON";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[12]] = d."Ores";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[13]] = d."WATERMELON_SEED";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[14]] = d."Watermelon seed";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[15]] = d."LOBSTER";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[16]] = d."Raw lobster";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[17]] = d."XP_TOME";
        d.lIIllIIlIllll[d.lIIllIIllIIIl[18]] = d."Reward tomes";
    }

    private static boolean lIlIlllllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    public int x() {
        return this.interfaceId;
    }

    static {
        d.lIlIlllllllIIll();
        d.lIlIlllllllIIlI();
        PURE_ESSENCE = new d(lIIllIIllIIIl[0], new e(), lIIllIIlIllll[lIIllIIllIIIl[1]]);
        BOW_STRING = new d(lIIllIIllIIIl[1], new f(), lIIllIIlIllll[lIIllIIllIIIl[3]]);
        SILVER_BAR = new d(lIIllIIllIIIl[2], new g(), lIIllIIlIllll[lIIllIIllIIIl[5]]);
        HERB = new d(lIIllIIllIIIl[3], List.of(Integer.valueOf(lIIllIIllIIIl[7]), Integer.valueOf(lIIllIIllIIIl[8]), Integer.valueOf(lIIllIIllIIIl[9])), lIIllIIlIllll[lIIllIIllIIIl[10]]);
        COAL_AND_IRON = new d(lIIllIIllIIIl[4], new h(), lIIllIIlIllll[lIIllIIllIIIl[12]]);
        WATERMELON_SEED = new d(lIIllIIllIIIl[5], new i(), lIIllIIlIllll[lIIllIIllIIIl[14]]);
        LOBSTER = new d(lIIllIIllIIIl[6], new j(), lIIllIIlIllll[lIIllIIllIIIl[16]]);
        XP_TOME = new d(lIIllIIllIIIl[10], new k(), lIIllIIlIllll[lIIllIIllIIIl[18]]);
        d[] dArray = new d[lIIllIIllIIIl[11]];
        dArray[d.lIIllIIllIIIl[0]] = PURE_ESSENCE;
        dArray[d.lIIllIIllIIIl[1]] = BOW_STRING;
        dArray[d.lIIllIIllIIIl[2]] = SILVER_BAR;
        dArray[d.lIIllIIllIIIl[3]] = HERB;
        dArray[d.lIIllIIllIIIl[4]] = COAL_AND_IRON;
        dArray[d.lIIllIIllIIIl[5]] = WATERMELON_SEED;
        dArray[d.lIIllIIllIIIl[6]] = LOBSTER;
        dArray[d.lIIllIIllIIIl[10]] = XP_TOME;
        $VALUES = dArray;
    }
}

