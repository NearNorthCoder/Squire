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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static void lIIlIlIIlIlIlI() {
        lIlIllllIlI = new String[lIllIIIIIII[466]];
        b.lIlIllllIlI[b.lIllIIIIIII[1]] = "No course found for level {}, falling back on Draynor.";
        b.lIlIllllIlI[b.lIllIIIIIII[0]] = "DRAYNOR_VILLAGE";
        b.lIlIllllIlI[b.lIllIIIIIII[10]] = "Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[2]] = "Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[16]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[17]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[22]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[5]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[27]] = "Narrow wall";
        b.lIlIllllIlI[b.lIllIIIIIII[28]] = "Balance";
        b.lIlIllllIlI[b.lIllIIIIIII[31]] = "Wall";
        b.lIlIllllIlI[b.lIllIIIIIII[32]] = "Jump-up";
        b.lIlIllllIlI[b.lIllIIIIIII[34]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[35]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[40]] = "Crate";
        b.lIlIllllIlI[b.lIllIIIIIII[41]] = "Climb-down";
        b.lIlIllllIlI[b.lIllIIIIIII[42]] = "VARROCK_ROOFTOP";
        b.lIlIllllIlI[b.lIllIIIIIII[49]] = "Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[50]] = "Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[57]] = "Clothes line";
        b.lIlIllllIlI[b.lIllIIIIIII[58]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[62]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[63]] = "Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[67]] = "Wall";
        b.lIlIllllIlI[b.lIllIIIIIII[68]] = "Balance";
        b.lIlIllllIlI[b.lIllIIIIIII[73]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[74]] = "Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[79]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[80]] = "Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[86]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[43]] = "Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[92]] = "Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[93]] = "Hurdle";
        b.lIlIllllIlI[b.lIllIIIIIII[95]] = "Edge";
        b.lIlIllllIlI[b.lIllIIIIIII[96]] = "Jump-off";
        b.lIlIllllIlI[b.lIllIIIIIII[97]] = "CANIFIS_ROOFTOP";
        b.lIlIllllIlI[b.lIllIIIIIII[104]] = "Tall tree";
        b.lIlIllllIlI[b.lIllIIIIIII[105]] = "Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[112]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[113]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[98]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[119]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[122]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[123]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[128]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[129]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[134]] = "Pole-vault";
        b.lIlIllllIlI[b.lIllIIIIIII[135]] = "Vault";
        b.lIlIllllIlI[b.lIllIIIIIII[139]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[140]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[144]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[145]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[147]] = "FALADOR";
        b.lIlIllllIlI[b.lIllIIIIIII[153]] = "Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[154]] = "Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[161]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[162]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[167]] = "Hand holds";
        b.lIlIllllIlI[b.lIllIIIIIII[168]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[174]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[175]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[179]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[180]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[185]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[186]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[191]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[192]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[196]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[197]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[200]] = "Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[201]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[208]] = "Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[209]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[212]] = "Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[213]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[218]] = "Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[219]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[224]] = "Edge";
        b.lIlIllllIlI[b.lIllIIIIIII[225]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[227]] = "SEERS_VILLAGE";
        b.lIlIllllIlI[b.lIllIIIIIII[232]] = "Wall";
        b.lIlIllllIlI[b.lIllIIIIIII[233]] = "Climb-up";
        b.lIlIllllIlI[b.lIllIIIIIII[239]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[240]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[246]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[247]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[253]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[254]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[257]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[258]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[263]] = "Edge";
        b.lIlIllllIlI[b.lIllIIIIIII[264]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[267]] = "POLLNIVNEACH";
        b.lIlIllllIlI[b.lIllIIIIIII[271]] = "Basket";
        b.lIlIllllIlI[b.lIllIIIIIII[272]] = "Climb-on";
        b.lIlIllllIlI[b.lIllIIIIIII[277]] = "Market stall";
        b.lIlIllllIlI[b.lIllIIIIIII[278]] = "Jump-on";
        b.lIlIllllIlI[b.lIllIIIIIII[282]] = "Banner";
        b.lIlIllllIlI[b.lIllIIIIIII[283]] = "Grab";
        b.lIlIllllIlI[b.lIllIIIIIII[288]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[289]] = "Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[293]] = "Tree";
        b.lIlIllllIlI[b.lIllIIIIIII[294]] = "Jump-to";
        b.lIlIllllIlI[b.lIllIIIIIII[298]] = "Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[299]] = "Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[302]] = "Monkeybars";
        b.lIlIllllIlI[b.lIllIIIIIII[303]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[307]] = "Tree";
        b.lIlIllllIlI[b.lIllIIIIIII[308]] = "Jump-on";
        b.lIlIllllIlI[b.lIllIIIIIII[312]] = "Drying line";
        b.lIlIllllIlI[b.lIllIIIIIII[313]] = "Jump-to";
        b.lIlIllllIlI[b.lIllIIIIIII[314]] = "PRIFDDINAS";
        b.lIlIllllIlI[b.lIllIIIIIII[321]] = "Ladder";
        b.lIlIllllIlI[b.lIllIIIIIII[322]] = "Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[327]] = "Dark hole";
        b.lIlIllllIlI[b.lIllIIIIIII[328]] = "Enter";
        b.lIlIllllIlI[b.lIllIIIIIII[331]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[332]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[336]] = "Chimney";
        b.lIlIllllIlI[b.lIllIIIIIII[337]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[340]] = "Roof edge";
        b.lIlIllllIlI[b.lIllIIIIIII[341]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[346]] = "Ladder";
        b.lIlIllllIlI[b.lIllIIIIIII[347]] = "Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[349]] = "Rope bridge";
        b.lIlIllllIlI[b.lIllIIIIIII[350]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[355]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[356]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[359]] = "Rope bridge";
        b.lIlIllllIlI[b.lIllIIIIIII[360]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[363]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[364]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[367]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[368]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[371]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[372]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[375]] = "Dark hole";
        b.lIlIllllIlI[b.lIllIIIIIII[376]] = "Enter";
        b.lIlIllllIlI[b.lIllIIIIIII[379]] = "Ladder";
        b.lIlIllllIlI[b.lIllIIIIIII[380]] = "Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[381]] = "RELLEKKA";
        b.lIlIllllIlI[b.lIllIIIIIII[388]] = "Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[389]] = "Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[396]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[397]] = "Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[401]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[402]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[406]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[407]] = "Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[412]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[413]] = "Hurdle";
        b.lIlIllllIlI[b.lIllIIIIIII[417]] = "Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[418]] = "Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[423]] = "Pile of fish";
        b.lIlIllllIlI[b.lIllIIIIIII[424]] = "Jump-in";
        b.lIlIllllIlI[b.lIllIIIIIII[425]] = "ARDOUGNE";
        b.lIlIllllIlI[b.lIllIIIIIII[431]] = "Wooden Beams";
        b.lIlIllllIlI[b.lIllIIIIIII[432]] = "Climb-up";
        b.lIlIllllIlI[b.lIllIIIIIII[438]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[439]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[444]] = "Plank";
        b.lIlIllllIlI[b.lIllIIIIIII[445]] = "Walk-on";
        b.lIlIllllIlI[b.lIllIIIIIII[448]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[449]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[453]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[454]] = "Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[458]] = "Steep roof";
        b.lIlIllllIlI[b.lIllIIIIIII[459]] = "Balance-across";
        b.lIlIllllIlI[b.lIllIIIIIII[463]] = "Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[464]] = "Jump";
    }

    private static boolean lIIlIlIIllIlll(Object object, Object object2) {
        return object == object2;
    }

    private GameEnum(int n2, List<Integer> list, c ... cArray) {
        this.level = n2;
        this.regionId = list;
        this.obstacles = cArray;
    }

    private static boolean lIIlIlIIllllII(int n, int n2) {
        return n == n2;
    }

    /*
     * WARNING - void declaration
     */
    public static b GameEnum(int n) {
        void var1;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var2 = lIllIIIIIII[1];
        while (b.lIIlIlIIlllIlI(var2, (int)var1)) {
            int var3;
            void var4;
            void var5 = var4[var2];
            if (b.lIIlIlIIlllIll(var5.regionId.contains(var3) ? 1 : 0)) {
                return var5;
            }
            ++var2;

            if (-(88 + 66 - 42 + 40 ^ 49 + 131 - 91 + 67) < 0) continue;
            return null;
        }
        return null;
    }

    private static boolean lIIlIlIIlllIIl(int n, int n2) {
        return n >= n2;
    }

    static {
        b.lIIlIlIIllIlIl();
        b.lIIlIlIIlIlIlI();
        c[] cArray = new c[lIllIIIIIII[5]];
        cArray[b.lIllIIIIIII[1]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[6], lIllIIIIIII[7], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[8], lIllIIIIIII[9], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[10]], lIlIllllIlI[lIllIIIIIII[2]], new WorldPoint(lIllIIIIIII[11], lIllIIIIIII[12], lIllIIIIIII[1]));
        cArray[b.lIllIIIIIII[0]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[13], lIllIIIIIII[7], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[14], lIllIIIIIII[15], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[16]], lIlIllllIlI[lIllIIIIIII[17]]);
        cArray[b.lIllIIIIIII[10]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[18], lIllIIIIIII[19], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[20], lIllIIIIIII[21], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[22]], lIlIllllIlI[lIllIIIIIII[5]]);
        cArray[b.lIllIIIIIII[2]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[23], lIllIIIIIII[24], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[25], lIllIIIIIII[26], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[27]], lIlIllllIlI[lIllIIIIIII[28]]);
        cArray[b.lIllIIIIIII[16]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[18], lIllIIIIIII[29], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[18], lIllIIIIIII[30], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[31]], lIlIllllIlI[lIllIIIIIII[32]]);
        cArray[b.lIllIIIIIII[17]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[18], lIllIIIIIII[33], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[25], lIllIIIIIII[33], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[34]], lIlIllllIlI[lIllIIIIIII[35]]);
        cArray[b.lIllIIIIIII[22]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[36], lIllIIIIIII[37], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[38], lIllIIIIIII[39], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[40]], lIlIllllIlI[lIllIIIIIII[41]]);
        DRAYNOR_VILLAGE = new GameEnum(lIllIIIIIII[0], List.of(Integer.valueOf(lIllIIIIIII[3]), Integer.valueOf(lIllIIIIIII[4])), cArray);
        c[] cArray2 = new c[lIllIIIIIII[28]];
        cArray2[b.lIllIIIIIII[1]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[45], lIllIIIIIII[46], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[47], lIllIIIIIII[48], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[49]], lIlIllllIlI[lIllIIIIIII[50]], new WorldPoint(lIllIIIIIII[51], lIllIIIIIII[52], lIllIIIIIII[1]));
        cArray2[b.lIllIIIIIII[0]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[53], lIllIIIIIII[54], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[55], lIllIIIIIII[56], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[57]], lIlIllllIlI[lIllIIIIIII[58]]);
        cArray2[b.lIllIIIIIII[10]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[59], lIllIIIIIII[52], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[60], lIllIIIIIII[61], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[62]], lIlIllllIlI[lIllIIIIIII[63]]);
        cArray2[b.lIllIIIIIII[2]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[64], lIllIIIIIII[65], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[66], lIllIIIIIII[65], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[67]], lIlIllllIlI[lIllIIIIIII[68]]);
        cArray2[b.lIllIIIIIII[16]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[69], lIllIIIIIII[70], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[71], lIllIIIIIII[72], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[73]], lIlIllllIlI[lIllIIIIIII[74]], new WorldPoint(lIllIIIIIII[66], lIllIIIIIII[75], lIllIIIIIII[2]));
        cArray2[b.lIllIIIIIII[17]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[76], lIllIIIIIII[77], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[59], lIllIIIIIII[78], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[79]], lIlIllllIlI[lIllIIIIIII[80]], new WorldPoint(lIllIIIIIII[81], lIllIIIIIII[82], lIllIIIIIII[2]));
        cArray2[b.lIllIIIIIII[22]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[83], lIllIIIIIII[84], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[85], lIllIIIIIII[72], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[86]], lIlIllllIlI[lIllIIIIIII[43]], new WorldPoint(lIllIIIIIII[87], lIllIIIIIII[72], lIllIIIIIII[2]));
        cArray2[b.lIllIIIIIII[5]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[88], lIllIIIIIII[89], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[90], lIllIIIIIII[91], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[92]], lIlIllllIlI[lIllIIIIIII[93]]);
        cArray2[b.lIllIIIIIII[27]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[90], lIllIIIIIII[56], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[88], lIllIIIIIII[94], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[95]], lIlIllllIlI[lIllIIIIIII[96]]);
        VARROCK_ROOFTOP = new GameEnum(lIllIIIIIII[43], List.of(Integer.valueOf(lIllIIIIIII[44])), cArray2);
        c[] cArray3 = new c[lIllIIIIIII[27]];
        cArray3[b.lIllIIIIIII[1]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[100], lIllIIIIIII[101], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[102], lIllIIIIIII[103], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[104]], lIlIllllIlI[lIllIIIIIII[105]], new WorldPoint(lIllIIIIIII[106], lIllIIIIIII[107], lIllIIIIIII[1]));
        cArray3[b.lIllIIIIIII[0]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[108], lIllIIIIIII[109], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[110], lIllIIIIIII[111], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[112]], lIlIllllIlI[lIllIIIIIII[113]], new WorldPoint(lIllIIIIIII[114], lIllIIIIIII[111], lIllIIIIIII[10]));
        cArray3[b.lIllIIIIIII[10]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[115], lIllIIIIIII[116], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[117], lIllIIIIIII[118], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[98]], lIlIllllIlI[lIllIIIIIII[119]], new WorldPoint(lIllIIIIIII[115], lIllIIIIIII[117], lIllIIIIIII[10]));
        cArray3[b.lIllIIIIIII[2]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[120], lIllIIIIIII[111], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[121], lIllIIIIIII[114], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[122]], lIlIllllIlI[lIllIIIIIII[123]], new WorldPoint(lIllIIIIIII[120], lIllIIIIIII[124], lIllIIIIIII[10]));
        cArray3[b.lIllIIIIIII[16]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[125], lIllIIIIIII[109], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[126], lIllIIIIIII[127], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[128]], lIlIllllIlI[lIllIIIIIII[129]], new WorldPoint(lIllIIIIIII[130], lIllIIIIIII[109], lIllIIIIIII[2]));
        cArray3[b.lIllIIIIIII[17]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[131], lIllIIIIIII[126], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[132], lIllIIIIIII[133], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[134]], lIlIllllIlI[lIllIIIIIII[135]]);
        cArray3[b.lIllIIIIIII[22]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[136], lIllIIIIIII[137], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[117], lIllIIIIIII[138], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[139]], lIlIllllIlI[lIllIIIIIII[140]], new WorldPoint(lIllIIIIIII[116], lIllIIIIIII[131], lIllIIIIIII[2]));
        cArray3[b.lIllIIIIIII[5]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[141], lIllIIIIIII[125], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[142], lIllIIIIIII[143], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[144]], lIlIllllIlI[lIllIIIIIII[145]], new WorldPoint(lIllIIIIIII[146], lIllIIIIIII[143], lIllIIIIIII[10]));
        CANIFIS_ROOFTOP = new GameEnum(lIllIIIIIII[98], List.of(Integer.valueOf(lIllIIIIIII[99])), cArray3);
        c[] cArray4 = new c[lIllIIIIIII[35]];
        cArray4[b.lIllIIIIIII[1]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[149], lIllIIIIIII[150], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[151], lIllIIIIIII[152], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[153]], lIlIllllIlI[lIllIIIIIII[154]], new WorldPoint(lIllIIIIIII[155], lIllIIIIIII[156], lIllIIIIIII[1]));
        cArray4[b.lIllIIIIIII[0]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[157], lIllIIIIIII[158], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[159], lIllIIIIIII[160], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[161]], lIlIllllIlI[lIllIIIIIII[162]], new WorldPoint(lIllIIIIIII[159], lIllIIIIIII[158], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[10]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[163], lIllIIIIIII[164], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[165], lIllIIIIIII[166], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[167]], lIlIllllIlI[lIllIIIIIII[168]], new WorldPoint(lIllIIIIIII[169], lIllIIIIIII[170], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[2]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[171], lIllIIIIIII[172], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[169], lIllIIIIIII[173], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[174]], lIlIllllIlI[lIllIIIIIII[175]], new WorldPoint(lIllIIIIIII[171], lIllIIIIIII[176], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[16]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[163], lIllIIIIIII[177], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[171], lIllIIIIIII[178], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[179]], lIlIllllIlI[lIllIIIIIII[180]], new WorldPoint(lIllIIIIIII[181], lIllIIIIIII[178], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[17]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[182], lIllIIIIIII[183], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[184], lIllIIIIIII[178], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[185]], lIlIllllIlI[lIllIIIIIII[186]], new WorldPoint(lIllIIIIIII[182], lIllIIIIIII[178], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[22]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[187], lIllIIIIIII[188], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[189], lIllIIIIIII[190], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[191]], lIlIllllIlI[lIllIIIIIII[192]], new WorldPoint(lIllIIIIIII[187], lIllIIIIIII[193], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[5]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[194], lIllIIIIIII[172], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[195], lIllIIIIIII[193], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[196]], lIlIllllIlI[lIllIIIIIII[197]], new WorldPoint(lIllIIIIIII[198], lIllIIIIIII[190], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[27]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[198], lIllIIIIIII[164], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[199], lIllIIIIIII[158], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[200]], lIlIllllIlI[lIllIIIIIII[201]], new WorldPoint(lIllIIIIIII[202], lIllIIIIIII[203], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[28]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[204], lIllIIIIIII[205], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[206], lIllIIIIIII[207], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[208]], lIlIllllIlI[lIllIIIIIII[209]], new WorldPoint(lIllIIIIIII[204], lIllIIIIIII[158], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[31]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[194], lIllIIIIIII[160], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[210], lIllIIIIIII[211], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[212]], lIlIllllIlI[lIllIIIIIII[213]], new WorldPoint(lIllIIIIIII[214], lIllIIIIIII[215], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[32]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[214], lIllIIIIIII[215], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[216], lIllIIIIIII[217], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[218]], lIlIllllIlI[lIllIIIIIII[219]], new WorldPoint(lIllIIIIIII[220], lIllIIIIIII[221], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[34]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[222], lIllIIIIIII[211], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[223], lIllIIIIIII[221], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[224]], lIlIllllIlI[lIllIIIIIII[225]], new WorldPoint(lIllIIIIIII[226], lIllIIIIIII[221], lIllIIIIIII[2]));
        FALADOR = new GameEnum(lIllIIIIIII[144], List.of(Integer.valueOf(lIllIIIIIII[148])), cArray4);
        c[] cArray5 = new c[lIllIIIIIII[22]];
        cArray5[b.lIllIIIIIII[1]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[229], lIllIIIIIII[110], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[230], lIllIIIIIII[231], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[232]], lIlIllllIlI[lIllIIIIIII[233]], new WorldPoint(lIllIIIIIII[234], lIllIIIIIII[107], lIllIIIIIII[1]));
        cArray5[b.lIllIIIIIII[0]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[235], lIllIIIIIII[236], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[237], lIllIIIIIII[238], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[239]], lIlIllllIlI[lIllIIIIIII[240]], new WorldPoint(lIllIIIIIII[241], lIllIIIIIII[242], lIllIIIIIII[2]));
        cArray5[b.lIllIIIIIII[10]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[243], lIllIIIIIII[244], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[245], lIllIIIIIII[107], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[246]], lIlIllllIlI[lIllIIIIIII[247]], new WorldPoint(lIllIIIIIII[248], lIllIIIIIII[249], lIllIIIIIII[10]));
        cArray5[b.lIllIIIIIII[2]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[248], lIllIIIIIII[250], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[251], lIllIIIIIII[252], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[253]], lIlIllllIlI[lIllIIIIIII[254]], new WorldPoint(lIllIIIIIII[248], lIllIIIIIII[131], lIllIIIIIII[10]));
        cArray5[b.lIllIIIIIII[16]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[255], lIllIIIIIII[256], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[251], lIllIIIIIII[101], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[257]], lIlIllllIlI[lIllIIIIIII[258]], new WorldPoint(lIllIIIIIII[255], lIllIIIIIII[259], lIllIIIIIII[2]));
        cArray5[b.lIllIIIIIII[17]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[260], lIllIIIIIII[256], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[261], lIllIIIIIII[262], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[263]], lIlIllllIlI[lIllIIIIIII[264]], new WorldPoint(lIllIIIIIII[265], lIllIIIIIII[266], lIllIIIIIII[10]));
        SEERS_VILLAGE = new GameEnum(lIllIIIIIII[175], List.of(Integer.valueOf(lIllIIIIIII[228])), cArray5);
        c[] cArray6 = new c[lIllIIIIIII[28]];
        cArray6[b.lIllIIIIIII[1]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[207], lIllIIIIIII[149], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[269], lIllIIIIIII[270], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[271]], lIlIllllIlI[lIllIIIIIII[272]], new WorldPoint(lIllIIIIIII[273], lIllIIIIIII[274], lIllIIIIIII[1]));
        cArray6[b.lIllIIIIIII[0]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[273], lIllIIIIIII[275], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[205], lIllIIIIIII[276], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[277]], lIlIllllIlI[lIllIIIIIII[278]]);
        cArray6[b.lIllIIIIIII[10]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[190], lIllIIIIIII[279], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[280], lIllIIIIIII[281], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[282]], lIlIllllIlI[lIllIIIIIII[283]]);
        cArray6[b.lIllIIIIIII[2]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[284], lIllIIIIIII[285], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[286], lIllIIIIIII[287], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[288]], lIlIllllIlI[lIllIIIIIII[289]]);
        cArray6[b.lIllIIIIIII[16]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[290], lIllIIIIIII[281], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[291], lIllIIIIIII[292], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[293]], lIlIllllIlI[lIllIIIIIII[294]]);
        cArray6[b.lIllIIIIIII[17]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[291], lIllIIIIIII[295], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[296], lIllIIIIIII[297], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[298]], lIlIllllIlI[lIllIIIIIII[299]]);
        cArray6[b.lIllIIIIIII[22]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[296], lIllIIIIIII[300], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[280], lIllIIIIIII[301], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[302]], lIlIllllIlI[lIllIIIIIII[303]]);
        cArray6[b.lIllIIIIIII[5]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[173], lIllIIIIIII[304], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[305], lIllIIIIIII[306], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[307]], lIlIllllIlI[lIllIIIIIII[308]]);
        cArray6[b.lIllIIIIIII[27]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[309], lIllIIIIIII[310], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[286], lIllIIIIIII[311], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[312]], lIlIllllIlI[lIllIIIIIII[313]]);
        POLLNIVNEACH = new GameEnum(lIllIIIIIII[201], List.of(Integer.valueOf(lIllIIIIIII[268])), cArray6);
        c[] cArray7 = new c[lIllIIIIIII[40]];
        cArray7[b.lIllIIIIIII[1]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[319], lIllIIIIIII[320], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[319], lIllIIIIIII[320], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[321]], lIlIllllIlI[lIllIIIIIII[322]], new WorldPoint(lIllIIIIIII[319], lIllIIIIIII[320], lIllIIIIIII[1]));
        cArray7[b.lIllIIIIIII[0]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[323], lIllIIIIIII[324], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[325], lIllIIIIIII[326], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[327]], lIlIllllIlI[lIllIIIIIII[328]]);
        cArray7[b.lIllIIIIIII[10]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[33], lIllIIIIIII[329], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[30], lIllIIIIIII[330], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[331]], lIlIllllIlI[lIllIIIIIII[332]]);
        cArray7[b.lIllIIIIIII[2]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[333], lIllIIIIIII[334], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[335], lIllIIIIIII[334], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[336]], lIlIllllIlI[lIllIIIIIII[337]]);
        cArray7[b.lIllIIIIIII[16]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[338], lIllIIIIIII[330], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[338], lIllIIIIIII[339], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[340]], lIlIllllIlI[lIllIIIIIII[341]]);
        cArray7[b.lIllIIIIIII[17]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[342], lIllIIIIIII[343], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[344], lIllIIIIIII[345], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[346]], lIlIllllIlI[lIllIIIIIII[347]]);
        cArray7[b.lIllIIIIIII[22]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[348], lIllIIIIIII[343], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[342], lIllIIIIIII[84], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[349]], lIlIllllIlI[lIllIIIIIII[350]]);
        cArray7[b.lIllIIIIIII[5]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[351], lIllIIIIIII[352], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[353], lIllIIIIIII[354], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[355]], lIlIllllIlI[lIllIIIIIII[356]]);
        cArray7[b.lIllIIIIIII[27]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[357], lIllIIIIIII[345], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[358], lIllIIIIIII[78], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[359]], lIlIllllIlI[lIllIIIIIII[360]]);
        cArray7[b.lIllIIIIIII[28]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[361], lIllIIIIIII[70], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[358], lIllIIIIIII[362], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[363]], lIlIllllIlI[lIllIIIIIII[364]]);
        cArray7[b.lIllIIIIIII[31]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[358], lIllIIIIIII[365], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[366], lIllIIIIIII[70], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[367]], lIlIllllIlI[lIllIIIIIII[368]]);
        cArray7[b.lIllIIIIIII[32]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[369], lIllIIIIIII[94], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[370], lIllIIIIIII[54], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[371]], lIlIllllIlI[lIllIIIIIII[372]]);
        cArray7[b.lIllIIIIIII[34]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[370], lIllIIIIIII[373], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[344], lIllIIIIIII[374], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[375]], lIlIllllIlI[lIllIIIIIII[376]]);
        cArray7[b.lIllIIIIIII[35]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[357], lIllIIIIIII[343], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[377], lIllIIIIIII[378], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[379]], lIlIllllIlI[lIllIIIIIII[380]]);
        PRIFDDINAS = new GameEnum(lIllIIIIIII[218], List.of(Integer.valueOf(lIllIIIIIII[315]), Integer.valueOf(lIllIIIIIII[316]), Integer.valueOf(lIllIIIIIII[317]), Integer.valueOf(lIllIIIIIII[318])), cArray7);
        c[] cArray8 = new c[lIllIIIIIII[5]];
        cArray8[b.lIllIIIIIII[1]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[384], lIllIIIIIII[385], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[386], lIllIIIIIII[387], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[388]], lIlIllllIlI[lIllIIIIIII[389]], new WorldPoint(lIllIIIIIII[390], lIllIIIIIII[391], lIllIIIIIII[1]));
        cArray8[b.lIllIIIIIII[0]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[392], lIllIIIIIII[393], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[394], lIllIIIIIII[395], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[396]], lIlIllllIlI[lIllIIIIIII[397]]);
        cArray8[b.lIllIIIIIII[10]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[394], lIllIIIIIII[398], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[399], lIllIIIIIII[400], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[401]], lIlIllllIlI[lIllIIIIIII[402]]);
        cArray8[b.lIllIIIIIII[2]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[392], lIllIIIIIII[403], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[404], lIllIIIIIII[405], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[406]], lIlIllllIlI[lIllIIIIIII[407]]);
        cArray8[b.lIllIIIIIII[16]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[408], lIllIIIIIII[409], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[410], lIllIIIIIII[411], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[412]], lIlIllllIlI[lIllIIIIIII[413]]);
        cArray8[b.lIllIIIIIII[17]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[410], lIllIIIIIII[414], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[415], lIllIIIIIII[416], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[417]], lIlIllllIlI[lIllIIIIIII[418]]);
        cArray8[b.lIllIIIIIII[22]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[419], lIllIIIIIII[420], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[421], lIllIIIIIII[422], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[423]], lIlIllllIlI[lIllIIIIIII[424]]);
        RELLEKKA = new GameEnum(lIllIIIIIII[232], List.of(Integer.valueOf(lIllIIIIIII[382]), Integer.valueOf(lIllIIIIIII[383])), cArray8);
        c[] cArray9 = new c[lIllIIIIIII[5]];
        cArray9[b.lIllIIIIIII[1]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[427], lIllIIIIIII[428], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[429], lIllIIIIIII[430], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[431]], lIlIllllIlI[lIllIIIIIII[432]], new WorldPoint(lIllIIIIIII[433], lIllIIIIIII[434], lIllIIIIIII[1]));
        cArray9[b.lIllIIIIIII[0]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[435], lIllIIIIIII[436], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[437], lIllIIIIIII[434], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[438]], lIlIllllIlI[lIllIIIIIII[439]]);
        cArray9[b.lIllIIIIIII[10]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[440], lIllIIIIIII[441], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[442], lIllIIIIIII[443], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[444]], lIlIllllIlI[lIllIIIIIII[445]]);
        cArray9[b.lIllIIIIIII[2]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[446], lIllIIIIIII[441], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[447], lIllIIIIIII[443], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[448]], lIlIllllIlI[lIllIIIIIII[449]]);
        cArray9[b.lIllIIIIIII[16]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[446], lIllIIIIIII[450], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[451], lIllIIIIIII[452], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[453]], lIlIllllIlI[lIllIIIIIII[454]], new WorldPoint(lIllIIIIIII[455], lIllIIIIIII[456], lIllIIIIIII[2]));
        cArray9[b.lIllIIIIIII[17]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[415], lIllIIIIIII[436], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[419], lIllIIIIIII[457], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[458]], lIlIllllIlI[lIllIIIIIII[459]], new WorldPoint(lIllIIIIIII[451], lIllIIIIIII[460], lIllIIIIIII[2]));
        cArray9[b.lIllIIIIIII[22]] = new CHelper(new AHelper(new WorldPoint(lIllIIIIIII[451], lIllIIIIIII[460], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[461], lIllIIIIIII[462], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[463]], lIlIllllIlI[lIllIIIIIII[464]], new WorldPoint(lIllIIIIIII[465], lIllIIIIIII[462], lIllIIIIIII[2]));
        ARDOUGNE = new GameEnum(lIllIIIIIII[263], List.of(Integer.valueOf(lIllIIIIIII[426])), cArray9);
        b[] bArray = new b[lIllIIIIIII[28]];
        bArray[b.lIllIIIIIII[1]] = DRAYNOR_VILLAGE;
        bArray[b.lIllIIIIIII[0]] = VARROCK_ROOFTOP;
        bArray[b.lIllIIIIIII[10]] = CANIFIS_ROOFTOP;
        bArray[b.lIllIIIIIII[2]] = FALADOR;
        bArray[b.lIllIIIIIII[16]] = SEERS_VILLAGE;
        bArray[b.lIllIIIIIII[17]] = POLLNIVNEACH;
        bArray[b.lIllIIIIIII[22]] = PRIFDDINAS;
        bArray[b.lIllIIIIIII[5]] = RELLEKKA;
        bArray[b.lIllIIIIIII[27]] = ARDOUGNE;
        $VALUES = bArray;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public c k() {
        void var6;
        void var7;
        Player player = Players.getLocal();
        c c2 = this.obstacles[lIllIIIIIII[1]];
        c[] cArray = this.obstacles;
        int n = cArray.length;
        int var8 = lIllIIIIIII[1];
        while (b.lIIlIlIIlllIlI(var8, (int)var7)) {
            void var9;
            void var10 = var9[var8];
            if (b.lIIlIlIIlllIll(var10.m().a((Locatable)Players.getLocal()) ? 1 : 0)) {
                return var10;
            }
            ++var8;

            if (1 == 1) continue;
            return null;
        }
        if (b.lIIlIlIIllllII(var6.getWorldLocation().getPlane(), lIllIIIIIII[2])) {
            return null;
        }
        return c2;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static boolean lIIlIlIIlllIll(int n) {
        return n != 0;
    }

    private static boolean lIIlIlIIlllIlI(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public static b j() {
        b[] bArray = b.values();
        int var11 = bArray.length - lIllIIIIIII[0];
        while (b.lIIlIlIIllIllI(var11)) {
            void var12;
            void var13 = var12[var11];
            if (b.lIIlIlIIllIlll(var13, (Object)CANIFIS_ROOFTOP) && b.lIIlIlIIlllIII(Quests.isFinished((Quest)Quest.PRIEST_IN_PERIL) ? 1 : 0)) {

                if (-1 >= 3) {
                    return null;
                }
            } else if (b.lIIlIlIIlllIIl(Skills.getLevel((Skill)Skill.AGILITY), var13.level)) {
                return var13;
            }
            --var11;

            if (3 <= 3) continue;
            return null;
        }
        Object[] objectArray = new Object[lIllIIIIIII[0]];
        objectArray[b.lIllIIIIIII[1]] = Skills.getLevel((Skill)Skill.AGILITY);
        Log.info((String)lIlIllllIlI[lIllIIIIIII[1]], (Object[])objectArray);
        return DRAYNOR_VILLAGE;
    }

    private static boolean lIIlIlIIllIllI(int n) {
        return n >= 0;
    }

        return String.valueOf(var14);
    }

    public c[] l() {
        return this.obstacles;
    }

    private static boolean lIIlIlIIlllIII(int n) {
        return n == 0;
    }
}

