/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;

public final class b
extends Enum<b> {
    private static /* synthetic */ int[] lllIIIlIIII;
    public static final /* synthetic */ /* enum */ b STEELWILL;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b STRONGSACK;
    private static /* synthetic */ String[] lllIIIIlIIl;
    private final /* synthetic */ int animation;
    private final /* synthetic */ Prayer protection;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ b GRIMSPIKE;
    private final /* synthetic */ int projectile;

    private static boolean lIlIllIllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIllIlIIIIII() {
        lllIIIIlIIl = new String[lllIIIlIIII[12]];
        b.lllIIIIlIIl[b.lllIIIlIIII[0]] = b.lIlIllIIllllIl("6gLDZTfJv3hanuQQY5/JZQ==", "Oleaz");
        b.lllIIIIlIIl[b.lllIIIlIIII[4]] = b.lIlIllIIlllllI("HQEBPC8ZHAg1", "NUDyc");
        b.lllIIIIlIIl[b.lllIIIlIIII[8]] = b.lIlIllIIllllll("HeGrY7mKzFOGNlKI5+8IWg==", "Haagz");
    }

    private static String lIlIllIIlllllI(String llllllllllllllllIIlIIllllIlIIIIl, String llllllllllllllllIIlIIllllIlIIlIl) {
        llllllllllllllllIIlIIllllIlIIIIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIllllIlIIlII = new StringBuilder();
        char[] llllllllllllllllIIlIIllllIlIIIll = llllllllllllllllIIlIIllllIlIIlIl.toCharArray();
        int llllllllllllllllIIlIIllllIlIIIlI = lllIIIlIIII[0];
        char[] llllllllllllllllIIlIIllllIIlllII = llllllllllllllllIIlIIllllIlIIIIl.toCharArray();
        int llllllllllllllllIIlIIllllIIllIll = llllllllllllllllIIlIIllllIIlllII.length;
        int llllllllllllllllIIlIIllllIIllIlI = lllIIIlIIII[0];
        while (b.lIlIllIllIIIII(llllllllllllllllIIlIIllllIIllIlI, llllllllllllllllIIlIIllllIIllIll)) {
            char llllllllllllllllIIlIIllllIlIIlll = llllllllllllllllIIlIIllllIIlllII[llllllllllllllllIIlIIllllIIllIlI];
            llllllllllllllllIIlIIllllIlIIlII.append((char)(llllllllllllllllIIlIIllllIlIIlll ^ llllllllllllllllIIlIIllllIlIIIll[llllllllllllllllIIlIIllllIlIIIlI % llllllllllllllllIIlIIllllIlIIIll.length]));
            "".length();
            ++llllllllllllllllIIlIIllllIlIIIlI;
            ++llllllllllllllllIIlIIllllIIllIlI;
            "".length();
            if (-(0x4F ^ 8 ^ (0xE8 ^ 0xAA)) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIllllIlIIlII);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean lIlIllIllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(Projectile projectile) {
        void llllllllllllllllIIlIIllllIllIIll;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int llllllllllllllllIIlIIllllIllIIlI = lllIIIlIIII[0];
        while (b.lIlIllIllIIIII(llllllllllllllllIIlIIllllIllIIlI, (int)llllllllllllllllIIlIIllllIllIIll)) {
            Projectile llllllllllllllllIIlIIllllIllIlIl;
            void llllllllllllllllIIlIIllllIllIlII;
            void llllllllllllllllIIlIIllllIllIIIl = llllllllllllllllIIlIIllllIllIlII[llllllllllllllllIIlIIllllIllIIlI];
            if (b.lIlIllIllIIIIl(llllllllllllllllIIlIIllllIllIIIl.f(), llllllllllllllllIIlIIllllIllIlIl.getId())) {
                return llllllllllllllllIIlIIllllIllIIIl;
            }
            ++llllllllllllllllIIlIIllllIllIIlI;
            "".length();
            if ((0x2B ^ 0x2F) == (0x1E ^ 0x1A)) continue;
            return null;
        }
        return null;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static String lIlIllIIllllll(String llllllllllllllllIIlIIllllIIlIIIl, String llllllllllllllllIIlIIllllIIIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllllIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllllIIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllllIIlIIll.init(lllIIIlIIII[8], llllllllllllllllIIlIIllllIIlIlII);
            return new String(llllllllllllllllIIlIIllllIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllllIIlIIlI) {
            llllllllllllllllIIlIIllllIIlIIlI.printStackTrace();
            return null;
        }
    }

    public int f() {
        return this.projectile;
    }

    private b(int n3, Prayer prayer, int n4, int n5) {
        this.id = n3;
        this.protection = prayer;
        this.projectile = n4;
        this.animation = n5;
    }

    /*
     * WARNING - void declaration
     */
    public static b a(NPC nPC) {
        void llllllllllllllllIIlIIllllIllllIl;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int llllllllllllllllIIlIIllllIllllII = lllIIIlIIII[0];
        while (b.lIlIllIllIIIII(llllllllllllllllIIlIIllllIllllII, (int)llllllllllllllllIIlIIllllIllllIl)) {
            NPC llllllllllllllllIIlIIllllIllllll;
            void llllllllllllllllIIlIIllllIlllllI;
            void llllllllllllllllIIlIIllllIlllIll = llllllllllllllllIIlIIllllIlllllI[llllllllllllllllIIlIIllllIllllII];
            if (b.lIlIllIllIIIIl(llllllllllllllllIIlIIllllIlllIll.d(), llllllllllllllllIIlIIllllIllllll.getId())) {
                return llllllllllllllllIIlIIllllIlllIll;
            }
            ++llllllllllllllllIIlIIllllIllllII;
            "".length();
            if (" ".length() < "  ".length()) continue;
            return null;
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
        b.lIlIllIlIlllll();
        b.lIlIllIlIIIIII();
        STRONGSACK = new b(lllIIIlIIII[1], Prayer.PROTECT_FROM_MELEE, lllIIIlIIII[2], lllIIIlIIII[3]);
        STEELWILL = new b(lllIIIlIIII[5], Prayer.PROTECT_FROM_MAGIC, lllIIIlIIII[6], lllIIIlIIII[7]);
        GRIMSPIKE = new b(lllIIIlIIII[9], Prayer.PROTECT_FROM_MISSILES, lllIIIlIIII[10], lllIIIlIIII[11]);
        b[] bArray = new b[lllIIIlIIII[12]];
        bArray[b.lllIIIlIIII[0]] = STRONGSACK;
        bArray[b.lllIIIlIIII[4]] = STEELWILL;
        bArray[b.lllIIIlIIII[8]] = GRIMSPIKE;
        $VALUES = bArray;
    }

    private static void lIlIllIlIlllll() {
        lllIIIlIIII = new int[14];
        b.lllIIIlIIII[0] = (0x42 ^ 0x1D) & ~(7 ^ 0x58);
        b.lllIIIlIIII[1] = 0xFFFFFBBD & 0xCEA;
        b.lllIIIlIIII[2] = -" ".length();
        b.lllIIIlIIII[3] = 0xFFFFFEEB & 0x191E;
        b.lllIIIlIIII[4] = " ".length();
        b.lllIIIlIIII[5] = 0xFFFFAEAD & 0x59FB;
        b.lllIIIlIIII[6] = -(0xFFFFBEFF & 0x591B) & (0xFFFFFDDF & 0x1EFB);
        b.lllIIIlIIII[7] = 0xFFFFBBBF & 0x5FDF;
        b.lllIIIlIIII[8] = "  ".length();
        b.lllIIIlIIII[9] = -(0xFFFFF77D & 0x3DD7) & (0xFFFFBDFE & Short.MAX_VALUE);
        b.lllIIIlIIII[10] = -(0xFFFFEBBF & 0x1C79) & (0xFFFF8CFF & 0x7FFC);
        b.lllIIIlIIII[11] = -(0xFFFFBEDB & 0x457F) & (0xFFFFDFFF & 0x3FFB);
        b.lllIIIlIIII[12] = "   ".length();
        b.lllIIIlIIII[13] = 0x14 ^ 0x27 ^ (1 ^ 0x3A);
    }

    public int g() {
        return this.animation;
    }

    private static String lIlIllIIllllIl(String llllllllllllllllIIlIIllllIIIIlII, String llllllllllllllllIIlIIllllIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllllIIIIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIlIIII[13]), "DES");
            Cipher llllllllllllllllIIlIIllllIIIIllI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIllllIIIIllI.init(lllIIIlIIII[8], llllllllllllllllIIlIIllllIIIIlll);
            return new String(llllllllllllllllIIlIIllllIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllllIIIIlIl) {
            llllllllllllllllIIlIIllllIIIIlIl.printStackTrace();
            return null;
        }
    }
}

