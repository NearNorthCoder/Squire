/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.ZHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class CHelper
implements K {
    public static final  int[] ge;
    static  int hi;
    static final  int gp;
    static final  int gt;
    private static final  WorldPoint gR;
    private static final  WorldPoint gC;
    private static final  WorldPoint gT;
    private static final  WorldPoint gA;
    public static  WorldArea he;
    static  int hh;
    static final  int gv;
    private static final  WorldPoint gU;
    private static final  WorldPoint gN;
    static  String hq;
    static final  int gq;
    static final  int gr;
    private static final  WorldPoint gy;
    private static final  int ha;
    static  WorldPoint hr;
    public static final  WorldPoint gn;
    private static final  int gZ;
    
    static  String hp;
    public static final  WorldPoint gl;
    static  WorldArea hu;
    static final  WorldPoint[] gx;
    private static final  WorldPoint gK;
    static final  int gu;
    public static final  WorldPoint gk;
    public static final  WorldArea gh;
    static  int hj;
    private static final  int hb;
    private static final  WorldPoint gF;
    static  int cA;
    private static final  WorldPoint gO;
    private static final  WorldPoint gQ;
    public static  int hg;
    public static final  int[] gf;
    static  int hl;
    public static  List<d> bp;
    static final  int gw;
    static  String ho;
    private static final  WorldPoint gH;
    private static final  int hd;
    static final  int gs;
    private static final  WorldPoint gJ;
    private static final  WorldPoint gL;
    static  int hm;
    static final  int go;
    private static final  WorldPoint gV;
    public static  boolean bn;
    static  WorldArea hs;
    private static final  WorldPoint gS;
    private static final  WorldPoint gX;
    private static final  WorldPoint gM;
    public static  int hf;
    public static final  WorldPoint gi;
    public static final  WorldPoint gm;
    static  String[] hn;
    private static final  WorldPoint gG;
    private static final  WorldPoint gP;
    static  boolean dd;
    public static final  WorldPoint gj;
    private static final  int hc;
    private static final  WorldPoint gY;
    static  int hk;
    private static final  WorldPoint gz;
    private static final  WorldPoint gE;
    
    private static final  WorldPoint gB;
    private static final  WorldPoint gW;
    private static final  WorldPoint gD;
    static  int dc;
    static  WorldPoint ht;
    private static final  WorldPoint gI;
    public static final  int[] gg;

    private static void lIIIlIlllIlIl() {
        lIlIIIllll = new String[lIlIIlIIll[413]];
        C.lIlIIIllll[C.lIlIIlIIll[0]] = "Buying items";
        C.lIlIIIllll[C.lIlIIlIIll[1]] = "Finished buying items, switching back to questing";
        C.lIlIIIllll[C.lIlIIlIIll[3]] = "Drink";
        C.lIlIIIllll[C.lIlIIlIIll[5]] = "Shark";
        C.lIlIIIllll[C.lIlIIlIIll[6]] = "Shark";
        C.lIlIIIllll[C.lIlIIlIIll[7]] = "Eat";
        C.lIlIIIllll[C.lIlIIlIIll[11]] = "Navigating to bank";
        C.lIlIIIllll[C.lIlIIlIIll[9]] = "Opening bank";
        C.lIlIIIllll[C.lIlIIlIIll[13]] = "Handling banking";
        C.lIlIIIllll[C.lIlIIlIIll[17]] = "We are missing runessupplies, switching to BUYING";
        C.lIlIIIllll[C.lIlIIlIIll[19]] = "Rope";
        C.lIlIIIllll[C.lIlIIlIIll[21]] = "Shark";
        C.lIlIIIllll[C.lIlIIlIIll[22]] = "We are missing supplies, switching to BUYING";
        C.lIlIIIllll[C.lIlIIlIIll[23]] = "Rope";
        C.lIlIIIllll[C.lIlIIlIIll[4]] = "Shark";
        C.lIlIIIllll[C.lIlIIlIIll[26]] = "Drink";
        C.lIlIIIllll[C.lIlIIlIIll[27]] = "Nav to start";
        C.lIlIIIllll[C.lIlIIlIIll[28]] = "Chatting";
        C.lIlIIIllll[C.lIlIIlIIll[25]] = "Nav to boy";
        C.lIlIIIllll[C.lIlIIlIIll[29]] = "Chat boy";
        C.lIlIIIllll[C.lIlIIlIIll[30]] = "Nav to bookcase";
        C.lIlIIIllll[C.lIlIIlIIll[32]] = "Book on baxtorian";
        C.lIlIIIllll[C.lIlIIlIIll[33]] = "Searching bookcase";
        C.lIlIIIllll[C.lIlIIlIIll[34]] = "Search";
        C.lIlIIIllll[C.lIlIIlIIll[35]] = "Book on baxtorian";
        C.lIlIIIllll[C.lIlIIlIIll[37]] = "Book on baxtorian";
        C.lIlIIIllll[C.lIlIIlIIll[38]] = "Reading";
        C.lIlIIIllll[C.lIlIIlIIll[39]] = "Read";
        C.lIlIIIllll[C.lIlIIlIIll[42]] = "Tele to CW";
        C.lIlIIIllll[C.lIlIIlIIll[43]] = "Wear";
        C.lIlIIIllll[C.lIlIIlIIll[44]] = "Castle Wars";
        C.lIlIIIllll[C.lIlIIlIIll[45]] = "Nav to maze ladder";
        C.lIlIIIllll[C.lIlIIlIIll[46]] = "Fountain";
        C.lIlIIIllll[C.lIlIIlIIll[48]] = "Climb-down";
        C.lIlIIIllll[C.lIlIIlIIll[50]] = "nav to box";
        C.lIlIIIllll[C.lIlIIlIIll[51]] = "Searching crate";
        C.lIlIIIllll[C.lIlIIlIIll[52]] = "Search";
        C.lIlIIIllll[C.lIlIIlIIll[54]] = "Nav to cage";
        C.lIlIIIllll[C.lIlIIlIIll[56]] = "Entering cage";
        C.lIlIIIllll[C.lIlIIlIIll[57]] = "Chat npc";
        C.lIlIIIllll[C.lIlIIlIIll[58]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[59]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[60]] = "Nav to tombstone";
        C.lIlIIIllll[C.lIlIIlIIll[61]] = "Wear";
        C.lIlIIIllll[C.lIlIIlIIll[62]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[63]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[64]] = "Entering tomb";
        C.lIlIIIllll[C.lIlIIlIIll[67]] = "Stalagmite";
        C.lIlIIIllll[C.lIlIIlIIll[68]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[69]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[2]] = "Getting ammy";
        C.lIlIIIllll[C.lIlIIlIIll[71]] = "Open";
        C.lIlIIIllll[C.lIlIIlIIll[73]] = "Search";
        C.lIlIIIllll[C.lIlIIlIIll[74]] = "Stalagmite";
        C.lIlIIIllll[C.lIlIIlIIll[75]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[76]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[77]] = "Getting ammy";
        C.lIlIIIllll[C.lIlIIlIIll[78]] = "Open";
        C.lIlIIIllll[C.lIlIIlIIll[79]] = "Search";
        C.lIlIIIllll[C.lIlIIlIIll[80]] = "Stalagmite";
        C.lIlIIIllll[C.lIlIIlIIll[82]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[83]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[84]] = "Getting ashes";
        C.lIlIIIllll[C.lIlIIlIIll[85]] = "Search";
        C.lIlIIIllll[C.lIlIIlIIll[86]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[10]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[87]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[88]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[89]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[90]] = "Nav to bank";
        C.lIlIIIllll[C.lIlIIlIIll[91]] = "Wear";
        C.lIlIIIllll[C.lIlIIlIIll[92]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[93]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[94]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[95]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[96]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[97]] = "Opening bank";
        C.lIlIIIllll[C.lIlIIlIIll[98]] = "Withdrawing runes";
        C.lIlIIIllll[C.lIlIIlIIll[99]] = "Vial";
        C.lIlIIIllll[C.lIlIIlIIll[100]] = "Shark";
        C.lIlIIIllll[C.lIlIIlIIll[101]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[102]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[103]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[104]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[105]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[106]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[107]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[108]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[109]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[110]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[111]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[112]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[113]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[114]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[115]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[116]] = "\"Y";
        C.lIlIIIllll[C.lIlIIlIIll[117]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[118]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[119]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[120]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[121]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[122]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[123]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[124]] = "Nav to door entrance";
        C.lIlIIIllll[C.lIlIIlIIll[125]] = "Rope";
        C.lIlIIIllll[C.lIlIIlIIll[126]] = "Rock";
        C.lIlIIIllll[C.lIlIIlIIll[127]] = "Roping rock";
        C.lIlIIIllll[C.lIlIIlIIll[129]] = "Rope";
        C.lIlIIIllll[C.lIlIIlIIll[131]] = "Roping tree";
        C.lIlIIIllll[C.lIlIIlIIll[132]] = "Door";
        C.lIlIIIllll[C.lIlIIlIIll[133]] = "Entering door";
        C.lIlIIIllll[C.lIlIIlIIll[134]] = "Open";
        C.lIlIIIllll[C.lIlIIlIIll[135]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[136]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[137]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[138]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[139]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[140]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[141]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[142]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[144]] = "Nav to key and get";
        C.lIlIIIllll[C.lIlIIlIIll[146]] = "Search";
        C.lIlIIIllll[C.lIlIIlIIll[147]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[148]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[149]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[150]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[151]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[152]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[153]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[154]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[155]] = "Nav to last room";
        C.lIlIIIllll[C.lIlIIlIIll[156]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[157]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[158]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[159]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[160]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[161]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[162]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[163]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[164]] = "Door";
        C.lIlIIIllll[C.lIlIIlIIll[166]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[167]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[168]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[169]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[170]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[171]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[172]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[173]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[174]] = "Door";
        C.lIlIIIllll[C.lIlIIlIIll[175]] = "Open";
        C.lIlIIIllll[C.lIlIIlIIll[176]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[177]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[178]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[179]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[180]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[181]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[182]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[183]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[184]] = "Nav to SE Pillar";
        C.lIlIIIllll[C.lIlIIlIIll[185]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[186]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[187]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[188]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[189]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[190]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[191]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[192]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[193]] = "Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[194]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[195]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[196]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[197]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[198]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[199]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[201]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[202]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[203]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[204]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[205]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[206]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[207]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[208]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[209]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[210]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[211]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[212]] = "Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[213]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[214]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[215]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[216]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[217]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[218]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[219]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[220]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[221]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[222]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[223]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[224]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[225]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[226]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[227]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[228]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[229]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[230]] = "Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[231]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[232]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[233]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[234]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[235]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[236]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[237]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[238]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[239]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[240]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[241]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[242]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[243]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[244]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[245]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[246]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[247]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[248]] = "Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[249]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[250]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[251]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[252]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[8]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[253]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[254]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[255]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[256]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[257]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[258]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[259]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[260]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[261]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[262]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[263]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[264]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[265]] = "Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[266]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[267]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[268]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[269]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[270]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[271]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[272]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[273]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[274]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[275]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[276]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[277]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[278]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[279]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[280]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[281]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[282]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[283]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[284]] = "Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[285]] = "Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[286]] = "Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[287]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[288]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[289]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[290]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[291]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[292]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[293]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[294]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[295]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[296]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[297]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[298]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[299]] = "Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[300]] = "Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[301]] = "Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[302]] = "Putting neck on statue";
        C.lIlIIIllll[C.lIlIIlIIll[305]] = "Putting ashes inside";
        C.lIlIIIllll[C.lIlIIlIIll[308]] = "Chalice";
        C.lIlIIIllll[C.lIlIIlIIll[309]] = "Statue of Glarial";
        C.lIlIIIllll[C.lIlIIlIIll[310]] = "Pillar";
        C.lIlIIIllll[C.lIlIIlIIll[311]] = "Teleporting to CW";
        C.lIlIIIllll[C.lIlIIlIIll[312]] = "Wear";
        C.lIlIIIllll[C.lIlIIlIIll[313]] = "Castle Wars";
        C.lIlIIIllll[C.lIlIIlIIll[314]] = "Rope";
        C.lIlIIIllll[C.lIlIIlIIll[325]] = "Waterfall quest";
        C.lIlIIIllll[C.lIlIIlIIll[326]] = "ring of wealth (";
        C.lIlIIIllll[C.lIlIIlIIll[327]] = "Stalagmite";
        C.lIlIIIllll[C.lIlIIlIIll[328]] = "Games";
        C.lIlIIIllll[C.lIlIIlIIll[329]] = "Games";
        C.lIlIIIllll[C.lIlIIlIIll[330]] = "Games";
        C.lIlIIIllll[C.lIlIIlIIll[331]] = "dueling";
        C.lIlIIIllll[C.lIlIIlIIll[332]] = "dueling";
        C.lIlIIIllll[C.lIlIIlIIll[40]] = "dueling";
        C.lIlIIIllll[C.lIlIIlIIll[41]] = "dueling";
        C.lIlIIIllll[C.lIlIIlIIll[304]] = "dueling";
        C.lIlIIIllll[C.lIlIIlIIll[307]] = "How can I help?";
        C.lIlIIIllll[C.lIlIIlIIll[402]] = "I'm always happy to help a cook in distress.";
        C.lIlIIIllll[C.lIlIIlIIll[143]] = "Yes.";
        C.lIlIIIllll[C.lIlIIlIIll[403]] = "Golrie";
        C.lIlIIIllll[C.lIlIIlIIll[404]] = "Hudon";
        C.lIlIIIllll[C.lIlIIlIIll[405]] = "Almera";
    }

    private static boolean lIIIlIllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIllIIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String ae() {
        return lIlIIIllll[lIlIIlIIll[325]];
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIlIlllllII(Object object) {
        return object != null;
    }

    static {
        C.lIIIlIlllIllI();
        C.lIIIlIlllIlIl();
        hd = lIlIIlIIll[143];
        gs = lIlIIlIIll[6];
        gp = lIlIIlIIll[1];
        go = lIlIIlIIll[10];
        gt = lIlIIlIIll[7];
        gw = lIlIIlIIll[19];
        gr = lIlIIlIIll[5];
        hc = lIlIIlIIll[306];
        gq = lIlIIlIIll[3];
        hb = lIlIIlIIll[303];
        ha = lIlIIlIIll[145];
        gu = lIlIIlIIll[11];
        gv = lIlIIlIIll[13];
        gZ = lIlIIlIIll[49];
        int[] nArray = new int[lIlIIlIIll[17]];
        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[318];
        nArray[C.lIlIIlIIll[1]] = lIlIIlIIll[333];
        nArray[C.lIlIIlIIll[3]] = lIlIIlIIll[334];
        nArray[C.lIlIIlIIll[5]] = lIlIIlIIll[335];
        nArray[C.lIlIIlIIll[6]] = lIlIIlIIll[336];
        nArray[C.lIlIIlIIll[7]] = lIlIIlIIll[337];
        nArray[C.lIlIIlIIll[11]] = lIlIIlIIll[338];
        nArray[C.lIlIIlIIll[9]] = lIlIIlIIll[339];
        nArray[C.lIlIIlIIll[13]] = lIlIIlIIll[339];
        ge = nArray;
        int[] nArray2 = new int[lIlIIlIIll[6]];
        nArray2[C.lIlIIlIIll[0]] = lIlIIlIIll[316];
        nArray2[C.lIlIIlIIll[1]] = lIlIIlIIll[340];
        nArray2[C.lIlIIlIIll[3]] = lIlIIlIIll[341];
        nArray2[C.lIlIIlIIll[5]] = lIlIIlIIll[342];
        gf = nArray2;
        int[] nArray3 = new int[lIlIIlIIll[17]];
        nArray3[C.lIlIIlIIll[0]] = lIlIIlIIll[24];
        nArray3[C.lIlIIlIIll[1]] = lIlIIlIIll[343];
        nArray3[C.lIlIIlIIll[3]] = lIlIIlIIll[344];
        nArray3[C.lIlIIlIIll[5]] = lIlIIlIIll[345];
        nArray3[C.lIlIIlIIll[6]] = lIlIIlIIll[346];
        nArray3[C.lIlIIlIIll[7]] = lIlIIlIIll[347];
        nArray3[C.lIlIIlIIll[11]] = lIlIIlIIll[348];
        nArray3[C.lIlIIlIIll[9]] = lIlIIlIIll[349];
        nArray3[C.lIlIIlIIll[13]] = lIlIIlIIll[348];
        gg = nArray3;
        gh = new WorldArea(lIlIIlIIll[344], lIlIIlIIll[350], lIlIIlIIll[26], lIlIIlIIll[25], lIlIIlIIll[0]);
        gi = new WorldPoint(lIlIIlIIll[351], lIlIIlIIll[352], lIlIIlIIll[0]);
        gj = new WorldPoint(lIlIIlIIll[351], lIlIIlIIll[353], lIlIIlIIll[0]);
        gk = new WorldPoint(lIlIIlIIll[351], lIlIIlIIll[354], lIlIIlIIll[0]);
        gl = new WorldPoint(lIlIIlIIll[346], lIlIIlIIll[354], lIlIIlIIll[0]);
        gm = new WorldPoint(lIlIIlIIll[346], lIlIIlIIll[353], lIlIIlIIll[0]);
        gn = new WorldPoint(lIlIIlIIll[346], lIlIIlIIll[352], lIlIIlIIll[0]);
        WorldPoint[] worldPointArray = new WorldPoint[lIlIIlIIll[7]];
        worldPointArray[C.lIlIIlIIll[0]] = new WorldPoint(lIlIIlIIll[355], lIlIIlIIll[356], lIlIIlIIll[0]);
        worldPointArray[C.lIlIIlIIll[1]] = new WorldPoint(lIlIIlIIll[357], lIlIIlIIll[358], lIlIIlIIll[0]);
        worldPointArray[C.lIlIIlIIll[3]] = new WorldPoint(lIlIIlIIll[359], lIlIIlIIll[360], lIlIIlIIll[0]);
        worldPointArray[C.lIlIIlIIll[5]] = new WorldPoint(lIlIIlIIll[361], lIlIIlIIll[362], lIlIIlIIll[0]);
        worldPointArray[C.lIlIIlIIll[6]] = new WorldPoint(lIlIIlIIll[363], lIlIIlIIll[364], lIlIIlIIll[0]);
        gx = worldPointArray;
        gy = new WorldPoint(lIlIIlIIll[365], lIlIIlIIll[53], lIlIIlIIll[0]);
        gz = new WorldPoint(lIlIIlIIll[366], lIlIIlIIll[367], lIlIIlIIll[0]);
        gA = new WorldPoint(lIlIIlIIll[368], lIlIIlIIll[369], lIlIIlIIll[0]);
        gB = new WorldPoint(lIlIIlIIll[370], lIlIIlIIll[371], lIlIIlIIll[0]);
        gC = new WorldPoint(lIlIIlIIll[372], lIlIIlIIll[373], lIlIIlIIll[0]);
        gD = new WorldPoint(lIlIIlIIll[374], lIlIIlIIll[375], lIlIIlIIll[0]);
        gE = new WorldPoint(lIlIIlIIll[376], lIlIIlIIll[377], lIlIIlIIll[0]);
        gF = new WorldPoint(lIlIIlIIll[374], lIlIIlIIll[378], lIlIIlIIll[0]);
        gG = new WorldPoint(lIlIIlIIll[379], lIlIIlIIll[380], lIlIIlIIll[0]);
        gH = new WorldPoint(lIlIIlIIll[379], lIlIIlIIll[381], lIlIIlIIll[1]);
        gI = new WorldPoint(lIlIIlIIll[363], lIlIIlIIll[382], lIlIIlIIll[0]);
        gJ = new WorldPoint(lIlIIlIIll[383], lIlIIlIIll[384], lIlIIlIIll[0]);
        gK = new WorldPoint(lIlIIlIIll[365], lIlIIlIIll[385], lIlIIlIIll[0]);
        gL = new WorldPoint(lIlIIlIIll[386], lIlIIlIIll[387], lIlIIlIIll[0]);
        gM = new WorldPoint(lIlIIlIIll[388], lIlIIlIIll[389], lIlIIlIIll[0]);
        gN = new WorldPoint(lIlIIlIIll[390], lIlIIlIIll[391], lIlIIlIIll[0]);
        gO = new WorldPoint(lIlIIlIIll[392], lIlIIlIIll[393], lIlIIlIIll[0]);
        gP = new WorldPoint(lIlIIlIIll[394], lIlIIlIIll[395], lIlIIlIIll[0]);
        gQ = new WorldPoint(lIlIIlIIll[396], lIlIIlIIll[397], lIlIIlIIll[0]);
        gR = new WorldPoint(lIlIIlIIll[398], lIlIIlIIll[399], lIlIIlIIll[0]);
        gS = new WorldPoint(lIlIIlIIll[349], lIlIIlIIll[350], lIlIIlIIll[0]);
        gT = new WorldPoint(lIlIIlIIll[400], lIlIIlIIll[352], lIlIIlIIll[0]);
        gU = new WorldPoint(lIlIIlIIll[400], lIlIIlIIll[353], lIlIIlIIll[0]);
        gV = new WorldPoint(lIlIIlIIll[400], lIlIIlIIll[354], lIlIIlIIll[0]);
        gW = new WorldPoint(lIlIIlIIll[398], lIlIIlIIll[354], lIlIIlIIll[0]);
        gX = new WorldPoint(lIlIIlIIll[398], lIlIIlIIll[353], lIlIIlIIll[0]);
        gY = new WorldPoint(lIlIIlIIll[398], lIlIIlIIll[352], lIlIIlIIll[0]);
        bp = new ArrayList<d>();
        he = new WorldArea(new WorldPoint(lIlIIlIIll[379], lIlIIlIIll[53], lIlIIlIIll[0]), new WorldPoint(lIlIIlIIll[368], lIlIIlIIll[401], lIlIIlIIll[0]));
        hf = lIlIIlIIll[40];
        hg = lIlIIlIIll[41];
        hh = lIlIIlIIll[0];
        hi = lIlIIlIIll[0];
        hj = lIlIIlIIll[0];
        hk = lIlIIlIIll[0];
        hl = lIlIIlIIll[0];
        hm = lIlIIlIIll[0];
        String[] stringArray = new String[lIlIIlIIll[5]];
        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[307]];
        stringArray[C.lIlIIlIIll[1]] = lIlIIIllll[lIlIIlIIll[402]];
        stringArray[C.lIlIIlIIll[3]] = lIlIIIllll[lIlIIlIIll[143]];
        hn = stringArray;
        ho = lIlIIIllll[lIlIIlIIll[403]];
        hp = lIlIIIllll[lIlIIlIIll[404]];
        hq = lIlIIIllll[lIlIIlIIll[405]];
        hr = new WorldPoint(lIlIIlIIll[349], lIlIIlIIll[406], lIlIIlIIll[0]);
        hs = new WorldArea(lIlIIlIIll[407], lIlIIlIIll[408], lIlIIlIIll[10], lIlIIlIIll[84], lIlIIlIIll[0]);
        ht = new WorldPoint(lIlIIlIIll[409], lIlIIlIIll[410], lIlIIlIIll[0]);
        hu = new WorldArea(lIlIIlIIll[411], lIlIIlIIll[412], lIlIIlIIll[82], lIlIIlIIll[90], lIlIIlIIll[0]);
        cA = lIlIIlIIll[0];
    }

    private static boolean lIIIlIlllIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (C.lIIIlIllllIll(e.j(lIlIIlIIll[10]), lIlIIlIIll[19])) {
            bl = lIlIIlIIll[1];

            if (1 == 0) {
                return ((19 + 71 - -24 + 13 ^ (0xF ^ 0x63)) & (0xDC ^ 0xB6 ^ (0x47 ^ 0x3E) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIIll[0];
        }
        return bl;
    }

    private static boolean lIIIlIllllllI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void bL() {
        block254: {
            block289: {
                Item var2;
                BankLocation var3;
                block270: {
                    block253: {
                        block252: {
                            block251: {
                                block250: {
                                    block249: {
                                        block248: {
                                            block265: {
                                                block268: {
                                                    block269: {
                                                        block266: {
                                                            block267: {
                                                                block255: {
                                                                    block256: {
                                                                        block264: {
                                                                            block262: {
                                                                                block263: {
                                                                                    block261: {
                                                                                        block260: {
                                                                                            block258: {
                                                                                                block259: {
                                                                                                    block257: {
                                                                                                        if (C.lIIIlIlllIlll(bn ? 1 : 0)) {
                                                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[0]];
                                                                                                            b.a(bp);
                                                                                                            if (C.lIIIlIllllIII(bp.size(), lIlIIlIIll[1])) {
                                                                                                                System.out.println(lIlIIIllll[lIlIIlIIll[1]]);
                                                                                                                bn = lIlIIlIIll[0];
                                                                                                            }
                                                                                                        }
                                                                                                        if (!C.lIIIlIllllIIl(bn ? 1 : 0)) break block254;
                                                                                                        if (C.lIIIlIlllIlll(Inventory.contains((int[])f.aU) ? 1 : 0) && C.lIIIlIllllIII(Movement.getRunEnergy(), lIlIIlIIll[2]) && C.lIIIlIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                                                                                                            Inventory.getFirst((int[])f.aU).interact(lIlIIIllll[lIlIIlIIll[3]]);
                                                                                                            Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                                        }
                                                                                                        if (!C.lIIIlIllllIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIlIIlIIll[4]) || C.lIIIlIlllIlll(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lIlIIlIIll[1]];
                                                                                                            stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[5]];
                                                                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lIlIIlIIll[1]];
                                                                                                                stringArray2[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(lIlIIIllll[lIlIIlIIll[7]]);
                                                                                                                Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                                            }
                                                                                                        }
                                                                                                        if (C.lIIIlIllllIII(e.j(lIlIIlIIll[8]), lIlIIlIIll[9])) {
                                                                                                            D.bR();
                                                                                                        }
                                                                                                        if (!C.lIIIlIllllIIl(e.j(lIlIIlIIll[10])) || !C.lIIIlIllllIll(e.j(lIlIIlIIll[8]), lIlIIlIIll[9])) break block255;
                                                                                                        if (!C.lIIIlIllllIIl(C.aK() ? 1 : 0)) break block256;
                                                                                                        var3 = BankLocation.getNearest();
                                                                                                        if (C.lIIIlIlllllII(var3) && C.lIIIlIllllIIl(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[11]];
                                                                                                            a.a(var3);
                                                                                                        }
                                                                                                        if (!C.lIIIlIlllllII(var3) || !C.lIIIlIlllIlll(var3.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (C.lIIIlIllllIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlIIll[12]);

                                                                                                        }
                                                                                                        if (!C.lIIIlIlllIlll(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[13]];
                                                                                                        if (C.lIIIlIlllllIl(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lIlIIlIIll[5]);

                                                                                                        }
                                                                                                        if (C.lIIIlIlllllIl(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lIlIIlIIll[3]);

                                                                                                        }
                                                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                                                                                                        if (!C.lIIIlIlllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block257;
                                                                                                        int[] nArray2 = new int[lIlIIlIIll[1]];
                                                                                                        nArray2[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                                                                                                        if (!C.lIIIlIllllIll(Bank.getFirst((int[])nArray2).getQuantity(), lIlIIlIIll[11])) break block258;
                                                                                                    }
                                                                                                    int[] nArray = new int[lIlIIlIIll[1]];
                                                                                                    nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[15];
                                                                                                    if (!C.lIIIlIlllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block259;
                                                                                                    int[] nArray3 = new int[lIlIIlIIll[1]];
                                                                                                    nArray3[C.lIlIIlIIll[0]] = lIlIIlIIll[15];
                                                                                                    if (!C.lIIIlIllllIll(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIlIIll[11])) break block258;
                                                                                                }
                                                                                                int[] nArray = new int[lIlIIlIIll[1]];
                                                                                                nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[16];
                                                                                                if (!C.lIIIlIlllIlll(Bank.contains((int[])nArray) ? 1 : 0)) break block260;
                                                                                                int[] nArray4 = new int[lIlIIlIIll[1]];
                                                                                                nArray4[C.lIlIIlIIll[0]] = lIlIIlIIll[16];
                                                                                                if (!C.lIIIlIllllIII(Bank.getFirst((int[])nArray4).getQuantity(), lIlIIlIIll[11])) break block260;
                                                                                            }
                                                                                            C.O();
                                                                                            System.out.println(lIlIIIllll[lIlIIlIIll[17]]);
                                                                                            bn = lIlIIlIIll[1];
                                                                                            return;
                                                                                        }
                                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[18];
                                                                                        if (!C.lIIIlIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block261;
                                                                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                                                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[19]];
                                                                                        if (!C.lIIIlIllllIll(Inventory.getCount((String[])stringArray), lIlIIlIIll[1])) break block262;
                                                                                    }
                                                                                    int[] nArray = new int[lIlIIlIIll[1]];
                                                                                    nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[20];
                                                                                    if (!C.lIIIlIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block263;
                                                                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                                                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[21]];
                                                                                    if (!C.lIIIlIllllIll(Inventory.getCount((String[])stringArray), lIlIIlIIll[1])) break block262;
                                                                                }
                                                                                if (!(C.lIIIlIllllIIl(Bank.contains((int[])f.aN) ? 1 : 0) && !C.lIIIlIllllIll(Inventory.getCount((int[])f.aN), lIlIIlIIll[1]) || C.lIIIlIllllIIl(Bank.contains((int[])f.aM) ? 1 : 0) && !C.lIIIlIllllIll(Inventory.getCount((int[])f.aM), lIlIIlIIll[1])) && (!C.lIIIlIllllIIl(Bank.contains((int[])f.aU) ? 1 : 0) || !C.lIIIlIllllIII(Inventory.getCount((int[])f.aU), lIlIIlIIll[1]))) break block264;
                                                                            }
                                                                            C.O();
                                                                            System.out.println(lIlIIIllll[lIlIIlIIll[22]]);
                                                                            bn = lIlIIlIIll[1];
                                                                            return;
                                                                        }
                                                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[23]];
                                                                        if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            a.a(lIlIIlIIll[18], lIlIIlIIll[1]);
                                                                        }
                                                                        if (C.lIIIlIllllIIl(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                                                                            a.a(f.aN, lIlIIlIIll[1]);
                                                                        }
                                                                        if (C.lIIIlIllllIIl(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                                                                            a.a(lIlIIlIIll[24], lIlIIlIIll[1]);
                                                                        }
                                                                        if (C.lIIIlIllllIIl(Inventory.contains((int[])f.aU) ? 1 : 0)) {
                                                                            a.a(f.aU, lIlIIlIIll[6]);
                                                                        }
                                                                        String[] stringArray3 = new String[lIlIIlIIll[1]];
                                                                        stringArray3[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[4]];
                                                                        if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                                                            a.a(lIlIIlIIll[20], lIlIIlIIll[25]);
                                                                        }
                                                                    }
                                                                    if (C.lIIIlIlllIlll(C.aK() ? 1 : 0)) {
                                                                        if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gC), lIlIIlIIll[7])) {
                                                                            if (C.lIIIlIlllIlll(Bank.isOpen() ? 1 : 0)) {
                                                                                Bank.close();
                                                                                Time.sleepTicks((int)lIlIIlIIll[5]);

                                                                            }
                                                                            if (C.lIIIlIllllIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                if (C.lIIIlIllllIII(cA, lIlIIlIIll[1])) {
                                                                                    if (C.lIIIlIlllIlll(Inventory.contains((int[])f.aU) ? 1 : 0) && C.lIIIlIllllIII(Movement.getRunEnergy(), lIlIIlIIll[2])) {
                                                                                        Inventory.getFirst((int[])f.aU).interact(lIlIIIllll[lIlIIlIIll[26]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                    }
                                                                                    e.v();
                                                                                    cA += lIlIIlIIll[1];
                                                                                }
                                                                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[27]];
                                                                                Movement.walkTo((WorldPoint)gC);

                                                                                Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                            }
                                                                        }
                                                                        if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gC), lIlIIlIIll[7])) {
                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[28]];
                                                                            g.a(hq, hn);
                                                                        }
                                                                    }
                                                                }
                                                                if (C.lIIIlIlllllll(e.j(lIlIIlIIll[10]), lIlIIlIIll[1])) {
                                                                    if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gF), lIlIIlIIll[5])) {
                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[25]];
                                                                        Movement.walkTo((WorldPoint)gF);

                                                                    }
                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gF), lIlIIlIIll[5])) {
                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[29]];
                                                                        g.a(hp, hn);
                                                                    }
                                                                }
                                                                if (C.lIIIlIlllllll(e.j(lIlIIlIIll[10]), lIlIIlIIll[3])) {
                                                                    if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gH), lIlIIlIIll[6])) {
                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[30]];
                                                                        Movement.walkTo((WorldPoint)gH);

                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                    }
                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gH), lIlIIlIIll[6])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[31];
                                                                        var3 = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[32]];
                                                                        if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[33]];
                                                                            if (C.lIIIlIlllllII(var3)) {
                                                                                var3.interact(lIlIIIllll[lIlIIlIIll[34]]);
                                                                                Time.sleepTicks((int)lIlIIlIIll[3]);

                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gH), lIlIIlIIll[19])) {
                                                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[35]];
                                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0) && C.lIIIlIlllllll(Players.getLocal().getAnimation(), lIlIIlIIll[36]) && C.lIIIllIIIIIII(e.j(lIlIIlIIll[10]), lIlIIlIIll[5])) {
                                                                        String[] stringArray4 = new String[lIlIIlIIll[1]];
                                                                        stringArray4[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[37]];
                                                                        var3 = Inventory.getFirst((String[])stringArray4);
                                                                        if (C.lIIIlIlllllII(var3)) {
                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[38]];
                                                                            var3.interact(lIlIIIllll[lIlIIlIIll[39]]);
                                                                            Time.sleepTicks((int)lIlIIlIIll[3]);

                                                                        }
                                                                    }
                                                                }
                                                                if (C.lIIIlIlllllll(e.j(lIlIIlIIll[10]), lIlIIlIIll[5])) {
                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gH), lIlIIlIIll[19])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                        if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray), lIlIIlIIll[1])) {
                                                                            int[] nArray5 = new int[lIlIIlIIll[1]];
                                                                            nArray5[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                            if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray5), lIlIIlIIll[1])) {
                                                                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[42]];
                                                                                if (C.lIIIlIlllIlll(Inventory.contains(item -> item.getName().contains(lIlIIIllll[lIlIIlIIll[304]])) ? 1 : 0) && C.lIIIlIllllIIl(Equipment.contains(item -> item.getName().contains(lIlIIIllll[lIlIIlIIll[41]])) ? 1 : 0)) {
                                                                                    Inventory.getFirst(item -> item.getName().contains(lIlIIIllll[lIlIIlIIll[40]])).interact(lIlIIIllll[lIlIIlIIll[43]]);
                                                                                }
                                                                                if (C.lIIIlIlllIlll(Equipment.contains(item -> item.getName().contains(lIlIIIllll[lIlIIlIIll[332]])) ? 1 : 0) && C.lIIIlIllllIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                                                                                    Equipment.getFirst(item -> item.getName().contains(lIlIIIllll[lIlIIlIIll[331]])).interact(lIlIIIllll[lIlIIlIIll[44]]);
                                                                                    Time.sleepTicks((int)lIlIIlIIll[6]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gI), lIlIIlIIll[5])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                        if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray), lIlIIlIIll[1])) {
                                                                            int[] nArray6 = new int[lIlIIlIIll[1]];
                                                                            nArray6[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                            if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray6), lIlIIlIIll[1]) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gJ), lIlIIlIIll[44]) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gH), lIlIIlIIll[19])) {
                                                                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[45]];
                                                                                if (C.lIIIlIllllIIl(hs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)ht);

                                                                                }
                                                                                if (C.lIIIlIlllIlll(hs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(gx));

                                                                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gI), lIlIIlIIll[5])) {
                                                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[46]];
                                                                        if (C.lIIIlIlllllII(TileObjects.getNearest((String[])stringArray))) {
                                                                            int[] nArray = new int[lIlIIlIIll[1]];
                                                                            nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                            if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray), lIlIIlIIll[1])) {
                                                                                int[] nArray7 = new int[lIlIIlIIll[1]];
                                                                                nArray7[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                                if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray7), lIlIIlIIll[1])) {
                                                                                    int[] nArray8 = new int[lIlIIlIIll[1]];
                                                                                    nArray8[C.lIlIIlIIll[0]] = lIlIIlIIll[47];
                                                                                    var3 = TileObjects.getNearest((int[])nArray8);
                                                                                    if (C.lIIIlIlllllII(var3)) {
                                                                                        var3.interact(lIlIIIllll[lIlIIlIIll[48]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[5]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gJ), lIlIIlIIll[3])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[49];
                                                                        if (C.lIIIlIlllllII(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray9 = new int[lIlIIlIIll[1]];
                                                                            nArray9[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                            if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray9), lIlIIlIIll[1])) {
                                                                                int[] nArray10 = new int[lIlIIlIIll[1]];
                                                                                nArray10[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                                if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray10), lIlIIlIIll[1])) {
                                                                                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[50]];
                                                                                    Movement.walkTo((WorldPoint)gJ);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gJ), lIlIIlIIll[5])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[49];
                                                                        if (C.lIIIlIlllllII(TileObjects.getNearest((int[])nArray))) {
                                                                            int[] nArray11 = new int[lIlIIlIIll[1]];
                                                                            nArray11[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                            if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray11), lIlIIlIIll[1])) {
                                                                                int[] nArray12 = new int[lIlIIlIIll[1]];
                                                                                nArray12[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                                if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray12), lIlIIlIIll[1])) {
                                                                                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[51]];
                                                                                    int[] nArray13 = new int[lIlIIlIIll[1]];
                                                                                    nArray13[C.lIlIIlIIll[0]] = lIlIIlIIll[49];
                                                                                    var3 = TileObjects.getNearest((int[])nArray13);
                                                                                    if (C.lIIIlIlllllII(var3)) {
                                                                                        var3.interact(lIlIIIllll[lIlIIlIIll[52]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[3]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gK), lIlIIlIIll[3])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                        if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray)) && C.lIIIlIllllIII(Players.getLocal().getWorldLocation().getY(), lIlIIlIIll[53])) {
                                                                            int[] nArray14 = new int[lIlIIlIIll[1]];
                                                                            nArray14[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                            if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray14))) {
                                                                                int[] nArray15 = new int[lIlIIlIIll[1]];
                                                                                nArray15[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                                if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray15), lIlIIlIIll[1])) {
                                                                                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[54]];
                                                                                    Movement.walkTo((WorldPoint)gK);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gK), lIlIIlIIll[3])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                        if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray)) && C.lIIIlIllllIII(Players.getLocal().getWorldLocation().getY(), lIlIIlIIll[53])) {
                                                                            int[] nArray16 = new int[lIlIIlIIll[1]];
                                                                            nArray16[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                            if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray16))) {
                                                                                int[] nArray17 = new int[lIlIIlIIll[1]];
                                                                                nArray17[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                                if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray17), lIlIIlIIll[1])) {
                                                                                    int[] nArray18 = new int[lIlIIlIIll[1]];
                                                                                    nArray18[C.lIlIIlIIll[0]] = lIlIIlIIll[55];
                                                                                    var3 = TileObjects.getNearest((int[])nArray18);
                                                                                    if (C.lIIIlIlllllII(var3)) {
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[56]];
                                                                                        int[] nArray19 = new int[lIlIIlIIll[1]];
                                                                                        nArray19[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                                        var2 = Inventory.getFirst((int[])nArray19);
                                                                                        if (C.lIIIlIlllllII(var2)) {
                                                                                            var2.useOn((TileObject)var3);
                                                                                            Time.sleep((long)1L);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (C.lIIIlIllllIll(Players.getLocal().getWorldLocation().getY(), lIlIIlIIll[53])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                        if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray), lIlIIlIIll[1])) {
                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[57]];
                                                                            g.a(ho, hn);
                                                                        }
                                                                    }
                                                                    int[] nArray = new int[lIlIIlIIll[1]];
                                                                    nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                    if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray)) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gM), lIlIIlIIll[6])) {
                                                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[58]];
                                                                        if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray), lIlIIlIIll[1])) {
                                                                            String[] stringArray5 = new String[lIlIIlIIll[1]];
                                                                            stringArray5[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[59]];
                                                                            if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray5), lIlIIlIIll[1])) {
                                                                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[60]];
                                                                                if (C.lIIIlIllllIIl(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    if (C.lIIIlIlllIlll(Inventory.contains(item -> item.getName().contains(lIlIIIllll[lIlIIlIIll[330]])) ? 1 : 0) && C.lIIIlIllllIIl(Equipment.contains(item -> item.getName().contains(lIlIIIllll[lIlIIlIIll[329]])) ? 1 : 0)) {
                                                                                        Inventory.getFirst(item -> item.getName().contains(lIlIIIllll[lIlIIlIIll[328]])).interact(lIlIIIllll[lIlIIlIIll[61]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)gC);

                                                                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                }
                                                                                if (C.lIIIlIlllIlll(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)gM);

                                                                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray20 = new int[lIlIIlIIll[1]];
                                                                    nArray20[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                    if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray20)) && C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gM), lIlIIlIIll[6])) {
                                                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[62]];
                                                                        if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray), lIlIIlIIll[1])) {
                                                                            String[] stringArray6 = new String[lIlIIlIIll[1]];
                                                                            stringArray6[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[63]];
                                                                            if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray6), lIlIIlIIll[1])) {
                                                                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[64]];
                                                                                int[] nArray21 = new int[lIlIIlIIll[1]];
                                                                                nArray21[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                                var3 = Inventory.getFirst((int[])nArray21);
                                                                                if (C.lIIIlIlllllII(var3)) {
                                                                                    int[] nArray22 = new int[lIlIIlIIll[1]];
                                                                                    nArray22[C.lIlIIlIIll[0]] = lIlIIlIIll[65];
                                                                                    var2 = TileObjects.getNearest((int[])nArray22);
                                                                                    if (C.lIIIlIlllllII(var2)) {
                                                                                        var3.useOn((TileObject)var2);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[lIlIIlIIll[1]];
                                                                                            stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[327]];
                                                                                            if (C.lIIIlIlllllII(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = lIlIIlIIll[1];

                                                                                                if (((116 + 110 - 163 + 92 ^ 110 + 25 - -46 + 13) & (0x47 ^ 0x67 ^ (0xB8 ^ 0xC1) ^ -1)) != 0) {
                                                                                                    return ((0x77 ^ 0x2D ^ (0xED ^ 0x83)) & (0xFA ^ 0xB2 ^ (0xF1 ^ 0x8D) ^ -1)) != 0;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lIlIIlIIll[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lIlIIlIIll[66]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int[] nArray23 = new int[lIlIIlIIll[1]];
                                                                    nArray23[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                    if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray23))) {
                                                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[67]];
                                                                        if (C.lIIIlIlllllII(TileObjects.getNearest((String[])stringArray))) {
                                                                            String[] stringArray7 = new String[lIlIIlIIll[1]];
                                                                            stringArray7[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[68]];
                                                                            if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray7), lIlIIlIIll[1])) {
                                                                                String[] stringArray8 = new String[lIlIIlIIll[1]];
                                                                                stringArray8[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[69]];
                                                                                if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray8), lIlIIlIIll[1])) {
                                                                                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[2]];
                                                                                    if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gN), lIlIIlIIll[6])) {
                                                                                        Movement.walkTo((WorldPoint)gN);

                                                                                    }
                                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gN), lIlIIlIIll[6])) {
                                                                                        int[] nArray24 = new int[lIlIIlIIll[1]];
                                                                                        nArray24[C.lIlIIlIIll[0]] = lIlIIlIIll[70];
                                                                                        var3 = TileObjects.getNearest((int[])nArray24);
                                                                                        if (C.lIIIlIlllllII(var3)) {
                                                                                            var3.interact(lIlIIIllll[lIlIIlIIll[71]]);
                                                                                            Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                        }
                                                                                        int[] nArray25 = new int[lIlIIlIIll[1]];
                                                                                        nArray25[C.lIlIIlIIll[0]] = lIlIIlIIll[72];
                                                                                        var2 = TileObjects.getNearest((int[])nArray25);
                                                                                        if (C.lIIIlIlllllII(var2)) {
                                                                                            var2.interact(lIlIIIllll[lIlIIlIIll[73]]);
                                                                                            Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!C.lIIIlIlllllll(e.j(lIlIIlIIll[10]), lIlIIlIIll[6])) break block265;
                                                                dc = lIlIIlIIll[0];
                                                                int[] nArray = new int[lIlIIlIIll[1]];
                                                                nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray))) {
                                                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[74]];
                                                                    if (C.lIIIlIlllllII(TileObjects.getNearest((String[])stringArray))) {
                                                                        String[] stringArray9 = new String[lIlIIlIIll[1]];
                                                                        stringArray9[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[75]];
                                                                        if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray9), lIlIIlIIll[1])) {
                                                                            String[] stringArray10 = new String[lIlIIlIIll[1]];
                                                                            stringArray10[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[76]];
                                                                            if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray10), lIlIIlIIll[1])) {
                                                                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[77]];
                                                                                if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gN), lIlIIlIIll[6])) {
                                                                                    Movement.walkTo((WorldPoint)gN);

                                                                                }
                                                                                if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gN), lIlIIlIIll[6])) {
                                                                                    int[] nArray26 = new int[lIlIIlIIll[1]];
                                                                                    nArray26[C.lIlIIlIIll[0]] = lIlIIlIIll[70];
                                                                                    var3 = TileObjects.getNearest((int[])nArray26);
                                                                                    if (C.lIIIlIlllllII(var3)) {
                                                                                        var3.interact(lIlIIIllll[lIlIIlIIll[78]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                    }
                                                                                    int[] nArray27 = new int[lIlIIlIIll[1]];
                                                                                    nArray27[C.lIlIIlIIll[0]] = lIlIIlIIll[72];
                                                                                    var2 = TileObjects.getNearest((int[])nArray27);
                                                                                    if (C.lIIIlIlllllII(var2)) {
                                                                                        var2.interact(lIlIIIllll[lIlIIlIIll[79]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int[] nArray28 = new int[lIlIIlIIll[1]];
                                                                nArray28[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                                if (!C.lIIIlIlllllIl(Inventory.getCount((int[])nArray28))) break block266;
                                                                String[] stringArray = new String[lIlIIlIIll[1]];
                                                                stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[80]];
                                                                if (!C.lIIIllIIIIIIl(TileObjects.getNearest((String[])stringArray))) break block267;
                                                                int[] nArray29 = new int[lIlIIlIIll[1]];
                                                                nArray29[C.lIlIIlIIll[0]] = lIlIIlIIll[81];
                                                                if (!C.lIIIlIlllllII(TileObjects.getNearest((int[])nArray29))) break block266;
                                                            }
                                                            String[] stringArray = new String[lIlIIlIIll[1]];
                                                            stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[82]];
                                                            if (C.lIIIlIlllllIl(Inventory.getCount((String[])stringArray))) {
                                                                String[] stringArray11 = new String[lIlIIlIIll[1]];
                                                                stringArray11[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[83]];
                                                                if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray11), lIlIIlIIll[1])) {
                                                                    if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gO), lIlIIlIIll[5])) {
                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[84]];
                                                                        Movement.walkTo((WorldPoint)gO);

                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                    }
                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gO), lIlIIlIIll[5])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[81];
                                                                        var3 = TileObjects.getNearest((int[])nArray);
                                                                        if (C.lIIIlIlllllII(var3)) {
                                                                            var3.interact(lIlIIIllll[lIlIIlIIll[85]]);
                                                                            Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                        if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray))) {
                                                            String[] stringArray = new String[lIlIIlIIll[1]];
                                                            stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[86]];
                                                            if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray), lIlIIlIIll[1])) {
                                                                String[] stringArray12 = new String[lIlIIlIIll[1]];
                                                                stringArray12[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[10]];
                                                                if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray12), lIlIIlIIll[1])) {
                                                                    String[] stringArray13 = new String[lIlIIlIIll[1]];
                                                                    stringArray13[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[87]];
                                                                    if (C.lIIIlIllllIII(Inventory.getCount((String[])stringArray13), lIlIIlIIll[1]) && C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gO), lIlIIlIIll[6])) {
                                                                        String[] stringArray14 = new String[lIlIIlIIll[1]];
                                                                        stringArray14[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[88]];
                                                                        if (C.lIIIlIlllllIl(Inventory.getCount((String[])stringArray14))) {
                                                                            String[] stringArray15 = new String[lIlIIlIIll[1]];
                                                                            stringArray15[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[89]];
                                                                            if (C.lIIIlIlllllIl(Inventory.getCount((String[])stringArray15))) {
                                                                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[90]];
                                                                                if (C.lIIIlIllllIIl(Equipment.contains((int[])f.aN) ? 1 : 0) && C.lIIIlIlllIlll(Inventory.contains((int[])f.aN) ? 1 : 0)) {
                                                                                    Inventory.getFirst((int[])f.aN).interact(lIlIIIllll[lIlIIlIIll[91]]);
                                                                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                }
                                                                                if (C.lIIIlIlllIlll(Equipment.contains((int[])f.aN) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)gL);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gL), lIlIIlIIll[30])) break block268;
                                                        int[] nArray30 = new int[lIlIIlIIll[1]];
                                                        nArray30[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                        if (!C.lIIIlIlllllIl(Inventory.getCount((int[])nArray30))) break block268;
                                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[92]];
                                                        if (!C.lIIIlIllllIll(Inventory.getCount((String[])stringArray), lIlIIlIIll[1])) break block269;
                                                        String[] stringArray16 = new String[lIlIIlIIll[1]];
                                                        stringArray16[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[93]];
                                                        if (!C.lIIIlIllllIll(Inventory.getCount((String[])stringArray16), lIlIIlIIll[1])) break block269;
                                                        String[] stringArray17 = new String[lIlIIlIIll[1]];
                                                        stringArray17[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[94]];
                                                        if (!C.lIIIlIllllIII(Inventory.getCount((String[])stringArray17), lIlIIlIIll[1])) break block268;
                                                    }
                                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[95]];
                                                    if (C.lIIIlIlllllIl(Inventory.getCount((String[])stringArray))) {
                                                        String[] stringArray18 = new String[lIlIIlIIll[1]];
                                                        stringArray18[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[96]];
                                                        if (C.lIIIlIlllllIl(Inventory.getCount((String[])stringArray18))) {
                                                            if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lIlIIlIIll[6])) {
                                                                Movement.walkTo((WorldPoint)gL);

                                                            }
                                                            if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gL), lIlIIlIIll[6])) {
                                                                if (C.lIIIlIllllIIl(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[97]];
                                                                    a.a();
                                                                }
                                                                if (C.lIIIlIlllIlll(Bank.isOpen() ? 1 : 0)) {
                                                                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[98]];
                                                                    String[] stringArray19 = new String[lIlIIlIIll[1]];
                                                                    stringArray19[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[99]];
                                                                    Bank.depositAll((String[])stringArray19);
                                                                    if (C.lIIIlIllllIlI(Inventory.getAll().size(), lIlIIlIIll[34])) {
                                                                        Bank.deposit((String)lIlIIIllll[lIlIIlIIll[100]], (int)lIlIIlIIll[7]);
                                                                    }
                                                                    String[] stringArray20 = new String[lIlIIlIIll[1]];
                                                                    stringArray20[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[101]];
                                                                    if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray20) ? 1 : 0)) {
                                                                        a.a(lIlIIlIIll[15], lIlIIlIIll[11]);
                                                                    }
                                                                    String[] stringArray21 = new String[lIlIIlIIll[1]];
                                                                    stringArray21[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[102]];
                                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                                                                        String[] stringArray22 = new String[lIlIIlIIll[1]];
                                                                        stringArray22[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[103]];
                                                                        if (C.lIIIlIllllIII(Inventory.getFirst((String[])stringArray22).getQuantity(), lIlIIlIIll[11])) {
                                                                            String[] stringArray23 = new String[lIlIIlIIll[1]];
                                                                            stringArray23[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[105]];
                                                                            Bank.withdraw((String)lIlIIIllll[lIlIIlIIll[104]], (int)(lIlIIlIIll[11] - Inventory.getFirst((String[])stringArray23).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIlIIlIIll[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray24 = new String[lIlIIlIIll[1]];
                                                                    stringArray24[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[106]];
                                                                    if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray24) ? 1 : 0)) {
                                                                        a.a(lIlIIlIIll[16], lIlIIlIIll[11]);
                                                                    }
                                                                    String[] stringArray25 = new String[lIlIIlIIll[1]];
                                                                    stringArray25[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[107]];
                                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray25) ? 1 : 0)) {
                                                                        String[] stringArray26 = new String[lIlIIlIIll[1]];
                                                                        stringArray26[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[108]];
                                                                        if (C.lIIIlIllllIII(Inventory.getFirst((String[])stringArray26).getQuantity(), lIlIIlIIll[11])) {
                                                                            String[] stringArray27 = new String[lIlIIlIIll[1]];
                                                                            stringArray27[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[110]];
                                                                            Bank.withdraw((String)lIlIIIllll[lIlIIlIIll[109]], (int)(lIlIIlIIll[11] - Inventory.getFirst((String[])stringArray27).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIlIIlIIll[9]);

                                                                        }
                                                                    }
                                                                    String[] stringArray28 = new String[lIlIIlIIll[1]];
                                                                    stringArray28[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[111]];
                                                                    if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray28) ? 1 : 0)) {
                                                                        a.a(lIlIIlIIll[14], lIlIIlIIll[11]);
                                                                    }
                                                                    String[] stringArray29 = new String[lIlIIlIIll[1]];
                                                                    stringArray29[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[112]];
                                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray29) ? 1 : 0)) {
                                                                        String[] stringArray30 = new String[lIlIIlIIll[1]];
                                                                        stringArray30[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[113]];
                                                                        if (C.lIIIlIllllIII(Inventory.getFirst((String[])stringArray30).getQuantity(), lIlIIlIIll[11])) {
                                                                            String[] stringArray31 = new String[lIlIIlIIll[1]];
                                                                            stringArray31[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[115]];
                                                                            Bank.withdraw((String)lIlIIIllll[lIlIIlIIll[114]], (int)(lIlIIlIIll[11] - Inventory.getFirst((String[])stringArray31).getQuantity()), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                                                            Time.sleepTicks((int)lIlIIlIIll[9]);

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray = new int[lIlIIlIIll[1]];
                                                nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                if (C.lIIIlIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[116]];
                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray32 = new String[lIlIIlIIll[1]];
                                                        stringArray32[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[117]];
                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray32).getQuantity(), lIlIIlIIll[11])) {
                                                            String[] stringArray33 = new String[lIlIIlIIll[1]];
                                                            stringArray33[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[118]];
                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray33) ? 1 : 0)) {
                                                                String[] stringArray34 = new String[lIlIIlIIll[1]];
                                                                stringArray34[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[119]];
                                                                if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray34).getQuantity(), lIlIIlIIll[11])) {
                                                                    String[] stringArray35 = new String[lIlIIlIIll[1]];
                                                                    stringArray35[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[120]];
                                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray35) ? 1 : 0)) {
                                                                        String[] stringArray36 = new String[lIlIIlIIll[1]];
                                                                        stringArray36[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[121]];
                                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray36).getQuantity(), lIlIIlIIll[11])) {
                                                                            String[] stringArray37 = new String[lIlIIlIIll[1]];
                                                                            stringArray37[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[122]];
                                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray37) ? 1 : 0)) {
                                                                                String[] stringArray38 = new String[lIlIIlIIll[1]];
                                                                                stringArray38[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[123]];
                                                                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray38) ? 1 : 0) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIlIIlIIll[1])) {
                                                                                    if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gF), lIlIIlIIll[6]) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gE), lIlIIlIIll[6])) {
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[124]];
                                                                                        if (C.lIIIlIlllIlll(Dialog.isOpen() ? 1 : 0)) {
                                                                                            Dialog.close();
                                                                                        }
                                                                                        Movement.walkTo((WorldPoint)gQ);

                                                                                    }
                                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gF), lIlIIlIIll[7]) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gE), lIlIIlIIll[6])) {
                                                                                        String[] stringArray39 = new String[lIlIIlIIll[1]];
                                                                                        stringArray39[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[125]];
                                                                                        var3 = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[lIlIIlIIll[1]];
                                                                                        stringArray40[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[126]];
                                                                                        var2 = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[127]];
                                                                                        if (C.lIIIlIlllllII(var3) && C.lIIIlIlllllII(var2)) {
                                                                                            var3.useOn((TileObject)var2);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gE), lIlIIlIIll[6])) {
                                                                                                    bl = lIlIIlIIll[1];

                                                                                                    if (2 <= ((29 + 158 - 147 + 128 ^ 147 + 163 - 173 + 36) & (0x38 ^ 0x56 ^ (0x4F ^ 0x24) ^ -1))) {
                                                                                                        return false;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = lIlIIlIIll[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lIlIIlIIll[128]);

                                                                                        }
                                                                                    }
                                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gE), lIlIIlIIll[6])) {
                                                                                        String[] stringArray41 = new String[lIlIIlIIll[1]];
                                                                                        stringArray41[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[129]];
                                                                                        var3 = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[lIlIIlIIll[1]];
                                                                                        nArray31[C.lIlIIlIIll[0]] = lIlIIlIIll[130];
                                                                                        var2 = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[131]];
                                                                                        if (C.lIIIlIlllllII(var3) && C.lIIIlIlllllII(var2)) {
                                                                                            var3.useOn((TileObject)var2);
                                                                                            Time.sleepTicks((int)lIlIIlIIll[7]);

                                                                                        }
                                                                                    }
                                                                                    if (C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gP) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[lIlIIlIIll[1]];
                                                                                        stringArray42[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[132]];
                                                                                        var3 = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[133]];
                                                                                        if (C.lIIIlIlllllII(var3)) {
                                                                                            var3.interact(lIlIIIllll[lIlIIlIIll[134]]);
                                                                                            Time.sleepTicks((int)lIlIIlIIll[3]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (C.lIIIlIlllllll(e.j(lIlIIlIIll[10]), lIlIIlIIll[7])) {
                                                int[] nArray = new int[lIlIIlIIll[1]];
                                                nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                if (C.lIIIlIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[135]];
                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray43 = new String[lIlIIlIIll[1]];
                                                        stringArray43[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[136]];
                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray43).getQuantity(), lIlIIlIIll[11])) {
                                                            String[] stringArray44 = new String[lIlIIlIIll[1]];
                                                            stringArray44[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[137]];
                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray44) ? 1 : 0)) {
                                                                String[] stringArray45 = new String[lIlIIlIIll[1]];
                                                                stringArray45[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[138]];
                                                                if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray45).getQuantity(), lIlIIlIIll[11])) {
                                                                    String[] stringArray46 = new String[lIlIIlIIll[1]];
                                                                    stringArray46[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[139]];
                                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray46) ? 1 : 0)) {
                                                                        String[] stringArray47 = new String[lIlIIlIIll[1]];
                                                                        stringArray47[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[140]];
                                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray47).getQuantity(), lIlIIlIIll[11])) {
                                                                            String[] stringArray48 = new String[lIlIIlIIll[1]];
                                                                            stringArray48[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[141]];
                                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray48) ? 1 : 0)) {
                                                                                String[] stringArray49 = new String[lIlIIlIIll[1]];
                                                                                stringArray49[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[142]];
                                                                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray49) ? 1 : 0)) {
                                                                                    int[] nArray32 = new int[lIlIIlIIll[1]];
                                                                                    nArray32[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                                                                    if (C.lIIIlIllllIII(Inventory.getCount((int[])nArray32), lIlIIlIIll[1]) && C.lIIIlIllllIIl(Players.getLocal().getWorldLocation().equals((Object)gP) ? 1 : 0)) {
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[144]];
                                                                                        if (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIlIIlIIll[3])) {
                                                                                            Movement.walkTo((WorldPoint)gQ);

                                                                                        }
                                                                                        if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIlIIlIIll[3])) {
                                                                                            int[] nArray33 = new int[lIlIIlIIll[1]];
                                                                                            nArray33[C.lIlIIlIIll[0]] = lIlIIlIIll[145];
                                                                                            var3 = TileObjects.getNearest((int[])nArray33);
                                                                                            if (C.lIIIlIlllllII(var3)) {
                                                                                                var3.interact(lIlIIIllll[lIlIIlIIll[146]]);
                                                                                                Time.sleepTicks((int)lIlIIlIIll[3]);

                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray34 = new int[lIlIIlIIll[1]];
                                                nArray34[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                if (C.lIIIlIlllIlll(Inventory.contains((int[])nArray34) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[147]];
                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray50 = new String[lIlIIlIIll[1]];
                                                        stringArray50[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[148]];
                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray50).getQuantity(), lIlIIlIIll[11])) {
                                                            String[] stringArray51 = new String[lIlIIlIIll[1]];
                                                            stringArray51[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[149]];
                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray51) ? 1 : 0)) {
                                                                String[] stringArray52 = new String[lIlIIlIIll[1]];
                                                                stringArray52[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[150]];
                                                                if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray52).getQuantity(), lIlIIlIIll[11])) {
                                                                    String[] stringArray53 = new String[lIlIIlIIll[1]];
                                                                    stringArray53[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[151]];
                                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray53) ? 1 : 0)) {
                                                                        String[] stringArray54 = new String[lIlIIlIIll[1]];
                                                                        stringArray54[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[152]];
                                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray54).getQuantity(), lIlIIlIIll[11])) {
                                                                            String[] stringArray55 = new String[lIlIIlIIll[1]];
                                                                            stringArray55[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[153]];
                                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray55) ? 1 : 0)) {
                                                                                String[] stringArray56 = new String[lIlIIlIIll[1]];
                                                                                stringArray56[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[154]];
                                                                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray56) ? 1 : 0)) {
                                                                                    int[] nArray35 = new int[lIlIIlIIll[1]];
                                                                                    nArray35[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                                                                    if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray35)) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gR), lIlIIlIIll[3]) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gS), lIlIIlIIll[5])) {
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[155]];
                                                                                        Movement.walkTo((WorldPoint)gR);

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray36 = new int[lIlIIlIIll[1]];
                                                nArray36[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                if (C.lIIIlIlllIlll(Inventory.contains((int[])nArray36) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[156]];
                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray57 = new String[lIlIIlIIll[1]];
                                                        stringArray57[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[157]];
                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray57).getQuantity(), lIlIIlIIll[11])) {
                                                            String[] stringArray58 = new String[lIlIIlIIll[1]];
                                                            stringArray58[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[158]];
                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray58) ? 1 : 0)) {
                                                                String[] stringArray59 = new String[lIlIIlIIll[1]];
                                                                stringArray59[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[159]];
                                                                if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray59).getQuantity(), lIlIIlIIll[11])) {
                                                                    String[] stringArray60 = new String[lIlIIlIIll[1]];
                                                                    stringArray60[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[160]];
                                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray60) ? 1 : 0)) {
                                                                        String[] stringArray61 = new String[lIlIIlIIll[1]];
                                                                        stringArray61[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[161]];
                                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray61).getQuantity(), lIlIIlIIll[11])) {
                                                                            String[] stringArray62 = new String[lIlIIlIIll[1]];
                                                                            stringArray62[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[162]];
                                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray62) ? 1 : 0)) {
                                                                                String[] stringArray63 = new String[lIlIIlIIll[1]];
                                                                                stringArray63[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[163]];
                                                                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray63) ? 1 : 0)) {
                                                                                    int[] nArray37 = new int[lIlIIlIIll[1]];
                                                                                    nArray37[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                                                                    if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray37)) && C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gR), lIlIIlIIll[5])) {
                                                                                        int[] nArray38 = new int[lIlIIlIIll[1]];
                                                                                        nArray38[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                                                                        var3 = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[lIlIIlIIll[1]];
                                                                                        stringArray64[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[164]];
                                                                                        var2 = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (C.lIIIlIlllllII(var3) && C.lIIIlIlllllII(var2)) {
                                                                                            var3.useOn((TileObject)var2);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)gP), (int)lIlIIlIIll[165]);

                                                                                        }
                                                                                        while (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gS), lIlIIlIIll[3])) {
                                                                                            Movement.walkTo((WorldPoint)gS);

                                                                                            Time.sleepTicks((int)lIlIIlIIll[1]);

                                                                                            if (((76 + 72 - 21 + 23 ^ 85 + 60 - -17 + 27) & (72 + 85 - 43 + 59 ^ 11 + 99 - 86 + 110 ^ -1)) == 0) continue;
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int[] nArray39 = new int[lIlIIlIIll[1]];
                                                nArray39[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                                if (C.lIIIlIlllIlll(Inventory.contains((int[])nArray39) ? 1 : 0)) {
                                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[166]];
                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                        String[] stringArray65 = new String[lIlIIlIIll[1]];
                                                        stringArray65[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[167]];
                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray65).getQuantity(), lIlIIlIIll[11])) {
                                                            String[] stringArray66 = new String[lIlIIlIIll[1]];
                                                            stringArray66[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[168]];
                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray66) ? 1 : 0)) {
                                                                String[] stringArray67 = new String[lIlIIlIIll[1]];
                                                                stringArray67[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[169]];
                                                                if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray67).getQuantity(), lIlIIlIIll[11])) {
                                                                    String[] stringArray68 = new String[lIlIIlIIll[1]];
                                                                    stringArray68[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[170]];
                                                                    if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray68) ? 1 : 0)) {
                                                                        String[] stringArray69 = new String[lIlIIlIIll[1]];
                                                                        stringArray69[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[171]];
                                                                        if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray69).getQuantity(), lIlIIlIIll[11])) {
                                                                            String[] stringArray70 = new String[lIlIIlIIll[1]];
                                                                            stringArray70[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[172]];
                                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray70) ? 1 : 0)) {
                                                                                String[] stringArray71 = new String[lIlIIlIIll[1]];
                                                                                stringArray71[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[173]];
                                                                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray71) ? 1 : 0)) {
                                                                                    int[] nArray40 = new int[lIlIIlIIll[1]];
                                                                                    nArray40[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                                                                    if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray40)) && C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gS), lIlIIlIIll[5])) {
                                                                                        int[] nArray41 = new int[lIlIIlIIll[1]];
                                                                                        nArray41[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                                                                        var3 = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[lIlIIlIIll[1]];
                                                                                        stringArray72[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[174]];
                                                                                        var2 = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (C.lIIIlIlllllII(var3) && C.lIIIlIlllllII(var2)) {
                                                                                            var2.interact(lIlIIIllll[lIlIIlIIll[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)gP), (int)lIlIIlIIll[165]);

                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (!C.lIIIlIlllllll(e.j(lIlIIlIIll[10]), lIlIIlIIll[11])) break block270;
                                            int[] nArray = new int[lIlIIlIIll[1]];
                                            nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                            if (C.lIIIlIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                String[] stringArray = new String[lIlIIlIIll[1]];
                                                stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[176]];
                                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                    String[] stringArray73 = new String[lIlIIlIIll[1]];
                                                    stringArray73[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[177]];
                                                    if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray73).getQuantity(), lIlIIlIIll[11])) {
                                                        String[] stringArray74 = new String[lIlIIlIIll[1]];
                                                        stringArray74[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[178]];
                                                        if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray74) ? 1 : 0)) {
                                                            String[] stringArray75 = new String[lIlIIlIIll[1]];
                                                            stringArray75[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[179]];
                                                            if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray75).getQuantity(), lIlIIlIIll[11])) {
                                                                String[] stringArray76 = new String[lIlIIlIIll[1]];
                                                                stringArray76[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[180]];
                                                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray76) ? 1 : 0)) {
                                                                    String[] stringArray77 = new String[lIlIIlIIll[1]];
                                                                    stringArray77[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[181]];
                                                                    if (C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray77).getQuantity(), lIlIIlIIll[11])) {
                                                                        String[] stringArray78 = new String[lIlIIlIIll[1]];
                                                                        stringArray78[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[182]];
                                                                        if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray78) ? 1 : 0)) {
                                                                            String[] stringArray79 = new String[lIlIIlIIll[1]];
                                                                            stringArray79[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[183]];
                                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray79) ? 1 : 0)) {
                                                                                int[] nArray42 = new int[lIlIIlIIll[1]];
                                                                                nArray42[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                                                                if (C.lIIIlIlllllIl(Inventory.getCount((int[])nArray42)) && C.lIIIlIlllIlll(gh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gY), lIlIIlIIll[1])) {
                                                                                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[184]];
                                                                                    Movement.walkTo((WorldPoint)gY);

                                                                                    Time.sleepTicks((int)lIlIIlIIll[6]);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            int[] nArray43 = new int[lIlIIlIIll[1]];
                                            nArray43[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                            if (!C.lIIIlIlllIlll(Inventory.contains((int[])nArray43) ? 1 : 0)) break block248;
                                            String[] stringArray = new String[lIlIIlIIll[1]];
                                            stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[185]];
                                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block248;
                                            String[] stringArray80 = new String[lIlIIlIIll[1]];
                                            stringArray80[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[186]];
                                            if (!C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray80).getQuantity(), lIlIIlIIll[11])) break block248;
                                            String[] stringArray81 = new String[lIlIIlIIll[1]];
                                            stringArray81[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[187]];
                                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray81) ? 1 : 0)) break block248;
                                            String[] stringArray82 = new String[lIlIIlIIll[1]];
                                            stringArray82[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[188]];
                                            if (!C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray82).getQuantity(), lIlIIlIIll[11])) break block248;
                                            String[] stringArray83 = new String[lIlIIlIIll[1]];
                                            stringArray83[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[189]];
                                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray83) ? 1 : 0)) break block248;
                                            String[] stringArray84 = new String[lIlIIlIIll[1]];
                                            stringArray84[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[190]];
                                            if (!C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray84).getQuantity(), lIlIIlIIll[11])) break block248;
                                            String[] stringArray85 = new String[lIlIIlIIll[1]];
                                            stringArray85[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[191]];
                                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray85) ? 1 : 0)) break block248;
                                            String[] stringArray86 = new String[lIlIIlIIll[1]];
                                            stringArray86[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[192]];
                                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray86) ? 1 : 0)) break block248;
                                            int[] nArray44 = new int[lIlIIlIIll[1]];
                                            nArray44[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                            if (!C.lIIIlIlllllIl(Inventory.getCount((int[])nArray44)) || !C.lIIIlIlllIlll(gh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gY), lIlIIlIIll[3])) break block248;
                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[193]];
                                            do {
                                                block272: {
                                                    block273: {
                                                        block271: {
                                                            String[] stringArray87 = new String[lIlIIlIIll[1]];
                                                            stringArray87[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[194]];
                                                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray87) ? 1 : 0)) break block271;
                                                            String[] stringArray88 = new String[lIlIIlIIll[1]];
                                                            stringArray88[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[195]];
                                                            if (!C.lIIIlIllllIII(Inventory.getFirst((String[])stringArray88).getQuantity(), lIlIIlIIll[11])) break block272;
                                                        }
                                                        String[] stringArray89 = new String[lIlIIlIIll[1]];
                                                        stringArray89[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[196]];
                                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray89) ? 1 : 0)) break block273;
                                                        String[] stringArray90 = new String[lIlIIlIIll[1]];
                                                        stringArray90[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[197]];
                                                        if (!C.lIIIlIllllIII(Inventory.getFirst((String[])stringArray90).getQuantity(), lIlIIlIIll[11])) break block272;
                                                    }
                                                    String[] stringArray91 = new String[lIlIIlIIll[1]];
                                                    stringArray91[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[198]];
                                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray91) ? 1 : 0)) break block248;
                                                    String[] stringArray92 = new String[lIlIIlIIll[1]];
                                                    stringArray92[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[199]];
                                                    if (!C.lIIIlIllllIll(Inventory.getFirst((String[])stringArray92).getQuantity(), lIlIIlIIll[11])) break block248;
                                                }
                                                if (!C.lIIIlIllllIIl(AccBuilderShamans.d ? 1 : 0)) break block248;
                                                int[] nArray45 = new int[lIlIIlIIll[1]];
                                                nArray45[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                                                var3 = TileObjects.getFirstAt((WorldPoint)gi, (int[])nArray45);
                                                String[] stringArray93 = new String[lIlIIlIIll[1]];
                                                stringArray93[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)var3);
                                                Time.sleepTicks((int)lIlIIlIIll[1]);

                                                String[] stringArray94 = new String[lIlIIlIIll[1]];
                                                stringArray94[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)var3);
                                                Time.sleepTicks((int)lIlIIlIIll[1]);

                                                String[] stringArray95 = new String[lIlIIlIIll[1]];
                                                stringArray95[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)var3);
                                                Time.sleepTicks((int)lIlIIlIIll[1]);

                                            } while (((0x82 ^ 0xB9) & ~(0x3C ^ 7) ^ (0x4B ^ 0x4F)) != 0);
                                            return;
                                        }
                                        int[] nArray = new int[lIlIIlIIll[1]];
                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                        if (!C.lIIIlIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block249;
                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[204]];
                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block249;
                                        String[] stringArray96 = new String[lIlIIlIIll[1]];
                                        stringArray96[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[205]];
                                        if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray96).getQuantity(), lIlIIlIIll[7])) break block249;
                                        String[] stringArray97 = new String[lIlIIlIIll[1]];
                                        stringArray97[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[206]];
                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray97) ? 1 : 0)) break block249;
                                        String[] stringArray98 = new String[lIlIIlIIll[1]];
                                        stringArray98[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[207]];
                                        if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray98).getQuantity(), lIlIIlIIll[7])) break block249;
                                        String[] stringArray99 = new String[lIlIIlIIll[1]];
                                        stringArray99[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[208]];
                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray99) ? 1 : 0)) break block249;
                                        String[] stringArray100 = new String[lIlIIlIIll[1]];
                                        stringArray100[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[209]];
                                        if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray100).getQuantity(), lIlIIlIIll[7])) break block249;
                                        String[] stringArray101 = new String[lIlIIlIIll[1]];
                                        stringArray101[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[210]];
                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray101) ? 1 : 0)) break block249;
                                        String[] stringArray102 = new String[lIlIIlIIll[1]];
                                        stringArray102[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[211]];
                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray102) ? 1 : 0)) break block249;
                                        int[] nArray46 = new int[lIlIIlIIll[1]];
                                        nArray46[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                        if (!C.lIIIlIlllllIl(Inventory.getCount((int[])nArray46)) || !C.lIIIlIlllIlll(gh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gX), lIlIIlIIll[1])) break block249;
                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[212]];
                                        while (true) {
                                            block275: {
                                                block276: {
                                                    block274: {
                                                        String[] stringArray103 = new String[lIlIIlIIll[1]];
                                                        stringArray103[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[213]];
                                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray103) ? 1 : 0)) break block274;
                                                        String[] stringArray104 = new String[lIlIIlIIll[1]];
                                                        stringArray104[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[214]];
                                                        if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray104).getQuantity(), lIlIIlIIll[7])) break block275;
                                                    }
                                                    String[] stringArray105 = new String[lIlIIlIIll[1]];
                                                    stringArray105[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[215]];
                                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray105) ? 1 : 0)) break block276;
                                                    String[] stringArray106 = new String[lIlIIlIIll[1]];
                                                    stringArray106[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[216]];
                                                    if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray106).getQuantity(), lIlIIlIIll[7])) break block275;
                                                }
                                                String[] stringArray107 = new String[lIlIIlIIll[1]];
                                                stringArray107[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[217]];
                                                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray107) ? 1 : 0)) break block249;
                                                String[] stringArray108 = new String[lIlIIlIIll[1]];
                                                stringArray108[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[218]];
                                                if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray108).getQuantity(), lIlIIlIIll[7])) break block249;
                                            }
                                            if (!C.lIIIlIllllIIl(AccBuilderShamans.d ? 1 : 0)) break block249;
                                            if (C.lIIIlIllllIIl(Players.getLocal().getWorldLocation().equals((Object)gX) ? 1 : 0)) {
                                                Movement.walkTo((WorldPoint)gX);

                                                Time.sleepTicks((int)lIlIIlIIll[5]);

                                            }
                                            if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gX) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lIlIIlIIll[1]];
                                            nArray47[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                                            var3 = TileObjects.getFirstAt((WorldPoint)gj, (int[])nArray47);
                                            String[] stringArray109 = new String[lIlIIlIIll[1]];
                                            stringArray109[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)var3);
                                            Time.sleepTicks((int)lIlIIlIIll[1]);

                                            String[] stringArray110 = new String[lIlIIlIIll[1]];
                                            stringArray110[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)var3);
                                            Time.sleepTicks((int)lIlIIlIIll[1]);

                                            String[] stringArray111 = new String[lIlIIlIIll[1]];
                                            stringArray111[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)var3);
                                            Time.sleepTicks((int)lIlIIlIIll[1]);

                                            if (-2 >= 0) break;
                                        }
                                        return;
                                    }
                                    int[] nArray = new int[lIlIIlIIll[1]];
                                    nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                    if (!C.lIIIlIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block250;
                                    String[] stringArray = new String[lIlIIlIIll[1]];
                                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[222]];
                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block250;
                                    String[] stringArray112 = new String[lIlIIlIIll[1]];
                                    stringArray112[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[223]];
                                    if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray112).getQuantity(), lIlIIlIIll[6])) break block250;
                                    String[] stringArray113 = new String[lIlIIlIIll[1]];
                                    stringArray113[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[224]];
                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray113) ? 1 : 0)) break block250;
                                    String[] stringArray114 = new String[lIlIIlIIll[1]];
                                    stringArray114[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[225]];
                                    if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray114).getQuantity(), lIlIIlIIll[6])) break block250;
                                    String[] stringArray115 = new String[lIlIIlIIll[1]];
                                    stringArray115[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[226]];
                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray115) ? 1 : 0)) break block250;
                                    String[] stringArray116 = new String[lIlIIlIIll[1]];
                                    stringArray116[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[227]];
                                    if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray116).getQuantity(), lIlIIlIIll[6])) break block250;
                                    String[] stringArray117 = new String[lIlIIlIIll[1]];
                                    stringArray117[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[228]];
                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray117) ? 1 : 0)) break block250;
                                    String[] stringArray118 = new String[lIlIIlIIll[1]];
                                    stringArray118[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[229]];
                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray118) ? 1 : 0)) break block250;
                                    int[] nArray48 = new int[lIlIIlIIll[1]];
                                    nArray48[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                    if (!C.lIIIlIlllllIl(Inventory.getCount((int[])nArray48)) || !C.lIIIlIlllIlll(gh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block250;
                                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[230]];
                                    while (true) {
                                        block278: {
                                            block279: {
                                                block277: {
                                                    String[] stringArray119 = new String[lIlIIlIIll[1]];
                                                    stringArray119[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[231]];
                                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray119) ? 1 : 0)) break block277;
                                                    String[] stringArray120 = new String[lIlIIlIIll[1]];
                                                    stringArray120[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[232]];
                                                    if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray120).getQuantity(), lIlIIlIIll[6])) break block278;
                                                }
                                                String[] stringArray121 = new String[lIlIIlIIll[1]];
                                                stringArray121[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[233]];
                                                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray121) ? 1 : 0)) break block279;
                                                String[] stringArray122 = new String[lIlIIlIIll[1]];
                                                stringArray122[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[234]];
                                                if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray122).getQuantity(), lIlIIlIIll[6])) break block278;
                                            }
                                            String[] stringArray123 = new String[lIlIIlIIll[1]];
                                            stringArray123[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[235]];
                                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray123) ? 1 : 0)) break block250;
                                            String[] stringArray124 = new String[lIlIIlIIll[1]];
                                            stringArray124[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[236]];
                                            if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray124).getQuantity(), lIlIIlIIll[6])) break block250;
                                        }
                                        if (!C.lIIIlIllllIIl(AccBuilderShamans.d ? 1 : 0)) break block250;
                                        if (C.lIIIlIllllIIl(Players.getLocal().getWorldLocation().equals((Object)gW) ? 1 : 0)) {
                                            Movement.walkTo((WorldPoint)gW);

                                            Time.sleepTicks((int)lIlIIlIIll[5]);

                                        }
                                        if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gW) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lIlIIlIIll[1]];
                                        nArray49[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                                        var3 = TileObjects.getFirstAt((WorldPoint)gk, (int[])nArray49);
                                        String[] stringArray125 = new String[lIlIIlIIll[1]];
                                        stringArray125[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)var3);
                                        Time.sleepTicks((int)lIlIIlIIll[1]);

                                        String[] stringArray126 = new String[lIlIIlIIll[1]];
                                        stringArray126[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)var3);
                                        Time.sleepTicks((int)lIlIIlIIll[1]);

                                        String[] stringArray127 = new String[lIlIIlIIll[1]];
                                        stringArray127[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)var3);
                                        Time.sleepTicks((int)lIlIIlIIll[1]);

                                    }
                                    return;
                                }
                                int[] nArray = new int[lIlIIlIIll[1]];
                                nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                                if (!C.lIIIlIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block251;
                                String[] stringArray = new String[lIlIIlIIll[1]];
                                stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[240]];
                                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block251;
                                String[] stringArray128 = new String[lIlIIlIIll[1]];
                                stringArray128[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[241]];
                                if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray128).getQuantity(), lIlIIlIIll[5])) break block251;
                                String[] stringArray129 = new String[lIlIIlIIll[1]];
                                stringArray129[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[242]];
                                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray129) ? 1 : 0)) break block251;
                                String[] stringArray130 = new String[lIlIIlIIll[1]];
                                stringArray130[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[243]];
                                if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray130).getQuantity(), lIlIIlIIll[5])) break block251;
                                String[] stringArray131 = new String[lIlIIlIIll[1]];
                                stringArray131[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[244]];
                                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray131) ? 1 : 0)) break block251;
                                String[] stringArray132 = new String[lIlIIlIIll[1]];
                                stringArray132[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[245]];
                                if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray132).getQuantity(), lIlIIlIIll[5])) break block251;
                                String[] stringArray133 = new String[lIlIIlIIll[1]];
                                stringArray133[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[246]];
                                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray133) ? 1 : 0)) break block251;
                                String[] stringArray134 = new String[lIlIIlIIll[1]];
                                stringArray134[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[247]];
                                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray134) ? 1 : 0)) break block251;
                                int[] nArray50 = new int[lIlIIlIIll[1]];
                                nArray50[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                                if (!C.lIIIlIlllllIl(Inventory.getCount((int[])nArray50)) || !C.lIIIlIlllIlll(gh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block251;
                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[248]];
                                while (true) {
                                    block281: {
                                        block282: {
                                            block280: {
                                                String[] stringArray135 = new String[lIlIIlIIll[1]];
                                                stringArray135[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[249]];
                                                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray135) ? 1 : 0)) break block280;
                                                String[] stringArray136 = new String[lIlIIlIIll[1]];
                                                stringArray136[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[250]];
                                                if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray136).getQuantity(), lIlIIlIIll[5])) break block281;
                                            }
                                            String[] stringArray137 = new String[lIlIIlIIll[1]];
                                            stringArray137[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[251]];
                                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray137) ? 1 : 0)) break block282;
                                            String[] stringArray138 = new String[lIlIIlIIll[1]];
                                            stringArray138[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[252]];
                                            if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray138).getQuantity(), lIlIIlIIll[5])) break block281;
                                        }
                                        String[] stringArray139 = new String[lIlIIlIIll[1]];
                                        stringArray139[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[8]];
                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray139) ? 1 : 0)) break block251;
                                        String[] stringArray140 = new String[lIlIIlIIll[1]];
                                        stringArray140[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[253]];
                                        if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray140).getQuantity(), lIlIIlIIll[5])) break block251;
                                    }
                                    if (!C.lIIIlIllllIIl(AccBuilderShamans.d ? 1 : 0)) break block251;
                                    if (C.lIIIlIllllIIl(Players.getLocal().getWorldLocation().equals((Object)gV) ? 1 : 0)) {
                                        Movement.walkTo((WorldPoint)gV);

                                        Time.sleepTicks((int)lIlIIlIIll[5]);

                                    }
                                    if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gV) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lIlIIlIIll[1]];
                                    nArray51[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                                    var3 = TileObjects.getFirstAt((WorldPoint)gl, (int[])nArray51);
                                    String[] stringArray141 = new String[lIlIIlIIll[1]];
                                    stringArray141[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)var3);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                    String[] stringArray142 = new String[lIlIIlIIll[1]];
                                    stringArray142[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)var3);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                    String[] stringArray143 = new String[lIlIIlIIll[1]];
                                    stringArray143[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)var3);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                    if ((0x56 ^ 0x76 ^ (0x7D ^ 0x59)) == 0) break;
                                }
                                return;
                            }
                            int[] nArray = new int[lIlIIlIIll[1]];
                            nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                            if (!C.lIIIlIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block252;
                            String[] stringArray = new String[lIlIIlIIll[1]];
                            stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[257]];
                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block252;
                            String[] stringArray144 = new String[lIlIIlIIll[1]];
                            stringArray144[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[258]];
                            if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray144).getQuantity(), lIlIIlIIll[3])) break block252;
                            String[] stringArray145 = new String[lIlIIlIIll[1]];
                            stringArray145[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[259]];
                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray145) ? 1 : 0)) break block252;
                            String[] stringArray146 = new String[lIlIIlIIll[1]];
                            stringArray146[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[260]];
                            if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray146).getQuantity(), lIlIIlIIll[3])) break block252;
                            String[] stringArray147 = new String[lIlIIlIIll[1]];
                            stringArray147[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[261]];
                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray147) ? 1 : 0)) break block252;
                            String[] stringArray148 = new String[lIlIIlIIll[1]];
                            stringArray148[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[262]];
                            if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray148).getQuantity(), lIlIIlIIll[3])) break block252;
                            String[] stringArray149 = new String[lIlIIlIIll[1]];
                            stringArray149[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[263]];
                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray149) ? 1 : 0)) break block252;
                            String[] stringArray150 = new String[lIlIIlIIll[1]];
                            stringArray150[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[264]];
                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray150) ? 1 : 0)) break block252;
                            int[] nArray52 = new int[lIlIIlIIll[1]];
                            nArray52[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                            if (!C.lIIIlIlllllIl(Inventory.getCount((int[])nArray52)) || !C.lIIIlIlllIlll(gh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block252;
                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[265]];
                            while (true) {
                                block284: {
                                    block285: {
                                        block283: {
                                            String[] stringArray151 = new String[lIlIIlIIll[1]];
                                            stringArray151[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[266]];
                                            if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray151) ? 1 : 0)) break block283;
                                            String[] stringArray152 = new String[lIlIIlIIll[1]];
                                            stringArray152[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[267]];
                                            if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray152).getQuantity(), lIlIIlIIll[3])) break block284;
                                        }
                                        String[] stringArray153 = new String[lIlIIlIIll[1]];
                                        stringArray153[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[268]];
                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray153) ? 1 : 0)) break block285;
                                        String[] stringArray154 = new String[lIlIIlIIll[1]];
                                        stringArray154[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[269]];
                                        if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray154).getQuantity(), lIlIIlIIll[3])) break block284;
                                    }
                                    String[] stringArray155 = new String[lIlIIlIIll[1]];
                                    stringArray155[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[270]];
                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray155) ? 1 : 0)) break block252;
                                    String[] stringArray156 = new String[lIlIIlIIll[1]];
                                    stringArray156[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[271]];
                                    if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray156).getQuantity(), lIlIIlIIll[3])) break block252;
                                }
                                if (!C.lIIIlIllllIIl(AccBuilderShamans.d ? 1 : 0)) break block252;
                                if (C.lIIIlIllllIIl(Players.getLocal().getWorldLocation().equals((Object)gU) ? 1 : 0)) {
                                    Movement.walkTo((WorldPoint)gU);

                                    Time.sleepTicks((int)lIlIIlIIll[5]);

                                }
                                if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gU) ? 1 : 0)) continue;
                                int[] nArray53 = new int[lIlIIlIIll[1]];
                                nArray53[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                                var3 = TileObjects.getFirstAt((WorldPoint)gm, (int[])nArray53);
                                String[] stringArray157 = new String[lIlIIlIIll[1]];
                                stringArray157[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[272]];
                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[lIlIIlIIll[1]];
                                    stringArray158[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)var3);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                }
                                String[] stringArray159 = new String[lIlIIlIIll[1]];
                                stringArray159[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[274]];
                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lIlIIlIIll[1]];
                                    stringArray160[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)var3);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                }
                                String[] stringArray161 = new String[lIlIIlIIll[1]];
                                stringArray161[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[276]];
                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lIlIIlIIll[1]];
                                    stringArray162[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)var3);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);

                                }

                                if ((0x16 ^ 0x13) <= 0) break;
                            }
                            return;
                        }
                        int[] nArray = new int[lIlIIlIIll[1]];
                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[41];
                        if (!C.lIIIlIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block253;
                        String[] stringArray = new String[lIlIIlIIll[1]];
                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[278]];
                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block253;
                        String[] stringArray163 = new String[lIlIIlIIll[1]];
                        stringArray163[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[279]];
                        if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray163).getQuantity(), lIlIIlIIll[1])) break block253;
                        String[] stringArray164 = new String[lIlIIlIIll[1]];
                        stringArray164[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[280]];
                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray164) ? 1 : 0)) break block253;
                        String[] stringArray165 = new String[lIlIIlIIll[1]];
                        stringArray165[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[281]];
                        if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray165).getQuantity(), lIlIIlIIll[1])) break block253;
                        String[] stringArray166 = new String[lIlIIlIIll[1]];
                        stringArray166[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[282]];
                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray166) ? 1 : 0)) break block253;
                        String[] stringArray167 = new String[lIlIIlIIll[1]];
                        stringArray167[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[283]];
                        if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray167).getQuantity(), lIlIIlIIll[1])) break block253;
                        String[] stringArray168 = new String[lIlIIlIIll[1]];
                        stringArray168[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[284]];
                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray168) ? 1 : 0)) break block253;
                        String[] stringArray169 = new String[lIlIIlIIll[1]];
                        stringArray169[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[285]];
                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray169) ? 1 : 0)) break block253;
                        int[] nArray54 = new int[lIlIIlIIll[1]];
                        nArray54[C.lIlIIlIIll[0]] = lIlIIlIIll[143];
                        if (!C.lIIIlIlllllIl(Inventory.getCount((int[])nArray54)) || !C.lIIIlIlllIlll(gh.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block253;
                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[286]];
                        while (true) {
                            block287: {
                                block288: {
                                    block286: {
                                        String[] stringArray170 = new String[lIlIIlIIll[1]];
                                        stringArray170[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[287]];
                                        if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray170) ? 1 : 0)) break block286;
                                        String[] stringArray171 = new String[lIlIIlIIll[1]];
                                        stringArray171[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[288]];
                                        if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray171).getQuantity(), lIlIIlIIll[1])) break block287;
                                    }
                                    String[] stringArray172 = new String[lIlIIlIIll[1]];
                                    stringArray172[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[289]];
                                    if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray172) ? 1 : 0)) break block288;
                                    String[] stringArray173 = new String[lIlIIlIIll[1]];
                                    stringArray173[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[290]];
                                    if (!C.lIIIllIIIIIII(Inventory.getFirst((String[])stringArray173).getQuantity(), lIlIIlIIll[1])) break block287;
                                }
                                String[] stringArray174 = new String[lIlIIlIIll[1]];
                                stringArray174[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[291]];
                                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray174) ? 1 : 0)) break block253;
                                String[] stringArray175 = new String[lIlIIlIIll[1]];
                                stringArray175[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[292]];
                                if (!C.lIIIlIlllllll(Inventory.getFirst((String[])stringArray175).getQuantity(), lIlIIlIIll[1])) break block253;
                            }
                            if (!C.lIIIlIllllIIl(AccBuilderShamans.d ? 1 : 0)) break block253;
                            if (C.lIIIlIllllIIl(Players.getLocal().getWorldLocation().equals((Object)gT) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)gT);

                            }
                            if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gT) ? 1 : 0)) continue;
                            int[] nArray55 = new int[lIlIIlIIll[1]];
                            nArray55[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                            var3 = TileObjects.getFirstAt((WorldPoint)gn, (int[])nArray55);
                            String[] stringArray176 = new String[lIlIIlIIll[1]];
                            stringArray176[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[293]];
                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[lIlIIlIIll[1]];
                                stringArray177[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)var3);
                                Time.sleepTicks((int)lIlIIlIIll[1]);

                            }
                            String[] stringArray178 = new String[lIlIIlIIll[1]];
                            stringArray178[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[295]];
                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lIlIIlIIll[1]];
                                stringArray179[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)var3);
                                Time.sleepTicks((int)lIlIIlIIll[1]);

                            }
                            String[] stringArray180 = new String[lIlIIlIIll[1]];
                            stringArray180[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[297]];
                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lIlIIlIIll[1]];
                                stringArray181[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)var3);
                                Time.sleepTicks((int)lIlIIlIIll[1]);

                            }

                            if (1 < 0) break;
                        }
                        return;
                    }
                    String[] stringArray = new String[lIlIIlIIll[1]];
                    stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[299]];
                    if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray182 = new String[lIlIIlIIll[1]];
                        stringArray182[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[300]];
                        if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray182) ? 1 : 0)) {
                            String[] stringArray183 = new String[lIlIIlIIll[1]];
                            stringArray183[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[301]];
                            if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray183) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[302]];
                                int[] nArray = new int[lIlIIlIIll[1]];
                                nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[303];
                                var3 = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[lIlIIlIIll[1]];
                                nArray56[C.lIlIIlIIll[0]] = lIlIIlIIll[304];
                                var2 = Inventory.getFirst((int[])nArray56);
                                if (C.lIIIlIlllllII(var3) && C.lIIIlIlllllII(var2)) {
                                    var2.useOn((TileObject)var3);
                                    Time.sleepTicks((int)lIlIIlIIll[5]);

                                }
                            }
                        }
                    }
                }
                if (C.lIIIlIlllllll(e.j(lIlIIlIIll[10]), lIlIIlIIll[13])) {
                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[305]];
                    int[] nArray = new int[lIlIIlIIll[1]];
                    nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[306];
                    var3 = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[lIlIIlIIll[1]];
                    nArray57[C.lIlIIlIIll[0]] = lIlIIlIIll[307];
                    var2 = Inventory.getFirst((int[])nArray57);
                    if (C.lIIIlIllllIII(dc, lIlIIlIIll[1])) {
                        Z.lx += lIlIIlIIll[1];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlIIlIIll[1];
                        Z.lx = lIlIIlIIll[0];
                        dd = lIlIIlIIll[0];
                    }
                    if (C.lIIIlIlllllII(var3) && C.lIIIlIlllllII(var2)) {
                        var2.useOn((TileObject)var3);
                        Time.sleepTicks((int)lIlIIlIIll[7]);

                        g.a(hn);
                    }
                }
                if (!C.lIIIlIlllllll(e.j(lIlIIlIIll[10]), lIlIIlIIll[19])) break block254;
                String[] stringArray = new String[lIlIIlIIll[1]];
                stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[308]];
                if (!C.lIIIllIIIIIIl(TileObjects.getNearest((String[])stringArray))) break block289;
                String[] stringArray184 = new String[lIlIIlIIll[1]];
                stringArray184[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[309]];
                if (!C.lIIIlIlllllII(TileObjects.getNearest((String[])stringArray184))) break block254;
            }
            String[] stringArray = new String[lIlIIlIIll[1]];
            stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[310]];
            if (C.lIIIlIlllllII(TileObjects.getNearest((String[])stringArray))) {
                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[311]];
                if (C.lIIIlIllllIIl(Equipment.contains((int[])f.aM) ? 1 : 0) && C.lIIIlIlllIlll(Inventory.contains((int[])f.aM) ? 1 : 0)) {
                    Inventory.getFirst((int[])f.aM).interact(lIlIIIllll[lIlIIlIIll[312]]);
                    Time.sleepTicks((int)lIlIIlIIll[6]);

                }
                if (C.lIIIlIlllIlll(Equipment.contains((int[])f.aM) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aM).interact(lIlIIIllll[lIlIIlIIll[313]]);
                    Time.sleepTicks((int)lIlIIlIIll[6]);

                }
            }
        }
    }

    public static void O() {
        d var4;
        Object var5;
        block20: {
            block19: {
                int[] nArray = new int[lIlIIlIIll[1]];
                nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[20];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new DHelper(lIlIIlIIll[20], lIlIIlIIll[44], lIlIIlIIll[315]);
                    bp.add(d2);

                }
                int[] nArray2 = new int[lIlIIlIIll[1]];
                nArray2[C.lIlIIlIIll[0]] = lIlIIlIIll[316];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var5 = new DHelper(lIlIIlIIll[316], lIlIIlIIll[7], j.bZ);
                    bp.add((DHelper) ar5);

                }
                int[] nArray3 = new int[lIlIIlIIll[1]];
                nArray3[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                if (C.lIIIlIlllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIIlIIll[1]];
                    nArray4[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                    if (C.lIIIlIllllIII(Bank.getFirst((int[])nArray4).getQuantity(), lIlIIlIIll[11])) {
                        var5 = new DHelper(lIlIIlIIll[14], lIlIIlIIll[317], lIlIIlIIll[19]);
                        bp.add((DHelper) ar5);

                    }
                }
                int[] nArray5 = new int[lIlIIlIIll[1]];
                nArray5[C.lIlIIlIIll[0]] = lIlIIlIIll[15];
                if (C.lIIIlIlllIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIlIIlIIll[1]];
                    nArray6[C.lIlIIlIIll[0]] = lIlIIlIIll[15];
                    if (C.lIIIlIllllIII(Bank.getFirst((int[])nArray6).getQuantity(), lIlIIlIIll[11])) {
                        var5 = new DHelper(lIlIIlIIll[15], lIlIIlIIll[317], lIlIIlIIll[19]);
                        bp.add((DHelper) ar5);

                    }
                }
                int[] nArray7 = new int[lIlIIlIIll[1]];
                nArray7[C.lIlIIlIIll[0]] = lIlIIlIIll[16];
                if (C.lIIIlIlllIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIlIIlIIll[1]];
                    nArray8[C.lIlIIlIIll[0]] = lIlIIlIIll[16];
                    if (C.lIIIlIllllIII(Bank.getFirst((int[])nArray8).getQuantity(), lIlIIlIIll[11])) {
                        var5 = new DHelper(lIlIIlIIll[16], lIlIIlIIll[317], lIlIIlIIll[19]);
                        bp.add((DHelper) ar5);

                    }
                }
                int[] nArray9 = new int[lIlIIlIIll[1]];
                nArray9[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    var5 = new DHelper(lIlIIlIIll[14], lIlIIlIIll[317], lIlIIlIIll[19]);
                    bp.add((DHelper) ar5);

                }
                int[] nArray10 = new int[lIlIIlIIll[1]];
                nArray10[C.lIlIIlIIll[0]] = lIlIIlIIll[15];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    var5 = new DHelper(lIlIIlIIll[15], lIlIIlIIll[317], lIlIIlIIll[19]);
                    bp.add((DHelper) ar5);

                }
                int[] nArray11 = new int[lIlIIlIIll[1]];
                nArray11[C.lIlIIlIIll[0]] = lIlIIlIIll[16];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    var5 = new DHelper(lIlIIlIIll[16], lIlIIlIIll[317], lIlIIlIIll[19]);
                    bp.add((DHelper) ar5);

                }
                int[] nArray12 = new int[lIlIIlIIll[1]];
                nArray12[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    var5 = new DHelper(lIlIIlIIll[14], lIlIIlIIll[317], lIlIIlIIll[19]);
                    bp.add((DHelper) ar5);

                }
                int[] nArray13 = new int[lIlIIlIIll[1]];
                nArray13[C.lIlIIlIIll[0]] = lIlIIlIIll[318];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    var5 = new DHelper(lIlIIlIIll[318], lIlIIlIIll[7], lIlIIlIIll[315]);
                    bp.add((DHelper) ar5);

                }
                int[] nArray14 = new int[lIlIIlIIll[1]];
                nArray14[C.lIlIIlIIll[0]] = lIlIIlIIll[24];
                if (!C.lIIIlIlllIlll(Bank.contains((int[])nArray14) ? 1 : 0)) break block19;
                int[] nArray15 = new int[lIlIIlIIll[1]];
                nArray15[C.lIlIIlIIll[0]] = lIlIIlIIll[24];
                if (!C.lIIIlIlllIlll(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[lIlIIlIIll[1]];
                nArray16[C.lIlIIlIIll[0]] = lIlIIlIIll[24];
                if (!C.lIIIlIllllIII(Bank.getFirst((int[])nArray16).getQuantity(), lIlIIlIIll[19])) break block20;
            }
            var5 = new DHelper(lIlIIlIIll[24], lIlIIlIIll[19], lIlIIlIIll[319]);
            bp.add((DHelper) ar5);

        }
        int[] nArray = new int[lIlIIlIIll[1]];
        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[18];
        if (C.lIIIlIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var5 = new DHelper(lIlIIlIIll[18], lIlIIlIIll[7], lIlIIlIIll[320]);
            bp.add((DHelper) ar5);

        }
        if (C.lIIIlIllllIIl(Bank.contains((Predicate)(var5 = item -> item.getName().toLowerCase().contains(lIlIIIllll[lIlIIlIIll[326]]))) ? 1 : 0)) {
            var4 = new DHelper(lIlIIlIIll[321], lIlIIlIIll[25], lIlIIlIIll[322]);
            bp.add(var4);

        }
        int[] nArray17 = new int[lIlIIlIIll[1]];
        nArray17[C.lIlIIlIIll[0]] = lIlIIlIIll[323];
        if (C.lIIIlIllllIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var4 = new DHelper(lIlIIlIIll[323], lIlIIlIIll[58], lIlIIlIIll[324]);
            bp.add(var4);

        }
    }

    @Override
    public int ad() {
        try {
            C.bL();

        }
        catch (Exception var6) {
            var6.printStackTrace();
        }
        if (2 > 2) {
            return (0x21 ^ 0x7D ^ (0x5E ^ 0x61)) & (44 + 102 - -14 + 38 ^ 1 + 54 - -110 + 0 ^ -1);
        }
        return lIlIIlIIll[121];
    }

    @Override
    public boolean ac() {
        return lIlIIlIIll[0];
    }

    private static boolean lIIIllIIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIlIlllllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIlllllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIlIllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aK() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[lIlIIlIIll[1]];
                nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[20];
                if (!C.lIIIlIlllIlll(Inventory.contains((int[])nArray) ? 1 : 0) || !C.lIIIlIlllIlll(Inventory.contains((int[])f.aU) ? 1 : 0)) break block2;
                if (!C.lIIIlIllllIIl(Inventory.contains((int[])f.aN) ? 1 : 0)) break block3;
                if (!C.lIIIlIlllIlll(Equipment.contains((int[])f.aN) ? 1 : 0) || C.lIIIlIllllIIl(Inventory.contains((int[])f.aM) ? 1 : 0) && !C.lIIIlIlllIlll(Equipment.contains((int[])f.aM) ? 1 : 0)) break block2;
                String[] stringArray = new String[lIlIIlIIll[1]];
                stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[314]];
                if (!C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) break block2;
            }
            n2 = lIlIIlIIll[1];

            if (1 > 0) return n2 != 0;
            return ((0xCE ^ 0x86 ^ (0xA ^ 0x55)) & (129 + 38 - 18 + 19 ^ 13 + 60 - -62 + 56 ^ -1)) != 0;
        }
        n2 = lIlIIlIIll[0];
        return n2 != 0;
    }

    private static boolean lIIIlIllllIIl(int n2) {
        return n2 == 0;
    }
}

