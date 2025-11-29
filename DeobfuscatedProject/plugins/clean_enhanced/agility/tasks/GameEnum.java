/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Quest
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.quests.Quests
 *  org.jetbrains.annotations.Nullable
 */
package gg.squire.agility.tasks;

import gg.squire.client.util.Log;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Quest;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.quests.Quests;
import org.jetbrains.annotations.Nullable;
import gg.squire.agility.tasks.AHelper;
import gg.squire.agility.tasks.CHelper;

public final class GameEnum
extends Enum<b> {
    public static final  /* enum */ b POLLNIVNEACH;
    public static final  /* enum */ b SEERS_VILLAGE;
    private static final  b[] $VALUES;

    public static final  /* enum */ b VARROCK_ROOFTOP;
    public static final  /* enum */ b ARDOUGNE;
    public static final  /* enum */ b PRIFDDINAS;
    private final  int level;
    private final  c[] obstacles;
    public static final  /* enum */ b FALADOR;
    public static final  /* enum */ b CANIFIS_ROOFTOP;
    private final  List<Integer> regionId;
    public static final  /* enum */ b DRAYNOR_VILLAGE;
    public static final  /* enum */ b RELLEKKA;

    private static void var3() {
        var1 = new String[var2[466]];
        b.var1[b.var2[1]] = "No course found for level {}, falling back on Draynor.";
        b.var1[b.var2[0]] = "DRAYNOR_VILLAGE";
        b.var1[b.var2[10]] = "Rough wall";
        b.var1[b.var2[2]] = "Climb";
        b.var1[b.var2[16]] = "Tightrope";
        b.var1[b.var2[17]] = "Cross";
        b.var1[b.var2[22]] = "Tightrope";
        b.var1[b.var2[5]] = "Cross";
        b.var1[b.var2[27]] = "Narrow wall";
        b.var1[b.var2[28]] = "Balance";
        b.var1[b.var2[31]] = "Wall";
        b.var1[b.var2[32]] = "Jump-up";
        b.var1[b.var2[34]] = "Gap";
        b.var1[b.var2[35]] = "Jump";
        b.var1[b.var2[40]] = "Crate";
        b.var1[b.var2[41]] = "Climb-down";
        b.var1[b.var2[42]] = "VARROCK_ROOFTOP";
        b.var1[b.var2[49]] = "Rough wall";
        b.var1[b.var2[50]] = "Climb";
        b.var1[b.var2[57]] = "Clothes line";
        b.var1[b.var2[58]] = "Cross";
        b.var1[b.var2[62]] = "Gap";
        b.var1[b.var2[63]] = "Leap";
        b.var1[b.var2[67]] = "Wall";
        b.var1[b.var2[68]] = "Balance";
        b.var1[b.var2[73]] = "Gap";
        b.var1[b.var2[74]] = "Leap";
        b.var1[b.var2[79]] = "Gap";
        b.var1[b.var2[80]] = "Leap";
        b.var1[b.var2[86]] = "Gap";
        b.var1[b.var2[43]] = "Leap";
        b.var1[b.var2[92]] = "Ledge";
        b.var1[b.var2[93]] = "Hurdle";
        b.var1[b.var2[95]] = "Edge";
        b.var1[b.var2[96]] = "Jump-off";
        b.var1[b.var2[97]] = "CANIFIS_ROOFTOP";
        b.var1[b.var2[104]] = "Tall tree";
        b.var1[b.var2[105]] = "Climb";
        b.var1[b.var2[112]] = "Gap";
        b.var1[b.var2[113]] = "Jump";
        b.var1[b.var2[98]] = "Gap";
        b.var1[b.var2[119]] = "Jump";
        b.var1[b.var2[122]] = "Gap";
        b.var1[b.var2[123]] = "Jump";
        b.var1[b.var2[128]] = "Gap";
        b.var1[b.var2[129]] = "Jump";
        b.var1[b.var2[134]] = "Pole-vault";
        b.var1[b.var2[135]] = "Vault";
        b.var1[b.var2[139]] = "Gap";
        b.var1[b.var2[140]] = "Jump";
        b.var1[b.var2[144]] = "Gap";
        b.var1[b.var2[145]] = "Jump";
        b.var1[b.var2[147]] = "FALADOR";
        b.var1[b.var2[153]] = "Rough wall";
        b.var1[b.var2[154]] = "Climb";
        b.var1[b.var2[161]] = "Tightrope";
        b.var1[b.var2[162]] = "Cross";
        b.var1[b.var2[167]] = "Hand holds";
        b.var1[b.var2[168]] = "Cross";
        b.var1[b.var2[174]] = "Gap";
        b.var1[b.var2[175]] = "Jump";
        b.var1[b.var2[179]] = "Gap";
        b.var1[b.var2[180]] = "Jump";
        b.var1[b.var2[185]] = "Tightrope";
        b.var1[b.var2[186]] = "Cross";
        b.var1[b.var2[191]] = "Tightrope";
        b.var1[b.var2[192]] = "Cross";
        b.var1[b.var2[196]] = "Gap";
        b.var1[b.var2[197]] = "Jump";
        b.var1[b.var2[200]] = "Ledge";
        b.var1[b.var2[201]] = "Jump";
        b.var1[b.var2[208]] = "Ledge";
        b.var1[b.var2[209]] = "Jump";
        b.var1[b.var2[212]] = "Ledge";
        b.var1[b.var2[213]] = "Jump";
        b.var1[b.var2[218]] = "Ledge";
        b.var1[b.var2[219]] = "Jump";
        b.var1[b.var2[224]] = "Edge";
        b.var1[b.var2[225]] = "Jump";
        b.var1[b.var2[227]] = "SEERS_VILLAGE";
        b.var1[b.var2[232]] = "Wall";
        b.var1[b.var2[233]] = "Climb-up";
        b.var1[b.var2[239]] = "Gap";
        b.var1[b.var2[240]] = "Jump";
        b.var1[b.var2[246]] = "Tightrope";
        b.var1[b.var2[247]] = "Cross";
        b.var1[b.var2[253]] = "Gap";
        b.var1[b.var2[254]] = "Jump";
        b.var1[b.var2[257]] = "Gap";
        b.var1[b.var2[258]] = "Jump";
        b.var1[b.var2[263]] = "Edge";
        b.var1[b.var2[264]] = "Jump";
        b.var1[b.var2[267]] = "POLLNIVNEACH";
        b.var1[b.var2[271]] = "Basket";
        b.var1[b.var2[272]] = "Climb-on";
        b.var1[b.var2[277]] = "Market stall";
        b.var1[b.var2[278]] = "Jump-on";
        b.var1[b.var2[282]] = "Banner";
        b.var1[b.var2[283]] = "Grab";
        b.var1[b.var2[288]] = "Gap";
        b.var1[b.var2[289]] = "Leap";
        b.var1[b.var2[293]] = "Tree";
        b.var1[b.var2[294]] = "Jump-to";
        b.var1[b.var2[298]] = "Rough wall";
        b.var1[b.var2[299]] = "Climb";
        b.var1[b.var2[302]] = "Monkeybars";
        b.var1[b.var2[303]] = "Cross";
        b.var1[b.var2[307]] = "Tree";
        b.var1[b.var2[308]] = "Jump-on";
        b.var1[b.var2[312]] = "Drying line";
        b.var1[b.var2[313]] = "Jump-to";
        b.var1[b.var2[314]] = "PRIFDDINAS";
        b.var1[b.var2[321]] = "Ladder";
        b.var1[b.var2[322]] = "Climb";
        b.var1[b.var2[327]] = "Dark hole";
        b.var1[b.var2[328]] = "Enter";
        b.var1[b.var2[331]] = "Tightrope";
        b.var1[b.var2[332]] = "Cross";
        b.var1[b.var2[336]] = "Chimney";
        b.var1[b.var2[337]] = "Jump";
        b.var1[b.var2[340]] = "Roof edge";
        b.var1[b.var2[341]] = "Jump";
        b.var1[b.var2[346]] = "Ladder";
        b.var1[b.var2[347]] = "Climb";
        b.var1[b.var2[349]] = "Rope bridge";
        b.var1[b.var2[350]] = "Cross";
        b.var1[b.var2[355]] = "Tightrope";
        b.var1[b.var2[356]] = "Cross";
        b.var1[b.var2[359]] = "Rope bridge";
        b.var1[b.var2[360]] = "Cross";
        b.var1[b.var2[363]] = "Tightrope";
        b.var1[b.var2[364]] = "Cross";
        b.var1[b.var2[367]] = "Tightrope";
        b.var1[b.var2[368]] = "Cross";
        b.var1[b.var2[371]] = "Tightrope";
        b.var1[b.var2[372]] = "Cross";
        b.var1[b.var2[375]] = "Dark hole";
        b.var1[b.var2[376]] = "Enter";
        b.var1[b.var2[379]] = "Ladder";
        b.var1[b.var2[380]] = "Climb";
        b.var1[b.var2[381]] = "RELLEKKA";
        b.var1[b.var2[388]] = "Rough wall";
        b.var1[b.var2[389]] = "Climb";
        b.var1[b.var2[396]] = "Gap";
        b.var1[b.var2[397]] = "Leap";
        b.var1[b.var2[401]] = "Tightrope";
        b.var1[b.var2[402]] = "Cross";
        b.var1[b.var2[406]] = "Gap";
        b.var1[b.var2[407]] = "Leap";
        b.var1[b.var2[412]] = "Gap";
        b.var1[b.var2[413]] = "Hurdle";
        b.var1[b.var2[417]] = "Tightrope";
        b.var1[b.var2[418]] = "Cross";
        b.var1[b.var2[423]] = "Pile of fish";
        b.var1[b.var2[424]] = "Jump-in";
        b.var1[b.var2[425]] = "ARDOUGNE";
        b.var1[b.var2[431]] = "Wooden Beams";
        b.var1[b.var2[432]] = "Climb-up";
        b.var1[b.var2[438]] = "Gap";
        b.var1[b.var2[439]] = "Jump";
        b.var1[b.var2[444]] = "Plank";
        b.var1[b.var2[445]] = "Walk-on";
        b.var1[b.var2[448]] = "Gap";
        b.var1[b.var2[449]] = "Jump";
        b.var1[b.var2[453]] = "Gap";
        b.var1[b.var2[454]] = "Jump";
        b.var1[b.var2[458]] = "Steep roof";
        b.var1[b.var2[459]] = "Balance-across";
        b.var1[b.var2[463]] = "Gap";
        b.var1[b.var2[464]] = "Jump";
    }

    private static boolean var4(Object object, Object object2) {
        return object == object2;
    }

    private GameEnum(int n2, List<Integer> list, c ... cArray) {
        this.level = n2;
        this.regionId = list;
        this.obstacles = cArray;
    }

    private static boolean var5(int n, int n2) {
        return n == n2;
    }

    /*
     * WARNING - void declaration
     */
    public static b GameEnum(int n) {
        void var6;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var7 = var2[1];
        while (b.var8(var7, (int)var6)) {
            int var9;
            void var10;
            void var11 = var10[var7];
            if (b.var12(var11.regionId.contains(var9) ? 1 : 0)) {
                return var11;
            }
            ++var7;
            0;
            if (-(88 + 66 - 42 + 40 ^ 49 + 131 - 91 + 67) < 0) continue;
            return null;
        }
        return null;
    }

    private static boolean var13(int n, int n2) {
        return n >= n2;
    }

    static {
        b.var14();
        b.var3();
        c[] cArray = new c[var2[5]];
        cArray[b.var2[1]] = new CHelper(new AHelper(new WorldPoint(var2[6], var2[7], var2[1]), new WorldPoint(var2[8], var2[9], var2[1]), var2[1]), var1[var2[10]], var1[var2[2]], new WorldPoint(var2[11], var2[12], var2[1]));
        cArray[b.var2[0]] = new CHelper(new AHelper(new WorldPoint(var2[13], var2[7], var2[2]), new WorldPoint(var2[14], var2[15], var2[2]), var2[2]), var1[var2[16]], var1[var2[17]]);
        cArray[b.var2[10]] = new CHelper(new AHelper(new WorldPoint(var2[18], var2[19], var2[2]), new WorldPoint(var2[20], var2[21], var2[2]), var2[2]), var1[var2[22]], var1[var2[5]]);
        cArray[b.var2[2]] = new CHelper(new AHelper(new WorldPoint(var2[23], var2[24], var2[2]), new WorldPoint(var2[25], var2[26], var2[2]), var2[2]), var1[var2[27]], var1[var2[28]]);
        cArray[b.var2[16]] = new CHelper(new AHelper(new WorldPoint(var2[18], var2[29], var2[2]), new WorldPoint(var2[18], var2[30], var2[2]), var2[2]), var1[var2[31]], var1[var2[32]]);
        cArray[b.var2[17]] = new CHelper(new AHelper(new WorldPoint(var2[18], var2[33], var2[2]), new WorldPoint(var2[25], var2[33], var2[2]), var2[2]), var1[var2[34]], var1[var2[35]]);
        cArray[b.var2[22]] = new CHelper(new AHelper(new WorldPoint(var2[36], var2[37], var2[2]), new WorldPoint(var2[38], var2[39], var2[2]), var2[2]), var1[var2[40]], var1[var2[41]]);
        DRAYNOR_VILLAGE = new GameEnum(var2[0], List.of(Integer.valueOf(var2[3]), Integer.valueOf(var2[4])), cArray);
        c[] cArray2 = new c[var2[28]];
        cArray2[b.var2[1]] = new CHelper(new AHelper(new WorldPoint(var2[45], var2[46], var2[1]), new WorldPoint(var2[47], var2[48], var2[1]), var2[1]), var1[var2[49]], var1[var2[50]], new WorldPoint(var2[51], var2[52], var2[1]));
        cArray2[b.var2[0]] = new CHelper(new AHelper(new WorldPoint(var2[53], var2[54], var2[2]), new WorldPoint(var2[55], var2[56], var2[2]), var2[2]), var1[var2[57]], var1[var2[58]]);
        cArray2[b.var2[10]] = new CHelper(new AHelper(new WorldPoint(var2[59], var2[52], var2[2]), new WorldPoint(var2[60], var2[61], var2[2]), var2[2]), var1[var2[62]], var1[var2[63]]);
        cArray2[b.var2[2]] = new CHelper(new AHelper(new WorldPoint(var2[64], var2[65], var2[0]), new WorldPoint(var2[66], var2[65], var2[0]), var2[0]), var1[var2[67]], var1[var2[68]]);
        cArray2[b.var2[16]] = new CHelper(new AHelper(new WorldPoint(var2[69], var2[70], var2[2]), new WorldPoint(var2[71], var2[72], var2[2]), var2[2]), var1[var2[73]], var1[var2[74]], new WorldPoint(var2[66], var2[75], var2[2]));
        cArray2[b.var2[17]] = new CHelper(new AHelper(new WorldPoint(var2[76], var2[77], var2[2]), new WorldPoint(var2[59], var2[78], var2[2]), var2[2]), var1[var2[79]], var1[var2[80]], new WorldPoint(var2[81], var2[82], var2[2]));
        cArray2[b.var2[22]] = new CHelper(new AHelper(new WorldPoint(var2[83], var2[84], var2[2]), new WorldPoint(var2[85], var2[72], var2[2]), var2[2]), var1[var2[86]], var1[var2[43]], new WorldPoint(var2[87], var2[72], var2[2]));
        cArray2[b.var2[5]] = new CHelper(new AHelper(new WorldPoint(var2[88], var2[89], var2[2]), new WorldPoint(var2[90], var2[91], var2[2]), var2[2]), var1[var2[92]], var1[var2[93]]);
        cArray2[b.var2[27]] = new CHelper(new AHelper(new WorldPoint(var2[90], var2[56], var2[2]), new WorldPoint(var2[88], var2[94], var2[2]), var2[2]), var1[var2[95]], var1[var2[96]]);
        VARROCK_ROOFTOP = new GameEnum(var2[43], List.of(Integer.valueOf(var2[44])), cArray2);
        c[] cArray3 = new c[var2[27]];
        cArray3[b.var2[1]] = new CHelper(new AHelper(new WorldPoint(var2[100], var2[101], var2[1]), new WorldPoint(var2[102], var2[103], var2[1]), var2[1]), var1[var2[104]], var1[var2[105]], new WorldPoint(var2[106], var2[107], var2[1]));
        cArray3[b.var2[0]] = new CHelper(new AHelper(new WorldPoint(var2[108], var2[109], var2[10]), new WorldPoint(var2[110], var2[111], var2[10]), var2[10]), var1[var2[112]], var1[var2[113]], new WorldPoint(var2[114], var2[111], var2[10]));
        cArray3[b.var2[10]] = new CHelper(new AHelper(new WorldPoint(var2[115], var2[116], var2[10]), new WorldPoint(var2[117], var2[118], var2[10]), var2[10]), var1[var2[98]], var1[var2[119]], new WorldPoint(var2[115], var2[117], var2[10]));
        cArray3[b.var2[2]] = new CHelper(new AHelper(new WorldPoint(var2[120], var2[111], var2[10]), new WorldPoint(var2[121], var2[114], var2[10]), var2[10]), var1[var2[122]], var1[var2[123]], new WorldPoint(var2[120], var2[124], var2[10]));
        cArray3[b.var2[16]] = new CHelper(new AHelper(new WorldPoint(var2[125], var2[109], var2[2]), new WorldPoint(var2[126], var2[127], var2[2]), var2[2]), var1[var2[128]], var1[var2[129]], new WorldPoint(var2[130], var2[109], var2[2]));
        cArray3[b.var2[17]] = new CHelper(new AHelper(new WorldPoint(var2[131], var2[126], var2[10]), new WorldPoint(var2[132], var2[133], var2[10]), var2[10]), var1[var2[134]], var1[var2[135]]);
        cArray3[b.var2[22]] = new CHelper(new AHelper(new WorldPoint(var2[136], var2[137], var2[2]), new WorldPoint(var2[117], var2[138], var2[2]), var2[2]), var1[var2[139]], var1[var2[140]], new WorldPoint(var2[116], var2[131], var2[2]));
        cArray3[b.var2[5]] = new CHelper(new AHelper(new WorldPoint(var2[141], var2[125], var2[10]), new WorldPoint(var2[142], var2[143], var2[10]), var2[10]), var1[var2[144]], var1[var2[145]], new WorldPoint(var2[146], var2[143], var2[10]));
        CANIFIS_ROOFTOP = new GameEnum(var2[98], List.of(Integer.valueOf(var2[99])), cArray3);
        c[] cArray4 = new c[var2[35]];
        cArray4[b.var2[1]] = new CHelper(new AHelper(new WorldPoint(var2[149], var2[150], var2[1]), new WorldPoint(var2[151], var2[152], var2[1]), var2[1]), var1[var2[153]], var1[var2[154]], new WorldPoint(var2[155], var2[156], var2[1]));
        cArray4[b.var2[0]] = new CHelper(new AHelper(new WorldPoint(var2[157], var2[158], var2[2]), new WorldPoint(var2[159], var2[160], var2[2]), var2[2]), var1[var2[161]], var1[var2[162]], new WorldPoint(var2[159], var2[158], var2[2]));
        cArray4[b.var2[10]] = new CHelper(new AHelper(new WorldPoint(var2[163], var2[164], var2[2]), new WorldPoint(var2[165], var2[166], var2[2]), var2[2]), var1[var2[167]], var1[var2[168]], new WorldPoint(var2[169], var2[170], var2[2]));
        cArray4[b.var2[2]] = new CHelper(new AHelper(new WorldPoint(var2[171], var2[172], var2[2]), new WorldPoint(var2[169], var2[173], var2[2]), var2[2]), var1[var2[174]], var1[var2[175]], new WorldPoint(var2[171], var2[176], var2[2]));
        cArray4[b.var2[16]] = new CHelper(new AHelper(new WorldPoint(var2[163], var2[177], var2[2]), new WorldPoint(var2[171], var2[178], var2[2]), var2[2]), var1[var2[179]], var1[var2[180]], new WorldPoint(var2[181], var2[178], var2[2]));
        cArray4[b.var2[17]] = new CHelper(new AHelper(new WorldPoint(var2[182], var2[183], var2[2]), new WorldPoint(var2[184], var2[178], var2[2]), var2[2]), var1[var2[185]], var1[var2[186]], new WorldPoint(var2[182], var2[178], var2[2]));
        cArray4[b.var2[22]] = new CHelper(new AHelper(new WorldPoint(var2[187], var2[188], var2[2]), new WorldPoint(var2[189], var2[190], var2[2]), var2[2]), var1[var2[191]], var1[var2[192]], new WorldPoint(var2[187], var2[193], var2[2]));
        cArray4[b.var2[5]] = new CHelper(new AHelper(new WorldPoint(var2[194], var2[172], var2[2]), new WorldPoint(var2[195], var2[193], var2[2]), var2[2]), var1[var2[196]], var1[var2[197]], new WorldPoint(var2[198], var2[190], var2[2]));
        cArray4[b.var2[27]] = new CHelper(new AHelper(new WorldPoint(var2[198], var2[164], var2[2]), new WorldPoint(var2[199], var2[158], var2[2]), var2[2]), var1[var2[200]], var1[var2[201]], new WorldPoint(var2[202], var2[203], var2[2]));
        cArray4[b.var2[28]] = new CHelper(new AHelper(new WorldPoint(var2[204], var2[205], var2[2]), new WorldPoint(var2[206], var2[207], var2[2]), var2[2]), var1[var2[208]], var1[var2[209]], new WorldPoint(var2[204], var2[158], var2[2]));
        cArray4[b.var2[31]] = new CHelper(new AHelper(new WorldPoint(var2[194], var2[160], var2[2]), new WorldPoint(var2[210], var2[211], var2[2]), var2[2]), var1[var2[212]], var1[var2[213]], new WorldPoint(var2[214], var2[215], var2[2]));
        cArray4[b.var2[32]] = new CHelper(new AHelper(new WorldPoint(var2[214], var2[215], var2[2]), new WorldPoint(var2[216], var2[217], var2[2]), var2[2]), var1[var2[218]], var1[var2[219]], new WorldPoint(var2[220], var2[221], var2[2]));
        cArray4[b.var2[34]] = new CHelper(new AHelper(new WorldPoint(var2[222], var2[211], var2[2]), new WorldPoint(var2[223], var2[221], var2[2]), var2[2]), var1[var2[224]], var1[var2[225]], new WorldPoint(var2[226], var2[221], var2[2]));
        FALADOR = new GameEnum(var2[144], List.of(Integer.valueOf(var2[148])), cArray4);
        c[] cArray5 = new c[var2[22]];
        cArray5[b.var2[1]] = new CHelper(new AHelper(new WorldPoint(var2[229], var2[110], var2[1]), new WorldPoint(var2[230], var2[231], var2[1]), var2[1]), var1[var2[232]], var1[var2[233]], new WorldPoint(var2[234], var2[107], var2[1]));
        cArray5[b.var2[0]] = new CHelper(new AHelper(new WorldPoint(var2[235], var2[236], var2[2]), new WorldPoint(var2[237], var2[238], var2[2]), var2[2]), var1[var2[239]], var1[var2[240]], new WorldPoint(var2[241], var2[242], var2[2]));
        cArray5[b.var2[10]] = new CHelper(new AHelper(new WorldPoint(var2[243], var2[244], var2[10]), new WorldPoint(var2[245], var2[107], var2[10]), var2[10]), var1[var2[246]], var1[var2[247]], new WorldPoint(var2[248], var2[249], var2[10]));
        cArray5[b.var2[2]] = new CHelper(new AHelper(new WorldPoint(var2[248], var2[250], var2[10]), new WorldPoint(var2[251], var2[252], var2[10]), var2[10]), var1[var2[253]], var1[var2[254]], new WorldPoint(var2[248], var2[131], var2[10]));
        cArray5[b.var2[16]] = new CHelper(new AHelper(new WorldPoint(var2[255], var2[256], var2[2]), new WorldPoint(var2[251], var2[101], var2[2]), var2[2]), var1[var2[257]], var1[var2[258]], new WorldPoint(var2[255], var2[259], var2[2]));
        cArray5[b.var2[17]] = new CHelper(new AHelper(new WorldPoint(var2[260], var2[256], var2[10]), new WorldPoint(var2[261], var2[262], var2[10]), var2[10]), var1[var2[263]], var1[var2[264]], new WorldPoint(var2[265], var2[266], var2[10]));
        SEERS_VILLAGE = new GameEnum(var2[175], List.of(Integer.valueOf(var2[228])), cArray5);
        c[] cArray6 = new c[var2[28]];
        cArray6[b.var2[1]] = new CHelper(new AHelper(new WorldPoint(var2[207], var2[149], var2[1]), new WorldPoint(var2[269], var2[270], var2[1]), var2[1]), var1[var2[271]], var1[var2[272]], new WorldPoint(var2[273], var2[274], var2[1]));
        cArray6[b.var2[0]] = new CHelper(new AHelper(new WorldPoint(var2[273], var2[275], var2[0]), new WorldPoint(var2[205], var2[276], var2[0]), var2[0]), var1[var2[277]], var1[var2[278]]);
        cArray6[b.var2[10]] = new CHelper(new AHelper(new WorldPoint(var2[190], var2[279], var2[0]), new WorldPoint(var2[280], var2[281], var2[0]), var2[0]), var1[var2[282]], var1[var2[283]]);
        cArray6[b.var2[2]] = new CHelper(new AHelper(new WorldPoint(var2[284], var2[285], var2[0]), new WorldPoint(var2[286], var2[287], var2[0]), var2[0]), var1[var2[288]], var1[var2[289]]);
        cArray6[b.var2[16]] = new CHelper(new AHelper(new WorldPoint(var2[290], var2[281], var2[0]), new WorldPoint(var2[291], var2[292], var2[0]), var2[0]), var1[var2[293]], var1[var2[294]]);
        cArray6[b.var2[17]] = new CHelper(new AHelper(new WorldPoint(var2[291], var2[295], var2[0]), new WorldPoint(var2[296], var2[297], var2[0]), var2[0]), var1[var2[298]], var1[var2[299]]);
        cArray6[b.var2[22]] = new CHelper(new AHelper(new WorldPoint(var2[296], var2[300], var2[10]), new WorldPoint(var2[280], var2[301], var2[10]), var2[10]), var1[var2[302]], var1[var2[303]]);
        cArray6[b.var2[5]] = new CHelper(new AHelper(new WorldPoint(var2[173], var2[304], var2[10]), new WorldPoint(var2[305], var2[306], var2[10]), var2[10]), var1[var2[307]], var1[var2[308]]);
        cArray6[b.var2[27]] = new CHelper(new AHelper(new WorldPoint(var2[309], var2[310], var2[10]), new WorldPoint(var2[286], var2[311], var2[10]), var2[10]), var1[var2[312]], var1[var2[313]]);
        POLLNIVNEACH = new GameEnum(var2[201], List.of(Integer.valueOf(var2[268])), cArray6);
        c[] cArray7 = new c[var2[40]];
        cArray7[b.var2[1]] = new CHelper(new AHelper(new WorldPoint(var2[319], var2[320], var2[1]), new WorldPoint(var2[319], var2[320], var2[1]), var2[1]), var1[var2[321]], var1[var2[322]], new WorldPoint(var2[319], var2[320], var2[1]));
        cArray7[b.var2[0]] = new CHelper(new AHelper(new WorldPoint(var2[323], var2[324], var2[1]), new WorldPoint(var2[325], var2[326], var2[1]), var2[1]), var1[var2[327]], var1[var2[328]]);
        cArray7[b.var2[10]] = new CHelper(new AHelper(new WorldPoint(var2[33], var2[329], var2[10]), new WorldPoint(var2[30], var2[330], var2[10]), var2[10]), var1[var2[331]], var1[var2[332]]);
        cArray7[b.var2[2]] = new CHelper(new AHelper(new WorldPoint(var2[333], var2[334], var2[10]), new WorldPoint(var2[335], var2[334], var2[10]), var2[10]), var1[var2[336]], var1[var2[337]]);
        cArray7[b.var2[16]] = new CHelper(new AHelper(new WorldPoint(var2[338], var2[330], var2[10]), new WorldPoint(var2[338], var2[339], var2[10]), var2[10]), var1[var2[340]], var1[var2[341]]);
        cArray7[b.var2[17]] = new CHelper(new AHelper(new WorldPoint(var2[342], var2[343], var2[1]), new WorldPoint(var2[344], var2[345], var2[1]), var2[1]), var1[var2[346]], var1[var2[347]]);
        cArray7[b.var2[22]] = new CHelper(new AHelper(new WorldPoint(var2[348], var2[343], var2[10]), new WorldPoint(var2[342], var2[84], var2[10]), var2[10]), var1[var2[349]], var1[var2[350]]);
        cArray7[b.var2[5]] = new CHelper(new AHelper(new WorldPoint(var2[351], var2[352], var2[10]), new WorldPoint(var2[353], var2[354], var2[10]), var2[10]), var1[var2[355]], var1[var2[356]]);
        cArray7[b.var2[27]] = new CHelper(new AHelper(new WorldPoint(var2[357], var2[345], var2[10]), new WorldPoint(var2[358], var2[78], var2[10]), var2[10]), var1[var2[359]], var1[var2[360]]);
        cArray7[b.var2[28]] = new CHelper(new AHelper(new WorldPoint(var2[361], var2[70], var2[10]), new WorldPoint(var2[358], var2[362], var2[10]), var2[10]), var1[var2[363]], var1[var2[364]]);
        cArray7[b.var2[31]] = new CHelper(new AHelper(new WorldPoint(var2[358], var2[365], var2[10]), new WorldPoint(var2[366], var2[70], var2[10]), var2[10]), var1[var2[367]], var1[var2[368]]);
        cArray7[b.var2[32]] = new CHelper(new AHelper(new WorldPoint(var2[369], var2[94], var2[10]), new WorldPoint(var2[370], var2[54], var2[10]), var2[10]), var1[var2[371]], var1[var2[372]]);
        cArray7[b.var2[34]] = new CHelper(new AHelper(new WorldPoint(var2[370], var2[373], var2[1]), new WorldPoint(var2[344], var2[374], var2[1]), var2[1]), var1[var2[375]], var1[var2[376]]);
        cArray7[b.var2[35]] = new CHelper(new AHelper(new WorldPoint(var2[357], var2[343], var2[1]), new WorldPoint(var2[377], var2[378], var2[1]), var2[1]), var1[var2[379]], var1[var2[380]]);
        PRIFDDINAS = new GameEnum(var2[218], List.of(Integer.valueOf(var2[315]), Integer.valueOf(var2[316]), Integer.valueOf(var2[317]), Integer.valueOf(var2[318])), cArray7);
        c[] cArray8 = new c[var2[5]];
        cArray8[b.var2[1]] = new CHelper(new AHelper(new WorldPoint(var2[384], var2[385], var2[1]), new WorldPoint(var2[386], var2[387], var2[1]), var2[1]), var1[var2[388]], var1[var2[389]], new WorldPoint(var2[390], var2[391], var2[1]));
        cArray8[b.var2[0]] = new CHelper(new AHelper(new WorldPoint(var2[392], var2[393], var2[2]), new WorldPoint(var2[394], var2[395], var2[2]), var2[2]), var1[var2[396]], var1[var2[397]]);
        cArray8[b.var2[10]] = new CHelper(new AHelper(new WorldPoint(var2[394], var2[398], var2[2]), new WorldPoint(var2[399], var2[400], var2[2]), var2[2]), var1[var2[401]], var1[var2[402]]);
        cArray8[b.var2[2]] = new CHelper(new AHelper(new WorldPoint(var2[392], var2[403], var2[2]), new WorldPoint(var2[404], var2[405], var2[2]), var2[2]), var1[var2[406]], var1[var2[407]]);
        cArray8[b.var2[16]] = new CHelper(new AHelper(new WorldPoint(var2[408], var2[409], var2[2]), new WorldPoint(var2[410], var2[411], var2[2]), var2[2]), var1[var2[412]], var1[var2[413]]);
        cArray8[b.var2[17]] = new CHelper(new AHelper(new WorldPoint(var2[410], var2[414], var2[2]), new WorldPoint(var2[415], var2[416], var2[2]), var2[2]), var1[var2[417]], var1[var2[418]]);
        cArray8[b.var2[22]] = new CHelper(new AHelper(new WorldPoint(var2[419], var2[420], var2[2]), new WorldPoint(var2[421], var2[422], var2[2]), var2[2]), var1[var2[423]], var1[var2[424]]);
        RELLEKKA = new GameEnum(var2[232], List.of(Integer.valueOf(var2[382]), Integer.valueOf(var2[383])), cArray8);
        c[] cArray9 = new c[var2[5]];
        cArray9[b.var2[1]] = new CHelper(new AHelper(new WorldPoint(var2[427], var2[428], var2[1]), new WorldPoint(var2[429], var2[430], var2[1]), var2[1]), var1[var2[431]], var1[var2[432]], new WorldPoint(var2[433], var2[434], var2[1]));
        cArray9[b.var2[0]] = new CHelper(new AHelper(new WorldPoint(var2[435], var2[436], var2[2]), new WorldPoint(var2[437], var2[434], var2[2]), var2[2]), var1[var2[438]], var1[var2[439]]);
        cArray9[b.var2[10]] = new CHelper(new AHelper(new WorldPoint(var2[440], var2[441], var2[2]), new WorldPoint(var2[442], var2[443], var2[2]), var2[2]), var1[var2[444]], var1[var2[445]]);
        cArray9[b.var2[2]] = new CHelper(new AHelper(new WorldPoint(var2[446], var2[441], var2[2]), new WorldPoint(var2[447], var2[443], var2[2]), var2[2]), var1[var2[448]], var1[var2[449]]);
        cArray9[b.var2[16]] = new CHelper(new AHelper(new WorldPoint(var2[446], var2[450], var2[2]), new WorldPoint(var2[451], var2[452], var2[2]), var2[2]), var1[var2[453]], var1[var2[454]], new WorldPoint(var2[455], var2[456], var2[2]));
        cArray9[b.var2[17]] = new CHelper(new AHelper(new WorldPoint(var2[415], var2[436], var2[2]), new WorldPoint(var2[419], var2[457], var2[2]), var2[2]), var1[var2[458]], var1[var2[459]], new WorldPoint(var2[451], var2[460], var2[2]));
        cArray9[b.var2[22]] = new CHelper(new AHelper(new WorldPoint(var2[451], var2[460], var2[2]), new WorldPoint(var2[461], var2[462], var2[2]), var2[2]), var1[var2[463]], var1[var2[464]], new WorldPoint(var2[465], var2[462], var2[2]));
        ARDOUGNE = new GameEnum(var2[263], List.of(Integer.valueOf(var2[426])), cArray9);
        b[] bArray = new b[var2[28]];
        bArray[b.var2[1]] = DRAYNOR_VILLAGE;
        bArray[b.var2[0]] = VARROCK_ROOFTOP;
        bArray[b.var2[10]] = CANIFIS_ROOFTOP;
        bArray[b.var2[2]] = FALADOR;
        bArray[b.var2[16]] = SEERS_VILLAGE;
        bArray[b.var2[17]] = POLLNIVNEACH;
        bArray[b.var2[22]] = PRIFDDINAS;
        bArray[b.var2[5]] = RELLEKKA;
        bArray[b.var2[27]] = ARDOUGNE;
        $VALUES = bArray;
    }

    private static void var14() {
        var2 = new int[467];
        b.var2[0] = 1;
        b.var2[1] = (0x8B ^ 0x91 ^ (0x10 ^ 0x37)) & (0x1A ^ 0x44 ^ (0x4D ^ 0x2E) ^ -1);
        b.var2[2] = 3;
        b.var2[3] = -(0xFFFFFD65 & 0xFDF) & (0xFFFFFD77 & 0x3FFF);
        b.var2[4] = 0xFFFFB17E & 0x7EB3;
        b.var2[5] = 0xD0 ^ 0x99 ^ (0x37 ^ 0x79);
        b.var2[6] = -(0xFFFFECAB & 0x335E) & (0xFFFFFBFD & 0x2FFF);
        b.var2[7] = 0xFFFFCEF9 & 0x3DD7;
        b.var2[8] = -(0xFFFFD9F2 & 0x375F) & (0xFFFFFF7F & 0x1DF7);
        b.var2[9] = 0xFFFFCEFF & 0x3D4B;
        b.var2[10] = 2;
        b.var2[11] = -(81 + 25 - 46 + 144) & (0xFFFFBCEF & 0x4FFB);
        b.var2[12] = -(0xFFFFBA29 & 0x47F7) & (0xFFFFBEFF & 0x4FEF);
        b.var2[13] = -(0xFFFF95FF & 0x7BC5) & (0xFFFFDFFD & 0x3DDF);
        b.var2[14] = 0xFFFFDE9E & 0x2D7F;
        b.var2[15] = -(0xFFFFF783 & 0x7A7F) & (0xFFFFFFFF & 0x7ECF);
        b.var2[16] = 0xFD ^ 0xBD ^ (0x17 ^ 0x53);
        b.var2[17] = 117 + 54 - 136 + 146 ^ 11 + 110 - 33 + 88;
        b.var2[18] = -(0xFFFFEF3F & 0x53EA) & (0xFFFFFFFB & 0x4F3D);
        b.var2[19] = -(0xFFFFC73F & 0x78E3) & (0xFFFFCEFE & 0x7DEF);
        b.var2[20] = -(0xFFFFF5DB & 0x5A6D) & (0xFFFFFF7F & 0x5CDB);
        b.var2[21] = -(0x45 ^ 0x64) & (0xFFFFDDEB & 0x2EFD);
        b.var2[22] = 0xB0 ^ 0xB6;
        b.var2[23] = 0xFFFFCF75 & 0x3C9B;
        b.var2[24] = -(0xFFFFB965 & 0x76BB) & (0xFFFFFCEB & 0x3FF7);
        b.var2[25] = -(0xFFFFBFCF & 0x62B1) & (0xFFFFAED6 & 0x7FBF);
        b.var2[26] = 0xFFFFCFFF & 0x3CC1;
        b.var2[27] = 0x53 ^ 0x39 ^ (0x5B ^ 0x39);
        b.var2[28] = 0x10 ^ 0x19;
        b.var2[29] = -(0xFFFFFDD9 & 0x1327) & (0xFFFFBDFD & 0x5FBF);
        b.var2[30] = 0xFFFFFFF9 & 0xCBF;
        b.var2[31] = 0x7E ^ 0x74;
        b.var2[32] = 0x2E ^ 0x3C ^ (0x23 ^ 0x3A);
        b.var2[33] = -(0xFFFFF35B & 0x7EED) & (0xFFFFFEFF & Short.MAX_VALUE);
        b.var2[34] = 0xAB ^ 0xA7;
        b.var2[35] = 0x6F ^ 0x62;
        b.var2[36] = -(0xFFFFE1EF & 0x1F77) & (0xFFFF8D7E & Short.MAX_VALUE);
        b.var2[37] = 0xFFFFEF7D & 0x1EA7;
        b.var2[38] = 0xFFFF9F7F & 0x6C9D;
        b.var2[39] = 0xFFFFFDBD & 0xEFA;
        b.var2[40] = 0x4D ^ 0x43;
        b.var2[41] = 0xAE ^ 0xA3 ^ 2;
        b.var2[42] = 0x40 ^ 0x21 ^ (0xF2 ^ 0x83);
        b.var2[43] = 0x14 ^ 0x24 ^ (0x94 ^ 0xBA);
        b.var2[44] = -(0xFFFFFDD7 & 0x4EAB) & (0xFFFFFEBF & 0x7FF7);
        b.var2[45] = -(0xFFFFF967 & 0x6799) & (0xFFFFEDF9 & 0x7FB7);
        b.var2[46] = 0xFFFFADCE & 0x5F71;
        b.var2[47] = 0xFFFFBDF6 & 0x4E7B;
        b.var2[48] = -(0xFFFFC3BB & 0x3ED5) & (0xFFFFEFF7 & 0x1FFF);
        b.var2[49] = 0x64 ^ 0xD ^ (0xE7 ^ 0x9F);
        b.var2[50] = 179 + 115 - 128 + 19 ^ 168 + 7 - 10 + 6;
        b.var2[51] = -(0xFFFFEA6B & 0x35DE) & (0xFFFFACFF & 0x7FDF);
        b.var2[52] = 0xFFFFAF7E & 0x5DD7;
        b.var2[53] = -(0xFFFFEAF7 & 0x7769) & (0xFFFFFFFB & 0x6EF7);
        b.var2[54] = -(0xFFFFA6DB & 0x5BA5) & (0xFFFFAFDB & 0x5FFF);
        b.var2[55] = 0xFFFFFC9F & 0xFEE;
        b.var2[56] = -(0xFFFFFE8F & 0x33FE) & (0xFFFFFFFF & 0x3FDF);
        b.var2[57] = 0x3D ^ 0x2E;
        b.var2[58] = 17 + 83 - -25 + 23 ^ 117 + 18 - 22 + 15;
        b.var2[59] = -(0xFFFFF26B & 0x7DB7) & (0xFFFFFFBF & 0x7CEA);
        b.var2[60] = 0xFFFFECDD & 0x1FA3;
        b.var2[61] = -(0xFFFFF1FF & 0x3E23) & (0xFFFFFF7B & 0x3DFF);
        b.var2[62] = 0x9D ^ 0x88;
        b.var2[63] = 0xFF ^ 0x91 ^ (0xCA ^ 0xB2);
        b.var2[64] = -(0xFFFFDF8B & 0x31F7) & (0xFFFFDDFF & 0x3FFF);
        b.var2[65] = -(0x2A ^ 0xD) & (0xFFFFDF7F & 0x2DFE);
        b.var2[66] = 0xFFFF8FFB & 0x7C7D;
        b.var2[67] = 0xB9 ^ 0xAE;
        b.var2[68] = 0xD5 ^ 0x8B ^ (0x5B ^ 0x1D);
        b.var2[69] = 0xFFFFEE7C & 0x1DFB;
        b.var2[70] = 0xFFFFAD6E & 0x5FDF;
        b.var2[71] = 0xFFFFEC7F & 0x1FFE;
        b.var2[72] = 0xFFFFCD6F & 0x3FDA;
        b.var2[73] = 0x26 ^ 0x3F;
        b.var2[74] = 0x34 ^ 0x2E;
        b.var2[75] = 0xFFFF8FEB & 0x7D5D;
        b.var2[76] = 0xFFFF8D6E & 0x7EFF;
        b.var2[77] = -(0xFFFFFF5B & 0x30E5) & (0xFFFFBFF6 & 0x7D7F);
        b.var2[78] = -(0xFFFFF7BA & 0x5AFF) & (0xFFFFDFFF & Short.MAX_VALUE);
        b.var2[79] = 0xBE ^ 0xA5;
        b.var2[80] = 0x8B ^ 0xBC ^ (0xA3 ^ 0x88);
        b.var2[81] = -(0xFFFFF565 & 0x3ADF) & (0xFFFFBEFD & 0x7DCF);
        b.var2[82] = -(0xFFFFD33D & 0x7CEB) & (0xFFFFDDEF & 0x7F7D);
        b.var2[83] = -(0xFFFFBFFF & 0x716D) & (0xFFFFFFFF & 0x3DFE);
        b.var2[84] = -(0xFFFFB2FF & 0x6F9D) & (0xFFFFEFFF & 0x3FDD);
        b.var2[85] = 0xFFFF9DE4 & 0x6EBB;
        b.var2[86] = 102 + 118 - 121 + 30 ^ 61 + 86 - 72 + 81;
        b.var2[87] = -(0xFFFFD2CF & 0x6F71) & (0xFFFFDFF5 & 0x6EEB);
        b.var2[88] = -(0xFFFFFD3D & 0x42CE) & (0xFFFFDEEF & 0x6DBF);
        b.var2[89] = -(0xFFFFFADD & 0x7733) & (0xFFFFFFDB & 0x7F7F);
        b.var2[90] = -(0xFFFFD37F & 0x6FC8) & (0xFFFFDFFF & 0x6FEF);
        b.var2[91] = 0xFFFFAFF1 & 0x5D5E;
        b.var2[92] = 163 + 215 - 266 + 105 ^ 144 + 150 - 215 + 119;
        b.var2[93] = 155 + 116 - 119 + 24 ^ 100 + 52 - 136 + 128;
        b.var2[94] = -(0xFFFFD7BB & 0x68C5) & (0xFFFFFDDF & 0x4FF7);
        b.var2[95] = 0x88 ^ 0xA9;
        b.var2[96] = 0x68 ^ 0x4A;
        b.var2[97] = 0x55 ^ 0x76;
        b.var2[98] = 0x89 ^ 0xA1;
        b.var2[99] = -(0xFFFFBFBA & 0x48C7) & (0xFFFFFEF7 & 0x3FBF);
        b.var2[100] = 0xFFFFFDA9 & 0xFDF;
        b.var2[101] = -(0xFFFFF57F & 0x7AD2) & (0xFFFFFFDF & 0x7DFF);
        b.var2[102] = 0xFFFF9DF2 & 0x6FCF;
        b.var2[103] = 0xFFFFCFBF & 0x3DFE;
        b.var2[104] = (3 ^ 0x44) & ~(0xF7 ^ 0xB0) ^ (0x5F ^ 0x7B);
        b.var2[105] = 0x8F ^ 0xAA;
        b.var2[106] = 0xFFFFDDBE & 0x2FF5;
        b.var2[107] = -(0xFFFFF7DF & 0x3A77) & (0xFFFFFFF7 & 0x3FFE);
        b.var2[108] = 0xFFFF8DEE & 0x7FBF;
        b.var2[109] = -(0xFFFFDE8D & 0x737F) & (0xFFFFDFEF & 0x7FBF);
        b.var2[110] = 0xFFFFBDF7 & 0x4FBF;
        b.var2[111] = -(0xFFFFC55F & 0x7AF5) & (0xFFFFCDFE & Short.MAX_VALUE);
        b.var2[112] = 46 + 36 - -24 + 42 ^ 55 + 126 - 100 + 97;
        b.var2[113] = 4 ^ 0x23;
        b.var2[114] = -(0xFFFFAACF & 0x7775) & (0xFFFFEFFF & 0x3FF5);
        b.var2[115] = 0xFFFF8FEF & 0x7DB8;
        b.var2[116] = -(0xFFFFF251 & Short.MAX_VALUE) & (0xFFFFFFFF & Short.MAX_VALUE);
        b.var2[117] = 0xFFFFFFBA & 0xDF5;
        b.var2[118] = -(0xFFFFBEA9 & 0x535F) & (0xFFFFFFFF & 0x1FBB);
        b.var2[119] = 0x16 ^ 0x3F;
        b.var2[120] = -(0xFFFFFEE7 & 0x617B) & (0xFFFFFDFF & 0x6FFF);
        b.var2[121] = -(0xFFFFF67D & 0x5B93) & (0xFFFFFFFF & 0x5FB5);
        b.var2[122] = 0x9F ^ 0xB5;
        b.var2[123] = 0x8C ^ 0xA7;
        b.var2[124] = 0xFFFFADBF & 0x5FEB;
        b.var2[125] = -(0x11 ^ 0x50) & (0xFFFFADF7 & 0x5FDA);
        b.var2[126] = -(0xFFFFBAB7 & 0x654F) & (0xFFFFFDDE & 0x2FBF);
        b.var2[127] = -(0xFFFFE7D7 & 0x7A69) & (0xFFFFEFEF & 0x7FFC);
        b.var2[128] = 0x20 ^ 0xC;
        b.var2[129] = 0x25 ^ 0x67 ^ (0xC2 ^ 0xAD);
        b.var2[130] = 0xFFFF8FBE & 0x7DD7;
        b.var2[131] = -(0xFFFFF7FF & 0x1A6B) & (0xFFFF9FFE & Short.MAX_VALUE);
        b.var2[132] = -(0xFFFFF276 & 0x4FEB) & (0xFFFFCFFD & Short.MAX_VALUE);
        b.var2[133] = 0xFFFFDF9F & 0x2DFF;
        b.var2[134] = 0x44 ^ 0x6A;
        b.var2[135] = 0x29 ^ 0x42 ^ (0xF0 ^ 0xB4);
        b.var2[136] = -(0xFFFFE6EB & 0x5B56) & (0xFFFFEFDF & 0x5FFF);
        b.var2[137] = -(0xFFFFD7F1 & 0x2A2F) & (0xFFFFBFFC & 0x4FAF);
        b.var2[138] = -(0xFFFFE969 & 0x76D7) & (0xFFFFFFFF & 0x6DD7);
        b.var2[139] = 0xBE ^ 0x8E;
        b.var2[140] = 0xD1 ^ 0x82 ^ (0x37 ^ 0x55);
        b.var2[141] = -(0xFFFFC26B & 0x3FDD) & (0xFFFFCFFD & 0x3FFF);
        b.var2[142] = -(0x5F ^ 0x1B) & (0xFFFF9DFF & 0x6FFF);
        b.var2[143] = -(0xFFFFF56F & 0x7AB5) & (0xFFFFFFFF & 0x7DBF);
        b.var2[144] = 0xF4 ^ 0xC6;
        b.var2[145] = 0x15 ^ 0x50 ^ (0x50 ^ 0x26);
        b.var2[146] = -(0xFFFFEADB & 0x172E) & (0xFFFFCFBF & 0x3FFF);
        b.var2[147] = 38 + 2 - -87 + 0 ^ (0xD ^ 0x46);
        b.var2[148] = 0xFFFFEFBC & 0x3F77;
        b.var2[149] = -(0xFFFFD905 & 0x76FF) & (0xFFFFDFFF & 0x7BBF);
        b.var2[150] = 0xFFFFDDEB & 0x2F37;
        b.var2[151] = -(0xFFFFEF85 & 0x347F) & (0xFFFFEFFF & 0x3FF7);
        b.var2[152] = 0xFFFFDF98 & 0x2D67;
        b.var2[153] = 0x52 ^ 0x41 ^ (0x8E ^ 0xA8);
        b.var2[154] = 130 + 62 - 187 + 171 ^ 38 + 122 - 105 + 79;
        b.var2[155] = 0xFFFFAFFF & 0x5BDB;
        b.var2[156] = 0xFFFFDF6F & 0x2D9C;
        b.var2[157] = 0xFFFF8BFD & 0x7FDE;
        b.var2[158] = 0xFFFF8FDF & 0x7D2F;
        b.var2[159] = 0xFFFFCFE9 & 0x3BF6;
        b.var2[160] = -(0xFFFFE37E & 0x3EC3) & (0xFFFFEFDF & 0x3F6F);
        b.var2[161] = 0x11 ^ 0x55 ^ (0x2D ^ 0x5E);
        b.var2[162] = 87 + 44 - 71 + 70 ^ 178 + 35 - 198 + 171;
        b.var2[163] = -(0xFFFFB395 & 0x5C7B) & (0xFFFF9BF5 & Short.MAX_VALUE);
        b.var2[164] = 0xFFFFCF97 & 0x3D7D;
        b.var2[165] = 0xFFFFBBFB & 0x4FEF;
        b.var2[166] = 0xFFFFEFFD & 0x1D0F;
        b.var2[167] = 0x3C ^ 5;
        b.var2[168] = 2 ^ 0x1D ^ (0x47 ^ 0x62);
        b.var2[169] = 0xFFFFBBEA & 0x4FFF;
        b.var2[170] = -(0xFFFFFEED & 0x43FB) & (0xFFFFFFFF & 0x4FFE);
        b.var2[171] = -(0xFFFFDC96 & 0x677B) & (0xFFFFFFF9 & 0x4FFF);
        b.var2[172] = 0xFFFFAFBF & 0x5D5E;
        b.var2[173] = -(0xFFFFF753 & 0x7AED) & (0xFFFFFFFF & 0x7F5D);
        b.var2[174] = 132 + 126 - 177 + 56 ^ 85 + 147 - 134 + 80;
        b.var2[175] = 129 + 142 - 172 + 44 ^ 26 + 83 - -39 + 31;
        b.var2[176] = -(0xFFFF9AE5 & 0x77FB) & (0xFFFFBFFF & 0x5FFF);
        b.var2[177] = 0xFFFF9D6F & 0x6FB7;
        b.var2[178] = -(0xFFFFBFD7 & 0x727F) & (0xFFFFFF7F & 0x3FF7);
        b.var2[179] = 0x7F ^ 0x42;
        b.var2[180] = 33 + 104 - -4 + 32 ^ 42 + 59 - 25 + 71;
        b.var2[181] = 0xFFFFFBEF & 0xFF4;
        b.var2[182] = 0xFFFFAFFB & 0x5BDE;
        b.var2[183] = 0xFFFF8F2F & 0x7DF4;
        b.var2[184] = -(0xFFFFE8DF & 0x572B) & (0xFFFFCBFB & 0x7FEF);
        b.var2[185] = 0x59 ^ 0x66;
        b.var2[186] = 0x54 ^ 0x14;
        b.var2[187] = 0xFFFFBFDA & 0x4BF7;
        b.var2[188] = 0xFFFFDF9E & 0x2D7B;
        b.var2[189] = -(0xFFFFFEEB & 0x313D) & (0xFFFFBBFF & 0x7FFD);
        b.var2[190] = 0xFFFFDDFB & 0x2F1C;
        b.var2[191] = 0x29 ^ 0x77 ^ (0x88 ^ 0x97);
        b.var2[192] = 0x21 ^ 0x18 ^ (0x28 ^ 0x53);
        b.var2[193] = -(0xFFFF9AED & 0x7777) & (0xFFFFFF7F & 0x1FFD);
        b.var2[194] = 0xFFFFFBFB & 0xFC5;
        b.var2[195] = -(0xFFFFDFB5 & 0x707B) & (0xFFFFDBFF & 0x7FFD);
        b.var2[196] = 0x52 ^ 0x5C ^ (0x3C ^ 0x71);
        b.var2[197] = 0x4A ^ 0x22 ^ (0x36 ^ 0x1A);
        b.var2[198] = -(0xFFFFD1FD & 0x3E27) & (0xFFFFBBEC & 0x5FFF);
        b.var2[199] = -(0xFFFFDBE7 & 0x6439) & (0xFFFFFBEE & 0x4FFF);
        b.var2[200] = 0x25 ^ 0x60;
        b.var2[201] = 52 + 43 - -32 + 77 ^ 63 + 113 - 173 + 135;
        b.var2[202] = -(0x78 ^ 0x51) & (0xFFFFAFFF & 0x5BEF);
        b.var2[203] = 0xFFFFADDD & 0x5F33;
        b.var2[204] = 0xFFFFBBF7 & 0x4FCB;
        b.var2[205] = -(0xFFFFF7EF & 0x7AD6) & (0xFFFFFFD7 & Short.MAX_VALUE);
        b.var2[206] = -(0xFFFFF539 & 0x5AF7) & (0xFFFFDFFF & 0x7BF6);
        b.var2[207] = 0xFFFFBF93 & 0x4D7C;
        b.var2[208] = 30 + 158 - -53 + 12 ^ 157 + 18 - 33 + 44;
        b.var2[209] = 100 + 154 - 160 + 111 ^ 117 + 7 - 69 + 78;
        b.var2[210] = -(0xFFFFB7BB & 0x5C65) & (0xFFFFBFFF & 0x5FE5);
        b.var2[211] = -(0xFFFFDEBD & 0x71D3) & (0xFFFFDFF7 & 0x7D9F);
        b.var2[212] = 0x60 ^ 0x29;
        b.var2[213] = 0xD9 ^ 0x93;
        b.var2[214] = -(0x10 ^ 0x14) & (0xFFFFDFE7 & 0x2BDF);
        b.var2[215] = 0xFFFF8F4F & 0x7DB6;
        b.var2[216] = -(0xFFFFF7BB & 0x4C67) & (0xFFFFFFEB & 0x4FFF);
        b.var2[217] = -(0xFFFF8765 & 0x7ABF) & (0xFFFF9F67 & 0x6FBF);
        b.var2[218] = 0x79 ^ 0x32;
        b.var2[219] = 0x36 ^ 0x7A;
        b.var2[220] = 0xFFFFAFEB & 0x5BDE;
        b.var2[221] = 0xFFFF8D1C & 0x7FE7;
        b.var2[222] = -(0xFFFFB3AF & 0x7C51) & (0xFFFFBBFB & 0x7FCF);
        b.var2[223] = -(0xFFFFF7E7 & 0x2C39) & (0xFFFFBFF8 & 0x6FF7);
        b.var2[224] = 7 + 0 - -77 + 119 ^ 79 + 45 - 38 + 48;
        b.var2[225] = 42 + 77 - 18 + 35 ^ 9 + 2 - -163 + 24;
        b.var2[226] = -(0xFFFFFD75 & 0x568B) & (0xFFFFFFD9 & 0x5FF7);
        b.var2[227] = 0xE0 ^ 0xAF;
        b.var2[228] = 0xFFFFFF37 & 0x2AFE;
        b.var2[229] = 0xFFFFEEFF & 0x1B7A;
        b.var2[230] = 0xFFFFABEF & 0x5EB8;
        b.var2[231] = 0xFFFFBFFB & 0x4D7F;
        b.var2[232] = 15 + 66 - 43 + 106 ^ 42 + 86 - 32 + 96;
        b.var2[233] = 0x50 ^ 1;
        b.var2[234] = -(0xFFFFC1D3 & 0x7F7F) & (0xFFFFCFFF & 0x7BFB);
        b.var2[235] = -(2 ^ 0x55) & (0xFFFFDBF7 & 0x2EFF);
        b.var2[236] = 0xFFFFEDFF & 0x1FA9;
        b.var2[237] = -(0xFFFFF5D7 & 0x2F7E) & (0xFFFFAFFF & Short.MAX_VALUE);
        b.var2[238] = 0xFFFFCFEE & 0x3DB3;
        b.var2[239] = 0x8C ^ 0x80 ^ (0x1D ^ 0x43);
        b.var2[240] = 0xFE ^ 0xAD;
        b.var2[241] = 0xFFFF8EE8 & 0x7BB7;
        b.var2[242] = 0xFFFFFFB5 & 0xDEE;
        b.var2[243] = 0xFFFFAA97 & 0x5FF9;
        b.var2[244] = -(0x33 ^ 0x6A) & (0xFFFFEDFF & 0x1FFF);
        b.var2[245] = 0xFFFF8EBD & 0x7BDB;
        b.var2[246] = 0x6F ^ 0x3B;
        b.var2[247] = 0xC3 ^ 0x96;
        b.var2[248] = -(0xFFFF87FF & 0x7C29) & (0xFFFF9FFF & 0x6EBE);
        b.var2[249] = -(0xFFFFF7FF & 0x7A5F) & (0xFFFFFFFF & Short.MAX_VALUE);
        b.var2[250] = -(0xFFFFE86F & 0x77D7) & (0xFFFFFFDF & 0x6DFF);
        b.var2[251] = -(0xFFFFEFAF & 0x7575) & (0xFFFFFFBF & 0x6FFF);
        b.var2[252] = 0xFFFF9FBD & 0x6DD7;
        b.var2[253] = 0x77 ^ 0x3E ^ (5 ^ 0x1A);
        b.var2[254] = 0x3A ^ 0x5D ^ (0x63 ^ 0x53);
        b.var2[255] = 0xFFFFCBFD & 0x3E8E;
        b.var2[256] = -(0xFFFFE7FF & 0x5A69) & (0xFFFFEFFF & 0x5FFB);
        b.var2[257] = 0xEF ^ 0xA5 ^ (9 ^ 0x1B);
        b.var2[258] = 0x52 ^ 0xB;
        b.var2[259] = -(0xFFFFF65F & 0x7BF3) & (0xFFFFFFDF & Short.MAX_VALUE);
        b.var2[260] = -(0xFFFFF567 & 0x1FF9) & (0xFFFF9FFF & 0x7FEA);
        b.var2[261] = 0xFFFFDFDE & 0x2AAF;
        b.var2[262] = 0xFFFFDDDD & 0x2FA6;
        b.var2[263] = 0x32 ^ 0x68;
        b.var2[264] = 0x3C ^ 0x3B ^ (0x33 ^ 0x6F);
        b.var2[265] = -(0xFFFFFF73 & 0x31DD) & (0xFFFFFFFF & 0x3BDF);
        b.var2[266] = 0xFFFFBF8D & 0x4DF7;
        b.var2[267] = 0x33 ^ 0x3F ^ (0xC2 ^ 0x92);
        b.var2[268] = 0xFFFFB6EF & 0x7D3E;
        b.var2[269] = -(0xFFFFB3F7 & 0x6E8D) & (0xFFFFBFEC & 0x6FDF);
        b.var2[270] = -(0xFFFFECF7 & 0x17AB) & (0xFFFFAFFF & 0x5FF6);
        b.var2[271] = 0xA ^ 0x7E ^ (0x3F ^ 0x16);
        b.var2[272] = 0x9E ^ 0xC0;
        b.var2[273] = -(0xFFFFB9EB & 0x66F5) & (0xFFFFADF7 & Short.MAX_VALUE);
        b.var2[274] = 0xFFFF9BB6 & 0x6FDB;
        b.var2[275] = 0xFFFFCBD9 & 0x3FB7;
        b.var2[276] = -(0xFFFFF7F7 & 0x4C6E) & (0xFFFFFFFD & 0x4FFF);
        b.var2[277] = 177 + 144 - 263 + 182 ^ 2 + 71 - -18 + 84;
        b.var2[278] = 39 + 196 - 128 + 122 ^ 38 + 66 - 34 + 63;
        b.var2[279] = -(0xFFFFF6D9 & 0x4D67) & (0xFFFFFFFD & 0x4FDF);
        b.var2[280] = 0xFFFF8DFB & 0x7F1F;
        b.var2[281] = -(0xFFFFF876 & 0x77DD) & (0xFFFFFFFB & 0x7BF7);
        b.var2[282] = 0x7B ^ 0x1A;
        b.var2[283] = 0x3C ^ 0x2C ^ (0x16 ^ 0x64);
        b.var2[284] = -(0xFFFFF6BF & 0x4BE0) & (0xFFFFDFBF & 0x6FFF);
        b.var2[285] = -(0xFFFFFCAF & 0x1753) & (0xFFFF9FAB & 0x7FF7);
        b.var2[286] = -(0xFFFFFAFF & 0x755A) & (0xFFFFFD7F & 0x7FFB);
        b.var2[287] = 0xFFFF8BAF & 0x7FF3;
        b.var2[288] = 0x3C ^ 0xB ^ (0x4F ^ 0x1B);
        b.var2[289] = 0x1A ^ 0xC ^ (9 ^ 0x7B);
        b.var2[290] = 0xFFFFCF66 & 0x3DBF;
        b.var2[291] = 0xFFFFCD29 & 0x3FFF;
        b.var2[292] = -(0xFFFFE6E6 & 0x1D1B) & (0xFFFF9FFF & 0x6F9F);
        b.var2[293] = 76 + 84 - 98 + 176 ^ 27 + 20 - 41 + 133;
        b.var2[294] = 0x71 ^ 0x3D ^ (0x6A ^ 0x40);
        b.var2[295] = 0xFFFF9BBE & 0x6FE7;
        b.var2[296] = -(0xFFFFFE8B & 0x3375) & (0xFFFFBFFD & 0x7F27);
        b.var2[297] = 0xFFFFBBFE & 0x4FAB;
        b.var2[298] = 0xF6 ^ 0x91;
        b.var2[299] = 62 + 196 - 34 + 2 ^ 74 + 9 - 73 + 128;
        b.var2[300] = 0xFFFFCFA9 & 0x3BFF;
        b.var2[301] = 0xFFFFFBF5 & 0xFAF;
        b.var2[302] = 0x76 ^ 0x10 ^ (0x17 ^ 0x18);
        b.var2[303] = 0x19 ^ 0x3B ^ (0xCE ^ 0x86);
        b.var2[304] = 0xFFFFBFBF & 0x4BF3;
        b.var2[305] = 0xFFFFBFAF & 0x4D7A;
        b.var2[306] = -(0xFFFF9D2A & 0x72D7) & (0xFFFFDBEF & 0x3FBF);
        b.var2[307] = 224 + 53 - 143 + 120 ^ 26 + 85 - -20 + 18;
        b.var2[308] = 66 + 195 - 81 + 17 ^ 91 + 161 - 202 + 119;
        b.var2[309] = -(0xFFFFBD7B & 0x72A7) & (0xFFFFBD3E & Short.MAX_VALUE);
        b.var2[310] = 0xFFFFFBBD & 0xFFA;
        b.var2[311] = -(0xFFFFBCA7 & 0x7759) & (0xFFFFBFBC & Short.MAX_VALUE);
        b.var2[312] = 0x36 ^ 0x5B;
        b.var2[313] = 0xD2 ^ 0x9D ^ (0x8E ^ 0xAF);
        b.var2[314] = 0x34 ^ 0x5B;
        b.var2[315] = -(0xFFFFCC8B & 0x37F5) & (0xFFFFB6FF & 0x7FDF);
        b.var2[316] = 0xFFFFBBDF & 0x777F;
        b.var2[317] = 0xFFFFFAFE & 0x375F;
        b.var2[318] = 0xFFFFF3FF & 0x3F5E;
        b.var2[319] = -(0xFFFFDF6B & 0x7397) & (0xFFFFFFFF & 0x5FB7);
        b.var2[320] = -(0xFFFFFBFF & 0x2403) & (0xFFFFB7DF & Short.MAX_VALUE);
        b.var2[321] = 43 + 191 - 73 + 76 ^ 142 + 100 - 102 + 17;
        b.var2[322] = 16 + 63 - -132 + 5 ^ 17 + 88 - 21 + 85;
        b.var2[323] = -(0xFFFFF7DE & 0x7B33) & (0xFFFFFFF7 & 0x7FDD);
        b.var2[324] = 0xFFFFBFFF & 0x57E4;
        b.var2[325] = -(0xFFFFDB0D & 0x67FB) & (0xFFFFCFFE & 0x7FCF);
        b.var2[326] = 0xFFFF97FD & 0x7FE7;
        b.var2[327] = 0xE8 ^ 0x9A;
        b.var2[328] = 51 + 13 - -104 + 74 ^ 71 + 105 - 94 + 47;
        b.var2[329] = -(0x9C ^ 0xBD) & (0xFFFFB7F6 & 0x5FFF);
        b.var2[330] = 0xFFFFB7EA & 0x5FF5;
        b.var2[331] = 81 + 49 - 11 + 116 ^ 21 + 153 - 104 + 89;
        b.var2[332] = 0xDD ^ 0xA8;
        b.var2[333] = 0xFFFF9FEA & 0x6CDD;
        b.var2[334] = -(0xFFFFE4FF & 0x3B27) & (0xFFFFF7FF & 0x3FFF);
        b.var2[335] = 0xFFFFBDEB & 0x4EDF;
        b.var2[336] = 0xCD ^ 0xBB;
        b.var2[337] = 0x6F ^ 0x48 ^ (0x34 ^ 0x64);
        b.var2[338] = -(0xFFFFFF1B & 0x70FF) & (0xFFFFFDFF & 0x7EDF);
        b.var2[339] = 0xFFFFBFE3 & 0x57FF;
        b.var2[340] = 0xFF ^ 0x87;
        b.var2[341] = 3 ^ 6 ^ (0x4A ^ 0x36);
        b.var2[342] = -(0xFFFFFB3F & 0x66C1) & (0xFFFFEBDD & 0x7EFF);
        b.var2[343] = 0xFFFFDD7F & 0x2FBD;
        b.var2[344] = 0xFFFFE8ED & 0x1FF3;
        b.var2[345] = -(0xFFFFCB6D & 0x76BF) & (0xFFFFFFEE & 0x4F7F);
        b.var2[346] = 0xBF ^ 0xC5;
        b.var2[347] = 116 + 101 - 203 + 178 ^ 108 + 64 - 87 + 102;
        b.var2[348] = -(0xFFFFFFEF & 0x4611) & (0xFFFFEEDB & 0x5FFD);
        b.var2[349] = 0xC3 ^ 0xBF;
        b.var2[350] = 0x5A ^ 0x27;
        b.var2[351] = -(0xFFFFB2BE & 0x6F53) & (0xFFFFEEFF & 0x3BDF);
        b.var2[352] = 0xFFFF9F3A & 0x6DFF;
        b.var2[353] = -(0xFFFFDBFF & 0x2723) & (0xFFFF8FF7 & 0x7BFB);
        b.var2[354] = -(0xFFFFFED5 & 0x516B) & (0xFFFFFFFE & 0x5D7F);
        b.var2[355] = 123 + 50 - 82 + 95 ^ 153 + 161 - 310 + 192;
        b.var2[356] = (0x8B ^ 0x85) + (0x1C ^ 0x25) - -(0x77 ^ 0x50) + (0x76 ^ 0x67);
        b.var2[357] = 0xFFFFC8FF & 0x3FC3;
        b.var2[358] = 0xFFFFC8F7 & 0x3FCF;
        b.var2[359] = (0x46 ^ 0x2B) + (1 ^ 0xA) - (0x84 ^ 0x93) + (0xDC ^ 0xC3);
        b.var2[360] = (0xB ^ 0x36) + (0x30 ^ 0x6D) - (0x79 ^ 8) + (0xF ^ 0x57);
        b.var2[361] = -(0xFFFF962D & 0x6DDB) & (0xFFFF8DED & 0x7EDE);
        b.var2[362] = 0xFFFFEF5F & 0x1DF1;
        b.var2[363] = (0x2D ^ 0x51) + 2 - -3 + 1;
        b.var2[364] = (0xB5 ^ 0xC6) + (0xEB ^ 0x8D) - (153 + 95 - 235 + 163) + (0x6A ^ 0x30);
        b.var2[365] = -(0xFFFF96CD & 0x79B3) & (0xFFFFDDFF & 0x3FCD);
        b.var2[366] = -(0xFFFFD55B & 0x7FAC) & (0xFFFFFFFF & 0x5DCF);
        b.var2[367] = 89 + 94 - 112 + 61;
        b.var2[368] = 1 + (0xE1 ^ 0x82) - -(0 ^ 0x11) + (0x83 ^ 0x93);
        b.var2[369] = -(0xFFFFEA7B & 0x5795) & (0xFFFFFED9 & 0x4BFF);
        b.var2[370] = -(0xFFFFBF67 & 0x679B) & (0xFFFFEFCF & 0x3FFF);
        b.var2[371] = (0xA5 ^ 0xA2) + (0x22 ^ 3) - -(0xD0 ^ 0x83) + (0xB3 ^ 0xB8);
        b.var2[372] = (0x1F ^ 0x32) + (0x74 ^ 0x19) - (0x5E ^ 0x3C) + (0x5B ^ 0x14);
        b.var2[373] = 0xFFFF8F5E & 0x7DFF;
        b.var2[374] = -(0xFFFFE2E7 & 0x3F9F) & (0xFFFFEFF6 & 0x3FFF);
        b.var2[375] = (0xF8 ^ 0x8C) + (0x39 ^ 0x34) - -1 + (0xBB ^ 0xBD);
        b.var2[376] = (0xDE ^ 0xA0) + (0x2F ^ 0x77) - (0xEF ^ 0xB7) + (0x86 ^ 0x8D);
        b.var2[377] = 0xFFFFFAEF & 0xDDF;
        b.var2[378] = 0xFFFF8FFE & 0x7D45;
        b.var2[379] = 137 + 88 - 147 + 60;
        b.var2[380] = 65 + 22 - 77 + 129;
        b.var2[381] = (0x2E ^ 0xA) + (51 + 96 - 128 + 118) - (0x1D ^ 0x22) + (8 ^ 0x16);
        b.var2[382] = -(0xFFFFFBC3 & 0x7BD) & (0xFFFFBFFF & 0x6BB9);
        b.var2[383] = 0xFFFFB93D & 0x6FFB;
        b.var2[384] = 0xFFFFEF7F & 0x1AF3;
        b.var2[385] = -(0xFFFFF913 & 0x77ED) & (0xFFFFFFBF & 0x7F7F);
        b.var2[386] = 0xFFFF8F7C & 0x7ABF;
        b.var2[387] = -(0xFFFFBFFF & 0x500D) & (0xFFFFBFFD & 0x5E6F);
        b.var2[388] = 68 + 16 - 33 + 90;
        b.var2[389] = 59 + 40 - 55 + 98;
        b.var2[390] = 0xFFFFCEC9 & 0x3B77;
        b.var2[391] = 0xFFFFFFDE & 0xE7F;
        b.var2[392] = 0xFFFFFBF7 & 0xE4A;
        b.var2[393] = 0xFFFFCF5D & 0x3EFE;
        b.var2[394] = 0xFFFFCF7F & 0x3ABE;
        b.var2[395] = 0xFFFF8E5B & 0x7FFC;
        b.var2[396] = (0x50 ^ 0x74) + (0x18 ^ 0x2D) - (0xBF ^ 0xB1) + (0x56 ^ 0x12);
        b.var2[397] = (0x12 ^ 0x6E) + (0x21 ^ 0x11) - (148 + 69 - 112 + 64) + (49 + 106 - 96 + 82);
        b.var2[398] = -(0x2C ^ 0x25) & (0xFFFFBE7C & 0x4FDF);
        b.var2[399] = -(0xFFFF95C1 & 0x7A7F) & (0xFFFFFE77 & 0x1BFF);
        b.var2[400] = 0xFFFFDE4E & 0x2FFB;
        b.var2[401] = (0x3A ^ 0x16) + (0x86 ^ 0xBD) - (0x28 ^ 0x15) + (0x21 ^ 0x46);
        b.var2[402] = 33 + 63 - 41 + 91;
        b.var2[403] = 0xFFFFDE67 & 0x2FDB;
        b.var2[404] = 0xFFFFEED5 & 0x1B6F;
        b.var2[405] = -(0xFFFFF7FD & 0x181B) & (0xFFFFFEDF & 0x1F7F);
        b.var2[406] = (0x7F ^ 0x54) + (93 + 93 - 165 + 125) - (0xE9 ^ 0x95) + (0x64 ^ 0x36);
        b.var2[407] = (0x64 ^ 0x20) + (106 + 81 - 115 + 58) - (77 + 72 - 101 + 119) + (0xE1 ^ 0x94);
        b.var2[408] = 0xFFFFEE5F & 0x1BEF;
        b.var2[409] = 0xFFFFFE65 & 0xFDF;
        b.var2[410] = -(0xFFFFF5FF & 0x7F29) & (0xFFFFFFFB & 0x7F7F);
        b.var2[411] = 0xFFFF8ED5 & 0x7F6B;
        b.var2[412] = (0x59 ^ 0x76) + (0x39 ^ 0x6A) - (0x9B ^ 0x9F) + (0x84 ^ 0x93);
        b.var2[413] = (0x24 ^ 0x59) + (134 + 18 - 71 + 62) - (41 + 1 - -23 + 107) + (0x41 ^ 0x77);
        b.var2[414] = 0xFFFFFFC9 & 0xE7F;
        b.var2[415] = -(0xFFFFACE2 & 0x733F) & (0xFFFFAE7F & 0x7BFB);
        b.var2[416] = 0xFFFFCEEF & 0x3F5E;
        b.var2[417] = (0x86 ^ 0xA0) + (0x6F ^ 1) - (0xD ^ 0x16) + (0xB3 ^ 0xAD);
        b.var2[418] = 128 + 122 - 173 + 75;
        b.var2[419] = 0xFFFF8A7F & 0x7FDF;
        b.var2[420] = -(0xFFFFDD0F & 0x32FD) & (0xFFFFFEDD & 0x1F7F);
        b.var2[421] = -(0xFFFFFFFB & 0x7595) & (0xFFFFFFF7 & Short.MAX_VALUE);
        b.var2[422] = 0xFFFFDE65 & 0x2FFF;
        b.var2[423] = 11 + 89 - 62 + 115;
        b.var2[424] = 18 + 131 - 11 + 16;
        b.var2[425] = 80 + 20 - -3 + 52;
        b.var2[426] = -(0xFFFFC6CF & 0x7FB9) & (0xFFFFEFBB & Short.MAX_VALUE);
        b.var2[427] = 0xFFFFABD7 & 0x5E7F;
        b.var2[428] = -(0xFFFFCA47 & 0x77B9) & (0xFFFFEFFF & 0x5EFF);
        b.var2[429] = 0xFFFFDF77 & 0x2AFF;
        b.var2[430] = 0xFFFFEFFF & 0x1CD6;
        b.var2[431] = (0x4C ^ 0x10) + (0x87 ^ 0xC6) - (0x44 ^ 0x63) + (1 ^ 0x27);
        b.var2[432] = 90 + 71 - 31 + 27;
        b.var2[433] = 0xFFFFFF7B & 0xAF5;
        b.var2[434] = 0xFFFFCEE1 & 0x3DFF;
        b.var2[435] = -(0xFFFFF7DB & 0x9B5) & (0xFFFFDFFE & 0x2BFF);
        b.var2[436] = -(0xFFFFF3FE & 0x7D13) & (0xFFFFFDFF & Short.MAX_VALUE);
        b.var2[437] = -(0xFFFFFD3E & 0x32C9) & (0xFFFFFBF7 & 0x3E7F);
        b.var2[438] = (0x2F ^ 9) + (0x64 ^ 0x49) - -(0x68 ^ 0x2F) + (0x4B ^ 0x4F);
        b.var2[439] = 88 + 51 - 116 + 136;
        b.var2[440] = 0xFFFFEF74 & 0x1AEF;
        b.var2[441] = 0xFFFFEFFB & 0x1CFC;
        b.var2[442] = -(0xFFFFA5B7 & 0x5FCD) & (0xFFFFDFFF & 0x2FEE);
        b.var2[443] = -(0xFFFFE68B & 0x7B7F) & (0xFFFFFFFF & 0x6EFE);
        b.var2[444] = (0x5A ^ 0xD) + (0x60 ^ 0x27) - (0x91 ^ 0x80) + (0xA4 ^ 0xB7);
        b.var2[445] = 125 + 90 - 87 + 33;
        b.var2[446] = -(0xFFFFDFED & 0x75B3) & (0xFFFFDFFC & Short.MAX_VALUE);
        b.var2[447] = 0xFFFFCA7B & 0x3FE5;
        b.var2[448] = 128 + 101 - 177 + 110;
        b.var2[449] = (0xF8 ^ 0x8C) + (0x38 ^ 0x57) - (0x7F ^ 0x3C) + 3;
        b.var2[450] = -(0xFFFFA269 & 0x7F97) & (0xFFFFBEFB & 0x6FF7);
        b.var2[451] = 0xFFFFFEDE & 0xB7F;
        b.var2[452] = -(0xFFFFFFBB & 0x7055) & (0xFFFFFCFD & Short.MAX_VALUE);
        b.var2[453] = (0x21 ^ 0x5C) + (0xF2 ^ 0xBE) - (0x76 ^ 0x4A) + (0xD4 ^ 0xC3);
        b.var2[454] = (0xA4 ^ 0x9B) + (0xA4 ^ 0xB9) - (0x85 ^ 0xA8) + (0xE1 ^ 0x97);
        b.var2[455] = 0xFFFFAF7F & 0x5ADD;
        b.var2[456] = 0xFFFFCDEE & 0x3EFD;
        b.var2[457] = -(0xFFFFC21B & 0x7DED) & (0xFFFFDDEB & 0x6EFF);
        b.var2[458] = (0x67 ^ 0x62) + (89 + 40 - 86 + 112) - (142 + 57 - 155 + 102) + (72 + 110 - 91 + 61);
        b.var2[459] = (0xD7 ^ 0xC5) + (0x94 ^ 0xB7) - -(0x59 ^ 0x3C) + (0x95 ^ 0x98);
        b.var2[460] = -(0xFFFFCDB7 & 0x724A) & (0xFFFFECE7 & 0x5FFD);
        b.var2[461] = 0xFFFFEF6F & 0x1AF2;
        b.var2[462] = -(0xFFFFFD1F & 0x73FD) & (0xFFFFFDFD & 0x7FFE);
        b.var2[463] = 132 + 83 - 64 + 17;
        b.var2[464] = (0xE6 ^ 0xC0) + (0x71 ^ 0x2A) - -(0x5C ^ 0x7D) + (0xB5 ^ 0xB2);
        b.var2[465] = 0xFFFFEF71 & 0x1AEE;
        b.var2[466] = (0xA1 ^ 0xAB) + (0x2F ^ 0x5D) - -(0x6D ^ 0x48) + (0x57 ^ 0x5E);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public c k() {
        void var15;
        void var16;
        Player player = Players.getLocal();
        c c2 = this.obstacles[var2[1]];
        c[] cArray = this.obstacles;
        int n = cArray.length;
        int var17 = var2[1];
        while (b.var8(var17, (int)var16)) {
            void var18;
            void var19 = var18[var17];
            if (b.var12(var19.m().a((Locatable)Players.getLocal()) ? 1 : 0)) {
                return var19;
            }
            ++var17;
            0;
            if (1 == 1) continue;
            return null;
        }
        if (b.var5(var15.getWorldLocation().getPlane(), var2[2])) {
            return null;
        }
        return c2;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static boolean var12(int n) {
        return n != 0;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static boolean var8(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public static b j() {
        b[] bArray = b.values();
        int var32 = bArray.length - var2[0];
        while (b.var33(var32)) {
            void var34;
            void var35 = var34[var32];
            if (b.var4(var35, (Object)CANIFIS_ROOFTOP) && b.var36(Quests.isFinished((Quest)Quest.PRIEST_IN_PERIL) ? 1 : 0)) {
                0;
                if (-1 >= 3) {
                    return null;
                }
            } else if (b.var13(Skills.getLevel((SkiSkill.AGILITY), var35.level)) {
                return var35;
            }
            --var32;
            0;
            if (3 <= 3) continue;
            return null;
        }
        Object[] objectArray = new Object[var2[0]];
        objectArray[b.var2[1]] = Skills.getLevel((SkiSkill.AGILITY);
        Log.info((String)var1[var2[1]], (Object[])objectArray);
        return DRAYNOR_VILLAGE;
    }

    private static boolean var33(int n) {
        return n >= 0;
    }

    private static String var37(String var38, String var39) {
        var38 = new String(Base64.getDecoder().decode(var38.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var40 = new StringBuilder();
        char[] var41 = var39.toCharArray();
        int var42 = var2[1];
        char[] var43 = var38.toCharArray();
        int var44 = var43.length;
        int var45 = var2[1];
        while (b.var8(var45, var44)) {
            char var46 = var43[var45];
            var40.append((char)(var46 ^ var41[var42 % var41.length]));
            0;
            ++var42;
            ++var45;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var40);
    }

    public c[] l() {
        return this.obstacles;
    }

    private static boolean var36(int n) {
        return n == 0;
    }
}

