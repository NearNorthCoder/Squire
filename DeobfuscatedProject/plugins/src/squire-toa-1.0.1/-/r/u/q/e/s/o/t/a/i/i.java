/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 */
package -.r.u.q.e.s.o.t.a.i;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;

public final class i
extends Enum<i> {
    private final /* synthetic */ int regionY;
    public static final /* synthetic */ /* enum */ i DEATH;
    private final /* synthetic */ int objectId;
    public static final /* synthetic */ /* enum */ i AIR;
    private final /* synthetic */ int regionX;
    public static final /* synthetic */ /* enum */ i LIGHTNING;
    private static /* synthetic */ String[] lIIllllllIIll;
    public static final /* synthetic */ /* enum */ i FIRE;
    private static /* synthetic */ int[] lIIllllllIlII;
    private static final /* synthetic */ i[] $VALUES;

    private static boolean lIllIlIlIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIlIlIlIlIll(String llllllllllllllIlllIIllllIlIlllll, String llllllllllllllIlllIIllllIllIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIllllIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllllIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIllllIllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIllllIllIIIll.init(lIIllllllIlII[8], llllllllllllllIlllIIllllIllIIlII);
            return new String(llllllllllllllIlllIIllllIllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllllIllIIIlI) {
            llllllllllllllIlllIIllllIllIIIlI.printStackTrace();
            return null;
        }
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static void lIllIlIlIlIlllI() {
        lIIllllllIIll = new String[lIIllllllIlII[13]];
        i.lIIllllllIIll[i.lIIllllllIlII[0]] = i.lIllIlIlIlIlIll("XkPDs23kqmo=", "PbOnC");
        i.lIIllllllIIll[i.lIIllllllIlII[1]] = i.lIllIlIlIlIllII("IwodCA==", "eCOMs");
        i.lIIllllllIIll[i.lIIllllllIlII[8]] = i.lIllIlIlIlIlIll("YHEthyYjS4Uc/WIANSzwNA==", "oXjmq");
        i.lIIllllllIIll[i.lIIllllllIlII[11]] = i.lIllIlIlIlIllIl("nn+HCOylQmY=", "eKPFR");
    }

    public int m() {
        return this.objectId;
    }

    /*
     * WARNING - void declaration
     */
    public static i a(int n2) {
        void llllllllllllllIlllIIlllllIIlIIII;
        i[] iArray = i.values();
        int n3 = iArray.length;
        int llllllllllllllIlllIIlllllIIIllll = lIIllllllIlII[0];
        while (i.lIllIlIlIllIIII(llllllllllllllIlllIIlllllIIIllll, (int)llllllllllllllIlllIIlllllIIlIIII)) {
            int llllllllllllllIlllIIlllllIIlIIlI;
            void llllllllllllllIlllIIlllllIIlIIIl;
            void llllllllllllllIlllIIlllllIIIlllI = llllllllllllllIlllIIlllllIIlIIIl[llllllllllllllIlllIIlllllIIIllll];
            if (i.lIllIlIlIllIIIl(llllllllllllllIlllIIlllllIIIlllI.m(), llllllllllllllIlllIIlllllIIlIIlI)) {
                return llllllllllllllIlllIIlllllIIIlllI;
            }
            ++llllllllllllllIlllIIlllllIIIllll;
            "".length();
            if (((0 ^ 0x51) & ~(0x56 ^ 7)) == 0) continue;
            return null;
        }
        return null;
    }

    private i(int n3, int n4, int n5) {
        this.objectId = n3;
        this.regionX = n4;
        this.regionY = n5;
    }

    private static String lIllIlIlIlIllIl(String llllllllllllllIlllIIllllIllIllII, String llllllllllllllIlllIIllllIllIlIll) {
        try {
            SecretKeySpec llllllllllllllIlllIIllllIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllllIllIlIll.getBytes(StandardCharsets.UTF_8)), lIIllllllIlII[14]), "DES");
            Cipher llllllllllllllIlllIIllllIlllIIII = Cipher.getInstance("DES");
            llllllllllllllIlllIIllllIlllIIII.init(lIIllllllIlII[8], llllllllllllllIlllIIllllIlllIIIl);
            return new String(llllllllllllllIlllIIllllIlllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllllIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIllllIllIllll) {
            llllllllllllllIlllIIllllIllIllll.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlIlIllll() {
        lIIllllllIlII = new int[15];
        i.lIIllllllIlII[0] = (87 + 126 - 139 + 57 ^ 39 + 75 - -23 + 13) & (0xB7 ^ 0x8F ^ (0x42 ^ 0x6F) ^ -" ".length());
        i.lIIllllllIlII[1] = " ".length();
        i.lIIllllllIlII[2] = 0xFFFFBB7F & 0x7DD4;
        i.lIIllllllIlII[3] = 0xFFFFFBAF & 0xB77F;
        i.lIIllllllIlII[4] = 0xB0 ^ 0x81 ^ (0x22 ^ 0x31);
        i.lIIllllllIlII[5] = 0x64 ^ 0x7B ^ (0x6C ^ 0x52);
        i.lIIllllllIlII[6] = 0xFFFFB33F & 0xFFEC;
        i.lIIllllllIlII[7] = 0x66 ^ 0x79;
        i.lIIllllllIlII[8] = "  ".length();
        i.lIIllllllIlII[9] = 0xFFFFF37F & 0xBFAD;
        i.lIIllllllIlII[10] = 197 + 88 - 198 + 130 ^ 29 + 117 - 138 + 191;
        i.lIIllllllIlII[11] = "   ".length();
        i.lIIllllllIlII[12] = 0xFFFFBFFE & 0xF32F;
        i.lIIllllllIlII[13] = 0x44 ^ 0x7F ^ (0x2D ^ 0x12);
        i.lIIllllllIlII[14] = 120 + 53 - 19 + 27 ^ 20 + 23 - -136 + 10;
    }

    private static boolean lIllIlIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    static {
        i.lIllIlIlIlIllll();
        i.lIllIlIlIlIlllI();
        DEATH = new i(lIIllllllIlII[3], lIIllllllIlII[4], lIIllllllIlII[5]);
        FIRE = new i(lIIllllllIlII[6], lIIllllllIlII[7], lIIllllllIlII[5]);
        LIGHTNING = new i(lIIllllllIlII[9], lIIllllllIlII[4], lIIllllllIlII[10]);
        AIR = new i(lIIllllllIlII[12], lIIllllllIlII[7], lIIllllllIlII[10]);
        i[] iArray = new i[lIIllllllIlII[13]];
        iArray[i.lIIllllllIlII[0]] = DEATH;
        iArray[i.lIIllllllIlII[1]] = FIRE;
        iArray[i.lIIllllllIlII[8]] = LIGHTNING;
        iArray[i.lIIllllllIlII[11]] = AIR;
        $VALUES = iArray;
    }

    public WorldPoint a(Client client) {
        RegionPoint regionPoint = new RegionPoint(this.regionX, this.regionY, lIIllllllIlII[1], lIIllllllIlII[2]);
        Collection collection = WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld());
        return collection.stream().findFirst().orElse(null);
    }

    private static String lIllIlIlIlIllII(String llllllllllllllIlllIIllllIllllllI, String llllllllllllllIlllIIlllllIIIIIlI) {
        llllllllllllllIlllIIllllIllllllI = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllllIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlllllIIIIIIl = new StringBuilder();
        char[] llllllllllllllIlllIIlllllIIIIIII = llllllllllllllIlllIIlllllIIIIIlI.toCharArray();
        int llllllllllllllIlllIIllllIlllllll = lIIllllllIlII[0];
        char[] llllllllllllllIlllIIllllIllllIIl = llllllllllllllIlllIIllllIllllllI.toCharArray();
        int llllllllllllllIlllIIllllIllllIII = llllllllllllllIlllIIllllIllllIIl.length;
        int llllllllllllllIlllIIllllIlllIlll = lIIllllllIlII[0];
        while (i.lIllIlIlIllIIII(llllllllllllllIlllIIllllIlllIlll, llllllllllllllIlllIIllllIllllIII)) {
            char llllllllllllllIlllIIlllllIIIIlII = llllllllllllllIlllIIllllIllllIIl[llllllllllllllIlllIIllllIlllIlll];
            llllllllllllllIlllIIlllllIIIIIIl.append((char)(llllllllllllllIlllIIlllllIIIIlII ^ llllllllllllllIlllIIlllllIIIIIII[llllllllllllllIlllIIllllIlllllll % llllllllllllllIlllIIlllllIIIIIII.length]));
            "".length();
            ++llllllllllllllIlllIIllllIlllllll;
            ++llllllllllllllIlllIIllllIlllIlll;
            "".length();
            if (" ".length() >= ((0x20 ^ 0x39 ^ (0xD2 ^ 0x8B)) & (0x1A ^ 0x75 ^ (0x43 ^ 0x6C) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlllllIIIIIIl);
    }
}

