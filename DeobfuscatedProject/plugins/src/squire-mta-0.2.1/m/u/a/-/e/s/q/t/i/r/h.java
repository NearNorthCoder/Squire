/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Rune
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package m.u.a.-.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.SpellBook;

public final class h
extends Enum<h> {
    public static final /* synthetic */ /* enum */ h LVL4_ENCHANT;
    public static final /* synthetic */ /* enum */ h LVL6_ENCHANT;
    private final /* synthetic */ SpellBook.Standard spell;
    private final /* synthetic */ Rune rune;
    private static /* synthetic */ String[] lllIlIIllIlI;
    public static final /* synthetic */ /* enum */ h LVL3_ENCHANT;
    public static final /* synthetic */ /* enum */ h LVL1_ENCHANT;
    private static final /* synthetic */ h[] $VALUES;
    public static final /* synthetic */ /* enum */ h LVL5_ENCHANT;
    private static /* synthetic */ int[] lllIlIIllIll;
    public static final /* synthetic */ /* enum */ h LVL2_ENCHANT;

    private h(SpellBook.Standard standard, Rune rune) {
        this.spell = standard;
        this.rune = rune;
    }

    private static boolean lIIIlIlllIlllII(int n2, int n3) {
        return n2 < n3;
    }

    public SpellBook.Standard u() {
        return this.spell;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static String lIIIlIlllIllIII(String lllllllllllllllIIllIllIlllIIlIII, String lllllllllllllllIIllIllIlllIIIlll) {
        lllllllllllllllIIllIllIlllIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIlllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIlllIIlIll = new StringBuilder();
        char[] lllllllllllllllIIllIllIlllIIlIlI = lllllllllllllllIIllIllIlllIIIlll.toCharArray();
        int lllllllllllllllIIllIllIlllIIlIIl = lllIlIIllIll[0];
        char[] lllllllllllllllIIllIllIlllIIIIll = lllllllllllllllIIllIllIlllIIlIII.toCharArray();
        int lllllllllllllllIIllIllIlllIIIIlI = lllllllllllllllIIllIllIlllIIIIll.length;
        int lllllllllllllllIIllIllIlllIIIIIl = lllIlIIllIll[0];
        while (h.lIIIlIlllIlllII(lllllllllllllllIIllIllIlllIIIIIl, lllllllllllllllIIllIllIlllIIIIlI)) {
            char lllllllllllllllIIllIllIlllIIlllI = lllllllllllllllIIllIllIlllIIIIll[lllllllllllllllIIllIllIlllIIIIIl];
            lllllllllllllllIIllIllIlllIIlIll.append((char)(lllllllllllllllIIllIllIlllIIlllI ^ lllllllllllllllIIllIllIlllIIlIlI[lllllllllllllllIIllIllIlllIIlIIl % lllllllllllllllIIllIllIlllIIlIlI.length]));
            "".length();
            ++lllllllllllllllIIllIllIlllIIlIIl;
            ++lllllllllllllllIIllIllIlllIIIIIl;
            "".length();
            if (((0x71 ^ 0x13 ^ (0x3D ^ 0x79)) & (48 + 51 - 16 + 58 ^ 125 + 42 - 49 + 53 ^ -" ".length())) != "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIllIlllIIlIll);
    }

    static {
        h.lIIIlIlllIllIll();
        h.lIIIlIlllIllIlI();
        LVL1_ENCHANT = new h(SpellBook.Standard.LVL_1_ENCHANT, Rune.WATER);
        LVL2_ENCHANT = new h(SpellBook.Standard.LVL_2_ENCHANT, Rune.AIR);
        LVL3_ENCHANT = new h(SpellBook.Standard.LVL_3_ENCHANT, Rune.FIRE);
        LVL4_ENCHANT = new h(SpellBook.Standard.LVL_4_ENCHANT, Rune.EARTH);
        LVL5_ENCHANT = new h(SpellBook.Standard.LVL_5_ENCHANT, Rune.WATER);
        LVL6_ENCHANT = new h(SpellBook.Standard.LVL_6_ENCHANT, Rune.EARTH);
        h[] hArray = new h[lllIlIIllIll[6]];
        hArray[h.lllIlIIllIll[0]] = LVL1_ENCHANT;
        hArray[h.lllIlIIllIll[1]] = LVL2_ENCHANT;
        hArray[h.lllIlIIllIll[2]] = LVL3_ENCHANT;
        hArray[h.lllIlIIllIll[3]] = LVL4_ENCHANT;
        hArray[h.lllIlIIllIll[4]] = LVL5_ENCHANT;
        hArray[h.lllIlIIllIll[5]] = LVL6_ENCHANT;
        $VALUES = hArray;
    }

    private static String lIIIlIlllIllIIl(String lllllllllllllllIIllIllIllIllIllI, String lllllllllllllllIIllIllIllIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIllIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIllIllIlIl.getBytes(StandardCharsets.UTF_8)), lllIlIIllIll[7]), "DES");
            Cipher lllllllllllllllIIllIllIllIlllIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIllIllIlllIlI.init(lllIlIIllIll[2], lllllllllllllllIIllIllIllIlllIll);
            return new String(lllllllllllllllIIllIllIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIllIlllIIl) {
            lllllllllllllllIIllIllIllIlllIIl.printStackTrace();
            return null;
        }
    }

    public Rune t() {
        return this.rune;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static void lIIIlIlllIllIll() {
        lllIlIIllIll = new int[8];
        h.lllIlIIllIll[0] = (0x86 ^ 0xC4) & ~(0x37 ^ 0x75);
        h.lllIlIIllIll[1] = " ".length();
        h.lllIlIIllIll[2] = "  ".length();
        h.lllIlIIllIll[3] = "   ".length();
        h.lllIlIIllIll[4] = 0x47 ^ 0x43;
        h.lllIlIIllIll[5] = 0x17 ^ 0xB ^ (0x7C ^ 0x65);
        h.lllIlIIllIll[6] = 0x68 ^ 0x7D ^ (0x6D ^ 0x7E);
        h.lllIlIIllIll[7] = 0x29 ^ 0x21;
    }

    private static void lIIIlIlllIllIlI() {
        lllIlIIllIlI = new String[lllIlIIllIll[6]];
        h.lllIlIIllIlI[h.lllIlIIllIll[0]] = h.lIIIlIlllIllIII("CRUPfQ4ADQAEEAsX", "ECCLQ");
        h.lllIlIIllIlI[h.lllIlIIllIll[1]] = h.lIIIlIlllIllIII("LzAlYBcmKCoaCS0y", "cfiRH");
        h.lllIlIIllIlI[h.lllIlIIllIll[2]] = h.lIIIlIlllIllIIl("ZakpRxO69pahWwnO6Sftzw==", "EgEoC");
        h.lllIlIIllIlI[h.lllIlIIllIll[3]] = h.lIIIlIlllIllIIl("qFtaGQZNufTazpgjNCdXRg==", "KtiRF");
        h.lllIlIIllIlI[h.lllIlIIllIll[4]] = h.lIIIlIlllIllIIl("JwpdZ/XKTfmrfFEIdAshhg==", "Vexya");
        h.lllIlIIllIlI[h.lllIlIIllIll[5]] = h.lIIIlIlllIllIIl("MMePl9AwBdC0bE8FvTS9ag==", "VeBny");
    }
}

