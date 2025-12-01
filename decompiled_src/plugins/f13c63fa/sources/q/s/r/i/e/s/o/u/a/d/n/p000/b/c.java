package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.c  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/c.class */
public final class c {
    private static /* synthetic */ int[] llIlllllllI;
    private static /* synthetic */ String[] llIlllllIll;
    public static final /* synthetic */ c RIGOUR;
    private static final /* synthetic */ c[] $VALUES;
    private final /* synthetic */ Prayer[] prayers;
    public static final /* synthetic */ c EAGLE_EYE;

    static {
        lIlIllIIlIIIIl();
        lIlIllIIIlIlll();
        String str = llIlllllIll[llIlllllllI[0]];
        int i = llIlllllllI[0];
        Prayer[] prayerArr = new Prayer[llIlllllllI[1]];
        prayerArr[llIlllllllI[0]] = Prayer.RIGOUR;
        RIGOUR = new c(str, i, prayerArr);
        String str2 = llIlllllIll[llIlllllllI[1]];
        int i2 = llIlllllllI[1];
        Prayer[] prayerArr2 = new Prayer[llIlllllllI[2]];
        prayerArr2[llIlllllllI[0]] = Prayer.EAGLE_EYE;
        prayerArr2[llIlllllllI[1]] = Prayer.STEEL_SKIN;
        EAGLE_EYE = new c(str2, i2, prayerArr2);
        c[] cVarArr = new c[llIlllllllI[2]];
        cVarArr[llIlllllllI[0]] = RIGOUR;
        cVarArr[llIlllllllI[1]] = EAGLE_EYE;
        $VALUES = cVarArr;
    }

    private static String lIlIllIIIlIllI(String llllllllllllllllIIlIlIIlIIlIlIll, String llllllllllllllllIIlIlIIlIIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllllllI[2], llllllllllllllllIIlIlIIlIIlIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIlIIlIllII) {
            llllllllllllllllIIlIlIIlIIlIllII.printStackTrace();
            return null;
        }
    }

    private c(String str, int i, Prayer... prayerArr) {
        this.prayers = prayerArr;
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    private static void lIlIllIIIlIlll() {
        llIlllllIll = new String[llIlllllllI[2]];
        llIlllllIll[llIlllllllI[0]] = lIlIllIIIlIlIl("Musw/lisPB8=", "oYQEH");
        llIlllllIll[llIlllllllI[1]] = lIlIllIIIlIllI("W9oB2nt4nRd3kCu/0/i4dw==", "qZqZf");
    }

    private static String lIlIllIIIlIlIl(String llllllllllllllllIIlIlIIlIIIllllI, String llllllllllllllllIIlIlIIlIIIlllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIlIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), llIlllllllI[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlllllllI[2], llllllllllllllllIIlIlIIlIIlIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIlIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIlIIIlllll) {
            llllllllllllllllIIlIlIIlIIIlllll.printStackTrace();
            return null;
        }
    }

    public Prayer[] h() {
        return this.prayers;
    }

    private static void lIlIllIIlIIIIl() {
        llIlllllllI = new int[4];
        llIlllllllI[0] = ((63 ^ 19) ^ (166 ^ 199)) & (((((134 + 3) - (-91)) + 18) ^ (((104 + 139) - 220) + 164)) ^ (-" ".length()));
        llIlllllllI[1] = " ".length();
        llIlllllllI[2] = "  ".length();
        llIlllllllI[3] = 95 ^ 87;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }
}
