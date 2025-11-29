/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class s
extends Enum<s> {
    public static final /* synthetic */ /* enum */ s FIRE_WAVE;
    private final /* synthetic */ Spell spell;
    private final /* synthetic */ String name;
    private static final /* synthetic */ s[] $VALUES;
    public static final /* synthetic */ /* enum */ s FIRE_SURGE;
    public static final /* synthetic */ /* enum */ s FIRE_BOLT;
    public static final /* synthetic */ /* enum */ s FIRE_BLAST;
    private static /* synthetic */ int[] lllIlllllllI;
    private static /* synthetic */ String[] lllIlllllIll;

    private static void lIIIlllIIlllIlI() {
        lllIlllllllI = new int[9];
        s.lllIlllllllI[0] = (0x5E ^ 0x4E) & ~(3 ^ 0x13);
        s.lllIlllllllI[1] = " ".length();
        s.lllIlllllllI[2] = "  ".length();
        s.lllIlllllllI[3] = "   ".length();
        s.lllIlllllllI[4] = 28 + 23 - 36 + 126 ^ 10 + 97 - 73 + 103;
        s.lllIlllllllI[5] = 0x5B ^ 0x5E;
        s.lllIlllllllI[6] = 0xB3 ^ 0xB5;
        s.lllIlllllllI[7] = 0x57 ^ 0x50;
        s.lllIlllllllI[8] = 0x4C ^ 0x44;
    }

    private static String lIIIlllIIllIIlI(String lllllllllllllllIIllIIIlIIIlIllII, String lllllllllllllllIIllIIIlIIIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIlIIIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), lllIlllllllI[8]), "DES");
            Cipher lllllllllllllllIIllIIIlIIIlIlllI = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIlIIIlIlllI.init(lllIlllllllI[2], lllllllllllllllIIllIIIlIIIlIllll);
            return new String(lllllllllllllllIIllIIIlIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIlIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIlIIIlIllIl) {
            lllllllllllllllIIllIIIlIIIlIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIllIIII(String lllllllllllllllIIllIIIlIIIllllII, String lllllllllllllllIIllIIIlIIIlllIll) {
        lllllllllllllllIIllIIIlIIIllllII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIIlIIIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIIlIIIllllll = new StringBuilder();
        char[] lllllllllllllllIIllIIIlIIIlllllI = lllllllllllllllIIllIIIlIIIlllIll.toCharArray();
        int lllllllllllllllIIllIIIlIIIllllIl = lllIlllllllI[0];
        char[] lllllllllllllllIIllIIIlIIIllIlll = lllllllllllllllIIllIIIlIIIllllII.toCharArray();
        int lllllllllllllllIIllIIIlIIIllIllI = lllllllllllllllIIllIIIlIIIllIlll.length;
        int lllllllllllllllIIllIIIlIIIllIlIl = lllIlllllllI[0];
        while (s.lIIIlllIIlllIll(lllllllllllllllIIllIIIlIIIllIlIl, lllllllllllllllIIllIIIlIIIllIllI)) {
            char lllllllllllllllIIllIIIlIIlIIIIlI = lllllllllllllllIIllIIIlIIIllIlll[lllllllllllllllIIllIIIlIIIllIlIl];
            lllllllllllllllIIllIIIlIIIllllll.append((char)(lllllllllllllllIIllIIIlIIlIIIIlI ^ lllllllllllllllIIllIIIlIIIlllllI[lllllllllllllllIIllIIIlIIIllllIl % lllllllllllllllIIllIIIlIIIlllllI.length]));
            "".length();
            ++lllllllllllllllIIllIIIlIIIllllIl;
            ++lllllllllllllllIIllIIIlIIIllIlIl;
            "".length();
            if (((151 + 71 - 79 + 57 ^ 135 + 31 - 133 + 115) & (133 + 187 - 128 + 8 ^ 108 + 143 - 147 + 44 ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIIlIIIllllll);
    }

    static {
        s.lIIIlllIIlllIlI();
        s.lIIIlllIIlllIIl();
        FIRE_SURGE = new s((Spell)SpellBook.Standard.FIRE_SURGE, lllIlllllIll[lllIlllllllI[1]]);
        FIRE_WAVE = new s((Spell)SpellBook.Standard.FIRE_WAVE, lllIlllllIll[lllIlllllllI[3]]);
        FIRE_BLAST = new s((Spell)SpellBook.Standard.FIRE_BLAST, lllIlllllIll[lllIlllllllI[5]]);
        FIRE_BOLT = new s((Spell)SpellBook.Standard.FIRE_BOLT, lllIlllllIll[lllIlllllllI[7]]);
        s[] sArray = new s[lllIlllllllI[4]];
        sArray[s.lllIlllllllI[0]] = FIRE_SURGE;
        sArray[s.lllIlllllllI[1]] = FIRE_WAVE;
        sArray[s.lllIlllllllI[2]] = FIRE_BLAST;
        sArray[s.lllIlllllllI[3]] = FIRE_BOLT;
        $VALUES = sArray;
    }

    public String bG() {
        return this.name;
    }

    private static void lIIIlllIIlllIIl() {
        lllIlllllIll = new String[lllIlllllllI[8]];
        s.lllIlllllIll[s.lllIlllllllI[0]] = s.lIIIlllIIlIllll("i9V75uYW819jIjnD0/LEjA==", "HsfCK");
        s.lllIlllllIll[s.lllIlllllllI[1]] = s.lIIIlllIIllIIII("LzAqCEE6LCoKBA==", "iYXma");
        s.lllIlllllIll[s.lllIlllllllI[2]] = s.lIIIlllIIlIllll("Dx3W7KpD54y/H1VB67ZjYw==", "dzmVW");
        s.lllIlllllIll[s.lllIlllllllI[3]] = s.lIIIlllIIllIIlI("g4EqsuFCR2BdwgKAfD7pTw==", "DexaP");
        s.lllIlllllIll[s.lllIlllllllI[4]] = s.lIIIlllIIlIllll("0QYQPrmj4TDP+x4PF0sCWA==", "pjCFb");
        s.lllIlllllIll[s.lllIlllllllI[5]] = s.lIIIlllIIlIllll("Q0bMFsaf7x2YLG7qfJ5aAg==", "ujHGo");
        s.lllIlllllIll[s.lllIlllllllI[6]] = s.lIIIlllIIlIllll("3Ii5U6zsUuRtNyhiqB1+7Q==", "Xzzud");
        s.lllIlllllIll[s.lllIlllllllI[7]] = s.lIIIlllIIllIIII("HC8ZJFkYKQc1", "ZFkAy");
    }

    private static boolean lIIIlllIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlllIIlIllll(String lllllllllllllllIIllIIIlIIIIlllll, String lllllllllllllllIIllIIIlIIIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIlIIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIlIIIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIlIIIlIIIIl.init(lllIlllllllI[2], lllllllllllllllIIllIIIlIIIlIIIlI);
            return new String(lllllllllllllllIIllIIIlIIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIlIIIlIIIII) {
            lllllllllllllllIIllIIIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }

    public Spell bF() {
        return this.spell;
    }

    private s(Spell spell, String string2) {
        this.spell = spell;
        this.name = string2;
    }
}

