package q.s.r.i.e.s.o.u.a.d.n.p000.b;

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
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.b  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/b.class */
public final class b {
    private static /* synthetic */ int[] lllIIIlIIII;
    public static final /* synthetic */ b STEELWILL;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ b STRONGSACK;
    private static /* synthetic */ String[] lllIIIIlIIl;
    private final /* synthetic */ int animation;
    private final /* synthetic */ Prayer protection;
    private final /* synthetic */ int id;
    public static final /* synthetic */ b GRIMSPIKE;
    private final /* synthetic */ int projectile;

    private static boolean lIlIllIllIIIIl(int i, int i2) {
        return i == i2;
    }

    private static void lIlIllIlIIIIII() {
        lllIIIIlIIl = new String[lllIIIlIIII[12]];
        lllIIIIlIIl[lllIIIlIIII[0]] = lIlIllIIllllIl("6gLDZTfJv3hanuQQY5/JZQ==", "Oleaz");
        lllIIIIlIIl[lllIIIlIIII[4]] = lIlIllIIlllllI("HQEBPC8ZHAg1", "NUDyc");
        lllIIIIlIIl[lllIIIlIIII[8]] = lIlIllIIllllll("HeGrY7mKzFOGNlKI5+8IWg==", "Haagz");
    }

    private static String lIlIllIIlllllI(String llllllllllllllllIIlIIllllIlIIllI, String llllllllllllllllIIlIIllllIlIIlIl) {
        String llllllllllllllllIIlIIllllIlIIllI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIIllllIlIIlIl.toCharArray();
        int llllllllllllllllIIlIIllllIlIIIlI = lllIIIlIIII[0];
        char[] charArray2 = llllllllllllllllIIlIIllllIlIIllI2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIlIIII[0];
        while (lIlIllIllIIIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlIIllllIlIIIlI % charArray.length]));
            "".length();
            llllllllllllllllIIlIIllllIlIIIlI++;
            i++;
            "".length();
            if ((-((79 ^ 8) ^ (232 ^ 170))) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    private static boolean lIlIllIllIIIII(int i, int i2) {
        return i < i2;
    }

    public static b a(Projectile projectile) {
        b[] values = values();
        int length = values.length;
        int i = lllIIIlIIII[0];
        while (lIlIllIllIIIII(i, length)) {
            b bVar = values[i];
            if (lIlIllIllIIIIl(bVar.f(), projectile.getId())) {
                return bVar;
            }
            i++;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return null;
            }
        }
        return null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    private static String lIlIllIIllllll(String llllllllllllllllIIlIIllllIIIllll, String llllllllllllllllIIlIIllllIIlIIII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllllIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllllIIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllllIIlIIll.init(lllIIIlIIII[8], llllllllllllllllIIlIIllllIIlIlII);
            return new String(llllllllllllllllIIlIIllllIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllllIIlIIlI) {
            llllllllllllllllIIlIIllllIIlIIlI.printStackTrace();
            return null;
        }
    }

    public int f() {
        return this.projectile;
    }

    private b(String str, int i, int i2, Prayer prayer, int i3, int i4) {
        this.id = i2;
        this.protection = prayer;
        this.projectile = i3;
        this.animation = i4;
    }

    public static b a(NPC npc) {
        b[] values = values();
        int length = values.length;
        int i = lllIIIlIIII[0];
        while (lIlIllIllIIIII(i, length)) {
            b bVar = values[i];
            if (lIlIllIllIIIIl(bVar.d(), npc.getId())) {
                return bVar;
            }
            i++;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return null;
    }

    public int d() {
        return this.id;
    }

    public Prayer e() {
        return this.protection;
    }

    static {
        lIlIllIlIlllll();
        lIlIllIlIIIIII();
        STRONGSACK = new b(lllIIIIlIIl[lllIIIlIIII[0]], lllIIIlIIII[0], lllIIIlIIII[1], Prayer.PROTECT_FROM_MELEE, lllIIIlIIII[2], lllIIIlIIII[3]);
        STEELWILL = new b(lllIIIIlIIl[lllIIIlIIII[4]], lllIIIlIIII[4], lllIIIlIIII[5], Prayer.PROTECT_FROM_MAGIC, lllIIIlIIII[6], lllIIIlIIII[7]);
        GRIMSPIKE = new b(lllIIIIlIIl[lllIIIlIIII[8]], lllIIIlIIII[8], lllIIIlIIII[9], Prayer.PROTECT_FROM_MISSILES, lllIIIlIIII[10], lllIIIlIIII[11]);
        b[] bVarArr = new b[lllIIIlIIII[12]];
        bVarArr[lllIIIlIIII[0]] = STRONGSACK;
        bVarArr[lllIIIlIIII[4]] = STEELWILL;
        bVarArr[lllIIIlIIII[8]] = GRIMSPIKE;
        $VALUES = bVarArr;
    }

    private static void lIlIllIlIlllll() {
        lllIIIlIIII = new int[14];
        lllIIIlIIII[0] = (66 ^ 29) & ((7 ^ 88) ^ (-1));
        lllIIIlIIII[1] = (-1091) & 3306;
        lllIIIlIIII[2] = -" ".length();
        lllIIIlIIII[3] = (-277) & 6430;
        lllIIIlIIII[4] = " ".length();
        lllIIIlIIII[5] = (-20819) & 23035;
        lllIIIlIIII[6] = (-((-16641) & 22811)) & (-545) & 7931;
        lllIIIlIIII[7] = (-17473) & 24543;
        lllIIIlIIII[8] = "  ".length();
        lllIIIlIIII[9] = (-((-2179) & 15831)) & (-16898) & 32767;
        lllIIIlIIII[10] = (-((-5185) & 7289)) & (-29441) & 32764;
        lllIIIlIIII[11] = (-((-16677) & 17791)) & (-8193) & 16379;
        lllIIIlIIII[12] = "   ".length();
        lllIIIlIIII[13] = (20 ^ 39) ^ (1 ^ 58);
    }

    public int g() {
        return this.animation;
    }

    private static String lIlIllIIllllIl(String llllllllllllllllIIlIIllllIIIIlII, String llllllllllllllllIIlIIllllIIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllllIIIIIll.getBytes(StandardCharsets.UTF_8)), lllIIIlIIII[13]), "DES");
            Cipher llllllllllllllllIIlIIllllIIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIllllIIIIllI.init(lllIIIlIIII[8], llllllllllllllllIIlIIllllIIIIlll);
            return new String(llllllllllllllllIIlIIllllIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllllIIIIlIl) {
            llllllllllllllllIIlIIllllIIIIlIl.printStackTrace();
            return null;
        }
    }
}
