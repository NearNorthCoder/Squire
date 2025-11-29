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

    private static String lIIIlIlllIllIII(String var7, String var1) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var3 = var1.toCharArray();
        int var10 = lllIlIIllIll[0];
        char[] var8 = var7.toCharArray();
        int var12 = var8.length;
        int var6 = lllIlIIllIll[0];
        while (h.lIIIlIlllIlllII(var6, var12)) {
            char var2 = var8[var6];
            var4.append((char)(var2 ^ var3[var10 % var3.length]));
            0;
            ++var10;
            ++var6;
            0;
            if (((0x71 ^ 0x13 ^ (0x3D ^ 0x79)) & (48 + 51 - 16 + 58 ^ 125 + 42 - 49 + 53 ^ -1)) != 3) continue;
            return null;
        }
        return String.valueOf(var4);
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

    private static String lIIIlIlllIllIIl(String var9, String var5) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllIlIIllIll[7]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lllIlIIllIll[2], var14);
            return new String(var13.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
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
        h.lllIlIIllIll[1] = 1;
        h.lllIlIIllIll[2] = 2;
        h.lllIlIIllIll[3] = 3;
        h.lllIlIIllIll[4] = 0x47 ^ 0x43;
        h.lllIlIIllIll[5] = 0x17 ^ 0xB ^ (0x7C ^ 0x65);
        h.lllIlIIllIll[6] = 0x68 ^ 0x7D ^ (0x6D ^ 0x7E);
        h.lllIlIIllIll[7] = 0x29 ^ 0x21;
    }

    private static void lIIIlIlllIllIlI() {
        lllIlIIllIlI = new String[lllIlIIllIll[6]];
        h.lllIlIIllIlI[h.lllIlIIllIll[0]] = h."LVL1_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[1]] = h."LVL2_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[2]] = h."LVL3_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[3]] = h."LVL4_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[4]] = h."LVL5_ENCHANT";
        h.lllIlIIllIlI[h.lllIlIIllIll[5]] = h."LVL6_ENCHANT";
    }
}

