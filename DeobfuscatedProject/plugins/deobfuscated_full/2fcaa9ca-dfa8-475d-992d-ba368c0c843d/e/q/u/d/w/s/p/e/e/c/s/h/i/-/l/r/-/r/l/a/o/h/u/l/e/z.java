/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

public final class z
extends Enum<z> {
    public static final /* synthetic */ /* enum */ z LV5_ENCHANT;
    public static final /* synthetic */ /* enum */ z NONE;
    public /* synthetic */ Spell spell;
    public static final /* synthetic */ /* enum */ z LV4_ENCHANT;
    public static final /* synthetic */ /* enum */ z LV3_ENCHANT;
    public static final /* synthetic */ /* enum */ z LV2_ENCHANT;
    public static final /* synthetic */ /* enum */ z LV1_ENCHANT;
    public static final /* synthetic */ /* enum */ z LV6_ENCHANT;
    private static final /* synthetic */ z[] $VALUES;
    private static /* synthetic */ String[] lllIIlIIllII;
    private static /* synthetic */ int[] lllIIlIIllIl;

    public static z[] values() {
        return (z[])$VALUES.clone();
    }

    private static void lIIIlIIlllllllI() {
        lllIIlIIllIl = new int[9];
        z.lllIIlIIllIl[0] = (0xED ^ 0xB4) & ~(0xDE ^ 0x87);
        z.lllIIlIIllIl[1] = 1;
        z.lllIIlIIllIl[2] = 2;
        z.lllIIlIIllIl[3] = 3;
        z.lllIIlIIllIl[4] = 160 + 170 - 228 + 92 ^ 94 + 29 - -68 + 7;
        z.lllIIlIIllIl[5] = 39 + 70 - 12 + 64 ^ 115 + 130 - 198 + 117;
        z.lllIIlIIllIl[6] = 0xDA ^ 0xBA ^ (0x74 ^ 0x12);
        z.lllIIlIIllIl[7] = 0x88 ^ 0x8F;
        z.lllIIlIIllIl[8] = 139 + 167 - 117 + 17 ^ 110 + 102 - 84 + 70;
    }

    private z(Spell spell) {
        this.spell = spell;
    }

    private static boolean lIIIlIIllllllll(int n2, int n3) {
        return n2 < n3;
    }

    public static z valueOf(String string) {
        return Enum.valueOf(z.class, string);
    }

    private static String lIIIlIIlllllIlI(String var5, String var14) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lllIIlIIllIl[8]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lllIIlIIllIl[2], var4);
            return new String(var13.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIllllllII(String var15, String var10) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var1 = var10.toCharArray();
        int var16 = lllIIlIIllIl[0];
        char[] var12 = var15.toCharArray();
        int var11 = var12.length;
        int var7 = lllIIlIIllIl[0];
        while (z.lIIIlIIllllllll(var7, var11)) {
            char var19 = var12[var7];
            var2.append((char)(var19 ^ var1[var16 % var1.length]));
            0;
            ++var16;
            ++var7;
            0;
            if ((0xA ^ 0xE) > 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static String lIIIlIIlllllIll(String var8, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lllIIlIIllIl[2], var9);
            return new String(var18.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIllllllIl() {
        lllIIlIIllII = new String[lllIIlIIllIl[7]];
        z.lllIIlIIllII[z.lllIIlIIllIl[0]] = z."NONE";
        z.lllIIlIIllII[z.lllIIlIIllIl[1]] = z."LV1_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[2]] = z."LV2_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[3]] = z."LV3_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[4]] = z."LV4_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[5]] = z."LV5_ENCHANT";
        z.lllIIlIIllII[z.lllIIlIIllIl[6]] = z."LV6_ENCHANT";
    }

    static {
        z.lIIIlIIlllllllI();
        z.lIIIlIIllllllIl();
        NONE = new z(null);
        LV1_ENCHANT = new z((Spell)SpellBook.Standard.LVL_1_ENCHANT);
        LV2_ENCHANT = new z((Spell)SpellBook.Standard.LVL_2_ENCHANT);
        LV3_ENCHANT = new z((Spell)SpellBook.Standard.LVL_3_ENCHANT);
        LV4_ENCHANT = new z((Spell)SpellBook.Standard.LVL_4_ENCHANT);
        LV5_ENCHANT = new z((Spell)SpellBook.Standard.LVL_5_ENCHANT);
        LV6_ENCHANT = new z((Spell)SpellBook.Standard.LVL_6_ENCHANT);
        z[] zArray = new z[lllIIlIIllIl[7]];
        zArray[z.lllIIlIIllIl[0]] = NONE;
        zArray[z.lllIIlIIllIl[1]] = LV1_ENCHANT;
        zArray[z.lllIIlIIllIl[2]] = LV2_ENCHANT;
        zArray[z.lllIIlIIllIl[3]] = LV3_ENCHANT;
        zArray[z.lllIIlIIllIl[4]] = LV4_ENCHANT;
        zArray[z.lllIIlIIllIl[5]] = LV5_ENCHANT;
        zArray[z.lllIIlIIllIl[6]] = LV6_ENCHANT;
        $VALUES = zArray;
    }
}

