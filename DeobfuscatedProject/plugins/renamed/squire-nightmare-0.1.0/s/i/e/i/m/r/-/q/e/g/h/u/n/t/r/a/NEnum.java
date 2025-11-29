/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.o_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.p_Unknown;

public final class NEnum
extends Enum<n> {
    private static final /* synthetic */ n[] $VALUES;
    public static final /* synthetic */ /* enum */ n CRUSH;
    public static final /* synthetic */ /* enum */ n EMITS_A_JET_OF_FLAME;
    public static final /* synthetic */ /* enum */ n SPELLCASTING;
    private static /* synthetic */ int[] llllIlllIlIl;
    public static final /* synthetic */ /* enum */ n STAB;
    public static final /* synthetic */ /* enum */ n NONE;
    public static final /* synthetic */ /* enum */ n SLASH;
    public static final /* synthetic */ /* enum */ n MAGIC;
    private static /* synthetic */ String[] llllIlllIlII;
    public static final /* synthetic */ /* enum */ n DEFENSIVE_CASTING;
    public static final /* synthetic */ /* enum */ n RANGED;
    public static final /* synthetic */ /* enum */ n FIRES_AN_EXPLOSIVE_ROUND;

    private static void lIIlIIIllllIlII() {
        llllIlllIlIl = new int[11];
        n.llllIlllIlIl[0] = (0x9A ^ 0x87) & ~(0xB3 ^ 0xAE);
        n.llllIlllIlIl[1] = 1;
        n.llllIlllIlIl[2] = 2;
        n.llllIlllIlIl[3] = 3;
        n.llllIlllIlIl[4] = 0x67 ^ 0x63;
        n.llllIlllIlIl[5] = 118 + 30 - 130 + 153 ^ 81 + 90 - 42 + 45;
        n.llllIlllIlIl[6] = 0x31 ^ 0x37;
        n.llllIlllIlIl[7] = 0x5C ^ 0x48 ^ (0x92 ^ 0x81);
        n.llllIlllIlIl[8] = 0 ^ 8;
        n.llllIlllIlIl[9] = 0x13 ^ 0x5E ^ (0xCE ^ 0x8A);
        n.llllIlllIlIl[10] = 116 + 145 - 127 + 34 ^ 151 + 6 - 153 + 158;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (n.lIIlIIIllllIlIl(o2)) {
            return llllIlllIlIl[0];
        }
        return Objects.equals((Object)o2.bm(), (Object)this);
    }

    private static boolean lIIlIIIllllIlIl(Object object) {
        return object == null;
    }

    public boolean bk() {
        boolean bl;
        n[] nArray = new n[llllIlllIlIl[1]];
        nArray[n.llllIlllIlIl[0]] = this;
        if (n.lIIlIIIllllIllI(p.a(nArray).isEmpty() ? 1 : 0)) {
            bl = llllIlllIlIl[1];
            0;
            if (((0x26 ^ 0x1D) & ~(0x59 ^ 0x62)) == 3) {
                return false;
            }
        } else {
            bl = llllIlllIlIl[0];
        }
        return bl;
    }

    private static void lIIlIIIllllIIll() {
        llllIlllIlII = new String[llllIlllIlIl[10]];
        n.llllIlllIlII[n.llllIlllIlIl[0]] = n."CRUSH";
        n.llllIlllIlII[n.llllIlllIlIl[1]] = n."DEFENSIVE_CASTING";
        n.llllIlllIlII[n.llllIlllIlIl[2]] = n."EMITS_A_JET_OF_FLAME";
        n.llllIlllIlII[n.llllIlllIlIl[3]] = n."FIRES_AN_EXPLOSIVE_ROUND";
        n.llllIlllIlII[n.llllIlllIlIl[4]] = n."MAGIC";
        n.llllIlllIlII[n.llllIlllIlIl[5]] = n."NONE";
        n.llllIlllIlII[n.llllIlllIlIl[6]] = n."RANGED";
        n.llllIlllIlII[n.llllIlllIlIl[7]] = n."SLASH";
        n.llllIlllIlII[n.llllIlllIlIl[8]] = n."SPELLCASTING";
        n.llllIlllIlII[n.llllIlllIlIl[9]] = n."STAB";
    }

    private static String lIIlIIIllllIIlI(String var1, String var2) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var5 = var2.toCharArray();
        int var10 = llllIlllIlIl[0];
        char[] var12 = var1.toCharArray();
        int var6 = var12.length;
        int var13 = llllIlllIlIl[0];
        while (n.lIIlIIIllllIlll(var13, var6)) {
            char var8 = var12[var13];
            var14.append((char)(var8 ^ var5[var10 % var5.length]));
            0;
            ++var10;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIIlIIIllllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIIIllllIIII(String var9, String var3) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(llllIlllIlIl[2], var11);
            return new String(var4.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    private static boolean lIIlIIIllllIllI(int n2) {
        return n2 == 0;
    }

    static {
        n.lIIlIIIllllIlII();
        n.lIIlIIIllllIIll();
        CRUSH = new n();
        DEFENSIVE_CASTING = new n();
        EMITS_A_JET_OF_FLAME = new n();
        FIRES_AN_EXPLOSIVE_ROUND = new n();
        MAGIC = new n();
        NONE = new n();
        RANGED = new n();
        SLASH = new n();
        SPELLCASTING = new n();
        STAB = new n();
        n[] nArray = new n[llllIlllIlIl[10]];
        nArray[n.llllIlllIlIl[0]] = CRUSH;
        nArray[n.llllIlllIlIl[1]] = DEFENSIVE_CASTING;
        nArray[n.llllIlllIlIl[2]] = EMITS_A_JET_OF_FLAME;
        nArray[n.llllIlllIlIl[3]] = FIRES_AN_EXPLOSIVE_ROUND;
        nArray[n.llllIlllIlIl[4]] = MAGIC;
        nArray[n.llllIlllIlIl[5]] = NONE;
        nArray[n.llllIlllIlIl[6]] = RANGED;
        nArray[n.llllIlllIlIl[7]] = SLASH;
        nArray[n.llllIlllIlIl[8]] = SPELLCASTING;
        nArray[n.llllIlllIlIl[9]] = STAB;
        $VALUES = nArray;
    }
}

