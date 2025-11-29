/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.account.LocalPlayer
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AMHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class ALHelper
implements ac {
    public static  String nN;
    static  WorldPoint nQ;
    public static  WorldPoint nI;
    static  WorldPoint nR;
    
    public static  List<d> bv;
    public static  WorldArea nM;
    public static  int mT;
    public static  WorldArea nH;
    public static  int mV;
    public static  boolean bt;
    public static  int nK;
    public static  int mU;
    static  WorldArea nO;
    public static  WorldArea nL;
    static  int cG;
    public static  int nJ;
    static  WorldPoint nP;

    private static void lIlllIlIlIlll() {
        llIlllIlII = new String[llIllllIIl[291]];
        aL.llIlllIlII[aL.llIllllIIl[0]] = "Buying items";
        aL.llIlllIlII[aL.llIllllIIl[1]] = "Finished buying items, switching back to agility";
        aL.llIlllIlII[aL.llIllllIIl[2]] = "Read";
        aL.llIlllIlII[aL.llIllllIIl[10]] = "Break";
        aL.llIlllIlII[aL.llIllllIIl[11]] = "Navigating to bank";
        aL.llIlllIlII[aL.llIllllIIl[14]] = "Veliaf Hurtz";
        aL.llIlllIlII[aL.llIllllIIl[15]] = "Ladder";
        aL.llIlllIlII[aL.llIllllIIl[3]] = "Climb-up";
        aL.llIlllIlII[aL.llIllllIIl[16]] = "Veliaf Hurtz";
        aL.llIlllIlII[aL.llIllllIIl[17]] = "Nav to burgh bank";
        aL.llIlllIlII[aL.llIllllIIl[18]] = "Handling banking";
        aL.llIlllIlII[aL.llIllllIIl[20]] = "Bank";
        aL.llIlllIlII[aL.llIllllIIl[24]] = "Vial";
        aL.llIlllIlII[aL.llIllllIIl[25]] = "Vial";
        aL.llIlllIlII[aL.llIllllIIl[26]] = "Drop";
        aL.llIlllIlII[aL.llIllllIIl[28]] = "Drink";
        aL.llIlllIlII[aL.llIllllIIl[30]] = "Read";
        aL.llIlllIlII[aL.llIllllIIl[31]] = "Reward token";
        aL.llIlllIlII[aL.llIllllIIl[32]] = "Nav to city escort tile";
        aL.llIlllIlII[aL.llIllllIIl[33]] = "Reward token";
        aL.llIlllIlII[aL.llIllllIIl[36]] = "Clicking npc";
        aL.llIlllIlII[aL.llIllllIIl[38]] = "Escort";
        aL.llIlllIlII[aL.llIllllIIl[39]] = "Yes.";
        aL.llIlllIlII[aL.llIllllIIl[40]] = "Reward token";
        aL.llIlllIlII[aL.llIllllIIl[41]] = "Nav to npc";
        aL.llIlllIlII[aL.llIllllIIl[29]] = "Reward token";
        aL.llIlllIlII[aL.llIllllIIl[42]] = "Clicking npc";
        aL.llIlllIlII[aL.llIllllIIl[44]] = "Escort";
        aL.llIlllIlII[aL.llIllllIIl[45]] = "Knife";
        aL.llIlllIlII[aL.llIllllIIl[46]] = "Hammer";
        aL.llIlllIlII[aL.llIllllIIl[4]] = "Nav to canafis bank";
        aL.llIlllIlII[aL.llIllllIIl[47]] = "Nav to burgh bank";
        aL.llIlllIlII[aL.llIllllIIl[48]] = "Handle banking";
        aL.llIlllIlII[aL.llIllllIIl[49]] = "Handle banking";
        aL.llIlllIlII[aL.llIllllIIl[50]] = "Eat";
        aL.llIlllIlII[aL.llIllllIIl[52]] = "Yes.";
        aL.llIlllIlII[aL.llIllllIIl[53]] = "Starting trek";
        aL.llIlllIlII[aL.llIllllIIl[56]] = "Vampyre Juvinate";
        aL.llIlllIlII[aL.llIllllIIl[57]] = "Giant snail";
        aL.llIlllIlII[aL.llIllllIIl[58]] = "Nail beast";
        aL.llIlllIlII[aL.llIllllIIl[59]] = "Abidor Crank";
        aL.llIlllIlII[aL.llIllllIIl[60]] = "Swamp snake";
        aL.llIlllIlII[aL.llIllllIIl[61]] = "Riyl shadow";
        aL.llIlllIlII[aL.llIllllIIl[62]] = "Bog";
        aL.llIlllIlII[aL.llIllllIIl[63]] = "Evading combat event";
        aL.llIlllIlII[aL.llIllllIIl[64]] = "Evade-event";
        aL.llIlllIlII[aL.llIllllIIl[67]] = "Ghast";
        aL.llIlllIlII[aL.llIllllIIl[69]] = "Evading ghast event";
        aL.llIlllIlII[aL.llIllllIIl[70]] = "Evade-event";
        aL.llIlllIlII[aL.llIllllIIl[71]] = "Broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[27]] = "broken bridge event";
        aL.llIlllIlII[aL.llIllllIIl[72]] = "Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[73]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[74]] = "Take";
        aL.llIlllIlII[aL.llIllllIIl[75]] = "Undead Lumberjack";
        aL.llIlllIlII[aL.llIllllIIl[76]] = "Attack";
        aL.llIlllIlII[aL.llIllllIIl[77]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[78]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[79]] = "Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[81]] = "Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[68]] = "Chop down";
        aL.llIlllIlII[aL.llIllllIIl[82]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[83]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[84]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[85]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[86]] = "Broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[87]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[88]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[89]] = "Broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[90]] = "Yes.";
        aL.llIlllIlII[aL.llIllllIIl[91]] = "Partially broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[92]] = "partial bridge event";
        aL.llIlllIlII[aL.llIllllIIl[93]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[94]] = "Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[95]] = "Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[96]] = "Chop down";
        aL.llIlllIlII[aL.llIllllIIl[97]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[98]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[99]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[100]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[101]] = "Partially broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[102]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[103]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[104]] = "Partially broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[105]] = "Partially broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[106]] = "Inspect";
        aL.llIlllIlII[aL.llIllllIIl[107]] = "Yes.";
        aL.llIlllIlII[aL.llIllllIIl[108]] = "Slightly broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[109]] = "slightly bridge event";
        aL.llIlllIlII[aL.llIllllIIl[110]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[111]] = "Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[112]] = "Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[113]] = "Chop down";
        aL.llIlllIlII[aL.llIllllIIl[114]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[115]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[116]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[117]] = "Plank";
        aL.llIlllIlII[aL.llIllllIIl[118]] = "Slightly broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[119]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[120]] = "Logs";
        aL.llIlllIlII[aL.llIllllIIl[13]] = "Slightly broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[121]] = "Slightly broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[122]] = "Inspect";
        aL.llIlllIlII[aL.llIllllIIl[123]] = "Yes.";
        aL.llIlllIlII[aL.llIllllIIl[124]] = "Fixed bridge";
        aL.llIlllIlII[aL.llIllllIIl[125]] = "Path";
        aL.llIlllIlII[aL.llIllllIIl[126]] = "Continuing trek";
        aL.llIlllIlII[aL.llIllllIIl[127]] = "Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[128]] = "Crossing bridge";
        aL.llIlllIlII[aL.llIllllIIl[129]] = "Cross";
        aL.llIlllIlII[aL.llIllllIIl[130]] = "Swamp tree";
        aL.llIlllIlII[aL.llIllllIIl[131]] = "Path";
        aL.llIlllIlII[aL.llIllllIIl[132]] = "Short vine";
        aL.llIlllIlII[aL.llIllllIIl[133]] = "Short vine";
        aL.llIlllIlII[aL.llIllllIIl[134]] = "Cutting vines";
        aL.llIlllIlII[aL.llIllllIIl[135]] = "Swamp tree";
        aL.llIlllIlII[aL.llIllllIIl[136]] = "Cut-vine";
        aL.llIlllIlII[aL.llIllllIIl[137]] = "Short vine";
        aL.llIlllIlII[aL.llIllllIIl[138]] = "Short vine";
        aL.llIlllIlII[aL.llIllllIIl[139]] = "Short vine";
        aL.llIlllIlII[aL.llIllllIIl[140]] = "Short vine";
        aL.llIlllIlII[aL.llIllllIIl[141]] = "Long vine";
        aL.llIlllIlII[aL.llIllllIIl[142]] = "Long vine";
        aL.llIlllIlII[aL.llIllllIIl[144]] = "Swamp tree branch";
        aL.llIlllIlII[aL.llIllllIIl[145]] = "Swing-from";
        aL.llIlllIlII[aL.llIllllIIl[146]] = "Continuing trek";
        aL.llIlllIlII[aL.llIllllIIl[147]] = "Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[148]] = "Bog";
        aL.llIlllIlII[aL.llIllllIIl[149]] = "Solving bog";
        aL.llIlllIlII[aL.llIllllIIl[150]] = "Start of bog section";
        aL.llIlllIlII[aL.llIllllIIl[151]] = "Bog";
        aL.llIlllIlII[aL.llIllllIIl[152]] = "Set tiles";
        aL.llIlllIlII[aL.llIllllIIl[153]] = "Set anchor";
        aL.llIlllIlII[aL.llIllllIIl[154]] = "Path";
        aL.llIlllIlII[aL.llIllllIIl[155]] = "Generating path";
        aL.llIlllIlII[aL.llIllllIIl[156]] = "Path found:";
        aL.llIlllIlII[aL.llIllllIIl[157]] = "Walk to start tile";
        aL.llIlllIlII[aL.llIllllIIl[160]] = "Navigating bog";
        aL.llIlllIlII[aL.llIllllIIl[161]] = "Bog";
        aL.llIlllIlII[aL.llIllllIIl[162]] = "Stand-on";
        aL.llIlllIlII[aL.llIllllIIl[163]] = "Removed tile";
        aL.llIlllIlII[aL.llIllllIIl[164]] = "Not logged in, breaking";
        aL.llIlllIlII[aL.llIllllIIl[165]] = "No path found.";
        aL.llIlllIlII[aL.llIllllIIl[166]] = "Continue trek";
        aL.llIlllIlII[aL.llIllllIIl[167]] = "Path";
        aL.llIlllIlII[aL.llIllllIIl[168]] = "Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[169]] = "Generating path";
        aL.llIlllIlII[aL.llIllllIIl[170]] = "Path found:";
        aL.llIlllIlII[aL.llIllllIIl[171]] = "Walk to start tile";
        aL.llIlllIlII[aL.llIllllIIl[172]] = "Navigating bog";
        aL.llIlllIlII[aL.llIllllIIl[173]] = "Bog";
        aL.llIlllIlII[aL.llIllllIIl[174]] = "Stand-on";
        aL.llIlllIlII[aL.llIllllIIl[175]] = "Removed tile";
        aL.llIlllIlII[aL.llIllllIIl[176]] = "Not logged in, breaking";
        aL.llIlllIlII[aL.llIllllIIl[177]] = "No path found.";
        aL.llIlllIlII[aL.llIllllIIl[178]] = "Continue trek";
        aL.llIlllIlII[aL.llIllllIIl[179]] = "Path";
        aL.llIlllIlII[aL.llIllllIIl[180]] = "Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[181]] = "In bog too long, logging to reset";
        aL.llIlllIlII[aL.llIllllIIl[182]] = "Handling banking";
        aL.llIlllIlII[aL.llIllllIIl[183]] = "Bank";
        aL.llIlllIlII[aL.llIllllIIl[184]] = "Bank";
        aL.llIlllIlII[aL.llIllllIIl[186]] = "Needs items, banking";
        aL.llIlllIlII[aL.llIllllIIl[187]] = "Dragon sword";
        aL.llIlllIlII[aL.llIllllIIl[188]] = "Dragon sword";
        aL.llIlllIlII[aL.llIllllIIl[191]] = "Bronze axe";
        aL.llIlllIlII[aL.llIllllIIl[192]] = "Wear";
        aL.llIlllIlII[aL.llIllllIIl[193]] = "Wear";
        aL.llIlllIlII[aL.llIllllIIl[194]] = "Wield";
        aL.llIlllIlII[aL.llIllllIIl[195]] = "Wield";
        aL.llIlllIlII[aL.llIllllIIl[196]] = "Equip";
        aL.llIlllIlII[aL.llIllllIIl[197]] = "Equip";
        aL.llIlllIlII[aL.llIllllIIl[199]] = "Give me a PK skull.";
        aL.llIlllIlII[aL.llIllllIIl[200]] = "Wear";
        aL.llIlllIlII[aL.llIllllIIl[201]] = "Wear";
        aL.llIlllIlII[aL.llIllllIIl[202]] = "Wield";
        aL.llIlllIlII[aL.llIllllIIl[203]] = "Wield";
        aL.llIlllIlII[aL.llIllllIIl[204]] = "Equip";
        aL.llIlllIlII[aL.llIllllIIl[205]] = "Equip";
        aL.llIlllIlII[aL.llIllllIIl[206]] = "Reward token";
        aL.llIlllIlII[aL.llIllllIIl[207]] = "Claiming reward;";
        aL.llIlllIlII[aL.llIllllIIl[208]] = "Reward token";
        aL.llIlllIlII[aL.llIllllIIl[209]] = "Look-at";
        aL.llIlllIlII[aL.llIllllIIl[211]] = "Selecting reward";
        aL.llIlllIlII[aL.llIllllIIl[212]] = "xp";
        aL.llIlllIlII[aL.llIllllIIl[213]] = "Details";
        aL.llIlllIlII[aL.llIllllIIl[214]] = "bs";
        aL.llIlllIlII[aL.llIllllIIl[215]] = "Details";
        aL.llIlllIlII[aL.llIllllIIl[216]] = "ess";
        aL.llIlllIlII[aL.llIllllIIl[217]] = "Details";
        aL.llIlllIlII[aL.llIllllIIl[218]] = "bars";
        aL.llIlllIlII[aL.llIllllIIl[219]] = "Details";
        aL.llIlllIlII[aL.llIllllIIl[220]] = "herbs";
        aL.llIlllIlII[aL.llIllllIIl[221]] = "Details";
        aL.llIlllIlII[aL.llIllllIIl[222]] = "ores";
        aL.llIlllIlII[aL.llIllllIIl[223]] = "Details";
        aL.llIlllIlII[aL.llIllllIIl[224]] = "Claiming";
        aL.llIlllIlII[aL.llIllllIIl[226]] = "Claim";
        aL.llIlllIlII[aL.llIllllIIl[227]] = "Read";
        aL.llIlllIlII[aL.llIllllIIl[249]] = "Temple trekking";
        aL.llIlllIlII[aL.llIllllIIl[250]] = "tome";
        aL.llIlllIlII[aL.llIllllIIl[251]] = "Bank booth";
        aL.llIlllIlII[aL.llIllllIIl[252]] = "Bank";
        aL.llIlllIlII[aL.llIllllIIl[253]] = "Path";
        aL.llIlllIlII[aL.llIllllIIl[254]] = "Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[256]] = "Swing-from";
        aL.llIlllIlII[aL.llIllllIIl[257]] = "Cut-vine";
        aL.llIlllIlII[aL.llIllllIIl[258]] = "Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[259]] = "Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[260]] = "Cross";
        aL.llIlllIlII[aL.llIllllIIl[261]] = "Fixed bridge";
        aL.llIlllIlII[aL.llIllllIIl[262]] = "Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[263]] = "Lumberjack";
        aL.llIlllIlII[aL.llIllllIIl[264]] = "bridge";
        aL.llIlllIlII[aL.llIllllIIl[265]] = "Evade-event";
        aL.llIlllIlII[aL.llIllllIIl[266]] = "Evade-event";
        aL.llIlllIlII[aL.llIllllIIl[267]] = "Swamp tree";
        aL.llIlllIlII[aL.llIllllIIl[268]] = "bridge";
        aL.llIlllIlII[aL.llIllllIIl[270]] = "Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[271]] = "Read";
        aL.llIlllIlII[aL.llIllllIIl[272]] = "Drop";
        aL.llIlllIlII[aL.llIllllIIl[273]] = "tome";
        aL.llIlllIlII[aL.llIllllIIl[274]] = "tome";
        aL.llIlllIlII[aL.llIllllIIl[284]] = "xp";
    }

    private static boolean lIlllIllIIIlI(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlllIlIllllI(int n2) {
        return n2 == 0;
    }

    public static void gc() {
        Object var2;
        block116: {
            Object var3;
            block117: {
                Object var4;
                Object var5;
                block119: {
                    block118: {
                        block113: {
                            block115: {
                                block114: {
                                    block110: {
                                        block112: {
                                            block111: {
                                                block105: {
                                                    block109: {
                                                        block108: {
                                                            block107: {
                                                                block106: {
                                                                    Object var6;
                                                                    block104: {
                                                                        block103: {
                                                                            String[] stringArray = new String[llIllllIIl[1]];
                                                                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[52]];
                                                                            g.a(stringArray);
                                                                            TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                                                                                String[] stringArray = new String[llIllllIIl[1]];
                                                                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[271]];
                                                                                return tileObject.hasAction(stringArray);
                                                                            });
                                                                            TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
                                                                                String[] stringArray = new String[llIllllIIl[1]];
                                                                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[270]];
                                                                                return tileObject.hasAction(stringArray);
                                                                            });
                                                                            if (aL.lIlllIllIIIIl(Widgets.get((int)llIllllIIl[34], (int)llIllllIIl[24])) && aL.lIlllIllIIIIl(tileObject2) && aL.lIlllIllIIIIl(tileObject3) && aL.lIlllIlIlllIl(tileObject2.distanceTo((Locatable)tileObject3), llIllllIIl[16]) && aL.lIlllIlIlllIl(mV, llIllllIIl[14])) {
                                                                                nR = null;
                                                                                cG = llIllllIIl[0];
                                                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[53]];
                                                                                Widget widget = Widgets.get((int)llIllllIIl[34], (int)llIllllIIl[24]);
                                                                                if (aL.lIlllIllIIIIl(widget)) {
                                                                                    Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)llIllllIIl[1]);
                                                                                    Time.sleepUntil(() -> {
                                                                                        boolean bl;
                                                                                        if (aL.lIlllIllIIIlI(Widgets.fromId((int)llIllllIIl[269]))) {
                                                                                            bl = llIllllIIl[1];

                                                                                            }
                                                                                        } else {
                                                                                            bl = llIllllIIl[0];
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)llIllllIIl[54], (int)llIllllIIl[55]);

                                                                                    mV += llIllllIIl[1];
                                                                                }
                                                                            }
                                                                            String[] stringArray2 = new String[llIllllIIl[1]];
                                                                            stringArray2[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[56]];
                                                                            if (!aL.lIlllIllIIIlI(NPCs.getNearest((String[])stringArray2))) break block103;
                                                                            String[] stringArray3 = new String[llIllllIIl[1]];
                                                                            stringArray3[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[57]];
                                                                            if (!aL.lIlllIllIIIlI(NPCs.getNearest((String[])stringArray3))) break block103;
                                                                            String[] stringArray4 = new String[llIllllIIl[1]];
                                                                            stringArray4[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[58]];
                                                                            if (!aL.lIlllIllIIIlI(NPCs.getNearest((String[])stringArray4))) break block103;
                                                                            String[] stringArray5 = new String[llIllllIIl[1]];
                                                                            stringArray5[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[59]];
                                                                            if (!aL.lIlllIllIIIlI(NPCs.getNearest((String[])stringArray5))) break block103;
                                                                            String[] stringArray6 = new String[llIllllIIl[1]];
                                                                            stringArray6[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[60]];
                                                                            if (!aL.lIlllIllIIIlI(NPCs.getNearest((String[])stringArray6))) break block103;
                                                                            String[] stringArray7 = new String[llIllllIIl[1]];
                                                                            stringArray7[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[61]];
                                                                            if (aL.lIlllIllIIIlI(NPCs.getNearest((String[])stringArray7)) && (!aL.lIlllIllIIIlI(TileObjects.getNearest(tileObject -> tileObject.getName().contains(llIlllIlII[llIllllIIl[268]]))) || !aL.lIlllIllIIIlI(TileObjects.getNearest(tileObject -> tileObject.getName().contains(llIlllIlII[llIllllIIl[267]]))))) break block104;
                                                                        }
                                                                        if (aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllllIIl[27])) {
                                                                            String[] stringArray = new String[llIllllIIl[1]];
                                                                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[62]];
                                                                            if (aL.lIlllIllIIIlI(TileObjects.getNearest((String[])stringArray))) {
                                                                                nR = null;
                                                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[63]];
                                                                                var6 = tileObject -> {
                                                                                    String[] stringArray = new String[llIllllIIl[1]];
                                                                                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[266]];
                                                                                    return tileObject.hasAction(stringArray);
                                                                                };
                                                                                var2 = TileObjects.getNearest((Predicate)var6);
                                                                                if (aL.lIlllIllIIIIl(var2)) {
                                                                                    var2.interact(llIlllIlII[llIllllIIl[64]]);
                                                                                    Time.sleepUntil(() -> {
                                                                                        boolean bl;
                                                                                        if (aL.lIlllIlIllllI(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                            bl = llIllllIIl[1];

                                                                                            if (3 <= 0) {
                                                                                                return ((0 ^ 0x7D ^ (0x45 ^ 0x16)) & (0x55 ^ 0xB ^ (0xFF ^ 0x8F) ^ -1)) != 0;
                                                                                            }
                                                                                        } else {
                                                                                            bl = llIllllIIl[0];
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)Rand.nextInt((int)llIllllIIl[65], (int)llIllllIIl[66]));

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    String[] stringArray = new String[llIllllIIl[1]];
                                                                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[67]];
                                                                    if (aL.lIlllIllIIIIl(NPCs.getNearest((String[])stringArray)) && aL.lIlllIlIllllI(nH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nI), llIllllIIl[68])) {
                                                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[69]];
                                                                        var6 = tileObject -> {
                                                                            String[] stringArray = new String[llIllllIIl[1]];
                                                                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[265]];
                                                                            return tileObject.hasAction(stringArray);
                                                                        };
                                                                        var2 = TileObjects.getNearest((Predicate)var6);
                                                                        if (aL.lIlllIllIIIIl(var2)) {
                                                                            var2.interact(llIlllIlII[llIllllIIl[70]]);
                                                                            Time.sleepUntil(() -> {
                                                                                boolean bl;
                                                                                if (aL.lIlllIlIllllI(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                    bl = llIllllIIl[1];

                                                                                } else {
                                                                                    bl = llIllllIIl[0];
                                                                                }
                                                                                return bl;
                                                                            }, (int)Rand.nextInt((int)llIllllIIl[65], (int)llIllllIIl[66]));

                                                                        }
                                                                    }
                                                                    var6 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llIlllIlII[llIllllIIl[264]]));
                                                                    String[] stringArray8 = new String[llIllllIIl[1]];
                                                                    stringArray8[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[71]];
                                                                    if (!aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray8))) break block105;
                                                                    nR = null;
                                                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[27]];
                                                                    String[] stringArray9 = new String[llIllllIIl[1]];
                                                                    stringArray9[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[72]];
                                                                    if (aL.lIlllIllIIIlI(TileObjects.getNearest((String[])stringArray9))) {
                                                                        String[] stringArray10 = new String[llIllllIIl[1]];
                                                                        stringArray10[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[73]];
                                                                        var2 = TileItems.getNearest((String[])stringArray10);
                                                                        if (aL.lIlllIllIIIIl(var2)) {
                                                                            var2.interact(llIlllIlII[llIllllIIl[74]]);
                                                                            Time.sleepTicks((int)llIllllIIl[1]);

                                                                        }
                                                                        if (aL.lIlllIllIIIIl(var3 = TileItems.getNearest(tileItem -> tileItem.getName().contains(llIlllIlII[llIllllIIl[263]])))) {
                                                                            // empty if block
                                                                        }
                                                                        String[] stringArray11 = new String[llIllllIIl[1]];
                                                                        stringArray11[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[75]];
                                                                        var5 = NPCs.getNearest((String[])stringArray11);
                                                                        if (aL.lIlllIllIIIIl(var5) && aL.lIlllIllIIlll(LocalPlayer.get().getInteracting(), var5) && aL.lIlllIllIIIlI(var2) && aL.lIlllIlIllllI(var5.isDead() ? 1 : 0) && aL.lIlllIlIlllII(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
                                                                            var5.interact(llIlllIlII[llIllllIIl[76]]);
                                                                            Time.sleepTicks((int)llIllllIIl[1]);

                                                                        }
                                                                    }
                                                                    String[] stringArray12 = new String[llIllllIIl[1]];
                                                                    stringArray12[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[77]];
                                                                    if (!aL.lIlllIlIlllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) break block106;
                                                                    String[] stringArray13 = new String[llIllllIIl[1]];
                                                                    stringArray13[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[78]];
                                                                    if (!aL.lIlllIlIlllIl(Inventory.getAll((String[])stringArray13).size(), llIllllIIl[10])) break block107;
                                                                }
                                                                String[] stringArray = new String[llIllllIIl[1]];
                                                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[79]];
                                                                if (aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray)) && aL.lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                                                    String[] stringArray14 = new String[llIllllIIl[1]];
                                                                    stringArray14[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[81]];
                                                                    TileObjects.getNearest((String[])stringArray14).interact(llIlllIlII[llIllllIIl[68]]);
                                                                    Time.sleepTicks((int)llIllllIIl[2]);

                                                                }
                                                            }
                                                            String[] stringArray = new String[llIllllIIl[1]];
                                                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[82]];
                                                            if (!aL.lIlllIlIlllIl(Inventory.getAll((String[])stringArray).size(), llIllllIIl[10])) break block108;
                                                            String[] stringArray15 = new String[llIllllIIl[1]];
                                                            stringArray15[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[83]];
                                                            if (!aL.lIlllIllIIlII(Inventory.getAll((String[])stringArray15).size(), llIllllIIl[10])) break block109;
                                                        }
                                                        String[] stringArray = new String[llIllllIIl[1]];
                                                        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[84]];
                                                        if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0) && aL.lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                                            String[] stringArray16 = new String[llIllllIIl[1]];
                                                            stringArray16[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[85]];
                                                            String[] stringArray17 = new String[llIllllIIl[1]];
                                                            stringArray17[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[86]];
                                                            Inventory.getFirst((String[])stringArray16).useOn(TileObjects.getNearest((String[])stringArray17));
                                                            Time.sleepTicks((int)llIllllIIl[2]);

                                                        }
                                                        String[] stringArray18 = new String[llIllllIIl[1]];
                                                        stringArray18[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[87]];
                                                        if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray18) ? 1 : 0) && aL.lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                                            String[] stringArray19 = new String[llIllllIIl[1]];
                                                            stringArray19[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[88]];
                                                            String[] stringArray20 = new String[llIllllIIl[1]];
                                                            stringArray20[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[89]];
                                                            Inventory.getFirst((String[])stringArray19).useOn(TileObjects.getNearest((String[])stringArray20));
                                                            Time.sleepTicks((int)llIllllIIl[2]);

                                                        }
                                                    }
                                                    String[] stringArray = new String[llIllllIIl[1]];
                                                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[90]];
                                                    g.a(stringArray);
                                                }
                                                String[] stringArray = new String[llIllllIIl[1]];
                                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[91]];
                                                if (!aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray))) break block110;
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[92]];
                                                String[] stringArray21 = new String[llIllllIIl[1]];
                                                stringArray21[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[93]];
                                                if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray21) ? 1 : 0) && aL.lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                                    String[] stringArray22 = new String[llIllllIIl[1]];
                                                    stringArray22[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[94]];
                                                    if (aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray22))) {
                                                        String[] stringArray23 = new String[llIllllIIl[1]];
                                                        stringArray23[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[95]];
                                                        TileObjects.getNearest((String[])stringArray23).interact(llIlllIlII[llIllllIIl[96]]);
                                                        Time.sleepTicks((int)llIllllIIl[2]);

                                                    }
                                                }
                                                String[] stringArray24 = new String[llIllllIIl[1]];
                                                stringArray24[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[97]];
                                                if (!aL.lIlllIlIllllI(Inventory.contains((String[])stringArray24) ? 1 : 0)) break block111;
                                                String[] stringArray25 = new String[llIllllIIl[1]];
                                                stringArray25[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[98]];
                                                if (!aL.lIlllIlIlllII(Inventory.contains((String[])stringArray25) ? 1 : 0)) break block112;
                                            }
                                            String[] stringArray = new String[llIllllIIl[1]];
                                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[99]];
                                            if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0) && aL.lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                                String[] stringArray26 = new String[llIllllIIl[1]];
                                                stringArray26[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[100]];
                                                String[] stringArray27 = new String[llIllllIIl[1]];
                                                stringArray27[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[101]];
                                                Inventory.getFirst((String[])stringArray26).useOn(TileObjects.getNearest((String[])stringArray27));
                                                Time.sleepTicks((int)llIllllIIl[2]);

                                            }
                                            String[] stringArray28 = new String[llIllllIIl[1]];
                                            stringArray28[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[102]];
                                            if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray28) ? 1 : 0) && aL.lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                                String[] stringArray29 = new String[llIllllIIl[1]];
                                                stringArray29[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[103]];
                                                String[] stringArray30 = new String[llIllllIIl[1]];
                                                stringArray30[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[104]];
                                                Inventory.getFirst((String[])stringArray29).useOn(TileObjects.getNearest((String[])stringArray30));
                                                Time.sleepTicks((int)llIllllIIl[2]);

                                            }
                                            String[] stringArray31 = new String[llIllllIIl[1]];
                                            stringArray31[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[105]];
                                            TileObjects.getNearest((String[])stringArray31).interact(llIlllIlII[llIllllIIl[106]]);
                                            Time.sleepTicks((int)llIllllIIl[2]);

                                        }
                                        String[] stringArray = new String[llIllllIIl[1]];
                                        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[107]];
                                        g.a(stringArray);
                                    }
                                    String[] stringArray = new String[llIllllIIl[1]];
                                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[108]];
                                    if (!aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray))) break block113;
                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[109]];
                                    String[] stringArray32 = new String[llIllllIIl[1]];
                                    stringArray32[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[110]];
                                    if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray32) ? 1 : 0) && aL.lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] stringArray33 = new String[llIllllIIl[1]];
                                        stringArray33[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[111]];
                                        if (aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray33))) {
                                            String[] stringArray34 = new String[llIllllIIl[1]];
                                            stringArray34[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[112]];
                                            TileObjects.getNearest((String[])stringArray34).interact(llIlllIlII[llIllllIIl[113]]);
                                            Time.sleepTicks((int)llIllllIIl[2]);

                                        }
                                    }
                                    String[] stringArray35 = new String[llIllllIIl[1]];
                                    stringArray35[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[114]];
                                    if (!aL.lIlllIlIllllI(Inventory.contains((String[])stringArray35) ? 1 : 0)) break block114;
                                    String[] stringArray36 = new String[llIllllIIl[1]];
                                    stringArray36[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[115]];
                                    if (!aL.lIlllIlIlllII(Inventory.contains((String[])stringArray36) ? 1 : 0)) break block115;
                                }
                                String[] stringArray = new String[llIllllIIl[1]];
                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[116]];
                                if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0) && aL.lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                    String[] stringArray37 = new String[llIllllIIl[1]];
                                    stringArray37[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[117]];
                                    String[] stringArray38 = new String[llIllllIIl[1]];
                                    stringArray38[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[118]];
                                    Inventory.getFirst((String[])stringArray37).useOn(TileObjects.getNearest((String[])stringArray38));
                                    Time.sleepTicks((int)llIllllIIl[2]);

                                }
                                String[] stringArray39 = new String[llIllllIIl[1]];
                                stringArray39[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[119]];
                                if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray39) ? 1 : 0) && aL.lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                    String[] stringArray40 = new String[llIllllIIl[1]];
                                    stringArray40[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[120]];
                                    String[] stringArray41 = new String[llIllllIIl[1]];
                                    stringArray41[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[13]];
                                    Inventory.getFirst((String[])stringArray40).useOn(TileObjects.getNearest((String[])stringArray41));
                                    Time.sleepTicks((int)llIllllIIl[2]);

                                }
                                String[] stringArray42 = new String[llIllllIIl[1]];
                                stringArray42[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[121]];
                                TileObjects.getNearest((String[])stringArray42).interact(llIlllIlII[llIllllIIl[122]]);
                                Time.sleepTicks((int)llIllllIIl[2]);

                            }
                            String[] stringArray = new String[llIllllIIl[1]];
                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[123]];
                            g.a(stringArray);
                        }
                        String[] stringArray = new String[llIllllIIl[1]];
                        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[124]];
                        if (aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray))) {
                            String[] stringArray43 = new String[llIllllIIl[1]];
                            stringArray43[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[125]];
                            var2 = TileObjects.getAll((String[])stringArray43);
                            var3 = var2.stream().filter(tileObject -> {
                                String[] stringArray = new String[llIllllIIl[1]];
                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[262]];
                                return tileObject.hasAction(stringArray);
                            }).collect(Collectors.toList());
                            var5 = null;
                            var4 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                String[] stringArray = new String[llIllllIIl[1]];
                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[260]];
                                if (aL.lIlllIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0) && aL.lIlllIlIlllII(tileObject.getName().equals(llIlllIlII[llIllllIIl[261]]) ? 1 : 0)) {
                                    n2 = llIllllIIl[1];

                                    if (-1 > (0x6D ^ 0x69)) {
                                        return false;
                                    }
                                } else {
                                    n2 = llIllllIIl[0];
                                }
                                return n2 != 0;
                            });
                            if (aL.lIlllIllIIIIl(var4)) {
                                if (aL.lIlllIllIIlII(Players.getLocal().getWorldX(), var4.getWorldX())) {
                                    var5 = TileObjects.getNearest(tileObject -> {
                                        String[] stringArray = new String[llIllllIIl[1]];
                                        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[259]];
                                        return tileObject.hasAction(stringArray);
                                    });
                                    if (aL.lIlllIllIIIIl(var5)) {
                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[126]];
                                        var5.interact(llIlllIlII[llIllllIIl[127]]);
                                        Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[14]));

                                        if (2 <= -1) {
                                            return;
                                        }
                                    }
                                } else {
                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[128]];
                                    var4.interact(llIlllIlII[llIllllIIl[129]]);
                                    Time.sleepTicks((int)llIllllIIl[11]);

                                }
                            }
                        }
                        String[] stringArray44 = new String[llIllllIIl[1]];
                        stringArray44[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[130]];
                        if (!aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray44))) break block116;
                        nR = null;
                        String[] stringArray45 = new String[llIllllIIl[1]];
                        stringArray45[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[131]];
                        var2 = TileObjects.getAll((String[])stringArray45);
                        var3 = var2.stream().filter(tileObject -> {
                            String[] stringArray = new String[llIllllIIl[1]];
                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[258]];
                            return tileObject.hasAction(stringArray);
                        }).collect(Collectors.toList());
                        if (!aL.lIlllIlIllllI(var3.isEmpty() ? 1 : 0)) break block116;
                        if (!aL.lIlllIlIllllI(Reachable.isInteractable((Locatable)((Locatable)var3.get(llIllllIIl[0]))) ? 1 : 0)) break block117;
                        String[] stringArray46 = new String[llIllllIIl[1]];
                        stringArray46[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[132]];
                        if (!aL.lIlllIlIlllII(Inventory.contains((String[])stringArray46) ? 1 : 0)) break block118;
                        String[] stringArray47 = new String[llIllllIIl[1]];
                        stringArray47[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[133]];
                        if (!aL.lIlllIlIlllIl(Inventory.getAll((String[])stringArray47).size(), llIllllIIl[10])) break block119;
                    }
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[134]];
                    String[] stringArray = new String[llIllllIIl[1]];
                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[135]];
                    var5 = TileObjects.getAll((String[])stringArray);
                    var4 = var5.stream().filter(tileObject -> {
                        String[] stringArray = new String[llIllllIIl[1]];
                        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[257]];
                        return tileObject.hasAction(stringArray);
                    }).collect(Collectors.toList());
                    if (aL.lIlllIlIllllI(var4.isEmpty() ? 1 : 0)) {
                        ((TileObject)var4.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[136]]);
                        Time.sleepTicks((int)llIllllIIl[2]);

                    }
                }
                String[] stringArray = new String[llIllllIIl[1]];
                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[137]];
                if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray48 = new String[llIllllIIl[1]];
                    stringArray48[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[138]];
                    if (aL.lIlllIllIIlII(Inventory.getAll((String[])stringArray48).size(), llIllllIIl[10])) {
                        String[] stringArray49 = new String[llIllllIIl[1]];
                        stringArray49[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[139]];
                        String[] stringArray50 = new String[llIllllIIl[1]];
                        stringArray50[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[140]];
                        Inventory.getFirst((String[])stringArray49).useOn((Item)Inventory.getAll((String[])stringArray50).get(llIllllIIl[1]));
                    }
                }
                String[] stringArray51 = new String[llIllllIIl[1]];
                stringArray51[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[141]];
                if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                    String[] stringArray52 = new String[llIllllIIl[1]];
                    stringArray52[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[142]];
                    int[] nArray = new int[llIllllIIl[1]];
                    nArray[aL.llIllllIIl[0]] = llIllllIIl[143];
                    Inventory.getFirst((String[])stringArray52).useOn(TileObjects.getNearest((int[])nArray));
                    Time.sleepTicks((int)llIllllIIl[15]);

                }
                String[] stringArray53 = new String[llIllllIIl[1]];
                stringArray53[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[144]];
                var5 = TileObjects.getAll((String[])stringArray53);
                var4 = var5.stream().filter(tileObject -> {
                    String[] stringArray = new String[llIllllIIl[1]];
                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[256]];
                    return tileObject.hasAction(stringArray);
                }).collect(Collectors.toList());
                if (aL.lIlllIlIllllI(var4.isEmpty() ? 1 : 0)) {
                    ((TileObject)var4.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[145]]);
                    Time.sleepTicks((int)llIllllIIl[15]);

                }
            }
            if (aL.lIlllIlIlllII(Reachable.isInteractable((Locatable)((Locatable)var3.get(llIllllIIl[0]))) ? 1 : 0)) {
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[146]];
                ((TileObject)var3.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[147]]);
                Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[14]));

            }
        }
        String[] stringArray = new String[llIllllIIl[1]];
        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[148]];
        if (aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray))) {
            block102: {
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[149]];
                System.out.println(llIlllIlII[llIllllIIl[150]]);
                var2 = new ArrayList();
                long var3 = System.currentTimeMillis();
                do {
                    WorldPoint var7;
                    Object var8;
                    List<WorldPoint> var9;
                    int var10;
                    int var11;
                    List<WorldPoint> var12;
                    TileObject var13;
                    String[] stringArray54 = new String[llIllllIIl[1]];
                    stringArray54[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[151]];
                    if (!aL.lIlllIlIllllI(TileObjects.getAll((String[])stringArray54).isEmpty() ? 1 : 0) || !aL.lIlllIllIlIIl(Game.getState(), GameState.LOGGED_IN) || !aL.lIlllIlIllllI(AccBuilderSotf.d ? 1 : 0)) break block102;
                    int var4 = llIllllIIl[0];
                    if (aL.lIlllIlIlllII(var2.isEmpty() ? 1 : 0)) {
                        Time.sleepTicks((int)llIllllIIl[15]);

                        System.out.println(llIlllIlII[llIllllIIl[152]]);
                        var2 = TileObjects.getAll(tileObject -> {
                            boolean bl;
                            if (aL.lIlllIllIlIII(tileObject.getId(), llIllllIIl[255])) {
                                bl = llIllllIIl[1];

                                if (((0x5A ^ 0x5F ^ (0xE8 ^ 0xC5) & ~(0xF ^ 0x22)) & (0x67 ^ 0x4E ^ (0xEC ^ 0xC0) ^ -1)) != 0) {
                                    return ((0x46 ^ 0x7D ^ (0xBA ^ 0x91)) & (164 + 38 - 195 + 183 ^ 104 + 128 - 220 + 162 ^ -1)) != 0;
                                }
                            } else {
                                bl = llIllllIIl[0];
                            }
                            return bl;
                        });
                        System.out.println(llIlllIlII[llIllllIIl[153]]);
                        String[] stringArray55 = new String[llIllllIIl[1]];
                        stringArray55[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[154]];
                        nR = TileObjects.getNearest((String[])stringArray55).getWorldLocation();
                        var13 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (aL.lIlllIlIlllII(tileObject.getName().contains(llIlllIlII[llIllllIIl[253]]) ? 1 : 0)) {
                                String[] stringArray = new String[llIllllIIl[1]];
                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[254]];
                                if (aL.lIlllIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llIllllIIl[1];

                                    if (((0xF1 ^ 0xC6) & ~(0x1E ^ 0x29)) == 0) return n2 != 0;
                                    return false;
                                }
                            }
                            n2 = llIllllIIl[0];
                            return n2 != 0;
                        });
                        if (aL.lIlllIllIIIIl(var13) && aL.lIlllIlIlllll(var13.getWorldLocation().getY(), nR.getY() + llIllllIIl[17])) {
                            var4 = llIllllIIl[1];
                        }
                    }
                    System.out.println("Version: " + (var4 != 0));
                    if (aL.lIlllIlIllllI(var4)) {
                        if (aL.lIlllIllIIIIl(nR) && aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[17])) {
                            var13 = var2.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
                            WorldPoint[] worldPointArray = new WorldPoint[llIllllIIl[18]];
                            worldPointArray[aL.llIllllIIl[0]] = new WorldPoint(nR.getX() - llIllllIIl[14], nR.getY() - llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[1]] = new WorldPoint(nR.getX() - llIllllIIl[11], nR.getY() - llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[2]] = new WorldPoint(nR.getX() - llIllllIIl[10], nR.getY() - llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[10]] = new WorldPoint(nR.getX() - llIllllIIl[2], nR.getY() - llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[11]] = new WorldPoint(nR.getX() - llIllllIIl[1], nR.getY() - llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[14]] = new WorldPoint(nR.getX(), nR.getY() - llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[15]] = new WorldPoint(nR.getX() + llIllllIIl[1], nR.getY() - llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[3]] = new WorldPoint(nR.getX() + llIllllIIl[2], nR.getY() - llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[16]] = new WorldPoint(nR.getX() + llIllllIIl[10], nR.getY() - llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[17]] = new WorldPoint(nR.getX() + llIllllIIl[11], nR.getY() - llIllllIIl[11], nR.getPlane());
                            var12 = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + var12.size());
                            var11 = llIllllIIl[0];
                            var10 = llIllllIIl[0];
                            while (aL.lIlllIlIlllIl(var10, var12.size())) {
                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[155]];
                                var9 = aL.a(var12.get(var10), nR.getY() - llIllllIIl[17], (List<WorldPoint>)var13);
                                if (aL.lIlllIlIllllI(var9.isEmpty() ? 1 : 0)) {
                                    System.out.println(llIlllIlII[llIllllIIl[156]]);
                                    var8 = var9.iterator();
                                    while (aL.lIlllIlIlllII(var8.hasNext() ? 1 : 0)) {
                                        var7 = var8.next();
                                        System.out.println("(" + var7.getX() + ", " + var7.getY() + ", " + var7.getPlane() + ")");

                                        if ((0x97 ^ 0xB6 ^ (0x7A ^ 0x5F)) != 3) continue;
                                        return;
                                    }
                                    var11 = llIllllIIl[1];
                                    while (aL.lIlllIlIlllII(var11) && aL.lIlllIlIllllI(var9.isEmpty() ? 1 : 0)) {
                                        if (aL.lIlllIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var9.get(llIllllIIl[0])) ? 1 : 0)) {
                                            if (aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[11])) {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[157]];
                                                e.c(var9.get(llIllllIIl[0]));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[11])) {
                                                        bl = llIllllIIl[1];

                                                        if (1 <= 0) {
                                                            return false;
                                                        }
                                                    } else {
                                                        bl = llIllllIIl[0];
                                                    }
                                                    return bl;
                                                }, (int)e.c(llIllllIIl[158], llIllllIIl[159]));

                                                Time.sleepTicks((int)llIllllIIl[2]);

                                                if (2 < -1) {
                                                    return;
                                                }
                                            } else {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[160]];
                                                String[] stringArray56 = new String[llIllllIIl[1]];
                                                stringArray56[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[161]];
                                                var8 = TileObjects.getAt((WorldPoint)var9.get(llIllllIIl[0]), (String[])stringArray56);
                                                if (aL.lIlllIlIllllI(var8.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + var8.size());
                                                    ((TileObject)var8.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[162]]);
                                                    Time.sleepTicks((int)llIllllIIl[2]);

                                                }
                                                if (aL.lIlllIlIlllII(var8.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(var9.get(llIllllIIl[0])));
                                                    Game.logout();
                                                    Time.sleepTicks((int)llIllllIIl[2]);

                                                    if (-(0x78 ^ 0x60 ^ (7 ^ 0x1A)) < 0) break;
                                                    return;
                                                }
                                            }
                                        }
                                        if (aL.lIlllIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var9.get(llIllllIIl[0])) ? 1 : 0)) {
                                            System.out.println(llIlllIlII[llIllllIIl[163]]);
                                            var9.remove(llIllllIIl[0]);

                                            Time.sleepTicks((int)llIllllIIl[2]);

                                        }
                                        Time.sleepTicks((int)llIllllIIl[1]);

                                        return;
                                    }
                                    if (!aL.lIlllIllIIlll(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println(llIlllIlII[llIllllIIl[164]]);

                                    if (2 == 2) break;
                                    return;
                                }
                                ++var10;

                                if (((6 ^ 0x38) & ~(0x88 ^ 0xB6)) == 0) continue;
                                return;
                            }
                            if (aL.lIlllIlIllllI(var11)) {
                                System.out.println(llIlllIlII[llIllllIIl[165]]);
                            }
                            System.out.println(var2.size());
                        }
                        if (aL.lIlllIllIIIIl(nR) && aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[17])) {
                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[166]];
                            String[] stringArray57 = new String[llIllllIIl[1]];
                            stringArray57[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[167]];
                            TileObjects.getNearest((String[])stringArray57).interact(llIlllIlII[llIllllIIl[168]]);
                            Time.sleepTicks((int)llIllllIIl[11]);

                        }
                    }
                    if (aL.lIlllIlIlllII(var4)) {
                        if (aL.lIlllIllIIIIl(nR) && aL.lIlllIlIlllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[17])) {
                            var13 = var2.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
                            WorldPoint[] worldPointArray = new WorldPoint[llIllllIIl[18]];
                            worldPointArray[aL.llIllllIIl[0]] = new WorldPoint(nR.getX() - llIllllIIl[14], nR.getY() + llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[1]] = new WorldPoint(nR.getX() - llIllllIIl[11], nR.getY() + llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[2]] = new WorldPoint(nR.getX() - llIllllIIl[10], nR.getY() + llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[10]] = new WorldPoint(nR.getX() - llIllllIIl[2], nR.getY() + llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[11]] = new WorldPoint(nR.getX() - llIllllIIl[1], nR.getY() + llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[14]] = new WorldPoint(nR.getX(), nR.getY() + llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[15]] = new WorldPoint(nR.getX() + llIllllIIl[1], nR.getY() + llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[3]] = new WorldPoint(nR.getX() + llIllllIIl[2], nR.getY() + llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[16]] = new WorldPoint(nR.getX() + llIllllIIl[10], nR.getY() + llIllllIIl[11], nR.getPlane());
                            worldPointArray[aL.llIllllIIl[17]] = new WorldPoint(nR.getX() + llIllllIIl[11], nR.getY() + llIllllIIl[11], nR.getPlane());
                            var12 = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + var12.size());
                            var11 = llIllllIIl[0];
                            var10 = llIllllIIl[0];
                            while (aL.lIlllIlIlllIl(var10, var12.size())) {
                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[169]];
                                var9 = aL.a(var12.get(var10), nR.getY() + llIllllIIl[17], (List<WorldPoint>)var13);
                                if (aL.lIlllIlIllllI(var9.isEmpty() ? 1 : 0)) {
                                    System.out.println(llIlllIlII[llIllllIIl[170]]);
                                    var8 = var9.iterator();
                                    while (aL.lIlllIlIlllII(var8.hasNext() ? 1 : 0)) {
                                        var7 = var8.next();
                                        System.out.println("(" + var7.getX() + ", " + var7.getY() + ", " + var7.getPlane() + ")");

                                        return;
                                    }
                                    var11 = llIllllIIl[1];
                                    while (aL.lIlllIlIlllII(var11) && aL.lIlllIlIllllI(var9.isEmpty() ? 1 : 0)) {
                                        if (aL.lIlllIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var9.get(llIllllIIl[0])) ? 1 : 0)) {
                                            if (aL.lIlllIlIlllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[11])) {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[171]];
                                                e.c(var9.get(llIllllIIl[0]));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (aL.lIlllIlIlllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[11])) {
                                                        bl = llIllllIIl[1];

                                                        if (3 < 0) {
                                                            return false;
                                                        }
                                                    } else {
                                                        bl = llIllllIIl[0];
                                                    }
                                                    return bl;
                                                }, (int)e.c(llIllllIIl[158], llIllllIIl[159]));

                                                Time.sleepTicks((int)llIllllIIl[2]);

                                                if (3 < 1) {
                                                    return;
                                                }
                                            } else {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[172]];
                                                String[] stringArray58 = new String[llIllllIIl[1]];
                                                stringArray58[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[173]];
                                                var8 = TileObjects.getAt((WorldPoint)var9.get(llIllllIIl[0]), (String[])stringArray58);
                                                if (aL.lIlllIlIllllI(var8.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + var8.size());
                                                    ((TileObject)var8.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[174]]);
                                                    Time.sleepTicks((int)llIllllIIl[2]);

                                                }
                                                if (aL.lIlllIlIlllII(var8.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(var9.get(llIllllIIl[0])));
                                                    Game.logout();
                                                    Time.sleepTicks((int)llIllllIIl[2]);

                                                    if ((143 + 13 - 42 + 84 ^ 24 + 166 - 111 + 115) >= 0) break;
                                                    return;
                                                }
                                                Time.sleepTicks((int)llIllllIIl[2]);

                                            }
                                        }
                                        if (aL.lIlllIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var9.get(llIllllIIl[0])) ? 1 : 0)) {
                                            System.out.println(llIlllIlII[llIllllIIl[175]]);
                                            var9.remove(llIllllIIl[0]);

                                            Time.sleepTicks((int)llIllllIIl[2]);

                                        }
                                        System.out.println("Path size lefT: " + var9.size());
                                        Time.sleepTicks((int)llIllllIIl[1]);

                                        if (-(0x79 ^ 0x5D ^ (0x9B ^ 0xBB)) < 0) continue;
                                        return;
                                    }
                                    if (!aL.lIlllIllIIlll(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println(llIlllIlII[llIllllIIl[176]]);

                                    if (((0x5D ^ 1) & ~(0xCD ^ 0x91)) < 1) break;
                                    return;
                                }
                                ++var10;

                                if ((0xAB ^ 0xB8 ^ (0x52 ^ 0x45)) >= 0) continue;
                                return;
                            }
                            if (aL.lIlllIlIllllI(var11)) {
                                System.out.println(llIlllIlII[llIllllIIl[177]]);
                            }
                            System.out.println(var2.size());
                        }
                        if (aL.lIlllIllIIIIl(nR) && aL.lIlllIllIIlII(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[17])) {
                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[178]];
                            String[] stringArray59 = new String[llIllllIIl[1]];
                            stringArray59[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[179]];
                            TileObjects.getNearest((String[])stringArray59).interact(llIlllIlII[llIllllIIl[180]]);
                            Time.sleepTicks((int)llIllllIIl[11]);

                        }
                    }
                    if (aL.lIlllIllIIIll(aL.lIlllIllIIlIl(System.currentTimeMillis(), var3 + 45000L))) {
                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[181]];
                        Game.logout();
                        var3 = System.currentTimeMillis();
                    }

                } while (-3 < 0);
                return;
            }
            int[] nArray = new int[llIllllIIl[1]];
            nArray[aL.llIllllIIl[0]] = llIllllIIl[9];
            if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));

                mV = llIllllIIl[0];
            }
        }
        if (aL.lIlllIlIllllI(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIlIllllI(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIllIlIlI(aL.lIlllIllIIllI(e.w(), 25.0))) {
            int[] nArray = new int[llIllllIIl[1]];
            nArray[aL.llIllllIIl[0]] = llIllllIIl[9];
            if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));

                mV = llIllllIIl[0];
            }
        }
    }

    private static int d(int n2, int n3) {
        return Math.abs(n2 - n3);
    }

    public static void Q() {
        d var14;
        block19: {
            block18: {
                block17: {
                    block16: {
                        int[] nArray = new int[llIllllIIl[1]];
                        nArray[aL.llIllllIIl[0]] = llIllllIIl[8];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(llIllllIIl[8], llIllllIIl[1], e.c(llIllllIIl[228], llIllllIIl[229]));
                            bv.add(d2);

                        }
                        int[] nArray2 = new int[llIllllIIl[1]];
                        nArray2[aL.llIllllIIl[0]] = llIllllIIl[230];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var14 = new DHelper(llIllllIIl[230], llIllllIIl[2], llIllllIIl[231]);
                            bv.add(var14);

                        }
                        int[] nArray3 = new int[llIllllIIl[1]];
                        nArray3[aL.llIllllIIl[0]] = llIllllIIl[232];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var14 = new DHelper(llIllllIIl[232], llIllllIIl[18], llIllllIIl[233]);
                            bv.add(var14);

                        }
                        int[] nArray4 = new int[llIllllIIl[1]];
                        nArray4[aL.llIllllIIl[0]] = llIllllIIl[22];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var14 = new DHelper(llIllllIIl[22], llIllllIIl[1], e.c(llIllllIIl[234], llIllllIIl[235]));
                            bv.add(var14);

                        }
                        int[] nArray5 = new int[llIllllIIl[1]];
                        nArray5[aL.llIllllIIl[0]] = llIllllIIl[23];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var14 = new DHelper(llIllllIIl[23], llIllllIIl[1], e.c(llIllllIIl[234], llIllllIIl[235]));
                            bv.add(var14);

                        }
                        int[] nArray6 = new int[llIllllIIl[1]];
                        nArray6[aL.llIllllIIl[0]] = llIllllIIl[185];
                        if (!aL.lIlllIlIlllII(Bank.contains((int[])nArray6) ? 1 : 0)) break block16;
                        int[] nArray7 = new int[llIllllIIl[1]];
                        nArray7[aL.llIllllIIl[0]] = llIllllIIl[185];
                        if (!aL.lIlllIlIlllII(Bank.contains((int[])nArray7) ? 1 : 0)) break block17;
                        int[] nArray8 = new int[llIllllIIl[1]];
                        nArray8[aL.llIllllIIl[0]] = llIllllIIl[185];
                        if (!aL.lIlllIlIlllIl(Bank.getFirst((int[])nArray8).getQuantity(), llIllllIIl[36])) break block17;
                    }
                    var14 = new DHelper(llIllllIIl[185], llIllllIIl[236], e.c(llIllllIIl[237], llIllllIIl[238]));
                    bv.add(var14);

                }
                int[] nArray = new int[llIllllIIl[1]];
                nArray[aL.llIllllIIl[0]] = llIllllIIl[9];
                if (!aL.lIlllIlIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block18;
                int[] nArray9 = new int[llIllllIIl[1]];
                nArray9[aL.llIllllIIl[0]] = llIllllIIl[9];
                if (!aL.lIlllIlIlllII(Bank.contains((int[])nArray9) ? 1 : 0)) break block19;
                int[] nArray10 = new int[llIllllIIl[1]];
                nArray10[aL.llIllllIIl[0]] = llIllllIIl[9];
                if (!aL.lIlllIlIlllIl(Bank.getFirst((int[])nArray10).getQuantity(), llIllllIIl[4])) break block19;
            }
            var14 = new DHelper(llIllllIIl[9], llIllllIIl[4], e.c(llIllllIIl[159], llIllllIIl[239]));
            bv.add(var14);

        }
        int[] nArray = new int[llIllllIIl[1]];
        nArray[aL.llIllllIIl[0]] = llIllllIIl[240];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var14 = new DHelper(llIllllIIl[240], llIllllIIl[18], llIllllIIl[241]);
            bv.add(var14);

        }
        int[] nArray11 = new int[llIllllIIl[1]];
        nArray11[aL.llIllllIIl[0]] = llIllllIIl[242];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var14 = new DHelper(mU, llIllllIIl[59], llIllllIIl[243]);
            bv.add(var14);

        }
        int[] nArray12 = new int[llIllllIIl[1]];
        nArray12[aL.llIllllIIl[0]] = llIllllIIl[244];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
            var14 = new DHelper(llIllllIIl[244], llIllllIIl[1], llIllllIIl[245]);
            bv.add(var14);

        }
        int[] nArray13 = new int[llIllllIIl[1]];
        nArray13[aL.llIllllIIl[0]] = llIllllIIl[7];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var14 = new DHelper(llIllllIIl[7], llIllllIIl[1], e.c(llIllllIIl[246], llIllllIIl[247]));
            bv.add(var14);

        }
        int[] nArray14 = new int[llIllllIIl[1]];
        nArray14[aL.llIllllIIl[0]] = llIllllIIl[248];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
            var14 = new DHelper(llIllllIIl[248], llIllllIIl[36], j.cf);
            bv.add(var14);

        }
    }

    private static boolean a(aM aM2, PriorityQueue<aM> priorityQueue) {
        return priorityQueue.stream().anyMatch(aM3 -> aM3.nT.equals((Object)aM2.nT));
    }

    private static boolean lIlllIllIIIll(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static List<WorldPoint> a(aM aM2) {
        void var1_1;
        aM var15;
        ArrayList<WorldPoint> var16 = new ArrayList<WorldPoint>();
        while (aL.lIlllIllIIIIl(var15)) {
            var16.add(var15.nT);

            var15 = var15.pV;

            if (-1 < ((0x7A ^ 0x3A) & ~(0x65 ^ 0x25))) continue;
            return null;
        }
        Collections.reverse(var1_1);
        return var1_1;
    }

    private static int lIlllIllIIlIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    @Override
    public String ag() {
        return llIlllIlII[llIllllIIl[249]];
    }

    static {
        aL.lIlllIlIllIll();
        aL.lIlllIlIlIlll();
        bv = new ArrayList<d>();
        nH = new WorldArea(llIllllIIl[275], llIllllIIl[276], llIllllIIl[32], llIllllIIl[53], llIllllIIl[0]);
        nI = new WorldPoint(llIllllIIl[277], llIllllIIl[278], llIllllIIl[0]);
        mT = llIllllIIl[279];
        mU = llIllllIIl[242];
        nJ = llIllllIIl[185];
        nK = llIllllIIl[52];
        nL = new WorldArea(llIllllIIl[280], llIllllIIl[281], llIllllIIl[132], llIllllIIl[93], llIllllIIl[0]);
        nM = new WorldArea(llIllllIIl[282], llIllllIIl[283], llIllllIIl[72], llIllllIIl[71], llIllllIIl[0]);
        nN = llIlllIlII[llIllllIIl[284]];
        nO = new WorldArea(llIllllIIl[285], llIllllIIl[286], llIllllIIl[64], llIllllIIl[69], llIllllIIl[0]);
        nP = new WorldPoint(llIllllIIl[287], llIllllIIl[288], llIllllIIl[0]);
        nQ = new WorldPoint(llIllllIIl[289], llIllllIIl[290], llIllllIIl[0]);
        cG = llIllllIIl[0];
        nR = null;
    }

    private static boolean lIlllIllIlIlI(int n2) {
        return n2 <= 0;
    }

    private static void gd() {
        block25: {
            block31: {
                block27: {
                    block30: {
                        block29: {
                            block28: {
                                block26: {
                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[182]];
                                    if (aL.lIlllIlIllllI(Bank.isOpen() ? 1 : 0)) {
                                        TileObject var17;
                                        if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllllIIl[3])) {
                                            a.a();
                                            Time.sleepTicks((int)llIllllIIl[10]);

                                        }
                                        if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nQ), llIllllIIl[28]) && aL.lIlllIllIIIIl(var17 = TileObjects.getNearest(tileObject -> {
                                            int n2;
                                            if (aL.lIlllIlIlllII(tileObject.getName().equalsIgnoreCase(llIlllIlII[llIllllIIl[251]]) ? 1 : 0)) {
                                                String[] stringArray = new String[llIllllIIl[1]];
                                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[252]];
                                                if (aL.lIlllIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                                    n2 = llIllllIIl[1];

                                                    if (null == null) return n2 != 0;
                                                    return false;
                                                }
                                            }
                                            n2 = llIllllIIl[0];
                                            return n2 != 0;
                                        }))) {
                                            var17.interact(llIlllIlII[llIllllIIl[183]]);
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIllllIIl[158]);

                                        }
                                        if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[24])) {
                                            int[] nArray = new int[llIllllIIl[1]];
                                            nArray[aL.llIllllIIl[0]] = llIllllIIl[19];
                                            TileObjects.getNearest((int[])nArray).interact(llIlllIlII[llIllllIIl[184]]);
                                            Time.sleepTicks((int)llIllllIIl[2]);

                                        }
                                    }
                                    if (!aL.lIlllIlIlllII(Bank.isOpen() ? 1 : 0)) break block25;
                                    if (aL.lIlllIllIIIll(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIllllIIl[11]);

                                    }
                                    if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllllIIl[3]) && aL.lIlllIllIIIll(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIllllIIl[2]);

                                    }
                                    int[] nArray = new int[llIllllIIl[1]];
                                    nArray[aL.llIllllIIl[0]] = llIllllIIl[7];
                                    if (!aL.lIlllIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                    int[] nArray2 = new int[llIllllIIl[1]];
                                    nArray2[aL.llIllllIIl[0]] = llIllllIIl[7];
                                    if (!aL.lIlllIlIllllI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block26;
                                    int[] nArray3 = new int[llIllllIIl[1]];
                                    nArray3[aL.llIllllIIl[0]] = llIllllIIl[7];
                                    if (!aL.lIlllIlIlllII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block27;
                                }
                                int[] nArray = new int[llIllllIIl[1]];
                                nArray[aL.llIllllIIl[0]] = llIllllIIl[8];
                                if (!aL.lIlllIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray4 = new int[llIllllIIl[1]];
                                nArray4[aL.llIllllIIl[0]] = llIllllIIl[8];
                                if (!aL.lIlllIlIllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) break block28;
                                int[] nArray5 = new int[llIllllIIl[1]];
                                nArray5[aL.llIllllIIl[0]] = llIllllIIl[8];
                                if (!aL.lIlllIlIlllII(Equipment.contains((int[])nArray5) ? 1 : 0)) break block27;
                            }
                            int[] nArray = new int[llIllllIIl[1]];
                            nArray[aL.llIllllIIl[0]] = llIllllIIl[22];
                            if (!aL.lIlllIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                            int[] nArray6 = new int[llIllllIIl[1]];
                            nArray6[aL.llIllllIIl[0]] = llIllllIIl[22];
                            if (!aL.lIlllIlIlllII(Inventory.contains((int[])nArray6) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llIllllIIl[1]];
                        nArray[aL.llIllllIIl[0]] = llIllllIIl[23];
                        if (!aL.lIlllIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                        int[] nArray7 = new int[llIllllIIl[1]];
                        nArray7[aL.llIllllIIl[0]] = llIllllIIl[23];
                        if (!aL.lIlllIlIlllII(Inventory.contains((int[])nArray7) ? 1 : 0)) break block27;
                    }
                    int[] nArray = new int[llIllllIIl[1]];
                    nArray[aL.llIllllIIl[0]] = llIllllIIl[185];
                    if (!aL.lIlllIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block31;
                }
                System.out.println(llIlllIlII[llIllllIIl[186]]);
                aL.Q();
                bt = llIllllIIl[1];
                return;
            }
            int[] nArray = new int[llIllllIIl[1]];
            nArray[aL.llIllllIIl[0]] = llIllllIIl[5];
            if (aL.lIlllIlIllllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray8 = new int[llIllllIIl[1]];
                nArray8[aL.llIllllIIl[0]] = llIllllIIl[5];
                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                    a.a(llIllllIIl[5], llIllllIIl[1]);
                    Time.sleepTicks((int)llIllllIIl[1]);

                }
            }
            int[] nArray9 = new int[llIllllIIl[1]];
            nArray9[aL.llIllllIIl[0]] = llIllllIIl[6];
            if (aL.lIlllIlIllllI(Equipment.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[llIllllIIl[1]];
                nArray10[aL.llIllllIIl[0]] = llIllllIIl[6];
                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                    a.a(llIllllIIl[6], llIllllIIl[1]);
                    Time.sleepTicks((int)llIllllIIl[1]);

                }
            }
            if (aL.lIlllIlIllllI(Equipment.contains((int[])f.bk) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                a.b(f.bk, llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);

            }
            if (aL.lIlllIlIllllI(Equipment.contains((int[])f.aW) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                a.b(f.aW, llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);

            }
            int[] nArray11 = new int[llIllllIIl[1]];
            nArray11[aL.llIllllIIl[0]] = llIllllIIl[7];
            if (aL.lIlllIlIllllI(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[llIllllIIl[1]];
                nArray12[aL.llIllllIIl[0]] = llIllllIIl[7];
                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                    a.a(llIllllIIl[7], llIllllIIl[1]);
                    Time.sleepTicks((int)llIllllIIl[1]);

                }
            }
            int[] nArray13 = new int[llIllllIIl[1]];
            nArray13[aL.llIllllIIl[0]] = llIllllIIl[8];
            if (aL.lIlllIlIllllI(Equipment.contains((int[])nArray13) ? 1 : 0)) {
                int[] nArray14 = new int[llIllllIIl[1]];
                nArray14[aL.llIllllIIl[0]] = llIllllIIl[8];
                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                    a.a(llIllllIIl[8], llIllllIIl[1]);
                    Time.sleepTicks((int)llIllllIIl[1]);

                }
            }
            int[] nArray15 = new int[llIllllIIl[1]];
            nArray15[aL.llIllllIIl[0]] = llIllllIIl[21];
            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                a.a(llIllllIIl[21], llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);

            }
            int[] nArray16 = new int[llIllllIIl[1]];
            nArray16[aL.llIllllIIl[0]] = llIllllIIl[22];
            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                a.a(llIllllIIl[22], llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);

            }
            int[] nArray17 = new int[llIllllIIl[1]];
            nArray17[aL.llIllllIIl[0]] = llIllllIIl[23];
            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                a.a(llIllllIIl[23], llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);

            }
            if (aL.lIlllIlIlllIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                int[] nArray18 = new int[llIllllIIl[1]];
                nArray18[aL.llIllllIIl[0]] = nJ;
                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                    a.a(nJ, llIllllIIl[10]);
                    Time.sleepTicks((int)llIllllIIl[1]);

                }
            }
            int[] nArray19 = new int[llIllllIIl[1]];
            nArray19[aL.llIllllIIl[0]] = llIllllIIl[9];
            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                Bank.withdrawAll((int)llIllllIIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                Time.sleepTicks((int)llIllllIIl[1]);

            }
        }
    }

    private static boolean lIlllIlIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIlIlllll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ae() {
        return llIllllIIl[0];
    }

    private static boolean lIlllIlIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIllIIIIl(Object object) {
        return object != null;
    }

    public static void gb() {
        block65: {
            block66: {
                block67: {
                    if (aL.lIlllIlIlllII(bt ? 1 : 0)) {
                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[0]];
                        b.a(bv);
                        if (aL.lIlllIlIlllIl(bv.size(), llIllllIIl[1])) {
                            System.out.println(llIlllIlII[llIllllIIl[1]]);
                            bt = llIllllIIl[0];
                        }
                    }
                    if (!aL.lIlllIlIllllI(bt ? 1 : 0)) break block65;
                    if (aL.lIlllIlIlllII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    aL.t(nN);
                    Predicate<Item> var18 = item -> item.getName().toLowerCase().contains(llIlllIlII[llIllllIIl[274]]);
                    if (aL.lIlllIlIlllII(Inventory.contains(var18) ? 1 : 0)) {
                        Inventory.getFirst(var18).interact(llIlllIlII[llIllllIIl[2]]);
                        Time.sleepTicks((int)llIllllIIl[1]);

                    }
                    if (aL.lIlllIlIllllI(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIlIllllI(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIlIllllI(aL.an() ? 1 : 0) && aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllllIIl[3])) {
                        Movement.walkTo((WorldPoint)b.I);

                        Time.sleepTicks((int)llIllllIIl[1]);

                    }
                    if (aL.lIlllIlIllllI(aL.an() ? 1 : 0) && aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllllIIl[3])) {
                        aL.gd();
                    }
                    if (aL.lIlllIlIlllII(aL.an() ? 1 : 0) && aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllllIIl[4])) {
                        aL.l(llIllllIIl[5]);
                        aL.l(llIllllIIl[6]);
                        aL.l(llIllllIIl[7]);
                        aL.l(llIllllIIl[8]);
                        aL.b(f.bk);
                        aL.b(f.aW);
                        int[] nArray = new int[llIllllIIl[1]];
                        nArray[aL.llIllllIIl[0]] = llIllllIIl[9];
                        if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));

                            int[] nArray2 = new int[llIllllIIl[1]];
                            nArray2[aL.llIllllIIl[0]] = llIllllIIl[9];
                            Inventory.getFirst((int[])nArray2).interact(llIlllIlII[llIllllIIl[10]]);
                            Time.sleepUntil(() -> nL.contains(Players.getLocal().getWorldLocation()), (int)llIllllIIl[12]);

                            mV = llIllllIIl[0];
                        }
                    }
                    if (aL.lIlllIlIllllI(aL.an() ? 1 : 0) && (!aL.lIlllIlIllllI(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nQ), llIllllIIl[13]))) {
                        if (aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[14])) {
                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[11]];
                            String[] stringArray = new String[llIllllIIl[1]];
                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[14]];
                            if (aL.lIlllIllIIIIl(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray2 = new String[llIllllIIl[1]];
                                stringArray2[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[15]];
                                TileObjects.getNearest((String[])stringArray2).interact(llIlllIlII[llIllllIIl[3]]);
                                Time.sleepTicks((int)llIllllIIl[11]);

                            }
                            String[] stringArray3 = new String[llIllllIIl[1]];
                            stringArray3[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[16]];
                            if (aL.lIlllIllIIIlI(NPCs.getNearest((String[])stringArray3)) && aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[14])) {
                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[17]];
                                Movement.walkTo((WorldPoint)D.fa);

                                Time.sleepTicks((int)llIllllIIl[1]);

                            }
                        }
                        if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[14])) {
                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[18]];
                            if (aL.lIlllIlIllllI(Bank.isOpen() ? 1 : 0)) {
                                int[] nArray = new int[llIllllIIl[1]];
                                nArray[aL.llIllllIIl[0]] = llIllllIIl[19];
                                TileObjects.getNearest((int[])nArray).interact(llIlllIlII[llIllllIIl[20]]);
                                Time.sleepTicks((int)llIllllIIl[2]);

                            }
                            if (aL.lIlllIlIlllII(Bank.isOpen() ? 1 : 0) && aL.lIlllIllIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIllllIIl[1]);

                            }
                            int[] nArray = new int[llIllllIIl[1]];
                            nArray[aL.llIllllIIl[0]] = llIllllIIl[7];
                            if (aL.lIlllIlIllllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray3 = new int[llIllllIIl[1]];
                                nArray3[aL.llIllllIIl[0]] = llIllllIIl[7];
                                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                                    a.a(llIllllIIl[7], llIllllIIl[1]);
                                }
                            }
                            int[] nArray4 = new int[llIllllIIl[1]];
                            nArray4[aL.llIllllIIl[0]] = llIllllIIl[8];
                            if (aL.lIlllIlIllllI(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llIllllIIl[1]];
                                nArray5[aL.llIllllIIl[0]] = llIllllIIl[8];
                                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llIllllIIl[8], llIllllIIl[1]);
                                }
                            }
                            int[] nArray6 = new int[llIllllIIl[1]];
                            nArray6[aL.llIllllIIl[0]] = llIllllIIl[21];
                            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                a.a(llIllllIIl[21], llIllllIIl[1]);
                            }
                            int[] nArray7 = new int[llIllllIIl[1]];
                            nArray7[aL.llIllllIIl[0]] = llIllllIIl[22];
                            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                a.a(llIllllIIl[22], llIllllIIl[1]);
                            }
                            int[] nArray8 = new int[llIllllIIl[1]];
                            nArray8[aL.llIllllIIl[0]] = llIllllIIl[23];
                            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                a.a(llIllllIIl[23], llIllllIIl[1]);
                            }
                            if (aL.lIlllIlIlllIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                                int[] nArray9 = new int[llIllllIIl[1]];
                                nArray9[aL.llIllllIIl[0]] = nJ;
                                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                    a.a(nJ, llIllllIIl[11]);
                                }
                            }
                            int[] nArray10 = new int[llIllllIIl[1]];
                            nArray10[aL.llIllllIIl[0]] = llIllllIIl[9];
                            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                                Bank.withdrawAll((int)llIllllIIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            }
                        }
                    }
                    if (aL.lIlllIlIlllII(aL.an() ? 1 : 0)) {
                        NPC llllllllllllllllllIIIIIIlIIIllIl2;
                        aL.l(llIllllIIl[5]);
                        aL.l(llIllllIIl[6]);
                        aL.l(llIllllIIl[7]);
                        aL.l(llIllllIIl[8]);
                        aL.b(f.bk);
                        aL.b(f.aW);
                        String[] stringArray = new String[llIllllIIl[1]];
                        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[24]];
                        if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray4 = new String[llIllllIIl[1]];
                            stringArray4[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[25]];
                            Inventory.getFirst((String[])stringArray4).interact(llIlllIlII[llIllllIIl[26]]);
                        }
                        if (aL.lIlllIlIlllII(Inventory.contains((int[])f.ba) ? 1 : 0) && aL.lIlllIlIlllIl(Movement.getRunEnergy(), llIllllIIl[27])) {
                            Inventory.getFirst((int[])f.ba).interact(llIlllIlII[llIllllIIl[28]]);
                            Time.sleepTicks((int)llIllllIIl[1]);

                        }
                        if (aL.lIlllIlIlllll(Movement.getRunEnergy(), llIllllIIl[29]) && aL.lIlllIlIllllI(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        aL.t(nN);
                        Predicate<Item> var19 = item -> item.getName().toLowerCase().contains(llIlllIlII[llIllllIIl[273]]);
                        if (aL.lIlllIlIlllII(Inventory.contains(var19) ? 1 : 0)) {
                            Inventory.getFirst(var19).interact(llIlllIlII[llIllllIIl[30]]);
                            Time.sleepTicks((int)llIllllIIl[1]);

                        }
                        if (aL.lIlllIlIlllII(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray5 = new String[llIllllIIl[1]];
                            stringArray5[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[31]];
                            if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray5) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains(var19) ? 1 : 0)) {
                                if (aL.lIlllIlIlllIl(cG, llIllllIIl[1]) && aL.lIlllIllIIlII(Movement.getRunEnergy(), llIllllIIl[29])) {
                                    Movement.toggleRun();
                                    cG += llIllllIIl[1];
                                }
                                if (aL.lIlllIllIIlII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                                    if (aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nP), llIllllIIl[16])) {
                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[32]];
                                        if (aL.lIlllIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)nP);

                                        Time.sleepTicks((int)llIllllIIl[1]);

                                    }
                                    if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nP), llIllllIIl[16])) {
                                        Time.sleepTicks((int)llIllllIIl[2]);

                                        if (aL.lIlllIlIllllI(Dialog.isOpen() ? 1 : 0) && aL.lIlllIlIllllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                            String[] stringArray6 = new String[llIllllIIl[1]];
                                            stringArray6[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[33]];
                                            if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray6) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains(var19) ? 1 : 0) && aL.lIlllIlIlllII(Widgets.get((int)llIllllIIl[34]).isEmpty() ? 1 : 0) && aL.lIlllIlIllllI(Vars.getBit((int)llIllllIIl[35]))) {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[36]];
                                                int[] nArray = new int[llIllllIIl[1]];
                                                nArray[aL.llIllllIIl[0]] = llIllllIIl[37];
                                                llllllllllllllllllIIIIIIlIIIllIl2 = NPCs.getNearest((int[])nArray);
                                                if (aL.lIlllIllIIIIl(llllllllllllllllllIIIIIIlIIIllIl2) && aL.lIlllIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                                                    llllllllllllllllllIIIIIIlIIIllIl2.interact(llIlllIlII[llIllllIIl[38]]);
                                                    Time.sleepTicks((int)llIllllIIl[10]);

                                                }
                                                g.a(new String[llIllllIIl[0]]);
                                            }
                                        }
                                    }
                                }
                                String[] stringArray7 = new String[llIllllIIl[1]];
                                stringArray7[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[39]];
                                g.a(stringArray7);
                            }
                        }
                        if (aL.lIlllIlIlllII(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray8 = new String[llIllllIIl[1]];
                            stringArray8[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[40]];
                            if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray8) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains(var19) ? 1 : 0)) {
                                if (aL.lIlllIllIIlII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                                    if (aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nI), llIllllIIl[16])) {
                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[41]];
                                        if (aL.lIlllIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)nI);

                                        Time.sleepTicks((int)llIllllIIl[1]);

                                    }
                                    Time.sleepTicks((int)llIllllIIl[2]);

                                    if (aL.lIlllIlIllllI(Dialog.isOpen() ? 1 : 0) && aL.lIlllIlIllllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                        String[] stringArray9 = new String[llIllllIIl[1]];
                                        stringArray9[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[29]];
                                        if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray9) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains(var19) ? 1 : 0)) {
                                            if (aL.lIlllIlIlllIl(cG, llIllllIIl[1]) && aL.lIlllIllIIlII(Movement.getRunEnergy(), llIllllIIl[29])) {
                                                Movement.toggleRun();
                                                cG += llIllllIIl[1];
                                            }
                                            if (aL.lIlllIllIIIlI(Widgets.get((int)llIllllIIl[34], (int)llIllllIIl[24]))) {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[42]];
                                                int[] nArray = new int[llIllllIIl[1]];
                                                nArray[aL.llIllllIIl[0]] = llIllllIIl[43];
                                                llllllllllllllllllIIIIIIlIIIllIl2 = NPCs.getNearest((int[])nArray);
                                                if (aL.lIlllIllIIIIl(llllllllllllllllllIIIIIIlIIIllIl2) && aL.lIlllIlIllllI(Dialog.isOpen() ? 1 : 0) && aL.lIlllIlIllllI(Vars.getBit((int)llIllllIIl[35]))) {
                                                    llllllllllllllllllIIIIIIlIIIllIl2.interact(llIlllIlII[llIllllIIl[44]]);
                                                    Time.sleepTicks((int)llIllllIIl[10]);

                                                }
                                                g.a(new String[llIllllIIl[0]]);
                                                Time.sleepTicks((int)llIllllIIl[2]);

                                            }
                                        }
                                    }
                                }
                                g.a(new String[llIllllIIl[0]]);
                            }
                        }
                        try {
                            aL.gc();

                        }
                        catch (Exception llllllllllllllllllIIIIIIlIIIllIl2) {
                            System.out.println(llllllllllllllllllIIIIIIlIIIllIl2.getStackTrace());
                            System.out.println(llllllllllllllllllIIIIIIlIIIllIl2.getCause());
                            llllllllllllllllllIIIIIIlIIIllIl2.printStackTrace();
                        }
                        if (((0x10 ^ 0x1A ^ (0xE3 ^ 0xAD)) & (43 + 20 - -87 + 100 ^ 35 + 58 - -57 + 40 ^ -1)) != 0) {
                            return;
                        }
                    }
                    if (!aL.lIlllIlIlllIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) break block66;
                    int[] nArray = new int[llIllllIIl[1]];
                    nArray[aL.llIllllIIl[0]] = nJ;
                    if (!aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) break block67;
                    String[] stringArray = new String[llIllllIIl[1]];
                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[45]];
                    if (!aL.lIlllIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) break block67;
                    int[] nArray11 = new int[llIllllIIl[1]];
                    nArray11[aL.llIllllIIl[0]] = llIllllIIl[22];
                    if (!aL.lIlllIlIlllII(Inventory.contains((int[])nArray11) ? 1 : 0)) break block67;
                    String[] stringArray10 = new String[llIllllIIl[1]];
                    stringArray10[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[46]];
                    if (!aL.lIlllIlIllllI(Inventory.contains((String[])stringArray10) ? 1 : 0)) break block66;
                }
                if (aL.lIlllIlIlllII(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nQ), llIllllIIl[28])) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[4]];
                    Movement.walkTo((WorldPoint)nQ);

                }
                if (aL.lIlllIlIlllII(nM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[47]];
                    Movement.walkTo((BankLocation)BankLocation.BURGH_DE_ROTT_BANK);

                }
                if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[18])) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[48]];
                    aL.gd();
                }
                if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nQ), llIllllIIl[28])) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[49]];
                    aL.gd();
                }
            }
            if (aL.lIlllIlIlllIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                int[] nArray = new int[llIllllIIl[1]];
                nArray[aL.llIllllIIl[0]] = nJ;
                if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray12 = new int[llIllllIIl[1]];
                    nArray12[aL.llIllllIIl[0]] = nJ;
                    Inventory.getFirst((int[])nArray12).interact(llIlllIlII[llIllllIIl[50]]);
                    Time.sleepTicks((int)llIllllIIl[1]);

                }
            }
            int[] nArray = new int[llIllllIIl[1]];
            nArray[aL.llIllllIIl[0]] = llIllllIIl[51];
            if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray13 = new int[llIllllIIl[1]];
                nArray13[aL.llIllllIIl[0]] = llIllllIIl[51];
                Inventory.getAll((int[])nArray13).stream().forEach(item -> item.interact(llIlllIlII[llIllllIIl[272]]));
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block6: {
            block8: {
                block7: {
                    block5: {
                        String[] stringArray = new String[llIllllIIl[1]];
                        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[187]];
                        if (!aL.lIlllIlIllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block5;
                        String[] stringArray2 = new String[llIllllIIl[1]];
                        stringArray2[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[188]];
                        if (!aL.lIlllIlIlllII(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block6;
                    }
                    int[] nArray = new int[llIllllIIl[1]];
                    nArray[aL.llIllllIIl[0]] = llIllllIIl[8];
                    if (!aL.lIlllIlIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                    int[] nArray2 = new int[llIllllIIl[1]];
                    nArray2[aL.llIllllIIl[0]] = llIllllIIl[8];
                    if (!aL.lIlllIlIllllI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block7;
                    int[] nArray3 = new int[llIllllIIl[1]];
                    nArray3[aL.llIllllIIl[0]] = llIllllIIl[189];
                    if (!aL.lIlllIlIllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block7;
                    int[] nArray4 = new int[llIllllIIl[1]];
                    nArray4[aL.llIllllIIl[0]] = llIllllIIl[189];
                    if (!aL.lIlllIlIllllI(Equipment.contains((int[])nArray4) ? 1 : 0)) break block7;
                    int[] nArray5 = new int[llIllllIIl[1]];
                    nArray5[aL.llIllllIIl[0]] = llIllllIIl[190];
                    if (!aL.lIlllIlIllllI(Inventory.contains((int[])nArray5) ? 1 : 0)) break block7;
                    int[] nArray6 = new int[llIllllIIl[1]];
                    nArray6[aL.llIllllIIl[0]] = llIllllIIl[190];
                    if (!aL.lIlllIlIlllII(Equipment.contains((int[])nArray6) ? 1 : 0)) break block6;
                }
                int[] nArray = new int[llIllllIIl[1]];
                nArray[aL.llIllllIIl[0]] = llIllllIIl[22];
                if (!aL.lIlllIlIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block8;
                String[] stringArray = new String[llIllllIIl[1]];
                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[191]];
                if (!aL.lIlllIlIlllII(Equipment.contains((String[])stringArray) ? 1 : 0)) break block6;
            }
            int[] nArray = new int[llIllllIIl[1]];
            nArray[aL.llIllllIIl[0]] = llIllllIIl[23];
            if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[llIllllIIl[1]];
                nArray7[aL.llIllllIIl[0]] = llIllllIIl[9];
                if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                    n2 = llIllllIIl[1];

                    if ((0x2F ^ 0x40 ^ (0x17 ^ 0x7C)) >= 0) return n2 != 0;
                    return ((135 + 222 - 200 + 74 ^ 41 + 139 - 160 + 176) & (0x5A ^ 0x56 ^ (0x59 ^ 0x76) ^ -1)) != 0;
                }
            }
        }
        n2 = llIllllIIl[0];
        return n2 != 0;
    }

    public static void t(String string) {
        Widget var20;
        String[] stringArray = new String[llIllllIIl[1]];
        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[206]];
        if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            mV = llIllllIIl[0];
            AccBuilderSotf.c = llIlllIlII[llIllllIIl[207]];
            String[] stringArray2 = new String[llIllllIIl[1]];
            stringArray2[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[208]];
            Inventory.getFirst((String[])stringArray2).interact(llIlllIlII[llIllllIIl[209]]);
            Time.sleepTicks((int)llIllllIIl[10]);

            if (!aL.lIlllIllIIIlI(Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15])) || aL.lIlllIlIllllI(Widgets.get((int)llIllllIIl[210]).isEmpty() ? 1 : 0)) {
                String var21;
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[211]];
                if (aL.lIlllIlIlllII(var21.contains(llIlllIlII[llIllllIIl[212]]) ? 1 : 0) && aL.lIlllIllIIIIl(var20 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);

                    var20.getChild(llIllllIIl[3]).interact(llIlllIlII[llIllllIIl[213]]);
                    Time.sleepTicks((int)llIllllIIl[1]);

                }
                if (aL.lIlllIlIlllII(var21.contains(llIlllIlII[llIllllIIl[214]]) ? 1 : 0) && aL.lIlllIllIIIIl(var20 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);

                    var20.getChild(llIllllIIl[1]).interact(llIlllIlII[llIllllIIl[215]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));

                }
                if (aL.lIlllIlIlllII(var21.contains(llIlllIlII[llIllllIIl[216]]) ? 1 : 0) && aL.lIlllIllIIIIl(var20 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);

                    var20.getChild(llIllllIIl[0]).interact(llIlllIlII[llIllllIIl[217]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));

                }
                if (aL.lIlllIlIlllII(var21.contains(llIlllIlII[llIllllIIl[218]]) ? 1 : 0) && aL.lIlllIllIIIIl(var20 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);

                    var20.getChild(llIllllIIl[2]).interact(llIlllIlII[llIllllIIl[219]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));

                }
                if (aL.lIlllIlIlllII(var21.contains(llIlllIlII[llIllllIIl[220]]) ? 1 : 0) && aL.lIlllIllIIIIl(var20 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);

                    var20.getChild(llIllllIIl[10]).interact(llIlllIlII[llIllllIIl[221]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));

                }
                if (aL.lIlllIlIlllII(var21.contains(llIlllIlII[llIllllIIl[222]]) ? 1 : 0) && aL.lIlllIllIIIIl(var20 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);

                    var20.getChild(llIllllIIl[11]).interact(llIlllIlII[llIllllIIl[223]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));

                }
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[224]];
                var20 = Widgets.fromId((int)llIllllIIl[225]);
                if (aL.lIlllIllIIIIl(var20) && aL.lIlllIlIlllII(var20.isVisible() ? 1 : 0)) {
                    Time.sleepTick();

                    var20.interact(llIlllIlII[llIllllIIl[226]]);
                    Time.sleepTicks((int)llIllllIIl[2]);

                }
            }
        }
        if (aL.lIlllIlIlllII(Inventory.contains(var20 = item -> item.getName().toLowerCase().contains(llIlllIlII[llIllllIIl[250]])) ? 1 : 0)) {
            Inventory.getFirst(var20).interact(llIlllIlII[llIllllIIl[227]]);
            Time.sleepTicks((int)llIllllIIl[1]);

        }
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> a(WorldPoint worldPoint, int n2, List<WorldPoint> list) {
        void var22;
        PriorityQueue<aM> priorityQueue = new PriorityQueue<aM>();
        ArrayList arrayList = new ArrayList();
        priorityQueue.add(new AMHelper(worldPoint, null, llIllllIIl[0], aL.d(worldPoint.getY(), n2)));

        while (aL.lIlllIlIllllI(var22.isEmpty() ? 1 : 0)) {
            void var23;
            void var24;
            void var25;
            aM var26 = (AMHelper) ar22.poll();
            if (aL.lIlllIllIlIII(var26.nT.getY(), (int)var25)) {
                return aL.a(var26);
            }
            var24.add(var26);

            Iterator<aM> var27 = aL.a(var26, (List<WorldPoint>)var23).iterator();
            while (aL.lIlllIlIlllII(var27.hasNext() ? 1 : 0)) {
                aM var28 = var27.next();
                int var29 = var26.nV + llIllllIIl[1];
                if (aL.lIlllIlIlllII(aL.b(var28, (List<aM>)var24) ? 1 : 0)) {

                    if (((142 + 2 - 26 + 28 ^ 107 + 179 - 277 + 184) & (42 + 202 - 28 + 25 ^ 106 + 27 - 113 + 142 ^ -1)) <= 2) continue;
                    return null;
                }
                if (!aL.lIlllIlIlllII(aL.a(var28, (PriorityQueue<aM>)var22) ? 1 : 0) || aL.lIlllIlIlllIl(var29, var28.nV)) {
                    var22.add(var28);

                }

                if ((0xD0 ^ 0x82 ^ (0x55 ^ 2)) != 0) continue;
                return null;
            }

            if (1 < (0x6F ^ 0xC ^ (0x33 ^ 0x54))) continue;
            return null;
        }
        return Collections.emptyList();
    }

    private static boolean lIlllIllIIlll(Object object, Object object2) {
        return object != object2;
    }

    public static void l(int n2) {
        int[] nArray = new int[llIllllIIl[1]];
        nArray[aL.llIllllIIl[0]] = n2;
        if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIllllIIl[1]];
            nArray2[aL.llIllllIIl[0]] = n2;
            if (aL.lIlllIlIllllI(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int var30;
                int[] nArray3 = new int[llIllllIIl[1]];
                nArray3[aL.llIllllIIl[0]] = n2;
                String[] stringArray = new String[llIllllIIl[1]];
                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[192]];
                if (aL.lIlllIlIlllII(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llIllllIIl[1]];
                    nArray4[aL.llIllllIIl[0]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(llIlllIlII[llIllllIIl[193]]);
                }
                int[] nArray5 = new int[llIllllIIl[1]];
                nArray5[aL.llIllllIIl[0]] = var30;
                String[] stringArray2 = new String[llIllllIIl[1]];
                stringArray2[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[194]];
                if (aL.lIlllIlIlllII(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[llIllllIIl[1]];
                    nArray6[aL.llIllllIIl[0]] = var30;
                    Inventory.getFirst((int[])nArray6).interact(llIlllIlII[llIllllIIl[195]]);
                }
                int[] nArray7 = new int[llIllllIIl[1]];
                nArray7[aL.llIllllIIl[0]] = var30;
                String[] stringArray3 = new String[llIllllIIl[1]];
                stringArray3[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[196]];
                if (aL.lIlllIlIlllII(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[llIllllIIl[1]];
                    nArray8[aL.llIllllIIl[0]] = var30;
                    Inventory.getFirst((int[])nArray8).interact(llIlllIlII[llIllllIIl[197]]);
                }
                if (aL.lIlllIllIlIII(var30, llIllllIIl[198])) {
                    Time.sleepTicks((int)llIllllIIl[10]);

                    String[] stringArray4 = new String[llIllllIIl[1]];
                    stringArray4[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[199]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)llIllllIIl[1]);

                }
            }
        }
    }

    private static int lIlllIllIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void b(int[] nArray) {
        if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0) && aL.lIlllIlIllllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] var31;
            String[] stringArray = new String[llIllllIIl[1]];
            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[200]];
            if (aL.lIlllIlIlllII(Inventory.getFirst((int[])nArray).hasAction(stringArray) ? 1 : 0)) {
                Inventory.getFirst((int[])nArray).interact(llIlllIlII[llIllllIIl[201]]);
            }
            String[] stringArray2 = new String[llIllllIIl[1]];
            stringArray2[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[202]];
            if (aL.lIlllIlIlllII(Inventory.getFirst((int[])var31).hasAction(stringArray2) ? 1 : 0)) {
                Inventory.getFirst((int[])var31).interact(llIlllIlII[llIllllIIl[203]]);
            }
            String[] stringArray3 = new String[llIllllIIl[1]];
            stringArray3[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[204]];
            if (aL.lIlllIlIlllII(Inventory.getFirst((int[])var31).hasAction(stringArray3) ? 1 : 0)) {
                Inventory.getFirst((int[])var31).interact(llIlllIlII[llIllllIIl[205]]);
            }
        }
    }

    @Override
    public int af() {
        try {
            aL.gb();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x67 ^ 0x63) != (0x38 ^ 0x3C)) {
            return (0x76 ^ 0x23) & ~(0xF2 ^ 0xA7);
        }
        return llIllllIIl[13];
    }

    private static boolean lIlllIllIlIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlllIllIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static List<aM> a(aM aM2, List<WorldPoint> list) {
        void var32;
        int[][] nArrayArray;
        ArrayList<aM> arrayList = new ArrayList<aM>();
        int[][] nArrayArray2 = new int[llIllllIIl[11]][];
        int[] nArray = new int[llIllllIIl[2]];
        nArray[aL.llIllllIIl[0]] = llIllllIIl[1];
        nArray[aL.llIllllIIl[1]] = llIllllIIl[0];
        nArrayArray2[aL.llIllllIIl[0]] = nArray;
        int[] nArray2 = new int[llIllllIIl[2]];
        nArray2[aL.llIllllIIl[0]] = llIllllIIl[80];
        nArray2[aL.llIllllIIl[1]] = llIllllIIl[0];
        nArrayArray2[aL.llIllllIIl[1]] = nArray2;
        int[] nArray3 = new int[llIllllIIl[2]];
        nArray3[aL.llIllllIIl[0]] = llIllllIIl[0];
        nArray3[aL.llIllllIIl[1]] = llIllllIIl[1];
        nArrayArray2[aL.llIllllIIl[2]] = nArray3;
        int[] nArray4 = new int[llIllllIIl[2]];
        nArray4[aL.llIllllIIl[0]] = llIllllIIl[0];
        nArray4[aL.llIllllIIl[1]] = llIllllIIl[80];
        nArrayArray2[aL.llIllllIIl[10]] = nArray4;
        int[][] nArrayArray3 = nArrayArray = nArrayArray2;
        int n2 = nArrayArray3.length;
        int var33 = llIllllIIl[0];
        while (aL.lIlllIlIlllIl(var33, (int)var32)) {
            void var34;
            int var35;
            int var36;
            aM var37;
            void var38;
            void var39 = var38[var33];
            int var40 = var37.nT.getX() + var39[llIllllIIl[0]];
            WorldPoint var41 = new WorldPoint(var40, var36 = var37.nT.getY() + var39[llIllllIIl[1]], var35 = var37.nT.getPlane());
            if (aL.lIlllIlIlllII(var34.contains(var41) ? 1 : 0)) {
                void var42;
                var42.add(new AMHelper(var41, var37, llIllllIIl[0], aL.d(var36, nR.getY() + llIllllIIl[17])));

            }
            ++var33;

            if (-1 >= -1) continue;
            return null;
        }
        return arrayList;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aL.lIlllIllIIlII(Skills.getLevel((Skill)Skill.SLAYER), llIllllIIl[120])) {
            bl = llIllllIIl[1];

            if (1 < 0) {
                return false;
            }
        } else {
            bl = llIllllIIl[0];
        }
        return bl;
    }

    private static boolean lIlllIllIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlllIllIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean b(aM aM2, List<aM> list) {
        return list.stream().anyMatch(aM3 -> aM3.nT.equals((Object)aM2.nT));
    }
}

