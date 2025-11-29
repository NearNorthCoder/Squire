package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aB  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aB.class */
public final class aB {
    private static /* synthetic */ String[] lllIIl;
    private static final /* synthetic */ aB[] $VALUES;
    private static /* synthetic */ int[] lllIlI;
    public static final /* synthetic */ aB EXTREME;
    public static final /* synthetic */ aB SOME;
    public static final /* synthetic */ aB NONE;

    public static aB valueOf(String str) {
        return (aB) Enum.valueOf(aB.class, str);
    }

    private static void lllIllII() {
        lllIlI = new int[4];
        lllIlI[0] = (78 ^ 23) & ((86 ^ 15) ^ (-1));
        lllIlI[1] = " ".length();
        lllIlI[2] = "  ".length();
        lllIlI[3] = "   ".length();
    }

    static {
        lllIllII();
        lllIlIll();
        NONE = new aB(lllIIl[lllIlI[0]], lllIlI[0]);
        SOME = new aB(lllIIl[lllIlI[1]], lllIlI[1]);
        EXTREME = new aB(lllIIl[lllIlI[2]], lllIlI[2]);
        aB[] aBVarArr = new aB[lllIlI[3]];
        aBVarArr[lllIlI[0]] = NONE;
        aBVarArr[lllIlI[1]] = SOME;
        aBVarArr[lllIlI[2]] = EXTREME;
        $VALUES = aBVarArr;
    }

    public static aB[] values() {
        return (aB[]) $VALUES.clone();
    }

    private aB(String str, int i2) {
    }

    private static String lllIlIlI(String llllIIllIlIIlII, String llllIIllIlIIIll) {
        try {
            SecretKeySpec llllIIllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlI[2], llllIIllIlIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIIllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIllIlIIlIl) {
            llllIIllIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllIlIll() {
        lllIIl = new String[lllIlI[3]];
        lllIIl[lllIlI[0]] = lllIlIlI("gf4GOD7TVQk=", "rDqDk");
        lllIIl[lllIlI[1]] = lllIlIlI("Stari1QAbJs=", "QIgRn");
        lllIIl[lllIlI[2]] = lllIlIlI("ddswg1U510I=", "UoFPa");
    }
}
