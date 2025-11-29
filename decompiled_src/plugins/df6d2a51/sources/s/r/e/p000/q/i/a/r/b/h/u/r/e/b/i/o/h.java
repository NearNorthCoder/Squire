package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.h  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/h.class */
public final class h {
    public static final /* synthetic */ h MIDDLE;
    public static final /* synthetic */ h GHOST_MUSHROOM;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ h LEPRECHAUN;
    public static final /* synthetic */ h CAMP_ENTRANCE;
    public static final /* synthetic */ h DRIFTWOOD;
    private static /* synthetic */ int[] lllIIllIIIlI;
    private static final /* synthetic */ h[] $VALUES;
    private static /* synthetic */ String[] lllIIllIIIIl;

    private h(String str, int i, WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    public WorldPoint l() {
        return this.location;
    }

    private static void lIIIlIlIIllIIll() {
        lllIIllIIIIl = new String[lllIIllIIIlI[15]];
        lllIIllIIIIl[lllIIllIIIlI[0]] = lIIIlIlIIllIIIl("yRYf73+a3cI=", "FTtSw");
        lllIIllIIIIl[lllIIllIIIlI[3]] = lIIIlIlIIllIIIl("XlcWv8QDIHCrhC09ADAIog==", "GZNWo");
        lllIIllIIIIl[lllIIllIIIlI[6]] = lIIIlIlIIllIIlI("4ka8s+MVDB1iQKyvVQPyEQ==", "iBkaw");
        lllIIllIIIIl[lllIIllIIIlI[9]] = lIIIlIlIIllIIlI("9S2GiOi3qf7P+ayfNh9MRw==", "RCDxu");
        lllIIllIIIIl[lllIIllIIIlI[12]] = lIIIlIlIIllIIlI("7SMjdb1LB5wkn4HgVQikRg==", "GKSXJ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h c(WorldPoint worldPoint) {
        h[] values = values();
        int length = values.length;
        int i = lllIIllIIIlI[0];
        while (lIIIlIlIIllIlIl(i, length)) {
            h hVar = values[i];
            if (lIIIlIlIIllIllI(hVar.l().equals(worldPoint) ? 1 : 0)) {
                return hVar;
            }
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return null;
    }

    static {
        lIIIlIlIIllIlII();
        lIIIlIlIIllIIll();
        MIDDLE = new h(lllIIllIIIIl[lllIIllIIIlI[0]], lllIIllIIIlI[0], new WorldPoint(lllIIllIIIlI[1], lllIIllIIIlI[2], lllIIllIIIlI[0]));
        LEPRECHAUN = new h(lllIIllIIIIl[lllIIllIIIlI[3]], lllIIllIIIlI[3], new WorldPoint(lllIIllIIIlI[4], lllIIllIIIlI[5], lllIIllIIIlI[0]));
        CAMP_ENTRANCE = new h(lllIIllIIIIl[lllIIllIIIlI[6]], lllIIllIIIlI[6], new WorldPoint(lllIIllIIIlI[7], lllIIllIIIlI[8], lllIIllIIIlI[0]));
        GHOST_MUSHROOM = new h(lllIIllIIIIl[lllIIllIIIlI[9]], lllIIllIIIlI[9], new WorldPoint(lllIIllIIIlI[10], lllIIllIIIlI[11], lllIIllIIIlI[0]));
        DRIFTWOOD = new h(lllIIllIIIIl[lllIIllIIIlI[12]], lllIIllIIIlI[12], new WorldPoint(lllIIllIIIlI[13], lllIIllIIIlI[14], lllIIllIIIlI[0]));
        h[] hVarArr = new h[lllIIllIIIlI[15]];
        hVarArr[lllIIllIIIlI[0]] = MIDDLE;
        hVarArr[lllIIllIIIlI[3]] = LEPRECHAUN;
        hVarArr[lllIIllIIIlI[6]] = CAMP_ENTRANCE;
        hVarArr[lllIIllIIIlI[9]] = GHOST_MUSHROOM;
        hVarArr[lllIIllIIIlI[12]] = DRIFTWOOD;
        $VALUES = hVarArr;
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    private static boolean lIIIlIlIIllIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlIlIIllIIIl(String lllllllllllllllIIllIlIIlIIlIlllI, String lllllllllllllllIIllIlIIlIIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIllIIIlI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlIIlIllll) {
            lllllllllllllllIIllIlIIlIIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIllIllI(int i) {
        return i != 0;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    private static String lIIIlIlIIllIIlI(String lllllllllllllllIIllIlIIlIIIlllll, String lllllllllllllllIIllIlIIlIIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), lllIIllIIIlI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIllIIIlI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlIIlIIIlI) {
            lllllllllllllllIIllIlIIlIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIlIIllIlII() {
        lllIIllIIIlI = new int[17];
        lllIIllIIIlI[0] = ((((150 + 107) - 144) + 109) ^ (((134 + 130) - 263) + 134)) & (((((39 + 62) - 50) + 155) ^ (((120 + 142) - 247) + 136)) ^ (-" ".length()));
        lllIIllIIIlI[1] = (-((-1175) & 13727)) & (-17) & 16254;
        lllIIllIIIlI[2] = (-12290) & 16159;
        lllIIllIIIlI[3] = " ".length();
        lllIIllIIIlI[4] = (-((-2721) & 15015)) & (-16513) & 32511;
        lllIIllIIIlI[5] = (-257) & 4086;
        lllIIllIIIlI[6] = "  ".length();
        lllIIllIIIlI[7] = (-((-6177) & 31143)) & (-1) & 28670;
        lllIIllIIIlI[8] = (-28673) & 32482;
        lllIIllIIIlI[9] = "   ".length();
        lllIIllIIIlI[10] = (-((-3105) & 7601)) & (-8193) & 16383;
        lllIIllIIIlI[11] = (-((-5953) & 30529)) & (-4356) & 32731;
        lllIIllIIIlI[12] = 115 ^ 119;
        lllIIllIIIlI[13] = (-257) & 4007;
        lllIIllIIIlI[14] = (-((-24577) & 28869)) & (-18) & 8159;
        lllIIllIIIlI[15] = 71 ^ 66;
        lllIIllIIIlI[16] = 101 ^ 109;
    }
}
