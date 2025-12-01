package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.b  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/b.class */
public final class b {
    private final /* synthetic */ WorldPoint location;
    private static /* synthetic */ String[] lIIlllIllIII;
    public static final /* synthetic */ b HEROS;
    private static /* synthetic */ int[] lIIllllIIIlI;
    private final /* synthetic */ String locationName;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ b MYTHS_GUILD;
    private final /* synthetic */ WorldArea dragonArea;
    private final /* synthetic */ WorldPoint safeSpot;
    public static final /* synthetic */ b TAVERLEY_DUNGEON;

    private static String llIlIIIlIIIIll(String lllllllllllllllIlllIlIIlllIlIlIl, String lllllllllllllllIlllIlIIlllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlllIlIlll.init(lIIllllIIIlI[9], secretKeySpec);
            return new String(lllllllllllllllIlllIlIIlllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlllIlIllI) {
            lllllllllllllllIlllIlIIlllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIllIlIII(int i, int i2) {
        return i < i2;
    }

    private static String llIlIIIlIIIIIl(String lllllllllllllllIlllIlIIllllIlIlI, String lllllllllllllllIlllIlIIllllIlIIl) {
        String lllllllllllllllIlllIlIIllllIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIllllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlllIlIIllllIIlll = lllllllllllllllIlllIlIIllllIlIIl.toCharArray();
        int lllllllllllllllIlllIlIIllllIIllI = lIIllllIIIlI[0];
        char[] charArray = lllllllllllllllIlllIlIIllllIlIlI2.toCharArray();
        int lllllllllllllllIlllIlIIlllIlllll = charArray.length;
        int i = lIIllllIIIlI[0];
        while (llIlIIIllIlIII(i, lllllllllllllllIlllIlIIlllIlllll)) {
            char lllllllllllllllIlllIlIIllllIlIll = charArray[i];
            sb.append((char) (lllllllllllllllIlllIlIIllllIlIll ^ lllllllllllllllIlllIlIIllllIIlll[lllllllllllllllIlllIlIIllllIIllI % lllllllllllllllIlllIlIIllllIIlll.length]));
            "".length();
            lllllllllllllllIlllIlIIllllIIllI++;
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public WorldPoint o() {
        return this.location;
    }

    public WorldArea p() {
        return this.dragonArea;
    }

    private static void llIlIIIlIIIlII() {
        lIIlllIllIII = new String[lIIllllIIIlI[29]];
        lIIlllIllIII[lIIllllIIIlI[0]] = llIlIIIlIIIIIl("CxAjBjs=", "CUqIh");
        lIIlllIllIII[lIIllllIIIlI[1]] = llIlIIIlIIIIIl("BT8jPj0+fXEWLSQ2NXEaLCk0PD0jLg==", "MZQQX");
        lIIlllIllIII[lIIllllIIIlI[9]] = llIlIIIlIIIIlI("mhaKZiqh+XzpvipBlzmLIqB1CzJ2lp1J", "YEOMh");
        lIIlllIllIII[lIIllllIIIlI[10]] = llIlIIIlIIIIIl("PjgMKCAGPANtFh83HSg9BA==", "jYzMR");
        lIIlllIllIII[lIIllllIIIlI[19]] = llIlIIIlIIIIll("tFeEip6C91FOe8S1uzWiUA==", "FJUNH");
        lIIlllIllIII[lIIllllIIIlI[20]] = llIlIIIlIIIIll("KUWuEVec720GLcfggYA8Yg==", "oPtnZ");
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    private b(String str, int i, String str2, WorldPoint worldPoint, WorldArea worldArea, WorldPoint worldPoint2) {
        this.location = worldPoint;
        this.locationName = str2;
        this.dragonArea = worldArea;
        this.safeSpot = worldPoint2;
    }

    static {
        llIlIIIllIIlll();
        llIlIIIlIIIlII();
        HEROS = new b(lIIlllIllIII[lIIllllIIIlI[0]], lIIllllIIIlI[0], lIIlllIllIII[lIIllllIIIlI[1]], new WorldPoint(lIIllllIIIlI[2], lIIllllIIIlI[3], lIIllllIIIlI[0]), new WorldArea(lIIllllIIIlI[4], lIIllllIIIlI[5], lIIllllIIIlI[6], lIIllllIIIlI[7], lIIllllIIIlI[0]), new WorldPoint(lIIllllIIIlI[8], lIIllllIIIlI[3], lIIllllIIIlI[0]));
        TAVERLEY_DUNGEON = new b(lIIlllIllIII[lIIllllIIIlI[9]], lIIllllIIIlI[1], lIIlllIllIII[lIIllllIIIlI[10]], new WorldPoint(lIIllllIIIlI[11], lIIllllIIIlI[12], lIIllllIIIlI[0]), new WorldArea(lIIllllIIIlI[13], lIIllllIIIlI[14], lIIllllIIIlI[15], lIIllllIIIlI[16], lIIllllIIIlI[0]), new WorldPoint(lIIllllIIIlI[17], lIIllllIIIlI[18], lIIllllIIIlI[0]));
        MYTHS_GUILD = new b(lIIlllIllIII[lIIllllIIIlI[19]], lIIllllIIIlI[9], lIIlllIllIII[lIIllllIIIlI[20]], new WorldPoint(lIIllllIIIlI[21], lIIllllIIIlI[22], lIIllllIIIlI[1]), new WorldArea(lIIllllIIIlI[23], lIIllllIIIlI[24], lIIllllIIIlI[25], lIIllllIIIlI[26], lIIllllIIIlI[1]), new WorldPoint(lIIllllIIIlI[27], lIIllllIIIlI[28], lIIllllIIIlI[1]));
        b[] bVarArr = new b[lIIllllIIIlI[10]];
        bVarArr[lIIllllIIIlI[0]] = HEROS;
        bVarArr[lIIllllIIIlI[1]] = TAVERLEY_DUNGEON;
        bVarArr[lIIllllIIIlI[9]] = MYTHS_GUILD;
        $VALUES = bVarArr;
    }

    private static String llIlIIIlIIIIlI(String lllllllllllllllIlllIlIIlllIIlIII, String lllllllllllllllIlllIlIIlllIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlllIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIllllIIIlI[7]), "DES");
            Cipher lllllllllllllllIlllIlIIlllIIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIlllIIlIlI.init(lIIllllIIIlI[9], secretKeySpec);
            return new String(lllllllllllllllIlllIlIIlllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIlllIIlIIl) {
            lllllllllllllllIlllIlIIlllIIlIIl.printStackTrace();
            return null;
        }
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public WorldPoint q() {
        return this.safeSpot;
    }

    private static void llIlIIIllIIlll() {
        lIIllllIIIlI = new int[30];
        lIIllllIIIlI[0] = ((((110 + 6) - 40) + 122) ^ (((108 + 139) - 157) + 55)) & (((39 ^ 12) ^ (204 ^ 176)) ^ (-" ".length()));
        lIIllllIIIlI[1] = " ".length();
        lIIllllIIIlI[2] = (-24577) & 27486;
        lIIllllIIIlI[3] = (-20553) & 30458;
        lIIllllIIIlI[4] = (-9220) & 12123;
        lIIllllIIIlI[5] = (-18689) & 28590;
        lIIllllIIIlI[6] = (18 ^ 23) ^ (24 ^ 16);
        lIIllllIIIlI[7] = 69 ^ 77;
        lIIllllIIIlI[8] = (-((-3023) & 32735)) & (-129) & 32756;
        lIIllllIIIlI[9] = "  ".length();
        lIIllllIIIlI[10] = "   ".length();
        lIIllllIIIlI[11] = (-" ".length()) & (-25601) & 28511;
        lIIllllIIIlI[12] = (-((-1637) & 8167)) & (-1) & 16319;
        lIIllllIIIlI[13] = (-((-11651) & 32163)) & (-9) & 23419;
        lIIllllIIIlI[14] = (-((-24757) & 28917)) & (-16513) & 30445;
        lIIllllIIIlI[15] = 81 ^ 79;
        lIIllllIIIlI[16] = 135 ^ 148;
        lIIllllIIIlI[17] = (-28801) & 31718;
        lIIllllIIIlI[18] = (-4235) & 14015;
        lIIllllIIIlI[19] = (91 ^ 26) ^ (74 ^ 15);
        lIIllllIIIlI[20] = (215 ^ 144) ^ (197 ^ 135);
        lIIllllIIIlI[21] = (-((-2766) & 15103)) & (-16389) & 30655;
        lIIllllIIIlI[22] = (-21681) & 30655;
        lIIllllIIIlI[23] = (-12381) & 14301;
        lIIllllIIIlI[24] = (-16641) & 25597;
        lIIllllIIIlI[25] = 82 ^ 67;
        lIIllllIIIlI[26] = 132 ^ 164;
        lIIllllIIIlI[27] = (-33) & 1958;
        lIIllllIIIlI[28] = (-2209) & 11185;
        lIIllllIIIlI[29] = (((184 + 77) - 135) + 64) ^ (((78 + 183) - 164) + 87);
    }
}
