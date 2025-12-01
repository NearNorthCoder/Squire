package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.C  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/C.class */
public final class C {
    private static /* synthetic */ String[] lIlIIllIIlII;
    private static /* synthetic */ int[] lIlIIllIIlIl;
    public static final /* synthetic */ C ACID;
    private final /* synthetic */ int ticks;
    public static final /* synthetic */ C TELEPORT;
    private static final /* synthetic */ C[] $VALUES;
    public static final /* synthetic */ C BURN;

    private static String llIllIlIIIIlII(String lllllllllllllllIllIllIIIlIlllllI, String lllllllllllllllIllIllIIIlIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIllIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIlIllllIl.getBytes(StandardCharsets.UTF_8)), lIlIIllIIlIl[7]), "DES");
            Cipher lllllllllllllllIllIllIIIllIIIIII = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIIllIIIIII.init(lIlIIllIIlIl[4], lllllllllllllllIllIllIIIllIIIIIl);
            return new String(lllllllllllllllIllIllIIIllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIIlIllllll) {
            lllllllllllllllIllIllIIIlIllllll.printStackTrace();
            return null;
        }
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }

    private static void llIllIlIIIIllI() {
        lIlIIllIIlII = new String[lIlIIllIIlIl[6]];
        lIlIIllIIlII[lIlIIllIIlIl[0]] = llIllIlIIIIlII("HuKwb/u/ASw=", "EfxfM");
        lIlIIllIIlII[lIlIIllIIlIl[2]] = llIllIlIIIIlIl("hmX+JonS6BM=", "Cafzj");
        lIlIIllIIlII[lIlIIllIIlIl[4]] = llIllIlIIIIlIl("TiMPW2Z3k8yfTGSiVGB4xQ==", "AmSTe");
    }

    static {
        llIllIlIIIIlll();
        llIllIlIIIIllI();
        BURN = new C(lIlIIllIIlII[lIlIIllIIlIl[0]], lIlIIllIIlIl[0], lIlIIllIIlIl[1]);
        ACID = new C(lIlIIllIIlII[lIlIIllIIlIl[2]], lIlIIllIIlIl[2], lIlIIllIIlIl[3]);
        TELEPORT = new C(lIlIIllIIlII[lIlIIllIIlIl[4]], lIlIIllIIlIl[4], lIlIIllIIlIl[5]);
        C[] cArr = new C[lIlIIllIIlIl[6]];
        cArr[lIlIIllIIlIl[0]] = BURN;
        cArr[lIlIIllIIlIl[2]] = ACID;
        cArr[lIlIIllIIlIl[4]] = TELEPORT;
        $VALUES = cArr;
    }

    private static String llIllIlIIIIlIl(String lllllllllllllllIllIllIIIllIIlIll, String lllllllllllllllIllIllIIIllIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIllIIlIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIIllIIllII) {
            lllllllllllllllIllIllIIIllIIllII.printStackTrace();
            return null;
        }
    }

    public int bB() {
        return this.ticks;
    }

    private static void llIllIlIIIIlll() {
        lIlIIllIIlIl = new int[8];
        lIlIIllIIlIl[0] = " ".length() & (" ".length() ^ (-1));
        lIlIIllIIlIl[1] = 108 ^ 69;
        lIlIIllIIlIl[2] = " ".length();
        lIlIIllIIlIl[3] = (((170 + 178) - 167) + 32) ^ (((166 + 181) - 199) + 46);
        lIlIIllIIlIl[4] = "  ".length();
        lIlIIllIIlIl[5] = (61 ^ 123) ^ (71 ^ 11);
        lIlIIllIIlIl[6] = "   ".length();
        lIlIIllIIlIl[7] = 79 ^ 71;
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    private C(String str, int i, int i2) {
        this.ticks = i2;
    }
}
