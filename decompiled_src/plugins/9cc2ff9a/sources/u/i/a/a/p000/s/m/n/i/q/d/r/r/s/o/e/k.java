package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.k  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/k.class */
public final class k {
    private final /* synthetic */ int animation;
    private static final /* synthetic */ k[] $VALUES;
    private final /* synthetic */ Prayer protection;
    public static final /* synthetic */ k BREE;
    private final /* synthetic */ int projectile;
    public static final /* synthetic */ k STARLIGHT;
    private final /* synthetic */ int id;
    public static final /* synthetic */ k GROWLER;
    private static /* synthetic */ int[] lIIlIIlllIlIl;
    private static /* synthetic */ String[] lIIlIIlllIIll;

    static {
        lIlIlIlIlIIllll();
        lIlIlIlIlIIlIIl();
        BREE = new k(lIIlIIlllIIll[lIIlIIlllIlIl[0]], lIIlIIlllIlIl[0], lIIlIIlllIlIl[1], Prayer.PROTECT_FROM_MISSILES, lIIlIIlllIlIl[2], lIIlIIlllIlIl[3]);
        GROWLER = new k(lIIlIIlllIIll[lIIlIIlllIlIl[4]], lIIlIIlllIlIl[4], lIIlIIlllIlIl[5], Prayer.PROTECT_FROM_MAGIC, lIIlIIlllIlIl[6], lIIlIIlllIlIl[7]);
        STARLIGHT = new k(lIIlIIlllIIll[lIIlIIlllIlIl[8]], lIIlIIlllIlIl[8], lIIlIIlllIlIl[9], Prayer.PROTECT_FROM_MELEE, lIIlIIlllIlIl[10], lIIlIIlllIlIl[11]);
        k[] kVarArr = new k[lIIlIIlllIlIl[12]];
        kVarArr[lIIlIIlllIlIl[0]] = BREE;
        kVarArr[lIIlIIlllIlIl[4]] = GROWLER;
        kVarArr[lIIlIIlllIlIl[8]] = STARLIGHT;
        $VALUES = kVarArr;
    }

    public int D() {
        return this.id;
    }

    public static k c(NPC npc) {
        k[] values = values();
        int llllllllllllllIlllllIIlIllIllIIl = values.length;
        int llllllllllllllIlllllIIlIllIllIII = lIIlIIlllIlIl[0];
        while (lIlIlIlIlIlIIII(llllllllllllllIlllllIIlIllIllIII, llllllllllllllIlllllIIlIllIllIIl)) {
            k kVar = values[llllllllllllllIlllllIIlIllIllIII];
            if (lIlIlIlIlIlIIIl(kVar.D(), npc.getId())) {
                return kVar;
            }
            llllllllllllllIlllllIIlIllIllIII++;
            "".length();
            if (((63 ^ 105) & ((242 ^ 164) ^ (-1))) >= " ".length()) {
                return null;
            }
        }
        return null;
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public Prayer E() {
        return this.protection;
    }

    public int G() {
        return this.animation;
    }

    private k(String str, int i, int i2, Prayer prayer, int i3, int i4) {
        this.id = i2;
        this.protection = prayer;
        this.projectile = i3;
        this.animation = i4;
    }

    private static boolean lIlIlIlIlIlIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlIlIlIlIIII(int i, int i2) {
        return i < i2;
    }

    public int F() {
        return this.projectile;
    }

    private static void lIlIlIlIlIIlIIl() {
        lIIlIIlllIIll = new String[lIIlIIlllIlIl[12]];
        lIIlIIlllIIll[lIIlIIlllIlIl[0]] = lIlIlIlIlIIIlll("JQExKg==", "gSton");
        lIIlIIlllIIll[lIIlIIlllIlIl[4]] = lIlIlIlIlIIlIII("bHpYm3abW5w=", "KTRCm");
        lIIlIIlllIIll[lIIlIIlllIlIl[8]] = lIlIlIlIlIIlIII("DymFAswuj8jLLuUxLAMhvA==", "vuFmG");
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    private static String lIlIlIlIlIIlIII(String llllllllllllllIlllllIIlIllIIIlIl, String llllllllllllllIlllllIIlIllIIIlII) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIllIIIlII.getBytes(StandardCharsets.UTF_8)), lIIlIIlllIlIl[13]), "DES");
            Cipher llllllllllllllIlllllIIlIllIIIlll = Cipher.getInstance("DES");
            llllllllllllllIlllllIIlIllIIIlll.init(lIIlIIlllIlIl[8], llllllllllllllIlllllIIlIllIIlIII);
            return new String(llllllllllllllIlllllIIlIllIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIIlIllIIIllI) {
            llllllllllllllIlllllIIlIllIIIllI.printStackTrace();
            return null;
        }
    }

    public static k a(Projectile projectile) {
        k[] values = values();
        int length = values.length;
        int llllllllllllllIlllllIIlIllIIlllI = lIIlIIlllIlIl[0];
        while (lIlIlIlIlIlIIII(llllllllllllllIlllllIIlIllIIlllI, length)) {
            k kVar = values[llllllllllllllIlllllIIlIllIIlllI];
            if (lIlIlIlIlIlIIIl(kVar.F(), projectile.getId())) {
                return kVar;
            }
            llllllllllllllIlllllIIlIllIIlllI++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return null;
    }

    private static void lIlIlIlIlIIllll() {
        lIIlIIlllIlIl = new int[14];
        lIIlIIlllIlIl[0] = (120 ^ 85) & ((180 ^ 153) ^ (-1));
        lIIlIIlllIlIl[1] = (-4369) & 6576;
        lIIlIIlllIlIl[2] = (-((-385) & 2953)) & (-28929) & 32686;
        lIIlIIlllIlIl[3] = (-((-24593) & 25754)) & (-5) & 8191;
        lIIlIIlllIlIl[4] = " ".length();
        lIIlIIlllIlIl[5] = (-25345) & 27551;
        lIIlIIlllIlIl[6] = (-23393) & 24575;
        lIIlIIlllIlIl[7] = (-24707) & 31743;
        lIIlIIlllIlIl[8] = "  ".length();
        lIIlIIlllIlIl[9] = (-26113) & 28318;
        lIIlIIlllIlIl[10] = -" ".length();
        lIIlIIlllIlIl[11] = (-25089) & 31464;
        lIIlIIlllIlIl[12] = "   ".length();
        lIIlIIlllIlIl[13] = 95 ^ 87;
    }

    private static String lIlIlIlIlIIIlll(String llllllllllllllIlllllIIlIlIllIlIl, String llllllllllllllIlllllIIlIlIllIlII) {
        String llllllllllllllIlllllIIlIlIllIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIlIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllllIIlIlIllIIlI = llllllllllllllIlllllIIlIlIllIlII.toCharArray();
        int llllllllllllllIlllllIIlIlIllIIIl = lIIlIIlllIlIl[0];
        char[] charArray = llllllllllllllIlllllIIlIlIllIlIl2.toCharArray();
        int llllllllllllllIlllllIIlIlIlIlIlI = charArray.length;
        int i = lIIlIIlllIlIl[0];
        while (lIlIlIlIlIlIIII(i, llllllllllllllIlllllIIlIlIlIlIlI)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllllIIlIlIllIIlI[llllllllllllllIlllllIIlIlIllIIIl % llllllllllllllIlllllIIlIlIllIIlI.length]));
            "".length();
            llllllllllllllIlllllIIlIlIllIIIl++;
            i++;
            "".length();
            if ((((71 ^ 33) ^ (18 ^ 50)) & (((50 ^ 40) ^ (233 ^ 181)) ^ (-" ".length()))) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
