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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.D_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aM;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class aL_Unknown
implements ac {
    public static /* synthetic */ String nN;
    static /* synthetic */ WorldPoint nQ;
    public static /* synthetic */ WorldPoint nI;
    static /* synthetic */ WorldPoint nR;
    private static /* synthetic */ int[] llIllllIIl;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ WorldArea nM;
    public static /* synthetic */ int mT;
    public static /* synthetic */ WorldArea nH;
    public static /* synthetic */ int mV;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int nK;
    public static /* synthetic */ int mU;
    static /* synthetic */ WorldArea nO;
    public static /* synthetic */ WorldArea nL;
    static /* synthetic */ int cG;
    public static /* synthetic */ int nJ;
    static /* synthetic */ WorldPoint nP;
    private static /* synthetic */ String[] llIlllIlII;

    private static void lIlllIlIlIlll() {
        llIlllIlII = new String[llIllllIIl[291]];
        aL.llIlllIlII[aL.llIllllIIl[0]] = aL."Buying items";
        aL.llIlllIlII[aL.llIllllIIl[1]] = aL."Finished buying items, switching back to agility";
        aL.llIlllIlII[aL.llIllllIIl[2]] = aL."Read";
        aL.llIlllIlII[aL.llIllllIIl[10]] = aL."Break";
        aL.llIlllIlII[aL.llIllllIIl[11]] = aL."Navigating to bank";
        aL.llIlllIlII[aL.llIllllIIl[14]] = aL."Veliaf Hurtz";
        aL.llIlllIlII[aL.llIllllIIl[15]] = aL."Ladder";
        aL.llIlllIlII[aL.llIllllIIl[3]] = aL."Climb-up";
        aL.llIlllIlII[aL.llIllllIIl[16]] = aL."Veliaf Hurtz";
        aL.llIlllIlII[aL.llIllllIIl[17]] = aL."Nav to burgh bank";
        aL.llIlllIlII[aL.llIllllIIl[18]] = aL."Handling banking";
        aL.llIlllIlII[aL.llIllllIIl[20]] = aL."Bank";
        aL.llIlllIlII[aL.llIllllIIl[24]] = aL."Vial";
        aL.llIlllIlII[aL.llIllllIIl[25]] = aL."Vial";
        aL.llIlllIlII[aL.llIllllIIl[26]] = aL."Drop";
        aL.llIlllIlII[aL.llIllllIIl[28]] = aL."Drink";
        aL.llIlllIlII[aL.llIllllIIl[30]] = aL."Read";
        aL.llIlllIlII[aL.llIllllIIl[31]] = aL."Reward token";
        aL.llIlllIlII[aL.llIllllIIl[32]] = aL."Nav to city escort tile";
        aL.llIlllIlII[aL.llIllllIIl[33]] = aL."Reward token";
        aL.llIlllIlII[aL.llIllllIIl[36]] = aL."Clicking npc";
        aL.llIlllIlII[aL.llIllllIIl[38]] = aL."Escort";
        aL.llIlllIlII[aL.llIllllIIl[39]] = aL."Yes.";
        aL.llIlllIlII[aL.llIllllIIl[40]] = aL."Reward token";
        aL.llIlllIlII[aL.llIllllIIl[41]] = aL."Nav to npc";
        aL.llIlllIlII[aL.llIllllIIl[29]] = aL."Reward token";
        aL.llIlllIlII[aL.llIllllIIl[42]] = aL."Clicking npc";
        aL.llIlllIlII[aL.llIllllIIl[44]] = aL."Escort";
        aL.llIlllIlII[aL.llIllllIIl[45]] = aL."Knife";
        aL.llIlllIlII[aL.llIllllIIl[46]] = aL."Hammer";
        aL.llIlllIlII[aL.llIllllIIl[4]] = aL."Nav to canafis bank";
        aL.llIlllIlII[aL.llIllllIIl[47]] = aL."Nav to burgh bank";
        aL.llIlllIlII[aL.llIllllIIl[48]] = aL."Handle banking";
        aL.llIlllIlII[aL.llIllllIIl[49]] = aL."Handle banking";
        aL.llIlllIlII[aL.llIllllIIl[50]] = aL."Eat";
        aL.llIlllIlII[aL.llIllllIIl[52]] = aL."Yes.";
        aL.llIlllIlII[aL.llIllllIIl[53]] = aL."Starting trek";
        aL.llIlllIlII[aL.llIllllIIl[56]] = aL."Vampyre Juvinate";
        aL.llIlllIlII[aL.llIllllIIl[57]] = aL."Giant snail";
        aL.llIlllIlII[aL.llIllllIIl[58]] = aL."Nail beast";
        aL.llIlllIlII[aL.llIllllIIl[59]] = aL."Abidor Crank";
        aL.llIlllIlII[aL.llIllllIIl[60]] = aL."Swamp snake";
        aL.llIlllIlII[aL.llIllllIIl[61]] = aL."Riyl shadow";
        aL.llIlllIlII[aL.llIllllIIl[62]] = aL."Bog";
        aL.llIlllIlII[aL.llIllllIIl[63]] = aL."Evading combat event";
        aL.llIlllIlII[aL.llIllllIIl[64]] = aL."Evade-event";
        aL.llIlllIlII[aL.llIllllIIl[67]] = aL."Ghast";
        aL.llIlllIlII[aL.llIllllIIl[69]] = aL."Evading ghast event";
        aL.llIlllIlII[aL.llIllllIIl[70]] = aL."Evade-event";
        aL.llIlllIlII[aL.llIllllIIl[71]] = aL."Broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[27]] = aL."broken bridge event";
        aL.llIlllIlII[aL.llIllllIIl[72]] = aL."Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[73]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[74]] = aL."Take";
        aL.llIlllIlII[aL.llIllllIIl[75]] = aL."Undead Lumberjack";
        aL.llIlllIlII[aL.llIllllIIl[76]] = aL."Attack";
        aL.llIlllIlII[aL.llIllllIIl[77]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[78]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[79]] = aL."Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[81]] = aL."Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[68]] = aL."Chop down";
        aL.llIlllIlII[aL.llIllllIIl[82]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[83]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[84]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[85]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[86]] = aL."Broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[87]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[88]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[89]] = aL."Broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[90]] = aL."Yes.";
        aL.llIlllIlII[aL.llIllllIIl[91]] = aL."Partially broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[92]] = aL."partial bridge event";
        aL.llIlllIlII[aL.llIllllIIl[93]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[94]] = aL."Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[95]] = aL."Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[96]] = aL."Chop down";
        aL.llIlllIlII[aL.llIllllIIl[97]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[98]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[99]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[100]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[101]] = aL."Partially broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[102]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[103]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[104]] = aL."Partially broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[105]] = aL."Partially broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[106]] = aL."Inspect";
        aL.llIlllIlII[aL.llIllllIIl[107]] = aL."Yes.";
        aL.llIlllIlII[aL.llIllllIIl[108]] = aL."Slightly broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[109]] = aL."slightly bridge event";
        aL.llIlllIlII[aL.llIllllIIl[110]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[111]] = aL."Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[112]] = aL."Dead tree";
        aL.llIlllIlII[aL.llIllllIIl[113]] = aL."Chop down";
        aL.llIlllIlII[aL.llIllllIIl[114]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[115]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[116]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[117]] = aL."Plank";
        aL.llIlllIlII[aL.llIllllIIl[118]] = aL."Slightly broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[119]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[120]] = aL."Logs";
        aL.llIlllIlII[aL.llIllllIIl[13]] = aL."Slightly broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[121]] = aL."Slightly broken bridge";
        aL.llIlllIlII[aL.llIllllIIl[122]] = aL."Inspect";
        aL.llIlllIlII[aL.llIllllIIl[123]] = aL."Yes.";
        aL.llIlllIlII[aL.llIllllIIl[124]] = aL."Fixed bridge";
        aL.llIlllIlII[aL.llIllllIIl[125]] = aL."Path";
        aL.llIlllIlII[aL.llIllllIIl[126]] = aL."Continuing trek";
        aL.llIlllIlII[aL.llIllllIIl[127]] = aL."Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[128]] = aL."Crossing bridge";
        aL.llIlllIlII[aL.llIllllIIl[129]] = aL."Cross";
        aL.llIlllIlII[aL.llIllllIIl[130]] = aL."Swamp tree";
        aL.llIlllIlII[aL.llIllllIIl[131]] = aL."Path";
        aL.llIlllIlII[aL.llIllllIIl[132]] = aL."Short vine";
        aL.llIlllIlII[aL.llIllllIIl[133]] = aL."Short vine";
        aL.llIlllIlII[aL.llIllllIIl[134]] = aL."Cutting vines";
        aL.llIlllIlII[aL.llIllllIIl[135]] = aL."Swamp tree";
        aL.llIlllIlII[aL.llIllllIIl[136]] = aL."Cut-vine";
        aL.llIlllIlII[aL.llIllllIIl[137]] = aL."Short vine";
        aL.llIlllIlII[aL.llIllllIIl[138]] = aL."Short vine";
        aL.llIlllIlII[aL.llIllllIIl[139]] = aL."Short vine";
        aL.llIlllIlII[aL.llIllllIIl[140]] = aL."Short vine";
        aL.llIlllIlII[aL.llIllllIIl[141]] = aL."Long vine";
        aL.llIlllIlII[aL.llIllllIIl[142]] = aL."Long vine";
        aL.llIlllIlII[aL.llIllllIIl[144]] = aL."Swamp tree branch";
        aL.llIlllIlII[aL.llIllllIIl[145]] = aL."Swing-from";
        aL.llIlllIlII[aL.llIllllIIl[146]] = aL."Continuing trek";
        aL.llIlllIlII[aL.llIllllIIl[147]] = aL."Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[148]] = aL."Bog";
        aL.llIlllIlII[aL.llIllllIIl[149]] = aL."Solving bog";
        aL.llIlllIlII[aL.llIllllIIl[150]] = aL."Start of bog section";
        aL.llIlllIlII[aL.llIllllIIl[151]] = aL."Bog";
        aL.llIlllIlII[aL.llIllllIIl[152]] = aL."Set tiles";
        aL.llIlllIlII[aL.llIllllIIl[153]] = aL."Set anchor";
        aL.llIlllIlII[aL.llIllllIIl[154]] = aL."Path";
        aL.llIlllIlII[aL.llIllllIIl[155]] = aL."Generating path";
        aL.llIlllIlII[aL.llIllllIIl[156]] = aL."Path found:";
        aL.llIlllIlII[aL.llIllllIIl[157]] = aL."Walk to start tile";
        aL.llIlllIlII[aL.llIllllIIl[160]] = aL."Navigating bog";
        aL.llIlllIlII[aL.llIllllIIl[161]] = aL."Bog";
        aL.llIlllIlII[aL.llIllllIIl[162]] = aL."Stand-on";
        aL.llIlllIlII[aL.llIllllIIl[163]] = aL."Removed tile";
        aL.llIlllIlII[aL.llIllllIIl[164]] = aL."Not logged in, breaking";
        aL.llIlllIlII[aL.llIllllIIl[165]] = aL."No path found.";
        aL.llIlllIlII[aL.llIllllIIl[166]] = aL."Continue trek";
        aL.llIlllIlII[aL.llIllllIIl[167]] = aL."Path";
        aL.llIlllIlII[aL.llIllllIIl[168]] = aL."Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[169]] = aL."Generating path";
        aL.llIlllIlII[aL.llIllllIIl[170]] = aL."Path found:";
        aL.llIlllIlII[aL.llIllllIIl[171]] = aL."Walk to start tile";
        aL.llIlllIlII[aL.llIllllIIl[172]] = aL."Navigating bog";
        aL.llIlllIlII[aL.llIllllIIl[173]] = aL."Bog";
        aL.llIlllIlII[aL.llIllllIIl[174]] = aL."Stand-on";
        aL.llIlllIlII[aL.llIllllIIl[175]] = aL."Removed tile";
        aL.llIlllIlII[aL.llIllllIIl[176]] = aL."Not logged in, breaking";
        aL.llIlllIlII[aL.llIllllIIl[177]] = aL."No path found.";
        aL.llIlllIlII[aL.llIllllIIl[178]] = aL."Continue trek";
        aL.llIlllIlII[aL.llIllllIIl[179]] = aL."Path";
        aL.llIlllIlII[aL.llIllllIIl[180]] = aL."Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[181]] = aL."In bog too long, logging to reset";
        aL.llIlllIlII[aL.llIllllIIl[182]] = aL."Handling banking";
        aL.llIlllIlII[aL.llIllllIIl[183]] = aL."Bank";
        aL.llIlllIlII[aL.llIllllIIl[184]] = aL."Bank";
        aL.llIlllIlII[aL.llIllllIIl[186]] = aL."Needs items, banking";
        aL.llIlllIlII[aL.llIllllIIl[187]] = aL."Dragon sword";
        aL.llIlllIlII[aL.llIllllIIl[188]] = aL."Dragon sword";
        aL.llIlllIlII[aL.llIllllIIl[191]] = aL."Bronze axe";
        aL.llIlllIlII[aL.llIllllIIl[192]] = aL."Wear";
        aL.llIlllIlII[aL.llIllllIIl[193]] = aL."Wear";
        aL.llIlllIlII[aL.llIllllIIl[194]] = aL."Wield";
        aL.llIlllIlII[aL.llIllllIIl[195]] = aL."Wield";
        aL.llIlllIlII[aL.llIllllIIl[196]] = aL."Equip";
        aL.llIlllIlII[aL.llIllllIIl[197]] = aL."Equip";
        aL.llIlllIlII[aL.llIllllIIl[199]] = aL."Give me a PK skull.";
        aL.llIlllIlII[aL.llIllllIIl[200]] = aL."Wear";
        aL.llIlllIlII[aL.llIllllIIl[201]] = aL."Wear";
        aL.llIlllIlII[aL.llIllllIIl[202]] = aL."Wield";
        aL.llIlllIlII[aL.llIllllIIl[203]] = aL."Wield";
        aL.llIlllIlII[aL.llIllllIIl[204]] = aL."Equip";
        aL.llIlllIlII[aL.llIllllIIl[205]] = aL."Equip";
        aL.llIlllIlII[aL.llIllllIIl[206]] = aL."Reward token";
        aL.llIlllIlII[aL.llIllllIIl[207]] = aL."Claiming reward;";
        aL.llIlllIlII[aL.llIllllIIl[208]] = aL."Reward token";
        aL.llIlllIlII[aL.llIllllIIl[209]] = aL."Look-at";
        aL.llIlllIlII[aL.llIllllIIl[211]] = aL."Selecting reward";
        aL.llIlllIlII[aL.llIllllIIl[212]] = aL."xp";
        aL.llIlllIlII[aL.llIllllIIl[213]] = aL."Details";
        aL.llIlllIlII[aL.llIllllIIl[214]] = aL."bs";
        aL.llIlllIlII[aL.llIllllIIl[215]] = aL."Details";
        aL.llIlllIlII[aL.llIllllIIl[216]] = aL."ess";
        aL.llIlllIlII[aL.llIllllIIl[217]] = aL."Details";
        aL.llIlllIlII[aL.llIllllIIl[218]] = aL."bars";
        aL.llIlllIlII[aL.llIllllIIl[219]] = aL."Details";
        aL.llIlllIlII[aL.llIllllIIl[220]] = aL."herbs";
        aL.llIlllIlII[aL.llIllllIIl[221]] = aL."Details";
        aL.llIlllIlII[aL.llIllllIIl[222]] = aL."ores";
        aL.llIlllIlII[aL.llIllllIIl[223]] = aL."Details";
        aL.llIlllIlII[aL.llIllllIIl[224]] = aL."Claiming";
        aL.llIlllIlII[aL.llIllllIIl[226]] = aL."Claim";
        aL.llIlllIlII[aL.llIllllIIl[227]] = aL."Read";
        aL.llIlllIlII[aL.llIllllIIl[249]] = aL."Temple trekking";
        aL.llIlllIlII[aL.llIllllIIl[250]] = aL."tome";
        aL.llIlllIlII[aL.llIllllIIl[251]] = aL."Bank booth";
        aL.llIlllIlII[aL.llIllllIIl[252]] = aL."Bank";
        aL.llIlllIlII[aL.llIllllIIl[253]] = aL."Path";
        aL.llIlllIlII[aL.llIllllIIl[254]] = aL."Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[256]] = aL."Swing-from";
        aL.llIlllIlII[aL.llIllllIIl[257]] = aL."Cut-vine";
        aL.llIlllIlII[aL.llIllllIIl[258]] = aL."Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[259]] = aL."Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[260]] = aL."Cross";
        aL.llIlllIlII[aL.llIllllIIl[261]] = aL."Fixed bridge";
        aL.llIlllIlII[aL.llIllllIIl[262]] = aL."Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[263]] = aL."Lumberjack";
        aL.llIlllIlII[aL.llIllllIIl[264]] = aL."bridge";
        aL.llIlllIlII[aL.llIllllIIl[265]] = aL."Evade-event";
        aL.llIlllIlII[aL.llIllllIIl[266]] = aL."Evade-event";
        aL.llIlllIlII[aL.llIllllIIl[267]] = aL."Swamp tree";
        aL.llIlllIlII[aL.llIllllIIl[268]] = aL."bridge";
        aL.llIlllIlII[aL.llIllllIIl[270]] = aL."Continue-trek";
        aL.llIlllIlII[aL.llIllllIIl[271]] = aL."Read";
        aL.llIlllIlII[aL.llIllllIIl[272]] = aL."Drop";
        aL.llIlllIlII[aL.llIllllIIl[273]] = aL."tome";
        aL.llIlllIlII[aL.llIllllIIl[274]] = aL."tome";
        aL.llIlllIlII[aL.llIllllIIl[284]] = aL."xp";
    }

    private static boolean lIlllIllIIIlI(Object object) {
        return object == null;
    }

    private static String lIlllIIlllllI(String var42, String var2) {
        var42 = new String(Base64.getDecoder().decode(var42.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var32 = new StringBuilder();
        char[] var51 = var2.toCharArray();
        int var35 = llIllllIIl[0];
        char[] var36 = var42.toCharArray();
        int var52 = var36.length;
        int var14 = llIllllIIl[0];
        while (aL.lIlllIlIlllIl(var14, var52)) {
            char var25 = var36[var14];
            var32.append((char)(var25 ^ var51[var35 % var51.length]));
            0;
            ++var35;
            ++var14;
            0;
            if (2 >= 2) continue;
            return null;
        }
        return String.valueOf(var32);
    }

    private static boolean lIlllIlIllllI(int n2) {
        return n2 == 0;
    }

    public static void gc() {
        Object var56;
        block116: {
            Object var29;
            block117: {
                Object var39;
                Object var10;
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
                                                                    Object var11;
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
                                                                                            0;
                                                                                            
                                                                                            }
                                                                                        } else {
                                                                                            bl = llIllllIIl[0];
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)llIllllIIl[54], (int)llIllllIIl[55]);
                                                                                    0;
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
                                                                                var11 = tileObject -> {
                                                                                    String[] stringArray = new String[llIllllIIl[1]];
                                                                                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[266]];
                                                                                    return tileObject.hasAction(stringArray);
                                                                                };
                                                                                var56 = TileObjects.getNearest((Predicate)var11);
                                                                                if (aL.lIlllIllIIIIl(var56)) {
                                                                                    var56.interact(llIlllIlII[llIllllIIl[64]]);
                                                                                    Time.sleepUntil(() -> {
                                                                                        boolean bl;
                                                                                        if (aL.lIlllIlIllllI(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                            bl = llIllllIIl[1];
                                                                                            0;
                                                                                            if (3 <= 0) {
                                                                                                return ((0 ^ 0x7D ^ (0x45 ^ 0x16)) & (0x55 ^ 0xB ^ (0xFF ^ 0x8F) ^ -1)) != 0;
                                                                                            }
                                                                                        } else {
                                                                                            bl = llIllllIIl[0];
                                                                                        }
                                                                                        return bl;
                                                                                    }, (int)Rand.nextInt((int)llIllllIIl[65], (int)llIllllIIl[66]));
                                                                                    0;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    String[] stringArray = new String[llIllllIIl[1]];
                                                                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[67]];
                                                                    if (aL.lIlllIllIIIIl(NPCs.getNearest((String[])stringArray)) && aL.lIlllIlIllllI(nH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nI), llIllllIIl[68])) {
                                                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[69]];
                                                                        var11 = tileObject -> {
                                                                            String[] stringArray = new String[llIllllIIl[1]];
                                                                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[265]];
                                                                            return tileObject.hasAction(stringArray);
                                                                        };
                                                                        var56 = TileObjects.getNearest((Predicate)var11);
                                                                        if (aL.lIlllIllIIIIl(var56)) {
                                                                            var56.interact(llIlllIlII[llIllllIIl[70]]);
                                                                            Time.sleepUntil(() -> {
                                                                                boolean bl;
                                                                                if (aL.lIlllIlIllllI(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                                                    bl = llIllllIIl[1];
                                                                                    0;
                                                                                    if (-2 >= 0) {
                                                                                        return ((0xD8 ^ 0xC2 ^ (0x7C ^ 0x5C)) & (0x23 ^ 0x67 ^ (0x33 ^ 0x4D) ^ -1)) != 0;
                                                                                    }
                                                                                } else {
                                                                                    bl = llIllllIIl[0];
                                                                                }
                                                                                return bl;
                                                                            }, (int)Rand.nextInt((int)llIllllIIl[65], (int)llIllllIIl[66]));
                                                                            0;
                                                                        }
                                                                    }
                                                                    var11 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(llIlllIlII[llIllllIIl[264]]));
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
                                                                        var56 = TileItems.getNearest((String[])stringArray10);
                                                                        if (aL.lIlllIllIIIIl(var56)) {
                                                                            var56.interact(llIlllIlII[llIllllIIl[74]]);
                                                                            Time.sleepTicks((int)llIllllIIl[1]);
                                                                            0;
                                                                        }
                                                                        if (aL.lIlllIllIIIIl(var29 = TileItems.getNearest(tileItem -> tileItem.getName().contains(llIlllIlII[llIllllIIl[263]])))) {
                                                                            // empty if block
                                                                        }
                                                                        String[] stringArray11 = new String[llIllllIIl[1]];
                                                                        stringArray11[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[75]];
                                                                        var10 = NPCs.getNearest((String[])stringArray11);
                                                                        if (aL.lIlllIllIIIIl(var10) && aL.lIlllIllIIlll(LocalPlayer.get().getInteracting(), var10) && aL.lIlllIllIIIlI(var56) && aL.lIlllIlIllllI(var10.isDead() ? 1 : 0) && aL.lIlllIlIlllII(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                                                                            var10.interact(llIlllIlII[llIllllIIl[76]]);
                                                                            Time.sleepTicks((int)llIllllIIl[1]);
                                                                            0;
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
                                                                    0;
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
                                                            0;
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
                                                            0;
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
                                                        0;
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
                                                0;
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
                                                0;
                                            }
                                            String[] stringArray31 = new String[llIllllIIl[1]];
                                            stringArray31[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[105]];
                                            TileObjects.getNearest((String[])stringArray31).interact(llIlllIlII[llIllllIIl[106]]);
                                            Time.sleepTicks((int)llIllllIIl[2]);
                                            0;
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
                                            0;
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
                                    0;
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
                                    0;
                                }
                                String[] stringArray42 = new String[llIllllIIl[1]];
                                stringArray42[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[121]];
                                TileObjects.getNearest((String[])stringArray42).interact(llIlllIlII[llIllllIIl[122]]);
                                Time.sleepTicks((int)llIllllIIl[2]);
                                0;
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
                            var56 = TileObjects.getAll((String[])stringArray43);
                            var29 = var56.stream().filter(tileObject -> {
                                String[] stringArray = new String[llIllllIIl[1]];
                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[262]];
                                return tileObject.hasAction(stringArray);
                            }).collect(Collectors.toList());
                            var10 = null;
                            var39 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                String[] stringArray = new String[llIllllIIl[1]];
                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[260]];
                                if (aL.lIlllIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0) && aL.lIlllIlIlllII(tileObject.getName().equals(llIlllIlII[llIllllIIl[261]]) ? 1 : 0)) {
                                    n2 = llIllllIIl[1];
                                    0;
                                    if (-1 > (0x6D ^ 0x69)) {
                                        return false;
                                    }
                                } else {
                                    n2 = llIllllIIl[0];
                                }
                                return n2 != 0;
                            });
                            if (aL.lIlllIllIIIIl(var39)) {
                                if (aL.lIlllIllIIlII(Players.getLocal().getWorldX(), var39.getWorldX())) {
                                    var10 = TileObjects.getNearest(tileObject -> {
                                        String[] stringArray = new String[llIllllIIl[1]];
                                        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[259]];
                                        return tileObject.hasAction(stringArray);
                                    });
                                    if (aL.lIlllIllIIIIl(var10)) {
                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[126]];
                                        var10.interact(llIlllIlII[llIllllIIl[127]]);
                                        Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[14]));
                                        0;
                                        0;
                                        if (2 <= -1) {
                                            return;
                                        }
                                    }
                                } else {
                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[128]];
                                    var39.interact(llIlllIlII[llIllllIIl[129]]);
                                    Time.sleepTicks((int)llIllllIIl[11]);
                                    0;
                                }
                            }
                        }
                        String[] stringArray44 = new String[llIllllIIl[1]];
                        stringArray44[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[130]];
                        if (!aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray44))) break block116;
                        nR = null;
                        String[] stringArray45 = new String[llIllllIIl[1]];
                        stringArray45[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[131]];
                        var56 = TileObjects.getAll((String[])stringArray45);
                        var29 = var56.stream().filter(tileObject -> {
                            String[] stringArray = new String[llIllllIIl[1]];
                            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[258]];
                            return tileObject.hasAction(stringArray);
                        }).collect(Collectors.toList());
                        if (!aL.lIlllIlIllllI(var29.isEmpty() ? 1 : 0)) break block116;
                        if (!aL.lIlllIlIllllI(Reachable.isInteractable((Locatable)((Locatable)var29.get(llIllllIIl[0]))) ? 1 : 0)) break block117;
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
                    var10 = TileObjects.getAll((String[])stringArray);
                    var39 = var10.stream().filter(tileObject -> {
                        String[] stringArray = new String[llIllllIIl[1]];
                        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[257]];
                        return tileObject.hasAction(stringArray);
                    }).collect(Collectors.toList());
                    if (aL.lIlllIlIllllI(var39.isEmpty() ? 1 : 0)) {
                        ((TileObject)var39.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[136]]);
                        Time.sleepTicks((int)llIllllIIl[2]);
                        0;
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
                    0;
                }
                String[] stringArray53 = new String[llIllllIIl[1]];
                stringArray53[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[144]];
                var10 = TileObjects.getAll((String[])stringArray53);
                var39 = var10.stream().filter(tileObject -> {
                    String[] stringArray = new String[llIllllIIl[1]];
                    stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[256]];
                    return tileObject.hasAction(stringArray);
                }).collect(Collectors.toList());
                if (aL.lIlllIlIllllI(var39.isEmpty() ? 1 : 0)) {
                    ((TileObject)var39.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[145]]);
                    Time.sleepTicks((int)llIllllIIl[15]);
                    0;
                }
            }
            if (aL.lIlllIlIlllII(Reachable.isInteractable((Locatable)((Locatable)var29.get(llIllllIIl[0]))) ? 1 : 0)) {
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[146]];
                ((TileObject)var29.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[147]]);
                Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[14]));
                0;
            }
        }
        String[] stringArray = new String[llIllllIIl[1]];
        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[148]];
        if (aL.lIlllIllIIIIl(TileObjects.getNearest((String[])stringArray))) {
            block102: {
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[149]];
                System.out.println(llIlllIlII[llIllllIIl[150]]);
                var56 = new ArrayList();
                long var29 = System.currentTimeMillis();
                do {
                    WorldPoint var5;
                    Object var16;
                    List<WorldPoint> var43;
                    int var34;
                    int var24;
                    List<WorldPoint> var46;
                    TileObject var21;
                    String[] stringArray54 = new String[llIllllIIl[1]];
                    stringArray54[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[151]];
                    if (!aL.lIlllIlIllllI(TileObjects.getAll((String[])stringArray54).isEmpty() ? 1 : 0) || !aL.lIlllIllIlIIl(Game.getState(), GameState.LOGGED_IN) || !aL.lIlllIlIllllI(AccBuilderSotf.d ? 1 : 0)) break block102;
                    int var39 = llIllllIIl[0];
                    if (aL.lIlllIlIlllII(var56.isEmpty() ? 1 : 0)) {
                        Time.sleepTicks((int)llIllllIIl[15]);
                        0;
                        System.out.println(llIlllIlII[llIllllIIl[152]]);
                        var56 = TileObjects.getAll(tileObject -> {
                            boolean bl;
                            if (aL.lIlllIllIlIII(tileObject.getId(), llIllllIIl[255])) {
                                bl = llIllllIIl[1];
                                0;
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
                        var21 = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (aL.lIlllIlIlllII(tileObject.getName().contains(llIlllIlII[llIllllIIl[253]]) ? 1 : 0)) {
                                String[] stringArray = new String[llIllllIIl[1]];
                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[254]];
                                if (aL.lIlllIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llIllllIIl[1];
                                    0;
                                    if (((0xF1 ^ 0xC6) & ~(0x1E ^ 0x29)) == 0) return n2 != 0;
                                    return false;
                                }
                            }
                            n2 = llIllllIIl[0];
                            return n2 != 0;
                        });
                        if (aL.lIlllIllIIIIl(var21) && aL.lIlllIlIlllll(var21.getWorldLocation().getY(), nR.getY() + llIllllIIl[17])) {
                            var39 = llIllllIIl[1];
                        }
                    }
                    System.out.println("Version: " + (var39 != 0));
                    if (aL.lIlllIlIllllI(var39)) {
                        if (aL.lIlllIllIIIIl(nR) && aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[17])) {
                            var21 = var56.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
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
                            var46 = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + var46.size());
                            var24 = llIllllIIl[0];
                            var34 = llIllllIIl[0];
                            while (aL.lIlllIlIlllIl(var34, var46.size())) {
                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[155]];
                                var43 = aL.a(var46.get(var34), nR.getY() - llIllllIIl[17], (List<WorldPoint>)var21);
                                if (aL.lIlllIlIllllI(var43.isEmpty() ? 1 : 0)) {
                                    System.out.println(llIlllIlII[llIllllIIl[156]]);
                                    var16 = var43.iterator();
                                    while (aL.lIlllIlIlllII(var16.hasNext() ? 1 : 0)) {
                                        var5 = var16.next();
                                        System.out.println("(" + var5.getX() + ", " + var5.getY() + ", " + var5.getPlane() + ")");
                                        0;
                                        if ((0x97 ^ 0xB6 ^ (0x7A ^ 0x5F)) != 3) continue;
                                        return;
                                    }
                                    var24 = llIllllIIl[1];
                                    while (aL.lIlllIlIlllII(var24) && aL.lIlllIlIllllI(var43.isEmpty() ? 1 : 0)) {
                                        if (aL.lIlllIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var43.get(llIllllIIl[0])) ? 1 : 0)) {
                                            if (aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[11])) {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[157]];
                                                e.c(var43.get(llIllllIIl[0]));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[11])) {
                                                        bl = llIllllIIl[1];
                                                        0;
                                                        if (1 <= 0) {
                                                            return false;
                                                        }
                                                    } else {
                                                        bl = llIllllIIl[0];
                                                    }
                                                    return bl;
                                                }, (int)e.c(llIllllIIl[158], llIllllIIl[159]));
                                                0;
                                                Time.sleepTicks((int)llIllllIIl[2]);
                                                0;
                                                0;
                                                if (2 < -1) {
                                                    return;
                                                }
                                            } else {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[160]];
                                                String[] stringArray56 = new String[llIllllIIl[1]];
                                                stringArray56[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[161]];
                                                var16 = TileObjects.getAt((WorldPoint)var43.get(llIllllIIl[0]), (String[])stringArray56);
                                                if (aL.lIlllIlIllllI(var16.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + var16.size());
                                                    ((TileObject)var16.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[162]]);
                                                    Time.sleepTicks((int)llIllllIIl[2]);
                                                    0;
                                                }
                                                if (aL.lIlllIlIlllII(var16.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(var43.get(llIllllIIl[0])));
                                                    Game.logout();
                                                    Time.sleepTicks((int)llIllllIIl[2]);
                                                    0;
                                                    0;
                                                    if (-(0x78 ^ 0x60 ^ (7 ^ 0x1A)) < 0) break;
                                                    return;
                                                }
                                            }
                                        }
                                        if (aL.lIlllIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var43.get(llIllllIIl[0])) ? 1 : 0)) {
                                            System.out.println(llIlllIlII[llIllllIIl[163]]);
                                            var43.remove(llIllllIIl[0]);
                                            0;
                                            Time.sleepTicks((int)llIllllIIl[2]);
                                            0;
                                        }
                                        Time.sleepTicks((int)llIllllIIl[1]);
                                        0;
                                        0;
                                        
                                        return;
                                    }
                                    if (!aL.lIlllIllIIlll(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println(llIlllIlII[llIllllIIl[164]]);
                                    0;
                                    if (2 == 2) break;
                                    return;
                                }
                                ++var34;
                                0;
                                if (((6 ^ 0x38) & ~(0x88 ^ 0xB6)) == 0) continue;
                                return;
                            }
                            if (aL.lIlllIlIllllI(var24)) {
                                System.out.println(llIlllIlII[llIllllIIl[165]]);
                            }
                            System.out.println(var56.size());
                        }
                        if (aL.lIlllIllIIIIl(nR) && aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[17])) {
                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[166]];
                            String[] stringArray57 = new String[llIllllIIl[1]];
                            stringArray57[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[167]];
                            TileObjects.getNearest((String[])stringArray57).interact(llIlllIlII[llIllllIIl[168]]);
                            Time.sleepTicks((int)llIllllIIl[11]);
                            0;
                        }
                    }
                    if (aL.lIlllIlIlllII(var39)) {
                        if (aL.lIlllIllIIIIl(nR) && aL.lIlllIlIlllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[17])) {
                            var21 = var56.stream().map(tileObject -> tileObject.getWorldLocation()).collect(Collectors.toList());
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
                            var46 = Arrays.asList(worldPointArray);
                            System.out.println("Start tiles: " + var46.size());
                            var24 = llIllllIIl[0];
                            var34 = llIllllIIl[0];
                            while (aL.lIlllIlIlllIl(var34, var46.size())) {
                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[169]];
                                var43 = aL.a(var46.get(var34), nR.getY() + llIllllIIl[17], (List<WorldPoint>)var21);
                                if (aL.lIlllIlIllllI(var43.isEmpty() ? 1 : 0)) {
                                    System.out.println(llIlllIlII[llIllllIIl[170]]);
                                    var16 = var43.iterator();
                                    while (aL.lIlllIlIlllII(var16.hasNext() ? 1 : 0)) {
                                        var5 = var16.next();
                                        System.out.println("(" + var5.getX() + ", " + var5.getY() + ", " + var5.getPlane() + ")");
                                        0;
                                        
                                        return;
                                    }
                                    var24 = llIllllIIl[1];
                                    while (aL.lIlllIlIlllII(var24) && aL.lIlllIlIllllI(var43.isEmpty() ? 1 : 0)) {
                                        if (aL.lIlllIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var43.get(llIllllIIl[0])) ? 1 : 0)) {
                                            if (aL.lIlllIlIlllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[11])) {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[171]];
                                                e.c(var43.get(llIllllIIl[0]));
                                                Time.sleepUntil(() -> {
                                                    boolean bl;
                                                    if (aL.lIlllIlIlllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[11])) {
                                                        bl = llIllllIIl[1];
                                                        0;
                                                        if (3 < 0) {
                                                            return false;
                                                        }
                                                    } else {
                                                        bl = llIllllIIl[0];
                                                    }
                                                    return bl;
                                                }, (int)e.c(llIllllIIl[158], llIllllIIl[159]));
                                                0;
                                                Time.sleepTicks((int)llIllllIIl[2]);
                                                0;
                                                0;
                                                if (3 < 1) {
                                                    return;
                                                }
                                            } else {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[172]];
                                                String[] stringArray58 = new String[llIllllIIl[1]];
                                                stringArray58[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[173]];
                                                var16 = TileObjects.getAt((WorldPoint)var43.get(llIllllIIl[0]), (String[])stringArray58);
                                                if (aL.lIlllIlIllllI(var16.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog size: " + var16.size());
                                                    ((TileObject)var16.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[174]]);
                                                    Time.sleepTicks((int)llIllllIIl[2]);
                                                    0;
                                                }
                                                if (aL.lIlllIlIlllII(var16.isEmpty() ? 1 : 0)) {
                                                    System.out.println("Bog is null at: " + String.valueOf(var43.get(llIllllIIl[0])));
                                                    Game.logout();
                                                    Time.sleepTicks((int)llIllllIIl[2]);
                                                    0;
                                                    0;
                                                    if ((143 + 13 - 42 + 84 ^ 24 + 166 - 111 + 115) >= 0) break;
                                                    return;
                                                }
                                                Time.sleepTicks((int)llIllllIIl[2]);
                                                0;
                                            }
                                        }
                                        if (aL.lIlllIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var43.get(llIllllIIl[0])) ? 1 : 0)) {
                                            System.out.println(llIlllIlII[llIllllIIl[175]]);
                                            var43.remove(llIllllIIl[0]);
                                            0;
                                            Time.sleepTicks((int)llIllllIIl[2]);
                                            0;
                                        }
                                        System.out.println("Path size lefT: " + var43.size());
                                        Time.sleepTicks((int)llIllllIIl[1]);
                                        0;
                                        0;
                                        if (-(0x79 ^ 0x5D ^ (0x9B ^ 0xBB)) < 0) continue;
                                        return;
                                    }
                                    if (!aL.lIlllIllIIlll(Game.getState(), GameState.LOGGED_IN)) break;
                                    System.out.println(llIlllIlII[llIllllIIl[176]]);
                                    0;
                                    if (((0x5D ^ 1) & ~(0xCD ^ 0x91)) < 1) break;
                                    return;
                                }
                                ++var34;
                                0;
                                if ((0xAB ^ 0xB8 ^ (0x52 ^ 0x45)) >= 0) continue;
                                return;
                            }
                            if (aL.lIlllIlIllllI(var24)) {
                                System.out.println(llIlllIlII[llIllllIIl[177]]);
                            }
                            System.out.println(var56.size());
                        }
                        if (aL.lIlllIllIIIIl(nR) && aL.lIlllIllIIlII(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[17])) {
                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[178]];
                            String[] stringArray59 = new String[llIllllIIl[1]];
                            stringArray59[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[179]];
                            TileObjects.getNearest((String[])stringArray59).interact(llIlllIlII[llIllllIIl[180]]);
                            Time.sleepTicks((int)llIllllIIl[11]);
                            0;
                        }
                    }
                    if (aL.lIlllIllIIIll(aL.lIlllIllIIlIl(System.currentTimeMillis(), var29 + 45000L))) {
                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[181]];
                        Game.logout();
                        var29 = System.currentTimeMillis();
                    }
                    0;
                } while (-3 < 0);
                return;
            }
            int[] nArray = new int[llIllllIIl[1]];
            nArray[aL.llIllllIIl[0]] = llIllllIIl[9];
            if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));
                0;
                mV = llIllllIIl[0];
            }
        }
        if (aL.lIlllIlIllllI(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIlIllllI(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIllIlIlI(aL.lIlllIllIIllI(e.w(), 25.0))) {
            int[] nArray = new int[llIllllIIl[1]];
            nArray[aL.llIllllIIl[0]] = llIllllIIl[9];
            if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));
                0;
                mV = llIllllIIl[0];
            }
        }
    }

    private static int d(int n2, int n3) {
        return Math.abs(n2 - n3);
    }

    public static void Q() {
        d var26;
        block19: {
            block18: {
                block17: {
                    block16: {
                        int[] nArray = new int[llIllllIIl[1]];
                        nArray[aL.llIllllIIl[0]] = llIllllIIl[8];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llIllllIIl[8], llIllllIIl[1], e.c(llIllllIIl[228], llIllllIIl[229]));
                            bv.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[llIllllIIl[1]];
                        nArray2[aL.llIllllIIl[0]] = llIllllIIl[230];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var26 = new d(llIllllIIl[230], llIllllIIl[2], llIllllIIl[231]);
                            bv.add(var26);
                            0;
                        }
                        int[] nArray3 = new int[llIllllIIl[1]];
                        nArray3[aL.llIllllIIl[0]] = llIllllIIl[232];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var26 = new d(llIllllIIl[232], llIllllIIl[18], llIllllIIl[233]);
                            bv.add(var26);
                            0;
                        }
                        int[] nArray4 = new int[llIllllIIl[1]];
                        nArray4[aL.llIllllIIl[0]] = llIllllIIl[22];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var26 = new d(llIllllIIl[22], llIllllIIl[1], e.c(llIllllIIl[234], llIllllIIl[235]));
                            bv.add(var26);
                            0;
                        }
                        int[] nArray5 = new int[llIllllIIl[1]];
                        nArray5[aL.llIllllIIl[0]] = llIllllIIl[23];
                        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            var26 = new d(llIllllIIl[23], llIllllIIl[1], e.c(llIllllIIl[234], llIllllIIl[235]));
                            bv.add(var26);
                            0;
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
                    var26 = new d(llIllllIIl[185], llIllllIIl[236], e.c(llIllllIIl[237], llIllllIIl[238]));
                    bv.add(var26);
                    0;
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
            var26 = new d(llIllllIIl[9], llIllllIIl[4], e.c(llIllllIIl[159], llIllllIIl[239]));
            bv.add(var26);
            0;
        }
        int[] nArray = new int[llIllllIIl[1]];
        nArray[aL.llIllllIIl[0]] = llIllllIIl[240];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var26 = new d(llIllllIIl[240], llIllllIIl[18], llIllllIIl[241]);
            bv.add(var26);
            0;
        }
        int[] nArray11 = new int[llIllllIIl[1]];
        nArray11[aL.llIllllIIl[0]] = llIllllIIl[242];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray11) ? 1 : 0)) {
            var26 = new d(mU, llIllllIIl[59], llIllllIIl[243]);
            bv.add(var26);
            0;
        }
        int[] nArray12 = new int[llIllllIIl[1]];
        nArray12[aL.llIllllIIl[0]] = llIllllIIl[244];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray12) ? 1 : 0)) {
            var26 = new d(llIllllIIl[244], llIllllIIl[1], llIllllIIl[245]);
            bv.add(var26);
            0;
        }
        int[] nArray13 = new int[llIllllIIl[1]];
        nArray13[aL.llIllllIIl[0]] = llIllllIIl[7];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
            var26 = new d(llIllllIIl[7], llIllllIIl[1], e.c(llIllllIIl[246], llIllllIIl[247]));
            bv.add(var26);
            0;
        }
        int[] nArray14 = new int[llIllllIIl[1]];
        nArray14[aL.llIllllIIl[0]] = llIllllIIl[248];
        if (aL.lIlllIlIllllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
            var26 = new d(llIllllIIl[248], llIllllIIl[36], j.cf);
            bv.add(var26);
            0;
        }
    }

    private static String lIlllIIllllll(String var58, String var50) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var50.getBytes(StandardCharsets.UTF_8)), llIllllIIl[16]), "DES");
            Cipher var38 = Cipher.getInstance("DES");
            var38.init(llIllllIIl[2], var4);
            return new String(var38.doFinal(Base64.getDecoder().decode(var58.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
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
        aM var12;
        ArrayList<WorldPoint> var49 = new ArrayList<WorldPoint>();
        while (aL.lIlllIllIIIIl(var12)) {
            var49.add(var12.nT);
            0;
            var12 = var12.pV;
            0;
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
                                        TileObject var13;
                                        if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllllIIl[3])) {
                                            a.a();
                                            Time.sleepTicks((int)llIllllIIl[10]);
                                            0;
                                        }
                                        if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nQ), llIllllIIl[28]) && aL.lIlllIllIIIIl(var13 = TileObjects.getNearest(tileObject -> {
                                            int n2;
                                            if (aL.lIlllIlIlllII(tileObject.getName().equalsIgnoreCase(llIlllIlII[llIllllIIl[251]]) ? 1 : 0)) {
                                                String[] stringArray = new String[llIllllIIl[1]];
                                                stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[252]];
                                                if (aL.lIlllIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                                    n2 = llIllllIIl[1];
                                                    0;
                                                    if (null == null) return n2 != 0;
                                                    return false;
                                                }
                                            }
                                            n2 = llIllllIIl[0];
                                            return n2 != 0;
                                        }))) {
                                            var13.interact(llIlllIlII[llIllllIIl[183]]);
                                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIllllIIl[158]);
                                            0;
                                        }
                                        if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[24])) {
                                            int[] nArray = new int[llIllllIIl[1]];
                                            nArray[aL.llIllllIIl[0]] = llIllllIIl[19];
                                            TileObjects.getNearest((int[])nArray).interact(llIlllIlII[llIllllIIl[184]]);
                                            Time.sleepTicks((int)llIllllIIl[2]);
                                            0;
                                        }
                                    }
                                    if (!aL.lIlllIlIlllII(Bank.isOpen() ? 1 : 0)) break block25;
                                    if (aL.lIlllIllIIIll(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIllllIIl[11]);
                                        0;
                                    }
                                    if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllllIIl[3]) && aL.lIlllIllIIIll(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)llIllllIIl[2]);
                                        0;
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
                    0;
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
                    0;
                }
            }
            if (aL.lIlllIlIllllI(Equipment.contains((int[])f.bk) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains((int[])f.bk) ? 1 : 0)) {
                a.b(f.bk, llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);
                0;
            }
            if (aL.lIlllIlIllllI(Equipment.contains((int[])f.aW) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains((int[])f.aW) ? 1 : 0)) {
                a.b(f.aW, llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);
                0;
            }
            int[] nArray11 = new int[llIllllIIl[1]];
            nArray11[aL.llIllllIIl[0]] = llIllllIIl[7];
            if (aL.lIlllIlIllllI(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                int[] nArray12 = new int[llIllllIIl[1]];
                nArray12[aL.llIllllIIl[0]] = llIllllIIl[7];
                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                    a.a(llIllllIIl[7], llIllllIIl[1]);
                    Time.sleepTicks((int)llIllllIIl[1]);
                    0;
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
                    0;
                }
            }
            int[] nArray15 = new int[llIllllIIl[1]];
            nArray15[aL.llIllllIIl[0]] = llIllllIIl[21];
            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                a.a(llIllllIIl[21], llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);
                0;
            }
            int[] nArray16 = new int[llIllllIIl[1]];
            nArray16[aL.llIllllIIl[0]] = llIllllIIl[22];
            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                a.a(llIllllIIl[22], llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);
                0;
            }
            int[] nArray17 = new int[llIllllIIl[1]];
            nArray17[aL.llIllllIIl[0]] = llIllllIIl[23];
            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                a.a(llIllllIIl[23], llIllllIIl[1]);
                Time.sleepTicks((int)llIllllIIl[1]);
                0;
            }
            if (aL.lIlllIlIlllIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                int[] nArray18 = new int[llIllllIIl[1]];
                nArray18[aL.llIllllIIl[0]] = nJ;
                if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                    a.a(nJ, llIllllIIl[10]);
                    Time.sleepTicks((int)llIllllIIl[1]);
                    0;
                }
            }
            int[] nArray19 = new int[llIllllIIl[1]];
            nArray19[aL.llIllllIIl[0]] = llIllllIIl[9];
            if (aL.lIlllIlIllllI(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                Bank.withdrawAll((int)llIllllIIl[9], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                Time.sleepTicks((int)llIllllIIl[1]);
                0;
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

    private static String lIlllIlIIIIII(String var40, String var53) {
        try {
            SecretKeySpec var48 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var53.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var30 = Cipher.getInstance("Blowfish");
            var30.init(llIllllIIl[2], var48);
            return new String(var30.doFinal(Base64.getDecoder().decode(var40.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
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
                    Predicate<Item> var37 = item -> item.getName().toLowerCase().contains(llIlllIlII[llIllllIIl[274]]);
                    if (aL.lIlllIlIlllII(Inventory.contains(var37) ? 1 : 0)) {
                        Inventory.getFirst(var37).interact(llIlllIlII[llIllllIIl[2]]);
                        Time.sleepTicks((int)llIllllIIl[1]);
                        0;
                    }
                    if (aL.lIlllIlIllllI(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIlIllllI(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && aL.lIlllIlIllllI(aL.an() ? 1 : 0) && aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(b.I), llIllllIIl[3])) {
                        Movement.walkTo((WorldPoint)b.I);
                        0;
                        Time.sleepTicks((int)llIllllIIl[1]);
                        0;
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
                            0;
                            int[] nArray2 = new int[llIllllIIl[1]];
                            nArray2[aL.llIllllIIl[0]] = llIllllIIl[9];
                            Inventory.getFirst((int[])nArray2).interact(llIlllIlII[llIllllIIl[10]]);
                            Time.sleepUntil(() -> nL.contains(Players.getLocal().getWorldLocation()), (int)llIllllIIl[12]);
                            0;
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
                                0;
                            }
                            String[] stringArray3 = new String[llIllllIIl[1]];
                            stringArray3[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[16]];
                            if (aL.lIlllIllIIIlI(NPCs.getNearest((String[])stringArray3)) && aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[14])) {
                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[17]];
                                Movement.walkTo((WorldPoint)D.fa);
                                0;
                                Time.sleepTicks((int)llIllllIIl[1]);
                                0;
                            }
                        }
                        if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[14])) {
                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[18]];
                            if (aL.lIlllIlIllllI(Bank.isOpen() ? 1 : 0)) {
                                int[] nArray = new int[llIllllIIl[1]];
                                nArray[aL.llIllllIIl[0]] = llIllllIIl[19];
                                TileObjects.getNearest((int[])nArray).interact(llIlllIlII[llIllllIIl[20]]);
                                Time.sleepTicks((int)llIllllIIl[2]);
                                0;
                            }
                            if (aL.lIlllIlIlllII(Bank.isOpen() ? 1 : 0) && aL.lIlllIllIIIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIllllIIl[1]);
                                0;
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
                            0;
                        }
                        if (aL.lIlllIlIlllll(Movement.getRunEnergy(), llIllllIIl[29]) && aL.lIlllIlIllllI(Movement.isRunEnabled() ? 1 : 0)) {
                            Movement.toggleRun();
                        }
                        aL.t(nN);
                        Predicate<Item> var22 = item -> item.getName().toLowerCase().contains(llIlllIlII[llIllllIIl[273]]);
                        if (aL.lIlllIlIlllII(Inventory.contains(var22) ? 1 : 0)) {
                            Inventory.getFirst(var22).interact(llIlllIlII[llIllllIIl[30]]);
                            Time.sleepTicks((int)llIllllIIl[1]);
                            0;
                        }
                        if (aL.lIlllIlIlllII(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray5 = new String[llIllllIIl[1]];
                            stringArray5[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[31]];
                            if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray5) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains(var22) ? 1 : 0)) {
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
                                        0;
                                        Time.sleepTicks((int)llIllllIIl[1]);
                                        0;
                                    }
                                    if (aL.lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nP), llIllllIIl[16])) {
                                        Time.sleepTicks((int)llIllllIIl[2]);
                                        0;
                                        if (aL.lIlllIlIllllI(Dialog.isOpen() ? 1 : 0) && aL.lIlllIlIllllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                            String[] stringArray6 = new String[llIllllIIl[1]];
                                            stringArray6[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[33]];
                                            if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray6) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains(var22) ? 1 : 0) && aL.lIlllIlIlllII(Widgets.get((int)llIllllIIl[34]).isEmpty() ? 1 : 0) && aL.lIlllIlIllllI(Vars.getBit((int)llIllllIIl[35]))) {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[36]];
                                                int[] nArray = new int[llIllllIIl[1]];
                                                nArray[aL.llIllllIIl[0]] = llIllllIIl[37];
                                                llllllllllllllllllIIIIIIlIIIllIl2 = NPCs.getNearest((int[])nArray);
                                                if (aL.lIlllIllIIIIl(llllllllllllllllllIIIIIIlIIIllIl2) && aL.lIlllIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                                                    llllllllllllllllllIIIIIIlIIIllIl2.interact(llIlllIlII[llIllllIIl[38]]);
                                                    Time.sleepTicks((int)llIllllIIl[10]);
                                                    0;
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
                            if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray8) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains(var22) ? 1 : 0)) {
                                if (aL.lIlllIllIIlII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), nK)) {
                                    if (aL.lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nI), llIllllIIl[16])) {
                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[41]];
                                        if (aL.lIlllIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                            Dialog.close();
                                        }
                                        Movement.walkTo((WorldPoint)nI);
                                        0;
                                        Time.sleepTicks((int)llIllllIIl[1]);
                                        0;
                                    }
                                    Time.sleepTicks((int)llIllllIIl[2]);
                                    0;
                                    if (aL.lIlllIlIllllI(Dialog.isOpen() ? 1 : 0) && aL.lIlllIlIllllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                        String[] stringArray9 = new String[llIllllIIl[1]];
                                        stringArray9[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[29]];
                                        if (aL.lIlllIlIllllI(Inventory.contains((String[])stringArray9) ? 1 : 0) && aL.lIlllIlIllllI(Inventory.contains(var22) ? 1 : 0)) {
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
                                                    0;
                                                }
                                                g.a(new String[llIllllIIl[0]]);
                                                Time.sleepTicks((int)llIllllIIl[2]);
                                                0;
                                            }
                                        }
                                    }
                                }
                                g.a(new String[llIllllIIl[0]]);
                            }
                        }
                        try {
                            aL.gc();
                            0;
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
                    0;
                }
                if (aL.lIlllIlIlllII(nM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[47]];
                    Movement.walkTo((BankLocation)BankLocation.BURGH_DE_ROTT_BANK);
                    0;
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
                    0;
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
                    0;
                    if ((0x2F ^ 0x40 ^ (0x17 ^ 0x7C)) >= 0) return n2 != 0;
                    return ((135 + 222 - 200 + 74 ^ 41 + 139 - 160 + 176) & (0x5A ^ 0x56 ^ (0x59 ^ 0x76) ^ -1)) != 0;
                }
            }
        }
        n2 = llIllllIIl[0];
        return n2 != 0;
    }

    public static void t(String string) {
        Widget var1;
        String[] stringArray = new String[llIllllIIl[1]];
        stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[206]];
        if (aL.lIlllIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            mV = llIllllIIl[0];
            AccBuilderSotf.c = llIlllIlII[llIllllIIl[207]];
            String[] stringArray2 = new String[llIllllIIl[1]];
            stringArray2[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[208]];
            Inventory.getFirst((String[])stringArray2).interact(llIlllIlII[llIllllIIl[209]]);
            Time.sleepTicks((int)llIllllIIl[10]);
            0;
            if (!aL.lIlllIllIIIlI(Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15])) || aL.lIlllIlIllllI(Widgets.get((int)llIllllIIl[210]).isEmpty() ? 1 : 0)) {
                String var54;
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[211]];
                if (aL.lIlllIlIlllII(var54.contains(llIlllIlII[llIllllIIl[212]]) ? 1 : 0) && aL.lIlllIllIIIIl(var1 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);
                    0;
                    var1.getChild(llIllllIIl[3]).interact(llIlllIlII[llIllllIIl[213]]);
                    Time.sleepTicks((int)llIllllIIl[1]);
                    0;
                }
                if (aL.lIlllIlIlllII(var54.contains(llIlllIlII[llIllllIIl[214]]) ? 1 : 0) && aL.lIlllIllIIIIl(var1 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);
                    0;
                    var1.getChild(llIllllIIl[1]).interact(llIlllIlII[llIllllIIl[215]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));
                    0;
                }
                if (aL.lIlllIlIlllII(var54.contains(llIlllIlII[llIllllIIl[216]]) ? 1 : 0) && aL.lIlllIllIIIIl(var1 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);
                    0;
                    var1.getChild(llIllllIIl[0]).interact(llIlllIlII[llIllllIIl[217]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));
                    0;
                }
                if (aL.lIlllIlIlllII(var54.contains(llIlllIlII[llIllllIIl[218]]) ? 1 : 0) && aL.lIlllIllIIIIl(var1 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);
                    0;
                    var1.getChild(llIllllIIl[2]).interact(llIlllIlII[llIllllIIl[219]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));
                    0;
                }
                if (aL.lIlllIlIlllII(var54.contains(llIlllIlII[llIllllIIl[220]]) ? 1 : 0) && aL.lIlllIllIIIIl(var1 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);
                    0;
                    var1.getChild(llIllllIIl[10]).interact(llIlllIlII[llIllllIIl[221]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));
                    0;
                }
                if (aL.lIlllIlIlllII(var54.contains(llIlllIlII[llIllllIIl[222]]) ? 1 : 0) && aL.lIlllIllIIIIl(var1 = Widgets.get((int)llIllllIIl[210], (int)llIllllIIl[15]))) {
                    Time.sleepTicks((int)llIllllIIl[2]);
                    0;
                    var1.getChild(llIllllIIl[11]).interact(llIlllIlII[llIllllIIl[223]]);
                    Time.sleepTicks((int)e.c(llIllllIIl[10], llIllllIIl[11]));
                    0;
                }
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[224]];
                var1 = Widgets.fromId((int)llIllllIIl[225]);
                if (aL.lIlllIllIIIIl(var1) && aL.lIlllIlIlllII(var1.isVisible() ? 1 : 0)) {
                    Time.sleepTick();
                    0;
                    var1.interact(llIlllIlII[llIllllIIl[226]]);
                    Time.sleepTicks((int)llIllllIIl[2]);
                    0;
                }
            }
        }
        if (aL.lIlllIlIlllII(Inventory.contains(var1 = item -> item.getName().toLowerCase().contains(llIlllIlII[llIllllIIl[250]])) ? 1 : 0)) {
            Inventory.getFirst(var1).interact(llIlllIlII[llIllllIIl[227]]);
            Time.sleepTicks((int)llIllllIIl[1]);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static List<WorldPoint> a(WorldPoint worldPoint, int n2, List<WorldPoint> list) {
        void var27;
        PriorityQueue<aM> priorityQueue = new PriorityQueue<aM>();
        ArrayList arrayList = new ArrayList();
        priorityQueue.add(new aM(worldPoint, null, llIllllIIl[0], aL.d(worldPoint.getY(), n2)));
        0;
        while (aL.lIlllIlIllllI(var27.isEmpty() ? 1 : 0)) {
            void var57;
            void var18;
            void var60;
            aM var31 = (aM)var27.poll();
            if (aL.lIlllIllIlIII(var31.nT.getY(), (int)var60)) {
                return aL.a(var31);
            }
            var18.add(var31);
            0;
            Iterator<aM> var59 = aL.a(var31, (List<WorldPoint>)var57).iterator();
            while (aL.lIlllIlIlllII(var59.hasNext() ? 1 : 0)) {
                aM var17 = var59.next();
                int var44 = var31.nV + llIllllIIl[1];
                if (aL.lIlllIlIlllII(aL.b(var17, (List<aM>)var18) ? 1 : 0)) {
                    0;
                    if (((142 + 2 - 26 + 28 ^ 107 + 179 - 277 + 184) & (42 + 202 - 28 + 25 ^ 106 + 27 - 113 + 142 ^ -1)) <= 2) continue;
                    return null;
                }
                if (!aL.lIlllIlIlllII(aL.a(var17, (PriorityQueue<aM>)var27) ? 1 : 0) || aL.lIlllIlIlllIl(var44, var17.nV)) {
                    var27.add(var17);
                    0;
                }
                0;
                if ((0xD0 ^ 0x82 ^ (0x55 ^ 2)) != 0) continue;
                return null;
            }
            0;
            if (1 < (0x6F ^ 0xC ^ (0x33 ^ 0x54))) continue;
            return null;
        }
        return Collections.emptyList();
    }

    private static void lIlllIlIllIll() {
        llIllllIIl = new int[292];
        aL.llIllllIIl[0] = (0xD2 ^ 0xC6) & ~(3 ^ 0x17);
        aL.llIllllIIl[1] = 1;
        aL.llIllllIIl[2] = 2;
        aL.llIllllIIl[3] = 0xDD ^ 0xBE ^ (0x29 ^ 0x4D);
        aL.llIllllIIl[4] = 0x57 ^ 0x48 ^ 1;
        aL.llIllllIIl[5] = 0xFFFFCDEB & 0x369D;
        aL.llIllllIIl[6] = -(0xFFFFF6B3 & 0x4FFF) & (0xFFFFEFFE & 0x7FF7);
        aL.llIllllIIl[7] = -(44 + 97 - 103 + 167) & (0xFFFFFFDF & 0x52FD);
        aL.llIllllIIl[8] = 0xFFFFD477 & 0x2FBF;
        aL.llIllllIIl[9] = 0xFFFFFDBF & 0x4EE3;
        aL.llIllllIIl[10] = 3;
        aL.llIllllIIl[11] = 0xAB ^ 0x95 ^ (0x63 ^ 0x59);
        aL.llIllllIIl[12] = 0xFFFFA977 & 0x77BC;
        aL.llIllllIIl[13] = 0x7E ^ 0x1A;
        aL.llIllllIIl[14] = 0x91 ^ 0x94;
        aL.llIllllIIl[15] = 0 ^ 0xB ^ (0x4C ^ 0x41);
        aL.llIllllIIl[16] = 0x25 ^ 0x2D;
        aL.llIllllIIl[17] = 0x75 ^ 0x7C;
        aL.llIllllIIl[18] = 0x2F ^ 0x25;
        aL.llIllllIIl[19] = 0xFFFFF9F7 & 0x37DF;
        aL.llIllllIIl[20] = 0x6E ^ 0x47 ^ (0x66 ^ 0x44);
        aL.llIllllIIl[21] = 0xFFFFBBF2 & 0x47BF;
        aL.llIllllIIl[22] = 0xFFFF95C7 & 0x6F7F;
        aL.llIllllIIl[23] = 0xFFFFDFBB & 0x296F;
        aL.llIllllIIl[24] = 53 + 97 - 91 + 129 ^ 168 + 93 - 234 + 149;
        aL.llIllllIIl[25] = 0x5B ^ 0x56;
        aL.llIllllIIl[26] = 0x30 ^ 0x3E;
        aL.llIllllIIl[27] = 0x57 ^ 0x65;
        aL.llIllllIIl[28] = 0x7F ^ 0x70;
        aL.llIllllIIl[29] = 68 + 46 - 28 + 86 ^ 53 + 96 - 54 + 86;
        aL.llIllllIIl[30] = 0x6F ^ 0x7F;
        aL.llIllllIIl[31] = 42 + 137 - 131 + 118 ^ 93 + 96 - 121 + 115;
        aL.llIllllIIl[32] = 0x47 ^ 0x2C ^ (1 ^ 0x78);
        aL.llIllllIIl[33] = 0xD4 ^ 0xC7;
        aL.llIllllIIl[34] = -(0xFFFFB8FD & 0x7F87) & (0xFFFFBFFF & 0x79CD);
        aL.llIllllIIl[35] = -(0xD0 ^ 0x91) & (0xFFFFBEFF & 0x5B7F);
        aL.llIllllIIl[36] = 0xA4 ^ 0xB0;
        aL.llIllllIIl[37] = -(0xFFFF9BFA & 0x7DA7) & (0xFFFFFFFF & 0x1FBF);
        aL.llIllllIIl[38] = 144 + 19 - 110 + 137 ^ 79 + 114 - 136 + 114;
        aL.llIllllIIl[39] = 0x34 ^ 4 ^ (0xA3 ^ 0x85);
        aL.llIllllIIl[40] = 0x98 ^ 0x8F;
        aL.llIllllIIl[41] = 130 + 101 - 57 + 2 ^ 16 + 14 - -81 + 57;
        aL.llIllllIIl[42] = 0x56 ^ 0x4C;
        aL.llIllllIIl[43] = -(0xFFFFFE93 & 0x29FD) & (0xFFFFFEFB & 0x2FBD);
        aL.llIllllIIl[44] = 56 + 100 - 37 + 101 ^ 117 + 5 - -1 + 76;
        aL.llIllllIIl[45] = 0x8D ^ 0x91;
        aL.llIllllIIl[46] = 0x6B ^ 0x76;
        aL.llIllllIIl[47] = 0x5A ^ 0x13 ^ (0xDD ^ 0x8B);
        aL.llIllllIIl[48] = 0xE7 ^ 0xC7;
        aL.llIllllIIl[49] = 0x1A ^ 0x3B;
        aL.llIllllIIl[50] = 0x31 ^ 0x13;
        aL.llIllllIIl[51] = -(0xFFFFF4C3 & 0x6B3D) & (0xFFFFEBAF & 0x7FDF);
        aL.llIllllIIl[52] = 31 + 126 - 0 + 16 ^ 58 + 9 - -2 + 73;
        aL.llIllllIIl[53] = 0xD8 ^ 0x90 ^ (0 ^ 0x6C);
        aL.llIllllIIl[54] = 0xFFFF86DF & 0x7B78;
        aL.llIllllIIl[55] = -(0xFFFFF7BF & 0x5A53) & (0xFFFFFFFE & 0x5FBF);
        aL.llIllllIIl[56] = 0x43 ^ 0x1B ^ (0xFB ^ 0x86);
        aL.llIllllIIl[57] = 131 + 120 - 104 + 42 ^ 123 + 148 - 129 + 13;
        aL.llIllllIIl[58] = 0x82 ^ 0xA5;
        aL.llIllllIIl[59] = 0x4F ^ 2 ^ (0x17 ^ 0x72);
        aL.llIllllIIl[60] = 0x46 ^ 0x6F;
        aL.llIllllIIl[61] = 0x94 ^ 0xBE;
        aL.llIllllIIl[62] = 0x54 ^ 0x7F;
        aL.llIllllIIl[63] = 12 + 91 - -22 + 30 ^ 120 + 112 - 131 + 82;
        aL.llIllllIIl[64] = 0x62 ^ 0x4F;
        aL.llIllllIIl[65] = -(0xFFFFB7FF & 0x792D) & (0xFFFFBF3E & 0x7FFD);
        aL.llIllllIIl[66] = -(0xFFFFE25E & 0x3FAB) & (0xFFFFBFFD & 0x765B);
        aL.llIllllIIl[67] = 2 ^ 0x2C;
        aL.llIllllIIl[68] = 0xA3 ^ 0x9F;
        aL.llIllllIIl[69] = 144 + 121 - 204 + 93 ^ 114 + 179 - 173 + 61;
        aL.llIllllIIl[70] = 0x67 ^ 0x57;
        aL.llIllllIIl[71] = 0x94 ^ 0xA5;
        aL.llIllllIIl[72] = 0x55 ^ 0x66;
        aL.llIllllIIl[73] = 0xB8 ^ 0x81 ^ (0x75 ^ 0x78);
        aL.llIllllIIl[74] = 0x35 ^ 0;
        aL.llIllllIIl[75] = 0xA2 ^ 0x94;
        aL.llIllllIIl[76] = 0x12 ^ 0 ^ (0x4E ^ 0x6B);
        aL.llIllllIIl[77] = 0xFC ^ 0xC4;
        aL.llIllllIIl[78] = 127 + 101 - 179 + 141 ^ 20 + 130 - 22 + 7;
        aL.llIllllIIl[79] = 0x63 ^ 0x4E ^ (0x3D ^ 0x2A);
        aL.llIllllIIl[80] = -1;
        aL.llIllllIIl[81] = 0xB7 ^ 0xC0 ^ (0xDB ^ 0x97);
        aL.llIllllIIl[82] = 0x82 ^ 0xBF;
        aL.llIllllIIl[83] = 0x11 ^ 0x2F;
        aL.llIllllIIl[84] = 0xF8 ^ 0x84 ^ (0xEA ^ 0xA9);
        aL.llIllllIIl[85] = 0x79 ^ 0x39;
        aL.llIllllIIl[86] = 0x22 ^ 0x63;
        aL.llIllllIIl[87] = 0x39 ^ 0x7B;
        aL.llIllllIIl[88] = 0xC1 ^ 0x82;
        aL.llIllllIIl[89] = 0xAD ^ 0xB5 ^ (0x77 ^ 0x2B);
        aL.llIllllIIl[90] = 0x51 ^ 0x62 ^ (0x67 ^ 0x11);
        aL.llIllllIIl[91] = 88 + 117 - 165 + 176 ^ 15 + 27 - -6 + 110;
        aL.llIllllIIl[92] = 0x65 ^ 0x22;
        aL.llIllllIIl[93] = 0x62 ^ 0x2A;
        aL.llIllllIIl[94] = 0x13 ^ 0x16 ^ (0x28 ^ 0x64);
        aL.llIllllIIl[95] = 34 + 109 - 46 + 106 ^ 124 + 39 - 89 + 55;
        aL.llIllllIIl[96] = 0x74 ^ 0x7A ^ (0x40 ^ 5);
        aL.llIllllIIl[97] = 9 ^ 0x74 ^ (0x4B ^ 0x7A);
        aL.llIllllIIl[98] = 0xA0 ^ 0xAC ^ (0x3C ^ 0x7D);
        aL.llIllllIIl[99] = 0xED ^ 0xA3;
        aL.llIllllIIl[100] = 0x72 ^ 0x3D;
        aL.llIllllIIl[101] = 0x62 ^ 0x32;
        aL.llIllllIIl[102] = 0x4B ^ 0xF ^ (0x97 ^ 0x82);
        aL.llIllllIIl[103] = 0x76 ^ 0x24;
        aL.llIllllIIl[104] = 0x72 ^ 0x39 ^ (0x6D ^ 0x75);
        aL.llIllllIIl[105] = 0xEE ^ 0xBD ^ (0x3A ^ 0x3D);
        aL.llIllllIIl[106] = 0x2E ^ 0x6E ^ (0x7C ^ 0x69);
        aL.llIllllIIl[107] = 0x90 ^ 0xB2 ^ (0x5E ^ 0x2A);
        aL.llIllllIIl[108] = 33 + 105 - 90 + 99 ^ 145 + 185 - 199 + 65;
        aL.llIllllIIl[109] = 0xE0 ^ 0x83 ^ (0x77 ^ 0x4C);
        aL.llIllllIIl[110] = 0x7B ^ 0x50 ^ (0x27 ^ 0x55);
        aL.llIllllIIl[111] = 0x2B ^ 0x71;
        aL.llIllllIIl[112] = 0x79 ^ 9 ^ (0xB8 ^ 0x93);
        aL.llIllllIIl[113] = 0xA ^ 0 ^ (0x46 ^ 0x10);
        aL.llIllllIIl[114] = 0xC1 ^ 0x9C;
        aL.llIllllIIl[115] = 0x76 ^ 0x32 ^ (0x8F ^ 0x95);
        aL.llIllllIIl[116] = 0xFC ^ 0xA3;
        aL.llIllllIIl[117] = 28 + 160 - -28 + 28 ^ 61 + 13 - 10 + 84;
        aL.llIllllIIl[118] = 0xDA ^ 0xBB;
        aL.llIllllIIl[119] = 0xDA ^ 0xB8;
        aL.llIllllIIl[120] = 0x20 ^ 0x43;
        aL.llIllllIIl[121] = 0x8F ^ 0x9D ^ (0xEB ^ 0x9C);
        aL.llIllllIIl[122] = 0x3B ^ 0x5D;
        aL.llIllllIIl[123] = 0xE3 ^ 0x92 ^ (0x37 ^ 0x21);
        aL.llIllllIIl[124] = 0xB0 ^ 0xB9 ^ (0x79 ^ 0x18);
        aL.llIllllIIl[125] = 0x2A ^ 0x44 ^ (0xD ^ 0xA);
        aL.llIllllIIl[126] = 0x36 ^ 0x1E ^ (0x31 ^ 0x73);
        aL.llIllllIIl[127] = 0x7E ^ 0x15;
        aL.llIllllIIl[128] = 0xB ^ 0 ^ (0x48 ^ 0x2F);
        aL.llIllllIIl[129] = 0xEA ^ 0x87;
        aL.llIllllIIl[130] = 0x1F ^ 0x71;
        aL.llIllllIIl[131] = 0x2F ^ 0x40;
        aL.llIllllIIl[132] = 0xE9 ^ 0x99;
        aL.llIllllIIl[133] = 0x6B ^ 0x1A;
        aL.llIllllIIl[134] = 0x5D ^ 0x2F;
        aL.llIllllIIl[135] = 16 + 251 - 201 + 187 ^ 13 + 75 - 41 + 95;
        aL.llIllllIIl[136] = 111 + 26 - -26 + 47 ^ 33 + 101 - 99 + 131;
        aL.llIllllIIl[137] = 186 + 41 - 53 + 56 ^ 29 + 34 - -43 + 41;
        aL.llIllllIIl[138] = 12 + 64 - 61 + 226 ^ 63 + 19 - -13 + 40;
        aL.llIllllIIl[139] = 0x5D ^ 0x2A;
        aL.llIllllIIl[140] = 0x49 ^ 0x7B ^ (0x68 ^ 0x22);
        aL.llIllllIIl[141] = 0x47 ^ 0x3E;
        aL.llIllllIIl[142] = 0xDB ^ 0xA1;
        aL.llIllllIIl[143] = -(0xFFFFABE7 & 0x5DDB) & (0xFFFFFFD7 & 0x3FFF);
        aL.llIllllIIl[144] = 0x67 ^ 0x1C;
        aL.llIllllIIl[145] = 0xD4 ^ 0xA8;
        aL.llIllllIIl[146] = 0xDE ^ 0xA3;
        aL.llIllllIIl[147] = 0xF7 ^ 0x89;
        aL.llIllllIIl[148] = (0xB2 ^ 0x95) + (0x7F ^ 0x14) - (0xC1 ^ 0x89) + (0xF1 ^ 0xC4);
        aL.llIllllIIl[149] = (0x98 ^ 0xBB) + (0x73 ^ 0xE) - (0xD2 ^ 0xBC) + (0xC0 ^ 0x8E);
        aL.llIllllIIl[150] = (5 ^ 0x6C) + (0x59 ^ 0x11) - (0x7F ^ 0x21) + (0x22 ^ 0xC);
        aL.llIllllIIl[151] = 7 + 125 - 36 + 34;
        aL.llIllllIIl[152] = (0xC0 ^ 0xAB) + (0xE0 ^ 0x9A) - (0x62 ^ 0x1E) + (0xBD ^ 0xA7);
        aL.llIllllIIl[153] = 117 + 17 - 87 + 85;
        aL.llIllllIIl[154] = (0x77 ^ 0x78) + (0x7B ^ 0x34) - (0xBD ^ 0x86) + (0xC0 ^ 0xA2);
        aL.llIllllIIl[155] = (0xC5 ^ 0x94) + (0x3C ^ 0x44) - (170 + 162 - 330 + 178) + (0xDB ^ 0xAA);
        aL.llIllllIIl[156] = (0x13 ^ 0x7E) + (0x59 ^ 0x72) - (0x2B ^ 0x35) + (0x1E ^ 0x13);
        aL.llIllllIIl[157] = 39 + 51 - 13 + 59;
        aL.llIllllIIl[158] = -(0xFFFFF66F & 0x4FF9) & (0xFFFFD7FC & Short.MAX_VALUE);
        aL.llIllllIIl[159] = 0xFFFFD77F & 0x3DFC;
        aL.llIllllIIl[160] = 31 + 2 - -32 + 72;
        aL.llIllllIIl[161] = (5 ^ 0x54) + (0x36 ^ 0x4F) - (0xD1 ^ 0x84) + (1 ^ 0x14);
        aL.llIllllIIl[162] = (0x52 ^ 0x65) + ((0x7D ^ 0x73) & ~(0x43 ^ 0x4D)) - (0xA1 ^ 0xB1) + (0xE6 ^ 0x82);
        aL.llIllllIIl[163] = (0x8C ^ 0x82) + (0x77 ^ 0x55) - -(0x78 ^ 0x45) + (0xDB ^ 0xC4);
        aL.llIllllIIl[164] = (0x5D ^ 0xD) + (0x54 ^ 0) - (0x47 ^ 0x67) + (0xCE ^ 0xC7);
        aL.llIllllIIl[165] = (0x76 ^ 0x58) + (0xA0 ^ 0xC2) - (0x7C ^ 0x61) + (0x33 ^ 0x28);
        aL.llIllllIIl[166] = 124 + 45 - 79 + 53;
        aL.llIllllIIl[167] = (0x20 ^ 0x69) + (0x5A ^ 0x4F) - -(0x16 ^ 0xF) + (0x81 ^ 0x98);
        aL.llIllllIIl[168] = (0xF3 ^ 0x9B) + (0x11 ^ 0x3B) - (0xEB ^ 0x88) + (0xEE ^ 0x8C);
        aL.llIllllIIl[169] = (0x30 ^ 0x69) + (0x1A ^ 0x46) - (98 + 8 - 79 + 124) + (0x49 ^ 0x3D);
        aL.llIllllIIl[170] = (0x61 ^ 0x24) + (0x41 ^ 0x59) - -(0x1D ^ 0x18) + (0x6A ^ 0x5B);
        aL.llIllllIIl[171] = 33 + 117 - 16 + 14;
        aL.llIllllIIl[172] = 110 + 80 - 174 + 122 + (0x16 ^ 0x35) - (0x16 ^ 0x20) + (0x5A ^ 0x44);
        aL.llIllllIIl[173] = (0x48 ^ 9) + (0x56 ^ 0x75) - (0xD9 ^ 0x89) + (18 + 39 - -48 + 25);
        aL.llIllllIIl[174] = (0x90 ^ 0xAE) + (0xC5 ^ 0x9E) - (99 + 94 - 78 + 23) + (97 + 103 - 103 + 39);
        aL.llIllllIIl[175] = (0x2D ^ 0x5F) + (0x4A ^ 0x1A) - (0x13 ^ 0x5B) + (0x7C ^ 0x62);
        aL.llIllllIIl[176] = 110 + 98 - 73 + 1 + (0xF3 ^ 0xC1) - (0xDE ^ 0xBE) + (0x45 ^ 0x7A);
        aL.llIllllIIl[177] = 69 + 39 - 46 + 92;
        aL.llIllllIIl[178] = 3 + 2 - -(0x1D ^ 0x28) + (0x3E ^ 0x5F);
        aL.llIllllIIl[179] = 59 + 78 - -9 + 10;
        aL.llIllllIIl[180] = 12 + 55 - 42 + 132;
        aL.llIllllIIl[181] = 1 + 50 - 10 + 117;
        aL.llIllllIIl[182] = (0xB9 ^ 0xA7) + (0x1E ^ 0x2C) - -(0x5D ^ 0x74) + (0xA2 ^ 0x84);
        aL.llIllllIIl[183] = 133 + 136 - 190 + 81;
        aL.llIllllIIl[184] = 57 + 120 - 160 + 144;
        aL.llIllllIIl[185] = -(0xFFFFF796 & 0x4BFF) & (0xFFFFFFFD & 0x4FDF);
        aL.llIllllIIl[186] = 20 + 49 - -14 + 76 + (0xD4 ^ 0x98) - (0x67 ^ 0x2B) + 3;
        aL.llIllllIIl[187] = 17 + 85 - 45 + 106;
        aL.llIllllIIl[188] = (0xAD ^ 0x90) + (0x2E ^ 0x26) - -1 + (0x3A ^ 0x64);
        aL.llIllllIIl[189] = -(0xFFFFF0E7 & 0x3F19) & (0xFFFFBFF7 & Short.MAX_VALUE);
        aL.llIllllIIl[190] = -(0xFFFFFB87 & 0x4E7D) & (0xFFFFDBED & Short.MAX_VALUE);
        aL.llIllllIIl[191] = (0x72 ^ 0xC) + (0x2B ^ 0x6C) - (87 + 58 - 72 + 99) + (21 + 58 - -44 + 17);
        aL.llIllllIIl[192] = 27 + 87 - 86 + 138;
        aL.llIllllIIl[193] = (0x54 ^ 0x69) + (0x46 ^ 0x43) - -(0x77 ^ 0x5B) + (0x4A ^ 0x73);
        aL.llIllllIIl[194] = (0x8F ^ 0x9A) + (0x3D ^ 0x33) - -(0xD7 ^ 0xB6) + (0xB6 ^ 0x92);
        aL.llIllllIIl[195] = 150 + 79 - 163 + 103;
        aL.llIllllIIl[196] = 112 + 125 - 215 + 110 + (0x1D ^ 0x14) - (0x79 ^ 0x4F) + (0x39 ^ 0x6A);
        aL.llIllllIIl[197] = 8 + 75 - 68 + 116 + (0x3D ^ 1) - (0x66 ^ 0x28) + (0x85 ^ 0xBF);
        aL.llIllllIIl[198] = -(0xFFFFC7F7 & 0x3FCB) & (0xFFFFFFFF & 0x5FDF);
        aL.llIllllIIl[199] = (0xAF ^ 0x8B) + (0x70 ^ 0) - (0x5B ^ 9) + (0xFB ^ 0x91);
        aL.llIllllIIl[200] = 152 + 66 - 176 + 131;
        aL.llIllllIIl[201] = 124 + 5 - 23 + 35 + (0x40 ^ 0xE) - (0xE8 ^ 0x83) + (0x19 ^ 0x27);
        aL.llIllllIIl[202] = 145 + 71 - 98 + 57;
        aL.llIllllIIl[203] = (0x90 ^ 0x83) + (0x44 ^ 0x21) - -(0xC1 ^ 0xC7) + (0x27 ^ 0x15);
        aL.llIllllIIl[204] = 65 + 140 - 28 + 0;
        aL.llIllllIIl[205] = (0x28 ^ 0x6E) + (0x8C ^ 0x80) - (0x12 ^ 0x26) + (75 + 98 - 36 + 11);
        aL.llIllllIIl[206] = 7 + 67 - 65 + 123 + (0x2D ^ 0x1E) - (0xB0 ^ 0xB4) + ((0xCB ^ 0x86) & ~(0x2F ^ 0x62));
        aL.llIllllIIl[207] = 8 + 48 - 13 + 99 + (22 + 78 - -20 + 34) - (73 + 72 - 3 + 18) + (0xD ^ 0x21);
        aL.llIllllIIl[208] = 88 + 46 - 82 + 129;
        aL.llIllllIIl[209] = (0x45 ^ 0x33) + (0x7A ^ 0x4B) - (0xA9 ^ 0x81) + (0x87 ^ 0xB0);
        aL.llIllllIIl[210] = 0xFFFF8D7E & 0x7393;
        aL.llIllllIIl[211] = 50 + 157 - 149 + 125;
        aL.llIllllIIl[212] = 76 + 166 - 162 + 104;
        aL.llIllllIIl[213] = (0x58 ^ 0x75) + (0x91 ^ 0x88) - -(0x1E ^ 0x27) + (0x1D ^ 0x27);
        aL.llIllllIIl[214] = 4 + 142 - -8 + 32;
        aL.llIllllIIl[215] = 108 + 59 - 11 + 31;
        aL.llIllllIIl[216] = 74 + 58 - 93 + 149;
        aL.llIllllIIl[217] = 50 + 81 - 91 + 149;
        aL.llIllllIIl[218] = 154 + 189 - 173 + 20;
        aL.llIllllIIl[219] = 162 + 50 - 105 + 63 + (0x5B ^ 0x5E) - (67 + 48 - 42 + 75) + (128 + 54 - 161 + 143);
        aL.llIllllIIl[220] = 37 + 0 - -64 + 50 + (0xE7 ^ 0x8A) - (0xFA ^ 0xAE) + (0xA5 ^ 0xB5);
        aL.llIllllIIl[221] = 172 + 3 - 51 + 51 + (0x88 ^ 0xC2) - (113 + 84 - 77 + 72) + (89 + 55 - 110 + 102);
        aL.llIllllIIl[222] = 10 + 74 - 58 + 145 + (142 + 64 - 191 + 140) - (0xFFFF8BFF & 0x7521) + (74 + 138 - 175 + 120);
        aL.llIllllIIl[223] = 175 + 53 - 139 + 106;
        aL.llIllllIIl[224] = 194 + 171 - 189 + 20;
        aL.llIllllIIl[225] = -(0xFFFFFFBF & 0x7EF5) & (0xFFFFFEFF & 0x1127FBF);
        aL.llIllllIIl[226] = 155 + 59 - 38 + 21;
        aL.llIllllIIl[227] = (0x12 ^ 0x50) + (0x83 ^ 0x92) - -(0x54 ^ 1) + (0x29 ^ 0x37);
        aL.llIllllIIl[228] = 0xFFFFAFFD & 0x174FA;
        aL.llIllllIIl[229] = 0xFFFFFEE9 & 0x14D1E;
        aL.llIllllIIl[230] = 0xFFFFBFDF & 0x6EEC;
        aL.llIllllIIl[231] = -(0xFFFFD7FC & 0x3E57) & (0xFFFFF7FB & Short.MAX_VALUE);
        aL.llIllllIIl[232] = 0xFFFFDFC7 & 0x3F7F;
        aL.llIllllIIl[233] = -(0xFFFFF9FD & 0x6E4B) & (0xFFFFFBCD & 0x6FFE);
        aL.llIllllIIl[234] = -(0xFFFFCF66 & 0x77BD) & (0xFFFFF7FF & 0x7FF7);
        aL.llIllllIIl[235] = 0xFFFFBDAF & 0x7EDC;
        aL.llIllllIIl[236] = 0xFFFFFDEF & 0x33C;
        aL.llIllllIIl[237] = -(0xFFFFFABD & 0x4D53) & (0xFFFFEBFF & 0x5FF8);
        aL.llIllllIIl[238] = 0xFFFFF6B6 & 0xDF9;
        aL.llIllllIIl[239] = -(0xFFFFEE7F & 0x57C5) & (0xFFFFFFFE & 0x5E7D);
        aL.llIllllIIl[240] = 0xFFFF9FEA & 0x7F5D;
        aL.llIllllIIl[241] = 0xFFFFD7B7 & 0x2BFE;
        aL.llIllllIIl[242] = -(0xFFFFF65D & 0x5DE7) & (0xFFFFF5DD & 0x5FE7);
        aL.llIllllIIl[243] = 0xFFFFB7BF & 0x4FDE;
        aL.llIllllIIl[244] = -(0xFFFFF357 & 0x5DA9) & (0xFFFFFFFB & 0x7FCE);
        aL.llIllllIIl[245] = -(0xFFFF9AFF & 0x75A2) & (0xFFFFFFFF & 0x75FF);
        aL.llIllllIIl[246] = 0xFFFFF7FC & 0x23E6B;
        aL.llIllllIIl[247] = -(0xFFFF9BFF & 0x6667) & (0xFFFF9FEF & 0x2E6FE);
        aL.llIllllIIl[248] = -(0xFFFFCE7D & 0x7F8B) & (0xFFFFFFDD & 0x7F7B);
        aL.llIllllIIl[249] = (0x70 ^ 0x3B) + (0x5F ^ 0x49) - (0x63 ^ 0x23) + (124 + 58 - 87 + 71);
        aL.llIllllIIl[250] = 74 + 190 - 213 + 149;
        aL.llIllllIIl[251] = 114 + 171 - 259 + 175;
        aL.llIllllIIl[252] = 134 + 24 - 21 + 65;
        aL.llIllllIIl[253] = 82 + 15 - 41 + 147;
        aL.llIllllIIl[254] = (0x62 ^ 0x46) + (123 + 114 - 153 + 76) - (0x1B ^ 0x44) + (0x79 ^ 0x1E);
        aL.llIllllIIl[255] = 0xFFFFFFEF & 0x361E;
        aL.llIllllIIl[256] = (0x5B ^ 0x17) + (0xBE ^ 0xC7) - (0xC6 ^ 0x9D) + (0xEB ^ 0x88);
        aL.llIllllIIl[257] = (0x33 ^ 0x24) + (0xC ^ 0x53) - (0x65 ^ 0x36) + (143 + 13 - 132 + 147);
        aL.llIllllIIl[258] = 11 + 92 - 33 + 137;
        aL.llIllllIIl[259] = 154 + 14 - 73 + 113;
        aL.llIllllIIl[260] = (0x70 ^ 0x38) + (0x9C ^ 0x8A) - (0x6C ^ 0x63) + (38 + 79 - 0 + 13);
        aL.llIllllIIl[261] = 109 + 28 - 24 + 72 + (0x6C ^ 0x5D) - (0xE8 ^ 0x87) + (0x47 ^ 0x10);
        aL.llIllllIIl[262] = 103 + 3 - 30 + 73 + (58 + 20 - 39 + 125) - (0xFFFFCBEF & 0x353C) + (144 + 4 - 146 + 196);
        aL.llIllllIIl[263] = (9 ^ 0x55) + (74 + 97 - 157 + 146) - (0x6E ^ 0x19) + (0xEA ^ 0xA5);
        aL.llIllllIIl[264] = 113 + 132 - 195 + 89 + (147 + 130 - 169 + 51) - (127 + 161 - 191 + 118) + (31 + 68 - 59 + 90);
        aL.llIllllIIl[265] = 20 + 182 - 30 + 42;
        aL.llIllllIIl[266] = (0xF5 ^ 0x81) + (0x59 ^ 0x1B) - (97 + 126 - 88 + 12) + (151 + 143 - 245 + 131);
        aL.llIllllIIl[267] = 165 + 60 - 126 + 117;
        aL.llIllllIIl[268] = (0x40 ^ 0x29) + (0x7B ^ 0x71) - 1 + (0x1A ^ 0x7D);
        aL.llIllllIIl[269] = 0xFFFFB51F & 0x1494AE0;
        aL.llIllllIIl[270] = 182 + 80 - 241 + 197;
        aL.llIllllIIl[271] = (0x1D ^ 0x4F) + (26 + 120 - 69 + 62) - (121 + 102 - 59 + 29) + (46 + 55 - -86 + 4);
        aL.llIllllIIl[272] = 160 + 16 - 18 + 42 + (0xA7 ^ 0x8A) - (95 + 119 - 145 + 61) + (0x25 ^ 0x4C);
        aL.llIllllIIl[273] = 92 + 5 - 45 + 169;
        aL.llIllllIIl[274] = 29 + 124 - 110 + 179;
        aL.llIllllIIl[275] = -(0xFFFFFBBD & 0x76DB) & (0xFFFFFFFC & 0x7FFB);
        aL.llIllllIIl[276] = -(0xFFFFD367 & 0x7EFB) & (0xFFFFDFE3 & Short.MAX_VALUE);
        aL.llIllllIIl[277] = -(0xFFFF9676 & 0x6B9B) & (0xFFFF9F7B & 0x6FFF);
        aL.llIllllIIl[278] = -(0xFFFFABA7 & 0x765A) & (0xFFFFFFBF & 0x2FDF);
        aL.llIllllIIl[279] = -(0xB3 ^ 0x92) & (0xFFFFDFBF & 0x72FA);
        aL.llIllllIIl[280] = 0xFFFFEF53 & 0x1DFC;
        aL.llIllllIIl[281] = 0xFFFF9D94 & 0x6FEB;
        aL.llIllllIIl[282] = 0xFFFFADCF & 0x5FBE;
        aL.llIllllIIl[283] = -(34 + 121 - 67 + 41) & (0xFFFFFCFB & 0xFFF);
        aL.llIllllIIl[284] = 187 + 218 - 367 + 185;
        aL.llIllllIIl[285] = -(0xFFFFF8FD & 0x176B) & (0xFFFF9FFA & 0x7DFD);
        aL.llIllllIIl[286] = -(0xFFFFA73B & 0x7BC7) & (0xFFFFAF7F & Short.MAX_VALUE);
        aL.llIllllIIl[287] = 0xFFFFFD9B & 0xFFD;
        aL.llIllllIIl[288] = -(0xFFFFA4D2 & 0x7B3F) & (0xFFFFADF7 & 0x7EBF);
        aL.llIllllIIl[289] = -(0xFFFFE24F & 0x3DF9) & (0xFFFFEDFF & 0x3FFF);
        aL.llIllllIIl[290] = 0xFFFFBD97 & 0x4FFF;
        aL.llIllllIIl[291] = (0x1F ^ 0x4C) + (35 + 11 - -23 + 124) - (0x6E ^ 0x1C) + (0x2C ^ 0x12);
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
                int var19;
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
                nArray5[aL.llIllllIIl[0]] = var19;
                String[] stringArray2 = new String[llIllllIIl[1]];
                stringArray2[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[194]];
                if (aL.lIlllIlIlllII(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[llIllllIIl[1]];
                    nArray6[aL.llIllllIIl[0]] = var19;
                    Inventory.getFirst((int[])nArray6).interact(llIlllIlII[llIllllIIl[195]]);
                }
                int[] nArray7 = new int[llIllllIIl[1]];
                nArray7[aL.llIllllIIl[0]] = var19;
                String[] stringArray3 = new String[llIllllIIl[1]];
                stringArray3[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[196]];
                if (aL.lIlllIlIlllII(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[llIllllIIl[1]];
                    nArray8[aL.llIllllIIl[0]] = var19;
                    Inventory.getFirst((int[])nArray8).interact(llIlllIlII[llIllllIIl[197]]);
                }
                if (aL.lIlllIllIlIII(var19, llIllllIIl[198])) {
                    Time.sleepTicks((int)llIllllIIl[10]);
                    0;
                    String[] stringArray4 = new String[llIllllIIl[1]];
                    stringArray4[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[199]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)llIllllIIl[1]);
                    0;
                }
            }
        }
    }

    private static int lIlllIllIIllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    public static void b(int[] nArray) {
        if (aL.lIlllIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0) && aL.lIlllIlIllllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] var45;
            String[] stringArray = new String[llIllllIIl[1]];
            stringArray[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[200]];
            if (aL.lIlllIlIlllII(Inventory.getFirst((int[])nArray).hasAction(stringArray) ? 1 : 0)) {
                Inventory.getFirst((int[])nArray).interact(llIlllIlII[llIllllIIl[201]]);
            }
            String[] stringArray2 = new String[llIllllIIl[1]];
            stringArray2[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[202]];
            if (aL.lIlllIlIlllII(Inventory.getFirst((int[])var45).hasAction(stringArray2) ? 1 : 0)) {
                Inventory.getFirst((int[])var45).interact(llIlllIlII[llIllllIIl[203]]);
            }
            String[] stringArray3 = new String[llIllllIIl[1]];
            stringArray3[aL.llIllllIIl[0]] = llIlllIlII[llIllllIIl[204]];
            if (aL.lIlllIlIlllII(Inventory.getFirst((int[])var45).hasAction(stringArray3) ? 1 : 0)) {
                Inventory.getFirst((int[])var45).interact(llIlllIlII[llIllllIIl[205]]);
            }
        }
    }

    @Override
    public int af() {
        try {
            aL.gb();
            0;
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
        void var33;
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
        int var3 = llIllllIIl[0];
        while (aL.lIlllIlIlllIl(var3, (int)var33)) {
            void var8;
            int var47;
            int var55;
            aM var23;
            void var28;
            void var20 = var28[var3];
            int var9 = var23.nT.getX() + var20[llIllllIIl[0]];
            WorldPoint var41 = new WorldPoint(var9, var55 = var23.nT.getY() + var20[llIllllIIl[1]], var47 = var23.nT.getPlane());
            if (aL.lIlllIlIlllII(var8.contains(var41) ? 1 : 0)) {
                void var15;
                var15.add(new aM(var41, var23, llIllllIIl[0], aL.d(var55, nR.getY() + llIllllIIl[17])));
                0;
            }
            ++var3;
            0;
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
            0;
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

