package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.ui.ColorScheme;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/n.class */
public final class EnumC0039n {
    public static final /* synthetic */ EnumC0039n FILLING;
    public static final /* synthetic */ EnumC0039n EMPTY;
    private static final /* synthetic */ EnumC0039n[] $VALUES;
    private final /* synthetic */ Color color;
    public static final /* synthetic */ EnumC0039n DEAD;
    private static /* synthetic */ String[] lIlllIlIlIll;
    public static final /* synthetic */ EnumC0039n DISEASED;
    private static /* synthetic */ int[] lIlllIlIllII;
    public static final /* synthetic */ EnumC0039n HARVESTABLE;
    public static final /* synthetic */ EnumC0039n GROWING;

    private static void lllIllIIlIlIII() {
        lIlllIlIlIll = new String[lIlllIlIllII[6]];
        lIlllIlIlIll[lIlllIlIllII[0]] = lllIllIIlIIlIl("RXceLajuJ+cdyNaWcmvyDA==", "tdWWs");
        lIlllIlIlIll[lIlllIlIllII[1]] = lllIllIIlIIllI("DhwCGgoHCQ==", "INMMC");
        lIlllIlIlIll[lIlllIlIllII[2]] = lllIllIIlIIlll("IM5J+Fs5KdqZOs9gzFzH0g==", "GWkpg");
        lIlllIlIlIll[lIlllIlIllII[3]] = lllIllIIlIIlIl("95DSANrDpAw=", "bQglJ");
        lIlllIlIlIll[lIlllIlIllII[4]] = lllIllIIlIIlIl("FWiGnFbYuWc=", "bSCRU");
        lIlllIlIlIll[lIlllIlIllII[5]] = lllIllIIlIIlIl("UJiKAzMH6eA=", "BYNdj");
    }

    private static void lllIllIIlIlIIl() {
        lIlllIlIllII = new int[8];
        lIlllIlIllII[0] = ((((106 + 98) - 184) + 127) ^ (((47 + 20) - (-20)) + 94)) & (((183 ^ 141) ^ (166 ^ 186)) ^ (-" ".length()));
        lIlllIlIllII[1] = " ".length();
        lIlllIlIllII[2] = "  ".length();
        lIlllIlIllII[3] = "   ".length();
        lIlllIlIllII[4] = 123 ^ 127;
        lIlllIlIllII[5] = (115 ^ 15) ^ (222 ^ 167);
        lIlllIlIllII[6] = 78 ^ 72;
        lIlllIlIllII[7] = (156 ^ 144) ^ (109 ^ 105);
    }

    static {
        lllIllIIlIlIIl();
        lllIllIIlIlIII();
        HARVESTABLE = new EnumC0039n(lIlllIlIlIll[lIlllIlIllII[0]], lIlllIlIllII[0], ColorScheme.PROGRESS_COMPLETE_COLOR);
        GROWING = new EnumC0039n(lIlllIlIlIll[lIlllIlIllII[1]], lIlllIlIllII[1], ColorScheme.PROGRESS_COMPLETE_COLOR);
        DISEASED = new EnumC0039n(lIlllIlIlIll[lIlllIlIllII[2]], lIlllIlIllII[2], ColorScheme.PROGRESS_INPROGRESS_COLOR);
        DEAD = new EnumC0039n(lIlllIlIlIll[lIlllIlIllII[3]], lIlllIlIllII[3], ColorScheme.PROGRESS_ERROR_COLOR);
        EMPTY = new EnumC0039n(lIlllIlIlIll[lIlllIlIllII[4]], lIlllIlIllII[4], ColorScheme.MEDIUM_GRAY_COLOR);
        FILLING = new EnumC0039n(lIlllIlIlIll[lIlllIlIllII[5]], lIlllIlIllII[5], ColorScheme.PROGRESS_INPROGRESS_COLOR);
        EnumC0039n[] enumC0039nArr = new EnumC0039n[lIlllIlIllII[6]];
        enumC0039nArr[lIlllIlIllII[0]] = HARVESTABLE;
        enumC0039nArr[lIlllIlIllII[1]] = GROWING;
        enumC0039nArr[lIlllIlIllII[2]] = DISEASED;
        enumC0039nArr[lIlllIlIllII[3]] = DEAD;
        enumC0039nArr[lIlllIlIllII[4]] = EMPTY;
        enumC0039nArr[lIlllIlIllII[5]] = FILLING;
        $VALUES = enumC0039nArr;
    }

    public Color V() {
        return this.color;
    }

    private EnumC0039n(String str, int i, Color color) {
        this.color = color;
    }

    private static String lllIllIIlIIlIl(String lllllllllllllllIlIllIlIllIIIIIlI, String lllllllllllllllIlIllIlIllIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIlIllIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIlIllIIIIlII.init(lIlllIlIllII[2], secretKeySpec);
            return new String(lllllllllllllllIlIllIlIllIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIlIllIIIIIll) {
            lllllllllllllllIlIllIlIllIIIIIll.printStackTrace();
            return null;
        }
    }

    public static EnumC0039n[] values() {
        return (EnumC0039n[]) $VALUES.clone();
    }

    private static String lllIllIIlIIlll(String lllllllllllllllIlIllIlIlIlllIlIl, String lllllllllllllllIlIllIlIlIlllIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlIlIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIlllIlII.getBytes(StandardCharsets.UTF_8)), lIlllIlIllII[7]), "DES");
            Cipher lllllllllllllllIlIllIlIlIlllIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIlIlIlllIlll.init(lIlllIlIllII[2], lllllllllllllllIlIllIlIlIllllIII);
            return new String(lllllllllllllllIlIllIlIlIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIlIlIlllIllI) {
            lllllllllllllllIlIllIlIlIlllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllIIlIlIlI(int i, int i2) {
        return i < i2;
    }

    public static EnumC0039n valueOf(String str) {
        return (EnumC0039n) Enum.valueOf(EnumC0039n.class, str);
    }

    private static String lllIllIIlIIllI(String lllllllllllllllIlIllIlIlIllIIlIl, String lllllllllllllllIlIllIlIlIllIIlII) {
        String lllllllllllllllIlIllIlIlIllIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIlIlIllIIIll = new StringBuilder();
        char[] lllllllllllllllIlIllIlIlIllIIIlI = lllllllllllllllIlIllIlIlIllIIlII.toCharArray();
        int lllllllllllllllIlIllIlIlIllIIIIl = lIlllIlIllII[0];
        char[] charArray = lllllllllllllllIlIllIlIlIllIIlIl2.toCharArray();
        int length = charArray.length;
        int i = lIlllIlIllII[0];
        while (lllIllIIlIlIlI(i, length)) {
            char lllllllllllllllIlIllIlIlIllIIllI = charArray[i];
            lllllllllllllllIlIllIlIlIllIIIll.append((char) (lllllllllllllllIlIllIlIlIllIIllI ^ lllllllllllllllIlIllIlIlIllIIIlI[lllllllllllllllIlIllIlIlIllIIIIl % lllllllllllllllIlIllIlIlIllIIIlI.length]));
            "".length();
            lllllllllllllllIlIllIlIlIllIIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIlIlIllIIIll);
    }
}
