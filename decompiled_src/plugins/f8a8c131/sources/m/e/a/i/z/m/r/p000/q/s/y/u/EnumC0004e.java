package m.e.a.i.z.m.r.p000.q.s.y.u;

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
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.e  reason: invalid package and case insensitive filesystem */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/e.class */
public final class EnumC0004e {
    public static final /* synthetic */ EnumC0004e TSTANON_KARLAK;
    private final /* synthetic */ int id;
    public static final /* synthetic */ EnumC0004e BALFRUG_KREEYATH;
    private static /* synthetic */ int[] lIllIIIllIllI;
    private final /* synthetic */ int projectile;
    private static final /* synthetic */ EnumC0004e[] $VALUES;
    private static /* synthetic */ String[] lIllIIIllIlIl;
    private final /* synthetic */ int animation;
    public static final /* synthetic */ EnumC0004e ZAKLN_GRITCH;
    private final /* synthetic */ Prayer protection;

    private EnumC0004e(String str, int i, int i2, Prayer prayer, int i3, int i4) {
        this.id = i2;
        this.protection = prayer;
        this.projectile = i3;
        this.animation = i4;
    }

    private static String llIIIlIlIIllIII(String llllllllllllllIllIIlIllIlIlIIllI, String llllllllllllllIllIIlIllIlIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIllIIIllIllI[13]), "DES");
            Cipher llllllllllllllIllIIlIllIlIlIlIII = Cipher.getInstance("DES");
            llllllllllllllIllIIlIllIlIlIlIII.init(lIllIIIllIllI[8], secretKeySpec);
            return new String(llllllllllllllIllIIlIllIlIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIllIlIlIIlll) {
            llllllllllllllIllIIlIllIlIlIIlll.printStackTrace();
            return null;
        }
    }

    public static EnumC0004e[] values() {
        return (EnumC0004e[]) $VALUES.clone();
    }

    public int p() {
        return this.projectile;
    }

    private static boolean llIIIlIlIIlllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIlIlIIllllI(int i, int i2) {
        return i == i2;
    }

    static {
        llIIIlIlIIlllII();
        llIIIlIlIIllIlI();
        TSTANON_KARLAK = new EnumC0004e(lIllIIIllIlIl[lIllIIIllIllI[0]], lIllIIIllIllI[0], lIllIIIllIllI[1], Prayer.PROTECT_FROM_MELEE, lIllIIIllIllI[2], lIllIIIllIllI[3]);
        BALFRUG_KREEYATH = new EnumC0004e(lIllIIIllIlIl[lIllIIIllIllI[4]], lIllIIIllIllI[4], lIllIIIllIllI[5], Prayer.PROTECT_FROM_MAGIC, lIllIIIllIllI[6], lIllIIIllIllI[7]);
        ZAKLN_GRITCH = new EnumC0004e(lIllIIIllIlIl[lIllIIIllIllI[8]], lIllIIIllIllI[8], lIllIIIllIllI[9], Prayer.PROTECT_FROM_MISSILES, lIllIIIllIllI[10], lIllIIIllIllI[11]);
        EnumC0004e[] enumC0004eArr = new EnumC0004e[lIllIIIllIllI[12]];
        enumC0004eArr[lIllIIIllIllI[0]] = TSTANON_KARLAK;
        enumC0004eArr[lIllIIIllIllI[4]] = BALFRUG_KREEYATH;
        enumC0004eArr[lIllIIIllIllI[8]] = ZAKLN_GRITCH;
        $VALUES = enumC0004eArr;
    }

    private static void llIIIlIlIIllIlI() {
        lIllIIIllIlIl = new String[lIllIIIllIllI[12]];
        lIllIIIllIlIl[lIllIIIllIllI[0]] = llIIIlIlIIllIII("0bxI+0mqecOk/LAysy9vig==", "ozPJY");
        lIllIIIllIlIl[lIllIIIllIllI[4]] = llIIIlIlIIllIII("lcVdtniXVwvpIRSRATYB+gk0dXMvJ550", "jOtsg");
        lIllIIIllIlIl[lIllIIIllIllI[8]] = llIIIlIlIIllIII("+KtzNy1qti0rZVFSwHEhZA==", "sPZdh");
    }

    public static EnumC0004e a(Projectile projectile) {
        EnumC0004e[] values = values();
        int length = values.length;
        int i = lIllIIIllIllI[0];
        while (llIIIlIlIIlllIl(i, length)) {
            EnumC0004e enumC0004e = values[i];
            if (llIIIlIlIIllllI(enumC0004e.p(), projectile.getId())) {
                return enumC0004e;
            }
            i++;
            "".length();
            if ((78 ^ 74) < (-" ".length())) {
                return null;
            }
        }
        return null;
    }

    public static EnumC0004e a(NPC npc) {
        EnumC0004e[] values = values();
        int length = values.length;
        int llllllllllllllIllIIlIllIlIlllIIl = lIllIIIllIllI[0];
        while (llIIIlIlIIlllIl(llllllllllllllIllIIlIllIlIlllIIl, length)) {
            EnumC0004e enumC0004e = values[llllllllllllllIllIIlIllIlIlllIIl];
            if (llIIIlIlIIllllI(enumC0004e.n(), npc.getId())) {
                return enumC0004e;
            }
            llllllllllllllIllIIlIllIlIlllIIl++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return null;
    }

    public int q() {
        return this.animation;
    }

    private static void llIIIlIlIIlllII() {
        lIllIIIllIllI = new int[14];
        lIllIIIllIllI[0] = (34 ^ 127) & ((76 ^ 17) ^ (-1));
        lIllIIIllIllI[1] = (-((-16017) & 32469)) & (-8449) & 28030;
        lIllIIIllIllI[2] = -" ".length();
        lIllIIIllIllI[3] = (158 ^ 193) ^ (40 ^ 55);
        lIllIIIllIllI[4] = " ".length();
        lIllIIIllIllI[5] = (-((-2085) & 14439)) & (-130) & 15615;
        lIllIIIllIllI[6] = (-769) & 1995;
        lIllIIIllIllI[7] = (-10658) & 15287;
        lIllIIIllIllI[8] = "  ".length();
        lIllIIIllIllI[9] = (-((-19457) & 32257)) & (-16645) & 32575;
        lIllIIIllIllI[10] = (-6433) & 7655;
        lIllIIIllIllI[11] = (-9225) & 16301;
        lIllIIIllIllI[12] = "   ".length();
        lIllIIIllIllI[13] = (170 ^ 197) ^ (43 ^ 76);
    }

    public Prayer o() {
        return this.protection;
    }

    public int n() {
        return this.id;
    }

    public static EnumC0004e valueOf(String str) {
        return (EnumC0004e) Enum.valueOf(EnumC0004e.class, str);
    }
}
