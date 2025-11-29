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

public final class d
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

    private static String lIIIIIIIlIllllI(String lllllllllllllllIlIIIlllIIIIlIIll, String lllllllllllllllIlIIIlllIIIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllIIIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlllIIIIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlllIIIIlIlIl.init(llIlIIIIIlll[2], lllllllllllllllIlIIIlllIIIIlIllI);
            return new String(lllllllllllllllIlIIIlllIIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIlllIIIIlIlII) {
            lllllllllllllllIlIIIlllIIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIlIlllll() {
        llIlIIIIIlIl = new String[llIlIIIIIlll[14]];
        d.llIlIIIIIlIl[d.llIlIIIIIlll[0]] = d.lIIIIIIIlIlllII("Dg==", "Qgjke");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[1]] = d.lIIIIIIIlIlllIl("l3rwPj8pmKw=", "JRegx");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[2]] = d.lIIIIIIIlIllllI("WSgLCEiUGiw=", "YRYCu");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[3]] = d.lIIIIIIIlIllllI("DEnXIVit1cs=", "LaFPs");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[4]] = d.lIIIIIIIlIllllI("ygIRRHXtF+toH6gb3g6xfXddE9SGWSTt", "OJVbO");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[5]] = d.lIIIIIIIlIlllII("EzArGzIKKzYcJwEwNgY5Fis8CTIQ", "UyyHf");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[6]] = d.lIIIIIIIlIlllII("PT8cKjA7NQIwMDwiAS8gKz8=", "yzQco");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[7]] = d.lIIIIIIIlIllllI("YsYw7xHkLe/L4KbuZsKqeJ+9BfCJqBZF", "natqp");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[8]] = d.lIIIIIIIlIlllII("FBkkAjcWDj4QORcYPhQ/AwM1", "DKaRv");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[9]] = d.lIIIIIIIlIllllI("7RmvYgQzxvRysbMiOsjTXLVNI12DLkb5", "cYLiK");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[10]] = d.lIIIIIIIlIlllIl("slNoPWJVmHmyFO47seec2g==", "KUFyD");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[11]] = d.lIIIIIIIlIlllIl("iLvofsNkqKM=", "bpZvZ");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[12]] = d.lIIIIIIIlIlllIl("85IeTTvgC4vbrdMByJefyvK3jm6b/bqPIfeazaN4MQw=", "CbFvs");
        d.llIlIIIIIlIl[d.llIlIIIIIlll[13]] = d.lIIIIIIIlIlllIl("Jv/7+vCPLp3EEeWMPSfdHbPgYWGioQNf", "zGdwP");
    }

    private static boolean lIIIIIIIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIIIlIlllII(String lllllllllllllllIlIIIlllIIIlIIIll, String lllllllllllllllIlIIIlllIIIlIIIlI) {
        lllllllllllllllIlIIIlllIIIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIlllIIIlIIllI = new StringBuilder();
        char[] lllllllllllllllIlIIIlllIIIlIIlIl = lllllllllllllllIlIIIlllIIIlIIIlI.toCharArray();
        int lllllllllllllllIlIIIlllIIIlIIlII = llIlIIIIIlll[0];
        char[] lllllllllllllllIlIIIlllIIIIllllI = lllllllllllllllIlIIIlllIIIlIIIll.toCharArray();
        int lllllllllllllllIlIIIlllIIIIlllIl = lllllllllllllllIlIIIlllIIIIllllI.length;
        int lllllllllllllllIlIIIlllIIIIlllII = llIlIIIIIlll[0];
        while (d.lIIIIIIIllIIlIl(lllllllllllllllIlIIIlllIIIIlllII, lllllllllllllllIlIIIlllIIIIlllIl)) {
            char lllllllllllllllIlIIIlllIIIlIlIIl = lllllllllllllllIlIIIlllIIIIllllI[lllllllllllllllIlIIIlllIIIIlllII];
            lllllllllllllllIlIIIlllIIIlIIllI.append((char)(lllllllllllllllIlIIIlllIIIlIlIIl ^ lllllllllllllllIlIIIlllIIIlIIlIl[lllllllllllllllIlIIIlllIIIlIIlII % lllllllllllllllIlIIIlllIIIlIIlIl.length]));
            "".length();
            ++lllllllllllllllIlIIIlllIIIlIIlII;
            ++lllllllllllllllIlIIIlllIIIIlllII;
            "".length();
            if (-(0x6C ^ 0x69) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIlllIIIlIIllI);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void lIIIIIIIllIIlII() {
        llIlIIIIIlll = new int[15];
        d.llIlIIIIIlll[0] = (0xB9 ^ 0x92 ^ 51 + 37 - 23 + 62) & (82 + 33 - -106 + 24 ^ 92 + 108 - 51 + 12 ^ -" ".length());
        d.llIlIIIIIlll[1] = " ".length();
        d.llIlIIIIIlll[2] = "  ".length();
        d.llIlIIIIIlll[3] = "   ".length();
        d.llIlIIIIIlll[4] = " ".length() ^ (0x58 ^ 0x5D);
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

    private static String lIIIIIIIlIlllIl(String lllllllllllllllIlIIIlllIIIllIllI, String lllllllllllllllIlIIIlllIIIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllIIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllIIIllIlIl.getBytes(StandardCharsets.UTF_8)), llIlIIIIIlll[8]), "DES");
            Cipher lllllllllllllllIlIIIlllIIIlllIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIlllIIIlllIlI.init(llIlIIIIIlll[2], lllllllllllllllIlIIIlllIIIlllIll);
            return new String(lllllllllllllllIlIIIlllIIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllIIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIlllIIIlllIIl) {
            lllllllllllllllIlIIIlllIIIlllIIl.printStackTrace();
            return null;
        }
    }
}

