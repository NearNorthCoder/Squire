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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Point;

public final class q
extends Enum<q> {
    private static /* synthetic */ int[] lIlllIIIIII;
    private static /* synthetic */ String[] lIllIllllll;
    private final /* synthetic */ List<Point> boulders;
    private final /* synthetic */ Point stand;
    private static final /* synthetic */ q[] $VALUES;
    public static final /* synthetic */ /* enum */ q FIRST;
    public static final /* synthetic */ /* enum */ q THIRD;
    public static final /* synthetic */ /* enum */ q FOURTH;
    private final /* synthetic */ Point jug;
    public static final /* synthetic */ /* enum */ q SECOND;
    public static final /* synthetic */ /* enum */ q FIFTH;

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    private static String lIIllIIIIIllll(String llllllllllllllllIlIIlllIllllIlll, String llllllllllllllllIlIIlllIllllIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIllllIllI.getBytes(StandardCharsets.UTF_8)), lIlllIIIIII[17]), "DES");
            Cipher llllllllllllllllIlIIlllIlllllIll = Cipher.getInstance("DES");
            llllllllllllllllIlIIlllIlllllIll.init(lIlllIIIIII[8], llllllllllllllllIlIIlllIllllllII);
            return new String(llllllllllllllllIlIIlllIlllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlllIlllllIlI) {
            llllllllllllllllIlIIlllIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIllIIIIlllII() {
        lIlllIIIIII = new int[18];
        q.lIlllIIIIII[0] = (0xED ^ 0x8B ^ (0x5B ^ 0x25)) & (0x78 ^ 0x55 ^ (0x6E ^ 0x5B) ^ -" ".length());
        q.lIlllIIIIII[1] = 93 + 93 - 184 + 161 ^ 178 + 20 - 55 + 43;
        q.lIlllIIIIII[2] = 88 + 79 - 59 + 34 ^ 137 + 48 - 91 + 50;
        q.lIlllIIIIII[3] = 0xAF ^ 0xA9 ^ (0xD9 ^ 0xC0);
        q.lIlllIIIIII[4] = 30 + 46 - -67 + 37 ^ 13 + 47 - -64 + 48;
        q.lIlllIIIIII[5] = 0xB7 ^ 0x97;
        q.lIlllIIIIII[6] = " ".length();
        q.lIlllIIIIII[7] = 0xDF ^ 0xBC ^ (0x1C ^ 0x5E);
        q.lIlllIIIIII[8] = "  ".length();
        q.lIlllIIIIII[9] = 0x62 ^ 0x59 ^ (0x39 ^ 0x15);
        q.lIlllIIIIII[10] = 0x31 ^ 0x2A;
        q.lIlllIIIIII[11] = 0xEA ^ 0x86 ^ (0xF0 ^ 0x86);
        q.lIlllIIIIII[12] = "   ".length();
        q.lIlllIIIIII[13] = 0xA8 ^ 0xC3 ^ (0xD4 ^ 0xBA);
        q.lIlllIIIIII[14] = 0xB1 ^ 0xB5;
        q.lIlllIIIIII[15] = 0x21 ^ 3;
        q.lIlllIIIIII[16] = 0xA0 ^ 0x83;
        q.lIlllIIIIII[17] = 0x27 ^ 0x48 ^ (0x3F ^ 0x58);
    }

    public static q[] values() {
        return (q[])$VALUES.clone();
    }

    private static boolean lIIllIIIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private q(List<Point> list, Point point, Point point2) {
        this.boulders = list;
        this.jug = point;
        this.stand = point2;
    }

    private static String lIIllIIIIlIIIl(String llllllllllllllllIlIIllllIIIIlllI, String llllllllllllllllIlIIllllIIIIllIl) {
        llllllllllllllllIlIIllllIIIIlllI = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllllIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllllIIIIllII = new StringBuilder();
        char[] llllllllllllllllIlIIllllIIIIlIll = llllllllllllllllIlIIllllIIIIllIl.toCharArray();
        int llllllllllllllllIlIIllllIIIIlIlI = lIlllIIIIII[0];
        char[] llllllllllllllllIlIIllllIIIIIlII = llllllllllllllllIlIIllllIIIIlllI.toCharArray();
        int llllllllllllllllIlIIllllIIIIIIll = llllllllllllllllIlIIllllIIIIIlII.length;
        int llllllllllllllllIlIIllllIIIIIIlI = lIlllIIIIII[0];
        while (q.lIIllIIIIlllIl(llllllllllllllllIlIIllllIIIIIIlI, llllllllllllllllIlIIllllIIIIIIll)) {
            char llllllllllllllllIlIIllllIIIIllll = llllllllllllllllIlIIllllIIIIIlII[llllllllllllllllIlIIllllIIIIIIlI];
            llllllllllllllllIlIIllllIIIIllII.append((char)(llllllllllllllllIlIIllllIIIIllll ^ llllllllllllllllIlIIllllIIIIlIll[llllllllllllllllIlIIllllIIIIlIlI % llllllllllllllllIlIIllllIIIIlIll.length]));
            "".length();
            ++llllllllllllllllIlIIllllIIIIlIlI;
            ++llllllllllllllllIlIIllllIIIIIIlI;
            "".length();
            if ("  ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIllllIIIIllII);
    }

    private static void lIIllIIIIllIll() {
        lIllIllllll = new String[lIlllIIIIII[13]];
        q.lIllIllllll[q.lIlllIIIIII[0]] = q.lIIllIIIIIllll("szlAIzKyAvE=", "TGHDj");
        q.lIllIllllll[q.lIlllIIIIII[6]] = q.lIIllIIIIlIIIl("NgExPjYh", "eDrqx");
        q.lIllIllllll[q.lIlllIIIIII[8]] = q.lIIllIIIIlIIlI("7ZzEsqrAV0w=", "zRikV");
        q.lIllIllllll[q.lIlllIIIIII[12]] = q.lIIllIIIIlIIIl("PjUnFjIw", "xzrDf");
        q.lIllIllllll[q.lIlllIIIIII[14]] = q.lIIllIIIIlIIlI("CT1Po+jslYI=", "JQLQx");
    }

    static {
        q.lIIllIIIIlllII();
        q.lIIllIIIIllIll();
        FIRST = new q(List.of(new Point(lIlllIIIIII[1], lIlllIIIIII[2]), new Point(lIlllIIIIII[1], lIlllIIIIII[3]), new Point(lIlllIIIIII[4], lIlllIIIIII[5])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[6], lIlllIIIIII[6]));
        SECOND = new q(List.of(new Point(lIlllIIIIII[1], lIlllIIIIII[3]), new Point(lIlllIIIIII[4], lIlllIIIIII[5]), new Point(lIlllIIIIII[1], lIlllIIIIII[7])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[6], lIlllIIIIII[6]));
        THIRD = new q(List.of(new Point(lIlllIIIIII[4], lIlllIIIIII[3]), new Point(lIlllIIIIII[1], lIlllIIIIII[5]), new Point(lIlllIIIIII[9], lIlllIIIIII[7])), new Point(lIlllIIIIII[1], lIlllIIIIII[10]), new Point(lIlllIIIIII[1], lIlllIIIIII[11]));
        FOURTH = new q(List.of(new Point(lIlllIIIIII[9], lIlllIIIIII[5]), new Point(lIlllIIIIII[9], lIlllIIIIII[7])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[1], lIlllIIIIII[13]));
        FIFTH = new q(List.of(new Point(lIlllIIIIII[9], lIlllIIIIII[7]), new Point(lIlllIIIIII[9], lIlllIIIIII[15]), new Point(lIlllIIIIII[9], lIlllIIIIII[16])), new Point(lIlllIIIIII[6], lIlllIIIIII[6]), new Point(lIlllIIIIII[6], lIlllIIIIII[6]));
        q[] qArray = new q[lIlllIIIIII[13]];
        qArray[q.lIlllIIIIII[0]] = FIRST;
        qArray[q.lIlllIIIIII[6]] = SECOND;
        qArray[q.lIlllIIIIII[8]] = THIRD;
        qArray[q.lIlllIIIIII[12]] = FOURTH;
        qArray[q.lIlllIIIIII[14]] = FIFTH;
        $VALUES = qArray;
    }

    private static String lIIllIIIIlIIlI(String llllllllllllllllIlIIlllIlllIlIlI, String llllllllllllllllIlIIlllIlllIlIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIlllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIlllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlllIlllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlllIlllIlllI.init(lIlllIIIIII[8], llllllllllllllllIlIIlllIlllIllll);
            return new String(llllllllllllllllIlIIlllIlllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlllIlllIllIl) {
            llllllllllllllllIlIIlllIlllIllIl.printStackTrace();
            return null;
        }
    }
}

