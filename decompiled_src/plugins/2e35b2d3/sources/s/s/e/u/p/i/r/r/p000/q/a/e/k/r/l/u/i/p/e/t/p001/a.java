package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.a  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/a.class */
public final class a {
    private static /* synthetic */ int[] lIlIIlIlIIlIl;
    private static /* synthetic */ String[] lIlIIlIlIIlII;
    private final /* synthetic */ WorldPoint worldPoint;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ a KONAR;
    public static final /* synthetic */ a NIEVE;
    public static final /* synthetic */ a DURADEl;

    private static String lIlllIlIllllIIl(String llllllllllllllIllIlllIIllIIIIIII, String llllllllllllllIllIlllIIlIlllllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIIllIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlllIIlIlllllll.toCharArray();
        int llllllllllllllIllIlllIIlIlllllII = lIlIIlIlIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIlIIlIl[0];
        while (lIlllIlIlllllIl(i, length)) {
            char llllllllllllllIllIlllIIllIIIIIIl = charArray2[i];
            sb.append((char) (llllllllllllllIllIlllIIllIIIIIIl ^ charArray[llllllllllllllIllIlllIIlIlllllII % charArray.length]));
            "".length();
            llllllllllllllIllIlllIIlIlllllII++;
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlllIlIlllllII();
        lIlllIlIllllIll();
        NIEVE = new a(lIlIIlIlIIlII[lIlIIlIlIIlIl[0]], lIlIIlIlIIlIl[0], new WorldPoint(lIlIIlIlIIlIl[1], lIlIIlIlIIlIl[2], lIlIIlIlIIlIl[0]));
        DURADEl = new a(lIlIIlIlIIlII[lIlIIlIlIIlIl[3]], lIlIIlIlIIlIl[3], new WorldPoint(lIlIIlIlIIlIl[4], lIlIIlIlIIlIl[5], lIlIIlIlIIlIl[3]));
        KONAR = new a(lIlIIlIlIIlII[lIlIIlIlIIlIl[6]], lIlIIlIlIIlIl[6], new WorldPoint(lIlIIlIlIIlIl[7], lIlIIlIlIIlIl[8], lIlIIlIlIIlIl[0]));
        a[] aVarArr = new a[lIlIIlIlIIlIl[9]];
        aVarArr[lIlIIlIlIIlIl[0]] = NIEVE;
        aVarArr[lIlIIlIlIIlIl[3]] = DURADEl;
        aVarArr[lIlIIlIlIIlIl[6]] = KONAR;
        $VALUES = aVarArr;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    private static void lIlllIlIllllIll() {
        lIlIIlIlIIlII = new String[lIlIIlIlIIlIl[9]];
        lIlIIlIlIIlII[lIlIIlIlIIlIl[0]] = lIlllIlIllllIII("YK7+x1hzjbk=", "lBnyc");
        lIlIIlIlIIlII[lIlIIlIlIIlIl[3]] = lIlllIlIllllIIl("NCUiBwk1HA==", "pppFM");
        lIlIIlIlIIlII[lIlIIlIlIIlIl[6]] = lIlllIlIllllIlI("PbCdvYY9l1g=", "caKWZ");
    }

    private static void lIlllIlIlllllII() {
        lIlIIlIlIIlIl = new int[11];
        lIlIIlIlIIlIl[0] = ((73 ^ 108) ^ (145 ^ 163)) & (((182 ^ 159) ^ (131 ^ 189)) ^ (-" ".length()));
        lIlIIlIlIIlIl[1] = (-((-5125) & 13422)) & (-16913) & 27643;
        lIlIIlIlIIlIl[2] = (-((-18773) & 31573)) & (-16545) & 32767;
        lIlIIlIlIIlIl[3] = " ".length();
        lIlIIlIlIIlIl[4] = (-((-305) & 29171)) & (-1) & 31735;
        lIlIIlIlIIlIl[5] = (-((-18961) & 32282)) & (-67) & 16367;
        lIlIIlIlIIlIl[6] = "  ".length();
        lIlIIlIlIIlIl[7] = (-((-12729) & 13241)) & (-22691) & 24510;
        lIlIIlIlIIlIl[8] = (-16659) & 20446;
        lIlIIlIlIIlIl[9] = "   ".length();
        lIlIIlIlIIlIl[10] = (57 ^ 120) ^ (228 ^ 173);
    }

    private static String lIlllIlIllllIII(String llllllllllllllIllIlllIIllIIlllIl, String llllllllllllllIllIlllIIllIIlllII) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIllIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlllIIllIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlllIIllIIlllll.init(lIlIIlIlIIlIl[6], llllllllllllllIllIlllIIllIlIIIII);
            return new String(llllllllllllllIllIlllIIllIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIIllIIllllI) {
            llllllllllllllIllIlllIIllIIllllI.printStackTrace();
            return null;
        }
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    private static String lIlllIlIllllIlI(String llllllllllllllIllIlllIIllIIlIIII, String llllllllllllllIllIlllIIllIIIllll) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIllIIIllll.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIIlIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIlIIlIl[6], llllllllllllllIllIlllIIllIIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIIllIIlIIIl) {
            llllllllllllllIllIlllIIllIIlIIIl.printStackTrace();
            return null;
        }
    }

    public WorldPoint k() {
        return this.worldPoint;
    }

    private static boolean lIlllIlIlllllIl(int i, int i2) {
        return i < i2;
    }

    private a(String str, int i, WorldPoint worldPoint) {
        this.worldPoint = worldPoint;
    }
}
