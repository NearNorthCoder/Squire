package l.p000.p001.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.e  reason: invalid package */
/* loaded from: d3ba43e2-4966-4faf-8fcb-fba83fc95121.jar:l/-/-/n/s/s/i/e/r/q/p/o/c/o/t/u/r/e/t/e.class */
public final class e {
    private /* synthetic */ String name;
    private static /* synthetic */ int[] lIIIlIIllllll;
    private static /* synthetic */ String[] lIIIlIIllllIl;
    public static final /* synthetic */ e TORCHER;
    public static final /* synthetic */ e SPINNER;
    public static final /* synthetic */ e SHIFTER;
    private /* synthetic */ int priority;
    public static final /* synthetic */ e SPLATTER;
    public static final /* synthetic */ e DEFILER;
    public static final /* synthetic */ e BRAWLER;
    public static final /* synthetic */ e RAVAGER;
    public static final /* synthetic */ e PORTAL;
    private static final /* synthetic */ e[] $VALUES;

    private e(String str, int i, String str2, int i2) {
        this.name = str2;
        this.priority = i2;
    }

    private static void lIIllllllIIlIll() {
        lIIIlIIllllIl = new String[lIIIlIIllllll[16]];
        lIIIlIIllllIl[lIIIlIIllllll[0]] = lIIllllllIIIIll("w2P19uB8t1k=", "RBhDR");
        lIIIlIIllllIl[lIIIlIIllllll[1]] = lIIllllllIIIlII("OhUWNh0dFQ==", "xgwAq");
        lIIIlIIllllIl[lIIIlIIllllll[2]] = lIIllllllIIIIll("yr0ekX16arQ=", "GOJtj");
        lIIIlIIllllIl[lIIIlIIllllll[3]] = lIIllllllIIIIll("X8U4AqUB5zc=", "WoEyr");
        lIIIlIIllllIl[lIIIlIIllllll[4]] = lIIllllllIIIlll("H+GeVBEEh0k=", "rLnUz");
        lIIIlIIllllIl[lIIIlIIllllll[5]] = lIIllllllIIIIll("7L/e0lYUfzU=", "MMVbN");
        lIIIlIIllllIl[lIIIlIIllllll[6]] = lIIllllllIIIIll("RTB8Yqb6FG8=", "gGNRD");
        lIIIlIIllllIl[lIIIlIIllllll[7]] = lIIllllllIIIlll("jTI57GrFAbA=", "nTtjC");
        lIIIlIIllllIl[lIIIlIIllllll[8]] = lIIllllllIIIlll("x+z5QBXngSk=", "WheCV");
        lIIIlIIllllIl[lIIIlIIllllll[9]] = lIIllllllIIIlII("JgIaKS4REQ==", "tclHI");
        lIIIlIIllllIl[lIIIlIIllllll[10]] = lIIllllllIIIlII("GCk+MAwOMw==", "KawvX");
        lIIIlIIllllIl[lIIIlIIllllll[11]] = lIIllllllIIIlll("vM67DgphdTo=", "cSXTK");
        lIIIlIIllllIl[lIIIlIIllllll[12]] = lIIllllllIIIIll("5qvPk+0fi58=", "QhmTc");
        lIIIlIIllllIl[lIIIlIIllllll[13]] = lIIllllllIIIIll("IdXnhyTs+N4=", "HagGE");
        lIIIlIIllllIl[lIIIlIIllllll[14]] = lIIllllllIIIlll("kvHCoWsESxewp5IDJl8TYg==", "xulKS");
        lIIIlIIllllIl[lIIIlIIllllll[15]] = lIIllllllIIIlII("Jh0LOQIBCBU=", "umgXv");
    }

