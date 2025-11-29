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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.D;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
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

public class C
implements K {
    public static final /* synthetic */ int[] ge;
    static /* synthetic */ int hi;
    static final /* synthetic */ int gp;
    static final /* synthetic */ int gt;
    private static final /* synthetic */ WorldPoint gR;
    private static final /* synthetic */ WorldPoint gC;
    private static final /* synthetic */ WorldPoint gT;
    private static final /* synthetic */ WorldPoint gA;
    public static /* synthetic */ WorldArea he;
    static /* synthetic */ int hh;
    static final /* synthetic */ int gv;
    private static final /* synthetic */ WorldPoint gU;
    private static final /* synthetic */ WorldPoint gN;
    static /* synthetic */ String hq;
    static final /* synthetic */ int gq;
    static final /* synthetic */ int gr;
    private static final /* synthetic */ WorldPoint gy;
    private static final /* synthetic */ int ha;
    static /* synthetic */ WorldPoint hr;
    public static final /* synthetic */ WorldPoint gn;
    private static final /* synthetic */ int gZ;
    private static /* synthetic */ int[] lIlIIlIIll;
    static /* synthetic */ String hp;
    public static final /* synthetic */ WorldPoint gl;
    static /* synthetic */ WorldArea hu;
    static final /* synthetic */ WorldPoint[] gx;
    private static final /* synthetic */ WorldPoint gK;
    static final /* synthetic */ int gu;
    public static final /* synthetic */ WorldPoint gk;
    public static final /* synthetic */ WorldArea gh;
    static /* synthetic */ int hj;
    private static final /* synthetic */ int hb;
    private static final /* synthetic */ WorldPoint gF;
    static /* synthetic */ int cA;
    private static final /* synthetic */ WorldPoint gO;
    private static final /* synthetic */ WorldPoint gQ;
    public static /* synthetic */ int hg;
    public static final /* synthetic */ int[] gf;
    static /* synthetic */ int hl;
    public static /* synthetic */ List<d> bp;
    static final /* synthetic */ int gw;
    static /* synthetic */ String ho;
    private static final /* synthetic */ WorldPoint gH;
    private static final /* synthetic */ int hd;
    static final /* synthetic */ int gs;
    private static final /* synthetic */ WorldPoint gJ;
    private static final /* synthetic */ WorldPoint gL;
    static /* synthetic */ int hm;
    static final /* synthetic */ int go;
    private static final /* synthetic */ WorldPoint gV;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ WorldArea hs;
    private static final /* synthetic */ WorldPoint gS;
    private static final /* synthetic */ WorldPoint gX;
    private static final /* synthetic */ WorldPoint gM;
    public static /* synthetic */ int hf;
    public static final /* synthetic */ WorldPoint gi;
    public static final /* synthetic */ WorldPoint gm;
    static /* synthetic */ String[] hn;
    private static final /* synthetic */ WorldPoint gG;
    private static final /* synthetic */ WorldPoint gP;
    static /* synthetic */ boolean dd;
    public static final /* synthetic */ WorldPoint gj;
    private static final /* synthetic */ int hc;
    private static final /* synthetic */ WorldPoint gY;
    static /* synthetic */ int hk;
    private static final /* synthetic */ WorldPoint gz;
    private static final /* synthetic */ WorldPoint gE;
    private static /* synthetic */ String[] lIlIIIllll;
    private static final /* synthetic */ WorldPoint gB;
    private static final /* synthetic */ WorldPoint gW;
    private static final /* synthetic */ WorldPoint gD;
    static /* synthetic */ int dc;
    static /* synthetic */ WorldPoint ht;
    private static final /* synthetic */ WorldPoint gI;
    public static final /* synthetic */ int[] gg;

    private static void lIIIlIlllIlIl() {
        lIlIIIllll = new String[lIlIIlIIll[413]];
        C.lIlIIIllll[C.lIlIIlIIll[0]] = C."Buying items";
        C.lIlIIIllll[C.lIlIIlIIll[1]] = C."Finished buying items, switching back to questing";
        C.lIlIIIllll[C.lIlIIlIIll[3]] = C."Drink";
        C.lIlIIIllll[C.lIlIIlIIll[5]] = C."Shark";
        C.lIlIIIllll[C.lIlIIlIIll[6]] = C."Shark";
        C.lIlIIIllll[C.lIlIIlIIll[7]] = C."Eat";
        C.lIlIIIllll[C.lIlIIlIIll[11]] = C."Navigating to bank";
        C.lIlIIIllll[C.lIlIIlIIll[9]] = C."Opening bank";
        C.lIlIIIllll[C.lIlIIlIIll[13]] = C."Handling banking";
        C.lIlIIIllll[C.lIlIIlIIll[17]] = C."We are missing runessupplies, switching to BUYING";
        C.lIlIIIllll[C.lIlIIlIIll[19]] = C."Rope";
        C.lIlIIIllll[C.lIlIIlIIll[21]] = C."Shark";
        C.lIlIIIllll[C.lIlIIlIIll[22]] = C."We are missing supplies, switching to BUYING";
        C.lIlIIIllll[C.lIlIIlIIll[23]] = C."Rope";
        C.lIlIIIllll[C.lIlIIlIIll[4]] = C."Shark";
        C.lIlIIIllll[C.lIlIIlIIll[26]] = C."Drink";
        C.lIlIIIllll[C.lIlIIlIIll[27]] = C."Nav to start";
        C.lIlIIIllll[C.lIlIIlIIll[28]] = C."Chatting";
        C.lIlIIIllll[C.lIlIIlIIll[25]] = C."Nav to boy";
        C.lIlIIIllll[C.lIlIIlIIll[29]] = C."Chat boy";
        C.lIlIIIllll[C.lIlIIlIIll[30]] = C."Nav to bookcase";
        C.lIlIIIllll[C.lIlIIlIIll[32]] = C."Book on baxtorian";
        C.lIlIIIllll[C.lIlIIlIIll[33]] = C."Searching bookcase";
        C.lIlIIIllll[C.lIlIIlIIll[34]] = C."Search";
        C.lIlIIIllll[C.lIlIIlIIll[35]] = C."Book on baxtorian";
        C.lIlIIIllll[C.lIlIIlIIll[37]] = C."Book on baxtorian";
        C.lIlIIIllll[C.lIlIIlIIll[38]] = C."Reading";
        C.lIlIIIllll[C.lIlIIlIIll[39]] = C."Read";
        C.lIlIIIllll[C.lIlIIlIIll[42]] = C."Tele to CW";
        C.lIlIIIllll[C.lIlIIlIIll[43]] = C."Wear";
        C.lIlIIIllll[C.lIlIIlIIll[44]] = C."Castle Wars";
        C.lIlIIIllll[C.lIlIIlIIll[45]] = C."Nav to maze ladder";
        C.lIlIIIllll[C.lIlIIlIIll[46]] = C."Fountain";
        C.lIlIIIllll[C.lIlIIlIIll[48]] = C."Climb-down";
        C.lIlIIIllll[C.lIlIIlIIll[50]] = C."nav to box";
        C.lIlIIIllll[C.lIlIIlIIll[51]] = C."Searching crate";
        C.lIlIIIllll[C.lIlIIlIIll[52]] = C."Search";
        C.lIlIIIllll[C.lIlIIlIIll[54]] = C."Nav to cage";
        C.lIlIIIllll[C.lIlIIlIIll[56]] = C."Entering cage";
        C.lIlIIIllll[C.lIlIIlIIll[57]] = C."Chat npc";
        C.lIlIIIllll[C.lIlIIlIIll[58]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[59]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[60]] = C."Nav to tombstone";
        C.lIlIIIllll[C.lIlIIlIIll[61]] = C."Wear";
        C.lIlIIIllll[C.lIlIIlIIll[62]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[63]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[64]] = C."Entering tomb";
        C.lIlIIIllll[C.lIlIIlIIll[67]] = C."Stalagmite";
        C.lIlIIIllll[C.lIlIIlIIll[68]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[69]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[2]] = C."Getting ammy";
        C.lIlIIIllll[C.lIlIIlIIll[71]] = C."Open";
        C.lIlIIIllll[C.lIlIIlIIll[73]] = C."Search";
        C.lIlIIIllll[C.lIlIIlIIll[74]] = C."Stalagmite";
        C.lIlIIIllll[C.lIlIIlIIll[75]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[76]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[77]] = C."Getting ammy";
        C.lIlIIIllll[C.lIlIIlIIll[78]] = C."Open";
        C.lIlIIIllll[C.lIlIIlIIll[79]] = C."Search";
        C.lIlIIIllll[C.lIlIIlIIll[80]] = C."Stalagmite";
        C.lIlIIIllll[C.lIlIIlIIll[82]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[83]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[84]] = C."Getting ashes";
        C.lIlIIIllll[C.lIlIIlIIll[85]] = C."Search";
        C.lIlIIIllll[C.lIlIIlIIll[86]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[10]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[87]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[88]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[89]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[90]] = C."Nav to bank";
        C.lIlIIIllll[C.lIlIIlIIll[91]] = C."Wear";
        C.lIlIIIllll[C.lIlIIlIIll[92]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[93]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[94]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[95]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[96]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[97]] = C."Opening bank";
        C.lIlIIIllll[C.lIlIIlIIll[98]] = C."Withdrawing runes";
        C.lIlIIIllll[C.lIlIIlIIll[99]] = C."Vial";
        C.lIlIIIllll[C.lIlIIlIIll[100]] = C."Shark";
        C.lIlIIIllll[C.lIlIIlIIll[101]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[102]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[103]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[104]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[105]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[106]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[107]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[108]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[109]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[110]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[111]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[112]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[113]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[114]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[115]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[116]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[117]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[118]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[119]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[120]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[121]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[122]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[123]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[124]] = C."Nav to door entrance";
        C.lIlIIIllll[C.lIlIIlIIll[125]] = C."Rope";
        C.lIlIIIllll[C.lIlIIlIIll[126]] = C."Rock";
        C.lIlIIIllll[C.lIlIIlIIll[127]] = C."Roping rock";
        C.lIlIIIllll[C.lIlIIlIIll[129]] = C."Rope";
        C.lIlIIIllll[C.lIlIIlIIll[131]] = C."Roping tree";
        C.lIlIIIllll[C.lIlIIlIIll[132]] = C."Door";
        C.lIlIIIllll[C.lIlIIlIIll[133]] = C."Entering door";
        C.lIlIIIllll[C.lIlIIlIIll[134]] = C."Open";
        C.lIlIIIllll[C.lIlIIlIIll[135]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[136]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[137]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[138]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[139]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[140]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[141]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[142]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[144]] = C."Nav to key and get";
        C.lIlIIIllll[C.lIlIIlIIll[146]] = C."Search";
        C.lIlIIIllll[C.lIlIIlIIll[147]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[148]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[149]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[150]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[151]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[152]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[153]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[154]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[155]] = C."Nav to last room";
        C.lIlIIIllll[C.lIlIIlIIll[156]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[157]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[158]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[159]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[160]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[161]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[162]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[163]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[164]] = C."Door";
        C.lIlIIIllll[C.lIlIIlIIll[166]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[167]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[168]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[169]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[170]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[171]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[172]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[173]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[174]] = C."Door";
        C.lIlIIIllll[C.lIlIIlIIll[175]] = C."Open";
        C.lIlIIIllll[C.lIlIIlIIll[176]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[177]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[178]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[179]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[180]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[181]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[182]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[183]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[184]] = C."Nav to SE Pillar";
        C.lIlIIIllll[C.lIlIIlIIll[185]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[186]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[187]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[188]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[189]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[190]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[191]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[192]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[193]] = C."Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[194]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[195]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[196]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[197]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[198]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[199]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[201]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[202]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[203]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[204]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[205]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[206]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[207]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[208]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[209]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[210]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[211]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[212]] = C."Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[213]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[214]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[215]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[216]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[217]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[218]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[219]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[220]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[221]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[222]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[223]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[224]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[225]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[226]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[227]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[228]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[229]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[230]] = C."Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[231]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[232]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[233]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[234]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[235]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[236]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[237]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[238]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[239]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[240]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[241]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[242]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[243]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[244]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[245]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[246]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[247]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[248]] = C."Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[249]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[250]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[251]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[252]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[8]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[253]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[254]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[255]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[256]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[257]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[258]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[259]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[260]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[261]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[262]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[263]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[264]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[265]] = C."Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[266]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[267]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[268]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[269]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[270]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[271]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[272]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[273]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[274]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[275]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[276]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[277]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[278]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[279]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[280]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[281]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[282]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[283]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[284]] = C."Glarial's amulet";
        C.lIlIIIllll[C.lIlIIlIIll[285]] = C."Glarial's urn";
        C.lIlIIIllll[C.lIlIIlIIll[286]] = C."Using runes";
        C.lIlIIIllll[C.lIlIIlIIll[287]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[288]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[289]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[290]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[291]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[292]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[293]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[294]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[295]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[296]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[297]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[298]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[299]] = C."Air rune";
        C.lIlIIIllll[C.lIlIIlIIll[300]] = C."Earth rune";
        C.lIlIIIllll[C.lIlIIlIIll[301]] = C."Water rune";
        C.lIlIIIllll[C.lIlIIlIIll[302]] = C."Putting neck on statue";
        C.lIlIIIllll[C.lIlIIlIIll[305]] = C."Putting ashes inside";
        C.lIlIIIllll[C.lIlIIlIIll[308]] = C."Chalice";
        C.lIlIIIllll[C.lIlIIlIIll[309]] = C."Statue of Glarial";
        C.lIlIIIllll[C.lIlIIlIIll[310]] = C."Pillar";
        C.lIlIIIllll[C.lIlIIlIIll[311]] = C."Teleporting to CW";
        C.lIlIIIllll[C.lIlIIlIIll[312]] = C."Wear";
        C.lIlIIIllll[C.lIlIIlIIll[313]] = C."Castle Wars";
        C.lIlIIIllll[C.lIlIIlIIll[314]] = C."Rope";
        C.lIlIIIllll[C.lIlIIlIIll[325]] = C."Waterfall quest";
        C.lIlIIIllll[C.lIlIIlIIll[326]] = C."ring of wealth (";
        C.lIlIIIllll[C.lIlIIlIIll[327]] = C."Stalagmite";
        C.lIlIIIllll[C.lIlIIlIIll[328]] = C."Games";
        C.lIlIIIllll[C.lIlIIlIIll[329]] = C."Games";
        C.lIlIIIllll[C.lIlIIlIIll[330]] = C."Games";
        C.lIlIIIllll[C.lIlIIlIIll[331]] = C."dueling";
        C.lIlIIIllll[C.lIlIIlIIll[332]] = C."dueling";
        C.lIlIIIllll[C.lIlIIlIIll[40]] = C."dueling";
        C.lIlIIIllll[C.lIlIIlIIll[41]] = C."dueling";
        C.lIlIIIllll[C.lIlIIlIIll[304]] = C."dueling";
        C.lIlIIIllll[C.lIlIIlIIll[307]] = C."How can I help?";
        C.lIlIIIllll[C.lIlIIlIIll[402]] = C."I'm always happy to help a cook in distress.";
        C.lIlIIIllll[C.lIlIIlIIll[143]] = C."Yes.";
        C.lIlIIIllll[C.lIlIIlIIll[403]] = C."Golrie";
        C.lIlIIIllll[C.lIlIIlIIll[404]] = C."Hudon";
        C.lIlIIIllll[C.lIlIIlIIll[405]] = C."Almera";
    }

    private static boolean lIIIlIllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIlIlIllIll(String var9, String var5) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIIlIIll[13]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIlIIlIIll[3], var13);
            return new String(var18.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String ae() {
        return lIlIIIllll[lIlIIlIIll[325]];
    }

    private static String lIIIlIlIllIlI(String var3, String var16) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var1 = var16.toCharArray();
        int var6 = lIlIIlIIll[0];
        char[] var12 = var3.toCharArray();
        int var19 = var12.length;
        int var24 = lIlIIlIIll[0];
        while (C.lIIIlIllllIII(var24, var19)) {
            char var23 = var12[var24];
            var17.append((char)(var23 ^ var1[var6 % var1.length]));
            0;
            ++var6;
            ++var24;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static String lIIIlIlIllIII(String var8, String var4) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIlIIlIIll[3], var22);
            return new String(var2.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
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
            0;
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
                Item var11;
                BankLocation var7;
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
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!C.lIIIlIllllIlI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), lIlIIlIIll[4]) || C.lIIIlIlllIlll(Inventory.isFull() ? 1 : 0)) {
                                                                                                            String[] stringArray = new String[lIlIIlIIll[1]];
                                                                                                            stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[5]];
                                                                                                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                                                                String[] stringArray2 = new String[lIlIIlIIll[1]];
                                                                                                                stringArray2[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[6]];
                                                                                                                Inventory.getFirst((String[])stringArray2).interact(lIlIIIllll[lIlIIlIIll[7]]);
                                                                                                                Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                                                0;
                                                                                                            }
                                                                                                        }
                                                                                                        if (C.lIIIlIllllIII(e.j(lIlIIlIIll[8]), lIlIIlIIll[9])) {
                                                                                                            D.bR();
                                                                                                        }
                                                                                                        if (!C.lIIIlIllllIIl(e.j(lIlIIlIIll[10])) || !C.lIIIlIllllIll(e.j(lIlIIlIIll[8]), lIlIIlIIll[9])) break block255;
                                                                                                        if (!C.lIIIlIllllIIl(C.aK() ? 1 : 0)) break block256;
                                                                                                        var7 = BankLocation.getNearest();
                                                                                                        if (C.lIIIlIlllllII(var7) && C.lIIIlIllllIIl(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[11]];
                                                                                                            a.a(var7);
                                                                                                        }
                                                                                                        if (!C.lIIIlIlllllII(var7) || !C.lIIIlIlllIlll(var7.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block256;
                                                                                                        if (C.lIIIlIllllIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[9]];
                                                                                                            a.a();
                                                                                                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlIIll[12]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (!C.lIIIlIlllIlll(Bank.isOpen() ? 1 : 0)) break block256;
                                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[13]];
                                                                                                        if (C.lIIIlIlllllIl(Inventory.getAll().size())) {
                                                                                                            Bank.depositInventory();
                                                                                                            Time.sleepTicks((int)lIlIIlIIll[5]);
                                                                                                            0;
                                                                                                        }
                                                                                                        if (C.lIIIlIlllllIl(Equipment.getAll().size())) {
                                                                                                            Bank.depositEquipment();
                                                                                                            Time.sleepTicks((int)lIlIIlIIll[3]);
                                                                                                            0;
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
                                                                                0;
                                                                            }
                                                                            if (C.lIIIlIllllIIl(Bank.isOpen() ? 1 : 0)) {
                                                                                if (C.lIIIlIllllIII(cA, lIlIIlIIll[1])) {
                                                                                    if (C.lIIIlIlllIlll(Inventory.contains((int[])f.aU) ? 1 : 0) && C.lIIIlIllllIII(Movement.getRunEnergy(), lIlIIlIIll[2])) {
                                                                                        Inventory.getFirst((int[])f.aU).interact(lIlIIIllll[lIlIIlIIll[26]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                        0;
                                                                                    }
                                                                                    e.v();
                                                                                    cA += lIlIIlIIll[1];
                                                                                }
                                                                                AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[27]];
                                                                                Movement.walkTo((WorldPoint)gC);
                                                                                0;
                                                                                Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                0;
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
                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                        0;
                                                                    }
                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gH), lIlIIlIIll[6])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[31];
                                                                        var7 = TileObjects.getNearest((int[])nArray);
                                                                        String[] stringArray = new String[lIlIIlIIll[1]];
                                                                        stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[32]];
                                                                        if (C.lIIIlIllllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[33]];
                                                                            if (C.lIIIlIlllllII(var7)) {
                                                                                var7.interact(lIlIIIllll[lIlIIlIIll[34]]);
                                                                                Time.sleepTicks((int)lIlIIlIIll[3]);
                                                                                0;
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
                                                                        var7 = Inventory.getFirst((String[])stringArray4);
                                                                        if (C.lIIIlIlllllII(var7)) {
                                                                            AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[38]];
                                                                            var7.interact(lIlIIIllll[lIlIIlIIll[39]]);
                                                                            Time.sleepTicks((int)lIlIIlIIll[3]);
                                                                            0;
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
                                                                                    0;
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
                                                                                    0;
                                                                                }
                                                                                if (C.lIIIlIlllIlll(hs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Walker.stepAlong(List.of(gx));
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                    0;
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
                                                                                    var7 = TileObjects.getNearest((int[])nArray8);
                                                                                    if (C.lIIIlIlllllII(var7)) {
                                                                                        var7.interact(lIlIIIllll[lIlIIlIIll[48]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[5]);
                                                                                        0;
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
                                                                                    0;
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
                                                                                    var7 = TileObjects.getNearest((int[])nArray13);
                                                                                    if (C.lIIIlIlllllII(var7)) {
                                                                                        var7.interact(lIlIIIllll[lIlIIlIIll[52]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[3]);
                                                                                        0;
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
                                                                                    0;
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
                                                                                    var7 = TileObjects.getNearest((int[])nArray18);
                                                                                    if (C.lIIIlIlllllII(var7)) {
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[56]];
                                                                                        int[] nArray19 = new int[lIlIIlIIll[1]];
                                                                                        nArray19[C.lIlIIlIIll[0]] = lIlIIlIIll[40];
                                                                                        var11 = Inventory.getFirst((int[])nArray19);
                                                                                        if (C.lIIIlIlllllII(var11)) {
                                                                                            var11.useOn((TileObject)var7);
                                                                                            Time.sleep((long)1L);
                                                                                            0;
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
                                                                                        0;
                                                                                    }
                                                                                    Movement.walkTo((WorldPoint)gC);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                    0;
                                                                                }
                                                                                if (C.lIIIlIlllIlll(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)gM);
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                    0;
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
                                                                                var7 = Inventory.getFirst((int[])nArray21);
                                                                                if (C.lIIIlIlllllII(var7)) {
                                                                                    int[] nArray22 = new int[lIlIIlIIll[1]];
                                                                                    nArray22[C.lIlIIlIIll[0]] = lIlIIlIIll[65];
                                                                                    var11 = TileObjects.getNearest((int[])nArray22);
                                                                                    if (C.lIIIlIlllllII(var11)) {
                                                                                        var7.useOn((TileObject)var11);
                                                                                        Time.sleepUntil(() -> {
                                                                                            boolean bl;
                                                                                            String[] stringArray = new String[lIlIIlIIll[1]];
                                                                                            stringArray[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[327]];
                                                                                            if (C.lIIIlIlllllII(TileObjects.getNearest((String[])stringArray))) {
                                                                                                bl = lIlIIlIIll[1];
                                                                                                0;
                                                                                                if (((116 + 110 - 163 + 92 ^ 110 + 25 - -46 + 13) & (0x47 ^ 0x67 ^ (0xB8 ^ 0xC1) ^ -1)) != 0) {
                                                                                                    return ((0x77 ^ 0x2D ^ (0xED ^ 0x83)) & (0xFA ^ 0xB2 ^ (0xF1 ^ 0x8D) ^ -1)) != 0;
                                                                                                }
                                                                                            } else {
                                                                                                bl = lIlIIlIIll[0];
                                                                                            }
                                                                                            return bl;
                                                                                        }, (int)lIlIIlIIll[66]);
                                                                                        0;
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
                                                                                        0;
                                                                                    }
                                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gN), lIlIIlIIll[6])) {
                                                                                        int[] nArray24 = new int[lIlIIlIIll[1]];
                                                                                        nArray24[C.lIlIIlIIll[0]] = lIlIIlIIll[70];
                                                                                        var7 = TileObjects.getNearest((int[])nArray24);
                                                                                        if (C.lIIIlIlllllII(var7)) {
                                                                                            var7.interact(lIlIIIllll[lIlIIlIIll[71]]);
                                                                                            Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                            0;
                                                                                        }
                                                                                        int[] nArray25 = new int[lIlIIlIIll[1]];
                                                                                        nArray25[C.lIlIIlIIll[0]] = lIlIIlIIll[72];
                                                                                        var11 = TileObjects.getNearest((int[])nArray25);
                                                                                        if (C.lIIIlIlllllII(var11)) {
                                                                                            var11.interact(lIlIIIllll[lIlIIlIIll[73]]);
                                                                                            Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gN), lIlIIlIIll[6])) {
                                                                                    int[] nArray26 = new int[lIlIIlIIll[1]];
                                                                                    nArray26[C.lIlIIlIIll[0]] = lIlIIlIIll[70];
                                                                                    var7 = TileObjects.getNearest((int[])nArray26);
                                                                                    if (C.lIIIlIlllllII(var7)) {
                                                                                        var7.interact(lIlIIIllll[lIlIIlIIll[78]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                        0;
                                                                                    }
                                                                                    int[] nArray27 = new int[lIlIIlIIll[1]];
                                                                                    nArray27[C.lIlIIlIIll[0]] = lIlIIlIIll[72];
                                                                                    var11 = TileObjects.getNearest((int[])nArray27);
                                                                                    if (C.lIIIlIlllllII(var11)) {
                                                                                        var11.interact(lIlIIIllll[lIlIIlIIll[79]]);
                                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                        0;
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
                                                                        0;
                                                                        Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                        0;
                                                                    }
                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gO), lIlIIlIIll[5])) {
                                                                        int[] nArray = new int[lIlIIlIIll[1]];
                                                                        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[81];
                                                                        var7 = TileObjects.getNearest((int[])nArray);
                                                                        if (C.lIIIlIlllllII(var7)) {
                                                                            var7.interact(lIlIIIllll[lIlIIlIIll[85]]);
                                                                            Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                            0;
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
                                                                                    0;
                                                                                }
                                                                                if (C.lIIIlIlllIlll(Equipment.contains((int[])f.aN) ? 1 : 0)) {
                                                                                    Movement.walkTo((WorldPoint)gL);
                                                                                    0;
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
                                                                0;
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
                                                                            0;
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
                                                                            0;
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
                                                                            0;
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
                                                                                        0;
                                                                                    }
                                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gF), lIlIIlIIll[7]) && C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gE), lIlIIlIIll[6])) {
                                                                                        String[] stringArray39 = new String[lIlIIlIIll[1]];
                                                                                        stringArray39[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[125]];
                                                                                        var7 = Inventory.getFirst((String[])stringArray39);
                                                                                        String[] stringArray40 = new String[lIlIIlIIll[1]];
                                                                                        stringArray40[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[126]];
                                                                                        var11 = TileObjects.getNearest((String[])stringArray40);
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[127]];
                                                                                        if (C.lIIIlIlllllII(var7) && C.lIIIlIlllllII(var11)) {
                                                                                            var7.useOn((TileObject)var11);
                                                                                            Time.sleepUntil(() -> {
                                                                                                boolean bl;
                                                                                                if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gE), lIlIIlIIll[6])) {
                                                                                                    bl = lIlIIlIIll[1];
                                                                                                    0;
                                                                                                    if (2 <= ((29 + 158 - 147 + 128 ^ 147 + 163 - 173 + 36) & (0x38 ^ 0x56 ^ (0x4F ^ 0x24) ^ -1))) {
                                                                                                        return false;
                                                                                                    }
                                                                                                } else {
                                                                                                    bl = lIlIIlIIll[0];
                                                                                                }
                                                                                                return bl;
                                                                                            }, (int)lIlIIlIIll[128]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                    if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gE), lIlIIlIIll[6])) {
                                                                                        String[] stringArray41 = new String[lIlIIlIIll[1]];
                                                                                        stringArray41[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[129]];
                                                                                        var7 = Inventory.getFirst((String[])stringArray41);
                                                                                        int[] nArray31 = new int[lIlIIlIIll[1]];
                                                                                        nArray31[C.lIlIIlIIll[0]] = lIlIIlIIll[130];
                                                                                        var11 = TileObjects.getNearest((int[])nArray31);
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[131]];
                                                                                        if (C.lIIIlIlllllII(var7) && C.lIIIlIlllllII(var11)) {
                                                                                            var7.useOn((TileObject)var11);
                                                                                            Time.sleepTicks((int)lIlIIlIIll[7]);
                                                                                            0;
                                                                                        }
                                                                                    }
                                                                                    if (C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gP) ? 1 : 0)) {
                                                                                        String[] stringArray42 = new String[lIlIIlIIll[1]];
                                                                                        stringArray42[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[132]];
                                                                                        var7 = TileObjects.getNearest((String[])stringArray42);
                                                                                        AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[133]];
                                                                                        if (C.lIIIlIlllllII(var7)) {
                                                                                            var7.interact(lIlIIIllll[lIlIIlIIll[134]]);
                                                                                            Time.sleepTicks((int)lIlIIlIIll[3]);
                                                                                            0;
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
                                                                                            0;
                                                                                        }
                                                                                        if (C.lIIIlIllllllI(Players.getLocal().getWorldLocation().distanceTo(gQ), lIlIIlIIll[3])) {
                                                                                            int[] nArray33 = new int[lIlIIlIIll[1]];
                                                                                            nArray33[C.lIlIIlIIll[0]] = lIlIIlIIll[145];
                                                                                            var7 = TileObjects.getNearest((int[])nArray33);
                                                                                            if (C.lIIIlIlllllII(var7)) {
                                                                                                var7.interact(lIlIIIllll[lIlIIlIIll[146]]);
                                                                                                Time.sleepTicks((int)lIlIIlIIll[3]);
                                                                                                0;
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
                                                                                        0;
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
                                                                                        var7 = Inventory.getFirst((int[])nArray38);
                                                                                        String[] stringArray64 = new String[lIlIIlIIll[1]];
                                                                                        stringArray64[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[164]];
                                                                                        var11 = TileObjects.getNearest((String[])stringArray64);
                                                                                        if (C.lIIIlIlllllII(var7) && C.lIIIlIlllllII(var11)) {
                                                                                            var7.useOn((TileObject)var11);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)gP), (int)lIlIIlIIll[165]);
                                                                                            0;
                                                                                        }
                                                                                        while (C.lIIIlIllllIlI(Players.getLocal().getWorldLocation().distanceTo(gS), lIlIIlIIll[3])) {
                                                                                            Movement.walkTo((WorldPoint)gS);
                                                                                            0;
                                                                                            Time.sleepTicks((int)lIlIIlIIll[1]);
                                                                                            0;
                                                                                            0;
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
                                                                                        var7 = Inventory.getFirst((int[])nArray41);
                                                                                        String[] stringArray72 = new String[lIlIIlIIll[1]];
                                                                                        stringArray72[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[174]];
                                                                                        var11 = TileObjects.getNearest((String[])stringArray72);
                                                                                        if (C.lIIIlIlllllII(var7) && C.lIIIlIlllllII(var11)) {
                                                                                            var11.interact(lIlIIIllll[lIlIIlIIll[175]]);
                                                                                            Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)gP), (int)lIlIIlIIll[165]);
                                                                                            0;
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
                                                                                    0;
                                                                                    Time.sleepTicks((int)lIlIIlIIll[6]);
                                                                                    0;
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
                                                var7 = TileObjects.getFirstAt((WorldPoint)gi, (int[])nArray45);
                                                String[] stringArray93 = new String[lIlIIlIIll[1]];
                                                stringArray93[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[201]];
                                                Inventory.getFirst((String[])stringArray93).useOn((TileObject)var7);
                                                Time.sleepTicks((int)lIlIIlIIll[1]);
                                                0;
                                                String[] stringArray94 = new String[lIlIIlIIll[1]];
                                                stringArray94[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[202]];
                                                Inventory.getFirst((String[])stringArray94).useOn((TileObject)var7);
                                                Time.sleepTicks((int)lIlIIlIIll[1]);
                                                0;
                                                String[] stringArray95 = new String[lIlIIlIIll[1]];
                                                stringArray95[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[203]];
                                                Inventory.getFirst((String[])stringArray95).useOn((TileObject)var7);
                                                Time.sleepTicks((int)lIlIIlIIll[1]);
                                                0;
                                                0;
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
                                                0;
                                                Time.sleepTicks((int)lIlIIlIIll[5]);
                                                0;
                                            }
                                            if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gX) ? 1 : 0)) continue;
                                            int[] nArray47 = new int[lIlIIlIIll[1]];
                                            nArray47[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                                            var7 = TileObjects.getFirstAt((WorldPoint)gj, (int[])nArray47);
                                            String[] stringArray109 = new String[lIlIIlIIll[1]];
                                            stringArray109[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[219]];
                                            Inventory.getFirst((String[])stringArray109).useOn((TileObject)var7);
                                            Time.sleepTicks((int)lIlIIlIIll[1]);
                                            0;
                                            String[] stringArray110 = new String[lIlIIlIIll[1]];
                                            stringArray110[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[220]];
                                            Inventory.getFirst((String[])stringArray110).useOn((TileObject)var7);
                                            Time.sleepTicks((int)lIlIIlIIll[1]);
                                            0;
                                            String[] stringArray111 = new String[lIlIIlIIll[1]];
                                            stringArray111[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[221]];
                                            Inventory.getFirst((String[])stringArray111).useOn((TileObject)var7);
                                            Time.sleepTicks((int)lIlIIlIIll[1]);
                                            0;
                                            0;
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
                                            0;
                                            Time.sleepTicks((int)lIlIIlIIll[5]);
                                            0;
                                        }
                                        if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gW) ? 1 : 0)) continue;
                                        int[] nArray49 = new int[lIlIIlIIll[1]];
                                        nArray49[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                                        var7 = TileObjects.getFirstAt((WorldPoint)gk, (int[])nArray49);
                                        String[] stringArray125 = new String[lIlIIlIIll[1]];
                                        stringArray125[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[237]];
                                        Inventory.getFirst((String[])stringArray125).useOn((TileObject)var7);
                                        Time.sleepTicks((int)lIlIIlIIll[1]);
                                        0;
                                        String[] stringArray126 = new String[lIlIIlIIll[1]];
                                        stringArray126[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[238]];
                                        Inventory.getFirst((String[])stringArray126).useOn((TileObject)var7);
                                        Time.sleepTicks((int)lIlIIlIIll[1]);
                                        0;
                                        String[] stringArray127 = new String[lIlIIlIIll[1]];
                                        stringArray127[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[239]];
                                        Inventory.getFirst((String[])stringArray127).useOn((TileObject)var7);
                                        Time.sleepTicks((int)lIlIIlIIll[1]);
                                        0;
                                        0;
                                        
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
                                        0;
                                        Time.sleepTicks((int)lIlIIlIIll[5]);
                                        0;
                                    }
                                    if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gV) ? 1 : 0)) continue;
                                    int[] nArray51 = new int[lIlIIlIIll[1]];
                                    nArray51[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                                    var7 = TileObjects.getFirstAt((WorldPoint)gl, (int[])nArray51);
                                    String[] stringArray141 = new String[lIlIIlIIll[1]];
                                    stringArray141[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[254]];
                                    Inventory.getFirst((String[])stringArray141).useOn((TileObject)var7);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);
                                    0;
                                    String[] stringArray142 = new String[lIlIIlIIll[1]];
                                    stringArray142[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[255]];
                                    Inventory.getFirst((String[])stringArray142).useOn((TileObject)var7);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);
                                    0;
                                    String[] stringArray143 = new String[lIlIIlIIll[1]];
                                    stringArray143[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[256]];
                                    Inventory.getFirst((String[])stringArray143).useOn((TileObject)var7);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);
                                    0;
                                    0;
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
                                    0;
                                    Time.sleepTicks((int)lIlIIlIIll[5]);
                                    0;
                                }
                                if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gU) ? 1 : 0)) continue;
                                int[] nArray53 = new int[lIlIIlIIll[1]];
                                nArray53[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                                var7 = TileObjects.getFirstAt((WorldPoint)gm, (int[])nArray53);
                                String[] stringArray157 = new String[lIlIIlIIll[1]];
                                stringArray157[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[272]];
                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray157) ? 1 : 0)) {
                                    String[] stringArray158 = new String[lIlIIlIIll[1]];
                                    stringArray158[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[273]];
                                    Inventory.getFirst((String[])stringArray158).useOn((TileObject)var7);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);
                                    0;
                                }
                                String[] stringArray159 = new String[lIlIIlIIll[1]];
                                stringArray159[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[274]];
                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray159) ? 1 : 0)) {
                                    String[] stringArray160 = new String[lIlIIlIIll[1]];
                                    stringArray160[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[275]];
                                    Inventory.getFirst((String[])stringArray160).useOn((TileObject)var7);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);
                                    0;
                                }
                                String[] stringArray161 = new String[lIlIIlIIll[1]];
                                stringArray161[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[276]];
                                if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray161) ? 1 : 0)) {
                                    String[] stringArray162 = new String[lIlIIlIIll[1]];
                                    stringArray162[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[277]];
                                    Inventory.getFirst((String[])stringArray162).useOn((TileObject)var7);
                                    Time.sleepTicks((int)lIlIIlIIll[1]);
                                    0;
                                }
                                0;
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
                                0;
                            }
                            if (!C.lIIIlIlllIlll(Players.getLocal().getWorldLocation().equals((Object)gT) ? 1 : 0)) continue;
                            int[] nArray55 = new int[lIlIIlIIll[1]];
                            nArray55[C.lIlIIlIIll[0]] = lIlIIlIIll[200];
                            var7 = TileObjects.getFirstAt((WorldPoint)gn, (int[])nArray55);
                            String[] stringArray176 = new String[lIlIIlIIll[1]];
                            stringArray176[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[293]];
                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray176) ? 1 : 0)) {
                                String[] stringArray177 = new String[lIlIIlIIll[1]];
                                stringArray177[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[294]];
                                Inventory.getFirst((String[])stringArray177).useOn((TileObject)var7);
                                Time.sleepTicks((int)lIlIIlIIll[1]);
                                0;
                            }
                            String[] stringArray178 = new String[lIlIIlIIll[1]];
                            stringArray178[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[295]];
                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray178) ? 1 : 0)) {
                                String[] stringArray179 = new String[lIlIIlIIll[1]];
                                stringArray179[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[296]];
                                Inventory.getFirst((String[])stringArray179).useOn((TileObject)var7);
                                Time.sleepTicks((int)lIlIIlIIll[1]);
                                0;
                            }
                            String[] stringArray180 = new String[lIlIIlIIll[1]];
                            stringArray180[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[297]];
                            if (C.lIIIlIlllIlll(Inventory.contains((String[])stringArray180) ? 1 : 0)) {
                                String[] stringArray181 = new String[lIlIIlIIll[1]];
                                stringArray181[C.lIlIIlIIll[0]] = lIlIIIllll[lIlIIlIIll[298]];
                                Inventory.getFirst((String[])stringArray181).useOn((TileObject)var7);
                                Time.sleepTicks((int)lIlIIlIIll[1]);
                                0;
                            }
                            0;
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
                                var7 = TileObjects.getNearest((int[])nArray);
                                int[] nArray56 = new int[lIlIIlIIll[1]];
                                nArray56[C.lIlIIlIIll[0]] = lIlIIlIIll[304];
                                var11 = Inventory.getFirst((int[])nArray56);
                                if (C.lIIIlIlllllII(var7) && C.lIIIlIlllllII(var11)) {
                                    var11.useOn((TileObject)var7);
                                    Time.sleepTicks((int)lIlIIlIIll[5]);
                                    0;
                                }
                            }
                        }
                    }
                }
                if (C.lIIIlIlllllll(e.j(lIlIIlIIll[10]), lIlIIlIIll[13])) {
                    AccBuilderShamans.c = lIlIIIllll[lIlIIlIIll[305]];
                    int[] nArray = new int[lIlIIlIIll[1]];
                    nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[306];
                    var7 = TileObjects.getNearest((int[])nArray);
                    int[] nArray57 = new int[lIlIIlIIll[1]];
                    nArray57[C.lIlIIlIIll[0]] = lIlIIlIIll[307];
                    var11 = Inventory.getFirst((int[])nArray57);
                    if (C.lIIIlIllllIII(dc, lIlIIlIIll[1])) {
                        Z.lx += lIlIIlIIll[1];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlIIlIIll[1];
                        Z.lx = lIlIIlIIll[0];
                        dd = lIlIIlIIll[0];
                    }
                    if (C.lIIIlIlllllII(var7) && C.lIIIlIlllllII(var11)) {
                        var11.useOn((TileObject)var7);
                        Time.sleepTicks((int)lIlIIlIIll[7]);
                        0;
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
                    0;
                }
                if (C.lIIIlIlllIlll(Equipment.contains((int[])f.aM) ? 1 : 0)) {
                    Equipment.getFirst((int[])f.aM).interact(lIlIIIllll[lIlIIlIIll[313]]);
                    Time.sleepTicks((int)lIlIIlIIll[6]);
                    0;
                }
            }
        }
    }

    public static void O() {
        d var14;
        Object var20;
        block20: {
            block19: {
                int[] nArray = new int[lIlIIlIIll[1]];
                nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[20];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIlIIlIIll[20], lIlIIlIIll[44], lIlIIlIIll[315]);
                    bp.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIlIIlIIll[1]];
                nArray2[C.lIlIIlIIll[0]] = lIlIIlIIll[316];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var20 = new d(lIlIIlIIll[316], lIlIIlIIll[7], j.bZ);
                    bp.add((d)var20);
                    0;
                }
                int[] nArray3 = new int[lIlIIlIIll[1]];
                nArray3[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                if (C.lIIIlIlllIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIIlIIll[1]];
                    nArray4[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                    if (C.lIIIlIllllIII(Bank.getFirst((int[])nArray4).getQuantity(), lIlIIlIIll[11])) {
                        var20 = new d(lIlIIlIIll[14], lIlIIlIIll[317], lIlIIlIIll[19]);
                        bp.add((d)var20);
                        0;
                    }
                }
                int[] nArray5 = new int[lIlIIlIIll[1]];
                nArray5[C.lIlIIlIIll[0]] = lIlIIlIIll[15];
                if (C.lIIIlIlllIlll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    int[] nArray6 = new int[lIlIIlIIll[1]];
                    nArray6[C.lIlIIlIIll[0]] = lIlIIlIIll[15];
                    if (C.lIIIlIllllIII(Bank.getFirst((int[])nArray6).getQuantity(), lIlIIlIIll[11])) {
                        var20 = new d(lIlIIlIIll[15], lIlIIlIIll[317], lIlIIlIIll[19]);
                        bp.add((d)var20);
                        0;
                    }
                }
                int[] nArray7 = new int[lIlIIlIIll[1]];
                nArray7[C.lIlIIlIIll[0]] = lIlIIlIIll[16];
                if (C.lIIIlIlllIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                    int[] nArray8 = new int[lIlIIlIIll[1]];
                    nArray8[C.lIlIIlIIll[0]] = lIlIIlIIll[16];
                    if (C.lIIIlIllllIII(Bank.getFirst((int[])nArray8).getQuantity(), lIlIIlIIll[11])) {
                        var20 = new d(lIlIIlIIll[16], lIlIIlIIll[317], lIlIIlIIll[19]);
                        bp.add((d)var20);
                        0;
                    }
                }
                int[] nArray9 = new int[lIlIIlIIll[1]];
                nArray9[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                    var20 = new d(lIlIIlIIll[14], lIlIIlIIll[317], lIlIIlIIll[19]);
                    bp.add((d)var20);
                    0;
                }
                int[] nArray10 = new int[lIlIIlIIll[1]];
                nArray10[C.lIlIIlIIll[0]] = lIlIIlIIll[15];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                    var20 = new d(lIlIIlIIll[15], lIlIIlIIll[317], lIlIIlIIll[19]);
                    bp.add((d)var20);
                    0;
                }
                int[] nArray11 = new int[lIlIIlIIll[1]];
                nArray11[C.lIlIIlIIll[0]] = lIlIIlIIll[16];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                    var20 = new d(lIlIIlIIll[16], lIlIIlIIll[317], lIlIIlIIll[19]);
                    bp.add((d)var20);
                    0;
                }
                int[] nArray12 = new int[lIlIIlIIll[1]];
                nArray12[C.lIlIIlIIll[0]] = lIlIIlIIll[14];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                    var20 = new d(lIlIIlIIll[14], lIlIIlIIll[317], lIlIIlIIll[19]);
                    bp.add((d)var20);
                    0;
                }
                int[] nArray13 = new int[lIlIIlIIll[1]];
                nArray13[C.lIlIIlIIll[0]] = lIlIIlIIll[318];
                if (C.lIIIlIllllIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                    var20 = new d(lIlIIlIIll[318], lIlIIlIIll[7], lIlIIlIIll[315]);
                    bp.add((d)var20);
                    0;
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
            var20 = new d(lIlIIlIIll[24], lIlIIlIIll[19], lIlIIlIIll[319]);
            bp.add((d)var20);
            0;
        }
        int[] nArray = new int[lIlIIlIIll[1]];
        nArray[C.lIlIIlIIll[0]] = lIlIIlIIll[18];
        if (C.lIIIlIllllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var20 = new d(lIlIIlIIll[18], lIlIIlIIll[7], lIlIIlIIll[320]);
            bp.add((d)var20);
            0;
        }
        if (C.lIIIlIllllIIl(Bank.contains((Predicate)(var20 = item -> item.getName().toLowerCase().contains(lIlIIIllll[lIlIIlIIll[326]]))) ? 1 : 0)) {
            var14 = new d(lIlIIlIIll[321], lIlIIlIIll[25], lIlIIlIIll[322]);
            bp.add(var14);
            0;
        }
        int[] nArray17 = new int[lIlIIlIIll[1]];
        nArray17[C.lIlIIlIIll[0]] = lIlIIlIIll[323];
        if (C.lIIIlIllllIIl(Bank.contains((int[])nArray17) ? 1 : 0)) {
            var14 = new d(lIlIIlIIll[323], lIlIIlIIll[58], lIlIIlIIll[324]);
            bp.add(var14);
            0;
        }
    }

    @Override
    public int ad() {
        try {
            C.bL();
            0;
        }
        catch (Exception var21) {
            var21.printStackTrace();
        }
        if (2 > 2) {
            return (0x21 ^ 0x7D ^ (0x5E ^ 0x61)) & (44 + 102 - -14 + 38 ^ 1 + 54 - -110 + 0 ^ -1);
        }
        return lIlIIlIIll[121];
    }

    private static void lIIIlIlllIllI() {
        lIlIIlIIll = new int[414];
        C.lIlIIlIIll[0] = (115 + 66 - 47 + 35 ^ 103 + 91 - 24 + 6) & (0x85 ^ 0xAA ^ (0x54 ^ 0x62) ^ -1);
        C.lIlIIlIIll[1] = 1;
        C.lIlIIlIIll[2] = 0x87 ^ 0xB5;
        C.lIlIIlIIll[3] = 2;
        C.lIlIIlIIll[4] = 0xC8 ^ 0xC6;
        C.lIlIIlIIll[5] = 3;
        C.lIlIIlIIll[6] = 0x8F ^ 0xA4 ^ (0x2E ^ 1);
        C.lIlIIlIIll[7] = 129 + 15 - 20 + 9 ^ 108 + 112 - 115 + 23;
        C.lIlIIlIIll[8] = 44 + 22 - -156 + 4;
        C.lIlIIlIIll[9] = 0x99 ^ 0x9E;
        C.lIlIIlIIll[10] = 59 + 209 - 31 + 10 ^ 78 + 178 - 94 + 20;
        C.lIlIIlIIll[11] = 0xD ^ 0xB;
        C.lIlIIlIIll[12] = 0xFFFFDBAF & 0x37D8;
        C.lIlIIlIIll[13] = 59 + 69 - 104 + 138 ^ 140 + 117 - 206 + 119;
        C.lIlIIlIIll[14] = -(0xFFFF97ED & 0x6D93) & (0xFFFFEFAB & 0x17FF);
        C.lIlIIlIIll[15] = -(0xFFFFB615 & 0x5DEE) & (0xFFFFDF2F & 0x36FF);
        C.lIlIIlIIll[16] = -(0xFFFFDBF7 & 0x7D99) & (0xFFFFDBFD & 0x7FBF);
        C.lIlIIlIIll[17] = 0x28 ^ 0x21;
        C.lIlIIlIIll[18] = -(0xFFFFF7EF & 0x3C12) & (0xFFFFFFFF & 0x37BB);
        C.lIlIIlIIll[19] = 143 + 107 - 83 + 40 ^ 188 + 48 - 47 + 8;
        C.lIlIIlIIll[20] = 0xFFFFBDD3 & 0x43AD;
        C.lIlIIlIIll[21] = 0x6A ^ 0x25 ^ (0x53 ^ 0x17);
        C.lIlIIlIIll[22] = 0x35 ^ 0x39;
        C.lIlIIlIIll[23] = 0x8A ^ 0x87;
        C.lIlIIlIIll[24] = -(0xFFFFE5CF & 0x5E36) & (0xFFFFCDFF & 0x7FFD);
        C.lIlIIlIIll[25] = 0xB1 ^ 0xA3;
        C.lIlIIlIIll[26] = 0x75 ^ 0x39 ^ (0x2B ^ 0x68);
        C.lIlIIlIIll[27] = 0x46 ^ 0x56;
        C.lIlIIlIIll[28] = 0x53 ^ 0x15 ^ (0x30 ^ 0x67);
        C.lIlIIlIIll[29] = 0xD1 ^ 0xC2;
        C.lIlIIlIIll[30] = 0x3E ^ 0x55 ^ 81 + 53 - 104 + 97;
        C.lIlIIlIIll[31] = 0xFFFFB7C7 & 0x4FFD;
        C.lIlIIlIIll[32] = 0x3B ^ 0x19 ^ (0x4D ^ 0x7A);
        C.lIlIIlIIll[33] = 0x96 ^ 0x80;
        C.lIlIIlIIll[34] = 101 + 85 - 83 + 51 ^ 26 + 14 - -60 + 41;
        C.lIlIIlIIll[35] = 0xBE ^ 0xA6;
        C.lIlIIlIIll[36] = -1;
        C.lIlIIlIIll[37] = 30 + 34 - 2 + 95 ^ 45 + 74 - 0 + 13;
        C.lIlIIlIIll[38] = 0x15 ^ 0x45 ^ (0x70 ^ 0x3A);
        C.lIlIIlIIll[39] = 55 + 20 - 52 + 127 ^ 30 + 79 - 24 + 56;
        C.lIlIIlIIll[40] = -(0xFFFFFED7 & 0x1D7B) & (0xFFFF9FFF & 0x7D77);
        C.lIlIIlIIll[41] = 0xFFFFCBB7 & 0x356E;
        C.lIlIIlIIll[42] = 102 + 52 - 30 + 16 ^ 84 + 31 - 88 + 117;
        C.lIlIIlIIll[43] = 0xF ^ 0x28 ^ (0xA2 ^ 0x98);
        C.lIlIIlIIll[44] = 152 + 44 - 109 + 66 ^ 31 + 44 - 18 + 78;
        C.lIlIIlIIll[45] = 78 + 79 - 42 + 62 ^ 12 + 136 - 63 + 89;
        C.lIlIIlIIll[46] = 0x19 ^ 0x17 ^ (0x48 ^ 0x66);
        C.lIlIIlIIll[47] = 0xFFFFFDDE & 0x16A3;
        C.lIlIIlIIll[48] = 3 ^ 0x7A ^ (0x51 ^ 9);
        C.lIlIIlIIll[49] = 0xFFFF9FCE & 0x67F7;
        C.lIlIIlIIll[50] = 0x24 ^ 0x35 ^ (0x81 ^ 0xB2);
        C.lIlIIlIIll[51] = 0x5A ^ 0x79;
        C.lIlIIlIIll[52] = 1 ^ (0xE0 ^ 0xC5);
        C.lIlIIlIIll[53] = -(0xFFFFC8FD & 0x7F93) & (0xFFFFFDFF & 0x6FF8);
        C.lIlIIlIIll[54] = 0xBE ^ 0x9B;
        C.lIlIIlIIll[55] = -(0x2F ^ 0x16) & (0xFFFFA7FF & 0x5FFF);
        C.lIlIIlIIll[56] = 0x99 ^ 0xBF;
        C.lIlIIlIIll[57] = 0xA4 ^ 0x83;
        C.lIlIIlIIll[58] = 0x10 ^ 0x38;
        C.lIlIIlIIll[59] = 0x3F ^ 0x16;
        C.lIlIIlIIll[60] = 0x90 ^ 0x95 ^ (0x70 ^ 0x5F);
        C.lIlIIlIIll[61] = 4 ^ 0x2F;
        C.lIlIIlIIll[62] = 0x7E ^ 0x52;
        C.lIlIIlIIll[63] = 0xA ^ 0x27;
        C.lIlIIlIIll[64] = 0x11 ^ 0x3F;
        C.lIlIIlIIll[65] = 0xFFFFDFCF & 0x27F8;
        C.lIlIIlIIll[66] = 0xFFFFEF9F & 0x357C;
        C.lIlIIlIIll[67] = 0x9D ^ 0xB6 ^ (0xC7 ^ 0xC3);
        C.lIlIIlIIll[68] = 34 + 7 - -81 + 7 ^ 164 + 21 - 125 + 117;
        C.lIlIIlIIll[69] = 19 + 105 - 12 + 25 ^ 100 + 19 - 7 + 72;
        C.lIlIIlIIll[70] = -(0xFFFFFE27 & 0x59F9) & (0xFFFFFFEA & 0x5FFF);
        C.lIlIIlIIll[71] = 0x71 ^ 0x42;
        C.lIlIIlIIll[72] = -(0xFFFFE83F & 0x1FF1) & (0xFFFF9FFB & 0x6FFF);
        C.lIlIIlIIll[73] = 0x1D ^ 0x23 ^ (0x76 ^ 0x7C);
        C.lIlIIlIIll[74] = 0x84 ^ 0xB1;
        C.lIlIIlIIll[75] = 9 ^ 0x3F;
        C.lIlIIlIIll[76] = 0x26 ^ 0x11;
        C.lIlIIlIIll[77] = 0x62 ^ 0x5A;
        C.lIlIIlIIll[78] = 0x21 ^ 0x6D ^ (4 ^ 0x71);
        C.lIlIIlIIll[79] = 82 + 44 - 48 + 88 ^ 92 + 78 - 18 + 4;
        C.lIlIIlIIll[80] = 32 + 215 - 218 + 225 ^ 137 + 166 - 203 + 97;
        C.lIlIIlIIll[81] = -(0xFFFFEB75 & 0x74AF) & (0xFFFFF7FF & 0x6FED);
        C.lIlIIlIIll[82] = 8 + 33 - 6 + 105 ^ 72 + 140 - 93 + 57;
        C.lIlIIlIIll[83] = 38 + 87 - 28 + 86 ^ 80 + 55 - 61 + 64;
        C.lIlIIlIIll[84] = 0x92 ^ 0xAC;
        C.lIlIIlIIll[85] = 211 + 72 - 110 + 80 ^ 159 + 96 - 144 + 83;
        C.lIlIIlIIll[86] = 0xF ^ 0x5B ^ (0xB5 ^ 0xA1);
        C.lIlIIlIIll[87] = 0x73 ^ 0x31;
        C.lIlIIlIIll[88] = 0xE5 ^ 0xA6;
        C.lIlIIlIIll[89] = 0xCB ^ 0x8F;
        C.lIlIIlIIll[90] = 0 ^ 0x45;
        C.lIlIIlIIll[91] = 0x41 ^ 7;
        C.lIlIIlIIll[92] = 79 + 169 - 134 + 131 ^ 115 + 105 - 112 + 70;
        C.lIlIIlIIll[93] = 0xE8 ^ 0xA0;
        C.lIlIIlIIll[94] = 0xF1 ^ 0x8A ^ (0x29 ^ 0x1B);
        C.lIlIIlIIll[95] = 0x64 ^ 0x2E;
        C.lIlIIlIIll[96] = 0x26 ^ 0x13 ^ (0xCE ^ 0xB0);
        C.lIlIIlIIll[97] = 0x88 ^ 0xC4;
        C.lIlIIlIIll[98] = 0x14 ^ 0x46 ^ (0xAA ^ 0xB5);
        C.lIlIIlIIll[99] = 0x7C ^ 0x32;
        C.lIlIIlIIll[100] = 9 ^ 0x27 ^ (0x49 ^ 0x28);
        C.lIlIIlIIll[101] = 0x79 ^ 0x29;
        C.lIlIIlIIll[102] = 0x53 ^ 0x56 ^ (0x97 ^ 0xC3);
        C.lIlIIlIIll[103] = 0xD1 ^ 0x83;
        C.lIlIIlIIll[104] = 0x27 ^ 0x54 ^ (0x6C ^ 0x4C);
        C.lIlIIlIIll[105] = 0xF7 ^ 0xA3;
        C.lIlIIlIIll[106] = 0xFD ^ 0x8C ^ (0x8C ^ 0xA8);
        C.lIlIIlIIll[107] = 0x82 ^ 0xAE ^ (0x64 ^ 0x1E);
        C.lIlIIlIIll[108] = 0xEB ^ 0xC1 ^ (0x7F ^ 2);
        C.lIlIIlIIll[109] = 0x40 ^ 0x18;
        C.lIlIIlIIll[110] = 120 + 31 - -87 + 13 ^ 67 + 111 - 158 + 142;
        C.lIlIIlIIll[111] = 103 + 5 - 25 + 119 ^ 79 + 36 - 79 + 108;
        C.lIlIIlIIll[112] = 0x67 ^ 0x4D ^ (0x33 ^ 0x42);
        C.lIlIIlIIll[113] = 159 + 176 - 135 + 10 ^ 5 + 28 - -83 + 26;
        C.lIlIIlIIll[114] = 0x7F ^ 0x22;
        C.lIlIIlIIll[115] = 0x69 ^ 0x37;
        C.lIlIIlIIll[116] = 3 + 205 - 96 + 124 ^ 103 + 31 - 133 + 178;
        C.lIlIIlIIll[117] = 1 + 89 - 2 + 114 ^ 135 + 90 - 66 + 11;
        C.lIlIIlIIll[118] = 132 + 142 - 201 + 122 ^ 42 + 118 - 109 + 111;
        C.lIlIIlIIll[119] = 108 + 22 - 109 + 141 ^ 39 + 47 - 8 + 114;
        C.lIlIIlIIll[120] = 47 + 182 - 206 + 203 ^ 55 + 89 - 137 + 122;
        C.lIlIIlIIll[121] = 0x38 ^ 0x52 ^ (0x32 ^ 0x3C);
        C.lIlIIlIIll[122] = 0x3F ^ 0x2D ^ (0x60 ^ 0x17);
        C.lIlIIlIIll[123] = 0xD3 ^ 0xB7 ^ 2;
        C.lIlIIlIIll[124] = 0x56 ^ 0x31;
        C.lIlIIlIIll[125] = 0x11 ^ 0x79;
        C.lIlIIlIIll[126] = 0x88 ^ 0xA8 ^ (0x6A ^ 0x23);
        C.lIlIIlIIll[127] = 0x72 ^ 0x4E ^ (0x79 ^ 0x2F);
        C.lIlIIlIIll[128] = 0xFFFFBB7F & 0x5FD8;
        C.lIlIIlIIll[129] = 0xCB ^ 0xA0;
        C.lIlIIlIIll[130] = 0xFFFFEFEC & 0x17F7;
        C.lIlIIlIIll[131] = 0x64 ^ 8;
        C.lIlIIlIIll[132] = 0xAA ^ 0x80 ^ (0x59 ^ 0x1E);
        C.lIlIIlIIll[133] = 195 + 174 - 348 + 210 ^ 78 + 98 - 80 + 41;
        C.lIlIIlIIll[134] = 0xD5 ^ 0xBA;
        C.lIlIIlIIll[135] = (0x78 ^ 0x2D) & ~(0x75 ^ 0x20) ^ (0x6C ^ 0x1C);
        C.lIlIIlIIll[136] = 0xF6 ^ 0xB3 ^ (0x5F ^ 0x6B);
        C.lIlIIlIIll[137] = 0x7C ^ 0x6A ^ (0x6D ^ 9);
        C.lIlIIlIIll[138] = 0xF0 ^ 0x83;
        C.lIlIIlIIll[139] = 0x39 ^ 0x5C ^ (0xB ^ 0x1A);
        C.lIlIIlIIll[140] = 1 ^ 0x74;
        C.lIlIIlIIll[141] = 0xE4 ^ 0x92;
        C.lIlIIlIIll[142] = 126 + 169 - 272 + 154 ^ 112 + 145 - 78 + 19;
        C.lIlIIlIIll[143] = 0xFFFF99AA & 0x677F;
        C.lIlIIlIIll[144] = 0xB9 ^ 0xC1;
        C.lIlIIlIIll[145] = 0xFFFFEFEF & 0x17DF;
        C.lIlIIlIIll[146] = 0x5A ^ 0x52 ^ (0x4E ^ 0x3F);
        C.lIlIIlIIll[147] = 0xB ^ 0x45 ^ (0x6A ^ 0x5E);
        C.lIlIIlIIll[148] = 0xD6 ^ 0xAD;
        C.lIlIIlIIll[149] = 0x3F ^ 0x43;
        C.lIlIIlIIll[150] = 0x62 ^ 0x1F;
        C.lIlIIlIIll[151] = 0x69 ^ 0x17;
        C.lIlIIlIIll[152] = (0x89 ^ 0x86) + (6 ^ 0x25) - -(0x60 ^ 0x77) + (0x99 ^ 0xAF);
        C.lIlIIlIIll[153] = (0xB1 ^ 0xA1) + (0xBA ^ 0xA9) - -(0x3A ^ 0x25) + (0x15 ^ 0x2B);
        C.lIlIIlIIll[154] = (0x7F ^ 0x2F) + (0xD5 ^ 0xC0) - (0x71 ^ 0x7C) + (0x6D ^ 0x44);
        C.lIlIIlIIll[155] = (0xE5 ^ 0x95) + (1 ^ 0x33) - (0x36 ^ 0x54) + (9 ^ 0x4B);
        C.lIlIIlIIll[156] = 87 + 78 - 72 + 38;
        C.lIlIIlIIll[157] = 30 + 80 - 20 + 42;
        C.lIlIIlIIll[158] = (0x60 ^ 0x46) + (0x2F ^ 0x69) - (0x7F ^ 0x63) + (0xF4 ^ 0xC1);
        C.lIlIIlIIll[159] = (0x66 ^ 0x7B) + (0xE5 ^ 0xC6) - (0x91 ^ 0x9C) + (0xDD ^ 0x8E);
        C.lIlIIlIIll[160] = (0xD4 ^ 0x93) + (0x27 ^ 0x30) - (0x18 ^ 0x13) + (0x29 ^ 0x1D);
        C.lIlIIlIIll[161] = 5 + 11 - 14 + 134;
        C.lIlIIlIIll[162] = (0xA4 ^ 0x9F) + (0xD1 ^ 0x91) - (0x13 ^ 0x18) + (0x3C ^ 0x25);
        C.lIlIIlIIll[163] = (0xE ^ 0x57) + (0xB6 ^ 0xAE) - -(0x8D ^ 0x81) + (0x7D ^ 0x70);
        C.lIlIIlIIll[164] = (0x5A ^ 0x1A) + (0x5E ^ 0x43) - (0xD0 ^ 0x8B) + (120 + 127 - 217 + 107);
        C.lIlIIlIIll[165] = -(0xFFFFC587 & 0x3EFA) & (0xFFFFADF7 & 0x77BD);
        C.lIlIIlIIll[166] = (0xDD ^ 0xA5) + (0x27 ^ 0x63) - (0xDB ^ 0x83) + (0xBF ^ 0x97);
        C.lIlIIlIIll[167] = 98 + 132 - 119 + 30;
        C.lIlIIlIIll[168] = (0xBC ^ 0xC0) + (0xD4 ^ 0xB3) - (194 + 115 - 200 + 90) + (0x1C ^ 0x6E);
        C.lIlIIlIIll[169] = (0x31 ^ 0x16) + (0x8C ^ 0x91) - (3 ^ 0x2A) + (0xCC ^ 0xB8);
        C.lIlIIlIIll[170] = (0x69 ^ 0x47) + (7 ^ 0x32) - (0x45 ^ 0x62) + (0x35 ^ 0x61);
        C.lIlIIlIIll[171] = (0x3C ^ 0x17) + (0xF ^ 0x19) - -(0xBF ^ 0x89) + (0x12 ^ 8);
        C.lIlIIlIIll[172] = 37 + 64 - 90 + 135;
        C.lIlIIlIIll[173] = (0x40 ^ 0x57) + (0x40 ^ 0) - -(0x6B ^ 0x7E) + (0x69 ^ 0x4E);
        C.lIlIIlIIll[174] = 13 + 89 - 63 + 109;
        C.lIlIIlIIll[175] = 49 + 116 - 71 + 55;
        C.lIlIIlIIll[176] = (0x65 ^ 0x63) + (7 ^ 0x5B) - -(0x59 ^ 0x49) + (0x47 ^ 0x63);
        C.lIlIIlIIll[177] = 112 + 68 - 54 + 25;
        C.lIlIIlIIll[178] = 104 + 91 - 138 + 95;
        C.lIlIIlIIll[179] = 73 + 27 - 28 + 81;
        C.lIlIIlIIll[180] = (0xC3 ^ 0xC6) + (0x5A ^ 0x72) - (0x90 ^ 0x96) + (0x7B ^ 8);
        C.lIlIIlIIll[181] = 138 + 116 - 188 + 89;
        C.lIlIIlIIll[182] = 13 + 58 - -25 + 54 + (0x15 ^ 0x50) - (95 + 131 - 193 + 126) + (0x57 ^ 0x37);
        C.lIlIIlIIll[183] = 95 + 116 - 194 + 140;
        C.lIlIIlIIll[184] = (0x24 ^ 0x6F) + (0xE ^ 0x63) - (174 + 122 - 116 + 1) + (37 + 146 - 57 + 29);
        C.lIlIIlIIll[185] = 100 + 137 - 198 + 120;
        C.lIlIIlIIll[186] = 17 + 141 - 119 + 121;
        C.lIlIIlIIll[187] = 153 + 52 - 198 + 154;
        C.lIlIIlIIll[188] = 46 + 106 - 71 + 68 + (0x4C ^ 0x63) - (92 + 53 - 136 + 134) + (0x1E ^ 0x73);
        C.lIlIIlIIll[189] = 27 + 29 - -80 + 27;
        C.lIlIIlIIll[190] = 7 + 39 - -25 + 93;
        C.lIlIIlIIll[191] = 19 + 113 - 17 + 50;
        C.lIlIIlIIll[192] = 72 + 133 - 39 + 0;
        C.lIlIIlIIll[193] = (0x84 ^ 0xA0) + (0x7A ^ 0x51) - -(0x5A ^ 0x43) + (5 ^ 0x3A);
        C.lIlIIlIIll[194] = (0x38 ^ 2) + 1 - -(0x26 ^ 0x42) + (0x77 ^ 0x7E);
        C.lIlIIlIIll[195] = 57 + 42 - 27 + 97;
        C.lIlIIlIIll[196] = (0x55 ^ 0x64) + 3 - -(0x64 ^ 0x46) + (0x61 ^ 0x35);
        C.lIlIIlIIll[197] = 14 + 170 - 65 + 52;
        C.lIlIIlIIll[198] = 106 + 157 - 212 + 121;
        C.lIlIIlIIll[199] = 133 + 22 - 21 + 39;
        C.lIlIIlIIll[200] = -(0xFFFFF567 & 0x1A99) & (0xFFFF9FD7 & 0x77FD);
        C.lIlIIlIIll[201] = 41 + 127 - 100 + 68 + (120 + 18 - 81 + 114) - (0xFFFFE5FE & 0x1B1F) + (146 + 139 - 185 + 53);
        C.lIlIIlIIll[202] = 89 + 126 - 159 + 119;
        C.lIlIIlIIll[203] = 75 + 134 - 91 + 58;
        C.lIlIIlIIll[204] = (1 ^ 0x73) + (13 + 126 - 122 + 144) - (91 + 157 - 187 + 131) + (0x11 ^ 0x4F);
        C.lIlIIlIIll[205] = 160 + 121 - 144 + 41;
        C.lIlIIlIIll[206] = 68 + 4 - -87 + 20;
        C.lIlIIlIIll[207] = 164 + 134 - 155 + 37;
        C.lIlIIlIIll[208] = (0 ^ 0x3D) + (58 + 163 - 207 + 152) - (40 + 39 - 48 + 128) + (0xC ^ 0x7D);
        C.lIlIIlIIll[209] = (2 ^ 0x3A) + (6 + 110 - 30 + 53) - (0xCE ^ 0xA9) + (0x5C ^ 6);
        C.lIlIIlIIll[210] = 22 + 57 - -97 + 7;
        C.lIlIIlIIll[211] = 74 + 97 - 105 + 118;
        C.lIlIIlIIll[212] = 72 + 34 - 81 + 160;
        C.lIlIIlIIll[213] = 161 + 100 - 179 + 104;
        C.lIlIIlIIll[214] = 155 + 10 - 103 + 125;
        C.lIlIIlIIll[215] = 142 + 3 - 55 + 98;
        C.lIlIIlIIll[216] = 103 + 184 - 273 + 175;
        C.lIlIIlIIll[217] = 121 + 101 - 77 + 45;
        C.lIlIIlIIll[218] = 42 + 29 - -53 + 23 + (1 ^ 0x7A) - (102 + 33 - 31 + 23) + (0x78 ^ 0x48);
        C.lIlIIlIIll[219] = 60 + 118 - 79 + 30 + (43 + 9 - -17 + 72) - (53 + 52 - 102 + 248) + (10 + 37 - -10 + 116);
        C.lIlIIlIIll[220] = 7 + 65 - 29 + 150;
        C.lIlIIlIIll[221] = 182 + 99 - 182 + 95;
        C.lIlIIlIIll[222] = 148 + 81 - 122 + 88;
        C.lIlIIlIIll[223] = 108 + 105 - 96 + 79;
        C.lIlIIlIIll[224] = (0x2F ^ 0x69) + (0x30 ^ 0x27) - (0x75 ^ 0x73) + (0x66 ^ 8);
        C.lIlIIlIIll[225] = 112 + 105 - 28 + 2 + (113 + 3 - -42 + 0) - (116 + 162 - 148 + 52) + (0xA8 ^ 0xB7);
        C.lIlIIlIIll[226] = 49 + 67 - -53 + 30;
        C.lIlIIlIIll[227] = (0xDD ^ 0xC1) + (0x23 ^ 0x3C) - -(120 + 37 - 152 + 130) + (0x95 ^ 0x93);
        C.lIlIIlIIll[228] = (0xD3 ^ 0xC6) + (0xDE ^ 0xA3) - -(0xA4 ^ 0x85) + (0xB5 ^ 0xA3);
        C.lIlIIlIIll[229] = (0x14 ^ 0x6A) + (0x15 ^ 0x7A) - (0x73 ^ 8) + (0x20 ^ 0x78);
        C.lIlIIlIIll[230] = (3 ^ 0x37) + (0x51 ^ 0) - (0x96 ^ 0xB3) + (0x4A ^ 0x21);
        C.lIlIIlIIll[231] = (0x90 ^ 0xB9) + (0xD ^ 8) - (0x41 ^ 0x5B) + (161 + 81 - 182 + 124);
        C.lIlIIlIIll[232] = 49 + 106 - 13 + 63;
        C.lIlIIlIIll[233] = (0x19 ^ 0xE) + (0xDE ^ 0x83) - (0x48 ^ 0x25) + (62 + 4 - -37 + 96);
        C.lIlIIlIIll[234] = 171 + 97 - 170 + 109;
        C.lIlIIlIIll[235] = 98 + 99 - 173 + 171 + (0xED ^ 0x93) - (0xFFFF81FE & 0x7F2F) + (6 + 158 - -11 + 14);
        C.lIlIIlIIll[236] = (0x79 ^ 0x7F) + (0x5A ^ 0x63) - (0x1F ^ 9) + (92 + 39 - -7 + 30);
        C.lIlIIlIIll[237] = 108 + 103 - 124 + 123;
        C.lIlIIlIIll[238] = 53 + 9 - -75 + 0 + (0xB5 ^ 0xC7) - (121 + 64 - 19 + 45) + (34 + 103 - 12 + 46);
        C.lIlIIlIIll[239] = (0x4F ^ 0x33) + (9 + 43 - -58 + 19) - (127 + 105 - 103 + 43) + (124 + 10 - 65 + 62);
        C.lIlIIlIIll[240] = (0x75 ^ 0x4F) + (0x14 ^ 0x5E) - (0xE9 ^ 0x8B) + (25 + 162 - 93 + 85);
        C.lIlIIlIIll[241] = (0x4E ^ 0x62) + (0x72 ^ 0x2C) - -(0x3D ^ 0x2E) + (0xD ^ 0x34);
        C.lIlIIlIIll[242] = 199 + 181 - 367 + 202;
        C.lIlIIlIIll[243] = 102 + 146 - 224 + 192;
        C.lIlIIlIIll[244] = 13 + 95 - -74 + 35;
        C.lIlIIlIIll[245] = 190 + 17 - 56 + 67;
        C.lIlIIlIIll[246] = 44 + 216 - 107 + 66;
        C.lIlIIlIIll[247] = 83 + 162 - 120 + 95;
        C.lIlIIlIIll[248] = (0xF9 ^ 0xA6) + (0x67 ^ 0x68) - -(0x7A ^ 0x5D) + (0x32 ^ 0x7A);
        C.lIlIIlIIll[249] = (0xC3 ^ 0xC6) + (0x7E ^ 9) - ((0x3B ^ 0x6A) & ~(0xE0 ^ 0xB1)) + (0xA7 ^ 0xC5);
        C.lIlIIlIIll[250] = 92 + 90 - 40 + 81;
        C.lIlIIlIIll[251] = 180 + 110 - 229 + 163;
        C.lIlIIlIIll[252] = 186 + 92 - 262 + 209;
        C.lIlIIlIIll[253] = 109 + 57 - 86 + 82 + (0x2F ^ 0x6E) - (0xF ^ 0x3F) + (7 ^ 0x37);
        C.lIlIIlIIll[254] = 47 + 91 - 100 + 96 + (0xF3 ^ 0x9C) - (147 + 216 - 160 + 27) + (149 + 76 - 158 + 146);
        C.lIlIIlIIll[255] = (0xA3 ^ 0x9F) + (0x4B ^ 0x45) - (0x7D ^ 0x35) + (13 + 32 - -146 + 36);
        C.lIlIIlIIll[256] = (0xDB ^ 0x87) + (0xA5 ^ 0xC1) - (0xEC ^ 0xB9) + (4 ^ 0x7F);
        C.lIlIIlIIll[257] = (0xAE ^ 0x93) + (0x6D ^ 0x51) - -(3 ^ 0x38) + (0x71 ^ 0x42);
        C.lIlIIlIIll[258] = 61 + 225 - 136 + 82;
        C.lIlIIlIIll[259] = 173 + 60 - 178 + 178;
        C.lIlIIlIIll[260] = (0xE0 ^ 0x9A) + (14 + 27 - -14 + 97) - (46 + 101 - 102 + 100) + (0x72 ^ 0x1B);
        C.lIlIIlIIll[261] = 227 + 81 - 77 + 4;
        C.lIlIIlIIll[262] = 68 + 106 - -18 + 44;
        C.lIlIIlIIll[263] = 113 + 54 - 46 + 116;
        C.lIlIIlIIll[264] = (0x48 ^ 0x61) + (0x40 ^ 0x25) - (57 + 19 - -41 + 12) + (26 + 109 - 86 + 176);
        C.lIlIIlIIll[265] = 41 + 173 - 106 + 131;
        C.lIlIIlIIll[266] = (0x6F ^ 6) + (133 + 22 - 103 + 145) - (105 + 78 - 116 + 124) + (17 + 101 - 7 + 18);
        C.lIlIIlIIll[267] = 52 + 120 - 153 + 157 + (133 + 99 - 217 + 119) - (141 + 2 - -4 + 0) + (4 ^ 0x4A);
        C.lIlIIlIIll[268] = 4 + 154 - 80 + 138 + (166 + 145 - 186 + 67) - (0xFFFF8D76 & 0x73BF) + (12 + 45 - 14 + 101);
        C.lIlIIlIIll[269] = 68 + 48 - -10 + 38 + (0x25 ^ 0x71) - (98 + 170 - 154 + 113) + (192 + 161 - 204 + 73);
        C.lIlIIlIIll[270] = 122 + 84 - -6 + 32;
        C.lIlIIlIIll[271] = 130 + 79 - -14 + 22;
        C.lIlIIlIIll[272] = 1 + (100 + 13 - 108 + 141) - -(0xBA ^ 0x85) + (0x3E ^ 0x1A);
        C.lIlIIlIIll[273] = (0xAD ^ 0x8C) + (76 + 92 - 75 + 89) - -1 + (0x99 ^ 0x86);
        C.lIlIIlIIll[274] = 124 + 126 - 92 + 7 + (72 + 96 - 64 + 92) - (0xFFFFA11B & 0x5FF5) + (88 + 100 - 104 + 76);
        C.lIlIIlIIll[275] = 235 + 100 - 243 + 157;
        C.lIlIIlIIll[276] = 156 + 155 - 230 + 169;
        C.lIlIIlIIll[277] = 49 + 18 - 64 + 248;
        C.lIlIIlIIll[278] = 198 + 217 - 194 + 31;
        C.lIlIIlIIll[279] = 26 + 22 - 21 + 103 + (0xE2 ^ 0x8E) - (0x54 ^ 0x27) + (41 + 52 - 55 + 92);
        C.lIlIIlIIll[280] = 1 + (0x70 ^ 0x6D) - -(134 + 166 - 233 + 130) + (0x6F ^ 0x74);
        C.lIlIIlIIll[281] = 13 + 2 - -52 + 188;
        C.lIlIIlIIll[282] = 0xFFFFB9F8 & 0x4707;
        C.lIlIIlIIll[283] = 0xFFFFEBD3 & 0x152D;
        C.lIlIIlIIll[284] = 0xFFFF897F & 0x7782;
        C.lIlIIlIIll[285] = 0xFFFF87EB & 0x7917;
        C.lIlIIlIIll[286] = 0xFFFFE33D & 0x1DC6;
        C.lIlIIlIIll[287] = 0xFFFF97C7 & 0x693D;
        C.lIlIIlIIll[288] = -(0xFFFFB6AB & 0x7FF6) & (0xFFFFFFA7 & 0x37FF);
        C.lIlIIlIIll[289] = -(0xFFFFBFF1 & 0x7CDF) & (0xFFFFBDFF & 0x7FD7);
        C.lIlIIlIIll[290] = 0xFFFF879A & 0x796D;
        C.lIlIIlIIll[291] = -(0xFFFFFFF7 & 0x565F) & (0xFFFFD7DF & 0x7F7F);
        C.lIlIIlIIll[292] = 0xFFFFDB1E & 0x25EB;
        C.lIlIIlIIll[293] = 0xFFFF970B & 0x69FF;
        C.lIlIIlIIll[294] = -(0xFFFFDFFC & 0x3C67) & (0xFFFFBF6F & 0x5DFF);
        C.lIlIIlIIll[295] = 0xFFFFEF3D & 0x11CF;
        C.lIlIIlIIll[296] = -(0xFFFFBBC2 & 0x6EFF) & (0xFFFFEBDF & 0x3FEF);
        C.lIlIIlIIll[297] = 0xFFFF939F & 0x6D6F;
        C.lIlIIlIIll[298] = -(0xFFFFBEDA & 0x452D) & (0xFFFF9FF7 & 0x651F);
        C.lIlIIlIIll[299] = 0xFFFFC135 & 0x3FDB;
        C.lIlIIlIIll[300] = 0xFFFFD99A & 0x2777;
        C.lIlIIlIIll[301] = 0xFFFFFF5B & 0x1B7;
        C.lIlIIlIIll[302] = -(0xFFFF8ECB & 0x7F7F) & (0xFFFF9F7E & 0x6FDF);
        C.lIlIIlIIll[303] = -(0xFFFFFDBB & 0x726D) & (0xFFFFFFFE & 0x77FF);
        C.lIlIIlIIll[304] = -(0xFFFFDDDF & 0x7EB9) & (0xFFFFDDFF & 0x7FBF);
        C.lIlIIlIIll[305] = 0xFFFFDB77 & 0x259D;
        C.lIlIIlIIll[306] = 0xFFFF9FDF & 0x67FE;
        C.lIlIIlIIll[307] = -(0xFFFFBB82 & 0x4E7F) & (0xFFFFFFAD & 0xB7B);
        C.lIlIIlIIll[308] = -(0xFFFFB36E & 0x7CFB) & (0xFFFFFD7F & 0x33FF);
        C.lIlIIlIIll[309] = 0xFFFFC97F & 0x3797;
        C.lIlIIlIIll[310] = 0xFFFFE398 & 0x1D7F;
        C.lIlIIlIIll[311] = -(0xFFFFD9D9 & 0x36A7) & (0xFFFFD1D9 & 0x3FBF);
        C.lIlIIlIIll[312] = -(0xFFFFF46F & 0x7FF6) & (0xFFFFF77F & 0x7DFF);
        C.lIlIIlIIll[313] = 0xFFFFCF9F & 0x317B;
        C.lIlIIlIIll[314] = 0xFFFFFDFC & 0x31F;
        C.lIlIIlIIll[315] = 0xFFFF8FFD & 0x7BBA;
        C.lIlIIlIIll[316] = 0xFFFFFB51 & 0x35FF;
        C.lIlIIlIIll[317] = -(0xFFFFFCDF & 0x3F27) & (0xFFFFBFEE & Short.MAX_VALUE);
        C.lIlIIlIIll[318] = 0xFFFF9F9F & 0x6F6D;
        C.lIlIIlIIll[319] = 0xFFFFA7F9 & 0x5FD6;
        C.lIlIIlIIll[320] = 0xFFFFFE9D & 0x3BFA;
        C.lIlIIlIIll[321] = -(0xFFFFF6A7 & 0x597A) & (0xFFFFFFFF & 0x7EED);
        C.lIlIIlIIll[322] = -(0xFFFFEBDB & 0x35B7) & (0xFFFFE7FE & 0x7BFB);
        C.lIlIIlIIll[323] = -(0xFFFFEFD9 & 0x30BF) & (0xFFFFFFDF & 0x3FFF);
        C.lIlIIlIIll[324] = 0xFFFFCF5E & 0x35B5;
        C.lIlIIlIIll[325] = -(0xFFFFBF5B & 0x7CA7) & (0xFFFFFDFF & 0x3F1F);
        C.lIlIIlIIll[326] = -(0xFFFFD6F3 & 0x3D8D) & (0xFFFFDFDF & 0x35BE);
        C.lIlIIlIIll[327] = -(0xFFFF9E75 & 0x7DEB) & (0xFFFFFF7F & 0x1DFF);
        C.lIlIIlIIll[328] = -(0xFFFFF79F & 0xE73) & (0xFFFFAFF2 & 0x573F);
        C.lIlIIlIIll[329] = -(0xFFFFFB73 & 0x5E9D) & (0xFFFFFBF1 & 0x5F3F);
        C.lIlIIlIIll[330] = 0xFFFFC3B3 & 0x3D6E;
        C.lIlIIlIIll[331] = -(0xFFFFFFFD & 0x4ED3) & (0xFFFFCFFF & 0x7FF3);
        C.lIlIIlIIll[332] = 0xFFFFE3F6 & 0x1D2D;
        C.lIlIIlIIll[333] = 0xFFFFAFBF & 0x5F4F;
        C.lIlIIlIIll[334] = -(0xFFFFDEAB & 0x717D) & (0xFFFFDF7B & 0x7FBD);
        C.lIlIIlIIll[335] = -(0xFFFFE1ED & 0x7EF7) & (0xFFFFFFF7 & 0x6FFF);
        C.lIlIIlIIll[336] = 0xFFFF9F3D & 0x6FD7;
        C.lIlIIlIIll[337] = 0xFFFFCFFF & 0x3F17;
        C.lIlIIlIIll[338] = -(0xFFFFB897 & 0x57EF) & (0xFFFF9FFF & 0x7F9F);
        C.lIlIIlIIll[339] = 0xFFFFCF5B & 0x3FBF;
        C.lIlIIlIIll[340] = 0xFFFFBDFF & 0x7353;
        C.lIlIIlIIll[341] = -(0xFFFFCFFF & 0x382B) & (0xFFFFB97F & Short.MAX_VALUE);
        C.lIlIIlIIll[342] = 0xFFFFFB7F & 0x35D7;
        C.lIlIIlIIll[343] = 0xFFFFC9FA & 0x3FFF;
        C.lIlIIlIIll[344] = 0xFFFFDBFF & 0x2DFE;
        C.lIlIIlIIll[345] = -(0xFFFFF6F6 & 0x4DFD) & (0xFFFFFFF3 & 0x4EFF);
        C.lIlIIlIIll[346] = 0xFFFFEB52 & 0x1EAF;
        C.lIlIIlIIll[347] = 0xFFFF8B5C & 0x7EA7;
        C.lIlIIlIIll[348] = -(0xFFFFF4ED & 0x5F16) & (0xFFFFFFFF & 0x5DFF);
        C.lIlIIlIIll[349] = 0xFFFFFFDF & 0xA26;
        C.lIlIIlIIll[350] = -(0xFFFFD8BB & 0x7757) & (0xFFFFF7BF & 0x7EFF);
        C.lIlIIlIIll[351] = -(0xFFFFF797 & 0x39EF) & (0xFFFFBBBF & 0x7FCF);
        C.lIlIIlIIll[352] = -(0xFFFFF53F & 0x5AC9) & (0xFFFFF7BE & 0x7EFF);
        C.lIlIIlIIll[353] = -(0xFFFFD7CF & 0x7977) & (0xFFFFFFFF & 0x77FE);
        C.lIlIIlIIll[354] = 0xFFFFB6FF & 0x6FBA;
        C.lIlIIlIIll[355] = 0xFFFFCDEF & 0x3BD9;
        C.lIlIIlIIll[356] = -(0xFFFFE7FA & 0x3B0F) & (0xFFFFBF7F & 0x6FFF);
        C.lIlIIlIIll[357] = -(0xFFFFD10F & 0x7EF1) & (0xFFFFDDFE & 0x7BDB);
        C.lIlIIlIIll[358] = -(0xFFFFD9FF & 0x760F) & (0xFFFFDE7F & 0x7DFE);
        C.lIlIIlIIll[359] = 0xFFFFCFE9 & 0x39FF;
        C.lIlIIlIIll[360] = 0xFFFFDE7F & 0x2DE9;
        C.lIlIIlIIll[361] = 0xFFFF8FF7 & 0x79F9;
        C.lIlIIlIIll[362] = 0xFFFFCEF7 & 0x3D5F;
        C.lIlIIlIIll[363] = 0xFFFFADE6 & 0x5BFF;
        C.lIlIIlIIll[364] = -(0xFFFFBFDD & 0x4327) & (0xFFFFBFFF & 0x4F57);
        C.lIlIIlIIll[365] = 0xFFFFA9DB & 0x5FF7;
        C.lIlIIlIIll[366] = -(0xFFFFF6D9 & 0x3F27) & (0xFFFFBFDF & Short.MAX_VALUE);
        C.lIlIIlIIll[367] = -(0xFFFFFFFF & 0x2081) & (0xFFFFAFF7 & 0x7DDD);
        C.lIlIIlIIll[368] = -(0xFFFFE24B & 0x7DB6) & (0xFFFFE9FF & 0x7FCF);
        C.lIlIIlIIll[369] = -(0xFFFFB7F9 & 0x5A17) & (0xFFFFFFBE & 0x1FF7);
        C.lIlIIlIIll[370] = 0xFFFFAD5D & 0x5EFF;
        C.lIlIIlIIll[371] = 0xFFFFFFBF & 0xDDE;
        C.lIlIIlIIll[372] = 0xFFFFFBFB & 0xDDD;
        C.lIlIIlIIll[373] = 0xFFFF9FEC & 0x6DBB;
        C.lIlIIlIIll[374] = 0xFFFF8BF4 & 0x7DDB;
        C.lIlIIlIIll[375] = -(0xFFFFF2FB & 0x3F6F) & (0xFFFFFFFF & 0x3FFF);
        C.lIlIIlIIll[376] = -(0xFFFFF63D & 0x3FEB) & (0xFFFFFFFB & 0x3FFD);
        C.lIlIIlIIll[377] = -(0xFFFFC57F & 0x7A93) & (0xFFFFFD9F & 0x4FFE);
        C.lIlIIlIIll[378] = -(0xFFFFD20F & 0x6FF7) & (0xFFFFDF9F & 0x6FFF);
        C.lIlIIlIIll[379] = -(0xFFFFA66D & 0x7DBB) & (0xFFFFAFFF & 0x7DFF);
        C.lIlIIlIIll[380] = -(0xA9 ^ 0xB8) & (0xFFFFCDFF & 0x3F76);
        C.lIlIIlIIll[381] = 0xFFFFBFF3 & 0x4D6F;
        C.lIlIIlIIll[382] = 0xFFFFDFD5 & 0x2C7E;
        C.lIlIIlIIll[383] = 0xFFFF8DFC & 0x7BF7;
        C.lIlIIlIIll[384] = 0xFFFFB75F & 0x6DFE;
        C.lIlIIlIIll[385] = -(0xFFFFFAB5 & 0x1FDB) & (0xFFFFFFF7 & 0x3FFE);
        C.lIlIIlIIll[386] = -(0xFFFFBFFB & 0x7605) & (0xFFFFFFF7 & 0x3FEF);
        C.lIlIIlIIll[387] = 0xFFFFADFF & 0x5FF5;
        C.lIlIIlIIll[388] = -(0xFFFF9F6F & 0x6291) & (0xFFFFEBFD & 0x1FFF);
        C.lIlIIlIIll[389] = -(0x78 ^ 0x73) & (0xFFFFEDFF & 0x1F7F);
        C.lIlIIlIIll[390] = 0xFFFFBFEF & 0x49F5;
        C.lIlIIlIIll[391] = -(0xFFFFADD7 & 0x5B2B) & (0xFFFFEF7F & 0x3FF6);
        C.lIlIIlIIll[392] = 0xFFFFEFFF & 0x19EE;
        C.lIlIIlIIll[393] = -(0xFFFFADAD & 0x5BF3) & (0xFFFFBFF7 & 0x6FFA);
        C.lIlIIlIIll[394] = -(0xFFFFBF53 & 0x50AD) & (0xFFFFFDDF & 0x1BEF);
        C.lIlIIlIIll[395] = 0xFFFF8DF7 & 0x7F8F;
        C.lIlIIlIIll[396] = -(0xFFFFE5FD & 0x7EE6) & (0xFFFFEEFF & Short.MAX_VALUE);
        C.lIlIIlIIll[397] = -(0xFFFF9FAB & 0x7974) & (0xFFFFBFFF & 0x7FBF);
        C.lIlIIlIIll[398] = -(0xFFFFB7F3 & 0x7DBF) & (0xFFFFBFBF & 0x7FFA);
        C.lIlIIlIIll[399] = 0xFFFFAEB5 & 0x77EF;
        C.lIlIIlIIll[400] = 0xFFFF8BAB & 0x7E57;
        C.lIlIIlIIll[401] = 0xFFFFE5F6 & 0x3F7F;
        C.lIlIIlIIll[402] = -(0xFFFFFFFB & 0x3C57) & (0xFFFFFD7F & 0x3FFB);
        C.lIlIIlIIll[403] = 0xFFFFDD2B & 0x23FF;
        C.lIlIIlIIll[404] = -(0xFFFFFDF3 & 0x768F) & (0xFFFFFDFE & 0x77AF);
        C.lIlIIlIIll[405] = 0xFFFF83EF & 0x7D3D;
        C.lIlIIlIIll[406] = 0xFFFFB6AF & 0x6FFE;
        C.lIlIIlIIll[407] = -(0xFFFFDA1D & 0x67E3) & (0xFFFFFBBF & 0x4FFF);
        C.lIlIIlIIll[408] = -(0xFFFFFB6F & 0x14D3) & (0xFFFF9FFF & 0x7C7F);
        C.lIlIIlIIll[409] = 0xFFFFCFDE & 0x39E7;
        C.lIlIIlIIll[410] = 0xFFFFAC7D & 0x5FFA;
        C.lIlIIlIIll[411] = -(0xFFFFD347 & 0x7EBB) & (0xFFFFDBEF & 0x7FDF);
        C.lIlIIlIIll[412] = -(0xFFFFE38F & 0x3CF1) & (0xFFFFBFFE & 0x6DEF);
        C.lIlIIlIIll[413] = 0xFFFFE16F & 0x1FBE;
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
            0;
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

