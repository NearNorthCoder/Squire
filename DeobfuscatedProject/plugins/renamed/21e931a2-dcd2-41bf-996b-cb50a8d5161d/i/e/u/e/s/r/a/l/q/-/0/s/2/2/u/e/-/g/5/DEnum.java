/*
 * Decompiled with CFR 0.152.
 */
package i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class DEnum
extends Enum<d> {
    public static final /* synthetic */ /* enum */ d GOLD;
    public static final /* synthetic */ /* enum */ d IRON;
    public static final /* synthetic */ /* enum */ d MITHRIL;
    public static final /* synthetic */ /* enum */ d SOFTCLAY;
    private static final /* synthetic */ d[] $VALUES;
    private static /* synthetic */ String[] lIIIl;
    public static final /* synthetic */ /* enum */ d RUNE;
    public static final /* synthetic */ /* enum */ d COAL;
    public static final /* synthetic */ /* enum */ d SILVER;
    public static final /* synthetic */ /* enum */ d ADDY;
    private static /* synthetic */ int[] lIIlI;

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static void lllIII() {
        lIIlI = new int[9];
        d.lIIlI[0] = (120 + 12 - 2 + 58 ^ 38 + 143 - 19 + 10) & (0x6B ^ 8 ^ (0xB4 ^ 0xC7) ^ -1);
        d.lIIlI[1] = 1;
        d.lIIlI[2] = 2;
        d.lIIlI[3] = 3;
        d.lIIlI[4] = 0x82 ^ 0x9D ^ (0x12 ^ 9);
        d.lIIlI[5] = 0x36 ^ 0x30 ^ 3;
        d.lIIlI[6] = 0x93 ^ 0x95;
        d.lIIlI[7] = 0x97 ^ 0x90;
        d.lIIlI[8] = 0xE7 ^ 0xB6 ^ (0xE7 ^ 0xBE);
    }

    private static String llIlIl(String llllllIIllIlllI, String llllllIIllIllIl) {
        llllllIIllIlllI = new String(Base64.getDecoder().decode(llllllIIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIIlllIIIl = new StringBuilder();
        char[] llllllIIlllIIII = llllllIIllIllIl.toCharArray();
        int llllllIIllIllll = lIIlI[0];
        char[] llllllIIllIlIIl = llllllIIllIlllI.toCharArray();
        int llllllIIllIlIII = llllllIIllIlIIl.length;
        int llllllIIllIIlll = lIIlI[0];
        while (d.lllIIl(llllllIIllIIlll, llllllIIllIlIII)) {
            char llllllIIlllIlII = llllllIIllIlIIl[llllllIIllIIlll];
            llllllIIlllIIIl.append((char)(llllllIIlllIlII ^ llllllIIlllIIII[llllllIIllIllll % llllllIIlllIIII.length]));
            0;
            ++llllllIIllIllll;
            ++llllllIIllIIlll;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(llllllIIlllIIIl);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static String llIllI(String llllllIIlIlllII, String llllllIIlIllIll) {
        try {
            SecretKeySpec llllllIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIIlIllIll.getBytes(StandardCharsets.UTF_8)), lIIlI[8]), "DES");
            Cipher llllllIIllIIIII = Cipher.getInstance("DES");
            llllllIIllIIIII.init(lIIlI[2], llllllIIllIIIIl);
            return new String(llllllIIllIIIII.doFinal(Base64.getDecoder().decode(llllllIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIIlIlllll) {
            llllllIIlIlllll.printStackTrace();
            return null;
        }
    }

    private static String llIIII(String llllllIlIIIIIll, String llllllIlIIIIIlI) {
        try {
            SecretKeySpec llllllIlIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIlIIIIlIl = Cipher.getInstance("Blowfish");
            llllllIlIIIIlIl.init(lIIlI[2], llllllIlIIIIllI);
            return new String(llllllIlIIIIlIl.doFinal(Base64.getDecoder().decode(llllllIlIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllIlIIIIlII) {
            llllllIlIIIIlII.printStackTrace();
            return null;
        }
    }

    static {
        d.lllIII();
        d.llIlll();
        RUNE = new d();
        ADDY = new d();
        MITHRIL = new d();
        IRON = new d();
        COAL = new d();
        GOLD = new d();
        SOFTCLAY = new d();
        SILVER = new d();
        d[] dArray = new d[lIIlI[8]];
        dArray[d.lIIlI[0]] = RUNE;
        dArray[d.lIIlI[1]] = ADDY;
        dArray[d.lIIlI[2]] = MITHRIL;
        dArray[d.lIIlI[3]] = IRON;
        dArray[d.lIIlI[4]] = COAL;
        dArray[d.lIIlI[5]] = GOLD;
        dArray[d.lIIlI[6]] = SOFTCLAY;
        dArray[d.lIIlI[7]] = SILVER;
        $VALUES = dArray;
    }

    private static void llIlll() {
        lIIIl = new String[lIIlI[8]];
        d.lIIIl[d.lIIlI[0]] = d."RUNE";
        d.lIIIl[d.lIIlI[1]] = d."ADDY";
        d.lIIIl[d.lIIlI[2]] = d."MITHRIL";
        d.lIIIl[d.lIIlI[3]] = d."IRON";
        d.lIIIl[d.lIIlI[4]] = d."COAL";
        d.lIIIl[d.lIIlI[5]] = d."GOLD";
        d.lIIIl[d.lIIlI[6]] = d."SOFTCLAY";
        d.lIIIl[d.lIIlI[7]] = d."SILVER";
    }

    private static boolean lllIIl(int n, int n2) {
        return n < n2;
    }
}

