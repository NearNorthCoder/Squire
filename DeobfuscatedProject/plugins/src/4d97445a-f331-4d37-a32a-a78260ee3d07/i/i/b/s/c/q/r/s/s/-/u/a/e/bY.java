/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;

public final class bY
extends Enum<bY> {
    private static /* synthetic */ String[] lllIIlIII;
    public static final /* synthetic */ /* enum */ bY GLORY;
    private final /* synthetic */ String action;
    private static /* synthetic */ int[] lllIIlIIl;
    private static final /* synthetic */ bY[] $VALUES;
    private final /* synthetic */ boolean equipment;
    public static final /* synthetic */ /* enum */ bY RING_OF_DUELING;
    public static final /* synthetic */ /* enum */ bY WEALTH;
    private final /* synthetic */ Predicate<Item> predicate;
    public static final /* synthetic */ /* enum */ bY ROYAL_SEED_POD;
    private final /* synthetic */ int wildy;

    public boolean db() {
        return this.equipment;
    }

    public int da() {
        return this.wildy;
    }

    public String cZ() {
        return this.action;
    }

    private bY(Predicate<Item> predicate, String string2, int n3, boolean bl2) {
        this.predicate = predicate;
        this.action = string2;
        this.wildy = n3;
        this.equipment = bl2;
    }

    private static void llIIIIlllII() {
        lllIIlIIl = new int[15];
        bY.lllIIlIIl[0] = 0xFFFFFCEE & 0x4F7D;
        bY.lllIIlIIl[1] = " ".length();
        bY.lllIIlIIl[2] = (0x32 ^ 0x53 ^ (0xEA ^ 0xA8)) & (0x7C ^ 0x72 ^ (6 ^ 0x2B) ^ -" ".length());
        bY.lllIIlIIl[3] = "  ".length();
        bY.lllIIlIIl[4] = "   ".length();
        bY.lllIIlIIl[5] = 0x59 ^ 0x13 ^ (0xF3 ^ 0xBD);
        bY.lllIIlIIl[6] = 0xDE ^ 0xC0;
        bY.lllIIlIIl[7] = 0xE ^ 0x3E ^ (0xA2 ^ 0x97);
        bY.lllIIlIIl[8] = 118 + 114 - 100 + 35 ^ 77 + 103 - 139 + 120;
        bY.lllIIlIIl[9] = 0x90 ^ 0x97;
        bY.lllIIlIIl[10] = 0x9D ^ 0x95;
        bY.lllIIlIIl[11] = 0x23 ^ 0x46 ^ (8 ^ 0x79);
        bY.lllIIlIIl[12] = 22 + 54 - -52 + 13 ^ 92 + 117 - 123 + 46;
        bY.lllIIlIIl[13] = 0xCA ^ 0x81 ^ (0x68 ^ 0x29);
        bY.lllIIlIIl[14] = 133 + 76 - 68 + 42 ^ 111 + 131 - 241 + 187;
    }

    private static boolean llIIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    public static bY valueOf(String string) {
        return Enum.valueOf(bY.class, string);
    }

    public static bY[] values() {
        return (bY[])$VALUES.clone();
    }

    private static String llIIIIllIIl(String lIlIllIIlIIllII, String lIlIllIIlIIlIll) {
        try {
            SecretKeySpec lIlIllIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIIlIIlIll.getBytes(StandardCharsets.UTF_8)), lllIIlIIl[10]), "DES");
            Cipher lIlIllIIlIlIIII = Cipher.getInstance("DES");
            lIlIllIIlIlIIII.init(lllIIlIIl[3], lIlIllIIlIlIIIl);
            return new String(lIlIllIIlIlIIII.doFinal(Base64.getDecoder().decode(lIlIllIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIIlIIllll) {
            lIlIllIIlIIllll.printStackTrace();
            return null;
        }
    }

    static {
        bY.llIIIIlllII();
        bY.llIIIIllIll();
        GLORY = new bY(item -> {
            String[] stringArray = new String[lllIIlIIl[1]];
            stringArray[bY.lllIIlIIl[2]] = lllIIlIII[lllIIlIIl[3]];
            return item.hasAction(stringArray);
        }, lllIIlIII[lllIIlIIl[5]], lllIIlIIl[6], lllIIlIIl[1]);
        WEALTH = new bY(item -> {
            String[] stringArray = new String[lllIIlIIl[1]];
            stringArray[bY.lllIIlIIl[2]] = lllIIlIII[lllIIlIIl[1]];
            return item.hasAction(stringArray);
        }, lllIIlIII[lllIIlIIl[8]], lllIIlIIl[6], lllIIlIIl[1]);
        RING_OF_DUELING = new bY(item -> item.getName().toLowerCase().contains(lllIIlIII[lllIIlIIl[2]]), lllIIlIII[lllIIlIIl[10]], lllIIlIIl[11], lllIIlIIl[1]);
        ROYAL_SEED_POD = new bY(item -> {
            boolean bl2;
            if (bY.llIIIIlllIl(item.getId(), lllIIlIIl[0])) {
                bl2 = lllIIlIIl[1];
                "".length();
                if (" ".length() >= ("   ".length() ^ (0x44 ^ 0x43))) {
                    return ((0x8E ^ 0xC1 ^ (0x2D ^ 0x5B)) & (0xC1 ^ 0x83 ^ (0x20 ^ 0x5B) ^ -" ".length())) != 0;
                }
            } else {
                bl2 = lllIIlIIl[2];
            }
            return bl2;
        }, lllIIlIII[lllIIlIIl[13]], lllIIlIIl[6], lllIIlIIl[2]);
        bY[] bYArray = new bY[lllIIlIIl[5]];
        bYArray[bY.lllIIlIIl[2]] = GLORY;
        bYArray[bY.lllIIlIIl[1]] = WEALTH;
        bYArray[bY.lllIIlIIl[3]] = RING_OF_DUELING;
        bYArray[bY.lllIIlIIl[4]] = ROYAL_SEED_POD;
        $VALUES = bYArray;
    }

    private static String llIIIIllIII(String lIlIllIIIlIlIIl, String lIlIllIIIlIlIII) {
        try {
            SecretKeySpec lIlIllIIIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIIIlIlIll = Cipher.getInstance("Blowfish");
            lIlIllIIIlIlIll.init(lllIIlIIl[3], lIlIllIIIlIllII);
            return new String(lIlIllIIIlIlIll.doFinal(Base64.getDecoder().decode(lIlIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIIIlIlIlI) {
            lIlIllIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> br() {
        return this.predicate;
    }

    private static void llIIIIllIll() {
        lllIIlIII = new String[lllIIlIIl[14]];
        bY.lllIIlIII[bY.lllIIlIIl[2]] = bY.llIIIIllIII("fE+bbxtivEo=", "MmrHc");
        bY.lllIIlIII[bY.lllIIlIIl[1]] = bY.llIIIIllIII("5fUraZssYB8FJKBZ4JOrfA==", "rarUq");
        bY.lllIIlIII[bY.lllIIlIIl[3]] = bY.llIIIIllIII("5IYQFb2ZmmqyncqvmGy9nA==", "tNgvM");
        bY.lllIIlIII[bY.lllIIlIIl[4]] = bY.llIIIIllIII("AS3q7bq/aiU=", "aDdMM");
        bY.lllIIlIII[bY.lllIIlIIl[5]] = bY.llIIIIllIIl("a+Dw2BJc86ec06lQbff6+Q==", "vobZQ");
        bY.lllIIlIII[bY.lllIIlIIl[7]] = bY.llIIIIllIII("KX3gnz/D6Sw=", "qhOzJ");
        bY.lllIIlIII[bY.lllIIlIIl[8]] = bY.llIIIIllIII("469PZOEFNf4qX+lc1kYFXQ==", "HviUV");
        bY.lllIIlIII[bY.lllIIlIIl[9]] = bY.llIIIIllIII("tSdKHKjg9VmwCJRqnm3Fwg==", "ippnF");
        bY.lllIIlIII[bY.lllIIlIIl[10]] = bY.llIIIIllIlI("EQYUGiB3BggWNDYVAw==", "WcfuX");
        bY.lllIIlIII[bY.lllIIlIIl[12]] = bY.llIIIIllIIl("ZZb0+aoGfZ5wafLJ1/JlZg==", "mAZaO");
        bY.lllIIlIII[bY.lllIIlIIl[13]] = bY.llIIIIllIII("VvZzeCm2lHU=", "mmXRW");
    }

    private static boolean llIIIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIllIlI(String lIlIllIIIlllllI, String lIlIllIIIlllIII) {
        lIlIllIIIlllllI = new String(Base64.getDecoder().decode(lIlIllIIIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIIIllllII = new StringBuilder();
        char[] lIlIllIIIlllIll = lIlIllIIIlllIII.toCharArray();
        int lIlIllIIIlllIlI = lllIIlIIl[2];
        char[] lIlIllIIIllIlII = lIlIllIIIlllllI.toCharArray();
        int lIlIllIIIllIIll = lIlIllIIIllIlII.length;
        int lIlIllIIIllIIlI = lllIIlIIl[2];
        while (bY.llIIIIllllI(lIlIllIIIllIIlI, lIlIllIIIllIIll)) {
            char lIlIllIIIllllll = lIlIllIIIllIlII[lIlIllIIIllIIlI];
            lIlIllIIIllllII.append((char)(lIlIllIIIllllll ^ lIlIllIIIlllIll[lIlIllIIIlllIlI % lIlIllIIIlllIll.length]));
            "".length();
            ++lIlIllIIIlllIlI;
            ++lIlIllIIIllIIlI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lIlIllIIIllllII);
    }
}

