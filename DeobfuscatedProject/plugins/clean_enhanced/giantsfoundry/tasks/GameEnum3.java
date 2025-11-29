/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GameEnum4;
import gg.squire.giantsfoundry.tasks.GameEnum5;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public final class GameEnum3
extends Enum<e> {
    public static final  /* enum */ e GLADIUS_POINT;
    public static final  /* enum */ e SERRATED_FORTE;
    public static final  /* enum */ e SERRATED_TIPS;
    public static final  /* enum */ e THE_POINT;
    private final  String name;
    public static final  /* enum */ e CHOPPER_FORTE;
    public static final  /* enum */ e JUGGERNAUT_FORTE;
    public static final  /* enum */ e CHOPPER_FORTE_1;
    public static final  /* enum */ e DEFENDER_BASE;
    public static final  /* enum */ e CHOPPA;
    public static final  /* enum */ e MEDUSA_BLADE;
    public static final  /* enum */ e GALDIUS_RICASSO;
    public static final  /* enum */ e STILETTO_FORTE;
    public static final  /* enum */ e GLADIUS_EDGE;
    public static final  /* enum */ e CHOPPER_TIP;
    public static final  /* enum */ e SERPENT_RICASSO;
    public static final  /* enum */ e FISH_BLADE;
    
    public static final  /* enum */ e PEOPLE_POKER_POINT;
    
    public static final  /* enum */ e MEDUSAS_HEAD;
    private final  Map<d, Integer> typeToScore;
    public static final  /* enum */ e MEDUSA_RICASSO;
    public static final  /* enum */ e CLAYMORE_BLADE;
    public static final  /* enum */ e DEFENDERS_EDGE;
    public static final  /* enum */ e SPIKER;
    public static final  /* enum */ e CORRUPTED_POINT;
    public static final  /* enum */ e SERPENT_BLADE;
    public static final  /* enum */ e NEEDLE_POINT;
    public static final  /* enum */ e DEFENDERS_TIP;
    public static final  e[] values;
    public static final  /* enum */ e SAW_BLADE;
    public static final  /* enum */ e FLAMBERGE_BLADE;
    public static final  /* enum */ e STILETTO_BLADE;
    private static final  e[] $VALUES;
    private final  f mouldType;
    public static final  /* enum */ e FLEUR_DE_BLADE;
    public static final  /* enum */ e DISARMING_FORTE;
    public static final  /* enum */ e SAW_TIP;
    public static final  /* enum */ e SERPENTS_FANG;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.var4();
        e.var5();
        CHOPPER_FORTE = new GameEnum3(var1[var2[1]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[2], (Object)((Object)d.LIGHT), (Object)var2[2], (Object)((Object)d.FLAT), (Object)var2[2]));
        GALDIUS_RICASSO = new GameEnum3(var1[var2[4]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[2], (Object)((Object)d.HEAVY), (Object)var2[2], (Object)((Object)d.FLAT), (Object)var2[2]));
        DISARMING_FORTE = new GameEnum3(var1[var2[5]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[2], (Object)((Object)d.LIGHT), (Object)var2[2], (Object)((Object)d.SPIKED), (Object)var2[2]));
        MEDUSA_RICASSO = new GameEnum3(var1[var2[7]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[8], (Object)((Object)d.HEAVY), (Object)var2[6], (Object)((Object)d.FLAT), (Object)var2[8]));
        SERPENT_RICASSO = new GameEnum3(var1[var2[9]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[6], (Object)((Object)d.LIGHT), (Object)var2[8], (Object)((Object)d.FLAT), (Object)var2[8]));
        SERRATED_FORTE = new GameEnum3(var1[var2[11]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[8], (Object)((Object)d.HEAVY), (Object)var2[8], (Object)((Object)d.SPIKED), (Object)var2[6]));
        STILETTO_FORTE = new GameEnum3(var1[var2[13]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[8], (Object)((Object)d.LIGHT), (Object)var2[10], (Object)((Object)d.FLAT), (Object)var2[8]));
        DEFENDER_BASE = new GameEnum3(var1[var2[15]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[8], (Object)((Object)d.HEAVY), (Object)var2[10], (Object)((Object)d.FLAT), (Object)var2[8]));
        JUGGERNAUT_FORTE = new GameEnum3(var1[var2[17]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[2], (Object)((Object)d.HEAVY), (Object)var2[2], (Object)((Object)d.SPIKED), (Object)var2[16]));
        CHOPPER_FORTE_1 = new GameEnum3(var1[var2[19]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[4], (Object)((Object)d.LIGHT), (Object)var2[2], (Object)((Object)d.FLAT), (Object)var2[18]));
        SPIKER = new GameEnum3(var1[var2[21]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[1], (Object)((Object)d.HEAVY), (Object)var2[3], (Object)((Object)d.SPIKED), (Object)var2[22]));
        SAW_BLADE = new GameEnum3(var1[var2[23]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[2], (Object)((Object)d.LIGHT), (Object)var2[2], (Object)((Object)d.SPIKED), (Object)var2[2]));
        DEFENDERS_EDGE = new GameEnum3(var1[var2[25]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[2], (Object)((Object)d.HEAVY), (Object)var2[2], (Object)((Object)d.SPIKED), (Object)var2[2]));
        FISH_BLADE = new GameEnum3(var1[var2[27]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[2], (Object)((Object)d.LIGHT), (Object)var2[2], (Object)((Object)d.FLAT), (Object)var2[2]));
        MEDUSA_BLADE = new GameEnum3(var1[var2[29]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[8], (Object)((Object)d.HEAVY), (Object)var2[8], (Object)((Object)d.FLAT), (Object)var2[6]));
        STILETTO_BLADE = new GameEnum3(var1[var2[31]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[8], (Object)((Object)d.LIGHT), (Object)var2[6], (Object)((Object)d.FLAT), (Object)var2[8]));
        GLADIUS_EDGE = new GameEnum3(var1[var2[33]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[6], (Object)((Object)d.HEAVY), (Object)var2[8], (Object)((Object)d.FLAT), (Object)var2[8]));
        FLAMBERGE_BLADE = new GameEnum3(var1[var2[35]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[8], (Object)((Object)d.LIGHT), (Object)var2[8], (Object)((Object)d.SPIKED), (Object)var2[10]));
        SERPENT_BLADE = new GameEnum3(var1[var2[37]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[10], (Object)((Object)d.LIGHT), (Object)var2[8], (Object)((Object)d.FLAT), (Object)var2[8]));
        CLAYMORE_BLADE = new GameEnum3(var1[var2[39]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[16], (Object)((Object)d.HEAVY), (Object)var2[2], (Object)((Object)d.FLAT), (Object)var2[2]));
        FLEUR_DE_BLADE = new GameEnum3(var1[var2[41]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[2], (Object)((Object)d.HEAVY), (Object)var2[18], (Object)((Object)d.SPIKED), (Object)var2[1]));
        CHOPPA = new GameEnum3(var1[var2[43]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[1], (Object)((Object)d.LIGHT), (Object)var2[22], (Object)((Object)d.FLAT), (Object)var2[3]));
        PEOPLE_POKER_POINT = new GameEnum3(var1[var2[45]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[2], (Object)((Object)d.HEAVY), (Object)var2[2], (Object)((Object)d.FLAT), (Object)var2[2]));
        CHOPPER_TIP = new GameEnum3(var1[var2[47]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[2], (Object)((Object)d.LIGHT), (Object)var2[2], (Object)((Object)d.SPIKED), (Object)var2[2]));
        MEDUSAS_HEAD = new GameEnum3(var1[var2[49]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[2], (Object)((Object)d.HEAVY), (Object)var2[2], (Object)((Object)d.SPIKED), (Object)var2[2]));
        SERPENTS_FANG = new GameEnum3(var1[var2[51]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[8], (Object)((Object)d.LIGHT), (Object)var2[6], (Object)((Object)d.SPIKED), (Object)var2[8]));
        GLADIUS_POINT = new GameEnum3(var1[var2[53]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[8], (Object)((Object)d.HEAVY), (Object)var2[8], (Object)((Object)d.FLAT), (Object)var2[6]));
        SAW_TIP = new GameEnum3(var1[var2[55]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[6], (Object)((Object)d.HEAVY), (Object)var2[8], (Object)((Object)d.SPIKED), (Object)var2[8]));
        CORRUPTED_POINT = new GameEnum3(var1[var2[57]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[8], (Object)((Object)d.LIGHT), (Object)var2[10], (Object)((Object)d.SPIKED), (Object)var2[8]));
        DEFENDERS_TIP = new GameEnum3(var1[var2[59]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[10], (Object)((Object)d.HEAVY), (Object)var2[8], (Object)((Object)d.SPIKED), (Object)var2[8]));
        SERRATED_TIPS = new GameEnum3(var1[var2[61]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[2], (Object)((Object)d.LIGHT), (Object)var2[16], (Object)((Object)d.SPIKED), (Object)var2[2]));
        NEEDLE_POINT = new GameEnum3(var1[var2[63]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)var2[18], (Object)((Object)d.LIGHT), (Object)var2[4], (Object)((Object)d.FLAT), (Object)var2[2]));
        THE_POINT = new GameEnum3(var1[var2[65]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)var2[3], (Object)((Object)d.LIGHT), (Object)var2[1], (Object)((Object)d.FLAT), (Object)var2[22]));
        e[] eArray = new e[var2[33]];
        eArray[e.var2[0]] = CHOPPER_FORTE;
        eArray[e.var2[1]] = GALDIUS_RICASSO;
        eArray[e.var2[3]] = DISARMING_FORTE;
        eArray[e.var2[4]] = MEDUSA_RICASSO;
        eArray[e.var2[2]] = SERPENT_RICASSO;
        eArray[e.var2[5]] = SERRATED_FORTE;
        eArray[e.var2[6]] = STILETTO_FORTE;
        eArray[e.var2[7]] = DEFENDER_BASE;
        eArray[e.var2[8]] = JUGGERNAUT_FORTE;
        eArray[e.var2[9]] = CHOPPER_FORTE_1;
        eArray[e.var2[10]] = SPIKER;
        eArray[e.var2[11]] = SAW_BLADE;
        eArray[e.var2[12]] = DEFENDERS_EDGE;
        eArray[e.var2[13]] = FISH_BLADE;
        eArray[e.var2[14]] = MEDUSA_BLADE;
        eArray[e.var2[15]] = STILETTO_BLADE;
        eArray[e.var2[16]] = GLADIUS_EDGE;
        eArray[e.var2[17]] = FLAMBERGE_BLADE;
        eArray[e.var2[18]] = SERPENT_BLADE;
        eArray[e.var2[19]] = CLAYMORE_BLADE;
        eArray[e.var2[20]] = FLEUR_DE_BLADE;
        eArray[e.var2[21]] = CHOPPA;
        eArray[e.var2[22]] = PEOPLE_POKER_POINT;
        eArray[e.var2[23]] = CHOPPER_TIP;
        eArray[e.var2[24]] = MEDUSAS_HEAD;
        eArray[e.var2[25]] = SERPENTS_FANG;
        eArray[e.var2[26]] = GLADIUS_POINT;
        eArray[e.var2[27]] = SAW_TIP;
        eArray[e.var2[28]] = CORRUPTED_POINT;
        eArray[e.var2[29]] = DEFENDERS_TIP;
        eArray[e.var2[30]] = SERRATED_TIPS;
        eArray[e.var2[31]] = NEEDLE_POINT;
        eArray[e.var2[32]] = THE_POINT;
        $VALUES = eArray;
        values = e.values();
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (e.var3(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (((141 + 136 - 167 + 36 ^ 89 + 81 - 144 + 134) & (146 + 125 - 133 + 29 ^ 14 + 61 - -47 + 27 ^ -1)) == ((0xC8 ^ 0xBE ^ (0x58 ^ 0x11)) & (0x2A ^ 0x13 ^ (0x74 ^ 0x72) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private static void var4() {
        var2 = new int[67];
        e.var2[0] = (52 + 16 - -116 + 48 ^ 152 + 42 - 54 + 54) & (0x75 ^ 0x18 ^ (0x33 ^ 0x74) ^ -1);
        e.var2[1] = 1;
        e.var2[2] = 0x9D ^ 0x99;
        e.var2[3] = 2;
        e.var2[4] = 3;
        e.var2[5] = 0x3B ^ 0x3E;
        e.var2[6] = 124 + 52 - 119 + 121 ^ 147 + 30 - 80 + 83;
        e.var2[7] = 0x13 ^ 0xF ^ (0xB4 ^ 0xAF);
        e.var2[8] = 139 + 18 - 3 + 33 ^ 77 + 36 - -30 + 36;
        e.var2[9] = 129 + 67 - 174 + 122 ^ 118 + 81 - 194 + 148;
        e.var2[10] = 0x1C ^ 0x60 ^ (0xA ^ 0x7C);
        e.var2[11] = 0x23 ^ 0x28;
        e.var2[12] = 167 + 24 - 11 + 0 ^ 90 + 78 - 36 + 52;
        e.var2[13] = 0x66 ^ 0x6B;
        e.var2[14] = 0x21 ^ 0x62 ^ (0xFD ^ 0xB0);
        e.var2[15] = 10 + 33 - -34 + 125 ^ 124 + 114 - 166 + 125;
        e.var2[16] = 8 ^ 0x18;
        e.var2[17] = 144 + 148 - 218 + 91 ^ 156 + 174 - 184 + 34;
        e.var2[18] = 0x51 ^ 0x43;
        e.var2[19] = 0x20 ^ 0x33;
        e.var2[20] = 0x42 ^ 0x56;
        e.var2[21] = 0x65 ^ 0x70;
        e.var2[22] = 0x89 ^ 0xC1 ^ (0x15 ^ 0x4B);
        e.var2[23] = 0x4E ^ 0x59;
        e.var2[24] = 0xA1 ^ 0xB9;
        e.var2[25] = 0xDD ^ 0xB0 ^ (0xCC ^ 0xB8);
        e.var2[26] = 0x76 ^ 0x6C;
        e.var2[27] = 0xBC ^ 0xA7;
        e.var2[28] = 0x38 ^ 0x24;
        e.var2[29] = 0x5F ^ 0x42;
        e.var2[30] = 0xE ^ 0x10;
        e.var2[31] = 0x65 ^ 0x7A;
        e.var2[32] = 0x93 ^ 0xBB ^ (0x69 ^ 0x61);
        e.var2[33] = 162 + 41 - 163 + 145 ^ 28 + 73 - 21 + 72;
        e.var2[34] = 0x5E ^ 0x6D ^ (0x6F ^ 0x7E);
        e.var2[35] = 0x6C ^ 0x4F;
        e.var2[36] = 0xF2 ^ 0xAD ^ (0xD9 ^ 0xA2);
        e.var2[37] = 0xD ^ 0x28;
        e.var2[38] = 0x5E ^ 0x78;
        e.var2[39] = 0x80 ^ 0xBE ^ (0x74 ^ 0x6D);
        e.var2[40] = 131 + 129 - 228 + 120 ^ 2 + 31 - -12 + 131;
        e.var2[41] = 0xB ^ 0x53 ^ (0xF9 ^ 0x88);
        e.var2[42] = 26 + 48 - -53 + 20 ^ 6 + 141 - 62 + 100;
        e.var2[43] = 0xE9 ^ 0xC2;
        e.var2[44] = 0x30 ^ 0x1C;
        e.var2[45] = 0x49 ^ 0x51 ^ (1 ^ 0x34);
        e.var2[46] = 0x58 ^ 0xB ^ (0xDB ^ 0xA6);
        e.var2[47] = 0x9A ^ 0xB5;
        e.var2[48] = 0x14 ^ 0x24;
        e.var2[49] = 0x28 ^ 0x19;
        e.var2[50] = 0x8B ^ 0xBC ^ (0x6A ^ 0x6F);
        e.var2[51] = 0x31 ^ 0x24 ^ (0x37 ^ 0x11);
        e.var2[52] = 0x72 ^ 0x4B ^ (0x32 ^ 0x3F);
        e.var2[53] = 0x69 ^ 0x22 ^ (0x7C ^ 2);
        e.var2[54] = 0xC6 ^ 0x96 ^ (0x15 ^ 0x73);
        e.var2[55] = 0x2A ^ 0x1D;
        e.var2[56] = 0x12 ^ 0x2A;
        e.var2[57] = 0x32 ^ 2 ^ (0x5A ^ 0x53);
        e.var2[58] = 0xA7 ^ 0x9D;
        e.var2[59] = 0x81 ^ 0xBA;
        e.var2[60] = 43 + 51 - -67 + 11 ^ 18 + 135 - 102 + 93;
        e.var2[61] = 0x5F ^ 3 ^ (0xED ^ 0x8C);
        e.var2[62] = 0x6C ^ 0x52;
        e.var2[63] = 0x41 ^ 0x7E;
        e.var2[64] = 0xFC ^ 0xBC;
        e.var2[65] = 0x6E ^ 0x30 ^ (0xA1 ^ 0xBE);
        e.var2[66] = 0x1F ^ 0x5D;
    }

    private static boolean var22(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static e b(String string) {
        void var23;
        e[] eArray = values;
        int n2 = eArray.length;
        int var24 = var2[0];
        while (e.var3(var24, (int)var23)) {
            String var25;
            void var26;
            void var27 = var26[var24];
            if (e.var22(var27.name.equalsIgnoreCase(var25) ? 1 : 0)) {
                return var27;
            }
            ++var24;
            0;
            if null == null continue;
            return null;
        }
        return null;
    }

    public int a(d d2, d d3) {
        int n2 = var2[0];
        n2 += this.typeToScore.getOrDefault((Object)d2, var2[0]).intValue();
        return n2 += this.typeToScore.getOrDefault((Object)d3, var2[0]).intValue();
    }

    private static void var5() {
        var1 = new String[var2[66]];
        e.var1[e.var2[0]] = "CHOPPER_FORTE";
        e.var1[e.var2[1]] = "Chopper Forte";
        e.var1[e.var2[3]] = "GALDIUS_RICASSO";
        e.var1[e.var2[4]] = "Galdius Ricasso";
        e.var1[e.var2[2]] = "DISARMING_FORTE";
        e.var1[e.var2[5]] = "Disarming Forte";
        e.var1[e.var2[6]] = "MEDUSA_RICASSO";
        e.var1[e.var2[7]] = "Medusa Ricasso";
        e.var1[e.var2[8]] = "SERPENT_RICASSO";
        e.var1[e.var2[9]] = "Serpent Ricasso";
        e.var1[e.var2[10]] = "SERRATED_FORTE";
        e.var1[e.var2[11]] = "Serrated Forte";
        e.var1[e.var2[12]] = "STILETTO_FORTE";
        e.var1[e.var2[13]] = "Stiletto Forte";
        e.var1[e.var2[14]] = "DEFENDER_BASE";
        e.var1[e.var2[15]] = "Defender Base";
        e.var1[e.var2[16]] = "JUGGERNAUT_FORTE";
        e.var1[e.var2[17]] = "Juggernaut Forte";
        e.var1[e.var2[18]] = "CHOPPER_FORTE_1";
        e.var1[e.var2[19]] = "Chopper Forte +1";
        e.var1[e.var2[20]] = "SPIKER";
        e.var1[e.var2[21]] = "Spiker!";
        e.var1[e.var2[22]] = "SAW_BLADE";
        e.var1[e.var2[23]] = "Saw Blade";
        e.var1[e.var2[24]] = "DEFENDERS_EDGE";
        e.var1[e.var2[25]] = "Defenders Edge";
        e.var1[e.var2[26]] = "FISH_BLADE";
        e.var1[e.var2[27]] = "Fish Blade";
        e.var1[e.var2[28]] = "MEDUSA_BLADE";
        e.var1[e.var2[29]] = "Medusa Blade";
        e.var1[e.var2[30]] = "STILETTO_BLADE";
        e.var1[e.var2[31]] = "Stiletto Blade";
        e.var1[e.var2[32]] = "GLADIUS_EDGE";
        e.var1[e.var2[33]] = "Gladius Edge";
        e.var1[e.var2[34]] = "FLAMBERGE_BLADE";
        e.var1[e.var2[35]] = "Flamberge Blade";
        e.var1[e.var2[36]] = "SERPENT_BLADE";
        e.var1[e.var2[37]] = "Serpent Blade";
        e.var1[e.var2[38]] = "CLAYMORE_BLADE";
        e.var1[e.var2[39]] = "Claymore Blade";
        e.var1[e.var2[40]] = "FLEUR_DE_BLADE";
        e.var1[e.var2[41]] = "Fleur de Blade";
        e.var1[e.var2[42]] = "CHOPPA";
        e.var1[e.var2[43]] = "Choppa!";
        e.var1[e.var2[44]] = "PEOPLE_POKER_POINT";
        e.var1[e.var2[45]] = "People Poker Point";
        e.var1[e.var2[46]] = "CHOPPER_TIP";
        e.var1[e.var2[47]] = "Chopper Tip";
        e.var1[e.var2[48]] = "MEDUSAS_HEAD";
        e.var1[e.var2[49]] = "Medusa's Head";
        e.var1[e.var2[50]] = "SERPENTS_FANG";
        e.var1[e.var2[51]] = "Serpent's Fang";
        e.var1[e.var2[52]] = "GLADIUS_POINT";
        e.var1[e.var2[53]] = "Gladius Point";
        e.var1[e.var2[54]] = "SAW_TIP";
        e.var1[e.var2[55]] = "Saw Tip";
        e.var1[e.var2[56]] = "CORRUPTED_POINT";
        e.var1[e.var2[57]] = "Corrupted Point";
        e.var1[e.var2[58]] = "DEFENDERS_TIP";
        e.var1[e.var2[59]] = "Defenders Tip";
        e.var1[e.var2[60]] = "SERRATED_TIPS";
        e.var1[e.var2[61]] = "Serrated Tips";
        e.var1[e.var2[62]] = "NEEDLE_POINT";
        e.var1[e.var2[63]] = "Needle Point";
        e.var1[e.var2[64]] = "THE_POINT";
        e.var1[e.var2[65]] = "The Point!";
    }

    private GameEnum3(String string2, f f2, Map<d, Integer> map) {
        this.name = string2;
        this.mouldType = f2;
        this.typeToScore = map;
    }

    public String x() {
        return this.name;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }
}

