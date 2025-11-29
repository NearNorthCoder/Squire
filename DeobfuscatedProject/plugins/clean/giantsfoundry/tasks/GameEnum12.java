/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package gg.squire.giantsfoundry.tasks;

import gg.squire.giantsfoundry.tasks.GameEnum18;
import gg.squire.giantsfoundry.tasks.GameEnum19;
import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum12
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

    private static boolean lIIIIIllIllllII(int n2, int n3) {
        return n2 < n3;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.lIIIIIllIlllIll();
        e.lIIIIIllIlllIlI();
        CHOPPER_FORTE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[1]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        GALDIUS_RICASSO = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[4]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        DISARMING_FORTE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[5]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        MEDUSA_RICASSO = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[7]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[6], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        SERPENT_RICASSO = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[9]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[6], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        SERRATED_FORTE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[11]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[6]));
        STILETTO_FORTE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[13]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[10], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        DEFENDER_BASE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[15]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[10], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        JUGGERNAUT_FORTE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[17]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[16]));
        CHOPPER_FORTE_1 = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[19]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[4], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[18]));
        SPIKER = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[21]], f.FORTE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[1], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[3], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[22]));
        SAW_BLADE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[23]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        DEFENDERS_EDGE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[25]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        FISH_BLADE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[27]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        MEDUSA_BLADE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[29]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[6]));
        STILETTO_BLADE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[31]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[6], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        GLADIUS_EDGE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[33]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[6], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        FLAMBERGE_BLADE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[35]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[8], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[10]));
        SERPENT_BLADE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[37]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[10], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[8]));
        CLAYMORE_BLADE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[39]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[16], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        FLEUR_DE_BLADE = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[41]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[18], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[1]));
        CHOPPA = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[43]], f.BLADE, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[1], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[22], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[3]));
        PEOPLE_POKER_POINT = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[45]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        CHOPPER_TIP = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[47]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        MEDUSAS_HEAD = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[49]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[2], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[2], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        SERPENTS_FANG = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[51]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[6], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[8]));
        GLADIUS_POINT = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[53]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[6]));
        SAW_TIP = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[55]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[6], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[8]));
        CORRUPTED_POINT = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[57]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[8], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[10], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[8]));
        DEFENDERS_TIP = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[59]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[10], (Object)((Object)d.HEAVY), (Object)llIlIlIlllll[8], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[8]));
        SERRATED_TIPS = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[61]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[2], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[16], (Object)((Object)d.SPIKED), (Object)llIlIlIlllll[2]));
        NEEDLE_POINT = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[63]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.NARROW), (Object)llIlIlIlllll[18], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[4], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[2]));
        THE_POINT = new GameEnum12(llIlIlIlIlII[llIlIlIlllll[65]], f.TIP, (Map<d, Integer>)ImmutableMap.of((Object)((Object)d.BROAD), (Object)llIlIlIlllll[3], (Object)((Object)d.LIGHT), (Object)llIlIlIlllll[1], (Object)((Object)d.FLAT), (Object)llIlIlIlllll[22]));
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

        return String.valueOf(var1);
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum12.class, string);
    }

    private static boolean lIIIIIllIllllIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static e b(String string) {
        void var2;
        e[] eArray = values;
        int n2 = eArray.length;
        int var3 = llIlIlIlllll[0];
        while (e.lIIIIIllIllllII(var3, (int)var2)) {
            String var4;
            void var5;
            void var6 = var5[var3];
            if (e.lIIIIIllIllllIl(var6.name.equalsIgnoreCase(var4) ? 1 : 0)) {
                return var6;
            }
            ++var3;

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
        e.llIlIlIlIlII[e.llIlIlIlllll[0]] = "CHOPPER_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[1]] = "Chopper Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[3]] = "GALDIUS_RICASSO";
        e.llIlIlIlIlII[e.llIlIlIlllll[4]] = "Galdius Ricasso";
        e.llIlIlIlIlII[e.llIlIlIlllll[2]] = "DISARMING_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[5]] = "Disarming Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[6]] = "MEDUSA_RICASSO";
        e.llIlIlIlIlII[e.llIlIlIlllll[7]] = "Medusa Ricasso";
        e.llIlIlIlIlII[e.llIlIlIlllll[8]] = "SERPENT_RICASSO";
        e.llIlIlIlIlII[e.llIlIlIlllll[9]] = "Serpent Ricasso";
        e.llIlIlIlIlII[e.llIlIlIlllll[10]] = "SERRATED_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[11]] = "Serrated Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[12]] = "STILETTO_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[13]] = "Stiletto Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[14]] = "DEFENDER_BASE";
        e.llIlIlIlIlII[e.llIlIlIlllll[15]] = "Defender Base";
        e.llIlIlIlIlII[e.llIlIlIlllll[16]] = "JUGGERNAUT_FORTE";
        e.llIlIlIlIlII[e.llIlIlIlllll[17]] = "Juggernaut Forte";
        e.llIlIlIlIlII[e.llIlIlIlllll[18]] = "CHOPPER_FORTE_1";
        e.llIlIlIlIlII[e.llIlIlIlllll[19]] = "Chopper Forte +1";
        e.llIlIlIlIlII[e.llIlIlIlllll[20]] = "SPIKER";
        e.llIlIlIlIlII[e.llIlIlIlllll[21]] = "Spiker!";
        e.llIlIlIlIlII[e.llIlIlIlllll[22]] = "SAW_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[23]] = "Saw Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[24]] = "DEFENDERS_EDGE";
        e.llIlIlIlIlII[e.llIlIlIlllll[25]] = "Defenders Edge";
        e.llIlIlIlIlII[e.llIlIlIlllll[26]] = "FISH_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[27]] = "Fish Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[28]] = "MEDUSA_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[29]] = "Medusa Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[30]] = "STILETTO_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[31]] = "Stiletto Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[32]] = "GLADIUS_EDGE";
        e.llIlIlIlIlII[e.llIlIlIlllll[33]] = "Gladius Edge";
        e.llIlIlIlIlII[e.llIlIlIlllll[34]] = "FLAMBERGE_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[35]] = "Flamberge Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[36]] = "SERPENT_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[37]] = "Serpent Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[38]] = "CLAYMORE_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[39]] = "Claymore Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[40]] = "FLEUR_DE_BLADE";
        e.llIlIlIlIlII[e.llIlIlIlllll[41]] = "Fleur de Blade";
        e.llIlIlIlIlII[e.llIlIlIlllll[42]] = "CHOPPA";
        e.llIlIlIlIlII[e.llIlIlIlllll[43]] = "Choppa!";
        e.llIlIlIlIlII[e.llIlIlIlllll[44]] = "PEOPLE_POKER_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[45]] = "People Poker Point";
        e.llIlIlIlIlII[e.llIlIlIlllll[46]] = "CHOPPER_TIP";
        e.llIlIlIlIlII[e.llIlIlIlllll[47]] = "Chopper Tip";
        e.llIlIlIlIlII[e.llIlIlIlllll[48]] = "MEDUSAS_HEAD";
        e.llIlIlIlIlII[e.llIlIlIlllll[49]] = "Medusa's Head";
        e.llIlIlIlIlII[e.llIlIlIlllll[50]] = "SERPENTS_FANG";
        e.llIlIlIlIlII[e.llIlIlIlllll[51]] = "Serpent's Fang";
        e.llIlIlIlIlII[e.llIlIlIlllll[52]] = "GLADIUS_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[53]] = "Gladius Point";
        e.llIlIlIlIlII[e.llIlIlIlllll[54]] = "SAW_TIP";
        e.llIlIlIlIlII[e.llIlIlIlllll[55]] = "Saw Tip";
        e.llIlIlIlIlII[e.llIlIlIlllll[56]] = "CORRUPTED_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[57]] = "Corrupted Point";
        e.llIlIlIlIlII[e.llIlIlIlllll[58]] = "DEFENDERS_TIP";
        e.llIlIlIlIlII[e.llIlIlIlllll[59]] = "Defenders Tip";
        e.llIlIlIlIlII[e.llIlIlIlllll[60]] = "SERRATED_TIPS";
        e.llIlIlIlIlII[e.llIlIlIlllll[61]] = "Serrated Tips";
        e.llIlIlIlIlII[e.llIlIlIlllll[62]] = "NEEDLE_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[63]] = "Needle Point";
        e.llIlIlIlIlII[e.llIlIlIlllll[64]] = "THE_POINT";
        e.llIlIlIlIlII[e.llIlIlIlllll[65]] = "The Point!";
    }

    private GameEnum12(String string2, f f2, Map<d, Integer> map) {
        this.name = string2;
        this.mouldType = f2;
        this.typeToScore = map;
    }

    public String x() {
        return this.name;
    }

}

