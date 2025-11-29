/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class C
extends Enum<C> {
    private static /* synthetic */ String[] lIlIIllIIlII;
    private static /* synthetic */ int[] lIlIIllIIlIl;
    public static final /* synthetic */ /* enum */ C ACID;
    private final /* synthetic */ int ticks;
    public static final /* synthetic */ /* enum */ C TELEPORT;
    private static final /* synthetic */ C[] $VALUES;
    public static final /* synthetic */ /* enum */ C BURN;

    private static String llIllIlIIIIlII(String lllllllllllllllIllIllIIIlIlllllI, String lllllllllllllllIllIllIIIlIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIllIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIlIllllIl.getBytes(StandardCharsets.UTF_8)), lIlIIllIIlIl[7]), "DES");
            Cipher lllllllllllllllIllIllIIIllIIIIII = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIIllIIIIII.init(lIlIIllIIlIl[4], lllllllllllllllIllIllIIIllIIIIIl);
            return new String(lllllllllllllllIllIllIIIllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIIlIllllll) {
            lllllllllllllllIllIllIIIlIllllll.printStackTrace();
            return null;
        }
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    private static void llIllIlIIIIllI() {
        lIlIIllIIlII = new String[lIlIIllIIlIl[6]];
        C.lIlIIllIIlII[C.lIlIIllIIlIl[0]] = C."BURN";
        C.lIlIIllIIlII[C.lIlIIllIIlIl[2]] = C."ACID";
        C.lIlIIllIIlII[C.lIlIIllIIlIl[4]] = C."TELEPORT";
    }

    static {
        C.llIllIlIIIIlll();
        C.llIllIlIIIIllI();
        BURN = new C(lIlIIllIIlIl[1]);
        ACID = new C(lIlIIllIIlIl[3]);
        TELEPORT = new C(lIlIIllIIlIl[5]);
        C[] cArray = new C[lIlIIllIIlIl[6]];
        cArray[C.lIlIIllIIlIl[0]] = BURN;
        cArray[C.lIlIIllIIlIl[2]] = ACID;
        cArray[C.lIlIIllIIlIl[4]] = TELEPORT;
        $VALUES = cArray;
    }

    private static String llIllIlIIIIlIl(String lllllllllllllllIllIllIIIllIIlIll, String lllllllllllllllIllIllIIIllIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIIllIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIIllIIllIl.init(lIlIIllIIlIl[4], lllllllllllllllIllIllIIIllIIlllI);
            return new String(lllllllllllllllIllIllIIIllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIIllIIllII) {
            lllllllllllllllIllIllIIIllIIllII.printStackTrace();
            return null;
        }
    }

    public int bB() {
        return this.ticks;
    }

    private static void llIllIlIIIIlll() {
        lIlIIllIIlIl = new int[8];
        C.lIlIIllIIlIl[0] = 1 & ~1;
        C.lIlIIllIIlIl[1] = 0x6C ^ 0x45;
        C.lIlIIllIIlIl[2] = 1;
        C.lIlIIllIIlIl[3] = 170 + 178 - 167 + 32 ^ 166 + 181 - 199 + 46;
        C.lIlIIllIIlIl[4] = 2;
        C.lIlIIllIIlIl[5] = 0x3D ^ 0x7B ^ (0x47 ^ 0xB);
        C.lIlIIllIIlIl[6] = 3;
        C.lIlIIllIIlIl[7] = 0x4F ^ 0x47;
    }

    public static C valueOf(String string) {
        return Enum.valueOf(C.class, string);
    }

    private C(int n3) {
        this.ticks = n3;
    }
}

