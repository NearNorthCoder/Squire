/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class O
extends Enum<O> {
    public static final /* synthetic */ /* enum */ O HERB;
    private static /* synthetic */ int[] lIlllllIIlIl;
    public static final /* synthetic */ /* enum */ O BUSH;
    private final /* synthetic */ int animation;
    private static /* synthetic */ String[] lIlllllIIIIl;
    public static final /* synthetic */ /* enum */ O FLOWER;
    private final /* synthetic */ P allotment;
    private static final /* synthetic */ O[] $VALUES;
    public static final /* synthetic */ /* enum */ O ALLOTMENT;

    public int aP() {
        return this.animation;
    }

    private static void lllIllllIlIIlI() {
        lIlllllIIIIl = new String[lIlllllIIlIl[8]];
        O.lIlllllIIIIl[O.lIlllllIIlIl[0]] = O."ALLOTMENT";
        O.lIlllllIIIIl[O.lIlllllIIlIl[2]] = O."BUSH";
        O.lIlllllIIIIl[O.lIlllllIIlIl[4]] = O."HERB";
        O.lIlllllIIIIl[O.lIlllllIIlIl[6]] = O."FLOWER";
    }

    private static String lllIllllIlIIIl(String var1, String var7) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var18 = var7.toCharArray();
        int var22 = lIlllllIIlIl[0];
        char[] var12 = var1.toCharArray();
        int var4 = var12.length;
        int var24 = lIlllllIIlIl[0];
        while (O.lllIllllIlIllI(var24, var4)) {
            char var13 = var12[var24];
            var19.append((char)(var13 ^ var18[var22 % var18.length]));
            0;
            ++var22;
            ++var24;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    static {
        O.lllIllllIlIlIl();
        O.lllIllllIlIIlI();
        ALLOTMENT = new O(lIlllllIIlIl[1], P.ALLOTMENT);
        BUSH = new O(lIlllllIIlIl[3], P.BUSH);
        HERB = new O(lIlllllIIlIl[5], P.HERB);
        FLOWER = new O(lIlllllIIlIl[7], P.FLOWER);
        O[] oArray = new O[lIlllllIIlIl[8]];
        oArray[O.lIlllllIIlIl[0]] = ALLOTMENT;
        oArray[O.lIlllllIIlIl[2]] = BUSH;
        oArray[O.lIlllllIIlIl[4]] = HERB;
        oArray[O.lIlllllIIlIl[6]] = FLOWER;
        $VALUES = oArray;
    }

    private O(int n3, P p2) {
        this.animation = n3;
        this.allotment = p2;
    }

    public static O[] values() {
        return (O[])$VALUES.clone();
    }

    private static boolean lllIllllIllIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public static O e(int n2) {
        void var3;
        O[] oArray = O.values();
        int n3 = oArray.length;
        int var16 = lIlllllIIlIl[0];
        while (O.lllIllllIlIllI(var16, (int)var3)) {
            int var8;
            void var11;
            void var6 = var11[var16];
            if (O.lllIllllIllIII(var6.aP(), var8)) {
                return var6;
            }
            ++var16;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static O b(P p2) {
        void var2;
        O[] oArray = O.values();
        int n2 = oArray.length;
        int var9 = lIlllllIIlIl[0];
        while (O.lllIllllIlIllI(var9, (int)var2)) {
            P var14;
            void var20;
            void var23 = var20[var9];
            if (O.lllIllllIllIIl((Object)var23.aQ(), (Object)var14)) {
                return var23;
            }
            ++var9;
            0;
            
            return null;
        }
        return null;
    }

    public static O valueOf(String string) {
        return Enum.valueOf(O.class, string);
    }

    public static O G(N n2) {
        return O.b(n2.aL());
    }

    public P aQ() {
        return this.allotment;
    }

    private static void lllIllllIlIlIl() {
        lIlllllIIlIl = new int[9];
        O.lIlllllIIlIl[0] = 1 & ~1;
        O.lIlllllIIlIl[1] = 0xFFFFFBBF & 0x77E;
        O.lIlllllIIlIl[2] = 1;
        O.lIlllllIIlIl[3] = -(0xFFFFC519 & 0x7EF7) & (0xFFFFDDFB & 0x6EFD);
        O.lIlllllIIlIl[4] = 2;
        O.lIlllllIIlIl[5] = 0xFFFFC8FF & 0x3FEA;
        O.lIlllllIIlIl[6] = 3;
        O.lIlllllIIlIl[7] = 0xFFFFCBF4 & 0x3CFF;
        O.lIlllllIIlIl[8] = 0xD0 ^ 0x9E ^ (2 ^ 0x48);
    }

    private static boolean lllIllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIllllIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lllIllllIIlIll(String var10, String var17) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(lIlllllIIlIl[4], var21);
            return new String(var15.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }
}

