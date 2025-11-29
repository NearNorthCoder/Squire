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
package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-;

import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.a;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.c;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.e;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.n;
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

public class d {
    private static /* synthetic */ String[] lllII;
    private static /* synthetic */ int[] lllll;

    private static void lIIIllll() {
        lllII = new String[lllll[1194]];
        d.lllII[d.lllll[0]] = d."Opening scroll box";
        d.lllII[d.lllll[1]] = d."Open";
        d.lllII[d.lllll[5]] = d."Lever";
        d.lllII[d.lllll[6]] = d."Ardougne";
        d.lllII[d.lllll[7]] = d."Lever";
        d.lllII[d.lllll[8]] = d."Ardougne";
        d.lllII[d.lllll[10]] = d."Dropped valamore clue";
        d.lllII[d.lllll[11]] = d."Drop";
        d.lllII[d.lllll[13]] = d."Dropped valamore clue";
        d.lllII[d.lllll[14]] = d."Drop";
        d.lllII[d.lllll[18]] = d."Nav to fally crates";
        d.lllII[d.lllll[19]] = d."Searching crates";
        d.lllII[d.lllll[20]] = d."Crates";
        d.lllII[d.lllll[21]] = d."Search";
        d.lllII[d.lllll[4]] = d."Nav to yanille nw crate";
        d.lllII[d.lllll[25]] = d."Searching crates";
        d.lllII[d.lllll[26]] = d."Search";
        d.lllII[d.lllll[30]] = d."Nav to canafis meat crate";
        d.lllII[d.lllll[31]] = d."Searching crates";
        d.lllII[d.lllll[32]] = d."Search";
        d.lllII[d.lllll[36]] = d."Nav to cammy seer crate";
        d.lllII[d.lllll[37]] = d."Searching crates";
        d.lllII[d.lllll[38]] = d."Search";
        d.lllII[d.lllll[42]] = d."Nav to ranging guild nw crates";
        d.lllII[d.lllll[43]] = d."Searching crates";
        d.lllII[d.lllll[45]] = d."Search";
        d.lllII[d.lllll[49]] = d."Nav to hosidius fruit store crates";
        d.lllII[d.lllll[50]] = d."Searching crates";
        d.lllII[d.lllll[51]] = d."Crates";
        d.lllII[d.lllll[52]] = d."Search";
        d.lllII[d.lllll[56]] = d."Nav to haviks crates";
        d.lllII[d.lllll[57]] = d."Searching crates";
        d.lllII[d.lllll[59]] = d."Search";
        d.lllII[d.lllll[63]] = d."Nav to hosidus nw crates";
        d.lllII[d.lllll[64]] = d."Searching crates";
        d.lllII[d.lllll[65]] = d."Crates";
        d.lllII[d.lllll[66]] = d."Search";
        d.lllII[d.lllll[70]] = d."Nav to rimmington wheelbarrow";
        d.lllII[d.lllll[71]] = d."Searching wheelbarrow";
        d.lllII[d.lllll[72]] = d."Wheelbarrow";
        d.lllII[d.lllll[73]] = d."Search";
        d.lllII[d.lllll[77]] = d."Nav to burthrope pub crates";
        d.lllII[d.lllll[78]] = d."Searching crates";
        d.lllII[d.lllll[80]] = d."Search";
        d.lllII[d.lllll[84]] = d."Nav to port khzard gen store crates";
        d.lllII[d.lllll[85]] = d."Searching crates";
        d.lllII[d.lllll[86]] = d."Crate";
        d.lllII[d.lllll[87]] = d."Search";
        d.lllII[d.lllll[91]] = d."Nav to ardy church crates";
        d.lllII[d.lllll[92]] = d."Searching crates";
        d.lllII[d.lllll[93]] = d."Search";
        d.lllII[d.lllll[97]] = d."Nav rimmington craftstore crates";
        d.lllII[d.lllll[98]] = d."Searching crates";
        d.lllII[d.lllll[99]] = d."Crate";
        d.lllII[d.lllll[100]] = d."Search";
        d.lllII[d.lllll[104]] = d."Nav to barb village crates";
        d.lllII[d.lllll[105]] = d."Searching crates";
        d.lllII[d.lllll[106]] = d."Crates";
        d.lllII[d.lllll[107]] = d."Search";
        d.lllII[d.lllll[109]] = d."Nav to fally crates";
        d.lllII[d.lllll[110]] = d."Searching crates";
        d.lllII[d.lllll[111]] = d."Crates";
        d.lllII[d.lllll[112]] = d."Search";
        d.lllII[d.lllll[116]] = d."Nav to burthrope nw camp boxes";
        d.lllII[d.lllll[117]] = d."Searching boxes";
        d.lllII[d.lllll[118]] = d."Boxes";
        d.lllII[d.lllll[119]] = d."Search";
        d.lllII[d.lllll[123]] = d."Nav to goblin house boxes";
        d.lllII[d.lllll[124]] = d."Searching boxes";
        d.lllII[d.lllll[125]] = d."Boxes";
        d.lllII[d.lllll[126]] = d."Search";
        d.lllII[d.lllll[130]] = d."Nav to al kharid silk boxes";
        d.lllII[d.lllll[131]] = d."Searching boxes";
        d.lllII[d.lllll[132]] = d."Boxes";
        d.lllII[d.lllll[133]] = d."Search";
        d.lllII[d.lllll[137]] = d."Nav to crystal chest boxes";
        d.lllII[d.lllll[138]] = d."Searching boxes";
        d.lllII[d.lllll[139]] = d."Boxes";
        d.lllII[d.lllll[140]] = d."Search";
        d.lllII[d.lllll[144]] = d."Nav to digsite bush";
        d.lllII[d.lllll[145]] = d."Searching bush";
        d.lllII[d.lllll[146]] = d."Bush";
        d.lllII[d.lllll[147]] = d."Search";
        d.lllII[d.lllll[151]] = d."Nav to al kharid gem house crate";
        d.lllII[d.lllll[152]] = d."Searching crate";
        d.lllII[d.lllll[153]] = d."Crate";
        d.lllII[d.lllll[154]] = d."Search";
        d.lllII[d.lllll[158]] = d."Nav to varrock horviks crates";
        d.lllII[d.lllll[159]] = d."Searching crates";
        d.lllII[d.lllll[160]] = d."Search";
        d.lllII[d.lllll[163]] = d."Nav to lumby s tower crates";
        d.lllII[d.lllll[164]] = d."Searching crates";
        d.lllII[d.lllll[165]] = d."Crate";
        d.lllII[d.lllll[166]] = d."Search";
        d.lllII[d.lllll[169]] = d."Nav to taverly sword shop boxes";
        d.lllII[d.lllll[170]] = d."Searching boxes";
        d.lllII[d.lllll[171]] = d."Boxes";
        d.lllII[d.lllll[172]] = d."Search";
        d.lllII[d.lllll[176]] = d."Nav to silver merchant boxes";
        d.lllII[d.lllll[177]] = d."Searching boxes";
        d.lllII[d.lllll[179]] = d."Search";
        d.lllII[d.lllll[183]] = d."Nav to sw varrock house boxes";
        d.lllII[d.lllll[184]] = d."Searching boxes";
        d.lllII[d.lllll[186]] = d."Search";
        d.lllII[d.lllll[190]] = d."Nav to dwarven mine pickaxe shop";
        d.lllII[d.lllll[194]] = d."Break";
        d.lllII[d.lllll[199]] = d."Searching boxes";
        d.lllII[d.lllll[200]] = d."Search";
        d.lllII[d.lllll[204]] = d."Nav to al kharid palace top chest";
        d.lllII[d.lllll[205]] = d."Searching chest";
        d.lllII[d.lllll[206]] = d."Open";
        d.lllII[d.lllll[207]] = d."Open";
        d.lllII[d.lllll[211]] = d."Nav dwarve mine arrow shop chest";
        d.lllII[d.lllll[214]] = d."Break";
        d.lllII[d.lllll[215]] = d."Searching chest";
        d.lllII[d.lllll[216]] = d."Open";
        d.lllII[d.lllll[217]] = d."Open";
        d.lllII[d.lllll[221]] = d."Nav to camelot castle 2nd chest";
        d.lllII[d.lllll[222]] = d."Searching chest";
        d.lllII[d.lllll[223]] = d."Open";
        d.lllII[d.lllll[224]] = d."Open";
        d.lllII[d.lllll[225]] = d."Search";
        d.lllII[d.lllll[226]] = d."Search";
        d.lllII[d.lllll[230]] = d."Nav to barb village chest";
        d.lllII[d.lllll[231]] = d."Searching chest";
        d.lllII[d.lllll[232]] = d."Open";
        d.lllII[d.lllll[233]] = d."Open";
        d.lllII[d.lllll[237]] = d."Nav to aggie house wardrobe";
        d.lllII[d.lllll[238]] = d."Searching wardrobe";
        d.lllII[d.lllll[239]] = d."Open";
        d.lllII[d.lllll[240]] = d."Open";
        d.lllII[d.lllll[244]] = d."Nav to edgeville coffin";
        d.lllII[d.lllll[245]] = d."Searching coffin";
        d.lllII[d.lllll[246]] = d."Open";
        d.lllII[d.lllll[247]] = d."Open";
        d.lllII[d.lllll[250]] = d."Nav to fally sw house chest";
        d.lllII[d.lllll[251]] = d."Searching chest";
        d.lllII[d.lllll[252]] = d."Open";
        d.lllII[d.lllll[253]] = d."Open";
        d.lllII[d.lllll[256]] = d."Nav upstairs port sarmin food chest";
        d.lllII[d.lllll[257]] = d."Searching chest";
        d.lllII[d.lllll[258]] = d."Open";
        d.lllII[d.lllll[259]] = d."Open";
        d.lllII[d.lllll[263]] = d."Nav to lumby 1st floor duke chest";
        d.lllII[d.lllll[264]] = d."Searching chest";
        d.lllII[d.lllll[265]] = d."Open";
        d.lllII[d.lllll[266]] = d."Open";
        d.lllII[d.lllll[270]] = d."Nav to freds chest";
        d.lllII[d.lllll[271]] = d."Searching chest";
        d.lllII[d.lllll[272]] = d."Open";
        d.lllII[d.lllll[273]] = d."Open";
        d.lllII[d.lllll[274]] = d."Search";
        d.lllII[d.lllll[275]] = d."Search";
        d.lllII[d.lllll[279]] = d."Nav to nw east ardy crate";
        d.lllII[d.lllll[280]] = d."Searching crates";
        d.lllII[d.lllll[282]] = d."Search";
        d.lllII[d.lllll[286]] = d."Nav to taverly small crate";
        d.lllII[d.lllll[287]] = d."Searching crates";
        d.lllII[d.lllll[288]] = d."Search";
        d.lllII[d.lllll[292]] = d."Nav to varrock farming crate";
        d.lllII[d.lllll[293]] = d."Searching crates";
        d.lllII[d.lllll[295]] = d."Search";
        d.lllII[d.lllll[299]] = d."Nav to east bank ardy crate";
        d.lllII[d.lllll[300]] = d."Searching crates";
        d.lllII[d.lllll[302]] = d."Search";
        d.lllII[d.lllll[306]] = d."Nav to s ardy church crate";
        d.lllII[d.lllll[307]] = d."Searching crates";
        d.lllII[d.lllll[308]] = d."Search";
        d.lllII[d.lllll[311]] = d."Nav to varrock castle kitchen";
        d.lllII[d.lllll[312]] = d."Searching crate";
        d.lllII[d.lllll[314]] = d."Search";
        d.lllII[d.lllll[318]] = d."Nav to port sarim fish store";
        d.lllII[d.lllll[319]] = d."Searching crate";
        d.lllII[d.lllll[321]] = d."Search";
        d.lllII[d.lllll[325]] = d."Nav to varrock w bank basement crate";
        d.lllII[d.lllll[326]] = d."Searching crate";
        d.lllII[d.lllll[327]] = d."Crate";
        d.lllII[d.lllll[328]] = d."Search";
        d.lllII[d.lllll[332]] = d."Nav to top of draynor manor";
        d.lllII[d.lllll[333]] = d."Searching crate";
        d.lllII[d.lllll[335]] = d."Search";
        d.lllII[d.lllll[339]] = d."Nav to top of fally east house";
        d.lllII[d.lllll[340]] = d."Searching crate";
        d.lllII[d.lllll[341]] = d."Open";
        d.lllII[d.lllll[342]] = d."Crates";
        d.lllII[d.lllll[343]] = d."Search";
        d.lllII[d.lllll[347]] = d."Nav to monastery bookcase";
        d.lllII[d.lllll[348]] = d."Searching bookcase";
        d.lllII[d.lllll[349]] = d."Bookcase";
        d.lllII[d.lllll[350]] = d."Search";
        d.lllII[d.lllll[353]] = d."Nav father urhneys bookcase";
        d.lllII[d.lllll[354]] = d."Searching bookcase";
        d.lllII[d.lllll[355]] = d."Bookcase";
        d.lllII[d.lllll[356]] = d."Search";
        d.lllII[d.lllll[360]] = d."Nav to wizard tower bookcase";
        d.lllII[d.lllll[361]] = d."Searching bookcase";
        d.lllII[d.lllll[362]] = d."Search";
        d.lllII[d.lllll[365]] = d."Nav to father urhney lumby swamp bookcase";
        d.lllII[d.lllll[366]] = d."Searching bookcase";
        d.lllII[d.lllll[367]] = d."Bookcase";
        d.lllII[d.lllll[368]] = d."Search";
        d.lllII[d.lllll[372]] = d."Nav to taverly drawers";
        d.lllII[d.lllll[373]] = d."Searching drawers";
        d.lllII[d.lllll[374]] = d."Open";
        d.lllII[d.lllll[375]] = d."Drawers";
        d.lllII[d.lllll[376]] = d."Open";
        d.lllII[d.lllll[377]] = d."Open";
        d.lllII[d.lllll[378]] = d."Search";
        d.lllII[d.lllll[379]] = d."Search";
        d.lllII[d.lllll[382]] = d."Nav to yanille hunting drawers";
        d.lllII[d.lllll[383]] = d."Searching drawers";
        d.lllII[d.lllll[384]] = d."Drawers";
        d.lllII[d.lllll[385]] = d."Open";
        d.lllII[d.lllll[386]] = d."Open";
        d.lllII[d.lllll[387]] = d."Search";
        d.lllII[d.lllll[388]] = d."Search";
        d.lllII[d.lllll[392]] = d."Nav to gertrudes drawers";
        d.lllII[d.lllll[393]] = d."Searching drawers";
        d.lllII[d.lllll[394]] = d."Drawers";
        d.lllII[d.lllll[395]] = d."Open";
        d.lllII[d.lllll[396]] = d."Open";
        d.lllII[d.lllll[397]] = d."Search";
        d.lllII[d.lllll[398]] = d."Search";
        d.lllII[d.lllll[402]] = d."Nav to ardy castle pub drawers";
        d.lllII[d.lllll[403]] = d."Searching drawers";
        d.lllII[d.lllll[404]] = d."Drawers";
        d.lllII[d.lllll[405]] = d."Open";
        d.lllII[d.lllll[406]] = d."Open";
        d.lllII[d.lllll[407]] = d."Search";
        d.lllII[d.lllll[408]] = d."Search";
        d.lllII[d.lllll[412]] = d."Nav to draynor north drawers";
        d.lllII[d.lllll[413]] = d."Searching drawers";
        d.lllII[d.lllll[414]] = d."Open";
        d.lllII[d.lllll[415]] = d."Drawers";
        d.lllII[d.lllll[416]] = d."Open";
        d.lllII[d.lllll[417]] = d."Open";
        d.lllII[d.lllll[418]] = d."Search";
        d.lllII[d.lllll[419]] = d."Search";
        d.lllII[d.lllll[422]] = d."Nav to betty mage shop drawers";
        d.lllII[d.lllll[423]] = d."Searching drawers";
        d.lllII[d.lllll[424]] = d."Open";
        d.lllII[d.lllll[425]] = d."Open";
        d.lllII[d.lllll[426]] = d."Open";
        d.lllII[d.lllll[427]] = d."Search";
        d.lllII[d.lllll[428]] = d."Search";
        d.lllII[d.lllll[432]] = d."Nav to fally south house drawers";
        d.lllII[d.lllll[433]] = d."Searching drawers";
        d.lllII[d.lllll[434]] = d."Open";
        d.lllII[d.lllll[435]] = d."Open";
        d.lllII[d.lllll[436]] = d."Search";
        d.lllII[d.lllll[437]] = d."Search";
        d.lllII[d.lllll[440]] = d."Nav to catherby archery shop drawers";
        d.lllII[d.lllll[441]] = d."Searching drawers";
        d.lllII[d.lllll[442]] = d."Drawers";
        d.lllII[d.lllll[443]] = d."Open";
        d.lllII[d.lllll[444]] = d."Open";
        d.lllII[d.lllll[445]] = d."Search";
        d.lllII[d.lllll[446]] = d."Search";
        d.lllII[d.lllll[448]] = d."Nav to varrock clothes upstairs drawers";
        d.lllII[d.lllll[449]] = d."Searching drawers";
        d.lllII[d.lllll[450]] = d."Drawers";
        d.lllII[d.lllll[451]] = d."Open";
        d.lllII[d.lllll[452]] = d."Open";
        d.lllII[d.lllll[453]] = d."Search";
        d.lllII[d.lllll[454]] = d."Search";
        d.lllII[d.lllll[458]] = d."Nav to fally shield drawers";
        d.lllII[d.lllll[459]] = d."Searching drawers";
        d.lllII[d.lllll[460]] = d."Drawers";
        d.lllII[d.lllll[461]] = d."Open";
        d.lllII[d.lllll[462]] = d."Open";
        d.lllII[d.lllll[463]] = d."Search";
        d.lllII[d.lllll[464]] = d."Search";
        d.lllII[d.lllll[468]] = d."Nav varrock e bank upstairs drawers";
        d.lllII[d.lllll[469]] = d."Searching drawers";
        d.lllII[d.lllll[470]] = d."Drawers";
        d.lllII[d.lllll[471]] = d."Open";
        d.lllII[d.lllll[472]] = d."Open";
        d.lllII[d.lllll[473]] = d."Search";
        d.lllII[d.lllll[474]] = d."Search";
        d.lllII[d.lllll[478]] = d."Nav fally chainmail drawers";
        d.lllII[d.lllll[479]] = d."Searching drawers";
        d.lllII[d.lllll[480]] = d."Open";
        d.lllII[d.lllll[481]] = d."Open";
        d.lllII[d.lllll[482]] = d."Search";
        d.lllII[d.lllll[483]] = d."Search";
        d.lllII[d.lllll[486]] = d."Nav to catherby drawers";
        d.lllII[d.lllll[487]] = d."Searching drawers";
        d.lllII[d.lllll[488]] = d."Drawers";
        d.lllII[d.lllll[489]] = d."Open";
        d.lllII[d.lllll[490]] = d."Open";
        d.lllII[d.lllll[491]] = d."Search";
        d.lllII[d.lllll[492]] = d."Search";
        d.lllII[d.lllll[496]] = d."Nav to ardy market drawers";
        d.lllII[d.lllll[497]] = d."Searching drawers";
        d.lllII[d.lllll[498]] = d."Drawers";
        d.lllII[d.lllll[499]] = d."Open";
        d.lllII[d.lllll[500]] = d."Open";
        d.lllII[d.lllll[501]] = d."Search";
        d.lllII[d.lllll[502]] = d."Search";
        d.lllII[d.lllll[506]] = d."Nav to hosidius south tent drawers";
        d.lllII[d.lllll[507]] = d."Searching drawers";
        d.lllII[d.lllll[508]] = d."Drawers";
        d.lllII[d.lllll[509]] = d."Open";
        d.lllII[d.lllll[510]] = d."Open";
        d.lllII[d.lllll[511]] = d."Search";
        d.lllII[d.lllll[512]] = d."Search";
        d.lllII[d.lllll[515]] = d."Nav camelot spin wheel drawers";
        d.lllII[d.lllll[516]] = d."Searching drawers";
        d.lllII[d.lllll[517]] = d."Drawers";
        d.lllII[d.lllll[518]] = d."Open";
        d.lllII[d.lllll[519]] = d."Open";
        d.lllII[d.lllll[520]] = d."Search";
        d.lllII[d.lllll[521]] = d."Search";
        d.lllII[d.lllll[524]] = d."Nav to burthrope drawers";
        d.lllII[d.lllll[525]] = d."Searching drawers";
        d.lllII[d.lllll[526]] = d."Open";
        d.lllII[d.lllll[527]] = d."Drawers";
        d.lllII[d.lllll[528]] = d."Open";
        d.lllII[d.lllll[529]] = d."Open";
        d.lllII[d.lllll[530]] = d."Search";
        d.lllII[d.lllll[531]] = d."Search";
        d.lllII[d.lllll[534]] = d."Nav to rimmington drawers";
        d.lllII[d.lllll[535]] = d."Searching drawers";
        d.lllII[d.lllll[536]] = d."Drawers";
        d.lllII[d.lllll[537]] = d."Open";
        d.lllII[d.lllll[538]] = d."Open";
        d.lllII[d.lllll[539]] = d."Search";
        d.lllII[d.lllll[540]] = d."Search";
        d.lllII[d.lllll[544]] = d."Nav to port sarim jail bucket";
        d.lllII[d.lllll[547]] = d."Shantay";
        d.lllII[d.lllll[548]] = d."Shantay";
        d.lllII[d.lllll[549]] = d."Shantay";
        d.lllII[d.lllll[550]] = d."What is this place?";
        d.lllII[d.lllll[551]] = d."I am definitely an outlaw, prepare to die!";
        d.lllII[d.lllll[552]] = d."No thanks, you're not having my money.";
        d.lllII[d.lllll[553]] = d."No, do your worst!";
        d.lllII[d.lllll[554]] = d."Searching bucket";
        d.lllII[d.lllll[555]] = d."Bucket";
        d.lllII[d.lllll[556]] = d."Search";
        d.lllII[d.lllll[557]] = d."Search";
        d.lllII[d.lllll[561]] = d."Wayne";
        d.lllII[d.lllll[562]] = d."Nav to Wayne";
        d.lllII[d.lllll[563]] = d."Wayne";
        d.lllII[d.lllll[564]] = d."Wayne";
        d.lllII[d.lllll[567]] = d."Hans";
        d.lllII[d.lllll[568]] = d."Nav to Hans";
        d.lllII[d.lllll[569]] = d."Hans";
        d.lllII[d.lllll[570]] = d."Hans";
        d.lllII[d.lllll[574]] = d."Ermin";
        d.lllII[d.lllll[575]] = d."Nav to Ermin";
        d.lllII[d.lllll[576]] = d."Ermin";
        d.lllII[d.lllll[577]] = d."Ermin";
        d.lllII[d.lllll[580]] = d."Sir Kay";
        d.lllII[d.lllll[581]] = d."Nav to Sir Kay";
        d.lllII[d.lllll[79]] = d."Sir Kay";
        d.lllII[d.lllll[301]] = d."Sir Kay";
        d.lllII[d.lllll[281]] = d."Nav to Squire";
        d.lllII[d.lllll[44]] = d."Squire";
        d.lllII[d.lllll[586]] = d."Lucy";
        d.lllII[d.lllll[587]] = d."Nav to Lucy";
        d.lllII[d.lllll[588]] = d."Lucy";
        d.lllII[d.lllll[178]] = d."Lucy";
        d.lllII[d.lllll[592]] = d."Rusty";
        d.lllII[d.lllll[593]] = d."Nav to Rusty";
        d.lllII[d.lllll[594]] = d."Rusty";
        d.lllII[d.lllll[595]] = d."Rusty";
        d.lllII[d.lllll[598]] = d."Doric";
        d.lllII[d.lllll[599]] = d."Nav to Doric";
        d.lllII[d.lllll[600]] = d."Doric";
        d.lllII[d.lllll[601]] = d."Doric";
        d.lllII[d.lllll[605]] = d."Charles";
        d.lllII[d.lllll[606]] = d."Nav to Charles";
        d.lllII[d.lllll[607]] = d."Charles";
        d.lllII[d.lllll[608]] = d."Charles";
        d.lllII[d.lllll[611]] = d."Arhein";
        d.lllII[d.lllll[612]] = d."Nav to Arhein";
        d.lllII[d.lllll[613]] = d."Arhein";
        d.lllII[d.lllll[614]] = d."Arhein";
        d.lllII[d.lllll[617]] = d."Gaius";
        d.lllII[d.lllll[618]] = d."Nav to Gaius";
        d.lllII[d.lllll[619]] = d."Gaius";
        d.lllII[d.lllll[620]] = d."Gaius";
        d.lllII[d.lllll[624]] = d."Zeke";
        d.lllII[d.lllll[625]] = d."Nav to Zeke";
        d.lllII[d.lllll[626]] = d."Zeke";
        d.lllII[d.lllll[627]] = d."Zeke";
        d.lllII[d.lllll[631]] = d."Nav port sarim Bartender";
        d.lllII[d.lllll[632]] = d."Bartender";
        d.lllII[d.lllll[636]] = d."Nav varrock Bartender";
        d.lllII[d.lllll[637]] = d."Bartender";
        d.lllII[d.lllll[641]] = d."Cassie";
        d.lllII[d.lllll[642]] = d."Nav to Cassie";
        d.lllII[d.lllll[643]] = d."Cassie";
        d.lllII[d.lllll[644]] = d."Cassie";
        d.lllII[d.lllll[645]] = d."Cassie";
        d.lllII[d.lllll[649]] = d."Doomsayer";
        d.lllII[d.lllll[650]] = d."Nav to Doomsayer";
        d.lllII[d.lllll[651]] = d."Doomsayer";
        d.lllII[d.lllll[652]] = d."Doomsayer";
        d.lllII[d.lllll[656]] = d."Ali the Leaflet Dropper";
        d.lllII[d.lllll[657]] = d."Nav to Ali the Leaflet Dropper";
        d.lllII[d.lllll[658]] = d."Ali the Leaflet Dropper";
        d.lllII[d.lllll[659]] = d."Ali the Leaflet Dropper";
        d.lllII[d.lllll[662]] = d."Sarah";
        d.lllII[d.lllll[663]] = d."Nav to Sarah";
        d.lllII[d.lllll[664]] = d."Sarah";
        d.lllII[d.lllll[665]] = d."Sarah";
        d.lllII[d.lllll[669]] = d."The Face";
        d.lllII[d.lllll[670]] = d."Nav to The Face";
        d.lllII[d.lllll[671]] = d."The Face";
        d.lllII[d.lllll[672]] = d."The Face";
        d.lllII[d.lllll[675]] = d."Nav to Tool Leprechaun";
        d.lllII[d.lllll[676]] = d."Tool Leprechaun";
        d.lllII[d.lllll[680]] = d."Tynan";
        d.lllII[d.lllll[681]] = d."Nav to Tynan";
        d.lllII[d.lllll[682]] = d."Tynan";
        d.lllII[d.lllll[683]] = d."Tynan";
        d.lllII[d.lllll[687]] = d."Ned";
        d.lllII[d.lllll[688]] = d."Nav to Ned";
        d.lllII[d.lllll[689]] = d."Ned";
        d.lllII[d.lllll[690]] = d."Ned";
        d.lllII[d.lllll[694]] = d."Ellis";
        d.lllII[d.lllll[695]] = d."Nav to Ellis";
        d.lllII[d.lllll[696]] = d."Ellis";
        d.lllII[d.lllll[697]] = d."Ellis";
        d.lllII[d.lllll[700]] = d."Vannaka";
        d.lllII[d.lllll[701]] = d."Nav to Vannaka";
        d.lllII[d.lllll[702]] = d."Vannaka";
        d.lllII[d.lllll[703]] = d."Vannaka";
        d.lllII[d.lllll[706]] = d."Doris";
        d.lllII[d.lllll[707]] = d."Nav to Doris";
        d.lllII[d.lllll[708]] = d."Doris";
        d.lllII[d.lllll[709]] = d."Doris";
        d.lllII[d.lllll[713]] = d."Konoo";
        d.lllII[d.lllll[714]] = d."Nav to Konoo";
        d.lllII[d.lllll[739]] = d."Hopping to find Konoo";
        d.lllII[d.lllll[740]] = d."Konoo";
        d.lllII[d.lllll[741]] = d."Konoo";
        d.lllII[d.lllll[745]] = d."Apothecary";
        d.lllII[d.lllll[746]] = d."Nav to Apothecary";
        d.lllII[d.lllll[747]] = d."Apothecary";
        d.lllII[d.lllll[748]] = d."Apothecary";
        d.lllII[d.lllll[751]] = d."Nav to Cook";
        d.lllII[d.lllll[752]] = d."Cook";
        d.lllII[d.lllll[756]] = d."Jatix";
        d.lllII[d.lllll[757]] = d."Nav to Jatix";
        d.lllII[d.lllll[758]] = d."Jatix";
        d.lllII[d.lllll[759]] = d."Jatix";
        d.lllII[d.lllll[762]] = d."Chemist";
        d.lllII[d.lllll[763]] = d."Nav to Chemist";
        d.lllII[d.lllll[764]] = d."Chemist";
        d.lllII[d.lllll[765]] = d."Chemist";
        d.lllII[d.lllll[769]] = d."Father Jean";
        d.lllII[d.lllll[770]] = d."Nav to Father Jean";
        d.lllII[d.lllll[771]] = d."Father Jean";
        d.lllII[d.lllll[772]] = d."Father Jean";
        d.lllII[d.lllll[776]] = d."Ambassador Spanfipple";
        d.lllII[d.lllll[777]] = d."Nav to Ambassador Spanfipple";
        d.lllII[d.lllll[781]] = d."Ambassador Spanfipple";
        d.lllII[d.lllll[782]] = d."Ambassador Spanfipple";
        d.lllII[d.lllll[786]] = d."Louisa";
        d.lllII[d.lllll[787]] = d."Nav to Louisa";
        d.lllII[d.lllll[788]] = d."Louisa";
        d.lllII[d.lllll[789]] = d."Louisa";
        d.lllII[d.lllll[793]] = d."Turael";
        d.lllII[d.lllll[794]] = d."Nav to Turael";
        d.lllII[d.lllll[795]] = d."Turael";
        d.lllII[d.lllll[796]] = d."Turael";
        d.lllII[d.lllll[799]] = d."The Lady of the Lake";
        d.lllII[d.lllll[800]] = d."Nav to Lady of the Lake";
        d.lllII[d.lllll[801]] = d."The Lady of the Lake";
        d.lllII[d.lllll[802]] = d."The Lady of the Lake";
        d.lllII[d.lllll[806]] = d."Herquin";
        d.lllII[d.lllll[807]] = d."Nav to Herquin";
        d.lllII[d.lllll[808]] = d."Herquin";
        d.lllII[d.lllll[809]] = d."Herquin";
        d.lllII[d.lllll[812]] = d."Hairdresser";
        d.lllII[d.lllll[813]] = d."Nav to Hairdresser";
        d.lllII[d.lllll[814]] = d."Hairdresser";
        d.lllII[d.lllll[815]] = d."Hairdresser";
        d.lllII[d.lllll[818]] = d."Jeed";
        d.lllII[d.lllll[819]] = d."Nav to Jeed";
        d.lllII[d.lllll[820]] = d."Jeed";
        d.lllII[d.lllll[821]] = d."Jeed";
        d.lllII[d.lllll[824]] = d."Morgan";
        d.lllII[d.lllll[825]] = d."Nav to Morgan";
        d.lllII[d.lllll[826]] = d."Morgan";
        d.lllII[d.lllll[827]] = d."Morgan";
        d.lllII[d.lllll[831]] = d."Captain Tobias";
        d.lllII[d.lllll[832]] = d."Nav to Captain Tobias";
        d.lllII[d.lllll[833]] = d."Captain Tobias";
        d.lllII[d.lllll[834]] = d."Captain Tobias";
        d.lllII[d.lllll[837]] = d."Cecilia";
        d.lllII[d.lllll[838]] = d."Nav to Cecilia";
        d.lllII[d.lllll[839]] = d."Cecilia";
        d.lllII[d.lllll[840]] = d."Cecilia";
        d.lllII[d.lllll[841]] = d."Vision";
        d.lllII[d.lllll[842]] = d."Cecilia";
        d.lllII[d.lllll[843]] = d."Yes, I have.";
        d.lllII[d.lllll[844]] = d."Yes, I have.";
        d.lllII[d.lllll[845]] = d."Cecilia";
        d.lllII[d.lllll[846]] = d."Cecilia";
        d.lllII[d.lllll[847]] = d."Yes, I have.";
        d.lllII[d.lllll[849]] = d."Cecilia";
        d.lllII[d.lllll[850]] = d."Nav to Cecilia";
        d.lllII[d.lllll[851]] = d."Cecilia";
        d.lllII[d.lllll[852]] = d."Cecilia";
        d.lllII[d.lllll[853]] = d."Rugged Terrain";
        d.lllII[d.lllll[854]] = d."Cecilia";
        d.lllII[d.lllll[855]] = d."Yes, I have.";
        d.lllII[d.lllll[856]] = d."Yes, I have.";
        d.lllII[d.lllll[857]] = d."Cecilia";
        d.lllII[d.lllll[858]] = d."Cecilia";
        d.lllII[d.lllll[859]] = d."Yes, I have.";
        d.lllII[d.lllll[861]] = d."Cecilia";
        d.lllII[d.lllll[862]] = d."Nav to Cecilia";
        d.lllII[d.lllll[863]] = d."Cecilia";
        d.lllII[d.lllll[864]] = d."Cecilia";
        d.lllII[d.lllll[865]] = d."The Forlorn Homestead";
        d.lllII[d.lllll[866]] = d."Cecilia";
        d.lllII[d.lllll[867]] = d."Yes, I have.";
        d.lllII[d.lllll[868]] = d."Cecilia";
        d.lllII[d.lllll[869]] = d."Cecilia";
        d.lllII[d.lllll[870]] = d."Yes, I have.";
        d.lllII[d.lllll[872]] = d."Cecilia";
        d.lllII[d.lllll[873]] = d."Nav to Cecilia";
        d.lllII[d.lllll[874]] = d."Cecilia";
        d.lllII[d.lllll[875]] = d."Cecilia";
        d.lllII[d.lllll[876]] = d."On the Shore";
        d.lllII[d.lllll[877]] = d."Cecilia";
        d.lllII[d.lllll[878]] = d."Yes, I have.";
        d.lllII[d.lllll[879]] = d."Yes, I have.";
        d.lllII[d.lllll[880]] = d."Cecilia";
        d.lllII[d.lllll[881]] = d."Cecilia";
        d.lllII[d.lllll[882]] = d."Yes, I have.";
        d.lllII[d.lllll[884]] = d."Cecilia";
        d.lllII[d.lllll[885]] = d."Nav to Cecilia";
        d.lllII[d.lllll[886]] = d."Cecilia";
        d.lllII[d.lllll[887]] = d."Cecilia";
        d.lllII[d.lllll[888]] = d."Alone";
        d.lllII[d.lllll[889]] = d."Cecilia";
        d.lllII[d.lllll[890]] = d."Yes, I have.";
        d.lllII[d.lllll[891]] = d."Yes, I have.";
        d.lllII[d.lllll[892]] = d."Cecilia";
        d.lllII[d.lllll[893]] = d."Cecilia";
        d.lllII[d.lllll[894]] = d."Yes, I have.";
        d.lllII[d.lllll[896]] = d."Cecilia";
        d.lllII[d.lllll[897]] = d."Nav to Cecilia";
        d.lllII[d.lllll[898]] = d."Cecilia";
        d.lllII[d.lllll[899]] = d."Cecilia";
        d.lllII[d.lllll[900]] = d."Tiptoe";
        d.lllII[d.lllll[901]] = d."Cecilia";
        d.lllII[d.lllll[902]] = d."Yes, I have.";
        d.lllII[d.lllll[903]] = d."Yes, I have.";
        d.lllII[d.lllll[904]] = d."Cecilia";
        d.lllII[d.lllll[198]] = d."Cecilia";
        d.lllII[d.lllll[197]] = d."Yes, I have.";
        d.lllII[d.lllll[911]] = d."Nav to top of mill ardy";
        d.lllII[d.lllll[917]] = d."Nav to wheat field lumby";
        d.lllII[d.lllll[928]] = d."Nav to wizards tower";
        d.lllII[d.lllll[935]] = d."Nav to fally party room";
        d.lllII[d.lllll[942]] = d."Nav to mudskipper point";
        d.lllII[d.lllll[953]] = d."Nav to lumby swamp";
        d.lllII[d.lllll[196]] = d."Just enter the shed.";
        d.lllII[d.lllll[958]] = d."Nav to fally gem shop, wave";
        d.lllII[d.lllll[963]] = d."Nav to pvp arena, bow";
        d.lllII[d.lllll[969]] = d."Nav to ardy zoo, raspberry";
        d.lllII[d.lllll[975]] = d."Nav to varrock rune store, jig";
        d.lllII[d.lllll[982]] = d."Nav to legends guild, bow";
        d.lllII[d.lllll[989]] = d."Nav to catherby beehives, jump for joy";
        d.lllII[d.lllll[995]] = d."Nav to sinclair mansion, laugh";
        d.lllII[d.lllll[1000]] = d."Nav to draynor market, yawn";
        d.lllII[d.lllll[1005]] = d."Nav to varrock castle, spin";
        d.lllII[d.lllll[1011]] = d."Nav to fishing guild, jig";
        d.lllII[d.lllll[1016]] = d."Nav to rimmington, spin";
        d.lllII[d.lllll[1022]] = d."Nav to draynor manor, spin";
        d.lllII[d.lllll[1026]] = d."Nav to keep le faye, raspberry";
        d.lllII[d.lllll[992]] = d."Nav to taverly s tone circle, cheer";
        d.lllII[d.lllll[1035]] = d."Nav to burthrope game world, cheer";
        d.lllII[d.lllll[1028]] = d."Drop";
        d.lllII[d.lllll[1036]] = d."Remove";
        d.lllII[d.lllll[1039]] = d."Nav to fish trawler, panic";
        d.lllII[d.lllll[1040]] = d."Drop";
        d.lllII[d.lllll[1041]] = d."Remove";
        d.lllII[d.lllll[1045]] = d."Nav to varrock castle, yawn";
        d.lllII[d.lllll[1051]] = d."Nav to draynor village, dance";
        d.lllII[d.lllll[1056]] = d."Nav to lumber yard, wave";
        d.lllII[d.lllll[1061]] = d."Nav to exam centre, clap";
        d.lllII[d.lllll[1064]] = d."Nav to al kharid, headbang";
        d.lllII[d.lllll[1070]] = d."Break";
        d.lllII[d.lllll[1071]] = d."Nav to port sarim, cheer";
        d.lllII[d.lllll[1077]] = d."Nav to rimmington mine, shrug";
        d.lllII[d.lllll[1084]] = d."Nav togrand exchange, dance";
        d.lllII[d.lllll[1089]] = d."Nav limestone mine panic";
        d.lllII[d.lllll[1093]] = d."Nav to east varrock mine";
        d.lllII[d.lllll[1095]] = d."Dig";
        d.lllII[d.lllll[1098]] = d."Nav to lumby spawn dig";
        d.lllII[d.lllll[1099]] = d."Dig";
        d.lllII[d.lllll[1102]] = d."Nav to north fally statue dig";
        d.lllII[d.lllll[1103]] = d."Dig";
        d.lllII[d.lllll[1106]] = d."Nav to champion guild dig";
        d.lllII[d.lllll[1107]] = d."Dig";
        d.lllII[d.lllll[1114]] = d."Nav to lake molch zeah dig";
        d.lllII[d.lllll[1115]] = d."Dig";
        d.lllII[d.lllll[1119]] = d."Nav to al khrid mine dig";
        d.lllII[d.lllll[1120]] = d."Dig";
        d.lllII[d.lllll[1124]] = d."Nav to itchois cabin dig";
        d.lllII[d.lllll[1125]] = d."Dig";
        d.lllII[d.lllll[1128]] = d."Nav to wizard tower dig";
        d.lllII[d.lllll[1129]] = d."Dig";
        d.lllII[d.lllll[1131]] = d."Nav to standing stones fally dig";
        d.lllII[d.lllll[1132]] = d."Dig";
        d.lllII[d.lllll[1136]] = d."Nav to McGrubers wood dig";
        d.lllII[d.lllll[1139]] = d."Break";
        d.lllII[d.lllll[1140]] = d."Dig";
        d.lllII[d.lllll[1143]] = d."Nav to north of fally standing stones";
        d.lllII[d.lllll[1144]] = d."Dig";
        d.lllII[d.lllll[1147]] = d."Nav to grand tree red mushrooms";
        d.lllII[d.lllll[1148]] = d."Dig";
        d.lllII[d.lllll[1151]] = d."Nav to great kourend statue";
        d.lllII[d.lllll[1152]] = d."Dig";
        d.lllII[d.lllll[1153]] = d."Yes, I have.";
        d.lllII[d.lllll[1154]] = d."dueling";
        d.lllII[d.lllll[1155]] = d."dueling";
        d.lllII[d.lllll[1156]] = d."teleport";
        d.lllII[d.lllll[1157]] = d."teleport";
        d.lllII[d.lllll[1158]] = d."Cook";
        d.lllII[d.lllll[1159]] = d."Cook";
        d.lllII[d.lllll[1058]] = d."Tool Leprechaun";
        d.lllII[d.lllll[1160]] = d."Tool Leprechaun";
        d.lllII[d.lllll[1161]] = d."Bartender";
        d.lllII[d.lllll[1162]] = d."Bartender";
        d.lllII[d.lllll[1163]] = d."Bartender";
        d.lllII[d.lllll[1164]] = d."Bartender";
        d.lllII[d.lllll[1165]] = d."Door";
        d.lllII[d.lllll[1166]] = d."Open";
        d.lllII[d.lllll[1080]] = d."Drawers";
        d.lllII[d.lllll[1168]] = d."Drawers";
        d.lllII[d.lllll[1043]] = d."Drawers";
        d.lllII[d.lllll[1171]] = d."Door";
        d.lllII[d.lllll[906]] = d."Open";
        d.lllII[d.lllll[1172]] = d."Door";
        d.lllII[d.lllll[1014]] = d."Open";
        d.lllII[d.lllll[1174]] = d."Door";
        d.lllII[d.lllll[1175]] = d."Open";
        d.lllII[d.lllll[1176]] = d."Bookcase";
        d.lllII[d.lllll[1177]] = d."Door";
        d.lllII[d.lllll[1178]] = d."Open";
        d.lllII[d.lllll[985]] = d."chest";
        d.lllII[d.lllll[1179]] = d."chest";
        d.lllII[d.lllll[1180]] = d."chest";
        d.lllII[d.lllll[1181]] = d."chest";
        d.lllII[d.lllll[1182]] = d."Coffin";
        d.lllII[d.lllll[1183]] = d."Wardrobe";
        d.lllII[d.lllll[913]] = d."chest";
        d.lllII[d.lllll[1184]] = d."chest";
        d.lllII[d.lllll[1185]] = d."chest";
        d.lllII[d.lllll[1186]] = d."chest";
        d.lllII[d.lllll[1013]] = d."Crate";
        d.lllII[d.lllll[1187]] = d."Crate";
        d.lllII[d.lllll[1188]] = d."Crate";
        d.lllII[d.lllll[1190]] = d."Scroll box";
        d.lllII[d.lllll[1191]] = d."easy";
        d.lllII[d.lllll[1192]] = d."Scroll box";
        d.lllII[d.lllll[1193]] = d."easy";
    }

