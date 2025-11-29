/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.slayer.tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
        b.var3();
        b.var4();
        BANSHEES = new GameEnum(var1[var2[5]], new WorldArea(var2[6], var2[7], var2[8], var2[9], var2[0]), List.of(Integer.valueOf(var2[10])));
        BATS = new GameEnum(var1[var2[12]], new WorldArea(var2[13], var2[14], var2[15], var2[16], var2[0]));
        BEARS = new GameEnum(var1[var2[18]], new WorldArea(var2[19], var2[20], var2[21], var2[21], var2[0]));
        CAVE_CRAWLERS = new GameEnum(var1[var2[23]], new WorldArea(var2[24], var2[25], var2[26], var2[27], var2[0]));
        COWS = new GameEnum(var1[var2[29]], new WorldArea(var2[30], var2[31], var2[32], var2[33], var2[0]));
        CRAWLING_HANDS = new GameEnum(var1[var2[35]], new WorldArea(var2[36], var2[37], var2[38], var2[39], var2[0]));
        GHOSTS = new GameEnum(var1[var2[41]], new WorldArea(var2[42], var2[43], var2[35], var2[39], var2[0]));
        GOBLINS = new GameEnum(var1[var2[39]], new WorldArea(var2[44], var2[45], var2[46], var2[47], var2[0]));
        ICEFIENDS = new GameEnum(var1[var2[9]], new WorldArea(var2[48], var2[14], var2[49], var2[27], var2[0]));
        KALPHITES = new GameEnum(var1[var2[50]], new WorldArea(var2[51], var2[52], var2[39], var2[50], var2[0]));
        LIZARDS = new GameEnum(var1[var2[49]], new WorldArea(var2[53], var2[54], var2[55], var2[56], var2[0]), var2[2], List.of(Integer.valueOf(var2[57])));
        MINOTAURS = new GameEnum(var1[var2[32]], new WorldArea(var2[59], var2[60], var2[35], var2[40], var2[0]));
        MONKEYS = new GameEnum(var1[var2[62]], new WorldArea(var2[63], var2[64], var2[65], var2[58], var2[0]));
        SCORPIONS = new GameEnum(var1[var2[21]], new WorldArea(var2[67], var2[68], var2[39], var2[33], var2[0]));
        SKELETONS = new GameEnum(var1[var2[47]], new WorldArea(var2[70], var2[71], var2[47], var2[34], var2[0]));
        SOURHOGS = new GameEnum(var1[var2[56]], new WorldArea(var2[73], var2[74], var2[61], var2[28], var2[0]), List.of(Integer.valueOf(var2[75])));
        SPIDERS = new GameEnum(var1[var2[16]], new WorldArea(var2[77], var2[78], var2[47], var2[58], var2[0]));
        ZOMBIES = new GameEnum(var1[var2[80]], new WorldArea(var2[81], var2[82], var2[40], var2[21], var2[0]));
        CAVE_SLIME = new GameEnum(var1[var2[65]], new WorldArea(var2[83], var2[84], var2[49], var2[27], var2[0]), var2[0], var2[2], List.of(Integer.valueOf(var2[85])));
        CAVE_BUGS = new GameEnum(var1[var2[87]], new WorldArea(var2[88], var2[89], var2[39], var2[8], var2[0]), var2[0], var2[2], List.of(Integer.valueOf(var2[85])));
        DWARVES = new GameEnum(var1[var2[33]], new WorldArea(var2[91], var2[92], var2[93], var2[94], var2[0]));
        WOLVES = new GameEnum(var1[var2[96]], new WorldArea(var2[97], var2[98], var2[21], var2[27], var2[0]));
        DOGS = new GameEnum(var1[var2[99]], new WorldArea(var2[100], var2[101], var2[49], var2[58], var2[0]), var2[0], var2[0]);
        BIRDS = new GameEnum(var1[var2[102]], new WorldArea(var2[103], var2[104], var2[58], var2[28], var2[0]));
        RATS = new GameEnum(var1[var2[106]], new WorldArea(var2[107], var2[108], var2[62], var2[41], var2[0]));
        b[] bArray = new b[var2[58]];
        bArray[b.var2[0]] = BANSHEES;
        bArray[b.var2[2]] = BATS;
        bArray[b.var2[3]] = BEARS;
        bArray[b.var2[4]] = CAVE_CRAWLERS;
        bArray[b.var2[5]] = COWS;
        bArray[b.var2[11]] = CRAWLING_HANDS;
        bArray[b.var2[12]] = GHOSTS;
        bArray[b.var2[17]] = GOBLINS;
        bArray[b.var2[18]] = ICEFIENDS;
        bArray[b.var2[22]] = KALPHITES;
        bArray[b.var2[23]] = LIZARDS;
        bArray[b.var2[28]] = MINOTAURS;
        bArray[b.var2[29]] = MONKEYS;
        bArray[b.var2[34]] = SCORPIONS;
        bArray[b.var2[35]] = SKELETONS;
        bArray[b.var2[40]] = SOURHOGS;
        bArray[b.var2[41]] = SPIDERS;
        bArray[b.var2[8]] = ZOMBIES;
        bArray[b.var2[39]] = CAVE_SLIME;
        bArray[b.var2[27]] = CAVE_BUGS;
        bArray[b.var2[9]] = DWARVES;
        bArray[b.var2[38]] = WOLVES;
        bArray[b.var2[50]] = DOGS;
        bArray[b.var2[46]] = BIRDS;
        bArray[b.var2[49]] = RATS;
        $VALUES = bArray;
        String[] stringArray = new String[var2[58]];
        stringArray[b.var2[0]] = var1[var2[109]];
        stringArray[b.var2[2]] = var1[var2[110]];
        stringArray[b.var2[3]] = var1[var2[111]];
        stringArray[b.var2[4]] = var1[var2[112]];
        stringArray[b.var2[5]] = var1[var2[113]];
        stringArray[b.var2[11]] = var1[var2[94]];
        stringArray[b.var2[12]] = var1[var2[114]];
        stringArray[b.var2[17]] = var1[var2[115]];
        stringArray[b.var2[18]] = var1[var2[93]];
        stringArray[b.var2[22]] = var1[var2[116]];
        stringArray[b.var2[23]] = var1[var2[117]];
        stringArray[b.var2[28]] = var1[var2[118]];
        stringArray[b.var2[29]] = var1[var2[119]];
        stringArray[b.var2[34]] = var1[var2[120]];
        stringArray[b.var2[35]] = var1[var2[121]];
        stringArray[b.var2[40]] = var1[var2[122]];
        stringArray[b.var2[41]] = var1[var2[123]];
        stringArray[b.var2[8]] = var1[var2[124]];
        stringArray[b.var2[39]] = var1[var2[125]];
        stringArray[b.var2[27]] = var1[var2[126]];
        stringArray[b.var2[9]] = var1[var2[127]];
        stringArray[b.var2[38]] = var1[var2[128]];
        stringArray[b.var2[50]] = var1[var2[129]];
        stringArray[b.var2[46]] = var1[var2[130]];
        stringArray[b.var2[49]] = var1[var2[131]];
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
        this.requiredItems = List.of(Integer.valueOf(var2[1]));
        this.needsLightSource = bl2;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    public boolean q() {
        return this.needsLightSource;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (b.var15(var14, var13)) {
            char var16 = var12[var14];
            var9.append((char)(var16 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
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

    private static void var4() {
        var1 = new String[var2[132]];
        b.var1[b.var2[0]] = "Wear";
        b.var1[b.var2[2]] = "Equip";
        b.var1[b.var2[3]] = "slayer helm";
        b.var1[b.var2[4]] = "BANSHEES";
        b.var1[b.var2[5]] = "Banshee";
        b.var1[b.var2[11]] = "BATS";
        b.var1[b.var2[12]] = "Bat";
        b.var1[b.var2[17]] = "BEARS";
        b.var1[b.var2[18]] = "Bear";
        b.var1[b.var2[22]] = "CAVE_CRAWLERS";
        b.var1[b.var2[23]] = "Cave crawler";
        b.var1[b.var2[28]] = "COWS";
        b.var1[b.var2[29]] = "Cow";
        b.var1[b.var2[34]] = "CRAWLING_HANDS";
        b.var1[b.var2[35]] = "Crawling Hand";
        b.var1[b.var2[40]] = "GHOSTS";
        b.var1[b.var2[41]] = "Ghost";
        b.var1[b.var2[8]] = "GOBLINS";
        b.var1[b.var2[39]] = "Goblin";
        b.var1[b.var2[27]] = "ICEFIENDS";
        b.var1[b.var2[9]] = "Icefiend";
        b.var1[b.var2[38]] = "KALPHITES";
        b.var1[b.var2[50]] = "Kalphite worker";
        b.var1[b.var2[46]] = "LIZARDS";
        b.var1[b.var2[49]] = "Lizard";
        b.var1[b.var2[58]] = "MINOTAURS";
        b.var1[b.var2[32]] = "Minotaur";
        b.var1[b.var2[61]] = "MONKEYS";
        b.var1[b.var2[62]] = "Monkey";
        b.var1[b.var2[66]] = "SCORPIONS";
        b.var1[b.var2[21]] = "Scorpion";
        b.var1[b.var2[69]] = "SKELETONS";
        b.var1[b.var2[47]] = "Skeleton";
        b.var1[b.var2[72]] = "SOURHOGS";
        b.var1[b.var2[56]] = "Sourhog";
        b.var1[b.var2[76]] = "SPIDERS";
        b.var1[b.var2[16]] = "Spider";
        b.var1[b.var2[79]] = "ZOMBIES";
        b.var1[b.var2[80]] = "Zombie";
        b.var1[b.var2[26]] = "CAVE_SLIME";
        b.var1[b.var2[65]] = "Cave slime";
        b.var1[b.var2[86]] = "CAVE_BUGS";
        b.var1[b.var2[87]] = "Cave bug";
        b.var1[b.var2[90]] = "DWARVES";
        b.var1[b.var2[33]] = "Dwarf";
        b.var1[b.var2[95]] = "WOLVES";
        b.var1[b.var2[96]] = "Wolf";
        b.var1[b.var2[15]] = "DOGS";
        b.var1[b.var2[99]] = "Guard dog";
        b.var1[b.var2[55]] = "BIRDS";
        b.var1[b.var2[102]] = "Undead chicken";
        b.var1[b.var2[105]] = "RATS";
        b.var1[b.var2[106]] = "Rat";
        b.var1[b.var2[109]] = "banshees";
        b.var1[b.var2[110]] = "bats";
        b.var1[b.var2[111]] = "bears";
        b.var1[b.var2[112]] = "cave crawlers";
        b.var1[b.var2[113]] = "cows";
        b.var1[b.var2[94]] = "crawling hands";
        b.var1[b.var2[114]] = "ghosts";
        b.var1[b.var2[115]] = "goblins";
        b.var1[b.var2[93]] = "icefiends";
        b.var1[b.var2[116]] = "kalphite";
        b.var1[b.var2[117]] = "lizards";
        b.var1[b.var2[118]] = "minotaurs";
        b.var1[b.var2[119]] = "monkeys";
        b.var1[b.var2[120]] = "scorpions";
        b.var1[b.var2[121]] = "skeletons";
        b.var1[b.var2[122]] = "sourhogs";
        b.var1[b.var2[123]] = "spiders";
        b.var1[b.var2[124]] = "zombies";
        b.var1[b.var2[125]] = "cave slimes";
        b.var1[b.var2[126]] = "cave bugs";
        b.var1[b.var2[127]] = "dwarves";
        b.var1[b.var2[128]] = "wolves";
        b.var1[b.var2[129]] = "dogs";
        b.var1[b.var2[130]] = "birds";
        b.var1[b.var2[131]] = "rats";
    }

    private GameEnum(String string2, WorldArea worldArea) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = var2[0];
        this.requiredItems = List.of(Integer.valueOf(var2[1]));
        this.needsLightSource = var2[0];
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    public boolean l() {
        b var24;
        if (b.var25(this.requiredItems.get(var2[0]), var2[1])) {
            return var2[2];
        }
        if (b.var17(Equipment.contains(item -> item.getName().toLowerCase().contains(var1[var2[3]])) ? 1 : 0)) {
            return var2[2];
        }
        Iterator<Integer> var26 = var24.requiredItems.iterator();
        while (b.var17(var26.hasNext() ? 1 : 0)) {
            int var27;
            block7: {
                block8: {
                    var27 = var26.next();
                    int[] nArray = new int[var2[2]];
                    nArray[b.var2[0]] = var27;
                    if (!b.var17(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                    int[] nArray2 = new int[var2[2]];
                    nArray2[b.var2[0]] = var27;
                    String[] stringArray = new String[var2[2]];
                    stringArray[b.var2[0]] = var1[var2[0]];
                    if (!b.var17(Inventory.getFirst((int[])nArray2).hasAction(stringArray) ? 1 : 0)) break block8;
                    int[] nArray3 = new int[var2[2]];
                    nArray3[b.var2[0]] = var27;
                    String[] stringArray2 = new String[var2[2]];
                    stringArray2[b.var2[0]] = var1[var2[2]];
                    if (!b.var5(Inventory.getFirst((int[])nArray3).hasAction(stringArray2) ? 1 : 0)) break block7;
                }
                return var2[2];
            }
            int[] nArray = new int[var2[2]];
            nArray[b.var2[0]] = var27;
            if (b.var17(Equipment.contains((int[])nArray) ? 1 : 0)) {
                return var2[2];
            }
            0;
            if (3 > 2) continue;
            return ((0x84 ^ 0xBF ^ (0xB5 ^ 0xA5)) & (0xA0 ^ 0x88 ^ 3 ^ -1)) != 0;
        }
        return var2[0];
    }

    private static boolean var15(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    public static b GameEnum(String string) {
        if (b.var5(taskNames.contains(string) ? 1 : 0)) {
            return null;
        }
        return TASK_CACHE.getOrDefault(string, b.values()[taskNames.indexOf(string)]);
    }

    private GameEnum(String string2, WorldArea worldArea, boolean bl, List<Integer> list) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = bl;
        this.requiredItems = list;
        this.needsLightSource = var2[0];
    }

    private static boolean var25(int n2, int n3) {
        return n2 == n3;
    }

    public WorldArea n() {
        return this.slayerLocation;
    }

    private GameEnum(String string2, WorldArea worldArea, List<Integer> list) {
        this.npcName = string2;
        this.slayerLocation = worldArea;
        this.needsWaterskin = var2[0];
        this.requiredItems = list;
        this.needsLightSource = var2[0];
    }

    private static void var3() {
        var2 = new int[133];
        b.var2[0] = (0x47 ^ 0x48 ^ (0x26 ^ 0x4A)) & (188 + 146 - 189 + 64 ^ 161 + 10 - 108 + 115 ^ -1);
        b.var2[1] = -1;
        b.var2[2] = 1;
        b.var2[3] = 2;
        b.var2[4] = 3;
        b.var2[5] = 0x47 ^ 0x43;
        b.var2[6] = -(0xFFFFFBFD & 0x7686) & (0xFFFFFFEF & Short.MAX_VALUE);
        b.var2[7] = -(0xFFFFDBF1 & 0x761F) & (0xFFFFDFDF & 0x7FFB);
        b.var2[8] = 0xBC ^ 0xAD;
        b.var2[9] = 0x1E ^ 0x10 ^ (0xAE ^ 0xB4);
        b.var2[10] = 0xFFFFBA5F & 0x55E6;
        b.var2[11] = 0xC ^ 9;
        b.var2[12] = 0x9D ^ 0x9B;
        b.var2[13] = -(0xFFFFF5E7 & 0x3A5B) & (0xFFFFFDFF & 0x3F5F);
        b.var2[14] = -(0xFFFFD263 & 0x7FBF) & (0xFFFFFFBF & 0x5FEF);
        b.var2[15] = 0xA2 ^ 0x8D;
        b.var2[16] = 94 + 78 - 159 + 169 ^ 76 + 117 - 113 + 66;
        b.var2[17] = 0xBC ^ 0xBB;
        b.var2[18] = 0x56 ^ 0x5E;
        b.var2[19] = 0xFFFFBF81 & 0x4AFF;
        b.var2[20] = 0xFFFFAEFF & 0x5DFE;
        b.var2[21] = 3 ^ 0x1D;
        b.var2[22] = 0xA4 ^ 0xAD;
        b.var2[23] = 72 + 18 - 53 + 121 ^ 91 + 137 - 199 + 119;
        b.var2[24] = 0xFFFFDAFD & 0x2FD7;
        b.var2[25] = -(0xFFFFDEEB & 0x79BF) & (0xFFFFFFAF & Short.MAX_VALUE);
        b.var2[26] = 0x63 ^ 0x72 ^ (0xF4 ^ 0xC2);
        b.var2[27] = 0xB3 ^ 0xA0;
        b.var2[28] = 0x82 ^ 0x89;
        b.var2[29] = 0x8A ^ 0x8D ^ (0x47 ^ 0x4C);
        b.var2[30] = 0xFFFFCDA8 & 0x3EFF;
        b.var2[31] = 0xFFFFEFF7 & 0x1CBF;
        b.var2[32] = 0x60 ^ 0x7A;
        b.var2[33] = 6 ^ 0x62 ^ (0xD8 ^ 0x90);
        b.var2[34] = 56 + 64 - -21 + 14 ^ 35 + 5 - -78 + 32;
        b.var2[35] = 0x97 ^ 0x99;
        b.var2[36] = 0xFFFFAF6F & 0x5DDD;
        b.var2[37] = -(0xFFFFF667 & 0x6B9E) & (0xFFFFEFFF & 0x7FEF);
        b.var2[38] = 0x92 ^ 0x87;
        b.var2[39] = 0x52 ^ 0x40;
        b.var2[40] = 0x80 ^ 0x8F;
        b.var2[41] = 144 + 102 - 133 + 40 ^ 75 + 8 - -29 + 25;
        b.var2[42] = 0xFFFF86FC & 0x7F7B;
        b.var2[43] = 0xFFFFFF7A & 0x27A5;
        b.var2[44] = 0xFFFFDEFB & 0x2DAD;
        b.var2[45] = -(0xFFFFC76F & 0x79B9) & (0xFFFFCFBF & 0x7DFF);
        b.var2[46] = 0x21 ^ 7 ^ (0xF1 ^ 0xC0);
        b.var2[47] = 0x75 ^ 0x2A ^ 90 + 1 - 83 + 119;
        b.var2[48] = 0xFFFFFBBB & 0xFF6;
        b.var2[49] = 0x6C ^ 0x65 ^ (0x4B ^ 0x5A);
        b.var2[50] = 13 + 45 - -35 + 37 ^ 127 + 24 - 62 + 59;
        b.var2[51] = 0xFFFF9CFF & 0x6FF3;
        b.var2[52] = -(0xFFFFD97B & 0x6EE6) & (0xFFFFFD75 & 0x6FFF);
        b.var2[53] = 0xFFFF9F3F & 0x6DFD;
        b.var2[54] = 0xFFFFABC7 & 0x5FFF;
        b.var2[55] = 0x88 ^ 0xB9;
        b.var2[56] = 89 + 59 - 139 + 121 ^ 67 + 58 - 73 + 108;
        b.var2[57] = -(0xFFFFD297 & 0x6D7E) & (0xFFFFFA7F & 0x5FBD);
        b.var2[58] = 0x41 ^ 0x58;
        b.var2[59] = 0xFFFFDF5D & 0x27EF;
        b.var2[60] = -(0xFFFFF7F5 & 0x2B2F) & (0xFFFFF77C & 0x3FFF);
        b.var2[61] = 0x5A ^ 0x41;
        b.var2[62] = 0xA9 ^ 0xB5;
        b.var2[63] = 0xFFFF8AD6 & 0x7FFB;
        b.var2[64] = 0xFFFFDFFA & 0x2BAF;
        b.var2[65] = 0x73 ^ 0x6C ^ (0x67 ^ 0x50);
        b.var2[66] = 0xE2 ^ 0x95 ^ (0x1B ^ 0x71);
        b.var2[67] = 0xFFFF9CDB & 0x6FFE;
        b.var2[68] = 0xFFFFAEFA & 0x5DCF;
        b.var2[69] = 0x77 ^ 0x68;
        b.var2[70] = -(0xFFFFF91B & 0x17ED) & (0xFFFFBF3E & 0x5DE9);
        b.var2[71] = -(0xFFFFF94D & 0x46F3) & (0xFFFFFEFF & 0x67EF);
        b.var2[72] = 0x71 ^ 0x2F ^ 61 + 93 - 64 + 37;
        b.var2[73] = -(126 + 78 - 37 + 12) & (0xFFFF8DFF & 0x7EFF);
        b.var2[74] = 0xFFFFE5DF & 0x3FFD;
        b.var2[75] = 0xFFFFE77F & 0x79EE;
        b.var2[76] = 12 + 94 - 95 + 127 ^ 57 + 23 - -26 + 63;
        b.var2[77] = 0xFFFF9DDF & 0x6E75;
        b.var2[78] = 0xFFFFEDFF & 0x1E9D;
        b.var2[79] = 0x8B ^ 0xAE;
        b.var2[80] = 0x72 ^ 0x44 ^ (4 ^ 0x14);
        b.var2[81] = 0xFFFF9C71 & 0x6FCF;
        b.var2[82] = 0xFFFFFEE0 & 0x27BF;
        b.var2[83] = -(0xFFFFBB9B & 0x75EE) & (0xFFFFFFEF & 0x3DFD);
        b.var2[84] = -(0xFFFFFEF3 & 0x59BD) & (0xFFFFFDF7 & 0x7FFB);
        b.var2[85] = 0xFFFF9BC7 & 0x75FF;
        b.var2[86] = 0x60 ^ 0x21 ^ (0x33 ^ 0x5B);
        b.var2[87] = 0x1C ^ 0x36;
        b.var2[88] = -(0xFFFFF2D5 & 0x2FBB) & (0xFFFFFFFB & 0x2EFD);
        b.var2[89] = 0xFFFFF5C5 & 0x2F7F;
        b.var2[90] = 3 + 46 - 13 + 104 ^ 38 + 146 - 136 + 119;
        b.var2[91] = 0xFFFF9FC5 & 0x6BFA;
        b.var2[92] = 0xFFFFEE77 & 0x37CF;
        b.var2[93] = 0x75 ^ 0x3F ^ (0xB6 ^ 0xC1);
        b.var2[94] = 0x23 ^ 0x6D ^ (0x68 ^ 0x1C);
        b.var2[95] = 0x24 ^ 9;
        b.var2[96] = 0x64 ^ 0x4C ^ (0x9C ^ 0x9A);
        b.var2[97] = 0xFFFF8FEF & 0x7B1D;
        b.var2[98] = -(0xFFFF91D6 & 0x7E2B) & (0xFFFF9DA7 & Short.MAX_VALUE);
        b.var2[99] = 0x1F ^ 0x2F;
        b.var2[100] = 0xFFFFFBFF & 0xE3F;
        b.var2[101] = 0xFFFFCDED & 0x3EFE;
        b.var2[102] = 0x7E ^ 0x6A ^ (0xBB ^ 0x9D);
        b.var2[103] = -(0xFFFFF625 & 0x69FB) & (0xFFFFEE79 & 0x7FBF);
        b.var2[104] = -(0xFFFFF2BB & 0x6D77) & (0xFFFFFFFF & 0x6DF3);
        b.var2[105] = 0xE5 ^ 0xB3 ^ (0xDD ^ 0xB8);
        b.var2[106] = 0x41 ^ 0x75;
        b.var2[107] = 0xFFFFDFDC & 0x2CBF;
        b.var2[108] = 0xFFFFB6DA & 0x6FA7;
        b.var2[109] = 0xEF ^ 0x81 ^ (0x2B ^ 0x70);
        b.var2[110] = 0x61 ^ 0x57;
        b.var2[111] = 80 + 44 - 46 + 92 ^ 25 + 88 - 72 + 116;
        b.var2[112] = 20 + 26 - -46 + 79 ^ 113 + 74 - 158 + 118;
        b.var2[113] = 0x6C ^ 9 ^ (4 ^ 0x58);
        b.var2[114] = 0xB7 ^ 0x8C;
        b.var2[115] = 0x44 ^ 0x73 ^ (0x93 ^ 0x98);
        b.var2[116] = 0x2D ^ 0x6A ^ (0xC6 ^ 0xBF);
        b.var2[117] = 0x22 ^ 0x1D;
        b.var2[118] = 14 + 34 - -18 + 61 ^ (0x9D ^ 0xA2);
        b.var2[119] = 0x85 ^ 0xC4;
        b.var2[120] = 0x26 ^ 0x64;
        b.var2[121] = 3 ^ (0x87 ^ 0xC7);
        b.var2[122] = 0xEF ^ 0xAB;
        b.var2[123] = 0xE0 ^ 0xA5;
        b.var2[124] = 0xE5 ^ 0xAF ^ (0xAE ^ 0xA2);
        b.var2[125] = 0xE2 ^ 0x98 ^ (0x99 ^ 0xA4);
        b.var2[126] = 0xA8 ^ 0x92 ^ (0x7D ^ 0xF);
        b.var2[127] = 118 + 113 - 214 + 221 ^ 156 + 91 - 133 + 53;
        b.var2[128] = 0x4D ^ 2 ^ (0xA6 ^ 0xA3);
        b.var2[129] = 0x4F ^ 4;
        b.var2[130] = 0xD0 ^ 0x90 ^ (0x24 ^ 0x28);
        b.var2[131] = 0xE3 ^ 0xAE;
        b.var2[132] = 0x36 ^ 0x78;
    }
}

