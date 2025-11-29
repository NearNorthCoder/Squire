/*
 * Decompiled with CFR 0.152.
 */
package m.u.a.-.e.s.q.t.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class c
extends Enum<c> {
    private final /* synthetic */ int childID = 6;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ int[] lllIllIIIllI;
    private final /* synthetic */ int parentID;
    private static /* synthetic */ String[] lllIllIIIlIl;
    public static final /* synthetic */ /* enum */ c ALCHEMY;
    public static final /* synthetic */ /* enum */ c TELEKENETIC;
    public static final /* synthetic */ /* enum */ c ENCHANTMENT;
    public static final /* synthetic */ /* enum */ c GRAVEYARD;
    private final /* synthetic */ String teleportObject;

    private static String lIIIllIIllIlllI(String lllllllllllllllIIllIlIIIlIIIIllI, String lllllllllllllllIIllIlIIIlIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIlIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), lllIllIIIllI[12]), "DES");
            Cipher lllllllllllllllIIllIlIIIlIIIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIlIIIlIlI.init(lllIllIIIllI[4], lllllllllllllllIIllIlIIIlIIIlIll);
            return new String(lllllllllllllllIIllIlIIIlIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIlIIIlIIl) {
            lllllllllllllllIIllIlIIIlIIIlIIl.printStackTrace();
            return null;
        }
    }

    static {
        c.lIIIllIIlllIIIl();
        c.lIIIllIIlllIIII();
        GRAVEYARD = new c(lllIllIIIlIl[lllIllIIIllI[2]], lllIllIIIllI[3]);
        TELEKENETIC = new c(lllIllIIIlIl[lllIllIIIllI[5]], lllIllIIIllI[6]);
        ALCHEMY = new c(lllIllIIIlIl[lllIllIIIllI[8]], lllIllIIIllI[9]);
        ENCHANTMENT = new c(lllIllIIIlIl[lllIllIIIllI[10]], lllIllIIIllI[11]);
        c[] cArray = new c[lllIllIIIllI[7]];
        cArray[c.lllIllIIIllI[1]] = GRAVEYARD;
        cArray[c.lllIllIIIllI[2]] = TELEKENETIC;
        cArray[c.lllIllIIIllI[4]] = ALCHEMY;
        cArray[c.lllIllIIIllI[5]] = ENCHANTMENT;
        $VALUES = cArray;
    }

    private static void lIIIllIIlllIIIl() {
        lllIllIIIllI = new int[13];
        c.lllIllIIIllI[0] = 0xC2 ^ 0xC4;
        c.lllIllIIIllI[1] = (3 ^ (0x46 ^ 0x1C)) & (5 + 23 - -81 + 43 ^ 107 + 52 - 19 + 53 ^ -1);
        c.lllIllIIIllI[2] = 1;
        c.lllIllIIIllI[3] = (0x39 ^ 0x36) + (40 + 139 - 150 + 122) - (44 + 9 - -62 + 30) + (82 + 91 - 47 + 49);
        c.lllIllIIIllI[4] = 2;
        c.lllIllIIIllI[5] = 3;
        c.lllIllIIIllI[6] = (0x3F ^ 0x2C) + (0x90 ^ 0xC3) - -(0x68 ^ 0x45) + (0x83 ^ 0xB0);
        c.lllIllIIIllI[7] = 0xBA ^ 0xBE;
        c.lllIllIIIllI[8] = 0x43 ^ 0x4D ^ (0xC8 ^ 0xC3);
        c.lllIllIIIllI[9] = 112 + 144 - 145 + 83;
        c.lllIllIIIllI[10] = 0xE1 ^ 0xC5 ^ (0x76 ^ 0x55);
        c.lllIllIIIllI[11] = (0xC9 ^ 0xA2) + (0xA4 ^ 0xA0) - -(0x1D ^ 0x5C) + (0x1F ^ 0xC);
        c.lllIllIIIllI[12] = 0xA ^ 2;
    }

    private static String lIIIllIIllIllll(String lllllllllllllllIIllIlIIIlIlIllIl, String lllllllllllllllIIllIlIIIlIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIIlIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIIlIlIllll.init(lllIllIIIllI[4], lllllllllllllllIIllIlIIIlIllIIII);
            return new String(lllllllllllllllIIllIlIIIlIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIlIlIlllI) {
            lllllllllllllllIIllIlIIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private c(String string2, int n3) {
        this.childID = lllIllIIIllI[0];
        this.parentID = n3;
        this.teleportObject = string2;
    }

    public int h() {
        Objects.requireNonNull(this);
        0;
        return lllIllIIIllI[0];
    }

    private static void lIIIllIIlllIIII() {
        lllIllIIIlIl = new String[lllIllIIIllI[12]];
        c.lllIllIIIlIl[c.lllIllIIIllI[1]] = c."GRAVEYARD";
        c.lllIllIIIlIl[c.lllIllIIIllI[2]] = c."Graveyard Teleport";
        c.lllIllIIIlIl[c.lllIllIIIllI[4]] = c."TELEKENETIC";
        c.lllIllIIIlIl[c.lllIllIIIllI[5]] = c."Telekinetic Teleport";
        c.lllIllIIIlIl[c.lllIllIIIllI[7]] = c."ALCHEMY";
        c.lllIllIIIlIl[c.lllIllIIIllI[8]] = c."Alchemists Teleport";
        c.lllIllIIIlIl[c.lllIllIIIllI[0]] = c."ENCHANTMENT";
        c.lllIllIIIlIl[c.lllIllIIIllI[10]] = c."Enchanters Teleport";
    }

    private static boolean lIIIllIIlllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static String lIIIllIIllIllIl(String lllllllllllllllIIllIlIIIlIIllIII, String lllllllllllllllIIllIlIIIlIIlllII) {
        lllllllllllllllIIllIlIIIlIIllIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIlIIllIll = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIlIIllIlI = lllllllllllllllIIllIlIIIlIIlllII.toCharArray();
        int lllllllllllllllIIllIlIIIlIIllIIl = lllIllIIIllI[1];
        char[] lllllllllllllllIIllIlIIIlIIlIIll = lllllllllllllllIIllIlIIIlIIllIII.toCharArray();
        int lllllllllllllllIIllIlIIIlIIlIIlI = lllllllllllllllIIllIlIIIlIIlIIll.length;
        int lllllllllllllllIIllIlIIIlIIlIIIl = lllIllIIIllI[1];
        while (c.lIIIllIIlllIIlI(lllllllllllllllIIllIlIIIlIIlIIIl, lllllllllllllllIIllIlIIIlIIlIIlI)) {
            char lllllllllllllllIIllIlIIIlIIllllI = lllllllllllllllIIllIlIIIlIIlIIll[lllllllllllllllIIllIlIIIlIIlIIIl];
            lllllllllllllllIIllIlIIIlIIllIll.append((char)(lllllllllllllllIIllIlIIIlIIllllI ^ lllllllllllllllIIllIlIIIlIIllIlI[lllllllllllllllIIllIlIIIlIIllIIl % lllllllllllllllIIllIlIIIlIIllIlI.length]));
            0;
            ++lllllllllllllllIIllIlIIIlIIllIIl;
            ++lllllllllllllllIIllIlIIIlIIlIIIl;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIIlIIllIll);
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public String g() {
        return this.teleportObject;
    }

    public int f() {
        return this.parentID;
    }
}

