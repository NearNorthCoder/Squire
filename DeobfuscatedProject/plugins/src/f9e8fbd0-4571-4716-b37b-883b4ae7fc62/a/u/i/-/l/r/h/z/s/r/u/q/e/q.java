/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class q
extends Enum<q> {
    private static /* synthetic */ String[] lIllIlIllIlII;
    private static final /* synthetic */ q[] $VALUES;
    private final /* synthetic */ int quantity;
    public static final /* synthetic */ /* enum */ q CHARTER_SHIP;
    public static final /* synthetic */ /* enum */ q ZUL_ANDRA_TELEPORT;
    private static /* synthetic */ int[] lIllIlIllIlIl;
    private final /* synthetic */ int[] items;
    public static final /* synthetic */ /* enum */ q FAIRY_RING;

    private static void llIIlIIIIlIllII() {
        lIllIlIllIlIl = new int[9];
        q.lIllIlIllIlIl[0] = (0xDE ^ 0x8D ^ (0x17 ^ 0)) & (0x93 ^ 0xA4 ^ (0xD5 ^ 0xA6) ^ -" ".length());
        q.lIllIlIllIlIl[1] = " ".length();
        q.lIllIlIllIlIl[2] = 0xFFFFB3CA & 0x7EBF;
        q.lIllIlIllIlIl[3] = "  ".length();
        q.lIllIlIllIlIl[4] = 0xFFFFA77C & 0x7BFF;
        q.lIllIlIllIlIl[5] = 0xFFFFBFE6 & 0x431D;
        q.lIllIlIllIlIl[6] = -(0xFFFFFC5B & 0x2FF7) & (0xFFFFFFDF & 0x3FFA);
        q.lIllIlIllIlIl[7] = -(0xFFFFCC9B & 0x7B77) & (0xFFFFCFFB & 0x7A7F);
        q.lIllIlIllIlIl[8] = "   ".length();
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private static boolean llIIlIIIIlIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIIIlIlIll() {
        lIllIlIllIlII = new String[lIllIlIllIlIl[8]];
        q.lIllIlIllIlII[q.lIllIlIllIlIl[0]] = q.llIIlIIIIlIIIlI("fUEXyYTb+CIfcXIrOFs0fOLAf01Fql60", "POoXV");
        q.lIllIlIllIlII[q.lIllIlIllIlIl[1]] = q.llIIlIIIIlIlIlI("CzI+GjoSIT4GJA==", "MswHc");
        q.lIllIlIllIlII[q.lIllIlIllIlIl[3]] = q.llIIlIIIIlIlIlI("BCo3Ki4CMCkrMg4y", "Gbvxz");
    }

    public int[] K() {
        return this.items;
    }

    static {
        q.llIIlIIIIlIllII();
        q.llIIlIIIIlIlIll();
        int[] nArray = new int[lIllIlIllIlIl[1]];
        nArray[q.lIllIlIllIlIl[0]] = lIllIlIllIlIl[2];
        ZUL_ANDRA_TELEPORT = new q(lIllIlIllIlIl[1], nArray);
        int[] nArray2 = new int[lIllIlIllIlIl[3]];
        nArray2[q.lIllIlIllIlIl[0]] = lIllIlIllIlIl[4];
        nArray2[q.lIllIlIllIlIl[1]] = lIllIlIllIlIl[5];
        FAIRY_RING = new q(lIllIlIllIlIl[1], nArray2);
        int[] nArray3 = new int[lIllIlIllIlIl[1]];
        nArray3[q.lIllIlIllIlIl[0]] = lIllIlIllIlIl[7];
        CHARTER_SHIP = new q(lIllIlIllIlIl[6], nArray3);
        q[] qArray = new q[lIllIlIllIlIl[8]];
        qArray[q.lIllIlIllIlIl[0]] = ZUL_ANDRA_TELEPORT;
        qArray[q.lIllIlIllIlIl[1]] = FAIRY_RING;
        qArray[q.lIllIlIllIlIl[3]] = CHARTER_SHIP;
        $VALUES = qArray;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    private q(int n3, int ... nArray) {
        this.quantity = n3;
        this.items = nArray;
    }

    private static String llIIlIIIIlIIIlI(String llllllllllllllIllIIIllIIlllllIll, String llllllllllllllIllIIIllIIlllllIII) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIllIIllllllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIllIIllllllIl.init(lIllIlIllIlIl[3], llllllllllllllIllIIIllIIlllllllI);
            return new String(llllllllllllllIllIIIllIIllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllIIllllllII) {
            llllllllllllllIllIIIllIIllllllII.printStackTrace();
            return null;
        }
    }

    public int J() {
        return this.quantity;
    }

    private static String llIIlIIIIlIlIlI(String llllllllllllllIllIIIllIIlllIlIll, String llllllllllllllIllIIIllIIlllIlIlI) {
        llllllllllllllIllIIIllIIlllIlIll = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIIlllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIIlllIlIIl = new StringBuilder();
        char[] llllllllllllllIllIIIllIIlllIlIII = llllllllllllllIllIIIllIIlllIlIlI.toCharArray();
        int llllllllllllllIllIIIllIIlllIIlll = lIllIlIllIlIl[0];
        char[] llllllllllllllIllIIIllIIlllIIIIl = llllllllllllllIllIIIllIIlllIlIll.toCharArray();
        int llllllllllllllIllIIIllIIlllIIIII = llllllllllllllIllIIIllIIlllIIIIl.length;
        int llllllllllllllIllIIIllIIllIlllll = lIllIlIllIlIl[0];
        while (q.llIIlIIIIlIllIl(llllllllllllllIllIIIllIIllIlllll, llllllllllllllIllIIIllIIlllIIIII)) {
            char llllllllllllllIllIIIllIIlllIllII = llllllllllllllIllIIIllIIlllIIIIl[llllllllllllllIllIIIllIIllIlllll];
            llllllllllllllIllIIIllIIlllIlIIl.append((char)(llllllllllllllIllIIIllIIlllIllII ^ llllllllllllllIllIIIllIIlllIlIII[llllllllllllllIllIIIllIIlllIIlll % llllllllllllllIllIIIllIIlllIlIII.length]));
            "".length();
            ++llllllllllllllIllIIIllIIlllIIlll;
            ++llllllllllllllIllIIIllIIllIlllll;
            "".length();
            if (-" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIllIIlllIlIIl);
    }
}