    private static String lIIIllIl(String llllIlIlIlllllI, String llllIlIlIllllIl) {
        try {
            SecretKeySpec llllIlIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlIllIIIIII = Cipher.getInstance("Blowfish");
            llllIlIllIIIIII.init(lllll[5], llllIlIllIIIIIl);
            return new String(llllIlIllIIIIII.doFinal(Base64.getDecoder().decode(llllIlIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlIlIllllll) {
            llllIlIlIllllll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllI(String llllIlIllIIlIIl, String llllIlIllIIlIlI) {
        try {
            SecretKeySpec llllIlIllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIllIIlIlI.getBytes(StandardCharsets.UTF_8)), lllll[13]), "DES");
            Cipher llllIlIllIIllIl = Cipher.getInstance("DES");
            llllIlIllIIllIl.init(lllll[5], llllIlIllIIlllI);
            return new String(llllIlIllIIllIl.doFinal(Base64.getDecoder().decode(llllIlIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlIllIIllII) {
            llllIlIllIIllII.printStackTrace();
            return null;
        }
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
                0;
                if (-1 >= 0) {
                    return ((0x90 ^ 0x82) & ~(0x7F ^ 0x6D)) != 0;
                }
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
                    0;
                    if (((0xA9 ^ 0x84) & ~(0x24 ^ 9)) == 2) {
                        return ((0x3F ^ 0x2B) & ~(0x2E ^ 0x3A)) != 0;
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
                        0;
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
                0;
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
                0;
                return;
            }
            int[] nArray5 = new int[lllll[1]];
            nArray5[d.lllll[0]] = lllll[15];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[16], lllll[17], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[18]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[19]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[20]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[21]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray6 = new int[lllll[1]];
            nArray6[d.lllll[0]] = lllll[22];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[23], lllll[24], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[4]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[25]];
                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1188]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[1189], lllll[24], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];
                            0;
                            if (((28 + 14 - -47 + 71 ^ 101 + 103 - 85 + 38) & (0x15 ^ 6 ^ (0x72 ^ 0x5C) ^ -1)) < 0) {
                                return ((0xD1 ^ 0xB6 ^ (0x6F ^ 0x47)) & (0x79 ^ 0x23 ^ (0x59 ^ 0x4C) ^ -1)) != 0;
                            }
                        } else {
                            n2 = lllll[0];
                        }
                        return n2 != 0;
                    }).interact(lllII[lllll[26]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray7 = new int[lllll[1]];
            nArray7[d.lllll[0]] = lllll[27];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[28], lllll[29], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[30]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[31]];
                    TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1187]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[33], lllll[29], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];
                            0;
                            if (3 < 0) {
                                return ((0x3D ^ 0x23) & ~(0x8E ^ 0x90)) != 0;
                            }
                        } else {
                            n2 = lllll[0];
                        }
                        return n2 != 0;
                    }).interact(lllII[lllll[32]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray8 = new int[lllll[1]];
            nArray8[d.lllll[0]] = lllll[33];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[34], lllll[35], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[36]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[37]];
                    TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1013]])).interact(lllII[lllll[38]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray9 = new int[lllll[1]];
            nArray9[d.lllll[0]] = lllll[39];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[40], lllll[41], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[42]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[43]];
                    int[] nArray10 = new int[lllll[1]];
                    nArray10[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray10).interact(lllII[lllll[45]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
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
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[50]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[51]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[52]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray12 = new int[lllll[1]];
            nArray12[d.lllll[0]] = lllll[53];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[54], lllll[55], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[56]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[57]];
                    int[] nArray13 = new int[lllll[1]];
                    nArray13[d.lllll[0]] = lllll[58];
                    TileObjects.getNearest((int[])nArray13).interact(lllII[lllll[59]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
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
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[64]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[65]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[66]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray15 = new int[lllll[1]];
            nArray15[d.lllll[0]] = lllll[67];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[68], lllll[69], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[70]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[71]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[72]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[73]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray16 = new int[lllll[1]];
            nArray16[d.lllll[0]] = lllll[74];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[75], lllll[76], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[77]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1]) && d.lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Clues.c = lllII[lllll[78]];
                    int[] nArray17 = new int[lllll[1]];
                    nArray17[d.lllll[0]] = lllll[79];
                    TileObjects.getNearest((int[])nArray17).interact(lllII[lllll[80]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray18 = new int[lllll[1]];
            nArray18[d.lllll[0]] = lllll[81];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[82], lllll[83], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[84]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[85]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[86]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[87]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray19 = new int[lllll[1]];
            nArray19[d.lllll[0]] = lllll[88];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[89], lllll[90], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[91]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[92]];
                    int[] nArray20 = new int[lllll[1]];
                    nArray20[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray20).interact(lllII[lllll[93]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray21 = new int[lllll[1]];
            nArray21[d.lllll[0]] = lllll[94];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[95], lllll[96], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[97]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[98]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[99]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[100]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray22 = new int[lllll[1]];
            nArray22[d.lllll[0]] = lllll[101];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray22) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[102], lllll[103], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[104]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[105]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[106]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[107]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray23 = new int[lllll[1]];
            nArray23[d.lllll[0]] = lllll[108];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray23) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[16], lllll[17], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[109]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[110]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[111]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[112]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray24 = new int[lllll[1]];
            nArray24[d.lllll[0]] = lllll[113];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[114], lllll[115], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[116]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[117]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[118]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[119]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray25 = new int[lllll[1]];
            nArray25[d.lllll[0]] = lllll[120];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray25) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[121], lllll[122], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[123]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[124]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[125]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[126]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray26 = new int[lllll[1]];
            nArray26[d.lllll[0]] = lllll[127];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray26) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[128], lllll[129], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[130]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[131]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[132]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[133]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray27 = new int[lllll[1]];
            nArray27[d.lllll[0]] = lllll[134];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[135], lllll[136], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[137]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[138]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[139]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[140]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray28 = new int[lllll[1]];
            nArray28[d.lllll[0]] = lllll[141];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray28) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[142], lllll[143], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[144]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1]) && d.lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Clues.c = lllII[lllll[145]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[146]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[147]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray29 = new int[lllll[1]];
            nArray29[d.lllll[0]] = lllll[148];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray29) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[149], lllll[150], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[151]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[152]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[153]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[154]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray30 = new int[lllll[1]];
            nArray30[d.lllll[0]] = lllll[155];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[156], lllll[157], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[158]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[159]];
                    int[] nArray31 = new int[lllll[1]];
                    nArray31[d.lllll[0]] = lllll[58];
                    TileObjects.getNearest((int[])nArray31).interact(lllII[lllll[160]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray32 = new int[lllll[1]];
            nArray32[d.lllll[0]] = lllll[161];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray32) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[156], lllll[162], lllll[1]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[163]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[164]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[165]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[166]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray33 = new int[lllll[1]];
            nArray33[d.lllll[0]] = lllll[167];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray33) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[114], lllll[168], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[169]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[170]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[171]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[172]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray34 = new int[lllll[1]];
            nArray34[d.lllll[0]] = lllll[173];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[174], lllll[175], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[176]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[177]];
                    int[] nArray35 = new int[lllll[1]];
                    nArray35[d.lllll[0]] = lllll[178];
                    TileObjects.getNearest((int[])nArray35).interact(lllII[lllll[179]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray36 = new int[lllll[1]];
            nArray36[d.lllll[0]] = lllll[180];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[181], lllll[182], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[183]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[184]];
                    int[] nArray37 = new int[lllll[1]];
                    nArray37[d.lllll[0]] = lllll[185];
                    TileObjects.getNearest((int[])nArray37).interact(lllII[lllll[186]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
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
                            0;
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
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5]) && d.lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Clues.c = lllII[lllll[199]];
                    int[] nArray45 = new int[lllll[1]];
                    nArray45[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray45).interact(lllII[lllll[200]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray46 = new int[lllll[1]];
            nArray46[d.lllll[0]] = lllll[201];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray46) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[202], lllll[203], lllll[1]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[204]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                                0;
                            }
                        }
                        if (d.lIIlIIIl(Clues.e ? 1 : 0)) {
                            Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                            Time.sleepTicks((int)k.c(lllll[10], lllll[11]));
                            0;
                        }
                    }
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray4 = new String[lllll[1]];
                        stringArray4[d.lllll[0]] = lllII[lllll[225]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray4) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[226]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray5 = new String[lllll[1]];
                        stringArray5[d.lllll[0]] = lllII[lllll[274]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray5) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[275]]);
                            Time.sleepTicks((int)k.c(lllll[5], lllll[6]));
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[280]];
                    int[] nArray59 = new int[lllll[1]];
                    nArray59[d.lllll[0]] = lllll[281];
                    TileObjects.getNearest((int[])nArray59).interact(lllII[lllll[282]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray60 = new int[lllll[1]];
            nArray60[d.lllll[0]] = lllll[283];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray60) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[284], lllll[285], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[286]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[287]];
                    int[] nArray61 = new int[lllll[1]];
                    nArray61[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray61).interact(lllII[lllll[288]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray62 = new int[lllll[1]];
            nArray62[d.lllll[0]] = lllll[289];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray62) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[290], lllll[291], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[292]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[293]];
                    int[] nArray63 = new int[lllll[1]];
                    nArray63[d.lllll[0]] = lllll[294];
                    TileObjects.getNearest((int[])nArray63).interact(lllII[lllll[295]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray64 = new int[lllll[1]];
            nArray64[d.lllll[0]] = lllll[296];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray64) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[297], lllll[298], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[299]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[300]];
                    int[] nArray65 = new int[lllll[1]];
                    nArray65[d.lllll[0]] = lllll[301];
                    TileObjects.getNearest((int[])nArray65).interact(lllII[lllll[302]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray66 = new int[lllll[1]];
            nArray66[d.lllll[0]] = lllll[303];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray66) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[304], lllll[305], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[306]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[307]];
                    int[] nArray67 = new int[lllll[1]];
                    nArray67[d.lllll[0]] = lllll[44];
                    TileObjects.getNearest((int[])nArray67).interact(lllII[lllll[308]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray68 = new int[lllll[1]];
            nArray68[d.lllll[0]] = lllll[309];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray68) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[310], lllll[208], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[311]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[312]];
                    int[] nArray69 = new int[lllll[1]];
                    nArray69[d.lllll[0]] = lllll[313];
                    TileObjects.getNearest((int[])nArray69).interact(lllII[lllll[314]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray70 = new int[lllll[1]];
            nArray70[d.lllll[0]] = lllll[315];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray70) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[316], lllll[317], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[318]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[319]];
                    int[] nArray71 = new int[lllll[1]];
                    nArray71[d.lllll[0]] = lllll[320];
                    TileObjects.getNearest((int[])nArray71).interact(lllII[lllll[321]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray72 = new int[lllll[1]];
            nArray72[d.lllll[0]] = lllll[322];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray72) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[323], lllll[324], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[325]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[326]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[327]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[328]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray73 = new int[lllll[1]];
            nArray73[d.lllll[0]] = lllll[329];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray73) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[330], lllll[331], lllll[5]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[332]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[333]];
                    int[] nArray74 = new int[lllll[1]];
                    nArray74[d.lllll[0]] = lllll[334];
                    TileObjects.getNearest((int[])nArray74).interact(lllII[lllll[335]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray75 = new int[lllll[1]];
            nArray75[d.lllll[0]] = lllll[336];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray75) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[337], lllll[338], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[339]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                                0;
                                if (-(76 + 83 - 66 + 75 ^ 15 + 114 - -40 + 3) <= 0) return n2 != 0;
                                return ((33 + 121 - 148 + 127 ^ 103 + 15 - -29 + 6) & (91 + 14 - 71 + 111 ^ 120 + 71 - 109 + 59 ^ -1)) != 0;
                            }
                        }
                        n2 = lllll[0];
                        return n2 != 0;
                    });
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        llllIllIIIlIIll.interact(lllII[lllll[341]]);
                        Time.sleepTicks((int)lllll[6]);
                        0;
                    }
                    if (d.lIIlIllI(llllIllIIIlIIll)) {
                        String[] stringArray = new String[lllll[1]];
                        stringArray[d.lllll[0]] = lllII[lllll[342]];
                        TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[343]]);
                        Time.sleepTicks((int)lllll[6]);
                        0;
                    }
                }
            }
            int[] nArray76 = new int[lllll[1]];
            nArray76[d.lllll[0]] = lllll[344];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray76) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[345], lllll[346], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[347]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[348]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[349]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[350]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray77 = new int[lllll[1]];
            nArray77[d.lllll[0]] = lllll[351];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray77) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[2], lllll[352], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[353]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                    Clues.c = lllII[lllll[354]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[355]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[356]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray78 = new int[lllll[1]];
            nArray78[d.lllll[0]] = lllll[357];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray78) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[358], lllll[359], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[360]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[361]];
                    TileObjects.getNearest(tileObject -> tileObject.getName().contains(lllII[lllll[1176]])).interact(lllII[lllll[362]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray79 = new int[lllll[1]];
            nArray79[d.lllll[0]] = lllll[363];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray79) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[364], lllll[352], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[365]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[366]];
                    String[] stringArray = new String[lllll[1]];
                    stringArray[d.lllll[0]] = lllII[lllll[367]];
                    TileObjects.getNearest((String[])stringArray).interact(lllII[lllll[368]]);
                    Time.sleepTicks((int)lllll[6]);
                    0;
                }
            }
            int[] nArray80 = new int[lllll[1]];
            nArray80[d.lllll[0]] = lllll[369];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray80) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[370], lllll[371], lllll[0]);
                if (d.lIIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[372]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                                0;
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
                        0;
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
                                0;
                            }
                            String[] stringArray7 = new String[lllll[1]];
                            stringArray7[d.lllll[0]] = lllII[lllll[378]];
                            if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray7) ? 1 : 0)) {
                                llllIllIIIlIIlI2.interact(lllII[lllll[379]]);
                                Time.sleepTicks((int)lllll[6]);
                                0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray9 = new String[lllll[1]];
                        stringArray9[d.lllll[0]] = lllII[lllll[387]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray9) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[388]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray11 = new String[lllll[1]];
                        stringArray11[d.lllll[0]] = lllII[lllll[397]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray11) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[398]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray13 = new String[lllll[1]];
                        stringArray13[d.lllll[0]] = lllII[lllll[407]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray13) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[408]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                                0;
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
                        0;
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
                                0;
                            }
                            String[] stringArray15 = new String[lllll[1]];
                            stringArray15[d.lllll[0]] = lllII[lllll[418]];
                            if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray15) ? 1 : 0)) {
                                llllIllIIIlIIlI2.interact(lllII[lllll[419]]);
                                Time.sleepTicks((int)lllll[6]);
                                0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                                0;
                                if (-1 == -1) return n2 != 0;
                                return ((18 + 60 - -64 + 1 ^ 188 + 104 - 223 + 121) & (25 + 114 - -48 + 60 ^ 150 + 150 - 181 + 79 ^ -1)) != 0;
                            }
                        }
                        n2 = lllll[0];
                        return n2 != 0;
                    });
                    if (d.lIIlIIll(llllIllIIIlIIll)) {
                        llllIllIIIlIIll.interact(lllII[lllll[424]]);
                        Time.sleepTicks((int)lllll[6]);
                        0;
                    }
                    if (d.lIIlIllI(llllIllIIIlIIll) && d.lIIlIIll(llllIllIIIlIIlI2 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1043]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[421], lllll[1170], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];
                            0;
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
                            0;
                        }
                        String[] stringArray16 = new String[lllll[1]];
                        stringArray16[d.lllll[0]] = lllII[lllll[427]];
                        if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray16) ? 1 : 0)) {
                            llllIllIIIlIIlI2.interact(lllII[lllll[428]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[433]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1168]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[430], lllll[1169], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];
                            0;
                            if (3 < -1) {
                                return ((0x8D ^ 0x8A) & ~(0xC4 ^ 0xC3)) != 0;
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
                            0;
                        }
                        String[] stringArray17 = new String[lllll[1]];
                        stringArray17[d.lllll[0]] = lllII[lllll[436]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray17) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[437]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray19 = new String[lllll[1]];
                        stringArray19[d.lllll[0]] = lllII[lllll[445]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray19) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[446]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray21 = new String[lllll[1]];
                        stringArray21[d.lllll[0]] = lllII[lllll[453]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray21) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[454]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray23 = new String[lllll[1]];
                        stringArray23[d.lllll[0]] = lllII[lllll[463]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray23) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[464]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray25 = new String[lllll[1]];
                        stringArray25[d.lllll[0]] = lllII[lllll[473]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray25) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[474]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[5])) {
                    Clues.c = lllII[lllll[479]];
                    llllIllIIIlIIll = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (d.lIIlIIIl(tileObject.getName().contains(lllII[lllll[1080]]) ? 1 : 0) && d.lIIlIIIl(tileObject.getWorldLocation().equals((Object)new WorldPoint(lllll[532], lllll[477], lllll[0])) ? 1 : 0)) {
                            n2 = lllll[1];
                            0;
                            if (3 <= 0) {
                                return ((0x22 ^ 0x76) & ~(0x16 ^ 0x42)) != 0;
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
                            0;
                        }
                        String[] stringArray26 = new String[lllll[1]];
                        stringArray26[d.lllll[0]] = lllII[lllll[482]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray26) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[483]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray28 = new String[lllll[1]];
                        stringArray28[d.lllll[0]] = lllII[lllll[491]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray28) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[492]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray30 = new String[lllll[1]];
                        stringArray30[d.lllll[0]] = lllII[lllll[501]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray30) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[502]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray32 = new String[lllll[1]];
                        stringArray32[d.lllll[0]] = lllII[lllll[511]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray32) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[512]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray34 = new String[lllll[1]];
                        stringArray34[d.lllll[0]] = lllII[lllll[520]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray34) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[521]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                                0;
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
                        0;
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
                                0;
                            }
                            String[] stringArray36 = new String[lllll[1]];
                            stringArray36[d.lllll[0]] = lllII[lllll[530]];
                            if (d.lIIlIIIl(llllIllIIIlIIlI2.hasAction(stringArray36) ? 1 : 0)) {
                                llllIllIIIlIIlI2.interact(lllII[lllll[531]]);
                                Time.sleepTicks((int)lllll[6]);
                                0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
                        }
                        String[] stringArray38 = new String[lllll[1]];
                        stringArray38[d.lllll[0]] = lllII[lllll[539]];
                        if (d.lIIlIIIl(llllIllIIIlIIll.hasAction(stringArray38) ? 1 : 0)) {
                            llllIllIIIlIIll.interact(lllII[lllll[540]]);
                            Time.sleepTicks((int)lllll[6]);
                            0;
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
                        k.d((WorldPoint)llllIllIIIlIIll);
                        Time.sleepTicks((int)lllll[1]);
                        0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                if (d.lIIlIllI(NPCs.getNearest(arg_0 -> d.d((WorldPoint)llllIllIIIlIlII, arg_0)))) {
                    Clues.c = lllII[lllll[675]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                        0;
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
                        0;
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIlI(llllIllIIIlIIlI2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        k.a((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[25]) && d.lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                        Clues.c = lllII[lllll[739]];
                        k.ao();
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    0;
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
                            k.d((WorldPoint)llllIllIIIlIIlI2);
                        }
                    }
                    if (!d.lIIlIIIl(llllIllIIIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllll[780], lllll[775], lllll[0])), lllll[6])) {
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
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
                            0;
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[8])) {
                        int[] nArray148 = new int[lllll[6]];
                        nArray148[d.lllll[0]] = lllll[906];
                        nArray148[d.lllll[1]] = lllll[907];
                        nArray148[d.lllll[5]] = lllll[908];
                        k.d(nArray148);
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
                            0;
                        }
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray152 = new int[lllll[6]];
                        nArray152[d.lllll[0]] = lllll[906];
                        nArray152[d.lllll[1]] = lllll[913];
                        nArray152[d.lllll[5]] = lllll[914];
                        k.d(nArray152);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray156 = new int[lllll[6]];
                        nArray156[d.lllll[0]] = lllll[923];
                        nArray156[d.lllll[1]] = lllll[924];
                        nArray156[d.lllll[5]] = lllll[925];
                        k.d(nArray156);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray160 = new int[lllll[6]];
                        nArray160[d.lllll[0]] = lllll[930];
                        nArray160[d.lllll[1]] = lllll[931];
                        nArray160[d.lllll[5]] = lllll[932];
                        k.d(nArray160);
                        a.d();
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
                            0;
                        }
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray164 = new int[lllll[6]];
                        nArray164[d.lllll[0]] = lllll[937];
                        nArray164[d.lllll[1]] = lllll[938];
                        nArray164[d.lllll[5]] = lllll[939];
                        k.d(nArray164);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
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
                        k.d(nArray168);
                        a.d();
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray172 = new int[lllll[6]];
                        nArray172[d.lllll[0]] = lllll[955];
                        nArray172[d.lllll[1]] = lllll[956];
                        nArray172[d.lllll[5]] = lllll[957];
                        k.d(nArray172);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray176 = new int[lllll[6]];
                        nArray176[d.lllll[0]] = lllll[960];
                        nArray176[d.lllll[1]] = lllll[938];
                        nArray176[d.lllll[5]] = lllll[961];
                        k.d(nArray176);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray180 = new int[lllll[6]];
                        nArray180[d.lllll[0]] = lllll[965];
                        nArray180[d.lllll[1]] = lllll[966];
                        nArray180[d.lllll[5]] = lllll[967];
                        k.d(nArray180);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray184 = new int[lllll[5]];
                        nArray184[d.lllll[0]] = lllll[971];
                        nArray184[d.lllll[1]] = lllll[972];
                        k.d(nArray184);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray188 = new int[lllll[6]];
                        nArray188[d.lllll[0]] = lllll[977];
                        nArray188[d.lllll[1]] = lllll[978];
                        nArray188[d.lllll[5]] = lllll[979];
                        k.d(nArray188);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray192 = new int[lllll[6]];
                        nArray192[d.lllll[0]] = lllll[984];
                        nArray192[d.lllll[1]] = lllll[985];
                        nArray192[d.lllll[5]] = lllll[986];
                        k.d(nArray192);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray196 = new int[lllll[6]];
                        nArray196[d.lllll[0]] = lllll[991];
                        nArray196[d.lllll[1]] = lllll[992];
                        nArray196[d.lllll[5]] = lllll[993];
                        k.d(nArray196);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray200 = new int[lllll[6]];
                        nArray200[d.lllll[0]] = lllll[997];
                        nArray200[d.lllll[1]] = lllll[957];
                        nArray200[d.lllll[5]] = lllll[998];
                        k.d(nArray200);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray204 = new int[lllll[6]];
                        nArray204[d.lllll[0]] = lllll[1002];
                        nArray204[d.lllll[1]] = lllll[961];
                        nArray204[d.lllll[5]] = lllll[1003];
                        k.d(nArray204);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray208 = new int[lllll[6]];
                        nArray208[d.lllll[0]] = lllll[924];
                        nArray208[d.lllll[1]] = lllll[1007];
                        nArray208[d.lllll[5]] = lllll[1008];
                        k.d(nArray208);
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
                            0;
                        }
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray212 = new int[lllll[6]];
                        nArray212[d.lllll[0]] = lllll[1013];
                        nArray212[d.lllll[1]] = lllll[1014];
                        nArray212[d.lllll[5]] = lllll[938];
                        k.d(nArray212);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray216 = new int[lllll[6]];
                        nArray216[d.lllll[0]] = lllll[1018];
                        nArray216[d.lllll[1]] = lllll[997];
                        nArray216[d.lllll[5]] = lllll[1019];
                        k.d(nArray216);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray220 = new int[lllll[6]];
                        nArray220[d.lllll[0]] = lllll[1018];
                        nArray220[d.lllll[1]] = lllll[961];
                        nArray220[d.lllll[5]] = lllll[1024];
                        k.d(nArray220);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray224 = new int[lllll[6]];
                        nArray224[d.lllll[0]] = lllll[1028];
                        nArray224[d.lllll[1]] = lllll[1029];
                        nArray224[d.lllll[5]] = lllll[1030];
                        k.d(nArray224);
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
                    k.d(new int[lllll[0]]);
                    llllIllIIIlIlII = new WorldPoint(lllll[1033], lllll[1034], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1035]];
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        if (d.lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray226 = new int[lllll[1]];
                            nArray226[d.lllll[0]] = Clues.k;
                            Inventory.getFirst((int[])nArray226).interact(lllII[lllll[1028]]);
                            Time.sleepTicks((int)lllll[1]);
                            0;
                        }
                        if (d.lIIlIlll((llllIllIIIlIIll = Equipment.getAll()).size())) {
                            int llllIllIIIlIIlI2 = lllll[0];
                            while (d.lIIllIII(llllIllIIIlIIlI2, llllIllIIIlIIll.size())) {
                                ((Item)llllIllIIIlIIll.get(llllIllIIIlIIlI2)).interact(lllII[lllll[1036]]);
                                Time.sleepTicks((int)lllll[1]);
                                0;
                                if (d.lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                                    0;
                                    if (1 <= 3) break;
                                    return;
                                }
                                ++llllIllIIIlIIlI2;
                                0;
                                if (null == null) continue;
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
                    k.d(new int[lllll[0]]);
                    llllIllIIIlIlII = new WorldPoint(lllll[1038], lllll[952], lllll[0]);
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1039]];
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        if (d.lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                            int[] nArray228 = new int[lllll[1]];
                            nArray228[d.lllll[0]] = Clues.k;
                            Inventory.getFirst((int[])nArray228).interact(lllII[lllll[1040]]);
                            Time.sleepTicks((int)lllll[1]);
                            0;
                        }
                        if (d.lIIlIlll((llllIllIIIlIIll = Equipment.getAll()).size())) {
                            int llllIllIIIlIIlI2 = lllll[0];
                            while (d.lIIllIII(llllIllIIIlIIlI2, llllIllIIIlIIll.size())) {
                                ((Item)llllIllIIIlIIll.get(llllIllIIIlIIlI2)).interact(lllII[lllll[1041]]);
                                Time.sleepTicks((int)lllll[1]);
                                0;
                                if (d.lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                                    0;
                                    if (((0x8C ^ 0xA4) & ~(0x98 ^ 0xB0)) != -1) break;
                                    return;
                                }
                                ++llllIllIIIlIIlI2;
                                0;
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIllIIIlIlII), lllll[1])) {
                        int[] nArray232 = new int[lllll[6]];
                        nArray232[d.lllll[0]] = lllll[1043];
                        nArray232[d.lllll[1]] = lllll[907];
                        nArray232[d.lllll[5]] = lllll[1044];
                        k.d(nArray232);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray236 = new int[lllll[6]];
                        nArray236[d.lllll[0]] = lllll[960];
                        nArray236[d.lllll[1]] = lllll[1047];
                        nArray236[d.lllll[5]] = lllll[1048];
                        k.d(nArray236);
                        a.d();
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray240 = new int[lllll[6]];
                        nArray240[d.lllll[0]] = lllll[1053];
                        nArray240[d.lllll[1]] = lllll[938];
                        nArray240[d.lllll[5]] = lllll[1054];
                        k.d(nArray240);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray244 = new int[lllll[6]];
                        nArray244[d.lllll[0]] = lllll[925];
                        nArray244[d.lllll[1]] = lllll[1058];
                        nArray244[d.lllll[5]] = lllll[1024];
                        k.d(nArray244);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray248 = new int[lllll[6]];
                        nArray248[d.lllll[0]] = lllll[984];
                        nArray248[d.lllll[1]] = lllll[1024];
                        nArray248[d.lllll[5]] = lllll[1063];
                        k.d(nArray248);
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
                        0;
                    }
                    if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        Clues.c = lllII[lllll[1071]];
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray252 = new int[lllll[6]];
                        nArray252[d.lllll[0]] = lllll[961];
                        nArray252[d.lllll[1]] = lllll[1066];
                        nArray252[d.lllll[5]] = lllll[1067];
                        k.d(nArray252);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray256 = new int[lllll[6]];
                        nArray256[d.lllll[0]] = lllll[1073];
                        nArray256[d.lllll[1]] = lllll[951];
                        nArray256[d.lllll[5]] = lllll[1074];
                        k.d(nArray256);
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray260 = new int[lllll[6]];
                        nArray260[d.lllll[0]] = lllll[1079];
                        nArray260[d.lllll[1]] = lllll[1080];
                        nArray260[d.lllll[5]] = lllll[1081];
                        k.d(nArray260);
                        a.d();
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
                        k.d((WorldPoint)llllIllIIIlIlII);
                        Time.sleepTicks((int)lllll[1]);
                        0;
                    }
                    if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                        int[] nArray264 = new int[lllll[6]];
                        nArray264[d.lllll[0]] = lllll[966];
                        nArray264[d.lllll[1]] = lllll[1086];
                        nArray264[d.lllll[5]] = lllll[1087];
                        k.d(nArray264);
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
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray266 = new int[lllll[1]];
                    nArray266[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray266) ? 1 : 0)) {
                        int[] nArray267 = new int[lllll[1]];
                        nArray267[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray267).interact(lllII[lllll[1095]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
                    }
                }
            }
            int[] nArray268 = new int[lllll[1]];
            nArray268[d.lllll[0]] = lllll[1096];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray268) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1097], lllll[262], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1098]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray269 = new int[lllll[1]];
                    nArray269[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray269) ? 1 : 0)) {
                        int[] nArray270 = new int[lllll[1]];
                        nArray270[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray270).interact(lllII[lllll[1099]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
                    }
                }
            }
            int[] nArray271 = new int[lllll[1]];
            nArray271[d.lllll[0]] = lllll[1100];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray271) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[476], lllll[1101], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1102]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray272 = new int[lllll[1]];
                    nArray272[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray272) ? 1 : 0)) {
                        int[] nArray273 = new int[lllll[1]];
                        nArray273[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray273).interact(lllII[lllll[1103]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
                    }
                }
            }
            int[] nArray274 = new int[lllll[1]];
            nArray274[d.lllll[0]] = lllll[1104];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray274) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1105], lllll[1059], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1106]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray275 = new int[lllll[1]];
                    nArray275[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray275) ? 1 : 0)) {
                        int[] nArray276 = new int[lllll[1]];
                        nArray276[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray276).interact(lllII[lllll[1107]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
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
                        0;
                    }
                    Clues.c = lllII[lllll[1114]];
                    k.a((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray278 = new int[lllll[1]];
                    nArray278[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray278) ? 1 : 0)) {
                        int[] nArray279 = new int[lllll[1]];
                        nArray279[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray279).interact(lllII[lllll[1115]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
                    }
                }
            }
            int[] nArray280 = new int[lllll[1]];
            nArray280[d.lllll[0]] = lllll[1116];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray280) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1117], lllll[1118], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1119]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray281 = new int[lllll[1]];
                    nArray281[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray281) ? 1 : 0)) {
                        int[] nArray282 = new int[lllll[1]];
                        nArray282[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray282).interact(lllII[lllll[1120]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
                    }
                }
            }
            int[] nArray283 = new int[lllll[1]];
            nArray283[d.lllll[0]] = lllll[1121];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray283) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1122], lllll[1123], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1124]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray284 = new int[lllll[1]];
                    nArray284[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray284) ? 1 : 0)) {
                        int[] nArray285 = new int[lllll[1]];
                        nArray285[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray285).interact(lllII[lllll[1125]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
                    }
                }
            }
            int[] nArray286 = new int[lllll[1]];
            nArray286[d.lllll[0]] = lllll[1126];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray286) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[941], lllll[1127], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1128]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray287 = new int[lllll[1]];
                    nArray287[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray287) ? 1 : 0)) {
                        int[] nArray288 = new int[lllll[1]];
                        nArray288[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray288).interact(lllII[lllll[1129]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
                    }
                }
            }
            int[] nArray289 = new int[lllll[1]];
            nArray289[d.lllll[0]] = lllll[1130];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray289) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[248], lllll[750], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1131]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray290 = new int[lllll[1]];
                    nArray290[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray290) ? 1 : 0)) {
                        int[] nArray291 = new int[lllll[1]];
                        nArray291[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray291).interact(lllII[lllll[1132]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
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
                            0;
                        }
                    }
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray295 = new int[lllll[1]];
                    nArray295[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray295) ? 1 : 0)) {
                        int[] nArray296 = new int[lllll[1]];
                        nArray296[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray296).interact(lllII[lllll[1140]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
                    }
                }
            }
            int[] nArray297 = new int[lllll[1]];
            nArray297[d.lllll[0]] = lllll[1141];
            if (d.lIIlIIIl(Inventory.contains((int[])nArray297) ? 1 : 0)) {
                llllIllIIIlIlII = new WorldPoint(lllll[1142], lllll[635], lllll[0]);
                if (d.lIIlIIlI(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    Clues.c = lllII[lllll[1143]];
                    k.d((WorldPoint)llllIllIIIlIlII);
                    Time.sleepTicks((int)lllll[1]);
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray298 = new int[lllll[1]];
                    nArray298[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray298) ? 1 : 0)) {
                        int[] nArray299 = new int[lllll[1]];
                        nArray299[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray299).interact(lllII[lllll[1144]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
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
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray301 = new int[lllll[1]];
                    nArray301[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray301) ? 1 : 0)) {
                        int[] nArray302 = new int[lllll[1]];
                        nArray302[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray302).interact(lllII[lllll[1148]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
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
                    0;
                }
                if (d.lIIlIIIl(Players.getLocal().getWorldLocation().equals((Object)llllIllIIIlIlII) ? 1 : 0)) {
                    int[] nArray304 = new int[lllll[1]];
                    nArray304[d.lllll[0]] = lllll[1094];
                    if (d.lIIlIIIl(Inventory.contains((int[])nArray304) ? 1 : 0)) {
                        int[] nArray305 = new int[lllll[1]];
                        nArray305[d.lllll[0]] = lllll[1094];
                        Inventory.getFirst((int[])nArray305).interact(lllII[lllll[1152]]);
                        Time.sleepTicks((int)k.c(lllll[6], lllll[7]));
                        0;
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
                0;
                if (-1 <= 0) return n2 != 0;
                return ((0x19 ^ 0x78) & ~(0xFE ^ 0x9F)) != 0;
            }
        }
        n2 = lllll[0];
        return n2 != 0;
    }

    private static /* synthetic */ boolean d(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1160]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[56])) {
            n2 = lllll[1];
            0;
            if (null != null) {
                return ((77 + 118 - 137 + 178 ^ 153 + 33 - 97 + 99) & (0x4B ^ 0x3B ^ (0x1E ^ 0x3E) ^ -1)) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean c(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1058]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[56])) {
            n2 = lllll[1];
            0;
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

    private static /* synthetic */ boolean e(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1161]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[36])) {
            n2 = lllll[1];
            0;
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

    private static String lIIIllII(String llllIlIlIlIlllI, String llllIlIlIlIllIl) {
        llllIlIlIlIlllI = new String(Base64.getDecoder().decode(llllIlIlIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlIlIlIllII = new StringBuilder();
        char[] llllIlIlIlIlIll = llllIlIlIlIllIl.toCharArray();
        int llllIlIlIlIlIlI = lllll[0];
        char[] llllIlIlIlIIlII = llllIlIlIlIlllI.toCharArray();
        int llllIlIlIlIIIll = llllIlIlIlIIlII.length;
        int llllIlIlIlIIIlI = lllll[0];
        while (d.lIIllIII(llllIlIlIlIIIlI, llllIlIlIlIIIll)) {
            char llllIlIlIlIllll = llllIlIlIlIIlII[llllIlIlIlIIIlI];
            llllIlIlIlIllII.append((char)(llllIlIlIlIllll ^ llllIlIlIlIlIll[llllIlIlIlIlIlI % llllIlIlIlIlIll.length]));
            0;
            ++llllIlIlIlIlIlI;
            ++llllIlIlIlIIIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllIlIlIlIllII);
    }

    private static /* synthetic */ boolean a(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1158]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[56])) {
            n2 = lllll[1];
            0;
            if (((0x18 ^ 0x4C) & ~(0xC0 ^ 0x94)) != ((0x52 ^ 0x6E) & ~(0x56 ^ 0x6A))) {
                return ((0x6C ^ 0x4C) & ~(0xAA ^ 0x8A)) != 0;
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

    private static /* synthetic */ boolean h(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1164]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[36])) {
            n2 = lllll[1];
            0;
            if (3 == (0x68 ^ 0x74 ^ (0xAA ^ 0xB2))) {
                return ((0xC2 ^ 0x86 ^ 2) & (0x46 ^ 0x77 ^ (0xE0 ^ 0x97) ^ -1)) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean b(WorldArea worldArea) {
        boolean bl;
        if (d.lIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = lllll[1];
            0;
            if (((0xD5 ^ 0x8A) & ~(0x1D ^ 0x42)) != 0) {
                return ((0x58 ^ 0x76) & ~(0x78 ^ 0x56)) != 0;
            }
        } else {
            bl = lllll[0];
        }
        return bl;
    }

    private static /* synthetic */ boolean g(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1163]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[36])) {
            n2 = lllll[1];
            0;
            if ((0x32 ^ 0x37) == 0) {
                return (1 & ~1) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean b(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1159]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[56])) {
            n2 = lllll[1];
            0;
            if (2 == ((0xE7 ^ 0xB4 ^ (0x12 ^ 0x7E)) & (0x75 ^ 0x69 ^ (0xA4 ^ 0x87) ^ -1))) {
                return ((0x40 ^ 0x27 ^ (6 ^ 0x71)) & (2 ^ (8 ^ 0x1A) ^ -1)) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }

    private static /* synthetic */ boolean c(WorldArea worldArea) {
        boolean bl;
        if (d.lIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = lllll[1];
            0;
            if ((0x71 ^ 0x5A ^ (0x6B ^ 0x45)) == 0) {
                return ((15 + 26 - 28 + 203 ^ 72 + 74 - 55 + 66) & (0xA1 ^ 0x9B ^ 92 + 42 - 127 + 120 ^ -1)) != 0;
            }
        } else {
            bl = lllll[0];
        }
        return bl;
    }

    private static boolean lIIlIllI(Object object) {
        return object == null;
    }

    private static /* synthetic */ boolean a(WorldArea worldArea) {
        boolean bl;
        if (d.lIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            bl = lllll[1];
            0;
            if (-(0xA7 ^ 0xA3) >= 0) {
                return ((0x51 ^ 0x62) & ~(0x96 ^ 0xA5)) != 0;
            }
        } else {
            bl = lllll[0];
        }
        return bl;
    }

    private static void lIIlIIII() {
        lllll = new int[1195];
        d.lllll[0] = (0x5A ^ 0x18) & ~(0x36 ^ 0x74);
        d.lllll[1] = 1;
        d.lllll[2] = 0xFFFFED7F & 0x1ECD;
        d.lllll[3] = 0xFFFF8F5F & 0x7FED;
        d.lllll[4] = 0x4A ^ 0x44;
        d.lllll[5] = 2;
        d.lllll[6] = 3;
        d.lllll[7] = 0x9F ^ 0xC5 ^ (0x57 ^ 9);
        d.lllll[8] = 0x91 ^ 0xB0 ^ (0x41 ^ 0x65);
        d.lllll[9] = 0xFFFFFBF7 & 0x74F9;
        d.lllll[10] = 28 + 27 - 20 + 126 ^ 147 + 129 - 194 + 85;
        d.lllll[11] = 0x25 ^ 0x2D ^ (0x89 ^ 0x86);
        d.lllll[12] = -(0xFFFFDF5D & 0x2DAF) & (0xFFFFFDFE & Short.MAX_VALUE);
        d.lllll[13] = 0x18 ^ 0x5A ^ (0x30 ^ 0x7A);
        d.lllll[14] = 0x21 ^ 0x28;
        d.lllll[15] = -(0xFFFFEDD6 & 0x727B) & (0xFFFFFEF7 & 0x6BDD);
        d.lllll[16] = -(0xFFFFFFD5 & 0x146F) & (0xFFFFBFDF & 0x5FEF);
        d.lllll[17] = 0xFFFFCDFD & 0x3F3F;
        d.lllll[18] = 0x5B ^ 0x51;
        d.lllll[19] = 0x58 ^ 0x53;
        d.lllll[20] = 149 + 84 - 119 + 55 ^ 79 + 89 - 162 + 159;
        d.lllll[21] = 0x3F ^ 0x32;
        d.lllll[22] = -(0xFFFFB87F & 0x77D5) & (0xFFFFFFF7 & 0x3DFF);
        d.lllll[23] = -(0xFFFFD659 & 0x6DFF) & (0xFFFFDF7D & 0x6EFF);
        d.lllll[24] = 0xFFFFAFE3 & 0x5C3D;
        d.lllll[25] = 0x2D ^ 0x75 ^ (0xEA ^ 0xBD);
        d.lllll[26] = 0x5A ^ 0x1C ^ (0xC2 ^ 0x94);
        d.lllll[27] = 0xFFFFDC47 & 0x3FFE;
        d.lllll[28] = -(0xFFFFF66B & 0x79D7) & (0xFFFFFFF6 & 0x7DFF);
        d.lllll[29] = -(0xFFFFD55F & 0x6AE3) & (0xFFFFEFEB & 0x5DFF);
        d.lllll[30] = 0x3C ^ 0x74 ^ (0x41 ^ 0x18);
        d.lllll[31] = 0x4F ^ 0x5D;
        d.lllll[32] = 0xA8 ^ 0xBF ^ (0x61 ^ 0x65);
        d.lllll[33] = -(0xFFFFD5CB & 0x3A3F) & (0xFFFFFDFF & 0x1FBF);
        d.lllll[34] = -(0xFFFFDB7B & 0x7587) & (0xFFFFDBBE & 0x7FCF);
        d.lllll[35] = 0xFFFFEDEE & 0x1F9F;
        d.lllll[36] = 0x86 ^ 0x9A ^ (0xA3 ^ 0xAB);
        d.lllll[37] = 0x4A ^ 0x5F;
        d.lllll[38] = 0x44 ^ 0x52;
        d.lllll[39] = -(0xFFFFDD45 & 0x72FB) & (0xFFFFDFFE & 0x7DF3);
        d.lllll[40] = 0xFFFFEE5D & 0x1BEF;
        d.lllll[41] = -(0xFFFFDE1F & 0x73E3) & (0xFFFFDFFF & 0x7F7F);
        d.lllll[42] = 0x26 ^ 0x31;
        d.lllll[43] = 153 + 73 - 149 + 92 ^ 7 + 94 - 5 + 81;
        d.lllll[44] = 0xFFFFE16F & 0x1FF5;
        d.lllll[45] = 0xAF ^ 0xB6;
        d.lllll[46] = 0xFFFFFDFD & 0x66BF;
        d.lllll[47] = 0xFFFFDF6F & 0x2796;
        d.lllll[48] = -(0xFFFFF063 & Short.MAX_VALUE) & (0xFFFFFE7F & Short.MAX_VALUE);
        d.lllll[49] = 0x7C ^ 0x66;
        d.lllll[50] = 0x37 ^ 0x15 ^ (0x2A ^ 0x13);
        d.lllll[51] = 131 + 73 - 129 + 96 ^ 163 + 86 - 126 + 60;
        d.lllll[52] = 0x4F ^ 0x52;
        d.lllll[53] = -(0xFFFFB523 & 0x6EDF) & (0xFFFFFF76 & 0x7EFB);
        d.lllll[54] = -(0xFFFFB7DF & 0x7A21) & (0xFFFFBFFF & 0x7E9D);
        d.lllll[55] = 0xFFFF8DFF & 0x7F69;
        d.lllll[56] = 77 + 158 - 70 + 11 ^ 32 + 65 - 87 + 164;
        d.lllll[57] = 0x24 ^ 0x3B;
        d.lllll[58] = 0xFFFF9FF6 & 0x73FB;
        d.lllll[59] = 0x21 ^ 1;
        d.lllll[60] = -(0xFFFFE289 & 0x3FFF) & (0xFFFFEFFD & Short.MAX_VALUE);
        d.lllll[61] = -(0xFFFFFE4E & 0x59FF) & (0xFFFFFEFF & 0x5FDF);
        d.lllll[62] = 0xFFFF9F2B & 0x6EF4;
        d.lllll[63] = 0x1A ^ 0x3B;
        d.lllll[64] = 0x18 ^ 0x3A;
        d.lllll[65] = 0x91 ^ 0xA5 ^ (0x98 ^ 0x8F);
        d.lllll[66] = 0x36 ^ 0x12;
        d.lllll[67] = -(0xFFFF93EF & 0x7C31) & (0xFFFFFFFD & 0x3FBF);
        d.lllll[68] = 0xFFFFBFEA & 0x4BB7;
        d.lllll[69] = -(0xFFFFF34F & 0x6EF7) & (0xFFFFEFEF & 0x7EFF);
        d.lllll[70] = 170 + 64 - 80 + 33 ^ 33 + 40 - 34 + 119;
        d.lllll[71] = 0x54 ^ 0x3A ^ (0xD2 ^ 0x9A);
        d.lllll[72] = 105 + 46 - 101 + 116 ^ 5 + 48 - 48 + 124;
        d.lllll[73] = 0x7B ^ 0x53;
        d.lllll[74] = 0xFFFFEF9B & 0x3FFD;
        d.lllll[75] = -(0xFFFFF6FF & 0x4915) & (0xFFFFCB7D & 0x7FF7);
        d.lllll[76] = -(0xFFFFF4EF & 0x3B3B) & (0xFFFFFDFF & 0x3FFB);
        d.lllll[77] = 0xA ^ 0x23;
        d.lllll[78] = 0xB8 ^ 0x92;
        d.lllll[79] = -(0xFFFFB6D3 & 0x6FAD) & (0xFFFFB7FF & 0x6FE2);
        d.lllll[80] = 0x13 ^ 0x38;
        d.lllll[81] = 0xFFFFFFFD & 0xDB2;
        d.lllll[82] = -(0xFFFFE34F & 0x7CBC) & (0xFFFFEEFF & 0x7B6F);
        d.lllll[83] = 0xFFFFAE6F & 0x5DDE;
        d.lllll[84] = 53 + 160 - 128 + 97 ^ 112 + 129 - 224 + 137;
        d.lllll[85] = 0x27 ^ 0x54 ^ (0xD7 ^ 0x89);
        d.lllll[86] = 0x2D ^ 3;
        d.lllll[87] = 0x82 ^ 0xAD;
        d.lllll[88] = -(0xFFFFF7F5 & 0x6D6B) & (0xFFFFEFFF & 0x7FF7);
        d.lllll[89] = -(0x53 ^ 0x5E) & (0xFFFF9AFF & 0x6F3F);
        d.lllll[90] = -(0xFFFFDB78 & 0x779F) & (0xFFFFDFFF & Short.MAX_VALUE);
        d.lllll[91] = 122 + 32 - -4 + 11 ^ 80 + 134 - 108 + 47;
        d.lllll[92] = 0xC ^ 0x76 ^ (0x3D ^ 0x76);
        d.lllll[93] = 0x57 ^ 0x65;
        d.lllll[94] = -(0xFFFFEC07 & 0x37FD) & (0xFFFFFF75 & 0x7EFF);
        d.lllll[95] = 0xFFFFFBCA & 0xFB7;
        d.lllll[96] = 0xFFFFCEB6 & 0x3DCF;
        d.lllll[97] = 0x77 ^ 0x44;
        d.lllll[98] = 0x23 ^ 0x17;
        d.lllll[99] = 0x65 ^ 0x70 ^ (0x1D ^ 0x3D);
        d.lllll[100] = 0x50 ^ 0x66;
        d.lllll[101] = -(0xFFFFF3FF & 0x5D5D) & (0xFFFFFBFE & 0x5FDF);
        d.lllll[102] = -(0xFFFFD3F5 & 0x7DEF) & (0xFFFFDDE7 & 0x7FFE);
        d.lllll[103] = -(0xFFFFF25B & 0x4DB5) & (0xFFFFFD76 & 0x4FFF);
        d.lllll[104] = 0x97 ^ 0xA0;
        d.lllll[105] = 0x4E ^ 0x76;
        d.lllll[106] = 14 + 114 - 100 + 133 ^ 12 + 80 - 65 + 125;
        d.lllll[107] = 0x4A ^ 0x70;
        d.lllll[108] = -(0xFFFFFE3E & 0x25CF) & (0xFFFFFE7F & Short.MAX_VALUE);
        d.lllll[109] = 0x2A ^ 0x50 ^ (0x7D ^ 0x3C);
        d.lllll[110] = 0x5C ^ 0x60;
        d.lllll[111] = 0xE4 ^ 0x82 ^ (0x5A ^ 1);
        d.lllll[112] = 0x2C ^ 0x12;
        d.lllll[113] = 0xFFFFEFBF & 0x1DEF;
        d.lllll[114] = 0xFFFFFBEE & 0xF57;
        d.lllll[115] = -(0xFFFFF7DB & 0x2A25) & (0xFFFFBFF4 & 0x6FDF);
        d.lllll[116] = 0x1F ^ 0x20;
        d.lllll[117] = 150 + 30 - 16 + 39 ^ 103 + 0 - 64 + 100;
        d.lllll[118] = 0x1E ^ 0x13 ^ (0x3C ^ 0x70);
        d.lllll[119] = 0x7C ^ 5 ^ (0x66 ^ 0x5D);
        d.lllll[120] = -(0xFFFFFFBD & 0x6043) & (0xFFFFFE77 & 0x6BFF);
        d.lllll[121] = -(0xFFFFB7E1 & 0x7A5F) & (0xFFFFBEFF & 0x7FEE);
        d.lllll[122] = -(0xFFFFB9D7 & 0x662B) & (0xFFFFEEAF & 0x3DFF);
        d.lllll[123] = 0xDE ^ 0xA8 ^ (0x94 ^ 0xA1);
        d.lllll[124] = 0x71 ^ 0x35;
        d.lllll[125] = 0x62 ^ 0x27;
        d.lllll[126] = 0xDE ^ 0x98;
        d.lllll[127] = 0xFFFFBFAF & 0x4DFD;
        d.lllll[128] = 0xFFFFDDFE & 0x2EED;
        d.lllll[129] = 0xFFFFFD8D & 0xEF7;
        d.lllll[130] = 0x82 ^ 0xC5;
        d.lllll[131] = 0xCF ^ 0x87;
        d.lllll[132] = 0x3D ^ 0x74;
        d.lllll[133] = 237 + 222 - 441 + 231 ^ 8 + 84 - -61 + 26;
        d.lllll[134] = -(0xFFFFC5BF & 0x3FD1) & (0xFFFFDFFD & Short.MAX_VALUE);
        d.lllll[135] = -(0xFFFFFD7F & 0x6295) & (0xFFFFEFF7 & 0x7B7F);
        d.lllll[136] = 0xFFFFED7F & 0x1FFB;
        d.lllll[137] = 30 + 22 - -78 + 11 ^ 96 + 93 - 76 + 85;
        d.lllll[138] = 155 + 3 - 19 + 53 ^ 50 + 54 - 50 + 86;
        d.lllll[139] = 0x64 ^ 0x29;
        d.lllll[140] = 0xFE ^ 0xB0;
        d.lllll[141] = -(0xFFFFD3B5 & 0x7C7B) & (0xFFFFFFFF & 0x7FBF);
        d.lllll[142] = -(0xFFFFABCB & 0x56BF) & (0xFFFFAFDB & 0x5FBE);
        d.lllll[143] = 0xFFFFCF33 & 0x3DFE;
        d.lllll[144] = 0x54 ^ 0x1B;
        d.lllll[145] = 0xF2 ^ 0xA2;
        d.lllll[146] = 0xC4 ^ 0x95;
        d.lllll[147] = 0xDC ^ 0x8E;
        d.lllll[148] = -(0xFFFFAF5F & 0x55A1) & (0xFFFFEFFF & 0x1F7A);
        d.lllll[149] = -(0xFFFFCDE7 & 0x733B) & (0xFFFFDFFB & 0x6DFF);
        d.lllll[150] = 0xFFFFADE3 & 0x5E9F;
        d.lllll[151] = 0x46 ^ 0x62 ^ (0xFC ^ 0x8B);
        d.lllll[152] = 0xDC ^ 0x95 ^ (0x69 ^ 0x74);
        d.lllll[153] = 0xD6 ^ 0x8A ^ (0xCA ^ 0xC3);
        d.lllll[154] = 203 + 73 - 167 + 140 ^ 105 + 55 - 124 + 139;
        d.lllll[155] = 0xFFFF8ECD & 0x7BB2;
        d.lllll[156] = -(0xFFFFC307 & 0x7DFA) & (0xFFFFDDBF & 0x6FDD);
        d.lllll[157] = -(0xFFFFE66D & 0x7B9A) & (0xFFFFFFEF & 0x6F7F);
        d.lllll[158] = 55 + 90 - -33 + 43 ^ 81 + 46 - 11 + 22;
        d.lllll[159] = 0x4A ^ 0x17 ^ (0x14 ^ 0x11);
        d.lllll[160] = 159 + 13 - -9 + 64 ^ 165 + 92 - 156 + 71;
        d.lllll[161] = 0xFFFFFF76 & 0xAFF;
        d.lllll[162] = 0xFFFF9F8D & 0x6CFF;
        d.lllll[163] = 0x42 ^ 0x18;
        d.lllll[164] = 95 + 116 - 43 + 48 ^ 92 + 0 - 22 + 61;
        d.lllll[165] = 0xF6 ^ 0x9F ^ (0xF4 ^ 0xC1);
        d.lllll[166] = 0x4B ^ 2 ^ (0x44 ^ 0x50);
        d.lllll[167] = 0xFFFFBDAF & 0x4FFB;
        d.lllll[168] = -(0xFFFFFF7D & 0x6283) & (0xFFFFFF7E & 0x6FFB);
        d.lllll[169] = 0xED ^ 0xB3;
        d.lllll[170] = 0x1D ^ 0x72 ^ (3 ^ 0x33);
        d.lllll[171] = 5 ^ 0x65;
        d.lllll[172] = 0xE8 ^ 0xB6 ^ (0x67 ^ 0x58);
        d.lllll[173] = 0xFFFFBFD3 & 0x4ABD;
        d.lllll[174] = 0xFFFFFE5F & 0xBFF;
        d.lllll[175] = 0xFFFF8EFB & 0x7DE7;
        d.lllll[176] = 0x34 ^ 0x56;
        d.lllll[177] = 0x15 ^ 3 ^ (0xEC ^ 0x99);
        d.lllll[178] = 0xFFFFDF6B & 0x21FD;
        d.lllll[179] = 0x5E ^ 0x3A;
        d.lllll[180] = -3 & (0xFFFF9E7F & 0x6BFF);
        d.lllll[181] = -(0xFFFFF38E & 0x5F75) & (0xFFFFDFA7 & 0x7FDF);
        d.lllll[182] = 0xFFFF9FBA & 0x6D7D;
        d.lllll[183] = 0x2D ^ 0x48;
        d.lllll[184] = 0x9A ^ 0xC6 ^ (6 ^ 0x3C);
        d.lllll[185] = -(0x40 ^ 0x49) & (0xFFFFFBFF & 0x17FF);
        d.lllll[186] = 0x92 ^ 0x89 ^ (0x59 ^ 0x25);
        d.lllll[187] = 0xFFFFBFB7 & 0x6FDA;
        d.lllll[188] = -(0xFFFFCE7B & 0x35A5) & (0xFFFFBFFB & 0x4FFF);
        d.lllll[189] = 0xFFFFE77F & 0x3EF8;
        d.lllll[190] = 0xD9 ^ 0xB1;
        d.lllll[191] = -(0xFFFFBCB9 & 0x6367) & (0xFFFFF7B7 & 0x2F7E);
        d.lllll[192] = -(0xFFFFE71F & 0x38F9) & (0xFFFFFF7F & 0x2EFC);
        d.lllll[193] = -(0xFFFFA367 & 0x7CBF) & (0xFFFFFFEF & 0x3F7F);
        d.lllll[194] = 0x54 ^ 0x3D;
        d.lllll[195] = -(0xFFFFEB97 & 0x347B) & (0xFFFFF97E & 0x3FF7);
        d.lllll[196] = -(0xFFFFF34B & 0x7DFD) & (0xFFFFFFFB & 0x737F);
        d.lllll[197] = 0xFFFFFFED & 0x23E;
        d.lllll[198] = -(0xFFFFDB99 & 0x3CE7) & (0xFFFFDEEF & 0x3BBB);
        d.lllll[199] = 0x5B ^ 0x31;
        d.lllll[200] = 0x7A ^ 0x11;
        d.lllll[201] = -(0xFFFFDFDF & 0x74A5) & (0xFFFFFFFF & 0x5EFC);
        d.lllll[202] = 0xFFFFBFED & 0x4CF7;
        d.lllll[203] = 0xFFFFCFFD & 0x3C62;
        d.lllll[204] = 0xFC ^ 0x9C ^ (0x76 ^ 0x7A);
        d.lllll[205] = 179 + 71 - 49 + 15 ^ 25 + 71 - 49 + 134;
        d.lllll[206] = 0x2F ^ 0xA ^ (0xC7 ^ 0x8C);
        d.lllll[207] = 0x64 ^ 0x20 ^ (0x1E ^ 0x35);
        d.lllll[208] = 0xFFFFCFB5 & 0x3DEF;
        d.lllll[209] = -(0x70 ^ 0x35) & (0xFFFF8FFF & 0x7BFD);
        d.lllll[210] = -(0xFFFFDBBF & 0x6DF2) & (0xFFFFFFFF & 0x6FF7);
        d.lllll[211] = 0x34 ^ 0x44;
        d.lllll[212] = 0xFFFFAF77 & 0x578A;
        d.lllll[213] = 0xFFFFBE73 & 0x4FEF;
        d.lllll[214] = 0x78 ^ 0 ^ (0x97 ^ 0x9E);
        d.lllll[215] = 0xD5 ^ 0xA7;
        d.lllll[216] = 0x7B ^ 0x54 ^ (0x22 ^ 0x7E);
        d.lllll[217] = 56 + 204 - 63 + 12 ^ 132 + 12 - 71 + 92;
        d.lllll[218] = -(0xFFFFFB9F & 0x1471) & (0xFFFFDBFF & 0x3E9F);
        d.lllll[219] = 0xFFFFAEFC & 0x5BBF;
        d.lllll[220] = 0xFFFFDFA7 & 0x2DFE;
        d.lllll[221] = 0x4A ^ 0x54 ^ (0x10 ^ 0x7B);
        d.lllll[222] = 0xDD ^ 0xAB;
        d.lllll[223] = 0xC3 ^ 0xB4;
        d.lllll[224] = 0x5A ^ 0x22;
        d.lllll[225] = 0xBA ^ 0x9E ^ (0xFC ^ 0xA1);
        d.lllll[226] = 16 + 228 - 14 + 10 ^ 60 + 65 - 120 + 133;
        d.lllll[227] = -1 & (0xFFFFBFCC & 0x6FBF);
        d.lllll[228] = 0xFFFFBC3E & 0x4FCD;
        d.lllll[229] = 0xFFFFEF6D & 0x1DF7;
        d.lllll[230] = 0xDC ^ 0xA7;
        d.lllll[231] = 100 + 23 - -38 + 65 ^ 76 + 43 - 74 + 113;
        d.lllll[232] = 0x5C ^ 0x21;
        d.lllll[233] = 0xB9 ^ 0xC7;
        d.lllll[234] = 0xFFFFAFCE & 0x7FB9;
        d.lllll[235] = 0xFFFFCE8F & 0x3D7F;
        d.lllll[236] = -(0xFFFFEE3D & 0x51C3) & (0xFFFFDDFE & 0x6EBD);
        d.lllll[237] = 95 + 33 - 75 + 74;
        d.lllll[238] = 46 + 109 - 147 + 120;
        d.lllll[239] = (0xFB ^ 0xB7) + (0xB7 ^ 0xAC) - (0xC5 ^ 0x85) + (0xE1 ^ 0xBB);
        d.lllll[240] = 120 + 67 - 111 + 54;
        d.lllll[241] = -(0xFFFF9547 & 0x7AFA) & (0xFFFFFFDF & 0x3FEF);
        d.lllll[242] = -(0xFFFFC8DF & 0x77A1) & (0xFFFFECD7 & 0x5FBB);
        d.lllll[243] = 0xFFFFAFBF & 0x5DD3;
        d.lllll[244] = (0xC6 ^ 0xA8) + (59 + 30 - 63 + 101) - (197 + 12 - 14 + 6) + (0x25 ^ 0x7A);
        d.lllll[245] = 91 + 12 - 8 + 33 + (0x1E ^ 0xF) - (0x21 ^ 0xA) + (0xD ^ 0x13);
        d.lllll[246] = (0x9A ^ 0xB7) + (0x6B ^ 0x2F) - (0xD9 ^ 0xC6) + (0x90 ^ 0xA3);
        d.lllll[247] = (0x5F ^ 6) + (0x1F ^ 0x2C) - (0x20 ^ 0x14) + (0x13 ^ 0x3D);
        d.lllll[248] = 0xFFFFEFFE & 0x1BE1;
        d.lllll[249] = 0xFFFFAFB4 & 0x5D6F;
        d.lllll[250] = 17 + 119 - 74 + 73;
        d.lllll[251] = (0x65 ^ 0x4B) + (0xB0 ^ 0xBC) - -(0x34 ^ 0x74) + (0xA2 ^ 0xAC);
        d.lllll[252] = (0xC2 ^ 0xC4) + (124 + 18 - 91 + 78) - (0x12 ^ 0x63) + (0xF7 ^ 0x84);
        d.lllll[253] = (0x29 ^ 0x5E) + (0xCB ^ 0x82) - (75 + 56 - -7 + 20) + (0x24 ^ 0x4C);
        d.lllll[254] = 0xFFFFEDE7 & 0x1FBF;
        d.lllll[255] = -(0xFFFFF77F & 0x5CA1) & (0xFFFFFFE7 & 0x5FFF);
        d.lllll[256] = 7 + 106 - 107 + 133;
        d.lllll[257] = 129 + 89 - 210 + 132;
        d.lllll[258] = 61 + 1 - 57 + 136;
        d.lllll[259] = 107 + 36 - 121 + 120;
        d.lllll[260] = -(0xFFFFFF8B & 0x6577) & (0xFFFFFF77 & 0x6FFF);
        d.lllll[261] = 0xFFFFEDCF & 0x1EB9;
        d.lllll[262] = -(0xFFFFFFA5 & 0x437F) & (0xFFFFEFF7 & 0x5FBF);
        d.lllll[263] = (0x78 ^ 0xC) + (0 ^ 0x32) - (82 + 27 - 53 + 73) + (0x70 ^ 0x1A);
        d.lllll[264] = 22 + 120 - 82 + 84;
        d.lllll[265] = 57 + 32 - 59 + 115;
        d.lllll[266] = 32 + 55 - 11 + 70;
        d.lllll[267] = -(12 + 49 - -1 + 83) & (0xFFFFDAFF & Short.MAX_VALUE);
        d.lllll[268] = -(0xFFFFD3EB & 0x7D1D) & (0xFFFFDF7F & 0x7DF9);
        d.lllll[269] = -(0xFFFFFF7F & 0x5395) & (0xFFFFFFDF & 0x5FFD);
        d.lllll[270] = 5 + 93 - -30 + 19;
        d.lllll[271] = 124 + 8 - 118 + 134;
        d.lllll[272] = 15 + 15 - -118 + 1;
        d.lllll[273] = (0xD ^ 0x42) + (0x1C ^ 0x73) - (95 + 34 - 60 + 113) + (92 + 50 - 75 + 75);
        d.lllll[274] = 99 + 113 - 114 + 53;
        d.lllll[275] = (0x13 ^ 0x20) + (0x55 ^ 0x39) - (0xDE ^ 0xBD) + (0x5A ^ 6);
        d.lllll[276] = -(0xFFFFB707 & 0x58FA) & (0xFFFFFA93 & 0x1FFD);
        d.lllll[277] = -(0xFFFFF9A3 & 0x76FF) & (0xFFFFFFF7 & 0x7AFF);
        d.lllll[278] = 0xFFFFAD7D & 0x5F8B;
        d.lllll[279] = 21 + 106 - 88 + 114;
        d.lllll[280] = (0x41 ^ 0x2A) + (31 + 82 - 52 + 78) - (0x1E ^ 0x68) + (0x8B ^ 0x91);
        d.lllll[281] = 0xFFFFB366 & 0x4DFD;
        d.lllll[282] = (0x32 ^ 0x18) + (104 + 5 - 87 + 110) - (0x26 ^ 0x39) + (0xAC ^ 0xA0);
        d.lllll[283] = 0xFFFFEFDF & 0x3FBF;
        d.lllll[284] = 0xFFFF8F67 & 0x7BFA;
        d.lllll[285] = 0xFFFF8FEF & 0x7D7A;
        d.lllll[286] = 149 + 134 - 240 + 113;
        d.lllll[287] = 19 + 1 - -90 + 47;
        d.lllll[288] = (0x59 ^ 0x5F) + (0xB7 ^ 0xC0) - (0x62 ^ 8) + (84 + 8 - 30 + 77);
        d.lllll[289] = -(0xFFFFA1EF & 0x7E7B) & (0xFFFFFEFF & 0x2BFF);
        d.lllll[290] = -(0xFFFFFEFF & 0x5365) & (0xFFFFFEFD & 0x5FFF);
        d.lllll[291] = 0xFFFFDD7E & 0x2FFD;
        d.lllll[292] = 105 + 101 - 180 + 133;
        d.lllll[293] = 36 + 133 - 31 + 22;
        d.lllll[294] = -(0xFFFFCE77 & 0x7D89) & (0xFFFFFFF7 & 0x5FFB);
        d.lllll[295] = 59 + 21 - 36 + 117;
        d.lllll[296] = 0xFFFF8FF7 & 0x7A9B;
        d.lllll[297] = 0xFFFFEFF9 & 0x1A3F;
        d.lllll[298] = -(0x20 ^ 0x49) & (0xFFFF8FFF & 0x7D7A);
        d.lllll[299] = 41 + 91 - 26 + 56;
        d.lllll[300] = (0xD5 ^ 0x90) + (0x4B ^ 0x61) - -(0x74 ^ 0x6C) + (0x8A ^ 0x96);
        d.lllll[301] = -(0xFFFFE9DF & 0x5EB5) & (0xFFFFFDFF & 0x4BF7);
        d.lllll[302] = 104 + 64 - 9 + 5;
        d.lllll[303] = 0xFFFFBFB6 & 0x4ADB;
        d.lllll[304] = -(0xFFFFF791 & 0x396F) & (0xFFFFBF37 & 0x7BFF);
        d.lllll[305] = 0xFFFFBDDD & 0x4EFE;
        d.lllll[306] = (0x7D ^ 0x1F) + (0x41 ^ 0x14) - (2 ^ 0x28) + (0x69 ^ 0x71);
        d.lllll[307] = 31 + 157 - 30 + 8;
        d.lllll[308] = (0xFB ^ 0xAD) + (0xF7 ^ 0xC0) - (0x8B ^ 0x9A) + (0x9F ^ 0xB4);
        d.lllll[309] = -(0xFFFFF2DF & 0x7F65) & (0xFFFFFFFF & Short.MAX_VALUE);
        d.lllll[310] = -(0xFFFFD0BE & 0x3F69) & (0xFFFFDEBF & 0x3DFF);
        d.lllll[311] = (0xD4 ^ 0xB8) + (13 + 0 - -27 + 104) - (0x5A ^ 0x28) + (0xB8 ^ 0xA6);
        d.lllll[312] = (0x49 ^ 0x77) + (0x3E ^ 0x4D) - (73 + 14 - 16 + 104) + (83 + 19 - 23 + 88);
        d.lllll[313] = 0xFFFFD7FD & 0x3BFB;
        d.lllll[314] = 49 + 125 - 166 + 162;
        d.lllll[315] = -(0xFFFFF75F & 0x3CF9) & (0xFFFFBEFF & 0x7FDF);
        d.lllll[316] = -(0xFFFFE1DB & 0x3E2F) & (0xFFFFFBDF & 0x2FEF);
        d.lllll[317] = -(0xFFFF9667 & 0x79F9) & (0xFFFFFCFE & 0x1FF7);
        d.lllll[318] = (0 ^ 0x6A) + (0x1E ^ 0x2D) - (42 + 110 - 96 + 86) + (24 + 126 - 22 + 28);
        d.lllll[319] = (0x68 ^ 0x55) + (0xBD ^ 0xC0) - (0x69 ^ 0x4A) + (0x2A ^ 0x3F);
        d.lllll[320] = -(0xFFFFD8E6 & 0x6F5B) & (0xFFFFFDFF & 0x6F7F);
        d.lllll[321] = (0x48 ^ 8) + (0x12 ^ 0x4B) - -(0x99 ^ 0x90) + (0xCE ^ 0xC5);
        d.lllll[322] = -(0xFFFFF153 & 0x4EAF) & (0xFFFFEFF6 & 0x7F9B);
        d.lllll[323] = -(0xFFFFF7AD & 0x79DE) & (0xFFFFFFFF & 0x7DFF);
        d.lllll[324] = 0xFFFFA7F3 & 0x7E6D;
        d.lllll[325] = 14 + 163 - 131 + 128;
        d.lllll[326] = 61 + 164 - 194 + 144;
        d.lllll[327] = 75 + 106 - 106 + 101;
        d.lllll[328] = 18 + 119 - 119 + 159;
        d.lllll[329] = -(0xFFFFEABF & 0x5552) & (0xFFFFDDBF & 0x6FFF);
        d.lllll[330] = -(0xFFFF9FFF & 0x73DD) & (0xFFFFFFFE & 0x1FFF);
        d.lllll[331] = 0xFFFF8D6D & 0x7FBA;
        d.lllll[332] = 17 + 86 - -40 + 35;
        d.lllll[333] = 124 + 73 - 107 + 89;
        d.lllll[334] = 0xFFFFEDFF & 0x3EDD;
        d.lllll[335] = (0x86 ^ 0x8E) + (0x57 ^ 0x31) - -(0x38 ^ 0x7C) + 2;
        d.lllll[336] = 0xFFFF9E99 & 0x6BFE;
        d.lllll[337] = -(0xFFFFFBAF & 0x345A) & (0xFFFFFBDF & 0x3FFD);
        d.lllll[338] = -(0xFFFFF8ED & 0x67B7) & (0xFFFFFDBF & 0x6FFF);
        d.lllll[339] = 148 + 83 - 124 + 74;
        d.lllll[340] = 61 + 169 - 157 + 109;
        d.lllll[341] = 18 + 173 - 133 + 125;
        d.lllll[342] = 51 + 74 - 98 + 157;
        d.lllll[343] = 6 + 183 - 121 + 117;
        d.lllll[344] = -(0xFFFFCC5F & 0x73EF) & (0xFFFFEFDF & Short.MAX_VALUE);
        d.lllll[345] = 0xFFFFCFEF & 0x3BFF;
        d.lllll[346] = -(0xFFFFD03F & 0x3FC3) & (0xFFFFFF9E & 0x1DFF);
        d.lllll[347] = (0x7E ^ 0x55) + (12 + 122 - 4 + 42) - (0x6E ^ 0x26) + (0x12 ^ 0x39);
        d.lllll[348] = 40 + 123 - 90 + 114;
        d.lllll[349] = 112 + 147 - 214 + 126 + (0x51 ^ 0x75) - (0xE3 ^ 0xB7) + (0x6A ^ 0x2B);
        d.lllll[350] = (0x3B ^ 0x73) + (0x67 ^ 0x54) - -(0xC7 ^ 0xC2) + (0x61 ^ 0x5C);
        d.lllll[351] = -(0xFFFFC7FD & 0x3983) & (0xFFFFDBEE & Short.MAX_VALUE);
        d.lllll[352] = -(0xFFFFFBC7 & 0x57BD) & (0xFFFFFFFE & 0x5FED);
        d.lllll[353] = 28 + 81 - 41 + 122;
        d.lllll[354] = 48 + 65 - -8 + 70;
        d.lllll[355] = 13 + 88 - -7 + 78 + (43 + 58 - 42 + 76) - (130 + 114 - 118 + 31) + (0xAF ^ 0xB3);
        d.lllll[356] = 181 + 170 - 261 + 103;
        d.lllll[357] = 0xFFFFAFA7 & 0x7FDF;
        d.lllll[358] = -(0xFFFFFB97 & 0x76F9) & (0xFFFFFEF9 & 0x7FBE);
        d.lllll[359] = -(0xFFFFDBF9 & 0x37AF) & (0xFFFFBFFE & 0x5FFF);
        d.lllll[360] = 47 + 61 - 45 + 131;
        d.lllll[361] = 131 + 116 - 148 + 96;
        d.lllll[362] = 111 + 54 - 36 + 42 + (98 + 69 - 127 + 130) - (37 + 106 - 94 + 114) + (0x5C ^ 0x4E);
        d.lllll[363] = -(0xFFFFD86B & 0x77FD) & (0xFFFFFFEE & Short.MAX_VALUE);
        d.lllll[364] = -(0xFFFFF3FA & 0x3D37) & (0xFFFFBD7F & 0x7FFB);
        d.lllll[365] = 99 + 91 - -2 + 5;
        d.lllll[366] = 67 + 124 - 109 + 64 + (0xFD ^ 0xC3) - (96 + 67 - 68 + 102) + (126 + 74 - 57 + 44);
        d.lllll[367] = 71 + 75 - 109 + 162;
        d.lllll[368] = 51 + 84 - 121 + 186;
        d.lllll[369] = -(0xFFFFE662 & 0x5B9F) & (0xFFFFCFFF & 0x7FAD);
        d.lllll[370] = 0xFFFF9F6F & 0x6BDD;
        d.lllll[371] = -(0xFFFFEBE7 & 0x74B9) & (0xFFFFFFFB & 0x6DFE);
        d.lllll[372] = 26 + 92 - 51 + 100 + (172 + 178 - 335 + 169) - (0xFFFF913D & 0x6FF2) + (39 + 37 - 60 + 138);
        d.lllll[373] = 86 + 123 - 89 + 82;
        d.lllll[374] = 192 + 90 - 231 + 152;
        d.lllll[375] = 81 + 101 - 91 + 113;
        d.lllll[376] = 39 + 182 - 178 + 144 + (0x71 ^ 0x60) - (150 + 117 - 248 + 169) + (96 + 45 - 129 + 177);
        d.lllll[377] = 163 + 101 - 216 + 158;
        d.lllll[378] = 47 + 39 - 20 + 66 + (0x85 ^ 0x98) - -(0xF ^ 0x28) + (0x58 ^ 0x5F);
        d.lllll[379] = (0xE7 ^ 0xA2) + (91 + 32 - 101 + 110) - (0x1F ^ 0x1A) + (0x1E ^ 0x12);
        d.lllll[380] = -(0xFFFFF67B & 0x6BDF) & (0xFFFFFFFF & 0x6FFE);
        d.lllll[381] = 0xFFFFFE2E & 0xBDB;
        d.lllll[382] = (0x30 ^ 0x64) + (125 + 59 - 116 + 118) - (168 + 161 - 213 + 87) + (77 + 38 - 7 + 34);
        d.lllll[383] = 95 + 185 - 271 + 201;
        d.lllll[384] = (0x5C ^ 0x70) + (0x96 ^ 0xA7) - -(0x5D ^ 0x3B) + (0xA3 ^ 0xB3);
        d.lllll[385] = 56 + 104 - -11 + 41;
        d.lllll[386] = (0x72 ^ 0x1A) + (103 + 26 - 73 + 91) - (0xF4 ^ 0x81) + (0xD2 ^ 0x9D);
        d.lllll[387] = (0xE7 ^ 0x9D) + (0x1F ^ 0x17) - -(0x24 ^ 7) + (0xB3 ^ 0x82);
        d.lllll[388] = (0x62 ^ 0x14) + (0xE2 ^ 0xB0) - -(0x7B ^ 0x7D) + (0x4C ^ 0x45);
        d.lllll[389] = 0xFFFFBED9 & 0x4BA7;
        d.lllll[390] = -(0xFFFFA7F7 & 0x7BA9) & (0xFFFFFFFF & 0x2FF3);
        d.lllll[391] = -(0xFFFFF2A7 & 0x5FDA) & (0xFFFFDFCF & Short.MAX_VALUE);
        d.lllll[392] = 127 + 130 - 130 + 89;
        d.lllll[393] = 115 + 212 - 177 + 67;
        d.lllll[394] = (0x34 ^ 0x75) + (0xC3 ^ 0xB1) - (0x47 ^ 0x63) + (0x7B ^ 0x30);
        d.lllll[395] = 185 + 136 - 133 + 31;
        d.lllll[396] = 191 + 159 - 166 + 36;
        d.lllll[397] = (0x66 ^ 6) + (0x3C ^ 0x69) - (0x5A ^ 0x34) + (25 + 33 - -86 + 6);
        d.lllll[398] = 92 + 7 - 88 + 211;
        d.lllll[399] = -(0xFFFFE7FA & 0x5D6F) & (0xFFFFDFFF & 0x6FFF);
        d.lllll[400] = 0xFFFF9EDE & 0x6B2F;
        d.lllll[401] = 0xFFFFEEFF & 0x1DFD;
        d.lllll[402] = (0x52 ^ 4) + (57 + 118 - 26 + 40) - (0x31 ^ 0x62) + (0xB ^ 0x14);
        d.lllll[403] = 63 + 118 - 52 + 95;
        d.lllll[404] = 80 + 104 - 86 + 127;
        d.lllll[405] = 60 + 34 - 31 + 76 + (123 + 15 - 12 + 18) - (0xFFFF9FB7 & 0x614F) + (43 + 126 - 100 + 137);
        d.lllll[406] = 40 + 17 - 23 + 184 + (0x42 ^ 0x19) - (203 + 36 - 203 + 212) + (72 + 61 - 91 + 124);
        d.lllll[407] = 169 + 137 - 83 + 5;
        d.lllll[408] = 2 + 95 - -46 + 86;
        d.lllll[409] = -(0xFFFFFE51 & 0x73AF) & (0xFFFFFFBA & 0x7FFD);
        d.lllll[410] = -(0xFFFFE2C2 & 0x5DBF) & (0xFFFFFEBF & 0x4DDB);
        d.lllll[411] = 0xFFFFFFDD & 0xCEF;
        d.lllll[412] = 73 + 156 - 214 + 215;
        d.lllll[413] = 35 + 118 - 103 + 112 + (159 + 81 - 200 + 167) - (89 + 238 - 310 + 231) + (0x6F ^ 1);
        d.lllll[414] = (0x62 ^ 0x6C) + (2 + 62 - -13 + 131) - (0x7E ^ 0x5C) + (0xF ^ 0x23);
        d.lllll[415] = 153 + 31 - 21 + 70;
        d.lllll[416] = 46 + 99 - -9 + 10 + (199 + 164 - 196 + 39) - (21 + 112 - 59 + 108) + (0xB5 ^ 0x9B);
        d.lllll[417] = 149 + 89 - 43 + 3 + (0xA8 ^ 0xC4) - (0xFFFFD11F & 0x2FFB) + (104 + 79 - 3 + 32);
        d.lllll[418] = 193 + 97 - 86 + 32;
        d.lllll[419] = 144 + 163 - 109 + 39;
        d.lllll[420] = 0xFFFFBFFD & 0x6F9E;
        d.lllll[421] = -(0xFFFFB56F & 0x5A9F) & (0xFFFFBBFF & 0x5FDE);
        d.lllll[422] = 214 + 96 - 152 + 80;
        d.lllll[423] = 19 + 169 - -39 + 12;
        d.lllll[424] = (0x81 ^ 0x87) + (0x48 ^ 0x1D) - (0xC6 ^ 0x97) + (104 + 210 - 243 + 159);
        d.lllll[425] = (0xD5 ^ 0x91) + (40 + 44 - 56 + 159) - (249 + 119 - 228 + 110) + (207 + 110 - 252 + 171);
        d.lllll[426] = (0xE7 ^ 0xC1) + 3 - -(0xBA ^ 0x88) + (88 + 16 - -34 + 13);
        d.lllll[427] = 132 + 44 - 44 + 43 + (133 + 191 - 312 + 220) - (0xFFFFB77B & 0x49A4) + (0x27 ^ 0x5B);
        d.lllll[428] = 147 + 74 - 149 + 104 + (20 + 33 - 13 + 118) - (108 + 107 - 153 + 67) + (0x6F ^ 0x48);
        d.lllll[429] = -(0xFFFFF61D & 0x79F7) & (0xFFFFFFFE & 0x7DBF);
        d.lllll[430] = -(0xFFFFBD71 & 0x568F) & (0xFFFFBFDF & 0x5FFF);
        d.lllll[431] = -(0xFFFFF761 & 0x58DF) & (0xFFFFFD5F & 0x5FEF);
        d.lllll[432] = (0x3E ^ 0) + (27 + 91 - -93 + 20) - (0xFD ^ 0xBD) + (0x38 ^ 0x28);
        d.lllll[433] = 28 + 112 - -79 + 27;
        d.lllll[434] = 162 + 141 - 173 + 51 + (0x11 ^ 0x43) - (0x4E ^ 0xE) + (0x37 ^ 7);
        d.lllll[435] = 176 + 193 - 269 + 148;
        d.lllll[436] = 87 + 10 - -44 + 89 + (0x30 ^ 0x53) - (0xFFFFDD5F & 0x23BA) + (143 + 110 - 203 + 152);
        d.lllll[437] = 69 + 32 - -145 + 4;
        d.lllll[438] = -(0xFFFFE5EF & 0x7E38) & (0xFFFFFF3F & 0x6FEF);
        d.lllll[439] = 0xFFFF9FFA & 0x6D77;
        d.lllll[440] = (0xA5 ^ 0xBC) + (0x56 ^ 0x49) - -(0x53 ^ 0x75) + (14 + 23 - -46 + 74);
        d.lllll[441] = (0x46 ^ 8) + 3 - -(0x45 ^ 0x62) + (59 + 118 - 55 + 10);
        d.lllll[442] = 202 + 136 - 337 + 252;
        d.lllll[443] = 20 + 193 - 27 + 68;
        d.lllll[444] = 242 + 137 - 250 + 126;
        d.lllll[445] = -(0xFFFFECFE & 0x7FC5) & (0xFFFFEDE7 & 0x7FDB);
        d.lllll[446] = 0xFFFFB3E5 & 0x4D1B;
        d.lllll[447] = 0xFFFFDBD5 & 0x2EBE;
        d.lllll[448] = 0xFFFFBD6F & 0x4392;
        d.lllll[449] = 0xFFFFCBBB & 0x3547;
        d.lllll[450] = -(0xFFFFF473 & 0x7FED) & (0xFFFFF77F & 0x7DE4);
        d.lllll[451] = -(0xFFFFF3FB & 0x3CB7) & (0xFFFFF9F7 & 0x37BF);
        d.lllll[452] = -(0xFFFFDEFE & 0x7D1B) & (0xFFFFDDFF & 0x7F1F);
        d.lllll[453] = 0xFFFFD16F & 0x2F97;
        d.lllll[454] = 0xFFFFBDB9 & 0x434E;
        d.lllll[455] = 0xFFFFAAE3 & 0x5F9F;
        d.lllll[456] = 0xFFFFFB9B & 0xFFF;
        d.lllll[457] = 0xFFFFAF79 & 0x5DBF;
        d.lllll[458] = -(0xFFFFEEF1 & 0x3D9F) & (0xFFFFBFF9 & 0x6D9F);
        d.lllll[459] = -(0xFFFFB9DD & 0x66F3) & (0xFFFFBDFA & 0x63DF);
        d.lllll[460] = 0xFFFF916B & 0x6F9F;
        d.lllll[461] = -(0xFFFFDCDA & 0x7BA7) & (0xFFFFFFFF & 0x598D);
        d.lllll[462] = -(0xFFFF8F43 & 0x76FF) & (0xFFFFEF5F & 0x17EF);
        d.lllll[463] = -(0xFFFFFA43 & 0x6FFD) & (0xFFFFFF4F & 0x6BFE);
        d.lllll[464] = 0xFFFFDF6F & 0x219F;
        d.lllll[465] = 0xFFFFDBFF & 0x2E7F;
        d.lllll[466] = 0xFFFFCFB3 & 0x3CFF;
        d.lllll[467] = -(0xFFFFE805 & 0x77FB) & (0xFFFFEDDC & 0x7F7F);
        d.lllll[468] = 0xFFFFEFD7 & 0x1138;
        d.lllll[469] = -(0xAA ^ 0xAF) & (0xFFFFC17D & 0x3F97);
        d.lllll[470] = -(0xFFFFDEED & 0x771F) & (0xFFFFFF5F & 0x57BE);
        d.lllll[471] = -(0xFFFFFFFF & 0x70ED) & (0xFFFFF1FF & Short.MAX_VALUE);
        d.lllll[472] = 0xFFFFE75F & 0x19B4;
        d.lllll[473] = 0xFFFFA7FF & 0x5915;
        d.lllll[474] = -(0xFFFFFFB1 & 0x766F) & (0xFFFFFF36 & 0x77FF);
        d.lllll[475] = 0xFFFF9FEF & 0x6A96;
        d.lllll[476] = 0xFFFF8B9F & 0x7FFA;
        d.lllll[477] = -(0xFFFFDE39 & 0x63D7) & (0xFFFFFEFF & 0x4FFF);
        d.lllll[478] = -(0xFFFFEE55 & 0x57EB) & (0xFFFFFF7F & 0x47D7);
        d.lllll[479] = -(0xFFFFFFFF & 0x5E46) & (0xFFFFFF5F & 0x5FFD);
        d.lllll[480] = 0xFFFF859F & 0x7B79;
        d.lllll[481] = -(0xFFFFD8F5 & 0x774B) & (0xFFFFFDDB & 0x537E);
        d.lllll[482] = -(0xFFFFDEE3 & 0x6F9D) & (0xFFFFDFFF & 0x6F9B);
        d.lllll[483] = 0xFFFFC91E & 0x37FD;
        d.lllll[484] = 0xFFFFEDF3 & 0x1FBF;
        d.lllll[485] = -(0xFFFFBD8F & 0x7375) & (0xFFFFBFFF & 0x7BFC);
        d.lllll[486] = -(0xFFFFF6EF & 0x6FF3) & (0xFFFFE7FF & Short.MAX_VALUE);
        d.lllll[487] = -(0xFFFFDFA2 & 0x7E7F) & (0xFFFFDFBF & 0x7F7F);
        d.lllll[488] = 0xFFFF83DF & 0x7D3F;
        d.lllll[489] = 0xFFFFCB36 & 0x35E9;
        d.lllll[490] = 0xFFFF8B6D & 0x75B3;
        d.lllll[491] = 0xFFFFEF3A & 0x11E7;
        d.lllll[492] = -(0xFFFFEED7 & 0x3F7D) & (0xFFFFEFFF & 0x3F77);
        d.lllll[493] = -(0xFFFFB27F & 0x7DCD) & (0xFFFFFFFD & 0x3DFF);
        d.lllll[494] = -(0xFFFFB523 & 0x7BFD) & (0xFFFFFF7F & 0x3BFD);
        d.lllll[495] = 0xFFFF9DFB & 0x6EFD;
        d.lllll[496] = 0xFFFFF16C & 0xFB7;
        d.lllll[497] = 0xFFFF83BD & 0x7D67;
        d.lllll[498] = 0xFFFFD16F & 0x2FB6;
        d.lllll[499] = 0xFFFFD9F7 & 0x272F;
        d.lllll[500] = 0xFFFFA1FD & 0x5F2A;
        d.lllll[501] = 0xFFFFBF39 & 0x41EF;
        d.lllll[502] = 0xFFFFF97A & 0x7AF;
        d.lllll[503] = 0xFFFFEFFA & 0x5D6F;
        d.lllll[504] = -(0x2B ^ 0xC) & (0xFFFFD7FF & 0x2EF7);
        d.lllll[505] = -(0xFFFFB77F & 0x7A8E) & (0xFFFFBFBF & 0x7FEF);
        d.lllll[506] = 0xFFFFA1EF & 0x5F3B;
        d.lllll[507] = -(0xFFFFEDBA & 0x3247) & (0xFFFFEBED & 0x353F);
        d.lllll[508] = -(0xFFFFF41B & 0x7BF7) & (0xFFFFF13F & Short.MAX_VALUE);
        d.lllll[509] = -(32 + 121 - 36 + 92) & (0xFFFFFBFF & 0x5FE);
        d.lllll[510] = 0xFFFFC72F & 0x39FF;
        d.lllll[511] = 0xFFFFFF3D & 0x1F2;
        d.lllll[512] = 0xFFFFA379 & 0x5DB7;
        d.lllll[513] = -(0xFFFFE3B3 & 0x3C6D) & (0xFFFFEFBF & 0x3AFB);
        d.lllll[514] = -(0xFFFFF2F1 & 0x1F4F) & (0xFFFF9FDF & 0x7FEF);
        d.lllll[515] = -(0xFFFFFEEB & 0xBD6) & (0xFFFF9BF3 & 0x6FFF);
        d.lllll[516] = -(0xFFFFBB81 & 0x667F) & (0xFFFFBFB3 & 0x637F);
        d.lllll[517] = 0xFFFFFB36 & 0x5FD;
        d.lllll[518] = 0xFFFFFD35 & 0x3FF;
        d.lllll[519] = -(0xFFFFDDF9 & 0x66CF) & (0xFFFFFFFF & 0x45FE);
        d.lllll[520] = -(0xFFFFD85D & 0x7FEB) & (0xFFFFFD7F & 0x5BFF);
        d.lllll[521] = 0xFFFFB3BA & 0x4D7D;
        d.lllll[522] = 0xFFFFBF7B & 0x4BF5;
        d.lllll[523] = 0xFFFF8DFB & 0x7FF5;
        d.lllll[524] = -(0xFFFFDFCF & 0x72B3) & (0xFFFFFFBB & 0x53FF);
        d.lllll[525] = 0xFFFFE53E & 0x1BFB;
        d.lllll[526] = -(0xFFFFDBD5 & 0x64AF) & (0xFFFFC1FF & 0x7FBF);
        d.lllll[527] = -(0xFFFFDF73 & 0x72CE) & (0xFFFFF77D & 0x5BFF);
        d.lllll[528] = -(0xFFFFF6E1 & 0x5F9F) & (0xFFFFD7BD & Short.MAX_VALUE);
        d.lllll[529] = 0xFFFFD5BE & 0x2B7F;
        d.lllll[530] = -(0xFFFFFFB5 & 0x5C4B) & (0xFFFFDFFF & 0x7D3F);
        d.lllll[531] = 0xFFFFD144 & 0x2FFB;
        d.lllll[532] = 0xFFFFAFBB & 0x5BDD;
        d.lllll[533] = -(0xFFFFFBE3 & 0x645D) & (0xFFFFFCDE & 0x6FEF);
        d.lllll[534] = -(0xFFFFAD7B & 0x5E97) & (0xFFFF8F5F & 0x7DF3);
        d.lllll[535] = 0xFFFFA5F3 & 0x5B4E;
        d.lllll[536] = -(0xFFFFFA3D & 0x2FFF) & (0xFFFFBB7F & 0x6FFF);
        d.lllll[537] = 0xFFFFA146 & 0x5FFD;
        d.lllll[538] = 0xFFFFB7F5 & 0x494F;
        d.lllll[539] = 0xFFFF85D7 & 0x7B6E;
        d.lllll[540] = 0xFFFFF377 & 0xDCF;
        d.lllll[541] = 0xFFFFAFB1 & 0x7FEE;
        d.lllll[542] = -(0xFFFFDC3F & 0x73FB) & (0xFFFFFFFF & 0x5BFE);
        d.lllll[543] = -(0xFFFFDCAF & 0x7355) & (0xFFFFDCEF & 0x7F7E);
        d.lllll[544] = -(0xFFFFE6FD & 0x7FB7) & (0xFFFFEFFE & 0x77FD);
        d.lllll[545] = 0xFFFFDEF7 & 0x2DEF;
        d.lllll[546] = 0xFFFF8C7B & 0x7FB7;
        d.lllll[547] = -(0xFFFFEE75 & 0x3B9B) & (0xFFFFEBFB & 0x3F5D);
        d.lllll[548] = -(0xFFFFF29E & 0x7DE7) & (0xFFFFFDDF & 0x73EF);
        d.lllll[549] = 0xFFFFBB6B & 0x45DF;
        d.lllll[550] = 0xFFFFF3EC & 0xD5F;
        d.lllll[551] = 0xFFFFFBDD & 0x56F;
        d.lllll[552] = 0xFFFF99FF & 0x674E;
        d.lllll[553] = -(0xFFFFEE37 & 0x1BC9) & (0xFFFFFB4F & 0xFFF);
        d.lllll[554] = -(0xFFFFFADB & 0x4D27) & (0xFFFFEFDB & 0x5976);
        d.lllll[555] = 0xFFFFA571 & 0x5BDF;
        d.lllll[556] = -(0xFFFFFDDB & 0x6EAD) & (0xFFFFFFFB & 0x6DDE);
        d.lllll[557] = -(0xFFFFE6BB & 0x1D6D) & (0xFFFFF77F & 0xDFB);
        d.lllll[558] = -(0xFFFFED07 & 0x37F9) & (0xFFFFFFFF & 0x7F7B);
        d.lllll[559] = 0xFFFFFF9F & 0xBFC;
        d.lllll[560] = -(0xFFFFF627 & 0x5BDF) & (0xFFFFFEF7 & 0x5FFF);
        d.lllll[561] = -(31 + 0 - -74 + 66) & (0xFFFF87FF & 0x79FE);
        d.lllll[562] = -(0xFFFFFE51 & 0x77AF) & (0xFFFFFF5D & 0x77F7);
        d.lllll[563] = 0xFFFF8D7F & 0x73D6;
        d.lllll[564] = -(0xFFFFDFBB & 0x7ECD) & (0xFFFFDFDF & Short.MAX_VALUE);
        d.lllll[565] = 0xFFFFFA7D & 0xFFB;
        d.lllll[566] = -(0xFFFFFF71 & 0x72EF) & (0xFFFFFFEF & 0x7EFF);
        d.lllll[567] = 0xFFFFFB7F & 0x5D8;
        d.lllll[568] = -(32 + 33 - -45 + 23) & (0xFFFFCBFD & 0x35DF);
        d.lllll[569] = -(0xFFFFFE15 & 0x5FEF) & (0xFFFFFFDE & 0x5F7F);
        d.lllll[570] = 0xFFFF975F & 0x69FB;
        d.lllll[571] = 0xFFFFCFF4 & 0x7D7F;
        d.lllll[572] = -(0xFFFFE769 & 0x3E9F) & (0xFFFFBFBF & 0x6FFF);
        d.lllll[573] = -(0xFFFFFE77 & 0x61AB) & (0xFFFFFF7B & 0x6DF7);
        d.lllll[574] = 0xFFFF9DDE & 0x637D;
        d.lllll[575] = 0xFFFFA3DD & 0x5D7F;
        d.lllll[576] = -(0xFFFFDE67 & 0x3FB9) & (0xFFFFBFFF & 0x5F7E);
        d.lllll[577] = 0xFFFF81FF & 0x7F5F;
        d.lllll[578] = -(0xFFFFD47F & 0x6BB1) & (0xFFFFFAFE & 0x4FBF);
        d.lllll[579] = -(0xFFFFDDAE & 0x3357) & (0xFFFFFFDF & 0x1BED);
        d.lllll[580] = -(0x53 ^ 0x4A) & (0xFFFF817C & 0x7FFB);
        d.lllll[581] = -(0xFFFFACE9 & 0x731F) & (0xFFFFB36B & 0x6DFD);
        d.lllll[582] = -(0xFFFFFFD1 & 0x352F) & (0xFFFFFFED & 0x3F97);
        d.lllll[583] = -(0xFFFFBB57 & 0x54EF) & (0xFFFFFFDF & 0x3FEF);
        d.lllll[584] = 0xFFFF8FFE & 0x7BE3;
        d.lllll[585] = 0xFFFFFDB7 & 0xF7E;
        d.lllll[586] = 0xFFFFEF77 & 0x11EE;
        d.lllll[587] = -(0xFFFFE75B & 0x7EB5) & (0xFFFFFFF7 & 0x677F);
        d.lllll[588] = 0xFFFF8FF8 & 0x716F;
        d.lllll[589] = -(0xFFFFB847 & 0x57B9) & (0xFFFFBFDB & 0x7FBF);
        d.lllll[590] = -(0xFFFFFC63 & 0x639F) & (0xFFFFEFEF & 0x7BB6);
        d.lllll[591] = 0xFFFFFD7C & 0xFEF;
        d.lllll[592] = 0xFFFFBB7A & 0x45EF;
        d.lllll[593] = -(0xFFFFFE97 & 0x3BED) & (0xFFFFBFEF & 0x7BFF);
        d.lllll[594] = -(0xFFFFDED3 & 0x23AF) & (0xFFFF93EE & 0x6FFF);
        d.lllll[595] = 0xFFFFFFED & 0x17F;
        d.lllll[596] = -(0xFFFFCD73 & 0x37DE) & (0xFFFFBFDB & 0x4FFF);
        d.lllll[597] = 0xFFFFDFEF & 0x2B97;
        d.lllll[598] = 0xFFFFF1FE & 0xF6F;
        d.lllll[599] = -(0xFFFFFFC3 & 0x7CBD) & (0xFFFFFFFF & 0x7DEF);
        d.lllll[600] = -(0xFFFFFECD & 0x79BB) & (0xFFFFFDF9 & 0x7BFE);
        d.lllll[601] = 0xFFFF837D & 0x7DF3;
        d.lllll[602] = 0xFFFFFE79 & 0x5BFF;
        d.lllll[603] = 0xFFFFB79D & 0x4F7F;
        d.lllll[604] = 0xFFFF9F6B & 0x6EFE;
        d.lllll[605] = -(0xFFFFFEFF & 0x3D89) & (0xFFFFFFFB & 0x3DFE);
        d.lllll[606] = -(0xFFFFBE9D & 0x7DE7) & (0xFFFFBDF7 & Short.MAX_VALUE);
        d.lllll[607] = 0xFFFFD3FE & 0x2D75;
        d.lllll[608] = -(0xFFFFEC93 & 0x3F6F) & (0xFFFFFF77 & 0x2DFF);
        d.lllll[609] = 0xFFFF9F8D & 0x6AFF;
        d.lllll[610] = -(0xFFFFF14F & 0x7EB4) & (0xFFFFFEFF & 0x7BF7);
        d.lllll[611] = -(0xFFFFFBBA & 0x7ECF) & (0xFFFFFFFF & 0x7BFF);
        d.lllll[612] = 0xFFFFF177 & 0xFFF;
        d.lllll[613] = -(0xFFFFDE48 & 0x35BF) & (0xFFFF95FF & 0x7F7F);
        d.lllll[614] = -(0xFFFFB29F & 0x7FE7) & (0xFFFFB3FF & Short.MAX_VALUE);
        d.lllll[615] = -(0xFFFFFF95 & 0x446B) & (0xFFFFDFCB & 0x6EBF);
        d.lllll[616] = 0xFFFF9FF7 & 0x6B4D;
        d.lllll[617] = 0xFFFF95FE & 0x6B7B;
        d.lllll[618] = 0xFFFFCBFF & 0x357B;
        d.lllll[619] = 0xFFFFAB7D & 0x55FE;
        d.lllll[620] = 0xFFFFFDFD & 0x37F;
        d.lllll[621] = -(0xFFFFF5E5 & 0x2A9F) & (0xFFFFEAFF & 0x3FFF);
        d.lllll[622] = -(0xFFFFF3A7 & 0x7D7E) & (0xFFFFFDFF & 0x7FFD);
        d.lllll[623] = -(0xFFFFCC77 & 0x7389) & (0xFFFFCF76 & 0x7CFF);
        d.lllll[624] = 0xFFFFEFFE & 0x117F;
        d.lllll[625] = -(0xFFFFFABD & 0x7DC3) & (0xFFFFFFFF & 0x79FF);
        d.lllll[626] = -(0xFFFFE5CF & 0x7E3E) & (0xFFFFEDEF & 0x779D);
        d.lllll[627] = 0xFFFFC9CF & 0x37B1;
        d.lllll[628] = -(0xFFFFF27E & 0x7DF9) & (0xFFFFFAFF & Short.MAX_VALUE);
        d.lllll[629] = 0xFFFFCFF7 & 0x3BEF;
        d.lllll[630] = 0xFFFF9CBA & 0x6FFD;
        d.lllll[631] = -(0xFFFFB6E5 & 0x5F7F) & (0xFFFF97E7 & 0x7FFE);
        d.lllll[632] = 0xFFFF83B7 & 0x7DCB;
        d.lllll[633] = -(0xFFFFBDAE & 0x77D3) & (0xFFFFBFFF & Short.MAX_VALUE);
        d.lllll[634] = 0xFFFFCDFE & 0x3E9B;
        d.lllll[635] = 0xFFFFFF7E & 0xDC7;
        d.lllll[636] = 0xFFFFD7A6 & 0x29DD;
        d.lllll[637] = -(0xFFFFFB57 & 0x76AB) & (0xFFFFF39F & 0x7FE7);
        d.lllll[638] = -(0xFFFFF4F9 & 0x5B67) & (0xFFFFFFFD & 0x7FF7);
        d.lllll[639] = -(0xFFFFCFF3 & 0x742F) & (0xFFFFCFBF & Short.MAX_VALUE);
        d.lllll[640] = 0xFFFF9FBF & 0x6D77;
        d.lllll[641] = -(0xFFFFB6DB & 0x4F76) & (0xFFFF97D7 & 0x6FFF);
        d.lllll[642] = -(0xFFFFDEFD & 0x3B5B) & (0xFFFFDBDF & 0x3FFF);
        d.lllll[643] = -(0x72 ^ 0x63) & (0xFFFFF9B9 & 0x7DE);
        d.lllll[644] = -(0xFFFFFAEF & 0x7755) & (0xFFFFFFDF & 0x73ED);
        d.lllll[645] = 0xFFFF85DB & 0x7BAE;
        d.lllll[646] = 0xFFFFCFF7 & 0x7D7E;
        d.lllll[647] = -(0xFFFFABFD & 0x7757) & (0xFFFFFFFE & 0x2FF5);
        d.lllll[648] = 0xFFFFBCDB & 0x4FBF;
        d.lllll[649] = 0xFFFFFDBB & 0x3CF;
        d.lllll[650] = 0xFFFF8FFC & 0x718F;
        d.lllll[651] = 0xFFFFABAF & 0x55DD;
        d.lllll[652] = 0xFFFF8BFE & 0x758F;
        d.lllll[653] = -(0xFFFFF135 & 0x2FCE) & (0xFFFFFFFF & 0x7B7F);
        d.lllll[654] = -(0xFFFFB797 & 0x7A6E) & (0xFFFFFEFF & 0x3FD7);
        d.lllll[655] = -(0xFFFFE6E7 & 0x1B99) & (0xFFFFDFDB & 0x2FA6);
        d.lllll[656] = -(0xFFFFF7F1 & 0x4E3F) & (0xFFFFF7FF & 0x4FBF);
        d.lllll[657] = 0xFFFF85D2 & 0x7BBD;
        d.lllll[658] = 0xFFFFE1B7 & 0x1FD9;
        d.lllll[659] = -(0xFFFFFFCE & 0x3E33) & (0xFFFFBFF7 & 0x7F9B);
        d.lllll[660] = -(0xFFFFDD7B & 0x32E6) & (0xFFFFFFFB & 0x3FFF);
        d.lllll[661] = 0xFFFFFEFD & 0xDDF;
        d.lllll[662] = 0xFFFFF5DF & 0xBB3;
        d.lllll[663] = -(0xFFFFDFE2 & 0x3E5F) & (0xFFFFFFDD & 0x1FF7);
        d.lllll[664] = 0xFFFFF3D5 & 0xDBF;
        d.lllll[665] = -(0xFFFFDC4E & 0x3FFB) & (0xFFFF9FDF & 0x7DFF);
        d.lllll[666] = -(0xFFFFE7BF & 0x38C6) & (0xFFFFEFFF & 0x7DF5);
        d.lllll[667] = -(0xFFFFD693 & 0x3D6D) & (0xFFFF9FCF & 0x7FFC);
        d.lllll[668] = -(0xFFFFBEE5 & 0x717B) & (0xFFFFFDFF & 0x3EFF);
        d.lllll[669] = 0xFFFFF5DF & 0xBB7;
        d.lllll[670] = 0xFFFFB3FC & 0x4D9B;
        d.lllll[671] = -(0xFFFFFC6B & 0x5BF7) & (0xFFFFDFFF & 0x79FB);
        d.lllll[672] = 0xFFFFADBB & 0x53DE;
        d.lllll[673] = -(0xFFFF8B1B & 0x76F5) & (0xFFFFFF7F & 0x4FFF);
        d.lllll[674] = -(0xFFFFBD24 & 0x72DF) & (0xFFFFFF3F & 0x3DDF);
        d.lllll[675] = 0xFFFFAFFF & 0x519B;
        d.lllll[676] = -(0xFFFFFE7A & 0x7FE7) & (0xFFFFFFFF & 0x7FFD);
        d.lllll[677] = 0xFFFFED7F & 0x5FED;
        d.lllll[678] = -(0xFFFFFA7B & 0x7DD6) & (0xFFFFFFFF & 0x7F7F);
        d.lllll[679] = 0xFFFFBFFE & 0x4ECB;
        d.lllll[680] = 0xFFFFC9DF & 0x37BD;
        d.lllll[681] = 0xFFFFABDF & 0x55BE;
        d.lllll[682] = 0xFFFFB5DF & 0x4BBF;
        d.lllll[683] = 0xFFFFCFF2 & 0x31AD;
        d.lllll[684] = 0xFFFFBB99 & 0x4EEF;
        d.lllll[685] = -(0xFFFFFFBD & 0x4167) & (0xFFFFEF7F & 0x5DBF);
        d.lllll[686] = 0xFFFF9DFE & 0x6EBB;
        d.lllll[687] = -(0xFFFFDF5F & 0x3CEF) & (0xFFFF9DEF & Short.MAX_VALUE);
        d.lllll[688] = -(0xFFFFF7DE & 0x2A37) & (0xFFFFBFFF & 0x63B7);
        d.lllll[689] = -(0xFFFFFF9F & 0x5E7D) & (0xFFFFFFBF & 0x5FFF);
        d.lllll[690] = 0xFFFFE5EE & 0x1BB5;
        d.lllll[691] = -(0xFFFFB6BE & 0x6943) & (0xFFFFEAFD & 0x3F7F);
        d.lllll[692] = 0xFFFFDEED & 0x2DDE;
        d.lllll[693] = -(0xFFFFA785 & 0x797B) & (0xFFFFFDFF & 0x2F77);
        d.lllll[694] = -(0xFFFFEB6F & 0x74D9) & (0xFFFFF5EF & 0x6BFD);
        d.lllll[695] = 0xFFFFB1AE & 0x4FF7;
        d.lllll[696] = 0xFFFFBBFF & 0x45A7;
        d.lllll[697] = 0xFFFFAFEB & 0x51BC;
        d.lllll[698] = -(0xFFFFF70F & 0x3AF3) & (0xFFFFFFEF & 0x7F7A);
        d.lllll[699] = -(0xFFFFDF8F & 0x2175) & (0xFFFFBFBD & 0x67FF);
        d.lllll[700] = -(0xFFFFB453 & 0x7FEF) & (0xFFFFBDEF & 0x77FB);
        d.lllll[701] = -(0xFFFFEEDD & 0x7777) & (0xFFFFF7FE & 0x6FFF);
        d.lllll[702] = -(0xFFFFECD7 & 0x572D) & (0xFFFFE5AF & 0x5FFF);
        d.lllll[703] = -(0xFFFF8E53 & 0x7BFF) & (0xFFFFDBFE & 0x2FFF);
        d.lllll[704] = 0xFFFFEF8D & 0x3FFF;
        d.lllll[705] = -(0xFFFFED0D & 0x33FB) & (0xFFFFBFFF & 0x6D0F);
        d.lllll[706] = -(0xFFFFFC6F & 0x7F93) & (0xFFFFFFFF & 0x7DAF);
        d.lllll[707] = 0xFFFFF5FF & 0xBAE;
        d.lllll[708] = -(0xFFFFBC5D & 0x7FE3) & (0xFFFFBFFF & 0x7DEF);
        d.lllll[709] = -(0xFFFFF74F & 0x6EF4) & (0xFFFFFFF7 & 0x67FB);
        d.lllll[710] = 0xFFFFCFF9 & 0x7D77;
        d.lllll[711] = 0xFFFF879F & 0x7EFD;
        d.lllll[712] = 0xFFFFADDB & 0x5FE6;
        d.lllll[713] = -(0xFFFFD3EF & 0x6E17) & (0xFFFFEBFF & 0x57B7);
        d.lllll[714] = -(0xFFFFCD9F & 0x3A66) & (0xFFFFD9B7 & 0x2FFF);
        d.lllll[715] = -(0xFFFF9AFA & 0x758D) & (0xFFFFD79F & 0x3FF7);
        d.lllll[716] = -(0xFFFFE54E & 0x7BF5) & (0xFFFFEFF7 & 0x77FB);
        d.lllll[717] = -(0xFFFFF3BF & 0x6C5D) & (0xFFFFEFFD & 0x7DDF);
        d.lllll[718] = 0xFFFFC6C3 & 0x3FFE;
        d.lllll[719] = 0xFFFFAFFE & 0x5DF1;
        d.lllll[720] = -(0xFFFF8DA5 & 0x735B) & (0xFFFFCFBF & 0x37FF);
        d.lllll[721] = 0xFFFFBDEE & 0x4FF9;
        d.lllll[722] = 0xFFFF96FE & 0x6FBF;
        d.lllll[723] = 0xFFFFAFDF & 0x5DFF;
        d.lllll[724] = -(0xFFFFF979 & 0x768F) & (0xFFFFFFDF & 0x7DFF);
        d.lllll[725] = -(0xFFFFFFEF & 0x4813) & (0xFFFFDFEE & 0x6ED3);
        d.lllll[726] = -(0xFFFFB3B3 & 0x6E7D) & (0xFFFFAFFF & Short.MAX_VALUE);
        d.lllll[727] = -(0xA4 ^ 0xAD) & (0xFFFFFEEF & 0x7DC);
        d.lllll[728] = 0xFFFF8FDF & 0x7DE9;
        d.lllll[729] = -(0xFFFFBD7B & 0x6B9D) & (0xFFFFEFDF & 0x3FFF);
        d.lllll[730] = -(0xFFFFE2FF & 0x5D3D) & (0xFFFFEFFF & 0x5DFF);
        d.lllll[731] = 0xFFFFCFFF & 0x3DBD;
        d.lllll[732] = -(0xFFFFBB4D & 0x46F3) & (0xFFFF8FF7 & Short.MAX_VALUE);
        d.lllll[733] = 0xFFFFA6CB & 0x5FF5;
        d.lllll[734] = 0xFFFFCEF9 & 0x37BF;
        d.lllll[735] = -(0xFFFFFD6F & 0x6A95) & (0xFFFFFFFF & 0x6EBC);
        d.lllll[736] = 0xFFFFCEB8 & 0x37EF;
        d.lllll[737] = 0xFFFFCEFD & 0x37A7;
        d.lllll[738] = 0xFFFF8FC5 & 0x7DFF;
        d.lllll[739] = -(0xFFFFFF8D & 0x747B) & (0xFFFFF7FF & 0x7DBB);
        d.lllll[740] = 0xFFFFE9F6 & 0x17BD;
        d.lllll[741] = -(0xFFFFDE3B & 0x6FC7) & (0xFFFFCFFF & 0x7FB7);
        d.lllll[742] = -(0xFFFFF2D1 & 0x3F2F) & (0xFFFFFF7B & 0x7FED);
        d.lllll[743] = 0xFFFFAFFB & 0x5C7D;
        d.lllll[744] = 0xFFFFDDEF & 0x2F5B;
        d.lllll[745] = 0xFFFFFBF7 & 0x5BE;
        d.lllll[746] = -(6 ^ 0xF) & (0xFFFFFBBF & 0x5FF);
        d.lllll[747] = -(0xFFFFF65B & 0x39E7) & (0xFFFFF3FE & 0x3DFB);
        d.lllll[748] = 0xFFFFB1FF & 0x4FB9;
        d.lllll[749] = 0xFFFFFF7E & 0x5AFF;
        d.lllll[750] = -(0xFFFFF86D & 0x67BB) & (0xFFFFFDFF & 0x6F6F);
        d.lllll[751] = -(0xFFFFFDBE & 0x4A47) & (0xFFFFFBFF & 0x4DBF);
        d.lllll[752] = 0xFFFFD5BB & 0x2BFF;
        d.lllll[753] = 0xFFFFAFFA & 0x7F9D;
        d.lllll[754] = -(0xFFFFD5FD & 0x3AAB) & (0xFFFF9BFF & 0x7FFC);
        d.lllll[755] = 0xFFFFBDFD & 0x4F66;
        d.lllll[756] = 0xFFFFA7FE & 0x59BD;
        d.lllll[757] = -(0xFFFFDD6B & 0x7ED7) & (0xFFFFDDFF & Short.MAX_VALUE);
        d.lllll[758] = 0xFFFFE1FF & 0x1FBE;
        d.lllll[759] = -(0xFFFFDEAB & 0x7D55) & (0xFFFFDDBF & Short.MAX_VALUE);
        d.lllll[760] = -(0xAE ^ 0xBC) & (0xFFFFEFFF & 0x5D7F);
        d.lllll[761] = -(0xFFFFC7CE & 0x7C35) & (0xFFFFCF7F & 0x7FF7);
        d.lllll[762] = -(0xFFFFEF3E & 0x7EFF) & (0xFFFFFFFF & 0x6FFD);
        d.lllll[763] = -(0xFFFFBABF & 0x7D4B) & (0xFFFFF9DF & 0x3FEB);
        d.lllll[764] = -(0xFFFFEB3F & 0x7EF1) & (0xFFFFEFFE & 0x7BF3);
        d.lllll[765] = 0xFFFFC5D3 & 0x3BEF;
        d.lllll[766] = 0xFFFFEF7F & 0x5DEC;
        d.lllll[767] = 0xFFFF86CE & 0x7FF7;
        d.lllll[768] = 0xFFFFCFF8 & 0x3DFF;
        d.lllll[769] = -(0xFFFFDEF2 & 0x7D2F) & (0xFFFFFFF5 & 0x5DEF);
        d.lllll[770] = 0xFFFFD5C7 & 0x2BFD;
        d.lllll[771] = -(0xFFFFFBB9 & 0x3E57) & (0xFFFFFBFF & 0x3FD6);
        d.lllll[772] = 0xFFFFE3FF & 0x1DC7;
        d.lllll[773] = 0xFFFFBF97 & 0x6FFE;
        d.lllll[774] = -(0xFFFFFCBE & 0x5353) & (0xFFFFFBFF & 0x5FBD);
        d.lllll[775] = 0xFFFF8FDD & 0x7D2F;
        d.lllll[776] = 0xFFFF81FA & 0x7FCD;
        d.lllll[777] = 0xFFFFD5E9 & 0x2BDF;
        d.lllll[778] = -(0xFFFFE44F & 0x3BB7) & (0xFFFFBBDE & 0x6FB7);
        d.lllll[779] = 0xFFFFBDDB & 0x4F27;
        d.lllll[780] = 0xFFFFDFFC & 0x2BB3;
        d.lllll[781] = 0xFFFFADCA & 0x53FF;
        d.lllll[782] = 0xFFFFCDEB & 0x33DF;
        d.lllll[783] = -(0xFFFFBE3B & 0x63C7) & (0xFFFFFFBF & 0x2FFB);
        d.lllll[784] = 0xFFFFABFB & 0x5EB5;
        d.lllll[785] = 0xFFFF8FFE & 0x7DFB;
        d.lllll[786] = -(0xFFFFFDB4 & 0x667F) & (0xFFFFE7FF & 0x7DFF);
        d.lllll[787] = 0xFFFF89CD & 0x77FF;
        d.lllll[788] = 0xFFFF97DE & 0x69EF;
        d.lllll[789] = 0xFFFFC3FF & 0x3DCF;
        d.lllll[790] = 0xFFFFDBFD & 0x7E7F;
        d.lllll[791] = 0xFFFFBF7B & 0x4BF7;
        d.lllll[792] = -(0xFFFFF3AE & 0x6C5F) & (0xFFFFFDFD & 0x6FDF);
        d.lllll[793] = 0xFFFFCFF8 & 0x31D7;
        d.lllll[794] = 0xFFFFD5D9 & 0x2BF7;
        d.lllll[795] = 0xFFFFDDDA & 0x23F7;
        d.lllll[796] = -(0xFFFFFEB7 & 0x1349) & (0xFFFFDFFF & 0x33D3);
        d.lllll[797] = -(0xFFFFC7D2 & 0x786F) & (0xFFFFEFFF & 0x7FDF);
        d.lllll[798] = -(0xFFFFEDF7 & 0x369A) & (0xFFFFBFFD & 0x6FFF);
        d.lllll[799] = -(0xFFFFCE3B & 0x35EF) & (0xFFFF9DFE & 0x67FF);
        d.lllll[800] = 0xFFFFA1F7 & 0x5FDD;
        d.lllll[801] = -(0xFFFFF3E1 & 0x4E3F) & (0xFFFFEFF7 & 0x53FE);
        d.lllll[802] = 0xFFFFADDF & 0x53F7;
        d.lllll[803] = -(87 + 122 - 114 + 34) & (0xFFFFDFEB & 0x6DFF);
        d.lllll[804] = -(0xFFFFB771 & 0x78FF) & (0xFFFFBFF5 & 0x7BFB);
        d.lllll[805] = -(0xFFFFB29B & 0x7DFD) & (0xFFFFFDFF & 0x3F9F);
        d.lllll[806] = -(0x82 ^ 0xA6) & (0xFFFFABFB & 0x55FF);
        d.lllll[807] = 0xFFFFCDFB & 0x33DD;
        d.lllll[808] = -(0xFFFFBEFF & 0x7F26) & (0xFFFFFFFF & 0x3FFF);
        d.lllll[809] = -(0xFFFFE665 & 0x7BBB) & (0xFFFFF7FB & 0x6BFF);
        d.lllll[810] = -(0x30 ^ 0x79) & (0xFFFFBFFF & 0x6FDF);
        d.lllll[811] = 0xFFFFBDF7 & 0x4F3B;
        d.lllll[812] = 0xFFFFFDDE & 0x3FD;
        d.lllll[813] = 0xFFFFD7DD & 0x29FF;
        d.lllll[814] = 0xFFFFD3DE & 0x2DFF;
        d.lllll[815] = -(0xFFFFFE2B & 0x51F5) & (0xFFFFD5FF & 0x7BFF);
        d.lllll[816] = 0xFFFF8DFF & 0x7FBA;
        d.lllll[817] = 0xFFFFFCBF & 0xFD4;
        d.lllll[818] = -(0xFFFFB6F2 & 0x4F0F) & (0xFFFFAFFF & 0x57E1);
        d.lllll[819] = -(0xFFFFFD2D & 0x46DB) & (0xFFFFD7FB & 0x6DED);
        d.lllll[820] = -(0xFFFFDFDF & 0x2E2D) & (0xFFFF8FEF & 0x7FFE);
        d.lllll[821] = 0xFFFFF3EB & 0xDF7;
        d.lllll[822] = 0xFFFFDEFB & 0x7B7E;
        d.lllll[823] = -(0xFFFFF732 & 0x1BFF) & (0xFFFF9FFF & 0x7FF5);
        d.lllll[824] = 0xFFFFA1E4 & 0x5FFF;
        d.lllll[825] = 0xFFFFE7F5 & 0x19EF;
        d.lllll[826] = 0xFFFF8FFE & 0x71E7;
        d.lllll[827] = -(0xFFFFACDD & 0x772B) & (0xFFFFA5EF & Short.MAX_VALUE);
        d.lllll[828] = -(0xFFFFEA76 & 0x379F) & (0xFFFFEFFD & 0x3FBF);
        d.lllll[829] = -(0xFFFFFC6D & 0x179B) & (0xFFFFFFFF & 0x1FDA);
        d.lllll[830] = 0xFFFFEF9D & 0x1CF3;
        d.lllll[831] = 0xFFFFB1F9 & 0x4FEE;
        d.lllll[832] = -(0xFFFFB7AF & 0x7E57) & (0xFFFFBFEF & 0x77FF);
        d.lllll[833] = -(0xFFFFF57F & 0x1A91) & (0xFFFFFFFF & 0x11FA);
        d.lllll[834] = 0xFFFFB5FB & 0x4BEF;
        d.lllll[835] = 0xFFFFFAF3 & 0x5F7F;
        d.lllll[836] = -(0xFFFFF6F3 & 0x5D1D) & (0xFFFFFFBF & 0x5FFF);
        d.lllll[837] = 0xFFFFE5FF & 0x1BEC;
        d.lllll[838] = 0xFFFFD7FF & 0x29ED;
        d.lllll[839] = -(0xFFFFF6AD & 0x2F53) & (0xFFFFEFEE & 0x37FF);
        d.lllll[840] = -(0xFFFFFB31 & 0xEDF) & (0xFFFFBFFF & 0x4BFF);
        d.lllll[841] = 0xFFFF9FFF & 0x61F0;
        d.lllll[842] = -(0xFFFFFEAF & 0x7F5D) & (0xFFFFFFFD & Short.MAX_VALUE);
        d.lllll[843] = -(0xFFFFEB1D & 0x76EF) & (0xFFFFFBFE & 0x67FF);
        d.lllll[844] = -(0xFFFFBF4D & 0x5AB3) & (0xFFFFFBF7 & 0x1FFB);
        d.lllll[845] = 0xFFFFF5FC & 0xBF7;
        d.lllll[846] = -(0xFFFFFFBB & 0x5647) & (0xFFFFFFF7 & 0x57FF);
        d.lllll[847] = -(0xFFFFBBB2 & 0x5C4F) & (0xFFFF9DFF & 0x7BF7);
        d.lllll[848] = 0xFFFFFA76 & 0x5FFF;
        d.lllll[849] = 0xFFFFE3FF & 0x1DF7;
        d.lllll[850] = 0xFFFFDBFE & 0x25F9;
        d.lllll[851] = 0xFFFFA3FF & 0x5DF9;
        d.lllll[852] = -(0xFFFFE8D3 & 0x5F2E) & (0xFFFFFDFB & 0x4BFF);
        d.lllll[853] = 0xFFFFB7FB & 0x49FF;
        d.lllll[854] = 0xFFFF83FC & 0x7DFF;
        d.lllll[855] = 0xFFFFDFFF & 0x21FD;
        d.lllll[856] = 0xFFFFBFFF & 0x41FE;
        d.lllll[857] = 0xFFFFC1FF & 0x3FFF;
        d.lllll[858] = 0xFFFFF767 & 0xA98;
        d.lllll[859] = 0xFFFFDAEF & 0x2711;
        d.lllll[860] = -(0x9A ^ 0x90) & (0xFFFFFFFD & 0x5A7F);
        d.lllll[861] = -(0xFFFFCFE7 & 0x79BE) & (0xFFFFDBE7 & 0x6FBF);
        d.lllll[862] = -(0xFFFFE7F1 & 0x7DFF) & (0xFFFFFFF7 & 0x67FB);
        d.lllll[863] = 0xFFFFD2B5 & 0x2F4E;
        d.lllll[864] = 0xFFFFBB3D & 0x46C7;
        d.lllll[865] = -(0xFFFFDF2B & 0x79F6) & (0xFFFFFB6F & 0x5FB7);
        d.lllll[866] = -(0xFFFFBFD7 & 0x7569) & (0xFFFFF7F7 & 0x3F4F);
        d.lllll[867] = 0xFFFFEE59 & 0x13AE;
        d.lllll[868] = 0xFFFF965D & 0x6BAB;
        d.lllll[869] = 0xFFFF9F7A & 0x628F;
        d.lllll[870] = 0xFFFFA33F & 0x5ECB;
        d.lllll[871] = 0xFFFFFBF7 & 0x5E7F;
        d.lllll[872] = -(0xFFFFFD7B & 0x2BB6) & (0xFFFFEBFF & 0x3F3D);
        d.lllll[873] = 0xFFFFA3AD & 0x5E5F;
        d.lllll[874] = 0xFFFF960E & 0x6BFF;
        d.lllll[875] = -(0xFFFFD5D7 & 0x6BA9) & (0xFFFFE3CF & 0x5FBF);
        d.lllll[876] = 0xFFFFEFFB & 0x1214;
        d.lllll[877] = 0xFFFF8A5B & 0x77B5;
        d.lllll[878] = -(0xFFFFFDBF & 0x7FE9) & (0xFFFFFFBB & 0x7FFE);
        d.lllll[879] = 0xFFFFEB1B & 0x16F7;
        d.lllll[880] = -(0xFFFFFEBF & 0x1D6B) & (0xFFFFDE3F & 0x3FFE);
        d.lllll[881] = 0xFFFFE337 & 0x1EDD;
        d.lllll[882] = -(0xFFFFBDEB & 0x7BBD) & (0xFFFFFBBF & 0x3FFE);
        d.lllll[883] = 0xFFFFFF78 & 0x5AFF;
        d.lllll[884] = 0xFFFFDE57 & 0x23BF;
        d.lllll[885] = -(0xFFFF9779 & 0x7DE7) & (0xFFFFB7FB & 0x5F7C);
        d.lllll[886] = 0xFFFFEE7D & 0x139B;
        d.lllll[887] = -(0xFFFFDCDF & 0x77A5) & (0xFFFFDFDF & 0x76BE);
        d.lllll[888] = -(0xFFFF9DAD & 0x77F7) & (0xFFFFDFBF & 0x37FF);
        d.lllll[889] = 0xFFFF9BDD & 0x663E;
        d.lllll[890] = -(0xFFFFFD67 & 0x46FB) & (0xFFFFEE7F & 0x57FF);
        d.lllll[891] = 0xFFFFA7DF & 0x5A3E;
        d.lllll[892] = 0xFFFF9E9F & 0x637F;
        d.lllll[893] = 0xFFFFAEAC & 0x5373;
        d.lllll[894] = 0xFFFFEF79 & 0x12A7;
        d.lllll[895] = 0xFFFFFFFD & 0x5A77;
        d.lllll[896] = 0xFFFFBFEB & 0x4236;
        d.lllll[897] = -(0xFFFFC8EF & 0x3FDD) & (0xFFFFDEEF & 0x2BFF);
        d.lllll[898] = -(0xFFFFB75A & 0x6DEF) & (0xFFFFEF6D & 0x37FF);
        d.lllll[899] = -(0xFFFFE61B & 0x7DFF) & (0xFFFFEE3F & 0x77FF);
        d.lllll[900] = -(0xFFFFE9CB & 0x5FBE) & (0xFFFFCFFF & 0x7BAF);
        d.lllll[901] = 0xFFFF96F7 & 0x6B2F;
        d.lllll[902] = 0xFFFFF3F9 & 0xE2E;
        d.lllll[903] = 0xFFFFEFBB & 0x126D;
        d.lllll[904] = 0xFFFFC63F & 0x3BEA;
        d.lllll[905] = -(0x9D ^ 0xBC) & (0xFFFFEFFE & 0x37FF);
        d.lllll[906] = -(0xFFFFBD0B & 0x66F5) & (0xFFFFB7D7 & 0x6EA8);
        d.lllll[907] = -(0xFFFFDF13 & 0x25ED) & (0xFFFFBDDD & 0x57EE);
        d.lllll[908] = -(0xFFFFE127 & 0x5EDB) & (0xFFFFF597 & 0x5FFF);
        d.lllll[909] = -(0xFFFF97FE & 0x7DB7) & (0xFFFFBFFF & 0x5FFF);
        d.lllll[910] = 0xFFFFED7A & 0x1FBF;
        d.lllll[911] = 0xFFFFC7EF & 0x3A3D;
        d.lllll[912] = 0xFFFFFFD6 & 0x27FF;
        d.lllll[913] = 0xFFFF86CE & 0x7BBF;
        d.lllll[914] = 0xFFFF9BCB & 0x677F;
        d.lllll[915] = 0xFFFF9E77 & 0x6DDF;
        d.lllll[916] = -(0xFFFFD8EE & 0x671F) & (0xFFFFDDFF & 0x6EEF);
        d.lllll[917] = -(0xFFFFEE31 & 0x75DF) & (0xFFFFEEBE & 0x777F);
        d.lllll[918] = 0xFFFFBF7F & 0x4CFD;
        d.lllll[919] = 0xFFFFCCCF & 0x3FFE;
        d.lllll[920] = 0xFFFFFCEF & 0xF7F;
        d.lllll[921] = 0xFFFFAFFD & 0x5CD7;
        d.lllll[922] = 0xFFFFAFD7 & 0x77EE;
        d.lllll[923] = 0xFFFFAE7B & 0x55F5;
        d.lllll[924] = 0xFFFFC6E7 & 0x3F7F;
        d.lllll[925] = 0xFFFF8FEF & 0x73FD;
        d.lllll[926] = 0xFFFF8FAD & 0x7C7B;
        d.lllll[927] = -(0xFFFFB1A7 & 0x5F5B) & (0xFFFF9FFE & 0x7D7F);
        d.lllll[928] = -(0xFFFFFFD3 & 0x3DFD) & (0xFFFFBFFF & Short.MAX_VALUE);
        d.lllll[929] = -(0xFFFF9D2A & 0x6AD7) & (0xFFFFBFFD & 0x6FE3);
        d.lllll[930] = -(0xFFFFFFBF & 0x7A4B) & (0xFFFFFFEF & 0x7E9F);
        d.lllll[931] = 0xFFFFDC7F & 0x27DF;
        d.lllll[932] = 0xFFFFED79 & 0x16BF;
        d.lllll[933] = -(0xFFFFF611 & 0x69FF) & (0xFFFFFBF5 & 0x6FFF);
        d.lllll[934] = -(0xFFFFF497 & 0x1BEF) & (0xFFFFFFB7 & 0x1DFE);
        d.lllll[935] = 0xFFFFD23B & 0x2FF4;
        d.lllll[936] = -(0xFFFFDE3E & 0x79E3) & (0xFFFFFFEF & Short.MAX_VALUE);
        d.lllll[937] = 0xFFFFCBFB & 0x37FF;
        d.lllll[938] = 0xFFFFBF57 & 0x44EF;
        d.lllll[939] = 0xFFFF85B1 & 0x7FDE;
        d.lllll[940] = -(0xDB ^ 0x88) & (0xFFFFABFF & 0x5FFF);
        d.lllll[941] = -(0xFFFFECEB & 0x735E) & (0xFFFFFC7F & 0x6FEF);
        d.lllll[942] = 0xFFFFAE35 & 0x53FB;
        d.lllll[943] = 0xFFFFEFFF & 0x1B84;
        d.lllll[944] = -(0xFFFFF85F & 0x27B1) & (0xFFFFBDFD & 0x6EFF);
        d.lllll[945] = 0xFFFFFFFF & 0xB83;
        d.lllll[946] = 0xFFFF9EDF & 0x6DFF;
        d.lllll[947] = -(0xFFFFECE5 & 0x773B) & (0xFFFFFFB5 & 0x75FE);
        d.lllll[948] = 0xFFFFF7E4 & 0x2FDF;
        d.lllll[949] = -(0xFFFFDD7B & 0x62CF) & (0xFFFFC4FF & Short.MAX_VALUE);
        d.lllll[950] = 0xFFFFD5C7 & 0x2EB9;
        d.lllll[951] = 0xFFFFF673 & 0xFEF;
        d.lllll[952] = 0xFFFFAEF1 & 0x5D6F;
        d.lllll[953] = -(0xFFFFFEC6 & 0x15FF) & (0xFFFFD6FF & 0x3FF7);
        d.lllll[954] = -(0xFFFFD953 & 0x76FF) & (0xFFFFFFFF & 0x7FD6);
        d.lllll[955] = -(0xFFFFDE6F & 0x2B95) & (0xFFFF9FFF & 0x6EFD);
        d.lllll[956] = -(0xFFFFCF9B & 0x7867) & (0xFFFFEC67 & 0x5FFF);
        d.lllll[957] = 0xFFFFB5FF & 0x4EA7;
        d.lllll[958] = -(0xFFFFFDFE & 0x7B0D) & (0xFFFFFBBF & 0x7F7F);
        d.lllll[959] = 0xFFFFA7FF & 0x7FF8;
        d.lllll[960] = -(0xFFFFDF9B & 0x6BF7) & (0xFFFFFFDF & 0x4FFF);
        d.lllll[961] = -(0xFFFFB3BB & 0x6F6D) & (0xFFFFA7F9 & 0x7FBF);
        d.lllll[962] = 0xFFFFBEF7 & 0x4DFA;
        d.lllll[963] = -(0xFFFFF8F9 & 0x4F8F) & (0xFFFFCFBD & 0x7AFF);
        d.lllll[964] = -(0xFFFFDB5B & 0x7CA7) & (0xFFFFFFFF & 0x7FEA);
        d.lllll[965] = -(0xFFFFD9A1 & 0x6FDF) & (0xFFFFEFEF & 0x5DFD);
        d.lllll[966] = 0xFFFFED77 & 0x16BB;
        d.lllll[967] = 0xFFFF8FFB & 0x7567;
        d.lllll[968] = 0xFFFFFEAF & 0xB7F;
        d.lllll[969] = 0xFFFFEF76 & 0x12BF;
        d.lllll[970] = 0xFFFFEF7D & 0x5DFB;
        d.lllll[971] = -(0xFFFFFCAF & 0x6B71) & (0xFFFFFDBF & 0x7FF7);
        d.lllll[972] = 0xFFFFE777 & 0x1DEF;
        d.lllll[973] = 0xFFFFFDF7 & 0xEBD;
        d.lllll[974] = -(0x69 ^ 0x5E) & (0xFFFFAD7F & 0x5FFF);
        d.lllll[975] = 0xFFFFE6BF & 0x1B77;
        d.lllll[976] = -(0xFFFFDEFF & 0x7122) & (0xFFFFF7FF & 0x7FED);
        d.lllll[977] = 0xFFFFD66B & 0x2DBF;
        d.lllll[978] = -(0xFFFFDDB7 & 0x2679) & (0xFFFFC7FD & 0x3F7F);
        d.lllll[979] = -(0xFFFFFE59 & 0x61A7) & (0xFFFFF6F9 & 0x6FA6);
        d.lllll[980] = 0xFFFFEFF9 & 0x1AAF;
        d.lllll[981] = 0xFFFFFD5F & 0xFB5;
        d.lllll[982] = 0xFFFFD77D & 0x2ABA;
        d.lllll[983] = -(0xFFFFE4FE & 0x5B1B) & (0xFFFFE7FF & Short.MAX_VALUE);
        d.lllll[984] = -(0xFFFFEACF & 0x5DB7) & (0xFFFFDFAF & 0x6FFF);
        d.lllll[985] = -(0xFFFFF17B & 0x6FD7) & (0xFFFFF3DE & 0x6FFB);
        d.lllll[986] = -(0xFFFFB9B7 & 0x4E6B) & (0xFFFFBD6B & 0x4FFF);
        d.lllll[987] = -(0xFFFFE5FD & 0x7F0B) & (0xFFFFFFDF & 0x6FEF);
        d.lllll[988] = -(0xFFFFEE79 & 0x7187) & (0xFFFFFF75 & 0x6DFF);
        d.lllll[989] = 0xFFFF8ABB & 0x777D;
        d.lllll[990] = 0xFFFFE7F6 & 0x3FFB;
        d.lllll[991] = 0xFFFFC5FF & 0x3E8F;
        d.lllll[992] = -(0xFFFFFF1D & 0x58FF) & (0xFFFFFF7D & 0x5ADF);
        d.lllll[993] = 0xFFFFD7AF & 0x2D7B;
        d.lllll[994] = -(0xFFFFF8FF & 0x474B) & (0xFFFFCAFF & Short.MAX_VALUE);
        d.lllll[995] = 0xFFFFBAFA & 0x473F;
        d.lllll[996] = -(0xFFFFDBCB & 0x3C37) & (0xFFFFBFEE & 0x7FDB);
        d.lllll[997] = 0xFFFFF5EF & 0xE59;
        d.lllll[998] = 0xFFFFD7AF & 0x2D5F;
        d.lllll[999] = -(0xFFFFEF7D & 0x51A7) & (0xFFFFEFEF & 0x5D3F);
        d.lllll[1000] = -(0xFFFF8DCD & 0x7BB7) & (0xFFFFFFBF & 0xBFF);
        d.lllll[1001] = 0xFFFFBFAA & 0x6FD7;
        d.lllll[1002] = -(0xFFFFDA4D & 0x7DBF) & (0xFFFFFF5F & 0x5DFD);
        d.lllll[1003] = 0xFFFF97E9 & 0x6E7F;
        d.lllll[1004] = 0xFFFFBDFF & 0x4F87;
        d.lllll[1005] = -(0xFFFF8789 & 0x7DF7) & (0xFFFFC7FC & 0x3FBF);
        d.lllll[1006] = -(0xFFFFDB94 & 0x7C7F) & (0xFFFFFFFF & Short.MAX_VALUE);
        d.lllll[1007] = -(0xFFFFD77A & 0x79E7) & (0xFFFFF7FF & 0x5FFF);
        d.lllll[1008] = 0xFFFF9D7F & 0x66CF;
        d.lllll[1009] = -(0xFFFFA1FD & 0x7F43) & (0xFFFFAF7E & 0x7BF3);
        d.lllll[1010] = 0xFFFF8D3F & Short.MAX_VALUE;
        d.lllll[1011] = -(0xFFFFBF9F & 0x68E1) & (0xFFFFEAFD & 0x3FBF);
        d.lllll[1012] = -(0xFFFFD205 & 0x7DFB) & (0xFFFFF7FF & 0x7FEA);
        d.lllll[1013] = -(0xFFFFE7EF & 0x7D5E) & (0xFFFFEFDF & 0x77FF);
        d.lllll[1014] = -(0xFFFFADE7 & 0x767D) & (0xFFFFFEFF & 0x27E6);
        d.lllll[1015] = -(0xFFFFF8FB & 0x7757) & (0xFFFFFBFF & 0x7FF7);
        d.lllll[1016] = -(0xFFFFDD5F & 0x72A2) & (0xFFFFFBFF & 0x563F);
        d.lllll[1017] = 0xFFFFEFFC & 0x37D7;
        d.lllll[1018] = -(0xFFFFFBAF & 0x7F51) & (0xFFFFFF5B & Short.MAX_VALUE);
        d.lllll[1019] = 0xFFFFC6E7 & 0x3D9B;
        d.lllll[1020] = -(0xFFFFB2FE & 0x6F4F) & (0xFFFFAF5D & 0x7EFF);
        d.lllll[1021] = -(0xFFFFFD37 & 0x62CD) & (0xFFFFEF4E & 0x7DBD);
        d.lllll[1022] = 0xFFFFDEFF & 0x233F;
        d.lllll[1023] = -(0xFFFFFF3F & 0x58C1) & (0xFFFFFFFE & 0x7FEF);
        d.lllll[1024] = 0xFFFFCCAF & 0x3773;
        d.lllll[1025] = 0xFFFFEAFD & 0x1FC7;
        d.lllll[1026] = 0xFFFFAA41 & 0x57FE;
        d.lllll[1027] = 0xFFFFAFFB & 0x77E6;
        d.lllll[1028] = -(0xFFFFA5B5 & 0x5BFF) & (0xFFFFB3FF & 0x4FF7);
        d.lllll[1029] = -(0 + 11 - -103 + 19) & (0xFFFFE5DF & 0x1FBF);
        d.lllll[1030] = 0xFFFFB9FE & 0x56D7;
        d.lllll[1031] = 0xFFFF9FB6 & 0x6DDF;
        d.lllll[1032] = -(0xDA ^ 0xC6) & (0xFFFFBFFF & 0x67FF);
        d.lllll[1033] = 0xFFFFDEFF & 0x299F;
        d.lllll[1034] = -(0xFFFFE88B & 0x7FFC) & (0xFFFFFFDF & 0x7BFF);
        d.lllll[1035] = 0xFFFFA6EF & 0x5B52;
        d.lllll[1036] = 0xFFFFE2EE & 0x1F55;
        d.lllll[1037] = -(0xFFFF9D4F & 0x6ABE) & (0xFFFFFFFD & 0x2FFF);
        d.lllll[1038] = 0xFFFFEA7D & 0x1FF6;
        d.lllll[1039] = -(0xFFFFFDB7 & 0x6E5B) & (0xFFFFEE57 & Short.MAX_VALUE);
        d.lllll[1040] = 0xFFFFF7DF & 0xA66;
        d.lllll[1041] = -(0xFFFFF519 & 0x5EEF) & (0xFFFFF64F & 0x5FFF);
        d.lllll[1042] = 0xFFFFE7FD & 0x3FDE;
        d.lllll[1043] = 0xFFFFAA7F & 0x57FE;
        d.lllll[1044] = 0xFFFFE53F & 0x1FF7;
        d.lllll[1045] = -(0xFFFFE9A7 & 0x5FDF) & (0xFFFFFFFE & 0x4BCF);
        d.lllll[1046] = 0xFFFFFFDF & 0x27F8;
        d.lllll[1047] = 0xFFFFC7EF & 0x3E75;
        d.lllll[1048] = -(0xFFFFFEBB & 0x2DCD) & (0xFFFFAFEF & 0x7FDF);
        d.lllll[1049] = -(0xFFFFBDD7 & 0x526B) & (0xFFFFBDEF & 0x5E77);
        d.lllll[1050] = -(0xFFFFD10A & 0x3FF7) & (0xFFFFFFFF & 0x1DDF);
        d.lllll[1051] = -(0xFFFFF927 & 0x7FDB) & (0xFFFFFB4B & Short.MAX_VALUE);
        d.lllll[1052] = 0xFFFFE7F7 & 0x3FFE;
        d.lllll[1053] = -(0xFFFFFB57 & 0x7DAD) & (0xFFFFFFFF & 0x7D6F);
        d.lllll[1054] = 0xFFFFEF77 & 0x15CF;
        d.lllll[1055] = -(0xFFFFE201 & 0x5FFF) & (0xFFFFCFEB & 0x7EFF);
        d.lllll[1056] = 0xFFFFEB7B & 0x16CE;
        d.lllll[1057] = 0xFFFFB7FE & 0x6FF5;
        d.lllll[1058] = -(0xFFFFA5CB & 0x7F36) & (0xFFFFE7F5 & 0x3F7F);
        d.lllll[1059] = 0xFFFFED7D & 0x1FA3;
        d.lllll[1060] = 0xFFFF9FEF & 0x6D1B;
        d.lllll[1061] = -(0xFFFFECE3 & 0x7FBD) & (0xFFFFFEFF & 0x6FEB);
        d.lllll[1062] = 0xFFFFE7D2 & 0x3FFF;
        d.lllll[1063] = 0xFFFFBE2D & 0x45F7;
        d.lllll[1064] = 0xFFFFB75D & 0x4AEE;
        d.lllll[1065] = 0xFFFFFFD6 & 0x27F9;
        d.lllll[1066] = 0xFFFF94BB & 0x6F7F;
        d.lllll[1067] = 0xFFFFD779 & 0x2EFE;
        d.lllll[1068] = 0xFFFFDEFD & 0x2DA7;
        d.lllll[1069] = -(0xFFFFD59F & 0x7AFD) & (0xFFFFDFFD & 0x7EFF);
        d.lllll[1070] = -(0xFFFFEDF9 & 0x1B27) & (0xFFFFEF6F & 0x1BFD);
        d.lllll[1071] = -(0xFFFFDD77 & 0x6EBA) & (0xFFFFCF7F & 0x7EFF);
        d.lllll[1072] = 0xFFFFBFDA & 0x67FF;
        d.lllll[1073] = 0xFFFFB7F6 & 0x4E7F;
        d.lllll[1074] = 0xFFFF9CDD & 0x67F7;
        d.lllll[1075] = 0xFFFF8FF2 & 0x7BAD;
        d.lllll[1076] = -(0xFFFFF162 & 0x3EDF) & (0xFFFFBCEF & 0x7FF7);
        d.lllll[1077] = -(0xFFFFFDF3 & 0x7F3D) & (0xFFFFFFFF & 0x7F7F);
        d.lllll[1078] = 0xFFFFFFFF & 0x4D77;
        d.lllll[1079] = 0xFFFFB7F7 & 0x4BFD;
        d.lllll[1080] = 0xFFFF86FF & 0x7B7C;
        d.lllll[1081] = -(0xFFFFFB77 & 0x26EB) & (0xFFFFB7FF & Short.MAX_VALUE);
        d.lllll[1082] = -(0xFFFFC761 & 0x39BF) & (0xFFFFADFD & 0x5F7F);
        d.lllll[1083] = 0xFFFFDDBF & 0x2FCB;
        d.lllll[1084] = -(0xFFFF9DAF & 0x77F7) & (0xFFFFF7FF & 0x1FF6);
        d.lllll[1085] = 0xFFFFF7FA & 0x2FCF;
        d.lllll[1086] = -(0xFFFFF76F & 0x7B99) & (0xFFFFF7FF & 0x7FFD);
        d.lllll[1087] = 0xFFFFC47D & 0x3FF7;
        d.lllll[1088] = 0xFFFFFF6E & 0xDBD;
        d.lllll[1089] = -(55 + 71 - 10 + 45) & (0xFFFFEEF3 & 0x13FD);
        d.lllll[1090] = -(0xFFFFE967 & 0x77FB) & (0xFFFFFBFF & 0x6FFE);
        d.lllll[1091] = -(0xFFFFEDB7 & 0x3249) & (0xFFFFECFF & 0x3FDA);
        d.lllll[1092] = -(0xFFFFFAEB & 0x77D6) & (0xFFFFFFEF & Short.MAX_VALUE);
        d.lllll[1093] = 0xFFFFB3FA & 0x4E57;
        d.lllll[1094] = 0xFFFFFFBF & 0x3F8;
        d.lllll[1095] = 0xFFFF9FD3 & 0x627F;
        d.lllll[1096] = -(14 + 77 - 48 + 94) & (0xFFFFEDFE & 0x5FEF);
        d.lllll[1097] = -(0xFFFFFE71 & 0x71AF) & (0xFFFFFEF7 & 0x7DBD);
        d.lllll[1098] = 0xFFFFBBF7 & 0x465C;
        d.lllll[1099] = 0xFFFFCB75 & 0x36DF;
        d.lllll[1100] = -(0x66 ^ 0x5C) & (0xFFFFBCFF & 0x5F7D);
        d.lllll[1101] = -(0xFFFFF819 & 0x47EF) & (0xFFFFDFDF & 0x6D7F);
        d.lllll[1102] = 0xFFFFE77F & 0x1AD6;
        d.lllll[1103] = -(0xFFFFC92D & 0x3EF3) & (0xFFFFDB77 & 0x2EFF);
        d.lllll[1104] = -(0xFFFFA763 & 0x5DFF) & (0xFFFF8FFF & 0x7FFB);
        d.lllll[1105] = -(0xFFFFEE73 & 0x738D) & (0xFFFFFF7E & 0x6EDF);
        d.lllll[1106] = 0xFFFF9EF9 & 0x635E;
        d.lllll[1107] = 0xFFFFB6D9 & 0x4B7F;
        d.lllll[1108] = 0xFFFFF5BC & 0x6EFF;
        d.lllll[1109] = 0xFFFFDFCF & 0x25BA;
        d.lllll[1110] = 0xFFFFDF7F & 0x2E87;
        d.lllll[1111] = -(0xFFFFB37D & 0x7C8B) & (0xFFFFBF9F & 0x777F);
        d.lllll[1112] = 0xFFFFCFE5 & 0x3E7F;
        d.lllll[1113] = -(0xFFFFFAFB & 0x7D95) & (0xFFFFFFFE & 0x7F9F);
        d.lllll[1114] = 0xFFFFDAFB & 0x275E;
        d.lllll[1115] = 0xFFFFB77B & 0x4ADF;
        d.lllll[1116] = 0xFFFFAFFF & 0x7F93;
        d.lllll[1117] = -(0xFFFFD3D6 & 0x7D3D) & (0xFFFFDDF7 & Short.MAX_VALUE);
        d.lllll[1118] = 0xFFFFFDFF & 0xEDB;
        d.lllll[1119] = 0xFFFFE2DF & 0x1F7C;
        d.lllll[1120] = -(0xFFFFF3FF & 0x5C83) & (0xFFFFDBDF & 0x76FF);
        d.lllll[1121] = -(0xFFFFDCD7 & 0x2B2B) & (0xFFFFDFFB & 0x7DF7);
        d.lllll[1122] = -(0xFFFFA35F & 0x7EAB) & (0xFFFFFBEB & 0x2FFF);
        d.lllll[1123] = -(0xFFFFBE6B & 0x65B5) & (0xFFFFEFFE & 0x3F37);
        d.lllll[1124] = 0xFFFFDBDE & 0x267F;
        d.lllll[1125] = 0xFFFFE6FF & 0x1B5F;
        d.lllll[1126] = 0xFFFFEDFF & 0x1FBE;
        d.lllll[1127] = -(0xFFFF97A7 & 0x7BFF) & (0xFFFFBFFF & 0x5FF6);
        d.lllll[1128] = -(0xFFFFA71E & 0x78EB) & (0xFFFFFAE9 & 0x277F);
        d.lllll[1129] = -(0xFFFFF4EB & 0x1F9F) & (0xFFFFF7EB & 0x1EFF);
        d.lllll[1130] = 0xFFFFEFAB & 0x3FDE;
        d.lllll[1131] = 0xFFFF927A & 0x6FE7;
        d.lllll[1132] = -(0xFFFFFFFD & 0x481F) & (0xFFFFDAFF & 0x6F7F);
        d.lllll[1133] = 0xFFFFBFBE & 0x4DFD;
        d.lllll[1134] = -(0xFFFFE66F & 0x5D9C) & (0xFFFFFE7F & 0x4FBF);
        d.lllll[1135] = -(0xFFFFF6F6 & 0x692F) & (0xFFFFEDBF & Short.MAX_VALUE);
        d.lllll[1136] = 0xFFFF87F4 & 0x7A6F;
        d.lllll[1137] = -(0xFFFFC32F & 0x7ED7) & (0xFFFFEFAF & 0x5BFF);
        d.lllll[1138] = -(0xFFFFB35F & 0x6CB6) & (0xFFFFFFDF & 0x3F7F);
        d.lllll[1139] = 0xFFFFD3FF & 0x2E65;
        d.lllll[1140] = -(0xFFFFB5DD & 0x5E33) & (0xFFFFF6FF & 0x1F76);
        d.lllll[1141] = -(0xFFFFE771 & 0x7CEF) & (0xFFFFEEFF & Short.MAX_VALUE);
        d.lllll[1142] = -(0xFFFFB8F7 & 0x771D) & (0xFFFFFBF7 & 0x3FFF);
        d.lllll[1143] = 0xFFFFFAE7 & 0x77F;
        d.lllll[1144] = 0xFFFF8B68 & 0x76FF;
        d.lllll[1145] = -(0xFFFFBBD3 & 0x662D) & (0xFFFFBFB6 & 0x6FFF);
        d.lllll[1146] = 0xFFFFEFBE & 0x19DB;
        d.lllll[1147] = -(0xFFFF9D95 & 0x73FF) & (0xFFFFF7FF & 0x1BFD);
        d.lllll[1148] = 0xFFFF83FB & 0x7E6E;
        d.lllll[1149] = 0xFFFFEFFE & 0x5D73;
        d.lllll[1150] = 0xFFFFFE7B & 0xFDD;
        d.lllll[1151] = -(0xFFFFBFAD & 0x58D7) & (0xFFFFBEEF & 0x5BFF);
        d.lllll[1152] = -(0xFFFFFBA7 & 0x75DA) & (0xFFFFFBEF & 0x77FD);
        d.lllll[1153] = -(0xFFFFBB93 & 0x7CED) & (0xFFFFFAEF & 0x3FFD);
        d.lllll[1154] = -(0xFFFFDEFA & 0x7107) & (0xFFFFFF6F & 0x52FF);
        d.lllll[1155] = 0xFFFFBF7F & 0x42EF;
        d.lllll[1156] = 0xFFFF9E75 & 0x63FA;
        d.lllll[1157] = 0xFFFFBA7B & 0x47F5;
        d.lllll[1158] = -(0xFFFFFBC6 & 0x3DBF) & (0xFFFFBBFF & 0x7FF7);
        d.lllll[1159] = -(0xFFFFFFED & 0x791F) & (0xFFFFFF7F & 0x7BFF);
        d.lllll[1160] = 0xFFFFC6F7 & 0x3B7D;
        d.lllll[1161] = 0xFFFF97FE & 0x6A77;
        d.lllll[1162] = 0xFFFFD2FF & 0x2F77;
        d.lllll[1163] = -(0xFFFFBC17 & 0x6FEF) & (0xFFFFBFFF & 0x6E7E);
        d.lllll[1164] = 0xFFFFD779 & 0x2AFF;
        d.lllll[1165] = -(0xFFFFF7A7 & 0x38DE) & (0xFFFFFFFF & 0x32FF);
        d.lllll[1166] = 0xFFFFC67B & 0x3BFF;
        d.lllll[1167] = -(0xFFFFBBF5 & 0x740B) & (0xFFFFBFED & 0x7DFF);
        d.lllll[1168] = 0xFFFFDAFD & 0x277F;
        d.lllll[1169] = 0xFFFFAFAE & 0x5D5F;
        d.lllll[1170] = -(0xFFFFE6D5 & 0x596F) & (0xFFFFEFFF & 0x5CFF);
        d.lllll[1171] = 0xFFFF937F & 0x6EFF;
        d.lllll[1172] = -(0xFFFFF52F & 0x1BF5) & (0xFFFFB7A5 & 0x5BFF);
        d.lllll[1173] = 0xFFFFEF1F & 0x1CFC;
        d.lllll[1174] = -(0xFFFFE3FF & 0x7C71) & (0xFFFFF3F7 & 0x6EFB);
        d.lllll[1175] = 0xFFFF93AE & 0x6ED5;
        d.lllll[1176] = -(0xFFFFAFD3 & 0x746F) & (0xFFFFFFFF & 0x26C7);
        d.lllll[1177] = -(0xFFFFDEDD & 0x2D2B) & (0xFFFFFFDE & 0xEAF);
        d.lllll[1178] = -(0xFFFFBFFF & 0x7C79) & (0xFFFFBFFF & 0x7EFF);
        d.lllll[1179] = 0xFFFFCEA9 & 0x33DF;
        d.lllll[1180] = 0xFFFFCFBE & 0x32CB;
        d.lllll[1181] = -(0xFFFF9E5D & 0x71F3) & (0xFFFFFFDB & 0x12FF);
        d.lllll[1182] = -(0xFFFFFFF7 & 0x707B) & (0xFFFFFEFE & 0x73FF);
        d.lllll[1183] = 0xFFFFDFBF & 0x22CD;
        d.lllll[1184] = 0xFFFFE78F & 0x1AFF;
        d.lllll[1185] = -(0xFFFFFD67 & 0x7EDE) & (0xFFFFFFFD & 0x7ED7);
        d.lllll[1186] = 0xFFFFA7BF & 0x5AD1;
        d.lllll[1187] = 0xFFFFBB9B & 0x46F7;
        d.lllll[1188] = -(0xFFFFCF49 & 0x3CFF) & (0xFFFFFEFF & 0xFDC);
        d.lllll[1189] = 0xFFFFBF2E & 0x4AF7;
        d.lllll[1190] = -(0xFFFFBC29 & 0x67F7) & (0xFFFFAFF7 & 0x76BD);
        d.lllll[1191] = -(0xFFFFCC62 & Short.MAX_VALUE) & (0xFFFFFFF7 & 0x4EFF);
        d.lllll[1192] = 0xFFFFC7BF & 0x3AD7;
        d.lllll[1193] = 0xFFFFAAFD & 0x579A;
        d.lllll[1194] = 0xFFFFCEF9 & 0x339F;
    }

    private static /* synthetic */ boolean f(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (d.lIIlIIIl(nPC.getName().contains(lllII[lllll[1162]]) ? 1 : 0) && d.lIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), lllll[36])) {
            n2 = lllll[1];
            0;
            if (null != null) {
                return ((0x4B ^ 0x53 ^ (0x44 ^ 4)) & (77 + 188 - 127 + 102 ^ 71 + 48 - -4 + 45 ^ -1)) != 0;
            }
        } else {
            n2 = lllll[0];
        }
        return n2 != 0;
    }
}

