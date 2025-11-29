/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.slayer.tasks;

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

public final class GameEnum
extends Enum<b> {
    private final  boolean needsWaterskin;
    public static final  /* enum */ b BEARS;
    private final  String npcName;
    public static final  /* enum */ b BANSHEES;
    
    private final  List<Integer> requiredItems;
    public static final  /* enum */ b BIRDS;
    public static final  /* enum */ b CRAWLING_HANDS;
    private static final  Map<String, b> TASK_CACHE;
    public static final  /* enum */ b MONKEYS;
    public static final  /* enum */ b COWS;
    private final  boolean needsLightSource;
    public static final  /* enum */ b LIZARDS;
    public static final  /* enum */ b WOLVES;
    private static final  b[] $VALUES;
    public static final  /* enum */ b SKELETONS;
    public static final  /* enum */ b RATS;
    public static final  List<String> taskNames;
    public static final  /* enum */ b GOBLINS;
    public static final  /* enum */ b ZOMBIES;
    
    public static final  /* enum */ b GHOSTS;
    public static final  /* enum */ b SCORPIONS;
    public static final  /* enum */ b DWARVES;
    private final  WorldArea slayerLocation;
    public static final  /* enum */ b CAVE_BUGS;
    public static final  /* enum */ b BATS;
    public static final  /* enum */ b CAVE_CRAWLERS;
    public static final  /* enum */ b CAVE_SLIME;
    public static final  /* enum */ b MINOTAURS;
    public static final  /* enum */ b DOGS;
    public static final  /* enum */ b ICEFIENDS;
    public static final  /* enum */ b KALPHITES;
    public static final  /* enum */ b SPIDERS;
    public static final  /* enum */ b SOURHOGS;

    static {
        b.lIlllIlIllIIlII();
        b.lIlllIlIlIlIllI();
        BANSHEES = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[5]], new WorldArea(lIlIIlIIlllIl[6], lIlIIlIIlllIl[7], lIlIIlIIlllIl[8], lIlIIlIIlllIl[9], lIlIIlIIlllIl[0]), List.of(Integer.valueOf(lIlIIlIIlllIl[10])));
        BATS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[12]], new WorldArea(lIlIIlIIlllIl[13], lIlIIlIIlllIl[14], lIlIIlIIlllIl[15], lIlIIlIIlllIl[16], lIlIIlIIlllIl[0]));
        BEARS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[18]], new WorldArea(lIlIIlIIlllIl[19], lIlIIlIIlllIl[20], lIlIIlIIlllIl[21], lIlIIlIIlllIl[21], lIlIIlIIlllIl[0]));
        CAVE_CRAWLERS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[23]], new WorldArea(lIlIIlIIlllIl[24], lIlIIlIIlllIl[25], lIlIIlIIlllIl[26], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]));
        COWS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[29]], new WorldArea(lIlIIlIIlllIl[30], lIlIIlIIlllIl[31], lIlIIlIIlllIl[32], lIlIIlIIlllIl[33], lIlIIlIIlllIl[0]));
        CRAWLING_HANDS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[35]], new WorldArea(lIlIIlIIlllIl[36], lIlIIlIIlllIl[37], lIlIIlIIlllIl[38], lIlIIlIIlllIl[39], lIlIIlIIlllIl[0]));
        GHOSTS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[41]], new WorldArea(lIlIIlIIlllIl[42], lIlIIlIIlllIl[43], lIlIIlIIlllIl[35], lIlIIlIIlllIl[39], lIlIIlIIlllIl[0]));
        GOBLINS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[39]], new WorldArea(lIlIIlIIlllIl[44], lIlIIlIIlllIl[45], lIlIIlIIlllIl[46], lIlIIlIIlllIl[47], lIlIIlIIlllIl[0]));
        ICEFIENDS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[9]], new WorldArea(lIlIIlIIlllIl[48], lIlIIlIIlllIl[14], lIlIIlIIlllIl[49], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]));
        KALPHITES = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[50]], new WorldArea(lIlIIlIIlllIl[51], lIlIIlIIlllIl[52], lIlIIlIIlllIl[39], lIlIIlIIlllIl[50], lIlIIlIIlllIl[0]));
        LIZARDS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[49]], new WorldArea(lIlIIlIIlllIl[53], lIlIIlIIlllIl[54], lIlIIlIIlllIl[55], lIlIIlIIlllIl[56], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[2], List.of(Integer.valueOf(lIlIIlIIlllIl[57])));
        MINOTAURS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[32]], new WorldArea(lIlIIlIIlllIl[59], lIlIIlIIlllIl[60], lIlIIlIIlllIl[35], lIlIIlIIlllIl[40], lIlIIlIIlllIl[0]));
        MONKEYS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[62]], new WorldArea(lIlIIlIIlllIl[63], lIlIIlIIlllIl[64], lIlIIlIIlllIl[65], lIlIIlIIlllIl[58], lIlIIlIIlllIl[0]));
        SCORPIONS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[21]], new WorldArea(lIlIIlIIlllIl[67], lIlIIlIIlllIl[68], lIlIIlIIlllIl[39], lIlIIlIIlllIl[33], lIlIIlIIlllIl[0]));
        SKELETONS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[47]], new WorldArea(lIlIIlIIlllIl[70], lIlIIlIIlllIl[71], lIlIIlIIlllIl[47], lIlIIlIIlllIl[34], lIlIIlIIlllIl[0]));
        SOURHOGS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[56]], new WorldArea(lIlIIlIIlllIl[73], lIlIIlIIlllIl[74], lIlIIlIIlllIl[61], lIlIIlIIlllIl[28], lIlIIlIIlllIl[0]), List.of(Integer.valueOf(lIlIIlIIlllIl[75])));
        SPIDERS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[16]], new WorldArea(lIlIIlIIlllIl[77], lIlIIlIIlllIl[78], lIlIIlIIlllIl[47], lIlIIlIIlllIl[58], lIlIIlIIlllIl[0]));
        ZOMBIES = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[80]], new WorldArea(lIlIIlIIlllIl[81], lIlIIlIIlllIl[82], lIlIIlIIlllIl[40], lIlIIlIIlllIl[21], lIlIIlIIlllIl[0]));
        CAVE_SLIME = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[65]], new WorldArea(lIlIIlIIlllIl[83], lIlIIlIIlllIl[84], lIlIIlIIlllIl[49], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[0], lIlIIlIIlllIl[2], List.of(Integer.valueOf(lIlIIlIIlllIl[85])));
        CAVE_BUGS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[87]], new WorldArea(lIlIIlIIlllIl[88], lIlIIlIIlllIl[89], lIlIIlIIlllIl[39], lIlIIlIIlllIl[8], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[0], lIlIIlIIlllIl[2], List.of(Integer.valueOf(lIlIIlIIlllIl[85])));
        DWARVES = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[33]], new WorldArea(lIlIIlIIlllIl[91], lIlIIlIIlllIl[92], lIlIIlIIlllIl[93], lIlIIlIIlllIl[94], lIlIIlIIlllIl[0]));
        WOLVES = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[96]], new WorldArea(lIlIIlIIlllIl[97], lIlIIlIIlllIl[98], lIlIIlIIlllIl[21], lIlIIlIIlllIl[27], lIlIIlIIlllIl[0]));
        DOGS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[99]], new WorldArea(lIlIIlIIlllIl[100], lIlIIlIIlllIl[101], lIlIIlIIlllIl[49], lIlIIlIIlllIl[58], lIlIIlIIlllIl[0]), lIlIIlIIlllIl[0], lIlIIlIIlllIl[0]);
        BIRDS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[102]], new WorldArea(lIlIIlIIlllIl[103], lIlIIlIIlllIl[104], lIlIIlIIlllIl[58], lIlIIlIIlllIl[28], lIlIIlIIlllIl[0]));
        RATS = new GameEnum(lIlIIlIIlIlll[lIlIIlIIlllIl[106]], new WorldArea(lIlIIlIIlllIl[107], lIlIIlIIlllIl[108], lIlIIlIIlllIl[62], lIlIIlIIlllIl[41], lIlIIlIIlllIl[0]));
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

    private GameEnum(String string2, WorldArea worldArea, boolean bl, boolean bl2) {
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

        return String.valueOf(var1);
    }

    private static boolean lIlllIlIllIIlll(int n2) {
        return n2 != 0;
    }

    public List<Integer> p() {
        return this.requiredItems;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public String m() {
        return this.npcName;
    }

    private GameEnum(String string2, WorldArea worldArea, boolean bl, boolean bl2, List<Integer> list) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = bl;
        this.needsLightSource = bl2;
        this.requiredItems = list;
    }

    private static void lIlllIlIlIlIllI() {
        lIlIIlIIlIlll = new String[lIlIIlIIlllIl[132]];
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[0]] = "Wear";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[2]] = "Equip";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[3]] = "slayer helm";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[4]] = "BANSHEES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[5]] = "Banshee";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[11]] = "BATS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[12]] = "Bat";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[17]] = "BEARS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[18]] = "Bear";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[22]] = "CAVE_CRAWLERS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[23]] = "Cave crawler";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[28]] = "COWS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[29]] = "Cow";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[34]] = "CRAWLING_HANDS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[35]] = "Crawling Hand";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[40]] = "GHOSTS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[41]] = "Ghost";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[8]] = "GOBLINS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[39]] = "Goblin";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[27]] = "ICEFIENDS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[9]] = "Icefiend";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[38]] = "KALPHITES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[50]] = "Kalphite worker";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[46]] = "LIZARDS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[49]] = "Lizard";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[58]] = "MINOTAURS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[32]] = "Minotaur";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[61]] = "MONKEYS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[62]] = "Monkey";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[66]] = "SCORPIONS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[21]] = "Scorpion";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[69]] = "SKELETONS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[47]] = "Skeleton";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[72]] = "SOURHOGS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[56]] = "Sourhog";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[76]] = "SPIDERS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[16]] = "Spider";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[79]] = "ZOMBIES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[80]] = "Zombie";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[26]] = "CAVE_SLIME";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[65]] = "Cave slime";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[86]] = "CAVE_BUGS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[87]] = "Cave bug";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[90]] = "DWARVES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[33]] = "Dwarf";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[95]] = "WOLVES";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[96]] = "Wolf";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[15]] = "DOGS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[99]] = "Guard dog";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[55]] = "BIRDS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[102]] = "Undead chicken";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[105]] = "RATS";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[106]] = "Rat";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[109]] = "banshees";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[110]] = "bats";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[111]] = "bears";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[112]] = "cave crawlers";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[113]] = "cows";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[94]] = "crawling hands";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[114]] = "ghosts";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[115]] = "goblins";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[93]] = "icefiends";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[116]] = "kalphite";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[117]] = "lizards";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[118]] = "minotaurs";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[119]] = "monkeys";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[120]] = "scorpions";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[121]] = "skeletons";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[122]] = "sourhogs";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[123]] = "spiders";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[124]] = "zombies";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[125]] = "cave slimes";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[126]] = "cave bugs";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[127]] = "dwarves";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[128]] = "wolves";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[129]] = "dogs";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[130]] = "birds";
        b.lIlIIlIIlIlll[b.lIlIIlIIlllIl[131]] = "rats";
    }

    private GameEnum(String string2, WorldArea worldArea) {
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
        b var2;
        if (b.lIlllIlIllIIllI(this.requiredItems.get(lIlIIlIIlllIl[0]), lIlIIlIIlllIl[1])) {
            return lIlIIlIIlllIl[2];
        }
        if (b.lIlllIlIllIIlll(Equipment.contains(item -> item.getName().toLowerCase().contains(lIlIIlIIlIlll[lIlIIlIIlllIl[3]])) ? 1 : 0)) {
            return lIlIIlIIlllIl[2];
        }
        Iterator<Integer> var3 = var2.requiredItems.iterator();
        while (b.lIlllIlIllIIlll(var3.hasNext() ? 1 : 0)) {
            int var4;
            block7: {
                block8: {
                    var4 = var3.next();
                    int[] nArray = new int[lIlIIlIIlllIl[2]];
                    nArray[b.lIlIIlIIlllIl[0]] = var4;
                    if (!b.lIlllIlIllIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                    int[] nArray2 = new int[lIlIIlIIlllIl[2]];
                    nArray2[b.lIlIIlIIlllIl[0]] = var4;
                    String[] stringArray = new String[lIlIIlIIlllIl[2]];
                    stringArray[b.lIlIIlIIlllIl[0]] = lIlIIlIIlIlll[lIlIIlIIlllIl[0]];
                    if (!b.lIlllIlIllIIlll(Inventory.getFirst((int[])nArray2).hasAction(stringArray) ? 1 : 0)) break block8;
                    int[] nArray3 = new int[lIlIIlIIlllIl[2]];
                    nArray3[b.lIlIIlIIlllIl[0]] = var4;
                    String[] stringArray2 = new String[lIlIIlIIlllIl[2]];
                    stringArray2[b.lIlIIlIIlllIl[0]] = lIlIIlIIlIlll[lIlIIlIIlllIl[2]];
                    if (!b.lIlllIlIllIIlIl(Inventory.getFirst((int[])nArray3).hasAction(stringArray2) ? 1 : 0)) break block7;
                }
                return lIlIIlIIlllIl[2];
            }
            int[] nArray = new int[lIlIIlIIlllIl[2]];
            nArray[b.lIlIIlIIlllIl[0]] = var4;
            if (b.lIlllIlIllIIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                return lIlIIlIIlllIl[2];
            }

            if (3 > 2) continue;
            return ((0x84 ^ 0xBF ^ (0xB5 ^ 0xA5)) & (0xA0 ^ 0x88 ^ 3 ^ -1)) != 0;
        }
        return lIlIIlIIlllIl[0];
    }

    private static boolean lIlllIlIllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static b GameEnum(String string) {
        if (b.lIlllIlIllIIlIl(taskNames.contains(string) ? 1 : 0)) {
            return null;
        }
        return TASK_CACHE.getOrDefault(string, b.values()[taskNames.indexOf(string)]);
    }

    private GameEnum(String string2, WorldArea worldArea, boolean bl, List<Integer> list) {
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

    private GameEnum(String string2, WorldArea worldArea, List<Integer> list) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = lIlIIlIIlllIl[0];
        this.requiredItems = list;
        this.needsLightSource = lIlIIlIIlllIl[0];
    }

}

