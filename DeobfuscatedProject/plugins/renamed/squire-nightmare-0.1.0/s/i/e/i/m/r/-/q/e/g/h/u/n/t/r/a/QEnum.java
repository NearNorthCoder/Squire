/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.o_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.p_Unknown;

public final class QEnum
extends Enum<q> {
    public static final /* synthetic */ /* enum */ q SCORCH;
    public static final /* synthetic */ /* enum */ q SHORT_FUSE;
    public static final /* synthetic */ /* enum */ q REAP;
    public static final /* synthetic */ /* enum */ q BASH;
    public static final /* synthetic */ /* enum */ q JAB;
    private static final /* synthetic */ q[] $VALUES;
    public static final /* synthetic */ /* enum */ q FLICK;
    public static final /* synthetic */ /* enum */ q LONG_FUSE;
    public static final /* synthetic */ /* enum */ q LUNGE;
    public static final /* synthetic */ /* enum */ q LASH;
    public static final /* synthetic */ /* enum */ q FLARE;
    public static final /* synthetic */ /* enum */ q SMASH;
    public static final /* synthetic */ /* enum */ q PUNCH;
    public static final /* synthetic */ /* enum */ q CHOP;
    public static final /* synthetic */ /* enum */ q MEDIUM_FUSE;
    public static final /* synthetic */ /* enum */ q STAB;
    public static final /* synthetic */ /* enum */ q HACK;
    public static final /* synthetic */ /* enum */ q POUND;
    private final /* synthetic */ String action;
    public static final /* synthetic */ /* enum */ q FLAMER;
    public static final /* synthetic */ /* enum */ q SPELL_DEFENSIVE;
    public static final /* synthetic */ /* enum */ q EXPLOSIVE;
    public static final /* synthetic */ /* enum */ q DEFLECT;
    public static final /* synthetic */ /* enum */ q LONGRANGE;
    public static final /* synthetic */ /* enum */ q FOCUS;
    public static final /* synthetic */ /* enum */ q AIM_AND_FIRE;
    public static final /* synthetic */ /* enum */ q RAPID;
    public static final /* synthetic */ /* enum */ q BLOCK;
    public static final /* synthetic */ /* enum */ q PUMMEL;
    public static final /* synthetic */ /* enum */ q SLASH;
    private static /* synthetic */ String[] llllIllIIIIl;
    public static final /* synthetic */ /* enum */ q FEND;
    public static final /* synthetic */ /* enum */ q SPIKE;
    public static final /* synthetic */ /* enum */ q SWIPE;
    public static final /* synthetic */ /* enum */ q KICK;
    public static final /* synthetic */ /* enum */ q IMPALE;
    public static final /* synthetic */ /* enum */ q ACCURATE;
    private static /* synthetic */ int[] llllIllIIlII;
    public static final /* synthetic */ /* enum */ q BLAZE;
    public static final /* synthetic */ /* enum */ q SPELL;

    private static boolean lIIlIIIlIllIlIl(int n2) {
        return n2 == 0;
    }

    private q(String string2) {
        this.action = string2;
    }

    static {
        q.lIIlIIIlIllIIll();
        q.lIIlIIIlIllIIlI();
        ACCURATE = new q();
        AIM_AND_FIRE = new q();
        BASH = new q();
        BLAZE = new q();
        BLOCK = new q();
        CHOP = new q();
        DEFLECT = new q();
        EXPLOSIVE = new q();
        FEND = new q();
        FLAMER = new q();
        FLARE = new q();
        FLICK = new q();
        FOCUS = new q();
        HACK = new q();
        IMPALE = new q();
        JAB = new q();
        KICK = new q();
        LASH = new q();
        LONG_FUSE = new q();
        LONGRANGE = new q();
        LUNGE = new q();
        MEDIUM_FUSE = new q();
        POUND = new q();
        PUMMEL = new q();
        PUNCH = new q();
        RAPID = new q();
        REAP = new q();
        SCORCH = new q();
        SHORT_FUSE = new q();
        SLASH = new q();
        SMASH = new q();
        SPELL = new q();
        SPELL_DEFENSIVE = new q();
        SPIKE = new q();
        STAB = new q();
        SWIPE = new q();
        q[] qArray = new q[llllIllIIlII[36]];
        qArray[q.llllIllIIlII[0]] = ACCURATE;
        qArray[q.llllIllIIlII[1]] = AIM_AND_FIRE;
        qArray[q.llllIllIIlII[2]] = BASH;
        qArray[q.llllIllIIlII[3]] = BLAZE;
        qArray[q.llllIllIIlII[4]] = BLOCK;
        qArray[q.llllIllIIlII[5]] = CHOP;
        qArray[q.llllIllIIlII[6]] = DEFLECT;
        qArray[q.llllIllIIlII[7]] = EXPLOSIVE;
        qArray[q.llllIllIIlII[8]] = FEND;
        qArray[q.llllIllIIlII[9]] = FLAMER;
        qArray[q.llllIllIIlII[10]] = FLARE;
        qArray[q.llllIllIIlII[11]] = FLICK;
        qArray[q.llllIllIIlII[12]] = FOCUS;
        qArray[q.llllIllIIlII[13]] = HACK;
        qArray[q.llllIllIIlII[14]] = IMPALE;
        qArray[q.llllIllIIlII[15]] = JAB;
        qArray[q.llllIllIIlII[16]] = KICK;
        qArray[q.llllIllIIlII[17]] = LASH;
        qArray[q.llllIllIIlII[18]] = LONG_FUSE;
        qArray[q.llllIllIIlII[19]] = LONGRANGE;
        qArray[q.llllIllIIlII[20]] = LUNGE;
        qArray[q.llllIllIIlII[21]] = MEDIUM_FUSE;
        qArray[q.llllIllIIlII[22]] = POUND;
        qArray[q.llllIllIIlII[23]] = PUMMEL;
        qArray[q.llllIllIIlII[24]] = PUNCH;
        qArray[q.llllIllIIlII[25]] = RAPID;
        qArray[q.llllIllIIlII[26]] = REAP;
        qArray[q.llllIllIIlII[27]] = SCORCH;
        qArray[q.llllIllIIlII[28]] = SHORT_FUSE;
        qArray[q.llllIllIIlII[29]] = SLASH;
        qArray[q.llllIllIIlII[30]] = SMASH;
        qArray[q.llllIllIIlII[31]] = SPELL;
        qArray[q.llllIllIIlII[32]] = SPELL_DEFENSIVE;
        qArray[q.llllIllIIlII[33]] = SPIKE;
        qArray[q.llllIllIIlII[34]] = STAB;
        qArray[q.llllIllIIlII[35]] = SWIPE;
        $VALUES = qArray;
    }

    private static boolean lIIlIIIlIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIIlIllIIlI() {
        llllIllIIIIl = new String[llllIllIIlII[36]];
        q.llllIllIIIIl[q.llllIllIIlII[0]] = q."ACCURATE";
        q.llllIllIIIIl[q.llllIllIIlII[1]] = q."AIM_AND_FIRE";
        q.llllIllIIIIl[q.llllIllIIlII[2]] = q."BASH";
        q.llllIllIIIIl[q.llllIllIIlII[3]] = q."BLAZE";
        q.llllIllIIIIl[q.llllIllIIlII[4]] = q."BLOCK";
        q.llllIllIIIIl[q.llllIllIIlII[5]] = q."CHOP";
        q.llllIllIIIIl[q.llllIllIIlII[6]] = q."DEFLECT";
        q.llllIllIIIIl[q.llllIllIIlII[7]] = q."EXPLOSIVE";
        q.llllIllIIIIl[q.llllIllIIlII[8]] = q."FEND";
        q.llllIllIIIIl[q.llllIllIIlII[9]] = q."FLAMER";
        q.llllIllIIIIl[q.llllIllIIlII[10]] = q."FLARE";
        q.llllIllIIIIl[q.llllIllIIlII[11]] = q."FLICK";
        q.llllIllIIIIl[q.llllIllIIlII[12]] = q."FOCUS";
        q.llllIllIIIIl[q.llllIllIIlII[13]] = q."HACK";
        q.llllIllIIIIl[q.llllIllIIlII[14]] = q."IMPALE";
        q.llllIllIIIIl[q.llllIllIIlII[15]] = q."JAB";
        q.llllIllIIIIl[q.llllIllIIlII[16]] = q."KICK";
        q.llllIllIIIIl[q.llllIllIIlII[17]] = q."LASH";
        q.llllIllIIIIl[q.llllIllIIlII[18]] = q."LONG_FUSE";
        q.llllIllIIIIl[q.llllIllIIlII[19]] = q."LONGRANGE";
        q.llllIllIIIIl[q.llllIllIIlII[20]] = q."LUNGE";
        q.llllIllIIIIl[q.llllIllIIlII[21]] = q."MEDIUM_FUSE";
        q.llllIllIIIIl[q.llllIllIIlII[22]] = q."POUND";
        q.llllIllIIIIl[q.llllIllIIlII[23]] = q."PUMMEL";
        q.llllIllIIIIl[q.llllIllIIlII[24]] = q."PUNCH";
        q.llllIllIIIIl[q.llllIllIIlII[25]] = q."RAPID";
        q.llllIllIIIIl[q.llllIllIIlII[26]] = q."REAP";
        q.llllIllIIIIl[q.llllIllIIlII[27]] = q."SCORCH";
        q.llllIllIIIIl[q.llllIllIIlII[28]] = q."SHORT_FUSE";
        q.llllIllIIIIl[q.llllIllIIlII[29]] = q."SLASH";
        q.llllIllIIIIl[q.llllIllIIlII[30]] = q."SMASH";
        q.llllIllIIIIl[q.llllIllIIlII[31]] = q."SPELL";
        q.llllIllIIIIl[q.llllIllIIlII[32]] = q."SPELL_DEFENSIVE";
        q.llllIllIIIIl[q.llllIllIIlII[33]] = q."SPIKE";
        q.llllIllIIIIl[q.llllIllIIlII[34]] = q."STAB";
        q.llllIllIIIIl[q.llllIllIIlII[35]] = q."SWIPE";
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (q.lIIlIIIlIllIlII(o2)) {
            return llllIllIIlII[0];
        }
        return Objects.equals((Object)o2.bl(), (Object)this);
    }

    public boolean bk() {
        boolean bl;
        q[] qArray = new q[llllIllIIlII[1]];
        qArray[q.llllIllIIlII[0]] = this;
        if (q.lIIlIIIlIllIlIl(p.a(qArray).isEmpty() ? 1 : 0)) {
            bl = llllIllIIlII[1];
            0;
            if (-1 >= 0) {
                return ((0x44 ^ 0x6A ^ (0xD1 ^ 0xB2)) & (52 + 212 - 44 + 4 ^ 56 + 120 - 16 + 13 ^ -1)) != 0;
            }
        } else {
            bl = llllIllIIlII[0];
        }
        return bl;
    }

    public String bC() {
        return this.action;
    }

    private static void lIIlIIIlIllIIll() {
        llllIllIIlII = new int[37];
        q.llllIllIIlII[0] = (0x57 ^ 0x47) & ~(0x82 ^ 0x92);
        q.llllIllIIlII[1] = 1;
        q.llllIllIIlII[2] = 2;
        q.llllIllIIlII[3] = 3;
        q.llllIllIIlII[4] = 0xFB ^ 0xA9 ^ (0x29 ^ 0x7F);
        q.llllIllIIlII[5] = 0x7C ^ 0x79;
        q.llllIllIIlII[6] = 0x57 ^ 0x51;
        q.llllIllIIlII[7] = 0x83 ^ 0x84;
        q.llllIllIIlII[8] = 0x60 ^ 0x68;
        q.llllIllIIlII[9] = 0x62 ^ 0x6B;
        q.llllIllIIlII[10] = 47 + 9 - -5 + 80 ^ 3 + 48 - -6 + 78;
        q.llllIllIIlII[11] = 134 + 58 - 88 + 57 ^ 34 + 3 - -48 + 85;
        q.llllIllIIlII[12] = 17 + 11 - -71 + 53 ^ 101 + 20 - 56 + 83;
        q.llllIllIIlII[13] = 0xD2 ^ 0xA8 ^ (0xC1 ^ 0xB6);
        q.llllIllIIlII[14] = 0x3B ^ 0x35;
        q.llllIllIIlII[15] = 0x18 ^ 0x54 ^ (0xEA ^ 0xA9);
        q.llllIllIIlII[16] = 0x4D ^ 0x5D;
        q.llllIllIIlII[17] = 0xA8 ^ 0xB9;
        q.llllIllIIlII[18] = 0x22 ^ 0x30;
        q.llllIllIIlII[19] = 80 + 86 - 110 + 74 ^ 47 + 47 - 24 + 75;
        q.llllIllIIlII[20] = 0xAB ^ 0xBF;
        q.llllIllIIlII[21] = 0xD1 ^ 0x87 ^ (0x23 ^ 0x60);
        q.llllIllIIlII[22] = 64 + 11 - -20 + 95 ^ 140 + 137 - 165 + 56;
        q.llllIllIIlII[23] = 0x39 ^ 0x2E;
        q.llllIllIIlII[24] = 0x76 ^ 0x6E;
        q.llllIllIIlII[25] = 0x1D ^ 0x77 ^ (0xDB ^ 0xA8);
        q.llllIllIIlII[26] = 0x1B ^ 0x51 ^ (0x93 ^ 0xC3);
        q.llllIllIIlII[27] = 0x2E ^ 8 ^ (0xC ^ 0x31);
        q.llllIllIIlII[28] = 118 + 103 - 122 + 45 ^ 125 + 134 - 207 + 88;
        q.llllIllIIlII[29] = 0x61 ^ 0x18 ^ (0xC9 ^ 0xAD);
        q.llllIllIIlII[30] = 71 + 68 - 95 + 91 ^ 121 + 89 - 119 + 62;
        q.llllIllIIlII[31] = 0x1E ^ 1;
        q.llllIllIIlII[32] = 3 ^ (0x80 ^ 0xA3);
        q.llllIllIIlII[33] = 0x24 ^ 0x5D ^ (0xDC ^ 0x84);
        q.llllIllIIlII[34] = 0xDC ^ 0xC5 ^ (0xD ^ 0x36);
        q.llllIllIIlII[35] = 0 ^ 0x23;
        q.llllIllIIlII[36] = 0x5D ^ 0x79;
    }

    private static String lIIlIIIlIlIIlIl(String var11, String var8) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var15 = var8.toCharArray();
        int var16 = llllIllIIlII[0];
        char[] var13 = var11.toCharArray();
        int var5 = var13.length;
        int var1 = llllIllIIlII[0];
        while (q.lIIlIIIlIllIllI(var1, var5)) {
            char var10 = var13[var1];
            var4.append((char)(var10 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var1;
            0;
            if ((0xB6 ^ 0x98 ^ (2 ^ 0x29)) != 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private q() {
        this(null);
    }

    private static boolean lIIlIIIlIllIlII(Object object) {
        return object == null;
    }

    private static String lIIlIIIlIlIIlII(String var2, String var17) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llllIllIIlII[2], var18);
            return new String(var12.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIlIlIIllI(String var9, String var14) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llllIllIIlII[8]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(llllIllIIlII[2], var6);
            return new String(var19.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }
}

