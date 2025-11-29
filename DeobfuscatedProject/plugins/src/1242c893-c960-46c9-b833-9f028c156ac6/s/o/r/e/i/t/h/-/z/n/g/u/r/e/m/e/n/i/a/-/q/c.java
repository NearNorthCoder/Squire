/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;

public final class c
extends Enum<c> {
    public static final /* synthetic */ /* enum */ c MYSTIC_WILL;
    public static final /* synthetic */ /* enum */ c PIETY;
    private final /* synthetic */ Prayer prayer;
    public static final /* synthetic */ /* enum */ c HAWK_EYE;
    public static final /* synthetic */ /* enum */ c EAGLE_EYE;
    private static /* synthetic */ int[] lIIIlIIllIIIl;
    public static final /* synthetic */ /* enum */ c RIGOUR;
    public static final /* synthetic */ /* enum */ c ULTIMATE_STR;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] lIIIlIIllIIII;
    public static final /* synthetic */ /* enum */ c BURST_OF_STR;
    public static final /* synthetic */ /* enum */ c AUGURY;
    public static final /* synthetic */ /* enum */ c MYSTIC_MIGHT;
    public static final /* synthetic */ /* enum */ c SHARP_EYE;
    public static final /* synthetic */ /* enum */ c SUPERHUMAN_STR;
    public static final /* synthetic */ /* enum */ c MYSTIC_LORD;

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public Prayer j() {
        return this.prayer;
    }

    private static String lIIlllllIIlIlIl(String lllllllllllllllIIIIlllllIIlllIIl, String lllllllllllllllIIIIlllllIIllllIl) {
        lllllllllllllllIIIIlllllIIlllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllllIIllllII = new StringBuilder();
        char[] lllllllllllllllIIIIlllllIIlllIll = lllllllllllllllIIIIlllllIIllllIl.toCharArray();
        int lllllllllllllllIIIIlllllIIlllIlI = lIIIlIIllIIIl[0];
        char[] lllllllllllllllIIIIlllllIIllIlII = lllllllllllllllIIIIlllllIIlllIIl.toCharArray();
        int lllllllllllllllIIIIlllllIIllIIll = lllllllllllllllIIIIlllllIIllIlII.length;
        int lllllllllllllllIIIIlllllIIllIIlI = lIIIlIIllIIIl[0];
        while (c.lIIlllllIIllIlI(lllllllllllllllIIIIlllllIIllIIlI, lllllllllllllllIIIIlllllIIllIIll)) {
            char lllllllllllllllIIIIlllllIIllllll = lllllllllllllllIIIIlllllIIllIlII[lllllllllllllllIIIIlllllIIllIIlI];
            lllllllllllllllIIIIlllllIIllllII.append((char)(lllllllllllllllIIIIlllllIIllllll ^ lllllllllllllllIIIIlllllIIlllIll[lllllllllllllllIIIIlllllIIlllIlI % lllllllllllllllIIIIlllllIIlllIll.length]));
            "".length();
            ++lllllllllllllllIIIIlllllIIlllIlI;
            ++lllllllllllllllIIIIlllllIIllIIlI;
            "".length();
            if ("   ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlllllIIllllII);
    }

    static {
        c.lIIlllllIIllIIl();
        c.lIIlllllIIllIII();
        BURST_OF_STR = new c(Prayer.BURST_OF_STRENGTH);
        SUPERHUMAN_STR = new c(Prayer.SUPERHUMAN_STRENGTH);
        ULTIMATE_STR = new c(Prayer.ULTIMATE_STRENGTH);
        PIETY = new c(Prayer.PIETY);
        SHARP_EYE = new c(Prayer.EAGLE_EYE);
        HAWK_EYE = new c(Prayer.EAGLE_EYE);
        EAGLE_EYE = new c(Prayer.EAGLE_EYE);
        RIGOUR = new c(Prayer.RIGOUR);
        MYSTIC_WILL = new c(Prayer.MYSTIC_WILL);
        MYSTIC_LORD = new c(Prayer.MYSTIC_LORE);
        MYSTIC_MIGHT = new c(Prayer.MYSTIC_MIGHT);
        AUGURY = new c(Prayer.AUGURY);
        c[] cArray = new c[lIIIlIIllIIIl[12]];
        cArray[c.lIIIlIIllIIIl[0]] = BURST_OF_STR;
        cArray[c.lIIIlIIllIIIl[1]] = SUPERHUMAN_STR;
        cArray[c.lIIIlIIllIIIl[2]] = ULTIMATE_STR;
        cArray[c.lIIIlIIllIIIl[3]] = PIETY;
        cArray[c.lIIIlIIllIIIl[4]] = SHARP_EYE;
        cArray[c.lIIIlIIllIIIl[5]] = HAWK_EYE;
        cArray[c.lIIIlIIllIIIl[6]] = EAGLE_EYE;
        cArray[c.lIIIlIIllIIIl[7]] = RIGOUR;
        cArray[c.lIIIlIIllIIIl[8]] = MYSTIC_WILL;
        cArray[c.lIIIlIIllIIIl[9]] = MYSTIC_LORD;
        cArray[c.lIIIlIIllIIIl[10]] = MYSTIC_MIGHT;
        cArray[c.lIIIlIIllIIIl[11]] = AUGURY;
        $VALUES = cArray;
    }

    private static boolean lIIlllllIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlllllIIllIII() {
        lIIIlIIllIIII = new String[lIIIlIIllIIIl[12]];
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[0]] = c.lIIlllllIIlIlIl("EwwWAi4OFgIOKQUL", "QYDQz");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[1]] = c.lIIlllllIIlIlIl("PBkEMQsnGRk1FzAfACY=", "oLTtY");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[2]] = c.lIIlllllIIlIllI("Z8MlyKFoisLmS+E61dXuBw==", "uKfyJ");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[3]] = c.lIIlllllIIlIlIl("HDkMADQ=", "LpITm");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[4]] = c.lIIlllllIIlIllI("uCKqkfHCAeBR6SJy1qORGg==", "MsFBd");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[5]] = c.lIIlllllIIlIllI("bjsLuqBJBEx+2RCo42cEUw==", "uxcsq");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[6]] = c.lIIlllllIIlIlIl("PBUhJjUmET8v", "yTfjp");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[7]] = c.lIIlllllIIlIlll("Q6LqJfUPtn4=", "Mvvop");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[8]] = c.lIIlllllIIlIllI("BXH2ccU2GibHSv+SJP6hcg==", "BldXk");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[9]] = c.lIIlllllIIlIlIl("Ox0WByY1GwkcPTI=", "vDESo");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[10]] = c.lIIlllllIIlIllI("z65EvInyWMx83qjdYJJ/SA==", "QrxFW");
        c.lIIIlIIllIIII[c.lIIIlIIllIIIl[11]] = c.lIIlllllIIlIlIl("CRA3NyoR", "HEpbx");
    }

    private static void lIIlllllIIllIIl() {
        lIIIlIIllIIIl = new int[13];
        c.lIIIlIIllIIIl[0] = (0x28 ^ 0x7D ^ (0x4B ^ 0x3F)) & (152 + 106 - 214 + 127 ^ 0 + 123 - 106 + 121 ^ -" ".length());
        c.lIIIlIIllIIIl[1] = " ".length();
        c.lIIIlIIllIIIl[2] = "  ".length();
        c.lIIIlIIllIIIl[3] = "   ".length();
        c.lIIIlIIllIIIl[4] = 0x2D ^ 0x21 ^ (0xC9 ^ 0xC1);
        c.lIIIlIIllIIIl[5] = 0x69 ^ 0x6C;
        c.lIIIlIIllIIIl[6] = 0x6F ^ 0x69;
        c.lIIIlIIllIIIl[7] = 0xB6 ^ 0xB1;
        c.lIIIlIIllIIIl[8] = "  ".length() ^ (0x4B ^ 0x41);
        c.lIIIlIIllIIIl[9] = 0xB3 ^ 0xBA;
        c.lIIIlIIllIIIl[10] = 0x3A ^ 0x30;
        c.lIIIlIIllIIIl[11] = 0x6A ^ 0x7E ^ (0x6E ^ 0x71);
        c.lIIIlIIllIIIl[12] = 0x61 ^ 0x6D;
    }

    private static String lIIlllllIIlIllI(String lllllllllllllllIIIIlllllIIlIlIIl, String lllllllllllllllIIIIlllllIIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllllIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllllIIlIlIII.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIIIl[8]), "DES");
            Cipher lllllllllllllllIIIIlllllIIlIlIll = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllllIIlIlIll.init(lIIIlIIllIIIl[2], lllllllllllllllIIIIlllllIIlIllII);
            return new String(lllllllllllllllIIIIlllllIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllllIIlIlIlI) {
            lllllllllllllllIIIIlllllIIlIlIlI.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static String lIIlllllIIlIlll(String lllllllllllllllIIIIlllllIIIllIlI, String lllllllllllllllIIIIlllllIIIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllllIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllllIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlllllIIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlllllIIIllllI.init(lIIIlIIllIIIl[2], lllllllllllllllIIIIlllllIIIlllll);
            return new String(lllllllllllllllIIIIlllllIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllllIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllllIIIlllIl) {
            lllllllllllllllIIIIlllllIIIlllIl.printStackTrace();
            return null;
        }
    }

    private c(Prayer prayer) {
        this.prayer = prayer;
    }
}

