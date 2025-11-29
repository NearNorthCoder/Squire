/*
 * Decompiled with CFR 0.152.
 */
package l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    private /* synthetic */ String name;
    private static /* synthetic */ int[] lIIIlIIllllll;
    private static /* synthetic */ String[] lIIIlIIllllIl;
    public static final /* synthetic */ /* enum */ e TORCHER;
    public static final /* synthetic */ /* enum */ e SPINNER;
    public static final /* synthetic */ /* enum */ e SHIFTER;
    private /* synthetic */ int priority;
    public static final /* synthetic */ /* enum */ e SPLATTER;
    public static final /* synthetic */ /* enum */ e DEFILER;
    public static final /* synthetic */ /* enum */ e BRAWLER;
    public static final /* synthetic */ /* enum */ e RAVAGER;
    public static final /* synthetic */ /* enum */ e PORTAL;
    private static final /* synthetic */ e[] $VALUES;

    private e(String string2, int n2) {
        this.name = string2;
        this.priority = n2;
    }

    private static void lIIllllllIIlIll() {
        lIIIlIIllllIl = new String[lIIIlIIllllll[16]];
        e.lIIIlIIllllIl[e.lIIIlIIllllll[0]] = e.lIIllllllIIIIll("w2P19uB8t1k=", "RBhDR");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[1]] = e.lIIllllllIIIlII("OhUWNh0dFQ==", "xgwAq");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[2]] = e.lIIllllllIIIIll("yr0ekX16arQ=", "GOJtj");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[3]] = e.lIIllllllIIIIll("X8U4AqUB5zc=", "WoEyr");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[4]] = e.lIIllllllIIIlll("H+GeVBEEh0k=", "rLnUz");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[5]] = e.lIIllllllIIIIll("7L/e0lYUfzU=", "MMVbN");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[6]] = e.lIIllllllIIIIll("RTB8Yqb6FG8=", "gGNRD");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[7]] = e.lIIllllllIIIlll("jTI57GrFAbA=", "nTtjC");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[8]] = e.lIIllllllIIIlll("x+z5QBXngSk=", "WheCV");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[9]] = e.lIIllllllIIIlII("JgIaKS4REQ==", "tclHI");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[10]] = e.lIIllllllIIIlII("GCk+MAwOMw==", "KawvX");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[11]] = e.lIIllllllIIIlll("vM67DgphdTo=", "cSXTK");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[12]] = e.lIIllllllIIIIll("5qvPk+0fi58=", "QhmTc");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[13]] = e.lIIllllllIIIIll("IdXnhyTs+N4=", "HagGE");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[14]] = e.lIIllllllIIIlll("kvHCoWsESxewp5IDJl8TYg==", "xulKS");
        e.lIIIlIIllllIl[e.lIIIlIIllllll[15]] = e.lIIllllllIIIlII("Jh0LOQIBCBU=", "umgXv");
    }

    static {
        e.lIIlllllllllIII();
        e.lIIllllllIIlIll();
        BRAWLER = new e(lIIIlIIllllIl[lIIIlIIllllll[1]], lIIIlIIllllll[1]);
        SPINNER = new e(lIIIlIIllllIl[lIIIlIIllllll[3]], lIIIlIIllllll[2]);
        PORTAL = new e(lIIIlIIllllIl[lIIIlIIllllll[5]], lIIIlIIllllll[3]);
        DEFILER = new e(lIIIlIIllllIl[lIIIlIIllllll[7]], lIIIlIIllllll[4]);
        RAVAGER = new e(lIIIlIIllllIl[lIIIlIIllllll[9]], lIIIlIIllllll[4]);
        SHIFTER = new e(lIIIlIIllllIl[lIIIlIIllllll[11]], lIIIlIIllllll[5]);
        TORCHER = new e(lIIIlIIllllIl[lIIIlIIllllll[13]], lIIIlIIllllll[5]);
        SPLATTER = new e(lIIIlIIllllIl[lIIIlIIllllll[15]], lIIIlIIllllll[6]);
        e[] eArray = new e[lIIIlIIllllll[8]];
        eArray[e.lIIIlIIllllll[0]] = BRAWLER;
        eArray[e.lIIIlIIllllll[1]] = SPINNER;
        eArray[e.lIIIlIIllllll[2]] = PORTAL;
        eArray[e.lIIIlIIllllll[3]] = DEFILER;
        eArray[e.lIIIlIIllllll[4]] = RAVAGER;
        eArray[e.lIIIlIIllllll[5]] = SHIFTER;
        eArray[e.lIIIlIIllllll[6]] = TORCHER;
        eArray[e.lIIIlIIllllll[7]] = SPLATTER;
        $VALUES = eArray;
    }

    public int q() {
        return this.priority;
    }

    public static e o() {
        return Arrays.stream(e.values()).max(Comparator.comparingInt(e::q)).orElse(null);
    }

    public String toString() {
        return "Monsters." + this.name() + "(name=" + this.p() + ", priority=" + this.q() + ")";
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private static String lIIllllllIIIlll(String lllllllllllllllIIIIlllIIIlIIIllI, String lllllllllllllllIIIIlllIIIlIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIIIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIIllllll[8]), "DES");
            Cipher lllllllllllllllIIIIlllIIIlIIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllIIIlIIlIII.init(lIIIlIIllllll[2], lllllllllllllllIIIIlllIIIlIIlIIl);
            return new String(lllllllllllllllIIIIlllIIIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIIIlIIIlll) {
            lllllllllllllllIIIIlllIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllllllllIII() {
        lIIIlIIllllll = new int[17];
        e.lIIIlIIllllll[0] = (0xC4 ^ 0x80) & ~(0xD4 ^ 0x90);
        e.lIIIlIIllllll[1] = " ".length();
        e.lIIIlIIllllll[2] = "  ".length();
        e.lIIIlIIllllll[3] = "   ".length();
        e.lIIIlIIllllll[4] = 0x66 ^ 0x62;
        e.lIIIlIIllllll[5] = 0x53 ^ 0x56;
        e.lIIIlIIllllll[6] = 0x75 ^ 0 ^ (0xD6 ^ 0xA5);
        e.lIIIlIIllllll[7] = 0x97 ^ 0xC5 ^ (0x7E ^ 0x2B);
        e.lIIIlIIllllll[8] = 156 + 40 - 135 + 119 ^ 45 + 163 - 57 + 37;
        e.lIIIlIIllllll[9] = 0x2F ^ 0x26;
        e.lIIIlIIllllll[10] = 0x82 ^ 0x88;
        e.lIIIlIIllllll[11] = 0x16 ^ 0xF ^ (0xD5 ^ 0xC7);
        e.lIIIlIIllllll[12] = 0xC ^ 0;
        e.lIIIlIIllllll[13] = 0x24 ^ 0x29;
        e.lIIIlIIllllll[14] = 0x1D ^ 0x13;
        e.lIIIlIIllllll[15] = 0xB7 ^ 0x9A ^ (0x27 ^ 5);
        e.lIIIlIIllllll[16] = 0x7E ^ 0xA ^ (0x38 ^ 0x5C);
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static String lIIllllllIIIlII(String lllllllllllllllIIIIlllIIIlIllIll, String lllllllllllllllIIIIlllIIIlIlIlIl) {
        lllllllllllllllIIIIlllIIIlIllIll = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllIIIlIllIIl = new StringBuilder();
        char[] lllllllllllllllIIIIlllIIIlIllIII = lllllllllllllllIIIIlllIIIlIlIlIl.toCharArray();
        int lllllllllllllllIIIIlllIIIlIlIlll = lIIIlIIllllll[0];
        char[] lllllllllllllllIIIIlllIIIlIlIIIl = lllllllllllllllIIIIlllIIIlIllIll.toCharArray();
        int lllllllllllllllIIIIlllIIIlIlIIII = lllllllllllllllIIIIlllIIIlIlIIIl.length;
        int lllllllllllllllIIIIlllIIIlIIllll = lIIIlIIllllll[0];
        while (e.lIIlllllllllIIl(lllllllllllllllIIIIlllIIIlIIllll, lllllllllllllllIIIIlllIIIlIlIIII)) {
            char lllllllllllllllIIIIlllIIIlIlllII = lllllllllllllllIIIIlllIIIlIlIIIl[lllllllllllllllIIIIlllIIIlIIllll];
            lllllllllllllllIIIIlllIIIlIllIIl.append((char)(lllllllllllllllIIIIlllIIIlIlllII ^ lllllllllllllllIIIIlllIIIlIllIII[lllllllllllllllIIIIlllIIIlIlIlll % lllllllllllllllIIIIlllIIIlIllIII.length]));
            "".length();
            ++lllllllllllllllIIIIlllIIIlIlIlll;
            ++lllllllllllllllIIIIlllIIIlIIllll;
            "".length();
            if (((0xA1 ^ 0xBE ^ (0xB0 ^ 0x8C)) & (63 + 41 - -1 + 41 ^ 69 + 29 - -78 + 1 ^ -" ".length())) >= -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlllIIIlIllIIl);
    }

    private static String lIIllllllIIIIll(String lllllllllllllllIIIIlllIIIIlllIIl, String lllllllllllllllIIIIlllIIIIllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIIIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllIIIIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllIIIIlllIll.init(lIIIlIIllllll[2], lllllllllllllllIIIIlllIIIIllllII);
            return new String(lllllllllllllllIIIIlllIIIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIIIIlllIlI) {
            lllllllllllllllIIIIlllIIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllllllIIl(int n, int n2) {
        return n < n2;
    }

    public String p() {
        return this.name;
    }
}

