package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.e  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/e.class */
public final class e {
    public static final /* synthetic */ e GLADIUS_POINT;
    public static final /* synthetic */ e SERRATED_FORTE;
    public static final /* synthetic */ e SERRATED_TIPS;
    public static final /* synthetic */ e THE_POINT;
    private final /* synthetic */ String name;
    public static final /* synthetic */ e CHOPPER_FORTE;
    public static final /* synthetic */ e JUGGERNAUT_FORTE;
    public static final /* synthetic */ e CHOPPER_FORTE_1;
    public static final /* synthetic */ e DEFENDER_BASE;
    public static final /* synthetic */ e CHOPPA;
    public static final /* synthetic */ e MEDUSA_BLADE;
    public static final /* synthetic */ e GALDIUS_RICASSO;
    public static final /* synthetic */ e STILETTO_FORTE;
    public static final /* synthetic */ e GLADIUS_EDGE;
    public static final /* synthetic */ e CHOPPER_TIP;
    public static final /* synthetic */ e SERPENT_RICASSO;
    public static final /* synthetic */ e FISH_BLADE;
    private static /* synthetic */ String[] llIlIlIlIlII;
    public static final /* synthetic */ e PEOPLE_POKER_POINT;
    private static /* synthetic */ int[] llIlIlIlllll;
    public static final /* synthetic */ e MEDUSAS_HEAD;
    private final /* synthetic */ Map<d, Integer> typeToScore;
    public static final /* synthetic */ e MEDUSA_RICASSO;
    public static final /* synthetic */ e CLAYMORE_BLADE;
    public static final /* synthetic */ e DEFENDERS_EDGE;
    public static final /* synthetic */ e SPIKER;
    public static final /* synthetic */ e CORRUPTED_POINT;
    public static final /* synthetic */ e SERPENT_BLADE;
    public static final /* synthetic */ e NEEDLE_POINT;
    public static final /* synthetic */ e DEFENDERS_TIP;
    public static final /* synthetic */ e[] values;
    public static final /* synthetic */ e SAW_BLADE;
    public static final /* synthetic */ e FLAMBERGE_BLADE;
    public static final /* synthetic */ e STILETTO_BLADE;
    private static final /* synthetic */ e[] $VALUES;
    private final /* synthetic */ f mouldType;
    public static final /* synthetic */ e FLEUR_DE_BLADE;
    public static final /* synthetic */ e DISARMING_FORTE;
    public static final /* synthetic */ e SAW_TIP;
    public static final /* synthetic */ e SERPENTS_FANG;

