/*
 * Decompiled with CFR 0.152.
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class t
extends Enum<t> {
    public static final /* synthetic */ /* enum */ t NONE;
    private static final /* synthetic */ t[] $VALUES;
    private static /* synthetic */ int[] llllIIllIIIl;
    private static /* synthetic */ String[] llllIIlIllll;
    public static final /* synthetic */ /* enum */ t GOBLIN_PAINT_CANNON;
    public static final /* synthetic */ /* enum */ t HAM_JOINT;
    private final /* synthetic */ int itemID;

    public int bH() {
        return this.itemID;
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    private static void lIIIllllllIllII() {
        llllIIllIIIl = new int[8];
        t.llllIIllIIIl[0] = 1 & ~1;
        t.llllIIllIIIl[1] = -(0xFFFFCC87 & 0x7F79) & (0xFFFFFDB7 & Short.MAX_VALUE);
        t.llllIIllIIIl[2] = 1;
        t.llllIIllIIIl[3] = 0xFFFFDB76 & 0x7FC9;
        t.llllIIllIIIl[4] = 2;
        t.llllIIllIIIl[5] = -1;
        t.llllIIllIIIl[6] = 3;
        t.llllIIllIIIl[7] = 3 ^ (0x2C ^ 0x27);
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    private static String lIIIllllllIIllI(String var1, String var4) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llllIIllIIIl[4], var9);
            return new String(var7.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllllIlIII(String var8, String var5) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llllIIllIIIl[7]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llllIIllIIIl[4], var3);
            return new String(var10.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private t(int n3) {
        this.itemID = n3;
    }

    private static void lIIIllllllIlIIl() {
        llllIIlIllll = new String[llllIIllIIIl[6]];
        t.llllIIlIllll[t.llllIIllIIIl[0]] = t."GOBLIN_PAINT_CANNON";
        t.llllIIlIllll[t.llllIIllIIIl[2]] = t."HAM_JOINT";
        t.llllIIlIllll[t.llllIIllIIIl[4]] = t."NONE";
    }

    static {
        t.lIIIllllllIllII();
        t.lIIIllllllIlIIl();
        GOBLIN_PAINT_CANNON = new t(llllIIllIIIl[1]);
        HAM_JOINT = new t(llllIIllIIIl[3]);
        NONE = new t(llllIIllIIIl[5]);
        t[] tArray = new t[llllIIllIIIl[6]];
        tArray[t.llllIIllIIIl[0]] = GOBLIN_PAINT_CANNON;
        tArray[t.llllIIllIIIl[2]] = HAM_JOINT;
        tArray[t.llllIIllIIIl[4]] = NONE;
        $VALUES = tArray;
    }
}

