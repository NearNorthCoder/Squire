/*
 * Decompiled with CFR 0.152.
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class DEnum
extends Enum<d> {
    public static final /* synthetic */ /* enum */ d DONE_EXPLORING_EVERYTHING;
    public static final /* synthetic */ /* enum */ d EXTRA_FOOD_EXPLORE;
    public static final /* synthetic */ /* enum */ d OUTSIDE;
    public static final /* synthetic */ /* enum */ d FIRST_ROTATION_EXPLORE;
    public static final /* synthetic */ /* enum */ d GIVE_UP;
    private static /* synthetic */ int[] llIlIIIIIlll;
    public static final /* synthetic */ /* enum */ d BOSS_FIGHT;
    public static final /* synthetic */ /* enum */ d PREPARE_BOSS_FIGHT;
    public static final /* synthetic */ /* enum */ d FIRST_ROTATION_CREATE;
    public static final /* synthetic */ /* enum */ d DEMI_BOSS_EXPLORE;
    private static /* synthetic */ String[] llIlIIIIIlIl;
    public static final /* synthetic */ /* enum */ d AFK;
    public static final /* synthetic */ /* enum */ d CREATING_T3_STAFF;
    public static final /* synthetic */ /* enum */ d WEAPON_FRAME_EXPLORE;
    private static final /* synthetic */ d[] $VALUES;

    public String toString() {
        String string = super.toString();
        return string.charAt(llIlIIIIIlll[0]) + string.substring(llIlIIIIIlll[1]).replaceAll(llIlIIIIIlIl[llIlIIIIIlll[0]], llIlIIIIIlIl[llIlIIIIIlll[1]]).trim().toLowerCase();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static String lIIIIIIIlIllllI(String var17, String var19) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llIlIIIIIlll[2], var8);
            return new String(var7.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIlIlllll() {
        llIlIIIIIlIl = new String[llIlIIIIIlll[14]];
        d.llIlIIIIIlIl[d.llIlIIIIIlll[0]] = d."_";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[1]] = d." ";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[2]] = d."OUTSIDE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[3]] = d."GIVE_UP";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[4]] = d."FIRST_ROTATION_EXPLORE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[5]] = d."FIRST_ROTATION_CREATE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[6]] = d."DEMI_BOSS_EXPLORE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[7]] = d."WEAPON_FRAME_EXPLORE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[8]] = d."PREPARE_BOSS_FIGHT";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[9]] = d."EXTRA_FOOD_EXPLORE";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[10]] = d."BOSS_FIGHT";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[11]] = d."AFK";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[12]] = d."DONE_EXPLORING_EVERYTHING";
        d.llIlIIIIIlIl[d.llIlIIIIIlll[13]] = d."CREATING_T3_STAFF";
    }

    private static boolean lIIIIIIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIIIlIlllII(String var16, String var3) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var14 = var3.toCharArray();
        int var5 = llIlIIIIIlll[0];
        char[] var2 = var16.toCharArray();
        int var4 = var2.length;
        int var1 = llIlIIIIIlll[0];
        while (d.lIIIIIIIllIIlIl(var1, var4)) {
            char var10 = var2[var1];
            var12.append((char)(var10 ^ var14[var5 % var14.length]));
            0;
            ++var5;
            ++var1;
            0;
            if (-(0x6C ^ 0x69) < 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void lIIIIIIIllIIlII() {
        llIlIIIIIlll = new int[15];
        d.llIlIIIIIlll[0] = (0xB9 ^ 0x92 ^ 51 + 37 - 23 + 62) & (82 + 33 - -106 + 24 ^ 92 + 108 - 51 + 12 ^ -1);
        d.llIlIIIIIlll[1] = 1;
        d.llIlIIIIIlll[2] = 2;
        d.llIlIIIIIlll[3] = 3;
        d.llIlIIIIIlll[4] = 1 ^ (0x58 ^ 0x5D);
        d.llIlIIIIIlll[5] = 0x52 ^ 0x57;
        d.llIlIIIIIlll[6] = 0xD0 ^ 0x98 ^ (0xDD ^ 0x93);
        d.llIlIIIIIlll[7] = 0x68 ^ 0x6F;
        d.llIlIIIIIlll[8] = 0x15 ^ 0x1D;
        d.llIlIIIIIlll[9] = 0x15 ^ 0x48 ^ (0xE2 ^ 0xB6);
        d.llIlIIIIIlll[10] = 0x57 ^ 0x3C ^ (0x5B ^ 0x3A);
        d.llIlIIIIIlll[11] = 0x93 ^ 0x98;
        d.llIlIIIIIlll[12] = 153 + 73 - 138 + 79 ^ 91 + 3 - -43 + 34;
        d.llIlIIIIIlll[13] = 0x5E ^ 0x35 ^ (0xE4 ^ 0x82);
        d.llIlIIIIIlll[14] = 0x4F ^ 0x41;
    }

    static {
        d.lIIIIIIIllIIlII();
        d.lIIIIIIIlIlllll();
        OUTSIDE = new d();
        GIVE_UP = new d();
        FIRST_ROTATION_EXPLORE = new d();
        FIRST_ROTATION_CREATE = new d();
        DEMI_BOSS_EXPLORE = new d();
        WEAPON_FRAME_EXPLORE = new d();
        PREPARE_BOSS_FIGHT = new d();
        EXTRA_FOOD_EXPLORE = new d();
        BOSS_FIGHT = new d();
        AFK = new d();
        DONE_EXPLORING_EVERYTHING = new d();
        CREATING_T3_STAFF = new d();
        d[] dArray = new d[llIlIIIIIlll[12]];
        dArray[d.llIlIIIIIlll[0]] = OUTSIDE;
        dArray[d.llIlIIIIIlll[1]] = GIVE_UP;
        dArray[d.llIlIIIIIlll[2]] = FIRST_ROTATION_EXPLORE;
        dArray[d.llIlIIIIIlll[3]] = FIRST_ROTATION_CREATE;
        dArray[d.llIlIIIIIlll[4]] = DEMI_BOSS_EXPLORE;
        dArray[d.llIlIIIIIlll[5]] = WEAPON_FRAME_EXPLORE;
        dArray[d.llIlIIIIIlll[6]] = PREPARE_BOSS_FIGHT;
        dArray[d.llIlIIIIIlll[7]] = EXTRA_FOOD_EXPLORE;
        dArray[d.llIlIIIIIlll[8]] = BOSS_FIGHT;
        dArray[d.llIlIIIIIlll[9]] = AFK;
        dArray[d.llIlIIIIIlll[10]] = DONE_EXPLORING_EVERYTHING;
        dArray[d.llIlIIIIIlll[11]] = CREATING_T3_STAFF;
        $VALUES = dArray;
    }

    private static String lIIIIIIIlIlllIl(String var18, String var13) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIlIIIIIlll[8]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(llIlIIIIIlll[2], var11);
            return new String(var9.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }
}

