package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.c  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/c.class */
public final class c {
    private final /* synthetic */ int regionId;
    private final /* synthetic */ WorldPoint location;
    private static /* synthetic */ int[] lIIlIllIIIlIl;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] lIIlIllIIIlII;
    public static final /* synthetic */ c VARROCK_EAST;

    private static void lIlIllIIllIIIII() {
        lIIlIllIIIlII = new String[lIIlIllIIIlIl[4]];
        lIIlIllIIIlII[lIIlIllIIIlIl[0]] = lIlIllIIlIlllll("HUQZKKrrZHu012HpxF3Big==", "EkdQK");
    }

    private static void lIlIllIIllIIIIl() {
        lIIlIllIIIlIl = new int[6];
        lIIlIllIIIlIl[0] = (196 ^ 149) & ((60 ^ 109) ^ (-1));
        lIIlIllIIIlIl[1] = (-((-16407) & 17623)) & (-16395) & 30463;
        lIIlIllIIIlIl[2] = (-((-28649) & 32747)) & (-24641) & 31991;
        lIIlIllIIIlIl[3] = (-8324) & 11743;
        lIIlIllIIIlIl[4] = " ".length();
        lIIlIllIIIlIl[5] = "  ".length();
    }

    private static String lIlIllIIlIlllll(String llllllllllllllIllllIlIlllllIIIlI, String llllllllllllllIllllIlIlllllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIlllllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIlllllIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIlllllIIlII.init(lIIlIllIIIlIl[5], secretKeySpec);
            return new String(llllllllllllllIllllIlIlllllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIlllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIlllllIIIll) {
            llllllllllllllIllllIlIlllllIIIll.printStackTrace();
            return null;
        }
    }

    public WorldPoint r() {
        return this.location;
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    private c(String str, int i, int i2, WorldPoint worldPoint) {
        this.regionId = i2;
        this.location = worldPoint;
    }

    public int q() {
        return this.regionId;
    }

    static {
        lIlIllIIllIIIIl();
        lIlIllIIllIIIII();
        VARROCK_EAST = new c(lIIlIllIIIlII[lIIlIllIIIlIl[0]], lIIlIllIIIlIl[0], lIIlIllIIIlIl[1], new WorldPoint(lIIlIllIIIlIl[2], lIIlIllIIIlIl[3], lIIlIllIIIlIl[0]));
        c[] cVarArr = new c[lIIlIllIIIlIl[4]];
        cVarArr[lIIlIllIIIlIl[0]] = VARROCK_EAST;
        $VALUES = cVarArr;
    }
}
