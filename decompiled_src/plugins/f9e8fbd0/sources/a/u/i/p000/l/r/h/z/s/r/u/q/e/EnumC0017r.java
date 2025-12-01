package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.r  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/r.class */
public final class EnumC0017r {
    private /* synthetic */ int id;
    public static final /* synthetic */ EnumC0017r MELEE;
    private static /* synthetic */ int[] lIllIllIIlIII;
    private static /* synthetic */ String[] lIllIllIIIlII;
    public static final /* synthetic */ EnumC0017r JAD_RANGE_FIRST;
    private static final /* synthetic */ EnumC0017r[] $VALUES;
    public static final /* synthetic */ EnumC0017r RANGE;
    public static final /* synthetic */ EnumC0017r JAD_MAGIC_FIRST;
    public static final /* synthetic */ EnumC0017r MAGIC;

    private static String llIIlIIIlIlllII(String llllllllllllllIllIIIlIlllIIlllIl, String llllllllllllllIllIIIlIlllIIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIlllIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIlllIIlllll.init(lIllIllIIlIII[4], secretKeySpec);
            return new String(llllllllllllllIllIIIlIlllIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIlllIIllllI) {
            llllllllllllllIllIIIlIlllIIllllI.printStackTrace();
            return null;
        }
    }

    public static EnumC0017r[] values() {
        return (EnumC0017r[]) $VALUES.clone();
    }

    public Prayer M() {
        switch (C0018s.r[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return Prayer.MYSTIC_MIGHT;
            case 5:
                return Prayer.EAGLE_EYE;
            default:
                return Prayer.MYSTIC_MIGHT;
        }
    }

    static {
        llIIlIIIllIIIll();
        llIIlIIIlIlllll();
        RANGE = new EnumC0017r(lIllIllIIIlII[lIllIllIIlIII[0]], lIllIllIIlIII[0], lIllIllIIlIII[1]);
        MELEE = new EnumC0017r(lIllIllIIIlII[lIllIllIIlIII[2]], lIllIllIIlIII[2], lIllIllIIlIII[3]);
        MAGIC = new EnumC0017r(lIllIllIIIlII[lIllIllIIlIII[4]], lIllIllIIlIII[4], lIllIllIIlIII[5]);
        JAD_MAGIC_FIRST = new EnumC0017r(lIllIllIIIlII[lIllIllIIlIII[6]], lIllIllIIlIII[6], lIllIllIIlIII[1]);
        JAD_RANGE_FIRST = new EnumC0017r(lIllIllIIIlII[lIllIllIIlIII[7]], lIllIllIIlIII[7], lIllIllIIlIII[1]);
        EnumC0017r[] enumC0017rArr = new EnumC0017r[lIllIllIIlIII[8]];
        enumC0017rArr[lIllIllIIlIII[0]] = RANGE;
        enumC0017rArr[lIllIllIIlIII[2]] = MELEE;
        enumC0017rArr[lIllIllIIlIII[4]] = MAGIC;
        enumC0017rArr[lIllIllIIlIII[6]] = JAD_MAGIC_FIRST;
        enumC0017rArr[lIllIllIIlIII[7]] = JAD_RANGE_FIRST;
        $VALUES = enumC0017rArr;
    }

    private EnumC0017r(String str, int i, int i2) {
        this.id = i2;
    }

    public static EnumC0017r valueOf(String str) {
        return (EnumC0017r) Enum.valueOf(EnumC0017r.class, str);
    }

    private static void llIIlIIIllIIIll() {
        lIllIllIIlIII = new int[10];
        lIllIllIIlIII[0] = ((((138 + 188) - 305) + 169) ^ (((44 + 58) - 62) + 92)) & (((89 ^ 67) ^ (25 ^ 57)) ^ (-" ".length()));
        lIllIllIIlIII[1] = (-24581) & 26622;
        lIllIllIIlIII[2] = " ".length();
        lIllIllIIlIII[3] = (-((-19691) & 27887)) & (-6145) & 16383;
        lIllIllIIlIII[4] = "  ".length();
        lIllIllIIlIII[5] = (-((-1850) & 16189)) & (-1) & 16383;
        lIllIllIIlIII[6] = "   ".length();
        lIllIllIIlIII[7] = (236 ^ 156) ^ (183 ^ 195);
        lIllIllIIlIII[8] = (179 ^ 156) ^ (63 ^ 21);
        lIllIllIIlIII[9] = (8 ^ 91) ^ (218 ^ 129);
    }

    private static String llIIlIIIlIllIll(String llllllllllllllIllIIIlIlllIllIIlI, String llllllllllllllIllIIIlIlllIllIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIlllIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlIlllIllIIIl.toCharArray();
        int llllllllllllllIllIIIlIlllIlIlllI = lIllIllIIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIllIIlIII[0];
        while (llIIlIIIllIIlII(i, length)) {
            char llllllllllllllIllIIIlIlllIlIIlIl = charArray2[i];
            sb.append((char) (llllllllllllllIllIIIlIlllIlIIlIl ^ charArray[llllllllllllllIllIIIlIlllIlIlllI % charArray.length]));
            "".length();
            llllllllllllllIllIIIlIlllIlIlllI++;
            i++;
            "".length();
            if ((((((122 + 78) - 115) + 82) ^ (((84 + 120) - 168) + 95)) & (((((73 + 92) - 98) + 77) ^ (((176 + 80) - 109) + 33)) ^ (-" ".length()))) != (((251 ^ 180) ^ (147 ^ 132)) & (((29 ^ 24) ^ (112 ^ 45)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIIlIIIlIlllll() {
        lIllIllIIIlII = new String[lIllIllIIlIII[8]];
        lIllIllIIIlII[lIllIllIIlIII[0]] = llIIlIIIlIllIlI("lzXWa1BXSyw=", "sbyPj");
        lIllIllIIIlII[lIllIllIIlIII[2]] = llIIlIIIlIllIll("KwMIJj0=", "fFDcx");
        lIllIllIIIlII[lIllIllIIlIII[4]] = llIIlIIIlIlllII("LhK3eE6uKgo=", "vGpFw");
        lIllIllIIIlII[lIllIllIIlIII[6]] = llIIlIIIlIllIll("GwYAGioQAA0GOBcOFhYz", "QGDEg");
        lIllIllIIIlII[lIllIllIIlIII[7]] = llIIlIIIlIllIll("OSAuGxYyLy0BGzUoOBcQ", "sajDD");
    }

    public int L() {
        return this.id;
    }

    private static String llIIlIIIlIllIlI(String llllllllllllllIllIIIlIllllIIIIlI, String llllllllllllllIllIIIlIllllIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIllllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIllllIIIIIl.getBytes(StandardCharsets.UTF_8)), lIllIllIIlIII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIllIIlIII[4], llllllllllllllIllIIIlIllllIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIllllIIIIll) {
            llllllllllllllIllIIIlIllllIIIIll.printStackTrace();
            return null;
        }
    }

    public Prayer N() {
        switch (C0018s.r[ordinal()]) {
            case 2:
            case 5:
                return Prayer.PROTECT_FROM_MAGIC;
            default:
                return Prayer.PROTECT_FROM_MISSILES;
        }
    }

    private static boolean llIIlIIIllIIlII(int i, int i2) {
        return i < i2;
    }
}
