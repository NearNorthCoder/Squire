/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import gg.squire.pvm.tasks.PvmManager;
import gg.squire.pvm.tasks.CHelper;

@Singleton
public class AHelper {
    public static final  List<String> q;
    private static final  List<String> t;
    
    private static final  HashMap<String, Integer> s;
    private  boolean u;
    private final  SquireShamanConfig w;
    
    private final  c v;
    public static final  List<String> r;

    private static boolean lIlIllllIlIIllI(int n2) {
        return n2 != 0;
    }

    public boolean AHelper(Item item, TileItem tileItem) {
        boolean bl;
        int n2;
        int n3 = s.get(item.getName()) * item.getQuantity();
        if (a.lIlIllllIlIIIll(n3, n2 = s.get(tileItem.getName()) * tileItem.getQuantity())) {
            bl = lIIllIIIllIlI[0];

            if (-1 >= 1) {
                return false;
            }
        } else {
            bl = lIIllIIIllIlI[1];
        }
        return bl;
    }

    private static boolean lIlIllllIlIIlII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    private static void lIlIllllIlIIIIl() {
        lIIllIIIlIlII = new String[lIIllIIIllIlI[155]];
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[1]] = "Coins";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[0]] = "Lizardman shaman";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[3]] = "Rune platebody";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[4]] = "Rune 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[5]] = "Rune longsword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[6]] = "Rune pickaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[7]] = "Rune kiteshield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[8]] = "Rune med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[9]] = "Mystic earth staff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[10]] = "Rune chainbody";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[11]] = "Rune warhammer";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[12]] = "Earth battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[13]] = "Rune battleaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[2]] = "Rune sq shield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[14]] = "Dragon med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[16]] = "Brimstone key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[17]] = "Broad arrows";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[18]] = "Mystic earth staff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[19]] = "Earth battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[20]] = "Rune med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[21]] = "Rune chainbody";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[22]] = "Rune warhammer";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[23]] = "Dragon warhammer";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[24]] = "Iron ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[25]] = "Coal";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[26]] = "Runite ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[27]] = "Grimy kwuarm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[28]] = "Grimy dwarf weed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[29]] = "Grimy lantadyme";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[30]] = "Grimy cadantine";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[31]] = "Ranarr seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[32]] = "Snapdragon seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[33]] = "Torstol seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[34]] = "Maple seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[35]] = "Yew seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[36]] = "Magic seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[37]] = "Celastrus seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[38]] = "Onyx bolt tips";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[39]] = "Magic logs";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[40]] = "Redwood tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[41]] = "Dragonfruit tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[42]] = "Chaos rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[43]] = "Death rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[44]] = "Uncut ruby";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[45]] = "Uncut diamond";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[46]] = "Chilli potato";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[47]] = "Loop half of key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[48]] = "Tooth half of key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[49]] = "Diamond bolts (e)";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[50]] = "Runite bar";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[51]] = "Nature rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[52]] = "Rune 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[53]] = "Rune battleaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[54]] = "Law rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[55]] = "Rune 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[56]] = "Blood rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[57]] = "Rune sq shield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[58]] = "Dragonstone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[59]] = "Silver ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[60]] = "Coins";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[61]] = "Treasonous ring";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[62]] = "Rune pickaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[63]] = "Rune knife";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[64]] = "Rune kiteshield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[65]] = "Dragon med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[66]] = "Rune spear";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[67]] = "Shield left half";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[68]] = "Dragon spear";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[69]] = "Uncut diamond";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[70]] = "Ring of wealth";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[71]] = "Skills necklace";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[72]] = "Mahogany seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[73]] = "Palm tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[74]] = "Dragon pickaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[75]] = "Dragon 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[76]] = "Red spiders' eggs";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[77]] = "Unicorn horn";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[78]] = "Uncut dragonstone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[79]] = "Grimy snapdragon";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[80]] = "Supercompost";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[81]] = "Cannonball";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[82]] = "Mysterious emblem";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[83]] = "Tanzanite fang";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[84]] = "Magic fang";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[85]] = "Serpentine visage";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[86]] = "Uncut onyx";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[87]] = "Dragon med helm";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[88]] = "Dragon halberd";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[89]] = "Law rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[90]] = "Pure essence";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[91]] = "Toadflax";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[92]] = "Snapdragon";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[93]] = "Dwarf weed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[94]] = "Torstol";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[95]] = "Flax";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[96]] = "Snakeskin";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[97]] = "Dragonstone bolt tips";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[98]] = "Yew logs";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[99]] = "Mahogany logs";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[100]] = "Coal";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[101]] = "Runite ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[102]] = "Calquat tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[103]] = "Palm tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[104]] = "Papaya tree seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[105]] = "Magic seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[106]] = "Toadflax seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[107]] = "Snapdragon seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[108]] = "Dwarf weed seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[109]] = "Torstol seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[110]] = "Crystal seed";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[111]] = "Dragon bones";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[112]] = "Coconut";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[113]] = "Grapes";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[114]] = "Battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[115]] = "Manta ray";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[116]] = "Swamp tar";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[117]] = "Crushed nest";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[118]] = "Adamantite bar";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[119]] = "Uncut sapphire";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[120]] = "Uncut emerald";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[121]] = "Uncut ruby";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[122]] = "Chaos talisman";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[123]] = "Uncut diamond";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[124]] = "Rune javelin";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[125]] = "Loop half of key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[126]] = "Tooth half of key";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[127]] = "Rune spear";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[128]] = "Shield left half";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[129]] = "Dragon spear";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[130]] = "Runite bar";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[131]] = "Dragonstone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[132]] = "Silver ore";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[133]] = "Rune kiteshield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[134]] = "Rune sq shield";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[135]] = "Rune battleaxe";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[136]] = "Rune 2h sword";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[137]] = "Nature rune";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[15]] = "Steel arrow";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[138]] = "Rune arrow";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[139]] = "Adamant javelin";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[140]] = "Rune javelin";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[141]] = "Jar of swamp";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[142]] = "Lizardman fang";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[143]] = "Red d'hide vamb";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[144]] = "Xeric's talisman (inert)";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[145]] = "Ancient shard";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[146]] = "Eternal gem";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[147]] = "Imbued heart";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[148]] = "Mist battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[149]] = "Dust battlestaff";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[150]] = "Long bone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[151]] = "Curved bone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[152]] = "Long bone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[153]] = "Curved bone";
        a.lIIllIIIlIlII[a.lIIllIIIllIlI[154]] = "Chilli potato";
    }

    public boolean m() {
        return this.u;
    }

    static {
        a.lIlIllllIlIIIlI();
        a.lIlIllllIlIIIIl();
        String[] stringArray = new String[lIIllIIIllIlI[2]];
        stringArray[a.lIIllIIIllIlI[1]] = lIIllIIIlIlII[lIIllIIIllIlI[3]];
        stringArray[a.lIIllIIIllIlI[0]] = lIIllIIIlIlII[lIIllIIIllIlI[4]];
        stringArray[a.lIIllIIIllIlI[3]] = lIIllIIIlIlII[lIIllIIIllIlI[5]];
        stringArray[a.lIIllIIIllIlI[4]] = lIIllIIIlIlII[lIIllIIIllIlI[6]];
        stringArray[a.lIIllIIIllIlI[5]] = lIIllIIIlIlII[lIIllIIIllIlI[7]];
        stringArray[a.lIIllIIIllIlI[6]] = lIIllIIIlIlII[lIIllIIIllIlI[8]];
        stringArray[a.lIIllIIIllIlI[7]] = lIIllIIIlIlII[lIIllIIIllIlI[9]];
        stringArray[a.lIIllIIIllIlI[8]] = lIIllIIIlIlII[lIIllIIIllIlI[10]];
        stringArray[a.lIIllIIIllIlI[9]] = lIIllIIIlIlII[lIIllIIIllIlI[11]];
        stringArray[a.lIIllIIIllIlI[10]] = lIIllIIIlIlII[lIIllIIIllIlI[12]];
        stringArray[a.lIIllIIIllIlI[11]] = lIIllIIIlIlII[lIIllIIIllIlI[13]];
        stringArray[a.lIIllIIIllIlI[12]] = lIIllIIIlIlII[lIIllIIIllIlI[2]];
        stringArray[a.lIIllIIIllIlI[13]] = lIIllIIIlIlII[lIIllIIIllIlI[14]];
        q = List.of(stringArray);
        String[] stringArray2 = new String[lIIllIIIllIlI[15]];
        stringArray2[a.lIIllIIIllIlI[1]] = lIIllIIIlIlII[lIIllIIIllIlI[16]];
        stringArray2[a.lIIllIIIllIlI[0]] = lIIllIIIlIlII[lIIllIIIllIlI[17]];
        stringArray2[a.lIIllIIIllIlI[3]] = lIIllIIIlIlII[lIIllIIIllIlI[18]];
        stringArray2[a.lIIllIIIllIlI[4]] = lIIllIIIlIlII[lIIllIIIllIlI[19]];
        stringArray2[a.lIIllIIIllIlI[5]] = lIIllIIIlIlII[lIIllIIIllIlI[20]];
        stringArray2[a.lIIllIIIllIlI[6]] = lIIllIIIlIlII[lIIllIIIllIlI[21]];
        stringArray2[a.lIIllIIIllIlI[7]] = lIIllIIIlIlII[lIIllIIIllIlI[22]];
        stringArray2[a.lIIllIIIllIlI[8]] = lIIllIIIlIlII[lIIllIIIllIlI[23]];
        stringArray2[a.lIIllIIIllIlI[9]] = lIIllIIIlIlII[lIIllIIIllIlI[24]];
        stringArray2[a.lIIllIIIllIlI[10]] = lIIllIIIlIlII[lIIllIIIllIlI[25]];
        stringArray2[a.lIIllIIIllIlI[11]] = lIIllIIIlIlII[lIIllIIIllIlI[26]];
        stringArray2[a.lIIllIIIllIlI[12]] = lIIllIIIlIlII[lIIllIIIllIlI[27]];
        stringArray2[a.lIIllIIIllIlI[13]] = lIIllIIIlIlII[lIIllIIIllIlI[28]];
        stringArray2[a.lIIllIIIllIlI[2]] = lIIllIIIlIlII[lIIllIIIllIlI[29]];
        stringArray2[a.lIIllIIIllIlI[14]] = lIIllIIIlIlII[lIIllIIIllIlI[30]];
        stringArray2[a.lIIllIIIllIlI[16]] = lIIllIIIlIlII[lIIllIIIllIlI[31]];
        stringArray2[a.lIIllIIIllIlI[17]] = lIIllIIIlIlII[lIIllIIIllIlI[32]];
        stringArray2[a.lIIllIIIllIlI[18]] = lIIllIIIlIlII[lIIllIIIllIlI[33]];
        stringArray2[a.lIIllIIIllIlI[19]] = lIIllIIIlIlII[lIIllIIIllIlI[34]];
        stringArray2[a.lIIllIIIllIlI[20]] = lIIllIIIlIlII[lIIllIIIllIlI[35]];
        stringArray2[a.lIIllIIIllIlI[21]] = lIIllIIIlIlII[lIIllIIIllIlI[36]];
        stringArray2[a.lIIllIIIllIlI[22]] = lIIllIIIlIlII[lIIllIIIllIlI[37]];
        stringArray2[a.lIIllIIIllIlI[23]] = lIIllIIIlIlII[lIIllIIIllIlI[38]];
        stringArray2[a.lIIllIIIllIlI[24]] = lIIllIIIlIlII[lIIllIIIllIlI[39]];
        stringArray2[a.lIIllIIIllIlI[25]] = lIIllIIIlIlII[lIIllIIIllIlI[40]];
        stringArray2[a.lIIllIIIllIlI[26]] = lIIllIIIlIlII[lIIllIIIllIlI[41]];
        stringArray2[a.lIIllIIIllIlI[27]] = lIIllIIIlIlII[lIIllIIIllIlI[42]];
        stringArray2[a.lIIllIIIllIlI[28]] = lIIllIIIlIlII[lIIllIIIllIlI[43]];
        stringArray2[a.lIIllIIIllIlI[29]] = lIIllIIIlIlII[lIIllIIIllIlI[44]];
        stringArray2[a.lIIllIIIllIlI[30]] = lIIllIIIlIlII[lIIllIIIllIlI[45]];
        stringArray2[a.lIIllIIIllIlI[31]] = lIIllIIIlIlII[lIIllIIIllIlI[46]];
        stringArray2[a.lIIllIIIllIlI[32]] = lIIllIIIlIlII[lIIllIIIllIlI[47]];
        stringArray2[a.lIIllIIIllIlI[33]] = lIIllIIIlIlII[lIIllIIIllIlI[48]];
        stringArray2[a.lIIllIIIllIlI[34]] = lIIllIIIlIlII[lIIllIIIllIlI[49]];
        stringArray2[a.lIIllIIIllIlI[35]] = lIIllIIIlIlII[lIIllIIIllIlI[50]];
        stringArray2[a.lIIllIIIllIlI[36]] = lIIllIIIlIlII[lIIllIIIllIlI[51]];
        stringArray2[a.lIIllIIIllIlI[37]] = lIIllIIIlIlII[lIIllIIIllIlI[52]];
        stringArray2[a.lIIllIIIllIlI[38]] = lIIllIIIlIlII[lIIllIIIllIlI[53]];
        stringArray2[a.lIIllIIIllIlI[39]] = lIIllIIIlIlII[lIIllIIIllIlI[54]];
        stringArray2[a.lIIllIIIllIlI[40]] = lIIllIIIlIlII[lIIllIIIllIlI[55]];
        stringArray2[a.lIIllIIIllIlI[41]] = lIIllIIIlIlII[lIIllIIIllIlI[56]];
        stringArray2[a.lIIllIIIllIlI[42]] = lIIllIIIlIlII[lIIllIIIllIlI[57]];
        stringArray2[a.lIIllIIIllIlI[43]] = lIIllIIIlIlII[lIIllIIIllIlI[58]];
        stringArray2[a.lIIllIIIllIlI[44]] = lIIllIIIlIlII[lIIllIIIllIlI[59]];
        stringArray2[a.lIIllIIIllIlI[45]] = lIIllIIIlIlII[lIIllIIIllIlI[60]];
        stringArray2[a.lIIllIIIllIlI[46]] = lIIllIIIlIlII[lIIllIIIllIlI[61]];
        stringArray2[a.lIIllIIIllIlI[47]] = lIIllIIIlIlII[lIIllIIIllIlI[62]];
        stringArray2[a.lIIllIIIllIlI[48]] = lIIllIIIlIlII[lIIllIIIllIlI[63]];
        stringArray2[a.lIIllIIIllIlI[49]] = lIIllIIIlIlII[lIIllIIIllIlI[64]];
        stringArray2[a.lIIllIIIllIlI[50]] = lIIllIIIlIlII[lIIllIIIllIlI[65]];
        stringArray2[a.lIIllIIIllIlI[51]] = lIIllIIIlIlII[lIIllIIIllIlI[66]];
        stringArray2[a.lIIllIIIllIlI[52]] = lIIllIIIlIlII[lIIllIIIllIlI[67]];
        stringArray2[a.lIIllIIIllIlI[53]] = lIIllIIIlIlII[lIIllIIIllIlI[68]];
        stringArray2[a.lIIllIIIllIlI[54]] = lIIllIIIlIlII[lIIllIIIllIlI[69]];
        stringArray2[a.lIIllIIIllIlI[55]] = lIIllIIIlIlII[lIIllIIIllIlI[70]];
        stringArray2[a.lIIllIIIllIlI[56]] = lIIllIIIlIlII[lIIllIIIllIlI[71]];
        stringArray2[a.lIIllIIIllIlI[57]] = lIIllIIIlIlII[lIIllIIIllIlI[72]];
        stringArray2[a.lIIllIIIllIlI[58]] = lIIllIIIlIlII[lIIllIIIllIlI[73]];
        stringArray2[a.lIIllIIIllIlI[59]] = lIIllIIIlIlII[lIIllIIIllIlI[74]];
        stringArray2[a.lIIllIIIllIlI[60]] = lIIllIIIlIlII[lIIllIIIllIlI[75]];
        stringArray2[a.lIIllIIIllIlI[61]] = lIIllIIIlIlII[lIIllIIIllIlI[76]];
        stringArray2[a.lIIllIIIllIlI[62]] = lIIllIIIlIlII[lIIllIIIllIlI[77]];
        stringArray2[a.lIIllIIIllIlI[63]] = lIIllIIIlIlII[lIIllIIIllIlI[78]];
        stringArray2[a.lIIllIIIllIlI[64]] = lIIllIIIlIlII[lIIllIIIllIlI[79]];
        stringArray2[a.lIIllIIIllIlI[65]] = lIIllIIIlIlII[lIIllIIIllIlI[80]];
        stringArray2[a.lIIllIIIllIlI[66]] = lIIllIIIlIlII[lIIllIIIllIlI[81]];
        stringArray2[a.lIIllIIIllIlI[67]] = lIIllIIIlIlII[lIIllIIIllIlI[82]];
        stringArray2[a.lIIllIIIllIlI[68]] = lIIllIIIlIlII[lIIllIIIllIlI[83]];
        stringArray2[a.lIIllIIIllIlI[69]] = lIIllIIIlIlII[lIIllIIIllIlI[84]];
        stringArray2[a.lIIllIIIllIlI[70]] = lIIllIIIlIlII[lIIllIIIllIlI[85]];
        stringArray2[a.lIIllIIIllIlI[71]] = lIIllIIIlIlII[lIIllIIIllIlI[86]];
        stringArray2[a.lIIllIIIllIlI[72]] = lIIllIIIlIlII[lIIllIIIllIlI[87]];
        stringArray2[a.lIIllIIIllIlI[73]] = lIIllIIIlIlII[lIIllIIIllIlI[88]];
        stringArray2[a.lIIllIIIllIlI[74]] = lIIllIIIlIlII[lIIllIIIllIlI[89]];
        stringArray2[a.lIIllIIIllIlI[75]] = lIIllIIIlIlII[lIIllIIIllIlI[90]];
        stringArray2[a.lIIllIIIllIlI[76]] = lIIllIIIlIlII[lIIllIIIllIlI[91]];
        stringArray2[a.lIIllIIIllIlI[77]] = lIIllIIIlIlII[lIIllIIIllIlI[92]];
        stringArray2[a.lIIllIIIllIlI[78]] = lIIllIIIlIlII[lIIllIIIllIlI[93]];
        stringArray2[a.lIIllIIIllIlI[79]] = lIIllIIIlIlII[lIIllIIIllIlI[94]];
        stringArray2[a.lIIllIIIllIlI[80]] = lIIllIIIlIlII[lIIllIIIllIlI[95]];
        stringArray2[a.lIIllIIIllIlI[81]] = lIIllIIIlIlII[lIIllIIIllIlI[96]];
        stringArray2[a.lIIllIIIllIlI[82]] = lIIllIIIlIlII[lIIllIIIllIlI[97]];
        stringArray2[a.lIIllIIIllIlI[83]] = lIIllIIIlIlII[lIIllIIIllIlI[98]];
        stringArray2[a.lIIllIIIllIlI[84]] = lIIllIIIlIlII[lIIllIIIllIlI[99]];
        stringArray2[a.lIIllIIIllIlI[85]] = lIIllIIIlIlII[lIIllIIIllIlI[100]];
        stringArray2[a.lIIllIIIllIlI[86]] = lIIllIIIlIlII[lIIllIIIllIlI[101]];
        stringArray2[a.lIIllIIIllIlI[87]] = lIIllIIIlIlII[lIIllIIIllIlI[102]];
        stringArray2[a.lIIllIIIllIlI[88]] = lIIllIIIlIlII[lIIllIIIllIlI[103]];
        stringArray2[a.lIIllIIIllIlI[89]] = lIIllIIIlIlII[lIIllIIIllIlI[104]];
        stringArray2[a.lIIllIIIllIlI[90]] = lIIllIIIlIlII[lIIllIIIllIlI[105]];
        stringArray2[a.lIIllIIIllIlI[91]] = lIIllIIIlIlII[lIIllIIIllIlI[106]];
        stringArray2[a.lIIllIIIllIlI[92]] = lIIllIIIlIlII[lIIllIIIllIlI[107]];
        stringArray2[a.lIIllIIIllIlI[93]] = lIIllIIIlIlII[lIIllIIIllIlI[108]];
        stringArray2[a.lIIllIIIllIlI[94]] = lIIllIIIlIlII[lIIllIIIllIlI[109]];
        stringArray2[a.lIIllIIIllIlI[95]] = lIIllIIIlIlII[lIIllIIIllIlI[110]];
        stringArray2[a.lIIllIIIllIlI[96]] = lIIllIIIlIlII[lIIllIIIllIlI[111]];
        stringArray2[a.lIIllIIIllIlI[97]] = lIIllIIIlIlII[lIIllIIIllIlI[112]];
        stringArray2[a.lIIllIIIllIlI[98]] = lIIllIIIlIlII[lIIllIIIllIlI[113]];
        stringArray2[a.lIIllIIIllIlI[99]] = lIIllIIIlIlII[lIIllIIIllIlI[114]];
        stringArray2[a.lIIllIIIllIlI[100]] = lIIllIIIlIlII[lIIllIIIllIlI[115]];
        stringArray2[a.lIIllIIIllIlI[101]] = lIIllIIIlIlII[lIIllIIIllIlI[116]];
        stringArray2[a.lIIllIIIllIlI[102]] = lIIllIIIlIlII[lIIllIIIllIlI[117]];
        stringArray2[a.lIIllIIIllIlI[103]] = lIIllIIIlIlII[lIIllIIIllIlI[118]];
        stringArray2[a.lIIllIIIllIlI[104]] = lIIllIIIlIlII[lIIllIIIllIlI[119]];
        stringArray2[a.lIIllIIIllIlI[105]] = lIIllIIIlIlII[lIIllIIIllIlI[120]];
        stringArray2[a.lIIllIIIllIlI[106]] = lIIllIIIlIlII[lIIllIIIllIlI[121]];
        stringArray2[a.lIIllIIIllIlI[107]] = lIIllIIIlIlII[lIIllIIIllIlI[122]];
        stringArray2[a.lIIllIIIllIlI[108]] = lIIllIIIlIlII[lIIllIIIllIlI[123]];
        stringArray2[a.lIIllIIIllIlI[109]] = lIIllIIIlIlII[lIIllIIIllIlI[124]];
        stringArray2[a.lIIllIIIllIlI[110]] = lIIllIIIlIlII[lIIllIIIllIlI[125]];
        stringArray2[a.lIIllIIIllIlI[111]] = lIIllIIIlIlII[lIIllIIIllIlI[126]];
        stringArray2[a.lIIllIIIllIlI[112]] = lIIllIIIlIlII[lIIllIIIllIlI[127]];
        stringArray2[a.lIIllIIIllIlI[113]] = lIIllIIIlIlII[lIIllIIIllIlI[128]];
        stringArray2[a.lIIllIIIllIlI[114]] = lIIllIIIlIlII[lIIllIIIllIlI[129]];
        stringArray2[a.lIIllIIIllIlI[115]] = lIIllIIIlIlII[lIIllIIIllIlI[130]];
        stringArray2[a.lIIllIIIllIlI[116]] = lIIllIIIlIlII[lIIllIIIllIlI[131]];
        stringArray2[a.lIIllIIIllIlI[117]] = lIIllIIIlIlII[lIIllIIIllIlI[132]];
        stringArray2[a.lIIllIIIllIlI[118]] = lIIllIIIlIlII[lIIllIIIllIlI[133]];
        stringArray2[a.lIIllIIIllIlI[119]] = lIIllIIIlIlII[lIIllIIIllIlI[134]];
        stringArray2[a.lIIllIIIllIlI[120]] = lIIllIIIlIlII[lIIllIIIllIlI[135]];
        stringArray2[a.lIIllIIIllIlI[121]] = lIIllIIIlIlII[lIIllIIIllIlI[136]];
        stringArray2[a.lIIllIIIllIlI[122]] = lIIllIIIlIlII[lIIllIIIllIlI[137]];
        stringArray2[a.lIIllIIIllIlI[123]] = lIIllIIIlIlII[lIIllIIIllIlI[15]];
        stringArray2[a.lIIllIIIllIlI[124]] = lIIllIIIlIlII[lIIllIIIllIlI[138]];
        stringArray2[a.lIIllIIIllIlI[125]] = lIIllIIIlIlII[lIIllIIIllIlI[139]];
        stringArray2[a.lIIllIIIllIlI[126]] = lIIllIIIlIlII[lIIllIIIllIlI[140]];
        stringArray2[a.lIIllIIIllIlI[127]] = lIIllIIIlIlII[lIIllIIIllIlI[141]];
        stringArray2[a.lIIllIIIllIlI[128]] = lIIllIIIlIlII[lIIllIIIllIlI[142]];
        stringArray2[a.lIIllIIIllIlI[129]] = lIIllIIIlIlII[lIIllIIIllIlI[143]];
        stringArray2[a.lIIllIIIllIlI[130]] = lIIllIIIlIlII[lIIllIIIllIlI[144]];
        stringArray2[a.lIIllIIIllIlI[131]] = lIIllIIIlIlII[lIIllIIIllIlI[145]];
        stringArray2[a.lIIllIIIllIlI[132]] = lIIllIIIlIlII[lIIllIIIllIlI[146]];
        stringArray2[a.lIIllIIIllIlI[133]] = lIIllIIIlIlII[lIIllIIIllIlI[147]];
        stringArray2[a.lIIllIIIllIlI[134]] = lIIllIIIlIlII[lIIllIIIllIlI[148]];
        stringArray2[a.lIIllIIIllIlI[135]] = lIIllIIIlIlII[lIIllIIIllIlI[149]];
        stringArray2[a.lIIllIIIllIlI[136]] = lIIllIIIlIlII[lIIllIIIllIlI[150]];
        stringArray2[a.lIIllIIIllIlI[137]] = lIIllIIIlIlII[lIIllIIIllIlI[151]];
        r = Arrays.asList(stringArray2);
        s = new PvmManager();
        t = List.of(lIIllIIIlIlII[lIIllIIIllIlI[152]], lIIllIIIlIlII[lIIllIIIllIlI[153]], lIIllIIIlIlII[lIIllIIIllIlI[154]]);
    }

    public boolean AHelper(TileItem tileItem) {
        return t.contains(tileItem.getName());
    }

    public void g(boolean bl) {
        this.u = bl;
    }

    private static boolean lIlIllllIlIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllllIlIIlIl(Object object) {
        return object != null;
    }

    public Optional<Item> l() {
        return Inventory.getAll(item -> {
            int n2;
            if (a.lIlIllllIlIIlIl(item.getName()) && a.lIlIllllIlIIllI(s.containsKey(item.getName()) ? 1 : 0)) {
                n2 = lIIllIIIllIlI[0];

                if ((91 + 55 - 94 + 90 ^ 104 + 69 - 69 + 34) == -1) {
                    return ((0x74 ^ 0x37 ^ (0x7F ^ 0x69)) & (139 + 79 - -3 + 0 ^ 69 + 11 - 21 + 77 ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIIIllIlI[1];
            }
            return n2 != 0;
        }).stream().filter(item -> {
            boolean bl;
            if (a.lIlIllllIlIIlII(item.getName().equals(lIIllIIIlIlII[lIIllIIIllIlI[1]]) ? 1 : 0)) {
                bl = lIIllIIIllIlI[0];

                if (3 <= 0) {
                    return ((0x97 ^ 0xB4 ^ (0x7E ^ 0x41)) & (127 + 167 - 268 + 192 ^ 62 + 186 - 160 + 110 ^ -1)) != 0;
                }
            } else {
                bl = lIIllIIIllIlI[1];
            }
            return bl;
        }).min(Comparator.comparingInt(item -> s.get(item.getName()) * item.getQuantity()));
    }

    @Inject
    public AHelper(c c2, SquireShamanConfig squireShamanConfig) {
        this.v = c2;
        this.w = squireShamanConfig;
    }

    private static boolean lIlIllllIlIIlll(Object object) {
        return object == null;
    }

    public Optional<TileItem> k() {
        return TileItems.getAll(tileItem -> {
            int n2;
            if (a.lIlIllllIlIIllI(this.v.t().x().contains(tileItem.getWorldLocation()) ? 1 : 0) && a.lIlIllllIlIIlIl(tileItem.getName()) && a.lIlIllllIlIIllI(r.contains(tileItem.getName()) ? 1 : 0)) {
                n2 = lIIllIIIllIlI[0];

                }
            } else {
                n2 = lIIllIIIllIlI[1];
            }
            return n2 != 0;
        }).stream().filter(tileItem -> {
            boolean bl;
            if (a.lIlIllllIlIIlll(NPCs.getNearest(nPC -> {
                int n2;
                if (a.lIlIllllIlIIllI(nPC.getName().equals(lIIllIIIlIlII[lIIllIIIllIlI[0]]) ? 1 : 0) && a.lIlIllllIlIIllI(nPC.getWorldArea().contains((Locatable)tileItem) ? 1 : 0)) {
                    n2 = lIIllIIIllIlI[0];

                    if (-1 >= 1) {
                        return ((188 + 101 - 105 + 53 ^ 133 + 161 - 241 + 126) & (0x65 ^ 0x61 ^ (0x30 ^ 0x6A) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIIIllIlI[1];
                }
                return n2 != 0;
            }))) {
                bl = lIIllIIIllIlI[0];

                if ((0x78 ^ 0x7C) < (0x23 ^ 0x27)) {
                    return false;
                }
            } else {
                bl = lIIllIIIllIlI[1];
            }
            return bl;
        }).filter(tileItem -> {
            boolean bl;
            if (!a.lIlIllllIlIIlII(this.w.alch() ? 1 : 0) || a.lIlIllllIlIIlII(q.contains(tileItem.getName()) ? 1 : 0)) {
                bl = lIIllIIIllIlI[0];

                if ((0x6D ^ 0x50 ^ (0xA5 ^ 0x9C)) > (0xC5 ^ 0xA0 ^ (0xFD ^ 0x9C))) {
                    return ((0x5A ^ 0x7B ^ (0x6B ^ 0x5A)) & (0x94 ^ 0xC6 ^ (0xE6 ^ 0xA4) ^ -1)) != 0;
                }
            } else {
                bl = lIIllIIIllIlI[1];
            }
            return bl;
        }).max(Comparator.comparingInt(object -> Prices.getItemPrice((int)((TileItem)object).getId()) * ((TileItem)object).getQuantity()).thenComparingDouble(object -> -((TileItem)object).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation())));
    }
}

