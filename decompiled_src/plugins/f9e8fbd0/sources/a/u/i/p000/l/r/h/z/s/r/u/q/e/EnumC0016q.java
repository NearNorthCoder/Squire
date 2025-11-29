package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.q  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/q.class */
public final class EnumC0016q {
    private static /* synthetic */ String[] lIllIlIllIlII;
    private static final /* synthetic */ EnumC0016q[] $VALUES;
    private final /* synthetic */ int quantity;
    public static final /* synthetic */ EnumC0016q CHARTER_SHIP;
    public static final /* synthetic */ EnumC0016q ZUL_ANDRA_TELEPORT;
    private static /* synthetic */ int[] lIllIlIllIlIl;
    private final /* synthetic */ int[] items;
    public static final /* synthetic */ EnumC0016q FAIRY_RING;

    private static void llIIlIIIIlIllII() {
        lIllIlIllIlIl = new int[9];
        lIllIlIllIlIl[0] = ((222 ^ 141) ^ (23 ^ 0)) & (((147 ^ 164) ^ (213 ^ 166)) ^ (-" ".length()));
        lIllIlIllIlIl[1] = " ".length();
        lIllIlIllIlIl[2] = (-19510) & 32447;
        lIllIlIllIlIl[3] = "  ".length();
        lIllIlIllIlIl[4] = (-22660) & 31743;
        lIllIlIllIlIl[5] = (-16410) & 17181;
        lIllIlIllIlIl[6] = (-((-933) & 12279)) & (-33) & 16378;
        lIllIlIllIlIl[7] = (-((-13157) & 31607)) & (-12293) & 31359;
        lIllIlIllIlIl[8] = "   ".length();
    }

    public static EnumC0016q[] values() {
        return (EnumC0016q[]) $VALUES.clone();
    }

    private static boolean llIIlIIIIlIllIl(int i, int i2) {
        return i < i2;
    }

    private static void llIIlIIIIlIlIll() {
        lIllIlIllIlII = new String[lIllIlIllIlIl[8]];
        lIllIlIllIlII[lIllIlIllIlIl[0]] = llIIlIIIIlIIIlI("fUEXyYTb+CIfcXIrOFs0fOLAf01Fql60", "POoXV");
        lIllIlIllIlII[lIllIlIllIlIl[1]] = llIIlIIIIlIlIlI("CzI+GjoSIT4GJA==", "MswHc");
        lIllIlIllIlII[lIllIlIllIlIl[3]] = llIIlIIIIlIlIlI("BCo3Ki4CMCkrMg4y", "Gbvxz");
    }

    public int[] K() {
        return this.items;
    }

    static {
        llIIlIIIIlIllII();
        llIIlIIIIlIlIll();
        String str = lIllIlIllIlII[lIllIlIllIlIl[0]];
        int i = lIllIlIllIlIl[0];
        int i2 = lIllIlIllIlIl[1];
        int[] iArr = new int[lIllIlIllIlIl[1]];
        iArr[lIllIlIllIlIl[0]] = lIllIlIllIlIl[2];
        ZUL_ANDRA_TELEPORT = new EnumC0016q(str, i, i2, iArr);
        String str2 = lIllIlIllIlII[lIllIlIllIlIl[1]];
        int i3 = lIllIlIllIlIl[1];
        int i4 = lIllIlIllIlIl[1];
        int[] iArr2 = new int[lIllIlIllIlIl[3]];
        iArr2[lIllIlIllIlIl[0]] = lIllIlIllIlIl[4];
        iArr2[lIllIlIllIlIl[1]] = lIllIlIllIlIl[5];
        FAIRY_RING = new EnumC0016q(str2, i3, i4, iArr2);
        String str3 = lIllIlIllIlII[lIllIlIllIlIl[3]];
        int i5 = lIllIlIllIlIl[3];
        int i6 = lIllIlIllIlIl[6];
        int[] iArr3 = new int[lIllIlIllIlIl[1]];
        iArr3[lIllIlIllIlIl[0]] = lIllIlIllIlIl[7];
        CHARTER_SHIP = new EnumC0016q(str3, i5, i6, iArr3);
        EnumC0016q[] enumC0016qArr = new EnumC0016q[lIllIlIllIlIl[8]];
        enumC0016qArr[lIllIlIllIlIl[0]] = ZUL_ANDRA_TELEPORT;
        enumC0016qArr[lIllIlIllIlIl[1]] = FAIRY_RING;
        enumC0016qArr[lIllIlIllIlIl[3]] = CHARTER_SHIP;
        $VALUES = enumC0016qArr;
    }

    public static EnumC0016q valueOf(String str) {
        return (EnumC0016q) Enum.valueOf(EnumC0016q.class, str);
    }

    private EnumC0016q(String str, int i, int i2, int... iArr) {
        this.quantity = i2;
        this.items = iArr;
    }

    private static String llIIlIIIIlIIIlI(String llllllllllllllIllIIIllIIlllllIll, String llllllllllllllIllIIIllIIlllllIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIllIlIl[3], llllllllllllllIllIIIllIIlllllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllIIllllllII) {
            llllllllllllllIllIIIllIIllllllII.printStackTrace();
            return null;
        }
    }

    public int J() {
        return this.quantity;
    }

    private static String llIIlIIIIlIlIlI(String llllllllllllllIllIIIllIIlllIlIll, String llllllllllllllIllIIIllIIlllIlIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIIlllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIIlllIlIIl = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIllIIlllIlIlI.toCharArray();
        int llllllllllllllIllIIIllIIlllIIlll = lIllIlIllIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIllIlIl[0];
        while (llIIlIIIIlIllIl(i, length)) {
            llllllllllllllIllIIIllIIlllIlIIl.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIIllIIlllIIlll % charArray.length]));
            "".length();
            llllllllllllllIllIIIllIIlllIIlll++;
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIllIIlllIlIIl);
    }
}
