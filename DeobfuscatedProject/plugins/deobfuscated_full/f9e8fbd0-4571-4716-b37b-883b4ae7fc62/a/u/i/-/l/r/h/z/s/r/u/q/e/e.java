/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Predicates
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e ARDY_CLOAK;
    public static final /* synthetic */ /* enum */ e RUNE_POUCH;
    public static final /* synthetic */ /* enum */ e QUEST_CAPE;
    private final /* synthetic */ Predicate<Item> ids;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e CONS_CAPE;
    private static /* synthetic */ int[] lIllIlllIlllI;
    public static final /* synthetic */ /* enum */ e GLORY_AMULET;
    private static /* synthetic */ String[] lIllIlllIlIIl;
    public static final /* synthetic */ /* enum */ e HOUSE_TAB;

    private static String llIIlIIllIIlIII(String var2, String var13) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var4 = var13.toCharArray();
        int var8 = lIllIlllIlllI[0];
        char[] var1 = var2.toCharArray();
        int var9 = var1.length;
        int var10 = lIllIlllIlllI[0];
        while (e.llIIlIIllIlIllI(var10, var9)) {
            char var14 = var1[var10];
            var7.append((char)(var14 ^ var4[var8 % var4.length]));
            0;
            ++var8;
            ++var10;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void llIIlIIllIlIlIl() {
        lIllIlllIlllI = new int[25];
        e.lIllIlllIlllI[0] = (4 ^ 0x16) & ~(0x2E ^ 0x3C);
        e.lIllIlllIlllI[1] = 2;
        e.lIllIlllIlllI[2] = -(0xFFFFF97D & 0x5EAB) & (0xFFFFFEFF & 0x7F7D);
        e.lIllIlllIlllI[3] = 1;
        e.lIllIlllIlllI[4] = 0xFFFFFB0F & 0x37FC;
        e.lIllIlllIlllI[5] = 0xFFFF9FFD & 0x7F4F;
        e.lIllIlllIlllI[6] = -(0xFFFFFE41 & 0x4FBF) & (0xFFFFFFF7 & Short.MAX_VALUE);
        e.lIllIlllIlllI[7] = -(0xAE ^ 0x8F) & (0xFFFFEAF1 & 0x7FBF);
        e.lIllIlllIlllI[8] = 3;
        e.lIllIlllIlllI[9] = 17 + 25 - 6 + 116 ^ 100 + 69 - 117 + 104;
        e.lIllIlllIlllI[10] = 0xFFFFFB73 & 0x37CD;
        e.lIllIlllIlllI[11] = 0xFFFFFF52 & 0x33EF;
        e.lIllIlllIlllI[12] = 0xFFFFFF4B & 0x33F7;
        e.lIllIlllIlllI[13] = 0xFFFFBB74 & 0x77CF;
        e.lIllIlllIlllI[14] = 0x1E ^ 0x18;
        e.lIllIlllIlllI[15] = 0xFFFF97BE & 0x6EEB;
        e.lIllIlllIlllI[16] = -(0xFFFFDBF3 & 0x7C5D) & (0xFFFFDFFD & 0x7EFE);
        e.lIllIlllIlllI[17] = -(0xFFFFFB7B & 0x7C96) & (0xFFFFFFFF & 0x7EBF);
        e.lIllIlllIlllI[18] = 0xFFFF86BE & 0x7FF1;
        e.lIllIlllIlllI[19] = -(0x8C ^ 0xAF) & (0xFFFFAFFB & 0x7EEE);
        e.lIllIlllIlllI[20] = 0xC7 ^ 0xC2;
        e.lIllIlllIlllI[21] = 0xFFFFEFEF & 0x3EDA;
        e.lIllIlllIlllI[22] = -(0xFFFFF5EB & 0x1B57) & (0xFFFFF7FF & 0x3F7F);
        e.lIllIlllIlllI[23] = 0xFFFFE7BF & 0x3E7E;
        e.lIllIlllIlllI[24] = 0x54 ^ 0x5C;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static boolean llIIlIIllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.llIIlIIllIlIlIl();
        e.llIIlIIllIIlllI();
        int[] nArray = new int[lIllIlllIlllI[1]];
        nArray[e.lIllIlllIlllI[0]] = lIllIlllIlllI[2];
        nArray[e.lIllIlllIlllI[3]] = lIllIlllIlllI[4];
        QUEST_CAPE = new e(nArray);
        int[] nArray2 = new int[lIllIlllIlllI[3]];
        nArray2[e.lIllIlllIlllI[0]] = lIllIlllIlllI[5];
        HOUSE_TAB = new e(nArray2);
        int[] nArray3 = new int[lIllIlllIlllI[1]];
        nArray3[e.lIllIlllIlllI[0]] = lIllIlllIlllI[6];
        nArray3[e.lIllIlllIlllI[3]] = lIllIlllIlllI[7];
        RUNE_POUCH = new e(nArray3);
        int[] nArray4 = new int[lIllIlllIlllI[9]];
        nArray4[e.lIllIlllIlllI[0]] = lIllIlllIlllI[10];
        nArray4[e.lIllIlllIlllI[3]] = lIllIlllIlllI[11];
        nArray4[e.lIllIlllIlllI[1]] = lIllIlllIlllI[12];
        nArray4[e.lIllIlllIlllI[8]] = lIllIlllIlllI[13];
        ARDY_CLOAK = new e(nArray4);
        int[] nArray5 = new int[lIllIlllIlllI[14]];
        nArray5[e.lIllIlllIlllI[0]] = lIllIlllIlllI[15];
        nArray5[e.lIllIlllIlllI[3]] = lIllIlllIlllI[16];
        nArray5[e.lIllIlllIlllI[1]] = lIllIlllIlllI[17];
        nArray5[e.lIllIlllIlllI[8]] = lIllIlllIlllI[18];
        nArray5[e.lIllIlllIlllI[9]] = lIllIlllIlllI[19];
        nArray5[e.lIllIlllIlllI[20]] = lIllIlllIlllI[21];
        GLORY_AMULET = new e(nArray5);
        int[] nArray6 = new int[lIllIlllIlllI[1]];
        nArray6[e.lIllIlllIlllI[0]] = lIllIlllIlllI[22];
        nArray6[e.lIllIlllIlllI[3]] = lIllIlllIlllI[23];
        CONS_CAPE = new e(nArray6);
        e[] eArray = new e[lIllIlllIlllI[14]];
        eArray[e.lIllIlllIlllI[0]] = QUEST_CAPE;
        eArray[e.lIllIlllIlllI[3]] = HOUSE_TAB;
        eArray[e.lIllIlllIlllI[1]] = RUNE_POUCH;
        eArray[e.lIllIlllIlllI[8]] = ARDY_CLOAK;
        eArray[e.lIllIlllIlllI[9]] = GLORY_AMULET;
        eArray[e.lIllIlllIlllI[20]] = CONS_CAPE;
        $VALUES = eArray;
    }

    private static void llIIlIIllIIlllI() {
        lIllIlllIlIIl = new String[lIllIlllIlllI[14]];
        e.lIllIlllIlIIl[e.lIllIlllIlllI[0]] = e."QUEST_CAPE";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[3]] = e."HOUSE_TAB";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[1]] = e."RUNE_POUCH";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[8]] = e."ARDY_CLOAK";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[9]] = e."GLORY_AMULET";
        e.lIllIlllIlIIl[e.lIllIlllIlllI[20]] = e."CONS_CAPE";
    }

    private static String llIIlIIllIIlIIl(String var12, String var3) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIllIlllIlllI[24]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIllIlllIlllI[1], var11);
            return new String(var5.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> p() {
        return this.ids;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    private e(int ... nArray) {
        this.ids = Predicates.ids((int[])nArray);
    }
}

