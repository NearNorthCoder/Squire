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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.o;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.p;

public final class m
extends Enum<m> {
    private static /* synthetic */ String[] llllIIlIIIll;
    public static final /* synthetic */ /* enum */ m DEFENSIVE;
    public static final /* synthetic */ /* enum */ m NONE;
    private static final /* synthetic */ m[] $VALUES;
    public static final /* synthetic */ /* enum */ m MAGIC;
    private static /* synthetic */ int[] llllIIlIIlII;
    public static final /* synthetic */ /* enum */ m CONTROLLED;
    public static final /* synthetic */ /* enum */ m ACCURATE;
    public static final /* synthetic */ /* enum */ m AGGRESSIVE;

    private static String lIIIllllIlllIIl(String var10, String var6) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llllIIlIIlII[2], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    private static void lIIIllllIlllIll() {
        llllIIlIIlII = new int[7];
        m.llllIIlIIlII[0] = (120 + 119 - 130 + 47 ^ 80 + 73 - 58 + 48) & (0x4C ^ 0x29 ^ (0x6D ^ 0x1B) ^ -1);
        m.llllIIlIIlII[1] = 1;
        m.llllIIlIIlII[2] = 2;
        m.llllIIlIIlII[3] = 3;
        m.llllIIlIIlII[4] = 55 + 7 - 61 + 137 ^ 82 + 89 - 127 + 98;
        m.llllIIlIIlII[5] = 0x80 ^ 0x85;
        m.llllIIlIIlII[6] = 0xAE ^ 0xA8;
    }

    public boolean bk() {
        boolean bl;
        m[] mArray = new m[llllIIlIIlII[1]];
        mArray[m.llllIIlIIlII[0]] = this;
        if (m.lIIIllllIllllIl(p.a(mArray).isEmpty() ? 1 : 0)) {
            bl = llllIIlIIlII[1];
            0;
            if (3 <= 0) {
                return ((0xC ^ 0x4C ^ (0x17 ^ 0x11)) & (0xE0 ^ 0xA9 ^ (0x6D ^ 0x62) ^ -1)) != 0;
            }
        } else {
            bl = llllIIlIIlII[0];
        }
        return bl;
    }

    private static boolean lIIIllllIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIllllIlllIlI() {
        llllIIlIIIll = new String[llllIIlIIlII[6]];
        m.llllIIlIIIll[m.llllIIlIIlII[0]] = m."ACCURATE";
        m.llllIIlIIIll[m.llllIIlIIlII[1]] = m."AGGRESSIVE";
        m.llllIIlIIIll[m.llllIIlIIlII[2]] = m."CONTROLLED";
        m.llllIIlIIIll[m.llllIIlIIlII[3]] = m."DEFENSIVE";
        m.llllIIlIIIll[m.llllIIlIIlII[4]] = m."MAGIC";
        m.llllIIlIIIll[m.llllIIlIIlII[5]] = m."NONE";
    }

    private static boolean lIIIllllIllllIl(int n2) {
        return n2 == 0;
    }

    private static String lIIIllllIlllIII(String var3, String var5) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var5.toCharArray();
        int var14 = llllIIlIIlII[0];
        char[] var1 = var3.toCharArray();
        int var12 = var1.length;
        int var11 = llllIIlIIlII[0];
        while (m.lIIIllllIlllllI(var11, var12)) {
            char var4 = var1[var11];
            var8.append((char)(var4 ^ var9[var14 % var9.length]));
            0;
            ++var14;
            ++var11;
            0;
            if (3 > 2) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public boolean bj() {
        o o2 = p.bq();
        if (m.lIIIllllIllllII(o2)) {
            return llllIIlIIlII[0];
        }
        return Objects.equals((Object)o2.bn(), (Object)this);
    }

    private static boolean lIIIllllIllllII(Object object) {
        return object == null;
    }

    static {
        m.lIIIllllIlllIll();
        m.lIIIllllIlllIlI();
        ACCURATE = new m();
        AGGRESSIVE = new m();
        CONTROLLED = new m();
        DEFENSIVE = new m();
        MAGIC = new m();
        NONE = new m();
        m[] mArray = new m[llllIIlIIlII[6]];
        mArray[m.llllIIlIIlII[0]] = ACCURATE;
        mArray[m.llllIIlIIlII[1]] = AGGRESSIVE;
        mArray[m.llllIIlIIlII[2]] = CONTROLLED;
        mArray[m.llllIIlIIlII[3]] = DEFENSIVE;
        mArray[m.llllIIlIIlII[4]] = MAGIC;
        mArray[m.llllIIlIIlII[5]] = NONE;
        $VALUES = mArray;
    }
}

