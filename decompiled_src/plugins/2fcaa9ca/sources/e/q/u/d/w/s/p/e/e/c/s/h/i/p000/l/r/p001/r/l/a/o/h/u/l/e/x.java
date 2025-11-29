package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.x  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/x.class */
public final class x {
    /* synthetic */ String name;
    private static /* synthetic */ String[] lllIIIIlllIl;
    public static final /* synthetic */ x NONE;
    private static final /* synthetic */ x[] $VALUES;
    private static /* synthetic */ int[] lllIIIIllllI;
    public static final /* synthetic */ x STRANGE_LOCKPICK;
    public static final /* synthetic */ x LOCKPICK;

    private static void lIIIlIIIllIlIII() {
        lllIIIIllllI = new int[7];
        lllIIIIllllI[0] = ((((162 + 42) - (-33)) + 7) ^ (((150 + 123) - 103) + 24)) & (((((168 + 182) - 148) + 41) ^ (((87 + 78) - (-30)) + 2)) ^ (-" ".length()));
        lllIIIIllllI[1] = " ".length();
        lllIIIIllllI[2] = "  ".length();
        lllIIIIllllI[3] = "   ".length();
        lllIIIIllllI[4] = 6 ^ 2;
        lllIIIIllllI[5] = (((98 + 146) - 186) + 138) ^ (((46 + 78) - 1) + 70);
        lllIIIIllllI[6] = (((128 + 163) - 149) + 36) ^ (((153 + 142) - 158) + 43);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    private static String lIIIlIIIllIIlIl(String lllllllllllllllIIlllIIIIIlIIllll, String lllllllllllllllIIlllIIIIIlIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIIIIlIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIIIIlIlIIIl.init(lllIIIIllllI[2], secretKeySpec);
            return new String(lllllllllllllllIIlllIIIIIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIIIIlIlIIII) {
            lllllllllllllllIIlllIIIIIlIlIIII.printStackTrace();
            return null;
        }
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    private static boolean lIIIlIIIllIlIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIIIllIIlll() {
        lllIIIIlllIl = new String[lllIIIIllllI[6]];
        lllIIIIlllIl[lllIIIIllllI[0]] = lIIIlIIIllIIlIl("B+II2L6pzTI=", "GHrvd");
        lllIIIIlllIl[lllIIIIllllI[1]] = lIIIlIIIllIIllI("", "RiCxr");
        lllIIIIlllIl[lllIIIIllllI[2]] = lIIIlIIIllIIlIl("cogGh1+gQ2hY1kv7Q/WguQ==", "abJhj");
        lllIIIIlllIl[lllIIIIllllI[3]] = lIIIlIIIllIIlIl("/i19lAulv3E=", "OcVXu");
        lllIIIIlllIl[lllIIIIllllI[4]] = lIIIlIIIllIIllI("HzYXLRgLJxogGQ8pFSUVBw==", "LbElV");
        lllIIIIlllIl[lllIIIIllllI[5]] = lIIIlIIIllIIlIl("sdEJxsCepRI=", "WePUJ");
    }

    private static String lIIIlIIIllIIllI(String lllllllllllllllIIlllIIIIIIllllll, String lllllllllllllllIIlllIIIIIIlllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlllIIIIIIllllII = lllllllllllllllIIlllIIIIIIlllllI.toCharArray();
        int lllllllllllllllIIlllIIIIIIlllIll = lllIIIIllllI[0];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIIlllIIIIIIllIlII = charArray.length;
        int i = lllIIIIllllI[0];
        while (lIIIlIIIllIlIIl(i, lllllllllllllllIIlllIIIIIIllIlII)) {
            char lllllllllllllllIIlllIIIIIlIIIIII = charArray[i];
            sb.append((char) (lllllllllllllllIIlllIIIIIlIIIIII ^ lllllllllllllllIIlllIIIIIIllllII[lllllllllllllllIIlllIIIIIIlllIll % lllllllllllllllIIlllIIIIIIllllII.length]));
            "".length();
            lllllllllllllllIIlllIIIIIIlllIll++;
            i++;
            "".length();
            if ((-((((65 + 142) - 161) + 111) ^ (((87 + 2) - 23) + 87))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIIlIIIllIlIII();
        lIIIlIIIllIIlll();
        NONE = new x(lllIIIIlllIl[lllIIIIllllI[0]], lllIIIIllllI[0], lllIIIIlllIl[lllIIIIllllI[1]]);
        LOCKPICK = new x(lllIIIIlllIl[lllIIIIllllI[2]], lllIIIIllllI[1], lllIIIIlllIl[lllIIIIllllI[3]]);
        STRANGE_LOCKPICK = new x(lllIIIIlllIl[lllIIIIllllI[4]], lllIIIIllllI[2], lllIIIIlllIl[lllIIIIllllI[5]]);
        x[] xVarArr = new x[lllIIIIllllI[3]];
        xVarArr[lllIIIIllllI[0]] = NONE;
        xVarArr[lllIIIIllllI[1]] = LOCKPICK;
        xVarArr[lllIIIIllllI[2]] = STRANGE_LOCKPICK;
        $VALUES = xVarArr;
    }

    private x(String str, int i, String str2) {
        this.name = str2;
    }
}
