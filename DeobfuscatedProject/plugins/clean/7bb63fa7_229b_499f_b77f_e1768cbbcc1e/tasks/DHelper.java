/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.AHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.CHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.EHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.KHelper;
import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.NHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.plugins.logout.Clues;

public class DHelper {

    private static void lIIIllll() {
        lllII = new String[lllll[1194]];
        d.lllII[d.lllll[0]] = "Opening scroll box";
        d.lllII[d.lllll[1]] = "Open";
        d.lllII[d.lllll[5]] = "Lever";
        d.lllII[d.lllll[6]] = "Ardougne";
        d.lllII[d.lllll[7]] = "Lever";
        d.lllII[d.lllll[8]] = "Ardougne";
        d.lllII[d.lllll[10]] = "Dropped valamore clue";
        d.lllII[d.lllll[11]] = "Drop";
        d.lllII[d.lllll[13]] = "Dropped valamore clue";
        d.lllII[d.lllll[14]] = "Drop";
        d.lllII[d.lllll[18]] = "Nav to fally crates";
        d.lllII[d.lllll[19]] = "Searching crates";
        d.lllII[d.lllll[20]] = "Crates";
        d.lllII[d.lllll[21]] = "Search";
        d.lllII[d.lllll[4]] = "Nav to yanille nw crate";
        d.lllII[d.lllll[25]] = "Searching crates";
        d.lllII[d.lllll[26]] = "Search";
        d.lllII[d.lllll[30]] = "Nav to canafis meat crate";
        d.lllII[d.lllll[31]] = "Searching crates";
        d.lllII[d.lllll[32]] = "Search";
        d.lllII[d.lllll[36]] = "Nav to cammy seer crate";
        d.lllII[d.lllll[37]] = "Searching crates";
        d.lllII[d.lllll[38]] = "Search";
        d.lllII[d.lllll[42]] = "Nav to ranging guild nw crates";
        d.lllII[d.lllll[43]] = "Searching crates";
        d.lllII[d.lllll[45]] = "Search";
        d.lllII[d.lllll[49]] = "Nav to hosidius fruit store crates";
        d.lllII[d.lllll[50]] = "Searching crates";
        d.lllII[d.lllll[51]] = "Crates";
        d.lllII[d.lllll[52]] = "Search";
        d.lllII[d.lllll[56]] = "Nav to haviks crates";
        d.lllII[d.lllll[57]] = "Searching crates";
        d.lllII[d.lllll[59]] = "Search";
        d.lllII[d.lllll[63]] = "Nav to hosidus nw crates";
        d.lllII[d.lllll[64]] = "Searching crates";
        d.lllII[d.lllll[65]] = "Crates";
        d.lllII[d.lllll[66]] = "Search";
        d.lllII[d.lllll[70]] = "Nav to rimmington wheelbarrow";
        d.lllII[d.lllll[71]] = "Searching wheelbarrow";
        d.lllII[d.lllll[72]] = "Wheelbarrow";
        d.lllII[d.lllll[73]] = "Search";
        d.lllII[d.lllll[77]] = "Nav to burthrope pub crates";
        d.lllII[d.lllll[78]] = "Searching crates";
        d.lllII[d.lllll[80]] = "Search";
        d.lllII[d.lllll[84]] = "Nav to port khzard gen store crates";
        d.lllII[d.lllll[85]] = "Searching crates";
        d.lllII[d.lllll[86]] = "Crate";
        d.lllII[d.lllll[87]] = "Search";
        d.lllII[d.lllll[91]] = "Nav to ardy church crates";
        d.lllII[d.lllll[92]] = "Searching crates";
        d.lllII[d.lllll[93]] = "Search";
        d.lllII[d.lllll[97]] = "Nav rimmington craftstore crates";
        d.lllII[d.lllll[98]] = "Searching crates";
        d.lllII[d.lllll[99]] = "Crate";
        d.lllII[d.lllll[100]] = "Search";
        d.lllII[d.lllll[104]] = "Nav to barb village crates";
        d.lllII[d.lllll[105]] = "Searching crates";
        d.lllII[d.lllll[106]] = "Crates";
        d.lllII[d.lllll[107]] = "Search";
        d.lllII[d.lllll[109]] = "Nav to fally crates";
        d.lllII[d.lllll[110]] = "Searching crates";
        d.lllII[d.lllll[111]] = "Crates";
        d.lllII[d.lllll[112]] = "Search";
        d.lllII[d.lllll[116]] = "Nav to burthrope nw camp boxes";
        d.lllII[d.lllll[117]] = "Searching boxes";
        d.lllII[d.lllll[118]] = "Boxes";
        d.lllII[d.lllll[119]] = "Search";
        d.lllII[d.lllll[123]] = "Nav to goblin house boxes";
        d.lllII[d.lllll[124]] = "Searching boxes";
        d.lllII[d.lllll[125]] = "Boxes";
        d.lllII[d.lllll[126]] = "Search";
        d.lllII[d.lllll[130]] = "Nav to al kharid silk boxes";
        d.lllII[d.lllll[131]] = "Searching boxes";
        d.lllII[d.lllll[132]] = "Boxes";
        d.lllII[d.lllll[133]] = "Search";
        d.lllII[d.lllll[137]] = "Nav to crystal chest boxes";
        d.lllII[d.lllll[138]] = "Searching boxes";
        d.lllII[d.lllll[139]] = "Boxes";
        d.lllII[d.lllll[140]] = "Search";
        d.lllII[d.lllll[144]] = "Nav to digsite bush";
        d.lllII[d.lllll[145]] = "Searching bush";
        d.lllII[d.lllll[146]] = "Bush";
        d.lllII[d.lllll[147]] = "Search";
        d.lllII[d.lllll[151]] = "Nav to al kharid gem house crate";
        d.lllII[d.lllll[152]] = "Searching crate";
        d.lllII[d.lllll[153]] = "Crate";
        d.lllII[d.lllll[154]] = "Search";
        d.lllII[d.lllll[158]] = "Nav to varrock horviks crates";
        d.lllII[d.lllll[159]] = "Searching crates";
        d.lllII[d.lllll[160]] = "Search";
        d.lllII[d.lllll[163]] = "Nav to lumby s tower crates";
        d.lllII[d.lllll[164]] = "Searching crates";
        d.lllII[d.lllll[165]] = "Crate";
        d.lllII[d.lllll[166]] = "Search";
        d.lllII[d.lllll[169]] = "Nav to taverly sword shop boxes";
        d.lllII[d.lllll[170]] = "Searching boxes";
        d.lllII[d.lllll[171]] = "Boxes";
        d.lllII[d.lllll[172]] = "Search";
        d.lllII[d.lllll[176]] = "Nav to silver merchant boxes";
        d.lllII[d.lllll[177]] = "Searching boxes";
        d.lllII[d.lllll[179]] = "Search";
        d.lllII[d.lllll[183]] = "Nav to sw varrock house boxes";
        d.lllII[d.lllll[184]] = "Searching boxes";
        d.lllII[d.lllll[186]] = "Search";
        d.lllII[d.lllll[190]] = "Nav to dwarven mine pickaxe shop";
        d.lllII[d.lllll[194]] = "Break";
        d.lllII[d.lllll[199]] = "Searching boxes";
        d.lllII[d.lllll[200]] = "Search";
        d.lllII[d.lllll[204]] = "Nav to al kharid palace top chest";
        d.lllII[d.lllll[205]] = "Searching chest";
        d.lllII[d.lllll[206]] = "Open";
        d.lllII[d.lllll[207]] = "Open";
        d.lllII[d.lllll[211]] = "Nav dwarve mine arrow shop chest";
        d.lllII[d.lllll[214]] = "Break";
        d.lllII[d.lllll[215]] = "Searching chest";
        d.lllII[d.lllll[216]] = "Open";
        d.lllII[d.lllll[217]] = "Open";
        d.lllII[d.lllll[221]] = "Nav to camelot castle 2nd chest";
        d.lllII[d.lllll[222]] = "Searching chest";
        d.lllII[d.lllll[223]] = "Open";
        d.lllII[d.lllll[224]] = "Open";
        d.lllII[d.lllll[225]] = "Search";
        d.lllII[d.lllll[226]] = "Search";
        d.lllII[d.lllll[230]] = "Nav to barb village chest";
        d.lllII[d.lllll[231]] = "Searching chest";
        d.lllII[d.lllll[232]] = "Open";
        d.lllII[d.lllll[233]] = "Open";
        d.lllII[d.lllll[237]] = "Nav to aggie house wardrobe";
        d.lllII[d.lllll[238]] = "Searching wardrobe";
        d.lllII[d.lllll[239]] = "Open";
        d.lllII[d.lllll[240]] = "Open";
        d.lllII[d.lllll[244]] = "Nav to edgeville coffin";
        d.lllII[d.lllll[245]] = "Searching coffin";
        d.lllII[d.lllll[246]] = "Open";
        d.lllII[d.lllll[247]] = "Open";
        d.lllII[d.lllll[250]] = "Nav to fally sw house chest";
        d.lllII[d.lllll[251]] = "Searching chest";
        d.lllII[d.lllll[252]] = "Open";
        d.lllII[d.lllll[253]] = "Open";
        d.lllII[d.lllll[256]] = "Nav upstairs port sarmin food chest";
        d.lllII[d.lllll[257]] = "Searching chest";
        d.lllII[d.lllll[258]] = "Open";
        d.lllII[d.lllll[259]] = "Open";
        d.lllII[d.lllll[263]] = "Nav to lumby 1st floor duke chest";
        d.lllII[d.lllll[264]] = "Searching chest";
        d.lllII[d.lllll[265]] = "Open";
        d.lllII[d.lllll[266]] = "Open";
        d.lllII[d.lllll[270]] = "Nav to freds chest";
        d.lllII[d.lllll[271]] = "Searching chest";
        d.lllII[d.lllll[272]] = "Open";
        d.lllII[d.lllll[273]] = "Open";
        d.lllII[d.lllll[274]] = "Search";
        d.lllII[d.lllll[275]] = "Search";
        d.lllII[d.lllll[279]] = "Nav to nw east ardy crate";
        d.lllII[d.lllll[280]] = "Searching crates";
        d.lllII[d.lllll[282]] = "Search";
        d.lllII[d.lllll[286]] = "Nav to taverly small crate";
        d.lllII[d.lllll[287]] = "Searching crates";
        d.lllII[d.lllll[288]] = "Search";
        d.lllII[d.lllll[292]] = "Nav to varrock farming crate";
        d.lllII[d.lllll[293]] = "Searching crates";
        d.lllII[d.lllll[295]] = "Search";
        d.lllII[d.lllll[299]] = "Nav to east bank ardy crate";
        d.lllII[d.lllll[300]] = "Searching crates";
        d.lllII[d.lllll[302]] = "Search";
        d.lllII[d.lllll[306]] = "Nav to s ardy church crate";
        d.lllII[d.lllll[307]] = "Searching crates";
        d.lllII[d.lllll[308]] = "Search";
        d.lllII[d.lllll[311]] = "Nav to varrock castle kitchen";
        d.lllII[d.lllll[312]] = "Searching crate";
        d.lllII[d.lllll[314]] = "Search";
        d.lllII[d.lllll[318]] = "Nav to port sarim fish store";
        d.lllII[d.lllll[319]] = "Searching crate";
        d.lllII[d.lllll[321]] = "Search";
        d.lllII[d.lllll[325]] = "Nav to varrock w bank basement crate";
        d.lllII[d.lllll[326]] = "Searching crate";
        d.lllII[d.lllll[327]] = "Crate";
        d.lllII[d.lllll[328]] = "Search";
        d.lllII[d.lllll[332]] = "Nav to top of draynor manor";
        d.lllII[d.lllll[333]] = "Searching crate";
        d.lllII[d.lllll[335]] = "Search";
        d.lllII[d.lllll[339]] = "Nav to top of fally east house";
        d.lllII[d.lllll[340]] = "Searching crate";
        d.lllII[d.lllll[341]] = "Open";
        d.lllII[d.lllll[342]] = "Crates";
        d.lllII[d.lllll[343]] = "Search";
        d.lllII[d.lllll[347]] = "Nav to monastery bookcase";
        d.lllII[d.lllll[348]] = "Searching bookcase";
        d.lllII[d.lllll[349]] = "Bookcase";
        d.lllII[d.lllll[350]] = "Search";
        d.lllII[d.lllll[353]] = "Nav father urhneys bookcase";
        d.lllII[d.lllll[354]] = "Searching bookcase";
        d.lllII[d.lllll[355]] = "Bookcase";
        d.lllII[d.lllll[356]] = "Search";
        d.lllII[d.lllll[360]] = "Nav to wizard tower bookcase";
        d.lllII[d.lllll[361]] = "Searching bookcase";
        d.lllII[d.lllll[362]] = "Search";
        d.lllII[d.lllll[365]] = "Nav to father urhney lumby swamp bookcase";
        d.lllII[d.lllll[366]] = "Searching bookcase";
        d.lllII[d.lllll[367]] = "Bookcase";
        d.lllII[d.lllll[368]] = "Search";
        d.lllII[d.lllll[372]] = "Nav to taverly drawers";
        d.lllII[d.lllll[373]] = "Searching drawers";
        d.lllII[d.lllll[374]] = "Open";
        d.lllII[d.lllll[375]] = "Drawers";
        d.lllII[d.lllll[376]] = "Open";
        d.lllII[d.lllll[377]] = "Open";
        d.lllII[d.lllll[378]] = "Search";
        d.lllII[d.lllll[379]] = "Search";
        d.lllII[d.lllll[382]] = "Nav to yanille hunting drawers";
        d.lllII[d.lllll[383]] = "Searching drawers";
        d.lllII[d.lllll[384]] = "Drawers";
        d.lllII[d.lllll[385]] = "Open";
        d.lllII[d.lllll[386]] = "Open";
        d.lllII[d.lllll[387]] = "Search";
        d.lllII[d.lllll[388]] = "Search";
        d.lllII[d.lllll[392]] = "Nav to gertrudes drawers";
        d.lllII[d.lllll[393]] = "Searching drawers";
        d.lllII[d.lllll[394]] = "Drawers";
        d.lllII[d.lllll[395]] = "Open";
        d.lllII[d.lllll[396]] = "Open";
        d.lllII[d.lllll[397]] = "Search";
        d.lllII[d.lllll[398]] = "Search";
        d.lllII[d.lllll[402]] = "Nav to ardy castle pub drawers";
        d.lllII[d.lllll[403]] = "Searching drawers";
        d.lllII[d.lllll[404]] = "Drawers";
        d.lllII[d.lllll[405]] = "Open";
        d.lllII[d.lllll[406]] = "Open";
        d.lllII[d.lllll[407]] = "Search";
        d.lllII[d.lllll[408]] = "Search";
        d.lllII[d.lllll[412]] = "Nav to draynor north drawers";
        d.lllII[d.lllll[413]] = "Searching drawers";
        d.lllII[d.lllll[414]] = "Open";
        d.lllII[d.lllll[415]] = "Drawers";
        d.lllII[d.lllll[416]] = "Open";
        d.lllII[d.lllll[417]] = "Open";
        d.lllII[d.lllll[418]] = "Search";
        d.lllII[d.lllll[419]] = "Search";
        d.lllII[d.lllll[422]] = "Nav to betty mage shop drawers";
        d.lllII[d.lllll[423]] = "Searching drawers";
        d.lllII[d.lllll[424]] = "Open";
        d.lllII[d.lllll[425]] = "Open";
        d.lllII[d.lllll[426]] = "Open";
        d.lllII[d.lllll[427]] = "Search";
        d.lllII[d.lllll[428]] = "Search";
        d.lllII[d.lllll[432]] = "Nav to fally south house drawers";
        d.lllII[d.lllll[433]] = "Searching drawers";
        d.lllII[d.lllll[434]] = "Open";
        d.lllII[d.lllll[435]] = "Open";
        d.lllII[d.lllll[436]] = "Search";
        d.lllII[d.lllll[437]] = "Search";
        d.lllII[d.lllll[440]] = "Nav to catherby archery shop drawers";
        d.lllII[d.lllll[441]] = "Searching drawers";
        d.lllII[d.lllll[442]] = "Drawers";
        d.lllII[d.lllll[443]] = "Open";
        d.lllII[d.lllll[444]] = "Open";
        d.lllII[d.lllll[445]] = "Search";
        d.lllII[d.lllll[446]] = "Search";
        d.lllII[d.lllll[448]] = "Nav to varrock clothes upstairs drawers";
        d.lllII[d.lllll[449]] = "Searching drawers";
        d.lllII[d.lllll[450]] = "Drawers";
        d.lllII[d.lllll[451]] = "Open";
        d.lllII[d.lllll[452]] = "Open";
        d.lllII[d.lllll[453]] = "Search";
        d.lllII[d.lllll[454]] = "Search";
        d.lllII[d.lllll[458]] = "Nav to fally shield drawers";
        d.lllII[d.lllll[459]] = "Searching drawers";
        d.lllII[d.lllll[460]] = "Drawers";
        d.lllII[d.lllll[461]] = "Open";
        d.lllII[d.lllll[462]] = "Open";
        d.lllII[d.lllll[463]] = "Search";
        d.lllII[d.lllll[464]] = "Search";
        d.lllII[d.lllll[468]] = "Nav varrock e bank upstairs drawers";
        d.lllII[d.lllll[469]] = "Searching drawers";
        d.lllII[d.lllll[470]] = "Drawers";
        d.lllII[d.lllll[471]] = "Open";
        d.lllII[d.lllll[472]] = "Open";
        d.lllII[d.lllll[473]] = "Search";
        d.lllII[d.lllll[474]] = "Search";
        d.lllII[d.lllll[478]] = "Nav fally chainmail drawers";
        d.lllII[d.lllll[479]] = "Searching drawers";
        d.lllII[d.lllll[480]] = "Open";
        d.lllII[d.lllll[481]] = "Open";
        d.lllII[d.lllll[482]] = "Search";
        d.lllII[d.lllll[483]] = "Search";
        d.lllII[d.lllll[486]] = "Nav to catherby drawers";
        d.lllII[d.lllll[487]] = "Searching drawers";
        d.lllII[d.lllll[488]] = "Drawers";
        d.lllII[d.lllll[489]] = "Open";
        d.lllII[d.lllll[490]] = "Open";
        d.lllII[d.lllll[491]] = "Search";
        d.lllII[d.lllll[492]] = "Search";
        d.lllII[d.lllll[496]] = "Nav to ardy market drawers";
        d.lllII[d.lllll[497]] = "Searching drawers";
        d.lllII[d.lllll[498]] = "Drawers";
        d.lllII[d.lllll[499]] = "Open";
        d.lllII[d.lllll[500]] = "Open";
        d.lllII[d.lllll[501]] = "Search";
        d.lllII[d.lllll[502]] = "Search";
        d.lllII[d.lllll[506]] = "Nav to hosidius south tent drawers";
        d.lllII[d.lllll[507]] = "Searching drawers";
        d.lllII[d.lllll[508]] = "Drawers";
        d.lllII[d.lllll[509]] = "Open";
        d.lllII[d.lllll[510]] = "Open";
        d.lllII[d.lllll[511]] = "Search";
        d.lllII[d.lllll[512]] = "Search";
        d.lllII[d.lllll[515]] = "Nav camelot spin wheel drawers";
        d.lllII[d.lllll[516]] = "Searching drawers";
        d.lllII[d.lllll[517]] = "Drawers";
        d.lllII[d.lllll[518]] = "Open";
        d.lllII[d.lllll[519]] = "Open";
        d.lllII[d.lllll[520]] = "Search";
        d.lllII[d.lllll[521]] = "Search";
        d.lllII[d.lllll[524]] = "Nav to burthrope drawers";
        d.lllII[d.lllll[525]] = "Searching drawers";
        d.lllII[d.lllll[526]] = "Open";
        d.lllII[d.lllll[527]] = "Drawers";
        d.lllII[d.lllll[528]] = "Open";
        d.lllII[d.lllll[529]] = "Open";
        d.lllII[d.lllll[530]] = "Search";
        d.lllII[d.lllll[531]] = "Search";
        d.lllII[d.lllll[534]] = "Nav to rimmington drawers";
        d.lllII[d.lllll[535]] = "Searching drawers";
        d.lllII[d.lllll[536]] = "Drawers";
        d.lllII[d.lllll[537]] = "Open";
        d.lllII[d.lllll[538]] = "Open";
        d.lllII[d.lllll[539]] = "Search";
        d.lllII[d.lllll[540]] = "Search";
        d.lllII[d.lllll[544]] = "Nav to port sarim jail bucket";
        d.lllII[d.lllll[547]] = "Shantay";
        d.lllII[d.lllll[548]] = "Shantay";
        d.lllII[d.lllll[549]] = "Shantay";
        d.lllII[d.lllll[550]] = "What is this place?";
        d.lllII[d.lllll[551]] = "I am definitely an outlaw, prepare to die!";
        d.lllII[d.lllll[552]] = "No thanks, you're not having my money.";
        d.lllII[d.lllll[553]] = "No, do your worst!";
        d.lllII[d.lllll[554]] = "Searching bucket";
        d.lllII[d.lllll[555]] = "Bucket";
        d.lllII[d.lllll[556]] = "Search";
        d.lllII[d.lllll[557]] = "Search";
        d.lllII[d.lllll[561]] = "Wayne";
        d.lllII[d.lllll[562]] = "Nav to Wayne";
        d.lllII[d.lllll[563]] = "Wayne";
        d.lllII[d.lllll[564]] = "Wayne";
        d.lllII[d.lllll[567]] = "Hans";
        d.lllII[d.lllll[568]] = "Nav to Hans";
        d.lllII[d.lllll[569]] = "Hans";
        d.lllII[d.lllll[570]] = "Hans";
        d.lllII[d.lllll[574]] = "Ermin";
        d.lllII[d.lllll[575]] = "Nav to Ermin";
        d.lllII[d.lllll[576]] = "Ermin";
        d.lllII[d.lllll[577]] = "Ermin";
        d.lllII[d.lllll[580]] = "Sir Kay";
        d.lllII[d.lllll[581]] = "Nav to Sir Kay";
        d.lllII[d.lllll[79]] = "Sir Kay";
        d.lllII[d.lllll[301]] = "Sir Kay";
        d.lllII[d.lllll[281]] = "Nav to Squire";
        d.lllII[d.lllll[44]] = "Squire";
        d.lllII[d.lllll[586]] = "Lucy";
        d.lllII[d.lllll[587]] = "Nav to Lucy";
        d.lllII[d.lllll[588]] = "Lucy";
        d.lllII[d.lllll[178]] = "Lucy";
        d.lllII[d.lllll[592]] = "Rusty";
        d.lllII[d.lllll[593]] = "Nav to Rusty";
        d.lllII[d.lllll[594]] = "Rusty";
        d.lllII[d.lllll[595]] = "Rusty";
        d.lllII[d.lllll[598]] = "Doric";
        d.lllII[d.lllll[599]] = "Nav to Doric";
        d.lllII[d.lllll[600]] = "Doric";
        d.lllII[d.lllll[601]] = "Doric";
        d.lllII[d.lllll[605]] = "Charles";
        d.lllII[d.lllll[606]] = "Nav to Charles";
        d.lllII[d.lllll[607]] = "Charles";
        d.lllII[d.lllll[608]] = "Charles";
        d.lllII[d.lllll[611]] = "Arhein";
        d.lllII[d.lllll[612]] = "Nav to Arhein";
        d.lllII[d.lllll[613]] = "Arhein";
        d.lllII[d.lllll[614]] = "Arhein";
        d.lllII[d.lllll[617]] = "Gaius";
        d.lllII[d.lllll[618]] = "Nav to Gaius";
        d.lllII[d.lllll[619]] = "Gaius";
        d.lllII[d.lllll[620]] = "Gaius";
        d.lllII[d.lllll[624]] = "Zeke";
        d.lllII[d.lllll[625]] = "Nav to Zeke";
        d.lllII[d.lllll[626]] = "Zeke";
        d.lllII[d.lllll[627]] = "Zeke";
        d.lllII[d.lllll[631]] = "Nav port sarim Bartender";
        d.lllII[d.lllll[632]] = "Bartender";
        d.lllII[d.lllll[636]] = "Nav varrock Bartender";
        d.lllII[d.lllll[637]] = "Bartender";
        d.lllII[d.lllll[641]] = "Cassie";
        d.lllII[d.lllll[642]] = "Nav to Cassie";
        d.lllII[d.lllll[643]] = "Cassie";
        d.lllII[d.lllll[644]] = "Cassie";
        d.lllII[d.lllll[645]] = "Cassie";
        d.lllII[d.lllll[649]] = "Doomsayer";
        d.lllII[d.lllll[650]] = "Nav to Doomsayer";
        d.lllII[d.lllll[651]] = "Doomsayer";
        d.lllII[d.lllll[652]] = "Doomsayer";
        d.lllII[d.lllll[656]] = "Ali the Leaflet Dropper";
        d.lllII[d.lllll[657]] = "Nav to Ali the Leaflet Dropper";
        d.lllII[d.lllll[658]] = "Ali the Leaflet Dropper";
        d.lllII[d.lllll[659]] = "Ali the Leaflet Dropper";
        d.lllII[d.lllll[662]] = "Sarah";
        d.lllII[d.lllll[663]] = "Nav to Sarah";
        d.lllII[d.lllll[664]] = "Sarah";
        d.lllII[d.lllll[665]] = "Sarah";
        d.lllII[d.lllll[669]] = "The Face";
        d.lllII[d.lllll[670]] = "Nav to The Face";
        d.lllII[d.lllll[671]] = "The Face";
        d.lllII[d.lllll[672]] = "The Face";
        d.lllII[d.lllll[675]] = "Nav to Tool Leprechaun";
        d.lllII[d.lllll[676]] = "Tool Leprechaun";
        d.lllII[d.lllll[680]] = "Tynan";
        d.lllII[d.lllll[681]] = "Nav to Tynan";
        d.lllII[d.lllll[682]] = "Tynan";
        d.lllII[d.lllll[683]] = "Tynan";
        d.lllII[d.lllll[687]] = "Ned";
        d.lllII[d.lllll[688]] = "Nav to Ned";
        d.lllII[d.lllll[689]] = "Ned";
        d.lllII[d.lllll[690]] = "Ned";
        d.lllII[d.lllll[694]] = "Ellis";
        d.lllII[d.lllll[695]] = "Nav to Ellis";
        d.lllII[d.lllll[696]] = "Ellis";
        d.lllII[d.lllll[697]] = "Ellis";
        d.lllII[d.lllll[700]] = "Vannaka";
        d.lllII[d.lllll[701]] = "Nav to Vannaka";
        d.lllII[d.lllll[702]] = "Vannaka";
        d.lllII[d.lllll[703]] = "Vannaka";
        d.lllII[d.lllll[706]] = "Doris";
        d.lllII[d.lllll[707]] = "Nav to Doris";
        d.lllII[d.lllll[708]] = "Doris";
        d.lllII[d.lllll[709]] = "Doris";
        d.lllII[d.lllll[713]] = "Konoo";
        d.lllII[d.lllll[714]] = "Nav to Konoo";
        d.lllII[d.lllll[739]] = "Hopping to find Konoo";
        d.lllII[d.lllll[740]] = "Konoo";
        d.lllII[d.lllll[741]] = "Konoo";
        d.lllII[d.lllll[745]] = "Apothecary";
        d.lllII[d.lllll[746]] = "Nav to Apothecary";
        d.lllII[d.lllll[747]] = "Apothecary";
        d.lllII[d.lllll[748]] = "Apothecary";
        d.lllII[d.lllll[751]] = "Nav to Cook";
        d.lllII[d.lllll[752]] = "Cook";
        d.lllII[d.lllll[756]] = "Jatix";
        d.lllII[d.lllll[757]] = "Nav to Jatix";
        d.lllII[d.lllll[758]] = "Jatix";
        d.lllII[d.lllll[759]] = "Jatix";
        d.lllII[d.lllll[762]] = "Chemist";
        d.lllII[d.lllll[763]] = "Nav to Chemist";
        d.lllII[d.lllll[764]] = "Chemist";
        d.lllII[d.lllll[765]] = "Chemist";
        d.lllII[d.lllll[769]] = "Father Jean";
        d.lllII[d.lllll[770]] = "Nav to Father Jean";
        d.lllII[d.lllll[771]] = "Father Jean";
        d.lllII[d.lllll[772]] = "Father Jean";
        d.lllII[d.lllll[776]] = "Ambassador Spanfipple";
        d.lllII[d.lllll[777]] = "Nav to Ambassador Spanfipple";
        d.lllII[d.lllll[781]] = "Ambassador Spanfipple";
        d.lllII[d.lllll[782]] = "Ambassador Spanfipple";
        d.lllII[d.lllll[786]] = "Louisa";
        d.lllII[d.lllll[787]] = "Nav to Louisa";
        d.lllII[d.lllll[788]] = "Louisa";
        d.lllII[d.lllll[789]] = "Louisa";
        d.lllII[d.lllll[793]] = "Turael";
        d.lllII[d.lllll[794]] = "Nav to Turael";
        d.lllII[d.lllll[795]] = "Turael";
        d.lllII[d.lllll[796]] = "Turael";
        d.lllII[d.lllll[799]] = "The Lady of the Lake";
        d.lllII[d.lllll[800]] = "Nav to Lady of the Lake";
        d.lllII[d.lllll[801]] = "The Lady of the Lake";
        d.lllII[d.lllll[802]] = "The Lady of the Lake";
        d.lllII[d.lllll[806]] = "Herquin";
        d.lllII[d.lllll[807]] = "Nav to Herquin";
        d.lllII[d.lllll[808]] = "Herquin";
        d.lllII[d.lllll[809]] = "Herquin";
        d.lllII[d.lllll[812]] = "Hairdresser";
        d.lllII[d.lllll[813]] = "Nav to Hairdresser";
        d.lllII[d.lllll[814]] = "Hairdresser";
        d.lllII[d.lllll[815]] = "Hairdresser";
        d.lllII[d.lllll[818]] = "Jeed";
        d.lllII[d.lllll[819]] = "Nav to Jeed";
        d.lllII[d.lllll[820]] = "Jeed";
        d.lllII[d.lllll[821]] = "Jeed";
        d.lllII[d.lllll[824]] = "Morgan";
        d.lllII[d.lllll[825]] = "Nav to Morgan";
        d.lllII[d.lllll[826]] = "Morgan";
        d.lllII[d.lllll[827]] = "Morgan";
        d.lllII[d.lllll[831]] = "Captain Tobias";
        d.lllII[d.lllll[832]] = "Nav to Captain Tobias";
        d.lllII[d.lllll[833]] = "Captain Tobias";
        d.lllII[d.lllll[834]] = "Captain Tobias";
        d.lllII[d.lllll[837]] = "Cecilia";
        d.lllII[d.lllll[838]] = "Nav to Cecilia";
        d.lllII[d.lllll[839]] = "Cecilia";
        d.lllII[d.lllll[840]] = "Cecilia";
        d.lllII[d.lllll[841]] = "Vision";
        d.lllII[d.lllll[842]] = "Cecilia";
        d.lllII[d.lllll[843]] = "Yes, I have.";
        d.lllII[d.lllll[844]] = "Yes, I have.";
        d.lllII[d.lllll[845]] = "Cecilia";
        d.lllII[d.lllll[846]] = "Cecilia";
        d.lllII[d.lllll[847]] = "Yes, I have.";
        d.lllII[d.lllll[849]] = "Cecilia";
        d.lllII[d.lllll[850]] = "Nav to Cecilia";
        d.lllII[d.lllll[851]] = "Cecilia";
        d.lllII[d.lllll[852]] = "Cecilia";
        d.lllII[d.lllll[853]] = "Rugged Terrain";
        d.lllII[d.lllll[854]] = "Cecilia";
        d.lllII[d.lllll[855]] = "Yes, I have.";
        d.lllII[d.lllll[856]] = "Yes, I have.";
        d.lllII[d.lllll[857]] = "Cecilia";
        d.lllII[d.lllll[858]] = "Cecilia";
        d.lllII[d.lllll[859]] = "Yes, I have.";
        d.lllII[d.lllll[861]] = "Cecilia";
        d.lllII[d.lllll[862]] = "Nav to Cecilia";
        d.lllII[d.lllll[863]] = "Cecilia";
        d.lllII[d.lllll[864]] = "Cecilia";
        d.lllII[d.lllll[865]] = "The Forlorn Homestead";
        d.lllII[d.lllll[866]] = "Cecilia";
        d.lllII[d.lllll[867]] = "Yes, I have.";
        d.lllII[d.lllll[868]] = "Cecilia";
        d.lllII[d.lllll[869]] = "Cecilia";
        d.lllII[d.lllll[870]] = "Yes, I have.";
        d.lllII[d.lllll[872]] = "Cecilia";
        d.lllII[d.lllll[873]] = "Nav to Cecilia";
        d.lllII[d.lllll[874]] = "Cecilia";
        d.lllII[d.lllll[875]] = "Cecilia";
        d.lllII[d.lllll[876]] = "On the Shore";
        d.lllII[d.lllll[877]] = "Cecilia";
        d.lllII[d.lllll[878]] = "Yes, I have.";
        d.lllII[d.lllll[879]] = "Yes, I have.";
        d.lllII[d.lllll[880]] = "Cecilia";
        d.lllII[d.lllll[881]] = "Cecilia";
        d.lllII[d.lllll[882]] = "Yes, I have.";
        d.lllII[d.lllll[884]] = "Cecilia";
        d.lllII[d.lllll[885]] = "Nav to Cecilia";
        d.lllII[d.lllll[886]] = "Cecilia";
        d.lllII[d.lllll[887]] = "Cecilia";
        d.lllII[d.lllll[888]] = "Alone";
        d.lllII[d.lllll[889]] = "Cecilia";
        d.lllII[d.lllll[890]] = "Yes, I have.";
        d.lllII[d.lllll[891]] = "Yes, I have.";
        d.lllII[d.lllll[892]] = "Cecilia";
        d.lllII[d.lllll[893]] = "Cecilia";
        d.lllII[d.lllll[894]] = "Yes, I have.";
        d.lllII[d.lllll[896]] = "Cecilia";
        d.lllII[d.lllll[897]] = "Nav to Cecilia";
        d.lllII[d.lllll[898]] = "Cecilia";
        d.lllII[d.lllll[899]] = "Cecilia";
        d.lllII[d.lllll[900]] = "Tiptoe";
        d.lllII[d.lllll[901]] = "Cecilia";
        d.lllII[d.lllll[902]] = "Yes, I have.";
        d.lllII[d.lllll[903]] = "Yes, I have.";
        d.lllII[d.lllll[904]] = "Cecilia";
        d.lllII[d.lllll[198]] = "Cecilia";
        d.lllII[d.lllll[197]] = "Yes, I have.";
        d.lllII[d.lllll[911]] = "Nav to top of mill ardy";
        d.lllII[d.lllll[917]] = "Nav to wheat field lumby";
        d.lllII[d.lllll[928]] = "Nav to wizards tower";
        d.lllII[d.lllll[935]] = "Nav to fally party room";
        d.lllII[d.lllll[942]] = "Nav to mudskipper point";
        d.lllII[d.lllll[953]] = "Nav to lumby swamp";
        d.lllII[d.lllll[196]] = "Just enter the shed.";
        d.lllII[d.lllll[958]] = "Nav to fally gem shop, wave";
        d.lllII[d.lllll[963]] = "Nav to pvp arena, bow";
        d.lllII[d.lllll[969]] = "Nav to ardy zoo, raspberry";
        d.lllII[d.lllll[975]] = "Nav to varrock rune store, jig";
        d.lllII[d.lllll[982]] = "Nav to legends guild, bow";
        d.lllII[d.lllll[989]] = "Nav to catherby beehives, jump for joy";
        d.lllII[d.lllll[995]] = "Nav to sinclair mansion, laugh";
        d.lllII[d.lllll[1000]] = "Nav to draynor market, yawn";
        d.lllII[d.lllll[1005]] = "Nav to varrock castle, spin";
        d.lllII[d.lllll[1011]] = "Nav to fishing guild, jig";
        d.lllII[d.lllll[1016]] = "Nav to rimmington, spin";
        d.lllII[d.lllll[1022]] = "Nav to draynor manor, spin";
        d.lllII[d.lllll[1026]] = "Nav to keep le faye, raspberry";
        d.lllII[d.lllll[992]] = "Nav to taverly s tone circle, cheer";
        d.lllII[d.lllll[1035]] = "Nav to burthrope game world, cheer";
        d.lllII[d.lllll[1028]] = "Drop";
        d.lllII[d.lllll[1036]] = "Remove";
        d.lllII[d.lllll[1039]] = "Nav to fish trawler, panic";
        d.lllII[d.lllll[1040]] = "Drop";
        d.lllII[d.lllll[1041]] = "Remove";
        d.lllII[d.lllll[1045]] = "Nav to varrock castle, yawn";
        d.lllII[d.lllll[1051]] = "Nav to draynor village, dance";
        d.lllII[d.lllll[1056]] = "Nav to lumber yard, wave";
        d.lllII[d.lllll[1061]] = "Nav to exam centre, clap";
        d.lllII[d.lllll[1064]] = "Nav to al kharid, headbang";
        d.lllII[d.lllll[1070]] = "Break";
        d.lllII[d.lllll[1071]] = "Nav to port sarim, cheer";
        d.lllII[d.lllll[1077]] = "Nav to rimmington mine, shrug";
        d.lllII[d.lllll[1084]] = "Nav togrand exchange, dance";
        d.lllII[d.lllll[1089]] = "Nav limestone mine panic";
        d.lllII[d.lllll[1093]] = "Nav to east varrock mine";
        d.lllII[d.lllll[1095]] = "Dig";
        d.lllII[d.lllll[1098]] = "Nav to lumby spawn dig";
        d.lllII[d.lllll[1099]] = "Dig";
        d.lllII[d.lllll[1102]] = "Nav to north fally statue dig";
        d.lllII[d.lllll[1103]] = "Dig";
        d.lllII[d.lllll[1106]] = "Nav to champion guild dig";
        d.lllII[d.lllll[1107]] = "Dig";
        d.lllII[d.lllll[1114]] = "Nav to lake molch zeah dig";
        d.lllII[d.lllll[1115]] = "Dig";
        d.lllII[d.lllll[1119]] = "Nav to al khrid mine dig";
        d.lllII[d.lllll[1120]] = "Dig";
        d.lllII[d.lllll[1124]] = "Nav to itchois cabin dig";
        d.lllII[d.lllll[1125]] = "Dig";
        d.lllII[d.lllll[1128]] = "Nav to wizard tower dig";
        d.lllII[d.lllll[1129]] = "Dig";
        d.lllII[d.lllll[1131]] = "Nav to standing stones fally dig";
        d.lllII[d.lllll[1132]] = "Dig";
        d.lllII[d.lllll[1136]] = "Nav to McGrubers wood dig";
        d.lllII[d.lllll[1139]] = "Break";
        d.lllII[d.lllll[1140]] = "Dig";
        d.lllII[d.lllll[1143]] = "Nav to north of fally standing stones";
        d.lllII[d.lllll[1144]] = "Dig";
        d.lllII[d.lllll[1147]] = "Nav to grand tree red mushrooms";
        d.lllII[d.lllll[1148]] = "Dig";
        d.lllII[d.lllll[1151]] = "Nav to great kourend statue";
        d.lllII[d.lllll[1152]] = "Dig";
        d.lllII[d.lllll[1153]] = "Yes, I have.";
        d.lllII[d.lllll[1154]] = "dueling";
        d.lllII[d.lllll[1155]] = "dueling";
        d.lllII[d.lllll[1156]] = "teleport";
        d.lllII[d.lllll[1157]] = "teleport";
        d.lllII[d.lllll[1158]] = "Cook";
        d.lllII[d.lllll[1159]] = "Cook";
        d.lllII[d.lllll[1058]] = "Tool Leprechaun";
        d.lllII[d.lllll[1160]] = "Tool Leprechaun";
        d.lllII[d.lllll[1161]] = "Bartender";
        d.lllII[d.lllll[1162]] = "Bartender";
        d.lllII[d.lllll[1163]] = "Bartender";
        d.lllII[d.lllll[1164]] = "Bartender";
        d.lllII[d.lllll[1165]] = "Door";
        d.lllII[d.lllll[1166]] = "Open";
        d.lllII[d.lllll[1080]] = "Drawers";
        d.lllII[d.lllll[1168]] = "Drawers";
        d.lllII[d.lllll[1043]] = "Drawers";
        d.lllII[d.lllll[1171]] = "Door";
        d.lllII[d.lllll[906]] = "Open";
        d.lllII[d.lllll[1172]] = "Door";
        d.lllII[d.lllll[1014]] = "Open";
        d.lllII[d.lllll[1174]] = "Door";
        d.lllII[d.lllll[1175]] = "Open";
        d.lllII[d.lllll[1176]] = "Bookcase";
        d.lllII[d.lllll[1177]] = "Door";
        d.lllII[d.lllll[1178]] = "Open";
        d.lllII[d.lllll[985]] = "chest";
        d.lllII[d.lllll[1179]] = "chest";
        d.lllII[d.lllll[1180]] = "chest";
        d.lllII[d.lllll[1181]] = "chest";
        d.lllII[d.lllll[1182]] = "Coffin";
        d.lllII[d.lllll[1183]] = "Wardrobe";
        d.lllII[d.lllll[913]] = "chest";
        d.lllII[d.lllll[1184]] = "chest";
        d.lllII[d.lllll[1185]] = "chest";
        d.lllII[d.lllll[1186]] = "chest";
        d.lllII[d.lllll[1013]] = "Crate";
        d.lllII[d.lllll[1187]] = "Crate";
        d.lllII[d.lllll[1188]] = "Crate";
        d.lllII[d.lllll[1190]] = "Scroll box";
        d.lllII[d.lllll[1191]] = "easy";
        d.lllII[d.lllll[1192]] = "Scroll box";
        d.lllII[d.lllll[1193]] = "easy";
    }

