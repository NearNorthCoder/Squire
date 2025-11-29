package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.h  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/h.class */
public final class EnumC0007h {
    private final /* synthetic */ WorldPoint location;
    private static final /* synthetic */ EnumC0007h[] $VALUES;
    private final /* synthetic */ String name;
    private final /* synthetic */ WorldArea area;
    public static final /* synthetic */ EnumC0007h CAKE_ARDOUGNE;
    public static final /* synthetic */ EnumC0007h FRUIT_HOSIDIUS;
    private final /* synthetic */ boolean ensureStanding;
    private static /* synthetic */ String[] lIIllIllllIlI;
    private static /* synthetic */ int[] lIIllIllllIll;

    public boolean A() {
        return this.ensureStanding;
    }

    public WorldArea p() {
        return this.area;
    }

    private static void lIllIIlIIIIIIII() {
        lIIllIllllIlI = new String[lIIllIllllIll[15]];
        lIIllIllllIlI[lIIllIllllIll[0]] = lIllIIIlllllllI("KAk7CDcqGjQCPSwGNQ==", "kHpMh");
        lIIllIllllIlI[lIIllIllllIll[1]] = lIllIIIllllllll("p2syqIcyMCyiKUYm3lbnRA==", "JFEyU");
        lIIllIllllIlI[lIIllIllllIll[7]] = lIllIIIlllllllI("DRM7MxgUCSEpBQ8IOyk=", "KAnzL");
        lIIllIllllIlI[lIIllIllllIll[8]] = lIllIIIllllllll("6gjBEpplHkUOxcwjklMRXw==", "UzEEI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    static {
        lIllIIlIIIIIIIl();
        lIllIIlIIIIIIII();
        CAKE_ARDOUGNE = new EnumC0007h(lIIllIllllIlI[lIIllIllllIll[0]], lIIllIllllIll[0], lIIllIllllIlI[lIIllIllllIll[1]], new WorldPoint(lIIllIllllIll[2], lIIllIllllIll[3], lIIllIllllIll[0]), new WorldArea(lIIllIllllIll[4], lIIllIllllIll[5], lIIllIllllIll[6], lIIllIllllIll[6], lIIllIllllIll[0]), lIIllIllllIll[1]);
        FRUIT_HOSIDIUS = new EnumC0007h(lIIllIllllIlI[lIIllIllllIll[7]], lIIllIllllIll[1], lIIllIllllIlI[lIIllIllllIll[8]], new WorldPoint(lIIllIllllIll[9], lIIllIllllIll[10], lIIllIllllIll[0]), new WorldArea(lIIllIllllIll[11], lIIllIllllIll[12], lIIllIllllIll[13], lIIllIllllIll[14], lIIllIllllIll[0]), lIIllIllllIll[0]);
        EnumC0007h[] enumC0007hArr = new EnumC0007h[lIIllIllllIll[7]];
        enumC0007hArr[lIIllIllllIll[0]] = CAKE_ARDOUGNE;
        enumC0007hArr[lIIllIllllIll[1]] = FRUIT_HOSIDIUS;
        $VALUES = enumC0007hArr;
    }

    private static String lIllIIIllllllll(String llllllllllllllIlllIllIllIlIlIlII, String llllllllllllllIlllIllIllIlIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIllIlIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIllIlIlIllI.init(lIIllIllllIll[7], secretKeySpec);
            return new String(llllllllllllllIlllIllIllIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIllIlIlIIII) {
            llllllllllllllIlllIllIllIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIIIIIIl() {
        lIIllIllllIll = new int[16];
        lIIllIllllIll[0] = (166 ^ 128) & ((22 ^ 48) ^ (-1));
        lIIllIllllIll[1] = " ".length();
        lIIllIllllIll[2] = (-((-111) & 12671)) & (-1025) & 16253;
        lIIllIllllIll[3] = (-((-1282) & 1811)) & (-8193) & 12031;
        lIIllIllllIll[4] = (-16785) & 19449;
        lIIllIllllIll[5] = (-13057) & 16362;
        lIIllIllllIll[6] = 71 ^ 64;
        lIIllIllllIll[7] = "  ".length();
        lIIllIllllIll[8] = "   ".length();
        lIIllIllllIll[9] = (-((-16769) & 31158)) & (-195) & 16383;
        lIIllIllllIll[10] = (-24577) & 28183;
        lIIllIllllIll[11] = (-((-38) & 22775)) & (-9) & 24539;
        lIIllIllllIll[12] = (-((-16917) & 25598)) & (-16385) & 28671;
        lIIllIllllIll[13] = 5 ^ 12;
        lIIllIllllIll[14] = 182 ^ 176;
        lIIllIllllIll[15] = 195 ^ 199;
    }

    public static EnumC0007h[] values() {
        return (EnumC0007h[]) $VALUES.clone();
    }

    private static boolean lIllIIlIIIIIIlI(int i, int i2) {
        return i < i2;
    }

    public String v() {
        return this.name;
    }

    private static String lIllIIIlllllllI(String llllllllllllllIlllIllIllIlIIIlII, String llllllllllllllIlllIllIllIIlllllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIllIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllIllIlIIIIIl = llllllllllllllIlllIllIllIIlllllI.toCharArray();
        int llllllllllllllIlllIllIllIlIIIIII = lIIllIllllIll[0];
        char[] charArray = str.toCharArray();
        int llllllllllllllIlllIllIllIIlllIIl = charArray.length;
        int llllllllllllllIlllIllIllIIlllIII = lIIllIllllIll[0];
        while (lIllIIlIIIIIIlI(llllllllllllllIlllIllIllIIlllIII, llllllllllllllIlllIllIllIIlllIIl)) {
            sb.append((char) (charArray[llllllllllllllIlllIllIllIIlllIII] ^ llllllllllllllIlllIllIllIlIIIIIl[llllllllllllllIlllIllIllIlIIIIII % llllllllllllllIlllIllIllIlIIIIIl.length]));
            "".length();
            llllllllllllllIlllIllIllIlIIIIII++;
            llllllllllllllIlllIllIllIIlllIII++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public WorldPoint z() {
        return this.location;
    }

    private EnumC0007h(String str, int i, String str2, WorldPoint worldPoint, WorldArea worldArea, boolean z) {
        this.name = str2;
        this.location = worldPoint;
        this.area = worldArea;
        this.ensureStanding = z;
    }

    public static EnumC0007h valueOf(String str) {
        return (EnumC0007h) Enum.valueOf(EnumC0007h.class, str);
    }
}
