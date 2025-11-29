package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/b.class */
public final class b {
    private final /* synthetic */ boolean needsWaterskin;
    public static final /* synthetic */ b BEARS;
    private final /* synthetic */ String npcName;
    public static final /* synthetic */ b BANSHEES;
    private static /* synthetic */ String[] lIlIIlIIlIlll;
    private final /* synthetic */ List<Integer> requiredItems;
    public static final /* synthetic */ b BIRDS;
    public static final /* synthetic */ b CRAWLING_HANDS;
    private static final /* synthetic */ Map<String, b> TASK_CACHE;
    public static final /* synthetic */ b MONKEYS;
    public static final /* synthetic */ b COWS;
    private final /* synthetic */ boolean needsLightSource;
    public static final /* synthetic */ b LIZARDS;
    public static final /* synthetic */ b WOLVES;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ b SKELETONS;
    public static final /* synthetic */ b RATS;
    public static final /* synthetic */ List<String> taskNames;
    public static final /* synthetic */ b GOBLINS;
    public static final /* synthetic */ b ZOMBIES;
    private static /* synthetic */ int[] lIlIIlIIlllIl;
    public static final /* synthetic */ b GHOSTS;
    public static final /* synthetic */ b SCORPIONS;
    public static final /* synthetic */ b DWARVES;
    private final /* synthetic */ WorldArea slayerLocation;
    public static final /* synthetic */ b CAVE_BUGS;
    public static final /* synthetic */ b BATS;
    public static final /* synthetic */ b CAVE_CRAWLERS;
    public static final /* synthetic */ b CAVE_SLIME;
    public static final /* synthetic */ b MINOTAURS;
    public static final /* synthetic */ b DOGS;
    public static final /* synthetic */ b ICEFIENDS;
    public static final /* synthetic */ b KALPHITES;
    public static final /* synthetic */ b SPIDERS;
    public static final /* synthetic */ b SOURHOGS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v61, types: [boolean] */
    static {
        lIlllIlIllIIlII();
        lIlllIlIlIlIllI();
        BANSHEES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[4]], lIlIIlIIlllIl[0], lIlIIlIIlIlll[lIlIIlIIlllIl[5]], new WorldArea(lIlIIlIIlllIl[6], lIlIIlIIlllIl[7], lIlIIlIIlllIl[8], lIlIIlIIlllIl[9], lIlIIlIIlllIl[0]), List.of(Integer.valueOf(lIlIIlIIlllIl[10])));
        BATS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[11]], lIlIIlIIlllIl[2], lIlIIlIIlIlll[lIlIIlIIlllIl[12]], new WorldArea(lIlIIlIIlllIl[13], lIlIIlIIlllIl[14], lIlIIlIIlllIl[15], lIlIIlIIlllIl[16], lIlIIlIIlllIl[0]));
        BEARS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[17]], lIlIIlIIlllIl[3], lIlIIlIIlIlll[lIlIIlIIlllIl[18]], new WorldArea(lIlIIlIIlllIl[19], lIlIIlIIlllIl[20], lIlIIlIIlllIl[21], lIlIIlIIlllIl[21], lIlIIlIIlllIl[0]));
        CAVE_CRAWLERS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[22]], lIlIIlIIlllIl[4], lIlIIlIIlIlll[lIlIIlIIlllIl[23]], new WorldArea(lIlIIlIIlllIl[24], lIlIIlIIlllIl[25], lIlIIlIIlllIl[26], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]));
        COWS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[28]], lIlIIlIIlllIl[5], lIlIIlIIlIlll[lIlIIlIIlllIl[29]], new WorldArea(lIlIIlIIlllIl[30], lIlIIlIIlllIl[31], lIlIIlIIlllIl[32], lIlIIlIIlllIl[33], lIlIIlIIlllIl[0]));
        CRAWLING_HANDS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[34]], lIlIIlIIlllIl[11], lIlIIlIIlIlll[lIlIIlIIlllIl[35]], new WorldArea(lIlIIlIIlllIl[36], lIlIIlIIlllIl[37], lIlIIlIIlllIl[38], lIlIIlIIlllIl[39], lIlIIlIIlllIl[0]));
        GHOSTS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[40]], lIlIIlIIlllIl[12], lIlIIlIIlIlll[lIlIIlIIlllIl[41]], new WorldArea(lIlIIlIIlllIl[42], lIlIIlIIlllIl[43], lIlIIlIIlllIl[35], lIlIIlIIlllIl[39], lIlIIlIIlllIl[0]));
        GOBLINS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[8]], lIlIIlIIlllIl[17], lIlIIlIIlIlll[lIlIIlIIlllIl[39]], new WorldArea(lIlIIlIIlllIl[44], lIlIIlIIlllIl[45], lIlIIlIIlllIl[46], lIlIIlIIlllIl[47], lIlIIlIIlllIl[0]));
        ICEFIENDS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[27]], lIlIIlIIlllIl[18], lIlIIlIIlIlll[lIlIIlIIlllIl[9]], new WorldArea(lIlIIlIIlllIl[48], lIlIIlIIlllIl[14], lIlIIlIIlllIl[49], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]));
        KALPHITES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[38]], lIlIIlIIlllIl[22], lIlIIlIIlIlll[lIlIIlIIlllIl[50]], new WorldArea(lIlIIlIIlllIl[51], lIlIIlIIlllIl[52], lIlIIlIIlllIl[39], lIlIIlIIlllIl[50], lIlIIlIIlllIl[0]));
        LIZARDS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[46]], lIlIIlIIlllIl[23], lIlIIlIIlIlll[lIlIIlIIlllIl[49]], new WorldArea(lIlIIlIIlllIl[53], lIlIIlIIlllIl[54], lIlIIlIIlllIl[55], lIlIIlIIlllIl[56], lIlIIlIIlllIl[0]), (boolean) lIlIIlIIlllIl[2], List.of(Integer.valueOf(lIlIIlIIlllIl[57])));
        MINOTAURS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[58]], lIlIIlIIlllIl[28], lIlIIlIIlIlll[lIlIIlIIlllIl[32]], new WorldArea(lIlIIlIIlllIl[59], lIlIIlIIlllIl[60], lIlIIlIIlllIl[35], lIlIIlIIlllIl[40], lIlIIlIIlllIl[0]));
        MONKEYS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[61]], lIlIIlIIlllIl[29], lIlIIlIIlIlll[lIlIIlIIlllIl[62]], new WorldArea(lIlIIlIIlllIl[63], lIlIIlIIlllIl[64], lIlIIlIIlllIl[65], lIlIIlIIlllIl[58], lIlIIlIIlllIl[0]));
        SCORPIONS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[66]], lIlIIlIIlllIl[34], lIlIIlIIlIlll[lIlIIlIIlllIl[21]], new WorldArea(lIlIIlIIlllIl[67], lIlIIlIIlllIl[68], lIlIIlIIlllIl[39], lIlIIlIIlllIl[33], lIlIIlIIlllIl[0]));
        SKELETONS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[69]], lIlIIlIIlllIl[35], lIlIIlIIlIlll[lIlIIlIIlllIl[47]], new WorldArea(lIlIIlIIlllIl[70], lIlIIlIIlllIl[71], lIlIIlIIlllIl[47], lIlIIlIIlllIl[34], lIlIIlIIlllIl[0]));
        SOURHOGS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[72]], lIlIIlIIlllIl[40], lIlIIlIIlIlll[lIlIIlIIlllIl[56]], new WorldArea(lIlIIlIIlllIl[73], lIlIIlIIlllIl[74], lIlIIlIIlllIl[61], lIlIIlIIlllIl[28], lIlIIlIIlllIl[0]), List.of(Integer.valueOf(lIlIIlIIlllIl[75])));
        SPIDERS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[76]], lIlIIlIIlllIl[41], lIlIIlIIlIlll[lIlIIlIIlllIl[16]], new WorldArea(lIlIIlIIlllIl[77], lIlIIlIIlllIl[78], lIlIIlIIlllIl[47], lIlIIlIIlllIl[58], lIlIIlIIlllIl[0]));
        ZOMBIES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[79]], lIlIIlIIlllIl[8], lIlIIlIIlIlll[lIlIIlIIlllIl[80]], new WorldArea(lIlIIlIIlllIl[81], lIlIIlIIlllIl[82], lIlIIlIIlllIl[40], lIlIIlIIlllIl[21], lIlIIlIIlllIl[0]));
        CAVE_SLIME = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[26]], lIlIIlIIlllIl[39], lIlIIlIIlIlll[lIlIIlIIlllIl[65]], new WorldArea(lIlIIlIIlllIl[83], lIlIIlIIlllIl[84], lIlIIlIIlllIl[49], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[0], lIlIIlIIlllIl[2], List.of(Integer.valueOf(lIlIIlIIlllIl[85])));
        CAVE_BUGS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[86]], lIlIIlIIlllIl[27], lIlIIlIIlIlll[lIlIIlIIlllIl[87]], new WorldArea(lIlIIlIIlllIl[88], lIlIIlIIlllIl[89], lIlIIlIIlllIl[39], lIlIIlIIlllIl[8], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[0], lIlIIlIIlllIl[2], List.of(Integer.valueOf(lIlIIlIIlllIl[85])));
        DWARVES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[90]], lIlIIlIIlllIl[9], lIlIIlIIlIlll[lIlIIlIIlllIl[33]], new WorldArea(lIlIIlIIlllIl[91], lIlIIlIIlllIl[92], lIlIIlIIlllIl[93], lIlIIlIIlllIl[94], lIlIIlIIlllIl[0]));
        WOLVES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[95]], lIlIIlIIlllIl[38], lIlIIlIIlIlll[lIlIIlIIlllIl[96]], new WorldArea(lIlIIlIIlllIl[97], lIlIIlIIlllIl[98], lIlIIlIIlllIl[21], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]));
        DOGS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[15]], lIlIIlIIlllIl[50], lIlIIlIIlIlll[lIlIIlIIlllIl[99]], new WorldArea(lIlIIlIIlllIl[100], lIlIIlIIlllIl[101], lIlIIlIIlllIl[49], lIlIIlIIlllIl[58], lIlIIlIIlllIl[0]), (boolean) lIlIIlIIlllIl[0], (boolean) lIlIIlIIlllIl[0]);
        BIRDS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[55]], lIlIIlIIlllIl[46], lIlIIlIIlIlll[lIlIIlIIlllIl[102]], new WorldArea(lIlIIlIIlllIl[103], lIlIIlIIlllIl[104], lIlIIlIIlllIl[58], lIlIIlIIlllIl[28], lIlIIlIIlllIl[0]));
        RATS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[105]], lIlIIlIIlllIl[49], lIlIIlIIlIlll[lIlIIlIIlllIl[106]], new WorldArea(lIlIIlIIlllIl[107], lIlIIlIIlllIl[108], lIlIIlIIlllIl[62], lIlIIlIIlllIl[41], lIlIIlIIlllIl[0]));
        b[] bVarArr = new b[lIlIIlIIlllIl[58]];
        bVarArr[lIlIIlIIlllIl[0]] = BANSHEES;
        bVarArr[lIlIIlIIlllIl[2]] = BATS;
        bVarArr[lIlIIlIIlllIl[3]] = BEARS;
        bVarArr[lIlIIlIIlllIl[4]] = CAVE_CRAWLERS;
        bVarArr[lIlIIlIIlllIl[5]] = COWS;
        bVarArr[lIlIIlIIlllIl[11]] = CRAWLING_HANDS;
        bVarArr[lIlIIlIIlllIl[12]] = GHOSTS;
        bVarArr[lIlIIlIIlllIl[17]] = GOBLINS;
        bVarArr[lIlIIlIIlllIl[18]] = ICEFIENDS;
        bVarArr[lIlIIlIIlllIl[22]] = KALPHITES;
        bVarArr[lIlIIlIIlllIl[23]] = LIZARDS;
        bVarArr[lIlIIlIIlllIl[28]] = MINOTAURS;
        bVarArr[lIlIIlIIlllIl[29]] = MONKEYS;
        bVarArr[lIlIIlIIlllIl[34]] = SCORPIONS;
        bVarArr[lIlIIlIIlllIl[35]] = SKELETONS;
        bVarArr[lIlIIlIIlllIl[40]] = SOURHOGS;
        bVarArr[lIlIIlIIlllIl[41]] = SPIDERS;
        bVarArr[lIlIIlIIlllIl[8]] = ZOMBIES;
        bVarArr[lIlIIlIIlllIl[39]] = CAVE_SLIME;
        bVarArr[lIlIIlIIlllIl[27]] = CAVE_BUGS;
        bVarArr[lIlIIlIIlllIl[9]] = DWARVES;
        bVarArr[lIlIIlIIlllIl[38]] = WOLVES;
        bVarArr[lIlIIlIIlllIl[50]] = DOGS;
        bVarArr[lIlIIlIIlllIl[46]] = BIRDS;
        bVarArr[lIlIIlIIlllIl[49]] = RATS;
        $VALUES = bVarArr;
        String[] strArr = new String[lIlIIlIIlllIl[58]];
        strArr[lIlIIlIIlllIl[0]] = lIlIIlIIlIlll[lIlIIlIIlllIl[109]];
        strArr[lIlIIlIIlllIl[2]] = lIlIIlIIlIlll[lIlIIlIIlllIl[110]];
        strArr[lIlIIlIIlllIl[3]] = lIlIIlIIlIlll[lIlIIlIIlllIl[111]];
        strArr[lIlIIlIIlllIl[4]] = lIlIIlIIlIlll[lIlIIlIIlllIl[112]];
        strArr[lIlIIlIIlllIl[5]] = lIlIIlIIlIlll[lIlIIlIIlllIl[113]];
        strArr[lIlIIlIIlllIl[11]] = lIlIIlIIlIlll[lIlIIlIIlllIl[94]];
        strArr[lIlIIlIIlllIl[12]] = lIlIIlIIlIlll[lIlIIlIIlllIl[114]];
        strArr[lIlIIlIIlllIl[17]] = lIlIIlIIlIlll[lIlIIlIIlllIl[115]];
        strArr[lIlIIlIIlllIl[18]] = lIlIIlIIlIlll[lIlIIlIIlllIl[93]];
        strArr[lIlIIlIIlllIl[22]] = lIlIIlIIlIlll[lIlIIlIIlllIl[116]];
        strArr[lIlIIlIIlllIl[23]] = lIlIIlIIlIlll[lIlIIlIIlllIl[117]];
        strArr[lIlIIlIIlllIl[28]] = lIlIIlIIlIlll[lIlIIlIIlllIl[118]];
        strArr[lIlIIlIIlllIl[29]] = lIlIIlIIlIlll[lIlIIlIIlllIl[119]];
        strArr[lIlIIlIIlllIl[34]] = lIlIIlIIlIlll[lIlIIlIIlllIl[120]];
        strArr[lIlIIlIIlllIl[35]] = lIlIIlIIlIlll[lIlIIlIIlllIl[121]];
        strArr[lIlIIlIIlllIl[40]] = lIlIIlIIlIlll[lIlIIlIIlllIl[122]];
        strArr[lIlIIlIIlllIl[41]] = lIlIIlIIlIlll[lIlIIlIIlllIl[123]];
        strArr[lIlIIlIIlllIl[8]] = lIlIIlIIlIlll[lIlIIlIIlllIl[124]];
        strArr[lIlIIlIIlllIl[39]] = lIlIIlIIlIlll[lIlIIlIIlllIl[125]];
        strArr[lIlIIlIIlllIl[27]] = lIlIIlIIlIlll[lIlIIlIIlllIl[126]];
        strArr[lIlIIlIIlllIl[9]] = lIlIIlIIlIlll[lIlIIlIIlllIl[127]];
        strArr[lIlIIlIIlllIl[38]] = lIlIIlIIlIlll[lIlIIlIIlllIl[128]];
        strArr[lIlIIlIIlllIl[50]] = lIlIIlIIlIlll[lIlIIlIIlllIl[129]];
        strArr[lIlIIlIIlllIl[46]] = lIlIIlIIlIlll[lIlIIlIIlllIl[130]];
        strArr[lIlIIlIIlllIl[49]] = lIlIIlIIlIlll[lIlIIlIIlllIl[131]];
        taskNames = List.of((Object[]) strArr);
        TASK_CACHE = new HashMap();
    }

    public boolean o() {
        return this.needsWaterskin;
    }

    private b(String str, int i, String str2, WorldArea worldArea, boolean z, boolean z2) {
        this.npcName = str2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = z;
        this.requiredItems = List.of(Integer.valueOf(lIlIIlIIlllIl[1]));
        this.needsLightSource = z2;
    }

    private static boolean lIlllIlIllIIlIl(int i) {
        return i == 0;
    }

    public boolean q() {
        return this.needsLightSource;
    }

    private static String lIlllIlIlIIIllI(String llllllllllllllIllIlllIlIIIlIIIII, String llllllllllllllIllIlllIlIIIIlllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIlIIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIlIIIIllllI = new StringBuilder();
        char[] llllllllllllllIllIlllIlIIIIlllIl = llllllllllllllIllIlllIlIIIIlllll.toCharArray();
        int llllllllllllllIllIlllIlIIIIlllII = lIlIIlIIlllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIlllIl[0];
        while (lIlllIlIllIlIIl(i, length)) {
            llllllllllllllIllIlllIlIIIIllllI.append((char) (charArray[i] ^ llllllllllllllIllIlllIlIIIIlllIl[llllllllllllllIllIlllIlIIIIlllII % llllllllllllllIllIlllIlIIIIlllIl.length]));
            "".length();
            llllllllllllllIllIlllIlIIIIlllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlllIlIIIIllllI);
    }

    private static boolean lIlllIlIllIIlll(int i) {
        return i != 0;
    }

    private static String lIlllIlIlIIIlll(String llllllllllllllIllIlllIlIIIllllIl, String llllllllllllllIllIlllIlIIIlllIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlllIlIIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIIIlllIlI.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlllIl[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIIlllIl[3], llllllllllllllIllIlllIlIIlIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIlIIIlllllI) {
            llllllllllllllIllIlllIlIIIlllllI.printStackTrace();
            return null;
        }
    }

    public List<Integer> p() {
        return this.requiredItems;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public String m() {
        return this.npcName;
    }

    private b(String str, int i, String str2, WorldArea worldArea, boolean z, boolean z2, List list) {
        this.npcName = str2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = z;
        this.needsLightSource = z2;
        this.requiredItems = list;
    }

    private static void lIlllIlIlIlIllI() {
        lIlIIlIIlIlll = new String[lIlIIlIIlllIl[132]];
        lIlIIlIIlIlll[lIlIIlIIlllIl[0]] = lIlllIlIlIIIllI("AS8zCg==", "VJRxz");
        lIlIIlIIlIlll[lIlIIlIIlllIl[2]] = lIlllIlIlIIIllI("ICMtOzI=", "eRXRB");
        lIlIIlIIlIlll[lIlIIlIIlllIl[3]] = lIlllIlIlIIIllI("CQ0tNSkIQSQpIBc=", "zaLLL");
        lIlIIlIIlIlll[lIlIIlIIlllIl[4]] = lIlllIlIlIIIlll("I03BxSQv6lygvY7Jh1FtSw==", "nbBdL");
        lIlIIlIIlIlll[lIlIIlIIlllIl[5]] = lIlllIlIlIIIlll("3QyXd8YkU/o=", "nlcdR");
        lIlIIlIIlIlll[lIlIIlIIlllIl[11]] = lIlllIlIlIIIlll("uB83p/cmNGg=", "YONvX");
        lIlIIlIIlIlll[lIlIIlIIlllIl[12]] = lIlllIlIlIIIllI("JRE7", "gpOPE");
        lIlIIlIIlIlll[lIlIIlIIlllIl[17]] = lIlllIlIlIIIllI("BjUUKBI=", "DpUzA");
        lIlIIlIIlIlll[lIlIIlIIlllIl[18]] = lIlllIlIlIIIllI("FT0mAQ==", "WXGsY");
        lIlIIlIIlIlll[lIlIIlIIlllIl[22]] = lIlllIlIlIIIlll("SQnz94cEVaJwlwOyN4VR/g==", "uceNZ");
        lIlIIlIIlIlll[lIlIIlIIlllIl[23]] = lIlllIlIlIIlIII("BrFczhGiNjuv2w3lBi6spw==", "ZbMnr");
        lIlIIlIIlIlll[lIlIIlIIlllIl[28]] = lIlllIlIlIIIllI("OSUYHA==", "zjOON");
        lIlIIlIIlIlll[lIlIIlIIlllIl[29]] = lIlllIlIlIIIlll("1jkUnUg1mqY=", "LczBN");
        lIlIIlIIlIlll[lIlIIlIIlllIl[34]] = lIlllIlIlIIIlll("0O8lv6hjKbzLye1z6vU3hg==", "rivtM");
        lIlIIlIIlIlll[lIlIIlIIlllIl[35]] = lIlllIlIlIIIllI("DiUIPykkOQ5oDSw5DQ==", "MWiHE");
        lIlIIlIIlIlll[lIlIIlIIlllIl[40]] = lIlllIlIlIIIllI("CCsDGAwc", "OcLKX");
        lIlIIlIIlIlll[lIlIIlIIlllIl[41]] = lIlllIlIlIIlIII("a3Acp/gp6bk=", "OCKQw");
        lIlIIlIIlIlll[lIlIIlIIlllIl[8]] = lIlllIlIlIIIllI("CgYEAzwDGg==", "MIFOu");
        lIlIIlIIlIlll[lIlIIlIIlllIl[39]] = lIlllIlIlIIIlll("1k+zb4xugeI=", "YBMFh");
        lIlIIlIIlIlll[lIlIIlIIlllIl[27]] = lIlllIlIlIIIlll("6xQZXaK8gVLhp/0OUR4qZQ==", "EGVTZ");
        lIlIIlIIlIlll[lIlIIlIIlllIl[9]] = lIlllIlIlIIlIII("hGESgTI8P1qd8FGFebhgOA==", "DYZUt");
        lIlIIlIIlIlll[lIlIIlIIlllIl[38]] = lIlllIlIlIIIllI("ITgIHA4jLQEf", "jyDLF");
        lIlIIlIIlIlll[lIlIIlIIlllIl[50]] = lIlllIlIlIIlIII("EcKLuFDwadIzjOR2AGQcEA==", "pWPmU");
        lIlIIlIIlIlll[lIlIIlIIlllIl[46]] = lIlllIlIlIIIlll("1SWhfDej6+o=", "JxQaW");
        lIlIIlIIlIlll[lIlIIlIIlllIl[49]] = lIlllIlIlIIIllI("KT4rAhgB", "eWQcj");
        lIlIIlIIlIlll[lIlIIlIIlllIl[58]] = lIlllIlIlIIlIII("hoBU6AnBvUj37OyW6PkaPQ==", "ltwQJ");
        lIlIIlIIlIlll[lIlIIlIIlllIl[32]] = lIlllIlIlIIIllI("CTovGBUlJjM=", "DSAwa");
        lIlIIlIIlIlll[lIlIIlIIlllIl[61]] = lIlllIlIlIIlIII("ViXlmyjc+yU=", "sfOpz");
        lIlIIlIIlIlll[lIlIIlIIlllIl[62]] = lIlllIlIlIIIllI("DiUJGSA6", "CJgrE");
        lIlIIlIIlIlll[lIlIIlIIlllIl[66]] = lIlllIlIlIIlIII("gHMsAkUBe+m4BLYrD7edWA==", "rDmaa");
        lIlIIlIIlIlll[lIlIIlIIlllIl[21]] = lIlllIlIlIIIlll("BRYDq/uGC3D6JXatPbEjcQ==", "ypjEC");
        lIlIIlIIlIlll[lIlIIlIIlllIl[69]] = lIlllIlIlIIIlll("hpC4W9gpETCYy3yLcBySzQ==", "YSKob");
        lIlIIlIIlIlll[lIlIIlIIlllIl[47]] = lIlllIlIlIIIlll("O2QT7aTGGoVPh+aWQn6QOw==", "MnGdu");
        lIlIIlIIlIlll[lIlIIlIIlllIl[72]] = lIlllIlIlIIIlll("SZDkTjUe5y5RION2/p/EZg==", "teAnI");
        lIlIIlIIlIlll[lIlIIlIIlllIl[56]] = lIlllIlIlIIIlll("zjaNQcLs3lA=", "MDIGz");
        lIlIIlIIlIlll[lIlIIlIIlllIl[76]] = lIlllIlIlIIIllI("MjQqFTYzNw==", "adcQs");
        lIlIIlIIlIlll[lIlIIlIIlllIl[16]] = lIlllIlIlIIlIII("IdLL9w9ZfdA=", "IjbAQ");
        lIlIIlIIlIlll[lIlIIlIIlllIl[79]] = lIlllIlIlIIlIII("lstSf1y9aQY=", "rwrda");
        lIlIIlIIlIlll[lIlIIlIIlllIl[80]] = lIlllIlIlIIIlll("CgiTkbffIeM=", "NavAL");
        lIlIIlIIlIlll[lIlIIlIIlllIl[26]] = lIlllIlIlIIlIII("n6iN6RAIUl/Jcibcx3NW3Q==", "Ohdxz");
        lIlIIlIIlIlll[lIlIIlIIlllIl[65]] = lIlllIlIlIIlIII("JvvokSnCnpkMETqyX/4hXQ==", "ITyMw");
        lIlIIlIIlIlll[lIlIIlIIlllIl[86]] = lIlllIlIlIIIlll("B5r+XivWG77rUMfw+U2vdw==", "BkrSF");
        lIlIIlIIlIlll[lIlIIlIIlllIl[87]] = lIlllIlIlIIlIII("qZYjJWSXNvHMjmVTXtTEhw==", "FdDTB");
        lIlIIlIIlIlll[lIlIIlIIlllIl[90]] = lIlllIlIlIIlIII("1psq19r3N7k=", "Vjrid");
        lIlIIlIIlIlll[lIlIIlIIlllIl[33]] = lIlllIlIlIIlIII("fx03bdAb6vo=", "ZWGbq");
        lIlIIlIIlIlll[lIlIIlIIlllIl[95]] = lIlllIlIlIIIlll("Zu/AKIZ8f+c=", "NuDEw");
        lIlIIlIIlIlll[lIlIIlIIlllIl[96]] = lIlllIlIlIIIllI("PxUFFg==", "hzipj");
        lIlIIlIIlIlll[lIlIIlIIlllIl[15]] = lIlllIlIlIIIllI("Mic9Cg==", "vhzYC");
        lIlIIlIIlIlll[lIlIIlIIlllIl[99]] = lIlllIlIlIIIlll("yA0S3ztqqFrBZFaLVxn+wA==", "xKtZd");
        lIlIIlIIlIlll[lIlIIlIIlllIl[55]] = lIlllIlIlIIIllI("KCYKPSs=", "joXyx");
        lIlIIlIIlIlll[lIlIIlIIlllIl[102]] = lIlllIlIlIIIllI("HzweEgQuchkfDCk5Hxk=", "JRzwe");
        lIlIIlIIlIlll[lIlIIlIIlllIl[105]] = lIlllIlIlIIIllI("GA0jKw==", "JLwxS");
        lIlIIlIIlIlll[lIlIIlIIlllIl[106]] = lIlllIlIlIIlIII("hVu/p52/Rtk=", "USlDD");
        lIlIIlIIlIlll[lIlIIlIIlllIl[109]] = lIlllIlIlIIIllI("JhEsKgkhFTE=", "DpBYa");
        lIlIIlIIlIlll[lIlIIlIIlllIl[110]] = lIlllIlIlIIlIII("1IXUaFPNxK4=", "BXTpz");
        lIlIIlIIlIlll[lIlIIlIIlllIl[111]] = lIlllIlIlIIlIII("GTWFC1SxWrM=", "RzMbF");
        lIlIIlIIlIlll[lIlIIlIIlllIl[112]] = lIlllIlIlIIIlll("Dd2Zsk6SJE3e0pzXgyzOUA==", "VeEnJ");
        lIlIIlIIlIlll[lIlIIlIIlllIl[113]] = lIlllIlIlIIIllI("FD07Ng==", "wRLEs");
        lIlIIlIIlIlll[lIlIIlIIlllIl[94]] = lIlllIlIlIIlIII("WilHoGGECcyoMDcV9sEjfg==", "AxZva");
        lIlIIlIIlIlll[lIlIIlIIlllIl[114]] = lIlllIlIlIIIlll("XSt8QEb+eCs=", "wRAtY");
        lIlIIlIIlIlll[lIlIIlIIlllIl[115]] = lIlllIlIlIIIllI("BiEvKx0PPQ==", "aNMGt");
        lIlIIlIIlIlll[lIlIIlIIlllIl[93]] = lIlllIlIlIIIlll("Sw2PtO/32TnmP9U+yegkZw==", "zjOsi");
        lIlIIlIIlIlll[lIlIIlIIlllIl[116]] = lIlllIlIlIIlIII("AhY6gmAIs0ztFB2e8Ior5Q==", "IiLil");
        lIlIIlIIlIlll[lIlIIlIIlllIl[117]] = lIlllIlIlIIIllI("ARoADSMJAA==", "mszlQ");
        lIlIIlIIlIlll[lIlIIlIIlllIl[118]] = lIlllIlIlIIIllI("JgoUBh4qFgga", "Kczij");
        lIlIIlIIlIlll[lIlIIlIIlllIl[119]] = lIlllIlIlIIIlll("2Sc1J3lzWAM=", "zYCFt");
        lIlIIlIIlIlll[lIlIIlIIlllIl[120]] = lIlllIlIlIIIllI("NDkJARwuNQgA", "GZfsl");
        lIlIIlIIlIlll[lIlIIlIIlllIl[121]] = lIlllIlIlIIIlll("pQ/dR5QuFFGYRPi0c/pEiQ==", "oFPGA");
        lIlIIlIIlIlll[lIlIIlIIlllIl[122]] = lIlllIlIlIIIlll("NCQJvAQFXkUDcRVEznnYfg==", "FlwSS");
        lIlIIlIIlIlll[lIlIIlIIlllIl[123]] = lIlllIlIlIIlIII("268CTktFqjg=", "auzXT");
        lIlIIlIIlIlll[lIlIIlIIlllIl[124]] = lIlllIlIlIIlIII("E+puwdKbpOI=", "AaCFS");
        lIlIIlIIlIlll[lIlIIlIIlllIl[125]] = lIlllIlIlIIIlll("C0Dar4qJDY3ZiygIWvEygQ==", "JXerV");
        lIlIIlIIlIlll[lIlIIlIIlllIl[126]] = lIlllIlIlIIIlll("tRBZhj8r5UsWaYOwCj9HbQ==", "qnrth");
        lIlIIlIIlIlll[lIlIIlIIlllIl[127]] = lIlllIlIlIIlIII("JNQAxAI35Gw=", "LfeUW");
        lIlIIlIIlIlll[lIlIIlIIlllIl[128]] = lIlllIlIlIIlIII("5DYaP5kufUU=", "vpANv");
        lIlIIlIIlIlll[lIlIIlIIlllIl[129]] = lIlllIlIlIIIlll("1GnhzP+0VHs=", "DCXGN");
        lIlIIlIIlIlll[lIlIIlIIlllIl[130]] = lIlllIlIlIIlIII("3nudXxBfZhc=", "TcAGc");
        lIlIIlIIlIlll[lIlIIlIIlllIl[131]] = lIlllIlIlIIIlll("PfvJNvM5AbQ=", "CoBHL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    private b(String str, int i, String str2, WorldArea worldArea) {
        this.npcName = str2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = lIlIIlIIlllIl[0];
        this.requiredItems = List.of(Integer.valueOf(lIlIIlIIlllIl[1]));
        this.needsLightSource = lIlIIlIIlllIl[0];
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    public boolean l() {
        if (!lIlllIlIllIIllI(this.requiredItems.get(lIlIIlIIlllIl[0]).intValue(), lIlIIlIIlllIl[1]) && !lIlllIlIllIIlll(Equipment.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIlIIlIlll[lIlIIlIIlllIl[3]]);
        }) ? 1 : 0)) {
            for (Integer num : this.requiredItems) {
                int intValue = num.intValue();
                int[] iArr = new int[lIlIIlIIlllIl[2]];
                iArr[lIlIIlIIlllIl[0]] = intValue;
                if (lIlllIlIllIIlll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIIlIIlllIl[2]];
                    iArr2[lIlIIlIIlllIl[0]] = intValue;
                    Item first = Inventory.getFirst(iArr2);
                    String[] strArr = new String[lIlIIlIIlllIl[2]];
                    strArr[lIlIIlIIlllIl[0]] = lIlIIlIIlIlll[lIlIIlIIlllIl[0]];
                    if (lIlllIlIllIIlll(first.hasAction(strArr) ? 1 : 0)) {
                        int[] iArr3 = new int[lIlIIlIIlllIl[2]];
                        iArr3[lIlIIlIIlllIl[0]] = intValue;
                        Item first2 = Inventory.getFirst(iArr3);
                        String[] strArr2 = new String[lIlIIlIIlllIl[2]];
                        strArr2[lIlIIlIIlllIl[0]] = lIlIIlIIlIlll[lIlIIlIIlllIl[2]];
                        if (lIlllIlIllIIlIl(first2.hasAction(strArr2) ? 1 : 0)) {
                        }
                    }
                    return lIlIIlIIlllIl[2];
                }
                int[] iArr4 = new int[lIlIIlIIlllIl[2]];
                iArr4[lIlIIlIIlllIl[0]] = intValue;
                if (lIlllIlIllIIlll(Equipment.contains(iArr4) ? 1 : 0)) {
                    return lIlIIlIIlllIl[2];
                }
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return ((132 ^ 191) ^ (181 ^ 165)) & (((160 ^ 136) ^ "   ".length()) ^ (-" ".length()));
                }
            }
            return lIlIIlIIlllIl[0];
        }
        return lIlIIlIIlllIl[2];
    }

    private static boolean lIlllIlIllIlIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIlllIlIlIIlIII(String llllllllllllllIllIlllIlIIIllIIII, String llllllllllllllIllIlllIlIIIlIllll) {
        try {
            SecretKeySpec llllllllllllllIllIlllIlIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIlllIl[3], llllllllllllllIllIlllIlIIIllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIlIIIllIIIl) {
            llllllllllllllIllIlllIlIIIllIIIl.printStackTrace();
            return null;
        }
    }

    public static b b(String str) {
        if (lIlllIlIllIIlIl(taskNames.contains(str) ? 1 : 0)) {
            return null;
        }
        return TASK_CACHE.getOrDefault(str, values()[taskNames.indexOf(str)]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    private b(String str, int i, String str2, WorldArea worldArea, boolean z, List list) {
        this.npcName = str2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = z;
        this.requiredItems = list;
        this.needsLightSource = lIlIIlIIlllIl[0];
    }

    private static boolean lIlllIlIllIIllI(int i, int i2) {
        return i == i2;
    }

    public WorldArea n() {
        return this.slayerLocation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    private b(String str, int i, String str2, WorldArea worldArea, List list) {
        this.npcName = str2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = lIlIIlIIlllIl[0];
        this.requiredItems = list;
        this.needsLightSource = lIlIIlIIlllIl[0];
    }

    private static void lIlllIlIllIIlII() {
        lIlIIlIIlllIl = new int[133];
        lIlIIlIIlllIl[0] = ((71 ^ 72) ^ (38 ^ 74)) & (((((188 + 146) - 189) + 64) ^ (((161 + 10) - 108) + 115)) ^ (-" ".length()));
        lIlIIlIIlllIl[1] = -" ".length();
        lIlIIlIIlllIl[2] = " ".length();
        lIlIIlIIlllIl[3] = "  ".length();
        lIlIIlIIlllIl[4] = "   ".length();
        lIlIIlIIlllIl[5] = 71 ^ 67;
        lIlIIlIIlllIl[6] = (-((-1027) & 30342)) & (-17) & 32767;
        lIlIIlIIlllIl[7] = (-((-9231) & 30239)) & (-8225) & 32763;
        lIlIIlIIlllIl[8] = 188 ^ 173;
        lIlIIlIIlllIl[9] = (30 ^ 16) ^ (174 ^ 180);
        lIlIIlIIlllIl[10] = (-17825) & 21990;
        lIlIIlIIlllIl[11] = 12 ^ 9;
        lIlIIlIIlllIl[12] = 157 ^ 155;
        lIlIIlIIlllIl[13] = (-((-2585) & 14939)) & (-513) & 16223;
        lIlIIlIIlllIl[14] = (-((-11677) & 32703)) & (-65) & 24559;
        lIlIIlIIlllIl[15] = 162 ^ 141;
        lIlIIlIIlllIl[16] = (((94 + 78) - 159) + 169) ^ (((76 + 117) - 113) + 66);
        lIlIIlIIlllIl[17] = 188 ^ 187;
        lIlIIlIIlllIl[18] = 86 ^ 94;
        lIlIIlIIlllIl[19] = (-16511) & 19199;
        lIlIIlIIlllIl[20] = (-20737) & 24062;
        lIlIIlIIlllIl[21] = 3 ^ 29;
        lIlIIlIIlllIl[22] = 164 ^ 173;
        lIlIIlIIlllIl[23] = (((72 + 18) - 53) + 121) ^ (((91 + 137) - 199) + 119);
        lIlIIlIIlllIl[24] = (-9475) & 12247;
        lIlIIlIIlllIl[25] = (-((-8469) & 31167)) & (-81) & 32767;
        lIlIIlIIlllIl[26] = (99 ^ 114) ^ (244 ^ 194);
        lIlIIlIIlllIl[27] = 179 ^ 160;
        lIlIIlIIlllIl[28] = 130 ^ 137;
        lIlIIlIIlllIl[29] = (138 ^ 141) ^ (71 ^ 76);
        lIlIIlIIlllIl[30] = (-12888) & 16127;
        lIlIIlIIlllIl[31] = (-4105) & 7359;
        lIlIIlIIlllIl[32] = 96 ^ 122;
        lIlIIlIIlllIl[33] = (6 ^ 98) ^ (216 ^ 144);
        lIlIIlIIlllIl[34] = (((56 + 64) - (-21)) + 14) ^ (((35 + 5) - (-78)) + 32);
        lIlIIlIIlllIl[35] = 151 ^ 153;
        lIlIIlIIlllIl[36] = (-20625) & 24029;
        lIlIIlIIlllIl[37] = (-((-2457) & 27550)) & (-4097) & 32751;
        lIlIIlIIlllIl[38] = 146 ^ 135;
        lIlIIlIIlllIl[39] = 82 ^ 64;
        lIlIIlIIlllIl[40] = 128 ^ 143;
        lIlIIlIIlllIl[41] = (((144 + 102) - 133) + 40) ^ (((75 + 8) - (-29)) + 25);
        lIlIIlIIlllIl[42] = (-30980) & 32635;
        lIlIIlIIlllIl[43] = (-134) & 10149;
        lIlIIlIIlllIl[44] = (-8453) & 11693;
        lIlIIlIIlllIl[45] = (-((-14481) & 31161)) & (-12353) & 32255;
        lIlIIlIIlllIl[46] = (33 ^ 7) ^ (241 ^ 192);
        lIlIIlIIlllIl[47] = (117 ^ 42) ^ (((90 + 1) - 83) + 119);
        lIlIIlIIlllIl[48] = (-1093) & 4086;
        lIlIIlIIlllIl[49] = (108 ^ 101) ^ (75 ^ 90);
        lIlIIlIIlllIl[50] = (((13 + 45) - (-35)) + 37) ^ (((127 + 24) - 62) + 59);
        lIlIIlIIlllIl[51] = (-25345) & 28659;
        lIlIIlIIlllIl[52] = (-((-9861) & 28390)) & (-651) & 28671;
        lIlIIlIIlllIl[53] = (-24769) & 28157;
        lIlIIlIIlllIl[54] = (-21561) & 24575;
        lIlIIlIIlllIl[55] = 136 ^ 185;
        lIlIIlIIlllIl[56] = (((89 + 59) - 139) + 121) ^ (((67 + 58) - 73) + 108);
        lIlIIlIIlllIl[57] = (-((-11625) & 28030)) & (-1409) & 24509;
        lIlIIlIIlllIl[58] = 65 ^ 88;
        lIlIIlIIlllIl[59] = (-8355) & 10223;
        lIlIIlIIlllIl[60] = (-((-2059) & 11055)) & (-2180) & 16383;
        lIlIIlIIlllIl[61] = 90 ^ 65;
        lIlIIlIIlllIl[62] = 169 ^ 181;
        lIlIIlIIlllIl[63] = (-29994) & 32763;
        lIlIIlIIlllIl[64] = (-8198) & 11183;
        lIlIIlIIlllIl[65] = (115 ^ 108) ^ (103 ^ 80);
        lIlIIlIIlllIl[66] = (226 ^ 149) ^ (27 ^ 113);
        lIlIIlIIlllIl[67] = (-25381) & 28670;
        lIlIIlIIlllIl[68] = (-20742) & 24015;
        lIlIIlIIlllIl[69] = 119 ^ 104;
        lIlIIlIIlllIl[70] = (-((-1765) & 6125)) & (-16578) & 24041;
        lIlIIlIIlllIl[71] = (-((-1715) & 18163)) & (-257) & 26607;
        lIlIIlIIlllIl[72] = (113 ^ 47) ^ (((61 + 93) - 64) + 37);
        lIlIIlIIlllIl[73] = (-(((126 + 78) - 37) + 12)) & (-29185) & 32511;
        lIlIIlIIlllIl[74] = (-6689) & 16381;
        lIlIIlIIlllIl[75] = (-6273) & 31214;
        lIlIIlIIlllIl[76] = (((12 + 94) - 95) + 127) ^ (((57 + 23) - (-26)) + 63);
        lIlIIlIIlllIl[77] = (-25121) & 28277;
        lIlIIlIIlllIl[78] = (-4609) & 7837;
        lIlIIlIIlllIl[79] = 139 ^ 174;
        lIlIIlIIlllIl[80] = (114 ^ 68) ^ (4 ^ 20);
        lIlIIlIIlllIl[81] = (-25487) & 28623;
        lIlIIlIIlllIl[82] = (-288) & 10175;
        lIlIIlIIlllIl[83] = (-((-17509) & 30190)) & (-17) & 15869;
        lIlIIlIIlllIl[84] = (-((-269) & 22973)) & (-521) & 32763;
        lIlIIlIIlllIl[85] = (-25657) & 30207;
        lIlIIlIIlllIl[86] = (96 ^ 33) ^ (51 ^ 91);
        lIlIIlIIlllIl[87] = 28 ^ 54;
        lIlIIlIIlllIl[88] = (-((-3371) & 12219)) & (-5) & 12029;
        lIlIIlIIlllIl[89] = (-2619) & 12159;
        lIlIIlIIlllIl[90] = (((3 + 46) - 13) + 104) ^ (((38 + 146) - 136) + 119);
        lIlIIlIIlllIl[91] = (-24635) & 27642;
        lIlIIlIIlllIl[92] = (-4489) & 14287;
        lIlIIlIIlllIl[93] = (117 ^ 63) ^ (182 ^ 193);
        lIlIIlIIlllIl[94] = (35 ^ 109) ^ (104 ^ 28);
        lIlIIlIIlllIl[95] = 36 ^ 9;
        lIlIIlIIlllIl[96] = (100 ^ 76) ^ (156 ^ 154);
        lIlIIlIIlllIl[97] = (-28689) & 31517;
        lIlIIlIIlllIl[98] = (-((-28202) & 32299)) & (-25177) & 32767;
        lIlIIlIIlllIl[99] = 31 ^ 47;
        lIlIIlIIlllIl[100] = (-1025) & 3647;
        lIlIIlIIlllIl[101] = (-12819) & 16126;
        lIlIIlIIlllIl[102] = (126 ^ 106) ^ (187 ^ 157);
        lIlIIlIIlllIl[103] = (-((-2523) & 27131)) & (-4487) & 32703;
        lIlIIlIIlllIl[104] = (-((-3397) & 28023)) & (-1) & 28147;
        lIlIIlIIlllIl[105] = (229 ^ 179) ^ (221 ^ 184);
        lIlIIlIIlllIl[106] = 65 ^ 117;
        lIlIIlIIlllIl[107] = (-8228) & 11455;
        lIlIIlIIlllIl[108] = (-18726) & 28583;
        lIlIIlIIlllIl[109] = (239 ^ 129) ^ (43 ^ 112);
        lIlIIlIIlllIl[110] = 97 ^ 87;
        lIlIIlIIlllIl[111] = (((80 + 44) - 46) + 92) ^ (((25 + 88) - 72) + 116);
        lIlIIlIIlllIl[112] = (((20 + 26) - (-46)) + 79) ^ (((113 + 74) - 158) + 118);
        lIlIIlIIlllIl[113] = (108 ^ 9) ^ (4 ^ 88);
        lIlIIlIIlllIl[114] = 183 ^ 140;
        lIlIIlIIlllIl[115] = (68 ^ 115) ^ (147 ^ 152);
        lIlIIlIIlllIl[116] = (45 ^ 106) ^ (198 ^ 191);
        lIlIIlIIlllIl[117] = 34 ^ 29;
        lIlIIlIIlllIl[118] = (((14 + 34) - (-18)) + 61) ^ (157 ^ 162);
        lIlIIlIIlllIl[119] = 133 ^ 196;
        lIlIIlIIlllIl[120] = 38 ^ 100;
        lIlIIlIIlllIl[121] = "   ".length() ^ (135 ^ 199);
        lIlIIlIIlllIl[122] = 239 ^ 171;
        lIlIIlIIlllIl[123] = 224 ^ 165;
        lIlIIlIIlllIl[124] = (229 ^ 175) ^ (174 ^ 162);
        lIlIIlIIlllIl[125] = (226 ^ 152) ^ (153 ^ 164);
        lIlIIlIIlllIl[126] = (168 ^ 146) ^ (125 ^ 15);
        lIlIIlIIlllIl[127] = (((118 + 113) - 214) + 221) ^ (((156 + 91) - 133) + 53);
        lIlIIlIIlllIl[128] = (77 ^ 2) ^ (166 ^ 163);
        lIlIIlIIlllIl[129] = 79 ^ 4;
        lIlIIlIIlllIl[130] = (208 ^ 144) ^ (36 ^ 40);
        lIlIIlIIlllIl[131] = 227 ^ 174;
        lIlIIlIIlllIl[132] = 54 ^ 120;
    }
}
