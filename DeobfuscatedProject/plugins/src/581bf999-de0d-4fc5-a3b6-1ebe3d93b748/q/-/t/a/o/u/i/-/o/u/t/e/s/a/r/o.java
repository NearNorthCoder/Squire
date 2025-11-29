/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;

public final class o
extends Enum<o> {
    private static /* synthetic */ String[] llIIIIIllII;
    public static final /* synthetic */ /* enum */ o DEATH;
    public static final /* synthetic */ /* enum */ o LIGHTNING;
    private static /* synthetic */ int[] llIIIIIlllI;
    public static final /* synthetic */ /* enum */ o FIRE;
    private static final /* synthetic */ o[] $VALUES;
    private final /* synthetic */ Set<Point> attack;
    public static final /* synthetic */ /* enum */ o AIR;
    private final /* synthetic */ List<Point> clockwise;

    private static boolean lIIlllIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    public Set<Point> N() {
        return this.attack;
    }

    private o(List<Point> list, Set<Point> set) {
        this.clockwise = list;
        this.attack = set;
    }

    private static String lIIlllIIllIlII(String llllllllllllllllIlIIIlllIIIIIllI, String llllllllllllllllIlIIIlllIIIIIlIl) {
        llllllllllllllllIlIIIlllIIIIIllI = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlllIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIlllIIIIlIIl = new StringBuilder();
        char[] llllllllllllllllIlIIIlllIIIIlIII = llllllllllllllllIlIIIlllIIIIIlIl.toCharArray();
        int llllllllllllllllIlIIIlllIIIIIlll = llIIIIIlllI[0];
        char[] llllllllllllllllIlIIIlllIIIIIIIl = llllllllllllllllIlIIIlllIIIIIllI.toCharArray();
        int llllllllllllllllIlIIIlllIIIIIIII = llllllllllllllllIlIIIlllIIIIIIIl.length;
        int llllllllllllllllIlIIIllIllllllll = llIIIIIlllI[0];
        while (o.lIIlllIIllllll(llllllllllllllllIlIIIllIllllllll, llllllllllllllllIlIIIlllIIIIIIII)) {
            char llllllllllllllllIlIIIlllIIIIllII = llllllllllllllllIlIIIlllIIIIIIIl[llllllllllllllllIlIIIllIllllllll];
            llllllllllllllllIlIIIlllIIIIlIIl.append((char)(llllllllllllllllIlIIIlllIIIIllII ^ llllllllllllllllIlIIIlllIIIIlIII[llllllllllllllllIlIIIlllIIIIIlll % llllllllllllllllIlIIIlllIIIIlIII.length]));
            "".length();
            ++llllllllllllllllIlIIIlllIIIIIlll;
            ++llllllllllllllllIlIIIllIllllllll;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIlllIIIIlIIl);
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    static {
        o.lIIlllIIlllllI();
        o.lIIlllIIllIllI();
        DEATH = new o(List.of(new Point(llIIIIIlllI[1], llIIIIIlllI[2]), new Point(llIIIIIlllI[2], llIIIIIlllI[1]), new Point(llIIIIIlllI[1], llIIIIIlllI[3]), new Point(llIIIIIlllI[4], llIIIIIlllI[5])), Set.of(new Point(llIIIIIlllI[1], llIIIIIlllI[3]), new Point(llIIIIIlllI[1], llIIIIIlllI[2])));
        LIGHTNING = new o(List.of(new Point(llIIIIIlllI[2], llIIIIIlllI[7]), new Point(llIIIIIlllI[1], llIIIIIlllI[8]), new Point(llIIIIIlllI[4], llIIIIIlllI[9]), new Point(llIIIIIlllI[1], llIIIIIlllI[10])), Set.of(new Point(llIIIIIlllI[1], llIIIIIlllI[8]), new Point(llIIIIIlllI[1], llIIIIIlllI[10])));
        FIRE = new o(List.of(new Point(llIIIIIlllI[12], llIIIIIlllI[1]), new Point(llIIIIIlllI[13], llIIIIIlllI[3]), new Point(llIIIIIlllI[3], llIIIIIlllI[5]), new Point(llIIIIIlllI[13], llIIIIIlllI[2])), Set.of(new Point(llIIIIIlllI[13], llIIIIIlllI[3]), new Point(llIIIIIlllI[13], llIIIIIlllI[2])));
        AIR = new o(List.of(new Point(llIIIIIlllI[12], llIIIIIlllI[7]), new Point(llIIIIIlllI[13], llIIIIIlllI[8]), new Point(llIIIIIlllI[3], llIIIIIlllI[9]), new Point(llIIIIIlllI[13], llIIIIIlllI[10])), Set.of(new Point(llIIIIIlllI[13], llIIIIIlllI[8]), new Point(llIIIIIlllI[13], llIIIIIlllI[10])));
        o[] oArray = new o[llIIIIIlllI[15]];
        oArray[o.llIIIIIlllI[0]] = DEATH;
        oArray[o.llIIIIIlllI[6]] = LIGHTNING;
        oArray[o.llIIIIIlllI[11]] = FIRE;
        oArray[o.llIIIIIlllI[14]] = AIR;
        $VALUES = oArray;
    }

    private static String lIIlllIIllIlIl(String llllllllllllllllIlIIIllIllllIlII, String llllllllllllllllIlIIIllIllllIIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIIllIlllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllIllllIIll.getBytes(StandardCharsets.UTF_8)), llIIIIIlllI[16]), "DES");
            Cipher llllllllllllllllIlIIIllIlllllIII = Cipher.getInstance("DES");
            llllllllllllllllIlIIIllIlllllIII.init(llIIIIIlllI[11], llllllllllllllllIlIIIllIlllllIIl);
            return new String(llllllllllllllllIlIIIllIlllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIllIllllIlll) {
            llllllllllllllllIlIIIllIllllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllIIlllllI() {
        llIIIIIlllI = new int[17];
        o.llIIIIIlllI[0] = (0x6E ^ 0x7F ^ (0x5D ^ 0x6A)) & (0x6A ^ 0x4F ^ "   ".length() ^ -" ".length());
        o.llIIIIIlllI[1] = 0x60 ^ 0x6D ^ (0x6F ^ 0x46);
        o.llIIIIIlllI[2] = 0x38 ^ 0x1F;
        o.llIIIIIlllI[3] = 0xE6 ^ 0xA2 ^ (0x45 ^ 0x21);
        o.llIIIIIlllI[4] = 0x2B ^ 0xA;
        o.llIIIIIlllI[5] = 0x61 ^ 0x42;
        o.llIIIIIlllI[6] = " ".length();
        o.llIIIIIlllI[7] = 0x35 ^ 0x2E;
        o.llIIIIIlllI[8] = 0x59 ^ 0x64 ^ (0x7F ^ 0x5D);
        o.llIIIIIlllI[9] = 0xB9 ^ 0xB7 ^ (0x60 ^ 0x72);
        o.llIIIIIlllI[10] = 0xAD ^ 0xB8 ^ (0x81 ^ 0x8C);
        o.llIIIIIlllI[11] = "  ".length();
        o.llIIIIIlllI[12] = 0x63 ^ 0x79;
        o.llIIIIIlllI[13] = 0x89 ^ 0x94;
        o.llIIIIIlllI[14] = "   ".length();
        o.llIIIIIlllI[15] = 18 + 195 - 69 + 52 ^ 18 + 124 - -36 + 14;
        o.llIIIIIlllI[16] = 0xDD ^ 0x87 ^ (0xC0 ^ 0x92);
    }

    private static void lIIlllIIllIllI() {
        llIIIIIllII = new String[llIIIIIlllI[15]];
        o.llIIIIIllII[o.llIIIIIlllI[0]] = o.lIIlllIIllIlII("AikILTg=", "FlIyp");
        o.llIIIIIllII[o.llIIIIIlllI[6]] = o.lIIlllIIllIlII("GS4LHzEbLgIQ", "UgLWe");
        o.llIIIIIllII[o.llIIIIIlllI[11]] = o.lIIlllIIllIlII("DjkCEA==", "HpPUh");
        o.llIIIIIllII[o.llIIIIIlllI[14]] = o.lIIlllIIllIlIl("ZFCVrMeZHtk=", "HnecJ");
    }

    public List<Point> M() {
        return this.clockwise;
    }
}