    static {
        lIIlllllllllIII();
        lIIllllllIIlIll();
        BRAWLER = new e(lIIIlIIllllIl[lIIIlIIllllll[0]], lIIIlIIllllll[0], lIIIlIIllllIl[lIIIlIIllllll[1]], lIIIlIIllllll[1]);
        SPINNER = new e(lIIIlIIllllIl[lIIIlIIllllll[2]], lIIIlIIllllll[1], lIIIlIIllllIl[lIIIlIIllllll[3]], lIIIlIIllllll[2]);
        PORTAL = new e(lIIIlIIllllIl[lIIIlIIllllll[4]], lIIIlIIllllll[2], lIIIlIIllllIl[lIIIlIIllllll[5]], lIIIlIIllllll[3]);
        DEFILER = new e(lIIIlIIllllIl[lIIIlIIllllll[6]], lIIIlIIllllll[3], lIIIlIIllllIl[lIIIlIIllllll[7]], lIIIlIIllllll[4]);
        RAVAGER = new e(lIIIlIIllllIl[lIIIlIIllllll[8]], lIIIlIIllllll[4], lIIIlIIllllIl[lIIIlIIllllll[9]], lIIIlIIllllll[4]);
        SHIFTER = new e(lIIIlIIllllIl[lIIIlIIllllll[10]], lIIIlIIllllll[5], lIIIlIIllllIl[lIIIlIIllllll[11]], lIIIlIIllllll[5]);
        TORCHER = new e(lIIIlIIllllIl[lIIIlIIllllll[12]], lIIIlIIllllll[6], lIIIlIIllllIl[lIIIlIIllllll[13]], lIIIlIIllllll[5]);
        SPLATTER = new e(lIIIlIIllllIl[lIIIlIIllllll[14]], lIIIlIIllllll[7], lIIIlIIllllIl[lIIIlIIllllll[15]], lIIIlIIllllll[6]);
        e[] eVarArr = new e[lIIIlIIllllll[8]];
        eVarArr[lIIIlIIllllll[0]] = BRAWLER;
        eVarArr[lIIIlIIllllll[1]] = SPINNER;
        eVarArr[lIIIlIIllllll[2]] = PORTAL;
        eVarArr[lIIIlIIllllll[3]] = DEFILER;
        eVarArr[lIIIlIIllllll[4]] = RAVAGER;
        eVarArr[lIIIlIIllllll[5]] = SHIFTER;
        eVarArr[lIIIlIIllllll[6]] = TORCHER;
        eVarArr[lIIIlIIllllll[7]] = SPLATTER;
        $VALUES = eVarArr;
    }

    public int q() {
        return this.priority;
    }

    public static e o() {
        return (e) Arrays.stream(values()).max(Comparator.comparingInt((v0) -> {
            return v0.q();
        })).orElse(null);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Monsters." + name() + "(name=" + p() + ", priority=" + q() + ")";
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    private static String lIIllllllIIIlll(String lllllllllllllllIIIIlllIIIlIIIllI, String lllllllllllllllIIIIlllIIIlIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIIIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIllllll[8]), "DES");
            Cipher lllllllllllllllIIIIlllIIIlIIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllIIIlIIlIII.init(lIIIlIIllllll[2], lllllllllllllllIIIIlllIIIlIIlIIl);
            return new String(lllllllllllllllIIIIlllIIIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIIIlIIIlll) {
            lllllllllllllllIIIIlllIIIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllllllllIII() {
        lIIIlIIllllll = new int[17];
        lIIIlIIllllll[0] = (196 ^ 128) & ((212 ^ 144) ^ (-1));
        lIIIlIIllllll[1] = " ".length();
        lIIIlIIllllll[2] = "  ".length();
        lIIIlIIllllll[3] = "   ".length();
        lIIIlIIllllll[4] = 102 ^ 98;
        lIIIlIIllllll[5] = 83 ^ 86;
        lIIIlIIllllll[6] = (117 ^ 0) ^ (214 ^ 165);
        lIIIlIIllllll[7] = (151 ^ 197) ^ (126 ^ 43);
        lIIIlIIllllll[8] = (((156 + 40) - 135) + 119) ^ (((45 + 163) - 57) + 37);
        lIIIlIIllllll[9] = 47 ^ 38;
        lIIIlIIllllll[10] = 130 ^ 136;
        lIIIlIIllllll[11] = (22 ^ 15) ^ (213 ^ 199);
        lIIIlIIllllll[12] = 12 ^ 0;
        lIIIlIIllllll[13] = 36 ^ 41;
        lIIIlIIllllll[14] = 29 ^ 19;
        lIIIlIIllllll[15] = (183 ^ 154) ^ (39 ^ 5);
        lIIIlIIllllll[16] = (126 ^ 10) ^ (56 ^ 92);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    private static String lIIllllllIIIlII(String lllllllllllllllIIIIlllIIIlIllIll, String lllllllllllllllIIIIlllIIIlIllIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllIIIlIllIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlllIIIlIllIlI.toCharArray();
        int lllllllllllllllIIIIlllIIIlIlIlll = lIIIlIIllllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIlIIllllll[0];
        while (lIIlllllllllIIl(i, length)) {
            char lllllllllllllllIIIIlllIIIlIlllII = charArray2[i];
            lllllllllllllllIIIIlllIIIlIllIIl.append((char) (lllllllllllllllIIIIlllIIIlIlllII ^ charArray[lllllllllllllllIIIIlllIIIlIlIlll % charArray.length]));
            "".length();
            lllllllllllllllIIIIlllIIIlIlIlll++;
            i++;
            "".length();
            if ((((161 ^ 190) ^ (176 ^ 140)) & (((((63 + 41) - (-1)) + 41) ^ (((69 + 29) - (-78)) + 1)) ^ (-" ".length()))) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlllIIIlIllIIl);
    }

    private static String lIIllllllIIIIll(String lllllllllllllllIIIIlllIIIIlllIIl, String lllllllllllllllIIIIlllIIIIlllIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIllllll[2], lllllllllllllllIIIIlllIIIIllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlllIIIIlllIlI) {
            lllllllllllllllIIIIlllIIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllllllllIIl(int i, int i2) {
        return i < i2;
    }

    public String p() {
        return this.name;
    }
}