    private static boolean lIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Opcode count of 19835 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    public static void r() {
        if (d.lIIlIIIl(Inventory.contains(item -> {
            int n2;
            if (d.lIIlIIIl(item.getName().contains(lllII[lllll[1192]]) ? 1 : 0) && d.lIIlIIIl(item.getName().contains(lllII[lllll[1193]]) ? 1 : 0)) {
                n2 = lllll[1];

            } else {
                n2 = lllll[0];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            Clues.c = lllII[lllll[0]];
            Inventory.getFirst(item -> {
                int n2;
                if (d.lIIlIIIl(item.getName().contains(lllII[lllll[1190]]) ? 1 : 0) && d.lIIlIIIl(item.getName().contains(lllII[lllll[1191]]) ? 1 : 0)) {
                    n2 = lllll[1];

                    if (((0xA9 ^ 0x84) & ~(0x24 ^ 9)) == 2) {
                        return false;
                    }
                } else {
                    n2 = lllll[0];
                }
                return n2 != 0;
            }).interact(lllII[lllll[1]]);
            return;
        }
        if (d.lIIlIIlI(d.s() ? 1 : 0)) {
            e.x();
        }
        if (d.lIIlIIIl(d.s() ? 1 : 0)) {
            TileObject llllIllIIIlIIlI2;
            Object llllIllIIIlIIll;
            TileObject llllIllIIIlIlII;
            WorldArea llllIllIIIlIlIl = new WorldArea(lllll[2], lllll[3], lllll[4], lllll[4], lllll[0]);
            if (d.lIIlIIIl(llllIllIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[5]];
                llllIllIIIlIlII = TileObjects.getNearest((String[])stringArray);
                if (d.lIIlIIll(llllIllIIIlIlII)) {
                    String[] stringArray2 = new String[lllll[1]];
                    stringArray2[d.lllll[0]] = lllII[lllll[6]];
                    if (d.lIIlIIIl(llllIllIIIlIlII.hasAction(stringArray2) ? 1 : 0)) {
                        String[] stringArray3 = new String[lllll[1]];
                        stringArray3[d.lllll[0]] = lllII[lllll[7]];
                        TileObjects.getNearest((String[])stringArray3).interact(lllII[lllll[8]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray = new int[lllll[1]];
            nArray[d.lllll[0]] = lllll[9];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                System.out.println(lllII[lllll[10]]);
                int[] nArray2 = new int[lllll[1]];
                nArray2[d.lllll[0]] = lllll[9];
                Inventory.getFirst((int[])nArray2).interact(lllII[lllll[11]]);
                c.E = lllll[0];
                Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                return;
            }
            int[] nArray3 = new int[lllll[1]];
            nArray3[d.lllll[0]] = lllll[12];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                System.out.println(lllII[lllll[13]]);
                int[] nArray4 = new int[lllll[1]];
                nArray4[d.lllll[0]] = lllll[12];
                Inventory.getFirst((int[])nArray4).interact(lllII[lllll[14]]);
                c.E = lllll[0];
                Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                return;
            }
            int[] nArray5 = new int[lllll[1]];
            nArray5[d.lllll[0]] = lllll[15];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[16], lllll[17], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[18]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[19]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[20]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[21]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray6 = new int[lllll[1]];
            nArray6[d.lllll[0]] = lllll[22];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[23], lllll[24], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[4]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[25]];
                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1188]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[1189], lllll[24], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];

                            if (((28 + 14 - -47 + 71 ^ 101 + 103 - 85 + 38) & (0x15 ^ 6 ^ (0x72 ^ 0x5C) ^ -1)) < 0) {
                                return ((0xD1 ^ 0xB6 ^ (0x6F ^ 0x47)) & (0x79 ^ 0x23 ^ (0x59 ^ 0x4C) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lllll[0];
                        }
                        return n2 != 0;
                    }).interact(lllII[lllll[26]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray7 = new int[lllll[1]];
            nArray7[d.lllll[0]] = lllll[27];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[28], lllll[29], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[30]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[31]];
                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1187]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[33], lllll[29], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];

                            if (3 < 0) {
                                return false;
                            }
                        } else {
                            n2 = lllll[0];
                        }
                        return n2 != 0;
                    }).interact(lllII[lllll[32]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray8 = new int[lllll[1]];
            nArray8[d.lllll[0]] = lllll[33];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[34], lllll[35], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[36]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[37]];
                    TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1013]])).interact(lllII[lllll[38]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray9 = new int[lllll[1]];
            nArray9[d.lllll[0]] = lllll[39];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[40], lllll[41], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[42]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[43]];
                    int[] nArray10 = new int[lllll[1]];
                    nArray10[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray10).interact(lllII[lllll[45]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray11 = new int[lllll[1]];
            nArray11[d.lllll[0]] = lllll[46];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[47], lllll[48], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[49]];
                    k.a((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[50]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[51]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[52]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray12 = new int[lllll[1]];
            nArray12[d.lllll[0]] = lllll[53];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[54], lllll[55], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[56]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[57]];
                    int[] nArray13 = new int[lllll[1]];
                    nArray13[d.lllll[0]] = lllll[58];
                    TileObjects.getNearest((int[])nArray13).interact(lllII[lllll[59]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray14 = new int[lllll[1]];
            nArray14[d.lllll[0]] = lllll[60];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[61], lllll[62], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[63]];
                    k.a((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[64]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[65]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[66]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray15 = new int[lllll[1]];
            nArray15[d.lllll[0]] = lllll[67];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[68], lllll[69], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[70]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[71]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[72]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[73]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray16 = new int[lllll[1]];
            nArray16[d.lllll[0]] = lllll[74];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[75], lllll[76], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[77]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1]) && d.lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Clues.c = lllII[lllll[78]];
                    int[] nArray17 = new int[lllll[1]];
                    nArray17[d.lllll[0]] = lllll[79];
                    TileObjects.getNearest((int[])nArray17).interact(lllII[lllll[80]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray18 = new int[lllll[1]];
            nArray18[d.lllll[0]] = lllll[81];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[82], lllll[83], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[84]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[85]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[86]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[87]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray19 = new int[lllll[1]];
            nArray19[d.lllll[0]] = lllll[88];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[89], lllll[90], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[91]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[92]];
                    int[] nArray20 = new int[lllll[1]];
                    nArray20[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray20).interact(lllII[lllll[93]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray21 = new int[lllll[1]];
            nArray21[d.lllll[0]] = lllll[94];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[95], lllll[96], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[97]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[98]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[99]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[100]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray22 = new int[lllll[1]];
            nArray22[d.lllll[0]] = lllll[101];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[102], lllll[103], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[104]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[105]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[106]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[107]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray23 = new int[lllll[1]];
            nArray23[d.lllll[0]] = lllll[108];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray23) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[16], lllll[17], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[109]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[110]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[111]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[112]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray24 = new int[lllll[1]];
            nArray24[d.lllll[0]] = lllll[113];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[114], lllll[115], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[116]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[117]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[118]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[119]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray25 = new int[lllll[1]];
            nArray25[d.lllll[0]] = lllll[120];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray25) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[121], lllll[122], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[123]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[124]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[125]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[126]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray26 = new int[lllll[1]];
            nArray26[d.lllll[0]] = lllll[127];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray26) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[128], lllll[129], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[130]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[131]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[132]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[133]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray27 = new int[lllll[1]];
            nArray27[d.lllll[0]] = lllll[134];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[135], lllll[136], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[137]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[138]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[139]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[140]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray28 = new int[lllll[1]];
            nArray28[d.lllll[0]] = lllll[141];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray28) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[142], lllll[143], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[144]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1]) && d.lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Clues.c = lllII[lllll[145]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[146]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[147]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray29 = new int[lllll[1]];
            nArray29[d.lllll[0]] = lllll[148];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray29) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[149], lllll[150], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[151]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[152]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[153]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[154]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray30 = new int[lllll[1]];
            nArray30[d.lllll[0]] = lllll[155];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[156], lllll[157], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[158]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[159]];
                    int[] nArray31 = new int[lllll[1]];
                    nArray31[d.lllll[0]] = lllll[58];
                    TileObjects.getNearest((int[])nArray31).interact(lllII[lllll[160]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray32 = new int[lllll[1]];
            nArray32[d.lllll[0]] = lllll[161];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray32) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[156], lllll[162], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[163]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[164]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[165]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[166]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray33 = new int[lllll[1]];
            nArray33[d.lllll[0]] = lllll[167];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray33) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[114], lllll[168], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[169]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[170]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[171]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[172]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray34 = new int[lllll[1]];
            nArray34[d.lllll[0]] = lllll[173];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[174], lllll[175], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[176]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[177]];
                    int[] nArray35 = new int[lllll[1]];
                    nArray35[d.lllll[0]] = lllll[178];
                    TileObjects.getNearest((int[])nArray35).interact(lllII[lllll[179]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray36 = new int[lllll[1]];
            nArray36[d.lllll[0]] = lllll[180];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[181], lllll[182], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[183]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[184]];
                    int[] nArray37 = new int[lllll[1]];
                    nArray37[d.lllll[0]] = lllll[185];
                    TileObjects.getNearest((int[])nArray37).interact(lllII[lllll[186]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray38 = new int[lllll[1]];
            nArray38[d.lllll[0]] = lllll[187];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray38) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[188], lllll[189], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[190]];
                    llllIllIIIlIIll = new WorldArea(lllll[191], lllll[192], lllll[31], lllll[20], lllll[0]);
                    if (d.lIIlIIIl(llllIllIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray39 = new int[lllll[1]];
                        nArray39[d.lllll[0]] = lllll[193];
                        if (d.lIIlIIIl(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                            int[] nArray40 = new int[lllll[1]];
                            nArray40[d.lllll[0]] = lllll[193];
                            Inventory.getFirst((int[])nArray40).interact(lllII[lllll[194]]);
                            Time.sleepUntil(() -> d.c((WorldArea)llllIllIIIlIIll), (int)lllll[195]);

                        }
                        int[] nArray41 = new int[lllll[1]];
                        nArray41[d.lllll[0]] = lllll[193];
                        if (d.lIIlIIlI(Inventory.contains((int[])nArray41) ? 1 : 0)) {
                            int[] nArray42 = new int[lllll[1]];
                            nArray42[d.lllll[0]] = lllll[196];
                            if (d.lIIlIIIl(Inventory.contains((int[])nArray42) ? 1 : 0)) {
                                int[] nArray43 = new int[lllll[1]];
                                nArray43[d.lllll[0]] = lllll[197];
                                if (d.lIIlIIIl(Inventory.contains((int[])nArray43) ? 1 : 0)) {
                                    int[] nArray44 = new int[lllll[1]];
                                    nArray44[d.lllll[0]] = lllll[198];
                                    if (d.lIIlIIIl(Inventory.contains((int[])nArray44) ? 1 : 0)) {
                                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                                        Time.sleepUntil(() -> d.b((WorldArea)llllIllIIIlIIll), (int)lllll[195]);

                                    }
                                }
                            }
                        }
                    }
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5]) && d.lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Clues.c = lllII[lllll[199]];
                    int[] nArray45 = new int[lllll[1]];
                    nArray45[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray45).interact(lllII[lllll[200]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray46 = new int[lllll[1]];
            nArray46[d.lllll[0]] = lllll[201];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray46) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[202], lllll[203], lllll[1]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[204]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[205]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1186]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[206]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[207]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray47 = new int[lllll[1]];
            nArray47[d.lllll[0]] = lllll[208];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray47) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[209], lllll[210], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[211]];
                    llllIllIIIlIIll = new WorldArea(lllll[212], lllll[213], lllll[71], lllll[31], lllll[0]);
                    if (d.lIIlIIIl(llllIllIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (d.lIIlIIlI(Clues.e ? 1 : 0)) {
                            int[] nArray48 = new int[lllll[1]];
                            nArray48[d.lllll[0]] = lllll[193];
                            if (d.lIIlIIIl(Inventory.contains((int[])nArray48) ? 1 : 0)) {
                                int[] nArray49 = new int[lllll[1]];
                                nArray49[d.lllll[0]] = lllll[193];
                                Inventory.getFirst((int[])nArray49).interact(lllII[lllll[214]]);
                                Time.sleepTicks((int)k.c(lllll[10], lllll[11]));

                            }
                        }
                        if (d.lIIlIIIl(Clues.e ? 1 : 0)) {
                            Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                            Time.sleepTicks((int)k.c(lllll[10], lllll[11]));

                        }
                    }
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[215]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1185]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[216]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[217]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray50 = new int[lllll[1]];
            nArray50[d.lllll[0]] = lllll[218];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray50) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[219], lllll[220], lllll[5]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[221]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[222]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1184]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[223]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[224]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                        String[] stringArray4 = new String[lllll[1]];
                        stringArray4[d.lllll[0]] = lllII[lllll[225]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray4) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[226]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray51 = new int[lllll[1]];
            nArray51[d.lllll[0]] = lllll[227];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray51) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[228], lllll[229], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[230]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[231]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[913]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[232]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[233]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray52 = new int[lllll[1]];
            nArray52[d.lllll[0]] = lllll[234];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray52) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[235], lllll[236], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[237]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[238]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1183]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[239]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[240]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray53 = new int[lllll[1]];
            nArray53[d.lllll[0]] = lllll[241];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray53) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[242], lllll[243], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[244]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[245]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1182]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[246]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[247]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray54 = new int[lllll[1]];
            nArray54[d.lllll[0]] = lllll[29];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray54) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[248], lllll[249], lllll[1]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[250]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[251]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1181]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[252]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[253]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray55 = new int[lllll[1]];
            nArray55[d.lllll[0]] = lllll[254];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray55) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[255], lllll[129], lllll[1]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[256]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[257]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1180]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[258]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[259]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray56 = new int[lllll[1]];
            nArray56[d.lllll[0]] = lllll[260];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray56) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[261], lllll[262], lllll[1]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[263]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[264]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1179]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[265]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[266]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray57 = new int[lllll[1]];
            nArray57[d.lllll[0]] = lllll[267];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray57) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[268], lllll[269], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[270]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[271]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[985]]));
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[272]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[273]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                        String[] stringArray5 = new String[lllll[1]];
                        stringArray5[d.lllll[0]] = lllII[lllll[274]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray5) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[275]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));

                        }
                    }
                }
            }
            int[] nArray58 = new int[lllll[1]];
            nArray58[d.lllll[0]] = lllll[276];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray58) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[277], lllll[278], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[279]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[280]];
                    int[] nArray59 = new int[lllll[1]];
                    nArray59[d.lllll[0]] = lllll[281];
                    TileObjects.getNearest((int[])nArray59).interact(lllII[lllll[282]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray60 = new int[lllll[1]];
            nArray60[d.lllll[0]] = lllll[283];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray60) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[284], lllll[285], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[286]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[287]];
                    int[] nArray61 = new int[lllll[1]];
                    nArray61[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray61).interact(lllII[lllll[288]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray62 = new int[lllll[1]];
            nArray62[d.lllll[0]] = lllll[289];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray62) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[290], lllll[291], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[292]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[293]];
                    int[] nArray63 = new int[lllll[1]];
                    nArray63[d.lllll[0]] = lllll[294];
                    TileObjects.getNearest((int[])nArray63).interact(lllII[lllll[295]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray64 = new int[lllll[1]];
            nArray64[d.lllll[0]] = lllll[296];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray64) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[297], lllll[298], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[299]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[300]];
                    int[] nArray65 = new int[lllll[1]];
                    nArray65[d.lllll[0]] = lllll[301];
                    TileObjects.getNearest((int[])nArray65).interact(lllII[lllll[302]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray66 = new int[lllll[1]];
            nArray66[d.lllll[0]] = lllll[303];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray66) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[304], lllll[305], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[306]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[307]];
                    int[] nArray67 = new int[lllll[1]];
                    nArray67[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray67).interact(lllII[lllll[308]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray68 = new int[lllll[1]];
            nArray68[d.lllll[0]] = lllll[309];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray68) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[310], lllll[208], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[311]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[312]];
                    int[] nArray69 = new int[lllll[1]];
                    nArray69[d.lllll[0]] = lllll[313];
                    TileObjects.getNearest((int[])nArray69).interact(lllII[lllll[314]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray70 = new int[lllll[1]];
            nArray70[d.lllll[0]] = lllll[315];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray70) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[316], lllll[317], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[318]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[319]];
                    int[] nArray71 = new int[lllll[1]];
                    nArray71[d.lllll[0]] = lllll[320];
                    TileObjects.getNearest((int[])nArray71).interact(lllII[lllll[321]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray72 = new int[lllll[1]];
            nArray72[d.lllll[0]] = lllll[322];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray72) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[323], lllll[324], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[325]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[326]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[327]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[328]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray73 = new int[lllll[1]];
            nArray73[d.lllll[0]] = lllll[329];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray73) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[330], lllll[331], lllll[5]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[332]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[333]];
                    int[] nArray74 = new int[lllll[1]];
                    nArray74[d.lllll[0]] = lllll[334];
                    TileObjects.getNearest((int[])nArray74).interact(lllII[lllll[335]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray75 = new int[lllll[1]];
            nArray75[d.lllll[0]] = lllll[336];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray75) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[337], lllll[338], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[339]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[340]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1177]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllll[1]];
                            stringArray[d.lllll[0]] = lllII[lllll[1178]];
                            if (d.lIIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && d.lIIlIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllll[337], lllll[338], lllll[0])), lllll[5])) {
                                n2 = lllll[1];

                                if (-(76 + 83 - 66 + 75 ^ 15 + 114 - -40 + 3) <= 0) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lllll[0];
                        return n2 != 0;
                    });
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        llllIllIIIlIIll.interact(lllII[lllll[341]]);
                        Time.sleepTicks((int)lllll[6]);

                    }
                    if (d.lIIlIllI(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[342]];
                        TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[343]]);
                        Time.sleepTicks((int)lllll[6]);

                    }
                }
            }
            int[] nArray76 = new int[lllll[1]];
            nArray76[d.lllll[0]] = lllll[344];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray76) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[345], lllll[346], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[347]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[348]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[349]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[350]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray77 = new int[lllll[1]];
            nArray77[d.lllll[0]] = lllll[351];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray77) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[2], lllll[352], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[353]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[354]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[355]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[356]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray78 = new int[lllll[1]];
            nArray78[d.lllll[0]] = lllll[357];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray78) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[358], lllll[359], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[360]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[361]];
                    TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1176]])).interact(lllII[lllll[362]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray79 = new int[lllll[1]];
            nArray79[d.lllll[0]] = lllll[363];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray79) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[364], lllll[352], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[365]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[366]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[367]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[368]]);
                    Time.sleepTicks((int)lllll[6]);

                }
            }
            int[] nArray80 = new int[lllll[1]];
            nArray80[d.lllll[0]] = lllll[369];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray80) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[370], lllll[371], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[372]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[373]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1174]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllll[1]];
                            stringArray[d.lllll[0]] = lllII[lllll[1175]];
                            if (d.lIIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && d.lIIlIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllll[370], lllll[467], lllll[0])), lllll[5])) {
                                n2 = lllll[1];

                                if (2 >= 0) return n2 != 0;
                                return ((130 + 108 - 155 + 49 ^ 68 + 62 - 105 + 137) & (0x77 ^ 0x5E ^ (0x25 ^ 0x2A) ^ -1)) != 0;
                            }
                        }
                        n2 = lllll[0];
                        return n2 != 0;
                    });
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        llllIllIIIlIIll.interact(lllII[lllll[374]]);
                        Time.sleepTicks((int)lllll[6]);

                    }
                    if (d.lIIlIllI(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[375]];
                        llllIllIIIlIIlI2 = TileObjects.getNearest((String[])stringArray);
                        if (d.lIIlIIll(llllIllIIIlIIlI2)) {
                            String[] stringArray6 = new String[lllll[1]];
                            stringArray6[d.lllll[0]] = lllII[lllll[376]];
                            if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray6) ? 1 : 0)) {
                                llllIllIIIlIIlI2.interact(lllII[lllll[377]]);
                                Time.sleepTicks((int)lllll[6]);

                            }
                            String[] stringArray7 = new String[lllll[1]];
                            stringArray7[d.lllll[0]] = lllII[lllll[378]];
                            if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray7) ? 1 : 0)) {
                                llllIllIIIlIIlI2.interact(lllII[lllll[379]]);
                                Time.sleepTicks((int)lllll[6]);

                            }
                        }
                    }
                }
            }
            int[] nArray81 = new int[lllll[1]];
            nArray81[d.lllll[0]] = lllll[380];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray81) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[381], lllll[228], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[382]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[383]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[384]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray8 = new String[lllll[1]];
                        stringArray8[d.lllll[0]] = lllII[lllll[385]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray8) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[386]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray9 = new String[lllll[1]];
                        stringArray9[d.lllll[0]] = lllII[lllll[387]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray9) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[388]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray82 = new int[lllll[1]];
            nArray82[d.lllll[0]] = lllll[389];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray82) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[390], lllll[391], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[392]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[393]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[394]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray10 = new String[lllll[1]];
                        stringArray10[d.lllll[0]] = lllII[lllll[395]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray10) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[396]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray11 = new String[lllll[1]];
                        stringArray11[d.lllll[0]] = lllII[lllll[397]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray11) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[398]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray83 = new int[lllll[1]];
            nArray83[d.lllll[0]] = lllll[399];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray83) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[400], lllll[401], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[402]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[403]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[404]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray12 = new String[lllll[1]];
                        stringArray12[d.lllll[0]] = lllII[lllll[405]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray12) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[406]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray13 = new String[lllll[1]];
                        stringArray13[d.lllll[0]] = lllII[lllll[407]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray13) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[408]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray84 = new int[lllll[1]];
            nArray84[d.lllll[0]] = lllll[409];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray84) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[410], lllll[411], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[412]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[413]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1172]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllll[1]];
                            stringArray[d.lllll[0]] = lllII[lllll[1014]];
                            if (d.lIIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && d.lIIlIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllll[1173], lllll[692], lllll[0])), lllll[5])) {
                                n2 = lllll[1];

                                if (-1 == -1) return n2 != 0;
                                return ((0xD1 ^ 0xB7 ^ (0x19 ^ 0x5E)) & (0xF0 ^ 0xB1 ^ (0x64 ^ 4) ^ -1)) != 0;
                            }
                        }
                        n2 = lllll[0];
                        return n2 != 0;
                    });
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        llllIllIIIlIIll.interact(lllII[lllll[414]]);
                        Time.sleepTicks((int)lllll[6]);

                    }
                    if (d.lIIlIllI(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[415]];
                        llllIllIIIlIIlI2 = TileObjects.getNearest((String[])stringArray);
                        if (d.lIIlIIll(llllIllIIIlIIlI2)) {
                            String[] stringArray14 = new String[lllll[1]];
                            stringArray14[d.lllll[0]] = lllII[lllll[416]];
                            if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray14) ? 1 : 0)) {
                                llllIllIIIlIIlI2.interact(lllII[lllll[417]]);
                                Time.sleepTicks((int)lllll[6]);

                            }
                            String[] stringArray15 = new String[lllll[1]];
                            stringArray15[d.lllll[0]] = lllII[lllll[418]];
                            if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray15) ? 1 : 0)) {
                                llllIllIIIlIIlI2.interact(lllII[lllll[419]]);
                                Time.sleepTicks((int)lllll[6]);

                            }
                        }
                    }
                }
            }
            int[] nArray85 = new int[lllll[1]];
            nArray85[d.lllll[0]] = lllll[420];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray85) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[421], lllll[236], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[422]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[423]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1171]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllll[1]];
                            stringArray[d.lllll[0]] = lllII[lllll[906]];
                            if (d.lIIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && d.lIIlIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllll[337], lllll[1170], lllll[0])), lllll[5])) {
                                n2 = lllll[1];

                                if (-1 == -1) return n2 != 0;
                                return false;
                            }
                        }
                        n2 = lllll[0];
                        return n2 != 0;
                    });
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        llllIllIIIlIIll.interact(lllII[lllll[424]]);
                        Time.sleepTicks((int)lllll[6]);

                    }
                    if (d.lIIlIllI(llllIllIIIlIIll) && d.lIIlIIll(llllIllIIIlIIlI2 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1043]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[421], lllll[1170], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];

                            if ((108 + 136 - 225 + 121 ^ 54 + 65 - 12 + 30) <= 0) {
                                return ((0xA3 ^ 0xBA ^ (0x73 ^ 0x38)) & (112 + 95 - 197 + 241 ^ 95 + 6 - -45 + 23 ^ -1)) != 0;
                            }
                        } else {
                            n2 = lllll[0];
                        }
                        return n2 != 0;
                    }))) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[425]];
                        if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIlI2.interact(lllII[lllll[426]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray16 = new String[lllll[1]];
                        stringArray16[d.lllll[0]] = lllII[lllll[427]];
                        if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray16) ? 1 : 0)) {
                            llllIllIIIlIIlI2.interact(lllII[lllll[428]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray86 = new int[lllll[1]];
            nArray86[d.lllll[0]] = lllll[429];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray86) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[430], lllll[431], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[432]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[433]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1168]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[430], lllll[1169], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];

                            if (3 < -1) {
                                return false;
                            }
                        } else {
                            n2 = lllll[0];
                        }
                        return n2 != 0;
                    });
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[434]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[435]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray17 = new String[lllll[1]];
                        stringArray17[d.lllll[0]] = lllII[lllll[436]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray17) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[437]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray87 = new int[lllll[1]];
            nArray87[d.lllll[0]] = lllll[34];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray87) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[438], lllll[439], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[440]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[441]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[442]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray18 = new String[lllll[1]];
                        stringArray18[d.lllll[0]] = lllII[lllll[443]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray18) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[444]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray19 = new String[lllll[1]];
                        stringArray19[d.lllll[0]] = lllII[lllll[445]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray19) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[446]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray88 = new int[lllll[1]];
            nArray88[d.lllll[0]] = lllll[447];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray88) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[96], lllll[371], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[448]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[449]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[450]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray20 = new String[lllll[1]];
                        stringArray20[d.lllll[0]] = lllII[lllll[451]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray20) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[452]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray21 = new String[lllll[1]];
                        stringArray21[d.lllll[0]] = lllII[lllll[453]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray21) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[454]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray89 = new int[lllll[1]];
            nArray89[d.lllll[0]] = lllll[455];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray89) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[456], lllll[457], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[458]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[459]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[460]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray22 = new String[lllll[1]];
                        stringArray22[d.lllll[0]] = lllII[lllll[461]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray22) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[462]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray23 = new String[lllll[1]];
                        stringArray23[d.lllll[0]] = lllII[lllll[463]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray23) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[464]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray90 = new int[lllll[1]];
            nArray90[d.lllll[0]] = lllll[465];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray90) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[466], lllll[467], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[468]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[469]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[470]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray24 = new String[lllll[1]];
                        stringArray24[d.lllll[0]] = lllII[lllll[471]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray24) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[472]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray25 = new String[lllll[1]];
                        stringArray25[d.lllll[0]] = lllII[lllll[473]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray25) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[474]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray91 = new int[lllll[1]];
            nArray91[d.lllll[0]] = lllll[475];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray91) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[476], lllll[477], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[478]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[479]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1080]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[532], lllll[477], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];

                            if (3 <= 0) {
                                return false;
                            }
                        } else {
                            n2 = lllll[0];
                        }
                        return n2 != 0;
                    });
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[480]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[481]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray26 = new String[lllll[1]];
                        stringArray26[d.lllll[0]] = lllII[lllll[482]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray26) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[483]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray92 = new int[lllll[1]];
            nArray92[d.lllll[0]] = lllll[484];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray92) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[485], lllll[291], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[486]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[487]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[488]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray27 = new String[lllll[1]];
                        stringArray27[d.lllll[0]] = lllII[lllll[489]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray27) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[490]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray28 = new String[lllll[1]];
                        stringArray28[d.lllll[0]] = lllII[lllll[491]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray28) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[492]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray93 = new int[lllll[1]];
            nArray93[d.lllll[0]] = lllll[493];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray93) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[494], lllll[495], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[496]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[497]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[498]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray29 = new String[lllll[1]];
                        stringArray29[d.lllll[0]] = lllII[lllll[499]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray29) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[500]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray30 = new String[lllll[1]];
                        stringArray30[d.lllll[0]] = lllII[lllll[501]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray30) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[502]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray94 = new int[lllll[1]];
            nArray94[d.lllll[0]] = lllll[503];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray94) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[504], lllll[505], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[506]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[507]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[508]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray31 = new String[lllll[1]];
                        stringArray31[d.lllll[0]] = lllII[lllll[509]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray31) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[510]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray32 = new String[lllll[1]];
                        stringArray32[d.lllll[0]] = lllII[lllll[511]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray32) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[512]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray95 = new int[lllll[1]];
            nArray95[d.lllll[0]] = lllll[28];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray95) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[513], lllll[514], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[515]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[516]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[517]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray33 = new String[lllll[1]];
                        stringArray33[d.lllll[0]] = lllII[lllll[518]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray33) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[519]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray34 = new String[lllll[1]];
                        stringArray34[d.lllll[0]] = lllII[lllll[520]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray34) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[521]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray96 = new int[lllll[1]];
            nArray96[d.lllll[0]] = lllll[505];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray96) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[522], lllll[523], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[524]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[525]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1165]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllll[1]];
                            stringArray[d.lllll[0]] = lllII[lllll[1166]];
                            if (d.lIIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && d.lIIlIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllll[761], lllll[1167], lllll[0])), lllll[5])) {
                                n2 = lllll[1];

                                if (1 >= 0) return n2 != 0;
                                return ((0x41 ^ 0x30 ^ (0xCD ^ 0xA9)) & (5 ^ 0x4B ^ (0x37 ^ 0x6C) ^ -1)) != 0;
                            }
                        }
                        n2 = lllll[0];
                        return n2 != 0;
                    });
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        llllIllIIIlIIll.interact(lllII[lllll[526]]);
                        Time.sleepTicks((int)lllll[6]);

                    }
                    if (d.lIIlIllI(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[527]];
                        llllIllIIIlIIlI2 = TileObjects.getNearest((String[])stringArray);
                        if (d.lIIlIIll(llllIllIIIlIIlI2)) {
                            String[] stringArray35 = new String[lllll[1]];
                            stringArray35[d.lllll[0]] = lllII[lllll[528]];
                            if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray35) ? 1 : 0)) {
                                llllIllIIIlIIlI2.interact(lllII[lllll[529]]);
                                Time.sleepTicks((int)lllll[6]);

                            }
                            String[] stringArray36 = new String[lllll[1]];
                            stringArray36[d.lllll[0]] = lllII[lllll[530]];
                            if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray36) ? 1 : 0)) {
                                llllIllIIIlIIlI2.interact(lllII[lllll[531]]);
                                Time.sleepTicks((int)lllll[6]);

                            }
                        }
                    }
                }
            }
            int[] nArray97 = new int[lllll[1]];
            nArray97[d.lllll[0]] = lllll[220];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray97) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[532], lllll[533], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[534]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[535]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[536]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray37 = new String[lllll[1]];
                        stringArray37[d.lllll[0]] = lllII[lllll[537]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray37) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[538]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                        String[] stringArray38 = new String[lllll[1]];
                        stringArray38[d.lllll[0]] = lllII[lllll[539]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray38) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[540]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray98 = new int[lllll[1]];
            nArray98[d.lllll[0]] = lllll[541];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray98) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldArea(lllll[542], lllll[543], lllll[8], lllll[7], lllll[0]);
                if (d.lIIlIIlI(llllIllIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Clues.c = lllII[lllll[544]];
                    llllIllIIIlIIll = new WorldPoint(lllll[545], lllll[546], lllll[0]);
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[547]];
                    if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                        k.DHelper((WorldPoint)llllIllIIIlIIll);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    String[] stringArray39 = new String[lllll[1]];
                    stringArray39[d.lllll[0]] = lllII[lllll[548]];
                    if (d.lIIlIIll(NPCs.getNearest((String[])stringArray39))) {
                        String[] stringArray40 = new String[lllll[7]];
                        stringArray40[d.lllll[0]] = lllII[lllll[550]];
                        stringArray40[d.lllll[1]] = lllII[lllll[551]];
                        stringArray40[d.lllll[5]] = lllII[lllll[552]];
                        stringArray40[d.lllll[6]] = lllII[lllll[553]];
                        n.a(lllII[lllll[549]], stringArray40, lllll[1]);
                    }
                }
                if (d.lIIlIIIl(llllIllIIIlIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Clues.c = lllII[lllll[554]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[555]];
                    llllIllIIIlIIll = TileObjects.getNearest((String[])stringArray);
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        String[] stringArray41 = new String[lllll[1]];
                        stringArray41[d.lllll[0]] = lllII[lllll[556]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray41) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[557]]);
                            Time.sleepTicks((int)lllll[6]);

                        }
                    }
                }
            }
            int[] nArray99 = new int[lllll[1]];
            nArray99[d.lllll[0]] = lllll[558];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray99) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[559], lllll[560], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[561]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[562]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray42 = new String[lllll[1]];
                stringArray42[d.lllll[0]] = lllII[lllll[563]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray42))) {
                    n.a(lllII[lllll[564]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray100 = new int[lllll[1]];
            nArray100[d.lllll[0]] = lllll[565];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray100) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[566], lllll[317], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[567]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[568]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray43 = new String[lllll[1]];
                stringArray43[d.lllll[0]] = lllII[lllll[569]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray43))) {
                    n.a(lllII[lllll[570]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray101 = new int[lllll[1]];
            nArray101[d.lllll[0]] = lllll[571];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray101) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[572], lllll[573], lllll[1]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[574]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[575]];
                    k.b((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray44 = new String[lllll[1]];
                stringArray44[d.lllll[0]] = lllII[lllll[576]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray44))) {
                    n.a(lllII[lllll[577]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray102 = new int[lllll[1]];
            nArray102[d.lllll[0]] = lllll[578];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray102) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[579], lllll[29], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[580]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[581]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray45 = new String[lllll[1]];
                stringArray45[d.lllll[0]] = lllII[lllll[79]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray45))) {
                    n.a(lllII[lllll[301]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray103 = new int[lllll[1]];
            nArray103[d.lllll[0]] = lllll[582];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray103) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[68], lllll[431], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[10])) {
                    Clues.c = lllII[lllll[281]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[10])) {
                    n.a(lllII[lllll[44]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray104 = new int[lllll[1]];
            nArray104[d.lllll[0]] = lllll[583];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray104) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[584], lllll[585], lllll[1]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[586]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[587]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray46 = new String[lllll[1]];
                stringArray46[d.lllll[0]] = lllII[lllll[588]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray46))) {
                    n.a(lllII[lllll[178]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray105 = new int[lllll[1]];
            nArray105[d.lllll[0]] = lllll[589];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray105) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[590], lllll[591], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[592]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[593]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray47 = new String[lllll[1]];
                stringArray47[d.lllll[0]] = lllII[lllll[594]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray47))) {
                    n.a(lllII[lllll[595]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray106 = new int[lllll[1]];
            nArray106[d.lllll[0]] = lllll[596];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray106) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[597], lllll[136], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[598]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[599]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray48 = new String[lllll[1]];
                stringArray48[d.lllll[0]] = lllII[lllll[600]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray48))) {
                    n.a(lllII[lllll[601]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray107 = new int[lllll[1]];
            nArray107[d.lllll[0]] = lllll[602];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray107) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[603], lllll[604], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[605]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[606]];
                    k.a((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray49 = new String[lllll[1]];
                stringArray49[d.lllll[0]] = lllII[lllll[607]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray49))) {
                    n.a(lllII[lllll[608]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray108 = new int[lllll[1]];
            nArray108[d.lllll[0]] = lllll[609];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray108) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[610], lllll[103], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[611]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[612]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray50 = new String[lllll[1]];
                stringArray50[d.lllll[0]] = lllII[lllll[613]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray50))) {
                    n.a(lllII[lllll[614]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray109 = new int[lllll[1]];
            nArray109[d.lllll[0]] = lllll[615];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray109) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[616], lllll[168], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[617]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[618]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray51 = new String[lllll[1]];
                stringArray51[d.lllll[0]] = lllII[lllll[619]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray51))) {
                    n.a(lllII[lllll[620]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray110 = new int[lllll[1]];
            nArray110[d.lllll[0]] = lllll[621];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray110) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[622], lllll[623], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[624]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[625]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray52 = new String[lllll[1]];
                stringArray52[d.lllll[0]] = lllII[lllll[626]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray52))) {
                    n.a(lllII[lllll[627]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray111 = new int[lllll[1]];
            nArray111[d.lllll[0]] = lllll[628];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray111) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[629], lllll[630], lllll[0]);
                if (d.lIIlIllI(NPCs.getNearest(arg_0 -> d.h((WorldPoint)llllIllIIIlIlII, arg_0)))) {
                    Clues.c = lllII[lllll[631]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIll(NPCs.getNearest(arg_0 -> d.g((WorldPoint)llllIllIIIlIlII, arg_0)))) {
                    n.a(lllII[lllll[632]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray112 = new int[lllll[1]];
            nArray112[d.lllll[0]] = lllll[633];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray112) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[634], lllll[635], lllll[0]);
                if (d.lIIlIllI(NPCs.getNearest(arg_0 -> d.f((WorldPoint)llllIllIIIlIlII, arg_0)))) {
                    Clues.c = lllII[lllll[636]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIll(NPCs.getNearest(arg_0 -> d.e((WorldPoint)llllIllIIIlIlII, arg_0)))) {
                    n.a(lllII[lllll[637]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray113 = new int[lllll[1]];
            nArray113[d.lllll[0]] = lllll[638];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray113) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[639], lllll[640], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[641]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[642]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray53 = new String[lllll[1]];
                stringArray53[d.lllll[0]] = lllII[lllll[643]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray53))) {
                    String[] stringArray54 = new String[lllll[1]];
                    stringArray54[d.lllll[0]] = lllII[lllll[644]];
                    if (d.lIIlIlII(NPCs.getNearest((String[])stringArray54).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllll[8])) {
                        Dialog.close();
                    }
                    n.a(lllII[lllll[645]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray114 = new int[lllll[1]];
            nArray114[d.lllll[0]] = lllll[646];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray114) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[647], lllll[648], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[649]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[650]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray55 = new String[lllll[1]];
                stringArray55[d.lllll[0]] = lllII[lllll[651]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray55))) {
                    n.a(lllII[lllll[652]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray115 = new int[lllll[1]];
            nArray115[d.lllll[0]] = lllll[653];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray115) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[654], lllll[655], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[656]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[657]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray56 = new String[lllll[1]];
                stringArray56[d.lllll[0]] = lllII[lllll[658]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray56))) {
                    n.a(lllII[lllll[659]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray116 = new int[lllll[1]];
            nArray116[d.lllll[0]] = lllll[660];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray116) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[430], lllll[661], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[662]];
                if (!d.lIIlIIll(NPCs.getNearest((String[])stringArray)) || d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[14])) {
                    Clues.c = lllII[lllll[663]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray57 = new String[lllll[1]];
                stringArray57[d.lllll[0]] = lllII[lllll[664]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray57)) && d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[14])) {
                    n.a(lllII[lllll[665]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray117 = new int[lllll[1]];
            nArray117[d.lllll[0]] = lllll[666];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray117) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[667], lllll[668], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[669]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[670]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray58 = new String[lllll[1]];
                stringArray58[d.lllll[0]] = lllII[lllll[671]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray58))) {
                    n.a(lllII[lllll[672]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray118 = new int[lllll[1]];
            nArray118[d.lllll[0]] = lllll[673];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray118) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[235], lllll[674], lllll[0]);
                if (d.lIIlIllI(NPCs.getNearest(arg_0 -> d.DHelper((WorldPoint)llllIllIIIlIlII, arg_0)))) {
                    Clues.c = lllII[lllll[675]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIll(NPCs.getNearest(arg_0 -> d.c((WorldPoint)llllIllIIIlIlII, arg_0)))) {
                    n.a(lllII[lllll[676]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray119 = new int[lllll[1]];
            nArray119[d.lllll[0]] = lllll[677];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray119) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[678], lllll[679], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[680]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[681]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray59 = new String[lllll[1]];
                stringArray59[d.lllll[0]] = lllII[lllll[682]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray59))) {
                    n.a(lllII[lllll[683]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray120 = new int[lllll[1]];
            nArray120[d.lllll[0]] = lllll[684];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray120) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[685], lllll[686], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[687]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[688]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray60 = new String[lllll[1]];
                stringArray60[d.lllll[0]] = lllII[lllll[689]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray60))) {
                    n.a(lllII[lllll[690]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray121 = new int[lllll[1]];
            nArray121[d.lllll[0]] = lllll[691];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray121) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[692], lllll[693], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[694]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[695]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray61 = new String[lllll[1]];
                stringArray61[d.lllll[0]] = lllII[lllll[696]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray61))) {
                    n.a(lllII[lllll[697]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray122 = new int[lllll[1]];
            nArray122[d.lllll[0]] = lllll[698];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray122) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[364], lllll[699], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[700]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[701]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray62 = new String[lllll[1]];
                stringArray62[d.lllll[0]] = lllII[lllll[702]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray62))) {
                    n.a(lllII[lllll[703]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray123 = new int[lllll[1]];
            nArray123[d.lllll[0]] = lllll[704];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray123) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[705], lllll[208], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[706]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[707]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray63 = new String[lllll[1]];
                stringArray63[d.lllll[0]] = lllII[lllll[708]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray63))) {
                    n.a(lllII[lllll[709]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray124 = new int[lllll[1]];
            nArray124[d.lllll[0]] = lllll[710];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray124) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[711], lllll[712], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[713]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[714]];
                    llllIllIIIlIIll = new WorldArea(lllll[191], lllll[192], lllll[31], lllll[20], lllll[0]);
                    if (d.lIIlIIIl(llllIllIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        llllIllIIIlIIlI2 = new WorldPoint(lllll[715], lllll[604], lllll[0]);
                        k.c((WorldPoint)llllIllIIIlIIlI2);
                        Time.sleepTicks((int)k.c(lllll[7], lllll[10]));

                    }
                    if (d.lIIlIIIl((llllIllIIIlIIlI2 = new WorldArea(lllll[716], lllll[717], lllll[51], lllll[91], lllll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArray = new WorldPoint[lllll[4]];
                        worldPointArray[d.lllll[0]] = new WorldPoint(lllll[718], lllll[719], lllll[0]);
                        worldPointArray[d.lllll[1]] = new WorldPoint(lllll[720], lllll[721], lllll[0]);
                        worldPointArray[d.lllll[5]] = new WorldPoint(lllll[722], lllll[723], lllll[0]);
                        worldPointArray[d.lllll[6]] = new WorldPoint(lllll[722], lllll[724], lllll[0]);
                        worldPointArray[d.lllll[7]] = new WorldPoint(lllll[725], lllll[726], lllll[0]);
                        worldPointArray[d.lllll[8]] = new WorldPoint(lllll[727], lllll[728], lllll[0]);
                        worldPointArray[d.lllll[10]] = new WorldPoint(lllll[729], lllll[730], lllll[0]);
                        worldPointArray[d.lllll[11]] = new WorldPoint(lllll[729], lllll[731], lllll[0]);
                        worldPointArray[d.lllll[13]] = new WorldPoint(lllll[729], lllll[732], lllll[0]);
                        worldPointArray[d.lllll[14]] = new WorldPoint(lllll[733], lllll[113], lllll[0]);
                        worldPointArray[d.lllll[18]] = new WorldPoint(lllll[734], lllll[113], lllll[0]);
                        worldPointArray[d.lllll[19]] = new WorldPoint(lllll[735], lllll[731], lllll[0]);
                        worldPointArray[d.lllll[20]] = new WorldPoint(lllll[736], lllll[717], lllll[0]);
                        worldPointArray[d.lllll[21]] = new WorldPoint(lllll[737], lllll[738], lllll[0]);
                        WorldPoint[] llllIllIIIlIIIl = worldPointArray;
                        Walker.walkAlong(Arrays.asList(llllIllIIIlIIIl), new HashMap());

                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIlI(llllIllIIIlIIlI2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        k.a((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[25]) && d.lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                        Clues.c = lllII[lllll[739]];
                        k.ao();
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
                String[] stringArray64 = new String[lllll[1]];
                stringArray64[d.lllll[0]] = lllII[lllll[740]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray64))) {
                    n.a(lllII[lllll[741]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray125 = new int[lllll[1]];
            nArray125[d.lllll[0]] = lllll[742];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray125) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[743], lllll[744], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[745]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[746]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray65 = new String[lllll[1]];
                stringArray65[d.lllll[0]] = lllII[lllll[747]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray65))) {
                    n.a(lllII[lllll[748]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray126 = new int[lllll[1]];
            nArray126[d.lllll[0]] = lllll[749];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray126) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[668], lllll[750], lllll[0]);
                if (d.lIIlIllI(NPCs.getNearest(arg_0 -> d.b((WorldPoint)llllIllIIIlIlII, arg_0)))) {
                    Clues.c = lllII[lllll[751]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIll(NPCs.getNearest(arg_0 -> d.a((WorldPoint)llllIllIIIlIlII, arg_0)))) {
                    n.a(lllII[lllll[752]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray127 = new int[lllll[1]];
            nArray127[d.lllll[0]] = lllll[753];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray127) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[754], lllll[755], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[756]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[757]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray66 = new String[lllll[1]];
                stringArray66[d.lllll[0]] = lllII[lllll[758]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray66))) {
                    n.a(lllII[lllll[759]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray128 = new int[lllll[1]];
            nArray128[d.lllll[0]] = lllll[760];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray128) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[761], lllll[261], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[762]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[763]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray67 = new String[lllll[1]];
                stringArray67[d.lllll[0]] = lllII[lllll[764]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray67))) {
                    n.a(lllII[lllll[765]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray129 = new int[lllll[1]];
            nArray129[d.lllll[0]] = lllll[766];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray129) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[767], lllll[768], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[769]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[770]];
                    k.a((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray68 = new String[lllll[1]];
                stringArray68[d.lllll[0]] = lllII[lllll[771]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray68))) {
                    n.a(lllII[lllll[772]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray130 = new int[lllll[1]];
            nArray130[d.lllll[0]] = lllll[773];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray130) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[774], lllll[775], lllll[1]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[776]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[777]];
                    llllIllIIIlIIll = new WorldArea(lllll[778], lllll[779], lllll[77], lllll[45], lllll[0]);
                    if (d.lIIlIIIl(llllIllIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        llllIllIIIlIIlI2 = new WorldPoint(lllll[780], lllll[775], lllll[0]);
                        if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIIlI2), lllll[6])) {
                            k.DHelper((WorldPoint)llllIllIIIlIIlI2);
                        }
                    }
                    if (!d.lIIlIIIl(llllIllIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllll[780], lllll[775], lllll[0])), lllll[6])) {
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                }
                String[] stringArray69 = new String[lllll[1]];
                stringArray69[d.lllll[0]] = lllII[lllll[781]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray69))) {
                    n.a(lllII[lllll[782]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray131 = new int[lllll[1]];
            nArray131[d.lllll[0]] = lllll[783];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray131) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[784], lllll[785], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[786]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[787]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray70 = new String[lllll[1]];
                stringArray70[d.lllll[0]] = lllII[lllll[788]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray70))) {
                    n.a(lllII[lllll[789]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray132 = new int[lllll[1]];
            nArray132[d.lllll[0]] = lllll[790];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray132) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[791], lllll[792], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[793]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[794]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray71 = new String[lllll[1]];
                stringArray71[d.lllll[0]] = lllII[lllll[795]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray71))) {
                    n.a(lllII[lllll[796]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray133 = new int[lllll[1]];
            nArray133[d.lllll[0]] = lllll[797];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray133) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[798], lllll[391], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[799]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[800]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray72 = new String[lllll[1]];
                stringArray72[d.lllll[0]] = lllII[lllll[801]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray72))) {
                    n.a(lllII[lllll[802]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray134 = new int[lllll[1]];
            nArray134[d.lllll[0]] = lllll[803];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray134) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[804], lllll[805], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[806]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[807]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray73 = new String[lllll[1]];
                stringArray73[d.lllll[0]] = lllII[lllll[808]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray73))) {
                    n.a(lllII[lllll[809]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray135 = new int[lllll[1]];
            nArray135[d.lllll[0]] = lllll[810];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray135) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[804], lllll[811], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[812]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[813]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray74 = new String[lllll[1]];
                stringArray74[d.lllll[0]] = lllII[lllll[814]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray74))) {
                    n.a(lllII[lllll[815]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray136 = new int[lllll[1]];
            nArray136[d.lllll[0]] = lllll[816];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray136) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[331], lllll[817], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[818]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[819]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray75 = new String[lllll[1]];
                stringArray75[d.lllll[0]] = lllII[lllll[820]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray75))) {
                    n.a(lllII[lllll[821]], new String[lllll[0]]);
                }
            }
            int[] nArray137 = new int[lllll[1]];
            nArray137[d.lllll[0]] = lllll[822];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray137) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[410], lllll[823], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[824]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[825]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray76 = new String[lllll[1]];
                stringArray76[d.lllll[0]] = lllII[lllll[826]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray76))) {
                    n.a(lllII[lllll[827]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray138 = new int[lllll[1]];
            nArray138[d.lllll[0]] = lllll[828];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray138) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[829], lllll[830], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[831]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[832]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray77 = new String[lllll[1]];
                stringArray77[d.lllll[0]] = lllII[lllll[833]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray77))) {
                    n.a(lllII[lllll[834]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] nArray139 = new int[lllll[1]];
            nArray139[d.lllll[0]] = lllll[835];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray139) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[837]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[838]];
                    if (d.lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray78 = new String[lllll[1]];
                stringArray78[d.lllll[0]] = lllII[lllll[839]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray78))) {
                    String[] stringArray79 = new String[lllll[1]];
                    stringArray79[d.lllll[0]] = lllII[lllll[840]];
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray79).getWorldLocation()), lllll[7])) {
                        if (d.lIIlIIlI(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open((Tab)Tab.MUSIC);
                            Time.sleepTicks((int)lllll[5]);

                        }
                        if (d.lIIlIIIl(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[841]]);
                            if (d.lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray80 = new String[lllll[1]];
                                stringArray80[d.lllll[0]] = lllII[lllll[843]];
                                n.a(lllII[lllll[842]], stringArray80, lllll[1]);
                            }
                            String[] stringArray81 = new String[lllll[1]];
                            stringArray81[d.lllll[0]] = lllII[lllll[844]];
                            n.c(stringArray81);
                        }
                    }
                    String[] stringArray82 = new String[lllll[1]];
                    stringArray82[d.lllll[0]] = lllII[lllll[845]];
                    if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray82).getWorldLocation()), lllll[7])) {
                        String[] stringArray83 = new String[lllll[1]];
                        stringArray83[d.lllll[0]] = lllII[lllll[847]];
                        n.a(lllII[lllll[846]], stringArray83, lllll[1]);
                    }
                }
            }
            int[] nArray140 = new int[lllll[1]];
            nArray140[d.lllll[0]] = lllll[848];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray140) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[849]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[850]];
                    if (d.lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray84 = new String[lllll[1]];
                stringArray84[d.lllll[0]] = lllII[lllll[851]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray84))) {
                    String[] stringArray85 = new String[lllll[1]];
                    stringArray85[d.lllll[0]] = lllII[lllll[852]];
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray85).getWorldLocation()), lllll[7])) {
                        if (d.lIIlIIlI(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open((Tab)Tab.MUSIC);
                            Time.sleepTicks((int)lllll[5]);

                        }
                        if (d.lIIlIIIl(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[853]]);
                            if (d.lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray86 = new String[lllll[1]];
                                stringArray86[d.lllll[0]] = lllII[lllll[855]];
                                n.a(lllII[lllll[854]], stringArray86, lllll[1]);
                            }
                            String[] stringArray87 = new String[lllll[1]];
                            stringArray87[d.lllll[0]] = lllII[lllll[856]];
                            n.c(stringArray87);
                        }
                    }
                    String[] stringArray88 = new String[lllll[1]];
                    stringArray88[d.lllll[0]] = lllII[lllll[857]];
                    if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray88).getWorldLocation()), lllll[7])) {
                        String[] stringArray89 = new String[lllll[1]];
                        stringArray89[d.lllll[0]] = lllII[lllll[859]];
                        n.a(lllII[lllll[858]], stringArray89, lllll[1]);
                    }
                }
            }
            int[] nArray141 = new int[lllll[1]];
            nArray141[d.lllll[0]] = lllll[860];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray141) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[861]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[862]];
                    if (d.lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray90 = new String[lllll[1]];
                stringArray90[d.lllll[0]] = lllII[lllll[863]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray90))) {
                    String[] stringArray91 = new String[lllll[1]];
                    stringArray91[d.lllll[0]] = lllII[lllll[864]];
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray91).getWorldLocation()), lllll[7])) {
                        if (d.lIIlIIlI(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open((Tab)Tab.MUSIC);
                            Time.sleepTicks((int)lllll[5]);

                        }
                        if (d.lIIlIIIl(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[865]]);
                            if (d.lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray92 = new String[lllll[1]];
                                stringArray92[d.lllll[0]] = lllII[lllll[867]];
                                n.a(lllII[lllll[866]], stringArray92, lllll[1]);
                            }
                        }
                    }
                    String[] stringArray93 = new String[lllll[1]];
                    stringArray93[d.lllll[0]] = lllII[lllll[868]];
                    if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray93).getWorldLocation()), lllll[7])) {
                        String[] stringArray94 = new String[lllll[1]];
                        stringArray94[d.lllll[0]] = lllII[lllll[870]];
                        n.a(lllII[lllll[869]], stringArray94, lllll[1]);
                    }
                }
            }
            int[] nArray142 = new int[lllll[1]];
            nArray142[d.lllll[0]] = lllll[871];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray142) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[872]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[873]];
                    if (d.lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray95 = new String[lllll[1]];
                stringArray95[d.lllll[0]] = lllII[lllll[874]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray95))) {
                    String[] stringArray96 = new String[lllll[1]];
                    stringArray96[d.lllll[0]] = lllII[lllll[875]];
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray96).getWorldLocation()), lllll[7])) {
                        if (d.lIIlIIlI(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open((Tab)Tab.MUSIC);
                            Time.sleepTicks((int)lllll[5]);

                        }
                        if (d.lIIlIIIl(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[876]]);
                            if (d.lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray97 = new String[lllll[1]];
                                stringArray97[d.lllll[0]] = lllII[lllll[878]];
                                n.a(lllII[lllll[877]], stringArray97, lllll[1]);
                            }
                            String[] stringArray98 = new String[lllll[1]];
                            stringArray98[d.lllll[0]] = lllII[lllll[879]];
                            n.c(stringArray98);
                        }
                    }
                    String[] stringArray99 = new String[lllll[1]];
                    stringArray99[d.lllll[0]] = lllII[lllll[880]];
                    if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray99).getWorldLocation()), lllll[7])) {
                        String[] stringArray100 = new String[lllll[1]];
                        stringArray100[d.lllll[0]] = lllII[lllll[882]];
                        n.a(lllII[lllll[881]], stringArray100, lllll[1]);
                    }
                }
            }
            int[] nArray143 = new int[lllll[1]];
            nArray143[d.lllll[0]] = lllll[883];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray143) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[884]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[885]];
                    if (d.lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray101 = new String[lllll[1]];
                stringArray101[d.lllll[0]] = lllII[lllll[886]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray101))) {
                    String[] stringArray102 = new String[lllll[1]];
                    stringArray102[d.lllll[0]] = lllII[lllll[887]];
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray102).getWorldLocation()), lllll[7])) {
                        if (d.lIIlIIlI(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open((Tab)Tab.MUSIC);
                            Time.sleepTicks((int)lllll[5]);

                        }
                        if (d.lIIlIIIl(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[888]]);
                            if (d.lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray103 = new String[lllll[1]];
                                stringArray103[d.lllll[0]] = lllII[lllll[890]];
                                n.a(lllII[lllll[889]], stringArray103, lllll[1]);
                            }
                            String[] stringArray104 = new String[lllll[1]];
                            stringArray104[d.lllll[0]] = lllII[lllll[891]];
                            n.c(stringArray104);
                        }
                    }
                    String[] stringArray105 = new String[lllll[1]];
                    stringArray105[d.lllll[0]] = lllII[lllll[892]];
                    if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray105).getWorldLocation()), lllll[7])) {
                        String[] stringArray106 = new String[lllll[1]];
                        stringArray106[d.lllll[0]] = lllII[lllll[894]];
                        n.a(lllII[lllll[893]], stringArray106, lllll[1]);
                    }
                }
            }
            int[] nArray144 = new int[lllll[1]];
            nArray144[d.lllll[0]] = lllll[895];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray144) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] stringArray = new String[lllll[1]];
                stringArray[d.lllll[0]] = lllII[lllll[896]];
                if (d.lIIlIllI(NPCs.getNearest((String[])stringArray))) {
                    Clues.c = lllII[lllll[897]];
                    if (d.lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                String[] stringArray107 = new String[lllll[1]];
                stringArray107[d.lllll[0]] = lllII[lllll[898]];
                if (d.lIIlIIll(NPCs.getNearest((String[])stringArray107))) {
                    String[] stringArray108 = new String[lllll[1]];
                    stringArray108[d.lllll[0]] = lllII[lllll[899]];
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray108).getWorldLocation()), lllll[7])) {
                        if (d.lIIlIIlI(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open((Tab)Tab.MUSIC);
                            Time.sleepTicks((int)lllll[5]);

                        }
                        if (d.lIIlIIIl(Tabs.isOpen((Tab)Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[900]]);
                            if (d.lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray109 = new String[lllll[1]];
                                stringArray109[d.lllll[0]] = lllII[lllll[902]];
                                n.a(lllII[lllll[901]], stringArray109, lllll[1]);
                            }
                            String[] stringArray110 = new String[lllll[1]];
                            stringArray110[d.lllll[0]] = lllII[lllll[903]];
                            n.c(stringArray110);
                        }
                    }
                    String[] stringArray111 = new String[lllll[1]];
                    stringArray111[d.lllll[0]] = lllII[lllll[904]];
                    if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(NPCs.getNearest((String[])stringArray111).getWorldLocation()), lllll[7])) {
                        String[] stringArray112 = new String[lllll[1]];
                        stringArray112[d.lllll[0]] = lllII[lllll[197]];
                        n.a(lllII[lllll[198]], stringArray112, lllll[1]);
                    }
                }
            }
            int[] nArray145 = new int[lllll[1]];
            nArray145[d.lllll[0]] = lllll[905];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray145) ? 1 : 0)) {
                int[] nArray146 = new int[lllll[6]];
                nArray146[d.lllll[0]] = lllll[906];
                nArray146[d.lllll[1]] = lllll[907];
                nArray146[d.lllll[5]] = lllll[908];
                if (d.lIIlIIlI(a.a(nArray146) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray147 = new int[lllll[6]];
                nArray147[d.lllll[0]] = lllll[906];
                nArray147[d.lllll[1]] = lllll[907];
                nArray147[d.lllll[5]] = lllll[908];
                if (d.lIIlIIIl(a.a(nArray147) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[909], lllll[910], lllll[5]);
                    if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[8])) {
                        Clues.c = lllII[lllll[911]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[8])) {
                        int[] nArray148 = new int[lllll[6]];
                        nArray148[d.lllll[0]] = lllll[906];
                        nArray148[d.lllll[1]] = lllll[907];
                        nArray148[d.lllll[5]] = lllll[908];
                        k.DHelper(nArray148);
                        a.a();
                    }
                }
            }
            int[] nArray149 = new int[lllll[1]];
            nArray149[d.lllll[0]] = lllll[912];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray149) ? 1 : 0)) {
                int[] nArray150 = new int[lllll[6]];
                nArray150[d.lllll[0]] = lllll[906];
                nArray150[d.lllll[1]] = lllll[913];
                nArray150[d.lllll[5]] = lllll[914];
                if (d.lIIlIIlI(a.a(nArray150) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray151 = new int[lllll[6]];
                nArray151[d.lllll[0]] = lllll[906];
                nArray151[d.lllll[1]] = lllll[913];
                nArray151[d.lllll[5]] = lllll[914];
                if (d.lIIlIIIl(a.a(nArray151) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[915], lllll[916], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[917]];
                        llllIllIIIlIIll = new WorldPoint(lllll[918], lllll[919], lllll[0]);
                        if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals(llllIllIIIlIIll) ? 1 : 0) && d.lIIlIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
                            k.c(new WorldPoint(lllll[920], lllll[921], lllll[0]));
                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllll[920], lllll[921], lllll[0])), (int)lllll[195]);

                        }
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray152 = new int[lllll[6]];
                        nArray152[d.lllll[0]] = lllll[906];
                        nArray152[d.lllll[1]] = lllll[913];
                        nArray152[d.lllll[5]] = lllll[914];
                        k.DHelper(nArray152);
                        a.c();
                    }
                }
            }
            int[] nArray153 = new int[lllll[1]];
            nArray153[d.lllll[0]] = lllll[922];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray153) ? 1 : 0)) {
                int[] nArray154 = new int[lllll[6]];
                nArray154[d.lllll[0]] = lllll[923];
                nArray154[d.lllll[1]] = lllll[924];
                nArray154[d.lllll[5]] = lllll[925];
                if (d.lIIlIIlI(a.a(nArray154) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray155 = new int[lllll[6]];
                nArray155[d.lllll[0]] = lllll[923];
                nArray155[d.lllll[1]] = lllll[924];
                nArray155[d.lllll[5]] = lllll[925];
                if (d.lIIlIIIl(a.a(nArray155) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[926], lllll[927], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[928]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray156 = new int[lllll[6]];
                        nArray156[d.lllll[0]] = lllll[923];
                        nArray156[d.lllll[1]] = lllll[924];
                        nArray156[d.lllll[5]] = lllll[925];
                        k.DHelper(nArray156);
                        a.a();
                    }
                }
            }
            int[] nArray157 = new int[lllll[1]];
            nArray157[d.lllll[0]] = lllll[929];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray157) ? 1 : 0)) {
                int[] nArray158 = new int[lllll[6]];
                nArray158[d.lllll[0]] = lllll[930];
                nArray158[d.lllll[1]] = lllll[931];
                nArray158[d.lllll[5]] = lllll[932];
                if (d.lIIlIIlI(a.a(nArray158) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray159 = new int[lllll[6]];
                nArray159[d.lllll[0]] = lllll[930];
                nArray159[d.lllll[1]] = lllll[931];
                nArray159[d.lllll[5]] = lllll[932];
                if (d.lIIlIIIl(a.a(nArray159) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[933], lllll[934], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[935]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray160 = new int[lllll[6]];
                        nArray160[d.lllll[0]] = lllll[930];
                        nArray160[d.lllll[1]] = lllll[931];
                        nArray160[d.lllll[5]] = lllll[932];
                        k.DHelper(nArray160);
                        a.DHelper();
                    }
                }
            }
            int[] nArray161 = new int[lllll[1]];
            nArray161[d.lllll[0]] = lllll[936];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray161) ? 1 : 0)) {
                int[] nArray162 = new int[lllll[6]];
                nArray162[d.lllll[0]] = lllll[937];
                nArray162[d.lllll[1]] = lllll[938];
                nArray162[d.lllll[5]] = lllll[939];
                if (d.lIIlIIlI(a.a(nArray162) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray163 = new int[lllll[6]];
                nArray163[d.lllll[0]] = lllll[937];
                nArray163[d.lllll[1]] = lllll[938];
                nArray163[d.lllll[5]] = lllll[939];
                if (d.lIIlIIIl(a.a(nArray163) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[940], lllll[941], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[942]];
                        llllIllIIIlIIll = new WorldPoint(lllll[943], lllll[944], lllll[0]);
                        if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals(llllIllIIIlIIll) ? 1 : 0)) {
                            k.c(new WorldPoint(lllll[945], lllll[946], lllll[0]));
                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllll[945], lllll[946], lllll[0])), (int)lllll[947]);

                        }
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray164 = new int[lllll[6]];
                        nArray164[d.lllll[0]] = lllll[937];
                        nArray164[d.lllll[1]] = lllll[938];
                        nArray164[d.lllll[5]] = lllll[939];
                        k.DHelper(nArray164);
                        a.e();
                    }
                }
            }
            int[] nArray165 = new int[lllll[1]];
            nArray165[d.lllll[0]] = lllll[948];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray165) ? 1 : 0)) {
                int[] nArray166 = new int[lllll[6]];
                nArray166[d.lllll[0]] = lllll[949];
                nArray166[d.lllll[1]] = lllll[950];
                nArray166[d.lllll[5]] = lllll[951];
                if (d.lIIlIIlI(a.a(nArray166) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray167 = new int[lllll[6]];
                nArray167[d.lllll[0]] = lllll[949];
                nArray167[d.lllll[1]] = lllll[950];
                nArray167[d.lllll[5]] = lllll[951];
                if (d.lIIlIIIl(a.a(nArray167) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[150], lllll[952], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[953]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                        if (d.lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lllll[1]];
                            stringArray[d.lllll[0]] = lllII[lllll[196]];
                            n.c(stringArray);
                        }
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray168 = new int[lllll[6]];
                        nArray168[d.lllll[0]] = lllll[949];
                        nArray168[d.lllll[1]] = lllll[950];
                        nArray168[d.lllll[5]] = lllll[951];
                        k.DHelper(nArray168);
                        a.DHelper();
                    }
                }
            }
            int[] nArray169 = new int[lllll[1]];
            nArray169[d.lllll[0]] = lllll[954];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray169) ? 1 : 0)) {
                int[] nArray170 = new int[lllll[6]];
                nArray170[d.lllll[0]] = lllll[955];
                nArray170[d.lllll[1]] = lllll[956];
                nArray170[d.lllll[5]] = lllll[957];
                if (d.lIIlIIlI(a.a(nArray170) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray171 = new int[lllll[6]];
                nArray171[d.lllll[0]] = lllll[955];
                nArray171[d.lllll[1]] = lllll[956];
                nArray171[d.lllll[5]] = lllll[957];
                if (d.lIIlIIIl(a.a(nArray171) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[804], lllll[805], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[958]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray172 = new int[lllll[6]];
                        nArray172[d.lllll[0]] = lllll[955];
                        nArray172[d.lllll[1]] = lllll[956];
                        nArray172[d.lllll[5]] = lllll[957];
                        k.DHelper(nArray172);
                        a.e();
                    }
                }
            }
            int[] nArray173 = new int[lllll[1]];
            nArray173[d.lllll[0]] = lllll[959];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray173) ? 1 : 0)) {
                int[] nArray174 = new int[lllll[6]];
                nArray174[d.lllll[0]] = lllll[960];
                nArray174[d.lllll[1]] = lllll[938];
                nArray174[d.lllll[5]] = lllll[961];
                if (d.lIIlIIlI(a.a(nArray174) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray175 = new int[lllll[6]];
                nArray175[d.lllll[0]] = lllll[960];
                nArray175[d.lllll[1]] = lllll[938];
                nArray175[d.lllll[5]] = lllll[961];
                if (d.lIIlIIIl(a.a(nArray175) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[962], lllll[69], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[963]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray176 = new int[lllll[6]];
                        nArray176[d.lllll[0]] = lllll[960];
                        nArray176[d.lllll[1]] = lllll[938];
                        nArray176[d.lllll[5]] = lllll[961];
                        k.DHelper(nArray176);
                        a.f();
                    }
                }
            }
            int[] nArray177 = new int[lllll[1]];
            nArray177[d.lllll[0]] = lllll[964];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray177) ? 1 : 0)) {
                int[] nArray178 = new int[lllll[6]];
                nArray178[d.lllll[0]] = lllll[965];
                nArray178[d.lllll[1]] = lllll[966];
                nArray178[d.lllll[5]] = lllll[967];
                if (d.lIIlIIlI(a.a(nArray178) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray179 = new int[lllll[6]];
                nArray179[d.lllll[0]] = lllll[965];
                nArray179[d.lllll[1]] = lllll[966];
                nArray179[d.lllll[5]] = lllll[967];
                if (d.lIIlIIIl(a.a(nArray179) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[968], lllll[654], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[969]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray180 = new int[lllll[6]];
                        nArray180[d.lllll[0]] = lllll[965];
                        nArray180[d.lllll[1]] = lllll[966];
                        nArray180[d.lllll[5]] = lllll[967];
                        k.DHelper(nArray180);
                        a.g();
                    }
                }
            }
            int[] nArray181 = new int[lllll[1]];
            nArray181[d.lllll[0]] = lllll[970];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray181) ? 1 : 0)) {
                int[] nArray182 = new int[lllll[5]];
                nArray182[d.lllll[0]] = lllll[971];
                nArray182[d.lllll[1]] = lllll[972];
                if (d.lIIlIIlI(a.a(nArray182) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray183 = new int[lllll[5]];
                nArray183[d.lllll[0]] = lllll[971];
                nArray183[d.lllll[1]] = lllll[972];
                if (d.lIIlIIIl(a.a(nArray183) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[973], lllll[974], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[975]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray184 = new int[lllll[5]];
                        nArray184[d.lllll[0]] = lllll[971];
                        nArray184[d.lllll[1]] = lllll[972];
                        k.DHelper(nArray184);
                        a.o();
                    }
                }
            }
            int[] nArray185 = new int[lllll[1]];
            nArray185[d.lllll[0]] = lllll[976];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray185) ? 1 : 0)) {
                int[] nArray186 = new int[lllll[6]];
                nArray186[d.lllll[0]] = lllll[977];
                nArray186[d.lllll[1]] = lllll[978];
                nArray186[d.lllll[5]] = lllll[979];
                if (d.lIIlIIlI(a.a(nArray186) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray187 = new int[lllll[6]];
                nArray187[d.lllll[0]] = lllll[977];
                nArray187[d.lllll[1]] = lllll[978];
                nArray187[d.lllll[5]] = lllll[979];
                if (d.lIIlIIIl(a.a(nArray187) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[980], lllll[981], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[982]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray188 = new int[lllll[6]];
                        nArray188[d.lllll[0]] = lllll[977];
                        nArray188[d.lllll[1]] = lllll[978];
                        nArray188[d.lllll[5]] = lllll[979];
                        k.DHelper(nArray188);
                        a.f();
                    }
                }
            }
            int[] nArray189 = new int[lllll[1]];
            nArray189[d.lllll[0]] = lllll[983];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray189) ? 1 : 0)) {
                int[] nArray190 = new int[lllll[6]];
                nArray190[d.lllll[0]] = lllll[984];
                nArray190[d.lllll[1]] = lllll[985];
                nArray190[d.lllll[5]] = lllll[986];
                if (d.lIIlIIlI(a.a(nArray190) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray191 = new int[lllll[6]];
                nArray191[d.lllll[0]] = lllll[984];
                nArray191[d.lllll[1]] = lllll[985];
                nArray191[d.lllll[5]] = lllll[986];
                if (d.lIIlIIIl(a.a(nArray191) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[987], lllll[988], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[989]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray192 = new int[lllll[6]];
                        nArray192[d.lllll[0]] = lllll[984];
                        nArray192[d.lllll[1]] = lllll[985];
                        nArray192[d.lllll[5]] = lllll[986];
                        k.DHelper(nArray192);
                        a.n();
                    }
                }
            }
            int[] nArray193 = new int[lllll[1]];
            nArray193[d.lllll[0]] = lllll[990];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray193) ? 1 : 0)) {
                int[] nArray194 = new int[lllll[6]];
                nArray194[d.lllll[0]] = lllll[991];
                nArray194[d.lllll[1]] = lllll[992];
                nArray194[d.lllll[5]] = lllll[993];
                if (d.lIIlIIlI(a.a(nArray194) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray195 = new int[lllll[6]];
                nArray195[d.lllll[0]] = lllll[991];
                nArray195[d.lllll[1]] = lllll[992];
                nArray195[d.lllll[5]] = lllll[993];
                if (d.lIIlIIIl(a.a(nArray195) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[994], lllll[792], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[995]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray196 = new int[lllll[6]];
                        nArray196[d.lllll[0]] = lllll[991];
                        nArray196[d.lllll[1]] = lllll[992];
                        nArray196[d.lllll[5]] = lllll[993];
                        k.DHelper(nArray196);
                        a.k();
                    }
                }
            }
            int[] nArray197 = new int[lllll[1]];
            nArray197[d.lllll[0]] = lllll[996];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray197) ? 1 : 0)) {
                int[] nArray198 = new int[lllll[6]];
                nArray198[d.lllll[0]] = lllll[997];
                nArray198[d.lllll[1]] = lllll[957];
                nArray198[d.lllll[5]] = lllll[998];
                if (d.lIIlIIlI(a.a(nArray198) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray199 = new int[lllll[6]];
                nArray199[d.lllll[0]] = lllll[997];
                nArray199[d.lllll[1]] = lllll[957];
                nArray199[d.lllll[5]] = lllll[998];
                if (d.lIIlIIIl(a.a(nArray199) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[999], lllll[973], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1000]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray200 = new int[lllll[6]];
                        nArray200[d.lllll[0]] = lllll[997];
                        nArray200[d.lllll[1]] = lllll[957];
                        nArray200[d.lllll[5]] = lllll[998];
                        k.DHelper(nArray200);
                        a.l();
                    }
                }
            }
            int[] nArray201 = new int[lllll[1]];
            nArray201[d.lllll[0]] = lllll[1001];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray201) ? 1 : 0)) {
                int[] nArray202 = new int[lllll[6]];
                nArray202[d.lllll[0]] = lllll[1002];
                nArray202[d.lllll[1]] = lllll[961];
                nArray202[d.lllll[5]] = lllll[1003];
                if (d.lIIlIIlI(a.a(nArray202) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray203 = new int[lllll[6]];
                nArray203[d.lllll[0]] = lllll[1002];
                nArray203[d.lllll[1]] = lllll[961];
                nArray203[d.lllll[5]] = lllll[1003];
                if (d.lIIlIIIl(a.a(nArray203) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[162], lllll[1004], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1005]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray204 = new int[lllll[6]];
                        nArray204[d.lllll[0]] = lllll[1002];
                        nArray204[d.lllll[1]] = lllll[961];
                        nArray204[d.lllll[5]] = lllll[1003];
                        k.DHelper(nArray204);
                        a.m();
                    }
                }
            }
            int[] nArray205 = new int[lllll[1]];
            nArray205[d.lllll[0]] = lllll[1006];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray205) ? 1 : 0)) {
                int[] nArray206 = new int[lllll[6]];
                nArray206[d.lllll[0]] = lllll[924];
                nArray206[d.lllll[1]] = lllll[1007];
                nArray206[d.lllll[5]] = lllll[1008];
                if (d.lIIlIIlI(a.a(nArray206) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray207 = new int[lllll[6]];
                nArray207[d.lllll[0]] = lllll[924];
                nArray207[d.lllll[1]] = lllll[1007];
                nArray207[d.lllll[5]] = lllll[1008];
                if (d.lIIlIIIl(a.a(nArray207) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1009], lllll[1010], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1011]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray208 = new int[lllll[6]];
                        nArray208[d.lllll[0]] = lllll[924];
                        nArray208[d.lllll[1]] = lllll[1007];
                        nArray208[d.lllll[5]] = lllll[1008];
                        k.DHelper(nArray208);
                        a.o();
                    }
                }
            }
            int[] nArray209 = new int[lllll[1]];
            nArray209[d.lllll[0]] = lllll[1012];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray209) ? 1 : 0)) {
                int[] nArray210 = new int[lllll[6]];
                nArray210[d.lllll[0]] = lllll[1013];
                nArray210[d.lllll[1]] = lllll[1014];
                nArray210[d.lllll[5]] = lllll[938];
                if (d.lIIlIIlI(a.a(nArray210) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray211 = new int[lllll[6]];
                nArray211[d.lllll[0]] = lllll[1013];
                nArray211[d.lllll[1]] = lllll[1014];
                nArray211[d.lllll[5]] = lllll[938];
                if (d.lIIlIIIl(a.a(nArray211) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1015], lllll[692], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1016]];
                        llllIllIIIlIIll = new WorldPoint(lllll[943], lllll[944], lllll[0]);
                        if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals(llllIllIIIlIIll) ? 1 : 0)) {
                            k.c(new WorldPoint(lllll[597], lllll[175], lllll[0]));
                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lllll[597], lllll[175], lllll[0])), (int)lllll[195]);

                        }
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray212 = new int[lllll[6]];
                        nArray212[d.lllll[0]] = lllll[1013];
                        nArray212[d.lllll[1]] = lllll[1014];
                        nArray212[d.lllll[5]] = lllll[938];
                        k.DHelper(nArray212);
                        a.m();
                    }
                }
            }
            int[] nArray213 = new int[lllll[1]];
            nArray213[d.lllll[0]] = lllll[1017];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray213) ? 1 : 0)) {
                int[] nArray214 = new int[lllll[6]];
                nArray214[d.lllll[0]] = lllll[1018];
                nArray214[d.lllll[1]] = lllll[997];
                nArray214[d.lllll[5]] = lllll[1019];
                if (d.lIIlIIlI(a.a(nArray214) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray215 = new int[lllll[6]];
                nArray215[d.lllll[0]] = lllll[1018];
                nArray215[d.lllll[1]] = lllll[997];
                nArray215[d.lllll[5]] = lllll[1019];
                if (d.lIIlIIIl(a.a(nArray215) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1020], lllll[1021], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1022]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray216 = new int[lllll[6]];
                        nArray216[d.lllll[0]] = lllll[1018];
                        nArray216[d.lllll[1]] = lllll[997];
                        nArray216[d.lllll[5]] = lllll[1019];
                        k.DHelper(nArray216);
                        a.m();
                    }
                }
            }
            int[] nArray217 = new int[lllll[1]];
            nArray217[d.lllll[0]] = lllll[1023];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray217) ? 1 : 0)) {
                int[] nArray218 = new int[lllll[6]];
                nArray218[d.lllll[0]] = lllll[1018];
                nArray218[d.lllll[1]] = lllll[961];
                nArray218[d.lllll[5]] = lllll[1024];
                if (d.lIIlIIlI(a.a(nArray218) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray219 = new int[lllll[6]];
                nArray219[d.lllll[0]] = lllll[1018];
                nArray219[d.lllll[1]] = lllll[961];
                nArray219[d.lllll[5]] = lllll[1024];
                if (d.lIIlIIIl(a.a(nArray219) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1025], lllll[974], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1026]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray220 = new int[lllll[6]];
                        nArray220[d.lllll[0]] = lllll[1018];
                        nArray220[d.lllll[1]] = lllll[961];
                        nArray220[d.lllll[5]] = lllll[1024];
                        k.DHelper(nArray220);
                        a.g();
                    }
                }
            }
            int[] nArray221 = new int[lllll[1]];
            nArray221[d.lllll[0]] = lllll[1027];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray221) ? 1 : 0)) {
                int[] nArray222 = new int[lllll[6]];
                nArray222[d.lllll[0]] = lllll[1028];
                nArray222[d.lllll[1]] = lllll[1029];
                nArray222[d.lllll[5]] = lllll[1030];
                if (d.lIIlIIlI(a.a(nArray222) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray223 = new int[lllll[6]];
                nArray223[d.lllll[0]] = lllll[1028];
                nArray223[d.lllll[1]] = lllll[1029];
                nArray223[d.lllll[5]] = lllll[1030];
                if (d.lIIlIIIl(a.a(nArray223) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[798], lllll[1031], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[992]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray224 = new int[lllll[6]];
                        nArray224[d.lllll[0]] = lllll[1028];
                        nArray224[d.lllll[1]] = lllll[1029];
                        nArray224[d.lllll[5]] = lllll[1030];
                        k.DHelper(nArray224);
                        a.h();
                    }
                }
            }
            int[] nArray225 = new int[lllll[1]];
            nArray225[d.lllll[0]] = lllll[1032];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray225) ? 1 : 0)) {
                if (d.lIIlIIlI(a.a(new int[lllll[0]]) ? 1 : 0)) {
                    e.x();
                }
                if (d.lIIlIIIl(a.a(new int[lllll[0]]) ? 1 : 0)) {
                    k.DHelper(new int[lllll[0]]);
                    llllIllIIIlIlII = new WorldPoint(lllll[1033], lllll[1034], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1035]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        if (d.lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray226 = new int[lllll[1]];
                            nArray226[d.lllll[0]] = Clues.k;
                            Inventory.getFirst((int[])nArray226).interact(lllII[lllll[1028]]);
                            Time.sleepTicks((int)lllll[1]);

                        }
                        if (d.lIIlIlll((llllIllIIIlIIll = Equipment.getAll()).size())) {
                            int llllIllIIIlIIlI2 = lllll[0];
                            while (d.lIIllIII(llllIllIIIlIIlI2, llllIllIIIlIIll.size())) {
                                ((Item)llllIllIIIlIIll.get(llllIllIIIlIIlI2)).interact(lllII[lllll[1036]]);
                                Time.sleepTicks((int)lllll[1]);

                                if (d.lIIlIIIl(Inventory.isFull() ? 1 : 0)) {

                                    if (1 <= 3) break;
                                    return;
                                }
                                ++llllIllIIIlIIlI2;

                                return;
                            }
                        }
                        a.h();
                    }
                }
            }
            int[] nArray227 = new int[lllll[1]];
            nArray227[d.lllll[0]] = lllll[1037];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray227) ? 1 : 0)) {
                if (d.lIIlIIlI(a.a(new int[lllll[0]]) ? 1 : 0)) {
                    e.x();
                }
                if (d.lIIlIIIl(a.a(new int[lllll[0]]) ? 1 : 0)) {
                    k.DHelper(new int[lllll[0]]);
                    llllIllIIIlIlII = new WorldPoint(lllll[1038], lllll[952], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1039]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        if (d.lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray228 = new int[lllll[1]];
                            nArray228[d.lllll[0]] = Clues.k;
                            Inventory.getFirst((int[])nArray228).interact(lllII[lllll[1040]]);
                            Time.sleepTicks((int)lllll[1]);

                        }
                        if (d.lIIlIlll((llllIllIIIlIIll = Equipment.getAll()).size())) {
                            int llllIllIIIlIIlI2 = lllll[0];
                            while (d.lIIllIII(llllIllIIIlIIlI2, llllIllIIIlIIll.size())) {
                                ((Item)llllIllIIIlIIll.get(llllIllIIIlIIlI2)).interact(lllII[lllll[1041]]);
                                Time.sleepTicks((int)lllll[1]);

                                if (d.lIIlIIIl(Inventory.isFull() ? 1 : 0)) {

                                    if (((0x8C ^ 0xA4) & ~(0x98 ^ 0xB0)) != -1) break;
                                    return;
                                }
                                ++llllIllIIIlIIlI2;

                                if (-1 != 3) continue;
                                return;
                            }
                        }
                        a.j();
                    }
                }
            }
            int[] nArray229 = new int[lllll[1]];
            nArray229[d.lllll[0]] = lllll[1042];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray229) ? 1 : 0)) {
                int[] nArray230 = new int[lllll[6]];
                nArray230[d.lllll[0]] = lllll[1043];
                nArray230[d.lllll[1]] = lllll[907];
                nArray230[d.lllll[5]] = lllll[1044];
                if (d.lIIlIIlI(a.a(nArray230) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray231 = new int[lllll[6]];
                nArray231[d.lllll[0]] = lllll[1043];
                nArray231[d.lllll[1]] = lllll[907];
                nArray231[d.lllll[5]] = lllll[1044];
                if (d.lIIlIIIl(a.a(nArray231) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[261], lllll[380], lllll[0]);
                    if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                        Clues.c = lllII[lllll[1045]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                        int[] nArray232 = new int[lllll[6]];
                        nArray232[d.lllll[0]] = lllll[1043];
                        nArray232[d.lllll[1]] = lllll[907];
                        nArray232[d.lllll[5]] = lllll[1044];
                        k.DHelper(nArray232);
                        a.l();
                    }
                }
            }
            int[] nArray233 = new int[lllll[1]];
            nArray233[d.lllll[0]] = lllll[1046];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray233) ? 1 : 0)) {
                int[] nArray234 = new int[lllll[6]];
                nArray234[d.lllll[0]] = lllll[960];
                nArray234[d.lllll[1]] = lllll[1047];
                nArray234[d.lllll[5]] = lllll[1048];
                if (d.lIIlIIlI(a.a(nArray234) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray235 = new int[lllll[6]];
                nArray235[d.lllll[0]] = lllll[960];
                nArray235[d.lllll[1]] = lllll[1047];
                nArray235[d.lllll[5]] = lllll[1048];
                if (d.lIIlIIIl(a.a(nArray235) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1049], lllll[1050], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1051]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray236 = new int[lllll[6]];
                        nArray236[d.lllll[0]] = lllll[960];
                        nArray236[d.lllll[1]] = lllll[1047];
                        nArray236[d.lllll[5]] = lllll[1048];
                        k.DHelper(nArray236);
                        a.DHelper();
                    }
                }
            }
            int[] nArray237 = new int[lllll[1]];
            nArray237[d.lllll[0]] = lllll[1052];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray237) ? 1 : 0)) {
                int[] nArray238 = new int[lllll[6]];
                nArray238[d.lllll[0]] = lllll[1053];
                nArray238[d.lllll[1]] = lllll[938];
                nArray238[d.lllll[5]] = lllll[1054];
                if (d.lIIlIIlI(a.a(nArray238) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray239 = new int[lllll[6]];
                nArray239[d.lllll[0]] = lllll[1053];
                nArray239[d.lllll[1]] = lllll[938];
                nArray239[d.lllll[5]] = lllll[1054];
                if (d.lIIlIIIl(a.a(nArray239) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1055], lllll[22], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1056]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray240 = new int[lllll[6]];
                        nArray240[d.lllll[0]] = lllll[1053];
                        nArray240[d.lllll[1]] = lllll[938];
                        nArray240[d.lllll[5]] = lllll[1054];
                        k.DHelper(nArray240);
                        a.e();
                    }
                }
            }
            int[] nArray241 = new int[lllll[1]];
            nArray241[d.lllll[0]] = lllll[1057];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray241) ? 1 : 0)) {
                int[] nArray242 = new int[lllll[6]];
                nArray242[d.lllll[0]] = lllll[925];
                nArray242[d.lllll[1]] = lllll[1058];
                nArray242[d.lllll[5]] = lllll[1024];
                if (d.lIIlIIlI(a.a(nArray242) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray243 = new int[lllll[6]];
                nArray243[d.lllll[0]] = lllll[925];
                nArray243[d.lllll[1]] = lllll[1058];
                nArray243[d.lllll[5]] = lllll[1024];
                if (d.lIIlIIIl(a.a(nArray243) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1059], lllll[1060], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1061]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray244 = new int[lllll[6]];
                        nArray244[d.lllll[0]] = lllll[925];
                        nArray244[d.lllll[1]] = lllll[1058];
                        nArray244[d.lllll[5]] = lllll[1024];
                        k.DHelper(nArray244);
                        a.a();
                    }
                }
            }
            int[] nArray245 = new int[lllll[1]];
            nArray245[d.lllll[0]] = lllll[1062];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray245) ? 1 : 0)) {
                int[] nArray246 = new int[lllll[6]];
                nArray246[d.lllll[0]] = lllll[984];
                nArray246[d.lllll[1]] = lllll[1024];
                nArray246[d.lllll[5]] = lllll[1063];
                if (d.lIIlIIlI(a.a(nArray246) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray247 = new int[lllll[6]];
                nArray247[d.lllll[0]] = lllll[984];
                nArray247[d.lllll[1]] = lllll[1024];
                nArray247[d.lllll[5]] = lllll[1063];
                if (d.lIIlIIIl(a.a(nArray247) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[175], lllll[149], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1064]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray248 = new int[lllll[6]];
                        nArray248[d.lllll[0]] = lllll[984];
                        nArray248[d.lllll[1]] = lllll[1024];
                        nArray248[d.lllll[5]] = lllll[1063];
                        k.DHelper(nArray248);
                        a.b();
                    }
                }
            }
            int[] nArray249 = new int[lllll[1]];
            nArray249[d.lllll[0]] = lllll[1065];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray249) ? 1 : 0)) {
                int[] nArray250 = new int[lllll[6]];
                nArray250[d.lllll[0]] = lllll[961];
                nArray250[d.lllll[1]] = lllll[1066];
                nArray250[d.lllll[5]] = lllll[1067];
                if (d.lIIlIIlI(a.a(nArray250) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray251 = new int[lllll[6]];
                nArray251[d.lllll[0]] = lllll[961];
                nArray251[d.lllll[1]] = lllll[1066];
                nArray251[d.lllll[5]] = lllll[1067];
                if (d.lIIlIIIl(a.a(nArray251) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[629], lllll[1068], lllll[0]);
                    llllIllIIIlIIll = new WorldArea(lllll[212], lllll[1069], lllll[43], lllll[38], lllll[0]);
                    if (d.lIIlIIIl(llllIllIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && d.lIIlIIIl(Inventory.contains(item -> item.getName().contains(lllII[lllll[1157]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lllII[lllll[1156]])).interact(lllII[lllll[1070]]);
                        Time.sleepTicks((int)k.c(lllll[10], lllll[11]));

                    }
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1071]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray252 = new int[lllll[6]];
                        nArray252[d.lllll[0]] = lllll[961];
                        nArray252[d.lllll[1]] = lllll[1066];
                        nArray252[d.lllll[5]] = lllll[1067];
                        k.DHelper(nArray252);
                        a.h();
                    }
                }
            }
            int[] nArray253 = new int[lllll[1]];
            nArray253[d.lllll[0]] = lllll[1072];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray253) ? 1 : 0)) {
                int[] nArray254 = new int[lllll[6]];
                nArray254[d.lllll[0]] = lllll[1073];
                nArray254[d.lllll[1]] = lllll[951];
                nArray254[d.lllll[5]] = lllll[1074];
                if (d.lIIlIIlI(a.a(nArray254) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray255 = new int[lllll[6]];
                nArray255[d.lllll[0]] = lllll[1073];
                nArray255[d.lllll[1]] = lllll[951];
                nArray255[d.lllll[5]] = lllll[1074];
                if (d.lIIlIIIl(a.a(nArray255) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1075], lllll[1076], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1077]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray256 = new int[lllll[6]];
                        nArray256[d.lllll[0]] = lllll[1073];
                        nArray256[d.lllll[1]] = lllll[951];
                        nArray256[d.lllll[5]] = lllll[1074];
                        k.DHelper(nArray256);
                        a.i();
                    }
                }
            }
            int[] nArray257 = new int[lllll[1]];
            nArray257[d.lllll[0]] = lllll[1078];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray257) ? 1 : 0)) {
                int[] nArray258 = new int[lllll[6]];
                nArray258[d.lllll[0]] = lllll[1079];
                nArray258[d.lllll[1]] = lllll[1080];
                nArray258[d.lllll[5]] = lllll[1081];
                if (d.lIIlIIlI(a.a(nArray258) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray259 = new int[lllll[6]];
                nArray259[d.lllll[0]] = lllll[1079];
                nArray259[d.lllll[1]] = lllll[1080];
                nArray259[d.lllll[5]] = lllll[1081];
                if (d.lIIlIIIl(a.a(nArray259) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1082], lllll[1083], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1084]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray260 = new int[lllll[6]];
                        nArray260[d.lllll[0]] = lllll[1079];
                        nArray260[d.lllll[1]] = lllll[1080];
                        nArray260[d.lllll[5]] = lllll[1081];
                        k.DHelper(nArray260);
                        a.DHelper();
                    }
                }
            }
            int[] nArray261 = new int[lllll[1]];
            nArray261[d.lllll[0]] = lllll[1085];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray261) ? 1 : 0)) {
                int[] nArray262 = new int[lllll[6]];
                nArray262[d.lllll[0]] = lllll[966];
                nArray262[d.lllll[1]] = lllll[1086];
                nArray262[d.lllll[5]] = lllll[1087];
                if (d.lIIlIIlI(a.a(nArray262) ? 1 : 0)) {
                    e.x();
                }
                int[] nArray263 = new int[lllll[6]];
                nArray263[d.lllll[0]] = lllll[966];
                nArray263[d.lllll[1]] = lllll[1086];
                nArray263[d.lllll[5]] = lllll[1087];
                if (d.lIIlIIIl(a.a(nArray263) ? 1 : 0)) {
                    llllIllIIIlIlII = new WorldPoint(lllll[1088], lllll[429], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1089]];
                        k.DHelper((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);

                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray264 = new int[lllll[6]];
                        nArray264[d.lllll[0]] = lllll[966];
                        nArray264[d.lllll[1]] = lllll[1086];
                        nArray264[d.lllll[5]] = lllll[1087];
                        k.DHelper(nArray264);
                        a.j();
                    }
                }
            }
            int[] nArray265 = new int[lllll[1]];
            nArray265[d.lllll[0]] = lllll[1090];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray265) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1091], lllll[1092], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1093]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray266 = new int[lllll[1]];
                    nArray266[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray266) ? 1 : 0)) {
                        int[] nArray267 = new int[lllll[1]];
                        nArray267[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray267).interact(lllII[lllll[1095]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray268 = new int[lllll[1]];
            nArray268[d.lllll[0]] = lllll[1096];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray268) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1097], lllll[262], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1098]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray269 = new int[lllll[1]];
                    nArray269[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray269) ? 1 : 0)) {
                        int[] nArray270 = new int[lllll[1]];
                        nArray270[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray270).interact(lllII[lllll[1099]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray271 = new int[lllll[1]];
            nArray271[d.lllll[0]] = lllll[1100];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray271) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[476], lllll[1101], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1102]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray272 = new int[lllll[1]];
                    nArray272[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray272) ? 1 : 0)) {
                        int[] nArray273 = new int[lllll[1]];
                        nArray273[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray273).interact(lllII[lllll[1103]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray274 = new int[lllll[1]];
            nArray274[d.lllll[0]] = lllll[1104];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray274) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1105], lllll[1059], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1106]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray275 = new int[lllll[1]];
                    nArray275[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray275) ? 1 : 0)) {
                        int[] nArray276 = new int[lllll[1]];
                        nArray276[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray276).interact(lllII[lllll[1107]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray277 = new int[lllll[1]];
            nArray277[d.lllll[0]] = lllll[1108];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray277) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1109], lllll[1110], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    llllIllIIIlIIll = new WorldArea(lllll[1111], lllll[1112], lllll[25], lllll[18], lllll[0]);
                    if (d.lIIlIIIl(llllIllIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        k.c(new WorldPoint(lllll[1113], lllll[604], lllll[0]));
                        Time.sleepTicks((int)k.c(lllll[8], lllll[11]));

                    }
                    Clues.c = lllII[lllll[1114]];
                    k.a((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray278 = new int[lllll[1]];
                    nArray278[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray278) ? 1 : 0)) {
                        int[] nArray279 = new int[lllll[1]];
                        nArray279[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray279).interact(lllII[lllll[1115]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray280 = new int[lllll[1]];
            nArray280[d.lllll[0]] = lllll[1116];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray280) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1117], lllll[1118], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1119]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray281 = new int[lllll[1]];
                    nArray281[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray281) ? 1 : 0)) {
                        int[] nArray282 = new int[lllll[1]];
                        nArray282[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray282).interact(lllII[lllll[1120]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray283 = new int[lllll[1]];
            nArray283[d.lllll[0]] = lllll[1121];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray283) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1122], lllll[1123], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1124]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray284 = new int[lllll[1]];
                    nArray284[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray284) ? 1 : 0)) {
                        int[] nArray285 = new int[lllll[1]];
                        nArray285[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray285).interact(lllII[lllll[1125]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray286 = new int[lllll[1]];
            nArray286[d.lllll[0]] = lllll[1126];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray286) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[941], lllll[1127], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1128]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray287 = new int[lllll[1]];
                    nArray287[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray287) ? 1 : 0)) {
                        int[] nArray288 = new int[lllll[1]];
                        nArray288[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray288).interact(lllII[lllll[1129]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray289 = new int[lllll[1]];
            nArray289[d.lllll[0]] = lllll[1130];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray289) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[248], lllll[750], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1131]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray290 = new int[lllll[1]];
                    nArray290[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray290) ? 1 : 0)) {
                        int[] nArray291 = new int[lllll[1]];
                        nArray291[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray291).interact(lllII[lllll[1132]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray292 = new int[lllll[1]];
            nArray292[d.lllll[0]] = lllll[1133];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray292) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1134], lllll[1135], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1136]];
                    llllIllIIIlIIll = new WorldArea(lllll[1137], lllll[113], lllll[38], lllll[32], lllll[0]);
                    if (d.lIIllIII(k.h(lllll[273]), lllll[293]) && d.lIIlIIIl(llllIllIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] nArray293 = new int[lllll[1]];
                        nArray293[d.lllll[0]] = lllll[1138];
                        if (d.lIIlIIIl(Inventory.contains((int[])nArray293) ? 1 : 0)) {
                            int[] nArray294 = new int[lllll[1]];
                            nArray294[d.lllll[0]] = lllll[1138];
                            Inventory.getFirst((int[])nArray294).interact(lllII[lllll[1139]]);
                            Time.sleepUntil(() -> d.a((WorldArea)llllIllIIIlIIll), (int)lllll[195]);

                        }
                    }
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray295 = new int[lllll[1]];
                    nArray295[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray295) ? 1 : 0)) {
                        int[] nArray296 = new int[lllll[1]];
                        nArray296[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray296).interact(lllII[lllll[1140]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray297 = new int[lllll[1]];
            nArray297[d.lllll[0]] = lllll[1141];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray297) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1142], lllll[635], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1143]];
                    k.DHelper((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray298 = new int[lllll[1]];
                    nArray298[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray298) ? 1 : 0)) {
                        int[] nArray299 = new int[lllll[1]];
                        nArray299[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray299).interact(lllII[lllll[1144]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray300 = new int[lllll[1]];
            nArray300[d.lllll[0]] = lllll[1145];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray300) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1146], lllll[81], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1147]];
                    k.b((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray301 = new int[lllll[1]];
                    nArray301[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray301) ? 1 : 0)) {
                        int[] nArray302 = new int[lllll[1]];
                        nArray302[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray302).interact(lllII[lllll[1148]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            int[] nArray303 = new int[lllll[1]];
            nArray303[d.lllll[0]] = lllll[1149];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray303) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[924], lllll[1150], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1151]];
                    k.a((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);

                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray304 = new int[lllll[1]];
                    nArray304[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray304) ? 1 : 0)) {
                        int[] nArray305 = new int[lllll[1]];
                        nArray305[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray305).interact(lllII[lllll[1152]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));

                    }
                }
            }
            String[] stringArray = new String[lllll[1]];
            stringArray[d.lllll[0]] = lllII[lllll[1153]];
            n.c(stringArray);
        }
    }

    private static boolean lIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIll(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean s() {
        int n2;
        if (d.lIIlIIIl(Clues.e ? 1 : 0)) {
            int[] nArray = new int[lllll[1]];
            nArray[d.lllll[0]] = lllll[1094];
            return Inventory.contains((int[])nArray);
        }
        if (!d.lIIlIIlI(Inventory.contains(item -> item.getName().contains(lllII[lllll[1155]])) ? 1 : 0) || d.lIIlIIIl(Equipment.contains(item -> item.getName().contains(lllII[lllll[1154]])) ? 1 : 0)) {
            int[] nArray = new int[lllll[1]];
            nArray[d.lllll[0]] = lllll[1094];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lllll[1];

                if (-1 <= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lllll[0];
        return n2 != 0;
    }

    private static  boolean DHelper(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1160]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[56])) {
            n2 = lllll[1];

            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static  boolean c(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1058]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[56])) {
            n2 = lllll[1];

            if (((0xCD ^ 0x92) & ~(0x20 ^ 0x7F)) != 0) {
                return (2 & ~2) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static boolean lIIlIIlI(int n2) {
        return n2 == 0;
    }

    private static  boolean e(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1161]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[36])) {
            n2 = lllll[1];

            if (((2 ^ 0x4F ^ (0x40 ^ 0x5F)) & (0x2E ^ 0x5A ^ (0x37 ^ 0x11) ^ -1)) < 0) {
                return ((28 + 205 - 145 + 139 ^ 127 + 73 - 196 + 124) & (0x1A ^ 0x52 ^ (0x96 ^ 0xBD) ^ -1) & ((30 + 90 - 104 + 133 ^ 107 + 132 - 81 + 31) & (46 + 31 - -19 + 49 ^ 135 + 117 - 244 + 177 ^ -1) ^ -1)) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static boolean lIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(llllIlIlIlIllII);
    }

    private static  boolean a(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1158]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[56])) {
            n2 = lllll[1];

            if (((0x18 ^ 0x4C) & ~(0xC0 ^ 0x94)) != ((0x52 ^ 0x6E) & ~(0x56 ^ 0x6A))) {
                return false;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static boolean lIIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlll(int n2) {
        return n2 > 0;
    }

    static {
        d.lIIlIIII();
        d.lIIIllll();
    }

    private static  boolean h(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1164]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[36])) {
            n2 = lllll[1];

            if (3 == (0x68 ^ 0x74 ^ (0xAA ^ 0xB2))) {
                return ((0xC2 ^ 0x86 ^ 2) & (0x46 ^ 0x77 ^ (0xE0 ^ 0x97) ^ -1)) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static  boolean b(WorldArea worldArea) {
        boolean bl;
        if (d.lIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = lllll[1];

            if (((0xD5 ^ 0x8A) & ~(0x1D ^ 0x42)) != 0) {
                return false;
            }
        } else {
            bl = lllll[0];
        }
        return bl;
    }

    private static  boolean g(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1163]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[36])) {
            n2 = lllll[1];

            if ((0x32 ^ 0x37) == 0) {
                return (1 & ~1) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static  boolean b(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1159]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[56])) {
            n2 = lllll[1];

            if (2 == ((0xE7 ^ 0xB4 ^ (0x12 ^ 0x7E)) & (0x75 ^ 0x69 ^ (0xA4 ^ 0x87) ^ -1))) {
                return ((0x40 ^ 0x27 ^ (6 ^ 0x71)) & (2 ^ (8 ^ 0x1A) ^ -1)) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static  boolean c(WorldArea worldArea) {
        boolean bl;
        if (d.lIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = lllll[1];

            if ((0x71 ^ 0x5A ^ (0x6B ^ 0x45)) == 0) {
                return false;
            }
        } else {
            bl = lllll[0];
        }
        return bl;
    }

    private static boolean lIIlIllI(Object object) {
        return object == null;
    }

    private static  boolean a(WorldArea worldArea) {
        boolean bl;
        if (d.lIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = lllll[1];

            if (-(0xA7 ^ 0xA3) >= 0) {
                return false;
            }
        } else {
            bl = lllll[0];
        }
        return bl;
    }

    private static  boolean f(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1162]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[36])) {
            n2 = lllll[1];

            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }
}

