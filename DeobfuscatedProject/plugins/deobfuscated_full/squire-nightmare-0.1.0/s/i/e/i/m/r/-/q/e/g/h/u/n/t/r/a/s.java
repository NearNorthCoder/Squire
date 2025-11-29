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
        s.lllIlllllllI[1] = 1;
        s.lllIlllllllI[2] = 2;
        s.lllIlllllllI[3] = 3;
        s.lllIlllllllI[4] = 28 + 23 - 36 + 126 ^ 10 + 97 - 73 + 103;
        s.lllIlllllllI[5] = 0x5B ^ 0x5E;
        s.lllIlllllllI[6] = 0xB3 ^ 0xB5;
        s.lllIlllllllI[7] = 0x57 ^ 0x50;
        s.lllIlllllllI[8] = 0x4C ^ 0x44;
    }

    private static String lIIIlllIIllIIlI(String var1, String var8) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lllIlllllllI[8]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lllIlllllllI[2], var3);
            return new String(var12.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIllIIII(String var11, String var10) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var4 = var10.toCharArray();
        int var17 = lllIlllllllI[0];
        char[] var5 = var11.toCharArray();
        int var6 = var5.length;
        int var13 = lllIlllllllI[0];
        while (s.lIIIlllIIlllIll(var13, var6)) {
            char var18 = var5[var13];
            var14.append((char)(var18 ^ var4[var17 % var4.length]));
            0;
            ++var17;
            ++var13;
            0;
            if (((151 + 71 - 79 + 57 ^ 135 + 31 - 133 + 115) & (133 + 187 - 128 + 8 ^ 108 + 143 - 147 + 44 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var14);
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
        s.lllIlllllIll[s.lllIlllllllI[0]] = s."FIRE_SURGE";
        s.lllIlllllIll[s.lllIlllllllI[1]] = s."Fire Surge";
        s.lllIlllllIll[s.lllIlllllllI[2]] = s."FIRE_WAVE";
        s.lllIlllllIll[s.lllIlllllllI[3]] = s."Fire Wave";
        s.lllIlllllIll[s.lllIlllllllI[4]] = s."FIRE_BLAST";
        s.lllIlllllIll[s.lllIlllllllI[5]] = s."Fire Blast";
        s.lllIlllllIll[s.lllIlllllllI[6]] = s."FIRE_BOLT";
        s.lllIlllllIll[s.lllIlllllllI[7]] = s."Fire Bolt";
    }

    private static boolean lIIIlllIIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlllIIlIllll(String var2, String var7) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lllIlllllllI[2], var15);
            return new String(var16.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
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

