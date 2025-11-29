/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public final class b
extends Enum<b> {
    private final /* synthetic */ boolean needsWaterskin;
    public static final /* synthetic */ /* enum */ b BEARS;
    private final /* synthetic */ String npcName;
    public static final /* synthetic */ /* enum */ b BANSHEES;
    private static /* synthetic */ String[] lIlIIlIIlIlll;
    private final /* synthetic */ List<Integer> requiredItems;
    public static final /* synthetic */ /* enum */ b BIRDS;
    public static final /* synthetic */ /* enum */ b CRAWLING_HANDS;
    private static final /* synthetic */ Map<String, b> TASK_CACHE;
    public static final /* synthetic */ /* enum */ b MONKEYS;
    public static final /* synthetic */ /* enum */ b COWS;
    private final /* synthetic */ boolean needsLightSource;
    public static final /* synthetic */ /* enum */ b LIZARDS;
    public static final /* synthetic */ /* enum */ b WOLVES;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ /* enum */ b SKELETONS;
    public static final /* synthetic */ /* enum */ b RATS;
    public static final /* synthetic */ List<String> taskNames;
    public static final /* synthetic */ /* enum */ b GOBLINS;
    public static final /* synthetic */ /* enum */ b ZOMBIES;
    private static /* synthetic */ int[] lIlIIlIIlllIl;
    public static final /* synthetic */ /* enum */ b GHOSTS;
    public static final /* synthetic */ /* enum */ b SCORPIONS;
    public static final /* synthetic */ /* enum */ b DWARVES;
    private final /* synthetic */ WorldArea slayerLocation;
    public static final /* synthetic */ /* enum */ b CAVE_BUGS;
    public static final /* synthetic */ /* enum */ b BATS;
    public static final /* synthetic */ /* enum */ b CAVE_CRAWLERS;
    public static final /* synthetic */ /* enum */ b CAVE_SLIME;
    public static final /* synthetic */ /* enum */ b MINOTAURS;
    public static final /* synthetic */ /* enum */ b DOGS;
    public static final /* synthetic */ /* enum */ b ICEFIENDS;
    public static final /* synthetic */ /* enum */ b KALPHITES;
    public static final /* synthetic */ /* enum */ b SPIDERS;
    public static final /* synthetic */ /* enum */ b SOURHOGS;

    static {
        b.lIlllIlIllIIlII();
        b.lIlllIlIlIlIllI();
        BANSHEES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[5]], new WorldArea(lIlIIlIIlllIl[6], lIlIIlIIlllIl[7], lIlIIlIIlllIl[8], lIlIIlIIlllIl[9], lIlIIlIIlllIl[0]), List.of(Integer.valueOf(lIlIIlIIlllIl[10])));
        BATS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[12]], new WorldArea(lIlIIlIIlllIl[13], lIlIIlIIlllIl[14], lIlIIlIIlllIl[15], lIlIIlIIlllIl[16], lIlIIlIIlllIl[0]));
        BEARS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[18]], new WorldArea(lIlIIlIIlllIl[19], lIlIIlIIlllIl[20], lIlIIlIIlllIl[21], lIlIIlIIlllIl[21], lIlIIlIIlllIl[0]));
        CAVE_CRAWLERS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[23]], new WorldArea(lIlIIlIIlllIl[24], lIlIIlIIlllIl[25], lIlIIlIIlllIl[26], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]));
        COWS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[29]], new WorldArea(lIlIIlIIlllIl[30], lIlIIlIIlllIl[31], lIlIIlIIlllIl[32], lIlIIlIIlllIl[33], lIlIIlIIlllIl[0]));
        CRAWLING_HANDS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[35]], new WorldArea(lIlIIlIIlllIl[36], lIlIIlIIlllIl[37], lIlIIlIIlllIl[38], lIlIIlIIlllIl[39], lIlIIlIIlllIl[0]));
        GHOSTS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[41]], new WorldArea(lIlIIlIIlllIl[42], lIlIIlIIlllIl[43], lIlIIlIIlllIl[35], lIlIIlIIlllIl[39], lIlIIlIIlllIl[0]));
        GOBLINS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[39]], new WorldArea(lIlIIlIIlllIl[44], lIlIIlIIlllIl[45], lIlIIlIIlllIl[46], lIlIIlIIlllIl[47], lIlIIlIIlllIl[0]));
        ICEFIENDS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[9]], new WorldArea(lIlIIlIIlllIl[48], lIlIIlIIlllIl[14], lIlIIlIIlllIl[49], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]));
        KALPHITES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[50]], new WorldArea(lIlIIlIIlllIl[51], lIlIIlIIlllIl[52], lIlIIlIIlllIl[39], lIlIIlIIlllIl[50], lIlIIlIIlllIl[0]));
        LIZARDS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[49]], new WorldArea(lIlIIlIIlllIl[53], lIlIIlIIlllIl[54], lIlIIlIIlllIl[55], lIlIIlIIlllIl[56], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[2], List.of(Integer.valueOf(lIlIIlIIlllIl[57])));
        MINOTAURS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[32]], new WorldArea(lIlIIlIIlllIl[59], lIlIIlIIlllIl[60], lIlIIlIIlllIl[35], lIlIIlIIlllIl[40], lIlIIlIIlllIl[0]));
        MONKEYS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[62]], new WorldArea(lIlIIlIIlllIl[63], lIlIIlIIlllIl[64], lIlIIlIIlllIl[65], lIlIIlIIlllIl[58], lIlIIlIIlllIl[0]));
        SCORPIONS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[21]], new WorldArea(lIlIIlIIlllIl[67], lIlIIlIIlllIl[68], lIlIIlIIlllIl[39], lIlIIlIIlllIl[33], lIlIIlIIlllIl[0]));
        SKELETONS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[47]], new WorldArea(lIlIIlIIlllIl[70], lIlIIlIIlllIl[71], lIlIIlIIlllIl[47], lIlIIlIIlllIl[34], lIlIIlIIlllIl[0]));
        SOURHOGS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[56]], new WorldArea(lIlIIlIIlllIl[73], lIlIIlIIlllIl[74], lIlIIlIIlllIl[61], lIlIIlIIlllIl[28], lIlIIlIIlllIl[0]), List.of(Integer.valueOf(lIlIIlIIlllIl[75])));
        SPIDERS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[16]], new WorldArea(lIlIIlIIlllIl[77], lIlIIlIIlllIl[78], lIlIIlIIlllIl[47], lIlIIlIIlllIl[58], lIlIIlIIlllIl[0]));
        ZOMBIES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[80]], new WorldArea(lIlIIlIIlllIl[81], lIlIIlIIlllIl[82], lIlIIlIIlllIl[40], lIlIIlIIlllIl[21], lIlIIlIIlllIl[0]));
        CAVE_SLIME = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[65]], new WorldArea(lIlIIlIIlllIl[83], lIlIIlIIlllIl[84], lIlIIlIIlllIl[49], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[0], lIlIIlIIlllIl[2], List.of(Integer.valueOf(lIlIIlIIlllIl[85])));
        CAVE_BUGS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[87]], new WorldArea(lIlIIlIIlllIl[88], lIlIIlIIlllIl[89], lIlIIlIIlllIl[39], lIlIIlIIlllIl[8], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[0], lIlIIlIIlllIl[2], List.of(Integer.valueOf(lIlIIlIIlllIl[85])));
        DWARVES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[33]], new WorldArea(lIlIIlIIlllIl[91], lIlIIlIIlllIl[92], lIlIIlIIlllIl[93], lIlIIlIIlllIl[94], lIlIIlIIlllIl[0]));
        WOLVES = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[96]], new WorldArea(lIlIIlIIlllIl[97], lIlIIlIIlllIl[98], lIlIIlIIlllIl[21], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]));
        DOGS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[99]], new WorldArea(lIlIIlIIlllIl[100], lIlIIlIIlllIl[101], lIlIIlIIlllIl[49], lIlIIlIIlllIl[58], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[0], lIlIIlIIlllIl[0]);
        BIRDS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[102]], new WorldArea(lIlIIlIIlllIl[103], lIlIIlIIlllIl[104], lIlIIlIIlllIl[58], lIlIIlIIlllIl[28], lIlIIlIIlllIl[0]));
        RATS = new b(lIlIIlIIlIlll[lIlIIlIIlllIl[106]], new WorldArea(lIlIIlIIlllIl[107], lIlIIlIIlllIl[108], lIlIIlIIlllIl[62], lIlIIlIIlllIl[41], lIlIIlIIlllIl[0]));
        b[] bArray = new b[lIlIIlIIlllIl[58]];
        bArray[b.lIlIIlIIlllIl[0]] = BANSHEES;
        bArray[b.lIlIIlIIlllIl[2]] = BATS;
        bArray[b.lIlIIlIIlllIl[3]] = BEARS;
        bArray[b.lIlIIlIIlllIl[4]] = CAVE_CRAWLERS;
        bArray[b.lIlIIlIIlllIl[5]] = COWS;
        bArray[b.lIlIIlIIlllIl[11]] = CRAWLING_HANDS;
        bArray[b.lIlIIlIIlllIl[12]] = GHOSTS;
        bArray[b.lIlIIlIIlllIl[17]] = GOBLINS;
        bArray[b.lIlIIlIIlllIl[18]] = ICEFIENDS;
        bArray[b.lIlIIlIIlllIl[22]] = KALPHITES;
        bArray[b.lIlIIlIIlllIl[23]] = LIZARDS;
        bArray[b.lIlIIlIIlllIl[28]] = MINOTAURS;
        bArray[b.lIlIIlIIlllIl[29]] = MONKEYS;
        bArray[b.lIlIIlIIlllIl[34]] = SCORPIONS;
        bArray[b.lIlIIlIIlllIl[35]] = SKELETONS;
        bArray[b.lIlIIlIIlllIl[40]] = SOURHOGS;
        bArray[b.lIlIIlIIlllIl[41]] = SPIDERS;
        bArray[b.lIlIIlIIlllIl[8]] = ZOMBIES;
        bArray[b.lIlIIlIIlllIl[39]] = CAVE_SLIME;
        bArray[b.lIlIIlIIlllIl[27]] = CAVE_BUGS;
        bArray[b.lIlIIlIIlllIl[9]] = DWARVES;
        bArray[b.lIlIIlIIlllIl[38]] = WOLVES;
        bArray[b.lIlIIlIIlllIl[50]] = DOGS;
        bArray[b.lIlIIlIIlllIl[46]] = BIRDS;
        bArray[b.lIlIIlIIlllIl[49]] = RATS;
        $VALUES = bArray;
        String[] stringArray = new String[lIlIIlIIlllIl[58]];
        stringArray[b.lIlIIlIIlllIl[0]] = lIlIIlIIlIlll[lIlIIlIIlllIl[109]];
        stringArray[b.lIlIIlIIlllIl[2]] = lIlIIlIIlIlll[lIlIIlIIlllIl[110]];
        stringArray[b.lIlIIlIIlllIl[3]] = lIlIIlIIlIlll[lIlIIlIIlllIl[111]];
        stringArray[b.lIlIIlIIlllIl[4]] = lIlIIlIIlIlll[lIlIIlIIlllIl[112]];
        stringArray[b.lIlIIlIIlllIl[5]] = lIlIIlIIlIlll[lIlIIlIIlllIl[113]];
        stringArray[b.lIlIIlIIlllIl[11]] = lIlIIlIIlIlll[lIlIIlIIlllIl[94]];
        stringArray[b.lIlIIlIIlllIl[12]] = lIlIIlIIlIlll[lIlIIlIIlllIl[114]];
        stringArray[b.lIlIIlIIlllIl[17]] = lIlIIlIIlIlll[lIlIIlIIlllIl[115]];
        stringArray[b.lIlIIlIIlllIl[18]] = lIlIIlIIlIlll[lIlIIlIIlllIl[93]];
        stringArray[b.lIlIIlIIlllIl[22]] = lIlIIlIIlIlll[lIlIIlIIlllIl[116]];
        stringArray[b.lIlIIlIIlllIl[23]] = lIlIIlIIlIlll[lIlIIlIIlllIl[117]];
        stringArray[b.lIlIIlIIlllIl[28]] = lIlIIlIIlIlll[lIlIIlIIlllIl[118]];
        stringArray[b.lIlIIlIIlllIl[29]] = lIlIIlIIlIlll[lIlIIlIIlllIl[119]];
        stringArray[b.lIlIIlIIlllIl[34]] = lIlIIlIIlIlll[lIlIIlIIlllIl[120]];
        stringArray[b.lIlIIlIIlllIl[35]] = lIlIIlIIlIlll[lIlIIlIIlllIl[121]];
        stringArray[b.lIlIIlIIlllIl[40]] = lIlIIlIIlIlll[lIlIIlIIlllIl[122]];
        stringArray[b.lIlIIlIIlllIl[41]] = lIlIIlIIlIlll[lIlIIlIIlllIl[123]];
        stringArray[b.lIlIIlIIlllIl[8]] = lIlIIlIIlIlll[lIlIIlIIlllIl[124]];
        stringArray[b.lIlIIlIIlllIl[39]] = lIlIIlIIlIlll[lIlIIlIIlllIl[125]];
        stringArray[b.lIlIIlIIlllIl[27]] = lIlIIlIIlIlll[lIlIIlIIlllIl[126]];
        stringArray[b.lIlIIlIIlllIl[9]] = lIlIIlIIlIlll[lIlIIlIIlllIl[127]];
        stringArray[b.lIlIIlIIlllIl[38]] = lIlIIlIIlIlll[lIlIIlIIlllIl[128]];
        stringArray[b.lIlIIlIIlllIl[50]] = lIlIIlIIlIlll[lIlIIlIIlllIl[129]];
        stringArray[b.lIlIIlIIlllIl[46]] = lIlIIlIIlIlll[lIlIIlIIlllIl[130]];
        stringArray[b.lIlIIlIIlllIl[49]] = lIlIIlIIlIlll[lIlIIlIIlllIl[131]];
        taskNames = List.of(stringArray);
        TASK_CACHE = new HashMap<String, b>();
    }

    public boolean o() {
        return this.needsWaterskin;
    }

    private b(String string2, WorldArea worldArea, boolean bl, boolean bl2) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = bl;
        this.requiredItems = List.of(Integer.valueOf(lIlIIlIIlllIl[1]));
        this.needsLightSource = bl2;
    }

    private static boolean lIlllIlIllIIlIl(int n2) {
        return n2 == 0;
    }

    public boolean q() {
        return this.needsLightSource;
    }

    private static String lIlllIlIlIIIllI(String var20, String var14) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var18 = var14.toCharArray();
        int var2 = lIlIIlIIlllIl[0];
        char[] var11 = var20.toCharArray();
        int var12 = var11.length;
        int var16 = lIlIIlIIlllIl[0];
        while (b.lIlllIlIllIlIIl(var16, var12)) {
            char var7 = var11[var16];
            var13.append((char)(var7 ^ var18[var2 % var18.length]));
            0;
            ++var2;
            ++var16;
            0;
            
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean lIlllIlIllIIlll(int n2) {
        return n2 != 0;
    }

    private static String lIlllIlIlIIIlll(String var10, String var8) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlllIl[18]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(lIlIIlIIlllIl[3], var21);
            return new String(var19.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public List<Integer> p() {
        return this.requiredItems;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public String m() {
        return this.npcName;
    }

    private b(String string2, WorldArea worldArea, boolean bl, boolean bl2, List<Integer> list) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = bl;
        this.needsLightSource = bl2;
        this.requiredItems = list;
    }

    private static void lIlllIlIlIlIllI() {
        lIlIIlIIlIlll = new String[lIlIIlIIlllIl[132]];
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[0]] = b."Wear";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[2]] = b."Equip";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[3]] = b."slayer helm";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[4]] = b."BANSHEES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[5]] = b."Banshee";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[11]] = b."BATS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[12]] = b."Bat";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[17]] = b."BEARS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[18]] = b."Bear";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[22]] = b."CAVE_CRAWLERS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[23]] = b."Cave crawler";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[28]] = b."COWS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[29]] = b."Cow";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[34]] = b."CRAWLING_HANDS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[35]] = b."Crawling Hand";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[40]] = b."GHOSTS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[41]] = b."Ghost";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[8]] = b."GOBLINS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[39]] = b."Goblin";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[27]] = b."ICEFIENDS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[9]] = b."Icefiend";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[38]] = b."KALPHITES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[50]] = b."Kalphite worker";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[46]] = b."LIZARDS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[49]] = b."Lizard";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[58]] = b."MINOTAURS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[32]] = b."Minotaur";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[61]] = b."MONKEYS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[62]] = b."Monkey";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[66]] = b."SCORPIONS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[21]] = b."Scorpion";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[69]] = b."SKELETONS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[47]] = b."Skeleton";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[72]] = b."SOURHOGS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[56]] = b."Sourhog";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[76]] = b."SPIDERS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[16]] = b."Spider";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[79]] = b."ZOMBIES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[80]] = b."Zombie";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[26]] = b."CAVE_SLIME";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[65]] = b."Cave slime";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[86]] = b."CAVE_BUGS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[87]] = b."Cave bug";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[90]] = b."DWARVES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[33]] = b."Dwarf";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[95]] = b."WOLVES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[96]] = b."Wolf";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[15]] = b."DOGS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[99]] = b."Guard dog";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[55]] = b."BIRDS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[102]] = b."Undead chicken";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[105]] = b."RATS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[106]] = b."Rat";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[109]] = b."banshees";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[110]] = b."bats";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[111]] = b."bears";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[112]] = b."cave crawlers";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[113]] = b."cows";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[94]] = b."crawling hands";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[114]] = b."ghosts";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[115]] = b."goblins";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[93]] = b."icefiends";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[116]] = b."kalphite";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[117]] = b."lizards";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[118]] = b."minotaurs";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[119]] = b."monkeys";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[120]] = b."scorpions";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[121]] = b."skeletons";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[122]] = b."sourhogs";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[123]] = b."spiders";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[124]] = b."zombies";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[125]] = b."cave slimes";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[126]] = b."cave bugs";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[127]] = b."dwarves";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[128]] = b."wolves";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[129]] = b."dogs";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[130]] = b."birds";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[131]] = b."rats";
    }

    private b(String string2, WorldArea worldArea) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = lIlIIlIIlllIl[0];
        this.requiredItems = List.of(Integer.valueOf(lIlIIlIIlllIl[1]));
        this.needsLightSource = lIlIIlIIlllIl[0];
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    public boolean l() {
        b var3;
        if (b.lIlllIlIllIIllI(this.requiredItems.get(lIlIIlIIlllIl[0]), lIlIIlIIlllIl[1])) {
            return lIlIIlIIlllIl[2];
        }
        if (b.lIlllIlIllIIlll(Equipment.contains(item -> item.getName().toLowerCase().contains(lIlIIlIIlIlll[lIlIIlIIlllIl[3]])) ? 1 : 0)) {
            return lIlIIlIIlllIl[2];
        }
        Iterator<Integer> var4 = var3.requiredItems.iterator();
        while (b.lIlllIlIllIIlll(var4.hasNext() ? 1 : 0)) {
            int var9;
            block7: {
                block8: {
                    var9 = var4.next();
                    int[] nArray = new int[lIlIIlIIlllIl[2]];
                    nArray[b.lIlIIlIIlllIl[0]] = var9;
                    if (!b.lIlllIlIllIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                    int[] nArray2 = new int[lIlIIlIIlllIl[2]];
                    nArray2[b.lIlIIlIIlllIl[0]] = var9;
                    String[] stringArray = new String[lIlIIlIIlllIl[2]];
                    stringArray[b.lIlIIlIIlllIl[0]] = lIlIIlIIlIlll[lIlIIlIIlllIl[0]];
                    if (!b.lIlllIlIllIIlll(Inventory.getFirst((int[])nArray2).hasAction(stringArray) ? 1 : 0)) break block8;
                    int[] nArray3 = new int[lIlIIlIIlllIl[2]];
                    nArray3[b.lIlIIlIIlllIl[0]] = var9;
                    String[] stringArray2 = new String[lIlIIlIIlllIl[2]];
                    stringArray2[b.lIlIIlIIlllIl[0]] = lIlIIlIIlIlll[lIlIIlIIlllIl[2]];
                    if (!b.lIlllIlIllIIlIl(Inventory.getFirst((int[])nArray3).hasAction(stringArray2) ? 1 : 0)) break block7;
                }
                return lIlIIlIIlllIl[2];
            }
            int[] nArray = new int[lIlIIlIIlllIl[2]];
            nArray[b.lIlIIlIIlllIl[0]] = var9;
            if (b.lIlllIlIllIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                return lIlIIlIIlllIl[2];
            }
            0;
            if (3 > 2) continue;
            return ((0x84 ^ 0xBF ^ (0xB5 ^ 0xA5)) & (0xA0 ^ 0x88 ^ 3 ^ -1)) != 0;
        }
        return lIlIIlIIlllIl[0];
    }

    private static boolean lIlllIlIllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllIlIlIIlIII(String var15, String var5) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIIlIIlllIl[3], var1);
            return new String(var6.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    public static b b(String string) {
        if (b.lIlllIlIllIIlIl(taskNames.contains(string) ? 1 : 0)) {
            return null;
        }
        return TASK_CACHE.getOrDefault(string, b.values()[taskNames.indexOf(string)]);
    }

    private b(String string2, WorldArea worldArea, boolean bl, List<Integer> list) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = bl;
        this.requiredItems = list;
        this.needsLightSource = lIlIIlIIlllIl[0];
    }

    private static boolean lIlllIlIllIIllI(int n2, int n3) {
        return n2 == n3;
    }

    public WorldArea n() {
        return this.slayerLocation;
    }

    private b(String string2, WorldArea worldArea, List<Integer> list) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = lIlIIlIIlllIl[0];
        this.requiredItems = list;
        this.needsLightSource = lIlIIlIIlllIl[0];
    }

    private static void lIlllIlIllIIlII() {
        lIlIIlIIlllIl = new int[133];
        b.lIlIIlIIlllIl[0] = (0x47 ^ 0x48 ^ (0x26 ^ 0x4A)) & (188 + 146 - 189 + 64 ^ 161 + 10 - 108 + 115 ^ -1);
        b.lIlIIlIIlllIl[1] = -1;
        b.lIlIIlIIlllIl[2] = 1;
        b.lIlIIlIIlllIl[3] = 2;
        b.lIlIIlIIlllIl[4] = 3;
        b.lIlIIlIIlllIl[5] = 0x47 ^ 0x43;
        b.lIlIIlIIlllIl[6] = -(0xFFFFFBFD & 0x7686) & (0xFFFFFFEF & Short.MAX_VALUE);
        b.lIlIIlIIlllIl[7] = -(0xFFFFDBF1 & 0x761F) & (0xFFFFDFDF & 0x7FFB);
        b.lIlIIlIIlllIl[8] = 0xBC ^ 0xAD;
        b.lIlIIlIIlllIl[9] = 0x1E ^ 0x10 ^ (0xAE ^ 0xB4);
        b.lIlIIlIIlllIl[10] = 0xFFFFBA5F & 0x55E6;
        b.lIlIIlIIlllIl[11] = 0xC ^ 9;
        b.lIlIIlIIlllIl[12] = 0x9D ^ 0x9B;
        b.lIlIIlIIlllIl[13] = -(0xFFFFF5E7 & 0x3A5B) & (0xFFFFFDFF & 0x3F5F);
        b.lIlIIlIIlllIl[14] = -(0xFFFFD263 & 0x7FBF) & (0xFFFFFFBF & 0x5FEF);
        b.lIlIIlIIlllIl[15] = 0xA2 ^ 0x8D;
        b.lIlIIlIIlllIl[16] = 94 + 78 - 159 + 169 ^ 76 + 117 - 113 + 66;
        b.lIlIIlIIlllIl[17] = 0xBC ^ 0xBB;
        b.lIlIIlIIlllIl[18] = 0x56 ^ 0x5E;
        b.lIlIIlIIlllIl[19] = 0xFFFFBF81 & 0x4AFF;
        b.lIlIIlIIlllIl[20] = 0xFFFFAEFF & 0x5DFE;
        b.lIlIIlIIlllIl[21] = 3 ^ 0x1D;
        b.lIlIIlIIlllIl[22] = 0xA4 ^ 0xAD;
        b.lIlIIlIIlllIl[23] = 72 + 18 - 53 + 121 ^ 91 + 137 - 199 + 119;
        b.lIlIIlIIlllIl[24] = 0xFFFFDAFD & 0x2FD7;
        b.lIlIIlIIlllIl[25] = -(0xFFFFDEEB & 0x79BF) & (0xFFFFFFAF & Short.MAX_VALUE);
        b.lIlIIlIIlllIl[26] = 0x63 ^ 0x72 ^ (0xF4 ^ 0xC2);
        b.lIlIIlIIlllIl[27] = 0xB3 ^ 0xA0;
        b.lIlIIlIIlllIl[28] = 0x82 ^ 0x89;
        b.lIlIIlIIlllIl[29] = 0x8A ^ 0x8D ^ (0x47 ^ 0x4C);
        b.lIlIIlIIlllIl[30] = 0xFFFFCDA8 & 0x3EFF;
        b.lIlIIlIIlllIl[31] = 0xFFFFEFF7 & 0x1CBF;
        b.lIlIIlIIlllIl[32] = 0x60 ^ 0x7A;
        b.lIlIIlIIlllIl[33] = 6 ^ 0x62 ^ (0xD8 ^ 0x90);
        b.lIlIIlIIlllIl[34] = 56 + 64 - -21 + 14 ^ 35 + 5 - -78 + 32;
        b.lIlIIlIIlllIl[35] = 0x97 ^ 0x99;
        b.lIlIIlIIlllIl[36] = 0xFFFFAF6F & 0x5DDD;
        b.lIlIIlIIlllIl[37] = -(0xFFFFF667 & 0x6B9E) & (0xFFFFEFFF & 0x7FEF);
        b.lIlIIlIIlllIl[38] = 0x92 ^ 0x87;
        b.lIlIIlIIlllIl[39] = 0x52 ^ 0x40;
        b.lIlIIlIIlllIl[40] = 0x80 ^ 0x8F;
        b.lIlIIlIIlllIl[41] = 144 + 102 - 133 + 40 ^ 75 + 8 - -29 + 25;
        b.lIlIIlIIlllIl[42] = 0xFFFF86FC & 0x7F7B;
        b.lIlIIlIIlllIl[43] = 0xFFFFFF7A & 0x27A5;
        b.lIlIIlIIlllIl[44] = 0xFFFFDEFB & 0x2DAD;
        b.lIlIIlIIlllIl[45] = -(0xFFFFC76F & 0x79B9) & (0xFFFFCFBF & 0x7DFF);
        b.lIlIIlIIlllIl[46] = 0x21 ^ 7 ^ (0xF1 ^ 0xC0);
        b.lIlIIlIIlllIl[47] = 0x75 ^ 0x2A ^ 90 + 1 - 83 + 119;
        b.lIlIIlIIlllIl[48] = 0xFFFFFBBB & 0xFF6;
        b.lIlIIlIIlllIl[49] = 0x6C ^ 0x65 ^ (0x4B ^ 0x5A);
        b.lIlIIlIIlllIl[50] = 13 + 45 - -35 + 37 ^ 127 + 24 - 62 + 59;
        b.lIlIIlIIlllIl[51] = 0xFFFF9CFF & 0x6FF3;
        b.lIlIIlIIlllIl[52] = -(0xFFFFD97B & 0x6EE6) & (0xFFFFFD75 & 0x6FFF);
        b.lIlIIlIIlllIl[53] = 0xFFFF9F3F & 0x6DFD;
        b.lIlIIlIIlllIl[54] = 0xFFFFABC7 & 0x5FFF;
        b.lIlIIlIIlllIl[55] = 0x88 ^ 0xB9;
        b.lIlIIlIIlllIl[56] = 89 + 59 - 139 + 121 ^ 67 + 58 - 73 + 108;
        b.lIlIIlIIlllIl[57] = -(0xFFFFD297 & 0x6D7E) & (0xFFFFFA7F & 0x5FBD);
        b.lIlIIlIIlllIl[58] = 0x41 ^ 0x58;
        b.lIlIIlIIlllIl[59] = 0xFFFFDF5D & 0x27EF;
        b.lIlIIlIIlllIl[60] = -(0xFFFFF7F5 & 0x2B2F) & (0xFFFFF77C & 0x3FFF);
        b.lIlIIlIIlllIl[61] = 0x5A ^ 0x41;
        b.lIlIIlIIlllIl[62] = 0xA9 ^ 0xB5;
        b.lIlIIlIIlllIl[63] = 0xFFFF8AD6 & 0x7FFB;
        b.lIlIIlIIlllIl[64] = 0xFFFFDFFA & 0x2BAF;
        b.lIlIIlIIlllIl[65] = 0x73 ^ 0x6C ^ (0x67 ^ 0x50);
        b.lIlIIlIIlllIl[66] = 0xE2 ^ 0x95 ^ (0x1B ^ 0x71);
        b.lIlIIlIIlllIl[67] = 0xFFFF9CDB & 0x6FFE;
        b.lIlIIlIIlllIl[68] = 0xFFFFAEFA & 0x5DCF;
        b.lIlIIlIIlllIl[69] = 0x77 ^ 0x68;
        b.lIlIIlIIlllIl[70] = -(0xFFFFF91B & 0x17ED) & (0xFFFFBF3E & 0x5DE9);
        b.lIlIIlIIlllIl[71] = -(0xFFFFF94D & 0x46F3) & (0xFFFFFEFF & 0x67EF);
        b.lIlIIlIIlllIl[72] = 0x71 ^ 0x2F ^ 61 + 93 - 64 + 37;
        b.lIlIIlIIlllIl[73] = -(126 + 78 - 37 + 12) & (0xFFFF8DFF & 0x7EFF);
        b.lIlIIlIIlllIl[74] = 0xFFFFE5DF & 0x3FFD;
        b.lIlIIlIIlllIl[75] = 0xFFFFE77F & 0x79EE;
        b.lIlIIlIIlllIl[76] = 12 + 94 - 95 + 127 ^ 57 + 23 - -26 + 63;
        b.lIlIIlIIlllIl[77] = 0xFFFF9DDF & 0x6E75;
        b.lIlIIlIIlllIl[78] = 0xFFFFEDFF & 0x1E9D;
        b.lIlIIlIIlllIl[79] = 0x8B ^ 0xAE;
        b.lIlIIlIIlllIl[80] = 0x72 ^ 0x44 ^ (4 ^ 0x14);
        b.lIlIIlIIlllIl[81] = 0xFFFF9C71 & 0x6FCF;
        b.lIlIIlIIlllIl[82] = 0xFFFFFEE0 & 0x27BF;
        b.lIlIIlIIlllIl[83] = -(0xFFFFBB9B & 0x75EE) & (0xFFFFFFEF & 0x3DFD);
        b.lIlIIlIIlllIl[84] = -(0xFFFFFEF3 & 0x59BD) & (0xFFFFFDF7 & 0x7FFB);
        b.lIlIIlIIlllIl[85] = 0xFFFF9BC7 & 0x75FF;
        b.lIlIIlIIlllIl[86] = 0x60 ^ 0x21 ^ (0x33 ^ 0x5B);
        b.lIlIIlIIlllIl[87] = 0x1C ^ 0x36;
        b.lIlIIlIIlllIl[88] = -(0xFFFFF2D5 & 0x2FBB) & (0xFFFFFFFB & 0x2EFD);
        b.lIlIIlIIlllIl[89] = 0xFFFFF5C5 & 0x2F7F;
        b.lIlIIlIIlllIl[90] = 3 + 46 - 13 + 104 ^ 38 + 146 - 136 + 119;
        b.lIlIIlIIlllIl[91] = 0xFFFF9FC5 & 0x6BFA;
        b.lIlIIlIIlllIl[92] = 0xFFFFEE77 & 0x37CF;
        b.lIlIIlIIlllIl[93] = 0x75 ^ 0x3F ^ (0xB6 ^ 0xC1);
        b.lIlIIlIIlllIl[94] = 0x23 ^ 0x6D ^ (0x68 ^ 0x1C);
        b.lIlIIlIIlllIl[95] = 0x24 ^ 9;
        b.lIlIIlIIlllIl[96] = 0x64 ^ 0x4C ^ (0x9C ^ 0x9A);
        b.lIlIIlIIlllIl[97] = 0xFFFF8FEF & 0x7B1D;
        b.lIlIIlIIlllIl[98] = -(0xFFFF91D6 & 0x7E2B) & (0xFFFF9DA7 & Short.MAX_VALUE);
        b.lIlIIlIIlllIl[99] = 0x1F ^ 0x2F;
        b.lIlIIlIIlllIl[100] = 0xFFFFFBFF & 0xE3F;
        b.lIlIIlIIlllIl[101] = 0xFFFFCDED & 0x3EFE;
        b.lIlIIlIIlllIl[102] = 0x7E ^ 0x6A ^ (0xBB ^ 0x9D);
        b.lIlIIlIIlllIl[103] = -(0xFFFFF625 & 0x69FB) & (0xFFFFEE79 & 0x7FBF);
        b.lIlIIlIIlllIl[104] = -(0xFFFFF2BB & 0x6D77) & (0xFFFFFFFF & 0x6DF3);
        b.lIlIIlIIlllIl[105] = 0xE5 ^ 0xB3 ^ (0xDD ^ 0xB8);
        b.lIlIIlIIlllIl[106] = 0x41 ^ 0x75;
        b.lIlIIlIIlllIl[107] = 0xFFFFDFDC & 0x2CBF;
        b.lIlIIlIIlllIl[108] = 0xFFFFB6DA & 0x6FA7;
        b.lIlIIlIIlllIl[109] = 0xEF ^ 0x81 ^ (0x2B ^ 0x70);
        b.lIlIIlIIlllIl[110] = 0x61 ^ 0x57;
        b.lIlIIlIIlllIl[111] = 80 + 44 - 46 + 92 ^ 25 + 88 - 72 + 116;
        b.lIlIIlIIlllIl[112] = 20 + 26 - -46 + 79 ^ 113 + 74 - 158 + 118;
        b.lIlIIlIIlllIl[113] = 0x6C ^ 9 ^ (4 ^ 0x58);
        b.lIlIIlIIlllIl[114] = 0xB7 ^ 0x8C;
        b.lIlIIlIIlllIl[115] = 0x44 ^ 0x73 ^ (0x93 ^ 0x98);
        b.lIlIIlIIlllIl[116] = 0x2D ^ 0x6A ^ (0xC6 ^ 0xBF);
        b.lIlIIlIIlllIl[117] = 0x22 ^ 0x1D;
        b.lIlIIlIIlllIl[118] = 14 + 34 - -18 + 61 ^ (0x9D ^ 0xA2);
        b.lIlIIlIIlllIl[119] = 0x85 ^ 0xC4;
        b.lIlIIlIIlllIl[120] = 0x26 ^ 0x64;
        b.lIlIIlIIlllIl[121] = 3 ^ (0x87 ^ 0xC7);
        b.lIlIIlIIlllIl[122] = 0xEF ^ 0xAB;
        b.lIlIIlIIlllIl[123] = 0xE0 ^ 0xA5;
        b.lIlIIlIIlllIl[124] = 0xE5 ^ 0xAF ^ (0xAE ^ 0xA2);
        b.lIlIIlIIlllIl[125] = 0xE2 ^ 0x98 ^ (0x99 ^ 0xA4);
        b.lIlIIlIIlllIl[126] = 0xA8 ^ 0x92 ^ (0x7D ^ 0xF);
        b.lIlIIlIIlllIl[127] = 118 + 113 - 214 + 221 ^ 156 + 91 - 133 + 53;
        b.lIlIIlIIlllIl[128] = 0x4D ^ 2 ^ (0xA6 ^ 0xA3);
        b.lIlIIlIIlllIl[129] = 0x4F ^ 4;
        b.lIlIIlIIlllIl[130] = 0xD0 ^ 0x90 ^ (0x24 ^ 0x28);
        b.lIlIIlIIlllIl[131] = 0xE3 ^ 0xAE;
        b.lIlIIlIIlllIl[132] = 0x36 ^ 0x78;
    }
}

