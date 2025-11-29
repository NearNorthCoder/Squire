/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;

public final class DEnum
extends Enum<d> {
    private final /* synthetic */ int itemID;
    private final /* synthetic */ Predicate<Item> test;
    public static final /* synthetic */ /* enum */ d ANTIPOISON;
    public static final /* synthetic */ /* enum */ d SUPERANTIPOISON;
    public static final /* synthetic */ /* enum */ d ANTIDOTE;
    private static /* synthetic */ String[] lIIllIIIIIllI;
    private static /* synthetic */ int[] lIIllIIIIIlll;
    private static final /* synthetic */ d[] $VALUES;

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static String lIlIlllIlIIIlll(String var4, String var5) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIIllIIIIIlll[2], var14);
            return new String(var19.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIlIIlIlI() {
        lIIllIIIIIllI = new String[lIIllIIIIIlll[9]];
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[0]] = d."Antidote+";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[1]] = d."Superantipoison";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[2]] = d."Antipoison";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[3]] = d."ANTIPOISON";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[5]] = d."SUPERANTIPOISON";
        d.lIIllIIIIIllI[d.lIIllIIIIIlll[7]] = d."ANTIDOTE";
    }

    private static String lIlIlllIlIIlIIl(String var6, String var13) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var1 = var13.toCharArray();
        int var16 = lIIllIIIIIlll[0];
        char[] var18 = var6.toCharArray();
        int var9 = var18.length;
        int var15 = lIIllIIIIIlll[0];
        while (d.lIlIlllIlIIllII(var15, var9)) {
            char var7 = var18[var15];
            var8.append((char)(var7 ^ var1[var16 % var1.length]));
            0;
            ++var16;
            ++var15;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    static {
        d.lIlIlllIlIIlIll();
        d.lIlIlllIlIIlIlI();
        ANTIPOISON = new d(item -> item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[2]]), lIIllIIIIIlll[4]);
        SUPERANTIPOISON = new d(item -> item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[1]]), lIIllIIIIIlll[6]);
        ANTIDOTE = new d(item -> item.getName().startsWith(lIIllIIIIIllI[lIIllIIIIIlll[0]]), lIIllIIIIIlll[8]);
        d[] dArray = new d[lIIllIIIIIlll[3]];
        dArray[d.lIIllIIIIIlll[0]] = ANTIPOISON;
        dArray[d.lIIllIIIIIlll[1]] = SUPERANTIPOISON;
        dArray[d.lIIllIIIIIlll[2]] = ANTIDOTE;
        $VALUES = dArray;
    }

    private d(Predicate<Item> predicate, int n3) {
        this.test = predicate;
        this.itemID = n3;
    }

    private static void lIlIlllIlIIlIll() {
        lIIllIIIIIlll = new int[11];
        d.lIIllIIIIIlll[0] = (0xCF ^ 0x83 ^ (0x20 ^ 0x64)) & (125 + 57 - 119 + 79 ^ 37 + 50 - -22 + 25 ^ -1);
        d.lIIllIIIIIlll[1] = 1;
        d.lIIllIIIIIlll[2] = 2;
        d.lIIllIIIIIlll[3] = 3;
        d.lIIllIIIIIlll[4] = -(0xFFFF950A & 0x7EF7) & (0xFFFFBFAF & 0x5DDF);
        d.lIIllIIIIIlll[5] = 0x53 ^ 0x54 ^ 3;
        d.lIIllIIIIIlll[6] = -(0xFFFFDD07 & 0x76FD) & (0xFFFFDFBE & 0x7DD5);
        d.lIIllIIIIIlll[7] = 0xAD ^ 0xA8;
        d.lIIllIIIIIlll[8] = 0xFFFFDF77 & 0x37BF;
        d.lIIllIIIIIlll[9] = 0x57 ^ 0x21 ^ (0x46 ^ 0x36);
        d.lIIllIIIIIlll[10] = 8 ^ 0;
    }

    private static boolean lIlIlllIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlllIlIIlIII(String var2, String var3) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIllIIIIIlll[10]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIIllIIIIIlll[2], var17);
            return new String(var11.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public Predicate<Item> u() {
        return this.test;
    }

    public int v() {
        return this.itemID;
    }
}

