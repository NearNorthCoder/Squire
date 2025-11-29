/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class N
extends Enum<N> {
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ N SCAVENGERS;
    public static final /* synthetic */ /* enum */ N TEKTON;
    public static final /* synthetic */ /* enum */ N MUTTADILES;
    public static final /* synthetic */ int ROOM_MAX_SIZE;
    public static final /* synthetic */ /* enum */ N SHAMANS;
    public static final /* synthetic */ /* enum */ N TIGHTROPE;
    public static final /* synthetic */ /* enum */ N THIEVING;
    private static /* synthetic */ String[] lIlIlIIIIlll;
    public static final /* synthetic */ /* enum */ N VESPULA;
    public static final /* synthetic */ /* enum */ N EMPTY;
    public static final /* synthetic */ /* enum */ N GUARDIANS;
    public static final /* synthetic */ /* enum */ N VASA;
    public static final /* synthetic */ /* enum */ N END;
    public static final /* synthetic */ /* enum */ N CRABS;
    public static final /* synthetic */ /* enum */ N MYSTICS;
    private final /* synthetic */ P type;
    public static final /* synthetic */ /* enum */ N ICE_DEMON;
    public static final /* synthetic */ /* enum */ N UNKNOWN_COMBAT;
    public static final /* synthetic */ /* enum */ N FARMING;
    public static final /* synthetic */ /* enum */ N VANGUARDS;
    private static /* synthetic */ int[] lIlIlIIIlIII;
    public static final /* synthetic */ /* enum */ N UNKNOWN_PUZZLE;
    public static final /* synthetic */ /* enum */ N START;
    private static final /* synthetic */ N[] $VALUES;

    private static String llIllIllllllll(String lllllllllllllllIllIlIlIIllIlIIIl, String lllllllllllllllIllIlIlIIllIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlIIllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIllIlIIII.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIII[9]), "DES");
            Cipher lllllllllllllllIllIlIlIIllIlIIll = Cipher.getInstance("DES");
            lllllllllllllllIllIlIlIIllIlIIll.init(lIlIlIIIlIII[3], lllllllllllllllIllIlIlIIllIlIlII);
            return new String(lllllllllllllllIllIlIlIIllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIlIIllIlIIlI) {
            lllllllllllllllIllIlIlIIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static void llIlllIIIIIIII() {
        lIlIlIIIIlll = new String[lIlIlIIIlIII[38]];
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[1]] = N."START";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[2]] = N."Start";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[3]] = N."END";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[4]] = N."End";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[5]] = N."SCAVENGERS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[6]] = N."Scavengers";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[7]] = N."FARMING";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[8]] = N."Farming";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[9]] = N."EMPTY";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[10]] = N."Empty";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[11]] = N."TEKTON";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[12]] = N."Tekton";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[13]] = N."MUTTADILES";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[14]] = N."Muttadiles";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[15]] = N."GUARDIANS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[16]] = N."Guardians";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[17]] = N."VESPULA";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[18]] = N."Vespula";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[19]] = N."SHAMANS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[20]] = N."Shamans";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[21]] = N."VASA";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[22]] = N."Vasa";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[23]] = N."VANGUARDS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[24]] = N."Vanguards";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[25]] = N."MYSTICS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[26]] = N."Mystics";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[27]] = N."UNKNOWN_COMBAT";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[28]] = N."Unknown (combat)";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[29]] = N."CRABS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[30]] = N."Crabs";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[31]] = N."ICE_DEMON";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[32]] = N."Ice Demon";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[0]] = N."TIGHTROPE";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[33]] = N."Tightrope";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[34]] = N."THIEVING";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[35]] = N."Thieving";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[36]] = N."UNKNOWN_PUZZLE";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[37]] = N."Unknown (puzzle)";
    }

    private static void llIlllIIIIIIIl() {
        lIlIlIIIlIII = new int[39];
        N.lIlIlIIIlIII[0] = 0x6D ^ 0x4D;
        N.lIlIlIIIlIII[1] = (0xE9 ^ 0x93 ^ (0x4D ^ 0x23)) & (132 + 105 - 121 + 21 ^ 111 + 69 - 92 + 69 ^ -1);
        N.lIlIlIIIlIII[2] = 1;
        N.lIlIlIIIlIII[3] = 2;
        N.lIlIlIIIlIII[4] = 3;
        N.lIlIlIIIlIII[5] = 0x64 ^ 0x60;
        N.lIlIlIIIlIII[6] = 0xA5 ^ 0xA0;
        N.lIlIlIIIlIII[7] = 0xC1 ^ 0xC7;
        N.lIlIlIIIlIII[8] = 0x13 ^ 0x14;
        N.lIlIlIIIlIII[9] = 0x61 ^ 0x69;
        N.lIlIlIIIlIII[10] = 0x54 ^ 0x5D;
        N.lIlIlIIIlIII[11] = 0x48 ^ 0x42;
        N.lIlIlIIIlIII[12] = 135 + 134 - 116 + 20 ^ 30 + 75 - -47 + 14;
        N.lIlIlIIIlIII[13] = 0x47 ^ 0x25 ^ (0x70 ^ 0x1E);
        N.lIlIlIIIlIII[14] = 65 + 95 - 83 + 57 ^ 121 + 38 - 92 + 72;
        N.lIlIlIIIlIII[15] = 0x7A ^ 0x7F ^ (0x68 ^ 0x63);
        N.lIlIlIIIlIII[16] = 0x52 ^ 0x39 ^ (0x63 ^ 7);
        N.lIlIlIIIlIII[17] = 86 + 70 - 86 + 57 ^ (0x3F ^ 0x50);
        N.lIlIlIIIlIII[18] = 0x99 ^ 0x88;
        N.lIlIlIIIlIII[19] = 100 + 69 - 110 + 100 ^ 140 + 139 - 252 + 114;
        N.lIlIlIIIlIII[20] = 0xC9 ^ 0x89 ^ (0xEF ^ 0xBC);
        N.lIlIlIIIlIII[21] = 0x81 ^ 0xC2 ^ (0x18 ^ 0x4F);
        N.lIlIlIIIlIII[22] = 0x5E ^ 0x49 ^ 2;
        N.lIlIlIIIlIII[23] = 0x6D ^ 0x7B;
        N.lIlIlIIIlIII[24] = 0xB ^ 0x54 ^ (0x40 ^ 8);
        N.lIlIlIIIlIII[25] = 0x8D ^ 0x95;
        N.lIlIlIIIlIII[26] = 0xB4 ^ 0xAD;
        N.lIlIlIIIlIII[27] = 0x40 ^ 0x5A;
        N.lIlIlIIIlIII[28] = 0x72 ^ 0x69;
        N.lIlIlIIIlIII[29] = 95 + 24 - 67 + 107 ^ 39 + 36 - 66 + 122;
        N.lIlIlIIIlIII[30] = 0x6B ^ 0x76;
        N.lIlIlIIIlIII[31] = 37 + 177 - 102 + 71 ^ 15 + 139 - 128 + 143;
        N.lIlIlIIIlIII[32] = 0xDD ^ 0xC2;
        N.lIlIlIIIlIII[33] = 0x4B ^ 0x4C ^ (0xB5 ^ 0x93);
        N.lIlIlIIIlIII[34] = 0x60 ^ 0x42;
        N.lIlIlIIIlIII[35] = 0x2A ^ 9;
        N.lIlIlIIIlIII[36] = 0xF ^ 0 ^ (0x25 ^ 0xE);
        N.lIlIlIIIlIII[37] = 0xA4 ^ 0x81;
        N.lIlIlIIIlIII[38] = 0 ^ 0x64 ^ (0xD3 ^ 0x91);
    }

    public P bY() {
        return this.type;
    }

    private static String llIllIllllllIl(String lllllllllllllllIllIlIlIIlIlIlIlI, String lllllllllllllllIllIlIlIIlIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlIIlIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIlIIlIlIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIlIIlIlIlllI.init(lIlIlIIIlIII[3], lllllllllllllllIllIlIlIIlIlIllll);
            return new String(lllllllllllllllIllIlIlIIlIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIlIIlIlIllIl) {
            lllllllllllllllIllIlIlIIlIlIllIl.printStackTrace();
            return null;
        }
    }

    private static String llIllIlllllllI(String lllllllllllllllIllIlIlIIlIllllII, String lllllllllllllllIllIlIlIIlIlllIll) {
        lllllllllllllllIllIlIlIIlIllllII = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIlIIlIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIlIIlIllllll = new StringBuilder();
        char[] lllllllllllllllIllIlIlIIlIlllllI = lllllllllllllllIllIlIlIIlIlllIll.toCharArray();
        int lllllllllllllllIllIlIlIIlIllllIl = lIlIlIIIlIII[1];
        char[] lllllllllllllllIllIlIlIIlIllIlll = lllllllllllllllIllIlIlIIlIllllII.toCharArray();
        int lllllllllllllllIllIlIlIIlIllIllI = lllllllllllllllIllIlIlIIlIllIlll.length;
        int lllllllllllllllIllIlIlIIlIllIlIl = lIlIlIIIlIII[1];
        while (N.llIlllIIIIIIlI(lllllllllllllllIllIlIlIIlIllIlIl, lllllllllllllllIllIlIlIIlIllIllI)) {
            char lllllllllllllllIllIlIlIIllIIIIlI = lllllllllllllllIllIlIlIIlIllIlll[lllllllllllllllIllIlIlIIlIllIlIl];
            lllllllllllllllIllIlIlIIlIllllll.append((char)(lllllllllllllllIllIlIlIIllIIIIlI ^ lllllllllllllllIllIlIlIIlIlllllI[lllllllllllllllIllIlIlIIlIllllIl % lllllllllllllllIllIlIlIIlIlllllI.length]));
            0;
            ++lllllllllllllllIllIlIlIIlIllllIl;
            ++lllllllllllllllIllIlIlIIlIllIlIl;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIlIIlIllllll);
    }

    public static N[] values() {
        return (N[])$VALUES.clone();
    }

    private N(String string2, P p2) {
        this.name = string2;
        this.type = p2;
    }

    public String bX() {
        return this.name;
    }

    private static boolean llIlllIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static N valueOf(String string) {
        return Enum.valueOf(N.class, string);
    }

    static {
        N.llIlllIIIIIIIl();
        N.llIlllIIIIIIII();
        ROOM_MAX_SIZE = lIlIlIIIlIII[0];
        START = new N(lIlIlIIIIlll[lIlIlIIIlIII[2]], P.START);
        END = new N(lIlIlIIIIlll[lIlIlIIIlIII[4]], P.END);
        SCAVENGERS = new N(lIlIlIIIIlll[lIlIlIIIlIII[6]], P.SCAVENGERS);
        FARMING = new N(lIlIlIIIIlll[lIlIlIIIlIII[8]], P.FARMING);
        EMPTY = new N(lIlIlIIIIlll[lIlIlIIIlIII[10]], P.EMPTY);
        TEKTON = new N(lIlIlIIIIlll[lIlIlIIIlIII[12]], P.COMBAT);
        MUTTADILES = new N(lIlIlIIIIlll[lIlIlIIIlIII[14]], P.COMBAT);
        GUARDIANS = new N(lIlIlIIIIlll[lIlIlIIIlIII[16]], P.COMBAT);
        VESPULA = new N(lIlIlIIIIlll[lIlIlIIIlIII[18]], P.COMBAT);
        SHAMANS = new N(lIlIlIIIIlll[lIlIlIIIlIII[20]], P.COMBAT);
        VASA = new N(lIlIlIIIIlll[lIlIlIIIlIII[22]], P.COMBAT);
        VANGUARDS = new N(lIlIlIIIIlll[lIlIlIIIlIII[24]], P.COMBAT);
        MYSTICS = new N(lIlIlIIIIlll[lIlIlIIIlIII[26]], P.COMBAT);
        UNKNOWN_COMBAT = new N(lIlIlIIIIlll[lIlIlIIIlIII[28]], P.COMBAT);
        CRABS = new N(lIlIlIIIIlll[lIlIlIIIlIII[30]], P.PUZZLE);
        ICE_DEMON = new N(lIlIlIIIIlll[lIlIlIIIlIII[32]], P.PUZZLE);
        TIGHTROPE = new N(lIlIlIIIIlll[lIlIlIIIlIII[33]], P.PUZZLE);
        THIEVING = new N(lIlIlIIIIlll[lIlIlIIIlIII[35]], P.PUZZLE);
        UNKNOWN_PUZZLE = new N(lIlIlIIIIlll[lIlIlIIIlIII[37]], P.PUZZLE);
        N[] nArray = new N[lIlIlIIIlIII[20]];
        nArray[N.lIlIlIIIlIII[1]] = START;
        nArray[N.lIlIlIIIlIII[2]] = END;
        nArray[N.lIlIlIIIlIII[3]] = SCAVENGERS;
        nArray[N.lIlIlIIIlIII[4]] = FARMING;
        nArray[N.lIlIlIIIlIII[5]] = EMPTY;
        nArray[N.lIlIlIIIlIII[6]] = TEKTON;
        nArray[N.lIlIlIIIlIII[7]] = MUTTADILES;
        nArray[N.lIlIlIIIlIII[8]] = GUARDIANS;
        nArray[N.lIlIlIIIlIII[9]] = VESPULA;
        nArray[N.lIlIlIIIlIII[10]] = SHAMANS;
        nArray[N.lIlIlIIIlIII[11]] = VASA;
        nArray[N.lIlIlIIIlIII[12]] = VANGUARDS;
        nArray[N.lIlIlIIIlIII[13]] = MYSTICS;
        nArray[N.lIlIlIIIlIII[14]] = UNKNOWN_COMBAT;
        nArray[N.lIlIlIIIlIII[15]] = CRABS;
        nArray[N.lIlIlIIIlIII[16]] = ICE_DEMON;
        nArray[N.lIlIlIIIlIII[17]] = TIGHTROPE;
        nArray[N.lIlIlIIIlIII[18]] = THIEVING;
        nArray[N.lIlIlIIIlIII[19]] = UNKNOWN_PUZZLE;
        $VALUES = nArray;
    }
}

