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
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

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
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.a;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.c;

public final class b
extends Enum<b> {
    public static final /* synthetic */ /* enum */ b POLLNIVNEACH;
    public static final /* synthetic */ /* enum */ b SEERS_VILLAGE;
    private static final /* synthetic */ b[] $VALUES;
    private static /* synthetic */ String[] lIlIllllIlI;
    private static /* synthetic */ int[] lIllIIIIIII;
    public static final /* synthetic */ /* enum */ b VARROCK_ROOFTOP;
    public static final /* synthetic */ /* enum */ b ARDOUGNE;
    public static final /* synthetic */ /* enum */ b PRIFDDINAS;
    private final /* synthetic */ int level;
    private final /* synthetic */ c[] obstacles;
    public static final /* synthetic */ /* enum */ b FALADOR;
    public static final /* synthetic */ /* enum */ b CANIFIS_ROOFTOP;
    private final /* synthetic */ List<Integer> regionId;
    public static final /* synthetic */ /* enum */ b DRAYNOR_VILLAGE;
    public static final /* synthetic */ /* enum */ b RELLEKKA;

    private static void lIIlIlIIlIlIlI() {
        lIlIllllIlI = new String[lIllIIIIIII[466]];
        b.lIlIllllIlI[b.lIllIIIIIII[1]] = b."No course found for level {}, falling back on Draynor.";
        b.lIlIllllIlI[b.lIllIIIIIII[0]] = b."DRAYNOR_VILLAGE";
        b.lIlIllllIlI[b.lIllIIIIIII[10]] = b."Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[2]] = b."Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[16]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[17]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[22]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[5]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[27]] = b."Narrow wall";
        b.lIlIllllIlI[b.lIllIIIIIII[28]] = b."Balance";
        b.lIlIllllIlI[b.lIllIIIIIII[31]] = b."Wall";
        b.lIlIllllIlI[b.lIllIIIIIII[32]] = b."Jump-up";
        b.lIlIllllIlI[b.lIllIIIIIII[34]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[35]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[40]] = b."Crate";
        b.lIlIllllIlI[b.lIllIIIIIII[41]] = b."Climb-down";
        b.lIlIllllIlI[b.lIllIIIIIII[42]] = b."VARROCK_ROOFTOP";
        b.lIlIllllIlI[b.lIllIIIIIII[49]] = b."Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[50]] = b."Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[57]] = b."Clothes line";
        b.lIlIllllIlI[b.lIllIIIIIII[58]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[62]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[63]] = b."Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[67]] = b."Wall";
        b.lIlIllllIlI[b.lIllIIIIIII[68]] = b."Balance";
        b.lIlIllllIlI[b.lIllIIIIIII[73]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[74]] = b."Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[79]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[80]] = b."Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[86]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[43]] = b."Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[92]] = b."Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[93]] = b."Hurdle";
        b.lIlIllllIlI[b.lIllIIIIIII[95]] = b."Edge";
        b.lIlIllllIlI[b.lIllIIIIIII[96]] = b."Jump-off";
        b.lIlIllllIlI[b.lIllIIIIIII[97]] = b."CANIFIS_ROOFTOP";
        b.lIlIllllIlI[b.lIllIIIIIII[104]] = b."Tall tree";
        b.lIlIllllIlI[b.lIllIIIIIII[105]] = b."Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[112]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[113]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[98]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[119]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[122]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[123]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[128]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[129]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[134]] = b."Pole-vault";
        b.lIlIllllIlI[b.lIllIIIIIII[135]] = b."Vault";
        b.lIlIllllIlI[b.lIllIIIIIII[139]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[140]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[144]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[145]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[147]] = b."FALADOR";
        b.lIlIllllIlI[b.lIllIIIIIII[153]] = b."Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[154]] = b."Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[161]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[162]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[167]] = b."Hand holds";
        b.lIlIllllIlI[b.lIllIIIIIII[168]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[174]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[175]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[179]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[180]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[185]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[186]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[191]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[192]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[196]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[197]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[200]] = b."Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[201]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[208]] = b."Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[209]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[212]] = b."Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[213]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[218]] = b."Ledge";
        b.lIlIllllIlI[b.lIllIIIIIII[219]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[224]] = b."Edge";
        b.lIlIllllIlI[b.lIllIIIIIII[225]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[227]] = b."SEERS_VILLAGE";
        b.lIlIllllIlI[b.lIllIIIIIII[232]] = b."Wall";
        b.lIlIllllIlI[b.lIllIIIIIII[233]] = b."Climb-up";
        b.lIlIllllIlI[b.lIllIIIIIII[239]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[240]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[246]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[247]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[253]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[254]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[257]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[258]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[263]] = b."Edge";
        b.lIlIllllIlI[b.lIllIIIIIII[264]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[267]] = b."POLLNIVNEACH";
        b.lIlIllllIlI[b.lIllIIIIIII[271]] = b."Basket";
        b.lIlIllllIlI[b.lIllIIIIIII[272]] = b."Climb-on";
        b.lIlIllllIlI[b.lIllIIIIIII[277]] = b."Market stall";
        b.lIlIllllIlI[b.lIllIIIIIII[278]] = b."Jump-on";
        b.lIlIllllIlI[b.lIllIIIIIII[282]] = b."Banner";
        b.lIlIllllIlI[b.lIllIIIIIII[283]] = b."Grab";
        b.lIlIllllIlI[b.lIllIIIIIII[288]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[289]] = b."Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[293]] = b."Tree";
        b.lIlIllllIlI[b.lIllIIIIIII[294]] = b."Jump-to";
        b.lIlIllllIlI[b.lIllIIIIIII[298]] = b."Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[299]] = b."Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[302]] = b."Monkeybars";
        b.lIlIllllIlI[b.lIllIIIIIII[303]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[307]] = b."Tree";
        b.lIlIllllIlI[b.lIllIIIIIII[308]] = b."Jump-on";
        b.lIlIllllIlI[b.lIllIIIIIII[312]] = b."Drying line";
        b.lIlIllllIlI[b.lIllIIIIIII[313]] = b."Jump-to";
        b.lIlIllllIlI[b.lIllIIIIIII[314]] = b."PRIFDDINAS";
        b.lIlIllllIlI[b.lIllIIIIIII[321]] = b."Ladder";
        b.lIlIllllIlI[b.lIllIIIIIII[322]] = b."Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[327]] = b."Dark hole";
        b.lIlIllllIlI[b.lIllIIIIIII[328]] = b."Enter";
        b.lIlIllllIlI[b.lIllIIIIIII[331]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[332]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[336]] = b."Chimney";
        b.lIlIllllIlI[b.lIllIIIIIII[337]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[340]] = b."Roof edge";
        b.lIlIllllIlI[b.lIllIIIIIII[341]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[346]] = b."Ladder";
        b.lIlIllllIlI[b.lIllIIIIIII[347]] = b."Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[349]] = b."Rope bridge";
        b.lIlIllllIlI[b.lIllIIIIIII[350]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[355]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[356]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[359]] = b."Rope bridge";
        b.lIlIllllIlI[b.lIllIIIIIII[360]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[363]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[364]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[367]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[368]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[371]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[372]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[375]] = b."Dark hole";
        b.lIlIllllIlI[b.lIllIIIIIII[376]] = b."Enter";
        b.lIlIllllIlI[b.lIllIIIIIII[379]] = b."Ladder";
        b.lIlIllllIlI[b.lIllIIIIIII[380]] = b."Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[381]] = b."RELLEKKA";
        b.lIlIllllIlI[b.lIllIIIIIII[388]] = b."Rough wall";
        b.lIlIllllIlI[b.lIllIIIIIII[389]] = b."Climb";
        b.lIlIllllIlI[b.lIllIIIIIII[396]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[397]] = b."Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[401]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[402]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[406]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[407]] = b."Leap";
        b.lIlIllllIlI[b.lIllIIIIIII[412]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[413]] = b."Hurdle";
        b.lIlIllllIlI[b.lIllIIIIIII[417]] = b."Tightrope";
        b.lIlIllllIlI[b.lIllIIIIIII[418]] = b."Cross";
        b.lIlIllllIlI[b.lIllIIIIIII[423]] = b."Pile of fish";
        b.lIlIllllIlI[b.lIllIIIIIII[424]] = b."Jump-in";
        b.lIlIllllIlI[b.lIllIIIIIII[425]] = b."ARDOUGNE";
        b.lIlIllllIlI[b.lIllIIIIIII[431]] = b."Wooden Beams";
        b.lIlIllllIlI[b.lIllIIIIIII[432]] = b."Climb-up";
        b.lIlIllllIlI[b.lIllIIIIIII[438]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[439]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[444]] = b."Plank";
        b.lIlIllllIlI[b.lIllIIIIIII[445]] = b."Walk-on";
        b.lIlIllllIlI[b.lIllIIIIIII[448]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[449]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[453]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[454]] = b."Jump";
        b.lIlIllllIlI[b.lIllIIIIIII[458]] = b."Steep roof";
        b.lIlIllllIlI[b.lIllIIIIIII[459]] = b."Balance-across";
        b.lIlIllllIlI[b.lIllIIIIIII[463]] = b."Gap";
        b.lIlIllllIlI[b.lIllIIIIIII[464]] = b."Jump";
    }

    private static boolean lIIlIlIIllIlll(Object object, Object object2) {
        return object == object2;
    }

    private b(int n2, List<Integer> list, c ... cArray) {
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
    public static b b(int n) {
        void llllllllllllllllIlIlIlIllIIlllIl;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int llllllllllllllllIlIlIlIllIIlllII = lIllIIIIIII[1];
        while (b.lIIlIlIIlllIlI(llllllllllllllllIlIlIlIllIIlllII, (int)llllllllllllllllIlIlIlIllIIlllIl)) {
            int llllllllllllllllIlIlIlIllIIlllll;
            void llllllllllllllllIlIlIlIllIIllllI;
            void llllllllllllllllIlIlIlIllIIllIll = llllllllllllllllIlIlIlIllIIllllI[llllllllllllllllIlIlIlIllIIlllII];
            if (b.lIIlIlIIlllIll(llllllllllllllllIlIlIlIllIIllIll.regionId.contains(llllllllllllllllIlIlIlIllIIlllll) ? 1 : 0)) {
                return llllllllllllllllIlIlIlIllIIllIll;
            }
            ++llllllllllllllllIlIlIlIllIIlllII;
            0;
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
        cArray[b.lIllIIIIIII[1]] = new c(new a(new WorldPoint(lIllIIIIIII[6], lIllIIIIIII[7], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[8], lIllIIIIIII[9], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[10]], lIlIllllIlI[lIllIIIIIII[2]], new WorldPoint(lIllIIIIIII[11], lIllIIIIIII[12], lIllIIIIIII[1]));
        cArray[b.lIllIIIIIII[0]] = new c(new a(new WorldPoint(lIllIIIIIII[13], lIllIIIIIII[7], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[14], lIllIIIIIII[15], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[16]], lIlIllllIlI[lIllIIIIIII[17]]);
        cArray[b.lIllIIIIIII[10]] = new c(new a(new WorldPoint(lIllIIIIIII[18], lIllIIIIIII[19], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[20], lIllIIIIIII[21], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[22]], lIlIllllIlI[lIllIIIIIII[5]]);
        cArray[b.lIllIIIIIII[2]] = new c(new a(new WorldPoint(lIllIIIIIII[23], lIllIIIIIII[24], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[25], lIllIIIIIII[26], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[27]], lIlIllllIlI[lIllIIIIIII[28]]);
        cArray[b.lIllIIIIIII[16]] = new c(new a(new WorldPoint(lIllIIIIIII[18], lIllIIIIIII[29], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[18], lIllIIIIIII[30], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[31]], lIlIllllIlI[lIllIIIIIII[32]]);
        cArray[b.lIllIIIIIII[17]] = new c(new a(new WorldPoint(lIllIIIIIII[18], lIllIIIIIII[33], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[25], lIllIIIIIII[33], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[34]], lIlIllllIlI[lIllIIIIIII[35]]);
        cArray[b.lIllIIIIIII[22]] = new c(new a(new WorldPoint(lIllIIIIIII[36], lIllIIIIIII[37], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[38], lIllIIIIIII[39], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[40]], lIlIllllIlI[lIllIIIIIII[41]]);
        DRAYNOR_VILLAGE = new b(lIllIIIIIII[0], List.of(Integer.valueOf(lIllIIIIIII[3]), Integer.valueOf(lIllIIIIIII[4])), cArray);
        c[] cArray2 = new c[lIllIIIIIII[28]];
        cArray2[b.lIllIIIIIII[1]] = new c(new a(new WorldPoint(lIllIIIIIII[45], lIllIIIIIII[46], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[47], lIllIIIIIII[48], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[49]], lIlIllllIlI[lIllIIIIIII[50]], new WorldPoint(lIllIIIIIII[51], lIllIIIIIII[52], lIllIIIIIII[1]));
        cArray2[b.lIllIIIIIII[0]] = new c(new a(new WorldPoint(lIllIIIIIII[53], lIllIIIIIII[54], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[55], lIllIIIIIII[56], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[57]], lIlIllllIlI[lIllIIIIIII[58]]);
        cArray2[b.lIllIIIIIII[10]] = new c(new a(new WorldPoint(lIllIIIIIII[59], lIllIIIIIII[52], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[60], lIllIIIIIII[61], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[62]], lIlIllllIlI[lIllIIIIIII[63]]);
        cArray2[b.lIllIIIIIII[2]] = new c(new a(new WorldPoint(lIllIIIIIII[64], lIllIIIIIII[65], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[66], lIllIIIIIII[65], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[67]], lIlIllllIlI[lIllIIIIIII[68]]);
        cArray2[b.lIllIIIIIII[16]] = new c(new a(new WorldPoint(lIllIIIIIII[69], lIllIIIIIII[70], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[71], lIllIIIIIII[72], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[73]], lIlIllllIlI[lIllIIIIIII[74]], new WorldPoint(lIllIIIIIII[66], lIllIIIIIII[75], lIllIIIIIII[2]));
        cArray2[b.lIllIIIIIII[17]] = new c(new a(new WorldPoint(lIllIIIIIII[76], lIllIIIIIII[77], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[59], lIllIIIIIII[78], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[79]], lIlIllllIlI[lIllIIIIIII[80]], new WorldPoint(lIllIIIIIII[81], lIllIIIIIII[82], lIllIIIIIII[2]));
        cArray2[b.lIllIIIIIII[22]] = new c(new a(new WorldPoint(lIllIIIIIII[83], lIllIIIIIII[84], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[85], lIllIIIIIII[72], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[86]], lIlIllllIlI[lIllIIIIIII[43]], new WorldPoint(lIllIIIIIII[87], lIllIIIIIII[72], lIllIIIIIII[2]));
        cArray2[b.lIllIIIIIII[5]] = new c(new a(new WorldPoint(lIllIIIIIII[88], lIllIIIIIII[89], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[90], lIllIIIIIII[91], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[92]], lIlIllllIlI[lIllIIIIIII[93]]);
        cArray2[b.lIllIIIIIII[27]] = new c(new a(new WorldPoint(lIllIIIIIII[90], lIllIIIIIII[56], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[88], lIllIIIIIII[94], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[95]], lIlIllllIlI[lIllIIIIIII[96]]);
        VARROCK_ROOFTOP = new b(lIllIIIIIII[43], List.of(Integer.valueOf(lIllIIIIIII[44])), cArray2);
        c[] cArray3 = new c[lIllIIIIIII[27]];
        cArray3[b.lIllIIIIIII[1]] = new c(new a(new WorldPoint(lIllIIIIIII[100], lIllIIIIIII[101], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[102], lIllIIIIIII[103], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[104]], lIlIllllIlI[lIllIIIIIII[105]], new WorldPoint(lIllIIIIIII[106], lIllIIIIIII[107], lIllIIIIIII[1]));
        cArray3[b.lIllIIIIIII[0]] = new c(new a(new WorldPoint(lIllIIIIIII[108], lIllIIIIIII[109], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[110], lIllIIIIIII[111], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[112]], lIlIllllIlI[lIllIIIIIII[113]], new WorldPoint(lIllIIIIIII[114], lIllIIIIIII[111], lIllIIIIIII[10]));
        cArray3[b.lIllIIIIIII[10]] = new c(new a(new WorldPoint(lIllIIIIIII[115], lIllIIIIIII[116], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[117], lIllIIIIIII[118], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[98]], lIlIllllIlI[lIllIIIIIII[119]], new WorldPoint(lIllIIIIIII[115], lIllIIIIIII[117], lIllIIIIIII[10]));
        cArray3[b.lIllIIIIIII[2]] = new c(new a(new WorldPoint(lIllIIIIIII[120], lIllIIIIIII[111], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[121], lIllIIIIIII[114], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[122]], lIlIllllIlI[lIllIIIIIII[123]], new WorldPoint(lIllIIIIIII[120], lIllIIIIIII[124], lIllIIIIIII[10]));
        cArray3[b.lIllIIIIIII[16]] = new c(new a(new WorldPoint(lIllIIIIIII[125], lIllIIIIIII[109], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[126], lIllIIIIIII[127], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[128]], lIlIllllIlI[lIllIIIIIII[129]], new WorldPoint(lIllIIIIIII[130], lIllIIIIIII[109], lIllIIIIIII[2]));
        cArray3[b.lIllIIIIIII[17]] = new c(new a(new WorldPoint(lIllIIIIIII[131], lIllIIIIIII[126], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[132], lIllIIIIIII[133], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[134]], lIlIllllIlI[lIllIIIIIII[135]]);
        cArray3[b.lIllIIIIIII[22]] = new c(new a(new WorldPoint(lIllIIIIIII[136], lIllIIIIIII[137], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[117], lIllIIIIIII[138], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[139]], lIlIllllIlI[lIllIIIIIII[140]], new WorldPoint(lIllIIIIIII[116], lIllIIIIIII[131], lIllIIIIIII[2]));
        cArray3[b.lIllIIIIIII[5]] = new c(new a(new WorldPoint(lIllIIIIIII[141], lIllIIIIIII[125], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[142], lIllIIIIIII[143], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[144]], lIlIllllIlI[lIllIIIIIII[145]], new WorldPoint(lIllIIIIIII[146], lIllIIIIIII[143], lIllIIIIIII[10]));
        CANIFIS_ROOFTOP = new b(lIllIIIIIII[98], List.of(Integer.valueOf(lIllIIIIIII[99])), cArray3);
        c[] cArray4 = new c[lIllIIIIIII[35]];
        cArray4[b.lIllIIIIIII[1]] = new c(new a(new WorldPoint(lIllIIIIIII[149], lIllIIIIIII[150], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[151], lIllIIIIIII[152], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[153]], lIlIllllIlI[lIllIIIIIII[154]], new WorldPoint(lIllIIIIIII[155], lIllIIIIIII[156], lIllIIIIIII[1]));
        cArray4[b.lIllIIIIIII[0]] = new c(new a(new WorldPoint(lIllIIIIIII[157], lIllIIIIIII[158], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[159], lIllIIIIIII[160], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[161]], lIlIllllIlI[lIllIIIIIII[162]], new WorldPoint(lIllIIIIIII[159], lIllIIIIIII[158], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[10]] = new c(new a(new WorldPoint(lIllIIIIIII[163], lIllIIIIIII[164], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[165], lIllIIIIIII[166], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[167]], lIlIllllIlI[lIllIIIIIII[168]], new WorldPoint(lIllIIIIIII[169], lIllIIIIIII[170], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[2]] = new c(new a(new WorldPoint(lIllIIIIIII[171], lIllIIIIIII[172], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[169], lIllIIIIIII[173], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[174]], lIlIllllIlI[lIllIIIIIII[175]], new WorldPoint(lIllIIIIIII[171], lIllIIIIIII[176], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[16]] = new c(new a(new WorldPoint(lIllIIIIIII[163], lIllIIIIIII[177], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[171], lIllIIIIIII[178], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[179]], lIlIllllIlI[lIllIIIIIII[180]], new WorldPoint(lIllIIIIIII[181], lIllIIIIIII[178], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[17]] = new c(new a(new WorldPoint(lIllIIIIIII[182], lIllIIIIIII[183], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[184], lIllIIIIIII[178], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[185]], lIlIllllIlI[lIllIIIIIII[186]], new WorldPoint(lIllIIIIIII[182], lIllIIIIIII[178], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[22]] = new c(new a(new WorldPoint(lIllIIIIIII[187], lIllIIIIIII[188], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[189], lIllIIIIIII[190], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[191]], lIlIllllIlI[lIllIIIIIII[192]], new WorldPoint(lIllIIIIIII[187], lIllIIIIIII[193], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[5]] = new c(new a(new WorldPoint(lIllIIIIIII[194], lIllIIIIIII[172], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[195], lIllIIIIIII[193], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[196]], lIlIllllIlI[lIllIIIIIII[197]], new WorldPoint(lIllIIIIIII[198], lIllIIIIIII[190], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[27]] = new c(new a(new WorldPoint(lIllIIIIIII[198], lIllIIIIIII[164], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[199], lIllIIIIIII[158], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[200]], lIlIllllIlI[lIllIIIIIII[201]], new WorldPoint(lIllIIIIIII[202], lIllIIIIIII[203], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[28]] = new c(new a(new WorldPoint(lIllIIIIIII[204], lIllIIIIIII[205], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[206], lIllIIIIIII[207], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[208]], lIlIllllIlI[lIllIIIIIII[209]], new WorldPoint(lIllIIIIIII[204], lIllIIIIIII[158], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[31]] = new c(new a(new WorldPoint(lIllIIIIIII[194], lIllIIIIIII[160], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[210], lIllIIIIIII[211], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[212]], lIlIllllIlI[lIllIIIIIII[213]], new WorldPoint(lIllIIIIIII[214], lIllIIIIIII[215], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[32]] = new c(new a(new WorldPoint(lIllIIIIIII[214], lIllIIIIIII[215], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[216], lIllIIIIIII[217], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[218]], lIlIllllIlI[lIllIIIIIII[219]], new WorldPoint(lIllIIIIIII[220], lIllIIIIIII[221], lIllIIIIIII[2]));
        cArray4[b.lIllIIIIIII[34]] = new c(new a(new WorldPoint(lIllIIIIIII[222], lIllIIIIIII[211], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[223], lIllIIIIIII[221], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[224]], lIlIllllIlI[lIllIIIIIII[225]], new WorldPoint(lIllIIIIIII[226], lIllIIIIIII[221], lIllIIIIIII[2]));
        FALADOR = new b(lIllIIIIIII[144], List.of(Integer.valueOf(lIllIIIIIII[148])), cArray4);
        c[] cArray5 = new c[lIllIIIIIII[22]];
        cArray5[b.lIllIIIIIII[1]] = new c(new a(new WorldPoint(lIllIIIIIII[229], lIllIIIIIII[110], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[230], lIllIIIIIII[231], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[232]], lIlIllllIlI[lIllIIIIIII[233]], new WorldPoint(lIllIIIIIII[234], lIllIIIIIII[107], lIllIIIIIII[1]));
        cArray5[b.lIllIIIIIII[0]] = new c(new a(new WorldPoint(lIllIIIIIII[235], lIllIIIIIII[236], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[237], lIllIIIIIII[238], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[239]], lIlIllllIlI[lIllIIIIIII[240]], new WorldPoint(lIllIIIIIII[241], lIllIIIIIII[242], lIllIIIIIII[2]));
        cArray5[b.lIllIIIIIII[10]] = new c(new a(new WorldPoint(lIllIIIIIII[243], lIllIIIIIII[244], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[245], lIllIIIIIII[107], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[246]], lIlIllllIlI[lIllIIIIIII[247]], new WorldPoint(lIllIIIIIII[248], lIllIIIIIII[249], lIllIIIIIII[10]));
        cArray5[b.lIllIIIIIII[2]] = new c(new a(new WorldPoint(lIllIIIIIII[248], lIllIIIIIII[250], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[251], lIllIIIIIII[252], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[253]], lIlIllllIlI[lIllIIIIIII[254]], new WorldPoint(lIllIIIIIII[248], lIllIIIIIII[131], lIllIIIIIII[10]));
        cArray5[b.lIllIIIIIII[16]] = new c(new a(new WorldPoint(lIllIIIIIII[255], lIllIIIIIII[256], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[251], lIllIIIIIII[101], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[257]], lIlIllllIlI[lIllIIIIIII[258]], new WorldPoint(lIllIIIIIII[255], lIllIIIIIII[259], lIllIIIIIII[2]));
        cArray5[b.lIllIIIIIII[17]] = new c(new a(new WorldPoint(lIllIIIIIII[260], lIllIIIIIII[256], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[261], lIllIIIIIII[262], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[263]], lIlIllllIlI[lIllIIIIIII[264]], new WorldPoint(lIllIIIIIII[265], lIllIIIIIII[266], lIllIIIIIII[10]));
        SEERS_VILLAGE = new b(lIllIIIIIII[175], List.of(Integer.valueOf(lIllIIIIIII[228])), cArray5);
        c[] cArray6 = new c[lIllIIIIIII[28]];
        cArray6[b.lIllIIIIIII[1]] = new c(new a(new WorldPoint(lIllIIIIIII[207], lIllIIIIIII[149], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[269], lIllIIIIIII[270], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[271]], lIlIllllIlI[lIllIIIIIII[272]], new WorldPoint(lIllIIIIIII[273], lIllIIIIIII[274], lIllIIIIIII[1]));
        cArray6[b.lIllIIIIIII[0]] = new c(new a(new WorldPoint(lIllIIIIIII[273], lIllIIIIIII[275], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[205], lIllIIIIIII[276], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[277]], lIlIllllIlI[lIllIIIIIII[278]]);
        cArray6[b.lIllIIIIIII[10]] = new c(new a(new WorldPoint(lIllIIIIIII[190], lIllIIIIIII[279], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[280], lIllIIIIIII[281], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[282]], lIlIllllIlI[lIllIIIIIII[283]]);
        cArray6[b.lIllIIIIIII[2]] = new c(new a(new WorldPoint(lIllIIIIIII[284], lIllIIIIIII[285], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[286], lIllIIIIIII[287], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[288]], lIlIllllIlI[lIllIIIIIII[289]]);
        cArray6[b.lIllIIIIIII[16]] = new c(new a(new WorldPoint(lIllIIIIIII[290], lIllIIIIIII[281], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[291], lIllIIIIIII[292], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[293]], lIlIllllIlI[lIllIIIIIII[294]]);
        cArray6[b.lIllIIIIIII[17]] = new c(new a(new WorldPoint(lIllIIIIIII[291], lIllIIIIIII[295], lIllIIIIIII[0]), new WorldPoint(lIllIIIIIII[296], lIllIIIIIII[297], lIllIIIIIII[0]), lIllIIIIIII[0]), lIlIllllIlI[lIllIIIIIII[298]], lIlIllllIlI[lIllIIIIIII[299]]);
        cArray6[b.lIllIIIIIII[22]] = new c(new a(new WorldPoint(lIllIIIIIII[296], lIllIIIIIII[300], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[280], lIllIIIIIII[301], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[302]], lIlIllllIlI[lIllIIIIIII[303]]);
        cArray6[b.lIllIIIIIII[5]] = new c(new a(new WorldPoint(lIllIIIIIII[173], lIllIIIIIII[304], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[305], lIllIIIIIII[306], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[307]], lIlIllllIlI[lIllIIIIIII[308]]);
        cArray6[b.lIllIIIIIII[27]] = new c(new a(new WorldPoint(lIllIIIIIII[309], lIllIIIIIII[310], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[286], lIllIIIIIII[311], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[312]], lIlIllllIlI[lIllIIIIIII[313]]);
        POLLNIVNEACH = new b(lIllIIIIIII[201], List.of(Integer.valueOf(lIllIIIIIII[268])), cArray6);
        c[] cArray7 = new c[lIllIIIIIII[40]];
        cArray7[b.lIllIIIIIII[1]] = new c(new a(new WorldPoint(lIllIIIIIII[319], lIllIIIIIII[320], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[319], lIllIIIIIII[320], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[321]], lIlIllllIlI[lIllIIIIIII[322]], new WorldPoint(lIllIIIIIII[319], lIllIIIIIII[320], lIllIIIIIII[1]));
        cArray7[b.lIllIIIIIII[0]] = new c(new a(new WorldPoint(lIllIIIIIII[323], lIllIIIIIII[324], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[325], lIllIIIIIII[326], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[327]], lIlIllllIlI[lIllIIIIIII[328]]);
        cArray7[b.lIllIIIIIII[10]] = new c(new a(new WorldPoint(lIllIIIIIII[33], lIllIIIIIII[329], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[30], lIllIIIIIII[330], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[331]], lIlIllllIlI[lIllIIIIIII[332]]);
        cArray7[b.lIllIIIIIII[2]] = new c(new a(new WorldPoint(lIllIIIIIII[333], lIllIIIIIII[334], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[335], lIllIIIIIII[334], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[336]], lIlIllllIlI[lIllIIIIIII[337]]);
        cArray7[b.lIllIIIIIII[16]] = new c(new a(new WorldPoint(lIllIIIIIII[338], lIllIIIIIII[330], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[338], lIllIIIIIII[339], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[340]], lIlIllllIlI[lIllIIIIIII[341]]);
        cArray7[b.lIllIIIIIII[17]] = new c(new a(new WorldPoint(lIllIIIIIII[342], lIllIIIIIII[343], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[344], lIllIIIIIII[345], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[346]], lIlIllllIlI[lIllIIIIIII[347]]);
        cArray7[b.lIllIIIIIII[22]] = new c(new a(new WorldPoint(lIllIIIIIII[348], lIllIIIIIII[343], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[342], lIllIIIIIII[84], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[349]], lIlIllllIlI[lIllIIIIIII[350]]);
        cArray7[b.lIllIIIIIII[5]] = new c(new a(new WorldPoint(lIllIIIIIII[351], lIllIIIIIII[352], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[353], lIllIIIIIII[354], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[355]], lIlIllllIlI[lIllIIIIIII[356]]);
        cArray7[b.lIllIIIIIII[27]] = new c(new a(new WorldPoint(lIllIIIIIII[357], lIllIIIIIII[345], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[358], lIllIIIIIII[78], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[359]], lIlIllllIlI[lIllIIIIIII[360]]);
        cArray7[b.lIllIIIIIII[28]] = new c(new a(new WorldPoint(lIllIIIIIII[361], lIllIIIIIII[70], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[358], lIllIIIIIII[362], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[363]], lIlIllllIlI[lIllIIIIIII[364]]);
        cArray7[b.lIllIIIIIII[31]] = new c(new a(new WorldPoint(lIllIIIIIII[358], lIllIIIIIII[365], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[366], lIllIIIIIII[70], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[367]], lIlIllllIlI[lIllIIIIIII[368]]);
        cArray7[b.lIllIIIIIII[32]] = new c(new a(new WorldPoint(lIllIIIIIII[369], lIllIIIIIII[94], lIllIIIIIII[10]), new WorldPoint(lIllIIIIIII[370], lIllIIIIIII[54], lIllIIIIIII[10]), lIllIIIIIII[10]), lIlIllllIlI[lIllIIIIIII[371]], lIlIllllIlI[lIllIIIIIII[372]]);
        cArray7[b.lIllIIIIIII[34]] = new c(new a(new WorldPoint(lIllIIIIIII[370], lIllIIIIIII[373], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[344], lIllIIIIIII[374], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[375]], lIlIllllIlI[lIllIIIIIII[376]]);
        cArray7[b.lIllIIIIIII[35]] = new c(new a(new WorldPoint(lIllIIIIIII[357], lIllIIIIIII[343], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[377], lIllIIIIIII[378], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[379]], lIlIllllIlI[lIllIIIIIII[380]]);
        PRIFDDINAS = new b(lIllIIIIIII[218], List.of(Integer.valueOf(lIllIIIIIII[315]), Integer.valueOf(lIllIIIIIII[316]), Integer.valueOf(lIllIIIIIII[317]), Integer.valueOf(lIllIIIIIII[318])), cArray7);
        c[] cArray8 = new c[lIllIIIIIII[5]];
        cArray8[b.lIllIIIIIII[1]] = new c(new a(new WorldPoint(lIllIIIIIII[384], lIllIIIIIII[385], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[386], lIllIIIIIII[387], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[388]], lIlIllllIlI[lIllIIIIIII[389]], new WorldPoint(lIllIIIIIII[390], lIllIIIIIII[391], lIllIIIIIII[1]));
        cArray8[b.lIllIIIIIII[0]] = new c(new a(new WorldPoint(lIllIIIIIII[392], lIllIIIIIII[393], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[394], lIllIIIIIII[395], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[396]], lIlIllllIlI[lIllIIIIIII[397]]);
        cArray8[b.lIllIIIIIII[10]] = new c(new a(new WorldPoint(lIllIIIIIII[394], lIllIIIIIII[398], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[399], lIllIIIIIII[400], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[401]], lIlIllllIlI[lIllIIIIIII[402]]);
        cArray8[b.lIllIIIIIII[2]] = new c(new a(new WorldPoint(lIllIIIIIII[392], lIllIIIIIII[403], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[404], lIllIIIIIII[405], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[406]], lIlIllllIlI[lIllIIIIIII[407]]);
        cArray8[b.lIllIIIIIII[16]] = new c(new a(new WorldPoint(lIllIIIIIII[408], lIllIIIIIII[409], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[410], lIllIIIIIII[411], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[412]], lIlIllllIlI[lIllIIIIIII[413]]);
        cArray8[b.lIllIIIIIII[17]] = new c(new a(new WorldPoint(lIllIIIIIII[410], lIllIIIIIII[414], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[415], lIllIIIIIII[416], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[417]], lIlIllllIlI[lIllIIIIIII[418]]);
        cArray8[b.lIllIIIIIII[22]] = new c(new a(new WorldPoint(lIllIIIIIII[419], lIllIIIIIII[420], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[421], lIllIIIIIII[422], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[423]], lIlIllllIlI[lIllIIIIIII[424]]);
        RELLEKKA = new b(lIllIIIIIII[232], List.of(Integer.valueOf(lIllIIIIIII[382]), Integer.valueOf(lIllIIIIIII[383])), cArray8);
        c[] cArray9 = new c[lIllIIIIIII[5]];
        cArray9[b.lIllIIIIIII[1]] = new c(new a(new WorldPoint(lIllIIIIIII[427], lIllIIIIIII[428], lIllIIIIIII[1]), new WorldPoint(lIllIIIIIII[429], lIllIIIIIII[430], lIllIIIIIII[1]), lIllIIIIIII[1]), lIlIllllIlI[lIllIIIIIII[431]], lIlIllllIlI[lIllIIIIIII[432]], new WorldPoint(lIllIIIIIII[433], lIllIIIIIII[434], lIllIIIIIII[1]));
        cArray9[b.lIllIIIIIII[0]] = new c(new a(new WorldPoint(lIllIIIIIII[435], lIllIIIIIII[436], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[437], lIllIIIIIII[434], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[438]], lIlIllllIlI[lIllIIIIIII[439]]);
        cArray9[b.lIllIIIIIII[10]] = new c(new a(new WorldPoint(lIllIIIIIII[440], lIllIIIIIII[441], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[442], lIllIIIIIII[443], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[444]], lIlIllllIlI[lIllIIIIIII[445]]);
        cArray9[b.lIllIIIIIII[2]] = new c(new a(new WorldPoint(lIllIIIIIII[446], lIllIIIIIII[441], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[447], lIllIIIIIII[443], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[448]], lIlIllllIlI[lIllIIIIIII[449]]);
        cArray9[b.lIllIIIIIII[16]] = new c(new a(new WorldPoint(lIllIIIIIII[446], lIllIIIIIII[450], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[451], lIllIIIIIII[452], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[453]], lIlIllllIlI[lIllIIIIIII[454]], new WorldPoint(lIllIIIIIII[455], lIllIIIIIII[456], lIllIIIIIII[2]));
        cArray9[b.lIllIIIIIII[17]] = new c(new a(new WorldPoint(lIllIIIIIII[415], lIllIIIIIII[436], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[419], lIllIIIIIII[457], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[458]], lIlIllllIlI[lIllIIIIIII[459]], new WorldPoint(lIllIIIIIII[451], lIllIIIIIII[460], lIllIIIIIII[2]));
        cArray9[b.lIllIIIIIII[22]] = new c(new a(new WorldPoint(lIllIIIIIII[451], lIllIIIIIII[460], lIllIIIIIII[2]), new WorldPoint(lIllIIIIIII[461], lIllIIIIIII[462], lIllIIIIIII[2]), lIllIIIIIII[2]), lIlIllllIlI[lIllIIIIIII[463]], lIlIllllIlI[lIllIIIIIII[464]], new WorldPoint(lIllIIIIIII[465], lIllIIIIIII[462], lIllIIIIIII[2]));
        ARDOUGNE = new b(lIllIIIIIII[263], List.of(Integer.valueOf(lIllIIIIIII[426])), cArray9);
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

    private static void lIIlIlIIllIlIl() {
        lIllIIIIIII = new int[467];
        b.lIllIIIIIII[0] = 1;
        b.lIllIIIIIII[1] = (0x8B ^ 0x91 ^ (0x10 ^ 0x37)) & (0x1A ^ 0x44 ^ (0x4D ^ 0x2E) ^ -1);
        b.lIllIIIIIII[2] = 3;
        b.lIllIIIIIII[3] = -(0xFFFFFD65 & 0xFDF) & (0xFFFFFD77 & 0x3FFF);
        b.lIllIIIIIII[4] = 0xFFFFB17E & 0x7EB3;
        b.lIllIIIIIII[5] = 0xD0 ^ 0x99 ^ (0x37 ^ 0x79);
        b.lIllIIIIIII[6] = -(0xFFFFECAB & 0x335E) & (0xFFFFFBFD & 0x2FFF);
        b.lIllIIIIIII[7] = 0xFFFFCEF9 & 0x3DD7;
        b.lIllIIIIIII[8] = -(0xFFFFD9F2 & 0x375F) & (0xFFFFFF7F & 0x1DF7);
        b.lIllIIIIIII[9] = 0xFFFFCEFF & 0x3D4B;
        b.lIllIIIIIII[10] = 2;
        b.lIllIIIIIII[11] = -(81 + 25 - 46 + 144) & (0xFFFFBCEF & 0x4FFB);
        b.lIllIIIIIII[12] = -(0xFFFFBA29 & 0x47F7) & (0xFFFFBEFF & 0x4FEF);
        b.lIllIIIIIII[13] = -(0xFFFF95FF & 0x7BC5) & (0xFFFFDFFD & 0x3DDF);
        b.lIllIIIIIII[14] = 0xFFFFDE9E & 0x2D7F;
        b.lIllIIIIIII[15] = -(0xFFFFF783 & 0x7A7F) & (0xFFFFFFFF & 0x7ECF);
        b.lIllIIIIIII[16] = 0xFD ^ 0xBD ^ (0x17 ^ 0x53);
        b.lIllIIIIIII[17] = 117 + 54 - 136 + 146 ^ 11 + 110 - 33 + 88;
        b.lIllIIIIIII[18] = -(0xFFFFEF3F & 0x53EA) & (0xFFFFFFFB & 0x4F3D);
        b.lIllIIIIIII[19] = -(0xFFFFC73F & 0x78E3) & (0xFFFFCEFE & 0x7DEF);
        b.lIllIIIIIII[20] = -(0xFFFFF5DB & 0x5A6D) & (0xFFFFFF7F & 0x5CDB);
        b.lIllIIIIIII[21] = -(0x45 ^ 0x64) & (0xFFFFDDEB & 0x2EFD);
        b.lIllIIIIIII[22] = 0xB0 ^ 0xB6;
        b.lIllIIIIIII[23] = 0xFFFFCF75 & 0x3C9B;
        b.lIllIIIIIII[24] = -(0xFFFFB965 & 0x76BB) & (0xFFFFFCEB & 0x3FF7);
        b.lIllIIIIIII[25] = -(0xFFFFBFCF & 0x62B1) & (0xFFFFAED6 & 0x7FBF);
        b.lIllIIIIIII[26] = 0xFFFFCFFF & 0x3CC1;
        b.lIllIIIIIII[27] = 0x53 ^ 0x39 ^ (0x5B ^ 0x39);
        b.lIllIIIIIII[28] = 0x10 ^ 0x19;
        b.lIllIIIIIII[29] = -(0xFFFFFDD9 & 0x1327) & (0xFFFFBDFD & 0x5FBF);
        b.lIllIIIIIII[30] = 0xFFFFFFF9 & 0xCBF;
        b.lIllIIIIIII[31] = 0x7E ^ 0x74;
        b.lIllIIIIIII[32] = 0x2E ^ 0x3C ^ (0x23 ^ 0x3A);
        b.lIllIIIIIII[33] = -(0xFFFFF35B & 0x7EED) & (0xFFFFFEFF & Short.MAX_VALUE);
        b.lIllIIIIIII[34] = 0xAB ^ 0xA7;
        b.lIllIIIIIII[35] = 0x6F ^ 0x62;
        b.lIllIIIIIII[36] = -(0xFFFFE1EF & 0x1F77) & (0xFFFF8D7E & Short.MAX_VALUE);
        b.lIllIIIIIII[37] = 0xFFFFEF7D & 0x1EA7;
        b.lIllIIIIIII[38] = 0xFFFF9F7F & 0x6C9D;
        b.lIllIIIIIII[39] = 0xFFFFFDBD & 0xEFA;
        b.lIllIIIIIII[40] = 0x4D ^ 0x43;
        b.lIllIIIIIII[41] = 0xAE ^ 0xA3 ^ 2;
        b.lIllIIIIIII[42] = 0x40 ^ 0x21 ^ (0xF2 ^ 0x83);
        b.lIllIIIIIII[43] = 0x14 ^ 0x24 ^ (0x94 ^ 0xBA);
        b.lIllIIIIIII[44] = -(0xFFFFFDD7 & 0x4EAB) & (0xFFFFFEBF & 0x7FF7);
        b.lIllIIIIIII[45] = -(0xFFFFF967 & 0x6799) & (0xFFFFEDF9 & 0x7FB7);
        b.lIllIIIIIII[46] = 0xFFFFADCE & 0x5F71;
        b.lIllIIIIIII[47] = 0xFFFFBDF6 & 0x4E7B;
        b.lIllIIIIIII[48] = -(0xFFFFC3BB & 0x3ED5) & (0xFFFFEFF7 & 0x1FFF);
        b.lIllIIIIIII[49] = 0x64 ^ 0xD ^ (0xE7 ^ 0x9F);
        b.lIllIIIIIII[50] = 179 + 115 - 128 + 19 ^ 168 + 7 - 10 + 6;
        b.lIllIIIIIII[51] = -(0xFFFFEA6B & 0x35DE) & (0xFFFFACFF & 0x7FDF);
        b.lIllIIIIIII[52] = 0xFFFFAF7E & 0x5DD7;
        b.lIllIIIIIII[53] = -(0xFFFFEAF7 & 0x7769) & (0xFFFFFFFB & 0x6EF7);
        b.lIllIIIIIII[54] = -(0xFFFFA6DB & 0x5BA5) & (0xFFFFAFDB & 0x5FFF);
        b.lIllIIIIIII[55] = 0xFFFFFC9F & 0xFEE;
        b.lIllIIIIIII[56] = -(0xFFFFFE8F & 0x33FE) & (0xFFFFFFFF & 0x3FDF);
        b.lIllIIIIIII[57] = 0x3D ^ 0x2E;
        b.lIllIIIIIII[58] = 17 + 83 - -25 + 23 ^ 117 + 18 - 22 + 15;
        b.lIllIIIIIII[59] = -(0xFFFFF26B & 0x7DB7) & (0xFFFFFFBF & 0x7CEA);
        b.lIllIIIIIII[60] = 0xFFFFECDD & 0x1FA3;
        b.lIllIIIIIII[61] = -(0xFFFFF1FF & 0x3E23) & (0xFFFFFF7B & 0x3DFF);
        b.lIllIIIIIII[62] = 0x9D ^ 0x88;
        b.lIllIIIIIII[63] = 0xFF ^ 0x91 ^ (0xCA ^ 0xB2);
        b.lIllIIIIIII[64] = -(0xFFFFDF8B & 0x31F7) & (0xFFFFDDFF & 0x3FFF);
        b.lIllIIIIIII[65] = -(0x2A ^ 0xD) & (0xFFFFDF7F & 0x2DFE);
        b.lIllIIIIIII[66] = 0xFFFF8FFB & 0x7C7D;
        b.lIllIIIIIII[67] = 0xB9 ^ 0xAE;
        b.lIllIIIIIII[68] = 0xD5 ^ 0x8B ^ (0x5B ^ 0x1D);
        b.lIllIIIIIII[69] = 0xFFFFEE7C & 0x1DFB;
        b.lIllIIIIIII[70] = 0xFFFFAD6E & 0x5FDF;
        b.lIllIIIIIII[71] = 0xFFFFEC7F & 0x1FFE;
        b.lIllIIIIIII[72] = 0xFFFFCD6F & 0x3FDA;
        b.lIllIIIIIII[73] = 0x26 ^ 0x3F;
        b.lIllIIIIIII[74] = 0x34 ^ 0x2E;
        b.lIllIIIIIII[75] = 0xFFFF8FEB & 0x7D5D;
        b.lIllIIIIIII[76] = 0xFFFF8D6E & 0x7EFF;
        b.lIllIIIIIII[77] = -(0xFFFFFF5B & 0x30E5) & (0xFFFFBFF6 & 0x7D7F);
        b.lIllIIIIIII[78] = -(0xFFFFF7BA & 0x5AFF) & (0xFFFFDFFF & Short.MAX_VALUE);
        b.lIllIIIIIII[79] = 0xBE ^ 0xA5;
        b.lIllIIIIIII[80] = 0x8B ^ 0xBC ^ (0xA3 ^ 0x88);
        b.lIllIIIIIII[81] = -(0xFFFFF565 & 0x3ADF) & (0xFFFFBEFD & 0x7DCF);
        b.lIllIIIIIII[82] = -(0xFFFFD33D & 0x7CEB) & (0xFFFFDDEF & 0x7F7D);
        b.lIllIIIIIII[83] = -(0xFFFFBFFF & 0x716D) & (0xFFFFFFFF & 0x3DFE);
        b.lIllIIIIIII[84] = -(0xFFFFB2FF & 0x6F9D) & (0xFFFFEFFF & 0x3FDD);
        b.lIllIIIIIII[85] = 0xFFFF9DE4 & 0x6EBB;
        b.lIllIIIIIII[86] = 102 + 118 - 121 + 30 ^ 61 + 86 - 72 + 81;
        b.lIllIIIIIII[87] = -(0xFFFFD2CF & 0x6F71) & (0xFFFFDFF5 & 0x6EEB);
        b.lIllIIIIIII[88] = -(0xFFFFFD3D & 0x42CE) & (0xFFFFDEEF & 0x6DBF);
        b.lIllIIIIIII[89] = -(0xFFFFFADD & 0x7733) & (0xFFFFFFDB & 0x7F7F);
        b.lIllIIIIIII[90] = -(0xFFFFD37F & 0x6FC8) & (0xFFFFDFFF & 0x6FEF);
        b.lIllIIIIIII[91] = 0xFFFFAFF1 & 0x5D5E;
        b.lIllIIIIIII[92] = 163 + 215 - 266 + 105 ^ 144 + 150 - 215 + 119;
        b.lIllIIIIIII[93] = 155 + 116 - 119 + 24 ^ 100 + 52 - 136 + 128;
        b.lIllIIIIIII[94] = -(0xFFFFD7BB & 0x68C5) & (0xFFFFFDDF & 0x4FF7);
        b.lIllIIIIIII[95] = 0x88 ^ 0xA9;
        b.lIllIIIIIII[96] = 0x68 ^ 0x4A;
        b.lIllIIIIIII[97] = 0x55 ^ 0x76;
        b.lIllIIIIIII[98] = 0x89 ^ 0xA1;
        b.lIllIIIIIII[99] = -(0xFFFFBFBA & 0x48C7) & (0xFFFFFEF7 & 0x3FBF);
        b.lIllIIIIIII[100] = 0xFFFFFDA9 & 0xFDF;
        b.lIllIIIIIII[101] = -(0xFFFFF57F & 0x7AD2) & (0xFFFFFFDF & 0x7DFF);
        b.lIllIIIIIII[102] = 0xFFFF9DF2 & 0x6FCF;
        b.lIllIIIIIII[103] = 0xFFFFCFBF & 0x3DFE;
        b.lIllIIIIIII[104] = (3 ^ 0x44) & ~(0xF7 ^ 0xB0) ^ (0x5F ^ 0x7B);
        b.lIllIIIIIII[105] = 0x8F ^ 0xAA;
        b.lIllIIIIIII[106] = 0xFFFFDDBE & 0x2FF5;
        b.lIllIIIIIII[107] = -(0xFFFFF7DF & 0x3A77) & (0xFFFFFFF7 & 0x3FFE);
        b.lIllIIIIIII[108] = 0xFFFF8DEE & 0x7FBF;
        b.lIllIIIIIII[109] = -(0xFFFFDE8D & 0x737F) & (0xFFFFDFEF & 0x7FBF);
        b.lIllIIIIIII[110] = 0xFFFFBDF7 & 0x4FBF;
        b.lIllIIIIIII[111] = -(0xFFFFC55F & 0x7AF5) & (0xFFFFCDFE & Short.MAX_VALUE);
        b.lIllIIIIIII[112] = 46 + 36 - -24 + 42 ^ 55 + 126 - 100 + 97;
        b.lIllIIIIIII[113] = 4 ^ 0x23;
        b.lIllIIIIIII[114] = -(0xFFFFAACF & 0x7775) & (0xFFFFEFFF & 0x3FF5);
        b.lIllIIIIIII[115] = 0xFFFF8FEF & 0x7DB8;
        b.lIllIIIIIII[116] = -(0xFFFFF251 & Short.MAX_VALUE) & (0xFFFFFFFF & Short.MAX_VALUE);
        b.lIllIIIIIII[117] = 0xFFFFFFBA & 0xDF5;
        b.lIllIIIIIII[118] = -(0xFFFFBEA9 & 0x535F) & (0xFFFFFFFF & 0x1FBB);
        b.lIllIIIIIII[119] = 0x16 ^ 0x3F;
        b.lIllIIIIIII[120] = -(0xFFFFFEE7 & 0x617B) & (0xFFFFFDFF & 0x6FFF);
        b.lIllIIIIIII[121] = -(0xFFFFF67D & 0x5B93) & (0xFFFFFFFF & 0x5FB5);
        b.lIllIIIIIII[122] = 0x9F ^ 0xB5;
        b.lIllIIIIIII[123] = 0x8C ^ 0xA7;
        b.lIllIIIIIII[124] = 0xFFFFADBF & 0x5FEB;
        b.lIllIIIIIII[125] = -(0x11 ^ 0x50) & (0xFFFFADF7 & 0x5FDA);
        b.lIllIIIIIII[126] = -(0xFFFFBAB7 & 0x654F) & (0xFFFFFDDE & 0x2FBF);
        b.lIllIIIIIII[127] = -(0xFFFFE7D7 & 0x7A69) & (0xFFFFEFEF & 0x7FFC);
        b.lIllIIIIIII[128] = 0x20 ^ 0xC;
        b.lIllIIIIIII[129] = 0x25 ^ 0x67 ^ (0xC2 ^ 0xAD);
        b.lIllIIIIIII[130] = 0xFFFF8FBE & 0x7DD7;
        b.lIllIIIIIII[131] = -(0xFFFFF7FF & 0x1A6B) & (0xFFFF9FFE & Short.MAX_VALUE);
        b.lIllIIIIIII[132] = -(0xFFFFF276 & 0x4FEB) & (0xFFFFCFFD & Short.MAX_VALUE);
        b.lIllIIIIIII[133] = 0xFFFFDF9F & 0x2DFF;
        b.lIllIIIIIII[134] = 0x44 ^ 0x6A;
        b.lIllIIIIIII[135] = 0x29 ^ 0x42 ^ (0xF0 ^ 0xB4);
        b.lIllIIIIIII[136] = -(0xFFFFE6EB & 0x5B56) & (0xFFFFEFDF & 0x5FFF);
        b.lIllIIIIIII[137] = -(0xFFFFD7F1 & 0x2A2F) & (0xFFFFBFFC & 0x4FAF);
        b.lIllIIIIIII[138] = -(0xFFFFE969 & 0x76D7) & (0xFFFFFFFF & 0x6DD7);
        b.lIllIIIIIII[139] = 0xBE ^ 0x8E;
        b.lIllIIIIIII[140] = 0xD1 ^ 0x82 ^ (0x37 ^ 0x55);
        b.lIllIIIIIII[141] = -(0xFFFFC26B & 0x3FDD) & (0xFFFFCFFD & 0x3FFF);
        b.lIllIIIIIII[142] = -(0x5F ^ 0x1B) & (0xFFFF9DFF & 0x6FFF);
        b.lIllIIIIIII[143] = -(0xFFFFF56F & 0x7AB5) & (0xFFFFFFFF & 0x7DBF);
        b.lIllIIIIIII[144] = 0xF4 ^ 0xC6;
        b.lIllIIIIIII[145] = 0x15 ^ 0x50 ^ (0x50 ^ 0x26);
        b.lIllIIIIIII[146] = -(0xFFFFEADB & 0x172E) & (0xFFFFCFBF & 0x3FFF);
        b.lIllIIIIIII[147] = 38 + 2 - -87 + 0 ^ (0xD ^ 0x46);
        b.lIllIIIIIII[148] = 0xFFFFEFBC & 0x3F77;
        b.lIllIIIIIII[149] = -(0xFFFFD905 & 0x76FF) & (0xFFFFDFFF & 0x7BBF);
        b.lIllIIIIIII[150] = 0xFFFFDDEB & 0x2F37;
        b.lIllIIIIIII[151] = -(0xFFFFEF85 & 0x347F) & (0xFFFFEFFF & 0x3FF7);
        b.lIllIIIIIII[152] = 0xFFFFDF98 & 0x2D67;
        b.lIllIIIIIII[153] = 0x52 ^ 0x41 ^ (0x8E ^ 0xA8);
        b.lIllIIIIIII[154] = 130 + 62 - 187 + 171 ^ 38 + 122 - 105 + 79;
        b.lIllIIIIIII[155] = 0xFFFFAFFF & 0x5BDB;
        b.lIllIIIIIII[156] = 0xFFFFDF6F & 0x2D9C;
        b.lIllIIIIIII[157] = 0xFFFF8BFD & 0x7FDE;
        b.lIllIIIIIII[158] = 0xFFFF8FDF & 0x7D2F;
        b.lIllIIIIIII[159] = 0xFFFFCFE9 & 0x3BF6;
        b.lIllIIIIIII[160] = -(0xFFFFE37E & 0x3EC3) & (0xFFFFEFDF & 0x3F6F);
        b.lIllIIIIIII[161] = 0x11 ^ 0x55 ^ (0x2D ^ 0x5E);
        b.lIllIIIIIII[162] = 87 + 44 - 71 + 70 ^ 178 + 35 - 198 + 171;
        b.lIllIIIIIII[163] = -(0xFFFFB395 & 0x5C7B) & (0xFFFF9BF5 & Short.MAX_VALUE);
        b.lIllIIIIIII[164] = 0xFFFFCF97 & 0x3D7D;
        b.lIllIIIIIII[165] = 0xFFFFBBFB & 0x4FEF;
        b.lIllIIIIIII[166] = 0xFFFFEFFD & 0x1D0F;
        b.lIllIIIIIII[167] = 0x3C ^ 5;
        b.lIllIIIIIII[168] = 2 ^ 0x1D ^ (0x47 ^ 0x62);
        b.lIllIIIIIII[169] = 0xFFFFBBEA & 0x4FFF;
        b.lIllIIIIIII[170] = -(0xFFFFFEED & 0x43FB) & (0xFFFFFFFF & 0x4FFE);
        b.lIllIIIIIII[171] = -(0xFFFFDC96 & 0x677B) & (0xFFFFFFF9 & 0x4FFF);
        b.lIllIIIIIII[172] = 0xFFFFAFBF & 0x5D5E;
        b.lIllIIIIIII[173] = -(0xFFFFF753 & 0x7AED) & (0xFFFFFFFF & 0x7F5D);
        b.lIllIIIIIII[174] = 132 + 126 - 177 + 56 ^ 85 + 147 - 134 + 80;
        b.lIllIIIIIII[175] = 129 + 142 - 172 + 44 ^ 26 + 83 - -39 + 31;
        b.lIllIIIIIII[176] = -(0xFFFF9AE5 & 0x77FB) & (0xFFFFBFFF & 0x5FFF);
        b.lIllIIIIIII[177] = 0xFFFF9D6F & 0x6FB7;
        b.lIllIIIIIII[178] = -(0xFFFFBFD7 & 0x727F) & (0xFFFFFF7F & 0x3FF7);
        b.lIllIIIIIII[179] = 0x7F ^ 0x42;
        b.lIllIIIIIII[180] = 33 + 104 - -4 + 32 ^ 42 + 59 - 25 + 71;
        b.lIllIIIIIII[181] = 0xFFFFFBEF & 0xFF4;
        b.lIllIIIIIII[182] = 0xFFFFAFFB & 0x5BDE;
        b.lIllIIIIIII[183] = 0xFFFF8F2F & 0x7DF4;
        b.lIllIIIIIII[184] = -(0xFFFFE8DF & 0x572B) & (0xFFFFCBFB & 0x7FEF);
        b.lIllIIIIIII[185] = 0x59 ^ 0x66;
        b.lIllIIIIIII[186] = 0x54 ^ 0x14;
        b.lIllIIIIIII[187] = 0xFFFFBFDA & 0x4BF7;
        b.lIllIIIIIII[188] = 0xFFFFDF9E & 0x2D7B;
        b.lIllIIIIIII[189] = -(0xFFFFFEEB & 0x313D) & (0xFFFFBBFF & 0x7FFD);
        b.lIllIIIIIII[190] = 0xFFFFDDFB & 0x2F1C;
        b.lIllIIIIIII[191] = 0x29 ^ 0x77 ^ (0x88 ^ 0x97);
        b.lIllIIIIIII[192] = 0x21 ^ 0x18 ^ (0x28 ^ 0x53);
        b.lIllIIIIIII[193] = -(0xFFFF9AED & 0x7777) & (0xFFFFFF7F & 0x1FFD);
        b.lIllIIIIIII[194] = 0xFFFFFBFB & 0xFC5;
        b.lIllIIIIIII[195] = -(0xFFFFDFB5 & 0x707B) & (0xFFFFDBFF & 0x7FFD);
        b.lIllIIIIIII[196] = 0x52 ^ 0x5C ^ (0x3C ^ 0x71);
        b.lIllIIIIIII[197] = 0x4A ^ 0x22 ^ (0x36 ^ 0x1A);
        b.lIllIIIIIII[198] = -(0xFFFFD1FD & 0x3E27) & (0xFFFFBBEC & 0x5FFF);
        b.lIllIIIIIII[199] = -(0xFFFFDBE7 & 0x6439) & (0xFFFFFBEE & 0x4FFF);
        b.lIllIIIIIII[200] = 0x25 ^ 0x60;
        b.lIllIIIIIII[201] = 52 + 43 - -32 + 77 ^ 63 + 113 - 173 + 135;
        b.lIllIIIIIII[202] = -(0x78 ^ 0x51) & (0xFFFFAFFF & 0x5BEF);
        b.lIllIIIIIII[203] = 0xFFFFADDD & 0x5F33;
        b.lIllIIIIIII[204] = 0xFFFFBBF7 & 0x4FCB;
        b.lIllIIIIIII[205] = -(0xFFFFF7EF & 0x7AD6) & (0xFFFFFFD7 & Short.MAX_VALUE);
        b.lIllIIIIIII[206] = -(0xFFFFF539 & 0x5AF7) & (0xFFFFDFFF & 0x7BF6);
        b.lIllIIIIIII[207] = 0xFFFFBF93 & 0x4D7C;
        b.lIllIIIIIII[208] = 30 + 158 - -53 + 12 ^ 157 + 18 - 33 + 44;
        b.lIllIIIIIII[209] = 100 + 154 - 160 + 111 ^ 117 + 7 - 69 + 78;
        b.lIllIIIIIII[210] = -(0xFFFFB7BB & 0x5C65) & (0xFFFFBFFF & 0x5FE5);
        b.lIllIIIIIII[211] = -(0xFFFFDEBD & 0x71D3) & (0xFFFFDFF7 & 0x7D9F);
        b.lIllIIIIIII[212] = 0x60 ^ 0x29;
        b.lIllIIIIIII[213] = 0xD9 ^ 0x93;
        b.lIllIIIIIII[214] = -(0x10 ^ 0x14) & (0xFFFFDFE7 & 0x2BDF);
        b.lIllIIIIIII[215] = 0xFFFF8F4F & 0x7DB6;
        b.lIllIIIIIII[216] = -(0xFFFFF7BB & 0x4C67) & (0xFFFFFFEB & 0x4FFF);
        b.lIllIIIIIII[217] = -(0xFFFF8765 & 0x7ABF) & (0xFFFF9F67 & 0x6FBF);
        b.lIllIIIIIII[218] = 0x79 ^ 0x32;
        b.lIllIIIIIII[219] = 0x36 ^ 0x7A;
        b.lIllIIIIIII[220] = 0xFFFFAFEB & 0x5BDE;
        b.lIllIIIIIII[221] = 0xFFFF8D1C & 0x7FE7;
        b.lIllIIIIIII[222] = -(0xFFFFB3AF & 0x7C51) & (0xFFFFBBFB & 0x7FCF);
        b.lIllIIIIIII[223] = -(0xFFFFF7E7 & 0x2C39) & (0xFFFFBFF8 & 0x6FF7);
        b.lIllIIIIIII[224] = 7 + 0 - -77 + 119 ^ 79 + 45 - 38 + 48;
        b.lIllIIIIIII[225] = 42 + 77 - 18 + 35 ^ 9 + 2 - -163 + 24;
        b.lIllIIIIIII[226] = -(0xFFFFFD75 & 0x568B) & (0xFFFFFFD9 & 0x5FF7);
        b.lIllIIIIIII[227] = 0xE0 ^ 0xAF;
        b.lIllIIIIIII[228] = 0xFFFFFF37 & 0x2AFE;
        b.lIllIIIIIII[229] = 0xFFFFEEFF & 0x1B7A;
        b.lIllIIIIIII[230] = 0xFFFFABEF & 0x5EB8;
        b.lIllIIIIIII[231] = 0xFFFFBFFB & 0x4D7F;
        b.lIllIIIIIII[232] = 15 + 66 - 43 + 106 ^ 42 + 86 - 32 + 96;
        b.lIllIIIIIII[233] = 0x50 ^ 1;
        b.lIllIIIIIII[234] = -(0xFFFFC1D3 & 0x7F7F) & (0xFFFFCFFF & 0x7BFB);
        b.lIllIIIIIII[235] = -(2 ^ 0x55) & (0xFFFFDBF7 & 0x2EFF);
        b.lIllIIIIIII[236] = 0xFFFFEDFF & 0x1FA9;
        b.lIllIIIIIII[237] = -(0xFFFFF5D7 & 0x2F7E) & (0xFFFFAFFF & Short.MAX_VALUE);
        b.lIllIIIIIII[238] = 0xFFFFCFEE & 0x3DB3;
        b.lIllIIIIIII[239] = 0x8C ^ 0x80 ^ (0x1D ^ 0x43);
        b.lIllIIIIIII[240] = 0xFE ^ 0xAD;
        b.lIllIIIIIII[241] = 0xFFFF8EE8 & 0x7BB7;
        b.lIllIIIIIII[242] = 0xFFFFFFB5 & 0xDEE;
        b.lIllIIIIIII[243] = 0xFFFFAA97 & 0x5FF9;
        b.lIllIIIIIII[244] = -(0x33 ^ 0x6A) & (0xFFFFEDFF & 0x1FFF);
        b.lIllIIIIIII[245] = 0xFFFF8EBD & 0x7BDB;
        b.lIllIIIIIII[246] = 0x6F ^ 0x3B;
        b.lIllIIIIIII[247] = 0xC3 ^ 0x96;
        b.lIllIIIIIII[248] = -(0xFFFF87FF & 0x7C29) & (0xFFFF9FFF & 0x6EBE);
        b.lIllIIIIIII[249] = -(0xFFFFF7FF & 0x7A5F) & (0xFFFFFFFF & Short.MAX_VALUE);
        b.lIllIIIIIII[250] = -(0xFFFFE86F & 0x77D7) & (0xFFFFFFDF & 0x6DFF);
        b.lIllIIIIIII[251] = -(0xFFFFEFAF & 0x7575) & (0xFFFFFFBF & 0x6FFF);
        b.lIllIIIIIII[252] = 0xFFFF9FBD & 0x6DD7;
        b.lIllIIIIIII[253] = 0x77 ^ 0x3E ^ (5 ^ 0x1A);
        b.lIllIIIIIII[254] = 0x3A ^ 0x5D ^ (0x63 ^ 0x53);
        b.lIllIIIIIII[255] = 0xFFFFCBFD & 0x3E8E;
        b.lIllIIIIIII[256] = -(0xFFFFE7FF & 0x5A69) & (0xFFFFEFFF & 0x5FFB);
        b.lIllIIIIIII[257] = 0xEF ^ 0xA5 ^ (9 ^ 0x1B);
        b.lIllIIIIIII[258] = 0x52 ^ 0xB;
        b.lIllIIIIIII[259] = -(0xFFFFF65F & 0x7BF3) & (0xFFFFFFDF & Short.MAX_VALUE);
        b.lIllIIIIIII[260] = -(0xFFFFF567 & 0x1FF9) & (0xFFFF9FFF & 0x7FEA);
        b.lIllIIIIIII[261] = 0xFFFFDFDE & 0x2AAF;
        b.lIllIIIIIII[262] = 0xFFFFDDDD & 0x2FA6;
        b.lIllIIIIIII[263] = 0x32 ^ 0x68;
        b.lIllIIIIIII[264] = 0x3C ^ 0x3B ^ (0x33 ^ 0x6F);
        b.lIllIIIIIII[265] = -(0xFFFFFF73 & 0x31DD) & (0xFFFFFFFF & 0x3BDF);
        b.lIllIIIIIII[266] = 0xFFFFBF8D & 0x4DF7;
        b.lIllIIIIIII[267] = 0x33 ^ 0x3F ^ (0xC2 ^ 0x92);
        b.lIllIIIIIII[268] = 0xFFFFB6EF & 0x7D3E;
        b.lIllIIIIIII[269] = -(0xFFFFB3F7 & 0x6E8D) & (0xFFFFBFEC & 0x6FDF);
        b.lIllIIIIIII[270] = -(0xFFFFECF7 & 0x17AB) & (0xFFFFAFFF & 0x5FF6);
        b.lIllIIIIIII[271] = 0xA ^ 0x7E ^ (0x3F ^ 0x16);
        b.lIllIIIIIII[272] = 0x9E ^ 0xC0;
        b.lIllIIIIIII[273] = -(0xFFFFB9EB & 0x66F5) & (0xFFFFADF7 & Short.MAX_VALUE);
        b.lIllIIIIIII[274] = 0xFFFF9BB6 & 0x6FDB;
        b.lIllIIIIIII[275] = 0xFFFFCBD9 & 0x3FB7;
        b.lIllIIIIIII[276] = -(0xFFFFF7F7 & 0x4C6E) & (0xFFFFFFFD & 0x4FFF);
        b.lIllIIIIIII[277] = 177 + 144 - 263 + 182 ^ 2 + 71 - -18 + 84;
        b.lIllIIIIIII[278] = 39 + 196 - 128 + 122 ^ 38 + 66 - 34 + 63;
        b.lIllIIIIIII[279] = -(0xFFFFF6D9 & 0x4D67) & (0xFFFFFFFD & 0x4FDF);
        b.lIllIIIIIII[280] = 0xFFFF8DFB & 0x7F1F;
        b.lIllIIIIIII[281] = -(0xFFFFF876 & 0x77DD) & (0xFFFFFFFB & 0x7BF7);
        b.lIllIIIIIII[282] = 0x7B ^ 0x1A;
        b.lIllIIIIIII[283] = 0x3C ^ 0x2C ^ (0x16 ^ 0x64);
        b.lIllIIIIIII[284] = -(0xFFFFF6BF & 0x4BE0) & (0xFFFFDFBF & 0x6FFF);
        b.lIllIIIIIII[285] = -(0xFFFFFCAF & 0x1753) & (0xFFFF9FAB & 0x7FF7);
        b.lIllIIIIIII[286] = -(0xFFFFFAFF & 0x755A) & (0xFFFFFD7F & 0x7FFB);
        b.lIllIIIIIII[287] = 0xFFFF8BAF & 0x7FF3;
        b.lIllIIIIIII[288] = 0x3C ^ 0xB ^ (0x4F ^ 0x1B);
        b.lIllIIIIIII[289] = 0x1A ^ 0xC ^ (9 ^ 0x7B);
        b.lIllIIIIIII[290] = 0xFFFFCF66 & 0x3DBF;
        b.lIllIIIIIII[291] = 0xFFFFCD29 & 0x3FFF;
        b.lIllIIIIIII[292] = -(0xFFFFE6E6 & 0x1D1B) & (0xFFFF9FFF & 0x6F9F);
        b.lIllIIIIIII[293] = 76 + 84 - 98 + 176 ^ 27 + 20 - 41 + 133;
        b.lIllIIIIIII[294] = 0x71 ^ 0x3D ^ (0x6A ^ 0x40);
        b.lIllIIIIIII[295] = 0xFFFF9BBE & 0x6FE7;
        b.lIllIIIIIII[296] = -(0xFFFFFE8B & 0x3375) & (0xFFFFBFFD & 0x7F27);
        b.lIllIIIIIII[297] = 0xFFFFBBFE & 0x4FAB;
        b.lIllIIIIIII[298] = 0xF6 ^ 0x91;
        b.lIllIIIIIII[299] = 62 + 196 - 34 + 2 ^ 74 + 9 - 73 + 128;
        b.lIllIIIIIII[300] = 0xFFFFCFA9 & 0x3BFF;
        b.lIllIIIIIII[301] = 0xFFFFFBF5 & 0xFAF;
        b.lIllIIIIIII[302] = 0x76 ^ 0x10 ^ (0x17 ^ 0x18);
        b.lIllIIIIIII[303] = 0x19 ^ 0x3B ^ (0xCE ^ 0x86);
        b.lIllIIIIIII[304] = 0xFFFFBFBF & 0x4BF3;
        b.lIllIIIIIII[305] = 0xFFFFBFAF & 0x4D7A;
        b.lIllIIIIIII[306] = -(0xFFFF9D2A & 0x72D7) & (0xFFFFDBEF & 0x3FBF);
        b.lIllIIIIIII[307] = 224 + 53 - 143 + 120 ^ 26 + 85 - -20 + 18;
        b.lIllIIIIIII[308] = 66 + 195 - 81 + 17 ^ 91 + 161 - 202 + 119;
        b.lIllIIIIIII[309] = -(0xFFFFBD7B & 0x72A7) & (0xFFFFBD3E & Short.MAX_VALUE);
        b.lIllIIIIIII[310] = 0xFFFFFBBD & 0xFFA;
        b.lIllIIIIIII[311] = -(0xFFFFBCA7 & 0x7759) & (0xFFFFBFBC & Short.MAX_VALUE);
        b.lIllIIIIIII[312] = 0x36 ^ 0x5B;
        b.lIllIIIIIII[313] = 0xD2 ^ 0x9D ^ (0x8E ^ 0xAF);
        b.lIllIIIIIII[314] = 0x34 ^ 0x5B;
        b.lIllIIIIIII[315] = -(0xFFFFCC8B & 0x37F5) & (0xFFFFB6FF & 0x7FDF);
        b.lIllIIIIIII[316] = 0xFFFFBBDF & 0x777F;
        b.lIllIIIIIII[317] = 0xFFFFFAFE & 0x375F;
        b.lIllIIIIIII[318] = 0xFFFFF3FF & 0x3F5E;
        b.lIllIIIIIII[319] = -(0xFFFFDF6B & 0x7397) & (0xFFFFFFFF & 0x5FB7);
        b.lIllIIIIIII[320] = -(0xFFFFFBFF & 0x2403) & (0xFFFFB7DF & Short.MAX_VALUE);
        b.lIllIIIIIII[321] = 43 + 191 - 73 + 76 ^ 142 + 100 - 102 + 17;
        b.lIllIIIIIII[322] = 16 + 63 - -132 + 5 ^ 17 + 88 - 21 + 85;
        b.lIllIIIIIII[323] = -(0xFFFFF7DE & 0x7B33) & (0xFFFFFFF7 & 0x7FDD);
        b.lIllIIIIIII[324] = 0xFFFFBFFF & 0x57E4;
        b.lIllIIIIIII[325] = -(0xFFFFDB0D & 0x67FB) & (0xFFFFCFFE & 0x7FCF);
        b.lIllIIIIIII[326] = 0xFFFF97FD & 0x7FE7;
        b.lIllIIIIIII[327] = 0xE8 ^ 0x9A;
        b.lIllIIIIIII[328] = 51 + 13 - -104 + 74 ^ 71 + 105 - 94 + 47;
        b.lIllIIIIIII[329] = -(0x9C ^ 0xBD) & (0xFFFFB7F6 & 0x5FFF);
        b.lIllIIIIIII[330] = 0xFFFFB7EA & 0x5FF5;
        b.lIllIIIIIII[331] = 81 + 49 - 11 + 116 ^ 21 + 153 - 104 + 89;
        b.lIllIIIIIII[332] = 0xDD ^ 0xA8;
        b.lIllIIIIIII[333] = 0xFFFF9FEA & 0x6CDD;
        b.lIllIIIIIII[334] = -(0xFFFFE4FF & 0x3B27) & (0xFFFFF7FF & 0x3FFF);
        b.lIllIIIIIII[335] = 0xFFFFBDEB & 0x4EDF;
        b.lIllIIIIIII[336] = 0xCD ^ 0xBB;
        b.lIllIIIIIII[337] = 0x6F ^ 0x48 ^ (0x34 ^ 0x64);
        b.lIllIIIIIII[338] = -(0xFFFFFF1B & 0x70FF) & (0xFFFFFDFF & 0x7EDF);
        b.lIllIIIIIII[339] = 0xFFFFBFE3 & 0x57FF;
        b.lIllIIIIIII[340] = 0xFF ^ 0x87;
        b.lIllIIIIIII[341] = 3 ^ 6 ^ (0x4A ^ 0x36);
        b.lIllIIIIIII[342] = -(0xFFFFFB3F & 0x66C1) & (0xFFFFEBDD & 0x7EFF);
        b.lIllIIIIIII[343] = 0xFFFFDD7F & 0x2FBD;
        b.lIllIIIIIII[344] = 0xFFFFE8ED & 0x1FF3;
        b.lIllIIIIIII[345] = -(0xFFFFCB6D & 0x76BF) & (0xFFFFFFEE & 0x4F7F);
        b.lIllIIIIIII[346] = 0xBF ^ 0xC5;
        b.lIllIIIIIII[347] = 116 + 101 - 203 + 178 ^ 108 + 64 - 87 + 102;
        b.lIllIIIIIII[348] = -(0xFFFFFFEF & 0x4611) & (0xFFFFEEDB & 0x5FFD);
        b.lIllIIIIIII[349] = 0xC3 ^ 0xBF;
        b.lIllIIIIIII[350] = 0x5A ^ 0x27;
        b.lIllIIIIIII[351] = -(0xFFFFB2BE & 0x6F53) & (0xFFFFEEFF & 0x3BDF);
        b.lIllIIIIIII[352] = 0xFFFF9F3A & 0x6DFF;
        b.lIllIIIIIII[353] = -(0xFFFFDBFF & 0x2723) & (0xFFFF8FF7 & 0x7BFB);
        b.lIllIIIIIII[354] = -(0xFFFFFED5 & 0x516B) & (0xFFFFFFFE & 0x5D7F);
        b.lIllIIIIIII[355] = 123 + 50 - 82 + 95 ^ 153 + 161 - 310 + 192;
        b.lIllIIIIIII[356] = (0x8B ^ 0x85) + (0x1C ^ 0x25) - -(0x77 ^ 0x50) + (0x76 ^ 0x67);
        b.lIllIIIIIII[357] = 0xFFFFC8FF & 0x3FC3;
        b.lIllIIIIIII[358] = 0xFFFFC8F7 & 0x3FCF;
        b.lIllIIIIIII[359] = (0x46 ^ 0x2B) + (1 ^ 0xA) - (0x84 ^ 0x93) + (0xDC ^ 0xC3);
        b.lIllIIIIIII[360] = (0xB ^ 0x36) + (0x30 ^ 0x6D) - (0x79 ^ 8) + (0xF ^ 0x57);
        b.lIllIIIIIII[361] = -(0xFFFF962D & 0x6DDB) & (0xFFFF8DED & 0x7EDE);
        b.lIllIIIIIII[362] = 0xFFFFEF5F & 0x1DF1;
        b.lIllIIIIIII[363] = (0x2D ^ 0x51) + 2 - -3 + 1;
        b.lIllIIIIIII[364] = (0xB5 ^ 0xC6) + (0xEB ^ 0x8D) - (153 + 95 - 235 + 163) + (0x6A ^ 0x30);
        b.lIllIIIIIII[365] = -(0xFFFF96CD & 0x79B3) & (0xFFFFDDFF & 0x3FCD);
        b.lIllIIIIIII[366] = -(0xFFFFD55B & 0x7FAC) & (0xFFFFFFFF & 0x5DCF);
        b.lIllIIIIIII[367] = 89 + 94 - 112 + 61;
        b.lIllIIIIIII[368] = 1 + (0xE1 ^ 0x82) - -(0 ^ 0x11) + (0x83 ^ 0x93);
        b.lIllIIIIIII[369] = -(0xFFFFEA7B & 0x5795) & (0xFFFFFED9 & 0x4BFF);
        b.lIllIIIIIII[370] = -(0xFFFFBF67 & 0x679B) & (0xFFFFEFCF & 0x3FFF);
        b.lIllIIIIIII[371] = (0xA5 ^ 0xA2) + (0x22 ^ 3) - -(0xD0 ^ 0x83) + (0xB3 ^ 0xB8);
        b.lIllIIIIIII[372] = (0x1F ^ 0x32) + (0x74 ^ 0x19) - (0x5E ^ 0x3C) + (0x5B ^ 0x14);
        b.lIllIIIIIII[373] = 0xFFFF8F5E & 0x7DFF;
        b.lIllIIIIIII[374] = -(0xFFFFE2E7 & 0x3F9F) & (0xFFFFEFF6 & 0x3FFF);
        b.lIllIIIIIII[375] = (0xF8 ^ 0x8C) + (0x39 ^ 0x34) - -1 + (0xBB ^ 0xBD);
        b.lIllIIIIIII[376] = (0xDE ^ 0xA0) + (0x2F ^ 0x77) - (0xEF ^ 0xB7) + (0x86 ^ 0x8D);
        b.lIllIIIIIII[377] = 0xFFFFFAEF & 0xDDF;
        b.lIllIIIIIII[378] = 0xFFFF8FFE & 0x7D45;
        b.lIllIIIIIII[379] = 137 + 88 - 147 + 60;
        b.lIllIIIIIII[380] = 65 + 22 - 77 + 129;
        b.lIllIIIIIII[381] = (0x2E ^ 0xA) + (51 + 96 - 128 + 118) - (0x1D ^ 0x22) + (8 ^ 0x16);
        b.lIllIIIIIII[382] = -(0xFFFFFBC3 & 0x7BD) & (0xFFFFBFFF & 0x6BB9);
        b.lIllIIIIIII[383] = 0xFFFFB93D & 0x6FFB;
        b.lIllIIIIIII[384] = 0xFFFFEF7F & 0x1AF3;
        b.lIllIIIIIII[385] = -(0xFFFFF913 & 0x77ED) & (0xFFFFFFBF & 0x7F7F);
        b.lIllIIIIIII[386] = 0xFFFF8F7C & 0x7ABF;
        b.lIllIIIIIII[387] = -(0xFFFFBFFF & 0x500D) & (0xFFFFBFFD & 0x5E6F);
        b.lIllIIIIIII[388] = 68 + 16 - 33 + 90;
        b.lIllIIIIIII[389] = 59 + 40 - 55 + 98;
        b.lIllIIIIIII[390] = 0xFFFFCEC9 & 0x3B77;
        b.lIllIIIIIII[391] = 0xFFFFFFDE & 0xE7F;
        b.lIllIIIIIII[392] = 0xFFFFFBF7 & 0xE4A;
        b.lIllIIIIIII[393] = 0xFFFFCF5D & 0x3EFE;
        b.lIllIIIIIII[394] = 0xFFFFCF7F & 0x3ABE;
        b.lIllIIIIIII[395] = 0xFFFF8E5B & 0x7FFC;
        b.lIllIIIIIII[396] = (0x50 ^ 0x74) + (0x18 ^ 0x2D) - (0xBF ^ 0xB1) + (0x56 ^ 0x12);
        b.lIllIIIIIII[397] = (0x12 ^ 0x6E) + (0x21 ^ 0x11) - (148 + 69 - 112 + 64) + (49 + 106 - 96 + 82);
        b.lIllIIIIIII[398] = -(0x2C ^ 0x25) & (0xFFFFBE7C & 0x4FDF);
        b.lIllIIIIIII[399] = -(0xFFFF95C1 & 0x7A7F) & (0xFFFFFE77 & 0x1BFF);
        b.lIllIIIIIII[400] = 0xFFFFDE4E & 0x2FFB;
        b.lIllIIIIIII[401] = (0x3A ^ 0x16) + (0x86 ^ 0xBD) - (0x28 ^ 0x15) + (0x21 ^ 0x46);
        b.lIllIIIIIII[402] = 33 + 63 - 41 + 91;
        b.lIllIIIIIII[403] = 0xFFFFDE67 & 0x2FDB;
        b.lIllIIIIIII[404] = 0xFFFFEED5 & 0x1B6F;
        b.lIllIIIIIII[405] = -(0xFFFFF7FD & 0x181B) & (0xFFFFFEDF & 0x1F7F);
        b.lIllIIIIIII[406] = (0x7F ^ 0x54) + (93 + 93 - 165 + 125) - (0xE9 ^ 0x95) + (0x64 ^ 0x36);
        b.lIllIIIIIII[407] = (0x64 ^ 0x20) + (106 + 81 - 115 + 58) - (77 + 72 - 101 + 119) + (0xE1 ^ 0x94);
        b.lIllIIIIIII[408] = 0xFFFFEE5F & 0x1BEF;
        b.lIllIIIIIII[409] = 0xFFFFFE65 & 0xFDF;
        b.lIllIIIIIII[410] = -(0xFFFFF5FF & 0x7F29) & (0xFFFFFFFB & 0x7F7F);
        b.lIllIIIIIII[411] = 0xFFFF8ED5 & 0x7F6B;
        b.lIllIIIIIII[412] = (0x59 ^ 0x76) + (0x39 ^ 0x6A) - (0x9B ^ 0x9F) + (0x84 ^ 0x93);
        b.lIllIIIIIII[413] = (0x24 ^ 0x59) + (134 + 18 - 71 + 62) - (41 + 1 - -23 + 107) + (0x41 ^ 0x77);
        b.lIllIIIIIII[414] = 0xFFFFFFC9 & 0xE7F;
        b.lIllIIIIIII[415] = -(0xFFFFACE2 & 0x733F) & (0xFFFFAE7F & 0x7BFB);
        b.lIllIIIIIII[416] = 0xFFFFCEEF & 0x3F5E;
        b.lIllIIIIIII[417] = (0x86 ^ 0xA0) + (0x6F ^ 1) - (0xD ^ 0x16) + (0xB3 ^ 0xAD);
        b.lIllIIIIIII[418] = 128 + 122 - 173 + 75;
        b.lIllIIIIIII[419] = 0xFFFF8A7F & 0x7FDF;
        b.lIllIIIIIII[420] = -(0xFFFFDD0F & 0x32FD) & (0xFFFFFEDD & 0x1F7F);
        b.lIllIIIIIII[421] = -(0xFFFFFFFB & 0x7595) & (0xFFFFFFF7 & Short.MAX_VALUE);
        b.lIllIIIIIII[422] = 0xFFFFDE65 & 0x2FFF;
        b.lIllIIIIIII[423] = 11 + 89 - 62 + 115;
        b.lIllIIIIIII[424] = 18 + 131 - 11 + 16;
        b.lIllIIIIIII[425] = 80 + 20 - -3 + 52;
        b.lIllIIIIIII[426] = -(0xFFFFC6CF & 0x7FB9) & (0xFFFFEFBB & Short.MAX_VALUE);
        b.lIllIIIIIII[427] = 0xFFFFABD7 & 0x5E7F;
        b.lIllIIIIIII[428] = -(0xFFFFCA47 & 0x77B9) & (0xFFFFEFFF & 0x5EFF);
        b.lIllIIIIIII[429] = 0xFFFFDF77 & 0x2AFF;
        b.lIllIIIIIII[430] = 0xFFFFEFFF & 0x1CD6;
        b.lIllIIIIIII[431] = (0x4C ^ 0x10) + (0x87 ^ 0xC6) - (0x44 ^ 0x63) + (1 ^ 0x27);
        b.lIllIIIIIII[432] = 90 + 71 - 31 + 27;
        b.lIllIIIIIII[433] = 0xFFFFFF7B & 0xAF5;
        b.lIllIIIIIII[434] = 0xFFFFCEE1 & 0x3DFF;
        b.lIllIIIIIII[435] = -(0xFFFFF7DB & 0x9B5) & (0xFFFFDFFE & 0x2BFF);
        b.lIllIIIIIII[436] = -(0xFFFFF3FE & 0x7D13) & (0xFFFFFDFF & Short.MAX_VALUE);
        b.lIllIIIIIII[437] = -(0xFFFFFD3E & 0x32C9) & (0xFFFFFBF7 & 0x3E7F);
        b.lIllIIIIIII[438] = (0x2F ^ 9) + (0x64 ^ 0x49) - -(0x68 ^ 0x2F) + (0x4B ^ 0x4F);
        b.lIllIIIIIII[439] = 88 + 51 - 116 + 136;
        b.lIllIIIIIII[440] = 0xFFFFEF74 & 0x1AEF;
        b.lIllIIIIIII[441] = 0xFFFFEFFB & 0x1CFC;
        b.lIllIIIIIII[442] = -(0xFFFFA5B7 & 0x5FCD) & (0xFFFFDFFF & 0x2FEE);
        b.lIllIIIIIII[443] = -(0xFFFFE68B & 0x7B7F) & (0xFFFFFFFF & 0x6EFE);
        b.lIllIIIIIII[444] = (0x5A ^ 0xD) + (0x60 ^ 0x27) - (0x91 ^ 0x80) + (0xA4 ^ 0xB7);
        b.lIllIIIIIII[445] = 125 + 90 - 87 + 33;
        b.lIllIIIIIII[446] = -(0xFFFFDFED & 0x75B3) & (0xFFFFDFFC & Short.MAX_VALUE);
        b.lIllIIIIIII[447] = 0xFFFFCA7B & 0x3FE5;
        b.lIllIIIIIII[448] = 128 + 101 - 177 + 110;
        b.lIllIIIIIII[449] = (0xF8 ^ 0x8C) + (0x38 ^ 0x57) - (0x7F ^ 0x3C) + 3;
        b.lIllIIIIIII[450] = -(0xFFFFA269 & 0x7F97) & (0xFFFFBEFB & 0x6FF7);
        b.lIllIIIIIII[451] = 0xFFFFFEDE & 0xB7F;
        b.lIllIIIIIII[452] = -(0xFFFFFFBB & 0x7055) & (0xFFFFFCFD & Short.MAX_VALUE);
        b.lIllIIIIIII[453] = (0x21 ^ 0x5C) + (0xF2 ^ 0xBE) - (0x76 ^ 0x4A) + (0xD4 ^ 0xC3);
        b.lIllIIIIIII[454] = (0xA4 ^ 0x9B) + (0xA4 ^ 0xB9) - (0x85 ^ 0xA8) + (0xE1 ^ 0x97);
        b.lIllIIIIIII[455] = 0xFFFFAF7F & 0x5ADD;
        b.lIllIIIIIII[456] = 0xFFFFCDEE & 0x3EFD;
        b.lIllIIIIIII[457] = -(0xFFFFC21B & 0x7DED) & (0xFFFFDDEB & 0x6EFF);
        b.lIllIIIIIII[458] = (0x67 ^ 0x62) + (89 + 40 - 86 + 112) - (142 + 57 - 155 + 102) + (72 + 110 - 91 + 61);
        b.lIllIIIIIII[459] = (0xD7 ^ 0xC5) + (0x94 ^ 0xB7) - -(0x59 ^ 0x3C) + (0x95 ^ 0x98);
        b.lIllIIIIIII[460] = -(0xFFFFCDB7 & 0x724A) & (0xFFFFECE7 & 0x5FFD);
        b.lIllIIIIIII[461] = 0xFFFFEF6F & 0x1AF2;
        b.lIllIIIIIII[462] = -(0xFFFFFD1F & 0x73FD) & (0xFFFFFDFD & 0x7FFE);
        b.lIllIIIIIII[463] = 132 + 83 - 64 + 17;
        b.lIllIIIIIII[464] = (0xE6 ^ 0xC0) + (0x71 ^ 0x2A) - -(0x5C ^ 0x7D) + (0xB5 ^ 0xB2);
        b.lIllIIIIIII[465] = 0xFFFFEF71 & 0x1AEE;
        b.lIllIIIIIII[466] = (0xA1 ^ 0xAB) + (0x2F ^ 0x5D) - -(0x6D ^ 0x48) + (0x57 ^ 0x5E);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public c k() {
        void llllllllllllllllIlIlIlIllIlIlIlI;
        void llllllllllllllllIlIlIlIllIlIIlll;
        Player player = Players.getLocal();
        c c2 = this.obstacles[lIllIIIIIII[1]];
        c[] cArray = this.obstacles;
        int n = cArray.length;
        int llllllllllllllllIlIlIlIllIlIIllI = lIllIIIIIII[1];
        while (b.lIIlIlIIlllIlI(llllllllllllllllIlIlIlIllIlIIllI, (int)llllllllllllllllIlIlIlIllIlIIlll)) {
            void llllllllllllllllIlIlIlIllIlIlIII;
            void llllllllllllllllIlIlIlIllIlIIlIl = llllllllllllllllIlIlIlIllIlIlIII[llllllllllllllllIlIlIlIllIlIIllI];
            if (b.lIIlIlIIlllIll(llllllllllllllllIlIlIlIllIlIIlIl.m().a((Locatable)Players.getLocal()) ? 1 : 0)) {
                return llllllllllllllllIlIlIlIllIlIIlIl;
            }
            ++llllllllllllllllIlIlIlIllIlIIllI;
            0;
            if (1 == 1) continue;
            return null;
        }
        if (b.lIIlIlIIllllII(llllllllllllllllIlIlIlIllIlIlIlI.getWorldLocation().getPlane(), lIllIIIIIII[2])) {
            return null;
        }
        return c2;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static boolean lIIlIlIIlllIll(int n) {
        return n != 0;
    }

    private static String lIIlIlIIIlIIIl(String llllllllllllllllIlIlIlIllIIlIIll, String llllllllllllllllIlIlIlIllIIlIIII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIllIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIllIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIlIllIIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIlIllIIlIlIl.init(lIllIIIIIII[10], llllllllllllllllIlIlIlIllIIlIllI);
            return new String(llllllllllllllllIlIlIlIllIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlIllIIlIlII) {
            llllllllllllllllIlIlIlIllIIlIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIIIllll(String llllllllllllllllIlIlIlIlIllIlllI, String llllllllllllllllIlIlIlIlIllIlIll) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIlIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIlIllIlIll.getBytes(StandardCharsets.UTF_8)), lIllIIIIIII[27]), "DES");
            Cipher llllllllllllllllIlIlIlIlIlllIIII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIlIlIlllIIII.init(lIllIIIIIII[10], llllllllllllllllIlIlIlIlIlllIIIl);
            return new String(llllllllllllllllIlIlIlIlIlllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlIlIllIllll) {
            llllllllllllllllIlIlIlIlIllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlllIlI(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public static b j() {
        b[] bArray = b.values();
        int llllllllllllllllIlIlIlIllIllIlII = bArray.length - lIllIIIIIII[0];
        while (b.lIIlIlIIllIllI(llllllllllllllllIlIlIlIllIllIlII)) {
            void llllllllllllllllIlIlIlIllIllIlIl;
            void llllllllllllllllIlIlIlIllIllIIll = llllllllllllllllIlIlIlIllIllIlIl[llllllllllllllllIlIlIlIllIllIlII];
            if (b.lIIlIlIIllIlll(llllllllllllllllIlIlIlIllIllIIll, (Object)CANIFIS_ROOFTOP) && b.lIIlIlIIlllIII(Quests.isFinished((Quest)Quest.PRIEST_IN_PERIL) ? 1 : 0)) {
                0;
                if (-1 >= 3) {
                    return null;
                }
            } else if (b.lIIlIlIIlllIIl(Skills.getLevel((Skill)Skill.AGILITY), llllllllllllllllIlIlIlIllIllIIll.level)) {
                return llllllllllllllllIlIlIlIllIllIIll;
            }
            --llllllllllllllllIlIlIlIllIllIlII;
            0;
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

    private static String lIIlIlIIIlIIII(String llllllllllllllllIlIlIlIlIllllllI, String llllllllllllllllIlIlIlIllIIIIIlI) {
        llllllllllllllllIlIlIlIlIllllllI = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIlIllIIIIIIl = new StringBuilder();
        char[] llllllllllllllllIlIlIlIllIIIIIII = llllllllllllllllIlIlIlIllIIIIIlI.toCharArray();
        int llllllllllllllllIlIlIlIlIlllllll = lIllIIIIIII[1];
        char[] llllllllllllllllIlIlIlIlIllllIIl = llllllllllllllllIlIlIlIlIllllllI.toCharArray();
        int llllllllllllllllIlIlIlIlIllllIII = llllllllllllllllIlIlIlIlIllllIIl.length;
        int llllllllllllllllIlIlIlIlIlllIlll = lIllIIIIIII[1];
        while (b.lIIlIlIIlllIlI(llllllllllllllllIlIlIlIlIlllIlll, llllllllllllllllIlIlIlIlIllllIII)) {
            char llllllllllllllllIlIlIlIllIIIIlII = llllllllllllllllIlIlIlIlIllllIIl[llllllllllllllllIlIlIlIlIlllIlll];
            llllllllllllllllIlIlIlIllIIIIIIl.append((char)(llllllllllllllllIlIlIlIllIIIIlII ^ llllllllllllllllIlIlIlIllIIIIIII[llllllllllllllllIlIlIlIlIlllllll % llllllllllllllllIlIlIlIllIIIIIII.length]));
            0;
            ++llllllllllllllllIlIlIlIlIlllllll;
            ++llllllllllllllllIlIlIlIlIlllIlll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIlIllIIIIIIl);
    }

    public c[] l() {
        return this.obstacles;
    }

    private static boolean lIIlIlIIlllIII(int n) {
        return n == 0;
    }
}

