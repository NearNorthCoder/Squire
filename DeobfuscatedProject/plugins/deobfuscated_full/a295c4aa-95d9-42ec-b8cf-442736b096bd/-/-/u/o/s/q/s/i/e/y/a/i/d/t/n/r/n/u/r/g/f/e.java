/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.d;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.f;
import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class e
extends Enum<e> {
    public static final /* synthetic */ /* enum */ e GLADIUS_POINT;
    public static final /* synthetic */ /* enum */ e SERRATED_FORTE;
    public static final /* synthetic */ /* enum */ e SERRATED_TIPS;
    public static final /* synthetic */ /* enum */ e THE_POINT;
    private final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ e CHOPPER_FORTE;
    public static final /* synthetic */ /* enum */ e JUGGERNAUT_FORTE;
    public static final /* synthetic */ /* enum */ e CHOPPER_FORTE_1;
    public static final /* synthetic */ /* enum */ e DEFENDER_BASE;
    public static final /* synthetic */ /* enum */ e CHOPPA;
    public static final /* synthetic */ /* enum */ e MEDUSA_BLADE;
    public static final /* synthetic */ /* enum */ e GALDIUS_RICASSO;
    public static final /* synthetic */ /* enum */ e STILETTO_FORTE;
    public static final /* synthetic */ /* enum */ e GLADIUS_EDGE;
    public static final /* synthetic */ /* enum */ e CHOPPER_TIP;
    public static final /* synthetic */ /* enum */ e SERPENT_RICASSO;
    public static final /* synthetic */ /* enum */ e FISH_BLADE;
    private static /* synthetic */ String[] llIlIlIlIlII;
    public static final /* synthetic */ /* enum */ e PEOPLE_POKER_POINT;
    private static /* synthetic */ int[] llIlIlIlllll;
    public static final /* synthetic */ /* enum */ e MEDUSAS_HEAD;
    private final /* synthetic */ Map<d, Integer> typeToScore;
    public static final /* synthetic */ /* enum */ e MEDUSA_RICASSO;
    public static final /* synthetic */ /* enum */ e CLAYMORE_BLADE;
    public static final /* synthetic */ /* enum */ e DEFENDERS_EDGE;
    public static final /* synthetic */ /* enum */ e SPIKER;
    public static final /* synthetic */ /* enum */ e CORRUPTED_POINT;
    public static final /* synthetic */ /* enum */ e SERPENT_BLADE;
    public static final /* synthetic */ /* enum */ e NEEDLE_POINT;
    public static final /* synthetic */ /* enum */ e DEFENDERS_TIP;
    public static final /* synthetic */ e[] values;
    public static final /* synthetic */ /* enum */ e SAW_BLADE;
    public static final /* synthetic */ /* enum */ e FLAMBERGE_BLADE;
    public static final /* synthetic */ /* enum */ e STILETTO_BLADE;
    private static final /* synthetic */ e[] $VALUES;
    private final /* synthetic */ f mouldType;
    public static final /* synthetic */ /* enum */ e FLEUR_DE_BLADE;
    public static final /* synthetic */ /* enum */ e DISARMING_FORTE;
    public static final /* synthetic */ /* enum */ e SAW_TIP;
    public static final /* synthetic */ /* enum */ e SERPENTS_FANG;

    private static boolean lIIIIIllIllllII(int n2, int n3) {
        return n2 < n3;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.lIIIIIllIlllIll();
        e.lIIIIIllIlllIlI();
        CHOPPER_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[1]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        GALDIUS_RICASSO = new e(llIlIlIlIlII[llIlIlIlllll[4]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        DISARMING_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[5]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        MEDUSA_RICASSO = new e(llIlIlIlIlII[llIlIlIlllll[7]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[6], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        SERPENT_RICASSO = new e(llIlIlIlIlII[llIlIlIlllll[9]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[6], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        SERRATED_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[11]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[6]));
        STILETTO_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[13]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[10], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        DEFENDER_BASE = new e(llIlIlIlIlII[llIlIlIlllll[15]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[10], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        JUGGERNAUT_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[17]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[16]));
        CHOPPER_FORTE_1 = new e(llIlIlIlIlII[llIlIlIlllll[19]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[4], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[18]));
        SPIKER = new e(llIlIlIlIlII[llIlIlIlllll[21]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[1], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[3], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[22]));
        SAW_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[23]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        DEFENDERS_EDGE = new e(llIlIlIlIlII[llIlIlIlllll[25]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        FISH_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[27]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        MEDUSA_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[29]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[6]));
        STILETTO_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[31]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[6], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        GLADIUS_EDGE = new e(llIlIlIlIlII[llIlIlIlllll[33]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[6], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        FLAMBERGE_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[35]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[8], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[10]));
        SERPENT_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[37]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[10], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        CLAYMORE_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[39]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[16], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        FLEUR_DE_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[41]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[18], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[1]));
        CHOPPA = new e(llIlIlIlIlII[llIlIlIlllll[43]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[1], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[22], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[3]));
        PEOPLE_POKER_POINT = new e(llIlIlIlIlII[llIlIlIlllll[45]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        CHOPPER_TIP = new e(llIlIlIlIlII[llIlIlIlllll[47]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        MEDUSAS_HEAD = new e(llIlIlIlIlII[llIlIlIlllll[49]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        SERPENTS_FANG = new e(llIlIlIlIlII[llIlIlIlllll[51]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[6], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[8]));
        GLADIUS_POINT = new e(llIlIlIlIlII[llIlIlIlllll[53]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[6]));
        SAW_TIP = new e(llIlIlIlIlII[llIlIlIlllll[55]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[6], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[8]));
        CORRUPTED_POINT = new e(llIlIlIlIlII[llIlIlIlllll[57]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[10], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[8]));
        DEFENDERS_TIP = new e(llIlIlIlIlII[llIlIlIlllll[59]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[10], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[8]));
        SERRATED_TIPS = new e(llIlIlIlIlII[llIlIlIlllll[61]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[16], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        NEEDLE_POINT = new e(llIlIlIlIlII[llIlIlIlllll[63]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[18], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[4], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        THE_POINT = new e(llIlIlIlIlII[llIlIlIlllll[65]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[3], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[1], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[22]));
        e[] eArray = new e[llIlIlIlllll[33]];
        eArray[e.llIlIlIlllll[0]] = CHOPPER_FORTE;
        eArray[e.llIlIlIlllll[1]] = GALDIUS_RICASSO;
        eArray[e.llIlIlIlllll[3]] = DISARMING_FORTE;
        eArray[e.llIlIlIlllll[4]] = MEDUSA_RICASSO;
        eArray[e.llIlIlIlllll[2]] = SERPENT_RICASSO;
        eArray[e.llIlIlIlllll[5]] = SERRATED_FORTE;
        eArray[e.llIlIlIlllll[6]] = STILETTO_FORTE;
        eArray[e.llIlIlIlllll[7]] = DEFENDER_BASE;
        eArray[e.llIlIlIlllll[8]] = JUGGERNAUT_FORTE;
        eArray[e.llIlIlIlllll[9]] = CHOPPER_FORTE_1;
        eArray[e.llIlIlIlllll[10]] = SPIKER;
        eArray[e.llIlIlIlllll[11]] = SAW_BLADE;
        eArray[e.llIlIlIlllll[12]] = DEFENDERS_EDGE;
        eArray[e.llIlIlIlllll[13]] = FISH_BLADE;
        eArray[e.llIlIlIlllll[14]] = MEDUSA_BLADE;
        eArray[e.llIlIlIlllll[15]] = STILETTO_BLADE;
        eArray[e.llIlIlIlllll[16]] = GLADIUS_EDGE;
        eArray[e.llIlIlIlllll[17]] = FLAMBERGE_BLADE;
        eArray[e.llIlIlIlllll[18]] = SERPENT_BLADE;
        eArray[e.llIlIlIlllll[19]] = CLAYMORE_BLADE;
        eArray[e.llIlIlIlllll[20]] = FLEUR_DE_BLADE;
        eArray[e.llIlIlIlllll[21]] = CHOPPA;
        eArray[e.llIlIlIlllll[22]] = PEOPLE_POKER_POINT;
        eArray[e.llIlIlIlllll[23]] = CHOPPER_TIP;
        eArray[e.llIlIlIlllll[24]] = MEDUSAS_HEAD;
        eArray[e.llIlIlIlllll[25]] = SERPENTS_FANG;
        eArray[e.llIlIlIlllll[26]] = GLADIUS_POINT;
        eArray[e.llIlIlIlllll[27]] = SAW_TIP;
        eArray[e.llIlIlIlllll[28]] = CORRUPTED_POINT;
        eArray[e.llIlIlIlllll[29]] = DEFENDERS_TIP;
        eArray[e.llIlIlIlllll[30]] = SERRATED_TIPS;
        eArray[e.llIlIlIlllll[31]] = NEEDLE_POINT;
        eArray[e.llIlIlIlllll[32]] = THE_POINT;
        $VALUES = eArray;
        values = e.values();
    }

    private static String lIIIIIllIIlIIII(String var7, String var17) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var20 = var17.toCharArray();
        int var18 = llIlIlIlllll[0];
        char[] var2 = var7.toCharArray();
        int var5 = var2.length;
        int var3 = llIlIlIlllll[0];
        while (e.lIIIIIllIllllII(var3, var5)) {
            char var23 = var2[var3];
            var8.append((char)(var23 ^ var20[var18 % var20.length]));
            0;
            ++var18;
            ++var3;
            0;
            if (((141 + 136 - 167 + 36 ^ 89 + 81 - 144 + 134) & (146 + 125 - 133 + 29 ^ 14 + 61 - -47 + 27 ^ -1)) == ((0xC8 ^ 0xBE ^ (0x58 ^ 0x11)) & (0x2A ^ 0x13 ^ (0x74 ^ 0x72) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static String lIIIIIllIIlIIlI(String var24, String var15) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), llIlIlIlllll[8]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(llIlIlIlllll[3], var14);
            return new String(var19.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static void lIIIIIllIlllIll() {
        llIlIlIlllll = new int[67];
        e.llIlIlIlllll[0] = (52 + 16 - -116 + 48 ^ 152 + 42 - 54 + 54) & (0x75 ^ 0x18 ^ (0x33 ^ 0x74) ^ -1);
        e.llIlIlIlllll[1] = 1;
        e.llIlIlIlllll[2] = 0x9D ^ 0x99;
        e.llIlIlIlllll[3] = 2;
        e.llIlIlIlllll[4] = 3;
        e.llIlIlIlllll[5] = 0x3B ^ 0x3E;
        e.llIlIlIlllll[6] = 124 + 52 - 119 + 121 ^ 147 + 30 - 80 + 83;
        e.llIlIlIlllll[7] = 0x13 ^ 0xF ^ (0xB4 ^ 0xAF);
        e.llIlIlIlllll[8] = 139 + 18 - 3 + 33 ^ 77 + 36 - -30 + 36;
        e.llIlIlIlllll[9] = 129 + 67 - 174 + 122 ^ 118 + 81 - 194 + 148;
        e.llIlIlIlllll[10] = 0x1C ^ 0x60 ^ (0xA ^ 0x7C);
        e.llIlIlIlllll[11] = 0x23 ^ 0x28;
        e.llIlIlIlllll[12] = 167 + 24 - 11 + 0 ^ 90 + 78 - 36 + 52;
        e.llIlIlIlllll[13] = 0x66 ^ 0x6B;
        e.llIlIlIlllll[14] = 0x21 ^ 0x62 ^ (0xFD ^ 0xB0);
        e.llIlIlIlllll[15] = 10 + 33 - -34 + 125 ^ 124 + 114 - 166 + 125;
        e.llIlIlIlllll[16] = 8 ^ 0x18;
        e.llIlIlIlllll[17] = 144 + 148 - 218 + 91 ^ 156 + 174 - 184 + 34;
        e.llIlIlIlllll[18] = 0x51 ^ 0x43;
        e.llIlIlIlllll[19] = 0x20 ^ 0x33;
        e.llIlIlIlllll[20] = 0x42 ^ 0x56;
        e.llIlIlIlllll[21] = 0x65 ^ 0x70;
        e.llIlIlIlllll[22] = 0x89 ^ 0xC1 ^ (0x15 ^ 0x4B);
        e.llIlIlIlllll[23] = 0x4E ^ 0x59;
        e.llIlIlIlllll[24] = 0xA1 ^ 0xB9;
        e.llIlIlIlllll[25] = 0xDD ^ 0xB0 ^ (0xCC ^ 0xB8);
        e.llIlIlIlllll[26] = 0x76 ^ 0x6C;
        e.llIlIlIlllll[27] = 0xBC ^ 0xA7;
        e.llIlIlIlllll[28] = 0x38 ^ 0x24;
        e.llIlIlIlllll[29] = 0x5F ^ 0x42;
        e.llIlIlIlllll[30] = 0xE ^ 0x10;
        e.llIlIlIlllll[31] = 0x65 ^ 0x7A;
        e.llIlIlIlllll[32] = 0x93 ^ 0xBB ^ (0x69 ^ 0x61);
        e.llIlIlIlllll[33] = 162 + 41 - 163 + 145 ^ 28 + 73 - 21 + 72;
        e.llIlIlIlllll[34] = 0x5E ^ 0x6D ^ (0x6F ^ 0x7E);
        e.llIlIlIlllll[35] = 0x6C ^ 0x4F;
        e.llIlIlIlllll[36] = 0xF2 ^ 0xAD ^ (0xD9 ^ 0xA2);
        e.llIlIlIlllll[37] = 0xD ^ 0x28;
        e.llIlIlIlllll[38] = 0x5E ^ 0x78;
        e.llIlIlIlllll[39] = 0x80 ^ 0xBE ^ (0x74 ^ 0x6D);
        e.llIlIlIlllll[40] = 131 + 129 - 228 + 120 ^ 2 + 31 - -12 + 131;
        e.llIlIlIlllll[41] = 0xB ^ 0x53 ^ (0xF9 ^ 0x88);
        e.llIlIlIlllll[42] = 26 + 48 - -53 + 20 ^ 6 + 141 - 62 + 100;
        e.llIlIlIlllll[43] = 0xE9 ^ 0xC2;
        e.llIlIlIlllll[44] = 0x30 ^ 0x1C;
        e.llIlIlIlllll[45] = 0x49 ^ 0x51 ^ (1 ^ 0x34);
        e.llIlIlIlllll[46] = 0x58 ^ 0xB ^ (0xDB ^ 0xA6);
        e.llIlIlIlllll[47] = 0x9A ^ 0xB5;
        e.llIlIlIlllll[48] = 0x14 ^ 0x24;
        e.llIlIlIlllll[49] = 0x28 ^ 0x19;
        e.llIlIlIlllll[50] = 0x8B ^ 0xBC ^ (0x6A ^ 0x6F);
        e.llIlIlIlllll[51] = 0x31 ^ 0x24 ^ (0x37 ^ 0x11);
        e.llIlIlIlllll[52] = 0x72 ^ 0x4B ^ (0x32 ^ 0x3F);
        e.llIlIlIlllll[53] = 0x69 ^ 0x22 ^ (0x7C ^ 2);
        e.llIlIlIlllll[54] = 0xC6 ^ 0x96 ^ (0x15 ^ 0x73);
        e.llIlIlIlllll[55] = 0x2A ^ 0x1D;
        e.llIlIlIlllll[56] = 0x12 ^ 0x2A;
        e.llIlIlIlllll[57] = 0x32 ^ 2 ^ (0x5A ^ 0x53);
        e.llIlIlIlllll[58] = 0xA7 ^ 0x9D;
        e.llIlIlIlllll[59] = 0x81 ^ 0xBA;
        e.llIlIlIlllll[60] = 43 + 51 - -67 + 11 ^ 18 + 135 - 102 + 93;
        e.llIlIlIlllll[61] = 0x5F ^ 3 ^ (0xED ^ 0x8C);
        e.llIlIlIlllll[62] = 0x6C ^ 0x52;
        e.llIlIlIlllll[63] = 0x41 ^ 0x7E;
        e.llIlIlIlllll[64] = 0xFC ^ 0xBC;
        e.llIlIlIlllll[65] = 0x6E ^ 0x30 ^ (0xA1 ^ 0xBE);
        e.llIlIlIlllll[66] = 0x1F ^ 0x5D;
    }

    private static boolean lIIIIIllIllllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static e b(String string) {
        void var11;
        e[] eArray = values;
        int n2 = eArray.length;
        int var12 = llIlIlIlllll[0];
        while (e.lIIIIIllIllllII(var12, (int)var11)) {
            String var9;
            void var4;
            void var6 = var4[var12];
            if (e.lIIIIIllIllllIl(var6.name.equalsIgnoreCase(var9) ? 1 : 0)) {
                return var6;
            }
            ++var12;
            0;
            
            return null;
        }
        return null;
    }

    public int a(d d2, d d3) {
        int n2 = llIlIlIlllll[0];
        n2 += this.typeToScore.getOrDefault((Object)d2, llIlIlIlllll[0]).intValue();
        return n2 += this.typeToScore.getOrDefault((Object)d3, llIlIlIlllll[0]).intValue();
    }

    private static void lIIIIIllIlllIlI() {
        llIlIlIlIlII = new String[llIlIlIlllll[66]];
        e.llIlIlIlIlII[e.llIlIlIlllll[0]] = e."CHOPPER_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[1]] = e."Chopper Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[3]] = e."GALDIUS_RICASSO";
        e.llIlIlIlIlII[e.llIlIlIlllll[4]] = e."Galdius Ricasso";
        e.llIlIlIlIlII[e.llIlIlIlllll[2]] = e."DISARMING_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[5]] = e."Disarming Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[6]] = e."MEDUSA_RICASSO";
        e.llIlIlIlIlII[e.llIlIlIlllll[7]] = e."Medusa Ricasso";
        e.llIlIlIlIlII[e.llIlIlIlllll[8]] = e."SERPENT_RICASSO";
        e.llIlIlIlIlII[e.llIlIlIlllll[9]] = e."Serpent Ricasso";
        e.llIlIlIlIlII[e.llIlIlIlllll[10]] = e."SERRATED_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[11]] = e."Serrated Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[12]] = e."STILETTO_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[13]] = e."Stiletto Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[14]] = e."DEFENDER_BASE";
        e.llIlIlIlIlII[e.llIlIlIlllll[15]] = e."Defender Base";
        e.llIlIlIlIlII[e.llIlIlIlllll[16]] = e."JUGGERNAUT_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[17]] = e."Juggernaut Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[18]] = e."CHOPPER_FORTE_1";
        e.llIlIlIlIlII[e.llIlIlIlllll[19]] = e."Chopper Forte +1";
        e.llIlIlIlIlII[e.llIlIlIlllll[20]] = e."SPIKER";
        e.llIlIlIlIlII[e.llIlIlIlllll[21]] = e."Spiker!";
        e.llIlIlIlIlII[e.llIlIlIlllll[22]] = e."SAW_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[23]] = e."Saw Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[24]] = e."DEFENDERS_EDGE";
        e.llIlIlIlIlII[e.llIlIlIlllll[25]] = e."Defenders Edge";
        e.llIlIlIlIlII[e.llIlIlIlllll[26]] = e."FISH_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[27]] = e."Fish Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[28]] = e."MEDUSA_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[29]] = e."Medusa Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[30]] = e."STILETTO_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[31]] = e."Stiletto Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[32]] = e."GLADIUS_EDGE";
        e.llIlIlIlIlII[e.llIlIlIlllll[33]] = e."Gladius Edge";
        e.llIlIlIlIlII[e.llIlIlIlllll[34]] = e."FLAMBERGE_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[35]] = e."Flamberge Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[36]] = e."SERPENT_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[37]] = e."Serpent Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[38]] = e."CLAYMORE_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[39]] = e."Claymore Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[40]] = e."FLEUR_DE_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[41]] = e."Fleur de Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[42]] = e."CHOPPA";
        e.llIlIlIlIlII[e.llIlIlIlllll[43]] = e."Choppa!";
        e.llIlIlIlIlII[e.llIlIlIlllll[44]] = e."PEOPLE_POKER_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[45]] = e."People Poker Point";
        e.llIlIlIlIlII[e.llIlIlIlllll[46]] = e."CHOPPER_TIP";
        e.llIlIlIlIlII[e.llIlIlIlllll[47]] = e."Chopper Tip";
        e.llIlIlIlIlII[e.llIlIlIlllll[48]] = e."MEDUSAS_HEAD";
        e.llIlIlIlIlII[e.llIlIlIlllll[49]] = e."Medusa's Head";
        e.llIlIlIlIlII[e.llIlIlIlllll[50]] = e."SERPENTS_FANG";
        e.llIlIlIlIlII[e.llIlIlIlllll[51]] = e."Serpent's Fang";
        e.llIlIlIlIlII[e.llIlIlIlllll[52]] = e."GLADIUS_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[53]] = e."Gladius Point";
        e.llIlIlIlIlII[e.llIlIlIlllll[54]] = e."SAW_TIP";
        e.llIlIlIlIlII[e.llIlIlIlllll[55]] = e."Saw Tip";
        e.llIlIlIlIlII[e.llIlIlIlllll[56]] = e."CORRUPTED_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[57]] = e."Corrupted Point";
        e.llIlIlIlIlII[e.llIlIlIlllll[58]] = e."DEFENDERS_TIP";
        e.llIlIlIlIlII[e.llIlIlIlllll[59]] = e."Defenders Tip";
        e.llIlIlIlIlII[e.llIlIlIlllll[60]] = e."SERRATED_TIPS";
        e.llIlIlIlIlII[e.llIlIlIlllll[61]] = e."Serrated Tips";
        e.llIlIlIlIlII[e.llIlIlIlllll[62]] = e."NEEDLE_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[63]] = e."Needle Point";
        e.llIlIlIlIlII[e.llIlIlIlllll[64]] = e."THE_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[65]] = e."The Point!";
    }

    private e(String string2, f f2, Map<d, Integer> map) {
        this.name = string2;
        this.mouldType = f2;
        this.typeToScore = map;
    }

    public String x() {
        return this.name;
    }

    private static String lIIIIIllIIlIIIl(String var13, String var21) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIlIlIlllll[3], var1);
            return new String(var10.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }
}