    private static boolean lIIIIIllIllllII(int i, int i2) {
        return i < i2;
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    static {
        lIIIIIllIlllIll();
        lIIIIIllIlllIlI();
        CHOPPER_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[0]], llIlIlIlllll[0], llIlIlIlIlII[llIlIlIlllll[1]], f.FORTE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[2]), d.LIGHT, Integer.valueOf(llIlIlIlllll[2]), d.FLAT, Integer.valueOf(llIlIlIlllll[2])));
        GALDIUS_RICASSO = new e(llIlIlIlIlII[llIlIlIlllll[3]], llIlIlIlllll[1], llIlIlIlIlII[llIlIlIlllll[4]], f.FORTE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[2]), d.HEAVY, Integer.valueOf(llIlIlIlllll[2]), d.FLAT, Integer.valueOf(llIlIlIlllll[2])));
        DISARMING_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[2]], llIlIlIlllll[3], llIlIlIlIlII[llIlIlIlllll[5]], f.FORTE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[2]), d.LIGHT, Integer.valueOf(llIlIlIlllll[2]), d.SPIKED, Integer.valueOf(llIlIlIlllll[2])));
        MEDUSA_RICASSO = new e(llIlIlIlIlII[llIlIlIlllll[6]], llIlIlIlllll[4], llIlIlIlIlII[llIlIlIlllll[7]], f.FORTE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[8]), d.HEAVY, Integer.valueOf(llIlIlIlllll[6]), d.FLAT, Integer.valueOf(llIlIlIlllll[8])));
        SERPENT_RICASSO = new e(llIlIlIlIlII[llIlIlIlllll[8]], llIlIlIlllll[2], llIlIlIlIlII[llIlIlIlllll[9]], f.FORTE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[6]), d.LIGHT, Integer.valueOf(llIlIlIlllll[8]), d.FLAT, Integer.valueOf(llIlIlIlllll[8])));
        SERRATED_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[10]], llIlIlIlllll[5], llIlIlIlIlII[llIlIlIlllll[11]], f.FORTE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[8]), d.HEAVY, Integer.valueOf(llIlIlIlllll[8]), d.SPIKED, Integer.valueOf(llIlIlIlllll[6])));
        STILETTO_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[12]], llIlIlIlllll[6], llIlIlIlIlII[llIlIlIlllll[13]], f.FORTE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[8]), d.LIGHT, Integer.valueOf(llIlIlIlllll[10]), d.FLAT, Integer.valueOf(llIlIlIlllll[8])));
        DEFENDER_BASE = new e(llIlIlIlIlII[llIlIlIlllll[14]], llIlIlIlllll[7], llIlIlIlIlII[llIlIlIlllll[15]], f.FORTE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[8]), d.HEAVY, Integer.valueOf(llIlIlIlllll[10]), d.FLAT, Integer.valueOf(llIlIlIlllll[8])));
        JUGGERNAUT_FORTE = new e(llIlIlIlIlII[llIlIlIlllll[16]], llIlIlIlllll[8], llIlIlIlIlII[llIlIlIlllll[17]], f.FORTE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[2]), d.HEAVY, Integer.valueOf(llIlIlIlllll[2]), d.SPIKED, Integer.valueOf(llIlIlIlllll[16])));
        CHOPPER_FORTE_1 = new e(llIlIlIlIlII[llIlIlIlllll[18]], llIlIlIlllll[9], llIlIlIlIlII[llIlIlIlllll[19]], f.FORTE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[4]), d.LIGHT, Integer.valueOf(llIlIlIlllll[2]), d.FLAT, Integer.valueOf(llIlIlIlllll[18])));
        SPIKER = new e(llIlIlIlIlII[llIlIlIlllll[20]], llIlIlIlllll[10], llIlIlIlIlII[llIlIlIlllll[21]], f.FORTE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[1]), d.HEAVY, Integer.valueOf(llIlIlIlllll[3]), d.SPIKED, Integer.valueOf(llIlIlIlllll[22])));
        SAW_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[22]], llIlIlIlllll[11], llIlIlIlIlII[llIlIlIlllll[23]], f.BLADE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[2]), d.LIGHT, Integer.valueOf(llIlIlIlllll[2]), d.SPIKED, Integer.valueOf(llIlIlIlllll[2])));
        DEFENDERS_EDGE = new e(llIlIlIlIlII[llIlIlIlllll[24]], llIlIlIlllll[12], llIlIlIlIlII[llIlIlIlllll[25]], f.BLADE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[2]), d.HEAVY, Integer.valueOf(llIlIlIlllll[2]), d.SPIKED, Integer.valueOf(llIlIlIlllll[2])));
        FISH_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[26]], llIlIlIlllll[13], llIlIlIlIlII[llIlIlIlllll[27]], f.BLADE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[2]), d.LIGHT, Integer.valueOf(llIlIlIlllll[2]), d.FLAT, Integer.valueOf(llIlIlIlllll[2])));
        MEDUSA_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[28]], llIlIlIlllll[14], llIlIlIlIlII[llIlIlIlllll[29]], f.BLADE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[8]), d.HEAVY, Integer.valueOf(llIlIlIlllll[8]), d.FLAT, Integer.valueOf(llIlIlIlllll[6])));
        STILETTO_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[30]], llIlIlIlllll[15], llIlIlIlIlII[llIlIlIlllll[31]], f.BLADE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[8]), d.LIGHT, Integer.valueOf(llIlIlIlllll[6]), d.FLAT, Integer.valueOf(llIlIlIlllll[8])));
        GLADIUS_EDGE = new e(llIlIlIlIlII[llIlIlIlllll[32]], llIlIlIlllll[16], llIlIlIlIlII[llIlIlIlllll[33]], f.BLADE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[6]), d.HEAVY, Integer.valueOf(llIlIlIlllll[8]), d.FLAT, Integer.valueOf(llIlIlIlllll[8])));
        FLAMBERGE_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[34]], llIlIlIlllll[17], llIlIlIlIlII[llIlIlIlllll[35]], f.BLADE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[8]), d.LIGHT, Integer.valueOf(llIlIlIlllll[8]), d.SPIKED, Integer.valueOf(llIlIlIlllll[10])));
        SERPENT_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[36]], llIlIlIlllll[18], llIlIlIlIlII[llIlIlIlllll[37]], f.BLADE, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[10]), d.LIGHT, Integer.valueOf(llIlIlIlllll[8]), d.FLAT, Integer.valueOf(llIlIlIlllll[8])));
        CLAYMORE_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[38]], llIlIlIlllll[19], llIlIlIlIlII[llIlIlIlllll[39]], f.BLADE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[16]), d.HEAVY, Integer.valueOf(llIlIlIlllll[2]), d.FLAT, Integer.valueOf(llIlIlIlllll[2])));
        FLEUR_DE_BLADE = new e(llIlIlIlIlII[llIlIlIlllll[40]], llIlIlIlllll[20], llIlIlIlIlII[llIlIlIlllll[41]], f.BLADE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[2]), d.HEAVY, Integer.valueOf(llIlIlIlllll[18]), d.SPIKED, Integer.valueOf(llIlIlIlllll[1])));
        CHOPPA = new e(llIlIlIlIlII[llIlIlIlllll[42]], llIlIlIlllll[21], llIlIlIlIlII[llIlIlIlllll[43]], f.BLADE, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[1]), d.LIGHT, Integer.valueOf(llIlIlIlllll[22]), d.FLAT, Integer.valueOf(llIlIlIlllll[3])));
        PEOPLE_POKER_POINT = new e(llIlIlIlIlII[llIlIlIlllll[44]], llIlIlIlllll[22], llIlIlIlIlII[llIlIlIlllll[45]], f.TIP, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[2]), d.HEAVY, Integer.valueOf(llIlIlIlllll[2]), d.FLAT, Integer.valueOf(llIlIlIlllll[2])));
        CHOPPER_TIP = new e(llIlIlIlIlII[llIlIlIlllll[46]], llIlIlIlllll[23], llIlIlIlIlII[llIlIlIlllll[47]], f.TIP, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[2]), d.LIGHT, Integer.valueOf(llIlIlIlllll[2]), d.SPIKED, Integer.valueOf(llIlIlIlllll[2])));
        MEDUSAS_HEAD = new e(llIlIlIlIlII[llIlIlIlllll[48]], llIlIlIlllll[24], llIlIlIlIlII[llIlIlIlllll[49]], f.TIP, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[2]), d.HEAVY, Integer.valueOf(llIlIlIlllll[2]), d.SPIKED, Integer.valueOf(llIlIlIlllll[2])));
        SERPENTS_FANG = new e(llIlIlIlIlII[llIlIlIlllll[50]], llIlIlIlllll[25], llIlIlIlIlII[llIlIlIlllll[51]], f.TIP, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[8]), d.LIGHT, Integer.valueOf(llIlIlIlllll[6]), d.SPIKED, Integer.valueOf(llIlIlIlllll[8])));
        GLADIUS_POINT = new e(llIlIlIlIlII[llIlIlIlllll[52]], llIlIlIlllll[26], llIlIlIlIlII[llIlIlIlllll[53]], f.TIP, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[8]), d.HEAVY, Integer.valueOf(llIlIlIlllll[8]), d.FLAT, Integer.valueOf(llIlIlIlllll[6])));
        SAW_TIP = new e(llIlIlIlIlII[llIlIlIlllll[54]], llIlIlIlllll[27], llIlIlIlIlII[llIlIlIlllll[55]], f.TIP, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[6]), d.HEAVY, Integer.valueOf(llIlIlIlllll[8]), d.SPIKED, Integer.valueOf(llIlIlIlllll[8])));
        CORRUPTED_POINT = new e(llIlIlIlIlII[llIlIlIlllll[56]], llIlIlIlllll[28], llIlIlIlIlII[llIlIlIlllll[57]], f.TIP, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[8]), d.LIGHT, Integer.valueOf(llIlIlIlllll[10]), d.SPIKED, Integer.valueOf(llIlIlIlllll[8])));
        DEFENDERS_TIP = new e(llIlIlIlIlII[llIlIlIlllll[58]], llIlIlIlllll[29], llIlIlIlIlII[llIlIlIlllll[59]], f.TIP, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[10]), d.HEAVY, Integer.valueOf(llIlIlIlllll[8]), d.SPIKED, Integer.valueOf(llIlIlIlllll[8])));
        SERRATED_TIPS = new e(llIlIlIlIlII[llIlIlIlllll[60]], llIlIlIlllll[30], llIlIlIlIlII[llIlIlIlllll[61]], f.TIP, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[2]), d.LIGHT, Integer.valueOf(llIlIlIlllll[16]), d.SPIKED, Integer.valueOf(llIlIlIlllll[2])));
        NEEDLE_POINT = new e(llIlIlIlIlII[llIlIlIlllll[62]], llIlIlIlllll[31], llIlIlIlIlII[llIlIlIlllll[63]], f.TIP, ImmutableMap.of(d.NARROW, Integer.valueOf(llIlIlIlllll[18]), d.LIGHT, Integer.valueOf(llIlIlIlllll[4]), d.FLAT, Integer.valueOf(llIlIlIlllll[2])));
        THE_POINT = new e(llIlIlIlIlII[llIlIlIlllll[64]], llIlIlIlllll[32], llIlIlIlIlII[llIlIlIlllll[65]], f.TIP, ImmutableMap.of(d.BROAD, Integer.valueOf(llIlIlIlllll[3]), d.LIGHT, Integer.valueOf(llIlIlIlllll[1]), d.FLAT, Integer.valueOf(llIlIlIlllll[22])));
        e[] eVarArr = new e[llIlIlIlllll[33]];
        eVarArr[llIlIlIlllll[0]] = CHOPPER_FORTE;
        eVarArr[llIlIlIlllll[1]] = GALDIUS_RICASSO;
        eVarArr[llIlIlIlllll[3]] = DISARMING_FORTE;
        eVarArr[llIlIlIlllll[4]] = MEDUSA_RICASSO;
        eVarArr[llIlIlIlllll[2]] = SERPENT_RICASSO;
        eVarArr[llIlIlIlllll[5]] = SERRATED_FORTE;
        eVarArr[llIlIlIlllll[6]] = STILETTO_FORTE;
        eVarArr[llIlIlIlllll[7]] = DEFENDER_BASE;
        eVarArr[llIlIlIlllll[8]] = JUGGERNAUT_FORTE;
        eVarArr[llIlIlIlllll[9]] = CHOPPER_FORTE_1;
        eVarArr[llIlIlIlllll[10]] = SPIKER;
        eVarArr[llIlIlIlllll[11]] = SAW_BLADE;
        eVarArr[llIlIlIlllll[12]] = DEFENDERS_EDGE;
        eVarArr[llIlIlIlllll[13]] = FISH_BLADE;
        eVarArr[llIlIlIlllll[14]] = MEDUSA_BLADE;
        eVarArr[llIlIlIlllll[15]] = STILETTO_BLADE;
        eVarArr[llIlIlIlllll[16]] = GLADIUS_EDGE;
        eVarArr[llIlIlIlllll[17]] = FLAMBERGE_BLADE;
        eVarArr[llIlIlIlllll[18]] = SERPENT_BLADE;
        eVarArr[llIlIlIlllll[19]] = CLAYMORE_BLADE;
        eVarArr[llIlIlIlllll[20]] = FLEUR_DE_BLADE;
        eVarArr[llIlIlIlllll[21]] = CHOPPA;
        eVarArr[llIlIlIlllll[22]] = PEOPLE_POKER_POINT;
        eVarArr[llIlIlIlllll[23]] = CHOPPER_TIP;
        eVarArr[llIlIlIlllll[24]] = MEDUSAS_HEAD;
        eVarArr[llIlIlIlllll[25]] = SERPENTS_FANG;
        eVarArr[llIlIlIlllll[26]] = GLADIUS_POINT;
        eVarArr[llIlIlIlllll[27]] = SAW_TIP;
        eVarArr[llIlIlIlllll[28]] = CORRUPTED_POINT;
        eVarArr[llIlIlIlllll[29]] = DEFENDERS_TIP;
        eVarArr[llIlIlIlllll[30]] = SERRATED_TIPS;
        eVarArr[llIlIlIlllll[31]] = NEEDLE_POINT;
        eVarArr[llIlIlIlllll[32]] = THE_POINT;
        $VALUES = eVarArr;
        values = values();
    }

    private static String lIIIIIllIIlIIII(String lllllllllllllllIlIIIIIllllIlIlIl, String lllllllllllllllIlIIIIIllllIlIlII) {
        String lllllllllllllllIlIIIIIllllIlIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIIIIllllIlIIlI = lllllllllllllllIlIIIIIllllIlIlII.toCharArray();
        int lllllllllllllllIlIIIIIllllIlIIIl = llIlIlIlllll[0];
        char[] charArray = lllllllllllllllIlIIIIIllllIlIlIl2.toCharArray();
        int length = charArray.length;
        int i = llIlIlIlllll[0];
        while (lIIIIIllIllllII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIIIIIllllIlIIlI[lllllllllllllllIlIIIIIllllIlIIIl % lllllllllllllllIlIIIIIllllIlIIlI.length]));
            "".length();
            lllllllllllllllIlIIIIIllllIlIIIl++;
            i++;
            "".length();
            if ((((((141 + 136) - 167) + 36) ^ (((89 + 81) - 144) + 134)) & (((((146 + 125) - 133) + 29) ^ (((14 + 61) - (-47)) + 27)) ^ (-" ".length()))) != (((200 ^ 190) ^ (88 ^ 17)) & (((42 ^ 19) ^ (116 ^ 114)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIIIIllIIlIIlI(String lllllllllllllllIlIIIIIlllllIIlIl, String lllllllllllllllIlIIIIIlllllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlllllIIlII.getBytes(StandardCharsets.UTF_8)), llIlIlIlllll[8]), "DES");
            Cipher lllllllllllllllIlIIIIIlllllIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIlllllIIlll.init(llIlIlIlllll[3], secretKeySpec);
            return new String(lllllllllllllllIlIIIIIlllllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIlllllIIllI) {
            lllllllllllllllIlIIIIIlllllIIllI.printStackTrace();
            return null;
        }
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    private static void lIIIIIllIlllIll() {
        llIlIlIlllll = new int[67];
        llIlIlIlllll[0] = ((((52 + 16) - (-116)) + 48) ^ (((152 + 42) - 54) + 54)) & (((117 ^ 24) ^ (51 ^ 116)) ^ (-" ".length()));
        llIlIlIlllll[1] = " ".length();
        llIlIlIlllll[2] = 157 ^ 153;
        llIlIlIlllll[3] = "  ".length();
        llIlIlIlllll[4] = "   ".length();
        llIlIlIlllll[5] = 59 ^ 62;
        llIlIlIlllll[6] = (((124 + 52) - 119) + 121) ^ (((147 + 30) - 80) + 83);
        llIlIlIlllll[7] = (19 ^ 15) ^ (180 ^ 175);
        llIlIlIlllll[8] = (((139 + 18) - 3) + 33) ^ (((77 + 36) - (-30)) + 36);
        llIlIlIlllll[9] = (((129 + 67) - 174) + 122) ^ (((118 + 81) - 194) + 148);
        llIlIlIlllll[10] = (28 ^ 96) ^ (10 ^ 124);
        llIlIlIlllll[11] = 35 ^ 40;
        llIlIlIlllll[12] = (((167 + 24) - 11) + 0) ^ (((90 + 78) - 36) + 52);
        llIlIlIlllll[13] = 102 ^ 107;
        llIlIlIlllll[14] = (33 ^ 98) ^ (253 ^ 176);
        llIlIlIlllll[15] = (((10 + 33) - (-34)) + 125) ^ (((124 + 114) - 166) + 125);
        llIlIlIlllll[16] = 8 ^ 24;
        llIlIlIlllll[17] = (((144 + 148) - 218) + 91) ^ (((156 + 174) - 184) + 34);
        llIlIlIlllll[18] = 81 ^ 67;
        llIlIlIlllll[19] = 32 ^ 51;
        llIlIlIlllll[20] = 66 ^ 86;
        llIlIlIlllll[21] = 101 ^ 112;
        llIlIlIlllll[22] = (137 ^ 193) ^ (21 ^ 75);
        llIlIlIlllll[23] = 78 ^ 89;
        llIlIlIlllll[24] = 161 ^ 185;
        llIlIlIlllll[25] = (221 ^ 176) ^ (204 ^ 184);
        llIlIlIlllll[26] = 118 ^ 108;
        llIlIlIlllll[27] = 188 ^ 167;
        llIlIlIlllll[28] = 56 ^ 36;
        llIlIlIlllll[29] = 95 ^ 66;
        llIlIlIlllll[30] = 14 ^ 16;
        llIlIlIlllll[31] = 101 ^ 122;
        llIlIlIlllll[32] = (147 ^ 187) ^ (105 ^ 97);
        llIlIlIlllll[33] = (((162 + 41) - 163) + 145) ^ (((28 + 73) - 21) + 72);
        llIlIlIlllll[34] = (94 ^ 109) ^ (111 ^ 126);
        llIlIlIlllll[35] = 108 ^ 79;
        llIlIlIlllll[36] = (242 ^ 173) ^ (217 ^ 162);
        llIlIlIlllll[37] = 13 ^ 40;
        llIlIlIlllll[38] = 94 ^ 120;
        llIlIlIlllll[39] = (128 ^ 190) ^ (116 ^ 109);
        llIlIlIlllll[40] = (((131 + 129) - 228) + 120) ^ (((2 + 31) - (-12)) + 131);
        llIlIlIlllll[41] = (11 ^ 83) ^ (249 ^ 136);
        llIlIlIlllll[42] = (((26 + 48) - (-53)) + 20) ^ (((6 + 141) - 62) + 100);
        llIlIlIlllll[43] = 233 ^ 194;
        llIlIlIlllll[44] = 48 ^ 28;
        llIlIlIlllll[45] = (73 ^ 81) ^ (1 ^ 52);
        llIlIlIlllll[46] = (88 ^ 11) ^ (219 ^ 166);
        llIlIlIlllll[47] = 154 ^ 181;
        llIlIlIlllll[48] = 20 ^ 36;
        llIlIlIlllll[49] = 40 ^ 25;
        llIlIlIlllll[50] = (139 ^ 188) ^ (106 ^ 111);
        llIlIlIlllll[51] = (49 ^ 36) ^ (55 ^ 17);
        llIlIlIlllll[52] = (114 ^ 75) ^ (50 ^ 63);
        llIlIlIlllll[53] = (105 ^ 34) ^ (124 ^ 2);
        llIlIlIlllll[54] = (198 ^ 150) ^ (21 ^ 115);
        llIlIlIlllll[55] = 42 ^ 29;
        llIlIlIlllll[56] = 18 ^ 42;
        llIlIlIlllll[57] = (50 ^ 2) ^ (90 ^ 83);
        llIlIlIlllll[58] = 167 ^ 157;
        llIlIlIlllll[59] = 129 ^ 186;
        llIlIlIlllll[60] = (((43 + 51) - (-67)) + 11) ^ (((18 + 135) - 102) + 93);
        llIlIlIlllll[61] = (95 ^ 3) ^ (237 ^ 140);
        llIlIlIlllll[62] = 108 ^ 82;
        llIlIlIlllll[63] = 65 ^ 126;
        llIlIlIlllll[64] = 252 ^ 188;
        llIlIlIlllll[65] = (110 ^ 48) ^ (161 ^ 190);
        llIlIlIlllll[66] = 31 ^ 93;
    }

    private static boolean lIIIIIllIllllIl(int i) {
        return i != 0;
    }

    public static e b(String str) {
        e[] eVarArr = values;
        int length = eVarArr.length;
        int i = llIlIlIlllll[0];
        while (lIIIIIllIllllII(i, length)) {
            e eVar = eVarArr[i];
            if (lIIIIIllIllllIl(eVar.name.equalsIgnoreCase(str) ? 1 : 0)) {
                return eVar;
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return null;
    }

    public int a(d dVar, d dVar2) {
        return llIlIlIlllll[0] + this.typeToScore.getOrDefault(dVar, Integer.valueOf(llIlIlIlllll[0])).intValue() + this.typeToScore.getOrDefault(dVar2, Integer.valueOf(llIlIlIlllll[0])).intValue();
    }

    private static void lIIIIIllIlllIlI() {
        llIlIlIlIlII = new String[llIlIlIlllll[66]];
        llIlIlIlIlII[llIlIlIlllll[0]] = lIIIIIllIIlIIII("ARk3GDIHAycOLRAFPQ==", "BQxHb");
        llIlIlIlIlII[llIlIlIlllll[1]] = lIIIIIllIIlIIIl("tezEfw3xpVuKuOVI3JiUKw==", "Zhhbf");
        llIlIlIlIlII[llIlIlIlllll[3]] = lIIIIIllIIlIIIl("Qy4fZh/c8/JrCWNHJYMvmQ==", "bcmWj");
        llIlIlIlIlII[llIlIlIlllll[4]] = lIIIIIllIIlIIIl("iGjngK8nOaEd/+8/z9rTAg==", "ovFKE");
        llIlIlIlIlII[llIlIlIlllll[2]] = lIIIIIllIIlIIlI("NP7heYLzKHsDaTn5gWjT/A==", "xFWJD");
        llIlIlIlIlII[llIlIlIlllll[5]] = lIIIIIllIIlIIIl("6pqHPJTqxCxgMqeXnfVvYg==", "vEdjg");
        llIlIlIlIlII[llIlIlIlllll[6]] = lIIIIIllIIlIIlI("AXqKTb1OmGP0qAK9ELx3Fg==", "defgx");
        llIlIlIlIlII[llIlIlIlllll[7]] = lIIIIIllIIlIIII("DykhLycjbBczNyM/NjU=", "BLEZT");
        llIlIlIlIlII[llIlIlIlllll[8]] = lIIIIIllIIlIIII("KQYgGyo0Fy0ZJjkCIRgg", "zCrKo");
        llIlIlIlIlII[llIlIlIlllll[9]] = lIIIIIllIIlIIII("OjE6OTEHIGgbPQo1Ozo7", "iTHIT");
        llIlIlIlIlII[llIlIlIlllll[10]] = lIIIIIllIIlIIII("JCkwMTQjKSY8Mzg+NiY=", "wlbcu");
        llIlIlIlIlII[llIlIlIlllll[11]] = lIIIIIllIIlIIlI("z2ywNchYy0Nio2NefT2InQ==", "DtBUa");
        llIlIlIlIlII[llIlIlIlllll[12]] = lIIIIIllIIlIIlI("3/cGOjQLAH1WqxwFk0bD6w==", "mNfEk");
        llIlIlIlIlII[llIlIlIlllll[13]] = lIIIIIllIIlIIIl("7INbL8mMuK79G1k2imeECQ==", "tKNQh");
        llIlIlIlIlII[llIlIlIlllll[14]] = lIIIIIllIIlIIIl("0JCo4U1eMZYYBj2zOf8Ycg==", "cYYDU");
        llIlIlIlIlII[llIlIlIlllll[15]] = lIIIIIllIIlIIIl("bmWAQ2HcFQtA1hbVcLaOaw==", "UhFXu");
        llIlIlIlIlII[llIlIlIlllll[16]] = lIIIIIllIIlIIlI("noz28w9usxPqC/UCZcC1h/cFcGXSRjgu", "BjiWc");
        llIlIlIlIlII[llIlIlIlllll[17]] = lIIIIIllIIlIIII("CRwhPQgxBycvGWMvKSgZJg==", "CiFZm");
        llIlIlIlIlII[llIlIlIlllll[18]] = lIIIIIllIIlIIlI("DGNMXWOR9FEG8XHGe3J2aw==", "kYFrb");
        llIlIlIlIlII[llIlIlIlllll[19]] = lIIIIIllIIlIIlI("BVCOAf/+Lvt25AmDqIR8zhV/AvaXq/7c", "gbWtD");
        llIlIlIlIlII[llIlIlIlllll[20]] = lIIIIIllIIlIIlI("mu+Exbp3FC8=", "aGHQs");
        llIlIlIlIlII[llIlIlIlllll[21]] = lIIIIIllIIlIIlI("NG0QwOxGXj4=", "hIkMP");
        llIlIlIlIlII[llIlIlIlllll[22]] = lIIIIIllIIlIIIl("PsN+X3Y4zc3wnJwlPTZRVw==", "Fncne");
        llIlIlIlIlII[llIlIlIlllll[23]] = lIIIIIllIIlIIIl("cKXAu48yxJRfe+MMBcem9w==", "fRgNH");
        llIlIlIlIlII[llIlIlIlllll[24]] = lIIIIIllIIlIIlI("gzCwxJoajpARaOnQQtS4lQ==", "PKpwM");
        llIlIlIlIlII[llIlIlIlllll[25]] = lIIIIIllIIlIIIl("LN7ll3d6N5czs57o9tgDdg==", "tSdGV");
        llIlIlIlIlII[llIlIlIlllll[26]] = lIIIIIllIIlIIII("HwwyJBQbCSAoDg==", "YEalK");
        llIlIlIlIlII[llIlIlIlllll[27]] = lIIIIIllIIlIIlI("u8sAKI5/GanFadj1ohs2VA==", "etpiY");
        llIlIlIlIlII[llIlIlIlllll[28]] = lIIIIIllIIlIIIl("l07/mg9qVzqE93HJwbVw2g==", "dXWBL");
        llIlIlIlIlII[llIlIlIlllll[29]] = lIIIIIllIIlIIII("DwEeLzUjRDg2JyYB", "BdzZF");
        llIlIlIlIlII[llIlIlIlllll[30]] = lIIIIIllIIlIIIl("3OcmWR2iB+pW3x2TjzAtrg==", "xCjLV");
        llIlIlIlIlII[llIlIlIlllll[31]] = lIIIIIllIIlIIlI("GaSMdDplnHg6P6YvalaJug==", "kMrQA");
        llIlIlIlIlII[llIlIlIlllll[32]] = lIIIIIllIIlIIIl("rW1ID1psWz7mm+KACsiNqQ==", "vUVaj");
        llIlIlIlIlII[llIlIlIlllll[33]] = lIIIIIllIIlIIII("DR8LDBM/AEotHi0W", "Jsjhz");
        llIlIlIlIlII[llIlIlIlllll[34]] = lIIIIIllIIlIIIl("s4LPbM1k9dr7uCaxZZtQ5w==", "GetIh");
        llIlIlIlIlII[llIlIlIlllll[35]] = lIIIIIllIIlIIIl("P9DXpNJ34B2Ec1TE2VGYVg==", "aoekM");
        llIlIlIlIlII[llIlIlIlllll[36]] = lIIIIIllIIlIIlI("+8Pt00rXfL4vW6zxlhtZbg==", "ktvJh");
        llIlIlIlIlII[llIlIlIlllll[37]] = lIIIIIllIIlIIII("CxwLAAA2DVkyCTkdHA==", "Xyype");
        llIlIlIlIlII[llIlIlIlllll[38]] = lIIIIIllIIlIIII("MB0uFCw8AyoSIz8QKwg=", "sQoMa");
        llIlIlIlIlII[llIlIlIlllll[39]] = lIIIIIllIIlIIlI("S2CIh7Lg2zjd0EF2abdX3g==", "uCuSq");
        llIlIlIlIlII[llIlIlIlllll[40]] = lIIIIIllIIlIIII("PhQQBAonHBAOGjQZERQ=", "xXUQX");
        llIlIlIlIlII[llIlIlIlllll[41]] = lIIIIIllIIlIIIl("j190MWad9s9x7AlCJxJzaQ==", "RsiBu");
        llIlIlIlIlII[llIlIlIlllll[42]] = lIIIIIllIIlIIIl("3wgiAjrXBcA=", "CRXwK");
        llIlIlIlIlII[llIlIlIlllll[43]] = lIIIIIllIIlIIlI("pv3X7+Pzp2U=", "zdJyM");
        llIlIlIlIlII[llIlIlIlllll[44]] = lIIIIIllIIlIIlI("T+ecHcsCtsbDxjr/CB00DhlU4xorEMCL", "nUGxy");
        llIlIlIlIlII[llIlIlIlllll[45]] = lIIIIIllIIlIIlI("9UB10YfXHGFPvl+vZVfqXOmtenxnYdR4", "bJxbX");
        llIlIlIlIlII[llIlIlIlllll[46]] = lIIIIIllIIlIIIl("A3UD31IYeHAx+tqYm3vt6Q==", "rDxpD");
        llIlIlIlIlII[llIlIlIlllll[47]] = lIIIIIllIIlIIII("NhEMKTcQC0MNLgU=", "uycYG");
        llIlIlIlIlII[llIlIlIlllll[48]] = lIIIIIllIIlIIIl("zAPIfPu9NTAXWyubJzA0KA==", "eoPua");
        llIlIlIlIlII[llIlIlIlllll[49]] = lIIIIIllIIlIIII("KC4OHjIEbBlLCQAqDg==", "eKjkA");
        llIlIlIlIlII[llIlIlIlllll[50]] = lIIIIIllIIlIIlI("H6f+vjtifvhSgCkAXQBUPg==", "SDpcP");
        llIlIlIlIlII[llIlIlIlllll[51]] = lIIIIIllIIlIIIl("jA2zzZsL0x2xyr31m3l7Jg==", "oHYNM");
        llIlIlIlIlII[llIlIlIlllll[52]] = lIIIIIllIIlIIlI("MUmKH24jksp2UiAt5o0eQA==", "ywjAH");
        llIlIlIlIlII[llIlIlIlllll[53]] = lIIIIIllIIlIIlI("wAsz6WFFHivoqLj8h2oU+g==", "XTVdp");
        llIlIlIlIlII[llIlIlIlllll[54]] = lIIIIIllIIlIIIl("OoNjLryifkY=", "ATYyK");
        llIlIlIlIlII[llIlIlIlllll[55]] = lIIIIIllIIlIIlI("m45WBJaVwuA=", "SXJVj");
        llIlIlIlIlII[llIlIlIlllll[56]] = lIIIIIllIIlIIlI("vAYhu7nYSYY8P1LcHEKWYw==", "VgVzA");
        llIlIlIlIlII[llIlIlIlllll[57]] = lIIIIIllIIlIIII("GzodJhYoIQowQwg6BjoX", "XUoTc");
        llIlIlIlIlII[llIlIlIlllll[58]] = lIIIIIllIIlIIlI("4BFQBvVLGaFxwytART605w==", "ZIzlt");
        llIlIlIlIlII[llIlIlIlllll[59]] = lIIIIIllIIlIIIl("nkeB7q7ejzedf40XNN+2IA==", "cJdBD");
        llIlIlIlIlII[llIlIlIlllll[60]] = lIIIIIllIIlIIlI("EWU0arGZxYkvg/flv3hf5A==", "iSUzo");
        llIlIlIlIlII[llIlIlIlllll[61]] = lIIIIIllIIlIIIl("QBIv9/Iver0P3XbhYcnE4A==", "BbJdR");
        llIlIlIlIlII[llIlIlIlllll[62]] = lIIIIIllIIlIIIl("WfZaXduPTZIl4VDh61Kg2g==", "gPJxL");
        llIlIlIlIlII[llIlIlIlllll[63]] = lIIIIIllIIlIIlI("dycyMPre66L9XMxeZuqiBg==", "cdATF");
        llIlIlIlIlII[llIlIlIlllll[64]] = lIIIIIllIIlIIII("ED0TLTELPBgm", "DuVra");
        llIlIlIlIlII[llIlIlIlllll[65]] = lIIIIIllIIlIIlI("YNkb97uXtQhV3f+cHrvHhw==", "tCOYL");
    }

    private e(String str, int i, String str2, f fVar, Map map) {
        this.name = str2;
        this.mouldType = fVar;
        this.typeToScore = map;
    }

    public String x() {
        return this.name;
    }

    private static String lIIIIIllIIlIIIl(String lllllllllllllllIlIIIIIllllllIIlI, String lllllllllllllllIlIIIIIllllllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIllllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlIlllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIIllllllIIll) {
            lllllllllllllllIlIIIIIllllllIIll.printStackTrace();
            return null;
        }
    }
}
